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
package com.amazonaws.services.nimblestudio;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.nimblestudio.model.*;

/**
 * Interface for accessing AmazonNimbleStudio.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.nimblestudio.AbstractAmazonNimbleStudio} instead.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonNimbleStudio {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "nimble";

    /**
     * <p>
     * Accept EULAs.
     * </p>
     * 
     * @param acceptEulasRequest
     *        A collection of EULA acceptances.
     * @return Result of the AcceptEulas operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.AcceptEulas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/AcceptEulas" target="_top">AWS API
     *      Documentation</a>
     */
    AcceptEulasResult acceptEulas(AcceptEulasRequest acceptEulasRequest);

    /**
     * <p>
     * Create a launch profile.
     * </p>
     * 
     * @param createLaunchProfileRequest
     *        A collection of launch profiles.
     * @return Result of the CreateLaunchProfile operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.CreateLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLaunchProfileResult createLaunchProfile(CreateLaunchProfileRequest createLaunchProfileRequest);

    /**
     * <p>
     * Creates a streaming image resource in a studio.
     * </p>
     * 
     * @param createStreamingImageRequest
     *        A collection of streaming images.
     * @return Result of the CreateStreamingImage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.CreateStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    CreateStreamingImageResult createStreamingImage(CreateStreamingImageRequest createStreamingImageRequest);

    /**
     * <p>
     * Creates a streaming session in a studio.
     * </p>
     * <p>
     * After invoking this operation, you must poll GetStreamingSession until the streaming session is in state READY.
     * </p>
     * 
     * @param createStreamingSessionRequest
     *        A collection of streaming sessions.
     * @return Result of the CreateStreamingSession operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.CreateStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingSession" target="_top">AWS
     *      API Documentation</a>
     */
    CreateStreamingSessionResult createStreamingSession(CreateStreamingSessionRequest createStreamingSessionRequest);

    /**
     * <p>
     * Creates a streaming session stream for a streaming session.
     * </p>
     * <p>
     * After invoking this API, invoke GetStreamingSessionStream with the returned streamId to poll the resource until
     * it is in state READY.
     * </p>
     * 
     * @param createStreamingSessionStreamRequest
     *        A list collection streams.
     * @return Result of the CreateStreamingSessionStream operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.CreateStreamingSessionStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingSessionStream"
     *      target="_top">AWS API Documentation</a>
     */
    CreateStreamingSessionStreamResult createStreamingSessionStream(CreateStreamingSessionStreamRequest createStreamingSessionStreamRequest);

    /**
     * <p>
     * Create a new Studio.
     * </p>
     * <p>
     * When creating a Studio, two IAM roles must be provided: the admin role and the user Role. These roles are assumed
     * by your users when they log in to the Nimble Studio portal.
     * </p>
     * <p>
     * The user role must have the AmazonNimbleStudio-StudioUser managed policy attached for the portal to function
     * properly.
     * </p>
     * <p>
     * The Admin Role must have the AmazonNimbleStudio-StudioAdmin managed policy attached for the portal to function
     * properly.
     * </p>
     * <p>
     * You may optionally specify a KMS key in the StudioEncryptionConfiguration.
     * </p>
     * <p>
     * In Nimble Studio, resource names, descriptions, initialization scripts, and other data you provide are always
     * encrypted at rest using an AWS KMS key. By default, this key is owned by AWS and managed on your behalf. You may
     * provide your own AWS KMS key when calling CreateStudio to encrypt this data using a key you own and manage.
     * </p>
     * <p>
     * When providing an AWS KMS key during studio creation, Nimble Studio creates KMS grants in your account to provide
     * your studio user and admin roles access to these KMS keys.
     * </p>
     * <p>
     * If you delete this grant, the studio will no longer be accessible to your portal users.
     * </p>
     * <p>
     * If you delete the studio KMS key, your studio will no longer be accessible.
     * </p>
     * 
     * @param createStudioRequest
     *        A collection of studio resources.
     * @return Result of the CreateStudio operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.CreateStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStudio" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStudioResult createStudio(CreateStudioRequest createStudioRequest);

    /**
     * <p>
     * Creates a studio component resource.
     * </p>
     * 
     * @param createStudioComponentRequest
     *        The studio components.
     * @return Result of the CreateStudioComponent operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.CreateStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    CreateStudioComponentResult createStudioComponent(CreateStudioComponentRequest createStudioComponentRequest);

    /**
     * <p>
     * Permanently delete a launch profile.
     * </p>
     * 
     * @param deleteLaunchProfileRequest
     * @return Result of the DeleteLaunchProfile operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.DeleteLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLaunchProfileResult deleteLaunchProfile(DeleteLaunchProfileRequest deleteLaunchProfileRequest);

    /**
     * <p>
     * Delete a user from launch profile membership.
     * </p>
     * 
     * @param deleteLaunchProfileMemberRequest
     * @return Result of the DeleteLaunchProfileMember operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.DeleteLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteLaunchProfileMember"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLaunchProfileMemberResult deleteLaunchProfileMember(DeleteLaunchProfileMemberRequest deleteLaunchProfileMemberRequest);

    /**
     * <p>
     * Delete streaming image.
     * </p>
     * 
     * @param deleteStreamingImageRequest
     * @return Result of the DeleteStreamingImage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.DeleteStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteStreamingImageResult deleteStreamingImage(DeleteStreamingImageRequest deleteStreamingImageRequest);

    /**
     * <p>
     * Deletes streaming session resource.
     * </p>
     * <p>
     * After invoking this operation, use GetStreamingSession to poll the resource until it transitions to a DELETED
     * state.
     * </p>
     * <p>
     * A streaming session will count against your streaming session quota until it is marked DELETED.
     * </p>
     * 
     * @param deleteStreamingSessionRequest
     * @return Result of the DeleteStreamingSession operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.DeleteStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStreamingSession" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteStreamingSessionResult deleteStreamingSession(DeleteStreamingSessionRequest deleteStreamingSessionRequest);

    /**
     * <p>
     * Delete a studio resource.
     * </p>
     * 
     * @param deleteStudioRequest
     * @return Result of the DeleteStudio operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.DeleteStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudio" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStudioResult deleteStudio(DeleteStudioRequest deleteStudioRequest);

    /**
     * <p>
     * Deletes a studio component resource.
     * </p>
     * 
     * @param deleteStudioComponentRequest
     * @return Result of the DeleteStudioComponent operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.DeleteStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteStudioComponentResult deleteStudioComponent(DeleteStudioComponentRequest deleteStudioComponentRequest);

    /**
     * <p>
     * Delete a user from studio membership.
     * </p>
     * 
     * @param deleteStudioMemberRequest
     * @return Result of the DeleteStudioMember operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.DeleteStudioMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudioMember" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStudioMemberResult deleteStudioMember(DeleteStudioMemberRequest deleteStudioMemberRequest);

    /**
     * <p>
     * Get Eula.
     * </p>
     * 
     * @param getEulaRequest
     * @return Result of the GetEula operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetEula
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetEula" target="_top">AWS API
     *      Documentation</a>
     */
    GetEulaResult getEula(GetEulaRequest getEulaRequest);

    /**
     * <p>
     * Get a launch profile.
     * </p>
     * 
     * @param getLaunchProfileRequest
     * @return Result of the GetLaunchProfile operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    GetLaunchProfileResult getLaunchProfile(GetLaunchProfileRequest getLaunchProfileRequest);

    /**
     * <p>
     * Launch profile details include the launch profile resource and summary information of resources that are used by,
     * or available to, the launch profile. This includes the name and description of all studio components used by the
     * launch profiles, and the name and description of streaming images that can be used with this launch profile.
     * </p>
     * 
     * @param getLaunchProfileDetailsRequest
     * @return Result of the GetLaunchProfileDetails operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetLaunchProfileDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileDetails" target="_top">AWS
     *      API Documentation</a>
     */
    GetLaunchProfileDetailsResult getLaunchProfileDetails(GetLaunchProfileDetailsRequest getLaunchProfileDetailsRequest);

    /**
     * <p>
     * Get a launch profile initialization.
     * </p>
     * 
     * @param getLaunchProfileInitializationRequest
     * @return Result of the GetLaunchProfileInitialization operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetLaunchProfileInitialization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileInitialization"
     *      target="_top">AWS API Documentation</a>
     */
    GetLaunchProfileInitializationResult getLaunchProfileInitialization(GetLaunchProfileInitializationRequest getLaunchProfileInitializationRequest);

    /**
     * <p>
     * Get a user persona in launch profile membership.
     * </p>
     * 
     * @param getLaunchProfileMemberRequest
     * @return Result of the GetLaunchProfileMember operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileMember" target="_top">AWS
     *      API Documentation</a>
     */
    GetLaunchProfileMemberResult getLaunchProfileMember(GetLaunchProfileMemberRequest getLaunchProfileMemberRequest);

    /**
     * <p>
     * Get streaming image.
     * </p>
     * 
     * @param getStreamingImageRequest
     * @return Result of the GetStreamingImage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingImage" target="_top">AWS API
     *      Documentation</a>
     */
    GetStreamingImageResult getStreamingImage(GetStreamingImageRequest getStreamingImageRequest);

    /**
     * <p>
     * Gets StreamingSession resource.
     * </p>
     * <p>
     * Invoke this operation to poll for a streaming session state while creating or deleting a session.
     * </p>
     * 
     * @param getStreamingSessionRequest
     * @return Result of the GetStreamingSession operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingSession" target="_top">AWS API
     *      Documentation</a>
     */
    GetStreamingSessionResult getStreamingSession(GetStreamingSessionRequest getStreamingSessionRequest);

    /**
     * <p>
     * Gets a StreamingSessionStream for a streaming session.
     * </p>
     * <p>
     * Invoke this operation to poll the resource after invoking CreateStreamingSessionStream.
     * </p>
     * <p>
     * After the StreamingSessionStream changes to the state READY, the url property will contain a stream to be used
     * with the DCV streaming client.
     * </p>
     * 
     * @param getStreamingSessionStreamRequest
     * @return Result of the GetStreamingSessionStream operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetStreamingSessionStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingSessionStream"
     *      target="_top">AWS API Documentation</a>
     */
    GetStreamingSessionStreamResult getStreamingSessionStream(GetStreamingSessionStreamRequest getStreamingSessionStreamRequest);

    /**
     * <p>
     * Get a Studio resource.
     * </p>
     * 
     * @param getStudioRequest
     * @return Result of the GetStudio operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudio" target="_top">AWS API
     *      Documentation</a>
     */
    GetStudioResult getStudio(GetStudioRequest getStudioRequest);

    /**
     * <p>
     * Gets a studio component resource.
     * </p>
     * 
     * @param getStudioComponentRequest
     * @return Result of the GetStudioComponent operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudioComponent" target="_top">AWS API
     *      Documentation</a>
     */
    GetStudioComponentResult getStudioComponent(GetStudioComponentRequest getStudioComponentRequest);

    /**
     * <p>
     * Get a user's membership in a studio.
     * </p>
     * 
     * @param getStudioMemberRequest
     * @return Result of the GetStudioMember operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.GetStudioMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudioMember" target="_top">AWS API
     *      Documentation</a>
     */
    GetStudioMemberResult getStudioMember(GetStudioMemberRequest getStudioMemberRequest);

    /**
     * <p>
     * List Eula Acceptances.
     * </p>
     * 
     * @param listEulaAcceptancesRequest
     * @return Result of the ListEulaAcceptances operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.ListEulaAcceptances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListEulaAcceptances" target="_top">AWS API
     *      Documentation</a>
     */
    ListEulaAcceptancesResult listEulaAcceptances(ListEulaAcceptancesRequest listEulaAcceptancesRequest);

    /**
     * <p>
     * List Eulas.
     * </p>
     * 
     * @param listEulasRequest
     * @return Result of the ListEulas operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.ListEulas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListEulas" target="_top">AWS API
     *      Documentation</a>
     */
    ListEulasResult listEulas(ListEulasRequest listEulasRequest);

    /**
     * <p>
     * Get all users in a given launch profile membership.
     * </p>
     * 
     * @param listLaunchProfileMembersRequest
     * @return Result of the ListLaunchProfileMembers operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.ListLaunchProfileMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListLaunchProfileMembers"
     *      target="_top">AWS API Documentation</a>
     */
    ListLaunchProfileMembersResult listLaunchProfileMembers(ListLaunchProfileMembersRequest listLaunchProfileMembersRequest);

    /**
     * <p>
     * List all the launch profiles a studio.
     * </p>
     * 
     * @param listLaunchProfilesRequest
     * @return Result of the ListLaunchProfiles operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.ListLaunchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListLaunchProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    ListLaunchProfilesResult listLaunchProfiles(ListLaunchProfilesRequest listLaunchProfilesRequest);

    /**
     * <p>
     * List the streaming image resources available to this studio.
     * </p>
     * <p>
     * This list will contain both images provided by AWS, as well as streaming images that you have created in your
     * studio.
     * </p>
     * 
     * @param listStreamingImagesRequest
     * @return Result of the ListStreamingImages operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.ListStreamingImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingImages" target="_top">AWS API
     *      Documentation</a>
     */
    ListStreamingImagesResult listStreamingImages(ListStreamingImagesRequest listStreamingImagesRequest);

    /**
     * <p>
     * Lists the streaming image resources in a studio.
     * </p>
     * 
     * @param listStreamingSessionsRequest
     * @return Result of the ListStreamingSessions operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.ListStreamingSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingSessions" target="_top">AWS
     *      API Documentation</a>
     */
    ListStreamingSessionsResult listStreamingSessions(ListStreamingSessionsRequest listStreamingSessionsRequest);

    /**
     * <p>
     * Lists the StudioComponents in a studio.
     * </p>
     * 
     * @param listStudioComponentsRequest
     * @return Result of the ListStudioComponents operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.ListStudioComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioComponents" target="_top">AWS
     *      API Documentation</a>
     */
    ListStudioComponentsResult listStudioComponents(ListStudioComponentsRequest listStudioComponentsRequest);

    /**
     * <p>
     * Get all users in a given studio membership.
     * </p>
     * 
     * @param listStudioMembersRequest
     * @return Result of the ListStudioMembers operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.ListStudioMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListStudioMembersResult listStudioMembers(ListStudioMembersRequest listStudioMembersRequest);

    /**
     * <p>
     * List studios in your AWS account in the requested AWS Region.
     * </p>
     * 
     * @param listStudiosRequest
     * @return Result of the ListStudios operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.ListStudios
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudios" target="_top">AWS API
     *      Documentation</a>
     */
    ListStudiosResult listStudios(ListStudiosRequest listStudiosRequest);

    /**
     * <p>
     * Gets the tags for a resource, given its Amazon Resource Names (ARN).
     * </p>
     * <p>
     * This operation supports ARNs for all resource types in Nimble Studio that support tags, including studio, studio
     * component, launch profile, streaming image, and streaming session. All resources that can be tagged will contain
     * an ARN property, so you do not have to create this ARN yourself.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Add/update users with given persona to launch profile membership.
     * </p>
     * 
     * @param putLaunchProfileMembersRequest
     *        Information about a launch profile membership.
     * @return Result of the PutLaunchProfileMembers operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.PutLaunchProfileMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/PutLaunchProfileMembers" target="_top">AWS
     *      API Documentation</a>
     */
    PutLaunchProfileMembersResult putLaunchProfileMembers(PutLaunchProfileMembersRequest putLaunchProfileMembersRequest);

    /**
     * <p>
     * Add/update users with given persona to studio membership.
     * </p>
     * 
     * @param putStudioMembersRequest
     *        A launch profile membership collection.
     * @return Result of the PutStudioMembers operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.PutStudioMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/PutStudioMembers" target="_top">AWS API
     *      Documentation</a>
     */
    PutStudioMembersResult putStudioMembers(PutStudioMembersRequest putStudioMembersRequest);

    /**
     * <p>
     * Repairs the SSO configuration for a given studio.
     * </p>
     * <p>
     * If the studio has a valid AWS SSO configuration currently associated with it, this operation will fail with a
     * validation error.
     * </p>
     * <p>
     * If the studio does not have a valid AWS SSO configuration currently associated with it, then a new AWS SSO
     * application is created for the studio and the studio is changed to the READY state.
     * </p>
     * <p>
     * After the AWS SSO application is repaired, you must use the Amazon Nimble Studio console to add administrators
     * and users to your studio.
     * </p>
     * 
     * @param startStudioSSOConfigurationRepairRequest
     * @return Result of the StartStudioSSOConfigurationRepair operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.StartStudioSSOConfigurationRepair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StartStudioSSOConfigurationRepair"
     *      target="_top">AWS API Documentation</a>
     */
    StartStudioSSOConfigurationRepairResult startStudioSSOConfigurationRepair(StartStudioSSOConfigurationRepairRequest startStudioSSOConfigurationRepairRequest);

    /**
     * <p>
     * Creates tags for a resource, given its ARN.
     * </p>
     * 
     * @param tagResourceRequest
     *        The ARN for the role that manages access.
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update a launch profile.
     * </p>
     * 
     * @param updateLaunchProfileRequest
     *        The launch profile ID.
     * @return Result of the UpdateLaunchProfile operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.UpdateLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLaunchProfileResult updateLaunchProfile(UpdateLaunchProfileRequest updateLaunchProfileRequest);

    /**
     * <p>
     * Update a user persona in launch profile membership.
     * </p>
     * 
     * @param updateLaunchProfileMemberRequest
     *        The principal ID.
     * @return Result of the UpdateLaunchProfileMember operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.UpdateLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateLaunchProfileMember"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLaunchProfileMemberResult updateLaunchProfileMember(UpdateLaunchProfileMemberRequest updateLaunchProfileMemberRequest);

    /**
     * <p>
     * Update streaming image.
     * </p>
     * 
     * @param updateStreamingImageRequest
     *        The streaming image ID.
     * @return Result of the UpdateStreamingImage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.UpdateStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateStreamingImageResult updateStreamingImage(UpdateStreamingImageRequest updateStreamingImageRequest);

    /**
     * <p>
     * Update a Studio resource.
     * </p>
     * <p>
     * Currently, this operation only supports updating the displayName of your studio.
     * </p>
     * 
     * @param updateStudioRequest
     *        The studio ID.
     * @return Result of the UpdateStudio operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.UpdateStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStudio" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateStudioResult updateStudio(UpdateStudioRequest updateStudioRequest);

    /**
     * <p>
     * Updates a studio component resource.
     * </p>
     * 
     * @param updateStudioComponentRequest
     *        The studio component ID.
     * @return Result of the UpdateStudioComponent operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         A service fault has occurred. Please retry your request and contact AWS support if this error continues.
     * @throws ServiceQuotaExceededException
     *         This request would cause a service quota to be exceeded. Please use the AWS Service Quotas console to
     *         request an increase.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please retry your request.
     * @throws ConflictException
     *         This request conflicts with another concurrent request. Please retry your request.
     * @sample AmazonNimbleStudio.UpdateStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateStudioComponentResult updateStudioComponent(UpdateStudioComponentRequest updateStudioComponentRequest);

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
