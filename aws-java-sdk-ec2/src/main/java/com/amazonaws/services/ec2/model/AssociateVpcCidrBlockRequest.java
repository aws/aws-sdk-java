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
import com.amazonaws.services.ec2.model.transform.AssociateVpcCidrBlockRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateVpcCidrBlockRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AssociateVpcCidrBlockRequest> {

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of
     * IPv6 addresses, or the size of the CIDR block.
     * </p>
     */
    private Boolean amazonProvidedIpv6CidrBlock;
    /**
     * <p>
     * An IPv4 CIDR block to associate with the VPC.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of
     * IPv6 addresses, or the size of the CIDR block.
     * </p>
     * 
     * @param amazonProvidedIpv6CidrBlock
     *        Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the
     *        range of IPv6 addresses, or the size of the CIDR block.
     */

    public void setAmazonProvidedIpv6CidrBlock(Boolean amazonProvidedIpv6CidrBlock) {
        this.amazonProvidedIpv6CidrBlock = amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of
     * IPv6 addresses, or the size of the CIDR block.
     * </p>
     * 
     * @return Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the
     *         range of IPv6 addresses, or the size of the CIDR block.
     */

    public Boolean getAmazonProvidedIpv6CidrBlock() {
        return this.amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of
     * IPv6 addresses, or the size of the CIDR block.
     * </p>
     * 
     * @param amazonProvidedIpv6CidrBlock
     *        Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the
     *        range of IPv6 addresses, or the size of the CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateVpcCidrBlockRequest withAmazonProvidedIpv6CidrBlock(Boolean amazonProvidedIpv6CidrBlock) {
        setAmazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of
     * IPv6 addresses, or the size of the CIDR block.
     * </p>
     * 
     * @return Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the
     *         range of IPv6 addresses, or the size of the CIDR block.
     */

    public Boolean isAmazonProvidedIpv6CidrBlock() {
        return this.amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * An IPv4 CIDR block to associate with the VPC.
     * </p>
     * 
     * @param cidrBlock
     *        An IPv4 CIDR block to associate with the VPC.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * An IPv4 CIDR block to associate with the VPC.
     * </p>
     * 
     * @return An IPv4 CIDR block to associate with the VPC.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * An IPv4 CIDR block to associate with the VPC.
     * </p>
     * 
     * @param cidrBlock
     *        An IPv4 CIDR block to associate with the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateVpcCidrBlockRequest withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateVpcCidrBlockRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssociateVpcCidrBlockRequest> getDryRunRequest() {
        Request<AssociateVpcCidrBlockRequest> request = new AssociateVpcCidrBlockRequestMarshaller().marshall(this);
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
        if (getAmazonProvidedIpv6CidrBlock() != null)
            sb.append("AmazonProvidedIpv6CidrBlock: ").append(getAmazonProvidedIpv6CidrBlock()).append(",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateVpcCidrBlockRequest == false)
            return false;
        AssociateVpcCidrBlockRequest other = (AssociateVpcCidrBlockRequest) obj;
        if (other.getAmazonProvidedIpv6CidrBlock() == null ^ this.getAmazonProvidedIpv6CidrBlock() == null)
            return false;
        if (other.getAmazonProvidedIpv6CidrBlock() != null && other.getAmazonProvidedIpv6CidrBlock().equals(this.getAmazonProvidedIpv6CidrBlock()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonProvidedIpv6CidrBlock() == null) ? 0 : getAmazonProvidedIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateVpcCidrBlockRequest clone() {
        return (AssociateVpcCidrBlockRequest) super.clone();
    }
}
