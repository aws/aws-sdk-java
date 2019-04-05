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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRateBasedRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRateBasedRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>RuleId</code> of the <code>RateBasedRule</code> that you want to update. <code>RuleId</code> is
     * returned by <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;
    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>RateBasedRule</a>.
     * </p>
     */
    private java.util.List<RuleUpdate> updates;
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
     * The <code>RuleId</code> of the <code>RateBasedRule</code> that you want to update. <code>RuleId</code> is
     * returned by <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     * </p>
     * 
     * @param ruleId
     *        The <code>RuleId</code> of the <code>RateBasedRule</code> that you want to update. <code>RuleId</code> is
     *        returned by <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <code>RateBasedRule</code> that you want to update. <code>RuleId</code> is
     * returned by <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     * </p>
     * 
     * @return The <code>RuleId</code> of the <code>RateBasedRule</code> that you want to update. <code>RuleId</code> is
     *         returned by <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <code>RateBasedRule</code> that you want to update. <code>RuleId</code> is
     * returned by <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     * </p>
     * 
     * @param ruleId
     *        The <code>RuleId</code> of the <code>RateBasedRule</code> that you want to update. <code>RuleId</code> is
     *        returned by <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRateBasedRuleRequest withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @return The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRateBasedRuleRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>RateBasedRule</a>.
     * </p>
     * 
     * @return An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a
     *         <a>RateBasedRule</a>.
     */

    public java.util.List<RuleUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>RateBasedRule</a>.
     * </p>
     * 
     * @param updates
     *        An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a
     *        <a>RateBasedRule</a>.
     */

    public void setUpdates(java.util.Collection<RuleUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<RuleUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>RateBasedRule</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdates(java.util.Collection)} or {@link #withUpdates(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param updates
     *        An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a
     *        <a>RateBasedRule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRateBasedRuleRequest withUpdates(RuleUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<RuleUpdate>(updates.length));
        }
        for (RuleUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a <a>RateBasedRule</a>.
     * </p>
     * 
     * @param updates
     *        An array of <code>RuleUpdate</code> objects that you want to insert into or delete from a
     *        <a>RateBasedRule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRateBasedRuleRequest withUpdates(java.util.Collection<RuleUpdate> updates) {
        setUpdates(updates);
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

    public UpdateRateBasedRuleRequest withRateLimit(Long rateLimit) {
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
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken()).append(",");
        if (getUpdates() != null)
            sb.append("Updates: ").append(getUpdates()).append(",");
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

        if (obj instanceof UpdateRateBasedRuleRequest == false)
            return false;
        UpdateRateBasedRuleRequest other = (UpdateRateBasedRuleRequest) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
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
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode + ((getRateLimit() == null) ? 0 : getRateLimit().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRateBasedRuleRequest clone() {
        return (UpdateRateBasedRuleRequest) super.clone();
    }

}
