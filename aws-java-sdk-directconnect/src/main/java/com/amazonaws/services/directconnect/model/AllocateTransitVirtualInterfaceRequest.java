/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateTransitVirtualInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateTransitVirtualInterfaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the connection on which the transit virtual interface is provisioned.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The ID of the AWS account that owns the transit virtual interface.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     */
    private NewTransitVirtualInterfaceAllocation newTransitVirtualInterfaceAllocation;

    /**
     * <p>
     * The ID of the connection on which the transit virtual interface is provisioned.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection on which the transit virtual interface is provisioned.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection on which the transit virtual interface is provisioned.
     * </p>
     * 
     * @return The ID of the connection on which the transit virtual interface is provisioned.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the connection on which the transit virtual interface is provisioned.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection on which the transit virtual interface is provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateTransitVirtualInterfaceRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit virtual interface.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the transit virtual interface.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit virtual interface.
     * </p>
     * 
     * @return The ID of the AWS account that owns the transit virtual interface.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit virtual interface.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the transit virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateTransitVirtualInterfaceRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     * 
     * @param newTransitVirtualInterfaceAllocation
     *        Information about the transit virtual interface.
     */

    public void setNewTransitVirtualInterfaceAllocation(NewTransitVirtualInterfaceAllocation newTransitVirtualInterfaceAllocation) {
        this.newTransitVirtualInterfaceAllocation = newTransitVirtualInterfaceAllocation;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     * 
     * @return Information about the transit virtual interface.
     */

    public NewTransitVirtualInterfaceAllocation getNewTransitVirtualInterfaceAllocation() {
        return this.newTransitVirtualInterfaceAllocation;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     * 
     * @param newTransitVirtualInterfaceAllocation
     *        Information about the transit virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateTransitVirtualInterfaceRequest withNewTransitVirtualInterfaceAllocation(
            NewTransitVirtualInterfaceAllocation newTransitVirtualInterfaceAllocation) {
        setNewTransitVirtualInterfaceAllocation(newTransitVirtualInterfaceAllocation);
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
        if (getNewTransitVirtualInterfaceAllocation() != null)
            sb.append("NewTransitVirtualInterfaceAllocation: ").append(getNewTransitVirtualInterfaceAllocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateTransitVirtualInterfaceRequest == false)
            return false;
        AllocateTransitVirtualInterfaceRequest other = (AllocateTransitVirtualInterfaceRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getNewTransitVirtualInterfaceAllocation() == null ^ this.getNewTransitVirtualInterfaceAllocation() == null)
            return false;
        if (other.getNewTransitVirtualInterfaceAllocation() != null
                && other.getNewTransitVirtualInterfaceAllocation().equals(this.getNewTransitVirtualInterfaceAllocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getNewTransitVirtualInterfaceAllocation() == null) ? 0 : getNewTransitVirtualInterfaceAllocation().hashCode());
        return hashCode;
    }

    @Override
    public AllocateTransitVirtualInterfaceRequest clone() {
        return (AllocateTransitVirtualInterfaceRequest) super.clone();
    }

}
