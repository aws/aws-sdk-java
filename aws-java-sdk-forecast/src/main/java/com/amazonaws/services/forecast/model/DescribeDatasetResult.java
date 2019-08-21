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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The name of the dataset.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The dataset domain.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The dataset type.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * The frequency of data collection.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every month and "30min"
     * indicates every 30 minutes.
     * </p>
     */
    private String dataFrequency;
    /**
     * <p>
     * An array of <code>SchemaAttribute</code> objects that specify the dataset fields. Each
     * <code>SchemaAttribute</code> specifies the name and data type of a field.
     * </p>
     */
    private Schema schema;
    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     */
    private EncryptionConfig encryptionConfig;
    /**
     * <p>
     * The status of the dataset. States include:
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
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>UPDATE</code> states apply while data is imported to the dataset from a call to the
     * <a>CreateDatasetImportJob</a> operation. During this time, the status reflects the status of the dataset import
     * job. For example, when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset must be <code>ACTIVE</code> before you can import training data.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * When the dataset was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the dataset is created, <code>LastModificationTime</code> is the same as <code>CreationTime</code>. After a
     * <a>CreateDatasetImportJob</a> operation is called, <code>LastModificationTime</code> is when the import job
     * finished or failed. While data is being imported to the dataset, <code>LastModificationTime</code> is the current
     * query time.
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @return The name of the dataset.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The dataset domain.
     * </p>
     * 
     * @param domain
     *        The dataset domain.
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The dataset domain.
     * </p>
     * 
     * @return The dataset domain.
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The dataset domain.
     * </p>
     * 
     * @param domain
     *        The dataset domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public DescribeDatasetResult withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The dataset domain.
     * </p>
     * 
     * @param domain
     *        The dataset domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public DescribeDatasetResult withDomain(Domain domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * The dataset type.
     * </p>
     * 
     * @param datasetType
     *        The dataset type.
     * @see DatasetType
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The dataset type.
     * </p>
     * 
     * @return The dataset type.
     * @see DatasetType
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The dataset type.
     * </p>
     * 
     * @param datasetType
     *        The dataset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public DescribeDatasetResult withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * The dataset type.
     * </p>
     * 
     * @param datasetType
     *        The dataset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public DescribeDatasetResult withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * The frequency of data collection.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every month and "30min"
     * indicates every 30 minutes.
     * </p>
     * 
     * @param dataFrequency
     *        The frequency of data collection.</p>
     *        <p>
     *        Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *        minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every
     *        month and "30min" indicates every 30 minutes.
     */

    public void setDataFrequency(String dataFrequency) {
        this.dataFrequency = dataFrequency;
    }

    /**
     * <p>
     * The frequency of data collection.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every month and "30min"
     * indicates every 30 minutes.
     * </p>
     * 
     * @return The frequency of data collection.</p>
     *         <p>
     *         Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *         minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every
     *         month and "30min" indicates every 30 minutes.
     */

    public String getDataFrequency() {
        return this.dataFrequency;
    }

    /**
     * <p>
     * The frequency of data collection.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every month and "30min"
     * indicates every 30 minutes.
     * </p>
     * 
     * @param dataFrequency
     *        The frequency of data collection.</p>
     *        <p>
     *        Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *        minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every
     *        month and "30min" indicates every 30 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withDataFrequency(String dataFrequency) {
        setDataFrequency(dataFrequency);
        return this;
    }

    /**
     * <p>
     * An array of <code>SchemaAttribute</code> objects that specify the dataset fields. Each
     * <code>SchemaAttribute</code> specifies the name and data type of a field.
     * </p>
     * 
     * @param schema
     *        An array of <code>SchemaAttribute</code> objects that specify the dataset fields. Each
     *        <code>SchemaAttribute</code> specifies the name and data type of a field.
     */

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * An array of <code>SchemaAttribute</code> objects that specify the dataset fields. Each
     * <code>SchemaAttribute</code> specifies the name and data type of a field.
     * </p>
     * 
     * @return An array of <code>SchemaAttribute</code> objects that specify the dataset fields. Each
     *         <code>SchemaAttribute</code> specifies the name and data type of a field.
     */

    public Schema getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * An array of <code>SchemaAttribute</code> objects that specify the dataset fields. Each
     * <code>SchemaAttribute</code> specifies the name and data type of a field.
     * </p>
     * 
     * @param schema
     *        An array of <code>SchemaAttribute</code> objects that specify the dataset fields. Each
     *        <code>SchemaAttribute</code> specifies the name and data type of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withSchema(Schema schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @param encryptionConfig
     *        An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *        Forecast can assume to access the key.
     */

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @return An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *         Forecast can assume to access the key.
     */

    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @param encryptionConfig
     *        An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *        Forecast can assume to access the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
        return this;
    }

    /**
     * <p>
     * The status of the dataset. States include:
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
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>UPDATE</code> states apply while data is imported to the dataset from a call to the
     * <a>CreateDatasetImportJob</a> operation. During this time, the status reflects the status of the dataset import
     * job. For example, when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset must be <code>ACTIVE</code> before you can import training data.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the dataset. States include:</p>
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
     *        <li>
     *        <p>
     *        <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <code>UPDATE</code> states apply while data is imported to the dataset from a call to the
     *        <a>CreateDatasetImportJob</a> operation. During this time, the status reflects the status of the dataset
     *        import job. For example, when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the
     *        dataset is <code>UPDATE_IN_PROGRESS</code>.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the dataset must be <code>ACTIVE</code> before you can import training data.
     *        </p>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dataset. States include:
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
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>UPDATE</code> states apply while data is imported to the dataset from a call to the
     * <a>CreateDatasetImportJob</a> operation. During this time, the status reflects the status of the dataset import
     * job. For example, when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset must be <code>ACTIVE</code> before you can import training data.
     * </p>
     * </note>
     * 
     * @return The status of the dataset. States include:</p>
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
     *         <li>
     *         <p>
     *         <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The <code>UPDATE</code> states apply while data is imported to the dataset from a call to the
     *         <a>CreateDatasetImportJob</a> operation. During this time, the status reflects the status of the dataset
     *         import job. For example, when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the
     *         dataset is <code>UPDATE_IN_PROGRESS</code>.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Status</code> of the dataset must be <code>ACTIVE</code> before you can import training data.
     *         </p>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the dataset. States include:
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
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>UPDATE</code> states apply while data is imported to the dataset from a call to the
     * <a>CreateDatasetImportJob</a> operation. During this time, the status reflects the status of the dataset import
     * job. For example, when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset must be <code>ACTIVE</code> before you can import training data.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the dataset. States include:</p>
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
     *        <li>
     *        <p>
     *        <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <code>UPDATE</code> states apply while data is imported to the dataset from a call to the
     *        <a>CreateDatasetImportJob</a> operation. During this time, the status reflects the status of the dataset
     *        import job. For example, when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the
     *        dataset is <code>UPDATE_IN_PROGRESS</code>.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the dataset must be <code>ACTIVE</code> before you can import training data.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When the dataset was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the dataset was created.
     * </p>
     * 
     * @return When the dataset was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the dataset was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the dataset is created, <code>LastModificationTime</code> is the same as <code>CreationTime</code>. After a
     * <a>CreateDatasetImportJob</a> operation is called, <code>LastModificationTime</code> is when the import job
     * finished or failed. While data is being imported to the dataset, <code>LastModificationTime</code> is the current
     * query time.
     * </p>
     * 
     * @param lastModificationTime
     *        When the dataset is created, <code>LastModificationTime</code> is the same as <code>CreationTime</code>.
     *        After a <a>CreateDatasetImportJob</a> operation is called, <code>LastModificationTime</code> is when the
     *        import job finished or failed. While data is being imported to the dataset,
     *        <code>LastModificationTime</code> is the current query time.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * When the dataset is created, <code>LastModificationTime</code> is the same as <code>CreationTime</code>. After a
     * <a>CreateDatasetImportJob</a> operation is called, <code>LastModificationTime</code> is when the import job
     * finished or failed. While data is being imported to the dataset, <code>LastModificationTime</code> is the current
     * query time.
     * </p>
     * 
     * @return When the dataset is created, <code>LastModificationTime</code> is the same as <code>CreationTime</code>.
     *         After a <a>CreateDatasetImportJob</a> operation is called, <code>LastModificationTime</code> is when the
     *         import job finished or failed. While data is being imported to the dataset,
     *         <code>LastModificationTime</code> is the current query time.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * When the dataset is created, <code>LastModificationTime</code> is the same as <code>CreationTime</code>. After a
     * <a>CreateDatasetImportJob</a> operation is called, <code>LastModificationTime</code> is when the import job
     * finished or failed. While data is being imported to the dataset, <code>LastModificationTime</code> is the current
     * query time.
     * </p>
     * 
     * @param lastModificationTime
     *        When the dataset is created, <code>LastModificationTime</code> is the same as <code>CreationTime</code>.
     *        After a <a>CreateDatasetImportJob</a> operation is called, <code>LastModificationTime</code> is when the
     *        import job finished or failed. While data is being imported to the dataset,
     *        <code>LastModificationTime</code> is the current query time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withLastModificationTime(java.util.Date lastModificationTime) {
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getDataFrequency() != null)
            sb.append("DataFrequency: ").append(getDataFrequency()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof DescribeDatasetResult == false)
            return false;
        DescribeDatasetResult other = (DescribeDatasetResult) obj;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getDataFrequency() == null ^ this.getDataFrequency() == null)
            return false;
        if (other.getDataFrequency() != null && other.getDataFrequency().equals(this.getDataFrequency()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getDataFrequency() == null) ? 0 : getDataFrequency().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetResult clone() {
        try {
            return (DescribeDatasetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
