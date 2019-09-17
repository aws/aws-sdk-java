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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUsersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The ID of the organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The IDs of the users.
     * </p>
     */
    private String userIds;
    /**
     * <p>
     * A query to filter users by user name.
     * </p>
     */
    private String query;
    /**
     * <p>
     * The state of the users. Specify "ALL" to include inactive users.
     * </p>
     */
    private String include;
    /**
     * <p>
     * The order for the results.
     * </p>
     */
    private String order;
    /**
     * <p>
     * The sorting criteria.
     * </p>
     */
    private String sort;
    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and utilization
     * information.
     * </p>
     */
    private String fields;

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *         accessing the API using AWS credentials.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsersRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @return The ID of the organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsersRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The IDs of the users.
     * </p>
     * 
     * @param userIds
     *        The IDs of the users.
     */

    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    /**
     * <p>
     * The IDs of the users.
     * </p>
     * 
     * @return The IDs of the users.
     */

    public String getUserIds() {
        return this.userIds;
    }

    /**
     * <p>
     * The IDs of the users.
     * </p>
     * 
     * @param userIds
     *        The IDs of the users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsersRequest withUserIds(String userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * A query to filter users by user name.
     * </p>
     * 
     * @param query
     *        A query to filter users by user name.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * A query to filter users by user name.
     * </p>
     * 
     * @return A query to filter users by user name.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * A query to filter users by user name.
     * </p>
     * 
     * @param query
     *        A query to filter users by user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsersRequest withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * The state of the users. Specify "ALL" to include inactive users.
     * </p>
     * 
     * @param include
     *        The state of the users. Specify "ALL" to include inactive users.
     * @see UserFilterType
     */

    public void setInclude(String include) {
        this.include = include;
    }

    /**
     * <p>
     * The state of the users. Specify "ALL" to include inactive users.
     * </p>
     * 
     * @return The state of the users. Specify "ALL" to include inactive users.
     * @see UserFilterType
     */

    public String getInclude() {
        return this.include;
    }

    /**
     * <p>
     * The state of the users. Specify "ALL" to include inactive users.
     * </p>
     * 
     * @param include
     *        The state of the users. Specify "ALL" to include inactive users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserFilterType
     */

    public DescribeUsersRequest withInclude(String include) {
        setInclude(include);
        return this;
    }

    /**
     * <p>
     * The state of the users. Specify "ALL" to include inactive users.
     * </p>
     * 
     * @param include
     *        The state of the users. Specify "ALL" to include inactive users.
     * @see UserFilterType
     */

    public void setInclude(UserFilterType include) {
        withInclude(include);
    }

    /**
     * <p>
     * The state of the users. Specify "ALL" to include inactive users.
     * </p>
     * 
     * @param include
     *        The state of the users. Specify "ALL" to include inactive users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserFilterType
     */

    public DescribeUsersRequest withInclude(UserFilterType include) {
        this.include = include.toString();
        return this;
    }

    /**
     * <p>
     * The order for the results.
     * </p>
     * 
     * @param order
     *        The order for the results.
     * @see OrderType
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The order for the results.
     * </p>
     * 
     * @return The order for the results.
     * @see OrderType
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order for the results.
     * </p>
     * 
     * @param order
     *        The order for the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderType
     */

    public DescribeUsersRequest withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The order for the results.
     * </p>
     * 
     * @param order
     *        The order for the results.
     * @see OrderType
     */

    public void setOrder(OrderType order) {
        withOrder(order);
    }

    /**
     * <p>
     * The order for the results.
     * </p>
     * 
     * @param order
     *        The order for the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderType
     */

    public DescribeUsersRequest withOrder(OrderType order) {
        this.order = order.toString();
        return this;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @param sort
     *        The sorting criteria.
     * @see UserSortType
     */

    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @return The sorting criteria.
     * @see UserSortType
     */

    public String getSort() {
        return this.sort;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @param sort
     *        The sorting criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserSortType
     */

    public DescribeUsersRequest withSort(String sort) {
        setSort(sort);
        return this;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @param sort
     *        The sorting criteria.
     * @see UserSortType
     */

    public void setSort(UserSortType sort) {
        withSort(sort);
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @param sort
     *        The sorting criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserSortType
     */

    public DescribeUsersRequest withSort(UserSortType sort) {
        this.sort = sort.toString();
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. (You received this marker from a previous call.)
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @return The marker for the next set of results. (You received this marker from a previous call.)
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. (You received this marker from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsersRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @return The maximum number of items to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsersRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and utilization
     * information.
     * </p>
     * 
     * @param fields
     *        A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and
     *        utilization information.
     */

    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     * <p>
     * A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and utilization
     * information.
     * </p>
     * 
     * @return A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and
     *         utilization information.
     */

    public String getFields() {
        return this.fields;
    }

    /**
     * <p>
     * A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and utilization
     * information.
     * </p>
     * 
     * @param fields
     *        A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and
     *        utilization information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsersRequest withFields(String fields) {
        setFields(fields);
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds()).append(",");
        if (getQuery() != null)
            sb.append("Query: ").append("***Sensitive Data Redacted***").append(",");
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUsersRequest == false)
            return false;
        DescribeUsersRequest other = (DescribeUsersRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUsersRequest clone() {
        return (DescribeUsersRequest) super.clone();
    }

}
