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
package com.amazonaws.services.lightsail;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;

/**
 * Interface for accessing Amazon Lightsail asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lightsail.AbstractAmazonLightsailAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Lightsail is the easiest way to get started with AWS for developers who just need virtual private servers.
 * Lightsail includes everything you need to launch your project quickly - a virtual machine, a managed database,
 * SSD-based storage, data transfer, DNS management, and a static IP - for a low, predictable price. You manage those
 * Lightsail servers through the Lightsail console or by using the API or command-line interface (CLI).
 * </p>
 * <p>
 * For more information about Lightsail concepts and tasks, see the <a
 * href="https://lightsail.aws.amazon.com/ls/docs/all">Lightsail Dev Guide</a>.
 * </p>
 * <p>
 * To use the Lightsail API or the CLI, you will need to use AWS Identity and Access Management (IAM) to generate access
 * keys. For details about how to set this up, see the <a href=
 * "http://lightsail.aws.amazon.com/ls/docs/how-to/article/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLightsailAsync extends AmazonLightsail {

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @return A Java Future containing the result of the AllocateStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.AllocateStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AllocateStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(AllocateStaticIpRequest allocateStaticIpRequest);

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AllocateStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.AllocateStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AllocateStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(AllocateStaticIpRequest allocateStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<AllocateStaticIpRequest, AllocateStaticIpResult> asyncHandler);

    /**
     * <p>
     * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the
     * specified disk name.
     * </p>
     * <p>
     * The <code>attach disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by diskName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachDiskRequest
     * @return A Java Future containing the result of the AttachDisk operation returned by the service.
     * @sample AmazonLightsailAsync.AttachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachDiskResult> attachDiskAsync(AttachDiskRequest attachDiskRequest);

    /**
     * <p>
     * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the
     * specified disk name.
     * </p>
     * <p>
     * The <code>attach disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by diskName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachDiskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachDisk operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.AttachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachDiskResult> attachDiskAsync(AttachDiskRequest attachDiskRequest,
            com.amazonaws.handlers.AsyncHandler<AttachDiskRequest, AttachDiskResult> asyncHandler);

    /**
     * <p>
     * Attaches one or more Lightsail instances to a load balancer.
     * </p>
     * <p>
     * After some time, the instances are attached to the load balancer and the health check status is available.
     * </p>
     * <p>
     * The <code>attach instances to load balancer</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachInstancesToLoadBalancerRequest
     * @return A Java Future containing the result of the AttachInstancesToLoadBalancer operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.AttachInstancesToLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachInstancesToLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachInstancesToLoadBalancerResult> attachInstancesToLoadBalancerAsync(
            AttachInstancesToLoadBalancerRequest attachInstancesToLoadBalancerRequest);

    /**
     * <p>
     * Attaches one or more Lightsail instances to a load balancer.
     * </p>
     * <p>
     * After some time, the instances are attached to the load balancer and the health check status is available.
     * </p>
     * <p>
     * The <code>attach instances to load balancer</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachInstancesToLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachInstancesToLoadBalancer operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.AttachInstancesToLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachInstancesToLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachInstancesToLoadBalancerResult> attachInstancesToLoadBalancerAsync(
            AttachInstancesToLoadBalancerRequest attachInstancesToLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<AttachInstancesToLoadBalancerRequest, AttachInstancesToLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure
     * version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API
     * to rotate the certificates on your account. Use the <code>AttachLoadBalancerTlsCertificate</code> operation with
     * the non-attached certificate, and it will replace the existing one and become the attached certificate.
     * </p>
     * <p>
     * The <code>attach load balancer tls certificate</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachLoadBalancerTlsCertificateRequest
     * @return A Java Future containing the result of the AttachLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.AttachLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachLoadBalancerTlsCertificateResult> attachLoadBalancerTlsCertificateAsync(
            AttachLoadBalancerTlsCertificateRequest attachLoadBalancerTlsCertificateRequest);

    /**
     * <p>
     * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure
     * version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API
     * to rotate the certificates on your account. Use the <code>AttachLoadBalancerTlsCertificate</code> operation with
     * the non-attached certificate, and it will replace the existing one and become the attached certificate.
     * </p>
     * <p>
     * The <code>attach load balancer tls certificate</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param attachLoadBalancerTlsCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.AttachLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachLoadBalancerTlsCertificateResult> attachLoadBalancerTlsCertificateAsync(
            AttachLoadBalancerTlsCertificateRequest attachLoadBalancerTlsCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancerTlsCertificateRequest, AttachLoadBalancerTlsCertificateResult> asyncHandler);

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @return A Java Future containing the result of the AttachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.AttachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(AttachStaticIpRequest attachStaticIpRequest);

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.AttachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(AttachStaticIpRequest attachStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<AttachStaticIpRequest, AttachStaticIpResult> asyncHandler);

    /**
     * <p>
     * Closes the public ports on a specific Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>close instance public ports</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param closeInstancePublicPortsRequest
     * @return A Java Future containing the result of the CloseInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsync.CloseInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CloseInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(CloseInstancePublicPortsRequest closeInstancePublicPortsRequest);

    /**
     * <p>
     * Closes the public ports on a specific Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>close instance public ports</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param closeInstancePublicPortsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CloseInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CloseInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CloseInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(CloseInstancePublicPortsRequest closeInstancePublicPortsRequest,
            com.amazonaws.handlers.AsyncHandler<CloseInstancePublicPortsRequest, CloseInstancePublicPortsResult> asyncHandler);

    /**
     * <p>
     * Copies an instance or disk snapshot from one AWS Region to another in Amazon Lightsail.
     * </p>
     * 
     * @param copySnapshotRequest
     * @return A Java Future containing the result of the CopySnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest);

    /**
     * <p>
     * Copies an instance or disk snapshot from one AWS Region to another in Amazon Lightsail.
     * </p>
     * 
     * @param copySnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopySnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail
     * snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS
     * CloudFormation stack created. Use the <code>get cloud formation stack records</code> operation to get a list of
     * the CloudFormation stacks created.
     * </p>
     * <important>
     * <p>
     * Wait until after your new Amazon EC2 instance is created before running the
     * <code>create cloud formation stack</code> operation again with the same export snapshot record.
     * </p>
     * </important>
     * 
     * @param createCloudFormationStackRequest
     * @return A Java Future containing the result of the CreateCloudFormationStack operation returned by the service.
     * @sample AmazonLightsailAsync.CreateCloudFormationStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCloudFormationStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFormationStackResult> createCloudFormationStackAsync(
            CreateCloudFormationStackRequest createCloudFormationStackRequest);

    /**
     * <p>
     * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail
     * snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS
     * CloudFormation stack created. Use the <code>get cloud formation stack records</code> operation to get a list of
     * the CloudFormation stacks created.
     * </p>
     * <important>
     * <p>
     * Wait until after your new Amazon EC2 instance is created before running the
     * <code>create cloud formation stack</code> operation again with the same export snapshot record.
     * </p>
     * </important>
     * 
     * @param createCloudFormationStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCloudFormationStack operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateCloudFormationStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCloudFormationStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFormationStackResult> createCloudFormationStackAsync(
            CreateCloudFormationStackRequest createCloudFormationStackRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCloudFormationStackRequest, CreateCloudFormationStackResult> asyncHandler);

    /**
     * <p>
     * Creates a block storage disk that can be attached to a Lightsail instance in the same Availability Zone (e.g.,
     * <code>us-east-2a</code>). The disk is created in the regional endpoint that you send the HTTP request to. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail"
     * >Regions and Availability Zones in Lightsail</a>.
     * </p>
     * <p>
     * The <code>create disk</code> operation supports tag-based access control via request tags. For more information,
     * see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskRequest
     * @return A Java Future containing the result of the CreateDisk operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskResult> createDiskAsync(CreateDiskRequest createDiskRequest);

    /**
     * <p>
     * Creates a block storage disk that can be attached to a Lightsail instance in the same Availability Zone (e.g.,
     * <code>us-east-2a</code>). The disk is created in the regional endpoint that you send the HTTP request to. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail"
     * >Regions and Availability Zones in Lightsail</a>.
     * </p>
     * <p>
     * The <code>create disk</code> operation supports tag-based access control via request tags. For more information,
     * see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDisk operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskResult> createDiskAsync(CreateDiskRequest createDiskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDiskRequest, CreateDiskResult> asyncHandler);

    /**
     * <p>
     * Creates a block storage disk from a disk snapshot that can be attached to a Lightsail instance in the same
     * Availability Zone (e.g., <code>us-east-2a</code>). The disk is created in the regional endpoint that you send the
     * HTTP request to. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail"
     * >Regions and Availability Zones in Lightsail</a>.
     * </p>
     * <p>
     * The <code>create disk from snapshot</code> operation supports tag-based access control via request tags and
     * resource tags applied to the resource identified by diskSnapshotName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskFromSnapshotRequest
     * @return A Java Future containing the result of the CreateDiskFromSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDiskFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskFromSnapshotResult> createDiskFromSnapshotAsync(CreateDiskFromSnapshotRequest createDiskFromSnapshotRequest);

    /**
     * <p>
     * Creates a block storage disk from a disk snapshot that can be attached to a Lightsail instance in the same
     * Availability Zone (e.g., <code>us-east-2a</code>). The disk is created in the regional endpoint that you send the
     * HTTP request to. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail"
     * >Regions and Availability Zones in Lightsail</a>.
     * </p>
     * <p>
     * The <code>create disk from snapshot</code> operation supports tag-based access control via request tags and
     * resource tags applied to the resource identified by diskSnapshotName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskFromSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDiskFromSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDiskFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskFromSnapshotResult> createDiskFromSnapshotAsync(CreateDiskFromSnapshotRequest createDiskFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDiskFromSnapshotRequest, CreateDiskFromSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to
     * save data before shutting down a Lightsail instance.
     * </p>
     * <p>
     * You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been
     * written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached
     * by any applications or the operating system. If you can pause any file systems on the disk long enough to take a
     * snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you
     * should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then
     * remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the
     * snapshot status is pending.
     * </p>
     * <p>
     * You can also use this operation to create a snapshot of an instance's system volume. You might want to do this,
     * for example, to recover data from the system volume of a botched instance or to create a backup of the system
     * volume like you would for a block storage disk. To create a snapshot of a system volume, just define the
     * <code>instance name</code> parameter when issuing the snapshot command, and a snapshot of the defined instance's
     * system volume will be created. After the snapshot is available, you can create a block storage disk from the
     * snapshot and attach it to a running instance to access the data on the disk.
     * </p>
     * <p>
     * The <code>create disk snapshot</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskSnapshotRequest
     * @return A Java Future containing the result of the CreateDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskSnapshotResult> createDiskSnapshotAsync(CreateDiskSnapshotRequest createDiskSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to
     * save data before shutting down a Lightsail instance.
     * </p>
     * <p>
     * You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been
     * written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached
     * by any applications or the operating system. If you can pause any file systems on the disk long enough to take a
     * snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you
     * should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then
     * remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the
     * snapshot status is pending.
     * </p>
     * <p>
     * You can also use this operation to create a snapshot of an instance's system volume. You might want to do this,
     * for example, to recover data from the system volume of a botched instance or to create a backup of the system
     * volume like you would for a block storage disk. To create a snapshot of a system volume, just define the
     * <code>instance name</code> parameter when issuing the snapshot command, and a snapshot of the defined instance's
     * system volume will be created. After the snapshot is available, you can create a block storage disk from the
     * snapshot and attach it to a running instance to access the data on the disk.
     * </p>
     * <p>
     * The <code>create disk snapshot</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDiskSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskSnapshotResult> createDiskSnapshotAsync(CreateDiskSnapshotRequest createDiskSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDiskSnapshotRequest, CreateDiskSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates a domain resource for the specified domain (e.g., example.com).
     * </p>
     * <p>
     * The <code>create domain</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a domain resource for the specified domain (e.g., example.com).
     * </p>
     * <p>
     * The <code>create domain</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

    /**
     * <p>
     * Creates one of the following entry records associated with the domain: Address (A), canonical name (CNAME), mail
     * exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The <code>create domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by domainName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDomainEntryRequest
     * @return A Java Future containing the result of the CreateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(CreateDomainEntryRequest createDomainEntryRequest);

    /**
     * <p>
     * Creates one of the following entry records associated with the domain: Address (A), canonical name (CNAME), mail
     * exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The <code>create domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by domainName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createDomainEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(CreateDomainEntryRequest createDomainEntryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainEntryRequest, CreateDomainEntryResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of a specific virtual private server, or <i>instance</i>. You can use a snapshot to create a
     * new instance that is based on that snapshot.
     * </p>
     * <p>
     * The <code>create instance snapshot</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstanceSnapshotRequest
     * @return A Java Future containing the result of the CreateInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CreateInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(CreateInstanceSnapshotRequest createInstanceSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of a specific virtual private server, or <i>instance</i>. You can use a snapshot to create a
     * new instance that is based on that snapshot.
     * </p>
     * <p>
     * The <code>create instance snapshot</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstanceSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(CreateInstanceSnapshotRequest createInstanceSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceSnapshotRequest, CreateInstanceSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates one or more Amazon Lightsail virtual private servers, or <i>instances</i>. Create instances using active
     * blueprints. Inactive blueprints are listed to support customers with existing instances but are not necessarily
     * available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating
     * system updates or new application releases. Use the get blueprints operation to return a list of available
     * blueprints.
     * </p>
     * <p>
     * The <code>create instances</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstancesRequest
     * @return A Java Future containing the result of the CreateInstances operation returned by the service.
     * @sample AmazonLightsailAsync.CreateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(CreateInstancesRequest createInstancesRequest);

    /**
     * <p>
     * Creates one or more Amazon Lightsail virtual private servers, or <i>instances</i>. Create instances using active
     * blueprints. Inactive blueprints are listed to support customers with existing instances but are not necessarily
     * available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating
     * system updates or new application releases. Use the get blueprints operation to return a list of available
     * blueprints.
     * </p>
     * <p>
     * The <code>create instances</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstances operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(CreateInstancesRequest createInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstancesRequest, CreateInstancesResult> asyncHandler);

    /**
     * <p>
     * Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical
     * configuration.
     * </p>
     * <p>
     * The <code>create instances from snapshot</code> operation supports tag-based access control via request tags and
     * resource tags applied to the resource identified by instanceSnapshotName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstancesFromSnapshotRequest
     * @return A Java Future containing the result of the CreateInstancesFromSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CreateInstancesFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstancesFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(
            CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest);

    /**
     * <p>
     * Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical
     * configuration.
     * </p>
     * <p>
     * The <code>create instances from snapshot</code> operation supports tag-based access control via request tags and
     * resource tags applied to the resource identified by instanceSnapshotName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createInstancesFromSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstancesFromSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateInstancesFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstancesFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(
            CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstancesFromSnapshotRequest, CreateInstancesFromSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates an SSH key pair.
     * </p>
     * <p>
     * The <code>create key pair</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createKeyPairRequest
     * @return A Java Future containing the result of the CreateKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest);

    /**
     * <p>
     * Creates an SSH key pair.
     * </p>
     * <p>
     * The <code>create key pair</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeyPairRequest, CreateKeyPairResult> asyncHandler);

    /**
     * <p>
     * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/how-to/article/configure-lightsail-instances-for-load-balancing">
     * Configure your Lightsail instances for load balancing</a>. You can create up to 5 load balancers per AWS Region
     * in your account.
     * </p>
     * <p>
     * When you create a load balancer, you can specify a unique name and port settings. To change additional load
     * balancer settings, use the <code>UpdateLoadBalancerAttribute</code> operation.
     * </p>
     * <p>
     * The <code>create load balancer</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @return A Java Future containing the result of the CreateLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsync.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest);

    /**
     * <p>
     * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/how-to/article/configure-lightsail-instances-for-load-balancing">
     * Configure your Lightsail instances for load balancing</a>. You can create up to 5 load balancers per AWS Region
     * in your account.
     * </p>
     * <p>
     * When you create a load balancer, you can specify a unique name and port settings. To change additional load
     * balancer settings, use the <code>UpdateLoadBalancerAttribute</code> operation.
     * </p>
     * <p>
     * The <code>create load balancer</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Creates a Lightsail load balancer TLS certificate.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * The <code>create load balancer tls certificate</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerTlsCertificateRequest
     * @return A Java Future containing the result of the CreateLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.CreateLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerTlsCertificateResult> createLoadBalancerTlsCertificateAsync(
            CreateLoadBalancerTlsCertificateRequest createLoadBalancerTlsCertificateRequest);

    /**
     * <p>
     * Creates a Lightsail load balancer TLS certificate.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * The <code>create load balancer tls certificate</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerTlsCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.CreateLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerTlsCertificateResult> createLoadBalancerTlsCertificateAsync(
            CreateLoadBalancerTlsCertificateRequest createLoadBalancerTlsCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerTlsCertificateRequest, CreateLoadBalancerTlsCertificateResult> asyncHandler);

    /**
     * <p>
     * Creates a new database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>create relational database</code> operation supports tag-based access control via request tags. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseRequest
     * @return A Java Future containing the result of the CreateRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.CreateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseResult> createRelationalDatabaseAsync(CreateRelationalDatabaseRequest createRelationalDatabaseRequest);

    /**
     * <p>
     * Creates a new database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>create relational database</code> operation supports tag-based access control via request tags. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseResult> createRelationalDatabaseAsync(CreateRelationalDatabaseRequest createRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRelationalDatabaseRequest, CreateRelationalDatabaseResult> asyncHandler);

    /**
     * <p>
     * Creates a new database from an existing database snapshot in Amazon Lightsail.
     * </p>
     * <p>
     * You can create a new database from a snapshot in if something goes wrong with your original database, or to
     * change it to a different plan, such as a high availability or standard plan.
     * </p>
     * <p>
     * The <code>create relational database from snapshot</code> operation supports tag-based access control via request
     * tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseFromSnapshotRequest
     * @return A Java Future containing the result of the CreateRelationalDatabaseFromSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.CreateRelationalDatabaseFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseFromSnapshotResult> createRelationalDatabaseFromSnapshotAsync(
            CreateRelationalDatabaseFromSnapshotRequest createRelationalDatabaseFromSnapshotRequest);

    /**
     * <p>
     * Creates a new database from an existing database snapshot in Amazon Lightsail.
     * </p>
     * <p>
     * You can create a new database from a snapshot in if something goes wrong with your original database, or to
     * change it to a different plan, such as a high availability or standard plan.
     * </p>
     * <p>
     * The <code>create relational database from snapshot</code> operation supports tag-based access control via request
     * tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseFromSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRelationalDatabaseFromSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.CreateRelationalDatabaseFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseFromSnapshotResult> createRelationalDatabaseFromSnapshotAsync(
            CreateRelationalDatabaseFromSnapshotRequest createRelationalDatabaseFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRelationalDatabaseFromSnapshotRequest, CreateRelationalDatabaseFromSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a
     * database, and to save data before deleting a database.
     * </p>
     * <p>
     * The <code>create relational database snapshot</code> operation supports tag-based access control via request
     * tags. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseSnapshotRequest
     * @return A Java Future containing the result of the CreateRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.CreateRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseSnapshotResult> createRelationalDatabaseSnapshotAsync(
            CreateRelationalDatabaseSnapshotRequest createRelationalDatabaseSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a
     * database, and to save data before deleting a database.
     * </p>
     * <p>
     * The <code>create relational database snapshot</code> operation supports tag-based access control via request
     * tags. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.CreateRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseSnapshotResult> createRelationalDatabaseSnapshotAsync(
            CreateRelationalDatabaseSnapshotRequest createRelationalDatabaseSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRelationalDatabaseSnapshotRequest, CreateRelationalDatabaseSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified block storage disk. The disk must be in the <code>available</code> state (not attached to a
     * Lightsail instance).
     * </p>
     * <note>
     * <p>
     * The disk may remain in the <code>deleting</code> state for several minutes.
     * </p>
     * </note>
     * <p>
     * The <code>delete disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by diskName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDiskRequest
     * @return A Java Future containing the result of the DeleteDisk operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDiskResult> deleteDiskAsync(DeleteDiskRequest deleteDiskRequest);

    /**
     * <p>
     * Deletes the specified block storage disk. The disk must be in the <code>available</code> state (not attached to a
     * Lightsail instance).
     * </p>
     * <note>
     * <p>
     * The disk may remain in the <code>deleting</code> state for several minutes.
     * </p>
     * </note>
     * <p>
     * The <code>delete disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by diskName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDiskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDisk operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDiskResult> deleteDiskAsync(DeleteDiskRequest deleteDiskRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDiskRequest, DeleteDiskResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified disk snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that
     * have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data
     * not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all
     * active snapshots will have access to all the information needed to restore the disk.
     * </p>
     * <p>
     * The <code>delete disk snapshot</code> operation supports tag-based access control via resource tags applied to
     * the resource identified by diskSnapshotName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDiskSnapshotRequest
     * @return A Java Future containing the result of the DeleteDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDiskSnapshotResult> deleteDiskSnapshotAsync(DeleteDiskSnapshotRequest deleteDiskSnapshotRequest);

    /**
     * <p>
     * Deletes the specified disk snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that
     * have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data
     * not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all
     * active snapshots will have access to all the information needed to restore the disk.
     * </p>
     * <p>
     * The <code>delete disk snapshot</code> operation supports tag-based access control via resource tags applied to
     * the resource identified by diskSnapshotName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDiskSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDiskSnapshotResult> deleteDiskSnapshotAsync(DeleteDiskSnapshotRequest deleteDiskSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDiskSnapshotRequest, DeleteDiskSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified domain recordset and all of its domain records.
     * </p>
     * <p>
     * The <code>delete domain</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by domainName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes the specified domain recordset and all of its domain records.
     * </p>
     * <p>
     * The <code>delete domain</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by domainName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific domain entry.
     * </p>
     * <p>
     * The <code>delete domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by domainName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDomainEntryRequest
     * @return A Java Future containing the result of the DeleteDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(DeleteDomainEntryRequest deleteDomainEntryRequest);

    /**
     * <p>
     * Deletes a specific domain entry.
     * </p>
     * <p>
     * The <code>delete domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by domainName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteDomainEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(DeleteDomainEntryRequest deleteDomainEntryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainEntryRequest, DeleteDomainEntryResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific Amazon Lightsail virtual private server, or <i>instance</i>.
     * </p>
     * <p>
     * The <code>delete instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest);

    /**
     * <p>
     * Deletes a specific Amazon Lightsail virtual private server, or <i>instance</i>.
     * </p>
     * <p>
     * The <code>delete instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific snapshot of a virtual private server (or <i>instance</i>).
     * </p>
     * <p>
     * The <code>delete instance snapshot</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by instanceSnapshotName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteInstanceSnapshotRequest
     * @return A Java Future containing the result of the DeleteInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest);

    /**
     * <p>
     * Deletes a specific snapshot of a virtual private server (or <i>instance</i>).
     * </p>
     * <p>
     * The <code>delete instance snapshot</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by instanceSnapshotName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteInstanceSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceSnapshotRequest, DeleteInstanceSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific SSH key pair.
     * </p>
     * <p>
     * The <code>delete key pair</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by keyPairName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @return A Java Future containing the result of the DeleteKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest);

    /**
     * <p>
     * Deletes a specific SSH key pair.
     * </p>
     * <p>
     * The <code>delete key pair</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by keyPairName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyPairRequest, DeleteKeyPairResult> asyncHandler);

    /**
     * <p>
     * Deletes the known host key or certificate used by the Amazon Lightsail browser-based SSH or RDP clients to
     * authenticate an instance. This operation enables the Lightsail browser-based SSH or RDP clients to connect to the
     * instance after a host key mismatch.
     * </p>
     * <important>
     * <p>
     * Perform this operation only if you were expecting the host key or certificate mismatch or if you are familiar
     * with the new host key or certificate on the instance. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-troubleshooting-browser-based-ssh-rdp-client-connection"
     * >Troubleshooting connection issues when using the Amazon Lightsail browser-based SSH or RDP client</a>.
     * </p>
     * </important>
     * 
     * @param deleteKnownHostKeysRequest
     * @return A Java Future containing the result of the DeleteKnownHostKeys operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteKnownHostKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKnownHostKeys" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnownHostKeysResult> deleteKnownHostKeysAsync(DeleteKnownHostKeysRequest deleteKnownHostKeysRequest);

    /**
     * <p>
     * Deletes the known host key or certificate used by the Amazon Lightsail browser-based SSH or RDP clients to
     * authenticate an instance. This operation enables the Lightsail browser-based SSH or RDP clients to connect to the
     * instance after a host key mismatch.
     * </p>
     * <important>
     * <p>
     * Perform this operation only if you were expecting the host key or certificate mismatch or if you are familiar
     * with the new host key or certificate on the instance. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-troubleshooting-browser-based-ssh-rdp-client-connection"
     * >Troubleshooting connection issues when using the Amazon Lightsail browser-based SSH or RDP client</a>.
     * </p>
     * </important>
     * 
     * @param deleteKnownHostKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKnownHostKeys operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteKnownHostKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKnownHostKeys" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnownHostKeysResult> deleteKnownHostKeysAsync(DeleteKnownHostKeysRequest deleteKnownHostKeysRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKnownHostKeysRequest, DeleteKnownHostKeysResult> asyncHandler);

    /**
     * <p>
     * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted,
     * you will need to create a new load balancer, create a new certificate, and verify domain ownership again.
     * </p>
     * <p>
     * The <code>delete load balancer</code> operation supports tag-based access control via resource tags applied to
     * the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @return A Java Future containing the result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest);

    /**
     * <p>
     * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted,
     * you will need to create a new load balancer, create a new certificate, and verify domain ownership again.
     * </p>
     * <p>
     * The <code>delete load balancer</code> operation supports tag-based access control via resource tags applied to
     * the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Deletes an SSL/TLS certificate associated with a Lightsail load balancer.
     * </p>
     * <p>
     * The <code>delete load balancer tls certificate</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerTlsCertificateRequest
     * @return A Java Future containing the result of the DeleteLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.DeleteLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerTlsCertificateResult> deleteLoadBalancerTlsCertificateAsync(
            DeleteLoadBalancerTlsCertificateRequest deleteLoadBalancerTlsCertificateRequest);

    /**
     * <p>
     * Deletes an SSL/TLS certificate associated with a Lightsail load balancer.
     * </p>
     * <p>
     * The <code>delete load balancer tls certificate</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerTlsCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.DeleteLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerTlsCertificateResult> deleteLoadBalancerTlsCertificateAsync(
            DeleteLoadBalancerTlsCertificateRequest deleteLoadBalancerTlsCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerTlsCertificateRequest, DeleteLoadBalancerTlsCertificateResult> asyncHandler);

    /**
     * <p>
     * Deletes a database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseRequest
     * @return A Java Future containing the result of the DeleteRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRelationalDatabaseResult> deleteRelationalDatabaseAsync(DeleteRelationalDatabaseRequest deleteRelationalDatabaseRequest);

    /**
     * <p>
     * Deletes a database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRelationalDatabaseResult> deleteRelationalDatabaseAsync(DeleteRelationalDatabaseRequest deleteRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRelationalDatabaseRequest, DeleteRelationalDatabaseResult> asyncHandler);

    /**
     * <p>
     * Deletes a database snapshot in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database snapshot</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseSnapshotRequest
     * @return A Java Future containing the result of the DeleteRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.DeleteRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRelationalDatabaseSnapshotResult> deleteRelationalDatabaseSnapshotAsync(
            DeleteRelationalDatabaseSnapshotRequest deleteRelationalDatabaseSnapshotRequest);

    /**
     * <p>
     * Deletes a database snapshot in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database snapshot</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.DeleteRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRelationalDatabaseSnapshotResult> deleteRelationalDatabaseSnapshotAsync(
            DeleteRelationalDatabaseSnapshotRequest deleteRelationalDatabaseSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRelationalDatabaseSnapshotRequest, DeleteRelationalDatabaseSnapshotResult> asyncHandler);

    /**
     * <p>
     * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the
     * device within your operating system before stopping the instance and detaching the disk.
     * </p>
     * <p>
     * The <code>detach disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by diskName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param detachDiskRequest
     * @return A Java Future containing the result of the DetachDisk operation returned by the service.
     * @sample AmazonLightsailAsync.DetachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachDiskResult> detachDiskAsync(DetachDiskRequest detachDiskRequest);

    /**
     * <p>
     * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the
     * device within your operating system before stopping the instance and detaching the disk.
     * </p>
     * <p>
     * The <code>detach disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by diskName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param detachDiskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachDisk operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DetachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachDiskResult> detachDiskAsync(DetachDiskRequest detachDiskRequest,
            com.amazonaws.handlers.AsyncHandler<DetachDiskRequest, DetachDiskResult> asyncHandler);

    /**
     * <p>
     * Detaches the specified instances from a Lightsail load balancer.
     * </p>
     * <p>
     * This operation waits until the instances are no longer needed before they are detached from the load balancer.
     * </p>
     * <p>
     * The <code>detach instances from load balancer</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param detachInstancesFromLoadBalancerRequest
     * @return A Java Future containing the result of the DetachInstancesFromLoadBalancer operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.DetachInstancesFromLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachInstancesFromLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachInstancesFromLoadBalancerResult> detachInstancesFromLoadBalancerAsync(
            DetachInstancesFromLoadBalancerRequest detachInstancesFromLoadBalancerRequest);

    /**
     * <p>
     * Detaches the specified instances from a Lightsail load balancer.
     * </p>
     * <p>
     * This operation waits until the instances are no longer needed before they are detached from the load balancer.
     * </p>
     * <p>
     * The <code>detach instances from load balancer</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param detachInstancesFromLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachInstancesFromLoadBalancer operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.DetachInstancesFromLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachInstancesFromLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachInstancesFromLoadBalancerResult> detachInstancesFromLoadBalancerAsync(
            DetachInstancesFromLoadBalancerRequest detachInstancesFromLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DetachInstancesFromLoadBalancerRequest, DetachInstancesFromLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @return A Java Future containing the result of the DetachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.DetachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(DetachStaticIpRequest detachStaticIpRequest);

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DetachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(DetachStaticIpRequest detachStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<DetachStaticIpRequest, DetachStaticIpResult> asyncHandler);

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @return A Java Future containing the result of the DownloadDefaultKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.DownloadDefaultKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DownloadDefaultKeyPair"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest);

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DownloadDefaultKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DownloadDefaultKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DownloadDefaultKeyPair"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<DownloadDefaultKeyPairRequest, DownloadDefaultKeyPairResult> asyncHandler);

    /**
     * <p>
     * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2).
     * This operation results in an export snapshot record that can be used with the
     * <code>create cloud formation stack</code> operation to create new Amazon EC2 instances.
     * </p>
     * <p>
     * Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk
     * appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as
     * Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source
     * Lightsail snapshot.
     * </p>
     * <p/>
     * <p>
     * The <code>export snapshot</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by sourceSnapshotName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * <note>
     * <p>
     * Use the <code>get instance snapshots</code> or <code>get disk snapshots</code> operations to get a list of
     * snapshots that you can export to Amazon EC2.
     * </p>
     * </note>
     * 
     * @param exportSnapshotRequest
     * @return A Java Future containing the result of the ExportSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.ExportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ExportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportSnapshotResult> exportSnapshotAsync(ExportSnapshotRequest exportSnapshotRequest);

    /**
     * <p>
     * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2).
     * This operation results in an export snapshot record that can be used with the
     * <code>create cloud formation stack</code> operation to create new Amazon EC2 instances.
     * </p>
     * <p>
     * Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk
     * appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as
     * Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source
     * Lightsail snapshot.
     * </p>
     * <p/>
     * <p>
     * The <code>export snapshot</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by sourceSnapshotName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * <note>
     * <p>
     * Use the <code>get instance snapshots</code> or <code>get disk snapshots</code> operations to get a list of
     * snapshots that you can export to Amazon EC2.
     * </p>
     * </note>
     * 
     * @param exportSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.ExportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ExportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportSnapshotResult> exportSnapshotAsync(ExportSnapshotRequest exportSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<ExportSnapshotRequest, ExportSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @return A Java Future containing the result of the GetActiveNames operation returned by the service.
     * @sample AmazonLightsailAsync.GetActiveNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetActiveNames" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(GetActiveNamesRequest getActiveNamesRequest);

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetActiveNames operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetActiveNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetActiveNames" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(GetActiveNamesRequest getActiveNamesRequest,
            com.amazonaws.handlers.AsyncHandler<GetActiveNamesRequest, GetActiveNamesResult> asyncHandler);

    /**
     * <p>
     * Returns the list of available instance images, or <i>blueprints</i>. You can use a blueprint to create a new
     * virtual private server already running a specific operating system, as well as a preinstalled app or development
     * stack. The software each instance is running depends on the blueprint image you choose.
     * </p>
     * 
     * @param getBlueprintsRequest
     * @return A Java Future containing the result of the GetBlueprints operation returned by the service.
     * @sample AmazonLightsailAsync.GetBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBlueprints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(GetBlueprintsRequest getBlueprintsRequest);

    /**
     * <p>
     * Returns the list of available instance images, or <i>blueprints</i>. You can use a blueprint to create a new
     * virtual private server already running a specific operating system, as well as a preinstalled app or development
     * stack. The software each instance is running depends on the blueprint image you choose.
     * </p>
     * 
     * @param getBlueprintsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBlueprints operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBlueprints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(GetBlueprintsRequest getBlueprintsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBlueprintsRequest, GetBlueprintsResult> asyncHandler);

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
     * private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @return A Java Future containing the result of the GetBundles operation returned by the service.
     * @sample AmazonLightsailAsync.GetBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBundles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(GetBundlesRequest getBundlesRequest);

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
     * private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBundles operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBundles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(GetBundlesRequest getBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<GetBundlesRequest, GetBundlesResult> asyncHandler);

    /**
     * <p>
     * Returns the CloudFormation stack record created as a result of the <code>create cloud formation stack</code>
     * operation.
     * </p>
     * <p>
     * An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.
     * </p>
     * 
     * @param getCloudFormationStackRecordsRequest
     * @return A Java Future containing the result of the GetCloudFormationStackRecords operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetCloudFormationStackRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCloudFormationStackRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCloudFormationStackRecordsResult> getCloudFormationStackRecordsAsync(
            GetCloudFormationStackRecordsRequest getCloudFormationStackRecordsRequest);

    /**
     * <p>
     * Returns the CloudFormation stack record created as a result of the <code>create cloud formation stack</code>
     * operation.
     * </p>
     * <p>
     * An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.
     * </p>
     * 
     * @param getCloudFormationStackRecordsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCloudFormationStackRecords operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetCloudFormationStackRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCloudFormationStackRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCloudFormationStackRecordsResult> getCloudFormationStackRecordsAsync(
            GetCloudFormationStackRecordsRequest getCloudFormationStackRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCloudFormationStackRecordsRequest, GetCloudFormationStackRecordsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific block storage disk.
     * </p>
     * 
     * @param getDiskRequest
     * @return A Java Future containing the result of the GetDisk operation returned by the service.
     * @sample AmazonLightsailAsync.GetDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskResult> getDiskAsync(GetDiskRequest getDiskRequest);

    /**
     * <p>
     * Returns information about a specific block storage disk.
     * </p>
     * 
     * @param getDiskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDisk operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskResult> getDiskAsync(GetDiskRequest getDiskRequest,
            com.amazonaws.handlers.AsyncHandler<GetDiskRequest, GetDiskResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific block storage disk snapshot.
     * </p>
     * 
     * @param getDiskSnapshotRequest
     * @return A Java Future containing the result of the GetDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.GetDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskSnapshotResult> getDiskSnapshotAsync(GetDiskSnapshotRequest getDiskSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific block storage disk snapshot.
     * </p>
     * 
     * @param getDiskSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskSnapshotResult> getDiskSnapshotAsync(GetDiskSnapshotRequest getDiskSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetDiskSnapshotRequest, GetDiskSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns information about all block storage disk snapshots in your AWS account and region.
     * </p>
     * <p>
     * If you are describing a long list of disk snapshots, you can paginate the output to make the list more
     * manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
     * </p>
     * 
     * @param getDiskSnapshotsRequest
     * @return A Java Future containing the result of the GetDiskSnapshots operation returned by the service.
     * @sample AmazonLightsailAsync.GetDiskSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskSnapshotsResult> getDiskSnapshotsAsync(GetDiskSnapshotsRequest getDiskSnapshotsRequest);

    /**
     * <p>
     * Returns information about all block storage disk snapshots in your AWS account and region.
     * </p>
     * <p>
     * If you are describing a long list of disk snapshots, you can paginate the output to make the list more
     * manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
     * </p>
     * 
     * @param getDiskSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDiskSnapshots operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDiskSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskSnapshotsResult> getDiskSnapshotsAsync(GetDiskSnapshotsRequest getDiskSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDiskSnapshotsRequest, GetDiskSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns information about all block storage disks in your AWS account and region.
     * </p>
     * <p>
     * If you are describing a long list of disks, you can paginate the output to make the list more manageable. You can
     * use the pageToken and nextPageToken values to retrieve the next items in the list.
     * </p>
     * 
     * @param getDisksRequest
     * @return A Java Future containing the result of the GetDisks operation returned by the service.
     * @sample AmazonLightsailAsync.GetDisks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDisksResult> getDisksAsync(GetDisksRequest getDisksRequest);

    /**
     * <p>
     * Returns information about all block storage disks in your AWS account and region.
     * </p>
     * <p>
     * If you are describing a long list of disks, you can paginate the output to make the list more manageable. You can
     * use the pageToken and nextPageToken values to retrieve the next items in the list.
     * </p>
     * 
     * @param getDisksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDisks operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDisks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDisksResult> getDisksAsync(GetDisksRequest getDisksRequest,
            com.amazonaws.handlers.AsyncHandler<GetDisksRequest, GetDisksResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonLightsailAsync.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @return A Java Future containing the result of the GetDomains operation returned by the service.
     * @sample AmazonLightsailAsync.GetDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(GetDomainsRequest getDomainsRequest);

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomains operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(GetDomainsRequest getDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainsRequest, GetDomainsResult> asyncHandler);

    /**
     * <p>
     * Returns the export snapshot record created as a result of the <code>export snapshot</code> operation.
     * </p>
     * <p>
     * An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the
     * <code>create cloud formation stack</code> operation.
     * </p>
     * 
     * @param getExportSnapshotRecordsRequest
     * @return A Java Future containing the result of the GetExportSnapshotRecords operation returned by the service.
     * @sample AmazonLightsailAsync.GetExportSnapshotRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetExportSnapshotRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetExportSnapshotRecordsResult> getExportSnapshotRecordsAsync(GetExportSnapshotRecordsRequest getExportSnapshotRecordsRequest);

    /**
     * <p>
     * Returns the export snapshot record created as a result of the <code>export snapshot</code> operation.
     * </p>
     * <p>
     * An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the
     * <code>create cloud formation stack</code> operation.
     * </p>
     * 
     * @param getExportSnapshotRecordsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExportSnapshotRecords operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetExportSnapshotRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetExportSnapshotRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetExportSnapshotRecordsResult> getExportSnapshotRecordsAsync(GetExportSnapshotRecordsRequest getExportSnapshotRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<GetExportSnapshotRecordsRequest, GetExportSnapshotRecordsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @return A Java Future containing the result of the GetInstance operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest getInstanceRequest);

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest getInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceRequest, GetInstanceResult> asyncHandler);

    /**
     * <p>
     * Returns temporary SSH keys you can use to connect to a specific virtual private server, or <i>instance</i>.
     * </p>
     * <p>
     * The <code>get instance access details</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param getInstanceAccessDetailsRequest
     * @return A Java Future containing the result of the GetInstanceAccessDetails operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest);

    /**
     * <p>
     * Returns temporary SSH keys you can use to connect to a specific virtual private server, or <i>instance</i>.
     * </p>
     * <p>
     * The <code>get instance access details</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param getInstanceAccessDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceAccessDetails operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceAccessDetailsRequest, GetInstanceAccessDetailsResult> asyncHandler);

    /**
     * <p>
     * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
     * </p>
     * 
     * @param getInstanceMetricDataRequest
     * @return A Java Future containing the result of the GetInstanceMetricData operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(GetInstanceMetricDataRequest getInstanceMetricDataRequest);

    /**
     * <p>
     * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
     * </p>
     * 
     * @param getInstanceMetricDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceMetricData operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(GetInstanceMetricDataRequest getInstanceMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceMetricDataRequest, GetInstanceMetricDataResult> asyncHandler);

    /**
     * <p>
     * Returns the port states for a specific virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @return A Java Future containing the result of the GetInstancePortStates operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstancePortStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstancePortStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(GetInstancePortStatesRequest getInstancePortStatesRequest);

    /**
     * <p>
     * Returns the port states for a specific virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstancePortStates operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstancePortStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstancePortStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(GetInstancePortStatesRequest getInstancePortStatesRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstancePortStatesRequest, GetInstancePortStatesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @return A Java Future containing the result of the GetInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(GetInstanceSnapshotRequest getInstanceSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(GetInstanceSnapshotRequest getInstanceSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotRequest, GetInstanceSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @return A Java Future containing the result of the GetInstanceSnapshots operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(GetInstanceSnapshotsRequest getInstanceSnapshotsRequest);

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceSnapshots operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(GetInstanceSnapshotsRequest getInstanceSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotsRequest, GetInstanceSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @return A Java Future containing the result of the GetInstanceState operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceState" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(GetInstanceStateRequest getInstanceStateRequest);

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceState operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceState" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(GetInstanceStateRequest getInstanceStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceStateRequest, GetInstanceStateResult> asyncHandler);

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @return A Java Future containing the result of the GetInstances operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(GetInstancesRequest getInstancesRequest);

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstances operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(GetInstancesRequest getInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstancesRequest, GetInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @return A Java Future containing the result of the GetKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.GetKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(GetKeyPairRequest getKeyPairRequest);

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(GetKeyPairRequest getKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyPairRequest, GetKeyPairResult> asyncHandler);

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @return A Java Future containing the result of the GetKeyPairs operation returned by the service.
     * @sample AmazonLightsailAsync.GetKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(GetKeyPairsRequest getKeyPairsRequest);

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyPairs operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(GetKeyPairsRequest getKeyPairsRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyPairsRequest, GetKeyPairsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified Lightsail load balancer.
     * </p>
     * 
     * @param getLoadBalancerRequest
     * @return A Java Future containing the result of the GetLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsync.GetLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerResult> getLoadBalancerAsync(GetLoadBalancerRequest getLoadBalancerRequest);

    /**
     * <p>
     * Returns information about the specified Lightsail load balancer.
     * </p>
     * 
     * @param getLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerResult> getLoadBalancerAsync(GetLoadBalancerRequest getLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoadBalancerRequest, GetLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Returns information about health metrics for your Lightsail load balancer.
     * </p>
     * 
     * @param getLoadBalancerMetricDataRequest
     * @return A Java Future containing the result of the GetLoadBalancerMetricData operation returned by the service.
     * @sample AmazonLightsailAsync.GetLoadBalancerMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerMetricDataResult> getLoadBalancerMetricDataAsync(
            GetLoadBalancerMetricDataRequest getLoadBalancerMetricDataRequest);

    /**
     * <p>
     * Returns information about health metrics for your Lightsail load balancer.
     * </p>
     * 
     * @param getLoadBalancerMetricDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoadBalancerMetricData operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetLoadBalancerMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerMetricDataResult> getLoadBalancerMetricDataAsync(
            GetLoadBalancerMetricDataRequest getLoadBalancerMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoadBalancerMetricDataRequest, GetLoadBalancerMetricDataResult> asyncHandler);

    /**
     * <p>
     * Returns information about the TLS certificates that are associated with the specified Lightsail load balancer.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other
     * is inactive.
     * </p>
     * 
     * @param getLoadBalancerTlsCertificatesRequest
     * @return A Java Future containing the result of the GetLoadBalancerTlsCertificates operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetLoadBalancerTlsCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerTlsCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerTlsCertificatesResult> getLoadBalancerTlsCertificatesAsync(
            GetLoadBalancerTlsCertificatesRequest getLoadBalancerTlsCertificatesRequest);

    /**
     * <p>
     * Returns information about the TLS certificates that are associated with the specified Lightsail load balancer.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other
     * is inactive.
     * </p>
     * 
     * @param getLoadBalancerTlsCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoadBalancerTlsCertificates operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetLoadBalancerTlsCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerTlsCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerTlsCertificatesResult> getLoadBalancerTlsCertificatesAsync(
            GetLoadBalancerTlsCertificatesRequest getLoadBalancerTlsCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoadBalancerTlsCertificatesRequest, GetLoadBalancerTlsCertificatesResult> asyncHandler);

    /**
     * <p>
     * Returns information about all load balancers in an account.
     * </p>
     * <p>
     * If you are describing a long list of load balancers, you can paginate the output to make the list more
     * manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
     * </p>
     * 
     * @param getLoadBalancersRequest
     * @return A Java Future containing the result of the GetLoadBalancers operation returned by the service.
     * @sample AmazonLightsailAsync.GetLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancersResult> getLoadBalancersAsync(GetLoadBalancersRequest getLoadBalancersRequest);

    /**
     * <p>
     * Returns information about all load balancers in an account.
     * </p>
     * <p>
     * If you are describing a long list of load balancers, you can paginate the output to make the list more
     * manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
     * </p>
     * 
     * @param getLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoadBalancers operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancersResult> getLoadBalancersAsync(GetLoadBalancersRequest getLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoadBalancersRequest, GetLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific operation. Operations include events such as when you create an instance,
     * allocate a static IP, attach a static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @return A Java Future containing the result of the GetOperation operation returned by the service.
     * @sample AmazonLightsailAsync.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest getOperationRequest);

    /**
     * <p>
     * Returns information about a specific operation. Operations include events such as when you create an instance,
     * allocate a static IP, attach a static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperation operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest getOperationRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler);

    /**
     * <p>
     * Returns information about all operations.
     * </p>
     * <p>
     * Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each
     * subsequent call to <code>GetOperations</code> use the maximum (last) <code>statusChangedAt</code> value from the
     * previous request.
     * </p>
     * 
     * @param getOperationsRequest
     * @return A Java Future containing the result of the GetOperations operation returned by the service.
     * @sample AmazonLightsailAsync.GetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(GetOperationsRequest getOperationsRequest);

    /**
     * <p>
     * Returns information about all operations.
     * </p>
     * <p>
     * Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each
     * subsequent call to <code>GetOperations</code> use the maximum (last) <code>statusChangedAt</code> value from the
     * previous request.
     * </p>
     * 
     * @param getOperationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperations operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(GetOperationsRequest getOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationsRequest, GetOperationsResult> asyncHandler);

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @return A Java Future containing the result of the GetOperationsForResource operation returned by the service.
     * @sample AmazonLightsailAsync.GetOperationsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(GetOperationsForResourceRequest getOperationsForResourceRequest);

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperationsForResource operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetOperationsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(GetOperationsForResourceRequest getOperationsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationsForResourceRequest, GetOperationsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail. Use the <code>include availability zones</code>
     * parameter to also return the Availability Zones in a region.
     * </p>
     * 
     * @param getRegionsRequest
     * @return A Java Future containing the result of the GetRegions operation returned by the service.
     * @sample AmazonLightsailAsync.GetRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRegions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(GetRegionsRequest getRegionsRequest);

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail. Use the <code>include availability zones</code>
     * parameter to also return the Availability Zones in a region.
     * </p>
     * 
     * @param getRegionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegions operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRegions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(GetRegionsRequest getRegionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegionsRequest, GetRegionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseRequest
     * @return A Java Future containing the result of the GetRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.GetRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseResult> getRelationalDatabaseAsync(GetRelationalDatabaseRequest getRelationalDatabaseRequest);

    /**
     * <p>
     * Returns information about a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseResult> getRelationalDatabaseAsync(GetRelationalDatabaseRequest getRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseRequest, GetRelationalDatabaseResult> asyncHandler);

    /**
     * <p>
     * Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine
     * version of a database.
     * </p>
     * <p>
     * You can use a blueprint ID to create a new database that runs a specific database engine.
     * </p>
     * 
     * @param getRelationalDatabaseBlueprintsRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseBlueprints operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBlueprints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseBlueprintsResult> getRelationalDatabaseBlueprintsAsync(
            GetRelationalDatabaseBlueprintsRequest getRelationalDatabaseBlueprintsRequest);

    /**
     * <p>
     * Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine
     * version of a database.
     * </p>
     * <p>
     * You can use a blueprint ID to create a new database that runs a specific database engine.
     * </p>
     * 
     * @param getRelationalDatabaseBlueprintsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseBlueprints operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBlueprints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseBlueprintsResult> getRelationalDatabaseBlueprintsAsync(
            GetRelationalDatabaseBlueprintsRequest getRelationalDatabaseBlueprintsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseBlueprintsRequest, GetRelationalDatabaseBlueprintsResult> asyncHandler);

    /**
     * <p>
     * Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance
     * specifications for a database.
     * </p>
     * <p>
     * You can use a bundle ID to create a new database with explicit performance specifications.
     * </p>
     * 
     * @param getRelationalDatabaseBundlesRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseBundles operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBundles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseBundlesResult> getRelationalDatabaseBundlesAsync(
            GetRelationalDatabaseBundlesRequest getRelationalDatabaseBundlesRequest);

    /**
     * <p>
     * Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance
     * specifications for a database.
     * </p>
     * <p>
     * You can use a bundle ID to create a new database with explicit performance specifications.
     * </p>
     * 
     * @param getRelationalDatabaseBundlesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseBundles operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBundles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseBundlesResult> getRelationalDatabaseBundlesAsync(
            GetRelationalDatabaseBundlesRequest getRelationalDatabaseBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseBundlesRequest, GetRelationalDatabaseBundlesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of events for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseEventsRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseEvents operation returned by the service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseEventsResult> getRelationalDatabaseEventsAsync(
            GetRelationalDatabaseEventsRequest getRelationalDatabaseEventsRequest);

    /**
     * <p>
     * Returns a list of events for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseEvents operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseEventsResult> getRelationalDatabaseEventsAsync(
            GetRelationalDatabaseEventsRequest getRelationalDatabaseEventsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseEventsRequest, GetRelationalDatabaseEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of log events for a database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogEventsRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseLogEvents operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseLogEventsResult> getRelationalDatabaseLogEventsAsync(
            GetRelationalDatabaseLogEventsRequest getRelationalDatabaseLogEventsRequest);

    /**
     * <p>
     * Returns a list of log events for a database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseLogEvents operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseLogEventsResult> getRelationalDatabaseLogEventsAsync(
            GetRelationalDatabaseLogEventsRequest getRelationalDatabaseLogEventsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseLogEventsRequest, GetRelationalDatabaseLogEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of available log streams for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogStreamsRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseLogStreams operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseLogStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogStreams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseLogStreamsResult> getRelationalDatabaseLogStreamsAsync(
            GetRelationalDatabaseLogStreamsRequest getRelationalDatabaseLogStreamsRequest);

    /**
     * <p>
     * Returns a list of available log streams for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseLogStreams operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseLogStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogStreams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseLogStreamsResult> getRelationalDatabaseLogStreamsAsync(
            GetRelationalDatabaseLogStreamsRequest getRelationalDatabaseLogStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseLogStreamsRequest, GetRelationalDatabaseLogStreamsResult> asyncHandler);

    /**
     * <p>
     * Returns the current, previous, or pending versions of the master user password for a Lightsail database.
     * </p>
     * <p>
     * The <code>asdf</code> operation GetRelationalDatabaseMasterUserPassword supports tag-based access control via
     * resource tags applied to the resource identified by relationalDatabaseName.
     * </p>
     * 
     * @param getRelationalDatabaseMasterUserPasswordRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseMasterUserPassword operation returned by
     *         the service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseMasterUserPassword
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMasterUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseMasterUserPasswordResult> getRelationalDatabaseMasterUserPasswordAsync(
            GetRelationalDatabaseMasterUserPasswordRequest getRelationalDatabaseMasterUserPasswordRequest);

    /**
     * <p>
     * Returns the current, previous, or pending versions of the master user password for a Lightsail database.
     * </p>
     * <p>
     * The <code>asdf</code> operation GetRelationalDatabaseMasterUserPassword supports tag-based access control via
     * resource tags applied to the resource identified by relationalDatabaseName.
     * </p>
     * 
     * @param getRelationalDatabaseMasterUserPasswordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseMasterUserPassword operation returned by
     *         the service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseMasterUserPassword
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMasterUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseMasterUserPasswordResult> getRelationalDatabaseMasterUserPasswordAsync(
            GetRelationalDatabaseMasterUserPasswordRequest getRelationalDatabaseMasterUserPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseMasterUserPasswordRequest, GetRelationalDatabaseMasterUserPasswordResult> asyncHandler);

    /**
     * <p>
     * Returns the data points of the specified metric for a database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseMetricDataRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseMetricData operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseMetricDataResult> getRelationalDatabaseMetricDataAsync(
            GetRelationalDatabaseMetricDataRequest getRelationalDatabaseMetricDataRequest);

    /**
     * <p>
     * Returns the data points of the specified metric for a database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseMetricDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseMetricData operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseMetricDataResult> getRelationalDatabaseMetricDataAsync(
            GetRelationalDatabaseMetricDataRequest getRelationalDatabaseMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseMetricDataRequest, GetRelationalDatabaseMetricDataResult> asyncHandler);

    /**
     * <p>
     * Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific
     * database in Amazon Lightsail.
     * </p>
     * <p>
     * In addition to the parameter names and values, this operation returns other information about each parameter.
     * This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed
     * values, and the data types.
     * </p>
     * 
     * @param getRelationalDatabaseParametersRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseParameters operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseParametersResult> getRelationalDatabaseParametersAsync(
            GetRelationalDatabaseParametersRequest getRelationalDatabaseParametersRequest);

    /**
     * <p>
     * Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific
     * database in Amazon Lightsail.
     * </p>
     * <p>
     * In addition to the parameter names and values, this operation returns other information about each parameter.
     * This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed
     * values, and the data types.
     * </p>
     * 
     * @param getRelationalDatabaseParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseParameters operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseParametersResult> getRelationalDatabaseParametersAsync(
            GetRelationalDatabaseParametersRequest getRelationalDatabaseParametersRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseParametersRequest, GetRelationalDatabaseParametersResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific database snapshot in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseSnapshotResult> getRelationalDatabaseSnapshotAsync(
            GetRelationalDatabaseSnapshotRequest getRelationalDatabaseSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific database snapshot in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseSnapshotResult> getRelationalDatabaseSnapshotAsync(
            GetRelationalDatabaseSnapshotRequest getRelationalDatabaseSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseSnapshotRequest, GetRelationalDatabaseSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns information about all of your database snapshots in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotsRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseSnapshots operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseSnapshotsResult> getRelationalDatabaseSnapshotsAsync(
            GetRelationalDatabaseSnapshotsRequest getRelationalDatabaseSnapshotsRequest);

    /**
     * <p>
     * Returns information about all of your database snapshots in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseSnapshots operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseSnapshotsResult> getRelationalDatabaseSnapshotsAsync(
            GetRelationalDatabaseSnapshotsRequest getRelationalDatabaseSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseSnapshotsRequest, GetRelationalDatabaseSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns information about all of your databases in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabasesRequest
     * @return A Java Future containing the result of the GetRelationalDatabases operation returned by the service.
     * @sample AmazonLightsailAsync.GetRelationalDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabasesResult> getRelationalDatabasesAsync(GetRelationalDatabasesRequest getRelationalDatabasesRequest);

    /**
     * <p>
     * Returns information about all of your databases in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabases operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabasesResult> getRelationalDatabasesAsync(GetRelationalDatabasesRequest getRelationalDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabasesRequest, GetRelationalDatabasesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @return A Java Future containing the result of the GetStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.GetStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(GetStaticIpRequest getStaticIpRequest);

    /**
     * <p>
     * Returns information about a specific static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(GetStaticIpRequest getStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<GetStaticIpRequest, GetStaticIpResult> asyncHandler);

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @return A Java Future containing the result of the GetStaticIps operation returned by the service.
     * @sample AmazonLightsailAsync.GetStaticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(GetStaticIpsRequest getStaticIpsRequest);

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStaticIps operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetStaticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(GetStaticIpsRequest getStaticIpsRequest,
            com.amazonaws.handlers.AsyncHandler<GetStaticIpsRequest, GetStaticIpsResult> asyncHandler);

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return A Java Future containing the result of the ImportKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest importKeyPairRequest);

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest importKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler);

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @return A Java Future containing the result of the IsVpcPeered operation returned by the service.
     * @sample AmazonLightsailAsync.IsVpcPeered
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/IsVpcPeered" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(IsVpcPeeredRequest isVpcPeeredRequest);

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IsVpcPeered operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.IsVpcPeered
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/IsVpcPeered" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(IsVpcPeeredRequest isVpcPeeredRequest,
            com.amazonaws.handlers.AsyncHandler<IsVpcPeeredRequest, IsVpcPeeredResult> asyncHandler);

    /**
     * <p>
     * Adds public ports to an Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>open instance public ports</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param openInstancePublicPortsRequest
     * @return A Java Future containing the result of the OpenInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsync.OpenInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/OpenInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(OpenInstancePublicPortsRequest openInstancePublicPortsRequest);

    /**
     * <p>
     * Adds public ports to an Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>open instance public ports</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param openInstancePublicPortsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the OpenInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.OpenInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/OpenInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(OpenInstancePublicPortsRequest openInstancePublicPortsRequest,
            com.amazonaws.handlers.AsyncHandler<OpenInstancePublicPortsRequest, OpenInstancePublicPortsResult> asyncHandler);

    /**
     * <p>
     * Tries to peer the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @return A Java Future containing the result of the PeerVpc operation returned by the service.
     * @sample AmazonLightsailAsync.PeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(PeerVpcRequest peerVpcRequest);

    /**
     * <p>
     * Tries to peer the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PeerVpc operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.PeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(PeerVpcRequest peerVpcRequest,
            com.amazonaws.handlers.AsyncHandler<PeerVpcRequest, PeerVpcResult> asyncHandler);

    /**
     * <p>
     * Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not
     * included in the current request.
     * </p>
     * <p>
     * The <code>put instance public ports</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param putInstancePublicPortsRequest
     * @return A Java Future containing the result of the PutInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsync.PutInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutInstancePublicPortsResult> putInstancePublicPortsAsync(PutInstancePublicPortsRequest putInstancePublicPortsRequest);

    /**
     * <p>
     * Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not
     * included in the current request.
     * </p>
     * <p>
     * The <code>put instance public ports</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param putInstancePublicPortsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.PutInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutInstancePublicPortsResult> putInstancePublicPortsAsync(PutInstancePublicPortsRequest putInstancePublicPortsRequest,
            com.amazonaws.handlers.AsyncHandler<PutInstancePublicPortsRequest, PutInstancePublicPortsResult> asyncHandler);

    /**
     * <p>
     * Restarts a specific instance.
     * </p>
     * <p>
     * The <code>reboot instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @return A Java Future containing the result of the RebootInstance operation returned by the service.
     * @sample AmazonLightsailAsync.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest rebootInstanceRequest);

    /**
     * <p>
     * Restarts a specific instance.
     * </p>
     * <p>
     * The <code>reboot instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest rebootInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, RebootInstanceResult> asyncHandler);

    /**
     * <p>
     * Restarts a specific database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>reboot relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param rebootRelationalDatabaseRequest
     * @return A Java Future containing the result of the RebootRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.RebootRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RebootRelationalDatabaseResult> rebootRelationalDatabaseAsync(RebootRelationalDatabaseRequest rebootRelationalDatabaseRequest);

    /**
     * <p>
     * Restarts a specific database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>reboot relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param rebootRelationalDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.RebootRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RebootRelationalDatabaseResult> rebootRelationalDatabaseAsync(RebootRelationalDatabaseRequest rebootRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<RebootRelationalDatabaseRequest, RebootRelationalDatabaseResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @return A Java Future containing the result of the ReleaseStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.ReleaseStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ReleaseStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(ReleaseStaticIpRequest releaseStaticIpRequest);

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReleaseStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.ReleaseStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ReleaseStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(ReleaseStaticIpRequest releaseStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<ReleaseStaticIpRequest, ReleaseStaticIpResult> asyncHandler);

    /**
     * <p>
     * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the
     * <code>reboot instance</code> operation.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
     * address after stopping and starting an instance, create a static IP address and attach it to the instance. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/lightsail-create-static-ip">Lightsail Dev Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>start instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @return A Java Future containing the result of the StartInstance operation returned by the service.
     * @sample AmazonLightsailAsync.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest startInstanceRequest);

    /**
     * <p>
     * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the
     * <code>reboot instance</code> operation.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
     * address after stopping and starting an instance, create a static IP address and attach it to the instance. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/lightsail-create-static-ip">Lightsail Dev Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>start instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest startInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, StartInstanceResult> asyncHandler);

    /**
     * <p>
     * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the
     * <code>reboot relational database</code> operation.
     * </p>
     * <p>
     * The <code>start relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param startRelationalDatabaseRequest
     * @return A Java Future containing the result of the StartRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.StartRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartRelationalDatabaseResult> startRelationalDatabaseAsync(StartRelationalDatabaseRequest startRelationalDatabaseRequest);

    /**
     * <p>
     * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the
     * <code>reboot relational database</code> operation.
     * </p>
     * <p>
     * The <code>start relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param startRelationalDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.StartRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartRelationalDatabaseResult> startRelationalDatabaseAsync(StartRelationalDatabaseRequest startRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<StartRelationalDatabaseRequest, StartRelationalDatabaseResult> asyncHandler);

    /**
     * <p>
     * Stops a specific Amazon Lightsail instance that is currently running.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
     * address after stopping and starting an instance, create a static IP address and attach it to the instance. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/lightsail-create-static-ip">Lightsail Dev Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>stop instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @return A Java Future containing the result of the StopInstance operation returned by the service.
     * @sample AmazonLightsailAsync.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest stopInstanceRequest);

    /**
     * <p>
     * Stops a specific Amazon Lightsail instance that is currently running.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
     * address after stopping and starting an instance, create a static IP address and attach it to the instance. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/lightsail-create-static-ip">Lightsail Dev Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>stop instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by instanceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest stopInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, StopInstanceResult> asyncHandler);

    /**
     * <p>
     * Stops a specific database that is currently running in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>stop relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param stopRelationalDatabaseRequest
     * @return A Java Future containing the result of the StopRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.StopRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopRelationalDatabaseResult> stopRelationalDatabaseAsync(StopRelationalDatabaseRequest stopRelationalDatabaseRequest);

    /**
     * <p>
     * Stops a specific database that is currently running in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>stop relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param stopRelationalDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.StopRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopRelationalDatabaseResult> stopRelationalDatabaseAsync(StopRelationalDatabaseRequest stopRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<StopRelationalDatabaseRequest, StopRelationalDatabaseResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
     * about tags, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * The <code>tag resource</code> operation supports tag-based access control via request tags and resource tags
     * applied to the resource identified by resourceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLightsailAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
     * about tags, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * The <code>tag resource</code> operation supports tag-based access control via request tags and resource tags
     * applied to the resource identified by resourceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Attempts to unpeer the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @return A Java Future containing the result of the UnpeerVpc operation returned by the service.
     * @sample AmazonLightsailAsync.UnpeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UnpeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(UnpeerVpcRequest unpeerVpcRequest);

    /**
     * <p>
     * Attempts to unpeer the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnpeerVpc operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UnpeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UnpeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(UnpeerVpcRequest unpeerVpcRequest,
            com.amazonaws.handlers.AsyncHandler<UnpeerVpcRequest, UnpeerVpcResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource.
     * </p>
     * <p>
     * The <code>untag resource</code> operation supports tag-based access control via request tags and resource tags
     * applied to the resource identified by resourceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLightsailAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource.
     * </p>
     * <p>
     * The <code>untag resource</code> operation supports tag-based access control via request tags and resource tags
     * applied to the resource identified by resourceName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a domain recordset after it is created.
     * </p>
     * <p>
     * The <code>update domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by domainName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateDomainEntryRequest
     * @return A Java Future containing the result of the UpdateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(UpdateDomainEntryRequest updateDomainEntryRequest);

    /**
     * <p>
     * Updates a domain recordset after it is created.
     * </p>
     * <p>
     * The <code>update domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by domainName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateDomainEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(UpdateDomainEntryRequest updateDomainEntryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainEntryRequest, UpdateDomainEntryResult> asyncHandler);

    /**
     * <p>
     * Updates the specified attribute for a load balancer. You can only update one attribute at a time.
     * </p>
     * <p>
     * The <code>update load balancer attribute</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateLoadBalancerAttributeRequest
     * @return A Java Future containing the result of the UpdateLoadBalancerAttribute operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateLoadBalancerAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateLoadBalancerAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoadBalancerAttributeResult> updateLoadBalancerAttributeAsync(
            UpdateLoadBalancerAttributeRequest updateLoadBalancerAttributeRequest);

    /**
     * <p>
     * Updates the specified attribute for a load balancer. You can only update one attribute at a time.
     * </p>
     * <p>
     * The <code>update load balancer attribute</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by loadBalancerName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateLoadBalancerAttributeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLoadBalancerAttribute operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateLoadBalancerAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateLoadBalancerAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoadBalancerAttributeResult> updateLoadBalancerAttributeAsync(
            UpdateLoadBalancerAttributeRequest updateLoadBalancerAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLoadBalancerAttributeRequest, UpdateLoadBalancerAttributeResult> asyncHandler);

    /**
     * <p>
     * Allows the update of one or more attributes of a database in Amazon Lightsail.
     * </p>
     * <p>
     * Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the
     * database's predefined maintenance window.
     * </p>
     * <p>
     * The <code>update relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseRequest
     * @return A Java Future containing the result of the UpdateRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelationalDatabaseResult> updateRelationalDatabaseAsync(UpdateRelationalDatabaseRequest updateRelationalDatabaseRequest);

    /**
     * <p>
     * Allows the update of one or more attributes of a database in Amazon Lightsail.
     * </p>
     * <p>
     * Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the
     * database's predefined maintenance window.
     * </p>
     * <p>
     * The <code>update relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelationalDatabaseResult> updateRelationalDatabaseAsync(UpdateRelationalDatabaseRequest updateRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRelationalDatabaseRequest, UpdateRelationalDatabaseResult> asyncHandler);

    /**
     * <p>
     * Allows the update of one or more parameters of a database in Amazon Lightsail.
     * </p>
     * <p>
     * Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance
     * window. However, there are two ways in which paramater updates are applied: <code>dynamic</code> or
     * <code>pending-reboot</code>. Parameters marked with a <code>dynamic</code> apply type are applied immediately.
     * Parameters marked with a <code>pending-reboot</code> apply type are applied only after the database is rebooted
     * using the <code>reboot relational database</code> operation.
     * </p>
     * <p>
     * The <code>update relational database parameters</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseParametersRequest
     * @return A Java Future containing the result of the UpdateRelationalDatabaseParameters operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.UpdateRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelationalDatabaseParametersResult> updateRelationalDatabaseParametersAsync(
            UpdateRelationalDatabaseParametersRequest updateRelationalDatabaseParametersRequest);

    /**
     * <p>
     * Allows the update of one or more parameters of a database in Amazon Lightsail.
     * </p>
     * <p>
     * Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance
     * window. However, there are two ways in which paramater updates are applied: <code>dynamic</code> or
     * <code>pending-reboot</code>. Parameters marked with a <code>dynamic</code> apply type are applied immediately.
     * Parameters marked with a <code>pending-reboot</code> apply type are applied only after the database is rebooted
     * using the <code>reboot relational database</code> operation.
     * </p>
     * <p>
     * The <code>update relational database parameters</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRelationalDatabaseParameters operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.UpdateRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelationalDatabaseParametersResult> updateRelationalDatabaseParametersAsync(
            UpdateRelationalDatabaseParametersRequest updateRelationalDatabaseParametersRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRelationalDatabaseParametersRequest, UpdateRelationalDatabaseParametersResult> asyncHandler);

}
