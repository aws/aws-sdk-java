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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the status of Lightsail's managed renewal for the certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/LoadBalancerTlsCertificateRenewalSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerTlsCertificateRenewalSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
     * </p>
     */
    private String renewalStatus;
    /**
     * <p>
     * Contains information about the validation of each domain name in the certificate, as it pertains to Lightsail's
     * managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate
     * request.
     * </p>
     */
    private java.util.List<LoadBalancerTlsCertificateDomainValidationOption> domainValidationOptions;

    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
     * </p>
     * 
     * @param renewalStatus
     *        The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
     * @see LoadBalancerTlsCertificateRenewalStatus
     */

    public void setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
    }

    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
     * </p>
     * 
     * @return The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
     * @see LoadBalancerTlsCertificateRenewalStatus
     */

    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
     * </p>
     * 
     * @param renewalStatus
     *        The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateRenewalStatus
     */

    public LoadBalancerTlsCertificateRenewalSummary withRenewalStatus(String renewalStatus) {
        setRenewalStatus(renewalStatus);
        return this;
    }

    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
     * </p>
     * 
     * @param renewalStatus
     *        The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateRenewalStatus
     */

    public LoadBalancerTlsCertificateRenewalSummary withRenewalStatus(LoadBalancerTlsCertificateRenewalStatus renewalStatus) {
        this.renewalStatus = renewalStatus.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the certificate, as it pertains to Lightsail's
     * managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate
     * request.
     * </p>
     * 
     * @return Contains information about the validation of each domain name in the certificate, as it pertains to
     *         Lightsail's managed renewal. This is different from the initial validation that occurs as a result of the
     *         RequestCertificate request.
     */

    public java.util.List<LoadBalancerTlsCertificateDomainValidationOption> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the certificate, as it pertains to Lightsail's
     * managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate
     * request.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the validation of each domain name in the certificate, as it pertains to
     *        Lightsail's managed renewal. This is different from the initial validation that occurs as a result of the
     *        RequestCertificate request.
     */

    public void setDomainValidationOptions(java.util.Collection<LoadBalancerTlsCertificateDomainValidationOption> domainValidationOptions) {
        if (domainValidationOptions == null) {
            this.domainValidationOptions = null;
            return;
        }

        this.domainValidationOptions = new java.util.ArrayList<LoadBalancerTlsCertificateDomainValidationOption>(domainValidationOptions);
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the certificate, as it pertains to Lightsail's
     * managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate
     * request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainValidationOptions(java.util.Collection)} or
     * {@link #withDomainValidationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the validation of each domain name in the certificate, as it pertains to
     *        Lightsail's managed renewal. This is different from the initial validation that occurs as a result of the
     *        RequestCertificate request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificateRenewalSummary withDomainValidationOptions(LoadBalancerTlsCertificateDomainValidationOption... domainValidationOptions) {
        if (this.domainValidationOptions == null) {
            setDomainValidationOptions(new java.util.ArrayList<LoadBalancerTlsCertificateDomainValidationOption>(domainValidationOptions.length));
        }
        for (LoadBalancerTlsCertificateDomainValidationOption ele : domainValidationOptions) {
            this.domainValidationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the certificate, as it pertains to Lightsail's
     * managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate
     * request.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the validation of each domain name in the certificate, as it pertains to
     *        Lightsail's managed renewal. This is different from the initial validation that occurs as a result of the
     *        RequestCertificate request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificateRenewalSummary withDomainValidationOptions(
            java.util.Collection<LoadBalancerTlsCertificateDomainValidationOption> domainValidationOptions) {
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

        if (obj instanceof LoadBalancerTlsCertificateRenewalSummary == false)
            return false;
        LoadBalancerTlsCertificateRenewalSummary other = (LoadBalancerTlsCertificateRenewalSummary) obj;
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
    public LoadBalancerTlsCertificateRenewalSummary clone() {
        try {
            return (LoadBalancerTlsCertificateRenewalSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.LoadBalancerTlsCertificateRenewalSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
