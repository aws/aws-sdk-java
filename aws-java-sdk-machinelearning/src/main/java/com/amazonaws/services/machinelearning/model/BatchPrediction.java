/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * Represents the output of <a>GetBatchPrediction</a> operation.
 * </p>
 * <p>
 * The content consists of the detailed metadata, the status, and the data file
 * information of a <i>Batch Prediction</i>.
 * </p>
 */
public class BatchPrediction implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> at creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionID</code> in the request.
     * </p>
     */
    private String batchPredictionId;
    /**
     * <p>
     * The ID of the <code>MLModel</code> that generated predictions for the
     * <code>BatchPrediction</code> request.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of
     * observations to predict.
     * </p>
     */
    private String batchPredictionDataSourceId;
    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     */
    private String inputDataLocationS3;
    /**
     * <p>
     * The AWS user account that invoked the <code>BatchPrediction</code>. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     */
    private String createdByIamUser;
    /**
     * <p>
     * The time that the <code>BatchPrediction</code> was created. The time is
     * expressed in epoch time.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
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
     * The status of the <code>BatchPrediction</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to generate predictions for a batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to peform a batch prediction did
     * not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The location of an Amazon S3 bucket or directory to receive the operation
     * results. The following substrings are not allowed in the s3 key portion
     * of the "outputURI" field: ':', '//', '/./', '/../'.
     * </p>
     */
    private String outputUri;
    /**
     * <p>
     * A description of the most recent details about processing the batch
     * prediction request.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> at creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionID</code> in the request.
     * </p>
     * 
     * @param batchPredictionId
     *        The ID assigned to the <code>BatchPrediction</code> at creation.
     *        This value should be identical to the value of the
     *        <code>BatchPredictionID</code> in the request.
     */
    public void setBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
    }

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> at creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionID</code> in the request.
     * </p>
     * 
     * @return The ID assigned to the <code>BatchPrediction</code> at creation.
     *         This value should be identical to the value of the
     *         <code>BatchPredictionID</code> in the request.
     */
    public String getBatchPredictionId() {
        return this.batchPredictionId;
    }

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> at creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionID</code> in the request.
     * </p>
     * 
     * @param batchPredictionId
     *        The ID assigned to the <code>BatchPrediction</code> at creation.
     *        This value should be identical to the value of the
     *        <code>BatchPredictionID</code> in the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchPrediction withBatchPredictionId(String batchPredictionId) {
        setBatchPredictionId(batchPredictionId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that generated predictions for the
     * <code>BatchPrediction</code> request.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> that generated predictions for
     *        the <code>BatchPrediction</code> request.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that generated predictions for the
     * <code>BatchPrediction</code> request.
     * </p>
     * 
     * @return The ID of the <code>MLModel</code> that generated predictions for
     *         the <code>BatchPrediction</code> request.
     */
    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that generated predictions for the
     * <code>BatchPrediction</code> request.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> that generated predictions for
     *        the <code>BatchPrediction</code> request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchPrediction withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of
     * observations to predict.
     * </p>
     * 
     * @param batchPredictionDataSourceId
     *        The ID of the <code>DataSource</code> that points to the group of
     *        observations to predict.
     */
    public void setBatchPredictionDataSourceId(
            String batchPredictionDataSourceId) {
        this.batchPredictionDataSourceId = batchPredictionDataSourceId;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of
     * observations to predict.
     * </p>
     * 
     * @return The ID of the <code>DataSource</code> that points to the group of
     *         observations to predict.
     */
    public String getBatchPredictionDataSourceId() {
        return this.batchPredictionDataSourceId;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of
     * observations to predict.
     * </p>
     * 
     * @param batchPredictionDataSourceId
     *        The ID of the <code>DataSource</code> that points to the group of
     *        observations to predict.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchPrediction withBatchPredictionDataSourceId(
            String batchPredictionDataSourceId) {
        setBatchPredictionDataSourceId(batchPredictionDataSourceId);
        return this;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     * 
     * @param inputDataLocationS3
     *        The location of the data file or directory in Amazon Simple
     *        Storage Service (Amazon S3).
     */
    public void setInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     * 
     * @return The location of the data file or directory in Amazon Simple
     *         Storage Service (Amazon S3).
     */
    public String getInputDataLocationS3() {
        return this.inputDataLocationS3;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     * 
     * @param inputDataLocationS3
     *        The location of the data file or directory in Amazon Simple
     *        Storage Service (Amazon S3).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchPrediction withInputDataLocationS3(String inputDataLocationS3) {
        setInputDataLocationS3(inputDataLocationS3);
        return this;
    }

    /**
     * <p>
     * The AWS user account that invoked the <code>BatchPrediction</code>. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account that invoked the <code>BatchPrediction</code>
     *        . The account type can be either an AWS root account or an AWS
     *        Identity and Access Management (IAM) user account.
     */
    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account that invoked the <code>BatchPrediction</code>. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     * 
     * @return The AWS user account that invoked the
     *         <code>BatchPrediction</code>. The account type can be either an
     *         AWS root account or an AWS Identity and Access Management (IAM)
     *         user account.
     */
    public String getCreatedByIamUser() {
        return this.createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account that invoked the <code>BatchPrediction</code>. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account that invoked the <code>BatchPrediction</code>
     *        . The account type can be either an AWS root account or an AWS
     *        Identity and Access Management (IAM) user account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchPrediction withCreatedByIamUser(String createdByIamUser) {
        setCreatedByIamUser(createdByIamUser);
        return this;
    }

    /**
     * <p>
     * The time that the <code>BatchPrediction</code> was created. The time is
     * expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>BatchPrediction</code> was created. The
     *        time is expressed in epoch time.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the <code>BatchPrediction</code> was created. The time is
     * expressed in epoch time.
     * </p>
     * 
     * @return The time that the <code>BatchPrediction</code> was created. The
     *         time is expressed in epoch time.
     */
    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the <code>BatchPrediction</code> was created. The time is
     * expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>BatchPrediction</code> was created. The
     *        time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchPrediction withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the
     *        <code>BatchPrediction</code>. The time is expressed in epoch time.
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     * </p>
     * 
     * @return The time of the most recent edit to the
     *         <code>BatchPrediction</code>. The time is expressed in epoch
     *         time.
     */
    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the
     *        <code>BatchPrediction</code>. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     *        A user-supplied name or description of the
     *        <code>BatchPrediction</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>BatchPrediction</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the
     *         <code>BatchPrediction</code>.
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
     *        A user-supplied name or description of the
     *        <code>BatchPrediction</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchPrediction withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to generate predictions for a batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to peform a batch prediction did
     * not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the <code>BatchPrediction</code>. This element can
     *        have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML)
     *        submitted a request to generate predictions for a batch of
     *        observations.</li>
     *        <li> <code>INPROGRESS</code> - The process is underway.</li>
     *        <li> <code>FAILED</code> - The request to peform a batch prediction
     *        did not run to completion. It is not usable.</li>
     *        <li> <code>COMPLETED</code> - The batch prediction process
     *        completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>BatchPrediction</code> is
     *        marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to generate predictions for a batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to peform a batch prediction did
     * not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     * 
     * @return The status of the <code>BatchPrediction</code>. This element can
     *         have one of the following values:</p>
     *         <ul>
     *         <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML)
     *         submitted a request to generate predictions for a batch of
     *         observations.</li>
     *         <li> <code>INPROGRESS</code> - The process is underway.</li>
     *         <li> <code>FAILED</code> - The request to peform a batch
     *         prediction did not run to completion. It is not usable.</li>
     *         <li> <code>COMPLETED</code> - The batch prediction process
     *         completed successfully.</li>
     *         <li> <code>DELETED</code> - The <code>BatchPrediction</code> is
     *         marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to generate predictions for a batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to peform a batch prediction did
     * not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the <code>BatchPrediction</code>. This element can
     *        have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML)
     *        submitted a request to generate predictions for a batch of
     *        observations.</li>
     *        <li> <code>INPROGRESS</code> - The process is underway.</li>
     *        <li> <code>FAILED</code> - The request to peform a batch prediction
     *        did not run to completion. It is not usable.</li>
     *        <li> <code>COMPLETED</code> - The batch prediction process
     *        completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>BatchPrediction</code> is
     *        marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */
    public BatchPrediction withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to generate predictions for a batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to peform a batch prediction did
     * not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the <code>BatchPrediction</code>. This element can
     *        have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML)
     *        submitted a request to generate predictions for a batch of
     *        observations.</li>
     *        <li> <code>INPROGRESS</code> - The process is underway.</li>
     *        <li> <code>FAILED</code> - The request to peform a batch prediction
     *        did not run to completion. It is not usable.</li>
     *        <li> <code>COMPLETED</code> - The batch prediction process
     *        completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>BatchPrediction</code> is
     *        marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */
    public void setStatus(EntityStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the <code>BatchPrediction</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to generate predictions for a batch of observations.</li>
     * <li> <code>INPROGRESS</code> - The process is underway.</li>
     * <li> <code>FAILED</code> - The request to peform a batch prediction did
     * not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>BatchPrediction</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the <code>BatchPrediction</code>. This element can
     *        have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML)
     *        submitted a request to generate predictions for a batch of
     *        observations.</li>
     *        <li> <code>INPROGRESS</code> - The process is underway.</li>
     *        <li> <code>FAILED</code> - The request to peform a batch prediction
     *        did not run to completion. It is not usable.</li>
     *        <li> <code>COMPLETED</code> - The batch prediction process
     *        completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>BatchPrediction</code> is
     *        marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */
    public BatchPrediction withStatus(EntityStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The location of an Amazon S3 bucket or directory to receive the operation
     * results. The following substrings are not allowed in the s3 key portion
     * of the "outputURI" field: ':', '//', '/./', '/../'.
     * </p>
     * 
     * @param outputUri
     *        The location of an Amazon S3 bucket or directory to receive the
     *        operation results. The following substrings are not allowed in the
     *        s3 key portion of the "outputURI" field: ':', '//', '/./', '/../'.
     */
    public void setOutputUri(String outputUri) {
        this.outputUri = outputUri;
    }

    /**
     * <p>
     * The location of an Amazon S3 bucket or directory to receive the operation
     * results. The following substrings are not allowed in the s3 key portion
     * of the "outputURI" field: ':', '//', '/./', '/../'.
     * </p>
     * 
     * @return The location of an Amazon S3 bucket or directory to receive the
     *         operation results. The following substrings are not allowed in
     *         the s3 key portion of the "outputURI" field: ':', '//', '/./',
     *         '/../'.
     */
    public String getOutputUri() {
        return this.outputUri;
    }

    /**
     * <p>
     * The location of an Amazon S3 bucket or directory to receive the operation
     * results. The following substrings are not allowed in the s3 key portion
     * of the "outputURI" field: ':', '//', '/./', '/../'.
     * </p>
     * 
     * @param outputUri
     *        The location of an Amazon S3 bucket or directory to receive the
     *        operation results. The following substrings are not allowed in the
     *        s3 key portion of the "outputURI" field: ':', '//', '/./', '/../'.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchPrediction withOutputUri(String outputUri) {
        setOutputUri(outputUri);
        return this;
    }

    /**
     * <p>
     * A description of the most recent details about processing the batch
     * prediction request.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about processing the
     *        batch prediction request.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the most recent details about processing the batch
     * prediction request.
     * </p>
     * 
     * @return A description of the most recent details about processing the
     *         batch prediction request.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the most recent details about processing the batch
     * prediction request.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about processing the
     *        batch prediction request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchPrediction withMessage(String message) {
        setMessage(message);
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
        if (getBatchPredictionId() != null)
            sb.append("BatchPredictionId: " + getBatchPredictionId() + ",");
        if (getMLModelId() != null)
            sb.append("MLModelId: " + getMLModelId() + ",");
        if (getBatchPredictionDataSourceId() != null)
            sb.append("BatchPredictionDataSourceId: "
                    + getBatchPredictionDataSourceId() + ",");
        if (getInputDataLocationS3() != null)
            sb.append("InputDataLocationS3: " + getInputDataLocationS3() + ",");
        if (getCreatedByIamUser() != null)
            sb.append("CreatedByIamUser: " + getCreatedByIamUser() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getOutputUri() != null)
            sb.append("OutputUri: " + getOutputUri() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
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
        if (other.getBatchPredictionId() == null
                ^ this.getBatchPredictionId() == null)
            return false;
        if (other.getBatchPredictionId() != null
                && other.getBatchPredictionId().equals(
                        this.getBatchPredictionId()) == false)
            return false;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null
                && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getBatchPredictionDataSourceId() == null
                ^ this.getBatchPredictionDataSourceId() == null)
            return false;
        if (other.getBatchPredictionDataSourceId() != null
                && other.getBatchPredictionDataSourceId().equals(
                        this.getBatchPredictionDataSourceId()) == false)
            return false;
        if (other.getInputDataLocationS3() == null
                ^ this.getInputDataLocationS3() == null)
            return false;
        if (other.getInputDataLocationS3() != null
                && other.getInputDataLocationS3().equals(
                        this.getInputDataLocationS3()) == false)
            return false;
        if (other.getCreatedByIamUser() == null
                ^ this.getCreatedByIamUser() == null)
            return false;
        if (other.getCreatedByIamUser() != null
                && other.getCreatedByIamUser().equals(
                        this.getCreatedByIamUser()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOutputUri() == null ^ this.getOutputUri() == null)
            return false;
        if (other.getOutputUri() != null
                && other.getOutputUri().equals(this.getOutputUri()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null
                && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBatchPredictionId() == null) ? 0
                        : getBatchPredictionId().hashCode());
        hashCode = prime * hashCode
                + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime
                * hashCode
                + ((getBatchPredictionDataSourceId() == null) ? 0
                        : getBatchPredictionDataSourceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getInputDataLocationS3() == null) ? 0
                        : getInputDataLocationS3().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreatedByIamUser() == null) ? 0 : getCreatedByIamUser()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getOutputUri() == null) ? 0 : getOutputUri().hashCode());
        hashCode = prime * hashCode
                + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchPrediction clone() {
        try {
            return (BatchPrediction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}