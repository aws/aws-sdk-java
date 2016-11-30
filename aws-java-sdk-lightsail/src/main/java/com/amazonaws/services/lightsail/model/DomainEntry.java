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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a domain recordset entry.
 * </p>
 */
public class DomainEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     */
    private String target;
    /**
     * <p>
     * The type of domain entry (e.g., <code>SOA</code> or <code>NS</code>).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The options for the domain entry.
     * </p>
     */
    private java.util.Map<String, String> options;

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     * 
     * @param id
     *        The ID of the domain recordset entry.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     * 
     * @return The ID of the domain recordset entry.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     * 
     * @param id
     *        The ID of the domain recordset entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * 
     * @param target
     *        The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * 
     * @return The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * 
     * @param target
     *        The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The type of domain entry (e.g., <code>SOA</code> or <code>NS</code>).
     * </p>
     * 
     * @param type
     *        The type of domain entry (e.g., <code>SOA</code> or <code>NS</code>).
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of domain entry (e.g., <code>SOA</code> or <code>NS</code>).
     * </p>
     * 
     * @return The type of domain entry (e.g., <code>SOA</code> or <code>NS</code>).
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of domain entry (e.g., <code>SOA</code> or <code>NS</code>).
     * </p>
     * 
     * @param type
     *        The type of domain entry (e.g., <code>SOA</code> or <code>NS</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The options for the domain entry.
     * </p>
     * 
     * @return The options for the domain entry.
     */

    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * The options for the domain entry.
     * </p>
     * 
     * @param options
     *        The options for the domain entry.
     */

    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * The options for the domain entry.
     * </p>
     * 
     * @param options
     *        The options for the domain entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry withOptions(java.util.Map<String, String> options) {
        setOptions(options);
        return this;
    }

    public DomainEntry addOptionsEntry(String key, String value) {
        if (null == this.options) {
            this.options = new java.util.HashMap<String, String>();
        }
        if (this.options.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.options.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Options.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntry clearOptionsEntries() {
        this.options = null;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getOptions() != null)
            sb.append("Options: " + getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainEntry == false)
            return false;
        DomainEntry other = (DomainEntry) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public DomainEntry clone() {
        try {
            return (DomainEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
