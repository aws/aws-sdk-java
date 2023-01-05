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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration to write data into Timestream database and table. This configuration allows the user to map the query
 * result select columns into the destination table columns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/TimestreamConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestreamConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of Timestream database to which the query result will be written.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Name of Timestream table that the query result will be written to. The table should be within the same database
     * that is provided in Timestream configuration.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Column from query result that should be used as the time column in destination table. Column type for this should
     * be TIMESTAMP.
     * </p>
     */
    private String timeColumn;
    /**
     * <p>
     * This is to allow mapping column(s) from the query result to the dimension in the destination table.
     * </p>
     */
    private java.util.List<DimensionMapping> dimensionMappings;
    /**
     * <p>
     * Multi-measure mappings.
     * </p>
     */
    private MultiMeasureMappings multiMeasureMappings;
    /**
     * <p>
     * Specifies how to map measures to multi-measure records.
     * </p>
     */
    private java.util.List<MixedMeasureMapping> mixedMeasureMappings;
    /**
     * <p>
     * Name of the measure column.
     * </p>
     */
    private String measureNameColumn;

    /**
     * <p>
     * Name of Timestream database to which the query result will be written.
     * </p>
     * 
     * @param databaseName
     *        Name of Timestream database to which the query result will be written.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Name of Timestream database to which the query result will be written.
     * </p>
     * 
     * @return Name of Timestream database to which the query result will be written.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Name of Timestream database to which the query result will be written.
     * </p>
     * 
     * @param databaseName
     *        Name of Timestream database to which the query result will be written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfiguration withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Name of Timestream table that the query result will be written to. The table should be within the same database
     * that is provided in Timestream configuration.
     * </p>
     * 
     * @param tableName
     *        Name of Timestream table that the query result will be written to. The table should be within the same
     *        database that is provided in Timestream configuration.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of Timestream table that the query result will be written to. The table should be within the same database
     * that is provided in Timestream configuration.
     * </p>
     * 
     * @return Name of Timestream table that the query result will be written to. The table should be within the same
     *         database that is provided in Timestream configuration.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Name of Timestream table that the query result will be written to. The table should be within the same database
     * that is provided in Timestream configuration.
     * </p>
     * 
     * @param tableName
     *        Name of Timestream table that the query result will be written to. The table should be within the same
     *        database that is provided in Timestream configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfiguration withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Column from query result that should be used as the time column in destination table. Column type for this should
     * be TIMESTAMP.
     * </p>
     * 
     * @param timeColumn
     *        Column from query result that should be used as the time column in destination table. Column type for this
     *        should be TIMESTAMP.
     */

    public void setTimeColumn(String timeColumn) {
        this.timeColumn = timeColumn;
    }

    /**
     * <p>
     * Column from query result that should be used as the time column in destination table. Column type for this should
     * be TIMESTAMP.
     * </p>
     * 
     * @return Column from query result that should be used as the time column in destination table. Column type for
     *         this should be TIMESTAMP.
     */

    public String getTimeColumn() {
        return this.timeColumn;
    }

    /**
     * <p>
     * Column from query result that should be used as the time column in destination table. Column type for this should
     * be TIMESTAMP.
     * </p>
     * 
     * @param timeColumn
     *        Column from query result that should be used as the time column in destination table. Column type for this
     *        should be TIMESTAMP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfiguration withTimeColumn(String timeColumn) {
        setTimeColumn(timeColumn);
        return this;
    }

    /**
     * <p>
     * This is to allow mapping column(s) from the query result to the dimension in the destination table.
     * </p>
     * 
     * @return This is to allow mapping column(s) from the query result to the dimension in the destination table.
     */

    public java.util.List<DimensionMapping> getDimensionMappings() {
        return dimensionMappings;
    }

    /**
     * <p>
     * This is to allow mapping column(s) from the query result to the dimension in the destination table.
     * </p>
     * 
     * @param dimensionMappings
     *        This is to allow mapping column(s) from the query result to the dimension in the destination table.
     */

    public void setDimensionMappings(java.util.Collection<DimensionMapping> dimensionMappings) {
        if (dimensionMappings == null) {
            this.dimensionMappings = null;
            return;
        }

        this.dimensionMappings = new java.util.ArrayList<DimensionMapping>(dimensionMappings);
    }

    /**
     * <p>
     * This is to allow mapping column(s) from the query result to the dimension in the destination table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionMappings(java.util.Collection)} or {@link #withDimensionMappings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dimensionMappings
     *        This is to allow mapping column(s) from the query result to the dimension in the destination table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfiguration withDimensionMappings(DimensionMapping... dimensionMappings) {
        if (this.dimensionMappings == null) {
            setDimensionMappings(new java.util.ArrayList<DimensionMapping>(dimensionMappings.length));
        }
        for (DimensionMapping ele : dimensionMappings) {
            this.dimensionMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is to allow mapping column(s) from the query result to the dimension in the destination table.
     * </p>
     * 
     * @param dimensionMappings
     *        This is to allow mapping column(s) from the query result to the dimension in the destination table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfiguration withDimensionMappings(java.util.Collection<DimensionMapping> dimensionMappings) {
        setDimensionMappings(dimensionMappings);
        return this;
    }

    /**
     * <p>
     * Multi-measure mappings.
     * </p>
     * 
     * @param multiMeasureMappings
     *        Multi-measure mappings.
     */

    public void setMultiMeasureMappings(MultiMeasureMappings multiMeasureMappings) {
        this.multiMeasureMappings = multiMeasureMappings;
    }

    /**
     * <p>
     * Multi-measure mappings.
     * </p>
     * 
     * @return Multi-measure mappings.
     */

    public MultiMeasureMappings getMultiMeasureMappings() {
        return this.multiMeasureMappings;
    }

    /**
     * <p>
     * Multi-measure mappings.
     * </p>
     * 
     * @param multiMeasureMappings
     *        Multi-measure mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfiguration withMultiMeasureMappings(MultiMeasureMappings multiMeasureMappings) {
        setMultiMeasureMappings(multiMeasureMappings);
        return this;
    }

    /**
     * <p>
     * Specifies how to map measures to multi-measure records.
     * </p>
     * 
     * @return Specifies how to map measures to multi-measure records.
     */

    public java.util.List<MixedMeasureMapping> getMixedMeasureMappings() {
        return mixedMeasureMappings;
    }

    /**
     * <p>
     * Specifies how to map measures to multi-measure records.
     * </p>
     * 
     * @param mixedMeasureMappings
     *        Specifies how to map measures to multi-measure records.
     */

    public void setMixedMeasureMappings(java.util.Collection<MixedMeasureMapping> mixedMeasureMappings) {
        if (mixedMeasureMappings == null) {
            this.mixedMeasureMappings = null;
            return;
        }

        this.mixedMeasureMappings = new java.util.ArrayList<MixedMeasureMapping>(mixedMeasureMappings);
    }

    /**
     * <p>
     * Specifies how to map measures to multi-measure records.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMixedMeasureMappings(java.util.Collection)} or {@link #withMixedMeasureMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param mixedMeasureMappings
     *        Specifies how to map measures to multi-measure records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfiguration withMixedMeasureMappings(MixedMeasureMapping... mixedMeasureMappings) {
        if (this.mixedMeasureMappings == null) {
            setMixedMeasureMappings(new java.util.ArrayList<MixedMeasureMapping>(mixedMeasureMappings.length));
        }
        for (MixedMeasureMapping ele : mixedMeasureMappings) {
            this.mixedMeasureMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies how to map measures to multi-measure records.
     * </p>
     * 
     * @param mixedMeasureMappings
     *        Specifies how to map measures to multi-measure records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfiguration withMixedMeasureMappings(java.util.Collection<MixedMeasureMapping> mixedMeasureMappings) {
        setMixedMeasureMappings(mixedMeasureMappings);
        return this;
    }

    /**
     * <p>
     * Name of the measure column.
     * </p>
     * 
     * @param measureNameColumn
     *        Name of the measure column.
     */

    public void setMeasureNameColumn(String measureNameColumn) {
        this.measureNameColumn = measureNameColumn;
    }

    /**
     * <p>
     * Name of the measure column.
     * </p>
     * 
     * @return Name of the measure column.
     */

    public String getMeasureNameColumn() {
        return this.measureNameColumn;
    }

    /**
     * <p>
     * Name of the measure column.
     * </p>
     * 
     * @param measureNameColumn
     *        Name of the measure column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfiguration withMeasureNameColumn(String measureNameColumn) {
        setMeasureNameColumn(measureNameColumn);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTimeColumn() != null)
            sb.append("TimeColumn: ").append(getTimeColumn()).append(",");
        if (getDimensionMappings() != null)
            sb.append("DimensionMappings: ").append(getDimensionMappings()).append(",");
        if (getMultiMeasureMappings() != null)
            sb.append("MultiMeasureMappings: ").append(getMultiMeasureMappings()).append(",");
        if (getMixedMeasureMappings() != null)
            sb.append("MixedMeasureMappings: ").append(getMixedMeasureMappings()).append(",");
        if (getMeasureNameColumn() != null)
            sb.append("MeasureNameColumn: ").append(getMeasureNameColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestreamConfiguration == false)
            return false;
        TimestreamConfiguration other = (TimestreamConfiguration) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTimeColumn() == null ^ this.getTimeColumn() == null)
            return false;
        if (other.getTimeColumn() != null && other.getTimeColumn().equals(this.getTimeColumn()) == false)
            return false;
        if (other.getDimensionMappings() == null ^ this.getDimensionMappings() == null)
            return false;
        if (other.getDimensionMappings() != null && other.getDimensionMappings().equals(this.getDimensionMappings()) == false)
            return false;
        if (other.getMultiMeasureMappings() == null ^ this.getMultiMeasureMappings() == null)
            return false;
        if (other.getMultiMeasureMappings() != null && other.getMultiMeasureMappings().equals(this.getMultiMeasureMappings()) == false)
            return false;
        if (other.getMixedMeasureMappings() == null ^ this.getMixedMeasureMappings() == null)
            return false;
        if (other.getMixedMeasureMappings() != null && other.getMixedMeasureMappings().equals(this.getMixedMeasureMappings()) == false)
            return false;
        if (other.getMeasureNameColumn() == null ^ this.getMeasureNameColumn() == null)
            return false;
        if (other.getMeasureNameColumn() != null && other.getMeasureNameColumn().equals(this.getMeasureNameColumn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTimeColumn() == null) ? 0 : getTimeColumn().hashCode());
        hashCode = prime * hashCode + ((getDimensionMappings() == null) ? 0 : getDimensionMappings().hashCode());
        hashCode = prime * hashCode + ((getMultiMeasureMappings() == null) ? 0 : getMultiMeasureMappings().hashCode());
        hashCode = prime * hashCode + ((getMixedMeasureMappings() == null) ? 0 : getMixedMeasureMappings().hashCode());
        hashCode = prime * hashCode + ((getMeasureNameColumn() == null) ? 0 : getMeasureNameColumn().hashCode());
        return hashCode;
    }

    @Override
    public TimestreamConfiguration clone() {
        try {
            return (TimestreamConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.TimestreamConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
