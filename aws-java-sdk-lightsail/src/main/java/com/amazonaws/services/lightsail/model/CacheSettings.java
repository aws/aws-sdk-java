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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the cache settings of an Amazon Lightsail content delivery network (CDN) distribution.
 * </p>
 * <p>
 * These settings apply only to your distribution's <code>cacheBehaviors</code> (including the
 * <code>defaultCacheBehavior</code>) that have a <code>behavior</code> of <code>cache</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CacheSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the content has been updated.
     * </p>
     * <note>
     * <p>
     * The value specified applies only when the origin does not add HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects.
     * </p>
     * </note>
     */
    private Long defaultTTL;
    /**
     * <p>
     * The minimum amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the object has been updated.
     * </p>
     * <p>
     * A value of <code>0</code> must be specified for <code>minimumTTL</code> if the distribution is configured to
     * forward all headers to the origin.
     * </p>
     */
    private Long minimumTTL;
    /**
     * <p>
     * The maximum amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the object has been updated.
     * </p>
     * <p>
     * The value specified applies only when the origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects.
     * </p>
     */
    private Long maximumTTL;
    /**
     * <p>
     * The HTTP methods that are processed and forwarded to the distribution's origin.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GET,HEAD</code> - The distribution forwards the <code>GET</code> and <code>HEAD</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS</code> - The distribution forwards the <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE</code> - The distribution forwards the <code>GET</code>,
     * <code>HEAD</code>, <code>OPTIONS</code>, <code>PUT</code>, <code>PATCH</code>, <code>POST</code>, and
     * <code>DELETE</code> methods.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the third option, you might need to restrict access to your distribution's origin so users can't
     * perform operations that you don't want them to. For example, you might not want users to have permission to
     * delete objects from your origin.
     * </p>
     */
    private String allowedHTTPMethods;
    /**
     * <p>
     * The HTTP method responses that are cached by your distribution.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GET,HEAD</code> - The distribution caches responses to the <code>GET</code> and <code>HEAD</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS</code> - The distribution caches responses to the <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> methods.
     * </p>
     * </li>
     * </ul>
     */
    private String cachedHTTPMethods;
    /**
     * <p>
     * An object that describes the cookies that are forwarded to the origin. Your content is cached based on the
     * cookies that are forwarded.
     * </p>
     */
    private CookieObject forwardedCookies;
    /**
     * <p>
     * An object that describes the headers that are forwarded to the origin. Your content is cached based on the
     * headers that are forwarded.
     * </p>
     */
    private HeaderObject forwardedHeaders;
    /**
     * <p>
     * An object that describes the query strings that are forwarded to the origin. Your content is cached based on the
     * query strings that are forwarded.
     * </p>
     */
    private QueryStringObject forwardedQueryStrings;

    /**
     * <p>
     * The default amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the content has been updated.
     * </p>
     * <note>
     * <p>
     * The value specified applies only when the origin does not add HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects.
     * </p>
     * </note>
     * 
     * @param defaultTTL
     *        The default amount of time that objects stay in the distribution's cache before the distribution forwards
     *        another request to the origin to determine whether the content has been updated.</p> <note>
     *        <p>
     *        The value specified applies only when the origin does not add HTTP headers such as
     *        <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to
     *        objects.
     *        </p>
     */

    public void setDefaultTTL(Long defaultTTL) {
        this.defaultTTL = defaultTTL;
    }

    /**
     * <p>
     * The default amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the content has been updated.
     * </p>
     * <note>
     * <p>
     * The value specified applies only when the origin does not add HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects.
     * </p>
     * </note>
     * 
     * @return The default amount of time that objects stay in the distribution's cache before the distribution forwards
     *         another request to the origin to determine whether the content has been updated.</p> <note>
     *         <p>
     *         The value specified applies only when the origin does not add HTTP headers such as
     *         <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to
     *         objects.
     *         </p>
     */

    public Long getDefaultTTL() {
        return this.defaultTTL;
    }

    /**
     * <p>
     * The default amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the content has been updated.
     * </p>
     * <note>
     * <p>
     * The value specified applies only when the origin does not add HTTP headers such as
     * <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects.
     * </p>
     * </note>
     * 
     * @param defaultTTL
     *        The default amount of time that objects stay in the distribution's cache before the distribution forwards
     *        another request to the origin to determine whether the content has been updated.</p> <note>
     *        <p>
     *        The value specified applies only when the origin does not add HTTP headers such as
     *        <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to
     *        objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSettings withDefaultTTL(Long defaultTTL) {
        setDefaultTTL(defaultTTL);
        return this;
    }

    /**
     * <p>
     * The minimum amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the object has been updated.
     * </p>
     * <p>
     * A value of <code>0</code> must be specified for <code>minimumTTL</code> if the distribution is configured to
     * forward all headers to the origin.
     * </p>
     * 
     * @param minimumTTL
     *        The minimum amount of time that objects stay in the distribution's cache before the distribution forwards
     *        another request to the origin to determine whether the object has been updated.</p>
     *        <p>
     *        A value of <code>0</code> must be specified for <code>minimumTTL</code> if the distribution is configured
     *        to forward all headers to the origin.
     */

    public void setMinimumTTL(Long minimumTTL) {
        this.minimumTTL = minimumTTL;
    }

    /**
     * <p>
     * The minimum amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the object has been updated.
     * </p>
     * <p>
     * A value of <code>0</code> must be specified for <code>minimumTTL</code> if the distribution is configured to
     * forward all headers to the origin.
     * </p>
     * 
     * @return The minimum amount of time that objects stay in the distribution's cache before the distribution forwards
     *         another request to the origin to determine whether the object has been updated.</p>
     *         <p>
     *         A value of <code>0</code> must be specified for <code>minimumTTL</code> if the distribution is configured
     *         to forward all headers to the origin.
     */

    public Long getMinimumTTL() {
        return this.minimumTTL;
    }

    /**
     * <p>
     * The minimum amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the object has been updated.
     * </p>
     * <p>
     * A value of <code>0</code> must be specified for <code>minimumTTL</code> if the distribution is configured to
     * forward all headers to the origin.
     * </p>
     * 
     * @param minimumTTL
     *        The minimum amount of time that objects stay in the distribution's cache before the distribution forwards
     *        another request to the origin to determine whether the object has been updated.</p>
     *        <p>
     *        A value of <code>0</code> must be specified for <code>minimumTTL</code> if the distribution is configured
     *        to forward all headers to the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSettings withMinimumTTL(Long minimumTTL) {
        setMinimumTTL(minimumTTL);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the object has been updated.
     * </p>
     * <p>
     * The value specified applies only when the origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects.
     * </p>
     * 
     * @param maximumTTL
     *        The maximum amount of time that objects stay in the distribution's cache before the distribution forwards
     *        another request to the origin to determine whether the object has been updated.</p>
     *        <p>
     *        The value specified applies only when the origin adds HTTP headers such as
     *        <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to
     *        objects.
     */

    public void setMaximumTTL(Long maximumTTL) {
        this.maximumTTL = maximumTTL;
    }

    /**
     * <p>
     * The maximum amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the object has been updated.
     * </p>
     * <p>
     * The value specified applies only when the origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects.
     * </p>
     * 
     * @return The maximum amount of time that objects stay in the distribution's cache before the distribution forwards
     *         another request to the origin to determine whether the object has been updated.</p>
     *         <p>
     *         The value specified applies only when the origin adds HTTP headers such as
     *         <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to
     *         objects.
     */

    public Long getMaximumTTL() {
        return this.maximumTTL;
    }

    /**
     * <p>
     * The maximum amount of time that objects stay in the distribution's cache before the distribution forwards another
     * request to the origin to determine whether the object has been updated.
     * </p>
     * <p>
     * The value specified applies only when the origin adds HTTP headers such as <code>Cache-Control max-age</code>,
     * <code>Cache-Control s-maxage</code>, and <code>Expires</code> to objects.
     * </p>
     * 
     * @param maximumTTL
     *        The maximum amount of time that objects stay in the distribution's cache before the distribution forwards
     *        another request to the origin to determine whether the object has been updated.</p>
     *        <p>
     *        The value specified applies only when the origin adds HTTP headers such as
     *        <code>Cache-Control max-age</code>, <code>Cache-Control s-maxage</code>, and <code>Expires</code> to
     *        objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSettings withMaximumTTL(Long maximumTTL) {
        setMaximumTTL(maximumTTL);
        return this;
    }

    /**
     * <p>
     * The HTTP methods that are processed and forwarded to the distribution's origin.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GET,HEAD</code> - The distribution forwards the <code>GET</code> and <code>HEAD</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS</code> - The distribution forwards the <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE</code> - The distribution forwards the <code>GET</code>,
     * <code>HEAD</code>, <code>OPTIONS</code>, <code>PUT</code>, <code>PATCH</code>, <code>POST</code>, and
     * <code>DELETE</code> methods.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the third option, you might need to restrict access to your distribution's origin so users can't
     * perform operations that you don't want them to. For example, you might not want users to have permission to
     * delete objects from your origin.
     * </p>
     * 
     * @param allowedHTTPMethods
     *        The HTTP methods that are processed and forwarded to the distribution's origin.</p>
     *        <p>
     *        You can specify the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GET,HEAD</code> - The distribution forwards the <code>GET</code> and <code>HEAD</code> methods.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GET,HEAD,OPTIONS</code> - The distribution forwards the <code>GET</code>, <code>HEAD</code>, and
     *        <code>OPTIONS</code> methods.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE</code> - The distribution forwards the <code>GET</code>,
     *        <code>HEAD</code>, <code>OPTIONS</code>, <code>PUT</code>, <code>PATCH</code>, <code>POST</code>, and
     *        <code>DELETE</code> methods.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify the third option, you might need to restrict access to your distribution's origin so users
     *        can't perform operations that you don't want them to. For example, you might not want users to have
     *        permission to delete objects from your origin.
     */

    public void setAllowedHTTPMethods(String allowedHTTPMethods) {
        this.allowedHTTPMethods = allowedHTTPMethods;
    }

    /**
     * <p>
     * The HTTP methods that are processed and forwarded to the distribution's origin.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GET,HEAD</code> - The distribution forwards the <code>GET</code> and <code>HEAD</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS</code> - The distribution forwards the <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE</code> - The distribution forwards the <code>GET</code>,
     * <code>HEAD</code>, <code>OPTIONS</code>, <code>PUT</code>, <code>PATCH</code>, <code>POST</code>, and
     * <code>DELETE</code> methods.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the third option, you might need to restrict access to your distribution's origin so users can't
     * perform operations that you don't want them to. For example, you might not want users to have permission to
     * delete objects from your origin.
     * </p>
     * 
     * @return The HTTP methods that are processed and forwarded to the distribution's origin.</p>
     *         <p>
     *         You can specify the following options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GET,HEAD</code> - The distribution forwards the <code>GET</code> and <code>HEAD</code> methods.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GET,HEAD,OPTIONS</code> - The distribution forwards the <code>GET</code>, <code>HEAD</code>, and
     *         <code>OPTIONS</code> methods.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE</code> - The distribution forwards the <code>GET</code>,
     *         <code>HEAD</code>, <code>OPTIONS</code>, <code>PUT</code>, <code>PATCH</code>, <code>POST</code>, and
     *         <code>DELETE</code> methods.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify the third option, you might need to restrict access to your distribution's origin so users
     *         can't perform operations that you don't want them to. For example, you might not want users to have
     *         permission to delete objects from your origin.
     */

    public String getAllowedHTTPMethods() {
        return this.allowedHTTPMethods;
    }

    /**
     * <p>
     * The HTTP methods that are processed and forwarded to the distribution's origin.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GET,HEAD</code> - The distribution forwards the <code>GET</code> and <code>HEAD</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS</code> - The distribution forwards the <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE</code> - The distribution forwards the <code>GET</code>,
     * <code>HEAD</code>, <code>OPTIONS</code>, <code>PUT</code>, <code>PATCH</code>, <code>POST</code>, and
     * <code>DELETE</code> methods.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the third option, you might need to restrict access to your distribution's origin so users can't
     * perform operations that you don't want them to. For example, you might not want users to have permission to
     * delete objects from your origin.
     * </p>
     * 
     * @param allowedHTTPMethods
     *        The HTTP methods that are processed and forwarded to the distribution's origin.</p>
     *        <p>
     *        You can specify the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GET,HEAD</code> - The distribution forwards the <code>GET</code> and <code>HEAD</code> methods.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GET,HEAD,OPTIONS</code> - The distribution forwards the <code>GET</code>, <code>HEAD</code>, and
     *        <code>OPTIONS</code> methods.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE</code> - The distribution forwards the <code>GET</code>,
     *        <code>HEAD</code>, <code>OPTIONS</code>, <code>PUT</code>, <code>PATCH</code>, <code>POST</code>, and
     *        <code>DELETE</code> methods.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify the third option, you might need to restrict access to your distribution's origin so users
     *        can't perform operations that you don't want them to. For example, you might not want users to have
     *        permission to delete objects from your origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSettings withAllowedHTTPMethods(String allowedHTTPMethods) {
        setAllowedHTTPMethods(allowedHTTPMethods);
        return this;
    }

    /**
     * <p>
     * The HTTP method responses that are cached by your distribution.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GET,HEAD</code> - The distribution caches responses to the <code>GET</code> and <code>HEAD</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS</code> - The distribution caches responses to the <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> methods.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cachedHTTPMethods
     *        The HTTP method responses that are cached by your distribution.</p>
     *        <p>
     *        You can specify the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GET,HEAD</code> - The distribution caches responses to the <code>GET</code> and <code>HEAD</code>
     *        methods.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GET,HEAD,OPTIONS</code> - The distribution caches responses to the <code>GET</code>,
     *        <code>HEAD</code>, and <code>OPTIONS</code> methods.
     *        </p>
     *        </li>
     */

    public void setCachedHTTPMethods(String cachedHTTPMethods) {
        this.cachedHTTPMethods = cachedHTTPMethods;
    }

    /**
     * <p>
     * The HTTP method responses that are cached by your distribution.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GET,HEAD</code> - The distribution caches responses to the <code>GET</code> and <code>HEAD</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS</code> - The distribution caches responses to the <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> methods.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The HTTP method responses that are cached by your distribution.</p>
     *         <p>
     *         You can specify the following options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GET,HEAD</code> - The distribution caches responses to the <code>GET</code> and <code>HEAD</code>
     *         methods.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GET,HEAD,OPTIONS</code> - The distribution caches responses to the <code>GET</code>,
     *         <code>HEAD</code>, and <code>OPTIONS</code> methods.
     *         </p>
     *         </li>
     */

    public String getCachedHTTPMethods() {
        return this.cachedHTTPMethods;
    }

    /**
     * <p>
     * The HTTP method responses that are cached by your distribution.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GET,HEAD</code> - The distribution caches responses to the <code>GET</code> and <code>HEAD</code> methods.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GET,HEAD,OPTIONS</code> - The distribution caches responses to the <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> methods.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cachedHTTPMethods
     *        The HTTP method responses that are cached by your distribution.</p>
     *        <p>
     *        You can specify the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GET,HEAD</code> - The distribution caches responses to the <code>GET</code> and <code>HEAD</code>
     *        methods.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GET,HEAD,OPTIONS</code> - The distribution caches responses to the <code>GET</code>,
     *        <code>HEAD</code>, and <code>OPTIONS</code> methods.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSettings withCachedHTTPMethods(String cachedHTTPMethods) {
        setCachedHTTPMethods(cachedHTTPMethods);
        return this;
    }

    /**
     * <p>
     * An object that describes the cookies that are forwarded to the origin. Your content is cached based on the
     * cookies that are forwarded.
     * </p>
     * 
     * @param forwardedCookies
     *        An object that describes the cookies that are forwarded to the origin. Your content is cached based on the
     *        cookies that are forwarded.
     */

    public void setForwardedCookies(CookieObject forwardedCookies) {
        this.forwardedCookies = forwardedCookies;
    }

    /**
     * <p>
     * An object that describes the cookies that are forwarded to the origin. Your content is cached based on the
     * cookies that are forwarded.
     * </p>
     * 
     * @return An object that describes the cookies that are forwarded to the origin. Your content is cached based on
     *         the cookies that are forwarded.
     */

    public CookieObject getForwardedCookies() {
        return this.forwardedCookies;
    }

    /**
     * <p>
     * An object that describes the cookies that are forwarded to the origin. Your content is cached based on the
     * cookies that are forwarded.
     * </p>
     * 
     * @param forwardedCookies
     *        An object that describes the cookies that are forwarded to the origin. Your content is cached based on the
     *        cookies that are forwarded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSettings withForwardedCookies(CookieObject forwardedCookies) {
        setForwardedCookies(forwardedCookies);
        return this;
    }

    /**
     * <p>
     * An object that describes the headers that are forwarded to the origin. Your content is cached based on the
     * headers that are forwarded.
     * </p>
     * 
     * @param forwardedHeaders
     *        An object that describes the headers that are forwarded to the origin. Your content is cached based on the
     *        headers that are forwarded.
     */

    public void setForwardedHeaders(HeaderObject forwardedHeaders) {
        this.forwardedHeaders = forwardedHeaders;
    }

    /**
     * <p>
     * An object that describes the headers that are forwarded to the origin. Your content is cached based on the
     * headers that are forwarded.
     * </p>
     * 
     * @return An object that describes the headers that are forwarded to the origin. Your content is cached based on
     *         the headers that are forwarded.
     */

    public HeaderObject getForwardedHeaders() {
        return this.forwardedHeaders;
    }

    /**
     * <p>
     * An object that describes the headers that are forwarded to the origin. Your content is cached based on the
     * headers that are forwarded.
     * </p>
     * 
     * @param forwardedHeaders
     *        An object that describes the headers that are forwarded to the origin. Your content is cached based on the
     *        headers that are forwarded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSettings withForwardedHeaders(HeaderObject forwardedHeaders) {
        setForwardedHeaders(forwardedHeaders);
        return this;
    }

    /**
     * <p>
     * An object that describes the query strings that are forwarded to the origin. Your content is cached based on the
     * query strings that are forwarded.
     * </p>
     * 
     * @param forwardedQueryStrings
     *        An object that describes the query strings that are forwarded to the origin. Your content is cached based
     *        on the query strings that are forwarded.
     */

    public void setForwardedQueryStrings(QueryStringObject forwardedQueryStrings) {
        this.forwardedQueryStrings = forwardedQueryStrings;
    }

    /**
     * <p>
     * An object that describes the query strings that are forwarded to the origin. Your content is cached based on the
     * query strings that are forwarded.
     * </p>
     * 
     * @return An object that describes the query strings that are forwarded to the origin. Your content is cached based
     *         on the query strings that are forwarded.
     */

    public QueryStringObject getForwardedQueryStrings() {
        return this.forwardedQueryStrings;
    }

    /**
     * <p>
     * An object that describes the query strings that are forwarded to the origin. Your content is cached based on the
     * query strings that are forwarded.
     * </p>
     * 
     * @param forwardedQueryStrings
     *        An object that describes the query strings that are forwarded to the origin. Your content is cached based
     *        on the query strings that are forwarded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheSettings withForwardedQueryStrings(QueryStringObject forwardedQueryStrings) {
        setForwardedQueryStrings(forwardedQueryStrings);
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
        if (getDefaultTTL() != null)
            sb.append("DefaultTTL: ").append(getDefaultTTL()).append(",");
        if (getMinimumTTL() != null)
            sb.append("MinimumTTL: ").append(getMinimumTTL()).append(",");
        if (getMaximumTTL() != null)
            sb.append("MaximumTTL: ").append(getMaximumTTL()).append(",");
        if (getAllowedHTTPMethods() != null)
            sb.append("AllowedHTTPMethods: ").append(getAllowedHTTPMethods()).append(",");
        if (getCachedHTTPMethods() != null)
            sb.append("CachedHTTPMethods: ").append(getCachedHTTPMethods()).append(",");
        if (getForwardedCookies() != null)
            sb.append("ForwardedCookies: ").append(getForwardedCookies()).append(",");
        if (getForwardedHeaders() != null)
            sb.append("ForwardedHeaders: ").append(getForwardedHeaders()).append(",");
        if (getForwardedQueryStrings() != null)
            sb.append("ForwardedQueryStrings: ").append(getForwardedQueryStrings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheSettings == false)
            return false;
        CacheSettings other = (CacheSettings) obj;
        if (other.getDefaultTTL() == null ^ this.getDefaultTTL() == null)
            return false;
        if (other.getDefaultTTL() != null && other.getDefaultTTL().equals(this.getDefaultTTL()) == false)
            return false;
        if (other.getMinimumTTL() == null ^ this.getMinimumTTL() == null)
            return false;
        if (other.getMinimumTTL() != null && other.getMinimumTTL().equals(this.getMinimumTTL()) == false)
            return false;
        if (other.getMaximumTTL() == null ^ this.getMaximumTTL() == null)
            return false;
        if (other.getMaximumTTL() != null && other.getMaximumTTL().equals(this.getMaximumTTL()) == false)
            return false;
        if (other.getAllowedHTTPMethods() == null ^ this.getAllowedHTTPMethods() == null)
            return false;
        if (other.getAllowedHTTPMethods() != null && other.getAllowedHTTPMethods().equals(this.getAllowedHTTPMethods()) == false)
            return false;
        if (other.getCachedHTTPMethods() == null ^ this.getCachedHTTPMethods() == null)
            return false;
        if (other.getCachedHTTPMethods() != null && other.getCachedHTTPMethods().equals(this.getCachedHTTPMethods()) == false)
            return false;
        if (other.getForwardedCookies() == null ^ this.getForwardedCookies() == null)
            return false;
        if (other.getForwardedCookies() != null && other.getForwardedCookies().equals(this.getForwardedCookies()) == false)
            return false;
        if (other.getForwardedHeaders() == null ^ this.getForwardedHeaders() == null)
            return false;
        if (other.getForwardedHeaders() != null && other.getForwardedHeaders().equals(this.getForwardedHeaders()) == false)
            return false;
        if (other.getForwardedQueryStrings() == null ^ this.getForwardedQueryStrings() == null)
            return false;
        if (other.getForwardedQueryStrings() != null && other.getForwardedQueryStrings().equals(this.getForwardedQueryStrings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultTTL() == null) ? 0 : getDefaultTTL().hashCode());
        hashCode = prime * hashCode + ((getMinimumTTL() == null) ? 0 : getMinimumTTL().hashCode());
        hashCode = prime * hashCode + ((getMaximumTTL() == null) ? 0 : getMaximumTTL().hashCode());
        hashCode = prime * hashCode + ((getAllowedHTTPMethods() == null) ? 0 : getAllowedHTTPMethods().hashCode());
        hashCode = prime * hashCode + ((getCachedHTTPMethods() == null) ? 0 : getCachedHTTPMethods().hashCode());
        hashCode = prime * hashCode + ((getForwardedCookies() == null) ? 0 : getForwardedCookies().hashCode());
        hashCode = prime * hashCode + ((getForwardedHeaders() == null) ? 0 : getForwardedHeaders().hashCode());
        hashCode = prime * hashCode + ((getForwardedQueryStrings() == null) ? 0 : getForwardedQueryStrings().hashCode());
        return hashCode;
    }

    @Override
    public CacheSettings clone() {
        try {
            return (CacheSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.CacheSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
