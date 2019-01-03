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
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceableAttribute implements Serializable, Cloneable {

    /** The name of the replaceable attribute. */
    private String name;
    /** The value of the replaceable attribute. */
    private String value;
    /**
     * A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair. The
     * default setting is <code>false</code>.
     */
    private Boolean replace;

    /**
     * Default constructor for ReplaceableAttribute object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ReplaceableAttribute() {
    }

    /**
     * Constructs a new ReplaceableAttribute object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name
     *        The name of the replaceable attribute.
     * @param value
     *        The value of the replaceable attribute.
     * @param replace
     *        A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair.
     *        The default setting is <code>false</code>.
     */
    public ReplaceableAttribute(String name, String value, Boolean replace) {
        setName(name);
        setValue(value);
        setReplace(replace);
    }

    /**
     * The name of the replaceable attribute.
     * 
     * @param name
     *        The name of the replaceable attribute.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the replaceable attribute.
     * 
     * @return The name of the replaceable attribute.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the replaceable attribute.
     * 
     * @param name
     *        The name of the replaceable attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceableAttribute withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The value of the replaceable attribute.
     * 
     * @param value
     *        The value of the replaceable attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The value of the replaceable attribute.
     * 
     * @return The value of the replaceable attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * The value of the replaceable attribute.
     * 
     * @param value
     *        The value of the replaceable attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceableAttribute withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair. The
     * default setting is <code>false</code>.
     * 
     * @param replace
     *        A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair.
     *        The default setting is <code>false</code>.
     */

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair. The
     * default setting is <code>false</code>.
     * 
     * @return A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value
     *         pair. The default setting is <code>false</code>.
     */

    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair. The
     * default setting is <code>false</code>.
     * 
     * @param replace
     *        A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair.
     *        The default setting is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceableAttribute withReplace(Boolean replace) {
        setReplace(replace);
        return this;
    }

    /**
     * A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair. The
     * default setting is <code>false</code>.
     * 
     * @return A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value
     *         pair. The default setting is <code>false</code>.
     */

    public Boolean isReplace() {
        return this.replace;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getReplace() != null)
            sb.append("Replace: ").append(getReplace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceableAttribute == false)
            return false;
        ReplaceableAttribute other = (ReplaceableAttribute) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceableAttribute clone() {
        try {
            return (ReplaceableAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
