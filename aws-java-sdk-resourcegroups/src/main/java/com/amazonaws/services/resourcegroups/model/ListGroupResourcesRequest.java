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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroupResources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <important>
     * <p>
     * <i> <b>Deprecated - don't use this parameter. Use the <code>Group</code> request field instead.</b> </i>
     * </p>
     * </important>
     */
    @Deprecated
    private String groupName;
    /**
     * <p>
     * The name or the ARN of the resource group
     * </p>
     */
    private String group;
    /**
     * <p>
     * Filters, formatted as <a>ResourceFilter</a> objects, that you want to apply to a <code>ListGroupResources</code>
     * operation. Filters the results to include only those of the specified resource types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter resources by their type. Specify up to five resource types in the format
     * <code>AWS::ServiceCode::ResourceType</code>. For example, <code>AWS::EC2::Instance</code>, or
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify a <code>resource-type</code> filter for <code>ListGroupResources</code>, AWS Resource Groups
     * validates your filter resource types against the types that are defined in the query associated with the group.
     * For example, if a group contains only S3 buckets because its query specifies only that resource type, but your
     * <code>resource-type</code> filter includes EC2 instances, AWS Resource Groups does not filter for EC2 instances.
     * In this case, a <code>ListGroupResources</code> request returns a <code>BadRequestException</code> error with a
     * message similar to the following:
     * </p>
     * <p>
     * <code>The resource types specified as filters in the request are not valid.</code>
     * </p>
     * <p>
     * The error includes a list of resource types that failed the validation because they are not part of the query
     * associated with the group. This validation doesn't occur when the group query specifies
     * <code>AWS::AllSupported</code>, because a group based on such a query can contain any of the allowed resource
     * types for the query type (tag-based or AWS CloudFormation stack-based queries).
     * </p>
     */
    private java.util.List<ResourceFilter> filters;
    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that the service might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value provided by a previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     */
    private String nextToken;

    /**
     * <important>
     * <p>
     * <i> <b>Deprecated - don't use this parameter. Use the <code>Group</code> request field instead.</b> </i>
     * </p>
     * </important>
     * 
     * @param groupName
     *        <p>
     *        <i> <b>Deprecated - don't use this parameter. Use the <code>Group</code> request field instead.</b> </i>
     *        </p>
     */
    @Deprecated
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <important>
     * <p>
     * <i> <b>Deprecated - don't use this parameter. Use the <code>Group</code> request field instead.</b> </i>
     * </p>
     * </important>
     * 
     * @return <p>
     *         <i> <b>Deprecated - don't use this parameter. Use the <code>Group</code> request field instead.</b> </i>
     *         </p>
     */
    @Deprecated
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <important>
     * <p>
     * <i> <b>Deprecated - don't use this parameter. Use the <code>Group</code> request field instead.</b> </i>
     * </p>
     * </important>
     * 
     * @param groupName
     *        <p>
     *        <i> <b>Deprecated - don't use this parameter. Use the <code>Group</code> request field instead.</b> </i>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ListGroupResourcesRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The name or the ARN of the resource group
     * </p>
     * 
     * @param group
     *        The name or the ARN of the resource group
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name or the ARN of the resource group
     * </p>
     * 
     * @return The name or the ARN of the resource group
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name or the ARN of the resource group
     * </p>
     * 
     * @param group
     *        The name or the ARN of the resource group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesRequest withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * Filters, formatted as <a>ResourceFilter</a> objects, that you want to apply to a <code>ListGroupResources</code>
     * operation. Filters the results to include only those of the specified resource types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter resources by their type. Specify up to five resource types in the format
     * <code>AWS::ServiceCode::ResourceType</code>. For example, <code>AWS::EC2::Instance</code>, or
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify a <code>resource-type</code> filter for <code>ListGroupResources</code>, AWS Resource Groups
     * validates your filter resource types against the types that are defined in the query associated with the group.
     * For example, if a group contains only S3 buckets because its query specifies only that resource type, but your
     * <code>resource-type</code> filter includes EC2 instances, AWS Resource Groups does not filter for EC2 instances.
     * In this case, a <code>ListGroupResources</code> request returns a <code>BadRequestException</code> error with a
     * message similar to the following:
     * </p>
     * <p>
     * <code>The resource types specified as filters in the request are not valid.</code>
     * </p>
     * <p>
     * The error includes a list of resource types that failed the validation because they are not part of the query
     * associated with the group. This validation doesn't occur when the group query specifies
     * <code>AWS::AllSupported</code>, because a group based on such a query can contain any of the allowed resource
     * types for the query type (tag-based or AWS CloudFormation stack-based queries).
     * </p>
     * 
     * @return Filters, formatted as <a>ResourceFilter</a> objects, that you want to apply to a
     *         <code>ListGroupResources</code> operation. Filters the results to include only those of the specified
     *         resource types.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>resource-type</code> - Filter resources by their type. Specify up to five resource types in the
     *         format <code>AWS::ServiceCode::ResourceType</code>. For example, <code>AWS::EC2::Instance</code>, or
     *         <code>AWS::S3::Bucket</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you specify a <code>resource-type</code> filter for <code>ListGroupResources</code>, AWS Resource
     *         Groups validates your filter resource types against the types that are defined in the query associated
     *         with the group. For example, if a group contains only S3 buckets because its query specifies only that
     *         resource type, but your <code>resource-type</code> filter includes EC2 instances, AWS Resource Groups
     *         does not filter for EC2 instances. In this case, a <code>ListGroupResources</code> request returns a
     *         <code>BadRequestException</code> error with a message similar to the following:
     *         </p>
     *         <p>
     *         <code>The resource types specified as filters in the request are not valid.</code>
     *         </p>
     *         <p>
     *         The error includes a list of resource types that failed the validation because they are not part of the
     *         query associated with the group. This validation doesn't occur when the group query specifies
     *         <code>AWS::AllSupported</code>, because a group based on such a query can contain any of the allowed
     *         resource types for the query type (tag-based or AWS CloudFormation stack-based queries).
     */

    public java.util.List<ResourceFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters, formatted as <a>ResourceFilter</a> objects, that you want to apply to a <code>ListGroupResources</code>
     * operation. Filters the results to include only those of the specified resource types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter resources by their type. Specify up to five resource types in the format
     * <code>AWS::ServiceCode::ResourceType</code>. For example, <code>AWS::EC2::Instance</code>, or
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify a <code>resource-type</code> filter for <code>ListGroupResources</code>, AWS Resource Groups
     * validates your filter resource types against the types that are defined in the query associated with the group.
     * For example, if a group contains only S3 buckets because its query specifies only that resource type, but your
     * <code>resource-type</code> filter includes EC2 instances, AWS Resource Groups does not filter for EC2 instances.
     * In this case, a <code>ListGroupResources</code> request returns a <code>BadRequestException</code> error with a
     * message similar to the following:
     * </p>
     * <p>
     * <code>The resource types specified as filters in the request are not valid.</code>
     * </p>
     * <p>
     * The error includes a list of resource types that failed the validation because they are not part of the query
     * associated with the group. This validation doesn't occur when the group query specifies
     * <code>AWS::AllSupported</code>, because a group based on such a query can contain any of the allowed resource
     * types for the query type (tag-based or AWS CloudFormation stack-based queries).
     * </p>
     * 
     * @param filters
     *        Filters, formatted as <a>ResourceFilter</a> objects, that you want to apply to a
     *        <code>ListGroupResources</code> operation. Filters the results to include only those of the specified
     *        resource types.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - Filter resources by their type. Specify up to five resource types in the
     *        format <code>AWS::ServiceCode::ResourceType</code>. For example, <code>AWS::EC2::Instance</code>, or
     *        <code>AWS::S3::Bucket</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you specify a <code>resource-type</code> filter for <code>ListGroupResources</code>, AWS Resource
     *        Groups validates your filter resource types against the types that are defined in the query associated
     *        with the group. For example, if a group contains only S3 buckets because its query specifies only that
     *        resource type, but your <code>resource-type</code> filter includes EC2 instances, AWS Resource Groups does
     *        not filter for EC2 instances. In this case, a <code>ListGroupResources</code> request returns a
     *        <code>BadRequestException</code> error with a message similar to the following:
     *        </p>
     *        <p>
     *        <code>The resource types specified as filters in the request are not valid.</code>
     *        </p>
     *        <p>
     *        The error includes a list of resource types that failed the validation because they are not part of the
     *        query associated with the group. This validation doesn't occur when the group query specifies
     *        <code>AWS::AllSupported</code>, because a group based on such a query can contain any of the allowed
     *        resource types for the query type (tag-based or AWS CloudFormation stack-based queries).
     */

    public void setFilters(java.util.Collection<ResourceFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ResourceFilter>(filters);
    }

    /**
     * <p>
     * Filters, formatted as <a>ResourceFilter</a> objects, that you want to apply to a <code>ListGroupResources</code>
     * operation. Filters the results to include only those of the specified resource types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter resources by their type. Specify up to five resource types in the format
     * <code>AWS::ServiceCode::ResourceType</code>. For example, <code>AWS::EC2::Instance</code>, or
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify a <code>resource-type</code> filter for <code>ListGroupResources</code>, AWS Resource Groups
     * validates your filter resource types against the types that are defined in the query associated with the group.
     * For example, if a group contains only S3 buckets because its query specifies only that resource type, but your
     * <code>resource-type</code> filter includes EC2 instances, AWS Resource Groups does not filter for EC2 instances.
     * In this case, a <code>ListGroupResources</code> request returns a <code>BadRequestException</code> error with a
     * message similar to the following:
     * </p>
     * <p>
     * <code>The resource types specified as filters in the request are not valid.</code>
     * </p>
     * <p>
     * The error includes a list of resource types that failed the validation because they are not part of the query
     * associated with the group. This validation doesn't occur when the group query specifies
     * <code>AWS::AllSupported</code>, because a group based on such a query can contain any of the allowed resource
     * types for the query type (tag-based or AWS CloudFormation stack-based queries).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters, formatted as <a>ResourceFilter</a> objects, that you want to apply to a
     *        <code>ListGroupResources</code> operation. Filters the results to include only those of the specified
     *        resource types.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - Filter resources by their type. Specify up to five resource types in the
     *        format <code>AWS::ServiceCode::ResourceType</code>. For example, <code>AWS::EC2::Instance</code>, or
     *        <code>AWS::S3::Bucket</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you specify a <code>resource-type</code> filter for <code>ListGroupResources</code>, AWS Resource
     *        Groups validates your filter resource types against the types that are defined in the query associated
     *        with the group. For example, if a group contains only S3 buckets because its query specifies only that
     *        resource type, but your <code>resource-type</code> filter includes EC2 instances, AWS Resource Groups does
     *        not filter for EC2 instances. In this case, a <code>ListGroupResources</code> request returns a
     *        <code>BadRequestException</code> error with a message similar to the following:
     *        </p>
     *        <p>
     *        <code>The resource types specified as filters in the request are not valid.</code>
     *        </p>
     *        <p>
     *        The error includes a list of resource types that failed the validation because they are not part of the
     *        query associated with the group. This validation doesn't occur when the group query specifies
     *        <code>AWS::AllSupported</code>, because a group based on such a query can contain any of the allowed
     *        resource types for the query type (tag-based or AWS CloudFormation stack-based queries).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesRequest withFilters(ResourceFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ResourceFilter>(filters.length));
        }
        for (ResourceFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters, formatted as <a>ResourceFilter</a> objects, that you want to apply to a <code>ListGroupResources</code>
     * operation. Filters the results to include only those of the specified resource types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter resources by their type. Specify up to five resource types in the format
     * <code>AWS::ServiceCode::ResourceType</code>. For example, <code>AWS::EC2::Instance</code>, or
     * <code>AWS::S3::Bucket</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify a <code>resource-type</code> filter for <code>ListGroupResources</code>, AWS Resource Groups
     * validates your filter resource types against the types that are defined in the query associated with the group.
     * For example, if a group contains only S3 buckets because its query specifies only that resource type, but your
     * <code>resource-type</code> filter includes EC2 instances, AWS Resource Groups does not filter for EC2 instances.
     * In this case, a <code>ListGroupResources</code> request returns a <code>BadRequestException</code> error with a
     * message similar to the following:
     * </p>
     * <p>
     * <code>The resource types specified as filters in the request are not valid.</code>
     * </p>
     * <p>
     * The error includes a list of resource types that failed the validation because they are not part of the query
     * associated with the group. This validation doesn't occur when the group query specifies
     * <code>AWS::AllSupported</code>, because a group based on such a query can contain any of the allowed resource
     * types for the query type (tag-based or AWS CloudFormation stack-based queries).
     * </p>
     * 
     * @param filters
     *        Filters, formatted as <a>ResourceFilter</a> objects, that you want to apply to a
     *        <code>ListGroupResources</code> operation. Filters the results to include only those of the specified
     *        resource types.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - Filter resources by their type. Specify up to five resource types in the
     *        format <code>AWS::ServiceCode::ResourceType</code>. For example, <code>AWS::EC2::Instance</code>, or
     *        <code>AWS::S3::Bucket</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you specify a <code>resource-type</code> filter for <code>ListGroupResources</code>, AWS Resource
     *        Groups validates your filter resource types against the types that are defined in the query associated
     *        with the group. For example, if a group contains only S3 buckets because its query specifies only that
     *        resource type, but your <code>resource-type</code> filter includes EC2 instances, AWS Resource Groups does
     *        not filter for EC2 instances. In this case, a <code>ListGroupResources</code> request returns a
     *        <code>BadRequestException</code> error with a message similar to the following:
     *        </p>
     *        <p>
     *        <code>The resource types specified as filters in the request are not valid.</code>
     *        </p>
     *        <p>
     *        The error includes a list of resource types that failed the validation because they are not part of the
     *        query associated with the group. This validation doesn't occur when the group query specifies
     *        <code>AWS::AllSupported</code>, because a group based on such a query can contain any of the allowed
     *        resource types for the query type (tag-based or AWS CloudFormation stack-based queries).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesRequest withFilters(java.util.Collection<ResourceFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that the service might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @param maxResults
     *        The total number of results that you want included on each page of the response. If you do not include
     *        this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond
     *        the maximum you specify, the <code>NextToken</code> response element is present and has a value (is not
     *        null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next part of the results. Note that the service might return fewer results than the
     *        maximum even when there are more results available. You should check <code>NextToken</code> after every
     *        operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that the service might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @return The total number of results that you want included on each page of the response. If you do not include
     *         this parameter, it defaults to a value that is specific to the operation. If additional items exist
     *         beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value
     *         (is not null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *         operation to get the next part of the results. Note that the service might return fewer results than the
     *         maximum even when there are more results available. You should check <code>NextToken</code> after every
     *         operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that the service might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @param maxResults
     *        The total number of results that you want included on each page of the response. If you do not include
     *        this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond
     *        the maximum you specify, the <code>NextToken</code> response element is present and has a value (is not
     *        null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next part of the results. Note that the service might return fewer results than the
     *        maximum even when there are more results available. You should check <code>NextToken</code> after every
     *        operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value provided by a previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value provided by a previous call's <code>NextToken</code> response to indicate where the
     *        output should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value provided by a previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     * 
     * @return The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *         previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *         parameter to the value provided by a previous call's <code>NextToken</code> response to indicate where
     *         the output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value provided by a previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value provided by a previous call's <code>NextToken</code> response to indicate where the
     *        output should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesRequest withNextToken(String nextToken) {
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
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

        if (obj instanceof ListGroupResourcesRequest == false)
            return false;
        ListGroupResourcesRequest other = (ListGroupResourcesRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
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

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupResourcesRequest clone() {
        return (ListGroupResourcesRequest) super.clone();
    }

}
