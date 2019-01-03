/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeQueries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeQueriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of queries that match the request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<QueryInfo> queries;

    private String nextToken;

    /**
     * <p>
     * The list of queries that match the request.
     * </p>
     * 
     * @return The list of queries that match the request.
     */

    public java.util.List<QueryInfo> getQueries() {
        if (queries == null) {
            queries = new com.amazonaws.internal.SdkInternalList<QueryInfo>();
        }
        return queries;
    }

    /**
     * <p>
     * The list of queries that match the request.
     * </p>
     * 
     * @param queries
     *        The list of queries that match the request.
     */

    public void setQueries(java.util.Collection<QueryInfo> queries) {
        if (queries == null) {
            this.queries = null;
            return;
        }

        this.queries = new com.amazonaws.internal.SdkInternalList<QueryInfo>(queries);
    }

    /**
     * <p>
     * The list of queries that match the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueries(java.util.Collection)} or {@link #withQueries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param queries
     *        The list of queries that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueriesResult withQueries(QueryInfo... queries) {
        if (this.queries == null) {
            setQueries(new com.amazonaws.internal.SdkInternalList<QueryInfo>(queries.length));
        }
        for (QueryInfo ele : queries) {
            this.queries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of queries that match the request.
     * </p>
     * 
     * @param queries
     *        The list of queries that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueriesResult withQueries(java.util.Collection<QueryInfo> queries) {
        setQueries(queries);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueriesResult withNextToken(String nextToken) {
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
        if (getQueries() != null)
            sb.append("Queries: ").append(getQueries()).append(",");
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

        if (obj instanceof DescribeQueriesResult == false)
            return false;
        DescribeQueriesResult other = (DescribeQueriesResult) obj;
        if (other.getQueries() == null ^ this.getQueries() == null)
            return false;
        if (other.getQueries() != null && other.getQueries().equals(this.getQueries()) == false)
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

        hashCode = prime * hashCode + ((getQueries() == null) ? 0 : getQueries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeQueriesResult clone() {
        try {
            return (DescribeQueriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
