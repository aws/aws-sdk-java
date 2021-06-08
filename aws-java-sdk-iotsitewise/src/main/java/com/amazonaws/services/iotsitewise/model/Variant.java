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
 * Contains an asset property value (of a single type only).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Variant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Variant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Asset property data of type string (sequence of characters).
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * Asset property data of type integer (whole number).
     * </p>
     */
    private Integer integerValue;
    /**
     * <p>
     * Asset property data of type double (floating point number).
     * </p>
     */
    private Double doubleValue;
    /**
     * <p>
     * Asset property data of type Boolean (true or false).
     * </p>
     */
    private Boolean booleanValue;

    /**
     * <p>
     * Asset property data of type string (sequence of characters).
     * </p>
     * 
     * @param stringValue
     *        Asset property data of type string (sequence of characters).
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * Asset property data of type string (sequence of characters).
     * </p>
     * 
     * @return Asset property data of type string (sequence of characters).
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * Asset property data of type string (sequence of characters).
     * </p>
     * 
     * @param stringValue
     *        Asset property data of type string (sequence of characters).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Variant withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * Asset property data of type integer (whole number).
     * </p>
     * 
     * @param integerValue
     *        Asset property data of type integer (whole number).
     */

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * Asset property data of type integer (whole number).
     * </p>
     * 
     * @return Asset property data of type integer (whole number).
     */

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * Asset property data of type integer (whole number).
     * </p>
     * 
     * @param integerValue
     *        Asset property data of type integer (whole number).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Variant withIntegerValue(Integer integerValue) {
        setIntegerValue(integerValue);
        return this;
    }

    /**
     * <p>
     * Asset property data of type double (floating point number).
     * </p>
     * 
     * @param doubleValue
     *        Asset property data of type double (floating point number).
     */

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * Asset property data of type double (floating point number).
     * </p>
     * 
     * @return Asset property data of type double (floating point number).
     */

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * Asset property data of type double (floating point number).
     * </p>
     * 
     * @param doubleValue
     *        Asset property data of type double (floating point number).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Variant withDoubleValue(Double doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * Asset property data of type Boolean (true or false).
     * </p>
     * 
     * @param booleanValue
     *        Asset property data of type Boolean (true or false).
     */

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * Asset property data of type Boolean (true or false).
     * </p>
     * 
     * @return Asset property data of type Boolean (true or false).
     */

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * Asset property data of type Boolean (true or false).
     * </p>
     * 
     * @param booleanValue
     *        Asset property data of type Boolean (true or false).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Variant withBooleanValue(Boolean booleanValue) {
        setBooleanValue(booleanValue);
        return this;
    }

    /**
     * <p>
     * Asset property data of type Boolean (true or false).
     * </p>
     * 
     * @return Asset property data of type Boolean (true or false).
     */

    public Boolean isBooleanValue() {
        return this.booleanValue;
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

        if (obj instanceof Variant == false)
            return false;
        Variant other = (Variant) obj;
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
    public Variant clone() {
        try {
            return (Variant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.VariantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
