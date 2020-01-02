/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An asset property value entry containing the following information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetPropertyValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the asset property.
     * </p>
     */
    private AssetPropertyVariant value;
    /**
     * <p>
     * The asset property value timestamp.
     * </p>
     */
    private AssetPropertyTimestamp timestamp;
    /**
     * <p>
     * Optional. A string that describes the quality of the value. Accepts substitution templates. Must be
     * <code>GOOD</code>, <code>BAD</code>, or <code>UNCERTAIN</code>.
     * </p>
     */
    private String quality;

    /**
     * <p>
     * The value of the asset property.
     * </p>
     * 
     * @param value
     *        The value of the asset property.
     */

    public void setValue(AssetPropertyVariant value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the asset property.
     * </p>
     * 
     * @return The value of the asset property.
     */

    public AssetPropertyVariant getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the asset property.
     * </p>
     * 
     * @param value
     *        The value of the asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyValue withValue(AssetPropertyVariant value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The asset property value timestamp.
     * </p>
     * 
     * @param timestamp
     *        The asset property value timestamp.
     */

    public void setTimestamp(AssetPropertyTimestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The asset property value timestamp.
     * </p>
     * 
     * @return The asset property value timestamp.
     */

    public AssetPropertyTimestamp getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The asset property value timestamp.
     * </p>
     * 
     * @param timestamp
     *        The asset property value timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyValue withTimestamp(AssetPropertyTimestamp timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Optional. A string that describes the quality of the value. Accepts substitution templates. Must be
     * <code>GOOD</code>, <code>BAD</code>, or <code>UNCERTAIN</code>.
     * </p>
     * 
     * @param quality
     *        Optional. A string that describes the quality of the value. Accepts substitution templates. Must be
     *        <code>GOOD</code>, <code>BAD</code>, or <code>UNCERTAIN</code>.
     */

    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * Optional. A string that describes the quality of the value. Accepts substitution templates. Must be
     * <code>GOOD</code>, <code>BAD</code>, or <code>UNCERTAIN</code>.
     * </p>
     * 
     * @return Optional. A string that describes the quality of the value. Accepts substitution templates. Must be
     *         <code>GOOD</code>, <code>BAD</code>, or <code>UNCERTAIN</code>.
     */

    public String getQuality() {
        return this.quality;
    }

    /**
     * <p>
     * Optional. A string that describes the quality of the value. Accepts substitution templates. Must be
     * <code>GOOD</code>, <code>BAD</code>, or <code>UNCERTAIN</code>.
     * </p>
     * 
     * @param quality
     *        Optional. A string that describes the quality of the value. Accepts substitution templates. Must be
     *        <code>GOOD</code>, <code>BAD</code>, or <code>UNCERTAIN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyValue withQuality(String quality) {
        setQuality(quality);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getQuality() != null)
            sb.append("Quality: ").append(getQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetPropertyValue == false)
            return false;
        AssetPropertyValue other = (AssetPropertyValue) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        return hashCode;
    }

    @Override
    public AssetPropertyValue clone() {
        try {
            return (AssetPropertyValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AssetPropertyValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
