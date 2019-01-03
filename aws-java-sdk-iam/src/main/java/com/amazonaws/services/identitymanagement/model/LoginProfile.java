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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the user name and password create date for a user.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>CreateLoginProfile</a> and <a>GetLoginProfile</a> operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/LoginProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoginProfile implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user, which can be used for signing in to the AWS Management Console.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The date when the password for the user was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * Specifies whether the user is required to set a new password on next sign-in.
     * </p>
     */
    private Boolean passwordResetRequired;

    /**
     * Default constructor for LoginProfile object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public LoginProfile() {
    }

    /**
     * Constructs a new LoginProfile object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName
     *        The name of the user, which can be used for signing in to the AWS Management Console.
     * @param createDate
     *        The date when the password for the user was created.
     */
    public LoginProfile(String userName, java.util.Date createDate) {
        setUserName(userName);
        setCreateDate(createDate);
    }

    /**
     * <p>
     * The name of the user, which can be used for signing in to the AWS Management Console.
     * </p>
     * 
     * @param userName
     *        The name of the user, which can be used for signing in to the AWS Management Console.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user, which can be used for signing in to the AWS Management Console.
     * </p>
     * 
     * @return The name of the user, which can be used for signing in to the AWS Management Console.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user, which can be used for signing in to the AWS Management Console.
     * </p>
     * 
     * @param userName
     *        The name of the user, which can be used for signing in to the AWS Management Console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginProfile withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The date when the password for the user was created.
     * </p>
     * 
     * @param createDate
     *        The date when the password for the user was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date when the password for the user was created.
     * </p>
     * 
     * @return The date when the password for the user was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date when the password for the user was created.
     * </p>
     * 
     * @param createDate
     *        The date when the password for the user was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginProfile withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user is required to set a new password on next sign-in.
     * </p>
     * 
     * @param passwordResetRequired
     *        Specifies whether the user is required to set a new password on next sign-in.
     */

    public void setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
    }

    /**
     * <p>
     * Specifies whether the user is required to set a new password on next sign-in.
     * </p>
     * 
     * @return Specifies whether the user is required to set a new password on next sign-in.
     */

    public Boolean getPasswordResetRequired() {
        return this.passwordResetRequired;
    }

    /**
     * <p>
     * Specifies whether the user is required to set a new password on next sign-in.
     * </p>
     * 
     * @param passwordResetRequired
     *        Specifies whether the user is required to set a new password on next sign-in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginProfile withPasswordResetRequired(Boolean passwordResetRequired) {
        setPasswordResetRequired(passwordResetRequired);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user is required to set a new password on next sign-in.
     * </p>
     * 
     * @return Specifies whether the user is required to set a new password on next sign-in.
     */

    public Boolean isPasswordResetRequired() {
        return this.passwordResetRequired;
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getPasswordResetRequired() != null)
            sb.append("PasswordResetRequired: ").append(getPasswordResetRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoginProfile == false)
            return false;
        LoginProfile other = (LoginProfile) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getPasswordResetRequired() == null ^ this.getPasswordResetRequired() == null)
            return false;
        if (other.getPasswordResetRequired() != null && other.getPasswordResetRequired().equals(this.getPasswordResetRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getPasswordResetRequired() == null) ? 0 : getPasswordResetRequired().hashCode());
        return hashCode;
    }

    @Override
    public LoginProfile clone() {
        try {
            return (LoginProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
