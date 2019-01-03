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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the UpdateCertificate operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown. PENDING_TRANSFER is
     * a status used internally by AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     */
    private String newStatus;

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * </p>
     * 
     * @param certificateId
     *        The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * </p>
     * 
     * @return The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * </p>
     * 
     * @param certificateId
     *        The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCertificateRequest withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown. PENDING_TRANSFER is
     * a status used internally by AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param newStatus
     *        The new status.</p>
     *        <p>
     *        <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown.
     *        PENDING_TRANSFER is a status used internally by AWS IoT. It is not intended for developer use.
     *        </p>
     *        <p>
     *        <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * @see CertificateStatus
     */

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown. PENDING_TRANSFER is
     * a status used internally by AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @return The new status.</p>
     *         <p>
     *         <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown.
     *         PENDING_TRANSFER is a status used internally by AWS IoT. It is not intended for developer use.
     *         </p>
     *         <p>
     *         <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * @see CertificateStatus
     */

    public String getNewStatus() {
        return this.newStatus;
    }

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown. PENDING_TRANSFER is
     * a status used internally by AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param newStatus
     *        The new status.</p>
     *        <p>
     *        <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown.
     *        PENDING_TRANSFER is a status used internally by AWS IoT. It is not intended for developer use.
     *        </p>
     *        <p>
     *        <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public UpdateCertificateRequest withNewStatus(String newStatus) {
        setNewStatus(newStatus);
        return this;
    }

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown. PENDING_TRANSFER is
     * a status used internally by AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param newStatus
     *        The new status.</p>
     *        <p>
     *        <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown.
     *        PENDING_TRANSFER is a status used internally by AWS IoT. It is not intended for developer use.
     *        </p>
     *        <p>
     *        <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * @see CertificateStatus
     */

    public void setNewStatus(CertificateStatus newStatus) {
        withNewStatus(newStatus);
    }

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown. PENDING_TRANSFER is
     * a status used internally by AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param newStatus
     *        The new status.</p>
     *        <p>
     *        <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an exception being thrown.
     *        PENDING_TRANSFER is a status used internally by AWS IoT. It is not intended for developer use.
     *        </p>
     *        <p>
     *        <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public UpdateCertificateRequest withNewStatus(CertificateStatus newStatus) {
        this.newStatus = newStatus.toString();
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
        if (getCertificateId() != null)
            sb.append("CertificateId: ").append(getCertificateId()).append(",");
        if (getNewStatus() != null)
            sb.append("NewStatus: ").append(getNewStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCertificateRequest == false)
            return false;
        UpdateCertificateRequest other = (UpdateCertificateRequest) obj;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getNewStatus() == null ^ this.getNewStatus() == null)
            return false;
        if (other.getNewStatus() != null && other.getNewStatus().equals(this.getNewStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getNewStatus() == null) ? 0 : getNewStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCertificateRequest clone() {
        return (UpdateCertificateRequest) super.clone();
    }

}
