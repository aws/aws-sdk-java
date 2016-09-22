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
 * ContactDetail includes the following elements.
 * </p>
 */
public class ContactDetail implements Serializable, Cloneable {

    /**
     * <p>
     * First name of contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * Last name of contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable privacy protection
     * for the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code>
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String contactType;
    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private String organizationName;
    /**
     * <p>
     * First line of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String addressLine1;
    /**
     * <p>
     * Second line of contact&apos;s address, if any.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private String addressLine2;
    /**
     * <p>
     * The city of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String city;
    /**
     * <p>
     * The state or province of the contact&apos;s city.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private String state;
    /**
     * <p>
     * Code for the country of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The zip or postal code of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private String zipCode;
    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code>]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * Email address of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 254 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String email;
    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private String fax;
    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level domains.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Children: <code>Name</code>, <code>Value</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ExtraParam> extraParams;

    /**
     * <p>
     * First name of contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param firstName
     *        First name of contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * First name of contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return First name of contact.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * First name of contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param firstName
     *        First name of contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * Last name of contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param lastName
     *        Last name of contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * Last name of contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Last name of contact.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * Last name of contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param lastName
     *        Last name of contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable privacy protection
     * for the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code>
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param contactType
     *        Indicates whether the contact is a person, company, association, or public organization. If you choose an
     *        option other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable
     *        privacy protection for the contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> |
     *        <code>PUBLIC_BODY</code>
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @see ContactType
     */

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable privacy protection
     * for the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code>
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Indicates whether the contact is a person, company, association, or public organization. If you choose an
     *         option other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable
     *         privacy protection for the contact.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters.
     *         </p>
     *         <p>
     *         Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> |
     *         <code>PUBLIC_BODY</code>
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: Yes
     * @see ContactType
     */

    public String getContactType() {
        return this.contactType;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable privacy protection
     * for the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code>
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param contactType
     *        Indicates whether the contact is a person, company, association, or public organization. If you choose an
     *        option other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable
     *        privacy protection for the contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> |
     *        <code>PUBLIC_BODY</code>
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public ContactDetail withContactType(String contactType) {
        setContactType(contactType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable privacy protection
     * for the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code>
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param contactType
     *        Indicates whether the contact is a person, company, association, or public organization. If you choose an
     *        option other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable
     *        privacy protection for the contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> |
     *        <code>PUBLIC_BODY</code>
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @see ContactType
     */

    public void setContactType(ContactType contactType) {
        this.contactType = contactType.toString();
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable privacy protection
     * for the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code>
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param contactType
     *        Indicates whether the contact is a person, company, association, or public organization. If you choose an
     *        option other than <code>PERSON</code>, you must enter an organization name, and you can&apos;t enable
     *        privacy protection for the contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Valid values: <code>PERSON</code> | <code>COMPANY</code> | <code>ASSOCIATION</code> |
     *        <code>PUBLIC_BODY</code>
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public ContactDetail withContactType(ContactType contactType) {
        setContactType(contactType);
        return this;
    }

    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param organizationName
     *        Name of the organization for contact types other than <code>PERSON</code>.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Name of the organization for contact types other than <code>PERSON</code>.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public String getOrganizationName() {
        return this.organizationName;
    }

    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param organizationName
     *        Name of the organization for contact types other than <code>PERSON</code>.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withOrganizationName(String organizationName) {
        setOrganizationName(organizationName);
        return this;
    }

    /**
     * <p>
     * First line of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param addressLine1
     *        First line of the contact&apos;s address.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * <p>
     * First line of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return First line of the contact&apos;s address.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getAddressLine1() {
        return this.addressLine1;
    }

    /**
     * <p>
     * First line of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param addressLine1
     *        First line of the contact&apos;s address.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withAddressLine1(String addressLine1) {
        setAddressLine1(addressLine1);
        return this;
    }

    /**
     * <p>
     * Second line of contact&apos;s address, if any.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param addressLine2
     *        Second line of contact&apos;s address, if any.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * <p>
     * Second line of contact&apos;s address, if any.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Second line of contact&apos;s address, if any.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public String getAddressLine2() {
        return this.addressLine2;
    }

    /**
     * <p>
     * Second line of contact&apos;s address, if any.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param addressLine2
     *        Second line of contact&apos;s address, if any.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withAddressLine2(String addressLine2) {
        setAddressLine2(addressLine2);
        return this;
    }

    /**
     * <p>
     * The city of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param city
     *        The city of the contact&apos;s address.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The city of the contact&apos;s address.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The city of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param city
     *        The city of the contact&apos;s address.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The state or province of the contact&apos;s city.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param state
     *        The state or province of the contact&apos;s city.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state or province of the contact&apos;s city.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return The state or province of the contact&apos;s city.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state or province of the contact&apos;s city.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param state
     *        The state or province of the contact&apos;s city.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Code for the country of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param countryCode
     *        Code for the country of the contact&apos;s address.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @see CountryCode
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * Code for the country of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Code for the country of the contact&apos;s address.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: Yes
     * @see CountryCode
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * Code for the country of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param countryCode
     *        Code for the country of the contact&apos;s address.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CountryCode
     */

    public ContactDetail withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * Code for the country of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param countryCode
     *        Code for the country of the contact&apos;s address.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @see CountryCode
     */

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode.toString();
    }

    /**
     * <p>
     * Code for the country of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param countryCode
     *        Code for the country of the contact&apos;s address.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CountryCode
     */

    public ContactDetail withCountryCode(CountryCode countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * The zip or postal code of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param zipCode
     *        The zip or postal code of the contact&apos;s address.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * <p>
     * The zip or postal code of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return The zip or postal code of the contact&apos;s address.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 255 characters.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * <p>
     * The zip or postal code of the contact&apos;s address.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 255 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param zipCode
     *        The zip or postal code of the contact&apos;s address.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 255 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withZipCode(String zipCode) {
        setZipCode(zipCode);
        return this;
    }

    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code>]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Phone number must be specified in the format
     *        "+[country dialing code].[number including any area code>]". For example, a US phone number might appear
     *        as <code>"+1.1234567890"</code>.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code>]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The phone number of the contact.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code>]". For example, a US phone number might appear
     *         as <code>"+1.1234567890"</code>.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code>]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Phone number must be specified in the format
     *        "+[country dialing code].[number including any area code>]". For example, a US phone number might appear
     *        as <code>"+1.1234567890"</code>.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * Email address of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 254 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param email
     *        Email address of the contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 254 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Email address of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 254 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Email address of the contact.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Maximum 254 characters.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * Email address of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Maximum 254 characters.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param email
     *        Email address of the contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Maximum 254 characters.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param fax
     *        Fax number of the contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Phone number must be specified in the format
     *        "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     *        <code>"+1.1234567890"</code>.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Fax number of the contact.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code]". For example, a US phone number might appear
     *         as <code>"+1.1234567890"</code>.
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public String getFax() {
        return this.fax;
    }

    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param fax
     *        Fax number of the contact.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: Phone number must be specified in the format
     *        "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     *        <code>"+1.1234567890"</code>.
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withFax(String fax) {
        setFax(fax);
        return this;
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level domains.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Children: <code>Name</code>, <code>Value</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return A list of name-value pairs for parameters required by certain top-level domains.</p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *         </p>
     *         <p>
     *         Children: <code>Name</code>, <code>Value</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public java.util.List<ExtraParam> getExtraParams() {
        if (extraParams == null) {
            extraParams = new com.amazonaws.internal.SdkInternalList<ExtraParam>();
        }
        return extraParams;
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level domains.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Children: <code>Name</code>, <code>Value</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param extraParams
     *        A list of name-value pairs for parameters required by certain top-level domains.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Children: <code>Name</code>, <code>Value</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setExtraParams(java.util.Collection<ExtraParam> extraParams) {
        if (extraParams == null) {
            this.extraParams = null;
            return;
        }

        this.extraParams = new com.amazonaws.internal.SdkInternalList<ExtraParam>(extraParams);
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level domains.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Children: <code>Name</code>, <code>Value</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtraParams(java.util.Collection)} or {@link #withExtraParams(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param extraParams
     *        A list of name-value pairs for parameters required by certain top-level domains.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Children: <code>Name</code>, <code>Value</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withExtraParams(ExtraParam... extraParams) {
        if (this.extraParams == null) {
            setExtraParams(new com.amazonaws.internal.SdkInternalList<ExtraParam>(extraParams.length));
        }
        for (ExtraParam ele : extraParams) {
            this.extraParams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level domains.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     * </p>
     * <p>
     * Children: <code>Name</code>, <code>Value</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param extraParams
     *        A list of name-value pairs for parameters required by certain top-level domains.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Parents: <code>RegistrantContact</code>, <code>AdminContact</code>, <code>TechContact</code>
     *        </p>
     *        <p>
     *        Children: <code>Name</code>, <code>Value</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withExtraParams(java.util.Collection<ExtraParam> extraParams) {
        setExtraParams(extraParams);
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
        if (getFirstName() != null)
            sb.append("FirstName: " + getFirstName() + ",");
        if (getLastName() != null)
            sb.append("LastName: " + getLastName() + ",");
        if (getContactType() != null)
            sb.append("ContactType: " + getContactType() + ",");
        if (getOrganizationName() != null)
            sb.append("OrganizationName: " + getOrganizationName() + ",");
        if (getAddressLine1() != null)
            sb.append("AddressLine1: " + getAddressLine1() + ",");
        if (getAddressLine2() != null)
            sb.append("AddressLine2: " + getAddressLine2() + ",");
        if (getCity() != null)
            sb.append("City: " + getCity() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getCountryCode() != null)
            sb.append("CountryCode: " + getCountryCode() + ",");
        if (getZipCode() != null)
            sb.append("ZipCode: " + getZipCode() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getFax() != null)
            sb.append("Fax: " + getFax() + ",");
        if (getExtraParams() != null)
            sb.append("ExtraParams: " + getExtraParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactDetail == false)
            return false;
        ContactDetail other = (ContactDetail) obj;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getContactType() == null ^ this.getContactType() == null)
            return false;
        if (other.getContactType() != null && other.getContactType().equals(this.getContactType()) == false)
            return false;
        if (other.getOrganizationName() == null ^ this.getOrganizationName() == null)
            return false;
        if (other.getOrganizationName() != null && other.getOrganizationName().equals(this.getOrganizationName()) == false)
            return false;
        if (other.getAddressLine1() == null ^ this.getAddressLine1() == null)
            return false;
        if (other.getAddressLine1() != null && other.getAddressLine1().equals(this.getAddressLine1()) == false)
            return false;
        if (other.getAddressLine2() == null ^ this.getAddressLine2() == null)
            return false;
        if (other.getAddressLine2() != null && other.getAddressLine2().equals(this.getAddressLine2()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getZipCode() == null ^ this.getZipCode() == null)
            return false;
        if (other.getZipCode() != null && other.getZipCode().equals(this.getZipCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getFax() == null ^ this.getFax() == null)
            return false;
        if (other.getFax() != null && other.getFax().equals(this.getFax()) == false)
            return false;
        if (other.getExtraParams() == null ^ this.getExtraParams() == null)
            return false;
        if (other.getExtraParams() != null && other.getExtraParams().equals(this.getExtraParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getContactType() == null) ? 0 : getContactType().hashCode());
        hashCode = prime * hashCode + ((getOrganizationName() == null) ? 0 : getOrganizationName().hashCode());
        hashCode = prime * hashCode + ((getAddressLine1() == null) ? 0 : getAddressLine1().hashCode());
        hashCode = prime * hashCode + ((getAddressLine2() == null) ? 0 : getAddressLine2().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getFax() == null) ? 0 : getFax().hashCode());
        hashCode = prime * hashCode + ((getExtraParams() == null) ? 0 : getExtraParams().hashCode());
        return hashCode;
    }

    @Override
    public ContactDetail clone() {
        try {
            return (ContactDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
