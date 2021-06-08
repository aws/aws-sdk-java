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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverQueryLogConfigsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of query logging configurations that you want to return in the response to a
     * <code>ListResolverQueryLogConfigs</code> request. If you don't specify a value for <code>MaxResults</code>,
     * Resolver returns up to 100 query logging configurations.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * For the first <code>ListResolverQueryLogConfigs</code> request, omit this value.
     * </p>
     * <p>
     * If there are more than <code>MaxResults</code> query logging configurations that match the values that you
     * specify for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigs</code> request to get
     * the next group of configurations. In the next request, specify the value of <code>NextToken</code> from the
     * previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An optional specification to return a subset of query logging configurations.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The element that you want Resolver to sort query logging configurations by.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortBy</code>, if any, as in the previous
     * request.
     * </p>
     * </note>
     * <p>
     * Valid values include the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Arn</code>: The ARN of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AssociationCount</code>: The number of VPCs that are associated with the specified configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that Resolver returned when the configuration was created
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that was specified for <code>CreatorRequestId</code> when the
     * configuration was created
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationArn</code>: The location that logs are sent to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OwnerId</code>: The AWS account number of the account that created the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShareStatus</code>: Whether the configuration is shared with other AWS accounts or shared with the current
     * account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The current status of the configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging queries that
     * originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging configuration. Here are
     * two common causes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String sortBy;
    /**
     * <p>
     * If you specified a value for <code>SortBy</code>, the order that you want query logging configurations to be
     * listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     */
    private String sortOrder;

    /**
     * <p>
     * The maximum number of query logging configurations that you want to return in the response to a
     * <code>ListResolverQueryLogConfigs</code> request. If you don't specify a value for <code>MaxResults</code>,
     * Resolver returns up to 100 query logging configurations.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of query logging configurations that you want to return in the response to a
     *        <code>ListResolverQueryLogConfigs</code> request. If you don't specify a value for <code>MaxResults</code>
     *        , Resolver returns up to 100 query logging configurations.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of query logging configurations that you want to return in the response to a
     * <code>ListResolverQueryLogConfigs</code> request. If you don't specify a value for <code>MaxResults</code>,
     * Resolver returns up to 100 query logging configurations.
     * </p>
     * 
     * @return The maximum number of query logging configurations that you want to return in the response to a
     *         <code>ListResolverQueryLogConfigs</code> request. If you don't specify a value for
     *         <code>MaxResults</code>, Resolver returns up to 100 query logging configurations.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of query logging configurations that you want to return in the response to a
     * <code>ListResolverQueryLogConfigs</code> request. If you don't specify a value for <code>MaxResults</code>,
     * Resolver returns up to 100 query logging configurations.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of query logging configurations that you want to return in the response to a
     *        <code>ListResolverQueryLogConfigs</code> request. If you don't specify a value for <code>MaxResults</code>
     *        , Resolver returns up to 100 query logging configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * For the first <code>ListResolverQueryLogConfigs</code> request, omit this value.
     * </p>
     * <p>
     * If there are more than <code>MaxResults</code> query logging configurations that match the values that you
     * specify for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigs</code> request to get
     * the next group of configurations. In the next request, specify the value of <code>NextToken</code> from the
     * previous response.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>ListResolverQueryLogConfigs</code> request, omit this value.</p>
     *        <p>
     *        If there are more than <code>MaxResults</code> query logging configurations that match the values that you
     *        specify for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigs</code> request
     *        to get the next group of configurations. In the next request, specify the value of <code>NextToken</code>
     *        from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first <code>ListResolverQueryLogConfigs</code> request, omit this value.
     * </p>
     * <p>
     * If there are more than <code>MaxResults</code> query logging configurations that match the values that you
     * specify for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigs</code> request to get
     * the next group of configurations. In the next request, specify the value of <code>NextToken</code> from the
     * previous response.
     * </p>
     * 
     * @return For the first <code>ListResolverQueryLogConfigs</code> request, omit this value.</p>
     *         <p>
     *         If there are more than <code>MaxResults</code> query logging configurations that match the values that
     *         you specify for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigs</code>
     *         request to get the next group of configurations. In the next request, specify the value of
     *         <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first <code>ListResolverQueryLogConfigs</code> request, omit this value.
     * </p>
     * <p>
     * If there are more than <code>MaxResults</code> query logging configurations that match the values that you
     * specify for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigs</code> request to get
     * the next group of configurations. In the next request, specify the value of <code>NextToken</code> from the
     * previous response.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>ListResolverQueryLogConfigs</code> request, omit this value.</p>
     *        <p>
     *        If there are more than <code>MaxResults</code> query logging configurations that match the values that you
     *        specify for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigs</code> request
     *        to get the next group of configurations. In the next request, specify the value of <code>NextToken</code>
     *        from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An optional specification to return a subset of query logging configurations.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @return An optional specification to return a subset of query logging configurations.</p> <note>
     *         <p>
     *         If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *         <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in
     *         the previous request.
     *         </p>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An optional specification to return a subset of query logging configurations.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param filters
     *        An optional specification to return a subset of query logging configurations.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     *        previous request.
     *        </p>
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
     * An optional specification to return a subset of query logging configurations.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An optional specification to return a subset of query logging configurations.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     *        previous request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigsRequest withFilters(Filter... filters) {
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
     * An optional specification to return a subset of query logging configurations.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param filters
     *        An optional specification to return a subset of query logging configurations.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     *        previous request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The element that you want Resolver to sort query logging configurations by.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortBy</code>, if any, as in the previous
     * request.
     * </p>
     * </note>
     * <p>
     * Valid values include the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Arn</code>: The ARN of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AssociationCount</code>: The number of VPCs that are associated with the specified configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that Resolver returned when the configuration was created
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that was specified for <code>CreatorRequestId</code> when the
     * configuration was created
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationArn</code>: The location that logs are sent to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OwnerId</code>: The AWS account number of the account that created the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShareStatus</code>: Whether the configuration is shared with other AWS accounts or shared with the current
     * account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The current status of the configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging queries that
     * originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging configuration. Here are
     * two common causes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param sortBy
     *        The element that you want Resolver to sort query logging configurations by. </p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same value for <code>SortBy</code>, if any, as in the
     *        previous request.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values include the following elements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Arn</code>: The ARN of the query logging configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AssociationCount</code>: The number of VPCs that are associated with the specified configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreationTime</code>: The date and time that Resolver returned when the configuration was created
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatorRequestId</code>: The value that was specified for <code>CreatorRequestId</code> when the
     *        configuration was created
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DestinationArn</code>: The location that logs are sent to
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Id</code>: The ID of the configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code>: The name of the configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OwnerId</code>: The AWS account number of the account that created the configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShareStatus</code>: Whether the configuration is shared with other AWS accounts or shared with the
     *        current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS
     *        RAM).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The current status of the configuration. Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: Resolver is creating the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging
     *        queries that originate in the specified VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: Resolver is deleting this query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging configuration.
     *        Here are two common causes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The specified destination (for example, an Amazon S3 bucket) was deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Permissions don't allow sending logs to the destination.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The element that you want Resolver to sort query logging configurations by.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortBy</code>, if any, as in the previous
     * request.
     * </p>
     * </note>
     * <p>
     * Valid values include the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Arn</code>: The ARN of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AssociationCount</code>: The number of VPCs that are associated with the specified configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that Resolver returned when the configuration was created
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that was specified for <code>CreatorRequestId</code> when the
     * configuration was created
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationArn</code>: The location that logs are sent to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OwnerId</code>: The AWS account number of the account that created the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShareStatus</code>: Whether the configuration is shared with other AWS accounts or shared with the current
     * account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The current status of the configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging queries that
     * originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging configuration. Here are
     * two common causes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The element that you want Resolver to sort query logging configurations by. </p> <note>
     *         <p>
     *         If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *         <code>NextToken</code> parameter, you must use the same value for <code>SortBy</code>, if any, as in the
     *         previous request.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values include the following elements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Arn</code>: The ARN of the query logging configuration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AssociationCount</code>: The number of VPCs that are associated with the specified configuration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreationTime</code>: The date and time that Resolver returned when the configuration was created
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreatorRequestId</code>: The value that was specified for <code>CreatorRequestId</code> when the
     *         configuration was created
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DestinationArn</code>: The location that logs are sent to
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Id</code>: The ID of the configuration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Name</code>: The name of the configuration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OwnerId</code>: The AWS account number of the account that created the configuration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ShareStatus</code>: Whether the configuration is shared with other AWS accounts or shared with the
     *         current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS
     *         RAM).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Status</code>: The current status of the configuration. Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code>: Resolver is creating the query logging configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging
     *         queries that originate in the specified VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code>: Resolver is deleting this query logging configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging configuration.
     *         Here are two common causes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The specified destination (for example, an Amazon S3 bucket) was deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Permissions don't allow sending logs to the destination.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The element that you want Resolver to sort query logging configurations by.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortBy</code>, if any, as in the previous
     * request.
     * </p>
     * </note>
     * <p>
     * Valid values include the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Arn</code>: The ARN of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AssociationCount</code>: The number of VPCs that are associated with the specified configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that Resolver returned when the configuration was created
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that was specified for <code>CreatorRequestId</code> when the
     * configuration was created
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationArn</code>: The location that logs are sent to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OwnerId</code>: The AWS account number of the account that created the configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShareStatus</code>: Whether the configuration is shared with other AWS accounts or shared with the current
     * account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The current status of the configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging queries that
     * originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging configuration. Here are
     * two common causes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param sortBy
     *        The element that you want Resolver to sort query logging configurations by. </p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same value for <code>SortBy</code>, if any, as in the
     *        previous request.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values include the following elements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Arn</code>: The ARN of the query logging configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AssociationCount</code>: The number of VPCs that are associated with the specified configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreationTime</code>: The date and time that Resolver returned when the configuration was created
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatorRequestId</code>: The value that was specified for <code>CreatorRequestId</code> when the
     *        configuration was created
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DestinationArn</code>: The location that logs are sent to
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Id</code>: The ID of the configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code>: The name of the configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OwnerId</code>: The AWS account number of the account that created the configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShareStatus</code>: Whether the configuration is shared with other AWS accounts or shared with the
     *        current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS
     *        RAM).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The current status of the configuration. Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: Resolver is creating the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The query logging configuration was successfully created. Resolver is logging
     *        queries that originate in the specified VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: Resolver is deleting this query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging configuration.
     *        Here are two common causes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The specified destination (for example, an Amazon S3 bucket) was deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Permissions don't allow sending logs to the destination.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * If you specified a value for <code>SortBy</code>, the order that you want query logging configurations to be
     * listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param sortOrder
     *        If you specified a value for <code>SortBy</code>, the order that you want query logging configurations to
     *        be listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in
     *        the previous request.
     *        </p>
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * If you specified a value for <code>SortBy</code>, the order that you want query logging configurations to be
     * listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @return If you specified a value for <code>SortBy</code>, the order that you want query logging configurations to
     *         be listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.</p> <note>
     *         <p>
     *         If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *         <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in
     *         the previous request.
     *         </p>
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * If you specified a value for <code>SortBy</code>, the order that you want query logging configurations to be
     * listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param sortOrder
     *        If you specified a value for <code>SortBy</code>, the order that you want query logging configurations to
     *        be listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in
     *        the previous request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListResolverQueryLogConfigsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * If you specified a value for <code>SortBy</code>, the order that you want query logging configurations to be
     * listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param sortOrder
     *        If you specified a value for <code>SortBy</code>, the order that you want query logging configurations to
     *        be listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigs</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in
     *        the previous request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListResolverQueryLogConfigsRequest withSortOrder(SortOrder sortOrder) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof ListResolverQueryLogConfigsRequest == false)
            return false;
        ListResolverQueryLogConfigsRequest other = (ListResolverQueryLogConfigsRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverQueryLogConfigsRequest clone() {
        return (ListResolverQueryLogConfigsRequest) super.clone();
    }

}
