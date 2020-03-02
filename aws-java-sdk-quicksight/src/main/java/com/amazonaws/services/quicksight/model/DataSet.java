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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the dataset.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * A display name for the dataset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Declares the physical tables that are available in the underlying data sources.
     * </p>
     */
    private java.util.Map<String, PhysicalTable> physicalTableMap;
    /**
     * <p>
     * Configures the combination and transformation of the data from the physical tables.
     * </p>
     */
    private java.util.Map<String, LogicalTable> logicalTableMap;
    /**
     * <p>
     * The list of columns after all transforms. These columns are available in templates, analyses, and dashboards.
     * </p>
     */
    private java.util.List<OutputColumn> outputColumns;
    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     */
    private String importMode;
    /**
     * <p>
     * The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't imported into SPICE.
     * </p>
     */
    private Long consumedSpiceCapacityInBytes;
    /**
     * <p>
     * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial
     * hierarchy is supported.
     * </p>
     */
    private java.util.List<ColumnGroup> columnGroups;
    /**
     * <p>
     * The row-level security configuration for the dataset.
     * </p>
     */
    private RowLevelPermissionDataSet rowLevelPermissionDataSet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     * 
     * @param dataSetId
     *        The ID of the dataset.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     * 
     * @return The ID of the dataset.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     * 
     * @param dataSetId
     *        The ID of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @param name
     *        A display name for the dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @return A display name for the dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @param name
     *        A display name for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this dataset was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     * 
     * @return The time that this dataset was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that this dataset was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this dataset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this dataset was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     * 
     * @return The last time that this dataset was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this dataset was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this dataset was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Declares the physical tables that are available in the underlying data sources.
     * </p>
     * 
     * @return Declares the physical tables that are available in the underlying data sources.
     */

    public java.util.Map<String, PhysicalTable> getPhysicalTableMap() {
        return physicalTableMap;
    }

    /**
     * <p>
     * Declares the physical tables that are available in the underlying data sources.
     * </p>
     * 
     * @param physicalTableMap
     *        Declares the physical tables that are available in the underlying data sources.
     */

    public void setPhysicalTableMap(java.util.Map<String, PhysicalTable> physicalTableMap) {
        this.physicalTableMap = physicalTableMap;
    }

    /**
     * <p>
     * Declares the physical tables that are available in the underlying data sources.
     * </p>
     * 
     * @param physicalTableMap
     *        Declares the physical tables that are available in the underlying data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withPhysicalTableMap(java.util.Map<String, PhysicalTable> physicalTableMap) {
        setPhysicalTableMap(physicalTableMap);
        return this;
    }

    /**
     * Add a single PhysicalTableMap entry
     *
     * @see DataSet#withPhysicalTableMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DataSet addPhysicalTableMapEntry(String key, PhysicalTable value) {
        if (null == this.physicalTableMap) {
            this.physicalTableMap = new java.util.HashMap<String, PhysicalTable>();
        }
        if (this.physicalTableMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.physicalTableMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PhysicalTableMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet clearPhysicalTableMapEntries() {
        this.physicalTableMap = null;
        return this;
    }

    /**
     * <p>
     * Configures the combination and transformation of the data from the physical tables.
     * </p>
     * 
     * @return Configures the combination and transformation of the data from the physical tables.
     */

    public java.util.Map<String, LogicalTable> getLogicalTableMap() {
        return logicalTableMap;
    }

    /**
     * <p>
     * Configures the combination and transformation of the data from the physical tables.
     * </p>
     * 
     * @param logicalTableMap
     *        Configures the combination and transformation of the data from the physical tables.
     */

    public void setLogicalTableMap(java.util.Map<String, LogicalTable> logicalTableMap) {
        this.logicalTableMap = logicalTableMap;
    }

    /**
     * <p>
     * Configures the combination and transformation of the data from the physical tables.
     * </p>
     * 
     * @param logicalTableMap
     *        Configures the combination and transformation of the data from the physical tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withLogicalTableMap(java.util.Map<String, LogicalTable> logicalTableMap) {
        setLogicalTableMap(logicalTableMap);
        return this;
    }

    /**
     * Add a single LogicalTableMap entry
     *
     * @see DataSet#withLogicalTableMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DataSet addLogicalTableMapEntry(String key, LogicalTable value) {
        if (null == this.logicalTableMap) {
            this.logicalTableMap = new java.util.HashMap<String, LogicalTable>();
        }
        if (this.logicalTableMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logicalTableMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LogicalTableMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet clearLogicalTableMapEntries() {
        this.logicalTableMap = null;
        return this;
    }

    /**
     * <p>
     * The list of columns after all transforms. These columns are available in templates, analyses, and dashboards.
     * </p>
     * 
     * @return The list of columns after all transforms. These columns are available in templates, analyses, and
     *         dashboards.
     */

    public java.util.List<OutputColumn> getOutputColumns() {
        return outputColumns;
    }

    /**
     * <p>
     * The list of columns after all transforms. These columns are available in templates, analyses, and dashboards.
     * </p>
     * 
     * @param outputColumns
     *        The list of columns after all transforms. These columns are available in templates, analyses, and
     *        dashboards.
     */

    public void setOutputColumns(java.util.Collection<OutputColumn> outputColumns) {
        if (outputColumns == null) {
            this.outputColumns = null;
            return;
        }

        this.outputColumns = new java.util.ArrayList<OutputColumn>(outputColumns);
    }

    /**
     * <p>
     * The list of columns after all transforms. These columns are available in templates, analyses, and dashboards.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputColumns(java.util.Collection)} or {@link #withOutputColumns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputColumns
     *        The list of columns after all transforms. These columns are available in templates, analyses, and
     *        dashboards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withOutputColumns(OutputColumn... outputColumns) {
        if (this.outputColumns == null) {
            setOutputColumns(new java.util.ArrayList<OutputColumn>(outputColumns.length));
        }
        for (OutputColumn ele : outputColumns) {
            this.outputColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of columns after all transforms. These columns are available in templates, analyses, and dashboards.
     * </p>
     * 
     * @param outputColumns
     *        The list of columns after all transforms. These columns are available in templates, analyses, and
     *        dashboards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withOutputColumns(java.util.Collection<OutputColumn> outputColumns) {
        setOutputColumns(outputColumns);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * 
     * @param importMode
     *        Indicates whether you want to import the data into SPICE.
     * @see DataSetImportMode
     */

    public void setImportMode(String importMode) {
        this.importMode = importMode;
    }

    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * 
     * @return Indicates whether you want to import the data into SPICE.
     * @see DataSetImportMode
     */

    public String getImportMode() {
        return this.importMode;
    }

    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * 
     * @param importMode
     *        Indicates whether you want to import the data into SPICE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSetImportMode
     */

    public DataSet withImportMode(String importMode) {
        setImportMode(importMode);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to import the data into SPICE.
     * </p>
     * 
     * @param importMode
     *        Indicates whether you want to import the data into SPICE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSetImportMode
     */

    public DataSet withImportMode(DataSetImportMode importMode) {
        this.importMode = importMode.toString();
        return this;
    }

    /**
     * <p>
     * The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't imported into SPICE.
     * </p>
     * 
     * @param consumedSpiceCapacityInBytes
     *        The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't imported into SPICE.
     */

    public void setConsumedSpiceCapacityInBytes(Long consumedSpiceCapacityInBytes) {
        this.consumedSpiceCapacityInBytes = consumedSpiceCapacityInBytes;
    }

    /**
     * <p>
     * The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't imported into SPICE.
     * </p>
     * 
     * @return The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't imported into SPICE.
     */

    public Long getConsumedSpiceCapacityInBytes() {
        return this.consumedSpiceCapacityInBytes;
    }

    /**
     * <p>
     * The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't imported into SPICE.
     * </p>
     * 
     * @param consumedSpiceCapacityInBytes
     *        The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't imported into SPICE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withConsumedSpiceCapacityInBytes(Long consumedSpiceCapacityInBytes) {
        setConsumedSpiceCapacityInBytes(consumedSpiceCapacityInBytes);
        return this;
    }

    /**
     * <p>
     * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial
     * hierarchy is supported.
     * </p>
     * 
     * @return Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial
     *         hierarchy is supported.
     */

    public java.util.List<ColumnGroup> getColumnGroups() {
        return columnGroups;
    }

    /**
     * <p>
     * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial
     * hierarchy is supported.
     * </p>
     * 
     * @param columnGroups
     *        Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial
     *        hierarchy is supported.
     */

    public void setColumnGroups(java.util.Collection<ColumnGroup> columnGroups) {
        if (columnGroups == null) {
            this.columnGroups = null;
            return;
        }

        this.columnGroups = new java.util.ArrayList<ColumnGroup>(columnGroups);
    }

    /**
     * <p>
     * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial
     * hierarchy is supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnGroups(java.util.Collection)} or {@link #withColumnGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnGroups
     *        Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial
     *        hierarchy is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withColumnGroups(ColumnGroup... columnGroups) {
        if (this.columnGroups == null) {
            setColumnGroups(new java.util.ArrayList<ColumnGroup>(columnGroups.length));
        }
        for (ColumnGroup ele : columnGroups) {
            this.columnGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial
     * hierarchy is supported.
     * </p>
     * 
     * @param columnGroups
     *        Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial
     *        hierarchy is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withColumnGroups(java.util.Collection<ColumnGroup> columnGroups) {
        setColumnGroups(columnGroups);
        return this;
    }

    /**
     * <p>
     * The row-level security configuration for the dataset.
     * </p>
     * 
     * @param rowLevelPermissionDataSet
     *        The row-level security configuration for the dataset.
     */

    public void setRowLevelPermissionDataSet(RowLevelPermissionDataSet rowLevelPermissionDataSet) {
        this.rowLevelPermissionDataSet = rowLevelPermissionDataSet;
    }

    /**
     * <p>
     * The row-level security configuration for the dataset.
     * </p>
     * 
     * @return The row-level security configuration for the dataset.
     */

    public RowLevelPermissionDataSet getRowLevelPermissionDataSet() {
        return this.rowLevelPermissionDataSet;
    }

    /**
     * <p>
     * The row-level security configuration for the dataset.
     * </p>
     * 
     * @param rowLevelPermissionDataSet
     *        The row-level security configuration for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withRowLevelPermissionDataSet(RowLevelPermissionDataSet rowLevelPermissionDataSet) {
        setRowLevelPermissionDataSet(rowLevelPermissionDataSet);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getPhysicalTableMap() != null)
            sb.append("PhysicalTableMap: ").append(getPhysicalTableMap()).append(",");
        if (getLogicalTableMap() != null)
            sb.append("LogicalTableMap: ").append(getLogicalTableMap()).append(",");
        if (getOutputColumns() != null)
            sb.append("OutputColumns: ").append(getOutputColumns()).append(",");
        if (getImportMode() != null)
            sb.append("ImportMode: ").append(getImportMode()).append(",");
        if (getConsumedSpiceCapacityInBytes() != null)
            sb.append("ConsumedSpiceCapacityInBytes: ").append(getConsumedSpiceCapacityInBytes()).append(",");
        if (getColumnGroups() != null)
            sb.append("ColumnGroups: ").append(getColumnGroups()).append(",");
        if (getRowLevelPermissionDataSet() != null)
            sb.append("RowLevelPermissionDataSet: ").append(getRowLevelPermissionDataSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSet == false)
            return false;
        DataSet other = (DataSet) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getPhysicalTableMap() == null ^ this.getPhysicalTableMap() == null)
            return false;
        if (other.getPhysicalTableMap() != null && other.getPhysicalTableMap().equals(this.getPhysicalTableMap()) == false)
            return false;
        if (other.getLogicalTableMap() == null ^ this.getLogicalTableMap() == null)
            return false;
        if (other.getLogicalTableMap() != null && other.getLogicalTableMap().equals(this.getLogicalTableMap()) == false)
            return false;
        if (other.getOutputColumns() == null ^ this.getOutputColumns() == null)
            return false;
        if (other.getOutputColumns() != null && other.getOutputColumns().equals(this.getOutputColumns()) == false)
            return false;
        if (other.getImportMode() == null ^ this.getImportMode() == null)
            return false;
        if (other.getImportMode() != null && other.getImportMode().equals(this.getImportMode()) == false)
            return false;
        if (other.getConsumedSpiceCapacityInBytes() == null ^ this.getConsumedSpiceCapacityInBytes() == null)
            return false;
        if (other.getConsumedSpiceCapacityInBytes() != null && other.getConsumedSpiceCapacityInBytes().equals(this.getConsumedSpiceCapacityInBytes()) == false)
            return false;
        if (other.getColumnGroups() == null ^ this.getColumnGroups() == null)
            return false;
        if (other.getColumnGroups() != null && other.getColumnGroups().equals(this.getColumnGroups()) == false)
            return false;
        if (other.getRowLevelPermissionDataSet() == null ^ this.getRowLevelPermissionDataSet() == null)
            return false;
        if (other.getRowLevelPermissionDataSet() != null && other.getRowLevelPermissionDataSet().equals(this.getRowLevelPermissionDataSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getPhysicalTableMap() == null) ? 0 : getPhysicalTableMap().hashCode());
        hashCode = prime * hashCode + ((getLogicalTableMap() == null) ? 0 : getLogicalTableMap().hashCode());
        hashCode = prime * hashCode + ((getOutputColumns() == null) ? 0 : getOutputColumns().hashCode());
        hashCode = prime * hashCode + ((getImportMode() == null) ? 0 : getImportMode().hashCode());
        hashCode = prime * hashCode + ((getConsumedSpiceCapacityInBytes() == null) ? 0 : getConsumedSpiceCapacityInBytes().hashCode());
        hashCode = prime * hashCode + ((getColumnGroups() == null) ? 0 : getColumnGroups().hashCode());
        hashCode = prime * hashCode + ((getRowLevelPermissionDataSet() == null) ? 0 : getRowLevelPermissionDataSet().hashCode());
        return hashCode;
    }

    @Override
    public DataSet clone() {
        try {
            return (DataSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
