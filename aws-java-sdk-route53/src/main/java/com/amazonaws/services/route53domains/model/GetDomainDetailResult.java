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

/**
 * <p>
 * The GetDomainDetail response includes the following elements.
 * </p>
 */
public class GetDomainDetailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Nameserver> nameservers;
    /**
     * <p>
     * Specifies whether the domain registration is set to renew automatically.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     */
    private Boolean autoRenew;
    /**
     * <p>
     * Provides details about the domain administrative contact.
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
     */
    private ContactDetail adminContact;
    /**
     * <p>
     * Provides details about the domain registrant.
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
     */
    private ContactDetail registrantContact;
    /**
     * <p>
     * Provides details about the domain technical contact.
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
     */
    private ContactDetail techContact;
    /**
     * <p>
     * Specifies whether contact information for the admin contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     */
    private Boolean adminPrivacy;
    /**
     * <p>
     * Specifies whether contact information for the registrant contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     */
    private Boolean registrantPrivacy;
    /**
     * <p>
     * Specifies whether contact information for the tech contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     */
    private Boolean techPrivacy;
    /**
     * <p>
     * Name of the registrar of the domain as identified in the registry. Amazon Route 53 domains are registered by
     * registrar Gandi. The value is <code>"GANDI SAS"</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String registrarName;
    /**
     * <p>
     * The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String whoIsServer;
    /**
     * <p>
     * Web address of the registrar.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String registrarUrl;
    /**
     * <p>
     * Email address to contact to report incorrect contact information for a domain, to report that the domain is being
     * used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String abuseContactEmail;
    /**
     * <p>
     * Phone number for reporting abuse.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String abuseContactPhone;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String registryDomainId;
    /**
     * <p>
     * The date when the domain was created as found in the response to a WHOIS query. The date format is Unix time.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The last updated date of the domain as found in the response to a WHOIS query. The date format is Unix time.
     * </p>
     */
    private java.util.Date updatedDate;
    /**
     * <p>
     * The date when the registration for the domain is set to expire. The date format is Unix time.
     * </p>
     */
    private java.util.Date expirationDate;
    /**
     * <p>
     * Reseller of the domain. Domains registered or transferred using Amazon Route 53 domains will have
     * <code>"Amazon"</code> as the reseller.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String reseller;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String dnsSec;
    /**
     * <p>
     * An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status codes.
     * </p>
     * <p>
     * ICANN, the organization that maintains a central database of domain names, has developed a set of domain name
     * status codes that tell you the status of a variety of operations on a domain name, for example, registering a
     * domain name, transferring a domain name to another registrar, renewing the registration for a domain name, and so
     * on. All registrars use this same set of status codes.
     * </p>
     * <p>
     * For a current list of domain name status codes and an explanation of what each code means, go to the <a
     * href="https://www.icann.org/">ICANN website</a> and search for <code>epp status codes</code>. (Search on the
     * ICANN website; web searches sometimes return an old version of the document.)
     * </p>
     * <p>
     * Type: Array of String
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> statusList;

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
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
     * 
     * @return The name of a domain.</p>
     *         <p>
     *         Type: String
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
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return The name of the domain.</p>
     *         <p>
     *         Type: String
     */

    public java.util.List<Nameserver> getNameservers() {
        if (nameservers == null) {
            nameservers = new com.amazonaws.internal.SdkInternalList<Nameserver>();
        }
        return nameservers;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param nameservers
     *        The name of the domain.</p>
     *        <p>
     *        Type: String
     */

    public void setNameservers(java.util.Collection<Nameserver> nameservers) {
        if (nameservers == null) {
            this.nameservers = null;
            return;
        }

        this.nameservers = new com.amazonaws.internal.SdkInternalList<Nameserver>(nameservers);
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNameservers(java.util.Collection)} or {@link #withNameservers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nameservers
     *        The name of the domain.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withNameservers(Nameserver... nameservers) {
        if (this.nameservers == null) {
            setNameservers(new com.amazonaws.internal.SdkInternalList<Nameserver>(nameservers.length));
        }
        for (Nameserver ele : nameservers) {
            this.nameservers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param nameservers
     *        The name of the domain.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withNameservers(java.util.Collection<Nameserver> nameservers) {
        setNameservers(nameservers);
        return this;
    }

    /**
     * <p>
     * Specifies whether the domain registration is set to renew automatically.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @param autoRenew
     *        Specifies whether the domain registration is set to renew automatically.</p>
     *        <p>
     *        Type: Boolean
     */

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * Specifies whether the domain registration is set to renew automatically.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @return Specifies whether the domain registration is set to renew automatically.</p>
     *         <p>
     *         Type: Boolean
     */

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Specifies whether the domain registration is set to renew automatically.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @param autoRenew
     *        Specifies whether the domain registration is set to renew automatically.</p>
     *        <p>
     *        Type: Boolean
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withAutoRenew(Boolean autoRenew) {
        setAutoRenew(autoRenew);
        return this;
    }

    /**
     * <p>
     * Specifies whether the domain registration is set to renew automatically.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @return Specifies whether the domain registration is set to renew automatically.</p>
     *         <p>
     *         Type: Boolean
     */

    public Boolean isAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Provides details about the domain administrative contact.
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
     * 
     * @param adminContact
     *        Provides details about the domain administrative contact. </p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     */

    public void setAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
    }

    /**
     * <p>
     * Provides details about the domain administrative contact.
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
     * 
     * @return Provides details about the domain administrative contact. </p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>,
     *         <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>, <code>CountryCode</code>,
     *         <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     */

    public ContactDetail getAdminContact() {
        return this.adminContact;
    }

    /**
     * <p>
     * Provides details about the domain administrative contact.
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
     * 
     * @param adminContact
     *        Provides details about the domain administrative contact. </p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withAdminContact(ContactDetail adminContact) {
        setAdminContact(adminContact);
        return this;
    }

    /**
     * <p>
     * Provides details about the domain registrant.
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
     * 
     * @param registrantContact
     *        Provides details about the domain registrant. </p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     */

    public void setRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
    }

    /**
     * <p>
     * Provides details about the domain registrant.
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
     * 
     * @return Provides details about the domain registrant. </p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>,
     *         <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>, <code>CountryCode</code>,
     *         <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     */

    public ContactDetail getRegistrantContact() {
        return this.registrantContact;
    }

    /**
     * <p>
     * Provides details about the domain registrant.
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
     * 
     * @param registrantContact
     *        Provides details about the domain registrant. </p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withRegistrantContact(ContactDetail registrantContact) {
        setRegistrantContact(registrantContact);
        return this;
    }

    /**
     * <p>
     * Provides details about the domain technical contact.
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
     * 
     * @param techContact
     *        Provides details about the domain technical contact.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     */

    public void setTechContact(ContactDetail techContact) {
        this.techContact = techContact;
    }

    /**
     * <p>
     * Provides details about the domain technical contact.
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
     * 
     * @return Provides details about the domain technical contact.</p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>,
     *         <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>, <code>CountryCode</code>,
     *         <code>ZipCode</code>, <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     */

    public ContactDetail getTechContact() {
        return this.techContact;
    }

    /**
     * <p>
     * Provides details about the domain technical contact.
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
     * 
     * @param techContact
     *        Provides details about the domain technical contact.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>, <code>LastName</code>, <code>ContactType</code>, <code>OrganizationName</code>, <code>AddressLine1</code>, <code>AddressLine2</code>, <code>City</code>,
     *        <code>State</code>, <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     *        <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withTechContact(ContactDetail techContact) {
        setTechContact(techContact);
        return this;
    }

    /**
     * <p>
     * Specifies whether contact information for the admin contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @param adminPrivacy
     *        Specifies whether contact information for the admin contact is concealed from WHOIS queries. If the value
     *        is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner,
     *        Gandi, instead of the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     */

    public void setAdminPrivacy(Boolean adminPrivacy) {
        this.adminPrivacy = adminPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information for the admin contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @return Specifies whether contact information for the admin contact is concealed from WHOIS queries. If the value
     *         is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner,
     *         Gandi, instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     */

    public Boolean getAdminPrivacy() {
        return this.adminPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information for the admin contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @param adminPrivacy
     *        Specifies whether contact information for the admin contact is concealed from WHOIS queries. If the value
     *        is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner,
     *        Gandi, instead of the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withAdminPrivacy(Boolean adminPrivacy) {
        setAdminPrivacy(adminPrivacy);
        return this;
    }

    /**
     * <p>
     * Specifies whether contact information for the admin contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @return Specifies whether contact information for the admin contact is concealed from WHOIS queries. If the value
     *         is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner,
     *         Gandi, instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     */

    public Boolean isAdminPrivacy() {
        return this.adminPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information for the registrant contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @param registrantPrivacy
     *        Specifies whether contact information for the registrant contact is concealed from WHOIS queries. If the
     *        value is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar
     *        partner, Gandi, instead of the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     */

    public void setRegistrantPrivacy(Boolean registrantPrivacy) {
        this.registrantPrivacy = registrantPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information for the registrant contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @return Specifies whether contact information for the registrant contact is concealed from WHOIS queries. If the
     *         value is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     */

    public Boolean getRegistrantPrivacy() {
        return this.registrantPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information for the registrant contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @param registrantPrivacy
     *        Specifies whether contact information for the registrant contact is concealed from WHOIS queries. If the
     *        value is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar
     *        partner, Gandi, instead of the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withRegistrantPrivacy(Boolean registrantPrivacy) {
        setRegistrantPrivacy(registrantPrivacy);
        return this;
    }

    /**
     * <p>
     * Specifies whether contact information for the registrant contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @return Specifies whether contact information for the registrant contact is concealed from WHOIS queries. If the
     *         value is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     */

    public Boolean isRegistrantPrivacy() {
        return this.registrantPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information for the tech contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @param techPrivacy
     *        Specifies whether contact information for the tech contact is concealed from WHOIS queries. If the value
     *        is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner,
     *        Gandi, instead of the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     */

    public void setTechPrivacy(Boolean techPrivacy) {
        this.techPrivacy = techPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information for the tech contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @return Specifies whether contact information for the tech contact is concealed from WHOIS queries. If the value
     *         is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner,
     *         Gandi, instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     */

    public Boolean getTechPrivacy() {
        return this.techPrivacy;
    }

    /**
     * <p>
     * Specifies whether contact information for the tech contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @param techPrivacy
     *        Specifies whether contact information for the tech contact is concealed from WHOIS queries. If the value
     *        is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner,
     *        Gandi, instead of the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withTechPrivacy(Boolean techPrivacy) {
        setTechPrivacy(techPrivacy);
        return this;
    }

    /**
     * <p>
     * Specifies whether contact information for the tech contact is concealed from WHOIS queries. If the value is
     * <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner, Gandi,
     * instead of the contact information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @return Specifies whether contact information for the tech contact is concealed from WHOIS queries. If the value
     *         is <code>true</code>, WHOIS ("who is") queries will return contact information for our registrar partner,
     *         Gandi, instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     */

    public Boolean isTechPrivacy() {
        return this.techPrivacy;
    }

    /**
     * <p>
     * Name of the registrar of the domain as identified in the registry. Amazon Route 53 domains are registered by
     * registrar Gandi. The value is <code>"GANDI SAS"</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param registrarName
     *        Name of the registrar of the domain as identified in the registry. Amazon Route 53 domains are registered
     *        by registrar Gandi. The value is <code>"GANDI SAS"</code>. </p>
     *        <p>
     *        Type: String
     */

    public void setRegistrarName(String registrarName) {
        this.registrarName = registrarName;
    }

    /**
     * <p>
     * Name of the registrar of the domain as identified in the registry. Amazon Route 53 domains are registered by
     * registrar Gandi. The value is <code>"GANDI SAS"</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return Name of the registrar of the domain as identified in the registry. Amazon Route 53 domains are registered
     *         by registrar Gandi. The value is <code>"GANDI SAS"</code>. </p>
     *         <p>
     *         Type: String
     */

    public String getRegistrarName() {
        return this.registrarName;
    }

    /**
     * <p>
     * Name of the registrar of the domain as identified in the registry. Amazon Route 53 domains are registered by
     * registrar Gandi. The value is <code>"GANDI SAS"</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param registrarName
     *        Name of the registrar of the domain as identified in the registry. Amazon Route 53 domains are registered
     *        by registrar Gandi. The value is <code>"GANDI SAS"</code>. </p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withRegistrarName(String registrarName) {
        setRegistrarName(registrarName);
        return this;
    }

    /**
     * <p>
     * The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param whoIsServer
     *        The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.</p>
     *        <p>
     *        Type: String
     */

    public void setWhoIsServer(String whoIsServer) {
        this.whoIsServer = whoIsServer;
    }

    /**
     * <p>
     * The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.</p>
     *         <p>
     *         Type: String
     */

    public String getWhoIsServer() {
        return this.whoIsServer;
    }

    /**
     * <p>
     * The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param whoIsServer
     *        The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withWhoIsServer(String whoIsServer) {
        setWhoIsServer(whoIsServer);
        return this;
    }

    /**
     * <p>
     * Web address of the registrar.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param registrarUrl
     *        Web address of the registrar.</p>
     *        <p>
     *        Type: String
     */

    public void setRegistrarUrl(String registrarUrl) {
        this.registrarUrl = registrarUrl;
    }

    /**
     * <p>
     * Web address of the registrar.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return Web address of the registrar.</p>
     *         <p>
     *         Type: String
     */

    public String getRegistrarUrl() {
        return this.registrarUrl;
    }

    /**
     * <p>
     * Web address of the registrar.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param registrarUrl
     *        Web address of the registrar.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withRegistrarUrl(String registrarUrl) {
        setRegistrarUrl(registrarUrl);
        return this;
    }

    /**
     * <p>
     * Email address to contact to report incorrect contact information for a domain, to report that the domain is being
     * used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param abuseContactEmail
     *        Email address to contact to report incorrect contact information for a domain, to report that the domain
     *        is being used to send spam, to report that someone is cybersquatting on a domain name, or report some
     *        other type of abuse. </p>
     *        <p>
     *        Type: String
     */

    public void setAbuseContactEmail(String abuseContactEmail) {
        this.abuseContactEmail = abuseContactEmail;
    }

    /**
     * <p>
     * Email address to contact to report incorrect contact information for a domain, to report that the domain is being
     * used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return Email address to contact to report incorrect contact information for a domain, to report that the domain
     *         is being used to send spam, to report that someone is cybersquatting on a domain name, or report some
     *         other type of abuse. </p>
     *         <p>
     *         Type: String
     */

    public String getAbuseContactEmail() {
        return this.abuseContactEmail;
    }

    /**
     * <p>
     * Email address to contact to report incorrect contact information for a domain, to report that the domain is being
     * used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param abuseContactEmail
     *        Email address to contact to report incorrect contact information for a domain, to report that the domain
     *        is being used to send spam, to report that someone is cybersquatting on a domain name, or report some
     *        other type of abuse. </p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withAbuseContactEmail(String abuseContactEmail) {
        setAbuseContactEmail(abuseContactEmail);
        return this;
    }

    /**
     * <p>
     * Phone number for reporting abuse.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param abuseContactPhone
     *        Phone number for reporting abuse. </p>
     *        <p>
     *        Type: String
     */

    public void setAbuseContactPhone(String abuseContactPhone) {
        this.abuseContactPhone = abuseContactPhone;
    }

    /**
     * <p>
     * Phone number for reporting abuse.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return Phone number for reporting abuse. </p>
     *         <p>
     *         Type: String
     */

    public String getAbuseContactPhone() {
        return this.abuseContactPhone;
    }

    /**
     * <p>
     * Phone number for reporting abuse.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param abuseContactPhone
     *        Phone number for reporting abuse. </p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withAbuseContactPhone(String abuseContactPhone) {
        setAbuseContactPhone(abuseContactPhone);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param registryDomainId
     *        Reserved for future use.
     */

    public void setRegistryDomainId(String registryDomainId) {
        this.registryDomainId = registryDomainId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getRegistryDomainId() {
        return this.registryDomainId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param registryDomainId
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withRegistryDomainId(String registryDomainId) {
        setRegistryDomainId(registryDomainId);
        return this;
    }

    /**
     * <p>
     * The date when the domain was created as found in the response to a WHOIS query. The date format is Unix time.
     * </p>
     * 
     * @param creationDate
     *        The date when the domain was created as found in the response to a WHOIS query. The date format is Unix
     *        time.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the domain was created as found in the response to a WHOIS query. The date format is Unix time.
     * </p>
     * 
     * @return The date when the domain was created as found in the response to a WHOIS query. The date format is Unix
     *         time.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when the domain was created as found in the response to a WHOIS query. The date format is Unix time.
     * </p>
     * 
     * @param creationDate
     *        The date when the domain was created as found in the response to a WHOIS query. The date format is Unix
     *        time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The last updated date of the domain as found in the response to a WHOIS query. The date format is Unix time.
     * </p>
     * 
     * @param updatedDate
     *        The last updated date of the domain as found in the response to a WHOIS query. The date format is Unix
     *        time.
     */

    public void setUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * <p>
     * The last updated date of the domain as found in the response to a WHOIS query. The date format is Unix time.
     * </p>
     * 
     * @return The last updated date of the domain as found in the response to a WHOIS query. The date format is Unix
     *         time.
     */

    public java.util.Date getUpdatedDate() {
        return this.updatedDate;
    }

    /**
     * <p>
     * The last updated date of the domain as found in the response to a WHOIS query. The date format is Unix time.
     * </p>
     * 
     * @param updatedDate
     *        The last updated date of the domain as found in the response to a WHOIS query. The date format is Unix
     *        time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withUpdatedDate(java.util.Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    /**
     * <p>
     * The date when the registration for the domain is set to expire. The date format is Unix time.
     * </p>
     * 
     * @param expirationDate
     *        The date when the registration for the domain is set to expire. The date format is Unix time.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date when the registration for the domain is set to expire. The date format is Unix time.
     * </p>
     * 
     * @return The date when the registration for the domain is set to expire. The date format is Unix time.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date when the registration for the domain is set to expire. The date format is Unix time.
     * </p>
     * 
     * @param expirationDate
     *        The date when the registration for the domain is set to expire. The date format is Unix time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * <p>
     * Reseller of the domain. Domains registered or transferred using Amazon Route 53 domains will have
     * <code>"Amazon"</code> as the reseller.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param reseller
     *        Reseller of the domain. Domains registered or transferred using Amazon Route 53 domains will have
     *        <code>"Amazon"</code> as the reseller. </p>
     *        <p>
     *        Type: String
     */

    public void setReseller(String reseller) {
        this.reseller = reseller;
    }

    /**
     * <p>
     * Reseller of the domain. Domains registered or transferred using Amazon Route 53 domains will have
     * <code>"Amazon"</code> as the reseller.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return Reseller of the domain. Domains registered or transferred using Amazon Route 53 domains will have
     *         <code>"Amazon"</code> as the reseller. </p>
     *         <p>
     *         Type: String
     */

    public String getReseller() {
        return this.reseller;
    }

    /**
     * <p>
     * Reseller of the domain. Domains registered or transferred using Amazon Route 53 domains will have
     * <code>"Amazon"</code> as the reseller.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param reseller
     *        Reseller of the domain. Domains registered or transferred using Amazon Route 53 domains will have
     *        <code>"Amazon"</code> as the reseller. </p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withReseller(String reseller) {
        setReseller(reseller);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param dnsSec
     *        Reserved for future use.
     */

    public void setDnsSec(String dnsSec) {
        this.dnsSec = dnsSec;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getDnsSec() {
        return this.dnsSec;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param dnsSec
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withDnsSec(String dnsSec) {
        setDnsSec(dnsSec);
        return this;
    }

    /**
     * <p>
     * An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status codes.
     * </p>
     * <p>
     * ICANN, the organization that maintains a central database of domain names, has developed a set of domain name
     * status codes that tell you the status of a variety of operations on a domain name, for example, registering a
     * domain name, transferring a domain name to another registrar, renewing the registration for a domain name, and so
     * on. All registrars use this same set of status codes.
     * </p>
     * <p>
     * For a current list of domain name status codes and an explanation of what each code means, go to the <a
     * href="https://www.icann.org/">ICANN website</a> and search for <code>epp status codes</code>. (Search on the
     * ICANN website; web searches sometimes return an old version of the document.)
     * </p>
     * <p>
     * Type: Array of String
     * </p>
     * 
     * @return An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status
     *         codes.</p>
     *         <p>
     *         ICANN, the organization that maintains a central database of domain names, has developed a set of domain
     *         name status codes that tell you the status of a variety of operations on a domain name, for example,
     *         registering a domain name, transferring a domain name to another registrar, renewing the registration for
     *         a domain name, and so on. All registrars use this same set of status codes.
     *         </p>
     *         <p>
     *         For a current list of domain name status codes and an explanation of what each code means, go to the <a
     *         href="https://www.icann.org/">ICANN website</a> and search for <code>epp status codes</code>. (Search on
     *         the ICANN website; web searches sometimes return an old version of the document.)
     *         </p>
     *         <p>
     *         Type: Array of String
     */

    public java.util.List<String> getStatusList() {
        if (statusList == null) {
            statusList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return statusList;
    }

    /**
     * <p>
     * An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status codes.
     * </p>
     * <p>
     * ICANN, the organization that maintains a central database of domain names, has developed a set of domain name
     * status codes that tell you the status of a variety of operations on a domain name, for example, registering a
     * domain name, transferring a domain name to another registrar, renewing the registration for a domain name, and so
     * on. All registrars use this same set of status codes.
     * </p>
     * <p>
     * For a current list of domain name status codes and an explanation of what each code means, go to the <a
     * href="https://www.icann.org/">ICANN website</a> and search for <code>epp status codes</code>. (Search on the
     * ICANN website; web searches sometimes return an old version of the document.)
     * </p>
     * <p>
     * Type: Array of String
     * </p>
     * 
     * @param statusList
     *        An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status
     *        codes.</p>
     *        <p>
     *        ICANN, the organization that maintains a central database of domain names, has developed a set of domain
     *        name status codes that tell you the status of a variety of operations on a domain name, for example,
     *        registering a domain name, transferring a domain name to another registrar, renewing the registration for
     *        a domain name, and so on. All registrars use this same set of status codes.
     *        </p>
     *        <p>
     *        For a current list of domain name status codes and an explanation of what each code means, go to the <a
     *        href="https://www.icann.org/">ICANN website</a> and search for <code>epp status codes</code>. (Search on
     *        the ICANN website; web searches sometimes return an old version of the document.)
     *        </p>
     *        <p>
     *        Type: Array of String
     */

    public void setStatusList(java.util.Collection<String> statusList) {
        if (statusList == null) {
            this.statusList = null;
            return;
        }

        this.statusList = new com.amazonaws.internal.SdkInternalList<String>(statusList);
    }

    /**
     * <p>
     * An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status codes.
     * </p>
     * <p>
     * ICANN, the organization that maintains a central database of domain names, has developed a set of domain name
     * status codes that tell you the status of a variety of operations on a domain name, for example, registering a
     * domain name, transferring a domain name to another registrar, renewing the registration for a domain name, and so
     * on. All registrars use this same set of status codes.
     * </p>
     * <p>
     * For a current list of domain name status codes and an explanation of what each code means, go to the <a
     * href="https://www.icann.org/">ICANN website</a> and search for <code>epp status codes</code>. (Search on the
     * ICANN website; web searches sometimes return an old version of the document.)
     * </p>
     * <p>
     * Type: Array of String
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusList(java.util.Collection)} or {@link #withStatusList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statusList
     *        An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status
     *        codes.</p>
     *        <p>
     *        ICANN, the organization that maintains a central database of domain names, has developed a set of domain
     *        name status codes that tell you the status of a variety of operations on a domain name, for example,
     *        registering a domain name, transferring a domain name to another registrar, renewing the registration for
     *        a domain name, and so on. All registrars use this same set of status codes.
     *        </p>
     *        <p>
     *        For a current list of domain name status codes and an explanation of what each code means, go to the <a
     *        href="https://www.icann.org/">ICANN website</a> and search for <code>epp status codes</code>. (Search on
     *        the ICANN website; web searches sometimes return an old version of the document.)
     *        </p>
     *        <p>
     *        Type: Array of String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withStatusList(String... statusList) {
        if (this.statusList == null) {
            setStatusList(new com.amazonaws.internal.SdkInternalList<String>(statusList.length));
        }
        for (String ele : statusList) {
            this.statusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status codes.
     * </p>
     * <p>
     * ICANN, the organization that maintains a central database of domain names, has developed a set of domain name
     * status codes that tell you the status of a variety of operations on a domain name, for example, registering a
     * domain name, transferring a domain name to another registrar, renewing the registration for a domain name, and so
     * on. All registrars use this same set of status codes.
     * </p>
     * <p>
     * For a current list of domain name status codes and an explanation of what each code means, go to the <a
     * href="https://www.icann.org/">ICANN website</a> and search for <code>epp status codes</code>. (Search on the
     * ICANN website; web searches sometimes return an old version of the document.)
     * </p>
     * <p>
     * Type: Array of String
     * </p>
     * 
     * @param statusList
     *        An array of domain name status codes, also known as Extensible Provisioning Protocol (EPP) status
     *        codes.</p>
     *        <p>
     *        ICANN, the organization that maintains a central database of domain names, has developed a set of domain
     *        name status codes that tell you the status of a variety of operations on a domain name, for example,
     *        registering a domain name, transferring a domain name to another registrar, renewing the registration for
     *        a domain name, and so on. All registrars use this same set of status codes.
     *        </p>
     *        <p>
     *        For a current list of domain name status codes and an explanation of what each code means, go to the <a
     *        href="https://www.icann.org/">ICANN website</a> and search for <code>epp status codes</code>. (Search on
     *        the ICANN website; web searches sometimes return an old version of the document.)
     *        </p>
     *        <p>
     *        Type: Array of String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDetailResult withStatusList(java.util.Collection<String> statusList) {
        setStatusList(statusList);
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
        if (getNameservers() != null)
            sb.append("Nameservers: " + getNameservers() + ",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: " + getAutoRenew() + ",");
        if (getAdminContact() != null)
            sb.append("AdminContact: " + getAdminContact() + ",");
        if (getRegistrantContact() != null)
            sb.append("RegistrantContact: " + getRegistrantContact() + ",");
        if (getTechContact() != null)
            sb.append("TechContact: " + getTechContact() + ",");
        if (getAdminPrivacy() != null)
            sb.append("AdminPrivacy: " + getAdminPrivacy() + ",");
        if (getRegistrantPrivacy() != null)
            sb.append("RegistrantPrivacy: " + getRegistrantPrivacy() + ",");
        if (getTechPrivacy() != null)
            sb.append("TechPrivacy: " + getTechPrivacy() + ",");
        if (getRegistrarName() != null)
            sb.append("RegistrarName: " + getRegistrarName() + ",");
        if (getWhoIsServer() != null)
            sb.append("WhoIsServer: " + getWhoIsServer() + ",");
        if (getRegistrarUrl() != null)
            sb.append("RegistrarUrl: " + getRegistrarUrl() + ",");
        if (getAbuseContactEmail() != null)
            sb.append("AbuseContactEmail: " + getAbuseContactEmail() + ",");
        if (getAbuseContactPhone() != null)
            sb.append("AbuseContactPhone: " + getAbuseContactPhone() + ",");
        if (getRegistryDomainId() != null)
            sb.append("RegistryDomainId: " + getRegistryDomainId() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getUpdatedDate() != null)
            sb.append("UpdatedDate: " + getUpdatedDate() + ",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: " + getExpirationDate() + ",");
        if (getReseller() != null)
            sb.append("Reseller: " + getReseller() + ",");
        if (getDnsSec() != null)
            sb.append("DnsSec: " + getDnsSec() + ",");
        if (getStatusList() != null)
            sb.append("StatusList: " + getStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainDetailResult == false)
            return false;
        GetDomainDetailResult other = (GetDomainDetailResult) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getNameservers() == null ^ this.getNameservers() == null)
            return false;
        if (other.getNameservers() != null && other.getNameservers().equals(this.getNameservers()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null && other.getAutoRenew().equals(this.getAutoRenew()) == false)
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
        if (other.getAdminPrivacy() == null ^ this.getAdminPrivacy() == null)
            return false;
        if (other.getAdminPrivacy() != null && other.getAdminPrivacy().equals(this.getAdminPrivacy()) == false)
            return false;
        if (other.getRegistrantPrivacy() == null ^ this.getRegistrantPrivacy() == null)
            return false;
        if (other.getRegistrantPrivacy() != null && other.getRegistrantPrivacy().equals(this.getRegistrantPrivacy()) == false)
            return false;
        if (other.getTechPrivacy() == null ^ this.getTechPrivacy() == null)
            return false;
        if (other.getTechPrivacy() != null && other.getTechPrivacy().equals(this.getTechPrivacy()) == false)
            return false;
        if (other.getRegistrarName() == null ^ this.getRegistrarName() == null)
            return false;
        if (other.getRegistrarName() != null && other.getRegistrarName().equals(this.getRegistrarName()) == false)
            return false;
        if (other.getWhoIsServer() == null ^ this.getWhoIsServer() == null)
            return false;
        if (other.getWhoIsServer() != null && other.getWhoIsServer().equals(this.getWhoIsServer()) == false)
            return false;
        if (other.getRegistrarUrl() == null ^ this.getRegistrarUrl() == null)
            return false;
        if (other.getRegistrarUrl() != null && other.getRegistrarUrl().equals(this.getRegistrarUrl()) == false)
            return false;
        if (other.getAbuseContactEmail() == null ^ this.getAbuseContactEmail() == null)
            return false;
        if (other.getAbuseContactEmail() != null && other.getAbuseContactEmail().equals(this.getAbuseContactEmail()) == false)
            return false;
        if (other.getAbuseContactPhone() == null ^ this.getAbuseContactPhone() == null)
            return false;
        if (other.getAbuseContactPhone() != null && other.getAbuseContactPhone().equals(this.getAbuseContactPhone()) == false)
            return false;
        if (other.getRegistryDomainId() == null ^ this.getRegistryDomainId() == null)
            return false;
        if (other.getRegistryDomainId() != null && other.getRegistryDomainId().equals(this.getRegistryDomainId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getUpdatedDate() == null ^ this.getUpdatedDate() == null)
            return false;
        if (other.getUpdatedDate() != null && other.getUpdatedDate().equals(this.getUpdatedDate()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getReseller() == null ^ this.getReseller() == null)
            return false;
        if (other.getReseller() != null && other.getReseller().equals(this.getReseller()) == false)
            return false;
        if (other.getDnsSec() == null ^ this.getDnsSec() == null)
            return false;
        if (other.getDnsSec() != null && other.getDnsSec().equals(this.getDnsSec()) == false)
            return false;
        if (other.getStatusList() == null ^ this.getStatusList() == null)
            return false;
        if (other.getStatusList() != null && other.getStatusList().equals(this.getStatusList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getNameservers() == null) ? 0 : getNameservers().hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode + ((getAdminContact() == null) ? 0 : getAdminContact().hashCode());
        hashCode = prime * hashCode + ((getRegistrantContact() == null) ? 0 : getRegistrantContact().hashCode());
        hashCode = prime * hashCode + ((getTechContact() == null) ? 0 : getTechContact().hashCode());
        hashCode = prime * hashCode + ((getAdminPrivacy() == null) ? 0 : getAdminPrivacy().hashCode());
        hashCode = prime * hashCode + ((getRegistrantPrivacy() == null) ? 0 : getRegistrantPrivacy().hashCode());
        hashCode = prime * hashCode + ((getTechPrivacy() == null) ? 0 : getTechPrivacy().hashCode());
        hashCode = prime * hashCode + ((getRegistrarName() == null) ? 0 : getRegistrarName().hashCode());
        hashCode = prime * hashCode + ((getWhoIsServer() == null) ? 0 : getWhoIsServer().hashCode());
        hashCode = prime * hashCode + ((getRegistrarUrl() == null) ? 0 : getRegistrarUrl().hashCode());
        hashCode = prime * hashCode + ((getAbuseContactEmail() == null) ? 0 : getAbuseContactEmail().hashCode());
        hashCode = prime * hashCode + ((getAbuseContactPhone() == null) ? 0 : getAbuseContactPhone().hashCode());
        hashCode = prime * hashCode + ((getRegistryDomainId() == null) ? 0 : getRegistryDomainId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getReseller() == null) ? 0 : getReseller().hashCode());
        hashCode = prime * hashCode + ((getDnsSec() == null) ? 0 : getDnsSec().hashCode());
        hashCode = prime * hashCode + ((getStatusList() == null) ? 0 : getStatusList().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainDetailResult clone() {
        try {
            return (GetDomainDetailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
