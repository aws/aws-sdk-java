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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes stack or user permissions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/Permission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Permission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information about
     * IAM ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     */
    private String iamUserArn;
    /**
     * <p>
     * Whether the user can use SSH.
     * </p>
     */
    private Boolean allowSsh;
    /**
     * <p>
     * Whether the user can use <b>sudo</b>.
     * </p>
     */
    private Boolean allowSudo;
    /**
     * <p>
     * The user's permission level, which must be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deny</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>show</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deploy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam_only</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on the permissions associated with these levels, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>
     * </p>
     */
    private String level;

    /**
     * <p>
     * A stack ID.
     * </p>
     * 
     * @param stackId
     *        A stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * A stack ID.
     * </p>
     * 
     * @return A stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * A stack ID.
     * </p>
     * 
     * @param stackId
     *        A stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information about
     * IAM ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     * 
     * @param iamUserArn
     *        The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information
     *        about IAM ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *        Identifiers</a>.
     */

    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information about
     * IAM ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information
     *         about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     */

    public String getIamUserArn() {
        return this.iamUserArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information about
     * IAM ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * </p>
     * 
     * @param iamUserArn
     *        The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information
     *        about IAM ARNs, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *        Identifiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withIamUserArn(String iamUserArn) {
        setIamUserArn(iamUserArn);
        return this;
    }

    /**
     * <p>
     * Whether the user can use SSH.
     * </p>
     * 
     * @param allowSsh
     *        Whether the user can use SSH.
     */

    public void setAllowSsh(Boolean allowSsh) {
        this.allowSsh = allowSsh;
    }

    /**
     * <p>
     * Whether the user can use SSH.
     * </p>
     * 
     * @return Whether the user can use SSH.
     */

    public Boolean getAllowSsh() {
        return this.allowSsh;
    }

    /**
     * <p>
     * Whether the user can use SSH.
     * </p>
     * 
     * @param allowSsh
     *        Whether the user can use SSH.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withAllowSsh(Boolean allowSsh) {
        setAllowSsh(allowSsh);
        return this;
    }

    /**
     * <p>
     * Whether the user can use SSH.
     * </p>
     * 
     * @return Whether the user can use SSH.
     */

    public Boolean isAllowSsh() {
        return this.allowSsh;
    }

    /**
     * <p>
     * Whether the user can use <b>sudo</b>.
     * </p>
     * 
     * @param allowSudo
     *        Whether the user can use <b>sudo</b>.
     */

    public void setAllowSudo(Boolean allowSudo) {
        this.allowSudo = allowSudo;
    }

    /**
     * <p>
     * Whether the user can use <b>sudo</b>.
     * </p>
     * 
     * @return Whether the user can use <b>sudo</b>.
     */

    public Boolean getAllowSudo() {
        return this.allowSudo;
    }

    /**
     * <p>
     * Whether the user can use <b>sudo</b>.
     * </p>
     * 
     * @param allowSudo
     *        Whether the user can use <b>sudo</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withAllowSudo(Boolean allowSudo) {
        setAllowSudo(allowSudo);
        return this;
    }

    /**
     * <p>
     * Whether the user can use <b>sudo</b>.
     * </p>
     * 
     * @return Whether the user can use <b>sudo</b>.
     */

    public Boolean isAllowSudo() {
        return this.allowSudo;
    }

    /**
     * <p>
     * The user's permission level, which must be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deny</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>show</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deploy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam_only</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on the permissions associated with these levels, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>
     * </p>
     * 
     * @param level
     *        The user's permission level, which must be the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deny</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>show</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deploy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manage</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam_only</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on the permissions associated with these levels, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     *        Permissions</a>
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The user's permission level, which must be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deny</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>show</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deploy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam_only</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on the permissions associated with these levels, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>
     * </p>
     * 
     * @return The user's permission level, which must be the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>deny</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>show</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deploy</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>manage</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>iam_only</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information on the permissions associated with these levels, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     *         Permissions</a>
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The user's permission level, which must be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deny</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>show</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deploy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam_only</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on the permissions associated with these levels, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>
     * </p>
     * 
     * @param level
     *        The user's permission level, which must be the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deny</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>show</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deploy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manage</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam_only</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on the permissions associated with these levels, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     *        Permissions</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Permission withLevel(String level) {
        setLevel(level);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getIamUserArn() != null)
            sb.append("IamUserArn: ").append(getIamUserArn()).append(",");
        if (getAllowSsh() != null)
            sb.append("AllowSsh: ").append(getAllowSsh()).append(",");
        if (getAllowSudo() != null)
            sb.append("AllowSudo: ").append(getAllowSudo()).append(",");
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Permission == false)
            return false;
        Permission other = (Permission) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null)
            return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false)
            return false;
        if (other.getAllowSsh() == null ^ this.getAllowSsh() == null)
            return false;
        if (other.getAllowSsh() != null && other.getAllowSsh().equals(this.getAllowSsh()) == false)
            return false;
        if (other.getAllowSudo() == null ^ this.getAllowSudo() == null)
            return false;
        if (other.getAllowSudo() != null && other.getAllowSudo().equals(this.getAllowSudo()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode());
        hashCode = prime * hashCode + ((getAllowSsh() == null) ? 0 : getAllowSsh().hashCode());
        hashCode = prime * hashCode + ((getAllowSudo() == null) ? 0 : getAllowSudo().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return hashCode;
    }

    @Override
    public Permission clone() {
        try {
            return (Permission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.PermissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
