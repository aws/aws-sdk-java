/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The directory registration represents the authorization of the connector service with the Active Directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DirectoryRegistrationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectoryRegistrationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the directory registration was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * Status of the directory registration.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Additional information about the directory registration status if the status is failed.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The date and time that the directory registration was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that was returned when you called <a href=
     *        "https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     *        >CreateDirectoryRegistration</a>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     *         >CreateDirectoryRegistration</a>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that was returned when you called <a href=
     *        "https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     *        >CreateDirectoryRegistration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryRegistrationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the directory registration was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the directory registration was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the directory registration was created.
     * </p>
     * 
     * @return The date and time that the directory registration was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the directory registration was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the directory registration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryRegistrationSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the Active Directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     * 
     * @return The identifier of the Active Directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the Active Directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the Active Directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryRegistrationSummary withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * Status of the directory registration.
     * </p>
     * 
     * @param status
     *        Status of the directory registration.
     * @see DirectoryRegistrationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the directory registration.
     * </p>
     * 
     * @return Status of the directory registration.
     * @see DirectoryRegistrationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the directory registration.
     * </p>
     * 
     * @param status
     *        Status of the directory registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryRegistrationStatus
     */

    public DirectoryRegistrationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the directory registration.
     * </p>
     * 
     * @param status
     *        Status of the directory registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryRegistrationStatus
     */

    public DirectoryRegistrationSummary withStatus(DirectoryRegistrationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the directory registration status if the status is failed.
     * </p>
     * 
     * @param statusReason
     *        Additional information about the directory registration status if the status is failed.
     * @see DirectoryRegistrationStatusReason
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Additional information about the directory registration status if the status is failed.
     * </p>
     * 
     * @return Additional information about the directory registration status if the status is failed.
     * @see DirectoryRegistrationStatusReason
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Additional information about the directory registration status if the status is failed.
     * </p>
     * 
     * @param statusReason
     *        Additional information about the directory registration status if the status is failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryRegistrationStatusReason
     */

    public DirectoryRegistrationSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Additional information about the directory registration status if the status is failed.
     * </p>
     * 
     * @param statusReason
     *        Additional information about the directory registration status if the status is failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryRegistrationStatusReason
     */

    public DirectoryRegistrationSummary withStatusReason(DirectoryRegistrationStatusReason statusReason) {
        this.statusReason = statusReason.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the directory registration was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the directory registration was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the directory registration was updated.
     * </p>
     * 
     * @return The date and time that the directory registration was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time that the directory registration was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the directory registration was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryRegistrationSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectoryRegistrationSummary == false)
            return false;
        DirectoryRegistrationSummary other = (DirectoryRegistrationSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DirectoryRegistrationSummary clone() {
        try {
            return (DirectoryRegistrationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.DirectoryRegistrationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
