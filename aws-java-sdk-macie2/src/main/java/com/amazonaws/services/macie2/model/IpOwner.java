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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the registered owner of an IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/IpOwner" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpOwner implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The autonomous system number (ASN) for the autonomous system that included the IP address.
     * </p>
     */
    private String asn;
    /**
     * <p>
     * The organization identifier that's associated with the autonomous system number (ASN) for the autonomous system
     * that included the IP address.
     * </p>
     */
    private String asnOrg;
    /**
     * <p>
     * The name of the internet service provider (ISP) that owned the IP address.
     * </p>
     */
    private String isp;
    /**
     * <p>
     * The name of the organization that owned the IP address.
     * </p>
     */
    private String org;

    /**
     * <p>
     * The autonomous system number (ASN) for the autonomous system that included the IP address.
     * </p>
     * 
     * @param asn
     *        The autonomous system number (ASN) for the autonomous system that included the IP address.
     */

    public void setAsn(String asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the autonomous system that included the IP address.
     * </p>
     * 
     * @return The autonomous system number (ASN) for the autonomous system that included the IP address.
     */

    public String getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the autonomous system that included the IP address.
     * </p>
     * 
     * @param asn
     *        The autonomous system number (ASN) for the autonomous system that included the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOwner withAsn(String asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * The organization identifier that's associated with the autonomous system number (ASN) for the autonomous system
     * that included the IP address.
     * </p>
     * 
     * @param asnOrg
     *        The organization identifier that's associated with the autonomous system number (ASN) for the autonomous
     *        system that included the IP address.
     */

    public void setAsnOrg(String asnOrg) {
        this.asnOrg = asnOrg;
    }

    /**
     * <p>
     * The organization identifier that's associated with the autonomous system number (ASN) for the autonomous system
     * that included the IP address.
     * </p>
     * 
     * @return The organization identifier that's associated with the autonomous system number (ASN) for the autonomous
     *         system that included the IP address.
     */

    public String getAsnOrg() {
        return this.asnOrg;
    }

    /**
     * <p>
     * The organization identifier that's associated with the autonomous system number (ASN) for the autonomous system
     * that included the IP address.
     * </p>
     * 
     * @param asnOrg
     *        The organization identifier that's associated with the autonomous system number (ASN) for the autonomous
     *        system that included the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOwner withAsnOrg(String asnOrg) {
        setAsnOrg(asnOrg);
        return this;
    }

    /**
     * <p>
     * The name of the internet service provider (ISP) that owned the IP address.
     * </p>
     * 
     * @param isp
     *        The name of the internet service provider (ISP) that owned the IP address.
     */

    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * <p>
     * The name of the internet service provider (ISP) that owned the IP address.
     * </p>
     * 
     * @return The name of the internet service provider (ISP) that owned the IP address.
     */

    public String getIsp() {
        return this.isp;
    }

    /**
     * <p>
     * The name of the internet service provider (ISP) that owned the IP address.
     * </p>
     * 
     * @param isp
     *        The name of the internet service provider (ISP) that owned the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOwner withIsp(String isp) {
        setIsp(isp);
        return this;
    }

    /**
     * <p>
     * The name of the organization that owned the IP address.
     * </p>
     * 
     * @param org
     *        The name of the organization that owned the IP address.
     */

    public void setOrg(String org) {
        this.org = org;
    }

    /**
     * <p>
     * The name of the organization that owned the IP address.
     * </p>
     * 
     * @return The name of the organization that owned the IP address.
     */

    public String getOrg() {
        return this.org;
    }

    /**
     * <p>
     * The name of the organization that owned the IP address.
     * </p>
     * 
     * @param org
     *        The name of the organization that owned the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpOwner withOrg(String org) {
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

        if (obj instanceof IpOwner == false)
            return false;
        IpOwner other = (IpOwner) obj;
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
    public IpOwner clone() {
        try {
            return (IpOwner) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.IpOwnerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
