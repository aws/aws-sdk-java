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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The part of the web request that you want WAF to inspect. Include the single <code>FieldToMatch</code> type that you
 * want to inspect, with additional specifications as needed, according to the type. You specify a single request
 * component in <code>FieldToMatch</code> for each rule statement that requires it. To inspect more than one component
 * of the web request, create a separate rule statement for each component.
 * </p>
 * <p>
 * Example JSON for a <code>QueryString</code> field to match:
 * </p>
 * <p>
 * <code> "FieldToMatch": { "QueryString": {} }</code>
 * </p>
 * <p>
 * Example JSON for a <code>Method</code> field to match specification:
 * </p>
 * <p>
 * <code> "FieldToMatch": { "Method": { "Name": "DELETE" } }</code>
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
     * <p>
     * Example JSON: <code>"SingleHeader": { "Name": "haystack" }</code>
     * </p>
     * <p>
     * Alternately, you can filter and inspect all headers with the <code>Headers</code> <code>FieldToMatch</code>
     * setting.
     * </p>
     */
    private SingleHeader singleHeader;
    /**
     * <p>
     * Inspect a single query argument. Provide the name of the query argument to inspect, such as <i>UserName</i> or
     * <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     * </p>
     * <p>
     * Example JSON: <code>"SingleQueryArgument": { "Name": "myArgument" }</code>
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
     * Inspect the request URI path. This is the part of the web request that identifies a resource, for example,
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
     * Inspect the request body as plain text. The request body immediately follows the request headers. This is the
     * part of a request that contains any additional data that you want to send to your web server as the HTTP request
     * body, such as data from a form.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying host
     * service. For information about how to handle oversized request bodies, see the <code>Body</code> object
     * configuration.
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
     * Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a
     * request that contains any additional data that you want to send to your web server as the HTTP request body, such
     * as data from a form.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying host
     * service. For information about how to handle oversized request bodies, see the <code>JsonBody</code> object
     * configuration.
     * </p>
     */
    private JsonBody jsonBody;
    /**
     * <p>
     * Inspect the request headers. You must configure scope and pattern matching filters in the <code>Headers</code>
     * object, to define the set of headers to and the parts of the headers that WAF inspects.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are forwarded to WAF for
     * inspection by the underlying host service. You must configure how to handle any oversize header content in the
     * <code>Headers</code> object. WAF applies the pattern matching filters to the headers that it receives from the
     * underlying host service.
     * </p>
     */
    private Headers headers;
    /**
     * <p>
     * Inspect the request cookies. You must configure scope and pattern matching filters in the <code>Cookies</code>
     * object, to define the set of cookies and the parts of the cookies that WAF inspects.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are forwarded to WAF for
     * inspection by the underlying host service. You must configure how to handle any oversize cookie content in the
     * <code>Cookies</code> object. WAF applies the pattern matching filters to the cookies that it receives from the
     * underlying host service.
     * </p>
     */
    private Cookies cookies;

    /**
     * <p>
     * Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code> or
     * <code>Referer</code>. This setting isn't case sensitive.
     * </p>
     * <p>
     * Example JSON: <code>"SingleHeader": { "Name": "haystack" }</code>
     * </p>
     * <p>
     * Alternately, you can filter and inspect all headers with the <code>Headers</code> <code>FieldToMatch</code>
     * setting.
     * </p>
     * 
     * @param singleHeader
     *        Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code>
     *        or <code>Referer</code>. This setting isn't case sensitive.</p>
     *        <p>
     *        Example JSON: <code>"SingleHeader": { "Name": "haystack" }</code>
     *        </p>
     *        <p>
     *        Alternately, you can filter and inspect all headers with the <code>Headers</code>
     *        <code>FieldToMatch</code> setting.
     */

    public void setSingleHeader(SingleHeader singleHeader) {
        this.singleHeader = singleHeader;
    }

    /**
     * <p>
     * Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code> or
     * <code>Referer</code>. This setting isn't case sensitive.
     * </p>
     * <p>
     * Example JSON: <code>"SingleHeader": { "Name": "haystack" }</code>
     * </p>
     * <p>
     * Alternately, you can filter and inspect all headers with the <code>Headers</code> <code>FieldToMatch</code>
     * setting.
     * </p>
     * 
     * @return Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code>
     *         or <code>Referer</code>. This setting isn't case sensitive.</p>
     *         <p>
     *         Example JSON: <code>"SingleHeader": { "Name": "haystack" }</code>
     *         </p>
     *         <p>
     *         Alternately, you can filter and inspect all headers with the <code>Headers</code>
     *         <code>FieldToMatch</code> setting.
     */

    public SingleHeader getSingleHeader() {
        return this.singleHeader;
    }

    /**
     * <p>
     * Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code> or
     * <code>Referer</code>. This setting isn't case sensitive.
     * </p>
     * <p>
     * Example JSON: <code>"SingleHeader": { "Name": "haystack" }</code>
     * </p>
     * <p>
     * Alternately, you can filter and inspect all headers with the <code>Headers</code> <code>FieldToMatch</code>
     * setting.
     * </p>
     * 
     * @param singleHeader
     *        Inspect a single header. Provide the name of the header to inspect, for example, <code>User-Agent</code>
     *        or <code>Referer</code>. This setting isn't case sensitive.</p>
     *        <p>
     *        Example JSON: <code>"SingleHeader": { "Name": "haystack" }</code>
     *        </p>
     *        <p>
     *        Alternately, you can filter and inspect all headers with the <code>Headers</code>
     *        <code>FieldToMatch</code> setting.
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
     * Example JSON: <code>"SingleQueryArgument": { "Name": "myArgument" }</code>
     * </p>
     * 
     * @param singleQueryArgument
     *        Inspect a single query argument. Provide the name of the query argument to inspect, such as
     *        <i>UserName</i> or <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     *        </p>
     *        <p>
     *        Example JSON: <code>"SingleQueryArgument": { "Name": "myArgument" }</code>
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
     * Example JSON: <code>"SingleQueryArgument": { "Name": "myArgument" }</code>
     * </p>
     * 
     * @return Inspect a single query argument. Provide the name of the query argument to inspect, such as
     *         <i>UserName</i> or <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     *         </p>
     *         <p>
     *         Example JSON: <code>"SingleQueryArgument": { "Name": "myArgument" }</code>
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
     * Example JSON: <code>"SingleQueryArgument": { "Name": "myArgument" }</code>
     * </p>
     * 
     * @param singleQueryArgument
     *        Inspect a single query argument. Provide the name of the query argument to inspect, such as
     *        <i>UserName</i> or <i>SalesRegion</i>. The name can be up to 30 characters long and isn't case sensitive.
     *        </p>
     *        <p>
     *        Example JSON: <code>"SingleQueryArgument": { "Name": "myArgument" }</code>
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
     * Inspect the request URI path. This is the part of the web request that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * 
     * @param uriPath
     *        Inspect the request URI path. This is the part of the web request that identifies a resource, for example,
     *        <code>/images/daily-ad.jpg</code>.
     */

    public void setUriPath(UriPath uriPath) {
        this.uriPath = uriPath;
    }

    /**
     * <p>
     * Inspect the request URI path. This is the part of the web request that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * 
     * @return Inspect the request URI path. This is the part of the web request that identifies a resource, for
     *         example, <code>/images/daily-ad.jpg</code>.
     */

    public UriPath getUriPath() {
        return this.uriPath;
    }

    /**
     * <p>
     * Inspect the request URI path. This is the part of the web request that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * 
     * @param uriPath
     *        Inspect the request URI path. This is the part of the web request that identifies a resource, for example,
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
     * Inspect the request body as plain text. The request body immediately follows the request headers. This is the
     * part of a request that contains any additional data that you want to send to your web server as the HTTP request
     * body, such as data from a form.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying host
     * service. For information about how to handle oversized request bodies, see the <code>Body</code> object
     * configuration.
     * </p>
     * 
     * @param body
     *        Inspect the request body as plain text. The request body immediately follows the request headers. This is
     *        the part of a request that contains any additional data that you want to send to your web server as the
     *        HTTP request body, such as data from a form. </p>
     *        <p>
     *        Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying
     *        host service. For information about how to handle oversized request bodies, see the <code>Body</code>
     *        object configuration.
     */

    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * <p>
     * Inspect the request body as plain text. The request body immediately follows the request headers. This is the
     * part of a request that contains any additional data that you want to send to your web server as the HTTP request
     * body, such as data from a form.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying host
     * service. For information about how to handle oversized request bodies, see the <code>Body</code> object
     * configuration.
     * </p>
     * 
     * @return Inspect the request body as plain text. The request body immediately follows the request headers. This is
     *         the part of a request that contains any additional data that you want to send to your web server as the
     *         HTTP request body, such as data from a form. </p>
     *         <p>
     *         Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the
     *         underlying host service. For information about how to handle oversized request bodies, see the
     *         <code>Body</code> object configuration.
     */

    public Body getBody() {
        return this.body;
    }

    /**
     * <p>
     * Inspect the request body as plain text. The request body immediately follows the request headers. This is the
     * part of a request that contains any additional data that you want to send to your web server as the HTTP request
     * body, such as data from a form.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying host
     * service. For information about how to handle oversized request bodies, see the <code>Body</code> object
     * configuration.
     * </p>
     * 
     * @param body
     *        Inspect the request body as plain text. The request body immediately follows the request headers. This is
     *        the part of a request that contains any additional data that you want to send to your web server as the
     *        HTTP request body, such as data from a form. </p>
     *        <p>
     *        Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying
     *        host service. For information about how to handle oversized request bodies, see the <code>Body</code>
     *        object configuration.
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
     * <p>
     * Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a
     * request that contains any additional data that you want to send to your web server as the HTTP request body, such
     * as data from a form.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying host
     * service. For information about how to handle oversized request bodies, see the <code>JsonBody</code> object
     * configuration.
     * </p>
     * 
     * @param jsonBody
     *        Inspect the request body as JSON. The request body immediately follows the request headers. This is the
     *        part of a request that contains any additional data that you want to send to your web server as the HTTP
     *        request body, such as data from a form. </p>
     *        <p>
     *        Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying
     *        host service. For information about how to handle oversized request bodies, see the <code>JsonBody</code>
     *        object configuration.
     */

    public void setJsonBody(JsonBody jsonBody) {
        this.jsonBody = jsonBody;
    }

    /**
     * <p>
     * Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a
     * request that contains any additional data that you want to send to your web server as the HTTP request body, such
     * as data from a form.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying host
     * service. For information about how to handle oversized request bodies, see the <code>JsonBody</code> object
     * configuration.
     * </p>
     * 
     * @return Inspect the request body as JSON. The request body immediately follows the request headers. This is the
     *         part of a request that contains any additional data that you want to send to your web server as the HTTP
     *         request body, such as data from a form. </p>
     *         <p>
     *         Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the
     *         underlying host service. For information about how to handle oversized request bodies, see the
     *         <code>JsonBody</code> object configuration.
     */

    public JsonBody getJsonBody() {
        return this.jsonBody;
    }

    /**
     * <p>
     * Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a
     * request that contains any additional data that you want to send to your web server as the HTTP request body, such
     * as data from a form.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying host
     * service. For information about how to handle oversized request bodies, see the <code>JsonBody</code> object
     * configuration.
     * </p>
     * 
     * @param jsonBody
     *        Inspect the request body as JSON. The request body immediately follows the request headers. This is the
     *        part of a request that contains any additional data that you want to send to your web server as the HTTP
     *        request body, such as data from a form. </p>
     *        <p>
     *        Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying
     *        host service. For information about how to handle oversized request bodies, see the <code>JsonBody</code>
     *        object configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldToMatch withJsonBody(JsonBody jsonBody) {
        setJsonBody(jsonBody);
        return this;
    }

    /**
     * <p>
     * Inspect the request headers. You must configure scope and pattern matching filters in the <code>Headers</code>
     * object, to define the set of headers to and the parts of the headers that WAF inspects.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are forwarded to WAF for
     * inspection by the underlying host service. You must configure how to handle any oversize header content in the
     * <code>Headers</code> object. WAF applies the pattern matching filters to the headers that it receives from the
     * underlying host service.
     * </p>
     * 
     * @param headers
     *        Inspect the request headers. You must configure scope and pattern matching filters in the
     *        <code>Headers</code> object, to define the set of headers to and the parts of the headers that WAF
     *        inspects. </p>
     *        <p>
     *        Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are forwarded to
     *        WAF for inspection by the underlying host service. You must configure how to handle any oversize header
     *        content in the <code>Headers</code> object. WAF applies the pattern matching filters to the headers that
     *        it receives from the underlying host service.
     */

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * Inspect the request headers. You must configure scope and pattern matching filters in the <code>Headers</code>
     * object, to define the set of headers to and the parts of the headers that WAF inspects.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are forwarded to WAF for
     * inspection by the underlying host service. You must configure how to handle any oversize header content in the
     * <code>Headers</code> object. WAF applies the pattern matching filters to the headers that it receives from the
     * underlying host service.
     * </p>
     * 
     * @return Inspect the request headers. You must configure scope and pattern matching filters in the
     *         <code>Headers</code> object, to define the set of headers to and the parts of the headers that WAF
     *         inspects. </p>
     *         <p>
     *         Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are forwarded to
     *         WAF for inspection by the underlying host service. You must configure how to handle any oversize header
     *         content in the <code>Headers</code> object. WAF applies the pattern matching filters to the headers that
     *         it receives from the underlying host service.
     */

    public Headers getHeaders() {
        return this.headers;
    }

    /**
     * <p>
     * Inspect the request headers. You must configure scope and pattern matching filters in the <code>Headers</code>
     * object, to define the set of headers to and the parts of the headers that WAF inspects.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are forwarded to WAF for
     * inspection by the underlying host service. You must configure how to handle any oversize header content in the
     * <code>Headers</code> object. WAF applies the pattern matching filters to the headers that it receives from the
     * underlying host service.
     * </p>
     * 
     * @param headers
     *        Inspect the request headers. You must configure scope and pattern matching filters in the
     *        <code>Headers</code> object, to define the set of headers to and the parts of the headers that WAF
     *        inspects. </p>
     *        <p>
     *        Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are forwarded to
     *        WAF for inspection by the underlying host service. You must configure how to handle any oversize header
     *        content in the <code>Headers</code> object. WAF applies the pattern matching filters to the headers that
     *        it receives from the underlying host service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldToMatch withHeaders(Headers headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * Inspect the request cookies. You must configure scope and pattern matching filters in the <code>Cookies</code>
     * object, to define the set of cookies and the parts of the cookies that WAF inspects.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are forwarded to WAF for
     * inspection by the underlying host service. You must configure how to handle any oversize cookie content in the
     * <code>Cookies</code> object. WAF applies the pattern matching filters to the cookies that it receives from the
     * underlying host service.
     * </p>
     * 
     * @param cookies
     *        Inspect the request cookies. You must configure scope and pattern matching filters in the
     *        <code>Cookies</code> object, to define the set of cookies and the parts of the cookies that WAF inspects.
     *        </p>
     *        <p>
     *        Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are forwarded to
     *        WAF for inspection by the underlying host service. You must configure how to handle any oversize cookie
     *        content in the <code>Cookies</code> object. WAF applies the pattern matching filters to the cookies that
     *        it receives from the underlying host service.
     */

    public void setCookies(Cookies cookies) {
        this.cookies = cookies;
    }

    /**
     * <p>
     * Inspect the request cookies. You must configure scope and pattern matching filters in the <code>Cookies</code>
     * object, to define the set of cookies and the parts of the cookies that WAF inspects.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are forwarded to WAF for
     * inspection by the underlying host service. You must configure how to handle any oversize cookie content in the
     * <code>Cookies</code> object. WAF applies the pattern matching filters to the cookies that it receives from the
     * underlying host service.
     * </p>
     * 
     * @return Inspect the request cookies. You must configure scope and pattern matching filters in the
     *         <code>Cookies</code> object, to define the set of cookies and the parts of the cookies that WAF inspects.
     *         </p>
     *         <p>
     *         Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are forwarded to
     *         WAF for inspection by the underlying host service. You must configure how to handle any oversize cookie
     *         content in the <code>Cookies</code> object. WAF applies the pattern matching filters to the cookies that
     *         it receives from the underlying host service.
     */

    public Cookies getCookies() {
        return this.cookies;
    }

    /**
     * <p>
     * Inspect the request cookies. You must configure scope and pattern matching filters in the <code>Cookies</code>
     * object, to define the set of cookies and the parts of the cookies that WAF inspects.
     * </p>
     * <p>
     * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are forwarded to WAF for
     * inspection by the underlying host service. You must configure how to handle any oversize cookie content in the
     * <code>Cookies</code> object. WAF applies the pattern matching filters to the cookies that it receives from the
     * underlying host service.
     * </p>
     * 
     * @param cookies
     *        Inspect the request cookies. You must configure scope and pattern matching filters in the
     *        <code>Cookies</code> object, to define the set of cookies and the parts of the cookies that WAF inspects.
     *        </p>
     *        <p>
     *        Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are forwarded to
     *        WAF for inspection by the underlying host service. You must configure how to handle any oversize cookie
     *        content in the <code>Cookies</code> object. WAF applies the pattern matching filters to the cookies that
     *        it receives from the underlying host service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldToMatch withCookies(Cookies cookies) {
        setCookies(cookies);
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
            sb.append("Method: ").append(getMethod()).append(",");
        if (getJsonBody() != null)
            sb.append("JsonBody: ").append(getJsonBody()).append(",");
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders()).append(",");
        if (getCookies() != null)
            sb.append("Cookies: ").append(getCookies());
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
        if (other.getJsonBody() == null ^ this.getJsonBody() == null)
            return false;
        if (other.getJsonBody() != null && other.getJsonBody().equals(this.getJsonBody()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getCookies() == null ^ this.getCookies() == null)
            return false;
        if (other.getCookies() != null && other.getCookies().equals(this.getCookies()) == false)
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
        hashCode = prime * hashCode + ((getJsonBody() == null) ? 0 : getJsonBody().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getCookies() == null) ? 0 : getCookies().hashCode());
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
