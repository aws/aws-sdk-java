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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SelectResourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectResourceConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the results for the SQL query.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> results;
    /**
     * <p>
     * Returns the <code>QueryInfo</code> object.
     * </p>
     */
    private QueryInfo queryInfo;
    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns the results for the SQL query.
     * </p>
     * 
     * @return Returns the results for the SQL query.
     */

    public java.util.List<String> getResults() {
        if (results == null) {
            results = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return results;
    }

    /**
     * <p>
     * Returns the results for the SQL query.
     * </p>
     * 
     * @param results
     *        Returns the results for the SQL query.
     */

    public void setResults(java.util.Collection<String> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new com.amazonaws.internal.SdkInternalList<String>(results);
    }

    /**
     * <p>
     * Returns the results for the SQL query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        Returns the results for the SQL query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectResourceConfigResult withResults(String... results) {
        if (this.results == null) {
            setResults(new com.amazonaws.internal.SdkInternalList<String>(results.length));
        }
        for (String ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the results for the SQL query.
     * </p>
     * 
     * @param results
     *        Returns the results for the SQL query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectResourceConfigResult withResults(java.util.Collection<String> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * Returns the <code>QueryInfo</code> object.
     * </p>
     * 
     * @param queryInfo
     *        Returns the <code>QueryInfo</code> object.
     */

    public void setQueryInfo(QueryInfo queryInfo) {
        this.queryInfo = queryInfo;
    }

    /**
     * <p>
     * Returns the <code>QueryInfo</code> object.
     * </p>
     * 
     * @return Returns the <code>QueryInfo</code> object.
     */

    public QueryInfo getQueryInfo() {
        return this.queryInfo;
    }

    /**
     * <p>
     * Returns the <code>QueryInfo</code> object.
     * </p>
     * 
     * @param queryInfo
     *        Returns the <code>QueryInfo</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectResourceConfigResult withQueryInfo(QueryInfo queryInfo) {
        setQueryInfo(queryInfo);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectResourceConfigResult withNextToken(String nextToken) {
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
            sb.append("Results: ").append(getResults()).append(",");
        if (getQueryInfo() != null)
            sb.append("QueryInfo: ").append(getQueryInfo()).append(",");
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

        if (obj instanceof SelectResourceConfigResult == false)
            return false;
        SelectResourceConfigResult other = (SelectResourceConfigResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getQueryInfo() == null ^ this.getQueryInfo() == null)
            return false;
        if (other.getQueryInfo() != null && other.getQueryInfo().equals(this.getQueryInfo()) == false)
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
        hashCode = prime * hashCode + ((getQueryInfo() == null) ? 0 : getQueryInfo().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SelectResourceConfigResult clone() {
        try {
            return (SelectResourceConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
