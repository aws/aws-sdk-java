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
 * A combination of <code>ByteMatchSet</code>, <code>IPSet</code>, and/or <code>SqlInjectionMatchSet</code> objects that
 * identify the web requests that you want to allow, block, or count.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafRegionalWebAclRulesListDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafRegionalWebAclRulesListDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action that WAF takes when a web request matches all conditions in the rule, such as allow, block, or count
     * the request.
     * </p>
     */
    private AwsWafRegionalWebAclRulesListActionDetails action;
    /**
     * <p>
     * Overrides the rule evaluation result in the rule group.
     * </p>
     */
    private AwsWafRegionalWebAclRulesListOverrideActionDetails overrideAction;
    /**
     * <p>
     * The order in which WAF evaluates the rules in a web ACL.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The ID of an WAF Regional rule to associate with a web ACL.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * For actions that are associated with a rule, the action that WAF takes when a web request matches all conditions
     * in a rule.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The action that WAF takes when a web request matches all conditions in the rule, such as allow, block, or count
     * the request.
     * </p>
     * 
     * @param action
     *        The action that WAF takes when a web request matches all conditions in the rule, such as allow, block, or
     *        count the request.
     */

    public void setAction(AwsWafRegionalWebAclRulesListActionDetails action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that WAF takes when a web request matches all conditions in the rule, such as allow, block, or count
     * the request.
     * </p>
     * 
     * @return The action that WAF takes when a web request matches all conditions in the rule, such as allow, block, or
     *         count the request.
     */

    public AwsWafRegionalWebAclRulesListActionDetails getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that WAF takes when a web request matches all conditions in the rule, such as allow, block, or count
     * the request.
     * </p>
     * 
     * @param action
     *        The action that WAF takes when a web request matches all conditions in the rule, such as allow, block, or
     *        count the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclRulesListDetails withAction(AwsWafRegionalWebAclRulesListActionDetails action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Overrides the rule evaluation result in the rule group.
     * </p>
     * 
     * @param overrideAction
     *        Overrides the rule evaluation result in the rule group.
     */

    public void setOverrideAction(AwsWafRegionalWebAclRulesListOverrideActionDetails overrideAction) {
        this.overrideAction = overrideAction;
    }

    /**
     * <p>
     * Overrides the rule evaluation result in the rule group.
     * </p>
     * 
     * @return Overrides the rule evaluation result in the rule group.
     */

    public AwsWafRegionalWebAclRulesListOverrideActionDetails getOverrideAction() {
        return this.overrideAction;
    }

    /**
     * <p>
     * Overrides the rule evaluation result in the rule group.
     * </p>
     * 
     * @param overrideAction
     *        Overrides the rule evaluation result in the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclRulesListDetails withOverrideAction(AwsWafRegionalWebAclRulesListOverrideActionDetails overrideAction) {
        setOverrideAction(overrideAction);
        return this;
    }

    /**
     * <p>
     * The order in which WAF evaluates the rules in a web ACL.
     * </p>
     * 
     * @param priority
     *        The order in which WAF evaluates the rules in a web ACL.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The order in which WAF evaluates the rules in a web ACL.
     * </p>
     * 
     * @return The order in which WAF evaluates the rules in a web ACL.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The order in which WAF evaluates the rules in a web ACL.
     * </p>
     * 
     * @param priority
     *        The order in which WAF evaluates the rules in a web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclRulesListDetails withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The ID of an WAF Regional rule to associate with a web ACL.
     * </p>
     * 
     * @param ruleId
     *        The ID of an WAF Regional rule to associate with a web ACL.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The ID of an WAF Regional rule to associate with a web ACL.
     * </p>
     * 
     * @return The ID of an WAF Regional rule to associate with a web ACL.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The ID of an WAF Regional rule to associate with a web ACL.
     * </p>
     * 
     * @param ruleId
     *        The ID of an WAF Regional rule to associate with a web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclRulesListDetails withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * For actions that are associated with a rule, the action that WAF takes when a web request matches all conditions
     * in a rule.
     * </p>
     * 
     * @param type
     *        For actions that are associated with a rule, the action that WAF takes when a web request matches all
     *        conditions in a rule.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * For actions that are associated with a rule, the action that WAF takes when a web request matches all conditions
     * in a rule.
     * </p>
     * 
     * @return For actions that are associated with a rule, the action that WAF takes when a web request matches all
     *         conditions in a rule.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * For actions that are associated with a rule, the action that WAF takes when a web request matches all conditions
     * in a rule.
     * </p>
     * 
     * @param type
     *        For actions that are associated with a rule, the action that WAF takes when a web request matches all
     *        conditions in a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalWebAclRulesListDetails withType(String type) {
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

        if (obj instanceof AwsWafRegionalWebAclRulesListDetails == false)
            return false;
        AwsWafRegionalWebAclRulesListDetails other = (AwsWafRegionalWebAclRulesListDetails) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
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
        hashCode = prime * hashCode + ((getOverrideAction() == null) ? 0 : getOverrideAction().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafRegionalWebAclRulesListDetails clone() {
        try {
            return (AwsWafRegionalWebAclRulesListDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafRegionalWebAclRulesListDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
