/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This object determines the values that CloudFront includes in the cache key. These values can include HTTP headers,
 * cookies, and URL query strings. CloudFront uses the cache key to find an object in its cache that it can return to
 * the viewer.
 * </p>
 * <p>
 * The headers, cookies, and query strings that are included in the cache key are automatically included in requests
 * that CloudFront sends to the origin. CloudFront sends a request when it can’t find an object in its cache that
 * matches the request’s cache key. If you want to send values to the origin but <i>not</i> include them in the cache
 * key, use <code>OriginRequestPolicy</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ParametersInCacheKeyAndForwardedToOrigin"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParametersInCacheKeyAndForwardedToOrigin implements Serializable, Cloneable {

    /**
     * <p>
     * A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key and
     * included in requests that CloudFront sends to the origin.
     * </p>
     * <p>
     * This field is related to the <code>EnableAcceptEncodingBrotli</code> field. If one or both of these fields is
     * <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then CloudFront
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the cache key
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the request to the origin, if a request is necessary
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     * >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you set this value to <code>true</code>, and this cache behavior also has an origin request policy attached,
     * do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront always includes
     * the <code>Accept-Encoding</code> header in origin requests when the value of this field is <code>true</code>, so
     * including this header in an origin request policy has no effect.
     * </p>
     * <p>
     * If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code> header
     * the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s
     * not included in origin requests. In this case, you can manually add <code>Accept-Encoding</code> to the headers
     * whitelist like any other HTTP header.
     * </p>
     */
    private Boolean enableAcceptEncodingGzip;
    /**
     * <p>
     * A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key and
     * included in requests that CloudFront sends to the origin.
     * </p>
     * <p>
     * This field is related to the <code>EnableAcceptEncodingGzip</code> field. If one or both of these fields is
     * <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then CloudFront
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the cache key
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the request to the origin, if a request is necessary
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     * >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you set this value to <code>true</code>, and this cache behavior also has an origin request policy attached,
     * do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront always includes
     * the <code>Accept-Encoding</code> header in origin requests when the value of this field is <code>true</code>, so
     * including this header in an origin request policy has no effect.
     * </p>
     * <p>
     * If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code> header
     * the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s
     * not included in origin requests. In this case, you can manually add <code>Accept-Encoding</code> to the headers
     * whitelist like any other HTTP header.
     * </p>
     */
    private Boolean enableAcceptEncodingBrotli;
    /**
     * <p>
     * An object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin.
     * </p>
     */
    private CachePolicyHeadersConfig headersConfig;
    /**
     * <p>
     * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the
     * cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     */
    private CachePolicyCookiesConfig cookiesConfig;
    /**
     * <p>
     * An object that determines whether any URL query strings in viewer requests (and if so, which query strings) are
     * included in the cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     */
    private CachePolicyQueryStringsConfig queryStringsConfig;

    /**
     * <p>
     * A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key and
     * included in requests that CloudFront sends to the origin.
     * </p>
     * <p>
     * This field is related to the <code>EnableAcceptEncodingBrotli</code> field. If one or both of these fields is
     * <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then CloudFront
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the cache key
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the request to the origin, if a request is necessary
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     * >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you set this value to <code>true</code>, and this cache behavior also has an origin request policy attached,
     * do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront always includes
     * the <code>Accept-Encoding</code> header in origin requests when the value of this field is <code>true</code>, so
     * including this header in an origin request policy has no effect.
     * </p>
     * <p>
     * If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code> header
     * the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s
     * not included in origin requests. In this case, you can manually add <code>Accept-Encoding</code> to the headers
     * whitelist like any other HTTP header.
     * </p>
     * 
     * @param enableAcceptEncodingGzip
     *        A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key
     *        and included in requests that CloudFront sends to the origin.</p>
     *        <p>
     *        This field is related to the <code>EnableAcceptEncodingBrotli</code> field. If one or both of these fields
     *        is <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then
     *        CloudFront does the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Includes the normalized header in the cache key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Includes the normalized header in the request to the origin, if a request is necessary
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     *        >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        If you set this value to <code>true</code>, and this cache behavior also has an origin request policy
     *        attached, do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront
     *        always includes the <code>Accept-Encoding</code> header in origin requests when the value of this field is
     *        <code>true</code>, so including this header in an origin request policy has no effect.
     *        </p>
     *        <p>
     *        If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code>
     *        header the same as any other HTTP header in the viewer request. By default, it’s not included in the cache
     *        key and it’s not included in origin requests. In this case, you can manually add
     *        <code>Accept-Encoding</code> to the headers whitelist like any other HTTP header.
     */

    public void setEnableAcceptEncodingGzip(Boolean enableAcceptEncodingGzip) {
        this.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
    }

    /**
     * <p>
     * A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key and
     * included in requests that CloudFront sends to the origin.
     * </p>
     * <p>
     * This field is related to the <code>EnableAcceptEncodingBrotli</code> field. If one or both of these fields is
     * <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then CloudFront
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the cache key
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the request to the origin, if a request is necessary
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     * >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you set this value to <code>true</code>, and this cache behavior also has an origin request policy attached,
     * do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront always includes
     * the <code>Accept-Encoding</code> header in origin requests when the value of this field is <code>true</code>, so
     * including this header in an origin request policy has no effect.
     * </p>
     * <p>
     * If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code> header
     * the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s
     * not included in origin requests. In this case, you can manually add <code>Accept-Encoding</code> to the headers
     * whitelist like any other HTTP header.
     * </p>
     * 
     * @return A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key
     *         and included in requests that CloudFront sends to the origin.</p>
     *         <p>
     *         This field is related to the <code>EnableAcceptEncodingBrotli</code> field. If one or both of these
     *         fields is <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code>
     *         header, then CloudFront does the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Includes the normalized header in the cache key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Includes the normalized header in the request to the origin, if a request is necessary
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     *         >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you set this value to <code>true</code>, and this cache behavior also has an origin request policy
     *         attached, do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront
     *         always includes the <code>Accept-Encoding</code> header in origin requests when the value of this field
     *         is <code>true</code>, so including this header in an origin request policy has no effect.
     *         </p>
     *         <p>
     *         If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code>
     *         header the same as any other HTTP header in the viewer request. By default, it’s not included in the
     *         cache key and it’s not included in origin requests. In this case, you can manually add
     *         <code>Accept-Encoding</code> to the headers whitelist like any other HTTP header.
     */

    public Boolean getEnableAcceptEncodingGzip() {
        return this.enableAcceptEncodingGzip;
    }

    /**
     * <p>
     * A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key and
     * included in requests that CloudFront sends to the origin.
     * </p>
     * <p>
     * This field is related to the <code>EnableAcceptEncodingBrotli</code> field. If one or both of these fields is
     * <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then CloudFront
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the cache key
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the request to the origin, if a request is necessary
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     * >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you set this value to <code>true</code>, and this cache behavior also has an origin request policy attached,
     * do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront always includes
     * the <code>Accept-Encoding</code> header in origin requests when the value of this field is <code>true</code>, so
     * including this header in an origin request policy has no effect.
     * </p>
     * <p>
     * If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code> header
     * the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s
     * not included in origin requests. In this case, you can manually add <code>Accept-Encoding</code> to the headers
     * whitelist like any other HTTP header.
     * </p>
     * 
     * @param enableAcceptEncodingGzip
     *        A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key
     *        and included in requests that CloudFront sends to the origin.</p>
     *        <p>
     *        This field is related to the <code>EnableAcceptEncodingBrotli</code> field. If one or both of these fields
     *        is <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then
     *        CloudFront does the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Includes the normalized header in the cache key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Includes the normalized header in the request to the origin, if a request is necessary
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     *        >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        If you set this value to <code>true</code>, and this cache behavior also has an origin request policy
     *        attached, do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront
     *        always includes the <code>Accept-Encoding</code> header in origin requests when the value of this field is
     *        <code>true</code>, so including this header in an origin request policy has no effect.
     *        </p>
     *        <p>
     *        If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code>
     *        header the same as any other HTTP header in the viewer request. By default, it’s not included in the cache
     *        key and it’s not included in origin requests. In this case, you can manually add
     *        <code>Accept-Encoding</code> to the headers whitelist like any other HTTP header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParametersInCacheKeyAndForwardedToOrigin withEnableAcceptEncodingGzip(Boolean enableAcceptEncodingGzip) {
        setEnableAcceptEncodingGzip(enableAcceptEncodingGzip);
        return this;
    }

    /**
     * <p>
     * A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key and
     * included in requests that CloudFront sends to the origin.
     * </p>
     * <p>
     * This field is related to the <code>EnableAcceptEncodingBrotli</code> field. If one or both of these fields is
     * <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then CloudFront
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the cache key
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the request to the origin, if a request is necessary
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     * >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you set this value to <code>true</code>, and this cache behavior also has an origin request policy attached,
     * do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront always includes
     * the <code>Accept-Encoding</code> header in origin requests when the value of this field is <code>true</code>, so
     * including this header in an origin request policy has no effect.
     * </p>
     * <p>
     * If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code> header
     * the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s
     * not included in origin requests. In this case, you can manually add <code>Accept-Encoding</code> to the headers
     * whitelist like any other HTTP header.
     * </p>
     * 
     * @return A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key
     *         and included in requests that CloudFront sends to the origin.</p>
     *         <p>
     *         This field is related to the <code>EnableAcceptEncodingBrotli</code> field. If one or both of these
     *         fields is <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code>
     *         header, then CloudFront does the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Includes the normalized header in the cache key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Includes the normalized header in the request to the origin, if a request is necessary
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     *         >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you set this value to <code>true</code>, and this cache behavior also has an origin request policy
     *         attached, do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront
     *         always includes the <code>Accept-Encoding</code> header in origin requests when the value of this field
     *         is <code>true</code>, so including this header in an origin request policy has no effect.
     *         </p>
     *         <p>
     *         If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code>
     *         header the same as any other HTTP header in the viewer request. By default, it’s not included in the
     *         cache key and it’s not included in origin requests. In this case, you can manually add
     *         <code>Accept-Encoding</code> to the headers whitelist like any other HTTP header.
     */

    public Boolean isEnableAcceptEncodingGzip() {
        return this.enableAcceptEncodingGzip;
    }

    /**
     * <p>
     * A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key and
     * included in requests that CloudFront sends to the origin.
     * </p>
     * <p>
     * This field is related to the <code>EnableAcceptEncodingGzip</code> field. If one or both of these fields is
     * <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then CloudFront
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the cache key
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the request to the origin, if a request is necessary
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     * >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you set this value to <code>true</code>, and this cache behavior also has an origin request policy attached,
     * do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront always includes
     * the <code>Accept-Encoding</code> header in origin requests when the value of this field is <code>true</code>, so
     * including this header in an origin request policy has no effect.
     * </p>
     * <p>
     * If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code> header
     * the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s
     * not included in origin requests. In this case, you can manually add <code>Accept-Encoding</code> to the headers
     * whitelist like any other HTTP header.
     * </p>
     * 
     * @param enableAcceptEncodingBrotli
     *        A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key
     *        and included in requests that CloudFront sends to the origin.</p>
     *        <p>
     *        This field is related to the <code>EnableAcceptEncodingGzip</code> field. If one or both of these fields
     *        is <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then
     *        CloudFront does the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Includes the normalized header in the cache key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Includes the normalized header in the request to the origin, if a request is necessary
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     *        >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        If you set this value to <code>true</code>, and this cache behavior also has an origin request policy
     *        attached, do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront
     *        always includes the <code>Accept-Encoding</code> header in origin requests when the value of this field is
     *        <code>true</code>, so including this header in an origin request policy has no effect.
     *        </p>
     *        <p>
     *        If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code>
     *        header the same as any other HTTP header in the viewer request. By default, it’s not included in the cache
     *        key and it’s not included in origin requests. In this case, you can manually add
     *        <code>Accept-Encoding</code> to the headers whitelist like any other HTTP header.
     */

    public void setEnableAcceptEncodingBrotli(Boolean enableAcceptEncodingBrotli) {
        this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
    }

    /**
     * <p>
     * A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key and
     * included in requests that CloudFront sends to the origin.
     * </p>
     * <p>
     * This field is related to the <code>EnableAcceptEncodingGzip</code> field. If one or both of these fields is
     * <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then CloudFront
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the cache key
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the request to the origin, if a request is necessary
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     * >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you set this value to <code>true</code>, and this cache behavior also has an origin request policy attached,
     * do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront always includes
     * the <code>Accept-Encoding</code> header in origin requests when the value of this field is <code>true</code>, so
     * including this header in an origin request policy has no effect.
     * </p>
     * <p>
     * If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code> header
     * the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s
     * not included in origin requests. In this case, you can manually add <code>Accept-Encoding</code> to the headers
     * whitelist like any other HTTP header.
     * </p>
     * 
     * @return A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key
     *         and included in requests that CloudFront sends to the origin.</p>
     *         <p>
     *         This field is related to the <code>EnableAcceptEncodingGzip</code> field. If one or both of these fields
     *         is <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then
     *         CloudFront does the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Includes the normalized header in the cache key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Includes the normalized header in the request to the origin, if a request is necessary
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     *         >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you set this value to <code>true</code>, and this cache behavior also has an origin request policy
     *         attached, do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront
     *         always includes the <code>Accept-Encoding</code> header in origin requests when the value of this field
     *         is <code>true</code>, so including this header in an origin request policy has no effect.
     *         </p>
     *         <p>
     *         If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code>
     *         header the same as any other HTTP header in the viewer request. By default, it’s not included in the
     *         cache key and it’s not included in origin requests. In this case, you can manually add
     *         <code>Accept-Encoding</code> to the headers whitelist like any other HTTP header.
     */

    public Boolean getEnableAcceptEncodingBrotli() {
        return this.enableAcceptEncodingBrotli;
    }

    /**
     * <p>
     * A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key and
     * included in requests that CloudFront sends to the origin.
     * </p>
     * <p>
     * This field is related to the <code>EnableAcceptEncodingGzip</code> field. If one or both of these fields is
     * <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then CloudFront
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the cache key
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the request to the origin, if a request is necessary
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     * >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you set this value to <code>true</code>, and this cache behavior also has an origin request policy attached,
     * do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront always includes
     * the <code>Accept-Encoding</code> header in origin requests when the value of this field is <code>true</code>, so
     * including this header in an origin request policy has no effect.
     * </p>
     * <p>
     * If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code> header
     * the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s
     * not included in origin requests. In this case, you can manually add <code>Accept-Encoding</code> to the headers
     * whitelist like any other HTTP header.
     * </p>
     * 
     * @param enableAcceptEncodingBrotli
     *        A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key
     *        and included in requests that CloudFront sends to the origin.</p>
     *        <p>
     *        This field is related to the <code>EnableAcceptEncodingGzip</code> field. If one or both of these fields
     *        is <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then
     *        CloudFront does the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Includes the normalized header in the cache key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Includes the normalized header in the request to the origin, if a request is necessary
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     *        >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        If you set this value to <code>true</code>, and this cache behavior also has an origin request policy
     *        attached, do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront
     *        always includes the <code>Accept-Encoding</code> header in origin requests when the value of this field is
     *        <code>true</code>, so including this header in an origin request policy has no effect.
     *        </p>
     *        <p>
     *        If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code>
     *        header the same as any other HTTP header in the viewer request. By default, it’s not included in the cache
     *        key and it’s not included in origin requests. In this case, you can manually add
     *        <code>Accept-Encoding</code> to the headers whitelist like any other HTTP header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParametersInCacheKeyAndForwardedToOrigin withEnableAcceptEncodingBrotli(Boolean enableAcceptEncodingBrotli) {
        setEnableAcceptEncodingBrotli(enableAcceptEncodingBrotli);
        return this;
    }

    /**
     * <p>
     * A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key and
     * included in requests that CloudFront sends to the origin.
     * </p>
     * <p>
     * This field is related to the <code>EnableAcceptEncodingGzip</code> field. If one or both of these fields is
     * <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then CloudFront
     * does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the cache key
     * </p>
     * </li>
     * <li>
     * <p>
     * Includes the normalized header in the request to the origin, if a request is necessary
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     * >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * If you set this value to <code>true</code>, and this cache behavior also has an origin request policy attached,
     * do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront always includes
     * the <code>Accept-Encoding</code> header in origin requests when the value of this field is <code>true</code>, so
     * including this header in an origin request policy has no effect.
     * </p>
     * <p>
     * If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code> header
     * the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s
     * not included in origin requests. In this case, you can manually add <code>Accept-Encoding</code> to the headers
     * whitelist like any other HTTP header.
     * </p>
     * 
     * @return A flag that can affect whether the <code>Accept-Encoding</code> HTTP header is included in the cache key
     *         and included in requests that CloudFront sends to the origin.</p>
     *         <p>
     *         This field is related to the <code>EnableAcceptEncodingGzip</code> field. If one or both of these fields
     *         is <code>true</code> <i>and</i> the viewer request includes the <code>Accept-Encoding</code> header, then
     *         CloudFront does the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Normalizes the value of the viewer’s <code>Accept-Encoding</code> header
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Includes the normalized header in the cache key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Includes the normalized header in the request to the origin, if a request is necessary
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects"
     *         >Compression support</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you set this value to <code>true</code>, and this cache behavior also has an origin request policy
     *         attached, do not include the <code>Accept-Encoding</code> header in the origin request policy. CloudFront
     *         always includes the <code>Accept-Encoding</code> header in origin requests when the value of this field
     *         is <code>true</code>, so including this header in an origin request policy has no effect.
     *         </p>
     *         <p>
     *         If both of these fields are <code>false</code>, then CloudFront treats the <code>Accept-Encoding</code>
     *         header the same as any other HTTP header in the viewer request. By default, it’s not included in the
     *         cache key and it’s not included in origin requests. In this case, you can manually add
     *         <code>Accept-Encoding</code> to the headers whitelist like any other HTTP header.
     */

    public Boolean isEnableAcceptEncodingBrotli() {
        return this.enableAcceptEncodingBrotli;
    }

    /**
     * <p>
     * An object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @param headersConfig
     *        An object that determines whether any HTTP headers (and if so, which headers) are included in the cache
     *        key and automatically included in requests that CloudFront sends to the origin.
     */

    public void setHeadersConfig(CachePolicyHeadersConfig headersConfig) {
        this.headersConfig = headersConfig;
    }

    /**
     * <p>
     * An object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @return An object that determines whether any HTTP headers (and if so, which headers) are included in the cache
     *         key and automatically included in requests that CloudFront sends to the origin.
     */

    public CachePolicyHeadersConfig getHeadersConfig() {
        return this.headersConfig;
    }

    /**
     * <p>
     * An object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @param headersConfig
     *        An object that determines whether any HTTP headers (and if so, which headers) are included in the cache
     *        key and automatically included in requests that CloudFront sends to the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParametersInCacheKeyAndForwardedToOrigin withHeadersConfig(CachePolicyHeadersConfig headersConfig) {
        setHeadersConfig(headersConfig);
        return this;
    }

    /**
     * <p>
     * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the
     * cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @param cookiesConfig
     *        An object that determines whether any cookies in viewer requests (and if so, which cookies) are included
     *        in the cache key and automatically included in requests that CloudFront sends to the origin.
     */

    public void setCookiesConfig(CachePolicyCookiesConfig cookiesConfig) {
        this.cookiesConfig = cookiesConfig;
    }

    /**
     * <p>
     * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the
     * cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @return An object that determines whether any cookies in viewer requests (and if so, which cookies) are included
     *         in the cache key and automatically included in requests that CloudFront sends to the origin.
     */

    public CachePolicyCookiesConfig getCookiesConfig() {
        return this.cookiesConfig;
    }

    /**
     * <p>
     * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the
     * cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @param cookiesConfig
     *        An object that determines whether any cookies in viewer requests (and if so, which cookies) are included
     *        in the cache key and automatically included in requests that CloudFront sends to the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParametersInCacheKeyAndForwardedToOrigin withCookiesConfig(CachePolicyCookiesConfig cookiesConfig) {
        setCookiesConfig(cookiesConfig);
        return this;
    }

    /**
     * <p>
     * An object that determines whether any URL query strings in viewer requests (and if so, which query strings) are
     * included in the cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @param queryStringsConfig
     *        An object that determines whether any URL query strings in viewer requests (and if so, which query
     *        strings) are included in the cache key and automatically included in requests that CloudFront sends to the
     *        origin.
     */

    public void setQueryStringsConfig(CachePolicyQueryStringsConfig queryStringsConfig) {
        this.queryStringsConfig = queryStringsConfig;
    }

    /**
     * <p>
     * An object that determines whether any URL query strings in viewer requests (and if so, which query strings) are
     * included in the cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @return An object that determines whether any URL query strings in viewer requests (and if so, which query
     *         strings) are included in the cache key and automatically included in requests that CloudFront sends to
     *         the origin.
     */

    public CachePolicyQueryStringsConfig getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    /**
     * <p>
     * An object that determines whether any URL query strings in viewer requests (and if so, which query strings) are
     * included in the cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * 
     * @param queryStringsConfig
     *        An object that determines whether any URL query strings in viewer requests (and if so, which query
     *        strings) are included in the cache key and automatically included in requests that CloudFront sends to the
     *        origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParametersInCacheKeyAndForwardedToOrigin withQueryStringsConfig(CachePolicyQueryStringsConfig queryStringsConfig) {
        setQueryStringsConfig(queryStringsConfig);
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
        if (getEnableAcceptEncodingGzip() != null)
            sb.append("EnableAcceptEncodingGzip: ").append(getEnableAcceptEncodingGzip()).append(",");
        if (getEnableAcceptEncodingBrotli() != null)
            sb.append("EnableAcceptEncodingBrotli: ").append(getEnableAcceptEncodingBrotli()).append(",");
        if (getHeadersConfig() != null)
            sb.append("HeadersConfig: ").append(getHeadersConfig()).append(",");
        if (getCookiesConfig() != null)
            sb.append("CookiesConfig: ").append(getCookiesConfig()).append(",");
        if (getQueryStringsConfig() != null)
            sb.append("QueryStringsConfig: ").append(getQueryStringsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParametersInCacheKeyAndForwardedToOrigin == false)
            return false;
        ParametersInCacheKeyAndForwardedToOrigin other = (ParametersInCacheKeyAndForwardedToOrigin) obj;
        if (other.getEnableAcceptEncodingGzip() == null ^ this.getEnableAcceptEncodingGzip() == null)
            return false;
        if (other.getEnableAcceptEncodingGzip() != null && other.getEnableAcceptEncodingGzip().equals(this.getEnableAcceptEncodingGzip()) == false)
            return false;
        if (other.getEnableAcceptEncodingBrotli() == null ^ this.getEnableAcceptEncodingBrotli() == null)
            return false;
        if (other.getEnableAcceptEncodingBrotli() != null && other.getEnableAcceptEncodingBrotli().equals(this.getEnableAcceptEncodingBrotli()) == false)
            return false;
        if (other.getHeadersConfig() == null ^ this.getHeadersConfig() == null)
            return false;
        if (other.getHeadersConfig() != null && other.getHeadersConfig().equals(this.getHeadersConfig()) == false)
            return false;
        if (other.getCookiesConfig() == null ^ this.getCookiesConfig() == null)
            return false;
        if (other.getCookiesConfig() != null && other.getCookiesConfig().equals(this.getCookiesConfig()) == false)
            return false;
        if (other.getQueryStringsConfig() == null ^ this.getQueryStringsConfig() == null)
            return false;
        if (other.getQueryStringsConfig() != null && other.getQueryStringsConfig().equals(this.getQueryStringsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableAcceptEncodingGzip() == null) ? 0 : getEnableAcceptEncodingGzip().hashCode());
        hashCode = prime * hashCode + ((getEnableAcceptEncodingBrotli() == null) ? 0 : getEnableAcceptEncodingBrotli().hashCode());
        hashCode = prime * hashCode + ((getHeadersConfig() == null) ? 0 : getHeadersConfig().hashCode());
        hashCode = prime * hashCode + ((getCookiesConfig() == null) ? 0 : getCookiesConfig().hashCode());
        hashCode = prime * hashCode + ((getQueryStringsConfig() == null) ? 0 : getQueryStringsConfig().hashCode());
        return hashCode;
    }

    @Override
    public ParametersInCacheKeyAndForwardedToOrigin clone() {
        try {
            return (ParametersInCacheKeyAndForwardedToOrigin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
