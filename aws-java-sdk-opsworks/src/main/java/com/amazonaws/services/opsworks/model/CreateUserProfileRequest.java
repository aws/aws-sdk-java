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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user's IAM ARN; this can also be a federated user's ARN.
     * </p>
     */
    private String iamUserArn;
    /**
     * <p>
     * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name
     * includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, <code>my.name</code> will be
     * changed to <code>myname</code>. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from
     * the IAM user name.
     * </p>
     */
    private String sshUsername;
    /**
     * <p>
     * The user's public SSH key.
     * </p>
     */
    private String sshPublicKey;
    /**
     * <p>
     * Whether users can specify their own SSH public key through the My Settings page. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html">Setting an IAM User's
     * Public SSH Key</a>.
     * </p>
     */
    private Boolean allowSelfManagement;

    /**
     * <p>
     * The user's IAM ARN; this can also be a federated user's ARN.
     * </p>
     * 
     * @param iamUserArn
     *        The user's IAM ARN; this can also be a federated user's ARN.
     */

    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    /**
     * <p>
     * The user's IAM ARN; this can also be a federated user's ARN.
     * </p>
     * 
     * @return The user's IAM ARN; this can also be a federated user's ARN.
     */

    public String getIamUserArn() {
        return this.iamUserArn;
    }

    /**
     * <p>
     * The user's IAM ARN; this can also be a federated user's ARN.
     * </p>
     * 
     * @param iamUserArn
     *        The user's IAM ARN; this can also be a federated user's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withIamUserArn(String iamUserArn) {
        setIamUserArn(iamUserArn);
        return this;
    }

    /**
     * <p>
     * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name
     * includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, <code>my.name</code> will be
     * changed to <code>myname</code>. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from
     * the IAM user name.
     * </p>
     * 
     * @param sshUsername
     *        The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified
     *        name includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, <code>my.name</code>
     *        will be changed to <code>myname</code>. If you do not specify an SSH user name, AWS OpsWorks Stacks
     *        generates one from the IAM user name.
     */

    public void setSshUsername(String sshUsername) {
        this.sshUsername = sshUsername;
    }

    /**
     * <p>
     * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name
     * includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, <code>my.name</code> will be
     * changed to <code>myname</code>. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from
     * the IAM user name.
     * </p>
     * 
     * @return The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the
     *         specified name includes other punctuation marks, AWS OpsWorks Stacks removes them. For example,
     *         <code>my.name</code> will be changed to <code>myname</code>. If you do not specify an SSH user name, AWS
     *         OpsWorks Stacks generates one from the IAM user name.
     */

    public String getSshUsername() {
        return this.sshUsername;
    }

    /**
     * <p>
     * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name
     * includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, <code>my.name</code> will be
     * changed to <code>myname</code>. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from
     * the IAM user name.
     * </p>
     * 
     * @param sshUsername
     *        The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified
     *        name includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, <code>my.name</code>
     *        will be changed to <code>myname</code>. If you do not specify an SSH user name, AWS OpsWorks Stacks
     *        generates one from the IAM user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withSshUsername(String sshUsername) {
        setSshUsername(sshUsername);
        return this;
    }

    /**
     * <p>
     * The user's public SSH key.
     * </p>
     * 
     * @param sshPublicKey
     *        The user's public SSH key.
     */

    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * <p>
     * The user's public SSH key.
     * </p>
     * 
     * @return The user's public SSH key.
     */

    public String getSshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * <p>
     * The user's public SSH key.
     * </p>
     * 
     * @param sshPublicKey
     *        The user's public SSH key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withSshPublicKey(String sshPublicKey) {
        setSshPublicKey(sshPublicKey);
        return this;
    }

    /**
     * <p>
     * Whether users can specify their own SSH public key through the My Settings page. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html">Setting an IAM User's
     * Public SSH Key</a>.
     * </p>
     * 
     * @param allowSelfManagement
     *        Whether users can specify their own SSH public key through the My Settings page. For more information, see
     *        <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html">Setting an IAM
     *        User's Public SSH Key</a>.
     */

    public void setAllowSelfManagement(Boolean allowSelfManagement) {
        this.allowSelfManagement = allowSelfManagement;
    }

    /**
     * <p>
     * Whether users can specify their own SSH public key through the My Settings page. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html">Setting an IAM User's
     * Public SSH Key</a>.
     * </p>
     * 
     * @return Whether users can specify their own SSH public key through the My Settings page. For more information,
     *         see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html">Setting an
     *         IAM User's Public SSH Key</a>.
     */

    public Boolean getAllowSelfManagement() {
        return this.allowSelfManagement;
    }

    /**
     * <p>
     * Whether users can specify their own SSH public key through the My Settings page. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html">Setting an IAM User's
     * Public SSH Key</a>.
     * </p>
     * 
     * @param allowSelfManagement
     *        Whether users can specify their own SSH public key through the My Settings page. For more information, see
     *        <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html">Setting an IAM
     *        User's Public SSH Key</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withAllowSelfManagement(Boolean allowSelfManagement) {
        setAllowSelfManagement(allowSelfManagement);
        return this;
    }

    /**
     * <p>
     * Whether users can specify their own SSH public key through the My Settings page. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html">Setting an IAM User's
     * Public SSH Key</a>.
     * </p>
     * 
     * @return Whether users can specify their own SSH public key through the My Settings page. For more information,
     *         see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-settingsshkey.html">Setting an
     *         IAM User's Public SSH Key</a>.
     */

    public Boolean isAllowSelfManagement() {
        return this.allowSelfManagement;
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
        if (getIamUserArn() != null)
            sb.append("IamUserArn: ").append(getIamUserArn()).append(",");
        if (getSshUsername() != null)
            sb.append("SshUsername: ").append(getSshUsername()).append(",");
        if (getSshPublicKey() != null)
            sb.append("SshPublicKey: ").append(getSshPublicKey()).append(",");
        if (getAllowSelfManagement() != null)
            sb.append("AllowSelfManagement: ").append(getAllowSelfManagement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserProfileRequest == false)
            return false;
        CreateUserProfileRequest other = (CreateUserProfileRequest) obj;
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null)
            return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false)
            return false;
        if (other.getSshUsername() == null ^ this.getSshUsername() == null)
            return false;
        if (other.getSshUsername() != null && other.getSshUsername().equals(this.getSshUsername()) == false)
            return false;
        if (other.getSshPublicKey() == null ^ this.getSshPublicKey() == null)
            return false;
        if (other.getSshPublicKey() != null && other.getSshPublicKey().equals(this.getSshPublicKey()) == false)
            return false;
        if (other.getAllowSelfManagement() == null ^ this.getAllowSelfManagement() == null)
            return false;
        if (other.getAllowSelfManagement() != null && other.getAllowSelfManagement().equals(this.getAllowSelfManagement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode());
        hashCode = prime * hashCode + ((getSshUsername() == null) ? 0 : getSshUsername().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKey() == null) ? 0 : getSshPublicKey().hashCode());
        hashCode = prime * hashCode + ((getAllowSelfManagement() == null) ? 0 : getAllowSelfManagement().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserProfileRequest clone() {
        return (CreateUserProfileRequest) super.clone();
    }

}
