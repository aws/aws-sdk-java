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
public class Attribute implements Serializable, Cloneable {

    /** The name of the attribute. */
    private String name;
    /**
     * <p>
     * </p>
     */
    private String alternateNameEncoding;
    /** The value of the attribute. */
    private String value;
    /**
     * <p>
     * </p>
     */
    private String alternateValueEncoding;

    /**
     * Default constructor for Attribute object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Attribute() {
    }

    /**
     * Constructs a new Attribute object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param name
     *        The name of the attribute.
     * @param value
     *        The value of the attribute.
     */
    public Attribute(String name, String value) {
        setName(name);
        setValue(value);
    }

    /**
     * The name of the attribute.
     * 
     * @param name
     *        The name of the attribute.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the attribute.
     * 
     * @return The name of the attribute.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the attribute.
     * 
     * @param name
     *        The name of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param alternateNameEncoding
     */

    public void setAlternateNameEncoding(String alternateNameEncoding) {
        this.alternateNameEncoding = alternateNameEncoding;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getAlternateNameEncoding() {
        return this.alternateNameEncoding;
    }

    /**
     * <p>
     * </p>
     * 
     * @param alternateNameEncoding
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withAlternateNameEncoding(String alternateNameEncoding) {
        setAlternateNameEncoding(alternateNameEncoding);
        return this;
    }

    /**
     * The value of the attribute.
     * 
     * @param value
     *        The value of the attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The value of the attribute.
     * 
     * @return The value of the attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * The value of the attribute.
     * 
     * @param value
     *        The value of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param alternateValueEncoding
     */

    public void setAlternateValueEncoding(String alternateValueEncoding) {
        this.alternateValueEncoding = alternateValueEncoding;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getAlternateValueEncoding() {
        return this.alternateValueEncoding;
    }

    /**
     * <p>
     * </p>
     * 
     * @param alternateValueEncoding
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withAlternateValueEncoding(String alternateValueEncoding) {
        setAlternateValueEncoding(alternateValueEncoding);
        return this;
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
        if (getAlternateNameEncoding() != null)
            sb.append("AlternateNameEncoding: ").append(getAlternateNameEncoding()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getAlternateValueEncoding() != null)
            sb.append("AlternateValueEncoding: ").append(getAlternateValueEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAlternateNameEncoding() == null ^ this.getAlternateNameEncoding() == null)
            return false;
        if (other.getAlternateNameEncoding() != null && other.getAlternateNameEncoding().equals(this.getAlternateNameEncoding()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getAlternateValueEncoding() == null ^ this.getAlternateValueEncoding() == null)
            return false;
        if (other.getAlternateValueEncoding() != null && other.getAlternateValueEncoding().equals(this.getAlternateValueEncoding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAlternateNameEncoding() == null) ? 0 : getAlternateNameEncoding().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getAlternateValueEncoding() == null) ? 0 : getAlternateValueEncoding().hashCode());
        return hashCode;
    }

    @Override
    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
