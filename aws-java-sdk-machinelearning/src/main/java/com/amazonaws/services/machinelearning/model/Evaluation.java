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
 * Represents the output of <code>GetEvaluation</code> operation.
 * </p>
 * <p>
 * The content consists of the detailed metadata and data file information and the current status of the
 * <code>Evaluation</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Evaluation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID that is assigned to the <code>Evaluation</code> at creation.
     * </p>
     */
    private String evaluationId;
    /**
     * <p>
     * The ID of the <code>MLModel</code> that is the focus of the evaluation.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * The ID of the <code>DataSource</code> that is used to evaluate the <code>MLModel</code>.
     * </p>
     */
    private String evaluationDataSourceId;
    /**
     * <p>
     * The location and name of the data in Amazon Simple Storage Server (Amazon S3) that is used in the evaluation.
     * </p>
     */
    private String inputDataLocationS3;
    /**
     * <p>
     * The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an AWS
     * Identity and Access Management (IAM) user account.
     * </p>
     */
    private String createdByIamUser;
    /**
     * <p>
     * The time that the <code>Evaluation</code> was created. The time is expressed in epoch time.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time of the most recent edit to the <code>Evaluation</code>. The time is expressed in epoch time.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the evaluation. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Measurements of how well the <code>MLModel</code> performed, using observations referenced by the
     * <code>DataSource</code>. One of the following metrics is returned, based on the type of the <code>MLModel</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve (AUC) technique to measure performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean Square Error (RMSE) technique to measure
     * performance. RMSE measures the difference between predicted and actual values for a single variable.
     * </p>
     * </li>
     * <li>
     * <p>
     * MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score technique to measure performance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about performance metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning Developer Guide</a>.
     * </p>
     */
    private PerformanceMetrics performanceMetrics;
    /**
     * <p>
     * A description of the most recent details about evaluating the <code>MLModel</code>.
     * </p>
     */
    private String message;

    private Long computeTime;

    private java.util.Date finishedAt;

    private java.util.Date startedAt;

    /**
     * <p>
     * The ID that is assigned to the <code>Evaluation</code> at creation.
     * </p>
     * 
     * @param evaluationId
     *        The ID that is assigned to the <code>Evaluation</code> at creation.
     */

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * <p>
     * The ID that is assigned to the <code>Evaluation</code> at creation.
     * </p>
     * 
     * @return The ID that is assigned to the <code>Evaluation</code> at creation.
     */

    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * <p>
     * The ID that is assigned to the <code>Evaluation</code> at creation.
     * </p>
     * 
     * @param evaluationId
     *        The ID that is assigned to the <code>Evaluation</code> at creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withEvaluationId(String evaluationId) {
        setEvaluationId(evaluationId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that is the focus of the evaluation.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> that is the focus of the evaluation.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that is the focus of the evaluation.
     * </p>
     * 
     * @return The ID of the <code>MLModel</code> that is the focus of the evaluation.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that is the focus of the evaluation.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> that is the focus of the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that is used to evaluate the <code>MLModel</code>.
     * </p>
     * 
     * @param evaluationDataSourceId
     *        The ID of the <code>DataSource</code> that is used to evaluate the <code>MLModel</code>.
     */

    public void setEvaluationDataSourceId(String evaluationDataSourceId) {
        this.evaluationDataSourceId = evaluationDataSourceId;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that is used to evaluate the <code>MLModel</code>.
     * </p>
     * 
     * @return The ID of the <code>DataSource</code> that is used to evaluate the <code>MLModel</code>.
     */

    public String getEvaluationDataSourceId() {
        return this.evaluationDataSourceId;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that is used to evaluate the <code>MLModel</code>.
     * </p>
     * 
     * @param evaluationDataSourceId
     *        The ID of the <code>DataSource</code> that is used to evaluate the <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withEvaluationDataSourceId(String evaluationDataSourceId) {
        setEvaluationDataSourceId(evaluationDataSourceId);
        return this;
    }

    /**
     * <p>
     * The location and name of the data in Amazon Simple Storage Server (Amazon S3) that is used in the evaluation.
     * </p>
     * 
     * @param inputDataLocationS3
     *        The location and name of the data in Amazon Simple Storage Server (Amazon S3) that is used in the
     *        evaluation.
     */

    public void setInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
    }

    /**
     * <p>
     * The location and name of the data in Amazon Simple Storage Server (Amazon S3) that is used in the evaluation.
     * </p>
     * 
     * @return The location and name of the data in Amazon Simple Storage Server (Amazon S3) that is used in the
     *         evaluation.
     */

    public String getInputDataLocationS3() {
        return this.inputDataLocationS3;
    }

    /**
     * <p>
     * The location and name of the data in Amazon Simple Storage Server (Amazon S3) that is used in the evaluation.
     * </p>
     * 
     * @param inputDataLocationS3
     *        The location and name of the data in Amazon Simple Storage Server (Amazon S3) that is used in the
     *        evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withInputDataLocationS3(String inputDataLocationS3) {
        setInputDataLocationS3(inputDataLocationS3);
        return this;
    }

    /**
     * <p>
     * The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an AWS
     * Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an
     *        AWS Identity and Access Management (IAM) user account.
     */

    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an AWS
     * Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @return The AWS user account that invoked the evaluation. The account type can be either an AWS root account or
     *         an AWS Identity and Access Management (IAM) user account.
     */

    public String getCreatedByIamUser() {
        return this.createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an AWS
     * Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an
     *        AWS Identity and Access Management (IAM) user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withCreatedByIamUser(String createdByIamUser) {
        setCreatedByIamUser(createdByIamUser);
        return this;
    }

    /**
     * <p>
     * The time that the <code>Evaluation</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>Evaluation</code> was created. The time is expressed in epoch time.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the <code>Evaluation</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @return The time that the <code>Evaluation</code> was created. The time is expressed in epoch time.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the <code>Evaluation</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>Evaluation</code> was created. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>Evaluation</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the <code>Evaluation</code>. The time is expressed in epoch time.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>Evaluation</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @return The time of the most recent edit to the <code>Evaluation</code>. The time is expressed in epoch time.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>Evaluation</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the <code>Evaluation</code>. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name or description of the <code>Evaluation</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the <code>Evaluation</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name or description of the <code>Evaluation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the evaluation. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the evaluation. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     *        <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     *        <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It is
     *        not usable.</li>
     *        <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the evaluation. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @return The status of the evaluation. This element can have one of the following values:</p>
     *         <ul>
     *         <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     *         <code>MLModel</code>.</li>
     *         <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     *         <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It
     *         is not usable.</li>
     *         <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     *         <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the evaluation. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the evaluation. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     *        <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     *        <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It is
     *        not usable.</li>
     *        <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatus
     */

    public Evaluation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the evaluation. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the evaluation. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     *        <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     *        <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It is
     *        not usable.</li>
     *        <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public void setStatus(EntityStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the evaluation. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It is not
     * usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the evaluation. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an
     *        <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     *        <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code> did not run to completion. It is
     *        not usable.</li>
     *        <li> <code>COMPLETED</code> - The evaluation process completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatus
     */

    public Evaluation withStatus(EntityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Measurements of how well the <code>MLModel</code> performed, using observations referenced by the
     * <code>DataSource</code>. One of the following metrics is returned, based on the type of the <code>MLModel</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve (AUC) technique to measure performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean Square Error (RMSE) technique to measure
     * performance. RMSE measures the difference between predicted and actual values for a single variable.
     * </p>
     * </li>
     * <li>
     * <p>
     * MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score technique to measure performance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about performance metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning Developer Guide</a>.
     * </p>
     * 
     * @param performanceMetrics
     *        Measurements of how well the <code>MLModel</code> performed, using observations referenced by the
     *        <code>DataSource</code>. One of the following metrics is returned, based on the type of the
     *        <code>MLModel</code>: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve (AUC) technique to measure
     *        performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean Square Error (RMSE) technique to
     *        measure performance. RMSE measures the difference between predicted and actual values for a single
     *        variable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score technique to measure performance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about performance metrics, please see the <a
     *        href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning Developer Guide</a>.
     */

    public void setPerformanceMetrics(PerformanceMetrics performanceMetrics) {
        this.performanceMetrics = performanceMetrics;
    }

    /**
     * <p>
     * Measurements of how well the <code>MLModel</code> performed, using observations referenced by the
     * <code>DataSource</code>. One of the following metrics is returned, based on the type of the <code>MLModel</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve (AUC) technique to measure performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean Square Error (RMSE) technique to measure
     * performance. RMSE measures the difference between predicted and actual values for a single variable.
     * </p>
     * </li>
     * <li>
     * <p>
     * MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score technique to measure performance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about performance metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning Developer Guide</a>.
     * </p>
     * 
     * @return Measurements of how well the <code>MLModel</code> performed, using observations referenced by the
     *         <code>DataSource</code>. One of the following metrics is returned, based on the type of the
     *         <code>MLModel</code>: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve (AUC) technique to measure
     *         performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean Square Error (RMSE) technique to
     *         measure performance. RMSE measures the difference between predicted and actual values for a single
     *         variable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score technique to measure
     *         performance.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about performance metrics, please see the <a
     *         href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning Developer Guide</a>.
     */

    public PerformanceMetrics getPerformanceMetrics() {
        return this.performanceMetrics;
    }

    /**
     * <p>
     * Measurements of how well the <code>MLModel</code> performed, using observations referenced by the
     * <code>DataSource</code>. One of the following metrics is returned, based on the type of the <code>MLModel</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve (AUC) technique to measure performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean Square Error (RMSE) technique to measure
     * performance. RMSE measures the difference between predicted and actual values for a single variable.
     * </p>
     * </li>
     * <li>
     * <p>
     * MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score technique to measure performance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about performance metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning Developer Guide</a>.
     * </p>
     * 
     * @param performanceMetrics
     *        Measurements of how well the <code>MLModel</code> performed, using observations referenced by the
     *        <code>DataSource</code>. One of the following metrics is returned, based on the type of the
     *        <code>MLModel</code>: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve (AUC) technique to measure
     *        performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean Square Error (RMSE) technique to
     *        measure performance. RMSE measures the difference between predicted and actual values for a single
     *        variable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score technique to measure performance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about performance metrics, please see the <a
     *        href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withPerformanceMetrics(PerformanceMetrics performanceMetrics) {
        setPerformanceMetrics(performanceMetrics);
        return this;
    }

    /**
     * <p>
     * A description of the most recent details about evaluating the <code>MLModel</code>.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about evaluating the <code>MLModel</code>.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the most recent details about evaluating the <code>MLModel</code>.
     * </p>
     * 
     * @return A description of the most recent details about evaluating the <code>MLModel</code>.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the most recent details about evaluating the <code>MLModel</code>.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about evaluating the <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withMessage(String message) {
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

    public Evaluation withComputeTime(Long computeTime) {
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

    public Evaluation withFinishedAt(java.util.Date finishedAt) {
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

    public Evaluation withStartedAt(java.util.Date startedAt) {
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
        if (getEvaluationId() != null)
            sb.append("EvaluationId: ").append(getEvaluationId()).append(",");
        if (getMLModelId() != null)
            sb.append("MLModelId: ").append(getMLModelId()).append(",");
        if (getEvaluationDataSourceId() != null)
            sb.append("EvaluationDataSourceId: ").append(getEvaluationDataSourceId()).append(",");
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
        if (getPerformanceMetrics() != null)
            sb.append("PerformanceMetrics: ").append(getPerformanceMetrics()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
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

        if (obj instanceof Evaluation == false)
            return false;
        Evaluation other = (Evaluation) obj;
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getEvaluationDataSourceId() == null ^ this.getEvaluationDataSourceId() == null)
            return false;
        if (other.getEvaluationDataSourceId() != null && other.getEvaluationDataSourceId().equals(this.getEvaluationDataSourceId()) == false)
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
        if (other.getPerformanceMetrics() == null ^ this.getPerformanceMetrics() == null)
            return false;
        if (other.getPerformanceMetrics() != null && other.getPerformanceMetrics().equals(this.getPerformanceMetrics()) == false)
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
        return true;
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
        hashCode = prime * hashCode + ((getComputeTime() == null) ? 0 : getComputeTime().hashCode());
        hashCode = prime * hashCode + ((getFinishedAt() == null) ? 0 : getFinishedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        return hashCode;
    }

    @Override
    public Evaluation clone() {
        try {
            return (Evaluation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.machinelearning.model.transform.EvaluationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
