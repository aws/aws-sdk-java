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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of filtering criteria that scope down the result list. By default, all service instances in the Amazon
     * Web Services account are returned.
     * </p>
     */
    private java.util.List<ListServiceInstancesFilter> filters;
    /**
     * <p>
     * The maximum number of service instances to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token that indicates the location of the next service in the array of service instances, after the list of
     * service instances that was previously requested.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The field that the result list is sorted by.
     * </p>
     * <p>
     * When you choose to sort by <code>serviceName</code>, service instances within each service are sorted by service
     * instance name.
     * </p>
     * <p>
     * Default: <code>serviceName</code>
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Result list sort order.
     * </p>
     * <p>
     * Default: <code>ASCENDING</code>
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * An array of filtering criteria that scope down the result list. By default, all service instances in the Amazon
     * Web Services account are returned.
     * </p>
     * 
     * @return An array of filtering criteria that scope down the result list. By default, all service instances in the
     *         Amazon Web Services account are returned.
     */

    public java.util.List<ListServiceInstancesFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of filtering criteria that scope down the result list. By default, all service instances in the Amazon
     * Web Services account are returned.
     * </p>
     * 
     * @param filters
     *        An array of filtering criteria that scope down the result list. By default, all service instances in the
     *        Amazon Web Services account are returned.
     */

    public void setFilters(java.util.Collection<ListServiceInstancesFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ListServiceInstancesFilter>(filters);
    }

    /**
     * <p>
     * An array of filtering criteria that scope down the result list. By default, all service instances in the Amazon
     * Web Services account are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of filtering criteria that scope down the result list. By default, all service instances in the
     *        Amazon Web Services account are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesRequest withFilters(ListServiceInstancesFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ListServiceInstancesFilter>(filters.length));
        }
        for (ListServiceInstancesFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of filtering criteria that scope down the result list. By default, all service instances in the Amazon
     * Web Services account are returned.
     * </p>
     * 
     * @param filters
     *        An array of filtering criteria that scope down the result list. By default, all service instances in the
     *        Amazon Web Services account are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesRequest withFilters(java.util.Collection<ListServiceInstancesFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of service instances to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of service instances to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of service instances to list.
     * </p>
     * 
     * @return The maximum number of service instances to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of service instances to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of service instances to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that indicates the location of the next service in the array of service instances, after the list of
     * service instances that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next service in the array of service instances, after the list
     *        of service instances that was previously requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next service in the array of service instances, after the list of
     * service instances that was previously requested.
     * </p>
     * 
     * @return A token that indicates the location of the next service in the array of service instances, after the list
     *         of service instances that was previously requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next service in the array of service instances, after the list of
     * service instances that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next service in the array of service instances, after the list
     *        of service instances that was previously requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance belongs to.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @return The name of the service that the service instance belongs to.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceInstancesRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The field that the result list is sorted by.
     * </p>
     * <p>
     * When you choose to sort by <code>serviceName</code>, service instances within each service are sorted by service
     * instance name.
     * </p>
     * <p>
     * Default: <code>serviceName</code>
     * </p>
     * 
     * @param sortBy
     *        The field that the result list is sorted by.</p>
     *        <p>
     *        When you choose to sort by <code>serviceName</code>, service instances within each service are sorted by
     *        service instance name.
     *        </p>
     *        <p>
     *        Default: <code>serviceName</code>
     * @see ListServiceInstancesSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The field that the result list is sorted by.
     * </p>
     * <p>
     * When you choose to sort by <code>serviceName</code>, service instances within each service are sorted by service
     * instance name.
     * </p>
     * <p>
     * Default: <code>serviceName</code>
     * </p>
     * 
     * @return The field that the result list is sorted by.</p>
     *         <p>
     *         When you choose to sort by <code>serviceName</code>, service instances within each service are sorted by
     *         service instance name.
     *         </p>
     *         <p>
     *         Default: <code>serviceName</code>
     * @see ListServiceInstancesSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The field that the result list is sorted by.
     * </p>
     * <p>
     * When you choose to sort by <code>serviceName</code>, service instances within each service are sorted by service
     * instance name.
     * </p>
     * <p>
     * Default: <code>serviceName</code>
     * </p>
     * 
     * @param sortBy
     *        The field that the result list is sorted by.</p>
     *        <p>
     *        When you choose to sort by <code>serviceName</code>, service instances within each service are sorted by
     *        service instance name.
     *        </p>
     *        <p>
     *        Default: <code>serviceName</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListServiceInstancesSortBy
     */

    public ListServiceInstancesRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The field that the result list is sorted by.
     * </p>
     * <p>
     * When you choose to sort by <code>serviceName</code>, service instances within each service are sorted by service
     * instance name.
     * </p>
     * <p>
     * Default: <code>serviceName</code>
     * </p>
     * 
     * @param sortBy
     *        The field that the result list is sorted by.</p>
     *        <p>
     *        When you choose to sort by <code>serviceName</code>, service instances within each service are sorted by
     *        service instance name.
     *        </p>
     *        <p>
     *        Default: <code>serviceName</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListServiceInstancesSortBy
     */

    public ListServiceInstancesRequest withSortBy(ListServiceInstancesSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Result list sort order.
     * </p>
     * <p>
     * Default: <code>ASCENDING</code>
     * </p>
     * 
     * @param sortOrder
     *        Result list sort order.</p>
     *        <p>
     *        Default: <code>ASCENDING</code>
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Result list sort order.
     * </p>
     * <p>
     * Default: <code>ASCENDING</code>
     * </p>
     * 
     * @return Result list sort order.</p>
     *         <p>
     *         Default: <code>ASCENDING</code>
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Result list sort order.
     * </p>
     * <p>
     * Default: <code>ASCENDING</code>
     * </p>
     * 
     * @param sortOrder
     *        Result list sort order.</p>
     *        <p>
     *        Default: <code>ASCENDING</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListServiceInstancesRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Result list sort order.
     * </p>
     * <p>
     * Default: <code>ASCENDING</code>
     * </p>
     * 
     * @param sortOrder
     *        Result list sort order.</p>
     *        <p>
     *        Default: <code>ASCENDING</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListServiceInstancesRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceInstancesRequest == false)
            return false;
        ListServiceInstancesRequest other = (ListServiceInstancesRequest) obj;
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
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
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
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceInstancesRequest clone() {
        return (ListServiceInstancesRequest) super.clone();
    }

}
