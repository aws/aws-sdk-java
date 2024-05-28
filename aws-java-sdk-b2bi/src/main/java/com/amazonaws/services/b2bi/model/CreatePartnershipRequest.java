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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreatePartnership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePartnershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * Specifies a descriptive name for the partnership.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the email address associated with this trading partner.
     * </p>
     */
    private String email;
    /**
     * <p>
     * Specifies the phone number associated with the partnership.
     * </p>
     */
    private String phone;
    /**
     * <p>
     * Specifies a list of the capabilities associated with this partnership.
     * </p>
     */
    private java.util.List<String> capabilities;
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
     * Specifies the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     * 
     * @param profileId
     *        Specifies the unique, system-generated identifier for the profile connected to this partnership.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     * 
     * @return Specifies the unique, system-generated identifier for the profile connected to this partnership.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     * 
     * @param profileId
     *        Specifies the unique, system-generated identifier for the profile connected to this partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnershipRequest withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * Specifies a descriptive name for the partnership.
     * </p>
     * 
     * @param name
     *        Specifies a descriptive name for the partnership.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies a descriptive name for the partnership.
     * </p>
     * 
     * @return Specifies a descriptive name for the partnership.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies a descriptive name for the partnership.
     * </p>
     * 
     * @param name
     *        Specifies a descriptive name for the partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnershipRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the email address associated with this trading partner.
     * </p>
     * 
     * @param email
     *        Specifies the email address associated with this trading partner.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Specifies the email address associated with this trading partner.
     * </p>
     * 
     * @return Specifies the email address associated with this trading partner.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * Specifies the email address associated with this trading partner.
     * </p>
     * 
     * @param email
     *        Specifies the email address associated with this trading partner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnershipRequest withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * Specifies the phone number associated with the partnership.
     * </p>
     * 
     * @param phone
     *        Specifies the phone number associated with the partnership.
     */

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * <p>
     * Specifies the phone number associated with the partnership.
     * </p>
     * 
     * @return Specifies the phone number associated with the partnership.
     */

    public String getPhone() {
        return this.phone;
    }

    /**
     * <p>
     * Specifies the phone number associated with the partnership.
     * </p>
     * 
     * @param phone
     *        Specifies the phone number associated with the partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnershipRequest withPhone(String phone) {
        setPhone(phone);
        return this;
    }

    /**
     * <p>
     * Specifies a list of the capabilities associated with this partnership.
     * </p>
     * 
     * @return Specifies a list of the capabilities associated with this partnership.
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * Specifies a list of the capabilities associated with this partnership.
     * </p>
     * 
     * @param capabilities
     *        Specifies a list of the capabilities associated with this partnership.
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * Specifies a list of the capabilities associated with this partnership.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        Specifies a list of the capabilities associated with this partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnershipRequest withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of the capabilities associated with this partnership.
     * </p>
     * 
     * @param capabilities
     *        Specifies a list of the capabilities associated with this partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnershipRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
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

    public CreatePartnershipRequest withClientToken(String clientToken) {
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

    public CreatePartnershipRequest withTags(Tag... tags) {
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

    public CreatePartnershipRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append("***Sensitive Data Redacted***").append(",");
        if (getPhone() != null)
            sb.append("Phone: ").append("***Sensitive Data Redacted***").append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
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

        if (obj instanceof CreatePartnershipRequest == false)
            return false;
        CreatePartnershipRequest other = (CreatePartnershipRequest) obj;
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
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
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

        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getPhone() == null) ? 0 : getPhone().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePartnershipRequest clone() {
        return (CreatePartnershipRequest) super.clone();
    }

}
