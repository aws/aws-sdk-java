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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserPassword" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminSetUserPasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String userPoolId;

    private String username;

    private String password;

    private Boolean permanent;

    /**
     * @param userPoolId
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * @return
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * @param userPoolId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminSetUserPasswordRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * @param username
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * @param username
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminSetUserPasswordRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * @param password
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * @param password
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminSetUserPasswordRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * @param permanent
     */

    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    /**
     * @return
     */

    public Boolean getPermanent() {
        return this.permanent;
    }

    /**
     * @param permanent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminSetUserPasswordRequest withPermanent(Boolean permanent) {
        setPermanent(permanent);
        return this;
    }

    /**
     * @return
     */

    public Boolean isPermanent() {
        return this.permanent;
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
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getPermanent() != null)
            sb.append("Permanent: ").append(getPermanent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminSetUserPasswordRequest == false)
            return false;
        AdminSetUserPasswordRequest other = (AdminSetUserPasswordRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPermanent() == null ^ this.getPermanent() == null)
            return false;
        if (other.getPermanent() != null && other.getPermanent().equals(this.getPermanent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPermanent() == null) ? 0 : getPermanent().hashCode());
        return hashCode;
    }

    @Override
    public AdminSetUserPasswordRequest clone() {
        return (AdminSetUserPasswordRequest) super.clone();
    }

}
