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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeCertificates(DescribeCertificatesRequest) DescribeCertificates operation}.
 * <p>
 * Lists the set of CA certificates provided by Amazon RDS for this AWS
 * account.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeCertificates(DescribeCertificatesRequest)
 */
public class DescribeCertificatesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The user-supplied certificate identifier. If this parameter is
     * specified, information for only the identified certificate is
     * returned. This parameter isn't case-sensitive. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     */
    private String certificateIdentifier;

    /**
     * This parameter is not currently supported.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional pagination token provided by a previous
     * <a>DescribeCertificates</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * The user-supplied certificate identifier. If this parameter is
     * specified, information for only the identified certificate is
     * returned. This parameter isn't case-sensitive. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     *
     * @return The user-supplied certificate identifier. If this parameter is
     *         specified, information for only the identified certificate is
     *         returned. This parameter isn't case-sensitive. <p>Constraints: <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     */
    public String getCertificateIdentifier() {
        return certificateIdentifier;
    }
    
    /**
     * The user-supplied certificate identifier. If this parameter is
     * specified, information for only the identified certificate is
     * returned. This parameter isn't case-sensitive. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     *
     * @param certificateIdentifier The user-supplied certificate identifier. If this parameter is
     *         specified, information for only the identified certificate is
     *         returned. This parameter isn't case-sensitive. <p>Constraints: <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     */
    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }
    
    /**
     * The user-supplied certificate identifier. If this parameter is
     * specified, information for only the identified certificate is
     * returned. This parameter isn't case-sensitive. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificateIdentifier The user-supplied certificate identifier. If this parameter is
     *         specified, information for only the identified certificate is
     *         returned. This parameter isn't case-sensitive. <p>Constraints: <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeCertificatesRequest withCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
        return this;
    }

    /**
     * This parameter is not currently supported.
     *
     * @return This parameter is not currently supported.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * This parameter is not currently supported.
     *
     * @param filters This parameter is not currently supported.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or {@link
     * #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeCertificatesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeCertificatesRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: Minimum 20, maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: Minimum 20, maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results can be retrieved. <p>Default: 100
     * <p>Constraints: Minimum 20, maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results can be retrieved. <p>Default: 100
     *         <p>Constraints: Minimum 20, maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeCertificatesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional pagination token provided by a previous
     * <a>DescribeCertificates</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous
     *         <a>DescribeCertificates</a> request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <a>DescribeCertificates</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous
     *         <a>DescribeCertificates</a> request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <a>DescribeCertificates</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         <a>DescribeCertificates</a> request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeCertificatesRequest withMarker(String marker) {
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
        if (getCertificateIdentifier() != null) sb.append("CertificateIdentifier: " + getCertificateIdentifier() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCertificateIdentifier() == null) ? 0 : getCertificateIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCertificatesRequest == false) return false;
        DescribeCertificatesRequest other = (DescribeCertificatesRequest)obj;
        
        if (other.getCertificateIdentifier() == null ^ this.getCertificateIdentifier() == null) return false;
        if (other.getCertificateIdentifier() != null && other.getCertificateIdentifier().equals(this.getCertificateIdentifier()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeCertificatesRequest clone() {
        
            return (DescribeCertificatesRequest) super.clone();
    }

}
    