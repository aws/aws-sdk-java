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
import com.amazonaws.services.ec2.model.transform.ReplaceRouteTableAssociationRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#replaceRouteTableAssociation(ReplaceRouteTableAssociationRequest) ReplaceRouteTableAssociation operation}.
 * <p>
 * Changes the route table associated with a given subnet in a VPC. After you execute this action, the subnet uses the routes in the new route table
 * it's associated with. For more information about route tables, go to <a
 * href="http://docs.amazonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a> in the Amazon Virtual Private Cloud User
 * Guide.
 * </p>
 * <p>
 * You can also use this to change which table is the main route table in the VPC. You just specify the main route table's association ID and the route
 * table that you want to be the new main route table.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#replaceRouteTableAssociation(ReplaceRouteTableAssociationRequest)
 */
public class ReplaceRouteTableAssociationRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ReplaceRouteTableAssociationRequest> {

    /**
     * The ID representing the current association between the original route
     * table and the subnet.
     */
    private String associationId;

    /**
     * The ID of the new route table to associate with the subnet.
     */
    private String routeTableId;

    /**
     * The ID representing the current association between the original route
     * table and the subnet.
     *
     * @return The ID representing the current association between the original route
     *         table and the subnet.
     */
    public String getAssociationId() {
        return associationId;
    }
    
    /**
     * The ID representing the current association between the original route
     * table and the subnet.
     *
     * @param associationId The ID representing the current association between the original route
     *         table and the subnet.
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }
    
    /**
     * The ID representing the current association between the original route
     * table and the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationId The ID representing the current association between the original route
     *         table and the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplaceRouteTableAssociationRequest withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * The ID of the new route table to associate with the subnet.
     *
     * @return The ID of the new route table to associate with the subnet.
     */
    public String getRouteTableId() {
        return routeTableId;
    }
    
    /**
     * The ID of the new route table to associate with the subnet.
     *
     * @param routeTableId The ID of the new route table to associate with the subnet.
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
    
    /**
     * The ID of the new route table to associate with the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableId The ID of the new route table to associate with the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplaceRouteTableAssociationRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ReplaceRouteTableAssociationRequest> getDryRunRequest() {
        Request<ReplaceRouteTableAssociationRequest> request = new ReplaceRouteTableAssociationRequestMarshaller().marshall(this);
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
        if (getAssociationId() != null) sb.append("AssociationId: " + getAssociationId() + ",");
        if (getRouteTableId() != null) sb.append("RouteTableId: " + getRouteTableId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode()); 
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReplaceRouteTableAssociationRequest == false) return false;
        ReplaceRouteTableAssociationRequest other = (ReplaceRouteTableAssociationRequest)obj;
        
        if (other.getAssociationId() == null ^ this.getAssociationId() == null) return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false) return false; 
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null) return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false) return false; 
        return true;
    }
    
}
    