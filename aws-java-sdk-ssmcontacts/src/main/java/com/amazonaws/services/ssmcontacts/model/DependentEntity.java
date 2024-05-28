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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a resource that another resource is related to or depends on.
 * </p>
 * <p>
 * For example, if a contact is a member of a rotation, the rotation is a dependent entity of the contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DependentEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DependentEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of relationship between one resource and the other resource that it is related to or depends on.
     * </p>
     */
    private String relationType;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the dependent resources.
     * </p>
     */
    private java.util.List<String> dependentResourceIds;

    /**
     * <p>
     * The type of relationship between one resource and the other resource that it is related to or depends on.
     * </p>
     * 
     * @param relationType
     *        The type of relationship between one resource and the other resource that it is related to or depends on.
     */

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    /**
     * <p>
     * The type of relationship between one resource and the other resource that it is related to or depends on.
     * </p>
     * 
     * @return The type of relationship between one resource and the other resource that it is related to or depends on.
     */

    public String getRelationType() {
        return this.relationType;
    }

    /**
     * <p>
     * The type of relationship between one resource and the other resource that it is related to or depends on.
     * </p>
     * 
     * @param relationType
     *        The type of relationship between one resource and the other resource that it is related to or depends on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DependentEntity withRelationType(String relationType) {
        setRelationType(relationType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the dependent resources.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the dependent resources.
     */

    public java.util.List<String> getDependentResourceIds() {
        return dependentResourceIds;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the dependent resources.
     * </p>
     * 
     * @param dependentResourceIds
     *        The Amazon Resource Names (ARNs) of the dependent resources.
     */

    public void setDependentResourceIds(java.util.Collection<String> dependentResourceIds) {
        if (dependentResourceIds == null) {
            this.dependentResourceIds = null;
            return;
        }

        this.dependentResourceIds = new java.util.ArrayList<String>(dependentResourceIds);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the dependent resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependentResourceIds(java.util.Collection)} or {@link #withDependentResourceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dependentResourceIds
     *        The Amazon Resource Names (ARNs) of the dependent resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DependentEntity withDependentResourceIds(String... dependentResourceIds) {
        if (this.dependentResourceIds == null) {
            setDependentResourceIds(new java.util.ArrayList<String>(dependentResourceIds.length));
        }
        for (String ele : dependentResourceIds) {
            this.dependentResourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the dependent resources.
     * </p>
     * 
     * @param dependentResourceIds
     *        The Amazon Resource Names (ARNs) of the dependent resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DependentEntity withDependentResourceIds(java.util.Collection<String> dependentResourceIds) {
        setDependentResourceIds(dependentResourceIds);
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
        if (getRelationType() != null)
            sb.append("RelationType: ").append(getRelationType()).append(",");
        if (getDependentResourceIds() != null)
            sb.append("DependentResourceIds: ").append(getDependentResourceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DependentEntity == false)
            return false;
        DependentEntity other = (DependentEntity) obj;
        if (other.getRelationType() == null ^ this.getRelationType() == null)
            return false;
        if (other.getRelationType() != null && other.getRelationType().equals(this.getRelationType()) == false)
            return false;
        if (other.getDependentResourceIds() == null ^ this.getDependentResourceIds() == null)
            return false;
        if (other.getDependentResourceIds() != null && other.getDependentResourceIds().equals(this.getDependentResourceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationType() == null) ? 0 : getRelationType().hashCode());
        hashCode = prime * hashCode + ((getDependentResourceIds() == null) ? 0 : getDependentResourceIds().hashCode());
        return hashCode;
    }

    @Override
    public DependentEntity clone() {
        try {
            return (DependentEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.DependentEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
