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
 * Lightsail includes everything you need to launch your project quickly - a virtual machine, SSD-based storage, data
 * transfer, DNS management, and a static IP - for a low, predictable price. You manage those Lightsail servers through
 * the Lightsail console or by using the API or command-line interface (CLI).
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
     * Attaches a Transport Layer Security (TLS) certificate to your load balancer.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
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
     * Attaches a Transport Layer Security (TLS) certificate to your load balancer.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
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
     * Creates a block storage disk that can be attached to a Lightsail instance in the same Availability Zone (e.g.,
     * <code>us-east-2a</code>). The disk is created in the regional endpoint that you send the HTTP request to. For
     * more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail"
     * >Regions and Availability Zones in Lightsail</a>.
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
     * Creates one of the following entry records associated with the domain: A record, CNAME record, TXT record, or MX
     * record.
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
     * Creates one of the following entry records associated with the domain: A record, CNAME record, TXT record, or MX
     * record.
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
     * Creates one or more Amazon Lightsail virtual private servers, or <i>instances</i>.
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
     * Creates one or more Amazon Lightsail virtual private servers, or <i>instances</i>.
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
     * Creates sn SSH key pair.
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
     * Creates sn SSH key pair.
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
     * Creates a Lightsail load balancer.
     * </p>
     * <p>
     * When you create a load balancer, you can specify certificates and port settings. You can create up to 5 load
     * balancers per AWS Region in your account.
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
     * Creates a Lightsail load balancer.
     * </p>
     * <p>
     * When you create a load balancer, you can specify certificates and port settings. You can create up to 5 load
     * balancers per AWS Region in your account.
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
     * Deletes the specified block storage disk. The disk must be in the <code>available</code> state (not attached to a
     * Lightsail instance).
     * </p>
     * <note>
     * <p>
     * The disk may remain in the <code>deleting</code> state for several minutes.
     * </p>
     * </note>
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
     * Deletes a Lightsail load balancer.
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
     * Deletes a Lightsail load balancer.
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
     * Deletes a TLS/SSL certificate associated with a Lightsail load balancer.
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
     * Deletes a TLS/SSL certificate associated with a Lightsail load balancer.
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
     * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the
     * device within your operating system before stopping the instance and detaching the disk.
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
     * parameter to also return the availability zones in a region.
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
     * parameter to also return the availability zones in a region.
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
     * Restarts a specific instance. When your Amazon Lightsail instance is finished rebooting, Lightsail assigns a new
     * public IP address. To use the same IP address after restarting, create a static IP address and attach it to the
     * instance.
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
     * Restarts a specific instance. When your Amazon Lightsail instance is finished rebooting, Lightsail assigns a new
     * public IP address. To use the same IP address after restarting, create a static IP address and attach it to the
     * instance.
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
     * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance
     * operation.
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
     * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance
     * operation.
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
     * Stops a specific Amazon Lightsail instance that is currently running.
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
     * Updates a domain recordset after it is created.
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
     * Updates the specified attribute for a load balancer.
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
     * Updates the specified attribute for a load balancer.
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

}
