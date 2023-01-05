/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of a theme's properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ThemeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThemeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of key-value pairs that define the theme's properties.
     * </p>
     */
    private java.util.List<ThemeValues> children;
    /**
     * <p>
     * The value of a theme property.
     * </p>
     */
    private String value;

    /**
     * <p>
     * A list of key-value pairs that define the theme's properties.
     * </p>
     * 
     * @return A list of key-value pairs that define the theme's properties.
     */

    public java.util.List<ThemeValues> getChildren() {
        return children;
    }

    /**
     * <p>
     * A list of key-value pairs that define the theme's properties.
     * </p>
     * 
     * @param children
     *        A list of key-value pairs that define the theme's properties.
     */

    public void setChildren(java.util.Collection<ThemeValues> children) {
        if (children == null) {
            this.children = null;
            return;
        }

        this.children = new java.util.ArrayList<ThemeValues>(children);
    }

    /**
     * <p>
     * A list of key-value pairs that define the theme's properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChildren(java.util.Collection)} or {@link #withChildren(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param children
     *        A list of key-value pairs that define the theme's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeValue withChildren(ThemeValues... children) {
        if (this.children == null) {
            setChildren(new java.util.ArrayList<ThemeValues>(children.length));
        }
        for (ThemeValues ele : children) {
            this.children.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that define the theme's properties.
     * </p>
     * 
     * @param children
     *        A list of key-value pairs that define the theme's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeValue withChildren(java.util.Collection<ThemeValues> children) {
        setChildren(children);
        return this;
    }

    /**
     * <p>
     * The value of a theme property.
     * </p>
     * 
     * @param value
     *        The value of a theme property.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a theme property.
     * </p>
     * 
     * @return The value of a theme property.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of a theme property.
     * </p>
     * 
     * @param value
     *        The value of a theme property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeValue withValue(String value) {
        setValue(value);
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
        if (getChildren() != null)
            sb.append("Children: ").append(getChildren()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThemeValue == false)
            return false;
        ThemeValue other = (ThemeValue) obj;
        if (other.getChildren() == null ^ this.getChildren() == null)
            return false;
        if (other.getChildren() != null && other.getChildren().equals(this.getChildren()) == false)
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

        hashCode = prime * hashCode + ((getChildren() == null) ? 0 : getChildren().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ThemeValue clone() {
        try {
            return (ThemeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ThemeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
