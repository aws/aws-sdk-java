/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticfilesystem;

import javax.annotation.Generated;

import com.amazonaws.services.elasticfilesystem.model.*;

/**
 * Interface for accessing EFS asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticfilesystem.AbstractAmazonElasticFileSystemAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Elastic File System</fullname>
 * <p>
 * Amazon Elastic File System (Amazon EFS) provides simple, scalable file storage for use with Amazon EC2 Linux and Mac
 * instances in the Amazon Web Services Cloud. With Amazon EFS, storage capacity is elastic, growing and shrinking
 * automatically as you add and remove files, so that your applications have the storage they need, when they need it.
 * For more information, see the <a href="https://docs.aws.amazon.com/efs/latest/ug/api-reference.html">Amazon Elastic
 * File System API Reference</a> and the <a href="https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html">Amazon
 * Elastic File System User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElasticFileSystemAsync extends AmazonElasticFileSystem {

    /**
     * <p>
     * Creates an EFS access point. An access point is an application-specific view into an EFS file system that applies
     * an operating system user and group, and a file system path, to any file system request made through the access
     * point. The operating system user and group override any identity information provided by the NFS client. The file
     * system path is exposed as the access point's root directory. Applications using the access point can only access
     * data in the application's own directory and any subdirectories. To learn more, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html">Mounting a file system using EFS access
     * points</a>.
     * </p>
     * <note>
     * <p>
     * If multiple requests to create access points on the same file system are sent in quick succession, and the file
     * system is near the limit of 1,000 access points, you may experience a throttling response for these requests.
     * This is to ensure that the file system does not exceed the stated access point limit.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:CreateAccessPoint</code> action.
     * </p>
     * <p>
     * Access points can be tagged on creation. If tags are specified in the creation action, IAM performs additional
     * authorization on the <code>elasticfilesystem:TagResource</code> action to verify if users have permissions to
     * create tags. Therefore, you must grant explicit permissions to use the <code>elasticfilesystem:TagResource</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/using-tags-efs.html#supported-iam-actions-tagging.html">Granting
     * permissions to tag resources during creation</a>.
     * </p>
     * 
     * @param createAccessPointRequest
     * @return A Java Future containing the result of the CreateAccessPoint operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.CreateAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest createAccessPointRequest);

    /**
     * <p>
     * Creates an EFS access point. An access point is an application-specific view into an EFS file system that applies
     * an operating system user and group, and a file system path, to any file system request made through the access
     * point. The operating system user and group override any identity information provided by the NFS client. The file
     * system path is exposed as the access point's root directory. Applications using the access point can only access
     * data in the application's own directory and any subdirectories. To learn more, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html">Mounting a file system using EFS access
     * points</a>.
     * </p>
     * <note>
     * <p>
     * If multiple requests to create access points on the same file system are sent in quick succession, and the file
     * system is near the limit of 1,000 access points, you may experience a throttling response for these requests.
     * This is to ensure that the file system does not exceed the stated access point limit.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:CreateAccessPoint</code> action.
     * </p>
     * <p>
     * Access points can be tagged on creation. If tags are specified in the creation action, IAM performs additional
     * authorization on the <code>elasticfilesystem:TagResource</code> action to verify if users have permissions to
     * create tags. Therefore, you must grant explicit permissions to use the <code>elasticfilesystem:TagResource</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/using-tags-efs.html#supported-iam-actions-tagging.html">Granting
     * permissions to tag resources during creation</a>.
     * </p>
     * 
     * @param createAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessPoint operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.CreateAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest createAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessPointRequest, CreateAccessPointResult> asyncHandler);

    /**
     * <p>
     * Creates a new, empty file system. The operation requires a creation token in the request that Amazon EFS uses to
     * ensure idempotent creation (calling the operation with same creation token has no effect). If a file system does
     * not currently exist that is owned by the caller's Amazon Web Services account with the specified creation token,
     * this operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty file system. The file system will have an Amazon EFS assigned ID, and an initial lifecycle
     * state <code>creating</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns with the description of the created file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Otherwise, this operation returns a <code>FileSystemAlreadyExists</code> error with the ID of the existing file
     * system.
     * </p>
     * <note>
     * <p>
     * For basic use cases, you can use a randomly generated UUID for the creation token.
     * </p>
     * </note>
     * <p>
     * The idempotent operation allows you to retry a <code>CreateFileSystem</code> call without risk of creating an
     * extra file system. This can happen when an initial call fails in a way that leaves it uncertain whether or not a
     * file system was actually created. An example might be that a transport level timeout occurred or your connection
     * was reset. As long as you use the same creation token, if the initial call had succeeded in creating a file
     * system, the client can learn of its existence from the <code>FileSystemAlreadyExists</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/creating-using-create-fs.html#creating-using-create-fs-part1"
     * >Creating a file system</a> in the <i>Amazon EFS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's lifecycle state is still
     * <code>creating</code>. You can check the file system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which among other things returns the file system state.
     * </p>
     * </note>
     * <p>
     * This operation accepts an optional <code>PerformanceMode</code> parameter that you choose for your file system.
     * We recommend <code>generalPurpose</code> performance mode for all file systems. File systems using the
     * <code>maxIO</code> mode is a previous generation performance type that is designed for highly parallelized
     * workloads that can tolerate higher latencies than the General Purpose mode. Max I/O mode is not supported for One
     * Zone file systems or file systems that use Elastic throughput.
     * </p>
     * <important>
     * <p>
     * Due to the higher per-operation latencies with Max I/O, we recommend using General Purpose performance mode for
     * all file systems.
     * </p>
     * </important>
     * <p>
     * The performance mode can't be changed after the file system has been created. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/performance.html#performancemodes.html">Amazon EFS performance
     * modes</a>.
     * </p>
     * <p>
     * You can set the throughput mode for the file system using the <code>ThroughputMode</code> parameter.
     * </p>
     * <p>
     * After the file system is fully created, Amazon EFS sets its lifecycle state to <code>available</code>, at which
     * point you can create one or more mount targets for the file system in your VPC. For more information, see
     * <a>CreateMountTarget</a>. You mount your Amazon EFS file system on an EC2 instances in your VPC by using the
     * mount target. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon EFS: How it Works</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:CreateFileSystem</code> action.
     * </p>
     * <p>
     * File systems can be tagged on creation. If tags are specified in the creation action, IAM performs additional
     * authorization on the <code>elasticfilesystem:TagResource</code> action to verify if users have permissions to
     * create tags. Therefore, you must grant explicit permissions to use the <code>elasticfilesystem:TagResource</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/using-tags-efs.html#supported-iam-actions-tagging.html">Granting
     * permissions to tag resources during creation</a>.
     * </p>
     * 
     * @param createFileSystemRequest
     * @return A Java Future containing the result of the CreateFileSystem operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.CreateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateFileSystem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest createFileSystemRequest);

    /**
     * <p>
     * Creates a new, empty file system. The operation requires a creation token in the request that Amazon EFS uses to
     * ensure idempotent creation (calling the operation with same creation token has no effect). If a file system does
     * not currently exist that is owned by the caller's Amazon Web Services account with the specified creation token,
     * this operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty file system. The file system will have an Amazon EFS assigned ID, and an initial lifecycle
     * state <code>creating</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns with the description of the created file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Otherwise, this operation returns a <code>FileSystemAlreadyExists</code> error with the ID of the existing file
     * system.
     * </p>
     * <note>
     * <p>
     * For basic use cases, you can use a randomly generated UUID for the creation token.
     * </p>
     * </note>
     * <p>
     * The idempotent operation allows you to retry a <code>CreateFileSystem</code> call without risk of creating an
     * extra file system. This can happen when an initial call fails in a way that leaves it uncertain whether or not a
     * file system was actually created. An example might be that a transport level timeout occurred or your connection
     * was reset. As long as you use the same creation token, if the initial call had succeeded in creating a file
     * system, the client can learn of its existence from the <code>FileSystemAlreadyExists</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/creating-using-create-fs.html#creating-using-create-fs-part1"
     * >Creating a file system</a> in the <i>Amazon EFS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's lifecycle state is still
     * <code>creating</code>. You can check the file system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which among other things returns the file system state.
     * </p>
     * </note>
     * <p>
     * This operation accepts an optional <code>PerformanceMode</code> parameter that you choose for your file system.
     * We recommend <code>generalPurpose</code> performance mode for all file systems. File systems using the
     * <code>maxIO</code> mode is a previous generation performance type that is designed for highly parallelized
     * workloads that can tolerate higher latencies than the General Purpose mode. Max I/O mode is not supported for One
     * Zone file systems or file systems that use Elastic throughput.
     * </p>
     * <important>
     * <p>
     * Due to the higher per-operation latencies with Max I/O, we recommend using General Purpose performance mode for
     * all file systems.
     * </p>
     * </important>
     * <p>
     * The performance mode can't be changed after the file system has been created. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/performance.html#performancemodes.html">Amazon EFS performance
     * modes</a>.
     * </p>
     * <p>
     * You can set the throughput mode for the file system using the <code>ThroughputMode</code> parameter.
     * </p>
     * <p>
     * After the file system is fully created, Amazon EFS sets its lifecycle state to <code>available</code>, at which
     * point you can create one or more mount targets for the file system in your VPC. For more information, see
     * <a>CreateMountTarget</a>. You mount your Amazon EFS file system on an EC2 instances in your VPC by using the
     * mount target. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon EFS: How it Works</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:CreateFileSystem</code> action.
     * </p>
     * <p>
     * File systems can be tagged on creation. If tags are specified in the creation action, IAM performs additional
     * authorization on the <code>elasticfilesystem:TagResource</code> action to verify if users have permissions to
     * create tags. Therefore, you must grant explicit permissions to use the <code>elasticfilesystem:TagResource</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/using-tags-efs.html#supported-iam-actions-tagging.html">Granting
     * permissions to tag resources during creation</a>.
     * </p>
     * 
     * @param createFileSystemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFileSystem operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.CreateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateFileSystem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest createFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler);

    /**
     * <p>
     * Creates a mount target for a file system. You can then mount the file system on EC2 instances by using the mount
     * target.
     * </p>
     * <p>
     * You can create one mount target in each Availability Zone in your VPC. All EC2 instances in a VPC within a given
     * Availability Zone share a single mount target for a given file system. If you have multiple subnets in an
     * Availability Zone, you create a mount target in one of the subnets. EC2 instances do not need to be in the same
     * subnet as the mount target in order to access their file system.
     * </p>
     * <p>
     * You can create only one mount target for a One Zone file system. You must create that mount target in the same
     * Availability Zone in which the file system is located. Use the <code>AvailabilityZoneName</code> and
     * <code>AvailabiltyZoneId</code> properties in the <a>DescribeFileSystems</a> response object to get this
     * information. Use the <code>subnetId</code> associated with the file system's Availability Zone when creating the
     * mount target.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon EFS: How
     * it Works</a>.
     * </p>
     * <p>
     * To create a mount target for a file system, the file system's lifecycle state must be <code>available</code>. For
     * more information, see <a>DescribeFileSystems</a>.
     * </p>
     * <p>
     * In the request, provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The file system ID for which you are creating the mount target.
     * </p>
     * </li>
     * <li>
     * <p>
     * A subnet ID, which determines the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The VPC in which Amazon EFS creates the mount target
     * </p>
     * </li>
     * <li>
     * <p>
     * The Availability Zone in which Amazon EFS creates the mount target
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address range from which Amazon EFS selects the IP address of the mount target (if you don't specify an IP
     * address in the request)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * After creating the mount target, Amazon EFS returns a response that includes, a <code>MountTargetId</code> and an
     * <code>IpAddress</code>. You use this IP address when mounting the file system in an EC2 instance. You can also
     * use the mount target's DNS name when mounting the file system. The EC2 instance on which you mount the file
     * system by using the mount target can resolve the mount target's DNS name to its IP address. For more information,
     * see <a href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation">How it
     * Works: Implementation Overview</a>.
     * </p>
     * <p>
     * Note that you can create mount targets for a file system in only one VPC, and there can be only one mount target
     * per Availability Zone. That is, if the file system already has one or more mount targets created for it, the
     * subnet specified in the request to add another mount target must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must belong to the same VPC as the subnets of the existing mount targets
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be in the same Availability Zone as any of the subnets of the existing mount targets
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the request satisfies the requirements, Amazon EFS does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new mount target in the specified subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * Also creates a new network interface in the subnet as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the request provides an <code>IpAddress</code>, Amazon EFS assigns that IP address to the network interface.
     * Otherwise, Amazon EFS assigns a free address in the subnet (in the same way that the Amazon EC2
     * <code>CreateNetworkInterface</code> call does when a request does not specify a primary private IP address).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request provides <code>SecurityGroups</code>, this network interface is associated with those security
     * groups. Otherwise, it belongs to the default security group for the subnet's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Assigns the description <code>Mount target <i>fsmt-id</i> for file system <i>fs-id</i> </code> where
     * <code> <i>fsmt-id</i> </code> is the mount target ID, and <code> <i>fs-id</i> </code> is the
     * <code>FileSystemId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the <code>requesterManaged</code> property of the network interface to <code>true</code>, and the
     * <code>requesterId</code> value to <code>EFS</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each Amazon EFS mount target has one corresponding requester-managed EC2 network interface. After the network
     * interface is created, Amazon EFS sets the <code>NetworkInterfaceId</code> field in the mount target's description
     * to the network interface ID, and the <code>IpAddress</code> field to its address. If network interface creation
     * fails, the entire <code>CreateMountTarget</code> operation fails.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>CreateMountTarget</code> call returns only after creating the network interface, but while the mount
     * target state is still <code>creating</code>, you can check the mount target creation status by calling the
     * <a>DescribeMountTargets</a> operation, which among other things returns the mount target state.
     * </p>
     * </note>
     * <p>
     * We recommend that you create a mount target in each of the Availability Zones. There are cost considerations for
     * using a file system in an Availability Zone through a mount target created in another Availability Zone. For more
     * information, see <a href="http://aws.amazon.com/efs/">Amazon EFS</a>. In addition, by always using a mount target
     * local to the instance's Availability Zone, you eliminate a partial failure scenario. If the Availability Zone in
     * which your mount target is created goes down, then you can't access your file system through that mount target.
     * </p>
     * <p>
     * This operation requires permissions for the following action on the file system:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:CreateMountTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation also requires permissions for the following Amazon EC2 actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DescribeSubnets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaces</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMountTargetRequest
     * @return A Java Future containing the result of the CreateMountTarget operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.CreateMountTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateMountTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(CreateMountTargetRequest createMountTargetRequest);

    /**
     * <p>
     * Creates a mount target for a file system. You can then mount the file system on EC2 instances by using the mount
     * target.
     * </p>
     * <p>
     * You can create one mount target in each Availability Zone in your VPC. All EC2 instances in a VPC within a given
     * Availability Zone share a single mount target for a given file system. If you have multiple subnets in an
     * Availability Zone, you create a mount target in one of the subnets. EC2 instances do not need to be in the same
     * subnet as the mount target in order to access their file system.
     * </p>
     * <p>
     * You can create only one mount target for a One Zone file system. You must create that mount target in the same
     * Availability Zone in which the file system is located. Use the <code>AvailabilityZoneName</code> and
     * <code>AvailabiltyZoneId</code> properties in the <a>DescribeFileSystems</a> response object to get this
     * information. Use the <code>subnetId</code> associated with the file system's Availability Zone when creating the
     * mount target.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon EFS: How
     * it Works</a>.
     * </p>
     * <p>
     * To create a mount target for a file system, the file system's lifecycle state must be <code>available</code>. For
     * more information, see <a>DescribeFileSystems</a>.
     * </p>
     * <p>
     * In the request, provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The file system ID for which you are creating the mount target.
     * </p>
     * </li>
     * <li>
     * <p>
     * A subnet ID, which determines the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The VPC in which Amazon EFS creates the mount target
     * </p>
     * </li>
     * <li>
     * <p>
     * The Availability Zone in which Amazon EFS creates the mount target
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address range from which Amazon EFS selects the IP address of the mount target (if you don't specify an IP
     * address in the request)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * After creating the mount target, Amazon EFS returns a response that includes, a <code>MountTargetId</code> and an
     * <code>IpAddress</code>. You use this IP address when mounting the file system in an EC2 instance. You can also
     * use the mount target's DNS name when mounting the file system. The EC2 instance on which you mount the file
     * system by using the mount target can resolve the mount target's DNS name to its IP address. For more information,
     * see <a href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation">How it
     * Works: Implementation Overview</a>.
     * </p>
     * <p>
     * Note that you can create mount targets for a file system in only one VPC, and there can be only one mount target
     * per Availability Zone. That is, if the file system already has one or more mount targets created for it, the
     * subnet specified in the request to add another mount target must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must belong to the same VPC as the subnets of the existing mount targets
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be in the same Availability Zone as any of the subnets of the existing mount targets
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the request satisfies the requirements, Amazon EFS does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new mount target in the specified subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * Also creates a new network interface in the subnet as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the request provides an <code>IpAddress</code>, Amazon EFS assigns that IP address to the network interface.
     * Otherwise, Amazon EFS assigns a free address in the subnet (in the same way that the Amazon EC2
     * <code>CreateNetworkInterface</code> call does when a request does not specify a primary private IP address).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request provides <code>SecurityGroups</code>, this network interface is associated with those security
     * groups. Otherwise, it belongs to the default security group for the subnet's VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Assigns the description <code>Mount target <i>fsmt-id</i> for file system <i>fs-id</i> </code> where
     * <code> <i>fsmt-id</i> </code> is the mount target ID, and <code> <i>fs-id</i> </code> is the
     * <code>FileSystemId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the <code>requesterManaged</code> property of the network interface to <code>true</code>, and the
     * <code>requesterId</code> value to <code>EFS</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each Amazon EFS mount target has one corresponding requester-managed EC2 network interface. After the network
     * interface is created, Amazon EFS sets the <code>NetworkInterfaceId</code> field in the mount target's description
     * to the network interface ID, and the <code>IpAddress</code> field to its address. If network interface creation
     * fails, the entire <code>CreateMountTarget</code> operation fails.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>CreateMountTarget</code> call returns only after creating the network interface, but while the mount
     * target state is still <code>creating</code>, you can check the mount target creation status by calling the
     * <a>DescribeMountTargets</a> operation, which among other things returns the mount target state.
     * </p>
     * </note>
     * <p>
     * We recommend that you create a mount target in each of the Availability Zones. There are cost considerations for
     * using a file system in an Availability Zone through a mount target created in another Availability Zone. For more
     * information, see <a href="http://aws.amazon.com/efs/">Amazon EFS</a>. In addition, by always using a mount target
     * local to the instance's Availability Zone, you eliminate a partial failure scenario. If the Availability Zone in
     * which your mount target is created goes down, then you can't access your file system through that mount target.
     * </p>
     * <p>
     * This operation requires permissions for the following action on the file system:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:CreateMountTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation also requires permissions for the following Amazon EC2 actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DescribeSubnets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaces</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMountTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMountTarget operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.CreateMountTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateMountTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(CreateMountTargetRequest createMountTargetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMountTargetRequest, CreateMountTargetResult> asyncHandler);

    /**
     * <p>
     * Creates a replication configuration that replicates an existing EFS file system to a new, read-only file system.
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/efs-replication.html">Amazon EFS
     * replication</a> in the <i>Amazon EFS User Guide</i>. The replication configuration specifies the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Source file system</b> – The EFS file system that you want replicated. The source file system cannot be a
     * destination file system in an existing replication configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Web Services Region</b> – The Amazon Web Services Region in which the destination file system is
     * created. Amazon EFS replication is available in all Amazon Web Services Regions in which EFS is available. The
     * Region must be enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Managing Amazon Web
     * Services Regions</a> in the <i>Amazon Web Services General Reference Reference Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Destination file system configuration</b> – The configuration of the destination file system to which the
     * source file system will be replicated. There can only be one destination file system in a replication
     * configuration.
     * </p>
     * <p>
     * Parameters for the replication configuration include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>File system ID</b> – The ID of the destination file system for the replication. If no ID is provided, then EFS
     * creates a new file system with the default settings. For existing file systems, the file system's replication
     * overwrite protection must be disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-replication#replicate-existing-destination"> Replicating to
     * an existing file system</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Availability Zone</b> – If you want the destination file system to use One Zone storage, you must specify the
     * Availability Zone to create the file system in. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html"> EFS file system types</a> in the <i>Amazon
     * EFS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Encryption</b> – All destination file systems are created with encryption at rest enabled. You can specify the
     * Key Management Service (KMS) key that is used to encrypt the destination file system. If you don't specify a KMS
     * key, your service-managed KMS key for Amazon EFS is used.
     * </p>
     * <note>
     * <p>
     * After the file system is created, you cannot change the KMS key.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * After the file system is created, you cannot change the KMS key.
     * </p>
     * </note>
     * <p>
     * For new destination file systems, the following properties are set by default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Performance mode</b> - The destination file system's performance mode matches that of the source file system,
     * unless the destination file system uses EFS One Zone storage. In that case, the General Purpose performance mode
     * is used. The performance mode cannot be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Throughput mode</b> - The destination file system's throughput mode matches that of the source file system.
     * After the file system is created, you can modify the throughput mode.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <b>Lifecycle management</b> – Lifecycle management is not enabled on the destination file system. After the
     * destination file system is created, you can enable lifecycle management.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Automatic backups</b> – Automatic daily backups are enabled on the destination file system. After the file
     * system is created, you can change this setting.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/efs-replication.html">Amazon EFS
     * replication</a> in the <i>Amazon EFS User Guide</i>.
     * </p>
     * 
     * @param createReplicationConfigurationRequest
     * @return A Java Future containing the result of the CreateReplicationConfiguration operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsync.CreateReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationConfigurationResult> createReplicationConfigurationAsync(
            CreateReplicationConfigurationRequest createReplicationConfigurationRequest);

    /**
     * <p>
     * Creates a replication configuration that replicates an existing EFS file system to a new, read-only file system.
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/efs-replication.html">Amazon EFS
     * replication</a> in the <i>Amazon EFS User Guide</i>. The replication configuration specifies the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Source file system</b> – The EFS file system that you want replicated. The source file system cannot be a
     * destination file system in an existing replication configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Web Services Region</b> – The Amazon Web Services Region in which the destination file system is
     * created. Amazon EFS replication is available in all Amazon Web Services Regions in which EFS is available. The
     * Region must be enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Managing Amazon Web
     * Services Regions</a> in the <i>Amazon Web Services General Reference Reference Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Destination file system configuration</b> – The configuration of the destination file system to which the
     * source file system will be replicated. There can only be one destination file system in a replication
     * configuration.
     * </p>
     * <p>
     * Parameters for the replication configuration include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>File system ID</b> – The ID of the destination file system for the replication. If no ID is provided, then EFS
     * creates a new file system with the default settings. For existing file systems, the file system's replication
     * overwrite protection must be disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-replication#replicate-existing-destination"> Replicating to
     * an existing file system</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Availability Zone</b> – If you want the destination file system to use One Zone storage, you must specify the
     * Availability Zone to create the file system in. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html"> EFS file system types</a> in the <i>Amazon
     * EFS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Encryption</b> – All destination file systems are created with encryption at rest enabled. You can specify the
     * Key Management Service (KMS) key that is used to encrypt the destination file system. If you don't specify a KMS
     * key, your service-managed KMS key for Amazon EFS is used.
     * </p>
     * <note>
     * <p>
     * After the file system is created, you cannot change the KMS key.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * After the file system is created, you cannot change the KMS key.
     * </p>
     * </note>
     * <p>
     * For new destination file systems, the following properties are set by default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Performance mode</b> - The destination file system's performance mode matches that of the source file system,
     * unless the destination file system uses EFS One Zone storage. In that case, the General Purpose performance mode
     * is used. The performance mode cannot be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Throughput mode</b> - The destination file system's throughput mode matches that of the source file system.
     * After the file system is created, you can modify the throughput mode.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <b>Lifecycle management</b> – Lifecycle management is not enabled on the destination file system. After the
     * destination file system is created, you can enable lifecycle management.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Automatic backups</b> – Automatic daily backups are enabled on the destination file system. After the file
     * system is created, you can change this setting.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/efs-replication.html">Amazon EFS
     * replication</a> in the <i>Amazon EFS User Guide</i>.
     * </p>
     * 
     * @param createReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReplicationConfiguration operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsyncHandler.CreateReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationConfigurationResult> createReplicationConfigurationAsync(
            CreateReplicationConfigurationRequest createReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationConfigurationRequest, CreateReplicationConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * DEPRECATED - <code>CreateTags</code> is deprecated and not maintained. To create tags for EFS resources, use the
     * API action.
     * </p>
     * </note>
     * <p>
     * Creates or overwrites tags associated with a file system. Each tag is a key-value pair. If a tag key specified in
     * the request already exists on the file system, this operation overwrites its value with the value provided in the
     * request. If you add the <code>Name</code> tag to your file system, Amazon EFS returns it in the response to the
     * <a>DescribeFileSystems</a> operation.
     * </p>
     * <p>
     * This operation requires permission for the <code>elasticfilesystem:CreateTags</code> action.
     * </p>
     * 
     * @param createTagsRequest
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest);

    /**
     * <note>
     * <p>
     * DEPRECATED - <code>CreateTags</code> is deprecated and not maintained. To create tags for EFS resources, use the
     * API action.
     * </p>
     * </note>
     * <p>
     * Creates or overwrites tags associated with a file system. Each tag is a key-value pair. If a tag key specified in
     * the request already exists on the file system, this operation overwrites its value with the value provided in the
     * request. If you add the <code>Name</code> tag to your file system, Amazon EFS returns it in the response to the
     * <a>DescribeFileSystems</a> operation.
     * </p>
     * <p>
     * This operation requires permission for the <code>elasticfilesystem:CreateTags</code> action.
     * </p>
     * 
     * @param createTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified access point. After deletion is complete, new clients can no longer connect to the access
     * points. Clients connected to the access point at the time of deletion will continue to function until they
     * terminate their connection.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteAccessPoint</code> action.
     * </p>
     * 
     * @param deleteAccessPointRequest
     * @return A Java Future containing the result of the DeleteAccessPoint operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DeleteAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest deleteAccessPointRequest);

    /**
     * <p>
     * Deletes the specified access point. After deletion is complete, new clients can no longer connect to the access
     * points. Clients connected to the access point at the time of deletion will continue to function until they
     * terminate their connection.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteAccessPoint</code> action.
     * </p>
     * 
     * @param deleteAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessPoint operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DeleteAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest deleteAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPointRequest, DeleteAccessPointResult> asyncHandler);

    /**
     * <p>
     * Deletes a file system, permanently severing access to its contents. Upon return, the file system no longer exists
     * and you can't access any contents of the deleted file system.
     * </p>
     * <p>
     * You need to manually delete mount targets attached to a file system before you can delete an EFS file system.
     * This step is performed for you when you use the Amazon Web Services console to delete a file system.
     * </p>
     * <note>
     * <p>
     * You cannot delete a file system that is part of an EFS Replication configuration. You need to delete the
     * replication configuration first.
     * </p>
     * </note>
     * <p>
     * You can't delete a file system that is in use. That is, if the file system has any mount targets, you must first
     * delete them. For more information, see <a>DescribeMountTargets</a> and <a>DeleteMountTarget</a>.
     * </p>
     * <note>
     * <p>
     * The <code>DeleteFileSystem</code> call returns while the file system state is still <code>deleting</code>. You
     * can check the file system deletion status by calling the <a>DescribeFileSystems</a> operation, which returns a
     * list of file systems in your account. If you pass file system ID or creation token for the deleted file system,
     * the <a>DescribeFileSystems</a> returns a <code>404 FileSystemNotFound</code> error.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteFileSystem</code> action.
     * </p>
     * 
     * @param deleteFileSystemRequest
     * @return A Java Future containing the result of the DeleteFileSystem operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DeleteFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteFileSystem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest deleteFileSystemRequest);

    /**
     * <p>
     * Deletes a file system, permanently severing access to its contents. Upon return, the file system no longer exists
     * and you can't access any contents of the deleted file system.
     * </p>
     * <p>
     * You need to manually delete mount targets attached to a file system before you can delete an EFS file system.
     * This step is performed for you when you use the Amazon Web Services console to delete a file system.
     * </p>
     * <note>
     * <p>
     * You cannot delete a file system that is part of an EFS Replication configuration. You need to delete the
     * replication configuration first.
     * </p>
     * </note>
     * <p>
     * You can't delete a file system that is in use. That is, if the file system has any mount targets, you must first
     * delete them. For more information, see <a>DescribeMountTargets</a> and <a>DeleteMountTarget</a>.
     * </p>
     * <note>
     * <p>
     * The <code>DeleteFileSystem</code> call returns while the file system state is still <code>deleting</code>. You
     * can check the file system deletion status by calling the <a>DescribeFileSystems</a> operation, which returns a
     * list of file systems in your account. If you pass file system ID or creation token for the deleted file system,
     * the <a>DescribeFileSystems</a> returns a <code>404 FileSystemNotFound</code> error.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteFileSystem</code> action.
     * </p>
     * 
     * @param deleteFileSystemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFileSystem operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DeleteFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteFileSystem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest deleteFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResult> asyncHandler);

    /**
     * <p>
     * Deletes the <code>FileSystemPolicy</code> for the specified file system. The default
     * <code>FileSystemPolicy</code> goes into effect once the existing policy is deleted. For more information about
     * the default file system policy, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/res-based-policies-efs.html">Using Resource-based Policies with
     * EFS</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteFileSystemPolicy</code> action.
     * </p>
     * 
     * @param deleteFileSystemPolicyRequest
     * @return A Java Future containing the result of the DeleteFileSystemPolicy operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DeleteFileSystemPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteFileSystemPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileSystemPolicyResult> deleteFileSystemPolicyAsync(DeleteFileSystemPolicyRequest deleteFileSystemPolicyRequest);

    /**
     * <p>
     * Deletes the <code>FileSystemPolicy</code> for the specified file system. The default
     * <code>FileSystemPolicy</code> goes into effect once the existing policy is deleted. For more information about
     * the default file system policy, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/res-based-policies-efs.html">Using Resource-based Policies with
     * EFS</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteFileSystemPolicy</code> action.
     * </p>
     * 
     * @param deleteFileSystemPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFileSystemPolicy operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DeleteFileSystemPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteFileSystemPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileSystemPolicyResult> deleteFileSystemPolicyAsync(DeleteFileSystemPolicyRequest deleteFileSystemPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFileSystemPolicyRequest, DeleteFileSystemPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified mount target.
     * </p>
     * <p>
     * This operation forcibly breaks any mounts of the file system by using the mount target that is being deleted,
     * which might disrupt instances or applications using those mounts. To avoid applications getting cut off abruptly,
     * you might consider unmounting any mounts of the mount target, if feasible. The operation also deletes the
     * associated network interface. Uncommitted writes might be lost, but breaking a mount target using this operation
     * does not corrupt the file system itself. The file system you created remains. You can mount an EC2 instance in
     * your VPC by using another mount target.
     * </p>
     * <p>
     * This operation requires permissions for the following action on the file system:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:DeleteMountTarget</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>DeleteMountTarget</code> call returns while the mount target state is still <code>deleting</code>. You
     * can check the mount target deletion by calling the <a>DescribeMountTargets</a> operation, which returns a list of
     * mount target descriptions for the given file system.
     * </p>
     * </note>
     * <p>
     * The operation also requires permissions for the following Amazon EC2 action on the mount target's network
     * interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DeleteNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMountTargetRequest
     * @return A Java Future containing the result of the DeleteMountTarget operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DeleteMountTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteMountTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMountTargetResult> deleteMountTargetAsync(DeleteMountTargetRequest deleteMountTargetRequest);

    /**
     * <p>
     * Deletes the specified mount target.
     * </p>
     * <p>
     * This operation forcibly breaks any mounts of the file system by using the mount target that is being deleted,
     * which might disrupt instances or applications using those mounts. To avoid applications getting cut off abruptly,
     * you might consider unmounting any mounts of the mount target, if feasible. The operation also deletes the
     * associated network interface. Uncommitted writes might be lost, but breaking a mount target using this operation
     * does not corrupt the file system itself. The file system you created remains. You can mount an EC2 instance in
     * your VPC by using another mount target.
     * </p>
     * <p>
     * This operation requires permissions for the following action on the file system:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:DeleteMountTarget</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>DeleteMountTarget</code> call returns while the mount target state is still <code>deleting</code>. You
     * can check the mount target deletion by calling the <a>DescribeMountTargets</a> operation, which returns a list of
     * mount target descriptions for the given file system.
     * </p>
     * </note>
     * <p>
     * The operation also requires permissions for the following Amazon EC2 action on the mount target's network
     * interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DeleteNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMountTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMountTarget operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DeleteMountTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteMountTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMountTargetResult> deleteMountTargetAsync(DeleteMountTargetRequest deleteMountTargetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMountTargetRequest, DeleteMountTargetResult> asyncHandler);

    /**
     * <p>
     * Deletes a replication configuration. Deleting a replication configuration ends the replication process. After a
     * replication configuration is deleted, the destination file system becomes <code>Writeable</code> and its
     * replication overwrite protection is re-enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/delete-replications.html">Delete a replication configuration</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteReplicationConfiguration</code> action.
     * </p>
     * 
     * @param deleteReplicationConfigurationRequest
     * @return A Java Future containing the result of the DeleteReplicationConfiguration operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsync.DeleteReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationConfigurationResult> deleteReplicationConfigurationAsync(
            DeleteReplicationConfigurationRequest deleteReplicationConfigurationRequest);

    /**
     * <p>
     * Deletes a replication configuration. Deleting a replication configuration ends the replication process. After a
     * replication configuration is deleted, the destination file system becomes <code>Writeable</code> and its
     * replication overwrite protection is re-enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/delete-replications.html">Delete a replication configuration</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteReplicationConfiguration</code> action.
     * </p>
     * 
     * @param deleteReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationConfiguration operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsyncHandler.DeleteReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationConfigurationResult> deleteReplicationConfigurationAsync(
            DeleteReplicationConfigurationRequest deleteReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationConfigurationRequest, DeleteReplicationConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * DEPRECATED - <code>DeleteTags</code> is deprecated and not maintained. To remove tags from EFS resources, use the
     * API action.
     * </p>
     * </note>
     * <p>
     * Deletes the specified tags from a file system. If the <code>DeleteTags</code> request includes a tag key that
     * doesn't exist, Amazon EFS ignores it and doesn't cause an error. For more information about tags and related
     * restrictions, see <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Tag
     * restrictions</a> in the <i>Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteTags</code> action.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <note>
     * <p>
     * DEPRECATED - <code>DeleteTags</code> is deprecated and not maintained. To remove tags from EFS resources, use the
     * API action.
     * </p>
     * </note>
     * <p>
     * Deletes the specified tags from a file system. If the <code>DeleteTags</code> request includes a tag key that
     * doesn't exist, Amazon EFS ignores it and doesn't cause an error. For more information about tags and related
     * restrictions, see <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Tag
     * restrictions</a> in the <i>Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DeleteTags</code> action.
     * </p>
     * 
     * @param deleteTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Returns the description of a specific Amazon EFS access point if the <code>AccessPointId</code> is provided. If
     * you provide an EFS <code>FileSystemId</code>, it returns descriptions of all access points for that file system.
     * You can provide either an <code>AccessPointId</code> or a <code>FileSystemId</code> in the request, but not both.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeAccessPoints</code> action.
     * </p>
     * 
     * @param describeAccessPointsRequest
     * @return A Java Future containing the result of the DescribeAccessPoints operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DescribeAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeAccessPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccessPointsResult> describeAccessPointsAsync(DescribeAccessPointsRequest describeAccessPointsRequest);

    /**
     * <p>
     * Returns the description of a specific Amazon EFS access point if the <code>AccessPointId</code> is provided. If
     * you provide an EFS <code>FileSystemId</code>, it returns descriptions of all access points for that file system.
     * You can provide either an <code>AccessPointId</code> or a <code>FileSystemId</code> in the request, but not both.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeAccessPoints</code> action.
     * </p>
     * 
     * @param describeAccessPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccessPoints operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DescribeAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeAccessPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccessPointsResult> describeAccessPointsAsync(DescribeAccessPointsRequest describeAccessPointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccessPointsRequest, DescribeAccessPointsResult> asyncHandler);

    /**
     * <p>
     * Returns the account preferences settings for the Amazon Web Services account associated with the user making the
     * request, in the current Amazon Web Services Region.
     * </p>
     * 
     * @param describeAccountPreferencesRequest
     * @return A Java Future containing the result of the DescribeAccountPreferences operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DescribeAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeAccountPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountPreferencesResult> describeAccountPreferencesAsync(
            DescribeAccountPreferencesRequest describeAccountPreferencesRequest);

    /**
     * <p>
     * Returns the account preferences settings for the Amazon Web Services account associated with the user making the
     * request, in the current Amazon Web Services Region.
     * </p>
     * 
     * @param describeAccountPreferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountPreferences operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DescribeAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeAccountPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountPreferencesResult> describeAccountPreferencesAsync(
            DescribeAccountPreferencesRequest describeAccountPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountPreferencesRequest, DescribeAccountPreferencesResult> asyncHandler);

    /**
     * <p>
     * Returns the backup policy for the specified EFS file system.
     * </p>
     * 
     * @param describeBackupPolicyRequest
     * @return A Java Future containing the result of the DescribeBackupPolicy operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DescribeBackupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeBackupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupPolicyResult> describeBackupPolicyAsync(DescribeBackupPolicyRequest describeBackupPolicyRequest);

    /**
     * <p>
     * Returns the backup policy for the specified EFS file system.
     * </p>
     * 
     * @param describeBackupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBackupPolicy operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DescribeBackupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeBackupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupPolicyResult> describeBackupPolicyAsync(DescribeBackupPolicyRequest describeBackupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupPolicyRequest, DescribeBackupPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the <code>FileSystemPolicy</code> for the specified EFS file system.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeFileSystemPolicy</code> action.
     * </p>
     * 
     * @param describeFileSystemPolicyRequest
     * @return A Java Future containing the result of the DescribeFileSystemPolicy operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DescribeFileSystemPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeFileSystemPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemPolicyResult> describeFileSystemPolicyAsync(DescribeFileSystemPolicyRequest describeFileSystemPolicyRequest);

    /**
     * <p>
     * Returns the <code>FileSystemPolicy</code> for the specified EFS file system.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeFileSystemPolicy</code> action.
     * </p>
     * 
     * @param describeFileSystemPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFileSystemPolicy operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DescribeFileSystemPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeFileSystemPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemPolicyResult> describeFileSystemPolicyAsync(DescribeFileSystemPolicyRequest describeFileSystemPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemPolicyRequest, DescribeFileSystemPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the description of a specific Amazon EFS file system if either the file system <code>CreationToken</code>
     * or the <code>FileSystemId</code> is provided. Otherwise, it returns descriptions of all file systems owned by the
     * caller's Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify the <code>MaxItems</code> parameter to
     * limit the number of descriptions in a response. This number is automatically set to 100. If more file system
     * descriptions remain, Amazon EFS returns a <code>NextMarker</code>, an opaque token, in the response. In this
     * case, you should send a subsequent request with the <code>Marker</code> request parameter set to the value of
     * <code>NextMarker</code>.
     * </p>
     * <p>
     * To retrieve a list of your file system descriptions, this operation is used in an iterative process, where
     * <code>DescribeFileSystems</code> is called first without the <code>Marker</code> and then the operation continues
     * to call it with the <code>Marker</code> parameter set to the value of the <code>NextMarker</code> from the
     * previous response until the response has no <code>NextMarker</code>.
     * </p>
     * <p>
     * The order of file systems returned in the response of one <code>DescribeFileSystems</code> call and the order of
     * file systems returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeFileSystems</code> action.
     * </p>
     * 
     * @param describeFileSystemsRequest
     * @return A Java Future containing the result of the DescribeFileSystems operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DescribeFileSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeFileSystems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest describeFileSystemsRequest);

    /**
     * <p>
     * Returns the description of a specific Amazon EFS file system if either the file system <code>CreationToken</code>
     * or the <code>FileSystemId</code> is provided. Otherwise, it returns descriptions of all file systems owned by the
     * caller's Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify the <code>MaxItems</code> parameter to
     * limit the number of descriptions in a response. This number is automatically set to 100. If more file system
     * descriptions remain, Amazon EFS returns a <code>NextMarker</code>, an opaque token, in the response. In this
     * case, you should send a subsequent request with the <code>Marker</code> request parameter set to the value of
     * <code>NextMarker</code>.
     * </p>
     * <p>
     * To retrieve a list of your file system descriptions, this operation is used in an iterative process, where
     * <code>DescribeFileSystems</code> is called first without the <code>Marker</code> and then the operation continues
     * to call it with the <code>Marker</code> parameter set to the value of the <code>NextMarker</code> from the
     * previous response until the response has no <code>NextMarker</code>.
     * </p>
     * <p>
     * The order of file systems returned in the response of one <code>DescribeFileSystems</code> call and the order of
     * file systems returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeFileSystems</code> action.
     * </p>
     * 
     * @param describeFileSystemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFileSystems operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DescribeFileSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeFileSystems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest describeFileSystemsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeFileSystems operation.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest)
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync();

    /**
     * Simplified method form for invoking the DescribeFileSystems operation with an AsyncHandler.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler);

    /**
     * <p>
     * Returns the current <code>LifecycleConfiguration</code> object for the specified Amazon EFS file system.
     * Lifecycle management uses the <code>LifecycleConfiguration</code> object to identify when to move files between
     * storage classes. For a file system without a <code>LifecycleConfiguration</code> object, the call returns an
     * empty array in the response.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeLifecycleConfiguration</code>
     * operation.
     * </p>
     * 
     * @param describeLifecycleConfigurationRequest
     * @return A Java Future containing the result of the DescribeLifecycleConfiguration operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsync.DescribeLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLifecycleConfigurationResult> describeLifecycleConfigurationAsync(
            DescribeLifecycleConfigurationRequest describeLifecycleConfigurationRequest);

    /**
     * <p>
     * Returns the current <code>LifecycleConfiguration</code> object for the specified Amazon EFS file system.
     * Lifecycle management uses the <code>LifecycleConfiguration</code> object to identify when to move files between
     * storage classes. For a file system without a <code>LifecycleConfiguration</code> object, the call returns an
     * empty array in the response.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeLifecycleConfiguration</code>
     * operation.
     * </p>
     * 
     * @param describeLifecycleConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLifecycleConfiguration operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsyncHandler.DescribeLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLifecycleConfigurationResult> describeLifecycleConfigurationAsync(
            DescribeLifecycleConfigurationRequest describeLifecycleConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleConfigurationRequest, DescribeLifecycleConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns the security groups currently in effect for a mount target. This operation requires that the network
     * interface of the mount target has been created and the lifecycle state of the mount target is not
     * <code>deleted</code>.
     * </p>
     * <p>
     * This operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:DescribeMountTargetSecurityGroups</code> action on the mount target's file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaceAttribute</code> action on the mount target's network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMountTargetSecurityGroupsRequest
     * @return A Java Future containing the result of the DescribeMountTargetSecurityGroups operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsync.DescribeMountTargetSecurityGroups
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeMountTargetSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            DescribeMountTargetSecurityGroupsRequest describeMountTargetSecurityGroupsRequest);

    /**
     * <p>
     * Returns the security groups currently in effect for a mount target. This operation requires that the network
     * interface of the mount target has been created and the lifecycle state of the mount target is not
     * <code>deleted</code>.
     * </p>
     * <p>
     * This operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:DescribeMountTargetSecurityGroups</code> action on the mount target's file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaceAttribute</code> action on the mount target's network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMountTargetSecurityGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMountTargetSecurityGroups operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsyncHandler.DescribeMountTargetSecurityGroups
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeMountTargetSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            DescribeMountTargetSecurityGroupsRequest describeMountTargetSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMountTargetSecurityGroupsRequest, DescribeMountTargetSecurityGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the descriptions of all the current mount targets, or a specific mount target, for a file system. When
     * requesting all of the current mount targets, the order of mount targets returned in the response is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeMountTargets</code> action, on either
     * the file system ID that you specify in <code>FileSystemId</code>, or on the file system of the mount target that
     * you specify in <code>MountTargetId</code>.
     * </p>
     * 
     * @param describeMountTargetsRequest
     * @return A Java Future containing the result of the DescribeMountTargets operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DescribeMountTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeMountTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(DescribeMountTargetsRequest describeMountTargetsRequest);

    /**
     * <p>
     * Returns the descriptions of all the current mount targets, or a specific mount target, for a file system. When
     * requesting all of the current mount targets, the order of mount targets returned in the response is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeMountTargets</code> action, on either
     * the file system ID that you specify in <code>FileSystemId</code>, or on the file system of the mount target that
     * you specify in <code>MountTargetId</code>.
     * </p>
     * 
     * @param describeMountTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMountTargets operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DescribeMountTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeMountTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(DescribeMountTargetsRequest describeMountTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMountTargetsRequest, DescribeMountTargetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the replication configuration for a specific file system. If a file system is not specified, all of the
     * replication configurations for the Amazon Web Services account in an Amazon Web Services Region are retrieved.
     * </p>
     * 
     * @param describeReplicationConfigurationsRequest
     * @return A Java Future containing the result of the DescribeReplicationConfigurations operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsync.DescribeReplicationConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeReplicationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationConfigurationsResult> describeReplicationConfigurationsAsync(
            DescribeReplicationConfigurationsRequest describeReplicationConfigurationsRequest);

    /**
     * <p>
     * Retrieves the replication configuration for a specific file system. If a file system is not specified, all of the
     * replication configurations for the Amazon Web Services account in an Amazon Web Services Region are retrieved.
     * </p>
     * 
     * @param describeReplicationConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReplicationConfigurations operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsyncHandler.DescribeReplicationConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeReplicationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationConfigurationsResult> describeReplicationConfigurationsAsync(
            DescribeReplicationConfigurationsRequest describeReplicationConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationConfigurationsRequest, DescribeReplicationConfigurationsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * DEPRECATED - The <code>DescribeTags</code> action is deprecated and not maintained. To view tags associated with
     * EFS resources, use the <code>ListTagsForResource</code> API action.
     * </p>
     * </note>
     * <p>
     * Returns the tags associated with a file system. The order of tags returned in the response of one
     * <code>DescribeTags</code> call and the order of tags returned across the responses of a multiple-call iteration
     * (when using pagination) is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeTags</code> action.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <note>
     * <p>
     * DEPRECATED - The <code>DescribeTags</code> action is deprecated and not maintained. To view tags associated with
     * EFS resources, use the <code>ListTagsForResource</code> API action.
     * </p>
     * </note>
     * <p>
     * Returns the tags associated with a file system. The order of tags returned in the response of one
     * <code>DescribeTags</code> call and the order of tags returned across the responses of a multiple-call iteration
     * (when using pagination) is unspecified.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeTags</code> action.
     * </p>
     * 
     * @param describeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Lists all tags for a top-level EFS resource. You must provide the ID of the resource that you want to retrieve
     * the tags for.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeAccessPoints</code> action.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags for a top-level EFS resource. You must provide the ID of the resource that you want to retrieve
     * the tags for.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:DescribeAccessPoints</code> action.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the set of security groups in effect for a mount target.
     * </p>
     * <p>
     * When you create a mount target, Amazon EFS also creates a new network interface. For more information, see
     * <a>CreateMountTarget</a>. This operation replaces the security groups in effect for the network interface
     * associated with a mount target, with the <code>SecurityGroups</code> provided in the request. This operation
     * requires that the network interface of the mount target has been created and the lifecycle state of the mount
     * target is not <code>deleted</code>.
     * </p>
     * <p>
     * The operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:ModifyMountTargetSecurityGroups</code> action on the mount target's file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:ModifyNetworkInterfaceAttribute</code> action on the mount target's network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modifyMountTargetSecurityGroupsRequest
     * @return A Java Future containing the result of the ModifyMountTargetSecurityGroups operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsync.ModifyMountTargetSecurityGroups
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/ModifyMountTargetSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyMountTargetSecurityGroupsResult> modifyMountTargetSecurityGroupsAsync(
            ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest);

    /**
     * <p>
     * Modifies the set of security groups in effect for a mount target.
     * </p>
     * <p>
     * When you create a mount target, Amazon EFS also creates a new network interface. For more information, see
     * <a>CreateMountTarget</a>. This operation replaces the security groups in effect for the network interface
     * associated with a mount target, with the <code>SecurityGroups</code> provided in the request. This operation
     * requires that the network interface of the mount target has been created and the lifecycle state of the mount
     * target is not <code>deleted</code>.
     * </p>
     * <p>
     * The operation requires permissions for the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elasticfilesystem:ModifyMountTargetSecurityGroups</code> action on the mount target's file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:ModifyNetworkInterfaceAttribute</code> action on the mount target's network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modifyMountTargetSecurityGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyMountTargetSecurityGroups operation returned by the
     *         service.
     * @sample AmazonElasticFileSystemAsyncHandler.ModifyMountTargetSecurityGroups
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/ModifyMountTargetSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyMountTargetSecurityGroupsResult> modifyMountTargetSecurityGroupsAsync(
            ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyMountTargetSecurityGroupsRequest, ModifyMountTargetSecurityGroupsResult> asyncHandler);

    /**
     * <p>
     * Use this operation to set the account preference in the current Amazon Web Services Region to use long 17
     * character (63 bit) or short 8 character (32 bit) resource IDs for new EFS file system and mount target resources.
     * All existing resource IDs are not affected by any changes you make. You can set the ID preference during the
     * opt-in period as EFS transitions to long resource IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/manage-efs-resource-ids.html">Managing Amazon EFS resource
     * IDs</a>.
     * </p>
     * <note>
     * <p>
     * Starting in October, 2021, you will receive an error if you try to set the account preference to use the short 8
     * character format resource ID. Contact Amazon Web Services support if you receive an error and must use short IDs
     * for file system and mount target resources.
     * </p>
     * </note>
     * 
     * @param putAccountPreferencesRequest
     * @return A Java Future containing the result of the PutAccountPreferences operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.PutAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutAccountPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountPreferencesResult> putAccountPreferencesAsync(PutAccountPreferencesRequest putAccountPreferencesRequest);

    /**
     * <p>
     * Use this operation to set the account preference in the current Amazon Web Services Region to use long 17
     * character (63 bit) or short 8 character (32 bit) resource IDs for new EFS file system and mount target resources.
     * All existing resource IDs are not affected by any changes you make. You can set the ID preference during the
     * opt-in period as EFS transitions to long resource IDs. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/manage-efs-resource-ids.html">Managing Amazon EFS resource
     * IDs</a>.
     * </p>
     * <note>
     * <p>
     * Starting in October, 2021, you will receive an error if you try to set the account preference to use the short 8
     * character format resource ID. Contact Amazon Web Services support if you receive an error and must use short IDs
     * for file system and mount target resources.
     * </p>
     * </note>
     * 
     * @param putAccountPreferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccountPreferences operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.PutAccountPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutAccountPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountPreferencesResult> putAccountPreferencesAsync(PutAccountPreferencesRequest putAccountPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccountPreferencesRequest, PutAccountPreferencesResult> asyncHandler);

    /**
     * <p>
     * Updates the file system's backup policy. Use this action to start or stop automatic backups of the file system.
     * </p>
     * 
     * @param putBackupPolicyRequest
     * @return A Java Future containing the result of the PutBackupPolicy operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.PutBackupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutBackupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutBackupPolicyResult> putBackupPolicyAsync(PutBackupPolicyRequest putBackupPolicyRequest);

    /**
     * <p>
     * Updates the file system's backup policy. Use this action to start or stop automatic backups of the file system.
     * </p>
     * 
     * @param putBackupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBackupPolicy operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.PutBackupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutBackupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutBackupPolicyResult> putBackupPolicyAsync(PutBackupPolicyRequest putBackupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutBackupPolicyRequest, PutBackupPolicyResult> asyncHandler);

    /**
     * <p>
     * Applies an Amazon EFS <code>FileSystemPolicy</code> to an Amazon EFS file system. A file system policy is an IAM
     * resource-based policy and can contain multiple policy statements. A file system always has exactly one file
     * system policy, which can be the default policy or an explicit policy set or updated using this API operation. EFS
     * file system policies have a 20,000 character limit. When an explicit policy is set, it overrides the default
     * policy. For more information about the default file system policy, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html#default-filesystempolicy">Default
     * EFS File System Policy</a>.
     * </p>
     * <note>
     * <p>
     * EFS file system policies have a 20,000 character limit.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:PutFileSystemPolicy</code> action.
     * </p>
     * 
     * @param putFileSystemPolicyRequest
     * @return A Java Future containing the result of the PutFileSystemPolicy operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.PutFileSystemPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutFileSystemPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutFileSystemPolicyResult> putFileSystemPolicyAsync(PutFileSystemPolicyRequest putFileSystemPolicyRequest);

    /**
     * <p>
     * Applies an Amazon EFS <code>FileSystemPolicy</code> to an Amazon EFS file system. A file system policy is an IAM
     * resource-based policy and can contain multiple policy statements. A file system always has exactly one file
     * system policy, which can be the default policy or an explicit policy set or updated using this API operation. EFS
     * file system policies have a 20,000 character limit. When an explicit policy is set, it overrides the default
     * policy. For more information about the default file system policy, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html#default-filesystempolicy">Default
     * EFS File System Policy</a>.
     * </p>
     * <note>
     * <p>
     * EFS file system policies have a 20,000 character limit.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:PutFileSystemPolicy</code> action.
     * </p>
     * 
     * @param putFileSystemPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFileSystemPolicy operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.PutFileSystemPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutFileSystemPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutFileSystemPolicyResult> putFileSystemPolicyAsync(PutFileSystemPolicyRequest putFileSystemPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutFileSystemPolicyRequest, PutFileSystemPolicyResult> asyncHandler);

    /**
     * <p>
     * Use this action to manage storage for your file system. A <code>LifecycleConfiguration</code> consists of one or
     * more <code>LifecyclePolicy</code> objects that define the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>TransitionToIA</code> </b> – When to move files in the file system from primary storage (Standard
     * storage class) into the Infrequent Access (IA) storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>TransitionToArchive</code> </b> – When to move files in the file system from their current storage
     * class (either IA or Standard storage) into the Archive storage.
     * </p>
     * <p>
     * File systems cannot transition into Archive storage before transitioning into IA storage. Therefore,
     * TransitionToArchive must either not be set or must be later than TransitionToIA.
     * </p>
     * <note>
     * <p>
     * The Archive storage class is available only for file systems that use the Elastic Throughput mode and the General
     * Purpose Performance mode.
     * </p>
     * </note></li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <b> <code>TransitionToPrimaryStorageClass</code> </b> – Whether to move files in the file system back to primary
     * storage (Standard storage class) after they are accessed in IA or Archive storage.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/lifecycle-management-efs.html">
     * Managing file system storage</a>.
     * </p>
     * <p>
     * Each Amazon EFS file system supports one lifecycle configuration, which applies to all files in the file system.
     * If a <code>LifecycleConfiguration</code> object already exists for the specified file system, a
     * <code>PutLifecycleConfiguration</code> call modifies the existing configuration. A
     * <code>PutLifecycleConfiguration</code> call with an empty <code>LifecyclePolicies</code> array in the request
     * body deletes any existing <code>LifecycleConfiguration</code>. In the request, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ID for the file system for which you are enabling, disabling, or modifying Lifecycle management.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>LifecyclePolicies</code> array of <code>LifecyclePolicy</code> objects that define when to move files to
     * IA storage, to Archive storage, and back to primary storage.
     * </p>
     * <note>
     * <p>
     * Amazon EFS requires that each <code>LifecyclePolicy</code> object have only have a single transition, so the
     * <code>LifecyclePolicies</code> array needs to be structured with separate <code>LifecyclePolicy</code> objects.
     * See the example requests in the following section for more information.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:PutLifecycleConfiguration</code> operation.
     * </p>
     * <p>
     * To apply a <code>LifecycleConfiguration</code> object to an encrypted file system, you need the same Key
     * Management Service permissions as when you created the encrypted file system.
     * </p>
     * 
     * @param putLifecycleConfigurationRequest
     * @return A Java Future containing the result of the PutLifecycleConfiguration operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.PutLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutLifecycleConfigurationResult> putLifecycleConfigurationAsync(
            PutLifecycleConfigurationRequest putLifecycleConfigurationRequest);

    /**
     * <p>
     * Use this action to manage storage for your file system. A <code>LifecycleConfiguration</code> consists of one or
     * more <code>LifecyclePolicy</code> objects that define the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>TransitionToIA</code> </b> – When to move files in the file system from primary storage (Standard
     * storage class) into the Infrequent Access (IA) storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>TransitionToArchive</code> </b> – When to move files in the file system from their current storage
     * class (either IA or Standard storage) into the Archive storage.
     * </p>
     * <p>
     * File systems cannot transition into Archive storage before transitioning into IA storage. Therefore,
     * TransitionToArchive must either not be set or must be later than TransitionToIA.
     * </p>
     * <note>
     * <p>
     * The Archive storage class is available only for file systems that use the Elastic Throughput mode and the General
     * Purpose Performance mode.
     * </p>
     * </note></li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <b> <code>TransitionToPrimaryStorageClass</code> </b> – Whether to move files in the file system back to primary
     * storage (Standard storage class) after they are accessed in IA or Archive storage.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/lifecycle-management-efs.html">
     * Managing file system storage</a>.
     * </p>
     * <p>
     * Each Amazon EFS file system supports one lifecycle configuration, which applies to all files in the file system.
     * If a <code>LifecycleConfiguration</code> object already exists for the specified file system, a
     * <code>PutLifecycleConfiguration</code> call modifies the existing configuration. A
     * <code>PutLifecycleConfiguration</code> call with an empty <code>LifecyclePolicies</code> array in the request
     * body deletes any existing <code>LifecycleConfiguration</code>. In the request, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ID for the file system for which you are enabling, disabling, or modifying Lifecycle management.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>LifecyclePolicies</code> array of <code>LifecyclePolicy</code> objects that define when to move files to
     * IA storage, to Archive storage, and back to primary storage.
     * </p>
     * <note>
     * <p>
     * Amazon EFS requires that each <code>LifecyclePolicy</code> object have only have a single transition, so the
     * <code>LifecyclePolicies</code> array needs to be structured with separate <code>LifecyclePolicy</code> objects.
     * See the example requests in the following section for more information.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:PutLifecycleConfiguration</code> operation.
     * </p>
     * <p>
     * To apply a <code>LifecycleConfiguration</code> object to an encrypted file system, you need the same Key
     * Management Service permissions as when you created the encrypted file system.
     * </p>
     * 
     * @param putLifecycleConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLifecycleConfiguration operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.PutLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutLifecycleConfigurationResult> putLifecycleConfigurationAsync(
            PutLifecycleConfigurationRequest putLifecycleConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutLifecycleConfigurationRequest, PutLifecycleConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a tag for an EFS resource. You can create tags for EFS file systems and access points using this API
     * operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:TagResource</code> action.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Creates a tag for an EFS resource. You can create tags for EFS file systems and access points using this API
     * operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:TagResource</code> action.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from an EFS resource. You can remove tags from EFS file systems and access points using this API
     * operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:UntagResource</code> action.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from an EFS resource. You can remove tags from EFS file systems and access points using this API
     * operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:UntagResource</code> action.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the throughput mode or the amount of provisioned throughput of an existing file system.
     * </p>
     * 
     * @param updateFileSystemRequest
     * @return A Java Future containing the result of the UpdateFileSystem operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.UpdateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UpdateFileSystem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest updateFileSystemRequest);

    /**
     * <p>
     * Updates the throughput mode or the amount of provisioned throughput of an existing file system.
     * </p>
     * 
     * @param updateFileSystemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFileSystem operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.UpdateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UpdateFileSystem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest updateFileSystemRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResult> asyncHandler);

    /**
     * <p>
     * Updates protection on the file system.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:UpdateFileSystemProtection</code> action.
     * </p>
     * 
     * @param updateFileSystemProtectionRequest
     * @return A Java Future containing the result of the UpdateFileSystemProtection operation returned by the service.
     * @sample AmazonElasticFileSystemAsync.UpdateFileSystemProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UpdateFileSystemProtection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFileSystemProtectionResult> updateFileSystemProtectionAsync(
            UpdateFileSystemProtectionRequest updateFileSystemProtectionRequest);

    /**
     * <p>
     * Updates protection on the file system.
     * </p>
     * <p>
     * This operation requires permissions for the <code>elasticfilesystem:UpdateFileSystemProtection</code> action.
     * </p>
     * 
     * @param updateFileSystemProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFileSystemProtection operation returned by the service.
     * @sample AmazonElasticFileSystemAsyncHandler.UpdateFileSystemProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UpdateFileSystemProtection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFileSystemProtectionResult> updateFileSystemProtectionAsync(
            UpdateFileSystemProtectionRequest updateFileSystemProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFileSystemProtectionRequest, UpdateFileSystemProtectionResult> asyncHandler);

}
