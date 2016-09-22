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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ImportCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The customer-assigned name of the certificate. Valid characters are [A-z_0-9].
     * </p>
     */
    private String certificateIdentifier;
    /**
     * <p>
     * The contents of the .pem X.509 certificate file.
     * </p>
     */
    private String certificatePem;

    /**
     * <p>
     * The customer-assigned name of the certificate. Valid characters are [A-z_0-9].
     * </p>
     * 
     * @param certificateIdentifier
     *        The customer-assigned name of the certificate. Valid characters are [A-z_0-9].
     */

    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }

    /**
     * <p>
     * The customer-assigned name of the certificate. Valid characters are [A-z_0-9].
     * </p>
     * 
     * @return The customer-assigned name of the certificate. Valid characters are [A-z_0-9].
     */

    public String getCertificateIdentifier() {
        return this.certificateIdentifier;
    }

    /**
     * <p>
     * The customer-assigned name of the certificate. Valid characters are [A-z_0-9].
     * </p>
     * 
     * @param certificateIdentifier
     *        The customer-assigned name of the certificate. Valid characters are [A-z_0-9].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withCertificateIdentifier(String certificateIdentifier) {
        setCertificateIdentifier(certificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The contents of the .pem X.509 certificate file.
     * </p>
     * 
     * @param certificatePem
     *        The contents of the .pem X.509 certificate file.
     */

    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * The contents of the .pem X.509 certificate file.
     * </p>
     * 
     * @return The contents of the .pem X.509 certificate file.
     */

    public String getCertificatePem() {
        return this.certificatePem;
    }

    /**
     * <p>
     * The contents of the .pem X.509 certificate file.
     * </p>
     * 
     * @param certificatePem
     *        The contents of the .pem X.509 certificate file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withCertificatePem(String certificatePem) {
        setCertificatePem(certificatePem);
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
        if (getCertificateIdentifier() != null)
            sb.append("CertificateIdentifier: " + getCertificateIdentifier() + ",");
        if (getCertificatePem() != null)
            sb.append("CertificatePem: " + getCertificatePem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportCertificateRequest == false)
            return false;
        ImportCertificateRequest other = (ImportCertificateRequest) obj;
        if (other.getCertificateIdentifier() == null ^ this.getCertificateIdentifier() == null)
            return false;
        if (other.getCertificateIdentifier() != null && other.getCertificateIdentifier().equals(this.getCertificateIdentifier()) == false)
            return false;
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateIdentifier() == null) ? 0 : getCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        return hashCode;
    }

    @Override
    public ImportCertificateRequest clone() {
        return (ImportCertificateRequest) super.clone();
    }
}
