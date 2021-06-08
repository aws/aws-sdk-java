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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Datum represents a single data point in a query result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Datum" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Datum implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates if the data point is a scalar value such as integer, string, double, or boolean.
     * </p>
     */
    private String scalarValue;
    /**
     * <p>
     * Indicates if the data point is of timeseries data type.
     * </p>
     */
    private java.util.List<TimeSeriesDataPoint> timeSeriesValue;
    /**
     * <p>
     * Indicates if the data point is an array.
     * </p>
     */
    private java.util.List<Datum> arrayValue;
    /**
     * <p>
     * Indicates if the data point is a row.
     * </p>
     */
    private Row rowValue;
    /**
     * <p>
     * Indicates if the data point is null.
     * </p>
     */
    private Boolean nullValue;

    /**
     * <p>
     * Indicates if the data point is a scalar value such as integer, string, double, or boolean.
     * </p>
     * 
     * @param scalarValue
     *        Indicates if the data point is a scalar value such as integer, string, double, or boolean.
     */

    public void setScalarValue(String scalarValue) {
        this.scalarValue = scalarValue;
    }

    /**
     * <p>
     * Indicates if the data point is a scalar value such as integer, string, double, or boolean.
     * </p>
     * 
     * @return Indicates if the data point is a scalar value such as integer, string, double, or boolean.
     */

    public String getScalarValue() {
        return this.scalarValue;
    }

    /**
     * <p>
     * Indicates if the data point is a scalar value such as integer, string, double, or boolean.
     * </p>
     * 
     * @param scalarValue
     *        Indicates if the data point is a scalar value such as integer, string, double, or boolean.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datum withScalarValue(String scalarValue) {
        setScalarValue(scalarValue);
        return this;
    }

    /**
     * <p>
     * Indicates if the data point is of timeseries data type.
     * </p>
     * 
     * @return Indicates if the data point is of timeseries data type.
     */

    public java.util.List<TimeSeriesDataPoint> getTimeSeriesValue() {
        return timeSeriesValue;
    }

    /**
     * <p>
     * Indicates if the data point is of timeseries data type.
     * </p>
     * 
     * @param timeSeriesValue
     *        Indicates if the data point is of timeseries data type.
     */

    public void setTimeSeriesValue(java.util.Collection<TimeSeriesDataPoint> timeSeriesValue) {
        if (timeSeriesValue == null) {
            this.timeSeriesValue = null;
            return;
        }

        this.timeSeriesValue = new java.util.ArrayList<TimeSeriesDataPoint>(timeSeriesValue);
    }

    /**
     * <p>
     * Indicates if the data point is of timeseries data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeSeriesValue(java.util.Collection)} or {@link #withTimeSeriesValue(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param timeSeriesValue
     *        Indicates if the data point is of timeseries data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datum withTimeSeriesValue(TimeSeriesDataPoint... timeSeriesValue) {
        if (this.timeSeriesValue == null) {
            setTimeSeriesValue(new java.util.ArrayList<TimeSeriesDataPoint>(timeSeriesValue.length));
        }
        for (TimeSeriesDataPoint ele : timeSeriesValue) {
            this.timeSeriesValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates if the data point is of timeseries data type.
     * </p>
     * 
     * @param timeSeriesValue
     *        Indicates if the data point is of timeseries data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datum withTimeSeriesValue(java.util.Collection<TimeSeriesDataPoint> timeSeriesValue) {
        setTimeSeriesValue(timeSeriesValue);
        return this;
    }

    /**
     * <p>
     * Indicates if the data point is an array.
     * </p>
     * 
     * @return Indicates if the data point is an array.
     */

    public java.util.List<Datum> getArrayValue() {
        return arrayValue;
    }

    /**
     * <p>
     * Indicates if the data point is an array.
     * </p>
     * 
     * @param arrayValue
     *        Indicates if the data point is an array.
     */

    public void setArrayValue(java.util.Collection<Datum> arrayValue) {
        if (arrayValue == null) {
            this.arrayValue = null;
            return;
        }

        this.arrayValue = new java.util.ArrayList<Datum>(arrayValue);
    }

    /**
     * <p>
     * Indicates if the data point is an array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayValue(java.util.Collection)} or {@link #withArrayValue(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param arrayValue
     *        Indicates if the data point is an array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datum withArrayValue(Datum... arrayValue) {
        if (this.arrayValue == null) {
            setArrayValue(new java.util.ArrayList<Datum>(arrayValue.length));
        }
        for (Datum ele : arrayValue) {
            this.arrayValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates if the data point is an array.
     * </p>
     * 
     * @param arrayValue
     *        Indicates if the data point is an array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datum withArrayValue(java.util.Collection<Datum> arrayValue) {
        setArrayValue(arrayValue);
        return this;
    }

    /**
     * <p>
     * Indicates if the data point is a row.
     * </p>
     * 
     * @param rowValue
     *        Indicates if the data point is a row.
     */

    public void setRowValue(Row rowValue) {
        this.rowValue = rowValue;
    }

    /**
     * <p>
     * Indicates if the data point is a row.
     * </p>
     * 
     * @return Indicates if the data point is a row.
     */

    public Row getRowValue() {
        return this.rowValue;
    }

    /**
     * <p>
     * Indicates if the data point is a row.
     * </p>
     * 
     * @param rowValue
     *        Indicates if the data point is a row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datum withRowValue(Row rowValue) {
        setRowValue(rowValue);
        return this;
    }

    /**
     * <p>
     * Indicates if the data point is null.
     * </p>
     * 
     * @param nullValue
     *        Indicates if the data point is null.
     */

    public void setNullValue(Boolean nullValue) {
        this.nullValue = nullValue;
    }

    /**
     * <p>
     * Indicates if the data point is null.
     * </p>
     * 
     * @return Indicates if the data point is null.
     */

    public Boolean getNullValue() {
        return this.nullValue;
    }

    /**
     * <p>
     * Indicates if the data point is null.
     * </p>
     * 
     * @param nullValue
     *        Indicates if the data point is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datum withNullValue(Boolean nullValue) {
        setNullValue(nullValue);
        return this;
    }

    /**
     * <p>
     * Indicates if the data point is null.
     * </p>
     * 
     * @return Indicates if the data point is null.
     */

    public Boolean isNullValue() {
        return this.nullValue;
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
        if (getScalarValue() != null)
            sb.append("ScalarValue: ").append(getScalarValue()).append(",");
        if (getTimeSeriesValue() != null)
            sb.append("TimeSeriesValue: ").append(getTimeSeriesValue()).append(",");
        if (getArrayValue() != null)
            sb.append("ArrayValue: ").append(getArrayValue()).append(",");
        if (getRowValue() != null)
            sb.append("RowValue: ").append(getRowValue()).append(",");
        if (getNullValue() != null)
            sb.append("NullValue: ").append(getNullValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Datum == false)
            return false;
        Datum other = (Datum) obj;
        if (other.getScalarValue() == null ^ this.getScalarValue() == null)
            return false;
        if (other.getScalarValue() != null && other.getScalarValue().equals(this.getScalarValue()) == false)
            return false;
        if (other.getTimeSeriesValue() == null ^ this.getTimeSeriesValue() == null)
            return false;
        if (other.getTimeSeriesValue() != null && other.getTimeSeriesValue().equals(this.getTimeSeriesValue()) == false)
            return false;
        if (other.getArrayValue() == null ^ this.getArrayValue() == null)
            return false;
        if (other.getArrayValue() != null && other.getArrayValue().equals(this.getArrayValue()) == false)
            return false;
        if (other.getRowValue() == null ^ this.getRowValue() == null)
            return false;
        if (other.getRowValue() != null && other.getRowValue().equals(this.getRowValue()) == false)
            return false;
        if (other.getNullValue() == null ^ this.getNullValue() == null)
            return false;
        if (other.getNullValue() != null && other.getNullValue().equals(this.getNullValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalarValue() == null) ? 0 : getScalarValue().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesValue() == null) ? 0 : getTimeSeriesValue().hashCode());
        hashCode = prime * hashCode + ((getArrayValue() == null) ? 0 : getArrayValue().hashCode());
        hashCode = prime * hashCode + ((getRowValue() == null) ? 0 : getRowValue().hashCode());
        hashCode = prime * hashCode + ((getNullValue() == null) ? 0 : getNullValue().hashCode());
        return hashCode;
    }

    @Override
    public Datum clone() {
        try {
            return (Datum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.DatumMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
