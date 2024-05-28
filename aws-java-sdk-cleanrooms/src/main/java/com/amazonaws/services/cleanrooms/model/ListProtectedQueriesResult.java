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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListProtectedQueries" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProtectedQueriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of protected queries.
     * </p>
     */
    private java.util.List<ProtectedQuerySummary> protectedQueries;

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedQueriesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of protected queries.
     * </p>
     * 
     * @return A list of protected queries.
     */

    public java.util.List<ProtectedQuerySummary> getProtectedQueries() {
        return protectedQueries;
    }

    /**
     * <p>
     * A list of protected queries.
     * </p>
     * 
     * @param protectedQueries
     *        A list of protected queries.
     */

    public void setProtectedQueries(java.util.Collection<ProtectedQuerySummary> protectedQueries) {
        if (protectedQueries == null) {
            this.protectedQueries = null;
            return;
        }

        this.protectedQueries = new java.util.ArrayList<ProtectedQuerySummary>(protectedQueries);
    }

    /**
     * <p>
     * A list of protected queries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtectedQueries(java.util.Collection)} or {@link #withProtectedQueries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param protectedQueries
     *        A list of protected queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedQueriesResult withProtectedQueries(ProtectedQuerySummary... protectedQueries) {
        if (this.protectedQueries == null) {
            setProtectedQueries(new java.util.ArrayList<ProtectedQuerySummary>(protectedQueries.length));
        }
        for (ProtectedQuerySummary ele : protectedQueries) {
            this.protectedQueries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of protected queries.
     * </p>
     * 
     * @param protectedQueries
     *        A list of protected queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedQueriesResult withProtectedQueries(java.util.Collection<ProtectedQuerySummary> protectedQueries) {
        setProtectedQueries(protectedQueries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getProtectedQueries() != null)
            sb.append("ProtectedQueries: ").append(getProtectedQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProtectedQueriesResult == false)
            return false;
        ListProtectedQueriesResult other = (ListProtectedQueriesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProtectedQueries() == null ^ this.getProtectedQueries() == null)
            return false;
        if (other.getProtectedQueries() != null && other.getProtectedQueries().equals(this.getProtectedQueries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProtectedQueries() == null) ? 0 : getProtectedQueries().hashCode());
        return hashCode;
    }

    @Override
    public ListProtectedQueriesResult clone() {
        try {
            return (ListProtectedQueriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
