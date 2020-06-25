/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Defines a string column statistics data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StringColumnStatisticsData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringColumnStatisticsData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum value of the column.
     * </p>
     */
    private Long maximumLength;
    /**
     * <p>
     * Average value of the column.
     * </p>
     */
    private Double averageLength;
    /**
     * <p>
     * Number of nulls.
     * </p>
     */
    private Long numberOfNulls;
    /**
     * <p>
     * Number of distinct values.
     * </p>
     */
    private Long numberOfDistinctValues;

    /**
     * <p>
     * Maximum value of the column.
     * </p>
     * 
     * @param maximumLength
     *        Maximum value of the column.
     */

    public void setMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
    }

    /**
     * <p>
     * Maximum value of the column.
     * </p>
     * 
     * @return Maximum value of the column.
     */

    public Long getMaximumLength() {
        return this.maximumLength;
    }

    /**
     * <p>
     * Maximum value of the column.
     * </p>
     * 
     * @param maximumLength
     *        Maximum value of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringColumnStatisticsData withMaximumLength(Long maximumLength) {
        setMaximumLength(maximumLength);
        return this;
    }

    /**
     * <p>
     * Average value of the column.
     * </p>
     * 
     * @param averageLength
     *        Average value of the column.
     */

    public void setAverageLength(Double averageLength) {
        this.averageLength = averageLength;
    }

    /**
     * <p>
     * Average value of the column.
     * </p>
     * 
     * @return Average value of the column.
     */

    public Double getAverageLength() {
        return this.averageLength;
    }

    /**
     * <p>
     * Average value of the column.
     * </p>
     * 
     * @param averageLength
     *        Average value of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringColumnStatisticsData withAverageLength(Double averageLength) {
        setAverageLength(averageLength);
        return this;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * 
     * @param numberOfNulls
     *        Number of nulls.
     */

    public void setNumberOfNulls(Long numberOfNulls) {
        this.numberOfNulls = numberOfNulls;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * 
     * @return Number of nulls.
     */

    public Long getNumberOfNulls() {
        return this.numberOfNulls;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * 
     * @param numberOfNulls
     *        Number of nulls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringColumnStatisticsData withNumberOfNulls(Long numberOfNulls) {
        setNumberOfNulls(numberOfNulls);
        return this;
    }

    /**
     * <p>
     * Number of distinct values.
     * </p>
     * 
     * @param numberOfDistinctValues
     *        Number of distinct values.
     */

    public void setNumberOfDistinctValues(Long numberOfDistinctValues) {
        this.numberOfDistinctValues = numberOfDistinctValues;
    }

    /**
     * <p>
     * Number of distinct values.
     * </p>
     * 
     * @return Number of distinct values.
     */

    public Long getNumberOfDistinctValues() {
        return this.numberOfDistinctValues;
    }

    /**
     * <p>
     * Number of distinct values.
     * </p>
     * 
     * @param numberOfDistinctValues
     *        Number of distinct values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringColumnStatisticsData withNumberOfDistinctValues(Long numberOfDistinctValues) {
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
        if (getMaximumLength() != null)
            sb.append("MaximumLength: ").append(getMaximumLength()).append(",");
        if (getAverageLength() != null)
            sb.append("AverageLength: ").append(getAverageLength()).append(",");
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

        if (obj instanceof StringColumnStatisticsData == false)
            return false;
        StringColumnStatisticsData other = (StringColumnStatisticsData) obj;
        if (other.getMaximumLength() == null ^ this.getMaximumLength() == null)
            return false;
        if (other.getMaximumLength() != null && other.getMaximumLength().equals(this.getMaximumLength()) == false)
            return false;
        if (other.getAverageLength() == null ^ this.getAverageLength() == null)
            return false;
        if (other.getAverageLength() != null && other.getAverageLength().equals(this.getAverageLength()) == false)
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

        hashCode = prime * hashCode + ((getMaximumLength() == null) ? 0 : getMaximumLength().hashCode());
        hashCode = prime * hashCode + ((getAverageLength() == null) ? 0 : getAverageLength().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNulls() == null) ? 0 : getNumberOfNulls().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDistinctValues() == null) ? 0 : getNumberOfDistinctValues().hashCode());
        return hashCode;
    }

    @Override
    public StringColumnStatisticsData clone() {
        try {
            return (StringColumnStatisticsData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.StringColumnStatisticsDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
