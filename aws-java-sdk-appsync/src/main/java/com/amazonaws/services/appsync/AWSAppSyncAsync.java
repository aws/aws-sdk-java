/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync;

import javax.annotation.Generated;

import com.amazonaws.services.appsync.model.*;

/**
 * Interface for accessing AWSAppSync asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appsync.AbstractAWSAppSyncAsync} instead.
 * </p>
 * <p>
 * <p>
 * AppSync provides API actions for creating and interacting with data sources using GraphQL from your application.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppSyncAsync extends AWSAppSync {

    /**
     * <p>
     * Maps an endpoint to your custom domain.
     * </p>
     * 
     * @param associateApiRequest
     * @return A Java Future containing the result of the AssociateApi operation returned by the service.
     * @sample AWSAppSyncAsync.AssociateApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/AssociateApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateApiResult> associateApiAsync(AssociateApiRequest associateApiRequest);

    /**
     * <p>
     * Maps an endpoint to your custom domain.
     * </p>
     * 
     * @param associateApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateApi operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.AssociateApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/AssociateApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateApiResult> associateApiAsync(AssociateApiRequest associateApiRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateApiRequest, AssociateApiResult> asyncHandler);

    /**
     * <p>
     * Creates an association between a Merged API and source API using the source API's identifier.
     * </p>
     * 
     * @param associateMergedGraphqlApiRequest
     * @return A Java Future containing the result of the AssociateMergedGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsync.AssociateMergedGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/AssociateMergedGraphqlApi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMergedGraphqlApiResult> associateMergedGraphqlApiAsync(
            AssociateMergedGraphqlApiRequest associateMergedGraphqlApiRequest);

    /**
     * <p>
     * Creates an association between a Merged API and source API using the source API's identifier.
     * </p>
     * 
     * @param associateMergedGraphqlApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateMergedGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.AssociateMergedGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/AssociateMergedGraphqlApi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMergedGraphqlApiResult> associateMergedGraphqlApiAsync(
            AssociateMergedGraphqlApiRequest associateMergedGraphqlApiRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateMergedGraphqlApiRequest, AssociateMergedGraphqlApiResult> asyncHandler);

    /**
     * <p>
     * Creates an association between a Merged API and source API using the Merged API's identifier.
     * </p>
     * 
     * @param associateSourceGraphqlApiRequest
     * @return A Java Future containing the result of the AssociateSourceGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsync.AssociateSourceGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/AssociateSourceGraphqlApi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSourceGraphqlApiResult> associateSourceGraphqlApiAsync(
            AssociateSourceGraphqlApiRequest associateSourceGraphqlApiRequest);

    /**
     * <p>
     * Creates an association between a Merged API and source API using the Merged API's identifier.
     * </p>
     * 
     * @param associateSourceGraphqlApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateSourceGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.AssociateSourceGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/AssociateSourceGraphqlApi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSourceGraphqlApiResult> associateSourceGraphqlApiAsync(
            AssociateSourceGraphqlApiRequest associateSourceGraphqlApiRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateSourceGraphqlApiRequest, AssociateSourceGraphqlApiResult> asyncHandler);

    /**
     * <p>
     * Creates a cache for the GraphQL API.
     * </p>
     * 
     * @param createApiCacheRequest
     *        Represents the input of a <code>CreateApiCache</code> operation.
     * @return A Java Future containing the result of the CreateApiCache operation returned by the service.
     * @sample AWSAppSyncAsync.CreateApiCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateApiCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateApiCacheResult> createApiCacheAsync(CreateApiCacheRequest createApiCacheRequest);

    /**
     * <p>
     * Creates a cache for the GraphQL API.
     * </p>
     * 
     * @param createApiCacheRequest
     *        Represents the input of a <code>CreateApiCache</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApiCache operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.CreateApiCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateApiCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateApiCacheResult> createApiCacheAsync(CreateApiCacheRequest createApiCacheRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApiCacheRequest, CreateApiCacheResult> asyncHandler);

    /**
     * <p>
     * Creates a unique key that you can distribute to clients who invoke your API.
     * </p>
     * 
     * @param createApiKeyRequest
     * @return A Java Future containing the result of the CreateApiKey operation returned by the service.
     * @sample AWSAppSyncAsync.CreateApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateApiKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(CreateApiKeyRequest createApiKeyRequest);

    /**
     * <p>
     * Creates a unique key that you can distribute to clients who invoke your API.
     * </p>
     * 
     * @param createApiKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApiKey operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.CreateApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateApiKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(CreateApiKeyRequest createApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>DataSource</code> object.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AWSAppSyncAsync.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Creates a <code>DataSource</code> object.
     * </p>
     * 
     * @param createDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Creates a custom <code>DomainName</code> object.
     * </p>
     * 
     * @param createDomainNameRequest
     * @return A Java Future containing the result of the CreateDomainName operation returned by the service.
     * @sample AWSAppSyncAsync.CreateDomainName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateDomainName" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(CreateDomainNameRequest createDomainNameRequest);

    /**
     * <p>
     * Creates a custom <code>DomainName</code> object.
     * </p>
     * 
     * @param createDomainNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomainName operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.CreateDomainName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateDomainName" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(CreateDomainNameRequest createDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainNameRequest, CreateDomainNameResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>Function</code> object.
     * </p>
     * <p>
     * A function is a reusable entity. You can use multiple functions to compose the resolver logic.
     * </p>
     * 
     * @param createFunctionRequest
     * @return A Java Future containing the result of the CreateFunction operation returned by the service.
     * @sample AWSAppSyncAsync.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest);

    /**
     * <p>
     * Creates a <code>Function</code> object.
     * </p>
     * <p>
     * A function is a reusable entity. You can use multiple functions to compose the resolver logic.
     * </p>
     * 
     * @param createFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFunction operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFunctionRequest, CreateFunctionResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param createGraphqlApiRequest
     * @return A Java Future containing the result of the CreateGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsync.CreateGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGraphqlApiResult> createGraphqlApiAsync(CreateGraphqlApiRequest createGraphqlApiRequest);

    /**
     * <p>
     * Creates a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param createGraphqlApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.CreateGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGraphqlApiResult> createGraphqlApiAsync(CreateGraphqlApiRequest createGraphqlApiRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGraphqlApiRequest, CreateGraphqlApiResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>Resolver</code> object.
     * </p>
     * <p>
     * A resolver converts incoming requests into a format that a data source can understand, and converts the data
     * source's responses into GraphQL.
     * </p>
     * 
     * @param createResolverRequest
     * @return A Java Future containing the result of the CreateResolver operation returned by the service.
     * @sample AWSAppSyncAsync.CreateResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateResolver" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateResolverResult> createResolverAsync(CreateResolverRequest createResolverRequest);

    /**
     * <p>
     * Creates a <code>Resolver</code> object.
     * </p>
     * <p>
     * A resolver converts incoming requests into a format that a data source can understand, and converts the data
     * source's responses into GraphQL.
     * </p>
     * 
     * @param createResolverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResolver operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.CreateResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateResolver" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateResolverResult> createResolverAsync(CreateResolverRequest createResolverRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResolverRequest, CreateResolverResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>Type</code> object.
     * </p>
     * 
     * @param createTypeRequest
     * @return A Java Future containing the result of the CreateType operation returned by the service.
     * @sample AWSAppSyncAsync.CreateType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTypeResult> createTypeAsync(CreateTypeRequest createTypeRequest);

    /**
     * <p>
     * Creates a <code>Type</code> object.
     * </p>
     * 
     * @param createTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateType operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.CreateType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTypeResult> createTypeAsync(CreateTypeRequest createTypeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTypeRequest, CreateTypeResult> asyncHandler);

    /**
     * <p>
     * Deletes an <code>ApiCache</code> object.
     * </p>
     * 
     * @param deleteApiCacheRequest
     *        Represents the input of a <code>DeleteApiCache</code> operation.
     * @return A Java Future containing the result of the DeleteApiCache operation returned by the service.
     * @sample AWSAppSyncAsync.DeleteApiCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteApiCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApiCacheResult> deleteApiCacheAsync(DeleteApiCacheRequest deleteApiCacheRequest);

    /**
     * <p>
     * Deletes an <code>ApiCache</code> object.
     * </p>
     * 
     * @param deleteApiCacheRequest
     *        Represents the input of a <code>DeleteApiCache</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApiCache operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.DeleteApiCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteApiCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApiCacheResult> deleteApiCacheAsync(DeleteApiCacheRequest deleteApiCacheRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApiCacheRequest, DeleteApiCacheResult> asyncHandler);

    /**
     * <p>
     * Deletes an API key.
     * </p>
     * 
     * @param deleteApiKeyRequest
     * @return A Java Future containing the result of the DeleteApiKey operation returned by the service.
     * @sample AWSAppSyncAsync.DeleteApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteApiKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApiKeyResult> deleteApiKeyAsync(DeleteApiKeyRequest deleteApiKeyRequest);

    /**
     * <p>
     * Deletes an API key.
     * </p>
     * 
     * @param deleteApiKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApiKey operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.DeleteApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteApiKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApiKeyResult> deleteApiKeyAsync(DeleteApiKeyRequest deleteApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes a <code>DataSource</code> object.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AWSAppSyncAsync.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Deletes a <code>DataSource</code> object.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom <code>DomainName</code> object.
     * </p>
     * 
     * @param deleteDomainNameRequest
     * @return A Java Future containing the result of the DeleteDomainName operation returned by the service.
     * @sample AWSAppSyncAsync.DeleteDomainName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteDomainName" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainNameResult> deleteDomainNameAsync(DeleteDomainNameRequest deleteDomainNameRequest);

    /**
     * <p>
     * Deletes a custom <code>DomainName</code> object.
     * </p>
     * 
     * @param deleteDomainNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomainName operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.DeleteDomainName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteDomainName" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainNameResult> deleteDomainNameAsync(DeleteDomainNameRequest deleteDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainNameRequest, DeleteDomainNameResult> asyncHandler);

    /**
     * <p>
     * Deletes a <code>Function</code>.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return A Java Future containing the result of the DeleteFunction operation returned by the service.
     * @sample AWSAppSyncAsync.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest);

    /**
     * <p>
     * Deletes a <code>Function</code>.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFunction operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionRequest, DeleteFunctionResult> asyncHandler);

    /**
     * <p>
     * Deletes a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param deleteGraphqlApiRequest
     * @return A Java Future containing the result of the DeleteGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsync.DeleteGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGraphqlApiResult> deleteGraphqlApiAsync(DeleteGraphqlApiRequest deleteGraphqlApiRequest);

    /**
     * <p>
     * Deletes a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param deleteGraphqlApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.DeleteGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGraphqlApiResult> deleteGraphqlApiAsync(DeleteGraphqlApiRequest deleteGraphqlApiRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGraphqlApiRequest, DeleteGraphqlApiResult> asyncHandler);

    /**
     * <p>
     * Deletes a <code>Resolver</code> object.
     * </p>
     * 
     * @param deleteResolverRequest
     * @return A Java Future containing the result of the DeleteResolver operation returned by the service.
     * @sample AWSAppSyncAsync.DeleteResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteResolver" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResolverResult> deleteResolverAsync(DeleteResolverRequest deleteResolverRequest);

    /**
     * <p>
     * Deletes a <code>Resolver</code> object.
     * </p>
     * 
     * @param deleteResolverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResolver operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.DeleteResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteResolver" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResolverResult> deleteResolverAsync(DeleteResolverRequest deleteResolverRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResolverRequest, DeleteResolverResult> asyncHandler);

    /**
     * <p>
     * Deletes a <code>Type</code> object.
     * </p>
     * 
     * @param deleteTypeRequest
     * @return A Java Future containing the result of the DeleteType operation returned by the service.
     * @sample AWSAppSyncAsync.DeleteType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTypeResult> deleteTypeAsync(DeleteTypeRequest deleteTypeRequest);

    /**
     * <p>
     * Deletes a <code>Type</code> object.
     * </p>
     * 
     * @param deleteTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteType operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.DeleteType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTypeResult> deleteTypeAsync(DeleteTypeRequest deleteTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTypeRequest, DeleteTypeResult> asyncHandler);

    /**
     * <p>
     * Removes an <code>ApiAssociation</code> object from a custom domain.
     * </p>
     * 
     * @param disassociateApiRequest
     * @return A Java Future containing the result of the DisassociateApi operation returned by the service.
     * @sample AWSAppSyncAsync.DisassociateApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DisassociateApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateApiResult> disassociateApiAsync(DisassociateApiRequest disassociateApiRequest);

    /**
     * <p>
     * Removes an <code>ApiAssociation</code> object from a custom domain.
     * </p>
     * 
     * @param disassociateApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateApi operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.DisassociateApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DisassociateApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateApiResult> disassociateApiAsync(DisassociateApiRequest disassociateApiRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateApiRequest, DisassociateApiResult> asyncHandler);

    /**
     * <p>
     * Deletes an association between a Merged API and source API using the source API's identifier and the association
     * ID.
     * </p>
     * 
     * @param disassociateMergedGraphqlApiRequest
     * @return A Java Future containing the result of the DisassociateMergedGraphqlApi operation returned by the
     *         service.
     * @sample AWSAppSyncAsync.DisassociateMergedGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DisassociateMergedGraphqlApi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMergedGraphqlApiResult> disassociateMergedGraphqlApiAsync(
            DisassociateMergedGraphqlApiRequest disassociateMergedGraphqlApiRequest);

    /**
     * <p>
     * Deletes an association between a Merged API and source API using the source API's identifier and the association
     * ID.
     * </p>
     * 
     * @param disassociateMergedGraphqlApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMergedGraphqlApi operation returned by the
     *         service.
     * @sample AWSAppSyncAsyncHandler.DisassociateMergedGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DisassociateMergedGraphqlApi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMergedGraphqlApiResult> disassociateMergedGraphqlApiAsync(
            DisassociateMergedGraphqlApiRequest disassociateMergedGraphqlApiRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMergedGraphqlApiRequest, DisassociateMergedGraphqlApiResult> asyncHandler);

    /**
     * <p>
     * Deletes an association between a Merged API and source API using the Merged API's identifier and the association
     * ID.
     * </p>
     * 
     * @param disassociateSourceGraphqlApiRequest
     * @return A Java Future containing the result of the DisassociateSourceGraphqlApi operation returned by the
     *         service.
     * @sample AWSAppSyncAsync.DisassociateSourceGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DisassociateSourceGraphqlApi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSourceGraphqlApiResult> disassociateSourceGraphqlApiAsync(
            DisassociateSourceGraphqlApiRequest disassociateSourceGraphqlApiRequest);

    /**
     * <p>
     * Deletes an association between a Merged API and source API using the Merged API's identifier and the association
     * ID.
     * </p>
     * 
     * @param disassociateSourceGraphqlApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateSourceGraphqlApi operation returned by the
     *         service.
     * @sample AWSAppSyncAsyncHandler.DisassociateSourceGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DisassociateSourceGraphqlApi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSourceGraphqlApiResult> disassociateSourceGraphqlApiAsync(
            DisassociateSourceGraphqlApiRequest disassociateSourceGraphqlApiRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateSourceGraphqlApiRequest, DisassociateSourceGraphqlApiResult> asyncHandler);

    /**
     * <p>
     * Evaluates the given code and returns the response. The code definition requirements depend on the specified
     * runtime. For <code>APPSYNC_JS</code> runtimes, the code defines the request and response functions. The request
     * function takes the incoming request after a GraphQL operation is parsed and converts it into a request
     * configuration for the selected data source operation. The response function interprets responses from the data
     * source and maps it to the shape of the GraphQL field output type.
     * </p>
     * 
     * @param evaluateCodeRequest
     * @return A Java Future containing the result of the EvaluateCode operation returned by the service.
     * @sample AWSAppSyncAsync.EvaluateCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/EvaluateCode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EvaluateCodeResult> evaluateCodeAsync(EvaluateCodeRequest evaluateCodeRequest);

    /**
     * <p>
     * Evaluates the given code and returns the response. The code definition requirements depend on the specified
     * runtime. For <code>APPSYNC_JS</code> runtimes, the code defines the request and response functions. The request
     * function takes the incoming request after a GraphQL operation is parsed and converts it into a request
     * configuration for the selected data source operation. The response function interprets responses from the data
     * source and maps it to the shape of the GraphQL field output type.
     * </p>
     * 
     * @param evaluateCodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EvaluateCode operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.EvaluateCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/EvaluateCode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EvaluateCodeResult> evaluateCodeAsync(EvaluateCodeRequest evaluateCodeRequest,
            com.amazonaws.handlers.AsyncHandler<EvaluateCodeRequest, EvaluateCodeResult> asyncHandler);

    /**
     * <p>
     * Evaluates a given template and returns the response. The mapping template can be a request or response template.
     * </p>
     * <p>
     * Request templates take the incoming request after a GraphQL operation is parsed and convert it into a request
     * configuration for the selected data source operation. Response templates interpret responses from the data source
     * and map it to the shape of the GraphQL field output type.
     * </p>
     * <p>
     * Mapping templates are written in the Apache Velocity Template Language (VTL).
     * </p>
     * 
     * @param evaluateMappingTemplateRequest
     * @return A Java Future containing the result of the EvaluateMappingTemplate operation returned by the service.
     * @sample AWSAppSyncAsync.EvaluateMappingTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/EvaluateMappingTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EvaluateMappingTemplateResult> evaluateMappingTemplateAsync(EvaluateMappingTemplateRequest evaluateMappingTemplateRequest);

    /**
     * <p>
     * Evaluates a given template and returns the response. The mapping template can be a request or response template.
     * </p>
     * <p>
     * Request templates take the incoming request after a GraphQL operation is parsed and convert it into a request
     * configuration for the selected data source operation. Response templates interpret responses from the data source
     * and map it to the shape of the GraphQL field output type.
     * </p>
     * <p>
     * Mapping templates are written in the Apache Velocity Template Language (VTL).
     * </p>
     * 
     * @param evaluateMappingTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EvaluateMappingTemplate operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.EvaluateMappingTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/EvaluateMappingTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EvaluateMappingTemplateResult> evaluateMappingTemplateAsync(EvaluateMappingTemplateRequest evaluateMappingTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<EvaluateMappingTemplateRequest, EvaluateMappingTemplateResult> asyncHandler);

    /**
     * <p>
     * Flushes an <code>ApiCache</code> object.
     * </p>
     * 
     * @param flushApiCacheRequest
     *        Represents the input of a <code>FlushApiCache</code> operation.
     * @return A Java Future containing the result of the FlushApiCache operation returned by the service.
     * @sample AWSAppSyncAsync.FlushApiCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/FlushApiCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<FlushApiCacheResult> flushApiCacheAsync(FlushApiCacheRequest flushApiCacheRequest);

    /**
     * <p>
     * Flushes an <code>ApiCache</code> object.
     * </p>
     * 
     * @param flushApiCacheRequest
     *        Represents the input of a <code>FlushApiCache</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FlushApiCache operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.FlushApiCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/FlushApiCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<FlushApiCacheResult> flushApiCacheAsync(FlushApiCacheRequest flushApiCacheRequest,
            com.amazonaws.handlers.AsyncHandler<FlushApiCacheRequest, FlushApiCacheResult> asyncHandler);

    /**
     * <p>
     * Retrieves an <code>ApiAssociation</code> object.
     * </p>
     * 
     * @param getApiAssociationRequest
     * @return A Java Future containing the result of the GetApiAssociation operation returned by the service.
     * @sample AWSAppSyncAsync.GetApiAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetApiAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApiAssociationResult> getApiAssociationAsync(GetApiAssociationRequest getApiAssociationRequest);

    /**
     * <p>
     * Retrieves an <code>ApiAssociation</code> object.
     * </p>
     * 
     * @param getApiAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApiAssociation operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetApiAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetApiAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApiAssociationResult> getApiAssociationAsync(GetApiAssociationRequest getApiAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApiAssociationRequest, GetApiAssociationResult> asyncHandler);

    /**
     * <p>
     * Retrieves an <code>ApiCache</code> object.
     * </p>
     * 
     * @param getApiCacheRequest
     *        Represents the input of a <code>GetApiCache</code> operation.
     * @return A Java Future containing the result of the GetApiCache operation returned by the service.
     * @sample AWSAppSyncAsync.GetApiCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetApiCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApiCacheResult> getApiCacheAsync(GetApiCacheRequest getApiCacheRequest);

    /**
     * <p>
     * Retrieves an <code>ApiCache</code> object.
     * </p>
     * 
     * @param getApiCacheRequest
     *        Represents the input of a <code>GetApiCache</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApiCache operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetApiCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetApiCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApiCacheResult> getApiCacheAsync(GetApiCacheRequest getApiCacheRequest,
            com.amazonaws.handlers.AsyncHandler<GetApiCacheRequest, GetApiCacheResult> asyncHandler);

    /**
     * <p>
     * Retrieves a <code>DataSource</code> object.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return A Java Future containing the result of the GetDataSource operation returned by the service.
     * @sample AWSAppSyncAsync.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Retrieves a <code>DataSource</code> object.
     * </p>
     * 
     * @param getDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSource operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves the record of an existing introspection. If the retrieval is successful, the result of the
     * instrospection will also be returned. If the retrieval fails the operation, an error message will be returned
     * instead.
     * </p>
     * 
     * @param getDataSourceIntrospectionRequest
     * @return A Java Future containing the result of the GetDataSourceIntrospection operation returned by the service.
     * @sample AWSAppSyncAsync.GetDataSourceIntrospection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDataSourceIntrospection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceIntrospectionResult> getDataSourceIntrospectionAsync(
            GetDataSourceIntrospectionRequest getDataSourceIntrospectionRequest);

    /**
     * <p>
     * Retrieves the record of an existing introspection. If the retrieval is successful, the result of the
     * instrospection will also be returned. If the retrieval fails the operation, an error message will be returned
     * instead.
     * </p>
     * 
     * @param getDataSourceIntrospectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSourceIntrospection operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetDataSourceIntrospection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDataSourceIntrospection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceIntrospectionResult> getDataSourceIntrospectionAsync(
            GetDataSourceIntrospectionRequest getDataSourceIntrospectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSourceIntrospectionRequest, GetDataSourceIntrospectionResult> asyncHandler);

    /**
     * <p>
     * Retrieves a custom <code>DomainName</code> object.
     * </p>
     * 
     * @param getDomainNameRequest
     * @return A Java Future containing the result of the GetDomainName operation returned by the service.
     * @sample AWSAppSyncAsync.GetDomainName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDomainName" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(GetDomainNameRequest getDomainNameRequest);

    /**
     * <p>
     * Retrieves a custom <code>DomainName</code> object.
     * </p>
     * 
     * @param getDomainNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainName operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetDomainName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDomainName" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(GetDomainNameRequest getDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainNameRequest, GetDomainNameResult> asyncHandler);

    /**
     * <p>
     * Get a <code>Function</code>.
     * </p>
     * 
     * @param getFunctionRequest
     * @return A Java Future containing the result of the GetFunction operation returned by the service.
     * @sample AWSAppSyncAsync.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest);

    /**
     * <p>
     * Get a <code>Function</code>.
     * </p>
     * 
     * @param getFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunction operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler);

    /**
     * <p>
     * Retrieves a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param getGraphqlApiRequest
     * @return A Java Future containing the result of the GetGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsync.GetGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGraphqlApiResult> getGraphqlApiAsync(GetGraphqlApiRequest getGraphqlApiRequest);

    /**
     * <p>
     * Retrieves a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param getGraphqlApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGraphqlApiResult> getGraphqlApiAsync(GetGraphqlApiRequest getGraphqlApiRequest,
            com.amazonaws.handlers.AsyncHandler<GetGraphqlApiRequest, GetGraphqlApiResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of environmental variable key-value pairs associated with an API by its ID value.
     * </p>
     * 
     * @param getGraphqlApiEnvironmentVariablesRequest
     * @return A Java Future containing the result of the GetGraphqlApiEnvironmentVariables operation returned by the
     *         service.
     * @sample AWSAppSyncAsync.GetGraphqlApiEnvironmentVariables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetGraphqlApiEnvironmentVariables"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGraphqlApiEnvironmentVariablesResult> getGraphqlApiEnvironmentVariablesAsync(
            GetGraphqlApiEnvironmentVariablesRequest getGraphqlApiEnvironmentVariablesRequest);

    /**
     * <p>
     * Retrieves the list of environmental variable key-value pairs associated with an API by its ID value.
     * </p>
     * 
     * @param getGraphqlApiEnvironmentVariablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGraphqlApiEnvironmentVariables operation returned by the
     *         service.
     * @sample AWSAppSyncAsyncHandler.GetGraphqlApiEnvironmentVariables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetGraphqlApiEnvironmentVariables"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGraphqlApiEnvironmentVariablesResult> getGraphqlApiEnvironmentVariablesAsync(
            GetGraphqlApiEnvironmentVariablesRequest getGraphqlApiEnvironmentVariablesRequest,
            com.amazonaws.handlers.AsyncHandler<GetGraphqlApiEnvironmentVariablesRequest, GetGraphqlApiEnvironmentVariablesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the introspection schema for a GraphQL API.
     * </p>
     * 
     * @param getIntrospectionSchemaRequest
     * @return A Java Future containing the result of the GetIntrospectionSchema operation returned by the service.
     * @sample AWSAppSyncAsync.GetIntrospectionSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetIntrospectionSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIntrospectionSchemaResult> getIntrospectionSchemaAsync(GetIntrospectionSchemaRequest getIntrospectionSchemaRequest);

    /**
     * <p>
     * Retrieves the introspection schema for a GraphQL API.
     * </p>
     * 
     * @param getIntrospectionSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntrospectionSchema operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetIntrospectionSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetIntrospectionSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIntrospectionSchemaResult> getIntrospectionSchemaAsync(GetIntrospectionSchemaRequest getIntrospectionSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntrospectionSchemaRequest, GetIntrospectionSchemaResult> asyncHandler);

    /**
     * <p>
     * Retrieves a <code>Resolver</code> object.
     * </p>
     * 
     * @param getResolverRequest
     * @return A Java Future containing the result of the GetResolver operation returned by the service.
     * @sample AWSAppSyncAsync.GetResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetResolver" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResolverResult> getResolverAsync(GetResolverRequest getResolverRequest);

    /**
     * <p>
     * Retrieves a <code>Resolver</code> object.
     * </p>
     * 
     * @param getResolverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResolver operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetResolver" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResolverResult> getResolverAsync(GetResolverRequest getResolverRequest,
            com.amazonaws.handlers.AsyncHandler<GetResolverRequest, GetResolverResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current status of a schema creation operation.
     * </p>
     * 
     * @param getSchemaCreationStatusRequest
     * @return A Java Future containing the result of the GetSchemaCreationStatus operation returned by the service.
     * @sample AWSAppSyncAsync.GetSchemaCreationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetSchemaCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaCreationStatusResult> getSchemaCreationStatusAsync(GetSchemaCreationStatusRequest getSchemaCreationStatusRequest);

    /**
     * <p>
     * Retrieves the current status of a schema creation operation.
     * </p>
     * 
     * @param getSchemaCreationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSchemaCreationStatus operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetSchemaCreationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetSchemaCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaCreationStatusResult> getSchemaCreationStatusAsync(GetSchemaCreationStatusRequest getSchemaCreationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetSchemaCreationStatusRequest, GetSchemaCreationStatusResult> asyncHandler);

    /**
     * <p>
     * Retrieves a <code>SourceApiAssociation</code> object.
     * </p>
     * 
     * @param getSourceApiAssociationRequest
     * @return A Java Future containing the result of the GetSourceApiAssociation operation returned by the service.
     * @sample AWSAppSyncAsync.GetSourceApiAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetSourceApiAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSourceApiAssociationResult> getSourceApiAssociationAsync(GetSourceApiAssociationRequest getSourceApiAssociationRequest);

    /**
     * <p>
     * Retrieves a <code>SourceApiAssociation</code> object.
     * </p>
     * 
     * @param getSourceApiAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSourceApiAssociation operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetSourceApiAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetSourceApiAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSourceApiAssociationResult> getSourceApiAssociationAsync(GetSourceApiAssociationRequest getSourceApiAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSourceApiAssociationRequest, GetSourceApiAssociationResult> asyncHandler);

    /**
     * <p>
     * Retrieves a <code>Type</code> object.
     * </p>
     * 
     * @param getTypeRequest
     * @return A Java Future containing the result of the GetType operation returned by the service.
     * @sample AWSAppSyncAsync.GetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTypeResult> getTypeAsync(GetTypeRequest getTypeRequest);

    /**
     * <p>
     * Retrieves a <code>Type</code> object.
     * </p>
     * 
     * @param getTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetType operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.GetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTypeResult> getTypeAsync(GetTypeRequest getTypeRequest,
            com.amazonaws.handlers.AsyncHandler<GetTypeRequest, GetTypeResult> asyncHandler);

    /**
     * <p>
     * Lists the API keys for a given API.
     * </p>
     * <note>
     * <p>
     * API keys are deleted automatically 60 days after they expire. However, they may still be included in the response
     * until they have actually been deleted. You can safely call <code>DeleteApiKey</code> to manually delete a key
     * before it's automatically deleted.
     * </p>
     * </note>
     * 
     * @param listApiKeysRequest
     * @return A Java Future containing the result of the ListApiKeys operation returned by the service.
     * @sample AWSAppSyncAsync.ListApiKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListApiKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApiKeysResult> listApiKeysAsync(ListApiKeysRequest listApiKeysRequest);

    /**
     * <p>
     * Lists the API keys for a given API.
     * </p>
     * <note>
     * <p>
     * API keys are deleted automatically 60 days after they expire. However, they may still be included in the response
     * until they have actually been deleted. You can safely call <code>DeleteApiKey</code> to manually delete a key
     * before it's automatically deleted.
     * </p>
     * </note>
     * 
     * @param listApiKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApiKeys operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListApiKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListApiKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApiKeysResult> listApiKeysAsync(ListApiKeysRequest listApiKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListApiKeysRequest, ListApiKeysResult> asyncHandler);

    /**
     * <p>
     * Lists the data sources for a given API.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AWSAppSyncAsync.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * Lists the data sources for a given API.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler);

    /**
     * <p>
     * Lists multiple custom domain names.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @return A Java Future containing the result of the ListDomainNames operation returned by the service.
     * @sample AWSAppSyncAsync.ListDomainNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListDomainNames" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest);

    /**
     * <p>
     * Lists multiple custom domain names.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomainNames operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListDomainNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListDomainNames" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler);

    /**
     * <p>
     * List multiple functions.
     * </p>
     * 
     * @param listFunctionsRequest
     * @return A Java Future containing the result of the ListFunctions operation returned by the service.
     * @sample AWSAppSyncAsync.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest);

    /**
     * <p>
     * List multiple functions.
     * </p>
     * 
     * @param listFunctionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFunctions operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler);

    /**
     * <p>
     * Lists your GraphQL APIs.
     * </p>
     * 
     * @param listGraphqlApisRequest
     * @return A Java Future containing the result of the ListGraphqlApis operation returned by the service.
     * @sample AWSAppSyncAsync.ListGraphqlApis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListGraphqlApis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGraphqlApisResult> listGraphqlApisAsync(ListGraphqlApisRequest listGraphqlApisRequest);

    /**
     * <p>
     * Lists your GraphQL APIs.
     * </p>
     * 
     * @param listGraphqlApisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGraphqlApis operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListGraphqlApis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListGraphqlApis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGraphqlApisResult> listGraphqlApisAsync(ListGraphqlApisRequest listGraphqlApisRequest,
            com.amazonaws.handlers.AsyncHandler<ListGraphqlApisRequest, ListGraphqlApisResult> asyncHandler);

    /**
     * <p>
     * Lists the resolvers for a given API and type.
     * </p>
     * 
     * @param listResolversRequest
     * @return A Java Future containing the result of the ListResolvers operation returned by the service.
     * @sample AWSAppSyncAsync.ListResolvers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListResolvers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResolversResult> listResolversAsync(ListResolversRequest listResolversRequest);

    /**
     * <p>
     * Lists the resolvers for a given API and type.
     * </p>
     * 
     * @param listResolversRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResolvers operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListResolvers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListResolvers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResolversResult> listResolversAsync(ListResolversRequest listResolversRequest,
            com.amazonaws.handlers.AsyncHandler<ListResolversRequest, ListResolversResult> asyncHandler);

    /**
     * <p>
     * List the resolvers that are associated with a specific function.
     * </p>
     * 
     * @param listResolversByFunctionRequest
     * @return A Java Future containing the result of the ListResolversByFunction operation returned by the service.
     * @sample AWSAppSyncAsync.ListResolversByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListResolversByFunction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolversByFunctionResult> listResolversByFunctionAsync(ListResolversByFunctionRequest listResolversByFunctionRequest);

    /**
     * <p>
     * List the resolvers that are associated with a specific function.
     * </p>
     * 
     * @param listResolversByFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResolversByFunction operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListResolversByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListResolversByFunction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolversByFunctionResult> listResolversByFunctionAsync(ListResolversByFunctionRequest listResolversByFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<ListResolversByFunctionRequest, ListResolversByFunctionResult> asyncHandler);

    /**
     * <p>
     * Lists the <code>SourceApiAssociationSummary</code> data.
     * </p>
     * 
     * @param listSourceApiAssociationsRequest
     * @return A Java Future containing the result of the ListSourceApiAssociations operation returned by the service.
     * @sample AWSAppSyncAsync.ListSourceApiAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListSourceApiAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSourceApiAssociationsResult> listSourceApiAssociationsAsync(
            ListSourceApiAssociationsRequest listSourceApiAssociationsRequest);

    /**
     * <p>
     * Lists the <code>SourceApiAssociationSummary</code> data.
     * </p>
     * 
     * @param listSourceApiAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSourceApiAssociations operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListSourceApiAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListSourceApiAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSourceApiAssociationsResult> listSourceApiAssociationsAsync(
            ListSourceApiAssociationsRequest listSourceApiAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSourceApiAssociationsRequest, ListSourceApiAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAppSyncAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the types for a given API.
     * </p>
     * 
     * @param listTypesRequest
     * @return A Java Future containing the result of the ListTypes operation returned by the service.
     * @sample AWSAppSyncAsync.ListTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTypesResult> listTypesAsync(ListTypesRequest listTypesRequest);

    /**
     * <p>
     * Lists the types for a given API.
     * </p>
     * 
     * @param listTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTypes operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTypesResult> listTypesAsync(ListTypesRequest listTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTypesRequest, ListTypesResult> asyncHandler);

    /**
     * <p>
     * Lists <code>Type</code> objects by the source API association ID.
     * </p>
     * 
     * @param listTypesByAssociationRequest
     * @return A Java Future containing the result of the ListTypesByAssociation operation returned by the service.
     * @sample AWSAppSyncAsync.ListTypesByAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListTypesByAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTypesByAssociationResult> listTypesByAssociationAsync(ListTypesByAssociationRequest listTypesByAssociationRequest);

    /**
     * <p>
     * Lists <code>Type</code> objects by the source API association ID.
     * </p>
     * 
     * @param listTypesByAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTypesByAssociation operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.ListTypesByAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListTypesByAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTypesByAssociationResult> listTypesByAssociationAsync(ListTypesByAssociationRequest listTypesByAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<ListTypesByAssociationRequest, ListTypesByAssociationResult> asyncHandler);

    /**
     * <p>
     * Creates a list of environmental variables in an API by its ID value.
     * </p>
     * <p>
     * When creating an environmental variable, it must follow the constraints below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Both JavaScript and VTL templates support environmental variables.
     * </p>
     * </li>
     * <li>
     * <p>
     * Environmental variables are not evaluated before function invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Environmental variables only support string values.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any defined value in an environmental variable is considered a string literal and not expanded.
     * </p>
     * </li>
     * <li>
     * <p>
     * Variable evaluations should ideally be performed in the function code.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When creating an environmental variable key-value pair, it must follow the additional constraints below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys must begin with a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys must be at least two characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys can only contain letters, numbers, and the underscore character (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values can be up to 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure up to 50 key-value pairs in a GraphQL API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a list of environmental variables by adding it to the <code>environmentVariables</code> payload as
     * a list in the format <code>{"key1":"value1","key2":"value2", …}</code>. Note that each call of the
     * <code>PutGraphqlApiEnvironmentVariables</code> action will result in the overwriting of the existing
     * environmental variable list of that API. This means the existing environmental variables will be lost. To avoid
     * this, you must include all existing and new environmental variables in the list each time you call this action.
     * </p>
     * 
     * @param putGraphqlApiEnvironmentVariablesRequest
     * @return A Java Future containing the result of the PutGraphqlApiEnvironmentVariables operation returned by the
     *         service.
     * @sample AWSAppSyncAsync.PutGraphqlApiEnvironmentVariables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/PutGraphqlApiEnvironmentVariables"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutGraphqlApiEnvironmentVariablesResult> putGraphqlApiEnvironmentVariablesAsync(
            PutGraphqlApiEnvironmentVariablesRequest putGraphqlApiEnvironmentVariablesRequest);

    /**
     * <p>
     * Creates a list of environmental variables in an API by its ID value.
     * </p>
     * <p>
     * When creating an environmental variable, it must follow the constraints below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Both JavaScript and VTL templates support environmental variables.
     * </p>
     * </li>
     * <li>
     * <p>
     * Environmental variables are not evaluated before function invocation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Environmental variables only support string values.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any defined value in an environmental variable is considered a string literal and not expanded.
     * </p>
     * </li>
     * <li>
     * <p>
     * Variable evaluations should ideally be performed in the function code.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When creating an environmental variable key-value pair, it must follow the additional constraints below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys must begin with a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys must be at least two characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys can only contain letters, numbers, and the underscore character (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values can be up to 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure up to 50 key-value pairs in a GraphQL API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a list of environmental variables by adding it to the <code>environmentVariables</code> payload as
     * a list in the format <code>{"key1":"value1","key2":"value2", …}</code>. Note that each call of the
     * <code>PutGraphqlApiEnvironmentVariables</code> action will result in the overwriting of the existing
     * environmental variable list of that API. This means the existing environmental variables will be lost. To avoid
     * this, you must include all existing and new environmental variables in the list each time you call this action.
     * </p>
     * 
     * @param putGraphqlApiEnvironmentVariablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutGraphqlApiEnvironmentVariables operation returned by the
     *         service.
     * @sample AWSAppSyncAsyncHandler.PutGraphqlApiEnvironmentVariables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/PutGraphqlApiEnvironmentVariables"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutGraphqlApiEnvironmentVariablesResult> putGraphqlApiEnvironmentVariablesAsync(
            PutGraphqlApiEnvironmentVariablesRequest putGraphqlApiEnvironmentVariablesRequest,
            com.amazonaws.handlers.AsyncHandler<PutGraphqlApiEnvironmentVariablesRequest, PutGraphqlApiEnvironmentVariablesResult> asyncHandler);

    /**
     * <p>
     * Creates a new introspection. Returns the <code>introspectionId</code> of the new introspection after its
     * creation.
     * </p>
     * 
     * @param startDataSourceIntrospectionRequest
     * @return A Java Future containing the result of the StartDataSourceIntrospection operation returned by the
     *         service.
     * @sample AWSAppSyncAsync.StartDataSourceIntrospection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/StartDataSourceIntrospection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDataSourceIntrospectionResult> startDataSourceIntrospectionAsync(
            StartDataSourceIntrospectionRequest startDataSourceIntrospectionRequest);

    /**
     * <p>
     * Creates a new introspection. Returns the <code>introspectionId</code> of the new introspection after its
     * creation.
     * </p>
     * 
     * @param startDataSourceIntrospectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDataSourceIntrospection operation returned by the
     *         service.
     * @sample AWSAppSyncAsyncHandler.StartDataSourceIntrospection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/StartDataSourceIntrospection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDataSourceIntrospectionResult> startDataSourceIntrospectionAsync(
            StartDataSourceIntrospectionRequest startDataSourceIntrospectionRequest,
            com.amazonaws.handlers.AsyncHandler<StartDataSourceIntrospectionRequest, StartDataSourceIntrospectionResult> asyncHandler);

    /**
     * <p>
     * Adds a new schema to your GraphQL API.
     * </p>
     * <p>
     * This operation is asynchronous. Use to determine when it has completed.
     * </p>
     * 
     * @param startSchemaCreationRequest
     * @return A Java Future containing the result of the StartSchemaCreation operation returned by the service.
     * @sample AWSAppSyncAsync.StartSchemaCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/StartSchemaCreation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartSchemaCreationResult> startSchemaCreationAsync(StartSchemaCreationRequest startSchemaCreationRequest);

    /**
     * <p>
     * Adds a new schema to your GraphQL API.
     * </p>
     * <p>
     * This operation is asynchronous. Use to determine when it has completed.
     * </p>
     * 
     * @param startSchemaCreationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSchemaCreation operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.StartSchemaCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/StartSchemaCreation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartSchemaCreationResult> startSchemaCreationAsync(StartSchemaCreationRequest startSchemaCreationRequest,
            com.amazonaws.handlers.AsyncHandler<StartSchemaCreationRequest, StartSchemaCreationResult> asyncHandler);

    /**
     * <p>
     * Initiates a merge operation. Returns a status that shows the result of the merge operation.
     * </p>
     * 
     * @param startSchemaMergeRequest
     * @return A Java Future containing the result of the StartSchemaMerge operation returned by the service.
     * @sample AWSAppSyncAsync.StartSchemaMerge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/StartSchemaMerge" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartSchemaMergeResult> startSchemaMergeAsync(StartSchemaMergeRequest startSchemaMergeRequest);

    /**
     * <p>
     * Initiates a merge operation. Returns a status that shows the result of the merge operation.
     * </p>
     * 
     * @param startSchemaMergeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSchemaMerge operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.StartSchemaMerge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/StartSchemaMerge" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartSchemaMergeResult> startSchemaMergeAsync(StartSchemaMergeRequest startSchemaMergeRequest,
            com.amazonaws.handlers.AsyncHandler<StartSchemaMergeRequest, StartSchemaMergeResult> asyncHandler);

    /**
     * <p>
     * Tags a resource with user-supplied tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAppSyncAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags a resource with user-supplied tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Untags a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAppSyncAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untags a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the cache for the GraphQL API.
     * </p>
     * 
     * @param updateApiCacheRequest
     *        Represents the input of a <code>UpdateApiCache</code> operation.
     * @return A Java Future containing the result of the UpdateApiCache operation returned by the service.
     * @sample AWSAppSyncAsync.UpdateApiCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateApiCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApiCacheResult> updateApiCacheAsync(UpdateApiCacheRequest updateApiCacheRequest);

    /**
     * <p>
     * Updates the cache for the GraphQL API.
     * </p>
     * 
     * @param updateApiCacheRequest
     *        Represents the input of a <code>UpdateApiCache</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApiCache operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.UpdateApiCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateApiCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApiCacheResult> updateApiCacheAsync(UpdateApiCacheRequest updateApiCacheRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApiCacheRequest, UpdateApiCacheResult> asyncHandler);

    /**
     * <p>
     * Updates an API key. You can update the key as long as it's not deleted.
     * </p>
     * 
     * @param updateApiKeyRequest
     * @return A Java Future containing the result of the UpdateApiKey operation returned by the service.
     * @sample AWSAppSyncAsync.UpdateApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateApiKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(UpdateApiKeyRequest updateApiKeyRequest);

    /**
     * <p>
     * Updates an API key. You can update the key as long as it's not deleted.
     * </p>
     * 
     * @param updateApiKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApiKey operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.UpdateApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateApiKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(UpdateApiKeyRequest updateApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApiKeyRequest, UpdateApiKeyResult> asyncHandler);

    /**
     * <p>
     * Updates a <code>DataSource</code> object.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AWSAppSyncAsync.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates a <code>DataSource</code> object.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Updates a custom <code>DomainName</code> object.
     * </p>
     * 
     * @param updateDomainNameRequest
     * @return A Java Future containing the result of the UpdateDomainName operation returned by the service.
     * @sample AWSAppSyncAsync.UpdateDomainName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateDomainName" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(UpdateDomainNameRequest updateDomainNameRequest);

    /**
     * <p>
     * Updates a custom <code>DomainName</code> object.
     * </p>
     * 
     * @param updateDomainNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainName operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.UpdateDomainName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateDomainName" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(UpdateDomainNameRequest updateDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainNameRequest, UpdateDomainNameResult> asyncHandler);

    /**
     * <p>
     * Updates a <code>Function</code> object.
     * </p>
     * 
     * @param updateFunctionRequest
     * @return A Java Future containing the result of the UpdateFunction operation returned by the service.
     * @sample AWSAppSyncAsync.UpdateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionResult> updateFunctionAsync(UpdateFunctionRequest updateFunctionRequest);

    /**
     * <p>
     * Updates a <code>Function</code> object.
     * </p>
     * 
     * @param updateFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFunction operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.UpdateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionResult> updateFunctionAsync(UpdateFunctionRequest updateFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionRequest, UpdateFunctionResult> asyncHandler);

    /**
     * <p>
     * Updates a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param updateGraphqlApiRequest
     * @return A Java Future containing the result of the UpdateGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsync.UpdateGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGraphqlApiResult> updateGraphqlApiAsync(UpdateGraphqlApiRequest updateGraphqlApiRequest);

    /**
     * <p>
     * Updates a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param updateGraphqlApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGraphqlApi operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.UpdateGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGraphqlApiResult> updateGraphqlApiAsync(UpdateGraphqlApiRequest updateGraphqlApiRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGraphqlApiRequest, UpdateGraphqlApiResult> asyncHandler);

    /**
     * <p>
     * Updates a <code>Resolver</code> object.
     * </p>
     * 
     * @param updateResolverRequest
     * @return A Java Future containing the result of the UpdateResolver operation returned by the service.
     * @sample AWSAppSyncAsync.UpdateResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateResolver" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateResolverResult> updateResolverAsync(UpdateResolverRequest updateResolverRequest);

    /**
     * <p>
     * Updates a <code>Resolver</code> object.
     * </p>
     * 
     * @param updateResolverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResolver operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.UpdateResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateResolver" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateResolverResult> updateResolverAsync(UpdateResolverRequest updateResolverRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResolverRequest, UpdateResolverResult> asyncHandler);

    /**
     * <p>
     * Updates some of the configuration choices of a particular source API association.
     * </p>
     * 
     * @param updateSourceApiAssociationRequest
     * @return A Java Future containing the result of the UpdateSourceApiAssociation operation returned by the service.
     * @sample AWSAppSyncAsync.UpdateSourceApiAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateSourceApiAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSourceApiAssociationResult> updateSourceApiAssociationAsync(
            UpdateSourceApiAssociationRequest updateSourceApiAssociationRequest);

    /**
     * <p>
     * Updates some of the configuration choices of a particular source API association.
     * </p>
     * 
     * @param updateSourceApiAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSourceApiAssociation operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.UpdateSourceApiAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateSourceApiAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSourceApiAssociationResult> updateSourceApiAssociationAsync(
            UpdateSourceApiAssociationRequest updateSourceApiAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSourceApiAssociationRequest, UpdateSourceApiAssociationResult> asyncHandler);

    /**
     * <p>
     * Updates a <code>Type</code> object.
     * </p>
     * 
     * @param updateTypeRequest
     * @return A Java Future containing the result of the UpdateType operation returned by the service.
     * @sample AWSAppSyncAsync.UpdateType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTypeResult> updateTypeAsync(UpdateTypeRequest updateTypeRequest);

    /**
     * <p>
     * Updates a <code>Type</code> object.
     * </p>
     * 
     * @param updateTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateType operation returned by the service.
     * @sample AWSAppSyncAsyncHandler.UpdateType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTypeResult> updateTypeAsync(UpdateTypeRequest updateTypeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTypeRequest, UpdateTypeResult> asyncHandler);

}
