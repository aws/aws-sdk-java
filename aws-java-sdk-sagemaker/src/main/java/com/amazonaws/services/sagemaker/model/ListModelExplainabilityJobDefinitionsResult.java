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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelExplainabilityJobDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelExplainabilityJobDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A JSON array in which each element is a summary for a explainability bias jobs.
     * </p>
     */
    private java.util.List<MonitoringJobDefinitionSummary> jobDefinitionSummaries;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in
     * the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A JSON array in which each element is a summary for a explainability bias jobs.
     * </p>
     * 
     * @return A JSON array in which each element is a summary for a explainability bias jobs.
     */

    public java.util.List<MonitoringJobDefinitionSummary> getJobDefinitionSummaries() {
        return jobDefinitionSummaries;
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a explainability bias jobs.
     * </p>
     * 
     * @param jobDefinitionSummaries
     *        A JSON array in which each element is a summary for a explainability bias jobs.
     */

    public void setJobDefinitionSummaries(java.util.Collection<MonitoringJobDefinitionSummary> jobDefinitionSummaries) {
        if (jobDefinitionSummaries == null) {
            this.jobDefinitionSummaries = null;
            return;
        }

        this.jobDefinitionSummaries = new java.util.ArrayList<MonitoringJobDefinitionSummary>(jobDefinitionSummaries);
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a explainability bias jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobDefinitionSummaries(java.util.Collection)} or
     * {@link #withJobDefinitionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param jobDefinitionSummaries
     *        A JSON array in which each element is a summary for a explainability bias jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelExplainabilityJobDefinitionsResult withJobDefinitionSummaries(MonitoringJobDefinitionSummary... jobDefinitionSummaries) {
        if (this.jobDefinitionSummaries == null) {
            setJobDefinitionSummaries(new java.util.ArrayList<MonitoringJobDefinitionSummary>(jobDefinitionSummaries.length));
        }
        for (MonitoringJobDefinitionSummary ele : jobDefinitionSummaries) {
            this.jobDefinitionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a explainability bias jobs.
     * </p>
     * 
     * @param jobDefinitionSummaries
     *        A JSON array in which each element is a summary for a explainability bias jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelExplainabilityJobDefinitionsResult withJobDefinitionSummaries(java.util.Collection<MonitoringJobDefinitionSummary> jobDefinitionSummaries) {
        setJobDefinitionSummaries(jobDefinitionSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in
     * the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use
     *        it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in
     * the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use
     *         it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in
     * the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use
     *        it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelExplainabilityJobDefinitionsResult withNextToken(String nextToken) {
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
        if (getJobDefinitionSummaries() != null)
            sb.append("JobDefinitionSummaries: ").append(getJobDefinitionSummaries()).append(",");
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

        if (obj instanceof ListModelExplainabilityJobDefinitionsResult == false)
            return false;
        ListModelExplainabilityJobDefinitionsResult other = (ListModelExplainabilityJobDefinitionsResult) obj;
        if (other.getJobDefinitionSummaries() == null ^ this.getJobDefinitionSummaries() == null)
            return false;
        if (other.getJobDefinitionSummaries() != null && other.getJobDefinitionSummaries().equals(this.getJobDefinitionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getJobDefinitionSummaries() == null) ? 0 : getJobDefinitionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListModelExplainabilityJobDefinitionsResult clone() {
        try {
            return (ListModelExplainabilityJobDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
