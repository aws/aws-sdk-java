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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The ID of the user.
     * </p>
     */
    private String userId;
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
     * The type of the user.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The amount of storage for the user.
     * </p>
     */
    private StorageRuleType storageRule;
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
     * Boolean value to determine whether the user is granted Poweruser privileges.
     * </p>
     */
    private String grantPoweruserPrivileges;

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *         accessing the API using AWS credentials.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @param userId
     *        The ID of the user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @return The ID of the user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @param userId
     *        The ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserId(String userId) {
        setUserId(userId);
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

    public UpdateUserRequest withGivenName(String givenName) {
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

    public UpdateUserRequest withSurname(String surname) {
        setSurname(surname);
        return this;
    }

    /**
     * <p>
     * The type of the user.
     * </p>
     * 
     * @param type
     *        The type of the user.
     * @see UserType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the user.
     * </p>
     * 
     * @return The type of the user.
     * @see UserType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the user.
     * </p>
     * 
     * @param type
     *        The type of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public UpdateUserRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the user.
     * </p>
     * 
     * @param type
     *        The type of the user.
     * @see UserType
     */

    public void setType(UserType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of the user.
     * </p>
     * 
     * @param type
     *        The type of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public UpdateUserRequest withType(UserType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The amount of storage for the user.
     * </p>
     * 
     * @param storageRule
     *        The amount of storage for the user.
     */

    public void setStorageRule(StorageRuleType storageRule) {
        this.storageRule = storageRule;
    }

    /**
     * <p>
     * The amount of storage for the user.
     * </p>
     * 
     * @return The amount of storage for the user.
     */

    public StorageRuleType getStorageRule() {
        return this.storageRule;
    }

    /**
     * <p>
     * The amount of storage for the user.
     * </p>
     * 
     * @param storageRule
     *        The amount of storage for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withStorageRule(StorageRuleType storageRule) {
        setStorageRule(storageRule);
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

    public UpdateUserRequest withTimeZoneId(String timeZoneId) {
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

    public UpdateUserRequest withLocale(String locale) {
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

    public UpdateUserRequest withLocale(LocaleType locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * Boolean value to determine whether the user is granted Poweruser privileges.
     * </p>
     * 
     * @param grantPoweruserPrivileges
     *        Boolean value to determine whether the user is granted Poweruser privileges.
     * @see BooleanEnumType
     */

    public void setGrantPoweruserPrivileges(String grantPoweruserPrivileges) {
        this.grantPoweruserPrivileges = grantPoweruserPrivileges;
    }

    /**
     * <p>
     * Boolean value to determine whether the user is granted Poweruser privileges.
     * </p>
     * 
     * @return Boolean value to determine whether the user is granted Poweruser privileges.
     * @see BooleanEnumType
     */

    public String getGrantPoweruserPrivileges() {
        return this.grantPoweruserPrivileges;
    }

    /**
     * <p>
     * Boolean value to determine whether the user is granted Poweruser privileges.
     * </p>
     * 
     * @param grantPoweruserPrivileges
     *        Boolean value to determine whether the user is granted Poweruser privileges.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BooleanEnumType
     */

    public UpdateUserRequest withGrantPoweruserPrivileges(String grantPoweruserPrivileges) {
        setGrantPoweruserPrivileges(grantPoweruserPrivileges);
        return this;
    }

    /**
     * <p>
     * Boolean value to determine whether the user is granted Poweruser privileges.
     * </p>
     * 
     * @param grantPoweruserPrivileges
     *        Boolean value to determine whether the user is granted Poweruser privileges.
     * @see BooleanEnumType
     */

    public void setGrantPoweruserPrivileges(BooleanEnumType grantPoweruserPrivileges) {
        withGrantPoweruserPrivileges(grantPoweruserPrivileges);
    }

    /**
     * <p>
     * Boolean value to determine whether the user is granted Poweruser privileges.
     * </p>
     * 
     * @param grantPoweruserPrivileges
     *        Boolean value to determine whether the user is granted Poweruser privileges.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BooleanEnumType
     */

    public UpdateUserRequest withGrantPoweruserPrivileges(BooleanEnumType grantPoweruserPrivileges) {
        this.grantPoweruserPrivileges = grantPoweruserPrivileges.toString();
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getGivenName() != null)
            sb.append("GivenName: ").append(getGivenName()).append(",");
        if (getSurname() != null)
            sb.append("Surname: ").append(getSurname()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStorageRule() != null)
            sb.append("StorageRule: ").append(getStorageRule()).append(",");
        if (getTimeZoneId() != null)
            sb.append("TimeZoneId: ").append(getTimeZoneId()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getGrantPoweruserPrivileges() != null)
            sb.append("GrantPoweruserPrivileges: ").append(getGrantPoweruserPrivileges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getGivenName() == null ^ this.getGivenName() == null)
            return false;
        if (other.getGivenName() != null && other.getGivenName().equals(this.getGivenName()) == false)
            return false;
        if (other.getSurname() == null ^ this.getSurname() == null)
            return false;
        if (other.getSurname() != null && other.getSurname().equals(this.getSurname()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStorageRule() == null ^ this.getStorageRule() == null)
            return false;
        if (other.getStorageRule() != null && other.getStorageRule().equals(this.getStorageRule()) == false)
            return false;
        if (other.getTimeZoneId() == null ^ this.getTimeZoneId() == null)
            return false;
        if (other.getTimeZoneId() != null && other.getTimeZoneId().equals(this.getTimeZoneId()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getGrantPoweruserPrivileges() == null ^ this.getGrantPoweruserPrivileges() == null)
            return false;
        if (other.getGrantPoweruserPrivileges() != null && other.getGrantPoweruserPrivileges().equals(this.getGrantPoweruserPrivileges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getGivenName() == null) ? 0 : getGivenName().hashCode());
        hashCode = prime * hashCode + ((getSurname() == null) ? 0 : getSurname().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStorageRule() == null) ? 0 : getStorageRule().hashCode());
        hashCode = prime * hashCode + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getGrantPoweruserPrivileges() == null) ? 0 : getGrantPoweruserPrivileges().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
