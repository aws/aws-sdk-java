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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The UpdateDomainContact request includes the following elements.
 * </p>
 */
public class UpdateDomainContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private ContactDetail adminContact;
    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private ContactDetail registrantContact;
    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private ContactDetail techContact;

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Internationalized Domain Names are not supported.
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The name of a domain.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and
     *         hyphen (-). Internationalized Domain Names are not supported.
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Internationalized Domain Names are not supported.
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainContactRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param adminContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Provides detailed contact information.</p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>,
     *         <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>, <code>CountryCode</code>,
     *         <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public ContactDetail getAdminContact() {
        return this.adminContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param adminContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainContactRequest withAdminContact(ContactDetail adminContact) {
        setAdminContact(adminContact);
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param registrantContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Provides detailed contact information.</p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>,
     *         <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>, <code>CountryCode</code>,
     *         <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public ContactDetail getRegistrantContact() {
        return this.registrantContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param registrantContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainContactRequest withRegistrantContact(ContactDetail registrantContact) {
        setRegistrantContact(registrantContact);
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param techContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setTechContact(ContactDetail techContact) {
        this.techContact = techContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Provides detailed contact information.</p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>,
     *         <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>, <code>CountryCode</code>,
     *         <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public ContactDetail getTechContact() {
        return this.techContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     * <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>,
     * <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param techContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainContactRequest withTechContact(ContactDetail techContact) {
        setTechContact(techContact);
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
        if (getAdminContact() != null)
            sb.append("AdminContact: " + getAdminContact() + ",");
        if (getRegistrantContact() != null)
            sb.append("RegistrantContact: " + getRegistrantContact() + ",");
        if (getTechContact() != null)
            sb.append("TechContact: " + getTechContact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainContactRequest == false)
            return false;
        UpdateDomainContactRequest other = (UpdateDomainContactRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAdminContact() == null ^ this.getAdminContact() == null)
            return false;
        if (other.getAdminContact() != null && other.getAdminContact().equals(this.getAdminContact()) == false)
            return false;
        if (other.getRegistrantContact() == null ^ this.getRegistrantContact() == null)
            return false;
        if (other.getRegistrantContact() != null && other.getRegistrantContact().equals(this.getRegistrantContact()) == false)
            return false;
        if (other.getTechContact() == null ^ this.getTechContact() == null)
            return false;
        if (other.getTechContact() != null && other.getTechContact().equals(this.getTechContact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAdminContact() == null) ? 0 : getAdminContact().hashCode());
        hashCode = prime * hashCode + ((getRegistrantContact() == null) ? 0 : getRegistrantContact().hashCode());
        hashCode = prime * hashCode + ((getTechContact() == null) ? 0 : getTechContact().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainContactRequest clone() {
        return (UpdateDomainContactRequest) super.clone();
    }
}
