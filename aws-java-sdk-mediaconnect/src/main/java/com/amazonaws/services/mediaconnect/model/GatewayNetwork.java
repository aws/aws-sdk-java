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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The network settings for a gateway.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/GatewayNetwork" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayNetwork implements Serializable, Cloneable, StructuredPojo {

    /**
     * A unique IP address range to use for this network. These IP addresses should be in the form of a Classless
     * Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */
    private String cidrBlock;
    /**
     * The name of the network. This name is used to reference the network and must be unique among networks in this
     * gateway.
     */
    private String name;

    /**
     * A unique IP address range to use for this network. These IP addresses should be in the form of a Classless
     * Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param cidrBlock
     *        A unique IP address range to use for this network. These IP addresses should be in the form of a Classless
     *        Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * A unique IP address range to use for this network. These IP addresses should be in the form of a Classless
     * Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @return A unique IP address range to use for this network. These IP addresses should be in the form of a
     *         Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * A unique IP address range to use for this network. These IP addresses should be in the form of a Classless
     * Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param cidrBlock
     *        A unique IP address range to use for this network. These IP addresses should be in the form of a Classless
     *        Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayNetwork withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * The name of the network. This name is used to reference the network and must be unique among networks in this
     * gateway.
     * 
     * @param name
     *        The name of the network. This name is used to reference the network and must be unique among networks in
     *        this gateway.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the network. This name is used to reference the network and must be unique among networks in this
     * gateway.
     * 
     * @return The name of the network. This name is used to reference the network and must be unique among networks in
     *         this gateway.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the network. This name is used to reference the network and must be unique among networks in this
     * gateway.
     * 
     * @param name
     *        The name of the network. This name is used to reference the network and must be unique among networks in
     *        this gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayNetwork withName(String name) {
        setName(name);
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayNetwork == false)
            return false;
        GatewayNetwork other = (GatewayNetwork) obj;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GatewayNetwork clone() {
        try {
            return (GatewayNetwork) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.GatewayNetworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
