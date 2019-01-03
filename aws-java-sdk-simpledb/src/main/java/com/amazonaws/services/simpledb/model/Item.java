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
public class Item implements Serializable, Cloneable {

    /** The name of the item. */
    private String name;
    /**
     * <p>
     * </p>
     */
    private String alternateNameEncoding;
    /** A list of attributes. */
    private com.amazonaws.internal.SdkInternalList<Attribute> attributes;

    /**
     * Default constructor for Item object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Item() {
    }

    /**
     * Constructs a new Item object. Callers should use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param name
     *        The name of the item.
     * @param attributes
     *        A list of attributes.
     */
    public Item(String name, java.util.List<Attribute> attributes) {
        setName(name);
        setAttributes(attributes);
    }

    /**
     * The name of the item.
     * 
     * @param name
     *        The name of the item.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the item.
     * 
     * @return The name of the item.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the item.
     * 
     * @param name
     *        The name of the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withName(String name) {
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

    public Item withAlternateNameEncoding(String alternateNameEncoding) {
        setAlternateNameEncoding(alternateNameEncoding);
        return this;
    }

    /**
     * A list of attributes.
     * 
     * @return A list of attributes.
     */

    public java.util.List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalList<Attribute>();
        }
        return attributes;
    }

    /**
     * A list of attributes.
     * 
     * @param attributes
     *        A list of attributes.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new com.amazonaws.internal.SdkInternalList<Attribute>(attributes);
    }

    /**
     * A list of attributes.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        A list of attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new com.amazonaws.internal.SdkInternalList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * A list of attributes.
     * 
     * @param attributes
     *        A list of attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Item == false)
            return false;
        Item other = (Item) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAlternateNameEncoding() == null ^ this.getAlternateNameEncoding() == null)
            return false;
        if (other.getAlternateNameEncoding() != null && other.getAlternateNameEncoding().equals(this.getAlternateNameEncoding()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAlternateNameEncoding() == null) ? 0 : getAlternateNameEncoding().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
