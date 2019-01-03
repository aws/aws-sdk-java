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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DescribeUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The display name shown for the user in AWS CodeStar projects. For example, this could be set to both first and
     * last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon
     * associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first
     * character that appears after the space will be used as the second character in the user initial icon. The initial
     * icon displays a maximum of two characters, so a display name with more than one space (for example
     * "Mary Jane Major") would generate an initial icon using the first character and the first character after the
     * space ("MJ", not "MM").
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The email address for the user. Optional.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The SSH public key associated with the user. This SSH public key is associated with the user profile, and can be
     * used in conjunction with the associated private key for access to project resources, such as Amazon EC2
     * instances, if a project owner grants remote access to those resources.
     * </p>
     */
    private String sshPublicKey;
    /**
     * <p>
     * The date and time when the user profile was created in AWS CodeStar, in timestamp format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The date and time when the user profile was last modified, in timestamp format.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The display name shown for the user in AWS CodeStar projects. For example, this could be set to both first and
     * last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon
     * associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first
     * character that appears after the space will be used as the second character in the user initial icon. The initial
     * icon displays a maximum of two characters, so a display name with more than one space (for example
     * "Mary Jane Major") would generate an initial icon using the first character and the first character after the
     * space ("MJ", not "MM").
     * </p>
     * 
     * @param displayName
     *        The display name shown for the user in AWS CodeStar projects. For example, this could be set to both first
     *        and last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the
     *        initial icon associated with the user in AWS CodeStar projects. If spaces are included in the display
     *        name, the first character that appears after the space will be used as the second character in the user
     *        initial icon. The initial icon displays a maximum of two characters, so a display name with more than one
     *        space (for example "Mary Jane Major") would generate an initial icon using the first character and the
     *        first character after the space ("MJ", not "MM").
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name shown for the user in AWS CodeStar projects. For example, this could be set to both first and
     * last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon
     * associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first
     * character that appears after the space will be used as the second character in the user initial icon. The initial
     * icon displays a maximum of two characters, so a display name with more than one space (for example
     * "Mary Jane Major") would generate an initial icon using the first character and the first character after the
     * space ("MJ", not "MM").
     * </p>
     * 
     * @return The display name shown for the user in AWS CodeStar projects. For example, this could be set to both
     *         first and last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate
     *         the initial icon associated with the user in AWS CodeStar projects. If spaces are included in the display
     *         name, the first character that appears after the space will be used as the second character in the user
     *         initial icon. The initial icon displays a maximum of two characters, so a display name with more than one
     *         space (for example "Mary Jane Major") would generate an initial icon using the first character and the
     *         first character after the space ("MJ", not "MM").
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name shown for the user in AWS CodeStar projects. For example, this could be set to both first and
     * last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon
     * associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first
     * character that appears after the space will be used as the second character in the user initial icon. The initial
     * icon displays a maximum of two characters, so a display name with more than one space (for example
     * "Mary Jane Major") would generate an initial icon using the first character and the first character after the
     * space ("MJ", not "MM").
     * </p>
     * 
     * @param displayName
     *        The display name shown for the user in AWS CodeStar projects. For example, this could be set to both first
     *        and last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the
     *        initial icon associated with the user in AWS CodeStar projects. If spaces are included in the display
     *        name, the first character that appears after the space will be used as the second character in the user
     *        initial icon. The initial icon displays a maximum of two characters, so a display name with more than one
     *        space (for example "Mary Jane Major") would generate an initial icon using the first character and the
     *        first character after the space ("MJ", not "MM").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The email address for the user. Optional.
     * </p>
     * 
     * @param emailAddress
     *        The email address for the user. Optional.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address for the user. Optional.
     * </p>
     * 
     * @return The email address for the user. Optional.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address for the user. Optional.
     * </p>
     * 
     * @param emailAddress
     *        The email address for the user. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The SSH public key associated with the user. This SSH public key is associated with the user profile, and can be
     * used in conjunction with the associated private key for access to project resources, such as Amazon EC2
     * instances, if a project owner grants remote access to those resources.
     * </p>
     * 
     * @param sshPublicKey
     *        The SSH public key associated with the user. This SSH public key is associated with the user profile, and
     *        can be used in conjunction with the associated private key for access to project resources, such as Amazon
     *        EC2 instances, if a project owner grants remote access to those resources.
     */

    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * <p>
     * The SSH public key associated with the user. This SSH public key is associated with the user profile, and can be
     * used in conjunction with the associated private key for access to project resources, such as Amazon EC2
     * instances, if a project owner grants remote access to those resources.
     * </p>
     * 
     * @return The SSH public key associated with the user. This SSH public key is associated with the user profile, and
     *         can be used in conjunction with the associated private key for access to project resources, such as
     *         Amazon EC2 instances, if a project owner grants remote access to those resources.
     */

    public String getSshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * <p>
     * The SSH public key associated with the user. This SSH public key is associated with the user profile, and can be
     * used in conjunction with the associated private key for access to project resources, such as Amazon EC2
     * instances, if a project owner grants remote access to those resources.
     * </p>
     * 
     * @param sshPublicKey
     *        The SSH public key associated with the user. This SSH public key is associated with the user profile, and
     *        can be used in conjunction with the associated private key for access to project resources, such as Amazon
     *        EC2 instances, if a project owner grants remote access to those resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withSshPublicKey(String sshPublicKey) {
        setSshPublicKey(sshPublicKey);
        return this;
    }

    /**
     * <p>
     * The date and time when the user profile was created in AWS CodeStar, in timestamp format.
     * </p>
     * 
     * @param createdTimestamp
     *        The date and time when the user profile was created in AWS CodeStar, in timestamp format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The date and time when the user profile was created in AWS CodeStar, in timestamp format.
     * </p>
     * 
     * @return The date and time when the user profile was created in AWS CodeStar, in timestamp format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The date and time when the user profile was created in AWS CodeStar, in timestamp format.
     * </p>
     * 
     * @param createdTimestamp
     *        The date and time when the user profile was created in AWS CodeStar, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time when the user profile was last modified, in timestamp format.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The date and time when the user profile was last modified, in timestamp format.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The date and time when the user profile was last modified, in timestamp format.
     * </p>
     * 
     * @return The date and time when the user profile was last modified, in timestamp format.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The date and time when the user profile was last modified, in timestamp format.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The date and time when the user profile was last modified, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileResult withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
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

        if (obj instanceof DescribeUserProfileResult == false)
            return false;
        DescribeUserProfileResult other = (DescribeUserProfileResult) obj;
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
    public DescribeUserProfileResult clone() {
        try {
            return (DescribeUserProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
