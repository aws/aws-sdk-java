/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListDataCellsFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataCellsFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A table in the Glue Data Catalog.
     * </p>
     */
    private TableResource table;
    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum size of the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A table in the Glue Data Catalog.
     * </p>
     * 
     * @param table
     *        A table in the Glue Data Catalog.
     */

    public void setTable(TableResource table) {
        this.table = table;
    }

    /**
     * <p>
     * A table in the Glue Data Catalog.
     * </p>
     * 
     * @return A table in the Glue Data Catalog.
     */

    public TableResource getTable() {
        return this.table;
    }

    /**
     * <p>
     * A table in the Glue Data Catalog.
     * </p>
     * 
     * @param table
     *        A table in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataCellsFilterRequest withTable(TableResource table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataCellsFilterRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum size of the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of the response.
     * </p>
     * 
     * @return The maximum size of the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum size of the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataCellsFilterRequest withMaxResults(Integer maxResults) {
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
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
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

        if (obj instanceof ListDataCellsFilterRequest == false)
            return false;
        ListDataCellsFilterRequest other = (ListDataCellsFilterRequest) obj;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
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

        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDataCellsFilterRequest clone() {
        return (ListDataCellsFilterRequest) super.clone();
    }

}
