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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociationProposal"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDirectConnectGatewayAssociationProposalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayOwnerAccount;
    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String gatewayId;
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

    public CreateDirectConnectGatewayAssociationProposalRequest withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayOwnerAccount
     *        The ID of the AWS account that owns the Direct Connect gateway.
     */

    public void setDirectConnectGatewayOwnerAccount(String directConnectGatewayOwnerAccount) {
        this.directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * 
     * @return The ID of the AWS account that owns the Direct Connect gateway.
     */

    public String getDirectConnectGatewayOwnerAccount() {
        return this.directConnectGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayOwnerAccount
     *        The ID of the AWS account that owns the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectConnectGatewayAssociationProposalRequest withDirectConnectGatewayOwnerAccount(String directConnectGatewayOwnerAccount) {
        setDirectConnectGatewayOwnerAccount(directConnectGatewayOwnerAccount);
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

    public CreateDirectConnectGatewayAssociationProposalRequest withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
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

    public CreateDirectConnectGatewayAssociationProposalRequest withAddAllowedPrefixesToDirectConnectGateway(
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

    public CreateDirectConnectGatewayAssociationProposalRequest withAddAllowedPrefixesToDirectConnectGateway(
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

    public CreateDirectConnectGatewayAssociationProposalRequest withRemoveAllowedPrefixesToDirectConnectGateway(
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

    public CreateDirectConnectGatewayAssociationProposalRequest withRemoveAllowedPrefixesToDirectConnectGateway(
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
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getDirectConnectGatewayOwnerAccount() != null)
            sb.append("DirectConnectGatewayOwnerAccount: ").append(getDirectConnectGatewayOwnerAccount()).append(",");
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
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

        if (obj instanceof CreateDirectConnectGatewayAssociationProposalRequest == false)
            return false;
        CreateDirectConnectGatewayAssociationProposalRequest other = (CreateDirectConnectGatewayAssociationProposalRequest) obj;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getDirectConnectGatewayOwnerAccount() == null ^ this.getDirectConnectGatewayOwnerAccount() == null)
            return false;
        if (other.getDirectConnectGatewayOwnerAccount() != null
                && other.getDirectConnectGatewayOwnerAccount().equals(this.getDirectConnectGatewayOwnerAccount()) == false)
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

        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getDirectConnectGatewayOwnerAccount() == null) ? 0 : getDirectConnectGatewayOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getAddAllowedPrefixesToDirectConnectGateway() == null) ? 0 : getAddAllowedPrefixesToDirectConnectGateway().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveAllowedPrefixesToDirectConnectGateway() == null) ? 0 : getRemoveAllowedPrefixesToDirectConnectGateway().hashCode());
        return hashCode;
    }

    @Override
    public CreateDirectConnectGatewayAssociationProposalRequest clone() {
        return (CreateDirectConnectGatewayAssociationProposalRequest) super.clone();
    }

}
