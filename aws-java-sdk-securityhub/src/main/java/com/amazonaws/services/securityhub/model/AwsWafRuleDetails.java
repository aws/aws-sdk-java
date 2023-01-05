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
 * Provides information about a WAF rule. This rule specifies the web requests that you want to allow, block, or count.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafRuleDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafRuleDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metrics for this rule.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * A descriptive name for the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     * <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and
     * <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates whether you
     * want to negate the settings.
     * </p>
     */
    private java.util.List<AwsWafRulePredicateListDetails> predicateList;
    /**
     * <p>
     * The ID of the WAF rule.
     * </p>
     */
    private String ruleId;

    /**
     * <p>
     * The name of the metrics for this rule.
     * </p>
     * 
     * @param metricName
     *        The name of the metrics for this rule.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metrics for this rule.
     * </p>
     * 
     * @return The name of the metrics for this rule.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metrics for this rule.
     * </p>
     * 
     * @param metricName
     *        The name of the metrics for this rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleDetails withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * A descriptive name for the rule.
     * </p>
     * 
     * @param name
     *        A descriptive name for the rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive name for the rule.
     * </p>
     * 
     * @return A descriptive name for the rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive name for the rule.
     * </p>
     * 
     * @param name
     *        A descriptive name for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     * <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and
     * <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates whether you
     * want to negate the settings.
     * </p>
     * 
     * @return Specifies the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     *         <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and
     *         <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates
     *         whether you want to negate the settings.
     */

    public java.util.List<AwsWafRulePredicateListDetails> getPredicateList() {
        return predicateList;
    }

    /**
     * <p>
     * Specifies the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     * <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and
     * <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates whether you
     * want to negate the settings.
     * </p>
     * 
     * @param predicateList
     *        Specifies the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     *        <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and
     *        <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates
     *        whether you want to negate the settings.
     */

    public void setPredicateList(java.util.Collection<AwsWafRulePredicateListDetails> predicateList) {
        if (predicateList == null) {
            this.predicateList = null;
            return;
        }

        this.predicateList = new java.util.ArrayList<AwsWafRulePredicateListDetails>(predicateList);
    }

    /**
     * <p>
     * Specifies the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     * <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and
     * <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates whether you
     * want to negate the settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredicateList(java.util.Collection)} or {@link #withPredicateList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param predicateList
     *        Specifies the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     *        <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and
     *        <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates
     *        whether you want to negate the settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleDetails withPredicateList(AwsWafRulePredicateListDetails... predicateList) {
        if (this.predicateList == null) {
            setPredicateList(new java.util.ArrayList<AwsWafRulePredicateListDetails>(predicateList.length));
        }
        for (AwsWafRulePredicateListDetails ele : predicateList) {
            this.predicateList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     * <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and
     * <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates whether you
     * want to negate the settings.
     * </p>
     * 
     * @param predicateList
     *        Specifies the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     *        <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and
     *        <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates
     *        whether you want to negate the settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleDetails withPredicateList(java.util.Collection<AwsWafRulePredicateListDetails> predicateList) {
        setPredicateList(predicateList);
        return this;
    }

    /**
     * <p>
     * The ID of the WAF rule.
     * </p>
     * 
     * @param ruleId
     *        The ID of the WAF rule.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The ID of the WAF rule.
     * </p>
     * 
     * @return The ID of the WAF rule.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The ID of the WAF rule.
     * </p>
     * 
     * @param ruleId
     *        The ID of the WAF rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleDetails withRuleId(String ruleId) {
        setRuleId(ruleId);
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
        if (getPredicateList() != null)
            sb.append("PredicateList: ").append(getPredicateList()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafRuleDetails == false)
            return false;
        AwsWafRuleDetails other = (AwsWafRuleDetails) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPredicateList() == null ^ this.getPredicateList() == null)
            return false;
        if (other.getPredicateList() != null && other.getPredicateList().equals(this.getPredicateList()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPredicateList() == null) ? 0 : getPredicateList().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafRuleDetails clone() {
        try {
            return (AwsWafRuleDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafRuleDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
