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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The entity details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/Entity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Entity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entity type.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The entity ID. If you do not know the <code>entityId</code>, you can pass <code>unknown</code>, which is
     * areserved string literal.
     * </p>
     */
    private String entityId;

    /**
     * <p>
     * The entity type.
     * </p>
     * 
     * @param entityType
     *        The entity type.
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The entity type.
     * </p>
     * 
     * @return The entity type.
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The entity type.
     * </p>
     * 
     * @param entityType
     *        The entity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The entity ID. If you do not know the <code>entityId</code>, you can pass <code>unknown</code>, which is
     * areserved string literal.
     * </p>
     * 
     * @param entityId
     *        The entity ID. If you do not know the <code>entityId</code>, you can pass <code>unknown</code>, which is
     *        areserved string literal.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The entity ID. If you do not know the <code>entityId</code>, you can pass <code>unknown</code>, which is
     * areserved string literal.
     * </p>
     * 
     * @return The entity ID. If you do not know the <code>entityId</code>, you can pass <code>unknown</code>, which is
     *         areserved string literal.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The entity ID. If you do not know the <code>entityId</code>, you can pass <code>unknown</code>, which is
     * areserved string literal.
     * </p>
     * 
     * @param entityId
     *        The entity ID. If you do not know the <code>entityId</code>, you can pass <code>unknown</code>, which is
     *        areserved string literal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withEntityId(String entityId) {
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
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
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

        if (obj instanceof Entity == false)
            return false;
        Entity other = (Entity) obj;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
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

        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        return hashCode;
    }

    @Override
    public Entity clone() {
        try {
            return (Entity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.EntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
