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
 * The input to the RegisterCACertificate operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterCACertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The CA certificate.
     * </p>
     */
    private String caCertificate;
    /**
     * <p>
     * The private key verification certificate.
     * </p>
     */
    private String verificationCertificate;
    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     */
    private Boolean setAsActive;
    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device certificates.
     * </p>
     */
    private Boolean allowAutoRegistration;
    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     */
    private RegistrationConfig registrationConfig;

    /**
     * <p>
     * The CA certificate.
     * </p>
     * 
     * @param caCertificate
     *        The CA certificate.
     */

    public void setCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
    }

    /**
     * <p>
     * The CA certificate.
     * </p>
     * 
     * @return The CA certificate.
     */

    public String getCaCertificate() {
        return this.caCertificate;
    }

    /**
     * <p>
     * The CA certificate.
     * </p>
     * 
     * @param caCertificate
     *        The CA certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterCACertificateRequest withCaCertificate(String caCertificate) {
        setCaCertificate(caCertificate);
        return this;
    }

    /**
     * <p>
     * The private key verification certificate.
     * </p>
     * 
     * @param verificationCertificate
     *        The private key verification certificate.
     */

    public void setVerificationCertificate(String verificationCertificate) {
        this.verificationCertificate = verificationCertificate;
    }

    /**
     * <p>
     * The private key verification certificate.
     * </p>
     * 
     * @return The private key verification certificate.
     */

    public String getVerificationCertificate() {
        return this.verificationCertificate;
    }

    /**
     * <p>
     * The private key verification certificate.
     * </p>
     * 
     * @param verificationCertificate
     *        The private key verification certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterCACertificateRequest withVerificationCertificate(String verificationCertificate) {
        setVerificationCertificate(verificationCertificate);
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     * 
     * @param setAsActive
     *        A boolean value that specifies if the CA certificate is set to active.
     */

    public void setSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     * 
     * @return A boolean value that specifies if the CA certificate is set to active.
     */

    public Boolean getSetAsActive() {
        return this.setAsActive;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     * 
     * @param setAsActive
     *        A boolean value that specifies if the CA certificate is set to active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterCACertificateRequest withSetAsActive(Boolean setAsActive) {
        setSetAsActive(setAsActive);
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     * 
     * @return A boolean value that specifies if the CA certificate is set to active.
     */

    public Boolean isSetAsActive() {
        return this.setAsActive;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device certificates.
     * </p>
     * 
     * @param allowAutoRegistration
     *        Allows this CA certificate to be used for auto registration of device certificates.
     */

    public void setAllowAutoRegistration(Boolean allowAutoRegistration) {
        this.allowAutoRegistration = allowAutoRegistration;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device certificates.
     * </p>
     * 
     * @return Allows this CA certificate to be used for auto registration of device certificates.
     */

    public Boolean getAllowAutoRegistration() {
        return this.allowAutoRegistration;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device certificates.
     * </p>
     * 
     * @param allowAutoRegistration
     *        Allows this CA certificate to be used for auto registration of device certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterCACertificateRequest withAllowAutoRegistration(Boolean allowAutoRegistration) {
        setAllowAutoRegistration(allowAutoRegistration);
        return this;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device certificates.
     * </p>
     * 
     * @return Allows this CA certificate to be used for auto registration of device certificates.
     */

    public Boolean isAllowAutoRegistration() {
        return this.allowAutoRegistration;
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

    public RegisterCACertificateRequest withRegistrationConfig(RegistrationConfig registrationConfig) {
        setRegistrationConfig(registrationConfig);
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
        if (getCaCertificate() != null)
            sb.append("CaCertificate: ").append(getCaCertificate()).append(",");
        if (getVerificationCertificate() != null)
            sb.append("VerificationCertificate: ").append(getVerificationCertificate()).append(",");
        if (getSetAsActive() != null)
            sb.append("SetAsActive: ").append(getSetAsActive()).append(",");
        if (getAllowAutoRegistration() != null)
            sb.append("AllowAutoRegistration: ").append(getAllowAutoRegistration()).append(",");
        if (getRegistrationConfig() != null)
            sb.append("RegistrationConfig: ").append(getRegistrationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterCACertificateRequest == false)
            return false;
        RegisterCACertificateRequest other = (RegisterCACertificateRequest) obj;
        if (other.getCaCertificate() == null ^ this.getCaCertificate() == null)
            return false;
        if (other.getCaCertificate() != null && other.getCaCertificate().equals(this.getCaCertificate()) == false)
            return false;
        if (other.getVerificationCertificate() == null ^ this.getVerificationCertificate() == null)
            return false;
        if (other.getVerificationCertificate() != null && other.getVerificationCertificate().equals(this.getVerificationCertificate()) == false)
            return false;
        if (other.getSetAsActive() == null ^ this.getSetAsActive() == null)
            return false;
        if (other.getSetAsActive() != null && other.getSetAsActive().equals(this.getSetAsActive()) == false)
            return false;
        if (other.getAllowAutoRegistration() == null ^ this.getAllowAutoRegistration() == null)
            return false;
        if (other.getAllowAutoRegistration() != null && other.getAllowAutoRegistration().equals(this.getAllowAutoRegistration()) == false)
            return false;
        if (other.getRegistrationConfig() == null ^ this.getRegistrationConfig() == null)
            return false;
        if (other.getRegistrationConfig() != null && other.getRegistrationConfig().equals(this.getRegistrationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaCertificate() == null) ? 0 : getCaCertificate().hashCode());
        hashCode = prime * hashCode + ((getVerificationCertificate() == null) ? 0 : getVerificationCertificate().hashCode());
        hashCode = prime * hashCode + ((getSetAsActive() == null) ? 0 : getSetAsActive().hashCode());
        hashCode = prime * hashCode + ((getAllowAutoRegistration() == null) ? 0 : getAllowAutoRegistration().hashCode());
        hashCode = prime * hashCode + ((getRegistrationConfig() == null) ? 0 : getRegistrationConfig().hashCode());
        return hashCode;
    }

    @Override
    public RegisterCACertificateRequest clone() {
        return (RegisterCACertificateRequest) super.clone();
    }

}
