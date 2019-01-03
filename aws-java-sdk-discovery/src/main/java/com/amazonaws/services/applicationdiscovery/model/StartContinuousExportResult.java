/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartContinuousExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID assigned to this export.
     * </p>
     */
    private String exportId;
    /**
     * <p>
     * The name of the s3 bucket where the export data parquet files are stored.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The timestamp representing when the continuous export was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The type of data collector used to gather this data (currently only offered for AGENT).
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * A dictionary which describes how the data is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>databaseName</code> - the name of the Glue database used to store the schema.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> schemaStorageConfig;

    /**
     * <p>
     * The unique ID assigned to this export.
     * </p>
     * 
     * @param exportId
     *        The unique ID assigned to this export.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * The unique ID assigned to this export.
     * </p>
     * 
     * @return The unique ID assigned to this export.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * The unique ID assigned to this export.
     * </p>
     * 
     * @param exportId
     *        The unique ID assigned to this export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContinuousExportResult withExportId(String exportId) {
        setExportId(exportId);
        return this;
    }

    /**
     * <p>
     * The name of the s3 bucket where the export data parquet files are stored.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the s3 bucket where the export data parquet files are stored.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the s3 bucket where the export data parquet files are stored.
     * </p>
     * 
     * @return The name of the s3 bucket where the export data parquet files are stored.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The name of the s3 bucket where the export data parquet files are stored.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the s3 bucket where the export data parquet files are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContinuousExportResult withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The timestamp representing when the continuous export was started.
     * </p>
     * 
     * @param startTime
     *        The timestamp representing when the continuous export was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp representing when the continuous export was started.
     * </p>
     * 
     * @return The timestamp representing when the continuous export was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp representing when the continuous export was started.
     * </p>
     * 
     * @param startTime
     *        The timestamp representing when the continuous export was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContinuousExportResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The type of data collector used to gather this data (currently only offered for AGENT).
     * </p>
     * 
     * @param dataSource
     *        The type of data collector used to gather this data (currently only offered for AGENT).
     * @see DataSource
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The type of data collector used to gather this data (currently only offered for AGENT).
     * </p>
     * 
     * @return The type of data collector used to gather this data (currently only offered for AGENT).
     * @see DataSource
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The type of data collector used to gather this data (currently only offered for AGENT).
     * </p>
     * 
     * @param dataSource
     *        The type of data collector used to gather this data (currently only offered for AGENT).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public StartContinuousExportResult withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The type of data collector used to gather this data (currently only offered for AGENT).
     * </p>
     * 
     * @param dataSource
     *        The type of data collector used to gather this data (currently only offered for AGENT).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public StartContinuousExportResult withDataSource(DataSource dataSource) {
        this.dataSource = dataSource.toString();
        return this;
    }

    /**
     * <p>
     * A dictionary which describes how the data is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>databaseName</code> - the name of the Glue database used to store the schema.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A dictionary which describes how the data is stored.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>databaseName</code> - the name of the Glue database used to store the schema.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getSchemaStorageConfig() {
        return schemaStorageConfig;
    }

    /**
     * <p>
     * A dictionary which describes how the data is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>databaseName</code> - the name of the Glue database used to store the schema.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schemaStorageConfig
     *        A dictionary which describes how the data is stored.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>databaseName</code> - the name of the Glue database used to store the schema.
     *        </p>
     *        </li>
     */

    public void setSchemaStorageConfig(java.util.Map<String, String> schemaStorageConfig) {
        this.schemaStorageConfig = schemaStorageConfig;
    }

    /**
     * <p>
     * A dictionary which describes how the data is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>databaseName</code> - the name of the Glue database used to store the schema.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schemaStorageConfig
     *        A dictionary which describes how the data is stored.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>databaseName</code> - the name of the Glue database used to store the schema.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContinuousExportResult withSchemaStorageConfig(java.util.Map<String, String> schemaStorageConfig) {
        setSchemaStorageConfig(schemaStorageConfig);
        return this;
    }

    public StartContinuousExportResult addSchemaStorageConfigEntry(String key, String value) {
        if (null == this.schemaStorageConfig) {
            this.schemaStorageConfig = new java.util.HashMap<String, String>();
        }
        if (this.schemaStorageConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.schemaStorageConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SchemaStorageConfig.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContinuousExportResult clearSchemaStorageConfigEntries() {
        this.schemaStorageConfig = null;
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
        if (getExportId() != null)
            sb.append("ExportId: ").append(getExportId()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getSchemaStorageConfig() != null)
            sb.append("SchemaStorageConfig: ").append(getSchemaStorageConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartContinuousExportResult == false)
            return false;
        StartContinuousExportResult other = (StartContinuousExportResult) obj;
        if (other.getExportId() == null ^ this.getExportId() == null)
            return false;
        if (other.getExportId() != null && other.getExportId().equals(this.getExportId()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getSchemaStorageConfig() == null ^ this.getSchemaStorageConfig() == null)
            return false;
        if (other.getSchemaStorageConfig() != null && other.getSchemaStorageConfig().equals(this.getSchemaStorageConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportId() == null) ? 0 : getExportId().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getSchemaStorageConfig() == null) ? 0 : getSchemaStorageConfig().hashCode());
        return hashCode;
    }

    @Override
    public StartContinuousExportResult clone() {
        try {
            return (StartContinuousExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
