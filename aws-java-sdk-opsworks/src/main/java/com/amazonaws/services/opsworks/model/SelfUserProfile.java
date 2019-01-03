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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a user's SSH information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SelfUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfUserProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     */
    private String iamUserArn;
    /**
     * <p>
     * The user's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The user's SSH user name.
     * </p>
     */
    private String sshUsername;
    /**
     * <p>
     * The user's SSH public key.
     * </p>
     */
    private String sshPublicKey;

    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     * 
     * @param iamUserArn
     *        The user's IAM ARN.
     */

    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     * 
     * @return The user's IAM ARN.
     */

    public String getIamUserArn() {
        return this.iamUserArn;
    }

    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     * 
     * @param iamUserArn
     *        The user's IAM ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfUserProfile withIamUserArn(String iamUserArn) {
        setIamUserArn(iamUserArn);
        return this;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * 
     * @param name
     *        The user's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * 
     * @return The user's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * 
     * @param name
     *        The user's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfUserProfile withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The user's SSH user name.
     * </p>
     * 
     * @param sshUsername
     *        The user's SSH user name.
     */

    public void setSshUsername(String sshUsername) {
        this.sshUsername = sshUsername;
    }

    /**
     * <p>
     * The user's SSH user name.
     * </p>
     * 
     * @return The user's SSH user name.
     */

    public String getSshUsername() {
        return this.sshUsername;
    }

    /**
     * <p>
     * The user's SSH user name.
     * </p>
     * 
     * @param sshUsername
     *        The user's SSH user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfUserProfile withSshUsername(String sshUsername) {
        setSshUsername(sshUsername);
        return this;
    }

    /**
     * <p>
     * The user's SSH public key.
     * </p>
     * 
     * @param sshPublicKey
     *        The user's SSH public key.
     */

    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * <p>
     * The user's SSH public key.
     * </p>
     * 
     * @return The user's SSH public key.
     */

    public String getSshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * <p>
     * The user's SSH public key.
     * </p>
     * 
     * @param sshPublicKey
     *        The user's SSH public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfUserProfile withSshPublicKey(String sshPublicKey) {
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
        if (getIamUserArn() != null)
            sb.append("IamUserArn: ").append(getIamUserArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSshUsername() != null)
            sb.append("SshUsername: ").append(getSshUsername()).append(",");
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

        if (obj instanceof SelfUserProfile == false)
            return false;
        SelfUserProfile other = (SelfUserProfile) obj;
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null)
            return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSshUsername() == null ^ this.getSshUsername() == null)
            return false;
        if (other.getSshUsername() != null && other.getSshUsername().equals(this.getSshUsername()) == false)
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

        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSshUsername() == null) ? 0 : getSshUsername().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKey() == null) ? 0 : getSshPublicKey().hashCode());
        return hashCode;
    }

    @Override
    public SelfUserProfile clone() {
        try {
            return (SelfUserProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.SelfUserProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
