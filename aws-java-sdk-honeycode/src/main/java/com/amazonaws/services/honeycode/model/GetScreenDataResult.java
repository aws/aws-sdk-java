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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/GetScreenData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScreenDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A map of all the rows on the screen keyed by block name.
     * </p>
     */
    private java.util.Map<String, ResultSet> results;
    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this workbook is read. Workbook cursor keeps
     * increasing with every update and the increments are not sequential.
     * </p>
     */
    private Long workbookCursor;
    /**
     * <p>
     * Provides the pagination token to load the next page if there are more results matching the request. If a
     * pagination token is not present in the response, it means that all data matching the query has been loaded.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A map of all the rows on the screen keyed by block name.
     * </p>
     * 
     * @return A map of all the rows on the screen keyed by block name.
     */

    public java.util.Map<String, ResultSet> getResults() {
        return results;
    }

    /**
     * <p>
     * A map of all the rows on the screen keyed by block name.
     * </p>
     * 
     * @param results
     *        A map of all the rows on the screen keyed by block name.
     */

    public void setResults(java.util.Map<String, ResultSet> results) {
        this.results = results;
    }

    /**
     * <p>
     * A map of all the rows on the screen keyed by block name.
     * </p>
     * 
     * @param results
     *        A map of all the rows on the screen keyed by block name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataResult withResults(java.util.Map<String, ResultSet> results) {
        setResults(results);
        return this;
    }

    /**
     * Add a single Results entry
     *
     * @see GetScreenDataResult#withResults
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataResult addResultsEntry(String key, ResultSet value) {
        if (null == this.results) {
            this.results = new java.util.HashMap<String, ResultSet>();
        }
        if (this.results.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.results.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Results.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataResult clearResultsEntries() {
        this.results = null;
        return this;
    }

    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this workbook is read. Workbook cursor keeps
     * increasing with every update and the increments are not sequential.
     * </p>
     * 
     * @param workbookCursor
     *        Indicates the cursor of the workbook at which the data returned by this workbook is read. Workbook cursor
     *        keeps increasing with every update and the increments are not sequential.
     */

    public void setWorkbookCursor(Long workbookCursor) {
        this.workbookCursor = workbookCursor;
    }

    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this workbook is read. Workbook cursor keeps
     * increasing with every update and the increments are not sequential.
     * </p>
     * 
     * @return Indicates the cursor of the workbook at which the data returned by this workbook is read. Workbook cursor
     *         keeps increasing with every update and the increments are not sequential.
     */

    public Long getWorkbookCursor() {
        return this.workbookCursor;
    }

    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this workbook is read. Workbook cursor keeps
     * increasing with every update and the increments are not sequential.
     * </p>
     * 
     * @param workbookCursor
     *        Indicates the cursor of the workbook at which the data returned by this workbook is read. Workbook cursor
     *        keeps increasing with every update and the increments are not sequential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataResult withWorkbookCursor(Long workbookCursor) {
        setWorkbookCursor(workbookCursor);
        return this;
    }

    /**
     * <p>
     * Provides the pagination token to load the next page if there are more results matching the request. If a
     * pagination token is not present in the response, it means that all data matching the query has been loaded.
     * </p>
     * 
     * @param nextToken
     *        Provides the pagination token to load the next page if there are more results matching the request. If a
     *        pagination token is not present in the response, it means that all data matching the query has been
     *        loaded.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides the pagination token to load the next page if there are more results matching the request. If a
     * pagination token is not present in the response, it means that all data matching the query has been loaded.
     * </p>
     * 
     * @return Provides the pagination token to load the next page if there are more results matching the request. If a
     *         pagination token is not present in the response, it means that all data matching the query has been
     *         loaded.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Provides the pagination token to load the next page if there are more results matching the request. If a
     * pagination token is not present in the response, it means that all data matching the query has been loaded.
     * </p>
     * 
     * @param nextToken
     *        Provides the pagination token to load the next page if there are more results matching the request. If a
     *        pagination token is not present in the response, it means that all data matching the query has been
     *        loaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScreenDataResult withNextToken(String nextToken) {
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
        if (getResults() != null)
            sb.append("Results: ").append("***Sensitive Data Redacted***").append(",");
        if (getWorkbookCursor() != null)
            sb.append("WorkbookCursor: ").append(getWorkbookCursor()).append(",");
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

        if (obj instanceof GetScreenDataResult == false)
            return false;
        GetScreenDataResult other = (GetScreenDataResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getWorkbookCursor() == null ^ this.getWorkbookCursor() == null)
            return false;
        if (other.getWorkbookCursor() != null && other.getWorkbookCursor().equals(this.getWorkbookCursor()) == false)
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

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getWorkbookCursor() == null) ? 0 : getWorkbookCursor().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetScreenDataResult clone() {
        try {
            return (GetScreenDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
