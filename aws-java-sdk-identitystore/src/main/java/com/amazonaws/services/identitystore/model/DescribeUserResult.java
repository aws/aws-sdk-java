/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string used to identify the user. The length limit is 128 characters. This value can consist of letters,
     * accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created
     * and stored as an attribute of the user object in the identity store.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an external
     * identity provider.
     * </p>
     */
    private java.util.List<ExternalId> externalIds;
    /**
     * <p>
     * The name of the user.
     * </p>
     */
    private Name name;
    /**
     * <p>
     * The user's name value for display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * An alternative descriptive name for the user.
     * </p>
     */
    private String nickName;
    /**
     * <p>
     * A URL link for the user's profile.
     * </p>
     */
    private String profileUrl;
    /**
     * <p>
     * The user's email value.
     * </p>
     */
    private java.util.List<Email> emails;
    /**
     * <p>
     * The user's physical address.
     * </p>
     */
    private java.util.List<Address> addresses;
    /**
     * <p>
     * A list of <code>PhoneNumber</code> objects associated with a user.
     * </p>
     */
    private java.util.List<PhoneNumber> phoneNumbers;
    /**
     * <p>
     * A string indicating the user's type.
     * </p>
     */
    private String userType;
    /**
     * <p>
     * A string containing the user's title.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The preferred language of the user.
     * </p>
     */
    private String preferredLanguage;
    /**
     * <p>
     * A string containing the user's geographical region or location.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * The time zone for a user.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     */
    private String identityStoreId;

    /**
     * <p>
     * A unique string used to identify the user. The length limit is 128 characters. This value can consist of letters,
     * accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created
     * and stored as an attribute of the user object in the identity store.
     * </p>
     * 
     * @param userName
     *        A unique string used to identify the user. The length limit is 128 characters. This value can consist of
     *        letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the
     *        user is created and stored as an attribute of the user object in the identity store.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * A unique string used to identify the user. The length limit is 128 characters. This value can consist of letters,
     * accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created
     * and stored as an attribute of the user object in the identity store.
     * </p>
     * 
     * @return A unique string used to identify the user. The length limit is 128 characters. This value can consist of
     *         letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the
     *         user is created and stored as an attribute of the user object in the identity store.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * A unique string used to identify the user. The length limit is 128 characters. This value can consist of letters,
     * accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created
     * and stored as an attribute of the user object in the identity store.
     * </p>
     * 
     * @param userName
     *        A unique string used to identify the user. The length limit is 128 characters. This value can consist of
     *        letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the
     *        user is created and stored as an attribute of the user object in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     * 
     * @param userId
     *        The identifier for a user in the identity store.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     * 
     * @return The identifier for a user in the identity store.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     * 
     * @param userId
     *        The identifier for a user in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an external
     * identity provider.
     * </p>
     * 
     * @return A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an
     *         external identity provider.
     */

    public java.util.List<ExternalId> getExternalIds() {
        return externalIds;
    }

    /**
     * <p>
     * A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an external
     * identity provider.
     * </p>
     * 
     * @param externalIds
     *        A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an
     *        external identity provider.
     */

    public void setExternalIds(java.util.Collection<ExternalId> externalIds) {
        if (externalIds == null) {
            this.externalIds = null;
            return;
        }

        this.externalIds = new java.util.ArrayList<ExternalId>(externalIds);
    }

    /**
     * <p>
     * A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an external
     * identity provider.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExternalIds(java.util.Collection)} or {@link #withExternalIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param externalIds
     *        A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an
     *        external identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withExternalIds(ExternalId... externalIds) {
        if (this.externalIds == null) {
            setExternalIds(new java.util.ArrayList<ExternalId>(externalIds.length));
        }
        for (ExternalId ele : externalIds) {
            this.externalIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an external
     * identity provider.
     * </p>
     * 
     * @param externalIds
     *        A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an
     *        external identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withExternalIds(java.util.Collection<ExternalId> externalIds) {
        setExternalIds(externalIds);
        return this;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param name
     *        The name of the user.
     */

    public void setName(Name name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @return The name of the user.
     */

    public Name getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param name
     *        The name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withName(Name name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The user's name value for display.
     * </p>
     * 
     * @param displayName
     *        The user's name value for display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The user's name value for display.
     * </p>
     * 
     * @return The user's name value for display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The user's name value for display.
     * </p>
     * 
     * @param displayName
     *        The user's name value for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * An alternative descriptive name for the user.
     * </p>
     * 
     * @param nickName
     *        An alternative descriptive name for the user.
     */

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * <p>
     * An alternative descriptive name for the user.
     * </p>
     * 
     * @return An alternative descriptive name for the user.
     */

    public String getNickName() {
        return this.nickName;
    }

    /**
     * <p>
     * An alternative descriptive name for the user.
     * </p>
     * 
     * @param nickName
     *        An alternative descriptive name for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withNickName(String nickName) {
        setNickName(nickName);
        return this;
    }

    /**
     * <p>
     * A URL link for the user's profile.
     * </p>
     * 
     * @param profileUrl
     *        A URL link for the user's profile.
     */

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    /**
     * <p>
     * A URL link for the user's profile.
     * </p>
     * 
     * @return A URL link for the user's profile.
     */

    public String getProfileUrl() {
        return this.profileUrl;
    }

    /**
     * <p>
     * A URL link for the user's profile.
     * </p>
     * 
     * @param profileUrl
     *        A URL link for the user's profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withProfileUrl(String profileUrl) {
        setProfileUrl(profileUrl);
        return this;
    }

    /**
     * <p>
     * The user's email value.
     * </p>
     * 
     * @return The user's email value.
     */

    public java.util.List<Email> getEmails() {
        return emails;
    }

    /**
     * <p>
     * The user's email value.
     * </p>
     * 
     * @param emails
     *        The user's email value.
     */

    public void setEmails(java.util.Collection<Email> emails) {
        if (emails == null) {
            this.emails = null;
            return;
        }

        this.emails = new java.util.ArrayList<Email>(emails);
    }

    /**
     * <p>
     * The user's email value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmails(java.util.Collection)} or {@link #withEmails(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param emails
     *        The user's email value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withEmails(Email... emails) {
        if (this.emails == null) {
            setEmails(new java.util.ArrayList<Email>(emails.length));
        }
        for (Email ele : emails) {
            this.emails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user's email value.
     * </p>
     * 
     * @param emails
     *        The user's email value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withEmails(java.util.Collection<Email> emails) {
        setEmails(emails);
        return this;
    }

    /**
     * <p>
     * The user's physical address.
     * </p>
     * 
     * @return The user's physical address.
     */

    public java.util.List<Address> getAddresses() {
        return addresses;
    }

    /**
     * <p>
     * The user's physical address.
     * </p>
     * 
     * @param addresses
     *        The user's physical address.
     */

    public void setAddresses(java.util.Collection<Address> addresses) {
        if (addresses == null) {
            this.addresses = null;
            return;
        }

        this.addresses = new java.util.ArrayList<Address>(addresses);
    }

    /**
     * <p>
     * The user's physical address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddresses(java.util.Collection)} or {@link #withAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addresses
     *        The user's physical address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withAddresses(Address... addresses) {
        if (this.addresses == null) {
            setAddresses(new java.util.ArrayList<Address>(addresses.length));
        }
        for (Address ele : addresses) {
            this.addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user's physical address.
     * </p>
     * 
     * @param addresses
     *        The user's physical address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withAddresses(java.util.Collection<Address> addresses) {
        setAddresses(addresses);
        return this;
    }

    /**
     * <p>
     * A list of <code>PhoneNumber</code> objects associated with a user.
     * </p>
     * 
     * @return A list of <code>PhoneNumber</code> objects associated with a user.
     */

    public java.util.List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * <p>
     * A list of <code>PhoneNumber</code> objects associated with a user.
     * </p>
     * 
     * @param phoneNumbers
     *        A list of <code>PhoneNumber</code> objects associated with a user.
     */

    public void setPhoneNumbers(java.util.Collection<PhoneNumber> phoneNumbers) {
        if (phoneNumbers == null) {
            this.phoneNumbers = null;
            return;
        }

        this.phoneNumbers = new java.util.ArrayList<PhoneNumber>(phoneNumbers);
    }

    /**
     * <p>
     * A list of <code>PhoneNumber</code> objects associated with a user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumbers(java.util.Collection)} or {@link #withPhoneNumbers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param phoneNumbers
     *        A list of <code>PhoneNumber</code> objects associated with a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withPhoneNumbers(PhoneNumber... phoneNumbers) {
        if (this.phoneNumbers == null) {
            setPhoneNumbers(new java.util.ArrayList<PhoneNumber>(phoneNumbers.length));
        }
        for (PhoneNumber ele : phoneNumbers) {
            this.phoneNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PhoneNumber</code> objects associated with a user.
     * </p>
     * 
     * @param phoneNumbers
     *        A list of <code>PhoneNumber</code> objects associated with a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withPhoneNumbers(java.util.Collection<PhoneNumber> phoneNumbers) {
        setPhoneNumbers(phoneNumbers);
        return this;
    }

    /**
     * <p>
     * A string indicating the user's type.
     * </p>
     * 
     * @param userType
     *        A string indicating the user's type.
     */

    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * <p>
     * A string indicating the user's type.
     * </p>
     * 
     * @return A string indicating the user's type.
     */

    public String getUserType() {
        return this.userType;
    }

    /**
     * <p>
     * A string indicating the user's type.
     * </p>
     * 
     * @param userType
     *        A string indicating the user's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withUserType(String userType) {
        setUserType(userType);
        return this;
    }

    /**
     * <p>
     * A string containing the user's title.
     * </p>
     * 
     * @param title
     *        A string containing the user's title.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A string containing the user's title.
     * </p>
     * 
     * @return A string containing the user's title.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A string containing the user's title.
     * </p>
     * 
     * @param title
     *        A string containing the user's title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The preferred language of the user.
     * </p>
     * 
     * @param preferredLanguage
     *        The preferred language of the user.
     */

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    /**
     * <p>
     * The preferred language of the user.
     * </p>
     * 
     * @return The preferred language of the user.
     */

    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    /**
     * <p>
     * The preferred language of the user.
     * </p>
     * 
     * @param preferredLanguage
     *        The preferred language of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withPreferredLanguage(String preferredLanguage) {
        setPreferredLanguage(preferredLanguage);
        return this;
    }

    /**
     * <p>
     * A string containing the user's geographical region or location.
     * </p>
     * 
     * @param locale
     *        A string containing the user's geographical region or location.
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * A string containing the user's geographical region or location.
     * </p>
     * 
     * @return A string containing the user's geographical region or location.
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * A string containing the user's geographical region or location.
     * </p>
     * 
     * @param locale
     *        A string containing the user's geographical region or location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The time zone for a user.
     * </p>
     * 
     * @param timezone
     *        The time zone for a user.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone for a user.
     * </p>
     * 
     * @return The time zone for a user.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone for a user.
     * </p>
     * 
     * @param timezone
     *        The time zone for a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @return The globally unique identifier for the identity store.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
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
        if (getUserName() != null)
            sb.append("UserName: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getExternalIds() != null)
            sb.append("ExternalIds: ").append(getExternalIds()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getNickName() != null)
            sb.append("NickName: ").append("***Sensitive Data Redacted***").append(",");
        if (getProfileUrl() != null)
            sb.append("ProfileUrl: ").append("***Sensitive Data Redacted***").append(",");
        if (getEmails() != null)
            sb.append("Emails: ").append(getEmails()).append(",");
        if (getAddresses() != null)
            sb.append("Addresses: ").append(getAddresses()).append(",");
        if (getPhoneNumbers() != null)
            sb.append("PhoneNumbers: ").append(getPhoneNumbers()).append(",");
        if (getUserType() != null)
            sb.append("UserType: ").append("***Sensitive Data Redacted***").append(",");
        if (getTitle() != null)
            sb.append("Title: ").append("***Sensitive Data Redacted***").append(",");
        if (getPreferredLanguage() != null)
            sb.append("PreferredLanguage: ").append("***Sensitive Data Redacted***").append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append("***Sensitive Data Redacted***").append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append("***Sensitive Data Redacted***").append(",");
        if (getIdentityStoreId() != null)
            sb.append("IdentityStoreId: ").append(getIdentityStoreId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserResult == false)
            return false;
        DescribeUserResult other = (DescribeUserResult) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getExternalIds() == null ^ this.getExternalIds() == null)
            return false;
        if (other.getExternalIds() != null && other.getExternalIds().equals(this.getExternalIds()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getNickName() == null ^ this.getNickName() == null)
            return false;
        if (other.getNickName() != null && other.getNickName().equals(this.getNickName()) == false)
            return false;
        if (other.getProfileUrl() == null ^ this.getProfileUrl() == null)
            return false;
        if (other.getProfileUrl() != null && other.getProfileUrl().equals(this.getProfileUrl()) == false)
            return false;
        if (other.getEmails() == null ^ this.getEmails() == null)
            return false;
        if (other.getEmails() != null && other.getEmails().equals(this.getEmails()) == false)
            return false;
        if (other.getAddresses() == null ^ this.getAddresses() == null)
            return false;
        if (other.getAddresses() != null && other.getAddresses().equals(this.getAddresses()) == false)
            return false;
        if (other.getPhoneNumbers() == null ^ this.getPhoneNumbers() == null)
            return false;
        if (other.getPhoneNumbers() != null && other.getPhoneNumbers().equals(this.getPhoneNumbers()) == false)
            return false;
        if (other.getUserType() == null ^ this.getUserType() == null)
            return false;
        if (other.getUserType() != null && other.getUserType().equals(this.getUserType()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getPreferredLanguage() == null ^ this.getPreferredLanguage() == null)
            return false;
        if (other.getPreferredLanguage() != null && other.getPreferredLanguage().equals(this.getPreferredLanguage()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getExternalIds() == null) ? 0 : getExternalIds().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getNickName() == null) ? 0 : getNickName().hashCode());
        hashCode = prime * hashCode + ((getProfileUrl() == null) ? 0 : getProfileUrl().hashCode());
        hashCode = prime * hashCode + ((getEmails() == null) ? 0 : getEmails().hashCode());
        hashCode = prime * hashCode + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumbers() == null) ? 0 : getPhoneNumbers().hashCode());
        hashCode = prime * hashCode + ((getUserType() == null) ? 0 : getUserType().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getPreferredLanguage() == null) ? 0 : getPreferredLanguage().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserResult clone() {
        try {
            return (DescribeUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
