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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Creates a subset of items within an attribute that are modified. For example, you can use this operation to create a
 * subset of items that cost $5 or less. To do this, you specify <code>"AttributeName": "price"</code>,
 * <code>"AttributeValue": "5"</code>, and <code>"Condition": "LESS_THAN"</code>. Pair this operation with the
 * <a>Action</a> operation within the <a>CreateWhatIfForecastRequest$TimeSeriesTransformations</a> operation to define
 * how the attribute is modified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/TimeSeriesCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The item_id, dimension name, IM name, or timestamp that you are modifying.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The value that is applied for the chosen <code>Condition</code>.
     * </p>
     */
    private String attributeValue;
    /**
     * <p>
     * The condition to apply. Valid values are <code>EQUALS</code>, <code>NOT_EQUALS</code>, <code>LESS_THAN</code> and
     * <code>GREATER_THAN</code>.
     * </p>
     */
    private String condition;

    /**
     * <p>
     * The item_id, dimension name, IM name, or timestamp that you are modifying.
     * </p>
     * 
     * @param attributeName
     *        The item_id, dimension name, IM name, or timestamp that you are modifying.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The item_id, dimension name, IM name, or timestamp that you are modifying.
     * </p>
     * 
     * @return The item_id, dimension name, IM name, or timestamp that you are modifying.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The item_id, dimension name, IM name, or timestamp that you are modifying.
     * </p>
     * 
     * @param attributeName
     *        The item_id, dimension name, IM name, or timestamp that you are modifying.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesCondition withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The value that is applied for the chosen <code>Condition</code>.
     * </p>
     * 
     * @param attributeValue
     *        The value that is applied for the chosen <code>Condition</code>.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value that is applied for the chosen <code>Condition</code>.
     * </p>
     * 
     * @return The value that is applied for the chosen <code>Condition</code>.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The value that is applied for the chosen <code>Condition</code>.
     * </p>
     * 
     * @param attributeValue
     *        The value that is applied for the chosen <code>Condition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesCondition withAttributeValue(String attributeValue) {
        setAttributeValue(attributeValue);
        return this;
    }

    /**
     * <p>
     * The condition to apply. Valid values are <code>EQUALS</code>, <code>NOT_EQUALS</code>, <code>LESS_THAN</code> and
     * <code>GREATER_THAN</code>.
     * </p>
     * 
     * @param condition
     *        The condition to apply. Valid values are <code>EQUALS</code>, <code>NOT_EQUALS</code>,
     *        <code>LESS_THAN</code> and <code>GREATER_THAN</code>.
     * @see Condition
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition to apply. Valid values are <code>EQUALS</code>, <code>NOT_EQUALS</code>, <code>LESS_THAN</code> and
     * <code>GREATER_THAN</code>.
     * </p>
     * 
     * @return The condition to apply. Valid values are <code>EQUALS</code>, <code>NOT_EQUALS</code>,
     *         <code>LESS_THAN</code> and <code>GREATER_THAN</code>.
     * @see Condition
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The condition to apply. Valid values are <code>EQUALS</code>, <code>NOT_EQUALS</code>, <code>LESS_THAN</code> and
     * <code>GREATER_THAN</code>.
     * </p>
     * 
     * @param condition
     *        The condition to apply. Valid values are <code>EQUALS</code>, <code>NOT_EQUALS</code>,
     *        <code>LESS_THAN</code> and <code>GREATER_THAN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Condition
     */

    public TimeSeriesCondition withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The condition to apply. Valid values are <code>EQUALS</code>, <code>NOT_EQUALS</code>, <code>LESS_THAN</code> and
     * <code>GREATER_THAN</code>.
     * </p>
     * 
     * @param condition
     *        The condition to apply. Valid values are <code>EQUALS</code>, <code>NOT_EQUALS</code>,
     *        <code>LESS_THAN</code> and <code>GREATER_THAN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Condition
     */

    public TimeSeriesCondition withCondition(Condition condition) {
        this.condition = condition.toString();
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: ").append(getAttributeValue()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesCondition == false)
            return false;
        TimeSeriesCondition other = (TimeSeriesCondition) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesCondition clone() {
        try {
            return (TimeSeriesCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.TimeSeriesConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
