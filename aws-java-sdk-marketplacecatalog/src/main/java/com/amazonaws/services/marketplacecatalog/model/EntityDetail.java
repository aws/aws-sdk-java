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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains metadata and details about the entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/EntityDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entity type of the entity, in the format of <code>EntityType@Version</code>.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     */
    private String entityArn;
    /**
     * <p>
     * The ID of the entity, in the format of <code>EntityId@RevisionId</code>.
     * </p>
     */
    private String entityIdentifier;
    /**
     * <p>
     * The last time the entity was modified.
     * </p>
     */
    private String lastModifiedDate;

    /**
     * <p>
     * The entity type of the entity, in the format of <code>EntityType@Version</code>.
     * </p>
     * 
     * @param entityType
     *        The entity type of the entity, in the format of <code>EntityType@Version</code>.
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The entity type of the entity, in the format of <code>EntityType@Version</code>.
     * </p>
     * 
     * @return The entity type of the entity, in the format of <code>EntityType@Version</code>.
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The entity type of the entity, in the format of <code>EntityType@Version</code>.
     * </p>
     * 
     * @param entityType
     *        The entity type of the entity, in the format of <code>EntityType@Version</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDetail withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param entityArn
     *        The Amazon Resource Name (ARN) of the entity.
     */

    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the entity.
     */

    public String getEntityArn() {
        return this.entityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param entityArn
     *        The Amazon Resource Name (ARN) of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDetail withEntityArn(String entityArn) {
        setEntityArn(entityArn);
        return this;
    }

    /**
     * <p>
     * The ID of the entity, in the format of <code>EntityId@RevisionId</code>.
     * </p>
     * 
     * @param entityIdentifier
     *        The ID of the entity, in the format of <code>EntityId@RevisionId</code>.
     */

    public void setEntityIdentifier(String entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
    }

    /**
     * <p>
     * The ID of the entity, in the format of <code>EntityId@RevisionId</code>.
     * </p>
     * 
     * @return The ID of the entity, in the format of <code>EntityId@RevisionId</code>.
     */

    public String getEntityIdentifier() {
        return this.entityIdentifier;
    }

    /**
     * <p>
     * The ID of the entity, in the format of <code>EntityId@RevisionId</code>.
     * </p>
     * 
     * @param entityIdentifier
     *        The ID of the entity, in the format of <code>EntityId@RevisionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDetail withEntityIdentifier(String entityIdentifier) {
        setEntityIdentifier(entityIdentifier);
        return this;
    }

    /**
     * <p>
     * The last time the entity was modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last time the entity was modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last time the entity was modified.
     * </p>
     * 
     * @return The last time the entity was modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last time the entity was modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last time the entity was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDetail withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getEntityArn() != null)
            sb.append("EntityArn: ").append(getEntityArn()).append(",");
        if (getEntityIdentifier() != null)
            sb.append("EntityIdentifier: ").append(getEntityIdentifier()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityDetail == false)
            return false;
        EntityDetail other = (EntityDetail) obj;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null)
            return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false)
            return false;
        if (other.getEntityIdentifier() == null ^ this.getEntityIdentifier() == null)
            return false;
        if (other.getEntityIdentifier() != null && other.getEntityIdentifier().equals(this.getEntityIdentifier()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getEntityIdentifier() == null) ? 0 : getEntityIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public EntityDetail clone() {
        try {
            return (EntityDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.EntityDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
