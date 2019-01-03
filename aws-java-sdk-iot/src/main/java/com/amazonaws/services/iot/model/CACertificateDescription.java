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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a CA certificate.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CACertificateDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CA certificate ARN.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The CA certificate ID.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The CA certificate data, in PEM format.
     * </p>
     */
    private String certificatePem;
    /**
     * <p>
     * The owner of the CA certificate.
     * </p>
     */
    private String ownedBy;
    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and
     * "DISABLE"
     * </p>
     */
    private String autoRegistrationStatus;
    /**
     * <p>
     * The date the CA certificate was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The customer version of the CA certificate.
     * </p>
     */
    private Integer customerVersion;
    /**
     * <p>
     * The generation ID of the CA certificate.
     * </p>
     */
    private String generationId;
    /**
     * <p>
     * When the CA certificate is valid.
     * </p>
     */
    private CertificateValidity validity;

    /**
     * <p>
     * The CA certificate ARN.
     * </p>
     * 
     * @param certificateArn
     *        The CA certificate ARN.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The CA certificate ARN.
     * </p>
     * 
     * @return The CA certificate ARN.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The CA certificate ARN.
     * </p>
     * 
     * @param certificateArn
     *        The CA certificate ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CACertificateDescription withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The CA certificate ID.
     * </p>
     * 
     * @param certificateId
     *        The CA certificate ID.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The CA certificate ID.
     * </p>
     * 
     * @return The CA certificate ID.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The CA certificate ID.
     * </p>
     * 
     * @param certificateId
     *        The CA certificate ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CACertificateDescription withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * 
     * @param status
     *        The status of a CA certificate.
     * @see CACertificateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * 
     * @return The status of a CA certificate.
     * @see CACertificateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * 
     * @param status
     *        The status of a CA certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CACertificateStatus
     */

    public CACertificateDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * 
     * @param status
     *        The status of a CA certificate.
     * @see CACertificateStatus
     */

    public void setStatus(CACertificateStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * 
     * @param status
     *        The status of a CA certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CACertificateStatus
     */

    public CACertificateDescription withStatus(CACertificateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The CA certificate data, in PEM format.
     * </p>
     * 
     * @param certificatePem
     *        The CA certificate data, in PEM format.
     */

    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * The CA certificate data, in PEM format.
     * </p>
     * 
     * @return The CA certificate data, in PEM format.
     */

    public String getCertificatePem() {
        return this.certificatePem;
    }

    /**
     * <p>
     * The CA certificate data, in PEM format.
     * </p>
     * 
     * @param certificatePem
     *        The CA certificate data, in PEM format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CACertificateDescription withCertificatePem(String certificatePem) {
        setCertificatePem(certificatePem);
        return this;
    }

    /**
     * <p>
     * The owner of the CA certificate.
     * </p>
     * 
     * @param ownedBy
     *        The owner of the CA certificate.
     */

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    /**
     * <p>
     * The owner of the CA certificate.
     * </p>
     * 
     * @return The owner of the CA certificate.
     */

    public String getOwnedBy() {
        return this.ownedBy;
    }

    /**
     * <p>
     * The owner of the CA certificate.
     * </p>
     * 
     * @param ownedBy
     *        The owner of the CA certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CACertificateDescription withOwnedBy(String ownedBy) {
        setOwnedBy(ownedBy);
        return this;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     * 
     * @param creationDate
     *        The date the CA certificate was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     * 
     * @return The date the CA certificate was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     * 
     * @param creationDate
     *        The date the CA certificate was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CACertificateDescription withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and
     * "DISABLE"
     * </p>
     * 
     * @param autoRegistrationStatus
     *        Whether the CA certificate configured for auto registration of device certificates. Valid values are
     *        "ENABLE" and "DISABLE"
     * @see AutoRegistrationStatus
     */

    public void setAutoRegistrationStatus(String autoRegistrationStatus) {
        this.autoRegistrationStatus = autoRegistrationStatus;
    }

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and
     * "DISABLE"
     * </p>
     * 
     * @return Whether the CA certificate configured for auto registration of device certificates. Valid values are
     *         "ENABLE" and "DISABLE"
     * @see AutoRegistrationStatus
     */

    public String getAutoRegistrationStatus() {
        return this.autoRegistrationStatus;
    }

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and
     * "DISABLE"
     * </p>
     * 
     * @param autoRegistrationStatus
     *        Whether the CA certificate configured for auto registration of device certificates. Valid values are
     *        "ENABLE" and "DISABLE"
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRegistrationStatus
     */

    public CACertificateDescription withAutoRegistrationStatus(String autoRegistrationStatus) {
        setAutoRegistrationStatus(autoRegistrationStatus);
        return this;
    }

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and
     * "DISABLE"
     * </p>
     * 
     * @param autoRegistrationStatus
     *        Whether the CA certificate configured for auto registration of device certificates. Valid values are
     *        "ENABLE" and "DISABLE"
     * @see AutoRegistrationStatus
     */

    public void setAutoRegistrationStatus(AutoRegistrationStatus autoRegistrationStatus) {
        withAutoRegistrationStatus(autoRegistrationStatus);
    }

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and
     * "DISABLE"
     * </p>
     * 
     * @param autoRegistrationStatus
     *        Whether the CA certificate configured for auto registration of device certificates. Valid values are
     *        "ENABLE" and "DISABLE"
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRegistrationStatus
     */

    public CACertificateDescription withAutoRegistrationStatus(AutoRegistrationStatus autoRegistrationStatus) {
        this.autoRegistrationStatus = autoRegistrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date the CA certificate was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the CA certificate was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the CA certificate was last modified.
     * </p>
     * 
     * @return The date the CA certificate was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the CA certificate was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the CA certificate was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CACertificateDescription withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The customer version of the CA certificate.
     * </p>
     * 
     * @param customerVersion
     *        The customer version of the CA certificate.
     */

    public void setCustomerVersion(Integer customerVersion) {
        this.customerVersion = customerVersion;
    }

    /**
     * <p>
     * The customer version of the CA certificate.
     * </p>
     * 
     * @return The customer version of the CA certificate.
     */

    public Integer getCustomerVersion() {
        return this.customerVersion;
    }

    /**
     * <p>
     * The customer version of the CA certificate.
     * </p>
     * 
     * @param customerVersion
     *        The customer version of the CA certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CACertificateDescription withCustomerVersion(Integer customerVersion) {
        setCustomerVersion(customerVersion);
        return this;
    }

    /**
     * <p>
     * The generation ID of the CA certificate.
     * </p>
     * 
     * @param generationId
     *        The generation ID of the CA certificate.
     */

    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    /**
     * <p>
     * The generation ID of the CA certificate.
     * </p>
     * 
     * @return The generation ID of the CA certificate.
     */

    public String getGenerationId() {
        return this.generationId;
    }

    /**
     * <p>
     * The generation ID of the CA certificate.
     * </p>
     * 
     * @param generationId
     *        The generation ID of the CA certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CACertificateDescription withGenerationId(String generationId) {
        setGenerationId(generationId);
        return this;
    }

    /**
     * <p>
     * When the CA certificate is valid.
     * </p>
     * 
     * @param validity
     *        When the CA certificate is valid.
     */

    public void setValidity(CertificateValidity validity) {
        this.validity = validity;
    }

    /**
     * <p>
     * When the CA certificate is valid.
     * </p>
     * 
     * @return When the CA certificate is valid.
     */

    public CertificateValidity getValidity() {
        return this.validity;
    }

    /**
     * <p>
     * When the CA certificate is valid.
     * </p>
     * 
     * @param validity
     *        When the CA certificate is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CACertificateDescription withValidity(CertificateValidity validity) {
        setValidity(validity);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getCertificateId() != null)
            sb.append("CertificateId: ").append(getCertificateId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCertificatePem() != null)
            sb.append("CertificatePem: ").append(getCertificatePem()).append(",");
        if (getOwnedBy() != null)
            sb.append("OwnedBy: ").append(getOwnedBy()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getAutoRegistrationStatus() != null)
            sb.append("AutoRegistrationStatus: ").append(getAutoRegistrationStatus()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getCustomerVersion() != null)
            sb.append("CustomerVersion: ").append(getCustomerVersion()).append(",");
        if (getGenerationId() != null)
            sb.append("GenerationId: ").append(getGenerationId()).append(",");
        if (getValidity() != null)
            sb.append("Validity: ").append(getValidity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CACertificateDescription == false)
            return false;
        CACertificateDescription other = (CACertificateDescription) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getOwnedBy() == null ^ this.getOwnedBy() == null)
            return false;
        if (other.getOwnedBy() != null && other.getOwnedBy().equals(this.getOwnedBy()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getAutoRegistrationStatus() == null ^ this.getAutoRegistrationStatus() == null)
            return false;
        if (other.getAutoRegistrationStatus() != null && other.getAutoRegistrationStatus().equals(this.getAutoRegistrationStatus()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCustomerVersion() == null ^ this.getCustomerVersion() == null)
            return false;
        if (other.getCustomerVersion() != null && other.getCustomerVersion().equals(this.getCustomerVersion()) == false)
            return false;
        if (other.getGenerationId() == null ^ this.getGenerationId() == null)
            return false;
        if (other.getGenerationId() != null && other.getGenerationId().equals(this.getGenerationId()) == false)
            return false;
        if (other.getValidity() == null ^ this.getValidity() == null)
            return false;
        if (other.getValidity() != null && other.getValidity().equals(this.getValidity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode + ((getOwnedBy() == null) ? 0 : getOwnedBy().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getAutoRegistrationStatus() == null) ? 0 : getAutoRegistrationStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCustomerVersion() == null) ? 0 : getCustomerVersion().hashCode());
        hashCode = prime * hashCode + ((getGenerationId() == null) ? 0 : getGenerationId().hashCode());
        hashCode = prime * hashCode + ((getValidity() == null) ? 0 : getValidity().hashCode());
        return hashCode;
    }

    @Override
    public CACertificateDescription clone() {
        try {
            return (CACertificateDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.CACertificateDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
