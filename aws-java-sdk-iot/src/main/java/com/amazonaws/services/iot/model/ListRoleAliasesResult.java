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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoleAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The role aliases.
     * </p>
     */
    private java.util.List<String> roleAliases;
    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * The role aliases.
     * </p>
     * 
     * @return The role aliases.
     */

    public java.util.List<String> getRoleAliases() {
        return roleAliases;
    }

    /**
     * <p>
     * The role aliases.
     * </p>
     * 
     * @param roleAliases
     *        The role aliases.
     */

    public void setRoleAliases(java.util.Collection<String> roleAliases) {
        if (roleAliases == null) {
            this.roleAliases = null;
            return;
        }

        this.roleAliases = new java.util.ArrayList<String>(roleAliases);
    }

    /**
     * <p>
     * The role aliases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoleAliases(java.util.Collection)} or {@link #withRoleAliases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param roleAliases
     *        The role aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleAliasesResult withRoleAliases(String... roleAliases) {
        if (this.roleAliases == null) {
            setRoleAliases(new java.util.ArrayList<String>(roleAliases.length));
        }
        for (String ele : roleAliases) {
            this.roleAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The role aliases.
     * </p>
     * 
     * @param roleAliases
     *        The role aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleAliasesResult withRoleAliases(java.util.Collection<String> roleAliases) {
        setRoleAliases(roleAliases);
        return this;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * 
     * @param nextMarker
     *        A marker used to get the next set of results.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * 
     * @return A marker used to get the next set of results.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * 
     * @param nextMarker
     *        A marker used to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleAliasesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getRoleAliases() != null)
            sb.append("RoleAliases: ").append(getRoleAliases()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoleAliasesResult == false)
            return false;
        ListRoleAliasesResult other = (ListRoleAliasesResult) obj;
        if (other.getRoleAliases() == null ^ this.getRoleAliases() == null)
            return false;
        if (other.getRoleAliases() != null && other.getRoleAliases().equals(this.getRoleAliases()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleAliases() == null) ? 0 : getRoleAliases().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListRoleAliasesResult clone() {
        try {
            return (ListRoleAliasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
