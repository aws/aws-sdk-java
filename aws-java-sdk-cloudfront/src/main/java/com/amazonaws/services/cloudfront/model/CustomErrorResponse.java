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
 * A complex type that controls:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning
 * the response to the viewer.
 * </p>
 * </li>
 * <li>
 * <p>
 * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about custom error pages, see <a
 * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html">Customizing Error
 * Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CustomErrorResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomErrorResponse implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP status code for which you want to specify a custom error page and/or a caching duration.
     * </p>
     */
    private Integer errorCode;
    /**
     * <p>
     * The path to the custom error page that you want CloudFront to return to a viewer when your origin returns the
     * HTTP status code specified by <code>ErrorCode</code>, for example, <code>/4xx-errors/403-forbidden.html</code>.
     * If you want to store your objects and your custom error pages in different locations, your distribution must
     * include a cache behavior for which the following is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>PathPattern</code> matches the path to your custom error messages. For example, suppose you
     * saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory named <code>/4xx-errors</code>.
     * Your distribution must include a cache behavior for which the path pattern routes requests for your custom error
     * pages to that location, for example, <code>/4xx-errors/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>TargetOriginId</code> specifies the value of the <code>ID</code> element for the origin that
     * contains your custom error pages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponsePagePath</code>, you must also specify a value for
     * <code>ResponseCode</code>. If you don't want to specify a value, include an empty element,
     * <code>&lt;ResponsePagePath&gt;</code>, in the XML document.
     * </p>
     * <p>
     * We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom error pages on an HTTP
     * server and the server starts to return 5xx errors, CloudFront can't get the files that you want to return to
     * viewers because the origin server is unavailable.
     * </p>
     */
    private String responsePagePath;
    /**
     * <p>
     * The HTTP status code that you want CloudFront to return to the viewer along with the custom error page. There are
     * a variety of reasons that you might want CloudFront to return a status code different from the status code that
     * your origin returned to CloudFront, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP 4xx and 5xx and prevent
     * the response from being returned to the viewer. If you substitute <code>200</code>, the response typically won't
     * be intercepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't care about distinguishing among different client errors or server errors, you can specify
     * <code>400</code> or <code>500</code> as the <code>ResponseCode</code> for all 4xx or 5xx errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might want to return a <code>200</code> status code (OK) and static website so your customers don't know that
     * your website is down.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponseCode</code>, you must also specify a value for
     * <code>ResponsePagePath</code>. If you don't want to specify a value, include an empty element,
     * <code>&lt;ResponseCode&gt;</code>, in the XML document.
     * </p>
     */
    private String responseCode;
    /**
     * <p>
     * The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status code specified in
     * <code>ErrorCode</code>. When this time period has elapsed, CloudFront queries your origin to see whether the
     * problem that caused the error has been resolved and the requested object is now available.
     * </p>
     * <p>
     * If you don't want to specify a value, include an empty element, <code>&lt;ErrorCachingMinTTL&gt;</code>, in the
     * XML document.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html">Customizing
     * Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private Long errorCachingMinTTL;

    /**
     * <p>
     * The HTTP status code for which you want to specify a custom error page and/or a caching duration.
     * </p>
     * 
     * @param errorCode
     *        The HTTP status code for which you want to specify a custom error page and/or a caching duration.
     */

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The HTTP status code for which you want to specify a custom error page and/or a caching duration.
     * </p>
     * 
     * @return The HTTP status code for which you want to specify a custom error page and/or a caching duration.
     */

    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The HTTP status code for which you want to specify a custom error page and/or a caching duration.
     * </p>
     * 
     * @param errorCode
     *        The HTTP status code for which you want to specify a custom error page and/or a caching duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomErrorResponse withErrorCode(Integer errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The path to the custom error page that you want CloudFront to return to a viewer when your origin returns the
     * HTTP status code specified by <code>ErrorCode</code>, for example, <code>/4xx-errors/403-forbidden.html</code>.
     * If you want to store your objects and your custom error pages in different locations, your distribution must
     * include a cache behavior for which the following is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>PathPattern</code> matches the path to your custom error messages. For example, suppose you
     * saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory named <code>/4xx-errors</code>.
     * Your distribution must include a cache behavior for which the path pattern routes requests for your custom error
     * pages to that location, for example, <code>/4xx-errors/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>TargetOriginId</code> specifies the value of the <code>ID</code> element for the origin that
     * contains your custom error pages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponsePagePath</code>, you must also specify a value for
     * <code>ResponseCode</code>. If you don't want to specify a value, include an empty element,
     * <code>&lt;ResponsePagePath&gt;</code>, in the XML document.
     * </p>
     * <p>
     * We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom error pages on an HTTP
     * server and the server starts to return 5xx errors, CloudFront can't get the files that you want to return to
     * viewers because the origin server is unavailable.
     * </p>
     * 
     * @param responsePagePath
     *        The path to the custom error page that you want CloudFront to return to a viewer when your origin returns
     *        the HTTP status code specified by <code>ErrorCode</code>, for example,
     *        <code>/4xx-errors/403-forbidden.html</code>. If you want to store your objects and your custom error pages
     *        in different locations, your distribution must include a cache behavior for which the following is
     *        true:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value of <code>PathPattern</code> matches the path to your custom error messages. For example, suppose
     *        you saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory named
     *        <code>/4xx-errors</code>. Your distribution must include a cache behavior for which the path pattern
     *        routes requests for your custom error pages to that location, for example, <code>/4xx-errors/*</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>TargetOriginId</code> specifies the value of the <code>ID</code> element for the origin
     *        that contains your custom error pages.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify a value for <code>ResponsePagePath</code>, you must also specify a value for
     *        <code>ResponseCode</code>. If you don't want to specify a value, include an empty element,
     *        <code>&lt;ResponsePagePath&gt;</code>, in the XML document.
     *        </p>
     *        <p>
     *        We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom error pages on
     *        an HTTP server and the server starts to return 5xx errors, CloudFront can't get the files that you want to
     *        return to viewers because the origin server is unavailable.
     */

    public void setResponsePagePath(String responsePagePath) {
        this.responsePagePath = responsePagePath;
    }

    /**
     * <p>
     * The path to the custom error page that you want CloudFront to return to a viewer when your origin returns the
     * HTTP status code specified by <code>ErrorCode</code>, for example, <code>/4xx-errors/403-forbidden.html</code>.
     * If you want to store your objects and your custom error pages in different locations, your distribution must
     * include a cache behavior for which the following is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>PathPattern</code> matches the path to your custom error messages. For example, suppose you
     * saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory named <code>/4xx-errors</code>.
     * Your distribution must include a cache behavior for which the path pattern routes requests for your custom error
     * pages to that location, for example, <code>/4xx-errors/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>TargetOriginId</code> specifies the value of the <code>ID</code> element for the origin that
     * contains your custom error pages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponsePagePath</code>, you must also specify a value for
     * <code>ResponseCode</code>. If you don't want to specify a value, include an empty element,
     * <code>&lt;ResponsePagePath&gt;</code>, in the XML document.
     * </p>
     * <p>
     * We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom error pages on an HTTP
     * server and the server starts to return 5xx errors, CloudFront can't get the files that you want to return to
     * viewers because the origin server is unavailable.
     * </p>
     * 
     * @return The path to the custom error page that you want CloudFront to return to a viewer when your origin returns
     *         the HTTP status code specified by <code>ErrorCode</code>, for example,
     *         <code>/4xx-errors/403-forbidden.html</code>. If you want to store your objects and your custom error
     *         pages in different locations, your distribution must include a cache behavior for which the following is
     *         true:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The value of <code>PathPattern</code> matches the path to your custom error messages. For example,
     *         suppose you saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory named
     *         <code>/4xx-errors</code>. Your distribution must include a cache behavior for which the path pattern
     *         routes requests for your custom error pages to that location, for example, <code>/4xx-errors/*</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of <code>TargetOriginId</code> specifies the value of the <code>ID</code> element for the
     *         origin that contains your custom error pages.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify a value for <code>ResponsePagePath</code>, you must also specify a value for
     *         <code>ResponseCode</code>. If you don't want to specify a value, include an empty element,
     *         <code>&lt;ResponsePagePath&gt;</code>, in the XML document.
     *         </p>
     *         <p>
     *         We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom error pages on
     *         an HTTP server and the server starts to return 5xx errors, CloudFront can't get the files that you want
     *         to return to viewers because the origin server is unavailable.
     */

    public String getResponsePagePath() {
        return this.responsePagePath;
    }

    /**
     * <p>
     * The path to the custom error page that you want CloudFront to return to a viewer when your origin returns the
     * HTTP status code specified by <code>ErrorCode</code>, for example, <code>/4xx-errors/403-forbidden.html</code>.
     * If you want to store your objects and your custom error pages in different locations, your distribution must
     * include a cache behavior for which the following is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>PathPattern</code> matches the path to your custom error messages. For example, suppose you
     * saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory named <code>/4xx-errors</code>.
     * Your distribution must include a cache behavior for which the path pattern routes requests for your custom error
     * pages to that location, for example, <code>/4xx-errors/*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>TargetOriginId</code> specifies the value of the <code>ID</code> element for the origin that
     * contains your custom error pages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponsePagePath</code>, you must also specify a value for
     * <code>ResponseCode</code>. If you don't want to specify a value, include an empty element,
     * <code>&lt;ResponsePagePath&gt;</code>, in the XML document.
     * </p>
     * <p>
     * We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom error pages on an HTTP
     * server and the server starts to return 5xx errors, CloudFront can't get the files that you want to return to
     * viewers because the origin server is unavailable.
     * </p>
     * 
     * @param responsePagePath
     *        The path to the custom error page that you want CloudFront to return to a viewer when your origin returns
     *        the HTTP status code specified by <code>ErrorCode</code>, for example,
     *        <code>/4xx-errors/403-forbidden.html</code>. If you want to store your objects and your custom error pages
     *        in different locations, your distribution must include a cache behavior for which the following is
     *        true:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value of <code>PathPattern</code> matches the path to your custom error messages. For example, suppose
     *        you saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory named
     *        <code>/4xx-errors</code>. Your distribution must include a cache behavior for which the path pattern
     *        routes requests for your custom error pages to that location, for example, <code>/4xx-errors/*</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>TargetOriginId</code> specifies the value of the <code>ID</code> element for the origin
     *        that contains your custom error pages.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify a value for <code>ResponsePagePath</code>, you must also specify a value for
     *        <code>ResponseCode</code>. If you don't want to specify a value, include an empty element,
     *        <code>&lt;ResponsePagePath&gt;</code>, in the XML document.
     *        </p>
     *        <p>
     *        We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom error pages on
     *        an HTTP server and the server starts to return 5xx errors, CloudFront can't get the files that you want to
     *        return to viewers because the origin server is unavailable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomErrorResponse withResponsePagePath(String responsePagePath) {
        setResponsePagePath(responsePagePath);
        return this;
    }

    /**
     * <p>
     * The HTTP status code that you want CloudFront to return to the viewer along with the custom error page. There are
     * a variety of reasons that you might want CloudFront to return a status code different from the status code that
     * your origin returned to CloudFront, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP 4xx and 5xx and prevent
     * the response from being returned to the viewer. If you substitute <code>200</code>, the response typically won't
     * be intercepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't care about distinguishing among different client errors or server errors, you can specify
     * <code>400</code> or <code>500</code> as the <code>ResponseCode</code> for all 4xx or 5xx errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might want to return a <code>200</code> status code (OK) and static website so your customers don't know that
     * your website is down.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponseCode</code>, you must also specify a value for
     * <code>ResponsePagePath</code>. If you don't want to specify a value, include an empty element,
     * <code>&lt;ResponseCode&gt;</code>, in the XML document.
     * </p>
     * 
     * @param responseCode
     *        The HTTP status code that you want CloudFront to return to the viewer along with the custom error page.
     *        There are a variety of reasons that you might want CloudFront to return a status code different from the
     *        status code that your origin returned to CloudFront, for example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP 4xx and 5xx and
     *        prevent the response from being returned to the viewer. If you substitute <code>200</code>, the response
     *        typically won't be intercepted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't care about distinguishing among different client errors or server errors, you can specify
     *        <code>400</code> or <code>500</code> as the <code>ResponseCode</code> for all 4xx or 5xx errors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You might want to return a <code>200</code> status code (OK) and static website so your customers don't
     *        know that your website is down.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify a value for <code>ResponseCode</code>, you must also specify a value for
     *        <code>ResponsePagePath</code>. If you don't want to specify a value, include an empty element,
     *        <code>&lt;ResponseCode&gt;</code>, in the XML document.
     */

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * The HTTP status code that you want CloudFront to return to the viewer along with the custom error page. There are
     * a variety of reasons that you might want CloudFront to return a status code different from the status code that
     * your origin returned to CloudFront, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP 4xx and 5xx and prevent
     * the response from being returned to the viewer. If you substitute <code>200</code>, the response typically won't
     * be intercepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't care about distinguishing among different client errors or server errors, you can specify
     * <code>400</code> or <code>500</code> as the <code>ResponseCode</code> for all 4xx or 5xx errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might want to return a <code>200</code> status code (OK) and static website so your customers don't know that
     * your website is down.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponseCode</code>, you must also specify a value for
     * <code>ResponsePagePath</code>. If you don't want to specify a value, include an empty element,
     * <code>&lt;ResponseCode&gt;</code>, in the XML document.
     * </p>
     * 
     * @return The HTTP status code that you want CloudFront to return to the viewer along with the custom error page.
     *         There are a variety of reasons that you might want CloudFront to return a status code different from the
     *         status code that your origin returned to CloudFront, for example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP 4xx and 5xx and
     *         prevent the response from being returned to the viewer. If you substitute <code>200</code>, the response
     *         typically won't be intercepted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't care about distinguishing among different client errors or server errors, you can specify
     *         <code>400</code> or <code>500</code> as the <code>ResponseCode</code> for all 4xx or 5xx errors.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You might want to return a <code>200</code> status code (OK) and static website so your customers don't
     *         know that your website is down.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify a value for <code>ResponseCode</code>, you must also specify a value for
     *         <code>ResponsePagePath</code>. If you don't want to specify a value, include an empty element,
     *         <code>&lt;ResponseCode&gt;</code>, in the XML document.
     */

    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * <p>
     * The HTTP status code that you want CloudFront to return to the viewer along with the custom error page. There are
     * a variety of reasons that you might want CloudFront to return a status code different from the status code that
     * your origin returned to CloudFront, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP 4xx and 5xx and prevent
     * the response from being returned to the viewer. If you substitute <code>200</code>, the response typically won't
     * be intercepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't care about distinguishing among different client errors or server errors, you can specify
     * <code>400</code> or <code>500</code> as the <code>ResponseCode</code> for all 4xx or 5xx errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might want to return a <code>200</code> status code (OK) and static website so your customers don't know that
     * your website is down.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a value for <code>ResponseCode</code>, you must also specify a value for
     * <code>ResponsePagePath</code>. If you don't want to specify a value, include an empty element,
     * <code>&lt;ResponseCode&gt;</code>, in the XML document.
     * </p>
     * 
     * @param responseCode
     *        The HTTP status code that you want CloudFront to return to the viewer along with the custom error page.
     *        There are a variety of reasons that you might want CloudFront to return a status code different from the
     *        status code that your origin returned to CloudFront, for example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP 4xx and 5xx and
     *        prevent the response from being returned to the viewer. If you substitute <code>200</code>, the response
     *        typically won't be intercepted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't care about distinguishing among different client errors or server errors, you can specify
     *        <code>400</code> or <code>500</code> as the <code>ResponseCode</code> for all 4xx or 5xx errors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You might want to return a <code>200</code> status code (OK) and static website so your customers don't
     *        know that your website is down.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify a value for <code>ResponseCode</code>, you must also specify a value for
     *        <code>ResponsePagePath</code>. If you don't want to specify a value, include an empty element,
     *        <code>&lt;ResponseCode&gt;</code>, in the XML document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomErrorResponse withResponseCode(String responseCode) {
        setResponseCode(responseCode);
        return this;
    }

    /**
     * <p>
     * The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status code specified in
     * <code>ErrorCode</code>. When this time period has elapsed, CloudFront queries your origin to see whether the
     * problem that caused the error has been resolved and the requested object is now available.
     * </p>
     * <p>
     * If you don't want to specify a value, include an empty element, <code>&lt;ErrorCachingMinTTL&gt;</code>, in the
     * XML document.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html">Customizing
     * Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param errorCachingMinTTL
     *        The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status code specified
     *        in <code>ErrorCode</code>. When this time period has elapsed, CloudFront queries your origin to see
     *        whether the problem that caused the error has been resolved and the requested object is now available.</p>
     *        <p>
     *        If you don't want to specify a value, include an empty element, <code>&lt;ErrorCachingMinTTL&gt;</code>,
     *        in the XML document.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     *        >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setErrorCachingMinTTL(Long errorCachingMinTTL) {
        this.errorCachingMinTTL = errorCachingMinTTL;
    }

    /**
     * <p>
     * The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status code specified in
     * <code>ErrorCode</code>. When this time period has elapsed, CloudFront queries your origin to see whether the
     * problem that caused the error has been resolved and the requested object is now available.
     * </p>
     * <p>
     * If you don't want to specify a value, include an empty element, <code>&lt;ErrorCachingMinTTL&gt;</code>, in the
     * XML document.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html">Customizing
     * Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status code specified
     *         in <code>ErrorCode</code>. When this time period has elapsed, CloudFront queries your origin to see
     *         whether the problem that caused the error has been resolved and the requested object is now
     *         available.</p>
     *         <p>
     *         If you don't want to specify a value, include an empty element, <code>&lt;ErrorCachingMinTTL&gt;</code>,
     *         in the XML document.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     *         >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public Long getErrorCachingMinTTL() {
        return this.errorCachingMinTTL;
    }

    /**
     * <p>
     * The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status code specified in
     * <code>ErrorCode</code>. When this time period has elapsed, CloudFront queries your origin to see whether the
     * problem that caused the error has been resolved and the requested object is now available.
     * </p>
     * <p>
     * If you don't want to specify a value, include an empty element, <code>&lt;ErrorCachingMinTTL&gt;</code>, in the
     * XML document.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html">Customizing
     * Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param errorCachingMinTTL
     *        The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status code specified
     *        in <code>ErrorCode</code>. When this time period has elapsed, CloudFront queries your origin to see
     *        whether the problem that caused the error has been resolved and the requested object is now available.</p>
     *        <p>
     *        If you don't want to specify a value, include an empty element, <code>&lt;ErrorCachingMinTTL&gt;</code>,
     *        in the XML document.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
     *        >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomErrorResponse withErrorCachingMinTTL(Long errorCachingMinTTL) {
        setErrorCachingMinTTL(errorCachingMinTTL);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getResponsePagePath() != null)
            sb.append("ResponsePagePath: ").append(getResponsePagePath()).append(",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: ").append(getResponseCode()).append(",");
        if (getErrorCachingMinTTL() != null)
            sb.append("ErrorCachingMinTTL: ").append(getErrorCachingMinTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomErrorResponse == false)
            return false;
        CustomErrorResponse other = (CustomErrorResponse) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getResponsePagePath() == null ^ this.getResponsePagePath() == null)
            return false;
        if (other.getResponsePagePath() != null && other.getResponsePagePath().equals(this.getResponsePagePath()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getErrorCachingMinTTL() == null ^ this.getErrorCachingMinTTL() == null)
            return false;
        if (other.getErrorCachingMinTTL() != null && other.getErrorCachingMinTTL().equals(this.getErrorCachingMinTTL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getResponsePagePath() == null) ? 0 : getResponsePagePath().hashCode());
        hashCode = prime * hashCode + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode + ((getErrorCachingMinTTL() == null) ? 0 : getErrorCachingMinTTL().hashCode());
        return hashCode;
    }

    @Override
    public CustomErrorResponse clone() {
        try {
            return (CustomErrorResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
