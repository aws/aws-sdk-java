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
 * ContactDetail includes the following elements.
 * </p>
 */
public class ContactDetail implements Serializable {

    /**
     * First name of contact. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String firstName;

    /**
     * Last name of contact. <p>Type: String <p>Default: None <p>Constraints:
     * Maximum 255 characters. <p>Parents: <code>RegistrantContact</code>,
     * <code>AdminContact</code>, <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String lastName;

    /**
     * Indicates whether the contact is a person, company, association, or
     * public organization. If you choose an option other than
     * <code>PERSON</code>, you must enter an organization name, and you
     * can't enable privacy protection for the contact. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     * values: <code>PERSON</code> | <code>COMPANY</code> |
     * <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER
     */
    private String contactType;

    /**
     * Name of the organization for contact types other than
     * <code>PERSON</code>. <p>Type: String <p>Default: None <p>Constraints:
     * Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     * <p>Parents: <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String organizationName;

    /**
     * First line of the contact's address. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String addressLine1;

    /**
     * Second line of contact's address, if any. <p>Type: String <p>Default:
     * None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String addressLine2;

    /**
     * The city of the contact's address. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String city;

    /**
     * The state or province of the contact's city. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String state;

    /**
     * Code for the country of the contact's address. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS, AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR, BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU, GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO, RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST, SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW
     */
    private String countryCode;

    /**
     * The zip or postal code of the contact's address. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String zipCode;

    /**
     * The phone number of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code>]". For
     * example, a US phone number might appear as
     * <code>"+1.1234567890"</code>. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private String phoneNumber;

    /**
     * Email address of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 254 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 254<br/>
     */
    private String email;

    /**
     * Fax number of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For
     * example, a US phone number might appear as
     * <code>"+1.1234567890"</code>. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private String fax;

    /**
     * A list of name-value pairs for parameters required by certain
     * top-level domains. <p>Type: Complex <p>Default: None <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Children: <code>Name</code>,
     * <code>Value</code> <p>Required: No
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam> extraParams;

    /**
     * First name of contact. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return First name of contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * First name of contact. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param firstName First name of contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * First name of contact. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param firstName First name of contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of contact. <p>Type: String <p>Default: None <p>Constraints:
     * Maximum 255 characters. <p>Parents: <code>RegistrantContact</code>,
     * <code>AdminContact</code>, <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return Last name of contact. <p>Type: String <p>Default: None <p>Constraints:
     *         Maximum 255 characters. <p>Parents: <code>RegistrantContact</code>,
     *         <code>AdminContact</code>, <code>TechContact</code> <p>Required: Yes
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Last name of contact. <p>Type: String <p>Default: None <p>Constraints:
     * Maximum 255 characters. <p>Parents: <code>RegistrantContact</code>,
     * <code>AdminContact</code>, <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param lastName Last name of contact. <p>Type: String <p>Default: None <p>Constraints:
     *         Maximum 255 characters. <p>Parents: <code>RegistrantContact</code>,
     *         <code>AdminContact</code>, <code>TechContact</code> <p>Required: Yes
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Last name of contact. <p>Type: String <p>Default: None <p>Constraints:
     * Maximum 255 characters. <p>Parents: <code>RegistrantContact</code>,
     * <code>AdminContact</code>, <code>TechContact</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param lastName Last name of contact. <p>Type: String <p>Default: None <p>Constraints:
     *         Maximum 255 characters. <p>Parents: <code>RegistrantContact</code>,
     *         <code>AdminContact</code>, <code>TechContact</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Indicates whether the contact is a person, company, association, or
     * public organization. If you choose an option other than
     * <code>PERSON</code>, you must enter an organization name, and you
     * can't enable privacy protection for the contact. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     * values: <code>PERSON</code> | <code>COMPANY</code> |
     * <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER
     *
     * @return Indicates whether the contact is a person, company, association, or
     *         public organization. If you choose an option other than
     *         <code>PERSON</code>, you must enter an organization name, and you
     *         can't enable privacy protection for the contact. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     *         values: <code>PERSON</code> | <code>COMPANY</code> |
     *         <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @see ContactType
     */
    public String getContactType() {
        return contactType;
    }
    
    /**
     * Indicates whether the contact is a person, company, association, or
     * public organization. If you choose an option other than
     * <code>PERSON</code>, you must enter an organization name, and you
     * can't enable privacy protection for the contact. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     * values: <code>PERSON</code> | <code>COMPANY</code> |
     * <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER
     *
     * @param contactType Indicates whether the contact is a person, company, association, or
     *         public organization. If you choose an option other than
     *         <code>PERSON</code>, you must enter an organization name, and you
     *         can't enable privacy protection for the contact. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     *         values: <code>PERSON</code> | <code>COMPANY</code> |
     *         <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @see ContactType
     */
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
    
    /**
     * Indicates whether the contact is a person, company, association, or
     * public organization. If you choose an option other than
     * <code>PERSON</code>, you must enter an organization name, and you
     * can't enable privacy protection for the contact. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     * values: <code>PERSON</code> | <code>COMPANY</code> |
     * <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER
     *
     * @param contactType Indicates whether the contact is a person, company, association, or
     *         public organization. If you choose an option other than
     *         <code>PERSON</code>, you must enter an organization name, and you
     *         can't enable privacy protection for the contact. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     *         values: <code>PERSON</code> | <code>COMPANY</code> |
     *         <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ContactType
     */
    public ContactDetail withContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }

    /**
     * Indicates whether the contact is a person, company, association, or
     * public organization. If you choose an option other than
     * <code>PERSON</code>, you must enter an organization name, and you
     * can't enable privacy protection for the contact. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     * values: <code>PERSON</code> | <code>COMPANY</code> |
     * <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER
     *
     * @param contactType Indicates whether the contact is a person, company, association, or
     *         public organization. If you choose an option other than
     *         <code>PERSON</code>, you must enter an organization name, and you
     *         can't enable privacy protection for the contact. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     *         values: <code>PERSON</code> | <code>COMPANY</code> |
     *         <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @see ContactType
     */
    public void setContactType(ContactType contactType) {
        this.contactType = contactType.toString();
    }
    
    /**
     * Indicates whether the contact is a person, company, association, or
     * public organization. If you choose an option other than
     * <code>PERSON</code>, you must enter an organization name, and you
     * can't enable privacy protection for the contact. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     * values: <code>PERSON</code> | <code>COMPANY</code> |
     * <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER
     *
     * @param contactType Indicates whether the contact is a person, company, association, or
     *         public organization. If you choose an option other than
     *         <code>PERSON</code>, you must enter an organization name, and you
     *         can't enable privacy protection for the contact. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Valid
     *         values: <code>PERSON</code> | <code>COMPANY</code> |
     *         <code>ASSOCIATION</code> | <code>PUBLIC_BODY</code> <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ContactType
     */
    public ContactDetail withContactType(ContactType contactType) {
        this.contactType = contactType.toString();
        return this;
    }

    /**
     * Name of the organization for contact types other than
     * <code>PERSON</code>. <p>Type: String <p>Default: None <p>Constraints:
     * Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     * <p>Parents: <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return Name of the organization for contact types other than
     *         <code>PERSON</code>. <p>Type: String <p>Default: None <p>Constraints:
     *         Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     *         <p>Parents: <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     */
    public String getOrganizationName() {
        return organizationName;
    }
    
    /**
     * Name of the organization for contact types other than
     * <code>PERSON</code>. <p>Type: String <p>Default: None <p>Constraints:
     * Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     * <p>Parents: <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param organizationName Name of the organization for contact types other than
     *         <code>PERSON</code>. <p>Type: String <p>Default: None <p>Constraints:
     *         Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     *         <p>Parents: <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    
    /**
     * Name of the organization for contact types other than
     * <code>PERSON</code>. <p>Type: String <p>Default: None <p>Constraints:
     * Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     * <p>Parents: <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param organizationName Name of the organization for contact types other than
     *         <code>PERSON</code>. <p>Type: String <p>Default: None <p>Constraints:
     *         Maximum 255 characters. Contact type must not be <code>PERSON</code>.
     *         <p>Parents: <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * First line of the contact's address. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return First line of the contact's address. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     */
    public String getAddressLine1() {
        return addressLine1;
    }
    
    /**
     * First line of the contact's address. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param addressLine1 First line of the contact's address. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    
    /**
     * First line of the contact's address. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param addressLine1 First line of the contact's address. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Second line of contact's address, if any. <p>Type: String <p>Default:
     * None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return Second line of contact's address, if any. <p>Type: String <p>Default:
     *         None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     */
    public String getAddressLine2() {
        return addressLine2;
    }
    
    /**
     * Second line of contact's address, if any. <p>Type: String <p>Default:
     * None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param addressLine2 Second line of contact's address, if any. <p>Type: String <p>Default:
     *         None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    
    /**
     * Second line of contact's address, if any. <p>Type: String <p>Default:
     * None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param addressLine2 Second line of contact's address, if any. <p>Type: String <p>Default:
     *         None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * The city of the contact's address. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return The city of the contact's address. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     */
    public String getCity() {
        return city;
    }
    
    /**
     * The city of the contact's address. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param city The city of the contact's address. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
     * The city of the contact's address. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param city The city of the contact's address. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * The state or province of the contact's city. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return The state or province of the contact's city. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state or province of the contact's city. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param state The state or province of the contact's city. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state or province of the contact's city. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param state The state or province of the contact's city. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Code for the country of the contact's address. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS, AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR, BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU, GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO, RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST, SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW
     *
     * @return Code for the country of the contact's address. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @see CountryCode
     */
    public String getCountryCode() {
        return countryCode;
    }
    
    /**
     * Code for the country of the contact's address. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS, AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR, BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU, GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO, RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST, SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW
     *
     * @param countryCode Code for the country of the contact's address. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @see CountryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    /**
     * Code for the country of the contact's address. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS, AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR, BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU, GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO, RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST, SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW
     *
     * @param countryCode Code for the country of the contact's address. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CountryCode
     */
    public ContactDetail withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Code for the country of the contact's address. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS, AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR, BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU, GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO, RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST, SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW
     *
     * @param countryCode Code for the country of the contact's address. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @see CountryCode
     */
    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode.toString();
    }
    
    /**
     * Code for the country of the contact's address. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS, AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR, BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU, GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO, RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST, SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW
     *
     * @param countryCode Code for the country of the contact's address. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CountryCode
     */
    public ContactDetail withCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode.toString();
        return this;
    }

    /**
     * The zip or postal code of the contact's address. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return The zip or postal code of the contact's address. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     */
    public String getZipCode() {
        return zipCode;
    }
    
    /**
     * The zip or postal code of the contact's address. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param zipCode The zip or postal code of the contact's address. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    /**
     * The zip or postal code of the contact's address. <p>Type: String
     * <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param zipCode The zip or postal code of the contact's address. <p>Type: String
     *         <p>Default: None <p>Constraints: Maximum 255 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * The phone number of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code>]". For
     * example, a US phone number might appear as
     * <code>"+1.1234567890"</code>. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return The phone number of the contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code>]". For
     *         example, a US phone number might appear as
     *         <code>"+1.1234567890"</code>. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * The phone number of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code>]". For
     * example, a US phone number might appear as
     * <code>"+1.1234567890"</code>. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param phoneNumber The phone number of the contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code>]". For
     *         example, a US phone number might appear as
     *         <code>"+1.1234567890"</code>. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * The phone number of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code>]". For
     * example, a US phone number might appear as
     * <code>"+1.1234567890"</code>. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param phoneNumber The phone number of the contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code>]". For
     *         example, a US phone number might appear as
     *         <code>"+1.1234567890"</code>. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Email address of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 254 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 254<br/>
     *
     * @return Email address of the contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 254 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Email address of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 254 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 254<br/>
     *
     * @param email Email address of the contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 254 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Email address of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Maximum 254 characters. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 254<br/>
     *
     * @param email Email address of the contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Maximum 254 characters. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Fax number of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For
     * example, a US phone number might appear as
     * <code>"+1.1234567890"</code>. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return Fax number of the contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code]". For
     *         example, a US phone number might appear as
     *         <code>"+1.1234567890"</code>. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     */
    public String getFax() {
        return fax;
    }
    
    /**
     * Fax number of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For
     * example, a US phone number might appear as
     * <code>"+1.1234567890"</code>. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param fax Fax number of the contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code]". For
     *         example, a US phone number might appear as
     *         <code>"+1.1234567890"</code>. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     */
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    /**
     * Fax number of the contact. <p>Type: String <p>Default: None
     * <p>Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For
     * example, a US phone number might appear as
     * <code>"+1.1234567890"</code>. <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param fax Fax number of the contact. <p>Type: String <p>Default: None
     *         <p>Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code]". For
     *         example, a US phone number might appear as
     *         <code>"+1.1234567890"</code>. <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withFax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * A list of name-value pairs for parameters required by certain
     * top-level domains. <p>Type: Complex <p>Default: None <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Children: <code>Name</code>,
     * <code>Value</code> <p>Required: No
     *
     * @return A list of name-value pairs for parameters required by certain
     *         top-level domains. <p>Type: Complex <p>Default: None <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Children: <code>Name</code>,
     *         <code>Value</code> <p>Required: No
     */
    public java.util.List<ExtraParam> getExtraParams() {
        if (extraParams == null) {
              extraParams = new com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam>();
              extraParams.setAutoConstruct(true);
        }
        return extraParams;
    }
    
    /**
     * A list of name-value pairs for parameters required by certain
     * top-level domains. <p>Type: Complex <p>Default: None <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Children: <code>Name</code>,
     * <code>Value</code> <p>Required: No
     *
     * @param extraParams A list of name-value pairs for parameters required by certain
     *         top-level domains. <p>Type: Complex <p>Default: None <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Children: <code>Name</code>,
     *         <code>Value</code> <p>Required: No
     */
    public void setExtraParams(java.util.Collection<ExtraParam> extraParams) {
        if (extraParams == null) {
            this.extraParams = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam> extraParamsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam>(extraParams.size());
        extraParamsCopy.addAll(extraParams);
        this.extraParams = extraParamsCopy;
    }
    
    /**
     * A list of name-value pairs for parameters required by certain
     * top-level domains. <p>Type: Complex <p>Default: None <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Children: <code>Name</code>,
     * <code>Value</code> <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param extraParams A list of name-value pairs for parameters required by certain
     *         top-level domains. <p>Type: Complex <p>Default: None <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Children: <code>Name</code>,
     *         <code>Value</code> <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withExtraParams(ExtraParam... extraParams) {
        if (getExtraParams() == null) setExtraParams(new java.util.ArrayList<ExtraParam>(extraParams.length));
        for (ExtraParam value : extraParams) {
            getExtraParams().add(value);
        }
        return this;
    }
    
    /**
     * A list of name-value pairs for parameters required by certain
     * top-level domains. <p>Type: Complex <p>Default: None <p>Parents:
     * <code>RegistrantContact</code>, <code>AdminContact</code>,
     * <code>TechContact</code> <p>Children: <code>Name</code>,
     * <code>Value</code> <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param extraParams A list of name-value pairs for parameters required by certain
     *         top-level domains. <p>Type: Complex <p>Default: None <p>Parents:
     *         <code>RegistrantContact</code>, <code>AdminContact</code>,
     *         <code>TechContact</code> <p>Children: <code>Name</code>,
     *         <code>Value</code> <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContactDetail withExtraParams(java.util.Collection<ExtraParam> extraParams) {
        if (extraParams == null) {
            this.extraParams = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam> extraParamsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam>(extraParams.size());
            extraParamsCopy.addAll(extraParams);
            this.extraParams = extraParamsCopy;
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
        if (getFirstName() != null) sb.append("FirstName: " + getFirstName() + ",");
        if (getLastName() != null) sb.append("LastName: " + getLastName() + ",");
        if (getContactType() != null) sb.append("ContactType: " + getContactType() + ",");
        if (getOrganizationName() != null) sb.append("OrganizationName: " + getOrganizationName() + ",");
        if (getAddressLine1() != null) sb.append("AddressLine1: " + getAddressLine1() + ",");
        if (getAddressLine2() != null) sb.append("AddressLine2: " + getAddressLine2() + ",");
        if (getCity() != null) sb.append("City: " + getCity() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getCountryCode() != null) sb.append("CountryCode: " + getCountryCode() + ",");
        if (getZipCode() != null) sb.append("ZipCode: " + getZipCode() + ",");
        if (getPhoneNumber() != null) sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getEmail() != null) sb.append("Email: " + getEmail() + ",");
        if (getFax() != null) sb.append("Fax: " + getFax() + ",");
        if (getExtraParams() != null) sb.append("ExtraParams: " + getExtraParams() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ContactDetail == false) return false;
        ContactDetail other = (ContactDetail)obj;
        
        if (other.getFirstName() == null ^ this.getFirstName() == null) return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false) return false; 
        if (other.getLastName() == null ^ this.getLastName() == null) return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false) return false; 
        if (other.getContactType() == null ^ this.getContactType() == null) return false;
        if (other.getContactType() != null && other.getContactType().equals(this.getContactType()) == false) return false; 
        if (other.getOrganizationName() == null ^ this.getOrganizationName() == null) return false;
        if (other.getOrganizationName() != null && other.getOrganizationName().equals(this.getOrganizationName()) == false) return false; 
        if (other.getAddressLine1() == null ^ this.getAddressLine1() == null) return false;
        if (other.getAddressLine1() != null && other.getAddressLine1().equals(this.getAddressLine1()) == false) return false; 
        if (other.getAddressLine2() == null ^ this.getAddressLine2() == null) return false;
        if (other.getAddressLine2() != null && other.getAddressLine2().equals(this.getAddressLine2()) == false) return false; 
        if (other.getCity() == null ^ this.getCity() == null) return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getCountryCode() == null ^ this.getCountryCode() == null) return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false) return false; 
        if (other.getZipCode() == null ^ this.getZipCode() == null) return false;
        if (other.getZipCode() != null && other.getZipCode().equals(this.getZipCode()) == false) return false; 
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null) return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false) return false; 
        if (other.getEmail() == null ^ this.getEmail() == null) return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false) return false; 
        if (other.getFax() == null ^ this.getFax() == null) return false;
        if (other.getFax() != null && other.getFax().equals(this.getFax()) == false) return false; 
        if (other.getExtraParams() == null ^ this.getExtraParams() == null) return false;
        if (other.getExtraParams() != null && other.getExtraParams().equals(this.getExtraParams()) == false) return false; 
        return true;
    }
    
}
    