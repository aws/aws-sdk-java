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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeregisterTransitGatewayMulticastGroupSourcesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterTransitGatewayMulticastGroupSourcesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeregisterTransitGatewayMulticastGroupSourcesRequest> {

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     */
    private String transitGatewayMulticastDomainId;
    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     */
    private String groupIpAddress;
    /**
     * <p>
     * The IDs of the group sources' network interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkInterfaceIds;

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

    public DeregisterTransitGatewayMulticastGroupSourcesRequest withTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        setTransitGatewayMulticastDomainId(transitGatewayMulticastDomainId);
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

    public DeregisterTransitGatewayMulticastGroupSourcesRequest withGroupIpAddress(String groupIpAddress) {
        setGroupIpAddress(groupIpAddress);
        return this;
    }

    /**
     * <p>
     * The IDs of the group sources' network interfaces.
     * </p>
     * 
     * @return The IDs of the group sources' network interfaces.
     */

    public java.util.List<String> getNetworkInterfaceIds() {
        if (networkInterfaceIds == null) {
            networkInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkInterfaceIds;
    }

    /**
     * <p>
     * The IDs of the group sources' network interfaces.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The IDs of the group sources' network interfaces.
     */

    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>(networkInterfaceIds);
    }

    /**
     * <p>
     * The IDs of the group sources' network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaceIds(java.util.Collection)} or {@link #withNetworkInterfaceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The IDs of the group sources' network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTransitGatewayMulticastGroupSourcesRequest withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (this.networkInterfaceIds == null) {
            setNetworkInterfaceIds(new com.amazonaws.internal.SdkInternalList<String>(networkInterfaceIds.length));
        }
        for (String ele : networkInterfaceIds) {
            this.networkInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the group sources' network interfaces.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The IDs of the group sources' network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTransitGatewayMulticastGroupSourcesRequest withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeregisterTransitGatewayMulticastGroupSourcesRequest> getDryRunRequest() {
        Request<DeregisterTransitGatewayMulticastGroupSourcesRequest> request = new DeregisterTransitGatewayMulticastGroupSourcesRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getGroupIpAddress() != null)
            sb.append("GroupIpAddress: ").append(getGroupIpAddress()).append(",");
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: ").append(getNetworkInterfaceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterTransitGatewayMulticastGroupSourcesRequest == false)
            return false;
        DeregisterTransitGatewayMulticastGroupSourcesRequest other = (DeregisterTransitGatewayMulticastGroupSourcesRequest) obj;
        if (other.getTransitGatewayMulticastDomainId() == null ^ this.getTransitGatewayMulticastDomainId() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainId() != null
                && other.getTransitGatewayMulticastDomainId().equals(this.getTransitGatewayMulticastDomainId()) == false)
            return false;
        if (other.getGroupIpAddress() == null ^ this.getGroupIpAddress() == null)
            return false;
        if (other.getGroupIpAddress() != null && other.getGroupIpAddress().equals(this.getGroupIpAddress()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayMulticastDomainId() == null) ? 0 : getTransitGatewayMulticastDomainId().hashCode());
        hashCode = prime * hashCode + ((getGroupIpAddress() == null) ? 0 : getGroupIpAddress().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterTransitGatewayMulticastGroupSourcesRequest clone() {
        return (DeregisterTransitGatewayMulticastGroupSourcesRequest) super.clone();
    }
}
