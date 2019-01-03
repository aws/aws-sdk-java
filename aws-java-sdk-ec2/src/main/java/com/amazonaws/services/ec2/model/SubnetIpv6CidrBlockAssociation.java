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

/**
 * <p>
 * Describes an IPv6 CIDR block associated with a subnet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SubnetIpv6CidrBlockAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubnetIpv6CidrBlockAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The association ID for the CIDR block.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     */
    private String ipv6CidrBlock;
    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     */
    private SubnetCidrBlockState ipv6CidrBlockState;

    /**
     * <p>
     * The association ID for the CIDR block.
     * </p>
     * 
     * @param associationId
     *        The association ID for the CIDR block.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID for the CIDR block.
     * </p>
     * 
     * @return The association ID for the CIDR block.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The association ID for the CIDR block.
     * </p>
     * 
     * @param associationId
     *        The association ID for the CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetIpv6CidrBlockAssociation withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block.
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @return The IPv6 CIDR block.
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetIpv6CidrBlockAssociation withIpv6CidrBlock(String ipv6CidrBlock) {
        setIpv6CidrBlock(ipv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     * 
     * @param ipv6CidrBlockState
     *        Information about the state of the CIDR block.
     */

    public void setIpv6CidrBlockState(SubnetCidrBlockState ipv6CidrBlockState) {
        this.ipv6CidrBlockState = ipv6CidrBlockState;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     * 
     * @return Information about the state of the CIDR block.
     */

    public SubnetCidrBlockState getIpv6CidrBlockState() {
        return this.ipv6CidrBlockState;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     * 
     * @param ipv6CidrBlockState
     *        Information about the state of the CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetIpv6CidrBlockAssociation withIpv6CidrBlockState(SubnetCidrBlockState ipv6CidrBlockState) {
        setIpv6CidrBlockState(ipv6CidrBlockState);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock()).append(",");
        if (getIpv6CidrBlockState() != null)
            sb.append("Ipv6CidrBlockState: ").append(getIpv6CidrBlockState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubnetIpv6CidrBlockAssociation == false)
            return false;
        SubnetIpv6CidrBlockAssociation other = (SubnetIpv6CidrBlockAssociation) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getIpv6CidrBlockState() == null ^ this.getIpv6CidrBlockState() == null)
            return false;
        if (other.getIpv6CidrBlockState() != null && other.getIpv6CidrBlockState().equals(this.getIpv6CidrBlockState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlockState() == null) ? 0 : getIpv6CidrBlockState().hashCode());
        return hashCode;
    }

    @Override
    public SubnetIpv6CidrBlockAssociation clone() {
        try {
            return (SubnetIpv6CidrBlockAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
