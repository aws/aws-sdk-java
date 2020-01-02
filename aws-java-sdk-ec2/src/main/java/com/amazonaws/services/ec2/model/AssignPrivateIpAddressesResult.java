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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignPrivateIpAddressesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The private IP addresses assigned to the network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AssignedPrivateIpAddress> assignedPrivateIpAddresses;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateIpAddressesResult withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The private IP addresses assigned to the network interface.
     * </p>
     * 
     * @return The private IP addresses assigned to the network interface.
     */

    public java.util.List<AssignedPrivateIpAddress> getAssignedPrivateIpAddresses() {
        if (assignedPrivateIpAddresses == null) {
            assignedPrivateIpAddresses = new com.amazonaws.internal.SdkInternalList<AssignedPrivateIpAddress>();
        }
        return assignedPrivateIpAddresses;
    }

    /**
     * <p>
     * The private IP addresses assigned to the network interface.
     * </p>
     * 
     * @param assignedPrivateIpAddresses
     *        The private IP addresses assigned to the network interface.
     */

    public void setAssignedPrivateIpAddresses(java.util.Collection<AssignedPrivateIpAddress> assignedPrivateIpAddresses) {
        if (assignedPrivateIpAddresses == null) {
            this.assignedPrivateIpAddresses = null;
            return;
        }

        this.assignedPrivateIpAddresses = new com.amazonaws.internal.SdkInternalList<AssignedPrivateIpAddress>(assignedPrivateIpAddresses);
    }

    /**
     * <p>
     * The private IP addresses assigned to the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssignedPrivateIpAddresses(java.util.Collection)} or
     * {@link #withAssignedPrivateIpAddresses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assignedPrivateIpAddresses
     *        The private IP addresses assigned to the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateIpAddressesResult withAssignedPrivateIpAddresses(AssignedPrivateIpAddress... assignedPrivateIpAddresses) {
        if (this.assignedPrivateIpAddresses == null) {
            setAssignedPrivateIpAddresses(new com.amazonaws.internal.SdkInternalList<AssignedPrivateIpAddress>(assignedPrivateIpAddresses.length));
        }
        for (AssignedPrivateIpAddress ele : assignedPrivateIpAddresses) {
            this.assignedPrivateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The private IP addresses assigned to the network interface.
     * </p>
     * 
     * @param assignedPrivateIpAddresses
     *        The private IP addresses assigned to the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateIpAddressesResult withAssignedPrivateIpAddresses(java.util.Collection<AssignedPrivateIpAddress> assignedPrivateIpAddresses) {
        setAssignedPrivateIpAddresses(assignedPrivateIpAddresses);
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getAssignedPrivateIpAddresses() != null)
            sb.append("AssignedPrivateIpAddresses: ").append(getAssignedPrivateIpAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignPrivateIpAddressesResult == false)
            return false;
        AssignPrivateIpAddressesResult other = (AssignPrivateIpAddressesResult) obj;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getAssignedPrivateIpAddresses() == null ^ this.getAssignedPrivateIpAddresses() == null)
            return false;
        if (other.getAssignedPrivateIpAddresses() != null && other.getAssignedPrivateIpAddresses().equals(this.getAssignedPrivateIpAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getAssignedPrivateIpAddresses() == null) ? 0 : getAssignedPrivateIpAddresses().hashCode());
        return hashCode;
    }

    @Override
    public AssignPrivateIpAddressesResult clone() {
        try {
            return (AssignPrivateIpAddressesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
