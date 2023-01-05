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
 * Aggregation for numerical values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NumericalAggregationFunction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumericalAggregationFunction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Built-in aggregation functions for numerical values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUM</code>: The sum of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVERAGE</code>: The average of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIN</code>: The minimum value of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX</code>: The maximum value of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: The count of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: The count of distinct values in a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VAR</code>: The variance of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VARP</code>: The partitioned variance of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STDEV</code>: The standard deviation of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STDEVP</code>: The partitioned standard deviation of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIAN</code>: The median value of a dimension or measure.
     * </p>
     * </li>
     * </ul>
     */
    private String simpleNumericalAggregation;
    /**
     * <p>
     * An aggregation based on the percentile of values in a dimension or measure.
     * </p>
     */
    private PercentileAggregation percentileAggregation;

    /**
     * <p>
     * Built-in aggregation functions for numerical values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUM</code>: The sum of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVERAGE</code>: The average of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIN</code>: The minimum value of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX</code>: The maximum value of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: The count of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: The count of distinct values in a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VAR</code>: The variance of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VARP</code>: The partitioned variance of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STDEV</code>: The standard deviation of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STDEVP</code>: The partitioned standard deviation of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIAN</code>: The median value of a dimension or measure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param simpleNumericalAggregation
     *        Built-in aggregation functions for numerical values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUM</code>: The sum of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVERAGE</code>: The average of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIN</code>: The minimum value of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAX</code>: The maximum value of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: The count of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISTINCT_COUNT</code>: The count of distinct values in a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VAR</code>: The variance of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VARP</code>: The partitioned variance of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STDEV</code>: The standard deviation of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STDEVP</code>: The partitioned standard deviation of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIAN</code>: The median value of a dimension or measure.
     *        </p>
     *        </li>
     * @see SimpleNumericalAggregationFunction
     */

    public void setSimpleNumericalAggregation(String simpleNumericalAggregation) {
        this.simpleNumericalAggregation = simpleNumericalAggregation;
    }

    /**
     * <p>
     * Built-in aggregation functions for numerical values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUM</code>: The sum of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVERAGE</code>: The average of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIN</code>: The minimum value of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX</code>: The maximum value of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: The count of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: The count of distinct values in a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VAR</code>: The variance of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VARP</code>: The partitioned variance of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STDEV</code>: The standard deviation of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STDEVP</code>: The partitioned standard deviation of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIAN</code>: The median value of a dimension or measure.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Built-in aggregation functions for numerical values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUM</code>: The sum of a dimension or measure.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AVERAGE</code>: The average of a dimension or measure.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MIN</code>: The minimum value of a dimension or measure.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MAX</code>: The maximum value of a dimension or measure.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COUNT</code>: The count of a dimension or measure.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISTINCT_COUNT</code>: The count of distinct values in a dimension or measure.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VAR</code>: The variance of a dimension or measure.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VARP</code>: The partitioned variance of a dimension or measure.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STDEV</code>: The standard deviation of a dimension or measure.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STDEVP</code>: The partitioned standard deviation of a dimension or measure.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MEDIAN</code>: The median value of a dimension or measure.
     *         </p>
     *         </li>
     * @see SimpleNumericalAggregationFunction
     */

    public String getSimpleNumericalAggregation() {
        return this.simpleNumericalAggregation;
    }

    /**
     * <p>
     * Built-in aggregation functions for numerical values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUM</code>: The sum of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVERAGE</code>: The average of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIN</code>: The minimum value of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX</code>: The maximum value of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: The count of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: The count of distinct values in a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VAR</code>: The variance of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VARP</code>: The partitioned variance of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STDEV</code>: The standard deviation of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STDEVP</code>: The partitioned standard deviation of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIAN</code>: The median value of a dimension or measure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param simpleNumericalAggregation
     *        Built-in aggregation functions for numerical values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUM</code>: The sum of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVERAGE</code>: The average of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIN</code>: The minimum value of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAX</code>: The maximum value of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: The count of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISTINCT_COUNT</code>: The count of distinct values in a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VAR</code>: The variance of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VARP</code>: The partitioned variance of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STDEV</code>: The standard deviation of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STDEVP</code>: The partitioned standard deviation of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIAN</code>: The median value of a dimension or measure.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimpleNumericalAggregationFunction
     */

    public NumericalAggregationFunction withSimpleNumericalAggregation(String simpleNumericalAggregation) {
        setSimpleNumericalAggregation(simpleNumericalAggregation);
        return this;
    }

    /**
     * <p>
     * Built-in aggregation functions for numerical values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUM</code>: The sum of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVERAGE</code>: The average of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIN</code>: The minimum value of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX</code>: The maximum value of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: The count of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: The count of distinct values in a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VAR</code>: The variance of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VARP</code>: The partitioned variance of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STDEV</code>: The standard deviation of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STDEVP</code>: The partitioned standard deviation of a dimension or measure.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MEDIAN</code>: The median value of a dimension or measure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param simpleNumericalAggregation
     *        Built-in aggregation functions for numerical values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUM</code>: The sum of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVERAGE</code>: The average of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIN</code>: The minimum value of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAX</code>: The maximum value of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: The count of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISTINCT_COUNT</code>: The count of distinct values in a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VAR</code>: The variance of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VARP</code>: The partitioned variance of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STDEV</code>: The standard deviation of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STDEVP</code>: The partitioned standard deviation of a dimension or measure.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MEDIAN</code>: The median value of a dimension or measure.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimpleNumericalAggregationFunction
     */

    public NumericalAggregationFunction withSimpleNumericalAggregation(SimpleNumericalAggregationFunction simpleNumericalAggregation) {
        this.simpleNumericalAggregation = simpleNumericalAggregation.toString();
        return this;
    }

    /**
     * <p>
     * An aggregation based on the percentile of values in a dimension or measure.
     * </p>
     * 
     * @param percentileAggregation
     *        An aggregation based on the percentile of values in a dimension or measure.
     */

    public void setPercentileAggregation(PercentileAggregation percentileAggregation) {
        this.percentileAggregation = percentileAggregation;
    }

    /**
     * <p>
     * An aggregation based on the percentile of values in a dimension or measure.
     * </p>
     * 
     * @return An aggregation based on the percentile of values in a dimension or measure.
     */

    public PercentileAggregation getPercentileAggregation() {
        return this.percentileAggregation;
    }

    /**
     * <p>
     * An aggregation based on the percentile of values in a dimension or measure.
     * </p>
     * 
     * @param percentileAggregation
     *        An aggregation based on the percentile of values in a dimension or measure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericalAggregationFunction withPercentileAggregation(PercentileAggregation percentileAggregation) {
        setPercentileAggregation(percentileAggregation);
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
        if (getSimpleNumericalAggregation() != null)
            sb.append("SimpleNumericalAggregation: ").append(getSimpleNumericalAggregation()).append(",");
        if (getPercentileAggregation() != null)
            sb.append("PercentileAggregation: ").append(getPercentileAggregation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumericalAggregationFunction == false)
            return false;
        NumericalAggregationFunction other = (NumericalAggregationFunction) obj;
        if (other.getSimpleNumericalAggregation() == null ^ this.getSimpleNumericalAggregation() == null)
            return false;
        if (other.getSimpleNumericalAggregation() != null && other.getSimpleNumericalAggregation().equals(this.getSimpleNumericalAggregation()) == false)
            return false;
        if (other.getPercentileAggregation() == null ^ this.getPercentileAggregation() == null)
            return false;
        if (other.getPercentileAggregation() != null && other.getPercentileAggregation().equals(this.getPercentileAggregation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimpleNumericalAggregation() == null) ? 0 : getSimpleNumericalAggregation().hashCode());
        hashCode = prime * hashCode + ((getPercentileAggregation() == null) ? 0 : getPercentileAggregation().hashCode());
        return hashCode;
    }

    @Override
    public NumericalAggregationFunction clone() {
        try {
            return (NumericalAggregationFunction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NumericalAggregationFunctionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
