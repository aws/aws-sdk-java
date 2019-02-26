/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import static com.amazonaws.util.StringUtils.UTF8;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ReadLimitInfo;
import com.amazonaws.SDKGlobalTime;
import com.amazonaws.SdkClientException;
import com.amazonaws.SignableRequest;
import com.amazonaws.internal.SdkDigestInputStream;
import com.amazonaws.internal.SdkThreadLocalsRegistry;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Abstract base class for AWS signing protocol implementations. Provides
 * utilities commonly needed by signing protocols such as computing
 * canonicalized host names, query string parameters, etc.
 * <p>
 * Not intended to be sub-classed by developers.
 */
public abstract class AbstractAWSSigner implements Signer {

    public static final String EMPTY_STRING_SHA256_HEX;
    private static final ThreadLocal<MessageDigest> SHA256_MESSAGE_DIGEST;

    static {
        SHA256_MESSAGE_DIGEST = SdkThreadLocalsRegistry.register(
                new ThreadLocal<MessageDigest>() {
                    @Override
                    protected MessageDigest initialValue() {
                        try {
                            return MessageDigest.getInstance("SHA-256");
                        } catch (NoSuchAlgorithmException e) {
                            throw new SdkClientException(
                                    "Unable to get SHA256 Function"
                                            + e.getMessage(), e);
                        }
                    }
                });
        EMPTY_STRING_SHA256_HEX = BinaryUtils.toHex(doHash(""));
    }

    /**
     * Computes an RFC 2104-compliant HMAC signature and returns the result as a
     * Base64 encoded string.
     */
    protected String signAndBase64Encode(String data, String key,
            SigningAlgorithm algorithm) throws SdkClientException {
        return signAndBase64Encode(data.getBytes(UTF8), key, algorithm);
    }

    /**
     * Computes an RFC 2104-compliant HMAC signature for an array of bytes and
     * returns the result as a Base64 encoded string.
     */
    protected String signAndBase64Encode(byte[] data, String key,
            SigningAlgorithm algorithm) throws SdkClientException {
        try {
            byte[] signature = sign(data, key.getBytes(UTF8), algorithm);
            return Base64.encodeAsString(signature);
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    public byte[] sign(String stringData, byte[] key,
            SigningAlgorithm algorithm) throws SdkClientException {
        try {
            byte[] data = stringData.getBytes(UTF8);
            return sign(data, key, algorithm);
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    public byte[] signWithMac(String stringData, Mac mac) {
        try {
            return mac.doFinal(stringData.getBytes(UTF8));
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    protected byte[] sign(byte[] data, byte[] key,
            SigningAlgorithm algorithm) throws SdkClientException {
        try {
            Mac mac = algorithm.getMac();
            mac.init(new SecretKeySpec(key, algorithm.toString()));
            return mac.doFinal(data);
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    /**
     * Hashes the string contents (assumed to be UTF-8) using the SHA-256
     * algorithm.
     *
     * @param text
     *            The string to hash.
     *
     * @return The hashed bytes from the specified string.
     *
     * @throws SdkClientException
     *             If the hash cannot be computed.
     */
    public byte[] hash(String text) throws SdkClientException {
        return AbstractAWSSigner.doHash(text);
    }

    private static byte[] doHash(String text) throws SdkClientException {
        try {
            MessageDigest md = getMessageDigestInstance();
            md.update(text.getBytes(UTF8));
            return md.digest();
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to compute hash while signing request: "
                            + e.getMessage(), e);
        }
    }

    protected byte[] hash(InputStream input) throws SdkClientException {
        try {
            MessageDigest md = getMessageDigestInstance();
            @SuppressWarnings("resource")
            DigestInputStream digestInputStream = new SdkDigestInputStream(
                    input, md);
            byte[] buffer = new byte[1024];
            while (digestInputStream.read(buffer) > -1)
                ;
            return digestInputStream.getMessageDigest().digest();
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to compute hash while signing request: "
                            + e.getMessage(), e);
        }
    }

    /**
     * Hashes the binary data using the SHA-256 algorithm.
     *
     * @param data
     *            The binary data to hash.
     *
     * @return The hashed bytes from the specified data.
     *
     * @throws SdkClientException
     *             If the hash cannot be computed.
     */
    public byte[] hash(byte[] data) throws SdkClientException {
        try {
            MessageDigest md =  getMessageDigestInstance();
            md.update(data);
            return md.digest();
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to compute hash while signing request: "
                            + e.getMessage(), e);
        }
    }
    /**
     * Examines the specified query string parameters and returns a
     * canonicalized form.
     * <p>
     * The canonicalized query string is formed by first sorting all the query
     * string parameters, then URI encoding both the key and value and then
     * joining them, in order, separating key value pairs with an '&'.
     *
     * @param parameters
     *            The query string parameters to be canonicalized.
     *
     * @return A canonicalized form for the specified query string parameters.
     */
    protected String getCanonicalizedQueryString(Map<String, List<String>> parameters) {

        final SortedMap<String, List<String>> sorted = new TreeMap<String, List<String>>();

        /**
         * Signing protocol expects the param values also to be sorted after url
         * encoding in addition to sorted parameter names.
         */
        for (Map.Entry<String, List<String>> entry : parameters.entrySet()) {
            final String encodedParamName = SdkHttpUtils.urlEncode(
                    entry.getKey(), false);
            final List<String> paramValues = entry.getValue();
            final List<String> encodedValues = new ArrayList<String>(
                    paramValues.size());
            for (String value : paramValues) {
                encodedValues.add(SdkHttpUtils.urlEncode(value, false));
            }
            Collections.sort(encodedValues);
            sorted.put(encodedParamName, encodedValues);

        }

        final StringBuilder result = new StringBuilder();
        for(Map.Entry<String, List<String>> entry : sorted.entrySet()) {
            for(String value : entry.getValue()) {
                if (result.length() > 0) {
                    result.append("&");
                }
                result.append(entry.getKey())
                      .append("=")
                      .append(value);
            }
        }

        return result.toString();
    }

    protected String getCanonicalizedQueryString(SignableRequest<?> request) {
        /*
         * If we're using POST and we don't have any request payload content,
         * then any request query parameters will be sent as the payload, and
         * not in the actual query string.
         */
        if (SdkHttpUtils.usePayloadForQueryParameters(request))
            return "";
        return this.getCanonicalizedQueryString(request.getParameters());
    }

    /**
     * Returns the request's payload as binary data.
     *
     * @param request
     *            The request
     * @return The data from the request's payload, as binary data.
     */
    protected byte[] getBinaryRequestPayload(SignableRequest<?> request) {
        if (SdkHttpUtils.usePayloadForQueryParameters(request)) {
            String encodedParameters = SdkHttpUtils.encodeParameters(request);
            if (encodedParameters == null)
                return new byte[0];

            return encodedParameters.getBytes(UTF8);
        }

        return getBinaryRequestPayloadWithoutQueryParams(request);
    }

    /**
     * Returns the request's payload as a String.
     *
     * @param request
     *            The request
     * @return The data from the request's payload, as a string.
     */
    protected String getRequestPayload(SignableRequest<?> request) {
        return newString(getBinaryRequestPayload(request));
    }

    /**
     * Returns the request's payload contents as a String, without processing
     * any query string params (i.e. no form encoding for query params).
     *
     * @param request
     *            The request
     * @return the request's payload contents as a String, not including any
     *         form encoding of query string params.
     */
    protected String getRequestPayloadWithoutQueryParams(SignableRequest<?> request) {
        return newString(getBinaryRequestPayloadWithoutQueryParams(request));
    }

    /**
     * Returns the request's payload contents as binary data, without processing
     * any query string params (i.e. no form encoding for query params).
     *
     * @param request
     *            The request
     * @return The request's payload contents as binary data, not including any
     *         form encoding of query string params.
     */
    protected byte[] getBinaryRequestPayloadWithoutQueryParams(SignableRequest<?> request) {
        InputStream content = getBinaryRequestPayloadStreamWithoutQueryParams(request);

        try {
            ReadLimitInfo info = request.getReadLimitInfo();
            content.mark(info == null ? -1 : info.getReadLimit());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024 * 5];
            while (true) {
                int bytesRead = content.read(buffer);
                if (bytesRead == -1) break;

                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }

            byteArrayOutputStream.close();
            content.reset();

            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new SdkClientException("Unable to read request payload to sign request: " + e.getMessage(), e);
        }
    }

    protected InputStream getBinaryRequestPayloadStream(SignableRequest<?> request) {
        if (SdkHttpUtils.usePayloadForQueryParameters(request)) {
            String encodedParameters = SdkHttpUtils.encodeParameters(request);
            if (encodedParameters == null)
                return new ByteArrayInputStream(new byte[0]);

            return new ByteArrayInputStream(
                    encodedParameters.getBytes(UTF8));
        }

        return getBinaryRequestPayloadStreamWithoutQueryParams(request);
    }

    protected InputStream getBinaryRequestPayloadStreamWithoutQueryParams(SignableRequest<?> request) {
        try {
            InputStream is = request.getContentUnwrapped();
            if (is == null)
                return new ByteArrayInputStream(new byte[0]);
            if (!is.markSupported())
                throw new SdkClientException("Unable to read request payload to sign request.");
            return is;
        } catch (AmazonClientException e) {
            throw e;
        } catch (Exception e) {
            throw new SdkClientException("Unable to read request payload to sign request: " + e.getMessage(), e);
        }
    }

    protected String getCanonicalizedResourcePath(String resourcePath) {
        return getCanonicalizedResourcePath(resourcePath, true);
    }

    protected String getCanonicalizedResourcePath(String resourcePath, boolean urlEncode) {
        if (resourcePath == null || resourcePath.isEmpty()) {
            return "/";
        } else {
            String value = urlEncode ? SdkHttpUtils.urlEncode(resourcePath, true) : resourcePath;
            if (value.startsWith("/")) {
                return value;
            } else {
                return "/".concat(value);
            }
        }
    }

    protected String getCanonicalizedEndpoint(URI endpoint) {
        String endpointForStringToSign = StringUtils.lowerCase(endpoint.getHost());
        /*
         * Apache HttpClient will omit the port in the Host header for default
         * port values (i.e. 80 for HTTP and 443 for HTTPS) even if we
         * explicitly specify it, so we need to be careful that we use the same
         * value here when we calculate the string to sign and in the Host
         * header we send in the HTTP request.
         */
        if (SdkHttpUtils.isUsingNonDefaultPort(endpoint)) {
            endpointForStringToSign += ":" + endpoint.getPort();
        }

        return endpointForStringToSign;
    }

    /**
     * Loads the individual access key ID and secret key from the specified
     * credentials, ensuring that access to the credentials is synchronized on
     * the credentials object itself, and trimming any extra whitespace from the
     * credentials.
     * <p>
     * Returns either a {@link BasicSessionCredentials} or a
     * {@link BasicAWSCredentials} object, depending on the input type.
     *
     * @param credentials
     * @return A new credentials object with the sanitized credentials.
     */
    protected AWSCredentials sanitizeCredentials(AWSCredentials credentials) {
        String accessKeyId = null;
        String secretKey   = null;
        String token = null;
        synchronized (credentials) {
            accessKeyId = credentials.getAWSAccessKeyId();
            secretKey   = credentials.getAWSSecretKey();
            if ( credentials instanceof AWSSessionCredentials ) {
                token = ((AWSSessionCredentials) credentials).getSessionToken();
            }
        }
        if (secretKey != null) secretKey = secretKey.trim();
        if (accessKeyId != null) accessKeyId = accessKeyId.trim();
        if (token != null) token = token.trim();

        if (credentials instanceof AWSSessionCredentials) {
            return new BasicSessionCredentials(accessKeyId, secretKey, token);
        }

        return new BasicAWSCredentials(accessKeyId, secretKey);
    }

    /**
     * Safely converts a UTF-8 encoded byte array into a String.
     *
     * @param bytes UTF-8 encoded binary character data.
     *
     * @return The converted String object.
     */
    protected String newString(byte[] bytes) {
        return new String(bytes, UTF8);
    }

    /**
     * Returns the current time minus the given offset in seconds.
     * The intent is to adjust the current time in the running JVM to the
     * corresponding wall clock time at AWS for request signing purposes.
     *
     * @param offsetInSeconds
     *            offset in seconds
     */
    protected Date getSignatureDate(int offsetInSeconds) {
        return new Date(System.currentTimeMillis() - offsetInSeconds*1000);
    }

    /**
     * Returns the time offset in seconds.
     */
    @Deprecated
    protected int getTimeOffset(SignableRequest<?> request) {
        final int globleOffset = SDKGlobalTime.getGlobalTimeOffset();
        return globleOffset == 0 ? request.getTimeOffset() : globleOffset;
    }

    /**
     * Adds session credentials to the request given.
     *
     * @param request
     *            The request to add session credentials information to
     * @param credentials
     *            The session credentials to add to the request
     */
    protected abstract void addSessionCredentials(SignableRequest<?> request,
            AWSSessionCredentials credentials);


    /**
     * Returns the re-usable thread local version of MessageDigest.
     * @return
     */
    private static MessageDigest getMessageDigestInstance() {
        MessageDigest messageDigest = SHA256_MESSAGE_DIGEST.get();
        messageDigest.reset();
        return messageDigest;
    }

}
