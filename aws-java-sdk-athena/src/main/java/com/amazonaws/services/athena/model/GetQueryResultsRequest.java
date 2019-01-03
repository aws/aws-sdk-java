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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueryResultsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     */
    private String queryExecutionId;
    /**
     * <p>
     * The token that specifies where to start pagination if a previous request was truncated.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results (rows) to return in this request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     * 
     * @param queryExecutionId
     *        The unique ID of the query execution.
     */

    public void setQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
    }

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     * 
     * @return The unique ID of the query execution.
     */

    public String getQueryExecutionId() {
        return this.queryExecutionId;
    }

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     * 
     * @param queryExecutionId
     *        The unique ID of the query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsRequest withQueryExecutionId(String queryExecutionId) {
        setQueryExecutionId(queryExecutionId);
        return this;
    }

    /**
     * <p>
     * The token that specifies where to start pagination if a previous request was truncated.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies where to start pagination if a previous request was truncated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that specifies where to start pagination if a previous request was truncated.
     * </p>
     * 
     * @return The token that specifies where to start pagination if a previous request was truncated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that specifies where to start pagination if a previous request was truncated.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies where to start pagination if a previous request was truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results (rows) to return in this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results (rows) to return in this request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results (rows) to return in this request.
     * </p>
     * 
     * @return The maximum number of results (rows) to return in this request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results (rows) to return in this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results (rows) to return in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getQueryExecutionId() != null)
            sb.append("QueryExecutionId: ").append(getQueryExecutionId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryResultsRequest == false)
            return false;
        GetQueryResultsRequest other = (GetQueryResultsRequest) obj;
        if (other.getQueryExecutionId() == null ^ this.getQueryExecutionId() == null)
            return false;
        if (other.getQueryExecutionId() != null && other.getQueryExecutionId().equals(this.getQueryExecutionId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryExecutionId() == null) ? 0 : getQueryExecutionId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetQueryResultsRequest clone() {
        return (GetQueryResultsRequest) super.clone();
    }

}
