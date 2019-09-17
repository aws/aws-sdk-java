/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sns.message;

import com.amazonaws.SdkBaseException;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.GuardedBy;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.http.apache.utils.ApacheUtils;
import com.amazonaws.internal.FIFOCache;
import com.amazonaws.services.sns.util.SignatureChecker;
import com.amazonaws.util.IOUtils;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;

/**
 * Verifies the signature of an SNS message.
 */
@ThreadSafe
@SdkInternalApi
class SignatureVerifier {

    /**
     * Field name of the SigningCertUrl.
     */
    private static final String SIGNING_CERT_URL = "SigningCertURL";

    private final HttpClient client;
    private final DefaultHostnameVerifier hostnameVerifier = new DefaultHostnameVerifier();
    private final SignatureChecker signatureChecker = new SignatureChecker();
    private final SigningCertUrlVerifier signingCertUrlVerifier;

    /**
     * Expected common name in the certificate used to validate the message signature.
     */
    private final String expectedCertCommonName;

    /**
     * Cache the last two certificates so we don't have to download every time.
     */
    @GuardedBy("this")
    private final FIFOCache<PublicKey> certificateCache = new FIFOCache<PublicKey>(2);

    /**
     * @param client {@link HttpClient} instance to fetch certificate from.
     * @param expectedSnsEndpoint Expected endpoint for the signing cert URL.
     * @param expectedCertCommonName Expected common name for the certificate downloaded.
     */
    SignatureVerifier(HttpClient client, String expectedSnsEndpoint, String expectedCertCommonName) {
        this.client = client;
        this.signingCertUrlVerifier = new SigningCertUrlVerifier(expectedSnsEndpoint);
        this.expectedCertCommonName = expectedCertCommonName;
    }

    /**
     * Verifies the signature of the SNS message by downloading the public certificate from SNS and computing
     * the signature from the request properties. If the signature does not match, or if the cert is inaccessible or invalid
     * and exception will be thrown.
     *
     * @param messageJson JSON message object.
     */
    void verifySignature(JsonNode messageJson) {
        if (!signatureChecker.verifySignature(toMap(messageJson), fetchPublicKey(messageJson))) {
            throw new SdkClientException("Signature in SNS message was invalid");
        }
    }

    /**
     * Retrieve the certificate public key from the cache if available, otherwise download it from the URL
     * in the message JSON.
     *
     * @param messageJson Message JSON.
     * @return Public key of SNS certificate.
     */
    private synchronized PublicKey fetchPublicKey(JsonNode messageJson) {
        URI certUrl = URI.create(messageJson.get(SIGNING_CERT_URL).asText());
        PublicKey publicKey = certificateCache.get(certUrl.toString());
        if (publicKey == null) {
            publicKey = createPublicKey(downloadCertWithRetries(certUrl));
            certificateCache.add(certUrl.toString(), publicKey);
        }
        return publicKey;
    }

    /**
     * Downloads the certificate from the provided URL, retrying once if applicable.
     *
     * @param certUrl URL to download certificate from.
     * @return String contents of certificate.
     */
    private String downloadCertWithRetries(URI certUrl) {
        try {
            return downloadCert(certUrl);
        } catch (SdkBaseException e) {
            if (isRetryable(e)) {
                return downloadCert(certUrl);
            } else {
                throw e;
            }
        }
    }

    /**
     * Determines if the exception received when downloading the certificate is retryable or not.
     *
     * @param e Exception when downloading certificate from provided URL.
     * @return True if it is retryable, false otherwise.
     */
    private boolean isRetryable(SdkBaseException e) {
        if (e.getCause() instanceof IOException) {
            return true;
        } else if (e instanceof HttpException) {
            // Only retry on 500s.
            return ((HttpException) e).getStatusCode() / 100 == 5;
        } else {
            return false;
        }
    }

    /**
     * Downloads the certificate from the provided URL. Asserts that the endpoint is an SNS endpoint and that
     * the certificate is vended over HTTPs.
     *
     * @param certUrl URL to download certificate from.
     * @return String contents of certificate.
     * @throws SdkClientException If certificate cannot be downloaded or URL is invalid.
     */
    private String downloadCert(URI certUrl) {
        try {
            signingCertUrlVerifier.verifyCertUrl(certUrl);
            HttpResponse response = client.execute(new HttpGet(certUrl));
            if (ApacheUtils.isRequestSuccessful(response)) {
                try {
                    return IOUtils.toString(response.getEntity().getContent());
                } finally {
                    response.getEntity().getContent().close();
                }
            } else {
                throw new HttpException("Could not download the certificate from SNS", response);
            }
        } catch (IOException e) {
            throw new SdkClientException("Unable to download SNS certificate from " + certUrl.toString(), e);
        }
    }

    /**
     * Transforms the {@link JsonNode} into a map to integrate with the {@link SignatureChecker} utility.
     *
     * @param messageJson JSON of message.
     * @return Transformed map.
     */
    private Map<String, String> toMap(JsonNode messageJson) {
        Map<String, String> fields = new HashMap<String, String>(messageJson.size());
        Iterator<Map.Entry<String, JsonNode>> jsonFields = messageJson.fields();
        while (jsonFields.hasNext()) {
            Map.Entry<String, JsonNode> next = jsonFields.next();
            fields.put(next.getKey(), next.getValue().asText());
        }
        return fields;
    }

    /**
     * Build a PublicKey object from a cert
     *
     * @param cert The cert body
     * @return A public key
     */
    private PublicKey createPublicKey(String cert) {
        try {
            CertificateFactory fact = CertificateFactory.getInstance("X.509");
            InputStream stream = new ByteArrayInputStream(cert.getBytes(Charset.forName("UTF-8")));
            X509Certificate cer = (X509Certificate) fact.generateCertificate(stream);
            validateCertificate(cer);
            return cer.getPublicKey();
        } catch (SdkBaseException e) {
            throw e;
        } catch (Exception e) {
            throw new SdkClientException("Could not create public key from certificate", e);
        }
    }

    /**
     * Check that the certificate is valid and that the principal is actually SNS.
     *
     * @param cer Certificate to validate.
     * @throws CertificateExpiredException
     * @throws CertificateNotYetValidException
     */
    private void validateCertificate(X509Certificate cer) throws CertificateExpiredException, CertificateNotYetValidException {
        verifyHostname(cer);
        cer.checkValidity();
    }

    /**
     * Verifies the hostname in the certificate matches {@link #expectedCertCommonName}.
     *
     * @param cer Certificate to validate.
     */
    private void verifyHostname(X509Certificate cer) {
        try {
            hostnameVerifier.verify(expectedCertCommonName, cer);
        } catch (SSLException e) {
            throw new SdkClientException("Certificate does not match expected common name: " + expectedCertCommonName, e);
        }
    }

}
