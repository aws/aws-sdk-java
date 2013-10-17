/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DeleteRouteRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteRoute(DeleteRouteRequest) DeleteRoute operation}.
 * <p>
 * Deletes a route from a route table in a VPC. For more information about route tables, go to <a
 * href="http://docs.amazonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a> in the Amazon Virtual Private Cloud User
 * Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteRoute(DeleteRouteRequest)
 */
public class DeleteRouteRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteRouteRequest> {

    /**
     * The ID of the route table where the route will be deleted.
     */
    private String routeTableId;

    /**
     * The CIDR range for the route you want to delete. The value you specify
     * must exactly match the CIDR for the route you want to delete.
     */
    private String destinationCidrBlock;

    /**
     * The ID of the route table where the route will be deleted.
     *
     * @return The ID of the route table where the route will be deleted.
     */
    public String getRouteTableId() {
        return routeTableId;
    }
    
    /**
     * The ID of the route table where the route will be deleted.
     *
     * @param routeTableId The ID of the route table where the route will be deleted.
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
    
    /**
     * The ID of the route table where the route will be deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableId The ID of the route table where the route will be deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteRouteRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * The CIDR range for the route you want to delete. The value you specify
     * must exactly match the CIDR for the route you want to delete.
     *
     * @return The CIDR range for the route you want to delete. The value you specify
     *         must exactly match the CIDR for the route you want to delete.
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }
    
    /**
     * The CIDR range for the route you want to delete. The value you specify
     * must exactly match the CIDR for the route you want to delete.
     *
     * @param destinationCidrBlock The CIDR range for the route you want to delete. The value you specify
     *         must exactly match the CIDR for the route you want to delete.
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }
    
    /**
     * The CIDR range for the route you want to delete. The value you specify
     * must exactly match the CIDR for the route you want to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationCidrBlock The CIDR range for the route you want to delete. The value you specify
     *         must exactly match the CIDR for the route you want to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeleteRouteRequest> getDryRunRequest() {
        Request<DeleteRouteRequest> request = new DeleteRouteRequestMarshaller().marshall(this);
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
        if (getDestinationCidrBlock() != null) sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode()); 
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteRouteRequest == false) return false;
        DeleteRouteRequest other = (DeleteRouteRequest)obj;
        
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null) return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false) return false; 
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null) return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false) return false; 
        return true;
    }
    
}
    