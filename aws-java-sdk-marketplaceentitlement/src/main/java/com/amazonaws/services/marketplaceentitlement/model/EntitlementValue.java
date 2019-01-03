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
package com.amazonaws.services.marketplaceentitlement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entitlement.marketplace-2017-01-11/EntitlementValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntitlementValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IntegerValue field will be populated with an integer value when the entitlement is an integer type.
     * Otherwise, the field will not be set.
     * </p>
     */
    private Integer integerValue;
    /**
     * <p>
     * The DoubleValue field will be populated with a double value when the entitlement is a double type. Otherwise, the
     * field will not be set.
     * </p>
     */
    private Double doubleValue;
    /**
     * <p>
     * The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type. Otherwise,
     * the field will not be set.
     * </p>
     */
    private Boolean booleanValue;
    /**
     * <p>
     * The StringValue field will be populated with a string value when the entitlement is a string type. Otherwise, the
     * field will not be set.
     * </p>
     */
    private String stringValue;

    /**
     * <p>
     * The IntegerValue field will be populated with an integer value when the entitlement is an integer type.
     * Otherwise, the field will not be set.
     * </p>
     * 
     * @param integerValue
     *        The IntegerValue field will be populated with an integer value when the entitlement is an integer type.
     *        Otherwise, the field will not be set.
     */

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * The IntegerValue field will be populated with an integer value when the entitlement is an integer type.
     * Otherwise, the field will not be set.
     * </p>
     * 
     * @return The IntegerValue field will be populated with an integer value when the entitlement is an integer type.
     *         Otherwise, the field will not be set.
     */

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * The IntegerValue field will be populated with an integer value when the entitlement is an integer type.
     * Otherwise, the field will not be set.
     * </p>
     * 
     * @param integerValue
     *        The IntegerValue field will be populated with an integer value when the entitlement is an integer type.
     *        Otherwise, the field will not be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementValue withIntegerValue(Integer integerValue) {
        setIntegerValue(integerValue);
        return this;
    }

    /**
     * <p>
     * The DoubleValue field will be populated with a double value when the entitlement is a double type. Otherwise, the
     * field will not be set.
     * </p>
     * 
     * @param doubleValue
     *        The DoubleValue field will be populated with a double value when the entitlement is a double type.
     *        Otherwise, the field will not be set.
     */

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * The DoubleValue field will be populated with a double value when the entitlement is a double type. Otherwise, the
     * field will not be set.
     * </p>
     * 
     * @return The DoubleValue field will be populated with a double value when the entitlement is a double type.
     *         Otherwise, the field will not be set.
     */

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * The DoubleValue field will be populated with a double value when the entitlement is a double type. Otherwise, the
     * field will not be set.
     * </p>
     * 
     * @param doubleValue
     *        The DoubleValue field will be populated with a double value when the entitlement is a double type.
     *        Otherwise, the field will not be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementValue withDoubleValue(Double doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type. Otherwise,
     * the field will not be set.
     * </p>
     * 
     * @param booleanValue
     *        The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type.
     *        Otherwise, the field will not be set.
     */

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type. Otherwise,
     * the field will not be set.
     * </p>
     * 
     * @return The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type.
     *         Otherwise, the field will not be set.
     */

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type. Otherwise,
     * the field will not be set.
     * </p>
     * 
     * @param booleanValue
     *        The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type.
     *        Otherwise, the field will not be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementValue withBooleanValue(Boolean booleanValue) {
        setBooleanValue(booleanValue);
        return this;
    }

    /**
     * <p>
     * The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type. Otherwise,
     * the field will not be set.
     * </p>
     * 
     * @return The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type.
     *         Otherwise, the field will not be set.
     */

    public Boolean isBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * The StringValue field will be populated with a string value when the entitlement is a string type. Otherwise, the
     * field will not be set.
     * </p>
     * 
     * @param stringValue
     *        The StringValue field will be populated with a string value when the entitlement is a string type.
     *        Otherwise, the field will not be set.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The StringValue field will be populated with a string value when the entitlement is a string type. Otherwise, the
     * field will not be set.
     * </p>
     * 
     * @return The StringValue field will be populated with a string value when the entitlement is a string type.
     *         Otherwise, the field will not be set.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * The StringValue field will be populated with a string value when the entitlement is a string type. Otherwise, the
     * field will not be set.
     * </p>
     * 
     * @param stringValue
     *        The StringValue field will be populated with a string value when the entitlement is a string type.
     *        Otherwise, the field will not be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementValue withStringValue(String stringValue) {
        setStringValue(stringValue);
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
        if (getIntegerValue() != null)
            sb.append("IntegerValue: ").append(getIntegerValue()).append(",");
        if (getDoubleValue() != null)
            sb.append("DoubleValue: ").append(getDoubleValue()).append(",");
        if (getBooleanValue() != null)
            sb.append("BooleanValue: ").append(getBooleanValue()).append(",");
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntitlementValue == false)
            return false;
        EntitlementValue other = (EntitlementValue) obj;
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
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        hashCode = prime * hashCode + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getBooleanValue() == null) ? 0 : getBooleanValue().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        return hashCode;
    }

    @Override
    public EntitlementValue clone() {
        try {
            return (EntitlementValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceentitlement.model.transform.EntitlementValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
