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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the public Secure Shell (SSH) key that is associated with a user account for a specific
 * server (as identified by <code>ServerId</code>). The information returned includes the date the key was imported, the
 * public key contents, and the public key ID. A user can store more than one SSH public key associated with their user
 * name on a specific SFTP server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/SshPublicKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SshPublicKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date that the public key was added to the user account.
     * </p>
     */
    private java.util.Date dateImported;
    /**
     * <p>
     * The content of the SSH public key as specified by the <code>PublicKeyId</code>.
     * </p>
     */
    private String sshPublicKeyBody;
    /**
     * <p>
     * The <code>SshPublicKeyId</code> parameter contains the identifier of the public key.
     * </p>
     */
    private String sshPublicKeyId;

    /**
     * <p>
     * The date that the public key was added to the user account.
     * </p>
     * 
     * @param dateImported
     *        The date that the public key was added to the user account.
     */

    public void setDateImported(java.util.Date dateImported) {
        this.dateImported = dateImported;
    }

    /**
     * <p>
     * The date that the public key was added to the user account.
     * </p>
     * 
     * @return The date that the public key was added to the user account.
     */

    public java.util.Date getDateImported() {
        return this.dateImported;
    }

    /**
     * <p>
     * The date that the public key was added to the user account.
     * </p>
     * 
     * @param dateImported
     *        The date that the public key was added to the user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SshPublicKey withDateImported(java.util.Date dateImported) {
        setDateImported(dateImported);
        return this;
    }

    /**
     * <p>
     * The content of the SSH public key as specified by the <code>PublicKeyId</code>.
     * </p>
     * 
     * @param sshPublicKeyBody
     *        The content of the SSH public key as specified by the <code>PublicKeyId</code>.
     */

    public void setSshPublicKeyBody(String sshPublicKeyBody) {
        this.sshPublicKeyBody = sshPublicKeyBody;
    }

    /**
     * <p>
     * The content of the SSH public key as specified by the <code>PublicKeyId</code>.
     * </p>
     * 
     * @return The content of the SSH public key as specified by the <code>PublicKeyId</code>.
     */

    public String getSshPublicKeyBody() {
        return this.sshPublicKeyBody;
    }

    /**
     * <p>
     * The content of the SSH public key as specified by the <code>PublicKeyId</code>.
     * </p>
     * 
     * @param sshPublicKeyBody
     *        The content of the SSH public key as specified by the <code>PublicKeyId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SshPublicKey withSshPublicKeyBody(String sshPublicKeyBody) {
        setSshPublicKeyBody(sshPublicKeyBody);
        return this;
    }

    /**
     * <p>
     * The <code>SshPublicKeyId</code> parameter contains the identifier of the public key.
     * </p>
     * 
     * @param sshPublicKeyId
     *        The <code>SshPublicKeyId</code> parameter contains the identifier of the public key.
     */

    public void setSshPublicKeyId(String sshPublicKeyId) {
        this.sshPublicKeyId = sshPublicKeyId;
    }

    /**
     * <p>
     * The <code>SshPublicKeyId</code> parameter contains the identifier of the public key.
     * </p>
     * 
     * @return The <code>SshPublicKeyId</code> parameter contains the identifier of the public key.
     */

    public String getSshPublicKeyId() {
        return this.sshPublicKeyId;
    }

    /**
     * <p>
     * The <code>SshPublicKeyId</code> parameter contains the identifier of the public key.
     * </p>
     * 
     * @param sshPublicKeyId
     *        The <code>SshPublicKeyId</code> parameter contains the identifier of the public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SshPublicKey withSshPublicKeyId(String sshPublicKeyId) {
        setSshPublicKeyId(sshPublicKeyId);
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
        if (getDateImported() != null)
            sb.append("DateImported: ").append(getDateImported()).append(",");
        if (getSshPublicKeyBody() != null)
            sb.append("SshPublicKeyBody: ").append(getSshPublicKeyBody()).append(",");
        if (getSshPublicKeyId() != null)
            sb.append("SshPublicKeyId: ").append(getSshPublicKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SshPublicKey == false)
            return false;
        SshPublicKey other = (SshPublicKey) obj;
        if (other.getDateImported() == null ^ this.getDateImported() == null)
            return false;
        if (other.getDateImported() != null && other.getDateImported().equals(this.getDateImported()) == false)
            return false;
        if (other.getSshPublicKeyBody() == null ^ this.getSshPublicKeyBody() == null)
            return false;
        if (other.getSshPublicKeyBody() != null && other.getSshPublicKeyBody().equals(this.getSshPublicKeyBody()) == false)
            return false;
        if (other.getSshPublicKeyId() == null ^ this.getSshPublicKeyId() == null)
            return false;
        if (other.getSshPublicKeyId() != null && other.getSshPublicKeyId().equals(this.getSshPublicKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDateImported() == null) ? 0 : getDateImported().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKeyBody() == null) ? 0 : getSshPublicKeyBody().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKeyId() == null) ? 0 : getSshPublicKeyId().hashCode());
        return hashCode;
    }

    @Override
    public SshPublicKey clone() {
        try {
            return (SshPublicKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.SshPublicKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
