/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * 
 */
public class ViewerCertificate implements Serializable, Cloneable {

    private String certificate;

    private String certificateSource;

    private String sSLSupportMethod;

    private String minimumProtocolVersion;

    private String iAMCertificateId;

    private Boolean cloudFrontDefaultCertificate;

    /**
     * @param certificate
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * @return
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @param certificate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ViewerCertificate withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * @param certificateSource
     * @see CertificateSource
     */
    public void setCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
    }

    /**
     * @return
     * @see CertificateSource
     */
    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * @param certificateSource
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateSource
     */
    public ViewerCertificate withCertificateSource(String certificateSource) {
        setCertificateSource(certificateSource);
        return this;
    }

    /**
     * @param certificateSource
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateSource
     */
    public void setCertificateSource(CertificateSource certificateSource) {
        this.certificateSource = certificateSource.toString();
    }

    /**
     * @param certificateSource
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateSource
     */
    public ViewerCertificate withCertificateSource(
            CertificateSource certificateSource) {
        setCertificateSource(certificateSource);
        return this;
    }

    /**
     * @param sSLSupportMethod
     * @see SSLSupportMethod
     */
    public void setSSLSupportMethod(String sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod;
    }

    /**
     * @return
     * @see SSLSupportMethod
     */
    public String getSSLSupportMethod() {
        return this.sSLSupportMethod;
    }

    /**
     * @param sSLSupportMethod
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SSLSupportMethod
     */
    public ViewerCertificate withSSLSupportMethod(String sSLSupportMethod) {
        setSSLSupportMethod(sSLSupportMethod);
        return this;
    }

    /**
     * @param sSLSupportMethod
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SSLSupportMethod
     */
    public void setSSLSupportMethod(SSLSupportMethod sSLSupportMethod) {
        this.sSLSupportMethod = sSLSupportMethod.toString();
    }

    /**
     * @param sSLSupportMethod
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SSLSupportMethod
     */
    public ViewerCertificate withSSLSupportMethod(
            SSLSupportMethod sSLSupportMethod) {
        setSSLSupportMethod(sSLSupportMethod);
        return this;
    }

    /**
     * @param minimumProtocolVersion
     * @see MinimumProtocolVersion
     */
    public void setMinimumProtocolVersion(String minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion;
    }

    /**
     * @return
     * @see MinimumProtocolVersion
     */
    public String getMinimumProtocolVersion() {
        return this.minimumProtocolVersion;
    }

    /**
     * @param minimumProtocolVersion
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MinimumProtocolVersion
     */
    public ViewerCertificate withMinimumProtocolVersion(
            String minimumProtocolVersion) {
        setMinimumProtocolVersion(minimumProtocolVersion);
        return this;
    }

    /**
     * @param minimumProtocolVersion
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MinimumProtocolVersion
     */
    public void setMinimumProtocolVersion(
            MinimumProtocolVersion minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion.toString();
    }

    /**
     * @param minimumProtocolVersion
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MinimumProtocolVersion
     */
    public ViewerCertificate withMinimumProtocolVersion(
            MinimumProtocolVersion minimumProtocolVersion) {
        setMinimumProtocolVersion(minimumProtocolVersion);
        return this;
    }

    /**
     * @param iAMCertificateId
     */
    public void setIAMCertificateId(String iAMCertificateId) {
        this.iAMCertificateId = iAMCertificateId;
    }

    /**
     * @return
     */
    public String getIAMCertificateId() {
        return this.iAMCertificateId;
    }

    /**
     * @param iAMCertificateId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ViewerCertificate withIAMCertificateId(String iAMCertificateId) {
        setIAMCertificateId(iAMCertificateId);
        return this;
    }

    /**
     * @param cloudFrontDefaultCertificate
     */
    public void setCloudFrontDefaultCertificate(
            Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    }

    /**
     * @return
     */
    public Boolean getCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * @param cloudFrontDefaultCertificate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ViewerCertificate withCloudFrontDefaultCertificate(
            Boolean cloudFrontDefaultCertificate) {
        setCloudFrontDefaultCertificate(cloudFrontDefaultCertificate);
        return this;
    }

    /**
     * @return
     */
    public Boolean isCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
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
        if (getCertificate() != null)
            sb.append("Certificate: " + getCertificate() + ",");
        if (getCertificateSource() != null)
            sb.append("CertificateSource: " + getCertificateSource() + ",");
        if (getSSLSupportMethod() != null)
            sb.append("SSLSupportMethod: " + getSSLSupportMethod() + ",");
        if (getMinimumProtocolVersion() != null)
            sb.append("MinimumProtocolVersion: " + getMinimumProtocolVersion()
                    + ",");
        if (getIAMCertificateId() != null)
            sb.append("IAMCertificateId: " + getIAMCertificateId() + ",");
        if (getCloudFrontDefaultCertificate() != null)
            sb.append("CloudFrontDefaultCertificate: "
                    + getCloudFrontDefaultCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewerCertificate == false)
            return false;
        ViewerCertificate other = (ViewerCertificate) obj;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getCertificateSource() == null
                ^ this.getCertificateSource() == null)
            return false;
        if (other.getCertificateSource() != null
                && other.getCertificateSource().equals(
                        this.getCertificateSource()) == false)
            return false;
        if (other.getSSLSupportMethod() == null
                ^ this.getSSLSupportMethod() == null)
            return false;
        if (other.getSSLSupportMethod() != null
                && other.getSSLSupportMethod().equals(
                        this.getSSLSupportMethod()) == false)
            return false;
        if (other.getMinimumProtocolVersion() == null
                ^ this.getMinimumProtocolVersion() == null)
            return false;
        if (other.getMinimumProtocolVersion() != null
                && other.getMinimumProtocolVersion().equals(
                        this.getMinimumProtocolVersion()) == false)
            return false;
        if (other.getIAMCertificateId() == null
                ^ this.getIAMCertificateId() == null)
            return false;
        if (other.getIAMCertificateId() != null
                && other.getIAMCertificateId().equals(
                        this.getIAMCertificateId()) == false)
            return false;
        if (other.getCloudFrontDefaultCertificate() == null
                ^ this.getCloudFrontDefaultCertificate() == null)
            return false;
        if (other.getCloudFrontDefaultCertificate() != null
                && other.getCloudFrontDefaultCertificate().equals(
                        this.getCloudFrontDefaultCertificate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateSource() == null) ? 0
                        : getCertificateSource().hashCode());
        hashCode = prime
                * hashCode
                + ((getSSLSupportMethod() == null) ? 0 : getSSLSupportMethod()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumProtocolVersion() == null) ? 0
                        : getMinimumProtocolVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getIAMCertificateId() == null) ? 0 : getIAMCertificateId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudFrontDefaultCertificate() == null) ? 0
                        : getCloudFrontDefaultCertificate().hashCode());
        return hashCode;
    }

    @Override
    public ViewerCertificate clone() {
        try {
            return (ViewerCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}