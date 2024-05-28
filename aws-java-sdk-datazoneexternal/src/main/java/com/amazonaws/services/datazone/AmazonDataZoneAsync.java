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
package com.amazonaws.services.datazone;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;

/**
 * Interface for accessing Amazon DataZone asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.datazone.AbstractAmazonDataZoneAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon DataZone is a data management service that enables you to catalog, discover, govern, share, and analyze your
 * data. With Amazon DataZone, you can share and access your data across accounts and supported regions. Amazon DataZone
 * simplifies your experience across Amazon Web Services services, including, but not limited to, Amazon Redshift,
 * Amazon Athena, Amazon Web Services Glue, and Amazon Web Services Lake Formation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDataZoneAsync extends AmazonDataZone {

    /**
     * <p>
     * Accepts automatically generated business-friendly metadata for your Amazon DataZone assets.
     * </p>
     * 
     * @param acceptPredictionsRequest
     * @return A Java Future containing the result of the AcceptPredictions operation returned by the service.
     * @sample AmazonDataZoneAsync.AcceptPredictions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptPredictions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptPredictionsResult> acceptPredictionsAsync(AcceptPredictionsRequest acceptPredictionsRequest);

    /**
     * <p>
     * Accepts automatically generated business-friendly metadata for your Amazon DataZone assets.
     * </p>
     * 
     * @param acceptPredictionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptPredictions operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.AcceptPredictions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptPredictions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptPredictionsResult> acceptPredictionsAsync(AcceptPredictionsRequest acceptPredictionsRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptPredictionsRequest, AcceptPredictionsResult> asyncHandler);

    /**
     * <p>
     * Accepts a subscription request to a specific asset.
     * </p>
     * 
     * @param acceptSubscriptionRequestRequest
     * @return A Java Future containing the result of the AcceptSubscriptionRequest operation returned by the service.
     * @sample AmazonDataZoneAsync.AcceptSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptSubscriptionRequestResult> acceptSubscriptionRequestAsync(
            AcceptSubscriptionRequestRequest acceptSubscriptionRequestRequest);

    /**
     * <p>
     * Accepts a subscription request to a specific asset.
     * </p>
     * 
     * @param acceptSubscriptionRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptSubscriptionRequest operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.AcceptSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptSubscriptionRequestResult> acceptSubscriptionRequestAsync(
            AcceptSubscriptionRequestRequest acceptSubscriptionRequestRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptSubscriptionRequestRequest, AcceptSubscriptionRequestResult> asyncHandler);

    /**
     * <p>
     * Cancels the metadata generation run.
     * </p>
     * 
     * @param cancelMetadataGenerationRunRequest
     * @return A Java Future containing the result of the CancelMetadataGenerationRun operation returned by the service.
     * @sample AmazonDataZoneAsync.CancelMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CancelMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMetadataGenerationRunResult> cancelMetadataGenerationRunAsync(
            CancelMetadataGenerationRunRequest cancelMetadataGenerationRunRequest);

    /**
     * <p>
     * Cancels the metadata generation run.
     * </p>
     * 
     * @param cancelMetadataGenerationRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelMetadataGenerationRun operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CancelMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CancelMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMetadataGenerationRunResult> cancelMetadataGenerationRunAsync(
            CancelMetadataGenerationRunRequest cancelMetadataGenerationRunRequest,
            com.amazonaws.handlers.AsyncHandler<CancelMetadataGenerationRunRequest, CancelMetadataGenerationRunResult> asyncHandler);

    /**
     * <p>
     * Cancels the subscription to the specified asset.
     * </p>
     * 
     * @param cancelSubscriptionRequest
     * @return A Java Future containing the result of the CancelSubscription operation returned by the service.
     * @sample AmazonDataZoneAsync.CancelSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CancelSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSubscriptionResult> cancelSubscriptionAsync(CancelSubscriptionRequest cancelSubscriptionRequest);

    /**
     * <p>
     * Cancels the subscription to the specified asset.
     * </p>
     * 
     * @param cancelSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelSubscription operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CancelSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CancelSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSubscriptionResult> cancelSubscriptionAsync(CancelSubscriptionRequest cancelSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelSubscriptionRequest, CancelSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates an asset in Amazon DataZone catalog.
     * </p>
     * 
     * @param createAssetRequest
     * @return A Java Future containing the result of the CreateAsset operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetResult> createAssetAsync(CreateAssetRequest createAssetRequest);

    /**
     * <p>
     * Creates an asset in Amazon DataZone catalog.
     * </p>
     * 
     * @param createAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAsset operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetResult> createAssetAsync(CreateAssetRequest createAssetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssetRequest, CreateAssetResult> asyncHandler);

    /**
     * <p>
     * Creates a revision of the asset.
     * </p>
     * 
     * @param createAssetRevisionRequest
     * @return A Java Future containing the result of the CreateAssetRevision operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateAssetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetRevision" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetRevisionResult> createAssetRevisionAsync(CreateAssetRevisionRequest createAssetRevisionRequest);

    /**
     * <p>
     * Creates a revision of the asset.
     * </p>
     * 
     * @param createAssetRevisionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssetRevision operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateAssetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetRevision" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetRevisionResult> createAssetRevisionAsync(CreateAssetRevisionRequest createAssetRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssetRevisionRequest, CreateAssetRevisionResult> asyncHandler);

    /**
     * <p>
     * Creates a custom asset type.
     * </p>
     * 
     * @param createAssetTypeRequest
     * @return A Java Future containing the result of the CreateAssetType operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetTypeResult> createAssetTypeAsync(CreateAssetTypeRequest createAssetTypeRequest);

    /**
     * <p>
     * Creates a custom asset type.
     * </p>
     * 
     * @param createAssetTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssetType operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetTypeResult> createAssetTypeAsync(CreateAssetTypeRequest createAssetTypeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssetTypeRequest, CreateAssetTypeResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon DataZone data source.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Creates an Amazon DataZone data source.
     * </p>
     * 
     * @param createDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon DataZone domain.
     * </p>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates an Amazon DataZone domain.
     * </p>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

    /**
     * <p>
     * Create an Amazon DataZone environment.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Create an Amazon DataZone environment.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon DataZone environment profile.
     * </p>
     * 
     * @param createEnvironmentProfileRequest
     * @return A Java Future containing the result of the CreateEnvironmentProfile operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentProfileResult> createEnvironmentProfileAsync(CreateEnvironmentProfileRequest createEnvironmentProfileRequest);

    /**
     * <p>
     * Creates an Amazon DataZone environment profile.
     * </p>
     * 
     * @param createEnvironmentProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironmentProfile operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentProfileResult> createEnvironmentProfileAsync(CreateEnvironmentProfileRequest createEnvironmentProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentProfileRequest, CreateEnvironmentProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a metadata form type.
     * </p>
     * 
     * @param createFormTypeRequest
     * @return A Java Future containing the result of the CreateFormType operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateFormType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFormTypeResult> createFormTypeAsync(CreateFormTypeRequest createFormTypeRequest);

    /**
     * <p>
     * Creates a metadata form type.
     * </p>
     * 
     * @param createFormTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFormType operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateFormType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFormTypeResult> createFormTypeAsync(CreateFormTypeRequest createFormTypeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFormTypeRequest, CreateFormTypeResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon DataZone business glossary.
     * </p>
     * 
     * @param createGlossaryRequest
     * @return A Java Future containing the result of the CreateGlossary operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGlossaryResult> createGlossaryAsync(CreateGlossaryRequest createGlossaryRequest);

    /**
     * <p>
     * Creates an Amazon DataZone business glossary.
     * </p>
     * 
     * @param createGlossaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGlossary operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGlossaryResult> createGlossaryAsync(CreateGlossaryRequest createGlossaryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGlossaryRequest, CreateGlossaryResult> asyncHandler);

    /**
     * <p>
     * Creates a business glossary term.
     * </p>
     * 
     * @param createGlossaryTermRequest
     * @return A Java Future containing the result of the CreateGlossaryTerm operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGlossaryTermResult> createGlossaryTermAsync(CreateGlossaryTermRequest createGlossaryTermRequest);

    /**
     * <p>
     * Creates a business glossary term.
     * </p>
     * 
     * @param createGlossaryTermRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGlossaryTerm operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGlossaryTermResult> createGlossaryTermAsync(CreateGlossaryTermRequest createGlossaryTermRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGlossaryTermRequest, CreateGlossaryTermResult> asyncHandler);

    /**
     * <p>
     * Creates a group profile in Amazon DataZone.
     * </p>
     * 
     * @param createGroupProfileRequest
     * @return A Java Future containing the result of the CreateGroupProfile operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGroupProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupProfileResult> createGroupProfileAsync(CreateGroupProfileRequest createGroupProfileRequest);

    /**
     * <p>
     * Creates a group profile in Amazon DataZone.
     * </p>
     * 
     * @param createGroupProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroupProfile operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGroupProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupProfileResult> createGroupProfileAsync(CreateGroupProfileRequest createGroupProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupProfileRequest, CreateGroupProfileResult> asyncHandler);

    /**
     * <p>
     * Publishes a listing (a record of an asset at a given time) or removes a listing from the catalog.
     * </p>
     * 
     * @param createListingChangeSetRequest
     * @return A Java Future containing the result of the CreateListingChangeSet operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateListingChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateListingChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateListingChangeSetResult> createListingChangeSetAsync(CreateListingChangeSetRequest createListingChangeSetRequest);

    /**
     * <p>
     * Publishes a listing (a record of an asset at a given time) or removes a listing from the catalog.
     * </p>
     * 
     * @param createListingChangeSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateListingChangeSet operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateListingChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateListingChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateListingChangeSetResult> createListingChangeSetAsync(CreateListingChangeSetRequest createListingChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateListingChangeSetRequest, CreateListingChangeSetResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon DataZone project.
     * </p>
     * 
     * @param createProjectRequest
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates an Amazon DataZone project.
     * </p>
     * 
     * @param createProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Creates a project membership in Amazon DataZone.
     * </p>
     * 
     * @param createProjectMembershipRequest
     * @return A Java Future containing the result of the CreateProjectMembership operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateProjectMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateProjectMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectMembershipResult> createProjectMembershipAsync(CreateProjectMembershipRequest createProjectMembershipRequest);

    /**
     * <p>
     * Creates a project membership in Amazon DataZone.
     * </p>
     * 
     * @param createProjectMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProjectMembership operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateProjectMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateProjectMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectMembershipResult> createProjectMembershipAsync(CreateProjectMembershipRequest createProjectMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectMembershipRequest, CreateProjectMembershipResult> asyncHandler);

    /**
     * <p>
     * Creates a subsscription grant in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionGrantRequest
     * @return A Java Future containing the result of the CreateSubscriptionGrant operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionGrant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionGrantResult> createSubscriptionGrantAsync(CreateSubscriptionGrantRequest createSubscriptionGrantRequest);

    /**
     * <p>
     * Creates a subsscription grant in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscriptionGrant operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionGrant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionGrantResult> createSubscriptionGrantAsync(CreateSubscriptionGrantRequest createSubscriptionGrantRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriptionGrantRequest, CreateSubscriptionGrantResult> asyncHandler);

    /**
     * <p>
     * Creates a subscription request in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionRequestRequest
     * @return A Java Future containing the result of the CreateSubscriptionRequest operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionRequestResult> createSubscriptionRequestAsync(
            CreateSubscriptionRequestRequest createSubscriptionRequestRequest);

    /**
     * <p>
     * Creates a subscription request in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscriptionRequest operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionRequestResult> createSubscriptionRequestAsync(
            CreateSubscriptionRequestRequest createSubscriptionRequestRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriptionRequestRequest, CreateSubscriptionRequestResult> asyncHandler);

    /**
     * <p>
     * Creates a subscription target in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionTargetRequest
     * @return A Java Future containing the result of the CreateSubscriptionTarget operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionTargetResult> createSubscriptionTargetAsync(CreateSubscriptionTargetRequest createSubscriptionTargetRequest);

    /**
     * <p>
     * Creates a subscription target in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscriptionTarget operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionTargetResult> createSubscriptionTargetAsync(CreateSubscriptionTargetRequest createSubscriptionTargetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResult> asyncHandler);

    /**
     * <p>
     * Creates a user profile in Amazon DataZone.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return A Java Future containing the result of the CreateUserProfile operation returned by the service.
     * @sample AmazonDataZoneAsync.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest createUserProfileRequest);

    /**
     * <p>
     * Creates a user profile in Amazon DataZone.
     * </p>
     * 
     * @param createUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserProfile operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest createUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler);

    /**
     * <p>
     * Delets an asset in Amazon DataZone.
     * </p>
     * 
     * @param deleteAssetRequest
     * @return A Java Future containing the result of the DeleteAsset operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest deleteAssetRequest);

    /**
     * <p>
     * Delets an asset in Amazon DataZone.
     * </p>
     * 
     * @param deleteAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAsset operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest deleteAssetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssetRequest, DeleteAssetResult> asyncHandler);

    /**
     * <p>
     * Deletes an asset type in Amazon DataZone.
     * </p>
     * 
     * @param deleteAssetTypeRequest
     * @return A Java Future containing the result of the DeleteAssetType operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetTypeResult> deleteAssetTypeAsync(DeleteAssetTypeRequest deleteAssetTypeRequest);

    /**
     * <p>
     * Deletes an asset type in Amazon DataZone.
     * </p>
     * 
     * @param deleteAssetTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssetType operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetTypeResult> deleteAssetTypeAsync(DeleteAssetTypeRequest deleteAssetTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssetTypeRequest, DeleteAssetTypeResult> asyncHandler);

    /**
     * <p>
     * Deletes a data source in Amazon DataZone.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Deletes a data source in Amazon DataZone.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes a Amazon DataZone domain.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes a Amazon DataZone domain.
     * </p>
     * 
     * @param deleteDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

    /**
     * <p>
     * Deletes an environment in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes an environment in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes the blueprint configuration in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentBlueprintConfigurationRequest
     * @return A Java Future containing the result of the DeleteEnvironmentBlueprintConfiguration operation returned by
     *         the service.
     * @sample AmazonDataZoneAsync.DeleteEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentBlueprintConfigurationResult> deleteEnvironmentBlueprintConfigurationAsync(
            DeleteEnvironmentBlueprintConfigurationRequest deleteEnvironmentBlueprintConfigurationRequest);

    /**
     * <p>
     * Deletes the blueprint configuration in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentBlueprintConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironmentBlueprintConfiguration operation returned by
     *         the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentBlueprintConfigurationResult> deleteEnvironmentBlueprintConfigurationAsync(
            DeleteEnvironmentBlueprintConfigurationRequest deleteEnvironmentBlueprintConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentBlueprintConfigurationRequest, DeleteEnvironmentBlueprintConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes an environment profile in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentProfileRequest
     * @return A Java Future containing the result of the DeleteEnvironmentProfile operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentProfileResult> deleteEnvironmentProfileAsync(DeleteEnvironmentProfileRequest deleteEnvironmentProfileRequest);

    /**
     * <p>
     * Deletes an environment profile in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironmentProfile operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentProfileResult> deleteEnvironmentProfileAsync(DeleteEnvironmentProfileRequest deleteEnvironmentProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentProfileRequest, DeleteEnvironmentProfileResult> asyncHandler);

    /**
     * <p>
     * Delets and metadata form type in Amazon DataZone.
     * </p>
     * 
     * @param deleteFormTypeRequest
     * @return A Java Future containing the result of the DeleteFormType operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteFormType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFormTypeResult> deleteFormTypeAsync(DeleteFormTypeRequest deleteFormTypeRequest);

    /**
     * <p>
     * Delets and metadata form type in Amazon DataZone.
     * </p>
     * 
     * @param deleteFormTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFormType operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteFormType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFormTypeResult> deleteFormTypeAsync(DeleteFormTypeRequest deleteFormTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFormTypeRequest, DeleteFormTypeResult> asyncHandler);

    /**
     * <p>
     * Deletes a business glossary in Amazon DataZone.
     * </p>
     * 
     * @param deleteGlossaryRequest
     * @return A Java Future containing the result of the DeleteGlossary operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGlossaryResult> deleteGlossaryAsync(DeleteGlossaryRequest deleteGlossaryRequest);

    /**
     * <p>
     * Deletes a business glossary in Amazon DataZone.
     * </p>
     * 
     * @param deleteGlossaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGlossary operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGlossaryResult> deleteGlossaryAsync(DeleteGlossaryRequest deleteGlossaryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGlossaryRequest, DeleteGlossaryResult> asyncHandler);

    /**
     * <p>
     * Deletes a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param deleteGlossaryTermRequest
     * @return A Java Future containing the result of the DeleteGlossaryTerm operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGlossaryTermResult> deleteGlossaryTermAsync(DeleteGlossaryTermRequest deleteGlossaryTermRequest);

    /**
     * <p>
     * Deletes a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param deleteGlossaryTermRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGlossaryTerm operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGlossaryTermResult> deleteGlossaryTermAsync(DeleteGlossaryTermRequest deleteGlossaryTermRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGlossaryTermRequest, DeleteGlossaryTermResult> asyncHandler);

    /**
     * <p>
     * Deletes a listing (a record of an asset at a given time).
     * </p>
     * 
     * @param deleteListingRequest
     * @return A Java Future containing the result of the DeleteListing operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteListing" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteListingResult> deleteListingAsync(DeleteListingRequest deleteListingRequest);

    /**
     * <p>
     * Deletes a listing (a record of an asset at a given time).
     * </p>
     * 
     * @param deleteListingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteListing operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteListing" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteListingResult> deleteListingAsync(DeleteListingRequest deleteListingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteListingRequest, DeleteListingResult> asyncHandler);

    /**
     * <p>
     * Deletes a project in Amazon DataZone.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes a project in Amazon DataZone.
     * </p>
     * 
     * @param deleteProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes project membership in Amazon DataZone.
     * </p>
     * 
     * @param deleteProjectMembershipRequest
     * @return A Java Future containing the result of the DeleteProjectMembership operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteProjectMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteProjectMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectMembershipResult> deleteProjectMembershipAsync(DeleteProjectMembershipRequest deleteProjectMembershipRequest);

    /**
     * <p>
     * Deletes project membership in Amazon DataZone.
     * </p>
     * 
     * @param deleteProjectMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProjectMembership operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteProjectMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteProjectMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectMembershipResult> deleteProjectMembershipAsync(DeleteProjectMembershipRequest deleteProjectMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectMembershipRequest, DeleteProjectMembershipResult> asyncHandler);

    /**
     * <p>
     * Deletes and subscription grant in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionGrantRequest
     * @return A Java Future containing the result of the DeleteSubscriptionGrant operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionGrant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriptionGrantResult> deleteSubscriptionGrantAsync(DeleteSubscriptionGrantRequest deleteSubscriptionGrantRequest);

    /**
     * <p>
     * Deletes and subscription grant in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscriptionGrant operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionGrant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriptionGrantResult> deleteSubscriptionGrantAsync(DeleteSubscriptionGrantRequest deleteSubscriptionGrantRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionGrantRequest, DeleteSubscriptionGrantResult> asyncHandler);

    /**
     * <p>
     * Deletes a subscription request in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionRequestRequest
     * @return A Java Future containing the result of the DeleteSubscriptionRequest operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriptionRequestResult> deleteSubscriptionRequestAsync(
            DeleteSubscriptionRequestRequest deleteSubscriptionRequestRequest);

    /**
     * <p>
     * Deletes a subscription request in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscriptionRequest operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriptionRequestResult> deleteSubscriptionRequestAsync(
            DeleteSubscriptionRequestRequest deleteSubscriptionRequestRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionRequestRequest, DeleteSubscriptionRequestResult> asyncHandler);

    /**
     * <p>
     * Deletes a subscription target in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionTargetRequest
     * @return A Java Future containing the result of the DeleteSubscriptionTarget operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriptionTargetResult> deleteSubscriptionTargetAsync(DeleteSubscriptionTargetRequest deleteSubscriptionTargetRequest);

    /**
     * <p>
     * Deletes a subscription target in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscriptionTarget operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriptionTargetResult> deleteSubscriptionTargetAsync(DeleteSubscriptionTargetRequest deleteSubscriptionTargetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified time series form for the specified asset.
     * </p>
     * 
     * @param deleteTimeSeriesDataPointsRequest
     * @return A Java Future containing the result of the DeleteTimeSeriesDataPoints operation returned by the service.
     * @sample AmazonDataZoneAsync.DeleteTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTimeSeriesDataPointsResult> deleteTimeSeriesDataPointsAsync(
            DeleteTimeSeriesDataPointsRequest deleteTimeSeriesDataPointsRequest);

    /**
     * <p>
     * Deletes the specified time series form for the specified asset.
     * </p>
     * 
     * @param deleteTimeSeriesDataPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTimeSeriesDataPoints operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.DeleteTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTimeSeriesDataPointsResult> deleteTimeSeriesDataPointsAsync(
            DeleteTimeSeriesDataPointsRequest deleteTimeSeriesDataPointsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTimeSeriesDataPointsRequest, DeleteTimeSeriesDataPointsResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon DataZone asset.
     * </p>
     * 
     * @param getAssetRequest
     * @return A Java Future containing the result of the GetAsset operation returned by the service.
     * @sample AmazonDataZoneAsync.GetAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAssetResult> getAssetAsync(GetAssetRequest getAssetRequest);

    /**
     * <p>
     * Gets an Amazon DataZone asset.
     * </p>
     * 
     * @param getAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAsset operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAssetResult> getAssetAsync(GetAssetRequest getAssetRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssetRequest, GetAssetResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon DataZone asset type.
     * </p>
     * 
     * @param getAssetTypeRequest
     * @return A Java Future containing the result of the GetAssetType operation returned by the service.
     * @sample AmazonDataZoneAsync.GetAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAssetTypeResult> getAssetTypeAsync(GetAssetTypeRequest getAssetTypeRequest);

    /**
     * <p>
     * Gets an Amazon DataZone asset type.
     * </p>
     * 
     * @param getAssetTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssetType operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAssetTypeResult> getAssetTypeAsync(GetAssetTypeRequest getAssetTypeRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssetTypeRequest, GetAssetTypeResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon DataZone data source.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return A Java Future containing the result of the GetDataSource operation returned by the service.
     * @sample AmazonDataZoneAsync.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Gets an Amazon DataZone data source.
     * </p>
     * 
     * @param getDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSource operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon DataZone data source run.
     * </p>
     * 
     * @param getDataSourceRunRequest
     * @return A Java Future containing the result of the GetDataSourceRun operation returned by the service.
     * @sample AmazonDataZoneAsync.GetDataSourceRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDataSourceRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceRunResult> getDataSourceRunAsync(GetDataSourceRunRequest getDataSourceRunRequest);

    /**
     * <p>
     * Gets an Amazon DataZone data source run.
     * </p>
     * 
     * @param getDataSourceRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSourceRun operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetDataSourceRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDataSourceRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceRunResult> getDataSourceRunAsync(GetDataSourceRunRequest getDataSourceRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSourceRunRequest, GetDataSourceRunResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon DataZone domain.
     * </p>
     * 
     * @param getDomainRequest
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonDataZoneAsync.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Gets an Amazon DataZone domain.
     * </p>
     * 
     * @param getDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon DataZone environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AmazonDataZoneAsync.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Gets an Amazon DataZone environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon DataZone blueprint.
     * </p>
     * 
     * @param getEnvironmentBlueprintRequest
     * @return A Java Future containing the result of the GetEnvironmentBlueprint operation returned by the service.
     * @sample AmazonDataZoneAsync.GetEnvironmentBlueprint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentBlueprint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentBlueprintResult> getEnvironmentBlueprintAsync(GetEnvironmentBlueprintRequest getEnvironmentBlueprintRequest);

    /**
     * <p>
     * Gets an Amazon DataZone blueprint.
     * </p>
     * 
     * @param getEnvironmentBlueprintRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironmentBlueprint operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetEnvironmentBlueprint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentBlueprint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentBlueprintResult> getEnvironmentBlueprintAsync(GetEnvironmentBlueprintRequest getEnvironmentBlueprintRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentBlueprintRequest, GetEnvironmentBlueprintResult> asyncHandler);

    /**
     * <p>
     * Gets the blueprint configuration in Amazon DataZone.
     * </p>
     * 
     * @param getEnvironmentBlueprintConfigurationRequest
     * @return A Java Future containing the result of the GetEnvironmentBlueprintConfiguration operation returned by the
     *         service.
     * @sample AmazonDataZoneAsync.GetEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentBlueprintConfigurationResult> getEnvironmentBlueprintConfigurationAsync(
            GetEnvironmentBlueprintConfigurationRequest getEnvironmentBlueprintConfigurationRequest);

    /**
     * <p>
     * Gets the blueprint configuration in Amazon DataZone.
     * </p>
     * 
     * @param getEnvironmentBlueprintConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironmentBlueprintConfiguration operation returned by the
     *         service.
     * @sample AmazonDataZoneAsyncHandler.GetEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentBlueprintConfigurationResult> getEnvironmentBlueprintConfigurationAsync(
            GetEnvironmentBlueprintConfigurationRequest getEnvironmentBlueprintConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentBlueprintConfigurationRequest, GetEnvironmentBlueprintConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets an evinronment profile in Amazon DataZone.
     * </p>
     * 
     * @param getEnvironmentProfileRequest
     * @return A Java Future containing the result of the GetEnvironmentProfile operation returned by the service.
     * @sample AmazonDataZoneAsync.GetEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentProfileResult> getEnvironmentProfileAsync(GetEnvironmentProfileRequest getEnvironmentProfileRequest);

    /**
     * <p>
     * Gets an evinronment profile in Amazon DataZone.
     * </p>
     * 
     * @param getEnvironmentProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironmentProfile operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentProfileResult> getEnvironmentProfileAsync(GetEnvironmentProfileRequest getEnvironmentProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentProfileRequest, GetEnvironmentProfileResult> asyncHandler);

    /**
     * <p>
     * Gets a metadata form type in Amazon DataZone.
     * </p>
     * 
     * @param getFormTypeRequest
     * @return A Java Future containing the result of the GetFormType operation returned by the service.
     * @sample AmazonDataZoneAsync.GetFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetFormType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFormTypeResult> getFormTypeAsync(GetFormTypeRequest getFormTypeRequest);

    /**
     * <p>
     * Gets a metadata form type in Amazon DataZone.
     * </p>
     * 
     * @param getFormTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFormType operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetFormType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFormTypeResult> getFormTypeAsync(GetFormTypeRequest getFormTypeRequest,
            com.amazonaws.handlers.AsyncHandler<GetFormTypeRequest, GetFormTypeResult> asyncHandler);

    /**
     * <p>
     * Gets a business glossary in Amazon DataZone.
     * </p>
     * 
     * @param getGlossaryRequest
     * @return A Java Future containing the result of the GetGlossary operation returned by the service.
     * @sample AmazonDataZoneAsync.GetGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGlossaryResult> getGlossaryAsync(GetGlossaryRequest getGlossaryRequest);

    /**
     * <p>
     * Gets a business glossary in Amazon DataZone.
     * </p>
     * 
     * @param getGlossaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGlossary operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGlossaryResult> getGlossaryAsync(GetGlossaryRequest getGlossaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetGlossaryRequest, GetGlossaryResult> asyncHandler);

    /**
     * <p>
     * Gets a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param getGlossaryTermRequest
     * @return A Java Future containing the result of the GetGlossaryTerm operation returned by the service.
     * @sample AmazonDataZoneAsync.GetGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGlossaryTerm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGlossaryTermResult> getGlossaryTermAsync(GetGlossaryTermRequest getGlossaryTermRequest);

    /**
     * <p>
     * Gets a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param getGlossaryTermRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGlossaryTerm operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGlossaryTerm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGlossaryTermResult> getGlossaryTermAsync(GetGlossaryTermRequest getGlossaryTermRequest,
            com.amazonaws.handlers.AsyncHandler<GetGlossaryTermRequest, GetGlossaryTermResult> asyncHandler);

    /**
     * <p>
     * Gets a group profile in Amazon DataZone.
     * </p>
     * 
     * @param getGroupProfileRequest
     * @return A Java Future containing the result of the GetGroupProfile operation returned by the service.
     * @sample AmazonDataZoneAsync.GetGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGroupProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupProfileResult> getGroupProfileAsync(GetGroupProfileRequest getGroupProfileRequest);

    /**
     * <p>
     * Gets a group profile in Amazon DataZone.
     * </p>
     * 
     * @param getGroupProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroupProfile operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGroupProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupProfileResult> getGroupProfileAsync(GetGroupProfileRequest getGroupProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupProfileRequest, GetGroupProfileResult> asyncHandler);

    /**
     * <p>
     * Gets the data portal URL for the specified Amazon DataZone domain.
     * </p>
     * 
     * @param getIamPortalLoginUrlRequest
     * @return A Java Future containing the result of the GetIamPortalLoginUrl operation returned by the service.
     * @sample AmazonDataZoneAsync.GetIamPortalLoginUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetIamPortalLoginUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIamPortalLoginUrlResult> getIamPortalLoginUrlAsync(GetIamPortalLoginUrlRequest getIamPortalLoginUrlRequest);

    /**
     * <p>
     * Gets the data portal URL for the specified Amazon DataZone domain.
     * </p>
     * 
     * @param getIamPortalLoginUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIamPortalLoginUrl operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetIamPortalLoginUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetIamPortalLoginUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIamPortalLoginUrlResult> getIamPortalLoginUrlAsync(GetIamPortalLoginUrlRequest getIamPortalLoginUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetIamPortalLoginUrlRequest, GetIamPortalLoginUrlResult> asyncHandler);

    /**
     * <p>
     * Gets a listing (a record of an asset at a given time).
     * </p>
     * 
     * @param getListingRequest
     * @return A Java Future containing the result of the GetListing operation returned by the service.
     * @sample AmazonDataZoneAsync.GetListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetListing" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetListingResult> getListingAsync(GetListingRequest getListingRequest);

    /**
     * <p>
     * Gets a listing (a record of an asset at a given time).
     * </p>
     * 
     * @param getListingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetListing operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetListing" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetListingResult> getListingAsync(GetListingRequest getListingRequest,
            com.amazonaws.handlers.AsyncHandler<GetListingRequest, GetListingResult> asyncHandler);

    /**
     * <p>
     * Gets a metadata generation run in Amazon DataZone.
     * </p>
     * 
     * @param getMetadataGenerationRunRequest
     * @return A Java Future containing the result of the GetMetadataGenerationRun operation returned by the service.
     * @sample AmazonDataZoneAsync.GetMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMetadataGenerationRunResult> getMetadataGenerationRunAsync(GetMetadataGenerationRunRequest getMetadataGenerationRunRequest);

    /**
     * <p>
     * Gets a metadata generation run in Amazon DataZone.
     * </p>
     * 
     * @param getMetadataGenerationRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMetadataGenerationRun operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMetadataGenerationRunResult> getMetadataGenerationRunAsync(GetMetadataGenerationRunRequest getMetadataGenerationRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetMetadataGenerationRunRequest, GetMetadataGenerationRunResult> asyncHandler);

    /**
     * <p>
     * Gets a project in Amazon DataZone.
     * </p>
     * 
     * @param getProjectRequest
     * @return A Java Future containing the result of the GetProject operation returned by the service.
     * @sample AmazonDataZoneAsync.GetProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest getProjectRequest);

    /**
     * <p>
     * Gets a project in Amazon DataZone.
     * </p>
     * 
     * @param getProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProject operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest getProjectRequest,
            com.amazonaws.handlers.AsyncHandler<GetProjectRequest, GetProjectResult> asyncHandler);

    /**
     * <p>
     * Gets a subscription in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionRequest
     * @return A Java Future containing the result of the GetSubscription operation returned by the service.
     * @sample AmazonDataZoneAsync.GetSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionResult> getSubscriptionAsync(GetSubscriptionRequest getSubscriptionRequest);

    /**
     * <p>
     * Gets a subscription in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSubscription operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionResult> getSubscriptionAsync(GetSubscriptionRequest getSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionRequest, GetSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Gets the subscription grant in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionGrantRequest
     * @return A Java Future containing the result of the GetSubscriptionGrant operation returned by the service.
     * @sample AmazonDataZoneAsync.GetSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionGrantResult> getSubscriptionGrantAsync(GetSubscriptionGrantRequest getSubscriptionGrantRequest);

    /**
     * <p>
     * Gets the subscription grant in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSubscriptionGrant operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionGrantResult> getSubscriptionGrantAsync(GetSubscriptionGrantRequest getSubscriptionGrantRequest,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionGrantRequest, GetSubscriptionGrantResult> asyncHandler);

    /**
     * <p>
     * Gets the details of the specified subscription request.
     * </p>
     * 
     * @param getSubscriptionRequestDetailsRequest
     * @return A Java Future containing the result of the GetSubscriptionRequestDetails operation returned by the
     *         service.
     * @sample AmazonDataZoneAsync.GetSubscriptionRequestDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionRequestDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionRequestDetailsResult> getSubscriptionRequestDetailsAsync(
            GetSubscriptionRequestDetailsRequest getSubscriptionRequestDetailsRequest);

    /**
     * <p>
     * Gets the details of the specified subscription request.
     * </p>
     * 
     * @param getSubscriptionRequestDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSubscriptionRequestDetails operation returned by the
     *         service.
     * @sample AmazonDataZoneAsyncHandler.GetSubscriptionRequestDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionRequestDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionRequestDetailsResult> getSubscriptionRequestDetailsAsync(
            GetSubscriptionRequestDetailsRequest getSubscriptionRequestDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionRequestDetailsRequest, GetSubscriptionRequestDetailsResult> asyncHandler);

    /**
     * <p>
     * Gets the subscription target in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionTargetRequest
     * @return A Java Future containing the result of the GetSubscriptionTarget operation returned by the service.
     * @sample AmazonDataZoneAsync.GetSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionTargetResult> getSubscriptionTargetAsync(GetSubscriptionTargetRequest getSubscriptionTargetRequest);

    /**
     * <p>
     * Gets the subscription target in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSubscriptionTarget operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionTargetResult> getSubscriptionTargetAsync(GetSubscriptionTargetRequest getSubscriptionTargetRequest,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionTargetRequest, GetSubscriptionTargetResult> asyncHandler);

    /**
     * <p>
     * Gets the existing data point for the asset.
     * </p>
     * 
     * @param getTimeSeriesDataPointRequest
     * @return A Java Future containing the result of the GetTimeSeriesDataPoint operation returned by the service.
     * @sample AmazonDataZoneAsync.GetTimeSeriesDataPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetTimeSeriesDataPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTimeSeriesDataPointResult> getTimeSeriesDataPointAsync(GetTimeSeriesDataPointRequest getTimeSeriesDataPointRequest);

    /**
     * <p>
     * Gets the existing data point for the asset.
     * </p>
     * 
     * @param getTimeSeriesDataPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTimeSeriesDataPoint operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetTimeSeriesDataPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetTimeSeriesDataPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTimeSeriesDataPointResult> getTimeSeriesDataPointAsync(GetTimeSeriesDataPointRequest getTimeSeriesDataPointRequest,
            com.amazonaws.handlers.AsyncHandler<GetTimeSeriesDataPointRequest, GetTimeSeriesDataPointResult> asyncHandler);

    /**
     * <p>
     * Gets a user profile in Amazon DataZone.
     * </p>
     * 
     * @param getUserProfileRequest
     * @return A Java Future containing the result of the GetUserProfile operation returned by the service.
     * @sample AmazonDataZoneAsync.GetUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserProfileResult> getUserProfileAsync(GetUserProfileRequest getUserProfileRequest);

    /**
     * <p>
     * Gets a user profile in Amazon DataZone.
     * </p>
     * 
     * @param getUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserProfile operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.GetUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserProfileResult> getUserProfileAsync(GetUserProfileRequest getUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserProfileRequest, GetUserProfileResult> asyncHandler);

    /**
     * <p>
     * Lists the revisions for the asset.
     * </p>
     * 
     * @param listAssetRevisionsRequest
     * @return A Java Future containing the result of the ListAssetRevisions operation returned by the service.
     * @sample AmazonDataZoneAsync.ListAssetRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListAssetRevisions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetRevisionsResult> listAssetRevisionsAsync(ListAssetRevisionsRequest listAssetRevisionsRequest);

    /**
     * <p>
     * Lists the revisions for the asset.
     * </p>
     * 
     * @param listAssetRevisionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssetRevisions operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListAssetRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListAssetRevisions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetRevisionsResult> listAssetRevisionsAsync(ListAssetRevisionsRequest listAssetRevisionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssetRevisionsRequest, ListAssetRevisionsResult> asyncHandler);

    /**
     * <p>
     * Lists data source run activities.
     * </p>
     * 
     * @param listDataSourceRunActivitiesRequest
     * @return A Java Future containing the result of the ListDataSourceRunActivities operation returned by the service.
     * @sample AmazonDataZoneAsync.ListDataSourceRunActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSourceRunActivities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourceRunActivitiesResult> listDataSourceRunActivitiesAsync(
            ListDataSourceRunActivitiesRequest listDataSourceRunActivitiesRequest);

    /**
     * <p>
     * Lists data source run activities.
     * </p>
     * 
     * @param listDataSourceRunActivitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSourceRunActivities operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListDataSourceRunActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSourceRunActivities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourceRunActivitiesResult> listDataSourceRunActivitiesAsync(
            ListDataSourceRunActivitiesRequest listDataSourceRunActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourceRunActivitiesRequest, ListDataSourceRunActivitiesResult> asyncHandler);

    /**
     * <p>
     * Lists data source runs in Amazon DataZone.
     * </p>
     * 
     * @param listDataSourceRunsRequest
     * @return A Java Future containing the result of the ListDataSourceRuns operation returned by the service.
     * @sample AmazonDataZoneAsync.ListDataSourceRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSourceRuns" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourceRunsResult> listDataSourceRunsAsync(ListDataSourceRunsRequest listDataSourceRunsRequest);

    /**
     * <p>
     * Lists data source runs in Amazon DataZone.
     * </p>
     * 
     * @param listDataSourceRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSourceRuns operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListDataSourceRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSourceRuns" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourceRunsResult> listDataSourceRunsAsync(ListDataSourceRunsRequest listDataSourceRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourceRunsRequest, ListDataSourceRunsResult> asyncHandler);

    /**
     * <p>
     * Lists data sources in Amazon DataZone.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AmazonDataZoneAsync.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * Lists data sources in Amazon DataZone.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon DataZone domains.
     * </p>
     * 
     * @param listDomainsRequest
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonDataZoneAsync.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Lists Amazon DataZone domains.
     * </p>
     * 
     * @param listDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * <p>
     * Lists blueprint configurations for a Amazon DataZone environment.
     * </p>
     * 
     * @param listEnvironmentBlueprintConfigurationsRequest
     * @return A Java Future containing the result of the ListEnvironmentBlueprintConfigurations operation returned by
     *         the service.
     * @sample AmazonDataZoneAsync.ListEnvironmentBlueprintConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentBlueprintConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentBlueprintConfigurationsResult> listEnvironmentBlueprintConfigurationsAsync(
            ListEnvironmentBlueprintConfigurationsRequest listEnvironmentBlueprintConfigurationsRequest);

    /**
     * <p>
     * Lists blueprint configurations for a Amazon DataZone environment.
     * </p>
     * 
     * @param listEnvironmentBlueprintConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironmentBlueprintConfigurations operation returned by
     *         the service.
     * @sample AmazonDataZoneAsyncHandler.ListEnvironmentBlueprintConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentBlueprintConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentBlueprintConfigurationsResult> listEnvironmentBlueprintConfigurationsAsync(
            ListEnvironmentBlueprintConfigurationsRequest listEnvironmentBlueprintConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentBlueprintConfigurationsRequest, ListEnvironmentBlueprintConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists blueprints in an Amazon DataZone environment.
     * </p>
     * 
     * @param listEnvironmentBlueprintsRequest
     * @return A Java Future containing the result of the ListEnvironmentBlueprints operation returned by the service.
     * @sample AmazonDataZoneAsync.ListEnvironmentBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentBlueprints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentBlueprintsResult> listEnvironmentBlueprintsAsync(
            ListEnvironmentBlueprintsRequest listEnvironmentBlueprintsRequest);

    /**
     * <p>
     * Lists blueprints in an Amazon DataZone environment.
     * </p>
     * 
     * @param listEnvironmentBlueprintsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironmentBlueprints operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListEnvironmentBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentBlueprints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentBlueprintsResult> listEnvironmentBlueprintsAsync(
            ListEnvironmentBlueprintsRequest listEnvironmentBlueprintsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentBlueprintsRequest, ListEnvironmentBlueprintsResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon DataZone environment profiles.
     * </p>
     * 
     * @param listEnvironmentProfilesRequest
     * @return A Java Future containing the result of the ListEnvironmentProfiles operation returned by the service.
     * @sample AmazonDataZoneAsync.ListEnvironmentProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentProfilesResult> listEnvironmentProfilesAsync(ListEnvironmentProfilesRequest listEnvironmentProfilesRequest);

    /**
     * <p>
     * Lists Amazon DataZone environment profiles.
     * </p>
     * 
     * @param listEnvironmentProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironmentProfiles operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListEnvironmentProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentProfilesResult> listEnvironmentProfilesAsync(ListEnvironmentProfilesRequest listEnvironmentProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentProfilesRequest, ListEnvironmentProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon DataZone environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AmazonDataZoneAsync.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Lists Amazon DataZone environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Lists all metadata generation runs.
     * </p>
     * 
     * @param listMetadataGenerationRunsRequest
     * @return A Java Future containing the result of the ListMetadataGenerationRuns operation returned by the service.
     * @sample AmazonDataZoneAsync.ListMetadataGenerationRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListMetadataGenerationRuns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMetadataGenerationRunsResult> listMetadataGenerationRunsAsync(
            ListMetadataGenerationRunsRequest listMetadataGenerationRunsRequest);

    /**
     * <p>
     * Lists all metadata generation runs.
     * </p>
     * 
     * @param listMetadataGenerationRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMetadataGenerationRuns operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListMetadataGenerationRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListMetadataGenerationRuns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMetadataGenerationRunsResult> listMetadataGenerationRunsAsync(
            ListMetadataGenerationRunsRequest listMetadataGenerationRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMetadataGenerationRunsRequest, ListMetadataGenerationRunsResult> asyncHandler);

    /**
     * <p>
     * Lists all Amazon DataZone notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @return A Java Future containing the result of the ListNotifications operation returned by the service.
     * @sample AmazonDataZoneAsync.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListNotifications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest listNotificationsRequest);

    /**
     * <p>
     * Lists all Amazon DataZone notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotifications operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListNotifications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest listNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotificationsRequest, ListNotificationsResult> asyncHandler);

    /**
     * <p>
     * Lists all members of the specified project.
     * </p>
     * 
     * @param listProjectMembershipsRequest
     * @return A Java Future containing the result of the ListProjectMemberships operation returned by the service.
     * @sample AmazonDataZoneAsync.ListProjectMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListProjectMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProjectMembershipsResult> listProjectMembershipsAsync(ListProjectMembershipsRequest listProjectMembershipsRequest);

    /**
     * <p>
     * Lists all members of the specified project.
     * </p>
     * 
     * @param listProjectMembershipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjectMemberships operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListProjectMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListProjectMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProjectMembershipsResult> listProjectMembershipsAsync(ListProjectMembershipsRequest listProjectMembershipsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectMembershipsRequest, ListProjectMembershipsResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon DataZone projects.
     * </p>
     * 
     * @param listProjectsRequest
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AmazonDataZoneAsync.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Lists Amazon DataZone projects.
     * </p>
     * 
     * @param listProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Lists subscription grants.
     * </p>
     * 
     * @param listSubscriptionGrantsRequest
     * @return A Java Future containing the result of the ListSubscriptionGrants operation returned by the service.
     * @sample AmazonDataZoneAsync.ListSubscriptionGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionGrants"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionGrantsResult> listSubscriptionGrantsAsync(ListSubscriptionGrantsRequest listSubscriptionGrantsRequest);

    /**
     * <p>
     * Lists subscription grants.
     * </p>
     * 
     * @param listSubscriptionGrantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscriptionGrants operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListSubscriptionGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionGrants"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionGrantsResult> listSubscriptionGrantsAsync(ListSubscriptionGrantsRequest listSubscriptionGrantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionGrantsRequest, ListSubscriptionGrantsResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon DataZone subscription requests.
     * </p>
     * 
     * @param listSubscriptionRequestsRequest
     * @return A Java Future containing the result of the ListSubscriptionRequests operation returned by the service.
     * @sample AmazonDataZoneAsync.ListSubscriptionRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionRequestsResult> listSubscriptionRequestsAsync(ListSubscriptionRequestsRequest listSubscriptionRequestsRequest);

    /**
     * <p>
     * Lists Amazon DataZone subscription requests.
     * </p>
     * 
     * @param listSubscriptionRequestsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscriptionRequests operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListSubscriptionRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionRequestsResult> listSubscriptionRequestsAsync(ListSubscriptionRequestsRequest listSubscriptionRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionRequestsRequest, ListSubscriptionRequestsResult> asyncHandler);

    /**
     * <p>
     * Lists subscription targets in Amazon DataZone.
     * </p>
     * 
     * @param listSubscriptionTargetsRequest
     * @return A Java Future containing the result of the ListSubscriptionTargets operation returned by the service.
     * @sample AmazonDataZoneAsync.ListSubscriptionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionTargetsResult> listSubscriptionTargetsAsync(ListSubscriptionTargetsRequest listSubscriptionTargetsRequest);

    /**
     * <p>
     * Lists subscription targets in Amazon DataZone.
     * </p>
     * 
     * @param listSubscriptionTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscriptionTargets operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListSubscriptionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionTargetsResult> listSubscriptionTargetsAsync(ListSubscriptionTargetsRequest listSubscriptionTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionTargetsRequest, ListSubscriptionTargetsResult> asyncHandler);

    /**
     * <p>
     * Lists subscriptions in Amazon DataZone.
     * </p>
     * 
     * @param listSubscriptionsRequest
     * @return A Java Future containing the result of the ListSubscriptions operation returned by the service.
     * @sample AmazonDataZoneAsync.ListSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(ListSubscriptionsRequest listSubscriptionsRequest);

    /**
     * <p>
     * Lists subscriptions in Amazon DataZone.
     * </p>
     * 
     * @param listSubscriptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscriptions operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(ListSubscriptionsRequest listSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Lists tags for the specified resource in Amazon DataZone.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonDataZoneAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for the specified resource in Amazon DataZone.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists time series data points.
     * </p>
     * 
     * @param listTimeSeriesDataPointsRequest
     * @return A Java Future containing the result of the ListTimeSeriesDataPoints operation returned by the service.
     * @sample AmazonDataZoneAsync.ListTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTimeSeriesDataPointsResult> listTimeSeriesDataPointsAsync(ListTimeSeriesDataPointsRequest listTimeSeriesDataPointsRequest);

    /**
     * <p>
     * Lists time series data points.
     * </p>
     * 
     * @param listTimeSeriesDataPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTimeSeriesDataPoints operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.ListTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTimeSeriesDataPointsResult> listTimeSeriesDataPointsAsync(ListTimeSeriesDataPointsRequest listTimeSeriesDataPointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTimeSeriesDataPointsRequest, ListTimeSeriesDataPointsResult> asyncHandler);

    /**
     * <p>
     * Posts time series data points to Amazon DataZone for the specified asset.
     * </p>
     * 
     * @param postTimeSeriesDataPointsRequest
     * @return A Java Future containing the result of the PostTimeSeriesDataPoints operation returned by the service.
     * @sample AmazonDataZoneAsync.PostTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/PostTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostTimeSeriesDataPointsResult> postTimeSeriesDataPointsAsync(PostTimeSeriesDataPointsRequest postTimeSeriesDataPointsRequest);

    /**
     * <p>
     * Posts time series data points to Amazon DataZone for the specified asset.
     * </p>
     * 
     * @param postTimeSeriesDataPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PostTimeSeriesDataPoints operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.PostTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/PostTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostTimeSeriesDataPointsResult> postTimeSeriesDataPointsAsync(PostTimeSeriesDataPointsRequest postTimeSeriesDataPointsRequest,
            com.amazonaws.handlers.AsyncHandler<PostTimeSeriesDataPointsRequest, PostTimeSeriesDataPointsResult> asyncHandler);

    /**
     * <p>
     * Writes the configuration for the specified environment blueprint in Amazon DataZone.
     * </p>
     * 
     * @param putEnvironmentBlueprintConfigurationRequest
     * @return A Java Future containing the result of the PutEnvironmentBlueprintConfiguration operation returned by the
     *         service.
     * @sample AmazonDataZoneAsync.PutEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/PutEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEnvironmentBlueprintConfigurationResult> putEnvironmentBlueprintConfigurationAsync(
            PutEnvironmentBlueprintConfigurationRequest putEnvironmentBlueprintConfigurationRequest);

    /**
     * <p>
     * Writes the configuration for the specified environment blueprint in Amazon DataZone.
     * </p>
     * 
     * @param putEnvironmentBlueprintConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEnvironmentBlueprintConfiguration operation returned by the
     *         service.
     * @sample AmazonDataZoneAsyncHandler.PutEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/PutEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEnvironmentBlueprintConfigurationResult> putEnvironmentBlueprintConfigurationAsync(
            PutEnvironmentBlueprintConfigurationRequest putEnvironmentBlueprintConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutEnvironmentBlueprintConfigurationRequest, PutEnvironmentBlueprintConfigurationResult> asyncHandler);

    /**
     * <p>
     * Rejects automatically generated business-friendly metadata for your Amazon DataZone assets.
     * </p>
     * 
     * @param rejectPredictionsRequest
     * @return A Java Future containing the result of the RejectPredictions operation returned by the service.
     * @sample AmazonDataZoneAsync.RejectPredictions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectPredictions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RejectPredictionsResult> rejectPredictionsAsync(RejectPredictionsRequest rejectPredictionsRequest);

    /**
     * <p>
     * Rejects automatically generated business-friendly metadata for your Amazon DataZone assets.
     * </p>
     * 
     * @param rejectPredictionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectPredictions operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.RejectPredictions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectPredictions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RejectPredictionsResult> rejectPredictionsAsync(RejectPredictionsRequest rejectPredictionsRequest,
            com.amazonaws.handlers.AsyncHandler<RejectPredictionsRequest, RejectPredictionsResult> asyncHandler);

    /**
     * <p>
     * Rejects the specified subscription request.
     * </p>
     * 
     * @param rejectSubscriptionRequestRequest
     * @return A Java Future containing the result of the RejectSubscriptionRequest operation returned by the service.
     * @sample AmazonDataZoneAsync.RejectSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectSubscriptionRequestResult> rejectSubscriptionRequestAsync(
            RejectSubscriptionRequestRequest rejectSubscriptionRequestRequest);

    /**
     * <p>
     * Rejects the specified subscription request.
     * </p>
     * 
     * @param rejectSubscriptionRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectSubscriptionRequest operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.RejectSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectSubscriptionRequestResult> rejectSubscriptionRequestAsync(
            RejectSubscriptionRequestRequest rejectSubscriptionRequestRequest,
            com.amazonaws.handlers.AsyncHandler<RejectSubscriptionRequestRequest, RejectSubscriptionRequestResult> asyncHandler);

    /**
     * <p>
     * Revokes a specified subscription in Amazon DataZone.
     * </p>
     * 
     * @param revokeSubscriptionRequest
     * @return A Java Future containing the result of the RevokeSubscription operation returned by the service.
     * @sample AmazonDataZoneAsync.RevokeSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RevokeSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RevokeSubscriptionResult> revokeSubscriptionAsync(RevokeSubscriptionRequest revokeSubscriptionRequest);

    /**
     * <p>
     * Revokes a specified subscription in Amazon DataZone.
     * </p>
     * 
     * @param revokeSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeSubscription operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.RevokeSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RevokeSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RevokeSubscriptionResult> revokeSubscriptionAsync(RevokeSubscriptionRequest revokeSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeSubscriptionRequest, RevokeSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Searches for assets in Amazon DataZone.
     * </p>
     * 
     * @param searchRequest
     * @return A Java Future containing the result of the Search operation returned by the service.
     * @sample AmazonDataZoneAsync.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/Search" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest searchRequest);

    /**
     * <p>
     * Searches for assets in Amazon DataZone.
     * </p>
     * 
     * @param searchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Search operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/Search" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest searchRequest,
            com.amazonaws.handlers.AsyncHandler<SearchRequest, SearchResult> asyncHandler);

    /**
     * <p>
     * Searches group profiles in Amazon DataZone.
     * </p>
     * 
     * @param searchGroupProfilesRequest
     * @return A Java Future containing the result of the SearchGroupProfiles operation returned by the service.
     * @sample AmazonDataZoneAsync.SearchGroupProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchGroupProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchGroupProfilesResult> searchGroupProfilesAsync(SearchGroupProfilesRequest searchGroupProfilesRequest);

    /**
     * <p>
     * Searches group profiles in Amazon DataZone.
     * </p>
     * 
     * @param searchGroupProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchGroupProfiles operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.SearchGroupProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchGroupProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchGroupProfilesResult> searchGroupProfilesAsync(SearchGroupProfilesRequest searchGroupProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchGroupProfilesRequest, SearchGroupProfilesResult> asyncHandler);

    /**
     * <p>
     * Searches listings (records of an asset at a given time) in Amazon DataZone.
     * </p>
     * 
     * @param searchListingsRequest
     * @return A Java Future containing the result of the SearchListings operation returned by the service.
     * @sample AmazonDataZoneAsync.SearchListings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchListings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchListingsResult> searchListingsAsync(SearchListingsRequest searchListingsRequest);

    /**
     * <p>
     * Searches listings (records of an asset at a given time) in Amazon DataZone.
     * </p>
     * 
     * @param searchListingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchListings operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.SearchListings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchListings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchListingsResult> searchListingsAsync(SearchListingsRequest searchListingsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchListingsRequest, SearchListingsResult> asyncHandler);

    /**
     * <p>
     * Searches for types in Amazon DataZone.
     * </p>
     * 
     * @param searchTypesRequest
     * @return A Java Future containing the result of the SearchTypes operation returned by the service.
     * @sample AmazonDataZoneAsync.SearchTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchTypesResult> searchTypesAsync(SearchTypesRequest searchTypesRequest);

    /**
     * <p>
     * Searches for types in Amazon DataZone.
     * </p>
     * 
     * @param searchTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchTypes operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.SearchTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchTypesResult> searchTypesAsync(SearchTypesRequest searchTypesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchTypesRequest, SearchTypesResult> asyncHandler);

    /**
     * <p>
     * Searches user profiles in Amazon DataZone.
     * </p>
     * 
     * @param searchUserProfilesRequest
     * @return A Java Future containing the result of the SearchUserProfiles operation returned by the service.
     * @sample AmazonDataZoneAsync.SearchUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchUserProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchUserProfilesResult> searchUserProfilesAsync(SearchUserProfilesRequest searchUserProfilesRequest);

    /**
     * <p>
     * Searches user profiles in Amazon DataZone.
     * </p>
     * 
     * @param searchUserProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchUserProfiles operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.SearchUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchUserProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchUserProfilesResult> searchUserProfilesAsync(SearchUserProfilesRequest searchUserProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchUserProfilesRequest, SearchUserProfilesResult> asyncHandler);

    /**
     * <p>
     * Start the run of the specified data source in Amazon DataZone.
     * </p>
     * 
     * @param startDataSourceRunRequest
     * @return A Java Future containing the result of the StartDataSourceRun operation returned by the service.
     * @sample AmazonDataZoneAsync.StartDataSourceRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartDataSourceRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartDataSourceRunResult> startDataSourceRunAsync(StartDataSourceRunRequest startDataSourceRunRequest);

    /**
     * <p>
     * Start the run of the specified data source in Amazon DataZone.
     * </p>
     * 
     * @param startDataSourceRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDataSourceRun operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.StartDataSourceRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartDataSourceRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartDataSourceRunResult> startDataSourceRunAsync(StartDataSourceRunRequest startDataSourceRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartDataSourceRunRequest, StartDataSourceRunResult> asyncHandler);

    /**
     * <p>
     * Starts the metadata generation run.
     * </p>
     * 
     * @param startMetadataGenerationRunRequest
     * @return A Java Future containing the result of the StartMetadataGenerationRun operation returned by the service.
     * @sample AmazonDataZoneAsync.StartMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMetadataGenerationRunResult> startMetadataGenerationRunAsync(
            StartMetadataGenerationRunRequest startMetadataGenerationRunRequest);

    /**
     * <p>
     * Starts the metadata generation run.
     * </p>
     * 
     * @param startMetadataGenerationRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMetadataGenerationRun operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.StartMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMetadataGenerationRunResult> startMetadataGenerationRunAsync(
            StartMetadataGenerationRunRequest startMetadataGenerationRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartMetadataGenerationRunRequest, StartMetadataGenerationRunResult> asyncHandler);

    /**
     * <p>
     * Tags a resource in Amazon DataZone.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDataZoneAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags a resource in Amazon DataZone.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Untags a resource in Amazon DataZone.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDataZoneAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untags a resource in Amazon DataZone.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified data source in Amazon DataZone.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates the specified data source in Amazon DataZone.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Updates a Amazon DataZone domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return A Java Future containing the result of the UpdateDomain operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest updateDomainRequest);

    /**
     * <p>
     * Updates a Amazon DataZone domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomain operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainResult> updateDomainAsync(UpdateDomainRequest updateDomainRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainRequest, UpdateDomainResult> asyncHandler);

    /**
     * <p>
     * Updates the specified environment in Amazon DataZone.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Updates the specified environment in Amazon DataZone.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Updates the specified environment profile in Amazon DataZone.
     * </p>
     * 
     * @param updateEnvironmentProfileRequest
     * @return A Java Future containing the result of the UpdateEnvironmentProfile operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentProfileResult> updateEnvironmentProfileAsync(UpdateEnvironmentProfileRequest updateEnvironmentProfileRequest);

    /**
     * <p>
     * Updates the specified environment profile in Amazon DataZone.
     * </p>
     * 
     * @param updateEnvironmentProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironmentProfile operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentProfileResult> updateEnvironmentProfileAsync(UpdateEnvironmentProfileRequest updateEnvironmentProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentProfileRequest, UpdateEnvironmentProfileResult> asyncHandler);

    /**
     * <p>
     * Updates the business glossary in Amazon DataZone.
     * </p>
     * 
     * @param updateGlossaryRequest
     * @return A Java Future containing the result of the UpdateGlossary operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlossaryResult> updateGlossaryAsync(UpdateGlossaryRequest updateGlossaryRequest);

    /**
     * <p>
     * Updates the business glossary in Amazon DataZone.
     * </p>
     * 
     * @param updateGlossaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGlossary operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlossaryResult> updateGlossaryAsync(UpdateGlossaryRequest updateGlossaryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGlossaryRequest, UpdateGlossaryResult> asyncHandler);

    /**
     * <p>
     * Updates a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param updateGlossaryTermRequest
     * @return A Java Future containing the result of the UpdateGlossaryTerm operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlossaryTermResult> updateGlossaryTermAsync(UpdateGlossaryTermRequest updateGlossaryTermRequest);

    /**
     * <p>
     * Updates a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param updateGlossaryTermRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGlossaryTerm operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlossaryTermResult> updateGlossaryTermAsync(UpdateGlossaryTermRequest updateGlossaryTermRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGlossaryTermRequest, UpdateGlossaryTermResult> asyncHandler);

    /**
     * <p>
     * Updates the specified group profile in Amazon DataZone.
     * </p>
     * 
     * @param updateGroupProfileRequest
     * @return A Java Future containing the result of the UpdateGroupProfile operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGroupProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupProfileResult> updateGroupProfileAsync(UpdateGroupProfileRequest updateGroupProfileRequest);

    /**
     * <p>
     * Updates the specified group profile in Amazon DataZone.
     * </p>
     * 
     * @param updateGroupProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGroupProfile operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGroupProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupProfileResult> updateGroupProfileAsync(UpdateGroupProfileRequest updateGroupProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupProfileRequest, UpdateGroupProfileResult> asyncHandler);

    /**
     * <p>
     * Updates the specified project in Amazon DataZone.
     * </p>
     * 
     * @param updateProjectRequest
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Updates the specified project in Amazon DataZone.
     * </p>
     * 
     * @param updateProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler);

    /**
     * <p>
     * Updates the status of the specified subscription grant status in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionGrantStatusRequest
     * @return A Java Future containing the result of the UpdateSubscriptionGrantStatus operation returned by the
     *         service.
     * @sample AmazonDataZoneAsync.UpdateSubscriptionGrantStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionGrantStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionGrantStatusResult> updateSubscriptionGrantStatusAsync(
            UpdateSubscriptionGrantStatusRequest updateSubscriptionGrantStatusRequest);

    /**
     * <p>
     * Updates the status of the specified subscription grant status in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionGrantStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubscriptionGrantStatus operation returned by the
     *         service.
     * @sample AmazonDataZoneAsyncHandler.UpdateSubscriptionGrantStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionGrantStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionGrantStatusResult> updateSubscriptionGrantStatusAsync(
            UpdateSubscriptionGrantStatusRequest updateSubscriptionGrantStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionGrantStatusRequest, UpdateSubscriptionGrantStatusResult> asyncHandler);

    /**
     * <p>
     * Updates a specified subscription request in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionRequestRequest
     * @return A Java Future containing the result of the UpdateSubscriptionRequest operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionRequestResult> updateSubscriptionRequestAsync(
            UpdateSubscriptionRequestRequest updateSubscriptionRequestRequest);

    /**
     * <p>
     * Updates a specified subscription request in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubscriptionRequest operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionRequestResult> updateSubscriptionRequestAsync(
            UpdateSubscriptionRequestRequest updateSubscriptionRequestRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionRequestRequest, UpdateSubscriptionRequestResult> asyncHandler);

    /**
     * <p>
     * Updates the specified subscription target in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionTargetRequest
     * @return A Java Future containing the result of the UpdateSubscriptionTarget operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionTargetResult> updateSubscriptionTargetAsync(UpdateSubscriptionTargetRequest updateSubscriptionTargetRequest);

    /**
     * <p>
     * Updates the specified subscription target in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubscriptionTarget operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionTargetResult> updateSubscriptionTargetAsync(UpdateSubscriptionTargetRequest updateSubscriptionTargetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResult> asyncHandler);

    /**
     * <p>
     * Updates the specified user profile in Amazon DataZone.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return A Java Future containing the result of the UpdateUserProfile operation returned by the service.
     * @sample AmazonDataZoneAsync.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest updateUserProfileRequest);

    /**
     * <p>
     * Updates the specified user profile in Amazon DataZone.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserProfile operation returned by the service.
     * @sample AmazonDataZoneAsyncHandler.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest updateUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, UpdateUserProfileResult> asyncHandler);

}
