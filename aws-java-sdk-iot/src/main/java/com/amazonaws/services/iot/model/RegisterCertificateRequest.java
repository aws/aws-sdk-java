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
public class RegisterCertificateRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String certificatePem;

    private String caCertificatePem;

    private Boolean setAsActive;

    /**
     * @param certificatePem
     */

    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * @return
     */

    public String getCertificatePem() {
        return this.certificatePem;
    }

    /**
     * @param certificatePem
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RegisterCertificateRequest withCertificatePem(String certificatePem) {
        setCertificatePem(certificatePem);
        return this;
    }

    /**
     * @param caCertificatePem
     */

    public void setCaCertificatePem(String caCertificatePem) {
        this.caCertificatePem = caCertificatePem;
    }

    /**
     * @return
     */

    public String getCaCertificatePem() {
        return this.caCertificatePem;
    }

    /**
     * @param caCertificatePem
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RegisterCertificateRequest withCaCertificatePem(
            String caCertificatePem) {
        setCaCertificatePem(caCertificatePem);
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

    public RegisterCertificateRequest withSetAsActive(Boolean setAsActive) {
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
        if (getCertificatePem() != null)
            sb.append("CertificatePem: " + getCertificatePem() + ",");
        if (getCaCertificatePem() != null)
            sb.append("CaCertificatePem: " + getCaCertificatePem() + ",");
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

        if (obj instanceof RegisterCertificateRequest == false)
            return false;
        RegisterCertificateRequest other = (RegisterCertificateRequest) obj;
        if (other.getCertificatePem() == null
                ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null
                && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getCaCertificatePem() == null
                ^ this.getCaCertificatePem() == null)
            return false;
        if (other.getCaCertificatePem() != null
                && other.getCaCertificatePem().equals(
                        this.getCaCertificatePem()) == false)
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
                + ((getCertificatePem() == null) ? 0 : getCertificatePem()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCaCertificatePem() == null) ? 0 : getCaCertificatePem()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSetAsActive() == null) ? 0 : getSetAsActive().hashCode());
        return hashCode;
    }

    @Override
    public RegisterCertificateRequest clone() {
        return (RegisterCertificateRequest) super.clone();
    }
}