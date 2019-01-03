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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a rule.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRuleListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rule ARN.
     * </p>
     */
    private String ruleArn;
    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The pattern for the topic names that apply.
     * </p>
     */
    private String topicPattern;
    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     */
    private Boolean ruleDisabled;

    /**
     * <p>
     * The rule ARN.
     * </p>
     * 
     * @param ruleArn
     *        The rule ARN.
     */

    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The rule ARN.
     * </p>
     * 
     * @return The rule ARN.
     */

    public String getRuleArn() {
        return this.ruleArn;
    }

    /**
     * <p>
     * The rule ARN.
     * </p>
     * 
     * @param ruleArn
     *        The rule ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleListItem withRuleArn(String ruleArn) {
        setRuleArn(ruleArn);
        return this;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleListItem withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The pattern for the topic names that apply.
     * </p>
     * 
     * @param topicPattern
     *        The pattern for the topic names that apply.
     */

    public void setTopicPattern(String topicPattern) {
        this.topicPattern = topicPattern;
    }

    /**
     * <p>
     * The pattern for the topic names that apply.
     * </p>
     * 
     * @return The pattern for the topic names that apply.
     */

    public String getTopicPattern() {
        return this.topicPattern;
    }

    /**
     * <p>
     * The pattern for the topic names that apply.
     * </p>
     * 
     * @param topicPattern
     *        The pattern for the topic names that apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleListItem withTopicPattern(String topicPattern) {
        setTopicPattern(topicPattern);
        return this;
    }

    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the rule was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     * 
     * @return The date and time the rule was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleListItem withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @param ruleDisabled
     *        Specifies whether the rule is disabled.
     */

    public void setRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @return Specifies whether the rule is disabled.
     */

    public Boolean getRuleDisabled() {
        return this.ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @param ruleDisabled
     *        Specifies whether the rule is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleListItem withRuleDisabled(Boolean ruleDisabled) {
        setRuleDisabled(ruleDisabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @return Specifies whether the rule is disabled.
     */

    public Boolean isRuleDisabled() {
        return this.ruleDisabled;
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
        if (getRuleArn() != null)
            sb.append("RuleArn: ").append(getRuleArn()).append(",");
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getTopicPattern() != null)
            sb.append("TopicPattern: ").append(getTopicPattern()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getRuleDisabled() != null)
            sb.append("RuleDisabled: ").append(getRuleDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRuleListItem == false)
            return false;
        TopicRuleListItem other = (TopicRuleListItem) obj;
        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getTopicPattern() == null ^ this.getTopicPattern() == null)
            return false;
        if (other.getTopicPattern() != null && other.getTopicPattern().equals(this.getTopicPattern()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getRuleDisabled() == null ^ this.getRuleDisabled() == null)
            return false;
        if (other.getRuleDisabled() != null && other.getRuleDisabled().equals(this.getRuleDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getTopicPattern() == null) ? 0 : getTopicPattern().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getRuleDisabled() == null) ? 0 : getRuleDisabled().hashCode());
        return hashCode;
    }

    @Override
    public TopicRuleListItem clone() {
        try {
            return (TopicRuleListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TopicRuleListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
