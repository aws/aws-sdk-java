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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Search" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>SearchResult</code> objects.
     * </p>
     */
    private java.util.List<SearchRecord> results;
    /**
     * <p>
     * If the result of the previous <code>Search</code> request was truncated, the response includes a NextToken. To
     * retrieve the next set of results, use the token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>SearchResult</code> objects.
     * </p>
     * 
     * @return A list of <code>SearchResult</code> objects.
     */

    public java.util.List<SearchRecord> getResults() {
        return results;
    }

    /**
     * <p>
     * A list of <code>SearchResult</code> objects.
     * </p>
     * 
     * @param results
     *        A list of <code>SearchResult</code> objects.
     */

    public void setResults(java.util.Collection<SearchRecord> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<SearchRecord>(results);
    }

    /**
     * <p>
     * A list of <code>SearchResult</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        A list of <code>SearchResult</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withResults(SearchRecord... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<SearchRecord>(results.length));
        }
        for (SearchRecord ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SearchResult</code> objects.
     * </p>
     * 
     * @param results
     *        A list of <code>SearchResult</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withResults(java.util.Collection<SearchRecord> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>Search</code> request was truncated, the response includes a NextToken. To
     * retrieve the next set of results, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>Search</code> request was truncated, the response includes a
     *        NextToken. To retrieve the next set of results, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>Search</code> request was truncated, the response includes a NextToken. To
     * retrieve the next set of results, use the token in the next request.
     * </p>
     * 
     * @return If the result of the previous <code>Search</code> request was truncated, the response includes a
     *         NextToken. To retrieve the next set of results, use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>Search</code> request was truncated, the response includes a NextToken. To
     * retrieve the next set of results, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>Search</code> request was truncated, the response includes a
     *        NextToken. To retrieve the next set of results, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withNextToken(String nextToken) {
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

        if (obj instanceof SearchResult == false)
            return false;
        SearchResult other = (SearchResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchResult clone() {
        try {
            return (SearchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
