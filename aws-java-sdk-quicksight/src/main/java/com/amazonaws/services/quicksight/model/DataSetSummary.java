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
 * Dataset summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
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
     * Indicates whether you want to import the data into SPICE.
     * </p>
     */
    private String importMode;
    /**
     * <p>
     * The row-level security configuration for the dataset.
     * </p>
     */
    private RowLevelPermissionDataSet rowLevelPermissionDataSet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the dataset.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetSummary withArn(String arn) {
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

    public DataSetSummary withDataSetId(String dataSetId) {
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

    public DataSetSummary withName(String name) {
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

    public DataSetSummary withCreatedTime(java.util.Date createdTime) {
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

    public DataSetSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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

    public DataSetSummary withImportMode(String importMode) {
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

    public DataSetSummary withImportMode(DataSetImportMode importMode) {
        this.importMode = importMode.toString();
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

    public DataSetSummary withRowLevelPermissionDataSet(RowLevelPermissionDataSet rowLevelPermissionDataSet) {
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
        if (getImportMode() != null)
            sb.append("ImportMode: ").append(getImportMode()).append(",");
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

        if (obj instanceof DataSetSummary == false)
            return false;
        DataSetSummary other = (DataSetSummary) obj;
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
        if (other.getImportMode() == null ^ this.getImportMode() == null)
            return false;
        if (other.getImportMode() != null && other.getImportMode().equals(this.getImportMode()) == false)
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
        hashCode = prime * hashCode + ((getImportMode() == null) ? 0 : getImportMode().hashCode());
        hashCode = prime * hashCode + ((getRowLevelPermissionDataSet() == null) ? 0 : getRowLevelPermissionDataSet().hashCode());
        return hashCode;
    }

    @Override
    public DataSetSummary clone() {
        try {
            return (DataSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
