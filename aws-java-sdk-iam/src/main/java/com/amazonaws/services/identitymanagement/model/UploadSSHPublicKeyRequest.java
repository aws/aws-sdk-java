/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * 
 */
public class UploadSSHPublicKeyRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user to associate the SSH public key with.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The SSH public key. The public key must be encoded in ssh-rsa format or
     * PEM format.
     * </p>
     */
    private String sSHPublicKeyBody;

    /**
     * <p>
     * The name of the IAM user to associate the SSH public key with.
     * </p>
     * 
     * @param userName
     *        The name of the IAM user to associate the SSH public key with.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user to associate the SSH public key with.
     * </p>
     * 
     * @return The name of the IAM user to associate the SSH public key with.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user to associate the SSH public key with.
     * </p>
     * 
     * @param userName
     *        The name of the IAM user to associate the SSH public key with.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UploadSSHPublicKeyRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The SSH public key. The public key must be encoded in ssh-rsa format or
     * PEM format.
     * </p>
     * 
     * @param sSHPublicKeyBody
     *        The SSH public key. The public key must be encoded in ssh-rsa
     *        format or PEM format.
     */
    public void setSSHPublicKeyBody(String sSHPublicKeyBody) {
        this.sSHPublicKeyBody = sSHPublicKeyBody;
    }

    /**
     * <p>
     * The SSH public key. The public key must be encoded in ssh-rsa format or
     * PEM format.
     * </p>
     * 
     * @return The SSH public key. The public key must be encoded in ssh-rsa
     *         format or PEM format.
     */
    public String getSSHPublicKeyBody() {
        return this.sSHPublicKeyBody;
    }

    /**
     * <p>
     * The SSH public key. The public key must be encoded in ssh-rsa format or
     * PEM format.
     * </p>
     * 
     * @param sSHPublicKeyBody
     *        The SSH public key. The public key must be encoded in ssh-rsa
     *        format or PEM format.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UploadSSHPublicKeyRequest withSSHPublicKeyBody(
            String sSHPublicKeyBody) {
        setSSHPublicKeyBody(sSHPublicKeyBody);
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getSSHPublicKeyBody() != null)
            sb.append("SSHPublicKeyBody: " + getSSHPublicKeyBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadSSHPublicKeyRequest == false)
            return false;
        UploadSSHPublicKeyRequest other = (UploadSSHPublicKeyRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSSHPublicKeyBody() == null
                ^ this.getSSHPublicKeyBody() == null)
            return false;
        if (other.getSSHPublicKeyBody() != null
                && other.getSSHPublicKeyBody().equals(
                        this.getSSHPublicKeyBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSSHPublicKeyBody() == null) ? 0 : getSSHPublicKeyBody()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UploadSSHPublicKeyRequest clone() {
        return (UploadSSHPublicKeyRequest) super.clone();
    }
}