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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The rule action.
     * </p>
     */
    private RuleAction action;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the rule.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The rule match. The <code>RuleMatch</code> must be an <code>HttpMatch</code>. This means that the rule should be
     * an exact match on HTTP constraints which are made up of the HTTP method, path, and header.
     * </p>
     */
    private RuleMatch match;
    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The priority assigned to the rule. The lower the priority number the higher the priority.
     * </p>
     */
    private Integer priority;

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

    public CreateRuleResult withAction(RuleAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rule.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the rule.
     * </p>
     * 
     * @param id
     *        The ID of the rule.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the rule.
     * </p>
     * 
     * @return The ID of the rule.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the rule.
     * </p>
     * 
     * @param id
     *        The ID of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The rule match. The <code>RuleMatch</code> must be an <code>HttpMatch</code>. This means that the rule should be
     * an exact match on HTTP constraints which are made up of the HTTP method, path, and header.
     * </p>
     * 
     * @param match
     *        The rule match. The <code>RuleMatch</code> must be an <code>HttpMatch</code>. This means that the rule
     *        should be an exact match on HTTP constraints which are made up of the HTTP method, path, and header.
     */

    public void setMatch(RuleMatch match) {
        this.match = match;
    }

    /**
     * <p>
     * The rule match. The <code>RuleMatch</code> must be an <code>HttpMatch</code>. This means that the rule should be
     * an exact match on HTTP constraints which are made up of the HTTP method, path, and header.
     * </p>
     * 
     * @return The rule match. The <code>RuleMatch</code> must be an <code>HttpMatch</code>. This means that the rule
     *         should be an exact match on HTTP constraints which are made up of the HTTP method, path, and header.
     */

    public RuleMatch getMatch() {
        return this.match;
    }

    /**
     * <p>
     * The rule match. The <code>RuleMatch</code> must be an <code>HttpMatch</code>. This means that the rule should be
     * an exact match on HTTP constraints which are made up of the HTTP method, path, and header.
     * </p>
     * 
     * @param match
     *        The rule match. The <code>RuleMatch</code> must be an <code>HttpMatch</code>. This means that the rule
     *        should be an exact match on HTTP constraints which are made up of the HTTP method, path, and header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleResult withMatch(RuleMatch match) {
        setMatch(match);
        return this;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The priority assigned to the rule. The lower the priority number the higher the priority.
     * </p>
     * 
     * @param priority
     *        The priority assigned to the rule. The lower the priority number the higher the priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority assigned to the rule. The lower the priority number the higher the priority.
     * </p>
     * 
     * @return The priority assigned to the rule. The lower the priority number the higher the priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority assigned to the rule. The lower the priority number the higher the priority.
     * </p>
     * 
     * @param priority
     *        The priority assigned to the rule. The lower the priority number the higher the priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleResult withPriority(Integer priority) {
        setPriority(priority);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRuleResult == false)
            return false;
        CreateRuleResult other = (CreateRuleResult) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public CreateRuleResult clone() {
        try {
            return (CreateRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
