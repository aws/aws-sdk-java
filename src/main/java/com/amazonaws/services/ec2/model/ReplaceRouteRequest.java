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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#replaceRoute(ReplaceRouteRequest) ReplaceRoute operation}.
 * <p>
 * Replaces an existing route within a route table in a VPC. For more
 * information about route tables, go to <a
 * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
 * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#replaceRoute(ReplaceRouteRequest)
 */
public class ReplaceRouteRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the route table where the route will be replaced.
     */
    private String routeTableId;

    /**
     * The CIDR address block used for the destination match. For example:
     * <code>0.0.0.0/0</code>. The value you provide must match the CIDR of
     * an existing route in the table.
     */
    private String destinationCidrBlock;

    /**
     * The ID of a VPN or Internet gateway attached to your VPC.
     */
    private String gatewayId;

    /**
     * The ID of a NAT instance in your VPC.
     */
    private String instanceId;

    /**
     * The ID of the route table where the route will be replaced.
     *
     * @return The ID of the route table where the route will be replaced.
     */
    public String getRouteTableId() {
        return routeTableId;
    }
    
    /**
     * The ID of the route table where the route will be replaced.
     *
     * @param routeTableId The ID of the route table where the route will be replaced.
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
    
    /**
     * The ID of the route table where the route will be replaced.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableId The ID of the route table where the route will be replaced.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReplaceRouteRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    
    
    /**
     * The CIDR address block used for the destination match. For example:
     * <code>0.0.0.0/0</code>. The value you provide must match the CIDR of
     * an existing route in the table.
     *
     * @return The CIDR address block used for the destination match. For example:
     *         <code>0.0.0.0/0</code>. The value you provide must match the CIDR of
     *         an existing route in the table.
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }
    
    /**
     * The CIDR address block used for the destination match. For example:
     * <code>0.0.0.0/0</code>. The value you provide must match the CIDR of
     * an existing route in the table.
     *
     * @param destinationCidrBlock The CIDR address block used for the destination match. For example:
     *         <code>0.0.0.0/0</code>. The value you provide must match the CIDR of
     *         an existing route in the table.
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }
    
    /**
     * The CIDR address block used for the destination match. For example:
     * <code>0.0.0.0/0</code>. The value you provide must match the CIDR of
     * an existing route in the table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationCidrBlock The CIDR address block used for the destination match. For example:
     *         <code>0.0.0.0/0</code>. The value you provide must match the CIDR of
     *         an existing route in the table.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReplaceRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    
    
    /**
     * The ID of a VPN or Internet gateway attached to your VPC.
     *
     * @return The ID of a VPN or Internet gateway attached to your VPC.
     */
    public String getGatewayId() {
        return gatewayId;
    }
    
    /**
     * The ID of a VPN or Internet gateway attached to your VPC.
     *
     * @param gatewayId The ID of a VPN or Internet gateway attached to your VPC.
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
    
    /**
     * The ID of a VPN or Internet gateway attached to your VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gatewayId The ID of a VPN or Internet gateway attached to your VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReplaceRouteRequest withGatewayId(String gatewayId) {
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
    public ReplaceRouteRequest withInstanceId(String instanceId) {
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
    