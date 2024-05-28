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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.datazone.model.*;

/**
 * Interface for accessing Amazon DataZone.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.datazone.AbstractAmazonDataZone} instead.
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
public interface AmazonDataZone {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "datazone";

    /**
     * <p>
     * Accepts automatically generated business-friendly metadata for your Amazon DataZone assets.
     * </p>
     * 
     * @param acceptPredictionsRequest
     * @return Result of the AcceptPredictions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.AcceptPredictions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptPredictions" target="_top">AWS API
     *      Documentation</a>
     */
    AcceptPredictionsResult acceptPredictions(AcceptPredictionsRequest acceptPredictionsRequest);

    /**
     * <p>
     * Accepts a subscription request to a specific asset.
     * </p>
     * 
     * @param acceptSubscriptionRequestRequest
     * @return Result of the AcceptSubscriptionRequest operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.AcceptSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptSubscriptionRequestResult acceptSubscriptionRequest(AcceptSubscriptionRequestRequest acceptSubscriptionRequestRequest);

    /**
     * <p>
     * Cancels the metadata generation run.
     * </p>
     * 
     * @param cancelMetadataGenerationRunRequest
     * @return Result of the CancelMetadataGenerationRun operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CancelMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CancelMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    CancelMetadataGenerationRunResult cancelMetadataGenerationRun(CancelMetadataGenerationRunRequest cancelMetadataGenerationRunRequest);

    /**
     * <p>
     * Cancels the subscription to the specified asset.
     * </p>
     * 
     * @param cancelSubscriptionRequest
     * @return Result of the CancelSubscription operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CancelSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CancelSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    CancelSubscriptionResult cancelSubscription(CancelSubscriptionRequest cancelSubscriptionRequest);

    /**
     * <p>
     * Creates an asset in Amazon DataZone catalog.
     * </p>
     * 
     * @param createAssetRequest
     * @return Result of the CreateAsset operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAssetResult createAsset(CreateAssetRequest createAssetRequest);

    /**
     * <p>
     * Creates a revision of the asset.
     * </p>
     * 
     * @param createAssetRevisionRequest
     * @return Result of the CreateAssetRevision operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateAssetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetRevision" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAssetRevisionResult createAssetRevision(CreateAssetRevisionRequest createAssetRevisionRequest);

    /**
     * <p>
     * Creates a custom asset type.
     * </p>
     * 
     * @param createAssetTypeRequest
     * @return Result of the CreateAssetType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAssetTypeResult createAssetType(CreateAssetTypeRequest createAssetTypeRequest);

    /**
     * <p>
     * Creates an Amazon DataZone data source.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDataSourceResult createDataSource(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Creates an Amazon DataZone domain.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Create an Amazon DataZone environment.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Creates an Amazon DataZone environment profile.
     * </p>
     * 
     * @param createEnvironmentProfileRequest
     * @return Result of the CreateEnvironmentProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEnvironmentProfileResult createEnvironmentProfile(CreateEnvironmentProfileRequest createEnvironmentProfileRequest);

    /**
     * <p>
     * Creates a metadata form type.
     * </p>
     * 
     * @param createFormTypeRequest
     * @return Result of the CreateFormType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateFormType" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFormTypeResult createFormType(CreateFormTypeRequest createFormTypeRequest);

    /**
     * <p>
     * Creates an Amazon DataZone business glossary.
     * </p>
     * 
     * @param createGlossaryRequest
     * @return Result of the CreateGlossary operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGlossaryResult createGlossary(CreateGlossaryRequest createGlossaryRequest);

    /**
     * <p>
     * Creates a business glossary term.
     * </p>
     * 
     * @param createGlossaryTermRequest
     * @return Result of the CreateGlossaryTerm operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    CreateGlossaryTermResult createGlossaryTerm(CreateGlossaryTermRequest createGlossaryTermRequest);

    /**
     * <p>
     * Creates a group profile in Amazon DataZone.
     * </p>
     * 
     * @param createGroupProfileRequest
     * @return Result of the CreateGroupProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateGroupProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CreateGroupProfileResult createGroupProfile(CreateGroupProfileRequest createGroupProfileRequest);

    /**
     * <p>
     * Publishes a listing (a record of an asset at a given time) or removes a listing from the catalog.
     * </p>
     * 
     * @param createListingChangeSetRequest
     * @return Result of the CreateListingChangeSet operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateListingChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateListingChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateListingChangeSetResult createListingChangeSet(CreateListingChangeSetRequest createListingChangeSetRequest);

    /**
     * <p>
     * Creates an Amazon DataZone project.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a project membership in Amazon DataZone.
     * </p>
     * 
     * @param createProjectMembershipRequest
     * @return Result of the CreateProjectMembership operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateProjectMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateProjectMembership"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProjectMembershipResult createProjectMembership(CreateProjectMembershipRequest createProjectMembershipRequest);

    /**
     * <p>
     * Creates a subsscription grant in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionGrantRequest
     * @return Result of the CreateSubscriptionGrant operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionGrant"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSubscriptionGrantResult createSubscriptionGrant(CreateSubscriptionGrantRequest createSubscriptionGrantRequest);

    /**
     * <p>
     * Creates a subscription request in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionRequestRequest
     * @return Result of the CreateSubscriptionRequest operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSubscriptionRequestResult createSubscriptionRequest(CreateSubscriptionRequestRequest createSubscriptionRequestRequest);

    /**
     * <p>
     * Creates a subscription target in Amazon DataZone.
     * </p>
     * 
     * @param createSubscriptionTargetRequest
     * @return Result of the CreateSubscriptionTarget operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSubscriptionTargetResult createSubscriptionTarget(CreateSubscriptionTargetRequest createSubscriptionTargetRequest);

    /**
     * <p>
     * Creates a user profile in Amazon DataZone.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return Result of the CreateUserProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserProfileResult createUserProfile(CreateUserProfileRequest createUserProfileRequest);

    /**
     * <p>
     * Delets an asset in Amazon DataZone.
     * </p>
     * 
     * @param deleteAssetRequest
     * @return Result of the DeleteAsset operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAssetResult deleteAsset(DeleteAssetRequest deleteAssetRequest);

    /**
     * <p>
     * Deletes an asset type in Amazon DataZone.
     * </p>
     * 
     * @param deleteAssetTypeRequest
     * @return Result of the DeleteAssetType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAssetTypeResult deleteAssetType(DeleteAssetTypeRequest deleteAssetTypeRequest);

    /**
     * <p>
     * Deletes a data source in Amazon DataZone.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Deletes a Amazon DataZone domain.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes an environment in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes the blueprint configuration in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentBlueprintConfigurationRequest
     * @return Result of the DeleteEnvironmentBlueprintConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEnvironmentBlueprintConfigurationResult deleteEnvironmentBlueprintConfiguration(
            DeleteEnvironmentBlueprintConfigurationRequest deleteEnvironmentBlueprintConfigurationRequest);

    /**
     * <p>
     * Deletes an environment profile in Amazon DataZone.
     * </p>
     * 
     * @param deleteEnvironmentProfileRequest
     * @return Result of the DeleteEnvironmentProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEnvironmentProfileResult deleteEnvironmentProfile(DeleteEnvironmentProfileRequest deleteEnvironmentProfileRequest);

    /**
     * <p>
     * Delets and metadata form type in Amazon DataZone.
     * </p>
     * 
     * @param deleteFormTypeRequest
     * @return Result of the DeleteFormType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteFormType" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFormTypeResult deleteFormType(DeleteFormTypeRequest deleteFormTypeRequest);

    /**
     * <p>
     * Deletes a business glossary in Amazon DataZone.
     * </p>
     * 
     * @param deleteGlossaryRequest
     * @return Result of the DeleteGlossary operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGlossaryResult deleteGlossary(DeleteGlossaryRequest deleteGlossaryRequest);

    /**
     * <p>
     * Deletes a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param deleteGlossaryTermRequest
     * @return Result of the DeleteGlossaryTerm operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteGlossaryTermResult deleteGlossaryTerm(DeleteGlossaryTermRequest deleteGlossaryTermRequest);

    /**
     * <p>
     * Deletes a listing (a record of an asset at a given time).
     * </p>
     * 
     * @param deleteListingRequest
     * @return Result of the DeleteListing operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteListing" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteListingResult deleteListing(DeleteListingRequest deleteListingRequest);

    /**
     * <p>
     * Deletes a project in Amazon DataZone.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes project membership in Amazon DataZone.
     * </p>
     * 
     * @param deleteProjectMembershipRequest
     * @return Result of the DeleteProjectMembership operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteProjectMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteProjectMembership"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProjectMembershipResult deleteProjectMembership(DeleteProjectMembershipRequest deleteProjectMembershipRequest);

    /**
     * <p>
     * Deletes and subscription grant in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionGrantRequest
     * @return Result of the DeleteSubscriptionGrant operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionGrant"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSubscriptionGrantResult deleteSubscriptionGrant(DeleteSubscriptionGrantRequest deleteSubscriptionGrantRequest);

    /**
     * <p>
     * Deletes a subscription request in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionRequestRequest
     * @return Result of the DeleteSubscriptionRequest operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSubscriptionRequestResult deleteSubscriptionRequest(DeleteSubscriptionRequestRequest deleteSubscriptionRequestRequest);

    /**
     * <p>
     * Deletes a subscription target in Amazon DataZone.
     * </p>
     * 
     * @param deleteSubscriptionTargetRequest
     * @return Result of the DeleteSubscriptionTarget operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSubscriptionTargetResult deleteSubscriptionTarget(DeleteSubscriptionTargetRequest deleteSubscriptionTargetRequest);

    /**
     * <p>
     * Deletes the specified time series form for the specified asset.
     * </p>
     * 
     * @param deleteTimeSeriesDataPointsRequest
     * @return Result of the DeleteTimeSeriesDataPoints operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.DeleteTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTimeSeriesDataPointsResult deleteTimeSeriesDataPoints(DeleteTimeSeriesDataPointsRequest deleteTimeSeriesDataPointsRequest);

    /**
     * <p>
     * Gets an Amazon DataZone asset.
     * </p>
     * 
     * @param getAssetRequest
     * @return Result of the GetAsset operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAsset" target="_top">AWS API
     *      Documentation</a>
     */
    GetAssetResult getAsset(GetAssetRequest getAssetRequest);

    /**
     * <p>
     * Gets an Amazon DataZone asset type.
     * </p>
     * 
     * @param getAssetTypeRequest
     * @return Result of the GetAssetType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetAssetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAssetType" target="_top">AWS API
     *      Documentation</a>
     */
    GetAssetTypeResult getAssetType(GetAssetTypeRequest getAssetTypeRequest);

    /**
     * <p>
     * Gets an Amazon DataZone data source.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    GetDataSourceResult getDataSource(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Gets an Amazon DataZone data source run.
     * </p>
     * 
     * @param getDataSourceRunRequest
     * @return Result of the GetDataSourceRun operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetDataSourceRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDataSourceRun" target="_top">AWS API
     *      Documentation</a>
     */
    GetDataSourceRunResult getDataSourceRun(GetDataSourceRunRequest getDataSourceRunRequest);

    /**
     * <p>
     * Gets an Amazon DataZone domain.
     * </p>
     * 
     * @param getDomainRequest
     * @return Result of the GetDomain operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    GetDomainResult getDomain(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Gets an Amazon DataZone environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    GetEnvironmentResult getEnvironment(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Gets an Amazon DataZone blueprint.
     * </p>
     * 
     * @param getEnvironmentBlueprintRequest
     * @return Result of the GetEnvironmentBlueprint operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetEnvironmentBlueprint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentBlueprint"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnvironmentBlueprintResult getEnvironmentBlueprint(GetEnvironmentBlueprintRequest getEnvironmentBlueprintRequest);

    /**
     * <p>
     * Gets the blueprint configuration in Amazon DataZone.
     * </p>
     * 
     * @param getEnvironmentBlueprintConfigurationRequest
     * @return Result of the GetEnvironmentBlueprintConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnvironmentBlueprintConfigurationResult getEnvironmentBlueprintConfiguration(
            GetEnvironmentBlueprintConfigurationRequest getEnvironmentBlueprintConfigurationRequest);

    /**
     * <p>
     * Gets an evinronment profile in Amazon DataZone.
     * </p>
     * 
     * @param getEnvironmentProfileRequest
     * @return Result of the GetEnvironmentProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentProfile" target="_top">AWS
     *      API Documentation</a>
     */
    GetEnvironmentProfileResult getEnvironmentProfile(GetEnvironmentProfileRequest getEnvironmentProfileRequest);

    /**
     * <p>
     * Gets a metadata form type in Amazon DataZone.
     * </p>
     * 
     * @param getFormTypeRequest
     * @return Result of the GetFormType operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetFormType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetFormType" target="_top">AWS API
     *      Documentation</a>
     */
    GetFormTypeResult getFormType(GetFormTypeRequest getFormTypeRequest);

    /**
     * <p>
     * Gets a business glossary in Amazon DataZone.
     * </p>
     * 
     * @param getGlossaryRequest
     * @return Result of the GetGlossary operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    GetGlossaryResult getGlossary(GetGlossaryRequest getGlossaryRequest);

    /**
     * <p>
     * Gets a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param getGlossaryTermRequest
     * @return Result of the GetGlossaryTerm operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGlossaryTerm" target="_top">AWS API
     *      Documentation</a>
     */
    GetGlossaryTermResult getGlossaryTerm(GetGlossaryTermRequest getGlossaryTermRequest);

    /**
     * <p>
     * Gets a group profile in Amazon DataZone.
     * </p>
     * 
     * @param getGroupProfileRequest
     * @return Result of the GetGroupProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGroupProfile" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupProfileResult getGroupProfile(GetGroupProfileRequest getGroupProfileRequest);

    /**
     * <p>
     * Gets the data portal URL for the specified Amazon DataZone domain.
     * </p>
     * 
     * @param getIamPortalLoginUrlRequest
     * @return Result of the GetIamPortalLoginUrl operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetIamPortalLoginUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetIamPortalLoginUrl" target="_top">AWS
     *      API Documentation</a>
     */
    GetIamPortalLoginUrlResult getIamPortalLoginUrl(GetIamPortalLoginUrlRequest getIamPortalLoginUrlRequest);

    /**
     * <p>
     * Gets a listing (a record of an asset at a given time).
     * </p>
     * 
     * @param getListingRequest
     * @return Result of the GetListing operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetListing" target="_top">AWS API
     *      Documentation</a>
     */
    GetListingResult getListing(GetListingRequest getListingRequest);

    /**
     * <p>
     * Gets a metadata generation run in Amazon DataZone.
     * </p>
     * 
     * @param getMetadataGenerationRunRequest
     * @return Result of the GetMetadataGenerationRun operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    GetMetadataGenerationRunResult getMetadataGenerationRun(GetMetadataGenerationRunRequest getMetadataGenerationRunRequest);

    /**
     * <p>
     * Gets a project in Amazon DataZone.
     * </p>
     * 
     * @param getProjectRequest
     * @return Result of the GetProject operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetProject" target="_top">AWS API
     *      Documentation</a>
     */
    GetProjectResult getProject(GetProjectRequest getProjectRequest);

    /**
     * <p>
     * Gets a subscription in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionRequest
     * @return Result of the GetSubscription operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    GetSubscriptionResult getSubscription(GetSubscriptionRequest getSubscriptionRequest);

    /**
     * <p>
     * Gets the subscription grant in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionGrantRequest
     * @return Result of the GetSubscriptionGrant operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetSubscriptionGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionGrant" target="_top">AWS
     *      API Documentation</a>
     */
    GetSubscriptionGrantResult getSubscriptionGrant(GetSubscriptionGrantRequest getSubscriptionGrantRequest);

    /**
     * <p>
     * Gets the details of the specified subscription request.
     * </p>
     * 
     * @param getSubscriptionRequestDetailsRequest
     * @return Result of the GetSubscriptionRequestDetails operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetSubscriptionRequestDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionRequestDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetSubscriptionRequestDetailsResult getSubscriptionRequestDetails(GetSubscriptionRequestDetailsRequest getSubscriptionRequestDetailsRequest);

    /**
     * <p>
     * Gets the subscription target in Amazon DataZone.
     * </p>
     * 
     * @param getSubscriptionTargetRequest
     * @return Result of the GetSubscriptionTarget operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscriptionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    GetSubscriptionTargetResult getSubscriptionTarget(GetSubscriptionTargetRequest getSubscriptionTargetRequest);

    /**
     * <p>
     * Gets the existing data point for the asset.
     * </p>
     * 
     * @param getTimeSeriesDataPointRequest
     * @return Result of the GetTimeSeriesDataPoint operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetTimeSeriesDataPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetTimeSeriesDataPoint"
     *      target="_top">AWS API Documentation</a>
     */
    GetTimeSeriesDataPointResult getTimeSeriesDataPoint(GetTimeSeriesDataPointRequest getTimeSeriesDataPointRequest);

    /**
     * <p>
     * Gets a user profile in Amazon DataZone.
     * </p>
     * 
     * @param getUserProfileRequest
     * @return Result of the GetUserProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.GetUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    GetUserProfileResult getUserProfile(GetUserProfileRequest getUserProfileRequest);

    /**
     * <p>
     * Lists the revisions for the asset.
     * </p>
     * 
     * @param listAssetRevisionsRequest
     * @return Result of the ListAssetRevisions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListAssetRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListAssetRevisions" target="_top">AWS
     *      API Documentation</a>
     */
    ListAssetRevisionsResult listAssetRevisions(ListAssetRevisionsRequest listAssetRevisionsRequest);

    /**
     * <p>
     * Lists data source run activities.
     * </p>
     * 
     * @param listDataSourceRunActivitiesRequest
     * @return Result of the ListDataSourceRunActivities operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListDataSourceRunActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSourceRunActivities"
     *      target="_top">AWS API Documentation</a>
     */
    ListDataSourceRunActivitiesResult listDataSourceRunActivities(ListDataSourceRunActivitiesRequest listDataSourceRunActivitiesRequest);

    /**
     * <p>
     * Lists data source runs in Amazon DataZone.
     * </p>
     * 
     * @param listDataSourceRunsRequest
     * @return Result of the ListDataSourceRuns operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListDataSourceRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSourceRuns" target="_top">AWS
     *      API Documentation</a>
     */
    ListDataSourceRunsResult listDataSourceRuns(ListDataSourceRunsRequest listDataSourceRunsRequest);

    /**
     * <p>
     * Lists data sources in Amazon DataZone.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataSourcesResult listDataSources(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * Lists Amazon DataZone domains.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Lists blueprint configurations for a Amazon DataZone environment.
     * </p>
     * 
     * @param listEnvironmentBlueprintConfigurationsRequest
     * @return Result of the ListEnvironmentBlueprintConfigurations operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListEnvironmentBlueprintConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentBlueprintConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentBlueprintConfigurationsResult listEnvironmentBlueprintConfigurations(
            ListEnvironmentBlueprintConfigurationsRequest listEnvironmentBlueprintConfigurationsRequest);

    /**
     * <p>
     * Lists blueprints in an Amazon DataZone environment.
     * </p>
     * 
     * @param listEnvironmentBlueprintsRequest
     * @return Result of the ListEnvironmentBlueprints operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListEnvironmentBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentBlueprints"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentBlueprintsResult listEnvironmentBlueprints(ListEnvironmentBlueprintsRequest listEnvironmentBlueprintsRequest);

    /**
     * <p>
     * Lists Amazon DataZone environment profiles.
     * </p>
     * 
     * @param listEnvironmentProfilesRequest
     * @return Result of the ListEnvironmentProfiles operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListEnvironmentProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentProfilesResult listEnvironmentProfiles(ListEnvironmentProfilesRequest listEnvironmentProfilesRequest);

    /**
     * <p>
     * Lists Amazon DataZone environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Lists all metadata generation runs.
     * </p>
     * 
     * @param listMetadataGenerationRunsRequest
     * @return Result of the ListMetadataGenerationRuns operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListMetadataGenerationRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListMetadataGenerationRuns"
     *      target="_top">AWS API Documentation</a>
     */
    ListMetadataGenerationRunsResult listMetadataGenerationRuns(ListMetadataGenerationRunsRequest listMetadataGenerationRunsRequest);

    /**
     * <p>
     * Lists all Amazon DataZone notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @return Result of the ListNotifications operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListNotifications" target="_top">AWS API
     *      Documentation</a>
     */
    ListNotificationsResult listNotifications(ListNotificationsRequest listNotificationsRequest);

    /**
     * <p>
     * Lists all members of the specified project.
     * </p>
     * 
     * @param listProjectMembershipsRequest
     * @return Result of the ListProjectMemberships operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListProjectMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListProjectMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    ListProjectMembershipsResult listProjectMemberships(ListProjectMembershipsRequest listProjectMembershipsRequest);

    /**
     * <p>
     * Lists Amazon DataZone projects.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Lists subscription grants.
     * </p>
     * 
     * @param listSubscriptionGrantsRequest
     * @return Result of the ListSubscriptionGrants operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListSubscriptionGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionGrants"
     *      target="_top">AWS API Documentation</a>
     */
    ListSubscriptionGrantsResult listSubscriptionGrants(ListSubscriptionGrantsRequest listSubscriptionGrantsRequest);

    /**
     * <p>
     * Lists Amazon DataZone subscription requests.
     * </p>
     * 
     * @param listSubscriptionRequestsRequest
     * @return Result of the ListSubscriptionRequests operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListSubscriptionRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionRequests"
     *      target="_top">AWS API Documentation</a>
     */
    ListSubscriptionRequestsResult listSubscriptionRequests(ListSubscriptionRequestsRequest listSubscriptionRequestsRequest);

    /**
     * <p>
     * Lists subscription targets in Amazon DataZone.
     * </p>
     * 
     * @param listSubscriptionTargetsRequest
     * @return Result of the ListSubscriptionTargets operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListSubscriptionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    ListSubscriptionTargetsResult listSubscriptionTargets(ListSubscriptionTargetsRequest listSubscriptionTargetsRequest);

    /**
     * <p>
     * Lists subscriptions in Amazon DataZone.
     * </p>
     * 
     * @param listSubscriptionsRequest
     * @return Result of the ListSubscriptions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    ListSubscriptionsResult listSubscriptions(ListSubscriptionsRequest listSubscriptionsRequest);

    /**
     * <p>
     * Lists tags for the specified resource in Amazon DataZone.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists time series data points.
     * </p>
     * 
     * @param listTimeSeriesDataPointsRequest
     * @return Result of the ListTimeSeriesDataPoints operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.ListTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    ListTimeSeriesDataPointsResult listTimeSeriesDataPoints(ListTimeSeriesDataPointsRequest listTimeSeriesDataPointsRequest);

    /**
     * <p>
     * Posts time series data points to Amazon DataZone for the specified asset.
     * </p>
     * 
     * @param postTimeSeriesDataPointsRequest
     * @return Result of the PostTimeSeriesDataPoints operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.PostTimeSeriesDataPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/PostTimeSeriesDataPoints"
     *      target="_top">AWS API Documentation</a>
     */
    PostTimeSeriesDataPointsResult postTimeSeriesDataPoints(PostTimeSeriesDataPointsRequest postTimeSeriesDataPointsRequest);

    /**
     * <p>
     * Writes the configuration for the specified environment blueprint in Amazon DataZone.
     * </p>
     * 
     * @param putEnvironmentBlueprintConfigurationRequest
     * @return Result of the PutEnvironmentBlueprintConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.PutEnvironmentBlueprintConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/PutEnvironmentBlueprintConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutEnvironmentBlueprintConfigurationResult putEnvironmentBlueprintConfiguration(
            PutEnvironmentBlueprintConfigurationRequest putEnvironmentBlueprintConfigurationRequest);

    /**
     * <p>
     * Rejects automatically generated business-friendly metadata for your Amazon DataZone assets.
     * </p>
     * 
     * @param rejectPredictionsRequest
     * @return Result of the RejectPredictions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.RejectPredictions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectPredictions" target="_top">AWS API
     *      Documentation</a>
     */
    RejectPredictionsResult rejectPredictions(RejectPredictionsRequest rejectPredictionsRequest);

    /**
     * <p>
     * Rejects the specified subscription request.
     * </p>
     * 
     * @param rejectSubscriptionRequestRequest
     * @return Result of the RejectSubscriptionRequest operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.RejectSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    RejectSubscriptionRequestResult rejectSubscriptionRequest(RejectSubscriptionRequestRequest rejectSubscriptionRequestRequest);

    /**
     * <p>
     * Revokes a specified subscription in Amazon DataZone.
     * </p>
     * 
     * @param revokeSubscriptionRequest
     * @return Result of the RevokeSubscription operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.RevokeSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RevokeSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    RevokeSubscriptionResult revokeSubscription(RevokeSubscriptionRequest revokeSubscriptionRequest);

    /**
     * <p>
     * Searches for assets in Amazon DataZone.
     * </p>
     * 
     * @param searchRequest
     * @return Result of the Search operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/Search" target="_top">AWS API
     *      Documentation</a>
     */
    SearchResult search(SearchRequest searchRequest);

    /**
     * <p>
     * Searches group profiles in Amazon DataZone.
     * </p>
     * 
     * @param searchGroupProfilesRequest
     * @return Result of the SearchGroupProfiles operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.SearchGroupProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchGroupProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    SearchGroupProfilesResult searchGroupProfiles(SearchGroupProfilesRequest searchGroupProfilesRequest);

    /**
     * <p>
     * Searches listings (records of an asset at a given time) in Amazon DataZone.
     * </p>
     * 
     * @param searchListingsRequest
     * @return Result of the SearchListings operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.SearchListings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchListings" target="_top">AWS API
     *      Documentation</a>
     */
    SearchListingsResult searchListings(SearchListingsRequest searchListingsRequest);

    /**
     * <p>
     * Searches for types in Amazon DataZone.
     * </p>
     * 
     * @param searchTypesRequest
     * @return Result of the SearchTypes operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.SearchTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchTypes" target="_top">AWS API
     *      Documentation</a>
     */
    SearchTypesResult searchTypes(SearchTypesRequest searchTypesRequest);

    /**
     * <p>
     * Searches user profiles in Amazon DataZone.
     * </p>
     * 
     * @param searchUserProfilesRequest
     * @return Result of the SearchUserProfiles operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.SearchUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchUserProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    SearchUserProfilesResult searchUserProfiles(SearchUserProfilesRequest searchUserProfilesRequest);

    /**
     * <p>
     * Start the run of the specified data source in Amazon DataZone.
     * </p>
     * 
     * @param startDataSourceRunRequest
     * @return Result of the StartDataSourceRun operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.StartDataSourceRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartDataSourceRun" target="_top">AWS
     *      API Documentation</a>
     */
    StartDataSourceRunResult startDataSourceRun(StartDataSourceRunRequest startDataSourceRunRequest);

    /**
     * <p>
     * Starts the metadata generation run.
     * </p>
     * 
     * @param startMetadataGenerationRunRequest
     * @return Result of the StartMetadataGenerationRun operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.StartMetadataGenerationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartMetadataGenerationRun"
     *      target="_top">AWS API Documentation</a>
     */
    StartMetadataGenerationRunResult startMetadataGenerationRun(StartMetadataGenerationRunRequest startMetadataGenerationRunRequest);

    /**
     * <p>
     * Tags a resource in Amazon DataZone.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Untags a resource in Amazon DataZone.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified data source in Amazon DataZone.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates a Amazon DataZone domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return Result of the UpdateDomain operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDomainResult updateDomain(UpdateDomainRequest updateDomainRequest);

    /**
     * <p>
     * Updates the specified environment in Amazon DataZone.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Updates the specified environment profile in Amazon DataZone.
     * </p>
     * 
     * @param updateEnvironmentProfileRequest
     * @return Result of the UpdateEnvironmentProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateEnvironmentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateEnvironmentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnvironmentProfileResult updateEnvironmentProfile(UpdateEnvironmentProfileRequest updateEnvironmentProfileRequest);

    /**
     * <p>
     * Updates the business glossary in Amazon DataZone.
     * </p>
     * 
     * @param updateGlossaryRequest
     * @return Result of the UpdateGlossary operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateGlossary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossary" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGlossaryResult updateGlossary(UpdateGlossaryRequest updateGlossaryRequest);

    /**
     * <p>
     * Updates a business glossary term in Amazon DataZone.
     * </p>
     * 
     * @param updateGlossaryTermRequest
     * @return Result of the UpdateGlossaryTerm operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateGlossaryTerm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGlossaryTerm" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateGlossaryTermResult updateGlossaryTerm(UpdateGlossaryTermRequest updateGlossaryTermRequest);

    /**
     * <p>
     * Updates the specified group profile in Amazon DataZone.
     * </p>
     * 
     * @param updateGroupProfileRequest
     * @return Result of the UpdateGroupProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateGroupProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGroupProfile" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateGroupProfileResult updateGroupProfile(UpdateGroupProfileRequest updateGroupProfileRequest);

    /**
     * <p>
     * Updates the specified project in Amazon DataZone.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The request has exceeded the specified service quota.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Updates the status of the specified subscription grant status in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionGrantStatusRequest
     * @return Result of the UpdateSubscriptionGrantStatus operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateSubscriptionGrantStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionGrantStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSubscriptionGrantStatusResult updateSubscriptionGrantStatus(UpdateSubscriptionGrantStatusRequest updateSubscriptionGrantStatusRequest);

    /**
     * <p>
     * Updates a specified subscription request in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionRequestRequest
     * @return Result of the UpdateSubscriptionRequest operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateSubscriptionRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionRequest"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSubscriptionRequestResult updateSubscriptionRequest(UpdateSubscriptionRequestRequest updateSubscriptionRequestRequest);

    /**
     * <p>
     * Updates the specified subscription target in Amazon DataZone.
     * </p>
     * 
     * @param updateSubscriptionTargetRequest
     * @return Result of the UpdateSubscriptionTarget operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         There is a conflict while performing this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateSubscriptionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionTarget"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSubscriptionTargetResult updateSubscriptionTarget(UpdateSubscriptionTargetRequest updateSubscriptionTargetRequest);

    /**
     * <p>
     * Updates the specified user profile in Amazon DataZone.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return Result of the UpdateUserProfile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the Amazon Web Services service.
     * @throws UnauthorizedException
     *         You do not have permission to perform this action.
     * @sample AmazonDataZone.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest updateUserProfileRequest);

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
