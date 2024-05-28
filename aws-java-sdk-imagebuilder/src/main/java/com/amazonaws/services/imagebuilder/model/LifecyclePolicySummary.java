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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a summary of lifecycle policy resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecyclePolicySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy summary resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the lifecycle policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Optional description for the lifecycle policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The lifecycle policy resource status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to run the lifecycle policy.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The type of resources the lifecycle policy targets.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The timestamp when Image Builder created the lifecycle policy resource.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The timestamp when Image Builder updated the lifecycle policy resource.
     * </p>
     */
    private java.util.Date dateUpdated;
    /**
     * <p>
     * The timestamp for the last time Image Builder ran the lifecycle policy.
     * </p>
     */
    private java.util.Date dateLastRun;
    /**
     * <p>
     * To help manage your lifecycle policy resources, you can assign your own metadata to each resource in the form of
     * tags. Each tag consists of a key and an optional value, both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy summary resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the lifecycle policy summary resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy summary resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the lifecycle policy summary resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy summary resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the lifecycle policy summary resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the lifecycle policy.
     * </p>
     * 
     * @param name
     *        The name of the lifecycle policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the lifecycle policy.
     * </p>
     * 
     * @return The name of the lifecycle policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the lifecycle policy.
     * </p>
     * 
     * @param name
     *        The name of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Optional description for the lifecycle policy.
     * </p>
     * 
     * @param description
     *        Optional description for the lifecycle policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Optional description for the lifecycle policy.
     * </p>
     * 
     * @return Optional description for the lifecycle policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Optional description for the lifecycle policy.
     * </p>
     * 
     * @param description
     *        Optional description for the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The lifecycle policy resource status.
     * </p>
     * 
     * @param status
     *        The lifecycle policy resource status.
     * @see LifecyclePolicyStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The lifecycle policy resource status.
     * </p>
     * 
     * @return The lifecycle policy resource status.
     * @see LifecyclePolicyStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The lifecycle policy resource status.
     * </p>
     * 
     * @param status
     *        The lifecycle policy resource status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyStatus
     */

    public LifecyclePolicySummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The lifecycle policy resource status.
     * </p>
     * 
     * @param status
     *        The lifecycle policy resource status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyStatus
     */

    public LifecyclePolicySummary withStatus(LifecyclePolicyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to run the lifecycle policy.
     * </p>
     * 
     * @param executionRole
     *        The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to run the lifecycle
     *        policy.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to run the lifecycle policy.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to run the lifecycle
     *         policy.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to run the lifecycle policy.
     * </p>
     * 
     * @param executionRole
     *        The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to run the lifecycle
     *        policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * The type of resources the lifecycle policy targets.
     * </p>
     * 
     * @param resourceType
     *        The type of resources the lifecycle policy targets.
     * @see LifecyclePolicyResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resources the lifecycle policy targets.
     * </p>
     * 
     * @return The type of resources the lifecycle policy targets.
     * @see LifecyclePolicyResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resources the lifecycle policy targets.
     * </p>
     * 
     * @param resourceType
     *        The type of resources the lifecycle policy targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyResourceType
     */

    public LifecyclePolicySummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resources the lifecycle policy targets.
     * </p>
     * 
     * @param resourceType
     *        The type of resources the lifecycle policy targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyResourceType
     */

    public LifecyclePolicySummary withResourceType(LifecyclePolicyResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when Image Builder created the lifecycle policy resource.
     * </p>
     * 
     * @param dateCreated
     *        The timestamp when Image Builder created the lifecycle policy resource.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The timestamp when Image Builder created the lifecycle policy resource.
     * </p>
     * 
     * @return The timestamp when Image Builder created the lifecycle policy resource.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The timestamp when Image Builder created the lifecycle policy resource.
     * </p>
     * 
     * @param dateCreated
     *        The timestamp when Image Builder created the lifecycle policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The timestamp when Image Builder updated the lifecycle policy resource.
     * </p>
     * 
     * @param dateUpdated
     *        The timestamp when Image Builder updated the lifecycle policy resource.
     */

    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The timestamp when Image Builder updated the lifecycle policy resource.
     * </p>
     * 
     * @return The timestamp when Image Builder updated the lifecycle policy resource.
     */

    public java.util.Date getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The timestamp when Image Builder updated the lifecycle policy resource.
     * </p>
     * 
     * @param dateUpdated
     *        The timestamp when Image Builder updated the lifecycle policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary withDateUpdated(java.util.Date dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * <p>
     * The timestamp for the last time Image Builder ran the lifecycle policy.
     * </p>
     * 
     * @param dateLastRun
     *        The timestamp for the last time Image Builder ran the lifecycle policy.
     */

    public void setDateLastRun(java.util.Date dateLastRun) {
        this.dateLastRun = dateLastRun;
    }

    /**
     * <p>
     * The timestamp for the last time Image Builder ran the lifecycle policy.
     * </p>
     * 
     * @return The timestamp for the last time Image Builder ran the lifecycle policy.
     */

    public java.util.Date getDateLastRun() {
        return this.dateLastRun;
    }

    /**
     * <p>
     * The timestamp for the last time Image Builder ran the lifecycle policy.
     * </p>
     * 
     * @param dateLastRun
     *        The timestamp for the last time Image Builder ran the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary withDateLastRun(java.util.Date dateLastRun) {
        setDateLastRun(dateLastRun);
        return this;
    }

    /**
     * <p>
     * To help manage your lifecycle policy resources, you can assign your own metadata to each resource in the form of
     * tags. Each tag consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @return To help manage your lifecycle policy resources, you can assign your own metadata to each resource in the
     *         form of tags. Each tag consists of a key and an optional value, both of which you define.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * To help manage your lifecycle policy resources, you can assign your own metadata to each resource in the form of
     * tags. Each tag consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        To help manage your lifecycle policy resources, you can assign your own metadata to each resource in the
     *        form of tags. Each tag consists of a key and an optional value, both of which you define.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * To help manage your lifecycle policy resources, you can assign your own metadata to each resource in the form of
     * tags. Each tag consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        To help manage your lifecycle policy resources, you can assign your own metadata to each resource in the
     *        form of tags. Each tag consists of a key and an optional value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see LifecyclePolicySummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary addTagsEntry(String key, String value) {
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

    public LifecyclePolicySummary clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: ").append(getDateUpdated()).append(",");
        if (getDateLastRun() != null)
            sb.append("DateLastRun: ").append(getDateLastRun()).append(",");
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

        if (obj instanceof LifecyclePolicySummary == false)
            return false;
        LifecyclePolicySummary other = (LifecyclePolicySummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getDateLastRun() == null ^ this.getDateLastRun() == null)
            return false;
        if (other.getDateLastRun() != null && other.getDateLastRun().equals(this.getDateLastRun()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getDateLastRun() == null) ? 0 : getDateLastRun().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicySummary clone() {
        try {
            return (LifecyclePolicySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecyclePolicySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
