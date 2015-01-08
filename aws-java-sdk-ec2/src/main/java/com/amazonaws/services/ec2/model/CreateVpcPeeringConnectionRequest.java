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
import com.amazonaws.services.ec2.model.transform.CreateVpcPeeringConnectionRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createVpcPeeringConnection(CreateVpcPeeringConnectionRequest) CreateVpcPeeringConnection operation}.
 * <p>
 * Requests a VPC peering connection between two VPCs: a requester VPC
 * that you own and a peer VPC with which to create the connection. The
 * peer VPC can belong to another AWS account. The requester VPC and peer
 * VPC cannot have overlapping CIDR blocks.
 * </p>
 * <p>
 * The owner of the peer VPC must accept the peering request to activate
 * the peering connection. The VPC peering connection request expires
 * after 7 days, after which it cannot be accepted or rejected.
 * </p>
 * <p>
 * A <code>CreateVpcPeeringConnection</code> request between VPCs with
 * overlapping CIDR blocks results in the VPC peering connection having a
 * status of <code>failed</code> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createVpcPeeringConnection(CreateVpcPeeringConnectionRequest)
 */
public class CreateVpcPeeringConnectionRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateVpcPeeringConnectionRequest> {

    /**
     * The ID of the requester VPC.
     */
    private String vpcId;

    /**
     * The ID of the VPC with which you are creating the VPC peering
     * connection.
     */
    private String peerVpcId;

    /**
     * The AWS account ID of the owner of the peer VPC. <p>Default: Your AWS
     * account ID
     */
    private String peerOwnerId;

    /**
     * The ID of the requester VPC.
     *
     * @return The ID of the requester VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the requester VPC.
     *
     * @param vpcId The ID of the requester VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the requester VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the requester VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcPeeringConnectionRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The ID of the VPC with which you are creating the VPC peering
     * connection.
     *
     * @return The ID of the VPC with which you are creating the VPC peering
     *         connection.
     */
    public String getPeerVpcId() {
        return peerVpcId;
    }
    
    /**
     * The ID of the VPC with which you are creating the VPC peering
     * connection.
     *
     * @param peerVpcId The ID of the VPC with which you are creating the VPC peering
     *         connection.
     */
    public void setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
    }
    
    /**
     * The ID of the VPC with which you are creating the VPC peering
     * connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param peerVpcId The ID of the VPC with which you are creating the VPC peering
     *         connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcPeeringConnectionRequest withPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }

    /**
     * The AWS account ID of the owner of the peer VPC. <p>Default: Your AWS
     * account ID
     *
     * @return The AWS account ID of the owner of the peer VPC. <p>Default: Your AWS
     *         account ID
     */
    public String getPeerOwnerId() {
        return peerOwnerId;
    }
    
    /**
     * The AWS account ID of the owner of the peer VPC. <p>Default: Your AWS
     * account ID
     *
     * @param peerOwnerId The AWS account ID of the owner of the peer VPC. <p>Default: Your AWS
     *         account ID
     */
    public void setPeerOwnerId(String peerOwnerId) {
        this.peerOwnerId = peerOwnerId;
    }
    
    /**
     * The AWS account ID of the owner of the peer VPC. <p>Default: Your AWS
     * account ID
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param peerOwnerId The AWS account ID of the owner of the peer VPC. <p>Default: Your AWS
     *         account ID
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcPeeringConnectionRequest withPeerOwnerId(String peerOwnerId) {
        this.peerOwnerId = peerOwnerId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<CreateVpcPeeringConnectionRequest> request = new CreateVpcPeeringConnectionRequestMarshaller().marshall(this);
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
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getPeerVpcId() != null) sb.append("PeerVpcId: " + getPeerVpcId() + ",");
        if (getPeerOwnerId() != null) sb.append("PeerOwnerId: " + getPeerOwnerId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getPeerVpcId() == null) ? 0 : getPeerVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getPeerOwnerId() == null) ? 0 : getPeerOwnerId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVpcPeeringConnectionRequest == false) return false;
        CreateVpcPeeringConnectionRequest other = (CreateVpcPeeringConnectionRequest)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getPeerVpcId() == null ^ this.getPeerVpcId() == null) return false;
        if (other.getPeerVpcId() != null && other.getPeerVpcId().equals(this.getPeerVpcId()) == false) return false; 
        if (other.getPeerOwnerId() == null ^ this.getPeerOwnerId() == null) return false;
        if (other.getPeerOwnerId() != null && other.getPeerOwnerId().equals(this.getPeerOwnerId()) == false) return false; 
        return true;
    }
    
}
    