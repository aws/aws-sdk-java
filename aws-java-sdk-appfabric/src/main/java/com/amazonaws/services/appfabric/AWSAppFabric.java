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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appfabric.model.*;

/**
 * Interface for accessing AppFabric.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appfabric.AbstractAWSAppFabric} instead.
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
public interface AWSAppFabric {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "appfabric";

    /**
     * <p>
     * Gets user access details in a batch request.
     * </p>
     * <p>
     * This action polls data from the tasks that are kicked off by the <code>StartUserAccessTasks</code> action.
     * </p>
     * 
     * @param batchGetUserAccessTasksRequest
     * @return Result of the BatchGetUserAccessTasks operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.BatchGetUserAccessTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/BatchGetUserAccessTasks"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetUserAccessTasksResult batchGetUserAccessTasks(BatchGetUserAccessTasksRequest batchGetUserAccessTasksRequest);

    /**
     * <p>
     * Establishes a connection between Amazon Web Services AppFabric and an application, which allows AppFabric to call
     * the APIs of the application.
     * </p>
     * 
     * @param connectAppAuthorizationRequest
     * @return Result of the ConnectAppAuthorization operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ConnectAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ConnectAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    ConnectAppAuthorizationResult connectAppAuthorization(ConnectAppAuthorizationRequest connectAppAuthorizationRequest);

    /**
     * <p>
     * Creates an app authorization within an app bundle, which allows AppFabric to connect to an application.
     * </p>
     * 
     * @param createAppAuthorizationRequest
     * @return Result of the CreateAppAuthorization operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.CreateAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAppAuthorizationResult createAppAuthorization(CreateAppAuthorizationRequest createAppAuthorizationRequest);

    /**
     * <p>
     * Creates an app bundle to collect data from an application using AppFabric.
     * </p>
     * 
     * @param createAppBundleRequest
     * @return Result of the CreateAppBundle operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.CreateAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAppBundleResult createAppBundle(CreateAppBundleRequest createAppBundleRequest);

    /**
     * <p>
     * Creates a data ingestion for an application.
     * </p>
     * 
     * @param createIngestionRequest
     * @return Result of the CreateIngestion operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.CreateIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIngestionResult createIngestion(CreateIngestionRequest createIngestionRequest);

    /**
     * <p>
     * Creates an ingestion destination, which specifies how an application's ingested data is processed by Amazon Web
     * Services AppFabric and where it's delivered.
     * </p>
     * 
     * @param createIngestionDestinationRequest
     * @return Result of the CreateIngestionDestination operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.CreateIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    CreateIngestionDestinationResult createIngestionDestination(CreateIngestionDestinationRequest createIngestionDestinationRequest);

    /**
     * <p>
     * Deletes an app authorization. You must delete the associated ingestion before you can delete an app
     * authorization.
     * </p>
     * 
     * @param deleteAppAuthorizationRequest
     * @return Result of the DeleteAppAuthorization operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.DeleteAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppAuthorizationResult deleteAppAuthorization(DeleteAppAuthorizationRequest deleteAppAuthorizationRequest);

    /**
     * <p>
     * Deletes an app bundle. You must delete all associated app authorizations before you can delete an app bundle.
     * </p>
     * 
     * @param deleteAppBundleRequest
     * @return Result of the DeleteAppBundle operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.DeleteAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppBundleResult deleteAppBundle(DeleteAppBundleRequest deleteAppBundleRequest);

    /**
     * <p>
     * Deletes an ingestion. You must stop (disable) the ingestion and you must delete all associated ingestion
     * destinations before you can delete an app ingestion.
     * </p>
     * 
     * @param deleteIngestionRequest
     * @return Result of the DeleteIngestion operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.DeleteIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIngestionResult deleteIngestion(DeleteIngestionRequest deleteIngestionRequest);

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
     * @return Result of the DeleteIngestionDestination operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.DeleteIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DeleteIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIngestionDestinationResult deleteIngestionDestination(DeleteIngestionDestinationRequest deleteIngestionDestinationRequest);

    /**
     * <p>
     * Returns information about an app authorization.
     * </p>
     * 
     * @param getAppAuthorizationRequest
     * @return Result of the GetAppAuthorization operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.GetAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetAppAuthorization" target="_top">AWS
     *      API Documentation</a>
     */
    GetAppAuthorizationResult getAppAuthorization(GetAppAuthorizationRequest getAppAuthorizationRequest);

    /**
     * <p>
     * Returns information about an app bundle.
     * </p>
     * 
     * @param getAppBundleRequest
     * @return Result of the GetAppBundle operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.GetAppBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetAppBundle" target="_top">AWS API
     *      Documentation</a>
     */
    GetAppBundleResult getAppBundle(GetAppBundleRequest getAppBundleRequest);

    /**
     * <p>
     * Returns information about an ingestion.
     * </p>
     * 
     * @param getIngestionRequest
     * @return Result of the GetIngestion operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.GetIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    GetIngestionResult getIngestion(GetIngestionRequest getIngestionRequest);

    /**
     * <p>
     * Returns information about an ingestion destination.
     * </p>
     * 
     * @param getIngestionDestinationRequest
     * @return Result of the GetIngestionDestination operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.GetIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    GetIngestionDestinationResult getIngestionDestination(GetIngestionDestinationRequest getIngestionDestinationRequest);

    /**
     * <p>
     * Returns a list of all app authorizations configured for an app bundle.
     * </p>
     * 
     * @param listAppAuthorizationsRequest
     * @return Result of the ListAppAuthorizations operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ListAppAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListAppAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppAuthorizationsResult listAppAuthorizations(ListAppAuthorizationsRequest listAppAuthorizationsRequest);

    /**
     * <p>
     * Returns a list of app bundles.
     * </p>
     * 
     * @param listAppBundlesRequest
     * @return Result of the ListAppBundles operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ListAppBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListAppBundles" target="_top">AWS API
     *      Documentation</a>
     */
    ListAppBundlesResult listAppBundles(ListAppBundlesRequest listAppBundlesRequest);

    /**
     * <p>
     * Returns a list of all ingestion destinations configured for an ingestion.
     * </p>
     * 
     * @param listIngestionDestinationsRequest
     * @return Result of the ListIngestionDestinations operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ListIngestionDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListIngestionDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    ListIngestionDestinationsResult listIngestionDestinations(ListIngestionDestinationsRequest listIngestionDestinationsRequest);

    /**
     * <p>
     * Returns a list of all ingestions configured for an app bundle.
     * </p>
     * 
     * @param listIngestionsRequest
     * @return Result of the ListIngestions operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ListIngestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListIngestions" target="_top">AWS API
     *      Documentation</a>
     */
    ListIngestionsResult listIngestions(ListIngestionsRequest listIngestionsRequest);

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts (enables) an ingestion, which collects data from an application.
     * </p>
     * 
     * @param startIngestionRequest
     * @return Result of the StartIngestion operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.StartIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StartIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    StartIngestionResult startIngestion(StartIngestionRequest startIngestionRequest);

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
     * @return Result of the StartUserAccessTasks operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.StartUserAccessTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StartUserAccessTasks" target="_top">AWS
     *      API Documentation</a>
     */
    StartUserAccessTasksResult startUserAccessTasks(StartUserAccessTasksRequest startUserAccessTasksRequest);

    /**
     * <p>
     * Stops (disables) an ingestion.
     * </p>
     * 
     * @param stopIngestionRequest
     * @return Result of the StopIngestion operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.StopIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/StopIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    StopIngestionResult stopIngestion(StopIngestionRequest stopIngestionRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateAppAuthorization operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.UpdateAppAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UpdateAppAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAppAuthorizationResult updateAppAuthorization(UpdateAppAuthorizationRequest updateAppAuthorizationRequest);

    /**
     * <p>
     * Updates an ingestion destination, which specifies how an application's ingested data is processed by Amazon Web
     * Services AppFabric and where it's delivered.
     * </p>
     * 
     * @param updateIngestionDestinationRequest
     * @return Result of the UpdateIngestionDestination operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request rate exceeds the limit.
     * @throws ConflictException
     *         The request has created a conflict. Check the request parameters and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppFabric.UpdateIngestionDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UpdateIngestionDestination"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIngestionDestinationResult updateIngestionDestination(UpdateIngestionDestinationRequest updateIngestionDestinationRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
