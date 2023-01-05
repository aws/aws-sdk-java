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
 * Provides information about an WAF rule group. A rule group is a collection of rules for inspecting and controlling
 * web requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafRuleGroupDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafRuleGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metrics for this rule group.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The name of the rule group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the rule group.
     * </p>
     */
    private String ruleGroupId;
    /**
     * <p>
     * Provides information about the rules attached to the rule group. These rules identify the web requests that you
     * want to allow, block, or count.
     * </p>
     */
    private java.util.List<AwsWafRuleGroupRulesDetails> rules;

    /**
     * <p>
     * The name of the metrics for this rule group.
     * </p>
     * 
     * @param metricName
     *        The name of the metrics for this rule group.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metrics for this rule group.
     * </p>
     * 
     * @return The name of the metrics for this rule group.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metrics for this rule group.
     * </p>
     * 
     * @param metricName
     *        The name of the metrics for this rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleGroupDetails withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the rule group.
     * </p>
     * 
     * @param name
     *        The name of the rule group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule group.
     * </p>
     * 
     * @return The name of the rule group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule group.
     * </p>
     * 
     * @param name
     *        The name of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleGroupDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the rule group.
     * </p>
     * 
     * @param ruleGroupId
     *        The ID of the rule group.
     */

    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * <p>
     * The ID of the rule group.
     * </p>
     * 
     * @return The ID of the rule group.
     */

    public String getRuleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * <p>
     * The ID of the rule group.
     * </p>
     * 
     * @param ruleGroupId
     *        The ID of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleGroupDetails withRuleGroupId(String ruleGroupId) {
        setRuleGroupId(ruleGroupId);
        return this;
    }

    /**
     * <p>
     * Provides information about the rules attached to the rule group. These rules identify the web requests that you
     * want to allow, block, or count.
     * </p>
     * 
     * @return Provides information about the rules attached to the rule group. These rules identify the web requests
     *         that you want to allow, block, or count.
     */

    public java.util.List<AwsWafRuleGroupRulesDetails> getRules() {
        return rules;
    }

    /**
     * <p>
     * Provides information about the rules attached to the rule group. These rules identify the web requests that you
     * want to allow, block, or count.
     * </p>
     * 
     * @param rules
     *        Provides information about the rules attached to the rule group. These rules identify the web requests
     *        that you want to allow, block, or count.
     */

    public void setRules(java.util.Collection<AwsWafRuleGroupRulesDetails> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<AwsWafRuleGroupRulesDetails>(rules);
    }

    /**
     * <p>
     * Provides information about the rules attached to the rule group. These rules identify the web requests that you
     * want to allow, block, or count.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        Provides information about the rules attached to the rule group. These rules identify the web requests
     *        that you want to allow, block, or count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleGroupDetails withRules(AwsWafRuleGroupRulesDetails... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<AwsWafRuleGroupRulesDetails>(rules.length));
        }
        for (AwsWafRuleGroupRulesDetails ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information about the rules attached to the rule group. These rules identify the web requests that you
     * want to allow, block, or count.
     * </p>
     * 
     * @param rules
     *        Provides information about the rules attached to the rule group. These rules identify the web requests
     *        that you want to allow, block, or count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleGroupDetails withRules(java.util.Collection<AwsWafRuleGroupRulesDetails> rules) {
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRuleGroupId() != null)
            sb.append("RuleGroupId: ").append(getRuleGroupId()).append(",");
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

        if (obj instanceof AwsWafRuleGroupDetails == false)
            return false;
        AwsWafRuleGroupDetails other = (AwsWafRuleGroupDetails) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleGroupId() == null ^ this.getRuleGroupId() == null)
            return false;
        if (other.getRuleGroupId() != null && other.getRuleGroupId().equals(this.getRuleGroupId()) == false)
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

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupId() == null) ? 0 : getRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafRuleGroupDetails clone() {
        try {
            return (AwsWafRuleGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafRuleGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
