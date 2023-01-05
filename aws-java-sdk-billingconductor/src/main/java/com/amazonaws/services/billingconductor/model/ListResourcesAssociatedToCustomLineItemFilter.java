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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter that specifies the type of resource associations that should be retrieved for a custom line item.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListResourcesAssociatedToCustomLineItemFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesAssociatedToCustomLineItemFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of relationship between the custom line item and the associated resource.
     * </p>
     */
    private String relationship;

    /**
     * <p>
     * The type of relationship between the custom line item and the associated resource.
     * </p>
     * 
     * @param relationship
     *        The type of relationship between the custom line item and the associated resource.
     * @see CustomLineItemRelationship
     */

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * <p>
     * The type of relationship between the custom line item and the associated resource.
     * </p>
     * 
     * @return The type of relationship between the custom line item and the associated resource.
     * @see CustomLineItemRelationship
     */

    public String getRelationship() {
        return this.relationship;
    }

    /**
     * <p>
     * The type of relationship between the custom line item and the associated resource.
     * </p>
     * 
     * @param relationship
     *        The type of relationship between the custom line item and the associated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomLineItemRelationship
     */

    public ListResourcesAssociatedToCustomLineItemFilter withRelationship(String relationship) {
        setRelationship(relationship);
        return this;
    }

    /**
     * <p>
     * The type of relationship between the custom line item and the associated resource.
     * </p>
     * 
     * @param relationship
     *        The type of relationship between the custom line item and the associated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomLineItemRelationship
     */

    public ListResourcesAssociatedToCustomLineItemFilter withRelationship(CustomLineItemRelationship relationship) {
        this.relationship = relationship.toString();
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
        if (getRelationship() != null)
            sb.append("Relationship: ").append(getRelationship());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesAssociatedToCustomLineItemFilter == false)
            return false;
        ListResourcesAssociatedToCustomLineItemFilter other = (ListResourcesAssociatedToCustomLineItemFilter) obj;
        if (other.getRelationship() == null ^ this.getRelationship() == null)
            return false;
        if (other.getRelationship() != null && other.getRelationship().equals(this.getRelationship()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationship() == null) ? 0 : getRelationship().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesAssociatedToCustomLineItemFilter clone() {
        try {
            return (ListResourcesAssociatedToCustomLineItemFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.ListResourcesAssociatedToCustomLineItemFilterMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
