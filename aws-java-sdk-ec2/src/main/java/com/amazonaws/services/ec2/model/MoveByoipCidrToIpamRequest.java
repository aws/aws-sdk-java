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
import com.amazonaws.services.ec2.model.transform.MoveByoipCidrToIpamRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MoveByoipCidrToIpamRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<MoveByoipCidrToIpamRequest> {

    /**
     * <p>
     * The BYOIP CIDR.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The IPAM pool ID.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM pool.
     * </p>
     */
    private String ipamPoolOwner;

    /**
     * <p>
     * The BYOIP CIDR.
     * </p>
     * 
     * @param cidr
     *        The BYOIP CIDR.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The BYOIP CIDR.
     * </p>
     * 
     * @return The BYOIP CIDR.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The BYOIP CIDR.
     * </p>
     * 
     * @param cidr
     *        The BYOIP CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MoveByoipCidrToIpamRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The IPAM pool ID.
     * </p>
     * 
     * @param ipamPoolId
     *        The IPAM pool ID.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The IPAM pool ID.
     * </p>
     * 
     * @return The IPAM pool ID.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The IPAM pool ID.
     * </p>
     * 
     * @param ipamPoolId
     *        The IPAM pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MoveByoipCidrToIpamRequest withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM pool.
     * </p>
     * 
     * @param ipamPoolOwner
     *        The Amazon Web Services account ID of the owner of the IPAM pool.
     */

    public void setIpamPoolOwner(String ipamPoolOwner) {
        this.ipamPoolOwner = ipamPoolOwner;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM pool.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the owner of the IPAM pool.
     */

    public String getIpamPoolOwner() {
        return this.ipamPoolOwner;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM pool.
     * </p>
     * 
     * @param ipamPoolOwner
     *        The Amazon Web Services account ID of the owner of the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MoveByoipCidrToIpamRequest withIpamPoolOwner(String ipamPoolOwner) {
        setIpamPoolOwner(ipamPoolOwner);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<MoveByoipCidrToIpamRequest> getDryRunRequest() {
        Request<MoveByoipCidrToIpamRequest> request = new MoveByoipCidrToIpamRequestMarshaller().marshall(this);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getIpamPoolId() != null)
            sb.append("IpamPoolId: ").append(getIpamPoolId()).append(",");
        if (getIpamPoolOwner() != null)
            sb.append("IpamPoolOwner: ").append(getIpamPoolOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MoveByoipCidrToIpamRequest == false)
            return false;
        MoveByoipCidrToIpamRequest other = (MoveByoipCidrToIpamRequest) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        if (other.getIpamPoolOwner() == null ^ this.getIpamPoolOwner() == null)
            return false;
        if (other.getIpamPoolOwner() != null && other.getIpamPoolOwner().equals(this.getIpamPoolOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getIpamPoolOwner() == null) ? 0 : getIpamPoolOwner().hashCode());
        return hashCode;
    }

    @Override
    public MoveByoipCidrToIpamRequest clone() {
        return (MoveByoipCidrToIpamRequest) super.clone();
    }
}
