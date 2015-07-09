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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateSSHPublicKey(UpdateSSHPublicKeyRequest) UpdateSSHPublicKey operation}.
 * <p>
 * Sets the status of the specified SSH public key to active or inactive.
 * SSH public keys that are inactive cannot be used for authentication.
 * This action can be used to disable a user's SSH public key as part of
 * a key rotation work flow.
 * </p>
 * <p>
 * The SSH public key affected by this action is used only for
 * authenticating the associated IAM user to an AWS CodeCommit
 * repository. For more information about using SSH keys to authenticate
 * to an AWS CodeCommit repository, see
 * <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"> Set up AWS CodeCommit for SSH Connections </a>
 * in the <i>AWS CodeCommit User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateSSHPublicKey(UpdateSSHPublicKeyRequest)
 */
public class UpdateSSHPublicKeyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The status to assign to the SSH public key. <code>Active</code> means
     * the key can be used for authentication with an AWS CodeCommit
     * repository. <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

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
    public UpdateSSHPublicKeyRequest withUserName(String userName) {
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
    public UpdateSSHPublicKeyRequest withSSHPublicKeyId(String sSHPublicKeyId) {
        this.sSHPublicKeyId = sSHPublicKeyId;
        return this;
    }

    /**
     * The status to assign to the SSH public key. <code>Active</code> means
     * the key can be used for authentication with an AWS CodeCommit
     * repository. <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return The status to assign to the SSH public key. <code>Active</code> means
     *         the key can be used for authentication with an AWS CodeCommit
     *         repository. <code>Inactive</code> means the key cannot be used.
     *
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status to assign to the SSH public key. <code>Active</code> means
     * the key can be used for authentication with an AWS CodeCommit
     * repository. <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status to assign to the SSH public key. <code>Active</code> means
     *         the key can be used for authentication with an AWS CodeCommit
     *         repository. <code>Inactive</code> means the key cannot be used.
     *
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status to assign to the SSH public key. <code>Active</code> means
     * the key can be used for authentication with an AWS CodeCommit
     * repository. <code>Inactive</code> means the key cannot be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status to assign to the SSH public key. <code>Active</code> means
     *         the key can be used for authentication with an AWS CodeCommit
     *         repository. <code>Inactive</code> means the key cannot be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StatusType
     */
    public UpdateSSHPublicKeyRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status to assign to the SSH public key. <code>Active</code> means
     * the key can be used for authentication with an AWS CodeCommit
     * repository. <code>Inactive</code> means the key cannot be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status to assign to the SSH public key. <code>Active</code> means
     *         the key can be used for authentication with an AWS CodeCommit
     *         repository. <code>Inactive</code> means the key cannot be used.
     *
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }
    
    /**
     * The status to assign to the SSH public key. <code>Active</code> means
     * the key can be used for authentication with an AWS CodeCommit
     * repository. <code>Inactive</code> means the key cannot be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status The status to assign to the SSH public key. <code>Active</code> means
     *         the key can be used for authentication with an AWS CodeCommit
     *         repository. <code>Inactive</code> means the key cannot be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StatusType
     */
    public UpdateSSHPublicKeyRequest withStatus(StatusType status) {
        this.status = status.toString();
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
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateSSHPublicKeyRequest == false) return false;
        UpdateSSHPublicKeyRequest other = (UpdateSSHPublicKeyRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getSSHPublicKeyId() == null ^ this.getSSHPublicKeyId() == null) return false;
        if (other.getSSHPublicKeyId() != null && other.getSSHPublicKeyId().equals(this.getSSHPublicKeyId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateSSHPublicKeyRequest clone() {
        
            return (UpdateSSHPublicKeyRequest) super.clone();
    }

}
    