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
 * Represents the output of a <code>GetMLModel</code> operation, and provides detailed information about a
 * <code>MLModel</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The MLModel ID<?oxy_insert_start author="annbech" timestamp="20160328T151251-0700">,<?oxy_insert_end> which is
     * same as the <code>MLModelId</code> in the request.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * The ID of the training <code>DataSource</code>.
     * </p>
     */
    private String trainingDataSourceId;
    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The account type can be either an AWS root
     * account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     */
    private String createdByIamUser;
    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed in epoch time.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is expressed in epoch time.
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
     * The current status of the <code>MLModel</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * </ul>
     */
    private String status;

    private Long sizeInBytes;
    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>
     * </p>
     */
    private RealtimeEndpointInfo endpointInfo;
    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of key-value
     * pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input data, the
     * size of the model might affect its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value is
     * <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to build
     * the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to <code>10000</code>. The
     * default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling data improves a model's
     * ability to find the optimal solution for a variety of data types. The valid values are <code>auto</code> and
     * <code>none</code>. The default value is <code>none</code>. We strongly recommend that you shuffle your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L1
     * normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this
     * parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L2
     * normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> trainingParameters;
    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
     * </p>
     */
    private String inputDataLocationS3;
    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     */
    private String mLModelType;
    /**
     * <p>
     * The scoring threshold is used in binary classification <code>MLModel</code><?oxy_insert_start author="laurama"
     * timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the boundary between a positive prediction
     * and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the threshold receive a positive result from the MLModel, such as
     * <code>true</code>. Output values less than the threshold receive a negative response from the MLModel, such as
     * <code>false</code>.
     * </p>
     */
    private Float scoreThreshold;
    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The time is expressed in epoch time.
     * </p>
     */
    private java.util.Date scoreThresholdLastUpdatedAt;
    /**
     * <p>
     * A link to the file that contains logs of the <code>CreateMLModel</code> operation.
     * </p>
     */
    private String logUri;
    /**
     * <p>
     * A description of the most recent details about accessing the <code>MLModel</code>.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the <code>MLModel</code>,
     * normalized and scaled on computation resources. <code>ComputeTime</code> is only available if the
     * <code>MLModel</code> is in the <code>COMPLETED</code> state.
     * </p>
     */
    private Long computeTime;
    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>COMPLETED</code> or
     * <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>MLModel</code> is in the
     * <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     */
    private java.util.Date finishedAt;
    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>INPROGRESS</code>.
     * <code>StartedAt</code> isn't available if the <code>MLModel</code> is in the <code>PENDING</code> state.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The recipe to use when training the <code>MLModel</code>. The <code>Recipe</code> provides detailed information
     * about the observation data to use during training, and manipulations to perform on the observation data during
     * training.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     */
    private String recipe;
    /**
     * <p>
     * The schema used by all of the data files referenced by the <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     */
    private String schema;

    /**
     * <p>
     * The MLModel ID<?oxy_insert_start author="annbech" timestamp="20160328T151251-0700">,<?oxy_insert_end> which is
     * same as the <code>MLModelId</code> in the request.
     * </p>
     * 
     * @param mLModelId
     *        The MLModel ID<?oxy_insert_start author="annbech" timestamp="20160328T151251-0700">,<?oxy_insert_end>
     *        which is same as the <code>MLModelId</code> in the request.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The MLModel ID<?oxy_insert_start author="annbech" timestamp="20160328T151251-0700">,<?oxy_insert_end> which is
     * same as the <code>MLModelId</code> in the request.
     * </p>
     * 
     * @return The MLModel ID<?oxy_insert_start author="annbech" timestamp="20160328T151251-0700">,<?oxy_insert_end>
     *         which is same as the <code>MLModelId</code> in the request.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * The MLModel ID<?oxy_insert_start author="annbech" timestamp="20160328T151251-0700">,<?oxy_insert_end> which is
     * same as the <code>MLModelId</code> in the request.
     * </p>
     * 
     * @param mLModelId
     *        The MLModel ID<?oxy_insert_start author="annbech" timestamp="20160328T151251-0700">,<?oxy_insert_end>
     *        which is same as the <code>MLModelId</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * The ID of the training <code>DataSource</code>.
     * </p>
     * 
     * @param trainingDataSourceId
     *        The ID of the training <code>DataSource</code>.
     */

    public void setTrainingDataSourceId(String trainingDataSourceId) {
        this.trainingDataSourceId = trainingDataSourceId;
    }

    /**
     * <p>
     * The ID of the training <code>DataSource</code>.
     * </p>
     * 
     * @return The ID of the training <code>DataSource</code>.
     */

    public String getTrainingDataSourceId() {
        return this.trainingDataSourceId;
    }

    /**
     * <p>
     * The ID of the training <code>DataSource</code>.
     * </p>
     * 
     * @param trainingDataSourceId
     *        The ID of the training <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withTrainingDataSourceId(String trainingDataSourceId) {
        setTrainingDataSourceId(trainingDataSourceId);
        return this;
    }

    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The account type can be either an AWS root
     * account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account from which the <code>MLModel</code> was created. The account type can be either an
     *        AWS root account or an AWS Identity and Access Management (IAM) user account.
     */

    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The account type can be either an AWS root
     * account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @return The AWS user account from which the <code>MLModel</code> was created. The account type can be either an
     *         AWS root account or an AWS Identity and Access Management (IAM) user account.
     */

    public String getCreatedByIamUser() {
        return this.createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The account type can be either an AWS root
     * account or an AWS Identity and Access Management (IAM) user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account from which the <code>MLModel</code> was created. The account type can be either an
     *        AWS root account or an AWS Identity and Access Management (IAM) user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withCreatedByIamUser(String createdByIamUser) {
        setCreatedByIamUser(createdByIamUser);
        return this;
    }

    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>MLModel</code> was created. The time is expressed in epoch time.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @return The time that the <code>MLModel</code> was created. The time is expressed in epoch time.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>MLModel</code> was created. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the <code>MLModel</code>. The time is expressed in epoch time.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @return The time of the most recent edit to the <code>MLModel</code>. The time is expressed in epoch time.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the <code>MLModel</code>. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>MLModel</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     *        <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The request is processing.</li>
     *        <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     *        <li> <code>COMPLETED</code> - The request completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * @see EntityStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * </ul>
     * 
     * @return The current status of the <code>MLModel</code>. This element can have one of the following values:</p>
     *         <ul>
     *         <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     *         <code>MLModel</code>.</li>
     *         <li> <code>INPROGRESS</code> - The request is processing.</li>
     *         <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     *         <li> <code>COMPLETED</code> - The request completed successfully.</li>
     *         <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * @see EntityStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>MLModel</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     *        <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The request is processing.</li>
     *        <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     *        <li> <code>COMPLETED</code> - The request completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatus
     */

    public GetMLModelResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>MLModel</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     *        <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The request is processing.</li>
     *        <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     *        <li> <code>COMPLETED</code> - The request completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * @see EntityStatus
     */

    public void setStatus(EntityStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     * <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * </ul>
     * 
     * @param status
     *        The current status of the <code>MLModel</code>. This element can have one of the following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted a request to describe a
     *        <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The request is processing.</li>
     *        <li> <code>FAILED</code> - The request did not run to completion. The ML model isn't usable.</li>
     *        <li> <code>COMPLETED</code> - The request completed successfully.</li>
     *        <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted. It isn't usable.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatus
     */

    public GetMLModelResult withStatus(EntityStatus status) {
        this.status = status.toString();
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withSizeInBytes(Long sizeInBytes) {
        setSizeInBytes(sizeInBytes);
        return this;
    }

    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>
     * </p>
     * 
     * @param endpointInfo
     *        The current endpoint of the <code>MLModel</code>
     */

    public void setEndpointInfo(RealtimeEndpointInfo endpointInfo) {
        this.endpointInfo = endpointInfo;
    }

    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>
     * </p>
     * 
     * @return The current endpoint of the <code>MLModel</code>
     */

    public RealtimeEndpointInfo getEndpointInfo() {
        return this.endpointInfo;
    }

    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>
     * </p>
     * 
     * @param endpointInfo
     *        The current endpoint of the <code>MLModel</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withEndpointInfo(RealtimeEndpointInfo endpointInfo) {
        setEndpointInfo(endpointInfo);
        return this;
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of key-value
     * pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input data, the
     * size of the model might affect its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value is
     * <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to build
     * the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to <code>10000</code>. The
     * default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling data improves a model's
     * ability to find the optimal solution for a variety of data types. The valid values are <code>auto</code> and
     * <code>none</code>. The default value is <code>none</code>. We strongly recommend that you shuffle your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L1
     * normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this
     * parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L2
     * normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of
     *         key-value pairs.</p>
     *         <p>
     *         The following is the current set of training parameters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input
     *         data, the size of the model might affect its performance.
     *         </p>
     *         <p>
     *         The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default
     *         value is <code>33554432</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to
     *         build the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to
     *         <code>10000</code>. The default value is <code>10</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling data improves a
     *         model's ability to find the optimal solution for a variety of data types. The valid values are
     *         <code>auto</code> and <code>none</code>. The default value is <code>none</code>. We strongly recommend
     *         that you shuffle your data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting
     *         the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a
     *         sparse feature set. If you use this parameter, start by specifying a small value, such as
     *         <code>1.0E-08</code>.
     *         </p>
     *         <p>
     *         The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *         use L1 normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter
     *         sparingly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting
     *         the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If
     *         you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     *         </p>
     *         <p>
     *         The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *         use L2 normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter
     *         sparingly.
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
     * A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of key-value
     * pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input data, the
     * size of the model might affect its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value is
     * <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to build
     * the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to <code>10000</code>. The
     * default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling data improves a model's
     * ability to find the optimal solution for a variety of data types. The valid values are <code>auto</code> and
     * <code>none</code>. The default value is <code>none</code>. We strongly recommend that you shuffle your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L1
     * normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this
     * parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L2
     * normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trainingParameters
     *        A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of
     *        key-value pairs.</p>
     *        <p>
     *        The following is the current set of training parameters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input
     *        data, the size of the model might affect its performance.
     *        </p>
     *        <p>
     *        The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value
     *        is <code>33554432</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to
     *        build the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to
     *        <code>10000</code>. The default value is <code>10</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling data improves a
     *        model's ability to find the optimal solution for a variety of data types. The valid values are
     *        <code>auto</code> and <code>none</code>. The default value is <code>none</code>. We strongly recommend
     *        that you shuffle your data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting
     *        the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse
     *        feature set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     *        </p>
     *        <p>
     *        The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *        use L1 normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter
     *        sparingly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting
     *        the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If
     *        you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     *        </p>
     *        <p>
     *        The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *        use L2 normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter
     *        sparingly.
     *        </p>
     *        </li>
     */

    public void setTrainingParameters(java.util.Map<String, String> trainingParameters) {
        this.trainingParameters = trainingParameters == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(trainingParameters);
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of key-value
     * pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input data, the
     * size of the model might affect its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value is
     * <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to build
     * the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to <code>10000</code>. The
     * default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling data improves a model's
     * ability to find the optimal solution for a variety of data types. The valid values are <code>auto</code> and
     * <code>none</code>. The default value is <code>none</code>. We strongly recommend that you shuffle your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L1
     * normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this
     * parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L2
     * normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trainingParameters
     *        A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of
     *        key-value pairs.</p>
     *        <p>
     *        The following is the current set of training parameters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input
     *        data, the size of the model might affect its performance.
     *        </p>
     *        <p>
     *        The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value
     *        is <code>33554432</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to
     *        build the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to
     *        <code>10000</code>. The default value is <code>10</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling data improves a
     *        model's ability to find the optimal solution for a variety of data types. The valid values are
     *        <code>auto</code> and <code>none</code>. The default value is <code>none</code>. We strongly recommend
     *        that you shuffle your data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting
     *        the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse
     *        feature set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     *        </p>
     *        <p>
     *        The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *        use L1 normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter
     *        sparingly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting
     *        the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If
     *        you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     *        </p>
     *        <p>
     *        The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *        use L2 normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter
     *        sparingly.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withTrainingParameters(java.util.Map<String, String> trainingParameters) {
        setTrainingParameters(trainingParameters);
        return this;
    }

    public GetMLModelResult addTrainingParametersEntry(String key, String value) {
        if (null == this.trainingParameters) {
            this.trainingParameters = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.trainingParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.trainingParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TrainingParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult clearTrainingParametersEntries() {
        this.trainingParameters = null;
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

    public GetMLModelResult withInputDataLocationS3(String inputDataLocationS3) {
        setInputDataLocationS3(inputDataLocationS3);
        return this;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * 
     * @param mLModelType
     *        Identifies the <code>MLModel</code> category. The following are the available types: </p>
     *        <ul>
     *        <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     *        <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     *        <li>MULTICLASS -- Produces one of several possible results. For example,
     *        "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * @see MLModelType
     */

    public void setMLModelType(String mLModelType) {
        this.mLModelType = mLModelType;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * 
     * @return Identifies the <code>MLModel</code> category. The following are the available types: </p>
     *         <ul>
     *         <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     *         <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     *         <li>MULTICLASS -- Produces one of several possible results. For example,
     *         "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * @see MLModelType
     */

    public String getMLModelType() {
        return this.mLModelType;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * 
     * @param mLModelType
     *        Identifies the <code>MLModel</code> category. The following are the available types: </p>
     *        <ul>
     *        <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     *        <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     *        <li>MULTICLASS -- Produces one of several possible results. For example,
     *        "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MLModelType
     */

    public GetMLModelResult withMLModelType(String mLModelType) {
        setMLModelType(mLModelType);
        return this;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * 
     * @param mLModelType
     *        Identifies the <code>MLModel</code> category. The following are the available types: </p>
     *        <ul>
     *        <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     *        <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     *        <li>MULTICLASS -- Produces one of several possible results. For example,
     *        "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * @see MLModelType
     */

    public void setMLModelType(MLModelType mLModelType) {
        withMLModelType(mLModelType);
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * 
     * @param mLModelType
     *        Identifies the <code>MLModel</code> category. The following are the available types: </p>
     *        <ul>
     *        <li>REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?"</li>
     *        <li>BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?"</li>
     *        <li>MULTICLASS -- Produces one of several possible results. For example,
     *        "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MLModelType
     */

    public GetMLModelResult withMLModelType(MLModelType mLModelType) {
        this.mLModelType = mLModelType.toString();
        return this;
    }

    /**
     * <p>
     * The scoring threshold is used in binary classification <code>MLModel</code><?oxy_insert_start author="laurama"
     * timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the boundary between a positive prediction
     * and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the threshold receive a positive result from the MLModel, such as
     * <code>true</code>. Output values less than the threshold receive a negative response from the MLModel, such as
     * <code>false</code>.
     * </p>
     * 
     * @param scoreThreshold
     *        The scoring threshold is used in binary classification <code>MLModel</code><?oxy_insert_start
     *        author="laurama" timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the boundary between
     *        a positive prediction and a negative prediction.</p>
     *        <p>
     *        Output values greater than or equal to the threshold receive a positive result from the MLModel, such as
     *        <code>true</code>. Output values less than the threshold receive a negative response from the MLModel,
     *        such as <code>false</code>.
     */

    public void setScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }

    /**
     * <p>
     * The scoring threshold is used in binary classification <code>MLModel</code><?oxy_insert_start author="laurama"
     * timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the boundary between a positive prediction
     * and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the threshold receive a positive result from the MLModel, such as
     * <code>true</code>. Output values less than the threshold receive a negative response from the MLModel, such as
     * <code>false</code>.
     * </p>
     * 
     * @return The scoring threshold is used in binary classification <code>MLModel</code><?oxy_insert_start
     *         author="laurama" timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the boundary between
     *         a positive prediction and a negative prediction.</p>
     *         <p>
     *         Output values greater than or equal to the threshold receive a positive result from the MLModel, such as
     *         <code>true</code>. Output values less than the threshold receive a negative response from the MLModel,
     *         such as <code>false</code>.
     */

    public Float getScoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * <p>
     * The scoring threshold is used in binary classification <code>MLModel</code><?oxy_insert_start author="laurama"
     * timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the boundary between a positive prediction
     * and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the threshold receive a positive result from the MLModel, such as
     * <code>true</code>. Output values less than the threshold receive a negative response from the MLModel, such as
     * <code>false</code>.
     * </p>
     * 
     * @param scoreThreshold
     *        The scoring threshold is used in binary classification <code>MLModel</code><?oxy_insert_start
     *        author="laurama" timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the boundary between
     *        a positive prediction and a negative prediction.</p>
     *        <p>
     *        Output values greater than or equal to the threshold receive a positive result from the MLModel, such as
     *        <code>true</code>. Output values less than the threshold receive a negative response from the MLModel,
     *        such as <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withScoreThreshold(Float scoreThreshold) {
        setScoreThreshold(scoreThreshold);
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @param scoreThresholdLastUpdatedAt
     *        The time of the most recent edit to the <code>ScoreThreshold</code>. The time is expressed in epoch time.
     */

    public void setScoreThresholdLastUpdatedAt(java.util.Date scoreThresholdLastUpdatedAt) {
        this.scoreThresholdLastUpdatedAt = scoreThresholdLastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @return The time of the most recent edit to the <code>ScoreThreshold</code>. The time is expressed in epoch time.
     */

    public java.util.Date getScoreThresholdLastUpdatedAt() {
        return this.scoreThresholdLastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The time is expressed in epoch time.
     * </p>
     * 
     * @param scoreThresholdLastUpdatedAt
     *        The time of the most recent edit to the <code>ScoreThreshold</code>. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withScoreThresholdLastUpdatedAt(java.util.Date scoreThresholdLastUpdatedAt) {
        setScoreThresholdLastUpdatedAt(scoreThresholdLastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * A link to the file that contains logs of the <code>CreateMLModel</code> operation.
     * </p>
     * 
     * @param logUri
     *        A link to the file that contains logs of the <code>CreateMLModel</code> operation.
     */

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * A link to the file that contains logs of the <code>CreateMLModel</code> operation.
     * </p>
     * 
     * @return A link to the file that contains logs of the <code>CreateMLModel</code> operation.
     */

    public String getLogUri() {
        return this.logUri;
    }

    /**
     * <p>
     * A link to the file that contains logs of the <code>CreateMLModel</code> operation.
     * </p>
     * 
     * @param logUri
     *        A link to the file that contains logs of the <code>CreateMLModel</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withLogUri(String logUri) {
        setLogUri(logUri);
        return this;
    }

    /**
     * <p>
     * A description of the most recent details about accessing the <code>MLModel</code>.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about accessing the <code>MLModel</code>.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the most recent details about accessing the <code>MLModel</code>.
     * </p>
     * 
     * @return A description of the most recent details about accessing the <code>MLModel</code>.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the most recent details about accessing the <code>MLModel</code>.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about accessing the <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the <code>MLModel</code>,
     * normalized and scaled on computation resources. <code>ComputeTime</code> is only available if the
     * <code>MLModel</code> is in the <code>COMPLETED</code> state.
     * </p>
     * 
     * @param computeTime
     *        The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the
     *        <code>MLModel</code>, normalized and scaled on computation resources. <code>ComputeTime</code> is only
     *        available if the <code>MLModel</code> is in the <code>COMPLETED</code> state.
     */

    public void setComputeTime(Long computeTime) {
        this.computeTime = computeTime;
    }

    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the <code>MLModel</code>,
     * normalized and scaled on computation resources. <code>ComputeTime</code> is only available if the
     * <code>MLModel</code> is in the <code>COMPLETED</code> state.
     * </p>
     * 
     * @return The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the
     *         <code>MLModel</code>, normalized and scaled on computation resources. <code>ComputeTime</code> is only
     *         available if the <code>MLModel</code> is in the <code>COMPLETED</code> state.
     */

    public Long getComputeTime() {
        return this.computeTime;
    }

    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the <code>MLModel</code>,
     * normalized and scaled on computation resources. <code>ComputeTime</code> is only available if the
     * <code>MLModel</code> is in the <code>COMPLETED</code> state.
     * </p>
     * 
     * @param computeTime
     *        The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the
     *        <code>MLModel</code>, normalized and scaled on computation resources. <code>ComputeTime</code> is only
     *        available if the <code>MLModel</code> is in the <code>COMPLETED</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withComputeTime(Long computeTime) {
        setComputeTime(computeTime);
        return this;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>COMPLETED</code> or
     * <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>MLModel</code> is in the
     * <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     * 
     * @param finishedAt
     *        The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>COMPLETED</code> or
     *        <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>MLModel</code> is in the
     *        <code>COMPLETED</code> or <code>FAILED</code> state.
     */

    public void setFinishedAt(java.util.Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>COMPLETED</code> or
     * <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>MLModel</code> is in the
     * <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     * 
     * @return The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>COMPLETED</code> or
     *         <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>MLModel</code> is in the
     *         <code>COMPLETED</code> or <code>FAILED</code> state.
     */

    public java.util.Date getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>COMPLETED</code> or
     * <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>MLModel</code> is in the
     * <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     * 
     * @param finishedAt
     *        The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>COMPLETED</code> or
     *        <code>FAILED</code>. <code>FinishedAt</code> is only available when the <code>MLModel</code> is in the
     *        <code>COMPLETED</code> or <code>FAILED</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withFinishedAt(java.util.Date finishedAt) {
        setFinishedAt(finishedAt);
        return this;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>INPROGRESS</code>.
     * <code>StartedAt</code> isn't available if the <code>MLModel</code> is in the <code>PENDING</code> state.
     * </p>
     * 
     * @param startedAt
     *        The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>INPROGRESS</code>.
     *        <code>StartedAt</code> isn't available if the <code>MLModel</code> is in the <code>PENDING</code> state.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>INPROGRESS</code>.
     * <code>StartedAt</code> isn't available if the <code>MLModel</code> is in the <code>PENDING</code> state.
     * </p>
     * 
     * @return The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>INPROGRESS</code>.
     *         <code>StartedAt</code> isn't available if the <code>MLModel</code> is in the <code>PENDING</code> state.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>INPROGRESS</code>.
     * <code>StartedAt</code> isn't available if the <code>MLModel</code> is in the <code>PENDING</code> state.
     * </p>
     * 
     * @param startedAt
     *        The epoch time when Amazon Machine Learning marked the <code>MLModel</code> as <code>INPROGRESS</code>.
     *        <code>StartedAt</code> isn't available if the <code>MLModel</code> is in the <code>PENDING</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The recipe to use when training the <code>MLModel</code>. The <code>Recipe</code> provides detailed information
     * about the observation data to use during training, and manipulations to perform on the observation data during
     * training.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * 
     * @param recipe
     *        The recipe to use when training the <code>MLModel</code>. The <code>Recipe</code> provides detailed
     *        information about the observation data to use during training, and manipulations to perform on the
     *        observation data during training.</p> <note><title>Note</title>
     *        <p>
     *        This parameter is provided as part of the verbose format.
     *        </p>
     */

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    /**
     * <p>
     * The recipe to use when training the <code>MLModel</code>. The <code>Recipe</code> provides detailed information
     * about the observation data to use during training, and manipulations to perform on the observation data during
     * training.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * 
     * @return The recipe to use when training the <code>MLModel</code>. The <code>Recipe</code> provides detailed
     *         information about the observation data to use during training, and manipulations to perform on the
     *         observation data during training.</p> <note><title>Note</title>
     *         <p>
     *         This parameter is provided as part of the verbose format.
     *         </p>
     */

    public String getRecipe() {
        return this.recipe;
    }

    /**
     * <p>
     * The recipe to use when training the <code>MLModel</code>. The <code>Recipe</code> provides detailed information
     * about the observation data to use during training, and manipulations to perform on the observation data during
     * training.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * 
     * @param recipe
     *        The recipe to use when training the <code>MLModel</code>. The <code>Recipe</code> provides detailed
     *        information about the observation data to use during training, and manipulations to perform on the
     *        observation data during training.</p> <note><title>Note</title>
     *        <p>
     *        This parameter is provided as part of the verbose format.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withRecipe(String recipe) {
        setRecipe(recipe);
        return this;
    }

    /**
     * <p>
     * The schema used by all of the data files referenced by the <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * 
     * @param schema
     *        The schema used by all of the data files referenced by the <code>DataSource</code>.</p>
     *        <note><title>Note</title>
     *        <p>
     *        This parameter is provided as part of the verbose format.
     *        </p>
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema used by all of the data files referenced by the <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * 
     * @return The schema used by all of the data files referenced by the <code>DataSource</code>.</p>
     *         <note><title>Note</title>
     *         <p>
     *         This parameter is provided as part of the verbose format.
     *         </p>
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema used by all of the data files referenced by the <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * 
     * @param schema
     *        The schema used by all of the data files referenced by the <code>DataSource</code>.</p>
     *        <note><title>Note</title>
     *        <p>
     *        This parameter is provided as part of the verbose format.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLModelResult withSchema(String schema) {
        setSchema(schema);
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
        if (getMLModelId() != null)
            sb.append("MLModelId: ").append(getMLModelId()).append(",");
        if (getTrainingDataSourceId() != null)
            sb.append("TrainingDataSourceId: ").append(getTrainingDataSourceId()).append(",");
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
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: ").append(getSizeInBytes()).append(",");
        if (getEndpointInfo() != null)
            sb.append("EndpointInfo: ").append(getEndpointInfo()).append(",");
        if (getTrainingParameters() != null)
            sb.append("TrainingParameters: ").append(getTrainingParameters()).append(",");
        if (getInputDataLocationS3() != null)
            sb.append("InputDataLocationS3: ").append(getInputDataLocationS3()).append(",");
        if (getMLModelType() != null)
            sb.append("MLModelType: ").append(getMLModelType()).append(",");
        if (getScoreThreshold() != null)
            sb.append("ScoreThreshold: ").append(getScoreThreshold()).append(",");
        if (getScoreThresholdLastUpdatedAt() != null)
            sb.append("ScoreThresholdLastUpdatedAt: ").append(getScoreThresholdLastUpdatedAt()).append(",");
        if (getLogUri() != null)
            sb.append("LogUri: ").append(getLogUri()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getComputeTime() != null)
            sb.append("ComputeTime: ").append(getComputeTime()).append(",");
        if (getFinishedAt() != null)
            sb.append("FinishedAt: ").append(getFinishedAt()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getRecipe() != null)
            sb.append("Recipe: ").append(getRecipe()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLModelResult == false)
            return false;
        GetMLModelResult other = (GetMLModelResult) obj;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getTrainingDataSourceId() == null ^ this.getTrainingDataSourceId() == null)
            return false;
        if (other.getTrainingDataSourceId() != null && other.getTrainingDataSourceId().equals(this.getTrainingDataSourceId()) == false)
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
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        if (other.getEndpointInfo() == null ^ this.getEndpointInfo() == null)
            return false;
        if (other.getEndpointInfo() != null && other.getEndpointInfo().equals(this.getEndpointInfo()) == false)
            return false;
        if (other.getTrainingParameters() == null ^ this.getTrainingParameters() == null)
            return false;
        if (other.getTrainingParameters() != null && other.getTrainingParameters().equals(this.getTrainingParameters()) == false)
            return false;
        if (other.getInputDataLocationS3() == null ^ this.getInputDataLocationS3() == null)
            return false;
        if (other.getInputDataLocationS3() != null && other.getInputDataLocationS3().equals(this.getInputDataLocationS3()) == false)
            return false;
        if (other.getMLModelType() == null ^ this.getMLModelType() == null)
            return false;
        if (other.getMLModelType() != null && other.getMLModelType().equals(this.getMLModelType()) == false)
            return false;
        if (other.getScoreThreshold() == null ^ this.getScoreThreshold() == null)
            return false;
        if (other.getScoreThreshold() != null && other.getScoreThreshold().equals(this.getScoreThreshold()) == false)
            return false;
        if (other.getScoreThresholdLastUpdatedAt() == null ^ this.getScoreThresholdLastUpdatedAt() == null)
            return false;
        if (other.getScoreThresholdLastUpdatedAt() != null && other.getScoreThresholdLastUpdatedAt().equals(this.getScoreThresholdLastUpdatedAt()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
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
        if (other.getRecipe() == null ^ this.getRecipe() == null)
            return false;
        if (other.getRecipe() != null && other.getRecipe().equals(this.getRecipe()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataSourceId() == null) ? 0 : getTrainingDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getCreatedByIamUser() == null) ? 0 : getCreatedByIamUser().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getEndpointInfo() == null) ? 0 : getEndpointInfo().hashCode());
        hashCode = prime * hashCode + ((getTrainingParameters() == null) ? 0 : getTrainingParameters().hashCode());
        hashCode = prime * hashCode + ((getInputDataLocationS3() == null) ? 0 : getInputDataLocationS3().hashCode());
        hashCode = prime * hashCode + ((getMLModelType() == null) ? 0 : getMLModelType().hashCode());
        hashCode = prime * hashCode + ((getScoreThreshold() == null) ? 0 : getScoreThreshold().hashCode());
        hashCode = prime * hashCode + ((getScoreThresholdLastUpdatedAt() == null) ? 0 : getScoreThresholdLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getComputeTime() == null) ? 0 : getComputeTime().hashCode());
        hashCode = prime * hashCode + ((getFinishedAt() == null) ? 0 : getFinishedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getRecipe() == null) ? 0 : getRecipe().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public GetMLModelResult clone() {
        try {
            return (GetMLModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
