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

/**
 * <p>
 * Describes an IPv6 address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceIpv6Address" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceIpv6Address implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv6 address.
     * </p>
     */
    private String ipv6Address;
    /**
     * <p>
     * Determines if an IPv6 address associated with a network interface is the primary IPv6 address. When you enable an
     * IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until the
     * instance is terminated or the network interface is detached. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>.
     * </p>
     */
    private Boolean isPrimaryIpv6;

    /**
     * <p>
     * The IPv6 address.
     * </p>
     * 
     * @param ipv6Address
     *        The IPv6 address.
     */

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    /**
     * <p>
     * The IPv6 address.
     * </p>
     * 
     * @return The IPv6 address.
     */

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * <p>
     * The IPv6 address.
     * </p>
     * 
     * @param ipv6Address
     *        The IPv6 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceIpv6Address withIpv6Address(String ipv6Address) {
        setIpv6Address(ipv6Address);
        return this;
    }

    /**
     * <p>
     * Determines if an IPv6 address associated with a network interface is the primary IPv6 address. When you enable an
     * IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until the
     * instance is terminated or the network interface is detached. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>.
     * </p>
     * 
     * @param isPrimaryIpv6
     *        Determines if an IPv6 address associated with a network interface is the primary IPv6 address. When you
     *        enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address
     *        until the instance is terminated or the network interface is detached. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>.
     */

    public void setIsPrimaryIpv6(Boolean isPrimaryIpv6) {
        this.isPrimaryIpv6 = isPrimaryIpv6;
    }

    /**
     * <p>
     * Determines if an IPv6 address associated with a network interface is the primary IPv6 address. When you enable an
     * IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until the
     * instance is terminated or the network interface is detached. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>.
     * </p>
     * 
     * @return Determines if an IPv6 address associated with a network interface is the primary IPv6 address. When you
     *         enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address
     *         until the instance is terminated or the network interface is detached. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>.
     */

    public Boolean getIsPrimaryIpv6() {
        return this.isPrimaryIpv6;
    }

    /**
     * <p>
     * Determines if an IPv6 address associated with a network interface is the primary IPv6 address. When you enable an
     * IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until the
     * instance is terminated or the network interface is detached. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>.
     * </p>
     * 
     * @param isPrimaryIpv6
     *        Determines if an IPv6 address associated with a network interface is the primary IPv6 address. When you
     *        enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address
     *        until the instance is terminated or the network interface is detached. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceIpv6Address withIsPrimaryIpv6(Boolean isPrimaryIpv6) {
        setIsPrimaryIpv6(isPrimaryIpv6);
        return this;
    }

    /**
     * <p>
     * Determines if an IPv6 address associated with a network interface is the primary IPv6 address. When you enable an
     * IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until the
     * instance is terminated or the network interface is detached. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>.
     * </p>
     * 
     * @return Determines if an IPv6 address associated with a network interface is the primary IPv6 address. When you
     *         enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address
     *         until the instance is terminated or the network interface is detached. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>.
     */

    public Boolean isPrimaryIpv6() {
        return this.isPrimaryIpv6;
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
        if (getIpv6Address() != null)
            sb.append("Ipv6Address: ").append(getIpv6Address()).append(",");
        if (getIsPrimaryIpv6() != null)
            sb.append("IsPrimaryIpv6: ").append(getIsPrimaryIpv6());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceIpv6Address == false)
            return false;
        InstanceIpv6Address other = (InstanceIpv6Address) obj;
        if (other.getIpv6Address() == null ^ this.getIpv6Address() == null)
            return false;
        if (other.getIpv6Address() != null && other.getIpv6Address().equals(this.getIpv6Address()) == false)
            return false;
        if (other.getIsPrimaryIpv6() == null ^ this.getIsPrimaryIpv6() == null)
            return false;
        if (other.getIsPrimaryIpv6() != null && other.getIsPrimaryIpv6().equals(this.getIsPrimaryIpv6()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6Address() == null) ? 0 : getIpv6Address().hashCode());
        hashCode = prime * hashCode + ((getIsPrimaryIpv6() == null) ? 0 : getIsPrimaryIpv6().hashCode());
        return hashCode;
    }

    @Override
    public InstanceIpv6Address clone() {
        try {
            return (InstanceIpv6Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
