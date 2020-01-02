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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeManagedRuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeManagedRuleGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU) to
     * calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF
     * calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is
     * fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     * </p>
     */
    private Long capacity;
    /** <p/> */
    private java.util.List<RuleSummary> rules;

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU) to
     * calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF
     * calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is
     * fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU)
     *        to calculate and control the operating resources that are used to run your rules, rule groups, and web
     *        ACLs. AWS WAF calculates capacity differently for each rule type, to reflect each rule's relative cost.
     *        Rule group capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule
     *        group. The WCU limit for web ACLs is 1,500.
     */

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU) to
     * calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF
     * calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is
     * fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     * </p>
     * 
     * @return The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU)
     *         to calculate and control the operating resources that are used to run your rules, rule groups, and web
     *         ACLs. AWS WAF calculates capacity differently for each rule type, to reflect each rule's relative cost.
     *         Rule group capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule
     *         group. The WCU limit for web ACLs is 1,500.
     */

    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU) to
     * calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF
     * calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is
     * fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) required for this rule group. AWS WAF uses web ACL capacity units (WCU)
     *        to calculate and control the operating resources that are used to run your rules, rule groups, and web
     *        ACLs. AWS WAF calculates capacity differently for each rule type, to reflect each rule's relative cost.
     *        Rule group capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule
     *        group. The WCU limit for web ACLs is 1,500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withCapacity(Long capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<RuleSummary> getRules() {
        return rules;
    }

    /**
     * <p/>
     * 
     * @param rules
     */

    public void setRules(java.util.Collection<RuleSummary> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<RuleSummary>(rules);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withRules(RuleSummary... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<RuleSummary>(rules.length));
        }
        for (RuleSummary ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param rules
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withRules(java.util.Collection<RuleSummary> rules) {
        setRules(rules);
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
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeManagedRuleGroupResult == false)
            return false;
        DescribeManagedRuleGroupResult other = (DescribeManagedRuleGroupResult) obj;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public DescribeManagedRuleGroupResult clone() {
        try {
            return (DescribeManagedRuleGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
