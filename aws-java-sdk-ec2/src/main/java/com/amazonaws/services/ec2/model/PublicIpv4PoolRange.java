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
 * Describes an address range of an IPv4 address pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PublicIpv4PoolRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicIpv4PoolRange implements Serializable, Cloneable {

    /**
     * <p>
     * The first IP address in the range.
     * </p>
     */
    private String firstAddress;
    /**
     * <p>
     * The last IP address in the range.
     * </p>
     */
    private String lastAddress;
    /**
     * <p>
     * The number of addresses in the range.
     * </p>
     */
    private Integer addressCount;
    /**
     * <p>
     * The number of available addresses in the range.
     * </p>
     */
    private Integer availableAddressCount;

    /**
     * <p>
     * The first IP address in the range.
     * </p>
     * 
     * @param firstAddress
     *        The first IP address in the range.
     */

    public void setFirstAddress(String firstAddress) {
        this.firstAddress = firstAddress;
    }

    /**
     * <p>
     * The first IP address in the range.
     * </p>
     * 
     * @return The first IP address in the range.
     */

    public String getFirstAddress() {
        return this.firstAddress;
    }

    /**
     * <p>
     * The first IP address in the range.
     * </p>
     * 
     * @param firstAddress
     *        The first IP address in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4PoolRange withFirstAddress(String firstAddress) {
        setFirstAddress(firstAddress);
        return this;
    }

    /**
     * <p>
     * The last IP address in the range.
     * </p>
     * 
     * @param lastAddress
     *        The last IP address in the range.
     */

    public void setLastAddress(String lastAddress) {
        this.lastAddress = lastAddress;
    }

    /**
     * <p>
     * The last IP address in the range.
     * </p>
     * 
     * @return The last IP address in the range.
     */

    public String getLastAddress() {
        return this.lastAddress;
    }

    /**
     * <p>
     * The last IP address in the range.
     * </p>
     * 
     * @param lastAddress
     *        The last IP address in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4PoolRange withLastAddress(String lastAddress) {
        setLastAddress(lastAddress);
        return this;
    }

    /**
     * <p>
     * The number of addresses in the range.
     * </p>
     * 
     * @param addressCount
     *        The number of addresses in the range.
     */

    public void setAddressCount(Integer addressCount) {
        this.addressCount = addressCount;
    }

    /**
     * <p>
     * The number of addresses in the range.
     * </p>
     * 
     * @return The number of addresses in the range.
     */

    public Integer getAddressCount() {
        return this.addressCount;
    }

    /**
     * <p>
     * The number of addresses in the range.
     * </p>
     * 
     * @param addressCount
     *        The number of addresses in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4PoolRange withAddressCount(Integer addressCount) {
        setAddressCount(addressCount);
        return this;
    }

    /**
     * <p>
     * The number of available addresses in the range.
     * </p>
     * 
     * @param availableAddressCount
     *        The number of available addresses in the range.
     */

    public void setAvailableAddressCount(Integer availableAddressCount) {
        this.availableAddressCount = availableAddressCount;
    }

    /**
     * <p>
     * The number of available addresses in the range.
     * </p>
     * 
     * @return The number of available addresses in the range.
     */

    public Integer getAvailableAddressCount() {
        return this.availableAddressCount;
    }

    /**
     * <p>
     * The number of available addresses in the range.
     * </p>
     * 
     * @param availableAddressCount
     *        The number of available addresses in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicIpv4PoolRange withAvailableAddressCount(Integer availableAddressCount) {
        setAvailableAddressCount(availableAddressCount);
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
        if (getFirstAddress() != null)
            sb.append("FirstAddress: ").append(getFirstAddress()).append(",");
        if (getLastAddress() != null)
            sb.append("LastAddress: ").append(getLastAddress()).append(",");
        if (getAddressCount() != null)
            sb.append("AddressCount: ").append(getAddressCount()).append(",");
        if (getAvailableAddressCount() != null)
            sb.append("AvailableAddressCount: ").append(getAvailableAddressCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicIpv4PoolRange == false)
            return false;
        PublicIpv4PoolRange other = (PublicIpv4PoolRange) obj;
        if (other.getFirstAddress() == null ^ this.getFirstAddress() == null)
            return false;
        if (other.getFirstAddress() != null && other.getFirstAddress().equals(this.getFirstAddress()) == false)
            return false;
        if (other.getLastAddress() == null ^ this.getLastAddress() == null)
            return false;
        if (other.getLastAddress() != null && other.getLastAddress().equals(this.getLastAddress()) == false)
            return false;
        if (other.getAddressCount() == null ^ this.getAddressCount() == null)
            return false;
        if (other.getAddressCount() != null && other.getAddressCount().equals(this.getAddressCount()) == false)
            return false;
        if (other.getAvailableAddressCount() == null ^ this.getAvailableAddressCount() == null)
            return false;
        if (other.getAvailableAddressCount() != null && other.getAvailableAddressCount().equals(this.getAvailableAddressCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstAddress() == null) ? 0 : getFirstAddress().hashCode());
        hashCode = prime * hashCode + ((getLastAddress() == null) ? 0 : getLastAddress().hashCode());
        hashCode = prime * hashCode + ((getAddressCount() == null) ? 0 : getAddressCount().hashCode());
        hashCode = prime * hashCode + ((getAvailableAddressCount() == null) ? 0 : getAvailableAddressCount().hashCode());
        return hashCode;
    }

    @Override
    public PublicIpv4PoolRange clone() {
        try {
            return (PublicIpv4PoolRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
