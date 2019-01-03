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
 * Contains the response to a successful <a>UploadSSHPublicKey</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UploadSSHPublicKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadSSHPublicKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains information about the SSH public key.
     * </p>
     */
    private SSHPublicKey sSHPublicKey;

    /**
     * <p>
     * Contains information about the SSH public key.
     * </p>
     * 
     * @param sSHPublicKey
     *        Contains information about the SSH public key.
     */

    public void setSSHPublicKey(SSHPublicKey sSHPublicKey) {
        this.sSHPublicKey = sSHPublicKey;
    }

    /**
     * <p>
     * Contains information about the SSH public key.
     * </p>
     * 
     * @return Contains information about the SSH public key.
     */

    public SSHPublicKey getSSHPublicKey() {
        return this.sSHPublicKey;
    }

    /**
     * <p>
     * Contains information about the SSH public key.
     * </p>
     * 
     * @param sSHPublicKey
     *        Contains information about the SSH public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadSSHPublicKeyResult withSSHPublicKey(SSHPublicKey sSHPublicKey) {
        setSSHPublicKey(sSHPublicKey);
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
        if (getSSHPublicKey() != null)
            sb.append("SSHPublicKey: ").append(getSSHPublicKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadSSHPublicKeyResult == false)
            return false;
        UploadSSHPublicKeyResult other = (UploadSSHPublicKeyResult) obj;
        if (other.getSSHPublicKey() == null ^ this.getSSHPublicKey() == null)
            return false;
        if (other.getSSHPublicKey() != null && other.getSSHPublicKey().equals(this.getSSHPublicKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSSHPublicKey() == null) ? 0 : getSSHPublicKey().hashCode());
        return hashCode;
    }

    @Override
    public UploadSSHPublicKeyResult clone() {
        try {
            return (UploadSSHPublicKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
