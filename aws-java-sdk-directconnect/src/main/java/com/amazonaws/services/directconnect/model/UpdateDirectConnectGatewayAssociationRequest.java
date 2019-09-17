/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateDirectConnectGatewayAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDirectConnectGatewayAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway;
    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> removeAllowedPrefixesToDirectConnectGateway;

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     * 
     * @param associationId
     *        The ID of the Direct Connect gateway association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     * 
     * @return The ID of the Direct Connect gateway association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     * 
     * @param associationId
     *        The ID of the Direct Connect gateway association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectConnectGatewayAssociationRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * 
     * @return The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     */

    public java.util.List<RouteFilterPrefix> getAddAllowedPrefixesToDirectConnectGateway() {
        if (addAllowedPrefixesToDirectConnectGateway == null) {
            addAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>();
        }
        return addAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * 
     * @param addAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     */

    public void setAddAllowedPrefixesToDirectConnectGateway(java.util.Collection<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway) {
        if (addAllowedPrefixesToDirectConnectGateway == null) {
            this.addAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.addAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(addAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddAllowedPrefixesToDirectConnectGateway(java.util.Collection)} or
     * {@link #withAddAllowedPrefixesToDirectConnectGateway(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param addAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectConnectGatewayAssociationRequest withAddAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... addAllowedPrefixesToDirectConnectGateway) {
        if (this.addAllowedPrefixesToDirectConnectGateway == null) {
            setAddAllowedPrefixesToDirectConnectGateway(new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(
                    addAllowedPrefixesToDirectConnectGateway.length));
        }
        for (RouteFilterPrefix ele : addAllowedPrefixesToDirectConnectGateway) {
            this.addAllowedPrefixesToDirectConnectGateway.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * 
     * @param addAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectConnectGatewayAssociationRequest withAddAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway) {
        setAddAllowedPrefixesToDirectConnectGateway(addAllowedPrefixesToDirectConnectGateway);
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
     * </p>
     * 
     * @return The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
     */

    public java.util.List<RouteFilterPrefix> getRemoveAllowedPrefixesToDirectConnectGateway() {
        if (removeAllowedPrefixesToDirectConnectGateway == null) {
            removeAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>();
        }
        return removeAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
     * </p>
     * 
     * @param removeAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
     */

    public void setRemoveAllowedPrefixesToDirectConnectGateway(java.util.Collection<RouteFilterPrefix> removeAllowedPrefixesToDirectConnectGateway) {
        if (removeAllowedPrefixesToDirectConnectGateway == null) {
            this.removeAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.removeAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(
                removeAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveAllowedPrefixesToDirectConnectGateway(java.util.Collection)} or
     * {@link #withRemoveAllowedPrefixesToDirectConnectGateway(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param removeAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectConnectGatewayAssociationRequest withRemoveAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... removeAllowedPrefixesToDirectConnectGateway) {
        if (this.removeAllowedPrefixesToDirectConnectGateway == null) {
            setRemoveAllowedPrefixesToDirectConnectGateway(new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(
                    removeAllowedPrefixesToDirectConnectGateway.length));
        }
        for (RouteFilterPrefix ele : removeAllowedPrefixesToDirectConnectGateway) {
            this.removeAllowedPrefixesToDirectConnectGateway.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
     * </p>
     * 
     * @param removeAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectConnectGatewayAssociationRequest withRemoveAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> removeAllowedPrefixesToDirectConnectGateway) {
        setRemoveAllowedPrefixesToDirectConnectGateway(removeAllowedPrefixesToDirectConnectGateway);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getAddAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("AddAllowedPrefixesToDirectConnectGateway: ").append(getAddAllowedPrefixesToDirectConnectGateway()).append(",");
        if (getRemoveAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("RemoveAllowedPrefixesToDirectConnectGateway: ").append(getRemoveAllowedPrefixesToDirectConnectGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDirectConnectGatewayAssociationRequest == false)
            return false;
        UpdateDirectConnectGatewayAssociationRequest other = (UpdateDirectConnectGatewayAssociationRequest) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAddAllowedPrefixesToDirectConnectGateway() == null ^ this.getAddAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getAddAllowedPrefixesToDirectConnectGateway() != null
                && other.getAddAllowedPrefixesToDirectConnectGateway().equals(this.getAddAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        if (other.getRemoveAllowedPrefixesToDirectConnectGateway() == null ^ this.getRemoveAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getRemoveAllowedPrefixesToDirectConnectGateway() != null
                && other.getRemoveAllowedPrefixesToDirectConnectGateway().equals(this.getRemoveAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAddAllowedPrefixesToDirectConnectGateway() == null) ? 0 : getAddAllowedPrefixesToDirectConnectGateway().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveAllowedPrefixesToDirectConnectGateway() == null) ? 0 : getRemoveAllowedPrefixesToDirectConnectGateway().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDirectConnectGatewayAssociationRequest clone() {
        return (UpdateDirectConnectGatewayAssociationRequest) super.clone();
    }

}
