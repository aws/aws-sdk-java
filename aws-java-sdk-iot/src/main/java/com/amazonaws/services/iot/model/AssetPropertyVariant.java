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
 * Contains an asset property value (of a single type).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetPropertyVariant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Optional. The string value of the value entry. Accepts substitution templates.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
     * </p>
     */
    private String integerValue;
    /**
     * <p>
     * Optional. A string that contains the double value of the value entry. Accepts substitution templates.
     * </p>
     */
    private String doubleValue;
    /**
     * <p>
     * Optional. A string that contains the boolean value (<code>true</code> or <code>false</code>) of the value entry.
     * Accepts substitution templates.
     * </p>
     */
    private String booleanValue;

    /**
     * <p>
     * Optional. The string value of the value entry. Accepts substitution templates.
     * </p>
     * 
     * @param stringValue
     *        Optional. The string value of the value entry. Accepts substitution templates.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * Optional. The string value of the value entry. Accepts substitution templates.
     * </p>
     * 
     * @return Optional. The string value of the value entry. Accepts substitution templates.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * Optional. The string value of the value entry. Accepts substitution templates.
     * </p>
     * 
     * @param stringValue
     *        Optional. The string value of the value entry. Accepts substitution templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyVariant withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
     * </p>
     * 
     * @param integerValue
     *        Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
     */

    public void setIntegerValue(String integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
     * </p>
     * 
     * @return Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
     */

    public String getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
     * </p>
     * 
     * @param integerValue
     *        Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyVariant withIntegerValue(String integerValue) {
        setIntegerValue(integerValue);
        return this;
    }

    /**
     * <p>
     * Optional. A string that contains the double value of the value entry. Accepts substitution templates.
     * </p>
     * 
     * @param doubleValue
     *        Optional. A string that contains the double value of the value entry. Accepts substitution templates.
     */

    public void setDoubleValue(String doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * Optional. A string that contains the double value of the value entry. Accepts substitution templates.
     * </p>
     * 
     * @return Optional. A string that contains the double value of the value entry. Accepts substitution templates.
     */

    public String getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * Optional. A string that contains the double value of the value entry. Accepts substitution templates.
     * </p>
     * 
     * @param doubleValue
     *        Optional. A string that contains the double value of the value entry. Accepts substitution templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyVariant withDoubleValue(String doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * Optional. A string that contains the boolean value (<code>true</code> or <code>false</code>) of the value entry.
     * Accepts substitution templates.
     * </p>
     * 
     * @param booleanValue
     *        Optional. A string that contains the boolean value (<code>true</code> or <code>false</code>) of the value
     *        entry. Accepts substitution templates.
     */

    public void setBooleanValue(String booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * Optional. A string that contains the boolean value (<code>true</code> or <code>false</code>) of the value entry.
     * Accepts substitution templates.
     * </p>
     * 
     * @return Optional. A string that contains the boolean value (<code>true</code> or <code>false</code>) of the value
     *         entry. Accepts substitution templates.
     */

    public String getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * Optional. A string that contains the boolean value (<code>true</code> or <code>false</code>) of the value entry.
     * Accepts substitution templates.
     * </p>
     * 
     * @param booleanValue
     *        Optional. A string that contains the boolean value (<code>true</code> or <code>false</code>) of the value
     *        entry. Accepts substitution templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyVariant withBooleanValue(String booleanValue) {
        setBooleanValue(booleanValue);
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
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getIntegerValue() != null)
            sb.append("IntegerValue: ").append(getIntegerValue()).append(",");
        if (getDoubleValue() != null)
            sb.append("DoubleValue: ").append(getDoubleValue()).append(",");
        if (getBooleanValue() != null)
            sb.append("BooleanValue: ").append(getBooleanValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetPropertyVariant == false)
            return false;
        AssetPropertyVariant other = (AssetPropertyVariant) obj;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null)
            return false;
        if (other.getIntegerValue() != null && other.getIntegerValue().equals(this.getIntegerValue()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getBooleanValue() == null ^ this.getBooleanValue() == null)
            return false;
        if (other.getBooleanValue() != null && other.getBooleanValue().equals(this.getBooleanValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        hashCode = prime * hashCode + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getBooleanValue() == null) ? 0 : getBooleanValue().hashCode());
        return hashCode;
    }

    @Override
    public AssetPropertyVariant clone() {
        try {
            return (AssetPropertyVariant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AssetPropertyVariantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
