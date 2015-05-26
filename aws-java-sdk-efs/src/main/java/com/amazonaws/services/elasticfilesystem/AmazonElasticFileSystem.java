/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticfilesystem;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.elasticfilesystem.model.*;

/**
 * Interface for accessing AmazonElasticFileSystem.
 * Amazon Elastic File System
 */
public interface AmazonElasticFileSystem {

    /**
     * Overrides the default endpoint for this client ("elasticfilesystem.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elasticfilesystem.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "elasticfilesystem.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "elasticfilesystem.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "elasticfilesystem.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonElasticFileSystem#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Creates a new, empty file system. The operation requires a creation
     * token in the request that Amazon EFS uses to ensure idempotent
     * creation (calling the operation with same creation token has no
     * effect). If a file system does not currently exist that is owned by
     * the caller's AWS account with the specified creation token, this
     * operation does the following:
     * </p>
     * 
     * <ul>
     * <li>Creates a new, empty file system. The file system will have an
     * Amazon EFS assigned ID, and an initial lifecycle state "creating".
     * </li>
     * <li> Returns with the description of the created file system. </li>
     * 
     * </ul>
     * <p>
     * Otherwise, this operation returns a
     * <code>FileSystemAlreadyExists</code> error with the ID of the existing
     * file system.
     * </p>
     * <p>
     * <b>NOTE:</b>For basic use cases, you can use a randomly generated
     * UUID for the creation token.
     * </p>
     * <p>
     * The idempotent operation allows you to retry a
     * <code>CreateFileSystem</code> call without risk of creating an extra
     * file system. This can happen when an initial call fails in a way that
     * leaves it uncertain whether or not a file system was actually created.
     * An example might be that a transport level timeout occurred or your
     * connection was reset. As long as you use the same creation token, if
     * the initial call had succeeded in creating a file system, the client
     * can learn of its existence from the
     * <code>FileSystemAlreadyExists</code> error.
     * </p>
     * <p>
     * <b>NOTE:</b>The CreateFileSystem call returns while the file system's
     * lifecycle state is still "creating". You can check the file system
     * creation status by calling the DescribeFileSystems API, which among
     * other things returns the file system state.
     * </p>
     * <p>
     * After the file system is fully created, Amazon EFS sets its lifecycle
     * state to "available", at which point you can create one or more mount
     * targets for the file system (CreateMountTarget) in your VPC. You mount
     * your Amazon EFS file system on an EC2 instances in your VPC via the
     * mount target. For more information, see
     * <a href="http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html"> Amazon EFS: How it Works </a>
     * 
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:CreateFileSystem</code> action.
     * </p>
     *
     * @param createFileSystemRequest Container for the necessary parameters
     *           to execute the CreateFileSystem service method on
     *           AmazonElasticFileSystem.
     * 
     * @return The response from the CreateFileSystem service method, as
     *         returned by AmazonElasticFileSystem.
     * 
     * @throws FileSystemAlreadyExistsException
     * @throws FileSystemLimitExceededException
     * @throws BadRequestException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateFileSystemResult createFileSystem(CreateFileSystemRequest createFileSystemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified mount target.
     * </p>
     * <p>
     * This operation forcibly breaks any mounts of the file system via the
     * mount target being deleted, which might disrupt instances or
     * applications using those mounts. To avoid applications getting cut off
     * abruptly, you might consider unmounting any mounts of the mount
     * target, if feasible. The operation also deletes the associated network
     * interface. Uncommitted writes may be lost, but breaking a mount target
     * using this operation does not corrupt the file system itself. The file
     * system you created remains. You can mount an EC2 instance in your VPC
     * using another mount target.
     * </p>
     * <p>
     * This operation requires permission for the following action on the
     * file system:
     * </p>
     * 
     * <ul>
     * <li> <code>elasticfilesystem:DeleteMountTarget</code> </li>
     * 
     * </ul>
     * <p>
     * <b>NOTE:</b>The DeleteMountTarget call returns while the mount target
     * state is still "deleting". You can check the mount target deletion by
     * calling the DescribeMountTargets API, which returns a list of mount
     * target descriptions for the given file system.
     * </p>
     * <p>
     * The operation also requires permission for the following Amazon EC2
     * action on the mount target's network interface:
     * </p>
     * 
     * <ul>
     * <li> <code>ec2:DeleteNetworkInterface</code> </li>
     * 
     * </ul>
     *
     * @param deleteMountTargetRequest Container for the necessary parameters
     *           to execute the DeleteMountTarget service method on
     *           AmazonElasticFileSystem.
     * 
     * 
     * @throws BadRequestException
     * @throws DependencyTimeoutException
     * @throws MountTargetNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteMountTarget(DeleteMountTargetRequest deleteMountTargetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the description of a specific Amazon EFS file system if
     * either the file system <code>CreationToken</code> or the
     * <code>FileSystemId</code> is provided; otherwise, returns descriptions
     * of all file systems owned by the caller's AWS account in the AWS
     * region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally
     * specify the <code>MaxItems</code> parameter to limit the number of
     * descriptions in a response. If more file system descriptions remain,
     * Amazon EFS returns a <code>NextMarker</code> , an opaque token, in the
     * response. In this case, you should send a subsequent request with the
     * <code>Marker</code> request parameter set to the value of
     * <code>NextMarker</code> .
     * </p>
     * <p>
     * So to retrieve a list of your file system descriptions, the expected
     * usage of this API is an iterative process of first calling
     * <code>DescribeFileSystems</code> without the <code>Marker</code> and
     * then continuing to call it with the <code>Marker</code> parameter set
     * to the value of the <code>NextMarker</code> from the previous response
     * until the response has no <code>NextMarker</code> .
     * </p>
     * <p>
     * Note that the implementation may return fewer than
     * <code>MaxItems</code> file system descriptions while still including a
     * <code>NextMarker</code> value.
     * </p>
     * <p>
     * The order of file systems returned in the response of one
     * <code>DescribeFileSystems</code> call, and the order of file systems
     * returned across the responses of a multi-call iteration, is
     * unspecified.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DescribeFileSystems</code> action.
     * </p>
     *
     * @param describeFileSystemsRequest Container for the necessary
     *           parameters to execute the DescribeFileSystems service method on
     *           AmazonElasticFileSystem.
     * 
     * @return The response from the DescribeFileSystems service method, as
     *         returned by AmazonElasticFileSystem.
     * 
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeFileSystemsResult describeFileSystems(DescribeFileSystemsRequest describeFileSystemsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or overwrites tags associated with a file system. Each tag is
     * a key-value pair. If a tag key specified in the request already exists
     * on the file system, this operation overwrites its value with the value
     * provided in the request. If you add the "Name" tag to your file
     * system, Amazon EFS returns it in the response to the
     * DescribeFileSystems API.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:CreateTags</code> action.
     * </p>
     *
     * @param createTagsRequest Container for the necessary parameters to
     *           execute the CreateTags service method on AmazonElasticFileSystem.
     * 
     * 
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createTags(CreateTagsRequest createTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a file system, permanently severing access to its contents.
     * Upon return, the file system no longer exists and you will not be able
     * to access any contents of the deleted file system.
     * </p>
     * <p>
     * You cannot delete a file system that is in use. That is, if the file
     * system has any mount targets, you must first delete them. For more
     * information, see DescribeMountTargets and DeleteMountTarget.
     * </p>
     * <p>
     * <b>NOTE:</b>The DeleteFileSystem call returns while the file system
     * state is still "deleting". You can check the file system deletion
     * status by calling the DescribeFileSystems API, which returns a list of
     * file systems in your account. If you pass file system ID or creation
     * token for the deleted file system, the DescribeFileSystems will return
     * a 404 "FileSystemNotFound" error.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DeleteFileSystem</code> action.
     * </p>
     *
     * @param deleteFileSystemRequest Container for the necessary parameters
     *           to execute the DeleteFileSystem service method on
     *           AmazonElasticFileSystem.
     * 
     * 
     * @throws FileSystemInUseException
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteFileSystem(DeleteFileSystemRequest deleteFileSystemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the descriptions of the current mount targets for a file
     * system. The order of mount targets returned in the response is
     * unspecified.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DescribeMountTargets</code> action on the file
     * system <code>FileSystemId</code> .
     * </p>
     *
     * @param describeMountTargetsRequest Container for the necessary
     *           parameters to execute the DescribeMountTargets service method on
     *           AmazonElasticFileSystem.
     * 
     * @return The response from the DescribeMountTargets service method, as
     *         returned by AmazonElasticFileSystem.
     * 
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMountTargetsResult describeMountTargets(DescribeMountTargetsRequest describeMountTargetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a mount target for a file system. You can then mount the file
     * system on EC2 instances via the mount target.
     * </p>
     * <p>
     * You can create one mount target in each Availability Zone in your
     * VPC. All EC2 instances in a VPC within a given Availability Zone share
     * a single mount target for a given file system. If you have multiple
     * subnets in an Availability Zone, you create a mount target in one of
     * the subnets. EC2 instances do not need to be in the same subnet as the
     * mount target in order to access their file system. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html"> Amazon EFS: How it Works </a>
     * .
     * </p>
     * <p>
     * In the request, you also specify a file system ID for which you are
     * creating the mount target and the file system's lifecycle state must
     * be "available" (see DescribeFileSystems).
     * </p>
     * <p>
     * In the request, you also provide a subnet ID, which serves several
     * purposes:
     * </p>
     * 
     * <ul>
     * <li>It determines the VPC in which Amazon EFS creates the mount
     * target.</li>
     * <li>It determines the Availability Zone in which Amazon EFS creates
     * the mount target. </li>
     * <li>It determines the IP address range from which Amazon EFS selects
     * the IP address of the mount target if you don't specify an IP address
     * in the request. </li>
     * 
     * </ul>
     * <p>
     * After creating the mount target, Amazon EFS returns a response that
     * includes, a <code>MountTargetId</code> and an <code>IpAddress</code> .
     * You use this IP address when mounting the file system in an EC2
     * instance. You can also use the mount target's DNS name when mounting
     * the file system. The EC2 instance on which you mount the file system
     * via the mount target can resolve the mount target's DNS name to its IP
     * address. For more information, see
     * <a href="http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation"> How it Works: Implementation Overview </a>
     * 
     * </p>
     * <p>
     * Note that you can create mount targets for a file system in only one
     * VPC, and there can be only one mount target per Availability Zone.
     * That is, if the file system already has one or more mount targets
     * created for it, the request to add another mount target must meet the
     * following requirements:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * The subnet specified in the request must belong to the same VPC as
     * the subnets of the existing mount targets.
     * </p>
     * </li>
     * <li>The subnet specified in the request must not be in the same
     * Availability Zone as any of the subnets of the existing mount
     * targets.</li>
     * 
     * </ul>
     * <p>
     * If the request satisfies the requirements, Amazon EFS does the
     * following:
     * </p>
     * 
     * <ul>
     * <li>Creates a new mount target in the specified subnet. </li>
     * <li>Also creates a new network interface in the subnet as follows:
     * <ul>
     * <li>If the request provides an <code>IpAddress</code> , Amazon EFS
     * assigns that IP address to the network interface. Otherwise, Amazon
     * EFS assigns a free address in the subnet (in the same way that the
     * Amazon EC2 <code>CreateNetworkInterface</code> call does when a
     * request does not specify a primary private IP address).</li>
     * <li>If the request provides <code>SecurityGroups</code> , this
     * network interface is associated with those security groups. Otherwise,
     * it belongs to the default security group for the subnet's VPC.</li>
     * <li>Assigns the description <code>"Mount target fsmt-id for file
     * system fs-id"</code> where <code> fsmt-id </code> is the mount target
     * ID, and <code> fs-id </code> is the <code>FileSystemId</code> .</li>
     * <li>Sets the <code>requesterManaged</code> property of the network
     * interface to "true", and the <code>requesterId</code> value to
     * "EFS".</li>
     * 
     * </ul>
     * <p>
     * Each Amazon EFS mount target has one corresponding requestor-managed
     * EC2 network interface. After the network interface is created, Amazon
     * EFS sets the <code>NetworkInterfaceId</code> field in the mount
     * target's description to the network interface ID, and the
     * <code>IpAddress</code> field to its address. If network interface
     * creation fails, the entire <code>CreateMountTarget</code> operation
     * fails.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * <b>NOTE:</b>The CreateMountTarget call returns only after creating
     * the network interface, but while the mount target state is still
     * "creating". You can check the mount target creation status by calling
     * the DescribeFileSystems API, which among other things returns the
     * mount target state.
     * </p>
     * <p>
     * We recommend you create a mount target in each of the Availability
     * Zones. There are cost considerations for using a file system in an
     * Availability Zone through a mount target created in another
     * Availability Zone. For more information, go to
     * <a href="http://aws.amazon.com/efs/"> Amazon EFS </a>
     * product detail page. In addition, by always using a mount target
     * local to the instance's Availability Zone, you eliminate a partial
     * failure scenario; if the Availablity Zone in which your mount target
     * is created goes down, then you won't be able to access your file
     * system through that mount target.
     * </p>
     * <p>
     * This operation requires permission for the following action on the
     * file system:
     * </p>
     * 
     * <ul>
     * <li> <code>elasticfilesystem:CreateMountTarget</code> </li>
     * 
     * </ul>
     * <p>
     * This operation also requires permission for the following Amazon EC2
     * actions:
     * </p>
     * 
     * <ul>
     * <li> <code>ec2:DescribeSubnets</code> </li>
     * <li> <code>ec2:DescribeNetworkInterfaces</code> </li>
     * <li> <code>ec2:CreateNetworkInterface</code> </li>
     * 
     * </ul>
     *
     * @param createMountTargetRequest Container for the necessary parameters
     *           to execute the CreateMountTarget service method on
     *           AmazonElasticFileSystem.
     * 
     * @return The response from the CreateMountTarget service method, as
     *         returned by AmazonElasticFileSystem.
     * 
     * @throws SecurityGroupLimitExceededException
     * @throws IncorrectFileSystemLifeCycleStateException
     * @throws SubnetNotFoundException
     * @throws BadRequestException
     * @throws MountTargetConflictException
     * @throws SecurityGroupNotFoundException
     * @throws FileSystemNotFoundException
     * @throws NoFreeAddressesInSubnetException
     * @throws IpAddressInUseException
     * @throws NetworkInterfaceLimitExceededException
     * @throws UnsupportedAvailabilityZoneException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateMountTargetResult createMountTarget(CreateMountTargetRequest createMountTargetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the security groups currently in effect for a mount target.
     * This operation requires that the network interface of the mount target
     * has been created and the life cycle state of the mount target is not
     * "deleted".
     * </p>
     * <p>
     * This operation requires permissions for the following actions:
     * </p>
     * 
     * <ul>
     * <li> <code>elasticfilesystem:DescribeMountTargetSecurityGroups</code>
     * action on the mount target's file system. </li>
     * <li> <code>ec2:DescribeNetworkInterfaceAttribute</code> action on the
     * mount target's network interface. </li>
     * 
     * </ul>
     *
     * @param describeMountTargetSecurityGroupsRequest Container for the
     *           necessary parameters to execute the DescribeMountTargetSecurityGroups
     *           service method on AmazonElasticFileSystem.
     * 
     * @return The response from the DescribeMountTargetSecurityGroups
     *         service method, as returned by AmazonElasticFileSystem.
     * 
     * @throws IncorrectMountTargetStateException
     * @throws BadRequestException
     * @throws MountTargetNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest describeMountTargetSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the set of security groups in effect for a mount target.
     * </p>
     * <p>
     * When you create a mount target, Amazon EFS also creates a new network
     * interface (see CreateMountTarget). This operation replaces the
     * security groups in effect for the network interface associated with a
     * mount target, with the <code>SecurityGroups</code> provided in the
     * request. This operation requires that the network interface of the
     * mount target has been created and the life cycle state of the mount
     * target is not "deleted".
     * </p>
     * <p>
     * The operation requires permissions for the following actions:
     * </p>
     * 
     * <ul>
     * <li> <code>elasticfilesystem:ModifyMountTargetSecurityGroups</code>
     * action on the mount target's file system. </li>
     * <li> <code>ec2:ModifyNetworkInterfaceAttribute</code> action on the
     * mount target's network interface. </li>
     * 
     * </ul>
     *
     * @param modifyMountTargetSecurityGroupsRequest Container for the
     *           necessary parameters to execute the ModifyMountTargetSecurityGroups
     *           service method on AmazonElasticFileSystem.
     * 
     * 
     * @throws IncorrectMountTargetStateException
     * @throws SecurityGroupLimitExceededException
     * @throws BadRequestException
     * @throws SecurityGroupNotFoundException
     * @throws MountTargetNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyMountTargetSecurityGroups(ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the tags associated with a file system. The order of tags
     * returned in the response of one <code>DescribeTags</code> call, and
     * the order of tags returned across the responses of a multi-call
     * iteration (when using pagination), is unspecified.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DescribeTags</code> action.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags service method on AmazonElasticFileSystem.
     * 
     * @return The response from the DescribeTags service method, as returned
     *         by AmazonElasticFileSystem.
     * 
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified tags from a file system. If the
     * <code>DeleteTags</code> request includes a tag key that does not
     * exist, Amazon EFS ignores it; it is not an error. For more information
     * about tags and related restrictions, go to
     * <a href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"> Tag Restrictions </a>
     * in the <i>AWS Billing and Cost Management User Guide</i> .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DeleteTags</code> action.
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags service method on AmazonElasticFileSystem.
     * 
     * 
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteTags(DeleteTagsRequest deleteTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the description of a specific Amazon EFS file system if
     * either the file system <code>CreationToken</code> or the
     * <code>FileSystemId</code> is provided; otherwise, returns descriptions
     * of all file systems owned by the caller's AWS account in the AWS
     * region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally
     * specify the <code>MaxItems</code> parameter to limit the number of
     * descriptions in a response. If more file system descriptions remain,
     * Amazon EFS returns a <code>NextMarker</code> , an opaque token, in the
     * response. In this case, you should send a subsequent request with the
     * <code>Marker</code> request parameter set to the value of
     * <code>NextMarker</code> .
     * </p>
     * <p>
     * So to retrieve a list of your file system descriptions, the expected
     * usage of this API is an iterative process of first calling
     * <code>DescribeFileSystems</code> without the <code>Marker</code> and
     * then continuing to call it with the <code>Marker</code> parameter set
     * to the value of the <code>NextMarker</code> from the previous response
     * until the response has no <code>NextMarker</code> .
     * </p>
     * <p>
     * Note that the implementation may return fewer than
     * <code>MaxItems</code> file system descriptions while still including a
     * <code>NextMarker</code> value.
     * </p>
     * <p>
     * The order of file systems returned in the response of one
     * <code>DescribeFileSystems</code> call, and the order of file systems
     * returned across the responses of a multi-call iteration, is
     * unspecified.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DescribeFileSystems</code> action.
     * </p>
     * 
     * @return The response from the DescribeFileSystems service method, as
     *         returned by AmazonElasticFileSystem.
     * 
     * @throws BadRequestException
     * @throws FileSystemNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticFileSystem indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeFileSystemsResult describeFileSystems() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        