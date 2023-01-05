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
 * The time range drill down filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TimeRangeDrillDownFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeRangeDrillDownFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * The minimum value for the filter value range.
     * </p>
     */
    private java.util.Date rangeMinimum;
    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     */
    private java.util.Date rangeMaximum;
    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     */
    private String timeGranularity;

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     * 
     * @param column
     *        The column that the filter is applied to.
     */

    public void setColumn(ColumnIdentifier column) {
        this.column = column;
    }

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     * 
     * @return The column that the filter is applied to.
     */

    public ColumnIdentifier getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     * 
     * @param column
     *        The column that the filter is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRangeDrillDownFilter withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The minimum value for the filter value range.
     * </p>
     * 
     * @param rangeMinimum
     *        The minimum value for the filter value range.
     */

    public void setRangeMinimum(java.util.Date rangeMinimum) {
        this.rangeMinimum = rangeMinimum;
    }

    /**
     * <p>
     * The minimum value for the filter value range.
     * </p>
     * 
     * @return The minimum value for the filter value range.
     */

    public java.util.Date getRangeMinimum() {
        return this.rangeMinimum;
    }

    /**
     * <p>
     * The minimum value for the filter value range.
     * </p>
     * 
     * @param rangeMinimum
     *        The minimum value for the filter value range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRangeDrillDownFilter withRangeMinimum(java.util.Date rangeMinimum) {
        setRangeMinimum(rangeMinimum);
        return this;
    }

    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     * 
     * @param rangeMaximum
     *        The maximum value for the filter value range.
     */

    public void setRangeMaximum(java.util.Date rangeMaximum) {
        this.rangeMaximum = rangeMaximum;
    }

    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     * 
     * @return The maximum value for the filter value range.
     */

    public java.util.Date getRangeMaximum() {
        return this.rangeMaximum;
    }

    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     * 
     * @param rangeMaximum
     *        The maximum value for the filter value range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRangeDrillDownFilter withRangeMaximum(java.util.Date rangeMaximum) {
        setRangeMaximum(rangeMaximum);
        return this;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TimeGranularity
     */

    public void setTimeGranularity(String timeGranularity) {
        this.timeGranularity = timeGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @return The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TimeGranularity
     */

    public String getTimeGranularity() {
        return this.timeGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeGranularity
     */

    public TimeRangeDrillDownFilter withTimeGranularity(String timeGranularity) {
        setTimeGranularity(timeGranularity);
        return this;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeGranularity
     */

    public TimeRangeDrillDownFilter withTimeGranularity(TimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity.toString();
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
        if (getRangeMinimum() != null)
            sb.append("RangeMinimum: ").append(getRangeMinimum()).append(",");
        if (getRangeMaximum() != null)
            sb.append("RangeMaximum: ").append(getRangeMaximum()).append(",");
        if (getTimeGranularity() != null)
            sb.append("TimeGranularity: ").append(getTimeGranularity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeRangeDrillDownFilter == false)
            return false;
        TimeRangeDrillDownFilter other = (TimeRangeDrillDownFilter) obj;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getRangeMinimum() == null ^ this.getRangeMinimum() == null)
            return false;
        if (other.getRangeMinimum() != null && other.getRangeMinimum().equals(this.getRangeMinimum()) == false)
            return false;
        if (other.getRangeMaximum() == null ^ this.getRangeMaximum() == null)
            return false;
        if (other.getRangeMaximum() != null && other.getRangeMaximum().equals(this.getRangeMaximum()) == false)
            return false;
        if (other.getTimeGranularity() == null ^ this.getTimeGranularity() == null)
            return false;
        if (other.getTimeGranularity() != null && other.getTimeGranularity().equals(this.getTimeGranularity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getRangeMinimum() == null) ? 0 : getRangeMinimum().hashCode());
        hashCode = prime * hashCode + ((getRangeMaximum() == null) ? 0 : getRangeMaximum().hashCode());
        hashCode = prime * hashCode + ((getTimeGranularity() == null) ? 0 : getTimeGranularity().hashCode());
        return hashCode;
    }

    @Override
    public TimeRangeDrillDownFilter clone() {
        try {
            return (TimeRangeDrillDownFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TimeRangeDrillDownFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
