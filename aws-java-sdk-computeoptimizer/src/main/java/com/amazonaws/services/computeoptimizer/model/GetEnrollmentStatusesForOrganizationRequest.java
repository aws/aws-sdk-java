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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEnrollmentStatusesForOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnrollmentStatusesForOrganizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of account enrollment statuses.
     * </p>
     */
    private java.util.List<EnrollmentFilter> filters;
    /**
     * <p>
     * The token to advance to the next page of account enrollment statuses.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of account enrollment statuses to return with a single request. You can specify up to 100
     * statuses to return with each request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of account enrollment statuses.
     * </p>
     * 
     * @return An array of objects to specify a filter that returns a more specific list of account enrollment statuses.
     */

    public java.util.List<EnrollmentFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of account enrollment statuses.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of account enrollment statuses.
     */

    public void setFilters(java.util.Collection<EnrollmentFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<EnrollmentFilter>(filters);
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of account enrollment statuses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of account enrollment statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnrollmentStatusesForOrganizationRequest withFilters(EnrollmentFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<EnrollmentFilter>(filters.length));
        }
        for (EnrollmentFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of account enrollment statuses.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of account enrollment statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnrollmentStatusesForOrganizationRequest withFilters(java.util.Collection<EnrollmentFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of account enrollment statuses.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of account enrollment statuses.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of account enrollment statuses.
     * </p>
     * 
     * @return The token to advance to the next page of account enrollment statuses.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of account enrollment statuses.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of account enrollment statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnrollmentStatusesForOrganizationRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of account enrollment statuses to return with a single request. You can specify up to 100
     * statuses to return with each request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of account enrollment statuses to return with a single request. You can specify up to
     *        100 statuses to return with each request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of account enrollment statuses to return with a single request. You can specify up to 100
     * statuses to return with each request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of account enrollment statuses to return with a single request. You can specify up to
     *         100 statuses to return with each request.</p>
     *         <p>
     *         To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of account enrollment statuses to return with a single request. You can specify up to 100
     * statuses to return with each request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of account enrollment statuses to return with a single request. You can specify up to
     *        100 statuses to return with each request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnrollmentStatusesForOrganizationRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnrollmentStatusesForOrganizationRequest == false)
            return false;
        GetEnrollmentStatusesForOrganizationRequest other = (GetEnrollmentStatusesForOrganizationRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetEnrollmentStatusesForOrganizationRequest clone() {
        return (GetEnrollmentStatusesForOrganizationRequest) super.clone();
    }

}
