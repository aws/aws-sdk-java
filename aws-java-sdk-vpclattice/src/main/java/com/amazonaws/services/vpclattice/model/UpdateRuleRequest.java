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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the action for the specified listener rule.
     * </p>
     */
    private RuleAction action;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerIdentifier;
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
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String serviceIdentifier;

    /**
     * <p>
     * Information about the action for the specified listener rule.
     * </p>
     * 
     * @param action
     *        Information about the action for the specified listener rule.
     */

    public void setAction(RuleAction action) {
        this.action = action;
    }

    /**
     * <p>
     * Information about the action for the specified listener rule.
     * </p>
     * 
     * @return Information about the action for the specified listener rule.
     */

    public RuleAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * Information about the action for the specified listener rule.
     * </p>
     * 
     * @param action
     *        Information about the action for the specified listener rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withAction(RuleAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerIdentifier
     *        The ID or Amazon Resource Name (ARN) of the listener.
     */

    public void setListenerIdentifier(String listenerIdentifier) {
        this.listenerIdentifier = listenerIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the listener.
     */

    public String getListenerIdentifier() {
        return this.listenerIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerIdentifier
     *        The ID or Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withListenerIdentifier(String listenerIdentifier) {
        setListenerIdentifier(listenerIdentifier);
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

    public UpdateRuleRequest withMatch(RuleMatch match) {
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

    public UpdateRuleRequest withPriority(Integer priority) {
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

    public UpdateRuleRequest withRuleIdentifier(String ruleIdentifier) {
        setRuleIdentifier(ruleIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service.
     */

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the service.
     */

    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withServiceIdentifier(String serviceIdentifier) {
        setServiceIdentifier(serviceIdentifier);
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
        if (getListenerIdentifier() != null)
            sb.append("ListenerIdentifier: ").append(getListenerIdentifier()).append(",");
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getRuleIdentifier() != null)
            sb.append("RuleIdentifier: ").append(getRuleIdentifier()).append(",");
        if (getServiceIdentifier() != null)
            sb.append("ServiceIdentifier: ").append(getServiceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRuleRequest == false)
            return false;
        UpdateRuleRequest other = (UpdateRuleRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getListenerIdentifier() == null ^ this.getListenerIdentifier() == null)
            return false;
        if (other.getListenerIdentifier() != null && other.getListenerIdentifier().equals(this.getListenerIdentifier()) == false)
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
        if (other.getServiceIdentifier() == null ^ this.getServiceIdentifier() == null)
            return false;
        if (other.getServiceIdentifier() != null && other.getServiceIdentifier().equals(this.getServiceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getListenerIdentifier() == null) ? 0 : getListenerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRuleIdentifier() == null) ? 0 : getRuleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getServiceIdentifier() == null) ? 0 : getServiceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRuleRequest clone() {
        return (UpdateRuleRequest) super.clone();
    }

}
