/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListCertificates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the next token, which you can use to list the next certificate.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Returns an array of the certificates that are specified in the <code>ListCertificates</code> call.
     * </p>
     */
    private java.util.List<ListedCertificate> certificates;

    /**
     * <p>
     * Returns the next token, which you can use to list the next certificate.
     * </p>
     * 
     * @param nextToken
     *        Returns the next token, which you can use to list the next certificate.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Returns the next token, which you can use to list the next certificate.
     * </p>
     * 
     * @return Returns the next token, which you can use to list the next certificate.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Returns the next token, which you can use to list the next certificate.
     * </p>
     * 
     * @param nextToken
     *        Returns the next token, which you can use to list the next certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Returns an array of the certificates that are specified in the <code>ListCertificates</code> call.
     * </p>
     * 
     * @return Returns an array of the certificates that are specified in the <code>ListCertificates</code> call.
     */

    public java.util.List<ListedCertificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * Returns an array of the certificates that are specified in the <code>ListCertificates</code> call.
     * </p>
     * 
     * @param certificates
     *        Returns an array of the certificates that are specified in the <code>ListCertificates</code> call.
     */

    public void setCertificates(java.util.Collection<ListedCertificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<ListedCertificate>(certificates);
    }

    /**
     * <p>
     * Returns an array of the certificates that are specified in the <code>ListCertificates</code> call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        Returns an array of the certificates that are specified in the <code>ListCertificates</code> call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesResult withCertificates(ListedCertificate... certificates) {
        if (this.certificates == null) {
            setCertificates(new java.util.ArrayList<ListedCertificate>(certificates.length));
        }
        for (ListedCertificate ele : certificates) {
            this.certificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns an array of the certificates that are specified in the <code>ListCertificates</code> call.
     * </p>
     * 
     * @param certificates
     *        Returns an array of the certificates that are specified in the <code>ListCertificates</code> call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesResult withCertificates(java.util.Collection<ListedCertificate> certificates) {
        setCertificates(certificates);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCertificatesResult == false)
            return false;
        ListCertificatesResult other = (ListCertificatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        return hashCode;
    }

    @Override
    public ListCertificatesResult clone() {
        try {
            return (ListCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
