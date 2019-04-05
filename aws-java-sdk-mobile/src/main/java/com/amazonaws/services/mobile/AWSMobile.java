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
package com.amazonaws.services.mobile;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mobile.model.*;

/**
 * Interface for accessing AWS Mobile.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mobile.AbstractAWSMobile} instead.
 * </p>
 * <p>
 * <p>
 * AWS Mobile Service provides mobile app and website developers with capabilities required to configure AWS resources
 * and bootstrap their developer desktop projects with the necessary SDKs, constants, tools and samples to make use of
 * those resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMobile {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mobile";

    /**
     * <p>
     * Creates an AWS Mobile Hub project.
     * </p>
     * 
     * @param createProjectRequest
     *        Request structure used to request a project be created.
     * @return Result of the CreateProject operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @throws LimitExceededException
     *         There are too many AWS Mobile Hub projects in the account or the account has exceeded the maximum number
     *         of resources in some AWS service. You should create another sub-account using AWS Organizations or remove
     *         some resources and retry your request.
     * @sample AWSMobile.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Delets a project in AWS Mobile Hub.
     * </p>
     * 
     * @param deleteProjectRequest
     *        Request structure used to request a project be deleted.
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @sample AWSMobile.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Get the bundle details for the requested bundle id.
     * </p>
     * 
     * @param describeBundleRequest
     *        Request structure to request the details of a specific bundle.
     * @return Result of the DescribeBundle operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @sample AWSMobile.DescribeBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DescribeBundle" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBundleResult describeBundle(DescribeBundleRequest describeBundleRequest);

    /**
     * <p>
     * Gets details about a project in AWS Mobile Hub.
     * </p>
     * 
     * @param describeProjectRequest
     *        Request structure used to request details about a project.
     * @return Result of the DescribeProject operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @sample AWSMobile.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeProjectResult describeProject(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile
     * app clients with backend AWS resources.
     * </p>
     * 
     * @param exportBundleRequest
     *        Request structure used to request generation of custom SDK and tool packages required to integrate mobile
     *        web or app clients with backed AWS resources.
     * @return Result of the ExportBundle operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @sample AWSMobile.ExportBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportBundle" target="_top">AWS API
     *      Documentation</a>
     */
    ExportBundleResult exportBundle(ExportBundleRequest exportBundleRequest);

    /**
     * <p>
     * Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push
     * credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS
     * account.
     * </p>
     * 
     * @param exportProjectRequest
     *        Request structure used in requests to export project configuration details.
     * @return Result of the ExportProject operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @sample AWSMobile.ExportProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportProject" target="_top">AWS API
     *      Documentation</a>
     */
    ExportProjectResult exportProject(ExportProjectRequest exportProjectRequest);

    /**
     * <p>
     * List all available bundles.
     * </p>
     * 
     * @param listBundlesRequest
     *        Request structure to request all available bundles.
     * @return Result of the ListBundles operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @sample AWSMobile.ListBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ListBundles" target="_top">AWS API
     *      Documentation</a>
     */
    ListBundlesResult listBundles(ListBundlesRequest listBundlesRequest);

    /**
     * <p>
     * Lists projects in AWS Mobile Hub.
     * </p>
     * 
     * @param listProjectsRequest
     *        Request structure used to request projects list in AWS Mobile Hub.
     * @return Result of the ListProjects operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @sample AWSMobile.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Update an existing project.
     * </p>
     * 
     * @param updateProjectRequest
     *        Request structure used for requests to update project configuration.
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @throws AccountActionRequiredException
     *         Account Action is required in order to continue the request.
     * @throws LimitExceededException
     *         There are too many AWS Mobile Hub projects in the account or the account has exceeded the maximum number
     *         of resources in some AWS service. You should create another sub-account using AWS Organizations or remove
     *         some resources and retry your request.
     * @sample AWSMobile.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

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
