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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about your private certificate authority (CA). Your private CA can issue and revoke X.509
 * digital certificates. Digital certificates verify that the entity named in the certificate <b>Subject</b> field owns
 * or controls the public key contained in the <b>Subject Public Key Info</b> field. Call the
 * <a>CreateCertificateAuthority</a> operation to create your private CA. You must then call the
 * <a>GetCertificateAuthorityCertificate</a> operation to retrieve a private CA certificate signing request (CSR). Take
 * the CSR to your on-premises CA and sign it with the root CA certificate or a subordinate certificate. Call the
 * <a>ImportCertificateAuthorityCertificate</a> operation to import the signed certificate into AWS Certificate Manager
 * (ACM).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CertificateAuthority" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateAuthority implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is
     * <code> <i>12345678-1234-1234-1234-123456789012</i> </code>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Date and time at which your private CA was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Date and time at which your private CA was last updated.
     * </p>
     */
    private java.util.Date lastStateChangeAt;
    /**
     * <p>
     * Type of your private CA.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Serial number of your private CA.
     * </p>
     */
    private String serial;
    /**
     * <p>
     * Status of your private CA.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Date and time before which your private CA certificate is not valid.
     * </p>
     */
    private java.util.Date notBefore;
    /**
     * <p>
     * Date and time after which your private CA certificate is not valid.
     * </p>
     */
    private java.util.Date notAfter;
    /**
     * <p>
     * Reason the request to create your private CA failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Your private CA configuration.
     * </p>
     */
    private CertificateAuthorityConfiguration certificateAuthorityConfiguration;
    /**
     * <p>
     * Information about the certificate revocation list (CRL) created and maintained by your private CA.
     * </p>
     */
    private RevocationConfiguration revocationConfiguration;
    /**
     * <p>
     * The period during which a deleted CA can be restored. For more information, see the
     * <code>PermanentDeletionTimeInDays</code> parameter of the <a>DeleteCertificateAuthorityRequest</a> operation.
     * </p>
     */
    private java.util.Date restorableUntil;

    /**
     * <p>
     * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is
     * <code> <i>12345678-1234-1234-1234-123456789012</i> </code>.
     * </p>
     * 
     * @param arn
     *        Amazon Resource Name (ARN) for your private certificate authority (CA). The format is
     *        <code> <i>12345678-1234-1234-1234-123456789012</i> </code>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is
     * <code> <i>12345678-1234-1234-1234-123456789012</i> </code>.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) for your private certificate authority (CA). The format is
     *         <code> <i>12345678-1234-1234-1234-123456789012</i> </code>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is
     * <code> <i>12345678-1234-1234-1234-123456789012</i> </code>.
     * </p>
     * 
     * @param arn
     *        Amazon Resource Name (ARN) for your private certificate authority (CA). The format is
     *        <code> <i>12345678-1234-1234-1234-123456789012</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthority withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Date and time at which your private CA was created.
     * </p>
     * 
     * @param createdAt
     *        Date and time at which your private CA was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Date and time at which your private CA was created.
     * </p>
     * 
     * @return Date and time at which your private CA was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Date and time at which your private CA was created.
     * </p>
     * 
     * @param createdAt
     *        Date and time at which your private CA was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthority withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Date and time at which your private CA was last updated.
     * </p>
     * 
     * @param lastStateChangeAt
     *        Date and time at which your private CA was last updated.
     */

    public void setLastStateChangeAt(java.util.Date lastStateChangeAt) {
        this.lastStateChangeAt = lastStateChangeAt;
    }

    /**
     * <p>
     * Date and time at which your private CA was last updated.
     * </p>
     * 
     * @return Date and time at which your private CA was last updated.
     */

    public java.util.Date getLastStateChangeAt() {
        return this.lastStateChangeAt;
    }

    /**
     * <p>
     * Date and time at which your private CA was last updated.
     * </p>
     * 
     * @param lastStateChangeAt
     *        Date and time at which your private CA was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthority withLastStateChangeAt(java.util.Date lastStateChangeAt) {
        setLastStateChangeAt(lastStateChangeAt);
        return this;
    }

    /**
     * <p>
     * Type of your private CA.
     * </p>
     * 
     * @param type
     *        Type of your private CA.
     * @see CertificateAuthorityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of your private CA.
     * </p>
     * 
     * @return Type of your private CA.
     * @see CertificateAuthorityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of your private CA.
     * </p>
     * 
     * @param type
     *        Type of your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateAuthorityType
     */

    public CertificateAuthority withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of your private CA.
     * </p>
     * 
     * @param type
     *        Type of your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateAuthorityType
     */

    public CertificateAuthority withType(CertificateAuthorityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Serial number of your private CA.
     * </p>
     * 
     * @param serial
     *        Serial number of your private CA.
     */

    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * <p>
     * Serial number of your private CA.
     * </p>
     * 
     * @return Serial number of your private CA.
     */

    public String getSerial() {
        return this.serial;
    }

    /**
     * <p>
     * Serial number of your private CA.
     * </p>
     * 
     * @param serial
     *        Serial number of your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthority withSerial(String serial) {
        setSerial(serial);
        return this;
    }

    /**
     * <p>
     * Status of your private CA.
     * </p>
     * 
     * @param status
     *        Status of your private CA.
     * @see CertificateAuthorityStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of your private CA.
     * </p>
     * 
     * @return Status of your private CA.
     * @see CertificateAuthorityStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of your private CA.
     * </p>
     * 
     * @param status
     *        Status of your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateAuthorityStatus
     */

    public CertificateAuthority withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of your private CA.
     * </p>
     * 
     * @param status
     *        Status of your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateAuthorityStatus
     */

    public CertificateAuthority withStatus(CertificateAuthorityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Date and time before which your private CA certificate is not valid.
     * </p>
     * 
     * @param notBefore
     *        Date and time before which your private CA certificate is not valid.
     */

    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * Date and time before which your private CA certificate is not valid.
     * </p>
     * 
     * @return Date and time before which your private CA certificate is not valid.
     */

    public java.util.Date getNotBefore() {
        return this.notBefore;
    }

    /**
     * <p>
     * Date and time before which your private CA certificate is not valid.
     * </p>
     * 
     * @param notBefore
     *        Date and time before which your private CA certificate is not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthority withNotBefore(java.util.Date notBefore) {
        setNotBefore(notBefore);
        return this;
    }

    /**
     * <p>
     * Date and time after which your private CA certificate is not valid.
     * </p>
     * 
     * @param notAfter
     *        Date and time after which your private CA certificate is not valid.
     */

    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * Date and time after which your private CA certificate is not valid.
     * </p>
     * 
     * @return Date and time after which your private CA certificate is not valid.
     */

    public java.util.Date getNotAfter() {
        return this.notAfter;
    }

    /**
     * <p>
     * Date and time after which your private CA certificate is not valid.
     * </p>
     * 
     * @param notAfter
     *        Date and time after which your private CA certificate is not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthority withNotAfter(java.util.Date notAfter) {
        setNotAfter(notAfter);
        return this;
    }

    /**
     * <p>
     * Reason the request to create your private CA failed.
     * </p>
     * 
     * @param failureReason
     *        Reason the request to create your private CA failed.
     * @see FailureReason
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Reason the request to create your private CA failed.
     * </p>
     * 
     * @return Reason the request to create your private CA failed.
     * @see FailureReason
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * Reason the request to create your private CA failed.
     * </p>
     * 
     * @param failureReason
     *        Reason the request to create your private CA failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureReason
     */

    public CertificateAuthority withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Reason the request to create your private CA failed.
     * </p>
     * 
     * @param failureReason
     *        Reason the request to create your private CA failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureReason
     */

    public CertificateAuthority withFailureReason(FailureReason failureReason) {
        this.failureReason = failureReason.toString();
        return this;
    }

    /**
     * <p>
     * Your private CA configuration.
     * </p>
     * 
     * @param certificateAuthorityConfiguration
     *        Your private CA configuration.
     */

    public void setCertificateAuthorityConfiguration(CertificateAuthorityConfiguration certificateAuthorityConfiguration) {
        this.certificateAuthorityConfiguration = certificateAuthorityConfiguration;
    }

    /**
     * <p>
     * Your private CA configuration.
     * </p>
     * 
     * @return Your private CA configuration.
     */

    public CertificateAuthorityConfiguration getCertificateAuthorityConfiguration() {
        return this.certificateAuthorityConfiguration;
    }

    /**
     * <p>
     * Your private CA configuration.
     * </p>
     * 
     * @param certificateAuthorityConfiguration
     *        Your private CA configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthority withCertificateAuthorityConfiguration(CertificateAuthorityConfiguration certificateAuthorityConfiguration) {
        setCertificateAuthorityConfiguration(certificateAuthorityConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about the certificate revocation list (CRL) created and maintained by your private CA.
     * </p>
     * 
     * @param revocationConfiguration
     *        Information about the certificate revocation list (CRL) created and maintained by your private CA.
     */

    public void setRevocationConfiguration(RevocationConfiguration revocationConfiguration) {
        this.revocationConfiguration = revocationConfiguration;
    }

    /**
     * <p>
     * Information about the certificate revocation list (CRL) created and maintained by your private CA.
     * </p>
     * 
     * @return Information about the certificate revocation list (CRL) created and maintained by your private CA.
     */

    public RevocationConfiguration getRevocationConfiguration() {
        return this.revocationConfiguration;
    }

    /**
     * <p>
     * Information about the certificate revocation list (CRL) created and maintained by your private CA.
     * </p>
     * 
     * @param revocationConfiguration
     *        Information about the certificate revocation list (CRL) created and maintained by your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthority withRevocationConfiguration(RevocationConfiguration revocationConfiguration) {
        setRevocationConfiguration(revocationConfiguration);
        return this;
    }

    /**
     * <p>
     * The period during which a deleted CA can be restored. For more information, see the
     * <code>PermanentDeletionTimeInDays</code> parameter of the <a>DeleteCertificateAuthorityRequest</a> operation.
     * </p>
     * 
     * @param restorableUntil
     *        The period during which a deleted CA can be restored. For more information, see the
     *        <code>PermanentDeletionTimeInDays</code> parameter of the <a>DeleteCertificateAuthorityRequest</a>
     *        operation.
     */

    public void setRestorableUntil(java.util.Date restorableUntil) {
        this.restorableUntil = restorableUntil;
    }

    /**
     * <p>
     * The period during which a deleted CA can be restored. For more information, see the
     * <code>PermanentDeletionTimeInDays</code> parameter of the <a>DeleteCertificateAuthorityRequest</a> operation.
     * </p>
     * 
     * @return The period during which a deleted CA can be restored. For more information, see the
     *         <code>PermanentDeletionTimeInDays</code> parameter of the <a>DeleteCertificateAuthorityRequest</a>
     *         operation.
     */

    public java.util.Date getRestorableUntil() {
        return this.restorableUntil;
    }

    /**
     * <p>
     * The period during which a deleted CA can be restored. For more information, see the
     * <code>PermanentDeletionTimeInDays</code> parameter of the <a>DeleteCertificateAuthorityRequest</a> operation.
     * </p>
     * 
     * @param restorableUntil
     *        The period during which a deleted CA can be restored. For more information, see the
     *        <code>PermanentDeletionTimeInDays</code> parameter of the <a>DeleteCertificateAuthorityRequest</a>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAuthority withRestorableUntil(java.util.Date restorableUntil) {
        setRestorableUntil(restorableUntil);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastStateChangeAt() != null)
            sb.append("LastStateChangeAt: ").append(getLastStateChangeAt()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSerial() != null)
            sb.append("Serial: ").append(getSerial()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNotBefore() != null)
            sb.append("NotBefore: ").append(getNotBefore()).append(",");
        if (getNotAfter() != null)
            sb.append("NotAfter: ").append(getNotAfter()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCertificateAuthorityConfiguration() != null)
            sb.append("CertificateAuthorityConfiguration: ").append(getCertificateAuthorityConfiguration()).append(",");
        if (getRevocationConfiguration() != null)
            sb.append("RevocationConfiguration: ").append(getRevocationConfiguration()).append(",");
        if (getRestorableUntil() != null)
            sb.append("RestorableUntil: ").append(getRestorableUntil());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateAuthority == false)
            return false;
        CertificateAuthority other = (CertificateAuthority) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastStateChangeAt() == null ^ this.getLastStateChangeAt() == null)
            return false;
        if (other.getLastStateChangeAt() != null && other.getLastStateChangeAt().equals(this.getLastStateChangeAt()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSerial() == null ^ this.getSerial() == null)
            return false;
        if (other.getSerial() != null && other.getSerial().equals(this.getSerial()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCertificateAuthorityConfiguration() == null ^ this.getCertificateAuthorityConfiguration() == null)
            return false;
        if (other.getCertificateAuthorityConfiguration() != null
                && other.getCertificateAuthorityConfiguration().equals(this.getCertificateAuthorityConfiguration()) == false)
            return false;
        if (other.getRevocationConfiguration() == null ^ this.getRevocationConfiguration() == null)
            return false;
        if (other.getRevocationConfiguration() != null && other.getRevocationConfiguration().equals(this.getRevocationConfiguration()) == false)
            return false;
        if (other.getRestorableUntil() == null ^ this.getRestorableUntil() == null)
            return false;
        if (other.getRestorableUntil() != null && other.getRestorableUntil().equals(this.getRestorableUntil()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastStateChangeAt() == null) ? 0 : getLastStateChangeAt().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSerial() == null) ? 0 : getSerial().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityConfiguration() == null) ? 0 : getCertificateAuthorityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRevocationConfiguration() == null) ? 0 : getRevocationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRestorableUntil() == null) ? 0 : getRestorableUntil().hashCode());
        return hashCode;
    }

    @Override
    public CertificateAuthority clone() {
        try {
            return (CertificateAuthority) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.CertificateAuthorityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
