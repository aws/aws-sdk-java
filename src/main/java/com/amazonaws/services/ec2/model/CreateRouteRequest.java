/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createRoute(CreateRouteRequest) CreateRoute operation}.
 * <p>
 * Creates a new route in a route table within a VPC. The route's target
 * can be either a gateway attached to the VPC or a NAT instance in the
 * VPC.
 * </p>
 * <p>
 * When determining how to route traffic, we use the route with the most
 * specific match. For example, let's say the traffic is destined for
 * <code>192.0.2.3</code> , and the route table includes the following
 * two routes:
 * </p>
 * 
 * <ul>
 * <li> <code>192.0.2.0/24</code> (goes to some target A) </li>
 * <li> <code>192.0.2.0/28</code> (goes to some target B) </li>
 * 
 * </ul>
 * <p>
 * Both routes apply to the traffic destined for <code>192.0.2.3</code>
 * . However, the second route in the list is more specific, so we use
 * that route to determine where to target the traffic.
 * </p>
 * <p>
 * For more information about route tables, go to <a
 * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
 * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createRoute(CreateRouteRequest)
 */
public class CreateRouteRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the route table where the route will be added.
     */
    private String routeTableId;

    /**
     * The CIDR address block used for the destination match. For example:
     * <code>0.0.0.0/0</code>. Routing decisions are based on the most
     * specific match.
     */
    private String destinationCidrBlock;

    /**
     * The ID of a VPN or Internet gateway attached to your VPC. You must
     * provide either <code>GatewayId</code> or <code>InstanceId</code>, but
     * not both.
     */
    private String gatewayId;

    /**
     * The ID of a NAT instance in your VPC. You must provide either
     * <code>GatewayId</code> or <code>InstanceId</code>, but not both.
     */
    private String instanceId;

    /**
     * The ID of the route table where the route will be added.
     *
     * @return The ID of the route table where the route will be added.
     */
    public String getRouteTableId() {
        return routeTableId;
    }
    
    /**
     * The ID of the route table where the route will be added.
     *
     * @param routeTableId The ID of the route table where the route will be added.
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
    
    /**
     * The ID of the route table where the route will be added.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableId The ID of the route table where the route will be added.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateRouteRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    
    
    /**
     * The CIDR address block used for the destination match. For example:
     * <code>0.0.0.0/0</code>. Routing decisions are based on the most
     * specific match.
     *
     * @return The CIDR address block used for the destination match. For example:
     *         <code>0.0.0.0/0</code>. Routing decisions are based on the most
     *         specific match.
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }
    
    /**
     * The CIDR address block used for the destination match. For example:
     * <code>0.0.0.0/0</code>. Routing decisions are based on the most
     * specific match.
     *
     * @param destinationCidrBlock The CIDR address block used for the destination match. For example:
     *         <code>0.0.0.0/0</code>. Routing decisions are based on the most
     *         specific match.
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }
    
    /**
     * The CIDR address block used for the destination match. For example:
     * <code>0.0.0.0/0</code>. Routing decisions are based on the most
     * specific match.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationCidrBlock The CIDR address block used for the destination match. For example:
     *         <code>0.0.0.0/0</code>. Routing decisions are based on the most
     *         specific match.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    
    
    /**
     * The ID of a VPN or Internet gateway attached to your VPC. You must
     * provide either <code>GatewayId</code> or <code>InstanceId</code>, but
     * not both.
     *
     * @return The ID of a VPN or Internet gateway attached to your VPC. You must
     *         provide either <code>GatewayId</code> or <code>InstanceId</code>, but
     *         not both.
     */
    public String getGatewayId() {
        return gatewayId;
    }
    
    /**
     * The ID of a VPN or Internet gateway attached to your VPC. You must
     * provide either <code>GatewayId</code> or <code>InstanceId</code>, but
     * not both.
     *
     * @param gatewayId The ID of a VPN or Internet gateway attached to your VPC. You must
     *         provide either <code>GatewayId</code> or <code>InstanceId</code>, but
     *         not both.
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
    
    /**
     * The ID of a VPN or Internet gateway attached to your VPC. You must
     * provide either <code>GatewayId</code> or <code>InstanceId</code>, but
     * not both.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gatewayId The ID of a VPN or Internet gateway attached to your VPC. You must
     *         provide either <code>GatewayId</code> or <code>InstanceId</code>, but
     *         not both.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateRouteRequest withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    
    
    /**
     * The ID of a NAT instance in your VPC. You must provide either
     * <code>GatewayId</code> or <code>InstanceId</code>, but not both.
     *
     * @return The ID of a NAT instance in your VPC. You must provide either
     *         <code>GatewayId</code> or <code>InstanceId</code>, but not both.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of a NAT instance in your VPC. You must provide either
     * <code>GatewayId</code> or <code>InstanceId</code>, but not both.
     *
     * @param instanceId The ID of a NAT instance in your VPC. You must provide either
     *         <code>GatewayId</code> or <code>InstanceId</code>, but not both.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of a NAT instance in your VPC. You must provide either
     * <code>GatewayId</code> or <code>InstanceId</code>, but not both.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of a NAT instance in your VPC. You must provide either
     *         <code>GatewayId</code> or <code>InstanceId</code>, but not both.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateRouteRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
        sb.append("RouteTableId: " + routeTableId + ", ");
        sb.append("DestinationCidrBlock: " + destinationCidrBlock + ", ");
        sb.append("GatewayId: " + gatewayId + ", ");
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    