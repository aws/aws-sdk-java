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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata of a specific type that you can use to filter and group your results. You can use
 * <code>GetDimensionValues</code> to find specific values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DimensionValuesWithAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionValuesWithAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of a dimension with a specific attribute.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The value of a dimension with a specific attribute.
     * </p>
     * 
     * @param value
     *        The value of a dimension with a specific attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a dimension with a specific attribute.
     * </p>
     * 
     * @return The value of a dimension with a specific attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of a dimension with a specific attribute.
     * </p>
     * 
     * @param value
     *        The value of a dimension with a specific attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionValuesWithAttributes withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     * 
     * @return The attribute that applies to a specific <code>Dimension</code>.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     * 
     * @param attributes
     *        The attribute that applies to a specific <code>Dimension</code>.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     * 
     * @param attributes
     *        The attribute that applies to a specific <code>Dimension</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionValuesWithAttributes withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public DimensionValuesWithAttributes addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionValuesWithAttributes clearAttributesEntries() {
        this.attributes = null;
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
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

        if (obj instanceof DimensionValuesWithAttributes == false)
            return false;
        DimensionValuesWithAttributes other = (DimensionValuesWithAttributes) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
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

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DimensionValuesWithAttributes clone() {
        try {
            return (DimensionValuesWithAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.DimensionValuesWithAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
