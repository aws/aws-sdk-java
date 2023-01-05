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
 * An object that specifies a relationship with another component type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/Relationship" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Relationship implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the target component type associated with this relationship.
     * </p>
     */
    private String targetComponentTypeId;
    /**
     * <p>
     * The type of the relationship.
     * </p>
     */
    private String relationshipType;

    /**
     * <p>
     * The ID of the target component type associated with this relationship.
     * </p>
     * 
     * @param targetComponentTypeId
     *        The ID of the target component type associated with this relationship.
     */

    public void setTargetComponentTypeId(String targetComponentTypeId) {
        this.targetComponentTypeId = targetComponentTypeId;
    }

    /**
     * <p>
     * The ID of the target component type associated with this relationship.
     * </p>
     * 
     * @return The ID of the target component type associated with this relationship.
     */

    public String getTargetComponentTypeId() {
        return this.targetComponentTypeId;
    }

    /**
     * <p>
     * The ID of the target component type associated with this relationship.
     * </p>
     * 
     * @param targetComponentTypeId
     *        The ID of the target component type associated with this relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relationship withTargetComponentTypeId(String targetComponentTypeId) {
        setTargetComponentTypeId(targetComponentTypeId);
        return this;
    }

    /**
     * <p>
     * The type of the relationship.
     * </p>
     * 
     * @param relationshipType
     *        The type of the relationship.
     */

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * <p>
     * The type of the relationship.
     * </p>
     * 
     * @return The type of the relationship.
     */

    public String getRelationshipType() {
        return this.relationshipType;
    }

    /**
     * <p>
     * The type of the relationship.
     * </p>
     * 
     * @param relationshipType
     *        The type of the relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relationship withRelationshipType(String relationshipType) {
        setRelationshipType(relationshipType);
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
        if (getTargetComponentTypeId() != null)
            sb.append("TargetComponentTypeId: ").append(getTargetComponentTypeId()).append(",");
        if (getRelationshipType() != null)
            sb.append("RelationshipType: ").append(getRelationshipType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Relationship == false)
            return false;
        Relationship other = (Relationship) obj;
        if (other.getTargetComponentTypeId() == null ^ this.getTargetComponentTypeId() == null)
            return false;
        if (other.getTargetComponentTypeId() != null && other.getTargetComponentTypeId().equals(this.getTargetComponentTypeId()) == false)
            return false;
        if (other.getRelationshipType() == null ^ this.getRelationshipType() == null)
            return false;
        if (other.getRelationshipType() != null && other.getRelationshipType().equals(this.getRelationshipType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetComponentTypeId() == null) ? 0 : getTargetComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getRelationshipType() == null) ? 0 : getRelationshipType().hashCode());
        return hashCode;
    }

    @Override
    public Relationship clone() {
        try {
            return (Relationship) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.RelationshipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
