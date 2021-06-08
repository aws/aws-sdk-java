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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An execution of a step in a pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PipelineExecutionStep" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineExecutionStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the step that is executed.
     * </p>
     */
    private String stepName;
    /**
     * <p>
     * The time that the step started executing.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time that the step stopped executing.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The status of the step execution.
     * </p>
     */
    private String stepStatus;
    /**
     * <p>
     * If this pipeline execution step was cached, details on the cache hit.
     * </p>
     */
    private CacheHitResult cacheHitResult;
    /**
     * <p>
     * The reason why the step failed execution. This is only returned if the step failed its execution.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Metadata for the step execution.
     * </p>
     */
    private PipelineExecutionStepMetadata metadata;

    /**
     * <p>
     * The name of the step that is executed.
     * </p>
     * 
     * @param stepName
     *        The name of the step that is executed.
     */

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The name of the step that is executed.
     * </p>
     * 
     * @return The name of the step that is executed.
     */

    public String getStepName() {
        return this.stepName;
    }

    /**
     * <p>
     * The name of the step that is executed.
     * </p>
     * 
     * @param stepName
     *        The name of the step that is executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStep withStepName(String stepName) {
        setStepName(stepName);
        return this;
    }

    /**
     * <p>
     * The time that the step started executing.
     * </p>
     * 
     * @param startTime
     *        The time that the step started executing.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the step started executing.
     * </p>
     * 
     * @return The time that the step started executing.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the step started executing.
     * </p>
     * 
     * @param startTime
     *        The time that the step started executing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStep withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time that the step stopped executing.
     * </p>
     * 
     * @param endTime
     *        The time that the step stopped executing.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the step stopped executing.
     * </p>
     * 
     * @return The time that the step stopped executing.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the step stopped executing.
     * </p>
     * 
     * @param endTime
     *        The time that the step stopped executing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStep withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The status of the step execution.
     * </p>
     * 
     * @param stepStatus
     *        The status of the step execution.
     * @see StepStatus
     */

    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    /**
     * <p>
     * The status of the step execution.
     * </p>
     * 
     * @return The status of the step execution.
     * @see StepStatus
     */

    public String getStepStatus() {
        return this.stepStatus;
    }

    /**
     * <p>
     * The status of the step execution.
     * </p>
     * 
     * @param stepStatus
     *        The status of the step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepStatus
     */

    public PipelineExecutionStep withStepStatus(String stepStatus) {
        setStepStatus(stepStatus);
        return this;
    }

    /**
     * <p>
     * The status of the step execution.
     * </p>
     * 
     * @param stepStatus
     *        The status of the step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepStatus
     */

    public PipelineExecutionStep withStepStatus(StepStatus stepStatus) {
        this.stepStatus = stepStatus.toString();
        return this;
    }

    /**
     * <p>
     * If this pipeline execution step was cached, details on the cache hit.
     * </p>
     * 
     * @param cacheHitResult
     *        If this pipeline execution step was cached, details on the cache hit.
     */

    public void setCacheHitResult(CacheHitResult cacheHitResult) {
        this.cacheHitResult = cacheHitResult;
    }

    /**
     * <p>
     * If this pipeline execution step was cached, details on the cache hit.
     * </p>
     * 
     * @return If this pipeline execution step was cached, details on the cache hit.
     */

    public CacheHitResult getCacheHitResult() {
        return this.cacheHitResult;
    }

    /**
     * <p>
     * If this pipeline execution step was cached, details on the cache hit.
     * </p>
     * 
     * @param cacheHitResult
     *        If this pipeline execution step was cached, details on the cache hit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStep withCacheHitResult(CacheHitResult cacheHitResult) {
        setCacheHitResult(cacheHitResult);
        return this;
    }

    /**
     * <p>
     * The reason why the step failed execution. This is only returned if the step failed its execution.
     * </p>
     * 
     * @param failureReason
     *        The reason why the step failed execution. This is only returned if the step failed its execution.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the step failed execution. This is only returned if the step failed its execution.
     * </p>
     * 
     * @return The reason why the step failed execution. This is only returned if the step failed its execution.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason why the step failed execution. This is only returned if the step failed its execution.
     * </p>
     * 
     * @param failureReason
     *        The reason why the step failed execution. This is only returned if the step failed its execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStep withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Metadata for the step execution.
     * </p>
     * 
     * @param metadata
     *        Metadata for the step execution.
     */

    public void setMetadata(PipelineExecutionStepMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata for the step execution.
     * </p>
     * 
     * @return Metadata for the step execution.
     */

    public PipelineExecutionStepMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Metadata for the step execution.
     * </p>
     * 
     * @param metadata
     *        Metadata for the step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStep withMetadata(PipelineExecutionStepMetadata metadata) {
        setMetadata(metadata);
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
        if (getStepName() != null)
            sb.append("StepName: ").append(getStepName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStepStatus() != null)
            sb.append("StepStatus: ").append(getStepStatus()).append(",");
        if (getCacheHitResult() != null)
            sb.append("CacheHitResult: ").append(getCacheHitResult()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineExecutionStep == false)
            return false;
        PipelineExecutionStep other = (PipelineExecutionStep) obj;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStepStatus() == null ^ this.getStepStatus() == null)
            return false;
        if (other.getStepStatus() != null && other.getStepStatus().equals(this.getStepStatus()) == false)
            return false;
        if (other.getCacheHitResult() == null ^ this.getCacheHitResult() == null)
            return false;
        if (other.getCacheHitResult() != null && other.getCacheHitResult().equals(this.getCacheHitResult()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStepStatus() == null) ? 0 : getStepStatus().hashCode());
        hashCode = prime * hashCode + ((getCacheHitResult() == null) ? 0 : getCacheHitResult().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public PipelineExecutionStep clone() {
        try {
            return (PipelineExecutionStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PipelineExecutionStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
