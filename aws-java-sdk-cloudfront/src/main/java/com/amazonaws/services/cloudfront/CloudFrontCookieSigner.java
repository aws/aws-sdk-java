/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.cloudfront.util.SignerUtils.buildCannedPolicy;
import static com.amazonaws.services.cloudfront.util.SignerUtils.buildCustomPolicy;
import static com.amazonaws.services.cloudfront.util.SignerUtils.generateResourcePath;
import static com.amazonaws.services.cloudfront.util.SignerUtils.loadPrivateKey;
import static com.amazonaws.services.cloudfront.util.SignerUtils.makeBytesUrlSafe;
import static com.amazonaws.services.cloudfront.util.SignerUtils.makeStringUrlSafe;
import static com.amazonaws.services.cloudfront.util.SignerUtils.signWithSha1RSA;
import static com.amazonaws.util.StringUtils.UTF8;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cloudfront.util.SignerUtils;
import com.amazonaws.services.cloudfront.util.SignerUtils.Protocol;
import com.amazonaws.util.DateUtils;

// The source code originated from the .NET implementation at
// https://github.com/aws/aws-sdk-net/blob/master/sdk/src/Services/CloudFront/Custom/_bcl/AmazonCloudFrontCookieSigner.cs

/**
 * Utility class for generating pre-signed Set-Cookie headers for serving private CloudFront content.
 * <p>
 * All dates must be in UTC. You can use {@link Calendar} to set the timezone
 * before converting to a {@link Date} object, or use {@link DateUtils} to turn
 * a UTC date String into a Date object.
 * <p>
 * <pre>
 * Protocol protocol = Protocol.https;
 * String distributionDomain = "d1b2c3a4g5h6.cloudfront.net";
 * File privateKeyFile = new File("/path/to/cfcurlCloud/rsa-private-key.der");
 * String resourcePath = "a/b/images.jpeg";
 * String keyPairId = "APKAJCEOKRHC3XIVU5NA";
 * Date activeFrom = DateUtils.parseISO8601Date("2012-11-14T22:20:00.000Z");
 * Date expiresOn = DateUtils.parseISO8601Date("2011-11-14T22:20:00.000Z");
 * String ipRange = "192.168.0.1/24";
 *
 * CookiesForCannedPolicy cookies = CloudFrontCookieSigner.getCookiesForCannedPolicy(
 *              protocol, distributionDomain, privateKeyFile, s3ObjectKey,
 *              keyPairId, expiresOn);
 *
 * HttpClient client = new DefaultHttpClient();
 * HttpGet httpGet = new HttpGet(
 *              SignerUtils.generateResourcePath(protocol, distributionDomain,
 *              resourcePath));
 *
 * httpGet.addHeader("Cookie", cookies.getExpires().getKey() + "=" +
 *     cookies.getExpires().getValue());
 * httpGet.addHeader("Cookie", cookies.getSignature().getKey() + "=" +
 *     cookies.getSignature().getValue());
 * httpGet.addHeader("Cookie", cookies.getKeyPairId().getKey() + "=" +
 *     cookies.getKeyPairId().getValue());
 *
 * HttpResponse response = client.execute(httpGet);
 *
 * CookiesForCustomPolicy cookies2 = CloudFrontCookieSigner.getCookiesForCustomPolicy(
 *              protocol, distributionDomain, privateKeyFile, s3ObjectKey,
 *              keyPairId, expiresOn, activeFrom, ipRange);
 * </pre>
 *
 * @see DateUtils
 */
public enum CloudFrontCookieSigner {
    ;
    private static final String EXPIRES_KEY = "CloudFront-Expires";
    private static final String SIGNATURE_KEY = "CloudFront-Signature";
    private static final String POLICY_KEY = "CloudFront-Policy";
    private static final String KEY_PAIR_ID_KEY = "CloudFront-Key-Pair-Id";

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
    public static CookiesForCannedPolicy getCookiesForCannedPolicy(Protocol protocol,
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
    public static CookiesForCannedPolicy getCookiesForCannedPolicy(Protocol protocol,
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
            final String cannedPolicy = buildCannedPolicy(resourceUrlOrPath, expiresOn);
            byte[] signatureBytes = signWithSha1RSA(cannedPolicy.getBytes(UTF8), privateKey);
            String urlSafeSignature = makeBytesUrlSafe(signatureBytes);
            // Create the cookies
            final CookiesForCannedPolicy cookies = new CookiesForCannedPolicy();
            cookies.setExpires(String.valueOf(MILLISECONDS.toSeconds(expiresOn.getTime())));
            cookies.setSignature(urlSafeSignature);
            cookies.setKeyPairId(keyPairId);
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
    public static CookiesForCustomPolicy getCookiesForCustomPolicy(Protocol protocol,
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
    public static CookiesForCustomPolicy getCookiesForCustomPolicy(Protocol protocol,
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
            final String policy = buildCustomPolicy(resourceUrlOrPath, expiresOn, activeFrom, ipRange);
            byte[] signatureBytes = signWithSha1RSA(policy.getBytes(UTF8), privateKey);
            String urlSafePolicy = makeStringUrlSafe(policy);
            String urlSafeSignature = makeBytesUrlSafe(signatureBytes);
            // Create the cookies
            final CookiesForCustomPolicy cookies = new CookiesForCustomPolicy();
            cookies.setPolicy(urlSafePolicy);
            cookies.setSignature(urlSafeSignature);
            cookies.setKeyPairId(keyPairId);
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
    public static CookiesForCustomPolicy getCookiesForCustomPolicy(Protocol protocol,
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
     * Contains common cookies used by Amazon CloudFront.
     */
    public static class SignedCookies {
        /**
         * The active CloudFront key pair Id for the key pair (Trusted Signer) that you are using to generate the signature.
         * For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html">
         * Specifying the AWS Accounts That Can Create Signed URLs and Signed Cookies (Trusted Signers)</a>
         * in the <i>Amazon CloudFront User Guide</i>.
         */
        protected Map.Entry<String, String> keyPairId;

        protected static class CookieKeyValuePair implements Map.Entry<String, String> {
            private String key;
            private String value;

            public CookieKeyValuePair(String key, String value) {
                this.key = key;
                this.value = value;
            }

            @Override
            public String getKey() {
                return key;
            }

            @Override
            public String getValue() {
                return value;
            }

            @Override
            public String setValue(String value) {
                String originalValue = this.value;
                this.value = value;
                return originalValue;
            }
        }

        /**
         * The hashed and signed version of the policy.
         */
        protected Map.Entry<String, String> signature;

        public Map.Entry<String, String> getKeyPairId() {
            return keyPairId;
        }

        public void setKeyPairId(String keyPairId) {
            this.keyPairId = new CookieKeyValuePair(KEY_PAIR_ID_KEY, keyPairId);
        }

        public Map.Entry<String, String> getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = new CookieKeyValuePair(SIGNATURE_KEY, signature);
        }
    }

    /**
     * Contains the cookies used to access restricted content from
     * CloudFront using a canned policy
     */
    public static class CookiesForCannedPolicy extends SignedCookies {
        // Date and time in Unix time format (in seconds) and Coordinated Universal Time (UTC).
        public Map.Entry<String, String> expires;

        public Map.Entry<String, String> getExpires() {
            return expires;
        }

        public void setExpires(String expires) {
            this.expires = new CookieKeyValuePair(EXPIRES_KEY, expires);
        }
    }

    /**
     * Contains the cookies used to access restricted content from
     * CloudFront using a custom policy.
     */
    public static class CookiesForCustomPolicy extends SignedCookies {
        // Base64 encoded version of the custom policy.
        public Map.Entry<String, String> policy;

        public Map.Entry<String, String> getPolicy() {
            return policy;
        }

        public void setPolicy(String policy) {
            this.policy = new CookieKeyValuePair(POLICY_KEY, policy);
        }
    }
}
