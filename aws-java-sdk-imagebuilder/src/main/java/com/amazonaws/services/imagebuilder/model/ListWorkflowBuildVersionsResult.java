/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListWorkflowBuildVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowBuildVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that contains metadata for the workflow builds that have run for the workflow resource specified in the
     * request.
     * </p>
     */
    private java.util.List<WorkflowSummary> workflowSummaryList;
    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that contains metadata for the workflow builds that have run for the workflow resource specified in the
     * request.
     * </p>
     * 
     * @return A list that contains metadata for the workflow builds that have run for the workflow resource specified
     *         in the request.
     */

    public java.util.List<WorkflowSummary> getWorkflowSummaryList() {
        return workflowSummaryList;
    }

    /**
     * <p>
     * A list that contains metadata for the workflow builds that have run for the workflow resource specified in the
     * request.
     * </p>
     * 
     * @param workflowSummaryList
     *        A list that contains metadata for the workflow builds that have run for the workflow resource specified in
     *        the request.
     */

    public void setWorkflowSummaryList(java.util.Collection<WorkflowSummary> workflowSummaryList) {
        if (workflowSummaryList == null) {
            this.workflowSummaryList = null;
            return;
        }

        this.workflowSummaryList = new java.util.ArrayList<WorkflowSummary>(workflowSummaryList);
    }

    /**
     * <p>
     * A list that contains metadata for the workflow builds that have run for the workflow resource specified in the
     * request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflowSummaryList(java.util.Collection)} or {@link #withWorkflowSummaryList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param workflowSummaryList
     *        A list that contains metadata for the workflow builds that have run for the workflow resource specified in
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowBuildVersionsResult withWorkflowSummaryList(WorkflowSummary... workflowSummaryList) {
        if (this.workflowSummaryList == null) {
            setWorkflowSummaryList(new java.util.ArrayList<WorkflowSummary>(workflowSummaryList.length));
        }
        for (WorkflowSummary ele : workflowSummaryList) {
            this.workflowSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains metadata for the workflow builds that have run for the workflow resource specified in the
     * request.
     * </p>
     * 
     * @param workflowSummaryList
     *        A list that contains metadata for the workflow builds that have run for the workflow resource specified in
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowBuildVersionsResult withWorkflowSummaryList(java.util.Collection<WorkflowSummary> workflowSummaryList) {
        setWorkflowSummaryList(workflowSummaryList);
        return this;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this field isn't empty, there are additional elements
     *        that the service hasn't included in this request. Use this token with the next request to retrieve
     *        additional objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @return The next token used for paginated responses. When this field isn't empty, there are additional elements
     *         that the service hasn't included in this request. Use this token with the next request to retrieve
     *         additional objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this field isn't empty, there are additional elements
     *        that the service hasn't included in this request. Use this token with the next request to retrieve
     *        additional objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowBuildVersionsResult withNextToken(String nextToken) {
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
        if (getWorkflowSummaryList() != null)
            sb.append("WorkflowSummaryList: ").append(getWorkflowSummaryList()).append(",");
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

        if (obj instanceof ListWorkflowBuildVersionsResult == false)
            return false;
        ListWorkflowBuildVersionsResult other = (ListWorkflowBuildVersionsResult) obj;
        if (other.getWorkflowSummaryList() == null ^ this.getWorkflowSummaryList() == null)
            return false;
        if (other.getWorkflowSummaryList() != null && other.getWorkflowSummaryList().equals(this.getWorkflowSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getWorkflowSummaryList() == null) ? 0 : getWorkflowSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowBuildVersionsResult clone() {
        try {
            return (ListWorkflowBuildVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
