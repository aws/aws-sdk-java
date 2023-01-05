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
 * Provides information about the rules attached to the rule group. These rules identify the web requests that you want
 * to allow, block, or count.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafRuleGroupRulesDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafRuleGroupRulesDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides information about what action WAF should take on a web request when it matches the criteria defined in
     * the rule.
     * </p>
     */
    private AwsWafRuleGroupRulesActionDetails action;
    /**
     * <p>
     * If you define more than one rule in a web ACL, WAF evaluates each request against the rules in order based on the
     * value of <code>Priority</code>.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The rule ID for a rule.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The type of rule.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Provides information about what action WAF should take on a web request when it matches the criteria defined in
     * the rule.
     * </p>
     * 
     * @param action
     *        Provides information about what action WAF should take on a web request when it matches the criteria
     *        defined in the rule.
     */

    public void setAction(AwsWafRuleGroupRulesActionDetails action) {
        this.action = action;
    }

    /**
     * <p>
     * Provides information about what action WAF should take on a web request when it matches the criteria defined in
     * the rule.
     * </p>
     * 
     * @return Provides information about what action WAF should take on a web request when it matches the criteria
     *         defined in the rule.
     */

    public AwsWafRuleGroupRulesActionDetails getAction() {
        return this.action;
    }

    /**
     * <p>
     * Provides information about what action WAF should take on a web request when it matches the criteria defined in
     * the rule.
     * </p>
     * 
     * @param action
     *        Provides information about what action WAF should take on a web request when it matches the criteria
     *        defined in the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleGroupRulesDetails withAction(AwsWafRuleGroupRulesActionDetails action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * If you define more than one rule in a web ACL, WAF evaluates each request against the rules in order based on the
     * value of <code>Priority</code>.
     * </p>
     * 
     * @param priority
     *        If you define more than one rule in a web ACL, WAF evaluates each request against the rules in order based
     *        on the value of <code>Priority</code>.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * If you define more than one rule in a web ACL, WAF evaluates each request against the rules in order based on the
     * value of <code>Priority</code>.
     * </p>
     * 
     * @return If you define more than one rule in a web ACL, WAF evaluates each request against the rules in order
     *         based on the value of <code>Priority</code>.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * If you define more than one rule in a web ACL, WAF evaluates each request against the rules in order based on the
     * value of <code>Priority</code>.
     * </p>
     * 
     * @param priority
     *        If you define more than one rule in a web ACL, WAF evaluates each request against the rules in order based
     *        on the value of <code>Priority</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleGroupRulesDetails withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The rule ID for a rule.
     * </p>
     * 
     * @param ruleId
     *        The rule ID for a rule.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The rule ID for a rule.
     * </p>
     * 
     * @return The rule ID for a rule.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The rule ID for a rule.
     * </p>
     * 
     * @param ruleId
     *        The rule ID for a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleGroupRulesDetails withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The type of rule.
     * </p>
     * 
     * @param type
     *        The type of rule.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of rule.
     * </p>
     * 
     * @return The type of rule.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of rule.
     * </p>
     * 
     * @param type
     *        The type of rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRuleGroupRulesDetails withType(String type) {
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

        if (obj instanceof AwsWafRuleGroupRulesDetails == false)
            return false;
        AwsWafRuleGroupRulesDetails other = (AwsWafRuleGroupRulesDetails) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
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
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafRuleGroupRulesDetails clone() {
        try {
            return (AwsWafRuleGroupRulesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafRuleGroupRulesDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
