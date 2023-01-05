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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionPublicIpv4PoolCidrResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the pool that you want to provision the CIDR to.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * Information about the address range of the public IPv4 pool.
     * </p>
     */
    private PublicIpv4PoolRange poolAddressRange;

    /**
     * <p>
     * The ID of the pool that you want to provision the CIDR to.
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to provision the CIDR to.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to provision the CIDR to.
     * </p>
     * 
     * @return The ID of the pool that you want to provision the CIDR to.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to provision the CIDR to.
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to provision the CIDR to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionPublicIpv4PoolCidrResult withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * Information about the address range of the public IPv4 pool.
     * </p>
     * 
     * @param poolAddressRange
     *        Information about the address range of the public IPv4 pool.
     */

    public void setPoolAddressRange(PublicIpv4PoolRange poolAddressRange) {
        this.poolAddressRange = poolAddressRange;
    }

    /**
     * <p>
     * Information about the address range of the public IPv4 pool.
     * </p>
     * 
     * @return Information about the address range of the public IPv4 pool.
     */

    public PublicIpv4PoolRange getPoolAddressRange() {
        return this.poolAddressRange;
    }

    /**
     * <p>
     * Information about the address range of the public IPv4 pool.
     * </p>
     * 
     * @param poolAddressRange
     *        Information about the address range of the public IPv4 pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionPublicIpv4PoolCidrResult withPoolAddressRange(PublicIpv4PoolRange poolAddressRange) {
        setPoolAddressRange(poolAddressRange);
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
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getPoolAddressRange() != null)
            sb.append("PoolAddressRange: ").append(getPoolAddressRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionPublicIpv4PoolCidrResult == false)
            return false;
        ProvisionPublicIpv4PoolCidrResult other = (ProvisionPublicIpv4PoolCidrResult) obj;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getPoolAddressRange() == null ^ this.getPoolAddressRange() == null)
            return false;
        if (other.getPoolAddressRange() != null && other.getPoolAddressRange().equals(this.getPoolAddressRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getPoolAddressRange() == null) ? 0 : getPoolAddressRange().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionPublicIpv4PoolCidrResult clone() {
        try {
            return (ProvisionPublicIpv4PoolCidrResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
