/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains asset property value information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetPropertyValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetPropertyValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the asset property (see <code>Variant</code>).
     * </p>
     */
    private Variant value;
    /**
     * <p>
     * The timestamp of the asset property value.
     * </p>
     */
    private TimeInNanos timestamp;
    /**
     * <p>
     * The quality of the asset property value.
     * </p>
     */
    private String quality;

    /**
     * <p>
     * The value of the asset property (see <code>Variant</code>).
     * </p>
     * 
     * @param value
     *        The value of the asset property (see <code>Variant</code>).
     */

    public void setValue(Variant value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the asset property (see <code>Variant</code>).
     * </p>
     * 
     * @return The value of the asset property (see <code>Variant</code>).
     */

    public Variant getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the asset property (see <code>Variant</code>).
     * </p>
     * 
     * @param value
     *        The value of the asset property (see <code>Variant</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyValue withValue(Variant value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The timestamp of the asset property value.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the asset property value.
     */

    public void setTimestamp(TimeInNanos timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the asset property value.
     * </p>
     * 
     * @return The timestamp of the asset property value.
     */

    public TimeInNanos getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the asset property value.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the asset property value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyValue withTimestamp(TimeInNanos timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The quality of the asset property value.
     * </p>
     * 
     * @param quality
     *        The quality of the asset property value.
     * @see Quality
     */

    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * The quality of the asset property value.
     * </p>
     * 
     * @return The quality of the asset property value.
     * @see Quality
     */

    public String getQuality() {
        return this.quality;
    }

    /**
     * <p>
     * The quality of the asset property value.
     * </p>
     * 
     * @param quality
     *        The quality of the asset property value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Quality
     */

    public AssetPropertyValue withQuality(String quality) {
        setQuality(quality);
        return this;
    }

    /**
     * <p>
     * The quality of the asset property value.
     * </p>
     * 
     * @param quality
     *        The quality of the asset property value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Quality
     */

    public AssetPropertyValue withQuality(Quality quality) {
        this.quality = quality.toString();
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
        com.amazonaws.services.iotsitewise.model.transform.AssetPropertyValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
