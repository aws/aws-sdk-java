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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificateAuthorityCsr" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCertificateAuthorityCsrResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * </p>
     */
    private String csr;

    /**
     * <p>
     * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * </p>
     * 
     * @param csr
     *        The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     */

    public void setCsr(String csr) {
        this.csr = csr;
    }

    /**
     * <p>
     * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * </p>
     * 
     * @return The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     */

    public String getCsr() {
        return this.csr;
    }

    /**
     * <p>
     * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * </p>
     * 
     * @param csr
     *        The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificateAuthorityCsrResult withCsr(String csr) {
        setCsr(csr);
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
        if (getCsr() != null)
            sb.append("Csr: ").append(getCsr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCertificateAuthorityCsrResult == false)
            return false;
        GetCertificateAuthorityCsrResult other = (GetCertificateAuthorityCsrResult) obj;
        if (other.getCsr() == null ^ this.getCsr() == null)
            return false;
        if (other.getCsr() != null && other.getCsr().equals(this.getCsr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCsr() == null) ? 0 : getCsr().hashCode());
        return hashCode;
    }

    @Override
    public GetCertificateAuthorityCsrResult clone() {
        try {
            return (GetCertificateAuthorityCsrResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
