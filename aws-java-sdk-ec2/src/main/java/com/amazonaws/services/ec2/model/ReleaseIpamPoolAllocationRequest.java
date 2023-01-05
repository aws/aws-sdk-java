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
import com.amazonaws.services.ec2.model.transform.ReleaseIpamPoolAllocationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleaseIpamPoolAllocationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ReleaseIpamPoolAllocationRequest> {

    /**
     * <p>
     * The ID of the IPAM pool which contains the allocation you want to release.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The CIDR of the allocation you want to release.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The ID of the allocation.
     * </p>
     */
    private String ipamPoolAllocationId;

    /**
     * <p>
     * The ID of the IPAM pool which contains the allocation you want to release.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool which contains the allocation you want to release.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool which contains the allocation you want to release.
     * </p>
     * 
     * @return The ID of the IPAM pool which contains the allocation you want to release.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool which contains the allocation you want to release.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool which contains the allocation you want to release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseIpamPoolAllocationRequest withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The CIDR of the allocation you want to release.
     * </p>
     * 
     * @param cidr
     *        The CIDR of the allocation you want to release.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR of the allocation you want to release.
     * </p>
     * 
     * @return The CIDR of the allocation you want to release.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR of the allocation you want to release.
     * </p>
     * 
     * @param cidr
     *        The CIDR of the allocation you want to release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseIpamPoolAllocationRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The ID of the allocation.
     * </p>
     * 
     * @param ipamPoolAllocationId
     *        The ID of the allocation.
     */

    public void setIpamPoolAllocationId(String ipamPoolAllocationId) {
        this.ipamPoolAllocationId = ipamPoolAllocationId;
    }

    /**
     * <p>
     * The ID of the allocation.
     * </p>
     * 
     * @return The ID of the allocation.
     */

    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    /**
     * <p>
     * The ID of the allocation.
     * </p>
     * 
     * @param ipamPoolAllocationId
     *        The ID of the allocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseIpamPoolAllocationRequest withIpamPoolAllocationId(String ipamPoolAllocationId) {
        setIpamPoolAllocationId(ipamPoolAllocationId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ReleaseIpamPoolAllocationRequest> getDryRunRequest() {
        Request<ReleaseIpamPoolAllocationRequest> request = new ReleaseIpamPoolAllocationRequestMarshaller().marshall(this);
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
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getIpamPoolAllocationId() != null)
            sb.append("IpamPoolAllocationId: ").append(getIpamPoolAllocationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleaseIpamPoolAllocationRequest == false)
            return false;
        ReleaseIpamPoolAllocationRequest other = (ReleaseIpamPoolAllocationRequest) obj;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getIpamPoolAllocationId() == null ^ this.getIpamPoolAllocationId() == null)
            return false;
        if (other.getIpamPoolAllocationId() != null && other.getIpamPoolAllocationId().equals(this.getIpamPoolAllocationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getIpamPoolAllocationId() == null) ? 0 : getIpamPoolAllocationId().hashCode());
        return hashCode;
    }

    @Override
    public ReleaseIpamPoolAllocationRequest clone() {
        return (ReleaseIpamPoolAllocationRequest) super.clone();
    }
}
