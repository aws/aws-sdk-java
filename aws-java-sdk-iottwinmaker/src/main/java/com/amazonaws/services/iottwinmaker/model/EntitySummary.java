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
 * An object that contains information about an entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/EntitySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntitySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the entity.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The name of the entity.
     * </p>
     */
    private String entityName;
    /**
     * <p>
     * The ARN of the entity.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the parent entity.
     * </p>
     */
    private String parentEntityId;
    /**
     * <p>
     * The current status of the entity.
     * </p>
     */
    private Status status;
    /**
     * <p>
     * The description of the entity.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A Boolean value that specifies whether the entity has child entities or not.
     * </p>
     */
    private Boolean hasChildEntities;
    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The last date and time when the entity was updated.
     * </p>
     */
    private java.util.Date updateDateTime;

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @return The ID of the entity.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @param entityName
     *        The name of the entity.
     */

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @return The name of the entity.
     */

    public String getEntityName() {
        return this.entityName;
    }

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @param entityName
     *        The name of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withEntityName(String entityName) {
        setEntityName(entityName);
        return this;
    }

    /**
     * <p>
     * The ARN of the entity.
     * </p>
     * 
     * @param arn
     *        The ARN of the entity.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the entity.
     * </p>
     * 
     * @return The ARN of the entity.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the entity.
     * </p>
     * 
     * @param arn
     *        The ARN of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the parent entity.
     * </p>
     * 
     * @param parentEntityId
     *        The ID of the parent entity.
     */

    public void setParentEntityId(String parentEntityId) {
        this.parentEntityId = parentEntityId;
    }

    /**
     * <p>
     * The ID of the parent entity.
     * </p>
     * 
     * @return The ID of the parent entity.
     */

    public String getParentEntityId() {
        return this.parentEntityId;
    }

    /**
     * <p>
     * The ID of the parent entity.
     * </p>
     * 
     * @param parentEntityId
     *        The ID of the parent entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withParentEntityId(String parentEntityId) {
        setParentEntityId(parentEntityId);
        return this;
    }

    /**
     * <p>
     * The current status of the entity.
     * </p>
     * 
     * @param status
     *        The current status of the entity.
     */

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the entity.
     * </p>
     * 
     * @return The current status of the entity.
     */

    public Status getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the entity.
     * </p>
     * 
     * @param status
     *        The current status of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withStatus(Status status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The description of the entity.
     * </p>
     * 
     * @param description
     *        The description of the entity.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the entity.
     * </p>
     * 
     * @return The description of the entity.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the entity.
     * </p>
     * 
     * @param description
     *        The description of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the entity has child entities or not.
     * </p>
     * 
     * @param hasChildEntities
     *        A Boolean value that specifies whether the entity has child entities or not.
     */

    public void setHasChildEntities(Boolean hasChildEntities) {
        this.hasChildEntities = hasChildEntities;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the entity has child entities or not.
     * </p>
     * 
     * @return A Boolean value that specifies whether the entity has child entities or not.
     */

    public Boolean getHasChildEntities() {
        return this.hasChildEntities;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the entity has child entities or not.
     * </p>
     * 
     * @param hasChildEntities
     *        A Boolean value that specifies whether the entity has child entities or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withHasChildEntities(Boolean hasChildEntities) {
        setHasChildEntities(hasChildEntities);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the entity has child entities or not.
     * </p>
     * 
     * @return A Boolean value that specifies whether the entity has child entities or not.
     */

    public Boolean isHasChildEntities() {
        return this.hasChildEntities;
    }

    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the entity was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     * 
     * @return The date and time when the entity was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the entity was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The last date and time when the entity was updated.
     * </p>
     * 
     * @param updateDateTime
     *        The last date and time when the entity was updated.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The last date and time when the entity was updated.
     * </p>
     * 
     * @return The last date and time when the entity was updated.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The last date and time when the entity was updated.
     * </p>
     * 
     * @param updateDateTime
     *        The last date and time when the entity was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityName() != null)
            sb.append("EntityName: ").append(getEntityName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getParentEntityId() != null)
            sb.append("ParentEntityId: ").append(getParentEntityId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHasChildEntities() != null)
            sb.append("HasChildEntities: ").append(getHasChildEntities()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntitySummary == false)
            return false;
        EntitySummary other = (EntitySummary) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityName() == null ^ this.getEntityName() == null)
            return false;
        if (other.getEntityName() != null && other.getEntityName().equals(this.getEntityName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getParentEntityId() == null ^ this.getParentEntityId() == null)
            return false;
        if (other.getParentEntityId() != null && other.getParentEntityId().equals(this.getParentEntityId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHasChildEntities() == null ^ this.getHasChildEntities() == null)
            return false;
        if (other.getHasChildEntities() != null && other.getHasChildEntities().equals(this.getHasChildEntities()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityName() == null) ? 0 : getEntityName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getParentEntityId() == null) ? 0 : getParentEntityId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHasChildEntities() == null) ? 0 : getHasChildEntities().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        return hashCode;
    }

    @Override
    public EntitySummary clone() {
        try {
            return (EntitySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.EntitySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
