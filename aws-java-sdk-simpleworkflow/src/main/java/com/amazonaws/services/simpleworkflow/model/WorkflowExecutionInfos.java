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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains a paginated list of information about workflow executions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowExecutionInfos" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowExecutionInfos extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of workflow information structures.
     * </p>
     */
    private java.util.List<WorkflowExecutionInfo> executionInfos;
    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The list of workflow information structures.
     * </p>
     * 
     * @return The list of workflow information structures.
     */

    public java.util.List<WorkflowExecutionInfo> getExecutionInfos() {
        return executionInfos;
    }

    /**
     * <p>
     * The list of workflow information structures.
     * </p>
     * 
     * @param executionInfos
     *        The list of workflow information structures.
     */

    public void setExecutionInfos(java.util.Collection<WorkflowExecutionInfo> executionInfos) {
        if (executionInfos == null) {
            this.executionInfos = null;
            return;
        }

        this.executionInfos = new java.util.ArrayList<WorkflowExecutionInfo>(executionInfos);
    }

    /**
     * <p>
     * The list of workflow information structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecutionInfos(java.util.Collection)} or {@link #withExecutionInfos(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param executionInfos
     *        The list of workflow information structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfos withExecutionInfos(WorkflowExecutionInfo... executionInfos) {
        if (this.executionInfos == null) {
            setExecutionInfos(new java.util.ArrayList<WorkflowExecutionInfo>(executionInfos.length));
        }
        for (WorkflowExecutionInfo ele : executionInfos) {
            this.executionInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of workflow information structures.
     * </p>
     * 
     * @param executionInfos
     *        The list of workflow information structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfos withExecutionInfos(java.util.Collection<WorkflowExecutionInfo> executionInfos) {
        setExecutionInfos(executionInfos);
        return this;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextPageToken
     *        If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *        retrieve the next page of results, make the call again using the returned token in
     *        <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @return If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *         retrieve the next page of results, make the call again using the returned token in
     *         <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *         <p>
     *         The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextPageToken
     *        If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *        retrieve the next page of results, make the call again using the returned token in
     *        <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionInfos withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getExecutionInfos() != null)
            sb.append("ExecutionInfos: ").append(getExecutionInfos()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionInfos == false)
            return false;
        WorkflowExecutionInfos other = (WorkflowExecutionInfos) obj;
        if (other.getExecutionInfos() == null ^ this.getExecutionInfos() == null)
            return false;
        if (other.getExecutionInfos() != null && other.getExecutionInfos().equals(this.getExecutionInfos()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionInfos() == null) ? 0 : getExecutionInfos().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionInfos clone() {
        try {
            return (WorkflowExecutionInfos) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
