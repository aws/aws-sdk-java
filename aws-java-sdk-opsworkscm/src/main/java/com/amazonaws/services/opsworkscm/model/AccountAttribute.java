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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;

/**
 * <p>
 * Stores account attributes.
 * </p>
 */
public class AccountAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The attribute name. The following are supported attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ServerLimit:</i> The number of servers that currently existing / maximal allowed. By default 10 servers can be
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ManualBackupLimit:</i> The number of manual backups that currently exist / are maximal allowed. By default 50
     * manual backups can be created.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The maximum allowed value.
     * </p>
     */
    private Integer maximum;
    /**
     * <p>
     * The current usage, such as the current number of servers associated with the account.
     * </p>
     */
    private Integer used;

    /**
     * <p>
     * The attribute name. The following are supported attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ServerLimit:</i> The number of servers that currently existing / maximal allowed. By default 10 servers can be
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ManualBackupLimit:</i> The number of manual backups that currently exist / are maximal allowed. By default 50
     * manual backups can be created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The attribute name. The following are supported attribute names. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>ServerLimit:</i> The number of servers that currently existing / maximal allowed. By default 10 servers
     *        can be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ManualBackupLimit:</i> The number of manual backups that currently exist / are maximal allowed. By
     *        default 50 manual backups can be created.
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The attribute name. The following are supported attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ServerLimit:</i> The number of servers that currently existing / maximal allowed. By default 10 servers can be
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ManualBackupLimit:</i> The number of manual backups that currently exist / are maximal allowed. By default 50
     * manual backups can be created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The attribute name. The following are supported attribute names. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>ServerLimit:</i> The number of servers that currently existing / maximal allowed. By default 10
     *         servers can be created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ManualBackupLimit:</i> The number of manual backups that currently exist / are maximal allowed. By
     *         default 50 manual backups can be created.
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The attribute name. The following are supported attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ServerLimit:</i> The number of servers that currently existing / maximal allowed. By default 10 servers can be
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ManualBackupLimit:</i> The number of manual backups that currently exist / are maximal allowed. By default 50
     * manual backups can be created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The attribute name. The following are supported attribute names. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>ServerLimit:</i> The number of servers that currently existing / maximal allowed. By default 10 servers
     *        can be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ManualBackupLimit:</i> The number of manual backups that currently exist / are maximal allowed. By
     *        default 50 manual backups can be created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAttribute withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The maximum allowed value.
     * </p>
     * 
     * @param maximum
     *        The maximum allowed value.
     */

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum allowed value.
     * </p>
     * 
     * @return The maximum allowed value.
     */

    public Integer getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum allowed value.
     * </p>
     * 
     * @param maximum
     *        The maximum allowed value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAttribute withMaximum(Integer maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * <p>
     * The current usage, such as the current number of servers associated with the account.
     * </p>
     * 
     * @param used
     *        The current usage, such as the current number of servers associated with the account.
     */

    public void setUsed(Integer used) {
        this.used = used;
    }

    /**
     * <p>
     * The current usage, such as the current number of servers associated with the account.
     * </p>
     * 
     * @return The current usage, such as the current number of servers associated with the account.
     */

    public Integer getUsed() {
        return this.used;
    }

    /**
     * <p>
     * The current usage, such as the current number of servers associated with the account.
     * </p>
     * 
     * @param used
     *        The current usage, such as the current number of servers associated with the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAttribute withUsed(Integer used) {
        setUsed(used);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMaximum() != null)
            sb.append("Maximum: " + getMaximum() + ",");
        if (getUsed() != null)
            sb.append("Used: " + getUsed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountAttribute == false)
            return false;
        AccountAttribute other = (AccountAttribute) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getUsed() == null ^ this.getUsed() == null)
            return false;
        if (other.getUsed() != null && other.getUsed().equals(this.getUsed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getUsed() == null) ? 0 : getUsed().hashCode());
        return hashCode;
    }

    @Override
    public AccountAttribute clone() {
        try {
            return (AccountAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
