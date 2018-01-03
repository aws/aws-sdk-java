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
 * The association between a direct connect gateway and virtual interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DirectConnectGatewayAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectConnectGatewayAttachment implements Serializable, Cloneable, StructuredPojo {

    private String directConnectGatewayId;

    private String virtualInterfaceId;

    private String virtualInterfaceRegion;
    /**
     * <p>
     * The AWS account ID of the owner of the virtual interface.
     * </p>
     */
    private String virtualInterfaceOwnerAccount;

    private String attachmentState;

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

    public DirectConnectGatewayAttachment withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * @param virtualInterfaceId
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * @return
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * @param virtualInterfaceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAttachment withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * @param virtualInterfaceRegion
     */

    public void setVirtualInterfaceRegion(String virtualInterfaceRegion) {
        this.virtualInterfaceRegion = virtualInterfaceRegion;
    }

    /**
     * @return
     */

    public String getVirtualInterfaceRegion() {
        return this.virtualInterfaceRegion;
    }

    /**
     * @param virtualInterfaceRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAttachment withVirtualInterfaceRegion(String virtualInterfaceRegion) {
        setVirtualInterfaceRegion(virtualInterfaceRegion);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the virtual interface.
     * </p>
     * 
     * @param virtualInterfaceOwnerAccount
     *        The AWS account ID of the owner of the virtual interface.
     */

    public void setVirtualInterfaceOwnerAccount(String virtualInterfaceOwnerAccount) {
        this.virtualInterfaceOwnerAccount = virtualInterfaceOwnerAccount;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the virtual interface.
     * </p>
     * 
     * @return The AWS account ID of the owner of the virtual interface.
     */

    public String getVirtualInterfaceOwnerAccount() {
        return this.virtualInterfaceOwnerAccount;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the virtual interface.
     * </p>
     * 
     * @param virtualInterfaceOwnerAccount
     *        The AWS account ID of the owner of the virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAttachment withVirtualInterfaceOwnerAccount(String virtualInterfaceOwnerAccount) {
        setVirtualInterfaceOwnerAccount(virtualInterfaceOwnerAccount);
        return this;
    }

    /**
     * @param attachmentState
     * @see DirectConnectGatewayAttachmentState
     */

    public void setAttachmentState(String attachmentState) {
        this.attachmentState = attachmentState;
    }

    /**
     * @return
     * @see DirectConnectGatewayAttachmentState
     */

    public String getAttachmentState() {
        return this.attachmentState;
    }

    /**
     * @param attachmentState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayAttachmentState
     */

    public DirectConnectGatewayAttachment withAttachmentState(String attachmentState) {
        setAttachmentState(attachmentState);
        return this;
    }

    /**
     * @param attachmentState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayAttachmentState
     */

    public DirectConnectGatewayAttachment withAttachmentState(DirectConnectGatewayAttachmentState attachmentState) {
        this.attachmentState = attachmentState.toString();
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

    public DirectConnectGatewayAttachment withStateChangeError(String stateChangeError) {
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
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getVirtualInterfaceRegion() != null)
            sb.append("VirtualInterfaceRegion: ").append(getVirtualInterfaceRegion()).append(",");
        if (getVirtualInterfaceOwnerAccount() != null)
            sb.append("VirtualInterfaceOwnerAccount: ").append(getVirtualInterfaceOwnerAccount()).append(",");
        if (getAttachmentState() != null)
            sb.append("AttachmentState: ").append(getAttachmentState()).append(",");
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

        if (obj instanceof DirectConnectGatewayAttachment == false)
            return false;
        DirectConnectGatewayAttachment other = (DirectConnectGatewayAttachment) obj;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getVirtualInterfaceRegion() == null ^ this.getVirtualInterfaceRegion() == null)
            return false;
        if (other.getVirtualInterfaceRegion() != null && other.getVirtualInterfaceRegion().equals(this.getVirtualInterfaceRegion()) == false)
            return false;
        if (other.getVirtualInterfaceOwnerAccount() == null ^ this.getVirtualInterfaceOwnerAccount() == null)
            return false;
        if (other.getVirtualInterfaceOwnerAccount() != null && other.getVirtualInterfaceOwnerAccount().equals(this.getVirtualInterfaceOwnerAccount()) == false)
            return false;
        if (other.getAttachmentState() == null ^ this.getAttachmentState() == null)
            return false;
        if (other.getAttachmentState() != null && other.getAttachmentState().equals(this.getAttachmentState()) == false)
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
        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceRegion() == null) ? 0 : getVirtualInterfaceRegion().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceOwnerAccount() == null) ? 0 : getVirtualInterfaceOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getAttachmentState() == null) ? 0 : getAttachmentState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeError() == null) ? 0 : getStateChangeError().hashCode());
        return hashCode;
    }

    @Override
    public DirectConnectGatewayAttachment clone() {
        try {
            return (DirectConnectGatewayAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.DirectConnectGatewayAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
