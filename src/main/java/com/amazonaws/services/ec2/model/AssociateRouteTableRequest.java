/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#associateRouteTable(AssociateRouteTableRequest) AssociateRouteTable operation}.
 * <p>
 * Associates a subnet with a route table. The subnet and route table must be in the same VPC. This association causes traffic originating from the
 * subnet to be routed according to the routes in the route table. The action returns an association ID, which you need if you want to disassociate the
 * route table from the subnet later. A route table can be associated with multiple subnets.
 * </p>
 * <p>
 * For more information about route tables, go to <a href="http://docs.amazonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route
 * Tables </a> in the Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#associateRouteTable(AssociateRouteTableRequest)
 */
public class AssociateRouteTableRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the subnet.
     */
    private String subnetId;

    /**
     * The ID of the route table.
     */
    private String routeTableId;

    /**
     * The ID of the subnet.
     *
     * @return The ID of the subnet.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet.
     *
     * @param subnetId The ID of the subnet.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AssociateRouteTableRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    
    
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
    public AssociateRouteTableRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
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
        if (subnetId != null) sb.append("SubnetId: " + subnetId + ", ");
        if (routeTableId != null) sb.append("RouteTableId: " + routeTableId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof AssociateRouteTableRequest == false) return false;
        AssociateRouteTableRequest other = (AssociateRouteTableRequest)obj;
        
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null) return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false) return false; 
        return true;
    }
    
}
    