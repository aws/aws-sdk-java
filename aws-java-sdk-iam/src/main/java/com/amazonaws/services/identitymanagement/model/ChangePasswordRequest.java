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
public class ChangePasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IAM user's current password.
     * </p>
     */
    private String oldPassword;
    /**
     * <p>
     * The new password. The new password must conform to the AWS account's password policy, if one exists.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of almost any printable ASCII character from the space ( ) through the end of the ASCII character
     * range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( ) characters. Although any
     * of these characters are valid in a password, note that many tools, such as the AWS Management Console, might
     * restrict the ability to enter certain characters because they have special meaning within that tool.
     * </p>
     */
    private String newPassword;

    /**
     * <p>
     * The IAM user's current password.
     * </p>
     * 
     * @param oldPassword
     *        The IAM user's current password.
     */

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    /**
     * <p>
     * The IAM user's current password.
     * </p>
     * 
     * @return The IAM user's current password.
     */

    public String getOldPassword() {
        return this.oldPassword;
    }

    /**
     * <p>
     * The IAM user's current password.
     * </p>
     * 
     * @param oldPassword
     *        The IAM user's current password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangePasswordRequest withOldPassword(String oldPassword) {
        setOldPassword(oldPassword);
        return this;
    }

    /**
     * <p>
     * The new password. The new password must conform to the AWS account's password policy, if one exists.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of almost any printable ASCII character from the space ( ) through the end of the ASCII character
     * range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( ) characters. Although any
     * of these characters are valid in a password, note that many tools, such as the AWS Management Console, might
     * restrict the ability to enter certain characters because they have special meaning within that tool.
     * </p>
     * 
     * @param newPassword
     *        The new password. The new password must conform to the AWS account's password policy, if one exists.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of almost any printable ASCII character from the space ( ) through the end of the
     *        ASCII character range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( )
     *        characters. Although any of these characters are valid in a password, note that many tools, such as the
     *        AWS Management Console, might restrict the ability to enter certain characters because they have special
     *        meaning within that tool.
     */

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * <p>
     * The new password. The new password must conform to the AWS account's password policy, if one exists.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of almost any printable ASCII character from the space ( ) through the end of the ASCII character
     * range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( ) characters. Although any
     * of these characters are valid in a password, note that many tools, such as the AWS Management Console, might
     * restrict the ability to enter certain characters because they have special meaning within that tool.
     * </p>
     * 
     * @return The new password. The new password must conform to the AWS account's password policy, if one exists.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters consisting of almost any printable ASCII character from the space ( ) through the end of the
     *         ASCII character range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( )
     *         characters. Although any of these characters are valid in a password, note that many tools, such as the
     *         AWS Management Console, might restrict the ability to enter certain characters because they have special
     *         meaning within that tool.
     */

    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * <p>
     * The new password. The new password must conform to the AWS account's password policy, if one exists.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of almost any printable ASCII character from the space ( ) through the end of the ASCII character
     * range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( ) characters. Although any
     * of these characters are valid in a password, note that many tools, such as the AWS Management Console, might
     * restrict the ability to enter certain characters because they have special meaning within that tool.
     * </p>
     * 
     * @param newPassword
     *        The new password. The new password must conform to the AWS account's password policy, if one exists.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of almost any printable ASCII character from the space ( ) through the end of the
     *        ASCII character range (\u00FF). You can also include the tab ( ), line feed ( ), and carriage return ( )
     *        characters. Although any of these characters are valid in a password, note that many tools, such as the
     *        AWS Management Console, might restrict the ability to enter certain characters because they have special
     *        meaning within that tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangePasswordRequest withNewPassword(String newPassword) {
        setNewPassword(newPassword);
        return this;
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
        if (getOldPassword() != null)
            sb.append("OldPassword: " + getOldPassword() + ",");
        if (getNewPassword() != null)
            sb.append("NewPassword: " + getNewPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangePasswordRequest == false)
            return false;
        ChangePasswordRequest other = (ChangePasswordRequest) obj;
        if (other.getOldPassword() == null ^ this.getOldPassword() == null)
            return false;
        if (other.getOldPassword() != null && other.getOldPassword().equals(this.getOldPassword()) == false)
            return false;
        if (other.getNewPassword() == null ^ this.getNewPassword() == null)
            return false;
        if (other.getNewPassword() != null && other.getNewPassword().equals(this.getNewPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOldPassword() == null) ? 0 : getOldPassword().hashCode());
        hashCode = prime * hashCode + ((getNewPassword() == null) ? 0 : getNewPassword().hashCode());
        return hashCode;
    }

    @Override
    public ChangePasswordRequest clone() {
        return (ChangePasswordRequest) super.clone();
    }
}
