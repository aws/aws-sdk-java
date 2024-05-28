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
import com.amazonaws.services.ec2.model.transform.ProvisionIpamByoasnRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionIpamByoasnRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ProvisionIpamByoasnRequest> {

    /**
     * <p>
     * An IPAM ID.
     * </p>
     */
    private String ipamId;
    /**
     * <p>
     * A public 2-byte or 4-byte ASN.
     * </p>
     */
    private String asn;
    /**
     * <p>
     * An ASN authorization context.
     * </p>
     */
    private AsnAuthorizationContext asnAuthorizationContext;

    /**
     * <p>
     * An IPAM ID.
     * </p>
     * 
     * @param ipamId
     *        An IPAM ID.
     */

    public void setIpamId(String ipamId) {
        this.ipamId = ipamId;
    }

    /**
     * <p>
     * An IPAM ID.
     * </p>
     * 
     * @return An IPAM ID.
     */

    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * <p>
     * An IPAM ID.
     * </p>
     * 
     * @param ipamId
     *        An IPAM ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamByoasnRequest withIpamId(String ipamId) {
        setIpamId(ipamId);
        return this;
    }

    /**
     * <p>
     * A public 2-byte or 4-byte ASN.
     * </p>
     * 
     * @param asn
     *        A public 2-byte or 4-byte ASN.
     */

    public void setAsn(String asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * A public 2-byte or 4-byte ASN.
     * </p>
     * 
     * @return A public 2-byte or 4-byte ASN.
     */

    public String getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * A public 2-byte or 4-byte ASN.
     * </p>
     * 
     * @param asn
     *        A public 2-byte or 4-byte ASN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamByoasnRequest withAsn(String asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * An ASN authorization context.
     * </p>
     * 
     * @param asnAuthorizationContext
     *        An ASN authorization context.
     */

    public void setAsnAuthorizationContext(AsnAuthorizationContext asnAuthorizationContext) {
        this.asnAuthorizationContext = asnAuthorizationContext;
    }

    /**
     * <p>
     * An ASN authorization context.
     * </p>
     * 
     * @return An ASN authorization context.
     */

    public AsnAuthorizationContext getAsnAuthorizationContext() {
        return this.asnAuthorizationContext;
    }

    /**
     * <p>
     * An ASN authorization context.
     * </p>
     * 
     * @param asnAuthorizationContext
     *        An ASN authorization context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamByoasnRequest withAsnAuthorizationContext(AsnAuthorizationContext asnAuthorizationContext) {
        setAsnAuthorizationContext(asnAuthorizationContext);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ProvisionIpamByoasnRequest> getDryRunRequest() {
        Request<ProvisionIpamByoasnRequest> request = new ProvisionIpamByoasnRequestMarshaller().marshall(this);
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
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getAsnAuthorizationContext() != null)
            sb.append("AsnAuthorizationContext: ").append(getAsnAuthorizationContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionIpamByoasnRequest == false)
            return false;
        ProvisionIpamByoasnRequest other = (ProvisionIpamByoasnRequest) obj;
        if (other.getIpamId() == null ^ this.getIpamId() == null)
            return false;
        if (other.getIpamId() != null && other.getIpamId().equals(this.getIpamId()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAsnAuthorizationContext() == null ^ this.getAsnAuthorizationContext() == null)
            return false;
        if (other.getAsnAuthorizationContext() != null && other.getAsnAuthorizationContext().equals(this.getAsnAuthorizationContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamId() == null) ? 0 : getIpamId().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAsnAuthorizationContext() == null) ? 0 : getAsnAuthorizationContext().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionIpamByoasnRequest clone() {
        return (ProvisionIpamByoasnRequest) super.clone();
    }
}
