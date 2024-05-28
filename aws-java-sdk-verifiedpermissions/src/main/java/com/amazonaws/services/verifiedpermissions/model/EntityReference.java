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
 * Contains information about a principal or resource that can be referenced in a Cedar policy.
 * </p>
 * <p>
 * This data type is used as part of the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_PolicyFilter.html">PolicyFilter</a>
 * structure that is used as a request parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html">ListPolicies</a>
 * operation..
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/EntityReference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to indicate that a principal or resource is not specified. This can be used to search for policies that are
     * not associated with a specific principal or resource.
     * </p>
     */
    private Boolean unspecified;
    /**
     * <p>
     * The identifier of the entity. It can consist of either an EntityType and EntityId, a principal, or a resource.
     * </p>
     */
    private EntityIdentifier identifier;

    /**
     * <p>
     * Used to indicate that a principal or resource is not specified. This can be used to search for policies that are
     * not associated with a specific principal or resource.
     * </p>
     * 
     * @param unspecified
     *        Used to indicate that a principal or resource is not specified. This can be used to search for policies
     *        that are not associated with a specific principal or resource.
     */

    public void setUnspecified(Boolean unspecified) {
        this.unspecified = unspecified;
    }

    /**
     * <p>
     * Used to indicate that a principal or resource is not specified. This can be used to search for policies that are
     * not associated with a specific principal or resource.
     * </p>
     * 
     * @return Used to indicate that a principal or resource is not specified. This can be used to search for policies
     *         that are not associated with a specific principal or resource.
     */

    public Boolean getUnspecified() {
        return this.unspecified;
    }

    /**
     * <p>
     * Used to indicate that a principal or resource is not specified. This can be used to search for policies that are
     * not associated with a specific principal or resource.
     * </p>
     * 
     * @param unspecified
     *        Used to indicate that a principal or resource is not specified. This can be used to search for policies
     *        that are not associated with a specific principal or resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityReference withUnspecified(Boolean unspecified) {
        setUnspecified(unspecified);
        return this;
    }

    /**
     * <p>
     * Used to indicate that a principal or resource is not specified. This can be used to search for policies that are
     * not associated with a specific principal or resource.
     * </p>
     * 
     * @return Used to indicate that a principal or resource is not specified. This can be used to search for policies
     *         that are not associated with a specific principal or resource.
     */

    public Boolean isUnspecified() {
        return this.unspecified;
    }

    /**
     * <p>
     * The identifier of the entity. It can consist of either an EntityType and EntityId, a principal, or a resource.
     * </p>
     * 
     * @param identifier
     *        The identifier of the entity. It can consist of either an EntityType and EntityId, a principal, or a
     *        resource.
     */

    public void setIdentifier(EntityIdentifier identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the entity. It can consist of either an EntityType and EntityId, a principal, or a resource.
     * </p>
     * 
     * @return The identifier of the entity. It can consist of either an EntityType and EntityId, a principal, or a
     *         resource.
     */

    public EntityIdentifier getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the entity. It can consist of either an EntityType and EntityId, a principal, or a resource.
     * </p>
     * 
     * @param identifier
     *        The identifier of the entity. It can consist of either an EntityType and EntityId, a principal, or a
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityReference withIdentifier(EntityIdentifier identifier) {
        setIdentifier(identifier);
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
        if (getUnspecified() != null)
            sb.append("Unspecified: ").append(getUnspecified()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityReference == false)
            return false;
        EntityReference other = (EntityReference) obj;
        if (other.getUnspecified() == null ^ this.getUnspecified() == null)
            return false;
        if (other.getUnspecified() != null && other.getUnspecified().equals(this.getUnspecified()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnspecified() == null) ? 0 : getUnspecified().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public EntityReference clone() {
        try {
            return (EntityReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.EntityReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
