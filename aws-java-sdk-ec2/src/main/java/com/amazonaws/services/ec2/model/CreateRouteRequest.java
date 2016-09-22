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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateRouteRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateRoute.
 * </p>
 */
public class CreateRouteRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateRouteRequest> {

    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * The CIDR address block used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The ID of an Internet gateway or virtual private gateway attached to your VPC.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ID of a network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The ID of a VPC peering connection.
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
     * The ID of the route table for the route.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table for the route.
     */

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     * 
     * @return The ID of the route table for the route.
     */

    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * The ID of the route table for the route.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The CIDR address block used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR address block used for the destination match. Routing decisions are based on the most specific
     *        match.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR address block used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @return The CIDR address block used for the destination match. Routing decisions are based on the most specific
     *         match.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR address block used for the destination match. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR address block used for the destination match. Routing decisions are based on the most specific
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of an Internet gateway or virtual private gateway attached to your VPC.
     * </p>
     * 
     * @param gatewayId
     *        The ID of an Internet gateway or virtual private gateway attached to your VPC.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of an Internet gateway or virtual private gateway attached to your VPC.
     * </p>
     * 
     * @return The ID of an Internet gateway or virtual private gateway attached to your VPC.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of an Internet gateway or virtual private gateway attached to your VPC.
     * </p>
     * 
     * @param gatewayId
     *        The ID of an Internet gateway or virtual private gateway attached to your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     * 
     * @param instanceId
     *        The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     *        network interface is attached.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     * 
     * @return The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly
     *         one network interface is attached.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     * 
     * @param instanceId
     *        The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one
     *        network interface is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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

    public CreateRouteRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
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

    public CreateRouteRequest withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
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

    public CreateRouteRequest withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateRouteRequest> getDryRunRequest() {
        Request<CreateRouteRequest> request = new CreateRouteRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getRouteTableId() != null)
            sb.append("RouteTableId: " + getRouteTableId() + ",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getGatewayId() != null)
            sb.append("GatewayId: " + getGatewayId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() + ",");
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: " + getNatGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRouteRequest == false)
            return false;
        CreateRouteRequest other = (CreateRouteRequest) obj;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        return true;
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
        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public CreateRouteRequest clone() {
        return (CreateRouteRequest) super.clone();
    }
}
