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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to delete user attributes as an administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDeleteUserAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminDeleteUserAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where you want to delete user attributes.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The user name of the user from which you would like to delete attributes.
     * </p>
     */
    private String username;
    /**
     * <p>
     * An array of strings representing the user attribute names you wish to delete.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     */
    private java.util.List<String> userAttributeNames;

    /**
     * <p>
     * The user pool ID for the user pool where you want to delete user attributes.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to delete user attributes.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to delete user attributes.
     * </p>
     * 
     * @return The user pool ID for the user pool where you want to delete user attributes.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to delete user attributes.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to delete user attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminDeleteUserAttributesRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The user name of the user from which you would like to delete attributes.
     * </p>
     * 
     * @param username
     *        The user name of the user from which you would like to delete attributes.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user from which you would like to delete attributes.
     * </p>
     * 
     * @return The user name of the user from which you would like to delete attributes.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name of the user from which you would like to delete attributes.
     * </p>
     * 
     * @param username
     *        The user name of the user from which you would like to delete attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminDeleteUserAttributesRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * An array of strings representing the user attribute names you wish to delete.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * 
     * @return An array of strings representing the user attribute names you wish to delete.</p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     */

    public java.util.List<String> getUserAttributeNames() {
        return userAttributeNames;
    }

    /**
     * <p>
     * An array of strings representing the user attribute names you wish to delete.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * 
     * @param userAttributeNames
     *        An array of strings representing the user attribute names you wish to delete.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     */

    public void setUserAttributeNames(java.util.Collection<String> userAttributeNames) {
        if (userAttributeNames == null) {
            this.userAttributeNames = null;
            return;
        }

        this.userAttributeNames = new java.util.ArrayList<String>(userAttributeNames);
    }

    /**
     * <p>
     * An array of strings representing the user attribute names you wish to delete.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAttributeNames(java.util.Collection)} or {@link #withUserAttributeNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param userAttributeNames
     *        An array of strings representing the user attribute names you wish to delete.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminDeleteUserAttributesRequest withUserAttributeNames(String... userAttributeNames) {
        if (this.userAttributeNames == null) {
            setUserAttributeNames(new java.util.ArrayList<String>(userAttributeNames.length));
        }
        for (String ele : userAttributeNames) {
            this.userAttributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings representing the user attribute names you wish to delete.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * 
     * @param userAttributeNames
     *        An array of strings representing the user attribute names you wish to delete.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminDeleteUserAttributesRequest withUserAttributeNames(java.util.Collection<String> userAttributeNames) {
        setUserAttributeNames(userAttributeNames);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserAttributeNames() != null)
            sb.append("UserAttributeNames: ").append(getUserAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminDeleteUserAttributesRequest == false)
            return false;
        AdminDeleteUserAttributesRequest other = (AdminDeleteUserAttributesRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserAttributeNames() == null ^ this.getUserAttributeNames() == null)
            return false;
        if (other.getUserAttributeNames() != null && other.getUserAttributeNames().equals(this.getUserAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getUserAttributeNames() == null) ? 0 : getUserAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public AdminDeleteUserAttributesRequest clone() {
        return (AdminDeleteUserAttributesRequest) super.clone();
    }

}
