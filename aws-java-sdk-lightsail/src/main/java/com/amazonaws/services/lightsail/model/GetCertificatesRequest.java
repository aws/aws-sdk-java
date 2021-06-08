/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCertificates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCertificatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the certificates for which to return information.
     * </p>
     * <p>
     * For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     * </p>
     * <p>
     * When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     * regardless of their current status.
     * </p>
     */
    private java.util.List<String> certificateStatuses;
    /**
     * <p>
     * Indicates whether to include detailed information about the certificates in the response.
     * </p>
     * <p>
     * When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain names, and
     * tags.
     * </p>
     */
    private Boolean includeCertificateDetails;
    /**
     * <p>
     * The name for the certificate for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your certificates in the AWS Region where the request is made.
     * </p>
     */
    private String certificateName;

    /**
     * <p>
     * The status of the certificates for which to return information.
     * </p>
     * <p>
     * For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     * </p>
     * <p>
     * When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     * regardless of their current status.
     * </p>
     * 
     * @return The status of the certificates for which to return information.</p>
     *         <p>
     *         For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     *         </p>
     *         <p>
     *         When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     *         regardless of their current status.
     * @see CertificateStatus
     */

    public java.util.List<String> getCertificateStatuses() {
        return certificateStatuses;
    }

    /**
     * <p>
     * The status of the certificates for which to return information.
     * </p>
     * <p>
     * For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     * </p>
     * <p>
     * When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     * regardless of their current status.
     * </p>
     * 
     * @param certificateStatuses
     *        The status of the certificates for which to return information.</p>
     *        <p>
     *        For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     *        </p>
     *        <p>
     *        When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     *        regardless of their current status.
     * @see CertificateStatus
     */

    public void setCertificateStatuses(java.util.Collection<String> certificateStatuses) {
        if (certificateStatuses == null) {
            this.certificateStatuses = null;
            return;
        }

        this.certificateStatuses = new java.util.ArrayList<String>(certificateStatuses);
    }

    /**
     * <p>
     * The status of the certificates for which to return information.
     * </p>
     * <p>
     * For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     * </p>
     * <p>
     * When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     * regardless of their current status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateStatuses(java.util.Collection)} or {@link #withCertificateStatuses(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param certificateStatuses
     *        The status of the certificates for which to return information.</p>
     *        <p>
     *        For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     *        </p>
     *        <p>
     *        When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     *        regardless of their current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public GetCertificatesRequest withCertificateStatuses(String... certificateStatuses) {
        if (this.certificateStatuses == null) {
            setCertificateStatuses(new java.util.ArrayList<String>(certificateStatuses.length));
        }
        for (String ele : certificateStatuses) {
            this.certificateStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the certificates for which to return information.
     * </p>
     * <p>
     * For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     * </p>
     * <p>
     * When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     * regardless of their current status.
     * </p>
     * 
     * @param certificateStatuses
     *        The status of the certificates for which to return information.</p>
     *        <p>
     *        For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     *        </p>
     *        <p>
     *        When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     *        regardless of their current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public GetCertificatesRequest withCertificateStatuses(java.util.Collection<String> certificateStatuses) {
        setCertificateStatuses(certificateStatuses);
        return this;
    }

    /**
     * <p>
     * The status of the certificates for which to return information.
     * </p>
     * <p>
     * For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     * </p>
     * <p>
     * When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     * regardless of their current status.
     * </p>
     * 
     * @param certificateStatuses
     *        The status of the certificates for which to return information.</p>
     *        <p>
     *        For example, specify <code>ISSUED</code> to return only certificates with an <code>ISSUED</code> status.
     *        </p>
     *        <p>
     *        When omitted, the response includes all of your certificates in the AWS Region where the request is made,
     *        regardless of their current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public GetCertificatesRequest withCertificateStatuses(CertificateStatus... certificateStatuses) {
        java.util.ArrayList<String> certificateStatusesCopy = new java.util.ArrayList<String>(certificateStatuses.length);
        for (CertificateStatus value : certificateStatuses) {
            certificateStatusesCopy.add(value.toString());
        }
        if (getCertificateStatuses() == null) {
            setCertificateStatuses(certificateStatusesCopy);
        } else {
            getCertificateStatuses().addAll(certificateStatusesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether to include detailed information about the certificates in the response.
     * </p>
     * <p>
     * When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain names, and
     * tags.
     * </p>
     * 
     * @param includeCertificateDetails
     *        Indicates whether to include detailed information about the certificates in the response.</p>
     *        <p>
     *        When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain
     *        names, and tags.
     */

    public void setIncludeCertificateDetails(Boolean includeCertificateDetails) {
        this.includeCertificateDetails = includeCertificateDetails;
    }

    /**
     * <p>
     * Indicates whether to include detailed information about the certificates in the response.
     * </p>
     * <p>
     * When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain names, and
     * tags.
     * </p>
     * 
     * @return Indicates whether to include detailed information about the certificates in the response.</p>
     *         <p>
     *         When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain
     *         names, and tags.
     */

    public Boolean getIncludeCertificateDetails() {
        return this.includeCertificateDetails;
    }

    /**
     * <p>
     * Indicates whether to include detailed information about the certificates in the response.
     * </p>
     * <p>
     * When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain names, and
     * tags.
     * </p>
     * 
     * @param includeCertificateDetails
     *        Indicates whether to include detailed information about the certificates in the response.</p>
     *        <p>
     *        When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain
     *        names, and tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificatesRequest withIncludeCertificateDetails(Boolean includeCertificateDetails) {
        setIncludeCertificateDetails(includeCertificateDetails);
        return this;
    }

    /**
     * <p>
     * Indicates whether to include detailed information about the certificates in the response.
     * </p>
     * <p>
     * When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain names, and
     * tags.
     * </p>
     * 
     * @return Indicates whether to include detailed information about the certificates in the response.</p>
     *         <p>
     *         When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain
     *         names, and tags.
     */

    public Boolean isIncludeCertificateDetails() {
        return this.includeCertificateDetails;
    }

    /**
     * <p>
     * The name for the certificate for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your certificates in the AWS Region where the request is made.
     * </p>
     * 
     * @param certificateName
     *        The name for the certificate for which to return information.</p>
     *        <p>
     *        When omitted, the response includes all of your certificates in the AWS Region where the request is made.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name for the certificate for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your certificates in the AWS Region where the request is made.
     * </p>
     * 
     * @return The name for the certificate for which to return information.</p>
     *         <p>
     *         When omitted, the response includes all of your certificates in the AWS Region where the request is made.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The name for the certificate for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your certificates in the AWS Region where the request is made.
     * </p>
     * 
     * @param certificateName
     *        The name for the certificate for which to return information.</p>
     *        <p>
     *        When omitted, the response includes all of your certificates in the AWS Region where the request is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificatesRequest withCertificateName(String certificateName) {
        setCertificateName(certificateName);
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
        if (getCertificateStatuses() != null)
            sb.append("CertificateStatuses: ").append(getCertificateStatuses()).append(",");
        if (getIncludeCertificateDetails() != null)
            sb.append("IncludeCertificateDetails: ").append(getIncludeCertificateDetails()).append(",");
        if (getCertificateName() != null)
            sb.append("CertificateName: ").append(getCertificateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCertificatesRequest == false)
            return false;
        GetCertificatesRequest other = (GetCertificatesRequest) obj;
        if (other.getCertificateStatuses() == null ^ this.getCertificateStatuses() == null)
            return false;
        if (other.getCertificateStatuses() != null && other.getCertificateStatuses().equals(this.getCertificateStatuses()) == false)
            return false;
        if (other.getIncludeCertificateDetails() == null ^ this.getIncludeCertificateDetails() == null)
            return false;
        if (other.getIncludeCertificateDetails() != null && other.getIncludeCertificateDetails().equals(this.getIncludeCertificateDetails()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateStatuses() == null) ? 0 : getCertificateStatuses().hashCode());
        hashCode = prime * hashCode + ((getIncludeCertificateDetails() == null) ? 0 : getIncludeCertificateDetails().hashCode());
        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        return hashCode;
    }

    @Override
    public GetCertificatesRequest clone() {
        return (GetCertificatesRequest) super.clone();
    }

}
