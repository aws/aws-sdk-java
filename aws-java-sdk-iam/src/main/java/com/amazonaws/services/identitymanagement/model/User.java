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

/**
 * <p>
 * Contains information about an IAM user entity.
 * </p>
 * <p>
 * This data type is used as a response element in the following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateUser</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetUser</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListUsers</a>
 * </p>
 * </li>
 * </ul>
 */
public class User implements Serializable, Cloneable {

    /**
     * <p>
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The stable and unique string identifying the user. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in
     * policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user was
     * created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user's
     * password was last used to sign in to an AWS website. For a list of AWS websites that capture a user's last
     * sign-in time, see the <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Credential Reports</a> topic in
     * the <i>Using IAM</i> guide. If a password is used more than once in a five-minute span, only the first use is
     * returned in this field. This field is null (not present) when:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have a password
     * </p>
     * </li>
     * <li>
     * <p>
     * The password exists but has never been used (at least not since IAM started tracking this information on October
     * 20th, 2014
     * </p>
     * </li>
     * <li>
     * <p>
     * there is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value is returned only in the <a>GetUser</a> and <a>ListUsers</a> actions.
     * </p>
     */
    private java.util.Date passwordLastUsed;

    /**
     * Default constructor for User object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public User() {
    }

    /**
     * Constructs a new User object. Callers should use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param path
     *        The path to the user. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @param userName
     *        The friendly name identifying the user.
     * @param userId
     *        The stable and unique string identifying the user. For more information about IDs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @param arn
     *        The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use
     *        ARNs in policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *        Identifiers</a> in the <i>Using IAM</i> guide.
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        user was created.
     */
    public User(String path, String userName, String userId, String arn, java.util.Date createDate) {
        setPath(path);
        setUserName(userName);
        setUserId(userId);
        setArn(arn);
        setCreateDate(createDate);
    }

    /**
     * <p>
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the user. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @return The path to the user. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the user. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the user. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @param userName
     *        The friendly name identifying the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @return The friendly name identifying the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * 
     * @param userName
     *        The friendly name identifying the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param userId
     *        The stable and unique string identifying the user. For more information about IDs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @return The stable and unique string identifying the user. For more information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>Using
     * IAM</i> guide.
     * </p>
     * 
     * @param userId
     *        The stable and unique string identifying the user. For more information about IDs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in
     * policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use
     *        ARNs in policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *        Identifiers</a> in the <i>Using IAM</i> guide.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in
     * policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use
     *         ARNs in policies, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in
     * policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use
     *        ARNs in policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     *        Identifiers</a> in the <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        user was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user was
     * created.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         user was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user was
     * created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        user was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user's
     * password was last used to sign in to an AWS website. For a list of AWS websites that capture a user's last
     * sign-in time, see the <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Credential Reports</a> topic in
     * the <i>Using IAM</i> guide. If a password is used more than once in a five-minute span, only the first use is
     * returned in this field. This field is null (not present) when:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have a password
     * </p>
     * </li>
     * <li>
     * <p>
     * The password exists but has never been used (at least not since IAM started tracking this information on October
     * 20th, 2014
     * </p>
     * </li>
     * <li>
     * <p>
     * there is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value is returned only in the <a>GetUser</a> and <a>ListUsers</a> actions.
     * </p>
     * 
     * @param passwordLastUsed
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        user's password was last used to sign in to an AWS website. For a list of AWS websites that capture a
     *        user's last sign-in time, see the <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Credential Reports</a>
     *        topic in the <i>Using IAM</i> guide. If a password is used more than once in a five-minute span, only the
     *        first use is returned in this field. This field is null (not present) when:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The user does not have a password
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The password exists but has never been used (at least not since IAM started tracking this information on
     *        October 20th, 2014
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        there is no sign-in data associated with the user
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value is returned only in the <a>GetUser</a> and <a>ListUsers</a> actions.
     */

    public void setPasswordLastUsed(java.util.Date passwordLastUsed) {
        this.passwordLastUsed = passwordLastUsed;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user's
     * password was last used to sign in to an AWS website. For a list of AWS websites that capture a user's last
     * sign-in time, see the <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Credential Reports</a> topic in
     * the <i>Using IAM</i> guide. If a password is used more than once in a five-minute span, only the first use is
     * returned in this field. This field is null (not present) when:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have a password
     * </p>
     * </li>
     * <li>
     * <p>
     * The password exists but has never been used (at least not since IAM started tracking this information on October
     * 20th, 2014
     * </p>
     * </li>
     * <li>
     * <p>
     * there is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value is returned only in the <a>GetUser</a> and <a>ListUsers</a> actions.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         user's password was last used to sign in to an AWS website. For a list of AWS websites that capture a
     *         user's last sign-in time, see the <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Credential Reports</a>
     *         topic in the <i>Using IAM</i> guide. If a password is used more than once in a five-minute span, only the
     *         first use is returned in this field. This field is null (not present) when:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The user does not have a password
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The password exists but has never been used (at least not since IAM started tracking this information on
     *         October 20th, 2014
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         there is no sign-in data associated with the user
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This value is returned only in the <a>GetUser</a> and <a>ListUsers</a> actions.
     */

    public java.util.Date getPasswordLastUsed() {
        return this.passwordLastUsed;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the user's
     * password was last used to sign in to an AWS website. For a list of AWS websites that capture a user's last
     * sign-in time, see the <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Credential Reports</a> topic in
     * the <i>Using IAM</i> guide. If a password is used more than once in a five-minute span, only the first use is
     * returned in this field. This field is null (not present) when:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have a password
     * </p>
     * </li>
     * <li>
     * <p>
     * The password exists but has never been used (at least not since IAM started tracking this information on October
     * 20th, 2014
     * </p>
     * </li>
     * <li>
     * <p>
     * there is no sign-in data associated with the user
     * </p>
     * </li>
     * </ul>
     * <p>
     * This value is returned only in the <a>GetUser</a> and <a>ListUsers</a> actions.
     * </p>
     * 
     * @param passwordLastUsed
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        user's password was last used to sign in to an AWS website. For a list of AWS websites that capture a
     *        user's last sign-in time, see the <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Credential Reports</a>
     *        topic in the <i>Using IAM</i> guide. If a password is used more than once in a five-minute span, only the
     *        first use is returned in this field. This field is null (not present) when:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The user does not have a password
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The password exists but has never been used (at least not since IAM started tracking this information on
     *        October 20th, 2014
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        there is no sign-in data associated with the user
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This value is returned only in the <a>GetUser</a> and <a>ListUsers</a> actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withPasswordLastUsed(java.util.Date passwordLastUsed) {
        setPasswordLastUsed(passwordLastUsed);
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getPasswordLastUsed() != null)
            sb.append("PasswordLastUsed: " + getPasswordLastUsed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getPasswordLastUsed() == null ^ this.getPasswordLastUsed() == null)
            return false;
        if (other.getPasswordLastUsed() != null && other.getPasswordLastUsed().equals(this.getPasswordLastUsed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getPasswordLastUsed() == null) ? 0 : getPasswordLastUsed().hashCode());
        return hashCode;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
