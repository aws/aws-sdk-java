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
 * Contains summary information about the task template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TaskTemplateMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskTemplateMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the task template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the task template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp when the task template was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The timestamp when the task template was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     * 
     * @param id
     *        A unique identifier for the task template.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     * 
     * @return A unique identifier for the task template.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the task template.
     * </p>
     * 
     * @param id
     *        A unique identifier for the task template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateMetadata withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the task template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the task template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateMetadata withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * 
     * @param name
     *        The name of the task template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * 
     * @return The name of the task template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * 
     * @param name
     *        The name of the task template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the task template.
     * </p>
     * 
     * @param description
     *        The description of the task template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the task template.
     * </p>
     * 
     * @return The description of the task template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the task template.
     * </p>
     * 
     * @param description
     *        The description of the task template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @param status
     *        Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only
     *        be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a
     *        task that refers to this template cannot be created.
     * @see TaskTemplateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @return Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can
     *         only be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>,
     *         then a task that refers to this template cannot be created.
     * @see TaskTemplateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @param status
     *        Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only
     *        be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a
     *        task that refers to this template cannot be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTemplateStatus
     */

    public TaskTemplateMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @param status
     *        Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only
     *        be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a
     *        task that refers to this template cannot be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTemplateStatus
     */

    public TaskTemplateMetadata withStatus(TaskTemplateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the task template was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the task template was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the task template was last modified.
     * </p>
     * 
     * @return The timestamp when the task template was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the task template was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the task template was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateMetadata withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when the task template was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the task template was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp when the task template was created.
     * </p>
     * 
     * @return The timestamp when the task template was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp when the task template was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the task template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskTemplateMetadata withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskTemplateMetadata == false)
            return false;
        TaskTemplateMetadata other = (TaskTemplateMetadata) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
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
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public TaskTemplateMetadata clone() {
        try {
            return (TaskTemplateMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TaskTemplateMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
