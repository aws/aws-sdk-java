/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeCertificates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of certificates for this AWS account.
     * </p>
     */
    private java.util.List<Certificate> certificates;
    /**
     * <p>
     * An optional pagination token provided if the number of records retrieved is greater than <code>MaxRecords</code>.
     * If this parameter is specified, the marker specifies the next record in the list. Including the value of
     * <code>Marker</code> in the next call to <code>DescribeCertificates</code> results in the next page of
     * certificates.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of certificates for this AWS account.
     * </p>
     * 
     * @return A list of certificates for this AWS account.
     */

    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * A list of certificates for this AWS account.
     * </p>
     * 
     * @param certificates
     *        A list of certificates for this AWS account.
     */

    public void setCertificates(java.util.Collection<Certificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<Certificate>(certificates);
    }

    /**
     * <p>
     * A list of certificates for this AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        A list of certificates for this AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificatesResult withCertificates(Certificate... certificates) {
        if (this.certificates == null) {
            setCertificates(new java.util.ArrayList<Certificate>(certificates.length));
        }
        for (Certificate ele : certificates) {
            this.certificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of certificates for this AWS account.
     * </p>
     * 
     * @param certificates
     *        A list of certificates for this AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificatesResult withCertificates(java.util.Collection<Certificate> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided if the number of records retrieved is greater than <code>MaxRecords</code>.
     * If this parameter is specified, the marker specifies the next record in the list. Including the value of
     * <code>Marker</code> in the next call to <code>DescribeCertificates</code> results in the next page of
     * certificates.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided if the number of records retrieved is greater than
     *        <code>MaxRecords</code>. If this parameter is specified, the marker specifies the next record in the list.
     *        Including the value of <code>Marker</code> in the next call to <code>DescribeCertificates</code> results
     *        in the next page of certificates.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided if the number of records retrieved is greater than <code>MaxRecords</code>.
     * If this parameter is specified, the marker specifies the next record in the list. Including the value of
     * <code>Marker</code> in the next call to <code>DescribeCertificates</code> results in the next page of
     * certificates.
     * </p>
     * 
     * @return An optional pagination token provided if the number of records retrieved is greater than
     *         <code>MaxRecords</code>. If this parameter is specified, the marker specifies the next record in the
     *         list. Including the value of <code>Marker</code> in the next call to <code>DescribeCertificates</code>
     *         results in the next page of certificates.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided if the number of records retrieved is greater than <code>MaxRecords</code>.
     * If this parameter is specified, the marker specifies the next record in the list. Including the value of
     * <code>Marker</code> in the next call to <code>DescribeCertificates</code> results in the next page of
     * certificates.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided if the number of records retrieved is greater than
     *        <code>MaxRecords</code>. If this parameter is specified, the marker specifies the next record in the list.
     *        Including the value of <code>Marker</code> in the next call to <code>DescribeCertificates</code> results
     *        in the next page of certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificatesResult withMarker(String marker) {
        setMarker(marker);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificatesResult == false)
            return false;
        DescribeCertificatesResult other = (DescribeCertificatesResult) obj;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCertificatesResult clone() {
        try {
            return (DescribeCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
