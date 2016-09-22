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
 * Describes a private IP address for a Scheduled Instance.
 * </p>
 */
public class ScheduledInstancesPrivateIpAddressConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The IP address.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * Indicates whether this is a primary IP address. Otherwise, this is a secondary IP address.
     * </p>
     */
    private Boolean primary;

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param privateIpAddress
     *        The IP address.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @return The IP address.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param privateIpAddress
     *        The IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesPrivateIpAddressConfig withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is a primary IP address. Otherwise, this is a secondary IP address.
     * </p>
     * 
     * @param primary
     *        Indicates whether this is a primary IP address. Otherwise, this is a secondary IP address.
     */

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * <p>
     * Indicates whether this is a primary IP address. Otherwise, this is a secondary IP address.
     * </p>
     * 
     * @return Indicates whether this is a primary IP address. Otherwise, this is a secondary IP address.
     */

    public Boolean getPrimary() {
        return this.primary;
    }

    /**
     * <p>
     * Indicates whether this is a primary IP address. Otherwise, this is a secondary IP address.
     * </p>
     * 
     * @param primary
     *        Indicates whether this is a primary IP address. Otherwise, this is a secondary IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstancesPrivateIpAddressConfig withPrimary(Boolean primary) {
        setPrimary(primary);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is a primary IP address. Otherwise, this is a secondary IP address.
     * </p>
     * 
     * @return Indicates whether this is a primary IP address. Otherwise, this is a secondary IP address.
     */

    public Boolean isPrimary() {
        return this.primary;
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
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPrimary() != null)
            sb.append("Primary: " + getPrimary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledInstancesPrivateIpAddressConfig == false)
            return false;
        ScheduledInstancesPrivateIpAddressConfig other = (ScheduledInstancesPrivateIpAddressConfig) obj;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPrimary() == null ^ this.getPrimary() == null)
            return false;
        if (other.getPrimary() != null && other.getPrimary().equals(this.getPrimary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPrimary() == null) ? 0 : getPrimary().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledInstancesPrivateIpAddressConfig clone() {
        try {
            return (ScheduledInstancesPrivateIpAddressConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
