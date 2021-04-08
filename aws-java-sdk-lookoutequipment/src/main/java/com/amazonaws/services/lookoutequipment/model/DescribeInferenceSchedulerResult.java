/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeInferenceScheduler"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInferenceSchedulerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model of the inference scheduler being described.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The name of the ML model of the inference scheduler being described.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The name of the inference scheduler being described.
     * </p>
     */
    private String inferenceSchedulerName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being described.
     * </p>
     */
    private String inferenceSchedulerArn;
    /**
     * <p>
     * Indicates the status of the inference scheduler.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance, if
     * you select an offset delay time of five minutes, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     */
    private Long dataDelayOffsetInMinutes;
    /**
     * <p>
     * Specifies how often data is uploaded to the source S3 bucket for the input data. This value is the length of time
     * between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     * real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout
     * for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     */
    private String dataUploadFrequency;
    /**
     * <p>
     * Specifies the time at which the inference scheduler was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies the time at which the inference scheduler was last updated, if it was.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * Specifies configuration information for the input data for the inference scheduler, including delimiter, format,
     * and dataset location.
     * </p>
     */
    private InferenceInputConfiguration dataInputConfiguration;
    /**
     * <p>
     * Specifies information for the output results for the inference scheduler, including the output S3 location.
     * </p>
     */
    private InferenceOutputConfiguration dataOutputConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference scheduler
     * being described.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt inference scheduler data by
     * Amazon Lookout for Equipment.
     * </p>
     */
    private String serverSideKmsKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model of the inference scheduler being described.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model of the inference scheduler being described.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model of the inference scheduler being described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ML model of the inference scheduler being described.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model of the inference scheduler being described.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model of the inference scheduler being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The name of the ML model of the inference scheduler being described.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model of the inference scheduler being described.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the ML model of the inference scheduler being described.
     * </p>
     * 
     * @return The name of the ML model of the inference scheduler being described.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the ML model of the inference scheduler being described.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model of the inference scheduler being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The name of the inference scheduler being described.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler being described.
     */

    public void setInferenceSchedulerName(String inferenceSchedulerName) {
        this.inferenceSchedulerName = inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler being described.
     * </p>
     * 
     * @return The name of the inference scheduler being described.
     */

    public String getInferenceSchedulerName() {
        return this.inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler being described.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withInferenceSchedulerName(String inferenceSchedulerName) {
        setInferenceSchedulerName(inferenceSchedulerName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being described.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference scheduler being described.
     */

    public void setInferenceSchedulerArn(String inferenceSchedulerArn) {
        this.inferenceSchedulerArn = inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the inference scheduler being described.
     */

    public String getInferenceSchedulerArn() {
        return this.inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being described.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference scheduler being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withInferenceSchedulerArn(String inferenceSchedulerArn) {
        setInferenceSchedulerArn(inferenceSchedulerArn);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the inference scheduler.
     * </p>
     * 
     * @param status
     *        Indicates the status of the inference scheduler.
     * @see InferenceSchedulerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the inference scheduler.
     * </p>
     * 
     * @return Indicates the status of the inference scheduler.
     * @see InferenceSchedulerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the inference scheduler.
     * </p>
     * 
     * @param status
     *        Indicates the status of the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceSchedulerStatus
     */

    public DescribeInferenceSchedulerResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the inference scheduler.
     * </p>
     * 
     * @param status
     *        Indicates the status of the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceSchedulerStatus
     */

    public DescribeInferenceSchedulerResult withStatus(InferenceSchedulerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance, if
     * you select an offset delay time of five minutes, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     * 
     * @param dataDelayOffsetInMinutes
     *        A period of time (in minutes) by which inference on the data is delayed after the data starts. For
     *        instance, if you select an offset delay time of five minutes, inference will not begin on the data until
     *        the first data measurement after the five minute mark. For example, if five minutes is selected, the
     *        inference scheduler will wake up at the configured frequency with the additional five minute delay time to
     *        check the customer S3 bucket. The customer can upload data at the same frequency and they don't need to
     *        stop and restart the scheduler when uploading new data.
     */

    public void setDataDelayOffsetInMinutes(Long dataDelayOffsetInMinutes) {
        this.dataDelayOffsetInMinutes = dataDelayOffsetInMinutes;
    }

    /**
     * <p>
     * A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance, if
     * you select an offset delay time of five minutes, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     * 
     * @return A period of time (in minutes) by which inference on the data is delayed after the data starts. For
     *         instance, if you select an offset delay time of five minutes, inference will not begin on the data until
     *         the first data measurement after the five minute mark. For example, if five minutes is selected, the
     *         inference scheduler will wake up at the configured frequency with the additional five minute delay time
     *         to check the customer S3 bucket. The customer can upload data at the same frequency and they don't need
     *         to stop and restart the scheduler when uploading new data.
     */

    public Long getDataDelayOffsetInMinutes() {
        return this.dataDelayOffsetInMinutes;
    }

    /**
     * <p>
     * A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance, if
     * you select an offset delay time of five minutes, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     * 
     * @param dataDelayOffsetInMinutes
     *        A period of time (in minutes) by which inference on the data is delayed after the data starts. For
     *        instance, if you select an offset delay time of five minutes, inference will not begin on the data until
     *        the first data measurement after the five minute mark. For example, if five minutes is selected, the
     *        inference scheduler will wake up at the configured frequency with the additional five minute delay time to
     *        check the customer S3 bucket. The customer can upload data at the same frequency and they don't need to
     *        stop and restart the scheduler when uploading new data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withDataDelayOffsetInMinutes(Long dataDelayOffsetInMinutes) {
        setDataDelayOffsetInMinutes(dataDelayOffsetInMinutes);
        return this;
    }

    /**
     * <p>
     * Specifies how often data is uploaded to the source S3 bucket for the input data. This value is the length of time
     * between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     * real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout
     * for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @param dataUploadFrequency
     *        Specifies how often data is uploaded to the source S3 bucket for the input data. This value is the length
     *        of time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will
     *        upload the real-time data to the source bucket once every 5 minutes. This frequency also determines how
     *        often Amazon Lookout for Equipment starts a scheduled inference on your data. In this example, it starts
     *        once every 5 minutes.
     * @see DataUploadFrequency
     */

    public void setDataUploadFrequency(String dataUploadFrequency) {
        this.dataUploadFrequency = dataUploadFrequency;
    }

    /**
     * <p>
     * Specifies how often data is uploaded to the source S3 bucket for the input data. This value is the length of time
     * between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     * real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout
     * for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @return Specifies how often data is uploaded to the source S3 bucket for the input data. This value is the length
     *         of time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will
     *         upload the real-time data to the source bucket once every 5 minutes. This frequency also determines how
     *         often Amazon Lookout for Equipment starts a scheduled inference on your data. In this example, it starts
     *         once every 5 minutes.
     * @see DataUploadFrequency
     */

    public String getDataUploadFrequency() {
        return this.dataUploadFrequency;
    }

    /**
     * <p>
     * Specifies how often data is uploaded to the source S3 bucket for the input data. This value is the length of time
     * between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     * real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout
     * for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @param dataUploadFrequency
     *        Specifies how often data is uploaded to the source S3 bucket for the input data. This value is the length
     *        of time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will
     *        upload the real-time data to the source bucket once every 5 minutes. This frequency also determines how
     *        often Amazon Lookout for Equipment starts a scheduled inference on your data. In this example, it starts
     *        once every 5 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataUploadFrequency
     */

    public DescribeInferenceSchedulerResult withDataUploadFrequency(String dataUploadFrequency) {
        setDataUploadFrequency(dataUploadFrequency);
        return this;
    }

    /**
     * <p>
     * Specifies how often data is uploaded to the source S3 bucket for the input data. This value is the length of time
     * between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     * real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout
     * for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @param dataUploadFrequency
     *        Specifies how often data is uploaded to the source S3 bucket for the input data. This value is the length
     *        of time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will
     *        upload the real-time data to the source bucket once every 5 minutes. This frequency also determines how
     *        often Amazon Lookout for Equipment starts a scheduled inference on your data. In this example, it starts
     *        once every 5 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataUploadFrequency
     */

    public DescribeInferenceSchedulerResult withDataUploadFrequency(DataUploadFrequency dataUploadFrequency) {
        this.dataUploadFrequency = dataUploadFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the time at which the inference scheduler was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies the time at which the inference scheduler was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Specifies the time at which the inference scheduler was created.
     * </p>
     * 
     * @return Specifies the time at which the inference scheduler was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Specifies the time at which the inference scheduler was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies the time at which the inference scheduler was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies the time at which the inference scheduler was last updated, if it was.
     * </p>
     * 
     * @param updatedAt
     *        Specifies the time at which the inference scheduler was last updated, if it was.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * Specifies the time at which the inference scheduler was last updated, if it was.
     * </p>
     * 
     * @return Specifies the time at which the inference scheduler was last updated, if it was.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * Specifies the time at which the inference scheduler was last updated, if it was.
     * </p>
     * 
     * @param updatedAt
     *        Specifies the time at which the inference scheduler was last updated, if it was.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for the input data for the inference scheduler, including delimiter, format,
     * and dataset location.
     * </p>
     * 
     * @param dataInputConfiguration
     *        Specifies configuration information for the input data for the inference scheduler, including delimiter,
     *        format, and dataset location.
     */

    public void setDataInputConfiguration(InferenceInputConfiguration dataInputConfiguration) {
        this.dataInputConfiguration = dataInputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the input data for the inference scheduler, including delimiter, format,
     * and dataset location.
     * </p>
     * 
     * @return Specifies configuration information for the input data for the inference scheduler, including delimiter,
     *         format, and dataset location.
     */

    public InferenceInputConfiguration getDataInputConfiguration() {
        return this.dataInputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the input data for the inference scheduler, including delimiter, format,
     * and dataset location.
     * </p>
     * 
     * @param dataInputConfiguration
     *        Specifies configuration information for the input data for the inference scheduler, including delimiter,
     *        format, and dataset location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withDataInputConfiguration(InferenceInputConfiguration dataInputConfiguration) {
        setDataInputConfiguration(dataInputConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies information for the output results for the inference scheduler, including the output S3 location.
     * </p>
     * 
     * @param dataOutputConfiguration
     *        Specifies information for the output results for the inference scheduler, including the output S3
     *        location.
     */

    public void setDataOutputConfiguration(InferenceOutputConfiguration dataOutputConfiguration) {
        this.dataOutputConfiguration = dataOutputConfiguration;
    }

    /**
     * <p>
     * Specifies information for the output results for the inference scheduler, including the output S3 location.
     * </p>
     * 
     * @return Specifies information for the output results for the inference scheduler, including the output S3
     *         location.
     */

    public InferenceOutputConfiguration getDataOutputConfiguration() {
        return this.dataOutputConfiguration;
    }

    /**
     * <p>
     * Specifies information for the output results for the inference scheduler, including the output S3 location.
     * </p>
     * 
     * @param dataOutputConfiguration
     *        Specifies information for the output results for the inference scheduler, including the output S3
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withDataOutputConfiguration(InferenceOutputConfiguration dataOutputConfiguration) {
        setDataOutputConfiguration(dataOutputConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference scheduler
     * being described.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference
     *        scheduler being described.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference scheduler
     * being described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference
     *         scheduler being described.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference scheduler
     * being described.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference
     *        scheduler being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt inference scheduler data by
     * Amazon Lookout for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt inference scheduler data
     *        by Amazon Lookout for Equipment.
     */

    public void setServerSideKmsKeyId(String serverSideKmsKeyId) {
        this.serverSideKmsKeyId = serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt inference scheduler data by
     * Amazon Lookout for Equipment.
     * </p>
     * 
     * @return Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt inference scheduler data
     *         by Amazon Lookout for Equipment.
     */

    public String getServerSideKmsKeyId() {
        return this.serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt inference scheduler data by
     * Amazon Lookout for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt inference scheduler data
     *        by Amazon Lookout for Equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceSchedulerResult withServerSideKmsKeyId(String serverSideKmsKeyId) {
        setServerSideKmsKeyId(serverSideKmsKeyId);
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
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getInferenceSchedulerName() != null)
            sb.append("InferenceSchedulerName: ").append(getInferenceSchedulerName()).append(",");
        if (getInferenceSchedulerArn() != null)
            sb.append("InferenceSchedulerArn: ").append(getInferenceSchedulerArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDataDelayOffsetInMinutes() != null)
            sb.append("DataDelayOffsetInMinutes: ").append(getDataDelayOffsetInMinutes()).append(",");
        if (getDataUploadFrequency() != null)
            sb.append("DataUploadFrequency: ").append(getDataUploadFrequency()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getDataInputConfiguration() != null)
            sb.append("DataInputConfiguration: ").append(getDataInputConfiguration()).append(",");
        if (getDataOutputConfiguration() != null)
            sb.append("DataOutputConfiguration: ").append(getDataOutputConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getServerSideKmsKeyId() != null)
            sb.append("ServerSideKmsKeyId: ").append(getServerSideKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInferenceSchedulerResult == false)
            return false;
        DescribeInferenceSchedulerResult other = (DescribeInferenceSchedulerResult) obj;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getInferenceSchedulerName() == null ^ this.getInferenceSchedulerName() == null)
            return false;
        if (other.getInferenceSchedulerName() != null && other.getInferenceSchedulerName().equals(this.getInferenceSchedulerName()) == false)
            return false;
        if (other.getInferenceSchedulerArn() == null ^ this.getInferenceSchedulerArn() == null)
            return false;
        if (other.getInferenceSchedulerArn() != null && other.getInferenceSchedulerArn().equals(this.getInferenceSchedulerArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDataDelayOffsetInMinutes() == null ^ this.getDataDelayOffsetInMinutes() == null)
            return false;
        if (other.getDataDelayOffsetInMinutes() != null && other.getDataDelayOffsetInMinutes().equals(this.getDataDelayOffsetInMinutes()) == false)
            return false;
        if (other.getDataUploadFrequency() == null ^ this.getDataUploadFrequency() == null)
            return false;
        if (other.getDataUploadFrequency() != null && other.getDataUploadFrequency().equals(this.getDataUploadFrequency()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getDataInputConfiguration() == null ^ this.getDataInputConfiguration() == null)
            return false;
        if (other.getDataInputConfiguration() != null && other.getDataInputConfiguration().equals(this.getDataInputConfiguration()) == false)
            return false;
        if (other.getDataOutputConfiguration() == null ^ this.getDataOutputConfiguration() == null)
            return false;
        if (other.getDataOutputConfiguration() != null && other.getDataOutputConfiguration().equals(this.getDataOutputConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getServerSideKmsKeyId() == null ^ this.getServerSideKmsKeyId() == null)
            return false;
        if (other.getServerSideKmsKeyId() != null && other.getServerSideKmsKeyId().equals(this.getServerSideKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerName() == null) ? 0 : getInferenceSchedulerName().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerArn() == null) ? 0 : getInferenceSchedulerArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDataDelayOffsetInMinutes() == null) ? 0 : getDataDelayOffsetInMinutes().hashCode());
        hashCode = prime * hashCode + ((getDataUploadFrequency() == null) ? 0 : getDataUploadFrequency().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDataInputConfiguration() == null) ? 0 : getDataInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataOutputConfiguration() == null) ? 0 : getDataOutputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getServerSideKmsKeyId() == null) ? 0 : getServerSideKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInferenceSchedulerResult clone() {
        try {
            return (DescribeInferenceSchedulerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
