/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch;

import javax.annotation.Generated;

import com.amazonaws.services.elasticsearch.model.*;

/**
 * Interface for accessing Amazon Elasticsearch Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticsearch.AbstractAWSElasticsearchAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Elasticsearch Configuration Service</fullname>
 * <p>
 * Use the Amazon Elasticsearch configuration API to create, configure, and manage Elasticsearch domains.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific: es.<i>region</i>.amazonaws.com. For example,
 * es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions" target="_blank">Regions
 * and Endpoints</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSElasticsearchAsync extends AWSElasticsearch {

    /**
     * <p>
     * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An
     * Elasticsearch domain may have up to 10 tags. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-awsresorcetagging"
     * target="_blank"> Tagging Amazon Elasticsearch Service Domains for more information.</a>
     * </p>
     * 
     * @param addTagsRequest
     *        Container for the parameters to the <code><a>AddTags</a></code> operation. Specify the tags that you want
     *        to attach to the Elasticsearch domain.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AWSElasticsearchAsync.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An
     * Elasticsearch domain may have up to 10 tags. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-awsresorcetagging"
     * target="_blank"> Tagging Amazon Elasticsearch Service Domains for more information.</a>
     * </p>
     * 
     * @param addTagsRequest
     *        Container for the parameters to the <code><a>AddTags</a></code> operation. Specify the tags that you want
     *        to attach to the Elasticsearch domain.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AWSElasticsearchAsyncHandler.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Creates a new Elasticsearch domain. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon Elasticsearch Service Developer Guide</i>.
     * </p>
     * 
     * @param createElasticsearchDomainRequest
     * @return A Java Future containing the result of the CreateElasticsearchDomain operation returned by the service.
     * @sample AWSElasticsearchAsync.CreateElasticsearchDomain
     */
    java.util.concurrent.Future<CreateElasticsearchDomainResult> createElasticsearchDomainAsync(
            CreateElasticsearchDomainRequest createElasticsearchDomainRequest);

    /**
     * <p>
     * Creates a new Elasticsearch domain. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon Elasticsearch Service Developer Guide</i>.
     * </p>
     * 
     * @param createElasticsearchDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateElasticsearchDomain operation returned by the service.
     * @sample AWSElasticsearchAsyncHandler.CreateElasticsearchDomain
     */
    java.util.concurrent.Future<CreateElasticsearchDomainResult> createElasticsearchDomainAsync(
            CreateElasticsearchDomainRequest createElasticsearchDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateElasticsearchDomainRequest, CreateElasticsearchDomainResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot
     * be recovered.
     * </p>
     * 
     * @param deleteElasticsearchDomainRequest
     *        Container for the parameters to the <code><a>DeleteElasticsearchDomain</a></code> operation. Specifies the
     *        name of the Elasticsearch domain that you want to delete.
     * @return A Java Future containing the result of the DeleteElasticsearchDomain operation returned by the service.
     * @sample AWSElasticsearchAsync.DeleteElasticsearchDomain
     */
    java.util.concurrent.Future<DeleteElasticsearchDomainResult> deleteElasticsearchDomainAsync(
            DeleteElasticsearchDomainRequest deleteElasticsearchDomainRequest);

    /**
     * <p>
     * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot
     * be recovered.
     * </p>
     * 
     * @param deleteElasticsearchDomainRequest
     *        Container for the parameters to the <code><a>DeleteElasticsearchDomain</a></code> operation. Specifies the
     *        name of the Elasticsearch domain that you want to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteElasticsearchDomain operation returned by the service.
     * @sample AWSElasticsearchAsyncHandler.DeleteElasticsearchDomain
     */
    java.util.concurrent.Future<DeleteElasticsearchDomainResult> deleteElasticsearchDomainAsync(
            DeleteElasticsearchDomainRequest deleteElasticsearchDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteElasticsearchDomainRequest, DeleteElasticsearchDomainResult> asyncHandler);

    /**
     * <p>
     * Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion
     * will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before
     * deleting the role. See <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-enabling-slr"
     * target="_blank">Deleting Elasticsearch Service Role</a> in <i>VPC Endpoints for Amazon Elasticsearch Service
     * Domains</i>.
     * </p>
     * 
     * @param deleteElasticsearchServiceRoleRequest
     * @return A Java Future containing the result of the DeleteElasticsearchServiceRole operation returned by the
     *         service.
     * @sample AWSElasticsearchAsync.DeleteElasticsearchServiceRole
     */
    java.util.concurrent.Future<DeleteElasticsearchServiceRoleResult> deleteElasticsearchServiceRoleAsync(
            DeleteElasticsearchServiceRoleRequest deleteElasticsearchServiceRoleRequest);

    /**
     * <p>
     * Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion
     * will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before
     * deleting the role. See <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-enabling-slr"
     * target="_blank">Deleting Elasticsearch Service Role</a> in <i>VPC Endpoints for Amazon Elasticsearch Service
     * Domains</i>.
     * </p>
     * 
     * @param deleteElasticsearchServiceRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteElasticsearchServiceRole operation returned by the
     *         service.
     * @sample AWSElasticsearchAsyncHandler.DeleteElasticsearchServiceRole
     */
    java.util.concurrent.Future<DeleteElasticsearchServiceRoleResult> deleteElasticsearchServiceRoleAsync(
            DeleteElasticsearchServiceRoleRequest deleteElasticsearchServiceRoleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteElasticsearchServiceRoleRequest, DeleteElasticsearchServiceRoleResult> asyncHandler);

    /**
     * <p>
     * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID,
     * domain endpoint, and domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainRequest
     *        Container for the parameters to the <code><a>DescribeElasticsearchDomain</a></code> operation.
     * @return A Java Future containing the result of the DescribeElasticsearchDomain operation returned by the service.
     * @sample AWSElasticsearchAsync.DescribeElasticsearchDomain
     */
    java.util.concurrent.Future<DescribeElasticsearchDomainResult> describeElasticsearchDomainAsync(
            DescribeElasticsearchDomainRequest describeElasticsearchDomainRequest);

    /**
     * <p>
     * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID,
     * domain endpoint, and domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainRequest
     *        Container for the parameters to the <code><a>DescribeElasticsearchDomain</a></code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeElasticsearchDomain operation returned by the service.
     * @sample AWSElasticsearchAsyncHandler.DescribeElasticsearchDomain
     */
    java.util.concurrent.Future<DescribeElasticsearchDomainResult> describeElasticsearchDomainAsync(
            DescribeElasticsearchDomainRequest describeElasticsearchDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchDomainRequest, DescribeElasticsearchDomainResult> asyncHandler);

    /**
     * <p>
     * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation
     * date, update version, and update date for cluster options.
     * </p>
     * 
     * @param describeElasticsearchDomainConfigRequest
     *        Container for the parameters to the <code>DescribeElasticsearchDomainConfig</code> operation. Specifies
     *        the domain name for which you want configuration information.
     * @return A Java Future containing the result of the DescribeElasticsearchDomainConfig operation returned by the
     *         service.
     * @sample AWSElasticsearchAsync.DescribeElasticsearchDomainConfig
     */
    java.util.concurrent.Future<DescribeElasticsearchDomainConfigResult> describeElasticsearchDomainConfigAsync(
            DescribeElasticsearchDomainConfigRequest describeElasticsearchDomainConfigRequest);

    /**
     * <p>
     * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation
     * date, update version, and update date for cluster options.
     * </p>
     * 
     * @param describeElasticsearchDomainConfigRequest
     *        Container for the parameters to the <code>DescribeElasticsearchDomainConfig</code> operation. Specifies
     *        the domain name for which you want configuration information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeElasticsearchDomainConfig operation returned by the
     *         service.
     * @sample AWSElasticsearchAsyncHandler.DescribeElasticsearchDomainConfig
     */
    java.util.concurrent.Future<DescribeElasticsearchDomainConfigResult> describeElasticsearchDomainConfigAsync(
            DescribeElasticsearchDomainConfigRequest describeElasticsearchDomainConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchDomainConfigRequest, DescribeElasticsearchDomainConfigResult> asyncHandler);

    /**
     * <p>
     * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID,
     * domain endpoint, and domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainsRequest
     *        Container for the parameters to the <code><a>DescribeElasticsearchDomains</a></code> operation. By
     *        default, the API returns the status of all Elasticsearch domains.
     * @return A Java Future containing the result of the DescribeElasticsearchDomains operation returned by the
     *         service.
     * @sample AWSElasticsearchAsync.DescribeElasticsearchDomains
     */
    java.util.concurrent.Future<DescribeElasticsearchDomainsResult> describeElasticsearchDomainsAsync(
            DescribeElasticsearchDomainsRequest describeElasticsearchDomainsRequest);

    /**
     * <p>
     * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID,
     * domain endpoint, and domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainsRequest
     *        Container for the parameters to the <code><a>DescribeElasticsearchDomains</a></code> operation. By
     *        default, the API returns the status of all Elasticsearch domains.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeElasticsearchDomains operation returned by the
     *         service.
     * @sample AWSElasticsearchAsyncHandler.DescribeElasticsearchDomains
     */
    java.util.concurrent.Future<DescribeElasticsearchDomainsResult> describeElasticsearchDomainsAsync(
            DescribeElasticsearchDomainsRequest describeElasticsearchDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchDomainsRequest, DescribeElasticsearchDomainsResult> asyncHandler);

    /**
     * <p>
     * Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain,
     * specify the <code> <a>DomainName</a> </code> to know what Limits are supported for modifying.
     * </p>
     * 
     * @param describeElasticsearchInstanceTypeLimitsRequest
     *        Container for the parameters to <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
     * @return A Java Future containing the result of the DescribeElasticsearchInstanceTypeLimits operation returned by
     *         the service.
     * @sample AWSElasticsearchAsync.DescribeElasticsearchInstanceTypeLimits
     */
    java.util.concurrent.Future<DescribeElasticsearchInstanceTypeLimitsResult> describeElasticsearchInstanceTypeLimitsAsync(
            DescribeElasticsearchInstanceTypeLimitsRequest describeElasticsearchInstanceTypeLimitsRequest);

    /**
     * <p>
     * Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain,
     * specify the <code> <a>DomainName</a> </code> to know what Limits are supported for modifying.
     * </p>
     * 
     * @param describeElasticsearchInstanceTypeLimitsRequest
     *        Container for the parameters to <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeElasticsearchInstanceTypeLimits operation returned by
     *         the service.
     * @sample AWSElasticsearchAsyncHandler.DescribeElasticsearchInstanceTypeLimits
     */
    java.util.concurrent.Future<DescribeElasticsearchInstanceTypeLimitsResult> describeElasticsearchInstanceTypeLimitsAsync(
            DescribeElasticsearchInstanceTypeLimitsRequest describeElasticsearchInstanceTypeLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchInstanceTypeLimitsRequest, DescribeElasticsearchInstanceTypeLimitsResult> asyncHandler);

    /**
     * <p>
     * Returns the name of all Elasticsearch domains owned by the current user's account.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @return A Java Future containing the result of the ListDomainNames operation returned by the service.
     * @sample AWSElasticsearchAsync.ListDomainNames
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest);

    /**
     * <p>
     * Returns the name of all Elasticsearch domains owned by the current user's account.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomainNames operation returned by the service.
     * @sample AWSElasticsearchAsyncHandler.ListDomainNames
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler);

    /**
     * <p>
     * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
     * </p>
     * 
     * @param listElasticsearchInstanceTypesRequest
     *        Container for the parameters to the <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
     * @return A Java Future containing the result of the ListElasticsearchInstanceTypes operation returned by the
     *         service.
     * @sample AWSElasticsearchAsync.ListElasticsearchInstanceTypes
     */
    java.util.concurrent.Future<ListElasticsearchInstanceTypesResult> listElasticsearchInstanceTypesAsync(
            ListElasticsearchInstanceTypesRequest listElasticsearchInstanceTypesRequest);

    /**
     * <p>
     * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
     * </p>
     * 
     * @param listElasticsearchInstanceTypesRequest
     *        Container for the parameters to the <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListElasticsearchInstanceTypes operation returned by the
     *         service.
     * @sample AWSElasticsearchAsyncHandler.ListElasticsearchInstanceTypes
     */
    java.util.concurrent.Future<ListElasticsearchInstanceTypesResult> listElasticsearchInstanceTypesAsync(
            ListElasticsearchInstanceTypesRequest listElasticsearchInstanceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListElasticsearchInstanceTypesRequest, ListElasticsearchInstanceTypesResult> asyncHandler);

    /**
     * <p>
     * List all supported Elasticsearch versions
     * </p>
     * 
     * @param listElasticsearchVersionsRequest
     *        Container for the parameters to the <code> <a>ListElasticsearchVersions</a> </code> operation.
     *        <p>
     *        Use <code> <a>MaxResults</a> </code> to control the maximum number of results to retrieve in a single
     *        call.
     *        </p>
     *        <p>
     *        Use <code> <a>NextToken</a> </code> in response to retrieve more results. If the received response does
     *        not contain a NextToken, then there are no more results to retrieve.
     *        </p>
     * @return A Java Future containing the result of the ListElasticsearchVersions operation returned by the service.
     * @sample AWSElasticsearchAsync.ListElasticsearchVersions
     */
    java.util.concurrent.Future<ListElasticsearchVersionsResult> listElasticsearchVersionsAsync(
            ListElasticsearchVersionsRequest listElasticsearchVersionsRequest);

    /**
     * <p>
     * List all supported Elasticsearch versions
     * </p>
     * 
     * @param listElasticsearchVersionsRequest
     *        Container for the parameters to the <code> <a>ListElasticsearchVersions</a> </code> operation.
     *        <p>
     *        Use <code> <a>MaxResults</a> </code> to control the maximum number of results to retrieve in a single
     *        call.
     *        </p>
     *        <p>
     *        Use <code> <a>NextToken</a> </code> in response to retrieve more results. If the received response does
     *        not contain a NextToken, then there are no more results to retrieve.
     *        </p>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListElasticsearchVersions operation returned by the service.
     * @sample AWSElasticsearchAsyncHandler.ListElasticsearchVersions
     */
    java.util.concurrent.Future<ListElasticsearchVersionsResult> listElasticsearchVersionsAsync(
            ListElasticsearchVersionsRequest listElasticsearchVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListElasticsearchVersionsRequest, ListElasticsearchVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns all tags for the given Elasticsearch domain.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code><a>ListTags</a></code> operation. Specify the <code>ARN</code>
     *        for the Elasticsearch domain to which the tags are attached that you want to view are attached.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSElasticsearchAsync.ListTags
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Returns all tags for the given Elasticsearch domain.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code><a>ListTags</a></code> operation. Specify the <code>ARN</code>
     *        for the Elasticsearch domain to which the tags are attached that you want to view are attached.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSElasticsearchAsyncHandler.ListTags
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Removes the specified set of tags from the specified Elasticsearch domain.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the parameters to the <code><a>RemoveTags</a></code> operation. Specify the <code>ARN</code>
     *        for the Elasticsearch domain from which you want to remove the specified <code>TagKey</code>.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AWSElasticsearchAsync.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes the specified set of tags from the specified Elasticsearch domain.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the parameters to the <code><a>RemoveTags</a></code> operation. Specify the <code>ARN</code>
     *        for the Elasticsearch domain from which you want to remove the specified <code>TagKey</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AWSElasticsearchAsyncHandler.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

    /**
     * <p>
     * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type
     * and the number of instances.
     * </p>
     * 
     * @param updateElasticsearchDomainConfigRequest
     *        Container for the parameters to the <code><a>UpdateElasticsearchDomain</a></code> operation. Specifies the
     *        type and number of instances in the domain cluster.
     * @return A Java Future containing the result of the UpdateElasticsearchDomainConfig operation returned by the
     *         service.
     * @sample AWSElasticsearchAsync.UpdateElasticsearchDomainConfig
     */
    java.util.concurrent.Future<UpdateElasticsearchDomainConfigResult> updateElasticsearchDomainConfigAsync(
            UpdateElasticsearchDomainConfigRequest updateElasticsearchDomainConfigRequest);

    /**
     * <p>
     * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type
     * and the number of instances.
     * </p>
     * 
     * @param updateElasticsearchDomainConfigRequest
     *        Container for the parameters to the <code><a>UpdateElasticsearchDomain</a></code> operation. Specifies the
     *        type and number of instances in the domain cluster.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateElasticsearchDomainConfig operation returned by the
     *         service.
     * @sample AWSElasticsearchAsyncHandler.UpdateElasticsearchDomainConfig
     */
    java.util.concurrent.Future<UpdateElasticsearchDomainConfigResult> updateElasticsearchDomainConfigAsync(
            UpdateElasticsearchDomainConfigRequest updateElasticsearchDomainConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateElasticsearchDomainConfigRequest, UpdateElasticsearchDomainConfigResult> asyncHandler);

}
