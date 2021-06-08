/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StudioComponentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioComponentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user ID of the user that created the studio component.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name for the studio component.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     */
    private String studioComponentId;
    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     */
    private String subtype;
    /**
     * <p>
     * The type of the studio component.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that created the studio component.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the studio component.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the studio component.
     * </p>
     * 
     * @return The user ID of the user that created the studio component.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the studio component.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @param name
     *        The name for the studio component.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @return The name for the studio component.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @param name
     *        The name for the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @param studioComponentId
     *        The unique identifier for a studio component resource.
     */

    public void setStudioComponentId(String studioComponentId) {
        this.studioComponentId = studioComponentId;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @return The unique identifier for a studio component resource.
     */

    public String getStudioComponentId() {
        return this.studioComponentId;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @param studioComponentId
     *        The unique identifier for a studio component resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentSummary withStudioComponentId(String studioComponentId) {
        setStudioComponentId(studioComponentId);
        return this;
    }

    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     * 
     * @param subtype
     *        The specific subtype of a studio component.
     * @see StudioComponentSubtype
     */

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     * 
     * @return The specific subtype of a studio component.
     * @see StudioComponentSubtype
     */

    public String getSubtype() {
        return this.subtype;
    }

    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     * 
     * @param subtype
     *        The specific subtype of a studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentSubtype
     */

    public StudioComponentSummary withSubtype(String subtype) {
        setSubtype(subtype);
        return this;
    }

    /**
     * <p>
     * The specific subtype of a studio component.
     * </p>
     * 
     * @param subtype
     *        The specific subtype of a studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentSubtype
     */

    public StudioComponentSummary withSubtype(StudioComponentSubtype subtype) {
        this.subtype = subtype.toString();
        return this;
    }

    /**
     * <p>
     * The type of the studio component.
     * </p>
     * 
     * @param type
     *        The type of the studio component.
     * @see StudioComponentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the studio component.
     * </p>
     * 
     * @return The type of the studio component.
     * @see StudioComponentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the studio component.
     * </p>
     * 
     * @param type
     *        The type of the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentType
     */

    public StudioComponentSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the studio component.
     * </p>
     * 
     * @param type
     *        The type of the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentType
     */

    public StudioComponentSummary withType(StudioComponentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix epoch timestamp in seconds for when the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix epoch timestamp in seconds for when the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @param updatedBy
     *        The user ID of the user that most recently updated the resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @return The user ID of the user that most recently updated the resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @param updatedBy
     *        The user ID of the user that most recently updated the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentSummary withUpdatedBy(String updatedBy) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStudioComponentId() != null)
            sb.append("StudioComponentId: ").append(getStudioComponentId()).append(",");
        if (getSubtype() != null)
            sb.append("Subtype: ").append(getSubtype()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof StudioComponentSummary == false)
            return false;
        StudioComponentSummary other = (StudioComponentSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStudioComponentId() == null ^ this.getStudioComponentId() == null)
            return false;
        if (other.getStudioComponentId() != null && other.getStudioComponentId().equals(this.getStudioComponentId()) == false)
            return false;
        if (other.getSubtype() == null ^ this.getSubtype() == null)
            return false;
        if (other.getSubtype() != null && other.getSubtype().equals(this.getSubtype()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentId() == null) ? 0 : getStudioComponentId().hashCode());
        hashCode = prime * hashCode + ((getSubtype() == null) ? 0 : getSubtype().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public StudioComponentSummary clone() {
        try {
            return (StudioComponentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StudioComponentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
