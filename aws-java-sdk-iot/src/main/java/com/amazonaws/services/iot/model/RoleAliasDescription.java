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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Role alias description.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoleAliasDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The role alias.
     * </p>
     */
    private String roleAlias;
    /**
     * <p>
     * The ARN of the role alias.
     * </p>
     */
    private String roleAliasArn;
    /**
     * <p>
     * The role ARN.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The role alias owner.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The number of seconds for which the credential is valid.
     * </p>
     */
    private Integer credentialDurationSeconds;
    /**
     * <p>
     * The UNIX timestamp of when the role alias was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The UNIX timestamp of when the role alias was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The role alias.
     * </p>
     * 
     * @param roleAlias
     *        The role alias.
     */

    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    /**
     * <p>
     * The role alias.
     * </p>
     * 
     * @return The role alias.
     */

    public String getRoleAlias() {
        return this.roleAlias;
    }

    /**
     * <p>
     * The role alias.
     * </p>
     * 
     * @param roleAlias
     *        The role alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleAliasDescription withRoleAlias(String roleAlias) {
        setRoleAlias(roleAlias);
        return this;
    }

    /**
     * <p>
     * The ARN of the role alias.
     * </p>
     * 
     * @param roleAliasArn
     *        The ARN of the role alias.
     */

    public void setRoleAliasArn(String roleAliasArn) {
        this.roleAliasArn = roleAliasArn;
    }

    /**
     * <p>
     * The ARN of the role alias.
     * </p>
     * 
     * @return The ARN of the role alias.
     */

    public String getRoleAliasArn() {
        return this.roleAliasArn;
    }

    /**
     * <p>
     * The ARN of the role alias.
     * </p>
     * 
     * @param roleAliasArn
     *        The ARN of the role alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleAliasDescription withRoleAliasArn(String roleAliasArn) {
        setRoleAliasArn(roleAliasArn);
        return this;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * 
     * @param roleArn
     *        The role ARN.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * 
     * @return The role ARN.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * 
     * @param roleArn
     *        The role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleAliasDescription withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The role alias owner.
     * </p>
     * 
     * @param owner
     *        The role alias owner.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The role alias owner.
     * </p>
     * 
     * @return The role alias owner.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The role alias owner.
     * </p>
     * 
     * @param owner
     *        The role alias owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleAliasDescription withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The number of seconds for which the credential is valid.
     * </p>
     * 
     * @param credentialDurationSeconds
     *        The number of seconds for which the credential is valid.
     */

    public void setCredentialDurationSeconds(Integer credentialDurationSeconds) {
        this.credentialDurationSeconds = credentialDurationSeconds;
    }

    /**
     * <p>
     * The number of seconds for which the credential is valid.
     * </p>
     * 
     * @return The number of seconds for which the credential is valid.
     */

    public Integer getCredentialDurationSeconds() {
        return this.credentialDurationSeconds;
    }

    /**
     * <p>
     * The number of seconds for which the credential is valid.
     * </p>
     * 
     * @param credentialDurationSeconds
     *        The number of seconds for which the credential is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleAliasDescription withCredentialDurationSeconds(Integer credentialDurationSeconds) {
        setCredentialDurationSeconds(credentialDurationSeconds);
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was created.
     * </p>
     * 
     * @param creationDate
     *        The UNIX timestamp of when the role alias was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was created.
     * </p>
     * 
     * @return The UNIX timestamp of when the role alias was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was created.
     * </p>
     * 
     * @param creationDate
     *        The UNIX timestamp of when the role alias was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleAliasDescription withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The UNIX timestamp of when the role alias was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was last modified.
     * </p>
     * 
     * @return The UNIX timestamp of when the role alias was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the role alias was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The UNIX timestamp of when the role alias was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleAliasDescription withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getRoleAlias() != null)
            sb.append("RoleAlias: ").append(getRoleAlias()).append(",");
        if (getRoleAliasArn() != null)
            sb.append("RoleAliasArn: ").append(getRoleAliasArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getCredentialDurationSeconds() != null)
            sb.append("CredentialDurationSeconds: ").append(getCredentialDurationSeconds()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoleAliasDescription == false)
            return false;
        RoleAliasDescription other = (RoleAliasDescription) obj;
        if (other.getRoleAlias() == null ^ this.getRoleAlias() == null)
            return false;
        if (other.getRoleAlias() != null && other.getRoleAlias().equals(this.getRoleAlias()) == false)
            return false;
        if (other.getRoleAliasArn() == null ^ this.getRoleAliasArn() == null)
            return false;
        if (other.getRoleAliasArn() != null && other.getRoleAliasArn().equals(this.getRoleAliasArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getCredentialDurationSeconds() == null ^ this.getCredentialDurationSeconds() == null)
            return false;
        if (other.getCredentialDurationSeconds() != null && other.getCredentialDurationSeconds().equals(this.getCredentialDurationSeconds()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleAlias() == null) ? 0 : getRoleAlias().hashCode());
        hashCode = prime * hashCode + ((getRoleAliasArn() == null) ? 0 : getRoleAliasArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getCredentialDurationSeconds() == null) ? 0 : getCredentialDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public RoleAliasDescription clone() {
        try {
            return (RoleAliasDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.RoleAliasDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
