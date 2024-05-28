/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The IPv6 CIDR block for your subnet.
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
     * An IPv6 IPAM pool ID.
     * </p>
     */
    private String ipv6IpamPoolId;
    /**
     * <p>
     * An IPv6 netmask length.
     * </p>
     */
    private Integer ipv6NetmaskLength;

    /**
     * <p>
     * The IPv6 CIDR block for your subnet.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block for your subnet.
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block for your subnet.
     * </p>
     * 
     * @return The IPv6 CIDR block for your subnet.
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block for your subnet.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block for your subnet.
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
     * <p>
     * An IPv6 IPAM pool ID.
     * </p>
     * 
     * @param ipv6IpamPoolId
     *        An IPv6 IPAM pool ID.
     */

    public void setIpv6IpamPoolId(String ipv6IpamPoolId) {
        this.ipv6IpamPoolId = ipv6IpamPoolId;
    }

    /**
     * <p>
     * An IPv6 IPAM pool ID.
     * </p>
     * 
     * @return An IPv6 IPAM pool ID.
     */

    public String getIpv6IpamPoolId() {
        return this.ipv6IpamPoolId;
    }

    /**
     * <p>
     * An IPv6 IPAM pool ID.
     * </p>
     * 
     * @param ipv6IpamPoolId
     *        An IPv6 IPAM pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSubnetCidrBlockRequest withIpv6IpamPoolId(String ipv6IpamPoolId) {
        setIpv6IpamPoolId(ipv6IpamPoolId);
        return this;
    }

    /**
     * <p>
     * An IPv6 netmask length.
     * </p>
     * 
     * @param ipv6NetmaskLength
     *        An IPv6 netmask length.
     */

    public void setIpv6NetmaskLength(Integer ipv6NetmaskLength) {
        this.ipv6NetmaskLength = ipv6NetmaskLength;
    }

    /**
     * <p>
     * An IPv6 netmask length.
     * </p>
     * 
     * @return An IPv6 netmask length.
     */

    public Integer getIpv6NetmaskLength() {
        return this.ipv6NetmaskLength;
    }

    /**
     * <p>
     * An IPv6 netmask length.
     * </p>
     * 
     * @param ipv6NetmaskLength
     *        An IPv6 netmask length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSubnetCidrBlockRequest withIpv6NetmaskLength(Integer ipv6NetmaskLength) {
        setIpv6NetmaskLength(ipv6NetmaskLength);
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
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getIpv6IpamPoolId() != null)
            sb.append("Ipv6IpamPoolId: ").append(getIpv6IpamPoolId()).append(",");
        if (getIpv6NetmaskLength() != null)
            sb.append("Ipv6NetmaskLength: ").append(getIpv6NetmaskLength());
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
        if (other.getIpv6IpamPoolId() == null ^ this.getIpv6IpamPoolId() == null)
            return false;
        if (other.getIpv6IpamPoolId() != null && other.getIpv6IpamPoolId().equals(this.getIpv6IpamPoolId()) == false)
            return false;
        if (other.getIpv6NetmaskLength() == null ^ this.getIpv6NetmaskLength() == null)
            return false;
        if (other.getIpv6NetmaskLength() != null && other.getIpv6NetmaskLength().equals(this.getIpv6NetmaskLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getIpv6IpamPoolId() == null) ? 0 : getIpv6IpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getIpv6NetmaskLength() == null) ? 0 : getIpv6NetmaskLength().hashCode());
        return hashCode;
    }

    @Override
    public AssociateSubnetCidrBlockRequest clone() {
        return (AssociateSubnetCidrBlockRequest) super.clone();
    }
}
