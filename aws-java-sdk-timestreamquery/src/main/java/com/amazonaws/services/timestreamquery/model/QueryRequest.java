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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Query" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The query to be executed by Timestream.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * Unique, case-sensitive string of up to 64 ASCII characters that you specify when you make a Query request.
     * Providing a <code>ClientToken</code> makes the call to <code>Query</code> idempotent, meaning that multiple
     * identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Your query request will fail in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you submit a request with the same client token outside the 5-minute idepotency window.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 5-minute
     * idempotency window.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After 4 hours, any request with the same client token is treated as a new request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A pagination token passed to get a set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of rows to return in the output. If the total number of rows available is more than the value
     * specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken value in
     * the starting-token argument of a subsequent command.
     * </p>
     */
    private Integer maxRows;

    /**
     * <p>
     * The query to be executed by Timestream.
     * </p>
     * 
     * @param queryString
     *        The query to be executed by Timestream.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query to be executed by Timestream.
     * </p>
     * 
     * @return The query to be executed by Timestream.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query to be executed by Timestream.
     * </p>
     * 
     * @param queryString
     *        The query to be executed by Timestream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive string of up to 64 ASCII characters that you specify when you make a Query request.
     * Providing a <code>ClientToken</code> makes the call to <code>Query</code> idempotent, meaning that multiple
     * identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Your query request will fail in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you submit a request with the same client token outside the 5-minute idepotency window.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 5-minute
     * idempotency window.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After 4 hours, any request with the same client token is treated as a new request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive string of up to 64 ASCII characters that you specify when you make a Query request.
     *        Providing a <code>ClientToken</code> makes the call to <code>Query</code> idempotent, meaning that
     *        multiple identical calls have the same effect as one single call. </p>
     *        <p>
     *        Your query request will fail in the following cases:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you submit a request with the same client token outside the 5-minute idepotency window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you submit a request with the same client token but a change in other parameters within the 5-minute
     *        idempotency window.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        After 4 hours, any request with the same client token is treated as a new request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive string of up to 64 ASCII characters that you specify when you make a Query request.
     * Providing a <code>ClientToken</code> makes the call to <code>Query</code> idempotent, meaning that multiple
     * identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Your query request will fail in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you submit a request with the same client token outside the 5-minute idepotency window.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 5-minute
     * idempotency window.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After 4 hours, any request with the same client token is treated as a new request.
     * </p>
     * 
     * @return Unique, case-sensitive string of up to 64 ASCII characters that you specify when you make a Query
     *         request. Providing a <code>ClientToken</code> makes the call to <code>Query</code> idempotent, meaning
     *         that multiple identical calls have the same effect as one single call. </p>
     *         <p>
     *         Your query request will fail in the following cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you submit a request with the same client token outside the 5-minute idepotency window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you submit a request with the same client token but a change in other parameters within the 5-minute
     *         idempotency window.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         After 4 hours, any request with the same client token is treated as a new request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive string of up to 64 ASCII characters that you specify when you make a Query request.
     * Providing a <code>ClientToken</code> makes the call to <code>Query</code> idempotent, meaning that multiple
     * identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Your query request will fail in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you submit a request with the same client token outside the 5-minute idepotency window.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 5-minute
     * idempotency window.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After 4 hours, any request with the same client token is treated as a new request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive string of up to 64 ASCII characters that you specify when you make a Query request.
     *        Providing a <code>ClientToken</code> makes the call to <code>Query</code> idempotent, meaning that
     *        multiple identical calls have the same effect as one single call. </p>
     *        <p>
     *        Your query request will fail in the following cases:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you submit a request with the same client token outside the 5-minute idepotency window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you submit a request with the same client token but a change in other parameters within the 5-minute
     *        idempotency window.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        After 4 hours, any request with the same client token is treated as a new request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A pagination token passed to get a set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token passed to get a set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token passed to get a set of results.
     * </p>
     * 
     * @return A pagination token passed to get a set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token passed to get a set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token passed to get a set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of rows to return in the output. If the total number of rows available is more than the value
     * specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken value in
     * the starting-token argument of a subsequent command.
     * </p>
     * 
     * @param maxRows
     *        The total number of rows to return in the output. If the total number of rows available is more than the
     *        value specified, a NextToken is provided in the command's output. To resume pagination, provide the
     *        NextToken value in the starting-token argument of a subsequent command.
     */

    public void setMaxRows(Integer maxRows) {
        this.maxRows = maxRows;
    }

    /**
     * <p>
     * The total number of rows to return in the output. If the total number of rows available is more than the value
     * specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken value in
     * the starting-token argument of a subsequent command.
     * </p>
     * 
     * @return The total number of rows to return in the output. If the total number of rows available is more than the
     *         value specified, a NextToken is provided in the command's output. To resume pagination, provide the
     *         NextToken value in the starting-token argument of a subsequent command.
     */

    public Integer getMaxRows() {
        return this.maxRows;
    }

    /**
     * <p>
     * The total number of rows to return in the output. If the total number of rows available is more than the value
     * specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken value in
     * the starting-token argument of a subsequent command.
     * </p>
     * 
     * @param maxRows
     *        The total number of rows to return in the output. If the total number of rows available is more than the
     *        value specified, a NextToken is provided in the command's output. To resume pagination, provide the
     *        NextToken value in the starting-token argument of a subsequent command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withMaxRows(Integer maxRows) {
        setMaxRows(maxRows);
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
        if (getQueryString() != null)
            sb.append("QueryString: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxRows() != null)
            sb.append("MaxRows: ").append(getMaxRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryRequest == false)
            return false;
        QueryRequest other = (QueryRequest) obj;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRows() == null ^ this.getMaxRows() == null)
            return false;
        if (other.getMaxRows() != null && other.getMaxRows().equals(this.getMaxRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxRows() == null) ? 0 : getMaxRows().hashCode());
        return hashCode;
    }

    @Override
    public QueryRequest clone() {
        return (QueryRequest) super.clone();
    }

}
