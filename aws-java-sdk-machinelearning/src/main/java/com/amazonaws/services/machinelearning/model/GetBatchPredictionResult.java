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
 * Represents the output of a GetBatchPrediction operation and describes
 * a <code>BatchPrediction</code> .
 * </p>
 */
public class GetBatchPredictionResult implements Serializable, Cloneable {

    /**
     * An ID assigned to the <code>BatchPrediction</code> at creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionID</code> in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String batchPredictionId;

    /**
     * The ID of the <code>MLModel</code> that generated predictions for the
     * <code>BatchPrediction</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * The ID of the <code>DataSource</code> that was used to create the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String batchPredictionDataSourceId;

    /**
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String inputDataLocationS3;

    /**
     * The AWS user account that invoked the <code>BatchPrediction</code>.
     * The account type can be either an AWS root account or an AWS Identity
     * and Access Management (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     */
    private String createdByIamUser;

    /**
     * The time when the <code>BatchPrediction</code> was created. The time
     * is expressed in epoch time.
     */
    private java.util.Date createdAt;

    /**
     * The time of the most recent edit to <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     */
    private java.util.Date lastUpdatedAt;

    /**
     * A user-supplied name or description of the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String name;

    /**
     * The status of the <code>BatchPrediction</code>, which can be one of
     * the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to generate batch
     * predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     * are in progress.</li> <li><code>FAILED</code> - The request to perform
     * a batch prediction did not run to completion. It is not usable.</li>
     * <li><code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li> <li><code>DELETED</code> - The
     * <code>BatchPrediction</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     */
    private String status;

    /**
     * The location of an Amazon S3 bucket or directory to receive the
     * operation results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String outputUri;

    /**
     * A link to the file that contains logs of the
     * <a>CreateBatchPrediction</a> operation.
     */
    private String logUri;

    /**
     * A description of the most recent details about processing the batch
     * prediction request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     */
    private String message;

    /**
     * An ID assigned to the <code>BatchPrediction</code> at creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionID</code> in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return An ID assigned to the <code>BatchPrediction</code> at creation. This
     *         value should be identical to the value of the
     *         <code>BatchPredictionID</code> in the request.
     */
    public String getBatchPredictionId() {
        return batchPredictionId;
    }
    
    /**
     * An ID assigned to the <code>BatchPrediction</code> at creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionID</code> in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param batchPredictionId An ID assigned to the <code>BatchPrediction</code> at creation. This
     *         value should be identical to the value of the
     *         <code>BatchPredictionID</code> in the request.
     */
    public void setBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
    }
    
    /**
     * An ID assigned to the <code>BatchPrediction</code> at creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionID</code> in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param batchPredictionId An ID assigned to the <code>BatchPrediction</code> at creation. This
     *         value should be identical to the value of the
     *         <code>BatchPredictionID</code> in the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
        return this;
    }

    /**
     * The ID of the <code>MLModel</code> that generated predictions for the
     * <code>BatchPrediction</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID of the <code>MLModel</code> that generated predictions for the
     *         <code>BatchPrediction</code> request.
     */
    public String getMLModelId() {
        return mLModelId;
    }
    
    /**
     * The ID of the <code>MLModel</code> that generated predictions for the
     * <code>BatchPrediction</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID of the <code>MLModel</code> that generated predictions for the
     *         <code>BatchPrediction</code> request.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }
    
    /**
     * The ID of the <code>MLModel</code> that generated predictions for the
     * <code>BatchPrediction</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID of the <code>MLModel</code> that generated predictions for the
     *         <code>BatchPrediction</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * The ID of the <code>DataSource</code> that was used to create the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID of the <code>DataSource</code> that was used to create the
     *         <code>BatchPrediction</code>.
     */
    public String getBatchPredictionDataSourceId() {
        return batchPredictionDataSourceId;
    }
    
    /**
     * The ID of the <code>DataSource</code> that was used to create the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param batchPredictionDataSourceId The ID of the <code>DataSource</code> that was used to create the
     *         <code>BatchPrediction</code>.
     */
    public void setBatchPredictionDataSourceId(String batchPredictionDataSourceId) {
        this.batchPredictionDataSourceId = batchPredictionDataSourceId;
    }
    
    /**
     * The ID of the <code>DataSource</code> that was used to create the
     * <code>BatchPrediction</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param batchPredictionDataSourceId The ID of the <code>DataSource</code> that was used to create the
     *         <code>BatchPrediction</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withBatchPredictionDataSourceId(String batchPredictionDataSourceId) {
        this.batchPredictionDataSourceId = batchPredictionDataSourceId;
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
    public String getInputDataLocationS3() {
        return inputDataLocationS3;
    }
    
    /**
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param inputDataLocationS3 The location of the data file or directory in Amazon Simple Storage
     *         Service (Amazon S3).
     */
    public void setInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
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
     * @param inputDataLocationS3 The location of the data file or directory in Amazon Simple Storage
     *         Service (Amazon S3).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
        return this;
    }

    /**
     * The AWS user account that invoked the <code>BatchPrediction</code>.
     * The account type can be either an AWS root account or an AWS Identity
     * and Access Management (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @return The AWS user account that invoked the <code>BatchPrediction</code>.
     *         The account type can be either an AWS root account or an AWS Identity
     *         and Access Management (IAM) user account.
     */
    public String getCreatedByIamUser() {
        return createdByIamUser;
    }
    
    /**
     * The AWS user account that invoked the <code>BatchPrediction</code>.
     * The account type can be either an AWS root account or an AWS Identity
     * and Access Management (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @param createdByIamUser The AWS user account that invoked the <code>BatchPrediction</code>.
     *         The account type can be either an AWS root account or an AWS Identity
     *         and Access Management (IAM) user account.
     */
    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }
    
    /**
     * The AWS user account that invoked the <code>BatchPrediction</code>.
     * The account type can be either an AWS root account or an AWS Identity
     * and Access Management (IAM) user account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @param createdByIamUser The AWS user account that invoked the <code>BatchPrediction</code>.
     *         The account type can be either an AWS root account or an AWS Identity
     *         and Access Management (IAM) user account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
        return this;
    }

    /**
     * The time when the <code>BatchPrediction</code> was created. The time
     * is expressed in epoch time.
     *
     * @return The time when the <code>BatchPrediction</code> was created. The time
     *         is expressed in epoch time.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    
    /**
     * The time when the <code>BatchPrediction</code> was created. The time
     * is expressed in epoch time.
     *
     * @param createdAt The time when the <code>BatchPrediction</code> was created. The time
     *         is expressed in epoch time.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * The time when the <code>BatchPrediction</code> was created. The time
     * is expressed in epoch time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt The time when the <code>BatchPrediction</code> was created. The time
     *         is expressed in epoch time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time of the most recent edit to <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     *
     * @return The time of the most recent edit to <code>BatchPrediction</code>. The
     *         time is expressed in epoch time.
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }
    
    /**
     * The time of the most recent edit to <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     *
     * @param lastUpdatedAt The time of the most recent edit to <code>BatchPrediction</code>. The
     *         time is expressed in epoch time.
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
    
    /**
     * The time of the most recent edit to <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedAt The time of the most recent edit to <code>BatchPrediction</code>. The
     *         time is expressed in epoch time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * A user-supplied name or description of the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A user-supplied name or description of the
     *         <code>BatchPrediction</code>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * A user-supplied name or description of the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param name A user-supplied name or description of the
     *         <code>BatchPrediction</code>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * A user-supplied name or description of the
     * <code>BatchPrediction</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param name A user-supplied name or description of the
     *         <code>BatchPrediction</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The status of the <code>BatchPrediction</code>, which can be one of
     * the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to generate batch
     * predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     * are in progress.</li> <li><code>FAILED</code> - The request to perform
     * a batch prediction did not run to completion. It is not usable.</li>
     * <li><code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li> <li><code>DELETED</code> - The
     * <code>BatchPrediction</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @return The status of the <code>BatchPrediction</code>, which can be one of
     *         the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     *         Learning (Amazon ML) submitted a request to generate batch
     *         predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     *         are in progress.</li> <li><code>FAILED</code> - The request to perform
     *         a batch prediction did not run to completion. It is not usable.</li>
     *         <li><code>COMPLETED</code> - The batch prediction process completed
     *         successfully.</li> <li><code>DELETED</code> - The
     *         <code>BatchPrediction</code> is marked as deleted. It is not
     *         usable.</li> </ul>
     *
     * @see EntityStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the <code>BatchPrediction</code>, which can be one of
     * the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to generate batch
     * predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     * are in progress.</li> <li><code>FAILED</code> - The request to perform
     * a batch prediction did not run to completion. It is not usable.</li>
     * <li><code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li> <li><code>DELETED</code> - The
     * <code>BatchPrediction</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The status of the <code>BatchPrediction</code>, which can be one of
     *         the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     *         Learning (Amazon ML) submitted a request to generate batch
     *         predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     *         are in progress.</li> <li><code>FAILED</code> - The request to perform
     *         a batch prediction did not run to completion. It is not usable.</li>
     *         <li><code>COMPLETED</code> - The batch prediction process completed
     *         successfully.</li> <li><code>DELETED</code> - The
     *         <code>BatchPrediction</code> is marked as deleted. It is not
     *         usable.</li> </ul>
     *
     * @see EntityStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the <code>BatchPrediction</code>, which can be one of
     * the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to generate batch
     * predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     * are in progress.</li> <li><code>FAILED</code> - The request to perform
     * a batch prediction did not run to completion. It is not usable.</li>
     * <li><code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li> <li><code>DELETED</code> - The
     * <code>BatchPrediction</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The status of the <code>BatchPrediction</code>, which can be one of
     *         the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     *         Learning (Amazon ML) submitted a request to generate batch
     *         predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     *         are in progress.</li> <li><code>FAILED</code> - The request to perform
     *         a batch prediction did not run to completion. It is not usable.</li>
     *         <li><code>COMPLETED</code> - The batch prediction process completed
     *         successfully.</li> <li><code>DELETED</code> - The
     *         <code>BatchPrediction</code> is marked as deleted. It is not
     *         usable.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EntityStatus
     */
    public GetBatchPredictionResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the <code>BatchPrediction</code>, which can be one of
     * the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to generate batch
     * predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     * are in progress.</li> <li><code>FAILED</code> - The request to perform
     * a batch prediction did not run to completion. It is not usable.</li>
     * <li><code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li> <li><code>DELETED</code> - The
     * <code>BatchPrediction</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The status of the <code>BatchPrediction</code>, which can be one of
     *         the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     *         Learning (Amazon ML) submitted a request to generate batch
     *         predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     *         are in progress.</li> <li><code>FAILED</code> - The request to perform
     *         a batch prediction did not run to completion. It is not usable.</li>
     *         <li><code>COMPLETED</code> - The batch prediction process completed
     *         successfully.</li> <li><code>DELETED</code> - The
     *         <code>BatchPrediction</code> is marked as deleted. It is not
     *         usable.</li> </ul>
     *
     * @see EntityStatus
     */
    public void setStatus(EntityStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the <code>BatchPrediction</code>, which can be one of
     * the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to generate batch
     * predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     * are in progress.</li> <li><code>FAILED</code> - The request to perform
     * a batch prediction did not run to completion. It is not usable.</li>
     * <li><code>COMPLETED</code> - The batch prediction process completed
     * successfully.</li> <li><code>DELETED</code> - The
     * <code>BatchPrediction</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The status of the <code>BatchPrediction</code>, which can be one of
     *         the following values: <ul> <li><code>PENDING</code> - Amazon Machine
     *         Learning (Amazon ML) submitted a request to generate batch
     *         predictions.</li> <li><code>INPROGRESS</code> - The batch predictions
     *         are in progress.</li> <li><code>FAILED</code> - The request to perform
     *         a batch prediction did not run to completion. It is not usable.</li>
     *         <li><code>COMPLETED</code> - The batch prediction process completed
     *         successfully.</li> <li><code>DELETED</code> - The
     *         <code>BatchPrediction</code> is marked as deleted. It is not
     *         usable.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EntityStatus
     */
    public GetBatchPredictionResult withStatus(EntityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The location of an Amazon S3 bucket or directory to receive the
     * operation results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return The location of an Amazon S3 bucket or directory to receive the
     *         operation results.
     */
    public String getOutputUri() {
        return outputUri;
    }
    
    /**
     * The location of an Amazon S3 bucket or directory to receive the
     * operation results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param outputUri The location of an Amazon S3 bucket or directory to receive the
     *         operation results.
     */
    public void setOutputUri(String outputUri) {
        this.outputUri = outputUri;
    }
    
    /**
     * The location of an Amazon S3 bucket or directory to receive the
     * operation results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param outputUri The location of an Amazon S3 bucket or directory to receive the
     *         operation results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withOutputUri(String outputUri) {
        this.outputUri = outputUri;
        return this;
    }

    /**
     * A link to the file that contains logs of the
     * <a>CreateBatchPrediction</a> operation.
     *
     * @return A link to the file that contains logs of the
     *         <a>CreateBatchPrediction</a> operation.
     */
    public String getLogUri() {
        return logUri;
    }
    
    /**
     * A link to the file that contains logs of the
     * <a>CreateBatchPrediction</a> operation.
     *
     * @param logUri A link to the file that contains logs of the
     *         <a>CreateBatchPrediction</a> operation.
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }
    
    /**
     * A link to the file that contains logs of the
     * <a>CreateBatchPrediction</a> operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logUri A link to the file that contains logs of the
     *         <a>CreateBatchPrediction</a> operation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * A description of the most recent details about processing the batch
     * prediction request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @return A description of the most recent details about processing the batch
     *         prediction request.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * A description of the most recent details about processing the batch
     * prediction request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @param message A description of the most recent details about processing the batch
     *         prediction request.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * A description of the most recent details about processing the batch
     * prediction request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @param message A description of the most recent details about processing the batch
     *         prediction request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBatchPredictionResult withMessage(String message) {
        this.message = message;
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
        if (getBatchPredictionId() != null) sb.append("BatchPredictionId: " + getBatchPredictionId() + ",");
        if (getMLModelId() != null) sb.append("MLModelId: " + getMLModelId() + ",");
        if (getBatchPredictionDataSourceId() != null) sb.append("BatchPredictionDataSourceId: " + getBatchPredictionDataSourceId() + ",");
        if (getInputDataLocationS3() != null) sb.append("InputDataLocationS3: " + getInputDataLocationS3() + ",");
        if (getCreatedByIamUser() != null) sb.append("CreatedByIamUser: " + getCreatedByIamUser() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null) sb.append("LastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getOutputUri() != null) sb.append("OutputUri: " + getOutputUri() + ",");
        if (getLogUri() != null) sb.append("LogUri: " + getLogUri() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetBatchPredictionResult == false) return false;
        GetBatchPredictionResult other = (GetBatchPredictionResult)obj;
        
        if (other.getBatchPredictionId() == null ^ this.getBatchPredictionId() == null) return false;
        if (other.getBatchPredictionId() != null && other.getBatchPredictionId().equals(this.getBatchPredictionId()) == false) return false; 
        if (other.getMLModelId() == null ^ this.getMLModelId() == null) return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false) return false; 
        if (other.getBatchPredictionDataSourceId() == null ^ this.getBatchPredictionDataSourceId() == null) return false;
        if (other.getBatchPredictionDataSourceId() != null && other.getBatchPredictionDataSourceId().equals(this.getBatchPredictionDataSourceId()) == false) return false; 
        if (other.getInputDataLocationS3() == null ^ this.getInputDataLocationS3() == null) return false;
        if (other.getInputDataLocationS3() != null && other.getInputDataLocationS3().equals(this.getInputDataLocationS3()) == false) return false; 
        if (other.getCreatedByIamUser() == null ^ this.getCreatedByIamUser() == null) return false;
        if (other.getCreatedByIamUser() != null && other.getCreatedByIamUser().equals(this.getCreatedByIamUser()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null) return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getOutputUri() == null ^ this.getOutputUri() == null) return false;
        if (other.getOutputUri() != null && other.getOutputUri().equals(this.getOutputUri()) == false) return false; 
        if (other.getLogUri() == null ^ this.getLogUri() == null) return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
    @Override
    public GetBatchPredictionResult clone() {
        try {
            return (GetBatchPredictionResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    