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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the domain name system (DNS) records that you must add to the DNS of your registered domain to validate
 * ownership for an Amazon Lightsail SSL/TLS certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DomainValidationRecord" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainValidationRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domain name of the certificate validation record. For example, <code>example.com</code> or
     * <code>www.example.com</code>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     * </p>
     */
    private ResourceRecord resourceRecord;
    /**
     * <p>
     * An object that describes the state of the canonical name (CNAME) records that are automatically added by
     * Lightsail to the DNS of the domain to validate domain ownership.
     * </p>
     */
    private DnsRecordCreationState dnsRecordCreationState;
    /**
     * <p>
     * The validation status of the record.
     * </p>
     */
    private String validationStatus;

    /**
     * <p>
     * The domain name of the certificate validation record. For example, <code>example.com</code> or
     * <code>www.example.com</code>.
     * </p>
     * 
     * @param domainName
     *        The domain name of the certificate validation record. For example, <code>example.com</code> or
     *        <code>www.example.com</code>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name of the certificate validation record. For example, <code>example.com</code> or
     * <code>www.example.com</code>.
     * </p>
     * 
     * @return The domain name of the certificate validation record. For example, <code>example.com</code> or
     *         <code>www.example.com</code>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name of the certificate validation record. For example, <code>example.com</code> or
     * <code>www.example.com</code>.
     * </p>
     * 
     * @param domainName
     *        The domain name of the certificate validation record. For example, <code>example.com</code> or
     *        <code>www.example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidationRecord withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     * </p>
     * 
     * @param resourceRecord
     *        An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     */

    public void setResourceRecord(ResourceRecord resourceRecord) {
        this.resourceRecord = resourceRecord;
    }

    /**
     * <p>
     * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     * </p>
     * 
     * @return An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     */

    public ResourceRecord getResourceRecord() {
        return this.resourceRecord;
    }

    /**
     * <p>
     * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     * </p>
     * 
     * @param resourceRecord
     *        An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidationRecord withResourceRecord(ResourceRecord resourceRecord) {
        setResourceRecord(resourceRecord);
        return this;
    }

    /**
     * <p>
     * An object that describes the state of the canonical name (CNAME) records that are automatically added by
     * Lightsail to the DNS of the domain to validate domain ownership.
     * </p>
     * 
     * @param dnsRecordCreationState
     *        An object that describes the state of the canonical name (CNAME) records that are automatically added by
     *        Lightsail to the DNS of the domain to validate domain ownership.
     */

    public void setDnsRecordCreationState(DnsRecordCreationState dnsRecordCreationState) {
        this.dnsRecordCreationState = dnsRecordCreationState;
    }

    /**
     * <p>
     * An object that describes the state of the canonical name (CNAME) records that are automatically added by
     * Lightsail to the DNS of the domain to validate domain ownership.
     * </p>
     * 
     * @return An object that describes the state of the canonical name (CNAME) records that are automatically added by
     *         Lightsail to the DNS of the domain to validate domain ownership.
     */

    public DnsRecordCreationState getDnsRecordCreationState() {
        return this.dnsRecordCreationState;
    }

    /**
     * <p>
     * An object that describes the state of the canonical name (CNAME) records that are automatically added by
     * Lightsail to the DNS of the domain to validate domain ownership.
     * </p>
     * 
     * @param dnsRecordCreationState
     *        An object that describes the state of the canonical name (CNAME) records that are automatically added by
     *        Lightsail to the DNS of the domain to validate domain ownership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidationRecord withDnsRecordCreationState(DnsRecordCreationState dnsRecordCreationState) {
        setDnsRecordCreationState(dnsRecordCreationState);
        return this;
    }

    /**
     * <p>
     * The validation status of the record.
     * </p>
     * 
     * @param validationStatus
     *        The validation status of the record.
     * @see CertificateDomainValidationStatus
     */

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * <p>
     * The validation status of the record.
     * </p>
     * 
     * @return The validation status of the record.
     * @see CertificateDomainValidationStatus
     */

    public String getValidationStatus() {
        return this.validationStatus;
    }

    /**
     * <p>
     * The validation status of the record.
     * </p>
     * 
     * @param validationStatus
     *        The validation status of the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateDomainValidationStatus
     */

    public DomainValidationRecord withValidationStatus(String validationStatus) {
        setValidationStatus(validationStatus);
        return this;
    }

    /**
     * <p>
     * The validation status of the record.
     * </p>
     * 
     * @param validationStatus
     *        The validation status of the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateDomainValidationStatus
     */

    public DomainValidationRecord withValidationStatus(CertificateDomainValidationStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getResourceRecord() != null)
            sb.append("ResourceRecord: ").append(getResourceRecord()).append(",");
        if (getDnsRecordCreationState() != null)
            sb.append("DnsRecordCreationState: ").append(getDnsRecordCreationState()).append(",");
        if (getValidationStatus() != null)
            sb.append("ValidationStatus: ").append(getValidationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainValidationRecord == false)
            return false;
        DomainValidationRecord other = (DomainValidationRecord) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getResourceRecord() == null ^ this.getResourceRecord() == null)
            return false;
        if (other.getResourceRecord() != null && other.getResourceRecord().equals(this.getResourceRecord()) == false)
            return false;
        if (other.getDnsRecordCreationState() == null ^ this.getDnsRecordCreationState() == null)
            return false;
        if (other.getDnsRecordCreationState() != null && other.getDnsRecordCreationState().equals(this.getDnsRecordCreationState()) == false)
            return false;
        if (other.getValidationStatus() == null ^ this.getValidationStatus() == null)
            return false;
        if (other.getValidationStatus() != null && other.getValidationStatus().equals(this.getValidationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getResourceRecord() == null) ? 0 : getResourceRecord().hashCode());
        hashCode = prime * hashCode + ((getDnsRecordCreationState() == null) ? 0 : getDnsRecordCreationState().hashCode());
        hashCode = prime * hashCode + ((getValidationStatus() == null) ? 0 : getValidationStatus().hashCode());
        return hashCode;
    }

    @Override
    public DomainValidationRecord clone() {
        try {
            return (DomainValidationRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.DomainValidationRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
