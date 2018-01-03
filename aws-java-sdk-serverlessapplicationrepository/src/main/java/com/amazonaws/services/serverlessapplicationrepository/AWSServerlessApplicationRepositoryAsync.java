/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS Serverless Repository
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSServerlessApplicationRepositoryAsync extends AWSServerlessApplicationRepository {

    /**
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same
     * call.
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same
     * call.
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
     * Creates an application version.
     * 
     * @param createApplicationVersionRequest
     * @return A Java Future containing the result of the CreateApplicationVersion operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.CreateApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(CreateApplicationVersionRequest createApplicationVersionRequest);

    /**
     * Creates an application version.
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
     * Creates an AWS CloudFormation ChangeSet for the given application.
     * 
     * @param createCloudFormationChangeSetRequest
     *        Create application ChangeSet request
     * @return A Java Future containing the result of the CreateCloudFormationChangeSet operation returned by the
     *         service.
     * @sample AWSServerlessApplicationRepositoryAsync.CreateCloudFormationChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFormationChangeSetResult> createCloudFormationChangeSetAsync(
            CreateCloudFormationChangeSetRequest createCloudFormationChangeSetRequest);

    /**
     * Creates an AWS CloudFormation ChangeSet for the given application.
     * 
     * @param createCloudFormationChangeSetRequest
     *        Create application ChangeSet request
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
     * Gets the specified application.
     * 
     * @param getApplicationRequest
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest);

    /**
     * Gets the specified application.
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
     * Gets the policy for the specified application.
     * 
     * @param getApplicationPolicyRequest
     * @return A Java Future containing the result of the GetApplicationPolicy operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.GetApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationPolicyResult> getApplicationPolicyAsync(GetApplicationPolicyRequest getApplicationPolicyRequest);

    /**
     * Gets the policy for the specified application.
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
     * Lists versions for the specified application.
     * 
     * @param listApplicationVersionsRequest
     * @return A Java Future containing the result of the ListApplicationVersions operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.ListApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplicationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationVersionsResult> listApplicationVersionsAsync(ListApplicationVersionsRequest listApplicationVersionsRequest);

    /**
     * Lists versions for the specified application.
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
     * Lists applications owned by the requester.
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * Lists applications owned by the requester.
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
     * Puts the policy for the specified application.
     * 
     * @param putApplicationPolicyRequest
     *        Put policy request
     * @return A Java Future containing the result of the PutApplicationPolicy operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.PutApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/PutApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationPolicyResult> putApplicationPolicyAsync(PutApplicationPolicyRequest putApplicationPolicyRequest);

    /**
     * Puts the policy for the specified application.
     * 
     * @param putApplicationPolicyRequest
     *        Put policy request
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
     * Updates the specified application.
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSServerlessApplicationRepositoryAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * Updates the specified application.
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
