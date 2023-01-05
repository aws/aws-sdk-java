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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the set of parameters needed to perform aggregation in the aggregate transform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/AggregateOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the column on the data set on which the aggregation function will be applied.
     * </p>
     */
    private java.util.List<String> column;
    /**
     * <p>
     * Specifies the aggregation function to apply.
     * </p>
     * <p>
     * Possible aggregation functions include: avg countDistinct, count, first, last, kurtosis, max, min, skewness,
     * stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop
     * </p>
     */
    private String aggFunc;

    /**
     * <p>
     * Specifies the column on the data set on which the aggregation function will be applied.
     * </p>
     * 
     * @return Specifies the column on the data set on which the aggregation function will be applied.
     */

    public java.util.List<String> getColumn() {
        return column;
    }

    /**
     * <p>
     * Specifies the column on the data set on which the aggregation function will be applied.
     * </p>
     * 
     * @param column
     *        Specifies the column on the data set on which the aggregation function will be applied.
     */

    public void setColumn(java.util.Collection<String> column) {
        if (column == null) {
            this.column = null;
            return;
        }

        this.column = new java.util.ArrayList<String>(column);
    }

    /**
     * <p>
     * Specifies the column on the data set on which the aggregation function will be applied.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumn(java.util.Collection)} or {@link #withColumn(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param column
     *        Specifies the column on the data set on which the aggregation function will be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateOperation withColumn(String... column) {
        if (this.column == null) {
            setColumn(new java.util.ArrayList<String>(column.length));
        }
        for (String ele : column) {
            this.column.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the column on the data set on which the aggregation function will be applied.
     * </p>
     * 
     * @param column
     *        Specifies the column on the data set on which the aggregation function will be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateOperation withColumn(java.util.Collection<String> column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * Specifies the aggregation function to apply.
     * </p>
     * <p>
     * Possible aggregation functions include: avg countDistinct, count, first, last, kurtosis, max, min, skewness,
     * stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop
     * </p>
     * 
     * @param aggFunc
     *        Specifies the aggregation function to apply.</p>
     *        <p>
     *        Possible aggregation functions include: avg countDistinct, count, first, last, kurtosis, max, min,
     *        skewness, stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop
     * @see AggFunction
     */

    public void setAggFunc(String aggFunc) {
        this.aggFunc = aggFunc;
    }

    /**
     * <p>
     * Specifies the aggregation function to apply.
     * </p>
     * <p>
     * Possible aggregation functions include: avg countDistinct, count, first, last, kurtosis, max, min, skewness,
     * stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop
     * </p>
     * 
     * @return Specifies the aggregation function to apply.</p>
     *         <p>
     *         Possible aggregation functions include: avg countDistinct, count, first, last, kurtosis, max, min,
     *         skewness, stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop
     * @see AggFunction
     */

    public String getAggFunc() {
        return this.aggFunc;
    }

    /**
     * <p>
     * Specifies the aggregation function to apply.
     * </p>
     * <p>
     * Possible aggregation functions include: avg countDistinct, count, first, last, kurtosis, max, min, skewness,
     * stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop
     * </p>
     * 
     * @param aggFunc
     *        Specifies the aggregation function to apply.</p>
     *        <p>
     *        Possible aggregation functions include: avg countDistinct, count, first, last, kurtosis, max, min,
     *        skewness, stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggFunction
     */

    public AggregateOperation withAggFunc(String aggFunc) {
        setAggFunc(aggFunc);
        return this;
    }

    /**
     * <p>
     * Specifies the aggregation function to apply.
     * </p>
     * <p>
     * Possible aggregation functions include: avg countDistinct, count, first, last, kurtosis, max, min, skewness,
     * stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop
     * </p>
     * 
     * @param aggFunc
     *        Specifies the aggregation function to apply.</p>
     *        <p>
     *        Possible aggregation functions include: avg countDistinct, count, first, last, kurtosis, max, min,
     *        skewness, stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggFunction
     */

    public AggregateOperation withAggFunc(AggFunction aggFunc) {
        this.aggFunc = aggFunc.toString();
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
        if (getAggFunc() != null)
            sb.append("AggFunc: ").append(getAggFunc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregateOperation == false)
            return false;
        AggregateOperation other = (AggregateOperation) obj;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getAggFunc() == null ^ this.getAggFunc() == null)
            return false;
        if (other.getAggFunc() != null && other.getAggFunc().equals(this.getAggFunc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getAggFunc() == null) ? 0 : getAggFunc().hashCode());
        return hashCode;
    }

    @Override
    public AggregateOperation clone() {
        try {
            return (AggregateOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.AggregateOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
