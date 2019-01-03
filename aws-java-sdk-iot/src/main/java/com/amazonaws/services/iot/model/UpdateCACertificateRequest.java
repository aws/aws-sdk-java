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
 * The input to the UpdateCACertificate operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCACertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     */
    private String newStatus;
    /**
     * <p>
     * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * </p>
     */
    private String newAutoRegistrationStatus;
    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     */
    private RegistrationConfig registrationConfig;
    /**
     * <p>
     * If true, remove auto registration.
     * </p>
     */
    private Boolean removeAutoRegistration;

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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCACertificateRequest withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param newStatus
     *        The updated status of the CA certificate.</p>
     *        <p>
     *        <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * @see CACertificateStatus
     */

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @return The updated status of the CA certificate.</p>
     *         <p>
     *         <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * @see CACertificateStatus
     */

    public String getNewStatus() {
        return this.newStatus;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param newStatus
     *        The updated status of the CA certificate.</p>
     *        <p>
     *        <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param newStatus
     *        The updated status of the CA certificate.</p>
     *        <p>
     *        <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * @see CACertificateStatus
     */

    public void setNewStatus(CACertificateStatus newStatus) {
        withNewStatus(newStatus);
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param newStatus
     *        The updated status of the CA certificate.</p>
     *        <p>
     *        <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should not be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CACertificateStatus
     */

    public UpdateCACertificateRequest withNewStatus(CACertificateStatus newStatus) {
        this.newStatus = newStatus.toString();
        return this;
    }

    /**
     * <p>
     * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * </p>
     * 
     * @param newAutoRegistrationStatus
     *        The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * @see AutoRegistrationStatus
     */

    public void setNewAutoRegistrationStatus(String newAutoRegistrationStatus) {
        this.newAutoRegistrationStatus = newAutoRegistrationStatus;
    }

    /**
     * <p>
     * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * </p>
     * 
     * @return The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * @see AutoRegistrationStatus
     */

    public String getNewAutoRegistrationStatus() {
        return this.newAutoRegistrationStatus;
    }

    /**
     * <p>
     * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * </p>
     * 
     * @param newAutoRegistrationStatus
     *        The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRegistrationStatus
     */

    public UpdateCACertificateRequest withNewAutoRegistrationStatus(String newAutoRegistrationStatus) {
        setNewAutoRegistrationStatus(newAutoRegistrationStatus);
        return this;
    }

    /**
     * <p>
     * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * </p>
     * 
     * @param newAutoRegistrationStatus
     *        The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * @see AutoRegistrationStatus
     */

    public void setNewAutoRegistrationStatus(AutoRegistrationStatus newAutoRegistrationStatus) {
        withNewAutoRegistrationStatus(newAutoRegistrationStatus);
    }

    /**
     * <p>
     * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * </p>
     * 
     * @param newAutoRegistrationStatus
     *        The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRegistrationStatus
     */

    public UpdateCACertificateRequest withNewAutoRegistrationStatus(AutoRegistrationStatus newAutoRegistrationStatus) {
        this.newAutoRegistrationStatus = newAutoRegistrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     * 
     * @param registrationConfig
     *        Information about the registration configuration.
     */

    public void setRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
    }

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     * 
     * @return Information about the registration configuration.
     */

    public RegistrationConfig getRegistrationConfig() {
        return this.registrationConfig;
    }

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     * 
     * @param registrationConfig
     *        Information about the registration configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCACertificateRequest withRegistrationConfig(RegistrationConfig registrationConfig) {
        setRegistrationConfig(registrationConfig);
        return this;
    }

    /**
     * <p>
     * If true, remove auto registration.
     * </p>
     * 
     * @param removeAutoRegistration
     *        If true, remove auto registration.
     */

    public void setRemoveAutoRegistration(Boolean removeAutoRegistration) {
        this.removeAutoRegistration = removeAutoRegistration;
    }

    /**
     * <p>
     * If true, remove auto registration.
     * </p>
     * 
     * @return If true, remove auto registration.
     */

    public Boolean getRemoveAutoRegistration() {
        return this.removeAutoRegistration;
    }

    /**
     * <p>
     * If true, remove auto registration.
     * </p>
     * 
     * @param removeAutoRegistration
     *        If true, remove auto registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCACertificateRequest withRemoveAutoRegistration(Boolean removeAutoRegistration) {
        setRemoveAutoRegistration(removeAutoRegistration);
        return this;
    }

    /**
     * <p>
     * If true, remove auto registration.
     * </p>
     * 
     * @return If true, remove auto registration.
     */

    public Boolean isRemoveAutoRegistration() {
        return this.removeAutoRegistration;
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
            sb.append("NewStatus: ").append(getNewStatus()).append(",");
        if (getNewAutoRegistrationStatus() != null)
            sb.append("NewAutoRegistrationStatus: ").append(getNewAutoRegistrationStatus()).append(",");
        if (getRegistrationConfig() != null)
            sb.append("RegistrationConfig: ").append(getRegistrationConfig()).append(",");
        if (getRemoveAutoRegistration() != null)
            sb.append("RemoveAutoRegistration: ").append(getRemoveAutoRegistration());
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
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getNewStatus() == null ^ this.getNewStatus() == null)
            return false;
        if (other.getNewStatus() != null && other.getNewStatus().equals(this.getNewStatus()) == false)
            return false;
        if (other.getNewAutoRegistrationStatus() == null ^ this.getNewAutoRegistrationStatus() == null)
            return false;
        if (other.getNewAutoRegistrationStatus() != null && other.getNewAutoRegistrationStatus().equals(this.getNewAutoRegistrationStatus()) == false)
            return false;
        if (other.getRegistrationConfig() == null ^ this.getRegistrationConfig() == null)
            return false;
        if (other.getRegistrationConfig() != null && other.getRegistrationConfig().equals(this.getRegistrationConfig()) == false)
            return false;
        if (other.getRemoveAutoRegistration() == null ^ this.getRemoveAutoRegistration() == null)
            return false;
        if (other.getRemoveAutoRegistration() != null && other.getRemoveAutoRegistration().equals(this.getRemoveAutoRegistration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getNewStatus() == null) ? 0 : getNewStatus().hashCode());
        hashCode = prime * hashCode + ((getNewAutoRegistrationStatus() == null) ? 0 : getNewAutoRegistrationStatus().hashCode());
        hashCode = prime * hashCode + ((getRegistrationConfig() == null) ? 0 : getRegistrationConfig().hashCode());
        hashCode = prime * hashCode + ((getRemoveAutoRegistration() == null) ? 0 : getRemoveAutoRegistration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCACertificateRequest clone() {
        return (UpdateCACertificateRequest) super.clone();
    }

}
