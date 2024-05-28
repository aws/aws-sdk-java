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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response containing a list of archive search jobs and their statuses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchiveSearches" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListArchiveSearchesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If present, use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of search job identifiers and statuses.
     * </p>
     */
    private java.util.List<SearchSummary> searches;

    /**
     * <p>
     * If present, use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, use to retrieve the next page of results.
     * </p>
     * 
     * @return If present, use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArchiveSearchesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of search job identifiers and statuses.
     * </p>
     * 
     * @return The list of search job identifiers and statuses.
     */

    public java.util.List<SearchSummary> getSearches() {
        return searches;
    }

    /**
     * <p>
     * The list of search job identifiers and statuses.
     * </p>
     * 
     * @param searches
     *        The list of search job identifiers and statuses.
     */

    public void setSearches(java.util.Collection<SearchSummary> searches) {
        if (searches == null) {
            this.searches = null;
            return;
        }

        this.searches = new java.util.ArrayList<SearchSummary>(searches);
    }

    /**
     * <p>
     * The list of search job identifiers and statuses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSearches(java.util.Collection)} or {@link #withSearches(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param searches
     *        The list of search job identifiers and statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArchiveSearchesResult withSearches(SearchSummary... searches) {
        if (this.searches == null) {
            setSearches(new java.util.ArrayList<SearchSummary>(searches.length));
        }
        for (SearchSummary ele : searches) {
            this.searches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of search job identifiers and statuses.
     * </p>
     * 
     * @param searches
     *        The list of search job identifiers and statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArchiveSearchesResult withSearches(java.util.Collection<SearchSummary> searches) {
        setSearches(searches);
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
        if (getSearches() != null)
            sb.append("Searches: ").append(getSearches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListArchiveSearchesResult == false)
            return false;
        ListArchiveSearchesResult other = (ListArchiveSearchesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSearches() == null ^ this.getSearches() == null)
            return false;
        if (other.getSearches() != null && other.getSearches().equals(this.getSearches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSearches() == null) ? 0 : getSearches().hashCode());
        return hashCode;
    }

    @Override
    public ListArchiveSearchesResult clone() {
        try {
            return (ListArchiveSearchesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
