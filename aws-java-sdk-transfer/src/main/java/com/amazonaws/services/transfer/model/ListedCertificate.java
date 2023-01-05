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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified certificate.
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
     * The type for the certificate. If a private key has been specified for the certificate, its type is
     * <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is <code>CERTIFICATE</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name or short description that's used to identify the certificate.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified certificate.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified certificate.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified certificate.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified certificate.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedCertificate withArn(String arn) {
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

    public ListedCertificate withCertificateId(String certificateId) {
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

    public ListedCertificate withUsage(String usage) {
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

    public ListedCertificate withUsage(CertificateUsageType usage) {
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

    public ListedCertificate withStatus(String status) {
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

    public ListedCertificate withStatus(CertificateStatusType status) {
        this.status = status.toString();
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

    public ListedCertificate withActiveDate(java.util.Date activeDate) {
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

    public ListedCertificate withInactiveDate(java.util.Date inactiveDate) {
        setInactiveDate(inactiveDate);
        return this;
    }

    /**
     * <p>
     * The type for the certificate. If a private key has been specified for the certificate, its type is
     * <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is <code>CERTIFICATE</code>.
     * </p>
     * 
     * @param type
     *        The type for the certificate. If a private key has been specified for the certificate, its type is
     *        <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is
     *        <code>CERTIFICATE</code>.
     * @see CertificateType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type for the certificate. If a private key has been specified for the certificate, its type is
     * <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is <code>CERTIFICATE</code>.
     * </p>
     * 
     * @return The type for the certificate. If a private key has been specified for the certificate, its type is
     *         <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is
     *         <code>CERTIFICATE</code>.
     * @see CertificateType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type for the certificate. If a private key has been specified for the certificate, its type is
     * <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is <code>CERTIFICATE</code>.
     * </p>
     * 
     * @param type
     *        The type for the certificate. If a private key has been specified for the certificate, its type is
     *        <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is
     *        <code>CERTIFICATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public ListedCertificate withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type for the certificate. If a private key has been specified for the certificate, its type is
     * <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is <code>CERTIFICATE</code>.
     * </p>
     * 
     * @param type
     *        The type for the certificate. If a private key has been specified for the certificate, its type is
     *        <code>CERTIFICATE_WITH_PRIVATE_KEY</code>. If there is no private key, the type is
     *        <code>CERTIFICATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public ListedCertificate withType(CertificateType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name or short description that's used to identify the certificate.
     * </p>
     * 
     * @param description
     *        The name or short description that's used to identify the certificate.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The name or short description that's used to identify the certificate.
     * </p>
     * 
     * @return The name or short description that's used to identify the certificate.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The name or short description that's used to identify the certificate.
     * </p>
     * 
     * @param description
     *        The name or short description that's used to identify the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedCertificate withDescription(String description) {
        setDescription(description);
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
        if (getActiveDate() != null)
            sb.append("ActiveDate: ").append(getActiveDate()).append(",");
        if (getInactiveDate() != null)
            sb.append("InactiveDate: ").append(getInactiveDate()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedCertificate == false)
            return false;
        ListedCertificate other = (ListedCertificate) obj;
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
        if (other.getActiveDate() == null ^ this.getActiveDate() == null)
            return false;
        if (other.getActiveDate() != null && other.getActiveDate().equals(this.getActiveDate()) == false)
            return false;
        if (other.getInactiveDate() == null ^ this.getInactiveDate() == null)
            return false;
        if (other.getInactiveDate() != null && other.getInactiveDate().equals(this.getInactiveDate()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        hashCode = prime * hashCode + ((getActiveDate() == null) ? 0 : getActiveDate().hashCode());
        hashCode = prime * hashCode + ((getInactiveDate() == null) ? 0 : getInactiveDate().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ListedCertificate clone() {
        try {
            return (ListedCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedCertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
