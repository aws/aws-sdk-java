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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the identifier of an entity, including its ID and type.
 * </p>
 * <p>
 * This data type is used as a request parameter for <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorized.html">IsAuthorized</a>
 * operation, and as a response parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html">CreatePolicy</a>, <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_GetPolicy.html">GetPolicy</a>, and <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicy.html">UpdatePolicy</a>
 * operations.
 * </p>
 * <p>
 * Example: <code>{"entityId":"<i>string</i>","entityType":"<i>string</i>"}</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/EntityIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of an entity.
     * </p>
     * <p>
     * Example: <code>"entityType":"<i>typeName</i>"</code>
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The identifier of an entity.
     * </p>
     * <p>
     * <code>"entityId":"<i>identifier</i>"</code>
     * </p>
     */
    private String entityId;

    /**
     * <p>
     * The type of an entity.
     * </p>
     * <p>
     * Example: <code>"entityType":"<i>typeName</i>"</code>
     * </p>
     * 
     * @param entityType
     *        The type of an entity.</p>
     *        <p>
     *        Example: <code>"entityType":"<i>typeName</i>"</code>
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of an entity.
     * </p>
     * <p>
     * Example: <code>"entityType":"<i>typeName</i>"</code>
     * </p>
     * 
     * @return The type of an entity.</p>
     *         <p>
     *         Example: <code>"entityType":"<i>typeName</i>"</code>
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of an entity.
     * </p>
     * <p>
     * Example: <code>"entityType":"<i>typeName</i>"</code>
     * </p>
     * 
     * @param entityType
     *        The type of an entity.</p>
     *        <p>
     *        Example: <code>"entityType":"<i>typeName</i>"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityIdentifier withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The identifier of an entity.
     * </p>
     * <p>
     * <code>"entityId":"<i>identifier</i>"</code>
     * </p>
     * 
     * @param entityId
     *        The identifier of an entity.</p>
     *        <p>
     *        <code>"entityId":"<i>identifier</i>"</code>
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of an entity.
     * </p>
     * <p>
     * <code>"entityId":"<i>identifier</i>"</code>
     * </p>
     * 
     * @return The identifier of an entity.</p>
     *         <p>
     *         <code>"entityId":"<i>identifier</i>"</code>
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of an entity.
     * </p>
     * <p>
     * <code>"entityId":"<i>identifier</i>"</code>
     * </p>
     * 
     * @param entityId
     *        The identifier of an entity.</p>
     *        <p>
     *        <code>"entityId":"<i>identifier</i>"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityIdentifier withEntityId(String entityId) {
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
            sb.append("EntityType: ").append("***Sensitive Data Redacted***").append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityIdentifier == false)
            return false;
        EntityIdentifier other = (EntityIdentifier) obj;
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
    public EntityIdentifier clone() {
        try {
            return (EntityIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.EntityIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
