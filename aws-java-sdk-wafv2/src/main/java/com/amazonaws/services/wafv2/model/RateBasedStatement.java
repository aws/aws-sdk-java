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
 * A rate-based rule counts incoming requests and rate limits requests when they are coming at too fast a rate. The rule
 * categorizes requests according to your aggregation criteria, collects them into aggregation instances, and counts and
 * rate limits the requests for each instance.
 * </p>
 * <note>
 * <p>
 * If you change any of these settings in a rule that's currently in use, the change resets the rule's rate limiting
 * counts. This can pause the rule's rate limiting activities for up to a minute.
 * </p>
 * </note>
 * <p>
 * You can specify individual aggregation keys, like IP address or HTTP method. You can also specify aggregation key
 * combinations, like IP address and HTTP method, or HTTP method, query argument, and cookie.
 * </p>
 * <p>
 * Each unique set of values for the aggregation keys that you specify is a separate aggregation instance, with the
 * value from each key contributing to the aggregation instance definition.
 * </p>
 * <p>
 * For example, assume the rule evaluates web requests with the following IP address and HTTP method values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * IP address 10.1.1.1, HTTP method POST
 * </p>
 * </li>
 * <li>
 * <p>
 * IP address 10.1.1.1, HTTP method GET
 * </p>
 * </li>
 * <li>
 * <p>
 * IP address 127.0.0.0, HTTP method POST
 * </p>
 * </li>
 * <li>
 * <p>
 * IP address 10.1.1.1, HTTP method GET
 * </p>
 * </li>
 * </ul>
 * <p>
 * The rule would create different aggregation instances according to your aggregation criteria, for example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the aggregation criteria is just the IP address, then each individual address is an aggregation instance, and WAF
 * counts requests separately for each. The aggregation instances and request counts for our example would be the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * IP address 10.1.1.1: count 3
 * </p>
 * </li>
 * <li>
 * <p>
 * IP address 127.0.0.0: count 1
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * If the aggregation criteria is HTTP method, then each individual HTTP method is an aggregation instance. The
 * aggregation instances and request counts for our example would be the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * HTTP method POST: count 2
 * </p>
 * </li>
 * <li>
 * <p>
 * HTTP method GET: count 2
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * If the aggregation criteria is IP address and HTTP method, then each IP address and each HTTP method would contribute
 * to the combined aggregation instance. The aggregation instances and request counts for our example would be the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * IP address 10.1.1.1, HTTP method POST: count 1
 * </p>
 * </li>
 * <li>
 * <p>
 * IP address 10.1.1.1, HTTP method GET: count 2
 * </p>
 * </li>
 * <li>
 * <p>
 * IP address 127.0.0.0, HTTP method POST: count 1
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * For any n-tuple of aggregation keys, each unique combination of values for the keys defines a separate aggregation
 * instance, which WAF counts and rate-limits individually.
 * </p>
 * <p>
 * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so that it
 * only counts and rate limits requests that match the nested statement. You can use this nested scope-down statement in
 * conjunction with your aggregation key specifications or you can just count and rate limit all requests that match the
 * scope-down statement, without additional aggregation. When you choose to just manage all requests that match a
 * scope-down statement, the aggregation instance is singular for the rule.
 * </p>
 * <p>
 * You cannot nest a <code>RateBasedStatement</code> inside another statement, for example inside a
 * <code>NotStatement</code> or <code>OrStatement</code>. You can define a <code>RateBasedStatement</code> inside a web
 * ACL and inside a rule group.
 * </p>
 * <p>
 * For additional information about the options, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html">Rate limiting web requests
 * using rate-based rules</a> in the <i>WAF Developer Guide</i>.
 * </p>
 * <p>
 * If you only aggregate on the individual IP address or forwarded IP address, you can retrieve the list of IP addresses
 * that WAF is currently rate limiting for a rule through the API call <code>GetRateBasedStatementManagedKeys</code>.
 * This option is not available for other aggregation configurations.
 * </p>
 * <p>
 * WAF tracks and manages web requests separately for each instance of a rate-based rule that you use. For example, if
 * you provide the same rate-based rule settings in two web ACLs, each of the two rule statements represents a separate
 * instance of the rate-based rule and gets its own tracking and management by WAF. If you define a rate-based rule
 * inside a rule group, and then use that rule group in multiple places, each use creates a separate instance of the
 * rate-based rule that gets its own tracking and management by WAF.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RateBasedStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateBasedStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The limit on requests per 5-minute period for a single aggregation instance for the rate-based rule. If the
     * rate-based statement includes a <code>ScopeDownStatement</code>, this limit is applied only to the requests that
     * match the statement.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you aggregate on just the IP address, this is the limit on requests from any single IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aggregate on the HTTP method and the query argument name "city", then this is the limit on requests for
     * any single method, city pair.
     * </p>
     * </li>
     * </ul>
     */
    private Long limit;
    /**
     * <p>
     * The amount of time, in seconds, that WAF should include in its request counts, looking back from the current
     * time. For example, for a setting of 120, when WAF checks the rate, it counts the requests for the 2 minutes
     * immediately preceding the current time. Valid settings are 60, 120, 300, and 600.
     * </p>
     * <p>
     * This setting doesn't determine how often WAF checks the rate, but how far back it looks each time it checks. WAF
     * checks the rate about every 10 seconds.
     * </p>
     * <p>
     * Default: <code>300</code> (5 minutes)
     * </p>
     */
    private Long evaluationWindowSec;
    /**
     * <p>
     * Setting that indicates how to aggregate the request counts.
     * </p>
     * <note>
     * <p>
     * Web requests that are missing any of the components specified in the aggregation keys are omitted from the
     * rate-based rule evaluation and handling.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>CONSTANT</code> - Count and limit the requests that match the rate-based rule's scope-down statement. With
     * this option, the counted requests aren't further aggregated. The scope-down statement is the only specification
     * used. When the count of all requests that satisfy the scope-down statement goes over the limit, WAF applies the
     * rule action to all requests that satisfy the scope-down statement.
     * </p>
     * <p>
     * With this option, you must configure the <code>ScopeDownStatement</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_KEYS</code> - Aggregate the request counts using one or more web request components as the aggregate
     * keys.
     * </p>
     * <p>
     * With this option, you must specify the aggregate keys in the <code>CustomKeys</code> property.
     * </p>
     * <p>
     * To aggregate on only the IP address or only the forwarded IP address, don't use custom keys. Instead, set the
     * aggregate key type to <code>IP</code> or <code>FORWARDED_IP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORWARDED_IP</code> - Aggregate the request counts on the first IP address in an HTTP header.
     * </p>
     * <p>
     * With this option, you must specify the header to use in the <code>ForwardedIPConfig</code> property.
     * </p>
     * <p>
     * To aggregate on a combination of the forwarded IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> - Aggregate the request counts on the IP address from the web request origin.
     * </p>
     * <p>
     * To aggregate on a combination of the IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String aggregateKeyType;
    /**
     * <p>
     * An optional nested statement that narrows the scope of the web requests that are evaluated and managed by the
     * rate-based statement. When you use a scope-down statement, the rate-based rule only tracks and rate limits
     * requests that match the scope-down statement. You can use any nestable <a>Statement</a> in the scope-down
     * statement, and you can nest statements at any level, the same as you can for a rule statement.
     * </p>
     */
    private Statement scopeDownStatement;
    /**
     * <p>
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address
     * that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can
     * specify any header name.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * <p>
     * This is required if you specify a forwarded IP in the rule's aggregate key settings.
     * </p>
     */
    private ForwardedIPConfig forwardedIPConfig;
    /**
     * <p>
     * Specifies the aggregate keys to use in a rate-base rule.
     * </p>
     */
    private java.util.List<RateBasedStatementCustomKey> customKeys;

    /**
     * <p>
     * The limit on requests per 5-minute period for a single aggregation instance for the rate-based rule. If the
     * rate-based statement includes a <code>ScopeDownStatement</code>, this limit is applied only to the requests that
     * match the statement.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you aggregate on just the IP address, this is the limit on requests from any single IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aggregate on the HTTP method and the query argument name "city", then this is the limit on requests for
     * any single method, city pair.
     * </p>
     * </li>
     * </ul>
     * 
     * @param limit
     *        The limit on requests per 5-minute period for a single aggregation instance for the rate-based rule. If
     *        the rate-based statement includes a <code>ScopeDownStatement</code>, this limit is applied only to the
     *        requests that match the statement.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you aggregate on just the IP address, this is the limit on requests from any single IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you aggregate on the HTTP method and the query argument name "city", then this is the limit on requests
     *        for any single method, city pair.
     *        </p>
     *        </li>
     */

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The limit on requests per 5-minute period for a single aggregation instance for the rate-based rule. If the
     * rate-based statement includes a <code>ScopeDownStatement</code>, this limit is applied only to the requests that
     * match the statement.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you aggregate on just the IP address, this is the limit on requests from any single IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aggregate on the HTTP method and the query argument name "city", then this is the limit on requests for
     * any single method, city pair.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The limit on requests per 5-minute period for a single aggregation instance for the rate-based rule. If
     *         the rate-based statement includes a <code>ScopeDownStatement</code>, this limit is applied only to the
     *         requests that match the statement.</p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you aggregate on just the IP address, this is the limit on requests from any single IP address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you aggregate on the HTTP method and the query argument name "city", then this is the limit on
     *         requests for any single method, city pair.
     *         </p>
     *         </li>
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The limit on requests per 5-minute period for a single aggregation instance for the rate-based rule. If the
     * rate-based statement includes a <code>ScopeDownStatement</code>, this limit is applied only to the requests that
     * match the statement.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you aggregate on just the IP address, this is the limit on requests from any single IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aggregate on the HTTP method and the query argument name "city", then this is the limit on requests for
     * any single method, city pair.
     * </p>
     * </li>
     * </ul>
     * 
     * @param limit
     *        The limit on requests per 5-minute period for a single aggregation instance for the rate-based rule. If
     *        the rate-based statement includes a <code>ScopeDownStatement</code>, this limit is applied only to the
     *        requests that match the statement.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you aggregate on just the IP address, this is the limit on requests from any single IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you aggregate on the HTTP method and the query argument name "city", then this is the limit on requests
     *        for any single method, city pair.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatement withLimit(Long limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that WAF should include in its request counts, looking back from the current
     * time. For example, for a setting of 120, when WAF checks the rate, it counts the requests for the 2 minutes
     * immediately preceding the current time. Valid settings are 60, 120, 300, and 600.
     * </p>
     * <p>
     * This setting doesn't determine how often WAF checks the rate, but how far back it looks each time it checks. WAF
     * checks the rate about every 10 seconds.
     * </p>
     * <p>
     * Default: <code>300</code> (5 minutes)
     * </p>
     * 
     * @param evaluationWindowSec
     *        The amount of time, in seconds, that WAF should include in its request counts, looking back from the
     *        current time. For example, for a setting of 120, when WAF checks the rate, it counts the requests for the
     *        2 minutes immediately preceding the current time. Valid settings are 60, 120, 300, and 600. </p>
     *        <p>
     *        This setting doesn't determine how often WAF checks the rate, but how far back it looks each time it
     *        checks. WAF checks the rate about every 10 seconds.
     *        </p>
     *        <p>
     *        Default: <code>300</code> (5 minutes)
     */

    public void setEvaluationWindowSec(Long evaluationWindowSec) {
        this.evaluationWindowSec = evaluationWindowSec;
    }

    /**
     * <p>
     * The amount of time, in seconds, that WAF should include in its request counts, looking back from the current
     * time. For example, for a setting of 120, when WAF checks the rate, it counts the requests for the 2 minutes
     * immediately preceding the current time. Valid settings are 60, 120, 300, and 600.
     * </p>
     * <p>
     * This setting doesn't determine how often WAF checks the rate, but how far back it looks each time it checks. WAF
     * checks the rate about every 10 seconds.
     * </p>
     * <p>
     * Default: <code>300</code> (5 minutes)
     * </p>
     * 
     * @return The amount of time, in seconds, that WAF should include in its request counts, looking back from the
     *         current time. For example, for a setting of 120, when WAF checks the rate, it counts the requests for the
     *         2 minutes immediately preceding the current time. Valid settings are 60, 120, 300, and 600. </p>
     *         <p>
     *         This setting doesn't determine how often WAF checks the rate, but how far back it looks each time it
     *         checks. WAF checks the rate about every 10 seconds.
     *         </p>
     *         <p>
     *         Default: <code>300</code> (5 minutes)
     */

    public Long getEvaluationWindowSec() {
        return this.evaluationWindowSec;
    }

    /**
     * <p>
     * The amount of time, in seconds, that WAF should include in its request counts, looking back from the current
     * time. For example, for a setting of 120, when WAF checks the rate, it counts the requests for the 2 minutes
     * immediately preceding the current time. Valid settings are 60, 120, 300, and 600.
     * </p>
     * <p>
     * This setting doesn't determine how often WAF checks the rate, but how far back it looks each time it checks. WAF
     * checks the rate about every 10 seconds.
     * </p>
     * <p>
     * Default: <code>300</code> (5 minutes)
     * </p>
     * 
     * @param evaluationWindowSec
     *        The amount of time, in seconds, that WAF should include in its request counts, looking back from the
     *        current time. For example, for a setting of 120, when WAF checks the rate, it counts the requests for the
     *        2 minutes immediately preceding the current time. Valid settings are 60, 120, 300, and 600. </p>
     *        <p>
     *        This setting doesn't determine how often WAF checks the rate, but how far back it looks each time it
     *        checks. WAF checks the rate about every 10 seconds.
     *        </p>
     *        <p>
     *        Default: <code>300</code> (5 minutes)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatement withEvaluationWindowSec(Long evaluationWindowSec) {
        setEvaluationWindowSec(evaluationWindowSec);
        return this;
    }

    /**
     * <p>
     * Setting that indicates how to aggregate the request counts.
     * </p>
     * <note>
     * <p>
     * Web requests that are missing any of the components specified in the aggregation keys are omitted from the
     * rate-based rule evaluation and handling.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>CONSTANT</code> - Count and limit the requests that match the rate-based rule's scope-down statement. With
     * this option, the counted requests aren't further aggregated. The scope-down statement is the only specification
     * used. When the count of all requests that satisfy the scope-down statement goes over the limit, WAF applies the
     * rule action to all requests that satisfy the scope-down statement.
     * </p>
     * <p>
     * With this option, you must configure the <code>ScopeDownStatement</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_KEYS</code> - Aggregate the request counts using one or more web request components as the aggregate
     * keys.
     * </p>
     * <p>
     * With this option, you must specify the aggregate keys in the <code>CustomKeys</code> property.
     * </p>
     * <p>
     * To aggregate on only the IP address or only the forwarded IP address, don't use custom keys. Instead, set the
     * aggregate key type to <code>IP</code> or <code>FORWARDED_IP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORWARDED_IP</code> - Aggregate the request counts on the first IP address in an HTTP header.
     * </p>
     * <p>
     * With this option, you must specify the header to use in the <code>ForwardedIPConfig</code> property.
     * </p>
     * <p>
     * To aggregate on a combination of the forwarded IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> - Aggregate the request counts on the IP address from the web request origin.
     * </p>
     * <p>
     * To aggregate on a combination of the IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregateKeyType
     *        Setting that indicates how to aggregate the request counts. </p> <note>
     *        <p>
     *        Web requests that are missing any of the components specified in the aggregation keys are omitted from the
     *        rate-based rule evaluation and handling.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONSTANT</code> - Count and limit the requests that match the rate-based rule's scope-down
     *        statement. With this option, the counted requests aren't further aggregated. The scope-down statement is
     *        the only specification used. When the count of all requests that satisfy the scope-down statement goes
     *        over the limit, WAF applies the rule action to all requests that satisfy the scope-down statement.
     *        </p>
     *        <p>
     *        With this option, you must configure the <code>ScopeDownStatement</code> property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM_KEYS</code> - Aggregate the request counts using one or more web request components as the
     *        aggregate keys.
     *        </p>
     *        <p>
     *        With this option, you must specify the aggregate keys in the <code>CustomKeys</code> property.
     *        </p>
     *        <p>
     *        To aggregate on only the IP address or only the forwarded IP address, don't use custom keys. Instead, set
     *        the aggregate key type to <code>IP</code> or <code>FORWARDED_IP</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORWARDED_IP</code> - Aggregate the request counts on the first IP address in an HTTP header.
     *        </p>
     *        <p>
     *        With this option, you must specify the header to use in the <code>ForwardedIPConfig</code> property.
     *        </p>
     *        <p>
     *        To aggregate on a combination of the forwarded IP address with other aggregate keys, use
     *        <code>CUSTOM_KEYS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IP</code> - Aggregate the request counts on the IP address from the web request origin.
     *        </p>
     *        <p>
     *        To aggregate on a combination of the IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>.
     *        </p>
     *        </li>
     * @see RateBasedStatementAggregateKeyType
     */

    public void setAggregateKeyType(String aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType;
    }

    /**
     * <p>
     * Setting that indicates how to aggregate the request counts.
     * </p>
     * <note>
     * <p>
     * Web requests that are missing any of the components specified in the aggregation keys are omitted from the
     * rate-based rule evaluation and handling.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>CONSTANT</code> - Count and limit the requests that match the rate-based rule's scope-down statement. With
     * this option, the counted requests aren't further aggregated. The scope-down statement is the only specification
     * used. When the count of all requests that satisfy the scope-down statement goes over the limit, WAF applies the
     * rule action to all requests that satisfy the scope-down statement.
     * </p>
     * <p>
     * With this option, you must configure the <code>ScopeDownStatement</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_KEYS</code> - Aggregate the request counts using one or more web request components as the aggregate
     * keys.
     * </p>
     * <p>
     * With this option, you must specify the aggregate keys in the <code>CustomKeys</code> property.
     * </p>
     * <p>
     * To aggregate on only the IP address or only the forwarded IP address, don't use custom keys. Instead, set the
     * aggregate key type to <code>IP</code> or <code>FORWARDED_IP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORWARDED_IP</code> - Aggregate the request counts on the first IP address in an HTTP header.
     * </p>
     * <p>
     * With this option, you must specify the header to use in the <code>ForwardedIPConfig</code> property.
     * </p>
     * <p>
     * To aggregate on a combination of the forwarded IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> - Aggregate the request counts on the IP address from the web request origin.
     * </p>
     * <p>
     * To aggregate on a combination of the IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Setting that indicates how to aggregate the request counts. </p> <note>
     *         <p>
     *         Web requests that are missing any of the components specified in the aggregation keys are omitted from
     *         the rate-based rule evaluation and handling.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CONSTANT</code> - Count and limit the requests that match the rate-based rule's scope-down
     *         statement. With this option, the counted requests aren't further aggregated. The scope-down statement is
     *         the only specification used. When the count of all requests that satisfy the scope-down statement goes
     *         over the limit, WAF applies the rule action to all requests that satisfy the scope-down statement.
     *         </p>
     *         <p>
     *         With this option, you must configure the <code>ScopeDownStatement</code> property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CUSTOM_KEYS</code> - Aggregate the request counts using one or more web request components as the
     *         aggregate keys.
     *         </p>
     *         <p>
     *         With this option, you must specify the aggregate keys in the <code>CustomKeys</code> property.
     *         </p>
     *         <p>
     *         To aggregate on only the IP address or only the forwarded IP address, don't use custom keys. Instead, set
     *         the aggregate key type to <code>IP</code> or <code>FORWARDED_IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FORWARDED_IP</code> - Aggregate the request counts on the first IP address in an HTTP header.
     *         </p>
     *         <p>
     *         With this option, you must specify the header to use in the <code>ForwardedIPConfig</code> property.
     *         </p>
     *         <p>
     *         To aggregate on a combination of the forwarded IP address with other aggregate keys, use
     *         <code>CUSTOM_KEYS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IP</code> - Aggregate the request counts on the IP address from the web request origin.
     *         </p>
     *         <p>
     *         To aggregate on a combination of the IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>.
     *         </p>
     *         </li>
     * @see RateBasedStatementAggregateKeyType
     */

    public String getAggregateKeyType() {
        return this.aggregateKeyType;
    }

    /**
     * <p>
     * Setting that indicates how to aggregate the request counts.
     * </p>
     * <note>
     * <p>
     * Web requests that are missing any of the components specified in the aggregation keys are omitted from the
     * rate-based rule evaluation and handling.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>CONSTANT</code> - Count and limit the requests that match the rate-based rule's scope-down statement. With
     * this option, the counted requests aren't further aggregated. The scope-down statement is the only specification
     * used. When the count of all requests that satisfy the scope-down statement goes over the limit, WAF applies the
     * rule action to all requests that satisfy the scope-down statement.
     * </p>
     * <p>
     * With this option, you must configure the <code>ScopeDownStatement</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_KEYS</code> - Aggregate the request counts using one or more web request components as the aggregate
     * keys.
     * </p>
     * <p>
     * With this option, you must specify the aggregate keys in the <code>CustomKeys</code> property.
     * </p>
     * <p>
     * To aggregate on only the IP address or only the forwarded IP address, don't use custom keys. Instead, set the
     * aggregate key type to <code>IP</code> or <code>FORWARDED_IP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORWARDED_IP</code> - Aggregate the request counts on the first IP address in an HTTP header.
     * </p>
     * <p>
     * With this option, you must specify the header to use in the <code>ForwardedIPConfig</code> property.
     * </p>
     * <p>
     * To aggregate on a combination of the forwarded IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> - Aggregate the request counts on the IP address from the web request origin.
     * </p>
     * <p>
     * To aggregate on a combination of the IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregateKeyType
     *        Setting that indicates how to aggregate the request counts. </p> <note>
     *        <p>
     *        Web requests that are missing any of the components specified in the aggregation keys are omitted from the
     *        rate-based rule evaluation and handling.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONSTANT</code> - Count and limit the requests that match the rate-based rule's scope-down
     *        statement. With this option, the counted requests aren't further aggregated. The scope-down statement is
     *        the only specification used. When the count of all requests that satisfy the scope-down statement goes
     *        over the limit, WAF applies the rule action to all requests that satisfy the scope-down statement.
     *        </p>
     *        <p>
     *        With this option, you must configure the <code>ScopeDownStatement</code> property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM_KEYS</code> - Aggregate the request counts using one or more web request components as the
     *        aggregate keys.
     *        </p>
     *        <p>
     *        With this option, you must specify the aggregate keys in the <code>CustomKeys</code> property.
     *        </p>
     *        <p>
     *        To aggregate on only the IP address or only the forwarded IP address, don't use custom keys. Instead, set
     *        the aggregate key type to <code>IP</code> or <code>FORWARDED_IP</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORWARDED_IP</code> - Aggregate the request counts on the first IP address in an HTTP header.
     *        </p>
     *        <p>
     *        With this option, you must specify the header to use in the <code>ForwardedIPConfig</code> property.
     *        </p>
     *        <p>
     *        To aggregate on a combination of the forwarded IP address with other aggregate keys, use
     *        <code>CUSTOM_KEYS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IP</code> - Aggregate the request counts on the IP address from the web request origin.
     *        </p>
     *        <p>
     *        To aggregate on a combination of the IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RateBasedStatementAggregateKeyType
     */

    public RateBasedStatement withAggregateKeyType(String aggregateKeyType) {
        setAggregateKeyType(aggregateKeyType);
        return this;
    }

    /**
     * <p>
     * Setting that indicates how to aggregate the request counts.
     * </p>
     * <note>
     * <p>
     * Web requests that are missing any of the components specified in the aggregation keys are omitted from the
     * rate-based rule evaluation and handling.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>CONSTANT</code> - Count and limit the requests that match the rate-based rule's scope-down statement. With
     * this option, the counted requests aren't further aggregated. The scope-down statement is the only specification
     * used. When the count of all requests that satisfy the scope-down statement goes over the limit, WAF applies the
     * rule action to all requests that satisfy the scope-down statement.
     * </p>
     * <p>
     * With this option, you must configure the <code>ScopeDownStatement</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_KEYS</code> - Aggregate the request counts using one or more web request components as the aggregate
     * keys.
     * </p>
     * <p>
     * With this option, you must specify the aggregate keys in the <code>CustomKeys</code> property.
     * </p>
     * <p>
     * To aggregate on only the IP address or only the forwarded IP address, don't use custom keys. Instead, set the
     * aggregate key type to <code>IP</code> or <code>FORWARDED_IP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORWARDED_IP</code> - Aggregate the request counts on the first IP address in an HTTP header.
     * </p>
     * <p>
     * With this option, you must specify the header to use in the <code>ForwardedIPConfig</code> property.
     * </p>
     * <p>
     * To aggregate on a combination of the forwarded IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> - Aggregate the request counts on the IP address from the web request origin.
     * </p>
     * <p>
     * To aggregate on a combination of the IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregateKeyType
     *        Setting that indicates how to aggregate the request counts. </p> <note>
     *        <p>
     *        Web requests that are missing any of the components specified in the aggregation keys are omitted from the
     *        rate-based rule evaluation and handling.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONSTANT</code> - Count and limit the requests that match the rate-based rule's scope-down
     *        statement. With this option, the counted requests aren't further aggregated. The scope-down statement is
     *        the only specification used. When the count of all requests that satisfy the scope-down statement goes
     *        over the limit, WAF applies the rule action to all requests that satisfy the scope-down statement.
     *        </p>
     *        <p>
     *        With this option, you must configure the <code>ScopeDownStatement</code> property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM_KEYS</code> - Aggregate the request counts using one or more web request components as the
     *        aggregate keys.
     *        </p>
     *        <p>
     *        With this option, you must specify the aggregate keys in the <code>CustomKeys</code> property.
     *        </p>
     *        <p>
     *        To aggregate on only the IP address or only the forwarded IP address, don't use custom keys. Instead, set
     *        the aggregate key type to <code>IP</code> or <code>FORWARDED_IP</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORWARDED_IP</code> - Aggregate the request counts on the first IP address in an HTTP header.
     *        </p>
     *        <p>
     *        With this option, you must specify the header to use in the <code>ForwardedIPConfig</code> property.
     *        </p>
     *        <p>
     *        To aggregate on a combination of the forwarded IP address with other aggregate keys, use
     *        <code>CUSTOM_KEYS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IP</code> - Aggregate the request counts on the IP address from the web request origin.
     *        </p>
     *        <p>
     *        To aggregate on a combination of the IP address with other aggregate keys, use <code>CUSTOM_KEYS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RateBasedStatementAggregateKeyType
     */

    public RateBasedStatement withAggregateKeyType(RateBasedStatementAggregateKeyType aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType.toString();
        return this;
    }

    /**
     * <p>
     * An optional nested statement that narrows the scope of the web requests that are evaluated and managed by the
     * rate-based statement. When you use a scope-down statement, the rate-based rule only tracks and rate limits
     * requests that match the scope-down statement. You can use any nestable <a>Statement</a> in the scope-down
     * statement, and you can nest statements at any level, the same as you can for a rule statement.
     * </p>
     * 
     * @param scopeDownStatement
     *        An optional nested statement that narrows the scope of the web requests that are evaluated and managed by
     *        the rate-based statement. When you use a scope-down statement, the rate-based rule only tracks and rate
     *        limits requests that match the scope-down statement. You can use any nestable <a>Statement</a> in the
     *        scope-down statement, and you can nest statements at any level, the same as you can for a rule statement.
     */

    public void setScopeDownStatement(Statement scopeDownStatement) {
        this.scopeDownStatement = scopeDownStatement;
    }

    /**
     * <p>
     * An optional nested statement that narrows the scope of the web requests that are evaluated and managed by the
     * rate-based statement. When you use a scope-down statement, the rate-based rule only tracks and rate limits
     * requests that match the scope-down statement. You can use any nestable <a>Statement</a> in the scope-down
     * statement, and you can nest statements at any level, the same as you can for a rule statement.
     * </p>
     * 
     * @return An optional nested statement that narrows the scope of the web requests that are evaluated and managed by
     *         the rate-based statement. When you use a scope-down statement, the rate-based rule only tracks and rate
     *         limits requests that match the scope-down statement. You can use any nestable <a>Statement</a> in the
     *         scope-down statement, and you can nest statements at any level, the same as you can for a rule statement.
     */

    public Statement getScopeDownStatement() {
        return this.scopeDownStatement;
    }

    /**
     * <p>
     * An optional nested statement that narrows the scope of the web requests that are evaluated and managed by the
     * rate-based statement. When you use a scope-down statement, the rate-based rule only tracks and rate limits
     * requests that match the scope-down statement. You can use any nestable <a>Statement</a> in the scope-down
     * statement, and you can nest statements at any level, the same as you can for a rule statement.
     * </p>
     * 
     * @param scopeDownStatement
     *        An optional nested statement that narrows the scope of the web requests that are evaluated and managed by
     *        the rate-based statement. When you use a scope-down statement, the rate-based rule only tracks and rate
     *        limits requests that match the scope-down statement. You can use any nestable <a>Statement</a> in the
     *        scope-down statement, and you can nest statements at any level, the same as you can for a rule statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatement withScopeDownStatement(Statement scopeDownStatement) {
        setScopeDownStatement(scopeDownStatement);
        return this;
    }

    /**
     * <p>
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address
     * that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can
     * specify any header name.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * <p>
     * This is required if you specify a forwarded IP in the rule's aggregate key settings.
     * </p>
     * 
     * @param forwardedIPConfig
     *        The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP
     *        address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but
     *        you can specify any header name. </p> <note>
     *        <p>
     *        If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *        all.
     *        </p>
     *        </note>
     *        <p>
     *        This is required if you specify a forwarded IP in the rule's aggregate key settings.
     */

    public void setForwardedIPConfig(ForwardedIPConfig forwardedIPConfig) {
        this.forwardedIPConfig = forwardedIPConfig;
    }

    /**
     * <p>
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address
     * that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can
     * specify any header name.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * <p>
     * This is required if you specify a forwarded IP in the rule's aggregate key settings.
     * </p>
     * 
     * @return The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP
     *         address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header,
     *         but you can specify any header name. </p> <note>
     *         <p>
     *         If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *         all.
     *         </p>
     *         </note>
     *         <p>
     *         This is required if you specify a forwarded IP in the rule's aggregate key settings.
     */

    public ForwardedIPConfig getForwardedIPConfig() {
        return this.forwardedIPConfig;
    }

    /**
     * <p>
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address
     * that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can
     * specify any header name.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * <p>
     * This is required if you specify a forwarded IP in the rule's aggregate key settings.
     * </p>
     * 
     * @param forwardedIPConfig
     *        The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP
     *        address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but
     *        you can specify any header name. </p> <note>
     *        <p>
     *        If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *        all.
     *        </p>
     *        </note>
     *        <p>
     *        This is required if you specify a forwarded IP in the rule's aggregate key settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatement withForwardedIPConfig(ForwardedIPConfig forwardedIPConfig) {
        setForwardedIPConfig(forwardedIPConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the aggregate keys to use in a rate-base rule.
     * </p>
     * 
     * @return Specifies the aggregate keys to use in a rate-base rule.
     */

    public java.util.List<RateBasedStatementCustomKey> getCustomKeys() {
        return customKeys;
    }

    /**
     * <p>
     * Specifies the aggregate keys to use in a rate-base rule.
     * </p>
     * 
     * @param customKeys
     *        Specifies the aggregate keys to use in a rate-base rule.
     */

    public void setCustomKeys(java.util.Collection<RateBasedStatementCustomKey> customKeys) {
        if (customKeys == null) {
            this.customKeys = null;
            return;
        }

        this.customKeys = new java.util.ArrayList<RateBasedStatementCustomKey>(customKeys);
    }

    /**
     * <p>
     * Specifies the aggregate keys to use in a rate-base rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomKeys(java.util.Collection)} or {@link #withCustomKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customKeys
     *        Specifies the aggregate keys to use in a rate-base rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatement withCustomKeys(RateBasedStatementCustomKey... customKeys) {
        if (this.customKeys == null) {
            setCustomKeys(new java.util.ArrayList<RateBasedStatementCustomKey>(customKeys.length));
        }
        for (RateBasedStatementCustomKey ele : customKeys) {
            this.customKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the aggregate keys to use in a rate-base rule.
     * </p>
     * 
     * @param customKeys
     *        Specifies the aggregate keys to use in a rate-base rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatement withCustomKeys(java.util.Collection<RateBasedStatementCustomKey> customKeys) {
        setCustomKeys(customKeys);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getEvaluationWindowSec() != null)
            sb.append("EvaluationWindowSec: ").append(getEvaluationWindowSec()).append(",");
        if (getAggregateKeyType() != null)
            sb.append("AggregateKeyType: ").append(getAggregateKeyType()).append(",");
        if (getScopeDownStatement() != null)
            sb.append("ScopeDownStatement: ").append(getScopeDownStatement()).append(",");
        if (getForwardedIPConfig() != null)
            sb.append("ForwardedIPConfig: ").append(getForwardedIPConfig()).append(",");
        if (getCustomKeys() != null)
            sb.append("CustomKeys: ").append(getCustomKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RateBasedStatement == false)
            return false;
        RateBasedStatement other = (RateBasedStatement) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getEvaluationWindowSec() == null ^ this.getEvaluationWindowSec() == null)
            return false;
        if (other.getEvaluationWindowSec() != null && other.getEvaluationWindowSec().equals(this.getEvaluationWindowSec()) == false)
            return false;
        if (other.getAggregateKeyType() == null ^ this.getAggregateKeyType() == null)
            return false;
        if (other.getAggregateKeyType() != null && other.getAggregateKeyType().equals(this.getAggregateKeyType()) == false)
            return false;
        if (other.getScopeDownStatement() == null ^ this.getScopeDownStatement() == null)
            return false;
        if (other.getScopeDownStatement() != null && other.getScopeDownStatement().equals(this.getScopeDownStatement()) == false)
            return false;
        if (other.getForwardedIPConfig() == null ^ this.getForwardedIPConfig() == null)
            return false;
        if (other.getForwardedIPConfig() != null && other.getForwardedIPConfig().equals(this.getForwardedIPConfig()) == false)
            return false;
        if (other.getCustomKeys() == null ^ this.getCustomKeys() == null)
            return false;
        if (other.getCustomKeys() != null && other.getCustomKeys().equals(this.getCustomKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getEvaluationWindowSec() == null) ? 0 : getEvaluationWindowSec().hashCode());
        hashCode = prime * hashCode + ((getAggregateKeyType() == null) ? 0 : getAggregateKeyType().hashCode());
        hashCode = prime * hashCode + ((getScopeDownStatement() == null) ? 0 : getScopeDownStatement().hashCode());
        hashCode = prime * hashCode + ((getForwardedIPConfig() == null) ? 0 : getForwardedIPConfig().hashCode());
        hashCode = prime * hashCode + ((getCustomKeys() == null) ? 0 : getCustomKeys().hashCode());
        return hashCode;
    }

    @Override
    public RateBasedStatement clone() {
        try {
            return (RateBasedStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RateBasedStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
