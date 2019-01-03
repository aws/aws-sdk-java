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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of the <code>GetDataSource</code> operation.
 * </p>
 * <p>
 * The content consists of the detailed metadata and data file information and the current status of the
 * <code>DataSource</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID that is assigned to the <code>DataSource</code> during creation.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a
     * <code>DataSource</code>.
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
     * The time of the most recent edit to the <code>BatchPrediction</code>. The time is expressed in epoch time.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The total number of observations contained in the data files that the <code>DataSource</code> references.
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
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A description of the most recent details about creating the <code>DataSource</code>.
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

    private Long computeTime;

    private java.util.Date finishedAt;

    private java.util.Date startedAt;

    /**
     * <p>
     * The ID that is assigned to the <code>DataSource</code> during creation.
     * </p>
     * 
     * @param dataSourceId
     *        The ID that is assigned to the <code>DataSource</code> during creation.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID that is assigned to the <code>DataSource</code> during creation.
     * </p>
     * 
     * @return The ID that is assigned to the <code>DataSource</code> during creation.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The ID that is assigned to the <code>DataSource</code> during creation.
     * </p>
     * 
     * @param dataSourceId
     *        The ID that is assigned to the <code>DataSource</code> during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a
     * <code>DataSource</code>.
     * </p>
     * 
     * @param dataLocationS3
     *        The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a
     *        <code>DataSource</code>.
     */

    public void setDataLocationS3(String dataLocationS3) {
        this.dataLocationS3 = dataLocationS3;
    }

    /**
     * <p>
     * The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a
     * <code>DataSource</code>.
     * </p>
     * 
     * @return The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a
     *         <code>DataSource</code>.
     */

    public String getDataLocationS3() {
        return this.dataLocationS3;
    }

    /**
     * <p>
     * The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a
     * <code>DataSource</code>.
     * </p>
     * 
     * @param dataLocationS3
     *        The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a
     *        <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDataLocationS3(String dataLocationS3) {
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

    public DataSource withDataRearrangement(String dataRearrangement) {
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

    public DataSource withCreatedByIamUser(String createdByIamUser) {
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

    public DataSource withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the <code>BatchPrediction</code>. The time is expressed in epoch time.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @return The time of the most recent edit to the <code>BatchPrediction</code>. The time is expressed in epoch
     *         time.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the <code>BatchPrediction</code>. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The total number of observations contained in the data files that the <code>DataSource</code> references.
     * </p>
     * 
     * @param dataSizeInBytes
     *        The total number of observations contained in the data files that the <code>DataSource</code> references.
     */

    public void setDataSizeInBytes(Long dataSizeInBytes) {
        this.dataSizeInBytes = dataSizeInBytes;
    }

    /**
     * <p>
     * The total number of observations contained in the data files that the <code>DataSource</code> references.
     * </p>
     * 
     * @return The total number of observations contained in the data files that the <code>DataSource</code> references.
     */

    public Long getDataSizeInBytes() {
        return this.dataSizeInBytes;
    }

    /**
     * <p>
     * The total number of observations contained in the data files that the <code>DataSource</code> references.
     * </p>
     * 
     * @param dataSizeInBytes
     *        The total number of observations contained in the data files that the <code>DataSource</code> references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDataSizeInBytes(Long dataSizeInBytes) {
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

    public DataSource withNumberOfFiles(Long numberOfFiles) {
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

    public DataSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the <code>DataSource</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>DataSource</code>. This element can have one of the following values: </p>
     *        <ul>
     *        <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>.
     *        </li>
     *        <li>INPROGRESS - The creation process is underway.</li>
     *        <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.</li>
     *        <li>COMPLETED - The creation process completed successfully.</li>
     *        <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
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
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @return The current status of the <code>DataSource</code>. This element can have one of the following values:
     *         </p>
     *         <ul>
     *         <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>
     *         .</li>
     *         <li>INPROGRESS - The creation process is underway.</li>
     *         <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.
     *         </li>
     *         <li>COMPLETED - The creation process completed successfully.</li>
     *         <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
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
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>DataSource</code>. This element can have one of the following values: </p>
     *        <ul>
     *        <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>.
     *        </li>
     *        <li>INPROGRESS - The creation process is underway.</li>
     *        <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.</li>
     *        <li>COMPLETED - The creation process completed successfully.</li>
     *        <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatus
     */

    public DataSource withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the <code>DataSource</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>DataSource</code>. This element can have one of the following values: </p>
     *        <ul>
     *        <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>.
     *        </li>
     *        <li>INPROGRESS - The creation process is underway.</li>
     *        <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.</li>
     *        <li>COMPLETED - The creation process completed successfully.</li>
     *        <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
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
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>DataSource</code>. This element can have one of the following values: </p>
     *        <ul>
     *        <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a <code>DataSource</code>.
     *        </li>
     *        <li>INPROGRESS - The creation process is underway.</li>
     *        <li>FAILED - The request to create a <code>DataSource</code> did not run to completion. It is not usable.</li>
     *        <li>COMPLETED - The creation process completed successfully.</li>
     *        <li>DELETED - The <code>DataSource</code> is marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatus
     */

    public DataSource withStatus(EntityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the most recent details about creating the <code>DataSource</code>.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about creating the <code>DataSource</code>.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the most recent details about creating the <code>DataSource</code>.
     * </p>
     * 
     * @return A description of the most recent details about creating the <code>DataSource</code>.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the most recent details about creating the <code>DataSource</code>.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about creating the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withMessage(String message) {
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

    public DataSource withRedshiftMetadata(RedshiftMetadata redshiftMetadata) {
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

    public DataSource withRDSMetadata(RDSMetadata rDSMetadata) {
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

    public DataSource withRoleARN(String roleARN) {
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

    public DataSource withComputeStatistics(Boolean computeStatistics) {
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
     * @param computeTime
     */

    public void setComputeTime(Long computeTime) {
        this.computeTime = computeTime;
    }

    /**
     * @return
     */

    public Long getComputeTime() {
        return this.computeTime;
    }

    /**
     * @param computeTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withComputeTime(Long computeTime) {
        setComputeTime(computeTime);
        return this;
    }

    /**
     * @param finishedAt
     */

    public void setFinishedAt(java.util.Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * @return
     */

    public java.util.Date getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @param finishedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withFinishedAt(java.util.Date finishedAt) {
        setFinishedAt(finishedAt);
        return this;
    }

    /**
     * @param startedAt
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * @return
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * @param startedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
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
            sb.append("StartedAt: ").append(getStartedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSource == false)
            return false;
        DataSource other = (DataSource) obj;
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
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getRedshiftMetadata() == null) ? 0 : getRedshiftMetadata().hashCode());
        hashCode = prime * hashCode + ((getRDSMetadata() == null) ? 0 : getRDSMetadata().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getComputeStatistics() == null) ? 0 : getComputeStatistics().hashCode());
        hashCode = prime * hashCode + ((getComputeTime() == null) ? 0 : getComputeTime().hashCode());
        hashCode = prime * hashCode + ((getFinishedAt() == null) ? 0 : getFinishedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        return hashCode;
    }

    @Override
    public DataSource clone() {
        try {
            return (DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.machinelearning.model.transform.DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
