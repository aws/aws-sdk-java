/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Filter based on UserIds or GroupIds.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/SearchPrincipalType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPrincipalType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * UserIds or GroupIds.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Role of a User or Group.
     * </p>
     */
    private java.util.List<String> roles;

    /**
     * <p>
     * UserIds or GroupIds.
     * </p>
     * 
     * @param id
     *        UserIds or GroupIds.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * UserIds or GroupIds.
     * </p>
     * 
     * @return UserIds or GroupIds.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * UserIds or GroupIds.
     * </p>
     * 
     * @param id
     *        UserIds or GroupIds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPrincipalType withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Role of a User or Group.
     * </p>
     * 
     * @return The Role of a User or Group.
     * @see PrincipalRoleType
     */

    public java.util.List<String> getRoles() {
        return roles;
    }

    /**
     * <p>
     * The Role of a User or Group.
     * </p>
     * 
     * @param roles
     *        The Role of a User or Group.
     * @see PrincipalRoleType
     */

    public void setRoles(java.util.Collection<String> roles) {
        if (roles == null) {
            this.roles = null;
            return;
        }

        this.roles = new java.util.ArrayList<String>(roles);
    }

    /**
     * <p>
     * The Role of a User or Group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoles(java.util.Collection)} or {@link #withRoles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param roles
     *        The Role of a User or Group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalRoleType
     */

    public SearchPrincipalType withRoles(String... roles) {
        if (this.roles == null) {
            setRoles(new java.util.ArrayList<String>(roles.length));
        }
        for (String ele : roles) {
            this.roles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Role of a User or Group.
     * </p>
     * 
     * @param roles
     *        The Role of a User or Group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalRoleType
     */

    public SearchPrincipalType withRoles(java.util.Collection<String> roles) {
        setRoles(roles);
        return this;
    }

    /**
     * <p>
     * The Role of a User or Group.
     * </p>
     * 
     * @param roles
     *        The Role of a User or Group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalRoleType
     */

    public SearchPrincipalType withRoles(PrincipalRoleType... roles) {
        java.util.ArrayList<String> rolesCopy = new java.util.ArrayList<String>(roles.length);
        for (PrincipalRoleType value : roles) {
            rolesCopy.add(value.toString());
        }
        if (getRoles() == null) {
            setRoles(rolesCopy);
        } else {
            getRoles().addAll(rolesCopy);
        }
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
        if (getRoles() != null)
            sb.append("Roles: ").append(getRoles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPrincipalType == false)
            return false;
        SearchPrincipalType other = (SearchPrincipalType) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRoles() == null ^ this.getRoles() == null)
            return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        return hashCode;
    }

    @Override
    public SearchPrincipalType clone() {
        try {
            return (SearchPrincipalType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.SearchPrincipalTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
