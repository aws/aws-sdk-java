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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a command filter.
 * </p>
 */
public class CommandFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the filter. For example, requested date and time.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The filter value. For example: June 30, 2015.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the filter. For example, requested date and time.
     * </p>
     * 
     * @param key
     *        The name of the filter. For example, requested date and time.
     * @see CommandFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the filter. For example, requested date and time.
     * </p>
     * 
     * @return The name of the filter. For example, requested date and time.
     * @see CommandFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the filter. For example, requested date and time.
     * </p>
     * 
     * @param key
     *        The name of the filter. For example, requested date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandFilterKey
     */

    public CommandFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The name of the filter. For example, requested date and time.
     * </p>
     * 
     * @param key
     *        The name of the filter. For example, requested date and time.
     * @see CommandFilterKey
     */

    public void setKey(CommandFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>
     * The name of the filter. For example, requested date and time.
     * </p>
     * 
     * @param key
     *        The name of the filter. For example, requested date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandFilterKey
     */

    public CommandFilter withKey(CommandFilterKey key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The filter value. For example: June 30, 2015.
     * </p>
     * 
     * @param value
     *        The filter value. For example: June 30, 2015.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The filter value. For example: June 30, 2015.
     * </p>
     * 
     * @return The filter value. For example: June 30, 2015.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The filter value. For example: June 30, 2015.
     * </p>
     * 
     * @param value
     *        The filter value. For example: June 30, 2015.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandFilter withValue(String value) {
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

        if (obj instanceof CommandFilter == false)
            return false;
        CommandFilter other = (CommandFilter) obj;
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
    public CommandFilter clone() {
        try {
            return (CommandFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
