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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTablesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The pagination token. To resume pagination, provide the NextToken value as argument of a subsequent API
     * invocation.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of items to return in the output. If the total number of items available is more than the value
     * specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument
     * of a subsequent API invocation.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @return The name of the Timestream database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The pagination token. To resume pagination, provide the NextToken value as argument of a subsequent API
     * invocation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token. To resume pagination, provide the NextToken value as argument of a subsequent API
     *        invocation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token. To resume pagination, provide the NextToken value as argument of a subsequent API
     * invocation.
     * </p>
     * 
     * @return The pagination token. To resume pagination, provide the NextToken value as argument of a subsequent API
     *         invocation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token. To resume pagination, provide the NextToken value as argument of a subsequent API
     * invocation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token. To resume pagination, provide the NextToken value as argument of a subsequent API
     *        invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of items to return in the output. If the total number of items available is more than the value
     * specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument
     * of a subsequent API invocation.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return in the output. If the total number of items available is more than the
     *        value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value
     *        as argument of a subsequent API invocation.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return in the output. If the total number of items available is more than the value
     * specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument
     * of a subsequent API invocation.
     * </p>
     * 
     * @return The total number of items to return in the output. If the total number of items available is more than
     *         the value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken
     *         value as argument of a subsequent API invocation.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of items to return in the output. If the total number of items available is more than the value
     * specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument
     * of a subsequent API invocation.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return in the output. If the total number of items available is more than the
     *        value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value
     *        as argument of a subsequent API invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTablesRequest withMaxResults(Integer maxResults) {
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
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

        if (obj instanceof ListTablesRequest == false)
            return false;
        ListTablesRequest other = (ListTablesRequest) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
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

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTablesRequest clone() {
        return (ListTablesRequest) super.clone();
    }

}
