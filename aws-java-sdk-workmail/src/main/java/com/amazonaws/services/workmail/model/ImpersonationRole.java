/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An impersonation role for the given WorkMail organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ImpersonationRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImpersonationRole implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the impersonation role.
     * </p>
     */
    private String impersonationRoleId;
    /**
     * <p>
     * The impersonation role name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The impersonation role type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The date when the impersonation role was created.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The date when the impersonation role was last modified.
     * </p>
     */
    private java.util.Date dateModified;

    /**
     * <p>
     * The identifier of the impersonation role.
     * </p>
     * 
     * @param impersonationRoleId
     *        The identifier of the impersonation role.
     */

    public void setImpersonationRoleId(String impersonationRoleId) {
        this.impersonationRoleId = impersonationRoleId;
    }

    /**
     * <p>
     * The identifier of the impersonation role.
     * </p>
     * 
     * @return The identifier of the impersonation role.
     */

    public String getImpersonationRoleId() {
        return this.impersonationRoleId;
    }

    /**
     * <p>
     * The identifier of the impersonation role.
     * </p>
     * 
     * @param impersonationRoleId
     *        The identifier of the impersonation role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRole withImpersonationRoleId(String impersonationRoleId) {
        setImpersonationRoleId(impersonationRoleId);
        return this;
    }

    /**
     * <p>
     * The impersonation role name.
     * </p>
     * 
     * @param name
     *        The impersonation role name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The impersonation role name.
     * </p>
     * 
     * @return The impersonation role name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The impersonation role name.
     * </p>
     * 
     * @param name
     *        The impersonation role name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRole withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The impersonation role type.
     * </p>
     * 
     * @param type
     *        The impersonation role type.
     * @see ImpersonationRoleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The impersonation role type.
     * </p>
     * 
     * @return The impersonation role type.
     * @see ImpersonationRoleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The impersonation role type.
     * </p>
     * 
     * @param type
     *        The impersonation role type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImpersonationRoleType
     */

    public ImpersonationRole withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The impersonation role type.
     * </p>
     * 
     * @param type
     *        The impersonation role type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImpersonationRoleType
     */

    public ImpersonationRole withType(ImpersonationRoleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The date when the impersonation role was created.
     * </p>
     * 
     * @param dateCreated
     *        The date when the impersonation role was created.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date when the impersonation role was created.
     * </p>
     * 
     * @return The date when the impersonation role was created.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date when the impersonation role was created.
     * </p>
     * 
     * @param dateCreated
     *        The date when the impersonation role was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRole withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date when the impersonation role was last modified.
     * </p>
     * 
     * @param dateModified
     *        The date when the impersonation role was last modified.
     */

    public void setDateModified(java.util.Date dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * <p>
     * The date when the impersonation role was last modified.
     * </p>
     * 
     * @return The date when the impersonation role was last modified.
     */

    public java.util.Date getDateModified() {
        return this.dateModified;
    }

    /**
     * <p>
     * The date when the impersonation role was last modified.
     * </p>
     * 
     * @param dateModified
     *        The date when the impersonation role was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonationRole withDateModified(java.util.Date dateModified) {
        setDateModified(dateModified);
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
        if (getImpersonationRoleId() != null)
            sb.append("ImpersonationRoleId: ").append(getImpersonationRoleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateModified() != null)
            sb.append("DateModified: ").append(getDateModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImpersonationRole == false)
            return false;
        ImpersonationRole other = (ImpersonationRole) obj;
        if (other.getImpersonationRoleId() == null ^ this.getImpersonationRoleId() == null)
            return false;
        if (other.getImpersonationRoleId() != null && other.getImpersonationRoleId().equals(this.getImpersonationRoleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateModified() == null ^ this.getDateModified() == null)
            return false;
        if (other.getDateModified() != null && other.getDateModified().equals(this.getDateModified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImpersonationRoleId() == null) ? 0 : getImpersonationRoleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateModified() == null) ? 0 : getDateModified().hashCode());
        return hashCode;
    }

    @Override
    public ImpersonationRole clone() {
        try {
            return (ImpersonationRole) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.ImpersonationRoleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
