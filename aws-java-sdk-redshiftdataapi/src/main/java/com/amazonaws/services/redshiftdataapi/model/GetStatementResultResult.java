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
package com.amazonaws.services.redshiftdataapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/GetStatementResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStatementResultResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The properties (metadata) of a column.
     * </p>
     */
    private java.util.List<ColumnMetadata> columnMetadata;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The results of the SQL statement.
     * </p>
     */
    private java.util.List<java.util.List<Field>> records;
    /**
     * <p>
     * The total number of rows in the result set returned from a query. You can use this number to estimate the number
     * of calls to the <code>GetStatementResult</code> operation needed to page through the results.
     * </p>
     */
    private Long totalNumRows;

    /**
     * <p>
     * The properties (metadata) of a column.
     * </p>
     * 
     * @return The properties (metadata) of a column.
     */

    public java.util.List<ColumnMetadata> getColumnMetadata() {
        return columnMetadata;
    }

    /**
     * <p>
     * The properties (metadata) of a column.
     * </p>
     * 
     * @param columnMetadata
     *        The properties (metadata) of a column.
     */

    public void setColumnMetadata(java.util.Collection<ColumnMetadata> columnMetadata) {
        if (columnMetadata == null) {
            this.columnMetadata = null;
            return;
        }

        this.columnMetadata = new java.util.ArrayList<ColumnMetadata>(columnMetadata);
    }

    /**
     * <p>
     * The properties (metadata) of a column.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnMetadata(java.util.Collection)} or {@link #withColumnMetadata(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param columnMetadata
     *        The properties (metadata) of a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatementResultResult withColumnMetadata(ColumnMetadata... columnMetadata) {
        if (this.columnMetadata == null) {
            setColumnMetadata(new java.util.ArrayList<ColumnMetadata>(columnMetadata.length));
        }
        for (ColumnMetadata ele : columnMetadata) {
            this.columnMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties (metadata) of a column.
     * </p>
     * 
     * @param columnMetadata
     *        The properties (metadata) of a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatementResultResult withColumnMetadata(java.util.Collection<ColumnMetadata> columnMetadata) {
        setColumnMetadata(columnMetadata);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     * 
     * @param nextToken
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty,
     *        all response records have been retrieved for the request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is
     *         empty, all response records have been retrieved for the request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned NextToken
     * value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response
     * records have been retrieved for the request.
     * </p>
     * 
     * @param nextToken
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty,
     *        all response records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatementResultResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The results of the SQL statement.
     * </p>
     * 
     * @return The results of the SQL statement.
     */

    public java.util.List<java.util.List<Field>> getRecords() {
        return records;
    }

    /**
     * <p>
     * The results of the SQL statement.
     * </p>
     * 
     * @param records
     *        The results of the SQL statement.
     */

    public void setRecords(java.util.Collection<java.util.List<Field>> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<java.util.List<Field>>(records);
    }

    /**
     * <p>
     * The results of the SQL statement.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        The results of the SQL statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatementResultResult withRecords(java.util.List<Field>... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<java.util.List<Field>>(records.length));
        }
        for (java.util.List<Field> ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results of the SQL statement.
     * </p>
     * 
     * @param records
     *        The results of the SQL statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatementResultResult withRecords(java.util.Collection<java.util.List<Field>> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * The total number of rows in the result set returned from a query. You can use this number to estimate the number
     * of calls to the <code>GetStatementResult</code> operation needed to page through the results.
     * </p>
     * 
     * @param totalNumRows
     *        The total number of rows in the result set returned from a query. You can use this number to estimate the
     *        number of calls to the <code>GetStatementResult</code> operation needed to page through the results.
     */

    public void setTotalNumRows(Long totalNumRows) {
        this.totalNumRows = totalNumRows;
    }

    /**
     * <p>
     * The total number of rows in the result set returned from a query. You can use this number to estimate the number
     * of calls to the <code>GetStatementResult</code> operation needed to page through the results.
     * </p>
     * 
     * @return The total number of rows in the result set returned from a query. You can use this number to estimate the
     *         number of calls to the <code>GetStatementResult</code> operation needed to page through the results.
     */

    public Long getTotalNumRows() {
        return this.totalNumRows;
    }

    /**
     * <p>
     * The total number of rows in the result set returned from a query. You can use this number to estimate the number
     * of calls to the <code>GetStatementResult</code> operation needed to page through the results.
     * </p>
     * 
     * @param totalNumRows
     *        The total number of rows in the result set returned from a query. You can use this number to estimate the
     *        number of calls to the <code>GetStatementResult</code> operation needed to page through the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatementResultResult withTotalNumRows(Long totalNumRows) {
        setTotalNumRows(totalNumRows);
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
        if (getColumnMetadata() != null)
            sb.append("ColumnMetadata: ").append(getColumnMetadata()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
        if (getTotalNumRows() != null)
            sb.append("TotalNumRows: ").append(getTotalNumRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStatementResultResult == false)
            return false;
        GetStatementResultResult other = (GetStatementResultResult) obj;
        if (other.getColumnMetadata() == null ^ this.getColumnMetadata() == null)
            return false;
        if (other.getColumnMetadata() != null && other.getColumnMetadata().equals(this.getColumnMetadata()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getTotalNumRows() == null ^ this.getTotalNumRows() == null)
            return false;
        if (other.getTotalNumRows() != null && other.getTotalNumRows().equals(this.getTotalNumRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnMetadata() == null) ? 0 : getColumnMetadata().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getTotalNumRows() == null) ? 0 : getTotalNumRows().hashCode());
        return hashCode;
    }

    @Override
    public GetStatementResultResult clone() {
        try {
            return (GetStatementResultResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
