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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the profile.
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
     * Specifies whether or not logging is enabled for this profile.
     * </p>
     */
    private String logging;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the name of the profile.
     * </p>
     * 
     * @param name
     *        Specifies the name of the profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the profile.
     * </p>
     * 
     * @return Specifies the name of the profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the profile.
     * </p>
     * 
     * @param name
     *        Specifies the name of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withName(String name) {
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

    public CreateProfileRequest withEmail(String email) {
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

    public CreateProfileRequest withPhone(String phone) {
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

    public CreateProfileRequest withBusinessName(String businessName) {
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

    public CreateProfileRequest withLogging(String logging) {
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

    public CreateProfileRequest withLogging(Logging logging) {
        this.logging = logging.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param clientToken
     *        Reserved for future use.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param clientToken
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * 
     * @return Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by
     *         type. You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type.
     *        You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type.
     *        You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type.
     *        You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProfileRequest == false)
            return false;
        CreateProfileRequest other = (CreateProfileRequest) obj;
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getPhone() == null) ? 0 : getPhone().hashCode());
        hashCode = prime * hashCode + ((getBusinessName() == null) ? 0 : getBusinessName().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProfileRequest clone() {
        return (CreateProfileRequest) super.clone();
    }

}
