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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for a rule in a WAF WebACL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafWebAclRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafWebAclRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the Rule.
     * </p>
     */
    private WafAction action;
    /**
     * <p>
     * Rules to exclude from a rule group.
     * </p>
     */
    private java.util.List<WafExcludedRule> excludedRules;
    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your RuleGroup.
     * </p>
     * <p>
     * Any rule in a RuleGroup can potentially block a request. If you set the <code>OverrideAction</code> to
     * <code>None</code>, the RuleGroup blocks a request if any individual rule in the RuleGroup matches the request and
     * is configured to block that request.
     * </p>
     * <p>
     * However, if you first want to test the RuleGroup, set the <code>OverrideAction</code> to <code>Count</code>. The
     * RuleGroup then overrides any block action specified by individual rules contained within the group. Instead of
     * blocking matching requests, those requests are counted.
     * </p>
     * <p>
     * <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when updating or adding a RuleGroup to a
     * WebACL. In this case you do not use <code>ActivatedRule</code>|<code>Action</code>. For all other update
     * requests, <code>ActivatedRule</code>|<code>Action</code> is used instead of <code>ActivatedRule</code>|
     * <code>OverrideAction</code>.
     * </p>
     */
    private WafOverrideAction overrideAction;
    /**
     * <p>
     * Specifies the order in which the Rules in a WebACL are evaluated. Rules with a lower value for Priority are
     * evaluated before Rules with a higher value. The value must be a unique integer. If you add multiple Rules to a
     * WebACL, the values do not need to be consecutive.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The identifier for a Rule.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The rule type.
     * </p>
     * <p>
     * Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> | <code>GROUP</code>
     * </p>
     * <p>
     * The default is <code>REGULAR</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the Rule.
     * </p>
     * 
     * @param action
     *        Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the
     *        Rule.
     */

    public void setAction(WafAction action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the Rule.
     * </p>
     * 
     * @return Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the
     *         Rule.
     */

    public WafAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the Rule.
     * </p>
     * 
     * @param action
     *        Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the
     *        Rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclRule withAction(WafAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Rules to exclude from a rule group.
     * </p>
     * 
     * @return Rules to exclude from a rule group.
     */

    public java.util.List<WafExcludedRule> getExcludedRules() {
        return excludedRules;
    }

    /**
     * <p>
     * Rules to exclude from a rule group.
     * </p>
     * 
     * @param excludedRules
     *        Rules to exclude from a rule group.
     */

    public void setExcludedRules(java.util.Collection<WafExcludedRule> excludedRules) {
        if (excludedRules == null) {
            this.excludedRules = null;
            return;
        }

        this.excludedRules = new java.util.ArrayList<WafExcludedRule>(excludedRules);
    }

    /**
     * <p>
     * Rules to exclude from a rule group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedRules(java.util.Collection)} or {@link #withExcludedRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param excludedRules
     *        Rules to exclude from a rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclRule withExcludedRules(WafExcludedRule... excludedRules) {
        if (this.excludedRules == null) {
            setExcludedRules(new java.util.ArrayList<WafExcludedRule>(excludedRules.length));
        }
        for (WafExcludedRule ele : excludedRules) {
            this.excludedRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Rules to exclude from a rule group.
     * </p>
     * 
     * @param excludedRules
     *        Rules to exclude from a rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclRule withExcludedRules(java.util.Collection<WafExcludedRule> excludedRules) {
        setExcludedRules(excludedRules);
        return this;
    }

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your RuleGroup.
     * </p>
     * <p>
     * Any rule in a RuleGroup can potentially block a request. If you set the <code>OverrideAction</code> to
     * <code>None</code>, the RuleGroup blocks a request if any individual rule in the RuleGroup matches the request and
     * is configured to block that request.
     * </p>
     * <p>
     * However, if you first want to test the RuleGroup, set the <code>OverrideAction</code> to <code>Count</code>. The
     * RuleGroup then overrides any block action specified by individual rules contained within the group. Instead of
     * blocking matching requests, those requests are counted.
     * </p>
     * <p>
     * <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when updating or adding a RuleGroup to a
     * WebACL. In this case you do not use <code>ActivatedRule</code>|<code>Action</code>. For all other update
     * requests, <code>ActivatedRule</code>|<code>Action</code> is used instead of <code>ActivatedRule</code>|
     * <code>OverrideAction</code>.
     * </p>
     * 
     * @param overrideAction
     *        Use the <code>OverrideAction</code> to test your RuleGroup.</p>
     *        <p>
     *        Any rule in a RuleGroup can potentially block a request. If you set the <code>OverrideAction</code> to
     *        <code>None</code>, the RuleGroup blocks a request if any individual rule in the RuleGroup matches the
     *        request and is configured to block that request.
     *        </p>
     *        <p>
     *        However, if you first want to test the RuleGroup, set the <code>OverrideAction</code> to
     *        <code>Count</code>. The RuleGroup then overrides any block action specified by individual rules contained
     *        within the group. Instead of blocking matching requests, those requests are counted.
     *        </p>
     *        <p>
     *        <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when updating or adding a RuleGroup to
     *        a WebACL. In this case you do not use <code>ActivatedRule</code>|<code>Action</code>. For all other update
     *        requests, <code>ActivatedRule</code>|<code>Action</code> is used instead of <code>ActivatedRule</code>|
     *        <code>OverrideAction</code>.
     */

    public void setOverrideAction(WafOverrideAction overrideAction) {
        this.overrideAction = overrideAction;
    }

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your RuleGroup.
     * </p>
     * <p>
     * Any rule in a RuleGroup can potentially block a request. If you set the <code>OverrideAction</code> to
     * <code>None</code>, the RuleGroup blocks a request if any individual rule in the RuleGroup matches the request and
     * is configured to block that request.
     * </p>
     * <p>
     * However, if you first want to test the RuleGroup, set the <code>OverrideAction</code> to <code>Count</code>. The
     * RuleGroup then overrides any block action specified by individual rules contained within the group. Instead of
     * blocking matching requests, those requests are counted.
     * </p>
     * <p>
     * <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when updating or adding a RuleGroup to a
     * WebACL. In this case you do not use <code>ActivatedRule</code>|<code>Action</code>. For all other update
     * requests, <code>ActivatedRule</code>|<code>Action</code> is used instead of <code>ActivatedRule</code>|
     * <code>OverrideAction</code>.
     * </p>
     * 
     * @return Use the <code>OverrideAction</code> to test your RuleGroup.</p>
     *         <p>
     *         Any rule in a RuleGroup can potentially block a request. If you set the <code>OverrideAction</code> to
     *         <code>None</code>, the RuleGroup blocks a request if any individual rule in the RuleGroup matches the
     *         request and is configured to block that request.
     *         </p>
     *         <p>
     *         However, if you first want to test the RuleGroup, set the <code>OverrideAction</code> to
     *         <code>Count</code>. The RuleGroup then overrides any block action specified by individual rules contained
     *         within the group. Instead of blocking matching requests, those requests are counted.
     *         </p>
     *         <p>
     *         <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when updating or adding a RuleGroup
     *         to a WebACL. In this case you do not use <code>ActivatedRule</code>|<code>Action</code>. For all other
     *         update requests, <code>ActivatedRule</code>|<code>Action</code> is used instead of
     *         <code>ActivatedRule</code>|<code>OverrideAction</code>.
     */

    public WafOverrideAction getOverrideAction() {
        return this.overrideAction;
    }

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your RuleGroup.
     * </p>
     * <p>
     * Any rule in a RuleGroup can potentially block a request. If you set the <code>OverrideAction</code> to
     * <code>None</code>, the RuleGroup blocks a request if any individual rule in the RuleGroup matches the request and
     * is configured to block that request.
     * </p>
     * <p>
     * However, if you first want to test the RuleGroup, set the <code>OverrideAction</code> to <code>Count</code>. The
     * RuleGroup then overrides any block action specified by individual rules contained within the group. Instead of
     * blocking matching requests, those requests are counted.
     * </p>
     * <p>
     * <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when updating or adding a RuleGroup to a
     * WebACL. In this case you do not use <code>ActivatedRule</code>|<code>Action</code>. For all other update
     * requests, <code>ActivatedRule</code>|<code>Action</code> is used instead of <code>ActivatedRule</code>|
     * <code>OverrideAction</code>.
     * </p>
     * 
     * @param overrideAction
     *        Use the <code>OverrideAction</code> to test your RuleGroup.</p>
     *        <p>
     *        Any rule in a RuleGroup can potentially block a request. If you set the <code>OverrideAction</code> to
     *        <code>None</code>, the RuleGroup blocks a request if any individual rule in the RuleGroup matches the
     *        request and is configured to block that request.
     *        </p>
     *        <p>
     *        However, if you first want to test the RuleGroup, set the <code>OverrideAction</code> to
     *        <code>Count</code>. The RuleGroup then overrides any block action specified by individual rules contained
     *        within the group. Instead of blocking matching requests, those requests are counted.
     *        </p>
     *        <p>
     *        <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when updating or adding a RuleGroup to
     *        a WebACL. In this case you do not use <code>ActivatedRule</code>|<code>Action</code>. For all other update
     *        requests, <code>ActivatedRule</code>|<code>Action</code> is used instead of <code>ActivatedRule</code>|
     *        <code>OverrideAction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclRule withOverrideAction(WafOverrideAction overrideAction) {
        setOverrideAction(overrideAction);
        return this;
    }

    /**
     * <p>
     * Specifies the order in which the Rules in a WebACL are evaluated. Rules with a lower value for Priority are
     * evaluated before Rules with a higher value. The value must be a unique integer. If you add multiple Rules to a
     * WebACL, the values do not need to be consecutive.
     * </p>
     * 
     * @param priority
     *        Specifies the order in which the Rules in a WebACL are evaluated. Rules with a lower value for Priority
     *        are evaluated before Rules with a higher value. The value must be a unique integer. If you add multiple
     *        Rules to a WebACL, the values do not need to be consecutive.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Specifies the order in which the Rules in a WebACL are evaluated. Rules with a lower value for Priority are
     * evaluated before Rules with a higher value. The value must be a unique integer. If you add multiple Rules to a
     * WebACL, the values do not need to be consecutive.
     * </p>
     * 
     * @return Specifies the order in which the Rules in a WebACL are evaluated. Rules with a lower value for Priority
     *         are evaluated before Rules with a higher value. The value must be a unique integer. If you add multiple
     *         Rules to a WebACL, the values do not need to be consecutive.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Specifies the order in which the Rules in a WebACL are evaluated. Rules with a lower value for Priority are
     * evaluated before Rules with a higher value. The value must be a unique integer. If you add multiple Rules to a
     * WebACL, the values do not need to be consecutive.
     * </p>
     * 
     * @param priority
     *        Specifies the order in which the Rules in a WebACL are evaluated. Rules with a lower value for Priority
     *        are evaluated before Rules with a higher value. The value must be a unique integer. If you add multiple
     *        Rules to a WebACL, the values do not need to be consecutive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclRule withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The identifier for a Rule.
     * </p>
     * 
     * @param ruleId
     *        The identifier for a Rule.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The identifier for a Rule.
     * </p>
     * 
     * @return The identifier for a Rule.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The identifier for a Rule.
     * </p>
     * 
     * @param ruleId
     *        The identifier for a Rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclRule withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The rule type.
     * </p>
     * <p>
     * Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> | <code>GROUP</code>
     * </p>
     * <p>
     * The default is <code>REGULAR</code>.
     * </p>
     * 
     * @param type
     *        The rule type.</p>
     *        <p>
     *        Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> | <code>GROUP</code>
     *        </p>
     *        <p>
     *        The default is <code>REGULAR</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The rule type.
     * </p>
     * <p>
     * Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> | <code>GROUP</code>
     * </p>
     * <p>
     * The default is <code>REGULAR</code>.
     * </p>
     * 
     * @return The rule type.</p>
     *         <p>
     *         Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> | <code>GROUP</code>
     *         </p>
     *         <p>
     *         The default is <code>REGULAR</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The rule type.
     * </p>
     * <p>
     * Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> | <code>GROUP</code>
     * </p>
     * <p>
     * The default is <code>REGULAR</code>.
     * </p>
     * 
     * @param type
     *        The rule type.</p>
     *        <p>
     *        Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> | <code>GROUP</code>
     *        </p>
     *        <p>
     *        The default is <code>REGULAR</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafWebAclRule withType(String type) {
        setType(type);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getExcludedRules() != null)
            sb.append("ExcludedRules: ").append(getExcludedRules()).append(",");
        if (getOverrideAction() != null)
            sb.append("OverrideAction: ").append(getOverrideAction()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafWebAclRule == false)
            return false;
        AwsWafWebAclRule other = (AwsWafWebAclRule) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getExcludedRules() == null ^ this.getExcludedRules() == null)
            return false;
        if (other.getExcludedRules() != null && other.getExcludedRules().equals(this.getExcludedRules()) == false)
            return false;
        if (other.getOverrideAction() == null ^ this.getOverrideAction() == null)
            return false;
        if (other.getOverrideAction() != null && other.getOverrideAction().equals(this.getOverrideAction()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getExcludedRules() == null) ? 0 : getExcludedRules().hashCode());
        hashCode = prime * hashCode + ((getOverrideAction() == null) ? 0 : getOverrideAction().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafWebAclRule clone() {
        try {
            return (AwsWafWebAclRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafWebAclRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
