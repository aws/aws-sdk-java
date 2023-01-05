/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetQueryResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueryResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the query. Values include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     * <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * </p>
     */
    private String queryStatus;
    /**
     * <p>
     * Shows the count of query results.
     * </p>
     */
    private QueryStatistics queryStatistics;
    /**
     * <p>
     * Contains the individual event results of the query.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.List<java.util.Map<String, String>>> queryResultRows;
    /**
     * <p>
     * A token you can use to get the next page of query results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The error message returned if a query failed.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The status of the query. Values include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     * <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        The status of the query. Values include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     *        <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @see QueryStatus
     */

    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }

    /**
     * <p>
     * The status of the query. Values include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     * <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * </p>
     * 
     * @return The status of the query. Values include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     *         <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @see QueryStatus
     */

    public String getQueryStatus() {
        return this.queryStatus;
    }

    /**
     * <p>
     * The status of the query. Values include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     * <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        The status of the query. Values include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     *        <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public GetQueryResultsResult withQueryStatus(String queryStatus) {
        setQueryStatus(queryStatus);
        return this;
    }

    /**
     * <p>
     * The status of the query. Values include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     * <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        The status of the query. Values include <code>QUEUED</code>, <code>RUNNING</code>, <code>FINISHED</code>,
     *        <code>FAILED</code>, <code>TIMED_OUT</code>, or <code>CANCELLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public GetQueryResultsResult withQueryStatus(QueryStatus queryStatus) {
        this.queryStatus = queryStatus.toString();
        return this;
    }

    /**
     * <p>
     * Shows the count of query results.
     * </p>
     * 
     * @param queryStatistics
     *        Shows the count of query results.
     */

    public void setQueryStatistics(QueryStatistics queryStatistics) {
        this.queryStatistics = queryStatistics;
    }

    /**
     * <p>
     * Shows the count of query results.
     * </p>
     * 
     * @return Shows the count of query results.
     */

    public QueryStatistics getQueryStatistics() {
        return this.queryStatistics;
    }

    /**
     * <p>
     * Shows the count of query results.
     * </p>
     * 
     * @param queryStatistics
     *        Shows the count of query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withQueryStatistics(QueryStatistics queryStatistics) {
        setQueryStatistics(queryStatistics);
        return this;
    }

    /**
     * <p>
     * Contains the individual event results of the query.
     * </p>
     * 
     * @return Contains the individual event results of the query.
     */

    public java.util.List<java.util.List<java.util.Map<String, String>>> getQueryResultRows() {
        if (queryResultRows == null) {
            queryResultRows = new com.amazonaws.internal.SdkInternalList<java.util.List<java.util.Map<String, String>>>();
        }
        return queryResultRows;
    }

    /**
     * <p>
     * Contains the individual event results of the query.
     * </p>
     * 
     * @param queryResultRows
     *        Contains the individual event results of the query.
     */

    public void setQueryResultRows(java.util.Collection<java.util.List<java.util.Map<String, String>>> queryResultRows) {
        if (queryResultRows == null) {
            this.queryResultRows = null;
            return;
        }

        this.queryResultRows = new com.amazonaws.internal.SdkInternalList<java.util.List<java.util.Map<String, String>>>(queryResultRows);
    }

    /**
     * <p>
     * Contains the individual event results of the query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryResultRows(java.util.Collection)} or {@link #withQueryResultRows(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param queryResultRows
     *        Contains the individual event results of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withQueryResultRows(java.util.List<java.util.Map<String, String>>... queryResultRows) {
        if (this.queryResultRows == null) {
            setQueryResultRows(new com.amazonaws.internal.SdkInternalList<java.util.List<java.util.Map<String, String>>>(queryResultRows.length));
        }
        for (java.util.List<java.util.Map<String, String>> ele : queryResultRows) {
            this.queryResultRows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the individual event results of the query.
     * </p>
     * 
     * @param queryResultRows
     *        Contains the individual event results of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withQueryResultRows(java.util.Collection<java.util.List<java.util.Map<String, String>>> queryResultRows) {
        setQueryResultRows(queryResultRows);
        return this;
    }

    /**
     * <p>
     * A token you can use to get the next page of query results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of query results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of query results.
     * </p>
     * 
     * @return A token you can use to get the next page of query results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of query results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The error message returned if a query failed.
     * </p>
     * 
     * @param errorMessage
     *        The error message returned if a query failed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message returned if a query failed.
     * </p>
     * 
     * @return The error message returned if a query failed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message returned if a query failed.
     * </p>
     * 
     * @param errorMessage
     *        The error message returned if a query failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getQueryStatus() != null)
            sb.append("QueryStatus: ").append(getQueryStatus()).append(",");
        if (getQueryStatistics() != null)
            sb.append("QueryStatistics: ").append(getQueryStatistics()).append(",");
        if (getQueryResultRows() != null)
            sb.append("QueryResultRows: ").append(getQueryResultRows()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryResultsResult == false)
            return false;
        GetQueryResultsResult other = (GetQueryResultsResult) obj;
        if (other.getQueryStatus() == null ^ this.getQueryStatus() == null)
            return false;
        if (other.getQueryStatus() != null && other.getQueryStatus().equals(this.getQueryStatus()) == false)
            return false;
        if (other.getQueryStatistics() == null ^ this.getQueryStatistics() == null)
            return false;
        if (other.getQueryStatistics() != null && other.getQueryStatistics().equals(this.getQueryStatistics()) == false)
            return false;
        if (other.getQueryResultRows() == null ^ this.getQueryResultRows() == null)
            return false;
        if (other.getQueryResultRows() != null && other.getQueryResultRows().equals(this.getQueryResultRows()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryStatus() == null) ? 0 : getQueryStatus().hashCode());
        hashCode = prime * hashCode + ((getQueryStatistics() == null) ? 0 : getQueryStatistics().hashCode());
        hashCode = prime * hashCode + ((getQueryResultRows() == null) ? 0 : getQueryResultRows().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public GetQueryResultsResult clone() {
        try {
            return (GetQueryResultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
