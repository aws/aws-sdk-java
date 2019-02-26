/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/User" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class User implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the user.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The login name of the user.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The email address of the user.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The given name of the user.
     * </p>
     */
    private String givenName;
    /**
     * <p>
     * The surname of the user.
     * </p>
     */
    private String surname;
    /**
     * <p>
     * The ID of the organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The ID of the root folder.
     * </p>
     */
    private String rootFolderId;
    /**
     * <p>
     * The ID of the recycle bin folder.
     * </p>
     */
    private String recycleBinFolderId;
    /**
     * <p>
     * The status of the user.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of user.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The time when the user was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time when the user was modified.
     * </p>
     */
    private java.util.Date modifiedTimestamp;
    /**
     * <p>
     * The time zone ID of the user.
     * </p>
     */
    private String timeZoneId;
    /**
     * <p>
     * The locale of the user.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * The storage for the user.
     * </p>
     */
    private UserStorageMetadata storage;

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @param id
     *        The ID of the user.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @return The ID of the user.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @param id
     *        The ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The login name of the user.
     * </p>
     * 
     * @param username
     *        The login name of the user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The login name of the user.
     * </p>
     * 
     * @return The login name of the user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The login name of the user.
     * </p>
     * 
     * @param username
     *        The login name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the user.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @return The email address of the user.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The given name of the user.
     * </p>
     * 
     * @param givenName
     *        The given name of the user.
     */

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * <p>
     * The given name of the user.
     * </p>
     * 
     * @return The given name of the user.
     */

    public String getGivenName() {
        return this.givenName;
    }

    /**
     * <p>
     * The given name of the user.
     * </p>
     * 
     * @param givenName
     *        The given name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withGivenName(String givenName) {
        setGivenName(givenName);
        return this;
    }

    /**
     * <p>
     * The surname of the user.
     * </p>
     * 
     * @param surname
     *        The surname of the user.
     */

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * <p>
     * The surname of the user.
     * </p>
     * 
     * @return The surname of the user.
     */

    public String getSurname() {
        return this.surname;
    }

    /**
     * <p>
     * The surname of the user.
     * </p>
     * 
     * @param surname
     *        The surname of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withSurname(String surname) {
        setSurname(surname);
        return this;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @return The ID of the organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The ID of the root folder.
     * </p>
     * 
     * @param rootFolderId
     *        The ID of the root folder.
     */

    public void setRootFolderId(String rootFolderId) {
        this.rootFolderId = rootFolderId;
    }

    /**
     * <p>
     * The ID of the root folder.
     * </p>
     * 
     * @return The ID of the root folder.
     */

    public String getRootFolderId() {
        return this.rootFolderId;
    }

    /**
     * <p>
     * The ID of the root folder.
     * </p>
     * 
     * @param rootFolderId
     *        The ID of the root folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withRootFolderId(String rootFolderId) {
        setRootFolderId(rootFolderId);
        return this;
    }

    /**
     * <p>
     * The ID of the recycle bin folder.
     * </p>
     * 
     * @param recycleBinFolderId
     *        The ID of the recycle bin folder.
     */

    public void setRecycleBinFolderId(String recycleBinFolderId) {
        this.recycleBinFolderId = recycleBinFolderId;
    }

    /**
     * <p>
     * The ID of the recycle bin folder.
     * </p>
     * 
     * @return The ID of the recycle bin folder.
     */

    public String getRecycleBinFolderId() {
        return this.recycleBinFolderId;
    }

    /**
     * <p>
     * The ID of the recycle bin folder.
     * </p>
     * 
     * @param recycleBinFolderId
     *        The ID of the recycle bin folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withRecycleBinFolderId(String recycleBinFolderId) {
        setRecycleBinFolderId(recycleBinFolderId);
        return this;
    }

    /**
     * <p>
     * The status of the user.
     * </p>
     * 
     * @param status
     *        The status of the user.
     * @see UserStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the user.
     * </p>
     * 
     * @return The status of the user.
     * @see UserStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the user.
     * </p>
     * 
     * @param status
     *        The status of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStatusType
     */

    public User withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the user.
     * </p>
     * 
     * @param status
     *        The status of the user.
     * @see UserStatusType
     */

    public void setStatus(UserStatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the user.
     * </p>
     * 
     * @param status
     *        The status of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStatusType
     */

    public User withStatus(UserStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of user.
     * </p>
     * 
     * @param type
     *        The type of user.
     * @see UserType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of user.
     * </p>
     * 
     * @return The type of user.
     * @see UserType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of user.
     * </p>
     * 
     * @param type
     *        The type of user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public User withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of user.
     * </p>
     * 
     * @param type
     *        The type of user.
     * @see UserType
     */

    public void setType(UserType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of user.
     * </p>
     * 
     * @param type
     *        The type of user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public User withType(UserType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The time when the user was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the user was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time when the user was created.
     * </p>
     * 
     * @return The time when the user was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time when the user was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the user was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the user was modified.
     * </p>
     * 
     * @param modifiedTimestamp
     *        The time when the user was modified.
     */

    public void setModifiedTimestamp(java.util.Date modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    /**
     * <p>
     * The time when the user was modified.
     * </p>
     * 
     * @return The time when the user was modified.
     */

    public java.util.Date getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /**
     * <p>
     * The time when the user was modified.
     * </p>
     * 
     * @param modifiedTimestamp
     *        The time when the user was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withModifiedTimestamp(java.util.Date modifiedTimestamp) {
        setModifiedTimestamp(modifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The time zone ID of the user.
     * </p>
     * 
     * @param timeZoneId
     *        The time zone ID of the user.
     */

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    /**
     * <p>
     * The time zone ID of the user.
     * </p>
     * 
     * @return The time zone ID of the user.
     */

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    /**
     * <p>
     * The time zone ID of the user.
     * </p>
     * 
     * @param timeZoneId
     *        The time zone ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withTimeZoneId(String timeZoneId) {
        setTimeZoneId(timeZoneId);
        return this;
    }

    /**
     * <p>
     * The locale of the user.
     * </p>
     * 
     * @param locale
     *        The locale of the user.
     * @see LocaleType
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale of the user.
     * </p>
     * 
     * @return The locale of the user.
     * @see LocaleType
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale of the user.
     * </p>
     * 
     * @param locale
     *        The locale of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocaleType
     */

    public User withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The locale of the user.
     * </p>
     * 
     * @param locale
     *        The locale of the user.
     * @see LocaleType
     */

    public void setLocale(LocaleType locale) {
        withLocale(locale);
    }

    /**
     * <p>
     * The locale of the user.
     * </p>
     * 
     * @param locale
     *        The locale of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocaleType
     */

    public User withLocale(LocaleType locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * The storage for the user.
     * </p>
     * 
     * @param storage
     *        The storage for the user.
     */

    public void setStorage(UserStorageMetadata storage) {
        this.storage = storage;
    }

    /**
     * <p>
     * The storage for the user.
     * </p>
     * 
     * @return The storage for the user.
     */

    public UserStorageMetadata getStorage() {
        return this.storage;
    }

    /**
     * <p>
     * The storage for the user.
     * </p>
     * 
     * @param storage
     *        The storage for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withStorage(UserStorageMetadata storage) {
        setStorage(storage);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getGivenName() != null)
            sb.append("GivenName: ").append(getGivenName()).append(",");
        if (getSurname() != null)
            sb.append("Surname: ").append(getSurname()).append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getRootFolderId() != null)
            sb.append("RootFolderId: ").append(getRootFolderId()).append(",");
        if (getRecycleBinFolderId() != null)
            sb.append("RecycleBinFolderId: ").append(getRecycleBinFolderId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getModifiedTimestamp() != null)
            sb.append("ModifiedTimestamp: ").append(getModifiedTimestamp()).append(",");
        if (getTimeZoneId() != null)
            sb.append("TimeZoneId: ").append(getTimeZoneId()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getStorage() != null)
            sb.append("Storage: ").append(getStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getGivenName() == null ^ this.getGivenName() == null)
            return false;
        if (other.getGivenName() != null && other.getGivenName().equals(this.getGivenName()) == false)
            return false;
        if (other.getSurname() == null ^ this.getSurname() == null)
            return false;
        if (other.getSurname() != null && other.getSurname().equals(this.getSurname()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getRootFolderId() == null ^ this.getRootFolderId() == null)
            return false;
        if (other.getRootFolderId() != null && other.getRootFolderId().equals(this.getRootFolderId()) == false)
            return false;
        if (other.getRecycleBinFolderId() == null ^ this.getRecycleBinFolderId() == null)
            return false;
        if (other.getRecycleBinFolderId() != null && other.getRecycleBinFolderId().equals(this.getRecycleBinFolderId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getModifiedTimestamp() == null ^ this.getModifiedTimestamp() == null)
            return false;
        if (other.getModifiedTimestamp() != null && other.getModifiedTimestamp().equals(this.getModifiedTimestamp()) == false)
            return false;
        if (other.getTimeZoneId() == null ^ this.getTimeZoneId() == null)
            return false;
        if (other.getTimeZoneId() != null && other.getTimeZoneId().equals(this.getTimeZoneId()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getGivenName() == null) ? 0 : getGivenName().hashCode());
        hashCode = prime * hashCode + ((getSurname() == null) ? 0 : getSurname().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getRootFolderId() == null) ? 0 : getRootFolderId().hashCode());
        hashCode = prime * hashCode + ((getRecycleBinFolderId() == null) ? 0 : getRecycleBinFolderId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getModifiedTimestamp() == null) ? 0 : getModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        return hashCode;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.UserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
