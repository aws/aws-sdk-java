/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Structure that contains the domain name, the base validation domain to which validation email is sent, and the email
 * addresses used to validate the domain identity.
 * </p>
 */
public class DomainValidation implements Serializable, Cloneable {

    /**
     * <p>
     * Fully Qualified Domain Name (FQDN) of the form <code>www.example.com or </code> <code>example.com</code>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A list of contact address for the domain registrant.
     * </p>
     */
    private java.util.List<String> validationEmails;
    /**
     * <p>
     * The base validation domain that acts as the suffix of the email addresses that are used to send the emails.
     * </p>
     */
    private String validationDomain;

    /**
     * <p>
     * Fully Qualified Domain Name (FQDN) of the form <code>www.example.com or </code> <code>example.com</code>.
     * </p>
     * 
     * @param domainName
     *        Fully Qualified Domain Name (FQDN) of the form <code>www.example.com or </code> <code>example.com</code>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Fully Qualified Domain Name (FQDN) of the form <code>www.example.com or </code> <code>example.com</code>.
     * </p>
     * 
     * @return Fully Qualified Domain Name (FQDN) of the form <code>www.example.com or </code> <code>example.com</code>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Fully Qualified Domain Name (FQDN) of the form <code>www.example.com or </code> <code>example.com</code>.
     * </p>
     * 
     * @param domainName
     *        Fully Qualified Domain Name (FQDN) of the form <code>www.example.com or </code> <code>example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidation withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A list of contact address for the domain registrant.
     * </p>
     * 
     * @return A list of contact address for the domain registrant.
     */

    public java.util.List<String> getValidationEmails() {
        return validationEmails;
    }

    /**
     * <p>
     * A list of contact address for the domain registrant.
     * </p>
     * 
     * @param validationEmails
     *        A list of contact address for the domain registrant.
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
     * A list of contact address for the domain registrant.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationEmails(java.util.Collection)} or {@link #withValidationEmails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param validationEmails
     *        A list of contact address for the domain registrant.
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
     * A list of contact address for the domain registrant.
     * </p>
     * 
     * @param validationEmails
     *        A list of contact address for the domain registrant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidation withValidationEmails(java.util.Collection<String> validationEmails) {
        setValidationEmails(validationEmails);
        return this;
    }

    /**
     * <p>
     * The base validation domain that acts as the suffix of the email addresses that are used to send the emails.
     * </p>
     * 
     * @param validationDomain
     *        The base validation domain that acts as the suffix of the email addresses that are used to send the
     *        emails.
     */

    public void setValidationDomain(String validationDomain) {
        this.validationDomain = validationDomain;
    }

    /**
     * <p>
     * The base validation domain that acts as the suffix of the email addresses that are used to send the emails.
     * </p>
     * 
     * @return The base validation domain that acts as the suffix of the email addresses that are used to send the
     *         emails.
     */

    public String getValidationDomain() {
        return this.validationDomain;
    }

    /**
     * <p>
     * The base validation domain that acts as the suffix of the email addresses that are used to send the emails.
     * </p>
     * 
     * @param validationDomain
     *        The base validation domain that acts as the suffix of the email addresses that are used to send the
     *        emails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidation withValidationDomain(String validationDomain) {
        setValidationDomain(validationDomain);
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
            sb.append("DomainName: " + getDomainName() + ",");
        if (getValidationEmails() != null)
            sb.append("ValidationEmails: " + getValidationEmails() + ",");
        if (getValidationDomain() != null)
            sb.append("ValidationDomain: " + getValidationDomain());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getValidationEmails() == null) ? 0 : getValidationEmails().hashCode());
        hashCode = prime * hashCode + ((getValidationDomain() == null) ? 0 : getValidationDomain().hashCode());
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
}
