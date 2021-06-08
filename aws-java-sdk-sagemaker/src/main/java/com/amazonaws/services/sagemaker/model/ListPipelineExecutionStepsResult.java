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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelineExecutionSteps"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelineExecutionStepsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>PipeLineExecutionStep</code> objects. Each <code>PipeLineExecutionStep</code> consists of
     * StepName, StartTime, EndTime, StepStatus, and Metadata. Metadata is an object with properties for each job that
     * contains relevant information about the job created by the step.
     * </p>
     */
    private java.util.List<PipelineExecutionStep> pipelineExecutionSteps;
    /**
     * <p>
     * If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in the
     * next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>PipeLineExecutionStep</code> objects. Each <code>PipeLineExecutionStep</code> consists of
     * StepName, StartTime, EndTime, StepStatus, and Metadata. Metadata is an object with properties for each job that
     * contains relevant information about the job created by the step.
     * </p>
     * 
     * @return A list of <code>PipeLineExecutionStep</code> objects. Each <code>PipeLineExecutionStep</code> consists of
     *         StepName, StartTime, EndTime, StepStatus, and Metadata. Metadata is an object with properties for each
     *         job that contains relevant information about the job created by the step.
     */

    public java.util.List<PipelineExecutionStep> getPipelineExecutionSteps() {
        return pipelineExecutionSteps;
    }

    /**
     * <p>
     * A list of <code>PipeLineExecutionStep</code> objects. Each <code>PipeLineExecutionStep</code> consists of
     * StepName, StartTime, EndTime, StepStatus, and Metadata. Metadata is an object with properties for each job that
     * contains relevant information about the job created by the step.
     * </p>
     * 
     * @param pipelineExecutionSteps
     *        A list of <code>PipeLineExecutionStep</code> objects. Each <code>PipeLineExecutionStep</code> consists of
     *        StepName, StartTime, EndTime, StepStatus, and Metadata. Metadata is an object with properties for each job
     *        that contains relevant information about the job created by the step.
     */

    public void setPipelineExecutionSteps(java.util.Collection<PipelineExecutionStep> pipelineExecutionSteps) {
        if (pipelineExecutionSteps == null) {
            this.pipelineExecutionSteps = null;
            return;
        }

        this.pipelineExecutionSteps = new java.util.ArrayList<PipelineExecutionStep>(pipelineExecutionSteps);
    }

    /**
     * <p>
     * A list of <code>PipeLineExecutionStep</code> objects. Each <code>PipeLineExecutionStep</code> consists of
     * StepName, StartTime, EndTime, StepStatus, and Metadata. Metadata is an object with properties for each job that
     * contains relevant information about the job created by the step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineExecutionSteps(java.util.Collection)} or
     * {@link #withPipelineExecutionSteps(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pipelineExecutionSteps
     *        A list of <code>PipeLineExecutionStep</code> objects. Each <code>PipeLineExecutionStep</code> consists of
     *        StepName, StartTime, EndTime, StepStatus, and Metadata. Metadata is an object with properties for each job
     *        that contains relevant information about the job created by the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionStepsResult withPipelineExecutionSteps(PipelineExecutionStep... pipelineExecutionSteps) {
        if (this.pipelineExecutionSteps == null) {
            setPipelineExecutionSteps(new java.util.ArrayList<PipelineExecutionStep>(pipelineExecutionSteps.length));
        }
        for (PipelineExecutionStep ele : pipelineExecutionSteps) {
            this.pipelineExecutionSteps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PipeLineExecutionStep</code> objects. Each <code>PipeLineExecutionStep</code> consists of
     * StepName, StartTime, EndTime, StepStatus, and Metadata. Metadata is an object with properties for each job that
     * contains relevant information about the job created by the step.
     * </p>
     * 
     * @param pipelineExecutionSteps
     *        A list of <code>PipeLineExecutionStep</code> objects. Each <code>PipeLineExecutionStep</code> consists of
     *        StepName, StartTime, EndTime, StepStatus, and Metadata. Metadata is an object with properties for each job
     *        that contains relevant information about the job created by the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionStepsResult withPipelineExecutionSteps(java.util.Collection<PipelineExecutionStep> pipelineExecutionSteps) {
        setPipelineExecutionSteps(pipelineExecutionSteps);
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in the
     * next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in
     *        the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in the
     * next request.
     * </p>
     * 
     * @return If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     *         includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in
     *         the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in the
     * next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in
     *        the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionStepsResult withNextToken(String nextToken) {
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
        if (getPipelineExecutionSteps() != null)
            sb.append("PipelineExecutionSteps: ").append(getPipelineExecutionSteps()).append(",");
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

        if (obj instanceof ListPipelineExecutionStepsResult == false)
            return false;
        ListPipelineExecutionStepsResult other = (ListPipelineExecutionStepsResult) obj;
        if (other.getPipelineExecutionSteps() == null ^ this.getPipelineExecutionSteps() == null)
            return false;
        if (other.getPipelineExecutionSteps() != null && other.getPipelineExecutionSteps().equals(this.getPipelineExecutionSteps()) == false)
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

        hashCode = prime * hashCode + ((getPipelineExecutionSteps() == null) ? 0 : getPipelineExecutionSteps().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelineExecutionStepsResult clone() {
        try {
            return (ListPipelineExecutionStepsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
