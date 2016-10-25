/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for CreateRule.
 * </p>
 */
public class CreateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * A condition. Each condition has the field <code>path-pattern</code> and specifies one path pattern. A path
     * pattern is case sensitive, can be up to 255 characters in length, and can contain any of the following
     * characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<RuleCondition> conditions;
    /**
     * <p>
     * The priority for the rule. A listener can't have multiple rules with the same priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * An action. Each action has the type <code>forward</code> and specifies a target group.
     * </p>
     */
    private java.util.List<Action> actions;

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
     * A condition. Each condition has the field <code>path-pattern</code> and specifies one path pattern. A path
     * pattern is case sensitive, can be up to 255 characters in length, and can contain any of the following
     * characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @return A condition. Each condition has the field <code>path-pattern</code> and specifies one path pattern. A
     *         path pattern is case sensitive, can be up to 255 characters in length, and can contain any of the
     *         following characters:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A-Z, a-z, 0-9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         _ - . $ / ~ " ' @ : +
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         &amp; (using &amp;amp;)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (matches 0 or more characters)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ? (matches exactly 1 character)
     *         </p>
     *         </li>
     */

    public java.util.List<RuleCondition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * A condition. Each condition has the field <code>path-pattern</code> and specifies one path pattern. A path
     * pattern is case sensitive, can be up to 255 characters in length, and can contain any of the following
     * characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @param conditions
     *        A condition. Each condition has the field <code>path-pattern</code> and specifies one path pattern. A path
     *        pattern is case sensitive, can be up to 255 characters in length, and can contain any of the following
     *        characters:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
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
     * A condition. Each condition has the field <code>path-pattern</code> and specifies one path pattern. A path
     * pattern is case sensitive, can be up to 255 characters in length, and can contain any of the following
     * characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditions(java.util.Collection)} or {@link #withConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditions
     *        A condition. Each condition has the field <code>path-pattern</code> and specifies one path pattern. A path
     *        pattern is case sensitive, can be up to 255 characters in length, and can contain any of the following
     *        characters:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
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
     * A condition. Each condition has the field <code>path-pattern</code> and specifies one path pattern. A path
     * pattern is case sensitive, can be up to 255 characters in length, and can contain any of the following
     * characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @param conditions
     *        A condition. Each condition has the field <code>path-pattern</code> and specifies one path pattern. A path
     *        pattern is case sensitive, can be up to 255 characters in length, and can contain any of the following
     *        characters:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withConditions(java.util.Collection<RuleCondition> conditions) {
        setConditions(conditions);
        return this;
    }

    /**
     * <p>
     * The priority for the rule. A listener can't have multiple rules with the same priority.
     * </p>
     * 
     * @param priority
     *        The priority for the rule. A listener can't have multiple rules with the same priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority for the rule. A listener can't have multiple rules with the same priority.
     * </p>
     * 
     * @return The priority for the rule. A listener can't have multiple rules with the same priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority for the rule. A listener can't have multiple rules with the same priority.
     * </p>
     * 
     * @param priority
     *        The priority for the rule. A listener can't have multiple rules with the same priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * An action. Each action has the type <code>forward</code> and specifies a target group.
     * </p>
     * 
     * @return An action. Each action has the type <code>forward</code> and specifies a target group.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * An action. Each action has the type <code>forward</code> and specifies a target group.
     * </p>
     * 
     * @param actions
     *        An action. Each action has the type <code>forward</code> and specifies a target group.
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
     * An action. Each action has the type <code>forward</code> and specifies a target group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        An action. Each action has the type <code>forward</code> and specifies a target group.
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
     * An action. Each action has the type <code>forward</code> and specifies a target group.
     * </p>
     * 
     * @param actions
     *        An action. Each action has the type <code>forward</code> and specifies a target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ListenerArn: " + getListenerArn() + ",");
        if (getConditions() != null)
            sb.append("Conditions: " + getConditions() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions());
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
        return hashCode;
    }

    @Override
    public CreateRuleRequest clone() {
        return (CreateRuleRequest) super.clone();
    }
}
