/*
 * Copyright 2013-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.RSA;
import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.util.*;

import static com.amazonaws.util.StringUtils.UTF8;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

// The source code originated from the .NET implementation at
// https://github.com/aws/aws-sdk-net/blob/master/sdk/src/Services/CloudFront/Custom/_bcl/AmazonCloudFrontCookieSigner.cs

/**
 * Utility class for generating pre-signed Set-Cookie headers for serving private CloudFront
 * content. All dates must be in UTC. Use {@link Calendar} to set the timezone
 * specifically before converting to a {@link Date} object, or else use
 * {@link DateUtils} to turn a UTC date String into a Date object.
 *
 * <pre>
 * Protocols protocol = Protocols.http;
 * String distributionDomain = "d1b2c3a4g5h6.cloudfront.net";
 * File privateKeyFile = new File("/path/to/cfcurlCloud/rsa-private-key.der");
 * String resourcePath = "a/b/images.jpeg";
 * String keyPairId = "APKAJCEOKRHC3XIVU5NA";
 * Date activeFrom = DateUtils.parseISO8601Date("2012-11-14T22:20:00.000Z");
 * Date expiresOn = DateUtils.parseISO8601Date("2011-11-14T22:20:00.000Z");
 * String ipRange = "192.168.0.1/24";
 *
 * CookiesForCannedPolicy cookies = CloudFrontCookieSigner.getCookiesForCannedPolicy(
 *              protocol, distributionDomain, privateKeyFile,
 *              s3ObjectKey, keyPairId, activeFrom);
 *
 * CookiesForCustomPolicy url2 = CloudFrontCookieSigner.getCookiesForCannedPolicy(
 *              protocol, distributionDomain, privateKeyFile,
 *              s3ObjectKey, keyPairId, activeFrom,
 *              expiresOn, ipRange);
 * </pre>
 *
 * @see DateUtils
 */
public enum CloudFrontCookieSigner {
    ;
    private static final String expiresKey = "CloudFront-Expires";
    private static final String signatureKey = "CloudFront-Signature";
    private static final String policyKey = "CloudFront-Policy";
    private static final String keyPairIdKey = "CloudFront-Key-Pair-Id";

    private static final SecureRandom srand = new SecureRandom();

    /**
     * Enumeration of protocols for presigned Cookies
     */
    public static enum Protocols {
        http, https
    }


    /**
     * Returns signed cookies that grants universal access to private content until a given date.
     *
     * @param protocol           The protocol used to access content using signed cookies.
     * @param distributionDomain The domain name of the distribution.
     * @param resourcePath       The path for the resource.
     * @param privateKeyFile     The private key file in DER format
     * @param keyPairId          The key pair id corresponding to the private key file given.
     * @param expiresOn          The expiration date till which content can be accessed using the generated cookies.
     * @return The signed cookies.
     */
    public static CookiesForCannedPolicy getCookiesForCannedPolicy(Protocols protocol,
                                                                   String distributionDomain,
                                                                   File privateKeyFile,
                                                                   String resourcePath,
                                                                   String keyPairId,
                                                                   Date expiresOn) throws InvalidKeySpecException, IOException {
        PrivateKey privateKey = loadPrivateKey(privateKeyFile);
        return getCookiesForCannedPolicy(protocol, distributionDomain, privateKey, resourcePath, keyPairId, expiresOn);
    }

    /**
     * Returns signed cookies that grants universal access to private content until a given date.
     *
     * @param protocol           The protocol used to access content using signed cookies.
     * @param distributionDomain The domain name of the distribution.
     * @param resourcePath       The path for the resource.
     * @param privateKey         The private key file. RSA private key (.der) are supported.
     * @param keyPairId          The key pair id corresponding to the private key file given.
     * @param expiresOn          The expiration date till which content can be accessed using the generated cookies.
     * @return The signed cookies.
     */
    public static CookiesForCannedPolicy getCookiesForCannedPolicy(Protocols protocol,
                                                         String distributionDomain,
                                                         PrivateKey privateKey,
                                                         String resourcePath,
                                                         String keyPairId,
                                                         Date expiresOn) {
        String url = generateResourcePath(protocol, distributionDomain, resourcePath);
        return getCookiesForCannedPolicy(url, keyPairId, privateKey, expiresOn);
    }

    /**
     * Generate signed cookies that allows access to a specific distribution and
     * resource path by applying a access restrictions from a "canned" (simplified)
     * policy document.
     *
     * @param resourceUrlOrPath The URL or path that uniquely identifies a resource within a
     *                          distribution. For standard distributions the resource URL will
     *                          be <tt>"http://" + distributionName + "/" + path</tt>
     *                          (may also include URL parameters. For distributions with the
     *                          HTTPS required protocol, the resource URL must start with
     *                          <tt>"https://"</tt>. RTMP resources do not take the form of a
     *                          URL, and instead the resource path is nothing but the stream's
     *                          name.
     * @param keyPairId         Identifier of a public/private certificate keypair already configured in your Amazon Web Services account.
     * @param privateKeyFile    The RSA private key data that corresponding to the certificate keypair identified by keyPairId.
     * @param expiresOn         The expiration date till which content can be accessed using the generated cookies.
     * @return The signed cookies.
     */
    public static CookiesForCannedPolicy getCookiesForCannedPolicy(String resourceUrlOrPath,
                                                                   String keyPairId,
                                                                   File privateKeyFile,
                                                                   Date expiresOn) throws InvalidKeySpecException, IOException {
        PrivateKey privateKey = loadPrivateKey(privateKeyFile);
        {
            return getCookiesForCannedPolicy(resourceUrlOrPath, keyPairId, privateKey, expiresOn);
        }
    }

    /**
     * Generate signed cookies that allows access to a specific distribution and
     * resource path by applying a access restrictions from a "canned" (simplified)
     * policy document.
     *
     * @param resourceUrlOrPath The URL or path that uniquely identifies a resource within a
     *                          distribution. For standard distributions the resource URL will
     *                          be <tt>"http://" + distributionName + "/" + path</tt>
     *                          (may also include URL parameters. For distributions with the
     *                          HTTPS required protocol, the resource URL must start with
     *                          <tt>"https://"</tt>.
     * @param keyPairId         Identifier of a public/private certificate keypair already configured in your Amazon Web Services account.
     * @param privateKey        The RSA private key data that corresponding to the certificate keypair identified by keyPairId.
     * @param expiresOn         The expiration date till which content can be accessed using the generated cookies.
     * @return The signed cookies.
     */
    public static CookiesForCannedPolicy getCookiesForCannedPolicy(String resourceUrlOrPath,
                                                         String keyPairId,
                                                         PrivateKey privateKey,
                                                         Date expiresOn) {
        try {
            final String cannedPolicy = CloudFrontCookieSigner.buildCannedPolicy(resourceUrlOrPath, expiresOn);
            byte[] signatureBytes = signWithSha1RSA(cannedPolicy.getBytes(UTF8), privateKey);
            String urlSafeSignature = makeBytesUrlSafe(signatureBytes);
            // Create the cookies
            final CookiesForCannedPolicy cookies = new CookiesForCannedPolicy();
            cookies.putExpires(String.valueOf(MILLISECONDS.toSeconds(expiresOn.getTime())));
            cookies.putSignature(urlSafeSignature);
            cookies.putKeyPairId(keyPairId);
            return cookies;
        } catch (InvalidKeyException e) {
            throw new AmazonClientException("Couldn't sign canned policy cookie", e);
        }
    }

    /**
     * Returns signed cookies that provides tailored access to private content based on an access time window and an ip range.
     *
     * @param protocol           The protocol used to access content using signed cookies.
     * @param distributionDomain The domain name of the distribution.
     * @param privateKeyFile     Your private key file. RSA private key (.der) are supported.
     * @param resourcePath       The path for the resource.
     * @param keyPairId          The key pair id corresponding to the private key file given.
     * @param expiresOn          The expiration date till which content can be accessed using the generated cookies.
     * @param activeFrom         The date from which content can be accessed using the generated cookies.
     * @param ipRange            The allowed IP address range of the client making the GET request, in CIDR form (e.g. 192.168.0.1/24).
     * @return The signed cookies.
     */
    public static CookiesForCustomPolicy getCookiesForCustomPolicy(Protocols protocol,
                                                                   String distributionDomain,
                                                                   File privateKeyFile,
                                                                   String resourcePath,
                                                                   String keyPairId,
                                                                   Date expiresOn,
                                                                   Date activeFrom,
                                                                   String ipRange) throws InvalidKeySpecException, IOException {
        PrivateKey privateKey = loadPrivateKey(privateKeyFile);
        return getCookiesForCustomPolicy(protocol, distributionDomain, privateKey, resourcePath, keyPairId, expiresOn, activeFrom, ipRange);
    }

    /**
     * Returns signed cookies that provides tailored access to private content based on an access time window and an ip range.
     *
     * @param protocol           The protocol used to access content using signed cookies.
     * @param distributionDomain The domain name of the distribution.
     * @param privateKey         Your private key file. RSA private key (.der) are supported.
     * @param resourcePath       The path for the resource.
     * @param keyPairId          The key pair id corresponding to the private key file given.
     * @param expiresOn          The expiration date till which content can be accessed using the generated cookies.
     * @param activeFrom         The date from which content can be accessed using the generated cookies.
     * @param ipRange            The allowed IP address range of the client making the GET request, in CIDR form (e.g. 192.168.0.1/24).
     * @return The signed cookies.
     */
    public static CookiesForCustomPolicy getCookiesForCustomPolicy(Protocols protocol,
                                                                   String distributionDomain,
                                                                   PrivateKey privateKey,
                                                                   String resourcePath,
                                                                   String keyPairId,
                                                                   Date expiresOn,
                                                                   Date activeFrom,
                                                                   String ipRange) {
        final String url = generateResourcePath(protocol, distributionDomain, resourcePath);
        return getCookiesForCustomPolicy(url, privateKey, keyPairId, expiresOn,
                activeFrom, ipRange);
    }

    /**
     * Returns signed cookies that provides tailored access to private content based on an access time window and an ip range.
     *
     * @param resourceUrlOrPath The URL or path for resource within a distribution.
     * @param privateKey        Your private key file. RSA private key (.der) are supported.
     * @param keyPairId         The key pair id corresponding to the private key file given.
     * @param expiresOn         The expiration date till which content can be accessed using the generated cookies.
     * @param activeFrom        The date from which content can be accessed using the generated cookies.
     * @param ipRange           The allowed IP address range of the client making the GET request, in CIDR form (e.g. 192.168.0.1/24).
     * @return The signed cookies.
     */
    public static CookiesForCustomPolicy getCookiesForCustomPolicy(String resourceUrlOrPath,
                                                                   PrivateKey privateKey,
                                                                   String keyPairId,
                                                                   Date expiresOn,
                                                                   Date activeFrom,
                                                                   String ipRange) {
        try {
            final String policy = CloudFrontCookieSigner.buildCustomPolicy(resourceUrlOrPath, expiresOn, activeFrom, ipRange);
            byte[] signatureBytes = signWithSha1RSA(policy.getBytes(UTF8), privateKey);
            String urlSafePolicy = makeStringUrlSafe(policy);
            String urlSafeSignature = makeBytesUrlSafe(signatureBytes);
            // Create the cookies
            final CookiesForCustomPolicy cookies = new CookiesForCustomPolicy();
            cookies.putPolicy(urlSafePolicy);
            cookies.putSignature(urlSafeSignature);
            cookies.putKeyPairId(keyPairId);
            return cookies;
        } catch (InvalidKeyException e) {
            throw new AmazonClientException("Couldn't sign custom policy cookie", e);
        }
    }

    /**
     * Returns signed cookies that provides tailored access to private content based on an access time window and an ip range.
     *
     * @param protocol           The protocol used to access content using signed cookies.
     * @param distributionDomain The domain name of the distribution.
     * @param privateKey         Your private key file. RSA private key (.der) are supported.
     * @param resourcePath       The path for the resource.
     * @param keyPairId          The key pair id corresponding to the private key file given.
     * @param expiresOn          The expiration date till which content can be accessed using the generated cookies.
     * @param ipRange            The allowed IP address range of the client making the GET request, in CIDR form (e.g. 192.168.0.1/24).
     * @return The signed cookies.
     */
    public static CookiesForCustomPolicy getCookiesForCustomPolicy(Protocols protocol,
                                                                   String distributionDomain,
                                                                   PrivateKey privateKey,
                                                                   String resourcePath,
                                                                   String keyPairId,
                                                                   Date expiresOn,
                                                                   String ipRange) {
        return getCookiesForCustomPolicy(protocol, distributionDomain, privateKey, resourcePath, keyPairId,
                expiresOn, null, ipRange);
    }

    /**
     * Returns a custom policy for the given parameters.
     */
    static String buildCustomPolicy(String resourcePath,
            Date activeFrom, Date expiresOn, String ipAddress) {
        return "{\"Statement\": [{"
                + "\"Resource\":\""
                + resourcePath
                + "\""
                + ",\"Condition\":{"
                + "\"DateLessThan\":{\"AWS:EpochTime\":"
                + MILLISECONDS.toSeconds(activeFrom.getTime())
                + "}"
                + ",\"IpAddress\":{\"AWS:SourceIp\":\""
                + ipAddress
                + "\"}"
                + (expiresOn == null
                   ? ""
                   : ",\"DateGreaterThan\":{\"AWS:EpochTime\":"
                     + MILLISECONDS.toSeconds(expiresOn.getTime()) + "}"
                  )
                + "}}]}";
    }

    /**
     * Returns a "canned" policy for the given parameters.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-signed-urls-overview.html"
     * >Overview of Signed URLs</a>.
     */
    static String buildCannedPolicy(String resourceUrlOrPath,
            Date activeFrom) {
        return "{\"Statement\":[{\"Resource\":\""
                + resourceUrlOrPath
                + "\",\"Condition\":{\"DateLessThan\":{\"AWS:EpochTime\":"
                + MILLISECONDS.toSeconds(activeFrom.getTime())
                + "}}}]}";
    }

    /**
     * Converts the given data to be safe for use in signed URLs for a private
     * distribution by using specialized Base64 encoding.
     */
    static String makeBytesUrlSafe(byte[] bytes) {
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
    private static String makeStringUrlSafe(String str) {
        return makeBytesUrlSafe(str.getBytes(StringUtils.UTF8));
    }

    /**
     * Returns the resource path for the given distribution, object, and
     * protocol.
     */
    private static String generateResourcePath(final Protocols protocol,
            final String distributionDomain, final String resourcePath) {
        return protocol == Protocols.http || protocol == Protocols.https
             ? protocol + "://" + distributionDomain + "/" + resourcePath
             : resourcePath
             ;
    }

    /**
     * Creates a private key from the file given, either in RSA private key
     * pkcs8 (.der) format. Other formats, including .pem, will cause an exception to
     * be thrown.
     */
    static PrivateKey loadPrivateKey(File privateKeyFile) throws InvalidKeySpecException, IOException {
        if ( StringUtils.lowerCase(privateKeyFile.getAbsolutePath()).endsWith(".der") ) {
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

    /**
     * Signs the data given with the private key given, using the SHA1withRSA
     * algorithm provided by bouncy castle.
     */
    private static byte[] signWithSha1RSA(byte[] dataToSign,
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
     * Contains common cookies used by Amazon CloudFront.
     */
    public static class SignedCookies {
        /**
         * The active CloudFront key pair Id for the key pair (Trusted Signer) that you are using to generate the signature.
         * For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html">
         * Specifying the AWS Accounts That Can Create Signed URLs and Signed Cookies (Trusted Signers)</a>
         * in the <i>Amazon CloudFront User Guide</i>.
         */
        protected Map<String, String> keyPairId;

        /**
         * The hashed and signed version of the policy.
         */
        protected Map<String, String> signature;

        public Map<String, String> getKeyPairId() {
            return keyPairId;
        }

        public void setKeyPairId(Map<String, String> keyPairId) {
            this.keyPairId = keyPairId;
        }

        public Map<String, String> getSignature() {
            return signature;
        }

        public void setSignature(Map<String, String> signature) {
            this.signature = signature;
        }

        /**
         * Convenience method to put keyPairId into a Map
         * @param keyPairIdValue keyPairId value
         */
        public void putKeyPairId(String keyPairIdValue) {
            if (this.keyPairId == null) {
                this.keyPairId = new HashMap<String, String>();
            }
            this.keyPairId.put(keyPairIdKey, keyPairIdValue);
        }

        /**
         * Convenience method to put signature into a Map
         * @param signatureValue signature value
         */
        public void putSignature(String signatureValue) {
            if (this.signature == null) {
                this.signature = new HashMap<String, String>();
            }
            this.signature.put(signatureKey, signatureValue);
        }
    }

    /**
     * Contains the cookies used to access restricted content from
     * CloudFront using a canned policy
     */
    public static class CookiesForCannedPolicy extends SignedCookies {
        // Date and time in Unix time format (in seconds) and Coordinated Universal Time (UTC).
        public Map<String, String> expires;

        public Map<String, String> getExpires() {
            return expires;
        }

        public void setExpires(Map<String, String> expires) {
            this.expires = expires;
        }

        /**
         * Convenience method to put expires into a Map
         * @param expiresValue expires value
         */
        public void putExpires(String expiresValue) {
            if (this.expires == null) {
                this.expires = new HashMap<String, String>();
            }
            this.expires.put(expiresKey, expiresValue);
        }
    }

    /**
     * Contains the cookies used to access restricted content from
     * CloudFront using a custom policy.
     */
    public static class CookiesForCustomPolicy extends SignedCookies {
        // Base64 encoded version of the custom policy.
        public Map<String, String> policy;

        public Map<String, String> getPolicy() {
            return policy;
        }

        public void setPolicy(Map<String, String> policy) {
            this.policy = policy;
        }

        /**
         * Convenience method to put policy into a Map
         * @param policyValue policy value
         */
        public void putPolicy(String policyValue) {
            if (this.policy == null) {
                this.policy = new HashMap<String, String>();
            }
            this.policy.put(policyKey, policyValue);
        }
    }
}
