/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the role to delete.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * The name of the role to delete.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @param roleName
     *        The name of the role to delete.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to delete.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @return The name of the role to delete.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *         any of the following characters: =,.@-
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role to delete.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the
     * following characters: =,.@-
     * </p>
     * 
     * @param roleName
     *        The name of the role to delete.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRoleRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRoleRequest == false)
            return false;
        DeleteRoleRequest other = (DeleteRoleRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRoleRequest clone() {
        return (DeleteRoleRequest) super.clone();
    }
}
