/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the AllocatePublicVirtualInterface operation.
 * </p>
 */
public class AllocatePublicVirtualInterfaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The connection ID on which the public virtual interface is provisioned.
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The AWS account that will own the new public virtual interface.
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * Detailed information for the public virtual interface to be provisioned.
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation;

    /**
     * <p>
     * The connection ID on which the public virtual interface is provisioned.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionId
     *        The connection ID on which the public virtual interface is provisioned.</p>
     *        <p>
     *        Default: None
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The connection ID on which the public virtual interface is provisioned.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The connection ID on which the public virtual interface is provisioned.</p>
     *         <p>
     *         Default: None
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The connection ID on which the public virtual interface is provisioned.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionId
     *        The connection ID on which the public virtual interface is provisioned.</p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePublicVirtualInterfaceRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The AWS account that will own the new public virtual interface.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param ownerAccount
     *        The AWS account that will own the new public virtual interface.</p>
     *        <p>
     *        Default: None
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The AWS account that will own the new public virtual interface.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The AWS account that will own the new public virtual interface.</p>
     *         <p>
     *         Default: None
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The AWS account that will own the new public virtual interface.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param ownerAccount
     *        The AWS account that will own the new public virtual interface.</p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePublicVirtualInterfaceRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * Detailed information for the public virtual interface to be provisioned.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param newPublicVirtualInterfaceAllocation
     *        Detailed information for the public virtual interface to be provisioned.</p>
     *        <p>
     *        Default: None
     */

    public void setNewPublicVirtualInterfaceAllocation(NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation) {
        this.newPublicVirtualInterfaceAllocation = newPublicVirtualInterfaceAllocation;
    }

    /**
     * <p>
     * Detailed information for the public virtual interface to be provisioned.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return Detailed information for the public virtual interface to be provisioned.</p>
     *         <p>
     *         Default: None
     */

    public NewPublicVirtualInterfaceAllocation getNewPublicVirtualInterfaceAllocation() {
        return this.newPublicVirtualInterfaceAllocation;
    }

    /**
     * <p>
     * Detailed information for the public virtual interface to be provisioned.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param newPublicVirtualInterfaceAllocation
     *        Detailed information for the public virtual interface to be provisioned.</p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePublicVirtualInterfaceRequest withNewPublicVirtualInterfaceAllocation(NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation) {
        setNewPublicVirtualInterfaceAllocation(newPublicVirtualInterfaceAllocation);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getNewPublicVirtualInterfaceAllocation() != null)
            sb.append("NewPublicVirtualInterfaceAllocation: " + getNewPublicVirtualInterfaceAllocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocatePublicVirtualInterfaceRequest == false)
            return false;
        AllocatePublicVirtualInterfaceRequest other = (AllocatePublicVirtualInterfaceRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getNewPublicVirtualInterfaceAllocation() == null ^ this.getNewPublicVirtualInterfaceAllocation() == null)
            return false;
        if (other.getNewPublicVirtualInterfaceAllocation() != null
                && other.getNewPublicVirtualInterfaceAllocation().equals(this.getNewPublicVirtualInterfaceAllocation()) == false)
            return false;
        return true;
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
    public AllocatePublicVirtualInterfaceRequest clone() {
        return (AllocatePublicVirtualInterfaceRequest) super.clone();
    }
}
