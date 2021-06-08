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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a sorted list of <code>PipelineSummary</code> objects matching the specified filters. Each
     * <code>PipelineSummary</code> consists of PipelineArn, PipelineName, ExperimentName, PipelineDescription,
     * CreationTime, LastModifiedTime, LastRunTime, and RoleArn. This list can be empty.
     * </p>
     */
    private java.util.List<PipelineSummary> pipelineSummaries;
    /**
     * <p>
     * If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains a sorted list of <code>PipelineSummary</code> objects matching the specified filters. Each
     * <code>PipelineSummary</code> consists of PipelineArn, PipelineName, ExperimentName, PipelineDescription,
     * CreationTime, LastModifiedTime, LastRunTime, and RoleArn. This list can be empty.
     * </p>
     * 
     * @return Contains a sorted list of <code>PipelineSummary</code> objects matching the specified filters. Each
     *         <code>PipelineSummary</code> consists of PipelineArn, PipelineName, ExperimentName, PipelineDescription,
     *         CreationTime, LastModifiedTime, LastRunTime, and RoleArn. This list can be empty.
     */

    public java.util.List<PipelineSummary> getPipelineSummaries() {
        return pipelineSummaries;
    }

    /**
     * <p>
     * Contains a sorted list of <code>PipelineSummary</code> objects matching the specified filters. Each
     * <code>PipelineSummary</code> consists of PipelineArn, PipelineName, ExperimentName, PipelineDescription,
     * CreationTime, LastModifiedTime, LastRunTime, and RoleArn. This list can be empty.
     * </p>
     * 
     * @param pipelineSummaries
     *        Contains a sorted list of <code>PipelineSummary</code> objects matching the specified filters. Each
     *        <code>PipelineSummary</code> consists of PipelineArn, PipelineName, ExperimentName, PipelineDescription,
     *        CreationTime, LastModifiedTime, LastRunTime, and RoleArn. This list can be empty.
     */

    public void setPipelineSummaries(java.util.Collection<PipelineSummary> pipelineSummaries) {
        if (pipelineSummaries == null) {
            this.pipelineSummaries = null;
            return;
        }

        this.pipelineSummaries = new java.util.ArrayList<PipelineSummary>(pipelineSummaries);
    }

    /**
     * <p>
     * Contains a sorted list of <code>PipelineSummary</code> objects matching the specified filters. Each
     * <code>PipelineSummary</code> consists of PipelineArn, PipelineName, ExperimentName, PipelineDescription,
     * CreationTime, LastModifiedTime, LastRunTime, and RoleArn. This list can be empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineSummaries(java.util.Collection)} or {@link #withPipelineSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param pipelineSummaries
     *        Contains a sorted list of <code>PipelineSummary</code> objects matching the specified filters. Each
     *        <code>PipelineSummary</code> consists of PipelineArn, PipelineName, ExperimentName, PipelineDescription,
     *        CreationTime, LastModifiedTime, LastRunTime, and RoleArn. This list can be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelineSummaries(PipelineSummary... pipelineSummaries) {
        if (this.pipelineSummaries == null) {
            setPipelineSummaries(new java.util.ArrayList<PipelineSummary>(pipelineSummaries.length));
        }
        for (PipelineSummary ele : pipelineSummaries) {
            this.pipelineSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a sorted list of <code>PipelineSummary</code> objects matching the specified filters. Each
     * <code>PipelineSummary</code> consists of PipelineArn, PipelineName, ExperimentName, PipelineDescription,
     * CreationTime, LastModifiedTime, LastRunTime, and RoleArn. This list can be empty.
     * </p>
     * 
     * @param pipelineSummaries
     *        Contains a sorted list of <code>PipelineSummary</code> objects matching the specified filters. Each
     *        <code>PipelineSummary</code> consists of PipelineArn, PipelineName, ExperimentName, PipelineDescription,
     *        CreationTime, LastModifiedTime, LastRunTime, and RoleArn. This list can be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelineSummaries(java.util.Collection<PipelineSummary> pipelineSummaries) {
        setPipelineSummaries(pipelineSummaries);
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     * </p>
     * 
     * @return If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     *         <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withNextToken(String nextToken) {
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
        if (getPipelineSummaries() != null)
            sb.append("PipelineSummaries: ").append(getPipelineSummaries()).append(",");
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

        if (obj instanceof ListPipelinesResult == false)
            return false;
        ListPipelinesResult other = (ListPipelinesResult) obj;
        if (other.getPipelineSummaries() == null ^ this.getPipelineSummaries() == null)
            return false;
        if (other.getPipelineSummaries() != null && other.getPipelineSummaries().equals(this.getPipelineSummaries()) == false)
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

        hashCode = prime * hashCode + ((getPipelineSummaries() == null) ? 0 : getPipelineSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelinesResult clone() {
        try {
            return (ListPipelinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
