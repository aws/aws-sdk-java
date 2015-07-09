/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an SSH public key.
 * </p>
 * <p>
 * This data type is used as a response element in the GetSSHPublicKey
 * and UploadSSHPublicKey actions.
 * </p>
 */
public class SSHPublicKey implements Serializable, Cloneable {

    /**
     * The name of the IAM user associated with the SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * The unique identifier for the SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String sSHPublicKeyId;

    /**
     * The MD5 message digest of the SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>48 - 48<br/>
     * <b>Pattern: </b>[:\w]+<br/>
     */
    private String fingerprint;

    /**
     * The SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String sSHPublicKeyBody;

    /**
     * The status of the SSH public key. <code>Active</code> means the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the SSH public key was uploaded.
     */
    private java.util.Date uploadDate;

    /**
     * The name of the IAM user associated with the SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return The name of the IAM user associated with the SSH public key.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The name of the IAM user associated with the SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName The name of the IAM user associated with the SSH public key.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The name of the IAM user associated with the SSH public key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName The name of the IAM user associated with the SSH public key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SSHPublicKey withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The unique identifier for the SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return The unique identifier for the SSH public key.
     */
    public String getSSHPublicKeyId() {
        return sSHPublicKeyId;
    }
    
    /**
     * The unique identifier for the SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param sSHPublicKeyId The unique identifier for the SSH public key.
     */
    public void setSSHPublicKeyId(String sSHPublicKeyId) {
        this.sSHPublicKeyId = sSHPublicKeyId;
    }
    
    /**
     * The unique identifier for the SSH public key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param sSHPublicKeyId The unique identifier for the SSH public key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SSHPublicKey withSSHPublicKeyId(String sSHPublicKeyId) {
        this.sSHPublicKeyId = sSHPublicKeyId;
        return this;
    }

    /**
     * The MD5 message digest of the SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>48 - 48<br/>
     * <b>Pattern: </b>[:\w]+<br/>
     *
     * @return The MD5 message digest of the SSH public key.
     */
    public String getFingerprint() {
        return fingerprint;
    }
    
    /**
     * The MD5 message digest of the SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>48 - 48<br/>
     * <b>Pattern: </b>[:\w]+<br/>
     *
     * @param fingerprint The MD5 message digest of the SSH public key.
     */
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }
    
    /**
     * The MD5 message digest of the SSH public key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>48 - 48<br/>
     * <b>Pattern: </b>[:\w]+<br/>
     *
     * @param fingerprint The MD5 message digest of the SSH public key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SSHPublicKey withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * The SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return The SSH public key.
     */
    public String getSSHPublicKeyBody() {
        return sSHPublicKeyBody;
    }
    
    /**
     * The SSH public key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param sSHPublicKeyBody The SSH public key.
     */
    public void setSSHPublicKeyBody(String sSHPublicKeyBody) {
        this.sSHPublicKeyBody = sSHPublicKeyBody;
    }
    
    /**
     * The SSH public key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param sSHPublicKeyBody The SSH public key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SSHPublicKey withSSHPublicKeyBody(String sSHPublicKeyBody) {
        this.sSHPublicKeyBody = sSHPublicKeyBody;
        return this;
    }

    /**
     * The status of the SSH public key. <code>Active</code> means the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return The status of the SSH public key. <code>Active</code> means the key
     *         can be used for authentication with an AWS CodeCommit repository.
     *         <code>Inactive</code> means the key cannot be used.
     *
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the SSH public key. <code>Active</code> means the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status of the SSH public key. <code>Active</code> means the key
     *         can be used for authentication with an AWS CodeCommit repository.
     *         <code>Inactive</code> means the key cannot be used.
     *
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the SSH public key. <code>Active</code> means the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means the key cannot be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status of the SSH public key. <code>Active</code> means the key
     *         can be used for authentication with an AWS CodeCommit repository.
     *         <code>Inactive</code> means the key cannot be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StatusType
     */
    public SSHPublicKey withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the SSH public key. <code>Active</code> means the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status of the SSH public key. <code>Active</code> means the key
     *         can be used for authentication with an AWS CodeCommit repository.
     *         <code>Inactive</code> means the key cannot be used.
     *
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the SSH public key. <code>Active</code> means the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means the key cannot be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status of the SSH public key. <code>Active</code> means the key
     *         can be used for authentication with an AWS CodeCommit repository.
     *         <code>Inactive</code> means the key cannot be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StatusType
     */
    public SSHPublicKey withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the SSH public key was uploaded.
     *
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the SSH public key was uploaded.
     */
    public java.util.Date getUploadDate() {
        return uploadDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the SSH public key was uploaded.
     *
     * @param uploadDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the SSH public key was uploaded.
     */
    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the SSH public key was uploaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the SSH public key was uploaded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SSHPublicKey withUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getSSHPublicKeyId() != null) sb.append("SSHPublicKeyId: " + getSSHPublicKeyId() + ",");
        if (getFingerprint() != null) sb.append("Fingerprint: " + getFingerprint() + ",");
        if (getSSHPublicKeyBody() != null) sb.append("SSHPublicKeyBody: " + getSSHPublicKeyBody() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getUploadDate() != null) sb.append("UploadDate: " + getUploadDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getSSHPublicKeyId() == null) ? 0 : getSSHPublicKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getFingerprint() == null) ? 0 : getFingerprint().hashCode()); 
        hashCode = prime * hashCode + ((getSSHPublicKeyBody() == null) ? 0 : getSSHPublicKeyBody().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SSHPublicKey == false) return false;
        SSHPublicKey other = (SSHPublicKey)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getSSHPublicKeyId() == null ^ this.getSSHPublicKeyId() == null) return false;
        if (other.getSSHPublicKeyId() != null && other.getSSHPublicKeyId().equals(this.getSSHPublicKeyId()) == false) return false; 
        if (other.getFingerprint() == null ^ this.getFingerprint() == null) return false;
        if (other.getFingerprint() != null && other.getFingerprint().equals(this.getFingerprint()) == false) return false; 
        if (other.getSSHPublicKeyBody() == null ^ this.getSSHPublicKeyBody() == null) return false;
        if (other.getSSHPublicKeyBody() != null && other.getSSHPublicKeyBody().equals(this.getSSHPublicKeyBody()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getUploadDate() == null ^ this.getUploadDate() == null) return false;
        if (other.getUploadDate() != null && other.getUploadDate().equals(this.getUploadDate()) == false) return false; 
        return true;
    }
    
    @Override
    public SSHPublicKey clone() {
        try {
            return (SSHPublicKey) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    