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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The initial validation of each domain name that occurs as a result of the <code>RequestCertificate</code> request
 * </p>
 * </li>
 * <li>
 * <p>
 * The validation of each domain name in the certificate, as it pertains to AWS Certificate Manager managed renewal
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCertificateManagerCertificateDomainValidationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCertificateManagerCertificateDomainValidationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The CNAME record that is added to the DNS database for domain validation.
     * </p>
     */
    private AwsCertificateManagerCertificateResourceRecord resourceRecord;
    /**
     * <p>
     * The domain name that AWS Certificate Manager uses to send domain validation emails.
     * </p>
     */
    private String validationDomain;
    /**
     * <p>
     * A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
     * </p>
     */
    private java.util.List<String> validationEmails;
    /**
     * <p>
     * The method used to validate the domain name.
     * </p>
     */
    private String validationMethod;
    /**
     * <p>
     * The validation status of the domain name.
     * </p>
     */
    private String validationStatus;

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate.
     * </p>
     * 
     * @param domainName
     *        A fully qualified domain name (FQDN) in the certificate.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate.
     * </p>
     * 
     * @return A fully qualified domain name (FQDN) in the certificate.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate.
     * </p>
     * 
     * @param domainName
     *        A fully qualified domain name (FQDN) in the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDomainValidationOption withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The CNAME record that is added to the DNS database for domain validation.
     * </p>
     * 
     * @param resourceRecord
     *        The CNAME record that is added to the DNS database for domain validation.
     */

    public void setResourceRecord(AwsCertificateManagerCertificateResourceRecord resourceRecord) {
        this.resourceRecord = resourceRecord;
    }

    /**
     * <p>
     * The CNAME record that is added to the DNS database for domain validation.
     * </p>
     * 
     * @return The CNAME record that is added to the DNS database for domain validation.
     */

    public AwsCertificateManagerCertificateResourceRecord getResourceRecord() {
        return this.resourceRecord;
    }

    /**
     * <p>
     * The CNAME record that is added to the DNS database for domain validation.
     * </p>
     * 
     * @param resourceRecord
     *        The CNAME record that is added to the DNS database for domain validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDomainValidationOption withResourceRecord(AwsCertificateManagerCertificateResourceRecord resourceRecord) {
        setResourceRecord(resourceRecord);
        return this;
    }

    /**
     * <p>
     * The domain name that AWS Certificate Manager uses to send domain validation emails.
     * </p>
     * 
     * @param validationDomain
     *        The domain name that AWS Certificate Manager uses to send domain validation emails.
     */

    public void setValidationDomain(String validationDomain) {
        this.validationDomain = validationDomain;
    }

    /**
     * <p>
     * The domain name that AWS Certificate Manager uses to send domain validation emails.
     * </p>
     * 
     * @return The domain name that AWS Certificate Manager uses to send domain validation emails.
     */

    public String getValidationDomain() {
        return this.validationDomain;
    }

    /**
     * <p>
     * The domain name that AWS Certificate Manager uses to send domain validation emails.
     * </p>
     * 
     * @param validationDomain
     *        The domain name that AWS Certificate Manager uses to send domain validation emails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDomainValidationOption withValidationDomain(String validationDomain) {
        setValidationDomain(validationDomain);
        return this;
    }

    /**
     * <p>
     * A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
     * </p>
     * 
     * @return A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
     */

    public java.util.List<String> getValidationEmails() {
        return validationEmails;
    }

    /**
     * <p>
     * A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
     * </p>
     * 
     * @param validationEmails
     *        A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
     */

    public void setValidationEmails(java.util.Collection<String> validationEmails) {
        if (validationEmails == null) {
            this.validationEmails = null;
            return;
        }

        this.validationEmails = new java.util.ArrayList<String>(validationEmails);
    }

    /**
     * <p>
     * A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationEmails(java.util.Collection)} or {@link #withValidationEmails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param validationEmails
     *        A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDomainValidationOption withValidationEmails(String... validationEmails) {
        if (this.validationEmails == null) {
            setValidationEmails(new java.util.ArrayList<String>(validationEmails.length));
        }
        for (String ele : validationEmails) {
            this.validationEmails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
     * </p>
     * 
     * @param validationEmails
     *        A list of email addresses that AWS Certificate Manager uses to send domain validation emails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDomainValidationOption withValidationEmails(java.util.Collection<String> validationEmails) {
        setValidationEmails(validationEmails);
        return this;
    }

    /**
     * <p>
     * The method used to validate the domain name.
     * </p>
     * 
     * @param validationMethod
     *        The method used to validate the domain name.
     */

    public void setValidationMethod(String validationMethod) {
        this.validationMethod = validationMethod;
    }

    /**
     * <p>
     * The method used to validate the domain name.
     * </p>
     * 
     * @return The method used to validate the domain name.
     */

    public String getValidationMethod() {
        return this.validationMethod;
    }

    /**
     * <p>
     * The method used to validate the domain name.
     * </p>
     * 
     * @param validationMethod
     *        The method used to validate the domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDomainValidationOption withValidationMethod(String validationMethod) {
        setValidationMethod(validationMethod);
        return this;
    }

    /**
     * <p>
     * The validation status of the domain name.
     * </p>
     * 
     * @param validationStatus
     *        The validation status of the domain name.
     */

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * <p>
     * The validation status of the domain name.
     * </p>
     * 
     * @return The validation status of the domain name.
     */

    public String getValidationStatus() {
        return this.validationStatus;
    }

    /**
     * <p>
     * The validation status of the domain name.
     * </p>
     * 
     * @param validationStatus
     *        The validation status of the domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDomainValidationOption withValidationStatus(String validationStatus) {
        setValidationStatus(validationStatus);
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
        if (getResourceRecord() != null)
            sb.append("ResourceRecord: ").append(getResourceRecord()).append(",");
        if (getValidationDomain() != null)
            sb.append("ValidationDomain: ").append(getValidationDomain()).append(",");
        if (getValidationEmails() != null)
            sb.append("ValidationEmails: ").append(getValidationEmails()).append(",");
        if (getValidationMethod() != null)
            sb.append("ValidationMethod: ").append(getValidationMethod()).append(",");
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

        if (obj instanceof AwsCertificateManagerCertificateDomainValidationOption == false)
            return false;
        AwsCertificateManagerCertificateDomainValidationOption other = (AwsCertificateManagerCertificateDomainValidationOption) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getResourceRecord() == null ^ this.getResourceRecord() == null)
            return false;
        if (other.getResourceRecord() != null && other.getResourceRecord().equals(this.getResourceRecord()) == false)
            return false;
        if (other.getValidationDomain() == null ^ this.getValidationDomain() == null)
            return false;
        if (other.getValidationDomain() != null && other.getValidationDomain().equals(this.getValidationDomain()) == false)
            return false;
        if (other.getValidationEmails() == null ^ this.getValidationEmails() == null)
            return false;
        if (other.getValidationEmails() != null && other.getValidationEmails().equals(this.getValidationEmails()) == false)
            return false;
        if (other.getValidationMethod() == null ^ this.getValidationMethod() == null)
            return false;
        if (other.getValidationMethod() != null && other.getValidationMethod().equals(this.getValidationMethod()) == false)
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
        hashCode = prime * hashCode + ((getResourceRecord() == null) ? 0 : getResourceRecord().hashCode());
        hashCode = prime * hashCode + ((getValidationDomain() == null) ? 0 : getValidationDomain().hashCode());
        hashCode = prime * hashCode + ((getValidationEmails() == null) ? 0 : getValidationEmails().hashCode());
        hashCode = prime * hashCode + ((getValidationMethod() == null) ? 0 : getValidationMethod().hashCode());
        hashCode = prime * hashCode + ((getValidationStatus() == null) ? 0 : getValidationStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsCertificateManagerCertificateDomainValidationOption clone() {
        try {
            return (AwsCertificateManagerCertificateDomainValidationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCertificateManagerCertificateDomainValidationOptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
