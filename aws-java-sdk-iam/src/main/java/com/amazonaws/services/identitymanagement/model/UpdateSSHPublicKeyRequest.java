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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateSSHPublicKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSSHPublicKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     */
    private String sSHPublicKeyId;
    /**
     * <p>
     * The status to assign to the SSH public key. <code>Active</code> means that the key can be used for authentication
     * with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the SSH public key.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the IAM user associated with the SSH public key.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the SSH public key.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSSHPublicKeyRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @param sSHPublicKeyId
     *        The unique identifier for the SSH public key.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     */

    public void setSSHPublicKeyId(String sSHPublicKeyId) {
        this.sSHPublicKeyId = sSHPublicKeyId;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @return The unique identifier for the SSH public key.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters that can consist of any upper or lowercased letter or digit.
     */

    public String getSSHPublicKeyId() {
        return this.sSHPublicKeyId;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @param sSHPublicKeyId
     *        The unique identifier for the SSH public key.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSSHPublicKeyRequest withSSHPublicKeyId(String sSHPublicKeyId) {
        setSSHPublicKeyId(sSHPublicKeyId);
        return this;
    }

    /**
     * <p>
     * The status to assign to the SSH public key. <code>Active</code> means that the key can be used for authentication
     * with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status to assign to the SSH public key. <code>Active</code> means that the key can be used for
     *        authentication with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status to assign to the SSH public key. <code>Active</code> means that the key can be used for authentication
     * with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @return The status to assign to the SSH public key. <code>Active</code> means that the key can be used for
     *         authentication with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be
     *         used.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status to assign to the SSH public key. <code>Active</code> means that the key can be used for authentication
     * with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status to assign to the SSH public key. <code>Active</code> means that the key can be used for
     *        authentication with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public UpdateSSHPublicKeyRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status to assign to the SSH public key. <code>Active</code> means that the key can be used for authentication
     * with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status to assign to the SSH public key. <code>Active</code> means that the key can be used for
     *        authentication with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * @see StatusType
     */

    public void setStatus(StatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status to assign to the SSH public key. <code>Active</code> means that the key can be used for authentication
     * with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status to assign to the SSH public key. <code>Active</code> means that the key can be used for
     *        authentication with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public UpdateSSHPublicKeyRequest withStatus(StatusType status) {
        this.status = status.toString();
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getSSHPublicKeyId() != null)
            sb.append("SSHPublicKeyId: ").append(getSSHPublicKeyId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSSHPublicKeyRequest == false)
            return false;
        UpdateSSHPublicKeyRequest other = (UpdateSSHPublicKeyRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSSHPublicKeyId() == null ^ this.getSSHPublicKeyId() == null)
            return false;
        if (other.getSSHPublicKeyId() != null && other.getSSHPublicKeyId().equals(this.getSSHPublicKeyId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getSSHPublicKeyId() == null) ? 0 : getSSHPublicKeyId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSSHPublicKeyRequest clone() {
        return (UpdateSSHPublicKeyRequest) super.clone();
    }

}
