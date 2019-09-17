/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.cloudfront.util;

import static com.amazonaws.services.cloudfront.util.SignerUtils.makeBytesUrlSafe;
import static com.amazonaws.util.StringUtils.UTF8;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.PEM;
import com.amazonaws.auth.RSA;
import com.amazonaws.util.Base64;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;

public class SignerUtils {

    private static final SecureRandom srand = new SecureRandom();

    /**
     * Enumeration of protocols for presigned URLs
     */
    public static enum Protocol {
        http, https, rtmp
    }

    /**
     * Returns a "canned" policy for the given parameters.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-signed-urls-overview.html"
     * >Overview of Signed URLs</a>.
     */
    public static String buildCannedPolicy(String resourceUrlOrPath,
            Date dateLessThan) {
        return "{\"Statement\":[{\"Resource\":\""
                + resourceUrlOrPath
                + "\",\"Condition\":{\"DateLessThan\":{\"AWS:EpochTime\":"
                + MILLISECONDS.toSeconds(dateLessThan.getTime())
                + "}}}]}";
    }

    /**
     * Returns a custom policy for the given parameters.
     */
    public static String buildCustomPolicy(String resourcePath,
            Date expiresOn, Date activeFrom, String ipAddress) {
        return "{\"Statement\": [{"
                + "\"Resource\":\""
                + resourcePath
                + "\""
                + ",\"Condition\":{"
                + "\"DateLessThan\":{\"AWS:EpochTime\":"
                + MILLISECONDS.toSeconds(expiresOn.getTime())
                + "}"
                + (ipAddress == null
                  ? ""
                  : ",\"IpAddress\":{\"AWS:SourceIp\":\""
                    + ipAddress + "\"}"
                  )
                + (activeFrom == null
                   ? ""
                   : ",\"DateGreaterThan\":{\"AWS:EpochTime\":"
                     + MILLISECONDS.toSeconds(activeFrom.getTime()) + "}"
                  )
                + "}}]}";
    }
    /**
     * Converts the given data to be safe for use in signed URLs for a private
     * distribution by using specialized Base64 encoding.
     */
    public static String makeBytesUrlSafe(byte[] bytes) {
        byte[] encoded = Base64.encode(bytes);

        for (int i=0; i < encoded.length; i++) {
            switch(encoded[i]) {
                case '+':
                    encoded[i] = '-'; continue;
                case '=':
                    encoded[i] = '_'; continue;
                case '/':
                    encoded[i] = '~'; continue;
                default:
                    continue;
            }
        }
        return new String(encoded, UTF8);
    }

    /**
     * Converts the given string to be safe for use in signed URLs for a private
     * distribution.
     */
    public static String makeStringUrlSafe(String str) {
        return makeBytesUrlSafe(str.getBytes(StringUtils.UTF8));
    }

    /**
     * Returns the resource path for the given distribution, object, and
     * protocol.
     */
    public static String generateResourcePath(final Protocol protocol,
            final String distributionDomain, final String resourcePath) {
        return protocol == Protocol.http || protocol == Protocol.https
             ? protocol + "://" + distributionDomain + "/" + resourcePath
             : resourcePath
             ;
    }

    /**
     * Signs the data given with the private key given, using the SHA1withRSA
     * algorithm provided by bouncy castle.
     */
    public static byte[] signWithSha1RSA(byte[] dataToSign,
            PrivateKey privateKey) throws InvalidKeyException {
        Signature signature;
        try {
            signature = Signature.getInstance("SHA1withRSA");
            signature.initSign(privateKey, srand);
            signature.update(dataToSign);
            return signature.sign();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        } catch (SignatureException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Creates a private key from the file given, either in RSA private key
     * (.pem) or pkcs8 (.der) format. Other formats will cause an exception to
     * be thrown.
     */
    public static PrivateKey loadPrivateKey(File privateKeyFile) throws InvalidKeySpecException, IOException {
        if ( StringUtils.lowerCase(privateKeyFile.getAbsolutePath()).endsWith(".pem") ) {
            InputStream is = new FileInputStream(privateKeyFile);
            try {
                return PEM.readPrivateKey(is);
            } finally {
                try {is.close();} catch(IOException ignore) {}
            }
        } else if ( StringUtils.lowerCase(privateKeyFile.getAbsolutePath()).endsWith(".der") ) {
            InputStream is = new FileInputStream(privateKeyFile);
            try {
                return RSA.privateKeyFromPKCS8(IOUtils.toByteArray(is));
            } finally {
                try {is.close();} catch(IOException ignore) {}
            }
        } else {
            throw new AmazonClientException("Unsupported file type for private key");
        }
    }

    public static PrivateKey loadPrivateKey(String privateKeyFilePath) throws InvalidKeySpecException, IOException {
        File privateKeyFile = new File(privateKeyFilePath);
        return loadPrivateKey(privateKeyFile);
    }
}
