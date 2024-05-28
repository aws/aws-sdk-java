/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The object that shows the details of the column stats run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ColumnStatisticsTaskRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnStatisticsTaskRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     */
    private String customerId;
    /**
     * <p>
     * The identifier for the particular column statistics task run.
     * </p>
     */
    private String columnStatisticsTaskRunId;
    /**
     * <p>
     * The database where the table resides.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table for which column statistics is generated.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A list of the column names. If none is supplied, all column names for the table will be used by default.
     * </p>
     */
    private java.util.List<String> columnNameList;
    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is supplied, the Amazon Web Services account ID is
     * used by default.
     * </p>
     */
    private String catalogID;
    /**
     * <p>
     * The IAM role that the service assumes to generate statistics.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     * generate stats.
     * </p>
     */
    private Double sampleSize;
    /**
     * <p>
     * Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * The number of workers used to generate column statistics. The job is preconfigured to autoscale up to 25
     * instances.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The type of workers being used for generating stats. The default is <code>g.1x</code>.
     * </p>
     */
    private String workerType;
    /**
     * <p>
     * The status of the task run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time that this task was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last point in time when this task was modified.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The start time of the task.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the task.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The error message for the job.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The calculated DPU usage in seconds for all autoscaled workers.
     * </p>
     */
    private Double dPUSeconds;

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param customerId
     *        The Amazon Web Services account ID.
     */

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @return The Amazon Web Services account ID.
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param customerId
     *        The Amazon Web Services account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withCustomerId(String customerId) {
        setCustomerId(customerId);
        return this;
    }

    /**
     * <p>
     * The identifier for the particular column statistics task run.
     * </p>
     * 
     * @param columnStatisticsTaskRunId
     *        The identifier for the particular column statistics task run.
     */

    public void setColumnStatisticsTaskRunId(String columnStatisticsTaskRunId) {
        this.columnStatisticsTaskRunId = columnStatisticsTaskRunId;
    }

    /**
     * <p>
     * The identifier for the particular column statistics task run.
     * </p>
     * 
     * @return The identifier for the particular column statistics task run.
     */

    public String getColumnStatisticsTaskRunId() {
        return this.columnStatisticsTaskRunId;
    }

    /**
     * <p>
     * The identifier for the particular column statistics task run.
     * </p>
     * 
     * @param columnStatisticsTaskRunId
     *        The identifier for the particular column statistics task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withColumnStatisticsTaskRunId(String columnStatisticsTaskRunId) {
        setColumnStatisticsTaskRunId(columnStatisticsTaskRunId);
        return this;
    }

    /**
     * <p>
     * The database where the table resides.
     * </p>
     * 
     * @param databaseName
     *        The database where the table resides.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database where the table resides.
     * </p>
     * 
     * @return The database where the table resides.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database where the table resides.
     * </p>
     * 
     * @param databaseName
     *        The database where the table resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table for which column statistics is generated.
     * </p>
     * 
     * @param tableName
     *        The name of the table for which column statistics is generated.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table for which column statistics is generated.
     * </p>
     * 
     * @return The name of the table for which column statistics is generated.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table for which column statistics is generated.
     * </p>
     * 
     * @param tableName
     *        The name of the table for which column statistics is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A list of the column names. If none is supplied, all column names for the table will be used by default.
     * </p>
     * 
     * @return A list of the column names. If none is supplied, all column names for the table will be used by default.
     */

    public java.util.List<String> getColumnNameList() {
        return columnNameList;
    }

    /**
     * <p>
     * A list of the column names. If none is supplied, all column names for the table will be used by default.
     * </p>
     * 
     * @param columnNameList
     *        A list of the column names. If none is supplied, all column names for the table will be used by default.
     */

    public void setColumnNameList(java.util.Collection<String> columnNameList) {
        if (columnNameList == null) {
            this.columnNameList = null;
            return;
        }

        this.columnNameList = new java.util.ArrayList<String>(columnNameList);
    }

    /**
     * <p>
     * A list of the column names. If none is supplied, all column names for the table will be used by default.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnNameList(java.util.Collection)} or {@link #withColumnNameList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param columnNameList
     *        A list of the column names. If none is supplied, all column names for the table will be used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withColumnNameList(String... columnNameList) {
        if (this.columnNameList == null) {
            setColumnNameList(new java.util.ArrayList<String>(columnNameList.length));
        }
        for (String ele : columnNameList) {
            this.columnNameList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the column names. If none is supplied, all column names for the table will be used by default.
     * </p>
     * 
     * @param columnNameList
     *        A list of the column names. If none is supplied, all column names for the table will be used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withColumnNameList(java.util.Collection<String> columnNameList) {
        setColumnNameList(columnNameList);
        return this;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is supplied, the Amazon Web Services account ID is
     * used by default.
     * </p>
     * 
     * @param catalogID
     *        The ID of the Data Catalog where the table resides. If none is supplied, the Amazon Web Services account
     *        ID is used by default.
     */

    public void setCatalogID(String catalogID) {
        this.catalogID = catalogID;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is supplied, the Amazon Web Services account ID is
     * used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the table resides. If none is supplied, the Amazon Web Services account
     *         ID is used by default.
     */

    public String getCatalogID() {
        return this.catalogID;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is supplied, the Amazon Web Services account ID is
     * used by default.
     * </p>
     * 
     * @param catalogID
     *        The ID of the Data Catalog where the table resides. If none is supplied, the Amazon Web Services account
     *        ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withCatalogID(String catalogID) {
        setCatalogID(catalogID);
        return this;
    }

    /**
     * <p>
     * The IAM role that the service assumes to generate statistics.
     * </p>
     * 
     * @param role
     *        The IAM role that the service assumes to generate statistics.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM role that the service assumes to generate statistics.
     * </p>
     * 
     * @return The IAM role that the service assumes to generate statistics.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The IAM role that the service assumes to generate statistics.
     * </p>
     * 
     * @param role
     *        The IAM role that the service assumes to generate statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     * generate stats.
     * </p>
     * 
     * @param sampleSize
     *        The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     *        generate stats.
     */

    public void setSampleSize(Double sampleSize) {
        this.sampleSize = sampleSize;
    }

    /**
     * <p>
     * The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     * generate stats.
     * </p>
     * 
     * @return The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     *         generate stats.
     */

    public Double getSampleSize() {
        return this.sampleSize;
    }

    /**
     * <p>
     * The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     * generate stats.
     * </p>
     * 
     * @param sampleSize
     *        The percentage of rows used to generate statistics. If none is supplied, the entire table will be used to
     *        generate stats.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withSampleSize(Double sampleSize) {
        setSampleSize(sampleSize);
        return this;
    }

    /**
     * <p>
     * Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     * </p>
     * 
     * @param securityConfiguration
     *        Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     * </p>
     * 
     * @return Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     * </p>
     * 
     * @param securityConfiguration
     *        Name of the security configuration that is used to encrypt CloudWatch logs for the column stats task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * The number of workers used to generate column statistics. The job is preconfigured to autoscale up to 25
     * instances.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers used to generate column statistics. The job is preconfigured to autoscale up to 25
     *        instances.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers used to generate column statistics. The job is preconfigured to autoscale up to 25
     * instances.
     * </p>
     * 
     * @return The number of workers used to generate column statistics. The job is preconfigured to autoscale up to 25
     *         instances.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers used to generate column statistics. The job is preconfigured to autoscale up to 25
     * instances.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers used to generate column statistics. The job is preconfigured to autoscale up to 25
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The type of workers being used for generating stats. The default is <code>g.1x</code>.
     * </p>
     * 
     * @param workerType
     *        The type of workers being used for generating stats. The default is <code>g.1x</code>.
     */

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of workers being used for generating stats. The default is <code>g.1x</code>.
     * </p>
     * 
     * @return The type of workers being used for generating stats. The default is <code>g.1x</code>.
     */

    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * <p>
     * The type of workers being used for generating stats. The default is <code>g.1x</code>.
     * </p>
     * 
     * @param workerType
     *        The type of workers being used for generating stats. The default is <code>g.1x</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withWorkerType(String workerType) {
        setWorkerType(workerType);
        return this;
    }

    /**
     * <p>
     * The status of the task run.
     * </p>
     * 
     * @param status
     *        The status of the task run.
     * @see ColumnStatisticsState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task run.
     * </p>
     * 
     * @return The status of the task run.
     * @see ColumnStatisticsState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task run.
     * </p>
     * 
     * @param status
     *        The status of the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnStatisticsState
     */

    public ColumnStatisticsTaskRun withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task run.
     * </p>
     * 
     * @param status
     *        The status of the task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnStatisticsState
     */

    public ColumnStatisticsTaskRun withStatus(ColumnStatisticsState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time that this task was created.
     * </p>
     * 
     * @param creationTime
     *        The time that this task was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that this task was created.
     * </p>
     * 
     * @return The time that this task was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that this task was created.
     * </p>
     * 
     * @param creationTime
     *        The time that this task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last point in time when this task was modified.
     * </p>
     * 
     * @param lastUpdated
     *        The last point in time when this task was modified.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The last point in time when this task was modified.
     * </p>
     * 
     * @return The last point in time when this task was modified.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The last point in time when this task was modified.
     * </p>
     * 
     * @param lastUpdated
     *        The last point in time when this task was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The start time of the task.
     * </p>
     * 
     * @param startTime
     *        The start time of the task.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the task.
     * </p>
     * 
     * @return The start time of the task.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the task.
     * </p>
     * 
     * @param startTime
     *        The start time of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the task.
     * </p>
     * 
     * @param endTime
     *        The end time of the task.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the task.
     * </p>
     * 
     * @return The end time of the task.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the task.
     * </p>
     * 
     * @param endTime
     *        The end time of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The error message for the job.
     * </p>
     * 
     * @param errorMessage
     *        The error message for the job.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message for the job.
     * </p>
     * 
     * @return The error message for the job.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message for the job.
     * </p>
     * 
     * @param errorMessage
     *        The error message for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The calculated DPU usage in seconds for all autoscaled workers.
     * </p>
     * 
     * @param dPUSeconds
     *        The calculated DPU usage in seconds for all autoscaled workers.
     */

    public void setDPUSeconds(Double dPUSeconds) {
        this.dPUSeconds = dPUSeconds;
    }

    /**
     * <p>
     * The calculated DPU usage in seconds for all autoscaled workers.
     * </p>
     * 
     * @return The calculated DPU usage in seconds for all autoscaled workers.
     */

    public Double getDPUSeconds() {
        return this.dPUSeconds;
    }

    /**
     * <p>
     * The calculated DPU usage in seconds for all autoscaled workers.
     * </p>
     * 
     * @param dPUSeconds
     *        The calculated DPU usage in seconds for all autoscaled workers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsTaskRun withDPUSeconds(Double dPUSeconds) {
        setDPUSeconds(dPUSeconds);
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
        if (getCustomerId() != null)
            sb.append("CustomerId: ").append(getCustomerId()).append(",");
        if (getColumnStatisticsTaskRunId() != null)
            sb.append("ColumnStatisticsTaskRunId: ").append(getColumnStatisticsTaskRunId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getColumnNameList() != null)
            sb.append("ColumnNameList: ").append(getColumnNameList()).append(",");
        if (getCatalogID() != null)
            sb.append("CatalogID: ").append(getCatalogID()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getSampleSize() != null)
            sb.append("SampleSize: ").append(getSampleSize()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getDPUSeconds() != null)
            sb.append("DPUSeconds: ").append(getDPUSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnStatisticsTaskRun == false)
            return false;
        ColumnStatisticsTaskRun other = (ColumnStatisticsTaskRun) obj;
        if (other.getCustomerId() == null ^ this.getCustomerId() == null)
            return false;
        if (other.getCustomerId() != null && other.getCustomerId().equals(this.getCustomerId()) == false)
            return false;
        if (other.getColumnStatisticsTaskRunId() == null ^ this.getColumnStatisticsTaskRunId() == null)
            return false;
        if (other.getColumnStatisticsTaskRunId() != null && other.getColumnStatisticsTaskRunId().equals(this.getColumnStatisticsTaskRunId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getColumnNameList() == null ^ this.getColumnNameList() == null)
            return false;
        if (other.getColumnNameList() != null && other.getColumnNameList().equals(this.getColumnNameList()) == false)
            return false;
        if (other.getCatalogID() == null ^ this.getCatalogID() == null)
            return false;
        if (other.getCatalogID() != null && other.getCatalogID().equals(this.getCatalogID()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSampleSize() == null ^ this.getSampleSize() == null)
            return false;
        if (other.getSampleSize() != null && other.getSampleSize().equals(this.getSampleSize()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getDPUSeconds() == null ^ this.getDPUSeconds() == null)
            return false;
        if (other.getDPUSeconds() != null && other.getDPUSeconds().equals(this.getDPUSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        hashCode = prime * hashCode + ((getColumnStatisticsTaskRunId() == null) ? 0 : getColumnStatisticsTaskRunId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getColumnNameList() == null) ? 0 : getColumnNameList().hashCode());
        hashCode = prime * hashCode + ((getCatalogID() == null) ? 0 : getCatalogID().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSampleSize() == null) ? 0 : getSampleSize().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getDPUSeconds() == null) ? 0 : getDPUSeconds().hashCode());
        return hashCode;
    }

    @Override
    public ColumnStatisticsTaskRun clone() {
        try {
            return (ColumnStatisticsTaskRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ColumnStatisticsTaskRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
