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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the dataset that you want to update. This ID is unique per AWS Region for each AWS account.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The display name for the dataset.
     * </p>
     */
    private String name;
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
     * Indicates whether you want to import the data into SPICE.
     * </p>
     */
    private String importMode;
    /**
     * <p>
     * Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is
     * supported.
     * </p>
     */
    private java.util.List<ColumnGroup> columnGroups;
    /**
     * <p>
     * The row-level security configuration for the data you want to create.
     * </p>
     */
    private RowLevelPermissionDataSet rowLevelPermissionDataSet;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @return The AWS account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the dataset that you want to update. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param dataSetId
     *        The ID for the dataset that you want to update. This ID is unique per AWS Region for each AWS account.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The ID for the dataset that you want to update. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @return The ID for the dataset that you want to update. This ID is unique per AWS Region for each AWS account.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The ID for the dataset that you want to update. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param dataSetId
     *        The ID for the dataset that you want to update. This ID is unique per AWS Region for each AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetRequest withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The display name for the dataset.
     * </p>
     * 
     * @param name
     *        The display name for the dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name for the dataset.
     * </p>
     * 
     * @return The display name for the dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name for the dataset.
     * </p>
     * 
     * @param name
     *        The display name for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetRequest withName(String name) {
        setName(name);
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

    public UpdateDataSetRequest withPhysicalTableMap(java.util.Map<String, PhysicalTable> physicalTableMap) {
        setPhysicalTableMap(physicalTableMap);
        return this;
    }

    /**
     * Add a single PhysicalTableMap entry
     *
     * @see UpdateDataSetRequest#withPhysicalTableMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetRequest addPhysicalTableMapEntry(String key, PhysicalTable value) {
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

    public UpdateDataSetRequest clearPhysicalTableMapEntries() {
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

    public UpdateDataSetRequest withLogicalTableMap(java.util.Map<String, LogicalTable> logicalTableMap) {
        setLogicalTableMap(logicalTableMap);
        return this;
    }

    /**
     * Add a single LogicalTableMap entry
     *
     * @see UpdateDataSetRequest#withLogicalTableMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetRequest addLogicalTableMapEntry(String key, LogicalTable value) {
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

    public UpdateDataSetRequest clearLogicalTableMapEntries() {
        this.logicalTableMap = null;
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

    public UpdateDataSetRequest withImportMode(String importMode) {
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

    public UpdateDataSetRequest withImportMode(DataSetImportMode importMode) {
        this.importMode = importMode.toString();
        return this;
    }

    /**
     * <p>
     * Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is
     * supported.
     * </p>
     * 
     * @return Groupings of columns that work together in certain QuickSight features. Currently, only geospatial
     *         hierarchy is supported.
     */

    public java.util.List<ColumnGroup> getColumnGroups() {
        return columnGroups;
    }

    /**
     * <p>
     * Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is
     * supported.
     * </p>
     * 
     * @param columnGroups
     *        Groupings of columns that work together in certain QuickSight features. Currently, only geospatial
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
     * Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is
     * supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnGroups(java.util.Collection)} or {@link #withColumnGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnGroups
     *        Groupings of columns that work together in certain QuickSight features. Currently, only geospatial
     *        hierarchy is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetRequest withColumnGroups(ColumnGroup... columnGroups) {
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
     * Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is
     * supported.
     * </p>
     * 
     * @param columnGroups
     *        Groupings of columns that work together in certain QuickSight features. Currently, only geospatial
     *        hierarchy is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetRequest withColumnGroups(java.util.Collection<ColumnGroup> columnGroups) {
        setColumnGroups(columnGroups);
        return this;
    }

    /**
     * <p>
     * The row-level security configuration for the data you want to create.
     * </p>
     * 
     * @param rowLevelPermissionDataSet
     *        The row-level security configuration for the data you want to create.
     */

    public void setRowLevelPermissionDataSet(RowLevelPermissionDataSet rowLevelPermissionDataSet) {
        this.rowLevelPermissionDataSet = rowLevelPermissionDataSet;
    }

    /**
     * <p>
     * The row-level security configuration for the data you want to create.
     * </p>
     * 
     * @return The row-level security configuration for the data you want to create.
     */

    public RowLevelPermissionDataSet getRowLevelPermissionDataSet() {
        return this.rowLevelPermissionDataSet;
    }

    /**
     * <p>
     * The row-level security configuration for the data you want to create.
     * </p>
     * 
     * @param rowLevelPermissionDataSet
     *        The row-level security configuration for the data you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSetRequest withRowLevelPermissionDataSet(RowLevelPermissionDataSet rowLevelPermissionDataSet) {
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPhysicalTableMap() != null)
            sb.append("PhysicalTableMap: ").append(getPhysicalTableMap()).append(",");
        if (getLogicalTableMap() != null)
            sb.append("LogicalTableMap: ").append(getLogicalTableMap()).append(",");
        if (getImportMode() != null)
            sb.append("ImportMode: ").append(getImportMode()).append(",");
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

        if (obj instanceof UpdateDataSetRequest == false)
            return false;
        UpdateDataSetRequest other = (UpdateDataSetRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPhysicalTableMap() == null ^ this.getPhysicalTableMap() == null)
            return false;
        if (other.getPhysicalTableMap() != null && other.getPhysicalTableMap().equals(this.getPhysicalTableMap()) == false)
            return false;
        if (other.getLogicalTableMap() == null ^ this.getLogicalTableMap() == null)
            return false;
        if (other.getLogicalTableMap() != null && other.getLogicalTableMap().equals(this.getLogicalTableMap()) == false)
            return false;
        if (other.getImportMode() == null ^ this.getImportMode() == null)
            return false;
        if (other.getImportMode() != null && other.getImportMode().equals(this.getImportMode()) == false)
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

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPhysicalTableMap() == null) ? 0 : getPhysicalTableMap().hashCode());
        hashCode = prime * hashCode + ((getLogicalTableMap() == null) ? 0 : getLogicalTableMap().hashCode());
        hashCode = prime * hashCode + ((getImportMode() == null) ? 0 : getImportMode().hashCode());
        hashCode = prime * hashCode + ((getColumnGroups() == null) ? 0 : getColumnGroups().hashCode());
        hashCode = prime * hashCode + ((getRowLevelPermissionDataSet() == null) ? 0 : getRowLevelPermissionDataSet().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataSetRequest clone() {
        return (UpdateDataSetRequest) super.clone();
    }

}
