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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListInferenceRecommendationsJobSteps"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceRecommendationsJobStepsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the Inference Recommender job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * A filter to return benchmarks of a specified status. If this field is left empty, then all benchmarks are
     * returned.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A filter to return details about the specified type of subtask.
     * </p>
     * <p>
     * <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * </p>
     */
    private String stepType;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token that you can specify to return more results from the list. Specify this field if you have a token that
     * was returned from a previous request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name for the Inference Recommender job.
     * </p>
     * 
     * @param jobName
     *        The name for the Inference Recommender job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name for the Inference Recommender job.
     * </p>
     * 
     * @return The name for the Inference Recommender job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name for the Inference Recommender job.
     * </p>
     * 
     * @param jobName
     *        The name for the Inference Recommender job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceRecommendationsJobStepsRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * A filter to return benchmarks of a specified status. If this field is left empty, then all benchmarks are
     * returned.
     * </p>
     * 
     * @param status
     *        A filter to return benchmarks of a specified status. If this field is left empty, then all benchmarks are
     *        returned.
     * @see RecommendationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A filter to return benchmarks of a specified status. If this field is left empty, then all benchmarks are
     * returned.
     * </p>
     * 
     * @return A filter to return benchmarks of a specified status. If this field is left empty, then all benchmarks are
     *         returned.
     * @see RecommendationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A filter to return benchmarks of a specified status. If this field is left empty, then all benchmarks are
     * returned.
     * </p>
     * 
     * @param status
     *        A filter to return benchmarks of a specified status. If this field is left empty, then all benchmarks are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobStatus
     */

    public ListInferenceRecommendationsJobStepsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A filter to return benchmarks of a specified status. If this field is left empty, then all benchmarks are
     * returned.
     * </p>
     * 
     * @param status
     *        A filter to return benchmarks of a specified status. If this field is left empty, then all benchmarks are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobStatus
     */

    public ListInferenceRecommendationsJobStepsRequest withStatus(RecommendationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A filter to return details about the specified type of subtask.
     * </p>
     * <p>
     * <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * </p>
     * 
     * @param stepType
     *        A filter to return details about the specified type of subtask.</p>
     *        <p>
     *        <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * @see RecommendationStepType
     */

    public void setStepType(String stepType) {
        this.stepType = stepType;
    }

    /**
     * <p>
     * A filter to return details about the specified type of subtask.
     * </p>
     * <p>
     * <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * </p>
     * 
     * @return A filter to return details about the specified type of subtask.</p>
     *         <p>
     *         <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * @see RecommendationStepType
     */

    public String getStepType() {
        return this.stepType;
    }

    /**
     * <p>
     * A filter to return details about the specified type of subtask.
     * </p>
     * <p>
     * <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * </p>
     * 
     * @param stepType
     *        A filter to return details about the specified type of subtask.</p>
     *        <p>
     *        <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStepType
     */

    public ListInferenceRecommendationsJobStepsRequest withStepType(String stepType) {
        setStepType(stepType);
        return this;
    }

    /**
     * <p>
     * A filter to return details about the specified type of subtask.
     * </p>
     * <p>
     * <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * </p>
     * 
     * @param stepType
     *        A filter to return details about the specified type of subtask.</p>
     *        <p>
     *        <code>BENCHMARK</code>: Evaluate the performance of your model on different instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStepType
     */

    public ListInferenceRecommendationsJobStepsRequest withStepType(RecommendationStepType stepType) {
        this.stepType = stepType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceRecommendationsJobStepsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that you can specify to return more results from the list. Specify this field if you have a token that
     * was returned from a previous request.
     * </p>
     * 
     * @param nextToken
     *        A token that you can specify to return more results from the list. Specify this field if you have a token
     *        that was returned from a previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that you can specify to return more results from the list. Specify this field if you have a token that
     * was returned from a previous request.
     * </p>
     * 
     * @return A token that you can specify to return more results from the list. Specify this field if you have a token
     *         that was returned from a previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that you can specify to return more results from the list. Specify this field if you have a token that
     * was returned from a previous request.
     * </p>
     * 
     * @param nextToken
     *        A token that you can specify to return more results from the list. Specify this field if you have a token
     *        that was returned from a previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceRecommendationsJobStepsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStepType() != null)
            sb.append("StepType: ").append(getStepType()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInferenceRecommendationsJobStepsRequest == false)
            return false;
        ListInferenceRecommendationsJobStepsRequest other = (ListInferenceRecommendationsJobStepsRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStepType() == null ^ this.getStepType() == null)
            return false;
        if (other.getStepType() != null && other.getStepType().equals(this.getStepType()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStepType() == null) ? 0 : getStepType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceRecommendationsJobStepsRequest clone() {
        return (ListInferenceRecommendationsJobStepsRequest) super.clone();
    }

}
