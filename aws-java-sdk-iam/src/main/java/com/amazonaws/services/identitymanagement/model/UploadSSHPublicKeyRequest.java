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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#uploadSSHPublicKey(UploadSSHPublicKeyRequest) UploadSSHPublicKey operation}.
 * <p>
 * Uploads an SSH public key and associates it with the specified IAM
 * user.
 * </p>
 * <p>
 * The SSH public key uploaded by this action can be used only for
 * authenticating the associated IAM user to an AWS CodeCommit
 * repository. For more information about using SSH keys to authenticate
 * to an AWS CodeCommit repository, see
 * <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"> Set up AWS CodeCommit for SSH Connections </a>
 * in the <i>AWS CodeCommit User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#uploadSSHPublicKey(UploadSSHPublicKeyRequest)
 */
public class UploadSSHPublicKeyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the IAM user to associate the SSH public key with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * The SSH public key. The public key must be encoded in ssh-rsa format
     * or PEM format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String sSHPublicKeyBody;

    /**
     * The name of the IAM user to associate the SSH public key with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return The name of the IAM user to associate the SSH public key with.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The name of the IAM user to associate the SSH public key with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName The name of the IAM user to associate the SSH public key with.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The name of the IAM user to associate the SSH public key with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName The name of the IAM user to associate the SSH public key with.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadSSHPublicKeyRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The SSH public key. The public key must be encoded in ssh-rsa format
     * or PEM format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return The SSH public key. The public key must be encoded in ssh-rsa format
     *         or PEM format.
     */
    public String getSSHPublicKeyBody() {
        return sSHPublicKeyBody;
    }
    
    /**
     * The SSH public key. The public key must be encoded in ssh-rsa format
     * or PEM format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param sSHPublicKeyBody The SSH public key. The public key must be encoded in ssh-rsa format
     *         or PEM format.
     */
    public void setSSHPublicKeyBody(String sSHPublicKeyBody) {
        this.sSHPublicKeyBody = sSHPublicKeyBody;
    }
    
    /**
     * The SSH public key. The public key must be encoded in ssh-rsa format
     * or PEM format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param sSHPublicKeyBody The SSH public key. The public key must be encoded in ssh-rsa format
     *         or PEM format.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadSSHPublicKeyRequest withSSHPublicKeyBody(String sSHPublicKeyBody) {
        this.sSHPublicKeyBody = sSHPublicKeyBody;
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
        if (getSSHPublicKeyBody() != null) sb.append("SSHPublicKeyBody: " + getSSHPublicKeyBody() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getSSHPublicKeyBody() == null) ? 0 : getSSHPublicKeyBody().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadSSHPublicKeyRequest == false) return false;
        UploadSSHPublicKeyRequest other = (UploadSSHPublicKeyRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getSSHPublicKeyBody() == null ^ this.getSSHPublicKeyBody() == null) return false;
        if (other.getSSHPublicKeyBody() != null && other.getSSHPublicKeyBody().equals(this.getSSHPublicKeyBody()) == false) return false; 
        return true;
    }
    
    @Override
    public UploadSSHPublicKeyRequest clone() {
        
            return (UploadSSHPublicKeyRequest) super.clone();
    }

}
    