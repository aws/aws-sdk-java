/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.schemas;

import javax.annotation.Generated;

import com.amazonaws.services.schemas.model.*;

/**
 * Interface for accessing Schemas asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.schemas.AbstractAWSSchemasAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS EventBridge Schemas
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSchemasAsync extends AWSSchemas {

    /**
     * <p>
     * Creates a discoverer.
     * </p>
     * 
     * @param createDiscovererRequest
     * @return A Java Future containing the result of the CreateDiscoverer operation returned by the service.
     * @sample AWSSchemasAsync.CreateDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDiscovererResult> createDiscovererAsync(CreateDiscovererRequest createDiscovererRequest);

    /**
     * <p>
     * Creates a discoverer.
     * </p>
     * 
     * @param createDiscovererRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDiscoverer operation returned by the service.
     * @sample AWSSchemasAsyncHandler.CreateDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDiscovererResult> createDiscovererAsync(CreateDiscovererRequest createDiscovererRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDiscovererRequest, CreateDiscovererResult> asyncHandler);

    /**
     * <p>
     * Creates a registry.
     * </p>
     * 
     * @param createRegistryRequest
     * @return A Java Future containing the result of the CreateRegistry operation returned by the service.
     * @sample AWSSchemasAsync.CreateRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRegistryResult> createRegistryAsync(CreateRegistryRequest createRegistryRequest);

    /**
     * <p>
     * Creates a registry.
     * </p>
     * 
     * @param createRegistryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRegistry operation returned by the service.
     * @sample AWSSchemasAsyncHandler.CreateRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRegistryResult> createRegistryAsync(CreateRegistryRequest createRegistryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRegistryRequest, CreateRegistryResult> asyncHandler);

    /**
     * <p>
     * Creates a schema definition.
     * </p>
     * 
     * @param createSchemaRequest
     * @return A Java Future containing the result of the CreateSchema operation returned by the service.
     * @sample AWSSchemasAsync.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest createSchemaRequest);

    /**
     * <p>
     * Creates a schema definition.
     * </p>
     * 
     * @param createSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSchema operation returned by the service.
     * @sample AWSSchemasAsyncHandler.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest createSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSchemaRequest, CreateSchemaResult> asyncHandler);

    /**
     * <p>
     * Deletes a discoverer.
     * </p>
     * 
     * @param deleteDiscovererRequest
     * @return A Java Future containing the result of the DeleteDiscoverer operation returned by the service.
     * @sample AWSSchemasAsync.DeleteDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDiscovererResult> deleteDiscovererAsync(DeleteDiscovererRequest deleteDiscovererRequest);

    /**
     * <p>
     * Deletes a discoverer.
     * </p>
     * 
     * @param deleteDiscovererRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDiscoverer operation returned by the service.
     * @sample AWSSchemasAsyncHandler.DeleteDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDiscovererResult> deleteDiscovererAsync(DeleteDiscovererRequest deleteDiscovererRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDiscovererRequest, DeleteDiscovererResult> asyncHandler);

    /**
     * <p>
     * Deletes a Registry.
     * </p>
     * 
     * @param deleteRegistryRequest
     * @return A Java Future containing the result of the DeleteRegistry operation returned by the service.
     * @sample AWSSchemasAsync.DeleteRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegistryResult> deleteRegistryAsync(DeleteRegistryRequest deleteRegistryRequest);

    /**
     * <p>
     * Deletes a Registry.
     * </p>
     * 
     * @param deleteRegistryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRegistry operation returned by the service.
     * @sample AWSSchemasAsyncHandler.DeleteRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegistryResult> deleteRegistryAsync(DeleteRegistryRequest deleteRegistryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRegistryRequest, DeleteRegistryResult> asyncHandler);

    /**
     * <p>
     * Delete a schema definition.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @return A Java Future containing the result of the DeleteSchema operation returned by the service.
     * @sample AWSSchemasAsync.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest deleteSchemaRequest);

    /**
     * <p>
     * Delete a schema definition.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSchema operation returned by the service.
     * @sample AWSSchemasAsyncHandler.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest deleteSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSchemaRequest, DeleteSchemaResult> asyncHandler);

    /**
     * <p>
     * Delete the schema version definition
     * </p>
     * 
     * @param deleteSchemaVersionRequest
     * @return A Java Future containing the result of the DeleteSchemaVersion operation returned by the service.
     * @sample AWSSchemasAsync.DeleteSchemaVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteSchemaVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSchemaVersionResult> deleteSchemaVersionAsync(DeleteSchemaVersionRequest deleteSchemaVersionRequest);

    /**
     * <p>
     * Delete the schema version definition
     * </p>
     * 
     * @param deleteSchemaVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSchemaVersion operation returned by the service.
     * @sample AWSSchemasAsyncHandler.DeleteSchemaVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteSchemaVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSchemaVersionResult> deleteSchemaVersionAsync(DeleteSchemaVersionRequest deleteSchemaVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSchemaVersionRequest, DeleteSchemaVersionResult> asyncHandler);

    /**
     * <p>
     * Describe the code binding URI.
     * </p>
     * 
     * @param describeCodeBindingRequest
     * @return A Java Future containing the result of the DescribeCodeBinding operation returned by the service.
     * @sample AWSSchemasAsync.DescribeCodeBinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeCodeBinding" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCodeBindingResult> describeCodeBindingAsync(DescribeCodeBindingRequest describeCodeBindingRequest);

    /**
     * <p>
     * Describe the code binding URI.
     * </p>
     * 
     * @param describeCodeBindingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCodeBinding operation returned by the service.
     * @sample AWSSchemasAsyncHandler.DescribeCodeBinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeCodeBinding" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCodeBindingResult> describeCodeBindingAsync(DescribeCodeBindingRequest describeCodeBindingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCodeBindingRequest, DescribeCodeBindingResult> asyncHandler);

    /**
     * <p>
     * Describes the discoverer.
     * </p>
     * 
     * @param describeDiscovererRequest
     * @return A Java Future containing the result of the DescribeDiscoverer operation returned by the service.
     * @sample AWSSchemasAsync.DescribeDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDiscovererResult> describeDiscovererAsync(DescribeDiscovererRequest describeDiscovererRequest);

    /**
     * <p>
     * Describes the discoverer.
     * </p>
     * 
     * @param describeDiscovererRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDiscoverer operation returned by the service.
     * @sample AWSSchemasAsyncHandler.DescribeDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDiscovererResult> describeDiscovererAsync(DescribeDiscovererRequest describeDiscovererRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDiscovererRequest, DescribeDiscovererResult> asyncHandler);

    /**
     * <p>
     * Describes the registry.
     * </p>
     * 
     * @param describeRegistryRequest
     * @return A Java Future containing the result of the DescribeRegistry operation returned by the service.
     * @sample AWSSchemasAsync.DescribeRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistryResult> describeRegistryAsync(DescribeRegistryRequest describeRegistryRequest);

    /**
     * <p>
     * Describes the registry.
     * </p>
     * 
     * @param describeRegistryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRegistry operation returned by the service.
     * @sample AWSSchemasAsyncHandler.DescribeRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistryResult> describeRegistryAsync(DescribeRegistryRequest describeRegistryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRegistryRequest, DescribeRegistryResult> asyncHandler);

    /**
     * <p>
     * Retrieve the schema definition.
     * </p>
     * 
     * @param describeSchemaRequest
     * @return A Java Future containing the result of the DescribeSchema operation returned by the service.
     * @sample AWSSchemasAsync.DescribeSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSchemaResult> describeSchemaAsync(DescribeSchemaRequest describeSchemaRequest);

    /**
     * <p>
     * Retrieve the schema definition.
     * </p>
     * 
     * @param describeSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSchema operation returned by the service.
     * @sample AWSSchemasAsyncHandler.DescribeSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSchemaResult> describeSchemaAsync(DescribeSchemaRequest describeSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSchemaRequest, DescribeSchemaResult> asyncHandler);

    /**
     * <p>
     * Get the code binding source URI.
     * </p>
     * 
     * @param getCodeBindingSourceRequest
     * @return A Java Future containing the result of the GetCodeBindingSource operation returned by the service.
     * @sample AWSSchemasAsync.GetCodeBindingSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/GetCodeBindingSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCodeBindingSourceResult> getCodeBindingSourceAsync(GetCodeBindingSourceRequest getCodeBindingSourceRequest);

    /**
     * <p>
     * Get the code binding source URI.
     * </p>
     * 
     * @param getCodeBindingSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCodeBindingSource operation returned by the service.
     * @sample AWSSchemasAsyncHandler.GetCodeBindingSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/GetCodeBindingSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCodeBindingSourceResult> getCodeBindingSourceAsync(GetCodeBindingSourceRequest getCodeBindingSourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetCodeBindingSourceRequest, GetCodeBindingSourceResult> asyncHandler);

    /**
     * <p>
     * Get the discovered schema that was generated based on sampled events.
     * </p>
     * 
     * @param getDiscoveredSchemaRequest
     * @return A Java Future containing the result of the GetDiscoveredSchema operation returned by the service.
     * @sample AWSSchemasAsync.GetDiscoveredSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/GetDiscoveredSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDiscoveredSchemaResult> getDiscoveredSchemaAsync(GetDiscoveredSchemaRequest getDiscoveredSchemaRequest);

    /**
     * <p>
     * Get the discovered schema that was generated based on sampled events.
     * </p>
     * 
     * @param getDiscoveredSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDiscoveredSchema operation returned by the service.
     * @sample AWSSchemasAsyncHandler.GetDiscoveredSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/GetDiscoveredSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDiscoveredSchemaResult> getDiscoveredSchemaAsync(GetDiscoveredSchemaRequest getDiscoveredSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<GetDiscoveredSchemaRequest, GetDiscoveredSchemaResult> asyncHandler);

    /**
     * <p>
     * List the discoverers.
     * </p>
     * 
     * @param listDiscoverersRequest
     * @return A Java Future containing the result of the ListDiscoverers operation returned by the service.
     * @sample AWSSchemasAsync.ListDiscoverers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListDiscoverers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDiscoverersResult> listDiscoverersAsync(ListDiscoverersRequest listDiscoverersRequest);

    /**
     * <p>
     * List the discoverers.
     * </p>
     * 
     * @param listDiscoverersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDiscoverers operation returned by the service.
     * @sample AWSSchemasAsyncHandler.ListDiscoverers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListDiscoverers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDiscoverersResult> listDiscoverersAsync(ListDiscoverersRequest listDiscoverersRequest,
            com.amazonaws.handlers.AsyncHandler<ListDiscoverersRequest, ListDiscoverersResult> asyncHandler);

    /**
     * <p>
     * List the registries.
     * </p>
     * 
     * @param listRegistriesRequest
     * @return A Java Future containing the result of the ListRegistries operation returned by the service.
     * @sample AWSSchemasAsync.ListRegistries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListRegistries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRegistriesResult> listRegistriesAsync(ListRegistriesRequest listRegistriesRequest);

    /**
     * <p>
     * List the registries.
     * </p>
     * 
     * @param listRegistriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRegistries operation returned by the service.
     * @sample AWSSchemasAsyncHandler.ListRegistries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListRegistries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRegistriesResult> listRegistriesAsync(ListRegistriesRequest listRegistriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRegistriesRequest, ListRegistriesResult> asyncHandler);

    /**
     * <p>
     * Provides a list of the schema versions and related information.
     * </p>
     * 
     * @param listSchemaVersionsRequest
     * @return A Java Future containing the result of the ListSchemaVersions operation returned by the service.
     * @sample AWSSchemasAsync.ListSchemaVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListSchemaVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemaVersionsResult> listSchemaVersionsAsync(ListSchemaVersionsRequest listSchemaVersionsRequest);

    /**
     * <p>
     * Provides a list of the schema versions and related information.
     * </p>
     * 
     * @param listSchemaVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSchemaVersions operation returned by the service.
     * @sample AWSSchemasAsyncHandler.ListSchemaVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListSchemaVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemaVersionsResult> listSchemaVersionsAsync(ListSchemaVersionsRequest listSchemaVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSchemaVersionsRequest, ListSchemaVersionsResult> asyncHandler);

    /**
     * <p>
     * List the schemas.
     * </p>
     * 
     * @param listSchemasRequest
     * @return A Java Future containing the result of the ListSchemas operation returned by the service.
     * @sample AWSSchemasAsync.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest listSchemasRequest);

    /**
     * <p>
     * List the schemas.
     * </p>
     * 
     * @param listSchemasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSchemas operation returned by the service.
     * @sample AWSSchemasAsyncHandler.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest listSchemasRequest,
            com.amazonaws.handlers.AsyncHandler<ListSchemasRequest, ListSchemasResult> asyncHandler);

    /**
     * <p>
     * Get tags for resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSchemasAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Get tags for resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSchemasAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * @param lockServiceLinkedRoleRequest
     * @return A Java Future containing the result of the LockServiceLinkedRole operation returned by the service.
     * @sample AWSSchemasAsync.LockServiceLinkedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/LockServiceLinkedRole" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<LockServiceLinkedRoleResult> lockServiceLinkedRoleAsync(LockServiceLinkedRoleRequest lockServiceLinkedRoleRequest);

    /**
     * @param lockServiceLinkedRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the LockServiceLinkedRole operation returned by the service.
     * @sample AWSSchemasAsyncHandler.LockServiceLinkedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/LockServiceLinkedRole" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<LockServiceLinkedRoleResult> lockServiceLinkedRoleAsync(LockServiceLinkedRoleRequest lockServiceLinkedRoleRequest,
            com.amazonaws.handlers.AsyncHandler<LockServiceLinkedRoleRequest, LockServiceLinkedRoleResult> asyncHandler);

    /**
     * <p>
     * Put code binding URI
     * </p>
     * 
     * @param putCodeBindingRequest
     * @return A Java Future containing the result of the PutCodeBinding operation returned by the service.
     * @sample AWSSchemasAsync.PutCodeBinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/PutCodeBinding" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutCodeBindingResult> putCodeBindingAsync(PutCodeBindingRequest putCodeBindingRequest);

    /**
     * <p>
     * Put code binding URI
     * </p>
     * 
     * @param putCodeBindingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutCodeBinding operation returned by the service.
     * @sample AWSSchemasAsyncHandler.PutCodeBinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/PutCodeBinding" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutCodeBindingResult> putCodeBindingAsync(PutCodeBindingRequest putCodeBindingRequest,
            com.amazonaws.handlers.AsyncHandler<PutCodeBindingRequest, PutCodeBindingResult> asyncHandler);

    /**
     * <p>
     * Search the schemas
     * </p>
     * 
     * @param searchSchemasRequest
     * @return A Java Future containing the result of the SearchSchemas operation returned by the service.
     * @sample AWSSchemasAsync.SearchSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/SearchSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchSchemasResult> searchSchemasAsync(SearchSchemasRequest searchSchemasRequest);

    /**
     * <p>
     * Search the schemas
     * </p>
     * 
     * @param searchSchemasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchSchemas operation returned by the service.
     * @sample AWSSchemasAsyncHandler.SearchSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/SearchSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchSchemasResult> searchSchemasAsync(SearchSchemasRequest searchSchemasRequest,
            com.amazonaws.handlers.AsyncHandler<SearchSchemasRequest, SearchSchemasResult> asyncHandler);

    /**
     * <p>
     * Starts the discoverer
     * </p>
     * 
     * @param startDiscovererRequest
     * @return A Java Future containing the result of the StartDiscoverer operation returned by the service.
     * @sample AWSSchemasAsync.StartDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/StartDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDiscovererResult> startDiscovererAsync(StartDiscovererRequest startDiscovererRequest);

    /**
     * <p>
     * Starts the discoverer
     * </p>
     * 
     * @param startDiscovererRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDiscoverer operation returned by the service.
     * @sample AWSSchemasAsyncHandler.StartDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/StartDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDiscovererResult> startDiscovererAsync(StartDiscovererRequest startDiscovererRequest,
            com.amazonaws.handlers.AsyncHandler<StartDiscovererRequest, StartDiscovererResult> asyncHandler);

    /**
     * <p>
     * Stops the discoverer
     * </p>
     * 
     * @param stopDiscovererRequest
     * @return A Java Future containing the result of the StopDiscoverer operation returned by the service.
     * @sample AWSSchemasAsync.StopDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/StopDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopDiscovererResult> stopDiscovererAsync(StopDiscovererRequest stopDiscovererRequest);

    /**
     * <p>
     * Stops the discoverer
     * </p>
     * 
     * @param stopDiscovererRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDiscoverer operation returned by the service.
     * @sample AWSSchemasAsyncHandler.StopDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/StopDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopDiscovererResult> stopDiscovererAsync(StopDiscovererRequest stopDiscovererRequest,
            com.amazonaws.handlers.AsyncHandler<StopDiscovererRequest, StopDiscovererResult> asyncHandler);

    /**
     * <p>
     * Add tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSchemasAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Add tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSchemasAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * @param unlockServiceLinkedRoleRequest
     * @return A Java Future containing the result of the UnlockServiceLinkedRole operation returned by the service.
     * @sample AWSSchemasAsync.UnlockServiceLinkedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UnlockServiceLinkedRole"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UnlockServiceLinkedRoleResult> unlockServiceLinkedRoleAsync(UnlockServiceLinkedRoleRequest unlockServiceLinkedRoleRequest);

    /**
     * @param unlockServiceLinkedRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnlockServiceLinkedRole operation returned by the service.
     * @sample AWSSchemasAsyncHandler.UnlockServiceLinkedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UnlockServiceLinkedRole"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UnlockServiceLinkedRoleResult> unlockServiceLinkedRoleAsync(UnlockServiceLinkedRoleRequest unlockServiceLinkedRoleRequest,
            com.amazonaws.handlers.AsyncHandler<UnlockServiceLinkedRoleRequest, UnlockServiceLinkedRoleResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSchemasAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSchemasAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the discoverer
     * </p>
     * 
     * @param updateDiscovererRequest
     * @return A Java Future containing the result of the UpdateDiscoverer operation returned by the service.
     * @sample AWSSchemasAsync.UpdateDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDiscovererResult> updateDiscovererAsync(UpdateDiscovererRequest updateDiscovererRequest);

    /**
     * <p>
     * Updates the discoverer
     * </p>
     * 
     * @param updateDiscovererRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDiscoverer operation returned by the service.
     * @sample AWSSchemasAsyncHandler.UpdateDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDiscovererResult> updateDiscovererAsync(UpdateDiscovererRequest updateDiscovererRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDiscovererRequest, UpdateDiscovererResult> asyncHandler);

    /**
     * <p>
     * Updates a registry.
     * </p>
     * 
     * @param updateRegistryRequest
     * @return A Java Future containing the result of the UpdateRegistry operation returned by the service.
     * @sample AWSSchemasAsync.UpdateRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegistryResult> updateRegistryAsync(UpdateRegistryRequest updateRegistryRequest);

    /**
     * <p>
     * Updates a registry.
     * </p>
     * 
     * @param updateRegistryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRegistry operation returned by the service.
     * @sample AWSSchemasAsyncHandler.UpdateRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegistryResult> updateRegistryAsync(UpdateRegistryRequest updateRegistryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRegistryRequest, UpdateRegistryResult> asyncHandler);

    /**
     * <p>
     * Updates the schema definition
     * </p>
     * 
     * @param updateSchemaRequest
     * @return A Java Future containing the result of the UpdateSchema operation returned by the service.
     * @sample AWSSchemasAsync.UpdateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(UpdateSchemaRequest updateSchemaRequest);

    /**
     * <p>
     * Updates the schema definition
     * </p>
     * 
     * @param updateSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSchema operation returned by the service.
     * @sample AWSSchemasAsyncHandler.UpdateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(UpdateSchemaRequest updateSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSchemaRequest, UpdateSchemaResult> asyncHandler);

}
