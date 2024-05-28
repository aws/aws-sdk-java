/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a single custom aggregate key for a rate-base rule.
 * </p>
 * <note>
 * <p>
 * Web requests that are missing any of the components specified in the aggregation keys are omitted from the rate-based
 * rule evaluation and handling.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RateBasedStatementCustomKey" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateBasedStatementCustomKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use the value of a header in the request as an aggregate key. Each distinct value in the header contributes to
     * the aggregation instance. If you use a single header as your custom key, then each value fully defines an
     * aggregation instance.
     * </p>
     */
    private RateLimitHeader header;
    /**
     * <p>
     * Use the value of a cookie in the request as an aggregate key. Each distinct value in the cookie contributes to
     * the aggregation instance. If you use a single cookie as your custom key, then each value fully defines an
     * aggregation instance.
     * </p>
     */
    private RateLimitCookie cookie;
    /**
     * <p>
     * Use the specified query argument as an aggregate key. Each distinct value for the named query argument
     * contributes to the aggregation instance. If you use a single query argument as your custom key, then each value
     * fully defines an aggregation instance.
     * </p>
     */
    private RateLimitQueryArgument queryArgument;
    /**
     * <p>
     * Use the request's query string as an aggregate key. Each distinct string contributes to the aggregation instance.
     * If you use just the query string as your custom key, then each string fully defines an aggregation instance.
     * </p>
     */
    private RateLimitQueryString queryString;
    /**
     * <p>
     * Use the request's HTTP method as an aggregate key. Each distinct HTTP method contributes to the aggregation
     * instance. If you use just the HTTP method as your custom key, then each method fully defines an aggregation
     * instance.
     * </p>
     */
    private RateLimitHTTPMethod hTTPMethod;
    /**
     * <p>
     * Use the first IP address in an HTTP header as an aggregate key. Each distinct forwarded IP address contributes to
     * the aggregation instance.
     * </p>
     * <p>
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one other key
     * to use. You can aggregate on only the forwarded IP address by specifying <code>FORWARDED_IP</code> in your
     * rate-based statement's <code>AggregateKeyType</code>.
     * </p>
     * <p>
     * With this option, you must specify the header to use in the rate-based rule's <code>ForwardedIPConfig</code>
     * property.
     * </p>
     */
    private RateLimitForwardedIP forwardedIP;
    /**
     * <p>
     * Use the request's originating IP address as an aggregate key. Each distinct IP address contributes to the
     * aggregation instance.
     * </p>
     * <p>
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one other key
     * to use. You can aggregate on only the IP address by specifying <code>IP</code> in your rate-based statement's
     * <code>AggregateKeyType</code>.
     * </p>
     */
    private RateLimitIP iP;
    /**
     * <p>
     * Use the specified label namespace as an aggregate key. Each distinct fully qualified label name that has the
     * specified label namespace contributes to the aggregation instance. If you use just one label namespace as your
     * custom key, then each label name fully defines an aggregation instance.
     * </p>
     * <p>
     * This uses only labels that have been added to the request by rules that are evaluated before this rate-based rule
     * in the web ACL.
     * </p>
     * <p>
     * For information about label namespaces and names, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html">Label syntax and
     * naming requirements</a> in the <i>WAF Developer Guide</i>.
     * </p>
     */
    private RateLimitLabelNamespace labelNamespace;
    /**
     * <p>
     * Use the request's URI path as an aggregate key. Each distinct URI path contributes to the aggregation instance.
     * If you use just the URI path as your custom key, then each URI path fully defines an aggregation instance.
     * </p>
     */
    private RateLimitUriPath uriPath;

    /**
     * <p>
     * Use the value of a header in the request as an aggregate key. Each distinct value in the header contributes to
     * the aggregation instance. If you use a single header as your custom key, then each value fully defines an
     * aggregation instance.
     * </p>
     * 
     * @param header
     *        Use the value of a header in the request as an aggregate key. Each distinct value in the header
     *        contributes to the aggregation instance. If you use a single header as your custom key, then each value
     *        fully defines an aggregation instance.
     */

    public void setHeader(RateLimitHeader header) {
        this.header = header;
    }

    /**
     * <p>
     * Use the value of a header in the request as an aggregate key. Each distinct value in the header contributes to
     * the aggregation instance. If you use a single header as your custom key, then each value fully defines an
     * aggregation instance.
     * </p>
     * 
     * @return Use the value of a header in the request as an aggregate key. Each distinct value in the header
     *         contributes to the aggregation instance. If you use a single header as your custom key, then each value
     *         fully defines an aggregation instance.
     */

    public RateLimitHeader getHeader() {
        return this.header;
    }

    /**
     * <p>
     * Use the value of a header in the request as an aggregate key. Each distinct value in the header contributes to
     * the aggregation instance. If you use a single header as your custom key, then each value fully defines an
     * aggregation instance.
     * </p>
     * 
     * @param header
     *        Use the value of a header in the request as an aggregate key. Each distinct value in the header
     *        contributes to the aggregation instance. If you use a single header as your custom key, then each value
     *        fully defines an aggregation instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementCustomKey withHeader(RateLimitHeader header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * Use the value of a cookie in the request as an aggregate key. Each distinct value in the cookie contributes to
     * the aggregation instance. If you use a single cookie as your custom key, then each value fully defines an
     * aggregation instance.
     * </p>
     * 
     * @param cookie
     *        Use the value of a cookie in the request as an aggregate key. Each distinct value in the cookie
     *        contributes to the aggregation instance. If you use a single cookie as your custom key, then each value
     *        fully defines an aggregation instance.
     */

    public void setCookie(RateLimitCookie cookie) {
        this.cookie = cookie;
    }

    /**
     * <p>
     * Use the value of a cookie in the request as an aggregate key. Each distinct value in the cookie contributes to
     * the aggregation instance. If you use a single cookie as your custom key, then each value fully defines an
     * aggregation instance.
     * </p>
     * 
     * @return Use the value of a cookie in the request as an aggregate key. Each distinct value in the cookie
     *         contributes to the aggregation instance. If you use a single cookie as your custom key, then each value
     *         fully defines an aggregation instance.
     */

    public RateLimitCookie getCookie() {
        return this.cookie;
    }

    /**
     * <p>
     * Use the value of a cookie in the request as an aggregate key. Each distinct value in the cookie contributes to
     * the aggregation instance. If you use a single cookie as your custom key, then each value fully defines an
     * aggregation instance.
     * </p>
     * 
     * @param cookie
     *        Use the value of a cookie in the request as an aggregate key. Each distinct value in the cookie
     *        contributes to the aggregation instance. If you use a single cookie as your custom key, then each value
     *        fully defines an aggregation instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementCustomKey withCookie(RateLimitCookie cookie) {
        setCookie(cookie);
        return this;
    }

    /**
     * <p>
     * Use the specified query argument as an aggregate key. Each distinct value for the named query argument
     * contributes to the aggregation instance. If you use a single query argument as your custom key, then each value
     * fully defines an aggregation instance.
     * </p>
     * 
     * @param queryArgument
     *        Use the specified query argument as an aggregate key. Each distinct value for the named query argument
     *        contributes to the aggregation instance. If you use a single query argument as your custom key, then each
     *        value fully defines an aggregation instance.
     */

    public void setQueryArgument(RateLimitQueryArgument queryArgument) {
        this.queryArgument = queryArgument;
    }

    /**
     * <p>
     * Use the specified query argument as an aggregate key. Each distinct value for the named query argument
     * contributes to the aggregation instance. If you use a single query argument as your custom key, then each value
     * fully defines an aggregation instance.
     * </p>
     * 
     * @return Use the specified query argument as an aggregate key. Each distinct value for the named query argument
     *         contributes to the aggregation instance. If you use a single query argument as your custom key, then each
     *         value fully defines an aggregation instance.
     */

    public RateLimitQueryArgument getQueryArgument() {
        return this.queryArgument;
    }

    /**
     * <p>
     * Use the specified query argument as an aggregate key. Each distinct value for the named query argument
     * contributes to the aggregation instance. If you use a single query argument as your custom key, then each value
     * fully defines an aggregation instance.
     * </p>
     * 
     * @param queryArgument
     *        Use the specified query argument as an aggregate key. Each distinct value for the named query argument
     *        contributes to the aggregation instance. If you use a single query argument as your custom key, then each
     *        value fully defines an aggregation instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementCustomKey withQueryArgument(RateLimitQueryArgument queryArgument) {
        setQueryArgument(queryArgument);
        return this;
    }

    /**
     * <p>
     * Use the request's query string as an aggregate key. Each distinct string contributes to the aggregation instance.
     * If you use just the query string as your custom key, then each string fully defines an aggregation instance.
     * </p>
     * 
     * @param queryString
     *        Use the request's query string as an aggregate key. Each distinct string contributes to the aggregation
     *        instance. If you use just the query string as your custom key, then each string fully defines an
     *        aggregation instance.
     */

    public void setQueryString(RateLimitQueryString queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * Use the request's query string as an aggregate key. Each distinct string contributes to the aggregation instance.
     * If you use just the query string as your custom key, then each string fully defines an aggregation instance.
     * </p>
     * 
     * @return Use the request's query string as an aggregate key. Each distinct string contributes to the aggregation
     *         instance. If you use just the query string as your custom key, then each string fully defines an
     *         aggregation instance.
     */

    public RateLimitQueryString getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * Use the request's query string as an aggregate key. Each distinct string contributes to the aggregation instance.
     * If you use just the query string as your custom key, then each string fully defines an aggregation instance.
     * </p>
     * 
     * @param queryString
     *        Use the request's query string as an aggregate key. Each distinct string contributes to the aggregation
     *        instance. If you use just the query string as your custom key, then each string fully defines an
     *        aggregation instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementCustomKey withQueryString(RateLimitQueryString queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * Use the request's HTTP method as an aggregate key. Each distinct HTTP method contributes to the aggregation
     * instance. If you use just the HTTP method as your custom key, then each method fully defines an aggregation
     * instance.
     * </p>
     * 
     * @param hTTPMethod
     *        Use the request's HTTP method as an aggregate key. Each distinct HTTP method contributes to the
     *        aggregation instance. If you use just the HTTP method as your custom key, then each method fully defines
     *        an aggregation instance.
     */

    public void setHTTPMethod(RateLimitHTTPMethod hTTPMethod) {
        this.hTTPMethod = hTTPMethod;
    }

    /**
     * <p>
     * Use the request's HTTP method as an aggregate key. Each distinct HTTP method contributes to the aggregation
     * instance. If you use just the HTTP method as your custom key, then each method fully defines an aggregation
     * instance.
     * </p>
     * 
     * @return Use the request's HTTP method as an aggregate key. Each distinct HTTP method contributes to the
     *         aggregation instance. If you use just the HTTP method as your custom key, then each method fully defines
     *         an aggregation instance.
     */

    public RateLimitHTTPMethod getHTTPMethod() {
        return this.hTTPMethod;
    }

    /**
     * <p>
     * Use the request's HTTP method as an aggregate key. Each distinct HTTP method contributes to the aggregation
     * instance. If you use just the HTTP method as your custom key, then each method fully defines an aggregation
     * instance.
     * </p>
     * 
     * @param hTTPMethod
     *        Use the request's HTTP method as an aggregate key. Each distinct HTTP method contributes to the
     *        aggregation instance. If you use just the HTTP method as your custom key, then each method fully defines
     *        an aggregation instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementCustomKey withHTTPMethod(RateLimitHTTPMethod hTTPMethod) {
        setHTTPMethod(hTTPMethod);
        return this;
    }

    /**
     * <p>
     * Use the first IP address in an HTTP header as an aggregate key. Each distinct forwarded IP address contributes to
     * the aggregation instance.
     * </p>
     * <p>
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one other key
     * to use. You can aggregate on only the forwarded IP address by specifying <code>FORWARDED_IP</code> in your
     * rate-based statement's <code>AggregateKeyType</code>.
     * </p>
     * <p>
     * With this option, you must specify the header to use in the rate-based rule's <code>ForwardedIPConfig</code>
     * property.
     * </p>
     * 
     * @param forwardedIP
     *        Use the first IP address in an HTTP header as an aggregate key. Each distinct forwarded IP address
     *        contributes to the aggregation instance.</p>
     *        <p>
     *        When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one
     *        other key to use. You can aggregate on only the forwarded IP address by specifying
     *        <code>FORWARDED_IP</code> in your rate-based statement's <code>AggregateKeyType</code>.
     *        </p>
     *        <p>
     *        With this option, you must specify the header to use in the rate-based rule's
     *        <code>ForwardedIPConfig</code> property.
     */

    public void setForwardedIP(RateLimitForwardedIP forwardedIP) {
        this.forwardedIP = forwardedIP;
    }

    /**
     * <p>
     * Use the first IP address in an HTTP header as an aggregate key. Each distinct forwarded IP address contributes to
     * the aggregation instance.
     * </p>
     * <p>
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one other key
     * to use. You can aggregate on only the forwarded IP address by specifying <code>FORWARDED_IP</code> in your
     * rate-based statement's <code>AggregateKeyType</code>.
     * </p>
     * <p>
     * With this option, you must specify the header to use in the rate-based rule's <code>ForwardedIPConfig</code>
     * property.
     * </p>
     * 
     * @return Use the first IP address in an HTTP header as an aggregate key. Each distinct forwarded IP address
     *         contributes to the aggregation instance.</p>
     *         <p>
     *         When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one
     *         other key to use. You can aggregate on only the forwarded IP address by specifying
     *         <code>FORWARDED_IP</code> in your rate-based statement's <code>AggregateKeyType</code>.
     *         </p>
     *         <p>
     *         With this option, you must specify the header to use in the rate-based rule's
     *         <code>ForwardedIPConfig</code> property.
     */

    public RateLimitForwardedIP getForwardedIP() {
        return this.forwardedIP;
    }

    /**
     * <p>
     * Use the first IP address in an HTTP header as an aggregate key. Each distinct forwarded IP address contributes to
     * the aggregation instance.
     * </p>
     * <p>
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one other key
     * to use. You can aggregate on only the forwarded IP address by specifying <code>FORWARDED_IP</code> in your
     * rate-based statement's <code>AggregateKeyType</code>.
     * </p>
     * <p>
     * With this option, you must specify the header to use in the rate-based rule's <code>ForwardedIPConfig</code>
     * property.
     * </p>
     * 
     * @param forwardedIP
     *        Use the first IP address in an HTTP header as an aggregate key. Each distinct forwarded IP address
     *        contributes to the aggregation instance.</p>
     *        <p>
     *        When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one
     *        other key to use. You can aggregate on only the forwarded IP address by specifying
     *        <code>FORWARDED_IP</code> in your rate-based statement's <code>AggregateKeyType</code>.
     *        </p>
     *        <p>
     *        With this option, you must specify the header to use in the rate-based rule's
     *        <code>ForwardedIPConfig</code> property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementCustomKey withForwardedIP(RateLimitForwardedIP forwardedIP) {
        setForwardedIP(forwardedIP);
        return this;
    }

    /**
     * <p>
     * Use the request's originating IP address as an aggregate key. Each distinct IP address contributes to the
     * aggregation instance.
     * </p>
     * <p>
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one other key
     * to use. You can aggregate on only the IP address by specifying <code>IP</code> in your rate-based statement's
     * <code>AggregateKeyType</code>.
     * </p>
     * 
     * @param iP
     *        Use the request's originating IP address as an aggregate key. Each distinct IP address contributes to the
     *        aggregation instance.</p>
     *        <p>
     *        When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one
     *        other key to use. You can aggregate on only the IP address by specifying <code>IP</code> in your
     *        rate-based statement's <code>AggregateKeyType</code>.
     */

    public void setIP(RateLimitIP iP) {
        this.iP = iP;
    }

    /**
     * <p>
     * Use the request's originating IP address as an aggregate key. Each distinct IP address contributes to the
     * aggregation instance.
     * </p>
     * <p>
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one other key
     * to use. You can aggregate on only the IP address by specifying <code>IP</code> in your rate-based statement's
     * <code>AggregateKeyType</code>.
     * </p>
     * 
     * @return Use the request's originating IP address as an aggregate key. Each distinct IP address contributes to the
     *         aggregation instance.</p>
     *         <p>
     *         When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one
     *         other key to use. You can aggregate on only the IP address by specifying <code>IP</code> in your
     *         rate-based statement's <code>AggregateKeyType</code>.
     */

    public RateLimitIP getIP() {
        return this.iP;
    }

    /**
     * <p>
     * Use the request's originating IP address as an aggregate key. Each distinct IP address contributes to the
     * aggregation instance.
     * </p>
     * <p>
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one other key
     * to use. You can aggregate on only the IP address by specifying <code>IP</code> in your rate-based statement's
     * <code>AggregateKeyType</code>.
     * </p>
     * 
     * @param iP
     *        Use the request's originating IP address as an aggregate key. Each distinct IP address contributes to the
     *        aggregation instance.</p>
     *        <p>
     *        When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one
     *        other key to use. You can aggregate on only the IP address by specifying <code>IP</code> in your
     *        rate-based statement's <code>AggregateKeyType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementCustomKey withIP(RateLimitIP iP) {
        setIP(iP);
        return this;
    }

    /**
     * <p>
     * Use the specified label namespace as an aggregate key. Each distinct fully qualified label name that has the
     * specified label namespace contributes to the aggregation instance. If you use just one label namespace as your
     * custom key, then each label name fully defines an aggregation instance.
     * </p>
     * <p>
     * This uses only labels that have been added to the request by rules that are evaluated before this rate-based rule
     * in the web ACL.
     * </p>
     * <p>
     * For information about label namespaces and names, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html">Label syntax and
     * naming requirements</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param labelNamespace
     *        Use the specified label namespace as an aggregate key. Each distinct fully qualified label name that has
     *        the specified label namespace contributes to the aggregation instance. If you use just one label namespace
     *        as your custom key, then each label name fully defines an aggregation instance. </p>
     *        <p>
     *        This uses only labels that have been added to the request by rules that are evaluated before this
     *        rate-based rule in the web ACL.
     *        </p>
     *        <p>
     *        For information about label namespaces and names, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html">Label syntax
     *        and naming requirements</a> in the <i>WAF Developer Guide</i>.
     */

    public void setLabelNamespace(RateLimitLabelNamespace labelNamespace) {
        this.labelNamespace = labelNamespace;
    }

    /**
     * <p>
     * Use the specified label namespace as an aggregate key. Each distinct fully qualified label name that has the
     * specified label namespace contributes to the aggregation instance. If you use just one label namespace as your
     * custom key, then each label name fully defines an aggregation instance.
     * </p>
     * <p>
     * This uses only labels that have been added to the request by rules that are evaluated before this rate-based rule
     * in the web ACL.
     * </p>
     * <p>
     * For information about label namespaces and names, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html">Label syntax and
     * naming requirements</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @return Use the specified label namespace as an aggregate key. Each distinct fully qualified label name that has
     *         the specified label namespace contributes to the aggregation instance. If you use just one label
     *         namespace as your custom key, then each label name fully defines an aggregation instance. </p>
     *         <p>
     *         This uses only labels that have been added to the request by rules that are evaluated before this
     *         rate-based rule in the web ACL.
     *         </p>
     *         <p>
     *         For information about label namespaces and names, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html">Label
     *         syntax and naming requirements</a> in the <i>WAF Developer Guide</i>.
     */

    public RateLimitLabelNamespace getLabelNamespace() {
        return this.labelNamespace;
    }

    /**
     * <p>
     * Use the specified label namespace as an aggregate key. Each distinct fully qualified label name that has the
     * specified label namespace contributes to the aggregation instance. If you use just one label namespace as your
     * custom key, then each label name fully defines an aggregation instance.
     * </p>
     * <p>
     * This uses only labels that have been added to the request by rules that are evaluated before this rate-based rule
     * in the web ACL.
     * </p>
     * <p>
     * For information about label namespaces and names, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html">Label syntax and
     * naming requirements</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param labelNamespace
     *        Use the specified label namespace as an aggregate key. Each distinct fully qualified label name that has
     *        the specified label namespace contributes to the aggregation instance. If you use just one label namespace
     *        as your custom key, then each label name fully defines an aggregation instance. </p>
     *        <p>
     *        This uses only labels that have been added to the request by rules that are evaluated before this
     *        rate-based rule in the web ACL.
     *        </p>
     *        <p>
     *        For information about label namespaces and names, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html">Label syntax
     *        and naming requirements</a> in the <i>WAF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementCustomKey withLabelNamespace(RateLimitLabelNamespace labelNamespace) {
        setLabelNamespace(labelNamespace);
        return this;
    }

    /**
     * <p>
     * Use the request's URI path as an aggregate key. Each distinct URI path contributes to the aggregation instance.
     * If you use just the URI path as your custom key, then each URI path fully defines an aggregation instance.
     * </p>
     * 
     * @param uriPath
     *        Use the request's URI path as an aggregate key. Each distinct URI path contributes to the aggregation
     *        instance. If you use just the URI path as your custom key, then each URI path fully defines an aggregation
     *        instance.
     */

    public void setUriPath(RateLimitUriPath uriPath) {
        this.uriPath = uriPath;
    }

    /**
     * <p>
     * Use the request's URI path as an aggregate key. Each distinct URI path contributes to the aggregation instance.
     * If you use just the URI path as your custom key, then each URI path fully defines an aggregation instance.
     * </p>
     * 
     * @return Use the request's URI path as an aggregate key. Each distinct URI path contributes to the aggregation
     *         instance. If you use just the URI path as your custom key, then each URI path fully defines an
     *         aggregation instance.
     */

    public RateLimitUriPath getUriPath() {
        return this.uriPath;
    }

    /**
     * <p>
     * Use the request's URI path as an aggregate key. Each distinct URI path contributes to the aggregation instance.
     * If you use just the URI path as your custom key, then each URI path fully defines an aggregation instance.
     * </p>
     * 
     * @param uriPath
     *        Use the request's URI path as an aggregate key. Each distinct URI path contributes to the aggregation
     *        instance. If you use just the URI path as your custom key, then each URI path fully defines an aggregation
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatementCustomKey withUriPath(RateLimitUriPath uriPath) {
        setUriPath(uriPath);
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
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader()).append(",");
        if (getCookie() != null)
            sb.append("Cookie: ").append(getCookie()).append(",");
        if (getQueryArgument() != null)
            sb.append("QueryArgument: ").append(getQueryArgument()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getHTTPMethod() != null)
            sb.append("HTTPMethod: ").append(getHTTPMethod()).append(",");
        if (getForwardedIP() != null)
            sb.append("ForwardedIP: ").append(getForwardedIP()).append(",");
        if (getIP() != null)
            sb.append("IP: ").append(getIP()).append(",");
        if (getLabelNamespace() != null)
            sb.append("LabelNamespace: ").append(getLabelNamespace()).append(",");
        if (getUriPath() != null)
            sb.append("UriPath: ").append(getUriPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RateBasedStatementCustomKey == false)
            return false;
        RateBasedStatementCustomKey other = (RateBasedStatementCustomKey) obj;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        if (other.getCookie() == null ^ this.getCookie() == null)
            return false;
        if (other.getCookie() != null && other.getCookie().equals(this.getCookie()) == false)
            return false;
        if (other.getQueryArgument() == null ^ this.getQueryArgument() == null)
            return false;
        if (other.getQueryArgument() != null && other.getQueryArgument().equals(this.getQueryArgument()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getHTTPMethod() == null ^ this.getHTTPMethod() == null)
            return false;
        if (other.getHTTPMethod() != null && other.getHTTPMethod().equals(this.getHTTPMethod()) == false)
            return false;
        if (other.getForwardedIP() == null ^ this.getForwardedIP() == null)
            return false;
        if (other.getForwardedIP() != null && other.getForwardedIP().equals(this.getForwardedIP()) == false)
            return false;
        if (other.getIP() == null ^ this.getIP() == null)
            return false;
        if (other.getIP() != null && other.getIP().equals(this.getIP()) == false)
            return false;
        if (other.getLabelNamespace() == null ^ this.getLabelNamespace() == null)
            return false;
        if (other.getLabelNamespace() != null && other.getLabelNamespace().equals(this.getLabelNamespace()) == false)
            return false;
        if (other.getUriPath() == null ^ this.getUriPath() == null)
            return false;
        if (other.getUriPath() != null && other.getUriPath().equals(this.getUriPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode + ((getCookie() == null) ? 0 : getCookie().hashCode());
        hashCode = prime * hashCode + ((getQueryArgument() == null) ? 0 : getQueryArgument().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getHTTPMethod() == null) ? 0 : getHTTPMethod().hashCode());
        hashCode = prime * hashCode + ((getForwardedIP() == null) ? 0 : getForwardedIP().hashCode());
        hashCode = prime * hashCode + ((getIP() == null) ? 0 : getIP().hashCode());
        hashCode = prime * hashCode + ((getLabelNamespace() == null) ? 0 : getLabelNamespace().hashCode());
        hashCode = prime * hashCode + ((getUriPath() == null) ? 0 : getUriPath().hashCode());
        return hashCode;
    }

    @Override
    public RateBasedStatementCustomKey clone() {
        try {
            return (RateBasedStatementCustomKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RateBasedStatementCustomKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
