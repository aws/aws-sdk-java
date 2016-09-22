/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateLoginProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user to create a password for. The user must already exist.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of almost any printable ASCII character from the space ( ) through the end of the ASCII character
     * range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( ) characters. Although any
     * of these characters are valid in a password, note that many tools, such as the AWS Management Console, might
     * restrict the ability to enter certain characters because they have special meaning within that tool.
     * </p>
     */
    private String password;
    /**
     * <p>
     * Specifies whether the user is required to set a new password on next sign-in.
     * </p>
     */
    private Boolean passwordResetRequired;

    /**
     * Default constructor for CreateLoginProfileRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateLoginProfileRequest() {
    }

    /**
     * Constructs a new CreateLoginProfileRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param userName
     *        The name of the IAM user to create a password for. The user must already exist.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     * @param password
     *        The new password for the user.
     *        </p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of almost any printable ASCII character from the space ( ) through the end of the
     *        ASCII character range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( )
     *        characters. Although any of these characters are valid in a password, note that many tools, such as the
     *        AWS Management Console, might restrict the ability to enter certain characters because they have special
     *        meaning within that tool.
     */
    public CreateLoginProfileRequest(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    /**
     * <p>
     * The name of the IAM user to create a password for. The user must already exist.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user to create a password for. The user must already exist.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user to create a password for. The user must already exist.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @return The name of the IAM user to create a password for. The user must already exist.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *         any of the following characters: =,.@-
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user to create a password for. The user must already exist.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user to create a password for. The user must already exist.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoginProfileRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of almost any printable ASCII character from the space ( ) through the end of the ASCII character
     * range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( ) characters. Although any
     * of these characters are valid in a password, note that many tools, such as the AWS Management Console, might
     * restrict the ability to enter certain characters because they have special meaning within that tool.
     * </p>
     * 
     * @param password
     *        The new password for the user.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of almost any printable ASCII character from the space ( ) through the end of the
     *        ASCII character range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( )
     *        characters. Although any of these characters are valid in a password, note that many tools, such as the
     *        AWS Management Console, might restrict the ability to enter certain characters because they have special
     *        meaning within that tool.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of almost any printable ASCII character from the space ( ) through the end of the ASCII character
     * range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( ) characters. Although any
     * of these characters are valid in a password, note that many tools, such as the AWS Management Console, might
     * restrict the ability to enter certain characters because they have special meaning within that tool.
     * </p>
     * 
     * @return The new password for the user.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters consisting of almost any printable ASCII character from the space ( ) through the end of the
     *         ASCII character range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( )
     *         characters. Although any of these characters are valid in a password, note that many tools, such as the
     *         AWS Management Console, might restrict the ability to enter certain characters because they have special
     *         meaning within that tool.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of almost any printable ASCII character from the space ( ) through the end of the ASCII character
     * range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( ) characters. Although any
     * of these characters are valid in a password, note that many tools, such as the AWS Management Console, might
     * restrict the ability to enter certain characters because they have special meaning within that tool.
     * </p>
     * 
     * @param password
     *        The new password for the user.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of almost any printable ASCII character from the space ( ) through the end of the
     *        ASCII character range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( )
     *        characters. Although any of these characters are valid in a password, note that many tools, such as the
     *        AWS Management Console, might restrict the ability to enter certain characters because they have special
     *        meaning within that tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoginProfileRequest withPassword(String password) {
        setPassword(password);
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

    public CreateLoginProfileRequest withPasswordResetRequired(Boolean passwordResetRequired) {
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("UserName: " + getUserName() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getPasswordResetRequired() != null)
            sb.append("PasswordResetRequired: " + getPasswordResetRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLoginProfileRequest == false)
            return false;
        CreateLoginProfileRequest other = (CreateLoginProfileRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
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
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPasswordResetRequired() == null) ? 0 : getPasswordResetRequired().hashCode());
        return hashCode;
    }

    @Override
    public CreateLoginProfileRequest clone() {
        return (CreateLoginProfileRequest) super.clone();
    }
}
