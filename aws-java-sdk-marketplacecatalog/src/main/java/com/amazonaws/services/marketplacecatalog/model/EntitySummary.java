/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This object is a container for common summary information about the entity. The summary doesn't contain the whole
 * entity structure, but it does contain information common across all entities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/EntitySummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntitySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for the entity. This value is not unique. It is defined by the provider.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the entity.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The unique identifier for the entity.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The ARN associated with the unique identifier for the entity.
     * </p>
     */
    private String entityArn;
    /**
     * <p>
     * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The visibility status of the entity to subscribers. This value can be <code>Public</code> (everyone can view the
     * entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the
     * entity was published and then unpublished and only existing subscribers can view it).
     * </p>
     */
    private String visibility;

    /**
     * <p>
     * The name for the entity. This value is not unique. It is defined by the provider.
     * </p>
     * 
     * @param name
     *        The name for the entity. This value is not unique. It is defined by the provider.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the entity. This value is not unique. It is defined by the provider.
     * </p>
     * 
     * @return The name for the entity. This value is not unique. It is defined by the provider.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the entity. This value is not unique. It is defined by the provider.
     * </p>
     * 
     * @param name
     *        The name for the entity. This value is not unique. It is defined by the provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the entity.
     * </p>
     * 
     * @param entityType
     *        The type of the entity.
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of the entity.
     * </p>
     * 
     * @return The type of the entity.
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of the entity.
     * </p>
     * 
     * @param entityType
     *        The type of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the entity.
     * </p>
     * 
     * @param entityId
     *        The unique identifier for the entity.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The unique identifier for the entity.
     * </p>
     * 
     * @return The unique identifier for the entity.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The unique identifier for the entity.
     * </p>
     * 
     * @param entityId
     *        The unique identifier for the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the entity.
     * </p>
     * 
     * @param entityArn
     *        The ARN associated with the unique identifier for the entity.
     */

    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the entity.
     * </p>
     * 
     * @return The ARN associated with the unique identifier for the entity.
     */

    public String getEntityArn() {
        return this.entityArn;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the entity.
     * </p>
     * 
     * @param entityArn
     *        The ARN associated with the unique identifier for the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withEntityArn(String entityArn) {
        setEntityArn(entityArn);
        return this;
    }

    /**
     * <p>
     * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     * 
     * @param lastModifiedDate
     *        The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     * 
     * @return The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     * 
     * @param lastModifiedDate
     *        The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The visibility status of the entity to subscribers. This value can be <code>Public</code> (everyone can view the
     * entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the
     * entity was published and then unpublished and only existing subscribers can view it).
     * </p>
     * 
     * @param visibility
     *        The visibility status of the entity to subscribers. This value can be <code>Public</code> (everyone can
     *        view the entity), <code>Limited</code> (the entity is visible to limited accounts only), or
     *        <code>Restricted</code> (the entity was published and then unpublished and only existing subscribers can
     *        view it).
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility status of the entity to subscribers. This value can be <code>Public</code> (everyone can view the
     * entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the
     * entity was published and then unpublished and only existing subscribers can view it).
     * </p>
     * 
     * @return The visibility status of the entity to subscribers. This value can be <code>Public</code> (everyone can
     *         view the entity), <code>Limited</code> (the entity is visible to limited accounts only), or
     *         <code>Restricted</code> (the entity was published and then unpublished and only existing subscribers can
     *         view it).
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility status of the entity to subscribers. This value can be <code>Public</code> (everyone can view the
     * entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the
     * entity was published and then unpublished and only existing subscribers can view it).
     * </p>
     * 
     * @param visibility
     *        The visibility status of the entity to subscribers. This value can be <code>Public</code> (everyone can
     *        view the entity), <code>Limited</code> (the entity is visible to limited accounts only), or
     *        <code>Restricted</code> (the entity was published and then unpublished and only existing subscribers can
     *        view it).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withVisibility(String visibility) {
        setVisibility(visibility);
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
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityArn() != null)
            sb.append("EntityArn: ").append(getEntityArn()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null)
            return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
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
        com.amazonaws.services.marketplacecatalog.model.transform.EntitySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
