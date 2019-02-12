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
package com.amazonaws.services.appstream;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.services.appstream.waiters.AmazonAppStreamWaiters;

/**
 * Interface for accessing Amazon AppStream.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appstream.AbstractAmazonAppStream} instead.
 * </p>
 * <p>
 * <fullname>Amazon AppStream 2.0</fullname>
 * <p>
 * This is the <i>Amazon AppStream 2.0 API Reference</i>. This reference provides descriptions and syntax for each of
 * the actions and data types in AppStream 2.0. AppStream 2.0 is a fully managed application streaming service. You
 * centrally manage your desktop applications on AppStream 2.0 and securely deliver them to any computer. AppStream 2.0
 * manages the AWS resources required to host and run your applications, scales automatically, and provides access to
 * your users on demand.
 * </p>
 * <p>
 * To learn more about AppStream 2.0, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/appstream2">Amazon AppStream 2.0 product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/documentation/appstream2">Amazon AppStream 2.0 documentation</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAppStream {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "appstream2";

    /**
     * Overrides the default endpoint for this client ("appstream2.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "appstream2.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "appstream2.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "appstream2.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "appstream2.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonAppStream#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Associates the specified fleet with the specified stack.
     * </p>
     * 
     * @param associateFleetRequest
     * @return Result of the AssociateFleet operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.AssociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AssociateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateFleetResult associateFleet(AssociateFleetRequest associateFleetRequest);

    /**
     * <p>
     * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with
     * fleets that are joined to an Active Directory domain.
     * </p>
     * 
     * @param batchAssociateUserStackRequest
     * @return Result of the BatchAssociateUserStack operation returned by the service.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.BatchAssociateUserStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/BatchAssociateUserStack"
     *      target="_top">AWS API Documentation</a>
     */
    BatchAssociateUserStackResult batchAssociateUserStack(BatchAssociateUserStackRequest batchAssociateUserStackRequest);

    /**
     * <p>
     * Disassociates the specified users from the specified stacks.
     * </p>
     * 
     * @param batchDisassociateUserStackRequest
     * @return Result of the BatchDisassociateUserStack operation returned by the service.
     * @sample AmazonAppStream.BatchDisassociateUserStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/BatchDisassociateUserStack"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisassociateUserStackResult batchDisassociateUserStack(BatchDisassociateUserStackRequest batchDisassociateUserStackRequest);

    /**
     * <p>
     * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you
     * added to the image will not be copied.
     * </p>
     * 
     * @param copyImageRequest
     * @return Result of the CopyImage operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @sample AmazonAppStream.CopyImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CopyImage" target="_top">AWS API
     *      Documentation</a>
     */
    CopyImageResult copyImage(CopyImageRequest copyImageRequest);

    /**
     * <p>
     * Creates a Directory Config object in AppStream 2.0. This object includes the information required to join
     * streaming instances to an Active Directory domain.
     * </p>
     * 
     * @param createDirectoryConfigRequest
     * @return Result of the CreateDirectoryConfig operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @sample AmazonAppStream.CreateDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDirectoryConfigResult createDirectoryConfig(CreateDirectoryConfigRequest createDirectoryConfigRequest);

    /**
     * <p>
     * Creates a fleet. A fleet consists of streaming instances that run a specified image.
     * </p>
     * 
     * @param createFleetRequest
     * @return Result of the CreateFleet operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates an image builder. An image builder is a virtual machine that is used to create an image.
     * </p>
     * <p>
     * The initial state of the builder is <code>PENDING</code>. When it is ready, the state is <code>RUNNING</code>.
     * </p>
     * 
     * @param createImageBuilderRequest
     * @return Result of the CreateImageBuilder operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.CreateImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    CreateImageBuilderResult createImageBuilder(CreateImageBuilderRequest createImageBuilderRequest);

    /**
     * <p>
     * Creates a URL to start an image builder streaming session.
     * </p>
     * 
     * @param createImageBuilderStreamingURLRequest
     * @return Result of the CreateImageBuilderStreamingURL operation returned by the service.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.CreateImageBuilderStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilderStreamingURL"
     *      target="_top">AWS API Documentation</a>
     */
    CreateImageBuilderStreamingURLResult createImageBuilderStreamingURL(CreateImageBuilderStreamingURLRequest createImageBuilderStreamingURLRequest);

    /**
     * <p>
     * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access
     * policies, and storage configurations.
     * </p>
     * 
     * @param createStackRequest
     * @return Result of the CreateStack operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStackResult createStack(CreateStackRequest createStackRequest);

    /**
     * <p>
     * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL
     * enables application streaming to be tested without user setup.
     * </p>
     * 
     * @param createStreamingURLRequest
     * @return Result of the CreateStreamingURL operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.CreateStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStreamingURL" target="_top">AWS
     *      API Documentation</a>
     */
    CreateStreamingURLResult createStreamingURL(CreateStreamingURLRequest createStreamingURLRequest);

    /**
     * <p>
     * Creates a new user in the user pool.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required
     * to join streaming instances to an Active Directory domain.
     * </p>
     * 
     * @param deleteDirectoryConfigRequest
     * @return Result of the DeleteDirectoryConfig operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DeleteDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDirectoryConfigResult deleteDirectoryConfig(DeleteDirectoryConfigRequest deleteDirectoryConfigRequest);

    /**
     * <p>
     * Deletes the specified fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot
     * provision new capacity using the image.
     * </p>
     * 
     * @param deleteImageRequest
     * @return Result of the DeleteImage operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteImageResult deleteImage(DeleteImageRequest deleteImageRequest);

    /**
     * <p>
     * Deletes the specified image builder and releases the capacity.
     * </p>
     * 
     * @param deleteImageBuilderRequest
     * @return Result of the DeleteImageBuilder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteImageBuilderResult deleteImageBuilder(DeleteImageBuilderRequest deleteImageBuilderRequest);

    /**
     * <p>
     * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to
     * which you previously granted these permissions can no longer use the image.
     * </p>
     * 
     * @param deleteImagePermissionsRequest
     * @return Result of the DeleteImagePermissions operation returned by the service.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DeleteImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteImagePermissionsResult deleteImagePermissions(DeleteImagePermissionsRequest deleteImagePermissionsRequest);

    /**
     * <p>
     * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the
     * stack is no longer available to users. Also, any reservations made for application streaming sessions for the
     * stack are released.
     * </p>
     * 
     * @param deleteStackRequest
     * @return Result of the DeleteStack operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStackResult deleteStack(DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * Deletes a user from the user pool.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names
     * for these objects are provided. Otherwise, all Directory Config objects in the account are described. These
     * objects include the information required to join streaming instances to an Active Directory domain.
     * </p>
     * <p>
     * Although the response syntax in this topic includes the account password, this password is not returned in the
     * actual response.
     * </p>
     * 
     * @param describeDirectoryConfigsRequest
     * @return Result of the DescribeDirectoryConfigs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeDirectoryConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeDirectoryConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDirectoryConfigsResult describeDirectoryConfigs(DescribeDirectoryConfigsRequest describeDirectoryConfigsRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all
     * fleets in the account are described.
     * </p>
     * 
     * @param describeFleetsRequest
     * @return Result of the DescribeFleets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeFleets" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFleetsResult describeFleets(DescribeFleetsRequest describeFleetsRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified image builders, if the image builder names are provided.
     * Otherwise, all image builders in the account are described.
     * </p>
     * 
     * @param describeImageBuildersRequest
     * @return Result of the DescribeImageBuilders operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeImageBuilders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImageBuilders"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeImageBuildersResult describeImageBuilders(DescribeImageBuildersRequest describeImageBuildersRequest);

    /**
     * <p>
     * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own.
     * </p>
     * 
     * @param describeImagePermissionsRequest
     * @return Result of the DescribeImagePermissions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeImagePermissionsResult describeImagePermissions(DescribeImagePermissionsRequest describeImagePermissionsRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided.
     * Otherwise, all images in the account are described.
     * </p>
     * 
     * @param describeImagesRequest
     * @return Result of the DescribeImages operation returned by the service.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest);

    /**
     * <p>
     * Retrieves a list that describes the active streaming sessions for a specified stack and fleet. If a value for
     * <code>UserId</code> is provided for the stack and fleet, only streaming sessions for that user are described. If
     * an authentication type is not provided, the default is to authenticate users using a streaming URL.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return Result of the DescribeSessions operation returned by the service.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSessionsResult describeSessions(DescribeSessionsRequest describeSessionsRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all
     * stacks in the account are described.
     * </p>
     * 
     * @param describeStacksRequest
     * @return Result of the DescribeStacks operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeStacks" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest);

    /**
     * <p>
     * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The stack name
     * </p>
     * </li>
     * <li>
     * <p>
     * The user name (email address of the user associated with the stack) and the authentication type for the user
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeUserStackAssociationsRequest
     * @return Result of the DescribeUserStackAssociations operation returned by the service.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.DescribeUserStackAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeUserStackAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeUserStackAssociationsResult describeUserStackAssociations(DescribeUserStackAssociationsRequest describeUserStackAssociationsRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified users in the user pool.
     * </p>
     * 
     * @param describeUsersRequest
     * @return Result of the DescribeUsers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUsersResult describeUsers(DescribeUsersRequest describeUsersRequest);

    /**
     * <p>
     * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled.
     * This action does not delete the user.
     * </p>
     * 
     * @param disableUserRequest
     * @return Result of the DisableUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisableUser" target="_top">AWS API
     *      Documentation</a>
     */
    DisableUserResult disableUser(DisableUserRequest disableUserRequest);

    /**
     * <p>
     * Disassociates the specified fleet from the specified stack.
     * </p>
     * 
     * @param disassociateFleetRequest
     * @return Result of the DisassociateFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DisassociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisassociateFleet" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateFleetResult disassociateFleet(DisassociateFleetRequest disassociateFleetRequest);

    /**
     * <p>
     * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications
     * from the stacks to which they are assigned.
     * </p>
     * 
     * @param enableUserRequest
     * @return Result of the EnableUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @sample AmazonAppStream.EnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/EnableUser" target="_top">AWS API
     *      Documentation</a>
     */
    EnableUserResult enableUser(EnableUserRequest enableUserRequest);

    /**
     * <p>
     * Immediately stops the specified streaming session.
     * </p>
     * 
     * @param expireSessionRequest
     * @return Result of the ExpireSession operation returned by the service.
     * @sample AmazonAppStream.ExpireSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ExpireSession" target="_top">AWS API
     *      Documentation</a>
     */
    ExpireSessionResult expireSession(ExpireSessionRequest expireSessionRequest);

    /**
     * <p>
     * Retrieves the name of the fleet that is associated with the specified stack.
     * </p>
     * 
     * @param listAssociatedFleetsRequest
     * @return Result of the ListAssociatedFleets operation returned by the service.
     * @sample AmazonAppStream.ListAssociatedFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedFleets" target="_top">AWS
     *      API Documentation</a>
     */
    ListAssociatedFleetsResult listAssociatedFleets(ListAssociatedFleetsRequest listAssociatedFleetsRequest);

    /**
     * <p>
     * Retrieves the name of the stack with which the specified fleet is associated.
     * </p>
     * 
     * @param listAssociatedStacksRequest
     * @return Result of the ListAssociatedStacks operation returned by the service.
     * @sample AmazonAppStream.ListAssociatedStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedStacks" target="_top">AWS
     *      API Documentation</a>
     */
    ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest listAssociatedStacksRequest);

    /**
     * <p>
     * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders,
     * images, fleets, and stacks.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts the specified fleet.
     * </p>
     * 
     * @param startFleetRequest
     * @return Result of the StartFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.StartFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartFleet" target="_top">AWS API
     *      Documentation</a>
     */
    StartFleetResult startFleet(StartFleetRequest startFleetRequest);

    /**
     * <p>
     * Starts the specified image builder.
     * </p>
     * 
     * @param startImageBuilderRequest
     * @return Result of the StartImageBuilder operation returned by the service.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @sample AmazonAppStream.StartImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    StartImageBuilderResult startImageBuilder(StartImageBuilderRequest startImageBuilderRequest);

    /**
     * <p>
     * Stops the specified fleet.
     * </p>
     * 
     * @param stopFleetRequest
     * @return Result of the StopFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.StopFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopFleet" target="_top">AWS API
     *      Documentation</a>
     */
    StopFleetResult stopFleet(StopFleetRequest stopFleetRequest);

    /**
     * <p>
     * Stops the specified image builder.
     * </p>
     * 
     * @param stopImageBuilderRequest
     * @return Result of the StopImageBuilder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.StopImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopImageBuilder" target="_top">AWS API
     *      Documentation</a>
     */
    StopImageBuilderResult stopImageBuilder(StopImageBuilderRequest stopImageBuilderRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image
     * builders, images, fleets, and stacks.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this
     * operation updates its value.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>. To disassociate tags from your
     * resources, use <a>UntagResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Disassociates one or more specified tags from the specified AppStream 2.0 resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified Directory Config object in AppStream 2.0. This object includes the information required to
     * join streaming instances to an Active Directory domain.
     * </p>
     * 
     * @param updateDirectoryConfigRequest
     * @return Result of the UpdateDirectoryConfig operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.UpdateDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDirectoryConfigResult updateDirectoryConfig(UpdateDirectoryConfigRequest updateDirectoryConfigRequest);

    /**
     * <p>
     * Updates the specified fleet.
     * </p>
     * <p>
     * If the fleet is in the <code>STOPPED</code> state, you can update any attribute except the fleet name. If the
     * fleet is in the <code>RUNNING</code> state, you can update the <code>DisplayName</code> and
     * <code>ComputeCapacity</code> attributes. If the fleet is in the <code>STARTING</code> or <code>STOPPING</code>
     * state, you can't update it.
     * </p>
     * 
     * @param updateFleetRequest
     * @return Result of the UpdateFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFleetResult updateFleet(UpdateFleetRequest updateFleetRequest);

    /**
     * <p>
     * Adds or updates permissions for the specified private image.
     * </p>
     * 
     * @param updateImagePermissionsRequest
     * @return Result of the UpdateImagePermissions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @sample AmazonAppStream.UpdateImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateImagePermissionsResult updateImagePermissions(UpdateImagePermissionsRequest updateImagePermissionsRequest);

    /**
     * <p>
     * Updates the specified fields for the specified stack.
     * </p>
     * 
     * @param updateStackRequest
     * @return Result of the UpdateStack operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidAccountStatusException
     *         The resource cannot be created because your AWS account is suspended. For assistance, contact AWS
     *         Support.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateStackResult updateStack(UpdateStackRequest updateStackRequest);

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

    AmazonAppStreamWaiters waiters();

}
