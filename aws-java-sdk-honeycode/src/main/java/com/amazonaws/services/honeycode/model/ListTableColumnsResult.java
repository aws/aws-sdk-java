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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTableColumns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTableColumnsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of columns in the table.
     * </p>
     */
    private java.util.List<TableColumn> tableColumns;
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
     * The list of columns in the table.
     * </p>
     * 
     * @return The list of columns in the table.
     */

    public java.util.List<TableColumn> getTableColumns() {
        return tableColumns;
    }

    /**
     * <p>
     * The list of columns in the table.
     * </p>
     * 
     * @param tableColumns
     *        The list of columns in the table.
     */

    public void setTableColumns(java.util.Collection<TableColumn> tableColumns) {
        if (tableColumns == null) {
            this.tableColumns = null;
            return;
        }

        this.tableColumns = new java.util.ArrayList<TableColumn>(tableColumns);
    }

    /**
     * <p>
     * The list of columns in the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableColumns(java.util.Collection)} or {@link #withTableColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tableColumns
     *        The list of columns in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableColumnsResult withTableColumns(TableColumn... tableColumns) {
        if (this.tableColumns == null) {
            setTableColumns(new java.util.ArrayList<TableColumn>(tableColumns.length));
        }
        for (TableColumn ele : tableColumns) {
            this.tableColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of columns in the table.
     * </p>
     * 
     * @param tableColumns
     *        The list of columns in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableColumnsResult withTableColumns(java.util.Collection<TableColumn> tableColumns) {
        setTableColumns(tableColumns);
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

    public ListTableColumnsResult withNextToken(String nextToken) {
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

    public ListTableColumnsResult withWorkbookCursor(Long workbookCursor) {
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
        if (getTableColumns() != null)
            sb.append("TableColumns: ").append(getTableColumns()).append(",");
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

        if (obj instanceof ListTableColumnsResult == false)
            return false;
        ListTableColumnsResult other = (ListTableColumnsResult) obj;
        if (other.getTableColumns() == null ^ this.getTableColumns() == null)
            return false;
        if (other.getTableColumns() != null && other.getTableColumns().equals(this.getTableColumns()) == false)
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

        hashCode = prime * hashCode + ((getTableColumns() == null) ? 0 : getTableColumns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkbookCursor() == null) ? 0 : getWorkbookCursor().hashCode());
        return hashCode;
    }

    @Override
    public ListTableColumnsResult clone() {
        try {
            return (ListTableColumnsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
