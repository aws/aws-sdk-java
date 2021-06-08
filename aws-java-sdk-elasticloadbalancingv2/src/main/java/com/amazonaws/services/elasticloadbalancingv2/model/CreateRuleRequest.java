/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The conditions.
     * </p>
     */
    private java.util.List<RuleCondition> conditions;
    /**
     * <p>
     * The rule priority. A listener can't have multiple rules with the same priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The actions.
     * </p>
     */
    private java.util.List<Action> actions;
    /**
     * <p>
     * The tags to assign to the rule.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     */

    public void setListenerArn(String listenerArn) {
        this.listenerArn = listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener.
     */

    public String getListenerArn() {
        return this.listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withListenerArn(String listenerArn) {
        setListenerArn(listenerArn);
        return this;
    }

    /**
     * <p>
     * The conditions.
     * </p>
     * 
     * @return The conditions.
     */

    public java.util.List<RuleCondition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * The conditions.
     * </p>
     * 
     * @param conditions
     *        The conditions.
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
     * The conditions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditions(java.util.Collection)} or {@link #withConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditions
     *        The conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withConditions(RuleCondition... conditions) {
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
     * The conditions.
     * </p>
     * 
     * @param conditions
     *        The conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withConditions(java.util.Collection<RuleCondition> conditions) {
        setConditions(conditions);
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

    public CreateRuleRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The actions.
     * </p>
     * 
     * @return The actions.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions.
     * </p>
     * 
     * @param actions
     *        The actions.
     */

    public void setActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<Action>(actions);
    }

    /**
     * <p>
     * The actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withActions(Action... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<Action>(actions.length));
        }
        for (Action ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions.
     * </p>
     * 
     * @param actions
     *        The actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the rule.
     * </p>
     * 
     * @return The tags to assign to the rule.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the rule.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the rule.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to assign to the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to assign to the rule.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getListenerArn() != null)
            sb.append("ListenerArn: ").append(getListenerArn()).append(",");
        if (getConditions() != null)
            sb.append("Conditions: ").append(getConditions()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRuleRequest == false)
            return false;
        CreateRuleRequest other = (CreateRuleRequest) obj;
        if (other.getListenerArn() == null ^ this.getListenerArn() == null)
            return false;
        if (other.getListenerArn() != null && other.getListenerArn().equals(this.getListenerArn()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerArn() == null) ? 0 : getListenerArn().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRuleRequest clone() {
        return (CreateRuleRequest) super.clone();
    }

}
