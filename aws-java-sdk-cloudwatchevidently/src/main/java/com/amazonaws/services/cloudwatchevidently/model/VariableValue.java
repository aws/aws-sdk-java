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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value assigned to a feature variation. This structure must contain exactly one field. It can be
 * <code>boolValue</code>, <code>doubleValue</code>, <code>longValue</code>, or <code>stringValue</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/VariableValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VariableValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     * </p>
     */
    private Boolean boolValue;
    /**
     * <p>
     * If this feature uses the double integer variation type, this field contains the double integer value of this
     * variation.
     * </p>
     */
    private Double doubleValue;
    /**
     * <p>
     * If this feature uses the long variation type, this field contains the long value of this variation.
     * </p>
     */
    private Long longValue;
    /**
     * <p>
     * If this feature uses the string variation type, this field contains the string value of this variation.
     * </p>
     */
    private String stringValue;

    /**
     * <p>
     * If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     * </p>
     * 
     * @param boolValue
     *        If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     */

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    /**
     * <p>
     * If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     * </p>
     * 
     * @return If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     */

    public Boolean getBoolValue() {
        return this.boolValue;
    }

    /**
     * <p>
     * If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     * </p>
     * 
     * @param boolValue
     *        If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableValue withBoolValue(Boolean boolValue) {
        setBoolValue(boolValue);
        return this;
    }

    /**
     * <p>
     * If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     * </p>
     * 
     * @return If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     */

    public Boolean isBoolValue() {
        return this.boolValue;
    }

    /**
     * <p>
     * If this feature uses the double integer variation type, this field contains the double integer value of this
     * variation.
     * </p>
     * 
     * @param doubleValue
     *        If this feature uses the double integer variation type, this field contains the double integer value of
     *        this variation.
     */

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * If this feature uses the double integer variation type, this field contains the double integer value of this
     * variation.
     * </p>
     * 
     * @return If this feature uses the double integer variation type, this field contains the double integer value of
     *         this variation.
     */

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * If this feature uses the double integer variation type, this field contains the double integer value of this
     * variation.
     * </p>
     * 
     * @param doubleValue
     *        If this feature uses the double integer variation type, this field contains the double integer value of
     *        this variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableValue withDoubleValue(Double doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * If this feature uses the long variation type, this field contains the long value of this variation.
     * </p>
     * 
     * @param longValue
     *        If this feature uses the long variation type, this field contains the long value of this variation.
     */

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    /**
     * <p>
     * If this feature uses the long variation type, this field contains the long value of this variation.
     * </p>
     * 
     * @return If this feature uses the long variation type, this field contains the long value of this variation.
     */

    public Long getLongValue() {
        return this.longValue;
    }

    /**
     * <p>
     * If this feature uses the long variation type, this field contains the long value of this variation.
     * </p>
     * 
     * @param longValue
     *        If this feature uses the long variation type, this field contains the long value of this variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableValue withLongValue(Long longValue) {
        setLongValue(longValue);
        return this;
    }

    /**
     * <p>
     * If this feature uses the string variation type, this field contains the string value of this variation.
     * </p>
     * 
     * @param stringValue
     *        If this feature uses the string variation type, this field contains the string value of this variation.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * If this feature uses the string variation type, this field contains the string value of this variation.
     * </p>
     * 
     * @return If this feature uses the string variation type, this field contains the string value of this variation.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * If this feature uses the string variation type, this field contains the string value of this variation.
     * </p>
     * 
     * @param stringValue
     *        If this feature uses the string variation type, this field contains the string value of this variation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableValue withStringValue(String stringValue) {
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
        if (getBoolValue() != null)
            sb.append("BoolValue: ").append(getBoolValue()).append(",");
        if (getDoubleValue() != null)
            sb.append("DoubleValue: ").append(getDoubleValue()).append(",");
        if (getLongValue() != null)
            sb.append("LongValue: ").append(getLongValue()).append(",");
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

        if (obj instanceof VariableValue == false)
            return false;
        VariableValue other = (VariableValue) obj;
        if (other.getBoolValue() == null ^ this.getBoolValue() == null)
            return false;
        if (other.getBoolValue() != null && other.getBoolValue().equals(this.getBoolValue()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getLongValue() == null ^ this.getLongValue() == null)
            return false;
        if (other.getLongValue() != null && other.getLongValue().equals(this.getLongValue()) == false)
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

        hashCode = prime * hashCode + ((getBoolValue() == null) ? 0 : getBoolValue().hashCode());
        hashCode = prime * hashCode + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getLongValue() == null) ? 0 : getLongValue().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        return hashCode;
    }

    @Override
    public VariableValue clone() {
        try {
            return (VariableValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.VariableValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
