/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the IPv6 CIDR blocks for the VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/VpcInfoIpv6CidrBlockSetDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcInfoIpv6CidrBlockSetDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     */
    private String ipv6CidrBlock;

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block for the VPC.
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     * 
     * @return The IPv6 CIDR block for the VPC.
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcInfoIpv6CidrBlockSetDetails withIpv6CidrBlock(String ipv6CidrBlock) {
        setIpv6CidrBlock(ipv6CidrBlock);
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
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcInfoIpv6CidrBlockSetDetails == false)
            return false;
        VpcInfoIpv6CidrBlockSetDetails other = (VpcInfoIpv6CidrBlockSetDetails) obj;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        return hashCode;
    }

    @Override
    public VpcInfoIpv6CidrBlockSetDetails clone() {
        try {
            return (VpcInfoIpv6CidrBlockSetDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.VpcInfoIpv6CidrBlockSetDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
