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
 * AWS AppSync provides API actions for creating and interacting with data sources using GraphQL from your application.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppSyncAsync extends AWSAppSync {

    /**
     * <p>
     * Creates a unique key that you can distribute to clients who are executing your API.
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
     * Creates a unique key that you can distribute to clients who are executing your API.
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
     * Creates a <code>Function</code> object.
     * </p>
     * <p>
     * A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
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
     * A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
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
     * A resolver converts incoming requests into a format that a data source can understand and converts the data
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
     * A resolver converts incoming requests into a format that a data source can understand and converts the data
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
     * API keys are deleted automatically sometime after they expire. However, they may still be included in the
     * response until they have actually been deleted. You can safely call <code>DeleteApiKey</code> to manually delete
     * a key before it's automatically deleted.
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
     * API keys are deleted automatically sometime after they expire. However, they may still be included in the
     * response until they have actually been deleted. You can safely call <code>DeleteApiKey</code> to manually delete
     * a key before it's automatically deleted.
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
     * Updates an API key.
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
     * Updates an API key.
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
