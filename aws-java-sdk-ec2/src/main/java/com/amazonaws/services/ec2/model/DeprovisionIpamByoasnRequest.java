/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DeprovisionIpamByoasnRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeprovisionIpamByoasnRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeprovisionIpamByoasnRequest> {

    /**
     * <p>
     * The IPAM ID.
     * </p>
     */
    private String ipamId;
    /**
     * <p>
     * An ASN.
     * </p>
     */
    private String asn;

    /**
     * <p>
     * The IPAM ID.
     * </p>
     * 
     * @param ipamId
     *        The IPAM ID.
     */

    public void setIpamId(String ipamId) {
        this.ipamId = ipamId;
    }

    /**
     * <p>
     * The IPAM ID.
     * </p>
     * 
     * @return The IPAM ID.
     */

    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * <p>
     * The IPAM ID.
     * </p>
     * 
     * @param ipamId
     *        The IPAM ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprovisionIpamByoasnRequest withIpamId(String ipamId) {
        setIpamId(ipamId);
        return this;
    }

    /**
     * <p>
     * An ASN.
     * </p>
     * 
     * @param asn
     *        An ASN.
     */

    public void setAsn(String asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * An ASN.
     * </p>
     * 
     * @return An ASN.
     */

    public String getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * An ASN.
     * </p>
     * 
     * @param asn
     *        An ASN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprovisionIpamByoasnRequest withAsn(String asn) {
        setAsn(asn);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeprovisionIpamByoasnRequest> getDryRunRequest() {
        Request<DeprovisionIpamByoasnRequest> request = new DeprovisionIpamByoasnRequestMarshaller().marshall(this);
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
        if (getIpamId() != null)
            sb.append("IpamId: ").append(getIpamId()).append(",");
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeprovisionIpamByoasnRequest == false)
            return false;
        DeprovisionIpamByoasnRequest other = (DeprovisionIpamByoasnRequest) obj;
        if (other.getIpamId() == null ^ this.getIpamId() == null)
            return false;
        if (other.getIpamId() != null && other.getIpamId().equals(this.getIpamId()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamId() == null) ? 0 : getIpamId().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        return hashCode;
    }

    @Override
    public DeprovisionIpamByoasnRequest clone() {
        return (DeprovisionIpamByoasnRequest) super.clone();
    }
}
