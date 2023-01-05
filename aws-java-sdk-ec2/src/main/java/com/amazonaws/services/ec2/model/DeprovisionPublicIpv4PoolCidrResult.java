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
public class DeprovisionPublicIpv4PoolCidrResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the pool that you deprovisioned the CIDR from.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The deprovisioned CIDRs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deprovisionedAddresses;

    /**
     * <p>
     * The ID of the pool that you deprovisioned the CIDR from.
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you deprovisioned the CIDR from.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that you deprovisioned the CIDR from.
     * </p>
     * 
     * @return The ID of the pool that you deprovisioned the CIDR from.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the pool that you deprovisioned the CIDR from.
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you deprovisioned the CIDR from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprovisionPublicIpv4PoolCidrResult withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * The deprovisioned CIDRs.
     * </p>
     * 
     * @return The deprovisioned CIDRs.
     */

    public java.util.List<String> getDeprovisionedAddresses() {
        if (deprovisionedAddresses == null) {
            deprovisionedAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deprovisionedAddresses;
    }

    /**
     * <p>
     * The deprovisioned CIDRs.
     * </p>
     * 
     * @param deprovisionedAddresses
     *        The deprovisioned CIDRs.
     */

    public void setDeprovisionedAddresses(java.util.Collection<String> deprovisionedAddresses) {
        if (deprovisionedAddresses == null) {
            this.deprovisionedAddresses = null;
            return;
        }

        this.deprovisionedAddresses = new com.amazonaws.internal.SdkInternalList<String>(deprovisionedAddresses);
    }

    /**
     * <p>
     * The deprovisioned CIDRs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeprovisionedAddresses(java.util.Collection)} or
     * {@link #withDeprovisionedAddresses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deprovisionedAddresses
     *        The deprovisioned CIDRs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprovisionPublicIpv4PoolCidrResult withDeprovisionedAddresses(String... deprovisionedAddresses) {
        if (this.deprovisionedAddresses == null) {
            setDeprovisionedAddresses(new com.amazonaws.internal.SdkInternalList<String>(deprovisionedAddresses.length));
        }
        for (String ele : deprovisionedAddresses) {
            this.deprovisionedAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The deprovisioned CIDRs.
     * </p>
     * 
     * @param deprovisionedAddresses
     *        The deprovisioned CIDRs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprovisionPublicIpv4PoolCidrResult withDeprovisionedAddresses(java.util.Collection<String> deprovisionedAddresses) {
        setDeprovisionedAddresses(deprovisionedAddresses);
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
        if (getDeprovisionedAddresses() != null)
            sb.append("DeprovisionedAddresses: ").append(getDeprovisionedAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeprovisionPublicIpv4PoolCidrResult == false)
            return false;
        DeprovisionPublicIpv4PoolCidrResult other = (DeprovisionPublicIpv4PoolCidrResult) obj;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getDeprovisionedAddresses() == null ^ this.getDeprovisionedAddresses() == null)
            return false;
        if (other.getDeprovisionedAddresses() != null && other.getDeprovisionedAddresses().equals(this.getDeprovisionedAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getDeprovisionedAddresses() == null) ? 0 : getDeprovisionedAddresses().hashCode());
        return hashCode;
    }

    @Override
    public DeprovisionPublicIpv4PoolCidrResult clone() {
        try {
            return (DeprovisionPublicIpv4PoolCidrResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
