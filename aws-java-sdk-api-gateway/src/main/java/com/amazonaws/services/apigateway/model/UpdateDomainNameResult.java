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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
 * </p>
 * <div class="seeAlso"> <a
 * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html">Use Client-Side
 * Certificate</a> </div>
 */
public class UpdateDomainNameResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the <a>DomainName</a> resource.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The name of the certificate.
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * The date when the certificate was uploaded, in <a href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     */
    private java.util.Date certificateUploadDate;
    /**
     * <p>
     * The domain name of the Amazon CloudFront distribution. For more information, see the <a
     * href="http://aws.amazon.com/documentation/cloudfront/" target="_blank">Amazon CloudFront documentation</a>.
     * </p>
     */
    private String distributionDomainName;

    /**
     * <p>
     * The name of the <a>DomainName</a> resource.
     * </p>
     * 
     * @param domainName
     *        The name of the <a>DomainName</a> resource.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the <a>DomainName</a> resource.
     * </p>
     * 
     * @return The name of the <a>DomainName</a> resource.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the <a>DomainName</a> resource.
     * </p>
     * 
     * @param domainName
     *        The name of the <a>DomainName</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The name of the certificate.
     * </p>
     * 
     * @param certificateName
     *        The name of the certificate.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of the certificate.
     * </p>
     * 
     * @return The name of the certificate.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The name of the certificate.
     * </p>
     * 
     * @param certificateName
     *        The name of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameResult withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * The date when the certificate was uploaded, in <a href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param certificateUploadDate
     *        The date when the certificate was uploaded, in <a href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *        target="_blank">ISO 8601 format</a>.
     */

    public void setCertificateUploadDate(java.util.Date certificateUploadDate) {
        this.certificateUploadDate = certificateUploadDate;
    }

    /**
     * <p>
     * The date when the certificate was uploaded, in <a href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @return The date when the certificate was uploaded, in <a
     *         href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     */

    public java.util.Date getCertificateUploadDate() {
        return this.certificateUploadDate;
    }

    /**
     * <p>
     * The date when the certificate was uploaded, in <a href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param certificateUploadDate
     *        The date when the certificate was uploaded, in <a href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *        target="_blank">ISO 8601 format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameResult withCertificateUploadDate(java.util.Date certificateUploadDate) {
        setCertificateUploadDate(certificateUploadDate);
        return this;
    }

    /**
     * <p>
     * The domain name of the Amazon CloudFront distribution. For more information, see the <a
     * href="http://aws.amazon.com/documentation/cloudfront/" target="_blank">Amazon CloudFront documentation</a>.
     * </p>
     * 
     * @param distributionDomainName
     *        The domain name of the Amazon CloudFront distribution. For more information, see the <a
     *        href="http://aws.amazon.com/documentation/cloudfront/" target="_blank">Amazon CloudFront
     *        documentation</a>.
     */

    public void setDistributionDomainName(String distributionDomainName) {
        this.distributionDomainName = distributionDomainName;
    }

    /**
     * <p>
     * The domain name of the Amazon CloudFront distribution. For more information, see the <a
     * href="http://aws.amazon.com/documentation/cloudfront/" target="_blank">Amazon CloudFront documentation</a>.
     * </p>
     * 
     * @return The domain name of the Amazon CloudFront distribution. For more information, see the <a
     *         href="http://aws.amazon.com/documentation/cloudfront/" target="_blank">Amazon CloudFront
     *         documentation</a>.
     */

    public String getDistributionDomainName() {
        return this.distributionDomainName;
    }

    /**
     * <p>
     * The domain name of the Amazon CloudFront distribution. For more information, see the <a
     * href="http://aws.amazon.com/documentation/cloudfront/" target="_blank">Amazon CloudFront documentation</a>.
     * </p>
     * 
     * @param distributionDomainName
     *        The domain name of the Amazon CloudFront distribution. For more information, see the <a
     *        href="http://aws.amazon.com/documentation/cloudfront/" target="_blank">Amazon CloudFront
     *        documentation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameResult withDistributionDomainName(String distributionDomainName) {
        setDistributionDomainName(distributionDomainName);
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getCertificateName() != null)
            sb.append("CertificateName: " + getCertificateName() + ",");
        if (getCertificateUploadDate() != null)
            sb.append("CertificateUploadDate: " + getCertificateUploadDate() + ",");
        if (getDistributionDomainName() != null)
            sb.append("DistributionDomainName: " + getDistributionDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainNameResult == false)
            return false;
        UpdateDomainNameResult other = (UpdateDomainNameResult) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getCertificateUploadDate() == null ^ this.getCertificateUploadDate() == null)
            return false;
        if (other.getCertificateUploadDate() != null && other.getCertificateUploadDate().equals(this.getCertificateUploadDate()) == false)
            return false;
        if (other.getDistributionDomainName() == null ^ this.getDistributionDomainName() == null)
            return false;
        if (other.getDistributionDomainName() != null && other.getDistributionDomainName().equals(this.getDistributionDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode + ((getCertificateUploadDate() == null) ? 0 : getCertificateUploadDate().hashCode());
        hashCode = prime * hashCode + ((getDistributionDomainName() == null) ? 0 : getDistributionDomainName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainNameResult clone() {
        try {
            return (UpdateDomainNameResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
