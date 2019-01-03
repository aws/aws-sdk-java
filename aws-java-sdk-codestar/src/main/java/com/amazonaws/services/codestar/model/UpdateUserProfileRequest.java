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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that will be displayed as the friendly name for the user in AWS CodeStar.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The name that is displayed as the friendly name for the user in AWS CodeStar.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The email address that is displayed as part of the user's profile in AWS CodeStar.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to
     * project resources, this public key will be used along with the user's private key for SSH access.
     * </p>
     */
    private String sshPublicKey;

    /**
     * <p>
     * The name that will be displayed as the friendly name for the user in AWS CodeStar.
     * </p>
     * 
     * @param userArn
     *        The name that will be displayed as the friendly name for the user in AWS CodeStar.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The name that will be displayed as the friendly name for the user in AWS CodeStar.
     * </p>
     * 
     * @return The name that will be displayed as the friendly name for the user in AWS CodeStar.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The name that will be displayed as the friendly name for the user in AWS CodeStar.
     * </p>
     * 
     * @param userArn
     *        The name that will be displayed as the friendly name for the user in AWS CodeStar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserProfileRequest withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The name that is displayed as the friendly name for the user in AWS CodeStar.
     * </p>
     * 
     * @param displayName
     *        The name that is displayed as the friendly name for the user in AWS CodeStar.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name that is displayed as the friendly name for the user in AWS CodeStar.
     * </p>
     * 
     * @return The name that is displayed as the friendly name for the user in AWS CodeStar.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name that is displayed as the friendly name for the user in AWS CodeStar.
     * </p>
     * 
     * @param displayName
     *        The name that is displayed as the friendly name for the user in AWS CodeStar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserProfileRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The email address that is displayed as part of the user's profile in AWS CodeStar.
     * </p>
     * 
     * @param emailAddress
     *        The email address that is displayed as part of the user's profile in AWS CodeStar.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address that is displayed as part of the user's profile in AWS CodeStar.
     * </p>
     * 
     * @return The email address that is displayed as part of the user's profile in AWS CodeStar.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address that is displayed as part of the user's profile in AWS CodeStar.
     * </p>
     * 
     * @param emailAddress
     *        The email address that is displayed as part of the user's profile in AWS CodeStar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserProfileRequest withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to
     * project resources, this public key will be used along with the user's private key for SSH access.
     * </p>
     * 
     * @param sshPublicKey
     *        The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote
     *        access to project resources, this public key will be used along with the user's private key for SSH
     *        access.
     */

    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * <p>
     * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to
     * project resources, this public key will be used along with the user's private key for SSH access.
     * </p>
     * 
     * @return The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote
     *         access to project resources, this public key will be used along with the user's private key for SSH
     *         access.
     */

    public String getSshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * <p>
     * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to
     * project resources, this public key will be used along with the user's private key for SSH access.
     * </p>
     * 
     * @param sshPublicKey
     *        The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote
     *        access to project resources, this public key will be used along with the user's private key for SSH
     *        access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserProfileRequest withSshPublicKey(String sshPublicKey) {
        setSshPublicKey(sshPublicKey);
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
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getSshPublicKey() != null)
            sb.append("SshPublicKey: ").append(getSshPublicKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserProfileRequest == false)
            return false;
        UpdateUserProfileRequest other = (UpdateUserProfileRequest) obj;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getSshPublicKey() == null ^ this.getSshPublicKey() == null)
            return false;
        if (other.getSshPublicKey() != null && other.getSshPublicKey().equals(this.getSshPublicKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKey() == null) ? 0 : getSshPublicKey().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserProfileRequest clone() {
        return (UpdateUserProfileRequest) super.clone();
    }

}
