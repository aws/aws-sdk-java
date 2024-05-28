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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters to scope the results. The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WORKLOAD_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYMENT_STATUS</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<DeploymentFilter> filters;
    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filters to scope the results. The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WORKLOAD_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYMENT_STATUS</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filters to scope the results. The following filters are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>WORKLOAD_NAME</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPLOYMENT_STATUS</code>
     *         </p>
     *         </li>
     */

    public java.util.List<DeploymentFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters to scope the results. The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WORKLOAD_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYMENT_STATUS</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters to scope the results. The following filters are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>WORKLOAD_NAME</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPLOYMENT_STATUS</code>
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<DeploymentFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<DeploymentFilter>(filters);
    }

    /**
     * <p>
     * Filters to scope the results. The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WORKLOAD_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYMENT_STATUS</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters to scope the results. The following filters are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>WORKLOAD_NAME</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPLOYMENT_STATUS</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withFilters(DeploymentFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<DeploymentFilter>(filters.length));
        }
        for (DeploymentFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters to scope the results. The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WORKLOAD_NAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPLOYMENT_STATUS</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters to scope the results. The following filters are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>WORKLOAD_NAME</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPLOYMENT_STATUS</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withFilters(java.util.Collection<DeploymentFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output.
     * </p>
     * 
     * @return The maximum number of items to return for this request. To get the next page of items, make another
     *         request with the token returned in the output.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @return The token returned from a previous paginated request. Pagination continues from the end of the items
     *         returned by the previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListDeploymentsRequest == false)
            return false;
        ListDeploymentsRequest other = (ListDeploymentsRequest) obj;
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentsRequest clone() {
        return (ListDeploymentsRequest) super.clone();
    }

}
