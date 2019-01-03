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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Custom metric dimension
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/MetricDimension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDimension implements Serializable, Cloneable, StructuredPojo {

    /**
     * The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN,
     * GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
     */
    private String comparisonOperator;
    /** The value to be compared. */
    private Double value;

    /**
     * The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN,
     * GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
     * 
     * @param comparisonOperator
     *        The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN,
     *        GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN,
     * GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
     * 
     * @return The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN,
     *         GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN,
     * GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
     * 
     * @param comparisonOperator
     *        The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN,
     *        GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDimension withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * The value to be compared.
     * 
     * @param value
     *        The value to be compared.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * The value to be compared.
     * 
     * @return The value to be compared.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * The value to be compared.
     * 
     * @param value
     *        The value to be compared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDimension withValue(Double value) {
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
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
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

        if (obj instanceof MetricDimension == false)
            return false;
        MetricDimension other = (MetricDimension) obj;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
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

        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public MetricDimension clone() {
        try {
            return (MetricDimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.MetricDimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
