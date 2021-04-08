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
 * Contains information about the specific inference execution, including input and output data configuration, inference
 * scheduling information, status, and so on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/InferenceExecutionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceExecutionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the ML model being used for the inference execution.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used for the inference execution.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The name of the inference scheduler being used for the inference execution.
     * </p>
     */
    private String inferenceSchedulerName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being used for the inference execution.
     * </p>
     */
    private String inferenceSchedulerArn;
    /**
     * <p>
     * Indicates the start time at which the inference scheduler began the specific inference execution.
     * </p>
     */
    private java.util.Date scheduledStartTime;
    /**
     * <p>
     * Indicates the time reference in the dataset at which the inference execution began.
     * </p>
     */
    private java.util.Date dataStartTime;
    /**
     * <p>
     * Indicates the time reference in the dataset at which the inference execution stopped.
     * </p>
     */
    private java.util.Date dataEndTime;
    /**
     * <p>
     * Specifies configuration information for the input data for the inference scheduler, including delimiter, format,
     * and dataset location.
     * </p>
     */
    private InferenceInputConfiguration dataInputConfiguration;
    /**
     * <p>
     * Specifies configuration information for the output results from for the inference execution, including the output
     * S3 location.
     * </p>
     */
    private InferenceOutputConfiguration dataOutputConfiguration;
    /**
     * <p>
     * </p>
     */
    private S3Object customerResultObject;
    /**
     * <p>
     * Indicates the status of the inference execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the reason for failure when an inference execution has failed.
     * </p>
     */
    private String failedReason;

    /**
     * <p>
     * The name of the ML model being used for the inference execution.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model being used for the inference execution.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the ML model being used for the inference execution.
     * </p>
     * 
     * @return The name of the ML model being used for the inference execution.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the ML model being used for the inference execution.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model being used for the inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExecutionSummary withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used for the inference execution.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model used for the inference execution.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used for the inference execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ML model used for the inference execution.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used for the inference execution.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model used for the inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExecutionSummary withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The name of the inference scheduler being used for the inference execution.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler being used for the inference execution.
     */

    public void setInferenceSchedulerName(String inferenceSchedulerName) {
        this.inferenceSchedulerName = inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler being used for the inference execution.
     * </p>
     * 
     * @return The name of the inference scheduler being used for the inference execution.
     */

    public String getInferenceSchedulerName() {
        return this.inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler being used for the inference execution.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler being used for the inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExecutionSummary withInferenceSchedulerName(String inferenceSchedulerName) {
        setInferenceSchedulerName(inferenceSchedulerName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being used for the inference execution.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference scheduler being used for the inference execution.
     */

    public void setInferenceSchedulerArn(String inferenceSchedulerArn) {
        this.inferenceSchedulerArn = inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being used for the inference execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the inference scheduler being used for the inference execution.
     */

    public String getInferenceSchedulerArn() {
        return this.inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being used for the inference execution.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference scheduler being used for the inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExecutionSummary withInferenceSchedulerArn(String inferenceSchedulerArn) {
        setInferenceSchedulerArn(inferenceSchedulerArn);
        return this;
    }

    /**
     * <p>
     * Indicates the start time at which the inference scheduler began the specific inference execution.
     * </p>
     * 
     * @param scheduledStartTime
     *        Indicates the start time at which the inference scheduler began the specific inference execution.
     */

    public void setScheduledStartTime(java.util.Date scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
    }

    /**
     * <p>
     * Indicates the start time at which the inference scheduler began the specific inference execution.
     * </p>
     * 
     * @return Indicates the start time at which the inference scheduler began the specific inference execution.
     */

    public java.util.Date getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    /**
     * <p>
     * Indicates the start time at which the inference scheduler began the specific inference execution.
     * </p>
     * 
     * @param scheduledStartTime
     *        Indicates the start time at which the inference scheduler began the specific inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExecutionSummary withScheduledStartTime(java.util.Date scheduledStartTime) {
        setScheduledStartTime(scheduledStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset at which the inference execution began.
     * </p>
     * 
     * @param dataStartTime
     *        Indicates the time reference in the dataset at which the inference execution began.
     */

    public void setDataStartTime(java.util.Date dataStartTime) {
        this.dataStartTime = dataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset at which the inference execution began.
     * </p>
     * 
     * @return Indicates the time reference in the dataset at which the inference execution began.
     */

    public java.util.Date getDataStartTime() {
        return this.dataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset at which the inference execution began.
     * </p>
     * 
     * @param dataStartTime
     *        Indicates the time reference in the dataset at which the inference execution began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExecutionSummary withDataStartTime(java.util.Date dataStartTime) {
        setDataStartTime(dataStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset at which the inference execution stopped.
     * </p>
     * 
     * @param dataEndTime
     *        Indicates the time reference in the dataset at which the inference execution stopped.
     */

    public void setDataEndTime(java.util.Date dataEndTime) {
        this.dataEndTime = dataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset at which the inference execution stopped.
     * </p>
     * 
     * @return Indicates the time reference in the dataset at which the inference execution stopped.
     */

    public java.util.Date getDataEndTime() {
        return this.dataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference in the dataset at which the inference execution stopped.
     * </p>
     * 
     * @param dataEndTime
     *        Indicates the time reference in the dataset at which the inference execution stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExecutionSummary withDataEndTime(java.util.Date dataEndTime) {
        setDataEndTime(dataEndTime);
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

    public InferenceExecutionSummary withDataInputConfiguration(InferenceInputConfiguration dataInputConfiguration) {
        setDataInputConfiguration(dataInputConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information for the output results from for the inference execution, including the output
     * S3 location.
     * </p>
     * 
     * @param dataOutputConfiguration
     *        Specifies configuration information for the output results from for the inference execution, including the
     *        output S3 location.
     */

    public void setDataOutputConfiguration(InferenceOutputConfiguration dataOutputConfiguration) {
        this.dataOutputConfiguration = dataOutputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the output results from for the inference execution, including the output
     * S3 location.
     * </p>
     * 
     * @return Specifies configuration information for the output results from for the inference execution, including
     *         the output S3 location.
     */

    public InferenceOutputConfiguration getDataOutputConfiguration() {
        return this.dataOutputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the output results from for the inference execution, including the output
     * S3 location.
     * </p>
     * 
     * @param dataOutputConfiguration
     *        Specifies configuration information for the output results from for the inference execution, including the
     *        output S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExecutionSummary withDataOutputConfiguration(InferenceOutputConfiguration dataOutputConfiguration) {
        setDataOutputConfiguration(dataOutputConfiguration);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param customerResultObject
     */

    public void setCustomerResultObject(S3Object customerResultObject) {
        this.customerResultObject = customerResultObject;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public S3Object getCustomerResultObject() {
        return this.customerResultObject;
    }

    /**
     * <p>
     * </p>
     * 
     * @param customerResultObject
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExecutionSummary withCustomerResultObject(S3Object customerResultObject) {
        setCustomerResultObject(customerResultObject);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the inference execution.
     * </p>
     * 
     * @param status
     *        Indicates the status of the inference execution.
     * @see InferenceExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the inference execution.
     * </p>
     * 
     * @return Indicates the status of the inference execution.
     * @see InferenceExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the inference execution.
     * </p>
     * 
     * @param status
     *        Indicates the status of the inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExecutionStatus
     */

    public InferenceExecutionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the inference execution.
     * </p>
     * 
     * @param status
     *        Indicates the status of the inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExecutionStatus
     */

    public InferenceExecutionSummary withStatus(InferenceExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the reason for failure when an inference execution has failed.
     * </p>
     * 
     * @param failedReason
     *        Specifies the reason for failure when an inference execution has failed.
     */

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    /**
     * <p>
     * Specifies the reason for failure when an inference execution has failed.
     * </p>
     * 
     * @return Specifies the reason for failure when an inference execution has failed.
     */

    public String getFailedReason() {
        return this.failedReason;
    }

    /**
     * <p>
     * Specifies the reason for failure when an inference execution has failed.
     * </p>
     * 
     * @param failedReason
     *        Specifies the reason for failure when an inference execution has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExecutionSummary withFailedReason(String failedReason) {
        setFailedReason(failedReason);
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
        if (getScheduledStartTime() != null)
            sb.append("ScheduledStartTime: ").append(getScheduledStartTime()).append(",");
        if (getDataStartTime() != null)
            sb.append("DataStartTime: ").append(getDataStartTime()).append(",");
        if (getDataEndTime() != null)
            sb.append("DataEndTime: ").append(getDataEndTime()).append(",");
        if (getDataInputConfiguration() != null)
            sb.append("DataInputConfiguration: ").append(getDataInputConfiguration()).append(",");
        if (getDataOutputConfiguration() != null)
            sb.append("DataOutputConfiguration: ").append(getDataOutputConfiguration()).append(",");
        if (getCustomerResultObject() != null)
            sb.append("CustomerResultObject: ").append(getCustomerResultObject()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailedReason() != null)
            sb.append("FailedReason: ").append(getFailedReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceExecutionSummary == false)
            return false;
        InferenceExecutionSummary other = (InferenceExecutionSummary) obj;
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
        if (other.getScheduledStartTime() == null ^ this.getScheduledStartTime() == null)
            return false;
        if (other.getScheduledStartTime() != null && other.getScheduledStartTime().equals(this.getScheduledStartTime()) == false)
            return false;
        if (other.getDataStartTime() == null ^ this.getDataStartTime() == null)
            return false;
        if (other.getDataStartTime() != null && other.getDataStartTime().equals(this.getDataStartTime()) == false)
            return false;
        if (other.getDataEndTime() == null ^ this.getDataEndTime() == null)
            return false;
        if (other.getDataEndTime() != null && other.getDataEndTime().equals(this.getDataEndTime()) == false)
            return false;
        if (other.getDataInputConfiguration() == null ^ this.getDataInputConfiguration() == null)
            return false;
        if (other.getDataInputConfiguration() != null && other.getDataInputConfiguration().equals(this.getDataInputConfiguration()) == false)
            return false;
        if (other.getDataOutputConfiguration() == null ^ this.getDataOutputConfiguration() == null)
            return false;
        if (other.getDataOutputConfiguration() != null && other.getDataOutputConfiguration().equals(this.getDataOutputConfiguration()) == false)
            return false;
        if (other.getCustomerResultObject() == null ^ this.getCustomerResultObject() == null)
            return false;
        if (other.getCustomerResultObject() != null && other.getCustomerResultObject().equals(this.getCustomerResultObject()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailedReason() == null ^ this.getFailedReason() == null)
            return false;
        if (other.getFailedReason() != null && other.getFailedReason().equals(this.getFailedReason()) == false)
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
        hashCode = prime * hashCode + ((getScheduledStartTime() == null) ? 0 : getScheduledStartTime().hashCode());
        hashCode = prime * hashCode + ((getDataStartTime() == null) ? 0 : getDataStartTime().hashCode());
        hashCode = prime * hashCode + ((getDataEndTime() == null) ? 0 : getDataEndTime().hashCode());
        hashCode = prime * hashCode + ((getDataInputConfiguration() == null) ? 0 : getDataInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataOutputConfiguration() == null) ? 0 : getDataOutputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomerResultObject() == null) ? 0 : getCustomerResultObject().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailedReason() == null) ? 0 : getFailedReason().hashCode());
        return hashCode;
    }

    @Override
    public InferenceExecutionSummary clone() {
        try {
            return (InferenceExecutionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.InferenceExecutionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
