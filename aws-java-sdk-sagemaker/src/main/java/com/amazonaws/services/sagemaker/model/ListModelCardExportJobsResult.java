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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelCardExportJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelCardExportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summaries of the listed model card export jobs.
     * </p>
     */
    private java.util.List<ModelCardExportJobSummary> modelCardExportJobSummaries;
    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model card export jobs,
     * use it in the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The summaries of the listed model card export jobs.
     * </p>
     * 
     * @return The summaries of the listed model card export jobs.
     */

    public java.util.List<ModelCardExportJobSummary> getModelCardExportJobSummaries() {
        return modelCardExportJobSummaries;
    }

    /**
     * <p>
     * The summaries of the listed model card export jobs.
     * </p>
     * 
     * @param modelCardExportJobSummaries
     *        The summaries of the listed model card export jobs.
     */

    public void setModelCardExportJobSummaries(java.util.Collection<ModelCardExportJobSummary> modelCardExportJobSummaries) {
        if (modelCardExportJobSummaries == null) {
            this.modelCardExportJobSummaries = null;
            return;
        }

        this.modelCardExportJobSummaries = new java.util.ArrayList<ModelCardExportJobSummary>(modelCardExportJobSummaries);
    }

    /**
     * <p>
     * The summaries of the listed model card export jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelCardExportJobSummaries(java.util.Collection)} or
     * {@link #withModelCardExportJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param modelCardExportJobSummaries
     *        The summaries of the listed model card export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardExportJobsResult withModelCardExportJobSummaries(ModelCardExportJobSummary... modelCardExportJobSummaries) {
        if (this.modelCardExportJobSummaries == null) {
            setModelCardExportJobSummaries(new java.util.ArrayList<ModelCardExportJobSummary>(modelCardExportJobSummaries.length));
        }
        for (ModelCardExportJobSummary ele : modelCardExportJobSummaries) {
            this.modelCardExportJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summaries of the listed model card export jobs.
     * </p>
     * 
     * @param modelCardExportJobSummaries
     *        The summaries of the listed model card export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardExportJobsResult withModelCardExportJobSummaries(java.util.Collection<ModelCardExportJobSummary> modelCardExportJobSummaries) {
        setModelCardExportJobSummaries(modelCardExportJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model card export jobs,
     * use it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of model card export
     *        jobs, use it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model card export jobs,
     * use it in the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, SageMaker returns this token. To retrieve the next set of model card export
     *         jobs, use it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model card export jobs,
     * use it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of model card export
     *        jobs, use it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardExportJobsResult withNextToken(String nextToken) {
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
        if (getModelCardExportJobSummaries() != null)
            sb.append("ModelCardExportJobSummaries: ").append(getModelCardExportJobSummaries()).append(",");
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

        if (obj instanceof ListModelCardExportJobsResult == false)
            return false;
        ListModelCardExportJobsResult other = (ListModelCardExportJobsResult) obj;
        if (other.getModelCardExportJobSummaries() == null ^ this.getModelCardExportJobSummaries() == null)
            return false;
        if (other.getModelCardExportJobSummaries() != null && other.getModelCardExportJobSummaries().equals(this.getModelCardExportJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getModelCardExportJobSummaries() == null) ? 0 : getModelCardExportJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListModelCardExportJobsResult clone() {
        try {
            return (ListModelCardExportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
