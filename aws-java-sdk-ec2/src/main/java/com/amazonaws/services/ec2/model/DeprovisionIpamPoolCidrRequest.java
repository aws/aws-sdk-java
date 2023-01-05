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
import com.amazonaws.services.ec2.model.transform.DeprovisionIpamPoolCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeprovisionIpamPoolCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeprovisionIpamPoolCidrRequest> {

    /**
     * <p>
     * The ID of the pool that has the CIDR you want to deprovision.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The CIDR which you want to deprovision from the pool.
     * </p>
     */
    private String cidr;

    /**
     * <p>
     * The ID of the pool that has the CIDR you want to deprovision.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the pool that has the CIDR you want to deprovision.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The ID of the pool that has the CIDR you want to deprovision.
     * </p>
     * 
     * @return The ID of the pool that has the CIDR you want to deprovision.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The ID of the pool that has the CIDR you want to deprovision.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the pool that has the CIDR you want to deprovision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprovisionIpamPoolCidrRequest withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The CIDR which you want to deprovision from the pool.
     * </p>
     * 
     * @param cidr
     *        The CIDR which you want to deprovision from the pool.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR which you want to deprovision from the pool.
     * </p>
     * 
     * @return The CIDR which you want to deprovision from the pool.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR which you want to deprovision from the pool.
     * </p>
     * 
     * @param cidr
     *        The CIDR which you want to deprovision from the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprovisionIpamPoolCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeprovisionIpamPoolCidrRequest> getDryRunRequest() {
        Request<DeprovisionIpamPoolCidrRequest> request = new DeprovisionIpamPoolCidrRequestMarshaller().marshall(this);
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

        if (obj instanceof DeprovisionIpamPoolCidrRequest == false)
            return false;
        DeprovisionIpamPoolCidrRequest other = (DeprovisionIpamPoolCidrRequest) obj;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
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

        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        return hashCode;
    }

    @Override
    public DeprovisionIpamPoolCidrRequest clone() {
        return (DeprovisionIpamPoolCidrRequest) super.clone();
    }
}
