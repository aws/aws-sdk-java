/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A returned array object for the <code>Steps</code> response field in the <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_InferenceRecommendationsJobStep.html"
 * >ListInferenceRecommendationsJobSteps</a> API command.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceRecommendationsJobStep"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceRecommendationsJobStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the subtask.
     * </p>
     * <p>
     * <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * </p>
     */
    private String stepType;
    /**
     * <p>
     * The name of the Inference Recommender job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The current status of the benchmark.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The details for a specific benchmark.
     * </p>
     */
    private RecommendationJobInferenceBenchmark inferenceBenchmark;

    /**
     * <p>
     * The type of the subtask.
     * </p>
     * <p>
     * <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * </p>
     * 
     * @param stepType
     *        The type of the subtask.</p>
     *        <p>
     *        <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * @see RecommendationStepType
     */

    public void setStepType(String stepType) {
        this.stepType = stepType;
    }

    /**
     * <p>
     * The type of the subtask.
     * </p>
     * <p>
     * <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * </p>
     * 
     * @return The type of the subtask.</p>
     *         <p>
     *         <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * @see RecommendationStepType
     */

    public String getStepType() {
        return this.stepType;
    }

    /**
     * <p>
     * The type of the subtask.
     * </p>
     * <p>
     * <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * </p>
     * 
     * @param stepType
     *        The type of the subtask.</p>
     *        <p>
     *        <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStepType
     */

    public InferenceRecommendationsJobStep withStepType(String stepType) {
        setStepType(stepType);
        return this;
    }

    /**
     * <p>
     * The type of the subtask.
     * </p>
     * <p>
     * <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * </p>
     * 
     * @param stepType
     *        The type of the subtask.</p>
     *        <p>
     *        <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStepType
     */

    public InferenceRecommendationsJobStep withStepType(RecommendationStepType stepType) {
        this.stepType = stepType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the Inference Recommender job.
     * </p>
     * 
     * @param jobName
     *        The name of the Inference Recommender job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the Inference Recommender job.
     * </p>
     * 
     * @return The name of the Inference Recommender job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the Inference Recommender job.
     * </p>
     * 
     * @param jobName
     *        The name of the Inference Recommender job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendationsJobStep withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The current status of the benchmark.
     * </p>
     * 
     * @param status
     *        The current status of the benchmark.
     * @see RecommendationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the benchmark.
     * </p>
     * 
     * @return The current status of the benchmark.
     * @see RecommendationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the benchmark.
     * </p>
     * 
     * @param status
     *        The current status of the benchmark.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobStatus
     */

    public InferenceRecommendationsJobStep withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the benchmark.
     * </p>
     * 
     * @param status
     *        The current status of the benchmark.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobStatus
     */

    public InferenceRecommendationsJobStep withStatus(RecommendationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The details for a specific benchmark.
     * </p>
     * 
     * @param inferenceBenchmark
     *        The details for a specific benchmark.
     */

    public void setInferenceBenchmark(RecommendationJobInferenceBenchmark inferenceBenchmark) {
        this.inferenceBenchmark = inferenceBenchmark;
    }

    /**
     * <p>
     * The details for a specific benchmark.
     * </p>
     * 
     * @return The details for a specific benchmark.
     */

    public RecommendationJobInferenceBenchmark getInferenceBenchmark() {
        return this.inferenceBenchmark;
    }

    /**
     * <p>
     * The details for a specific benchmark.
     * </p>
     * 
     * @param inferenceBenchmark
     *        The details for a specific benchmark.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceRecommendationsJobStep withInferenceBenchmark(RecommendationJobInferenceBenchmark inferenceBenchmark) {
        setInferenceBenchmark(inferenceBenchmark);
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
        if (getStepType() != null)
            sb.append("StepType: ").append(getStepType()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInferenceBenchmark() != null)
            sb.append("InferenceBenchmark: ").append(getInferenceBenchmark());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceRecommendationsJobStep == false)
            return false;
        InferenceRecommendationsJobStep other = (InferenceRecommendationsJobStep) obj;
        if (other.getStepType() == null ^ this.getStepType() == null)
            return false;
        if (other.getStepType() != null && other.getStepType().equals(this.getStepType()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInferenceBenchmark() == null ^ this.getInferenceBenchmark() == null)
            return false;
        if (other.getInferenceBenchmark() != null && other.getInferenceBenchmark().equals(this.getInferenceBenchmark()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepType() == null) ? 0 : getStepType().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInferenceBenchmark() == null) ? 0 : getInferenceBenchmark().hashCode());
        return hashCode;
    }

    @Override
    public InferenceRecommendationsJobStep clone() {
        try {
            return (InferenceRecommendationsJobStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceRecommendationsJobStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
