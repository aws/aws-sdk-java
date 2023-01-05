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
 * Defines the modifications that you are making to an attribute for a what-if forecast. For example, you can use this
 * operation to create a what-if forecast that investigates a 10% off sale on all shoes. To do this, you specify
 * <code>"AttributeName": "shoes"</code>, <code>"Operation": "MULTIPLY"</code>, and <code>"Value": "0.90"</code>. Pair
 * this operation with the <a>TimeSeriesCondition</a> operation within the
 * <a>CreateWhatIfForecastRequest$TimeSeriesTransformations</a> operation to define a subset of attribute items that are
 * modified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The related time series that you are modifying. This value is case insensitive.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The operation that is applied to the provided attribute. Operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code> - adds <code>Value</code> to all rows of <code>AttributeName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBTRACT</code> - subtracts <code>Value</code> from all rows of <code>AttributeName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTIPLY</code> - multiplies all rows of <code>AttributeName</code> by <code>Value</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIVIDE</code> - divides all rows of <code>AttributeName</code> by <code>Value</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String operation;
    /**
     * <p>
     * The value that is applied for the chosen <code>Operation</code>.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The related time series that you are modifying. This value is case insensitive.
     * </p>
     * 
     * @param attributeName
     *        The related time series that you are modifying. This value is case insensitive.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The related time series that you are modifying. This value is case insensitive.
     * </p>
     * 
     * @return The related time series that you are modifying. This value is case insensitive.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The related time series that you are modifying. This value is case insensitive.
     * </p>
     * 
     * @param attributeName
     *        The related time series that you are modifying. This value is case insensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The operation that is applied to the provided attribute. Operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code> - adds <code>Value</code> to all rows of <code>AttributeName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBTRACT</code> - subtracts <code>Value</code> from all rows of <code>AttributeName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTIPLY</code> - multiplies all rows of <code>AttributeName</code> by <code>Value</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIVIDE</code> - divides all rows of <code>AttributeName</code> by <code>Value</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operation
     *        The operation that is applied to the provided attribute. Operations include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADD</code> - adds <code>Value</code> to all rows of <code>AttributeName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBTRACT</code> - subtracts <code>Value</code> from all rows of <code>AttributeName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTIPLY</code> - multiplies all rows of <code>AttributeName</code> by <code>Value</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIVIDE</code> - divides all rows of <code>AttributeName</code> by <code>Value</code>.
     *        </p>
     *        </li>
     * @see Operation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The operation that is applied to the provided attribute. Operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code> - adds <code>Value</code> to all rows of <code>AttributeName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBTRACT</code> - subtracts <code>Value</code> from all rows of <code>AttributeName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTIPLY</code> - multiplies all rows of <code>AttributeName</code> by <code>Value</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIVIDE</code> - divides all rows of <code>AttributeName</code> by <code>Value</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The operation that is applied to the provided attribute. Operations include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ADD</code> - adds <code>Value</code> to all rows of <code>AttributeName</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUBTRACT</code> - subtracts <code>Value</code> from all rows of <code>AttributeName</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MULTIPLY</code> - multiplies all rows of <code>AttributeName</code> by <code>Value</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DIVIDE</code> - divides all rows of <code>AttributeName</code> by <code>Value</code>.
     *         </p>
     *         </li>
     * @see Operation
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The operation that is applied to the provided attribute. Operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code> - adds <code>Value</code> to all rows of <code>AttributeName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBTRACT</code> - subtracts <code>Value</code> from all rows of <code>AttributeName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTIPLY</code> - multiplies all rows of <code>AttributeName</code> by <code>Value</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIVIDE</code> - divides all rows of <code>AttributeName</code> by <code>Value</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operation
     *        The operation that is applied to the provided attribute. Operations include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADD</code> - adds <code>Value</code> to all rows of <code>AttributeName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBTRACT</code> - subtracts <code>Value</code> from all rows of <code>AttributeName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTIPLY</code> - multiplies all rows of <code>AttributeName</code> by <code>Value</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIVIDE</code> - divides all rows of <code>AttributeName</code> by <code>Value</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public Action withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The operation that is applied to the provided attribute. Operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code> - adds <code>Value</code> to all rows of <code>AttributeName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBTRACT</code> - subtracts <code>Value</code> from all rows of <code>AttributeName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTIPLY</code> - multiplies all rows of <code>AttributeName</code> by <code>Value</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIVIDE</code> - divides all rows of <code>AttributeName</code> by <code>Value</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operation
     *        The operation that is applied to the provided attribute. Operations include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADD</code> - adds <code>Value</code> to all rows of <code>AttributeName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBTRACT</code> - subtracts <code>Value</code> from all rows of <code>AttributeName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTIPLY</code> - multiplies all rows of <code>AttributeName</code> by <code>Value</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIVIDE</code> - divides all rows of <code>AttributeName</code> by <code>Value</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public Action withOperation(Operation operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The value that is applied for the chosen <code>Operation</code>.
     * </p>
     * 
     * @param value
     *        The value that is applied for the chosen <code>Operation</code>.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value that is applied for the chosen <code>Operation</code>.
     * </p>
     * 
     * @return The value that is applied for the chosen <code>Operation</code>.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value that is applied for the chosen <code>Operation</code>.
     * </p>
     * 
     * @param value
     *        The value that is applied for the chosen <code>Operation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withValue(Double value) {
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
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

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
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

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
