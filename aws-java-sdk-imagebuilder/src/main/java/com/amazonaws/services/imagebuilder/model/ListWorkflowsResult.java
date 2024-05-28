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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListWorkflows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of workflow build versions that match the request criteria.
     * </p>
     */
    private java.util.List<WorkflowVersion> workflowVersionList;
    /**
     * <p>
     * The next token used for paginated responses. When this field isn't empty, there are additional elements that the
     * service hasn't included in this request. Use this token with the next request to retrieve additional objects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of workflow build versions that match the request criteria.
     * </p>
     * 
     * @return A list of workflow build versions that match the request criteria.
     */

    public java.util.List<WorkflowVersion> getWorkflowVersionList() {
        return workflowVersionList;
    }

    /**
     * <p>
     * A list of workflow build versions that match the request criteria.
     * </p>
     * 
     * @param workflowVersionList
     *        A list of workflow build versions that match the request criteria.
     */

    public void setWorkflowVersionList(java.util.Collection<WorkflowVersion> workflowVersionList) {
        if (workflowVersionList == null) {
            this.workflowVersionList = null;
            return;
        }

        this.workflowVersionList = new java.util.ArrayList<WorkflowVersion>(workflowVersionList);
    }

    /**
     * <p>
     * A list of workflow build versions that match the request criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflowVersionList(java.util.Collection)} or {@link #withWorkflowVersionList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param workflowVersionList
     *        A list of workflow build versions that match the request criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withWorkflowVersionList(WorkflowVersion... workflowVersionList) {
        if (this.workflowVersionList == null) {
            setWorkflowVersionList(new java.util.ArrayList<WorkflowVersion>(workflowVersionList.length));
        }
        for (WorkflowVersion ele : workflowVersionList) {
            this.workflowVersionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of workflow build versions that match the request criteria.
     * </p>
     * 
     * @param workflowVersionList
     *        A list of workflow build versions that match the request criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withWorkflowVersionList(java.util.Collection<WorkflowVersion> workflowVersionList) {
        setWorkflowVersionList(workflowVersionList);
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

    public ListWorkflowsResult withNextToken(String nextToken) {
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
        if (getWorkflowVersionList() != null)
            sb.append("WorkflowVersionList: ").append(getWorkflowVersionList()).append(",");
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

        if (obj instanceof ListWorkflowsResult == false)
            return false;
        ListWorkflowsResult other = (ListWorkflowsResult) obj;
        if (other.getWorkflowVersionList() == null ^ this.getWorkflowVersionList() == null)
            return false;
        if (other.getWorkflowVersionList() != null && other.getWorkflowVersionList().equals(this.getWorkflowVersionList()) == false)
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

        hashCode = prime * hashCode + ((getWorkflowVersionList() == null) ? 0 : getWorkflowVersionList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowsResult clone() {
        try {
            return (ListWorkflowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
