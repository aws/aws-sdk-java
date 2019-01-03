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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This response identifies the user, server they belong to, and the identifier of the SSH public key associated with
 * that user. A user can have more than one key on each server that they are associate with.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportSshPublicKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportSshPublicKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * This identifier is the name given to a public key by the system that was imported.
     * </p>
     */
    private String sshPublicKeyId;
    /**
     * <p>
     * A user name assigned to the <code>ServerID</code> value that you specified.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server.
     * </p>
     * 
     * @return A system-assigned unique identifier for an SFTP server.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSshPublicKeyResult withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * This identifier is the name given to a public key by the system that was imported.
     * </p>
     * 
     * @param sshPublicKeyId
     *        This identifier is the name given to a public key by the system that was imported.
     */

    public void setSshPublicKeyId(String sshPublicKeyId) {
        this.sshPublicKeyId = sshPublicKeyId;
    }

    /**
     * <p>
     * This identifier is the name given to a public key by the system that was imported.
     * </p>
     * 
     * @return This identifier is the name given to a public key by the system that was imported.
     */

    public String getSshPublicKeyId() {
        return this.sshPublicKeyId;
    }

    /**
     * <p>
     * This identifier is the name given to a public key by the system that was imported.
     * </p>
     * 
     * @param sshPublicKeyId
     *        This identifier is the name given to a public key by the system that was imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSshPublicKeyResult withSshPublicKeyId(String sshPublicKeyId) {
        setSshPublicKeyId(sshPublicKeyId);
        return this;
    }

    /**
     * <p>
     * A user name assigned to the <code>ServerID</code> value that you specified.
     * </p>
     * 
     * @param userName
     *        A user name assigned to the <code>ServerID</code> value that you specified.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * A user name assigned to the <code>ServerID</code> value that you specified.
     * </p>
     * 
     * @return A user name assigned to the <code>ServerID</code> value that you specified.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * A user name assigned to the <code>ServerID</code> value that you specified.
     * </p>
     * 
     * @param userName
     *        A user name assigned to the <code>ServerID</code> value that you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSshPublicKeyResult withUserName(String userName) {
        setUserName(userName);
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getSshPublicKeyId() != null)
            sb.append("SshPublicKeyId: ").append(getSshPublicKeyId()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportSshPublicKeyResult == false)
            return false;
        ImportSshPublicKeyResult other = (ImportSshPublicKeyResult) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getSshPublicKeyId() == null ^ this.getSshPublicKeyId() == null)
            return false;
        if (other.getSshPublicKeyId() != null && other.getSshPublicKeyId().equals(this.getSshPublicKeyId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKeyId() == null) ? 0 : getSshPublicKeyId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public ImportSshPublicKeyResult clone() {
        try {
            return (ImportSshPublicKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
