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
 * A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule action when the
 * rate exceeds a limit that you specify on the number of requests in any 5-minute time span. You can use this to put a
 * temporary block on requests from an IP address that is sending excessive requests.
 * </p>
 * <p>
 * When the rule action triggers, AWS WAF blocks additional requests from the IP address until the request rate falls
 * below the limit.
 * </p>
 * <p>
 * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so that it
 * only counts requests that match the nested statement. For example, based on recent requests that you have seen from
 * an attacker, you might create a rate-based rule with a nested AND rule statement that contains the following nested
 * statements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An IP match statement with an IP set that specified the address 192.0.2.44.
 * </p>
 * </li>
 * <li>
 * <p>
 * A string match statement that searches in the User-Agent header for the string BadBot.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests that meet
 * both of the conditions in the statements are counted. If the count exceeds 1,000 requests per five minutes, the rule
 * action triggers. Requests that do not meet both conditions are not counted towards the rate limit and are not
 * affected by this rule.
 * </p>
 * <p>
 * You cannot nest a <code>RateBasedStatement</code>, for example for use inside a <code>NotStatement</code> or
 * <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RateBasedStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateBasedStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The limit on requests per 5-minute period for a single originating IP address. If the statement includes a
     * <code>ScopDownStatement</code>, this limit is applied only to the requests that match the statement.
     * </p>
     */
    private Long limit;
    /**
     * <p>
     * Setting that indicates how to aggregate the request counts. Currently, you must set this to <code>IP</code>. The
     * request counts are aggregated on IP addresses.
     * </p>
     */
    private String aggregateKeyType;
    /**
     * <p>
     * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This
     * can be any nestable statement, and you can nest statements at any level below this scope-down statement.
     * </p>
     */
    private Statement scopeDownStatement;

    /**
     * <p>
     * The limit on requests per 5-minute period for a single originating IP address. If the statement includes a
     * <code>ScopDownStatement</code>, this limit is applied only to the requests that match the statement.
     * </p>
     * 
     * @param limit
     *        The limit on requests per 5-minute period for a single originating IP address. If the statement includes a
     *        <code>ScopDownStatement</code>, this limit is applied only to the requests that match the statement.
     */

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The limit on requests per 5-minute period for a single originating IP address. If the statement includes a
     * <code>ScopDownStatement</code>, this limit is applied only to the requests that match the statement.
     * </p>
     * 
     * @return The limit on requests per 5-minute period for a single originating IP address. If the statement includes
     *         a <code>ScopDownStatement</code>, this limit is applied only to the requests that match the statement.
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The limit on requests per 5-minute period for a single originating IP address. If the statement includes a
     * <code>ScopDownStatement</code>, this limit is applied only to the requests that match the statement.
     * </p>
     * 
     * @param limit
     *        The limit on requests per 5-minute period for a single originating IP address. If the statement includes a
     *        <code>ScopDownStatement</code>, this limit is applied only to the requests that match the statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatement withLimit(Long limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Setting that indicates how to aggregate the request counts. Currently, you must set this to <code>IP</code>. The
     * request counts are aggregated on IP addresses.
     * </p>
     * 
     * @param aggregateKeyType
     *        Setting that indicates how to aggregate the request counts. Currently, you must set this to
     *        <code>IP</code>. The request counts are aggregated on IP addresses.
     * @see RateBasedStatementAggregateKeyType
     */

    public void setAggregateKeyType(String aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType;
    }

    /**
     * <p>
     * Setting that indicates how to aggregate the request counts. Currently, you must set this to <code>IP</code>. The
     * request counts are aggregated on IP addresses.
     * </p>
     * 
     * @return Setting that indicates how to aggregate the request counts. Currently, you must set this to
     *         <code>IP</code>. The request counts are aggregated on IP addresses.
     * @see RateBasedStatementAggregateKeyType
     */

    public String getAggregateKeyType() {
        return this.aggregateKeyType;
    }

    /**
     * <p>
     * Setting that indicates how to aggregate the request counts. Currently, you must set this to <code>IP</code>. The
     * request counts are aggregated on IP addresses.
     * </p>
     * 
     * @param aggregateKeyType
     *        Setting that indicates how to aggregate the request counts. Currently, you must set this to
     *        <code>IP</code>. The request counts are aggregated on IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RateBasedStatementAggregateKeyType
     */

    public RateBasedStatement withAggregateKeyType(String aggregateKeyType) {
        setAggregateKeyType(aggregateKeyType);
        return this;
    }

    /**
     * <p>
     * Setting that indicates how to aggregate the request counts. Currently, you must set this to <code>IP</code>. The
     * request counts are aggregated on IP addresses.
     * </p>
     * 
     * @param aggregateKeyType
     *        Setting that indicates how to aggregate the request counts. Currently, you must set this to
     *        <code>IP</code>. The request counts are aggregated on IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RateBasedStatementAggregateKeyType
     */

    public RateBasedStatement withAggregateKeyType(RateBasedStatementAggregateKeyType aggregateKeyType) {
        this.aggregateKeyType = aggregateKeyType.toString();
        return this;
    }

    /**
     * <p>
     * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This
     * can be any nestable statement, and you can nest statements at any level below this scope-down statement.
     * </p>
     * 
     * @param scopeDownStatement
     *        An optional nested statement that narrows the scope of the rate-based statement to matching web requests.
     *        This can be any nestable statement, and you can nest statements at any level below this scope-down
     *        statement.
     */

    public void setScopeDownStatement(Statement scopeDownStatement) {
        this.scopeDownStatement = scopeDownStatement;
    }

    /**
     * <p>
     * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This
     * can be any nestable statement, and you can nest statements at any level below this scope-down statement.
     * </p>
     * 
     * @return An optional nested statement that narrows the scope of the rate-based statement to matching web requests.
     *         This can be any nestable statement, and you can nest statements at any level below this scope-down
     *         statement.
     */

    public Statement getScopeDownStatement() {
        return this.scopeDownStatement;
    }

    /**
     * <p>
     * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This
     * can be any nestable statement, and you can nest statements at any level below this scope-down statement.
     * </p>
     * 
     * @param scopeDownStatement
     *        An optional nested statement that narrows the scope of the rate-based statement to matching web requests.
     *        This can be any nestable statement, and you can nest statements at any level below this scope-down
     *        statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedStatement withScopeDownStatement(Statement scopeDownStatement) {
        setScopeDownStatement(scopeDownStatement);
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
        if (getAggregateKeyType() != null)
            sb.append("AggregateKeyType: ").append(getAggregateKeyType()).append(",");
        if (getScopeDownStatement() != null)
            sb.append("ScopeDownStatement: ").append(getScopeDownStatement());
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
        if (other.getAggregateKeyType() == null ^ this.getAggregateKeyType() == null)
            return false;
        if (other.getAggregateKeyType() != null && other.getAggregateKeyType().equals(this.getAggregateKeyType()) == false)
            return false;
        if (other.getScopeDownStatement() == null ^ this.getScopeDownStatement() == null)
            return false;
        if (other.getScopeDownStatement() != null && other.getScopeDownStatement().equals(this.getScopeDownStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getAggregateKeyType() == null) ? 0 : getAggregateKeyType().hashCode());
        hashCode = prime * hashCode + ((getScopeDownStatement() == null) ? 0 : getScopeDownStatement().hashCode());
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
