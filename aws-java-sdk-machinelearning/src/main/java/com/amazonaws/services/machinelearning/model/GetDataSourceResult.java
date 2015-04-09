/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a GetDataSource operation and describes a
 * <code>DataSource</code> .
 * </p>
 */
public class GetDataSourceResult implements Serializable, Cloneable {

    /**
     * The ID assigned to the <code>DataSource</code> at creation. This value
     * should be identical to the value of the <code>DataSourceId</code> in
     * the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String dataSourceId;

    /**
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String dataLocationS3;

    /**
     * A JSON string that captures the splitting rearrangement requirement of
     * the <code>DataSource</code>.
     */
    private String dataRearrangement;

    /**
     * The AWS user account from which the <code>DataSource</code> was
     * created. The account type can be either an AWS root account or an AWS
     * Identity and Access Management (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     */
    private String createdByIamUser;

    /**
     * The time that the <code>DataSource</code> was created. The time is
     * expressed in epoch time.
     */
    private java.util.Date createdAt;

    /**
     * The time of the most recent edit to the <code>DataSource</code>. The
     * time is expressed in epoch time.
     */
    private java.util.Date lastUpdatedAt;

    /**
     * The total size of observations in the data files.
     */
    private Long dataSizeInBytes;

    /**
     * The number of data files referenced by the <code>DataSource</code>.
     */
    private Long numberOfFiles;

    /**
     * A user-supplied name or description of the <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String name;

    /**
     * The current status of the <code>DataSource</code>. This element can
     * have one of the following values: <ul> <li><code>PENDING</code> -
     * Amazon Machine Language (Amazon ML) submitted a request to create a
     * <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     * creation process is underway.</li> <li><code>FAILED</code> - The
     * request to create a <code>DataSource</code> did not run to completion.
     * It is not usable.</li> <li><code>COMPLETED</code> - The creation
     * process completed successfully.</li> <li><code>DELETED</code> - The
     * <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     */
    private String status;

    /**
     * A link to the file containining logs of either create
     * <code>DataSource</code> operation.
     */
    private String logUri;

    /**
     * The description of the most recent details about creating the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     */
    private String message;

    /**
     * Describes the <Code>DataSource</Code> details specific to Amazon
     * Redshift.
     */
    private RedshiftMetadata redshiftMetadata;

    /**
     * The datasource details that are specific to Amazon RDS.
     */
    private RDSMetadata rDSMetadata;

    /**
     * The Amazon Resource Name (ARN) of an <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html#roles-about-termsandconcepts">AWS
     * IAM Role</a> such as the following:
     * arn:aws:iam::account:role/rolename.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String roleARN;

    /**
     * The parameter is <code>true</code> if statistics need to be generated
     * from the observation data.
     */
    private Boolean computeStatistics;

    /**
     * The schema used by all of the data files of this
     * <code>DataSource</code>. <note><title>Note</title><p>This parameter is
     * provided as part of the verbose format.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     */
    private String dataSourceSchema;

    /**
     * The ID assigned to the <code>DataSource</code> at creation. This value
     * should be identical to the value of the <code>DataSourceId</code> in
     * the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID assigned to the <code>DataSource</code> at creation. This value
     *         should be identical to the value of the <code>DataSourceId</code> in
     *         the request.
     */
    public String getDataSourceId() {
        return dataSourceId;
    }
    
    /**
     * The ID assigned to the <code>DataSource</code> at creation. This value
     * should be identical to the value of the <code>DataSourceId</code> in
     * the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param dataSourceId The ID assigned to the <code>DataSource</code> at creation. This value
     *         should be identical to the value of the <code>DataSourceId</code> in
     *         the request.
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    
    /**
     * The ID assigned to the <code>DataSource</code> at creation. This value
     * should be identical to the value of the <code>DataSourceId</code> in
     * the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param dataSourceId The ID assigned to the <code>DataSource</code> at creation. This value
     *         should be identical to the value of the <code>DataSourceId</code> in
     *         the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return The location of the data file or directory in Amazon Simple Storage
     *         Service (Amazon S3).
     */
    public String getDataLocationS3() {
        return dataLocationS3;
    }
    
    /**
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param dataLocationS3 The location of the data file or directory in Amazon Simple Storage
     *         Service (Amazon S3).
     */
    public void setDataLocationS3(String dataLocationS3) {
        this.dataLocationS3 = dataLocationS3;
    }
    
    /**
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param dataLocationS3 The location of the data file or directory in Amazon Simple Storage
     *         Service (Amazon S3).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withDataLocationS3(String dataLocationS3) {
        this.dataLocationS3 = dataLocationS3;
        return this;
    }

    /**
     * A JSON string that captures the splitting rearrangement requirement of
     * the <code>DataSource</code>.
     *
     * @return A JSON string that captures the splitting rearrangement requirement of
     *         the <code>DataSource</code>.
     */
    public String getDataRearrangement() {
        return dataRearrangement;
    }
    
    /**
     * A JSON string that captures the splitting rearrangement requirement of
     * the <code>DataSource</code>.
     *
     * @param dataRearrangement A JSON string that captures the splitting rearrangement requirement of
     *         the <code>DataSource</code>.
     */
    public void setDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
    }
    
    /**
     * A JSON string that captures the splitting rearrangement requirement of
     * the <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataRearrangement A JSON string that captures the splitting rearrangement requirement of
     *         the <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
        return this;
    }

    /**
     * The AWS user account from which the <code>DataSource</code> was
     * created. The account type can be either an AWS root account or an AWS
     * Identity and Access Management (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @return The AWS user account from which the <code>DataSource</code> was
     *         created. The account type can be either an AWS root account or an AWS
     *         Identity and Access Management (IAM) user account.
     */
    public String getCreatedByIamUser() {
        return createdByIamUser;
    }
    
    /**
     * The AWS user account from which the <code>DataSource</code> was
     * created. The account type can be either an AWS root account or an AWS
     * Identity and Access Management (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @param createdByIamUser The AWS user account from which the <code>DataSource</code> was
     *         created. The account type can be either an AWS root account or an AWS
     *         Identity and Access Management (IAM) user account.
     */
    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }
    
    /**
     * The AWS user account from which the <code>DataSource</code> was
     * created. The account type can be either an AWS root account or an AWS
     * Identity and Access Management (IAM) user account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @param createdByIamUser The AWS user account from which the <code>DataSource</code> was
     *         created. The account type can be either an AWS root account or an AWS
     *         Identity and Access Management (IAM) user account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
        return this;
    }

    /**
     * The time that the <code>DataSource</code> was created. The time is
     * expressed in epoch time.
     *
     * @return The time that the <code>DataSource</code> was created. The time is
     *         expressed in epoch time.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    
    /**
     * The time that the <code>DataSource</code> was created. The time is
     * expressed in epoch time.
     *
     * @param createdAt The time that the <code>DataSource</code> was created. The time is
     *         expressed in epoch time.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * The time that the <code>DataSource</code> was created. The time is
     * expressed in epoch time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt The time that the <code>DataSource</code> was created. The time is
     *         expressed in epoch time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time of the most recent edit to the <code>DataSource</code>. The
     * time is expressed in epoch time.
     *
     * @return The time of the most recent edit to the <code>DataSource</code>. The
     *         time is expressed in epoch time.
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }
    
    /**
     * The time of the most recent edit to the <code>DataSource</code>. The
     * time is expressed in epoch time.
     *
     * @param lastUpdatedAt The time of the most recent edit to the <code>DataSource</code>. The
     *         time is expressed in epoch time.
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
    
    /**
     * The time of the most recent edit to the <code>DataSource</code>. The
     * time is expressed in epoch time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedAt The time of the most recent edit to the <code>DataSource</code>. The
     *         time is expressed in epoch time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * The total size of observations in the data files.
     *
     * @return The total size of observations in the data files.
     */
    public Long getDataSizeInBytes() {
        return dataSizeInBytes;
    }
    
    /**
     * The total size of observations in the data files.
     *
     * @param dataSizeInBytes The total size of observations in the data files.
     */
    public void setDataSizeInBytes(Long dataSizeInBytes) {
        this.dataSizeInBytes = dataSizeInBytes;
    }
    
    /**
     * The total size of observations in the data files.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataSizeInBytes The total size of observations in the data files.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withDataSizeInBytes(Long dataSizeInBytes) {
        this.dataSizeInBytes = dataSizeInBytes;
        return this;
    }

    /**
     * The number of data files referenced by the <code>DataSource</code>.
     *
     * @return The number of data files referenced by the <code>DataSource</code>.
     */
    public Long getNumberOfFiles() {
        return numberOfFiles;
    }
    
    /**
     * The number of data files referenced by the <code>DataSource</code>.
     *
     * @param numberOfFiles The number of data files referenced by the <code>DataSource</code>.
     */
    public void setNumberOfFiles(Long numberOfFiles) {
        this.numberOfFiles = numberOfFiles;
    }
    
    /**
     * The number of data files referenced by the <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfFiles The number of data files referenced by the <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withNumberOfFiles(Long numberOfFiles) {
        this.numberOfFiles = numberOfFiles;
        return this;
    }

    /**
     * A user-supplied name or description of the <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A user-supplied name or description of the <code>DataSource</code>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * A user-supplied name or description of the <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param name A user-supplied name or description of the <code>DataSource</code>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * A user-supplied name or description of the <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param name A user-supplied name or description of the <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The current status of the <code>DataSource</code>. This element can
     * have one of the following values: <ul> <li><code>PENDING</code> -
     * Amazon Machine Language (Amazon ML) submitted a request to create a
     * <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     * creation process is underway.</li> <li><code>FAILED</code> - The
     * request to create a <code>DataSource</code> did not run to completion.
     * It is not usable.</li> <li><code>COMPLETED</code> - The creation
     * process completed successfully.</li> <li><code>DELETED</code> - The
     * <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @return The current status of the <code>DataSource</code>. This element can
     *         have one of the following values: <ul> <li><code>PENDING</code> -
     *         Amazon Machine Language (Amazon ML) submitted a request to create a
     *         <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     *         creation process is underway.</li> <li><code>FAILED</code> - The
     *         request to create a <code>DataSource</code> did not run to completion.
     *         It is not usable.</li> <li><code>COMPLETED</code> - The creation
     *         process completed successfully.</li> <li><code>DELETED</code> - The
     *         <code>DataSource</code> is marked as deleted. It is not usable.</li>
     *         </ul>
     *
     * @see EntityStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current status of the <code>DataSource</code>. This element can
     * have one of the following values: <ul> <li><code>PENDING</code> -
     * Amazon Machine Language (Amazon ML) submitted a request to create a
     * <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     * creation process is underway.</li> <li><code>FAILED</code> - The
     * request to create a <code>DataSource</code> did not run to completion.
     * It is not usable.</li> <li><code>COMPLETED</code> - The creation
     * process completed successfully.</li> <li><code>DELETED</code> - The
     * <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The current status of the <code>DataSource</code>. This element can
     *         have one of the following values: <ul> <li><code>PENDING</code> -
     *         Amazon Machine Language (Amazon ML) submitted a request to create a
     *         <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     *         creation process is underway.</li> <li><code>FAILED</code> - The
     *         request to create a <code>DataSource</code> did not run to completion.
     *         It is not usable.</li> <li><code>COMPLETED</code> - The creation
     *         process completed successfully.</li> <li><code>DELETED</code> - The
     *         <code>DataSource</code> is marked as deleted. It is not usable.</li>
     *         </ul>
     *
     * @see EntityStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current status of the <code>DataSource</code>. This element can
     * have one of the following values: <ul> <li><code>PENDING</code> -
     * Amazon Machine Language (Amazon ML) submitted a request to create a
     * <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     * creation process is underway.</li> <li><code>FAILED</code> - The
     * request to create a <code>DataSource</code> did not run to completion.
     * It is not usable.</li> <li><code>COMPLETED</code> - The creation
     * process completed successfully.</li> <li><code>DELETED</code> - The
     * <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The current status of the <code>DataSource</code>. This element can
     *         have one of the following values: <ul> <li><code>PENDING</code> -
     *         Amazon Machine Language (Amazon ML) submitted a request to create a
     *         <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     *         creation process is underway.</li> <li><code>FAILED</code> - The
     *         request to create a <code>DataSource</code> did not run to completion.
     *         It is not usable.</li> <li><code>COMPLETED</code> - The creation
     *         process completed successfully.</li> <li><code>DELETED</code> - The
     *         <code>DataSource</code> is marked as deleted. It is not usable.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EntityStatus
     */
    public GetDataSourceResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the <code>DataSource</code>. This element can
     * have one of the following values: <ul> <li><code>PENDING</code> -
     * Amazon Machine Language (Amazon ML) submitted a request to create a
     * <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     * creation process is underway.</li> <li><code>FAILED</code> - The
     * request to create a <code>DataSource</code> did not run to completion.
     * It is not usable.</li> <li><code>COMPLETED</code> - The creation
     * process completed successfully.</li> <li><code>DELETED</code> - The
     * <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The current status of the <code>DataSource</code>. This element can
     *         have one of the following values: <ul> <li><code>PENDING</code> -
     *         Amazon Machine Language (Amazon ML) submitted a request to create a
     *         <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     *         creation process is underway.</li> <li><code>FAILED</code> - The
     *         request to create a <code>DataSource</code> did not run to completion.
     *         It is not usable.</li> <li><code>COMPLETED</code> - The creation
     *         process completed successfully.</li> <li><code>DELETED</code> - The
     *         <code>DataSource</code> is marked as deleted. It is not usable.</li>
     *         </ul>
     *
     * @see EntityStatus
     */
    public void setStatus(EntityStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The current status of the <code>DataSource</code>. This element can
     * have one of the following values: <ul> <li><code>PENDING</code> -
     * Amazon Machine Language (Amazon ML) submitted a request to create a
     * <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     * creation process is underway.</li> <li><code>FAILED</code> - The
     * request to create a <code>DataSource</code> did not run to completion.
     * It is not usable.</li> <li><code>COMPLETED</code> - The creation
     * process completed successfully.</li> <li><code>DELETED</code> - The
     * <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The current status of the <code>DataSource</code>. This element can
     *         have one of the following values: <ul> <li><code>PENDING</code> -
     *         Amazon Machine Language (Amazon ML) submitted a request to create a
     *         <code>DataSource</code>.</li> <li><code>INPROGRESS</code> - The
     *         creation process is underway.</li> <li><code>FAILED</code> - The
     *         request to create a <code>DataSource</code> did not run to completion.
     *         It is not usable.</li> <li><code>COMPLETED</code> - The creation
     *         process completed successfully.</li> <li><code>DELETED</code> - The
     *         <code>DataSource</code> is marked as deleted. It is not usable.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EntityStatus
     */
    public GetDataSourceResult withStatus(EntityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * A link to the file containining logs of either create
     * <code>DataSource</code> operation.
     *
     * @return A link to the file containining logs of either create
     *         <code>DataSource</code> operation.
     */
    public String getLogUri() {
        return logUri;
    }
    
    /**
     * A link to the file containining logs of either create
     * <code>DataSource</code> operation.
     *
     * @param logUri A link to the file containining logs of either create
     *         <code>DataSource</code> operation.
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }
    
    /**
     * A link to the file containining logs of either create
     * <code>DataSource</code> operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logUri A link to the file containining logs of either create
     *         <code>DataSource</code> operation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * The description of the most recent details about creating the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @return The description of the most recent details about creating the
     *         <code>DataSource</code>.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The description of the most recent details about creating the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @param message The description of the most recent details about creating the
     *         <code>DataSource</code>.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The description of the most recent details about creating the
     * <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @param message The description of the most recent details about creating the
     *         <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Describes the <Code>DataSource</Code> details specific to Amazon
     * Redshift.
     *
     * @return Describes the <Code>DataSource</Code> details specific to Amazon
     *         Redshift.
     */
    public RedshiftMetadata getRedshiftMetadata() {
        return redshiftMetadata;
    }
    
    /**
     * Describes the <Code>DataSource</Code> details specific to Amazon
     * Redshift.
     *
     * @param redshiftMetadata Describes the <Code>DataSource</Code> details specific to Amazon
     *         Redshift.
     */
    public void setRedshiftMetadata(RedshiftMetadata redshiftMetadata) {
        this.redshiftMetadata = redshiftMetadata;
    }
    
    /**
     * Describes the <Code>DataSource</Code> details specific to Amazon
     * Redshift.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param redshiftMetadata Describes the <Code>DataSource</Code> details specific to Amazon
     *         Redshift.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withRedshiftMetadata(RedshiftMetadata redshiftMetadata) {
        this.redshiftMetadata = redshiftMetadata;
        return this;
    }

    /**
     * The datasource details that are specific to Amazon RDS.
     *
     * @return The datasource details that are specific to Amazon RDS.
     */
    public RDSMetadata getRDSMetadata() {
        return rDSMetadata;
    }
    
    /**
     * The datasource details that are specific to Amazon RDS.
     *
     * @param rDSMetadata The datasource details that are specific to Amazon RDS.
     */
    public void setRDSMetadata(RDSMetadata rDSMetadata) {
        this.rDSMetadata = rDSMetadata;
    }
    
    /**
     * The datasource details that are specific to Amazon RDS.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rDSMetadata The datasource details that are specific to Amazon RDS.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withRDSMetadata(RDSMetadata rDSMetadata) {
        this.rDSMetadata = rDSMetadata;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of an <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html#roles-about-termsandconcepts">AWS
     * IAM Role</a> such as the following:
     * arn:aws:iam::account:role/rolename.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The Amazon Resource Name (ARN) of an <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html#roles-about-termsandconcepts">AWS
     *         IAM Role</a> such as the following:
     *         arn:aws:iam::account:role/rolename.
     */
    public String getRoleARN() {
        return roleARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of an <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html#roles-about-termsandconcepts">AWS
     * IAM Role</a> such as the following:
     * arn:aws:iam::account:role/rolename.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param roleARN The Amazon Resource Name (ARN) of an <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html#roles-about-termsandconcepts">AWS
     *         IAM Role</a> such as the following:
     *         arn:aws:iam::account:role/rolename.
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of an <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html#roles-about-termsandconcepts">AWS
     * IAM Role</a> such as the following:
     * arn:aws:iam::account:role/rolename.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param roleARN The Amazon Resource Name (ARN) of an <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html#roles-about-termsandconcepts">AWS
     *         IAM Role</a> such as the following:
     *         arn:aws:iam::account:role/rolename.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * The parameter is <code>true</code> if statistics need to be generated
     * from the observation data.
     *
     * @return The parameter is <code>true</code> if statistics need to be generated
     *         from the observation data.
     */
    public Boolean isComputeStatistics() {
        return computeStatistics;
    }
    
    /**
     * The parameter is <code>true</code> if statistics need to be generated
     * from the observation data.
     *
     * @param computeStatistics The parameter is <code>true</code> if statistics need to be generated
     *         from the observation data.
     */
    public void setComputeStatistics(Boolean computeStatistics) {
        this.computeStatistics = computeStatistics;
    }
    
    /**
     * The parameter is <code>true</code> if statistics need to be generated
     * from the observation data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param computeStatistics The parameter is <code>true</code> if statistics need to be generated
     *         from the observation data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withComputeStatistics(Boolean computeStatistics) {
        this.computeStatistics = computeStatistics;
        return this;
    }

    /**
     * The parameter is <code>true</code> if statistics need to be generated
     * from the observation data.
     *
     * @return The parameter is <code>true</code> if statistics need to be generated
     *         from the observation data.
     */
    public Boolean getComputeStatistics() {
        return computeStatistics;
    }

    /**
     * The schema used by all of the data files of this
     * <code>DataSource</code>. <note><title>Note</title><p>This parameter is
     * provided as part of the verbose format.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @return The schema used by all of the data files of this
     *         <code>DataSource</code>. <note><title>Note</title><p>This parameter is
     *         provided as part of the verbose format.</note>
     */
    public String getDataSourceSchema() {
        return dataSourceSchema;
    }
    
    /**
     * The schema used by all of the data files of this
     * <code>DataSource</code>. <note><title>Note</title><p>This parameter is
     * provided as part of the verbose format.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @param dataSourceSchema The schema used by all of the data files of this
     *         <code>DataSource</code>. <note><title>Note</title><p>This parameter is
     *         provided as part of the verbose format.</note>
     */
    public void setDataSourceSchema(String dataSourceSchema) {
        this.dataSourceSchema = dataSourceSchema;
    }
    
    /**
     * The schema used by all of the data files of this
     * <code>DataSource</code>. <note><title>Note</title><p>This parameter is
     * provided as part of the verbose format.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @param dataSourceSchema The schema used by all of the data files of this
     *         <code>DataSource</code>. <note><title>Note</title><p>This parameter is
     *         provided as part of the verbose format.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataSourceResult withDataSourceSchema(String dataSourceSchema) {
        this.dataSourceSchema = dataSourceSchema;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataSourceId() != null) sb.append("DataSourceId: " + getDataSourceId() + ",");
        if (getDataLocationS3() != null) sb.append("DataLocationS3: " + getDataLocationS3() + ",");
        if (getDataRearrangement() != null) sb.append("DataRearrangement: " + getDataRearrangement() + ",");
        if (getCreatedByIamUser() != null) sb.append("CreatedByIamUser: " + getCreatedByIamUser() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null) sb.append("LastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getDataSizeInBytes() != null) sb.append("DataSizeInBytes: " + getDataSizeInBytes() + ",");
        if (getNumberOfFiles() != null) sb.append("NumberOfFiles: " + getNumberOfFiles() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getLogUri() != null) sb.append("LogUri: " + getLogUri() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getRedshiftMetadata() != null) sb.append("RedshiftMetadata: " + getRedshiftMetadata() + ",");
        if (getRDSMetadata() != null) sb.append("RDSMetadata: " + getRDSMetadata() + ",");
        if (getRoleARN() != null) sb.append("RoleARN: " + getRoleARN() + ",");
        if (isComputeStatistics() != null) sb.append("ComputeStatistics: " + isComputeStatistics() + ",");
        if (getDataSourceSchema() != null) sb.append("DataSourceSchema: " + getDataSourceSchema() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode()); 
        hashCode = prime * hashCode + ((getDataLocationS3() == null) ? 0 : getDataLocationS3().hashCode()); 
        hashCode = prime * hashCode + ((getDataRearrangement() == null) ? 0 : getDataRearrangement().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedByIamUser() == null) ? 0 : getCreatedByIamUser().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getDataSizeInBytes() == null) ? 0 : getDataSizeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfFiles() == null) ? 0 : getNumberOfFiles().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getRedshiftMetadata() == null) ? 0 : getRedshiftMetadata().hashCode()); 
        hashCode = prime * hashCode + ((getRDSMetadata() == null) ? 0 : getRDSMetadata().hashCode()); 
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode()); 
        hashCode = prime * hashCode + ((isComputeStatistics() == null) ? 0 : isComputeStatistics().hashCode()); 
        hashCode = prime * hashCode + ((getDataSourceSchema() == null) ? 0 : getDataSourceSchema().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetDataSourceResult == false) return false;
        GetDataSourceResult other = (GetDataSourceResult)obj;
        
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null) return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false) return false; 
        if (other.getDataLocationS3() == null ^ this.getDataLocationS3() == null) return false;
        if (other.getDataLocationS3() != null && other.getDataLocationS3().equals(this.getDataLocationS3()) == false) return false; 
        if (other.getDataRearrangement() == null ^ this.getDataRearrangement() == null) return false;
        if (other.getDataRearrangement() != null && other.getDataRearrangement().equals(this.getDataRearrangement()) == false) return false; 
        if (other.getCreatedByIamUser() == null ^ this.getCreatedByIamUser() == null) return false;
        if (other.getCreatedByIamUser() != null && other.getCreatedByIamUser().equals(this.getCreatedByIamUser()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null) return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false) return false; 
        if (other.getDataSizeInBytes() == null ^ this.getDataSizeInBytes() == null) return false;
        if (other.getDataSizeInBytes() != null && other.getDataSizeInBytes().equals(this.getDataSizeInBytes()) == false) return false; 
        if (other.getNumberOfFiles() == null ^ this.getNumberOfFiles() == null) return false;
        if (other.getNumberOfFiles() != null && other.getNumberOfFiles().equals(this.getNumberOfFiles()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getLogUri() == null ^ this.getLogUri() == null) return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getRedshiftMetadata() == null ^ this.getRedshiftMetadata() == null) return false;
        if (other.getRedshiftMetadata() != null && other.getRedshiftMetadata().equals(this.getRedshiftMetadata()) == false) return false; 
        if (other.getRDSMetadata() == null ^ this.getRDSMetadata() == null) return false;
        if (other.getRDSMetadata() != null && other.getRDSMetadata().equals(this.getRDSMetadata()) == false) return false; 
        if (other.getRoleARN() == null ^ this.getRoleARN() == null) return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false) return false; 
        if (other.isComputeStatistics() == null ^ this.isComputeStatistics() == null) return false;
        if (other.isComputeStatistics() != null && other.isComputeStatistics().equals(this.isComputeStatistics()) == false) return false; 
        if (other.getDataSourceSchema() == null ^ this.getDataSourceSchema() == null) return false;
        if (other.getDataSourceSchema() != null && other.getDataSourceSchema().equals(this.getDataSourceSchema()) == false) return false; 
        return true;
    }
    
    @Override
    public GetDataSourceResult clone() {
        try {
            return (GetDataSourceResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    