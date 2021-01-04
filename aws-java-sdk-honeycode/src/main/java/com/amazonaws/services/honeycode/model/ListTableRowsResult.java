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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTableRows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTableRowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of columns in the table whose row data is returned in the result.
     * </p>
     */
    private java.util.List<String> columnIds;
    /**
     * <p>
     * The list of rows in the table. Note that this result is paginated, so this list contains a maximum of 100 rows.
     * </p>
     */
    private java.util.List<TableRow> rows;
    /**
     * <p>
     * The list of row ids included in the request that were not found in the table.
     * </p>
     */
    private java.util.List<String> rowIdsNotFound;
    /**
     * <p>
     * Provides the pagination token to load the next page if there are more results matching the request. If a
     * pagination token is not present in the response, it means that all data matching the request has been loaded.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this request is read. Workbook cursor keeps
     * increasing with every update and the increments are not sequential.
     * </p>
     */
    private Long workbookCursor;

    /**
     * <p>
     * The list of columns in the table whose row data is returned in the result.
     * </p>
     * 
     * @return The list of columns in the table whose row data is returned in the result.
     */

    public java.util.List<String> getColumnIds() {
        return columnIds;
    }

    /**
     * <p>
     * The list of columns in the table whose row data is returned in the result.
     * </p>
     * 
     * @param columnIds
     *        The list of columns in the table whose row data is returned in the result.
     */

    public void setColumnIds(java.util.Collection<String> columnIds) {
        if (columnIds == null) {
            this.columnIds = null;
            return;
        }

        this.columnIds = new java.util.ArrayList<String>(columnIds);
    }

    /**
     * <p>
     * The list of columns in the table whose row data is returned in the result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnIds(java.util.Collection)} or {@link #withColumnIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnIds
     *        The list of columns in the table whose row data is returned in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsResult withColumnIds(String... columnIds) {
        if (this.columnIds == null) {
            setColumnIds(new java.util.ArrayList<String>(columnIds.length));
        }
        for (String ele : columnIds) {
            this.columnIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of columns in the table whose row data is returned in the result.
     * </p>
     * 
     * @param columnIds
     *        The list of columns in the table whose row data is returned in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsResult withColumnIds(java.util.Collection<String> columnIds) {
        setColumnIds(columnIds);
        return this;
    }

    /**
     * <p>
     * The list of rows in the table. Note that this result is paginated, so this list contains a maximum of 100 rows.
     * </p>
     * 
     * @return The list of rows in the table. Note that this result is paginated, so this list contains a maximum of 100
     *         rows.
     */

    public java.util.List<TableRow> getRows() {
        return rows;
    }

    /**
     * <p>
     * The list of rows in the table. Note that this result is paginated, so this list contains a maximum of 100 rows.
     * </p>
     * 
     * @param rows
     *        The list of rows in the table. Note that this result is paginated, so this list contains a maximum of 100
     *        rows.
     */

    public void setRows(java.util.Collection<TableRow> rows) {
        if (rows == null) {
            this.rows = null;
            return;
        }

        this.rows = new java.util.ArrayList<TableRow>(rows);
    }

    /**
     * <p>
     * The list of rows in the table. Note that this result is paginated, so this list contains a maximum of 100 rows.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRows(java.util.Collection)} or {@link #withRows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rows
     *        The list of rows in the table. Note that this result is paginated, so this list contains a maximum of 100
     *        rows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsResult withRows(TableRow... rows) {
        if (this.rows == null) {
            setRows(new java.util.ArrayList<TableRow>(rows.length));
        }
        for (TableRow ele : rows) {
            this.rows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of rows in the table. Note that this result is paginated, so this list contains a maximum of 100 rows.
     * </p>
     * 
     * @param rows
     *        The list of rows in the table. Note that this result is paginated, so this list contains a maximum of 100
     *        rows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsResult withRows(java.util.Collection<TableRow> rows) {
        setRows(rows);
        return this;
    }

    /**
     * <p>
     * The list of row ids included in the request that were not found in the table.
     * </p>
     * 
     * @return The list of row ids included in the request that were not found in the table.
     */

    public java.util.List<String> getRowIdsNotFound() {
        return rowIdsNotFound;
    }

    /**
     * <p>
     * The list of row ids included in the request that were not found in the table.
     * </p>
     * 
     * @param rowIdsNotFound
     *        The list of row ids included in the request that were not found in the table.
     */

    public void setRowIdsNotFound(java.util.Collection<String> rowIdsNotFound) {
        if (rowIdsNotFound == null) {
            this.rowIdsNotFound = null;
            return;
        }

        this.rowIdsNotFound = new java.util.ArrayList<String>(rowIdsNotFound);
    }

    /**
     * <p>
     * The list of row ids included in the request that were not found in the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRowIdsNotFound(java.util.Collection)} or {@link #withRowIdsNotFound(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param rowIdsNotFound
     *        The list of row ids included in the request that were not found in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsResult withRowIdsNotFound(String... rowIdsNotFound) {
        if (this.rowIdsNotFound == null) {
            setRowIdsNotFound(new java.util.ArrayList<String>(rowIdsNotFound.length));
        }
        for (String ele : rowIdsNotFound) {
            this.rowIdsNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of row ids included in the request that were not found in the table.
     * </p>
     * 
     * @param rowIdsNotFound
     *        The list of row ids included in the request that were not found in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsResult withRowIdsNotFound(java.util.Collection<String> rowIdsNotFound) {
        setRowIdsNotFound(rowIdsNotFound);
        return this;
    }

    /**
     * <p>
     * Provides the pagination token to load the next page if there are more results matching the request. If a
     * pagination token is not present in the response, it means that all data matching the request has been loaded.
     * </p>
     * 
     * @param nextToken
     *        Provides the pagination token to load the next page if there are more results matching the request. If a
     *        pagination token is not present in the response, it means that all data matching the request has been
     *        loaded.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides the pagination token to load the next page if there are more results matching the request. If a
     * pagination token is not present in the response, it means that all data matching the request has been loaded.
     * </p>
     * 
     * @return Provides the pagination token to load the next page if there are more results matching the request. If a
     *         pagination token is not present in the response, it means that all data matching the request has been
     *         loaded.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Provides the pagination token to load the next page if there are more results matching the request. If a
     * pagination token is not present in the response, it means that all data matching the request has been loaded.
     * </p>
     * 
     * @param nextToken
     *        Provides the pagination token to load the next page if there are more results matching the request. If a
     *        pagination token is not present in the response, it means that all data matching the request has been
     *        loaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this request is read. Workbook cursor keeps
     * increasing with every update and the increments are not sequential.
     * </p>
     * 
     * @param workbookCursor
     *        Indicates the cursor of the workbook at which the data returned by this request is read. Workbook cursor
     *        keeps increasing with every update and the increments are not sequential.
     */

    public void setWorkbookCursor(Long workbookCursor) {
        this.workbookCursor = workbookCursor;
    }

    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this request is read. Workbook cursor keeps
     * increasing with every update and the increments are not sequential.
     * </p>
     * 
     * @return Indicates the cursor of the workbook at which the data returned by this request is read. Workbook cursor
     *         keeps increasing with every update and the increments are not sequential.
     */

    public Long getWorkbookCursor() {
        return this.workbookCursor;
    }

    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this request is read. Workbook cursor keeps
     * increasing with every update and the increments are not sequential.
     * </p>
     * 
     * @param workbookCursor
     *        Indicates the cursor of the workbook at which the data returned by this request is read. Workbook cursor
     *        keeps increasing with every update and the increments are not sequential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsResult withWorkbookCursor(Long workbookCursor) {
        setWorkbookCursor(workbookCursor);
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
        if (getColumnIds() != null)
            sb.append("ColumnIds: ").append(getColumnIds()).append(",");
        if (getRows() != null)
            sb.append("Rows: ").append(getRows()).append(",");
        if (getRowIdsNotFound() != null)
            sb.append("RowIdsNotFound: ").append(getRowIdsNotFound()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getWorkbookCursor() != null)
            sb.append("WorkbookCursor: ").append(getWorkbookCursor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTableRowsResult == false)
            return false;
        ListTableRowsResult other = (ListTableRowsResult) obj;
        if (other.getColumnIds() == null ^ this.getColumnIds() == null)
            return false;
        if (other.getColumnIds() != null && other.getColumnIds().equals(this.getColumnIds()) == false)
            return false;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        if (other.getRowIdsNotFound() == null ^ this.getRowIdsNotFound() == null)
            return false;
        if (other.getRowIdsNotFound() != null && other.getRowIdsNotFound().equals(this.getRowIdsNotFound()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkbookCursor() == null ^ this.getWorkbookCursor() == null)
            return false;
        if (other.getWorkbookCursor() != null && other.getWorkbookCursor().equals(this.getWorkbookCursor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnIds() == null) ? 0 : getColumnIds().hashCode());
        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        hashCode = prime * hashCode + ((getRowIdsNotFound() == null) ? 0 : getRowIdsNotFound().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkbookCursor() == null) ? 0 : getWorkbookCursor().hashCode());
        return hashCode;
    }

    @Override
    public ListTableRowsResult clone() {
        try {
            return (ListTableRowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
