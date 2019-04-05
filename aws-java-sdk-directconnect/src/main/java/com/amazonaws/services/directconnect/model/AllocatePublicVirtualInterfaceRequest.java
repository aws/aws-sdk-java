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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePublicVirtualInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocatePublicVirtualInterfaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the connection on which the public virtual interface is provisioned.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The ID of the AWS account that owns the public virtual interface.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     */
    private NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation;

    /**
     * <p>
     * The ID of the connection on which the public virtual interface is provisioned.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection on which the public virtual interface is provisioned.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection on which the public virtual interface is provisioned.
     * </p>
     * 
     * @return The ID of the connection on which the public virtual interface is provisioned.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the connection on which the public virtual interface is provisioned.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection on which the public virtual interface is provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePublicVirtualInterfaceRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the public virtual interface.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the public virtual interface.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the public virtual interface.
     * </p>
     * 
     * @return The ID of the AWS account that owns the public virtual interface.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the public virtual interface.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the public virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePublicVirtualInterfaceRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     * 
     * @param newPublicVirtualInterfaceAllocation
     *        Information about the public virtual interface.
     */

    public void setNewPublicVirtualInterfaceAllocation(NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation) {
        this.newPublicVirtualInterfaceAllocation = newPublicVirtualInterfaceAllocation;
    }

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     * 
     * @return Information about the public virtual interface.
     */

    public NewPublicVirtualInterfaceAllocation getNewPublicVirtualInterfaceAllocation() {
        return this.newPublicVirtualInterfaceAllocation;
    }

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     * 
     * @param newPublicVirtualInterfaceAllocation
     *        Information about the public virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocatePublicVirtualInterfaceRequest withNewPublicVirtualInterfaceAllocation(NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation) {
        setNewPublicVirtualInterfaceAllocation(newPublicVirtualInterfaceAllocation);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getNewPublicVirtualInterfaceAllocation() != null)
            sb.append("NewPublicVirtualInterfaceAllocation: ").append(getNewPublicVirtualInterfaceAllocation());
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
