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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the ReplaceRouteTableAssociation action in Amazon EC2.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/EC2ReplaceRouteTableAssociationAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2ReplaceRouteTableAssociationAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the ReplaceRouteTableAssociation action in Amazon EC2.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the association ID.
     * </p>
     */
    private ActionTarget associationId;
    /**
     * <p>
     * Information about the ID of the new route table to associate with the subnet.
     * </p>
     */
    private ActionTarget routeTableId;

    /**
     * <p>
     * A description of the ReplaceRouteTableAssociation action in Amazon EC2.
     * </p>
     * 
     * @param description
     *        A description of the ReplaceRouteTableAssociation action in Amazon EC2.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the ReplaceRouteTableAssociation action in Amazon EC2.
     * </p>
     * 
     * @return A description of the ReplaceRouteTableAssociation action in Amazon EC2.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the ReplaceRouteTableAssociation action in Amazon EC2.
     * </p>
     * 
     * @param description
     *        A description of the ReplaceRouteTableAssociation action in Amazon EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ReplaceRouteTableAssociationAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the association ID.
     * </p>
     * 
     * @param associationId
     *        Information about the association ID.
     */

    public void setAssociationId(ActionTarget associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * Information about the association ID.
     * </p>
     * 
     * @return Information about the association ID.
     */

    public ActionTarget getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * Information about the association ID.
     * </p>
     * 
     * @param associationId
     *        Information about the association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ReplaceRouteTableAssociationAction withAssociationId(ActionTarget associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * Information about the ID of the new route table to associate with the subnet.
     * </p>
     * 
     * @param routeTableId
     *        Information about the ID of the new route table to associate with the subnet.
     */

    public void setRouteTableId(ActionTarget routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * Information about the ID of the new route table to associate with the subnet.
     * </p>
     * 
     * @return Information about the ID of the new route table to associate with the subnet.
     */

    public ActionTarget getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * Information about the ID of the new route table to associate with the subnet.
     * </p>
     * 
     * @param routeTableId
     *        Information about the ID of the new route table to associate with the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ReplaceRouteTableAssociationAction withRouteTableId(ActionTarget routeTableId) {
        setRouteTableId(routeTableId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2ReplaceRouteTableAssociationAction == false)
            return false;
        EC2ReplaceRouteTableAssociationAction other = (EC2ReplaceRouteTableAssociationAction) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public EC2ReplaceRouteTableAssociationAction clone() {
        try {
            return (EC2ReplaceRouteTableAssociationAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.EC2ReplaceRouteTableAssociationActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
