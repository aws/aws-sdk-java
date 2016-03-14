/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * A complex type that describes how CloudFront processes requests. You can
 * create up to 10 cache behaviors.You must create at least as many cache
 * behaviors (including the default cache behavior) as you have origins if you
 * want CloudFront to distribute objects from all of the origins. Each cache
 * behavior specifies the one origin from which you want CloudFront to get
 * objects. If you have two origins and only the default cache behavior, the
 * default cache behavior will cause CloudFront to get objects from one of the
 * origins, but the other origin will never be used. If you don't want to
 * specify any cache behaviors, include only an empty CacheBehaviors element.
 * Don't include an empty CacheBehavior element, or CloudFront returns a
 * MalformedXML error. To delete all cache behaviors in an existing
 * distribution, update the distribution configuration and include only an empty
 * CacheBehaviors element. To add, change, or remove one or more cache
 * behaviors, update the distribution configuration and specify all of the cache
 * behaviors that you want to include in the updated distribution.
 */
public class CacheBehavior implements Serializable, Cloneable {

    /**
     * The pattern (for example, images/*.jpg) that specifies which requests you
     * want this cache behavior to apply to. When CloudFront receives an
     * end-user request, the requested path is compared with path patterns in the
     * order in which cache behaviors are listed in the distribution. The path
     * pattern for the default cache behavior is * and cannot be changed. If the
     * request for an object does not match the path pattern for any cache
     * behaviors, CloudFront applies the behavior in the default cache behavior.
     */
    private String pathPattern;
    /**
     * The value of ID for the origin that you want CloudFront to route requests
     * to when a request matches the path pattern either for a cache behavior or
     * for the default cache behavior.
     */
    private String targetOriginId;
    /**
     * A complex type that specifies how CloudFront handles query strings,
     * cookies and headers.
     */
    private ForwardedValues forwardedValues;
    /**
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content. If you want to require
     * signed URLs in requests for objects in the target origin that match the
     * PathPattern for this cache behavior, specify true for Enabled, and specify
     * the applicable values for Quantity and Items. For more information, go to
     * Using a Signed URL to Serve Private Content in the Amazon CloudFront
     * Developer Guide. If you don't want to require signed URLs in requests for
     * objects that match PathPattern, specify false for Enabled and 0 for
     * Quantity. Omit Items. To add, change, or remove one or more trusted
     * signers, change Enabled to true (if it's currently false), change Quantity
     * as applicable, and specify all of the trusted signers that you want to
     * include in the updated distribution.
     */
    private TrustedSigners trustedSigners;
    /**
     * Use this element to specify the protocol that users can use to access the
     * files in the origin specified by TargetOriginId when a request matches
     * the path pattern in PathPattern. If you want CloudFront to allow end users
     * to use any available protocol, specify allow-all. If you want CloudFront
     * to require HTTPS, specify https. If you want CloudFront to respond to an
     * HTTP request with an HTTP status code of 301 (Moved Permanently) and the
     * HTTPS URL, specify redirect-to-https. The viewer then resubmits the
     * request using the HTTPS URL.
     */
    private String viewerProtocolPolicy;
    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000 seconds
     * (100 years).
     */
    private Long minTTL;

    private AllowedMethods allowedMethods;
    /**
     * Indicates whether you want to distribute media files in Microsoft Smooth
     * Streaming format using the origin that is associated with this cache
     * behavior. If so, specify true; if not, specify false.
     */
    private Boolean smoothStreaming;
    /**
     * If you don't configure your origin to add a Cache-Control max-age
     * directive or an Expires header, DefaultTTL is the default amount of time
     * (in seconds) that an object is in a CloudFront cache before CloudFront
     * forwards another request to your origin to determine whether the object
     * has been updated. The value that you specify applies only when your origin
     * does not add HTTP headers such as Cache-Control max-age, Cache-Control
     * s-maxage, and Expires to objects. You can specify a value from 0 to
     * 3,153,600,000 seconds (100 years).
     */
    private Long defaultTTL;
    /**
     * The maximum amount of time (in seconds) that an object is in a CloudFront
     * cache before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin adds HTTP headers such as Cache-Control
     * max-age, Cache-Control s-maxage, and Expires to objects. You can specify a
     * value from 0 to 3,153,600,000 seconds (100 years).
     */
    private Long maxTTL;
    /**
     * Whether you want CloudFront to automatically compress content for web
     * requests that include Accept-Encoding: gzip in the request header. If so,
     * specify true; if not, specify false. CloudFront compresses files larger
     * than 1000 bytes and less than 1 megabyte for both Amazon S3 and custom
     * origins. When a CloudFront edge location is unusually busy, some files
     * might not be compressed. The value of the Content-Type header must be on
     * the list of file types that CloudFront will compress. For the current
     * list, see <a
     * href="http://docs.aws.amazon.com/console/cloudfront/compressed-content"
     * >Serving Compressed Content</a> in the Amazon CloudFront Developer Guide.
     * If you configure CloudFront to compress content, CloudFront removes the
     * ETag response header from the objects that it compresses. The ETag header
     * indicates that the version in a CloudFront edge cache is identical to the
     * version on the origin server, but after compression the two versions are
     * no longer identical. As a result, for compressed objects, CloudFront can't
     * use the ETag header to determine whether an expired object in the
     * CloudFront edge cache is still the latest version.
     */
    private Boolean compress;

    /**
     * The pattern (for example, images/*.jpg) that specifies which requests you
     * want this cache behavior to apply to. When CloudFront receives an
     * end-user request, the requested path is compared with path patterns in the
     * order in which cache behaviors are listed in the distribution. The path
     * pattern for the default cache behavior is * and cannot be changed. If the
     * request for an object does not match the path pattern for any cache
     * behaviors, CloudFront applies the behavior in the default cache behavior.
     * 
     * @param pathPattern
     *        The pattern (for example, images/*.jpg) that specifies which
     *        requests you want this cache behavior to apply to. When CloudFront
     *        receives an end-user request, the requested path is compared with
     *        path patterns in the order in which cache behaviors are listed in
     *        the distribution. The path pattern for the default cache behavior
     *        is * and cannot be changed. If the request for an object does not
     *        match the path pattern for any cache behaviors, CloudFront applies
     *        the behavior in the default cache behavior.
     */

    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    /**
     * The pattern (for example, images/*.jpg) that specifies which requests you
     * want this cache behavior to apply to. When CloudFront receives an
     * end-user request, the requested path is compared with path patterns in the
     * order in which cache behaviors are listed in the distribution. The path
     * pattern for the default cache behavior is * and cannot be changed. If the
     * request for an object does not match the path pattern for any cache
     * behaviors, CloudFront applies the behavior in the default cache behavior.
     * 
     * @return The pattern (for example, images/*.jpg) that specifies which
     *         requests you want this cache behavior to apply to. When
     *         CloudFront receives an end-user request, the requested path is
     *         compared with path patterns in the order in which cache behaviors
     *         are listed in the distribution. The path pattern for the default
     *         cache behavior is * and cannot be changed. If the request for an
     *         object does not match the path pattern for any cache behaviors,
     *         CloudFront applies the behavior in the default cache behavior.
     */

    public String getPathPattern() {
        return this.pathPattern;
    }

    /**
     * The pattern (for example, images/*.jpg) that specifies which requests you
     * want this cache behavior to apply to. When CloudFront receives an
     * end-user request, the requested path is compared with path patterns in the
     * order in which cache behaviors are listed in the distribution. The path
     * pattern for the default cache behavior is * and cannot be changed. If the
     * request for an object does not match the path pattern for any cache
     * behaviors, CloudFront applies the behavior in the default cache behavior.
     * 
     * @param pathPattern
     *        The pattern (for example, images/*.jpg) that specifies which
     *        requests you want this cache behavior to apply to. When CloudFront
     *        receives an end-user request, the requested path is compared with
     *        path patterns in the order in which cache behaviors are listed in
     *        the distribution. The path pattern for the default cache behavior
     *        is * and cannot be changed. If the request for an object does not
     *        match the path pattern for any cache behaviors, CloudFront applies
     *        the behavior in the default cache behavior.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CacheBehavior withPathPattern(String pathPattern) {
        setPathPattern(pathPattern);
        return this;
    }

    /**
     * The value of ID for the origin that you want CloudFront to route requests
     * to when a request matches the path pattern either for a cache behavior or
     * for the default cache behavior.
     * 
     * @param targetOriginId
     *        The value of ID for the origin that you want CloudFront to route
     *        requests to when a request matches the path pattern either for a
     *        cache behavior or for the default cache behavior.
     */

    public void setTargetOriginId(String targetOriginId) {
        this.targetOriginId = targetOriginId;
    }

    /**
     * The value of ID for the origin that you want CloudFront to route requests
     * to when a request matches the path pattern either for a cache behavior or
     * for the default cache behavior.
     * 
     * @return The value of ID for the origin that you want CloudFront to route
     *         requests to when a request matches the path pattern either for a
     *         cache behavior or for the default cache behavior.
     */

    public String getTargetOriginId() {
        return this.targetOriginId;
    }

    /**
     * The value of ID for the origin that you want CloudFront to route requests
     * to when a request matches the path pattern either for a cache behavior or
     * for the default cache behavior.
     * 
     * @param targetOriginId
     *        The value of ID for the origin that you want CloudFront to route
     *        requests to when a request matches the path pattern either for a
     *        cache behavior or for the default cache behavior.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CacheBehavior withTargetOriginId(String targetOriginId) {
        setTargetOriginId(targetOriginId);
        return this;
    }

    /**
     * A complex type that specifies how CloudFront handles query strings,
     * cookies and headers.
     * 
     * @param forwardedValues
     *        A complex type that specifies how CloudFront handles query
     *        strings, cookies and headers.
     */

    public void setForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
    }

    /**
     * A complex type that specifies how CloudFront handles query strings,
     * cookies and headers.
     * 
     * @return A complex type that specifies how CloudFront handles query
     *         strings, cookies and headers.
     */

    public ForwardedValues getForwardedValues() {
        return this.forwardedValues;
    }

    /**
     * A complex type that specifies how CloudFront handles query strings,
     * cookies and headers.
     * 
     * @param forwardedValues
     *        A complex type that specifies how CloudFront handles query
     *        strings, cookies and headers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CacheBehavior withForwardedValues(ForwardedValues forwardedValues) {
        setForwardedValues(forwardedValues);
        return this;
    }

    /**
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content. If you want to require
     * signed URLs in requests for objects in the target origin that match the
     * PathPattern for this cache behavior, specify true for Enabled, and specify
     * the applicable values for Quantity and Items. For more information, go to
     * Using a Signed URL to Serve Private Content in the Amazon CloudFront
     * Developer Guide. If you don't want to require signed URLs in requests for
     * objects that match PathPattern, specify false for Enabled and 0 for
     * Quantity. Omit Items. To add, change, or remove one or more trusted
     * signers, change Enabled to true (if it's currently false), change Quantity
     * as applicable, and specify all of the trusted signers that you want to
     * include in the updated distribution.
     * 
     * @param trustedSigners
     *        A complex type that specifies the AWS accounts, if any, that you
     *        want to allow to create signed URLs for private content. If you
     *        want to require signed URLs in requests for objects in the target
     *        origin that match the PathPattern for this cache behavior, specify
     *        true for Enabled, and specify the applicable values for Quantity
     *        and Items. For more information, go to Using a Signed URL to Serve
     *        Private Content in the Amazon CloudFront Developer Guide. If you
     *        don't want to require signed URLs in requests for objects that
     *        match PathPattern, specify false for Enabled and 0 for Quantity.
     *        Omit Items. To add, change, or remove one or more trusted signers,
     *        change Enabled to true (if it's currently false), change Quantity
     *        as applicable, and specify all of the trusted signers that you
     *        want to include in the updated distribution.
     */

    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    /**
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content. If you want to require
     * signed URLs in requests for objects in the target origin that match the
     * PathPattern for this cache behavior, specify true for Enabled, and specify
     * the applicable values for Quantity and Items. For more information, go to
     * Using a Signed URL to Serve Private Content in the Amazon CloudFront
     * Developer Guide. If you don't want to require signed URLs in requests for
     * objects that match PathPattern, specify false for Enabled and 0 for
     * Quantity. Omit Items. To add, change, or remove one or more trusted
     * signers, change Enabled to true (if it's currently false), change Quantity
     * as applicable, and specify all of the trusted signers that you want to
     * include in the updated distribution.
     * 
     * @return A complex type that specifies the AWS accounts, if any, that you
     *         want to allow to create signed URLs for private content. If you
     *         want to require signed URLs in requests for objects in the target
     *         origin that match the PathPattern for this cache behavior,
     *         specify true for Enabled, and specify the applicable values for
     *         Quantity and Items. For more information, go to Using a Signed
     *         URL to Serve Private Content in the Amazon CloudFront Developer
     *         Guide. If you don't want to require signed URLs in requests for
     *         objects that match PathPattern, specify false for Enabled and 0
     *         for Quantity. Omit Items. To add, change, or remove one or more
     *         trusted signers, change Enabled to true (if it's currently
     *         false), change Quantity as applicable, and specify all of the
     *         trusted signers that you want to include in the updated
     *         distribution.
     */

    public TrustedSigners getTrustedSigners() {
        return this.trustedSigners;
    }

    /**
     * A complex type that specifies the AWS accounts, if any, that you want to
     * allow to create signed URLs for private content. If you want to require
     * signed URLs in requests for objects in the target origin that match the
     * PathPattern for this cache behavior, specify true for Enabled, and specify
     * the applicable values for Quantity and Items. For more information, go to
     * Using a Signed URL to Serve Private Content in the Amazon CloudFront
     * Developer Guide. If you don't want to require signed URLs in requests for
     * objects that match PathPattern, specify false for Enabled and 0 for
     * Quantity. Omit Items. To add, change, or remove one or more trusted
     * signers, change Enabled to true (if it's currently false), change Quantity
     * as applicable, and specify all of the trusted signers that you want to
     * include in the updated distribution.
     * 
     * @param trustedSigners
     *        A complex type that specifies the AWS accounts, if any, that you
     *        want to allow to create signed URLs for private content. If you
     *        want to require signed URLs in requests for objects in the target
     *        origin that match the PathPattern for this cache behavior, specify
     *        true for Enabled, and specify the applicable values for Quantity
     *        and Items. For more information, go to Using a Signed URL to Serve
     *        Private Content in the Amazon CloudFront Developer Guide. If you
     *        don't want to require signed URLs in requests for objects that
     *        match PathPattern, specify false for Enabled and 0 for Quantity.
     *        Omit Items. To add, change, or remove one or more trusted signers,
     *        change Enabled to true (if it's currently false), change Quantity
     *        as applicable, and specify all of the trusted signers that you
     *        want to include in the updated distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CacheBehavior withTrustedSigners(TrustedSigners trustedSigners) {
        setTrustedSigners(trustedSigners);
        return this;
    }

    /**
     * Use this element to specify the protocol that users can use to access the
     * files in the origin specified by TargetOriginId when a request matches
     * the path pattern in PathPattern. If you want CloudFront to allow end users
     * to use any available protocol, specify allow-all. If you want CloudFront
     * to require HTTPS, specify https. If you want CloudFront to respond to an
     * HTTP request with an HTTP status code of 301 (Moved Permanently) and the
     * HTTPS URL, specify redirect-to-https. The viewer then resubmits the
     * request using the HTTPS URL.
     * 
     * @param viewerProtocolPolicy
     *        Use this element to specify the protocol that users can use to
     *        access the files in the origin specified by TargetOriginId when a
     *        request matches the path pattern in PathPattern. If you want
     *        CloudFront to allow end users to use any available protocol,
     *        specify allow-all. If you want CloudFront to require HTTPS,
     *        specify https. If you want CloudFront to respond to an HTTP
     *        request with an HTTP status code of 301 (Moved Permanently) and
     *        the HTTPS URL, specify redirect-to-https. The viewer then
     *        resubmits the request using the HTTPS URL.
     * @see ViewerProtocolPolicy
     */

    public void setViewerProtocolPolicy(String viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
    }

    /**
     * Use this element to specify the protocol that users can use to access the
     * files in the origin specified by TargetOriginId when a request matches
     * the path pattern in PathPattern. If you want CloudFront to allow end users
     * to use any available protocol, specify allow-all. If you want CloudFront
     * to require HTTPS, specify https. If you want CloudFront to respond to an
     * HTTP request with an HTTP status code of 301 (Moved Permanently) and the
     * HTTPS URL, specify redirect-to-https. The viewer then resubmits the
     * request using the HTTPS URL.
     * 
     * @return Use this element to specify the protocol that users can use to
     *         access the files in the origin specified by TargetOriginId when a
     *         request matches the path pattern in PathPattern. If you want
     *         CloudFront to allow end users to use any available protocol,
     *         specify allow-all. If you want CloudFront to require HTTPS,
     *         specify https. If you want CloudFront to respond to an HTTP
     *         request with an HTTP status code of 301 (Moved Permanently) and
     *         the HTTPS URL, specify redirect-to-https. The viewer then
     *         resubmits the request using the HTTPS URL.
     * @see ViewerProtocolPolicy
     */

    public String getViewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    /**
     * Use this element to specify the protocol that users can use to access the
     * files in the origin specified by TargetOriginId when a request matches
     * the path pattern in PathPattern. If you want CloudFront to allow end users
     * to use any available protocol, specify allow-all. If you want CloudFront
     * to require HTTPS, specify https. If you want CloudFront to respond to an
     * HTTP request with an HTTP status code of 301 (Moved Permanently) and the
     * HTTPS URL, specify redirect-to-https. The viewer then resubmits the
     * request using the HTTPS URL.
     * 
     * @param viewerProtocolPolicy
     *        Use this element to specify the protocol that users can use to
     *        access the files in the origin specified by TargetOriginId when a
     *        request matches the path pattern in PathPattern. If you want
     *        CloudFront to allow end users to use any available protocol,
     *        specify allow-all. If you want CloudFront to require HTTPS,
     *        specify https. If you want CloudFront to respond to an HTTP
     *        request with an HTTP status code of 301 (Moved Permanently) and
     *        the HTTPS URL, specify redirect-to-https. The viewer then
     *        resubmits the request using the HTTPS URL.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ViewerProtocolPolicy
     */

    public CacheBehavior withViewerProtocolPolicy(String viewerProtocolPolicy) {
        setViewerProtocolPolicy(viewerProtocolPolicy);
        return this;
    }

    /**
     * Use this element to specify the protocol that users can use to access the
     * files in the origin specified by TargetOriginId when a request matches
     * the path pattern in PathPattern. If you want CloudFront to allow end users
     * to use any available protocol, specify allow-all. If you want CloudFront
     * to require HTTPS, specify https. If you want CloudFront to respond to an
     * HTTP request with an HTTP status code of 301 (Moved Permanently) and the
     * HTTPS URL, specify redirect-to-https. The viewer then resubmits the
     * request using the HTTPS URL.
     * 
     * @param viewerProtocolPolicy
     *        Use this element to specify the protocol that users can use to
     *        access the files in the origin specified by TargetOriginId when a
     *        request matches the path pattern in PathPattern. If you want
     *        CloudFront to allow end users to use any available protocol,
     *        specify allow-all. If you want CloudFront to require HTTPS,
     *        specify https. If you want CloudFront to respond to an HTTP
     *        request with an HTTP status code of 301 (Moved Permanently) and
     *        the HTTPS URL, specify redirect-to-https. The viewer then
     *        resubmits the request using the HTTPS URL.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ViewerProtocolPolicy
     */

    public void setViewerProtocolPolicy(
            ViewerProtocolPolicy viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy.toString();
    }

    /**
     * Use this element to specify the protocol that users can use to access the
     * files in the origin specified by TargetOriginId when a request matches
     * the path pattern in PathPattern. If you want CloudFront to allow end users
     * to use any available protocol, specify allow-all. If you want CloudFront
     * to require HTTPS, specify https. If you want CloudFront to respond to an
     * HTTP request with an HTTP status code of 301 (Moved Permanently) and the
     * HTTPS URL, specify redirect-to-https. The viewer then resubmits the
     * request using the HTTPS URL.
     * 
     * @param viewerProtocolPolicy
     *        Use this element to specify the protocol that users can use to
     *        access the files in the origin specified by TargetOriginId when a
     *        request matches the path pattern in PathPattern. If you want
     *        CloudFront to allow end users to use any available protocol,
     *        specify allow-all. If you want CloudFront to require HTTPS,
     *        specify https. If you want CloudFront to respond to an HTTP
     *        request with an HTTP status code of 301 (Moved Permanently) and
     *        the HTTPS URL, specify redirect-to-https. The viewer then
     *        resubmits the request using the HTTPS URL.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ViewerProtocolPolicy
     */

    public CacheBehavior withViewerProtocolPolicy(
            ViewerProtocolPolicy viewerProtocolPolicy) {
        setViewerProtocolPolicy(viewerProtocolPolicy);
        return this;
    }

    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000 seconds
     * (100 years).
     * 
     * @param minTTL
     *        The minimum amount of time that you want objects to stay in
     *        CloudFront caches before CloudFront queries your origin to see
     *        whether the object has been updated.You can specify a value from 0
     *        to 3,153,600,000 seconds (100 years).
     */

    public void setMinTTL(Long minTTL) {
        this.minTTL = minTTL;
    }

    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000 seconds
     * (100 years).
     * 
     * @return The minimum amount of time that you want objects to stay in
     *         CloudFront caches before CloudFront queries your origin to see
     *         whether the object has been updated.You can specify a value from
     *         0 to 3,153,600,000 seconds (100 years).
     */

    public Long getMinTTL() {
        return this.minTTL;
    }

    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000 seconds
     * (100 years).
     * 
     * @param minTTL
     *        The minimum amount of time that you want objects to stay in
     *        CloudFront caches before CloudFront queries your origin to see
     *        whether the object has been updated.You can specify a value from 0
     *        to 3,153,600,000 seconds (100 years).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CacheBehavior withAllowedMethods(AllowedMethods allowedMethods) {
        setAllowedMethods(allowedMethods);
        return this;
    }

    /**
     * Indicates whether you want to distribute media files in Microsoft Smooth
     * Streaming format using the origin that is associated with this cache
     * behavior. If so, specify true; if not, specify false.
     * 
     * @param smoothStreaming
     *        Indicates whether you want to distribute media files in Microsoft
     *        Smooth Streaming format using the origin that is associated with
     *        this cache behavior. If so, specify true; if not, specify false.
     */

    public void setSmoothStreaming(Boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
    }

    /**
     * Indicates whether you want to distribute media files in Microsoft Smooth
     * Streaming format using the origin that is associated with this cache
     * behavior. If so, specify true; if not, specify false.
     * 
     * @return Indicates whether you want to distribute media files in Microsoft
     *         Smooth Streaming format using the origin that is associated with
     *         this cache behavior. If so, specify true; if not, specify false.
     */

    public Boolean getSmoothStreaming() {
        return this.smoothStreaming;
    }

    /**
     * Indicates whether you want to distribute media files in Microsoft Smooth
     * Streaming format using the origin that is associated with this cache
     * behavior. If so, specify true; if not, specify false.
     * 
     * @param smoothStreaming
     *        Indicates whether you want to distribute media files in Microsoft
     *        Smooth Streaming format using the origin that is associated with
     *        this cache behavior. If so, specify true; if not, specify false.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CacheBehavior withSmoothStreaming(Boolean smoothStreaming) {
        setSmoothStreaming(smoothStreaming);
        return this;
    }

    /**
     * Indicates whether you want to distribute media files in Microsoft Smooth
     * Streaming format using the origin that is associated with this cache
     * behavior. If so, specify true; if not, specify false.
     * 
     * @return Indicates whether you want to distribute media files in Microsoft
     *         Smooth Streaming format using the origin that is associated with
     *         this cache behavior. If so, specify true; if not, specify false.
     */

    public Boolean isSmoothStreaming() {
        return this.smoothStreaming;
    }

    /**
     * If you don't configure your origin to add a Cache-Control max-age
     * directive or an Expires header, DefaultTTL is the default amount of time
     * (in seconds) that an object is in a CloudFront cache before CloudFront
     * forwards another request to your origin to determine whether the object
     * has been updated. The value that you specify applies only when your origin
     * does not add HTTP headers such as Cache-Control max-age, Cache-Control
     * s-maxage, and Expires to objects. You can specify a value from 0 to
     * 3,153,600,000 seconds (100 years).
     * 
     * @param defaultTTL
     *        If you don't configure your origin to add a Cache-Control max-age
     *        directive or an Expires header, DefaultTTL is the default amount
     *        of time (in seconds) that an object is in a CloudFront cache
     *        before CloudFront forwards another request to your origin to
     *        determine whether the object has been updated. The value that you
     *        specify applies only when your origin does not add HTTP headers
     *        such as Cache-Control max-age, Cache-Control s-maxage, and Expires
     *        to objects. You can specify a value from 0 to 3,153,600,000
     *        seconds (100 years).
     */

    public void setDefaultTTL(Long defaultTTL) {
        this.defaultTTL = defaultTTL;
    }

    /**
     * If you don't configure your origin to add a Cache-Control max-age
     * directive or an Expires header, DefaultTTL is the default amount of time
     * (in seconds) that an object is in a CloudFront cache before CloudFront
     * forwards another request to your origin to determine whether the object
     * has been updated. The value that you specify applies only when your origin
     * does not add HTTP headers such as Cache-Control max-age, Cache-Control
     * s-maxage, and Expires to objects. You can specify a value from 0 to
     * 3,153,600,000 seconds (100 years).
     * 
     * @return If you don't configure your origin to add a Cache-Control max-age
     *         directive or an Expires header, DefaultTTL is the default amount
     *         of time (in seconds) that an object is in a CloudFront cache
     *         before CloudFront forwards another request to your origin to
     *         determine whether the object has been updated. The value that you
     *         specify applies only when your origin does not add HTTP headers
     *         such as Cache-Control max-age, Cache-Control s-maxage, and
     *         Expires to objects. You can specify a value from 0 to
     *         3,153,600,000 seconds (100 years).
     */

    public Long getDefaultTTL() {
        return this.defaultTTL;
    }

    /**
     * If you don't configure your origin to add a Cache-Control max-age
     * directive or an Expires header, DefaultTTL is the default amount of time
     * (in seconds) that an object is in a CloudFront cache before CloudFront
     * forwards another request to your origin to determine whether the object
     * has been updated. The value that you specify applies only when your origin
     * does not add HTTP headers such as Cache-Control max-age, Cache-Control
     * s-maxage, and Expires to objects. You can specify a value from 0 to
     * 3,153,600,000 seconds (100 years).
     * 
     * @param defaultTTL
     *        If you don't configure your origin to add a Cache-Control max-age
     *        directive or an Expires header, DefaultTTL is the default amount
     *        of time (in seconds) that an object is in a CloudFront cache
     *        before CloudFront forwards another request to your origin to
     *        determine whether the object has been updated. The value that you
     *        specify applies only when your origin does not add HTTP headers
     *        such as Cache-Control max-age, Cache-Control s-maxage, and Expires
     *        to objects. You can specify a value from 0 to 3,153,600,000
     *        seconds (100 years).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CacheBehavior withDefaultTTL(Long defaultTTL) {
        setDefaultTTL(defaultTTL);
        return this;
    }

    /**
     * The maximum amount of time (in seconds) that an object is in a CloudFront
     * cache before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin adds HTTP headers such as Cache-Control
     * max-age, Cache-Control s-maxage, and Expires to objects. You can specify a
     * value from 0 to 3,153,600,000 seconds (100 years).
     * 
     * @param maxTTL
     *        The maximum amount of time (in seconds) that an object is in a
     *        CloudFront cache before CloudFront forwards another request to
     *        your origin to determine whether the object has been updated. The
     *        value that you specify applies only when your origin adds HTTP
     *        headers such as Cache-Control max-age, Cache-Control s-maxage, and
     *        Expires to objects. You can specify a value from 0 to
     *        3,153,600,000 seconds (100 years).
     */

    public void setMaxTTL(Long maxTTL) {
        this.maxTTL = maxTTL;
    }

    /**
     * The maximum amount of time (in seconds) that an object is in a CloudFront
     * cache before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin adds HTTP headers such as Cache-Control
     * max-age, Cache-Control s-maxage, and Expires to objects. You can specify a
     * value from 0 to 3,153,600,000 seconds (100 years).
     * 
     * @return The maximum amount of time (in seconds) that an object is in a
     *         CloudFront cache before CloudFront forwards another request to
     *         your origin to determine whether the object has been updated. The
     *         value that you specify applies only when your origin adds HTTP
     *         headers such as Cache-Control max-age, Cache-Control s-maxage,
     *         and Expires to objects. You can specify a value from 0 to
     *         3,153,600,000 seconds (100 years).
     */

    public Long getMaxTTL() {
        return this.maxTTL;
    }

    /**
     * The maximum amount of time (in seconds) that an object is in a CloudFront
     * cache before CloudFront forwards another request to your origin to
     * determine whether the object has been updated. The value that you specify
     * applies only when your origin adds HTTP headers such as Cache-Control
     * max-age, Cache-Control s-maxage, and Expires to objects. You can specify a
     * value from 0 to 3,153,600,000 seconds (100 years).
     * 
     * @param maxTTL
     *        The maximum amount of time (in seconds) that an object is in a
     *        CloudFront cache before CloudFront forwards another request to
     *        your origin to determine whether the object has been updated. The
     *        value that you specify applies only when your origin adds HTTP
     *        headers such as Cache-Control max-age, Cache-Control s-maxage, and
     *        Expires to objects. You can specify a value from 0 to
     *        3,153,600,000 seconds (100 years).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CacheBehavior withMaxTTL(Long maxTTL) {
        setMaxTTL(maxTTL);
        return this;
    }

    /**
     * Whether you want CloudFront to automatically compress content for web
     * requests that include Accept-Encoding: gzip in the request header. If so,
     * specify true; if not, specify false. CloudFront compresses files larger
     * than 1000 bytes and less than 1 megabyte for both Amazon S3 and custom
     * origins. When a CloudFront edge location is unusually busy, some files
     * might not be compressed. The value of the Content-Type header must be on
     * the list of file types that CloudFront will compress. For the current
     * list, see <a
     * href="http://docs.aws.amazon.com/console/cloudfront/compressed-content"
     * >Serving Compressed Content</a> in the Amazon CloudFront Developer Guide.
     * If you configure CloudFront to compress content, CloudFront removes the
     * ETag response header from the objects that it compresses. The ETag header
     * indicates that the version in a CloudFront edge cache is identical to the
     * version on the origin server, but after compression the two versions are
     * no longer identical. As a result, for compressed objects, CloudFront can't
     * use the ETag header to determine whether an expired object in the
     * CloudFront edge cache is still the latest version.
     * 
     * @param compress
     *        Whether you want CloudFront to automatically compress content for
     *        web requests that include Accept-Encoding: gzip in the request
     *        header. If so, specify true; if not, specify false. CloudFront
     *        compresses files larger than 1000 bytes and less than 1 megabyte
     *        for both Amazon S3 and custom origins. When a CloudFront edge
     *        location is unusually busy, some files might not be compressed.
     *        The value of the Content-Type header must be on the list of file
     *        types that CloudFront will compress. For the current list, see <a
     *        href=
     *        "http://docs.aws.amazon.com/console/cloudfront/compressed-content"
     *        >Serving Compressed Content</a> in the Amazon CloudFront Developer
     *        Guide. If you configure CloudFront to compress content, CloudFront
     *        removes the ETag response header from the objects that it
     *        compresses. The ETag header indicates that the version in a
     *        CloudFront edge cache is identical to the version on the origin
     *        server, but after compression the two versions are no longer
     *        identical. As a result, for compressed objects, CloudFront can't
     *        use the ETag header to determine whether an expired object in the
     *        CloudFront edge cache is still the latest version.
     */

    public void setCompress(Boolean compress) {
        this.compress = compress;
    }

    /**
     * Whether you want CloudFront to automatically compress content for web
     * requests that include Accept-Encoding: gzip in the request header. If so,
     * specify true; if not, specify false. CloudFront compresses files larger
     * than 1000 bytes and less than 1 megabyte for both Amazon S3 and custom
     * origins. When a CloudFront edge location is unusually busy, some files
     * might not be compressed. The value of the Content-Type header must be on
     * the list of file types that CloudFront will compress. For the current
     * list, see <a
     * href="http://docs.aws.amazon.com/console/cloudfront/compressed-content"
     * >Serving Compressed Content</a> in the Amazon CloudFront Developer Guide.
     * If you configure CloudFront to compress content, CloudFront removes the
     * ETag response header from the objects that it compresses. The ETag header
     * indicates that the version in a CloudFront edge cache is identical to the
     * version on the origin server, but after compression the two versions are
     * no longer identical. As a result, for compressed objects, CloudFront can't
     * use the ETag header to determine whether an expired object in the
     * CloudFront edge cache is still the latest version.
     * 
     * @return Whether you want CloudFront to automatically compress content for
     *         web requests that include Accept-Encoding: gzip in the request
     *         header. If so, specify true; if not, specify false. CloudFront
     *         compresses files larger than 1000 bytes and less than 1 megabyte
     *         for both Amazon S3 and custom origins. When a CloudFront edge
     *         location is unusually busy, some files might not be compressed.
     *         The value of the Content-Type header must be on the list of file
     *         types that CloudFront will compress. For the current list, see <a
     *         href=
     *         "http://docs.aws.amazon.com/console/cloudfront/compressed-content"
     *         >Serving Compressed Content</a> in the Amazon CloudFront
     *         Developer Guide. If you configure CloudFront to compress content,
     *         CloudFront removes the ETag response header from the objects that
     *         it compresses. The ETag header indicates that the version in a
     *         CloudFront edge cache is identical to the version on the origin
     *         server, but after compression the two versions are no longer
     *         identical. As a result, for compressed objects, CloudFront can't
     *         use the ETag header to determine whether an expired object in the
     *         CloudFront edge cache is still the latest version.
     */

    public Boolean getCompress() {
        return this.compress;
    }

    /**
     * Whether you want CloudFront to automatically compress content for web
     * requests that include Accept-Encoding: gzip in the request header. If so,
     * specify true; if not, specify false. CloudFront compresses files larger
     * than 1000 bytes and less than 1 megabyte for both Amazon S3 and custom
     * origins. When a CloudFront edge location is unusually busy, some files
     * might not be compressed. The value of the Content-Type header must be on
     * the list of file types that CloudFront will compress. For the current
     * list, see <a
     * href="http://docs.aws.amazon.com/console/cloudfront/compressed-content"
     * >Serving Compressed Content</a> in the Amazon CloudFront Developer Guide.
     * If you configure CloudFront to compress content, CloudFront removes the
     * ETag response header from the objects that it compresses. The ETag header
     * indicates that the version in a CloudFront edge cache is identical to the
     * version on the origin server, but after compression the two versions are
     * no longer identical. As a result, for compressed objects, CloudFront can't
     * use the ETag header to determine whether an expired object in the
     * CloudFront edge cache is still the latest version.
     * 
     * @param compress
     *        Whether you want CloudFront to automatically compress content for
     *        web requests that include Accept-Encoding: gzip in the request
     *        header. If so, specify true; if not, specify false. CloudFront
     *        compresses files larger than 1000 bytes and less than 1 megabyte
     *        for both Amazon S3 and custom origins. When a CloudFront edge
     *        location is unusually busy, some files might not be compressed.
     *        The value of the Content-Type header must be on the list of file
     *        types that CloudFront will compress. For the current list, see <a
     *        href=
     *        "http://docs.aws.amazon.com/console/cloudfront/compressed-content"
     *        >Serving Compressed Content</a> in the Amazon CloudFront Developer
     *        Guide. If you configure CloudFront to compress content, CloudFront
     *        removes the ETag response header from the objects that it
     *        compresses. The ETag header indicates that the version in a
     *        CloudFront edge cache is identical to the version on the origin
     *        server, but after compression the two versions are no longer
     *        identical. As a result, for compressed objects, CloudFront can't
     *        use the ETag header to determine whether an expired object in the
     *        CloudFront edge cache is still the latest version.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CacheBehavior withCompress(Boolean compress) {
        setCompress(compress);
        return this;
    }

    /**
     * Whether you want CloudFront to automatically compress content for web
     * requests that include Accept-Encoding: gzip in the request header. If so,
     * specify true; if not, specify false. CloudFront compresses files larger
     * than 1000 bytes and less than 1 megabyte for both Amazon S3 and custom
     * origins. When a CloudFront edge location is unusually busy, some files
     * might not be compressed. The value of the Content-Type header must be on
     * the list of file types that CloudFront will compress. For the current
     * list, see <a
     * href="http://docs.aws.amazon.com/console/cloudfront/compressed-content"
     * >Serving Compressed Content</a> in the Amazon CloudFront Developer Guide.
     * If you configure CloudFront to compress content, CloudFront removes the
     * ETag response header from the objects that it compresses. The ETag header
     * indicates that the version in a CloudFront edge cache is identical to the
     * version on the origin server, but after compression the two versions are
     * no longer identical. As a result, for compressed objects, CloudFront can't
     * use the ETag header to determine whether an expired object in the
     * CloudFront edge cache is still the latest version.
     * 
     * @return Whether you want CloudFront to automatically compress content for
     *         web requests that include Accept-Encoding: gzip in the request
     *         header. If so, specify true; if not, specify false. CloudFront
     *         compresses files larger than 1000 bytes and less than 1 megabyte
     *         for both Amazon S3 and custom origins. When a CloudFront edge
     *         location is unusually busy, some files might not be compressed.
     *         The value of the Content-Type header must be on the list of file
     *         types that CloudFront will compress. For the current list, see <a
     *         href=
     *         "http://docs.aws.amazon.com/console/cloudfront/compressed-content"
     *         >Serving Compressed Content</a> in the Amazon CloudFront
     *         Developer Guide. If you configure CloudFront to compress content,
     *         CloudFront removes the ETag response header from the objects that
     *         it compresses. The ETag header indicates that the version in a
     *         CloudFront edge cache is identical to the version on the origin
     *         server, but after compression the two versions are no longer
     *         identical. As a result, for compressed objects, CloudFront can't
     *         use the ETag header to determine whether an expired object in the
     *         CloudFront edge cache is still the latest version.
     */

    public Boolean isCompress() {
        return this.compress;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("PathPattern: " + getPathPattern() + ",");
        if (getTargetOriginId() != null)
            sb.append("TargetOriginId: " + getTargetOriginId() + ",");
        if (getForwardedValues() != null)
            sb.append("ForwardedValues: " + getForwardedValues() + ",");
        if (getTrustedSigners() != null)
            sb.append("TrustedSigners: " + getTrustedSigners() + ",");
        if (getViewerProtocolPolicy() != null)
            sb.append("ViewerProtocolPolicy: " + getViewerProtocolPolicy()
                    + ",");
        if (getMinTTL() != null)
            sb.append("MinTTL: " + getMinTTL() + ",");
        if (getAllowedMethods() != null)
            sb.append("AllowedMethods: " + getAllowedMethods() + ",");
        if (getSmoothStreaming() != null)
            sb.append("SmoothStreaming: " + getSmoothStreaming() + ",");
        if (getDefaultTTL() != null)
            sb.append("DefaultTTL: " + getDefaultTTL() + ",");
        if (getMaxTTL() != null)
            sb.append("MaxTTL: " + getMaxTTL() + ",");
        if (getCompress() != null)
            sb.append("Compress: " + getCompress());
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
        if (other.getPathPattern() != null
                && other.getPathPattern().equals(this.getPathPattern()) == false)
            return false;
        if (other.getTargetOriginId() == null
                ^ this.getTargetOriginId() == null)
            return false;
        if (other.getTargetOriginId() != null
                && other.getTargetOriginId().equals(this.getTargetOriginId()) == false)
            return false;
        if (other.getForwardedValues() == null
                ^ this.getForwardedValues() == null)
            return false;
        if (other.getForwardedValues() != null
                && other.getForwardedValues().equals(this.getForwardedValues()) == false)
            return false;
        if (other.getTrustedSigners() == null
                ^ this.getTrustedSigners() == null)
            return false;
        if (other.getTrustedSigners() != null
                && other.getTrustedSigners().equals(this.getTrustedSigners()) == false)
            return false;
        if (other.getViewerProtocolPolicy() == null
                ^ this.getViewerProtocolPolicy() == null)
            return false;
        if (other.getViewerProtocolPolicy() != null
                && other.getViewerProtocolPolicy().equals(
                        this.getViewerProtocolPolicy()) == false)
            return false;
        if (other.getMinTTL() == null ^ this.getMinTTL() == null)
            return false;
        if (other.getMinTTL() != null
                && other.getMinTTL().equals(this.getMinTTL()) == false)
            return false;
        if (other.getAllowedMethods() == null
                ^ this.getAllowedMethods() == null)
            return false;
        if (other.getAllowedMethods() != null
                && other.getAllowedMethods().equals(this.getAllowedMethods()) == false)
            return false;
        if (other.getSmoothStreaming() == null
                ^ this.getSmoothStreaming() == null)
            return false;
        if (other.getSmoothStreaming() != null
                && other.getSmoothStreaming().equals(this.getSmoothStreaming()) == false)
            return false;
        if (other.getDefaultTTL() == null ^ this.getDefaultTTL() == null)
            return false;
        if (other.getDefaultTTL() != null
                && other.getDefaultTTL().equals(this.getDefaultTTL()) == false)
            return false;
        if (other.getMaxTTL() == null ^ this.getMaxTTL() == null)
            return false;
        if (other.getMaxTTL() != null
                && other.getMaxTTL().equals(this.getMaxTTL()) == false)
            return false;
        if (other.getCompress() == null ^ this.getCompress() == null)
            return false;
        if (other.getCompress() != null
                && other.getCompress().equals(this.getCompress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPathPattern() == null) ? 0 : getPathPattern().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetOriginId() == null) ? 0 : getTargetOriginId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getForwardedValues() == null) ? 0 : getForwardedValues()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrustedSigners() == null) ? 0 : getTrustedSigners()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getViewerProtocolPolicy() == null) ? 0
                        : getViewerProtocolPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getMinTTL() == null) ? 0 : getMinTTL().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowedMethods() == null) ? 0 : getAllowedMethods()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSmoothStreaming() == null) ? 0 : getSmoothStreaming()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDefaultTTL() == null) ? 0 : getDefaultTTL().hashCode());
        hashCode = prime * hashCode
                + ((getMaxTTL() == null) ? 0 : getMaxTTL().hashCode());
        hashCode = prime * hashCode
                + ((getCompress() == null) ? 0 : getCompress().hashCode());
        return hashCode;
    }

    @Override
    public CacheBehavior clone() {
        try {
            return (CacheBehavior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
