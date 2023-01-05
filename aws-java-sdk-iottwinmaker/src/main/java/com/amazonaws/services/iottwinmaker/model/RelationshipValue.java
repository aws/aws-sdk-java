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
 * A value that associates a component and an entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/RelationshipValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationshipValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the target entity associated with this relationship value.
     * </p>
     */
    private String targetEntityId;
    /**
     * <p>
     * The name of the target component associated with the relationship value.
     * </p>
     */
    private String targetComponentName;

    /**
     * <p>
     * The ID of the target entity associated with this relationship value.
     * </p>
     * 
     * @param targetEntityId
     *        The ID of the target entity associated with this relationship value.
     */

    public void setTargetEntityId(String targetEntityId) {
        this.targetEntityId = targetEntityId;
    }

    /**
     * <p>
     * The ID of the target entity associated with this relationship value.
     * </p>
     * 
     * @return The ID of the target entity associated with this relationship value.
     */

    public String getTargetEntityId() {
        return this.targetEntityId;
    }

    /**
     * <p>
     * The ID of the target entity associated with this relationship value.
     * </p>
     * 
     * @param targetEntityId
     *        The ID of the target entity associated with this relationship value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationshipValue withTargetEntityId(String targetEntityId) {
        setTargetEntityId(targetEntityId);
        return this;
    }

    /**
     * <p>
     * The name of the target component associated with the relationship value.
     * </p>
     * 
     * @param targetComponentName
     *        The name of the target component associated with the relationship value.
     */

    public void setTargetComponentName(String targetComponentName) {
        this.targetComponentName = targetComponentName;
    }

    /**
     * <p>
     * The name of the target component associated with the relationship value.
     * </p>
     * 
     * @return The name of the target component associated with the relationship value.
     */

    public String getTargetComponentName() {
        return this.targetComponentName;
    }

    /**
     * <p>
     * The name of the target component associated with the relationship value.
     * </p>
     * 
     * @param targetComponentName
     *        The name of the target component associated with the relationship value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationshipValue withTargetComponentName(String targetComponentName) {
        setTargetComponentName(targetComponentName);
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
        if (getTargetEntityId() != null)
            sb.append("TargetEntityId: ").append(getTargetEntityId()).append(",");
        if (getTargetComponentName() != null)
            sb.append("TargetComponentName: ").append(getTargetComponentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationshipValue == false)
            return false;
        RelationshipValue other = (RelationshipValue) obj;
        if (other.getTargetEntityId() == null ^ this.getTargetEntityId() == null)
            return false;
        if (other.getTargetEntityId() != null && other.getTargetEntityId().equals(this.getTargetEntityId()) == false)
            return false;
        if (other.getTargetComponentName() == null ^ this.getTargetComponentName() == null)
            return false;
        if (other.getTargetComponentName() != null && other.getTargetComponentName().equals(this.getTargetComponentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetEntityId() == null) ? 0 : getTargetEntityId().hashCode());
        hashCode = prime * hashCode + ((getTargetComponentName() == null) ? 0 : getTargetComponentName().hashCode());
        return hashCode;
    }

    @Override
    public RelationshipValue clone() {
        try {
            return (RelationshipValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.RelationshipValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
