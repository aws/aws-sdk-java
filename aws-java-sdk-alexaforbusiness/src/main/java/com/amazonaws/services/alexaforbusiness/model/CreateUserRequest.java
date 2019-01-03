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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN for the user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The first name for the user.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name for the user.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The email address for the user.
     * </p>
     */
    private String email;
    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags for the user.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN for the user.
     * </p>
     * 
     * @param userId
     *        The ARN for the user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ARN for the user.
     * </p>
     * 
     * @return The ARN for the user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ARN for the user.
     * </p>
     * 
     * @param userId
     *        The ARN for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The first name for the user.
     * </p>
     * 
     * @param firstName
     *        The first name for the user.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name for the user.
     * </p>
     * 
     * @return The first name for the user.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name for the user.
     * </p>
     * 
     * @param firstName
     *        The first name for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name for the user.
     * </p>
     * 
     * @param lastName
     *        The last name for the user.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name for the user.
     * </p>
     * 
     * @return The last name for the user.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name for the user.
     * </p>
     * 
     * @param lastName
     *        The last name for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The email address for the user.
     * </p>
     * 
     * @param email
     *        The email address for the user.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address for the user.
     * </p>
     * 
     * @return The email address for the user.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address for the user.
     * </p>
     * 
     * @param email
     *        The email address for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for this request that ensures idempotency.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @return A unique, user-specified identifier for this request that ensures idempotency.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for this request that ensures idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags for the user.
     * </p>
     * 
     * @return The tags for the user.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the user.
     * </p>
     * 
     * @param tags
     *        The tags for the user.
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
     * The tags for the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withTags(Tag... tags) {
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
     * The tags for the user.
     * </p>
     * 
     * @param tags
     *        The tags for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append(getFirstName()).append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append(getLastName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
