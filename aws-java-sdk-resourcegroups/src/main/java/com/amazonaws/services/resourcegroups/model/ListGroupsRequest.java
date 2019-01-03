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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter groups by resource type. Specify up to five resource types in the format
     * AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<GroupFilter> filters;
    /**
     * <p>
     * The maximum number of resource group results that are returned by ListGroups in paginated output. By default,
     * this number is 50.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The NextToken value that is returned in a paginated <code>ListGroups</code> request. To get the next page of
     * results, run the call again, add the NextToken parameter, and specify the NextToken value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter groups by resource type. Specify up to five resource types in the format
     * AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>resource-type</code> - Filter groups by resource type. Specify up to five resource types in the
     *         format AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.
     *         </p>
     *         </li>
     */

    public java.util.List<GroupFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter groups by resource type. Specify up to five resource types in the format
     * AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - Filter groups by resource type. Specify up to five resource types in the
     *        format AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<GroupFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<GroupFilter>(filters);
    }

    /**
     * <p>
     * Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter groups by resource type. Specify up to five resource types in the format
     * AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.
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
     *        Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - Filter groups by resource type. Specify up to five resource types in the
     *        format AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withFilters(GroupFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<GroupFilter>(filters.length));
        }
        for (GroupFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter groups by resource type. Specify up to five resource types in the format
     * AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - Filter groups by resource type. Specify up to five resource types in the
     *        format AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withFilters(java.util.Collection<GroupFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of resource group results that are returned by ListGroups in paginated output. By default,
     * this number is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resource group results that are returned by ListGroups in paginated output. By
     *        default, this number is 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of resource group results that are returned by ListGroups in paginated output. By default,
     * this number is 50.
     * </p>
     * 
     * @return The maximum number of resource group results that are returned by ListGroups in paginated output. By
     *         default, this number is 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of resource group results that are returned by ListGroups in paginated output. By default,
     * this number is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resource group results that are returned by ListGroups in paginated output. By
     *        default, this number is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The NextToken value that is returned in a paginated <code>ListGroups</code> request. To get the next page of
     * results, run the call again, add the NextToken parameter, and specify the NextToken value.
     * </p>
     * 
     * @param nextToken
     *        The NextToken value that is returned in a paginated <code>ListGroups</code> request. To get the next page
     *        of results, run the call again, add the NextToken parameter, and specify the NextToken value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The NextToken value that is returned in a paginated <code>ListGroups</code> request. To get the next page of
     * results, run the call again, add the NextToken parameter, and specify the NextToken value.
     * </p>
     * 
     * @return The NextToken value that is returned in a paginated <code>ListGroups</code> request. To get the next page
     *         of results, run the call again, add the NextToken parameter, and specify the NextToken value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The NextToken value that is returned in a paginated <code>ListGroups</code> request. To get the next page of
     * results, run the call again, add the NextToken parameter, and specify the NextToken value.
     * </p>
     * 
     * @param nextToken
     *        The NextToken value that is returned in a paginated <code>ListGroups</code> request. To get the next page
     *        of results, run the call again, add the NextToken parameter, and specify the NextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListGroupsRequest == false)
            return false;
        ListGroupsRequest other = (ListGroupsRequest) obj;
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
    public ListGroupsRequest clone() {
        return (ListGroupsRequest) super.clone();
    }

}
