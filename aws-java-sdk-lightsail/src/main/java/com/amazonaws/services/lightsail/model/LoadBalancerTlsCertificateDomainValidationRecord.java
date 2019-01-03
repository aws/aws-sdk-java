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
 * Describes the validation record of each domain name in the SSL/TLS certificate.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/LoadBalancerTlsCertificateDomainValidationRecord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerTlsCertificateDomainValidationRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A fully qualified domain name in the certificate. For example, <code>example.com</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of validation record. For example, <code>CNAME</code> for domain validation.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value for that type.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     */
    private String validationStatus;
    /**
     * <p>
     * The domain name against which your SSL/TLS certificate was validated.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * A fully qualified domain name in the certificate. For example, <code>example.com</code>.
     * </p>
     * 
     * @param name
     *        A fully qualified domain name in the certificate. For example, <code>example.com</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A fully qualified domain name in the certificate. For example, <code>example.com</code>.
     * </p>
     * 
     * @return A fully qualified domain name in the certificate. For example, <code>example.com</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A fully qualified domain name in the certificate. For example, <code>example.com</code>.
     * </p>
     * 
     * @param name
     *        A fully qualified domain name in the certificate. For example, <code>example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificateDomainValidationRecord withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of validation record. For example, <code>CNAME</code> for domain validation.
     * </p>
     * 
     * @param type
     *        The type of validation record. For example, <code>CNAME</code> for domain validation.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of validation record. For example, <code>CNAME</code> for domain validation.
     * </p>
     * 
     * @return The type of validation record. For example, <code>CNAME</code> for domain validation.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of validation record. For example, <code>CNAME</code> for domain validation.
     * </p>
     * 
     * @param type
     *        The type of validation record. For example, <code>CNAME</code> for domain validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificateDomainValidationRecord withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The value for that type.
     * </p>
     * 
     * @param value
     *        The value for that type.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for that type.
     * </p>
     * 
     * @return The value for that type.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for that type.
     * </p>
     * 
     * @param value
     *        The value for that type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificateDomainValidationRecord withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     * 
     * @param validationStatus
     *        The validation status. Valid values are listed below.
     * @see LoadBalancerTlsCertificateDomainStatus
     */

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     * 
     * @return The validation status. Valid values are listed below.
     * @see LoadBalancerTlsCertificateDomainStatus
     */

    public String getValidationStatus() {
        return this.validationStatus;
    }

    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     * 
     * @param validationStatus
     *        The validation status. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateDomainStatus
     */

    public LoadBalancerTlsCertificateDomainValidationRecord withValidationStatus(String validationStatus) {
        setValidationStatus(validationStatus);
        return this;
    }

    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     * 
     * @param validationStatus
     *        The validation status. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateDomainStatus
     */

    public LoadBalancerTlsCertificateDomainValidationRecord withValidationStatus(LoadBalancerTlsCertificateDomainStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The domain name against which your SSL/TLS certificate was validated.
     * </p>
     * 
     * @param domainName
     *        The domain name against which your SSL/TLS certificate was validated.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name against which your SSL/TLS certificate was validated.
     * </p>
     * 
     * @return The domain name against which your SSL/TLS certificate was validated.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name against which your SSL/TLS certificate was validated.
     * </p>
     * 
     * @param domainName
     *        The domain name against which your SSL/TLS certificate was validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificateDomainValidationRecord withDomainName(String domainName) {
        setDomainName(domainName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getValidationStatus() != null)
            sb.append("ValidationStatus: ").append(getValidationStatus()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerTlsCertificateDomainValidationRecord == false)
            return false;
        LoadBalancerTlsCertificateDomainValidationRecord other = (LoadBalancerTlsCertificateDomainValidationRecord) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getValidationStatus() == null ^ this.getValidationStatus() == null)
            return false;
        if (other.getValidationStatus() != null && other.getValidationStatus().equals(this.getValidationStatus()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getValidationStatus() == null) ? 0 : getValidationStatus().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerTlsCertificateDomainValidationRecord clone() {
        try {
            return (LoadBalancerTlsCertificateDomainValidationRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.LoadBalancerTlsCertificateDomainValidationRecordMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
