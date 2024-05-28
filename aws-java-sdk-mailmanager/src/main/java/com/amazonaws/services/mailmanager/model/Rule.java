/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule contains conditions, "unless conditions" and actions. For each envelope recipient of an email, if all
 * conditions match and none of the "unless conditions" match, then all of the actions are executed sequentially. If no
 * conditions are provided, the rule always applies and the actions are implicitly executed. If only "unless conditions"
 * are provided, the rule applies if the email does not match the evaluation of the "unless conditions".
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/Rule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of actions to execute when the conditions match the incoming email, and none of the "unless conditions"
     * match.
     * </p>
     */
    private java.util.List<RuleAction> actions;
    /**
     * <p>
     * The conditions of this rule. All conditions must match the email for the actions to be executed. An empty list of
     * conditions means that all emails match, but are still subject to any "unless conditions"
     * </p>
     */
    private java.util.List<RuleCondition> conditions;
    /**
     * <p>
     * The user-friendly name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The "unless conditions" of this rule. None of the conditions can match the email for the actions to be executed.
     * If any of these conditions do match the email, then the actions are not executed.
     * </p>
     */
    private java.util.List<RuleCondition> unless;

    /**
     * <p>
     * The list of actions to execute when the conditions match the incoming email, and none of the "unless conditions"
     * match.
     * </p>
     * 
     * @return The list of actions to execute when the conditions match the incoming email, and none of the
     *         "unless conditions" match.
     */

    public java.util.List<RuleAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * The list of actions to execute when the conditions match the incoming email, and none of the "unless conditions"
     * match.
     * </p>
     * 
     * @param actions
     *        The list of actions to execute when the conditions match the incoming email, and none of the
     *        "unless conditions" match.
     */

    public void setActions(java.util.Collection<RuleAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<RuleAction>(actions);
    }

    /**
     * <p>
     * The list of actions to execute when the conditions match the incoming email, and none of the "unless conditions"
     * match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The list of actions to execute when the conditions match the incoming email, and none of the
     *        "unless conditions" match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withActions(RuleAction... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<RuleAction>(actions.length));
        }
        for (RuleAction ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when the conditions match the incoming email, and none of the "unless conditions"
     * match.
     * </p>
     * 
     * @param actions
     *        The list of actions to execute when the conditions match the incoming email, and none of the
     *        "unless conditions" match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withActions(java.util.Collection<RuleAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The conditions of this rule. All conditions must match the email for the actions to be executed. An empty list of
     * conditions means that all emails match, but are still subject to any "unless conditions"
     * </p>
     * 
     * @return The conditions of this rule. All conditions must match the email for the actions to be executed. An empty
     *         list of conditions means that all emails match, but are still subject to any "unless conditions"
     */

    public java.util.List<RuleCondition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * The conditions of this rule. All conditions must match the email for the actions to be executed. An empty list of
     * conditions means that all emails match, but are still subject to any "unless conditions"
     * </p>
     * 
     * @param conditions
     *        The conditions of this rule. All conditions must match the email for the actions to be executed. An empty
     *        list of conditions means that all emails match, but are still subject to any "unless conditions"
     */

    public void setConditions(java.util.Collection<RuleCondition> conditions) {
        if (conditions == null) {
            this.conditions = null;
            return;
        }

        this.conditions = new java.util.ArrayList<RuleCondition>(conditions);
    }

    /**
     * <p>
     * The conditions of this rule. All conditions must match the email for the actions to be executed. An empty list of
     * conditions means that all emails match, but are still subject to any "unless conditions"
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditions(java.util.Collection)} or {@link #withConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditions
     *        The conditions of this rule. All conditions must match the email for the actions to be executed. An empty
     *        list of conditions means that all emails match, but are still subject to any "unless conditions"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withConditions(RuleCondition... conditions) {
        if (this.conditions == null) {
            setConditions(new java.util.ArrayList<RuleCondition>(conditions.length));
        }
        for (RuleCondition ele : conditions) {
            this.conditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The conditions of this rule. All conditions must match the email for the actions to be executed. An empty list of
     * conditions means that all emails match, but are still subject to any "unless conditions"
     * </p>
     * 
     * @param conditions
     *        The conditions of this rule. All conditions must match the email for the actions to be executed. An empty
     *        list of conditions means that all emails match, but are still subject to any "unless conditions"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withConditions(java.util.Collection<RuleCondition> conditions) {
        setConditions(conditions);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the rule.
     * </p>
     * 
     * @param name
     *        The user-friendly name of the rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user-friendly name of the rule.
     * </p>
     * 
     * @return The user-friendly name of the rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The user-friendly name of the rule.
     * </p>
     * 
     * @param name
     *        The user-friendly name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The "unless conditions" of this rule. None of the conditions can match the email for the actions to be executed.
     * If any of these conditions do match the email, then the actions are not executed.
     * </p>
     * 
     * @return The "unless conditions" of this rule. None of the conditions can match the email for the actions to be
     *         executed. If any of these conditions do match the email, then the actions are not executed.
     */

    public java.util.List<RuleCondition> getUnless() {
        return unless;
    }

    /**
     * <p>
     * The "unless conditions" of this rule. None of the conditions can match the email for the actions to be executed.
     * If any of these conditions do match the email, then the actions are not executed.
     * </p>
     * 
     * @param unless
     *        The "unless conditions" of this rule. None of the conditions can match the email for the actions to be
     *        executed. If any of these conditions do match the email, then the actions are not executed.
     */

    public void setUnless(java.util.Collection<RuleCondition> unless) {
        if (unless == null) {
            this.unless = null;
            return;
        }

        this.unless = new java.util.ArrayList<RuleCondition>(unless);
    }

    /**
     * <p>
     * The "unless conditions" of this rule. None of the conditions can match the email for the actions to be executed.
     * If any of these conditions do match the email, then the actions are not executed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnless(java.util.Collection)} or {@link #withUnless(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param unless
     *        The "unless conditions" of this rule. None of the conditions can match the email for the actions to be
     *        executed. If any of these conditions do match the email, then the actions are not executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withUnless(RuleCondition... unless) {
        if (this.unless == null) {
            setUnless(new java.util.ArrayList<RuleCondition>(unless.length));
        }
        for (RuleCondition ele : unless) {
            this.unless.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The "unless conditions" of this rule. None of the conditions can match the email for the actions to be executed.
     * If any of these conditions do match the email, then the actions are not executed.
     * </p>
     * 
     * @param unless
     *        The "unless conditions" of this rule. None of the conditions can match the email for the actions to be
     *        executed. If any of these conditions do match the email, then the actions are not executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withUnless(java.util.Collection<RuleCondition> unless) {
        setUnless(unless);
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
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getConditions() != null)
            sb.append("Conditions: ").append(getConditions()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUnless() != null)
            sb.append("Unless: ").append(getUnless());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUnless() == null ^ this.getUnless() == null)
            return false;
        if (other.getUnless() != null && other.getUnless().equals(this.getUnless()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUnless() == null) ? 0 : getUnless().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
