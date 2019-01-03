/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure for Domain Association, which associates a custom domain with an Amplify App.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DomainAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN for the Domain Association.
     * </p>
     */
    private String domainAssociationArn;
    /**
     * <p>
     * Name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Enables automated creation of Subdomains for branches.
     * </p>
     */
    private Boolean enableAutoSubDomain;
    /**
     * <p>
     * Status fo the Domain Association.
     * </p>
     */
    private String domainStatus;
    /**
     * <p>
     * Reason for the current status of the Domain Association.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * DNS Record for certificate verification.
     * </p>
     */
    private String certificateVerificationDNSRecord;
    /**
     * <p>
     * Subdomains for the Domain Association.
     * </p>
     */
    private java.util.List<SubDomain> subDomains;

    /**
     * <p>
     * ARN for the Domain Association.
     * </p>
     * 
     * @param domainAssociationArn
     *        ARN for the Domain Association.
     */

    public void setDomainAssociationArn(String domainAssociationArn) {
        this.domainAssociationArn = domainAssociationArn;
    }

    /**
     * <p>
     * ARN for the Domain Association.
     * </p>
     * 
     * @return ARN for the Domain Association.
     */

    public String getDomainAssociationArn() {
        return this.domainAssociationArn;
    }

    /**
     * <p>
     * ARN for the Domain Association.
     * </p>
     * 
     * @param domainAssociationArn
     *        ARN for the Domain Association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withDomainAssociationArn(String domainAssociationArn) {
        setDomainAssociationArn(domainAssociationArn);
        return this;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @param domainName
     *        Name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @return Name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @param domainName
     *        Name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Enables automated creation of Subdomains for branches.
     * </p>
     * 
     * @param enableAutoSubDomain
     *        Enables automated creation of Subdomains for branches.
     */

    public void setEnableAutoSubDomain(Boolean enableAutoSubDomain) {
        this.enableAutoSubDomain = enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables automated creation of Subdomains for branches.
     * </p>
     * 
     * @return Enables automated creation of Subdomains for branches.
     */

    public Boolean getEnableAutoSubDomain() {
        return this.enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables automated creation of Subdomains for branches.
     * </p>
     * 
     * @param enableAutoSubDomain
     *        Enables automated creation of Subdomains for branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withEnableAutoSubDomain(Boolean enableAutoSubDomain) {
        setEnableAutoSubDomain(enableAutoSubDomain);
        return this;
    }

    /**
     * <p>
     * Enables automated creation of Subdomains for branches.
     * </p>
     * 
     * @return Enables automated creation of Subdomains for branches.
     */

    public Boolean isEnableAutoSubDomain() {
        return this.enableAutoSubDomain;
    }

    /**
     * <p>
     * Status fo the Domain Association.
     * </p>
     * 
     * @param domainStatus
     *        Status fo the Domain Association.
     * @see DomainStatus
     */

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    /**
     * <p>
     * Status fo the Domain Association.
     * </p>
     * 
     * @return Status fo the Domain Association.
     * @see DomainStatus
     */

    public String getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * <p>
     * Status fo the Domain Association.
     * </p>
     * 
     * @param domainStatus
     *        Status fo the Domain Association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainAssociation withDomainStatus(String domainStatus) {
        setDomainStatus(domainStatus);
        return this;
    }

    /**
     * <p>
     * Status fo the Domain Association.
     * </p>
     * 
     * @param domainStatus
     *        Status fo the Domain Association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainAssociation withDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus.toString();
        return this;
    }

    /**
     * <p>
     * Reason for the current status of the Domain Association.
     * </p>
     * 
     * @param statusReason
     *        Reason for the current status of the Domain Association.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Reason for the current status of the Domain Association.
     * </p>
     * 
     * @return Reason for the current status of the Domain Association.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Reason for the current status of the Domain Association.
     * </p>
     * 
     * @param statusReason
     *        Reason for the current status of the Domain Association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * DNS Record for certificate verification.
     * </p>
     * 
     * @param certificateVerificationDNSRecord
     *        DNS Record for certificate verification.
     */

    public void setCertificateVerificationDNSRecord(String certificateVerificationDNSRecord) {
        this.certificateVerificationDNSRecord = certificateVerificationDNSRecord;
    }

    /**
     * <p>
     * DNS Record for certificate verification.
     * </p>
     * 
     * @return DNS Record for certificate verification.
     */

    public String getCertificateVerificationDNSRecord() {
        return this.certificateVerificationDNSRecord;
    }

    /**
     * <p>
     * DNS Record for certificate verification.
     * </p>
     * 
     * @param certificateVerificationDNSRecord
     *        DNS Record for certificate verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withCertificateVerificationDNSRecord(String certificateVerificationDNSRecord) {
        setCertificateVerificationDNSRecord(certificateVerificationDNSRecord);
        return this;
    }

    /**
     * <p>
     * Subdomains for the Domain Association.
     * </p>
     * 
     * @return Subdomains for the Domain Association.
     */

    public java.util.List<SubDomain> getSubDomains() {
        return subDomains;
    }

    /**
     * <p>
     * Subdomains for the Domain Association.
     * </p>
     * 
     * @param subDomains
     *        Subdomains for the Domain Association.
     */

    public void setSubDomains(java.util.Collection<SubDomain> subDomains) {
        if (subDomains == null) {
            this.subDomains = null;
            return;
        }

        this.subDomains = new java.util.ArrayList<SubDomain>(subDomains);
    }

    /**
     * <p>
     * Subdomains for the Domain Association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubDomains(java.util.Collection)} or {@link #withSubDomains(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subDomains
     *        Subdomains for the Domain Association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withSubDomains(SubDomain... subDomains) {
        if (this.subDomains == null) {
            setSubDomains(new java.util.ArrayList<SubDomain>(subDomains.length));
        }
        for (SubDomain ele : subDomains) {
            this.subDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Subdomains for the Domain Association.
     * </p>
     * 
     * @param subDomains
     *        Subdomains for the Domain Association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withSubDomains(java.util.Collection<SubDomain> subDomains) {
        setSubDomains(subDomains);
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
        if (getDomainAssociationArn() != null)
            sb.append("DomainAssociationArn: ").append(getDomainAssociationArn()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getEnableAutoSubDomain() != null)
            sb.append("EnableAutoSubDomain: ").append(getEnableAutoSubDomain()).append(",");
        if (getDomainStatus() != null)
            sb.append("DomainStatus: ").append(getDomainStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getCertificateVerificationDNSRecord() != null)
            sb.append("CertificateVerificationDNSRecord: ").append(getCertificateVerificationDNSRecord()).append(",");
        if (getSubDomains() != null)
            sb.append("SubDomains: ").append(getSubDomains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainAssociation == false)
            return false;
        DomainAssociation other = (DomainAssociation) obj;
        if (other.getDomainAssociationArn() == null ^ this.getDomainAssociationArn() == null)
            return false;
        if (other.getDomainAssociationArn() != null && other.getDomainAssociationArn().equals(this.getDomainAssociationArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEnableAutoSubDomain() == null ^ this.getEnableAutoSubDomain() == null)
            return false;
        if (other.getEnableAutoSubDomain() != null && other.getEnableAutoSubDomain().equals(this.getEnableAutoSubDomain()) == false)
            return false;
        if (other.getDomainStatus() == null ^ this.getDomainStatus() == null)
            return false;
        if (other.getDomainStatus() != null && other.getDomainStatus().equals(this.getDomainStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getCertificateVerificationDNSRecord() == null ^ this.getCertificateVerificationDNSRecord() == null)
            return false;
        if (other.getCertificateVerificationDNSRecord() != null
                && other.getCertificateVerificationDNSRecord().equals(this.getCertificateVerificationDNSRecord()) == false)
            return false;
        if (other.getSubDomains() == null ^ this.getSubDomains() == null)
            return false;
        if (other.getSubDomains() != null && other.getSubDomains().equals(this.getSubDomains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainAssociationArn() == null) ? 0 : getDomainAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEnableAutoSubDomain() == null) ? 0 : getEnableAutoSubDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainStatus() == null) ? 0 : getDomainStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getCertificateVerificationDNSRecord() == null) ? 0 : getCertificateVerificationDNSRecord().hashCode());
        hashCode = prime * hashCode + ((getSubDomains() == null) ? 0 : getSubDomains().hashCode());
        return hashCode;
    }

    @Override
    public DomainAssociation clone() {
        try {
            return (DomainAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.DomainAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
