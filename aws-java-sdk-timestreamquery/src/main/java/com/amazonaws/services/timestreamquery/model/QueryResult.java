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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Query" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique ID for the given query.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * A pagination token that can be used again on a <code>Query</code> call to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The result set rows returned by the query.
     * </p>
     */
    private java.util.List<Row> rows;
    /**
     * <p>
     * The column data types of the returned result set.
     * </p>
     */
    private java.util.List<ColumnInfo> columnInfo;
    /**
     * <p>
     * Information about the status of the query, including progress and bytes scannned.
     * </p>
     */
    private QueryStatus queryStatus;

    /**
     * <p>
     * A unique ID for the given query.
     * </p>
     * 
     * @param queryId
     *        A unique ID for the given query.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * A unique ID for the given query.
     * </p>
     * 
     * @return A unique ID for the given query.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * A unique ID for the given query.
     * </p>
     * 
     * @param queryId
     *        A unique ID for the given query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used again on a <code>Query</code> call to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used again on a <code>Query</code> call to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used again on a <code>Query</code> call to get the next set of results.
     * </p>
     * 
     * @return A pagination token that can be used again on a <code>Query</code> call to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used again on a <code>Query</code> call to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used again on a <code>Query</code> call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The result set rows returned by the query.
     * </p>
     * 
     * @return The result set rows returned by the query.
     */

    public java.util.List<Row> getRows() {
        return rows;
    }

    /**
     * <p>
     * The result set rows returned by the query.
     * </p>
     * 
     * @param rows
     *        The result set rows returned by the query.
     */

    public void setRows(java.util.Collection<Row> rows) {
        if (rows == null) {
            this.rows = null;
            return;
        }

        this.rows = new java.util.ArrayList<Row>(rows);
    }

    /**
     * <p>
     * The result set rows returned by the query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRows(java.util.Collection)} or {@link #withRows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rows
     *        The result set rows returned by the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withRows(Row... rows) {
        if (this.rows == null) {
            setRows(new java.util.ArrayList<Row>(rows.length));
        }
        for (Row ele : rows) {
            this.rows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The result set rows returned by the query.
     * </p>
     * 
     * @param rows
     *        The result set rows returned by the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withRows(java.util.Collection<Row> rows) {
        setRows(rows);
        return this;
    }

    /**
     * <p>
     * The column data types of the returned result set.
     * </p>
     * 
     * @return The column data types of the returned result set.
     */

    public java.util.List<ColumnInfo> getColumnInfo() {
        return columnInfo;
    }

    /**
     * <p>
     * The column data types of the returned result set.
     * </p>
     * 
     * @param columnInfo
     *        The column data types of the returned result set.
     */

    public void setColumnInfo(java.util.Collection<ColumnInfo> columnInfo) {
        if (columnInfo == null) {
            this.columnInfo = null;
            return;
        }

        this.columnInfo = new java.util.ArrayList<ColumnInfo>(columnInfo);
    }

    /**
     * <p>
     * The column data types of the returned result set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnInfo(java.util.Collection)} or {@link #withColumnInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnInfo
     *        The column data types of the returned result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withColumnInfo(ColumnInfo... columnInfo) {
        if (this.columnInfo == null) {
            setColumnInfo(new java.util.ArrayList<ColumnInfo>(columnInfo.length));
        }
        for (ColumnInfo ele : columnInfo) {
            this.columnInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The column data types of the returned result set.
     * </p>
     * 
     * @param columnInfo
     *        The column data types of the returned result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withColumnInfo(java.util.Collection<ColumnInfo> columnInfo) {
        setColumnInfo(columnInfo);
        return this;
    }

    /**
     * <p>
     * Information about the status of the query, including progress and bytes scannned.
     * </p>
     * 
     * @param queryStatus
     *        Information about the status of the query, including progress and bytes scannned.
     */

    public void setQueryStatus(QueryStatus queryStatus) {
        this.queryStatus = queryStatus;
    }

    /**
     * <p>
     * Information about the status of the query, including progress and bytes scannned.
     * </p>
     * 
     * @return Information about the status of the query, including progress and bytes scannned.
     */

    public QueryStatus getQueryStatus() {
        return this.queryStatus;
    }

    /**
     * <p>
     * Information about the status of the query, including progress and bytes scannned.
     * </p>
     * 
     * @param queryStatus
     *        Information about the status of the query, including progress and bytes scannned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResult withQueryStatus(QueryStatus queryStatus) {
        setQueryStatus(queryStatus);
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
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRows() != null)
            sb.append("Rows: ").append(getRows()).append(",");
        if (getColumnInfo() != null)
            sb.append("ColumnInfo: ").append(getColumnInfo()).append(",");
        if (getQueryStatus() != null)
            sb.append("QueryStatus: ").append(getQueryStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryResult == false)
            return false;
        QueryResult other = (QueryResult) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        if (other.getColumnInfo() == null ^ this.getColumnInfo() == null)
            return false;
        if (other.getColumnInfo() != null && other.getColumnInfo().equals(this.getColumnInfo()) == false)
            return false;
        if (other.getQueryStatus() == null ^ this.getQueryStatus() == null)
            return false;
        if (other.getQueryStatus() != null && other.getQueryStatus().equals(this.getQueryStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        hashCode = prime * hashCode + ((getColumnInfo() == null) ? 0 : getColumnInfo().hashCode());
        hashCode = prime * hashCode + ((getQueryStatus() == null) ? 0 : getQueryStatus().hashCode());
        return hashCode;
    }

    @Override
    public QueryResult clone() {
        try {
            return (QueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
