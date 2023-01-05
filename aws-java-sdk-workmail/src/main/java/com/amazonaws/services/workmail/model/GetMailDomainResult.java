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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMailDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the DNS records that WorkMail recommends adding in your DNS provider for the best user experience. The
     * records configure your domain with DMARC, SPF, DKIM, and direct incoming email traffic to SES. See admin guide
     * for more details.
     * </p>
     */
    private java.util.List<DnsRecord> records;
    /**
     * <p>
     * Specifies whether the domain is a test domain provided by WorkMail, or a custom domain.
     * </p>
     */
    private Boolean isTestDomain;
    /**
     * <p>
     * Specifies whether the domain is the default domain for your organization.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * Indicates the status of the domain ownership verification.
     * </p>
     */
    private String ownershipVerificationStatus;
    /**
     * <p>
     * Indicates the status of a DKIM verification.
     * </p>
     */
    private String dkimVerificationStatus;

    /**
     * <p>
     * A list of the DNS records that WorkMail recommends adding in your DNS provider for the best user experience. The
     * records configure your domain with DMARC, SPF, DKIM, and direct incoming email traffic to SES. See admin guide
     * for more details.
     * </p>
     * 
     * @return A list of the DNS records that WorkMail recommends adding in your DNS provider for the best user
     *         experience. The records configure your domain with DMARC, SPF, DKIM, and direct incoming email traffic to
     *         SES. See admin guide for more details.
     */

    public java.util.List<DnsRecord> getRecords() {
        return records;
    }

    /**
     * <p>
     * A list of the DNS records that WorkMail recommends adding in your DNS provider for the best user experience. The
     * records configure your domain with DMARC, SPF, DKIM, and direct incoming email traffic to SES. See admin guide
     * for more details.
     * </p>
     * 
     * @param records
     *        A list of the DNS records that WorkMail recommends adding in your DNS provider for the best user
     *        experience. The records configure your domain with DMARC, SPF, DKIM, and direct incoming email traffic to
     *        SES. See admin guide for more details.
     */

    public void setRecords(java.util.Collection<DnsRecord> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<DnsRecord>(records);
    }

    /**
     * <p>
     * A list of the DNS records that WorkMail recommends adding in your DNS provider for the best user experience. The
     * records configure your domain with DMARC, SPF, DKIM, and direct incoming email traffic to SES. See admin guide
     * for more details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        A list of the DNS records that WorkMail recommends adding in your DNS provider for the best user
     *        experience. The records configure your domain with DMARC, SPF, DKIM, and direct incoming email traffic to
     *        SES. See admin guide for more details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMailDomainResult withRecords(DnsRecord... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<DnsRecord>(records.length));
        }
        for (DnsRecord ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the DNS records that WorkMail recommends adding in your DNS provider for the best user experience. The
     * records configure your domain with DMARC, SPF, DKIM, and direct incoming email traffic to SES. See admin guide
     * for more details.
     * </p>
     * 
     * @param records
     *        A list of the DNS records that WorkMail recommends adding in your DNS provider for the best user
     *        experience. The records configure your domain with DMARC, SPF, DKIM, and direct incoming email traffic to
     *        SES. See admin guide for more details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMailDomainResult withRecords(java.util.Collection<DnsRecord> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * Specifies whether the domain is a test domain provided by WorkMail, or a custom domain.
     * </p>
     * 
     * @param isTestDomain
     *        Specifies whether the domain is a test domain provided by WorkMail, or a custom domain.
     */

    public void setIsTestDomain(Boolean isTestDomain) {
        this.isTestDomain = isTestDomain;
    }

    /**
     * <p>
     * Specifies whether the domain is a test domain provided by WorkMail, or a custom domain.
     * </p>
     * 
     * @return Specifies whether the domain is a test domain provided by WorkMail, or a custom domain.
     */

    public Boolean getIsTestDomain() {
        return this.isTestDomain;
    }

    /**
     * <p>
     * Specifies whether the domain is a test domain provided by WorkMail, or a custom domain.
     * </p>
     * 
     * @param isTestDomain
     *        Specifies whether the domain is a test domain provided by WorkMail, or a custom domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMailDomainResult withIsTestDomain(Boolean isTestDomain) {
        setIsTestDomain(isTestDomain);
        return this;
    }

    /**
     * <p>
     * Specifies whether the domain is a test domain provided by WorkMail, or a custom domain.
     * </p>
     * 
     * @return Specifies whether the domain is a test domain provided by WorkMail, or a custom domain.
     */

    public Boolean isTestDomain() {
        return this.isTestDomain;
    }

    /**
     * <p>
     * Specifies whether the domain is the default domain for your organization.
     * </p>
     * 
     * @param isDefault
     *        Specifies whether the domain is the default domain for your organization.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Specifies whether the domain is the default domain for your organization.
     * </p>
     * 
     * @return Specifies whether the domain is the default domain for your organization.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Specifies whether the domain is the default domain for your organization.
     * </p>
     * 
     * @param isDefault
     *        Specifies whether the domain is the default domain for your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMailDomainResult withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Specifies whether the domain is the default domain for your organization.
     * </p>
     * 
     * @return Specifies whether the domain is the default domain for your organization.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Indicates the status of the domain ownership verification.
     * </p>
     * 
     * @param ownershipVerificationStatus
     *        Indicates the status of the domain ownership verification.
     * @see DnsRecordVerificationStatus
     */

    public void setOwnershipVerificationStatus(String ownershipVerificationStatus) {
        this.ownershipVerificationStatus = ownershipVerificationStatus;
    }

    /**
     * <p>
     * Indicates the status of the domain ownership verification.
     * </p>
     * 
     * @return Indicates the status of the domain ownership verification.
     * @see DnsRecordVerificationStatus
     */

    public String getOwnershipVerificationStatus() {
        return this.ownershipVerificationStatus;
    }

    /**
     * <p>
     * Indicates the status of the domain ownership verification.
     * </p>
     * 
     * @param ownershipVerificationStatus
     *        Indicates the status of the domain ownership verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsRecordVerificationStatus
     */

    public GetMailDomainResult withOwnershipVerificationStatus(String ownershipVerificationStatus) {
        setOwnershipVerificationStatus(ownershipVerificationStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the domain ownership verification.
     * </p>
     * 
     * @param ownershipVerificationStatus
     *        Indicates the status of the domain ownership verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsRecordVerificationStatus
     */

    public GetMailDomainResult withOwnershipVerificationStatus(DnsRecordVerificationStatus ownershipVerificationStatus) {
        this.ownershipVerificationStatus = ownershipVerificationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the status of a DKIM verification.
     * </p>
     * 
     * @param dkimVerificationStatus
     *        Indicates the status of a DKIM verification.
     * @see DnsRecordVerificationStatus
     */

    public void setDkimVerificationStatus(String dkimVerificationStatus) {
        this.dkimVerificationStatus = dkimVerificationStatus;
    }

    /**
     * <p>
     * Indicates the status of a DKIM verification.
     * </p>
     * 
     * @return Indicates the status of a DKIM verification.
     * @see DnsRecordVerificationStatus
     */

    public String getDkimVerificationStatus() {
        return this.dkimVerificationStatus;
    }

    /**
     * <p>
     * Indicates the status of a DKIM verification.
     * </p>
     * 
     * @param dkimVerificationStatus
     *        Indicates the status of a DKIM verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsRecordVerificationStatus
     */

    public GetMailDomainResult withDkimVerificationStatus(String dkimVerificationStatus) {
        setDkimVerificationStatus(dkimVerificationStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a DKIM verification.
     * </p>
     * 
     * @param dkimVerificationStatus
     *        Indicates the status of a DKIM verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsRecordVerificationStatus
     */

    public GetMailDomainResult withDkimVerificationStatus(DnsRecordVerificationStatus dkimVerificationStatus) {
        this.dkimVerificationStatus = dkimVerificationStatus.toString();
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
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
        if (getIsTestDomain() != null)
            sb.append("IsTestDomain: ").append(getIsTestDomain()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getOwnershipVerificationStatus() != null)
            sb.append("OwnershipVerificationStatus: ").append(getOwnershipVerificationStatus()).append(",");
        if (getDkimVerificationStatus() != null)
            sb.append("DkimVerificationStatus: ").append(getDkimVerificationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMailDomainResult == false)
            return false;
        GetMailDomainResult other = (GetMailDomainResult) obj;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getIsTestDomain() == null ^ this.getIsTestDomain() == null)
            return false;
        if (other.getIsTestDomain() != null && other.getIsTestDomain().equals(this.getIsTestDomain()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getOwnershipVerificationStatus() == null ^ this.getOwnershipVerificationStatus() == null)
            return false;
        if (other.getOwnershipVerificationStatus() != null && other.getOwnershipVerificationStatus().equals(this.getOwnershipVerificationStatus()) == false)
            return false;
        if (other.getDkimVerificationStatus() == null ^ this.getDkimVerificationStatus() == null)
            return false;
        if (other.getDkimVerificationStatus() != null && other.getDkimVerificationStatus().equals(this.getDkimVerificationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getIsTestDomain() == null) ? 0 : getIsTestDomain().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getOwnershipVerificationStatus() == null) ? 0 : getOwnershipVerificationStatus().hashCode());
        hashCode = prime * hashCode + ((getDkimVerificationStatus() == null) ? 0 : getDkimVerificationStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetMailDomainResult clone() {
        try {
            return (GetMailDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
