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
import com.amazonaws.services.ec2.model.transform.AssociateIpamByoasnRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateIpamByoasnRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AssociateIpamByoasnRequest> {

    /**
     * <p>
     * A public 2-byte or 4-byte ASN.
     * </p>
     */
    private String asn;
    /**
     * <p>
     * The BYOIP CIDR you want to associate with an ASN.
     * </p>
     */
    private String cidr;

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

    public AssociateIpamByoasnRequest withAsn(String asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * The BYOIP CIDR you want to associate with an ASN.
     * </p>
     * 
     * @param cidr
     *        The BYOIP CIDR you want to associate with an ASN.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The BYOIP CIDR you want to associate with an ASN.
     * </p>
     * 
     * @return The BYOIP CIDR you want to associate with an ASN.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The BYOIP CIDR you want to associate with an ASN.
     * </p>
     * 
     * @param cidr
     *        The BYOIP CIDR you want to associate with an ASN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIpamByoasnRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssociateIpamByoasnRequest> getDryRunRequest() {
        Request<AssociateIpamByoasnRequest> request = new AssociateIpamByoasnRequestMarshaller().marshall(this);
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
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
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

        if (obj instanceof AssociateIpamByoasnRequest == false)
            return false;
        AssociateIpamByoasnRequest other = (AssociateIpamByoasnRequest) obj;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
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

        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        return hashCode;
    }

    @Override
    public AssociateIpamByoasnRequest clone() {
        return (AssociateIpamByoasnRequest) super.clone();
    }
}
