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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of a certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the certificate.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * Specifies whether this certificate is used for signing or encryption.
     * </p>
     */
    private String usage;
    /**
     * <p>
     * The certificate can be either <code>ACTIVE</code>, <code>PENDING_ROTATION</code>, or <code>INACTIVE</code>.
     * <code>PENDING_ROTATION</code> means that this certificate will replace the current certificate when it expires.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The file name for the certificate.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The list of certificates that make up the chain for the certificate.
     * </p>
     */
    private String certificateChain;
    /**
     * <p>
     * An optional date that specifies when the certificate becomes active.
     * </p>
     */
    private java.util.Date activeDate;
    /**
     * <p>
     * An optional date that specifies when the certificate becomes inactive.
     * </p>
     */
    private java.util.Date inactiveDate;
    /**
     * <p>
     * The serial number for the certificate.
     * </p>
     */
    private String serial;
    /**
     * <p>
     * The earliest date that the certificate is valid.
     * </p>
     */
    private java.util.Date notBeforeDate;
    /**
     * <p>
     * The final date that the certificate is valid.
     * </p>
     */
    private java.util.Date notAfterDate;
    /**
     * <p>
     * If a private key has been specified for the certificate, its type is <code>CERTIFICATE_WITH_PRIVATE_KEY</code>.
     * If there is no private key, the type is <code>CERTIFICATE</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name or description that's used to identity the certificate.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Key-value pairs that can be used to group and search for certificates.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the certificate.
     * </p>
     * 
     * @param arn
     *        The unique Amazon Resource Name (ARN) for the certificate.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the certificate.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) for the certificate.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the certificate.
     * </p>
     * 
     * @param arn
     *        The unique Amazon Resource Name (ARN) for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @param certificateId
     *        An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *        and partner profiles.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @return An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *         and partner profiles.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @param certificateId
     *        An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *        and partner profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * Specifies whether this certificate is used for signing or encryption.
     * </p>
     * 
     * @param usage
     *        Specifies whether this certificate is used for signing or encryption.
     * @see CertificateUsageType
     */

    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * <p>
     * Specifies whether this certificate is used for signing or encryption.
     * </p>
     * 
     * @return Specifies whether this certificate is used for signing or encryption.
     * @see CertificateUsageType
     */

    public String getUsage() {
        return this.usage;
    }

    /**
     * <p>
     * Specifies whether this certificate is used for signing or encryption.
     * </p>
     * 
     * @param usage
     *        Specifies whether this certificate is used for signing or encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateUsageType
     */

    public DescribedCertificate withUsage(String usage) {
        setUsage(usage);
        return this;
    }

    /**
     * <p>
     * Specifies whether this certificate is used for signing or encryption.
     * </p>
     * 
     * @param usage
     *        Specifies whether this certificate is used for signing or encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateUsageType
     */

    public DescribedCertificate withUsage(CertificateUsageType usage) {
        this.usage = usage.toString();
        return this;
    }

    /**
     * <p>
     * The certificate can be either <code>ACTIVE</code>, <code>PENDING_ROTATION</code>, or <code>INACTIVE</code>.
     * <code>PENDING_ROTATION</code> means that this certificate will replace the current certificate when it expires.
     * </p>
     * 
     * @param status
     *        The certificate can be either <code>ACTIVE</code>, <code>PENDING_ROTATION</code>, or <code>INACTIVE</code>
     *        . <code>PENDING_ROTATION</code> means that this certificate will replace the current certificate when it
     *        expires.
     * @see CertificateStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The certificate can be either <code>ACTIVE</code>, <code>PENDING_ROTATION</code>, or <code>INACTIVE</code>.
     * <code>PENDING_ROTATION</code> means that this certificate will replace the current certificate when it expires.
     * </p>
     * 
     * @return The certificate can be either <code>ACTIVE</code>, <code>PENDING_ROTATION</code>, or
     *         <code>INACTIVE</code>. <code>PENDING_ROTATION</code> means that this certificate will replace the current
     *         certificate when it expires.
     * @see CertificateStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The certificate can be either <code>ACTIVE</code>, <code>PENDING_ROTATION</code>, or <code>INACTIVE</code>.
     * <code>PENDING_ROTATION</code> means that this certificate will replace the current certificate when it expires.
     * </p>
     * 
     * @param status
     *        The certificate can be either <code>ACTIVE</code>, <code>PENDING_ROTATION</code>, or <code>INACTIVE</code>
     *        . <code>PENDING_ROTATION</code> means that this certificate will replace the current certificate when it
     *        expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatusType
     */

    public DescribedCertificate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The certificate can be either <code>ACTIVE</code>, <code>PENDING_ROTATION</code>, or <code>INACTIVE</code>.
     * <code>PENDING_ROTATION</code> means that this certificate will replace the current certificate when it expires.
     * </p>
     * 
     * @param status
     *        The certificate can be either <code>ACTIVE</code>, <code>PENDING_ROTATION</code>, or <code>INACTIVE</code>
     *        . <code>PENDING_ROTATION</code> means that this certificate will replace the current certificate when it
     *        expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatusType
     */

    public DescribedCertificate withStatus(CertificateStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The file name for the certificate.
     * </p>
     * 
     * @param certificate
     *        The file name for the certificate.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The file name for the certificate.
     * </p>
     * 
     * @return The file name for the certificate.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The file name for the certificate.
     * </p>
     * 
     * @param certificate
     *        The file name for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The list of certificates that make up the chain for the certificate.
     * </p>
     * 
     * @param certificateChain
     *        The list of certificates that make up the chain for the certificate.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The list of certificates that make up the chain for the certificate.
     * </p>
     * 
     * @return The list of certificates that make up the chain for the certificate.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The list of certificates that make up the chain for the certificate.
     * </p>
     * 
     * @param certificateChain
     *        The list of certificates that make up the chain for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withCertificateChain(String certificateChain) {
        setCertificateChain(certificateChain);
        return this;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes active.
     * </p>
     * 
     * @param activeDate
     *        An optional date that specifies when the certificate becomes active.
     */

    public void setActiveDate(java.util.Date activeDate) {
        this.activeDate = activeDate;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes active.
     * </p>
     * 
     * @return An optional date that specifies when the certificate becomes active.
     */

    public java.util.Date getActiveDate() {
        return this.activeDate;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes active.
     * </p>
     * 
     * @param activeDate
     *        An optional date that specifies when the certificate becomes active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withActiveDate(java.util.Date activeDate) {
        setActiveDate(activeDate);
        return this;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes inactive.
     * </p>
     * 
     * @param inactiveDate
     *        An optional date that specifies when the certificate becomes inactive.
     */

    public void setInactiveDate(java.util.Date inactiveDate) {
        this.inactiveDate = inactiveDate;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes inactive.
     * </p>
     * 
     * @return An optional date that specifies when the certificate becomes inactive.
     */

    public java.util.Date getInactiveDate() {
        return this.inactiveDate;
    }

    /**
     * <p>
     * An optional date that specifies when the certificate becomes inactive.
     * </p>
     * 
     * @param inactiveDate
     *        An optional date that specifies when the certificate becomes inactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withInactiveDate(java.util.Date inactiveDate) {
        setInactiveDate(inactiveDate);
        return this;
    }

    /**
     * <p>
     * The serial number for the certificate.
     * </p>
     * 
     * @param serial
     *        The serial number for the certificate.
     */

    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * <p>
     * The serial number for the certificate.
     * </p>
     * 
     * @return The serial number for the certificate.
     */

    public String getSerial() {
        return this.serial;
    }

    /**
     * <p>
     * The serial number for the certificate.
     * </p>
     * 
     * @param serial
     *        The serial number for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withSerial(String serial) {
        setSerial(serial);
        return this;
    }

    /**
     * <p>
     * The earliest date that the certificate is valid.
     * </p>
     * 
     * @param notBeforeDate
     *        The earliest date that the certificate is valid.
     */

    public void setNotBeforeDate(java.util.Date notBeforeDate) {
        this.notBeforeDate = notBeforeDate;
    }

    /**
     * <p>
     * The earliest date that the certificate is valid.
     * </p>
     * 
     * @return The earliest date that the certificate is valid.
     */

    public java.util.Date getNotBeforeDate() {
        return this.notBeforeDate;
    }

    /**
     * <p>
     * The earliest date that the certificate is valid.
     * </p>
     * 
     * @param notBeforeDate
     *        The earliest date that the certificate is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withNotBeforeDate(java.util.Date notBeforeDate) {
        setNotBeforeDate(notBeforeDate);
        return this;
    }

    /**
     * <p>
     * The final date that the certificate is valid.
     * </p>
     * 
     * @param notAfterDate
     *        The final date that the certificate is valid.
     */

    public void setNotAfterDate(java.util.Date notAfterDate) {
        this.notAfterDate = notAfterDate;
    }

    /**
     * <p>
     * The final date that the certificate is valid.
     * </p>
     * 
     * @return The final date that the certificate is valid.
     */

    public java.util.Date getNotAfterDate() {
        return this.notAfterDate;
    }

    /**
     * <p>
     * The final date that the certificate is valid.
     * </p>
     * 
     * @param notAfterDate
     *        The final date that the certificate is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withNotAfterDate(java.util.Date notAfterDate) {
        setNotAfterDate(notAfterDate);
        return this;
    }

    /**
     * <p>
     * If a private key has been specified for the certificate, its type is <code>CERTIFICATE_WITH_PRIVATE_KEY</code>.
     * If there is no private key, the type is <code>CERTIFICATE</code>.
     * </p>
     * 
     * @param type
     *        If a private key has been specified for the certificate, its type is
     *        <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is
     *        <code>CERTIFICATE</code>.
     * @see CertificateType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * If a private key has been specified for the certificate, its type is <code>CERTIFICATE_WITH_PRIVATE_KEY</code>.
     * If there is no private key, the type is <code>CERTIFICATE</code>.
     * </p>
     * 
     * @return If a private key has been specified for the certificate, its type is
     *         <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is
     *         <code>CERTIFICATE</code>.
     * @see CertificateType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * If a private key has been specified for the certificate, its type is <code>CERTIFICATE_WITH_PRIVATE_KEY</code>.
     * If there is no private key, the type is <code>CERTIFICATE</code>.
     * </p>
     * 
     * @param type
     *        If a private key has been specified for the certificate, its type is
     *        <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is
     *        <code>CERTIFICATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public DescribedCertificate withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * If a private key has been specified for the certificate, its type is <code>CERTIFICATE_WITH_PRIVATE_KEY</code>.
     * If there is no private key, the type is <code>CERTIFICATE</code>.
     * </p>
     * 
     * @param type
     *        If a private key has been specified for the certificate, its type is
     *        <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is
     *        <code>CERTIFICATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public DescribedCertificate withType(CertificateType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name or description that's used to identity the certificate.
     * </p>
     * 
     * @param description
     *        The name or description that's used to identity the certificate.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The name or description that's used to identity the certificate.
     * </p>
     * 
     * @return The name or description that's used to identity the certificate.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The name or description that's used to identity the certificate.
     * </p>
     * 
     * @param description
     *        The name or description that's used to identity the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for certificates.
     * </p>
     * 
     * @return Key-value pairs that can be used to group and search for certificates.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for certificates.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for certificates.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for certificates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for certificates.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedCertificate withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCertificateId() != null)
            sb.append("CertificateId: ").append(getCertificateId()).append(",");
        if (getUsage() != null)
            sb.append("Usage: ").append(getUsage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append("***Sensitive Data Redacted***").append(",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append("***Sensitive Data Redacted***").append(",");
        if (getActiveDate() != null)
            sb.append("ActiveDate: ").append(getActiveDate()).append(",");
        if (getInactiveDate() != null)
            sb.append("InactiveDate: ").append(getInactiveDate()).append(",");
        if (getSerial() != null)
            sb.append("Serial: ").append(getSerial()).append(",");
        if (getNotBeforeDate() != null)
            sb.append("NotBeforeDate: ").append(getNotBeforeDate()).append(",");
        if (getNotAfterDate() != null)
            sb.append("NotAfterDate: ").append(getNotAfterDate()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribedCertificate == false)
            return false;
        DescribedCertificate other = (DescribedCertificate) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getUsage() == null ^ this.getUsage() == null)
            return false;
        if (other.getUsage() != null && other.getUsage().equals(this.getUsage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        if (other.getActiveDate() == null ^ this.getActiveDate() == null)
            return false;
        if (other.getActiveDate() != null && other.getActiveDate().equals(this.getActiveDate()) == false)
            return false;
        if (other.getInactiveDate() == null ^ this.getInactiveDate() == null)
            return false;
        if (other.getInactiveDate() != null && other.getInactiveDate().equals(this.getInactiveDate()) == false)
            return false;
        if (other.getSerial() == null ^ this.getSerial() == null)
            return false;
        if (other.getSerial() != null && other.getSerial().equals(this.getSerial()) == false)
            return false;
        if (other.getNotBeforeDate() == null ^ this.getNotBeforeDate() == null)
            return false;
        if (other.getNotBeforeDate() != null && other.getNotBeforeDate().equals(this.getNotBeforeDate()) == false)
            return false;
        if (other.getNotAfterDate() == null ^ this.getNotAfterDate() == null)
            return false;
        if (other.getNotAfterDate() != null && other.getNotAfterDate().equals(this.getNotAfterDate()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getUsage() == null) ? 0 : getUsage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        hashCode = prime * hashCode + ((getActiveDate() == null) ? 0 : getActiveDate().hashCode());
        hashCode = prime * hashCode + ((getInactiveDate() == null) ? 0 : getInactiveDate().hashCode());
        hashCode = prime * hashCode + ((getSerial() == null) ? 0 : getSerial().hashCode());
        hashCode = prime * hashCode + ((getNotBeforeDate() == null) ? 0 : getNotBeforeDate().hashCode());
        hashCode = prime * hashCode + ((getNotAfterDate() == null) ? 0 : getNotAfterDate().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribedCertificate clone() {
        try {
            return (DescribedCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DescribedCertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
