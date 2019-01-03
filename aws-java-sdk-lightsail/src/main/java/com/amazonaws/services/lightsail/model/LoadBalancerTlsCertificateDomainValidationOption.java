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
 * Contains information about the domain names on an SSL/TLS certificate that you will use to validate domain ownership.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/LoadBalancerTlsCertificateDomainValidationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerTlsCertificateDomainValidationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified domain name in the certificate request.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     */
    private String validationStatus;

    /**
     * <p>
     * The fully qualified domain name in the certificate request.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name in the certificate request.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name in the certificate request.
     * </p>
     * 
     * @return The fully qualified domain name in the certificate request.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The fully qualified domain name in the certificate request.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name in the certificate request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificateDomainValidationOption withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     * 
     * @param validationStatus
     *        The status of the domain validation. Valid values are listed below.
     * @see LoadBalancerTlsCertificateDomainStatus
     */

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     * 
     * @return The status of the domain validation. Valid values are listed below.
     * @see LoadBalancerTlsCertificateDomainStatus
     */

    public String getValidationStatus() {
        return this.validationStatus;
    }

    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     * 
     * @param validationStatus
     *        The status of the domain validation. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateDomainStatus
     */

    public LoadBalancerTlsCertificateDomainValidationOption withValidationStatus(String validationStatus) {
        setValidationStatus(validationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     * 
     * @param validationStatus
     *        The status of the domain validation. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateDomainStatus
     */

    public LoadBalancerTlsCertificateDomainValidationOption withValidationStatus(LoadBalancerTlsCertificateDomainStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getValidationStatus() != null)
            sb.append("ValidationStatus: ").append(getValidationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerTlsCertificateDomainValidationOption == false)
            return false;
        LoadBalancerTlsCertificateDomainValidationOption other = (LoadBalancerTlsCertificateDomainValidationOption) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getValidationStatus() == null ^ this.getValidationStatus() == null)
            return false;
        if (other.getValidationStatus() != null && other.getValidationStatus().equals(this.getValidationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getValidationStatus() == null) ? 0 : getValidationStatus().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerTlsCertificateDomainValidationOption clone() {
        try {
            return (LoadBalancerTlsCertificateDomainValidationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.LoadBalancerTlsCertificateDomainValidationOptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
