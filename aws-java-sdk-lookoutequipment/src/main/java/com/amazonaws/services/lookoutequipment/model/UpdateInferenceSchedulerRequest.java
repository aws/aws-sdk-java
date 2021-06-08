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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateInferenceScheduler"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInferenceSchedulerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the inference scheduler to be updated.
     * </p>
     */
    private String inferenceSchedulerName;
    /**
     * <p>
     * &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance,
     * if you select an offset delay time of five minutes, inference will not begin on the data until the first data
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
     * Specifies information for the input data for the inference scheduler, including delimiter, format, and dataset
     * location.
     * </p>
     */
    private InferenceInputConfiguration dataInputConfiguration;
    /**
     * <p>
     * Specifies information for the output results from the inference scheduler, including the output S3 location.
     * </p>
     */
    private InferenceOutputConfiguration dataOutputConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference scheduler.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the inference scheduler to be updated.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler to be updated.
     */

    public void setInferenceSchedulerName(String inferenceSchedulerName) {
        this.inferenceSchedulerName = inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler to be updated.
     * </p>
     * 
     * @return The name of the inference scheduler to be updated.
     */

    public String getInferenceSchedulerName() {
        return this.inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler to be updated.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceSchedulerRequest withInferenceSchedulerName(String inferenceSchedulerName) {
        setInferenceSchedulerName(inferenceSchedulerName);
        return this;
    }

    /**
     * <p>
     * &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance,
     * if you select an offset delay time of five minutes, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     * 
     * @param dataDelayOffsetInMinutes
     *        &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For
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
     * &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance,
     * if you select an offset delay time of five minutes, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     * 
     * @return &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For
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
     * &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance,
     * if you select an offset delay time of five minutes, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     * 
     * @param dataDelayOffsetInMinutes
     *        &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For
     *        instance, if you select an offset delay time of five minutes, inference will not begin on the data until
     *        the first data measurement after the five minute mark. For example, if five minutes is selected, the
     *        inference scheduler will wake up at the configured frequency with the additional five minute delay time to
     *        check the customer S3 bucket. The customer can upload data at the same frequency and they don't need to
     *        stop and restart the scheduler when uploading new data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceSchedulerRequest withDataDelayOffsetInMinutes(Long dataDelayOffsetInMinutes) {
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

    public UpdateInferenceSchedulerRequest withDataUploadFrequency(String dataUploadFrequency) {
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

    public UpdateInferenceSchedulerRequest withDataUploadFrequency(DataUploadFrequency dataUploadFrequency) {
        this.dataUploadFrequency = dataUploadFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Specifies information for the input data for the inference scheduler, including delimiter, format, and dataset
     * location.
     * </p>
     * 
     * @param dataInputConfiguration
     *        Specifies information for the input data for the inference scheduler, including delimiter, format, and
     *        dataset location.
     */

    public void setDataInputConfiguration(InferenceInputConfiguration dataInputConfiguration) {
        this.dataInputConfiguration = dataInputConfiguration;
    }

    /**
     * <p>
     * Specifies information for the input data for the inference scheduler, including delimiter, format, and dataset
     * location.
     * </p>
     * 
     * @return Specifies information for the input data for the inference scheduler, including delimiter, format, and
     *         dataset location.
     */

    public InferenceInputConfiguration getDataInputConfiguration() {
        return this.dataInputConfiguration;
    }

    /**
     * <p>
     * Specifies information for the input data for the inference scheduler, including delimiter, format, and dataset
     * location.
     * </p>
     * 
     * @param dataInputConfiguration
     *        Specifies information for the input data for the inference scheduler, including delimiter, format, and
     *        dataset location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceSchedulerRequest withDataInputConfiguration(InferenceInputConfiguration dataInputConfiguration) {
        setDataInputConfiguration(dataInputConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies information for the output results from the inference scheduler, including the output S3 location.
     * </p>
     * 
     * @param dataOutputConfiguration
     *        Specifies information for the output results from the inference scheduler, including the output S3
     *        location.
     */

    public void setDataOutputConfiguration(InferenceOutputConfiguration dataOutputConfiguration) {
        this.dataOutputConfiguration = dataOutputConfiguration;
    }

    /**
     * <p>
     * Specifies information for the output results from the inference scheduler, including the output S3 location.
     * </p>
     * 
     * @return Specifies information for the output results from the inference scheduler, including the output S3
     *         location.
     */

    public InferenceOutputConfiguration getDataOutputConfiguration() {
        return this.dataOutputConfiguration;
    }

    /**
     * <p>
     * Specifies information for the output results from the inference scheduler, including the output S3 location.
     * </p>
     * 
     * @param dataOutputConfiguration
     *        Specifies information for the output results from the inference scheduler, including the output S3
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceSchedulerRequest withDataOutputConfiguration(InferenceOutputConfiguration dataOutputConfiguration) {
        setDataOutputConfiguration(dataOutputConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference scheduler.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference
     *        scheduler.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference scheduler.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference
     *         scheduler.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference scheduler.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference
     *        scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInferenceSchedulerRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInferenceSchedulerRequest == false)
            return false;
        UpdateInferenceSchedulerRequest other = (UpdateInferenceSchedulerRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferenceSchedulerName() == null) ? 0 : getInferenceSchedulerName().hashCode());
        hashCode = prime * hashCode + ((getDataDelayOffsetInMinutes() == null) ? 0 : getDataDelayOffsetInMinutes().hashCode());
        hashCode = prime * hashCode + ((getDataUploadFrequency() == null) ? 0 : getDataUploadFrequency().hashCode());
        hashCode = prime * hashCode + ((getDataInputConfiguration() == null) ? 0 : getDataInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataOutputConfiguration() == null) ? 0 : getDataOutputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInferenceSchedulerRequest clone() {
        return (UpdateInferenceSchedulerRequest) super.clone();
    }

}
