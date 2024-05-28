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

/**
 * Placeholder documentation for CreateCloudWatchAlarmTemplateGroupResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateCloudWatchAlarmTemplateGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCloudWatchAlarmTemplateGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /** A cloudwatch alarm template group's ARN (Amazon Resource Name) */
    private String arn;

    private java.util.Date createdAt;
    /** A resource's optional description. */
    private String description;
    /** A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-` */
    private String id;

    private java.util.Date modifiedAt;
    /** A resource's name. Names must be unique within the scope of a resource type in a specific region. */
    private String name;

    private java.util.Map<String, String> tags;

    /**
     * A cloudwatch alarm template group's ARN (Amazon Resource Name)
     * 
     * @param arn
     *        A cloudwatch alarm template group's ARN (Amazon Resource Name)
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * A cloudwatch alarm template group's ARN (Amazon Resource Name)
     * 
     * @return A cloudwatch alarm template group's ARN (Amazon Resource Name)
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * A cloudwatch alarm template group's ARN (Amazon Resource Name)
     * 
     * @param arn
     *        A cloudwatch alarm template group's ARN (Amazon Resource Name)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateGroupResult withArn(String arn) {
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

    public CreateCloudWatchAlarmTemplateGroupResult withCreatedAt(java.util.Date createdAt) {
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

    public CreateCloudWatchAlarmTemplateGroupResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     * 
     * @param id
     *        A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     * 
     * @return A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     */

    public String getId() {
        return this.id;
    }

    /**
     * A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     * 
     * @param id
     *        A cloudwatch alarm template group's id. AWS provided template groups have ids that start with `aws-`
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateGroupResult withId(String id) {
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

    public CreateCloudWatchAlarmTemplateGroupResult withModifiedAt(java.util.Date modifiedAt) {
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

    public CreateCloudWatchAlarmTemplateGroupResult withName(String name) {
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

    public CreateCloudWatchAlarmTemplateGroupResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCloudWatchAlarmTemplateGroupResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateGroupResult addTagsEntry(String key, String value) {
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

    public CreateCloudWatchAlarmTemplateGroupResult clearTagsEntries() {
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

        if (obj instanceof CreateCloudWatchAlarmTemplateGroupResult == false)
            return false;
        CreateCloudWatchAlarmTemplateGroupResult other = (CreateCloudWatchAlarmTemplateGroupResult) obj;
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
        return hashCode;
    }

    @Override
    public CreateCloudWatchAlarmTemplateGroupResult clone() {
        try {
            return (CreateCloudWatchAlarmTemplateGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
