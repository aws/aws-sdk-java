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
package com.amazonaws.services.greengrass;

import javax.annotation.Generated;

import com.amazonaws.services.greengrass.model.*;

/**
 * Interface for accessing AWS Greengrass asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.greengrass.AbstractAWSGreengrassAsync} instead.
 * </p>
 * <p>
 * AWS Greengrass seamlessly extends AWS onto physical devices so they can act locally on the data they generate, while
 * still using the cloud for management, analytics, and durable storage. AWS Greengrass ensures your devices can respond
 * quickly to local events and operate with intermittent connectivity. AWS Greengrass minimizes the cost of transmitting
 * data to the cloud by allowing you to author AWS Lambda functions that execute locally.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGreengrassAsync extends AWSGreengrass {

    /**
     * Associates a role with a group. The role will be used by the AWS Greengrass core in order to access AWS cloud
     * services. The role's permissions will allow Greengrass core Lambda functions to perform actions against the
     * cloud.
     * 
     * @param associateRoleToGroupRequest
     * @return A Java Future containing the result of the AssociateRoleToGroup operation returned by the service.
     * @sample AWSGreengrassAsync.AssociateRoleToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/AssociateRoleToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateRoleToGroupResult> associateRoleToGroupAsync(AssociateRoleToGroupRequest associateRoleToGroupRequest);

    /**
     * Associates a role with a group. The role will be used by the AWS Greengrass core in order to access AWS cloud
     * services. The role's permissions will allow Greengrass core Lambda functions to perform actions against the
     * cloud.
     * 
     * @param associateRoleToGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateRoleToGroup operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.AssociateRoleToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/AssociateRoleToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateRoleToGroupResult> associateRoleToGroupAsync(AssociateRoleToGroupRequest associateRoleToGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateRoleToGroupRequest, AssociateRoleToGroupResult> asyncHandler);

    /**
     * Associates a role which is used by AWS Greengrass. AWS Greengrass uses the role to access your Lambda functions
     * and AWS IoT resources. This is necessary for deployments to succeed. It needs to have minimum permissions in
     * policy ``AWSGreengrassResourceAccessRolePolicy``
     * 
     * @param associateServiceRoleToAccountRequest
     * @return A Java Future containing the result of the AssociateServiceRoleToAccount operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.AssociateServiceRoleToAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/AssociateServiceRoleToAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateServiceRoleToAccountResult> associateServiceRoleToAccountAsync(
            AssociateServiceRoleToAccountRequest associateServiceRoleToAccountRequest);

    /**
     * Associates a role which is used by AWS Greengrass. AWS Greengrass uses the role to access your Lambda functions
     * and AWS IoT resources. This is necessary for deployments to succeed. It needs to have minimum permissions in
     * policy ``AWSGreengrassResourceAccessRolePolicy``
     * 
     * @param associateServiceRoleToAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateServiceRoleToAccount operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.AssociateServiceRoleToAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/AssociateServiceRoleToAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateServiceRoleToAccountResult> associateServiceRoleToAccountAsync(
            AssociateServiceRoleToAccountRequest associateServiceRoleToAccountRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateServiceRoleToAccountRequest, AssociateServiceRoleToAccountResult> asyncHandler);

    /**
     * Creates a core definition. You may optionally provide the initial version of the core definition or use
     * ''CreateCoreDefinitionVersion'' at a later time. AWS Greengrass Groups must each contain exactly 1 AWS Greengrass
     * Core.
     * 
     * @param createCoreDefinitionRequest
     *        Information on the core definition request
     * @return A Java Future containing the result of the CreateCoreDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.CreateCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateCoreDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCoreDefinitionResult> createCoreDefinitionAsync(CreateCoreDefinitionRequest createCoreDefinitionRequest);

    /**
     * Creates a core definition. You may optionally provide the initial version of the core definition or use
     * ''CreateCoreDefinitionVersion'' at a later time. AWS Greengrass Groups must each contain exactly 1 AWS Greengrass
     * Core.
     * 
     * @param createCoreDefinitionRequest
     *        Information on the core definition request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCoreDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.CreateCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateCoreDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCoreDefinitionResult> createCoreDefinitionAsync(CreateCoreDefinitionRequest createCoreDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCoreDefinitionRequest, CreateCoreDefinitionResult> asyncHandler);

    /**
     * Creates a version of a core definition that has already been defined. AWS Greengrass Groups must each contain
     * exactly 1 AWS Greengrass Core.
     * 
     * @param createCoreDefinitionVersionRequest
     * @return A Java Future containing the result of the CreateCoreDefinitionVersion operation returned by the service.
     * @sample AWSGreengrassAsync.CreateCoreDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateCoreDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCoreDefinitionVersionResult> createCoreDefinitionVersionAsync(
            CreateCoreDefinitionVersionRequest createCoreDefinitionVersionRequest);

    /**
     * Creates a version of a core definition that has already been defined. AWS Greengrass Groups must each contain
     * exactly 1 AWS Greengrass Core.
     * 
     * @param createCoreDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCoreDefinitionVersion operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.CreateCoreDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateCoreDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCoreDefinitionVersionResult> createCoreDefinitionVersionAsync(
            CreateCoreDefinitionVersionRequest createCoreDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCoreDefinitionVersionRequest, CreateCoreDefinitionVersionResult> asyncHandler);

    /**
     * Creates a deployment.
     * 
     * @param createDeploymentRequest
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSGreengrassAsync.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest);

    /**
     * Creates a deployment.
     * 
     * @param createDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * Creates a device definition. You may optinally provide the initial version of the device definition or use
     * ``CreateDeviceDefinitionVersion`` at a later time.
     * 
     * @param createDeviceDefinitionRequest
     * @return A Java Future containing the result of the CreateDeviceDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.CreateDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeviceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeviceDefinitionResult> createDeviceDefinitionAsync(CreateDeviceDefinitionRequest createDeviceDefinitionRequest);

    /**
     * Creates a device definition. You may optinally provide the initial version of the device definition or use
     * ``CreateDeviceDefinitionVersion`` at a later time.
     * 
     * @param createDeviceDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeviceDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.CreateDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeviceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeviceDefinitionResult> createDeviceDefinitionAsync(CreateDeviceDefinitionRequest createDeviceDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeviceDefinitionRequest, CreateDeviceDefinitionResult> asyncHandler);

    /**
     * Creates a version of a device definition that has already been defined.
     * 
     * @param createDeviceDefinitionVersionRequest
     * @return A Java Future containing the result of the CreateDeviceDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.CreateDeviceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeviceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeviceDefinitionVersionResult> createDeviceDefinitionVersionAsync(
            CreateDeviceDefinitionVersionRequest createDeviceDefinitionVersionRequest);

    /**
     * Creates a version of a device definition that has already been defined.
     * 
     * @param createDeviceDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeviceDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.CreateDeviceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeviceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeviceDefinitionVersionResult> createDeviceDefinitionVersionAsync(
            CreateDeviceDefinitionVersionRequest createDeviceDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeviceDefinitionVersionRequest, CreateDeviceDefinitionVersionResult> asyncHandler);

    /**
     * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be
     * used in a group. You can create an initial version of the definition by providing a list of Lambda functions and
     * their configurations now, or use ``CreateFunctionDefinitionVersion`` later.
     * 
     * @param createFunctionDefinitionRequest
     * @return A Java Future containing the result of the CreateFunctionDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.CreateFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionDefinitionResult> createFunctionDefinitionAsync(CreateFunctionDefinitionRequest createFunctionDefinitionRequest);

    /**
     * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be
     * used in a group. You can create an initial version of the definition by providing a list of Lambda functions and
     * their configurations now, or use ``CreateFunctionDefinitionVersion`` later.
     * 
     * @param createFunctionDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFunctionDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.CreateFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionDefinitionResult> createFunctionDefinitionAsync(CreateFunctionDefinitionRequest createFunctionDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFunctionDefinitionRequest, CreateFunctionDefinitionResult> asyncHandler);

    /**
     * Create a version of a Lambda function definition that has already been defined.
     * 
     * @param createFunctionDefinitionVersionRequest
     *        Function definition version
     * @return A Java Future containing the result of the CreateFunctionDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.CreateFunctionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateFunctionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionDefinitionVersionResult> createFunctionDefinitionVersionAsync(
            CreateFunctionDefinitionVersionRequest createFunctionDefinitionVersionRequest);

    /**
     * Create a version of a Lambda function definition that has already been defined.
     * 
     * @param createFunctionDefinitionVersionRequest
     *        Function definition version
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFunctionDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.CreateFunctionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateFunctionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionDefinitionVersionResult> createFunctionDefinitionVersionAsync(
            CreateFunctionDefinitionVersionRequest createFunctionDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFunctionDefinitionVersionRequest, CreateFunctionDefinitionVersionResult> asyncHandler);

    /**
     * Creates a group. You may optionally provide the initial version of the group or use ''CreateGroupVersion'' at a
     * later time.
     * 
     * @param createGroupRequest
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSGreengrassAsync.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest);

    /**
     * Creates a group. You may optionally provide the initial version of the group or use ''CreateGroupVersion'' at a
     * later time.
     * 
     * @param createGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler);

    /**
     * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
     * 
     * @param createGroupCertificateAuthorityRequest
     * @return A Java Future containing the result of the CreateGroupCertificateAuthority operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.CreateGroupCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroupCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupCertificateAuthorityResult> createGroupCertificateAuthorityAsync(
            CreateGroupCertificateAuthorityRequest createGroupCertificateAuthorityRequest);

    /**
     * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
     * 
     * @param createGroupCertificateAuthorityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroupCertificateAuthority operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.CreateGroupCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroupCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupCertificateAuthorityResult> createGroupCertificateAuthorityAsync(
            CreateGroupCertificateAuthorityRequest createGroupCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupCertificateAuthorityRequest, CreateGroupCertificateAuthorityResult> asyncHandler);

    /**
     * Creates a version of a group which has already been defined.
     * 
     * @param createGroupVersionRequest
     * @return A Java Future containing the result of the CreateGroupVersion operation returned by the service.
     * @sample AWSGreengrassAsync.CreateGroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroupVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupVersionResult> createGroupVersionAsync(CreateGroupVersionRequest createGroupVersionRequest);

    /**
     * Creates a version of a group which has already been defined.
     * 
     * @param createGroupVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroupVersion operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.CreateGroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroupVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupVersionResult> createGroupVersionAsync(CreateGroupVersionRequest createGroupVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupVersionRequest, CreateGroupVersionResult> asyncHandler);

    /**
     * Creates a logger definition. You may optionally provide the initial version of the logger definition or use
     * ``CreateLoggerDefinitionVersion`` at a later time.
     * 
     * @param createLoggerDefinitionRequest
     * @return A Java Future containing the result of the CreateLoggerDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.CreateLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateLoggerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoggerDefinitionResult> createLoggerDefinitionAsync(CreateLoggerDefinitionRequest createLoggerDefinitionRequest);

    /**
     * Creates a logger definition. You may optionally provide the initial version of the logger definition or use
     * ``CreateLoggerDefinitionVersion`` at a later time.
     * 
     * @param createLoggerDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoggerDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.CreateLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateLoggerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoggerDefinitionResult> createLoggerDefinitionAsync(CreateLoggerDefinitionRequest createLoggerDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoggerDefinitionRequest, CreateLoggerDefinitionResult> asyncHandler);

    /**
     * Creates a version of a logger definition that has already been defined.
     * 
     * @param createLoggerDefinitionVersionRequest
     * @return A Java Future containing the result of the CreateLoggerDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.CreateLoggerDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateLoggerDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoggerDefinitionVersionResult> createLoggerDefinitionVersionAsync(
            CreateLoggerDefinitionVersionRequest createLoggerDefinitionVersionRequest);

    /**
     * Creates a version of a logger definition that has already been defined.
     * 
     * @param createLoggerDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoggerDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.CreateLoggerDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateLoggerDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoggerDefinitionVersionResult> createLoggerDefinitionVersionAsync(
            CreateLoggerDefinitionVersionRequest createLoggerDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoggerDefinitionVersionRequest, CreateLoggerDefinitionVersionResult> asyncHandler);

    /**
     * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial
     * version of the definition by providing a list of resources now, or use ``CreateResourceDefinitionVersion`` later.
     * 
     * @param createResourceDefinitionRequest
     * @return A Java Future containing the result of the CreateResourceDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.CreateResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceDefinitionResult> createResourceDefinitionAsync(CreateResourceDefinitionRequest createResourceDefinitionRequest);

    /**
     * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial
     * version of the definition by providing a list of resources now, or use ``CreateResourceDefinitionVersion`` later.
     * 
     * @param createResourceDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResourceDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.CreateResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceDefinitionResult> createResourceDefinitionAsync(CreateResourceDefinitionRequest createResourceDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceDefinitionRequest, CreateResourceDefinitionResult> asyncHandler);

    /**
     * Create a version of a resource definition that has already been defined.
     * 
     * @param createResourceDefinitionVersionRequest
     * @return A Java Future containing the result of the CreateResourceDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.CreateResourceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateResourceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceDefinitionVersionResult> createResourceDefinitionVersionAsync(
            CreateResourceDefinitionVersionRequest createResourceDefinitionVersionRequest);

    /**
     * Create a version of a resource definition that has already been defined.
     * 
     * @param createResourceDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResourceDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.CreateResourceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateResourceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceDefinitionVersionResult> createResourceDefinitionVersionAsync(
            CreateResourceDefinitionVersionRequest createResourceDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceDefinitionVersionRequest, CreateResourceDefinitionVersionResult> asyncHandler);

    /**
     * Creates an Iot Job that will trigger your Greengrass Cores to update the software they are running.
     * 
     * @param createSoftwareUpdateJobRequest
     * @return A Java Future containing the result of the CreateSoftwareUpdateJob operation returned by the service.
     * @sample AWSGreengrassAsync.CreateSoftwareUpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSoftwareUpdateJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSoftwareUpdateJobResult> createSoftwareUpdateJobAsync(CreateSoftwareUpdateJobRequest createSoftwareUpdateJobRequest);

    /**
     * Creates an Iot Job that will trigger your Greengrass Cores to update the software they are running.
     * 
     * @param createSoftwareUpdateJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSoftwareUpdateJob operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.CreateSoftwareUpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSoftwareUpdateJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSoftwareUpdateJobResult> createSoftwareUpdateJobAsync(CreateSoftwareUpdateJobRequest createSoftwareUpdateJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSoftwareUpdateJobRequest, CreateSoftwareUpdateJobResult> asyncHandler);

    /**
     * Creates a subscription definition. You may optionally provide the initial version of the subscription definition
     * or use ``CreateSubscriptionDefinitionVersion`` at a later time.
     * 
     * @param createSubscriptionDefinitionRequest
     * @return A Java Future containing the result of the CreateSubscriptionDefinition operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.CreateSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionDefinitionResult> createSubscriptionDefinitionAsync(
            CreateSubscriptionDefinitionRequest createSubscriptionDefinitionRequest);

    /**
     * Creates a subscription definition. You may optionally provide the initial version of the subscription definition
     * or use ``CreateSubscriptionDefinitionVersion`` at a later time.
     * 
     * @param createSubscriptionDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscriptionDefinition operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.CreateSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionDefinitionResult> createSubscriptionDefinitionAsync(
            CreateSubscriptionDefinitionRequest createSubscriptionDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriptionDefinitionRequest, CreateSubscriptionDefinitionResult> asyncHandler);

    /**
     * Creates a version of a subscription definition which has already been defined.
     * 
     * @param createSubscriptionDefinitionVersionRequest
     * @return A Java Future containing the result of the CreateSubscriptionDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.CreateSubscriptionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSubscriptionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionDefinitionVersionResult> createSubscriptionDefinitionVersionAsync(
            CreateSubscriptionDefinitionVersionRequest createSubscriptionDefinitionVersionRequest);

    /**
     * Creates a version of a subscription definition which has already been defined.
     * 
     * @param createSubscriptionDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscriptionDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.CreateSubscriptionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSubscriptionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionDefinitionVersionResult> createSubscriptionDefinitionVersionAsync(
            CreateSubscriptionDefinitionVersionRequest createSubscriptionDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriptionDefinitionVersionRequest, CreateSubscriptionDefinitionVersionResult> asyncHandler);

    /**
     * Deletes a core definition. The core definition must not have been used in a deployment.
     * 
     * @param deleteCoreDefinitionRequest
     * @return A Java Future containing the result of the DeleteCoreDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.DeleteCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteCoreDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCoreDefinitionResult> deleteCoreDefinitionAsync(DeleteCoreDefinitionRequest deleteCoreDefinitionRequest);

    /**
     * Deletes a core definition. The core definition must not have been used in a deployment.
     * 
     * @param deleteCoreDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCoreDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.DeleteCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteCoreDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCoreDefinitionResult> deleteCoreDefinitionAsync(DeleteCoreDefinitionRequest deleteCoreDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCoreDefinitionRequest, DeleteCoreDefinitionResult> asyncHandler);

    /**
     * Deletes a device definition. The device definition must not have been used in a deployment.
     * 
     * @param deleteDeviceDefinitionRequest
     * @return A Java Future containing the result of the DeleteDeviceDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.DeleteDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteDeviceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceDefinitionResult> deleteDeviceDefinitionAsync(DeleteDeviceDefinitionRequest deleteDeviceDefinitionRequest);

    /**
     * Deletes a device definition. The device definition must not have been used in a deployment.
     * 
     * @param deleteDeviceDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeviceDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.DeleteDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteDeviceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceDefinitionResult> deleteDeviceDefinitionAsync(DeleteDeviceDefinitionRequest deleteDeviceDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeviceDefinitionRequest, DeleteDeviceDefinitionResult> asyncHandler);

    /**
     * Deletes a Lambda function definition. The Lambda function definition must not have been used in a deployment.
     * 
     * @param deleteFunctionDefinitionRequest
     * @return A Java Future containing the result of the DeleteFunctionDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.DeleteFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionDefinitionResult> deleteFunctionDefinitionAsync(DeleteFunctionDefinitionRequest deleteFunctionDefinitionRequest);

    /**
     * Deletes a Lambda function definition. The Lambda function definition must not have been used in a deployment.
     * 
     * @param deleteFunctionDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFunctionDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.DeleteFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionDefinitionResult> deleteFunctionDefinitionAsync(DeleteFunctionDefinitionRequest deleteFunctionDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionDefinitionRequest, DeleteFunctionDefinitionResult> asyncHandler);

    /**
     * Deletes a group. The group must not have been used in deployment.
     * 
     * @param deleteGroupRequest
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSGreengrassAsync.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest);

    /**
     * Deletes a group. The group must not have been used in deployment.
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler);

    /**
     * Deletes a logger definition. The logger definition must not have been used in a deployment.
     * 
     * @param deleteLoggerDefinitionRequest
     * @return A Java Future containing the result of the DeleteLoggerDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.DeleteLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteLoggerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggerDefinitionResult> deleteLoggerDefinitionAsync(DeleteLoggerDefinitionRequest deleteLoggerDefinitionRequest);

    /**
     * Deletes a logger definition. The logger definition must not have been used in a deployment.
     * 
     * @param deleteLoggerDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoggerDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.DeleteLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteLoggerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggerDefinitionResult> deleteLoggerDefinitionAsync(DeleteLoggerDefinitionRequest deleteLoggerDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoggerDefinitionRequest, DeleteLoggerDefinitionResult> asyncHandler);

    /**
     * Deletes a resource definition.
     * 
     * @param deleteResourceDefinitionRequest
     * @return A Java Future containing the result of the DeleteResourceDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.DeleteResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceDefinitionResult> deleteResourceDefinitionAsync(DeleteResourceDefinitionRequest deleteResourceDefinitionRequest);

    /**
     * Deletes a resource definition.
     * 
     * @param deleteResourceDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourceDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.DeleteResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceDefinitionResult> deleteResourceDefinitionAsync(DeleteResourceDefinitionRequest deleteResourceDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceDefinitionRequest, DeleteResourceDefinitionResult> asyncHandler);

    /**
     * Deletes a subscription definition. The subscription definition must not have been used in a deployment.
     * 
     * @param deleteSubscriptionDefinitionRequest
     * @return A Java Future containing the result of the DeleteSubscriptionDefinition operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.DeleteSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriptionDefinitionResult> deleteSubscriptionDefinitionAsync(
            DeleteSubscriptionDefinitionRequest deleteSubscriptionDefinitionRequest);

    /**
     * Deletes a subscription definition. The subscription definition must not have been used in a deployment.
     * 
     * @param deleteSubscriptionDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscriptionDefinition operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.DeleteSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriptionDefinitionResult> deleteSubscriptionDefinitionAsync(
            DeleteSubscriptionDefinitionRequest deleteSubscriptionDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionDefinitionRequest, DeleteSubscriptionDefinitionResult> asyncHandler);

    /**
     * Disassociates the role from a group.
     * 
     * @param disassociateRoleFromGroupRequest
     * @return A Java Future containing the result of the DisassociateRoleFromGroup operation returned by the service.
     * @sample AWSGreengrassAsync.DisassociateRoleFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DisassociateRoleFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateRoleFromGroupResult> disassociateRoleFromGroupAsync(
            DisassociateRoleFromGroupRequest disassociateRoleFromGroupRequest);

    /**
     * Disassociates the role from a group.
     * 
     * @param disassociateRoleFromGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateRoleFromGroup operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.DisassociateRoleFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DisassociateRoleFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateRoleFromGroupResult> disassociateRoleFromGroupAsync(
            DisassociateRoleFromGroupRequest disassociateRoleFromGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateRoleFromGroupRequest, DisassociateRoleFromGroupResult> asyncHandler);

    /**
     * Disassociates the service role from the account. Without a service role, deployments will not work.
     * 
     * @param disassociateServiceRoleFromAccountRequest
     * @return A Java Future containing the result of the DisassociateServiceRoleFromAccount operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.DisassociateServiceRoleFromAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DisassociateServiceRoleFromAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateServiceRoleFromAccountResult> disassociateServiceRoleFromAccountAsync(
            DisassociateServiceRoleFromAccountRequest disassociateServiceRoleFromAccountRequest);

    /**
     * Disassociates the service role from the account. Without a service role, deployments will not work.
     * 
     * @param disassociateServiceRoleFromAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateServiceRoleFromAccount operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.DisassociateServiceRoleFromAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DisassociateServiceRoleFromAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateServiceRoleFromAccountResult> disassociateServiceRoleFromAccountAsync(
            DisassociateServiceRoleFromAccountRequest disassociateServiceRoleFromAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateServiceRoleFromAccountRequest, DisassociateServiceRoleFromAccountResult> asyncHandler);

    /**
     * Retrieves the role associated with a particular group.
     * 
     * @param getAssociatedRoleRequest
     * @return A Java Future containing the result of the GetAssociatedRole operation returned by the service.
     * @sample AWSGreengrassAsync.GetAssociatedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetAssociatedRole" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAssociatedRoleResult> getAssociatedRoleAsync(GetAssociatedRoleRequest getAssociatedRoleRequest);

    /**
     * Retrieves the role associated with a particular group.
     * 
     * @param getAssociatedRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssociatedRole operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetAssociatedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetAssociatedRole" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAssociatedRoleResult> getAssociatedRoleAsync(GetAssociatedRoleRequest getAssociatedRoleRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssociatedRoleRequest, GetAssociatedRoleResult> asyncHandler);

    /**
     * Retrieves the connectivity information for a core.
     * 
     * @param getConnectivityInfoRequest
     * @return A Java Future containing the result of the GetConnectivityInfo operation returned by the service.
     * @sample AWSGreengrassAsync.GetConnectivityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetConnectivityInfo" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectivityInfoResult> getConnectivityInfoAsync(GetConnectivityInfoRequest getConnectivityInfoRequest);

    /**
     * Retrieves the connectivity information for a core.
     * 
     * @param getConnectivityInfoRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnectivityInfo operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetConnectivityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetConnectivityInfo" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectivityInfoResult> getConnectivityInfoAsync(GetConnectivityInfoRequest getConnectivityInfoRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectivityInfoRequest, GetConnectivityInfoResult> asyncHandler);

    /**
     * Retrieves information about a core definition version.
     * 
     * @param getCoreDefinitionRequest
     * @return A Java Future containing the result of the GetCoreDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.GetCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetCoreDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreDefinitionResult> getCoreDefinitionAsync(GetCoreDefinitionRequest getCoreDefinitionRequest);

    /**
     * Retrieves information about a core definition version.
     * 
     * @param getCoreDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCoreDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetCoreDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreDefinitionResult> getCoreDefinitionAsync(GetCoreDefinitionRequest getCoreDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetCoreDefinitionRequest, GetCoreDefinitionResult> asyncHandler);

    /**
     * Retrieves information about a core definition version.
     * 
     * @param getCoreDefinitionVersionRequest
     * @return A Java Future containing the result of the GetCoreDefinitionVersion operation returned by the service.
     * @sample AWSGreengrassAsync.GetCoreDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetCoreDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreDefinitionVersionResult> getCoreDefinitionVersionAsync(GetCoreDefinitionVersionRequest getCoreDefinitionVersionRequest);

    /**
     * Retrieves information about a core definition version.
     * 
     * @param getCoreDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCoreDefinitionVersion operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetCoreDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetCoreDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreDefinitionVersionResult> getCoreDefinitionVersionAsync(GetCoreDefinitionVersionRequest getCoreDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetCoreDefinitionVersionRequest, GetCoreDefinitionVersionResult> asyncHandler);

    /**
     * Returns the status of a deployment.
     * 
     * @param getDeploymentStatusRequest
     * @return A Java Future containing the result of the GetDeploymentStatus operation returned by the service.
     * @sample AWSGreengrassAsync.GetDeploymentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeploymentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentStatusResult> getDeploymentStatusAsync(GetDeploymentStatusRequest getDeploymentStatusRequest);

    /**
     * Returns the status of a deployment.
     * 
     * @param getDeploymentStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeploymentStatus operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetDeploymentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeploymentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentStatusResult> getDeploymentStatusAsync(GetDeploymentStatusRequest getDeploymentStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentStatusRequest, GetDeploymentStatusResult> asyncHandler);

    /**
     * Retrieves information about a device definition.
     * 
     * @param getDeviceDefinitionRequest
     * @return A Java Future containing the result of the GetDeviceDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.GetDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeviceDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceDefinitionResult> getDeviceDefinitionAsync(GetDeviceDefinitionRequest getDeviceDefinitionRequest);

    /**
     * Retrieves information about a device definition.
     * 
     * @param getDeviceDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeviceDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeviceDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceDefinitionResult> getDeviceDefinitionAsync(GetDeviceDefinitionRequest getDeviceDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceDefinitionRequest, GetDeviceDefinitionResult> asyncHandler);

    /**
     * Retrieves information about a device definition version.
     * 
     * @param getDeviceDefinitionVersionRequest
     * @return A Java Future containing the result of the GetDeviceDefinitionVersion operation returned by the service.
     * @sample AWSGreengrassAsync.GetDeviceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeviceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceDefinitionVersionResult> getDeviceDefinitionVersionAsync(
            GetDeviceDefinitionVersionRequest getDeviceDefinitionVersionRequest);

    /**
     * Retrieves information about a device definition version.
     * 
     * @param getDeviceDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeviceDefinitionVersion operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetDeviceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeviceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceDefinitionVersionResult> getDeviceDefinitionVersionAsync(
            GetDeviceDefinitionVersionRequest getDeviceDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceDefinitionVersionRequest, GetDeviceDefinitionVersionResult> asyncHandler);

    /**
     * Retrieves information about a Lambda function definition, such as its creation time and latest version.
     * 
     * @param getFunctionDefinitionRequest
     * @return A Java Future containing the result of the GetFunctionDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.GetFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionDefinitionResult> getFunctionDefinitionAsync(GetFunctionDefinitionRequest getFunctionDefinitionRequest);

    /**
     * Retrieves information about a Lambda function definition, such as its creation time and latest version.
     * 
     * @param getFunctionDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunctionDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionDefinitionResult> getFunctionDefinitionAsync(GetFunctionDefinitionRequest getFunctionDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionDefinitionRequest, GetFunctionDefinitionResult> asyncHandler);

    /**
     * Retrieves information about a Lambda function definition version, such as which Lambda functions are included in
     * the version and their configurations.
     * 
     * @param getFunctionDefinitionVersionRequest
     * @return A Java Future containing the result of the GetFunctionDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.GetFunctionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetFunctionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionDefinitionVersionResult> getFunctionDefinitionVersionAsync(
            GetFunctionDefinitionVersionRequest getFunctionDefinitionVersionRequest);

    /**
     * Retrieves information about a Lambda function definition version, such as which Lambda functions are included in
     * the version and their configurations.
     * 
     * @param getFunctionDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunctionDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.GetFunctionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetFunctionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionDefinitionVersionResult> getFunctionDefinitionVersionAsync(
            GetFunctionDefinitionVersionRequest getFunctionDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionDefinitionVersionRequest, GetFunctionDefinitionVersionResult> asyncHandler);

    /**
     * Retrieves information about a group.
     * 
     * @param getGroupRequest
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSGreengrassAsync.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest);

    /**
     * Retrieves information about a group.
     * 
     * @param getGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler);

    /**
     * Retreives the CA associated with a group. Returns the public key of the CA.
     * 
     * @param getGroupCertificateAuthorityRequest
     * @return A Java Future containing the result of the GetGroupCertificateAuthority operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.GetGroupCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGroupCertificateAuthorityResult> getGroupCertificateAuthorityAsync(
            GetGroupCertificateAuthorityRequest getGroupCertificateAuthorityRequest);

    /**
     * Retreives the CA associated with a group. Returns the public key of the CA.
     * 
     * @param getGroupCertificateAuthorityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroupCertificateAuthority operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.GetGroupCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGroupCertificateAuthorityResult> getGroupCertificateAuthorityAsync(
            GetGroupCertificateAuthorityRequest getGroupCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupCertificateAuthorityRequest, GetGroupCertificateAuthorityResult> asyncHandler);

    /**
     * Retrieves the current configuration for the CA used by the group.
     * 
     * @param getGroupCertificateConfigurationRequest
     * @return A Java Future containing the result of the GetGroupCertificateConfiguration operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.GetGroupCertificateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupCertificateConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGroupCertificateConfigurationResult> getGroupCertificateConfigurationAsync(
            GetGroupCertificateConfigurationRequest getGroupCertificateConfigurationRequest);

    /**
     * Retrieves the current configuration for the CA used by the group.
     * 
     * @param getGroupCertificateConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroupCertificateConfiguration operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.GetGroupCertificateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupCertificateConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGroupCertificateConfigurationResult> getGroupCertificateConfigurationAsync(
            GetGroupCertificateConfigurationRequest getGroupCertificateConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupCertificateConfigurationRequest, GetGroupCertificateConfigurationResult> asyncHandler);

    /**
     * Retrieves information about a group version.
     * 
     * @param getGroupVersionRequest
     * @return A Java Future containing the result of the GetGroupVersion operation returned by the service.
     * @sample AWSGreengrassAsync.GetGroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupVersionResult> getGroupVersionAsync(GetGroupVersionRequest getGroupVersionRequest);

    /**
     * Retrieves information about a group version.
     * 
     * @param getGroupVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroupVersion operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetGroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupVersionResult> getGroupVersionAsync(GetGroupVersionRequest getGroupVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupVersionRequest, GetGroupVersionResult> asyncHandler);

    /**
     * Retrieves information about a logger definition.
     * 
     * @param getLoggerDefinitionRequest
     * @return A Java Future containing the result of the GetLoggerDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.GetLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetLoggerDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggerDefinitionResult> getLoggerDefinitionAsync(GetLoggerDefinitionRequest getLoggerDefinitionRequest);

    /**
     * Retrieves information about a logger definition.
     * 
     * @param getLoggerDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoggerDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetLoggerDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggerDefinitionResult> getLoggerDefinitionAsync(GetLoggerDefinitionRequest getLoggerDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoggerDefinitionRequest, GetLoggerDefinitionResult> asyncHandler);

    /**
     * Retrieves information about a logger definition version.
     * 
     * @param getLoggerDefinitionVersionRequest
     * @return A Java Future containing the result of the GetLoggerDefinitionVersion operation returned by the service.
     * @sample AWSGreengrassAsync.GetLoggerDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetLoggerDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggerDefinitionVersionResult> getLoggerDefinitionVersionAsync(
            GetLoggerDefinitionVersionRequest getLoggerDefinitionVersionRequest);

    /**
     * Retrieves information about a logger definition version.
     * 
     * @param getLoggerDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoggerDefinitionVersion operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetLoggerDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetLoggerDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggerDefinitionVersionResult> getLoggerDefinitionVersionAsync(
            GetLoggerDefinitionVersionRequest getLoggerDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoggerDefinitionVersionRequest, GetLoggerDefinitionVersionResult> asyncHandler);

    /**
     * Retrieves information about a resource definition, such as its creation time and latest version.
     * 
     * @param getResourceDefinitionRequest
     * @return A Java Future containing the result of the GetResourceDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.GetResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceDefinitionResult> getResourceDefinitionAsync(GetResourceDefinitionRequest getResourceDefinitionRequest);

    /**
     * Retrieves information about a resource definition, such as its creation time and latest version.
     * 
     * @param getResourceDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceDefinitionResult> getResourceDefinitionAsync(GetResourceDefinitionRequest getResourceDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceDefinitionRequest, GetResourceDefinitionResult> asyncHandler);

    /**
     * Retrieves information about a resource definition version, such as which resources are included in the version.
     * 
     * @param getResourceDefinitionVersionRequest
     * @return A Java Future containing the result of the GetResourceDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.GetResourceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetResourceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceDefinitionVersionResult> getResourceDefinitionVersionAsync(
            GetResourceDefinitionVersionRequest getResourceDefinitionVersionRequest);

    /**
     * Retrieves information about a resource definition version, such as which resources are included in the version.
     * 
     * @param getResourceDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.GetResourceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetResourceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceDefinitionVersionResult> getResourceDefinitionVersionAsync(
            GetResourceDefinitionVersionRequest getResourceDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceDefinitionVersionRequest, GetResourceDefinitionVersionResult> asyncHandler);

    /**
     * Retrieves the service role that is attached to the account.
     * 
     * @param getServiceRoleForAccountRequest
     * @return A Java Future containing the result of the GetServiceRoleForAccount operation returned by the service.
     * @sample AWSGreengrassAsync.GetServiceRoleForAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetServiceRoleForAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceRoleForAccountResult> getServiceRoleForAccountAsync(GetServiceRoleForAccountRequest getServiceRoleForAccountRequest);

    /**
     * Retrieves the service role that is attached to the account.
     * 
     * @param getServiceRoleForAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceRoleForAccount operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetServiceRoleForAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetServiceRoleForAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceRoleForAccountResult> getServiceRoleForAccountAsync(GetServiceRoleForAccountRequest getServiceRoleForAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceRoleForAccountRequest, GetServiceRoleForAccountResult> asyncHandler);

    /**
     * Retrieves information about a subscription definition.
     * 
     * @param getSubscriptionDefinitionRequest
     * @return A Java Future containing the result of the GetSubscriptionDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.GetSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionDefinitionResult> getSubscriptionDefinitionAsync(
            GetSubscriptionDefinitionRequest getSubscriptionDefinitionRequest);

    /**
     * Retrieves information about a subscription definition.
     * 
     * @param getSubscriptionDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSubscriptionDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.GetSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionDefinitionResult> getSubscriptionDefinitionAsync(
            GetSubscriptionDefinitionRequest getSubscriptionDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionDefinitionRequest, GetSubscriptionDefinitionResult> asyncHandler);

    /**
     * Retrieves information about a subscription definition version.
     * 
     * @param getSubscriptionDefinitionVersionRequest
     * @return A Java Future containing the result of the GetSubscriptionDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.GetSubscriptionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetSubscriptionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionDefinitionVersionResult> getSubscriptionDefinitionVersionAsync(
            GetSubscriptionDefinitionVersionRequest getSubscriptionDefinitionVersionRequest);

    /**
     * Retrieves information about a subscription definition version.
     * 
     * @param getSubscriptionDefinitionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSubscriptionDefinitionVersion operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.GetSubscriptionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetSubscriptionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionDefinitionVersionResult> getSubscriptionDefinitionVersionAsync(
            GetSubscriptionDefinitionVersionRequest getSubscriptionDefinitionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionDefinitionVersionRequest, GetSubscriptionDefinitionVersionResult> asyncHandler);

    /**
     * Lists versions of a core definition.
     * 
     * @param listCoreDefinitionVersionsRequest
     * @return A Java Future containing the result of the ListCoreDefinitionVersions operation returned by the service.
     * @sample AWSGreengrassAsync.ListCoreDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListCoreDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCoreDefinitionVersionsResult> listCoreDefinitionVersionsAsync(
            ListCoreDefinitionVersionsRequest listCoreDefinitionVersionsRequest);

    /**
     * Lists versions of a core definition.
     * 
     * @param listCoreDefinitionVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCoreDefinitionVersions operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ListCoreDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListCoreDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCoreDefinitionVersionsResult> listCoreDefinitionVersionsAsync(
            ListCoreDefinitionVersionsRequest listCoreDefinitionVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCoreDefinitionVersionsRequest, ListCoreDefinitionVersionsResult> asyncHandler);

    /**
     * Retrieves a list of core definitions.
     * 
     * @param listCoreDefinitionsRequest
     * @return A Java Future containing the result of the ListCoreDefinitions operation returned by the service.
     * @sample AWSGreengrassAsync.ListCoreDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListCoreDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCoreDefinitionsResult> listCoreDefinitionsAsync(ListCoreDefinitionsRequest listCoreDefinitionsRequest);

    /**
     * Retrieves a list of core definitions.
     * 
     * @param listCoreDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCoreDefinitions operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ListCoreDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListCoreDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCoreDefinitionsResult> listCoreDefinitionsAsync(ListCoreDefinitionsRequest listCoreDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCoreDefinitionsRequest, ListCoreDefinitionsResult> asyncHandler);

    /**
     * Returns a history of deployments for the group.
     * 
     * @param listDeploymentsRequest
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AWSGreengrassAsync.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * Returns a history of deployments for the group.
     * 
     * @param listDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler);

    /**
     * Lists the versions of a device definition.
     * 
     * @param listDeviceDefinitionVersionsRequest
     * @return A Java Future containing the result of the ListDeviceDefinitionVersions operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.ListDeviceDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeviceDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceDefinitionVersionsResult> listDeviceDefinitionVersionsAsync(
            ListDeviceDefinitionVersionsRequest listDeviceDefinitionVersionsRequest);

    /**
     * Lists the versions of a device definition.
     * 
     * @param listDeviceDefinitionVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeviceDefinitionVersions operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.ListDeviceDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeviceDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceDefinitionVersionsResult> listDeviceDefinitionVersionsAsync(
            ListDeviceDefinitionVersionsRequest listDeviceDefinitionVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeviceDefinitionVersionsRequest, ListDeviceDefinitionVersionsResult> asyncHandler);

    /**
     * Retrieves a list of device definitions.
     * 
     * @param listDeviceDefinitionsRequest
     * @return A Java Future containing the result of the ListDeviceDefinitions operation returned by the service.
     * @sample AWSGreengrassAsync.ListDeviceDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeviceDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceDefinitionsResult> listDeviceDefinitionsAsync(ListDeviceDefinitionsRequest listDeviceDefinitionsRequest);

    /**
     * Retrieves a list of device definitions.
     * 
     * @param listDeviceDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeviceDefinitions operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ListDeviceDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeviceDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceDefinitionsResult> listDeviceDefinitionsAsync(ListDeviceDefinitionsRequest listDeviceDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeviceDefinitionsRequest, ListDeviceDefinitionsResult> asyncHandler);

    /**
     * Lists the versions of a Lambda function definition.
     * 
     * @param listFunctionDefinitionVersionsRequest
     * @return A Java Future containing the result of the ListFunctionDefinitionVersions operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.ListFunctionDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListFunctionDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionDefinitionVersionsResult> listFunctionDefinitionVersionsAsync(
            ListFunctionDefinitionVersionsRequest listFunctionDefinitionVersionsRequest);

    /**
     * Lists the versions of a Lambda function definition.
     * 
     * @param listFunctionDefinitionVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFunctionDefinitionVersions operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.ListFunctionDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListFunctionDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionDefinitionVersionsResult> listFunctionDefinitionVersionsAsync(
            ListFunctionDefinitionVersionsRequest listFunctionDefinitionVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFunctionDefinitionVersionsRequest, ListFunctionDefinitionVersionsResult> asyncHandler);

    /**
     * Retrieves a list of Lambda function definitions.
     * 
     * @param listFunctionDefinitionsRequest
     * @return A Java Future containing the result of the ListFunctionDefinitions operation returned by the service.
     * @sample AWSGreengrassAsync.ListFunctionDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListFunctionDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionDefinitionsResult> listFunctionDefinitionsAsync(ListFunctionDefinitionsRequest listFunctionDefinitionsRequest);

    /**
     * Retrieves a list of Lambda function definitions.
     * 
     * @param listFunctionDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFunctionDefinitions operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ListFunctionDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListFunctionDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionDefinitionsResult> listFunctionDefinitionsAsync(ListFunctionDefinitionsRequest listFunctionDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFunctionDefinitionsRequest, ListFunctionDefinitionsResult> asyncHandler);

    /**
     * Retrieves the current CAs for a group.
     * 
     * @param listGroupCertificateAuthoritiesRequest
     * @return A Java Future containing the result of the ListGroupCertificateAuthorities operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.ListGroupCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroupCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupCertificateAuthoritiesResult> listGroupCertificateAuthoritiesAsync(
            ListGroupCertificateAuthoritiesRequest listGroupCertificateAuthoritiesRequest);

    /**
     * Retrieves the current CAs for a group.
     * 
     * @param listGroupCertificateAuthoritiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupCertificateAuthorities operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.ListGroupCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroupCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupCertificateAuthoritiesResult> listGroupCertificateAuthoritiesAsync(
            ListGroupCertificateAuthoritiesRequest listGroupCertificateAuthoritiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupCertificateAuthoritiesRequest, ListGroupCertificateAuthoritiesResult> asyncHandler);

    /**
     * List the versions of a group.
     * 
     * @param listGroupVersionsRequest
     * @return A Java Future containing the result of the ListGroupVersions operation returned by the service.
     * @sample AWSGreengrassAsync.ListGroupVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroupVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupVersionsResult> listGroupVersionsAsync(ListGroupVersionsRequest listGroupVersionsRequest);

    /**
     * List the versions of a group.
     * 
     * @param listGroupVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupVersions operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ListGroupVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroupVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupVersionsResult> listGroupVersionsAsync(ListGroupVersionsRequest listGroupVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupVersionsRequest, ListGroupVersionsResult> asyncHandler);

    /**
     * Retrieves a list of groups.
     * 
     * @param listGroupsRequest
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSGreengrassAsync.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest);

    /**
     * Retrieves a list of groups.
     * 
     * @param listGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * Lists the versions of a logger definition.
     * 
     * @param listLoggerDefinitionVersionsRequest
     * @return A Java Future containing the result of the ListLoggerDefinitionVersions operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.ListLoggerDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListLoggerDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggerDefinitionVersionsResult> listLoggerDefinitionVersionsAsync(
            ListLoggerDefinitionVersionsRequest listLoggerDefinitionVersionsRequest);

    /**
     * Lists the versions of a logger definition.
     * 
     * @param listLoggerDefinitionVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLoggerDefinitionVersions operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.ListLoggerDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListLoggerDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggerDefinitionVersionsResult> listLoggerDefinitionVersionsAsync(
            ListLoggerDefinitionVersionsRequest listLoggerDefinitionVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLoggerDefinitionVersionsRequest, ListLoggerDefinitionVersionsResult> asyncHandler);

    /**
     * Retrieves a list of logger definitions.
     * 
     * @param listLoggerDefinitionsRequest
     * @return A Java Future containing the result of the ListLoggerDefinitions operation returned by the service.
     * @sample AWSGreengrassAsync.ListLoggerDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListLoggerDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggerDefinitionsResult> listLoggerDefinitionsAsync(ListLoggerDefinitionsRequest listLoggerDefinitionsRequest);

    /**
     * Retrieves a list of logger definitions.
     * 
     * @param listLoggerDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLoggerDefinitions operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ListLoggerDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListLoggerDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggerDefinitionsResult> listLoggerDefinitionsAsync(ListLoggerDefinitionsRequest listLoggerDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLoggerDefinitionsRequest, ListLoggerDefinitionsResult> asyncHandler);

    /**
     * Lists the versions of a resource definition.
     * 
     * @param listResourceDefinitionVersionsRequest
     * @return A Java Future containing the result of the ListResourceDefinitionVersions operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.ListResourceDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListResourceDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceDefinitionVersionsResult> listResourceDefinitionVersionsAsync(
            ListResourceDefinitionVersionsRequest listResourceDefinitionVersionsRequest);

    /**
     * Lists the versions of a resource definition.
     * 
     * @param listResourceDefinitionVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceDefinitionVersions operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.ListResourceDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListResourceDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceDefinitionVersionsResult> listResourceDefinitionVersionsAsync(
            ListResourceDefinitionVersionsRequest listResourceDefinitionVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceDefinitionVersionsRequest, ListResourceDefinitionVersionsResult> asyncHandler);

    /**
     * Retrieves a list of resource definitions.
     * 
     * @param listResourceDefinitionsRequest
     * @return A Java Future containing the result of the ListResourceDefinitions operation returned by the service.
     * @sample AWSGreengrassAsync.ListResourceDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListResourceDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceDefinitionsResult> listResourceDefinitionsAsync(ListResourceDefinitionsRequest listResourceDefinitionsRequest);

    /**
     * Retrieves a list of resource definitions.
     * 
     * @param listResourceDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceDefinitions operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ListResourceDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListResourceDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceDefinitionsResult> listResourceDefinitionsAsync(ListResourceDefinitionsRequest listResourceDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceDefinitionsRequest, ListResourceDefinitionsResult> asyncHandler);

    /**
     * Lists the versions of a subscription definition.
     * 
     * @param listSubscriptionDefinitionVersionsRequest
     * @return A Java Future containing the result of the ListSubscriptionDefinitionVersions operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.ListSubscriptionDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListSubscriptionDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionDefinitionVersionsResult> listSubscriptionDefinitionVersionsAsync(
            ListSubscriptionDefinitionVersionsRequest listSubscriptionDefinitionVersionsRequest);

    /**
     * Lists the versions of a subscription definition.
     * 
     * @param listSubscriptionDefinitionVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscriptionDefinitionVersions operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.ListSubscriptionDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListSubscriptionDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionDefinitionVersionsResult> listSubscriptionDefinitionVersionsAsync(
            ListSubscriptionDefinitionVersionsRequest listSubscriptionDefinitionVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionDefinitionVersionsRequest, ListSubscriptionDefinitionVersionsResult> asyncHandler);

    /**
     * Retrieves a list of subscription definitions.
     * 
     * @param listSubscriptionDefinitionsRequest
     * @return A Java Future containing the result of the ListSubscriptionDefinitions operation returned by the service.
     * @sample AWSGreengrassAsync.ListSubscriptionDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListSubscriptionDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionDefinitionsResult> listSubscriptionDefinitionsAsync(
            ListSubscriptionDefinitionsRequest listSubscriptionDefinitionsRequest);

    /**
     * Retrieves a list of subscription definitions.
     * 
     * @param listSubscriptionDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscriptionDefinitions operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ListSubscriptionDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListSubscriptionDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscriptionDefinitionsResult> listSubscriptionDefinitionsAsync(
            ListSubscriptionDefinitionsRequest listSubscriptionDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionDefinitionsRequest, ListSubscriptionDefinitionsResult> asyncHandler);

    /**
     * Resets a group's deployments.
     * 
     * @param resetDeploymentsRequest
     *        Information needed to perform a reset of a group's deployments.
     * @return A Java Future containing the result of the ResetDeployments operation returned by the service.
     * @sample AWSGreengrassAsync.ResetDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ResetDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResetDeploymentsResult> resetDeploymentsAsync(ResetDeploymentsRequest resetDeploymentsRequest);

    /**
     * Resets a group's deployments.
     * 
     * @param resetDeploymentsRequest
     *        Information needed to perform a reset of a group's deployments.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetDeployments operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.ResetDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ResetDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResetDeploymentsResult> resetDeploymentsAsync(ResetDeploymentsRequest resetDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<ResetDeploymentsRequest, ResetDeploymentsResult> asyncHandler);

    /**
     * Updates the connectivity information for the core. Any devices that belong to the group which has this core will
     * receive this information in order to find the location of the core and connect to it.
     * 
     * @param updateConnectivityInfoRequest
     *        connectivity info request
     * @return A Java Future containing the result of the UpdateConnectivityInfo operation returned by the service.
     * @sample AWSGreengrassAsync.UpdateConnectivityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateConnectivityInfo"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectivityInfoResult> updateConnectivityInfoAsync(UpdateConnectivityInfoRequest updateConnectivityInfoRequest);

    /**
     * Updates the connectivity information for the core. Any devices that belong to the group which has this core will
     * receive this information in order to find the location of the core and connect to it.
     * 
     * @param updateConnectivityInfoRequest
     *        connectivity info request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConnectivityInfo operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.UpdateConnectivityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateConnectivityInfo"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectivityInfoResult> updateConnectivityInfoAsync(UpdateConnectivityInfoRequest updateConnectivityInfoRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectivityInfoRequest, UpdateConnectivityInfoResult> asyncHandler);

    /**
     * Updates a core definition.
     * 
     * @param updateCoreDefinitionRequest
     * @return A Java Future containing the result of the UpdateCoreDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.UpdateCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateCoreDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCoreDefinitionResult> updateCoreDefinitionAsync(UpdateCoreDefinitionRequest updateCoreDefinitionRequest);

    /**
     * Updates a core definition.
     * 
     * @param updateCoreDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCoreDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.UpdateCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateCoreDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCoreDefinitionResult> updateCoreDefinitionAsync(UpdateCoreDefinitionRequest updateCoreDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCoreDefinitionRequest, UpdateCoreDefinitionResult> asyncHandler);

    /**
     * Updates a device definition.
     * 
     * @param updateDeviceDefinitionRequest
     * @return A Java Future containing the result of the UpdateDeviceDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.UpdateDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateDeviceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceDefinitionResult> updateDeviceDefinitionAsync(UpdateDeviceDefinitionRequest updateDeviceDefinitionRequest);

    /**
     * Updates a device definition.
     * 
     * @param updateDeviceDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeviceDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.UpdateDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateDeviceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceDefinitionResult> updateDeviceDefinitionAsync(UpdateDeviceDefinitionRequest updateDeviceDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceDefinitionRequest, UpdateDeviceDefinitionResult> asyncHandler);

    /**
     * Updates a Lambda function definition.
     * 
     * @param updateFunctionDefinitionRequest
     * @return A Java Future containing the result of the UpdateFunctionDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.UpdateFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionDefinitionResult> updateFunctionDefinitionAsync(UpdateFunctionDefinitionRequest updateFunctionDefinitionRequest);

    /**
     * Updates a Lambda function definition.
     * 
     * @param updateFunctionDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFunctionDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.UpdateFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionDefinitionResult> updateFunctionDefinitionAsync(UpdateFunctionDefinitionRequest updateFunctionDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionDefinitionRequest, UpdateFunctionDefinitionResult> asyncHandler);

    /**
     * Updates a group.
     * 
     * @param updateGroupRequest
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AWSGreengrassAsync.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest);

    /**
     * Updates a group.
     * 
     * @param updateGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler);

    /**
     * Updates the Cert expiry time for a group.
     * 
     * @param updateGroupCertificateConfigurationRequest
     * @return A Java Future containing the result of the UpdateGroupCertificateConfiguration operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.UpdateGroupCertificateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateGroupCertificateConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupCertificateConfigurationResult> updateGroupCertificateConfigurationAsync(
            UpdateGroupCertificateConfigurationRequest updateGroupCertificateConfigurationRequest);

    /**
     * Updates the Cert expiry time for a group.
     * 
     * @param updateGroupCertificateConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGroupCertificateConfiguration operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.UpdateGroupCertificateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateGroupCertificateConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupCertificateConfigurationResult> updateGroupCertificateConfigurationAsync(
            UpdateGroupCertificateConfigurationRequest updateGroupCertificateConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupCertificateConfigurationRequest, UpdateGroupCertificateConfigurationResult> asyncHandler);

    /**
     * Updates a logger definition.
     * 
     * @param updateLoggerDefinitionRequest
     * @return A Java Future containing the result of the UpdateLoggerDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.UpdateLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateLoggerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoggerDefinitionResult> updateLoggerDefinitionAsync(UpdateLoggerDefinitionRequest updateLoggerDefinitionRequest);

    /**
     * Updates a logger definition.
     * 
     * @param updateLoggerDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLoggerDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.UpdateLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateLoggerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoggerDefinitionResult> updateLoggerDefinitionAsync(UpdateLoggerDefinitionRequest updateLoggerDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLoggerDefinitionRequest, UpdateLoggerDefinitionResult> asyncHandler);

    /**
     * Updates a resource definition.
     * 
     * @param updateResourceDefinitionRequest
     * @return A Java Future containing the result of the UpdateResourceDefinition operation returned by the service.
     * @sample AWSGreengrassAsync.UpdateResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceDefinitionResult> updateResourceDefinitionAsync(UpdateResourceDefinitionRequest updateResourceDefinitionRequest);

    /**
     * Updates a resource definition.
     * 
     * @param updateResourceDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceDefinition operation returned by the service.
     * @sample AWSGreengrassAsyncHandler.UpdateResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceDefinitionResult> updateResourceDefinitionAsync(UpdateResourceDefinitionRequest updateResourceDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceDefinitionRequest, UpdateResourceDefinitionResult> asyncHandler);

    /**
     * Updates a subscription definition.
     * 
     * @param updateSubscriptionDefinitionRequest
     * @return A Java Future containing the result of the UpdateSubscriptionDefinition operation returned by the
     *         service.
     * @sample AWSGreengrassAsync.UpdateSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionDefinitionResult> updateSubscriptionDefinitionAsync(
            UpdateSubscriptionDefinitionRequest updateSubscriptionDefinitionRequest);

    /**
     * Updates a subscription definition.
     * 
     * @param updateSubscriptionDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubscriptionDefinition operation returned by the
     *         service.
     * @sample AWSGreengrassAsyncHandler.UpdateSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionDefinitionResult> updateSubscriptionDefinitionAsync(
            UpdateSubscriptionDefinitionRequest updateSubscriptionDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionDefinitionRequest, UpdateSubscriptionDefinitionResult> asyncHandler);

}
