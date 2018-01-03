/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The association between a direct connect gateway and virtual private gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DirectConnectGatewayAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectConnectGatewayAssociation implements Serializable, Cloneable, StructuredPojo {

    private String directConnectGatewayId;

    private String virtualGatewayId;

    private String virtualGatewayRegion;
    /**
     * <p>
     * The AWS account ID of the owner of the virtual private gateway.
     * </p>
     */
    private String virtualGatewayOwnerAccount;

    private String associationState;

    private String stateChangeError;

    /**
     * @param directConnectGatewayId
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * @return
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * @param directConnectGatewayId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociation withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * @param virtualGatewayId
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * @return
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * @param virtualGatewayId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociation withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
        return this;
    }

    /**
     * @param virtualGatewayRegion
     */

    public void setVirtualGatewayRegion(String virtualGatewayRegion) {
        this.virtualGatewayRegion = virtualGatewayRegion;
    }

    /**
     * @return
     */

    public String getVirtualGatewayRegion() {
        return this.virtualGatewayRegion;
    }

    /**
     * @param virtualGatewayRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociation withVirtualGatewayRegion(String virtualGatewayRegion) {
        setVirtualGatewayRegion(virtualGatewayRegion);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the virtual private gateway.
     * </p>
     * 
     * @param virtualGatewayOwnerAccount
     *        The AWS account ID of the owner of the virtual private gateway.
     */

    public void setVirtualGatewayOwnerAccount(String virtualGatewayOwnerAccount) {
        this.virtualGatewayOwnerAccount = virtualGatewayOwnerAccount;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the virtual private gateway.
     * </p>
     * 
     * @return The AWS account ID of the owner of the virtual private gateway.
     */

    public String getVirtualGatewayOwnerAccount() {
        return this.virtualGatewayOwnerAccount;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the virtual private gateway.
     * </p>
     * 
     * @param virtualGatewayOwnerAccount
     *        The AWS account ID of the owner of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociation withVirtualGatewayOwnerAccount(String virtualGatewayOwnerAccount) {
        setVirtualGatewayOwnerAccount(virtualGatewayOwnerAccount);
        return this;
    }

    /**
     * @param associationState
     * @see DirectConnectGatewayAssociationState
     */

    public void setAssociationState(String associationState) {
        this.associationState = associationState;
    }

    /**
     * @return
     * @see DirectConnectGatewayAssociationState
     */

    public String getAssociationState() {
        return this.associationState;
    }

    /**
     * @param associationState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayAssociationState
     */

    public DirectConnectGatewayAssociation withAssociationState(String associationState) {
        setAssociationState(associationState);
        return this;
    }

    /**
     * @param associationState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayAssociationState
     */

    public DirectConnectGatewayAssociation withAssociationState(DirectConnectGatewayAssociationState associationState) {
        this.associationState = associationState.toString();
        return this;
    }

    /**
     * @param stateChangeError
     */

    public void setStateChangeError(String stateChangeError) {
        this.stateChangeError = stateChangeError;
    }

    /**
     * @return
     */

    public String getStateChangeError() {
        return this.stateChangeError;
    }

    /**
     * @param stateChangeError
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociation withStateChangeError(String stateChangeError) {
        setStateChangeError(stateChangeError);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: ").append(getVirtualGatewayId()).append(",");
        if (getVirtualGatewayRegion() != null)
            sb.append("VirtualGatewayRegion: ").append(getVirtualGatewayRegion()).append(",");
        if (getVirtualGatewayOwnerAccount() != null)
            sb.append("VirtualGatewayOwnerAccount: ").append(getVirtualGatewayOwnerAccount()).append(",");
        if (getAssociationState() != null)
            sb.append("AssociationState: ").append(getAssociationState()).append(",");
        if (getStateChangeError() != null)
            sb.append("StateChangeError: ").append(getStateChangeError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectConnectGatewayAssociation == false)
            return false;
        DirectConnectGatewayAssociation other = (DirectConnectGatewayAssociation) obj;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        if (other.getVirtualGatewayRegion() == null ^ this.getVirtualGatewayRegion() == null)
            return false;
        if (other.getVirtualGatewayRegion() != null && other.getVirtualGatewayRegion().equals(this.getVirtualGatewayRegion()) == false)
            return false;
        if (other.getVirtualGatewayOwnerAccount() == null ^ this.getVirtualGatewayOwnerAccount() == null)
            return false;
        if (other.getVirtualGatewayOwnerAccount() != null && other.getVirtualGatewayOwnerAccount().equals(this.getVirtualGatewayOwnerAccount()) == false)
            return false;
        if (other.getAssociationState() == null ^ this.getAssociationState() == null)
            return false;
        if (other.getAssociationState() != null && other.getAssociationState().equals(this.getAssociationState()) == false)
            return false;
        if (other.getStateChangeError() == null ^ this.getStateChangeError() == null)
            return false;
        if (other.getStateChangeError() != null && other.getStateChangeError().equals(this.getStateChangeError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayRegion() == null) ? 0 : getVirtualGatewayRegion().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayOwnerAccount() == null) ? 0 : getVirtualGatewayOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getAssociationState() == null) ? 0 : getAssociationState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeError() == null) ? 0 : getStateChangeError().hashCode());
        return hashCode;
    }

    @Override
    public DirectConnectGatewayAssociation clone() {
        try {
            return (DirectConnectGatewayAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.DirectConnectGatewayAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
