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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ExecuteQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents a single column in the query results.
     * </p>
     */
    private java.util.List<ColumnInfo> columns;
    /**
     * <p>
     * Represents a single row in the query results.
     * </p>
     */
    private java.util.List<Row> rows;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Represents a single column in the query results.
     * </p>
     * 
     * @return Represents a single column in the query results.
     */

    public java.util.List<ColumnInfo> getColumns() {
        return columns;
    }

    /**
     * <p>
     * Represents a single column in the query results.
     * </p>
     * 
     * @param columns
     *        Represents a single column in the query results.
     */

    public void setColumns(java.util.Collection<ColumnInfo> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<ColumnInfo>(columns);
    }

    /**
     * <p>
     * Represents a single column in the query results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        Represents a single column in the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteQueryResult withColumns(ColumnInfo... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<ColumnInfo>(columns.length));
        }
        for (ColumnInfo ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents a single column in the query results.
     * </p>
     * 
     * @param columns
     *        Represents a single column in the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteQueryResult withColumns(java.util.Collection<ColumnInfo> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * Represents a single row in the query results.
     * </p>
     * 
     * @return Represents a single row in the query results.
     */

    public java.util.List<Row> getRows() {
        return rows;
    }

    /**
     * <p>
     * Represents a single row in the query results.
     * </p>
     * 
     * @param rows
     *        Represents a single row in the query results.
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
     * Represents a single row in the query results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRows(java.util.Collection)} or {@link #withRows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rows
     *        Represents a single row in the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteQueryResult withRows(Row... rows) {
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
     * Represents a single row in the query results.
     * </p>
     * 
     * @param rows
     *        Represents a single row in the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteQueryResult withRows(java.util.Collection<Row> rows) {
        setRows(rows);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteQueryResult withNextToken(String nextToken) {
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
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns()).append(",");
        if (getRows() != null)
            sb.append("Rows: ").append(getRows()).append(",");
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

        if (obj instanceof ExecuteQueryResult == false)
            return false;
        ExecuteQueryResult other = (ExecuteQueryResult) obj;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
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

        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteQueryResult clone() {
        try {
            return (ExecuteQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
