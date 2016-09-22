/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes a CA certificate.
 * </p>
 */
public class CACertificateDescription implements Serializable, Cloneable {

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
        this.status = status.toString();
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
        setStatus(status);
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
        this.autoRegistrationStatus = autoRegistrationStatus.toString();
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
        setAutoRegistrationStatus(autoRegistrationStatus);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getCertificateId() != null)
            sb.append("CertificateId: " + getCertificateId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCertificatePem() != null)
            sb.append("CertificatePem: " + getCertificatePem() + ",");
        if (getOwnedBy() != null)
            sb.append("OwnedBy: " + getOwnedBy() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getAutoRegistrationStatus() != null)
            sb.append("AutoRegistrationStatus: " + getAutoRegistrationStatus());
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
}
