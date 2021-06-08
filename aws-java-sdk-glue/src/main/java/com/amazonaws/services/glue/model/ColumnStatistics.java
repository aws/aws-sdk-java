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
 * Represents the generated column-level statistics for a table or partition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ColumnStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of column which statistics belong to.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * The data type of the column.
     * </p>
     */
    private String columnType;
    /**
     * <p>
     * The timestamp of when column statistics were generated.
     * </p>
     */
    private java.util.Date analyzedTime;
    /**
     * <p>
     * A <code>ColumnStatisticData</code> object that contains the statistics data values.
     * </p>
     */
    private ColumnStatisticsData statisticsData;

    /**
     * <p>
     * Name of column which statistics belong to.
     * </p>
     * 
     * @param columnName
     *        Name of column which statistics belong to.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * Name of column which statistics belong to.
     * </p>
     * 
     * @return Name of column which statistics belong to.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * Name of column which statistics belong to.
     * </p>
     * 
     * @param columnName
     *        Name of column which statistics belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatistics withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @param columnType
     *        The data type of the column.
     */

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @return The data type of the column.
     */

    public String getColumnType() {
        return this.columnType;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @param columnType
     *        The data type of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatistics withColumnType(String columnType) {
        setColumnType(columnType);
        return this;
    }

    /**
     * <p>
     * The timestamp of when column statistics were generated.
     * </p>
     * 
     * @param analyzedTime
     *        The timestamp of when column statistics were generated.
     */

    public void setAnalyzedTime(java.util.Date analyzedTime) {
        this.analyzedTime = analyzedTime;
    }

    /**
     * <p>
     * The timestamp of when column statistics were generated.
     * </p>
     * 
     * @return The timestamp of when column statistics were generated.
     */

    public java.util.Date getAnalyzedTime() {
        return this.analyzedTime;
    }

    /**
     * <p>
     * The timestamp of when column statistics were generated.
     * </p>
     * 
     * @param analyzedTime
     *        The timestamp of when column statistics were generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatistics withAnalyzedTime(java.util.Date analyzedTime) {
        setAnalyzedTime(analyzedTime);
        return this;
    }

    /**
     * <p>
     * A <code>ColumnStatisticData</code> object that contains the statistics data values.
     * </p>
     * 
     * @param statisticsData
     *        A <code>ColumnStatisticData</code> object that contains the statistics data values.
     */

    public void setStatisticsData(ColumnStatisticsData statisticsData) {
        this.statisticsData = statisticsData;
    }

    /**
     * <p>
     * A <code>ColumnStatisticData</code> object that contains the statistics data values.
     * </p>
     * 
     * @return A <code>ColumnStatisticData</code> object that contains the statistics data values.
     */

    public ColumnStatisticsData getStatisticsData() {
        return this.statisticsData;
    }

    /**
     * <p>
     * A <code>ColumnStatisticData</code> object that contains the statistics data values.
     * </p>
     * 
     * @param statisticsData
     *        A <code>ColumnStatisticData</code> object that contains the statistics data values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatistics withStatisticsData(ColumnStatisticsData statisticsData) {
        setStatisticsData(statisticsData);
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
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getColumnType() != null)
            sb.append("ColumnType: ").append(getColumnType()).append(",");
        if (getAnalyzedTime() != null)
            sb.append("AnalyzedTime: ").append(getAnalyzedTime()).append(",");
        if (getStatisticsData() != null)
            sb.append("StatisticsData: ").append(getStatisticsData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnStatistics == false)
            return false;
        ColumnStatistics other = (ColumnStatistics) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getColumnType() == null ^ this.getColumnType() == null)
            return false;
        if (other.getColumnType() != null && other.getColumnType().equals(this.getColumnType()) == false)
            return false;
        if (other.getAnalyzedTime() == null ^ this.getAnalyzedTime() == null)
            return false;
        if (other.getAnalyzedTime() != null && other.getAnalyzedTime().equals(this.getAnalyzedTime()) == false)
            return false;
        if (other.getStatisticsData() == null ^ this.getStatisticsData() == null)
            return false;
        if (other.getStatisticsData() != null && other.getStatisticsData().equals(this.getStatisticsData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getColumnType() == null) ? 0 : getColumnType().hashCode());
        hashCode = prime * hashCode + ((getAnalyzedTime() == null) ? 0 : getAnalyzedTime().hashCode());
        hashCode = prime * hashCode + ((getStatisticsData() == null) ? 0 : getStatisticsData().hashCode());
        return hashCode;
    }

    @Override
    public ColumnStatistics clone() {
        try {
            return (ColumnStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ColumnStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
