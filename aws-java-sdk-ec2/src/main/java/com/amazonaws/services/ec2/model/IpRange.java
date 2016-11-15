/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes an IP range.
 * </p>
 */
public class IpRange implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR range. You can either specify a CIDR range or a source security group, not both.
     * </p>
     */
    private String cidrIp;

    /**
     * <p>
     * The CIDR range. You can either specify a CIDR range or a source security group, not both.
     * </p>
     * 
     * @param cidrIp
     *        The CIDR range. You can either specify a CIDR range or a source security group, not both.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * The CIDR range. You can either specify a CIDR range or a source security group, not both.
     * </p>
     * 
     * @return The CIDR range. You can either specify a CIDR range or a source security group, not both.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * The CIDR range. You can either specify a CIDR range or a source security group, not both.
     * </p>
     * 
     * @param cidrIp
     *        The CIDR range. You can either specify a CIDR range or a source security group, not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRange withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCidrIp() != null)
            sb.append("CidrIp: " + getCidrIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpRange == false)
            return false;
        IpRange other = (IpRange) obj;
        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        return hashCode;
    }

    @Override
    public IpRange clone() {
        try {
            return (IpRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
