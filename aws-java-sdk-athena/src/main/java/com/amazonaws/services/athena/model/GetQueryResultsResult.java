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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueryResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of rows inserted with a CREATE TABLE AS SELECT statement.
     * </p>
     */
    private Long updateCount;
    /**
     * <p>
     * The results of the query execution.
     * </p>
     */
    private ResultSet resultSet;
    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The number of rows inserted with a CREATE TABLE AS SELECT statement.
     * </p>
     * 
     * @param updateCount
     *        The number of rows inserted with a CREATE TABLE AS SELECT statement.
     */

    public void setUpdateCount(Long updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * <p>
     * The number of rows inserted with a CREATE TABLE AS SELECT statement.
     * </p>
     * 
     * @return The number of rows inserted with a CREATE TABLE AS SELECT statement.
     */

    public Long getUpdateCount() {
        return this.updateCount;
    }

    /**
     * <p>
     * The number of rows inserted with a CREATE TABLE AS SELECT statement.
     * </p>
     * 
     * @param updateCount
     *        The number of rows inserted with a CREATE TABLE AS SELECT statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withUpdateCount(Long updateCount) {
        setUpdateCount(updateCount);
        return this;
    }

    /**
     * <p>
     * The results of the query execution.
     * </p>
     * 
     * @param resultSet
     *        The results of the query execution.
     */

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    /**
     * <p>
     * The results of the query execution.
     * </p>
     * 
     * @return The results of the query execution.
     */

    public ResultSet getResultSet() {
        return this.resultSet;
    }

    /**
     * <p>
     * The results of the query execution.
     * </p>
     * 
     * @param resultSet
     *        The results of the query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withResultSet(ResultSet resultSet) {
        setResultSet(resultSet);
        return this;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * 
     * @param nextToken
     *        A token to be used by the next request if this request is truncated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * 
     * @return A token to be used by the next request if this request is truncated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * 
     * @param nextToken
     *        A token to be used by the next request if this request is truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryResultsResult withNextToken(String nextToken) {
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
        if (getUpdateCount() != null)
            sb.append("UpdateCount: ").append(getUpdateCount()).append(",");
        if (getResultSet() != null)
            sb.append("ResultSet: ").append(getResultSet()).append(",");
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

        if (obj instanceof GetQueryResultsResult == false)
            return false;
        GetQueryResultsResult other = (GetQueryResultsResult) obj;
        if (other.getUpdateCount() == null ^ this.getUpdateCount() == null)
            return false;
        if (other.getUpdateCount() != null && other.getUpdateCount().equals(this.getUpdateCount()) == false)
            return false;
        if (other.getResultSet() == null ^ this.getResultSet() == null)
            return false;
        if (other.getResultSet() != null && other.getResultSet().equals(this.getResultSet()) == false)
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

        hashCode = prime * hashCode + ((getUpdateCount() == null) ? 0 : getUpdateCount().hashCode());
        hashCode = prime * hashCode + ((getResultSet() == null) ? 0 : getResultSet().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
