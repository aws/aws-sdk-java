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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDirectConnectGatewayAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway;
    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String virtualGatewayId;

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @return The ID of the Direct Connect gateway.
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectConnectGatewayAssociationRequest withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the virtual private gateway.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @return The ID of the virtual private gateway.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectConnectGatewayAssociationRequest withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * </p>
     * 
     * @return The Amazon VPC prefixes to advertise to the Direct Connect gateway
     */

    public java.util.List<RouteFilterPrefix> getAddAllowedPrefixesToDirectConnectGateway() {
        if (addAllowedPrefixesToDirectConnectGateway == null) {
            addAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>();
        }
        return addAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * </p>
     * 
     * @param addAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to advertise to the Direct Connect gateway
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
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddAllowedPrefixesToDirectConnectGateway(java.util.Collection)} or
     * {@link #withAddAllowedPrefixesToDirectConnectGateway(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param addAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectConnectGatewayAssociationRequest withAddAllowedPrefixesToDirectConnectGateway(
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
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * </p>
     * 
     * @param addAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectConnectGatewayAssociationRequest withAddAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway) {
        setAddAllowedPrefixesToDirectConnectGateway(addAllowedPrefixesToDirectConnectGateway);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway.
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @return The ID of the virtual private gateway.
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectConnectGatewayAssociationRequest withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
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
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getAddAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("AddAllowedPrefixesToDirectConnectGateway: ").append(getAddAllowedPrefixesToDirectConnectGateway()).append(",");
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: ").append(getVirtualGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDirectConnectGatewayAssociationRequest == false)
            return false;
        CreateDirectConnectGatewayAssociationRequest other = (CreateDirectConnectGatewayAssociationRequest) obj;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getAddAllowedPrefixesToDirectConnectGateway() == null ^ this.getAddAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getAddAllowedPrefixesToDirectConnectGateway() != null
                && other.getAddAllowedPrefixesToDirectConnectGateway().equals(this.getAddAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getAddAllowedPrefixesToDirectConnectGateway() == null) ? 0 : getAddAllowedPrefixesToDirectConnectGateway().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDirectConnectGatewayAssociationRequest clone() {
        return (CreateDirectConnectGatewayAssociationRequest) super.clone();
    }

}
