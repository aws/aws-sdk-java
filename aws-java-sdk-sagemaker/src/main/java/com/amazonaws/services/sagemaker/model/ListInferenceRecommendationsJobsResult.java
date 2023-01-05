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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListInferenceRecommendationsJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceRecommendationsJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The recommendations created from the Amazon SageMaker Inference Recommender job.
     * </p>
     */
    private java.util.List<InferenceRecommendationsJob> inferenceRecommendationsJobs;
    /**
     * <p>
     * A token for getting the next set of recommendations, if there are any.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The recommendations created from the Amazon SageMaker Inference Recommender job.
     * </p>
     * 
     * @return The recommendations created from the Amazon SageMaker Inference Recommender job.
     */

    public java.util.List<InferenceRecommendationsJob> getInferenceRecommendationsJobs() {
        return inferenceRecommendationsJobs;
    }

    /**
     * <p>
     * The recommendations created from the Amazon SageMaker Inference Recommender job.
     * </p>
     * 
     * @param inferenceRecommendationsJobs
     *        The recommendations created from the Amazon SageMaker Inference Recommender job.
     */

    public void setInferenceRecommendationsJobs(java.util.Collection<InferenceRecommendationsJob> inferenceRecommendationsJobs) {
        if (inferenceRecommendationsJobs == null) {
            this.inferenceRecommendationsJobs = null;
            return;
        }

        this.inferenceRecommendationsJobs = new java.util.ArrayList<InferenceRecommendationsJob>(inferenceRecommendationsJobs);
    }

    /**
     * <p>
     * The recommendations created from the Amazon SageMaker Inference Recommender job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceRecommendationsJobs(java.util.Collection)} or
     * {@link #withInferenceRecommendationsJobs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inferenceRecommendationsJobs
     *        The recommendations created from the Amazon SageMaker Inference Recommender job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceRecommendationsJobsResult withInferenceRecommendationsJobs(InferenceRecommendationsJob... inferenceRecommendationsJobs) {
        if (this.inferenceRecommendationsJobs == null) {
            setInferenceRecommendationsJobs(new java.util.ArrayList<InferenceRecommendationsJob>(inferenceRecommendationsJobs.length));
        }
        for (InferenceRecommendationsJob ele : inferenceRecommendationsJobs) {
            this.inferenceRecommendationsJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recommendations created from the Amazon SageMaker Inference Recommender job.
     * </p>
     * 
     * @param inferenceRecommendationsJobs
     *        The recommendations created from the Amazon SageMaker Inference Recommender job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceRecommendationsJobsResult withInferenceRecommendationsJobs(
            java.util.Collection<InferenceRecommendationsJob> inferenceRecommendationsJobs) {
        setInferenceRecommendationsJobs(inferenceRecommendationsJobs);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of recommendations, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of recommendations, if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of recommendations, if there are any.
     * </p>
     * 
     * @return A token for getting the next set of recommendations, if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of recommendations, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of recommendations, if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceRecommendationsJobsResult withNextToken(String nextToken) {
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
        if (getInferenceRecommendationsJobs() != null)
            sb.append("InferenceRecommendationsJobs: ").append(getInferenceRecommendationsJobs()).append(",");
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

        if (obj instanceof ListInferenceRecommendationsJobsResult == false)
            return false;
        ListInferenceRecommendationsJobsResult other = (ListInferenceRecommendationsJobsResult) obj;
        if (other.getInferenceRecommendationsJobs() == null ^ this.getInferenceRecommendationsJobs() == null)
            return false;
        if (other.getInferenceRecommendationsJobs() != null && other.getInferenceRecommendationsJobs().equals(this.getInferenceRecommendationsJobs()) == false)
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

        hashCode = prime * hashCode + ((getInferenceRecommendationsJobs() == null) ? 0 : getInferenceRecommendationsJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceRecommendationsJobsResult clone() {
        try {
            return (ListInferenceRecommendationsJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
