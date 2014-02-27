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
import com.amazonaws.services.ec2.model.transform.CreateRouteRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createRoute(CreateRouteRequest) CreateRoute operation}.
 * <p>
 * Creates a route in a route table within a VPC.
 * </p>
 * <p>
 * You must specify one of the following targets: Internet gateway, NAT
 * instance, or network interface.
 * </p>
 * <p>
 * When determining how to route traffic, we use the route with the most
 * specific match. For example, let's say the traffic is destined for
 * <code>192.0.2.3</code> , and the route table includes the following
 * two routes:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <code>192.0.2.0/24</code> (goes to some target A)
 * </p>
 * </li>
 * <li> <p>
 * <code>192.0.2.0/28</code> (goes to some target B)
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Both routes apply to the traffic destined for <code>192.0.2.3</code> .
 * However, the second route in the list covers a smaller number of IP
 * addresses and is therefore more specific, so we use that route to
 * determine where to target the traffic.
 * </p>
 * <p>
 * For more information about route tables, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createRoute(CreateRouteRequest)
 */
public class CreateRouteRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateRouteRequest> {

    /**
     * The ID of the route table for the route.
     */
    private String routeTableId;

    /**
     * The CIDR address block used for the destination match. Routing
     * decisions are based on the most specific match.
     */
    private String destinationCidrBlock;

    /**
     * The ID of an Internet gateway attached to your VPC.
     */
    private String gatewayId;

    /**
     * The ID of a NAT instance in your VPC. The operation fails if you
     * specify an instance ID unless exactly one network interface is
     * attached.
     */
    private String instanceId;

    /**
     * The ID of a network interface.
     */
    private String networkInterfaceId;

    /**
     * The ID of the route table for the route.
     *
     * @return The ID of the route table for the route.
     */
    public String getRouteTableId() {
        return routeTableId;
    }
    
    /**
     * The ID of the route table for the route.
     *
     * @param routeTableId The ID of the route table for the route.
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
    
    /**
     * The ID of the route table for the route.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableId The ID of the route table for the route.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateRouteRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * The CIDR address block used for the destination match. Routing
     * decisions are based on the most specific match.
     *
     * @return The CIDR address block used for the destination match. Routing
     *         decisions are based on the most specific match.
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }
    
    /**
     * The CIDR address block used for the destination match. Routing
     * decisions are based on the most specific match.
     *
     * @param destinationCidrBlock The CIDR address block used for the destination match. Routing
     *         decisions are based on the most specific match.
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }
    
    /**
     * The CIDR address block used for the destination match. Routing
     * decisions are based on the most specific match.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationCidrBlock The CIDR address block used for the destination match. Routing
     *         decisions are based on the most specific match.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
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
    public CreateRouteRequest withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * The ID of a NAT instance in your VPC. The operation fails if you
     * specify an instance ID unless exactly one network interface is
     * attached.
     *
     * @return The ID of a NAT instance in your VPC. The operation fails if you
     *         specify an instance ID unless exactly one network interface is
     *         attached.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of a NAT instance in your VPC. The operation fails if you
     * specify an instance ID unless exactly one network interface is
     * attached.
     *
     * @param instanceId The ID of a NAT instance in your VPC. The operation fails if you
     *         specify an instance ID unless exactly one network interface is
     *         attached.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of a NAT instance in your VPC. The operation fails if you
     * specify an instance ID unless exactly one network interface is
     * attached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of a NAT instance in your VPC. The operation fails if you
     *         specify an instance ID unless exactly one network interface is
     *         attached.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateRouteRequest withInstanceId(String instanceId) {
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
    public CreateRouteRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateRouteRequest> getDryRunRequest() {
        Request<CreateRouteRequest> request = new CreateRouteRequestMarshaller().marshall(this);
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
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() );
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateRouteRequest == false) return false;
        CreateRouteRequest other = (CreateRouteRequest)obj;
        
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
        return true;
    }
    
}
    