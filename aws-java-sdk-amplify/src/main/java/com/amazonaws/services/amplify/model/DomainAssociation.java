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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a domain association that associates a custom domain with an Amplify app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DomainAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain association.
     * </p>
     */
    private String domainAssociationArn;
    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     */
    private Boolean enableAutoSubDomain;
    /**
     * <p>
     * Sets branch patterns for automatic subdomain creation.
     * </p>
     */
    private java.util.List<String> autoSubDomainCreationPatterns;
    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for
     * automatically creating subdomains.
     * </p>
     */
    private String autoSubDomainIAMRole;
    /**
     * <p>
     * The current status of the domain association.
     * </p>
     */
    private String domainStatus;
    /**
     * <p>
     * The reason for the current status of the domain association.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     */
    private String certificateVerificationDNSRecord;
    /**
     * <p>
     * The subdomains for the domain association.
     * </p>
     */
    private java.util.List<SubDomain> subDomains;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain association.
     * </p>
     * 
     * @param domainAssociationArn
     *        The Amazon Resource Name (ARN) for the domain association.
     */

    public void setDomainAssociationArn(String domainAssociationArn) {
        this.domainAssociationArn = domainAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the domain association.
     */

    public String getDomainAssociationArn() {
        return this.domainAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain association.
     * </p>
     * 
     * @param domainAssociationArn
     *        The Amazon Resource Name (ARN) for the domain association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withDomainAssociationArn(String domainAssociationArn) {
        setDomainAssociationArn(domainAssociationArn);
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     * 
     * @param enableAutoSubDomain
     *        Enables the automated creation of subdomains for branches.
     */

    public void setEnableAutoSubDomain(Boolean enableAutoSubDomain) {
        this.enableAutoSubDomain = enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     * 
     * @return Enables the automated creation of subdomains for branches.
     */

    public Boolean getEnableAutoSubDomain() {
        return this.enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     * 
     * @param enableAutoSubDomain
     *        Enables the automated creation of subdomains for branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withEnableAutoSubDomain(Boolean enableAutoSubDomain) {
        setEnableAutoSubDomain(enableAutoSubDomain);
        return this;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     * 
     * @return Enables the automated creation of subdomains for branches.
     */

    public Boolean isEnableAutoSubDomain() {
        return this.enableAutoSubDomain;
    }

    /**
     * <p>
     * Sets branch patterns for automatic subdomain creation.
     * </p>
     * 
     * @return Sets branch patterns for automatic subdomain creation.
     */

    public java.util.List<String> getAutoSubDomainCreationPatterns() {
        return autoSubDomainCreationPatterns;
    }

    /**
     * <p>
     * Sets branch patterns for automatic subdomain creation.
     * </p>
     * 
     * @param autoSubDomainCreationPatterns
     *        Sets branch patterns for automatic subdomain creation.
     */

    public void setAutoSubDomainCreationPatterns(java.util.Collection<String> autoSubDomainCreationPatterns) {
        if (autoSubDomainCreationPatterns == null) {
            this.autoSubDomainCreationPatterns = null;
            return;
        }

        this.autoSubDomainCreationPatterns = new java.util.ArrayList<String>(autoSubDomainCreationPatterns);
    }

    /**
     * <p>
     * Sets branch patterns for automatic subdomain creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoSubDomainCreationPatterns(java.util.Collection)} or
     * {@link #withAutoSubDomainCreationPatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoSubDomainCreationPatterns
     *        Sets branch patterns for automatic subdomain creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withAutoSubDomainCreationPatterns(String... autoSubDomainCreationPatterns) {
        if (this.autoSubDomainCreationPatterns == null) {
            setAutoSubDomainCreationPatterns(new java.util.ArrayList<String>(autoSubDomainCreationPatterns.length));
        }
        for (String ele : autoSubDomainCreationPatterns) {
            this.autoSubDomainCreationPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Sets branch patterns for automatic subdomain creation.
     * </p>
     * 
     * @param autoSubDomainCreationPatterns
     *        Sets branch patterns for automatic subdomain creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withAutoSubDomainCreationPatterns(java.util.Collection<String> autoSubDomainCreationPatterns) {
        setAutoSubDomainCreationPatterns(autoSubDomainCreationPatterns);
        return this;
    }

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for
     * automatically creating subdomains.
     * </p>
     * 
     * @param autoSubDomainIAMRole
     *        The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for
     *        automatically creating subdomains.
     */

    public void setAutoSubDomainIAMRole(String autoSubDomainIAMRole) {
        this.autoSubDomainIAMRole = autoSubDomainIAMRole;
    }

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for
     * automatically creating subdomains.
     * </p>
     * 
     * @return The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for
     *         automatically creating subdomains.
     */

    public String getAutoSubDomainIAMRole() {
        return this.autoSubDomainIAMRole;
    }

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for
     * automatically creating subdomains.
     * </p>
     * 
     * @param autoSubDomainIAMRole
     *        The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for
     *        automatically creating subdomains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withAutoSubDomainIAMRole(String autoSubDomainIAMRole) {
        setAutoSubDomainIAMRole(autoSubDomainIAMRole);
        return this;
    }

    /**
     * <p>
     * The current status of the domain association.
     * </p>
     * 
     * @param domainStatus
     *        The current status of the domain association.
     * @see DomainStatus
     */

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    /**
     * <p>
     * The current status of the domain association.
     * </p>
     * 
     * @return The current status of the domain association.
     * @see DomainStatus
     */

    public String getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * <p>
     * The current status of the domain association.
     * </p>
     * 
     * @param domainStatus
     *        The current status of the domain association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainAssociation withDomainStatus(String domainStatus) {
        setDomainStatus(domainStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the domain association.
     * </p>
     * 
     * @param domainStatus
     *        The current status of the domain association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainAssociation withDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the current status of the domain association.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current status of the domain association.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the current status of the domain association.
     * </p>
     * 
     * @return The reason for the current status of the domain association.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the current status of the domain association.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current status of the domain association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     * 
     * @param certificateVerificationDNSRecord
     *        The DNS record for certificate verification.
     */

    public void setCertificateVerificationDNSRecord(String certificateVerificationDNSRecord) {
        this.certificateVerificationDNSRecord = certificateVerificationDNSRecord;
    }

    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     * 
     * @return The DNS record for certificate verification.
     */

    public String getCertificateVerificationDNSRecord() {
        return this.certificateVerificationDNSRecord;
    }

    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     * 
     * @param certificateVerificationDNSRecord
     *        The DNS record for certificate verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainAssociation withCertificateVerificationDNSRecord(String certificateVerificationDNSRecord) {
        setCertificateVerificationDNSRecord(certificateVerificationDNSRecord);
        return this;
    }

    /**
     * <p>
     * The subdomains for the domain association.
     * </p>
     * 
     * @return The subdomains for the domain association.
     */

    public java.util.List<SubDomain> getSubDomains() {
        return subDomains;
    }

    /**
     * <p>
     * The subdomains for the domain association.
     * </p>
     * 
     * @param subDomains
     *        The subdomains for the domain association.
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
     * The subdomains for the domain association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubDomains(java.util.Collection)} or {@link #withSubDomains(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subDomains
     *        The subdomains for the domain association.
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
     * The subdomains for the domain association.
     * </p>
     * 
     * @param subDomains
     *        The subdomains for the domain association.
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
        if (getAutoSubDomainCreationPatterns() != null)
            sb.append("AutoSubDomainCreationPatterns: ").append(getAutoSubDomainCreationPatterns()).append(",");
        if (getAutoSubDomainIAMRole() != null)
            sb.append("AutoSubDomainIAMRole: ").append(getAutoSubDomainIAMRole()).append(",");
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
        if (other.getAutoSubDomainCreationPatterns() == null ^ this.getAutoSubDomainCreationPatterns() == null)
            return false;
        if (other.getAutoSubDomainCreationPatterns() != null
                && other.getAutoSubDomainCreationPatterns().equals(this.getAutoSubDomainCreationPatterns()) == false)
            return false;
        if (other.getAutoSubDomainIAMRole() == null ^ this.getAutoSubDomainIAMRole() == null)
            return false;
        if (other.getAutoSubDomainIAMRole() != null && other.getAutoSubDomainIAMRole().equals(this.getAutoSubDomainIAMRole()) == false)
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
        hashCode = prime * hashCode + ((getAutoSubDomainCreationPatterns() == null) ? 0 : getAutoSubDomainCreationPatterns().hashCode());
        hashCode = prime * hashCode + ((getAutoSubDomainIAMRole() == null) ? 0 : getAutoSubDomainIAMRole().hashCode());
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
