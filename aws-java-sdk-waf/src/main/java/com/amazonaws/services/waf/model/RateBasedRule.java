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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>RateBasedRule</code> is identical to a regular <a>Rule</a>, with one addition: a <code>RateBasedRule</code>
 * counts the number of requests that arrive from a specified IP address every five minutes. For example, based on
 * recent requests that you've seen from an attacker, you might create a <code>RateBasedRule</code> that includes the
 * following conditions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The requests come from 192.0.2.44.
 * </p>
 * </li>
 * <li>
 * <p>
 * They contain the value <code>BadBot</code> in the <code>User-Agent</code> header.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In the rule, you also define the rate limit as 15,000.
 * </p>
 * <p>
 * Requests that meet both of these conditions and exceed 15,000 requests every five minutes trigger the rule's action
 * (block or count), which is defined in the web ACL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/RateBasedRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateBasedRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for a <code>RateBasedRule</code>. You use <code>RuleId</code> to get more information about a
     * <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a <code>RateBasedRule</code> (see
     * <a>UpdateRateBasedRule</a>), insert a <code>RateBasedRule</code> into a <code>WebACL</code> or delete one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a <code>RateBasedRule</code> from AWS WAF (see
     * <a>DeleteRateBasedRule</a>).
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * A friendly name or description for a <code>RateBasedRule</code>. You can't change the name of a
     * <code>RateBasedRule</code> after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A friendly name or description for the metrics for a <code>RateBasedRule</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     * <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want to include in a <code>RateBasedRule</code>.
     * </p>
     */
    private java.util.List<Predicate> matchPredicates;
    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests arriving from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     */
    private String rateKey;
    /**
     * <p>
     * The maximum number of requests, which have an identical value in the field specified by the <code>RateKey</code>,
     * allowed in a five-minute period. If the number of requests exceeds the <code>RateLimit</code> and the other
     * predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
     * </p>
     */
    private Long rateLimit;

    /**
     * <p>
     * A unique identifier for a <code>RateBasedRule</code>. You use <code>RuleId</code> to get more information about a
     * <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a <code>RateBasedRule</code> (see
     * <a>UpdateRateBasedRule</a>), insert a <code>RateBasedRule</code> into a <code>WebACL</code> or delete one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a <code>RateBasedRule</code> from AWS WAF (see
     * <a>DeleteRateBasedRule</a>).
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for a <code>RateBasedRule</code>. You use <code>RuleId</code> to get more information
     *        about a <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a <code>RateBasedRule</code> (see
     *        <a>UpdateRateBasedRule</a>), insert a <code>RateBasedRule</code> into a <code>WebACL</code> or delete one
     *        from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a <code>RateBasedRule</code> from AWS WAF
     *        (see <a>DeleteRateBasedRule</a>).
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * A unique identifier for a <code>RateBasedRule</code>. You use <code>RuleId</code> to get more information about a
     * <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a <code>RateBasedRule</code> (see
     * <a>UpdateRateBasedRule</a>), insert a <code>RateBasedRule</code> into a <code>WebACL</code> or delete one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a <code>RateBasedRule</code> from AWS WAF (see
     * <a>DeleteRateBasedRule</a>).
     * </p>
     * 
     * @return A unique identifier for a <code>RateBasedRule</code>. You use <code>RuleId</code> to get more information
     *         about a <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a <code>RateBasedRule</code>
     *         (see <a>UpdateRateBasedRule</a>), insert a <code>RateBasedRule</code> into a <code>WebACL</code> or
     *         delete one from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a <code>RateBasedRule</code>
     *         from AWS WAF (see <a>DeleteRateBasedRule</a>).
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * A unique identifier for a <code>RateBasedRule</code>. You use <code>RuleId</code> to get more information about a
     * <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a <code>RateBasedRule</code> (see
     * <a>UpdateRateBasedRule</a>), insert a <code>RateBasedRule</code> into a <code>WebACL</code> or delete one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a <code>RateBasedRule</code> from AWS WAF (see
     * <a>DeleteRateBasedRule</a>).
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for a <code>RateBasedRule</code>. You use <code>RuleId</code> to get more information
     *        about a <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a <code>RateBasedRule</code> (see
     *        <a>UpdateRateBasedRule</a>), insert a <code>RateBasedRule</code> into a <code>WebACL</code> or delete one
     *        from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a <code>RateBasedRule</code> from AWS WAF
     *        (see <a>DeleteRateBasedRule</a>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedRule withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * A friendly name or description for a <code>RateBasedRule</code>. You can't change the name of a
     * <code>RateBasedRule</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description for a <code>RateBasedRule</code>. You can't change the name of a
     *        <code>RateBasedRule</code> after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description for a <code>RateBasedRule</code>. You can't change the name of a
     * <code>RateBasedRule</code> after you create it.
     * </p>
     * 
     * @return A friendly name or description for a <code>RateBasedRule</code>. You can't change the name of a
     *         <code>RateBasedRule</code> after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description for a <code>RateBasedRule</code>. You can't change the name of a
     * <code>RateBasedRule</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description for a <code>RateBasedRule</code>. You can't change the name of a
     *        <code>RateBasedRule</code> after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for a <code>RateBasedRule</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name or description for the metrics for a <code>RateBasedRule</code>. The name can contain only
     *        alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of
     *        the metric after you create the <code>RateBasedRule</code>.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for a <code>RateBasedRule</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     * 
     * @return A friendly name or description for the metrics for a <code>RateBasedRule</code>. The name can contain
     *         only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the
     *         name of the metric after you create the <code>RateBasedRule</code>.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for a <code>RateBasedRule</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name or description for the metrics for a <code>RateBasedRule</code>. The name can contain only
     *        alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of
     *        the metric after you create the <code>RateBasedRule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedRule withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     * <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want to include in a <code>RateBasedRule</code>.
     * </p>
     * 
     * @return The <code>Predicates</code> object contains one <code>Predicate</code> element for each
     *         <a>ByteMatchSet</a>, <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want to include in a
     *         <code>RateBasedRule</code>.
     */

    public java.util.List<Predicate> getMatchPredicates() {
        return matchPredicates;
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     * <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want to include in a <code>RateBasedRule</code>.
     * </p>
     * 
     * @param matchPredicates
     *        The <code>Predicates</code> object contains one <code>Predicate</code> element for each
     *        <a>ByteMatchSet</a>, <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want to include in a
     *        <code>RateBasedRule</code>.
     */

    public void setMatchPredicates(java.util.Collection<Predicate> matchPredicates) {
        if (matchPredicates == null) {
            this.matchPredicates = null;
            return;
        }

        this.matchPredicates = new java.util.ArrayList<Predicate>(matchPredicates);
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     * <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want to include in a <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchPredicates(java.util.Collection)} or {@link #withMatchPredicates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param matchPredicates
     *        The <code>Predicates</code> object contains one <code>Predicate</code> element for each
     *        <a>ByteMatchSet</a>, <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want to include in a
     *        <code>RateBasedRule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedRule withMatchPredicates(Predicate... matchPredicates) {
        if (this.matchPredicates == null) {
            setMatchPredicates(new java.util.ArrayList<Predicate>(matchPredicates.length));
        }
        for (Predicate ele : matchPredicates) {
            this.matchPredicates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     * <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want to include in a <code>RateBasedRule</code>.
     * </p>
     * 
     * @param matchPredicates
     *        The <code>Predicates</code> object contains one <code>Predicate</code> element for each
     *        <a>ByteMatchSet</a>, <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want to include in a
     *        <code>RateBasedRule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedRule withMatchPredicates(java.util.Collection<Predicate> matchPredicates) {
        setMatchPredicates(matchPredicates);
        return this;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests arriving from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * 
     * @param rateKey
     *        The field that AWS WAF uses to determine if requests are likely arriving from single source and thus
     *        subject to rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>.
     *        <code>IP</code> indicates that requests arriving from the same IP address are subject to the
     *        <code>RateLimit</code> that is specified in the <code>RateBasedRule</code>.
     * @see RateKey
     */

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests arriving from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * 
     * @return The field that AWS WAF uses to determine if requests are likely arriving from single source and thus
     *         subject to rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>.
     *         <code>IP</code> indicates that requests arriving from the same IP address are subject to the
     *         <code>RateLimit</code> that is specified in the <code>RateBasedRule</code>.
     * @see RateKey
     */

    public String getRateKey() {
        return this.rateKey;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests arriving from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * 
     * @param rateKey
     *        The field that AWS WAF uses to determine if requests are likely arriving from single source and thus
     *        subject to rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>.
     *        <code>IP</code> indicates that requests arriving from the same IP address are subject to the
     *        <code>RateLimit</code> that is specified in the <code>RateBasedRule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RateKey
     */

    public RateBasedRule withRateKey(String rateKey) {
        setRateKey(rateKey);
        return this;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests arriving from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * 
     * @param rateKey
     *        The field that AWS WAF uses to determine if requests are likely arriving from single source and thus
     *        subject to rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>.
     *        <code>IP</code> indicates that requests arriving from the same IP address are subject to the
     *        <code>RateLimit</code> that is specified in the <code>RateBasedRule</code>.
     * @see RateKey
     */

    public void setRateKey(RateKey rateKey) {
        withRateKey(rateKey);
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests arriving from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * 
     * @param rateKey
     *        The field that AWS WAF uses to determine if requests are likely arriving from single source and thus
     *        subject to rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>.
     *        <code>IP</code> indicates that requests arriving from the same IP address are subject to the
     *        <code>RateLimit</code> that is specified in the <code>RateBasedRule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RateKey
     */

    public RateBasedRule withRateKey(RateKey rateKey) {
        this.rateKey = rateKey.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the field specified by the <code>RateKey</code>,
     * allowed in a five-minute period. If the number of requests exceeds the <code>RateLimit</code> and the other
     * predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
     * </p>
     * 
     * @param rateLimit
     *        The maximum number of requests, which have an identical value in the field specified by the
     *        <code>RateKey</code>, allowed in a five-minute period. If the number of requests exceeds the
     *        <code>RateLimit</code> and the other predicates specified in the rule are also met, AWS WAF triggers the
     *        action that is specified for this rule.
     */

    public void setRateLimit(Long rateLimit) {
        this.rateLimit = rateLimit;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the field specified by the <code>RateKey</code>,
     * allowed in a five-minute period. If the number of requests exceeds the <code>RateLimit</code> and the other
     * predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
     * </p>
     * 
     * @return The maximum number of requests, which have an identical value in the field specified by the
     *         <code>RateKey</code>, allowed in a five-minute period. If the number of requests exceeds the
     *         <code>RateLimit</code> and the other predicates specified in the rule are also met, AWS WAF triggers the
     *         action that is specified for this rule.
     */

    public Long getRateLimit() {
        return this.rateLimit;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the field specified by the <code>RateKey</code>,
     * allowed in a five-minute period. If the number of requests exceeds the <code>RateLimit</code> and the other
     * predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
     * </p>
     * 
     * @param rateLimit
     *        The maximum number of requests, which have an identical value in the field specified by the
     *        <code>RateKey</code>, allowed in a five-minute period. If the number of requests exceeds the
     *        <code>RateLimit</code> and the other predicates specified in the rule are also met, AWS WAF triggers the
     *        action that is specified for this rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateBasedRule withRateLimit(Long rateLimit) {
        setRateLimit(rateLimit);
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
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getMatchPredicates() != null)
            sb.append("MatchPredicates: ").append(getMatchPredicates()).append(",");
        if (getRateKey() != null)
            sb.append("RateKey: ").append(getRateKey()).append(",");
        if (getRateLimit() != null)
            sb.append("RateLimit: ").append(getRateLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RateBasedRule == false)
            return false;
        RateBasedRule other = (RateBasedRule) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMatchPredicates() == null ^ this.getMatchPredicates() == null)
            return false;
        if (other.getMatchPredicates() != null && other.getMatchPredicates().equals(this.getMatchPredicates()) == false)
            return false;
        if (other.getRateKey() == null ^ this.getRateKey() == null)
            return false;
        if (other.getRateKey() != null && other.getRateKey().equals(this.getRateKey()) == false)
            return false;
        if (other.getRateLimit() == null ^ this.getRateLimit() == null)
            return false;
        if (other.getRateLimit() != null && other.getRateLimit().equals(this.getRateLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMatchPredicates() == null) ? 0 : getMatchPredicates().hashCode());
        hashCode = prime * hashCode + ((getRateKey() == null) ? 0 : getRateKey().hashCode());
        hashCode = prime * hashCode + ((getRateLimit() == null) ? 0 : getRateLimit().hashCode());
        return hashCode;
    }

    @Override
    public RateBasedRule clone() {
        try {
            return (RateBasedRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.RateBasedRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
