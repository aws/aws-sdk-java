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
import com.amazonaws.services.ec2.model.transform.DeprovisionPublicIpv4PoolCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeprovisionPublicIpv4PoolCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeprovisionPublicIpv4PoolCidrRequest> {

    /**
     * <p>
     * The ID of the pool that you want to deprovision the CIDR from.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The CIDR you want to deprovision from the pool.
     * </p>
     */
    private String cidr;

    /**
     * <p>
     * The ID of the pool that you want to deprovision the CIDR from.
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to deprovision the CIDR from.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to deprovision the CIDR from.
     * </p>
     * 
     * @return The ID of the pool that you want to deprovision the CIDR from.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to deprovision the CIDR from.
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to deprovision the CIDR from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprovisionPublicIpv4PoolCidrRequest withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * The CIDR you want to deprovision from the pool.
     * </p>
     * 
     * @param cidr
     *        The CIDR you want to deprovision from the pool.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR you want to deprovision from the pool.
     * </p>
     * 
     * @return The CIDR you want to deprovision from the pool.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR you want to deprovision from the pool.
     * </p>
     * 
     * @param cidr
     *        The CIDR you want to deprovision from the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprovisionPublicIpv4PoolCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeprovisionPublicIpv4PoolCidrRequest> getDryRunRequest() {
        Request<DeprovisionPublicIpv4PoolCidrRequest> request = new DeprovisionPublicIpv4PoolCidrRequestMarshaller().marshall(this);
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
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeprovisionPublicIpv4PoolCidrRequest == false)
            return false;
        DeprovisionPublicIpv4PoolCidrRequest other = (DeprovisionPublicIpv4PoolCidrRequest) obj;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        return hashCode;
    }

    @Override
    public DeprovisionPublicIpv4PoolCidrRequest clone() {
        return (DeprovisionPublicIpv4PoolCidrRequest) super.clone();
    }
}
