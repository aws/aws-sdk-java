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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for EventBridgeRuleTemplateGroupSummary
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/EventBridgeRuleTemplateGroupSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventBridgeRuleTemplateGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /** An eventbridge rule template group's ARN (Amazon Resource Name) */
    private String arn;

    private java.util.Date createdAt;
    /** A resource's optional description. */
    private String description;
    /** An eventbridge rule template group's id. AWS provided template groups have ids that start with `aws-` */
    private String id;

    private java.util.Date modifiedAt;
    /** A resource's name. Names must be unique within the scope of a resource type in a specific region. */
    private String name;

    private java.util.Map<String, String> tags;
    /** The number of templates in a group. */
    private Integer templateCount;

    /**
     * An eventbridge rule template group's ARN (Amazon Resource Name)
     * 
     * @param arn
     *        An eventbridge rule template group's ARN (Amazon Resource Name)
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * An eventbridge rule template group's ARN (Amazon Resource Name)
     * 
     * @return An eventbridge rule template group's ARN (Amazon Resource Name)
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * An eventbridge rule template group's ARN (Amazon Resource Name)
     * 
     * @param arn
     *        An eventbridge rule template group's ARN (Amazon Resource Name)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeRuleTemplateGroupSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param createdAt
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @param createdAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeRuleTemplateGroupSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * A resource's optional description.
     * 
     * @param description
     *        A resource's optional description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A resource's optional description.
     * 
     * @return A resource's optional description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A resource's optional description.
     * 
     * @param description
     *        A resource's optional description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeRuleTemplateGroupSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * An eventbridge rule template group's id. AWS provided template groups have ids that start with `aws-`
     * 
     * @param id
     *        An eventbridge rule template group's id. AWS provided template groups have ids that start with `aws-`
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * An eventbridge rule template group's id. AWS provided template groups have ids that start with `aws-`
     * 
     * @return An eventbridge rule template group's id. AWS provided template groups have ids that start with `aws-`
     */

    public String getId() {
        return this.id;
    }

    /**
     * An eventbridge rule template group's id. AWS provided template groups have ids that start with `aws-`
     * 
     * @param id
     *        An eventbridge rule template group's id. AWS provided template groups have ids that start with `aws-`
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeRuleTemplateGroupSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param modifiedAt
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * @return
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * @param modifiedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeRuleTemplateGroupSummary withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @param name
     *        A resource's name. Names must be unique within the scope of a resource type in a specific region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @return A resource's name. Names must be unique within the scope of a resource type in a specific region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @param name
     *        A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeRuleTemplateGroupSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeRuleTemplateGroupSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see EventBridgeRuleTemplateGroupSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeRuleTemplateGroupSummary addTagsEntry(String key, String value) {
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

    public EventBridgeRuleTemplateGroupSummary clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * The number of templates in a group.
     * 
     * @param templateCount
     *        The number of templates in a group.
     */

    public void setTemplateCount(Integer templateCount) {
        this.templateCount = templateCount;
    }

    /**
     * The number of templates in a group.
     * 
     * @return The number of templates in a group.
     */

    public Integer getTemplateCount() {
        return this.templateCount;
    }

    /**
     * The number of templates in a group.
     * 
     * @param templateCount
     *        The number of templates in a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBridgeRuleTemplateGroupSummary withTemplateCount(Integer templateCount) {
        setTemplateCount(templateCount);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateCount() != null)
            sb.append("TemplateCount: ").append(getTemplateCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventBridgeRuleTemplateGroupSummary == false)
            return false;
        EventBridgeRuleTemplateGroupSummary other = (EventBridgeRuleTemplateGroupSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateCount() == null ^ this.getTemplateCount() == null)
            return false;
        if (other.getTemplateCount() != null && other.getTemplateCount().equals(this.getTemplateCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateCount() == null) ? 0 : getTemplateCount().hashCode());
        return hashCode;
    }

    @Override
    public EventBridgeRuleTemplateGroupSummary clone() {
        try {
            return (EventBridgeRuleTemplateGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.EventBridgeRuleTemplateGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
