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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a custom domain that's associated with an AWS App Runner service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CustomDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomDomain implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An associated custom domain endpoint. It can be a root domain (for example, <code>example.com</code>), a
     * subdomain (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a wildcard
     * (for example, <code>*.example.com</code>).
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * When <code>true</code>, the subdomain <code>www.<i>DomainName</i> </code> is associated with the App Runner
     * service in addition to the base domain.
     * </p>
     */
    private Boolean enableWWWSubdomain;
    /**
     * <p>
     * A list of certificate CNAME records that's used for this domain name.
     * </p>
     */
    private java.util.List<CertificateValidationRecord> certificateValidationRecords;
    /**
     * <p>
     * The current state of the domain name association.
     * </p>
     */
    private String status;

    /**
     * <p>
     * An associated custom domain endpoint. It can be a root domain (for example, <code>example.com</code>), a
     * subdomain (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a wildcard
     * (for example, <code>*.example.com</code>).
     * </p>
     * 
     * @param domainName
     *        An associated custom domain endpoint. It can be a root domain (for example, <code>example.com</code>), a
     *        subdomain (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a
     *        wildcard (for example, <code>*.example.com</code>).
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * An associated custom domain endpoint. It can be a root domain (for example, <code>example.com</code>), a
     * subdomain (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a wildcard
     * (for example, <code>*.example.com</code>).
     * </p>
     * 
     * @return An associated custom domain endpoint. It can be a root domain (for example, <code>example.com</code>), a
     *         subdomain (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a
     *         wildcard (for example, <code>*.example.com</code>).
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * An associated custom domain endpoint. It can be a root domain (for example, <code>example.com</code>), a
     * subdomain (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a wildcard
     * (for example, <code>*.example.com</code>).
     * </p>
     * 
     * @param domainName
     *        An associated custom domain endpoint. It can be a root domain (for example, <code>example.com</code>), a
     *        subdomain (for example, <code>login.example.com</code> or <code>admin.login.example.com</code>), or a
     *        wildcard (for example, <code>*.example.com</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDomain withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the subdomain <code>www.<i>DomainName</i> </code> is associated with the App Runner
     * service in addition to the base domain.
     * </p>
     * 
     * @param enableWWWSubdomain
     *        When <code>true</code>, the subdomain <code>www.<i>DomainName</i> </code> is associated with the App
     *        Runner service in addition to the base domain.
     */

    public void setEnableWWWSubdomain(Boolean enableWWWSubdomain) {
        this.enableWWWSubdomain = enableWWWSubdomain;
    }

    /**
     * <p>
     * When <code>true</code>, the subdomain <code>www.<i>DomainName</i> </code> is associated with the App Runner
     * service in addition to the base domain.
     * </p>
     * 
     * @return When <code>true</code>, the subdomain <code>www.<i>DomainName</i> </code> is associated with the App
     *         Runner service in addition to the base domain.
     */

    public Boolean getEnableWWWSubdomain() {
        return this.enableWWWSubdomain;
    }

    /**
     * <p>
     * When <code>true</code>, the subdomain <code>www.<i>DomainName</i> </code> is associated with the App Runner
     * service in addition to the base domain.
     * </p>
     * 
     * @param enableWWWSubdomain
     *        When <code>true</code>, the subdomain <code>www.<i>DomainName</i> </code> is associated with the App
     *        Runner service in addition to the base domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDomain withEnableWWWSubdomain(Boolean enableWWWSubdomain) {
        setEnableWWWSubdomain(enableWWWSubdomain);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the subdomain <code>www.<i>DomainName</i> </code> is associated with the App Runner
     * service in addition to the base domain.
     * </p>
     * 
     * @return When <code>true</code>, the subdomain <code>www.<i>DomainName</i> </code> is associated with the App
     *         Runner service in addition to the base domain.
     */

    public Boolean isEnableWWWSubdomain() {
        return this.enableWWWSubdomain;
    }

    /**
     * <p>
     * A list of certificate CNAME records that's used for this domain name.
     * </p>
     * 
     * @return A list of certificate CNAME records that's used for this domain name.
     */

    public java.util.List<CertificateValidationRecord> getCertificateValidationRecords() {
        return certificateValidationRecords;
    }

    /**
     * <p>
     * A list of certificate CNAME records that's used for this domain name.
     * </p>
     * 
     * @param certificateValidationRecords
     *        A list of certificate CNAME records that's used for this domain name.
     */

    public void setCertificateValidationRecords(java.util.Collection<CertificateValidationRecord> certificateValidationRecords) {
        if (certificateValidationRecords == null) {
            this.certificateValidationRecords = null;
            return;
        }

        this.certificateValidationRecords = new java.util.ArrayList<CertificateValidationRecord>(certificateValidationRecords);
    }

    /**
     * <p>
     * A list of certificate CNAME records that's used for this domain name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateValidationRecords(java.util.Collection)} or
     * {@link #withCertificateValidationRecords(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param certificateValidationRecords
     *        A list of certificate CNAME records that's used for this domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDomain withCertificateValidationRecords(CertificateValidationRecord... certificateValidationRecords) {
        if (this.certificateValidationRecords == null) {
            setCertificateValidationRecords(new java.util.ArrayList<CertificateValidationRecord>(certificateValidationRecords.length));
        }
        for (CertificateValidationRecord ele : certificateValidationRecords) {
            this.certificateValidationRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of certificate CNAME records that's used for this domain name.
     * </p>
     * 
     * @param certificateValidationRecords
     *        A list of certificate CNAME records that's used for this domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDomain withCertificateValidationRecords(java.util.Collection<CertificateValidationRecord> certificateValidationRecords) {
        setCertificateValidationRecords(certificateValidationRecords);
        return this;
    }

    /**
     * <p>
     * The current state of the domain name association.
     * </p>
     * 
     * @param status
     *        The current state of the domain name association.
     * @see CustomDomainAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the domain name association.
     * </p>
     * 
     * @return The current state of the domain name association.
     * @see CustomDomainAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the domain name association.
     * </p>
     * 
     * @param status
     *        The current state of the domain name association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomDomainAssociationStatus
     */

    public CustomDomain withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the domain name association.
     * </p>
     * 
     * @param status
     *        The current state of the domain name association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomDomainAssociationStatus
     */

    public CustomDomain withStatus(CustomDomainAssociationStatus status) {
        this.status = status.toString();
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
        if (getEnableWWWSubdomain() != null)
            sb.append("EnableWWWSubdomain: ").append(getEnableWWWSubdomain()).append(",");
        if (getCertificateValidationRecords() != null)
            sb.append("CertificateValidationRecords: ").append(getCertificateValidationRecords()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomDomain == false)
            return false;
        CustomDomain other = (CustomDomain) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEnableWWWSubdomain() == null ^ this.getEnableWWWSubdomain() == null)
            return false;
        if (other.getEnableWWWSubdomain() != null && other.getEnableWWWSubdomain().equals(this.getEnableWWWSubdomain()) == false)
            return false;
        if (other.getCertificateValidationRecords() == null ^ this.getCertificateValidationRecords() == null)
            return false;
        if (other.getCertificateValidationRecords() != null && other.getCertificateValidationRecords().equals(this.getCertificateValidationRecords()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEnableWWWSubdomain() == null) ? 0 : getEnableWWWSubdomain().hashCode());
        hashCode = prime * hashCode + ((getCertificateValidationRecords() == null) ? 0 : getCertificateValidationRecords().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CustomDomain clone() {
        try {
            return (CustomDomain) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.CustomDomainMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
