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
 * A <code>TimeEqualityFilter</code> filters values that are equal to a given value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TimeEqualityFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeEqualityFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     */
    private String filterId;
    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * The value of a <code>TimeEquality</code> filter.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>ParameterName</code>.
     * </p>
     */
    private java.util.Date value;
    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>Value</code>.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     */
    private String timeGranularity;

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     * 
     * @param filterId
     *        An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     */

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     * 
     * @return An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     */

    public String getFilterId() {
        return this.filterId;
    }

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     * 
     * @param filterId
     *        An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeEqualityFilter withFilterId(String filterId) {
        setFilterId(filterId);
        return this;
    }

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

    public TimeEqualityFilter withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The value of a <code>TimeEquality</code> filter.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>ParameterName</code>.
     * </p>
     * 
     * @param value
     *        The value of a <code>TimeEquality</code> filter.</p>
     *        <p>
     *        This field is mutually exclusive to <code>ParameterName</code>.
     */

    public void setValue(java.util.Date value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a <code>TimeEquality</code> filter.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>ParameterName</code>.
     * </p>
     * 
     * @return The value of a <code>TimeEquality</code> filter.</p>
     *         <p>
     *         This field is mutually exclusive to <code>ParameterName</code>.
     */

    public java.util.Date getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of a <code>TimeEquality</code> filter.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>ParameterName</code>.
     * </p>
     * 
     * @param value
     *        The value of a <code>TimeEquality</code> filter.</p>
     *        <p>
     *        This field is mutually exclusive to <code>ParameterName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeEqualityFilter withValue(java.util.Date value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>Value</code>.
     * </p>
     * 
     * @param parameterName
     *        The parameter whose value should be used for the filter value.</p>
     *        <p>
     *        This field is mutually exclusive to <code>Value</code>.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>Value</code>.
     * </p>
     * 
     * @return The parameter whose value should be used for the filter value.</p>
     *         <p>
     *         This field is mutually exclusive to <code>Value</code>.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>Value</code>.
     * </p>
     * 
     * @param parameterName
     *        The parameter whose value should be used for the filter value.</p>
     *        <p>
     *        This field is mutually exclusive to <code>Value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeEqualityFilter withParameterName(String parameterName) {
        setParameterName(parameterName);
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

    public TimeEqualityFilter withTimeGranularity(String timeGranularity) {
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

    public TimeEqualityFilter withTimeGranularity(TimeGranularity timeGranularity) {
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
        if (getFilterId() != null)
            sb.append("FilterId: ").append(getFilterId()).append(",");
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
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

        if (obj instanceof TimeEqualityFilter == false)
            return false;
        TimeEqualityFilter other = (TimeEqualityFilter) obj;
        if (other.getFilterId() == null ^ this.getFilterId() == null)
            return false;
        if (other.getFilterId() != null && other.getFilterId().equals(this.getFilterId()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
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

        hashCode = prime * hashCode + ((getFilterId() == null) ? 0 : getFilterId().hashCode());
        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getTimeGranularity() == null) ? 0 : getTimeGranularity().hashCode());
        return hashCode;
    }

    @Override
    public TimeEqualityFilter clone() {
        try {
            return (TimeEqualityFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TimeEqualityFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
