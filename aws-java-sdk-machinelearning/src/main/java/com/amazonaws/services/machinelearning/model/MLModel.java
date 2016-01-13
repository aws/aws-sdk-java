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
 * Represents the output of a <a>GetMLModel</a> operation.
 * </p>
 * <p>
 * The content consists of the detailed metadata and the current status of the
 * <code>MLModel</code>.
 * </p>
 */
public class MLModel implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * The ID of the training <code>DataSource</code>. The <a>CreateMLModel</a>
     * operation uses the <code>TrainingDataSourceId</code>.
     * </p>
     */
    private String trainingDataSourceId;
    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     */
    private String createdByIamUser;
    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed
     * in epoch time.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is
     * expressed in epoch time.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of an <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to
     * create an <code>MLModel</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create an <code>MLModel</code> did not run to
     * completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li>
     * </ul>
     */
    private String status;

    private Long sizeInBytes;
    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>.
     * </p>
     */
    private RealtimeEndpointInfo endpointInfo;
    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list
     * is implemented as a map of key/value pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - Coefficient regularization L1
     * norm. It controls overfitting the data by penalizing large coefficients.
     * This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, specify a small value, such as 1.0E-04 or
     * 1.0E-08.
     * </p>
     * <p>
     * The value is a double that ranges from 0 to MAX_DOUBLE. The default is
     * not to use L1 normalization. The parameter cannot be used when
     * <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - Coefficient regularization L2
     * norm. It controls overfitting the data by penalizing large coefficients.
     * This tends to drive coefficients to small, nonzero values. If you use
     * this parameter, specify a small value, such as 1.0E-04 or 1.0E-08.
     * </p>
     * <p>
     * The valus is a double that ranges from 0 to MAX_DOUBLE. The default is
     * not to use L2 normalization. This cannot be used when <code>L1</code> is
     * specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - Number of times that the training process
     * traverses the observations to build the <code>MLModel</code>. The value
     * is an integer that ranges from 1 to 10000. The default value is 10.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size of the
     * model. Depending on the input data, the model size might affect
     * performance.
     * </p>
     * <p>
     * The value is an integer that ranges from 100000 to 2147483648. The
     * default value is 33554432.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> trainingParameters;
    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     */
    private String inputDataLocationS3;
    /**
     * <p>
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported:
     * </p>
     * <ul>
     * <li>SGD -- Stochastic gradient descent. The goal of SGD is to minimize
     * the gradient of the loss function.</li>
     * </ul>
     */
    private String algorithm;
    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION - Produces a numeric result. For example,
     * "What listing price should a house have?".</li>
     * <li>BINARY - Produces one of two possible results. For example,
     * "Is this a child-friendly web site?".</li>
     * <li>MULTICLASS - Produces more than two possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * </ul>
     */
    private String mLModelType;

    private Float scoreThreshold;
    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The
     * time is expressed in epoch time.
     * </p>
     */
    private java.util.Date scoreThresholdLastUpdatedAt;
    /**
     * <p>
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     * 
     * @param mLModelId
     *        The ID assigned to the <code>MLModel</code> at creation.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     * 
     * @return The ID assigned to the <code>MLModel</code> at creation.
     */
    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     * 
     * @param mLModelId
     *        The ID assigned to the <code>MLModel</code> at creation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * The ID of the training <code>DataSource</code>. The <a>CreateMLModel</a>
     * operation uses the <code>TrainingDataSourceId</code>.
     * </p>
     * 
     * @param trainingDataSourceId
     *        The ID of the training <code>DataSource</code>. The
     *        <a>CreateMLModel</a> operation uses the
     *        <code>TrainingDataSourceId</code>.
     */
    public void setTrainingDataSourceId(String trainingDataSourceId) {
        this.trainingDataSourceId = trainingDataSourceId;
    }

    /**
     * <p>
     * The ID of the training <code>DataSource</code>. The <a>CreateMLModel</a>
     * operation uses the <code>TrainingDataSourceId</code>.
     * </p>
     * 
     * @return The ID of the training <code>DataSource</code>. The
     *         <a>CreateMLModel</a> operation uses the
     *         <code>TrainingDataSourceId</code>.
     */
    public String getTrainingDataSourceId() {
        return this.trainingDataSourceId;
    }

    /**
     * <p>
     * The ID of the training <code>DataSource</code>. The <a>CreateMLModel</a>
     * operation uses the <code>TrainingDataSourceId</code>.
     * </p>
     * 
     * @param trainingDataSourceId
     *        The ID of the training <code>DataSource</code>. The
     *        <a>CreateMLModel</a> operation uses the
     *        <code>TrainingDataSourceId</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withTrainingDataSourceId(String trainingDataSourceId) {
        setTrainingDataSourceId(trainingDataSourceId);
        return this;
    }

    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account from which the <code>MLModel</code> was
     *        created. The account type can be either an AWS root account or an
     *        AWS Identity and Access Management (IAM) user account.
     */
    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     * 
     * @return The AWS user account from which the <code>MLModel</code> was
     *         created. The account type can be either an AWS root account or an
     *         AWS Identity and Access Management (IAM) user account.
     */
    public String getCreatedByIamUser() {
        return this.createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account from which the <code>MLModel</code> was
     *        created. The account type can be either an AWS root account or an
     *        AWS Identity and Access Management (IAM) user account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withCreatedByIamUser(String createdByIamUser) {
        setCreatedByIamUser(createdByIamUser);
        return this;
    }

    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed
     * in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>MLModel</code> was created. The time is
     *        expressed in epoch time.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed
     * in epoch time.
     * </p>
     * 
     * @return The time that the <code>MLModel</code> was created. The time is
     *         expressed in epoch time.
     */
    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed
     * in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>MLModel</code> was created. The time is
     *        expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is
     * expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the <code>MLModel</code>. The
     *        time is expressed in epoch time.
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is
     * expressed in epoch time.
     * </p>
     * 
     * @return The time of the most recent edit to the <code>MLModel</code>. The
     *         time is expressed in epoch time.
     */
    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is
     * expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the <code>MLModel</code>. The
     *        time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name or description of the <code>MLModel</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the <code>MLModel</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name or description of the <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of an <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to
     * create an <code>MLModel</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create an <code>MLModel</code> did not run to
     * completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of an <code>MLModel</code>. This element can
     *        have one of the following values: </p>
     *        <ul>
     *        <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a
     *        request to create an <code>MLModel</code>.</li>
     *        <li>INPROGRESS - The creation process is underway.</li>
     *        <li>FAILED - The request to create an <code>MLModel</code> did not
     *        run to completion. It is not usable.</li>
     *        <li>COMPLETED - The creation process completed successfully.</li>
     *        <li>DELETED - The <code>MLModel</code> is marked as deleted. It is
     *        not usable.</li>
     * @see EntityStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of an <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to
     * create an <code>MLModel</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create an <code>MLModel</code> did not run to
     * completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li>
     * </ul>
     * 
     * @return The current status of an <code>MLModel</code>. This element can
     *         have one of the following values: </p>
     *         <ul>
     *         <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a
     *         request to create an <code>MLModel</code>.</li>
     *         <li>INPROGRESS - The creation process is underway.</li>
     *         <li>FAILED - The request to create an <code>MLModel</code> did
     *         not run to completion. It is not usable.</li>
     *         <li>COMPLETED - The creation process completed successfully.</li>
     *         <li>DELETED - The <code>MLModel</code> is marked as deleted. It
     *         is not usable.</li>
     * @see EntityStatus
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of an <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to
     * create an <code>MLModel</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create an <code>MLModel</code> did not run to
     * completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of an <code>MLModel</code>. This element can
     *        have one of the following values: </p>
     *        <ul>
     *        <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a
     *        request to create an <code>MLModel</code>.</li>
     *        <li>INPROGRESS - The creation process is underway.</li>
     *        <li>FAILED - The request to create an <code>MLModel</code> did not
     *        run to completion. It is not usable.</li>
     *        <li>COMPLETED - The creation process completed successfully.</li>
     *        <li>DELETED - The <code>MLModel</code> is marked as deleted. It is
     *        not usable.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */
    public MLModel withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of an <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to
     * create an <code>MLModel</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create an <code>MLModel</code> did not run to
     * completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of an <code>MLModel</code>. This element can
     *        have one of the following values: </p>
     *        <ul>
     *        <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a
     *        request to create an <code>MLModel</code>.</li>
     *        <li>INPROGRESS - The creation process is underway.</li>
     *        <li>FAILED - The request to create an <code>MLModel</code> did not
     *        run to completion. It is not usable.</li>
     *        <li>COMPLETED - The creation process completed successfully.</li>
     *        <li>DELETED - The <code>MLModel</code> is marked as deleted. It is
     *        not usable.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */
    public void setStatus(EntityStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of an <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a request to
     * create an <code>MLModel</code>.</li>
     * <li>INPROGRESS - The creation process is underway.</li>
     * <li>FAILED - The request to create an <code>MLModel</code> did not run to
     * completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of an <code>MLModel</code>. This element can
     *        have one of the following values: </p>
     *        <ul>
     *        <li>PENDING - Amazon Machine Learning (Amazon ML) submitted a
     *        request to create an <code>MLModel</code>.</li>
     *        <li>INPROGRESS - The creation process is underway.</li>
     *        <li>FAILED - The request to create an <code>MLModel</code> did not
     *        run to completion. It is not usable.</li>
     *        <li>COMPLETED - The creation process completed successfully.</li>
     *        <li>DELETED - The <code>MLModel</code> is marked as deleted. It is
     *        not usable.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */
    public MLModel withStatus(EntityStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * @param sizeInBytes
     */
    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * @return
     */
    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * @param sizeInBytes
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withSizeInBytes(Long sizeInBytes) {
        setSizeInBytes(sizeInBytes);
        return this;
    }

    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>.
     * </p>
     * 
     * @param endpointInfo
     *        The current endpoint of the <code>MLModel</code>.
     */
    public void setEndpointInfo(RealtimeEndpointInfo endpointInfo) {
        this.endpointInfo = endpointInfo;
    }

    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>.
     * </p>
     * 
     * @return The current endpoint of the <code>MLModel</code>.
     */
    public RealtimeEndpointInfo getEndpointInfo() {
        return this.endpointInfo;
    }

    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>.
     * </p>
     * 
     * @param endpointInfo
     *        The current endpoint of the <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withEndpointInfo(RealtimeEndpointInfo endpointInfo) {
        setEndpointInfo(endpointInfo);
        return this;
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list
     * is implemented as a map of key/value pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - Coefficient regularization L1
     * norm. It controls overfitting the data by penalizing large coefficients.
     * This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, specify a small value, such as 1.0E-04 or
     * 1.0E-08.
     * </p>
     * <p>
     * The value is a double that ranges from 0 to MAX_DOUBLE. The default is
     * not to use L1 normalization. The parameter cannot be used when
     * <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - Coefficient regularization L2
     * norm. It controls overfitting the data by penalizing large coefficients.
     * This tends to drive coefficients to small, nonzero values. If you use
     * this parameter, specify a small value, such as 1.0E-04 or 1.0E-08.
     * </p>
     * <p>
     * The valus is a double that ranges from 0 to MAX_DOUBLE. The default is
     * not to use L2 normalization. This cannot be used when <code>L1</code> is
     * specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - Number of times that the training process
     * traverses the observations to build the <code>MLModel</code>. The value
     * is an integer that ranges from 1 to 10000. The default value is 10.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size of the
     * model. Depending on the input data, the model size might affect
     * performance.
     * </p>
     * <p>
     * The value is an integer that ranges from 100000 to 2147483648. The
     * default value is 33554432.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of the training parameters in the <code>MLModel</code>.
     *         The list is implemented as a map of key/value pairs.</p>
     *         <p>
     *         The following is the current set of training parameters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sgd.l1RegularizationAmount</code> - Coefficient
     *         regularization L1 norm. It controls overfitting the data by
     *         penalizing large coefficients. This tends to drive coefficients
     *         to zero, resulting in a sparse feature set. If you use this
     *         parameter, specify a small value, such as 1.0E-04 or 1.0E-08.
     *         </p>
     *         <p>
     *         The value is a double that ranges from 0 to MAX_DOUBLE. The
     *         default is not to use L1 normalization. The parameter cannot be
     *         used when <code>L2</code> is specified. Use this parameter
     *         sparingly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.l2RegularizationAmount</code> - Coefficient
     *         regularization L2 norm. It controls overfitting the data by
     *         penalizing large coefficients. This tends to drive coefficients
     *         to small, nonzero values. If you use this parameter, specify a
     *         small value, such as 1.0E-04 or 1.0E-08.
     *         </p>
     *         <p>
     *         The valus is a double that ranges from 0 to MAX_DOUBLE. The
     *         default is not to use L2 normalization. This cannot be used when
     *         <code>L1</code> is specified. Use this parameter sparingly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.maxPasses</code> - Number of times that the training
     *         process traverses the observations to build the
     *         <code>MLModel</code>. The value is an integer that ranges from 1
     *         to 10000. The default value is 10.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size of
     *         the model. Depending on the input data, the model size might
     *         affect performance.
     *         </p>
     *         <p>
     *         The value is an integer that ranges from 100000 to 2147483648.
     *         The default value is 33554432.
     *         </p>
     *         </li>
     */
    public java.util.Map<String, String> getTrainingParameters() {
        if (trainingParameters == null) {
            trainingParameters = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return trainingParameters;
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list
     * is implemented as a map of key/value pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - Coefficient regularization L1
     * norm. It controls overfitting the data by penalizing large coefficients.
     * This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, specify a small value, such as 1.0E-04 or
     * 1.0E-08.
     * </p>
     * <p>
     * The value is a double that ranges from 0 to MAX_DOUBLE. The default is
     * not to use L1 normalization. The parameter cannot be used when
     * <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - Coefficient regularization L2
     * norm. It controls overfitting the data by penalizing large coefficients.
     * This tends to drive coefficients to small, nonzero values. If you use
     * this parameter, specify a small value, such as 1.0E-04 or 1.0E-08.
     * </p>
     * <p>
     * The valus is a double that ranges from 0 to MAX_DOUBLE. The default is
     * not to use L2 normalization. This cannot be used when <code>L1</code> is
     * specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - Number of times that the training process
     * traverses the observations to build the <code>MLModel</code>. The value
     * is an integer that ranges from 1 to 10000. The default value is 10.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size of the
     * model. Depending on the input data, the model size might affect
     * performance.
     * </p>
     * <p>
     * The value is an integer that ranges from 100000 to 2147483648. The
     * default value is 33554432.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trainingParameters
     *        A list of the training parameters in the <code>MLModel</code>. The
     *        list is implemented as a map of key/value pairs.</p>
     *        <p>
     *        The following is the current set of training parameters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sgd.l1RegularizationAmount</code> - Coefficient
     *        regularization L1 norm. It controls overfitting the data by
     *        penalizing large coefficients. This tends to drive coefficients to
     *        zero, resulting in a sparse feature set. If you use this
     *        parameter, specify a small value, such as 1.0E-04 or 1.0E-08.
     *        </p>
     *        <p>
     *        The value is a double that ranges from 0 to MAX_DOUBLE. The
     *        default is not to use L1 normalization. The parameter cannot be
     *        used when <code>L2</code> is specified. Use this parameter
     *        sparingly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.l2RegularizationAmount</code> - Coefficient
     *        regularization L2 norm. It controls overfitting the data by
     *        penalizing large coefficients. This tends to drive coefficients to
     *        small, nonzero values. If you use this parameter, specify a small
     *        value, such as 1.0E-04 or 1.0E-08.
     *        </p>
     *        <p>
     *        The valus is a double that ranges from 0 to MAX_DOUBLE. The
     *        default is not to use L2 normalization. This cannot be used when
     *        <code>L1</code> is specified. Use this parameter sparingly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.maxPasses</code> - Number of times that the training
     *        process traverses the observations to build the
     *        <code>MLModel</code>. The value is an integer that ranges from 1
     *        to 10000. The default value is 10.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size of
     *        the model. Depending on the input data, the model size might
     *        affect performance.
     *        </p>
     *        <p>
     *        The value is an integer that ranges from 100000 to 2147483648. The
     *        default value is 33554432.
     *        </p>
     *        </li>
     */
    public void setTrainingParameters(
            java.util.Map<String, String> trainingParameters) {
        this.trainingParameters = trainingParameters == null ? null
                : new com.amazonaws.internal.SdkInternalMap<String, String>(
                        trainingParameters);
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list
     * is implemented as a map of key/value pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - Coefficient regularization L1
     * norm. It controls overfitting the data by penalizing large coefficients.
     * This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, specify a small value, such as 1.0E-04 or
     * 1.0E-08.
     * </p>
     * <p>
     * The value is a double that ranges from 0 to MAX_DOUBLE. The default is
     * not to use L1 normalization. The parameter cannot be used when
     * <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - Coefficient regularization L2
     * norm. It controls overfitting the data by penalizing large coefficients.
     * This tends to drive coefficients to small, nonzero values. If you use
     * this parameter, specify a small value, such as 1.0E-04 or 1.0E-08.
     * </p>
     * <p>
     * The valus is a double that ranges from 0 to MAX_DOUBLE. The default is
     * not to use L2 normalization. This cannot be used when <code>L1</code> is
     * specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - Number of times that the training process
     * traverses the observations to build the <code>MLModel</code>. The value
     * is an integer that ranges from 1 to 10000. The default value is 10.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size of the
     * model. Depending on the input data, the model size might affect
     * performance.
     * </p>
     * <p>
     * The value is an integer that ranges from 100000 to 2147483648. The
     * default value is 33554432.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trainingParameters
     *        A list of the training parameters in the <code>MLModel</code>. The
     *        list is implemented as a map of key/value pairs.</p>
     *        <p>
     *        The following is the current set of training parameters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sgd.l1RegularizationAmount</code> - Coefficient
     *        regularization L1 norm. It controls overfitting the data by
     *        penalizing large coefficients. This tends to drive coefficients to
     *        zero, resulting in a sparse feature set. If you use this
     *        parameter, specify a small value, such as 1.0E-04 or 1.0E-08.
     *        </p>
     *        <p>
     *        The value is a double that ranges from 0 to MAX_DOUBLE. The
     *        default is not to use L1 normalization. The parameter cannot be
     *        used when <code>L2</code> is specified. Use this parameter
     *        sparingly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.l2RegularizationAmount</code> - Coefficient
     *        regularization L2 norm. It controls overfitting the data by
     *        penalizing large coefficients. This tends to drive coefficients to
     *        small, nonzero values. If you use this parameter, specify a small
     *        value, such as 1.0E-04 or 1.0E-08.
     *        </p>
     *        <p>
     *        The valus is a double that ranges from 0 to MAX_DOUBLE. The
     *        default is not to use L2 normalization. This cannot be used when
     *        <code>L1</code> is specified. Use this parameter sparingly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.maxPasses</code> - Number of times that the training
     *        process traverses the observations to build the
     *        <code>MLModel</code>. The value is an integer that ranges from 1
     *        to 10000. The default value is 10.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size of
     *        the model. Depending on the input data, the model size might
     *        affect performance.
     *        </p>
     *        <p>
     *        The value is an integer that ranges from 100000 to 2147483648. The
     *        default value is 33554432.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withTrainingParameters(
            java.util.Map<String, String> trainingParameters) {
        setTrainingParameters(trainingParameters);
        return this;
    }

    public MLModel addTrainingParametersEntry(String key, String value) {
        if (null == this.trainingParameters) {
            this.trainingParameters = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.trainingParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.trainingParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TrainingParameters. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public MLModel clearTrainingParametersEntries() {
        this.trainingParameters = null;
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
    public MLModel withInputDataLocationS3(String inputDataLocationS3) {
        setInputDataLocationS3(inputDataLocationS3);
        return this;
    }

    /**
     * <p>
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported:
     * </p>
     * <ul>
     * <li>SGD -- Stochastic gradient descent. The goal of SGD is to minimize
     * the gradient of the loss function.</li>
     * </ul>
     * 
     * @param algorithm
     *        The algorithm used to train the <code>MLModel</code>. The
     *        following algorithm is supported:</p>
     *        <ul>
     *        <li>SGD -- Stochastic gradient descent. The goal of SGD is to
     *        minimize the gradient of the loss function.</li>
     * @see Algorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * <p>
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported:
     * </p>
     * <ul>
     * <li>SGD -- Stochastic gradient descent. The goal of SGD is to minimize
     * the gradient of the loss function.</li>
     * </ul>
     * 
     * @return The algorithm used to train the <code>MLModel</code>. The
     *         following algorithm is supported:</p>
     *         <ul>
     *         <li>SGD -- Stochastic gradient descent. The goal of SGD is to
     *         minimize the gradient of the loss function.</li>
     * @see Algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * <p>
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported:
     * </p>
     * <ul>
     * <li>SGD -- Stochastic gradient descent. The goal of SGD is to minimize
     * the gradient of the loss function.</li>
     * </ul>
     * 
     * @param algorithm
     *        The algorithm used to train the <code>MLModel</code>. The
     *        following algorithm is supported:</p>
     *        <ul>
     *        <li>SGD -- Stochastic gradient descent. The goal of SGD is to
     *        minimize the gradient of the loss function.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Algorithm
     */
    public MLModel withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported:
     * </p>
     * <ul>
     * <li>SGD -- Stochastic gradient descent. The goal of SGD is to minimize
     * the gradient of the loss function.</li>
     * </ul>
     * 
     * @param algorithm
     *        The algorithm used to train the <code>MLModel</code>. The
     *        following algorithm is supported:</p>
     *        <ul>
     *        <li>SGD -- Stochastic gradient descent. The goal of SGD is to
     *        minimize the gradient of the loss function.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Algorithm
     */
    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm.toString();
    }

    /**
     * <p>
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported:
     * </p>
     * <ul>
     * <li>SGD -- Stochastic gradient descent. The goal of SGD is to minimize
     * the gradient of the loss function.</li>
     * </ul>
     * 
     * @param algorithm
     *        The algorithm used to train the <code>MLModel</code>. The
     *        following algorithm is supported:</p>
     *        <ul>
     *        <li>SGD -- Stochastic gradient descent. The goal of SGD is to
     *        minimize the gradient of the loss function.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Algorithm
     */
    public MLModel withAlgorithm(Algorithm algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION - Produces a numeric result. For example,
     * "What listing price should a house have?".</li>
     * <li>BINARY - Produces one of two possible results. For example,
     * "Is this a child-friendly web site?".</li>
     * <li>MULTICLASS - Produces more than two possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * </ul>
     * 
     * @param mLModelType
     *        Identifies the <code>MLModel</code> category. The following are
     *        the available types:</p>
     *        <ul>
     *        <li>REGRESSION - Produces a numeric result. For example,
     *        "What listing price should a house have?".</li>
     *        <li>BINARY - Produces one of two possible results. For example,
     *        "Is this a child-friendly web site?".</li>
     *        <li>MULTICLASS - Produces more than two possible results. For
     *        example, "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * @see MLModelType
     */
    public void setMLModelType(String mLModelType) {
        this.mLModelType = mLModelType;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION - Produces a numeric result. For example,
     * "What listing price should a house have?".</li>
     * <li>BINARY - Produces one of two possible results. For example,
     * "Is this a child-friendly web site?".</li>
     * <li>MULTICLASS - Produces more than two possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * </ul>
     * 
     * @return Identifies the <code>MLModel</code> category. The following are
     *         the available types:</p>
     *         <ul>
     *         <li>REGRESSION - Produces a numeric result. For example,
     *         "What listing price should a house have?".</li>
     *         <li>BINARY - Produces one of two possible results. For example,
     *         "Is this a child-friendly web site?".</li>
     *         <li>MULTICLASS - Produces more than two possible results. For
     *         example, "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * @see MLModelType
     */
    public String getMLModelType() {
        return this.mLModelType;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION - Produces a numeric result. For example,
     * "What listing price should a house have?".</li>
     * <li>BINARY - Produces one of two possible results. For example,
     * "Is this a child-friendly web site?".</li>
     * <li>MULTICLASS - Produces more than two possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * </ul>
     * 
     * @param mLModelType
     *        Identifies the <code>MLModel</code> category. The following are
     *        the available types:</p>
     *        <ul>
     *        <li>REGRESSION - Produces a numeric result. For example,
     *        "What listing price should a house have?".</li>
     *        <li>BINARY - Produces one of two possible results. For example,
     *        "Is this a child-friendly web site?".</li>
     *        <li>MULTICLASS - Produces more than two possible results. For
     *        example, "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MLModelType
     */
    public MLModel withMLModelType(String mLModelType) {
        setMLModelType(mLModelType);
        return this;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION - Produces a numeric result. For example,
     * "What listing price should a house have?".</li>
     * <li>BINARY - Produces one of two possible results. For example,
     * "Is this a child-friendly web site?".</li>
     * <li>MULTICLASS - Produces more than two possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * </ul>
     * 
     * @param mLModelType
     *        Identifies the <code>MLModel</code> category. The following are
     *        the available types:</p>
     *        <ul>
     *        <li>REGRESSION - Produces a numeric result. For example,
     *        "What listing price should a house have?".</li>
     *        <li>BINARY - Produces one of two possible results. For example,
     *        "Is this a child-friendly web site?".</li>
     *        <li>MULTICLASS - Produces more than two possible results. For
     *        example, "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MLModelType
     */
    public void setMLModelType(MLModelType mLModelType) {
        this.mLModelType = mLModelType.toString();
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION - Produces a numeric result. For example,
     * "What listing price should a house have?".</li>
     * <li>BINARY - Produces one of two possible results. For example,
     * "Is this a child-friendly web site?".</li>
     * <li>MULTICLASS - Produces more than two possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * </ul>
     * 
     * @param mLModelType
     *        Identifies the <code>MLModel</code> category. The following are
     *        the available types:</p>
     *        <ul>
     *        <li>REGRESSION - Produces a numeric result. For example,
     *        "What listing price should a house have?".</li>
     *        <li>BINARY - Produces one of two possible results. For example,
     *        "Is this a child-friendly web site?".</li>
     *        <li>MULTICLASS - Produces more than two possible results. For
     *        example, "Is this a HIGH, LOW or MEDIUM risk trade?".</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MLModelType
     */
    public MLModel withMLModelType(MLModelType mLModelType) {
        setMLModelType(mLModelType);
        return this;
    }

    /**
     * @param scoreThreshold
     */
    public void setScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }

    /**
     * @return
     */
    public Float getScoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * @param scoreThreshold
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withScoreThreshold(Float scoreThreshold) {
        setScoreThreshold(scoreThreshold);
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The
     * time is expressed in epoch time.
     * </p>
     * 
     * @param scoreThresholdLastUpdatedAt
     *        The time of the most recent edit to the
     *        <code>ScoreThreshold</code>. The time is expressed in epoch time.
     */
    public void setScoreThresholdLastUpdatedAt(
            java.util.Date scoreThresholdLastUpdatedAt) {
        this.scoreThresholdLastUpdatedAt = scoreThresholdLastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The
     * time is expressed in epoch time.
     * </p>
     * 
     * @return The time of the most recent edit to the
     *         <code>ScoreThreshold</code>. The time is expressed in epoch time.
     */
    public java.util.Date getScoreThresholdLastUpdatedAt() {
        return this.scoreThresholdLastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The
     * time is expressed in epoch time.
     * </p>
     * 
     * @param scoreThresholdLastUpdatedAt
     *        The time of the most recent edit to the
     *        <code>ScoreThreshold</code>. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withScoreThresholdLastUpdatedAt(
            java.util.Date scoreThresholdLastUpdatedAt) {
        setScoreThresholdLastUpdatedAt(scoreThresholdLastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about accessing the
     *        <code>MLModel</code>.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * </p>
     * 
     * @return A description of the most recent details about accessing the
     *         <code>MLModel</code>.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about accessing the
     *        <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MLModel withMessage(String message) {
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
        if (getMLModelId() != null)
            sb.append("MLModelId: " + getMLModelId() + ",");
        if (getTrainingDataSourceId() != null)
            sb.append("TrainingDataSourceId: " + getTrainingDataSourceId()
                    + ",");
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
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: " + getSizeInBytes() + ",");
        if (getEndpointInfo() != null)
            sb.append("EndpointInfo: " + getEndpointInfo() + ",");
        if (getTrainingParameters() != null)
            sb.append("TrainingParameters: " + getTrainingParameters() + ",");
        if (getInputDataLocationS3() != null)
            sb.append("InputDataLocationS3: " + getInputDataLocationS3() + ",");
        if (getAlgorithm() != null)
            sb.append("Algorithm: " + getAlgorithm() + ",");
        if (getMLModelType() != null)
            sb.append("MLModelType: " + getMLModelType() + ",");
        if (getScoreThreshold() != null)
            sb.append("ScoreThreshold: " + getScoreThreshold() + ",");
        if (getScoreThresholdLastUpdatedAt() != null)
            sb.append("ScoreThresholdLastUpdatedAt: "
                    + getScoreThresholdLastUpdatedAt() + ",");
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

        if (obj instanceof MLModel == false)
            return false;
        MLModel other = (MLModel) obj;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null
                && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getTrainingDataSourceId() == null
                ^ this.getTrainingDataSourceId() == null)
            return false;
        if (other.getTrainingDataSourceId() != null
                && other.getTrainingDataSourceId().equals(
                        this.getTrainingDataSourceId()) == false)
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
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null
                && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        if (other.getEndpointInfo() == null ^ this.getEndpointInfo() == null)
            return false;
        if (other.getEndpointInfo() != null
                && other.getEndpointInfo().equals(this.getEndpointInfo()) == false)
            return false;
        if (other.getTrainingParameters() == null
                ^ this.getTrainingParameters() == null)
            return false;
        if (other.getTrainingParameters() != null
                && other.getTrainingParameters().equals(
                        this.getTrainingParameters()) == false)
            return false;
        if (other.getInputDataLocationS3() == null
                ^ this.getInputDataLocationS3() == null)
            return false;
        if (other.getInputDataLocationS3() != null
                && other.getInputDataLocationS3().equals(
                        this.getInputDataLocationS3()) == false)
            return false;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null
                && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getMLModelType() == null ^ this.getMLModelType() == null)
            return false;
        if (other.getMLModelType() != null
                && other.getMLModelType().equals(this.getMLModelType()) == false)
            return false;
        if (other.getScoreThreshold() == null
                ^ this.getScoreThreshold() == null)
            return false;
        if (other.getScoreThreshold() != null
                && other.getScoreThreshold().equals(this.getScoreThreshold()) == false)
            return false;
        if (other.getScoreThresholdLastUpdatedAt() == null
                ^ this.getScoreThresholdLastUpdatedAt() == null)
            return false;
        if (other.getScoreThresholdLastUpdatedAt() != null
                && other.getScoreThresholdLastUpdatedAt().equals(
                        this.getScoreThresholdLastUpdatedAt()) == false)
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

        hashCode = prime * hashCode
                + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingDataSourceId() == null) ? 0
                        : getTrainingDataSourceId().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getEndpointInfo() == null) ? 0 : getEndpointInfo()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingParameters() == null) ? 0
                        : getTrainingParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getInputDataLocationS3() == null) ? 0
                        : getInputDataLocationS3().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime
                * hashCode
                + ((getMLModelType() == null) ? 0 : getMLModelType().hashCode());
        hashCode = prime
                * hashCode
                + ((getScoreThreshold() == null) ? 0 : getScoreThreshold()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getScoreThresholdLastUpdatedAt() == null) ? 0
                        : getScoreThresholdLastUpdatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public MLModel clone() {
        try {
            return (MLModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}