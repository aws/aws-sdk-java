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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ReplaceRouteRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceRouteRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ReplaceRouteRequest> {

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. The value that you provide must match the CIDR of an
     * existing route in the table.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The IPv6 CIDR address block used for the destination match. The value that you provide must match the CIDR of an
     * existing route in the table.
     * </p>
     */
    private String destinationIpv6CidrBlock;
    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     */
    private String egressOnlyInternetGatewayId;
    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The ID of a NAT instance in your VPC.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     */
    private String natGatewayId;
    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The ID of a network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. The value that you provide must match the CIDR of an
     * existing route in the table.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The IPv4 CIDR address block used for the destination match. The value that you provide must match the CIDR
     *        of an existing route in the table.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. The value that you provide must match the CIDR of an
     * existing route in the table.
     * </p>
     * 
     * @return The IPv4 CIDR address block used for the destination match. The value that you provide must match the
     *         CIDR of an existing route in the table.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR address block used for the destination match. The value that you provide must match the CIDR of an
     * existing route in the table.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The IPv4 CIDR address block used for the destination match. The value that you provide must match the CIDR
     *        of an existing route in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR address block used for the destination match. The value that you provide must match the CIDR of an
     * existing route in the table.
     * </p>
     * 
     * @param destinationIpv6CidrBlock
     *        The IPv6 CIDR address block used for the destination match. The value that you provide must match the CIDR
     *        of an existing route in the table.
     */

    public void setDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        this.destinationIpv6CidrBlock = destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR address block used for the destination match. The value that you provide must match the CIDR of an
     * existing route in the table.
     * </p>
     * 
     * @return The IPv6 CIDR address block used for the destination match. The value that you provide must match the
     *         CIDR of an existing route in the table.
     */

    public String getDestinationIpv6CidrBlock() {
        return this.destinationIpv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR address block used for the destination match. The value that you provide must match the CIDR of an
     * existing route in the table.
     * </p>
     * 
     * @param destinationIpv6CidrBlock
     *        The IPv6 CIDR address block used for the destination match. The value that you provide must match the CIDR
     *        of an existing route in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteRequest withDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
        setDestinationIpv6CidrBlock(destinationIpv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGatewayId
     *        [IPv6 traffic only] The ID of an egress-only internet gateway.
     */

    public void setEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     * 
     * @return [IPv6 traffic only] The ID of an egress-only internet gateway.
     */

    public String getEgressOnlyInternetGatewayId() {
        return this.egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGatewayId
     *        [IPv6 traffic only] The ID of an egress-only internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteRequest withEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        setEgressOnlyInternetGatewayId(egressOnlyInternetGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway.
     * </p>
     * 
     * @param gatewayId
     *        The ID of an internet gateway or virtual private gateway.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway.
     * </p>
     * 
     * @return The ID of an internet gateway or virtual private gateway.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of an internet gateway or virtual private gateway.
     * </p>
     * 
     * @param gatewayId
     *        The ID of an internet gateway or virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteRequest withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC.
     * </p>
     * 
     * @param instanceId
     *        The ID of a NAT instance in your VPC.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC.
     * </p>
     * 
     * @return The ID of a NAT instance in your VPC.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC.
     * </p>
     * 
     * @param instanceId
     *        The ID of a NAT instance in your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        [IPv4 traffic only] The ID of a NAT gateway.
     */

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     * 
     * @return [IPv4 traffic only] The ID of a NAT gateway.
     */

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * <p>
     * [IPv4 traffic only] The ID of a NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        [IPv4 traffic only] The ID of a NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteRequest withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of a transit gateway.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     * 
     * @return The ID of a transit gateway.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of a transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of a transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteRequest withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of a network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     * 
     * @return The ID of a network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of a network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of a network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table.
     */

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @return The ID of the route table.
     */

    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteRequest withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of a VPC peering connection.
     */

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     * 
     * @return The ID of a VPC peering connection.
     */

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of a VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of a VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteRequest withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        setVpcPeeringConnectionId(vpcPeeringConnectionId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ReplaceRouteRequest> getDryRunRequest() {
        Request<ReplaceRouteRequest> request = new ReplaceRouteRequestMarshaller().marshall(this);
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getDestinationIpv6CidrBlock() != null)
            sb.append("DestinationIpv6CidrBlock: ").append(getDestinationIpv6CidrBlock()).append(",");
        if (getEgressOnlyInternetGatewayId() != null)
            sb.append("EgressOnlyInternetGatewayId: ").append(getEgressOnlyInternetGatewayId()).append(",");
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: ").append(getNatGatewayId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: ").append(getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceRouteRequest == false)
            return false;
        ReplaceRouteRequest other = (ReplaceRouteRequest) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getDestinationIpv6CidrBlock() == null ^ this.getDestinationIpv6CidrBlock() == null)
            return false;
        if (other.getDestinationIpv6CidrBlock() != null && other.getDestinationIpv6CidrBlock().equals(this.getDestinationIpv6CidrBlock()) == false)
            return false;
        if (other.getEgressOnlyInternetGatewayId() == null ^ this.getEgressOnlyInternetGatewayId() == null)
            return false;
        if (other.getEgressOnlyInternetGatewayId() != null && other.getEgressOnlyInternetGatewayId().equals(this.getEgressOnlyInternetGatewayId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDestinationIpv6CidrBlock() == null) ? 0 : getDestinationIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getEgressOnlyInternetGatewayId() == null) ? 0 : getEgressOnlyInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceRouteRequest clone() {
        return (ReplaceRouteRequest) super.clone();
    }
}
