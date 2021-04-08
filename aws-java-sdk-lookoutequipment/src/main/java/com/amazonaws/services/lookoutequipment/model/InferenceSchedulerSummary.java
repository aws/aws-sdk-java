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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the specific inference scheduler, including data delay offset, model name and ARN, status,
 * and so on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/InferenceSchedulerSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceSchedulerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the ML model used for the inference scheduler.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used by the inference scheduler.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The name of the inference scheduler.
     * </p>
     */
    private String inferenceSchedulerName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler.
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
     * &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance,
     * if an offset delay time of five minutes was selected, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     */
    private Long dataDelayOffsetInMinutes;
    /**
     * <p>
     * How often data is uploaded to the source S3 bucket for the input data. This value is the length of time between
     * data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the real-time data
     * to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout for Equipment
     * starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     */
    private String dataUploadFrequency;

    /**
     * <p>
     * The name of the ML model used for the inference scheduler.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model used for the inference scheduler.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the ML model used for the inference scheduler.
     * </p>
     * 
     * @return The name of the ML model used for the inference scheduler.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the ML model used for the inference scheduler.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model used for the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSchedulerSummary withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used by the inference scheduler.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model used by the inference scheduler.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used by the inference scheduler.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ML model used by the inference scheduler.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used by the inference scheduler.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model used by the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSchedulerSummary withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The name of the inference scheduler.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler.
     */

    public void setInferenceSchedulerName(String inferenceSchedulerName) {
        this.inferenceSchedulerName = inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler.
     * </p>
     * 
     * @return The name of the inference scheduler.
     */

    public String getInferenceSchedulerName() {
        return this.inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSchedulerSummary withInferenceSchedulerName(String inferenceSchedulerName) {
        setInferenceSchedulerName(inferenceSchedulerName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference scheduler.
     */

    public void setInferenceSchedulerArn(String inferenceSchedulerArn) {
        this.inferenceSchedulerArn = inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the inference scheduler.
     */

    public String getInferenceSchedulerArn() {
        return this.inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSchedulerSummary withInferenceSchedulerArn(String inferenceSchedulerArn) {
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

    public InferenceSchedulerSummary withStatus(String status) {
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

    public InferenceSchedulerSummary withStatus(InferenceSchedulerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance,
     * if an offset delay time of five minutes was selected, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     * 
     * @param dataDelayOffsetInMinutes
     *        &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For
     *        instance, if an offset delay time of five minutes was selected, inference will not begin on the data until
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
     * if an offset delay time of five minutes was selected, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     * 
     * @return &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For
     *         instance, if an offset delay time of five minutes was selected, inference will not begin on the data
     *         until the first data measurement after the five minute mark. For example, if five minutes is selected,
     *         the inference scheduler will wake up at the configured frequency with the additional five minute delay
     *         time to check the customer S3 bucket. The customer can upload data at the same frequency and they don't
     *         need to stop and restart the scheduler when uploading new data.
     */

    public Long getDataDelayOffsetInMinutes() {
        return this.dataDelayOffsetInMinutes;
    }

    /**
     * <p>
     * &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance,
     * if an offset delay time of five minutes was selected, inference will not begin on the data until the first data
     * measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will
     * wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket.
     * The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when
     * uploading new data.
     * </p>
     * 
     * @param dataDelayOffsetInMinutes
     *        &gt; A period of time (in minutes) by which inference on the data is delayed after the data starts. For
     *        instance, if an offset delay time of five minutes was selected, inference will not begin on the data until
     *        the first data measurement after the five minute mark. For example, if five minutes is selected, the
     *        inference scheduler will wake up at the configured frequency with the additional five minute delay time to
     *        check the customer S3 bucket. The customer can upload data at the same frequency and they don't need to
     *        stop and restart the scheduler when uploading new data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSchedulerSummary withDataDelayOffsetInMinutes(Long dataDelayOffsetInMinutes) {
        setDataDelayOffsetInMinutes(dataDelayOffsetInMinutes);
        return this;
    }

    /**
     * <p>
     * How often data is uploaded to the source S3 bucket for the input data. This value is the length of time between
     * data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the real-time data
     * to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout for Equipment
     * starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @param dataUploadFrequency
     *        How often data is uploaded to the source S3 bucket for the input data. This value is the length of time
     *        between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     *        real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon
     *        Lookout for Equipment starts a scheduled inference on your data. In this example, it starts once every 5
     *        minutes.
     * @see DataUploadFrequency
     */

    public void setDataUploadFrequency(String dataUploadFrequency) {
        this.dataUploadFrequency = dataUploadFrequency;
    }

    /**
     * <p>
     * How often data is uploaded to the source S3 bucket for the input data. This value is the length of time between
     * data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the real-time data
     * to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout for Equipment
     * starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @return How often data is uploaded to the source S3 bucket for the input data. This value is the length of time
     *         between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     *         real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon
     *         Lookout for Equipment starts a scheduled inference on your data. In this example, it starts once every 5
     *         minutes.
     * @see DataUploadFrequency
     */

    public String getDataUploadFrequency() {
        return this.dataUploadFrequency;
    }

    /**
     * <p>
     * How often data is uploaded to the source S3 bucket for the input data. This value is the length of time between
     * data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the real-time data
     * to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout for Equipment
     * starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @param dataUploadFrequency
     *        How often data is uploaded to the source S3 bucket for the input data. This value is the length of time
     *        between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     *        real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon
     *        Lookout for Equipment starts a scheduled inference on your data. In this example, it starts once every 5
     *        minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataUploadFrequency
     */

    public InferenceSchedulerSummary withDataUploadFrequency(String dataUploadFrequency) {
        setDataUploadFrequency(dataUploadFrequency);
        return this;
    }

    /**
     * <p>
     * How often data is uploaded to the source S3 bucket for the input data. This value is the length of time between
     * data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the real-time data
     * to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout for Equipment
     * starts a scheduled inference on your data. In this example, it starts once every 5 minutes.
     * </p>
     * 
     * @param dataUploadFrequency
     *        How often data is uploaded to the source S3 bucket for the input data. This value is the length of time
     *        between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the
     *        real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon
     *        Lookout for Equipment starts a scheduled inference on your data. In this example, it starts once every 5
     *        minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataUploadFrequency
     */

    public InferenceSchedulerSummary withDataUploadFrequency(DataUploadFrequency dataUploadFrequency) {
        this.dataUploadFrequency = dataUploadFrequency.toString();
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
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getInferenceSchedulerName() != null)
            sb.append("InferenceSchedulerName: ").append(getInferenceSchedulerName()).append(",");
        if (getInferenceSchedulerArn() != null)
            sb.append("InferenceSchedulerArn: ").append(getInferenceSchedulerArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDataDelayOffsetInMinutes() != null)
            sb.append("DataDelayOffsetInMinutes: ").append(getDataDelayOffsetInMinutes()).append(",");
        if (getDataUploadFrequency() != null)
            sb.append("DataUploadFrequency: ").append(getDataUploadFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceSchedulerSummary == false)
            return false;
        InferenceSchedulerSummary other = (InferenceSchedulerSummary) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerName() == null) ? 0 : getInferenceSchedulerName().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerArn() == null) ? 0 : getInferenceSchedulerArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDataDelayOffsetInMinutes() == null) ? 0 : getDataDelayOffsetInMinutes().hashCode());
        hashCode = prime * hashCode + ((getDataUploadFrequency() == null) ? 0 : getDataUploadFrequency().hashCode());
        return hashCode;
    }

    @Override
    public InferenceSchedulerSummary clone() {
        try {
            return (InferenceSchedulerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.InferenceSchedulerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
