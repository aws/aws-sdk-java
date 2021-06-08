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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTableRows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTableRowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workbook that contains the table whose rows are being retrieved.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     */
    private String workbookId;
    /**
     * <p>
     * The ID of the table whose rows are being retrieved.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * This parameter is optional. If one or more row ids are specified in this list, then only the specified row ids
     * are returned in the result. If no row ids are specified here, then all the rows in the table are returned.
     * </p>
     */
    private java.util.List<String> rowIds;
    /**
     * <p>
     * The maximum number of rows to return in each page of the results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will
     * throw ValidationException.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the workbook that contains the table whose rows are being retrieved.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook that contains the table whose rows are being retrieved.</p>
     *        <p>
     *        If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public void setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
    }

    /**
     * <p>
     * The ID of the workbook that contains the table whose rows are being retrieved.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @return The ID of the workbook that contains the table whose rows are being retrieved.</p>
     *         <p>
     *         If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public String getWorkbookId() {
        return this.workbookId;
    }

    /**
     * <p>
     * The ID of the workbook that contains the table whose rows are being retrieved.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook that contains the table whose rows are being retrieved.</p>
     *        <p>
     *        If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsRequest withWorkbookId(String workbookId) {
        setWorkbookId(workbookId);
        return this;
    }

    /**
     * <p>
     * The ID of the table whose rows are being retrieved.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param tableId
     *        The ID of the table whose rows are being retrieved.</p>
     *        <p>
     *        If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * The ID of the table whose rows are being retrieved.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @return The ID of the table whose rows are being retrieved.</p>
     *         <p>
     *         If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * The ID of the table whose rows are being retrieved.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param tableId
     *        The ID of the table whose rows are being retrieved.</p>
     *        <p>
     *        If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsRequest withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * This parameter is optional. If one or more row ids are specified in this list, then only the specified row ids
     * are returned in the result. If no row ids are specified here, then all the rows in the table are returned.
     * </p>
     * 
     * @return This parameter is optional. If one or more row ids are specified in this list, then only the specified
     *         row ids are returned in the result. If no row ids are specified here, then all the rows in the table are
     *         returned.
     */

    public java.util.List<String> getRowIds() {
        return rowIds;
    }

    /**
     * <p>
     * This parameter is optional. If one or more row ids are specified in this list, then only the specified row ids
     * are returned in the result. If no row ids are specified here, then all the rows in the table are returned.
     * </p>
     * 
     * @param rowIds
     *        This parameter is optional. If one or more row ids are specified in this list, then only the specified row
     *        ids are returned in the result. If no row ids are specified here, then all the rows in the table are
     *        returned.
     */

    public void setRowIds(java.util.Collection<String> rowIds) {
        if (rowIds == null) {
            this.rowIds = null;
            return;
        }

        this.rowIds = new java.util.ArrayList<String>(rowIds);
    }

    /**
     * <p>
     * This parameter is optional. If one or more row ids are specified in this list, then only the specified row ids
     * are returned in the result. If no row ids are specified here, then all the rows in the table are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRowIds(java.util.Collection)} or {@link #withRowIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rowIds
     *        This parameter is optional. If one or more row ids are specified in this list, then only the specified row
     *        ids are returned in the result. If no row ids are specified here, then all the rows in the table are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsRequest withRowIds(String... rowIds) {
        if (this.rowIds == null) {
            setRowIds(new java.util.ArrayList<String>(rowIds.length));
        }
        for (String ele : rowIds) {
            this.rowIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This parameter is optional. If one or more row ids are specified in this list, then only the specified row ids
     * are returned in the result. If no row ids are specified here, then all the rows in the table are returned.
     * </p>
     * 
     * @param rowIds
     *        This parameter is optional. If one or more row ids are specified in this list, then only the specified row
     *        ids are returned in the result. If no row ids are specified here, then all the rows in the table are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsRequest withRowIds(java.util.Collection<String> rowIds) {
        setRowIds(rowIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of rows to return in each page of the results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of rows to return in each page of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of rows to return in each page of the results.
     * </p>
     * 
     * @return The maximum number of rows to return in each page of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of rows to return in each page of the results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of rows to return in each page of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will
     * throw ValidationException.
     * </p>
     * 
     * @param nextToken
     *        This parameter is optional. If a nextToken is not specified, the API returns the first page of data. </p>
     *        <p>
     *        Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the
     *        API will throw ValidationException.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will
     * throw ValidationException.
     * </p>
     * 
     * @return This parameter is optional. If a nextToken is not specified, the API returns the first page of data. </p>
     *         <p>
     *         Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the
     *         API will throw ValidationException.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * This parameter is optional. If a nextToken is not specified, the API returns the first page of data.
     * </p>
     * <p>
     * Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will
     * throw ValidationException.
     * </p>
     * 
     * @param nextToken
     *        This parameter is optional. If a nextToken is not specified, the API returns the first page of data. </p>
     *        <p>
     *        Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the
     *        API will throw ValidationException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRowsRequest withNextToken(String nextToken) {
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
        if (getWorkbookId() != null)
            sb.append("WorkbookId: ").append(getWorkbookId()).append(",");
        if (getTableId() != null)
            sb.append("TableId: ").append(getTableId()).append(",");
        if (getRowIds() != null)
            sb.append("RowIds: ").append(getRowIds()).append(",");
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

        if (obj instanceof ListTableRowsRequest == false)
            return false;
        ListTableRowsRequest other = (ListTableRowsRequest) obj;
        if (other.getWorkbookId() == null ^ this.getWorkbookId() == null)
            return false;
        if (other.getWorkbookId() != null && other.getWorkbookId().equals(this.getWorkbookId()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getRowIds() == null ^ this.getRowIds() == null)
            return false;
        if (other.getRowIds() != null && other.getRowIds().equals(this.getRowIds()) == false)
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

        hashCode = prime * hashCode + ((getWorkbookId() == null) ? 0 : getWorkbookId().hashCode());
        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime * hashCode + ((getRowIds() == null) ? 0 : getRowIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTableRowsRequest clone() {
        return (ListTableRowsRequest) super.clone();
    }

}
