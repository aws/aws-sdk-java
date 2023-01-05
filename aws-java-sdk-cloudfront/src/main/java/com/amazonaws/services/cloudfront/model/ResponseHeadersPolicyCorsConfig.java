/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A configuration for a set of HTTP response headers that are used for cross-origin resource sharing (CORS). CloudFront
 * adds these headers to HTTP responses that it sends for CORS requests that match a cache behavior associated with this
 * response headers policy.
 * </p>
 * <p>
 * For more information about CORS, see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS">Cross-Origin
 * Resource Sharing (CORS)</a> in the MDN Web Docs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyCorsConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyCorsConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A list of origins (domain names) that CloudFront can use as the value for the
     * <code>Access-Control-Allow-Origin</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Origin</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin"
     * >Access-Control-Allow-Origin</a> in the MDN Web Docs.
     * </p>
     */
    private ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins;
    /**
     * <p>
     * A list of HTTP header names that CloudFront includes as values for the <code>Access-Control-Allow-Headers</code>
     * HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Headers</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers"
     * >Access-Control-Allow-Headers</a> in the MDN Web Docs.
     * </p>
     */
    private ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders;
    /**
     * <p>
     * A list of HTTP methods that CloudFront includes as values for the <code>Access-Control-Allow-Methods</code> HTTP
     * response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Methods</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods"
     * >Access-Control-Allow-Methods</a> in the MDN Web Docs.
     * </p>
     */
    private ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods;
    /**
     * <p>
     * A Boolean that CloudFront uses as the value for the <code>Access-Control-Allow-Credentials</code> HTTP response
     * header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Credentials</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials"
     * >Access-Control-Allow-Credentials</a> in the MDN Web Docs.
     * </p>
     */
    private Boolean accessControlAllowCredentials;
    /**
     * <p>
     * A list of HTTP headers that CloudFront includes as values for the <code>Access-Control-Expose-Headers</code> HTTP
     * response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Expose-Headers</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers"
     * >Access-Control-Expose-Headers</a> in the MDN Web Docs.
     * </p>
     */
    private ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders;
    /**
     * <p>
     * A number that CloudFront uses as the value for the <code>Access-Control-Max-Age</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Max-Age</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age"
     * >Access-Control-Max-Age</a> in the MDN Web Docs.
     * </p>
     */
    private Integer accessControlMaxAgeSec;
    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides HTTP response headers received from the origin with the
     * ones specified in this response headers policy.
     * </p>
     */
    private Boolean originOverride;

    /**
     * <p>
     * A list of origins (domain names) that CloudFront can use as the value for the
     * <code>Access-Control-Allow-Origin</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Origin</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin"
     * >Access-Control-Allow-Origin</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlAllowOrigins
     *        A list of origins (domain names) that CloudFront can use as the value for the
     *        <code>Access-Control-Allow-Origin</code> HTTP response header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Allow-Origin</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin"
     *        >Access-Control-Allow-Origin</a> in the MDN Web Docs.
     */

    public void setAccessControlAllowOrigins(ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins) {
        this.accessControlAllowOrigins = accessControlAllowOrigins;
    }

    /**
     * <p>
     * A list of origins (domain names) that CloudFront can use as the value for the
     * <code>Access-Control-Allow-Origin</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Origin</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin"
     * >Access-Control-Allow-Origin</a> in the MDN Web Docs.
     * </p>
     * 
     * @return A list of origins (domain names) that CloudFront can use as the value for the
     *         <code>Access-Control-Allow-Origin</code> HTTP response header.</p>
     *         <p>
     *         For more information about the <code>Access-Control-Allow-Origin</code> HTTP response header, see <a
     *         href=
     *         "https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin">Access-Control
     *         -Allow-Origin</a> in the MDN Web Docs.
     */

    public ResponseHeadersPolicyAccessControlAllowOrigins getAccessControlAllowOrigins() {
        return this.accessControlAllowOrigins;
    }

    /**
     * <p>
     * A list of origins (domain names) that CloudFront can use as the value for the
     * <code>Access-Control-Allow-Origin</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Origin</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin"
     * >Access-Control-Allow-Origin</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlAllowOrigins
     *        A list of origins (domain names) that CloudFront can use as the value for the
     *        <code>Access-Control-Allow-Origin</code> HTTP response header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Allow-Origin</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin"
     *        >Access-Control-Allow-Origin</a> in the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyCorsConfig withAccessControlAllowOrigins(ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins) {
        setAccessControlAllowOrigins(accessControlAllowOrigins);
        return this;
    }

    /**
     * <p>
     * A list of HTTP header names that CloudFront includes as values for the <code>Access-Control-Allow-Headers</code>
     * HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Headers</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers"
     * >Access-Control-Allow-Headers</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlAllowHeaders
     *        A list of HTTP header names that CloudFront includes as values for the
     *        <code>Access-Control-Allow-Headers</code> HTTP response header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Allow-Headers</code> HTTP response header, see <a
     *        href=
     *        "https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers">Access-Control
     *        -Allow-Headers</a> in the MDN Web Docs.
     */

    public void setAccessControlAllowHeaders(ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders) {
        this.accessControlAllowHeaders = accessControlAllowHeaders;
    }

    /**
     * <p>
     * A list of HTTP header names that CloudFront includes as values for the <code>Access-Control-Allow-Headers</code>
     * HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Headers</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers"
     * >Access-Control-Allow-Headers</a> in the MDN Web Docs.
     * </p>
     * 
     * @return A list of HTTP header names that CloudFront includes as values for the
     *         <code>Access-Control-Allow-Headers</code> HTTP response header.</p>
     *         <p>
     *         For more information about the <code>Access-Control-Allow-Headers</code> HTTP response header, see <a
     *         href
     *         ="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers">Access-Control
     *         -Allow-Headers</a> in the MDN Web Docs.
     */

    public ResponseHeadersPolicyAccessControlAllowHeaders getAccessControlAllowHeaders() {
        return this.accessControlAllowHeaders;
    }

    /**
     * <p>
     * A list of HTTP header names that CloudFront includes as values for the <code>Access-Control-Allow-Headers</code>
     * HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Headers</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers"
     * >Access-Control-Allow-Headers</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlAllowHeaders
     *        A list of HTTP header names that CloudFront includes as values for the
     *        <code>Access-Control-Allow-Headers</code> HTTP response header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Allow-Headers</code> HTTP response header, see <a
     *        href=
     *        "https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers">Access-Control
     *        -Allow-Headers</a> in the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyCorsConfig withAccessControlAllowHeaders(ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders) {
        setAccessControlAllowHeaders(accessControlAllowHeaders);
        return this;
    }

    /**
     * <p>
     * A list of HTTP methods that CloudFront includes as values for the <code>Access-Control-Allow-Methods</code> HTTP
     * response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Methods</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods"
     * >Access-Control-Allow-Methods</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlAllowMethods
     *        A list of HTTP methods that CloudFront includes as values for the
     *        <code>Access-Control-Allow-Methods</code> HTTP response header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Allow-Methods</code> HTTP response header, see <a
     *        href=
     *        "https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods">Access-Control
     *        -Allow-Methods</a> in the MDN Web Docs.
     */

    public void setAccessControlAllowMethods(ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods) {
        this.accessControlAllowMethods = accessControlAllowMethods;
    }

    /**
     * <p>
     * A list of HTTP methods that CloudFront includes as values for the <code>Access-Control-Allow-Methods</code> HTTP
     * response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Methods</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods"
     * >Access-Control-Allow-Methods</a> in the MDN Web Docs.
     * </p>
     * 
     * @return A list of HTTP methods that CloudFront includes as values for the
     *         <code>Access-Control-Allow-Methods</code> HTTP response header.</p>
     *         <p>
     *         For more information about the <code>Access-Control-Allow-Methods</code> HTTP response header, see <a
     *         href
     *         ="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods">Access-Control
     *         -Allow-Methods</a> in the MDN Web Docs.
     */

    public ResponseHeadersPolicyAccessControlAllowMethods getAccessControlAllowMethods() {
        return this.accessControlAllowMethods;
    }

    /**
     * <p>
     * A list of HTTP methods that CloudFront includes as values for the <code>Access-Control-Allow-Methods</code> HTTP
     * response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Methods</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods"
     * >Access-Control-Allow-Methods</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlAllowMethods
     *        A list of HTTP methods that CloudFront includes as values for the
     *        <code>Access-Control-Allow-Methods</code> HTTP response header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Allow-Methods</code> HTTP response header, see <a
     *        href=
     *        "https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods">Access-Control
     *        -Allow-Methods</a> in the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyCorsConfig withAccessControlAllowMethods(ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods) {
        setAccessControlAllowMethods(accessControlAllowMethods);
        return this;
    }

    /**
     * <p>
     * A Boolean that CloudFront uses as the value for the <code>Access-Control-Allow-Credentials</code> HTTP response
     * header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Credentials</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials"
     * >Access-Control-Allow-Credentials</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlAllowCredentials
     *        A Boolean that CloudFront uses as the value for the <code>Access-Control-Allow-Credentials</code> HTTP
     *        response header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Allow-Credentials</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials">Access-
     *        Control-Allow-Credentials</a> in the MDN Web Docs.
     */

    public void setAccessControlAllowCredentials(Boolean accessControlAllowCredentials) {
        this.accessControlAllowCredentials = accessControlAllowCredentials;
    }

    /**
     * <p>
     * A Boolean that CloudFront uses as the value for the <code>Access-Control-Allow-Credentials</code> HTTP response
     * header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Credentials</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials"
     * >Access-Control-Allow-Credentials</a> in the MDN Web Docs.
     * </p>
     * 
     * @return A Boolean that CloudFront uses as the value for the <code>Access-Control-Allow-Credentials</code> HTTP
     *         response header.</p>
     *         <p>
     *         For more information about the <code>Access-Control-Allow-Credentials</code> HTTP response header, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials">Access-
     *         Control-Allow-Credentials</a> in the MDN Web Docs.
     */

    public Boolean getAccessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }

    /**
     * <p>
     * A Boolean that CloudFront uses as the value for the <code>Access-Control-Allow-Credentials</code> HTTP response
     * header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Credentials</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials"
     * >Access-Control-Allow-Credentials</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlAllowCredentials
     *        A Boolean that CloudFront uses as the value for the <code>Access-Control-Allow-Credentials</code> HTTP
     *        response header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Allow-Credentials</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials">Access-
     *        Control-Allow-Credentials</a> in the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyCorsConfig withAccessControlAllowCredentials(Boolean accessControlAllowCredentials) {
        setAccessControlAllowCredentials(accessControlAllowCredentials);
        return this;
    }

    /**
     * <p>
     * A Boolean that CloudFront uses as the value for the <code>Access-Control-Allow-Credentials</code> HTTP response
     * header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Allow-Credentials</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials"
     * >Access-Control-Allow-Credentials</a> in the MDN Web Docs.
     * </p>
     * 
     * @return A Boolean that CloudFront uses as the value for the <code>Access-Control-Allow-Credentials</code> HTTP
     *         response header.</p>
     *         <p>
     *         For more information about the <code>Access-Control-Allow-Credentials</code> HTTP response header, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials">Access-
     *         Control-Allow-Credentials</a> in the MDN Web Docs.
     */

    public Boolean isAccessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }

    /**
     * <p>
     * A list of HTTP headers that CloudFront includes as values for the <code>Access-Control-Expose-Headers</code> HTTP
     * response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Expose-Headers</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers"
     * >Access-Control-Expose-Headers</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlExposeHeaders
     *        A list of HTTP headers that CloudFront includes as values for the
     *        <code>Access-Control-Expose-Headers</code> HTTP response header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Expose-Headers</code> HTTP response header, see <a
     *        href
     *        ="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers">Access-Control
     *        -Expose-Headers</a> in the MDN Web Docs.
     */

    public void setAccessControlExposeHeaders(ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders) {
        this.accessControlExposeHeaders = accessControlExposeHeaders;
    }

    /**
     * <p>
     * A list of HTTP headers that CloudFront includes as values for the <code>Access-Control-Expose-Headers</code> HTTP
     * response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Expose-Headers</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers"
     * >Access-Control-Expose-Headers</a> in the MDN Web Docs.
     * </p>
     * 
     * @return A list of HTTP headers that CloudFront includes as values for the
     *         <code>Access-Control-Expose-Headers</code> HTTP response header.</p>
     *         <p>
     *         For more information about the <code>Access-Control-Expose-Headers</code> HTTP response header, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers">Access-
     *         Control-Expose-Headers</a> in the MDN Web Docs.
     */

    public ResponseHeadersPolicyAccessControlExposeHeaders getAccessControlExposeHeaders() {
        return this.accessControlExposeHeaders;
    }

    /**
     * <p>
     * A list of HTTP headers that CloudFront includes as values for the <code>Access-Control-Expose-Headers</code> HTTP
     * response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Expose-Headers</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers"
     * >Access-Control-Expose-Headers</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlExposeHeaders
     *        A list of HTTP headers that CloudFront includes as values for the
     *        <code>Access-Control-Expose-Headers</code> HTTP response header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Expose-Headers</code> HTTP response header, see <a
     *        href
     *        ="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers">Access-Control
     *        -Expose-Headers</a> in the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyCorsConfig withAccessControlExposeHeaders(ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders) {
        setAccessControlExposeHeaders(accessControlExposeHeaders);
        return this;
    }

    /**
     * <p>
     * A number that CloudFront uses as the value for the <code>Access-Control-Max-Age</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Max-Age</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age"
     * >Access-Control-Max-Age</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlMaxAgeSec
     *        A number that CloudFront uses as the value for the <code>Access-Control-Max-Age</code> HTTP response
     *        header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Max-Age</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age"
     *        >Access-Control-Max-Age</a> in the MDN Web Docs.
     */

    public void setAccessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
        this.accessControlMaxAgeSec = accessControlMaxAgeSec;
    }

    /**
     * <p>
     * A number that CloudFront uses as the value for the <code>Access-Control-Max-Age</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Max-Age</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age"
     * >Access-Control-Max-Age</a> in the MDN Web Docs.
     * </p>
     * 
     * @return A number that CloudFront uses as the value for the <code>Access-Control-Max-Age</code> HTTP response
     *         header.</p>
     *         <p>
     *         For more information about the <code>Access-Control-Max-Age</code> HTTP response header, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age"
     *         >Access-Control-Max-Age</a> in the MDN Web Docs.
     */

    public Integer getAccessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec;
    }

    /**
     * <p>
     * A number that CloudFront uses as the value for the <code>Access-Control-Max-Age</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Access-Control-Max-Age</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age"
     * >Access-Control-Max-Age</a> in the MDN Web Docs.
     * </p>
     * 
     * @param accessControlMaxAgeSec
     *        A number that CloudFront uses as the value for the <code>Access-Control-Max-Age</code> HTTP response
     *        header.</p>
     *        <p>
     *        For more information about the <code>Access-Control-Max-Age</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age"
     *        >Access-Control-Max-Age</a> in the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyCorsConfig withAccessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
        setAccessControlMaxAgeSec(accessControlMaxAgeSec);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides HTTP response headers received from the origin with the
     * ones specified in this response headers policy.
     * </p>
     * 
     * @param originOverride
     *        A Boolean that determines whether CloudFront overrides HTTP response headers received from the origin with
     *        the ones specified in this response headers policy.
     */

    public void setOriginOverride(Boolean originOverride) {
        this.originOverride = originOverride;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides HTTP response headers received from the origin with the
     * ones specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides HTTP response headers received from the origin
     *         with the ones specified in this response headers policy.
     */

    public Boolean getOriginOverride() {
        return this.originOverride;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides HTTP response headers received from the origin with the
     * ones specified in this response headers policy.
     * </p>
     * 
     * @param originOverride
     *        A Boolean that determines whether CloudFront overrides HTTP response headers received from the origin with
     *        the ones specified in this response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyCorsConfig withOriginOverride(Boolean originOverride) {
        setOriginOverride(originOverride);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides HTTP response headers received from the origin with the
     * ones specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides HTTP response headers received from the origin
     *         with the ones specified in this response headers policy.
     */

    public Boolean isOriginOverride() {
        return this.originOverride;
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
        if (getAccessControlAllowOrigins() != null)
            sb.append("AccessControlAllowOrigins: ").append(getAccessControlAllowOrigins()).append(",");
        if (getAccessControlAllowHeaders() != null)
            sb.append("AccessControlAllowHeaders: ").append(getAccessControlAllowHeaders()).append(",");
        if (getAccessControlAllowMethods() != null)
            sb.append("AccessControlAllowMethods: ").append(getAccessControlAllowMethods()).append(",");
        if (getAccessControlAllowCredentials() != null)
            sb.append("AccessControlAllowCredentials: ").append(getAccessControlAllowCredentials()).append(",");
        if (getAccessControlExposeHeaders() != null)
            sb.append("AccessControlExposeHeaders: ").append(getAccessControlExposeHeaders()).append(",");
        if (getAccessControlMaxAgeSec() != null)
            sb.append("AccessControlMaxAgeSec: ").append(getAccessControlMaxAgeSec()).append(",");
        if (getOriginOverride() != null)
            sb.append("OriginOverride: ").append(getOriginOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyCorsConfig == false)
            return false;
        ResponseHeadersPolicyCorsConfig other = (ResponseHeadersPolicyCorsConfig) obj;
        if (other.getAccessControlAllowOrigins() == null ^ this.getAccessControlAllowOrigins() == null)
            return false;
        if (other.getAccessControlAllowOrigins() != null && other.getAccessControlAllowOrigins().equals(this.getAccessControlAllowOrigins()) == false)
            return false;
        if (other.getAccessControlAllowHeaders() == null ^ this.getAccessControlAllowHeaders() == null)
            return false;
        if (other.getAccessControlAllowHeaders() != null && other.getAccessControlAllowHeaders().equals(this.getAccessControlAllowHeaders()) == false)
            return false;
        if (other.getAccessControlAllowMethods() == null ^ this.getAccessControlAllowMethods() == null)
            return false;
        if (other.getAccessControlAllowMethods() != null && other.getAccessControlAllowMethods().equals(this.getAccessControlAllowMethods()) == false)
            return false;
        if (other.getAccessControlAllowCredentials() == null ^ this.getAccessControlAllowCredentials() == null)
            return false;
        if (other.getAccessControlAllowCredentials() != null
                && other.getAccessControlAllowCredentials().equals(this.getAccessControlAllowCredentials()) == false)
            return false;
        if (other.getAccessControlExposeHeaders() == null ^ this.getAccessControlExposeHeaders() == null)
            return false;
        if (other.getAccessControlExposeHeaders() != null && other.getAccessControlExposeHeaders().equals(this.getAccessControlExposeHeaders()) == false)
            return false;
        if (other.getAccessControlMaxAgeSec() == null ^ this.getAccessControlMaxAgeSec() == null)
            return false;
        if (other.getAccessControlMaxAgeSec() != null && other.getAccessControlMaxAgeSec().equals(this.getAccessControlMaxAgeSec()) == false)
            return false;
        if (other.getOriginOverride() == null ^ this.getOriginOverride() == null)
            return false;
        if (other.getOriginOverride() != null && other.getOriginOverride().equals(this.getOriginOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessControlAllowOrigins() == null) ? 0 : getAccessControlAllowOrigins().hashCode());
        hashCode = prime * hashCode + ((getAccessControlAllowHeaders() == null) ? 0 : getAccessControlAllowHeaders().hashCode());
        hashCode = prime * hashCode + ((getAccessControlAllowMethods() == null) ? 0 : getAccessControlAllowMethods().hashCode());
        hashCode = prime * hashCode + ((getAccessControlAllowCredentials() == null) ? 0 : getAccessControlAllowCredentials().hashCode());
        hashCode = prime * hashCode + ((getAccessControlExposeHeaders() == null) ? 0 : getAccessControlExposeHeaders().hashCode());
        hashCode = prime * hashCode + ((getAccessControlMaxAgeSec() == null) ? 0 : getAccessControlMaxAgeSec().hashCode());
        hashCode = prime * hashCode + ((getOriginOverride() == null) ? 0 : getOriginOverride().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyCorsConfig clone() {
        try {
            return (ResponseHeadersPolicyCorsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
