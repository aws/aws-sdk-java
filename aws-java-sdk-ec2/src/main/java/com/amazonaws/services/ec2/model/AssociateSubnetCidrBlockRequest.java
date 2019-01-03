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
import com.amazonaws.services.ec2.model.transform.AssociateSubnetCidrBlockRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateSubnetCidrBlockRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AssociateSubnetCidrBlockRequest> {

    /**
     * <p>
     * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
     * </p>
     */
    private String ipv6CidrBlock;
    /**
     * <p>
     * The ID of your subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
     * </p>
     * 
     * @return The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSubnetCidrBlockRequest withIpv6CidrBlock(String ipv6CidrBlock) {
        setIpv6CidrBlock(ipv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of your subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of your subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of your subnet.
     * </p>
     * 
     * @return The ID of your subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of your subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of your subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSubnetCidrBlockRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssociateSubnetCidrBlockRequest> getDryRunRequest() {
        Request<AssociateSubnetCidrBlockRequest> request = new AssociateSubnetCidrBlockRequestMarshaller().marshall(this);
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
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateSubnetCidrBlockRequest == false)
            return false;
        AssociateSubnetCidrBlockRequest other = (AssociateSubnetCidrBlockRequest) obj;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateSubnetCidrBlockRequest clone() {
        return (AssociateSubnetCidrBlockRequest) super.clone();
    }
}
