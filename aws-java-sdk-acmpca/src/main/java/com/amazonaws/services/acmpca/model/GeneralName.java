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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an ASN.1 X.400 <code>GeneralName</code> as defined in <a href="https://tools.ietf.org/html/rfc5280">RFC
 * 5280</a>. Only one of the following naming options should be provided. Providing more than one option results in an
 * <code>InvalidArgsException</code> error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GeneralName" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneralName implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents <code>GeneralName</code> using an <code>OtherName</code> object.
     * </p>
     */
    private OtherName otherName;
    /**
     * <p>
     * Represents <code>GeneralName</code> as an <a href="https://tools.ietf.org/html/rfc822">RFC 822</a> email address.
     * </p>
     */
    private String rfc822Name;
    /**
     * <p>
     * Represents <code>GeneralName</code> as a DNS name.
     * </p>
     */
    private String dnsName;

    private ASN1Subject directoryName;
    /**
     * <p>
     * Represents <code>GeneralName</code> as an <code>EdiPartyName</code> object.
     * </p>
     */
    private EdiPartyName ediPartyName;
    /**
     * <p>
     * Represents <code>GeneralName</code> as a URI.
     * </p>
     */
    private String uniformResourceIdentifier;
    /**
     * <p>
     * Represents <code>GeneralName</code> as an IPv4 or IPv6 address.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Represents <code>GeneralName</code> as an object identifier (OID).
     * </p>
     */
    private String registeredId;

    /**
     * <p>
     * Represents <code>GeneralName</code> using an <code>OtherName</code> object.
     * </p>
     * 
     * @param otherName
     *        Represents <code>GeneralName</code> using an <code>OtherName</code> object.
     */

    public void setOtherName(OtherName otherName) {
        this.otherName = otherName;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> using an <code>OtherName</code> object.
     * </p>
     * 
     * @return Represents <code>GeneralName</code> using an <code>OtherName</code> object.
     */

    public OtherName getOtherName() {
        return this.otherName;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> using an <code>OtherName</code> object.
     * </p>
     * 
     * @param otherName
     *        Represents <code>GeneralName</code> using an <code>OtherName</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralName withOtherName(OtherName otherName) {
        setOtherName(otherName);
        return this;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an <a href="https://tools.ietf.org/html/rfc822">RFC 822</a> email address.
     * </p>
     * 
     * @param rfc822Name
     *        Represents <code>GeneralName</code> as an <a href="https://tools.ietf.org/html/rfc822">RFC 822</a> email
     *        address.
     */

    public void setRfc822Name(String rfc822Name) {
        this.rfc822Name = rfc822Name;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an <a href="https://tools.ietf.org/html/rfc822">RFC 822</a> email address.
     * </p>
     * 
     * @return Represents <code>GeneralName</code> as an <a href="https://tools.ietf.org/html/rfc822">RFC 822</a> email
     *         address.
     */

    public String getRfc822Name() {
        return this.rfc822Name;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an <a href="https://tools.ietf.org/html/rfc822">RFC 822</a> email address.
     * </p>
     * 
     * @param rfc822Name
     *        Represents <code>GeneralName</code> as an <a href="https://tools.ietf.org/html/rfc822">RFC 822</a> email
     *        address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralName withRfc822Name(String rfc822Name) {
        setRfc822Name(rfc822Name);
        return this;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as a DNS name.
     * </p>
     * 
     * @param dnsName
     *        Represents <code>GeneralName</code> as a DNS name.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as a DNS name.
     * </p>
     * 
     * @return Represents <code>GeneralName</code> as a DNS name.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as a DNS name.
     * </p>
     * 
     * @param dnsName
     *        Represents <code>GeneralName</code> as a DNS name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralName withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * @param directoryName
     */

    public void setDirectoryName(ASN1Subject directoryName) {
        this.directoryName = directoryName;
    }

    /**
     * @return
     */

    public ASN1Subject getDirectoryName() {
        return this.directoryName;
    }

    /**
     * @param directoryName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralName withDirectoryName(ASN1Subject directoryName) {
        setDirectoryName(directoryName);
        return this;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an <code>EdiPartyName</code> object.
     * </p>
     * 
     * @param ediPartyName
     *        Represents <code>GeneralName</code> as an <code>EdiPartyName</code> object.
     */

    public void setEdiPartyName(EdiPartyName ediPartyName) {
        this.ediPartyName = ediPartyName;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an <code>EdiPartyName</code> object.
     * </p>
     * 
     * @return Represents <code>GeneralName</code> as an <code>EdiPartyName</code> object.
     */

    public EdiPartyName getEdiPartyName() {
        return this.ediPartyName;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an <code>EdiPartyName</code> object.
     * </p>
     * 
     * @param ediPartyName
     *        Represents <code>GeneralName</code> as an <code>EdiPartyName</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralName withEdiPartyName(EdiPartyName ediPartyName) {
        setEdiPartyName(ediPartyName);
        return this;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as a URI.
     * </p>
     * 
     * @param uniformResourceIdentifier
     *        Represents <code>GeneralName</code> as a URI.
     */

    public void setUniformResourceIdentifier(String uniformResourceIdentifier) {
        this.uniformResourceIdentifier = uniformResourceIdentifier;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as a URI.
     * </p>
     * 
     * @return Represents <code>GeneralName</code> as a URI.
     */

    public String getUniformResourceIdentifier() {
        return this.uniformResourceIdentifier;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as a URI.
     * </p>
     * 
     * @param uniformResourceIdentifier
     *        Represents <code>GeneralName</code> as a URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralName withUniformResourceIdentifier(String uniformResourceIdentifier) {
        setUniformResourceIdentifier(uniformResourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an IPv4 or IPv6 address.
     * </p>
     * 
     * @param ipAddress
     *        Represents <code>GeneralName</code> as an IPv4 or IPv6 address.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an IPv4 or IPv6 address.
     * </p>
     * 
     * @return Represents <code>GeneralName</code> as an IPv4 or IPv6 address.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an IPv4 or IPv6 address.
     * </p>
     * 
     * @param ipAddress
     *        Represents <code>GeneralName</code> as an IPv4 or IPv6 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralName withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an object identifier (OID).
     * </p>
     * 
     * @param registeredId
     *        Represents <code>GeneralName</code> as an object identifier (OID).
     */

    public void setRegisteredId(String registeredId) {
        this.registeredId = registeredId;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an object identifier (OID).
     * </p>
     * 
     * @return Represents <code>GeneralName</code> as an object identifier (OID).
     */

    public String getRegisteredId() {
        return this.registeredId;
    }

    /**
     * <p>
     * Represents <code>GeneralName</code> as an object identifier (OID).
     * </p>
     * 
     * @param registeredId
     *        Represents <code>GeneralName</code> as an object identifier (OID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralName withRegisteredId(String registeredId) {
        setRegisteredId(registeredId);
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
        if (getOtherName() != null)
            sb.append("OtherName: ").append(getOtherName()).append(",");
        if (getRfc822Name() != null)
            sb.append("Rfc822Name: ").append(getRfc822Name()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getDirectoryName() != null)
            sb.append("DirectoryName: ").append(getDirectoryName()).append(",");
        if (getEdiPartyName() != null)
            sb.append("EdiPartyName: ").append(getEdiPartyName()).append(",");
        if (getUniformResourceIdentifier() != null)
            sb.append("UniformResourceIdentifier: ").append(getUniformResourceIdentifier()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getRegisteredId() != null)
            sb.append("RegisteredId: ").append(getRegisteredId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeneralName == false)
            return false;
        GeneralName other = (GeneralName) obj;
        if (other.getOtherName() == null ^ this.getOtherName() == null)
            return false;
        if (other.getOtherName() != null && other.getOtherName().equals(this.getOtherName()) == false)
            return false;
        if (other.getRfc822Name() == null ^ this.getRfc822Name() == null)
            return false;
        if (other.getRfc822Name() != null && other.getRfc822Name().equals(this.getRfc822Name()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getDirectoryName() == null ^ this.getDirectoryName() == null)
            return false;
        if (other.getDirectoryName() != null && other.getDirectoryName().equals(this.getDirectoryName()) == false)
            return false;
        if (other.getEdiPartyName() == null ^ this.getEdiPartyName() == null)
            return false;
        if (other.getEdiPartyName() != null && other.getEdiPartyName().equals(this.getEdiPartyName()) == false)
            return false;
        if (other.getUniformResourceIdentifier() == null ^ this.getUniformResourceIdentifier() == null)
            return false;
        if (other.getUniformResourceIdentifier() != null && other.getUniformResourceIdentifier().equals(this.getUniformResourceIdentifier()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getRegisteredId() == null ^ this.getRegisteredId() == null)
            return false;
        if (other.getRegisteredId() != null && other.getRegisteredId().equals(this.getRegisteredId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtherName() == null) ? 0 : getOtherName().hashCode());
        hashCode = prime * hashCode + ((getRfc822Name() == null) ? 0 : getRfc822Name().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getDirectoryName() == null) ? 0 : getDirectoryName().hashCode());
        hashCode = prime * hashCode + ((getEdiPartyName() == null) ? 0 : getEdiPartyName().hashCode());
        hashCode = prime * hashCode + ((getUniformResourceIdentifier() == null) ? 0 : getUniformResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getRegisteredId() == null) ? 0 : getRegisteredId().hashCode());
        return hashCode;
    }

    @Override
    public GeneralName clone() {
        try {
            return (GeneralName) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.GeneralNameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
