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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateColumnStatisticsForPartition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateColumnStatisticsForPartitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the Amazon Web Services
     * account ID is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A list of partition values identifying the partition.
     * </p>
     */
    private java.util.List<String> partitionValues;
    /**
     * <p>
     * A list of the column statistics.
     * </p>
     */
    private java.util.List<ColumnStatistics> columnStatisticsList;

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the Amazon Web Services
     * account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partitions in question reside. If none is supplied, the Amazon Web
     *        Services account ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the Amazon Web Services
     * account ID is used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the partitions in question reside. If none is supplied, the Amazon Web
     *         Services account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the Amazon Web Services
     * account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partitions in question reside. If none is supplied, the Amazon Web
     *        Services account ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateColumnStatisticsForPartitionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the partitions reside.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * 
     * @return The name of the catalog database where the partitions reside.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the partitions reside.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateColumnStatisticsForPartitionRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * 
     * @param tableName
     *        The name of the partitions' table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * 
     * @return The name of the partitions' table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * 
     * @param tableName
     *        The name of the partitions' table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateColumnStatisticsForPartitionRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A list of partition values identifying the partition.
     * </p>
     * 
     * @return A list of partition values identifying the partition.
     */

    public java.util.List<String> getPartitionValues() {
        return partitionValues;
    }

    /**
     * <p>
     * A list of partition values identifying the partition.
     * </p>
     * 
     * @param partitionValues
     *        A list of partition values identifying the partition.
     */

    public void setPartitionValues(java.util.Collection<String> partitionValues) {
        if (partitionValues == null) {
            this.partitionValues = null;
            return;
        }

        this.partitionValues = new java.util.ArrayList<String>(partitionValues);
    }

    /**
     * <p>
     * A list of partition values identifying the partition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionValues(java.util.Collection)} or {@link #withPartitionValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param partitionValues
     *        A list of partition values identifying the partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateColumnStatisticsForPartitionRequest withPartitionValues(String... partitionValues) {
        if (this.partitionValues == null) {
            setPartitionValues(new java.util.ArrayList<String>(partitionValues.length));
        }
        for (String ele : partitionValues) {
            this.partitionValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of partition values identifying the partition.
     * </p>
     * 
     * @param partitionValues
     *        A list of partition values identifying the partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateColumnStatisticsForPartitionRequest withPartitionValues(java.util.Collection<String> partitionValues) {
        setPartitionValues(partitionValues);
        return this;
    }

    /**
     * <p>
     * A list of the column statistics.
     * </p>
     * 
     * @return A list of the column statistics.
     */

    public java.util.List<ColumnStatistics> getColumnStatisticsList() {
        return columnStatisticsList;
    }

    /**
     * <p>
     * A list of the column statistics.
     * </p>
     * 
     * @param columnStatisticsList
     *        A list of the column statistics.
     */

    public void setColumnStatisticsList(java.util.Collection<ColumnStatistics> columnStatisticsList) {
        if (columnStatisticsList == null) {
            this.columnStatisticsList = null;
            return;
        }

        this.columnStatisticsList = new java.util.ArrayList<ColumnStatistics>(columnStatisticsList);
    }

    /**
     * <p>
     * A list of the column statistics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnStatisticsList(java.util.Collection)} or {@link #withColumnStatisticsList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param columnStatisticsList
     *        A list of the column statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateColumnStatisticsForPartitionRequest withColumnStatisticsList(ColumnStatistics... columnStatisticsList) {
        if (this.columnStatisticsList == null) {
            setColumnStatisticsList(new java.util.ArrayList<ColumnStatistics>(columnStatisticsList.length));
        }
        for (ColumnStatistics ele : columnStatisticsList) {
            this.columnStatisticsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the column statistics.
     * </p>
     * 
     * @param columnStatisticsList
     *        A list of the column statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateColumnStatisticsForPartitionRequest withColumnStatisticsList(java.util.Collection<ColumnStatistics> columnStatisticsList) {
        setColumnStatisticsList(columnStatisticsList);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getPartitionValues() != null)
            sb.append("PartitionValues: ").append(getPartitionValues()).append(",");
        if (getColumnStatisticsList() != null)
            sb.append("ColumnStatisticsList: ").append(getColumnStatisticsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateColumnStatisticsForPartitionRequest == false)
            return false;
        UpdateColumnStatisticsForPartitionRequest other = (UpdateColumnStatisticsForPartitionRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getPartitionValues() == null ^ this.getPartitionValues() == null)
            return false;
        if (other.getPartitionValues() != null && other.getPartitionValues().equals(this.getPartitionValues()) == false)
            return false;
        if (other.getColumnStatisticsList() == null ^ this.getColumnStatisticsList() == null)
            return false;
        if (other.getColumnStatisticsList() != null && other.getColumnStatisticsList().equals(this.getColumnStatisticsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getPartitionValues() == null) ? 0 : getPartitionValues().hashCode());
        hashCode = prime * hashCode + ((getColumnStatisticsList() == null) ? 0 : getColumnStatisticsList().hashCode());
        return hashCode;
    }

    @Override
    public UpdateColumnStatisticsForPartitionRequest clone() {
        return (UpdateColumnStatisticsForPartitionRequest) super.clone();
    }

}
