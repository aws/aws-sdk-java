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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the IPv4 delegated prefixes assigned to a network interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Ipv4PrefixSpecificationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ipv4PrefixSpecificationResponse implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv4 delegated prefixes assigned to the network interface.
     * </p>
     */
    private String ipv4Prefix;

    /**
     * <p>
     * The IPv4 delegated prefixes assigned to the network interface.
     * </p>
     * 
     * @param ipv4Prefix
     *        The IPv4 delegated prefixes assigned to the network interface.
     */

    public void setIpv4Prefix(String ipv4Prefix) {
        this.ipv4Prefix = ipv4Prefix;
    }

    /**
     * <p>
     * The IPv4 delegated prefixes assigned to the network interface.
     * </p>
     * 
     * @return The IPv4 delegated prefixes assigned to the network interface.
     */

    public String getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    /**
     * <p>
     * The IPv4 delegated prefixes assigned to the network interface.
     * </p>
     * 
     * @param ipv4Prefix
     *        The IPv4 delegated prefixes assigned to the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv4PrefixSpecificationResponse withIpv4Prefix(String ipv4Prefix) {
        setIpv4Prefix(ipv4Prefix);
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
        if (getIpv4Prefix() != null)
            sb.append("Ipv4Prefix: ").append(getIpv4Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ipv4PrefixSpecificationResponse == false)
            return false;
        Ipv4PrefixSpecificationResponse other = (Ipv4PrefixSpecificationResponse) obj;
        if (other.getIpv4Prefix() == null ^ this.getIpv4Prefix() == null)
            return false;
        if (other.getIpv4Prefix() != null && other.getIpv4Prefix().equals(this.getIpv4Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv4Prefix() == null) ? 0 : getIpv4Prefix().hashCode());
        return hashCode;
    }

    @Override
    public Ipv4PrefixSpecificationResponse clone() {
        try {
            return (Ipv4PrefixSpecificationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
