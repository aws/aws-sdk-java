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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>GetDataSource</code> operation and describes a <code>DataSource</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> at creation. This value should be identical to the value of the
     * <code>DataSourceId</code> in the request.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * </p>
     */
    private String dataLocationS3;
    /**
     * <p>
     * A JSON string that represents the splitting and rearrangement requirement used when this <code>DataSource</code>
     * was created.
     * </p>
     */
    private String dataRearrangement;
    /**
     * <p>
     * The AWS user account from which the <code>DataSource</code> was created. The account type can be either an AWS
     * root account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     */
    private String createdByIamUser;
    /**
     * <p>
     * The time that the <code>DataSource</code> was created. The time is expressed in epoch time.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time of the most recent edit to the <code>DataSource</code>. The time is expressed in epoch time.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The total size of observations in the data files.
     * </p>
     */
    private Long dataSizeInBytes;
    /**
     * <p>
     * The number of data files referenced by the <code>DataSource</code>.
     * </p>
     */
    private Long numberOfFiles;
    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the <code>DataSource</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     * <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     * <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A link to the file containing logs of <code>CreateDataSourceFrom*</code> operations.
     * </p>
     */
    private String logUri;
    /**
     * <p>
     * The user-supplied description of the most recent details about creating the <code>DataSource</code>.
     * </p>
     */
    private String message;

    private RedshiftMetadata redshiftMetadata;

    private RDSMetadata rDSMetadata;

    private String roleARN;
    /**
     * <p>
     * The parameter is <code>true</code> if statistics need to be generated from the observation data.
     * </p>
     */
    private Boolean computeStatistics;
    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the
     * <code>DataSource</code>, normalized and scaled on computation resources. <code>ComputeTime</code> is only
     * available if the <code>DataSource</code> is in the <code>COMPLETED</code> state and the
     * <code>ComputeStatistics</code> is set to true.
     * </p>
     */
    private Long computeTime;
    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>COMPLETED</code> or
     * <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>DataSource</code> is in the
     * <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     */
    private java.util.Date finishedAt;
    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>INPROGRESS</code>.
     * <code>StartedAt</code> isn't available if the <code>DataSource</code> is in the <code>PENDING</code> state.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The schema used by all of the data files of this <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     */
    private String dataSourceSchema;

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> at creation. This value should be identical to the value of the
     * <code>DataSourceId</code> in the request.
     * </p>
     * 
     * @param dataSourceId
     *        The ID assigned to the <code>DataSource</code> at creation. This value should be identical to the value of
     *        the <code>DataSourceId</code> in the request.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> at creation. This value should be identical to the value of the
     * <code>DataSourceId</code> in the request.
     * </p>
     * 
     * @return The ID assigned to the <code>DataSource</code> at creation. This value should be identical to the value
     *         of the <code>DataSourceId</code> in the request.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> at creation. This value should be identical to the value of the
     * <code>DataSourceId</code> in the request.
     * </p>
     * 
     * @param dataSourceId
     *        The ID assigned to the <code>DataSource</code> at creation. This value should be identical to the value of
     *        the <code>DataSourceId</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * 
     * @param dataLocationS3
     *        The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     */

    public void setDataLocationS3(String dataLocationS3) {
        this.dataLocationS3 = dataLocationS3;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * 
     * @return The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     */

    public String getDataLocationS3() {
        return this.dataLocationS3;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * 
     * @param dataLocationS3
     *        The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDataLocationS3(String dataLocationS3) {
        setDataLocationS3(dataLocationS3);
        return this;
    }

    /**
     * <p>
     * A JSON string that represents the splitting and rearrangement requirement used when this <code>DataSource</code>
     * was created.
     * </p>
     * 
     * @param dataRearrangement
     *        A JSON string that represents the splitting and rearrangement requirement used when this
     *        <code>DataSource</code> was created.
     */

    public void setDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
    }

    /**
     * <p>
     * A JSON string that represents the splitting and rearrangement requirement used when this <code>DataSource</code>
     * was created.
     * </p>
     * 
     * @return A JSON string that represents the splitting and rearrangement requirement used when this
     *         <code>DataSource</code> was created.
     */

    public String getDataRearrangement() {
        return this.dataRearrangement;
    }

    /**
     * <p>
     * A JSON string that represents the splitting and rearrangement requirement used when this <code>DataSource</code>
     * was created.
     * </p>
     * 
     * @param dataRearrangement
     *        A JSON string that represents the splitting and rearrangement requirement used when this
     *        <code>DataSource</code> was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDataRearrangement(String dataRearrangement) {
        setDataRearrangement(dataRearrangement);
        return this;
    }

    /**
     * <p>
     * The AWS user account from which the <code>DataSource</code> was created. The account type can be either an AWS
     * root account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account from which the <code>DataSource</code> was created. The account type can be either an
     *        AWS root account or an AWS Identity and Access Management (IAM) user account.
     */

    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account from which the <code>DataSource</code> was created. The account type can be either an AWS
     * root account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @return The AWS user account from which the <code>DataSource</code> was created. The account type can be either
     *         an AWS root account or an AWS Identity and Access Management (IAM) user account.
     */

    public String getCreatedByIamUser() {
        return this.createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account from which the <code>DataSource</code> was created. The account type can be either an AWS
     * root account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account from which the <code>DataSource</code> was created. The account type can be either an
     *        AWS root account or an AWS Identity and Access Management (IAM) user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withCreatedByIamUser(String createdByIamUser) {
        setCreatedByIamUser(createdByIamUser);
        return this;
    }

    /**
     * <p>
     * The time that the <code>DataSource</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>DataSource</code> was created. The time is expressed in epoch time.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the <code>DataSource</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @return The time that the <code>DataSource</code> was created. The time is expressed in epoch time.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the <code>DataSource</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>DataSource</code> was created. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>DataSource</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the <code>DataSource</code>. The time is expressed in epoch time.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>DataSource</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @return The time of the most recent edit to the <code>DataSource</code>. The time is expressed in epoch time.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>DataSource</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the <code>DataSource</code>. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The total size of observations in the data files.
     * </p>
     * 
     * @param dataSizeInBytes
     *        The total size of observations in the data files.
     */

    public void setDataSizeInBytes(Long dataSizeInBytes) {
        this.dataSizeInBytes = dataSizeInBytes;
    }

    /**
     * <p>
     * The total size of observations in the data files.
     * </p>
     * 
     * @return The total size of observations in the data files.
     */

    public Long getDataSizeInBytes() {
        return this.dataSizeInBytes;
    }

    /**
     * <p>
     * The total size of observations in the data files.
     * </p>
     * 
     * @param dataSizeInBytes
     *        The total size of observations in the data files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDataSizeInBytes(Long dataSizeInBytes) {
        setDataSizeInBytes(dataSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The number of data files referenced by the <code>DataSource</code>.
     * </p>
     * 
     * @param numberOfFiles
     *        The number of data files referenced by the <code>DataSource</code>.
     */

    public void setNumberOfFiles(Long numberOfFiles) {
        this.numberOfFiles = numberOfFiles;
    }

    /**
     * <p>
     * The number of data files referenced by the <code>DataSource</code>.
     * </p>
     * 
     * @return The number of data files referenced by the <code>DataSource</code>.
     */

    public Long getNumberOfFiles() {
        return this.numberOfFiles;
    }

    /**
     * <p>
     * The number of data files referenced by the <code>DataSource</code>.
     * </p>
     * 
     * @param numberOfFiles
     *        The number of data files referenced by the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withNumberOfFiles(Long numberOfFiles) {
        setNumberOfFiles(numberOfFiles);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name or description of the <code>DataSource</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the <code>DataSource</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name or description of the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the <code>DataSource</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     * <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     * <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>DataSource</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     *        <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     *        <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It is
     *        not usable.</li>
     *        <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the <code>DataSource</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     * <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     * <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @return The current status of the <code>DataSource</code>. This element can have one of the following values:</p>
     *         <ul>
     *         <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     *         <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     *         <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It
     *         is not usable.</li>
     *         <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     *         <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the <code>DataSource</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     * <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     * <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>DataSource</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     *        <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     *        <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It is
     *        not usable.</li>
     *        <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatus
     */

    public GetDataSourceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the <code>DataSource</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     * <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     * <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>DataSource</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     *        <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     *        <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It is
     *        not usable.</li>
     *        <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public void setStatus(EntityStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current status of the <code>DataSource</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     * <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     * <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>DataSource</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon ML submitted a request to create a <code>DataSource</code>.</li>
     *        <li> <code>INPROGRESS</code> - The creation process is underway.</li>
     *        <li> <code>FAILED</code> - The request to create a <code>DataSource</code> did not run to completion. It is
     *        not usable.</li>
     *        <li> <code>COMPLETED</code> - The creation process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatus
     */

    public GetDataSourceResult withStatus(EntityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A link to the file containing logs of <code>CreateDataSourceFrom*</code> operations.
     * </p>
     * 
     * @param logUri
     *        A link to the file containing logs of <code>CreateDataSourceFrom*</code> operations.
     */

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * A link to the file containing logs of <code>CreateDataSourceFrom*</code> operations.
     * </p>
     * 
     * @return A link to the file containing logs of <code>CreateDataSourceFrom*</code> operations.
     */

    public String getLogUri() {
        return this.logUri;
    }

    /**
     * <p>
     * A link to the file containing logs of <code>CreateDataSourceFrom*</code> operations.
     * </p>
     * 
     * @param logUri
     *        A link to the file containing logs of <code>CreateDataSourceFrom*</code> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withLogUri(String logUri) {
        setLogUri(logUri);
        return this;
    }

    /**
     * <p>
     * The user-supplied description of the most recent details about creating the <code>DataSource</code>.
     * </p>
     * 
     * @param message
     *        The user-supplied description of the most recent details about creating the <code>DataSource</code>.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The user-supplied description of the most recent details about creating the <code>DataSource</code>.
     * </p>
     * 
     * @return The user-supplied description of the most recent details about creating the <code>DataSource</code>.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The user-supplied description of the most recent details about creating the <code>DataSource</code>.
     * </p>
     * 
     * @param message
     *        The user-supplied description of the most recent details about creating the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * @param redshiftMetadata
     */

    public void setRedshiftMetadata(RedshiftMetadata redshiftMetadata) {
        this.redshiftMetadata = redshiftMetadata;
    }

    /**
     * @return
     */

    public RedshiftMetadata getRedshiftMetadata() {
        return this.redshiftMetadata;
    }

    /**
     * @param redshiftMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withRedshiftMetadata(RedshiftMetadata redshiftMetadata) {
        setRedshiftMetadata(redshiftMetadata);
        return this;
    }

    /**
     * @param rDSMetadata
     */

    public void setRDSMetadata(RDSMetadata rDSMetadata) {
        this.rDSMetadata = rDSMetadata;
    }

    /**
     * @return
     */

    public RDSMetadata getRDSMetadata() {
        return this.rDSMetadata;
    }

    /**
     * @param rDSMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withRDSMetadata(RDSMetadata rDSMetadata) {
        setRDSMetadata(rDSMetadata);
        return this;
    }

    /**
     * @param roleARN
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * @return
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * @param roleARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The parameter is <code>true</code> if statistics need to be generated from the observation data.
     * </p>
     * 
     * @param computeStatistics
     *        The parameter is <code>true</code> if statistics need to be generated from the observation data.
     */

    public void setComputeStatistics(Boolean computeStatistics) {
        this.computeStatistics = computeStatistics;
    }

    /**
     * <p>
     * The parameter is <code>true</code> if statistics need to be generated from the observation data.
     * </p>
     * 
     * @return The parameter is <code>true</code> if statistics need to be generated from the observation data.
     */

    public Boolean getComputeStatistics() {
        return this.computeStatistics;
    }

    /**
     * <p>
     * The parameter is <code>true</code> if statistics need to be generated from the observation data.
     * </p>
     * 
     * @param computeStatistics
     *        The parameter is <code>true</code> if statistics need to be generated from the observation data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withComputeStatistics(Boolean computeStatistics) {
        setComputeStatistics(computeStatistics);
        return this;
    }

    /**
     * <p>
     * The parameter is <code>true</code> if statistics need to be generated from the observation data.
     * </p>
     * 
     * @return The parameter is <code>true</code> if statistics need to be generated from the observation data.
     */

    public Boolean isComputeStatistics() {
        return this.computeStatistics;
    }

    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the
     * <code>DataSource</code>, normalized and scaled on computation resources. <code>ComputeTime</code> is only
     * available if the <code>DataSource</code> is in the <code>COMPLETED</code> state and the
     * <code>ComputeStatistics</code> is set to true.
     * </p>
     * 
     * @param computeTime
     *        The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the
     *        <code>DataSource</code>, normalized and scaled on computation resources. <code>ComputeTime</code> is only
     *        available if the <code>DataSource</code> is in the <code>COMPLETED</code> state and the
     *        <code>ComputeStatistics</code> is set to true.
     */

    public void setComputeTime(Long computeTime) {
        this.computeTime = computeTime;
    }

    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the
     * <code>DataSource</code>, normalized and scaled on computation resources. <code>ComputeTime</code> is only
     * available if the <code>DataSource</code> is in the <code>COMPLETED</code> state and the
     * <code>ComputeStatistics</code> is set to true.
     * </p>
     * 
     * @return The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the
     *         <code>DataSource</code>, normalized and scaled on computation resources. <code>ComputeTime</code> is only
     *         available if the <code>DataSource</code> is in the <code>COMPLETED</code> state and the
     *         <code>ComputeStatistics</code> is set to true.
     */

    public Long getComputeTime() {
        return this.computeTime;
    }

    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the
     * <code>DataSource</code>, normalized and scaled on computation resources. <code>ComputeTime</code> is only
     * available if the <code>DataSource</code> is in the <code>COMPLETED</code> state and the
     * <code>ComputeStatistics</code> is set to true.
     * </p>
     * 
     * @param computeTime
     *        The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the
     *        <code>DataSource</code>, normalized and scaled on computation resources. <code>ComputeTime</code> is only
     *        available if the <code>DataSource</code> is in the <code>COMPLETED</code> state and the
     *        <code>ComputeStatistics</code> is set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withComputeTime(Long computeTime) {
        setComputeTime(computeTime);
        return this;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>COMPLETED</code> or
     * <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>DataSource</code> is in the
     * <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     * 
     * @param finishedAt
     *        The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>COMPLETED</code>
     *        or <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>DataSource</code> is in
     *        the <code>COMPLETED</code> or <code>FAILED</code> state.
     */

    public void setFinishedAt(java.util.Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>COMPLETED</code> or
     * <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>DataSource</code> is in the
     * <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     * 
     * @return The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>COMPLETED</code>
     *         or <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>DataSource</code> is in
     *         the <code>COMPLETED</code> or <code>FAILED</code> state.
     */

    public java.util.Date getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>COMPLETED</code> or
     * <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>DataSource</code> is in the
     * <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     * 
     * @param finishedAt
     *        The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>COMPLETED</code>
     *        or <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>DataSource</code> is in
     *        the <code>COMPLETED</code> or <code>FAILED</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withFinishedAt(java.util.Date finishedAt) {
        setFinishedAt(finishedAt);
        return this;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>INPROGRESS</code>.
     * <code>StartedAt</code> isn't available if the <code>DataSource</code> is in the <code>PENDING</code> state.
     * </p>
     * 
     * @param startedAt
     *        The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>INPROGRESS</code>.
     *        <code>StartedAt</code> isn't available if the <code>DataSource</code> is in the <code>PENDING</code>
     *        state.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>INPROGRESS</code>.
     * <code>StartedAt</code> isn't available if the <code>DataSource</code> is in the <code>PENDING</code> state.
     * </p>
     * 
     * @return The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>INPROGRESS</code>
     *         . <code>StartedAt</code> isn't available if the <code>DataSource</code> is in the <code>PENDING</code>
     *         state.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>INPROGRESS</code>.
     * <code>StartedAt</code> isn't available if the <code>DataSource</code> is in the <code>PENDING</code> state.
     * </p>
     * 
     * @param startedAt
     *        The epoch time when Amazon Machine Learning marked the <code>DataSource</code> as <code>INPROGRESS</code>.
     *        <code>StartedAt</code> isn't available if the <code>DataSource</code> is in the <code>PENDING</code>
     *        state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The schema used by all of the data files of this <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * 
     * @param dataSourceSchema
     *        The schema used by all of the data files of this <code>DataSource</code>.</p> <note><title>Note</title>
     *        <p>
     *        This parameter is provided as part of the verbose format.
     *        </p>
     */

    public void setDataSourceSchema(String dataSourceSchema) {
        this.dataSourceSchema = dataSourceSchema;
    }

    /**
     * <p>
     * The schema used by all of the data files of this <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * 
     * @return The schema used by all of the data files of this <code>DataSource</code>.</p> <note><title>Note</title>
     *         <p>
     *         This parameter is provided as part of the verbose format.
     *         </p>
     */

    public String getDataSourceSchema() {
        return this.dataSourceSchema;
    }

    /**
     * <p>
     * The schema used by all of the data files of this <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * 
     * @param dataSourceSchema
     *        The schema used by all of the data files of this <code>DataSource</code>.</p> <note><title>Note</title>
     *        <p>
     *        This parameter is provided as part of the verbose format.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDataSourceSchema(String dataSourceSchema) {
        setDataSourceSchema(dataSourceSchema);
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getDataLocationS3() != null)
            sb.append("DataLocationS3: ").append(getDataLocationS3()).append(",");
        if (getDataRearrangement() != null)
            sb.append("DataRearrangement: ").append(getDataRearrangement()).append(",");
        if (getCreatedByIamUser() != null)
            sb.append("CreatedByIamUser: ").append(getCreatedByIamUser()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getDataSizeInBytes() != null)
            sb.append("DataSizeInBytes: ").append(getDataSizeInBytes()).append(",");
        if (getNumberOfFiles() != null)
            sb.append("NumberOfFiles: ").append(getNumberOfFiles()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLogUri() != null)
            sb.append("LogUri: ").append(getLogUri()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getRedshiftMetadata() != null)
            sb.append("RedshiftMetadata: ").append(getRedshiftMetadata()).append(",");
        if (getRDSMetadata() != null)
            sb.append("RDSMetadata: ").append(getRDSMetadata()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getComputeStatistics() != null)
            sb.append("ComputeStatistics: ").append(getComputeStatistics()).append(",");
        if (getComputeTime() != null)
            sb.append("ComputeTime: ").append(getComputeTime()).append(",");
        if (getFinishedAt() != null)
            sb.append("FinishedAt: ").append(getFinishedAt()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getDataSourceSchema() != null)
            sb.append("DataSourceSchema: ").append(getDataSourceSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataSourceResult == false)
            return false;
        GetDataSourceResult other = (GetDataSourceResult) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDataLocationS3() == null ^ this.getDataLocationS3() == null)
            return false;
        if (other.getDataLocationS3() != null && other.getDataLocationS3().equals(this.getDataLocationS3()) == false)
            return false;
        if (other.getDataRearrangement() == null ^ this.getDataRearrangement() == null)
            return false;
        if (other.getDataRearrangement() != null && other.getDataRearrangement().equals(this.getDataRearrangement()) == false)
            return false;
        if (other.getCreatedByIamUser() == null ^ this.getCreatedByIamUser() == null)
            return false;
        if (other.getCreatedByIamUser() != null && other.getCreatedByIamUser().equals(this.getCreatedByIamUser()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getDataSizeInBytes() == null ^ this.getDataSizeInBytes() == null)
            return false;
        if (other.getDataSizeInBytes() != null && other.getDataSizeInBytes().equals(this.getDataSizeInBytes()) == false)
            return false;
        if (other.getNumberOfFiles() == null ^ this.getNumberOfFiles() == null)
            return false;
        if (other.getNumberOfFiles() != null && other.getNumberOfFiles().equals(this.getNumberOfFiles()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getRedshiftMetadata() == null ^ this.getRedshiftMetadata() == null)
            return false;
        if (other.getRedshiftMetadata() != null && other.getRedshiftMetadata().equals(this.getRedshiftMetadata()) == false)
            return false;
        if (other.getRDSMetadata() == null ^ this.getRDSMetadata() == null)
            return false;
        if (other.getRDSMetadata() != null && other.getRDSMetadata().equals(this.getRDSMetadata()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getComputeStatistics() == null ^ this.getComputeStatistics() == null)
            return false;
        if (other.getComputeStatistics() != null && other.getComputeStatistics().equals(this.getComputeStatistics()) == false)
            return false;
        if (other.getComputeTime() == null ^ this.getComputeTime() == null)
            return false;
        if (other.getComputeTime() != null && other.getComputeTime().equals(this.getComputeTime()) == false)
            return false;
        if (other.getFinishedAt() == null ^ this.getFinishedAt() == null)
            return false;
        if (other.getFinishedAt() != null && other.getFinishedAt().equals(this.getFinishedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getDataSourceSchema() == null ^ this.getDataSourceSchema() == null)
            return false;
        if (other.getDataSourceSchema() != null && other.getDataSourceSchema().equals(this.getDataSourceSchema()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getComputeStatistics() == null) ? 0 : getComputeStatistics().hashCode());
        hashCode = prime * hashCode + ((getComputeTime() == null) ? 0 : getComputeTime().hashCode());
        hashCode = prime * hashCode + ((getFinishedAt() == null) ? 0 : getFinishedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getDataSourceSchema() == null) ? 0 : getDataSourceSchema().hashCode());
        return hashCode;
    }

    @Override
    public GetDataSourceResult clone() {
        try {
            return (GetDataSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
