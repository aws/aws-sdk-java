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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a <a>CertificateDetail</a> structure that lists the fields of an ACM Certificate.
     * </p>
     */
    private CertificateDetail certificate;

    /**
     * <p>
     * Contains a <a>CertificateDetail</a> structure that lists the fields of an ACM Certificate.
     * </p>
     * 
     * @param certificate
     *        Contains a <a>CertificateDetail</a> structure that lists the fields of an ACM Certificate.
     */

    public void setCertificate(CertificateDetail certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * Contains a <a>CertificateDetail</a> structure that lists the fields of an ACM Certificate.
     * </p>
     * 
     * @return Contains a <a>CertificateDetail</a> structure that lists the fields of an ACM Certificate.
     */

    public CertificateDetail getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * Contains a <a>CertificateDetail</a> structure that lists the fields of an ACM Certificate.
     * </p>
     * 
     * @param certificate
     *        Contains a <a>CertificateDetail</a> structure that lists the fields of an ACM Certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateResult withCertificate(CertificateDetail certificate) {
        setCertificate(certificate);
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
        if (getCertificate() != null)
            sb.append("Certificate: " + getCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificateResult == false)
            return false;
        DescribeCertificateResult other = (DescribeCertificateResult) obj;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCertificateResult clone() {
        try {
            return (DescribeCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
