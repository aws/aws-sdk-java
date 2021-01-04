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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * ListLocationsRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListLocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLocationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of locations to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An opaque string that indicates the position at which to begin the next list of locations.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * You can use API filters to narrow down the list of resources returned by <code>ListLocations</code>. For example,
     * to retrieve all tasks on a specific source location, you can use <code>ListLocations</code> with filter name
     * <code>LocationType S3</code> and <code>Operator Equals</code>.
     * </p>
     */
    private java.util.List<LocationFilter> filters;

    /**
     * <p>
     * The maximum number of locations to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of locations to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of locations to return.
     * </p>
     * 
     * @return The maximum number of locations to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of locations to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of locations to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLocationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin the next list of locations.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin the next list of locations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin the next list of locations.
     * </p>
     * 
     * @return An opaque string that indicates the position at which to begin the next list of locations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin the next list of locations.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin the next list of locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLocationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * You can use API filters to narrow down the list of resources returned by <code>ListLocations</code>. For example,
     * to retrieve all tasks on a specific source location, you can use <code>ListLocations</code> with filter name
     * <code>LocationType S3</code> and <code>Operator Equals</code>.
     * </p>
     * 
     * @return You can use API filters to narrow down the list of resources returned by <code>ListLocations</code>. For
     *         example, to retrieve all tasks on a specific source location, you can use <code>ListLocations</code> with
     *         filter name <code>LocationType S3</code> and <code>Operator Equals</code>.
     */

    public java.util.List<LocationFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * You can use API filters to narrow down the list of resources returned by <code>ListLocations</code>. For example,
     * to retrieve all tasks on a specific source location, you can use <code>ListLocations</code> with filter name
     * <code>LocationType S3</code> and <code>Operator Equals</code>.
     * </p>
     * 
     * @param filters
     *        You can use API filters to narrow down the list of resources returned by <code>ListLocations</code>. For
     *        example, to retrieve all tasks on a specific source location, you can use <code>ListLocations</code> with
     *        filter name <code>LocationType S3</code> and <code>Operator Equals</code>.
     */

    public void setFilters(java.util.Collection<LocationFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<LocationFilter>(filters);
    }

    /**
     * <p>
     * You can use API filters to narrow down the list of resources returned by <code>ListLocations</code>. For example,
     * to retrieve all tasks on a specific source location, you can use <code>ListLocations</code> with filter name
     * <code>LocationType S3</code> and <code>Operator Equals</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        You can use API filters to narrow down the list of resources returned by <code>ListLocations</code>. For
     *        example, to retrieve all tasks on a specific source location, you can use <code>ListLocations</code> with
     *        filter name <code>LocationType S3</code> and <code>Operator Equals</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLocationsRequest withFilters(LocationFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<LocationFilter>(filters.length));
        }
        for (LocationFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can use API filters to narrow down the list of resources returned by <code>ListLocations</code>. For example,
     * to retrieve all tasks on a specific source location, you can use <code>ListLocations</code> with filter name
     * <code>LocationType S3</code> and <code>Operator Equals</code>.
     * </p>
     * 
     * @param filters
     *        You can use API filters to narrow down the list of resources returned by <code>ListLocations</code>. For
     *        example, to retrieve all tasks on a specific source location, you can use <code>ListLocations</code> with
     *        filter name <code>LocationType S3</code> and <code>Operator Equals</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLocationsRequest withFilters(java.util.Collection<LocationFilter> filters) {
        setFilters(filters);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLocationsRequest == false)
            return false;
        ListLocationsRequest other = (ListLocationsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListLocationsRequest clone() {
        return (ListLocationsRequest) super.clone();
    }

}
