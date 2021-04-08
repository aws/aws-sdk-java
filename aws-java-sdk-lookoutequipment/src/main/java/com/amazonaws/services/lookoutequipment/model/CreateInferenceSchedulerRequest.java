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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateInferenceScheduler"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInferenceSchedulerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the previously trained ML model being used to create the inference scheduler.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The name of the inference scheduler being created.
     * </p>
     */
    private String inferenceSchedulerName;
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
     * How often data is uploaded to the source S3 bucket for the input data. The value chosen is the length of time
     * between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     * real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout
     * for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     */
    private String dataUploadFrequency;
    /**
     * <p>
     * Specifies configuration information for the input data for the inference scheduler, including delimiter, format,
     * and dataset location.
     * </p>
     */
    private InferenceInputConfiguration dataInputConfiguration;
    /**
     * <p>
     * Specifies configuration information for the output results for the inference scheduler, including the S3 location
     * for the output.
     * </p>
     */
    private InferenceOutputConfiguration dataOutputConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used for the inference.
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
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Any tags associated with the inference scheduler.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the previously trained ML model being used to create the inference scheduler.
     * </p>
     * 
     * @param modelName
     *        The name of the previously trained ML model being used to create the inference scheduler.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the previously trained ML model being used to create the inference scheduler.
     * </p>
     * 
     * @return The name of the previously trained ML model being used to create the inference scheduler.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the previously trained ML model being used to create the inference scheduler.
     * </p>
     * 
     * @param modelName
     *        The name of the previously trained ML model being used to create the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceSchedulerRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The name of the inference scheduler being created.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler being created.
     */

    public void setInferenceSchedulerName(String inferenceSchedulerName) {
        this.inferenceSchedulerName = inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler being created.
     * </p>
     * 
     * @return The name of the inference scheduler being created.
     */

    public String getInferenceSchedulerName() {
        return this.inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler being created.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceSchedulerRequest withInferenceSchedulerName(String inferenceSchedulerName) {
        setInferenceSchedulerName(inferenceSchedulerName);
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

    public CreateInferenceSchedulerRequest withDataDelayOffsetInMinutes(Long dataDelayOffsetInMinutes) {
        setDataDelayOffsetInMinutes(dataDelayOffsetInMinutes);
        return this;
    }

    /**
     * <p>
     * How often data is uploaded to the source S3 bucket for the input data. The value chosen is the length of time
     * between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     * real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout
     * for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @param dataUploadFrequency
     *        How often data is uploaded to the source S3 bucket for the input data. The value chosen is the length of
     *        time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload
     *        the real-time data to the source bucket once every 5 minutes. This frequency also determines how often
     *        Amazon Lookout for Equipment starts a scheduled inference on your data. In this example, it starts once
     *        every 5 minutes.
     * @see DataUploadFrequency
     */

    public void setDataUploadFrequency(String dataUploadFrequency) {
        this.dataUploadFrequency = dataUploadFrequency;
    }

    /**
     * <p>
     * How often data is uploaded to the source S3 bucket for the input data. The value chosen is the length of time
     * between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     * real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout
     * for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @return How often data is uploaded to the source S3 bucket for the input data. The value chosen is the length of
     *         time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will
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
     * How often data is uploaded to the source S3 bucket for the input data. The value chosen is the length of time
     * between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     * real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout
     * for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @param dataUploadFrequency
     *        How often data is uploaded to the source S3 bucket for the input data. The value chosen is the length of
     *        time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload
     *        the real-time data to the source bucket once every 5 minutes. This frequency also determines how often
     *        Amazon Lookout for Equipment starts a scheduled inference on your data. In this example, it starts once
     *        every 5 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataUploadFrequency
     */

    public CreateInferenceSchedulerRequest withDataUploadFrequency(String dataUploadFrequency) {
        setDataUploadFrequency(dataUploadFrequency);
        return this;
    }

    /**
     * <p>
     * How often data is uploaded to the source S3 bucket for the input data. The value chosen is the length of time
     * between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     * real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout
     * for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @param dataUploadFrequency
     *        How often data is uploaded to the source S3 bucket for the input data. The value chosen is the length of
     *        time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload
     *        the real-time data to the source bucket once every 5 minutes. This frequency also determines how often
     *        Amazon Lookout for Equipment starts a scheduled inference on your data. In this example, it starts once
     *        every 5 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataUploadFrequency
     */

    public CreateInferenceSchedulerRequest withDataUploadFrequency(DataUploadFrequency dataUploadFrequency) {
        this.dataUploadFrequency = dataUploadFrequency.toString();
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

    public CreateInferenceSchedulerRequest withDataInputConfiguration(InferenceInputConfiguration dataInputConfiguration) {
        setDataInputConfiguration(dataInputConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for the output results for the inference scheduler, including the S3 location
     * for the output.
     * </p>
     * 
     * @param dataOutputConfiguration
     *        Specifies configuration information for the output results for the inference scheduler, including the S3
     *        location for the output.
     */

    public void setDataOutputConfiguration(InferenceOutputConfiguration dataOutputConfiguration) {
        this.dataOutputConfiguration = dataOutputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the output results for the inference scheduler, including the S3 location
     * for the output.
     * </p>
     * 
     * @return Specifies configuration information for the output results for the inference scheduler, including the S3
     *         location for the output.
     */

    public InferenceOutputConfiguration getDataOutputConfiguration() {
        return this.dataOutputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the output results for the inference scheduler, including the S3 location
     * for the output.
     * </p>
     * 
     * @param dataOutputConfiguration
     *        Specifies configuration information for the output results for the inference scheduler, including the S3
     *        location for the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceSchedulerRequest withDataOutputConfiguration(InferenceOutputConfiguration dataOutputConfiguration) {
        setDataOutputConfiguration(dataOutputConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used for the inference.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source being used for the
     *        inference.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used for the inference.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source being used for the
     *         inference.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used for the inference.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source being used for the
     *        inference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceSchedulerRequest withRoleArn(String roleArn) {
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

    public CreateInferenceSchedulerRequest withServerSideKmsKeyId(String serverSideKmsKeyId) {
        setServerSideKmsKeyId(serverSideKmsKeyId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *        Equipment generates one.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @return A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *         Equipment generates one.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *        Equipment generates one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceSchedulerRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Any tags associated with the inference scheduler.
     * </p>
     * 
     * @return Any tags associated with the inference scheduler.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags associated with the inference scheduler.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the inference scheduler.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags associated with the inference scheduler.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceSchedulerRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags associated with the inference scheduler.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceSchedulerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getInferenceSchedulerName() != null)
            sb.append("InferenceSchedulerName: ").append(getInferenceSchedulerName()).append(",");
        if (getDataDelayOffsetInMinutes() != null)
            sb.append("DataDelayOffsetInMinutes: ").append(getDataDelayOffsetInMinutes()).append(",");
        if (getDataUploadFrequency() != null)
            sb.append("DataUploadFrequency: ").append(getDataUploadFrequency()).append(",");
        if (getDataInputConfiguration() != null)
            sb.append("DataInputConfiguration: ").append(getDataInputConfiguration()).append(",");
        if (getDataOutputConfiguration() != null)
            sb.append("DataOutputConfiguration: ").append(getDataOutputConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getServerSideKmsKeyId() != null)
            sb.append("ServerSideKmsKeyId: ").append(getServerSideKmsKeyId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInferenceSchedulerRequest == false)
            return false;
        CreateInferenceSchedulerRequest other = (CreateInferenceSchedulerRequest) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getInferenceSchedulerName() == null ^ this.getInferenceSchedulerName() == null)
            return false;
        if (other.getInferenceSchedulerName() != null && other.getInferenceSchedulerName().equals(this.getInferenceSchedulerName()) == false)
            return false;
        if (other.getDataDelayOffsetInMinutes() == null ^ this.getDataDelayOffsetInMinutes() == null)
            return false;
        if (other.getDataDelayOffsetInMinutes() != null && other.getDataDelayOffsetInMinutes().equals(this.getDataDelayOffsetInMinutes()) == false)
            return false;
        if (other.getDataUploadFrequency() == null ^ this.getDataUploadFrequency() == null)
            return false;
        if (other.getDataUploadFrequency() != null && other.getDataUploadFrequency().equals(this.getDataUploadFrequency()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerName() == null) ? 0 : getInferenceSchedulerName().hashCode());
        hashCode = prime * hashCode + ((getDataDelayOffsetInMinutes() == null) ? 0 : getDataDelayOffsetInMinutes().hashCode());
        hashCode = prime * hashCode + ((getDataUploadFrequency() == null) ? 0 : getDataUploadFrequency().hashCode());
        hashCode = prime * hashCode + ((getDataInputConfiguration() == null) ? 0 : getDataInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataOutputConfiguration() == null) ? 0 : getDataOutputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getServerSideKmsKeyId() == null) ? 0 : getServerSideKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateInferenceSchedulerRequest clone() {
        return (CreateInferenceSchedulerRequest) super.clone();
    }

}
