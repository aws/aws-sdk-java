/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about the validation of each domain name in the certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DomainValidation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainValidation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate. For example, <code>www.example.com</code> or
     * <code>example.com</code>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A list of email addresses that ACM used to send domain validation emails.
     * </p>
     */
    private java.util.List<String> validationEmails;
    /**
     * <p>
     * The domain name that ACM used to send domain validation emails.
     * </p>
     */
    private String validationDomain;
    /**
     * <p>
     * The validation status of the domain name.
     * </p>
     */
    private String validationStatus;

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate. For example, <code>www.example.com</code> or
     * <code>example.com</code>.
     * </p>
     * 
     * @param domainName
     *        A fully qualified domain name (FQDN) in the certificate. For example, <code>www.example.com</code> or
     *        <code>example.com</code>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate. For example, <code>www.example.com</code> or
     * <code>example.com</code>.
     * </p>
     * 
     * @return A fully qualified domain name (FQDN) in the certificate. For example, <code>www.example.com</code> or
     *         <code>example.com</code>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * A fully qualified domain name (FQDN) in the certificate. For example, <code>www.example.com</code> or
     * <code>example.com</code>.
     * </p>
     * 
     * @param domainName
     *        A fully qualified domain name (FQDN) in the certificate. For example, <code>www.example.com</code> or
     *        <code>example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidation withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A list of email addresses that ACM used to send domain validation emails.
     * </p>
     * 
     * @return A list of email addresses that ACM used to send domain validation emails.
     */

    public java.util.List<String> getValidationEmails() {
        return validationEmails;
    }

    /**
     * <p>
     * A list of email addresses that ACM used to send domain validation emails.
     * </p>
     * 
     * @param validationEmails
     *        A list of email addresses that ACM used to send domain validation emails.
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
     * A list of email addresses that ACM used to send domain validation emails.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationEmails(java.util.Collection)} or {@link #withValidationEmails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param validationEmails
     *        A list of email addresses that ACM used to send domain validation emails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidation withValidationEmails(String... validationEmails) {
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
     * A list of email addresses that ACM used to send domain validation emails.
     * </p>
     * 
     * @param validationEmails
     *        A list of email addresses that ACM used to send domain validation emails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidation withValidationEmails(java.util.Collection<String> validationEmails) {
        setValidationEmails(validationEmails);
        return this;
    }

    /**
     * <p>
     * The domain name that ACM used to send domain validation emails.
     * </p>
     * 
     * @param validationDomain
     *        The domain name that ACM used to send domain validation emails.
     */

    public void setValidationDomain(String validationDomain) {
        this.validationDomain = validationDomain;
    }

    /**
     * <p>
     * The domain name that ACM used to send domain validation emails.
     * </p>
     * 
     * @return The domain name that ACM used to send domain validation emails.
     */

    public String getValidationDomain() {
        return this.validationDomain;
    }

    /**
     * <p>
     * The domain name that ACM used to send domain validation emails.
     * </p>
     * 
     * @param validationDomain
     *        The domain name that ACM used to send domain validation emails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidation withValidationDomain(String validationDomain) {
        setValidationDomain(validationDomain);
        return this;
    }

    /**
     * <p>
     * The validation status of the domain name.
     * </p>
     * 
     * @param validationStatus
     *        The validation status of the domain name.
     * @see DomainStatus
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
     * @see DomainStatus
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
     * @see DomainStatus
     */

    public DomainValidation withValidationStatus(String validationStatus) {
        setValidationStatus(validationStatus);
        return this;
    }

    /**
     * <p>
     * The validation status of the domain name.
     * </p>
     * 
     * @param validationStatus
     *        The validation status of the domain name.
     * @see DomainStatus
     */

    public void setValidationStatus(DomainStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
    }

    /**
     * <p>
     * The validation status of the domain name.
     * </p>
     * 
     * @param validationStatus
     *        The validation status of the domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainValidation withValidationStatus(DomainStatus validationStatus) {
        setValidationStatus(validationStatus);
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
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getValidationEmails() != null)
            sb.append("ValidationEmails: ").append(getValidationEmails()).append(",");
        if (getValidationDomain() != null)
            sb.append("ValidationDomain: ").append(getValidationDomain()).append(",");
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

        if (obj instanceof DomainValidation == false)
            return false;
        DomainValidation other = (DomainValidation) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getValidationEmails() == null ^ this.getValidationEmails() == null)
            return false;
        if (other.getValidationEmails() != null && other.getValidationEmails().equals(this.getValidationEmails()) == false)
            return false;
        if (other.getValidationDomain() == null ^ this.getValidationDomain() == null)
            return false;
        if (other.getValidationDomain() != null && other.getValidationDomain().equals(this.getValidationDomain()) == false)
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
        hashCode = prime * hashCode + ((getValidationEmails() == null) ? 0 : getValidationEmails().hashCode());
        hashCode = prime * hashCode + ((getValidationDomain() == null) ? 0 : getValidationDomain().hashCode());
        hashCode = prime * hashCode + ((getValidationStatus() == null) ? 0 : getValidationStatus().hashCode());
        return hashCode;
    }

    @Override
    public DomainValidation clone() {
        try {
            return (DomainValidation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.certificatemanager.model.transform.DomainValidationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
