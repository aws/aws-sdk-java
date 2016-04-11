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
 * 
 */
public class RegisterCACertificateRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String caCertificate;

    private String verificationCertificate;

    private Boolean setAsActive;

    /**
     * @param caCertificate
     */

    public void setCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
    }

    /**
     * @return
     */

    public String getCaCertificate() {
        return this.caCertificate;
    }

    /**
     * @param caCertificate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RegisterCACertificateRequest withCaCertificate(String caCertificate) {
        setCaCertificate(caCertificate);
        return this;
    }

    /**
     * @param verificationCertificate
     */

    public void setVerificationCertificate(String verificationCertificate) {
        this.verificationCertificate = verificationCertificate;
    }

    /**
     * @return
     */

    public String getVerificationCertificate() {
        return this.verificationCertificate;
    }

    /**
     * @param verificationCertificate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RegisterCACertificateRequest withVerificationCertificate(
            String verificationCertificate) {
        setVerificationCertificate(verificationCertificate);
        return this;
    }

    /**
     * @param setAsActive
     */

    public void setSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
    }

    /**
     * @return
     */

    public Boolean getSetAsActive() {
        return this.setAsActive;
    }

    /**
     * @param setAsActive
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RegisterCACertificateRequest withSetAsActive(Boolean setAsActive) {
        setSetAsActive(setAsActive);
        return this;
    }

    /**
     * @return
     */

    public Boolean isSetAsActive() {
        return this.setAsActive;
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
        if (getCaCertificate() != null)
            sb.append("CaCertificate: " + getCaCertificate() + ",");
        if (getVerificationCertificate() != null)
            sb.append("VerificationCertificate: "
                    + getVerificationCertificate() + ",");
        if (getSetAsActive() != null)
            sb.append("SetAsActive: " + getSetAsActive());
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
        if (other.getCaCertificate() != null
                && other.getCaCertificate().equals(this.getCaCertificate()) == false)
            return false;
        if (other.getVerificationCertificate() == null
                ^ this.getVerificationCertificate() == null)
            return false;
        if (other.getVerificationCertificate() != null
                && other.getVerificationCertificate().equals(
                        this.getVerificationCertificate()) == false)
            return false;
        if (other.getSetAsActive() == null ^ this.getSetAsActive() == null)
            return false;
        if (other.getSetAsActive() != null
                && other.getSetAsActive().equals(this.getSetAsActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCaCertificate() == null) ? 0 : getCaCertificate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVerificationCertificate() == null) ? 0
                        : getVerificationCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getSetAsActive() == null) ? 0 : getSetAsActive().hashCode());
        return hashCode;
    }

    @Override
    public RegisterCACertificateRequest clone() {
        return (RegisterCACertificateRequest) super.clone();
    }
}