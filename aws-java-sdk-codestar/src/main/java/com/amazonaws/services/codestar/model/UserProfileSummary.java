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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a user's profile in AWS CodeStar.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UserProfileSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserProfileSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user in IAM.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The display name of a user in AWS CodeStar. For example, this could be set to both first and last name
     * ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated
     * with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that
     * appears after the space will be used as the second character in the user initial icon. The initial icon displays
     * a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would
     * generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The email address associated with the user.
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

    public UserProfileSummary withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The display name of a user in AWS CodeStar. For example, this could be set to both first and last name
     * ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated
     * with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that
     * appears after the space will be used as the second character in the user initial icon. The initial icon displays
     * a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would
     * generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
     * </p>
     * 
     * @param displayName
     *        The display name of a user in AWS CodeStar. For example, this could be set to both first and last name
     *        ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon
     *        associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first
     *        character that appears after the space will be used as the second character in the user initial icon. The
     *        initial icon displays a maximum of two characters, so a display name with more than one space (for example
     *        "Mary Jane Major") would generate an initial icon using the first character and the first character after
     *        the space ("MJ", not "MM").
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of a user in AWS CodeStar. For example, this could be set to both first and last name
     * ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated
     * with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that
     * appears after the space will be used as the second character in the user initial icon. The initial icon displays
     * a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would
     * generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
     * </p>
     * 
     * @return The display name of a user in AWS CodeStar. For example, this could be set to both first and last name
     *         ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon
     *         associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first
     *         character that appears after the space will be used as the second character in the user initial icon. The
     *         initial icon displays a maximum of two characters, so a display name with more than one space (for
     *         example "Mary Jane Major") would generate an initial icon using the first character and the first
     *         character after the space ("MJ", not "MM").
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of a user in AWS CodeStar. For example, this could be set to both first and last name
     * ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated
     * with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that
     * appears after the space will be used as the second character in the user initial icon. The initial icon displays
     * a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would
     * generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
     * </p>
     * 
     * @param displayName
     *        The display name of a user in AWS CodeStar. For example, this could be set to both first and last name
     *        ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon
     *        associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first
     *        character that appears after the space will be used as the second character in the user initial icon. The
     *        initial icon displays a maximum of two characters, so a display name with more than one space (for example
     *        "Mary Jane Major") would generate an initial icon using the first character and the first character after
     *        the space ("MJ", not "MM").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserProfileSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The email address associated with the user.
     * </p>
     * 
     * @param emailAddress
     *        The email address associated with the user.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address associated with the user.
     * </p>
     * 
     * @return The email address associated with the user.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address associated with the user.
     * </p>
     * 
     * @param emailAddress
     *        The email address associated with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserProfileSummary withEmailAddress(String emailAddress) {
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

    public UserProfileSummary withSshPublicKey(String sshPublicKey) {
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

        if (obj instanceof UserProfileSummary == false)
            return false;
        UserProfileSummary other = (UserProfileSummary) obj;
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
    public UserProfileSummary clone() {
        try {
            return (UserProfileSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestar.model.transform.UserProfileSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
