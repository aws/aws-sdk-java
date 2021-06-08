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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains an asset property value. For more information, see <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_Variant.html">Variant</a> in the <i>AWS IoT
 * SiteWise API Reference</i>.
 * </p>
 * <p>
 * You must use expressions for all parameters in <code>AssetPropertyVariant</code>. The expressions accept literals,
 * operators, functions, references, and substitution templates.
 * </p>
 * <p class="title">
 * <b>Examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For literal values, the expressions must contain single quotes. For example, the value for the
 * <code>integerValue</code> parameter can be <code>'100'</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For references, you must specify either variables or parameters. For example, the value for the
 * <code>booleanValue</code> parameter can be <code>$variable.offline</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a substitution template, you must use <code>${}</code>, and the template must be in single quotes. A substitution
 * template can also contain a combination of literals, operators, functions, references, and substitution templates.
 * </p>
 * <p>
 * In the following example, the value for the <code>doubleValue</code> parameter uses a substitution template.
 * </p>
 * <p>
 * <code>'${$input.TemperatureInput.sensorData.temperature * 6 / 5 + 32}'</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html">Expressions</a> in the
 * <i>AWS IoT Events Developer Guide</i>.
 * </p>
 * <p>
 * You must specify one of the following value types, depending on the <code>dataType</code> of the specified asset
 * property. For more information, see <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetProperty.html">AssetProperty</a> in the
 * <i>AWS IoT SiteWise API Reference</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/AssetPropertyVariant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetPropertyVariant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The asset property value is a string. You must use an expression, and the evaluated result should be a string.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * The asset property value is an integer. You must use an expression, and the evaluated result should be an
     * integer.
     * </p>
     */
    private String integerValue;
    /**
     * <p>
     * The asset property value is a double. You must use an expression, and the evaluated result should be a double.
     * </p>
     */
    private String doubleValue;
    /**
     * <p>
     * The asset property value is a Boolean value that must be <code>'TRUE'</code> or <code>'FALSE'</code>. You must
     * use an expression, and the evaluated result should be a Boolean value.
     * </p>
     */
    private String booleanValue;

    /**
     * <p>
     * The asset property value is a string. You must use an expression, and the evaluated result should be a string.
     * </p>
     * 
     * @param stringValue
     *        The asset property value is a string. You must use an expression, and the evaluated result should be a
     *        string.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The asset property value is a string. You must use an expression, and the evaluated result should be a string.
     * </p>
     * 
     * @return The asset property value is a string. You must use an expression, and the evaluated result should be a
     *         string.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * The asset property value is a string. You must use an expression, and the evaluated result should be a string.
     * </p>
     * 
     * @param stringValue
     *        The asset property value is a string. You must use an expression, and the evaluated result should be a
     *        string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyVariant withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * The asset property value is an integer. You must use an expression, and the evaluated result should be an
     * integer.
     * </p>
     * 
     * @param integerValue
     *        The asset property value is an integer. You must use an expression, and the evaluated result should be an
     *        integer.
     */

    public void setIntegerValue(String integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * The asset property value is an integer. You must use an expression, and the evaluated result should be an
     * integer.
     * </p>
     * 
     * @return The asset property value is an integer. You must use an expression, and the evaluated result should be an
     *         integer.
     */

    public String getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * The asset property value is an integer. You must use an expression, and the evaluated result should be an
     * integer.
     * </p>
     * 
     * @param integerValue
     *        The asset property value is an integer. You must use an expression, and the evaluated result should be an
     *        integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyVariant withIntegerValue(String integerValue) {
        setIntegerValue(integerValue);
        return this;
    }

    /**
     * <p>
     * The asset property value is a double. You must use an expression, and the evaluated result should be a double.
     * </p>
     * 
     * @param doubleValue
     *        The asset property value is a double. You must use an expression, and the evaluated result should be a
     *        double.
     */

    public void setDoubleValue(String doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * The asset property value is a double. You must use an expression, and the evaluated result should be a double.
     * </p>
     * 
     * @return The asset property value is a double. You must use an expression, and the evaluated result should be a
     *         double.
     */

    public String getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * The asset property value is a double. You must use an expression, and the evaluated result should be a double.
     * </p>
     * 
     * @param doubleValue
     *        The asset property value is a double. You must use an expression, and the evaluated result should be a
     *        double.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyVariant withDoubleValue(String doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * The asset property value is a Boolean value that must be <code>'TRUE'</code> or <code>'FALSE'</code>. You must
     * use an expression, and the evaluated result should be a Boolean value.
     * </p>
     * 
     * @param booleanValue
     *        The asset property value is a Boolean value that must be <code>'TRUE'</code> or <code>'FALSE'</code>. You
     *        must use an expression, and the evaluated result should be a Boolean value.
     */

    public void setBooleanValue(String booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * The asset property value is a Boolean value that must be <code>'TRUE'</code> or <code>'FALSE'</code>. You must
     * use an expression, and the evaluated result should be a Boolean value.
     * </p>
     * 
     * @return The asset property value is a Boolean value that must be <code>'TRUE'</code> or <code>'FALSE'</code>. You
     *         must use an expression, and the evaluated result should be a Boolean value.
     */

    public String getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * The asset property value is a Boolean value that must be <code>'TRUE'</code> or <code>'FALSE'</code>. You must
     * use an expression, and the evaluated result should be a Boolean value.
     * </p>
     * 
     * @param booleanValue
     *        The asset property value is a Boolean value that must be <code>'TRUE'</code> or <code>'FALSE'</code>. You
     *        must use an expression, and the evaluated result should be a Boolean value.
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
        com.amazonaws.services.iotevents.model.transform.AssetPropertyVariantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
