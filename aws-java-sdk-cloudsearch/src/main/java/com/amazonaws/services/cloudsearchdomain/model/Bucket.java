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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;

/**
 * <p>
 * A container for facet information.
 * </p>
 */
public class Bucket implements Serializable, Cloneable {

    /**
     * <p>
     * The facet value being counted.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The number of hits that contain the facet value in the specified facet field.
     * </p>
     */
    private Long count;

    /**
     * <p>
     * The facet value being counted.
     * </p>
     * 
     * @param value
     *        The facet value being counted.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The facet value being counted.
     * </p>
     * 
     * @return The facet value being counted.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The facet value being counted.
     * </p>
     * 
     * @param value
     *        The facet value being counted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The number of hits that contain the facet value in the specified facet field.
     * </p>
     * 
     * @param count
     *        The number of hits that contain the facet value in the specified facet field.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of hits that contain the facet value in the specified facet field.
     * </p>
     * 
     * @return The number of hits that contain the facet value in the specified facet field.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of hits that contain the facet value in the specified facet field.
     * </p>
     * 
     * @param count
     *        The number of hits that contain the facet value in the specified facet field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withCount(Long count) {
        setCount(count);
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bucket == false)
            return false;
        Bucket other = (Bucket) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public Bucket clone() {
        try {
            return (Bucket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
