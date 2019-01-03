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
import com.amazonaws.services.ec2.model.transform.ModifyVpcPeeringConnectionOptionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcPeeringConnectionOptionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVpcPeeringConnectionOptionsRequest> {

    /**
     * <p>
     * The VPC peering connection options for the accepter VPC.
     * </p>
     */
    private PeeringConnectionOptionsRequest accepterPeeringConnectionOptions;
    /**
     * <p>
     * The VPC peering connection options for the requester VPC.
     * </p>
     */
    private PeeringConnectionOptionsRequest requesterPeeringConnectionOptions;
    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * The VPC peering connection options for the accepter VPC.
     * </p>
     * 
     * @param accepterPeeringConnectionOptions
     *        The VPC peering connection options for the accepter VPC.
     */

    public void setAccepterPeeringConnectionOptions(PeeringConnectionOptionsRequest accepterPeeringConnectionOptions) {
        this.accepterPeeringConnectionOptions = accepterPeeringConnectionOptions;
    }

    /**
     * <p>
     * The VPC peering connection options for the accepter VPC.
     * </p>
     * 
     * @return The VPC peering connection options for the accepter VPC.
     */

    public PeeringConnectionOptionsRequest getAccepterPeeringConnectionOptions() {
        return this.accepterPeeringConnectionOptions;
    }

    /**
     * <p>
     * The VPC peering connection options for the accepter VPC.
     * </p>
     * 
     * @param accepterPeeringConnectionOptions
     *        The VPC peering connection options for the accepter VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcPeeringConnectionOptionsRequest withAccepterPeeringConnectionOptions(PeeringConnectionOptionsRequest accepterPeeringConnectionOptions) {
        setAccepterPeeringConnectionOptions(accepterPeeringConnectionOptions);
        return this;
    }

    /**
     * <p>
     * The VPC peering connection options for the requester VPC.
     * </p>
     * 
     * @param requesterPeeringConnectionOptions
     *        The VPC peering connection options for the requester VPC.
     */

    public void setRequesterPeeringConnectionOptions(PeeringConnectionOptionsRequest requesterPeeringConnectionOptions) {
        this.requesterPeeringConnectionOptions = requesterPeeringConnectionOptions;
    }

    /**
     * <p>
     * The VPC peering connection options for the requester VPC.
     * </p>
     * 
     * @return The VPC peering connection options for the requester VPC.
     */

    public PeeringConnectionOptionsRequest getRequesterPeeringConnectionOptions() {
        return this.requesterPeeringConnectionOptions;
    }

    /**
     * <p>
     * The VPC peering connection options for the requester VPC.
     * </p>
     * 
     * @param requesterPeeringConnectionOptions
     *        The VPC peering connection options for the requester VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcPeeringConnectionOptionsRequest withRequesterPeeringConnectionOptions(PeeringConnectionOptionsRequest requesterPeeringConnectionOptions) {
        setRequesterPeeringConnectionOptions(requesterPeeringConnectionOptions);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of the VPC peering connection.
     */

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @return The ID of the VPC peering connection.
     */

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcPeeringConnectionOptionsRequest withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        setVpcPeeringConnectionId(vpcPeeringConnectionId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcPeeringConnectionOptionsRequest> getDryRunRequest() {
        Request<ModifyVpcPeeringConnectionOptionsRequest> request = new ModifyVpcPeeringConnectionOptionsRequestMarshaller().marshall(this);
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
        if (getAccepterPeeringConnectionOptions() != null)
            sb.append("AccepterPeeringConnectionOptions: ").append(getAccepterPeeringConnectionOptions()).append(",");
        if (getRequesterPeeringConnectionOptions() != null)
            sb.append("RequesterPeeringConnectionOptions: ").append(getRequesterPeeringConnectionOptions()).append(",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: ").append(getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcPeeringConnectionOptionsRequest == false)
            return false;
        ModifyVpcPeeringConnectionOptionsRequest other = (ModifyVpcPeeringConnectionOptionsRequest) obj;
        if (other.getAccepterPeeringConnectionOptions() == null ^ this.getAccepterPeeringConnectionOptions() == null)
            return false;
        if (other.getAccepterPeeringConnectionOptions() != null
                && other.getAccepterPeeringConnectionOptions().equals(this.getAccepterPeeringConnectionOptions()) == false)
            return false;
        if (other.getRequesterPeeringConnectionOptions() == null ^ this.getRequesterPeeringConnectionOptions() == null)
            return false;
        if (other.getRequesterPeeringConnectionOptions() != null
                && other.getRequesterPeeringConnectionOptions().equals(this.getRequesterPeeringConnectionOptions()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccepterPeeringConnectionOptions() == null) ? 0 : getAccepterPeeringConnectionOptions().hashCode());
        hashCode = prime * hashCode + ((getRequesterPeeringConnectionOptions() == null) ? 0 : getRequesterPeeringConnectionOptions().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcPeeringConnectionOptionsRequest clone() {
        return (ModifyVpcPeeringConnectionOptionsRequest) super.clone();
    }
}
