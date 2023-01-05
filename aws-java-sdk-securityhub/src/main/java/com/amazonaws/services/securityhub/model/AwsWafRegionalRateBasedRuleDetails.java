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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * contains details about a rate-based rule for Regional resources. A rate-based rule provides settings to indicate when
 * to allow, block, or count a request. Rate-based rules include the number of requests that arrive over a specified
 * period of time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafRegionalRateBasedRuleDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafRegionalRateBasedRuleDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metrics for the rate-based rule.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The name of the rate-based rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The field that WAF uses to determine whether requests are likely arriving from single source and are subject to
     * rate monitoring.
     * </p>
     */
    private String rateKey;
    /**
     * <p>
     * The maximum number of requests that have an identical value for the field specified in <code>RateKey</code> that
     * are allowed within a five-minute period. If the number of requests exceeds <code>RateLimit</code> and the other
     * predicates specified in the rule are met, WAF triggers the action for the rule.
     * </p>
     */
    private Long rateLimit;
    /**
     * <p>
     * The unique identifier for the rate-based rule.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The predicates to include in the rate-based rule.
     * </p>
     */
    private java.util.List<AwsWafRegionalRateBasedRuleMatchPredicate> matchPredicates;

    /**
     * <p>
     * The name of the metrics for the rate-based rule.
     * </p>
     * 
     * @param metricName
     *        The name of the metrics for the rate-based rule.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metrics for the rate-based rule.
     * </p>
     * 
     * @return The name of the metrics for the rate-based rule.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metrics for the rate-based rule.
     * </p>
     * 
     * @param metricName
     *        The name of the metrics for the rate-based rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalRateBasedRuleDetails withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the rate-based rule.
     * </p>
     * 
     * @param name
     *        The name of the rate-based rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rate-based rule.
     * </p>
     * 
     * @return The name of the rate-based rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rate-based rule.
     * </p>
     * 
     * @param name
     *        The name of the rate-based rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalRateBasedRuleDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The field that WAF uses to determine whether requests are likely arriving from single source and are subject to
     * rate monitoring.
     * </p>
     * 
     * @param rateKey
     *        The field that WAF uses to determine whether requests are likely arriving from single source and are
     *        subject to rate monitoring.
     */

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    /**
     * <p>
     * The field that WAF uses to determine whether requests are likely arriving from single source and are subject to
     * rate monitoring.
     * </p>
     * 
     * @return The field that WAF uses to determine whether requests are likely arriving from single source and are
     *         subject to rate monitoring.
     */

    public String getRateKey() {
        return this.rateKey;
    }

    /**
     * <p>
     * The field that WAF uses to determine whether requests are likely arriving from single source and are subject to
     * rate monitoring.
     * </p>
     * 
     * @param rateKey
     *        The field that WAF uses to determine whether requests are likely arriving from single source and are
     *        subject to rate monitoring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalRateBasedRuleDetails withRateKey(String rateKey) {
        setRateKey(rateKey);
        return this;
    }

    /**
     * <p>
     * The maximum number of requests that have an identical value for the field specified in <code>RateKey</code> that
     * are allowed within a five-minute period. If the number of requests exceeds <code>RateLimit</code> and the other
     * predicates specified in the rule are met, WAF triggers the action for the rule.
     * </p>
     * 
     * @param rateLimit
     *        The maximum number of requests that have an identical value for the field specified in
     *        <code>RateKey</code> that are allowed within a five-minute period. If the number of requests exceeds
     *        <code>RateLimit</code> and the other predicates specified in the rule are met, WAF triggers the action for
     *        the rule.
     */

    public void setRateLimit(Long rateLimit) {
        this.rateLimit = rateLimit;
    }

    /**
     * <p>
     * The maximum number of requests that have an identical value for the field specified in <code>RateKey</code> that
     * are allowed within a five-minute period. If the number of requests exceeds <code>RateLimit</code> and the other
     * predicates specified in the rule are met, WAF triggers the action for the rule.
     * </p>
     * 
     * @return The maximum number of requests that have an identical value for the field specified in
     *         <code>RateKey</code> that are allowed within a five-minute period. If the number of requests exceeds
     *         <code>RateLimit</code> and the other predicates specified in the rule are met, WAF triggers the action
     *         for the rule.
     */

    public Long getRateLimit() {
        return this.rateLimit;
    }

    /**
     * <p>
     * The maximum number of requests that have an identical value for the field specified in <code>RateKey</code> that
     * are allowed within a five-minute period. If the number of requests exceeds <code>RateLimit</code> and the other
     * predicates specified in the rule are met, WAF triggers the action for the rule.
     * </p>
     * 
     * @param rateLimit
     *        The maximum number of requests that have an identical value for the field specified in
     *        <code>RateKey</code> that are allowed within a five-minute period. If the number of requests exceeds
     *        <code>RateLimit</code> and the other predicates specified in the rule are met, WAF triggers the action for
     *        the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalRateBasedRuleDetails withRateLimit(Long rateLimit) {
        setRateLimit(rateLimit);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the rate-based rule.
     * </p>
     * 
     * @param ruleId
     *        The unique identifier for the rate-based rule.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The unique identifier for the rate-based rule.
     * </p>
     * 
     * @return The unique identifier for the rate-based rule.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The unique identifier for the rate-based rule.
     * </p>
     * 
     * @param ruleId
     *        The unique identifier for the rate-based rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalRateBasedRuleDetails withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The predicates to include in the rate-based rule.
     * </p>
     * 
     * @return The predicates to include in the rate-based rule.
     */

    public java.util.List<AwsWafRegionalRateBasedRuleMatchPredicate> getMatchPredicates() {
        return matchPredicates;
    }

    /**
     * <p>
     * The predicates to include in the rate-based rule.
     * </p>
     * 
     * @param matchPredicates
     *        The predicates to include in the rate-based rule.
     */

    public void setMatchPredicates(java.util.Collection<AwsWafRegionalRateBasedRuleMatchPredicate> matchPredicates) {
        if (matchPredicates == null) {
            this.matchPredicates = null;
            return;
        }

        this.matchPredicates = new java.util.ArrayList<AwsWafRegionalRateBasedRuleMatchPredicate>(matchPredicates);
    }

    /**
     * <p>
     * The predicates to include in the rate-based rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchPredicates(java.util.Collection)} or {@link #withMatchPredicates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param matchPredicates
     *        The predicates to include in the rate-based rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalRateBasedRuleDetails withMatchPredicates(AwsWafRegionalRateBasedRuleMatchPredicate... matchPredicates) {
        if (this.matchPredicates == null) {
            setMatchPredicates(new java.util.ArrayList<AwsWafRegionalRateBasedRuleMatchPredicate>(matchPredicates.length));
        }
        for (AwsWafRegionalRateBasedRuleMatchPredicate ele : matchPredicates) {
            this.matchPredicates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The predicates to include in the rate-based rule.
     * </p>
     * 
     * @param matchPredicates
     *        The predicates to include in the rate-based rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalRateBasedRuleDetails withMatchPredicates(java.util.Collection<AwsWafRegionalRateBasedRuleMatchPredicate> matchPredicates) {
        setMatchPredicates(matchPredicates);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRateKey() != null)
            sb.append("RateKey: ").append(getRateKey()).append(",");
        if (getRateLimit() != null)
            sb.append("RateLimit: ").append(getRateLimit()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getMatchPredicates() != null)
            sb.append("MatchPredicates: ").append(getMatchPredicates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafRegionalRateBasedRuleDetails == false)
            return false;
        AwsWafRegionalRateBasedRuleDetails other = (AwsWafRegionalRateBasedRuleDetails) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRateKey() == null ^ this.getRateKey() == null)
            return false;
        if (other.getRateKey() != null && other.getRateKey().equals(this.getRateKey()) == false)
            return false;
        if (other.getRateLimit() == null ^ this.getRateLimit() == null)
            return false;
        if (other.getRateLimit() != null && other.getRateLimit().equals(this.getRateLimit()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getMatchPredicates() == null ^ this.getMatchPredicates() == null)
            return false;
        if (other.getMatchPredicates() != null && other.getMatchPredicates().equals(this.getMatchPredicates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRateKey() == null) ? 0 : getRateKey().hashCode());
        hashCode = prime * hashCode + ((getRateLimit() == null) ? 0 : getRateLimit().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getMatchPredicates() == null) ? 0 : getMatchPredicates().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafRegionalRateBasedRuleDetails clone() {
        try {
            return (AwsWafRegionalRateBasedRuleDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafRegionalRateBasedRuleDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
