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
 * Represents the output of GetEvaluation operation.
 * </p>
 * <p>
 * The content consists of the detailed metadata and data file
 * information and the current status of the <code>Evaluation</code> .
 * </p>
 */
public class Evaluation implements Serializable, Cloneable {

    /**
     * The ID that is assigned to the <code>Evaluation</code> at creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String evaluationId;

    /**
     * The ID of the <code>MLModel</code> that is the focus of the
     * evaluation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * The ID of the <code>DataSource</code> that is used to evaluate the
     * <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String evaluationDataSourceId;

    /**
     * The location and name of the data in Amazon Simple Storage Server
     * (Amazon S3) that is used in the evaluation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String inputDataLocationS3;

    /**
     * The AWS user account that invoked the evaluation. The account type can
     * be either an AWS root account or an AWS Identity and Access Management
     * (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     */
    private String createdByIamUser;

    /**
     * The time that the <code>Evaluation</code> was created. The time is
     * expressed in epoch time.
     */
    private java.util.Date createdAt;

    /**
     * The time of the most recent edit to the <code>Evaluation</code>. The
     * time is expressed in epoch time.
     */
    private java.util.Date lastUpdatedAt;

    /**
     * A user-supplied name or description of the <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String name;

    /**
     * The status of the evaluation. This element can have one of the
     * following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     * evaluation is underway.</li> <li><code>FAILED</code> - The request to
     * evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li> <li><code>COMPLETED</code> - The evaluation process
     * completed successfully.</li> <li><code>DELETED</code> - The
     * <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     */
    private String status;

    /**
     * Measurements of how well the <code>MLModel</code> performed, using
     * observations referenced by the <code>DataSource</code>. One of the
     * following metrics is returned, based on the type of the MLModel: <ul>
     * <li><p>BinaryAUC: A binary <code>MLModel</code> uses the Area Under
     * the Curve (AUC) technique to measure performance. </li>
     * <li><p>RegressionRMSE: A regression <code>MLModel</code> uses the Root
     * Mean Square Error (RMSE) technique to measure performance. RMSE
     * measures the difference between predicted and actual values for a
     * single variable. </li> <li><p>MulticlassAvgFScore: A multiclass
     * <code>MLModel</code> uses the F1 score technique to measure
     * performance. </li> </ul> <p> For more information about performance
     * metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     */
    private PerformanceMetrics performanceMetrics;

    /**
     * A description of the most recent details about evaluating the
     * <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     */
    private String message;

    /**
     * The ID that is assigned to the <code>Evaluation</code> at creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID that is assigned to the <code>Evaluation</code> at creation.
     */
    public String getEvaluationId() {
        return evaluationId;
    }
    
    /**
     * The ID that is assigned to the <code>Evaluation</code> at creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationId The ID that is assigned to the <code>Evaluation</code> at creation.
     */
    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }
    
    /**
     * The ID that is assigned to the <code>Evaluation</code> at creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationId The ID that is assigned to the <code>Evaluation</code> at creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * The ID of the <code>MLModel</code> that is the focus of the
     * evaluation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID of the <code>MLModel</code> that is the focus of the
     *         evaluation.
     */
    public String getMLModelId() {
        return mLModelId;
    }
    
    /**
     * The ID of the <code>MLModel</code> that is the focus of the
     * evaluation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID of the <code>MLModel</code> that is the focus of the
     *         evaluation.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }
    
    /**
     * The ID of the <code>MLModel</code> that is the focus of the
     * evaluation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID of the <code>MLModel</code> that is the focus of the
     *         evaluation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * The ID of the <code>DataSource</code> that is used to evaluate the
     * <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID of the <code>DataSource</code> that is used to evaluate the
     *         <code>MLModel</code>.
     */
    public String getEvaluationDataSourceId() {
        return evaluationDataSourceId;
    }
    
    /**
     * The ID of the <code>DataSource</code> that is used to evaluate the
     * <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationDataSourceId The ID of the <code>DataSource</code> that is used to evaluate the
     *         <code>MLModel</code>.
     */
    public void setEvaluationDataSourceId(String evaluationDataSourceId) {
        this.evaluationDataSourceId = evaluationDataSourceId;
    }
    
    /**
     * The ID of the <code>DataSource</code> that is used to evaluate the
     * <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationDataSourceId The ID of the <code>DataSource</code> that is used to evaluate the
     *         <code>MLModel</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withEvaluationDataSourceId(String evaluationDataSourceId) {
        this.evaluationDataSourceId = evaluationDataSourceId;
        return this;
    }

    /**
     * The location and name of the data in Amazon Simple Storage Server
     * (Amazon S3) that is used in the evaluation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return The location and name of the data in Amazon Simple Storage Server
     *         (Amazon S3) that is used in the evaluation.
     */
    public String getInputDataLocationS3() {
        return inputDataLocationS3;
    }
    
    /**
     * The location and name of the data in Amazon Simple Storage Server
     * (Amazon S3) that is used in the evaluation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param inputDataLocationS3 The location and name of the data in Amazon Simple Storage Server
     *         (Amazon S3) that is used in the evaluation.
     */
    public void setInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
    }
    
    /**
     * The location and name of the data in Amazon Simple Storage Server
     * (Amazon S3) that is used in the evaluation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param inputDataLocationS3 The location and name of the data in Amazon Simple Storage Server
     *         (Amazon S3) that is used in the evaluation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
        return this;
    }

    /**
     * The AWS user account that invoked the evaluation. The account type can
     * be either an AWS root account or an AWS Identity and Access Management
     * (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @return The AWS user account that invoked the evaluation. The account type can
     *         be either an AWS root account or an AWS Identity and Access Management
     *         (IAM) user account.
     */
    public String getCreatedByIamUser() {
        return createdByIamUser;
    }
    
    /**
     * The AWS user account that invoked the evaluation. The account type can
     * be either an AWS root account or an AWS Identity and Access Management
     * (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @param createdByIamUser The AWS user account that invoked the evaluation. The account type can
     *         be either an AWS root account or an AWS Identity and Access Management
     *         (IAM) user account.
     */
    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }
    
    /**
     * The AWS user account that invoked the evaluation. The account type can
     * be either an AWS root account or an AWS Identity and Access Management
     * (IAM) user account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @param createdByIamUser The AWS user account that invoked the evaluation. The account type can
     *         be either an AWS root account or an AWS Identity and Access Management
     *         (IAM) user account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
        return this;
    }

    /**
     * The time that the <code>Evaluation</code> was created. The time is
     * expressed in epoch time.
     *
     * @return The time that the <code>Evaluation</code> was created. The time is
     *         expressed in epoch time.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    
    /**
     * The time that the <code>Evaluation</code> was created. The time is
     * expressed in epoch time.
     *
     * @param createdAt The time that the <code>Evaluation</code> was created. The time is
     *         expressed in epoch time.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * The time that the <code>Evaluation</code> was created. The time is
     * expressed in epoch time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt The time that the <code>Evaluation</code> was created. The time is
     *         expressed in epoch time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time of the most recent edit to the <code>Evaluation</code>. The
     * time is expressed in epoch time.
     *
     * @return The time of the most recent edit to the <code>Evaluation</code>. The
     *         time is expressed in epoch time.
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }
    
    /**
     * The time of the most recent edit to the <code>Evaluation</code>. The
     * time is expressed in epoch time.
     *
     * @param lastUpdatedAt The time of the most recent edit to the <code>Evaluation</code>. The
     *         time is expressed in epoch time.
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
    
    /**
     * The time of the most recent edit to the <code>Evaluation</code>. The
     * time is expressed in epoch time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedAt The time of the most recent edit to the <code>Evaluation</code>. The
     *         time is expressed in epoch time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * A user-supplied name or description of the <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A user-supplied name or description of the <code>Evaluation</code>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * A user-supplied name or description of the <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param name A user-supplied name or description of the <code>Evaluation</code>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * A user-supplied name or description of the <code>Evaluation</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param name A user-supplied name or description of the <code>Evaluation</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The status of the evaluation. This element can have one of the
     * following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     * evaluation is underway.</li> <li><code>FAILED</code> - The request to
     * evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li> <li><code>COMPLETED</code> - The evaluation process
     * completed successfully.</li> <li><code>DELETED</code> - The
     * <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @return The status of the evaluation. This element can have one of the
     *         following values: <ul> <li><code>PENDING</code> - Amazon Machine
     *         Learning (Amazon ML) submitted a request to evaluate an
     *         <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     *         evaluation is underway.</li> <li><code>FAILED</code> - The request to
     *         evaluate an <code>MLModel</code> did not run to completion. It is not
     *         usable.</li> <li><code>COMPLETED</code> - The evaluation process
     *         completed successfully.</li> <li><code>DELETED</code> - The
     *         <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     *         </ul>
     *
     * @see EntityStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the evaluation. This element can have one of the
     * following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     * evaluation is underway.</li> <li><code>FAILED</code> - The request to
     * evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li> <li><code>COMPLETED</code> - The evaluation process
     * completed successfully.</li> <li><code>DELETED</code> - The
     * <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The status of the evaluation. This element can have one of the
     *         following values: <ul> <li><code>PENDING</code> - Amazon Machine
     *         Learning (Amazon ML) submitted a request to evaluate an
     *         <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     *         evaluation is underway.</li> <li><code>FAILED</code> - The request to
     *         evaluate an <code>MLModel</code> did not run to completion. It is not
     *         usable.</li> <li><code>COMPLETED</code> - The evaluation process
     *         completed successfully.</li> <li><code>DELETED</code> - The
     *         <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     *         </ul>
     *
     * @see EntityStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the evaluation. This element can have one of the
     * following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     * evaluation is underway.</li> <li><code>FAILED</code> - The request to
     * evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li> <li><code>COMPLETED</code> - The evaluation process
     * completed successfully.</li> <li><code>DELETED</code> - The
     * <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The status of the evaluation. This element can have one of the
     *         following values: <ul> <li><code>PENDING</code> - Amazon Machine
     *         Learning (Amazon ML) submitted a request to evaluate an
     *         <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     *         evaluation is underway.</li> <li><code>FAILED</code> - The request to
     *         evaluate an <code>MLModel</code> did not run to completion. It is not
     *         usable.</li> <li><code>COMPLETED</code> - The evaluation process
     *         completed successfully.</li> <li><code>DELETED</code> - The
     *         <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EntityStatus
     */
    public Evaluation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the evaluation. This element can have one of the
     * following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     * evaluation is underway.</li> <li><code>FAILED</code> - The request to
     * evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li> <li><code>COMPLETED</code> - The evaluation process
     * completed successfully.</li> <li><code>DELETED</code> - The
     * <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The status of the evaluation. This element can have one of the
     *         following values: <ul> <li><code>PENDING</code> - Amazon Machine
     *         Learning (Amazon ML) submitted a request to evaluate an
     *         <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     *         evaluation is underway.</li> <li><code>FAILED</code> - The request to
     *         evaluate an <code>MLModel</code> did not run to completion. It is not
     *         usable.</li> <li><code>COMPLETED</code> - The evaluation process
     *         completed successfully.</li> <li><code>DELETED</code> - The
     *         <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     *         </ul>
     *
     * @see EntityStatus
     */
    public void setStatus(EntityStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the evaluation. This element can have one of the
     * following values: <ul> <li><code>PENDING</code> - Amazon Machine
     * Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     * evaluation is underway.</li> <li><code>FAILED</code> - The request to
     * evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li> <li><code>COMPLETED</code> - The evaluation process
     * completed successfully.</li> <li><code>DELETED</code> - The
     * <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The status of the evaluation. This element can have one of the
     *         following values: <ul> <li><code>PENDING</code> - Amazon Machine
     *         Learning (Amazon ML) submitted a request to evaluate an
     *         <code>MLModel</code>.</li> <li><code>INPROGRESS</code> - The
     *         evaluation is underway.</li> <li><code>FAILED</code> - The request to
     *         evaluate an <code>MLModel</code> did not run to completion. It is not
     *         usable.</li> <li><code>COMPLETED</code> - The evaluation process
     *         completed successfully.</li> <li><code>DELETED</code> - The
     *         <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EntityStatus
     */
    public Evaluation withStatus(EntityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Measurements of how well the <code>MLModel</code> performed, using
     * observations referenced by the <code>DataSource</code>. One of the
     * following metrics is returned, based on the type of the MLModel: <ul>
     * <li><p>BinaryAUC: A binary <code>MLModel</code> uses the Area Under
     * the Curve (AUC) technique to measure performance. </li>
     * <li><p>RegressionRMSE: A regression <code>MLModel</code> uses the Root
     * Mean Square Error (RMSE) technique to measure performance. RMSE
     * measures the difference between predicted and actual values for a
     * single variable. </li> <li><p>MulticlassAvgFScore: A multiclass
     * <code>MLModel</code> uses the F1 score technique to measure
     * performance. </li> </ul> <p> For more information about performance
     * metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     *
     * @return Measurements of how well the <code>MLModel</code> performed, using
     *         observations referenced by the <code>DataSource</code>. One of the
     *         following metrics is returned, based on the type of the MLModel: <ul>
     *         <li><p>BinaryAUC: A binary <code>MLModel</code> uses the Area Under
     *         the Curve (AUC) technique to measure performance. </li>
     *         <li><p>RegressionRMSE: A regression <code>MLModel</code> uses the Root
     *         Mean Square Error (RMSE) technique to measure performance. RMSE
     *         measures the difference between predicted and actual values for a
     *         single variable. </li> <li><p>MulticlassAvgFScore: A multiclass
     *         <code>MLModel</code> uses the F1 score technique to measure
     *         performance. </li> </ul> <p> For more information about performance
     *         metrics, please see the <a
     *         href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *         Machine Learning Developer Guide</a>.
     */
    public PerformanceMetrics getPerformanceMetrics() {
        return performanceMetrics;
    }
    
    /**
     * Measurements of how well the <code>MLModel</code> performed, using
     * observations referenced by the <code>DataSource</code>. One of the
     * following metrics is returned, based on the type of the MLModel: <ul>
     * <li><p>BinaryAUC: A binary <code>MLModel</code> uses the Area Under
     * the Curve (AUC) technique to measure performance. </li>
     * <li><p>RegressionRMSE: A regression <code>MLModel</code> uses the Root
     * Mean Square Error (RMSE) technique to measure performance. RMSE
     * measures the difference between predicted and actual values for a
     * single variable. </li> <li><p>MulticlassAvgFScore: A multiclass
     * <code>MLModel</code> uses the F1 score technique to measure
     * performance. </li> </ul> <p> For more information about performance
     * metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     *
     * @param performanceMetrics Measurements of how well the <code>MLModel</code> performed, using
     *         observations referenced by the <code>DataSource</code>. One of the
     *         following metrics is returned, based on the type of the MLModel: <ul>
     *         <li><p>BinaryAUC: A binary <code>MLModel</code> uses the Area Under
     *         the Curve (AUC) technique to measure performance. </li>
     *         <li><p>RegressionRMSE: A regression <code>MLModel</code> uses the Root
     *         Mean Square Error (RMSE) technique to measure performance. RMSE
     *         measures the difference between predicted and actual values for a
     *         single variable. </li> <li><p>MulticlassAvgFScore: A multiclass
     *         <code>MLModel</code> uses the F1 score technique to measure
     *         performance. </li> </ul> <p> For more information about performance
     *         metrics, please see the <a
     *         href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *         Machine Learning Developer Guide</a>.
     */
    public void setPerformanceMetrics(PerformanceMetrics performanceMetrics) {
        this.performanceMetrics = performanceMetrics;
    }
    
    /**
     * Measurements of how well the <code>MLModel</code> performed, using
     * observations referenced by the <code>DataSource</code>. One of the
     * following metrics is returned, based on the type of the MLModel: <ul>
     * <li><p>BinaryAUC: A binary <code>MLModel</code> uses the Area Under
     * the Curve (AUC) technique to measure performance. </li>
     * <li><p>RegressionRMSE: A regression <code>MLModel</code> uses the Root
     * Mean Square Error (RMSE) technique to measure performance. RMSE
     * measures the difference between predicted and actual values for a
     * single variable. </li> <li><p>MulticlassAvgFScore: A multiclass
     * <code>MLModel</code> uses the F1 score technique to measure
     * performance. </li> </ul> <p> For more information about performance
     * metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param performanceMetrics Measurements of how well the <code>MLModel</code> performed, using
     *         observations referenced by the <code>DataSource</code>. One of the
     *         following metrics is returned, based on the type of the MLModel: <ul>
     *         <li><p>BinaryAUC: A binary <code>MLModel</code> uses the Area Under
     *         the Curve (AUC) technique to measure performance. </li>
     *         <li><p>RegressionRMSE: A regression <code>MLModel</code> uses the Root
     *         Mean Square Error (RMSE) technique to measure performance. RMSE
     *         measures the difference between predicted and actual values for a
     *         single variable. </li> <li><p>MulticlassAvgFScore: A multiclass
     *         <code>MLModel</code> uses the F1 score technique to measure
     *         performance. </li> </ul> <p> For more information about performance
     *         metrics, please see the <a
     *         href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *         Machine Learning Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withPerformanceMetrics(PerformanceMetrics performanceMetrics) {
        this.performanceMetrics = performanceMetrics;
        return this;
    }

    /**
     * A description of the most recent details about evaluating the
     * <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @return A description of the most recent details about evaluating the
     *         <code>MLModel</code>.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * A description of the most recent details about evaluating the
     * <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @param message A description of the most recent details about evaluating the
     *         <code>MLModel</code>.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * A description of the most recent details about evaluating the
     * <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @param message A description of the most recent details about evaluating the
     *         <code>MLModel</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withMessage(String message) {
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
        if (getEvaluationId() != null) sb.append("EvaluationId: " + getEvaluationId() + ",");
        if (getMLModelId() != null) sb.append("MLModelId: " + getMLModelId() + ",");
        if (getEvaluationDataSourceId() != null) sb.append("EvaluationDataSourceId: " + getEvaluationDataSourceId() + ",");
        if (getInputDataLocationS3() != null) sb.append("InputDataLocationS3: " + getInputDataLocationS3() + ",");
        if (getCreatedByIamUser() != null) sb.append("CreatedByIamUser: " + getCreatedByIamUser() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null) sb.append("LastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getPerformanceMetrics() != null) sb.append("PerformanceMetrics: " + getPerformanceMetrics() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode()); 
        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode()); 
        hashCode = prime * hashCode + ((getEvaluationDataSourceId() == null) ? 0 : getEvaluationDataSourceId().hashCode()); 
        hashCode = prime * hashCode + ((getInputDataLocationS3() == null) ? 0 : getInputDataLocationS3().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedByIamUser() == null) ? 0 : getCreatedByIamUser().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getPerformanceMetrics() == null) ? 0 : getPerformanceMetrics().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Evaluation == false) return false;
        Evaluation other = (Evaluation)obj;
        
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null) return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false) return false; 
        if (other.getMLModelId() == null ^ this.getMLModelId() == null) return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false) return false; 
        if (other.getEvaluationDataSourceId() == null ^ this.getEvaluationDataSourceId() == null) return false;
        if (other.getEvaluationDataSourceId() != null && other.getEvaluationDataSourceId().equals(this.getEvaluationDataSourceId()) == false) return false; 
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
        if (other.getPerformanceMetrics() == null ^ this.getPerformanceMetrics() == null) return false;
        if (other.getPerformanceMetrics() != null && other.getPerformanceMetrics().equals(this.getPerformanceMetrics()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
    @Override
    public Evaluation clone() {
        try {
            return (Evaluation) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    