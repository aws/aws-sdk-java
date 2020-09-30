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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the AWS Certificate Manager managed renewal for an <code>AMAZON_ISSUED</code> certificate.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCertificateManagerCertificateRenewalSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCertificateManagerCertificateRenewalSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the validation of each domain name in the certificate, as it pertains to AWS Certificate
     * Manager managed renewal. Provided only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     */
    private java.util.List<AwsCertificateManagerCertificateDomainValidationOption> domainValidationOptions;
    /**
     * <p>
     * The status of the AWS Certificate Manager managed renewal of the certificate.
     * </p>
     * <p>
     * Valid values: <code>PENDING_AUTO_RENEWAL</code> | <code>PENDING_VALIDATION</code> | <code>SUCCESS</code> |
     * <code>FAILED</code>
     * </p>
     */
    private String renewalStatus;
    /**
     * <p>
     * The reason that a renewal request was unsuccessful.
     * </p>
     * <p>
     * Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     * <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> | <code>DOMAIN_VALIDATION_DENIED</code> |
     * <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> | <code>PCA_INVALID_ARN</code> |
     * <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> | <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> |
     * <code>PCA_RESOURCE_NOT_FOUND</code> | <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> |
     * <code>PCA_ACCESS_DENIED</code> | <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     * </p>
     */
    private String renewalStatusReason;
    /**
     * <p>
     * Indicates when the renewal summary was last updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String updatedAt;

    /**
     * <p>
     * Information about the validation of each domain name in the certificate, as it pertains to AWS Certificate
     * Manager managed renewal. Provided only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @return Information about the validation of each domain name in the certificate, as it pertains to AWS
     *         Certificate Manager managed renewal. Provided only when the certificate type is
     *         <code>AMAZON_ISSUED</code>.
     */

    public java.util.List<AwsCertificateManagerCertificateDomainValidationOption> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * <p>
     * Information about the validation of each domain name in the certificate, as it pertains to AWS Certificate
     * Manager managed renewal. Provided only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param domainValidationOptions
     *        Information about the validation of each domain name in the certificate, as it pertains to AWS Certificate
     *        Manager managed renewal. Provided only when the certificate type is <code>AMAZON_ISSUED</code>.
     */

    public void setDomainValidationOptions(java.util.Collection<AwsCertificateManagerCertificateDomainValidationOption> domainValidationOptions) {
        if (domainValidationOptions == null) {
            this.domainValidationOptions = null;
            return;
        }

        this.domainValidationOptions = new java.util.ArrayList<AwsCertificateManagerCertificateDomainValidationOption>(domainValidationOptions);
    }

    /**
     * <p>
     * Information about the validation of each domain name in the certificate, as it pertains to AWS Certificate
     * Manager managed renewal. Provided only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainValidationOptions(java.util.Collection)} or
     * {@link #withDomainValidationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainValidationOptions
     *        Information about the validation of each domain name in the certificate, as it pertains to AWS Certificate
     *        Manager managed renewal. Provided only when the certificate type is <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateRenewalSummary withDomainValidationOptions(
            AwsCertificateManagerCertificateDomainValidationOption... domainValidationOptions) {
        if (this.domainValidationOptions == null) {
            setDomainValidationOptions(new java.util.ArrayList<AwsCertificateManagerCertificateDomainValidationOption>(domainValidationOptions.length));
        }
        for (AwsCertificateManagerCertificateDomainValidationOption ele : domainValidationOptions) {
            this.domainValidationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the validation of each domain name in the certificate, as it pertains to AWS Certificate
     * Manager managed renewal. Provided only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param domainValidationOptions
     *        Information about the validation of each domain name in the certificate, as it pertains to AWS Certificate
     *        Manager managed renewal. Provided only when the certificate type is <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateRenewalSummary withDomainValidationOptions(
            java.util.Collection<AwsCertificateManagerCertificateDomainValidationOption> domainValidationOptions) {
        setDomainValidationOptions(domainValidationOptions);
        return this;
    }

    /**
     * <p>
     * The status of the AWS Certificate Manager managed renewal of the certificate.
     * </p>
     * <p>
     * Valid values: <code>PENDING_AUTO_RENEWAL</code> | <code>PENDING_VALIDATION</code> | <code>SUCCESS</code> |
     * <code>FAILED</code>
     * </p>
     * 
     * @param renewalStatus
     *        The status of the AWS Certificate Manager managed renewal of the certificate.</p>
     *        <p>
     *        Valid values: <code>PENDING_AUTO_RENEWAL</code> | <code>PENDING_VALIDATION</code> | <code>SUCCESS</code> |
     *        <code>FAILED</code>
     */

    public void setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
    }

    /**
     * <p>
     * The status of the AWS Certificate Manager managed renewal of the certificate.
     * </p>
     * <p>
     * Valid values: <code>PENDING_AUTO_RENEWAL</code> | <code>PENDING_VALIDATION</code> | <code>SUCCESS</code> |
     * <code>FAILED</code>
     * </p>
     * 
     * @return The status of the AWS Certificate Manager managed renewal of the certificate.</p>
     *         <p>
     *         Valid values: <code>PENDING_AUTO_RENEWAL</code> | <code>PENDING_VALIDATION</code> | <code>SUCCESS</code>
     *         | <code>FAILED</code>
     */

    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    /**
     * <p>
     * The status of the AWS Certificate Manager managed renewal of the certificate.
     * </p>
     * <p>
     * Valid values: <code>PENDING_AUTO_RENEWAL</code> | <code>PENDING_VALIDATION</code> | <code>SUCCESS</code> |
     * <code>FAILED</code>
     * </p>
     * 
     * @param renewalStatus
     *        The status of the AWS Certificate Manager managed renewal of the certificate.</p>
     *        <p>
     *        Valid values: <code>PENDING_AUTO_RENEWAL</code> | <code>PENDING_VALIDATION</code> | <code>SUCCESS</code> |
     *        <code>FAILED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateRenewalSummary withRenewalStatus(String renewalStatus) {
        setRenewalStatus(renewalStatus);
        return this;
    }

    /**
     * <p>
     * The reason that a renewal request was unsuccessful.
     * </p>
     * <p>
     * Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     * <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> | <code>DOMAIN_VALIDATION_DENIED</code> |
     * <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> | <code>PCA_INVALID_ARN</code> |
     * <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> | <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> |
     * <code>PCA_RESOURCE_NOT_FOUND</code> | <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> |
     * <code>PCA_ACCESS_DENIED</code> | <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     * </p>
     * 
     * @param renewalStatusReason
     *        The reason that a renewal request was unsuccessful.</p>
     *        <p>
     *        Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     *        <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> |
     *        <code>DOMAIN_VALIDATION_DENIED</code> | <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> |
     *        <code>PCA_INVALID_ARN</code> | <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> |
     *        <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> | <code>PCA_RESOURCE_NOT_FOUND</code> |
     *        <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> | <code>PCA_ACCESS_DENIED</code> |
     *        <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     */

    public void setRenewalStatusReason(String renewalStatusReason) {
        this.renewalStatusReason = renewalStatusReason;
    }

    /**
     * <p>
     * The reason that a renewal request was unsuccessful.
     * </p>
     * <p>
     * Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     * <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> | <code>DOMAIN_VALIDATION_DENIED</code> |
     * <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> | <code>PCA_INVALID_ARN</code> |
     * <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> | <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> |
     * <code>PCA_RESOURCE_NOT_FOUND</code> | <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> |
     * <code>PCA_ACCESS_DENIED</code> | <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     * </p>
     * 
     * @return The reason that a renewal request was unsuccessful.</p>
     *         <p>
     *         Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     *         <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> |
     *         <code>DOMAIN_VALIDATION_DENIED</code> | <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> |
     *         <code>PCA_INVALID_ARN</code> | <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> |
     *         <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> | <code>PCA_RESOURCE_NOT_FOUND</code> |
     *         <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> | <code>PCA_ACCESS_DENIED</code> |
     *         <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     */

    public String getRenewalStatusReason() {
        return this.renewalStatusReason;
    }

    /**
     * <p>
     * The reason that a renewal request was unsuccessful.
     * </p>
     * <p>
     * Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     * <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> | <code>DOMAIN_VALIDATION_DENIED</code> |
     * <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> | <code>PCA_INVALID_ARN</code> |
     * <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> | <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> |
     * <code>PCA_RESOURCE_NOT_FOUND</code> | <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> |
     * <code>PCA_ACCESS_DENIED</code> | <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     * </p>
     * 
     * @param renewalStatusReason
     *        The reason that a renewal request was unsuccessful.</p>
     *        <p>
     *        Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     *        <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> |
     *        <code>DOMAIN_VALIDATION_DENIED</code> | <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> |
     *        <code>PCA_INVALID_ARN</code> | <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> |
     *        <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> | <code>PCA_RESOURCE_NOT_FOUND</code> |
     *        <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> | <code>PCA_ACCESS_DENIED</code> |
     *        <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateRenewalSummary withRenewalStatusReason(String renewalStatusReason) {
        setRenewalStatusReason(renewalStatusReason);
        return this;
    }

    /**
     * <p>
     * Indicates when the renewal summary was last updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param updatedAt
     *        Indicates when the renewal summary was last updated.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * Indicates when the renewal summary was last updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the renewal summary was last updated.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * Indicates when the renewal summary was last updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param updatedAt
     *        Indicates when the renewal summary was last updated.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateRenewalSummary withUpdatedAt(String updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getDomainValidationOptions() != null)
            sb.append("DomainValidationOptions: ").append(getDomainValidationOptions()).append(",");
        if (getRenewalStatus() != null)
            sb.append("RenewalStatus: ").append(getRenewalStatus()).append(",");
        if (getRenewalStatusReason() != null)
            sb.append("RenewalStatusReason: ").append(getRenewalStatusReason()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCertificateManagerCertificateRenewalSummary == false)
            return false;
        AwsCertificateManagerCertificateRenewalSummary other = (AwsCertificateManagerCertificateRenewalSummary) obj;
        if (other.getDomainValidationOptions() == null ^ this.getDomainValidationOptions() == null)
            return false;
        if (other.getDomainValidationOptions() != null && other.getDomainValidationOptions().equals(this.getDomainValidationOptions()) == false)
            return false;
        if (other.getRenewalStatus() == null ^ this.getRenewalStatus() == null)
            return false;
        if (other.getRenewalStatus() != null && other.getRenewalStatus().equals(this.getRenewalStatus()) == false)
            return false;
        if (other.getRenewalStatusReason() == null ^ this.getRenewalStatusReason() == null)
            return false;
        if (other.getRenewalStatusReason() != null && other.getRenewalStatusReason().equals(this.getRenewalStatusReason()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainValidationOptions() == null) ? 0 : getDomainValidationOptions().hashCode());
        hashCode = prime * hashCode + ((getRenewalStatus() == null) ? 0 : getRenewalStatus().hashCode());
        hashCode = prime * hashCode + ((getRenewalStatusReason() == null) ? 0 : getRenewalStatusReason().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AwsCertificateManagerCertificateRenewalSummary clone() {
        try {
            return (AwsCertificateManagerCertificateRenewalSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCertificateManagerCertificateRenewalSummaryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
