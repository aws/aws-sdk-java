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

import com.amazonaws.services.serverlessapplicationrepository.model.*;

/**
 * Interface for accessing AWSServerlessApplicationRepository asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.serverlessapplicationrepository.AbstractAWSServerlessApplicationRepositoryAsync}
 * instead.
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
public interface AWSServerlessApplicationRepositoryAsync extends AWSServerlessApplicationRepository {

    /**
     * <p>
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same
     * call.
     * </p>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same
     * call.
     * </p>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates an application version.
     * </p>
     * 
     * @param createApplicationVersionRequest
     * @return A Java Future containing the result of the CreateApplicationVersion operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.CreateApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(CreateApplicationVersionRequest createApplicationVersionRequest);

    /**
     * <p>
     * Creates an application version.
     * </p>
     * 
     * @param createApplicationVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplicationVersion operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.CreateApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(CreateApplicationVersionRequest createApplicationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationVersionRequest, CreateApplicationVersionResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS CloudFormation change set for the given application.
     * </p>
     * 
     * @param createCloudFormationChangeSetRequest
     * @return A Java Future containing the result of the CreateCloudFormationChangeSet operation returned by the
     *         service.
     * @sample AWSServerlessApplicationRepositoryAsync.CreateCloudFormationChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFormationChangeSetResult> createCloudFormationChangeSetAsync(
            CreateCloudFormationChangeSetRequest createCloudFormationChangeSetRequest);

    /**
     * <p>
     * Creates an AWS CloudFormation change set for the given application.
     * </p>
     * 
     * @param createCloudFormationChangeSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCloudFormationChangeSet operation returned by the
     *         service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.CreateCloudFormationChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFormationChangeSetResult> createCloudFormationChangeSetAsync(
            CreateCloudFormationChangeSetRequest createCloudFormationChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCloudFormationChangeSetRequest, CreateCloudFormationChangeSetResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS CloudFormation template.
     * </p>
     * 
     * @param createCloudFormationTemplateRequest
     * @return A Java Future containing the result of the CreateCloudFormationTemplate operation returned by the
     *         service.
     * @sample AWSServerlessApplicationRepositoryAsync.CreateCloudFormationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFormationTemplateResult> createCloudFormationTemplateAsync(
            CreateCloudFormationTemplateRequest createCloudFormationTemplateRequest);

    /**
     * <p>
     * Creates an AWS CloudFormation template.
     * </p>
     * 
     * @param createCloudFormationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCloudFormationTemplate operation returned by the
     *         service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.CreateCloudFormationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFormationTemplateResult> createCloudFormationTemplateAsync(
            CreateCloudFormationTemplateRequest createCloudFormationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCloudFormationTemplateRequest, CreateCloudFormationTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes the specified application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Gets the specified application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Gets the specified application.
     * </p>
     * 
     * @param getApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the policy for the application.
     * </p>
     * 
     * @param getApplicationPolicyRequest
     * @return A Java Future containing the result of the GetApplicationPolicy operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.GetApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationPolicyResult> getApplicationPolicyAsync(GetApplicationPolicyRequest getApplicationPolicyRequest);

    /**
     * <p>
     * Retrieves the policy for the application.
     * </p>
     * 
     * @param getApplicationPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationPolicy operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.GetApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationPolicyResult> getApplicationPolicyAsync(GetApplicationPolicyRequest getApplicationPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationPolicyRequest, GetApplicationPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets the specified AWS CloudFormation template.
     * </p>
     * 
     * @param getCloudFormationTemplateRequest
     * @return A Java Future containing the result of the GetCloudFormationTemplate operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.GetCloudFormationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetCloudFormationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCloudFormationTemplateResult> getCloudFormationTemplateAsync(
            GetCloudFormationTemplateRequest getCloudFormationTemplateRequest);

    /**
     * <p>
     * Gets the specified AWS CloudFormation template.
     * </p>
     * 
     * @param getCloudFormationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCloudFormationTemplate operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.GetCloudFormationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetCloudFormationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCloudFormationTemplateResult> getCloudFormationTemplateAsync(
            GetCloudFormationTemplateRequest getCloudFormationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCloudFormationTemplateRequest, GetCloudFormationTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of applications nested in the containing application.
     * </p>
     * 
     * @param listApplicationDependenciesRequest
     * @return A Java Future containing the result of the ListApplicationDependencies operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.ListApplicationDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplicationDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationDependenciesResult> listApplicationDependenciesAsync(
            ListApplicationDependenciesRequest listApplicationDependenciesRequest);

    /**
     * <p>
     * Retrieves the list of applications nested in the containing application.
     * </p>
     * 
     * @param listApplicationDependenciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationDependencies operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.ListApplicationDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplicationDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationDependenciesResult> listApplicationDependenciesAsync(
            ListApplicationDependenciesRequest listApplicationDependenciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationDependenciesRequest, ListApplicationDependenciesResult> asyncHandler);

    /**
     * <p>
     * Lists versions for the specified application.
     * </p>
     * 
     * @param listApplicationVersionsRequest
     * @return A Java Future containing the result of the ListApplicationVersions operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.ListApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplicationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationVersionsResult> listApplicationVersionsAsync(ListApplicationVersionsRequest listApplicationVersionsRequest);

    /**
     * <p>
     * Lists versions for the specified application.
     * </p>
     * 
     * @param listApplicationVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationVersions operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.ListApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplicationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationVersionsResult> listApplicationVersionsAsync(ListApplicationVersionsRequest listApplicationVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationVersionsRequest, ListApplicationVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists applications owned by the requester.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists applications owned by the requester.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Sets the permission policy for an application. For the list of actions supported for this operation, see <a href=
     * "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     * >Application Permissions</a> .
     * </p>
     * 
     * @param putApplicationPolicyRequest
     * @return A Java Future containing the result of the PutApplicationPolicy operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.PutApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/PutApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationPolicyResult> putApplicationPolicyAsync(PutApplicationPolicyRequest putApplicationPolicyRequest);

    /**
     * <p>
     * Sets the permission policy for an application. For the list of actions supported for this operation, see <a href=
     * "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     * >Application Permissions</a> .
     * </p>
     * 
     * @param putApplicationPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutApplicationPolicy operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.PutApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/PutApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationPolicyResult> putApplicationPolicyAsync(PutApplicationPolicyRequest putApplicationPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutApplicationPolicyRequest, PutApplicationPolicyResult> asyncHandler);

    /**
     * <p>
     * Updates the specified application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates the specified application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

}
