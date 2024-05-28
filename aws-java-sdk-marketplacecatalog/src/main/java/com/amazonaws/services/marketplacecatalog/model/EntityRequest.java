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
 * An object that contains entity ID and the catalog in which the entity is present.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/EntityRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the catalog the entity is present in. The only value at this time is <code>AWSMarketplace</code>.
     * </p>
     */
    private String catalog;
    /**
     * <p>
     * The ID of the entity.
     * </p>
     */
    private String entityId;

    /**
     * <p>
     * The name of the catalog the entity is present in. The only value at this time is <code>AWSMarketplace</code>.
     * </p>
     * 
     * @param catalog
     *        The name of the catalog the entity is present in. The only value at this time is
     *        <code>AWSMarketplace</code>.
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The name of the catalog the entity is present in. The only value at this time is <code>AWSMarketplace</code>.
     * </p>
     * 
     * @return The name of the catalog the entity is present in. The only value at this time is
     *         <code>AWSMarketplace</code>.
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * The name of the catalog the entity is present in. The only value at this time is <code>AWSMarketplace</code>.
     * </p>
     * 
     * @param catalog
     *        The name of the catalog the entity is present in. The only value at this time is
     *        <code>AWSMarketplace</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRequest withCatalog(String catalog) {
        setCatalog(catalog);
        return this;
    }

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

    public EntityRequest withEntityId(String entityId) {
        setEntityId(entityId);
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
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRequest == false)
            return false;
        EntityRequest other = (EntityRequest) obj;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        return hashCode;
    }

    @Override
    public EntityRequest clone() {
        try {
            return (EntityRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.EntityRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
