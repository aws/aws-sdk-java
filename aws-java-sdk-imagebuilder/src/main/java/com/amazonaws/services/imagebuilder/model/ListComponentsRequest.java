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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The owner defines which components you want to list. By default, this request will only show components owned by
     * your account. You can use this field to specify if you want to view components owned by yourself, by Amazon, or
     * those components that have been shared with you by other customers.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The filters.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The owner defines which components you want to list. By default, this request will only show components owned by
     * your account. You can use this field to specify if you want to view components owned by yourself, by Amazon, or
     * those components that have been shared with you by other customers.
     * </p>
     * 
     * @param owner
     *        The owner defines which components you want to list. By default, this request will only show components
     *        owned by your account. You can use this field to specify if you want to view components owned by yourself,
     *        by Amazon, or those components that have been shared with you by other customers.
     * @see Ownership
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner defines which components you want to list. By default, this request will only show components owned by
     * your account. You can use this field to specify if you want to view components owned by yourself, by Amazon, or
     * those components that have been shared with you by other customers.
     * </p>
     * 
     * @return The owner defines which components you want to list. By default, this request will only show components
     *         owned by your account. You can use this field to specify if you want to view components owned by
     *         yourself, by Amazon, or those components that have been shared with you by other customers.
     * @see Ownership
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner defines which components you want to list. By default, this request will only show components owned by
     * your account. You can use this field to specify if you want to view components owned by yourself, by Amazon, or
     * those components that have been shared with you by other customers.
     * </p>
     * 
     * @param owner
     *        The owner defines which components you want to list. By default, this request will only show components
     *        owned by your account. You can use this field to specify if you want to view components owned by yourself,
     *        by Amazon, or those components that have been shared with you by other customers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ownership
     */

    public ListComponentsRequest withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The owner defines which components you want to list. By default, this request will only show components owned by
     * your account. You can use this field to specify if you want to view components owned by yourself, by Amazon, or
     * those components that have been shared with you by other customers.
     * </p>
     * 
     * @param owner
     *        The owner defines which components you want to list. By default, this request will only show components
     *        owned by your account. You can use this field to specify if you want to view components owned by yourself,
     *        by Amazon, or those components that have been shared with you by other customers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ownership
     */

    public ListComponentsRequest withOwner(Ownership owner) {
        this.owner = owner.toString();
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @return The filters.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @param filters
     *        The filters.
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
     * The filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * 
     * @param filters
     *        The filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * 
     * @param maxResults
     *        The maximum items to return in a request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * 
     * @return The maximum items to return in a request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * 
     * @param maxResults
     *        The maximum items to return in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @return A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListComponentsRequest == false)
            return false;
        ListComponentsRequest other = (ListComponentsRequest) obj;
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
    public ListComponentsRequest clone() {
        return (ListComponentsRequest) super.clone();
    }

}
