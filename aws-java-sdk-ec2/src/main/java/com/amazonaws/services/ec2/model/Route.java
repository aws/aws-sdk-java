/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a route in a route table.
 * </p>
 */
public class Route implements Serializable {

    /**
     * The CIDR block used for the destination match.
     */
    private String destinationCidrBlock;

    /**
     * The ID of a gateway attached to your VPC.
     */
    private String gatewayId;

    /**
     * The ID of a NAT instance in your VPC.
     */
    private String instanceId;

    /**
     * The AWS account ID of the owner of the instance.
     */
    private String instanceOwnerId;

    /**
     * The ID of the network interface.
     */
    private String networkInterfaceId;

    /**
     * The ID of the VPC peering connection.
     */
    private String vpcPeeringConnectionId;

    /**
     * The state of the route. The <code>blackhole</code> state indicates
     * that the route's target isn't available (for example, the specified
     * gateway isn't attached to the VPC, or the specified NAT instance has
     * been terminated).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     */
    private String state;

    /**
     * Describes how the route was created. <ul>
     * <li><code>CreateRouteTable</code> indicates that route was
     * automatically created when the route table was created.</li>
     * <li><code>CreateRoute</code> indicates that the route was manually
     * added to the route table.</li>
     * <li><code>EnableVgwRoutePropagation</code> indicates that the route
     * was propagated by route propagation.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute, EnableVgwRoutePropagation
     */
    private String origin;

    /**
     * The CIDR block used for the destination match.
     *
     * @return The CIDR block used for the destination match.
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }
    
    /**
     * The CIDR block used for the destination match.
     *
     * @param destinationCidrBlock The CIDR block used for the destination match.
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }
    
    /**
     * The CIDR block used for the destination match.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationCidrBlock The CIDR block used for the destination match.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Route withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * The ID of a gateway attached to your VPC.
     *
     * @return The ID of a gateway attached to your VPC.
     */
    public String getGatewayId() {
        return gatewayId;
    }
    
    /**
     * The ID of a gateway attached to your VPC.
     *
     * @param gatewayId The ID of a gateway attached to your VPC.
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
    
    /**
     * The ID of a gateway attached to your VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gatewayId The ID of a gateway attached to your VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Route withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * The ID of a NAT instance in your VPC.
     *
     * @return The ID of a NAT instance in your VPC.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of a NAT instance in your VPC.
     *
     * @param instanceId The ID of a NAT instance in your VPC.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of a NAT instance in your VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of a NAT instance in your VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Route withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The AWS account ID of the owner of the instance.
     *
     * @return The AWS account ID of the owner of the instance.
     */
    public String getInstanceOwnerId() {
        return instanceOwnerId;
    }
    
    /**
     * The AWS account ID of the owner of the instance.
     *
     * @param instanceOwnerId The AWS account ID of the owner of the instance.
     */
    public void setInstanceOwnerId(String instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
    }
    
    /**
     * The AWS account ID of the owner of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceOwnerId The AWS account ID of the owner of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Route withInstanceOwnerId(String instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }

    /**
     * The ID of the network interface.
     *
     * @return The ID of the network interface.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * The ID of the network interface.
     *
     * @param networkInterfaceId The ID of the network interface.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * The ID of the network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceId The ID of the network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Route withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The ID of the VPC peering connection.
     *
     * @return The ID of the VPC peering connection.
     */
    public String getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }
    
    /**
     * The ID of the VPC peering connection.
     *
     * @param vpcPeeringConnectionId The ID of the VPC peering connection.
     */
    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }
    
    /**
     * The ID of the VPC peering connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnectionId The ID of the VPC peering connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Route withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
        return this;
    }

    /**
     * The state of the route. The <code>blackhole</code> state indicates
     * that the route's target isn't available (for example, the specified
     * gateway isn't attached to the VPC, or the specified NAT instance has
     * been terminated).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     *
     * @return The state of the route. The <code>blackhole</code> state indicates
     *         that the route's target isn't available (for example, the specified
     *         gateway isn't attached to the VPC, or the specified NAT instance has
     *         been terminated).
     *
     * @see RouteState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the route. The <code>blackhole</code> state indicates
     * that the route's target isn't available (for example, the specified
     * gateway isn't attached to the VPC, or the specified NAT instance has
     * been terminated).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     *
     * @param state The state of the route. The <code>blackhole</code> state indicates
     *         that the route's target isn't available (for example, the specified
     *         gateway isn't attached to the VPC, or the specified NAT instance has
     *         been terminated).
     *
     * @see RouteState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the route. The <code>blackhole</code> state indicates
     * that the route's target isn't available (for example, the specified
     * gateway isn't attached to the VPC, or the specified NAT instance has
     * been terminated).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     *
     * @param state The state of the route. The <code>blackhole</code> state indicates
     *         that the route's target isn't available (for example, the specified
     *         gateway isn't attached to the VPC, or the specified NAT instance has
     *         been terminated).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RouteState
     */
    public Route withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the route. The <code>blackhole</code> state indicates
     * that the route's target isn't available (for example, the specified
     * gateway isn't attached to the VPC, or the specified NAT instance has
     * been terminated).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     *
     * @param state The state of the route. The <code>blackhole</code> state indicates
     *         that the route's target isn't available (for example, the specified
     *         gateway isn't attached to the VPC, or the specified NAT instance has
     *         been terminated).
     *
     * @see RouteState
     */
    public void setState(RouteState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the route. The <code>blackhole</code> state indicates
     * that the route's target isn't available (for example, the specified
     * gateway isn't attached to the VPC, or the specified NAT instance has
     * been terminated).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, blackhole
     *
     * @param state The state of the route. The <code>blackhole</code> state indicates
     *         that the route's target isn't available (for example, the specified
     *         gateway isn't attached to the VPC, or the specified NAT instance has
     *         been terminated).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RouteState
     */
    public Route withState(RouteState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Describes how the route was created. <ul>
     * <li><code>CreateRouteTable</code> indicates that route was
     * automatically created when the route table was created.</li>
     * <li><code>CreateRoute</code> indicates that the route was manually
     * added to the route table.</li>
     * <li><code>EnableVgwRoutePropagation</code> indicates that the route
     * was propagated by route propagation.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute, EnableVgwRoutePropagation
     *
     * @return Describes how the route was created. <ul>
     *         <li><code>CreateRouteTable</code> indicates that route was
     *         automatically created when the route table was created.</li>
     *         <li><code>CreateRoute</code> indicates that the route was manually
     *         added to the route table.</li>
     *         <li><code>EnableVgwRoutePropagation</code> indicates that the route
     *         was propagated by route propagation.</li> </ul>
     *
     * @see RouteOrigin
     */
    public String getOrigin() {
        return origin;
    }
    
    /**
     * Describes how the route was created. <ul>
     * <li><code>CreateRouteTable</code> indicates that route was
     * automatically created when the route table was created.</li>
     * <li><code>CreateRoute</code> indicates that the route was manually
     * added to the route table.</li>
     * <li><code>EnableVgwRoutePropagation</code> indicates that the route
     * was propagated by route propagation.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute, EnableVgwRoutePropagation
     *
     * @param origin Describes how the route was created. <ul>
     *         <li><code>CreateRouteTable</code> indicates that route was
     *         automatically created when the route table was created.</li>
     *         <li><code>CreateRoute</code> indicates that the route was manually
     *         added to the route table.</li>
     *         <li><code>EnableVgwRoutePropagation</code> indicates that the route
     *         was propagated by route propagation.</li> </ul>
     *
     * @see RouteOrigin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    /**
     * Describes how the route was created. <ul>
     * <li><code>CreateRouteTable</code> indicates that route was
     * automatically created when the route table was created.</li>
     * <li><code>CreateRoute</code> indicates that the route was manually
     * added to the route table.</li>
     * <li><code>EnableVgwRoutePropagation</code> indicates that the route
     * was propagated by route propagation.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute, EnableVgwRoutePropagation
     *
     * @param origin Describes how the route was created. <ul>
     *         <li><code>CreateRouteTable</code> indicates that route was
     *         automatically created when the route table was created.</li>
     *         <li><code>CreateRoute</code> indicates that the route was manually
     *         added to the route table.</li>
     *         <li><code>EnableVgwRoutePropagation</code> indicates that the route
     *         was propagated by route propagation.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RouteOrigin
     */
    public Route withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Describes how the route was created. <ul>
     * <li><code>CreateRouteTable</code> indicates that route was
     * automatically created when the route table was created.</li>
     * <li><code>CreateRoute</code> indicates that the route was manually
     * added to the route table.</li>
     * <li><code>EnableVgwRoutePropagation</code> indicates that the route
     * was propagated by route propagation.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute, EnableVgwRoutePropagation
     *
     * @param origin Describes how the route was created. <ul>
     *         <li><code>CreateRouteTable</code> indicates that route was
     *         automatically created when the route table was created.</li>
     *         <li><code>CreateRoute</code> indicates that the route was manually
     *         added to the route table.</li>
     *         <li><code>EnableVgwRoutePropagation</code> indicates that the route
     *         was propagated by route propagation.</li> </ul>
     *
     * @see RouteOrigin
     */
    public void setOrigin(RouteOrigin origin) {
        this.origin = origin.toString();
    }
    
    /**
     * Describes how the route was created. <ul>
     * <li><code>CreateRouteTable</code> indicates that route was
     * automatically created when the route table was created.</li>
     * <li><code>CreateRoute</code> indicates that the route was manually
     * added to the route table.</li>
     * <li><code>EnableVgwRoutePropagation</code> indicates that the route
     * was propagated by route propagation.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreateRouteTable, CreateRoute, EnableVgwRoutePropagation
     *
     * @param origin Describes how the route was created. <ul>
     *         <li><code>CreateRouteTable</code> indicates that route was
     *         automatically created when the route table was created.</li>
     *         <li><code>CreateRoute</code> indicates that the route was manually
     *         added to the route table.</li>
     *         <li><code>EnableVgwRoutePropagation</code> indicates that the route
     *         was propagated by route propagation.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RouteOrigin
     */
    public Route withOrigin(RouteOrigin origin) {
        this.origin = origin.toString();
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
        if (getDestinationCidrBlock() != null) sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getGatewayId() != null) sb.append("GatewayId: " + getGatewayId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceOwnerId() != null) sb.append("InstanceOwnerId: " + getInstanceOwnerId() + ",");
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getVpcPeeringConnectionId() != null) sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getOrigin() != null) sb.append("Origin: " + getOrigin() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceOwnerId() == null) ? 0 : getInstanceOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Route == false) return false;
        Route other = (Route)obj;
        
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null) return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false) return false; 
        if (other.getGatewayId() == null ^ this.getGatewayId() == null) return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getInstanceOwnerId() == null ^ this.getInstanceOwnerId() == null) return false;
        if (other.getInstanceOwnerId() != null && other.getInstanceOwnerId().equals(this.getInstanceOwnerId()) == false) return false; 
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null) return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getOrigin() == null ^ this.getOrigin() == null) return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false) return false; 
        return true;
    }
    
}
    