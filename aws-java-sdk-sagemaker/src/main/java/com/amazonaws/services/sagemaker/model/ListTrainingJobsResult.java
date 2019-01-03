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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrainingJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>TrainingJobSummary</code> objects, each listing a training job.
     * </p>
     */
    private java.util.List<TrainingJobSummary> trainingJobSummaries;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use
     * it in the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>TrainingJobSummary</code> objects, each listing a training job.
     * </p>
     * 
     * @return An array of <code>TrainingJobSummary</code> objects, each listing a training job.
     */

    public java.util.List<TrainingJobSummary> getTrainingJobSummaries() {
        return trainingJobSummaries;
    }

    /**
     * <p>
     * An array of <code>TrainingJobSummary</code> objects, each listing a training job.
     * </p>
     * 
     * @param trainingJobSummaries
     *        An array of <code>TrainingJobSummary</code> objects, each listing a training job.
     */

    public void setTrainingJobSummaries(java.util.Collection<TrainingJobSummary> trainingJobSummaries) {
        if (trainingJobSummaries == null) {
            this.trainingJobSummaries = null;
            return;
        }

        this.trainingJobSummaries = new java.util.ArrayList<TrainingJobSummary>(trainingJobSummaries);
    }

    /**
     * <p>
     * An array of <code>TrainingJobSummary</code> objects, each listing a training job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrainingJobSummaries(java.util.Collection)} or {@link #withTrainingJobSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param trainingJobSummaries
     *        An array of <code>TrainingJobSummary</code> objects, each listing a training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrainingJobsResult withTrainingJobSummaries(TrainingJobSummary... trainingJobSummaries) {
        if (this.trainingJobSummaries == null) {
            setTrainingJobSummaries(new java.util.ArrayList<TrainingJobSummary>(trainingJobSummaries.length));
        }
        for (TrainingJobSummary ele : trainingJobSummaries) {
            this.trainingJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>TrainingJobSummary</code> objects, each listing a training job.
     * </p>
     * 
     * @param trainingJobSummaries
     *        An array of <code>TrainingJobSummary</code> objects, each listing a training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrainingJobsResult withTrainingJobSummaries(java.util.Collection<TrainingJobSummary> trainingJobSummaries) {
        setTrainingJobSummaries(trainingJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use
     * it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training
     *        jobs, use it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use
     * it in the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training
     *         jobs, use it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use
     * it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training
     *        jobs, use it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrainingJobsResult withNextToken(String nextToken) {
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
        if (getTrainingJobSummaries() != null)
            sb.append("TrainingJobSummaries: ").append(getTrainingJobSummaries()).append(",");
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

        if (obj instanceof ListTrainingJobsResult == false)
            return false;
        ListTrainingJobsResult other = (ListTrainingJobsResult) obj;
        if (other.getTrainingJobSummaries() == null ^ this.getTrainingJobSummaries() == null)
            return false;
        if (other.getTrainingJobSummaries() != null && other.getTrainingJobSummaries().equals(this.getTrainingJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getTrainingJobSummaries() == null) ? 0 : getTrainingJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTrainingJobsResult clone() {
        try {
            return (ListTrainingJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
