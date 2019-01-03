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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcPeeringConnectionOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter VPC.
     * </p>
     */
    private PeeringConnectionOptions accepterPeeringConnectionOptions;
    /**
     * <p>
     * Information about the VPC peering connection options for the requester VPC.
     * </p>
     */
    private PeeringConnectionOptions requesterPeeringConnectionOptions;

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter VPC.
     * </p>
     * 
     * @param accepterPeeringConnectionOptions
     *        Information about the VPC peering connection options for the accepter VPC.
     */

    public void setAccepterPeeringConnectionOptions(PeeringConnectionOptions accepterPeeringConnectionOptions) {
        this.accepterPeeringConnectionOptions = accepterPeeringConnectionOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter VPC.
     * </p>
     * 
     * @return Information about the VPC peering connection options for the accepter VPC.
     */

    public PeeringConnectionOptions getAccepterPeeringConnectionOptions() {
        return this.accepterPeeringConnectionOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter VPC.
     * </p>
     * 
     * @param accepterPeeringConnectionOptions
     *        Information about the VPC peering connection options for the accepter VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcPeeringConnectionOptionsResult withAccepterPeeringConnectionOptions(PeeringConnectionOptions accepterPeeringConnectionOptions) {
        setAccepterPeeringConnectionOptions(accepterPeeringConnectionOptions);
        return this;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the requester VPC.
     * </p>
     * 
     * @param requesterPeeringConnectionOptions
     *        Information about the VPC peering connection options for the requester VPC.
     */

    public void setRequesterPeeringConnectionOptions(PeeringConnectionOptions requesterPeeringConnectionOptions) {
        this.requesterPeeringConnectionOptions = requesterPeeringConnectionOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the requester VPC.
     * </p>
     * 
     * @return Information about the VPC peering connection options for the requester VPC.
     */

    public PeeringConnectionOptions getRequesterPeeringConnectionOptions() {
        return this.requesterPeeringConnectionOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the requester VPC.
     * </p>
     * 
     * @param requesterPeeringConnectionOptions
     *        Information about the VPC peering connection options for the requester VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcPeeringConnectionOptionsResult withRequesterPeeringConnectionOptions(PeeringConnectionOptions requesterPeeringConnectionOptions) {
        setRequesterPeeringConnectionOptions(requesterPeeringConnectionOptions);
        return this;
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
            sb.append("RequesterPeeringConnectionOptions: ").append(getRequesterPeeringConnectionOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcPeeringConnectionOptionsResult == false)
            return false;
        ModifyVpcPeeringConnectionOptionsResult other = (ModifyVpcPeeringConnectionOptionsResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccepterPeeringConnectionOptions() == null) ? 0 : getAccepterPeeringConnectionOptions().hashCode());
        hashCode = prime * hashCode + ((getRequesterPeeringConnectionOptions() == null) ? 0 : getRequesterPeeringConnectionOptions().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcPeeringConnectionOptionsResult clone() {
        try {
            return (ModifyVpcPeeringConnectionOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
