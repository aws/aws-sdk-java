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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;

/**
 * <p>
 * The name of a tag filter. Valid names are: <code>tagKey</code>, <code>tagValue</code>, <code>configurationId</code>.
 * </p>
 */
public class TagFilter implements Serializable, Cloneable {

    /**
     * <p>
     * A name of a tag filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Values of a tag filter.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * A name of a tag filter.
     * </p>
     * 
     * @param name
     *        A name of a tag filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name of a tag filter.
     * </p>
     * 
     * @return A name of a tag filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name of a tag filter.
     * </p>
     * 
     * @param name
     *        A name of a tag filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Values of a tag filter.
     * </p>
     * 
     * @return Values of a tag filter.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * Values of a tag filter.
     * </p>
     * 
     * @param values
     *        Values of a tag filter.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * Values of a tag filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        Values of a tag filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Values of a tag filter.
     * </p>
     * 
     * @param values
     *        Values of a tag filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagFilter == false)
            return false;
        TagFilter other = (TagFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public TagFilter clone() {
        try {
            return (TagFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
