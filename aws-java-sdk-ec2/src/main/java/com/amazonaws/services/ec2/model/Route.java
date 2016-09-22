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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a route in a route table.
 * </p>
 */
public class Route implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR block used for the destination match.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     */
    private String destinationPrefixListId;
    /**
     * <p>
     * The ID of a gateway attached to your VPC.
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
     * The AWS account ID of the owner of the instance.
     * </p>
     */
    private String instanceOwnerId;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;
    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     */
    private String natGatewayId;
    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that the route's target isn't available (for
     * example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been terminated).
     * </p>
     */
    private String state;
    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     * </p>
     * </li>
     * </ul>
     */
    private String origin;

    /**
     * <p>
     * The CIDR block used for the destination match.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR block used for the destination match.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block used for the destination match.
     * </p>
     * 
     * @return The CIDR block used for the destination match.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block used for the destination match.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR block used for the destination match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Route withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     * 
     * @param destinationPrefixListId
     *        The prefix of the AWS service.
     */

    public void setDestinationPrefixListId(String destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
    }

    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     * 
     * @return The prefix of the AWS service.
     */

    public String getDestinationPrefixListId() {
        return this.destinationPrefixListId;
    }

    /**
     * <p>
     * The prefix of the AWS service.
     * </p>
     * 
     * @param destinationPrefixListId
     *        The prefix of the AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Route withDestinationPrefixListId(String destinationPrefixListId) {
        setDestinationPrefixListId(destinationPrefixListId);
        return this;
    }

    /**
     * <p>
     * The ID of a gateway attached to your VPC.
     * </p>
     * 
     * @param gatewayId
     *        The ID of a gateway attached to your VPC.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of a gateway attached to your VPC.
     * </p>
     * 
     * @return The ID of a gateway attached to your VPC.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of a gateway attached to your VPC.
     * </p>
     * 
     * @param gatewayId
     *        The ID of a gateway attached to your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Route withGatewayId(String gatewayId) {
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

    public Route withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * 
     * @param instanceOwnerId
     *        The AWS account ID of the owner of the instance.
     */

    public void setInstanceOwnerId(String instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * 
     * @return The AWS account ID of the owner of the instance.
     */

    public String getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * 
     * @param instanceOwnerId
     *        The AWS account ID of the owner of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Route withInstanceOwnerId(String instanceOwnerId) {
        setInstanceOwnerId(instanceOwnerId);
        return this;
    }

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

    public Route withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of the VPC peering connection.
     */

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @return The ID of the VPC peering connection.
     */

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Route withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        setVpcPeeringConnectionId(vpcPeeringConnectionId);
        return this;
    }

    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of a NAT gateway.
     */

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     * 
     * @return The ID of a NAT gateway.
     */

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * <p>
     * The ID of a NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of a NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Route withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
        return this;
    }

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that the route's target isn't available (for
     * example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been terminated).
     * </p>
     * 
     * @param state
     *        The state of the route. The <code>blackhole</code> state indicates that the route's target isn't available
     *        (for example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been
     *        terminated).
     * @see RouteState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that the route's target isn't available (for
     * example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been terminated).
     * </p>
     * 
     * @return The state of the route. The <code>blackhole</code> state indicates that the route's target isn't
     *         available (for example, the specified gateway isn't attached to the VPC, or the specified NAT instance
     *         has been terminated).
     * @see RouteState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that the route's target isn't available (for
     * example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been terminated).
     * </p>
     * 
     * @param state
     *        The state of the route. The <code>blackhole</code> state indicates that the route's target isn't available
     *        (for example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been
     *        terminated).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public Route withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that the route's target isn't available (for
     * example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been terminated).
     * </p>
     * 
     * @param state
     *        The state of the route. The <code>blackhole</code> state indicates that the route's target isn't available
     *        (for example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been
     *        terminated).
     * @see RouteState
     */

    public void setState(RouteState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the route. The <code>blackhole</code> state indicates that the route's target isn't available (for
     * example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been terminated).
     * </p>
     * 
     * @param state
     *        The state of the route. The <code>blackhole</code> state indicates that the route's target isn't available
     *        (for example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been
     *        terminated).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public Route withState(RouteState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param origin
     *        Describes how the route was created.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateRoute</code> - The route was manually added to the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     *        </p>
     *        </li>
     * @see RouteOrigin
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes how the route was created.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreateRoute</code> - The route was manually added to the route table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     *         </p>
     *         </li>
     * @see RouteOrigin
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param origin
     *        Describes how the route was created.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateRoute</code> - The route was manually added to the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteOrigin
     */

    public Route withOrigin(String origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param origin
     *        Describes how the route was created.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateRoute</code> - The route was manually added to the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     *        </p>
     *        </li>
     * @see RouteOrigin
     */

    public void setOrigin(RouteOrigin origin) {
        this.origin = origin.toString();
    }

    /**
     * <p>
     * Describes how the route was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateRoute</code> - The route was manually added to the route table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param origin
     *        Describes how the route was created.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreateRouteTable</code> - The route was automatically created when the route table was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateRoute</code> - The route was manually added to the route table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EnableVgwRoutePropagation</code> - The route was propagated by route propagation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteOrigin
     */

    public Route withOrigin(RouteOrigin origin) {
        setOrigin(origin);
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getDestinationPrefixListId() != null)
            sb.append("DestinationPrefixListId: " + getDestinationPrefixListId() + ",");
        if (getGatewayId() != null)
            sb.append("GatewayId: " + getGatewayId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceOwnerId() != null)
            sb.append("InstanceOwnerId: " + getInstanceOwnerId() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() + ",");
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: " + getNatGatewayId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getOrigin() != null)
            sb.append("Origin: " + getOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Route == false)
            return false;
        Route other = (Route) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getDestinationPrefixListId() == null ^ this.getDestinationPrefixListId() == null)
            return false;
        if (other.getDestinationPrefixListId() != null && other.getDestinationPrefixListId().equals(this.getDestinationPrefixListId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceOwnerId() == null ^ this.getInstanceOwnerId() == null)
            return false;
        if (other.getInstanceOwnerId() != null && other.getInstanceOwnerId().equals(this.getInstanceOwnerId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDestinationPrefixListId() == null) ? 0 : getDestinationPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceOwnerId() == null) ? 0 : getInstanceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        return hashCode;
    }

    @Override
    public Route clone() {
        try {
            return (Route) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
