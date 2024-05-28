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
package com.amazonaws.services.appfabric;

import javax.annotation.Generated;

import com.amazonaws.services.appfabric.model.*;

/**
 * Interface for accessing AppFabric asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appfabric.AbstractAWSAppFabricAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services AppFabric quickly connects software as a service (SaaS) applications across your organization.
 * This allows IT and security teams to easily manage and secure applications using a standard schema, and employees can
 * complete everyday tasks faster using generative artificial intelligence (AI). You can use these APIs to complete
 * AppFabric tasks, such as setting up audit log ingestions or viewing user access. For more information about
 * AppFabric, including the required permissions to use the service, see the <a
 * href="https://docs.aws.amazon.com/appfabric/latest/adminguide/">Amazon Web Services AppFabric Administration
 * Guide</a>. For more information about using the Command Line Interface (CLI) to manage your AppFabric resources, see
 * the <a href="https://docs.aws.amazon.com/cli/latest/reference/appfabric/index.html">AppFabric section of the CLI
 * Reference</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppFabricAsync extends AWSAppFabric {

    /**
     * <p>
     * Gets user access details in a batch request.
     * </p>
     * <p>
     * This action polls data from the tasks that are kicked off by the <code>StartUserAccessTasks</code> action.
     * </p>
     * 
     * @param batchGetUserAccessTasksRequest
     * @return A Java Future containing the result of the BatchGetUserAccessTasks operation returned by the service.
     * @sample AWSAppFabricAsync.BatchGetUserAccessTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/BatchGetUserAccessTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetUserAccessTasksResult> batchGetUserAccessTasksAsync(BatchGetUserAccessTasksRequest batchGetUserAccessTasksRequest);

    /**
     * <p>
     * Gets user access details in a batch request.
     * </p>
     * <p>
     * This action polls data from the tasks that are kicked off by the <code>StartUserAccessTasks</code> action.
     * </p>
     * 
     * @param batchGetUserAccessTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetUserAccessTasks operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.BatchGetUserAccessTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/BatchGetUserAccessTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetUserAccessTasksResult> batchGetUserAccessTasksAsync(BatchGetUserAccessTasksRequest batchGetUserAccessTasksRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetUserAccessTasksRequest, BatchGetUserAccessTasksResult> asyncHandler);

    /**
     * <p>
     * Establishes a connection between Amazon Web Services AppFabric and an application, which allows AppFabric to call
     * the APIs of the application.
     * </p>
     * 
     * @param connectAppAuthorizationRequest
     * @return A Java Future containing the result of the ConnectAppAuthorization operation returned by the service.
     * @sample AWSAppFabricAsync.ConnectAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ConnectAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConnectAppAuthorizationResult> connectAppAuthorizationAsync(ConnectAppAuthorizationRequest connectAppAuthorizationRequest);

    /**
     * <p>
     * Establishes a connection between Amazon Web Services AppFabric and an application, which allows AppFabric to call
     * the APIs of the application.
     * </p>
     * 
     * @param connectAppAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConnectAppAuthorization operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.ConnectAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ConnectAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConnectAppAuthorizationResult> connectAppAuthorizationAsync(ConnectAppAuthorizationRequest connectAppAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<ConnectAppAuthorizationRequest, ConnectAppAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Creates an app authorization within an app bundle, which allows AppFabric to connect to an application.
     * </p>
     * 
     * @param createAppAuthorizationRequest
     * @return A Java Future containing the result of the CreateAppAuthorization operation returned by the service.
     * @sample AWSAppFabricAsync.CreateAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppAuthorizationResult> createAppAuthorizationAsync(CreateAppAuthorizationRequest createAppAuthorizationRequest);

    /**
     * <p>
     * Creates an app authorization within an app bundle, which allows AppFabric to connect to an application.
     * </p>
     * 
     * @param createAppAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppAuthorization operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.CreateAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppAuthorizationResult> createAppAuthorizationAsync(CreateAppAuthorizationRequest createAppAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppAuthorizationRequest, CreateAppAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Creates an app bundle to collect data from an application using AppFabric.
     * </p>
     * 
     * @param createAppBundleRequest
     * @return A Java Future containing the result of the CreateAppBundle operation returned by the service.
     * @sample AWSAppFabricAsync.CreateAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppBundleResult> createAppBundleAsync(CreateAppBundleRequest createAppBundleRequest);

    /**
     * <p>
     * Creates an app bundle to collect data from an application using AppFabric.
     * </p>
     * 
     * @param createAppBundleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppBundle operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.CreateAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppBundleResult> createAppBundleAsync(CreateAppBundleRequest createAppBundleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppBundleRequest, CreateAppBundleResult> asyncHandler);

    /**
     * <p>
     * Creates a data ingestion for an application.
     * </p>
     * 
     * @param createIngestionRequest
     * @return A Java Future containing the result of the CreateIngestion operation returned by the service.
     * @sample AWSAppFabricAsync.CreateIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIngestionResult> createIngestionAsync(CreateIngestionRequest createIngestionRequest);

    /**
     * <p>
     * Creates a data ingestion for an application.
     * </p>
     * 
     * @param createIngestionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIngestion operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.CreateIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIngestionResult> createIngestionAsync(CreateIngestionRequest createIngestionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIngestionRequest, CreateIngestionResult> asyncHandler);

    /**
     * <p>
     * Creates an ingestion destination, which specifies how an application's ingested data is processed by Amazon Web
     * Services AppFabric and where it's delivered.
     * </p>
     * 
     * @param createIngestionDestinationRequest
     * @return A Java Future containing the result of the CreateIngestionDestination operation returned by the service.
     * @sample AWSAppFabricAsync.CreateIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIngestionDestinationResult> createIngestionDestinationAsync(
            CreateIngestionDestinationRequest createIngestionDestinationRequest);

    /**
     * <p>
     * Creates an ingestion destination, which specifies how an application's ingested data is processed by Amazon Web
     * Services AppFabric and where it's delivered.
     * </p>
     * 
     * @param createIngestionDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIngestionDestination operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.CreateIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIngestionDestinationResult> createIngestionDestinationAsync(
            CreateIngestionDestinationRequest createIngestionDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIngestionDestinationRequest, CreateIngestionDestinationResult> asyncHandler);

    /**
     * <p>
     * Deletes an app authorization. You must delete the associated ingestion before you can delete an app
     * authorization.
     * </p>
     * 
     * @param deleteAppAuthorizationRequest
     * @return A Java Future containing the result of the DeleteAppAuthorization operation returned by the service.
     * @sample AWSAppFabricAsync.DeleteAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppAuthorizationResult> deleteAppAuthorizationAsync(DeleteAppAuthorizationRequest deleteAppAuthorizationRequest);

    /**
     * <p>
     * Deletes an app authorization. You must delete the associated ingestion before you can delete an app
     * authorization.
     * </p>
     * 
     * @param deleteAppAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppAuthorization operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.DeleteAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppAuthorizationResult> deleteAppAuthorizationAsync(DeleteAppAuthorizationRequest deleteAppAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppAuthorizationRequest, DeleteAppAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Deletes an app bundle. You must delete all associated app authorizations before you can delete an app bundle.
     * </p>
     * 
     * @param deleteAppBundleRequest
     * @return A Java Future containing the result of the DeleteAppBundle operation returned by the service.
     * @sample AWSAppFabricAsync.DeleteAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppBundleResult> deleteAppBundleAsync(DeleteAppBundleRequest deleteAppBundleRequest);

    /**
     * <p>
     * Deletes an app bundle. You must delete all associated app authorizations before you can delete an app bundle.
     * </p>
     * 
     * @param deleteAppBundleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppBundle operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.DeleteAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppBundleResult> deleteAppBundleAsync(DeleteAppBundleRequest deleteAppBundleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppBundleRequest, DeleteAppBundleResult> asyncHandler);

    /**
     * <p>
     * Deletes an ingestion. You must stop (disable) the ingestion and you must delete all associated ingestion
     * destinations before you can delete an app ingestion.
     * </p>
     * 
     * @param deleteIngestionRequest
     * @return A Java Future containing the result of the DeleteIngestion operation returned by the service.
     * @sample AWSAppFabricAsync.DeleteIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIngestionResult> deleteIngestionAsync(DeleteIngestionRequest deleteIngestionRequest);

    /**
     * <p>
     * Deletes an ingestion. You must stop (disable) the ingestion and you must delete all associated ingestion
     * destinations before you can delete an app ingestion.
     * </p>
     * 
     * @param deleteIngestionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIngestion operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.DeleteIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIngestionResult> deleteIngestionAsync(DeleteIngestionRequest deleteIngestionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIngestionRequest, DeleteIngestionResult> asyncHandler);

    /**
     * <p>
     * Deletes an ingestion destination.
     * </p>
     * <p>
     * This deletes the association between an ingestion and it's destination. It doesn't delete previously ingested
     * data or the storage destination, such as the Amazon S3 bucket where the data is delivered. If the ingestion
     * destination is deleted while the associated ingestion is enabled, the ingestion will fail and is eventually
     * disabled.
     * </p>
     * 
     * @param deleteIngestionDestinationRequest
     * @return A Java Future containing the result of the DeleteIngestionDestination operation returned by the service.
     * @sample AWSAppFabricAsync.DeleteIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIngestionDestinationResult> deleteIngestionDestinationAsync(
            DeleteIngestionDestinationRequest deleteIngestionDestinationRequest);

    /**
     * <p>
     * Deletes an ingestion destination.
     * </p>
     * <p>
     * This deletes the association between an ingestion and it's destination. It doesn't delete previously ingested
     * data or the storage destination, such as the Amazon S3 bucket where the data is delivered. If the ingestion
     * destination is deleted while the associated ingestion is enabled, the ingestion will fail and is eventually
     * disabled.
     * </p>
     * 
     * @param deleteIngestionDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIngestionDestination operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.DeleteIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIngestionDestinationResult> deleteIngestionDestinationAsync(
            DeleteIngestionDestinationRequest deleteIngestionDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIngestionDestinationRequest, DeleteIngestionDestinationResult> asyncHandler);

    /**
     * <p>
     * Returns information about an app authorization.
     * </p>
     * 
     * @param getAppAuthorizationRequest
     * @return A Java Future containing the result of the GetAppAuthorization operation returned by the service.
     * @sample AWSAppFabricAsync.GetAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetAppAuthorization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAppAuthorizationResult> getAppAuthorizationAsync(GetAppAuthorizationRequest getAppAuthorizationRequest);

    /**
     * <p>
     * Returns information about an app authorization.
     * </p>
     * 
     * @param getAppAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppAuthorization operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.GetAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetAppAuthorization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAppAuthorizationResult> getAppAuthorizationAsync(GetAppAuthorizationRequest getAppAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppAuthorizationRequest, GetAppAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Returns information about an app bundle.
     * </p>
     * 
     * @param getAppBundleRequest
     * @return A Java Future containing the result of the GetAppBundle operation returned by the service.
     * @sample AWSAppFabricAsync.GetAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppBundleResult> getAppBundleAsync(GetAppBundleRequest getAppBundleRequest);

    /**
     * <p>
     * Returns information about an app bundle.
     * </p>
     * 
     * @param getAppBundleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppBundle operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.GetAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppBundleResult> getAppBundleAsync(GetAppBundleRequest getAppBundleRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppBundleRequest, GetAppBundleResult> asyncHandler);

    /**
     * <p>
     * Returns information about an ingestion.
     * </p>
     * 
     * @param getIngestionRequest
     * @return A Java Future containing the result of the GetIngestion operation returned by the service.
     * @sample AWSAppFabricAsync.GetIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIngestionResult> getIngestionAsync(GetIngestionRequest getIngestionRequest);

    /**
     * <p>
     * Returns information about an ingestion.
     * </p>
     * 
     * @param getIngestionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIngestion operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.GetIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIngestionResult> getIngestionAsync(GetIngestionRequest getIngestionRequest,
            com.amazonaws.handlers.AsyncHandler<GetIngestionRequest, GetIngestionResult> asyncHandler);

    /**
     * <p>
     * Returns information about an ingestion destination.
     * </p>
     * 
     * @param getIngestionDestinationRequest
     * @return A Java Future containing the result of the GetIngestionDestination operation returned by the service.
     * @sample AWSAppFabricAsync.GetIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIngestionDestinationResult> getIngestionDestinationAsync(GetIngestionDestinationRequest getIngestionDestinationRequest);

    /**
     * <p>
     * Returns information about an ingestion destination.
     * </p>
     * 
     * @param getIngestionDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIngestionDestination operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.GetIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIngestionDestinationResult> getIngestionDestinationAsync(GetIngestionDestinationRequest getIngestionDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<GetIngestionDestinationRequest, GetIngestionDestinationResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all app authorizations configured for an app bundle.
     * </p>
     * 
     * @param listAppAuthorizationsRequest
     * @return A Java Future containing the result of the ListAppAuthorizations operation returned by the service.
     * @sample AWSAppFabricAsync.ListAppAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListAppAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppAuthorizationsResult> listAppAuthorizationsAsync(ListAppAuthorizationsRequest listAppAuthorizationsRequest);

    /**
     * <p>
     * Returns a list of all app authorizations configured for an app bundle.
     * </p>
     * 
     * @param listAppAuthorizationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppAuthorizations operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.ListAppAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListAppAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppAuthorizationsResult> listAppAuthorizationsAsync(ListAppAuthorizationsRequest listAppAuthorizationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppAuthorizationsRequest, ListAppAuthorizationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of app bundles.
     * </p>
     * 
     * @param listAppBundlesRequest
     * @return A Java Future containing the result of the ListAppBundles operation returned by the service.
     * @sample AWSAppFabricAsync.ListAppBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListAppBundles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppBundlesResult> listAppBundlesAsync(ListAppBundlesRequest listAppBundlesRequest);

    /**
     * <p>
     * Returns a list of app bundles.
     * </p>
     * 
     * @param listAppBundlesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppBundles operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.ListAppBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListAppBundles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppBundlesResult> listAppBundlesAsync(ListAppBundlesRequest listAppBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppBundlesRequest, ListAppBundlesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all ingestion destinations configured for an ingestion.
     * </p>
     * 
     * @param listIngestionDestinationsRequest
     * @return A Java Future containing the result of the ListIngestionDestinations operation returned by the service.
     * @sample AWSAppFabricAsync.ListIngestionDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListIngestionDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIngestionDestinationsResult> listIngestionDestinationsAsync(
            ListIngestionDestinationsRequest listIngestionDestinationsRequest);

    /**
     * <p>
     * Returns a list of all ingestion destinations configured for an ingestion.
     * </p>
     * 
     * @param listIngestionDestinationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIngestionDestinations operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.ListIngestionDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListIngestionDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIngestionDestinationsResult> listIngestionDestinationsAsync(
            ListIngestionDestinationsRequest listIngestionDestinationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIngestionDestinationsRequest, ListIngestionDestinationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all ingestions configured for an app bundle.
     * </p>
     * 
     * @param listIngestionsRequest
     * @return A Java Future containing the result of the ListIngestions operation returned by the service.
     * @sample AWSAppFabricAsync.ListIngestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListIngestions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIngestionsResult> listIngestionsAsync(ListIngestionsRequest listIngestionsRequest);

    /**
     * <p>
     * Returns a list of all ingestions configured for an app bundle.
     * </p>
     * 
     * @param listIngestionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIngestions operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.ListIngestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListIngestions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIngestionsResult> listIngestionsAsync(ListIngestionsRequest listIngestionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIngestionsRequest, ListIngestionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAppFabricAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts (enables) an ingestion, which collects data from an application.
     * </p>
     * 
     * @param startIngestionRequest
     * @return A Java Future containing the result of the StartIngestion operation returned by the service.
     * @sample AWSAppFabricAsync.StartIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StartIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartIngestionResult> startIngestionAsync(StartIngestionRequest startIngestionRequest);

    /**
     * <p>
     * Starts (enables) an ingestion, which collects data from an application.
     * </p>
     * 
     * @param startIngestionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartIngestion operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.StartIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StartIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartIngestionResult> startIngestionAsync(StartIngestionRequest startIngestionRequest,
            com.amazonaws.handlers.AsyncHandler<StartIngestionRequest, StartIngestionResult> asyncHandler);

    /**
     * <p>
     * Starts the tasks to search user access status for a specific email address.
     * </p>
     * <p>
     * The tasks are stopped when the user access status data is found. The tasks are terminated when the API calls to
     * the application time out.
     * </p>
     * 
     * @param startUserAccessTasksRequest
     * @return A Java Future containing the result of the StartUserAccessTasks operation returned by the service.
     * @sample AWSAppFabricAsync.StartUserAccessTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StartUserAccessTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartUserAccessTasksResult> startUserAccessTasksAsync(StartUserAccessTasksRequest startUserAccessTasksRequest);

    /**
     * <p>
     * Starts the tasks to search user access status for a specific email address.
     * </p>
     * <p>
     * The tasks are stopped when the user access status data is found. The tasks are terminated when the API calls to
     * the application time out.
     * </p>
     * 
     * @param startUserAccessTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartUserAccessTasks operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.StartUserAccessTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StartUserAccessTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartUserAccessTasksResult> startUserAccessTasksAsync(StartUserAccessTasksRequest startUserAccessTasksRequest,
            com.amazonaws.handlers.AsyncHandler<StartUserAccessTasksRequest, StartUserAccessTasksResult> asyncHandler);

    /**
     * <p>
     * Stops (disables) an ingestion.
     * </p>
     * 
     * @param stopIngestionRequest
     * @return A Java Future containing the result of the StopIngestion operation returned by the service.
     * @sample AWSAppFabricAsync.StopIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StopIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopIngestionResult> stopIngestionAsync(StopIngestionRequest stopIngestionRequest);

    /**
     * <p>
     * Stops (disables) an ingestion.
     * </p>
     * 
     * @param stopIngestionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopIngestion operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.StopIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StopIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopIngestionResult> stopIngestionAsync(StopIngestionRequest stopIngestionRequest,
            com.amazonaws.handlers.AsyncHandler<StopIngestionRequest, StopIngestionResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAppFabricAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAppFabricAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an app authorization within an app bundle, which allows AppFabric to connect to an application.
     * </p>
     * <p>
     * If the app authorization was in a <code>connected</code> state, updating the app authorization will set it back
     * to a <code>PendingConnect</code> state.
     * </p>
     * 
     * @param updateAppAuthorizationRequest
     * @return A Java Future containing the result of the UpdateAppAuthorization operation returned by the service.
     * @sample AWSAppFabricAsync.UpdateAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UpdateAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppAuthorizationResult> updateAppAuthorizationAsync(UpdateAppAuthorizationRequest updateAppAuthorizationRequest);

    /**
     * <p>
     * Updates an app authorization within an app bundle, which allows AppFabric to connect to an application.
     * </p>
     * <p>
     * If the app authorization was in a <code>connected</code> state, updating the app authorization will set it back
     * to a <code>PendingConnect</code> state.
     * </p>
     * 
     * @param updateAppAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppAuthorization operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.UpdateAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UpdateAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppAuthorizationResult> updateAppAuthorizationAsync(UpdateAppAuthorizationRequest updateAppAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppAuthorizationRequest, UpdateAppAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Updates an ingestion destination, which specifies how an application's ingested data is processed by Amazon Web
     * Services AppFabric and where it's delivered.
     * </p>
     * 
     * @param updateIngestionDestinationRequest
     * @return A Java Future containing the result of the UpdateIngestionDestination operation returned by the service.
     * @sample AWSAppFabricAsync.UpdateIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UpdateIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIngestionDestinationResult> updateIngestionDestinationAsync(
            UpdateIngestionDestinationRequest updateIngestionDestinationRequest);

    /**
     * <p>
     * Updates an ingestion destination, which specifies how an application's ingested data is processed by Amazon Web
     * Services AppFabric and where it's delivered.
     * </p>
     * 
     * @param updateIngestionDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIngestionDestination operation returned by the service.
     * @sample AWSAppFabricAsyncHandler.UpdateIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UpdateIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIngestionDestinationResult> updateIngestionDestinationAsync(
            UpdateIngestionDestinationRequest updateIngestionDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIngestionDestinationRequest, UpdateIngestionDestinationResult> asyncHandler);

}
