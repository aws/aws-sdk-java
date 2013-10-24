/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#allocatePublicVirtualInterface(AllocatePublicVirtualInterfaceRequest) AllocatePublicVirtualInterface operation}.
 * <p>
 * Provisions a public virtual interface to be owned by a different customer.
 * </p>
 * <p>
 * The owner of a connection calls this function to provision a public virtual interface which will be owned by another AWS customer.
 * </p>
 * <p>
 * Virtual interfaces created using this function must be confirmed by the virtual interface owner by calling ConfirmPublicVirtualInterface. Until this
 * step has been completed, the virtual interface will be in 'Confirming' state, and will not be available for handling traffic.
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#allocatePublicVirtualInterface(AllocatePublicVirtualInterfaceRequest)
 */
public class AllocatePublicVirtualInterfaceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The connection ID on which the public virtual interface is
     * provisioned. <p>Default: None
     */
    private String connectionId;

    /**
     * The AWS account that will own the new public virtual interface.
     * <p>Default: None
     */
    private String ownerAccount;

    /**
     * Detailed information for the public virtual interface to be
     * provisioned. <p>Default: None
     */
    private NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation;

    /**
     * The connection ID on which the public virtual interface is
     * provisioned. <p>Default: None
     *
     * @return The connection ID on which the public virtual interface is
     *         provisioned. <p>Default: None
     */
    public String getConnectionId() {
        return connectionId;
    }
    
    /**
     * The connection ID on which the public virtual interface is
     * provisioned. <p>Default: None
     *
     * @param connectionId The connection ID on which the public virtual interface is
     *         provisioned. <p>Default: None
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
    
    /**
     * The connection ID on which the public virtual interface is
     * provisioned. <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionId The connection ID on which the public virtual interface is
     *         provisioned. <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AllocatePublicVirtualInterfaceRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * The AWS account that will own the new public virtual interface.
     * <p>Default: None
     *
     * @return The AWS account that will own the new public virtual interface.
     *         <p>Default: None
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }
    
    /**
     * The AWS account that will own the new public virtual interface.
     * <p>Default: None
     *
     * @param ownerAccount The AWS account that will own the new public virtual interface.
     *         <p>Default: None
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }
    
    /**
     * The AWS account that will own the new public virtual interface.
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerAccount The AWS account that will own the new public virtual interface.
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AllocatePublicVirtualInterfaceRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * Detailed information for the public virtual interface to be
     * provisioned. <p>Default: None
     *
     * @return Detailed information for the public virtual interface to be
     *         provisioned. <p>Default: None
     */
    public NewPublicVirtualInterfaceAllocation getNewPublicVirtualInterfaceAllocation() {
        return newPublicVirtualInterfaceAllocation;
    }
    
    /**
     * Detailed information for the public virtual interface to be
     * provisioned. <p>Default: None
     *
     * @param newPublicVirtualInterfaceAllocation Detailed information for the public virtual interface to be
     *         provisioned. <p>Default: None
     */
    public void setNewPublicVirtualInterfaceAllocation(NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation) {
        this.newPublicVirtualInterfaceAllocation = newPublicVirtualInterfaceAllocation;
    }
    
    /**
     * Detailed information for the public virtual interface to be
     * provisioned. <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newPublicVirtualInterfaceAllocation Detailed information for the public virtual interface to be
     *         provisioned. <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AllocatePublicVirtualInterfaceRequest withNewPublicVirtualInterfaceAllocation(NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation) {
        this.newPublicVirtualInterfaceAllocation = newPublicVirtualInterfaceAllocation;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConnectionId() != null) sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getOwnerAccount() != null) sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getNewPublicVirtualInterfaceAllocation() != null) sb.append("NewPublicVirtualInterfaceAllocation: " + getNewPublicVirtualInterfaceAllocation() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode()); 
        hashCode = prime * hashCode + ((getNewPublicVirtualInterfaceAllocation() == null) ? 0 : getNewPublicVirtualInterfaceAllocation().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AllocatePublicVirtualInterfaceRequest == false) return false;
        AllocatePublicVirtualInterfaceRequest other = (AllocatePublicVirtualInterfaceRequest)obj;
        
        if (other.getConnectionId() == null ^ this.getConnectionId() == null) return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false) return false; 
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null) return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false) return false; 
        if (other.getNewPublicVirtualInterfaceAllocation() == null ^ this.getNewPublicVirtualInterfaceAllocation() == null) return false;
        if (other.getNewPublicVirtualInterfaceAllocation() != null && other.getNewPublicVirtualInterfaceAllocation().equals(this.getNewPublicVirtualInterfaceAllocation()) == false) return false; 
        return true;
    }
    
}
    