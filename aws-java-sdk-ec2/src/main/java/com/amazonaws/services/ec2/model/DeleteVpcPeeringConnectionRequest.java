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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteVpcPeeringConnectionRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest) DeleteVpcPeeringConnection operation}.
 * <p>
 * Deletes a VPC peering connection. Either the owner of the requester
 * VPC or the owner of the peer VPC can delete the VPC peering connection
 * if it's in the <code>active</code> state. The owner of the requester
 * VPC can delete a VPC peering connection in the
 * <code>pending-acceptance</code> state.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest)
 */
public class DeleteVpcPeeringConnectionRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteVpcPeeringConnectionRequest> {

    /**
     * The ID of the VPC peering connection.
     */
    private String vpcPeeringConnectionId;

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
    public DeleteVpcPeeringConnectionRequest withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeleteVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<DeleteVpcPeeringConnectionRequest> request = new DeleteVpcPeeringConnectionRequestMarshaller().marshall(this);
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
        if (getVpcPeeringConnectionId() != null) sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteVpcPeeringConnectionRequest == false) return false;
        DeleteVpcPeeringConnectionRequest other = (DeleteVpcPeeringConnectionRequest)obj;
        
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null) return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false) return false; 
        return true;
    }
    
}
    