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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#disassociateRouteTable(DisassociateRouteTableRequest) DisassociateRouteTable operation}.
 * <p>
 * Disassociates a subnet from a route table.
 * </p>
 * <p>
 * After you perform this action, the subnet no longer uses the routes
 * in the route table. Instead it uses the routes in the VPC's main route
 * table. For more information about route tables, go to <a
 * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
 * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#disassociateRouteTable(DisassociateRouteTableRequest)
 */
public class DisassociateRouteTableRequest extends AmazonWebServiceRequest {

    /**
     * The association ID representing the current association between the
     * route table and subnet.
     */
    private String associationId;

    /**
     * The association ID representing the current association between the
     * route table and subnet.
     *
     * @return The association ID representing the current association between the
     *         route table and subnet.
     */
    public String getAssociationId() {
        return associationId;
    }
    
    /**
     * The association ID representing the current association between the
     * route table and subnet.
     *
     * @param associationId The association ID representing the current association between the
     *         route table and subnet.
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }
    
    /**
     * The association ID representing the current association between the
     * route table and subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationId The association ID representing the current association between the
     *         route table and subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DisassociateRouteTableRequest withAssociationId(String associationId) {
        this.associationId = associationId;
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
        sb.append("AssociationId: " + associationId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    