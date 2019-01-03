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

/**
 * <p>
 * Contains information about an SSH public key, without the key's body or fingerprint.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>ListSSHPublicKeys</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/SSHPublicKeyMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SSHPublicKeyMetadata implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     */
    private String sSHPublicKeyId;
    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key can be used for authentication with an
     * AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the SSH public
     * key was uploaded.
     * </p>
     */
    private java.util.Date uploadDate;

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the SSH public key.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * 
     * @return The name of the IAM user associated with the SSH public key.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the SSH public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSHPublicKeyMetadata withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * 
     * @param sSHPublicKeyId
     *        The unique identifier for the SSH public key.
     */

    public void setSSHPublicKeyId(String sSHPublicKeyId) {
        this.sSHPublicKeyId = sSHPublicKeyId;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * 
     * @return The unique identifier for the SSH public key.
     */

    public String getSSHPublicKeyId() {
        return this.sSHPublicKeyId;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * 
     * @param sSHPublicKeyId
     *        The unique identifier for the SSH public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSHPublicKeyMetadata withSSHPublicKeyId(String sSHPublicKeyId) {
        setSSHPublicKeyId(sSHPublicKeyId);
        return this;
    }

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key can be used for authentication with an
     * AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status of the SSH public key. <code>Active</code> means that the key can be used for authentication
     *        with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key can be used for authentication with an
     * AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @return The status of the SSH public key. <code>Active</code> means that the key can be used for authentication
     *         with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key can be used for authentication with an
     * AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status of the SSH public key. <code>Active</code> means that the key can be used for authentication
     *        with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public SSHPublicKeyMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key can be used for authentication with an
     * AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status of the SSH public key. <code>Active</code> means that the key can be used for authentication
     *        with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * @see StatusType
     */

    public void setStatus(StatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key can be used for authentication with an
     * AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * </p>
     * 
     * @param status
     *        The status of the SSH public key. <code>Active</code> means that the key can be used for authentication
     *        with an AWS CodeCommit repository. <code>Inactive</code> means that the key cannot be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public SSHPublicKeyMetadata withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the SSH public
     * key was uploaded.
     * </p>
     * 
     * @param uploadDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the SSH
     *        public key was uploaded.
     */

    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the SSH public
     * key was uploaded.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         SSH public key was uploaded.
     */

    public java.util.Date getUploadDate() {
        return this.uploadDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the SSH public
     * key was uploaded.
     * </p>
     * 
     * @param uploadDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the SSH
     *        public key was uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSHPublicKeyMetadata withUploadDate(java.util.Date uploadDate) {
        setUploadDate(uploadDate);
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
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUploadDate() != null)
            sb.append("UploadDate: ").append(getUploadDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSHPublicKeyMetadata == false)
            return false;
        SSHPublicKeyMetadata other = (SSHPublicKeyMetadata) obj;
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
        if (other.getUploadDate() == null ^ this.getUploadDate() == null)
            return false;
        if (other.getUploadDate() != null && other.getUploadDate().equals(this.getUploadDate()) == false)
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
        hashCode = prime * hashCode + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode());
        return hashCode;
    }

    @Override
    public SSHPublicKeyMetadata clone() {
        try {
            return (SSHPublicKeyMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
