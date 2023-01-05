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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about a component type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ComponentTypeSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentTypeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the component type.
     * </p>
     */
    private String componentTypeId;
    /**
     * <p>
     * The date and time when the component type was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time when the component type was last updated.
     * </p>
     */
    private java.util.Date updateDateTime;
    /**
     * <p>
     * The description of the component type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current status of the component type.
     * </p>
     */
    private Status status;
    /**
     * <p>
     * The component type name.
     * </p>
     */
    private String componentTypeName;

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @param arn
     *        The ARN of the component type.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @return The ARN of the component type.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @param arn
     *        The ARN of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentTypeSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type.
     */

    public void setComponentTypeId(String componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @return The ID of the component type.
     */

    public String getComponentTypeId() {
        return this.componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentTypeSummary withComponentTypeId(String componentTypeId) {
        setComponentTypeId(componentTypeId);
        return this;
    }

    /**
     * <p>
     * The date and time when the component type was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the component type was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the component type was created.
     * </p>
     * 
     * @return The date and time when the component type was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time when the component type was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the component type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentTypeSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the component type was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the component type was last updated.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The date and time when the component type was last updated.
     * </p>
     * 
     * @return The date and time when the component type was last updated.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The date and time when the component type was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the component type was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentTypeSummary withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
        return this;
    }

    /**
     * <p>
     * The description of the component type.
     * </p>
     * 
     * @param description
     *        The description of the component type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the component type.
     * </p>
     * 
     * @return The description of the component type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the component type.
     * </p>
     * 
     * @param description
     *        The description of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentTypeSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current status of the component type.
     * </p>
     * 
     * @param status
     *        The current status of the component type.
     */

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the component type.
     * </p>
     * 
     * @return The current status of the component type.
     */

    public Status getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the component type.
     * </p>
     * 
     * @param status
     *        The current status of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentTypeSummary withStatus(Status status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The component type name.
     * </p>
     * 
     * @param componentTypeName
     *        The component type name.
     */

    public void setComponentTypeName(String componentTypeName) {
        this.componentTypeName = componentTypeName;
    }

    /**
     * <p>
     * The component type name.
     * </p>
     * 
     * @return The component type name.
     */

    public String getComponentTypeName() {
        return this.componentTypeName;
    }

    /**
     * <p>
     * The component type name.
     * </p>
     * 
     * @param componentTypeName
     *        The component type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentTypeSummary withComponentTypeName(String componentTypeName) {
        setComponentTypeName(componentTypeName);
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
        if (getComponentTypeId() != null)
            sb.append("ComponentTypeId: ").append(getComponentTypeId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getComponentTypeName() != null)
            sb.append("ComponentTypeName: ").append(getComponentTypeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentTypeSummary == false)
            return false;
        ComponentTypeSummary other = (ComponentTypeSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getComponentTypeId() == null ^ this.getComponentTypeId() == null)
            return false;
        if (other.getComponentTypeId() != null && other.getComponentTypeId().equals(this.getComponentTypeId()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getComponentTypeName() == null ^ this.getComponentTypeName() == null)
            return false;
        if (other.getComponentTypeName() != null && other.getComponentTypeName().equals(this.getComponentTypeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeId() == null) ? 0 : getComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeName() == null) ? 0 : getComponentTypeName().hashCode());
        return hashCode;
    }

    @Override
    public ComponentTypeSummary clone() {
        try {
            return (ComponentTypeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.ComponentTypeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
