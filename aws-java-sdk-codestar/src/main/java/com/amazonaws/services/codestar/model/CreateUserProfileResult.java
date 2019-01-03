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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user in IAM.
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
     * The SSH public key associated with the user in AWS CodeStar. This is the public portion of the public/private
     * keypair the user can use to access project resources if a project owner allows the user remote access to those
     * resources.
     * </p>
     */
    private String sshPublicKey;
    /**
     * <p>
     * The date the user profile was created, in timestamp format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The date the user profile was last modified, in timestamp format.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user in IAM.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user in IAM.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user in IAM.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user in IAM.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user in IAM.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user in IAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileResult withUserArn(String userArn) {
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

    public CreateUserProfileResult withDisplayName(String displayName) {
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

    public CreateUserProfileResult withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The SSH public key associated with the user in AWS CodeStar. This is the public portion of the public/private
     * keypair the user can use to access project resources if a project owner allows the user remote access to those
     * resources.
     * </p>
     * 
     * @param sshPublicKey
     *        The SSH public key associated with the user in AWS CodeStar. This is the public portion of the
     *        public/private keypair the user can use to access project resources if a project owner allows the user
     *        remote access to those resources.
     */

    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * <p>
     * The SSH public key associated with the user in AWS CodeStar. This is the public portion of the public/private
     * keypair the user can use to access project resources if a project owner allows the user remote access to those
     * resources.
     * </p>
     * 
     * @return The SSH public key associated with the user in AWS CodeStar. This is the public portion of the
     *         public/private keypair the user can use to access project resources if a project owner allows the user
     *         remote access to those resources.
     */

    public String getSshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * <p>
     * The SSH public key associated with the user in AWS CodeStar. This is the public portion of the public/private
     * keypair the user can use to access project resources if a project owner allows the user remote access to those
     * resources.
     * </p>
     * 
     * @param sshPublicKey
     *        The SSH public key associated with the user in AWS CodeStar. This is the public portion of the
     *        public/private keypair the user can use to access project resources if a project owner allows the user
     *        remote access to those resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileResult withSshPublicKey(String sshPublicKey) {
        setSshPublicKey(sshPublicKey);
        return this;
    }

    /**
     * <p>
     * The date the user profile was created, in timestamp format.
     * </p>
     * 
     * @param createdTimestamp
     *        The date the user profile was created, in timestamp format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The date the user profile was created, in timestamp format.
     * </p>
     * 
     * @return The date the user profile was created, in timestamp format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The date the user profile was created, in timestamp format.
     * </p>
     * 
     * @param createdTimestamp
     *        The date the user profile was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The date the user profile was last modified, in timestamp format.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The date the user profile was last modified, in timestamp format.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The date the user profile was last modified, in timestamp format.
     * </p>
     * 
     * @return The date the user profile was last modified, in timestamp format.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The date the user profile was last modified, in timestamp format.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The date the user profile was last modified, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileResult withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
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
            sb.append("SshPublicKey: ").append(getSshPublicKey()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserProfileResult == false)
            return false;
        CreateUserProfileResult other = (CreateUserProfileResult) obj;
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
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
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
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserProfileResult clone() {
        try {
            return (CreateUserProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
