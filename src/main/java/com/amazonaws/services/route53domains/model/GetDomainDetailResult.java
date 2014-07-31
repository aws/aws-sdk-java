/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The GetDomainDetail response includes the following elements.
 * </p>
 */
public class GetDomainDetailResult implements Serializable {

    /**
     * The name of a domain. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     */
    private String domainName;

    /**
     * The name of the domain. <p>Type: String
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver> nameservers;

    /**
     * Specifies whether the domain registration is set to renew
     * automatically. <p>Type: Boolean
     */
    private Boolean autoRenew;

    /**
     * Provides details about the domain administrative contact. <p>Type:
     * Complex <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     */
    private ContactDetail adminContact;

    /**
     * Provides details about the domain registrant. <p>Type: Complex
     * <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     */
    private ContactDetail registrantContact;

    /**
     * Provides details about the domain technical contact. <p>Type: Complex
     * <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     */
    private ContactDetail techContact;

    /**
     * Specifies whether contact information for the admin contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     */
    private Boolean adminPrivacy;

    /**
     * Specifies whether contact information for the registrant contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     */
    private Boolean registrantPrivacy;

    /**
     * Specifies whether contact information for the tech contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     */
    private Boolean techPrivacy;

    /**
     * Name of the registrar of the domain as identified in the registry.
     * Amazon Route 53 domains are registered by registrar Gandi. The value
     * is <code>"GANDI SAS"</code>. <p>Type: String
     */
    private String registrarName;

    /**
     * The fully qualified name of the WHOIS server that can answer the WHOIS
     * query for the domain. <p>Type: String
     */
    private String whoIsServer;

    /**
     * Web address of the registrar. <p>Type: String
     */
    private String registrarUrl;

    /**
     * Email address to contact to report incorrect contact information for a
     * domain, to report that the domain is being used to send spam, to
     * report that someone is cybersquatting on a domain name, or report some
     * other type of abuse. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 254<br/>
     */
    private String abuseContactEmail;

    /**
     * Phone number for reporting abuse. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private String abuseContactPhone;

    /**
     * Reserved for future use.
     */
    private String registryDomainId;

    /**
     * The date when the domain was created as found in the response to a
     * WHOIS query. The date format is Unix time.
     */
    private java.util.Date creationDate;

    /**
     * The last updated date of the domain as found in the response to a
     * WHOIS query. The date format is Unix time.
     */
    private java.util.Date updatedDate;

    /**
     * The date when the registration for the domain is set to expire. The
     * date format is Unix time.
     */
    private java.util.Date expirationDate;

    /**
     * Reseller of the domain. Domains registered or transferred using Amazon
     * Route 53 domains will have <code>"Amazon"</code> as the reseller.
     * <p>Type: String
     */
    private String reseller;

    /**
     * Reserved for future use.
     */
    private String dnsSec;

    /**
     * An array of domain name status codes, also known as Extensible
     * Provisioning Protocol (EPP) status codes. <p>ICANN, the organization
     * that maintains a central database of domain names, has developed a set
     * of domain name status codes that tell you the status of a variety of
     * operations on a domain name, for example, registering a domain name,
     * transferring a domain name to another registrar, renewing the
     * registration for a domain name, and so on. All registrars use this
     * same set of status codes. <p>For a current list of domain name status
     * codes and an explanation of what each code means, go to the <a
     * href="https://www.icann.org/">ICANN website</a> and search for
     * <code>epp status codes</code>. (Search on the ICANN website; web
     * searches sometimes return an old version of the document.) <p>Type:
     * Array of String
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> statusList;

    /**
     * The name of a domain. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @return The name of a domain. <p>Type: String
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of a domain. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The name of a domain. <p>Type: String
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of a domain. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The name of a domain. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * The name of the domain. <p>Type: String
     *
     * @return The name of the domain. <p>Type: String
     */
    public java.util.List<Nameserver> getNameservers() {
        if (nameservers == null) {
              nameservers = new com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver>();
              nameservers.setAutoConstruct(true);
        }
        return nameservers;
    }
    
    /**
     * The name of the domain. <p>Type: String
     *
     * @param nameservers The name of the domain. <p>Type: String
     */
    public void setNameservers(java.util.Collection<Nameserver> nameservers) {
        if (nameservers == null) {
            this.nameservers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver> nameserversCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver>(nameservers.size());
        nameserversCopy.addAll(nameservers);
        this.nameservers = nameserversCopy;
    }
    
    /**
     * The name of the domain. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nameservers The name of the domain. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withNameservers(Nameserver... nameservers) {
        if (getNameservers() == null) setNameservers(new java.util.ArrayList<Nameserver>(nameservers.length));
        for (Nameserver value : nameservers) {
            getNameservers().add(value);
        }
        return this;
    }
    
    /**
     * The name of the domain. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nameservers The name of the domain. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withNameservers(java.util.Collection<Nameserver> nameservers) {
        if (nameservers == null) {
            this.nameservers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver> nameserversCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver>(nameservers.size());
            nameserversCopy.addAll(nameservers);
            this.nameservers = nameserversCopy;
        }

        return this;
    }

    /**
     * Specifies whether the domain registration is set to renew
     * automatically. <p>Type: Boolean
     *
     * @return Specifies whether the domain registration is set to renew
     *         automatically. <p>Type: Boolean
     */
    public Boolean isAutoRenew() {
        return autoRenew;
    }
    
    /**
     * Specifies whether the domain registration is set to renew
     * automatically. <p>Type: Boolean
     *
     * @param autoRenew Specifies whether the domain registration is set to renew
     *         automatically. <p>Type: Boolean
     */
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }
    
    /**
     * Specifies whether the domain registration is set to renew
     * automatically. <p>Type: Boolean
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoRenew Specifies whether the domain registration is set to renew
     *         automatically. <p>Type: Boolean
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Specifies whether the domain registration is set to renew
     * automatically. <p>Type: Boolean
     *
     * @return Specifies whether the domain registration is set to renew
     *         automatically. <p>Type: Boolean
     */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    /**
     * Provides details about the domain administrative contact. <p>Type:
     * Complex <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     *
     * @return Provides details about the domain administrative contact. <p>Type:
     *         Complex <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     */
    public ContactDetail getAdminContact() {
        return adminContact;
    }
    
    /**
     * Provides details about the domain administrative contact. <p>Type:
     * Complex <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     *
     * @param adminContact Provides details about the domain administrative contact. <p>Type:
     *         Complex <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     */
    public void setAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
    }
    
    /**
     * Provides details about the domain administrative contact. <p>Type:
     * Complex <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param adminContact Provides details about the domain administrative contact. <p>Type:
     *         Complex <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
        return this;
    }

    /**
     * Provides details about the domain registrant. <p>Type: Complex
     * <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     *
     * @return Provides details about the domain registrant. <p>Type: Complex
     *         <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     */
    public ContactDetail getRegistrantContact() {
        return registrantContact;
    }
    
    /**
     * Provides details about the domain registrant. <p>Type: Complex
     * <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     *
     * @param registrantContact Provides details about the domain registrant. <p>Type: Complex
     *         <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     */
    public void setRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
    }
    
    /**
     * Provides details about the domain registrant. <p>Type: Complex
     * <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registrantContact Provides details about the domain registrant. <p>Type: Complex
     *         <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
        return this;
    }

    /**
     * Provides details about the domain technical contact. <p>Type: Complex
     * <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     *
     * @return Provides details about the domain technical contact. <p>Type: Complex
     *         <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     */
    public ContactDetail getTechContact() {
        return techContact;
    }
    
    /**
     * Provides details about the domain technical contact. <p>Type: Complex
     * <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     *
     * @param techContact Provides details about the domain technical contact. <p>Type: Complex
     *         <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     */
    public void setTechContact(ContactDetail techContact) {
        this.techContact = techContact;
    }
    
    /**
     * Provides details about the domain technical contact. <p>Type: Complex
     * <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>,
     * <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     * <code>ExtraParams</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param techContact Provides details about the domain technical contact. <p>Type: Complex
     *         <p>Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withTechContact(ContactDetail techContact) {
        this.techContact = techContact;
        return this;
    }

    /**
     * Specifies whether contact information for the admin contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     *
     * @return Specifies whether contact information for the admin contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     */
    public Boolean isAdminPrivacy() {
        return adminPrivacy;
    }
    
    /**
     * Specifies whether contact information for the admin contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     *
     * @param adminPrivacy Specifies whether contact information for the admin contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     */
    public void setAdminPrivacy(Boolean adminPrivacy) {
        this.adminPrivacy = adminPrivacy;
    }
    
    /**
     * Specifies whether contact information for the admin contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param adminPrivacy Specifies whether contact information for the admin contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withAdminPrivacy(Boolean adminPrivacy) {
        this.adminPrivacy = adminPrivacy;
        return this;
    }

    /**
     * Specifies whether contact information for the admin contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     *
     * @return Specifies whether contact information for the admin contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     */
    public Boolean getAdminPrivacy() {
        return adminPrivacy;
    }

    /**
     * Specifies whether contact information for the registrant contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     *
     * @return Specifies whether contact information for the registrant contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     */
    public Boolean isRegistrantPrivacy() {
        return registrantPrivacy;
    }
    
    /**
     * Specifies whether contact information for the registrant contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     *
     * @param registrantPrivacy Specifies whether contact information for the registrant contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     */
    public void setRegistrantPrivacy(Boolean registrantPrivacy) {
        this.registrantPrivacy = registrantPrivacy;
    }
    
    /**
     * Specifies whether contact information for the registrant contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registrantPrivacy Specifies whether contact information for the registrant contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withRegistrantPrivacy(Boolean registrantPrivacy) {
        this.registrantPrivacy = registrantPrivacy;
        return this;
    }

    /**
     * Specifies whether contact information for the registrant contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     *
     * @return Specifies whether contact information for the registrant contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     */
    public Boolean getRegistrantPrivacy() {
        return registrantPrivacy;
    }

    /**
     * Specifies whether contact information for the tech contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     *
     * @return Specifies whether contact information for the tech contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     */
    public Boolean isTechPrivacy() {
        return techPrivacy;
    }
    
    /**
     * Specifies whether contact information for the tech contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     *
     * @param techPrivacy Specifies whether contact information for the tech contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     */
    public void setTechPrivacy(Boolean techPrivacy) {
        this.techPrivacy = techPrivacy;
    }
    
    /**
     * Specifies whether contact information for the tech contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param techPrivacy Specifies whether contact information for the tech contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withTechPrivacy(Boolean techPrivacy) {
        this.techPrivacy = techPrivacy;
        return this;
    }

    /**
     * Specifies whether contact information for the tech contact is
     * concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     * ("who is") queries will return contact information for our registrar
     * partner, Gandi, instead of the contact information that you enter.
     * <p>Type: Boolean
     *
     * @return Specifies whether contact information for the tech contact is
     *         concealed from WHOIS queries. If the value is <code>true</code>, WHOIS
     *         ("who is") queries will return contact information for our registrar
     *         partner, Gandi, instead of the contact information that you enter.
     *         <p>Type: Boolean
     */
    public Boolean getTechPrivacy() {
        return techPrivacy;
    }

    /**
     * Name of the registrar of the domain as identified in the registry.
     * Amazon Route 53 domains are registered by registrar Gandi. The value
     * is <code>"GANDI SAS"</code>. <p>Type: String
     *
     * @return Name of the registrar of the domain as identified in the registry.
     *         Amazon Route 53 domains are registered by registrar Gandi. The value
     *         is <code>"GANDI SAS"</code>. <p>Type: String
     */
    public String getRegistrarName() {
        return registrarName;
    }
    
    /**
     * Name of the registrar of the domain as identified in the registry.
     * Amazon Route 53 domains are registered by registrar Gandi. The value
     * is <code>"GANDI SAS"</code>. <p>Type: String
     *
     * @param registrarName Name of the registrar of the domain as identified in the registry.
     *         Amazon Route 53 domains are registered by registrar Gandi. The value
     *         is <code>"GANDI SAS"</code>. <p>Type: String
     */
    public void setRegistrarName(String registrarName) {
        this.registrarName = registrarName;
    }
    
    /**
     * Name of the registrar of the domain as identified in the registry.
     * Amazon Route 53 domains are registered by registrar Gandi. The value
     * is <code>"GANDI SAS"</code>. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registrarName Name of the registrar of the domain as identified in the registry.
     *         Amazon Route 53 domains are registered by registrar Gandi. The value
     *         is <code>"GANDI SAS"</code>. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withRegistrarName(String registrarName) {
        this.registrarName = registrarName;
        return this;
    }

    /**
     * The fully qualified name of the WHOIS server that can answer the WHOIS
     * query for the domain. <p>Type: String
     *
     * @return The fully qualified name of the WHOIS server that can answer the WHOIS
     *         query for the domain. <p>Type: String
     */
    public String getWhoIsServer() {
        return whoIsServer;
    }
    
    /**
     * The fully qualified name of the WHOIS server that can answer the WHOIS
     * query for the domain. <p>Type: String
     *
     * @param whoIsServer The fully qualified name of the WHOIS server that can answer the WHOIS
     *         query for the domain. <p>Type: String
     */
    public void setWhoIsServer(String whoIsServer) {
        this.whoIsServer = whoIsServer;
    }
    
    /**
     * The fully qualified name of the WHOIS server that can answer the WHOIS
     * query for the domain. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param whoIsServer The fully qualified name of the WHOIS server that can answer the WHOIS
     *         query for the domain. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withWhoIsServer(String whoIsServer) {
        this.whoIsServer = whoIsServer;
        return this;
    }

    /**
     * Web address of the registrar. <p>Type: String
     *
     * @return Web address of the registrar. <p>Type: String
     */
    public String getRegistrarUrl() {
        return registrarUrl;
    }
    
    /**
     * Web address of the registrar. <p>Type: String
     *
     * @param registrarUrl Web address of the registrar. <p>Type: String
     */
    public void setRegistrarUrl(String registrarUrl) {
        this.registrarUrl = registrarUrl;
    }
    
    /**
     * Web address of the registrar. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registrarUrl Web address of the registrar. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withRegistrarUrl(String registrarUrl) {
        this.registrarUrl = registrarUrl;
        return this;
    }

    /**
     * Email address to contact to report incorrect contact information for a
     * domain, to report that the domain is being used to send spam, to
     * report that someone is cybersquatting on a domain name, or report some
     * other type of abuse. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 254<br/>
     *
     * @return Email address to contact to report incorrect contact information for a
     *         domain, to report that the domain is being used to send spam, to
     *         report that someone is cybersquatting on a domain name, or report some
     *         other type of abuse. <p>Type: String
     */
    public String getAbuseContactEmail() {
        return abuseContactEmail;
    }
    
    /**
     * Email address to contact to report incorrect contact information for a
     * domain, to report that the domain is being used to send spam, to
     * report that someone is cybersquatting on a domain name, or report some
     * other type of abuse. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 254<br/>
     *
     * @param abuseContactEmail Email address to contact to report incorrect contact information for a
     *         domain, to report that the domain is being used to send spam, to
     *         report that someone is cybersquatting on a domain name, or report some
     *         other type of abuse. <p>Type: String
     */
    public void setAbuseContactEmail(String abuseContactEmail) {
        this.abuseContactEmail = abuseContactEmail;
    }
    
    /**
     * Email address to contact to report incorrect contact information for a
     * domain, to report that the domain is being used to send spam, to
     * report that someone is cybersquatting on a domain name, or report some
     * other type of abuse. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 254<br/>
     *
     * @param abuseContactEmail Email address to contact to report incorrect contact information for a
     *         domain, to report that the domain is being used to send spam, to
     *         report that someone is cybersquatting on a domain name, or report some
     *         other type of abuse. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withAbuseContactEmail(String abuseContactEmail) {
        this.abuseContactEmail = abuseContactEmail;
        return this;
    }

    /**
     * Phone number for reporting abuse. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return Phone number for reporting abuse. <p>Type: String
     */
    public String getAbuseContactPhone() {
        return abuseContactPhone;
    }
    
    /**
     * Phone number for reporting abuse. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param abuseContactPhone Phone number for reporting abuse. <p>Type: String
     */
    public void setAbuseContactPhone(String abuseContactPhone) {
        this.abuseContactPhone = abuseContactPhone;
    }
    
    /**
     * Phone number for reporting abuse. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param abuseContactPhone Phone number for reporting abuse. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withAbuseContactPhone(String abuseContactPhone) {
        this.abuseContactPhone = abuseContactPhone;
        return this;
    }

    /**
     * Reserved for future use.
     *
     * @return Reserved for future use.
     */
    public String getRegistryDomainId() {
        return registryDomainId;
    }
    
    /**
     * Reserved for future use.
     *
     * @param registryDomainId Reserved for future use.
     */
    public void setRegistryDomainId(String registryDomainId) {
        this.registryDomainId = registryDomainId;
    }
    
    /**
     * Reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registryDomainId Reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withRegistryDomainId(String registryDomainId) {
        this.registryDomainId = registryDomainId;
        return this;
    }

    /**
     * The date when the domain was created as found in the response to a
     * WHOIS query. The date format is Unix time.
     *
     * @return The date when the domain was created as found in the response to a
     *         WHOIS query. The date format is Unix time.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * The date when the domain was created as found in the response to a
     * WHOIS query. The date format is Unix time.
     *
     * @param creationDate The date when the domain was created as found in the response to a
     *         WHOIS query. The date format is Unix time.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The date when the domain was created as found in the response to a
     * WHOIS query. The date format is Unix time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The date when the domain was created as found in the response to a
     *         WHOIS query. The date format is Unix time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The last updated date of the domain as found in the response to a
     * WHOIS query. The date format is Unix time.
     *
     * @return The last updated date of the domain as found in the response to a
     *         WHOIS query. The date format is Unix time.
     */
    public java.util.Date getUpdatedDate() {
        return updatedDate;
    }
    
    /**
     * The last updated date of the domain as found in the response to a
     * WHOIS query. The date format is Unix time.
     *
     * @param updatedDate The last updated date of the domain as found in the response to a
     *         WHOIS query. The date format is Unix time.
     */
    public void setUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    /**
     * The last updated date of the domain as found in the response to a
     * WHOIS query. The date format is Unix time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param updatedDate The last updated date of the domain as found in the response to a
     *         WHOIS query. The date format is Unix time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    /**
     * The date when the registration for the domain is set to expire. The
     * date format is Unix time.
     *
     * @return The date when the registration for the domain is set to expire. The
     *         date format is Unix time.
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }
    
    /**
     * The date when the registration for the domain is set to expire. The
     * date format is Unix time.
     *
     * @param expirationDate The date when the registration for the domain is set to expire. The
     *         date format is Unix time.
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    /**
     * The date when the registration for the domain is set to expire. The
     * date format is Unix time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expirationDate The date when the registration for the domain is set to expire. The
     *         date format is Unix time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Reseller of the domain. Domains registered or transferred using Amazon
     * Route 53 domains will have <code>"Amazon"</code> as the reseller.
     * <p>Type: String
     *
     * @return Reseller of the domain. Domains registered or transferred using Amazon
     *         Route 53 domains will have <code>"Amazon"</code> as the reseller.
     *         <p>Type: String
     */
    public String getReseller() {
        return reseller;
    }
    
    /**
     * Reseller of the domain. Domains registered or transferred using Amazon
     * Route 53 domains will have <code>"Amazon"</code> as the reseller.
     * <p>Type: String
     *
     * @param reseller Reseller of the domain. Domains registered or transferred using Amazon
     *         Route 53 domains will have <code>"Amazon"</code> as the reseller.
     *         <p>Type: String
     */
    public void setReseller(String reseller) {
        this.reseller = reseller;
    }
    
    /**
     * Reseller of the domain. Domains registered or transferred using Amazon
     * Route 53 domains will have <code>"Amazon"</code> as the reseller.
     * <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reseller Reseller of the domain. Domains registered or transferred using Amazon
     *         Route 53 domains will have <code>"Amazon"</code> as the reseller.
     *         <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withReseller(String reseller) {
        this.reseller = reseller;
        return this;
    }

    /**
     * Reserved for future use.
     *
     * @return Reserved for future use.
     */
    public String getDnsSec() {
        return dnsSec;
    }
    
    /**
     * Reserved for future use.
     *
     * @param dnsSec Reserved for future use.
     */
    public void setDnsSec(String dnsSec) {
        this.dnsSec = dnsSec;
    }
    
    /**
     * Reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dnsSec Reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withDnsSec(String dnsSec) {
        this.dnsSec = dnsSec;
        return this;
    }

    /**
     * An array of domain name status codes, also known as Extensible
     * Provisioning Protocol (EPP) status codes. <p>ICANN, the organization
     * that maintains a central database of domain names, has developed a set
     * of domain name status codes that tell you the status of a variety of
     * operations on a domain name, for example, registering a domain name,
     * transferring a domain name to another registrar, renewing the
     * registration for a domain name, and so on. All registrars use this
     * same set of status codes. <p>For a current list of domain name status
     * codes and an explanation of what each code means, go to the <a
     * href="https://www.icann.org/">ICANN website</a> and search for
     * <code>epp status codes</code>. (Search on the ICANN website; web
     * searches sometimes return an old version of the document.) <p>Type:
     * Array of String
     *
     * @return An array of domain name status codes, also known as Extensible
     *         Provisioning Protocol (EPP) status codes. <p>ICANN, the organization
     *         that maintains a central database of domain names, has developed a set
     *         of domain name status codes that tell you the status of a variety of
     *         operations on a domain name, for example, registering a domain name,
     *         transferring a domain name to another registrar, renewing the
     *         registration for a domain name, and so on. All registrars use this
     *         same set of status codes. <p>For a current list of domain name status
     *         codes and an explanation of what each code means, go to the <a
     *         href="https://www.icann.org/">ICANN website</a> and search for
     *         <code>epp status codes</code>. (Search on the ICANN website; web
     *         searches sometimes return an old version of the document.) <p>Type:
     *         Array of String
     */
    public java.util.List<String> getStatusList() {
        if (statusList == null) {
              statusList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              statusList.setAutoConstruct(true);
        }
        return statusList;
    }
    
    /**
     * An array of domain name status codes, also known as Extensible
     * Provisioning Protocol (EPP) status codes. <p>ICANN, the organization
     * that maintains a central database of domain names, has developed a set
     * of domain name status codes that tell you the status of a variety of
     * operations on a domain name, for example, registering a domain name,
     * transferring a domain name to another registrar, renewing the
     * registration for a domain name, and so on. All registrars use this
     * same set of status codes. <p>For a current list of domain name status
     * codes and an explanation of what each code means, go to the <a
     * href="https://www.icann.org/">ICANN website</a> and search for
     * <code>epp status codes</code>. (Search on the ICANN website; web
     * searches sometimes return an old version of the document.) <p>Type:
     * Array of String
     *
     * @param statusList An array of domain name status codes, also known as Extensible
     *         Provisioning Protocol (EPP) status codes. <p>ICANN, the organization
     *         that maintains a central database of domain names, has developed a set
     *         of domain name status codes that tell you the status of a variety of
     *         operations on a domain name, for example, registering a domain name,
     *         transferring a domain name to another registrar, renewing the
     *         registration for a domain name, and so on. All registrars use this
     *         same set of status codes. <p>For a current list of domain name status
     *         codes and an explanation of what each code means, go to the <a
     *         href="https://www.icann.org/">ICANN website</a> and search for
     *         <code>epp status codes</code>. (Search on the ICANN website; web
     *         searches sometimes return an old version of the document.) <p>Type:
     *         Array of String
     */
    public void setStatusList(java.util.Collection<String> statusList) {
        if (statusList == null) {
            this.statusList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> statusListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(statusList.size());
        statusListCopy.addAll(statusList);
        this.statusList = statusListCopy;
    }
    
    /**
     * An array of domain name status codes, also known as Extensible
     * Provisioning Protocol (EPP) status codes. <p>ICANN, the organization
     * that maintains a central database of domain names, has developed a set
     * of domain name status codes that tell you the status of a variety of
     * operations on a domain name, for example, registering a domain name,
     * transferring a domain name to another registrar, renewing the
     * registration for a domain name, and so on. All registrars use this
     * same set of status codes. <p>For a current list of domain name status
     * codes and an explanation of what each code means, go to the <a
     * href="https://www.icann.org/">ICANN website</a> and search for
     * <code>epp status codes</code>. (Search on the ICANN website; web
     * searches sometimes return an old version of the document.) <p>Type:
     * Array of String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusList An array of domain name status codes, also known as Extensible
     *         Provisioning Protocol (EPP) status codes. <p>ICANN, the organization
     *         that maintains a central database of domain names, has developed a set
     *         of domain name status codes that tell you the status of a variety of
     *         operations on a domain name, for example, registering a domain name,
     *         transferring a domain name to another registrar, renewing the
     *         registration for a domain name, and so on. All registrars use this
     *         same set of status codes. <p>For a current list of domain name status
     *         codes and an explanation of what each code means, go to the <a
     *         href="https://www.icann.org/">ICANN website</a> and search for
     *         <code>epp status codes</code>. (Search on the ICANN website; web
     *         searches sometimes return an old version of the document.) <p>Type:
     *         Array of String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withStatusList(String... statusList) {
        if (getStatusList() == null) setStatusList(new java.util.ArrayList<String>(statusList.length));
        for (String value : statusList) {
            getStatusList().add(value);
        }
        return this;
    }
    
    /**
     * An array of domain name status codes, also known as Extensible
     * Provisioning Protocol (EPP) status codes. <p>ICANN, the organization
     * that maintains a central database of domain names, has developed a set
     * of domain name status codes that tell you the status of a variety of
     * operations on a domain name, for example, registering a domain name,
     * transferring a domain name to another registrar, renewing the
     * registration for a domain name, and so on. All registrars use this
     * same set of status codes. <p>For a current list of domain name status
     * codes and an explanation of what each code means, go to the <a
     * href="https://www.icann.org/">ICANN website</a> and search for
     * <code>epp status codes</code>. (Search on the ICANN website; web
     * searches sometimes return an old version of the document.) <p>Type:
     * Array of String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusList An array of domain name status codes, also known as Extensible
     *         Provisioning Protocol (EPP) status codes. <p>ICANN, the organization
     *         that maintains a central database of domain names, has developed a set
     *         of domain name status codes that tell you the status of a variety of
     *         operations on a domain name, for example, registering a domain name,
     *         transferring a domain name to another registrar, renewing the
     *         registration for a domain name, and so on. All registrars use this
     *         same set of status codes. <p>For a current list of domain name status
     *         codes and an explanation of what each code means, go to the <a
     *         href="https://www.icann.org/">ICANN website</a> and search for
     *         <code>epp status codes</code>. (Search on the ICANN website; web
     *         searches sometimes return an old version of the document.) <p>Type:
     *         Array of String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDomainDetailResult withStatusList(java.util.Collection<String> statusList) {
        if (statusList == null) {
            this.statusList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> statusListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(statusList.size());
            statusListCopy.addAll(statusList);
            this.statusList = statusListCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getNameservers() != null) sb.append("Nameservers: " + getNameservers() + ",");
        if (isAutoRenew() != null) sb.append("AutoRenew: " + isAutoRenew() + ",");
        if (getAdminContact() != null) sb.append("AdminContact: " + getAdminContact() + ",");
        if (getRegistrantContact() != null) sb.append("RegistrantContact: " + getRegistrantContact() + ",");
        if (getTechContact() != null) sb.append("TechContact: " + getTechContact() + ",");
        if (isAdminPrivacy() != null) sb.append("AdminPrivacy: " + isAdminPrivacy() + ",");
        if (isRegistrantPrivacy() != null) sb.append("RegistrantPrivacy: " + isRegistrantPrivacy() + ",");
        if (isTechPrivacy() != null) sb.append("TechPrivacy: " + isTechPrivacy() + ",");
        if (getRegistrarName() != null) sb.append("RegistrarName: " + getRegistrarName() + ",");
        if (getWhoIsServer() != null) sb.append("WhoIsServer: " + getWhoIsServer() + ",");
        if (getRegistrarUrl() != null) sb.append("RegistrarUrl: " + getRegistrarUrl() + ",");
        if (getAbuseContactEmail() != null) sb.append("AbuseContactEmail: " + getAbuseContactEmail() + ",");
        if (getAbuseContactPhone() != null) sb.append("AbuseContactPhone: " + getAbuseContactPhone() + ",");
        if (getRegistryDomainId() != null) sb.append("RegistryDomainId: " + getRegistryDomainId() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getUpdatedDate() != null) sb.append("UpdatedDate: " + getUpdatedDate() + ",");
        if (getExpirationDate() != null) sb.append("ExpirationDate: " + getExpirationDate() + ",");
        if (getReseller() != null) sb.append("Reseller: " + getReseller() + ",");
        if (getDnsSec() != null) sb.append("DnsSec: " + getDnsSec() + ",");
        if (getStatusList() != null) sb.append("StatusList: " + getStatusList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getNameservers() == null) ? 0 : getNameservers().hashCode()); 
        hashCode = prime * hashCode + ((isAutoRenew() == null) ? 0 : isAutoRenew().hashCode()); 
        hashCode = prime * hashCode + ((getAdminContact() == null) ? 0 : getAdminContact().hashCode()); 
        hashCode = prime * hashCode + ((getRegistrantContact() == null) ? 0 : getRegistrantContact().hashCode()); 
        hashCode = prime * hashCode + ((getTechContact() == null) ? 0 : getTechContact().hashCode()); 
        hashCode = prime * hashCode + ((isAdminPrivacy() == null) ? 0 : isAdminPrivacy().hashCode()); 
        hashCode = prime * hashCode + ((isRegistrantPrivacy() == null) ? 0 : isRegistrantPrivacy().hashCode()); 
        hashCode = prime * hashCode + ((isTechPrivacy() == null) ? 0 : isTechPrivacy().hashCode()); 
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetDomainDetailResult == false) return false;
        GetDomainDetailResult other = (GetDomainDetailResult)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getNameservers() == null ^ this.getNameservers() == null) return false;
        if (other.getNameservers() != null && other.getNameservers().equals(this.getNameservers()) == false) return false; 
        if (other.isAutoRenew() == null ^ this.isAutoRenew() == null) return false;
        if (other.isAutoRenew() != null && other.isAutoRenew().equals(this.isAutoRenew()) == false) return false; 
        if (other.getAdminContact() == null ^ this.getAdminContact() == null) return false;
        if (other.getAdminContact() != null && other.getAdminContact().equals(this.getAdminContact()) == false) return false; 
        if (other.getRegistrantContact() == null ^ this.getRegistrantContact() == null) return false;
        if (other.getRegistrantContact() != null && other.getRegistrantContact().equals(this.getRegistrantContact()) == false) return false; 
        if (other.getTechContact() == null ^ this.getTechContact() == null) return false;
        if (other.getTechContact() != null && other.getTechContact().equals(this.getTechContact()) == false) return false; 
        if (other.isAdminPrivacy() == null ^ this.isAdminPrivacy() == null) return false;
        if (other.isAdminPrivacy() != null && other.isAdminPrivacy().equals(this.isAdminPrivacy()) == false) return false; 
        if (other.isRegistrantPrivacy() == null ^ this.isRegistrantPrivacy() == null) return false;
        if (other.isRegistrantPrivacy() != null && other.isRegistrantPrivacy().equals(this.isRegistrantPrivacy()) == false) return false; 
        if (other.isTechPrivacy() == null ^ this.isTechPrivacy() == null) return false;
        if (other.isTechPrivacy() != null && other.isTechPrivacy().equals(this.isTechPrivacy()) == false) return false; 
        if (other.getRegistrarName() == null ^ this.getRegistrarName() == null) return false;
        if (other.getRegistrarName() != null && other.getRegistrarName().equals(this.getRegistrarName()) == false) return false; 
        if (other.getWhoIsServer() == null ^ this.getWhoIsServer() == null) return false;
        if (other.getWhoIsServer() != null && other.getWhoIsServer().equals(this.getWhoIsServer()) == false) return false; 
        if (other.getRegistrarUrl() == null ^ this.getRegistrarUrl() == null) return false;
        if (other.getRegistrarUrl() != null && other.getRegistrarUrl().equals(this.getRegistrarUrl()) == false) return false; 
        if (other.getAbuseContactEmail() == null ^ this.getAbuseContactEmail() == null) return false;
        if (other.getAbuseContactEmail() != null && other.getAbuseContactEmail().equals(this.getAbuseContactEmail()) == false) return false; 
        if (other.getAbuseContactPhone() == null ^ this.getAbuseContactPhone() == null) return false;
        if (other.getAbuseContactPhone() != null && other.getAbuseContactPhone().equals(this.getAbuseContactPhone()) == false) return false; 
        if (other.getRegistryDomainId() == null ^ this.getRegistryDomainId() == null) return false;
        if (other.getRegistryDomainId() != null && other.getRegistryDomainId().equals(this.getRegistryDomainId()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getUpdatedDate() == null ^ this.getUpdatedDate() == null) return false;
        if (other.getUpdatedDate() != null && other.getUpdatedDate().equals(this.getUpdatedDate()) == false) return false; 
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null) return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false) return false; 
        if (other.getReseller() == null ^ this.getReseller() == null) return false;
        if (other.getReseller() != null && other.getReseller().equals(this.getReseller()) == false) return false; 
        if (other.getDnsSec() == null ^ this.getDnsSec() == null) return false;
        if (other.getDnsSec() != null && other.getDnsSec().equals(this.getDnsSec()) == false) return false; 
        if (other.getStatusList() == null ^ this.getStatusList() == null) return false;
        if (other.getStatusList() != null && other.getStatusList().equals(this.getStatusList()) == false) return false; 
        return true;
    }
    
}
    