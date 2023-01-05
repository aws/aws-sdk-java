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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Rule" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     */
    private String ruleArn;
    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     */
    private RuleTriggerEventSource triggerEventSource;
    /**
     * <p>
     * The conditions of the rule.
     * </p>
     */
    private String function;
    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     */
    private java.util.List<RuleAction> actions;
    /**
     * <p>
     * The publish status of the rule.
     * </p>
     */
    private String publishStatus;
    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The timestamp for the when the rule was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the rule.
     * </p>
     */
    private String lastUpdatedBy;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public Rule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for the rule.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * 
     * @return A unique identifier for the rule.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param ruleArn
     *        The Amazon Resource Name (ARN) of the rule.
     */

    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule.
     */

    public String getRuleArn() {
        return this.ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param ruleArn
     *        The Amazon Resource Name (ARN) of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withRuleArn(String ruleArn) {
        setRuleArn(ruleArn);
        return this;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     * 
     * @param triggerEventSource
     *        The event source to trigger the rule.
     */

    public void setTriggerEventSource(RuleTriggerEventSource triggerEventSource) {
        this.triggerEventSource = triggerEventSource;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     * 
     * @return The event source to trigger the rule.
     */

    public RuleTriggerEventSource getTriggerEventSource() {
        return this.triggerEventSource;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     * 
     * @param triggerEventSource
     *        The event source to trigger the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withTriggerEventSource(RuleTriggerEventSource triggerEventSource) {
        setTriggerEventSource(triggerEventSource);
        return this;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     * 
     * @param function
     *        The conditions of the rule.
     */

    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     * 
     * @return The conditions of the rule.
     */

    public String getFunction() {
        return this.function;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     * 
     * @param function
     *        The conditions of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withFunction(String function) {
        setFunction(function);
        return this;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     * 
     * @return A list of actions to be run when the rule is triggered.
     */

    public java.util.List<RuleAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     * 
     * @param actions
     *        A list of actions to be run when the rule is triggered.
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
     * A list of actions to be run when the rule is triggered.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A list of actions to be run when the rule is triggered.
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
     * A list of actions to be run when the rule is triggered.
     * </p>
     * 
     * @param actions
     *        A list of actions to be run when the rule is triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withActions(java.util.Collection<RuleAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @see RulePublishStatus
     */

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @return The publish status of the rule.
     * @see RulePublishStatus
     */

    public String getPublishStatus() {
        return this.publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RulePublishStatus
     */

    public Rule withPublishStatus(String publishStatus) {
        setPublishStatus(publishStatus);
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RulePublishStatus
     */

    public Rule withPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp for when the rule was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     * 
     * @return The timestamp for when the rule was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp for when the rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The timestamp for the when the rule was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp for the when the rule was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp for the when the rule was last updated.
     * </p>
     * 
     * @return The timestamp for the when the rule was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp for the when the rule was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp for the when the rule was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the rule.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The Amazon Resource Name (ARN) of the user who last updated the rule.
     */

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who last updated the rule.
     */

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the rule.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The Amazon Resource Name (ARN) of the user who last updated the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withLastUpdatedBy(String lastUpdatedBy) {
        setLastUpdatedBy(lastUpdatedBy);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Rule#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Rule addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule clearTagsEntries() {
        this.tags = null;
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
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getRuleArn() != null)
            sb.append("RuleArn: ").append(getRuleArn()).append(",");
        if (getTriggerEventSource() != null)
            sb.append("TriggerEventSource: ").append(getTriggerEventSource()).append(",");
        if (getFunction() != null)
            sb.append("Function: ").append(getFunction()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getPublishStatus() != null)
            sb.append("PublishStatus: ").append(getPublishStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: ").append(getLastUpdatedBy()).append(",");
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

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
            return false;
        if (other.getTriggerEventSource() == null ^ this.getTriggerEventSource() == null)
            return false;
        if (other.getTriggerEventSource() != null && other.getTriggerEventSource().equals(this.getTriggerEventSource()) == false)
            return false;
        if (other.getFunction() == null ^ this.getFunction() == null)
            return false;
        if (other.getFunction() != null && other.getFunction().equals(this.getFunction()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getPublishStatus() == null ^ this.getPublishStatus() == null)
            return false;
        if (other.getPublishStatus() != null && other.getPublishStatus().equals(this.getPublishStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getLastUpdatedBy() == null ^ this.getLastUpdatedBy() == null)
            return false;
        if (other.getLastUpdatedBy() != null && other.getLastUpdatedBy().equals(this.getLastUpdatedBy()) == false)
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
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode + ((getTriggerEventSource() == null) ? 0 : getTriggerEventSource().hashCode());
        hashCode = prime * hashCode + ((getFunction() == null) ? 0 : getFunction().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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
        com.amazonaws.services.connect.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
