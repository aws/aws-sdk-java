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
import com.amazonaws.services.ec2.model.transform.CreateVpcPeeringConnectionRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateVpcPeeringConnection.
 * </p>
 */
public class CreateVpcPeeringConnectionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateVpcPeeringConnectionRequest> {

    /**
     * <p>
     * The ID of the requester VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection.
     * </p>
     */
    private String peerVpcId;
    /**
     * <p>
     * The AWS account ID of the owner of the peer VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     */
    private String peerOwnerId;

    /**
     * <p>
     * The ID of the requester VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the requester VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the requester VPC.
     * </p>
     * 
     * @return The ID of the requester VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the requester VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the requester VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringConnectionRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection.
     * </p>
     * 
     * @param peerVpcId
     *        The ID of the VPC with which you are creating the VPC peering connection.
     */

    public void setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
    }

    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection.
     * </p>
     * 
     * @return The ID of the VPC with which you are creating the VPC peering connection.
     */

    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection.
     * </p>
     * 
     * @param peerVpcId
     *        The ID of the VPC with which you are creating the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringConnectionRequest withPeerVpcId(String peerVpcId) {
        setPeerVpcId(peerVpcId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the peer VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     * 
     * @param peerOwnerId
     *        The AWS account ID of the owner of the peer VPC.</p>
     *        <p>
     *        Default: Your AWS account ID
     */

    public void setPeerOwnerId(String peerOwnerId) {
        this.peerOwnerId = peerOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the peer VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     * 
     * @return The AWS account ID of the owner of the peer VPC.</p>
     *         <p>
     *         Default: Your AWS account ID
     */

    public String getPeerOwnerId() {
        return this.peerOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the peer VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     * 
     * @param peerOwnerId
     *        The AWS account ID of the owner of the peer VPC.</p>
     *        <p>
     *        Default: Your AWS account ID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringConnectionRequest withPeerOwnerId(String peerOwnerId) {
        setPeerOwnerId(peerOwnerId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVpcPeeringConnectionRequest> getDryRunRequest() {
        Request<CreateVpcPeeringConnectionRequest> request = new CreateVpcPeeringConnectionRequestMarshaller().marshall(this);
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
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getPeerVpcId() != null)
            sb.append("PeerVpcId: " + getPeerVpcId() + ",");
        if (getPeerOwnerId() != null)
            sb.append("PeerOwnerId: " + getPeerOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcPeeringConnectionRequest == false)
            return false;
        CreateVpcPeeringConnectionRequest other = (CreateVpcPeeringConnectionRequest) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getPeerVpcId() == null ^ this.getPeerVpcId() == null)
            return false;
        if (other.getPeerVpcId() != null && other.getPeerVpcId().equals(this.getPeerVpcId()) == false)
            return false;
        if (other.getPeerOwnerId() == null ^ this.getPeerOwnerId() == null)
            return false;
        if (other.getPeerOwnerId() != null && other.getPeerOwnerId().equals(this.getPeerOwnerId()) == false)
            return false;
        return true;
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
    public CreateVpcPeeringConnectionRequest clone() {
        return (CreateVpcPeeringConnectionRequest) super.clone();
    }
}
