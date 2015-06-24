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

import com.amazonaws.services.elasticfilesystem.model.*;

/**
 * Interface for accessing EFS asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Elastic File System</fullname>
 */
public interface AmazonElasticFileSystemAsync extends AmazonElasticFileSystem {

    /**
     * <p>
     * Creates a new, empty file system. The operation requires a creation token
     * in the request that Amazon EFS uses to ensure idempotent creation
     * (calling the operation with same creation token has no effect). If a file
     * system does not currently exist that is owned by the caller's AWS account
     * with the specified creation token, this operation does the following:
     * </p>
     * <ul>
     * <li>Creates a new, empty file system. The file system will have an Amazon
     * EFS assigned ID, and an initial lifecycle state "creating".</li>
     * <li>Returns with the description of the created file system.</li>
     * </ul>
     * <p>
     * Otherwise, this operation returns a <code>FileSystemAlreadyExists</code>
     * error with the ID of the existing file system.
     * </p>
     * <note>For basic use cases, you can use a randomly generated UUID for the
     * creation token.</note>
     * <p>
     * The idempotent operation allows you to retry a
     * <code>CreateFileSystem</code> call without risk of creating an extra file
     * system. This can happen when an initial call fails in a way that leaves
     * it uncertain whether or not a file system was actually created. An
     * example might be that a transport level timeout occurred or your
     * connection was reset. As long as you use the same creation token, if the
     * initial call had succeeded in creating a file system, the client can
     * learn of its existence from the <code>FileSystemAlreadyExists</code>
     * error.
     * </p>
     * <note>The <code>CreateFileSystem</code> call returns while the file
     * system's lifecycle state is still "creating". You can check the file
     * system creation status by calling the <a>DescribeFileSystems</a> API,
     * which among other things returns the file system state.</note>
     * <p>
     * After the file system is fully created, Amazon EFS sets its lifecycle
     * state to "available", at which point you can create one or more mount
     * targets for the file system (<a>CreateMountTarget</a>) in your VPC. You
     * mount your Amazon EFS file system on an EC2 instances in your VPC via the
     * mount target. For more information, see <a
     * href="http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon
     * EFS: How it Works</a>
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:CreateFileSystem</code> action.
     * </p>
     * 
     * @param createFileSystemRequest
     *        null
     * @return A Java Future containing the result of the CreateFileSystem
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(
            CreateFileSystemRequest createFileSystemRequest);

    /**
     * <p>
     * Creates a new, empty file system. The operation requires a creation token
     * in the request that Amazon EFS uses to ensure idempotent creation
     * (calling the operation with same creation token has no effect). If a file
     * system does not currently exist that is owned by the caller's AWS account
     * with the specified creation token, this operation does the following:
     * </p>
     * <ul>
     * <li>Creates a new, empty file system. The file system will have an Amazon
     * EFS assigned ID, and an initial lifecycle state "creating".</li>
     * <li>Returns with the description of the created file system.</li>
     * </ul>
     * <p>
     * Otherwise, this operation returns a <code>FileSystemAlreadyExists</code>
     * error with the ID of the existing file system.
     * </p>
     * <note>For basic use cases, you can use a randomly generated UUID for the
     * creation token.</note>
     * <p>
     * The idempotent operation allows you to retry a
     * <code>CreateFileSystem</code> call without risk of creating an extra file
     * system. This can happen when an initial call fails in a way that leaves
     * it uncertain whether or not a file system was actually created. An
     * example might be that a transport level timeout occurred or your
     * connection was reset. As long as you use the same creation token, if the
     * initial call had succeeded in creating a file system, the client can
     * learn of its existence from the <code>FileSystemAlreadyExists</code>
     * error.
     * </p>
     * <note>The <code>CreateFileSystem</code> call returns while the file
     * system's lifecycle state is still "creating". You can check the file
     * system creation status by calling the <a>DescribeFileSystems</a> API,
     * which among other things returns the file system state.</note>
     * <p>
     * After the file system is fully created, Amazon EFS sets its lifecycle
     * state to "available", at which point you can create one or more mount
     * targets for the file system (<a>CreateMountTarget</a>) in your VPC. You
     * mount your Amazon EFS file system on an EC2 instances in your VPC via the
     * mount target. For more information, see <a
     * href="http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon
     * EFS: How it Works</a>
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:CreateFileSystem</code> action.
     * </p>
     * 
     * @param createFileSystemRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFileSystem
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(
            CreateFileSystemRequest createFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler);

    /**
     * <p>
     * Creates a mount target for a file system. You can then mount the file
     * system on EC2 instances via the mount target.
     * </p>
     * <p>
     * You can create one mount target in each Availability Zone in your VPC.
     * All EC2 instances in a VPC within a given Availability Zone share a
     * single mount target for a given file system. If you have multiple subnets
     * in an Availability Zone, you create a mount target in one of the subnets.
     * EC2 instances do not need to be in the same subnet as the mount target in
     * order to access their file system. For more information, see <a
     * href="http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon
     * EFS: How it Works</a>.
     * </p>
     * <p>
     * In the request, you also specify a file system ID for which you are
     * creating the mount target and the file system's lifecycle state must be
     * "available" (see <a>DescribeFileSystems</a>).
     * </p>
     * <p>
     * In the request, you also provide a subnet ID, which serves several
     * purposes:
     * </p>
     * <ul>
     * <li>It determines the VPC in which Amazon EFS creates the mount target.</li>
     * <li>It determines the Availability Zone in which Amazon EFS creates the
     * mount target.</li>
     * <li>It determines the IP address range from which Amazon EFS selects the
     * IP address of the mount target if you don't specify an IP address in the
     * request.</li>
     * </ul>
     * <p>
     * After creating the mount target, Amazon EFS returns a response that
     * includes, a <code>MountTargetId</code> and an <code>IpAddress</code>. You
     * use this IP address when mounting the file system in an EC2 instance. You
     * can also use the mount target's DNS name when mounting the file system.
     * The EC2 instance on which you mount the file system via the mount target
     * can resolve the mount target's DNS name to its IP address. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation"
     * >How it Works: Implementation Overview</a>
     * </p>
     * <p>
     * Note that you can create mount targets for a file system in only one VPC,
     * and there can be only one mount target per Availability Zone. That is, if
     * the file system already has one or more mount targets created for it, the
     * request to add another mount target must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The subnet specified in the request must belong to the same VPC as the
     * subnets of the existing mount targets.
     * </p>
     * </li>
     * <li>The subnet specified in the request must not be in the same
     * Availability Zone as any of the subnets of the existing mount targets.</li>
     * </ul>
     * <p>
     * If the request satisfies the requirements, Amazon EFS does the following:
     * </p>
     * <ul>
     * <li>Creates a new mount target in the specified subnet.</li>
     * <li>Also creates a new network interface in the subnet as follows:
     * <ul>
     * <li>If the request provides an <code>IpAddress</code>, Amazon EFS assigns
     * that IP address to the network interface. Otherwise, Amazon EFS assigns a
     * free address in the subnet (in the same way that the Amazon EC2
     * <code>CreateNetworkInterface</code> call does when a request does not
     * specify a primary private IP address).</li>
     * <li>If the request provides <code>SecurityGroups</code>, this network
     * interface is associated with those security groups. Otherwise, it belongs
     * to the default security group for the subnet's VPC.</li>
     * <li>Assigns the description
     * <code>"Mount target <i>fsmt-id</i> for file system <i>fs-id</i>"</code>
     * where <code><i>fsmt-id</i></code> is the mount target ID, and
     * <code><i>fs-id</i></code> is the <code>FileSystemId</code>.</li>
     * <li>Sets the <code>requesterManaged</code> property of the network
     * interface to "true", and the <code>requesterId</code> value to "EFS".</li>
     * </ul>
     * <p>
     * Each Amazon EFS mount target has one corresponding requestor-managed EC2
     * network interface. After the network interface is created, Amazon EFS
     * sets the <code>NetworkInterfaceId</code> field in the mount target's
     * description to the network interface ID, and the <code>IpAddress</code>
     * field to its address. If network interface creation fails, the entire
     * <code>CreateMountTarget</code> operation fails.
     * </p>
     * </li>
     * </ul>
     * <note>The <code>CreateMountTarget</code> call returns only after creating
     * the network interface, but while the mount target state is still
     * "creating". You can check the mount target creation status by calling the
     * <a>DescribeFileSystems</a> API, which among other things returns the
     * mount target state.</note>
     * <p>
     * We recommend you create a mount target in each of the Availability Zones.
     * There are cost considerations for using a file system in an Availability
     * Zone through a mount target created in another Availability Zone. For
     * more information, go to <a href="http://aws.amazon.com/efs/">Amazon
     * EFS</a> product detail page. In addition, by always using a mount target
     * local to the instance's Availability Zone, you eliminate a partial
     * failure scenario; if the Availablity Zone in which your mount target is
     * created goes down, then you won't be able to access your file system
     * through that mount target.
     * </p>
     * <p>
     * This operation requires permission for the following action on the file
     * system:
     * </p>
     * <ul>
     * <li><code>elasticfilesystem:CreateMountTarget</code></li>
     * </ul>
     * <p>
     * This operation also requires permission for the following Amazon EC2
     * actions:
     * </p>
     * <ul>
     * <li><code>ec2:DescribeSubnets</code></li>
     * <li><code>ec2:DescribeNetworkInterfaces</code></li>
     * <li><code>ec2:CreateNetworkInterface</code></li>
     * </ul>
     * 
     * @param createMountTargetRequest
     *        null
     * @return A Java Future containing the result of the CreateMountTarget
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(
            CreateMountTargetRequest createMountTargetRequest);

    /**
     * <p>
     * Creates a mount target for a file system. You can then mount the file
     * system on EC2 instances via the mount target.
     * </p>
     * <p>
     * You can create one mount target in each Availability Zone in your VPC.
     * All EC2 instances in a VPC within a given Availability Zone share a
     * single mount target for a given file system. If you have multiple subnets
     * in an Availability Zone, you create a mount target in one of the subnets.
     * EC2 instances do not need to be in the same subnet as the mount target in
     * order to access their file system. For more information, see <a
     * href="http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon
     * EFS: How it Works</a>.
     * </p>
     * <p>
     * In the request, you also specify a file system ID for which you are
     * creating the mount target and the file system's lifecycle state must be
     * "available" (see <a>DescribeFileSystems</a>).
     * </p>
     * <p>
     * In the request, you also provide a subnet ID, which serves several
     * purposes:
     * </p>
     * <ul>
     * <li>It determines the VPC in which Amazon EFS creates the mount target.</li>
     * <li>It determines the Availability Zone in which Amazon EFS creates the
     * mount target.</li>
     * <li>It determines the IP address range from which Amazon EFS selects the
     * IP address of the mount target if you don't specify an IP address in the
     * request.</li>
     * </ul>
     * <p>
     * After creating the mount target, Amazon EFS returns a response that
     * includes, a <code>MountTargetId</code> and an <code>IpAddress</code>. You
     * use this IP address when mounting the file system in an EC2 instance. You
     * can also use the mount target's DNS name when mounting the file system.
     * The EC2 instance on which you mount the file system via the mount target
     * can resolve the mount target's DNS name to its IP address. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation"
     * >How it Works: Implementation Overview</a>
     * </p>
     * <p>
     * Note that you can create mount targets for a file system in only one VPC,
     * and there can be only one mount target per Availability Zone. That is, if
     * the file system already has one or more mount targets created for it, the
     * request to add another mount target must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The subnet specified in the request must belong to the same VPC as the
     * subnets of the existing mount targets.
     * </p>
     * </li>
     * <li>The subnet specified in the request must not be in the same
     * Availability Zone as any of the subnets of the existing mount targets.</li>
     * </ul>
     * <p>
     * If the request satisfies the requirements, Amazon EFS does the following:
     * </p>
     * <ul>
     * <li>Creates a new mount target in the specified subnet.</li>
     * <li>Also creates a new network interface in the subnet as follows:
     * <ul>
     * <li>If the request provides an <code>IpAddress</code>, Amazon EFS assigns
     * that IP address to the network interface. Otherwise, Amazon EFS assigns a
     * free address in the subnet (in the same way that the Amazon EC2
     * <code>CreateNetworkInterface</code> call does when a request does not
     * specify a primary private IP address).</li>
     * <li>If the request provides <code>SecurityGroups</code>, this network
     * interface is associated with those security groups. Otherwise, it belongs
     * to the default security group for the subnet's VPC.</li>
     * <li>Assigns the description
     * <code>"Mount target <i>fsmt-id</i> for file system <i>fs-id</i>"</code>
     * where <code><i>fsmt-id</i></code> is the mount target ID, and
     * <code><i>fs-id</i></code> is the <code>FileSystemId</code>.</li>
     * <li>Sets the <code>requesterManaged</code> property of the network
     * interface to "true", and the <code>requesterId</code> value to "EFS".</li>
     * </ul>
     * <p>
     * Each Amazon EFS mount target has one corresponding requestor-managed EC2
     * network interface. After the network interface is created, Amazon EFS
     * sets the <code>NetworkInterfaceId</code> field in the mount target's
     * description to the network interface ID, and the <code>IpAddress</code>
     * field to its address. If network interface creation fails, the entire
     * <code>CreateMountTarget</code> operation fails.
     * </p>
     * </li>
     * </ul>
     * <note>The <code>CreateMountTarget</code> call returns only after creating
     * the network interface, but while the mount target state is still
     * "creating". You can check the mount target creation status by calling the
     * <a>DescribeFileSystems</a> API, which among other things returns the
     * mount target state.</note>
     * <p>
     * We recommend you create a mount target in each of the Availability Zones.
     * There are cost considerations for using a file system in an Availability
     * Zone through a mount target created in another Availability Zone. For
     * more information, go to <a href="http://aws.amazon.com/efs/">Amazon
     * EFS</a> product detail page. In addition, by always using a mount target
     * local to the instance's Availability Zone, you eliminate a partial
     * failure scenario; if the Availablity Zone in which your mount target is
     * created goes down, then you won't be able to access your file system
     * through that mount target.
     * </p>
     * <p>
     * This operation requires permission for the following action on the file
     * system:
     * </p>
     * <ul>
     * <li><code>elasticfilesystem:CreateMountTarget</code></li>
     * </ul>
     * <p>
     * This operation also requires permission for the following Amazon EC2
     * actions:
     * </p>
     * <ul>
     * <li><code>ec2:DescribeSubnets</code></li>
     * <li><code>ec2:DescribeNetworkInterfaces</code></li>
     * <li><code>ec2:CreateNetworkInterface</code></li>
     * </ul>
     * 
     * @param createMountTargetRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMountTarget
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(
            CreateMountTargetRequest createMountTargetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMountTargetRequest, CreateMountTargetResult> asyncHandler);

    /**
     * <p>
     * Creates or overwrites tags associated with a file system. Each tag is a
     * key-value pair. If a tag key specified in the request already exists on
     * the file system, this operation overwrites its value with the value
     * provided in the request. If you add the "Name" tag to your file system,
     * Amazon EFS returns it in the response to the <a>DescribeFileSystems</a>
     * API.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:CreateTags</code> action.
     * </p>
     * 
     * @param createTagsRequest
     *        null
     */
    java.util.concurrent.Future<Void> createTagsAsync(
            CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates or overwrites tags associated with a file system. Each tag is a
     * key-value pair. If a tag key specified in the request already exists on
     * the file system, this operation overwrites its value with the value
     * provided in the request. If you add the "Name" tag to your file system,
     * Amazon EFS returns it in the response to the <a>DescribeFileSystems</a>
     * API.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:CreateTags</code> action.
     * </p>
     * 
     * @param createTagsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> createTagsAsync(
            CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a file system, permanently severing access to its contents. Upon
     * return, the file system no longer exists and you will not be able to
     * access any contents of the deleted file system.
     * </p>
     * <p>
     * You cannot delete a file system that is in use. That is, if the file
     * system has any mount targets, you must first delete them. For more
     * information, see <a>DescribeMountTargets</a> and
     * <a>DeleteMountTarget</a>.
     * </p>
     * <note>The <code>DeleteFileSystem</code> call returns while the file
     * system state is still "deleting". You can check the file system deletion
     * status by calling the <a>DescribeFileSystems</a> API, which returns a
     * list of file systems in your account. If you pass file system ID or
     * creation token for the deleted file system, the
     * <a>DescribeFileSystems</a> will return a 404 "FileSystemNotFound"
     * error.</note>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DeleteFileSystem</code> action.
     * </p>
     * 
     * @param deleteFileSystemRequest
     *        null
     */
    java.util.concurrent.Future<Void> deleteFileSystemAsync(
            DeleteFileSystemRequest deleteFileSystemRequest);

    /**
     * <p>
     * Deletes a file system, permanently severing access to its contents. Upon
     * return, the file system no longer exists and you will not be able to
     * access any contents of the deleted file system.
     * </p>
     * <p>
     * You cannot delete a file system that is in use. That is, if the file
     * system has any mount targets, you must first delete them. For more
     * information, see <a>DescribeMountTargets</a> and
     * <a>DeleteMountTarget</a>.
     * </p>
     * <note>The <code>DeleteFileSystem</code> call returns while the file
     * system state is still "deleting". You can check the file system deletion
     * status by calling the <a>DescribeFileSystems</a> API, which returns a
     * list of file systems in your account. If you pass file system ID or
     * creation token for the deleted file system, the
     * <a>DescribeFileSystems</a> will return a 404 "FileSystemNotFound"
     * error.</note>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DeleteFileSystem</code> action.
     * </p>
     * 
     * @param deleteFileSystemRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> deleteFileSystemAsync(
            DeleteFileSystemRequest deleteFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified mount target.
     * </p>
     * <p>
     * This operation forcibly breaks any mounts of the file system via the
     * mount target being deleted, which might disrupt instances or applications
     * using those mounts. To avoid applications getting cut off abruptly, you
     * might consider unmounting any mounts of the mount target, if feasible.
     * The operation also deletes the associated network interface. Uncommitted
     * writes may be lost, but breaking a mount target using this operation does
     * not corrupt the file system itself. The file system you created remains.
     * You can mount an EC2 instance in your VPC using another mount target.
     * </p>
     * <p>
     * This operation requires permission for the following action on the file
     * system:
     * </p>
     * <ul>
     * <li><code>elasticfilesystem:DeleteMountTarget</code></li>
     * </ul>
     * <note>The <code>DeleteMountTarget</code> call returns while the mount
     * target state is still "deleting". You can check the mount target deletion
     * by calling the <a>DescribeMountTargets</a> API, which returns a list of
     * mount target descriptions for the given file system. </note>
     * <p>
     * The operation also requires permission for the following Amazon EC2
     * action on the mount target's network interface:
     * </p>
     * <ul>
     * <li><code>ec2:DeleteNetworkInterface</code></li>
     * </ul>
     * 
     * @param deleteMountTargetRequest
     *        null
     */
    java.util.concurrent.Future<Void> deleteMountTargetAsync(
            DeleteMountTargetRequest deleteMountTargetRequest);

    /**
     * <p>
     * Deletes the specified mount target.
     * </p>
     * <p>
     * This operation forcibly breaks any mounts of the file system via the
     * mount target being deleted, which might disrupt instances or applications
     * using those mounts. To avoid applications getting cut off abruptly, you
     * might consider unmounting any mounts of the mount target, if feasible.
     * The operation also deletes the associated network interface. Uncommitted
     * writes may be lost, but breaking a mount target using this operation does
     * not corrupt the file system itself. The file system you created remains.
     * You can mount an EC2 instance in your VPC using another mount target.
     * </p>
     * <p>
     * This operation requires permission for the following action on the file
     * system:
     * </p>
     * <ul>
     * <li><code>elasticfilesystem:DeleteMountTarget</code></li>
     * </ul>
     * <note>The <code>DeleteMountTarget</code> call returns while the mount
     * target state is still "deleting". You can check the mount target deletion
     * by calling the <a>DescribeMountTargets</a> API, which returns a list of
     * mount target descriptions for the given file system. </note>
     * <p>
     * The operation also requires permission for the following Amazon EC2
     * action on the mount target's network interface:
     * </p>
     * <ul>
     * <li><code>ec2:DeleteNetworkInterface</code></li>
     * </ul>
     * 
     * @param deleteMountTargetRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> deleteMountTargetAsync(
            DeleteMountTargetRequest deleteMountTargetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMountTargetRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified tags from a file system. If the
     * <code>DeleteTags</code> request includes a tag key that does not exist,
     * Amazon EFS ignores it; it is not an error. For more information about
     * tags and related restrictions, go to <a href=
     * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
     * >Tag Restrictions</a> in the <i>AWS Billing and Cost Management User
     * Guide</i>.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DeleteTags</code> action.
     * </p>
     * 
     * @param deleteTagsRequest
     *        null
     */
    java.util.concurrent.Future<Void> deleteTagsAsync(
            DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified tags from a file system. If the
     * <code>DeleteTags</code> request includes a tag key that does not exist,
     * Amazon EFS ignores it; it is not an error. For more information about
     * tags and related restrictions, go to <a href=
     * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
     * >Tag Restrictions</a> in the <i>AWS Billing and Cost Management User
     * Guide</i>.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DeleteTags</code> action.
     * </p>
     * 
     * @param deleteTagsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> deleteTagsAsync(
            DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, Void> asyncHandler);

    /**
     * <p>
     * Returns the description of a specific Amazon EFS file system if either
     * the file system <code>CreationToken</code> or the
     * <code>FileSystemId</code> is provided; otherwise, returns descriptions of
     * all file systems owned by the caller's AWS account in the AWS region of
     * the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify
     * the <code>MaxItems</code> parameter to limit the number of descriptions
     * in a response. If more file system descriptions remain, Amazon EFS
     * returns a <code>NextMarker</code>, an opaque token, in the response. In
     * this case, you should send a subsequent request with the
     * <code>Marker</code> request parameter set to the value of
     * <code>NextMarker</code>.
     * </p>
     * <p>
     * So to retrieve a list of your file system descriptions, the expected
     * usage of this API is an iterative process of first calling
     * <code>DescribeFileSystems</code> without the <code>Marker</code> and then
     * continuing to call it with the <code>Marker</code> parameter set to the
     * value of the <code>NextMarker</code> from the previous response until the
     * response has no <code>NextMarker</code>.
     * </p>
     * <p>
     * Note that the implementation may return fewer than <code>MaxItems</code>
     * file system descriptions while still including a <code>NextMarker</code>
     * value.
     * </p>
     * <p>
     * The order of file systems returned in the response of one
     * <code>DescribeFileSystems</code> call, and the order of file systems
     * returned across the responses of a multi-call iteration, is unspecified.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DescribeFileSystems</code> action.
     * </p>
     * 
     * @param describeFileSystemsRequest
     *        null
     * @return A Java Future containing the result of the DescribeFileSystems
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            DescribeFileSystemsRequest describeFileSystemsRequest);

    /**
     * <p>
     * Returns the description of a specific Amazon EFS file system if either
     * the file system <code>CreationToken</code> or the
     * <code>FileSystemId</code> is provided; otherwise, returns descriptions of
     * all file systems owned by the caller's AWS account in the AWS region of
     * the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify
     * the <code>MaxItems</code> parameter to limit the number of descriptions
     * in a response. If more file system descriptions remain, Amazon EFS
     * returns a <code>NextMarker</code>, an opaque token, in the response. In
     * this case, you should send a subsequent request with the
     * <code>Marker</code> request parameter set to the value of
     * <code>NextMarker</code>.
     * </p>
     * <p>
     * So to retrieve a list of your file system descriptions, the expected
     * usage of this API is an iterative process of first calling
     * <code>DescribeFileSystems</code> without the <code>Marker</code> and then
     * continuing to call it with the <code>Marker</code> parameter set to the
     * value of the <code>NextMarker</code> from the previous response until the
     * response has no <code>NextMarker</code>.
     * </p>
     * <p>
     * Note that the implementation may return fewer than <code>MaxItems</code>
     * file system descriptions while still including a <code>NextMarker</code>
     * value.
     * </p>
     * <p>
     * The order of file systems returned in the response of one
     * <code>DescribeFileSystems</code> call, and the order of file systems
     * returned across the responses of a multi-call iteration, is unspecified.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DescribeFileSystems</code> action.
     * </p>
     * 
     * @param describeFileSystemsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFileSystems
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            DescribeFileSystemsRequest describeFileSystemsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeFileSystems operation.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest)
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync();

    /**
     * Simplified method form for invoking the DescribeFileSystems operation
     * with an AsyncHandler.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler);

    /**
     * <p>
     * Returns the security groups currently in effect for a mount target. This
     * operation requires that the network interface of the mount target has
     * been created and the life cycle state of the mount target is not
     * "deleted".
     * </p>
     * <p>
     * This operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li> <code>elasticfilesystem:DescribeMountTargetSecurityGroups</code>
     * action on the mount target's file system.</li>
     * <li> <code>ec2:DescribeNetworkInterfaceAttribute</code> action on the
     * mount target's network interface.</li>
     * </ul>
     * 
     * @param describeMountTargetSecurityGroupsRequest
     *        null
     * @return A Java Future containing the result of the
     *         DescribeMountTargetSecurityGroups operation returned by the
     *         service.
     */
    java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            DescribeMountTargetSecurityGroupsRequest describeMountTargetSecurityGroupsRequest);

    /**
     * <p>
     * Returns the security groups currently in effect for a mount target. This
     * operation requires that the network interface of the mount target has
     * been created and the life cycle state of the mount target is not
     * "deleted".
     * </p>
     * <p>
     * This operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li> <code>elasticfilesystem:DescribeMountTargetSecurityGroups</code>
     * action on the mount target's file system.</li>
     * <li> <code>ec2:DescribeNetworkInterfaceAttribute</code> action on the
     * mount target's network interface.</li>
     * </ul>
     * 
     * @param describeMountTargetSecurityGroupsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeMountTargetSecurityGroups operation returned by the
     *         service.
     */
    java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            DescribeMountTargetSecurityGroupsRequest describeMountTargetSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMountTargetSecurityGroupsRequest, DescribeMountTargetSecurityGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the descriptions of the current mount targets for a file system.
     * The order of mount targets returned in the response is unspecified.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DescribeMountTargets</code> action on the file
     * system <code>FileSystemId</code>.
     * </p>
     * 
     * @param describeMountTargetsRequest
     *        null
     * @return A Java Future containing the result of the DescribeMountTargets
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(
            DescribeMountTargetsRequest describeMountTargetsRequest);

    /**
     * <p>
     * Returns the descriptions of the current mount targets for a file system.
     * The order of mount targets returned in the response is unspecified.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DescribeMountTargets</code> action on the file
     * system <code>FileSystemId</code>.
     * </p>
     * 
     * @param describeMountTargetsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMountTargets
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(
            DescribeMountTargetsRequest describeMountTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMountTargetsRequest, DescribeMountTargetsResult> asyncHandler);

    /**
     * <p>
     * Returns the tags associated with a file system. The order of tags
     * returned in the response of one <code>DescribeTags</code> call, and the
     * order of tags returned across the responses of a multi-call iteration
     * (when using pagination), is unspecified.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DescribeTags</code> action.
     * </p>
     * 
     * @param describeTagsRequest
     *        null
     * @return A Java Future containing the result of the DescribeTags operation
     *         returned by the service.
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Returns the tags associated with a file system. The order of tags
     * returned in the response of one <code>DescribeTags</code> call, and the
     * order of tags returned across the responses of a multi-call iteration
     * (when using pagination), is unspecified.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>elasticfilesystem:DescribeTags</code> action.
     * </p>
     * 
     * @param describeTagsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation
     *         returned by the service.
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Modifies the set of security groups in effect for a mount target.
     * </p>
     * <p>
     * When you create a mount target, Amazon EFS also creates a new network
     * interface (see <a>CreateMountTarget</a>). This operation replaces the
     * security groups in effect for the network interface associated with a
     * mount target, with the <code>SecurityGroups</code> provided in the
     * request. This operation requires that the network interface of the mount
     * target has been created and the life cycle state of the mount target is
     * not "deleted".
     * </p>
     * <p>
     * The operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li> <code>elasticfilesystem:ModifyMountTargetSecurityGroups</code> action
     * on the mount target's file system.</li>
     * <li> <code>ec2:ModifyNetworkInterfaceAttribute</code> action on the mount
     * target's network interface.</li>
     * </ul>
     * 
     * @param modifyMountTargetSecurityGroupsRequest
     *        null
     */
    java.util.concurrent.Future<Void> modifyMountTargetSecurityGroupsAsync(
            ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest);

    /**
     * <p>
     * Modifies the set of security groups in effect for a mount target.
     * </p>
     * <p>
     * When you create a mount target, Amazon EFS also creates a new network
     * interface (see <a>CreateMountTarget</a>). This operation replaces the
     * security groups in effect for the network interface associated with a
     * mount target, with the <code>SecurityGroups</code> provided in the
     * request. This operation requires that the network interface of the mount
     * target has been created and the life cycle state of the mount target is
     * not "deleted".
     * </p>
     * <p>
     * The operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li> <code>elasticfilesystem:ModifyMountTargetSecurityGroups</code> action
     * on the mount target's file system.</li>
     * <li> <code>ec2:ModifyNetworkInterfaceAttribute</code> action on the mount
     * target's network interface.</li>
     * </ul>
     * 
     * @param modifyMountTargetSecurityGroupsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> modifyMountTargetSecurityGroupsAsync(
            ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyMountTargetSecurityGroupsRequest, Void> asyncHandler);
}
