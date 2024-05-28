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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * The name of the profile, used to identify it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the email address associated with this customer profile.
     * </p>
     */
    private String email;
    /**
     * <p>
     * Specifies the phone number associated with the profile.
     * </p>
     */
    private String phone;
    /**
     * <p>
     * Specifies the name for the business associated with this profile.
     * </p>
     */
    private String businessName;

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile.
     * </p>
     * 
     * @param profileId
     *        Specifies the unique, system-generated identifier for the profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile.
     * </p>
     * 
     * @return Specifies the unique, system-generated identifier for the profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile.
     * </p>
     * 
     * @param profileId
     *        Specifies the unique, system-generated identifier for the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * The name of the profile, used to identify it.
     * </p>
     * 
     * @param name
     *        The name of the profile, used to identify it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the profile, used to identify it.
     * </p>
     * 
     * @return The name of the profile, used to identify it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the profile, used to identify it.
     * </p>
     * 
     * @param name
     *        The name of the profile, used to identify it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the email address associated with this customer profile.
     * </p>
     * 
     * @param email
     *        Specifies the email address associated with this customer profile.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Specifies the email address associated with this customer profile.
     * </p>
     * 
     * @return Specifies the email address associated with this customer profile.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * Specifies the email address associated with this customer profile.
     * </p>
     * 
     * @param email
     *        Specifies the email address associated with this customer profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * Specifies the phone number associated with the profile.
     * </p>
     * 
     * @param phone
     *        Specifies the phone number associated with the profile.
     */

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * <p>
     * Specifies the phone number associated with the profile.
     * </p>
     * 
     * @return Specifies the phone number associated with the profile.
     */

    public String getPhone() {
        return this.phone;
    }

    /**
     * <p>
     * Specifies the phone number associated with the profile.
     * </p>
     * 
     * @param phone
     *        Specifies the phone number associated with the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withPhone(String phone) {
        setPhone(phone);
        return this;
    }

    /**
     * <p>
     * Specifies the name for the business associated with this profile.
     * </p>
     * 
     * @param businessName
     *        Specifies the name for the business associated with this profile.
     */

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * <p>
     * Specifies the name for the business associated with this profile.
     * </p>
     * 
     * @return Specifies the name for the business associated with this profile.
     */

    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * <p>
     * Specifies the name for the business associated with this profile.
     * </p>
     * 
     * @param businessName
     *        Specifies the name for the business associated with this profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withBusinessName(String businessName) {
        setBusinessName(businessName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append("***Sensitive Data Redacted***").append(",");
        if (getPhone() != null)
            sb.append("Phone: ").append("***Sensitive Data Redacted***").append(",");
        if (getBusinessName() != null)
            sb.append("BusinessName: ").append(getBusinessName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProfileRequest == false)
            return false;
        UpdateProfileRequest other = (UpdateProfileRequest) obj;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getPhone() == null) ? 0 : getPhone().hashCode());
        hashCode = prime * hashCode + ((getBusinessName() == null) ? 0 : getBusinessName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProfileRequest clone() {
        return (UpdateProfileRequest) super.clone();
    }

}
