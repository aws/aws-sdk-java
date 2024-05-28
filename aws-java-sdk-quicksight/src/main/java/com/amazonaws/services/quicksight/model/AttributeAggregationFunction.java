/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Aggregation for attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AttributeAggregationFunction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeAggregationFunction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The built-in aggregation functions for attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIQUE_VALUE</code>: Returns the unique value for a field, aggregated by the dimension fields.
     * </p>
     * </li>
     * </ul>
     */
    private String simpleAttributeAggregation;
    /**
     * <p>
     * Used by the <code>UNIQUE_VALUE</code> aggregation function. If there are multiple values for the field used by
     * the aggregation, the value for this property will be returned instead. Defaults to '*'.
     * </p>
     */
    private String valueForMultipleValues;

    /**
     * <p>
     * The built-in aggregation functions for attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIQUE_VALUE</code>: Returns the unique value for a field, aggregated by the dimension fields.
     * </p>
     * </li>
     * </ul>
     * 
     * @param simpleAttributeAggregation
     *        The built-in aggregation functions for attributes.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNIQUE_VALUE</code>: Returns the unique value for a field, aggregated by the dimension fields.
     *        </p>
     *        </li>
     * @see SimpleAttributeAggregationFunction
     */

    public void setSimpleAttributeAggregation(String simpleAttributeAggregation) {
        this.simpleAttributeAggregation = simpleAttributeAggregation;
    }

    /**
     * <p>
     * The built-in aggregation functions for attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIQUE_VALUE</code>: Returns the unique value for a field, aggregated by the dimension fields.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The built-in aggregation functions for attributes.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>UNIQUE_VALUE</code>: Returns the unique value for a field, aggregated by the dimension fields.
     *         </p>
     *         </li>
     * @see SimpleAttributeAggregationFunction
     */

    public String getSimpleAttributeAggregation() {
        return this.simpleAttributeAggregation;
    }

    /**
     * <p>
     * The built-in aggregation functions for attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIQUE_VALUE</code>: Returns the unique value for a field, aggregated by the dimension fields.
     * </p>
     * </li>
     * </ul>
     * 
     * @param simpleAttributeAggregation
     *        The built-in aggregation functions for attributes.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNIQUE_VALUE</code>: Returns the unique value for a field, aggregated by the dimension fields.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimpleAttributeAggregationFunction
     */

    public AttributeAggregationFunction withSimpleAttributeAggregation(String simpleAttributeAggregation) {
        setSimpleAttributeAggregation(simpleAttributeAggregation);
        return this;
    }

    /**
     * <p>
     * The built-in aggregation functions for attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIQUE_VALUE</code>: Returns the unique value for a field, aggregated by the dimension fields.
     * </p>
     * </li>
     * </ul>
     * 
     * @param simpleAttributeAggregation
     *        The built-in aggregation functions for attributes.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNIQUE_VALUE</code>: Returns the unique value for a field, aggregated by the dimension fields.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimpleAttributeAggregationFunction
     */

    public AttributeAggregationFunction withSimpleAttributeAggregation(SimpleAttributeAggregationFunction simpleAttributeAggregation) {
        this.simpleAttributeAggregation = simpleAttributeAggregation.toString();
        return this;
    }

    /**
     * <p>
     * Used by the <code>UNIQUE_VALUE</code> aggregation function. If there are multiple values for the field used by
     * the aggregation, the value for this property will be returned instead. Defaults to '*'.
     * </p>
     * 
     * @param valueForMultipleValues
     *        Used by the <code>UNIQUE_VALUE</code> aggregation function. If there are multiple values for the field
     *        used by the aggregation, the value for this property will be returned instead. Defaults to '*'.
     */

    public void setValueForMultipleValues(String valueForMultipleValues) {
        this.valueForMultipleValues = valueForMultipleValues;
    }

    /**
     * <p>
     * Used by the <code>UNIQUE_VALUE</code> aggregation function. If there are multiple values for the field used by
     * the aggregation, the value for this property will be returned instead. Defaults to '*'.
     * </p>
     * 
     * @return Used by the <code>UNIQUE_VALUE</code> aggregation function. If there are multiple values for the field
     *         used by the aggregation, the value for this property will be returned instead. Defaults to '*'.
     */

    public String getValueForMultipleValues() {
        return this.valueForMultipleValues;
    }

    /**
     * <p>
     * Used by the <code>UNIQUE_VALUE</code> aggregation function. If there are multiple values for the field used by
     * the aggregation, the value for this property will be returned instead. Defaults to '*'.
     * </p>
     * 
     * @param valueForMultipleValues
     *        Used by the <code>UNIQUE_VALUE</code> aggregation function. If there are multiple values for the field
     *        used by the aggregation, the value for this property will be returned instead. Defaults to '*'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeAggregationFunction withValueForMultipleValues(String valueForMultipleValues) {
        setValueForMultipleValues(valueForMultipleValues);
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
        if (getSimpleAttributeAggregation() != null)
            sb.append("SimpleAttributeAggregation: ").append(getSimpleAttributeAggregation()).append(",");
        if (getValueForMultipleValues() != null)
            sb.append("ValueForMultipleValues: ").append(getValueForMultipleValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeAggregationFunction == false)
            return false;
        AttributeAggregationFunction other = (AttributeAggregationFunction) obj;
        if (other.getSimpleAttributeAggregation() == null ^ this.getSimpleAttributeAggregation() == null)
            return false;
        if (other.getSimpleAttributeAggregation() != null && other.getSimpleAttributeAggregation().equals(this.getSimpleAttributeAggregation()) == false)
            return false;
        if (other.getValueForMultipleValues() == null ^ this.getValueForMultipleValues() == null)
            return false;
        if (other.getValueForMultipleValues() != null && other.getValueForMultipleValues().equals(this.getValueForMultipleValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimpleAttributeAggregation() == null) ? 0 : getSimpleAttributeAggregation().hashCode());
        hashCode = prime * hashCode + ((getValueForMultipleValues() == null) ? 0 : getValueForMultipleValues().hashCode());
        return hashCode;
    }

    @Override
    public AttributeAggregationFunction clone() {
        try {
            return (AttributeAggregationFunction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AttributeAggregationFunctionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
