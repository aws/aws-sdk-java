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
package com.amazonaws.services.greengrass;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.greengrass.model.*;

/**
 * Interface for accessing AWS Greengrass.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.greengrass.AbstractAWSGreengrass} instead.
 * </p>
 * <p>
 * AWS IoT Greengrass seamlessly extends AWS onto physical devices so they can act locally on the data they generate,
 * while still using the cloud for management, analytics, and durable storage. AWS IoT Greengrass ensures your devices
 * can respond quickly to local events and operate with intermittent connectivity. AWS IoT Greengrass minimizes the cost
 * of transmitting data to the cloud by allowing you to author AWS Lambda functions that execute locally.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGreengrass {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "greengrass";

    /**
     * Associates a role with a group. Your Greengrass core will use the role to access AWS cloud services. The role's
     * permissions should allow Greengrass core Lambda functions to perform actions against the cloud.
     * 
     * @param associateRoleToGroupRequest
     * @return Result of the AssociateRoleToGroup operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.AssociateRoleToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/AssociateRoleToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateRoleToGroupResult associateRoleToGroup(AssociateRoleToGroupRequest associateRoleToGroupRequest);

    /**
     * Associates a role with your account. AWS IoT Greengrass will use the role to access your Lambda functions and AWS
     * IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in
     * the policy ''AWSGreengrassResourceAccessRolePolicy''.
     * 
     * @param associateServiceRoleToAccountRequest
     * @return Result of the AssociateServiceRoleToAccount operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.AssociateServiceRoleToAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/AssociateServiceRoleToAccount"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateServiceRoleToAccountResult associateServiceRoleToAccount(AssociateServiceRoleToAccountRequest associateServiceRoleToAccountRequest);

    /**
     * Creates a connector definition. You may provide the initial version of the connector definition now or use
     * ''CreateConnectorDefinitionVersion'' at a later time.
     * 
     * @param createConnectorDefinitionRequest
     * @return Result of the CreateConnectorDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateConnectorDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateConnectorDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConnectorDefinitionResult createConnectorDefinition(CreateConnectorDefinitionRequest createConnectorDefinitionRequest);

    /**
     * Creates a version of a connector definition which has already been defined.
     * 
     * @param createConnectorDefinitionVersionRequest
     * @return Result of the CreateConnectorDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateConnectorDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateConnectorDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConnectorDefinitionVersionResult createConnectorDefinitionVersion(CreateConnectorDefinitionVersionRequest createConnectorDefinitionVersionRequest);

    /**
     * Creates a core definition. You may provide the initial version of the core definition now or use
     * ''CreateCoreDefinitionVersion'' at a later time. Greengrass groups must each contain exactly one Greengrass core.
     * 
     * @param createCoreDefinitionRequest
     *        Information needed to create a core definition.
     * @return Result of the CreateCoreDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateCoreDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCoreDefinitionResult createCoreDefinition(CreateCoreDefinitionRequest createCoreDefinitionRequest);

    /**
     * Creates a version of a core definition that has already been defined. Greengrass groups must each contain exactly
     * one Greengrass core.
     * 
     * @param createCoreDefinitionVersionRequest
     * @return Result of the CreateCoreDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateCoreDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateCoreDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCoreDefinitionVersionResult createCoreDefinitionVersion(CreateCoreDefinitionVersionRequest createCoreDefinitionVersionRequest);

    /**
     * Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token''
     * token and the request parameters.
     * 
     * @param createDeploymentRequest
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest);

    /**
     * Creates a device definition. You may provide the initial version of the device definition now or use
     * ''CreateDeviceDefinitionVersion'' at a later time.
     * 
     * @param createDeviceDefinitionRequest
     * @return Result of the CreateDeviceDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeviceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDeviceDefinitionResult createDeviceDefinition(CreateDeviceDefinitionRequest createDeviceDefinitionRequest);

    /**
     * Creates a version of a device definition that has already been defined.
     * 
     * @param createDeviceDefinitionVersionRequest
     * @return Result of the CreateDeviceDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateDeviceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateDeviceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDeviceDefinitionVersionResult createDeviceDefinitionVersion(CreateDeviceDefinitionVersionRequest createDeviceDefinitionVersionRequest);

    /**
     * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be
     * used in a group. You can create an initial version of the definition by providing a list of Lambda functions and
     * their configurations now, or use ''CreateFunctionDefinitionVersion'' later.
     * 
     * @param createFunctionDefinitionRequest
     * @return Result of the CreateFunctionDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFunctionDefinitionResult createFunctionDefinition(CreateFunctionDefinitionRequest createFunctionDefinitionRequest);

    /**
     * Creates a version of a Lambda function definition that has already been defined.
     * 
     * @param createFunctionDefinitionVersionRequest
     *        Information needed to create a function definition version.
     * @return Result of the CreateFunctionDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateFunctionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateFunctionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFunctionDefinitionVersionResult createFunctionDefinitionVersion(CreateFunctionDefinitionVersionRequest createFunctionDefinitionVersionRequest);

    /**
     * Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time.
     * Tip: You can use the ''gg_group_setup'' package (https://github.com/awslabs/aws-greengrass-group-setup) as a
     * library or command-line application to create and deploy Greengrass groups.
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest);

    /**
     * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
     * 
     * @param createGroupCertificateAuthorityRequest
     * @return Result of the CreateGroupCertificateAuthority operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.CreateGroupCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroupCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    CreateGroupCertificateAuthorityResult createGroupCertificateAuthority(CreateGroupCertificateAuthorityRequest createGroupCertificateAuthorityRequest);

    /**
     * Creates a version of a group which has already been defined.
     * 
     * @param createGroupVersionRequest
     * @return Result of the CreateGroupVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateGroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroupVersion" target="_top">AWS
     *      API Documentation</a>
     */
    CreateGroupVersionResult createGroupVersion(CreateGroupVersionRequest createGroupVersionRequest);

    /**
     * Creates a logger definition. You may provide the initial version of the logger definition now or use
     * ''CreateLoggerDefinitionVersion'' at a later time.
     * 
     * @param createLoggerDefinitionRequest
     * @return Result of the CreateLoggerDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateLoggerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLoggerDefinitionResult createLoggerDefinition(CreateLoggerDefinitionRequest createLoggerDefinitionRequest);

    /**
     * Creates a version of a logger definition that has already been defined.
     * 
     * @param createLoggerDefinitionVersionRequest
     * @return Result of the CreateLoggerDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateLoggerDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateLoggerDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLoggerDefinitionVersionResult createLoggerDefinitionVersion(CreateLoggerDefinitionVersionRequest createLoggerDefinitionVersionRequest);

    /**
     * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial
     * version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.
     * 
     * @param createResourceDefinitionRequest
     * @return Result of the CreateResourceDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResourceDefinitionResult createResourceDefinition(CreateResourceDefinitionRequest createResourceDefinitionRequest);

    /**
     * Creates a version of a resource definition that has already been defined.
     * 
     * @param createResourceDefinitionVersionRequest
     * @return Result of the CreateResourceDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateResourceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateResourceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResourceDefinitionVersionResult createResourceDefinitionVersion(CreateResourceDefinitionVersionRequest createResourceDefinitionVersionRequest);

    /**
     * Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the
     * OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional
     * commands to manage a Greengrass core software update job.
     * 
     * @param createSoftwareUpdateJobRequest
     * @return Result of the CreateSoftwareUpdateJob operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.CreateSoftwareUpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSoftwareUpdateJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSoftwareUpdateJobResult createSoftwareUpdateJob(CreateSoftwareUpdateJobRequest createSoftwareUpdateJobRequest);

    /**
     * Creates a subscription definition. You may provide the initial version of the subscription definition now or use
     * ''CreateSubscriptionDefinitionVersion'' at a later time.
     * 
     * @param createSubscriptionDefinitionRequest
     * @return Result of the CreateSubscriptionDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSubscriptionDefinitionResult createSubscriptionDefinition(CreateSubscriptionDefinitionRequest createSubscriptionDefinitionRequest);

    /**
     * Creates a version of a subscription definition which has already been defined.
     * 
     * @param createSubscriptionDefinitionVersionRequest
     * @return Result of the CreateSubscriptionDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.CreateSubscriptionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSubscriptionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSubscriptionDefinitionVersionResult createSubscriptionDefinitionVersion(
            CreateSubscriptionDefinitionVersionRequest createSubscriptionDefinitionVersionRequest);

    /**
     * Deletes a connector definition.
     * 
     * @param deleteConnectorDefinitionRequest
     * @return Result of the DeleteConnectorDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.DeleteConnectorDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteConnectorDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConnectorDefinitionResult deleteConnectorDefinition(DeleteConnectorDefinitionRequest deleteConnectorDefinitionRequest);

    /**
     * Deletes a core definition.
     * 
     * @param deleteCoreDefinitionRequest
     * @return Result of the DeleteCoreDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.DeleteCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteCoreDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCoreDefinitionResult deleteCoreDefinition(DeleteCoreDefinitionRequest deleteCoreDefinitionRequest);

    /**
     * Deletes a device definition.
     * 
     * @param deleteDeviceDefinitionRequest
     * @return Result of the DeleteDeviceDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.DeleteDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteDeviceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDeviceDefinitionResult deleteDeviceDefinition(DeleteDeviceDefinitionRequest deleteDeviceDefinitionRequest);

    /**
     * Deletes a Lambda function definition.
     * 
     * @param deleteFunctionDefinitionRequest
     * @return Result of the DeleteFunctionDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.DeleteFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFunctionDefinitionResult deleteFunctionDefinition(DeleteFunctionDefinitionRequest deleteFunctionDefinitionRequest);

    /**
     * Deletes a group.
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

    /**
     * Deletes a logger definition.
     * 
     * @param deleteLoggerDefinitionRequest
     * @return Result of the DeleteLoggerDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.DeleteLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteLoggerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLoggerDefinitionResult deleteLoggerDefinition(DeleteLoggerDefinitionRequest deleteLoggerDefinitionRequest);

    /**
     * Deletes a resource definition.
     * 
     * @param deleteResourceDefinitionRequest
     * @return Result of the DeleteResourceDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.DeleteResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourceDefinitionResult deleteResourceDefinition(DeleteResourceDefinitionRequest deleteResourceDefinitionRequest);

    /**
     * Deletes a subscription definition.
     * 
     * @param deleteSubscriptionDefinitionRequest
     * @return Result of the DeleteSubscriptionDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.DeleteSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSubscriptionDefinitionResult deleteSubscriptionDefinition(DeleteSubscriptionDefinitionRequest deleteSubscriptionDefinitionRequest);

    /**
     * Disassociates the role from a group.
     * 
     * @param disassociateRoleFromGroupRequest
     * @return Result of the DisassociateRoleFromGroup operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.DisassociateRoleFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DisassociateRoleFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateRoleFromGroupResult disassociateRoleFromGroup(DisassociateRoleFromGroupRequest disassociateRoleFromGroupRequest);

    /**
     * Disassociates the service role from your account. Without a service role, deployments will not work.
     * 
     * @param disassociateServiceRoleFromAccountRequest
     * @return Result of the DisassociateServiceRoleFromAccount operation returned by the service.
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.DisassociateServiceRoleFromAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DisassociateServiceRoleFromAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateServiceRoleFromAccountResult disassociateServiceRoleFromAccount(
            DisassociateServiceRoleFromAccountRequest disassociateServiceRoleFromAccountRequest);

    /**
     * Retrieves the role associated with a particular group.
     * 
     * @param getAssociatedRoleRequest
     * @return Result of the GetAssociatedRole operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.GetAssociatedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetAssociatedRole" target="_top">AWS
     *      API Documentation</a>
     */
    GetAssociatedRoleResult getAssociatedRole(GetAssociatedRoleRequest getAssociatedRoleRequest);

    /**
     * Returns the status of a bulk deployment.
     * 
     * @param getBulkDeploymentStatusRequest
     * @return Result of the GetBulkDeploymentStatus operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetBulkDeploymentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetBulkDeploymentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetBulkDeploymentStatusResult getBulkDeploymentStatus(GetBulkDeploymentStatusRequest getBulkDeploymentStatusRequest);

    /**
     * Retrieves the connectivity information for a core.
     * 
     * @param getConnectivityInfoRequest
     * @return Result of the GetConnectivityInfo operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.GetConnectivityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetConnectivityInfo" target="_top">AWS
     *      API Documentation</a>
     */
    GetConnectivityInfoResult getConnectivityInfo(GetConnectivityInfoRequest getConnectivityInfoRequest);

    /**
     * Retrieves information about a connector definition.
     * 
     * @param getConnectorDefinitionRequest
     * @return Result of the GetConnectorDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetConnectorDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetConnectorDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    GetConnectorDefinitionResult getConnectorDefinition(GetConnectorDefinitionRequest getConnectorDefinitionRequest);

    /**
     * Retrieves information about a connector definition version, including the connectors that the version contains.
     * Connectors are prebuilt modules that interact with local infrastructure, device protocols, AWS, and other cloud
     * services.
     * 
     * @param getConnectorDefinitionVersionRequest
     * @return Result of the GetConnectorDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetConnectorDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetConnectorDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetConnectorDefinitionVersionResult getConnectorDefinitionVersion(GetConnectorDefinitionVersionRequest getConnectorDefinitionVersionRequest);

    /**
     * Retrieves information about a core definition version.
     * 
     * @param getCoreDefinitionRequest
     * @return Result of the GetCoreDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetCoreDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    GetCoreDefinitionResult getCoreDefinition(GetCoreDefinitionRequest getCoreDefinitionRequest);

    /**
     * Retrieves information about a core definition version.
     * 
     * @param getCoreDefinitionVersionRequest
     * @return Result of the GetCoreDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetCoreDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetCoreDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetCoreDefinitionVersionResult getCoreDefinitionVersion(GetCoreDefinitionVersionRequest getCoreDefinitionVersionRequest);

    /**
     * Returns the status of a deployment.
     * 
     * @param getDeploymentStatusRequest
     * @return Result of the GetDeploymentStatus operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetDeploymentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeploymentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    GetDeploymentStatusResult getDeploymentStatus(GetDeploymentStatusRequest getDeploymentStatusRequest);

    /**
     * Retrieves information about a device definition.
     * 
     * @param getDeviceDefinitionRequest
     * @return Result of the GetDeviceDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeviceDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    GetDeviceDefinitionResult getDeviceDefinition(GetDeviceDefinitionRequest getDeviceDefinitionRequest);

    /**
     * Retrieves information about a device definition version.
     * 
     * @param getDeviceDefinitionVersionRequest
     * @return Result of the GetDeviceDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetDeviceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeviceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeviceDefinitionVersionResult getDeviceDefinitionVersion(GetDeviceDefinitionVersionRequest getDeviceDefinitionVersionRequest);

    /**
     * Retrieves information about a Lambda function definition, including its creation time and latest version.
     * 
     * @param getFunctionDefinitionRequest
     * @return Result of the GetFunctionDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    GetFunctionDefinitionResult getFunctionDefinition(GetFunctionDefinitionRequest getFunctionDefinitionRequest);

    /**
     * Retrieves information about a Lambda function definition version, including which Lambda functions are included
     * in the version and their configurations.
     * 
     * @param getFunctionDefinitionVersionRequest
     * @return Result of the GetFunctionDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetFunctionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetFunctionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetFunctionDefinitionVersionResult getFunctionDefinitionVersion(GetFunctionDefinitionVersionRequest getFunctionDefinitionVersionRequest);

    /**
     * Retrieves information about a group.
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupResult getGroup(GetGroupRequest getGroupRequest);

    /**
     * Retreives the CA associated with a group. Returns the public key of the CA.
     * 
     * @param getGroupCertificateAuthorityRequest
     * @return Result of the GetGroupCertificateAuthority operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.GetGroupCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    GetGroupCertificateAuthorityResult getGroupCertificateAuthority(GetGroupCertificateAuthorityRequest getGroupCertificateAuthorityRequest);

    /**
     * Retrieves the current configuration for the CA used by the group.
     * 
     * @param getGroupCertificateConfigurationRequest
     * @return Result of the GetGroupCertificateConfiguration operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.GetGroupCertificateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupCertificateConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetGroupCertificateConfigurationResult getGroupCertificateConfiguration(GetGroupCertificateConfigurationRequest getGroupCertificateConfigurationRequest);

    /**
     * Retrieves information about a group version.
     * 
     * @param getGroupVersionRequest
     * @return Result of the GetGroupVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetGroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupVersion" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupVersionResult getGroupVersion(GetGroupVersionRequest getGroupVersionRequest);

    /**
     * Retrieves information about a logger definition.
     * 
     * @param getLoggerDefinitionRequest
     * @return Result of the GetLoggerDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetLoggerDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    GetLoggerDefinitionResult getLoggerDefinition(GetLoggerDefinitionRequest getLoggerDefinitionRequest);

    /**
     * Retrieves information about a logger definition version.
     * 
     * @param getLoggerDefinitionVersionRequest
     * @return Result of the GetLoggerDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetLoggerDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetLoggerDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetLoggerDefinitionVersionResult getLoggerDefinitionVersion(GetLoggerDefinitionVersionRequest getLoggerDefinitionVersionRequest);

    /**
     * Retrieves information about a resource definition, including its creation time and latest version.
     * 
     * @param getResourceDefinitionRequest
     * @return Result of the GetResourceDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceDefinitionResult getResourceDefinition(GetResourceDefinitionRequest getResourceDefinitionRequest);

    /**
     * Retrieves information about a resource definition version, including which resources are included in the version.
     * 
     * @param getResourceDefinitionVersionRequest
     * @return Result of the GetResourceDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetResourceDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetResourceDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceDefinitionVersionResult getResourceDefinitionVersion(GetResourceDefinitionVersionRequest getResourceDefinitionVersionRequest);

    /**
     * Retrieves the service role that is attached to your account.
     * 
     * @param getServiceRoleForAccountRequest
     * @return Result of the GetServiceRoleForAccount operation returned by the service.
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.GetServiceRoleForAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetServiceRoleForAccount"
     *      target="_top">AWS API Documentation</a>
     */
    GetServiceRoleForAccountResult getServiceRoleForAccount(GetServiceRoleForAccountRequest getServiceRoleForAccountRequest);

    /**
     * Retrieves information about a subscription definition.
     * 
     * @param getSubscriptionDefinitionRequest
     * @return Result of the GetSubscriptionDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    GetSubscriptionDefinitionResult getSubscriptionDefinition(GetSubscriptionDefinitionRequest getSubscriptionDefinitionRequest);

    /**
     * Retrieves information about a subscription definition version.
     * 
     * @param getSubscriptionDefinitionVersionRequest
     * @return Result of the GetSubscriptionDefinitionVersion operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.GetSubscriptionDefinitionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetSubscriptionDefinitionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetSubscriptionDefinitionVersionResult getSubscriptionDefinitionVersion(GetSubscriptionDefinitionVersionRequest getSubscriptionDefinitionVersionRequest);

    /**
     * Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current
     * deployment status.
     * 
     * @param listBulkDeploymentDetailedReportsRequest
     * @return Result of the ListBulkDeploymentDetailedReports operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListBulkDeploymentDetailedReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListBulkDeploymentDetailedReports"
     *      target="_top">AWS API Documentation</a>
     */
    ListBulkDeploymentDetailedReportsResult listBulkDeploymentDetailedReports(ListBulkDeploymentDetailedReportsRequest listBulkDeploymentDetailedReportsRequest);

    /**
     * Returns a list of bulk deployments.
     * 
     * @param listBulkDeploymentsRequest
     * @return Result of the ListBulkDeployments operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListBulkDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListBulkDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    ListBulkDeploymentsResult listBulkDeployments(ListBulkDeploymentsRequest listBulkDeploymentsRequest);

    /**
     * Lists the versions of a connector definition, which are containers for connectors. Connectors run on the
     * Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other
     * cloud services.
     * 
     * @param listConnectorDefinitionVersionsRequest
     * @return Result of the ListConnectorDefinitionVersions operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListConnectorDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListConnectorDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListConnectorDefinitionVersionsResult listConnectorDefinitionVersions(ListConnectorDefinitionVersionsRequest listConnectorDefinitionVersionsRequest);

    /**
     * Retrieves a list of connector definitions.
     * 
     * @param listConnectorDefinitionsRequest
     * @return Result of the ListConnectorDefinitions operation returned by the service.
     * @sample AWSGreengrass.ListConnectorDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListConnectorDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListConnectorDefinitionsResult listConnectorDefinitions(ListConnectorDefinitionsRequest listConnectorDefinitionsRequest);

    /**
     * Lists the versions of a core definition.
     * 
     * @param listCoreDefinitionVersionsRequest
     * @return Result of the ListCoreDefinitionVersions operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListCoreDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListCoreDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListCoreDefinitionVersionsResult listCoreDefinitionVersions(ListCoreDefinitionVersionsRequest listCoreDefinitionVersionsRequest);

    /**
     * Retrieves a list of core definitions.
     * 
     * @param listCoreDefinitionsRequest
     * @return Result of the ListCoreDefinitions operation returned by the service.
     * @sample AWSGreengrass.ListCoreDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListCoreDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    ListCoreDefinitionsResult listCoreDefinitions(ListCoreDefinitionsRequest listCoreDefinitionsRequest);

    /**
     * Returns a history of deployments for the group.
     * 
     * @param listDeploymentsRequest
     * @return Result of the ListDeployments operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * Lists the versions of a device definition.
     * 
     * @param listDeviceDefinitionVersionsRequest
     * @return Result of the ListDeviceDefinitionVersions operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListDeviceDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeviceDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeviceDefinitionVersionsResult listDeviceDefinitionVersions(ListDeviceDefinitionVersionsRequest listDeviceDefinitionVersionsRequest);

    /**
     * Retrieves a list of device definitions.
     * 
     * @param listDeviceDefinitionsRequest
     * @return Result of the ListDeviceDefinitions operation returned by the service.
     * @sample AWSGreengrass.ListDeviceDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeviceDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeviceDefinitionsResult listDeviceDefinitions(ListDeviceDefinitionsRequest listDeviceDefinitionsRequest);

    /**
     * Lists the versions of a Lambda function definition.
     * 
     * @param listFunctionDefinitionVersionsRequest
     * @return Result of the ListFunctionDefinitionVersions operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListFunctionDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListFunctionDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListFunctionDefinitionVersionsResult listFunctionDefinitionVersions(ListFunctionDefinitionVersionsRequest listFunctionDefinitionVersionsRequest);

    /**
     * Retrieves a list of Lambda function definitions.
     * 
     * @param listFunctionDefinitionsRequest
     * @return Result of the ListFunctionDefinitions operation returned by the service.
     * @sample AWSGreengrass.ListFunctionDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListFunctionDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListFunctionDefinitionsResult listFunctionDefinitions(ListFunctionDefinitionsRequest listFunctionDefinitionsRequest);

    /**
     * Retrieves the current CAs for a group.
     * 
     * @param listGroupCertificateAuthoritiesRequest
     * @return Result of the ListGroupCertificateAuthorities operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.ListGroupCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroupCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    ListGroupCertificateAuthoritiesResult listGroupCertificateAuthorities(ListGroupCertificateAuthoritiesRequest listGroupCertificateAuthoritiesRequest);

    /**
     * Lists the versions of a group.
     * 
     * @param listGroupVersionsRequest
     * @return Result of the ListGroupVersions operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListGroupVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroupVersions" target="_top">AWS
     *      API Documentation</a>
     */
    ListGroupVersionsResult listGroupVersions(ListGroupVersionsRequest listGroupVersionsRequest);

    /**
     * Retrieves a list of groups.
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @sample AWSGreengrass.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest);

    /**
     * Lists the versions of a logger definition.
     * 
     * @param listLoggerDefinitionVersionsRequest
     * @return Result of the ListLoggerDefinitionVersions operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListLoggerDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListLoggerDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListLoggerDefinitionVersionsResult listLoggerDefinitionVersions(ListLoggerDefinitionVersionsRequest listLoggerDefinitionVersionsRequest);

    /**
     * Retrieves a list of logger definitions.
     * 
     * @param listLoggerDefinitionsRequest
     * @return Result of the ListLoggerDefinitions operation returned by the service.
     * @sample AWSGreengrass.ListLoggerDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListLoggerDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListLoggerDefinitionsResult listLoggerDefinitions(ListLoggerDefinitionsRequest listLoggerDefinitionsRequest);

    /**
     * Lists the versions of a resource definition.
     * 
     * @param listResourceDefinitionVersionsRequest
     * @return Result of the ListResourceDefinitionVersions operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListResourceDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListResourceDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceDefinitionVersionsResult listResourceDefinitionVersions(ListResourceDefinitionVersionsRequest listResourceDefinitionVersionsRequest);

    /**
     * Retrieves a list of resource definitions.
     * 
     * @param listResourceDefinitionsRequest
     * @return Result of the ListResourceDefinitions operation returned by the service.
     * @sample AWSGreengrass.ListResourceDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListResourceDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceDefinitionsResult listResourceDefinitions(ListResourceDefinitionsRequest listResourceDefinitionsRequest);

    /**
     * Lists the versions of a subscription definition.
     * 
     * @param listSubscriptionDefinitionVersionsRequest
     * @return Result of the ListSubscriptionDefinitionVersions operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListSubscriptionDefinitionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListSubscriptionDefinitionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListSubscriptionDefinitionVersionsResult listSubscriptionDefinitionVersions(
            ListSubscriptionDefinitionVersionsRequest listSubscriptionDefinitionVersionsRequest);

    /**
     * Retrieves a list of subscription definitions.
     * 
     * @param listSubscriptionDefinitionsRequest
     * @return Result of the ListSubscriptionDefinitions operation returned by the service.
     * @sample AWSGreengrass.ListSubscriptionDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListSubscriptionDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListSubscriptionDefinitionsResult listSubscriptionDefinitions(ListSubscriptionDefinitionsRequest listSubscriptionDefinitionsRequest);

    /**
     * Retrieves the tags for a resource.
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Resets a group's deployments.
     * 
     * @param resetDeploymentsRequest
     *        Information needed to reset deployments.
     * @return Result of the ResetDeployments operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.ResetDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ResetDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    ResetDeploymentsResult resetDeployments(ResetDeploymentsRequest resetDeploymentsRequest);

    /**
     * Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group
     * versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We
     * recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These
     * requests are idempotent with respect to the token and the request parameters.
     * 
     * @param startBulkDeploymentRequest
     * @return Result of the StartBulkDeployment operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.StartBulkDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/StartBulkDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    StartBulkDeploymentResult startBulkDeployment(StartBulkDeploymentRequest startBulkDeploymentRequest);

    /**
     * Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is
     * stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This
     * action doesn't rollback completed deployments or cancel pending deployments.
     * 
     * @param stopBulkDeploymentRequest
     * @return Result of the StopBulkDeployment operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.StopBulkDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/StopBulkDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    StopBulkDeploymentResult stopBulkDeployment(StopBulkDeploymentRequest stopBulkDeploymentRequest);

    /**
     * Add tags to a resource.
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * Remove tags with specified keys from a resource.
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Updates the connectivity information for the core. Any devices that belong to the group which has this core will
     * receive this information in order to find the location of the core and connect to it.
     * 
     * @param updateConnectivityInfoRequest
     *        Connectivity information.
     * @return Result of the UpdateConnectivityInfo operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.UpdateConnectivityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateConnectivityInfo"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConnectivityInfoResult updateConnectivityInfo(UpdateConnectivityInfoRequest updateConnectivityInfoRequest);

    /**
     * Updates a connector definition.
     * 
     * @param updateConnectorDefinitionRequest
     * @return Result of the UpdateConnectorDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.UpdateConnectorDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateConnectorDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConnectorDefinitionResult updateConnectorDefinition(UpdateConnectorDefinitionRequest updateConnectorDefinitionRequest);

    /**
     * Updates a core definition.
     * 
     * @param updateCoreDefinitionRequest
     * @return Result of the UpdateCoreDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.UpdateCoreDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateCoreDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCoreDefinitionResult updateCoreDefinition(UpdateCoreDefinitionRequest updateCoreDefinitionRequest);

    /**
     * Updates a device definition.
     * 
     * @param updateDeviceDefinitionRequest
     * @return Result of the UpdateDeviceDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.UpdateDeviceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateDeviceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDeviceDefinitionResult updateDeviceDefinition(UpdateDeviceDefinitionRequest updateDeviceDefinitionRequest);

    /**
     * Updates a Lambda function definition.
     * 
     * @param updateFunctionDefinitionRequest
     * @return Result of the UpdateFunctionDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.UpdateFunctionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateFunctionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFunctionDefinitionResult updateFunctionDefinition(UpdateFunctionDefinitionRequest updateFunctionDefinitionRequest);

    /**
     * Updates a group.
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest);

    /**
     * Updates the Certificate expiry time for a group.
     * 
     * @param updateGroupCertificateConfigurationRequest
     * @return Result of the UpdateGroupCertificateConfiguration operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @throws InternalServerErrorException
     *         server error
     * @sample AWSGreengrass.UpdateGroupCertificateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateGroupCertificateConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGroupCertificateConfigurationResult updateGroupCertificateConfiguration(
            UpdateGroupCertificateConfigurationRequest updateGroupCertificateConfigurationRequest);

    /**
     * Updates a logger definition.
     * 
     * @param updateLoggerDefinitionRequest
     * @return Result of the UpdateLoggerDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.UpdateLoggerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateLoggerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLoggerDefinitionResult updateLoggerDefinition(UpdateLoggerDefinitionRequest updateLoggerDefinitionRequest);

    /**
     * Updates a resource definition.
     * 
     * @param updateResourceDefinitionRequest
     * @return Result of the UpdateResourceDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.UpdateResourceDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateResourceDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResourceDefinitionResult updateResourceDefinition(UpdateResourceDefinitionRequest updateResourceDefinitionRequest);

    /**
     * Updates a subscription definition.
     * 
     * @param updateSubscriptionDefinitionRequest
     * @return Result of the UpdateSubscriptionDefinition operation returned by the service.
     * @throws BadRequestException
     *         invalid request
     * @sample AWSGreengrass.UpdateSubscriptionDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateSubscriptionDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSubscriptionDefinitionResult updateSubscriptionDefinition(UpdateSubscriptionDefinitionRequest updateSubscriptionDefinitionRequest);

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
