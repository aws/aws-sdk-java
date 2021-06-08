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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines column statistics supported for integer data columns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/LongColumnStatisticsData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LongColumnStatisticsData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The lowest value in the column.
     * </p>
     */
    private Long minimumValue;
    /**
     * <p>
     * The highest value in the column.
     * </p>
     */
    private Long maximumValue;
    /**
     * <p>
     * The number of null values in the column.
     * </p>
     */
    private Long numberOfNulls;
    /**
     * <p>
     * The number of distinct values in a column.
     * </p>
     */
    private Long numberOfDistinctValues;

    /**
     * <p>
     * The lowest value in the column.
     * </p>
     * 
     * @param minimumValue
     *        The lowest value in the column.
     */

    public void setMinimumValue(Long minimumValue) {
        this.minimumValue = minimumValue;
    }

    /**
     * <p>
     * The lowest value in the column.
     * </p>
     * 
     * @return The lowest value in the column.
     */

    public Long getMinimumValue() {
        return this.minimumValue;
    }

    /**
     * <p>
     * The lowest value in the column.
     * </p>
     * 
     * @param minimumValue
     *        The lowest value in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongColumnStatisticsData withMinimumValue(Long minimumValue) {
        setMinimumValue(minimumValue);
        return this;
    }

    /**
     * <p>
     * The highest value in the column.
     * </p>
     * 
     * @param maximumValue
     *        The highest value in the column.
     */

    public void setMaximumValue(Long maximumValue) {
        this.maximumValue = maximumValue;
    }

    /**
     * <p>
     * The highest value in the column.
     * </p>
     * 
     * @return The highest value in the column.
     */

    public Long getMaximumValue() {
        return this.maximumValue;
    }

    /**
     * <p>
     * The highest value in the column.
     * </p>
     * 
     * @param maximumValue
     *        The highest value in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongColumnStatisticsData withMaximumValue(Long maximumValue) {
        setMaximumValue(maximumValue);
        return this;
    }

    /**
     * <p>
     * The number of null values in the column.
     * </p>
     * 
     * @param numberOfNulls
     *        The number of null values in the column.
     */

    public void setNumberOfNulls(Long numberOfNulls) {
        this.numberOfNulls = numberOfNulls;
    }

    /**
     * <p>
     * The number of null values in the column.
     * </p>
     * 
     * @return The number of null values in the column.
     */

    public Long getNumberOfNulls() {
        return this.numberOfNulls;
    }

    /**
     * <p>
     * The number of null values in the column.
     * </p>
     * 
     * @param numberOfNulls
     *        The number of null values in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongColumnStatisticsData withNumberOfNulls(Long numberOfNulls) {
        setNumberOfNulls(numberOfNulls);
        return this;
    }

    /**
     * <p>
     * The number of distinct values in a column.
     * </p>
     * 
     * @param numberOfDistinctValues
     *        The number of distinct values in a column.
     */

    public void setNumberOfDistinctValues(Long numberOfDistinctValues) {
        this.numberOfDistinctValues = numberOfDistinctValues;
    }

    /**
     * <p>
     * The number of distinct values in a column.
     * </p>
     * 
     * @return The number of distinct values in a column.
     */

    public Long getNumberOfDistinctValues() {
        return this.numberOfDistinctValues;
    }

    /**
     * <p>
     * The number of distinct values in a column.
     * </p>
     * 
     * @param numberOfDistinctValues
     *        The number of distinct values in a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongColumnStatisticsData withNumberOfDistinctValues(Long numberOfDistinctValues) {
        setNumberOfDistinctValues(numberOfDistinctValues);
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
        if (getMinimumValue() != null)
            sb.append("MinimumValue: ").append(getMinimumValue()).append(",");
        if (getMaximumValue() != null)
            sb.append("MaximumValue: ").append(getMaximumValue()).append(",");
        if (getNumberOfNulls() != null)
            sb.append("NumberOfNulls: ").append(getNumberOfNulls()).append(",");
        if (getNumberOfDistinctValues() != null)
            sb.append("NumberOfDistinctValues: ").append(getNumberOfDistinctValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LongColumnStatisticsData == false)
            return false;
        LongColumnStatisticsData other = (LongColumnStatisticsData) obj;
        if (other.getMinimumValue() == null ^ this.getMinimumValue() == null)
            return false;
        if (other.getMinimumValue() != null && other.getMinimumValue().equals(this.getMinimumValue()) == false)
            return false;
        if (other.getMaximumValue() == null ^ this.getMaximumValue() == null)
            return false;
        if (other.getMaximumValue() != null && other.getMaximumValue().equals(this.getMaximumValue()) == false)
            return false;
        if (other.getNumberOfNulls() == null ^ this.getNumberOfNulls() == null)
            return false;
        if (other.getNumberOfNulls() != null && other.getNumberOfNulls().equals(this.getNumberOfNulls()) == false)
            return false;
        if (other.getNumberOfDistinctValues() == null ^ this.getNumberOfDistinctValues() == null)
            return false;
        if (other.getNumberOfDistinctValues() != null && other.getNumberOfDistinctValues().equals(this.getNumberOfDistinctValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinimumValue() == null) ? 0 : getMinimumValue().hashCode());
        hashCode = prime * hashCode + ((getMaximumValue() == null) ? 0 : getMaximumValue().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNulls() == null) ? 0 : getNumberOfNulls().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDistinctValues() == null) ? 0 : getNumberOfDistinctValues().hashCode());
        return hashCode;
    }

    @Override
    public LongColumnStatisticsData clone() {
        try {
            return (LongColumnStatisticsData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.LongColumnStatisticsDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
