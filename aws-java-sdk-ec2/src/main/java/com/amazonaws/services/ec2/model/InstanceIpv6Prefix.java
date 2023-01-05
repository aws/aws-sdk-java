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
 * Information about an IPv6 prefix.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceIpv6Prefix" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceIpv6Prefix implements Serializable, Cloneable {

    /**
     * <p>
     * One or more IPv6 prefixes assigned to the network interface.
     * </p>
     */
    private String ipv6Prefix;

    /**
     * <p>
     * One or more IPv6 prefixes assigned to the network interface.
     * </p>
     * 
     * @param ipv6Prefix
     *        One or more IPv6 prefixes assigned to the network interface.
     */

    public void setIpv6Prefix(String ipv6Prefix) {
        this.ipv6Prefix = ipv6Prefix;
    }

    /**
     * <p>
     * One or more IPv6 prefixes assigned to the network interface.
     * </p>
     * 
     * @return One or more IPv6 prefixes assigned to the network interface.
     */

    public String getIpv6Prefix() {
        return this.ipv6Prefix;
    }

    /**
     * <p>
     * One or more IPv6 prefixes assigned to the network interface.
     * </p>
     * 
     * @param ipv6Prefix
     *        One or more IPv6 prefixes assigned to the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceIpv6Prefix withIpv6Prefix(String ipv6Prefix) {
        setIpv6Prefix(ipv6Prefix);
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
        if (getIpv6Prefix() != null)
            sb.append("Ipv6Prefix: ").append(getIpv6Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceIpv6Prefix == false)
            return false;
        InstanceIpv6Prefix other = (InstanceIpv6Prefix) obj;
        if (other.getIpv6Prefix() == null ^ this.getIpv6Prefix() == null)
            return false;
        if (other.getIpv6Prefix() != null && other.getIpv6Prefix().equals(this.getIpv6Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6Prefix() == null) ? 0 : getIpv6Prefix().hashCode());
        return hashCode;
    }

    @Override
    public InstanceIpv6Prefix clone() {
        try {
            return (InstanceIpv6Prefix) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
