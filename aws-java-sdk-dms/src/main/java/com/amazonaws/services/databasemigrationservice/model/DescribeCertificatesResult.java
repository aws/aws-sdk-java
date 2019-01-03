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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeCertificates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The Secure Sockets Layer (SSL) certificates associated with the replication instance.
     * </p>
     */
    private java.util.List<Certificate> certificates;

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param marker
     *        The pagination token.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param marker
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificatesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The Secure Sockets Layer (SSL) certificates associated with the replication instance.
     * </p>
     * 
     * @return The Secure Sockets Layer (SSL) certificates associated with the replication instance.
     */

    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * The Secure Sockets Layer (SSL) certificates associated with the replication instance.
     * </p>
     * 
     * @param certificates
     *        The Secure Sockets Layer (SSL) certificates associated with the replication instance.
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
     * The Secure Sockets Layer (SSL) certificates associated with the replication instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificates(java.util.Collection)} or {@link #withCertificates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificates
     *        The Secure Sockets Layer (SSL) certificates associated with the replication instance.
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
     * The Secure Sockets Layer (SSL) certificates associated with the replication instance.
     * </p>
     * 
     * @param certificates
     *        The Secure Sockets Layer (SSL) certificates associated with the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificatesResult withCertificates(java.util.Collection<Certificate> certificates) {
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
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

        if (obj instanceof DescribeCertificatesResult == false)
            return false;
        DescribeCertificatesResult other = (DescribeCertificatesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
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

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
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
