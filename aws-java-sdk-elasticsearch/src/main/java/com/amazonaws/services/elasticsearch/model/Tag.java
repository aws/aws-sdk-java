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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a key value pair for a resource tag.
 * </p>
 */
public class Tag implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <code>TagKey</code>, the name of the tag. Tag keys must be unique for the Elasticsearch domain to
     * which they are attached.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Specifies the <code>TagValue</code>, the value assigned to the corresponding tag key. Tag values can be null and
     * do not have to be unique in a tag set. For example, you can have a key value pair in a tag set of
     * <code>project : Trinity</code> and <code>cost-center : Trinity</code>
     * </p>
     */
    private String value;

    /**
     * <p>
     * Specifies the <code>TagKey</code>, the name of the tag. Tag keys must be unique for the Elasticsearch domain to
     * which they are attached.
     * </p>
     * 
     * @param key
     *        Specifies the <code>TagKey</code>, the name of the tag. Tag keys must be unique for the Elasticsearch
     *        domain to which they are attached.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Specifies the <code>TagKey</code>, the name of the tag. Tag keys must be unique for the Elasticsearch domain to
     * which they are attached.
     * </p>
     * 
     * @return Specifies the <code>TagKey</code>, the name of the tag. Tag keys must be unique for the Elasticsearch
     *         domain to which they are attached.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Specifies the <code>TagKey</code>, the name of the tag. Tag keys must be unique for the Elasticsearch domain to
     * which they are attached.
     * </p>
     * 
     * @param key
     *        Specifies the <code>TagKey</code>, the name of the tag. Tag keys must be unique for the Elasticsearch
     *        domain to which they are attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>TagValue</code>, the value assigned to the corresponding tag key. Tag values can be null and
     * do not have to be unique in a tag set. For example, you can have a key value pair in a tag set of
     * <code>project : Trinity</code> and <code>cost-center : Trinity</code>
     * </p>
     * 
     * @param value
     *        Specifies the <code>TagValue</code>, the value assigned to the corresponding tag key. Tag values can be
     *        null and do not have to be unique in a tag set. For example, you can have a key value pair in a tag set of
     *        <code>project : Trinity</code> and <code>cost-center : Trinity</code>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Specifies the <code>TagValue</code>, the value assigned to the corresponding tag key. Tag values can be null and
     * do not have to be unique in a tag set. For example, you can have a key value pair in a tag set of
     * <code>project : Trinity</code> and <code>cost-center : Trinity</code>
     * </p>
     * 
     * @return Specifies the <code>TagValue</code>, the value assigned to the corresponding tag key. Tag values can be
     *         null and do not have to be unique in a tag set. For example, you can have a key value pair in a tag set
     *         of <code>project : Trinity</code> and <code>cost-center : Trinity</code>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Specifies the <code>TagValue</code>, the value assigned to the corresponding tag key. Tag values can be null and
     * do not have to be unique in a tag set. For example, you can have a key value pair in a tag set of
     * <code>project : Trinity</code> and <code>cost-center : Trinity</code>
     * </p>
     * 
     * @param value
     *        Specifies the <code>TagValue</code>, the value assigned to the corresponding tag key. Tag values can be
     *        null and do not have to be unique in a tag set. For example, you can have a key value pair in a tag set of
     *        <code>project : Trinity</code> and <code>cost-center : Trinity</code>
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
