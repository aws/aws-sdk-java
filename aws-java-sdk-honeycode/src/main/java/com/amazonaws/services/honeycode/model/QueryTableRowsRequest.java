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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/QueryTableRows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryTableRowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workbook whose table rows are being queried.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     */
    private String workbookId;
    /**
     * <p>
     * The ID of the table whose rows are being queried.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * An object that represents a filter formula along with the id of the context row under which the filter function
     * needs to evaluate.
     * </p>
     */
    private Filter filterFormula;
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
     * The ID of the workbook whose table rows are being queried.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook whose table rows are being queried.</p>
     *        <p>
     *        If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public void setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
    }

    /**
     * <p>
     * The ID of the workbook whose table rows are being queried.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @return The ID of the workbook whose table rows are being queried.</p>
     *         <p>
     *         If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public String getWorkbookId() {
        return this.workbookId;
    }

    /**
     * <p>
     * The ID of the workbook whose table rows are being queried.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook whose table rows are being queried.</p>
     *        <p>
     *        If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryTableRowsRequest withWorkbookId(String workbookId) {
        setWorkbookId(workbookId);
        return this;
    }

    /**
     * <p>
     * The ID of the table whose rows are being queried.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param tableId
     *        The ID of the table whose rows are being queried.</p>
     *        <p>
     *        If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * The ID of the table whose rows are being queried.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @return The ID of the table whose rows are being queried.</p>
     *         <p>
     *         If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * The ID of the table whose rows are being queried.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param tableId
     *        The ID of the table whose rows are being queried.</p>
     *        <p>
     *        If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryTableRowsRequest withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * An object that represents a filter formula along with the id of the context row under which the filter function
     * needs to evaluate.
     * </p>
     * 
     * @param filterFormula
     *        An object that represents a filter formula along with the id of the context row under which the filter
     *        function needs to evaluate.
     */

    public void setFilterFormula(Filter filterFormula) {
        this.filterFormula = filterFormula;
    }

    /**
     * <p>
     * An object that represents a filter formula along with the id of the context row under which the filter function
     * needs to evaluate.
     * </p>
     * 
     * @return An object that represents a filter formula along with the id of the context row under which the filter
     *         function needs to evaluate.
     */

    public Filter getFilterFormula() {
        return this.filterFormula;
    }

    /**
     * <p>
     * An object that represents a filter formula along with the id of the context row under which the filter function
     * needs to evaluate.
     * </p>
     * 
     * @param filterFormula
     *        An object that represents a filter formula along with the id of the context row under which the filter
     *        function needs to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryTableRowsRequest withFilterFormula(Filter filterFormula) {
        setFilterFormula(filterFormula);
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

    public QueryTableRowsRequest withMaxResults(Integer maxResults) {
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

    public QueryTableRowsRequest withNextToken(String nextToken) {
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
        if (getFilterFormula() != null)
            sb.append("FilterFormula: ").append(getFilterFormula()).append(",");
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

        if (obj instanceof QueryTableRowsRequest == false)
            return false;
        QueryTableRowsRequest other = (QueryTableRowsRequest) obj;
        if (other.getWorkbookId() == null ^ this.getWorkbookId() == null)
            return false;
        if (other.getWorkbookId() != null && other.getWorkbookId().equals(this.getWorkbookId()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getFilterFormula() == null ^ this.getFilterFormula() == null)
            return false;
        if (other.getFilterFormula() != null && other.getFilterFormula().equals(this.getFilterFormula()) == false)
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
        hashCode = prime * hashCode + ((getFilterFormula() == null) ? 0 : getFilterFormula().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public QueryTableRowsRequest clone() {
        return (QueryTableRowsRequest) super.clone();
    }

}
