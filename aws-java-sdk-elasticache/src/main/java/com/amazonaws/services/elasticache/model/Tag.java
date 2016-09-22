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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * A cost allocation Tag that can be added to an ElastiCache cluster or replication group. Tags are composed of a
 * Key/Value pair. A tag with a null Value is permitted.
 * </p>
 */
public class Tag implements Serializable, Cloneable {

    /**
     * <p>
     * The key for the tag.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The tag's value. May not be null.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The key for the tag.
     * </p>
     * 
     * @param key
     *        The key for the tag.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for the tag.
     * </p>
     * 
     * @return The key for the tag.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key for the tag.
     * </p>
     * 
     * @param key
     *        The key for the tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The tag's value. May not be null.
     * </p>
     * 
     * @param value
     *        The tag's value. May not be null.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The tag's value. May not be null.
     * </p>
     * 
     * @return The tag's value. May not be null.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The tag's value. May not be null.
     * </p>
     * 
     * @param value
     *        The tag's value. May not be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withValue(String value) {
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

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;
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
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
