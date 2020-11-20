/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.connect.model.*;

/**
 * Interface for accessing Amazon Connect.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connect.AbstractAmazonConnect} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Connect is a cloud-based contact center solution that makes it easy to set up and manage a customer contact
 * center and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides rich metrics and real-time reporting that allow you to optimize contact routing. You can also
 * resolve customer issues more efficiently by putting customers in touch with the right agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can create and limits to the number of requests
 * that you can make per second. For more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
 * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 * <p>
 * To connect programmatically to an AWS service, you use an endpoint. For a list of Amazon Connect endpoints, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html">Amazon Connect Endpoints</a>.
 * </p>
 * <note>
 * <p>
 * Working with contact flows? Check out the <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnect {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "connect";

    /**
     * <p>
     * Associates an approved origin to an Amazon Connect instance.
     * </p>
     * 
     * @param associateApprovedOriginRequest
     * @return Result of the AssociateApprovedOrigin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateApprovedOrigin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateApprovedOrigin"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateApprovedOriginResult associateApprovedOrigin(AssociateApprovedOriginRequest associateApprovedOriginRequest);

    /**
     * <p>
     * Associates a storage resource type for the first time. You can only associate one type of storage configuration
     * in a single call. This means, for example, that you can't define an instance with multiple S3 buckets for storing
     * chat transcripts.
     * </p>
     * <p>
     * This API does not create a resource that doesn't exist. It only associates it to the instance. Ensure that the
     * resource being specified in the storage configuration, like an Amazon S3 bucket, exists when being used for
     * association.
     * </p>
     * 
     * @param associateInstanceStorageConfigRequest
     * @return Result of the AssociateInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateInstanceStorageConfigResult associateInstanceStorageConfig(AssociateInstanceStorageConfigRequest associateInstanceStorageConfigRequest);

    /**
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Lambda function.
     * </p>
     * 
     * @param associateLambdaFunctionRequest
     * @return Result of the AssociateLambdaFunction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateLambdaFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateLambdaFunction"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateLambdaFunctionResult associateLambdaFunction(AssociateLambdaFunctionRequest associateLambdaFunctionRequest);

    /**
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Amazon Lex bot.
     * </p>
     * 
     * @param associateLexBotRequest
     * @return Result of the AssociateLexBot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateLexBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateLexBot" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateLexBotResult associateLexBot(AssociateLexBotRequest associateLexBotRequest);

    /**
     * <p>
     * Associates a set of queues with a routing profile.
     * </p>
     * 
     * @param associateRoutingProfileQueuesRequest
     * @return Result of the AssociateRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.AssociateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateRoutingProfileQueuesResult associateRoutingProfileQueues(AssociateRoutingProfileQueuesRequest associateRoutingProfileQueuesRequest);

    /**
     * <p>
     * Associates a security key to the instance.
     * </p>
     * 
     * @param associateSecurityKeyRequest
     * @return Result of the AssociateSecurityKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateSecurityKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateSecurityKey" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateSecurityKeyResult associateSecurityKey(AssociateSecurityKeyRequest associateSecurityKeyRequest);

    /**
     * <p>
     * Creates a contact flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param createContactFlowRequest
     * @return Result of the CreateContactFlow operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidContactFlowException
     *         The contact flow is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.CreateContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlow" target="_top">AWS API
     *      Documentation</a>
     */
    CreateContactFlowResult createContactFlow(CreateContactFlowRequest createContactFlowRequest);

    /**
     * <p>
     * Initiates an Amazon Connect instance with all the supported channels enabled. It does not attach any storage
     * (such as Amazon S3, or Kinesis) or allow for any configurations on features such as Contact Lens for Amazon
     * Connect.
     * </p>
     * 
     * @param createInstanceRequest
     * @return Result of the CreateInstance operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInstanceResult createInstance(CreateInstanceRequest createInstanceRequest);

    /**
     * <p>
     * Creates a new routing profile.
     * </p>
     * 
     * @param createRoutingProfileRequest
     * @return Result of the CreateRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.CreateRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRoutingProfileResult createRoutingProfile(CreateRoutingProfileRequest createRoutingProfileRequest);

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about how to create user accounts using the Amazon Connect console, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html">Add Users</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a new user hierarchy group.
     * </p>
     * 
     * @param createUserHierarchyGroupRequest
     * @return Result of the CreateUserHierarchyGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.CreateUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateUserHierarchyGroupResult createUserHierarchyGroup(CreateUserHierarchyGroupRequest createUserHierarchyGroupRequest);

    /**
     * <p>
     * Deletes the Amazon Connect instance.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @sample AmazonConnect.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInstanceResult deleteInstance(DeleteInstanceRequest deleteInstanceRequest);

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about what happens to a user's data when their account is deleted, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/delete-users.html">Delete Users from Your Amazon
     * Connect Instance</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes an existing user hierarchy group. It must not be associated with any agents or have any active child
     * groups.
     * </p>
     * 
     * @param deleteUserHierarchyGroupRequest
     * @return Result of the DeleteUserHierarchyGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DeleteUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteUserHierarchyGroupResult deleteUserHierarchyGroup(DeleteUserHierarchyGroupRequest deleteUserHierarchyGroupRequest);

    /**
     * <p>
     * Describes the specified contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param describeContactFlowRequest
     * @return Result of the DescribeContactFlow operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ContactFlowNotPublishedException
     *         The contact flow has not been published.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DescribeContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactFlow" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeContactFlowResult describeContactFlow(DescribeContactFlowRequest describeContactFlowRequest);

    /**
     * <p>
     * Returns the current state of the specified instance identifier. It tracks the instance while it is being created
     * and returns an error status if applicable.
     * </p>
     * <p>
     * If an instance is not created successfully, the instance status reason field returns details relevant to the
     * reason. The instance in a failed state is returned only for 24 hours after the CreateInstance API was invoked.
     * </p>
     * 
     * @param describeInstanceRequest
     * @return Result of the DescribeInstance operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DescribeInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInstanceResult describeInstance(DescribeInstanceRequest describeInstanceRequest);

    /**
     * <p>
     * Describes the specified instance attribute.
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @return Result of the DescribeInstanceAttribute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DescribeInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstanceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest describeInstanceAttributeRequest);

    /**
     * <p>
     * Retrieves the current storage configurations for the specified resource type, association ID, and instance ID.
     * </p>
     * 
     * @param describeInstanceStorageConfigRequest
     * @return Result of the DescribeInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DescribeInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceStorageConfigResult describeInstanceStorageConfig(DescribeInstanceStorageConfigRequest describeInstanceStorageConfigRequest);

    /**
     * <p>
     * Describes the specified routing profile.
     * </p>
     * 
     * @param describeRoutingProfileRequest
     * @return Result of the DescribeRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DescribeRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeRoutingProfileResult describeRoutingProfile(DescribeRoutingProfileRequest describeRoutingProfileRequest);

    /**
     * <p>
     * Describes the specified user account. You can find the instance ID in the console (it’s the final part of the
     * ARN). The console does not display the user IDs. Instead, list the users and note the IDs provided in the output.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return Result of the DescribeUserHierarchyGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DescribeUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeUserHierarchyGroupResult describeUserHierarchyGroup(DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest);

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return Result of the DescribeUserHierarchyStructure operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DescribeUserHierarchyStructure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUserHierarchyStructure"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeUserHierarchyStructureResult describeUserHierarchyStructure(DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest);

    /**
     * <p>
     * Revokes access to integrated applications from Amazon Connect.
     * </p>
     * 
     * @param disassociateApprovedOriginRequest
     * @return Result of the DisassociateApprovedOrigin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateApprovedOrigin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateApprovedOrigin"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateApprovedOriginResult disassociateApprovedOrigin(DisassociateApprovedOriginRequest disassociateApprovedOriginRequest);

    /**
     * <p>
     * Removes the storage type configurations for the specified resource type and association ID.
     * </p>
     * 
     * @param disassociateInstanceStorageConfigRequest
     * @return Result of the DisassociateInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateInstanceStorageConfigResult disassociateInstanceStorageConfig(DisassociateInstanceStorageConfigRequest disassociateInstanceStorageConfigRequest);

    /**
     * <p>
     * Remove the Lambda function from the drop-down options available in the relevant contact flow blocks.
     * </p>
     * 
     * @param disassociateLambdaFunctionRequest
     * @return Result of the DisassociateLambdaFunction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateLambdaFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLambdaFunction"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateLambdaFunctionResult disassociateLambdaFunction(DisassociateLambdaFunctionRequest disassociateLambdaFunctionRequest);

    /**
     * <p>
     * Revokes authorization from the specified instance to access the specified Amazon Lex bot.
     * </p>
     * 
     * @param disassociateLexBotRequest
     * @return Result of the DisassociateLexBot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateLexBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLexBot" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateLexBotResult disassociateLexBot(DisassociateLexBotRequest disassociateLexBotRequest);

    /**
     * <p>
     * Disassociates a set of queues from a routing profile.
     * </p>
     * 
     * @param disassociateRoutingProfileQueuesRequest
     * @return Result of the DisassociateRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DisassociateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateRoutingProfileQueuesResult disassociateRoutingProfileQueues(DisassociateRoutingProfileQueuesRequest disassociateRoutingProfileQueuesRequest);

    /**
     * <p>
     * Deletes the specified security key.
     * </p>
     * 
     * @param disassociateSecurityKeyRequest
     * @return Result of the DisassociateSecurityKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateSecurityKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateSecurityKey"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateSecurityKeyResult disassociateSecurityKey(DisassociateSecurityKeyRequest disassociateSecurityKeyRequest);

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return Result of the GetContactAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.GetContactAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetContactAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    GetContactAttributesResult getContactAttributes(GetContactAttributesRequest getContactAttributesRequest);

    /**
     * <p>
     * Gets the real-time metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html">Real-time Metrics
     * Definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @return Result of the GetCurrentMetricData operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.GetCurrentMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentMetricData" target="_top">AWS
     *      API Documentation</a>
     */
    GetCurrentMetricDataResult getCurrentMetricData(GetCurrentMetricDataRequest getCurrentMetricDataRequest);

    /**
     * <p>
     * Retrieves a token for federation.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @return Result of the GetFederationToken operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws UserNotFoundException
     *         No user with the specified credentials was found in the Amazon Connect instance.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @sample AmazonConnect.GetFederationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetFederationToken" target="_top">AWS API
     *      Documentation</a>
     */
    GetFederationTokenResult getFederationToken(GetFederationTokenRequest getFederationTokenRequest);

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each historical metric, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html">Historical
     * Metrics Definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param getMetricDataRequest
     * @return Result of the GetMetricData operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.GetMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    GetMetricDataResult getMetricData(GetMetricDataRequest getMetricDataRequest);

    /**
     * <p>
     * Returns a paginated list of all approved origins associated with the instance.
     * </p>
     * 
     * @param listApprovedOriginsRequest
     * @return Result of the ListApprovedOrigins operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListApprovedOrigins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListApprovedOrigins" target="_top">AWS
     *      API Documentation</a>
     */
    ListApprovedOriginsResult listApprovedOrigins(ListApprovedOriginsRequest listApprovedOriginsRequest);

    /**
     * <p>
     * Provides information about the contact flows for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * For more information about contact flows, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html">Contact Flows</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @return Result of the ListContactFlows operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListContactFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlows" target="_top">AWS API
     *      Documentation</a>
     */
    ListContactFlowsResult listContactFlows(ListContactFlowsRequest listContactFlowsRequest);

    /**
     * <p>
     * Provides information about the hours of operation for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about hours of operation, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-hours-operation.html">Set the Hours of Operation
     * for a Queue</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @return Result of the ListHoursOfOperations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListHoursOfOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListHoursOfOperations" target="_top">AWS
     *      API Documentation</a>
     */
    ListHoursOfOperationsResult listHoursOfOperations(ListHoursOfOperationsRequest listHoursOfOperationsRequest);

    /**
     * <p>
     * Returns a paginated list of all attribute types for the given instance.
     * </p>
     * 
     * @param listInstanceAttributesRequest
     * @return Result of the ListInstanceAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListInstanceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    ListInstanceAttributesResult listInstanceAttributes(ListInstanceAttributesRequest listInstanceAttributesRequest);

    /**
     * <p>
     * Returns a paginated list of storage configs for the identified instance and resource type.
     * </p>
     * 
     * @param listInstanceStorageConfigsRequest
     * @return Result of the ListInstanceStorageConfigs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListInstanceStorageConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceStorageConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListInstanceStorageConfigsResult listInstanceStorageConfigs(ListInstanceStorageConfigsRequest listInstanceStorageConfigsRequest);

    /**
     * <p>
     * Return a list of instances which are in active state, creation-in-progress state, and failed state. Instances
     * that aren't successfully created (they are in a failed state) are returned only for 24 hours after the
     * CreateInstance API was invoked.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstances" target="_top">AWS API
     *      Documentation</a>
     */
    ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Returns a paginated list of all the Lambda functions that show up in the drop-down options in the relevant
     * contact flow blocks.
     * </p>
     * 
     * @param listLambdaFunctionsRequest
     * @return Result of the ListLambdaFunctions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListLambdaFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLambdaFunctions" target="_top">AWS
     *      API Documentation</a>
     */
    ListLambdaFunctionsResult listLambdaFunctions(ListLambdaFunctionsRequest listLambdaFunctionsRequest);

    /**
     * <p>
     * Returns a paginated list of all the Amazon Lex bots currently associated with the instance.
     * </p>
     * 
     * @param listLexBotsRequest
     * @return Result of the ListLexBots operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListLexBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLexBots" target="_top">AWS API
     *      Documentation</a>
     */
    ListLexBotsResult listLexBots(ListLexBotsRequest listLexBotsRequest);

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about phone numbers, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html">Set Up Phone
     * Numbers for Your Contact Center</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return Result of the ListPhoneNumbers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbers" target="_top">AWS API
     *      Documentation</a>
     */
    ListPhoneNumbersResult listPhoneNumbers(ListPhoneNumbersRequest listPhoneNumbersRequest);

    /**
     * <p>
     * Provides information about the prompts for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listPromptsRequest
     * @return Result of the ListPrompts operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListPrompts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPrompts" target="_top">AWS API
     *      Documentation</a>
     */
    ListPromptsResult listPrompts(ListPromptsRequest listPromptsRequest);

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about queues, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-queues-standard-and-agent.html">Queues:
     * Standard and Agent</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listQueuesRequest
     * @return Result of the ListQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest);

    /**
     * <p>
     * List the queues associated with a routing profile.
     * </p>
     * 
     * @param listRoutingProfileQueuesRequest
     * @return Result of the ListRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    ListRoutingProfileQueuesResult listRoutingProfileQueues(ListRoutingProfileQueuesRequest listRoutingProfileQueuesRequest);

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about routing profiles, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing.html">Routing Profiles</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/routing-profiles.html">Create a Routing Profile</a>
     * in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @return Result of the ListRoutingProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListRoutingProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    ListRoutingProfilesResult listRoutingProfiles(ListRoutingProfilesRequest listRoutingProfilesRequest);

    /**
     * <p>
     * Returns a paginated list of all security keys associated with the instance.
     * </p>
     * 
     * @param listSecurityKeysRequest
     * @return Result of the ListSecurityKeys operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListSecurityKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityKeys" target="_top">AWS API
     *      Documentation</a>
     */
    ListSecurityKeysResult listSecurityKeys(ListSecurityKeysRequest listSecurityKeysRequest);

    /**
     * <p>
     * Provides summary information about the security profiles for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about security profiles, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/connect-security-profiles.html">Security Profiles</a>
     * in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return Result of the ListSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    ListSecurityProfilesResult listSecurityProfiles(ListSecurityProfilesRequest listSecurityProfilesRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * <p>
     * For sample policies that use tags, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html">Amazon
     * Connect Identity-Based Policy Examples</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about agent hierarchies, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/agent-hierarchy.html">Set Up Agent Hierarchies</a> in
     * the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @return Result of the ListUserHierarchyGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListUserHierarchyGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUserHierarchyGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListUserHierarchyGroupsResult listUserHierarchyGroups(ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest);

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * When a contact is being recorded, and the recording has been suspended using SuspendContactRecording, this API
     * resumes recording the call.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param resumeContactRecordingRequest
     * @return Result of the ResumeContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ResumeContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ResumeContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    ResumeContactRecordingResult resumeContactRecording(ResumeContactRecordingRequest resumeContactRecordingRequest);

    /**
     * <p>
     * Initiates a contact flow to start a new chat for the customer. Response of this API provides a token required to
     * obtain credentials from the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients need to subscribe to the participant’s connection for
     * the created chat within 5 minutes. This is achieved by invoking <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in two situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a <code>TooManyRequests</code> exception from the API
     * Gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">quota for
     * concurrent active chats</a> is exceeded. Active chat throttling returns a <code>LimitExceededException</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how chat works, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat.html">Chat</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param startChatContactRequest
     * @return Result of the StartChatContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @sample AmazonConnect.StartChatContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartChatContact" target="_top">AWS API
     *      Documentation</a>
     */
    StartChatContactResult startChatContact(StartChatContactRequest startChatContactRequest);

    /**
     * <p>
     * This API starts recording the contact when the agent joins the call. StartContactRecording is a one-time action.
     * For example, if you use StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend and
     * resume it, such as when collecting sensitive information (for example, a credit card number), use
     * SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * You can use this API to override the recording behavior configured in the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-recording-behavior.html">Set recording
     * behavior</a> block.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param startContactRecordingRequest
     * @return Result of the StartContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.StartContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    StartContactRecordingResult startContactRecording(StartContactRecordingRequest startContactRecordingRequest);

    /**
     * <p>
     * This API places an outbound call to a contact, and then initiates the contact flow. It performs the actions in
     * the contact flow that's specified (in <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents are not involved in initiating the outbound API (that is, dialing the contact). If the contact flow places
     * an outbound call to a contact, and then puts the contact in queue, that's when the call is routed to the agent,
     * like any other inbound case.
     * </p>
     * <p>
     * There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.
     * </p>
     * <note>
     * <p>
     * UK numbers with a 447 prefix are not allowed by default. Before you can dial these UK mobile numbers, you must
     * submit a service quota increase request. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
     * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </note>
     * 
     * @param startOutboundVoiceContactRequest
     * @return Result of the StartOutboundVoiceContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws DestinationNotAllowedException
     *         Outbound calls to the destination number are not allowed.
     * @throws OutboundContactNotPermittedException
     *         The contact is not permitted.
     * @sample AmazonConnect.StartOutboundVoiceContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartOutboundVoiceContact"
     *      target="_top">AWS API Documentation</a>
     */
    StartOutboundVoiceContactResult startOutboundVoiceContact(StartOutboundVoiceContactRequest startOutboundVoiceContactRequest);

    /**
     * <p>
     * Ends the specified contact.
     * </p>
     * 
     * @param stopContactRequest
     * @return Result of the StopContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ContactNotFoundException
     *         The contact with the specified ID is not active or does not exist.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.StopContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContact" target="_top">AWS API
     *      Documentation</a>
     */
    StopContactResult stopContact(StopContactRequest stopContactRequest);

    /**
     * <p>
     * When a contact is being recorded, this API stops recording the call. StopContactRecording is a one-time action.
     * If you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart
     * it. For scenarios where the recording has started and you want to suspend it for sensitive information (for
     * example, to collect a credit card number), and then restart it, use SuspendContactRecording and
     * ResumeContactRecording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param stopContactRecordingRequest
     * @return Result of the StopContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.StopContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    StopContactRecordingResult stopContactRecording(StopContactRecordingRequest stopContactRecordingRequest);

    /**
     * <p>
     * When a contact is being recorded, this API suspends recording the call. For example, you might suspend the call
     * recording while collecting sensitive information, such as a credit card number. Then use ResumeContactRecording
     * to restart recording.
     * </p>
     * <p>
     * The period of time that the recording is suspended is filled with silence in the final recording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param suspendContactRecordingRequest
     * @return Result of the SuspendContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.SuspendContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SuspendContactRecording"
     *      target="_top">AWS API Documentation</a>
     */
    SuspendContactRecordingResult suspendContactRecording(SuspendContactRecordingRequest suspendContactRecordingRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * The supported resource types are users, routing profiles, and contact flows.
     * </p>
     * <p>
     * For sample policies that use tags, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html">Amazon
     * Connect Identity-Based Policy Examples</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Creates or updates the contact attributes associated with the specified contact.
     * </p>
     * <p>
     * You can add or update attributes for both ongoing and completed contacts. For example, you can update the
     * customer's name or the reason the customer called while the call is active, or add notes about steps that the
     * agent took during the call that are displayed to the next agent that takes the call. You can also update
     * attributes for a contact using data from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are then deleted.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for contacts that occurred prior to the
     * release of the API, September 12, 2018. You can update attributes only for contacts that started after the
     * release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the
     * API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of
     * the API but are still active in your instance.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return Result of the UpdateContactAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateContactAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContactAttributesResult updateContactAttributes(UpdateContactAttributesRequest updateContactAttributesRequest);

    /**
     * <p>
     * Updates the specified contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowContentRequest
     * @return Result of the UpdateContactFlowContent operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidContactFlowException
     *         The contact flow is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowContent"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContactFlowContentResult updateContactFlowContent(UpdateContactFlowContentRequest updateContactFlowContentRequest);

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * <p>
     * You can also create and update contact flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowNameRequest
     * @return Result of the UpdateContactFlowName operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowName" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateContactFlowNameResult updateContactFlowName(UpdateContactFlowNameRequest updateContactFlowNameRequest);

    /**
     * <p>
     * Updates the value for the specified attribute type.
     * </p>
     * 
     * @param updateInstanceAttributeRequest
     * @return Result of the UpdateInstanceAttribute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UpdateInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInstanceAttributeResult updateInstanceAttribute(UpdateInstanceAttributeRequest updateInstanceAttributeRequest);

    /**
     * <p>
     * Updates an existing configuration for a resource type. This API is idempotent.
     * </p>
     * 
     * @param updateInstanceStorageConfigRequest
     * @return Result of the UpdateInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UpdateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInstanceStorageConfigResult updateInstanceStorageConfig(UpdateInstanceStorageConfigRequest updateInstanceStorageConfigRequest);

    /**
     * <p>
     * Updates the channels that agents can handle in the Contact Control Panel (CCP) for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileConcurrencyRequest
     * @return Result of the UpdateRoutingProfileConcurrency operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingProfileConcurrencyResult updateRoutingProfileConcurrency(UpdateRoutingProfileConcurrencyRequest updateRoutingProfileConcurrencyRequest);

    /**
     * <p>
     * Updates the default outbound queue of a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileDefaultOutboundQueueRequest
     * @return Result of the UpdateRoutingProfileDefaultOutboundQueue operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileDefaultOutboundQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileDefaultOutboundQueue"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingProfileDefaultOutboundQueueResult updateRoutingProfileDefaultOutboundQueue(
            UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest);

    /**
     * <p>
     * Updates the name and description of a routing profile. The request accepts the following data in JSON format. At
     * least <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateRoutingProfileNameRequest
     * @return Result of the UpdateRoutingProfileName operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileName"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingProfileNameResult updateRoutingProfileName(UpdateRoutingProfileNameRequest updateRoutingProfileNameRequest);

    /**
     * <p>
     * Updates the properties associated with a set of queues for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileQueuesRequest
     * @return Result of the UpdateRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingProfileQueuesResult updateRoutingProfileQueues(UpdateRoutingProfileQueuesRequest updateRoutingProfileQueuesRequest);

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @return Result of the UpdateUserHierarchy operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserHierarchy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchy" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateUserHierarchyResult updateUserHierarchy(UpdateUserHierarchyRequest updateUserHierarchyRequest);

    /**
     * <p>
     * Updates the name of the user hierarchy group.
     * </p>
     * 
     * @param updateUserHierarchyGroupNameRequest
     * @return Result of the UpdateUserHierarchyGroupName operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserHierarchyGroupName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyGroupName"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserHierarchyGroupNameResult updateUserHierarchyGroupName(UpdateUserHierarchyGroupNameRequest updateUserHierarchyGroupNameRequest);

    /**
     * <p>
     * Updates the user hierarchy structure: add, remove, and rename user hierarchy levels.
     * </p>
     * 
     * @param updateUserHierarchyStructureRequest
     * @return Result of the UpdateUserHierarchyStructure operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserHierarchyStructure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyStructure"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserHierarchyStructureResult updateUserHierarchyStructure(UpdateUserHierarchyStructureRequest updateUserHierarchyStructureRequest);

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * <important>
     * <p>
     * Someone with the ability to invoke <code>UpdateUserIndentityInfo</code> can change the login credentials of other
     * users by changing their email address. This poses a security risk to your organization. They can change the email
     * address of a user to the attacker's email address, and then reset the password through email. We strongly
     * recommend limiting who has the ability to invoke <code>UpdateUserIndentityInfo</code>. For more information, see
     * <a href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html">Best
     * Practices for Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </important>
     * 
     * @param updateUserIdentityInfoRequest
     * @return Result of the UpdateUserIdentityInfo operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserIdentityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserIdentityInfo" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateUserIdentityInfoResult updateUserIdentityInfo(UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest);

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @return Result of the UpdateUserPhoneConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserPhoneConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserPhoneConfig" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateUserPhoneConfigResult updateUserPhoneConfig(UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest);

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @return Result of the UpdateUserRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserRoutingProfile"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserRoutingProfileResult updateUserRoutingProfile(UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest);

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @return Result of the UpdateUserSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserSecurityProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserSecurityProfilesResult updateUserSecurityProfiles(UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest);

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
