/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that describes the default cache behavior if you don’t specify a <code>CacheBehavior</code> element or
 * if request URLs don’t match any of the values of <code>PathPattern</code> in <code>CacheBehavior</code> elements. You
 * must create exactly one default cache behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DefaultCacheBehavior" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultCacheBehavior implements Serializable, Cloneable {

    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to route requests to when they use the
     * default cache behavior.
     * </p>
     */
    private String targetOriginId;
    /**
     * <important>
     * <p>
     * We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     * </p>
     * </important>
     * <p>
     * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or signed cookies.
     * </p>
     * <p>
     * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed cookies for all
     * requests that match the cache behavior. The URLs or cookies must be signed with the private key of a CloudFront
     * key pair in a trusted signer’s AWS account. The signed URL or cookie contains information about which public key
     * CloudFront should use to verify the signature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private TrustedSigners trustedSigners;
    /**
     * <p>
     * A list of key groups that CloudFront can use to validate signed URLs or signed cookies.
     * </p>
     * <p>
     * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or signed cookies for all
     * requests that match the cache behavior. The URLs or cookies must be signed with a private key whose corresponding
     * public key is in the key group. The signed URL or cookie contains information about which public key CloudFront
     * should use to verify the signature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private TrustedKeyGroups trustedKeyGroups;
    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin specified by <code>TargetOriginId</code> when
     * a request matches the path pattern in <code>PathPattern</code>. You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of
     * 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the
     * new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     * (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects’ cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     * Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </note>
     */
    private String viewerProtocolPolicy;

    private AllowedMethods allowedMethods;
    /**
     * <p>
     * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the origin
     * that is associated with this cache behavior. If so, specify <code>true</code>; if not, specify <code>false</code>
     * . If you specify <code>true</code> for <code>SmoothStreaming</code>, you can still distribute other content using
     * this cache behavior if the content matches the value of <code>PathPattern</code>.
     * </p>
     */
    private Boolean smoothStreaming;
    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify
     * <code>true</code>; if not, specify <code>false</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html">Serving
     * Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private Boolean compress;
    /**
     * <p>
     * A complex type that contains zero or more Lambda function associations for a cache behavior.
     * </p>
     */
    private LambdaFunctionAssociations lambdaFunctionAssociations;
    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use for
     * encrypting specific fields of data for the default cache behavior.
     * </p>
     */
    private String fieldLevelEncryptionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this cache behavior. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time logs</a>
     * in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String realtimeLogConfigArn;
    /**
     * <p>
     * The unique identifier of the cache policy that is attached to the default cache behavior. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String cachePolicyId;
    /**
     * <p>
     * The unique identifier of the origin request policy that is attached to the default cache behavior. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     * >Creating origin request policies</a> or <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     * >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String originRequestPolicyId;
    /**
     * <p>
     * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this
     * field. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html">Working with
     * policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you want to include values in the cache key, use a cache policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you want to send values to the origin but not include them in the cache key, use an origin request policy. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     * >Creating origin request policies</a> or <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     * >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
     * </p>
     */
    @Deprecated
    private ForwardedValues forwardedValues;
    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>MinTTL</code> field in a cache policy instead of
     * this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers to
     * your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     * <code>*</code> for <code>Name</code>).
     * </p>
     */
    @Deprecated
    private Long minTTL;
    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>DefaultTTL</code> field in a cache policy instead
     * of this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    @Deprecated
    private Long defaultTTL;
    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>MaxTTL</code> field in a cache policy instead of
     * this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    @Deprecated
    private Long maxTTL;

    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to route requests to when they use the
     * default cache behavior.
     * </p>
     * 
     * @param targetOriginId
     *        The value of <code>ID</code> for the origin that you want CloudFront to route requests to when they use
     *        the default cache behavior.
     */

    public void setTargetOriginId(String targetOriginId) {
        this.targetOriginId = targetOriginId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to route requests to when they use the
     * default cache behavior.
     * </p>
     * 
     * @return The value of <code>ID</code> for the origin that you want CloudFront to route requests to when they use
     *         the default cache behavior.
     */

    public String getTargetOriginId() {
        return this.targetOriginId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to route requests to when they use the
     * default cache behavior.
     * </p>
     * 
     * @param targetOriginId
     *        The value of <code>ID</code> for the origin that you want CloudFront to route requests to when they use
     *        the default cache behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withTargetOriginId(String targetOriginId) {
        setTargetOriginId(targetOriginId);
        return this;
    }

    /**
     * <important>
     * <p>
     * We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     * </p>
     * </important>
     * <p>
     * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or signed cookies.
     * </p>
     * <p>
     * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed cookies for all
     * requests that match the cache behavior. The URLs or cookies must be signed with the private key of a CloudFront
     * key pair in a trusted signer’s AWS account. The signed URL or cookie contains information about which public key
     * CloudFront should use to verify the signature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param trustedSigners
     *        <p>
     *        We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     *        </p>
     *        </important>
     *        <p>
     *        A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or signed cookies.
     *        </p>
     *        <p>
     *        When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed cookies for all
     *        requests that match the cache behavior. The URLs or cookies must be signed with the private key of a
     *        CloudFront key pair in a trusted signer’s AWS account. The signed URL or cookie contains information about
     *        which public key CloudFront should use to verify the signature. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *        private content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    /**
     * <important>
     * <p>
     * We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     * </p>
     * </important>
     * <p>
     * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or signed cookies.
     * </p>
     * <p>
     * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed cookies for all
     * requests that match the cache behavior. The URLs or cookies must be signed with the private key of a CloudFront
     * key pair in a trusted signer’s AWS account. The signed URL or cookie contains information about which public key
     * CloudFront should use to verify the signature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return <p>
     *         We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     *         </p>
     *         </important>
     *         <p>
     *         A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or signed cookies.
     *         </p>
     *         <p>
     *         When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed cookies for all
     *         requests that match the cache behavior. The URLs or cookies must be signed with the private key of a
     *         CloudFront key pair in a trusted signer’s AWS account. The signed URL or cookie contains information
     *         about which public key CloudFront should use to verify the signature. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *         private content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public TrustedSigners getTrustedSigners() {
        return this.trustedSigners;
    }

    /**
     * <important>
     * <p>
     * We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     * </p>
     * </important>
     * <p>
     * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or signed cookies.
     * </p>
     * <p>
     * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed cookies for all
     * requests that match the cache behavior. The URLs or cookies must be signed with the private key of a CloudFront
     * key pair in a trusted signer’s AWS account. The signed URL or cookie contains information about which public key
     * CloudFront should use to verify the signature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param trustedSigners
     *        <p>
     *        We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     *        </p>
     *        </important>
     *        <p>
     *        A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or signed cookies.
     *        </p>
     *        <p>
     *        When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed cookies for all
     *        requests that match the cache behavior. The URLs or cookies must be signed with the private key of a
     *        CloudFront key pair in a trusted signer’s AWS account. The signed URL or cookie contains information about
     *        which public key CloudFront should use to verify the signature. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *        private content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withTrustedSigners(TrustedSigners trustedSigners) {
        setTrustedSigners(trustedSigners);
        return this;
    }

    /**
     * <p>
     * A list of key groups that CloudFront can use to validate signed URLs or signed cookies.
     * </p>
     * <p>
     * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or signed cookies for all
     * requests that match the cache behavior. The URLs or cookies must be signed with a private key whose corresponding
     * public key is in the key group. The signed URL or cookie contains information about which public key CloudFront
     * should use to verify the signature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param trustedKeyGroups
     *        A list of key groups that CloudFront can use to validate signed URLs or signed cookies.</p>
     *        <p>
     *        When a cache behavior contains trusted key groups, CloudFront requires signed URLs or signed cookies for
     *        all requests that match the cache behavior. The URLs or cookies must be signed with a private key whose
     *        corresponding public key is in the key group. The signed URL or cookie contains information about which
     *        public key CloudFront should use to verify the signature. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *        private content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setTrustedKeyGroups(TrustedKeyGroups trustedKeyGroups) {
        this.trustedKeyGroups = trustedKeyGroups;
    }

    /**
     * <p>
     * A list of key groups that CloudFront can use to validate signed URLs or signed cookies.
     * </p>
     * <p>
     * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or signed cookies for all
     * requests that match the cache behavior. The URLs or cookies must be signed with a private key whose corresponding
     * public key is in the key group. The signed URL or cookie contains information about which public key CloudFront
     * should use to verify the signature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return A list of key groups that CloudFront can use to validate signed URLs or signed cookies.</p>
     *         <p>
     *         When a cache behavior contains trusted key groups, CloudFront requires signed URLs or signed cookies for
     *         all requests that match the cache behavior. The URLs or cookies must be signed with a private key whose
     *         corresponding public key is in the key group. The signed URL or cookie contains information about which
     *         public key CloudFront should use to verify the signature. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *         private content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public TrustedKeyGroups getTrustedKeyGroups() {
        return this.trustedKeyGroups;
    }

    /**
     * <p>
     * A list of key groups that CloudFront can use to validate signed URLs or signed cookies.
     * </p>
     * <p>
     * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or signed cookies for all
     * requests that match the cache behavior. The URLs or cookies must be signed with a private key whose corresponding
     * public key is in the key group. The signed URL or cookie contains information about which public key CloudFront
     * should use to verify the signature. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param trustedKeyGroups
     *        A list of key groups that CloudFront can use to validate signed URLs or signed cookies.</p>
     *        <p>
     *        When a cache behavior contains trusted key groups, CloudFront requires signed URLs or signed cookies for
     *        all requests that match the cache behavior. The URLs or cookies must be signed with a private key whose
     *        corresponding public key is in the key group. The signed URL or cookie contains information about which
     *        public key CloudFront should use to verify the signature. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *        private content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withTrustedKeyGroups(TrustedKeyGroups trustedKeyGroups) {
        setTrustedKeyGroups(trustedKeyGroups);
        return this;
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin specified by <code>TargetOriginId</code> when
     * a request matches the path pattern in <code>PathPattern</code>. You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of
     * 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the
     * new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     * (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects’ cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     * Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param viewerProtocolPolicy
     *        The protocol that viewers can use to access the files in the origin specified by
     *        <code>TargetOriginId</code> when a request matches the path pattern in <code>PathPattern</code>. You can
     *        specify the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status
     *        code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the
     *        request using the new URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     *        (Forbidden).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about requiring the HTTPS protocol, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     *        >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is
     *        never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we
     *        recommend that you clear your objects’ cache because cached objects are protocol agnostic. That means that
     *        an edge location will return an object from the cache regardless of whether the current request protocol
     *        matches the protocol used previously. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     *        Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     * @see ViewerProtocolPolicy
     */

    public void setViewerProtocolPolicy(String viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin specified by <code>TargetOriginId</code> when
     * a request matches the path pattern in <code>PathPattern</code>. You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of
     * 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the
     * new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     * (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects’ cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     * Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return The protocol that viewers can use to access the files in the origin specified by
     *         <code>TargetOriginId</code> when a request matches the path pattern in <code>PathPattern</code>. You can
     *         specify the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status
     *         code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the
     *         request using the new URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     *         (Forbidden).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about requiring the HTTPS protocol, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     *         >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is
     *         never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we
     *         recommend that you clear your objects’ cache because cached objects are protocol agnostic. That means
     *         that an edge location will return an object from the cache regardless of whether the current request
     *         protocol matches the protocol used previously. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     *         Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     * @see ViewerProtocolPolicy
     */

    public String getViewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin specified by <code>TargetOriginId</code> when
     * a request matches the path pattern in <code>PathPattern</code>. You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of
     * 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the
     * new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     * (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects’ cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     * Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param viewerProtocolPolicy
     *        The protocol that viewers can use to access the files in the origin specified by
     *        <code>TargetOriginId</code> when a request matches the path pattern in <code>PathPattern</code>. You can
     *        specify the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status
     *        code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the
     *        request using the new URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     *        (Forbidden).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about requiring the HTTPS protocol, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     *        >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is
     *        never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we
     *        recommend that you clear your objects’ cache because cached objects are protocol agnostic. That means that
     *        an edge location will return an object from the cache regardless of whether the current request protocol
     *        matches the protocol used previously. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     *        Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewerProtocolPolicy
     */

    public DefaultCacheBehavior withViewerProtocolPolicy(String viewerProtocolPolicy) {
        setViewerProtocolPolicy(viewerProtocolPolicy);
        return this;
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin specified by <code>TargetOriginId</code> when
     * a request matches the path pattern in <code>PathPattern</code>. You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of
     * 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the
     * new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     * (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects’ cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     * Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param viewerProtocolPolicy
     *        The protocol that viewers can use to access the files in the origin specified by
     *        <code>TargetOriginId</code> when a request matches the path pattern in <code>PathPattern</code>. You can
     *        specify the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status
     *        code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the
     *        request using the new URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     *        (Forbidden).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about requiring the HTTPS protocol, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     *        >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is
     *        never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we
     *        recommend that you clear your objects’ cache because cached objects are protocol agnostic. That means that
     *        an edge location will return an object from the cache regardless of whether the current request protocol
     *        matches the protocol used previously. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     *        Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     * @see ViewerProtocolPolicy
     */

    public void setViewerProtocolPolicy(ViewerProtocolPolicy viewerProtocolPolicy) {
        withViewerProtocolPolicy(viewerProtocolPolicy);
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in the origin specified by <code>TargetOriginId</code> when
     * a request matches the path pattern in <code>PathPattern</code>. You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of
     * 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the
     * new URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     * (Forbidden).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about requiring the HTTPS protocol, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     * >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects’ cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     * Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param viewerProtocolPolicy
     *        The protocol that viewers can use to access the files in the origin specified by
     *        <code>TargetOriginId</code> when a request matches the path pattern in <code>PathPattern</code>. You can
     *        specify the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allow-all</code>: Viewers can use HTTP or HTTPS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>redirect-to-https</code>: If a viewer submits an HTTP request, CloudFront returns an HTTP status
     *        code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the
     *        request using the new URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https-only</code>: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403
     *        (Forbidden).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about requiring the HTTPS protocol, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html"
     *        >Requiring HTTPS Between Viewers and CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is
     *        never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we
     *        recommend that you clear your objects’ cache because cached objects are protocol agnostic. That means that
     *        an edge location will return an object from the cache regardless of whether the current request protocol
     *        matches the protocol used previously. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing Cache
     *        Expiration</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewerProtocolPolicy
     */

    public DefaultCacheBehavior withViewerProtocolPolicy(ViewerProtocolPolicy viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy.toString();
        return this;
    }

    /**
     * @param allowedMethods
     */

    public void setAllowedMethods(AllowedMethods allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    /**
     * @return
     */

    public AllowedMethods getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * @param allowedMethods
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withAllowedMethods(AllowedMethods allowedMethods) {
        setAllowedMethods(allowedMethods);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the origin
     * that is associated with this cache behavior. If so, specify <code>true</code>; if not, specify <code>false</code>
     * . If you specify <code>true</code> for <code>SmoothStreaming</code>, you can still distribute other content using
     * this cache behavior if the content matches the value of <code>PathPattern</code>.
     * </p>
     * 
     * @param smoothStreaming
     *        Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the
     *        origin that is associated with this cache behavior. If so, specify <code>true</code>; if not, specify
     *        <code>false</code>. If you specify <code>true</code> for <code>SmoothStreaming</code>, you can still
     *        distribute other content using this cache behavior if the content matches the value of
     *        <code>PathPattern</code>.
     */

    public void setSmoothStreaming(Boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
    }

    /**
     * <p>
     * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the origin
     * that is associated with this cache behavior. If so, specify <code>true</code>; if not, specify <code>false</code>
     * . If you specify <code>true</code> for <code>SmoothStreaming</code>, you can still distribute other content using
     * this cache behavior if the content matches the value of <code>PathPattern</code>.
     * </p>
     * 
     * @return Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the
     *         origin that is associated with this cache behavior. If so, specify <code>true</code>; if not, specify
     *         <code>false</code>. If you specify <code>true</code> for <code>SmoothStreaming</code>, you can still
     *         distribute other content using this cache behavior if the content matches the value of
     *         <code>PathPattern</code>.
     */

    public Boolean getSmoothStreaming() {
        return this.smoothStreaming;
    }

    /**
     * <p>
     * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the origin
     * that is associated with this cache behavior. If so, specify <code>true</code>; if not, specify <code>false</code>
     * . If you specify <code>true</code> for <code>SmoothStreaming</code>, you can still distribute other content using
     * this cache behavior if the content matches the value of <code>PathPattern</code>.
     * </p>
     * 
     * @param smoothStreaming
     *        Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the
     *        origin that is associated with this cache behavior. If so, specify <code>true</code>; if not, specify
     *        <code>false</code>. If you specify <code>true</code> for <code>SmoothStreaming</code>, you can still
     *        distribute other content using this cache behavior if the content matches the value of
     *        <code>PathPattern</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withSmoothStreaming(Boolean smoothStreaming) {
        setSmoothStreaming(smoothStreaming);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the origin
     * that is associated with this cache behavior. If so, specify <code>true</code>; if not, specify <code>false</code>
     * . If you specify <code>true</code> for <code>SmoothStreaming</code>, you can still distribute other content using
     * this cache behavior if the content matches the value of <code>PathPattern</code>.
     * </p>
     * 
     * @return Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the
     *         origin that is associated with this cache behavior. If so, specify <code>true</code>; if not, specify
     *         <code>false</code>. If you specify <code>true</code> for <code>SmoothStreaming</code>, you can still
     *         distribute other content using this cache behavior if the content matches the value of
     *         <code>PathPattern</code>.
     */

    public Boolean isSmoothStreaming() {
        return this.smoothStreaming;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify
     * <code>true</code>; if not, specify <code>false</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html">Serving
     * Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param compress
     *        Whether you want CloudFront to automatically compress certain files for this cache behavior. If so,
     *        specify <code>true</code>; if not, specify <code>false</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *        >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setCompress(Boolean compress) {
        this.compress = compress;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify
     * <code>true</code>; if not, specify <code>false</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html">Serving
     * Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return Whether you want CloudFront to automatically compress certain files for this cache behavior. If so,
     *         specify <code>true</code>; if not, specify <code>false</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *         >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public Boolean getCompress() {
        return this.compress;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify
     * <code>true</code>; if not, specify <code>false</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html">Serving
     * Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param compress
     *        Whether you want CloudFront to automatically compress certain files for this cache behavior. If so,
     *        specify <code>true</code>; if not, specify <code>false</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *        >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withCompress(Boolean compress) {
        setCompress(compress);
        return this;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify
     * <code>true</code>; if not, specify <code>false</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html">Serving
     * Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return Whether you want CloudFront to automatically compress certain files for this cache behavior. If so,
     *         specify <code>true</code>; if not, specify <code>false</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *         >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public Boolean isCompress() {
        return this.compress;
    }

    /**
     * <p>
     * A complex type that contains zero or more Lambda function associations for a cache behavior.
     * </p>
     * 
     * @param lambdaFunctionAssociations
     *        A complex type that contains zero or more Lambda function associations for a cache behavior.
     */

    public void setLambdaFunctionAssociations(LambdaFunctionAssociations lambdaFunctionAssociations) {
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
    }

    /**
     * <p>
     * A complex type that contains zero or more Lambda function associations for a cache behavior.
     * </p>
     * 
     * @return A complex type that contains zero or more Lambda function associations for a cache behavior.
     */

    public LambdaFunctionAssociations getLambdaFunctionAssociations() {
        return this.lambdaFunctionAssociations;
    }

    /**
     * <p>
     * A complex type that contains zero or more Lambda function associations for a cache behavior.
     * </p>
     * 
     * @param lambdaFunctionAssociations
     *        A complex type that contains zero or more Lambda function associations for a cache behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withLambdaFunctionAssociations(LambdaFunctionAssociations lambdaFunctionAssociations) {
        setLambdaFunctionAssociations(lambdaFunctionAssociations);
        return this;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use for
     * encrypting specific fields of data for the default cache behavior.
     * </p>
     * 
     * @param fieldLevelEncryptionId
     *        The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use
     *        for encrypting specific fields of data for the default cache behavior.
     */

    public void setFieldLevelEncryptionId(String fieldLevelEncryptionId) {
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use for
     * encrypting specific fields of data for the default cache behavior.
     * </p>
     * 
     * @return The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use
     *         for encrypting specific fields of data for the default cache behavior.
     */

    public String getFieldLevelEncryptionId() {
        return this.fieldLevelEncryptionId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use for
     * encrypting specific fields of data for the default cache behavior.
     * </p>
     * 
     * @param fieldLevelEncryptionId
     *        The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use
     *        for encrypting specific fields of data for the default cache behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withFieldLevelEncryptionId(String fieldLevelEncryptionId) {
        setFieldLevelEncryptionId(fieldLevelEncryptionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this cache behavior. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time logs</a>
     * in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param realtimeLogConfigArn
     *        The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this cache behavior.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time
     *        logs</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setRealtimeLogConfigArn(String realtimeLogConfigArn) {
        this.realtimeLogConfigArn = realtimeLogConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this cache behavior. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time logs</a>
     * in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this cache
     *         behavior. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time
     *         logs</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public String getRealtimeLogConfigArn() {
        return this.realtimeLogConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this cache behavior. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time logs</a>
     * in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param realtimeLogConfigArn
     *        The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this cache behavior.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time
     *        logs</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withRealtimeLogConfigArn(String realtimeLogConfigArn) {
        setRealtimeLogConfigArn(realtimeLogConfigArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the cache policy that is attached to the default cache behavior. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param cachePolicyId
     *        The unique identifier of the cache policy that is attached to the default cache behavior. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *        >Creating cache policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *        >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setCachePolicyId(String cachePolicyId) {
        this.cachePolicyId = cachePolicyId;
    }

    /**
     * <p>
     * The unique identifier of the cache policy that is attached to the default cache behavior. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The unique identifier of the cache policy that is attached to the default cache behavior. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *         >Creating cache policies</a> or <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *         >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public String getCachePolicyId() {
        return this.cachePolicyId;
    }

    /**
     * <p>
     * The unique identifier of the cache policy that is attached to the default cache behavior. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param cachePolicyId
     *        The unique identifier of the cache policy that is attached to the default cache behavior. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *        >Creating cache policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *        >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withCachePolicyId(String cachePolicyId) {
        setCachePolicyId(cachePolicyId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the origin request policy that is attached to the default cache behavior. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     * >Creating origin request policies</a> or <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     * >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param originRequestPolicyId
     *        The unique identifier of the origin request policy that is attached to the default cache behavior. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     *        >Creating origin request policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     *        >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setOriginRequestPolicyId(String originRequestPolicyId) {
        this.originRequestPolicyId = originRequestPolicyId;
    }

    /**
     * <p>
     * The unique identifier of the origin request policy that is attached to the default cache behavior. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     * >Creating origin request policies</a> or <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     * >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The unique identifier of the origin request policy that is attached to the default cache behavior. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     *         >Creating origin request policies</a> or <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     *         >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public String getOriginRequestPolicyId() {
        return this.originRequestPolicyId;
    }

    /**
     * <p>
     * The unique identifier of the origin request policy that is attached to the default cache behavior. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     * >Creating origin request policies</a> or <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     * >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param originRequestPolicyId
     *        The unique identifier of the origin request policy that is attached to the default cache behavior. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     *        >Creating origin request policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     *        >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultCacheBehavior withOriginRequestPolicyId(String originRequestPolicyId) {
        setOriginRequestPolicyId(originRequestPolicyId);
        return this;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this
     * field. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html">Working with
     * policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you want to include values in the cache key, use a cache policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you want to send values to the origin but not include them in the cache key, use an origin request policy. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     * >Creating origin request policies</a> or <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     * >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
     * </p>
     * 
     * @param forwardedValues
     *        This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of
     *        this field. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html"
     *        >Working with policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        If you want to include values in the cache key, use a cache policy. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *        >Creating cache policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *        >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        If you want to send values to the origin but not include them in the cache key, use an origin request
     *        policy. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     *        >Creating origin request policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     *        >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
     */
    @Deprecated
    public void setForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this
     * field. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html">Working with
     * policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you want to include values in the cache key, use a cache policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you want to send values to the origin but not include them in the cache key, use an origin request policy. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     * >Creating origin request policies</a> or <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     * >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
     * </p>
     * 
     * @return This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of
     *         this field. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html"
     *         >Working with policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *         <p>
     *         If you want to include values in the cache key, use a cache policy. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *         >Creating cache policies</a> or <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *         >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you want to send values to the origin but not include them in the cache key, use an origin request
     *         policy. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     *         >Creating origin request policies</a> or <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     *         >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
     */
    @Deprecated
    public ForwardedValues getForwardedValues() {
        return this.forwardedValues;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this
     * field. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html">Working with
     * policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you want to include values in the cache key, use a cache policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you want to send values to the origin but not include them in the cache key, use an origin request policy. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     * >Creating origin request policies</a> or <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     * >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
     * </p>
     * 
     * @param forwardedValues
     *        This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of
     *        this field. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html"
     *        >Working with policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        If you want to include values in the cache key, use a cache policy. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *        >Creating cache policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *        >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        If you want to send values to the origin but not include them in the cache key, use an origin request
     *        policy. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy"
     *        >Creating origin request policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html"
     *        >Using the managed origin request policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DefaultCacheBehavior withForwardedValues(ForwardedValues forwardedValues) {
        setForwardedValues(forwardedValues);
        return this;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>MinTTL</code> field in a cache policy instead of
     * this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers to
     * your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     * <code>*</code> for <code>Name</code>).
     * </p>
     * 
     * @param minTTL
     *        This field is deprecated. We recommend that you use the <code>MinTTL</code> field in a cache policy
     *        instead of this field. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *        >Creating cache policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *        >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers
     *        to your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     *        <code>*</code> for <code>Name</code>).
     */
    @Deprecated
    public void setMinTTL(Long minTTL) {
        this.minTTL = minTTL;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>MinTTL</code> field in a cache policy instead of
     * this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers to
     * your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     * <code>*</code> for <code>Name</code>).
     * </p>
     * 
     * @return This field is deprecated. We recommend that you use the <code>MinTTL</code> field in a cache policy
     *         instead of this field. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *         >Creating cache policies</a> or <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *         >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *         <p>
     *         The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *         another request to your origin to determine whether the object has been updated. For more information,
     *         see <a href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing
     *         How Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all
     *         headers to your origin (under <code>Headers</code>, if you specify <code>1</code> for
     *         <code>Quantity</code> and <code>*</code> for <code>Name</code>).
     */
    @Deprecated
    public Long getMinTTL() {
        return this.minTTL;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>MinTTL</code> field in a cache policy instead of
     * this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers to
     * your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     * <code>*</code> for <code>Name</code>).
     * </p>
     * 
     * @param minTTL
     *        This field is deprecated. We recommend that you use the <code>MinTTL</code> field in a cache policy
     *        instead of this field. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *        >Creating cache policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *        >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers
     *        to your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     *        <code>*</code> for <code>Name</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DefaultCacheBehavior withMinTTL(Long minTTL) {
        setMinTTL(minTTL);
        return this;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>DefaultTTL</code> field in a cache policy instead
     * of this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param defaultTTL
     *        This field is deprecated. We recommend that you use the <code>DefaultTTL</code> field in a cache policy
     *        instead of this field. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *        >Creating cache policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *        >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. The value that you
     *        specify applies only when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */
    @Deprecated
    public void setDefaultTTL(Long defaultTTL) {
        this.defaultTTL = defaultTTL;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>DefaultTTL</code> field in a cache policy instead
     * of this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return This field is deprecated. We recommend that you use the <code>DefaultTTL</code> field in a cache policy
     *         instead of this field. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *         >Creating cache policies</a> or <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *         >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *         <p>
     *         The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *         another request to your origin to determine whether the object has been updated. The value that you
     *         specify applies only when your origin does not add HTTP headers such as
     *         <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to
     *         objects. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *         Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */
    @Deprecated
    public Long getDefaultTTL() {
        return this.defaultTTL;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>DefaultTTL</code> field in a cache policy instead
     * of this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param defaultTTL
     *        This field is deprecated. We recommend that you use the <code>DefaultTTL</code> field in a cache policy
     *        instead of this field. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *        >Creating cache policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *        >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. The value that you
     *        specify applies only when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DefaultCacheBehavior withDefaultTTL(Long defaultTTL) {
        setDefaultTTL(defaultTTL);
        return this;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>MaxTTL</code> field in a cache policy instead of
     * this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param maxTTL
     *        This field is deprecated. We recommend that you use the <code>MaxTTL</code> field in a cache policy
     *        instead of this field. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *        >Creating cache policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *        >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. The value that you
     *        specify applies only when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     *        <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */
    @Deprecated
    public void setMaxTTL(Long maxTTL) {
        this.maxTTL = maxTTL;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>MaxTTL</code> field in a cache policy instead of
     * this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return This field is deprecated. We recommend that you use the <code>MaxTTL</code> field in a cache policy
     *         instead of this field. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *         >Creating cache policies</a> or <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *         >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *         <p>
     *         The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *         another request to your origin to determine whether the object has been updated. The value that you
     *         specify applies only when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     *         <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *         Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */
    @Deprecated
    public Long getMaxTTL() {
        return this.maxTTL;
    }

    /**
     * <p>
     * This field is deprecated. We recommend that you use the <code>MaxTTL</code> field in a cache policy instead of
     * this field. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     * >Creating cache policies</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html">Using
     * the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How Long
     * Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param maxTTL
     *        This field is deprecated. We recommend that you use the <code>MaxTTL</code> field in a cache policy
     *        instead of this field. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy"
     *        >Creating cache policies</a> or <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html"
     *        >Using the managed cache policies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
     *        <p>
     *        The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. The value that you
     *        specify applies only when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     *        <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Managing How
     *        Long Content Stays in an Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DefaultCacheBehavior withMaxTTL(Long maxTTL) {
        setMaxTTL(maxTTL);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTargetOriginId() != null)
            sb.append("TargetOriginId: ").append(getTargetOriginId()).append(",");
        if (getTrustedSigners() != null)
            sb.append("TrustedSigners: ").append(getTrustedSigners()).append(",");
        if (getTrustedKeyGroups() != null)
            sb.append("TrustedKeyGroups: ").append(getTrustedKeyGroups()).append(",");
        if (getViewerProtocolPolicy() != null)
            sb.append("ViewerProtocolPolicy: ").append(getViewerProtocolPolicy()).append(",");
        if (getAllowedMethods() != null)
            sb.append("AllowedMethods: ").append(getAllowedMethods()).append(",");
        if (getSmoothStreaming() != null)
            sb.append("SmoothStreaming: ").append(getSmoothStreaming()).append(",");
        if (getCompress() != null)
            sb.append("Compress: ").append(getCompress()).append(",");
        if (getLambdaFunctionAssociations() != null)
            sb.append("LambdaFunctionAssociations: ").append(getLambdaFunctionAssociations()).append(",");
        if (getFieldLevelEncryptionId() != null)
            sb.append("FieldLevelEncryptionId: ").append(getFieldLevelEncryptionId()).append(",");
        if (getRealtimeLogConfigArn() != null)
            sb.append("RealtimeLogConfigArn: ").append(getRealtimeLogConfigArn()).append(",");
        if (getCachePolicyId() != null)
            sb.append("CachePolicyId: ").append(getCachePolicyId()).append(",");
        if (getOriginRequestPolicyId() != null)
            sb.append("OriginRequestPolicyId: ").append(getOriginRequestPolicyId()).append(",");
        if (getForwardedValues() != null)
            sb.append("ForwardedValues: ").append(getForwardedValues()).append(",");
        if (getMinTTL() != null)
            sb.append("MinTTL: ").append(getMinTTL()).append(",");
        if (getDefaultTTL() != null)
            sb.append("DefaultTTL: ").append(getDefaultTTL()).append(",");
        if (getMaxTTL() != null)
            sb.append("MaxTTL: ").append(getMaxTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultCacheBehavior == false)
            return false;
        DefaultCacheBehavior other = (DefaultCacheBehavior) obj;
        if (other.getTargetOriginId() == null ^ this.getTargetOriginId() == null)
            return false;
        if (other.getTargetOriginId() != null && other.getTargetOriginId().equals(this.getTargetOriginId()) == false)
            return false;
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null)
            return false;
        if (other.getTrustedSigners() != null && other.getTrustedSigners().equals(this.getTrustedSigners()) == false)
            return false;
        if (other.getTrustedKeyGroups() == null ^ this.getTrustedKeyGroups() == null)
            return false;
        if (other.getTrustedKeyGroups() != null && other.getTrustedKeyGroups().equals(this.getTrustedKeyGroups()) == false)
            return false;
        if (other.getViewerProtocolPolicy() == null ^ this.getViewerProtocolPolicy() == null)
            return false;
        if (other.getViewerProtocolPolicy() != null && other.getViewerProtocolPolicy().equals(this.getViewerProtocolPolicy()) == false)
            return false;
        if (other.getAllowedMethods() == null ^ this.getAllowedMethods() == null)
            return false;
        if (other.getAllowedMethods() != null && other.getAllowedMethods().equals(this.getAllowedMethods()) == false)
            return false;
        if (other.getSmoothStreaming() == null ^ this.getSmoothStreaming() == null)
            return false;
        if (other.getSmoothStreaming() != null && other.getSmoothStreaming().equals(this.getSmoothStreaming()) == false)
            return false;
        if (other.getCompress() == null ^ this.getCompress() == null)
            return false;
        if (other.getCompress() != null && other.getCompress().equals(this.getCompress()) == false)
            return false;
        if (other.getLambdaFunctionAssociations() == null ^ this.getLambdaFunctionAssociations() == null)
            return false;
        if (other.getLambdaFunctionAssociations() != null && other.getLambdaFunctionAssociations().equals(this.getLambdaFunctionAssociations()) == false)
            return false;
        if (other.getFieldLevelEncryptionId() == null ^ this.getFieldLevelEncryptionId() == null)
            return false;
        if (other.getFieldLevelEncryptionId() != null && other.getFieldLevelEncryptionId().equals(this.getFieldLevelEncryptionId()) == false)
            return false;
        if (other.getRealtimeLogConfigArn() == null ^ this.getRealtimeLogConfigArn() == null)
            return false;
        if (other.getRealtimeLogConfigArn() != null && other.getRealtimeLogConfigArn().equals(this.getRealtimeLogConfigArn()) == false)
            return false;
        if (other.getCachePolicyId() == null ^ this.getCachePolicyId() == null)
            return false;
        if (other.getCachePolicyId() != null && other.getCachePolicyId().equals(this.getCachePolicyId()) == false)
            return false;
        if (other.getOriginRequestPolicyId() == null ^ this.getOriginRequestPolicyId() == null)
            return false;
        if (other.getOriginRequestPolicyId() != null && other.getOriginRequestPolicyId().equals(this.getOriginRequestPolicyId()) == false)
            return false;
        if (other.getForwardedValues() == null ^ this.getForwardedValues() == null)
            return false;
        if (other.getForwardedValues() != null && other.getForwardedValues().equals(this.getForwardedValues()) == false)
            return false;
        if (other.getMinTTL() == null ^ this.getMinTTL() == null)
            return false;
        if (other.getMinTTL() != null && other.getMinTTL().equals(this.getMinTTL()) == false)
            return false;
        if (other.getDefaultTTL() == null ^ this.getDefaultTTL() == null)
            return false;
        if (other.getDefaultTTL() != null && other.getDefaultTTL().equals(this.getDefaultTTL()) == false)
            return false;
        if (other.getMaxTTL() == null ^ this.getMaxTTL() == null)
            return false;
        if (other.getMaxTTL() != null && other.getMaxTTL().equals(this.getMaxTTL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetOriginId() == null) ? 0 : getTargetOriginId().hashCode());
        hashCode = prime * hashCode + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode());
        hashCode = prime * hashCode + ((getTrustedKeyGroups() == null) ? 0 : getTrustedKeyGroups().hashCode());
        hashCode = prime * hashCode + ((getViewerProtocolPolicy() == null) ? 0 : getViewerProtocolPolicy().hashCode());
        hashCode = prime * hashCode + ((getAllowedMethods() == null) ? 0 : getAllowedMethods().hashCode());
        hashCode = prime * hashCode + ((getSmoothStreaming() == null) ? 0 : getSmoothStreaming().hashCode());
        hashCode = prime * hashCode + ((getCompress() == null) ? 0 : getCompress().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionAssociations() == null) ? 0 : getLambdaFunctionAssociations().hashCode());
        hashCode = prime * hashCode + ((getFieldLevelEncryptionId() == null) ? 0 : getFieldLevelEncryptionId().hashCode());
        hashCode = prime * hashCode + ((getRealtimeLogConfigArn() == null) ? 0 : getRealtimeLogConfigArn().hashCode());
        hashCode = prime * hashCode + ((getCachePolicyId() == null) ? 0 : getCachePolicyId().hashCode());
        hashCode = prime * hashCode + ((getOriginRequestPolicyId() == null) ? 0 : getOriginRequestPolicyId().hashCode());
        hashCode = prime * hashCode + ((getForwardedValues() == null) ? 0 : getForwardedValues().hashCode());
        hashCode = prime * hashCode + ((getMinTTL() == null) ? 0 : getMinTTL().hashCode());
        hashCode = prime * hashCode + ((getDefaultTTL() == null) ? 0 : getDefaultTTL().hashCode());
        hashCode = prime * hashCode + ((getMaxTTL() == null) ? 0 : getMaxTTL().hashCode());
        return hashCode;
    }

    @Override
    public DefaultCacheBehavior clone() {
        try {
            return (DefaultCacheBehavior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
