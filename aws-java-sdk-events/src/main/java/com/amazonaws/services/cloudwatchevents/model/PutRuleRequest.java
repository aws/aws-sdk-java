/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule that you are creating or updating.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * The event pattern. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html">Events
     * and Event Patterns</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     */
    private String eventPattern;
    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A description of the rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The list of key-value pairs to associate with the rule.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the rule that you are creating or updating.
     * </p>
     * 
     * @param name
     *        The name of the rule that you are creating or updating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule that you are creating or updating.
     * </p>
     * 
     * @return The name of the rule that you are creating or updating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule that you are creating or updating.
     * </p>
     * 
     * @param name
     *        The name of the rule that you are creating or updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
     * </p>
     * 
     * @param scheduleExpression
     *        The scheduling expression. For example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
     * </p>
     * 
     * @return The scheduling expression. For example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The scheduling expression. For example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
     * </p>
     * 
     * @param scheduleExpression
     *        The scheduling expression. For example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuleRequest withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * The event pattern. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html">Events
     * and Event Patterns</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html"
     *        >Events and Event Patterns</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     */

    public void setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
    }

    /**
     * <p>
     * The event pattern. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html">Events
     * and Event Patterns</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @return The event pattern. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html"
     *         >Events and Event Patterns</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     */

    public String getEventPattern() {
        return this.eventPattern;
    }

    /**
     * <p>
     * The event pattern. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html">Events
     * and Event Patterns</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html"
     *        >Events and Event Patterns</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuleRequest withEventPattern(String eventPattern) {
        setEventPattern(eventPattern);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the rule is enabled or disabled.
     * @see RuleState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @return Indicates whether the rule is enabled or disabled.
     * @see RuleState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the rule is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleState
     */

    public PutRuleRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the rule is enabled or disabled.
     * @see RuleState
     */

    public void setState(RuleState state) {
        withState(state);
    }

    /**
     * <p>
     * Indicates whether the rule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the rule is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleState
     */

    public PutRuleRequest withState(RuleState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of the rule.
     * </p>
     * 
     * @param description
     *        A description of the rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the rule.
     * </p>
     * 
     * @return A description of the rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the rule.
     * </p>
     * 
     * @param description
     *        A description of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role associated with the rule.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role associated with the rule.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role associated with the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuleRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs to associate with the rule.
     * </p>
     * 
     * @return The list of key-value pairs to associate with the rule.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value pairs to associate with the rule.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs to associate with the rule.
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
     * The list of key-value pairs to associate with the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs to associate with the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuleRequest withTags(Tag... tags) {
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
     * The list of key-value pairs to associate with the rule.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs to associate with the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuleRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getEventPattern() != null)
            sb.append("EventPattern: ").append(getEventPattern()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof PutRuleRequest == false)
            return false;
        PutRuleRequest other = (PutRuleRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getEventPattern() == null) ? 0 : getEventPattern().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutRuleRequest clone() {
        return (PutRuleRequest) super.clone();
    }

}
