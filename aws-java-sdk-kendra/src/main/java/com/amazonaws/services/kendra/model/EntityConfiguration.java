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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information for users or groups in your IAM Identity Center identity source to grant
 * access your Amazon Kendra experience.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/EntityConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * Specifies whether you are configuring a <code>User</code> or a <code>Group</code>.
     * </p>
     */
    private String entityType;

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     * 
     * @param entityId
     *        The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID
     *        could be an email.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     * 
     * @return The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID
     *         could be an email.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     * 
     * @param entityId
     *        The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID
     *        could be an email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityConfiguration withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * Specifies whether you are configuring a <code>User</code> or a <code>Group</code>.
     * </p>
     * 
     * @param entityType
     *        Specifies whether you are configuring a <code>User</code> or a <code>Group</code>.
     * @see EntityType
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * Specifies whether you are configuring a <code>User</code> or a <code>Group</code>.
     * </p>
     * 
     * @return Specifies whether you are configuring a <code>User</code> or a <code>Group</code>.
     * @see EntityType
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * Specifies whether you are configuring a <code>User</code> or a <code>Group</code>.
     * </p>
     * 
     * @param entityType
     *        Specifies whether you are configuring a <code>User</code> or a <code>Group</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public EntityConfiguration withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * Specifies whether you are configuring a <code>User</code> or a <code>Group</code>.
     * </p>
     * 
     * @param entityType
     *        Specifies whether you are configuring a <code>User</code> or a <code>Group</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public EntityConfiguration withEntityType(EntityType entityType) {
        this.entityType = entityType.toString();
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
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityConfiguration == false)
            return false;
        EntityConfiguration other = (EntityConfiguration) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        return hashCode;
    }

    @Override
    public EntityConfiguration clone() {
        try {
            return (EntityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.EntityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
