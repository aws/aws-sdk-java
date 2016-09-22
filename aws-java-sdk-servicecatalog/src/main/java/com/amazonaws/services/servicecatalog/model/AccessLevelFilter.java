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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * The access level to limit results.
 * </p>
 */
public class AccessLevelFilter implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the access level.
     * </p>
     * <p>
     * <code>Account</code> allows results at the account level.
     * </p>
     * <p>
     * <code>Role</code> allows results based on the federated role of the specified user.
     * </p>
     * <p>
     * <code>User</code> allows results limited to the specified user.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Specifies the user to which the access level applies. A value of <code>Self</code> is currently supported.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Specifies the access level.
     * </p>
     * <p>
     * <code>Account</code> allows results at the account level.
     * </p>
     * <p>
     * <code>Role</code> allows results based on the federated role of the specified user.
     * </p>
     * <p>
     * <code>User</code> allows results limited to the specified user.
     * </p>
     * 
     * @param key
     *        Specifies the access level.</p>
     *        <p>
     *        <code>Account</code> allows results at the account level.
     *        </p>
     *        <p>
     *        <code>Role</code> allows results based on the federated role of the specified user.
     *        </p>
     *        <p>
     *        <code>User</code> allows results limited to the specified user.
     * @see AccessLevelFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Specifies the access level.
     * </p>
     * <p>
     * <code>Account</code> allows results at the account level.
     * </p>
     * <p>
     * <code>Role</code> allows results based on the federated role of the specified user.
     * </p>
     * <p>
     * <code>User</code> allows results limited to the specified user.
     * </p>
     * 
     * @return Specifies the access level.</p>
     *         <p>
     *         <code>Account</code> allows results at the account level.
     *         </p>
     *         <p>
     *         <code>Role</code> allows results based on the federated role of the specified user.
     *         </p>
     *         <p>
     *         <code>User</code> allows results limited to the specified user.
     * @see AccessLevelFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Specifies the access level.
     * </p>
     * <p>
     * <code>Account</code> allows results at the account level.
     * </p>
     * <p>
     * <code>Role</code> allows results based on the federated role of the specified user.
     * </p>
     * <p>
     * <code>User</code> allows results limited to the specified user.
     * </p>
     * 
     * @param key
     *        Specifies the access level.</p>
     *        <p>
     *        <code>Account</code> allows results at the account level.
     *        </p>
     *        <p>
     *        <code>Role</code> allows results based on the federated role of the specified user.
     *        </p>
     *        <p>
     *        <code>User</code> allows results limited to the specified user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessLevelFilterKey
     */

    public AccessLevelFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Specifies the access level.
     * </p>
     * <p>
     * <code>Account</code> allows results at the account level.
     * </p>
     * <p>
     * <code>Role</code> allows results based on the federated role of the specified user.
     * </p>
     * <p>
     * <code>User</code> allows results limited to the specified user.
     * </p>
     * 
     * @param key
     *        Specifies the access level.</p>
     *        <p>
     *        <code>Account</code> allows results at the account level.
     *        </p>
     *        <p>
     *        <code>Role</code> allows results based on the federated role of the specified user.
     *        </p>
     *        <p>
     *        <code>User</code> allows results limited to the specified user.
     * @see AccessLevelFilterKey
     */

    public void setKey(AccessLevelFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>
     * Specifies the access level.
     * </p>
     * <p>
     * <code>Account</code> allows results at the account level.
     * </p>
     * <p>
     * <code>Role</code> allows results based on the federated role of the specified user.
     * </p>
     * <p>
     * <code>User</code> allows results limited to the specified user.
     * </p>
     * 
     * @param key
     *        Specifies the access level.</p>
     *        <p>
     *        <code>Account</code> allows results at the account level.
     *        </p>
     *        <p>
     *        <code>Role</code> allows results based on the federated role of the specified user.
     *        </p>
     *        <p>
     *        <code>User</code> allows results limited to the specified user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessLevelFilterKey
     */

    public AccessLevelFilter withKey(AccessLevelFilterKey key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Specifies the user to which the access level applies. A value of <code>Self</code> is currently supported.
     * </p>
     * 
     * @param value
     *        Specifies the user to which the access level applies. A value of <code>Self</code> is currently supported.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Specifies the user to which the access level applies. A value of <code>Self</code> is currently supported.
     * </p>
     * 
     * @return Specifies the user to which the access level applies. A value of <code>Self</code> is currently
     *         supported.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Specifies the user to which the access level applies. A value of <code>Self</code> is currently supported.
     * </p>
     * 
     * @param value
     *        Specifies the user to which the access level applies. A value of <code>Self</code> is currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessLevelFilter withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessLevelFilter == false)
            return false;
        AccessLevelFilter other = (AccessLevelFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AccessLevelFilter clone() {
        try {
            return (AccessLevelFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
