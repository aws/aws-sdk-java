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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the status of ACM's <a
 * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for the certificate. This
 * structure exists only when the certificate type is <code>AMAZON_ISSUED</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RenewalSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenewalSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> of the certificate.
     * </p>
     */
    private String renewalStatus;
    /**
     * <p>
     * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a>. This is different
     * from the initial validation that occurs as a result of the <a>RequestCertificate</a> request. This field exists
     * only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     */
    private java.util.List<DomainValidation> domainValidationOptions;

    /**
     * <p>
     * The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> of the certificate.
     * </p>
     * 
     * @param renewalStatus
     *        The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> of the certificate.
     * @see RenewalStatus
     */

    public void setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
    }

    /**
     * <p>
     * The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> of the certificate.
     * </p>
     * 
     * @return The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *         renewal</a> of the certificate.
     * @see RenewalStatus
     */

    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    /**
     * <p>
     * The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> of the certificate.
     * </p>
     * 
     * @param renewalStatus
     *        The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenewalStatus
     */

    public RenewalSummary withRenewalStatus(String renewalStatus) {
        setRenewalStatus(renewalStatus);
        return this;
    }

    /**
     * <p>
     * The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> of the certificate.
     * </p>
     * 
     * @param renewalStatus
     *        The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> of the certificate.
     * @see RenewalStatus
     */

    public void setRenewalStatus(RenewalStatus renewalStatus) {
        withRenewalStatus(renewalStatus);
    }

    /**
     * <p>
     * The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> of the certificate.
     * </p>
     * 
     * @param renewalStatus
     *        The status of ACM's <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenewalStatus
     */

    public RenewalSummary withRenewalStatus(RenewalStatus renewalStatus) {
        this.renewalStatus = renewalStatus.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a>. This is different
     * from the initial validation that occurs as a result of the <a>RequestCertificate</a> request. This field exists
     * only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @return Contains information about the validation of each domain name in the certificate, as it pertains to ACM's
     *         <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a>. This is
     *         different from the initial validation that occurs as a result of the <a>RequestCertificate</a> request.
     *         This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     */

    public java.util.List<DomainValidation> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a>. This is different
     * from the initial validation that occurs as a result of the <a>RequestCertificate</a> request. This field exists
     * only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the validation of each domain name in the certificate, as it pertains to ACM's
     *        <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a>. This is
     *        different from the initial validation that occurs as a result of the <a>RequestCertificate</a> request.
     *        This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     */

    public void setDomainValidationOptions(java.util.Collection<DomainValidation> domainValidationOptions) {
        if (domainValidationOptions == null) {
            this.domainValidationOptions = null;
            return;
        }

        this.domainValidationOptions = new java.util.ArrayList<DomainValidation>(domainValidationOptions);
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a>. This is different
     * from the initial validation that occurs as a result of the <a>RequestCertificate</a> request. This field exists
     * only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainValidationOptions(java.util.Collection)} or
     * {@link #withDomainValidationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the validation of each domain name in the certificate, as it pertains to ACM's
     *        <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a>. This is
     *        different from the initial validation that occurs as a result of the <a>RequestCertificate</a> request.
     *        This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewalSummary withDomainValidationOptions(DomainValidation... domainValidationOptions) {
        if (this.domainValidationOptions == null) {
            setDomainValidationOptions(new java.util.ArrayList<DomainValidation>(domainValidationOptions.length));
        }
        for (DomainValidation ele : domainValidationOptions) {
            this.domainValidationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a>. This is different
     * from the initial validation that occurs as a result of the <a>RequestCertificate</a> request. This field exists
     * only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the validation of each domain name in the certificate, as it pertains to ACM's
     *        <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a>. This is
     *        different from the initial validation that occurs as a result of the <a>RequestCertificate</a> request.
     *        This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewalSummary withDomainValidationOptions(java.util.Collection<DomainValidation> domainValidationOptions) {
        setDomainValidationOptions(domainValidationOptions);
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
        if (getRenewalStatus() != null)
            sb.append("RenewalStatus: ").append(getRenewalStatus()).append(",");
        if (getDomainValidationOptions() != null)
            sb.append("DomainValidationOptions: ").append(getDomainValidationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenewalSummary == false)
            return false;
        RenewalSummary other = (RenewalSummary) obj;
        if (other.getRenewalStatus() == null ^ this.getRenewalStatus() == null)
            return false;
        if (other.getRenewalStatus() != null && other.getRenewalStatus().equals(this.getRenewalStatus()) == false)
            return false;
        if (other.getDomainValidationOptions() == null ^ this.getDomainValidationOptions() == null)
            return false;
        if (other.getDomainValidationOptions() != null && other.getDomainValidationOptions().equals(this.getDomainValidationOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRenewalStatus() == null) ? 0 : getRenewalStatus().hashCode());
        hashCode = prime * hashCode + ((getDomainValidationOptions() == null) ? 0 : getDomainValidationOptions().hashCode());
        return hashCode;
    }

    @Override
    public RenewalSummary clone() {
        try {
            return (RenewalSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.certificatemanager.model.transform.RenewalSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
