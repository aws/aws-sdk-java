/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Data returned by the <b>DescribeCertificates</b> action.
 * </p>
 */
public class DescribeCertificatesResult implements Serializable, Cloneable {

    /**
     * The list of <a>Certificate</a> objects for the AWS account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Certificate> certificates;

    /**
     * An optional pagination token provided by a previous
     * <a>DescribeCertificates</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     */
    private String marker;

    /**
     * The list of <a>Certificate</a> objects for the AWS account.
     *
     * @return The list of <a>Certificate</a> objects for the AWS account.
     */
    public java.util.List<Certificate> getCertificates() {
        if (certificates == null) {
              certificates = new com.amazonaws.internal.ListWithAutoConstructFlag<Certificate>();
              certificates.setAutoConstruct(true);
        }
        return certificates;
    }
    
    /**
     * The list of <a>Certificate</a> objects for the AWS account.
     *
     * @param certificates The list of <a>Certificate</a> objects for the AWS account.
     */
    public void setCertificates(java.util.Collection<Certificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Certificate> certificatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Certificate>(certificates.size());
        certificatesCopy.addAll(certificates);
        this.certificates = certificatesCopy;
    }
    
    /**
     * The list of <a>Certificate</a> objects for the AWS account.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCertificates(java.util.Collection)} or {@link
     * #withCertificates(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificates The list of <a>Certificate</a> objects for the AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeCertificatesResult withCertificates(Certificate... certificates) {
        if (getCertificates() == null) setCertificates(new java.util.ArrayList<Certificate>(certificates.length));
        for (Certificate value : certificates) {
            getCertificates().add(value);
        }
        return this;
    }
    
    /**
     * The list of <a>Certificate</a> objects for the AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificates The list of <a>Certificate</a> objects for the AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeCertificatesResult withCertificates(java.util.Collection<Certificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Certificate> certificatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Certificate>(certificates.size());
            certificatesCopy.addAll(certificates);
            this.certificates = certificatesCopy;
        }

        return this;
    }

    /**
     * An optional pagination token provided by a previous
     * <a>DescribeCertificates</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     *
     * @return An optional pagination token provided by a previous
     *         <a>DescribeCertificates</a> request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code> .
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <a>DescribeCertificates</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     *
     * @param marker An optional pagination token provided by a previous
     *         <a>DescribeCertificates</a> request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code> .
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <a>DescribeCertificates</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         <a>DescribeCertificates</a> request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code> .
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeCertificatesResult withMarker(String marker) {
        this.marker = marker;
        return this;
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
        if (getCertificates() != null) sb.append("Certificates: " + getCertificates() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCertificatesResult == false) return false;
        DescribeCertificatesResult other = (DescribeCertificatesResult)obj;
        
        if (other.getCertificates() == null ^ this.getCertificates() == null) return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeCertificatesResult clone() {
        try {
            return (DescribeCertificatesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    