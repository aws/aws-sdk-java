/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of matching executions.
     * </p>
     */
    private java.util.List<ExecutionListItem> executions;
    /**
     * <p>
     * If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of matching executions.
     * </p>
     * 
     * @return The list of matching executions.
     */

    public java.util.List<ExecutionListItem> getExecutions() {
        return executions;
    }

    /**
     * <p>
     * The list of matching executions.
     * </p>
     * 
     * @param executions
     *        The list of matching executions.
     */

    public void setExecutions(java.util.Collection<ExecutionListItem> executions) {
        if (executions == null) {
            this.executions = null;
            return;
        }

        this.executions = new java.util.ArrayList<ExecutionListItem>(executions);
    }

    /**
     * <p>
     * The list of matching executions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecutions(java.util.Collection)} or {@link #withExecutions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param executions
     *        The list of matching executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsResult withExecutions(ExecutionListItem... executions) {
        if (this.executions == null) {
            setExecutions(new java.util.ArrayList<ExecutionListItem>(executions.length));
        }
        for (ExecutionListItem ele : executions) {
            this.executions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of matching executions.
     * </p>
     * 
     * @param executions
     *        The list of matching executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsResult withExecutions(java.util.Collection<ExecutionListItem> executions) {
        setExecutions(executions);
        return this;
    }

    /**
     * <p>
     * If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextToken
     *        If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all
     *        other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maxResults</code> determines how many results can be returned in a single call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @return If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve
     *         the next page of results, make the call again using the returned token in <code>nextToken</code>. Keep
     *         all other arguments unchanged.</p>
     *         <p>
     *         The configured <code>maxResults</code> determines how many results can be returned in a single call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextToken
     *        If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all
     *        other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getExecutions() != null)
            sb.append("Executions: ").append(getExecutions()).append(",");
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

        if (obj instanceof ListExecutionsResult == false)
            return false;
        ListExecutionsResult other = (ListExecutionsResult) obj;
        if (other.getExecutions() == null ^ this.getExecutions() == null)
            return false;
        if (other.getExecutions() != null && other.getExecutions().equals(this.getExecutions()) == false)
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

        hashCode = prime * hashCode + ((getExecutions() == null) ? 0 : getExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExecutionsResult clone() {
        try {
            return (ListExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
