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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The dynamic configuration of the reference line data configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ReferenceLineDynamicDataConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceLineDynamicDataConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column that the dynamic data targets.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * The aggregation function that is used in the dynamic data.
     * </p>
     */
    private AggregationFunction measureAggregationFunction;
    /**
     * <p>
     * The calculation that is used in the dynamic data.
     * </p>
     */
    private NumericalAggregationFunction calculation;

    /**
     * <p>
     * The column that the dynamic data targets.
     * </p>
     * 
     * @param column
     *        The column that the dynamic data targets.
     */

    public void setColumn(ColumnIdentifier column) {
        this.column = column;
    }

    /**
     * <p>
     * The column that the dynamic data targets.
     * </p>
     * 
     * @return The column that the dynamic data targets.
     */

    public ColumnIdentifier getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column that the dynamic data targets.
     * </p>
     * 
     * @param column
     *        The column that the dynamic data targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineDynamicDataConfiguration withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The aggregation function that is used in the dynamic data.
     * </p>
     * 
     * @param measureAggregationFunction
     *        The aggregation function that is used in the dynamic data.
     */

    public void setMeasureAggregationFunction(AggregationFunction measureAggregationFunction) {
        this.measureAggregationFunction = measureAggregationFunction;
    }

    /**
     * <p>
     * The aggregation function that is used in the dynamic data.
     * </p>
     * 
     * @return The aggregation function that is used in the dynamic data.
     */

    public AggregationFunction getMeasureAggregationFunction() {
        return this.measureAggregationFunction;
    }

    /**
     * <p>
     * The aggregation function that is used in the dynamic data.
     * </p>
     * 
     * @param measureAggregationFunction
     *        The aggregation function that is used in the dynamic data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineDynamicDataConfiguration withMeasureAggregationFunction(AggregationFunction measureAggregationFunction) {
        setMeasureAggregationFunction(measureAggregationFunction);
        return this;
    }

    /**
     * <p>
     * The calculation that is used in the dynamic data.
     * </p>
     * 
     * @param calculation
     *        The calculation that is used in the dynamic data.
     */

    public void setCalculation(NumericalAggregationFunction calculation) {
        this.calculation = calculation;
    }

    /**
     * <p>
     * The calculation that is used in the dynamic data.
     * </p>
     * 
     * @return The calculation that is used in the dynamic data.
     */

    public NumericalAggregationFunction getCalculation() {
        return this.calculation;
    }

    /**
     * <p>
     * The calculation that is used in the dynamic data.
     * </p>
     * 
     * @param calculation
     *        The calculation that is used in the dynamic data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineDynamicDataConfiguration withCalculation(NumericalAggregationFunction calculation) {
        setCalculation(calculation);
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
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getMeasureAggregationFunction() != null)
            sb.append("MeasureAggregationFunction: ").append(getMeasureAggregationFunction()).append(",");
        if (getCalculation() != null)
            sb.append("Calculation: ").append(getCalculation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceLineDynamicDataConfiguration == false)
            return false;
        ReferenceLineDynamicDataConfiguration other = (ReferenceLineDynamicDataConfiguration) obj;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getMeasureAggregationFunction() == null ^ this.getMeasureAggregationFunction() == null)
            return false;
        if (other.getMeasureAggregationFunction() != null && other.getMeasureAggregationFunction().equals(this.getMeasureAggregationFunction()) == false)
            return false;
        if (other.getCalculation() == null ^ this.getCalculation() == null)
            return false;
        if (other.getCalculation() != null && other.getCalculation().equals(this.getCalculation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getMeasureAggregationFunction() == null) ? 0 : getMeasureAggregationFunction().hashCode());
        hashCode = prime * hashCode + ((getCalculation() == null) ? 0 : getCalculation().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceLineDynamicDataConfiguration clone() {
        try {
            return (ReferenceLineDynamicDataConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ReferenceLineDynamicDataConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
