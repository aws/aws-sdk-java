/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an internet provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/IpOrganizationDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpOrganizationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider
     * </p>
     */
    private Integer asn;
    /**
     * <p>
     * The name of the organization that registered the ASN.
     * </p>
     */
    private String asnOrg;
    /**
     * <p>
     * The ISP information for the internet provider.
     * </p>
     */
    private String isp;
    /**
     * <p>
     * The name of the internet provider.
     * </p>
     */
    private String org;

    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider
     * </p>
     * 
     * @param asn
     *        The Autonomous System Number (ASN) of the internet provider
     */

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider
     * </p>
     * 
     * @return The Autonomous System Number (ASN) of the internet provider
     */

    public Integer getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider
     * </p>
     * 
     * @param asn
     *        The Autonomous System Number (ASN) of the internet provider
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOrganizationDetails withAsn(Integer asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * The name of the organization that registered the ASN.
     * </p>
     * 
     * @param asnOrg
     *        The name of the organization that registered the ASN.
     */

    public void setAsnOrg(String asnOrg) {
        this.asnOrg = asnOrg;
    }

    /**
     * <p>
     * The name of the organization that registered the ASN.
     * </p>
     * 
     * @return The name of the organization that registered the ASN.
     */

    public String getAsnOrg() {
        return this.asnOrg;
    }

    /**
     * <p>
     * The name of the organization that registered the ASN.
     * </p>
     * 
     * @param asnOrg
     *        The name of the organization that registered the ASN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOrganizationDetails withAsnOrg(String asnOrg) {
        setAsnOrg(asnOrg);
        return this;
    }

    /**
     * <p>
     * The ISP information for the internet provider.
     * </p>
     * 
     * @param isp
     *        The ISP information for the internet provider.
     */

    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * <p>
     * The ISP information for the internet provider.
     * </p>
     * 
     * @return The ISP information for the internet provider.
     */

    public String getIsp() {
        return this.isp;
    }

    /**
     * <p>
     * The ISP information for the internet provider.
     * </p>
     * 
     * @param isp
     *        The ISP information for the internet provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOrganizationDetails withIsp(String isp) {
        setIsp(isp);
        return this;
    }

    /**
     * <p>
     * The name of the internet provider.
     * </p>
     * 
     * @param org
     *        The name of the internet provider.
     */

    public void setOrg(String org) {
        this.org = org;
    }

    /**
     * <p>
     * The name of the internet provider.
     * </p>
     * 
     * @return The name of the internet provider.
     */

    public String getOrg() {
        return this.org;
    }

    /**
     * <p>
     * The name of the internet provider.
     * </p>
     * 
     * @param org
     *        The name of the internet provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOrganizationDetails withOrg(String org) {
        setOrg(org);
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
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getAsnOrg() != null)
            sb.append("AsnOrg: ").append(getAsnOrg()).append(",");
        if (getIsp() != null)
            sb.append("Isp: ").append(getIsp()).append(",");
        if (getOrg() != null)
            sb.append("Org: ").append(getOrg());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpOrganizationDetails == false)
            return false;
        IpOrganizationDetails other = (IpOrganizationDetails) obj;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAsnOrg() == null ^ this.getAsnOrg() == null)
            return false;
        if (other.getAsnOrg() != null && other.getAsnOrg().equals(this.getAsnOrg()) == false)
            return false;
        if (other.getIsp() == null ^ this.getIsp() == null)
            return false;
        if (other.getIsp() != null && other.getIsp().equals(this.getIsp()) == false)
            return false;
        if (other.getOrg() == null ^ this.getOrg() == null)
            return false;
        if (other.getOrg() != null && other.getOrg().equals(this.getOrg()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAsnOrg() == null) ? 0 : getAsnOrg().hashCode());
        hashCode = prime * hashCode + ((getIsp() == null) ? 0 : getIsp().hashCode());
        hashCode = prime * hashCode + ((getOrg() == null) ? 0 : getOrg().hashCode());
        return hashCode;
    }

    @Override
    public IpOrganizationDetails clone() {
        try {
            return (IpOrganizationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.IpOrganizationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
