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
 * Contains the data type of a column in a query result set. The data type can be scalar or complex. The supported
 * scalar data types are integers, boolean, string, double, timestamp, date, time, and intervals. The supported complex
 * data types are arrays, rows, and timeseries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Type" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Type implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates if the column is of type string, integer, boolean, double, timestamp, date, time.
     * </p>
     */
    private String scalarType;
    /**
     * <p>
     * Indicates if the column is an array.
     * </p>
     */
    private ColumnInfo arrayColumnInfo;
    /**
     * <p>
     * Indicates if the column is a timeseries data type.
     * </p>
     */
    private ColumnInfo timeSeriesMeasureValueColumnInfo;
    /**
     * <p>
     * Indicates if the column is a row.
     * </p>
     */
    private java.util.List<ColumnInfo> rowColumnInfo;

    /**
     * <p>
     * Indicates if the column is of type string, integer, boolean, double, timestamp, date, time.
     * </p>
     * 
     * @param scalarType
     *        Indicates if the column is of type string, integer, boolean, double, timestamp, date, time.
     * @see ScalarType
     */

    public void setScalarType(String scalarType) {
        this.scalarType = scalarType;
    }

    /**
     * <p>
     * Indicates if the column is of type string, integer, boolean, double, timestamp, date, time.
     * </p>
     * 
     * @return Indicates if the column is of type string, integer, boolean, double, timestamp, date, time.
     * @see ScalarType
     */

    public String getScalarType() {
        return this.scalarType;
    }

    /**
     * <p>
     * Indicates if the column is of type string, integer, boolean, double, timestamp, date, time.
     * </p>
     * 
     * @param scalarType
     *        Indicates if the column is of type string, integer, boolean, double, timestamp, date, time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalarType
     */

    public Type withScalarType(String scalarType) {
        setScalarType(scalarType);
        return this;
    }

    /**
     * <p>
     * Indicates if the column is of type string, integer, boolean, double, timestamp, date, time.
     * </p>
     * 
     * @param scalarType
     *        Indicates if the column is of type string, integer, boolean, double, timestamp, date, time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalarType
     */

    public Type withScalarType(ScalarType scalarType) {
        this.scalarType = scalarType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if the column is an array.
     * </p>
     * 
     * @param arrayColumnInfo
     *        Indicates if the column is an array.
     */

    public void setArrayColumnInfo(ColumnInfo arrayColumnInfo) {
        this.arrayColumnInfo = arrayColumnInfo;
    }

    /**
     * <p>
     * Indicates if the column is an array.
     * </p>
     * 
     * @return Indicates if the column is an array.
     */

    public ColumnInfo getArrayColumnInfo() {
        return this.arrayColumnInfo;
    }

    /**
     * <p>
     * Indicates if the column is an array.
     * </p>
     * 
     * @param arrayColumnInfo
     *        Indicates if the column is an array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Type withArrayColumnInfo(ColumnInfo arrayColumnInfo) {
        setArrayColumnInfo(arrayColumnInfo);
        return this;
    }

    /**
     * <p>
     * Indicates if the column is a timeseries data type.
     * </p>
     * 
     * @param timeSeriesMeasureValueColumnInfo
     *        Indicates if the column is a timeseries data type.
     */

    public void setTimeSeriesMeasureValueColumnInfo(ColumnInfo timeSeriesMeasureValueColumnInfo) {
        this.timeSeriesMeasureValueColumnInfo = timeSeriesMeasureValueColumnInfo;
    }

    /**
     * <p>
     * Indicates if the column is a timeseries data type.
     * </p>
     * 
     * @return Indicates if the column is a timeseries data type.
     */

    public ColumnInfo getTimeSeriesMeasureValueColumnInfo() {
        return this.timeSeriesMeasureValueColumnInfo;
    }

    /**
     * <p>
     * Indicates if the column is a timeseries data type.
     * </p>
     * 
     * @param timeSeriesMeasureValueColumnInfo
     *        Indicates if the column is a timeseries data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Type withTimeSeriesMeasureValueColumnInfo(ColumnInfo timeSeriesMeasureValueColumnInfo) {
        setTimeSeriesMeasureValueColumnInfo(timeSeriesMeasureValueColumnInfo);
        return this;
    }

    /**
     * <p>
     * Indicates if the column is a row.
     * </p>
     * 
     * @return Indicates if the column is a row.
     */

    public java.util.List<ColumnInfo> getRowColumnInfo() {
        return rowColumnInfo;
    }

    /**
     * <p>
     * Indicates if the column is a row.
     * </p>
     * 
     * @param rowColumnInfo
     *        Indicates if the column is a row.
     */

    public void setRowColumnInfo(java.util.Collection<ColumnInfo> rowColumnInfo) {
        if (rowColumnInfo == null) {
            this.rowColumnInfo = null;
            return;
        }

        this.rowColumnInfo = new java.util.ArrayList<ColumnInfo>(rowColumnInfo);
    }

    /**
     * <p>
     * Indicates if the column is a row.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRowColumnInfo(java.util.Collection)} or {@link #withRowColumnInfo(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param rowColumnInfo
     *        Indicates if the column is a row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Type withRowColumnInfo(ColumnInfo... rowColumnInfo) {
        if (this.rowColumnInfo == null) {
            setRowColumnInfo(new java.util.ArrayList<ColumnInfo>(rowColumnInfo.length));
        }
        for (ColumnInfo ele : rowColumnInfo) {
            this.rowColumnInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates if the column is a row.
     * </p>
     * 
     * @param rowColumnInfo
     *        Indicates if the column is a row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Type withRowColumnInfo(java.util.Collection<ColumnInfo> rowColumnInfo) {
        setRowColumnInfo(rowColumnInfo);
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
        if (getScalarType() != null)
            sb.append("ScalarType: ").append(getScalarType()).append(",");
        if (getArrayColumnInfo() != null)
            sb.append("ArrayColumnInfo: ").append(getArrayColumnInfo()).append(",");
        if (getTimeSeriesMeasureValueColumnInfo() != null)
            sb.append("TimeSeriesMeasureValueColumnInfo: ").append(getTimeSeriesMeasureValueColumnInfo()).append(",");
        if (getRowColumnInfo() != null)
            sb.append("RowColumnInfo: ").append(getRowColumnInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Type == false)
            return false;
        Type other = (Type) obj;
        if (other.getScalarType() == null ^ this.getScalarType() == null)
            return false;
        if (other.getScalarType() != null && other.getScalarType().equals(this.getScalarType()) == false)
            return false;
        if (other.getArrayColumnInfo() == null ^ this.getArrayColumnInfo() == null)
            return false;
        if (other.getArrayColumnInfo() != null && other.getArrayColumnInfo().equals(this.getArrayColumnInfo()) == false)
            return false;
        if (other.getTimeSeriesMeasureValueColumnInfo() == null ^ this.getTimeSeriesMeasureValueColumnInfo() == null)
            return false;
        if (other.getTimeSeriesMeasureValueColumnInfo() != null
                && other.getTimeSeriesMeasureValueColumnInfo().equals(this.getTimeSeriesMeasureValueColumnInfo()) == false)
            return false;
        if (other.getRowColumnInfo() == null ^ this.getRowColumnInfo() == null)
            return false;
        if (other.getRowColumnInfo() != null && other.getRowColumnInfo().equals(this.getRowColumnInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalarType() == null) ? 0 : getScalarType().hashCode());
        hashCode = prime * hashCode + ((getArrayColumnInfo() == null) ? 0 : getArrayColumnInfo().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesMeasureValueColumnInfo() == null) ? 0 : getTimeSeriesMeasureValueColumnInfo().hashCode());
        hashCode = prime * hashCode + ((getRowColumnInfo() == null) ? 0 : getRowColumnInfo().hashCode());
        return hashCode;
    }

    @Override
    public Type clone() {
        try {
            return (Type) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.TypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
