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
 * Describes an IPv4 CIDR block associated with a VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpcCidrBlockAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcCidrBlockAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The association ID for the IPv4 CIDR block.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The IPv4 CIDR block.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     */
    private VpcCidrBlockState cidrBlockState;

    /**
     * <p>
     * The association ID for the IPv4 CIDR block.
     * </p>
     * 
     * @param associationId
     *        The association ID for the IPv4 CIDR block.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID for the IPv4 CIDR block.
     * </p>
     * 
     * @return The association ID for the IPv4 CIDR block.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The association ID for the IPv4 CIDR block.
     * </p>
     * 
     * @param associationId
     *        The association ID for the IPv4 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcCidrBlockAssociation withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The IPv4 CIDR block.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 CIDR block.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block.
     * </p>
     * 
     * @return The IPv4 CIDR block.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcCidrBlockAssociation withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     * 
     * @param cidrBlockState
     *        Information about the state of the CIDR block.
     */

    public void setCidrBlockState(VpcCidrBlockState cidrBlockState) {
        this.cidrBlockState = cidrBlockState;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     * 
     * @return Information about the state of the CIDR block.
     */

    public VpcCidrBlockState getCidrBlockState() {
        return this.cidrBlockState;
    }

    /**
     * <p>
     * Information about the state of the CIDR block.
     * </p>
     * 
     * @param cidrBlockState
     *        Information about the state of the CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcCidrBlockAssociation withCidrBlockState(VpcCidrBlockState cidrBlockState) {
        setCidrBlockState(cidrBlockState);
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getCidrBlockState() != null)
            sb.append("CidrBlockState: ").append(getCidrBlockState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcCidrBlockAssociation == false)
            return false;
        VpcCidrBlockAssociation other = (VpcCidrBlockAssociation) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getCidrBlockState() == null ^ this.getCidrBlockState() == null)
            return false;
        if (other.getCidrBlockState() != null && other.getCidrBlockState().equals(this.getCidrBlockState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getCidrBlockState() == null) ? 0 : getCidrBlockState().hashCode());
        return hashCode;
    }

    @Override
    public VpcCidrBlockAssociation clone() {
        try {
            return (VpcCidrBlockAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
