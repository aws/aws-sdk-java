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
package com.amazonaws.services.serverlessapplicationrepository;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.serverlessapplicationrepository.model.*;

/**
 * Interface for accessing AWSServerlessApplicationRepository.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.serverlessapplicationrepository.AbstractAWSServerlessApplicationRepository} instead.
 * </p>
 * <p>
 * AWS Serverless Repository
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSServerlessApplicationRepository {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "serverlessrepo";

    /**
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same
     * call.
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ConflictException
     *         409 response
     * @throws ForbiddenException
     *         403 response
     * @sample AWSServerlessApplicationRepository.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * Creates an application version.
     * 
     * @param createApplicationVersionRequest
     * @return Result of the CreateApplicationVersion operation returned by the service.
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ConflictException
     *         409 response
     * @throws ForbiddenException
     *         403 response
     * @sample AWSServerlessApplicationRepository.CreateApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationVersionResult createApplicationVersion(CreateApplicationVersionRequest createApplicationVersionRequest);

    /**
     * Creates an AWS CloudFormation ChangeSet for the given application.
     * 
     * @param createCloudFormationChangeSetRequest
     *        Create application ChangeSet request
     * @return Result of the CreateCloudFormationChangeSet operation returned by the service.
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @sample AWSServerlessApplicationRepository.CreateCloudFormationChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCloudFormationChangeSetResult createCloudFormationChangeSet(CreateCloudFormationChangeSetRequest createCloudFormationChangeSetRequest);

    /**
     * Gets the specified application.
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @sample AWSServerlessApplicationRepository.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplication" target="_top">AWS
     *      API Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * Gets the policy for the specified application.
     * 
     * @param getApplicationPolicyRequest
     * @return Result of the GetApplicationPolicy operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @sample AWSServerlessApplicationRepository.GetApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationPolicyResult getApplicationPolicy(GetApplicationPolicyRequest getApplicationPolicyRequest);

    /**
     * Lists versions for the specified application.
     * 
     * @param listApplicationVersionsRequest
     * @return Result of the ListApplicationVersions operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @sample AWSServerlessApplicationRepository.ListApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplicationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationVersionsResult listApplicationVersions(ListApplicationVersionsRequest listApplicationVersionsRequest);

    /**
     * Lists applications owned by the requester.
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @sample AWSServerlessApplicationRepository.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * Puts the policy for the specified application.
     * 
     * @param putApplicationPolicyRequest
     *        Put policy request
     * @return Result of the PutApplicationPolicy operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @sample AWSServerlessApplicationRepository.PutApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/PutApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutApplicationPolicyResult putApplicationPolicy(PutApplicationPolicyRequest putApplicationPolicyRequest);

    /**
     * Updates the specified application.
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSServerlessApplicationRepository.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

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
