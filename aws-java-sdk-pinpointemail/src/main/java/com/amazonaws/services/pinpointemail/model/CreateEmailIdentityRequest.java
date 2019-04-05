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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to begin the verification process for an email identity (an email address or domain).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateEmailIdentity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEmailIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email address or domain that you want to verify.
     * </p>
     */
    private String emailIdentity;
    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the email identity.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The email address or domain that you want to verify.
     * </p>
     * 
     * @param emailIdentity
     *        The email address or domain that you want to verify.
     */

    public void setEmailIdentity(String emailIdentity) {
        this.emailIdentity = emailIdentity;
    }

    /**
     * <p>
     * The email address or domain that you want to verify.
     * </p>
     * 
     * @return The email address or domain that you want to verify.
     */

    public String getEmailIdentity() {
        return this.emailIdentity;
    }

    /**
     * <p>
     * The email address or domain that you want to verify.
     * </p>
     * 
     * @param emailIdentity
     *        The email address or domain that you want to verify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailIdentityRequest withEmailIdentity(String emailIdentity) {
        setEmailIdentity(emailIdentity);
        return this;
    }

    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the email identity.
     * </p>
     * 
     * @return An object that defines the tags (keys and values) that you want to associate with the email identity.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the email identity.
     * </p>
     * 
     * @param tags
     *        An object that defines the tags (keys and values) that you want to associate with the email identity.
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
     * An object that defines the tags (keys and values) that you want to associate with the email identity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An object that defines the tags (keys and values) that you want to associate with the email identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailIdentityRequest withTags(Tag... tags) {
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
     * An object that defines the tags (keys and values) that you want to associate with the email identity.
     * </p>
     * 
     * @param tags
     *        An object that defines the tags (keys and values) that you want to associate with the email identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailIdentityRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getEmailIdentity() != null)
            sb.append("EmailIdentity: ").append(getEmailIdentity()).append(",");
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

        if (obj instanceof CreateEmailIdentityRequest == false)
            return false;
        CreateEmailIdentityRequest other = (CreateEmailIdentityRequest) obj;
        if (other.getEmailIdentity() == null ^ this.getEmailIdentity() == null)
            return false;
        if (other.getEmailIdentity() != null && other.getEmailIdentity().equals(this.getEmailIdentity()) == false)
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

        hashCode = prime * hashCode + ((getEmailIdentity() == null) ? 0 : getEmailIdentity().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEmailIdentityRequest clone() {
        return (CreateEmailIdentityRequest) super.clone();
    }

}
