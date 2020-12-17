/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListContainerRecipes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContainerRecipesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Returns container recipes belonging to the specified owner, that have been shared with you. You can omit this
     * field to return container recipes belonging to your account.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * Request filters that are used to narrow the list of container images that are returned.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return in the list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Provides a token for pagination, which determines where to begin the next set of results when the current set
     * reaches the maximum for one request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns container recipes belonging to the specified owner, that have been shared with you. You can omit this
     * field to return container recipes belonging to your account.
     * </p>
     * 
     * @param owner
     *        Returns container recipes belonging to the specified owner, that have been shared with you. You can omit
     *        this field to return container recipes belonging to your account.
     * @see Ownership
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * Returns container recipes belonging to the specified owner, that have been shared with you. You can omit this
     * field to return container recipes belonging to your account.
     * </p>
     * 
     * @return Returns container recipes belonging to the specified owner, that have been shared with you. You can omit
     *         this field to return container recipes belonging to your account.
     * @see Ownership
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * Returns container recipes belonging to the specified owner, that have been shared with you. You can omit this
     * field to return container recipes belonging to your account.
     * </p>
     * 
     * @param owner
     *        Returns container recipes belonging to the specified owner, that have been shared with you. You can omit
     *        this field to return container recipes belonging to your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ownership
     */

    public ListContainerRecipesRequest withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * Returns container recipes belonging to the specified owner, that have been shared with you. You can omit this
     * field to return container recipes belonging to your account.
     * </p>
     * 
     * @param owner
     *        Returns container recipes belonging to the specified owner, that have been shared with you. You can omit
     *        this field to return container recipes belonging to your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ownership
     */

    public ListContainerRecipesRequest withOwner(Ownership owner) {
        this.owner = owner.toString();
        return this;
    }

    /**
     * <p>
     * Request filters that are used to narrow the list of container images that are returned.
     * </p>
     * 
     * @return Request filters that are used to narrow the list of container images that are returned.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Request filters that are used to narrow the list of container images that are returned.
     * </p>
     * 
     * @param filters
     *        Request filters that are used to narrow the list of container images that are returned.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * Request filters that are used to narrow the list of container images that are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Request filters that are used to narrow the list of container images that are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerRecipesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request filters that are used to narrow the list of container images that are returned.
     * </p>
     * 
     * @param filters
     *        Request filters that are used to narrow the list of container images that are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerRecipesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the list.
     * </p>
     * 
     * @return The maximum number of results to return in the list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerRecipesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Provides a token for pagination, which determines where to begin the next set of results when the current set
     * reaches the maximum for one request.
     * </p>
     * 
     * @param nextToken
     *        Provides a token for pagination, which determines where to begin the next set of results when the current
     *        set reaches the maximum for one request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides a token for pagination, which determines where to begin the next set of results when the current set
     * reaches the maximum for one request.
     * </p>
     * 
     * @return Provides a token for pagination, which determines where to begin the next set of results when the current
     *         set reaches the maximum for one request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Provides a token for pagination, which determines where to begin the next set of results when the current set
     * reaches the maximum for one request.
     * </p>
     * 
     * @param nextToken
     *        Provides a token for pagination, which determines where to begin the next set of results when the current
     *        set reaches the maximum for one request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerRecipesRequest withNextToken(String nextToken) {
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
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListContainerRecipesRequest == false)
            return false;
        ListContainerRecipesRequest other = (ListContainerRecipesRequest) obj;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContainerRecipesRequest clone() {
        return (ListContainerRecipesRequest) super.clone();
    }

}
