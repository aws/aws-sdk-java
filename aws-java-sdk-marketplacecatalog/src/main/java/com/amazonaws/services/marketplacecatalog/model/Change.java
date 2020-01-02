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
 * An object that contains the <code>ChangeType</code>, <code>Details</code>, and <code>Entity</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/Change" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Change implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Change types are single string values that describe your intention for the change. Each change type is unique for
     * each <code>EntityType</code> provided in the change's scope.
     * </p>
     */
    private String changeType;
    /**
     * <p>
     * The entity to be changed.
     * </p>
     */
    private Entity entity;
    /**
     * <p>
     * This object contains details specific to the change type of the requested change.
     * </p>
     */
    private String details;

    /**
     * <p>
     * Change types are single string values that describe your intention for the change. Each change type is unique for
     * each <code>EntityType</code> provided in the change's scope.
     * </p>
     * 
     * @param changeType
     *        Change types are single string values that describe your intention for the change. Each change type is
     *        unique for each <code>EntityType</code> provided in the change's scope.
     */

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Change types are single string values that describe your intention for the change. Each change type is unique for
     * each <code>EntityType</code> provided in the change's scope.
     * </p>
     * 
     * @return Change types are single string values that describe your intention for the change. Each change type is
     *         unique for each <code>EntityType</code> provided in the change's scope.
     */

    public String getChangeType() {
        return this.changeType;
    }

    /**
     * <p>
     * Change types are single string values that describe your intention for the change. Each change type is unique for
     * each <code>EntityType</code> provided in the change's scope.
     * </p>
     * 
     * @param changeType
     *        Change types are single string values that describe your intention for the change. Each change type is
     *        unique for each <code>EntityType</code> provided in the change's scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Change withChangeType(String changeType) {
        setChangeType(changeType);
        return this;
    }

    /**
     * <p>
     * The entity to be changed.
     * </p>
     * 
     * @param entity
     *        The entity to be changed.
     */

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * <p>
     * The entity to be changed.
     * </p>
     * 
     * @return The entity to be changed.
     */

    public Entity getEntity() {
        return this.entity;
    }

    /**
     * <p>
     * The entity to be changed.
     * </p>
     * 
     * @param entity
     *        The entity to be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Change withEntity(Entity entity) {
        setEntity(entity);
        return this;
    }

    /**
     * <p>
     * This object contains details specific to the change type of the requested change.
     * </p>
     * 
     * @param details
     *        This object contains details specific to the change type of the requested change.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * This object contains details specific to the change type of the requested change.
     * </p>
     * 
     * @return This object contains details specific to the change type of the requested change.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * This object contains details specific to the change type of the requested change.
     * </p>
     * 
     * @param details
     *        This object contains details specific to the change type of the requested change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Change withDetails(String details) {
        setDetails(details);
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
        if (getChangeType() != null)
            sb.append("ChangeType: ").append(getChangeType()).append(",");
        if (getEntity() != null)
            sb.append("Entity: ").append(getEntity()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Change == false)
            return false;
        Change other = (Change) obj;
        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null && other.getChangeType().equals(this.getChangeType()) == false)
            return false;
        if (other.getEntity() == null ^ this.getEntity() == null)
            return false;
        if (other.getEntity() != null && other.getEntity().equals(this.getEntity()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        hashCode = prime * hashCode + ((getEntity() == null) ? 0 : getEntity().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public Change clone() {
        try {
            return (Change) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.ChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
