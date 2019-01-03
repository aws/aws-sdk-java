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
 * <p>
 * The AWS Serverless Application Repository makes it easy for developers and enterprises to quickly find and deploy
 * serverless applications in the AWS Cloud. For more information about serverless applications, see Serverless
 * Computing and Applications on the AWS website.
 * </p>
 * <p>
 * The AWS Serverless Application Repository is deeply integrated with the AWS Lambda console, so that developers of all
 * levels can get started with serverless computing without needing to learn anything new. You can use category keywords
 * to browse for applications such as web and mobile backends, data processing applications, or chatbots. You can also
 * search for applications by name, publisher, or event source. To use an application, you simply choose it, configure
 * any required fields, and deploy it with a few clicks.
 * </p>
 * <p>
 * You can also easily publish applications, sharing them publicly with the community at large, or privately within your
 * team or across your organization. To publish a serverless application (or app), you can use the AWS Management
 * Console, AWS Command Line Interface (AWS CLI), or AWS SDKs to upload the code. Along with the code, you upload a
 * simple manifest file, also known as the AWS Serverless Application Model (AWS SAM) template. For more information
 * about AWS SAM, see AWS Serverless Application Model (AWS SAM) on the AWS Labs GitHub repository.
 * </p>
 * <p>
 * The AWS Serverless Application Repository Developer Guide contains more information about the two developer
 * experiences available:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Consuming Applications – Browse for applications and view information about them, including source code and readme
 * files. Also install, configure, and deploy applications of your choosing.
 * </p>
 * <p>
 * Publishing Applications – Configure and upload applications to make them available to other developers, and publish
 * new versions of applications.
 * </p>
 * </li>
 * </ul>
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
     * <p>
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same
     * call.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ConflictException
     *         The resource already exists.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an application version.
     * </p>
     * 
     * @param createApplicationVersionRequest
     * @return Result of the CreateApplicationVersion operation returned by the service.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ConflictException
     *         The resource already exists.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.CreateApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationVersionResult createApplicationVersion(CreateApplicationVersionRequest createApplicationVersionRequest);

    /**
     * <p>
     * Creates an AWS CloudFormation change set for the given application.
     * </p>
     * 
     * @param createCloudFormationChangeSetRequest
     * @return Result of the CreateCloudFormationChangeSet operation returned by the service.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.CreateCloudFormationChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCloudFormationChangeSetResult createCloudFormationChangeSet(CreateCloudFormationChangeSetRequest createCloudFormationChangeSetRequest);

    /**
     * <p>
     * Creates an AWS CloudFormation template.
     * </p>
     * 
     * @param createCloudFormationTemplateRequest
     * @return Result of the CreateCloudFormationTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.CreateCloudFormationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCloudFormationTemplateResult createCloudFormationTemplate(CreateCloudFormationTemplateRequest createCloudFormationTemplateRequest);

    /**
     * <p>
     * Deletes the specified application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AWSServerlessApplicationRepository.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Gets the specified application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplication" target="_top">AWS
     *      API Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Retrieves the policy for the application.
     * </p>
     * 
     * @param getApplicationPolicyRequest
     * @return Result of the GetApplicationPolicy operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.GetApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationPolicyResult getApplicationPolicy(GetApplicationPolicyRequest getApplicationPolicyRequest);

    /**
     * <p>
     * Gets the specified AWS CloudFormation template.
     * </p>
     * 
     * @param getCloudFormationTemplateRequest
     * @return Result of the GetCloudFormationTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.GetCloudFormationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetCloudFormationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetCloudFormationTemplateResult getCloudFormationTemplate(GetCloudFormationTemplateRequest getCloudFormationTemplateRequest);

    /**
     * <p>
     * Retrieves the list of applications nested in the containing application.
     * </p>
     * 
     * @param listApplicationDependenciesRequest
     * @return Result of the ListApplicationDependencies operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.ListApplicationDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplicationDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationDependenciesResult listApplicationDependencies(ListApplicationDependenciesRequest listApplicationDependenciesRequest);

    /**
     * <p>
     * Lists versions for the specified application.
     * </p>
     * 
     * @param listApplicationVersionsRequest
     * @return Result of the ListApplicationVersions operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.ListApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplicationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationVersionsResult listApplicationVersions(ListApplicationVersionsRequest listApplicationVersionsRequest);

    /**
     * <p>
     * Lists applications owned by the requester.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Sets the permission policy for an application. For the list of actions supported for this operation, see <a href=
     * "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     * >Application Permissions</a> .
     * </p>
     * 
     * @param putApplicationPolicyRequest
     * @return Result of the PutApplicationPolicy operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.PutApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/PutApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutApplicationPolicyResult putApplicationPolicy(PutApplicationPolicyRequest putApplicationPolicyRequest);

    /**
     * <p>
     * Updates the specified application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws ConflictException
     *         The resource already exists.
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
