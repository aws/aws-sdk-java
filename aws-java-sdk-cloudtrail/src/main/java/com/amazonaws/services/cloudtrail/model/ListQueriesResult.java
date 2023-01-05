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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListQueries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists matching query results, and shows query ID, status, and creation time of each query.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Query> queries;
    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists matching query results, and shows query ID, status, and creation time of each query.
     * </p>
     * 
     * @return Lists matching query results, and shows query ID, status, and creation time of each query.
     */

    public java.util.List<Query> getQueries() {
        if (queries == null) {
            queries = new com.amazonaws.internal.SdkInternalList<Query>();
        }
        return queries;
    }

    /**
     * <p>
     * Lists matching query results, and shows query ID, status, and creation time of each query.
     * </p>
     * 
     * @param queries
     *        Lists matching query results, and shows query ID, status, and creation time of each query.
     */

    public void setQueries(java.util.Collection<Query> queries) {
        if (queries == null) {
            this.queries = null;
            return;
        }

        this.queries = new com.amazonaws.internal.SdkInternalList<Query>(queries);
    }

    /**
     * <p>
     * Lists matching query results, and shows query ID, status, and creation time of each query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueries(java.util.Collection)} or {@link #withQueries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param queries
     *        Lists matching query results, and shows query ID, status, and creation time of each query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueriesResult withQueries(Query... queries) {
        if (this.queries == null) {
            setQueries(new com.amazonaws.internal.SdkInternalList<Query>(queries.length));
        }
        for (Query ele : queries) {
            this.queries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists matching query results, and shows query ID, status, and creation time of each query.
     * </p>
     * 
     * @param queries
     *        Lists matching query results, and shows query ID, status, and creation time of each query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueriesResult withQueries(java.util.Collection<Query> queries) {
        setQueries(queries);
        return this;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @return A token you can use to get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueriesResult withNextToken(String nextToken) {
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

        if (obj instanceof ListQueriesResult == false)
            return false;
        ListQueriesResult other = (ListQueriesResult) obj;
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
    public ListQueriesResult clone() {
        try {
            return (ListQueriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
