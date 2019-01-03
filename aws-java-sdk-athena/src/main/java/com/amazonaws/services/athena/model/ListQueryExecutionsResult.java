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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListQueryExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueryExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique IDs of each query execution as an array of strings.
     * </p>
     */
    private java.util.List<String> queryExecutionIds;
    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique IDs of each query execution as an array of strings.
     * </p>
     * 
     * @return The unique IDs of each query execution as an array of strings.
     */

    public java.util.List<String> getQueryExecutionIds() {
        return queryExecutionIds;
    }

    /**
     * <p>
     * The unique IDs of each query execution as an array of strings.
     * </p>
     * 
     * @param queryExecutionIds
     *        The unique IDs of each query execution as an array of strings.
     */

    public void setQueryExecutionIds(java.util.Collection<String> queryExecutionIds) {
        if (queryExecutionIds == null) {
            this.queryExecutionIds = null;
            return;
        }

        this.queryExecutionIds = new java.util.ArrayList<String>(queryExecutionIds);
    }

    /**
     * <p>
     * The unique IDs of each query execution as an array of strings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryExecutionIds(java.util.Collection)} or {@link #withQueryExecutionIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param queryExecutionIds
     *        The unique IDs of each query execution as an array of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueryExecutionsResult withQueryExecutionIds(String... queryExecutionIds) {
        if (this.queryExecutionIds == null) {
            setQueryExecutionIds(new java.util.ArrayList<String>(queryExecutionIds.length));
        }
        for (String ele : queryExecutionIds) {
            this.queryExecutionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique IDs of each query execution as an array of strings.
     * </p>
     * 
     * @param queryExecutionIds
     *        The unique IDs of each query execution as an array of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueryExecutionsResult withQueryExecutionIds(java.util.Collection<String> queryExecutionIds) {
        setQueryExecutionIds(queryExecutionIds);
        return this;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * 
     * @param nextToken
     *        A token to be used by the next request if this request is truncated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * 
     * @return A token to be used by the next request if this request is truncated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * 
     * @param nextToken
     *        A token to be used by the next request if this request is truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueryExecutionsResult withNextToken(String nextToken) {
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
        if (getQueryExecutionIds() != null)
            sb.append("QueryExecutionIds: ").append(getQueryExecutionIds()).append(",");
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

        if (obj instanceof ListQueryExecutionsResult == false)
            return false;
        ListQueryExecutionsResult other = (ListQueryExecutionsResult) obj;
        if (other.getQueryExecutionIds() == null ^ this.getQueryExecutionIds() == null)
            return false;
        if (other.getQueryExecutionIds() != null && other.getQueryExecutionIds().equals(this.getQueryExecutionIds()) == false)
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

        hashCode = prime * hashCode + ((getQueryExecutionIds() == null) ? 0 : getQueryExecutionIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListQueryExecutionsResult clone() {
        try {
            return (ListQueryExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
