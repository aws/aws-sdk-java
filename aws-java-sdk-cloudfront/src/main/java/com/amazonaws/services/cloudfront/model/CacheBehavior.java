/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A complex type that describes how CloudFront processes requests.
 * </p>
 * <p>
 * You must create at least as many cache behaviors (including the default cache behavior) as you have origins if you
 * want CloudFront to distribute objects from all of the origins. Each cache behavior specifies the one origin from
 * which you want CloudFront to get objects. If you have two origins and only the default cache behavior, the default
 * cache behavior will cause CloudFront to get objects from one of the origins, but the other origin is never used.
 * </p>
 * <p>
 * For the current limit on the number of cache behaviors that you can add to a distribution, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon CloudFront
 * Limits</a> in the <i>AWS General Reference</i>.
 * </p>
 * <p>
 * If you don't want to specify any cache behaviors, include only an empty <code>CacheBehaviors</code> element. Don't
 * include an empty <code>CacheBehavior</code> element, or CloudFront returns a <code>MalformedXML</code> error.
 * </p>
 * <p>
 * To delete all cache behaviors in an existing distribution, update the distribution configuration and include only an
 * empty <code>CacheBehaviors</code> element.
 * </p>
 * <p>
 * To add, change, or remove one or more cache behaviors, update the distribution configuration and specify all of the
 * cache behaviors that you want to include in the updated distribution.
 * </p>
 * <p>
 * For more information about cache behaviors, see <a href=
 * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior"
 * >Cache Behaviors</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CacheBehavior" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheBehavior implements Serializable, Cloneable {

    /**
     * <p>
     * The pattern (for example, <code>images/*.jpg</code>) that specifies which requests to apply the behavior to. When
     * CloudFront receives a viewer request, the requested path is compared with path patterns in the order in which
     * cache behaviors are listed in the distribution.
     * </p>
     * <note>
     * <p>
     * You can optionally include a slash (<code>/</code>) at the beginning of the path pattern. For example,
     * <code>/images/*.jpg</code>. CloudFront behavior is the same with or without the leading <code>/</code>.
     * </p>
     * </note>
     * <p>
     * The path pattern for the default cache behavior is <code>*</code> and cannot be changed. If the request for an
     * object does not match the path pattern for any cache behaviors, CloudFront applies the behavior in the default
     * cache behavior.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern"
     * >Path Pattern</a> in the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String pathPattern;
    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to route requests to when a request matches
     * the path pattern either for a cache behavior or for the default cache behavior in your distribution.
     * </p>
     */
    private String targetOriginId;
    /**
     * <p>
     * A complex type that specifies how CloudFront handles query strings and cookies.
     * </p>
     */
    private ForwardedValues forwardedValues;
    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * If you want to require signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify
     * the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>, specify
     * <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>
     * .
     * </p>
     * <p>
     * To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code> (if it's
     * currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the trusted signers
     * that you want to include in the updated distribution.
     * </p>
     */
    private TrustedSigners trustedSigners;
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
     * For more information about requiring the HTTPS protocol, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an HTTPS
     * Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects' cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </note>
     */
    private String viewerProtocolPolicy;
    /**
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers to
     * your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     * <code>*</code> for <code>Name</code>).
     * </p>
     */
    private Long minTTL;

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
     * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     */
    private Long defaultTTL;
    /**
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     */
    private Long maxTTL;
    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true;
     * if not, specify false. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html">Serving
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
     * encrypting specific fields of data for a cache behavior or for the default cache behavior in your distribution.
     * </p>
     */
    private String fieldLevelEncryptionId;

    /**
     * <p>
     * The pattern (for example, <code>images/*.jpg</code>) that specifies which requests to apply the behavior to. When
     * CloudFront receives a viewer request, the requested path is compared with path patterns in the order in which
     * cache behaviors are listed in the distribution.
     * </p>
     * <note>
     * <p>
     * You can optionally include a slash (<code>/</code>) at the beginning of the path pattern. For example,
     * <code>/images/*.jpg</code>. CloudFront behavior is the same with or without the leading <code>/</code>.
     * </p>
     * </note>
     * <p>
     * The path pattern for the default cache behavior is <code>*</code> and cannot be changed. If the request for an
     * object does not match the path pattern for any cache behaviors, CloudFront applies the behavior in the default
     * cache behavior.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern"
     * >Path Pattern</a> in the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param pathPattern
     *        The pattern (for example, <code>images/*.jpg</code>) that specifies which requests to apply the behavior
     *        to. When CloudFront receives a viewer request, the requested path is compared with path patterns in the
     *        order in which cache behaviors are listed in the distribution.</p> <note>
     *        <p>
     *        You can optionally include a slash (<code>/</code>) at the beginning of the path pattern. For example,
     *        <code>/images/*.jpg</code>. CloudFront behavior is the same with or without the leading <code>/</code>.
     *        </p>
     *        </note>
     *        <p>
     *        The path pattern for the default cache behavior is <code>*</code> and cannot be changed. If the request
     *        for an object does not match the path pattern for any cache behaviors, CloudFront applies the behavior in
     *        the default cache behavior.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern"
     *        >Path Pattern</a> in the <i> Amazon CloudFront Developer Guide</i>.
     */

    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    /**
     * <p>
     * The pattern (for example, <code>images/*.jpg</code>) that specifies which requests to apply the behavior to. When
     * CloudFront receives a viewer request, the requested path is compared with path patterns in the order in which
     * cache behaviors are listed in the distribution.
     * </p>
     * <note>
     * <p>
     * You can optionally include a slash (<code>/</code>) at the beginning of the path pattern. For example,
     * <code>/images/*.jpg</code>. CloudFront behavior is the same with or without the leading <code>/</code>.
     * </p>
     * </note>
     * <p>
     * The path pattern for the default cache behavior is <code>*</code> and cannot be changed. If the request for an
     * object does not match the path pattern for any cache behaviors, CloudFront applies the behavior in the default
     * cache behavior.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern"
     * >Path Pattern</a> in the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The pattern (for example, <code>images/*.jpg</code>) that specifies which requests to apply the behavior
     *         to. When CloudFront receives a viewer request, the requested path is compared with path patterns in the
     *         order in which cache behaviors are listed in the distribution.</p> <note>
     *         <p>
     *         You can optionally include a slash (<code>/</code>) at the beginning of the path pattern. For example,
     *         <code>/images/*.jpg</code>. CloudFront behavior is the same with or without the leading <code>/</code>.
     *         </p>
     *         </note>
     *         <p>
     *         The path pattern for the default cache behavior is <code>*</code> and cannot be changed. If the request
     *         for an object does not match the path pattern for any cache behaviors, CloudFront applies the behavior in
     *         the default cache behavior.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern"
     *         >Path Pattern</a> in the <i> Amazon CloudFront Developer Guide</i>.
     */

    public String getPathPattern() {
        return this.pathPattern;
    }

    /**
     * <p>
     * The pattern (for example, <code>images/*.jpg</code>) that specifies which requests to apply the behavior to. When
     * CloudFront receives a viewer request, the requested path is compared with path patterns in the order in which
     * cache behaviors are listed in the distribution.
     * </p>
     * <note>
     * <p>
     * You can optionally include a slash (<code>/</code>) at the beginning of the path pattern. For example,
     * <code>/images/*.jpg</code>. CloudFront behavior is the same with or without the leading <code>/</code>.
     * </p>
     * </note>
     * <p>
     * The path pattern for the default cache behavior is <code>*</code> and cannot be changed. If the request for an
     * object does not match the path pattern for any cache behaviors, CloudFront applies the behavior in the default
     * cache behavior.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern"
     * >Path Pattern</a> in the <i> Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param pathPattern
     *        The pattern (for example, <code>images/*.jpg</code>) that specifies which requests to apply the behavior
     *        to. When CloudFront receives a viewer request, the requested path is compared with path patterns in the
     *        order in which cache behaviors are listed in the distribution.</p> <note>
     *        <p>
     *        You can optionally include a slash (<code>/</code>) at the beginning of the path pattern. For example,
     *        <code>/images/*.jpg</code>. CloudFront behavior is the same with or without the leading <code>/</code>.
     *        </p>
     *        </note>
     *        <p>
     *        The path pattern for the default cache behavior is <code>*</code> and cannot be changed. If the request
     *        for an object does not match the path pattern for any cache behaviors, CloudFront applies the behavior in
     *        the default cache behavior.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern"
     *        >Path Pattern</a> in the <i> Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehavior withPathPattern(String pathPattern) {
        setPathPattern(pathPattern);
        return this;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to route requests to when a request matches
     * the path pattern either for a cache behavior or for the default cache behavior in your distribution.
     * </p>
     * 
     * @param targetOriginId
     *        The value of <code>ID</code> for the origin that you want CloudFront to route requests to when a request
     *        matches the path pattern either for a cache behavior or for the default cache behavior in your
     *        distribution.
     */

    public void setTargetOriginId(String targetOriginId) {
        this.targetOriginId = targetOriginId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to route requests to when a request matches
     * the path pattern either for a cache behavior or for the default cache behavior in your distribution.
     * </p>
     * 
     * @return The value of <code>ID</code> for the origin that you want CloudFront to route requests to when a request
     *         matches the path pattern either for a cache behavior or for the default cache behavior in your
     *         distribution.
     */

    public String getTargetOriginId() {
        return this.targetOriginId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the origin that you want CloudFront to route requests to when a request matches
     * the path pattern either for a cache behavior or for the default cache behavior in your distribution.
     * </p>
     * 
     * @param targetOriginId
     *        The value of <code>ID</code> for the origin that you want CloudFront to route requests to when a request
     *        matches the path pattern either for a cache behavior or for the default cache behavior in your
     *        distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehavior withTargetOriginId(String targetOriginId) {
        setTargetOriginId(targetOriginId);
        return this;
    }

    /**
     * <p>
     * A complex type that specifies how CloudFront handles query strings and cookies.
     * </p>
     * 
     * @param forwardedValues
     *        A complex type that specifies how CloudFront handles query strings and cookies.
     */

    public void setForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
    }

    /**
     * <p>
     * A complex type that specifies how CloudFront handles query strings and cookies.
     * </p>
     * 
     * @return A complex type that specifies how CloudFront handles query strings and cookies.
     */

    public ForwardedValues getForwardedValues() {
        return this.forwardedValues;
    }

    /**
     * <p>
     * A complex type that specifies how CloudFront handles query strings and cookies.
     * </p>
     * 
     * @param forwardedValues
     *        A complex type that specifies how CloudFront handles query strings and cookies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehavior withForwardedValues(ForwardedValues forwardedValues) {
        setForwardedValues(forwardedValues);
        return this;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * If you want to require signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify
     * the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>, specify
     * <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>
     * .
     * </p>
     * <p>
     * To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code> (if it's
     * currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the trusted signers
     * that you want to include in the updated distribution.
     * </p>
     * 
     * @param trustedSigners
     *        A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for
     *        private content.</p>
     *        <p>
     *        If you want to require signed URLs in requests for objects in the target origin that match the
     *        <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and
     *        specify the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see
     *        <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *        Private Content through CloudFront</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>,
     *        specify <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     *        <code>Items</code>.
     *        </p>
     *        <p>
     *        To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code>
     *        (if it's currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the
     *        trusted signers that you want to include in the updated distribution.
     */

    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * If you want to require signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify
     * the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>, specify
     * <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>
     * .
     * </p>
     * <p>
     * To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code> (if it's
     * currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the trusted signers
     * that you want to include in the updated distribution.
     * </p>
     * 
     * @return A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for
     *         private content.</p>
     *         <p>
     *         If you want to require signed URLs in requests for objects in the target origin that match the
     *         <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and
     *         specify the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see
     *         <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *         Private Content through CloudFront</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>,
     *         specify <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     *         <code>Items</code>.
     *         </p>
     *         <p>
     *         To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code>
     *         (if it's currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of
     *         the trusted signers that you want to include in the updated distribution.
     */

    public TrustedSigners getTrustedSigners() {
        return this.trustedSigners;
    }

    /**
     * <p>
     * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private
     * content.
     * </p>
     * <p>
     * If you want to require signed URLs in requests for objects in the target origin that match the
     * <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify
     * the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>, specify
     * <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>
     * .
     * </p>
     * <p>
     * To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code> (if it's
     * currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the trusted signers
     * that you want to include in the updated distribution.
     * </p>
     * 
     * @param trustedSigners
     *        A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for
     *        private content.</p>
     *        <p>
     *        If you want to require signed URLs in requests for objects in the target origin that match the
     *        <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and
     *        specify the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see
     *        <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *        Private Content through CloudFront</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>,
     *        specify <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit
     *        <code>Items</code>.
     *        </p>
     *        <p>
     *        To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code>
     *        (if it's currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the
     *        trusted signers that you want to include in the updated distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehavior withTrustedSigners(TrustedSigners trustedSigners) {
        setTrustedSigners(trustedSigners);
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
     * For more information about requiring the HTTPS protocol, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an HTTPS
     * Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects' cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
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
     *        For more information about requiring the HTTPS protocol, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an
     *        HTTPS Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is
     *        never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we
     *        recommend that you clear your objects' cache because cached objects are protocol agnostic. That means that
     *        an edge location will return an object from the cache regardless of whether the current request protocol
     *        matches the protocol used previously. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *        Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *        Developer Guide</i>.
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
     * For more information about requiring the HTTPS protocol, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an HTTPS
     * Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects' cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
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
     *         For more information about requiring the HTTPS protocol, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an
     *         HTTPS Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is
     *         never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we
     *         recommend that you clear your objects' cache because cached objects are protocol agnostic. That means
     *         that an edge location will return an object from the cache regardless of whether the current request
     *         protocol matches the protocol used previously. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *         Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
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
     * For more information about requiring the HTTPS protocol, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an HTTPS
     * Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects' cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
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
     *        For more information about requiring the HTTPS protocol, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an
     *        HTTPS Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is
     *        never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we
     *        recommend that you clear your objects' cache because cached objects are protocol agnostic. That means that
     *        an edge location will return an object from the cache regardless of whether the current request protocol
     *        matches the protocol used previously. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *        Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *        Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewerProtocolPolicy
     */

    public CacheBehavior withViewerProtocolPolicy(String viewerProtocolPolicy) {
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
     * For more information about requiring the HTTPS protocol, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an HTTPS
     * Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects' cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
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
     *        For more information about requiring the HTTPS protocol, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an
     *        HTTPS Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is
     *        never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we
     *        recommend that you clear your objects' cache because cached objects are protocol agnostic. That means that
     *        an edge location will return an object from the cache regardless of whether the current request protocol
     *        matches the protocol used previously. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *        Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *        Developer Guide</i>.
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
     * For more information about requiring the HTTPS protocol, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an HTTPS
     * Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never
     * to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that
     * you clear your objects' cache because cached objects are protocol agnostic. That means that an edge location will
     * return an object from the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
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
     *        For more information about requiring the HTTPS protocol, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an
     *        HTTPS Connection to Access Your Objects</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is
     *        never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we
     *        recommend that you clear your objects' cache because cached objects are protocol agnostic. That means that
     *        an edge location will return an object from the cache regardless of whether the current request protocol
     *        matches the protocol used previously. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *        Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *        Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewerProtocolPolicy
     */

    public CacheBehavior withViewerProtocolPolicy(ViewerProtocolPolicy viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers to
     * your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     * <code>*</code> for <code>Name</code>).
     * </p>
     * 
     * @param minTTL
     *        The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. For more information, see
     *        <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *        Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon Amazon
     *        CloudFront Developer Guide</i>.</p>
     *        <p>
     *        You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers
     *        to your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     *        <code>*</code> for <code>Name</code>).
     */

    public void setMinTTL(Long minTTL) {
        this.minTTL = minTTL;
    }

    /**
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers to
     * your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     * <code>*</code> for <code>Name</code>).
     * </p>
     * 
     * @return The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *         another request to your origin to determine whether the object has been updated. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *         Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon Amazon
     *         CloudFront Developer Guide</i>.</p>
     *         <p>
     *         You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all
     *         headers to your origin (under <code>Headers</code>, if you specify <code>1</code> for
     *         <code>Quantity</code> and <code>*</code> for <code>Name</code>).
     */

    public Long getMinTTL() {
        return this.minTTL;
    }

    /**
     * <p>
     * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * <p>
     * You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers to
     * your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     * <code>*</code> for <code>Name</code>).
     * </p>
     * 
     * @param minTTL
     *        The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. For more information, see
     *        <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *        Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon Amazon
     *        CloudFront Developer Guide</i>.</p>
     *        <p>
     *        You must specify <code>0</code> for <code>MinTTL</code> if you configure CloudFront to forward all headers
     *        to your origin (under <code>Headers</code>, if you specify <code>1</code> for <code>Quantity</code> and
     *        <code>*</code> for <code>Name</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehavior withMinTTL(Long minTTL) {
        setMinTTL(minTTL);
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

    public CacheBehavior withAllowedMethods(AllowedMethods allowedMethods) {
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

    public CacheBehavior withSmoothStreaming(Boolean smoothStreaming) {
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
     * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * 
     * @param defaultTTL
     *        The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. The value that you
     *        specify applies only when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>
     *        , <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *        Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *        Developer Guide</i>.
     */

    public void setDefaultTTL(Long defaultTTL) {
        this.defaultTTL = defaultTTL;
    }

    /**
     * <p>
     * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * 
     * @return The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *         another request to your origin to determine whether the object has been updated. The value that you
     *         specify applies only when your origin does not add HTTP headers such as
     *         <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to
     *         objects. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *         Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     */

    public Long getDefaultTTL() {
        return this.defaultTTL;
    }

    /**
     * <p>
     * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * 
     * @param defaultTTL
     *        The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. The value that you
     *        specify applies only when your origin does not add HTTP headers such as <code>Cache-Control max-age</code>
     *        , <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *        Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *        Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehavior withDefaultTTL(Long defaultTTL) {
        setDefaultTTL(defaultTTL);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * 
     * @param maxTTL
     *        The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. The value that you
     *        specify applies only when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     *        <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *        Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *        Developer Guide</i>.
     */

    public void setMaxTTL(Long maxTTL) {
        this.maxTTL = maxTTL;
    }

    /**
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * 
     * @return The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *         another request to your origin to determine whether the object has been updated. The value that you
     *         specify applies only when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     *         <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *         Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *         Developer Guide</i>.
     */

    public Long getMaxTTL() {
        return this.maxTTL;
    }

    /**
     * <p>
     * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another
     * request to your origin to determine whether the object has been updated. The value that you specify applies only
     * when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How Long
     * Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * 
     * @param maxTTL
     *        The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards
     *        another request to your origin to determine whether the object has been updated. The value that you
     *        specify applies only when your origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     *        <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html">Specifying How
     *        Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration)</a> in the <i>Amazon CloudFront
     *        Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehavior withMaxTTL(Long maxTTL) {
        setMaxTTL(maxTTL);
        return this;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true;
     * if not, specify false. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html">Serving
     * Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param compress
     *        Whether you want CloudFront to automatically compress certain files for this cache behavior. If so,
     *        specify true; if not, specify false. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *        >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setCompress(Boolean compress) {
        this.compress = compress;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true;
     * if not, specify false. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html">Serving
     * Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return Whether you want CloudFront to automatically compress certain files for this cache behavior. If so,
     *         specify true; if not, specify false. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *         >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public Boolean getCompress() {
        return this.compress;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true;
     * if not, specify false. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html">Serving
     * Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param compress
     *        Whether you want CloudFront to automatically compress certain files for this cache behavior. If so,
     *        specify true; if not, specify false. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
     *        >Serving Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehavior withCompress(Boolean compress) {
        setCompress(compress);
        return this;
    }

    /**
     * <p>
     * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true;
     * if not, specify false. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html">Serving
     * Compressed Files</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return Whether you want CloudFront to automatically compress certain files for this cache behavior. If so,
     *         specify true; if not, specify false. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html"
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

    public CacheBehavior withLambdaFunctionAssociations(LambdaFunctionAssociations lambdaFunctionAssociations) {
        setLambdaFunctionAssociations(lambdaFunctionAssociations);
        return this;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use for
     * encrypting specific fields of data for a cache behavior or for the default cache behavior in your distribution.
     * </p>
     * 
     * @param fieldLevelEncryptionId
     *        The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use
     *        for encrypting specific fields of data for a cache behavior or for the default cache behavior in your
     *        distribution.
     */

    public void setFieldLevelEncryptionId(String fieldLevelEncryptionId) {
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use for
     * encrypting specific fields of data for a cache behavior or for the default cache behavior in your distribution.
     * </p>
     * 
     * @return The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use
     *         for encrypting specific fields of data for a cache behavior or for the default cache behavior in your
     *         distribution.
     */

    public String getFieldLevelEncryptionId() {
        return this.fieldLevelEncryptionId;
    }

    /**
     * <p>
     * The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use for
     * encrypting specific fields of data for a cache behavior or for the default cache behavior in your distribution.
     * </p>
     * 
     * @param fieldLevelEncryptionId
     *        The value of <code>ID</code> for the field-level encryption configuration that you want CloudFront to use
     *        for encrypting specific fields of data for a cache behavior or for the default cache behavior in your
     *        distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehavior withFieldLevelEncryptionId(String fieldLevelEncryptionId) {
        setFieldLevelEncryptionId(fieldLevelEncryptionId);
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
        if (getPathPattern() != null)
            sb.append("PathPattern: ").append(getPathPattern()).append(",");
        if (getTargetOriginId() != null)
            sb.append("TargetOriginId: ").append(getTargetOriginId()).append(",");
        if (getForwardedValues() != null)
            sb.append("ForwardedValues: ").append(getForwardedValues()).append(",");
        if (getTrustedSigners() != null)
            sb.append("TrustedSigners: ").append(getTrustedSigners()).append(",");
        if (getViewerProtocolPolicy() != null)
            sb.append("ViewerProtocolPolicy: ").append(getViewerProtocolPolicy()).append(",");
        if (getMinTTL() != null)
            sb.append("MinTTL: ").append(getMinTTL()).append(",");
        if (getAllowedMethods() != null)
            sb.append("AllowedMethods: ").append(getAllowedMethods()).append(",");
        if (getSmoothStreaming() != null)
            sb.append("SmoothStreaming: ").append(getSmoothStreaming()).append(",");
        if (getDefaultTTL() != null)
            sb.append("DefaultTTL: ").append(getDefaultTTL()).append(",");
        if (getMaxTTL() != null)
            sb.append("MaxTTL: ").append(getMaxTTL()).append(",");
        if (getCompress() != null)
            sb.append("Compress: ").append(getCompress()).append(",");
        if (getLambdaFunctionAssociations() != null)
            sb.append("LambdaFunctionAssociations: ").append(getLambdaFunctionAssociations()).append(",");
        if (getFieldLevelEncryptionId() != null)
            sb.append("FieldLevelEncryptionId: ").append(getFieldLevelEncryptionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheBehavior == false)
            return false;
        CacheBehavior other = (CacheBehavior) obj;
        if (other.getPathPattern() == null ^ this.getPathPattern() == null)
            return false;
        if (other.getPathPattern() != null && other.getPathPattern().equals(this.getPathPattern()) == false)
            return false;
        if (other.getTargetOriginId() == null ^ this.getTargetOriginId() == null)
            return false;
        if (other.getTargetOriginId() != null && other.getTargetOriginId().equals(this.getTargetOriginId()) == false)
            return false;
        if (other.getForwardedValues() == null ^ this.getForwardedValues() == null)
            return false;
        if (other.getForwardedValues() != null && other.getForwardedValues().equals(this.getForwardedValues()) == false)
            return false;
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null)
            return false;
        if (other.getTrustedSigners() != null && other.getTrustedSigners().equals(this.getTrustedSigners()) == false)
            return false;
        if (other.getViewerProtocolPolicy() == null ^ this.getViewerProtocolPolicy() == null)
            return false;
        if (other.getViewerProtocolPolicy() != null && other.getViewerProtocolPolicy().equals(this.getViewerProtocolPolicy()) == false)
            return false;
        if (other.getMinTTL() == null ^ this.getMinTTL() == null)
            return false;
        if (other.getMinTTL() != null && other.getMinTTL().equals(this.getMinTTL()) == false)
            return false;
        if (other.getAllowedMethods() == null ^ this.getAllowedMethods() == null)
            return false;
        if (other.getAllowedMethods() != null && other.getAllowedMethods().equals(this.getAllowedMethods()) == false)
            return false;
        if (other.getSmoothStreaming() == null ^ this.getSmoothStreaming() == null)
            return false;
        if (other.getSmoothStreaming() != null && other.getSmoothStreaming().equals(this.getSmoothStreaming()) == false)
            return false;
        if (other.getDefaultTTL() == null ^ this.getDefaultTTL() == null)
            return false;
        if (other.getDefaultTTL() != null && other.getDefaultTTL().equals(this.getDefaultTTL()) == false)
            return false;
        if (other.getMaxTTL() == null ^ this.getMaxTTL() == null)
            return false;
        if (other.getMaxTTL() != null && other.getMaxTTL().equals(this.getMaxTTL()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPathPattern() == null) ? 0 : getPathPattern().hashCode());
        hashCode = prime * hashCode + ((getTargetOriginId() == null) ? 0 : getTargetOriginId().hashCode());
        hashCode = prime * hashCode + ((getForwardedValues() == null) ? 0 : getForwardedValues().hashCode());
        hashCode = prime * hashCode + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode());
        hashCode = prime * hashCode + ((getViewerProtocolPolicy() == null) ? 0 : getViewerProtocolPolicy().hashCode());
        hashCode = prime * hashCode + ((getMinTTL() == null) ? 0 : getMinTTL().hashCode());
        hashCode = prime * hashCode + ((getAllowedMethods() == null) ? 0 : getAllowedMethods().hashCode());
        hashCode = prime * hashCode + ((getSmoothStreaming() == null) ? 0 : getSmoothStreaming().hashCode());
        hashCode = prime * hashCode + ((getDefaultTTL() == null) ? 0 : getDefaultTTL().hashCode());
        hashCode = prime * hashCode + ((getMaxTTL() == null) ? 0 : getMaxTTL().hashCode());
        hashCode = prime * hashCode + ((getCompress() == null) ? 0 : getCompress().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionAssociations() == null) ? 0 : getLambdaFunctionAssociations().hashCode());
        hashCode = prime * hashCode + ((getFieldLevelEncryptionId() == null) ? 0 : getFieldLevelEncryptionId().hashCode());
        return hashCode;
    }

    @Override
    public CacheBehavior clone() {
        try {
            return (CacheBehavior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
