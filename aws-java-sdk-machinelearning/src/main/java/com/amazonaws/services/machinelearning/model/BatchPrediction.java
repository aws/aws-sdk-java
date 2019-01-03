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
 * Represents the output of a <code>GetBatchPrediction</code> operation.
 * </p>
 * <p>
 * The content consists of the detailed metadata, the status, and the data file information of a
 * <code>Batch Prediction</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPrediction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> at creation. This value should be identical to the value of
     * the <code>BatchPredictionID</code> in the request.
     * </p>
     */
    private String batchPredictionId;
    /**
     * <p>
     * The ID of the <code>MLModel</code> that generated predictions for the <code>BatchPrediction</code> request.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of observations to predict.
     * </p>
     */
    private String batchPredictionDataSourceId;
    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * </p>
     */
    private String inputDataLocationS3;
    /**
     * <p>
     * The AWS user account that invoked the <code>BatchPrediction</code>. The account type can be either an AWS root
     * account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     */
    private String createdByIamUser;
    /**
     * <p>
     * The time that the <code>BatchPrediction</code> was created. The time is expressed in epoch time.
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
     * A user-supplied name or description of the <code>BatchPrediction</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions for a
     * batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The location of an Amazon S3 bucket or directory to receive the operation results. The following substrings are
     * not allowed in the <code>s3 key</code> portion of the <code>outputURI</code> field: ':', '//', '/./', '/../'.
     * </p>
     */
    private String outputUri;
    /**
     * <p>
     * A description of the most recent details about processing the batch prediction request.
     * </p>
     */
    private String message;

    private Long computeTime;

    private java.util.Date finishedAt;

    private java.util.Date startedAt;

    private Long totalRecordCount;

    private Long invalidRecordCount;

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> at creation. This value should be identical to the value of
     * the <code>BatchPredictionID</code> in the request.
     * </p>
     * 
     * @param batchPredictionId
     *        The ID assigned to the <code>BatchPrediction</code> at creation. This value should be identical to the
     *        value of the <code>BatchPredictionID</code> in the request.
     */

    public void setBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
    }

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> at creation. This value should be identical to the value of
     * the <code>BatchPredictionID</code> in the request.
     * </p>
     * 
     * @return The ID assigned to the <code>BatchPrediction</code> at creation. This value should be identical to the
     *         value of the <code>BatchPredictionID</code> in the request.
     */

    public String getBatchPredictionId() {
        return this.batchPredictionId;
    }

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> at creation. This value should be identical to the value of
     * the <code>BatchPredictionID</code> in the request.
     * </p>
     * 
     * @param batchPredictionId
     *        The ID assigned to the <code>BatchPrediction</code> at creation. This value should be identical to the
     *        value of the <code>BatchPredictionID</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withBatchPredictionId(String batchPredictionId) {
        setBatchPredictionId(batchPredictionId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that generated predictions for the <code>BatchPrediction</code> request.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> that generated predictions for the <code>BatchPrediction</code>
     *        request.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that generated predictions for the <code>BatchPrediction</code> request.
     * </p>
     * 
     * @return The ID of the <code>MLModel</code> that generated predictions for the <code>BatchPrediction</code>
     *         request.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that generated predictions for the <code>BatchPrediction</code> request.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> that generated predictions for the <code>BatchPrediction</code>
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of observations to predict.
     * </p>
     * 
     * @param batchPredictionDataSourceId
     *        The ID of the <code>DataSource</code> that points to the group of observations to predict.
     */

    public void setBatchPredictionDataSourceId(String batchPredictionDataSourceId) {
        this.batchPredictionDataSourceId = batchPredictionDataSourceId;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of observations to predict.
     * </p>
     * 
     * @return The ID of the <code>DataSource</code> that points to the group of observations to predict.
     */

    public String getBatchPredictionDataSourceId() {
        return this.batchPredictionDataSourceId;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of observations to predict.
     * </p>
     * 
     * @param batchPredictionDataSourceId
     *        The ID of the <code>DataSource</code> that points to the group of observations to predict.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withBatchPredictionDataSourceId(String batchPredictionDataSourceId) {
        setBatchPredictionDataSourceId(batchPredictionDataSourceId);
        return this;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * 
     * @param inputDataLocationS3
     *        The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     */

    public void setInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * 
     * @return The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     */

    public String getInputDataLocationS3() {
        return this.inputDataLocationS3;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * 
     * @param inputDataLocationS3
     *        The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withInputDataLocationS3(String inputDataLocationS3) {
        setInputDataLocationS3(inputDataLocationS3);
        return this;
    }

    /**
     * <p>
     * The AWS user account that invoked the <code>BatchPrediction</code>. The account type can be either an AWS root
     * account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account that invoked the <code>BatchPrediction</code>. The account type can be either an AWS
     *        root account or an AWS Identity and Access Management (IAM) user account.
     */

    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account that invoked the <code>BatchPrediction</code>. The account type can be either an AWS root
     * account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @return The AWS user account that invoked the <code>BatchPrediction</code>. The account type can be either an AWS
     *         root account or an AWS Identity and Access Management (IAM) user account.
     */

    public String getCreatedByIamUser() {
        return this.createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account that invoked the <code>BatchPrediction</code>. The account type can be either an AWS root
     * account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account that invoked the <code>BatchPrediction</code>. The account type can be either an AWS
     *        root account or an AWS Identity and Access Management (IAM) user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withCreatedByIamUser(String createdByIamUser) {
        setCreatedByIamUser(createdByIamUser);
        return this;
    }

    /**
     * <p>
     * The time that the <code>BatchPrediction</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>BatchPrediction</code> was created. The time is expressed in epoch time.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the <code>BatchPrediction</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @return The time that the <code>BatchPrediction</code> was created. The time is expressed in epoch time.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the <code>BatchPrediction</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>BatchPrediction</code> was created. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withCreatedAt(java.util.Date createdAt) {
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

    public BatchPrediction withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>BatchPrediction</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name or description of the <code>BatchPrediction</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>BatchPrediction</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the <code>BatchPrediction</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>BatchPrediction</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name or description of the <code>BatchPrediction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions for a
     * batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the <code>BatchPrediction</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions
     *        for a batch of observations.</li>
     *        <li> <code>INPROGRESS</code> - The process is underway.</li>
     *        <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not
     *        usable.</li>
     *        <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions for a
     * batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @return The status of the <code>BatchPrediction</code>. This element can have one of the following values:</p>
     *         <ul>
     *         <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate
     *         predictions for a batch of observations.</li>
     *         <li> <code>INPROGRESS</code> - The process is underway.</li>
     *         <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not
     *         usable.</li>
     *         <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     *         <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions for a
     * batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the <code>BatchPrediction</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions
     *        for a batch of observations.</li>
     *        <li> <code>INPROGRESS</code> - The process is underway.</li>
     *        <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not
     *        usable.</li>
     *        <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatus
     */

    public BatchPrediction withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions for a
     * batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the <code>BatchPrediction</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions
     *        for a batch of observations.</li>
     *        <li> <code>INPROGRESS</code> - The process is underway.</li>
     *        <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not
     *        usable.</li>
     *        <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public void setStatus(EntityStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions for a
     * batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the <code>BatchPrediction</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions
     *        for a batch of observations.</li>
     *        <li> <code>INPROGRESS</code> - The process is underway.</li>
     *        <li> <code>FAILED</code> - The request to perform a batch prediction did not run to completion. It is not
     *        usable.</li>
     *        <li> <code>COMPLETED</code> - The batch prediction process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatus
     */

    public BatchPrediction withStatus(EntityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The location of an Amazon S3 bucket or directory to receive the operation results. The following substrings are
     * not allowed in the <code>s3 key</code> portion of the <code>outputURI</code> field: ':', '//', '/./', '/../'.
     * </p>
     * 
     * @param outputUri
     *        The location of an Amazon S3 bucket or directory to receive the operation results. The following
     *        substrings are not allowed in the <code>s3 key</code> portion of the <code>outputURI</code> field: ':',
     *        '//', '/./', '/../'.
     */

    public void setOutputUri(String outputUri) {
        this.outputUri = outputUri;
    }

    /**
     * <p>
     * The location of an Amazon S3 bucket or directory to receive the operation results. The following substrings are
     * not allowed in the <code>s3 key</code> portion of the <code>outputURI</code> field: ':', '//', '/./', '/../'.
     * </p>
     * 
     * @return The location of an Amazon S3 bucket or directory to receive the operation results. The following
     *         substrings are not allowed in the <code>s3 key</code> portion of the <code>outputURI</code> field: ':',
     *         '//', '/./', '/../'.
     */

    public String getOutputUri() {
        return this.outputUri;
    }

    /**
     * <p>
     * The location of an Amazon S3 bucket or directory to receive the operation results. The following substrings are
     * not allowed in the <code>s3 key</code> portion of the <code>outputURI</code> field: ':', '//', '/./', '/../'.
     * </p>
     * 
     * @param outputUri
     *        The location of an Amazon S3 bucket or directory to receive the operation results. The following
     *        substrings are not allowed in the <code>s3 key</code> portion of the <code>outputURI</code> field: ':',
     *        '//', '/./', '/../'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withOutputUri(String outputUri) {
        setOutputUri(outputUri);
        return this;
    }

    /**
     * <p>
     * A description of the most recent details about processing the batch prediction request.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about processing the batch prediction request.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the most recent details about processing the batch prediction request.
     * </p>
     * 
     * @return A description of the most recent details about processing the batch prediction request.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the most recent details about processing the batch prediction request.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about processing the batch prediction request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withMessage(String message) {
        setMessage(message);
        return this;
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

    public BatchPrediction withComputeTime(Long computeTime) {
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

    public BatchPrediction withFinishedAt(java.util.Date finishedAt) {
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

    public BatchPrediction withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * @param totalRecordCount
     */

    public void setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    /**
     * @return
     */

    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    /**
     * @param totalRecordCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withTotalRecordCount(Long totalRecordCount) {
        setTotalRecordCount(totalRecordCount);
        return this;
    }

    /**
     * @param invalidRecordCount
     */

    public void setInvalidRecordCount(Long invalidRecordCount) {
        this.invalidRecordCount = invalidRecordCount;
    }

    /**
     * @return
     */

    public Long getInvalidRecordCount() {
        return this.invalidRecordCount;
    }

    /**
     * @param invalidRecordCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPrediction withInvalidRecordCount(Long invalidRecordCount) {
        setInvalidRecordCount(invalidRecordCount);
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
        if (getBatchPredictionId() != null)
            sb.append("BatchPredictionId: ").append(getBatchPredictionId()).append(",");
        if (getMLModelId() != null)
            sb.append("MLModelId: ").append(getMLModelId()).append(",");
        if (getBatchPredictionDataSourceId() != null)
            sb.append("BatchPredictionDataSourceId: ").append(getBatchPredictionDataSourceId()).append(",");
        if (getInputDataLocationS3() != null)
            sb.append("InputDataLocationS3: ").append(getInputDataLocationS3()).append(",");
        if (getCreatedByIamUser() != null)
            sb.append("CreatedByIamUser: ").append(getCreatedByIamUser()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOutputUri() != null)
            sb.append("OutputUri: ").append(getOutputUri()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getComputeTime() != null)
            sb.append("ComputeTime: ").append(getComputeTime()).append(",");
        if (getFinishedAt() != null)
            sb.append("FinishedAt: ").append(getFinishedAt()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getTotalRecordCount() != null)
            sb.append("TotalRecordCount: ").append(getTotalRecordCount()).append(",");
        if (getInvalidRecordCount() != null)
            sb.append("InvalidRecordCount: ").append(getInvalidRecordCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPrediction == false)
            return false;
        BatchPrediction other = (BatchPrediction) obj;
        if (other.getBatchPredictionId() == null ^ this.getBatchPredictionId() == null)
            return false;
        if (other.getBatchPredictionId() != null && other.getBatchPredictionId().equals(this.getBatchPredictionId()) == false)
            return false;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getBatchPredictionDataSourceId() == null ^ this.getBatchPredictionDataSourceId() == null)
            return false;
        if (other.getBatchPredictionDataSourceId() != null && other.getBatchPredictionDataSourceId().equals(this.getBatchPredictionDataSourceId()) == false)
            return false;
        if (other.getInputDataLocationS3() == null ^ this.getInputDataLocationS3() == null)
            return false;
        if (other.getInputDataLocationS3() != null && other.getInputDataLocationS3().equals(this.getInputDataLocationS3()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOutputUri() == null ^ this.getOutputUri() == null)
            return false;
        if (other.getOutputUri() != null && other.getOutputUri().equals(this.getOutputUri()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
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
        if (other.getTotalRecordCount() == null ^ this.getTotalRecordCount() == null)
            return false;
        if (other.getTotalRecordCount() != null && other.getTotalRecordCount().equals(this.getTotalRecordCount()) == false)
            return false;
        if (other.getInvalidRecordCount() == null ^ this.getInvalidRecordCount() == null)
            return false;
        if (other.getInvalidRecordCount() != null && other.getInvalidRecordCount().equals(this.getInvalidRecordCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchPredictionId() == null) ? 0 : getBatchPredictionId().hashCode());
        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime * hashCode + ((getBatchPredictionDataSourceId() == null) ? 0 : getBatchPredictionDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getInputDataLocationS3() == null) ? 0 : getInputDataLocationS3().hashCode());
        hashCode = prime * hashCode + ((getCreatedByIamUser() == null) ? 0 : getCreatedByIamUser().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOutputUri() == null) ? 0 : getOutputUri().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getComputeTime() == null) ? 0 : getComputeTime().hashCode());
        hashCode = prime * hashCode + ((getFinishedAt() == null) ? 0 : getFinishedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getTotalRecordCount() == null) ? 0 : getTotalRecordCount().hashCode());
        hashCode = prime * hashCode + ((getInvalidRecordCount() == null) ? 0 : getInvalidRecordCount().hashCode());
        return hashCode;
    }

    @Override
    public BatchPrediction clone() {
        try {
            return (BatchPrediction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.machinelearning.model.transform.BatchPredictionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
