/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the unique, system-generated identifier for the profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for the profile.
     * </p>
     */
    private String profileArn;
    /**
     * <p>
     * Returns the name of the profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Returns the email address associated with this customer profile.
     * </p>
     */
    private String email;
    /**
     * <p>
     * Returns the phone number associated with the profile.
     * </p>
     */
    private String phone;
    /**
     * <p>
     * Returns the name for the business associated with this profile.
     * </p>
     */
    private String businessName;
    /**
     * <p>
     * Specifies whether or not logging is enabled for this profile.
     * </p>
     */
    private String logging;
    /**
     * <p>
     * Returns the name of the logging group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * Returns a timestamp for creation date and time of the profile.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Returns a timestamp for last time the profile was modified.
     * </p>
     */
    private java.util.Date modifiedAt;

    /**
     * <p>
     * Returns the unique, system-generated identifier for the profile.
     * </p>
     * 
     * @param profileId
     *        Returns the unique, system-generated identifier for the profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for the profile.
     * </p>
     * 
     * @return Returns the unique, system-generated identifier for the profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for the profile.
     * </p>
     * 
     * @param profileId
     *        Returns the unique, system-generated identifier for the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResult withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for the profile.
     * </p>
     * 
     * @param profileArn
     *        Returns an Amazon Resource Name (ARN) for the profile.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for the profile.
     * </p>
     * 
     * @return Returns an Amazon Resource Name (ARN) for the profile.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for the profile.
     * </p>
     * 
     * @param profileArn
     *        Returns an Amazon Resource Name (ARN) for the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResult withProfileArn(String profileArn) {
        setProfileArn(profileArn);
        return this;
    }

    /**
     * <p>
     * Returns the name of the profile.
     * </p>
     * 
     * @param name
     *        Returns the name of the profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Returns the name of the profile.
     * </p>
     * 
     * @return Returns the name of the profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Returns the name of the profile.
     * </p>
     * 
     * @param name
     *        Returns the name of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Returns the email address associated with this customer profile.
     * </p>
     * 
     * @param email
     *        Returns the email address associated with this customer profile.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Returns the email address associated with this customer profile.
     * </p>
     * 
     * @return Returns the email address associated with this customer profile.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * Returns the email address associated with this customer profile.
     * </p>
     * 
     * @param email
     *        Returns the email address associated with this customer profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResult withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * Returns the phone number associated with the profile.
     * </p>
     * 
     * @param phone
     *        Returns the phone number associated with the profile.
     */

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * <p>
     * Returns the phone number associated with the profile.
     * </p>
     * 
     * @return Returns the phone number associated with the profile.
     */

    public String getPhone() {
        return this.phone;
    }

    /**
     * <p>
     * Returns the phone number associated with the profile.
     * </p>
     * 
     * @param phone
     *        Returns the phone number associated with the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResult withPhone(String phone) {
        setPhone(phone);
        return this;
    }

    /**
     * <p>
     * Returns the name for the business associated with this profile.
     * </p>
     * 
     * @param businessName
     *        Returns the name for the business associated with this profile.
     */

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * <p>
     * Returns the name for the business associated with this profile.
     * </p>
     * 
     * @return Returns the name for the business associated with this profile.
     */

    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * <p>
     * Returns the name for the business associated with this profile.
     * </p>
     * 
     * @param businessName
     *        Returns the name for the business associated with this profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResult withBusinessName(String businessName) {
        setBusinessName(businessName);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not logging is enabled for this profile.
     * </p>
     * 
     * @param logging
     *        Specifies whether or not logging is enabled for this profile.
     * @see Logging
     */

    public void setLogging(String logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * Specifies whether or not logging is enabled for this profile.
     * </p>
     * 
     * @return Specifies whether or not logging is enabled for this profile.
     * @see Logging
     */

    public String getLogging() {
        return this.logging;
    }

    /**
     * <p>
     * Specifies whether or not logging is enabled for this profile.
     * </p>
     * 
     * @param logging
     *        Specifies whether or not logging is enabled for this profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Logging
     */

    public UpdateProfileResult withLogging(String logging) {
        setLogging(logging);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not logging is enabled for this profile.
     * </p>
     * 
     * @param logging
     *        Specifies whether or not logging is enabled for this profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Logging
     */

    public UpdateProfileResult withLogging(Logging logging) {
        this.logging = logging.toString();
        return this;
    }

    /**
     * <p>
     * Returns the name of the logging group.
     * </p>
     * 
     * @param logGroupName
     *        Returns the name of the logging group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * Returns the name of the logging group.
     * </p>
     * 
     * @return Returns the name of the logging group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * Returns the name of the logging group.
     * </p>
     * 
     * @param logGroupName
     *        Returns the name of the logging group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResult withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the profile.
     * </p>
     * 
     * @param createdAt
     *        Returns a timestamp for creation date and time of the profile.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the profile.
     * </p>
     * 
     * @return Returns a timestamp for creation date and time of the profile.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the profile.
     * </p>
     * 
     * @param createdAt
     *        Returns a timestamp for creation date and time of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Returns a timestamp for last time the profile was modified.
     * </p>
     * 
     * @param modifiedAt
     *        Returns a timestamp for last time the profile was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * Returns a timestamp for last time the profile was modified.
     * </p>
     * 
     * @return Returns a timestamp for last time the profile was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * Returns a timestamp for last time the profile was modified.
     * </p>
     * 
     * @param modifiedAt
     *        Returns a timestamp for last time the profile was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResult withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
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
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append("***Sensitive Data Redacted***").append(",");
        if (getPhone() != null)
            sb.append("Phone: ").append("***Sensitive Data Redacted***").append(",");
        if (getBusinessName() != null)
            sb.append("BusinessName: ").append(getBusinessName()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProfileResult == false)
            return false;
        UpdateProfileResult other = (UpdateProfileResult) obj;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getPhone() == null ^ this.getPhone() == null)
            return false;
        if (other.getPhone() != null && other.getPhone().equals(this.getPhone()) == false)
            return false;
        if (other.getBusinessName() == null ^ this.getBusinessName() == null)
            return false;
        if (other.getBusinessName() != null && other.getBusinessName().equals(this.getBusinessName()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getPhone() == null) ? 0 : getPhone().hashCode());
        hashCode = prime * hashCode + ((getBusinessName() == null) ? 0 : getBusinessName().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProfileResult clone() {
        try {
            return (UpdateProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
