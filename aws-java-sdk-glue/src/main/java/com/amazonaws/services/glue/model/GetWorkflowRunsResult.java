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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of workflow run metadata objects.
     * </p>
     */
    private java.util.List<WorkflowRun> runs;
    /**
     * <p>
     * A continuation token, if not all requested workflow runs have been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of workflow run metadata objects.
     * </p>
     * 
     * @return A list of workflow run metadata objects.
     */

    public java.util.List<WorkflowRun> getRuns() {
        return runs;
    }

    /**
     * <p>
     * A list of workflow run metadata objects.
     * </p>
     * 
     * @param runs
     *        A list of workflow run metadata objects.
     */

    public void setRuns(java.util.Collection<WorkflowRun> runs) {
        if (runs == null) {
            this.runs = null;
            return;
        }

        this.runs = new java.util.ArrayList<WorkflowRun>(runs);
    }

    /**
     * <p>
     * A list of workflow run metadata objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuns(java.util.Collection)} or {@link #withRuns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param runs
     *        A list of workflow run metadata objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunsResult withRuns(WorkflowRun... runs) {
        if (this.runs == null) {
            setRuns(new java.util.ArrayList<WorkflowRun>(runs.length));
        }
        for (WorkflowRun ele : runs) {
            this.runs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of workflow run metadata objects.
     * </p>
     * 
     * @param runs
     *        A list of workflow run metadata objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunsResult withRuns(java.util.Collection<WorkflowRun> runs) {
        setRuns(runs);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all requested workflow runs have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all requested workflow runs have been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all requested workflow runs have been returned.
     * </p>
     * 
     * @return A continuation token, if not all requested workflow runs have been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all requested workflow runs have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all requested workflow runs have been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunsResult withNextToken(String nextToken) {
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
        if (getRuns() != null)
            sb.append("Runs: ").append(getRuns()).append(",");
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

        if (obj instanceof GetWorkflowRunsResult == false)
            return false;
        GetWorkflowRunsResult other = (GetWorkflowRunsResult) obj;
        if (other.getRuns() == null ^ this.getRuns() == null)
            return false;
        if (other.getRuns() != null && other.getRuns().equals(this.getRuns()) == false)
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

        hashCode = prime * hashCode + ((getRuns() == null) ? 0 : getRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowRunsResult clone() {
        try {
            return (GetWorkflowRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
