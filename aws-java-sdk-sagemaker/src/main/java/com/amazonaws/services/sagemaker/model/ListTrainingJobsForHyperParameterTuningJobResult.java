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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobsForHyperParameterTuningJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrainingJobsForHyperParameterTuningJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of <a>TrainingJobSummary</a> objects that describe the training jobs that the
     * <code>ListTrainingJobsForHyperParameterTuningJob</code> request returned.
     * </p>
     */
    private java.util.List<HyperParameterTrainingJobSummary> trainingJobSummaries;
    /**
     * <p>
     * If the result of this <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <a>TrainingJobSummary</a> objects that describe the training jobs that the
     * <code>ListTrainingJobsForHyperParameterTuningJob</code> request returned.
     * </p>
     * 
     * @return A list of <a>TrainingJobSummary</a> objects that describe the training jobs that the
     *         <code>ListTrainingJobsForHyperParameterTuningJob</code> request returned.
     */

    public java.util.List<HyperParameterTrainingJobSummary> getTrainingJobSummaries() {
        return trainingJobSummaries;
    }

    /**
     * <p>
     * A list of <a>TrainingJobSummary</a> objects that describe the training jobs that the
     * <code>ListTrainingJobsForHyperParameterTuningJob</code> request returned.
     * </p>
     * 
     * @param trainingJobSummaries
     *        A list of <a>TrainingJobSummary</a> objects that describe the training jobs that the
     *        <code>ListTrainingJobsForHyperParameterTuningJob</code> request returned.
     */

    public void setTrainingJobSummaries(java.util.Collection<HyperParameterTrainingJobSummary> trainingJobSummaries) {
        if (trainingJobSummaries == null) {
            this.trainingJobSummaries = null;
            return;
        }

        this.trainingJobSummaries = new java.util.ArrayList<HyperParameterTrainingJobSummary>(trainingJobSummaries);
    }

    /**
     * <p>
     * A list of <a>TrainingJobSummary</a> objects that describe the training jobs that the
     * <code>ListTrainingJobsForHyperParameterTuningJob</code> request returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrainingJobSummaries(java.util.Collection)} or {@link #withTrainingJobSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param trainingJobSummaries
     *        A list of <a>TrainingJobSummary</a> objects that describe the training jobs that the
     *        <code>ListTrainingJobsForHyperParameterTuningJob</code> request returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrainingJobsForHyperParameterTuningJobResult withTrainingJobSummaries(HyperParameterTrainingJobSummary... trainingJobSummaries) {
        if (this.trainingJobSummaries == null) {
            setTrainingJobSummaries(new java.util.ArrayList<HyperParameterTrainingJobSummary>(trainingJobSummaries.length));
        }
        for (HyperParameterTrainingJobSummary ele : trainingJobSummaries) {
            this.trainingJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>TrainingJobSummary</a> objects that describe the training jobs that the
     * <code>ListTrainingJobsForHyperParameterTuningJob</code> request returned.
     * </p>
     * 
     * @param trainingJobSummaries
     *        A list of <a>TrainingJobSummary</a> objects that describe the training jobs that the
     *        <code>ListTrainingJobsForHyperParameterTuningJob</code> request returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrainingJobsForHyperParameterTuningJobResult withTrainingJobSummaries(java.util.Collection<HyperParameterTrainingJobSummary> trainingJobSummaries) {
        setTrainingJobSummaries(trainingJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the result of this <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of this <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the
     *        response includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in
     *        the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of this <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in the next request.
     * </p>
     * 
     * @return If the result of this <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the
     *         response includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in
     *         the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of this <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of this <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the
     *        response includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in
     *        the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrainingJobsForHyperParameterTuningJobResult withNextToken(String nextToken) {
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

        if (obj instanceof ListTrainingJobsForHyperParameterTuningJobResult == false)
            return false;
        ListTrainingJobsForHyperParameterTuningJobResult other = (ListTrainingJobsForHyperParameterTuningJobResult) obj;
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
    public ListTrainingJobsForHyperParameterTuningJobResult clone() {
        try {
            return (ListTrainingJobsForHyperParameterTuningJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
