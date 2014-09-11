/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ReplaceRouteRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#replaceRoute(ReplaceRouteRequest) ReplaceRoute operation}.
 * <p>
 * Replaces an existing route within a route table in a VPC. You must
 * provide only one of the following: Internet gateway, NAT instance, VPC
 * peering connection, or network interface.
 * </p>
 * <p>
 * For more information about route tables, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#replaceRoute(ReplaceRouteRequest)
 */
public class ReplaceRouteRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ReplaceRouteRequest> {

    /**
     * The ID of the route table.
     */
    private String routeTableId;

    /**
     * The CIDR address block used for the destination match. The value you
     * provide must match the CIDR of an existing route in the table.
     */
    private String destinationCidrBlock;

    /**
     * The ID of an Internet gateway attached to your VPC.
     */
    private String gatewayId;

    /**
     * The ID of a NAT instance in your VPC.
     */
    private String instanceId;

    /**
     * The ID of a network interface.
     */
    private String networkInterfaceId;

    /**
     * The ID of a VPC peering connection.
     */
    private String vpcPeeringConnectionId;

    /**
     * The ID of the route table.
     *
     * @return The ID of the route table.
     */
    public String getRouteTableId() {
        return routeTableId;
    }
    
    /**
     * The ID of the route table.
     *
     * @param routeTableId The ID of the route table.
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
    
    /**
     * The ID of the route table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableId The ID of the route table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReplaceRouteRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * The CIDR address block used for the destination match. The value you
     * provide must match the CIDR of an existing route in the table.
     *
     * @return The CIDR address block used for the destination match. The value you
     *         provide must match the CIDR of an existing route in the table.
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }
    
    /**
     * The CIDR address block used for the destination match. The value you
     * provide must match the CIDR of an existing route in the table.
     *
     * @param destinationCidrBlock The CIDR address block used for the destination match. The value you
     *         provide must match the CIDR of an existing route in the table.
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }
    
    /**
     * The CIDR address block used for the destination match. The value you
     * provide must match the CIDR of an existing route in the table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationCidrBlock The CIDR address block used for the destination match. The value you
     *         provide must match the CIDR of an existing route in the table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReplaceRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * The ID of an Internet gateway attached to your VPC.
     *
     * @return The ID of an Internet gateway attached to your VPC.
     */
    public String getGatewayId() {
        return gatewayId;
    }
    
    /**
     * The ID of an Internet gateway attached to your VPC.
     *
     * @param gatewayId The ID of an Internet gateway attached to your VPC.
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
    
    /**
     * The ID of an Internet gateway attached to your VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gatewayId The ID of an Internet gateway attached to your VPC.
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
     * The ID of a network interface.
     *
     * @return The ID of a network interface.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * The ID of a network interface.
     *
     * @param networkInterfaceId The ID of a network interface.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * The ID of a network interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceId The ID of a network interface.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReplaceRouteRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * The ID of a VPC peering connection.
     *
     * @return The ID of a VPC peering connection.
     */
    public String getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }
    
    /**
     * The ID of a VPC peering connection.
     *
     * @param vpcPeeringConnectionId The ID of a VPC peering connection.
     */
    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }
    
    /**
     * The ID of a VPC peering connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnectionId The ID of a VPC peering connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReplaceRouteRequest withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ReplaceRouteRequest> getDryRunRequest() {
        Request<ReplaceRouteRequest> request = new ReplaceRouteRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getRouteTableId() != null) sb.append("RouteTableId: " + getRouteTableId() + ",");
        if (getDestinationCidrBlock() != null) sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getGatewayId() != null) sb.append("GatewayId: " + getGatewayId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getVpcPeeringConnectionId() != null) sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode()); 
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReplaceRouteRequest == false) return false;
        ReplaceRouteRequest other = (ReplaceRouteRequest)obj;
        
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null) return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false) return false; 
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null) return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false) return false; 
        if (other.getGatewayId() == null ^ this.getGatewayId() == null) return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null) return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false) return false; 
        return true;
    }
    
}
    