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
public class DisassociateVpcCidrBlockResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the IPv6 CIDR block association.
     * </p>
     */
    private VpcIpv6CidrBlockAssociation ipv6CidrBlockAssociation;
    /**
     * <p>
     * Information about the IPv4 CIDR block association.
     * </p>
     */
    private VpcCidrBlockAssociation cidrBlockAssociation;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Information about the IPv6 CIDR block association.
     * </p>
     * 
     * @param ipv6CidrBlockAssociation
     *        Information about the IPv6 CIDR block association.
     */

    public void setIpv6CidrBlockAssociation(VpcIpv6CidrBlockAssociation ipv6CidrBlockAssociation) {
        this.ipv6CidrBlockAssociation = ipv6CidrBlockAssociation;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block association.
     * </p>
     * 
     * @return Information about the IPv6 CIDR block association.
     */

    public VpcIpv6CidrBlockAssociation getIpv6CidrBlockAssociation() {
        return this.ipv6CidrBlockAssociation;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block association.
     * </p>
     * 
     * @param ipv6CidrBlockAssociation
     *        Information about the IPv6 CIDR block association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateVpcCidrBlockResult withIpv6CidrBlockAssociation(VpcIpv6CidrBlockAssociation ipv6CidrBlockAssociation) {
        setIpv6CidrBlockAssociation(ipv6CidrBlockAssociation);
        return this;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR block association.
     * </p>
     * 
     * @param cidrBlockAssociation
     *        Information about the IPv4 CIDR block association.
     */

    public void setCidrBlockAssociation(VpcCidrBlockAssociation cidrBlockAssociation) {
        this.cidrBlockAssociation = cidrBlockAssociation;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR block association.
     * </p>
     * 
     * @return Information about the IPv4 CIDR block association.
     */

    public VpcCidrBlockAssociation getCidrBlockAssociation() {
        return this.cidrBlockAssociation;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR block association.
     * </p>
     * 
     * @param cidrBlockAssociation
     *        Information about the IPv4 CIDR block association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateVpcCidrBlockResult withCidrBlockAssociation(VpcCidrBlockAssociation cidrBlockAssociation) {
        setCidrBlockAssociation(cidrBlockAssociation);
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

    public DisassociateVpcCidrBlockResult withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getIpv6CidrBlockAssociation() != null)
            sb.append("Ipv6CidrBlockAssociation: ").append(getIpv6CidrBlockAssociation()).append(",");
        if (getCidrBlockAssociation() != null)
            sb.append("CidrBlockAssociation: ").append(getCidrBlockAssociation()).append(",");
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

        if (obj instanceof DisassociateVpcCidrBlockResult == false)
            return false;
        DisassociateVpcCidrBlockResult other = (DisassociateVpcCidrBlockResult) obj;
        if (other.getIpv6CidrBlockAssociation() == null ^ this.getIpv6CidrBlockAssociation() == null)
            return false;
        if (other.getIpv6CidrBlockAssociation() != null && other.getIpv6CidrBlockAssociation().equals(this.getIpv6CidrBlockAssociation()) == false)
            return false;
        if (other.getCidrBlockAssociation() == null ^ this.getCidrBlockAssociation() == null)
            return false;
        if (other.getCidrBlockAssociation() != null && other.getCidrBlockAssociation().equals(this.getCidrBlockAssociation()) == false)
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

        hashCode = prime * hashCode + ((getIpv6CidrBlockAssociation() == null) ? 0 : getIpv6CidrBlockAssociation().hashCode());
        hashCode = prime * hashCode + ((getCidrBlockAssociation() == null) ? 0 : getCidrBlockAssociation().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateVpcCidrBlockResult clone() {
        try {
            return (DisassociateVpcCidrBlockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
