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

/**
 * <p>
 * Describes the members registered with the transit gateway multicast group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayMulticastRegisteredGroupSources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayMulticastRegisteredGroupSources implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     */
    private String transitGatewayMulticastDomainId;
    /**
     * <p>
     * The IDs of the network interfaces members registered with the transit gateway multicast group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> registeredNetworkInterfaceIds;
    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     */
    private String groupIpAddress;

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomainId
     *        The ID of the transit gateway multicast domain.
     */

    public void setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @return The ID of the transit gateway multicast domain.
     */

    public String getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomainId
     *        The ID of the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastRegisteredGroupSources withTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        setTransitGatewayMulticastDomainId(transitGatewayMulticastDomainId);
        return this;
    }

    /**
     * <p>
     * The IDs of the network interfaces members registered with the transit gateway multicast group.
     * </p>
     * 
     * @return The IDs of the network interfaces members registered with the transit gateway multicast group.
     */

    public java.util.List<String> getRegisteredNetworkInterfaceIds() {
        if (registeredNetworkInterfaceIds == null) {
            registeredNetworkInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return registeredNetworkInterfaceIds;
    }

    /**
     * <p>
     * The IDs of the network interfaces members registered with the transit gateway multicast group.
     * </p>
     * 
     * @param registeredNetworkInterfaceIds
     *        The IDs of the network interfaces members registered with the transit gateway multicast group.
     */

    public void setRegisteredNetworkInterfaceIds(java.util.Collection<String> registeredNetworkInterfaceIds) {
        if (registeredNetworkInterfaceIds == null) {
            this.registeredNetworkInterfaceIds = null;
            return;
        }

        this.registeredNetworkInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>(registeredNetworkInterfaceIds);
    }

    /**
     * <p>
     * The IDs of the network interfaces members registered with the transit gateway multicast group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegisteredNetworkInterfaceIds(java.util.Collection)} or
     * {@link #withRegisteredNetworkInterfaceIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param registeredNetworkInterfaceIds
     *        The IDs of the network interfaces members registered with the transit gateway multicast group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastRegisteredGroupSources withRegisteredNetworkInterfaceIds(String... registeredNetworkInterfaceIds) {
        if (this.registeredNetworkInterfaceIds == null) {
            setRegisteredNetworkInterfaceIds(new com.amazonaws.internal.SdkInternalList<String>(registeredNetworkInterfaceIds.length));
        }
        for (String ele : registeredNetworkInterfaceIds) {
            this.registeredNetworkInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the network interfaces members registered with the transit gateway multicast group.
     * </p>
     * 
     * @param registeredNetworkInterfaceIds
     *        The IDs of the network interfaces members registered with the transit gateway multicast group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastRegisteredGroupSources withRegisteredNetworkInterfaceIds(java.util.Collection<String> registeredNetworkInterfaceIds) {
        setRegisteredNetworkInterfaceIds(registeredNetworkInterfaceIds);
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     * 
     * @param groupIpAddress
     *        The IP address assigned to the transit gateway multicast group.
     */

    public void setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     * 
     * @return The IP address assigned to the transit gateway multicast group.
     */

    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     * 
     * @param groupIpAddress
     *        The IP address assigned to the transit gateway multicast group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastRegisteredGroupSources withGroupIpAddress(String groupIpAddress) {
        setGroupIpAddress(groupIpAddress);
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
        if (getTransitGatewayMulticastDomainId() != null)
            sb.append("TransitGatewayMulticastDomainId: ").append(getTransitGatewayMulticastDomainId()).append(",");
        if (getRegisteredNetworkInterfaceIds() != null)
            sb.append("RegisteredNetworkInterfaceIds: ").append(getRegisteredNetworkInterfaceIds()).append(",");
        if (getGroupIpAddress() != null)
            sb.append("GroupIpAddress: ").append(getGroupIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayMulticastRegisteredGroupSources == false)
            return false;
        TransitGatewayMulticastRegisteredGroupSources other = (TransitGatewayMulticastRegisteredGroupSources) obj;
        if (other.getTransitGatewayMulticastDomainId() == null ^ this.getTransitGatewayMulticastDomainId() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainId() != null
                && other.getTransitGatewayMulticastDomainId().equals(this.getTransitGatewayMulticastDomainId()) == false)
            return false;
        if (other.getRegisteredNetworkInterfaceIds() == null ^ this.getRegisteredNetworkInterfaceIds() == null)
            return false;
        if (other.getRegisteredNetworkInterfaceIds() != null
                && other.getRegisteredNetworkInterfaceIds().equals(this.getRegisteredNetworkInterfaceIds()) == false)
            return false;
        if (other.getGroupIpAddress() == null ^ this.getGroupIpAddress() == null)
            return false;
        if (other.getGroupIpAddress() != null && other.getGroupIpAddress().equals(this.getGroupIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayMulticastDomainId() == null) ? 0 : getTransitGatewayMulticastDomainId().hashCode());
        hashCode = prime * hashCode + ((getRegisteredNetworkInterfaceIds() == null) ? 0 : getRegisteredNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getGroupIpAddress() == null) ? 0 : getGroupIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayMulticastRegisteredGroupSources clone() {
        try {
            return (TransitGatewayMulticastRegisteredGroupSources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
