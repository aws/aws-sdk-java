/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.storagegateway;

import com.amazonaws.services.storagegateway.model.*;

/**
 * Interface for accessing AWS Storage Gateway asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Storage Gateway Service</fullname>
 * <p>
 * AWS Storage Gateway is the service that connects an on-premises software
 * appliance with cloud-based storage to provide seamless and secure integration
 * between an organization's on-premises IT environment and AWS's storage
 * infrastructure. The service enables you to securely upload data to the AWS
 * cloud for cost effective backup and rapid disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway
 * Service API Reference</i>:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayHTTPRequestsHeaders.html"
 * >AWS Storage Gateway Required Request Headers</a>: Describes the required
 * headers that you must send with every POST request to AWS Storage Gateway.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewaySigningRequests.html"
 * >Signing Requests</a>: AWS Storage Gateway requires that you authenticate
 * every request you send; this topic describes how sign such a request.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/storagegateway/latest/userguide/APIErrorResponses.html"
 * >Error Responses</a>: Provides reference information about AWS Storage
 * Gateway errors.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPIOperations.html"
 * >Operations in AWS Storage Gateway</a>: Contains detailed descriptions of all
 * AWS Storage Gateway operations, their request parameters, response elements,
 * possible errors, and examples of requests and responses.</li>
 * <li><a
 * href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html">AWS
 * Storage Gateway Regions and Endpoints</a>: Provides a list of each of the
 * regions and endpoints available for use with AWS Storage Gateway.</li>
 * </ul>
 */
public interface AWSStorageGatewayAsync extends AWSStorageGateway {

    /**
     * <p>
     * This operation activates the gateway you previously deployed on your
     * host. For more information, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedActivateGateway-common.html"
     * > Activate the AWS Storage Gateway</a>. In the activation process, you
     * specify information such as the region you want to use for storing
     * snapshots, the time zone for scheduled snapshots the gateway snapshot
     * schedule window, an activation key, and a name for your gateway. The
     * activation process also associates your gateway with your account; for
     * more information, see <a>UpdateGatewayInformation</a>.
     * </p>
     * <note>You must turn on the gateway VM before you can activate your
     * gateway.</note>
     * 
     * @param activateGatewayRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>ActivateGatewayInput$ActivationKey</a></li>
     *        <li><a>GatewayName</a></li>
     *        <li><a>ActivateGatewayInput$GatewayRegion</a></li>
     *        <li><a>ActivateGatewayInput$GatewayTimezone</a></li>
     *        <li><a>ActivateGatewayInput$GatewayType</a></li>
     *        <li><a>ActivateGatewayInput$TapeDriveType</a></li>
     *        <li><a>ActivateGatewayInput$MediumChangerType</a></li>
     * @return A Java Future containing the result of the ActivateGateway
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.ActivateGateway
     */
    java.util.concurrent.Future<ActivateGatewayResult> activateGatewayAsync(
            ActivateGatewayRequest activateGatewayRequest);

    /**
     * <p>
     * This operation activates the gateway you previously deployed on your
     * host. For more information, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedActivateGateway-common.html"
     * > Activate the AWS Storage Gateway</a>. In the activation process, you
     * specify information such as the region you want to use for storing
     * snapshots, the time zone for scheduled snapshots the gateway snapshot
     * schedule window, an activation key, and a name for your gateway. The
     * activation process also associates your gateway with your account; for
     * more information, see <a>UpdateGatewayInformation</a>.
     * </p>
     * <note>You must turn on the gateway VM before you can activate your
     * gateway.</note>
     * 
     * @param activateGatewayRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>ActivateGatewayInput$ActivationKey</a></li>
     *        <li><a>GatewayName</a></li>
     *        <li><a>ActivateGatewayInput$GatewayRegion</a></li>
     *        <li><a>ActivateGatewayInput$GatewayTimezone</a></li>
     *        <li><a>ActivateGatewayInput$GatewayType</a></li>
     *        <li><a>ActivateGatewayInput$TapeDriveType</a></li>
     *        <li><a>ActivateGatewayInput$MediumChangerType</a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ActivateGateway
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ActivateGateway
     */
    java.util.concurrent.Future<ActivateGatewayResult> activateGatewayAsync(
            ActivateGatewayRequest activateGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<ActivateGatewayRequest, ActivateGatewayResult> asyncHandler);

    /**
     * <p>
     * This operation configures one or more gateway local disks as cache for a
     * cached-volume gateway. This operation is supported only for the
     * gateway-cached volume architecture (see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html"
     * >Storage Gateway Concepts</a>).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add cache, and one or more disk IDs that you want to
     * configure as cache.
     * </p>
     * 
     * @param addCacheRequest
     * @return A Java Future containing the result of the AddCache operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsync.AddCache
     */
    java.util.concurrent.Future<AddCacheResult> addCacheAsync(
            AddCacheRequest addCacheRequest);

    /**
     * <p>
     * This operation configures one or more gateway local disks as cache for a
     * cached-volume gateway. This operation is supported only for the
     * gateway-cached volume architecture (see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html"
     * >Storage Gateway Concepts</a>).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add cache, and one or more disk IDs that you want to
     * configure as cache.
     * </p>
     * 
     * @param addCacheRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddCache operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.AddCache
     */
    java.util.concurrent.Future<AddCacheResult> addCacheAsync(
            AddCacheRequest addCacheRequest,
            com.amazonaws.handlers.AsyncHandler<AddCacheRequest, AddCacheResult> asyncHandler);

    /**
     * <p>
     * This operation adds one or more tags to the specified resource. You use
     * tags to add metadata to resources, which you can use to categorize these
     * resources. For example, you can categorize resources by purpose, owner,
     * environment, or team. Each tag consists of a key and a value, which you
     * define. You can add tags to the following AWS Storage Gateway resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Storage gateways of all types
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Storage Volumes
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Virtual Tapes
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a maximum of 10 tags for each resource. Virtual tapes and
     * storage volumes that are recovered to a new gateway maintain their tags.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        AddTagsToResourceInput
     * @return A Java Future containing the result of the AddTagsToResource
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.AddTagsToResource
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(
            AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * This operation adds one or more tags to the specified resource. You use
     * tags to add metadata to resources, which you can use to categorize these
     * resources. For example, you can categorize resources by purpose, owner,
     * environment, or team. Each tag consists of a key and a value, which you
     * define. You can add tags to the following AWS Storage Gateway resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Storage gateways of all types
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Storage Volumes
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Virtual Tapes
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a maximum of 10 tags for each resource. Virtual tapes and
     * storage volumes that are recovered to a new gateway maintain their tags.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        AddTagsToResourceInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.AddTagsToResource
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(
            AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * This operation configures one or more gateway local disks as upload
     * buffer for a specified gateway. This operation is supported for both the
     * gateway-stored and gateway-cached volume architectures.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add upload buffer, and one or more disk IDs that you
     * want to configure as upload buffer.
     * </p>
     * 
     * @param addUploadBufferRequest
     * @return A Java Future containing the result of the AddUploadBuffer
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.AddUploadBuffer
     */
    java.util.concurrent.Future<AddUploadBufferResult> addUploadBufferAsync(
            AddUploadBufferRequest addUploadBufferRequest);

    /**
     * <p>
     * This operation configures one or more gateway local disks as upload
     * buffer for a specified gateway. This operation is supported for both the
     * gateway-stored and gateway-cached volume architectures.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add upload buffer, and one or more disk IDs that you
     * want to configure as upload buffer.
     * </p>
     * 
     * @param addUploadBufferRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddUploadBuffer
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.AddUploadBuffer
     */
    java.util.concurrent.Future<AddUploadBufferResult> addUploadBufferAsync(
            AddUploadBufferRequest addUploadBufferRequest,
            com.amazonaws.handlers.AsyncHandler<AddUploadBufferRequest, AddUploadBufferResult> asyncHandler);

    /**
     * <p>
     * This operation configures one or more gateway local disks as working
     * storage for a gateway. This operation is supported only for the
     * gateway-stored volume architecture. This operation is deprecated method
     * in cached-volumes API version (20120630). Use AddUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use
     * the <a>AddUploadBuffer</a> operation to add upload buffer to a
     * stored-volume gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add working storage, and one or more disk IDs that you
     * want to configure as working storage.
     * </p>
     * 
     * @param addWorkingStorageRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>AddWorkingStorageInput$DiskIds</a></li>
     * @return A Java Future containing the result of the AddWorkingStorage
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.AddWorkingStorage
     */
    java.util.concurrent.Future<AddWorkingStorageResult> addWorkingStorageAsync(
            AddWorkingStorageRequest addWorkingStorageRequest);

    /**
     * <p>
     * This operation configures one or more gateway local disks as working
     * storage for a gateway. This operation is supported only for the
     * gateway-stored volume architecture. This operation is deprecated method
     * in cached-volumes API version (20120630). Use AddUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use
     * the <a>AddUploadBuffer</a> operation to add upload buffer to a
     * stored-volume gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add working storage, and one or more disk IDs that you
     * want to configure as working storage.
     * </p>
     * 
     * @param addWorkingStorageRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>AddWorkingStorageInput$DiskIds</a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddWorkingStorage
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.AddWorkingStorage
     */
    java.util.concurrent.Future<AddWorkingStorageResult> addWorkingStorageAsync(
            AddWorkingStorageRequest addWorkingStorageRequest,
            com.amazonaws.handlers.AsyncHandler<AddWorkingStorageRequest, AddWorkingStorageResult> asyncHandler);

    /**
     * <p>
     * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after
     * the archiving process is initiated.
     * </p>
     * 
     * @param cancelArchivalRequest
     *        CancelArchivalInput
     * @return A Java Future containing the result of the CancelArchival
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.CancelArchival
     */
    java.util.concurrent.Future<CancelArchivalResult> cancelArchivalAsync(
            CancelArchivalRequest cancelArchivalRequest);

    /**
     * <p>
     * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after
     * the archiving process is initiated.
     * </p>
     * 
     * @param cancelArchivalRequest
     *        CancelArchivalInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelArchival
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CancelArchival
     */
    java.util.concurrent.Future<CancelArchivalResult> cancelArchivalAsync(
            CancelArchivalRequest cancelArchivalRequest,
            com.amazonaws.handlers.AsyncHandler<CancelArchivalRequest, CancelArchivalResult> asyncHandler);

    /**
     * <p>
     * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to
     * a gateway after the retrieval process is initiated. The virtual tape is
     * returned to the VTS.
     * </p>
     * 
     * @param cancelRetrievalRequest
     *        CancelRetrievalInput
     * @return A Java Future containing the result of the CancelRetrieval
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.CancelRetrieval
     */
    java.util.concurrent.Future<CancelRetrievalResult> cancelRetrievalAsync(
            CancelRetrievalRequest cancelRetrievalRequest);

    /**
     * <p>
     * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to
     * a gateway after the retrieval process is initiated. The virtual tape is
     * returned to the VTS.
     * </p>
     * 
     * @param cancelRetrievalRequest
     *        CancelRetrievalInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelRetrieval
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CancelRetrieval
     */
    java.util.concurrent.Future<CancelRetrievalResult> cancelRetrievalAsync(
            CancelRetrievalRequest cancelRetrievalRequest,
            com.amazonaws.handlers.AsyncHandler<CancelRetrievalRequest, CancelRetrievalResult> asyncHandler);

    /**
     * <p>
     * This operation creates a cached volume on a specified cached gateway.
     * This operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <note>Cache storage must be allocated to the gateway before you can
     * create a cached volume. Use the <a>AddCache</a> operation to add cache
     * storage to a gateway. </note>
     * <p>
     * In the request, you must specify the gateway, size of the volume in
     * bytes, the iSCSI target name, an IP address on which to expose the
     * target, and a unique client token. In response, AWS Storage Gateway
     * creates the volume and returns information about it such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     * 
     * @param createCachediSCSIVolumeRequest
     * @return A Java Future containing the result of the
     *         CreateCachediSCSIVolume operation returned by the service.
     * @sample AWSStorageGatewayAsync.CreateCachediSCSIVolume
     */
    java.util.concurrent.Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(
            CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest);

    /**
     * <p>
     * This operation creates a cached volume on a specified cached gateway.
     * This operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <note>Cache storage must be allocated to the gateway before you can
     * create a cached volume. Use the <a>AddCache</a> operation to add cache
     * storage to a gateway. </note>
     * <p>
     * In the request, you must specify the gateway, size of the volume in
     * bytes, the iSCSI target name, an IP address on which to expose the
     * target, and a unique client token. In response, AWS Storage Gateway
     * creates the volume and returns information about it such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     * 
     * @param createCachediSCSIVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateCachediSCSIVolume operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateCachediSCSIVolume
     */
    java.util.concurrent.Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(
            CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCachediSCSIVolumeRequest, CreateCachediSCSIVolumeResult> asyncHandler);

    /**
     * <p>
     * This operation initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time
     * snapshots of your data to Amazon Simple Storage (S3) for durable off-site
     * recovery, as well as import the data to an Amazon Elastic Block Store
     * (EBS) volume in Amazon Elastic Compute Cloud (EC2). You can take
     * snapshots of your gateway volume on a scheduled or ad-hoc basis. This API
     * enables you to take ad-hoc snapshot. For more information, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html"
     * >Working With Snapshots in the AWS Storage Gateway Console</a>.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide description for the
     * snapshot. When AWS Storage Gateway takes the snapshot of specified
     * volume, the snapshot and description appears in the AWS Storage Gateway
     * Console. In response, AWS Storage Gateway returns you a snapshot ID. You
     * can use this snapshot ID to check the snapshot progress or later use it
     * when you want to create a volume from a snapshot.
     * </p>
     * <note>To list or delete a snapshot, you must use the Amazon EC2 API. For
     * more information, see DescribeSnapshots or DeleteSnapshot in the <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Operations.html"
     * >EC2 API reference</a>.</note>
     * 
     * @param createSnapshotRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>CreateSnapshotInput$SnapshotDescription</a></li>
     *        <li><a>CreateSnapshotInput$VolumeARN</a></li>
     * @return A Java Future containing the result of the CreateSnapshot
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.CreateSnapshot
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(
            CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * This operation initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time
     * snapshots of your data to Amazon Simple Storage (S3) for durable off-site
     * recovery, as well as import the data to an Amazon Elastic Block Store
     * (EBS) volume in Amazon Elastic Compute Cloud (EC2). You can take
     * snapshots of your gateway volume on a scheduled or ad-hoc basis. This API
     * enables you to take ad-hoc snapshot. For more information, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html"
     * >Working With Snapshots in the AWS Storage Gateway Console</a>.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide description for the
     * snapshot. When AWS Storage Gateway takes the snapshot of specified
     * volume, the snapshot and description appears in the AWS Storage Gateway
     * Console. In response, AWS Storage Gateway returns you a snapshot ID. You
     * can use this snapshot ID to check the snapshot progress or later use it
     * when you want to create a volume from a snapshot.
     * </p>
     * <note>To list or delete a snapshot, you must use the Amazon EC2 API. For
     * more information, see DescribeSnapshots or DeleteSnapshot in the <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Operations.html"
     * >EC2 API reference</a>.</note>
     * 
     * @param createSnapshotRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>CreateSnapshotInput$SnapshotDescription</a></li>
     *        <li><a>CreateSnapshotInput$VolumeARN</a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateSnapshot
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(
            CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler);

    /**
     * <p>
     * This operation initiates a snapshot of a gateway from a volume recovery
     * point. This operation is supported only for the gateway-cached volume
     * architecture (see ).
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot. To get a
     * list of volume recovery point for gateway-cached volumes, use
     * <a>ListVolumeRecoveryPoints</a>.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you
     * identify the volume by providing its Amazon Resource Name (ARN). You must
     * also provide a description for the snapshot. When AWS Storage Gateway
     * takes a snapshot of the specified volume, the snapshot and its
     * description appear in the AWS Storage Gateway console. In response, AWS
     * Storage Gateway returns you a snapshot ID. You can use this snapshot ID
     * to check the snapshot progress or later use it when you want to create a
     * volume from a snapshot.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more
     * information, in <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param createSnapshotFromVolumeRecoveryPointRequest
     * @return A Java Future containing the result of the
     *         CreateSnapshotFromVolumeRecoveryPoint operation returned by the
     *         service.
     * @sample AWSStorageGatewayAsync.CreateSnapshotFromVolumeRecoveryPoint
     */
    java.util.concurrent.Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(
            CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest);

    /**
     * <p>
     * This operation initiates a snapshot of a gateway from a volume recovery
     * point. This operation is supported only for the gateway-cached volume
     * architecture (see ).
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot. To get a
     * list of volume recovery point for gateway-cached volumes, use
     * <a>ListVolumeRecoveryPoints</a>.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you
     * identify the volume by providing its Amazon Resource Name (ARN). You must
     * also provide a description for the snapshot. When AWS Storage Gateway
     * takes a snapshot of the specified volume, the snapshot and its
     * description appear in the AWS Storage Gateway console. In response, AWS
     * Storage Gateway returns you a snapshot ID. You can use this snapshot ID
     * to check the snapshot progress or later use it when you want to create a
     * volume from a snapshot.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more
     * information, in <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param createSnapshotFromVolumeRecoveryPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateSnapshotFromVolumeRecoveryPoint operation returned by the
     *         service.
     * @sample 
     *         AWSStorageGatewayAsyncHandler.CreateSnapshotFromVolumeRecoveryPoint
     */
    java.util.concurrent.Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(
            CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotFromVolumeRecoveryPointRequest, CreateSnapshotFromVolumeRecoveryPointResult> asyncHandler);

    /**
     * <p>
     * This operation creates a volume on a specified gateway. This operation is
     * supported only for the gateway-stored volume architecture.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You can
     * choose to preserve existing data on the disk, create volume from an
     * existing snapshot, or create an empty volume. If you choose to create an
     * empty gateway volume, then any existing data on the disk is erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information on
     * which you are creating the volume. In response, AWS Storage Gateway
     * creates the volume and returns volume information such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     * 
     * @param createStorediSCSIVolumeRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>CreateStorediSCSIVolumeInput$DiskId</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$PreserveExistingData</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$SnapshotId</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$TargetName</a></li>
     * @return A Java Future containing the result of the
     *         CreateStorediSCSIVolume operation returned by the service.
     * @sample AWSStorageGatewayAsync.CreateStorediSCSIVolume
     */
    java.util.concurrent.Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(
            CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest);

    /**
     * <p>
     * This operation creates a volume on a specified gateway. This operation is
     * supported only for the gateway-stored volume architecture.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You can
     * choose to preserve existing data on the disk, create volume from an
     * existing snapshot, or create an empty volume. If you choose to create an
     * empty gateway volume, then any existing data on the disk is erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information on
     * which you are creating the volume. In response, AWS Storage Gateway
     * creates the volume and returns volume information such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     * 
     * @param createStorediSCSIVolumeRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>CreateStorediSCSIVolumeInput$DiskId</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$PreserveExistingData</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$SnapshotId</a></li>
     *        <li><a>CreateStorediSCSIVolumeInput$TargetName</a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateStorediSCSIVolume operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateStorediSCSIVolume
     */
    java.util.concurrent.Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(
            CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStorediSCSIVolumeRequest, CreateStorediSCSIVolumeResult> asyncHandler);

    /**
     * <p>
     * Creates one or more virtual tapes. You write data to the virtual tapes
     * and then archive the tapes.
     * </p>
     * <note>Cache storage must be allocated to the gateway before you can
     * create virtual tapes. Use the <a>AddCache</a> operation to add cache
     * storage to a gateway. </note>
     * 
     * @param createTapesRequest
     *        CreateTapesInput
     * @return A Java Future containing the result of the CreateTapes operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsync.CreateTapes
     */
    java.util.concurrent.Future<CreateTapesResult> createTapesAsync(
            CreateTapesRequest createTapesRequest);

    /**
     * <p>
     * Creates one or more virtual tapes. You write data to the virtual tapes
     * and then archive the tapes.
     * </p>
     * <note>Cache storage must be allocated to the gateway before you can
     * create virtual tapes. Use the <a>AddCache</a> operation to add cache
     * storage to a gateway. </note>
     * 
     * @param createTapesRequest
     *        CreateTapesInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTapes operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateTapes
     */
    java.util.concurrent.Future<CreateTapesResult> createTapesAsync(
            CreateTapesRequest createTapesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTapesRequest, CreateTapesResult> asyncHandler);

    /**
     * <p>
     * This operation deletes the bandwidth rate limits of a gateway. You can
     * delete either the upload and download bandwidth rate limit, or you can
     * delete both. If you delete only one of the limits, the other limit
     * remains unchanged. To specify which gateway to work with, use the Amazon
     * Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param deleteBandwidthRateLimitRequest
     * @return A Java Future containing the result of the
     *         DeleteBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteBandwidthRateLimit
     */
    java.util.concurrent.Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(
            DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest);

    /**
     * <p>
     * This operation deletes the bandwidth rate limits of a gateway. You can
     * delete either the upload and download bandwidth rate limit, or you can
     * delete both. If you delete only one of the limits, the other limit
     * remains unchanged. To specify which gateway to work with, use the Amazon
     * Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param deleteBandwidthRateLimitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DeleteBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteBandwidthRateLimit
     */
    java.util.concurrent.Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(
            DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBandwidthRateLimitRequest, DeleteBandwidthRateLimitResult> asyncHandler);

    /**
     * <p>
     * This operation deletes Challenge-Handshake Authentication Protocol (CHAP)
     * credentials for a specified iSCSI target and initiator pair.
     * </p>
     * 
     * @param deleteChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>DeleteChapCredentialsInput$InitiatorName</a></li>
     *        <li><a>DeleteChapCredentialsInput$TargetARN</a></li>
     * @return A Java Future containing the result of the DeleteChapCredentials
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteChapCredentials
     */
    java.util.concurrent.Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(
            DeleteChapCredentialsRequest deleteChapCredentialsRequest);

    /**
     * <p>
     * This operation deletes Challenge-Handshake Authentication Protocol (CHAP)
     * credentials for a specified iSCSI target and initiator pair.
     * </p>
     * 
     * @param deleteChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>DeleteChapCredentialsInput$InitiatorName</a></li>
     *        <li><a>DeleteChapCredentialsInput$TargetARN</a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChapCredentials
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteChapCredentials
     */
    java.util.concurrent.Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(
            DeleteChapCredentialsRequest deleteChapCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChapCredentialsRequest, DeleteChapCredentialsResult> asyncHandler);

    /**
     * <p>
     * This operation deletes a gateway. To specify which gateway to delete, use
     * the Amazon Resource Name (ARN) of the gateway in your request. The
     * operation deletes the gateway; however, it does not delete the gateway
     * virtual machine (VM) from your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed snapshots
     * of the gateway volumes are not deleted upon deleting the gateway,
     * however, pending snapshots will not complete. After you delete a gateway,
     * your next step is to remove it from your environment.
     * </p>
     * <important>
     * <p>
     * You no longer pay software charges after the gateway is deleted; however,
     * your existing Amazon EBS snapshots persist and you will continue to be
     * billed for these snapshots. You can choose to remove all remaining Amazon
     * EBS snapshots by canceling your Amazon EC2 subscription.  If you prefer
     * not to cancel your Amazon EC2 subscription, you can delete your snapshots
     * using the Amazon EC2 console. For more information, see the <a
     * href="http://aws.amazon.com/storagegateway"> AWS Storage Gateway Detail
     * Page</a>.
     * </p>
     * </important>
     * 
     * @param deleteGatewayRequest
     *        A JSON object containing the id of the gateway to delete.
     * @return A Java Future containing the result of the DeleteGateway
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteGateway
     */
    java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(
            DeleteGatewayRequest deleteGatewayRequest);

    /**
     * <p>
     * This operation deletes a gateway. To specify which gateway to delete, use
     * the Amazon Resource Name (ARN) of the gateway in your request. The
     * operation deletes the gateway; however, it does not delete the gateway
     * virtual machine (VM) from your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed snapshots
     * of the gateway volumes are not deleted upon deleting the gateway,
     * however, pending snapshots will not complete. After you delete a gateway,
     * your next step is to remove it from your environment.
     * </p>
     * <important>
     * <p>
     * You no longer pay software charges after the gateway is deleted; however,
     * your existing Amazon EBS snapshots persist and you will continue to be
     * billed for these snapshots. You can choose to remove all remaining Amazon
     * EBS snapshots by canceling your Amazon EC2 subscription.  If you prefer
     * not to cancel your Amazon EC2 subscription, you can delete your snapshots
     * using the Amazon EC2 console. For more information, see the <a
     * href="http://aws.amazon.com/storagegateway"> AWS Storage Gateway Detail
     * Page</a>.
     * </p>
     * </important>
     * 
     * @param deleteGatewayRequest
     *        A JSON object containing the id of the gateway to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGateway
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteGateway
     */
    java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(
            DeleteGatewayRequest deleteGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler);

    /**
     * <p>
     * This operation deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or ad-hoc
     * basis. This API enables you to delete a snapshot schedule for a volume.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html"
     * >Working with Snapshots</a>. In the <code>DeleteSnapshotSchedule</code>
     * request, you identify the volume by providing its Amazon Resource Name
     * (ARN).
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. in
     * <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotScheduleRequest
     * @return A Java Future containing the result of the DeleteSnapshotSchedule
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteSnapshotSchedule
     */
    java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(
            DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest);

    /**
     * <p>
     * This operation deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or ad-hoc
     * basis. This API enables you to delete a snapshot schedule for a volume.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html"
     * >Working with Snapshots</a>. In the <code>DeleteSnapshotSchedule</code>
     * request, you identify the volume by providing its Amazon Resource Name
     * (ARN).
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. in
     * <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshotSchedule
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteSnapshotSchedule
     */
    java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(
            DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotScheduleRequest, DeleteSnapshotScheduleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified virtual tape.
     * </p>
     * 
     * @param deleteTapeRequest
     *        DeleteTapeInput
     * @return A Java Future containing the result of the DeleteTape operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteTape
     */
    java.util.concurrent.Future<DeleteTapeResult> deleteTapeAsync(
            DeleteTapeRequest deleteTapeRequest);

    /**
     * <p>
     * Deletes the specified virtual tape.
     * </p>
     * 
     * @param deleteTapeRequest
     *        DeleteTapeInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTape operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteTape
     */
    java.util.concurrent.Future<DeleteTapeResult> deleteTapeAsync(
            DeleteTapeRequest deleteTapeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTapeRequest, DeleteTapeResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified virtual tape from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param deleteTapeArchiveRequest
     *        DeleteTapeArchiveInput
     * @return A Java Future containing the result of the DeleteTapeArchive
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteTapeArchive
     */
    java.util.concurrent.Future<DeleteTapeArchiveResult> deleteTapeArchiveAsync(
            DeleteTapeArchiveRequest deleteTapeArchiveRequest);

    /**
     * <p>
     * Deletes the specified virtual tape from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param deleteTapeArchiveRequest
     *        DeleteTapeArchiveInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTapeArchive
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteTapeArchive
     */
    java.util.concurrent.Future<DeleteTapeArchiveResult> deleteTapeArchiveAsync(
            DeleteTapeArchiveRequest deleteTapeArchiveRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTapeArchiveRequest, DeleteTapeArchiveResult> asyncHandler);

    /**
     * <p>
     * This operation deletes the specified gateway volume that you previously
     * created using the <a>CreateCachediSCSIVolume</a> or
     * <a>CreateStorediSCSIVolume</a> API. For gateway-stored volumes, the local
     * disk that was configured as the storage volume is not deleted. You can
     * reuse the local disk to create another storage volume.
     * </p>
     * <p>
     * Before you delete a gateway volume, make sure there are no iSCSI
     * connections to the volume you are deleting. You should also make sure
     * there is no snapshot in progress. You can use the Amazon Elastic Compute
     * Cloud (Amazon EC2) API to query snapshots on the volume you are deleting
     * and check the snapshot status. For more information, go to <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the
     * storage volume you want to delete.
     * </p>
     * 
     * @param deleteVolumeRequest
     *        A JSON object containing the <a>DeleteVolumeInput$VolumeARN</a> to
     *        delete.
     * @return A Java Future containing the result of the DeleteVolume operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteVolume
     */
    java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(
            DeleteVolumeRequest deleteVolumeRequest);

    /**
     * <p>
     * This operation deletes the specified gateway volume that you previously
     * created using the <a>CreateCachediSCSIVolume</a> or
     * <a>CreateStorediSCSIVolume</a> API. For gateway-stored volumes, the local
     * disk that was configured as the storage volume is not deleted. You can
     * reuse the local disk to create another storage volume.
     * </p>
     * <p>
     * Before you delete a gateway volume, make sure there are no iSCSI
     * connections to the volume you are deleting. You should also make sure
     * there is no snapshot in progress. You can use the Amazon Elastic Compute
     * Cloud (Amazon EC2) API to query snapshots on the volume you are deleting
     * and check the snapshot status. For more information, go to <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the
     * storage volume you want to delete.
     * </p>
     * 
     * @param deleteVolumeRequest
     *        A JSON object containing the <a>DeleteVolumeInput$VolumeARN</a> to
     *        delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVolume operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteVolume
     */
    java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(
            DeleteVolumeRequest deleteVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler);

    /**
     * <p>
     * This operation returns the bandwidth rate limits of a gateway. By
     * default, these limits are not set, which means no bandwidth rate limiting
     * is in effect.
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if
     * the limit is set. If no limits are set for the gateway, then this
     * operation returns only the gateway ARN in the response body. To specify
     * which gateway to describe, use the Amazon Resource Name (ARN) of the
     * gateway in your request.
     * </p>
     * 
     * @param describeBandwidthRateLimitRequest
     *        A JSON object containing the of the gateway.
     * @return A Java Future containing the result of the
     *         DescribeBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeBandwidthRateLimit
     */
    java.util.concurrent.Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(
            DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest);

    /**
     * <p>
     * This operation returns the bandwidth rate limits of a gateway. By
     * default, these limits are not set, which means no bandwidth rate limiting
     * is in effect.
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if
     * the limit is set. If no limits are set for the gateway, then this
     * operation returns only the gateway ARN in the response body. To specify
     * which gateway to describe, use the Amazon Resource Name (ARN) of the
     * gateway in your request.
     * </p>
     * 
     * @param describeBandwidthRateLimitRequest
     *        A JSON object containing the of the gateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeBandwidthRateLimit
     */
    java.util.concurrent.Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(
            DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBandwidthRateLimitRequest, DescribeBandwidthRateLimitResult> asyncHandler);

    /**
     * <p>
     * This operation returns information about the cache of a gateway. This
     * operation is supported only for the gateway-cached volume architecture.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it
     * includes the amount of cache allocated and used.
     * </p>
     * 
     * @param describeCacheRequest
     * @return A Java Future containing the result of the DescribeCache
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeCache
     */
    java.util.concurrent.Future<DescribeCacheResult> describeCacheAsync(
            DescribeCacheRequest describeCacheRequest);

    /**
     * <p>
     * This operation returns information about the cache of a gateway. This
     * operation is supported only for the gateway-cached volume architecture.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it
     * includes the amount of cache allocated and used.
     * </p>
     * 
     * @param describeCacheRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCache
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeCache
     */
    java.util.concurrent.Future<DescribeCacheResult> describeCacheAsync(
            DescribeCacheRequest describeCacheRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheRequest, DescribeCacheResult> asyncHandler);

    /**
     * <p>
     * This operation returns a description of the gateway volumes specified in
     * the request. This operation is supported only for the gateway-cached
     * volume architecture.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway. In
     * the response Amazon Storage Gateway returns volume information sorted by
     * volume Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCachediSCSIVolumesRequest
     * @return A Java Future containing the result of the
     *         DescribeCachediSCSIVolumes operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeCachediSCSIVolumes
     */
    java.util.concurrent.Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(
            DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest);

    /**
     * <p>
     * This operation returns a description of the gateway volumes specified in
     * the request. This operation is supported only for the gateway-cached
     * volume architecture.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway. In
     * the response Amazon Storage Gateway returns volume information sorted by
     * volume Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCachediSCSIVolumesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeCachediSCSIVolumes operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeCachediSCSIVolumes
     */
    java.util.concurrent.Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(
            DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCachediSCSIVolumesRequest, DescribeCachediSCSIVolumesResult> asyncHandler);

    /**
     * <p>
     * This operation returns an array of Challenge-Handshake Authentication
     * Protocol (CHAP) credentials information for a specified iSCSI target, one
     * for each target-initiator pair.
     * </p>
     * 
     * @param describeChapCredentialsRequest
     *        A JSON object containing the Amazon Resource Name (ARN) of the
     *        iSCSI volume target.
     * @return A Java Future containing the result of the
     *         DescribeChapCredentials operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeChapCredentials
     */
    java.util.concurrent.Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(
            DescribeChapCredentialsRequest describeChapCredentialsRequest);

    /**
     * <p>
     * This operation returns an array of Challenge-Handshake Authentication
     * Protocol (CHAP) credentials information for a specified iSCSI target, one
     * for each target-initiator pair.
     * </p>
     * 
     * @param describeChapCredentialsRequest
     *        A JSON object containing the Amazon Resource Name (ARN) of the
     *        iSCSI volume target.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeChapCredentials operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeChapCredentials
     */
    java.util.concurrent.Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(
            DescribeChapCredentialsRequest describeChapCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChapCredentialsRequest, DescribeChapCredentialsResult> asyncHandler);

    /**
     * <p>
     * This operation returns metadata about a gateway such as its name, network
     * interfaces, configured time zone, and the state (whether the gateway is
     * running or not). To specify which gateway to describe, use the Amazon
     * Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param describeGatewayInformationRequest
     *        A JSON object containing the id of the gateway.
     * @return A Java Future containing the result of the
     *         DescribeGatewayInformation operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeGatewayInformation
     */
    java.util.concurrent.Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(
            DescribeGatewayInformationRequest describeGatewayInformationRequest);

    /**
     * <p>
     * This operation returns metadata about a gateway such as its name, network
     * interfaces, configured time zone, and the state (whether the gateway is
     * running or not). To specify which gateway to describe, use the Amazon
     * Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param describeGatewayInformationRequest
     *        A JSON object containing the id of the gateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeGatewayInformation operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeGatewayInformation
     */
    java.util.concurrent.Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(
            DescribeGatewayInformationRequest describeGatewayInformationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGatewayInformationRequest, DescribeGatewayInformationResult> asyncHandler);

    /**
     * <p>
     * This operation returns your gateway's weekly maintenance start time
     * including the day and time of the week. Note that values are in terms of
     * the gateway's time zone.
     * </p>
     * 
     * @param describeMaintenanceStartTimeRequest
     *        A JSON object containing the of the gateway.
     * @return A Java Future containing the result of the
     *         DescribeMaintenanceStartTime operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeMaintenanceStartTime
     */
    java.util.concurrent.Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(
            DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest);

    /**
     * <p>
     * This operation returns your gateway's weekly maintenance start time
     * including the day and time of the week. Note that values are in terms of
     * the gateway's time zone.
     * </p>
     * 
     * @param describeMaintenanceStartTimeRequest
     *        A JSON object containing the of the gateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeMaintenanceStartTime operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeMaintenanceStartTime
     */
    java.util.concurrent.Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(
            DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceStartTimeRequest, DescribeMaintenanceStartTimeResult> asyncHandler);

    /**
     * <p>
     * This operation describes the snapshot schedule for the specified gateway
     * volume. The snapshot schedule information includes intervals at which
     * snapshots are automatically initiated on the volume.
     * </p>
     * 
     * @param describeSnapshotScheduleRequest
     *        A JSON object containing the
     *        <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.
     * @return A Java Future containing the result of the
     *         DescribeSnapshotSchedule operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeSnapshotSchedule
     */
    java.util.concurrent.Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(
            DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest);

    /**
     * <p>
     * This operation describes the snapshot schedule for the specified gateway
     * volume. The snapshot schedule information includes intervals at which
     * snapshots are automatically initiated on the volume.
     * </p>
     * 
     * @param describeSnapshotScheduleRequest
     *        A JSON object containing the
     *        <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeSnapshotSchedule operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeSnapshotSchedule
     */
    java.util.concurrent.Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(
            DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotScheduleRequest, DescribeSnapshotScheduleResult> asyncHandler);

    /**
     * <p>
     * This operation returns the description of the gateway volumes specified
     * in the request. The list of gateway volumes in the request must be from
     * one gateway. In the response Amazon Storage Gateway returns volume
     * information sorted by volume ARNs.
     * </p>
     * 
     * @param describeStorediSCSIVolumesRequest
     *        A JSON Object containing a list of
     *        <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.
     * @return A Java Future containing the result of the
     *         DescribeStorediSCSIVolumes operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeStorediSCSIVolumes
     */
    java.util.concurrent.Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(
            DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest);

    /**
     * <p>
     * This operation returns the description of the gateway volumes specified
     * in the request. The list of gateway volumes in the request must be from
     * one gateway. In the response Amazon Storage Gateway returns volume
     * information sorted by volume ARNs.
     * </p>
     * 
     * @param describeStorediSCSIVolumesRequest
     *        A JSON Object containing a list of
     *        <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeStorediSCSIVolumes operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeStorediSCSIVolumes
     */
    java.util.concurrent.Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(
            DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStorediSCSIVolumesRequest, DescribeStorediSCSIVolumesResult> asyncHandler);

    /**
     * <p>
     * Returns a description of specified virtual tapes in the virtual tape
     * shelf (VTS).
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage Gateway
     * returns a description of all virtual tapes found in the VTS associated
     * with your account.
     * </p>
     * 
     * @param describeTapeArchivesRequest
     *        DescribeTapeArchivesInput
     * @return A Java Future containing the result of the DescribeTapeArchives
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeTapeArchives
     */
    java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(
            DescribeTapeArchivesRequest describeTapeArchivesRequest);

    /**
     * <p>
     * Returns a description of specified virtual tapes in the virtual tape
     * shelf (VTS).
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage Gateway
     * returns a description of all virtual tapes found in the VTS associated
     * with your account.
     * </p>
     * 
     * @param describeTapeArchivesRequest
     *        DescribeTapeArchivesInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTapeArchives
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeTapeArchives
     */
    java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(
            DescribeTapeArchivesRequest describeTapeArchivesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTapeArchivesRequest, DescribeTapeArchivesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTapeArchives operation.
     *
     * @see #describeTapeArchivesAsync(DescribeTapeArchivesRequest)
     */
    java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync();

    /**
     * Simplified method form for invoking the DescribeTapeArchives operation
     * with an AsyncHandler.
     *
     * @see #describeTapeArchivesAsync(DescribeTapeArchivesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTapeArchivesRequest, DescribeTapeArchivesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of virtual tape recovery points that are available for the
     * specified gateway-VTL.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all
     * the data on the virtual tape is consistent. If your gateway crashes,
     * virtual tapes that have recovery points can be recovered to a new
     * gateway.
     * </p>
     * 
     * @param describeTapeRecoveryPointsRequest
     *        DescribeTapeRecoveryPointsInput
     * @return A Java Future containing the result of the
     *         DescribeTapeRecoveryPoints operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeTapeRecoveryPoints
     */
    java.util.concurrent.Future<DescribeTapeRecoveryPointsResult> describeTapeRecoveryPointsAsync(
            DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest);

    /**
     * <p>
     * Returns a list of virtual tape recovery points that are available for the
     * specified gateway-VTL.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all
     * the data on the virtual tape is consistent. If your gateway crashes,
     * virtual tapes that have recovery points can be recovered to a new
     * gateway.
     * </p>
     * 
     * @param describeTapeRecoveryPointsRequest
     *        DescribeTapeRecoveryPointsInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeTapeRecoveryPoints operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeTapeRecoveryPoints
     */
    java.util.concurrent.Future<DescribeTapeRecoveryPointsResult> describeTapeRecoveryPointsAsync(
            DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTapeRecoveryPointsRequest, DescribeTapeRecoveryPointsResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the specified Amazon Resource Name (ARN) of
     * virtual tapes. If a <code>TapeARN</code> is not specified, returns a
     * description of all virtual tapes associated with the specified gateway.
     * </p>
     * 
     * @param describeTapesRequest
     *        DescribeTapesInput
     * @return A Java Future containing the result of the DescribeTapes
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeTapes
     */
    java.util.concurrent.Future<DescribeTapesResult> describeTapesAsync(
            DescribeTapesRequest describeTapesRequest);

    /**
     * <p>
     * Returns a description of the specified Amazon Resource Name (ARN) of
     * virtual tapes. If a <code>TapeARN</code> is not specified, returns a
     * description of all virtual tapes associated with the specified gateway.
     * </p>
     * 
     * @param describeTapesRequest
     *        DescribeTapesInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTapes
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeTapes
     */
    java.util.concurrent.Future<DescribeTapesResult> describeTapesAsync(
            DescribeTapesRequest describeTapesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTapesRequest, DescribeTapesResult> asyncHandler);

    /**
     * <p>
     * This operation returns information about the upload buffer of a gateway.
     * This operation is supported for both the gateway-stored and
     * gateway-cached volume architectures.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer
     * space, and it includes the amount of upload buffer space allocated and
     * used.
     * </p>
     * 
     * @param describeUploadBufferRequest
     * @return A Java Future containing the result of the DescribeUploadBuffer
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeUploadBuffer
     */
    java.util.concurrent.Future<DescribeUploadBufferResult> describeUploadBufferAsync(
            DescribeUploadBufferRequest describeUploadBufferRequest);

    /**
     * <p>
     * This operation returns information about the upload buffer of a gateway.
     * This operation is supported for both the gateway-stored and
     * gateway-cached volume architectures.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer
     * space, and it includes the amount of upload buffer space allocated and
     * used.
     * </p>
     * 
     * @param describeUploadBufferRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUploadBuffer
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeUploadBuffer
     */
    java.util.concurrent.Future<DescribeUploadBufferResult> describeUploadBufferAsync(
            DescribeUploadBufferRequest describeUploadBufferRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUploadBufferRequest, DescribeUploadBufferResult> asyncHandler);

    /**
     * <p>
     * Returns a description of virtual tape library (VTL) devices for the
     * specified gateway. In the response, AWS Storage Gateway returns VTL
     * device information.
     * </p>
     * <p>
     * The list of VTL devices must be from one gateway.
     * </p>
     * 
     * @param describeVTLDevicesRequest
     *        DescribeVTLDevicesInput
     * @return A Java Future containing the result of the DescribeVTLDevices
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeVTLDevices
     */
    java.util.concurrent.Future<DescribeVTLDevicesResult> describeVTLDevicesAsync(
            DescribeVTLDevicesRequest describeVTLDevicesRequest);

    /**
     * <p>
     * Returns a description of virtual tape library (VTL) devices for the
     * specified gateway. In the response, AWS Storage Gateway returns VTL
     * device information.
     * </p>
     * <p>
     * The list of VTL devices must be from one gateway.
     * </p>
     * 
     * @param describeVTLDevicesRequest
     *        DescribeVTLDevicesInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVTLDevices
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeVTLDevices
     */
    java.util.concurrent.Future<DescribeVTLDevicesResult> describeVTLDevicesAsync(
            DescribeVTLDevicesRequest describeVTLDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVTLDevicesRequest, DescribeVTLDevicesResult> asyncHandler);

    /**
     * <p>
     * This operation returns information about the working storage of a
     * gateway. This operation is supported only for the gateway-stored volume
     * architecture. This operation is deprecated in cached-volumes API version
     * (20120630). Use DescribeUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use
     * the DescribeUploadBuffer operation to add upload buffer to a
     * stored-volume gateway.
     * </p>
     * </note>
     * <p>
     * The response includes disk IDs that are configured as working storage,
     * and it includes the amount of working storage allocated and used.
     * </p>
     * 
     * @param describeWorkingStorageRequest
     *        A JSON object containing the of the gateway.
     * @return A Java Future containing the result of the DescribeWorkingStorage
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeWorkingStorage
     */
    java.util.concurrent.Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(
            DescribeWorkingStorageRequest describeWorkingStorageRequest);

    /**
     * <p>
     * This operation returns information about the working storage of a
     * gateway. This operation is supported only for the gateway-stored volume
     * architecture. This operation is deprecated in cached-volumes API version
     * (20120630). Use DescribeUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use
     * the DescribeUploadBuffer operation to add upload buffer to a
     * stored-volume gateway.
     * </p>
     * </note>
     * <p>
     * The response includes disk IDs that are configured as working storage,
     * and it includes the amount of working storage allocated and used.
     * </p>
     * 
     * @param describeWorkingStorageRequest
     *        A JSON object containing the of the gateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkingStorage
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeWorkingStorage
     */
    java.util.concurrent.Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(
            DescribeWorkingStorageRequest describeWorkingStorageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkingStorageRequest, DescribeWorkingStorageResult> asyncHandler);

    /**
     * <p>
     * Disables a gateway when the gateway is no longer functioning. For
     * example, if your gateway VM is damaged, you can disable the gateway so
     * you can recover virtual tapes.
     * </p>
     * <p>
     * Use this operation for a gateway-VTL that is not reachable or not
     * functioning.
     * </p>
     * <important>Once a gateway is disabled it cannot be enabled.</important>
     * 
     * @param disableGatewayRequest
     *        DisableGatewayInput
     * @return A Java Future containing the result of the DisableGateway
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.DisableGateway
     */
    java.util.concurrent.Future<DisableGatewayResult> disableGatewayAsync(
            DisableGatewayRequest disableGatewayRequest);

    /**
     * <p>
     * Disables a gateway when the gateway is no longer functioning. For
     * example, if your gateway VM is damaged, you can disable the gateway so
     * you can recover virtual tapes.
     * </p>
     * <p>
     * Use this operation for a gateway-VTL that is not reachable or not
     * functioning.
     * </p>
     * <important>Once a gateway is disabled it cannot be enabled.</important>
     * 
     * @param disableGatewayRequest
     *        DisableGatewayInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableGateway
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DisableGateway
     */
    java.util.concurrent.Future<DisableGatewayResult> disableGatewayAsync(
            DisableGatewayRequest disableGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DisableGatewayRequest, DisableGatewayResult> asyncHandler);

    /**
     * <p>
     * This operation lists gateways owned by an AWS account in a region
     * specified in the request. The returned list is ordered by gateway Amazon
     * Resource Name (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This
     * operation supports pagination that allows you to optionally reduce the
     * number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response-that is, the
     * response returns only a truncated list of your gateways-the response
     * contains a marker that you can specify in your next request to fetch the
     * next page of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     *        A JSON object containing zero or more of the following fields:</p>
     *        <ul>
     *        <li><a>ListGatewaysInput$Limit</a></li>
     *        <li><a>ListGatewaysInput$Marker</a></li>
     * @return A Java Future containing the result of the ListGateways operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsync.ListGateways
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(
            ListGatewaysRequest listGatewaysRequest);

    /**
     * <p>
     * This operation lists gateways owned by an AWS account in a region
     * specified in the request. The returned list is ordered by gateway Amazon
     * Resource Name (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This
     * operation supports pagination that allows you to optionally reduce the
     * number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response-that is, the
     * response returns only a truncated list of your gateways-the response
     * contains a marker that you can specify in your next request to fetch the
     * next page of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     *        A JSON object containing zero or more of the following fields:</p>
     *        <ul>
     *        <li><a>ListGatewaysInput$Limit</a></li>
     *        <li><a>ListGatewaysInput$Marker</a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGateways operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListGateways
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(
            ListGatewaysRequest listGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListGateways operation.
     *
     * @see #listGatewaysAsync(ListGatewaysRequest)
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync();

    /**
     * Simplified method form for invoking the ListGateways operation with an
     * AsyncHandler.
     *
     * @see #listGatewaysAsync(ListGatewaysRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler);

    /**
     * <p>
     * This operation returns a list of the gateway's local disks. To specify
     * which gateway to describe, you use the Amazon Resource Name (ARN) of the
     * gateway in the body of the request.
     * </p>
     * <p>
     * The request returns a list of all disks, specifying which are configured
     * as working storage, cache storage, or stored volume or not configured at
     * all. The response includes a <code>DiskStatus</code> field. This field
     * can have a value of present (the disk is available to use), missing (the
     * disk is no longer connected to the gateway), or mismatch (the disk node
     * is occupied by a disk that has incorrect metadata or the disk content is
     * corrupted).
     * </p>
     * 
     * @param listLocalDisksRequest
     *        A JSON object containing the of the gateway.
     * @return A Java Future containing the result of the ListLocalDisks
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListLocalDisks
     */
    java.util.concurrent.Future<ListLocalDisksResult> listLocalDisksAsync(
            ListLocalDisksRequest listLocalDisksRequest);

    /**
     * <p>
     * This operation returns a list of the gateway's local disks. To specify
     * which gateway to describe, you use the Amazon Resource Name (ARN) of the
     * gateway in the body of the request.
     * </p>
     * <p>
     * The request returns a list of all disks, specifying which are configured
     * as working storage, cache storage, or stored volume or not configured at
     * all. The response includes a <code>DiskStatus</code> field. This field
     * can have a value of present (the disk is available to use), missing (the
     * disk is no longer connected to the gateway), or mismatch (the disk node
     * is occupied by a disk that has incorrect metadata or the disk content is
     * corrupted).
     * </p>
     * 
     * @param listLocalDisksRequest
     *        A JSON object containing the of the gateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLocalDisks
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListLocalDisks
     */
    java.util.concurrent.Future<ListLocalDisksResult> listLocalDisksAsync(
            ListLocalDisksRequest listLocalDisksRequest,
            com.amazonaws.handlers.AsyncHandler<ListLocalDisksRequest, ListLocalDisksResult> asyncHandler);

    /**
     * <p>
     * This operation lists the tags that have been added to the specified
     * resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceInput
     * @return A Java Future containing the result of the ListTagsForResource
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * This operation lists the tags that have been added to the specified
     * resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTagsForResource operation.
     *
     * @see #listTagsForResourceAsync(ListTagsForResourceRequest)
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync();

    /**
     * Simplified method form for invoking the ListTagsForResource operation
     * with an AsyncHandler.
     *
     * @see #listTagsForResourceAsync(ListTagsForResourceRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * This operation lists iSCSI initiators that are connected to a volume. You
     * can use this operation to determine whether a volume is being used or
     * not.
     * </p>
     * 
     * @param listVolumeInitiatorsRequest
     *        ListVolumeInitiatorsInput
     * @return A Java Future containing the result of the ListVolumeInitiators
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListVolumeInitiators
     */
    java.util.concurrent.Future<ListVolumeInitiatorsResult> listVolumeInitiatorsAsync(
            ListVolumeInitiatorsRequest listVolumeInitiatorsRequest);

    /**
     * <p>
     * This operation lists iSCSI initiators that are connected to a volume. You
     * can use this operation to determine whether a volume is being used or
     * not.
     * </p>
     * 
     * @param listVolumeInitiatorsRequest
     *        ListVolumeInitiatorsInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVolumeInitiators
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListVolumeInitiators
     */
    java.util.concurrent.Future<ListVolumeInitiatorsResult> listVolumeInitiatorsAsync(
            ListVolumeInitiatorsRequest listVolumeInitiatorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVolumeInitiatorsRequest, ListVolumeInitiatorsResult> asyncHandler);

    /**
     * <p>
     * This operation lists the recovery points for a specified gateway. This
     * operation is supported only for the gateway-cached volume architecture.
     * </p>
     * <p>
     * Each gateway-cached volume has one recovery point. A volume recovery
     * point is a point in time at which all data of the volume is consistent
     * and from which you can create a snapshot. To create a snapshot from a
     * volume recovery point use the
     * <a>CreateSnapshotFromVolumeRecoveryPoint</a> operation.
     * </p>
     * 
     * @param listVolumeRecoveryPointsRequest
     * @return A Java Future containing the result of the
     *         ListVolumeRecoveryPoints operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListVolumeRecoveryPoints
     */
    java.util.concurrent.Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(
            ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest);

    /**
     * <p>
     * This operation lists the recovery points for a specified gateway. This
     * operation is supported only for the gateway-cached volume architecture.
     * </p>
     * <p>
     * Each gateway-cached volume has one recovery point. A volume recovery
     * point is a point in time at which all data of the volume is consistent
     * and from which you can create a snapshot. To create a snapshot from a
     * volume recovery point use the
     * <a>CreateSnapshotFromVolumeRecoveryPoint</a> operation.
     * </p>
     * 
     * @param listVolumeRecoveryPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListVolumeRecoveryPoints operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListVolumeRecoveryPoints
     */
    java.util.concurrent.Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(
            ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVolumeRecoveryPointsRequest, ListVolumeRecoveryPointsResult> asyncHandler);

    /**
     * <p>
     * This operation lists the iSCSI stored volumes of a gateway. Results are
     * sorted by volume ARN. The response includes only the volume ARNs. If you
     * want additional volume information, use the
     * <a>DescribeStorediSCSIVolumes</a> API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a
     * maximum of up to 100 volumes. You can optionally specify the
     * <code>Limit</code> field in the body to limit the number of volumes in
     * the response. If the number of volumes returned in the response is
     * truncated, the response includes a Marker field. You can use this Marker
     * value in your subsequent request to retrieve the next set of volumes.
     * </p>
     * 
     * @param listVolumesRequest
     *        A JSON object that contains one or more of the following
     *        fields:</p>
     *        <ul>
     *        <li><a>ListVolumesInput$Limit</a></li>
     *        <li><a>ListVolumesInput$Marker</a></li>
     * @return A Java Future containing the result of the ListVolumes operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsync.ListVolumes
     */
    java.util.concurrent.Future<ListVolumesResult> listVolumesAsync(
            ListVolumesRequest listVolumesRequest);

    /**
     * <p>
     * This operation lists the iSCSI stored volumes of a gateway. Results are
     * sorted by volume ARN. The response includes only the volume ARNs. If you
     * want additional volume information, use the
     * <a>DescribeStorediSCSIVolumes</a> API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a
     * maximum of up to 100 volumes. You can optionally specify the
     * <code>Limit</code> field in the body to limit the number of volumes in
     * the response. If the number of volumes returned in the response is
     * truncated, the response includes a Marker field. You can use this Marker
     * value in your subsequent request to retrieve the next set of volumes.
     * </p>
     * 
     * @param listVolumesRequest
     *        A JSON object that contains one or more of the following
     *        fields:</p>
     *        <ul>
     *        <li><a>ListVolumesInput$Limit</a></li>
     *        <li><a>ListVolumesInput$Marker</a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVolumes operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListVolumes
     */
    java.util.concurrent.Future<ListVolumesResult> listVolumesAsync(
            ListVolumesRequest listVolumesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVolumesRequest, ListVolumesResult> asyncHandler);

    /**
     * <p>
     * This operation removes one or more tags from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        RemoveTagsFromResourceInput
     * @return A Java Future containing the result of the RemoveTagsFromResource
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.RemoveTagsFromResource
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * This operation removes one or more tags from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        RemoveTagsFromResourceInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.RemoveTagsFromResource
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * Simplified method form for invoking the RemoveTagsFromResource operation.
     *
     * @see #removeTagsFromResourceAsync(RemoveTagsFromResourceRequest)
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync();

    /**
     * Simplified method form for invoking the RemoveTagsFromResource operation
     * with an AsyncHandler.
     *
     * @see #removeTagsFromResourceAsync(RemoveTagsFromResourceRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * This operation resets all cache disks that have encountered a error and
     * makes the disks available for reconfiguration as cache storage. If your
     * cache disk encounters a error, the gateway prevents read and write
     * operations on virtual tapes in the gateway. For example, an error can
     * occur when a disk is corrupted or removed from the gateway. When a cache
     * is reset, the gateway loses its cache storage. At this point you can
     * reconfigure the disks as cache disks.
     * </p>
     * <important>
     * <p>
     * If the cache disk you are resetting contains data that has not been
     * uploaded to Amazon S3 yet, that data can be lost. After you reset cache
     * disks, there will be no configured cache disks left in the gateway, so
     * you must configure at least one new cache disk for your gateway to
     * function properly.
     * </p>
     * </important>
     * 
     * @param resetCacheRequest
     * @return A Java Future containing the result of the ResetCache operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsync.ResetCache
     */
    java.util.concurrent.Future<ResetCacheResult> resetCacheAsync(
            ResetCacheRequest resetCacheRequest);

    /**
     * <p>
     * This operation resets all cache disks that have encountered a error and
     * makes the disks available for reconfiguration as cache storage. If your
     * cache disk encounters a error, the gateway prevents read and write
     * operations on virtual tapes in the gateway. For example, an error can
     * occur when a disk is corrupted or removed from the gateway. When a cache
     * is reset, the gateway loses its cache storage. At this point you can
     * reconfigure the disks as cache disks.
     * </p>
     * <important>
     * <p>
     * If the cache disk you are resetting contains data that has not been
     * uploaded to Amazon S3 yet, that data can be lost. After you reset cache
     * disks, there will be no configured cache disks left in the gateway, so
     * you must configure at least one new cache disk for your gateway to
     * function properly.
     * </p>
     * </important>
     * 
     * @param resetCacheRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetCache operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ResetCache
     */
    java.util.concurrent.Future<ResetCacheResult> resetCacheAsync(
            ResetCacheRequest resetCacheRequest,
            com.amazonaws.handlers.AsyncHandler<ResetCacheRequest, ResetCacheResult> asyncHandler);

    /**
     * <p>
     * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a
     * gateway-VTL. Virtual tapes archived in the VTS are not associated with
     * any gateway. However after a tape is retrieved, it is associated with a
     * gateway, even though it is also listed in the VTS.
     * </p>
     * <p>
     * Once a tape is successfully retrieved to a gateway, it cannot be
     * retrieved again to another gateway. You must archive the tape again
     * before you can retrieve it to another gateway.
     * </p>
     * 
     * @param retrieveTapeArchiveRequest
     *        RetrieveTapeArchiveInput
     * @return A Java Future containing the result of the RetrieveTapeArchive
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.RetrieveTapeArchive
     */
    java.util.concurrent.Future<RetrieveTapeArchiveResult> retrieveTapeArchiveAsync(
            RetrieveTapeArchiveRequest retrieveTapeArchiveRequest);

    /**
     * <p>
     * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a
     * gateway-VTL. Virtual tapes archived in the VTS are not associated with
     * any gateway. However after a tape is retrieved, it is associated with a
     * gateway, even though it is also listed in the VTS.
     * </p>
     * <p>
     * Once a tape is successfully retrieved to a gateway, it cannot be
     * retrieved again to another gateway. You must archive the tape again
     * before you can retrieve it to another gateway.
     * </p>
     * 
     * @param retrieveTapeArchiveRequest
     *        RetrieveTapeArchiveInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetrieveTapeArchive
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.RetrieveTapeArchive
     */
    java.util.concurrent.Future<RetrieveTapeArchiveResult> retrieveTapeArchiveAsync(
            RetrieveTapeArchiveRequest retrieveTapeArchiveRequest,
            com.amazonaws.handlers.AsyncHandler<RetrieveTapeArchiveRequest, RetrieveTapeArchiveResult> asyncHandler);

    /**
     * <p>
     * Retrieves the recovery point for the specified virtual tape.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all
     * the data on the tape is consistent. If your gateway crashes, virtual
     * tapes that have recovery points can be recovered to a new gateway.
     * </p>
     * <note>The virtual tape can be retrieved to only one gateway. The
     * retrieved tape is read-only. The virtual tape can be retrieved to only a
     * gateway-VTL. There is no charge for retrieving recovery points.</note>
     * 
     * @param retrieveTapeRecoveryPointRequest
     *        RetrieveTapeRecoveryPointInput
     * @return A Java Future containing the result of the
     *         RetrieveTapeRecoveryPoint operation returned by the service.
     * @sample AWSStorageGatewayAsync.RetrieveTapeRecoveryPoint
     */
    java.util.concurrent.Future<RetrieveTapeRecoveryPointResult> retrieveTapeRecoveryPointAsync(
            RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest);

    /**
     * <p>
     * Retrieves the recovery point for the specified virtual tape.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all
     * the data on the tape is consistent. If your gateway crashes, virtual
     * tapes that have recovery points can be recovered to a new gateway.
     * </p>
     * <note>The virtual tape can be retrieved to only one gateway. The
     * retrieved tape is read-only. The virtual tape can be retrieved to only a
     * gateway-VTL. There is no charge for retrieving recovery points.</note>
     * 
     * @param retrieveTapeRecoveryPointRequest
     *        RetrieveTapeRecoveryPointInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         RetrieveTapeRecoveryPoint operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.RetrieveTapeRecoveryPoint
     */
    java.util.concurrent.Future<RetrieveTapeRecoveryPointResult> retrieveTapeRecoveryPointAsync(
            RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest,
            com.amazonaws.handlers.AsyncHandler<RetrieveTapeRecoveryPointRequest, RetrieveTapeRecoveryPointResult> asyncHandler);

    /**
     * <p>
     * This operation shuts down a gateway. To specify which gateway to shut
     * down, use the Amazon Resource Name (ARN) of the gateway in the body of
     * your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the
     * storage gateway's virtual machine (VM) and not the VM.
     * </p>
     * <note>If you want to shut down the VM, it is recommended that you first
     * shut down the gateway component in the VM to avoid unpredictable
     * conditions.</note>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except
     * <a>StartGateway</a>, <a>DescribeGatewayInformation</a>, and
     * <a>ListGateways</a>. For more information, see <a>ActivateGateway</a>.
     * Your applications cannot read from or write to the gateway's storage
     * volumes, and there are no snapshots taken.
     * </p>
     * <note>When you make a shutdown request, you will get a
     * <code>200 OK</code> success response immediately. However, it might take
     * some time for the gateway to shut down. You can call the
     * <a>DescribeGatewayInformation</a> API to check the status. For more
     * information, see <a>ActivateGateway</a>.</note>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway
     * (using <a>DeleteGateway</a>) to no longer pay software charges associated
     * with the gateway.
     * </p>
     * 
     * @param shutdownGatewayRequest
     *        A JSON object containing the of the gateway to shut down.
     * @return A Java Future containing the result of the ShutdownGateway
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.ShutdownGateway
     */
    java.util.concurrent.Future<ShutdownGatewayResult> shutdownGatewayAsync(
            ShutdownGatewayRequest shutdownGatewayRequest);

    /**
     * <p>
     * This operation shuts down a gateway. To specify which gateway to shut
     * down, use the Amazon Resource Name (ARN) of the gateway in the body of
     * your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the
     * storage gateway's virtual machine (VM) and not the VM.
     * </p>
     * <note>If you want to shut down the VM, it is recommended that you first
     * shut down the gateway component in the VM to avoid unpredictable
     * conditions.</note>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except
     * <a>StartGateway</a>, <a>DescribeGatewayInformation</a>, and
     * <a>ListGateways</a>. For more information, see <a>ActivateGateway</a>.
     * Your applications cannot read from or write to the gateway's storage
     * volumes, and there are no snapshots taken.
     * </p>
     * <note>When you make a shutdown request, you will get a
     * <code>200 OK</code> success response immediately. However, it might take
     * some time for the gateway to shut down. You can call the
     * <a>DescribeGatewayInformation</a> API to check the status. For more
     * information, see <a>ActivateGateway</a>.</note>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway
     * (using <a>DeleteGateway</a>) to no longer pay software charges associated
     * with the gateway.
     * </p>
     * 
     * @param shutdownGatewayRequest
     *        A JSON object containing the of the gateway to shut down.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ShutdownGateway
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ShutdownGateway
     */
    java.util.concurrent.Future<ShutdownGatewayResult> shutdownGatewayAsync(
            ShutdownGatewayRequest shutdownGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<ShutdownGatewayRequest, ShutdownGatewayResult> asyncHandler);

    /**
     * <p>
     * This operation starts a gateway that you previously shut down (see
     * <a>ShutdownGateway</a>). After the gateway starts, you can then make
     * other API calls, your applications can read from or write to the
     * gateway's storage volumes and you will be able to take snapshot backups.
     * </p>
     * <note>When you make a request, you will get a 200 OK success response
     * immediately. However, it might take some time for the gateway to be
     * ready. You should call <a>DescribeGatewayInformation</a> and check the
     * status before making any additional API calls. For more information, see
     * <a>ActivateGateway</a>.</note>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN) of
     * the gateway in your request.
     * </p>
     * 
     * @param startGatewayRequest
     *        A JSON object containing the of the gateway to start.
     * @return A Java Future containing the result of the StartGateway operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsync.StartGateway
     */
    java.util.concurrent.Future<StartGatewayResult> startGatewayAsync(
            StartGatewayRequest startGatewayRequest);

    /**
     * <p>
     * This operation starts a gateway that you previously shut down (see
     * <a>ShutdownGateway</a>). After the gateway starts, you can then make
     * other API calls, your applications can read from or write to the
     * gateway's storage volumes and you will be able to take snapshot backups.
     * </p>
     * <note>When you make a request, you will get a 200 OK success response
     * immediately. However, it might take some time for the gateway to be
     * ready. You should call <a>DescribeGatewayInformation</a> and check the
     * status before making any additional API calls. For more information, see
     * <a>ActivateGateway</a>.</note>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN) of
     * the gateway in your request.
     * </p>
     * 
     * @param startGatewayRequest
     *        A JSON object containing the of the gateway to start.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartGateway operation
     *         returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.StartGateway
     */
    java.util.concurrent.Future<StartGatewayResult> startGatewayAsync(
            StartGatewayRequest startGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<StartGatewayRequest, StartGatewayResult> asyncHandler);

    /**
     * <p>
     * This operation updates the bandwidth rate limits of a gateway. You can
     * update both the upload and download bandwidth rate limit or specify only
     * one of the two. If you don't set a bandwidth rate limit, the existing
     * rate limit remains.
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you don't
     * set any limit, the gateway does not have any limitations on its bandwidth
     * usage and could potentially use the maximum available bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN) of
     * the gateway in your request.
     * </p>
     * 
     * @param updateBandwidthRateLimitRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <a>UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec
     *        </a></li>
     *        <li>
     *        <a>UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec
     *        </a></li>
     * @return A Java Future containing the result of the
     *         UpdateBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateBandwidthRateLimit
     */
    java.util.concurrent.Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(
            UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest);

    /**
     * <p>
     * This operation updates the bandwidth rate limits of a gateway. You can
     * update both the upload and download bandwidth rate limit or specify only
     * one of the two. If you don't set a bandwidth rate limit, the existing
     * rate limit remains.
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you don't
     * set any limit, the gateway does not have any limitations on its bandwidth
     * usage and could potentially use the maximum available bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN) of
     * the gateway in your request.
     * </p>
     * 
     * @param updateBandwidthRateLimitRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <a>UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec
     *        </a></li>
     *        <li>
     *        <a>UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec
     *        </a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateBandwidthRateLimit
     */
    java.util.concurrent.Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(
            UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBandwidthRateLimitRequest, UpdateBandwidthRateLimitResult> asyncHandler);

    /**
     * <p>
     * This operation updates the Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target. By default, a gateway
     * does not have CHAP enabled; however, for added security, you might use
     * it.
     * </p>
     * <important>
     * <p>
     * When you update CHAP credentials, all existing connections on the target
     * are closed and initiators must reconnect with the new credentials.
     * </p>
     * </important>
     * 
     * @param updateChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>UpdateChapCredentialsInput$InitiatorName</a></li>
     *        <li>
     *        <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a></li>
     *        <li><a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a></li>
     *        <li><a>UpdateChapCredentialsInput$TargetARN</a></li>
     * @return A Java Future containing the result of the UpdateChapCredentials
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateChapCredentials
     */
    java.util.concurrent.Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(
            UpdateChapCredentialsRequest updateChapCredentialsRequest);

    /**
     * <p>
     * This operation updates the Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target. By default, a gateway
     * does not have CHAP enabled; however, for added security, you might use
     * it.
     * </p>
     * <important>
     * <p>
     * When you update CHAP credentials, all existing connections on the target
     * are closed and initiators must reconnect with the new credentials.
     * </p>
     * </important>
     * 
     * @param updateChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>UpdateChapCredentialsInput$InitiatorName</a></li>
     *        <li>
     *        <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a></li>
     *        <li><a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a></li>
     *        <li><a>UpdateChapCredentialsInput$TargetARN</a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChapCredentials
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateChapCredentials
     */
    java.util.concurrent.Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(
            UpdateChapCredentialsRequest updateChapCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChapCredentialsRequest, UpdateChapCredentialsResult> asyncHandler);

    /**
     * <p>
     * This operation updates a gateway's metadata, which includes the gateway's
     * name and time zone. To specify which gateway to update, use the Amazon
     * Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param updateGatewayInformationRequest
     * @return A Java Future containing the result of the
     *         UpdateGatewayInformation operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateGatewayInformation
     */
    java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(
            UpdateGatewayInformationRequest updateGatewayInformationRequest);

    /**
     * <p>
     * This operation updates a gateway's metadata, which includes the gateway's
     * name and time zone. To specify which gateway to update, use the Amazon
     * Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param updateGatewayInformationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateGatewayInformation operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateGatewayInformation
     */
    java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(
            UpdateGatewayInformationRequest updateGatewayInformationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewayInformationRequest, UpdateGatewayInformationResult> asyncHandler);

    /**
     * <p>
     * This operation updates the gateway virtual machine (VM) software. The
     * request immediately triggers the software update.
     * </p>
     * <note>When you make this request, you get a <code>200 OK</code> success
     * response immediately. However, it might take some time for the update to
     * complete. You can call <a>DescribeGatewayInformation</a> to verify the
     * gateway is in the <code>STATE_RUNNING</code> state.</note> <important>A
     * software update forces a system restart of your gateway. You can minimize
     * the chance of any disruption to your applications by increasing your
     * iSCSI Initiators' timeouts. For more information about increasing iSCSI
     * Initiator timeouts for Windows and Linux, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorWindowsClient.html#CustomizeWindowsiSCSISettings"
     * >Customizing Your Windows iSCSI Settings</a> and <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorRedHatClient.html#CustomizeLinuxiSCSISettings"
     * >Customizing Your Linux iSCSI Settings</a>, respectively.</important>
     * 
     * @param updateGatewaySoftwareNowRequest
     *        A JSON object containing the of the gateway to update.
     * @return A Java Future containing the result of the
     *         UpdateGatewaySoftwareNow operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateGatewaySoftwareNow
     */
    java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(
            UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest);

    /**
     * <p>
     * This operation updates the gateway virtual machine (VM) software. The
     * request immediately triggers the software update.
     * </p>
     * <note>When you make this request, you get a <code>200 OK</code> success
     * response immediately. However, it might take some time for the update to
     * complete. You can call <a>DescribeGatewayInformation</a> to verify the
     * gateway is in the <code>STATE_RUNNING</code> state.</note> <important>A
     * software update forces a system restart of your gateway. You can minimize
     * the chance of any disruption to your applications by increasing your
     * iSCSI Initiators' timeouts. For more information about increasing iSCSI
     * Initiator timeouts for Windows and Linux, see <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorWindowsClient.html#CustomizeWindowsiSCSISettings"
     * >Customizing Your Windows iSCSI Settings</a> and <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorRedHatClient.html#CustomizeLinuxiSCSISettings"
     * >Customizing Your Linux iSCSI Settings</a>, respectively.</important>
     * 
     * @param updateGatewaySoftwareNowRequest
     *        A JSON object containing the of the gateway to update.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateGatewaySoftwareNow operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateGatewaySoftwareNow
     */
    java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(
            UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewaySoftwareNowRequest, UpdateGatewaySoftwareNowResult> asyncHandler);

    /**
     * <p>
     * This operation updates a gateway's weekly maintenance start time
     * information, including day and time of the week. The maintenance time is
     * the time in your gateway's time zone.
     * </p>
     * 
     * @param updateMaintenanceStartTimeRequest
     *        A JSON object containing the following fields:</p>
     *        <ul>
     *        <li><a>UpdateMaintenanceStartTimeInput$DayOfWeek</a></li>
     *        <li><a>UpdateMaintenanceStartTimeInput$HourOfDay</a></li>
     *        <li><a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a></li>
     * @return A Java Future containing the result of the
     *         UpdateMaintenanceStartTime operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateMaintenanceStartTime
     */
    java.util.concurrent.Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(
            UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest);

    /**
     * <p>
     * This operation updates a gateway's weekly maintenance start time
     * information, including day and time of the week. The maintenance time is
     * the time in your gateway's time zone.
     * </p>
     * 
     * @param updateMaintenanceStartTimeRequest
     *        A JSON object containing the following fields:</p>
     *        <ul>
     *        <li><a>UpdateMaintenanceStartTimeInput$DayOfWeek</a></li>
     *        <li><a>UpdateMaintenanceStartTimeInput$HourOfDay</a></li>
     *        <li><a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateMaintenanceStartTime operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateMaintenanceStartTime
     */
    java.util.concurrent.Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(
            UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceStartTimeRequest, UpdateMaintenanceStartTimeResult> asyncHandler);

    /**
     * <p>
     * This operation updates a snapshot schedule configured for a gateway
     * volume.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours, starting
     * at the creation time of the volume. You can use this API to change the
     * snapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot
     * schedule you want to update, and the schedule information, including when
     * you want the snapshot to begin on a day and the frequency (in hours) of
     * snapshots.
     * </p>
     * 
     * @param updateSnapshotScheduleRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>UpdateSnapshotScheduleInput$Description</a></li>
     *        <li><a>UpdateSnapshotScheduleInput$RecurrenceInHours</a></li>
     *        <li><a>UpdateSnapshotScheduleInput$StartAt</a></li>
     *        <li><a>UpdateSnapshotScheduleInput$VolumeARN</a></li>
     * @return A Java Future containing the result of the UpdateSnapshotSchedule
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateSnapshotSchedule
     */
    java.util.concurrent.Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(
            UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest);

    /**
     * <p>
     * This operation updates a snapshot schedule configured for a gateway
     * volume.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours, starting
     * at the creation time of the volume. You can use this API to change the
     * snapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot
     * schedule you want to update, and the schedule information, including when
     * you want the snapshot to begin on a day and the frequency (in hours) of
     * snapshots.
     * </p>
     * 
     * @param updateSnapshotScheduleRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li><a>UpdateSnapshotScheduleInput$Description</a></li>
     *        <li><a>UpdateSnapshotScheduleInput$RecurrenceInHours</a></li>
     *        <li><a>UpdateSnapshotScheduleInput$StartAt</a></li>
     *        <li><a>UpdateSnapshotScheduleInput$VolumeARN</a></li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSnapshotSchedule
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateSnapshotSchedule
     */
    java.util.concurrent.Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(
            UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSnapshotScheduleRequest, UpdateSnapshotScheduleResult> asyncHandler);

    /**
     * <p>
     * This operation updates the type of medium changer in a gateway-VTL. When
     * you activate a gateway-VTL, you select a medium changer type for the
     * gateway-VTL. This operation enables you to select a different type of
     * medium changer after a gateway-VTL is activated.
     * </p>
     * 
     * @param updateVTLDeviceTypeRequest
     *        UpdateVTLDeviceTypeInput
     * @return A Java Future containing the result of the UpdateVTLDeviceType
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateVTLDeviceType
     */
    java.util.concurrent.Future<UpdateVTLDeviceTypeResult> updateVTLDeviceTypeAsync(
            UpdateVTLDeviceTypeRequest updateVTLDeviceTypeRequest);

    /**
     * <p>
     * This operation updates the type of medium changer in a gateway-VTL. When
     * you activate a gateway-VTL, you select a medium changer type for the
     * gateway-VTL. This operation enables you to select a different type of
     * medium changer after a gateway-VTL is activated.
     * </p>
     * 
     * @param updateVTLDeviceTypeRequest
     *        UpdateVTLDeviceTypeInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVTLDeviceType
     *         operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateVTLDeviceType
     */
    java.util.concurrent.Future<UpdateVTLDeviceTypeResult> updateVTLDeviceTypeAsync(
            UpdateVTLDeviceTypeRequest updateVTLDeviceTypeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVTLDeviceTypeRequest, UpdateVTLDeviceTypeResult> asyncHandler);

}
