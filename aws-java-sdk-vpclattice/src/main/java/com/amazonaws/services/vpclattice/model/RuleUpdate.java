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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a rule update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/RuleUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rule action.
     * </p>
     */
    private RuleAction action;
    /**
     * <p>
     * The rule match.
     * </p>
     */
    private RuleMatch match;
    /**
     * <p>
     * The rule priority. A listener can't have multiple rules with the same priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the rule.
     * </p>
     */
    private String ruleIdentifier;

    /**
     * <p>
     * The rule action.
     * </p>
     * 
     * @param action
     *        The rule action.
     */

    public void setAction(RuleAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The rule action.
     * </p>
     * 
     * @return The rule action.
     */

    public RuleAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The rule action.
     * </p>
     * 
     * @param action
     *        The rule action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdate withAction(RuleAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The rule match.
     * </p>
     * 
     * @param match
     *        The rule match.
     */

    public void setMatch(RuleMatch match) {
        this.match = match;
    }

    /**
     * <p>
     * The rule match.
     * </p>
     * 
     * @return The rule match.
     */

    public RuleMatch getMatch() {
        return this.match;
    }

    /**
     * <p>
     * The rule match.
     * </p>
     * 
     * @param match
     *        The rule match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdate withMatch(RuleMatch match) {
        setMatch(match);
        return this;
    }

    /**
     * <p>
     * The rule priority. A listener can't have multiple rules with the same priority.
     * </p>
     * 
     * @param priority
     *        The rule priority. A listener can't have multiple rules with the same priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The rule priority. A listener can't have multiple rules with the same priority.
     * </p>
     * 
     * @return The rule priority. A listener can't have multiple rules with the same priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The rule priority. A listener can't have multiple rules with the same priority.
     * </p>
     * 
     * @param priority
     *        The rule priority. A listener can't have multiple rules with the same priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdate withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param ruleIdentifier
     *        The ID or Amazon Resource Name (ARN) of the rule.
     */

    public void setRuleIdentifier(String ruleIdentifier) {
        this.ruleIdentifier = ruleIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the rule.
     */

    public String getRuleIdentifier() {
        return this.ruleIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param ruleIdentifier
     *        The ID or Amazon Resource Name (ARN) of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdate withRuleIdentifier(String ruleIdentifier) {
        setRuleIdentifier(ruleIdentifier);
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
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getRuleIdentifier() != null)
            sb.append("RuleIdentifier: ").append(getRuleIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleUpdate == false)
            return false;
        RuleUpdate other = (RuleUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getRuleIdentifier() == null ^ this.getRuleIdentifier() == null)
            return false;
        if (other.getRuleIdentifier() != null && other.getRuleIdentifier().equals(this.getRuleIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRuleIdentifier() == null) ? 0 : getRuleIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public RuleUpdate clone() {
        try {
            return (RuleUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.RuleUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
