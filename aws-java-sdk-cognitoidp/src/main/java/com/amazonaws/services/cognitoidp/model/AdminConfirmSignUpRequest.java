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
 * Represents the request to confirm user registration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminConfirmSignUp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminConfirmSignUpRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for which you want to confirm user registration.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The user name for which you want to confirm user registration.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The user pool ID for which you want to confirm user registration.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for which you want to confirm user registration.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for which you want to confirm user registration.
     * </p>
     * 
     * @return The user pool ID for which you want to confirm user registration.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for which you want to confirm user registration.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for which you want to confirm user registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminConfirmSignUpRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The user name for which you want to confirm user registration.
     * </p>
     * 
     * @param username
     *        The user name for which you want to confirm user registration.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name for which you want to confirm user registration.
     * </p>
     * 
     * @return The user name for which you want to confirm user registration.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name for which you want to confirm user registration.
     * </p>
     * 
     * @param username
     *        The user name for which you want to confirm user registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminConfirmSignUpRequest withUsername(String username) {
        setUsername(username);
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
            sb.append("Username: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminConfirmSignUpRequest == false)
            return false;
        AdminConfirmSignUpRequest other = (AdminConfirmSignUpRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public AdminConfirmSignUpRequest clone() {
        return (AdminConfirmSignUpRequest) super.clone();
    }

}
