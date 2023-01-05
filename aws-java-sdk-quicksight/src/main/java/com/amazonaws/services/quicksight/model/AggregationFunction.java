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
 * An aggregation function aggregates values from a dimension or measure.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AggregationFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregationFunction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Aggregation for numerical values.
     * </p>
     */
    private NumericalAggregationFunction numericalAggregationFunction;
    /**
     * <p>
     * Aggregation for categorical values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     * </p>
     * </li>
     * </ul>
     */
    private String categoricalAggregationFunction;
    /**
     * <p>
     * Aggregation for date values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIN</code>: Select the smallest date value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX</code>: Select the largest date value.
     * </p>
     * </li>
     * </ul>
     */
    private String dateAggregationFunction;

    /**
     * <p>
     * Aggregation for numerical values.
     * </p>
     * 
     * @param numericalAggregationFunction
     *        Aggregation for numerical values.
     */

    public void setNumericalAggregationFunction(NumericalAggregationFunction numericalAggregationFunction) {
        this.numericalAggregationFunction = numericalAggregationFunction;
    }

    /**
     * <p>
     * Aggregation for numerical values.
     * </p>
     * 
     * @return Aggregation for numerical values.
     */

    public NumericalAggregationFunction getNumericalAggregationFunction() {
        return this.numericalAggregationFunction;
    }

    /**
     * <p>
     * Aggregation for numerical values.
     * </p>
     * 
     * @param numericalAggregationFunction
     *        Aggregation for numerical values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationFunction withNumericalAggregationFunction(NumericalAggregationFunction numericalAggregationFunction) {
        setNumericalAggregationFunction(numericalAggregationFunction);
        return this;
    }

    /**
     * <p>
     * Aggregation for categorical values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     * </p>
     * </li>
     * </ul>
     * 
     * @param categoricalAggregationFunction
     *        Aggregation for categorical values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     *        </p>
     *        </li>
     * @see CategoricalAggregationFunction
     */

    public void setCategoricalAggregationFunction(String categoricalAggregationFunction) {
        this.categoricalAggregationFunction = categoricalAggregationFunction;
    }

    /**
     * <p>
     * Aggregation for categorical values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Aggregation for categorical values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     *         </p>
     *         </li>
     * @see CategoricalAggregationFunction
     */

    public String getCategoricalAggregationFunction() {
        return this.categoricalAggregationFunction;
    }

    /**
     * <p>
     * Aggregation for categorical values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     * </p>
     * </li>
     * </ul>
     * 
     * @param categoricalAggregationFunction
     *        Aggregation for categorical values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CategoricalAggregationFunction
     */

    public AggregationFunction withCategoricalAggregationFunction(String categoricalAggregationFunction) {
        setCategoricalAggregationFunction(categoricalAggregationFunction);
        return this;
    }

    /**
     * <p>
     * Aggregation for categorical values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     * </p>
     * </li>
     * </ul>
     * 
     * @param categoricalAggregationFunction
     *        Aggregation for categorical values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CategoricalAggregationFunction
     */

    public AggregationFunction withCategoricalAggregationFunction(CategoricalAggregationFunction categoricalAggregationFunction) {
        this.categoricalAggregationFunction = categoricalAggregationFunction.toString();
        return this;
    }

    /**
     * <p>
     * Aggregation for date values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIN</code>: Select the smallest date value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX</code>: Select the largest date value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dateAggregationFunction
     *        Aggregation for date values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIN</code>: Select the smallest date value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAX</code>: Select the largest date value.
     *        </p>
     *        </li>
     * @see DateAggregationFunction
     */

    public void setDateAggregationFunction(String dateAggregationFunction) {
        this.dateAggregationFunction = dateAggregationFunction;
    }

    /**
     * <p>
     * Aggregation for date values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIN</code>: Select the smallest date value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX</code>: Select the largest date value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Aggregation for date values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MIN</code>: Select the smallest date value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MAX</code>: Select the largest date value.
     *         </p>
     *         </li>
     * @see DateAggregationFunction
     */

    public String getDateAggregationFunction() {
        return this.dateAggregationFunction;
    }

    /**
     * <p>
     * Aggregation for date values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIN</code>: Select the smallest date value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX</code>: Select the largest date value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dateAggregationFunction
     *        Aggregation for date values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIN</code>: Select the smallest date value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAX</code>: Select the largest date value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DateAggregationFunction
     */

    public AggregationFunction withDateAggregationFunction(String dateAggregationFunction) {
        setDateAggregationFunction(dateAggregationFunction);
        return this;
    }

    /**
     * <p>
     * Aggregation for date values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIN</code>: Select the smallest date value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAX</code>: Select the largest date value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dateAggregationFunction
     *        Aggregation for date values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: Aggregate by the total number of values, including duplicates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISTINCT_COUNT</code>: Aggregate by the total number of distinct values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIN</code>: Select the smallest date value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAX</code>: Select the largest date value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DateAggregationFunction
     */

    public AggregationFunction withDateAggregationFunction(DateAggregationFunction dateAggregationFunction) {
        this.dateAggregationFunction = dateAggregationFunction.toString();
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
        if (getNumericalAggregationFunction() != null)
            sb.append("NumericalAggregationFunction: ").append(getNumericalAggregationFunction()).append(",");
        if (getCategoricalAggregationFunction() != null)
            sb.append("CategoricalAggregationFunction: ").append(getCategoricalAggregationFunction()).append(",");
        if (getDateAggregationFunction() != null)
            sb.append("DateAggregationFunction: ").append(getDateAggregationFunction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregationFunction == false)
            return false;
        AggregationFunction other = (AggregationFunction) obj;
        if (other.getNumericalAggregationFunction() == null ^ this.getNumericalAggregationFunction() == null)
            return false;
        if (other.getNumericalAggregationFunction() != null && other.getNumericalAggregationFunction().equals(this.getNumericalAggregationFunction()) == false)
            return false;
        if (other.getCategoricalAggregationFunction() == null ^ this.getCategoricalAggregationFunction() == null)
            return false;
        if (other.getCategoricalAggregationFunction() != null
                && other.getCategoricalAggregationFunction().equals(this.getCategoricalAggregationFunction()) == false)
            return false;
        if (other.getDateAggregationFunction() == null ^ this.getDateAggregationFunction() == null)
            return false;
        if (other.getDateAggregationFunction() != null && other.getDateAggregationFunction().equals(this.getDateAggregationFunction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumericalAggregationFunction() == null) ? 0 : getNumericalAggregationFunction().hashCode());
        hashCode = prime * hashCode + ((getCategoricalAggregationFunction() == null) ? 0 : getCategoricalAggregationFunction().hashCode());
        hashCode = prime * hashCode + ((getDateAggregationFunction() == null) ? 0 : getDateAggregationFunction().hashCode());
        return hashCode;
    }

    @Override
    public AggregationFunction clone() {
        try {
            return (AggregationFunction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AggregationFunctionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
