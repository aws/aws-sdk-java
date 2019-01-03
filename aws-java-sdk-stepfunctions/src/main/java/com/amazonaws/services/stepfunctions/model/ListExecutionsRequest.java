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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ListExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine whose executions is listed.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * If specified, only list the executions whose current execution status matches the given filter.
     * </p>
     */
    private String statusFilter;
    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain further
     * pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default.
     * </p>
     * <p>
     * This is only an upper limit. The actual number of results returned per call might be fewer than the specified
     * maximum.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine whose executions is listed.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the state machine whose executions is listed.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine whose executions is listed.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the state machine whose executions is listed.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine whose executions is listed.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the state machine whose executions is listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsRequest withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * If specified, only list the executions whose current execution status matches the given filter.
     * </p>
     * 
     * @param statusFilter
     *        If specified, only list the executions whose current execution status matches the given filter.
     * @see ExecutionStatus
     */

    public void setStatusFilter(String statusFilter) {
        this.statusFilter = statusFilter;
    }

    /**
     * <p>
     * If specified, only list the executions whose current execution status matches the given filter.
     * </p>
     * 
     * @return If specified, only list the executions whose current execution status matches the given filter.
     * @see ExecutionStatus
     */

    public String getStatusFilter() {
        return this.statusFilter;
    }

    /**
     * <p>
     * If specified, only list the executions whose current execution status matches the given filter.
     * </p>
     * 
     * @param statusFilter
     *        If specified, only list the executions whose current execution status matches the given filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ListExecutionsRequest withStatusFilter(String statusFilter) {
        setStatusFilter(statusFilter);
        return this;
    }

    /**
     * <p>
     * If specified, only list the executions whose current execution status matches the given filter.
     * </p>
     * 
     * @param statusFilter
     *        If specified, only list the executions whose current execution status matches the given filter.
     * @see ExecutionStatus
     */

    public void setStatusFilter(ExecutionStatus statusFilter) {
        withStatusFilter(statusFilter);
    }

    /**
     * <p>
     * If specified, only list the executions whose current execution status matches the given filter.
     * </p>
     * 
     * @param statusFilter
     *        If specified, only list the executions whose current execution status matches the given filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ListExecutionsRequest withStatusFilter(ExecutionStatus statusFilter) {
        this.statusFilter = statusFilter.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain further
     * pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default.
     * </p>
     * <p>
     * This is only an upper limit. The actual number of results returned per call might be fewer than the specified
     * maximum.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain
     *        further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses
     *        the default.</p>
     *        <p>
     *        This is only an upper limit. The actual number of results returned per call might be fewer than the
     *        specified maximum.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain further
     * pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default.
     * </p>
     * <p>
     * This is only an upper limit. The actual number of results returned per call might be fewer than the specified
     * maximum.
     * </p>
     * 
     * @return The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain
     *         further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses
     *         the default.</p>
     *         <p>
     *         This is only an upper limit. The actual number of results returned per call might be fewer than the
     *         specified maximum.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain further
     * pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default.
     * </p>
     * <p>
     * This is only an upper limit. The actual number of results returned per call might be fewer than the specified
     * maximum.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain
     *        further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses
     *        the default.</p>
     *        <p>
     *        This is only an upper limit. The actual number of results returned per call might be fewer than the
     *        specified maximum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken</i> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *         24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken</i> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken</i> error.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken</i> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsRequest withNextToken(String nextToken) {
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
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: ").append(getStateMachineArn()).append(",");
        if (getStatusFilter() != null)
            sb.append("StatusFilter: ").append(getStatusFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListExecutionsRequest == false)
            return false;
        ListExecutionsRequest other = (ListExecutionsRequest) obj;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getStatusFilter() == null ^ this.getStatusFilter() == null)
            return false;
        if (other.getStatusFilter() != null && other.getStatusFilter().equals(this.getStatusFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getStatusFilter() == null) ? 0 : getStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExecutionsRequest clone() {
        return (ListExecutionsRequest) super.clone();
    }

}
