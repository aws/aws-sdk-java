/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input to the UpdateCACertificate operation.
 * </p>
 */
public class UpdateCACertificateRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The CA certificate identifier.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     */
    private String newStatus;

    /**
     * <p>
     * The CA certificate identifier.
     * </p>
     * 
     * @param certificateId
     *        The CA certificate identifier.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The CA certificate identifier.
     * </p>
     * 
     * @return The CA certificate identifier.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The CA certificate identifier.
     * </p>
     * 
     * @param certificateId
     *        The CA certificate identifier.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateCACertificateRequest withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * 
     * @param newStatus
     *        The updated status of the CA certificate.
     * @see CACertificateStatus
     */

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * 
     * @return The updated status of the CA certificate.
     * @see CACertificateStatus
     */

    public String getNewStatus() {
        return this.newStatus;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * 
     * @param newStatus
     *        The updated status of the CA certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CACertificateStatus
     */

    public UpdateCACertificateRequest withNewStatus(String newStatus) {
        setNewStatus(newStatus);
        return this;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * 
     * @param newStatus
     *        The updated status of the CA certificate.
     * @see CACertificateStatus
     */

    public void setNewStatus(CACertificateStatus newStatus) {
        this.newStatus = newStatus.toString();
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * 
     * @param newStatus
     *        The updated status of the CA certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CACertificateStatus
     */

    public UpdateCACertificateRequest withNewStatus(
            CACertificateStatus newStatus) {
        setNewStatus(newStatus);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificateId() != null)
            sb.append("CertificateId: " + getCertificateId() + ",");
        if (getNewStatus() != null)
            sb.append("NewStatus: " + getNewStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCACertificateRequest == false)
            return false;
        UpdateCACertificateRequest other = (UpdateCACertificateRequest) obj;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getNewStatus() == null ^ this.getNewStatus() == null)
            return false;
        if (other.getNewStatus() != null
                && other.getNewStatus().equals(this.getNewStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNewStatus() == null) ? 0 : getNewStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCACertificateRequest clone() {
        return (UpdateCACertificateRequest) super.clone();
    }
}