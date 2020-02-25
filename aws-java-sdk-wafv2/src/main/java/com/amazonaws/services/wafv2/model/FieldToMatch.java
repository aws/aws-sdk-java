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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * The part of a web request that you want AWS WAF to inspect. Include the <code>FieldToMatch</code> types that you want
 * to inspect, with additional specifications as needed, according to the type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/FieldToMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldToMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code> or
     * <code>Referer</code>. This setting isn't case sensitive.
     * </p>
     */
    private SingleHeader singleHeader;
    /**
     * <p>
     * Inspect a single query argument. Provide the name of the query argument to inspect, such as <i>UserName</i> or
     * <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     * </p>
     * <p>
     * This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a>
     * specification.
     * </p>
     */
    private SingleQueryArgument singleQueryArgument;
    /**
     * <p>
     * Inspect all query arguments.
     * </p>
     */
    private AllQueryArguments allQueryArguments;
    /**
     * <p>
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     */
    private UriPath uriPath;
    /**
     * <p>
     * Inspect the query string. This is the part of a URL that appears after a <code>?</code> character, if any.
     * </p>
     */
    private QueryString queryString;
    /**
     * <p>
     * Inspect the request body, which immediately follows the request headers. This is the part of a request that
     * contains any additional data that you want to send to your web server as the HTTP request body, such as data from
     * a form.
     * </p>
     * <p>
     * Note that only the first 8 KB (8192 bytes) of the request body are forwarded to AWS WAF for inspection by the
     * underlying host service. If you don't need to inspect more than 8 KB, you can guarantee that you don't allow
     * additional bytes in by combining a statement that inspects the body of the web request, such as
     * <a>ByteMatchStatement</a> or <a>RegexPatternSetReferenceStatement</a>, with a <a>SizeConstraintStatement</a> that
     * enforces an 8 KB size limit on the body of the request. AWS WAF doesn't support inspecting the entire contents of
     * web requests whose bodies exceed the 8 KB limit.
     * </p>
     */
    private Body body;
    /**
     * <p>
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to
     * perform.
     * </p>
     */
    private Method method;

    /**
     * <p>
     * Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code> or
     * <code>Referer</code>. This setting isn't case sensitive.
     * </p>
     * 
     * @param singleHeader
     *        Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code>
     *        or <code>Referer</code>. This setting isn't case sensitive.
     */

    public void setSingleHeader(SingleHeader singleHeader) {
        this.singleHeader = singleHeader;
    }

    /**
     * <p>
     * Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code> or
     * <code>Referer</code>. This setting isn't case sensitive.
     * </p>
     * 
     * @return Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code>
     *         or <code>Referer</code>. This setting isn't case sensitive.
     */

    public SingleHeader getSingleHeader() {
        return this.singleHeader;
    }

    /**
     * <p>
     * Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code> or
     * <code>Referer</code>. This setting isn't case sensitive.
     * </p>
     * 
     * @param singleHeader
     *        Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code>
     *        or <code>Referer</code>. This setting isn't case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldToMatch withSingleHeader(SingleHeader singleHeader) {
        setSingleHeader(singleHeader);
        return this;
    }

    /**
     * <p>
     * Inspect a single query argument. Provide the name of the query argument to inspect, such as <i>UserName</i> or
     * <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     * </p>
     * <p>
     * This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a>
     * specification.
     * </p>
     * 
     * @param singleQueryArgument
     *        Inspect a single query argument. Provide the name of the query argument to inspect, such as
     *        <i>UserName</i> or <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     *        </p>
     *        <p>
     *        This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a>
     *        specification.
     */

    public void setSingleQueryArgument(SingleQueryArgument singleQueryArgument) {
        this.singleQueryArgument = singleQueryArgument;
    }

    /**
     * <p>
     * Inspect a single query argument. Provide the name of the query argument to inspect, such as <i>UserName</i> or
     * <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     * </p>
     * <p>
     * This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a>
     * specification.
     * </p>
     * 
     * @return Inspect a single query argument. Provide the name of the query argument to inspect, such as
     *         <i>UserName</i> or <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     *         </p>
     *         <p>
     *         This is used only to indicate the web request component for AWS WAF to inspect, in the
     *         <a>FieldToMatch</a> specification.
     */

    public SingleQueryArgument getSingleQueryArgument() {
        return this.singleQueryArgument;
    }

    /**
     * <p>
     * Inspect a single query argument. Provide the name of the query argument to inspect, such as <i>UserName</i> or
     * <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     * </p>
     * <p>
     * This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a>
     * specification.
     * </p>
     * 
     * @param singleQueryArgument
     *        Inspect a single query argument. Provide the name of the query argument to inspect, such as
     *        <i>UserName</i> or <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     *        </p>
     *        <p>
     *        This is used only to indicate the web request component for AWS WAF to inspect, in the <a>FieldToMatch</a>
     *        specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldToMatch withSingleQueryArgument(SingleQueryArgument singleQueryArgument) {
        setSingleQueryArgument(singleQueryArgument);
        return this;
    }

    /**
     * <p>
     * Inspect all query arguments.
     * </p>
     * 
     * @param allQueryArguments
     *        Inspect all query arguments.
     */

    public void setAllQueryArguments(AllQueryArguments allQueryArguments) {
        this.allQueryArguments = allQueryArguments;
    }

    /**
     * <p>
     * Inspect all query arguments.
     * </p>
     * 
     * @return Inspect all query arguments.
     */

    public AllQueryArguments getAllQueryArguments() {
        return this.allQueryArguments;
    }

    /**
     * <p>
     * Inspect all query arguments.
     * </p>
     * 
     * @param allQueryArguments
     *        Inspect all query arguments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldToMatch withAllQueryArguments(AllQueryArguments allQueryArguments) {
        setAllQueryArguments(allQueryArguments);
        return this;
    }

    /**
     * <p>
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * 
     * @param uriPath
     *        Inspect the request URI path. This is the part of a web request that identifies a resource, for example,
     *        <code>/images/daily-ad.jpg</code>.
     */

    public void setUriPath(UriPath uriPath) {
        this.uriPath = uriPath;
    }

    /**
     * <p>
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * 
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example,
     *         <code>/images/daily-ad.jpg</code>.
     */

    public UriPath getUriPath() {
        return this.uriPath;
    }

    /**
     * <p>
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * 
     * @param uriPath
     *        Inspect the request URI path. This is the part of a web request that identifies a resource, for example,
     *        <code>/images/daily-ad.jpg</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldToMatch withUriPath(UriPath uriPath) {
        setUriPath(uriPath);
        return this;
    }

    /**
     * <p>
     * Inspect the query string. This is the part of a URL that appears after a <code>?</code> character, if any.
     * </p>
     * 
     * @param queryString
     *        Inspect the query string. This is the part of a URL that appears after a <code>?</code> character, if any.
     */

    public void setQueryString(QueryString queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * Inspect the query string. This is the part of a URL that appears after a <code>?</code> character, if any.
     * </p>
     * 
     * @return Inspect the query string. This is the part of a URL that appears after a <code>?</code> character, if
     *         any.
     */

    public QueryString getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * Inspect the query string. This is the part of a URL that appears after a <code>?</code> character, if any.
     * </p>
     * 
     * @param queryString
     *        Inspect the query string. This is the part of a URL that appears after a <code>?</code> character, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldToMatch withQueryString(QueryString queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * Inspect the request body, which immediately follows the request headers. This is the part of a request that
     * contains any additional data that you want to send to your web server as the HTTP request body, such as data from
     * a form.
     * </p>
     * <p>
     * Note that only the first 8 KB (8192 bytes) of the request body are forwarded to AWS WAF for inspection by the
     * underlying host service. If you don't need to inspect more than 8 KB, you can guarantee that you don't allow
     * additional bytes in by combining a statement that inspects the body of the web request, such as
     * <a>ByteMatchStatement</a> or <a>RegexPatternSetReferenceStatement</a>, with a <a>SizeConstraintStatement</a> that
     * enforces an 8 KB size limit on the body of the request. AWS WAF doesn't support inspecting the entire contents of
     * web requests whose bodies exceed the 8 KB limit.
     * </p>
     * 
     * @param body
     *        Inspect the request body, which immediately follows the request headers. This is the part of a request
     *        that contains any additional data that you want to send to your web server as the HTTP request body, such
     *        as data from a form. </p>
     *        <p>
     *        Note that only the first 8 KB (8192 bytes) of the request body are forwarded to AWS WAF for inspection by
     *        the underlying host service. If you don't need to inspect more than 8 KB, you can guarantee that you don't
     *        allow additional bytes in by combining a statement that inspects the body of the web request, such as
     *        <a>ByteMatchStatement</a> or <a>RegexPatternSetReferenceStatement</a>, with a
     *        <a>SizeConstraintStatement</a> that enforces an 8 KB size limit on the body of the request. AWS WAF
     *        doesn't support inspecting the entire contents of web requests whose bodies exceed the 8 KB limit.
     */

    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * <p>
     * Inspect the request body, which immediately follows the request headers. This is the part of a request that
     * contains any additional data that you want to send to your web server as the HTTP request body, such as data from
     * a form.
     * </p>
     * <p>
     * Note that only the first 8 KB (8192 bytes) of the request body are forwarded to AWS WAF for inspection by the
     * underlying host service. If you don't need to inspect more than 8 KB, you can guarantee that you don't allow
     * additional bytes in by combining a statement that inspects the body of the web request, such as
     * <a>ByteMatchStatement</a> or <a>RegexPatternSetReferenceStatement</a>, with a <a>SizeConstraintStatement</a> that
     * enforces an 8 KB size limit on the body of the request. AWS WAF doesn't support inspecting the entire contents of
     * web requests whose bodies exceed the 8 KB limit.
     * </p>
     * 
     * @return Inspect the request body, which immediately follows the request headers. This is the part of a request
     *         that contains any additional data that you want to send to your web server as the HTTP request body, such
     *         as data from a form. </p>
     *         <p>
     *         Note that only the first 8 KB (8192 bytes) of the request body are forwarded to AWS WAF for inspection by
     *         the underlying host service. If you don't need to inspect more than 8 KB, you can guarantee that you
     *         don't allow additional bytes in by combining a statement that inspects the body of the web request, such
     *         as <a>ByteMatchStatement</a> or <a>RegexPatternSetReferenceStatement</a>, with a
     *         <a>SizeConstraintStatement</a> that enforces an 8 KB size limit on the body of the request. AWS WAF
     *         doesn't support inspecting the entire contents of web requests whose bodies exceed the 8 KB limit.
     */

    public Body getBody() {
        return this.body;
    }

    /**
     * <p>
     * Inspect the request body, which immediately follows the request headers. This is the part of a request that
     * contains any additional data that you want to send to your web server as the HTTP request body, such as data from
     * a form.
     * </p>
     * <p>
     * Note that only the first 8 KB (8192 bytes) of the request body are forwarded to AWS WAF for inspection by the
     * underlying host service. If you don't need to inspect more than 8 KB, you can guarantee that you don't allow
     * additional bytes in by combining a statement that inspects the body of the web request, such as
     * <a>ByteMatchStatement</a> or <a>RegexPatternSetReferenceStatement</a>, with a <a>SizeConstraintStatement</a> that
     * enforces an 8 KB size limit on the body of the request. AWS WAF doesn't support inspecting the entire contents of
     * web requests whose bodies exceed the 8 KB limit.
     * </p>
     * 
     * @param body
     *        Inspect the request body, which immediately follows the request headers. This is the part of a request
     *        that contains any additional data that you want to send to your web server as the HTTP request body, such
     *        as data from a form. </p>
     *        <p>
     *        Note that only the first 8 KB (8192 bytes) of the request body are forwarded to AWS WAF for inspection by
     *        the underlying host service. If you don't need to inspect more than 8 KB, you can guarantee that you don't
     *        allow additional bytes in by combining a statement that inspects the body of the web request, such as
     *        <a>ByteMatchStatement</a> or <a>RegexPatternSetReferenceStatement</a>, with a
     *        <a>SizeConstraintStatement</a> that enforces an 8 KB size limit on the body of the request. AWS WAF
     *        doesn't support inspecting the entire contents of web requests whose bodies exceed the 8 KB limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldToMatch withBody(Body body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to
     * perform.
     * </p>
     * 
     * @param method
     *        Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin
     *        to perform.
     */

    public void setMethod(Method method) {
        this.method = method;
    }

    /**
     * <p>
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to
     * perform.
     * </p>
     * 
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin
     *         to perform.
     */

    public Method getMethod() {
        return this.method;
    }

    /**
     * <p>
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to
     * perform.
     * </p>
     * 
     * @param method
     *        Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin
     *        to perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldToMatch withMethod(Method method) {
        setMethod(method);
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
        if (getSingleHeader() != null)
            sb.append("SingleHeader: ").append(getSingleHeader()).append(",");
        if (getSingleQueryArgument() != null)
            sb.append("SingleQueryArgument: ").append(getSingleQueryArgument()).append(",");
        if (getAllQueryArguments() != null)
            sb.append("AllQueryArguments: ").append(getAllQueryArguments()).append(",");
        if (getUriPath() != null)
            sb.append("UriPath: ").append(getUriPath()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getMethod() != null)
            sb.append("Method: ").append(getMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldToMatch == false)
            return false;
        FieldToMatch other = (FieldToMatch) obj;
        if (other.getSingleHeader() == null ^ this.getSingleHeader() == null)
            return false;
        if (other.getSingleHeader() != null && other.getSingleHeader().equals(this.getSingleHeader()) == false)
            return false;
        if (other.getSingleQueryArgument() == null ^ this.getSingleQueryArgument() == null)
            return false;
        if (other.getSingleQueryArgument() != null && other.getSingleQueryArgument().equals(this.getSingleQueryArgument()) == false)
            return false;
        if (other.getAllQueryArguments() == null ^ this.getAllQueryArguments() == null)
            return false;
        if (other.getAllQueryArguments() != null && other.getAllQueryArguments().equals(this.getAllQueryArguments()) == false)
            return false;
        if (other.getUriPath() == null ^ this.getUriPath() == null)
            return false;
        if (other.getUriPath() != null && other.getUriPath().equals(this.getUriPath()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSingleHeader() == null) ? 0 : getSingleHeader().hashCode());
        hashCode = prime * hashCode + ((getSingleQueryArgument() == null) ? 0 : getSingleQueryArgument().hashCode());
        hashCode = prime * hashCode + ((getAllQueryArguments() == null) ? 0 : getAllQueryArguments().hashCode());
        hashCode = prime * hashCode + ((getUriPath() == null) ? 0 : getUriPath().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        return hashCode;
    }

    @Override
    public FieldToMatch clone() {
        try {
            return (FieldToMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.FieldToMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
