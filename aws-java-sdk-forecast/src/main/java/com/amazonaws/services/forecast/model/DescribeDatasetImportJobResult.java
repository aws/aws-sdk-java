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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDatasetImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dataset import job.
     * </p>
     */
    private String datasetImportJobName;
    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     */
    private String datasetImportJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The format of timestamps in the dataset. Two formats are supported dependent on the <code>DataFrequency</code>
     * specified when the dataset was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * "yyyy-MM-dd"
     * </p>
     * <p>
     * For data frequencies: Y, M, W, and D
     * </p>
     * </li>
     * <li>
     * <p>
     * "yyyy-MM-dd HH:mm:ss"
     * </p>
     * <p>
     * For data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     * </p>
     * </li>
     * </ul>
     */
    private String timestampFormat;
    /**
     * <p>
     * The location of the training data to import. The training data must be stored in an Amazon S3 bucket.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * Statistical information about each field in the input data.
     * </p>
     */
    private java.util.Map<String, Statistics> fieldStatistics;
    /**
     * <p>
     * The size of the dataset in gigabytes (GB) after completion of the import job.
     * </p>
     */
    private Double dataSize;
    /**
     * <p>
     * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the
     * import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * When the dataset import job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Dependent on the status as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - same as <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - the current timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - when the job finished or failed
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The name of the dataset import job.
     * </p>
     * 
     * @param datasetImportJobName
     *        The name of the dataset import job.
     */

    public void setDatasetImportJobName(String datasetImportJobName) {
        this.datasetImportJobName = datasetImportJobName;
    }

    /**
     * <p>
     * The name of the dataset import job.
     * </p>
     * 
     * @return The name of the dataset import job.
     */

    public String getDatasetImportJobName() {
        return this.datasetImportJobName;
    }

    /**
     * <p>
     * The name of the dataset import job.
     * </p>
     * 
     * @param datasetImportJobName
     *        The name of the dataset import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withDatasetImportJobName(String datasetImportJobName) {
        setDatasetImportJobName(datasetImportJobName);
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     * 
     * @param datasetImportJobArn
     *        The ARN of the dataset import job.
     */

    public void setDatasetImportJobArn(String datasetImportJobArn) {
        this.datasetImportJobArn = datasetImportJobArn;
    }

    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     * 
     * @return The ARN of the dataset import job.
     */

    public String getDatasetImportJobArn() {
        return this.datasetImportJobArn;
    }

    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     * 
     * @param datasetImportJobArn
     *        The ARN of the dataset import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withDatasetImportJobArn(String datasetImportJobArn) {
        setDatasetImportJobArn(datasetImportJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The format of timestamps in the dataset. Two formats are supported dependent on the <code>DataFrequency</code>
     * specified when the dataset was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * "yyyy-MM-dd"
     * </p>
     * <p>
     * For data frequencies: Y, M, W, and D
     * </p>
     * </li>
     * <li>
     * <p>
     * "yyyy-MM-dd HH:mm:ss"
     * </p>
     * <p>
     * For data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     * </p>
     * </li>
     * </ul>
     * 
     * @param timestampFormat
     *        The format of timestamps in the dataset. Two formats are supported dependent on the
     *        <code>DataFrequency</code> specified when the dataset was created.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        "yyyy-MM-dd"
     *        </p>
     *        <p>
     *        For data frequencies: Y, M, W, and D
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "yyyy-MM-dd HH:mm:ss"
     *        </p>
     *        <p>
     *        For data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     *        </p>
     *        </li>
     */

    public void setTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
    }

    /**
     * <p>
     * The format of timestamps in the dataset. Two formats are supported dependent on the <code>DataFrequency</code>
     * specified when the dataset was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * "yyyy-MM-dd"
     * </p>
     * <p>
     * For data frequencies: Y, M, W, and D
     * </p>
     * </li>
     * <li>
     * <p>
     * "yyyy-MM-dd HH:mm:ss"
     * </p>
     * <p>
     * For data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     * </p>
     * </li>
     * </ul>
     * 
     * @return The format of timestamps in the dataset. Two formats are supported dependent on the
     *         <code>DataFrequency</code> specified when the dataset was created.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         "yyyy-MM-dd"
     *         </p>
     *         <p>
     *         For data frequencies: Y, M, W, and D
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "yyyy-MM-dd HH:mm:ss"
     *         </p>
     *         <p>
     *         For data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     *         </p>
     *         </li>
     */

    public String getTimestampFormat() {
        return this.timestampFormat;
    }

    /**
     * <p>
     * The format of timestamps in the dataset. Two formats are supported dependent on the <code>DataFrequency</code>
     * specified when the dataset was created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * "yyyy-MM-dd"
     * </p>
     * <p>
     * For data frequencies: Y, M, W, and D
     * </p>
     * </li>
     * <li>
     * <p>
     * "yyyy-MM-dd HH:mm:ss"
     * </p>
     * <p>
     * For data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     * </p>
     * </li>
     * </ul>
     * 
     * @param timestampFormat
     *        The format of timestamps in the dataset. Two formats are supported dependent on the
     *        <code>DataFrequency</code> specified when the dataset was created.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        "yyyy-MM-dd"
     *        </p>
     *        <p>
     *        For data frequencies: Y, M, W, and D
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "yyyy-MM-dd HH:mm:ss"
     *        </p>
     *        <p>
     *        For data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withTimestampFormat(String timestampFormat) {
        setTimestampFormat(timestampFormat);
        return this;
    }

    /**
     * <p>
     * The location of the training data to import. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * 
     * @param dataSource
     *        The location of the training data to import. The training data must be stored in an Amazon S3 bucket.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The location of the training data to import. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * 
     * @return The location of the training data to import. The training data must be stored in an Amazon S3 bucket.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The location of the training data to import. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * 
     * @param dataSource
     *        The location of the training data to import. The training data must be stored in an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * Statistical information about each field in the input data.
     * </p>
     * 
     * @return Statistical information about each field in the input data.
     */

    public java.util.Map<String, Statistics> getFieldStatistics() {
        return fieldStatistics;
    }

    /**
     * <p>
     * Statistical information about each field in the input data.
     * </p>
     * 
     * @param fieldStatistics
     *        Statistical information about each field in the input data.
     */

    public void setFieldStatistics(java.util.Map<String, Statistics> fieldStatistics) {
        this.fieldStatistics = fieldStatistics;
    }

    /**
     * <p>
     * Statistical information about each field in the input data.
     * </p>
     * 
     * @param fieldStatistics
     *        Statistical information about each field in the input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withFieldStatistics(java.util.Map<String, Statistics> fieldStatistics) {
        setFieldStatistics(fieldStatistics);
        return this;
    }

    public DescribeDatasetImportJobResult addFieldStatisticsEntry(String key, Statistics value) {
        if (null == this.fieldStatistics) {
            this.fieldStatistics = new java.util.HashMap<String, Statistics>();
        }
        if (this.fieldStatistics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.fieldStatistics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FieldStatistics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult clearFieldStatisticsEntries() {
        this.fieldStatistics = null;
        return this;
    }

    /**
     * <p>
     * The size of the dataset in gigabytes (GB) after completion of the import job.
     * </p>
     * 
     * @param dataSize
     *        The size of the dataset in gigabytes (GB) after completion of the import job.
     */

    public void setDataSize(Double dataSize) {
        this.dataSize = dataSize;
    }

    /**
     * <p>
     * The size of the dataset in gigabytes (GB) after completion of the import job.
     * </p>
     * 
     * @return The size of the dataset in gigabytes (GB) after completion of the import job.
     */

    public Double getDataSize() {
        return this.dataSize;
    }

    /**
     * <p>
     * The size of the dataset in gigabytes (GB) after completion of the import job.
     * </p>
     * 
     * @param dataSize
     *        The size of the dataset in gigabytes (GB) after completion of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withDataSize(Double dataSize) {
        setDataSize(dataSize);
        return this;
    }

    /**
     * <p>
     * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the
     * import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the dataset import job. The status is reflected in the status of the dataset. For example,
     *        when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     *        <code>UPDATE_IN_PROGRESS</code>. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the
     * import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the dataset import job. The status is reflected in the status of the dataset. For example,
     *         when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     *         <code>UPDATE_IN_PROGRESS</code>. States include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the
     * import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the dataset import job. The status is reflected in the status of the dataset. For example,
     *        when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     *        <code>UPDATE_IN_PROGRESS</code>. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, an informational message about the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @return If an error occurred, an informational message about the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, an informational message about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * When the dataset import job was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset import job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the dataset import job was created.
     * </p>
     * 
     * @return When the dataset import job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the dataset import job was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset import job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Dependent on the status as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - same as <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - the current timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - when the job finished or failed
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastModificationTime
     *        Dependent on the status as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code> - same as <code>CreationTime</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> - the current timestamp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> or <code>CREATE_FAILED</code> - when the job finished or failed
     *        </p>
     *        </li>
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * Dependent on the status as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - same as <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - the current timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - when the job finished or failed
     * </p>
     * </li>
     * </ul>
     * 
     * @return Dependent on the status as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code> - same as <code>CreationTime</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code> - the current timestamp
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> or <code>CREATE_FAILED</code> - when the job finished or failed
     *         </p>
     *         </li>
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * Dependent on the status as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - same as <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - the current timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - when the job finished or failed
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastModificationTime
     *        Dependent on the status as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code> - same as <code>CreationTime</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> - the current timestamp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> or <code>CREATE_FAILED</code> - when the job finished or failed
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getDatasetImportJobName() != null)
            sb.append("DatasetImportJobName: ").append(getDatasetImportJobName()).append(",");
        if (getDatasetImportJobArn() != null)
            sb.append("DatasetImportJobArn: ").append(getDatasetImportJobArn()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getTimestampFormat() != null)
            sb.append("TimestampFormat: ").append(getTimestampFormat()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getFieldStatistics() != null)
            sb.append("FieldStatistics: ").append(getFieldStatistics()).append(",");
        if (getDataSize() != null)
            sb.append("DataSize: ").append(getDataSize()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetImportJobResult == false)
            return false;
        DescribeDatasetImportJobResult other = (DescribeDatasetImportJobResult) obj;
        if (other.getDatasetImportJobName() == null ^ this.getDatasetImportJobName() == null)
            return false;
        if (other.getDatasetImportJobName() != null && other.getDatasetImportJobName().equals(this.getDatasetImportJobName()) == false)
            return false;
        if (other.getDatasetImportJobArn() == null ^ this.getDatasetImportJobArn() == null)
            return false;
        if (other.getDatasetImportJobArn() != null && other.getDatasetImportJobArn().equals(this.getDatasetImportJobArn()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getTimestampFormat() == null ^ this.getTimestampFormat() == null)
            return false;
        if (other.getTimestampFormat() != null && other.getTimestampFormat().equals(this.getTimestampFormat()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getFieldStatistics() == null ^ this.getFieldStatistics() == null)
            return false;
        if (other.getFieldStatistics() != null && other.getFieldStatistics().equals(this.getFieldStatistics()) == false)
            return false;
        if (other.getDataSize() == null ^ this.getDataSize() == null)
            return false;
        if (other.getDataSize() != null && other.getDataSize().equals(this.getDataSize()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetImportJobName() == null) ? 0 : getDatasetImportJobName().hashCode());
        hashCode = prime * hashCode + ((getDatasetImportJobArn() == null) ? 0 : getDatasetImportJobArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getTimestampFormat() == null) ? 0 : getTimestampFormat().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getFieldStatistics() == null) ? 0 : getFieldStatistics().hashCode());
        hashCode = prime * hashCode + ((getDataSize() == null) ? 0 : getDataSize().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetImportJobResult clone() {
        try {
            return (DescribeDatasetImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
