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

/**
 * <p>
 * The output from the ListCACertificates operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCACertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The CA certificates registered in your AWS account.
     * </p>
     */
    private java.util.List<CACertificate> certificates;
    /**
     * <p>
     * The current position within the list of CA certificates.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * The CA certificates registered in your AWS account.
     * </p>
     * 
     * @return The CA certificates registered in your AWS account.
     */

    public java.util.List<CACertificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * The CA certificates registered in your AWS account.
     * </p>
     * 
     * @param certificates
     *        The CA certificates registered in your AWS account.
     */

    public void setCertificates(java.util.Collection<CACertificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<CACertificate>(certificates);
    }

    /**
     * <p>
     * The CA certificates registered in your AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        The CA certificates registered in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCACertificatesResult withCertificates(CACertificate... certificates) {
        if (this.certificates == null) {
            setCertificates(new java.util.ArrayList<CACertificate>(certificates.length));
        }
        for (CACertificate ele : certificates) {
            this.certificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CA certificates registered in your AWS account.
     * </p>
     * 
     * @param certificates
     *        The CA certificates registered in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCACertificatesResult withCertificates(java.util.Collection<CACertificate> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * The current position within the list of CA certificates.
     * </p>
     * 
     * @param nextMarker
     *        The current position within the list of CA certificates.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The current position within the list of CA certificates.
     * </p>
     * 
     * @return The current position within the list of CA certificates.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The current position within the list of CA certificates.
     * </p>
     * 
     * @param nextMarker
     *        The current position within the list of CA certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCACertificatesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCACertificatesResult == false)
            return false;
        ListCACertificatesResult other = (ListCACertificatesResult) obj;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListCACertificatesResult clone() {
        try {
            return (ListCACertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
