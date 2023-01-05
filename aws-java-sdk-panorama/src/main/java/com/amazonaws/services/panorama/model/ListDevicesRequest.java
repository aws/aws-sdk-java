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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filter based on a device's status.
     * </p>
     */
    private String deviceAggregatedStatusFilter;
    /**
     * <p>
     * The maximum number of devices to return in one page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filter based on device's name. Prefixes supported.
     * </p>
     */
    private String nameFilter;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The target column to be sorted on. Default column sort is CREATED_TIME.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sorting order for the returned list. SortOrder is DESCENDING by default based on CREATED_TIME. Otherwise,
     * SortOrder is ASCENDING.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * Filter based on a device's status.
     * </p>
     * 
     * @param deviceAggregatedStatusFilter
     *        Filter based on a device's status.
     * @see DeviceAggregatedStatus
     */

    public void setDeviceAggregatedStatusFilter(String deviceAggregatedStatusFilter) {
        this.deviceAggregatedStatusFilter = deviceAggregatedStatusFilter;
    }

    /**
     * <p>
     * Filter based on a device's status.
     * </p>
     * 
     * @return Filter based on a device's status.
     * @see DeviceAggregatedStatus
     */

    public String getDeviceAggregatedStatusFilter() {
        return this.deviceAggregatedStatusFilter;
    }

    /**
     * <p>
     * Filter based on a device's status.
     * </p>
     * 
     * @param deviceAggregatedStatusFilter
     *        Filter based on a device's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceAggregatedStatus
     */

    public ListDevicesRequest withDeviceAggregatedStatusFilter(String deviceAggregatedStatusFilter) {
        setDeviceAggregatedStatusFilter(deviceAggregatedStatusFilter);
        return this;
    }

    /**
     * <p>
     * Filter based on a device's status.
     * </p>
     * 
     * @param deviceAggregatedStatusFilter
     *        Filter based on a device's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceAggregatedStatus
     */

    public ListDevicesRequest withDeviceAggregatedStatusFilter(DeviceAggregatedStatus deviceAggregatedStatusFilter) {
        this.deviceAggregatedStatusFilter = deviceAggregatedStatusFilter.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of devices to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of devices to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of devices to return in one page of results.
     * </p>
     * 
     * @return The maximum number of devices to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of devices to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of devices to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filter based on device's name. Prefixes supported.
     * </p>
     * 
     * @param nameFilter
     *        Filter based on device's name. Prefixes supported.
     */

    public void setNameFilter(String nameFilter) {
        this.nameFilter = nameFilter;
    }

    /**
     * <p>
     * Filter based on device's name. Prefixes supported.
     * </p>
     * 
     * @return Filter based on device's name. Prefixes supported.
     */

    public String getNameFilter() {
        return this.nameFilter;
    }

    /**
     * <p>
     * Filter based on device's name. Prefixes supported.
     * </p>
     * 
     * @param nameFilter
     *        Filter based on device's name. Prefixes supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withNameFilter(String nameFilter) {
        setNameFilter(nameFilter);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The target column to be sorted on. Default column sort is CREATED_TIME.
     * </p>
     * 
     * @param sortBy
     *        The target column to be sorted on. Default column sort is CREATED_TIME.
     * @see ListDevicesSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The target column to be sorted on. Default column sort is CREATED_TIME.
     * </p>
     * 
     * @return The target column to be sorted on. Default column sort is CREATED_TIME.
     * @see ListDevicesSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The target column to be sorted on. Default column sort is CREATED_TIME.
     * </p>
     * 
     * @param sortBy
     *        The target column to be sorted on. Default column sort is CREATED_TIME.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListDevicesSortBy
     */

    public ListDevicesRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The target column to be sorted on. Default column sort is CREATED_TIME.
     * </p>
     * 
     * @param sortBy
     *        The target column to be sorted on. Default column sort is CREATED_TIME.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListDevicesSortBy
     */

    public ListDevicesRequest withSortBy(ListDevicesSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sorting order for the returned list. SortOrder is DESCENDING by default based on CREATED_TIME. Otherwise,
     * SortOrder is ASCENDING.
     * </p>
     * 
     * @param sortOrder
     *        The sorting order for the returned list. SortOrder is DESCENDING by default based on CREATED_TIME.
     *        Otherwise, SortOrder is ASCENDING.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sorting order for the returned list. SortOrder is DESCENDING by default based on CREATED_TIME. Otherwise,
     * SortOrder is ASCENDING.
     * </p>
     * 
     * @return The sorting order for the returned list. SortOrder is DESCENDING by default based on CREATED_TIME.
     *         Otherwise, SortOrder is ASCENDING.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sorting order for the returned list. SortOrder is DESCENDING by default based on CREATED_TIME. Otherwise,
     * SortOrder is ASCENDING.
     * </p>
     * 
     * @param sortOrder
     *        The sorting order for the returned list. SortOrder is DESCENDING by default based on CREATED_TIME.
     *        Otherwise, SortOrder is ASCENDING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListDevicesRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sorting order for the returned list. SortOrder is DESCENDING by default based on CREATED_TIME. Otherwise,
     * SortOrder is ASCENDING.
     * </p>
     * 
     * @param sortOrder
     *        The sorting order for the returned list. SortOrder is DESCENDING by default based on CREATED_TIME.
     *        Otherwise, SortOrder is ASCENDING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListDevicesRequest withSortOrder(SortOrder sortOrder) {
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
        if (getDeviceAggregatedStatusFilter() != null)
            sb.append("DeviceAggregatedStatusFilter: ").append(getDeviceAggregatedStatusFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNameFilter() != null)
            sb.append("NameFilter: ").append(getNameFilter()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof ListDevicesRequest == false)
            return false;
        ListDevicesRequest other = (ListDevicesRequest) obj;
        if (other.getDeviceAggregatedStatusFilter() == null ^ this.getDeviceAggregatedStatusFilter() == null)
            return false;
        if (other.getDeviceAggregatedStatusFilter() != null && other.getDeviceAggregatedStatusFilter().equals(this.getDeviceAggregatedStatusFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameFilter() == null ^ this.getNameFilter() == null)
            return false;
        if (other.getNameFilter() != null && other.getNameFilter().equals(this.getNameFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getDeviceAggregatedStatusFilter() == null) ? 0 : getDeviceAggregatedStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNameFilter() == null) ? 0 : getNameFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicesRequest clone() {
        return (ListDevicesRequest) super.clone();
    }

}
