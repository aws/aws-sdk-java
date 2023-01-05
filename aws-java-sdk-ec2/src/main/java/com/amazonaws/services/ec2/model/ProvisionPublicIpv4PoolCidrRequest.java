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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ProvisionPublicIpv4PoolCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionPublicIpv4PoolCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ProvisionPublicIpv4PoolCidrRequest> {

    /**
     * <p>
     * The ID of the IPAM pool you would like to use to allocate this CIDR.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The ID of the public IPv4 pool you would like to use for this CIDR.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The netmask length of the CIDR you would like to allocate to the public IPv4 pool.
     * </p>
     */
    private Integer netmaskLength;

    /**
     * <p>
     * The ID of the IPAM pool you would like to use to allocate this CIDR.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool you would like to use to allocate this CIDR.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool you would like to use to allocate this CIDR.
     * </p>
     * 
     * @return The ID of the IPAM pool you would like to use to allocate this CIDR.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool you would like to use to allocate this CIDR.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool you would like to use to allocate this CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionPublicIpv4PoolCidrRequest withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The ID of the public IPv4 pool you would like to use for this CIDR.
     * </p>
     * 
     * @param poolId
     *        The ID of the public IPv4 pool you would like to use for this CIDR.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the public IPv4 pool you would like to use for this CIDR.
     * </p>
     * 
     * @return The ID of the public IPv4 pool you would like to use for this CIDR.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the public IPv4 pool you would like to use for this CIDR.
     * </p>
     * 
     * @param poolId
     *        The ID of the public IPv4 pool you would like to use for this CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionPublicIpv4PoolCidrRequest withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * The netmask length of the CIDR you would like to allocate to the public IPv4 pool.
     * </p>
     * 
     * @param netmaskLength
     *        The netmask length of the CIDR you would like to allocate to the public IPv4 pool.
     */

    public void setNetmaskLength(Integer netmaskLength) {
        this.netmaskLength = netmaskLength;
    }

    /**
     * <p>
     * The netmask length of the CIDR you would like to allocate to the public IPv4 pool.
     * </p>
     * 
     * @return The netmask length of the CIDR you would like to allocate to the public IPv4 pool.
     */

    public Integer getNetmaskLength() {
        return this.netmaskLength;
    }

    /**
     * <p>
     * The netmask length of the CIDR you would like to allocate to the public IPv4 pool.
     * </p>
     * 
     * @param netmaskLength
     *        The netmask length of the CIDR you would like to allocate to the public IPv4 pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionPublicIpv4PoolCidrRequest withNetmaskLength(Integer netmaskLength) {
        setNetmaskLength(netmaskLength);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ProvisionPublicIpv4PoolCidrRequest> getDryRunRequest() {
        Request<ProvisionPublicIpv4PoolCidrRequest> request = new ProvisionPublicIpv4PoolCidrRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getIpamPoolId() != null)
            sb.append("IpamPoolId: ").append(getIpamPoolId()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getNetmaskLength() != null)
            sb.append("NetmaskLength: ").append(getNetmaskLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionPublicIpv4PoolCidrRequest == false)
            return false;
        ProvisionPublicIpv4PoolCidrRequest other = (ProvisionPublicIpv4PoolCidrRequest) obj;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getNetmaskLength() == null ^ this.getNetmaskLength() == null)
            return false;
        if (other.getNetmaskLength() != null && other.getNetmaskLength().equals(this.getNetmaskLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getNetmaskLength() == null) ? 0 : getNetmaskLength().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionPublicIpv4PoolCidrRequest clone() {
        return (ProvisionPublicIpv4PoolCidrRequest) super.clone();
    }
}
