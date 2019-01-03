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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a ListPipelineExecutions action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListPipelineExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelineExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of executions in the history of a pipeline.
     * </p>
     */
    private java.util.List<PipelineExecutionSummary> pipelineExecutionSummaries;
    /**
     * <p>
     * A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue to call
     * this operation with each subsequent token until no more nextToken values are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of executions in the history of a pipeline.
     * </p>
     * 
     * @return A list of executions in the history of a pipeline.
     */

    public java.util.List<PipelineExecutionSummary> getPipelineExecutionSummaries() {
        return pipelineExecutionSummaries;
    }

    /**
     * <p>
     * A list of executions in the history of a pipeline.
     * </p>
     * 
     * @param pipelineExecutionSummaries
     *        A list of executions in the history of a pipeline.
     */

    public void setPipelineExecutionSummaries(java.util.Collection<PipelineExecutionSummary> pipelineExecutionSummaries) {
        if (pipelineExecutionSummaries == null) {
            this.pipelineExecutionSummaries = null;
            return;
        }

        this.pipelineExecutionSummaries = new java.util.ArrayList<PipelineExecutionSummary>(pipelineExecutionSummaries);
    }

    /**
     * <p>
     * A list of executions in the history of a pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineExecutionSummaries(java.util.Collection)} or
     * {@link #withPipelineExecutionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pipelineExecutionSummaries
     *        A list of executions in the history of a pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionsResult withPipelineExecutionSummaries(PipelineExecutionSummary... pipelineExecutionSummaries) {
        if (this.pipelineExecutionSummaries == null) {
            setPipelineExecutionSummaries(new java.util.ArrayList<PipelineExecutionSummary>(pipelineExecutionSummaries.length));
        }
        for (PipelineExecutionSummary ele : pipelineExecutionSummaries) {
            this.pipelineExecutionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of executions in the history of a pipeline.
     * </p>
     * 
     * @param pipelineExecutionSummaries
     *        A list of executions in the history of a pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionsResult withPipelineExecutionSummaries(java.util.Collection<PipelineExecutionSummary> pipelineExecutionSummaries) {
        setPipelineExecutionSummaries(pipelineExecutionSummaries);
        return this;
    }

    /**
     * <p>
     * A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue to call
     * this operation with each subsequent token until no more nextToken values are returned.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue
     *        to call this operation with each subsequent token until no more nextToken values are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue to call
     * this operation with each subsequent token until no more nextToken values are returned.
     * </p>
     * 
     * @return A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue
     *         to call this operation with each subsequent token until no more nextToken values are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue to call
     * this operation with each subsequent token until no more nextToken values are returned.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue
     *        to call this operation with each subsequent token until no more nextToken values are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionsResult withNextToken(String nextToken) {
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
        if (getPipelineExecutionSummaries() != null)
            sb.append("PipelineExecutionSummaries: ").append(getPipelineExecutionSummaries()).append(",");
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

        if (obj instanceof ListPipelineExecutionsResult == false)
            return false;
        ListPipelineExecutionsResult other = (ListPipelineExecutionsResult) obj;
        if (other.getPipelineExecutionSummaries() == null ^ this.getPipelineExecutionSummaries() == null)
            return false;
        if (other.getPipelineExecutionSummaries() != null && other.getPipelineExecutionSummaries().equals(this.getPipelineExecutionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getPipelineExecutionSummaries() == null) ? 0 : getPipelineExecutionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelineExecutionsResult clone() {
        try {
            return (ListPipelineExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
