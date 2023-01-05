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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DataSet" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The logical identifier for a specific data set (in mainframe format).
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The type of dataset. The only supported value is VSAM.
     * </p>
     */
    private DatasetOrgAttributes datasetOrg;
    /**
     * <p>
     * The length of a record.
     * </p>
     */
    private RecordLength recordLength;
    /**
     * <p>
     * The relative location of the data set in the database or file system.
     * </p>
     */
    private String relativePath;
    /**
     * <p>
     * The storage type of the data set: database or file system. For Micro Focus, database corresponds to datastore and
     * file system corresponds to EFS/FSX. For Blu Age, there is no support of file system and database corresponds to
     * Blusam.
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * The logical identifier for a specific data set (in mainframe format).
     * </p>
     * 
     * @param datasetName
     *        The logical identifier for a specific data set (in mainframe format).
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The logical identifier for a specific data set (in mainframe format).
     * </p>
     * 
     * @return The logical identifier for a specific data set (in mainframe format).
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The logical identifier for a specific data set (in mainframe format).
     * </p>
     * 
     * @param datasetName
     *        The logical identifier for a specific data set (in mainframe format).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The type of dataset. The only supported value is VSAM.
     * </p>
     * 
     * @param datasetOrg
     *        The type of dataset. The only supported value is VSAM.
     */

    public void setDatasetOrg(DatasetOrgAttributes datasetOrg) {
        this.datasetOrg = datasetOrg;
    }

    /**
     * <p>
     * The type of dataset. The only supported value is VSAM.
     * </p>
     * 
     * @return The type of dataset. The only supported value is VSAM.
     */

    public DatasetOrgAttributes getDatasetOrg() {
        return this.datasetOrg;
    }

    /**
     * <p>
     * The type of dataset. The only supported value is VSAM.
     * </p>
     * 
     * @param datasetOrg
     *        The type of dataset. The only supported value is VSAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withDatasetOrg(DatasetOrgAttributes datasetOrg) {
        setDatasetOrg(datasetOrg);
        return this;
    }

    /**
     * <p>
     * The length of a record.
     * </p>
     * 
     * @param recordLength
     *        The length of a record.
     */

    public void setRecordLength(RecordLength recordLength) {
        this.recordLength = recordLength;
    }

    /**
     * <p>
     * The length of a record.
     * </p>
     * 
     * @return The length of a record.
     */

    public RecordLength getRecordLength() {
        return this.recordLength;
    }

    /**
     * <p>
     * The length of a record.
     * </p>
     * 
     * @param recordLength
     *        The length of a record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withRecordLength(RecordLength recordLength) {
        setRecordLength(recordLength);
        return this;
    }

    /**
     * <p>
     * The relative location of the data set in the database or file system.
     * </p>
     * 
     * @param relativePath
     *        The relative location of the data set in the database or file system.
     */

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    /**
     * <p>
     * The relative location of the data set in the database or file system.
     * </p>
     * 
     * @return The relative location of the data set in the database or file system.
     */

    public String getRelativePath() {
        return this.relativePath;
    }

    /**
     * <p>
     * The relative location of the data set in the database or file system.
     * </p>
     * 
     * @param relativePath
     *        The relative location of the data set in the database or file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withRelativePath(String relativePath) {
        setRelativePath(relativePath);
        return this;
    }

    /**
     * <p>
     * The storage type of the data set: database or file system. For Micro Focus, database corresponds to datastore and
     * file system corresponds to EFS/FSX. For Blu Age, there is no support of file system and database corresponds to
     * Blusam.
     * </p>
     * 
     * @param storageType
     *        The storage type of the data set: database or file system. For Micro Focus, database corresponds to
     *        datastore and file system corresponds to EFS/FSX. For Blu Age, there is no support of file system and
     *        database corresponds to Blusam.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage type of the data set: database or file system. For Micro Focus, database corresponds to datastore and
     * file system corresponds to EFS/FSX. For Blu Age, there is no support of file system and database corresponds to
     * Blusam.
     * </p>
     * 
     * @return The storage type of the data set: database or file system. For Micro Focus, database corresponds to
     *         datastore and file system corresponds to EFS/FSX. For Blu Age, there is no support of file system and
     *         database corresponds to Blusam.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The storage type of the data set: database or file system. For Micro Focus, database corresponds to datastore and
     * file system corresponds to EFS/FSX. For Blu Age, there is no support of file system and database corresponds to
     * Blusam.
     * </p>
     * 
     * @param storageType
     *        The storage type of the data set: database or file system. For Micro Focus, database corresponds to
     *        datastore and file system corresponds to EFS/FSX. For Blu Age, there is no support of file system and
     *        database corresponds to Blusam.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withStorageType(String storageType) {
        setStorageType(storageType);
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
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDatasetOrg() != null)
            sb.append("DatasetOrg: ").append(getDatasetOrg()).append(",");
        if (getRecordLength() != null)
            sb.append("RecordLength: ").append(getRecordLength()).append(",");
        if (getRelativePath() != null)
            sb.append("RelativePath: ").append(getRelativePath()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType());
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
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetOrg() == null ^ this.getDatasetOrg() == null)
            return false;
        if (other.getDatasetOrg() != null && other.getDatasetOrg().equals(this.getDatasetOrg()) == false)
            return false;
        if (other.getRecordLength() == null ^ this.getRecordLength() == null)
            return false;
        if (other.getRecordLength() != null && other.getRecordLength().equals(this.getRecordLength()) == false)
            return false;
        if (other.getRelativePath() == null ^ this.getRelativePath() == null)
            return false;
        if (other.getRelativePath() != null && other.getRelativePath().equals(this.getRelativePath()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetOrg() == null) ? 0 : getDatasetOrg().hashCode());
        hashCode = prime * hashCode + ((getRecordLength() == null) ? 0 : getRecordLength().hashCode());
        hashCode = prime * hashCode + ((getRelativePath() == null) ? 0 : getRelativePath().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
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
        com.amazonaws.services.mainframemodernization.model.transform.DataSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
