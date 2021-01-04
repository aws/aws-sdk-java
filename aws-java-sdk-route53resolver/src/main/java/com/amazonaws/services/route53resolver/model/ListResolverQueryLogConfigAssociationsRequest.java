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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverQueryLogConfigAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of query logging associations that you want to return in the response to a
     * <code>ListResolverQueryLogConfigAssociations</code> request. If you don't specify a value for
     * <code>MaxResults</code>, Resolver returns up to 100 query logging associations.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * For the first <code>ListResolverQueryLogConfigAssociations</code> request, omit this value.
     * </p>
     * <p>
     * If there are more than <code>MaxResults</code> query logging associations that match the values that you specify
     * for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigAssociations</code> request to
     * get the next group of associations. In the next request, specify the value of <code>NextToken</code> from the
     * previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An optional specification to return a subset of query logging associations.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The element that you want Resolver to sort query logging associations by.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
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
     * <code>CreationTime</code>: The ID of the query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code>
     * indicates the cause:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Status</code> is a value other than <code>FAILED</code>, <code>ERROR</code> is null.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging association
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceId</code>: The ID of the VPC that is associated with the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The current status of the configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was successfully
     * created. Resolver is logging queries that originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association. Here are
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
     * If you specified a value for <code>SortBy</code>, the order that you want query logging associations to be listed
     * in, <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     */
    private String sortOrder;

    /**
     * <p>
     * The maximum number of query logging associations that you want to return in the response to a
     * <code>ListResolverQueryLogConfigAssociations</code> request. If you don't specify a value for
     * <code>MaxResults</code>, Resolver returns up to 100 query logging associations.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of query logging associations that you want to return in the response to a
     *        <code>ListResolverQueryLogConfigAssociations</code> request. If you don't specify a value for
     *        <code>MaxResults</code>, Resolver returns up to 100 query logging associations.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of query logging associations that you want to return in the response to a
     * <code>ListResolverQueryLogConfigAssociations</code> request. If you don't specify a value for
     * <code>MaxResults</code>, Resolver returns up to 100 query logging associations.
     * </p>
     * 
     * @return The maximum number of query logging associations that you want to return in the response to a
     *         <code>ListResolverQueryLogConfigAssociations</code> request. If you don't specify a value for
     *         <code>MaxResults</code>, Resolver returns up to 100 query logging associations.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of query logging associations that you want to return in the response to a
     * <code>ListResolverQueryLogConfigAssociations</code> request. If you don't specify a value for
     * <code>MaxResults</code>, Resolver returns up to 100 query logging associations.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of query logging associations that you want to return in the response to a
     *        <code>ListResolverQueryLogConfigAssociations</code> request. If you don't specify a value for
     *        <code>MaxResults</code>, Resolver returns up to 100 query logging associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * For the first <code>ListResolverQueryLogConfigAssociations</code> request, omit this value.
     * </p>
     * <p>
     * If there are more than <code>MaxResults</code> query logging associations that match the values that you specify
     * for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigAssociations</code> request to
     * get the next group of associations. In the next request, specify the value of <code>NextToken</code> from the
     * previous response.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>ListResolverQueryLogConfigAssociations</code> request, omit this value.</p>
     *        <p>
     *        If there are more than <code>MaxResults</code> query logging associations that match the values that you
     *        specify for <code>Filters</code>, you can submit another
     *        <code>ListResolverQueryLogConfigAssociations</code> request to get the next group of associations. In the
     *        next request, specify the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first <code>ListResolverQueryLogConfigAssociations</code> request, omit this value.
     * </p>
     * <p>
     * If there are more than <code>MaxResults</code> query logging associations that match the values that you specify
     * for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigAssociations</code> request to
     * get the next group of associations. In the next request, specify the value of <code>NextToken</code> from the
     * previous response.
     * </p>
     * 
     * @return For the first <code>ListResolverQueryLogConfigAssociations</code> request, omit this value.</p>
     *         <p>
     *         If there are more than <code>MaxResults</code> query logging associations that match the values that you
     *         specify for <code>Filters</code>, you can submit another
     *         <code>ListResolverQueryLogConfigAssociations</code> request to get the next group of associations. In the
     *         next request, specify the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first <code>ListResolverQueryLogConfigAssociations</code> request, omit this value.
     * </p>
     * <p>
     * If there are more than <code>MaxResults</code> query logging associations that match the values that you specify
     * for <code>Filters</code>, you can submit another <code>ListResolverQueryLogConfigAssociations</code> request to
     * get the next group of associations. In the next request, specify the value of <code>NextToken</code> from the
     * previous response.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>ListResolverQueryLogConfigAssociations</code> request, omit this value.</p>
     *        <p>
     *        If there are more than <code>MaxResults</code> query logging associations that match the values that you
     *        specify for <code>Filters</code>, you can submit another
     *        <code>ListResolverQueryLogConfigAssociations</code> request to get the next group of associations. In the
     *        next request, specify the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An optional specification to return a subset of query logging associations.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @return An optional specification to return a subset of query logging associations.</p> <note>
     *         <p>
     *         If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *         specify the <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if
     *         any, as in the previous request.
     *         </p>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An optional specification to return a subset of query logging associations.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param filters
     *        An optional specification to return a subset of query logging associations.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *        specify the <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if
     *        any, as in the previous request.
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
     * An optional specification to return a subset of query logging associations.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
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
     *        An optional specification to return a subset of query logging associations.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *        specify the <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if
     *        any, as in the previous request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigAssociationsRequest withFilters(Filter... filters) {
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
     * An optional specification to return a subset of query logging associations.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param filters
     *        An optional specification to return a subset of query logging associations.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *        specify the <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if
     *        any, as in the previous request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverQueryLogConfigAssociationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The element that you want Resolver to sort query logging associations by.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
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
     * <code>CreationTime</code>: The ID of the query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code>
     * indicates the cause:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Status</code> is a value other than <code>FAILED</code>, <code>ERROR</code> is null.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging association
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceId</code>: The ID of the VPC that is associated with the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The current status of the configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was successfully
     * created. Resolver is logging queries that originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association. Here are
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
     *        The element that you want Resolver to sort query logging associations by. </p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *        specify the <code>NextToken</code> parameter, you must use the same value for <code>SortBy</code>, if any,
     *        as in the previous request.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values include the following elements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreationTime</code>: The ID of the query logging association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, the value of
     *        <code>Error</code> indicates the cause:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was
     *        deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>Status</code> is a value other than <code>FAILED</code>, <code>ERROR</code> is null.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Id</code>: The ID of the query logging association
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceId</code>: The ID of the VPC that is associated with the query logging configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The current status of the configuration. Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was
     *        successfully created. Resolver is logging queries that originate in the specified VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: Resolver is deleting this query logging association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
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
     * The element that you want Resolver to sort query logging associations by.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
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
     * <code>CreationTime</code>: The ID of the query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code>
     * indicates the cause:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Status</code> is a value other than <code>FAILED</code>, <code>ERROR</code> is null.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging association
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceId</code>: The ID of the VPC that is associated with the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The current status of the configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was successfully
     * created. Resolver is logging queries that originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association. Here are
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
     * @return The element that you want Resolver to sort query logging associations by. </p> <note>
     *         <p>
     *         If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *         specify the <code>NextToken</code> parameter, you must use the same value for <code>SortBy</code>, if
     *         any, as in the previous request.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values include the following elements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CreationTime</code>: The ID of the query logging association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, the value of
     *         <code>Error</code> indicates the cause:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was
     *         deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>Status</code> is a value other than <code>FAILED</code>, <code>ERROR</code> is null.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Id</code>: The ID of the query logging association
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceId</code>: The ID of the VPC that is associated with the query logging configuration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Status</code>: The current status of the configuration. Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was
     *         successfully created. Resolver is logging queries that originate in the specified VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code>: Resolver is deleting this query logging association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
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
     * The element that you want Resolver to sort query logging associations by.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
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
     * <code>CreationTime</code>: The ID of the query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, the value of <code>Error</code>
     * indicates the cause:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Status</code> is a value other than <code>FAILED</code>, <code>ERROR</code> is null.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging association
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceId</code>: The ID of the VPC that is associated with the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The current status of the configuration. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was successfully
     * created. Resolver is logging queries that originate in the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: Resolver is deleting this query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association. Here are
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
     *        The element that you want Resolver to sort query logging associations by. </p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *        specify the <code>NextToken</code> parameter, you must use the same value for <code>SortBy</code>, if any,
     *        as in the previous request.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values include the following elements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreationTime</code>: The ID of the query logging association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, the value of
     *        <code>Error</code> indicates the cause:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DESTINATION_NOT_FOUND</code>: The specified destination (for example, an Amazon S3 bucket) was
     *        deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code>: Permissions don't allow sending logs to the destination.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>Status</code> is a value other than <code>FAILED</code>, <code>ERROR</code> is null.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Id</code>: The ID of the query logging association
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceId</code>: The ID of the VPC that is associated with the query logging configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The current status of the configuration. Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: Resolver is creating an association between an Amazon VPC and a query logging
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The association between an Amazon VPC and a query logging configuration was
     *        successfully created. Resolver is logging queries that originate in the specified VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: Resolver is deleting this query logging association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: Resolver either couldn't create or couldn't delete the query logging association.
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

    public ListResolverQueryLogConfigAssociationsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * If you specified a value for <code>SortBy</code>, the order that you want query logging associations to be listed
     * in, <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param sortOrder
     *        If you specified a value for <code>SortBy</code>, the order that you want query logging associations to be
     *        listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *        specify the <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if
     *        any, as in the previous request.
     *        </p>
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * If you specified a value for <code>SortBy</code>, the order that you want query logging associations to be listed
     * in, <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @return If you specified a value for <code>SortBy</code>, the order that you want query logging associations to
     *         be listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.</p> <note>
     *         <p>
     *         If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *         specify the <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if
     *         any, as in the previous request.
     *         </p>
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * If you specified a value for <code>SortBy</code>, the order that you want query logging associations to be listed
     * in, <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param sortOrder
     *        If you specified a value for <code>SortBy</code>, the order that you want query logging associations to be
     *        listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *        specify the <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if
     *        any, as in the previous request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListResolverQueryLogConfigAssociationsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * If you specified a value for <code>SortBy</code>, the order that you want query logging associations to be listed
     * in, <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param sortOrder
     *        If you specified a value for <code>SortBy</code>, the order that you want query logging associations to be
     *        listed in, <code>ASCENDING</code> or <code>DESCENDING</code>.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverQueryLogConfigAssociations</code> request and
     *        specify the <code>NextToken</code> parameter, you must use the same value for <code>SortOrder</code>, if
     *        any, as in the previous request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListResolverQueryLogConfigAssociationsRequest withSortOrder(SortOrder sortOrder) {
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

        if (obj instanceof ListResolverQueryLogConfigAssociationsRequest == false)
            return false;
        ListResolverQueryLogConfigAssociationsRequest other = (ListResolverQueryLogConfigAssociationsRequest) obj;
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
    public ListResolverQueryLogConfigAssociationsRequest clone() {
        return (ListResolverQueryLogConfigAssociationsRequest) super.clone();
    }

}
