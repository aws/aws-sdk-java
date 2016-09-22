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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input to the RegisterCertificate operation.
 * </p>
 */
public class RegisterCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     */
    private String certificatePem;
    /**
     * <p>
     * The CA certificate used to sign the device certificate being registered.
     * </p>
     */
    private String caCertificatePem;
    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     */
    @Deprecated
    private Boolean setAsActive;

    private String status;

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * 
     * @param certificatePem
     *        The certificate data, in PEM format.
     */

    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * 
     * @return The certificate data, in PEM format.
     */

    public String getCertificatePem() {
        return this.certificatePem;
    }

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * 
     * @param certificatePem
     *        The certificate data, in PEM format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterCertificateRequest withCertificatePem(String certificatePem) {
        setCertificatePem(certificatePem);
        return this;
    }

    /**
     * <p>
     * The CA certificate used to sign the device certificate being registered.
     * </p>
     * 
     * @param caCertificatePem
     *        The CA certificate used to sign the device certificate being registered.
     */

    public void setCaCertificatePem(String caCertificatePem) {
        this.caCertificatePem = caCertificatePem;
    }

    /**
     * <p>
     * The CA certificate used to sign the device certificate being registered.
     * </p>
     * 
     * @return The CA certificate used to sign the device certificate being registered.
     */

    public String getCaCertificatePem() {
        return this.caCertificatePem;
    }

    /**
     * <p>
     * The CA certificate used to sign the device certificate being registered.
     * </p>
     * 
     * @param caCertificatePem
     *        The CA certificate used to sign the device certificate being registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterCertificateRequest withCaCertificatePem(String caCertificatePem) {
        setCaCertificatePem(caCertificatePem);
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
    @Deprecated
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
    @Deprecated
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
    @Deprecated
    public RegisterCertificateRequest withSetAsActive(Boolean setAsActive) {
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
    @Deprecated
    public Boolean isSetAsActive() {
        return this.setAsActive;
    }

    /**
     * @param status
     * @see CertificateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see CertificateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public RegisterCertificateRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @see CertificateStatus
     */

    public void setStatus(CertificateStatus status) {
        this.status = status.toString();
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public RegisterCertificateRequest withStatus(CertificateStatus status) {
        setStatus(status);
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
        if (getCertificatePem() != null)
            sb.append("CertificatePem: " + getCertificatePem() + ",");
        if (getCaCertificatePem() != null)
            sb.append("CaCertificatePem: " + getCaCertificatePem() + ",");
        if (getSetAsActive() != null)
            sb.append("SetAsActive: " + getSetAsActive() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterCertificateRequest == false)
            return false;
        RegisterCertificateRequest other = (RegisterCertificateRequest) obj;
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getCaCertificatePem() == null ^ this.getCaCertificatePem() == null)
            return false;
        if (other.getCaCertificatePem() != null && other.getCaCertificatePem().equals(this.getCaCertificatePem()) == false)
            return false;
        if (other.getSetAsActive() == null ^ this.getSetAsActive() == null)
            return false;
        if (other.getSetAsActive() != null && other.getSetAsActive().equals(this.getSetAsActive()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode + ((getCaCertificatePem() == null) ? 0 : getCaCertificatePem().hashCode());
        hashCode = prime * hashCode + ((getSetAsActive() == null) ? 0 : getSetAsActive().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public RegisterCertificateRequest clone() {
        return (RegisterCertificateRequest) super.clone();
    }
}
