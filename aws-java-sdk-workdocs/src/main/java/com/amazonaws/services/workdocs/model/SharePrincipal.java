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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the recipient type and ID, if available.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/SharePrincipal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SharePrincipal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the recipient.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of the recipient.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The role of the recipient.
     * </p>
     */
    private String role;

    /**
     * <p>
     * The ID of the recipient.
     * </p>
     * 
     * @param id
     *        The ID of the recipient.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the recipient.
     * </p>
     * 
     * @return The ID of the recipient.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the recipient.
     * </p>
     * 
     * @param id
     *        The ID of the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePrincipal withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of the recipient.
     * </p>
     * 
     * @param type
     *        The type of the recipient.
     * @see PrincipalType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the recipient.
     * </p>
     * 
     * @return The type of the recipient.
     * @see PrincipalType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the recipient.
     * </p>
     * 
     * @param type
     *        The type of the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public SharePrincipal withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the recipient.
     * </p>
     * 
     * @param type
     *        The type of the recipient.
     * @see PrincipalType
     */

    public void setType(PrincipalType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of the recipient.
     * </p>
     * 
     * @param type
     *        The type of the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public SharePrincipal withType(PrincipalType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The role of the recipient.
     * </p>
     * 
     * @param role
     *        The role of the recipient.
     * @see RoleType
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role of the recipient.
     * </p>
     * 
     * @return The role of the recipient.
     * @see RoleType
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role of the recipient.
     * </p>
     * 
     * @param role
     *        The role of the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleType
     */

    public SharePrincipal withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The role of the recipient.
     * </p>
     * 
     * @param role
     *        The role of the recipient.
     * @see RoleType
     */

    public void setRole(RoleType role) {
        withRole(role);
    }

    /**
     * <p>
     * The role of the recipient.
     * </p>
     * 
     * @param role
     *        The role of the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleType
     */

    public SharePrincipal withRole(RoleType role) {
        this.role = role.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SharePrincipal == false)
            return false;
        SharePrincipal other = (SharePrincipal) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public SharePrincipal clone() {
        try {
            return (SharePrincipal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.SharePrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
