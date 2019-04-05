/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Represents a metadata key-value pair.
 */
public class MetadataEntry implements Serializable, Cloneable {
    private String name;
    private String value;

    /**
     * Constructs an instance of this object.
     *
     * @param name The metadata key.
     * @param value The metadata value.
     */
    public MetadataEntry(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return The metadata key.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the metadata key.
     *
     * @param name The metadata key.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the metadata key.
     *
     * @param key The metadata key.
     * @return This object for chaining.
     */
    public MetadataEntry withName(String key) {
        setName(key);
        return this;
    }

    /**
     * @return The metadata value.
     */
    public String getValue() {
        return value;
    }

    /**
     * Set the metadata value.
     *
     * @param value The metadata value.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Set the metadata value.
     *
     * @param metadataValue The metadata value.
     * @return This object for chaining.
     */
    public MetadataEntry withValue(String metadataValue) {
        setValue(metadataValue);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof MetadataEntry)) {
            return false;
        }

        final MetadataEntry other = (MetadataEntry) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && !other.getName().equals(this.getName()))
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && !other.getValue().equals(this.getValue()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public MetadataEntry clone() {
        try {
            return (MetadataEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
