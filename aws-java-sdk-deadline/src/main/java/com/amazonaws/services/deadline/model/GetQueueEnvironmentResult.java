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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueueEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueueEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user or system that created this resource.&gt;
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The name of the queue environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The priority of the queue environment.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The queue environment ID.
     * </p>
     */
    private String queueEnvironmentId;
    /**
     * <p>
     * The template for the queue environment.
     * </p>
     */
    private String template;
    /**
     * <p>
     * The type of template for the queue environment.
     * </p>
     */
    private String templateType;
    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @return The date and time the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueEnvironmentResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user or system that created this resource.&gt;
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.&gt;
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.&gt;
     * </p>
     * 
     * @return The user or system that created this resource.&gt;
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.&gt;
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueEnvironmentResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The name of the queue environment.
     * </p>
     * 
     * @param name
     *        The name of the queue environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the queue environment.
     * </p>
     * 
     * @return The name of the queue environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the queue environment.
     * </p>
     * 
     * @param name
     *        The name of the queue environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueEnvironmentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The priority of the queue environment.
     * </p>
     * 
     * @param priority
     *        The priority of the queue environment.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the queue environment.
     * </p>
     * 
     * @return The priority of the queue environment.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the queue environment.
     * </p>
     * 
     * @param priority
     *        The priority of the queue environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueEnvironmentResult withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The queue environment ID.
     * </p>
     * 
     * @param queueEnvironmentId
     *        The queue environment ID.
     */

    public void setQueueEnvironmentId(String queueEnvironmentId) {
        this.queueEnvironmentId = queueEnvironmentId;
    }

    /**
     * <p>
     * The queue environment ID.
     * </p>
     * 
     * @return The queue environment ID.
     */

    public String getQueueEnvironmentId() {
        return this.queueEnvironmentId;
    }

    /**
     * <p>
     * The queue environment ID.
     * </p>
     * 
     * @param queueEnvironmentId
     *        The queue environment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueEnvironmentResult withQueueEnvironmentId(String queueEnvironmentId) {
        setQueueEnvironmentId(queueEnvironmentId);
        return this;
    }

    /**
     * <p>
     * The template for the queue environment.
     * </p>
     * 
     * @param template
     *        The template for the queue environment.
     */

    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The template for the queue environment.
     * </p>
     * 
     * @return The template for the queue environment.
     */

    public String getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The template for the queue environment.
     * </p>
     * 
     * @param template
     *        The template for the queue environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueEnvironmentResult withTemplate(String template) {
        setTemplate(template);
        return this;
    }

    /**
     * <p>
     * The type of template for the queue environment.
     * </p>
     * 
     * @param templateType
     *        The type of template for the queue environment.
     * @see EnvironmentTemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of template for the queue environment.
     * </p>
     * 
     * @return The type of template for the queue environment.
     * @see EnvironmentTemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The type of template for the queue environment.
     * </p>
     * 
     * @param templateType
     *        The type of template for the queue environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentTemplateType
     */

    public GetQueueEnvironmentResult withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The type of template for the queue environment.
     * </p>
     * 
     * @param templateType
     *        The type of template for the queue environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentTemplateType
     */

    public GetQueueEnvironmentResult withTemplateType(EnvironmentTemplateType templateType) {
        this.templateType = templateType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @return The date and time the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueEnvironmentResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @return The user or system that updated this resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueEnvironmentResult withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getQueueEnvironmentId() != null)
            sb.append("QueueEnvironmentId: ").append(getQueueEnvironmentId()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueueEnvironmentResult == false)
            return false;
        GetQueueEnvironmentResult other = (GetQueueEnvironmentResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueueEnvironmentId() == null ^ this.getQueueEnvironmentId() == null)
            return false;
        if (other.getQueueEnvironmentId() != null && other.getQueueEnvironmentId().equals(this.getQueueEnvironmentId()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueueEnvironmentId() == null) ? 0 : getQueueEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public GetQueueEnvironmentResult clone() {
        try {
            return (GetQueueEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
