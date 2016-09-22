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
 * Describes a secondary private IP address for a network interface.
 * </p>
 */
public class PrivateIpAddressSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The private IP addresses.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * Indicates whether the private IP address is the primary private IP address. Only one IP address can be designated
     * as primary.
     * </p>
     */
    private Boolean primary;

    /**
     * <p>
     * The private IP addresses.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP addresses.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP addresses.
     * </p>
     * 
     * @return The private IP addresses.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IP addresses.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateIpAddressSpecification withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * Indicates whether the private IP address is the primary private IP address. Only one IP address can be designated
     * as primary.
     * </p>
     * 
     * @param primary
     *        Indicates whether the private IP address is the primary private IP address. Only one IP address can be
     *        designated as primary.
     */

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * <p>
     * Indicates whether the private IP address is the primary private IP address. Only one IP address can be designated
     * as primary.
     * </p>
     * 
     * @return Indicates whether the private IP address is the primary private IP address. Only one IP address can be
     *         designated as primary.
     */

    public Boolean getPrimary() {
        return this.primary;
    }

    /**
     * <p>
     * Indicates whether the private IP address is the primary private IP address. Only one IP address can be designated
     * as primary.
     * </p>
     * 
     * @param primary
     *        Indicates whether the private IP address is the primary private IP address. Only one IP address can be
     *        designated as primary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateIpAddressSpecification withPrimary(Boolean primary) {
        setPrimary(primary);
        return this;
    }

    /**
     * <p>
     * Indicates whether the private IP address is the primary private IP address. Only one IP address can be designated
     * as primary.
     * </p>
     * 
     * @return Indicates whether the private IP address is the primary private IP address. Only one IP address can be
     *         designated as primary.
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

        if (obj instanceof PrivateIpAddressSpecification == false)
            return false;
        PrivateIpAddressSpecification other = (PrivateIpAddressSpecification) obj;
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
    public PrivateIpAddressSpecification clone() {
        try {
            return (PrivateIpAddressSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
