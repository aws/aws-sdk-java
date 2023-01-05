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
import com.amazonaws.services.ec2.model.transform.ProvisionIpamPoolCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionIpamPoolCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ProvisionIpamPoolCidrRequest> {

    /**
     * <p>
     * The ID of the IPAM pool to which you want to assign a CIDR.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The CIDR you want to assign to the IPAM pool.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * A signed document that proves that you are authorized to bring a specified IP address range to Amazon using
     * BYOIP. This option applies to public pools only.
     * </p>
     */
    private IpamCidrAuthorizationContext cidrAuthorizationContext;

    /**
     * <p>
     * The ID of the IPAM pool to which you want to assign a CIDR.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool to which you want to assign a CIDR.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool to which you want to assign a CIDR.
     * </p>
     * 
     * @return The ID of the IPAM pool to which you want to assign a CIDR.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool to which you want to assign a CIDR.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool to which you want to assign a CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamPoolCidrRequest withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The CIDR you want to assign to the IPAM pool.
     * </p>
     * 
     * @param cidr
     *        The CIDR you want to assign to the IPAM pool.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR you want to assign to the IPAM pool.
     * </p>
     * 
     * @return The CIDR you want to assign to the IPAM pool.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR you want to assign to the IPAM pool.
     * </p>
     * 
     * @param cidr
     *        The CIDR you want to assign to the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamPoolCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring a specified IP address range to Amazon using
     * BYOIP. This option applies to public pools only.
     * </p>
     * 
     * @param cidrAuthorizationContext
     *        A signed document that proves that you are authorized to bring a specified IP address range to Amazon
     *        using BYOIP. This option applies to public pools only.
     */

    public void setCidrAuthorizationContext(IpamCidrAuthorizationContext cidrAuthorizationContext) {
        this.cidrAuthorizationContext = cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring a specified IP address range to Amazon using
     * BYOIP. This option applies to public pools only.
     * </p>
     * 
     * @return A signed document that proves that you are authorized to bring a specified IP address range to Amazon
     *         using BYOIP. This option applies to public pools only.
     */

    public IpamCidrAuthorizationContext getCidrAuthorizationContext() {
        return this.cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring a specified IP address range to Amazon using
     * BYOIP. This option applies to public pools only.
     * </p>
     * 
     * @param cidrAuthorizationContext
     *        A signed document that proves that you are authorized to bring a specified IP address range to Amazon
     *        using BYOIP. This option applies to public pools only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamPoolCidrRequest withCidrAuthorizationContext(IpamCidrAuthorizationContext cidrAuthorizationContext) {
        setCidrAuthorizationContext(cidrAuthorizationContext);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ProvisionIpamPoolCidrRequest> getDryRunRequest() {
        Request<ProvisionIpamPoolCidrRequest> request = new ProvisionIpamPoolCidrRequestMarshaller().marshall(this);
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
        if (getCidrAuthorizationContext() != null)
            sb.append("CidrAuthorizationContext: ").append(getCidrAuthorizationContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionIpamPoolCidrRequest == false)
            return false;
        ProvisionIpamPoolCidrRequest other = (ProvisionIpamPoolCidrRequest) obj;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getCidrAuthorizationContext() == null ^ this.getCidrAuthorizationContext() == null)
            return false;
        if (other.getCidrAuthorizationContext() != null && other.getCidrAuthorizationContext().equals(this.getCidrAuthorizationContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getCidrAuthorizationContext() == null) ? 0 : getCidrAuthorizationContext().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionIpamPoolCidrRequest clone() {
        return (ProvisionIpamPoolCidrRequest) super.clone();
    }
}
