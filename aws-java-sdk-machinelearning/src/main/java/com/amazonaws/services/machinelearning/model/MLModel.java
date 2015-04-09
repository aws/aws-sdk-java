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
 * Represents the output of a GetMLModel operation.
 * </p>
 * <p>
 * The content consists of the detailed metadata and the current status
 * of the <code>MLModel</code> .
 * </p>
 */
public class MLModel implements Serializable, Cloneable {

    /**
     * The ID assigned to the <code>MLModel</code> at creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * The ID of the training <code>DataSource</code>. The
     * <a>CreateMLModel</a> operation uses the
     * <code>TrainingDataSourceId</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String trainingDataSourceId;

    /**
     * The AWS user account from which the <code>MLModel</code> was created.
     * The account type can be either an AWS root account or an AWS Identity
     * and Access Management (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     */
    private String createdByIamUser;

    /**
     * The time that the <code>MLModel</code> was created. The time is
     * expressed in epoch time.
     */
    private java.util.Date createdAt;

    /**
     * The time of the most recent edit to the <code>MLModel</code>. The time
     * is expressed in epoch time.
     */
    private java.util.Date lastUpdatedAt;

    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String name;

    /**
     * The current status of an <code>MLModel</code>. This element can have
     * one of the following values: <ul> <li>PENDING - Amazon Machine
     * Learning (Amazon ML) submitted a request to create an
     * <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     * underway.</li> <li>FAILED - The request to create an
     * <code>MLModel</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     */
    private String status;

    /**
     * Long integer type that is a 64-bit signed number.
     */
    private Long sizeInBytes;

    /**
     * The current endpoint of the <code>MLModel</code>.
     */
    private RealtimeEndpointInfo endpointInfo;

    /**
     * A list of the training parameters in the <code>MLModel</code>. The
     * list is implemented as a map of key/value pairs. <p>The following is
     * the current set of training parameters: <ul>
     * <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     * regularization L1 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to zero,
     * resulting in a sparse feature set. If you use this parameter, specify
     * a small value, such as 1.0E-04 or 1.0E-08. <p>The value is a double
     * that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     * normalization. The parameter cannot be used when <code>L2</code> is
     * specified. Use this parameter sparingly.</li>
     * <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     * regularization L2 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to small, nonzero
     * values. If you use this parameter, specify a small value, such as
     * 1.0E-04 or 1.0E-08. <p>The valus is a double that ranges from 0 to
     * MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     * used when <code>L1</code> is specified. Use this parameter
     * sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     * that the training process traverses the observations to build the
     * <code>MLModel</code>. The value is an integer that ranges from 1 to
     * 10000. The default value is 10. </li>
     * <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     * of the model. Depending on the input data, the model size might affect
     * performance. <p> The value is an integer that ranges from 100000 to
     * 2147483648. The default value is 33554432. </li> </ul>
     */
    private java.util.Map<String,String> trainingParameters;

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
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     * The goal of SGD is to minimize the gradient of the loss function.
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sgd
     */
    private String algorithm;

    /**
     * Identifies the <code>MLModel</code> category. The following are the
     * available types: <ul> <li>REGRESSION - Produces a numeric result. For
     * example, "What listing price should a house have?".</li> <li>BINARY -
     * Produces one of two possible results. For example, "Is this a
     * child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     * two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     * trade?".</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     */
    private String mLModelType;

    private Float scoreThreshold;

    /**
     * The time of the most recent edit to the <code>ScoreThreshold</code>.
     * The time is expressed in epoch time.
     */
    private java.util.Date scoreThresholdLastUpdatedAt;

    /**
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     */
    private String message;

    /**
     * The ID assigned to the <code>MLModel</code> at creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID assigned to the <code>MLModel</code> at creation.
     */
    public String getMLModelId() {
        return mLModelId;
    }
    
    /**
     * The ID assigned to the <code>MLModel</code> at creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID assigned to the <code>MLModel</code> at creation.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }
    
    /**
     * The ID assigned to the <code>MLModel</code> at creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID assigned to the <code>MLModel</code> at creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * The ID of the training <code>DataSource</code>. The
     * <a>CreateMLModel</a> operation uses the
     * <code>TrainingDataSourceId</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID of the training <code>DataSource</code>. The
     *         <a>CreateMLModel</a> operation uses the
     *         <code>TrainingDataSourceId</code>.
     */
    public String getTrainingDataSourceId() {
        return trainingDataSourceId;
    }
    
    /**
     * The ID of the training <code>DataSource</code>. The
     * <a>CreateMLModel</a> operation uses the
     * <code>TrainingDataSourceId</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param trainingDataSourceId The ID of the training <code>DataSource</code>. The
     *         <a>CreateMLModel</a> operation uses the
     *         <code>TrainingDataSourceId</code>.
     */
    public void setTrainingDataSourceId(String trainingDataSourceId) {
        this.trainingDataSourceId = trainingDataSourceId;
    }
    
    /**
     * The ID of the training <code>DataSource</code>. The
     * <a>CreateMLModel</a> operation uses the
     * <code>TrainingDataSourceId</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param trainingDataSourceId The ID of the training <code>DataSource</code>. The
     *         <a>CreateMLModel</a> operation uses the
     *         <code>TrainingDataSourceId</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withTrainingDataSourceId(String trainingDataSourceId) {
        this.trainingDataSourceId = trainingDataSourceId;
        return this;
    }

    /**
     * The AWS user account from which the <code>MLModel</code> was created.
     * The account type can be either an AWS root account or an AWS Identity
     * and Access Management (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @return The AWS user account from which the <code>MLModel</code> was created.
     *         The account type can be either an AWS root account or an AWS Identity
     *         and Access Management (IAM) user account.
     */
    public String getCreatedByIamUser() {
        return createdByIamUser;
    }
    
    /**
     * The AWS user account from which the <code>MLModel</code> was created.
     * The account type can be either an AWS root account or an AWS Identity
     * and Access Management (IAM) user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @param createdByIamUser The AWS user account from which the <code>MLModel</code> was created.
     *         The account type can be either an AWS root account or an AWS Identity
     *         and Access Management (IAM) user account.
     */
    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }
    
    /**
     * The AWS user account from which the <code>MLModel</code> was created.
     * The account type can be either an AWS root account or an AWS Identity
     * and Access Management (IAM) user account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @param createdByIamUser The AWS user account from which the <code>MLModel</code> was created.
     *         The account type can be either an AWS root account or an AWS Identity
     *         and Access Management (IAM) user account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
        return this;
    }

    /**
     * The time that the <code>MLModel</code> was created. The time is
     * expressed in epoch time.
     *
     * @return The time that the <code>MLModel</code> was created. The time is
     *         expressed in epoch time.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    
    /**
     * The time that the <code>MLModel</code> was created. The time is
     * expressed in epoch time.
     *
     * @param createdAt The time that the <code>MLModel</code> was created. The time is
     *         expressed in epoch time.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * The time that the <code>MLModel</code> was created. The time is
     * expressed in epoch time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt The time that the <code>MLModel</code> was created. The time is
     *         expressed in epoch time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time of the most recent edit to the <code>MLModel</code>. The time
     * is expressed in epoch time.
     *
     * @return The time of the most recent edit to the <code>MLModel</code>. The time
     *         is expressed in epoch time.
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }
    
    /**
     * The time of the most recent edit to the <code>MLModel</code>. The time
     * is expressed in epoch time.
     *
     * @param lastUpdatedAt The time of the most recent edit to the <code>MLModel</code>. The time
     *         is expressed in epoch time.
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
    
    /**
     * The time of the most recent edit to the <code>MLModel</code>. The time
     * is expressed in epoch time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedAt The time of the most recent edit to the <code>MLModel</code>. The time
     *         is expressed in epoch time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return A user-supplied name or description of the <code>MLModel</code>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param name A user-supplied name or description of the <code>MLModel</code>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param name A user-supplied name or description of the <code>MLModel</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The current status of an <code>MLModel</code>. This element can have
     * one of the following values: <ul> <li>PENDING - Amazon Machine
     * Learning (Amazon ML) submitted a request to create an
     * <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     * underway.</li> <li>FAILED - The request to create an
     * <code>MLModel</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @return The current status of an <code>MLModel</code>. This element can have
     *         one of the following values: <ul> <li>PENDING - Amazon Machine
     *         Learning (Amazon ML) submitted a request to create an
     *         <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     *         underway.</li> <li>FAILED - The request to create an
     *         <code>MLModel</code> did not run to completion. It is not usable.</li>
     *         <li>COMPLETED - The creation process completed successfully.</li>
     *         <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     *         usable.</li> </ul>
     *
     * @see EntityStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current status of an <code>MLModel</code>. This element can have
     * one of the following values: <ul> <li>PENDING - Amazon Machine
     * Learning (Amazon ML) submitted a request to create an
     * <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     * underway.</li> <li>FAILED - The request to create an
     * <code>MLModel</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The current status of an <code>MLModel</code>. This element can have
     *         one of the following values: <ul> <li>PENDING - Amazon Machine
     *         Learning (Amazon ML) submitted a request to create an
     *         <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     *         underway.</li> <li>FAILED - The request to create an
     *         <code>MLModel</code> did not run to completion. It is not usable.</li>
     *         <li>COMPLETED - The creation process completed successfully.</li>
     *         <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     *         usable.</li> </ul>
     *
     * @see EntityStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current status of an <code>MLModel</code>. This element can have
     * one of the following values: <ul> <li>PENDING - Amazon Machine
     * Learning (Amazon ML) submitted a request to create an
     * <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     * underway.</li> <li>FAILED - The request to create an
     * <code>MLModel</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The current status of an <code>MLModel</code>. This element can have
     *         one of the following values: <ul> <li>PENDING - Amazon Machine
     *         Learning (Amazon ML) submitted a request to create an
     *         <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     *         underway.</li> <li>FAILED - The request to create an
     *         <code>MLModel</code> did not run to completion. It is not usable.</li>
     *         <li>COMPLETED - The creation process completed successfully.</li>
     *         <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     *         usable.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EntityStatus
     */
    public MLModel withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of an <code>MLModel</code>. This element can have
     * one of the following values: <ul> <li>PENDING - Amazon Machine
     * Learning (Amazon ML) submitted a request to create an
     * <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     * underway.</li> <li>FAILED - The request to create an
     * <code>MLModel</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The current status of an <code>MLModel</code>. This element can have
     *         one of the following values: <ul> <li>PENDING - Amazon Machine
     *         Learning (Amazon ML) submitted a request to create an
     *         <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     *         underway.</li> <li>FAILED - The request to create an
     *         <code>MLModel</code> did not run to completion. It is not usable.</li>
     *         <li>COMPLETED - The creation process completed successfully.</li>
     *         <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     *         usable.</li> </ul>
     *
     * @see EntityStatus
     */
    public void setStatus(EntityStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The current status of an <code>MLModel</code>. This element can have
     * one of the following values: <ul> <li>PENDING - Amazon Machine
     * Learning (Amazon ML) submitted a request to create an
     * <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     * underway.</li> <li>FAILED - The request to create an
     * <code>MLModel</code> did not run to completion. It is not usable.</li>
     * <li>COMPLETED - The creation process completed successfully.</li>
     * <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     * usable.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status The current status of an <code>MLModel</code>. This element can have
     *         one of the following values: <ul> <li>PENDING - Amazon Machine
     *         Learning (Amazon ML) submitted a request to create an
     *         <code>MLModel</code>.</li> <li>INPROGRESS - The creation process is
     *         underway.</li> <li>FAILED - The request to create an
     *         <code>MLModel</code> did not run to completion. It is not usable.</li>
     *         <li>COMPLETED - The creation process completed successfully.</li>
     *         <li>DELETED - The <code>MLModel</code> is marked as deleted. It is not
     *         usable.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EntityStatus
     */
    public MLModel withStatus(EntityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Long integer type that is a 64-bit signed number.
     *
     * @return Long integer type that is a 64-bit signed number.
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }
    
    /**
     * Long integer type that is a 64-bit signed number.
     *
     * @param sizeInBytes Long integer type that is a 64-bit signed number.
     */
    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
    
    /**
     * Long integer type that is a 64-bit signed number.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sizeInBytes Long integer type that is a 64-bit signed number.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * The current endpoint of the <code>MLModel</code>.
     *
     * @return The current endpoint of the <code>MLModel</code>.
     */
    public RealtimeEndpointInfo getEndpointInfo() {
        return endpointInfo;
    }
    
    /**
     * The current endpoint of the <code>MLModel</code>.
     *
     * @param endpointInfo The current endpoint of the <code>MLModel</code>.
     */
    public void setEndpointInfo(RealtimeEndpointInfo endpointInfo) {
        this.endpointInfo = endpointInfo;
    }
    
    /**
     * The current endpoint of the <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpointInfo The current endpoint of the <code>MLModel</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withEndpointInfo(RealtimeEndpointInfo endpointInfo) {
        this.endpointInfo = endpointInfo;
        return this;
    }

    /**
     * A list of the training parameters in the <code>MLModel</code>. The
     * list is implemented as a map of key/value pairs. <p>The following is
     * the current set of training parameters: <ul>
     * <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     * regularization L1 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to zero,
     * resulting in a sparse feature set. If you use this parameter, specify
     * a small value, such as 1.0E-04 or 1.0E-08. <p>The value is a double
     * that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     * normalization. The parameter cannot be used when <code>L2</code> is
     * specified. Use this parameter sparingly.</li>
     * <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     * regularization L2 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to small, nonzero
     * values. If you use this parameter, specify a small value, such as
     * 1.0E-04 or 1.0E-08. <p>The valus is a double that ranges from 0 to
     * MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     * used when <code>L1</code> is specified. Use this parameter
     * sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     * that the training process traverses the observations to build the
     * <code>MLModel</code>. The value is an integer that ranges from 1 to
     * 10000. The default value is 10. </li>
     * <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     * of the model. Depending on the input data, the model size might affect
     * performance. <p> The value is an integer that ranges from 100000 to
     * 2147483648. The default value is 33554432. </li> </ul>
     *
     * @return A list of the training parameters in the <code>MLModel</code>. The
     *         list is implemented as a map of key/value pairs. <p>The following is
     *         the current set of training parameters: <ul>
     *         <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     *         regularization L1 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to zero,
     *         resulting in a sparse feature set. If you use this parameter, specify
     *         a small value, such as 1.0E-04 or 1.0E-08. <p>The value is a double
     *         that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     *         normalization. The parameter cannot be used when <code>L2</code> is
     *         specified. Use this parameter sparingly.</li>
     *         <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     *         regularization L2 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to small, nonzero
     *         values. If you use this parameter, specify a small value, such as
     *         1.0E-04 or 1.0E-08. <p>The valus is a double that ranges from 0 to
     *         MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     *         used when <code>L1</code> is specified. Use this parameter
     *         sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     *         that the training process traverses the observations to build the
     *         <code>MLModel</code>. The value is an integer that ranges from 1 to
     *         10000. The default value is 10. </li>
     *         <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     *         of the model. Depending on the input data, the model size might affect
     *         performance. <p> The value is an integer that ranges from 100000 to
     *         2147483648. The default value is 33554432. </li> </ul>
     */
    public java.util.Map<String,String> getTrainingParameters() {
        
        if (trainingParameters == null) {
            trainingParameters = new java.util.HashMap<String,String>();
        }
        return trainingParameters;
    }
    
    /**
     * A list of the training parameters in the <code>MLModel</code>. The
     * list is implemented as a map of key/value pairs. <p>The following is
     * the current set of training parameters: <ul>
     * <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     * regularization L1 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to zero,
     * resulting in a sparse feature set. If you use this parameter, specify
     * a small value, such as 1.0E-04 or 1.0E-08. <p>The value is a double
     * that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     * normalization. The parameter cannot be used when <code>L2</code> is
     * specified. Use this parameter sparingly.</li>
     * <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     * regularization L2 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to small, nonzero
     * values. If you use this parameter, specify a small value, such as
     * 1.0E-04 or 1.0E-08. <p>The valus is a double that ranges from 0 to
     * MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     * used when <code>L1</code> is specified. Use this parameter
     * sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     * that the training process traverses the observations to build the
     * <code>MLModel</code>. The value is an integer that ranges from 1 to
     * 10000. The default value is 10. </li>
     * <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     * of the model. Depending on the input data, the model size might affect
     * performance. <p> The value is an integer that ranges from 100000 to
     * 2147483648. The default value is 33554432. </li> </ul>
     *
     * @param trainingParameters A list of the training parameters in the <code>MLModel</code>. The
     *         list is implemented as a map of key/value pairs. <p>The following is
     *         the current set of training parameters: <ul>
     *         <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     *         regularization L1 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to zero,
     *         resulting in a sparse feature set. If you use this parameter, specify
     *         a small value, such as 1.0E-04 or 1.0E-08. <p>The value is a double
     *         that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     *         normalization. The parameter cannot be used when <code>L2</code> is
     *         specified. Use this parameter sparingly.</li>
     *         <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     *         regularization L2 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to small, nonzero
     *         values. If you use this parameter, specify a small value, such as
     *         1.0E-04 or 1.0E-08. <p>The valus is a double that ranges from 0 to
     *         MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     *         used when <code>L1</code> is specified. Use this parameter
     *         sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     *         that the training process traverses the observations to build the
     *         <code>MLModel</code>. The value is an integer that ranges from 1 to
     *         10000. The default value is 10. </li>
     *         <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     *         of the model. Depending on the input data, the model size might affect
     *         performance. <p> The value is an integer that ranges from 100000 to
     *         2147483648. The default value is 33554432. </li> </ul>
     */
    public void setTrainingParameters(java.util.Map<String,String> trainingParameters) {
        this.trainingParameters = trainingParameters;
    }
    
    /**
     * A list of the training parameters in the <code>MLModel</code>. The
     * list is implemented as a map of key/value pairs. <p>The following is
     * the current set of training parameters: <ul>
     * <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     * regularization L1 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to zero,
     * resulting in a sparse feature set. If you use this parameter, specify
     * a small value, such as 1.0E-04 or 1.0E-08. <p>The value is a double
     * that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     * normalization. The parameter cannot be used when <code>L2</code> is
     * specified. Use this parameter sparingly.</li>
     * <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     * regularization L2 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to small, nonzero
     * values. If you use this parameter, specify a small value, such as
     * 1.0E-04 or 1.0E-08. <p>The valus is a double that ranges from 0 to
     * MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     * used when <code>L1</code> is specified. Use this parameter
     * sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     * that the training process traverses the observations to build the
     * <code>MLModel</code>. The value is an integer that ranges from 1 to
     * 10000. The default value is 10. </li>
     * <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     * of the model. Depending on the input data, the model size might affect
     * performance. <p> The value is an integer that ranges from 100000 to
     * 2147483648. The default value is 33554432. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trainingParameters A list of the training parameters in the <code>MLModel</code>. The
     *         list is implemented as a map of key/value pairs. <p>The following is
     *         the current set of training parameters: <ul>
     *         <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     *         regularization L1 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to zero,
     *         resulting in a sparse feature set. If you use this parameter, specify
     *         a small value, such as 1.0E-04 or 1.0E-08. <p>The value is a double
     *         that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     *         normalization. The parameter cannot be used when <code>L2</code> is
     *         specified. Use this parameter sparingly.</li>
     *         <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     *         regularization L2 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to small, nonzero
     *         values. If you use this parameter, specify a small value, such as
     *         1.0E-04 or 1.0E-08. <p>The valus is a double that ranges from 0 to
     *         MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     *         used when <code>L1</code> is specified. Use this parameter
     *         sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     *         that the training process traverses the observations to build the
     *         <code>MLModel</code>. The value is an integer that ranges from 1 to
     *         10000. The default value is 10. </li>
     *         <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     *         of the model. Depending on the input data, the model size might affect
     *         performance. <p> The value is an integer that ranges from 100000 to
     *         2147483648. The default value is 33554432. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withTrainingParameters(java.util.Map<String,String> trainingParameters) {
        setTrainingParameters(trainingParameters);
        return this;
    }

    /**
     * A list of the training parameters in the <code>MLModel</code>. The
     * list is implemented as a map of key/value pairs. <p>The following is
     * the current set of training parameters: <ul>
     * <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     * regularization L1 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to zero,
     * resulting in a sparse feature set. If you use this parameter, specify
     * a small value, such as 1.0E-04 or 1.0E-08. <p>The value is a double
     * that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     * normalization. The parameter cannot be used when <code>L2</code> is
     * specified. Use this parameter sparingly.</li>
     * <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     * regularization L2 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to small, nonzero
     * values. If you use this parameter, specify a small value, such as
     * 1.0E-04 or 1.0E-08. <p>The valus is a double that ranges from 0 to
     * MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     * used when <code>L1</code> is specified. Use this parameter
     * sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     * that the training process traverses the observations to build the
     * <code>MLModel</code>. The value is an integer that ranges from 1 to
     * 10000. The default value is 10. </li>
     * <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     * of the model. Depending on the input data, the model size might affect
     * performance. <p> The value is an integer that ranges from 100000 to
     * 2147483648. The default value is 33554432. </li> </ul>
     * <p>
     * The method adds a new key-value pair into TrainingParameters
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into TrainingParameters.
     * @param value The corresponding value of the entry to be added into TrainingParameters.
     */
    public MLModel addTrainingParametersEntry(String key, String value) {
        if (null == this.trainingParameters) {
            this.trainingParameters = new java.util.HashMap<String,String>();
        }
        if (this.trainingParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.trainingParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TrainingParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public MLModel clearTrainingParametersEntries() {
        this.trainingParameters = null;
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
    public MLModel withInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
        return this;
    }

    /**
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     * The goal of SGD is to minimize the gradient of the loss function.
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sgd
     *
     * @return The algorithm used to train the <code>MLModel</code>. The following
     *         algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     *         The goal of SGD is to minimize the gradient of the loss function.
     *         </li> </ul>
     *
     * @see Algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }
    
    /**
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     * The goal of SGD is to minimize the gradient of the loss function.
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sgd
     *
     * @param algorithm The algorithm used to train the <code>MLModel</code>. The following
     *         algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     *         The goal of SGD is to minimize the gradient of the loss function.
     *         </li> </ul>
     *
     * @see Algorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
    
    /**
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     * The goal of SGD is to minimize the gradient of the loss function.
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sgd
     *
     * @param algorithm The algorithm used to train the <code>MLModel</code>. The following
     *         algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     *         The goal of SGD is to minimize the gradient of the loss function.
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Algorithm
     */
    public MLModel withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     * The goal of SGD is to minimize the gradient of the loss function.
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sgd
     *
     * @param algorithm The algorithm used to train the <code>MLModel</code>. The following
     *         algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     *         The goal of SGD is to minimize the gradient of the loss function.
     *         </li> </ul>
     *
     * @see Algorithm
     */
    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm.toString();
    }
    
    /**
     * The algorithm used to train the <code>MLModel</code>. The following
     * algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     * The goal of SGD is to minimize the gradient of the loss function.
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sgd
     *
     * @param algorithm The algorithm used to train the <code>MLModel</code>. The following
     *         algorithm is supported: <ul> <li>SGD -- Stochastic gradient descent.
     *         The goal of SGD is to minimize the gradient of the loss function.
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Algorithm
     */
    public MLModel withAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * Identifies the <code>MLModel</code> category. The following are the
     * available types: <ul> <li>REGRESSION - Produces a numeric result. For
     * example, "What listing price should a house have?".</li> <li>BINARY -
     * Produces one of two possible results. For example, "Is this a
     * child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     * two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     * trade?".</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @return Identifies the <code>MLModel</code> category. The following are the
     *         available types: <ul> <li>REGRESSION - Produces a numeric result. For
     *         example, "What listing price should a house have?".</li> <li>BINARY -
     *         Produces one of two possible results. For example, "Is this a
     *         child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     *         two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     *         trade?".</li> </ul>
     *
     * @see MLModelType
     */
    public String getMLModelType() {
        return mLModelType;
    }
    
    /**
     * Identifies the <code>MLModel</code> category. The following are the
     * available types: <ul> <li>REGRESSION - Produces a numeric result. For
     * example, "What listing price should a house have?".</li> <li>BINARY -
     * Produces one of two possible results. For example, "Is this a
     * child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     * two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     * trade?".</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType Identifies the <code>MLModel</code> category. The following are the
     *         available types: <ul> <li>REGRESSION - Produces a numeric result. For
     *         example, "What listing price should a house have?".</li> <li>BINARY -
     *         Produces one of two possible results. For example, "Is this a
     *         child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     *         two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     *         trade?".</li> </ul>
     *
     * @see MLModelType
     */
    public void setMLModelType(String mLModelType) {
        this.mLModelType = mLModelType;
    }
    
    /**
     * Identifies the <code>MLModel</code> category. The following are the
     * available types: <ul> <li>REGRESSION - Produces a numeric result. For
     * example, "What listing price should a house have?".</li> <li>BINARY -
     * Produces one of two possible results. For example, "Is this a
     * child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     * two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     * trade?".</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType Identifies the <code>MLModel</code> category. The following are the
     *         available types: <ul> <li>REGRESSION - Produces a numeric result. For
     *         example, "What listing price should a house have?".</li> <li>BINARY -
     *         Produces one of two possible results. For example, "Is this a
     *         child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     *         two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     *         trade?".</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MLModelType
     */
    public MLModel withMLModelType(String mLModelType) {
        this.mLModelType = mLModelType;
        return this;
    }

    /**
     * Identifies the <code>MLModel</code> category. The following are the
     * available types: <ul> <li>REGRESSION - Produces a numeric result. For
     * example, "What listing price should a house have?".</li> <li>BINARY -
     * Produces one of two possible results. For example, "Is this a
     * child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     * two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     * trade?".</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType Identifies the <code>MLModel</code> category. The following are the
     *         available types: <ul> <li>REGRESSION - Produces a numeric result. For
     *         example, "What listing price should a house have?".</li> <li>BINARY -
     *         Produces one of two possible results. For example, "Is this a
     *         child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     *         two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     *         trade?".</li> </ul>
     *
     * @see MLModelType
     */
    public void setMLModelType(MLModelType mLModelType) {
        this.mLModelType = mLModelType.toString();
    }
    
    /**
     * Identifies the <code>MLModel</code> category. The following are the
     * available types: <ul> <li>REGRESSION - Produces a numeric result. For
     * example, "What listing price should a house have?".</li> <li>BINARY -
     * Produces one of two possible results. For example, "Is this a
     * child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     * two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     * trade?".</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType Identifies the <code>MLModel</code> category. The following are the
     *         available types: <ul> <li>REGRESSION - Produces a numeric result. For
     *         example, "What listing price should a house have?".</li> <li>BINARY -
     *         Produces one of two possible results. For example, "Is this a
     *         child-friendly web site?".</li> <li>MULTICLASS - Produces more than
     *         two possible results. For example, "Is this a HIGH, LOW or MEDIUM risk
     *         trade?".</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MLModelType
     */
    public MLModel withMLModelType(MLModelType mLModelType) {
        this.mLModelType = mLModelType.toString();
        return this;
    }

    /**
     * Returns the value of the ScoreThreshold property for this object.
     *
     * @return The value of the ScoreThreshold property for this object.
     */
    public Float getScoreThreshold() {
        return scoreThreshold;
    }
    
    /**
     * Sets the value of the ScoreThreshold property for this object.
     *
     * @param scoreThreshold The new value for the ScoreThreshold property for this object.
     */
    public void setScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }
    
    /**
     * Sets the value of the ScoreThreshold property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scoreThreshold The new value for the ScoreThreshold property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }

    /**
     * The time of the most recent edit to the <code>ScoreThreshold</code>.
     * The time is expressed in epoch time.
     *
     * @return The time of the most recent edit to the <code>ScoreThreshold</code>.
     *         The time is expressed in epoch time.
     */
    public java.util.Date getScoreThresholdLastUpdatedAt() {
        return scoreThresholdLastUpdatedAt;
    }
    
    /**
     * The time of the most recent edit to the <code>ScoreThreshold</code>.
     * The time is expressed in epoch time.
     *
     * @param scoreThresholdLastUpdatedAt The time of the most recent edit to the <code>ScoreThreshold</code>.
     *         The time is expressed in epoch time.
     */
    public void setScoreThresholdLastUpdatedAt(java.util.Date scoreThresholdLastUpdatedAt) {
        this.scoreThresholdLastUpdatedAt = scoreThresholdLastUpdatedAt;
    }
    
    /**
     * The time of the most recent edit to the <code>ScoreThreshold</code>.
     * The time is expressed in epoch time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scoreThresholdLastUpdatedAt The time of the most recent edit to the <code>ScoreThreshold</code>.
     *         The time is expressed in epoch time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withScoreThresholdLastUpdatedAt(java.util.Date scoreThresholdLastUpdatedAt) {
        this.scoreThresholdLastUpdatedAt = scoreThresholdLastUpdatedAt;
        return this;
    }

    /**
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @return A description of the most recent details about accessing the
     *         <code>MLModel</code>.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @param message A description of the most recent details about accessing the
     *         <code>MLModel</code>.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     *
     * @param message A description of the most recent details about accessing the
     *         <code>MLModel</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MLModel withMessage(String message) {
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
        if (getMLModelId() != null) sb.append("MLModelId: " + getMLModelId() + ",");
        if (getTrainingDataSourceId() != null) sb.append("TrainingDataSourceId: " + getTrainingDataSourceId() + ",");
        if (getCreatedByIamUser() != null) sb.append("CreatedByIamUser: " + getCreatedByIamUser() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null) sb.append("LastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getSizeInBytes() != null) sb.append("SizeInBytes: " + getSizeInBytes() + ",");
        if (getEndpointInfo() != null) sb.append("EndpointInfo: " + getEndpointInfo() + ",");
        if (getTrainingParameters() != null) sb.append("TrainingParameters: " + getTrainingParameters() + ",");
        if (getInputDataLocationS3() != null) sb.append("InputDataLocationS3: " + getInputDataLocationS3() + ",");
        if (getAlgorithm() != null) sb.append("Algorithm: " + getAlgorithm() + ",");
        if (getMLModelType() != null) sb.append("MLModelType: " + getMLModelType() + ",");
        if (getScoreThreshold() != null) sb.append("ScoreThreshold: " + getScoreThreshold() + ",");
        if (getScoreThresholdLastUpdatedAt() != null) sb.append("ScoreThresholdLastUpdatedAt: " + getScoreThresholdLastUpdatedAt() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode()); 
        hashCode = prime * hashCode + ((getMLModelType() == null) ? 0 : getMLModelType().hashCode()); 
        hashCode = prime * hashCode + ((getScoreThreshold() == null) ? 0 : getScoreThreshold().hashCode()); 
        hashCode = prime * hashCode + ((getScoreThresholdLastUpdatedAt() == null) ? 0 : getScoreThresholdLastUpdatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MLModel == false) return false;
        MLModel other = (MLModel)obj;
        
        if (other.getMLModelId() == null ^ this.getMLModelId() == null) return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false) return false; 
        if (other.getTrainingDataSourceId() == null ^ this.getTrainingDataSourceId() == null) return false;
        if (other.getTrainingDataSourceId() != null && other.getTrainingDataSourceId().equals(this.getTrainingDataSourceId()) == false) return false; 
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
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null) return false;
        if (other.getSizeInBytes() != null && other.getSizeInBytes().equals(this.getSizeInBytes()) == false) return false; 
        if (other.getEndpointInfo() == null ^ this.getEndpointInfo() == null) return false;
        if (other.getEndpointInfo() != null && other.getEndpointInfo().equals(this.getEndpointInfo()) == false) return false; 
        if (other.getTrainingParameters() == null ^ this.getTrainingParameters() == null) return false;
        if (other.getTrainingParameters() != null && other.getTrainingParameters().equals(this.getTrainingParameters()) == false) return false; 
        if (other.getInputDataLocationS3() == null ^ this.getInputDataLocationS3() == null) return false;
        if (other.getInputDataLocationS3() != null && other.getInputDataLocationS3().equals(this.getInputDataLocationS3()) == false) return false; 
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null) return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false) return false; 
        if (other.getMLModelType() == null ^ this.getMLModelType() == null) return false;
        if (other.getMLModelType() != null && other.getMLModelType().equals(this.getMLModelType()) == false) return false; 
        if (other.getScoreThreshold() == null ^ this.getScoreThreshold() == null) return false;
        if (other.getScoreThreshold() != null && other.getScoreThreshold().equals(this.getScoreThreshold()) == false) return false; 
        if (other.getScoreThresholdLastUpdatedAt() == null ^ this.getScoreThresholdLastUpdatedAt() == null) return false;
        if (other.getScoreThresholdLastUpdatedAt() != null && other.getScoreThresholdLastUpdatedAt().equals(this.getScoreThresholdLastUpdatedAt()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
    @Override
    public MLModel clone() {
        try {
            return (MLModel) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    