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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a rule in Amazon CloudWatch Events. A ListRulesResult contains a list of Rules.
 * </p>
 */
public class Rule implements Serializable, Cloneable {

    /**
     * <p>
     * The rule's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The event pattern of the rule.
     * </p>
     */
    private String eventPattern;
    /**
     * <p>
     * The rule's state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The description of the rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The rule's name.
     * </p>
     * 
     * @param name
     *        The rule's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The rule's name.
     * </p>
     * 
     * @return The rule's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The rule's name.
     * </p>
     * 
     * @param name
     *        The rule's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withName(String name) {
        setName(name);
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

    public Rule withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The event pattern of the rule.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern of the rule.
     */

    public void setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
    }

    /**
     * <p>
     * The event pattern of the rule.
     * </p>
     * 
     * @return The event pattern of the rule.
     */

    public String getEventPattern() {
        return this.eventPattern;
    }

    /**
     * <p>
     * The event pattern of the rule.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withEventPattern(String eventPattern) {
        setEventPattern(eventPattern);
        return this;
    }

    /**
     * <p>
     * The rule's state.
     * </p>
     * 
     * @param state
     *        The rule's state.
     * @see RuleState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The rule's state.
     * </p>
     * 
     * @return The rule's state.
     * @see RuleState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The rule's state.
     * </p>
     * 
     * @param state
     *        The rule's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleState
     */

    public Rule withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The rule's state.
     * </p>
     * 
     * @param state
     *        The rule's state.
     * @see RuleState
     */

    public void setState(RuleState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The rule's state.
     * </p>
     * 
     * @param state
     *        The rule's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleState
     */

    public Rule withState(RuleState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @param description
     *        The description of the rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @return The description of the rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @param description
     *        The description of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     * </p>
     * 
     * @param scheduleExpression
     *        The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     * </p>
     * 
     * @return The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     * </p>
     * 
     * @param scheduleExpression
     *        The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getEventPattern() != null)
            sb.append("EventPattern: " + getEventPattern() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: " + getScheduleExpression() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getEventPattern() == null ^ this.getEventPattern() == null)
            return false;
        if (other.getEventPattern() != null && other.getEventPattern().equals(this.getEventPattern()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getEventPattern() == null) ? 0 : getEventPattern().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
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
}
