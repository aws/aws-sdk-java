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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProvisionedProducts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchProvisionedProductsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The access level to use to obtain results. The default is <code>User</code>.
     * </p>
     */
    private AccessLevelFilter accessLevelFilter;
    /**
     * <p>
     * The search filters.
     * </p>
     * <p>
     * When the key is <code>SearchQuery</code>, the searchable fields are <code>arn</code>, <code>createdTime</code>,
     * <code>id</code>, <code>lastRecordId</code>, <code>idempotencyToken</code>, <code>name</code>,
     * <code>physicalId</code>, <code>productId</code>, <code>provisioningArtifact</code>, <code>type</code>,
     * <code>status</code>, <code>tags</code>, <code>userArn</code>, and <code>userArnSession</code>.
     * </p>
     * <p>
     * Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filters;
    /**
     * <p>
     * The sort field. If no value is specified, the results are not sorted. The valid values are <code>arn</code>,
     * <code>id</code>, <code>name</code>, and <code>lastRecordId</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProvisionedProductsRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The access level to use to obtain results. The default is <code>User</code>.
     * </p>
     * 
     * @param accessLevelFilter
     *        The access level to use to obtain results. The default is <code>User</code>.
     */

    public void setAccessLevelFilter(AccessLevelFilter accessLevelFilter) {
        this.accessLevelFilter = accessLevelFilter;
    }

    /**
     * <p>
     * The access level to use to obtain results. The default is <code>User</code>.
     * </p>
     * 
     * @return The access level to use to obtain results. The default is <code>User</code>.
     */

    public AccessLevelFilter getAccessLevelFilter() {
        return this.accessLevelFilter;
    }

    /**
     * <p>
     * The access level to use to obtain results. The default is <code>User</code>.
     * </p>
     * 
     * @param accessLevelFilter
     *        The access level to use to obtain results. The default is <code>User</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProvisionedProductsRequest withAccessLevelFilter(AccessLevelFilter accessLevelFilter) {
        setAccessLevelFilter(accessLevelFilter);
        return this;
    }

    /**
     * <p>
     * The search filters.
     * </p>
     * <p>
     * When the key is <code>SearchQuery</code>, the searchable fields are <code>arn</code>, <code>createdTime</code>,
     * <code>id</code>, <code>lastRecordId</code>, <code>idempotencyToken</code>, <code>name</code>,
     * <code>physicalId</code>, <code>productId</code>, <code>provisioningArtifact</code>, <code>type</code>,
     * <code>status</code>, <code>tags</code>, <code>userArn</code>, and <code>userArnSession</code>.
     * </p>
     * <p>
     * Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     * </p>
     * 
     * @return The search filters.</p>
     *         <p>
     *         When the key is <code>SearchQuery</code>, the searchable fields are <code>arn</code>,
     *         <code>createdTime</code>, <code>id</code>, <code>lastRecordId</code>, <code>idempotencyToken</code>,
     *         <code>name</code>, <code>physicalId</code>, <code>productId</code>, <code>provisioningArtifact</code>,
     *         <code>type</code>, <code>status</code>, <code>tags</code>, <code>userArn</code>, and
     *         <code>userArnSession</code>.
     *         </p>
     *         <p>
     *         Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     */

    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The search filters.
     * </p>
     * <p>
     * When the key is <code>SearchQuery</code>, the searchable fields are <code>arn</code>, <code>createdTime</code>,
     * <code>id</code>, <code>lastRecordId</code>, <code>idempotencyToken</code>, <code>name</code>,
     * <code>physicalId</code>, <code>productId</code>, <code>provisioningArtifact</code>, <code>type</code>,
     * <code>status</code>, <code>tags</code>, <code>userArn</code>, and <code>userArnSession</code>.
     * </p>
     * <p>
     * Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     * </p>
     * 
     * @param filters
     *        The search filters.</p>
     *        <p>
     *        When the key is <code>SearchQuery</code>, the searchable fields are <code>arn</code>,
     *        <code>createdTime</code>, <code>id</code>, <code>lastRecordId</code>, <code>idempotencyToken</code>,
     *        <code>name</code>, <code>physicalId</code>, <code>productId</code>, <code>provisioningArtifact</code>,
     *        <code>type</code>, <code>status</code>, <code>tags</code>, <code>userArn</code>, and
     *        <code>userArnSession</code>.
     *        </p>
     *        <p>
     *        Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     */

    public void setFilters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The search filters.
     * </p>
     * <p>
     * When the key is <code>SearchQuery</code>, the searchable fields are <code>arn</code>, <code>createdTime</code>,
     * <code>id</code>, <code>lastRecordId</code>, <code>idempotencyToken</code>, <code>name</code>,
     * <code>physicalId</code>, <code>productId</code>, <code>provisioningArtifact</code>, <code>type</code>,
     * <code>status</code>, <code>tags</code>, <code>userArn</code>, and <code>userArnSession</code>.
     * </p>
     * <p>
     * Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     * </p>
     * 
     * @param filters
     *        The search filters.</p>
     *        <p>
     *        When the key is <code>SearchQuery</code>, the searchable fields are <code>arn</code>,
     *        <code>createdTime</code>, <code>id</code>, <code>lastRecordId</code>, <code>idempotencyToken</code>,
     *        <code>name</code>, <code>physicalId</code>, <code>productId</code>, <code>provisioningArtifact</code>,
     *        <code>type</code>, <code>status</code>, <code>tags</code>, <code>userArn</code>, and
     *        <code>userArnSession</code>.
     *        </p>
     *        <p>
     *        Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProvisionedProductsRequest withFilters(java.util.Map<String, java.util.List<String>> filters) {
        setFilters(filters);
        return this;
    }

    public SearchProvisionedProductsRequest addFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.filters) {
            this.filters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.filters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProvisionedProductsRequest clearFiltersEntries() {
        this.filters = null;
        return this;
    }

    /**
     * <p>
     * The sort field. If no value is specified, the results are not sorted. The valid values are <code>arn</code>,
     * <code>id</code>, <code>name</code>, and <code>lastRecordId</code>.
     * </p>
     * 
     * @param sortBy
     *        The sort field. If no value is specified, the results are not sorted. The valid values are
     *        <code>arn</code>, <code>id</code>, <code>name</code>, and <code>lastRecordId</code>.
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The sort field. If no value is specified, the results are not sorted. The valid values are <code>arn</code>,
     * <code>id</code>, <code>name</code>, and <code>lastRecordId</code>.
     * </p>
     * 
     * @return The sort field. If no value is specified, the results are not sorted. The valid values are
     *         <code>arn</code>, <code>id</code>, <code>name</code>, and <code>lastRecordId</code>.
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The sort field. If no value is specified, the results are not sorted. The valid values are <code>arn</code>,
     * <code>id</code>, <code>name</code>, and <code>lastRecordId</code>.
     * </p>
     * 
     * @param sortBy
     *        The sort field. If no value is specified, the results are not sorted. The valid values are
     *        <code>arn</code>, <code>id</code>, <code>name</code>, and <code>lastRecordId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProvisionedProductsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. If no value is specified, the results are not sorted.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     * 
     * @return The sort order. If no value is specified, the results are not sorted.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. If no value is specified, the results are not sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SearchProvisionedProductsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. If no value is specified, the results are not sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SearchProvisionedProductsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return with this call.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @return The maximum number of items to return with this call.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProvisionedProductsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @param pageToken
     *        The page token for the next set of results. To retrieve the first set of results, use null.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @return The page token for the next set of results. To retrieve the first set of results, use null.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @param pageToken
     *        The page token for the next set of results. To retrieve the first set of results, use null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProvisionedProductsRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getAccessLevelFilter() != null)
            sb.append("AccessLevelFilter: ").append(getAccessLevelFilter()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchProvisionedProductsRequest == false)
            return false;
        SearchProvisionedProductsRequest other = (SearchProvisionedProductsRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getAccessLevelFilter() == null ^ this.getAccessLevelFilter() == null)
            return false;
        if (other.getAccessLevelFilter() != null && other.getAccessLevelFilter().equals(this.getAccessLevelFilter()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getAccessLevelFilter() == null) ? 0 : getAccessLevelFilter().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchProvisionedProductsRequest clone() {
        return (SearchProvisionedProductsRequest) super.clone();
    }

}
