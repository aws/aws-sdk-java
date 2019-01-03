/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVpcPeeringConnectionRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcPeeringConnectionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateVpcPeeringConnectionRequest> {

    /**
     * <p>
     * The AWS account ID of the owner of the accepter VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     */
    private String peerOwnerId;
    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the
     * request.
     * </p>
     */
    private String peerVpcId;
    /**
     * <p>
     * The ID of the requester VPC. You must specify this parameter in the request.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The region code for the accepter VPC, if the accepter VPC is located in a region other than the region in which
     * you make the request.
     * </p>
     * <p>
     * Default: The region in which you make the request.
     * </p>
     */
    private String peerRegion;

    /**
     * <p>
     * The AWS account ID of the owner of the accepter VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     * 
     * @param peerOwnerId
     *        The AWS account ID of the owner of the accepter VPC.</p>
     *        <p>
     *        Default: Your AWS account ID
     */

    public void setPeerOwnerId(String peerOwnerId) {
        this.peerOwnerId = peerOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the accepter VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     * 
     * @return The AWS account ID of the owner of the accepter VPC.</p>
     *         <p>
     *         Default: Your AWS account ID
     */

    public String getPeerOwnerId() {
        return this.peerOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the accepter VPC.
     * </p>
     * <p>
     * Default: Your AWS account ID
     * </p>
     * 
     * @param peerOwnerId
     *        The AWS account ID of the owner of the accepter VPC.</p>
     *        <p>
     *        Default: Your AWS account ID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringConnectionRequest withPeerOwnerId(String peerOwnerId) {
        setPeerOwnerId(peerOwnerId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the
     * request.
     * </p>
     * 
     * @param peerVpcId
     *        The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter
     *        in the request.
     */

    public void setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
    }

    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the
     * request.
     * </p>
     * 
     * @return The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter
     *         in the request.
     */

    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * <p>
     * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the
     * request.
     * </p>
     * 
     * @param peerVpcId
     *        The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter
     *        in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringConnectionRequest withPeerVpcId(String peerVpcId) {
        setPeerVpcId(peerVpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the requester VPC. You must specify this parameter in the request.
     * </p>
     * 
     * @param vpcId
     *        The ID of the requester VPC. You must specify this parameter in the request.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the requester VPC. You must specify this parameter in the request.
     * </p>
     * 
     * @return The ID of the requester VPC. You must specify this parameter in the request.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the requester VPC. You must specify this parameter in the request.
     * </p>
     * 
     * @param vpcId
     *        The ID of the requester VPC. You must specify this parameter in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringConnectionRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The region code for the accepter VPC, if the accepter VPC is located in a region other than the region in which
     * you make the request.
     * </p>
     * <p>
     * Default: The region in which you make the request.
     * </p>
     * 
     * @param peerRegion
     *        The region code for the accepter VPC, if the accepter VPC is located in a region other than the region in
     *        which you make the request.</p>
     *        <p>
     *        Default: The region in which you make the request.
     */

    public void setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
    }

    /**
     * <p>
     * The region code for the accepter VPC, if the accepter VPC is located in a region other than the region in which
     * you make the request.
     * </p>
     * <p>
     * Default: The region in which you make the request.
     * </p>
     * 
     * @return The region code for the accepter VPC, if the accepter VPC is located in a region other than the region in
     *         which you make the request.</p>
     *         <p>
     *         Default: The region in which you make the request.
     */

    public String getPeerRegion() {
        return this.peerRegion;
    }

    /**
     * <p>
     * The region code for the accepter VPC, if the accepter VPC is located in a region other than the region in which
     * you make the request.
     * </p>
     * <p>
     * Default: The region in which you make the request.
     * </p>
     * 
     * @param peerRegion
     *        The region code for the accepter VPC, if the accepter VPC is located in a region other than the region in
     *        which you make the request.</p>
     *        <p>
     *        Default: The region in which you make the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringConnectionRequest withPeerRegion(String peerRegion) {
        setPeerRegion(peerRegion);
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
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPeerOwnerId() != null)
            sb.append("PeerOwnerId: ").append(getPeerOwnerId()).append(",");
        if (getPeerVpcId() != null)
            sb.append("PeerVpcId: ").append(getPeerVpcId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getPeerRegion() != null)
            sb.append("PeerRegion: ").append(getPeerRegion());
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
        if (other.getPeerOwnerId() == null ^ this.getPeerOwnerId() == null)
            return false;
        if (other.getPeerOwnerId() != null && other.getPeerOwnerId().equals(this.getPeerOwnerId()) == false)
            return false;
        if (other.getPeerVpcId() == null ^ this.getPeerVpcId() == null)
            return false;
        if (other.getPeerVpcId() != null && other.getPeerVpcId().equals(this.getPeerVpcId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getPeerRegion() == null ^ this.getPeerRegion() == null)
            return false;
        if (other.getPeerRegion() != null && other.getPeerRegion().equals(this.getPeerRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeerOwnerId() == null) ? 0 : getPeerOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcId() == null) ? 0 : getPeerVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getPeerRegion() == null) ? 0 : getPeerRegion().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcPeeringConnectionRequest clone() {
        return (CreateVpcPeeringConnectionRequest) super.clone();
    }
}
