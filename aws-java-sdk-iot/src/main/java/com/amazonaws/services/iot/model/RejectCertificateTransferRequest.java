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
 * The input for the RejectCertificateTransfer operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectCertificateTransferRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The reason the certificate transfer was rejected.
     * </p>
     */
    private String rejectReason;

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

    public RejectCertificateTransferRequest withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The reason the certificate transfer was rejected.
     * </p>
     * 
     * @param rejectReason
     *        The reason the certificate transfer was rejected.
     */

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    /**
     * <p>
     * The reason the certificate transfer was rejected.
     * </p>
     * 
     * @return The reason the certificate transfer was rejected.
     */

    public String getRejectReason() {
        return this.rejectReason;
    }

    /**
     * <p>
     * The reason the certificate transfer was rejected.
     * </p>
     * 
     * @param rejectReason
     *        The reason the certificate transfer was rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectCertificateTransferRequest withRejectReason(String rejectReason) {
        setRejectReason(rejectReason);
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
        if (getRejectReason() != null)
            sb.append("RejectReason: ").append(getRejectReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectCertificateTransferRequest == false)
            return false;
        RejectCertificateTransferRequest other = (RejectCertificateTransferRequest) obj;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getRejectReason() == null ^ this.getRejectReason() == null)
            return false;
        if (other.getRejectReason() != null && other.getRejectReason().equals(this.getRejectReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getRejectReason() == null) ? 0 : getRejectReason().hashCode());
        return hashCode;
    }

    @Override
    public RejectCertificateTransferRequest clone() {
        return (RejectCertificateTransferRequest) super.clone();
    }

}
