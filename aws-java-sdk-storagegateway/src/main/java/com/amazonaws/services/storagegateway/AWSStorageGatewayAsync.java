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
package com.amazonaws.services.storagegateway;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;

/**
 * Interface for accessing AWS Storage Gateway asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.storagegateway.AbstractAWSStorageGatewayAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Storage Gateway Service</fullname>
 * <p>
 * AWS Storage Gateway is the service that connects an on-premises software appliance with cloud-based storage to
 * provide seamless and secure integration between an organization's on-premises IT environment and the AWS storage
 * infrastructure. The service enables you to securely upload data to the AWS cloud for cost effective backup and rapid
 * disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway Service API Reference</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#AWSStorageGatewayHTTPRequestsHeaders"
 * >AWS Storage Gateway Required Request Headers</a>: Describes the required headers that you must send with every POST
 * request to AWS Storage Gateway.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#AWSStorageGatewaySigningRequests"
 * >Signing Requests</a>: AWS Storage Gateway requires that you authenticate every request you send; this topic
 * describes how sign such a request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#APIErrorResponses">
 * Error Responses</a>: Provides reference information about AWS Storage Gateway errors.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_Operations.html">Operations in AWS
 * Storage Gateway</a>: Contains detailed descriptions of all AWS Storage Gateway operations, their request parameters,
 * response elements, possible errors, and examples of requests and responses.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS Storage Gateway Regions and
 * Endpoints:</a> Provides a list of each AWS region and endpoints available for use with AWS Storage Gateway.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * AWS Storage Gateway resource IDs are in uppercase. When you use these resource IDs with the Amazon EC2 API, EC2
 * expects resource IDs in lowercase. You must change your resource ID to lowercase to use it with the EC2 API. For
 * example, in Storage Gateway the ID for a volume might be <code>vol-AA22BB012345DAF670</code>. When you use this ID
 * with the EC2 API, you must change it to <code>vol-aa22bb012345daf670</code>. Otherwise, the EC2 API might not behave
 * as expected.
 * </p>
 * </note> <important>
 * <p>
 * IDs for Storage Gateway volumes and Amazon EBS snapshots created from gateway volumes are changing to a longer
 * format. Starting in December 2016, all new volumes and snapshots will be created with a 17-character string. Starting
 * in April 2016, you will be able to use these longer IDs so you can test your systems with the new format. For more
 * information, see <a href="https://aws.amazon.com/ec2/faqs/#longer-ids">Longer EC2 and EBS Resource IDs</a>.
 * </p>
 * <p>
 * For example, a volume Amazon Resource Name (ARN) with the longer volume ID format looks like the following:
 * </p>
 * <p>
 * <code>arn:aws:storagegateway:us-west-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABBCCDDEEFFG</code>.
 * </p>
 * <p>
 * A snapshot ID with the longer ID format looks like the following: <code>snap-78e226633445566ee</code>.
 * </p>
 * <p>
 * For more information, see <a href="https://forums.aws.amazon.com/ann.jspa?annID=3557">Announcement: Heads-up – Longer
 * AWS Storage Gateway volume and snapshot IDs coming in 2016</a>.
 * </p>
 * </important>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSStorageGatewayAsync extends AWSStorageGateway {

    /**
     * <p>
     * Activates the gateway you previously deployed on your host. In the activation process, you specify information
     * such as the region you want to use for storing snapshots or tapes, the time zone for scheduled snapshots the
     * gateway snapshot schedule window, an activation key, and a name for your gateway. The activation process also
     * associates your gateway with your account; for more information, see <a>UpdateGatewayInformation</a>.
     * </p>
     * <note>
     * <p>
     * You must turn on the gateway VM before you can activate your gateway.
     * </p>
     * </note>
     * 
     * @param activateGatewayRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$ActivationKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayName</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayRegion</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayTimezone</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayType</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$TapeDriveType</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$MediumChangerType</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the ActivateGateway operation returned by the service.
     * @sample AWSStorageGatewayAsync.ActivateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ActivateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ActivateGatewayResult> activateGatewayAsync(ActivateGatewayRequest activateGatewayRequest);

    /**
     * <p>
     * Activates the gateway you previously deployed on your host. In the activation process, you specify information
     * such as the region you want to use for storing snapshots or tapes, the time zone for scheduled snapshots the
     * gateway snapshot schedule window, an activation key, and a name for your gateway. The activation process also
     * associates your gateway with your account; for more information, see <a>UpdateGatewayInformation</a>.
     * </p>
     * <note>
     * <p>
     * You must turn on the gateway VM before you can activate your gateway.
     * </p>
     * </note>
     * 
     * @param activateGatewayRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$ActivationKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayName</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayRegion</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayTimezone</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$GatewayType</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$TapeDriveType</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ActivateGatewayInput$MediumChangerType</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ActivateGateway operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ActivateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ActivateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ActivateGatewayResult> activateGatewayAsync(ActivateGatewayRequest activateGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<ActivateGatewayRequest, ActivateGatewayResult> asyncHandler);

    /**
     * <p>
     * Configures one or more gateway local disks as cache for a gateway. This operation is only supported in the cached
     * volume, tape and file gateway type (see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html">Storage Gateway
     * Concepts</a>).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache, and one or
     * more disk IDs that you want to configure as cache.
     * </p>
     * 
     * @param addCacheRequest
     * @return A Java Future containing the result of the AddCache operation returned by the service.
     * @sample AWSStorageGatewayAsync.AddCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddCacheResult> addCacheAsync(AddCacheRequest addCacheRequest);

    /**
     * <p>
     * Configures one or more gateway local disks as cache for a gateway. This operation is only supported in the cached
     * volume, tape and file gateway type (see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html">Storage Gateway
     * Concepts</a>).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache, and one or
     * more disk IDs that you want to configure as cache.
     * </p>
     * 
     * @param addCacheRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddCache operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.AddCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddCacheResult> addCacheAsync(AddCacheRequest addCacheRequest,
            com.amazonaws.handlers.AsyncHandler<AddCacheRequest, AddCacheResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to the specified resource. You use tags to add metadata to resources, which you can use to
     * categorize these resources. For example, you can categorize resources by purpose, owner, environment, or team.
     * Each tag consists of a key and a value, which you define. You can add tags to the following AWS Storage Gateway
     * resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Storage gateways of all types
     * </p>
     * </li>
     * <li>
     * <p>
     * Storage volumes
     * </p>
     * </li>
     * <li>
     * <p>
     * Virtual tapes
     * </p>
     * </li>
     * <li>
     * <p>
     * NFS and SMB file shares
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a maximum of 50 tags for each resource. Virtual tapes and storage volumes that are recovered to a
     * new gateway maintain their tags.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        AddTagsToResourceInput
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSStorageGatewayAsync.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddTagsToResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Adds one or more tags to the specified resource. You use tags to add metadata to resources, which you can use to
     * categorize these resources. For example, you can categorize resources by purpose, owner, environment, or team.
     * Each tag consists of a key and a value, which you define. You can add tags to the following AWS Storage Gateway
     * resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Storage gateways of all types
     * </p>
     * </li>
     * <li>
     * <p>
     * Storage volumes
     * </p>
     * </li>
     * <li>
     * <p>
     * Virtual tapes
     * </p>
     * </li>
     * <li>
     * <p>
     * NFS and SMB file shares
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a maximum of 50 tags for each resource. Virtual tapes and storage volumes that are recovered to a
     * new gateway maintain their tags.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        AddTagsToResourceInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddTagsToResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Configures one or more gateway local disks as upload buffer for a specified gateway. This operation is supported
     * for the stored volume, cached volume and tape gateway types.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, and
     * one or more disk IDs that you want to configure as upload buffer.
     * </p>
     * 
     * @param addUploadBufferRequest
     * @return A Java Future containing the result of the AddUploadBuffer operation returned by the service.
     * @sample AWSStorageGatewayAsync.AddUploadBuffer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddUploadBuffer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddUploadBufferResult> addUploadBufferAsync(AddUploadBufferRequest addUploadBufferRequest);

    /**
     * <p>
     * Configures one or more gateway local disks as upload buffer for a specified gateway. This operation is supported
     * for the stored volume, cached volume and tape gateway types.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, and
     * one or more disk IDs that you want to configure as upload buffer.
     * </p>
     * 
     * @param addUploadBufferRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddUploadBuffer operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.AddUploadBuffer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddUploadBuffer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddUploadBufferResult> addUploadBufferAsync(AddUploadBufferRequest addUploadBufferRequest,
            com.amazonaws.handlers.AsyncHandler<AddUploadBufferRequest, AddUploadBufferResult> asyncHandler);

    /**
     * <p>
     * Configures one or more gateway local disks as working storage for a gateway. This operation is only supported in
     * the stored volume gateway type. This operation is deprecated in cached volume API version 20120630. Use
     * <a>AddUploadBuffer</a> instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use the <a>AddUploadBuffer</a> operation to
     * add upload buffer to a stored volume gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add working storage, and
     * one or more disk IDs that you want to configure as working storage.
     * </p>
     * 
     * @param addWorkingStorageRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>AddWorkingStorageInput$DiskIds</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the AddWorkingStorage operation returned by the service.
     * @sample AWSStorageGatewayAsync.AddWorkingStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddWorkingStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddWorkingStorageResult> addWorkingStorageAsync(AddWorkingStorageRequest addWorkingStorageRequest);

    /**
     * <p>
     * Configures one or more gateway local disks as working storage for a gateway. This operation is only supported in
     * the stored volume gateway type. This operation is deprecated in cached volume API version 20120630. Use
     * <a>AddUploadBuffer</a> instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use the <a>AddUploadBuffer</a> operation to
     * add upload buffer to a stored volume gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add working storage, and
     * one or more disk IDs that you want to configure as working storage.
     * </p>
     * 
     * @param addWorkingStorageRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>AddWorkingStorageInput$DiskIds</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddWorkingStorage operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.AddWorkingStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddWorkingStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddWorkingStorageResult> addWorkingStorageAsync(AddWorkingStorageRequest addWorkingStorageRequest,
            com.amazonaws.handlers.AsyncHandler<AddWorkingStorageRequest, AddWorkingStorageResult> asyncHandler);

    /**
     * <p>
     * Connects a volume to an iSCSI connection and then attaches the volume to the specified gateway. Detaching and
     * attaching a volume enables you to recover your data from one gateway to a different gateway without creating a
     * snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an
     * Amazon EC2 instance.
     * </p>
     * 
     * @param attachVolumeRequest
     *        AttachVolumeInput
     * @return A Java Future containing the result of the AttachVolume operation returned by the service.
     * @sample AWSStorageGatewayAsync.AttachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AttachVolume" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest attachVolumeRequest);

    /**
     * <p>
     * Connects a volume to an iSCSI connection and then attaches the volume to the specified gateway. Detaching and
     * attaching a volume enables you to recover your data from one gateway to a different gateway without creating a
     * snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an
     * Amazon EC2 instance.
     * </p>
     * 
     * @param attachVolumeRequest
     *        AttachVolumeInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachVolume operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.AttachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AttachVolume" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest attachVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<AttachVolumeRequest, AttachVolumeResult> asyncHandler);

    /**
     * <p>
     * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated.
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param cancelArchivalRequest
     *        CancelArchivalInput
     * @return A Java Future containing the result of the CancelArchival operation returned by the service.
     * @sample AWSStorageGatewayAsync.CancelArchival
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CancelArchival" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelArchivalResult> cancelArchivalAsync(CancelArchivalRequest cancelArchivalRequest);

    /**
     * <p>
     * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated.
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param cancelArchivalRequest
     *        CancelArchivalInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelArchival operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CancelArchival
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CancelArchival" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelArchivalResult> cancelArchivalAsync(CancelArchivalRequest cancelArchivalRequest,
            com.amazonaws.handlers.AsyncHandler<CancelArchivalRequest, CancelArchivalResult> asyncHandler);

    /**
     * <p>
     * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is
     * initiated. The virtual tape is returned to the VTS. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param cancelRetrievalRequest
     *        CancelRetrievalInput
     * @return A Java Future containing the result of the CancelRetrieval operation returned by the service.
     * @sample AWSStorageGatewayAsync.CancelRetrieval
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CancelRetrieval" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelRetrievalResult> cancelRetrievalAsync(CancelRetrievalRequest cancelRetrievalRequest);

    /**
     * <p>
     * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is
     * initiated. The virtual tape is returned to the VTS. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param cancelRetrievalRequest
     *        CancelRetrievalInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelRetrieval operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CancelRetrieval
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CancelRetrieval" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelRetrievalResult> cancelRetrievalAsync(CancelRetrievalRequest cancelRetrievalRequest,
            com.amazonaws.handlers.AsyncHandler<CancelRetrievalRequest, CancelRetrievalResult> asyncHandler);

    /**
     * <p>
     * Creates a cached volume on a specified cached volume gateway. This operation is only supported in the cached
     * volume gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a cached volume. Use the <a>AddCache</a>
     * operation to add cache storage to a gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you must specify the gateway, size of the volume in bytes, the iSCSI target name, an IP address
     * on which to expose the target, and a unique client token. In response, the gateway creates the volume and returns
     * information about it. This information includes the volume Amazon Resource Name (ARN), its size, and the iSCSI
     * target ARN that initiators can use to connect to the volume target.
     * </p>
     * <p>
     * Optionally, you can provide the ARN for an existing volume as the <code>SourceVolumeARN</code> for this cached
     * volume, which creates an exact copy of the existing volume’s latest recovery point. The
     * <code>VolumeSizeInBytes</code> value must be equal to or larger than the size of the copied volume, in bytes.
     * </p>
     * 
     * @param createCachediSCSIVolumeRequest
     * @return A Java Future containing the result of the CreateCachediSCSIVolume operation returned by the service.
     * @sample AWSStorageGatewayAsync.CreateCachediSCSIVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateCachediSCSIVolume"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest);

    /**
     * <p>
     * Creates a cached volume on a specified cached volume gateway. This operation is only supported in the cached
     * volume gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a cached volume. Use the <a>AddCache</a>
     * operation to add cache storage to a gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you must specify the gateway, size of the volume in bytes, the iSCSI target name, an IP address
     * on which to expose the target, and a unique client token. In response, the gateway creates the volume and returns
     * information about it. This information includes the volume Amazon Resource Name (ARN), its size, and the iSCSI
     * target ARN that initiators can use to connect to the volume target.
     * </p>
     * <p>
     * Optionally, you can provide the ARN for an existing volume as the <code>SourceVolumeARN</code> for this cached
     * volume, which creates an exact copy of the existing volume’s latest recovery point. The
     * <code>VolumeSizeInBytes</code> value must be equal to or larger than the size of the copied volume, in bytes.
     * </p>
     * 
     * @param createCachediSCSIVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCachediSCSIVolume operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateCachediSCSIVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateCachediSCSIVolume"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCachediSCSIVolumeRequest, CreateCachediSCSIVolumeResult> asyncHandler);

    /**
     * <p>
     * Creates a Network File System (NFS) file share on an existing file gateway. In Storage Gateway, a file share is a
     * file system mount point backed by Amazon S3 cloud storage. Storage Gateway exposes file shares using a NFS
     * interface. This operation is only supported for file gateways.
     * </p>
     * <important>
     * <p>
     * File gateway requires AWS Security Token Service (AWS STS) to be activated to enable you create a file share.
     * Make sure AWS STS is activated in the region you are creating your file gateway in. If AWS STS is not activated
     * in the region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS
     * STS in an AWS Region in the AWS Identity and Access Management User Guide.
     * </p>
     * <p>
     * File gateway does not support creating hard or symbolic links on a file share.
     * </p>
     * </important>
     * 
     * @param createNFSFileShareRequest
     *        CreateNFSFileShareInput
     * @return A Java Future containing the result of the CreateNFSFileShare operation returned by the service.
     * @sample AWSStorageGatewayAsync.CreateNFSFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateNFSFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNFSFileShareResult> createNFSFileShareAsync(CreateNFSFileShareRequest createNFSFileShareRequest);

    /**
     * <p>
     * Creates a Network File System (NFS) file share on an existing file gateway. In Storage Gateway, a file share is a
     * file system mount point backed by Amazon S3 cloud storage. Storage Gateway exposes file shares using a NFS
     * interface. This operation is only supported for file gateways.
     * </p>
     * <important>
     * <p>
     * File gateway requires AWS Security Token Service (AWS STS) to be activated to enable you create a file share.
     * Make sure AWS STS is activated in the region you are creating your file gateway in. If AWS STS is not activated
     * in the region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS
     * STS in an AWS Region in the AWS Identity and Access Management User Guide.
     * </p>
     * <p>
     * File gateway does not support creating hard or symbolic links on a file share.
     * </p>
     * </important>
     * 
     * @param createNFSFileShareRequest
     *        CreateNFSFileShareInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNFSFileShare operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateNFSFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateNFSFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNFSFileShareResult> createNFSFileShareAsync(CreateNFSFileShareRequest createNFSFileShareRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNFSFileShareRequest, CreateNFSFileShareResult> asyncHandler);

    /**
     * <p>
     * Creates a Server Message Block (SMB) file share on an existing file gateway. In Storage Gateway, a file share is
     * a file system mount point backed by Amazon S3 cloud storage. Storage Gateway expose file shares using a SMB
     * interface. This operation is only supported for file gateways.
     * </p>
     * <important>
     * <p>
     * File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share.
     * Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not
     * activated in this AWS Region, activate it. For information about how to activate AWS STS, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide.</i>
     * </p>
     * <p>
     * File gateways don't support creating hard or symbolic links on a file share.
     * </p>
     * </important>
     * 
     * @param createSMBFileShareRequest
     *        CreateSMBFileShareInput
     * @return A Java Future containing the result of the CreateSMBFileShare operation returned by the service.
     * @sample AWSStorageGatewayAsync.CreateSMBFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSMBFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSMBFileShareResult> createSMBFileShareAsync(CreateSMBFileShareRequest createSMBFileShareRequest);

    /**
     * <p>
     * Creates a Server Message Block (SMB) file share on an existing file gateway. In Storage Gateway, a file share is
     * a file system mount point backed by Amazon S3 cloud storage. Storage Gateway expose file shares using a SMB
     * interface. This operation is only supported for file gateways.
     * </p>
     * <important>
     * <p>
     * File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share.
     * Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not
     * activated in this AWS Region, activate it. For information about how to activate AWS STS, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide.</i>
     * </p>
     * <p>
     * File gateways don't support creating hard or symbolic links on a file share.
     * </p>
     * </important>
     * 
     * @param createSMBFileShareRequest
     *        CreateSMBFileShareInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSMBFileShare operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateSMBFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSMBFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSMBFileShareResult> createSMBFileShareAsync(CreateSMBFileShareRequest createSMBFileShareRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSMBFileShareRequest, CreateSMBFileShareResult> asyncHandler);

    /**
     * <p>
     * Initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time snapshots of your data to Amazon Simple Storage
     * (S3) for durable off-site recovery, as well as import the data to an Amazon Elastic Block Store (EBS) volume in
     * Amazon Elastic Compute Cloud (EC2). You can take snapshots of your gateway volume on a scheduled or ad hoc basis.
     * This API enables you to take ad-hoc snapshot. For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#SchedulingSnapshot"
     * >Editing a Snapshot Schedule</a>.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its Amazon Resource Name (ARN). You must also
     * provide description for the snapshot. When AWS Storage Gateway takes the snapshot of specified volume, the
     * snapshot and description appears in the AWS Storage Gateway Console. In response, AWS Storage Gateway returns you
     * a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to
     * create a volume from a snapshot. This operation is only supported in stored and cached volume gateway type.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more information, see DescribeSnapshots or
     * DeleteSnapshot in the <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Operations.html">EC2
     * API reference</a>.
     * </p>
     * </note> <important>
     * <p>
     * Volume and snapshot IDs are changing to a longer length ID format. For more information, see the important note
     * on the <a href="https://docs.aws.amazon.com/storagegateway/latest/APIReference/Welcome.html">Welcome</a> page.
     * </p>
     * </important>
     * 
     * @param createSnapshotRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>CreateSnapshotInput$SnapshotDescription</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateSnapshotInput$VolumeARN</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AWSStorageGatewayAsync.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time snapshots of your data to Amazon Simple Storage
     * (S3) for durable off-site recovery, as well as import the data to an Amazon Elastic Block Store (EBS) volume in
     * Amazon Elastic Compute Cloud (EC2). You can take snapshots of your gateway volume on a scheduled or ad hoc basis.
     * This API enables you to take ad-hoc snapshot. For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#SchedulingSnapshot"
     * >Editing a Snapshot Schedule</a>.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its Amazon Resource Name (ARN). You must also
     * provide description for the snapshot. When AWS Storage Gateway takes the snapshot of specified volume, the
     * snapshot and description appears in the AWS Storage Gateway Console. In response, AWS Storage Gateway returns you
     * a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to
     * create a volume from a snapshot. This operation is only supported in stored and cached volume gateway type.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more information, see DescribeSnapshots or
     * DeleteSnapshot in the <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Operations.html">EC2
     * API reference</a>.
     * </p>
     * </note> <important>
     * <p>
     * Volume and snapshot IDs are changing to a longer length ID format. For more information, see the important note
     * on the <a href="https://docs.aws.amazon.com/storagegateway/latest/APIReference/Welcome.html">Welcome</a> page.
     * </p>
     * </important>
     * 
     * @param createSnapshotRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>CreateSnapshotInput$SnapshotDescription</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateSnapshotInput$VolumeARN</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Initiates a snapshot of a gateway from a volume recovery point. This operation is only supported in the cached
     * volume gateway type.
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the volume is consistent and from which you can
     * create a snapshot. To get a list of volume recovery point for cached volume gateway, use
     * <a>ListVolumeRecoveryPoints</a>.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide a description for the snapshot. When the gateway takes a
     * snapshot of the specified volume, the snapshot and its description appear in the AWS Storage Gateway console. In
     * response, the gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or
     * later use it when you want to create a volume from a snapshot.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more information, in <i>Amazon Elastic Compute
     * Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param createSnapshotFromVolumeRecoveryPointRequest
     * @return A Java Future containing the result of the CreateSnapshotFromVolumeRecoveryPoint operation returned by
     *         the service.
     * @sample AWSStorageGatewayAsync.CreateSnapshotFromVolumeRecoveryPoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSnapshotFromVolumeRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(
            CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest);

    /**
     * <p>
     * Initiates a snapshot of a gateway from a volume recovery point. This operation is only supported in the cached
     * volume gateway type.
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the volume is consistent and from which you can
     * create a snapshot. To get a list of volume recovery point for cached volume gateway, use
     * <a>ListVolumeRecoveryPoints</a>.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide a description for the snapshot. When the gateway takes a
     * snapshot of the specified volume, the snapshot and its description appear in the AWS Storage Gateway console. In
     * response, the gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or
     * later use it when you want to create a volume from a snapshot.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more information, in <i>Amazon Elastic Compute
     * Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param createSnapshotFromVolumeRecoveryPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshotFromVolumeRecoveryPoint operation returned by
     *         the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateSnapshotFromVolumeRecoveryPoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSnapshotFromVolumeRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(
            CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotFromVolumeRecoveryPointRequest, CreateSnapshotFromVolumeRecoveryPointResult> asyncHandler);

    /**
     * <p>
     * Creates a volume on a specified gateway. This operation is only supported in the stored volume gateway type.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You can choose to preserve existing data on the
     * disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty
     * gateway volume, then any existing data on the disk is erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information on which you are creating the volume. In
     * response, the gateway creates the volume and returns volume information such as the volume Amazon Resource Name
     * (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.
     * </p>
     * 
     * @param createStorediSCSIVolumeRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$DiskId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$PreserveExistingData</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$SnapshotId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$TargetName</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the CreateStorediSCSIVolume operation returned by the service.
     * @sample AWSStorageGatewayAsync.CreateStorediSCSIVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateStorediSCSIVolume"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest);

    /**
     * <p>
     * Creates a volume on a specified gateway. This operation is only supported in the stored volume gateway type.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You can choose to preserve existing data on the
     * disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty
     * gateway volume, then any existing data on the disk is erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information on which you are creating the volume. In
     * response, the gateway creates the volume and returns volume information such as the volume Amazon Resource Name
     * (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.
     * </p>
     * 
     * @param createStorediSCSIVolumeRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$DiskId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$PreserveExistingData</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$SnapshotId</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>CreateStorediSCSIVolumeInput$TargetName</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStorediSCSIVolume operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateStorediSCSIVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateStorediSCSIVolume"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStorediSCSIVolumeRequest, CreateStorediSCSIVolumeResult> asyncHandler);

    /**
     * <p>
     * Creates a virtual tape by using your own barcode. You write data to the virtual tape and then archive the tape. A
     * barcode is unique and can not be reused if it has already been used on a tape . This applies to barcodes used on
     * deleted tapes. This operation is only supported in the tape gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a virtual tape. Use the <a>AddCache</a>
     * operation to add cache storage to a gateway.
     * </p>
     * </note>
     * 
     * @param createTapeWithBarcodeRequest
     *        CreateTapeWithBarcodeInput
     * @return A Java Future containing the result of the CreateTapeWithBarcode operation returned by the service.
     * @sample AWSStorageGatewayAsync.CreateTapeWithBarcode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateTapeWithBarcode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTapeWithBarcodeResult> createTapeWithBarcodeAsync(CreateTapeWithBarcodeRequest createTapeWithBarcodeRequest);

    /**
     * <p>
     * Creates a virtual tape by using your own barcode. You write data to the virtual tape and then archive the tape. A
     * barcode is unique and can not be reused if it has already been used on a tape . This applies to barcodes used on
     * deleted tapes. This operation is only supported in the tape gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a virtual tape. Use the <a>AddCache</a>
     * operation to add cache storage to a gateway.
     * </p>
     * </note>
     * 
     * @param createTapeWithBarcodeRequest
     *        CreateTapeWithBarcodeInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTapeWithBarcode operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateTapeWithBarcode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateTapeWithBarcode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTapeWithBarcodeResult> createTapeWithBarcodeAsync(CreateTapeWithBarcodeRequest createTapeWithBarcodeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTapeWithBarcodeRequest, CreateTapeWithBarcodeResult> asyncHandler);

    /**
     * <p>
     * Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes. This operation
     * is only supported in the tape gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create virtual tapes. Use the <a>AddCache</a>
     * operation to add cache storage to a gateway.
     * </p>
     * </note>
     * 
     * @param createTapesRequest
     *        CreateTapesInput
     * @return A Java Future containing the result of the CreateTapes operation returned by the service.
     * @sample AWSStorageGatewayAsync.CreateTapes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateTapes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTapesResult> createTapesAsync(CreateTapesRequest createTapesRequest);

    /**
     * <p>
     * Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes. This operation
     * is only supported in the tape gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create virtual tapes. Use the <a>AddCache</a>
     * operation to add cache storage to a gateway.
     * </p>
     * </note>
     * 
     * @param createTapesRequest
     *        CreateTapesInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTapes operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.CreateTapes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateTapes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTapesResult> createTapesAsync(CreateTapesRequest createTapesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTapesRequest, CreateTapesResult> asyncHandler);

    /**
     * <p>
     * Deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate
     * limit, or you can delete both. If you delete only one of the limits, the other limit remains unchanged. To
     * specify which gateway to work with, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param deleteBandwidthRateLimitRequest
     *        A JSON object containing the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>DeleteBandwidthRateLimitInput$BandwidthType</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the DeleteBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteBandwidthRateLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteBandwidthRateLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest);

    /**
     * <p>
     * Deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate
     * limit, or you can delete both. If you delete only one of the limits, the other limit remains unchanged. To
     * specify which gateway to work with, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param deleteBandwidthRateLimitRequest
     *        A JSON object containing the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>DeleteBandwidthRateLimitInput$BandwidthType</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteBandwidthRateLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteBandwidthRateLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBandwidthRateLimitRequest, DeleteBandwidthRateLimitResult> asyncHandler);

    /**
     * <p>
     * Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target and initiator
     * pair.
     * </p>
     * 
     * @param deleteChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>DeleteChapCredentialsInput$InitiatorName</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>DeleteChapCredentialsInput$TargetARN</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the DeleteChapCredentials operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteChapCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteChapCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(DeleteChapCredentialsRequest deleteChapCredentialsRequest);

    /**
     * <p>
     * Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target and initiator
     * pair.
     * </p>
     * 
     * @param deleteChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>DeleteChapCredentialsInput$InitiatorName</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>DeleteChapCredentialsInput$TargetARN</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChapCredentials operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteChapCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteChapCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(DeleteChapCredentialsRequest deleteChapCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChapCredentialsRequest, DeleteChapCredentialsResult> asyncHandler);

    /**
     * <p>
     * Deletes a file share from a file gateway. This operation is only supported for file gateways.
     * </p>
     * 
     * @param deleteFileShareRequest
     *        DeleteFileShareInput
     * @return A Java Future containing the result of the DeleteFileShare operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteFileShare" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileShareResult> deleteFileShareAsync(DeleteFileShareRequest deleteFileShareRequest);

    /**
     * <p>
     * Deletes a file share from a file gateway. This operation is only supported for file gateways.
     * </p>
     * 
     * @param deleteFileShareRequest
     *        DeleteFileShareInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFileShare operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteFileShare" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFileShareResult> deleteFileShareAsync(DeleteFileShareRequest deleteFileShareRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFileShareRequest, DeleteFileShareResult> asyncHandler);

    /**
     * <p>
     * Deletes a gateway. To specify which gateway to delete, use the Amazon Resource Name (ARN) of the gateway in your
     * request. The operation deletes the gateway; however, it does not delete the gateway virtual machine (VM) from
     * your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed snapshots of the gateway volumes are not deleted
     * upon deleting the gateway, however, pending snapshots will not complete. After you delete a gateway, your next
     * step is to remove it from your environment.
     * </p>
     * <important>
     * <p>
     * You no longer pay software charges after the gateway is deleted; however, your existing Amazon EBS snapshots
     * persist and you will continue to be billed for these snapshots. You can choose to remove all remaining Amazon EBS
     * snapshots by canceling your Amazon EC2 subscription.  If you prefer not to cancel your Amazon EC2 subscription,
     * you can delete your snapshots using the Amazon EC2 console. For more information, see the <a
     * href="http://aws.amazon.com/storagegateway"> AWS Storage Gateway Detail Page</a>.
     * </p>
     * </important>
     * 
     * @param deleteGatewayRequest
     *        A JSON object containing the ID of the gateway to delete.
     * @return A Java Future containing the result of the DeleteGateway operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest deleteGatewayRequest);

    /**
     * <p>
     * Deletes a gateway. To specify which gateway to delete, use the Amazon Resource Name (ARN) of the gateway in your
     * request. The operation deletes the gateway; however, it does not delete the gateway virtual machine (VM) from
     * your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed snapshots of the gateway volumes are not deleted
     * upon deleting the gateway, however, pending snapshots will not complete. After you delete a gateway, your next
     * step is to remove it from your environment.
     * </p>
     * <important>
     * <p>
     * You no longer pay software charges after the gateway is deleted; however, your existing Amazon EBS snapshots
     * persist and you will continue to be billed for these snapshots. You can choose to remove all remaining Amazon EBS
     * snapshots by canceling your Amazon EC2 subscription.  If you prefer not to cancel your Amazon EC2 subscription,
     * you can delete your snapshots using the Amazon EC2 console. For more information, see the <a
     * href="http://aws.amazon.com/storagegateway"> AWS Storage Gateway Detail Page</a>.
     * </p>
     * </important>
     * 
     * @param deleteGatewayRequest
     *        A JSON object containing the ID of the gateway to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGateway operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest deleteGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or ad hoc basis. This API action enables you to
     * delete a snapshot schedule for a volume. For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html">Working with
     * Snapshots</a>. In the <code>DeleteSnapshotSchedule</code> request, you identify the volume by providing its
     * Amazon Resource Name (ARN). This operation is only supported in stored and cached volume gateway types.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. in <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotScheduleRequest
     * @return A Java Future containing the result of the DeleteSnapshotSchedule operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest);

    /**
     * <p>
     * Deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or ad hoc basis. This API action enables you to
     * delete a snapshot schedule for a volume. For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html">Working with
     * Snapshots</a>. In the <code>DeleteSnapshotSchedule</code> request, you identify the volume by providing its
     * Amazon Resource Name (ARN). This operation is only supported in stored and cached volume gateway types.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. in <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshotSchedule operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotScheduleRequest, DeleteSnapshotScheduleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified virtual tape. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param deleteTapeRequest
     *        DeleteTapeInput
     * @return A Java Future containing the result of the DeleteTape operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteTape
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteTape" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTapeResult> deleteTapeAsync(DeleteTapeRequest deleteTapeRequest);

    /**
     * <p>
     * Deletes the specified virtual tape. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param deleteTapeRequest
     *        DeleteTapeInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTape operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteTape
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteTape" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTapeResult> deleteTapeAsync(DeleteTapeRequest deleteTapeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTapeRequest, DeleteTapeResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified virtual tape from the virtual tape shelf (VTS). This operation is only supported in the
     * tape gateway type.
     * </p>
     * 
     * @param deleteTapeArchiveRequest
     *        DeleteTapeArchiveInput
     * @return A Java Future containing the result of the DeleteTapeArchive operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteTapeArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteTapeArchive"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTapeArchiveResult> deleteTapeArchiveAsync(DeleteTapeArchiveRequest deleteTapeArchiveRequest);

    /**
     * <p>
     * Deletes the specified virtual tape from the virtual tape shelf (VTS). This operation is only supported in the
     * tape gateway type.
     * </p>
     * 
     * @param deleteTapeArchiveRequest
     *        DeleteTapeArchiveInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTapeArchive operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteTapeArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteTapeArchive"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTapeArchiveResult> deleteTapeArchiveAsync(DeleteTapeArchiveRequest deleteTapeArchiveRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTapeArchiveRequest, DeleteTapeArchiveResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified storage volume that you previously created using the <a>CreateCachediSCSIVolume</a> or
     * <a>CreateStorediSCSIVolume</a> API. This operation is only supported in the cached volume and stored volume
     * types. For stored volume gateways, the local disk that was configured as the storage volume is not deleted. You
     * can reuse the local disk to create another storage volume.
     * </p>
     * <p>
     * Before you delete a volume, make sure there are no iSCSI connections to the volume you are deleting. You should
     * also make sure there is no snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to
     * query snapshots on the volume you are deleting and check the snapshot status. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html">
     * DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.
     * </p>
     * 
     * @param deleteVolumeRequest
     *        A JSON object containing the <a>DeleteVolumeInput$VolumeARN</a> to delete.
     * @return A Java Future containing the result of the DeleteVolume operation returned by the service.
     * @sample AWSStorageGatewayAsync.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteVolume" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest);

    /**
     * <p>
     * Deletes the specified storage volume that you previously created using the <a>CreateCachediSCSIVolume</a> or
     * <a>CreateStorediSCSIVolume</a> API. This operation is only supported in the cached volume and stored volume
     * types. For stored volume gateways, the local disk that was configured as the storage volume is not deleted. You
     * can reuse the local disk to create another storage volume.
     * </p>
     * <p>
     * Before you delete a volume, make sure there are no iSCSI connections to the volume you are deleting. You should
     * also make sure there is no snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to
     * query snapshots on the volume you are deleting and check the snapshot status. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html">
     * DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.
     * </p>
     * 
     * @param deleteVolumeRequest
     *        A JSON object containing the <a>DeleteVolumeInput$VolumeARN</a> to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVolume operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteVolume" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler);

    /**
     * <p>
     * Returns the bandwidth rate limits of a gateway. By default, these limits are not set, which means no bandwidth
     * rate limiting is in effect.
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if the limit is set. If no limits are set for
     * the gateway, then this operation returns only the gateway ARN in the response body. To specify which gateway to
     * describe, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param describeBandwidthRateLimitRequest
     *        A JSON object containing the of the gateway.
     * @return A Java Future containing the result of the DescribeBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeBandwidthRateLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeBandwidthRateLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(
            DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest);

    /**
     * <p>
     * Returns the bandwidth rate limits of a gateway. By default, these limits are not set, which means no bandwidth
     * rate limiting is in effect.
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if the limit is set. If no limits are set for
     * the gateway, then this operation returns only the gateway ARN in the response body. To specify which gateway to
     * describe, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param describeBandwidthRateLimitRequest
     *        A JSON object containing the of the gateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeBandwidthRateLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeBandwidthRateLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(
            DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBandwidthRateLimitRequest, DescribeBandwidthRateLimitResult> asyncHandler);

    /**
     * <p>
     * Returns information about the cache of a gateway. This operation is only supported in the cached volume, tape and
     * file gateway types.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it includes the amount of cache allocated and
     * used.
     * </p>
     * 
     * @param describeCacheRequest
     * @return A Java Future containing the result of the DescribeCache operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeCache" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheResult> describeCacheAsync(DescribeCacheRequest describeCacheRequest);

    /**
     * <p>
     * Returns information about the cache of a gateway. This operation is only supported in the cached volume, tape and
     * file gateway types.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it includes the amount of cache allocated and
     * used.
     * </p>
     * 
     * @param describeCacheRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCache operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeCache" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCacheResult> describeCacheAsync(DescribeCacheRequest describeCacheRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheRequest, DescribeCacheResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the gateway volumes specified in the request. This operation is only supported in the
     * cached volume gateway types.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway
     * returns volume information sorted by volume Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCachediSCSIVolumesRequest
     * @return A Java Future containing the result of the DescribeCachediSCSIVolumes operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeCachediSCSIVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeCachediSCSIVolumes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(
            DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest);

    /**
     * <p>
     * Returns a description of the gateway volumes specified in the request. This operation is only supported in the
     * cached volume gateway types.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway
     * returns volume information sorted by volume Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCachediSCSIVolumesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCachediSCSIVolumes operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeCachediSCSIVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeCachediSCSIVolumes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(
            DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCachediSCSIVolumesRequest, DescribeCachediSCSIVolumesResult> asyncHandler);

    /**
     * <p>
     * Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified
     * iSCSI target, one for each target-initiator pair.
     * </p>
     * 
     * @param describeChapCredentialsRequest
     *        A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target.
     * @return A Java Future containing the result of the DescribeChapCredentials operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeChapCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeChapCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(DescribeChapCredentialsRequest describeChapCredentialsRequest);

    /**
     * <p>
     * Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified
     * iSCSI target, one for each target-initiator pair.
     * </p>
     * 
     * @param describeChapCredentialsRequest
     *        A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChapCredentials operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeChapCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeChapCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(DescribeChapCredentialsRequest describeChapCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChapCredentialsRequest, DescribeChapCredentialsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state
     * (whether the gateway is running or not). To specify which gateway to describe, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     * 
     * @param describeGatewayInformationRequest
     *        A JSON object containing the ID of the gateway.
     * @return A Java Future containing the result of the DescribeGatewayInformation operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeGatewayInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeGatewayInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(
            DescribeGatewayInformationRequest describeGatewayInformationRequest);

    /**
     * <p>
     * Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state
     * (whether the gateway is running or not). To specify which gateway to describe, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     * 
     * @param describeGatewayInformationRequest
     *        A JSON object containing the ID of the gateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGatewayInformation operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeGatewayInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeGatewayInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(
            DescribeGatewayInformationRequest describeGatewayInformationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGatewayInformationRequest, DescribeGatewayInformationResult> asyncHandler);

    /**
     * <p>
     * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are
     * in terms of the gateway's time zone.
     * </p>
     * 
     * @param describeMaintenanceStartTimeRequest
     *        A JSON object containing the of the gateway.
     * @return A Java Future containing the result of the DescribeMaintenanceStartTime operation returned by the
     *         service.
     * @sample AWSStorageGatewayAsync.DescribeMaintenanceStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeMaintenanceStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(
            DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest);

    /**
     * <p>
     * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are
     * in terms of the gateway's time zone.
     * </p>
     * 
     * @param describeMaintenanceStartTimeRequest
     *        A JSON object containing the of the gateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceStartTime operation returned by the
     *         service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeMaintenanceStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeMaintenanceStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(
            DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceStartTimeRequest, DescribeMaintenanceStartTimeResult> asyncHandler);

    /**
     * <p>
     * Gets a description for one or more Network File System (NFS) file shares from a file gateway. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param describeNFSFileSharesRequest
     *        DescribeNFSFileSharesInput
     * @return A Java Future containing the result of the DescribeNFSFileShares operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeNFSFileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeNFSFileShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNFSFileSharesResult> describeNFSFileSharesAsync(DescribeNFSFileSharesRequest describeNFSFileSharesRequest);

    /**
     * <p>
     * Gets a description for one or more Network File System (NFS) file shares from a file gateway. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param describeNFSFileSharesRequest
     *        DescribeNFSFileSharesInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNFSFileShares operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeNFSFileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeNFSFileShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNFSFileSharesResult> describeNFSFileSharesAsync(DescribeNFSFileSharesRequest describeNFSFileSharesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNFSFileSharesRequest, DescribeNFSFileSharesResult> asyncHandler);

    /**
     * <p>
     * Gets a description for one or more Server Message Block (SMB) file shares from a file gateway. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param describeSMBFileSharesRequest
     *        DescribeSMBFileSharesInput
     * @return A Java Future containing the result of the DescribeSMBFileShares operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeSMBFileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSMBFileShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSMBFileSharesResult> describeSMBFileSharesAsync(DescribeSMBFileSharesRequest describeSMBFileSharesRequest);

    /**
     * <p>
     * Gets a description for one or more Server Message Block (SMB) file shares from a file gateway. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param describeSMBFileSharesRequest
     *        DescribeSMBFileSharesInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSMBFileShares operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeSMBFileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSMBFileShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSMBFileSharesResult> describeSMBFileSharesAsync(DescribeSMBFileSharesRequest describeSMBFileSharesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSMBFileSharesRequest, DescribeSMBFileSharesResult> asyncHandler);

    /**
     * <p>
     * Gets a description of a Server Message Block (SMB) file share settings from a file gateway. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param describeSMBSettingsRequest
     * @return A Java Future containing the result of the DescribeSMBSettings operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeSMBSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSMBSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSMBSettingsResult> describeSMBSettingsAsync(DescribeSMBSettingsRequest describeSMBSettingsRequest);

    /**
     * <p>
     * Gets a description of a Server Message Block (SMB) file share settings from a file gateway. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param describeSMBSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSMBSettings operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeSMBSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSMBSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSMBSettingsResult> describeSMBSettingsAsync(DescribeSMBSettingsRequest describeSMBSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSMBSettingsRequest, DescribeSMBSettingsResult> asyncHandler);

    /**
     * <p>
     * Describes the snapshot schedule for the specified gateway volume. The snapshot schedule information includes
     * intervals at which snapshots are automatically initiated on the volume. This operation is only supported in the
     * cached volume and stored volume types.
     * </p>
     * 
     * @param describeSnapshotScheduleRequest
     *        A JSON object containing the <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.
     * @return A Java Future containing the result of the DescribeSnapshotSchedule operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest);

    /**
     * <p>
     * Describes the snapshot schedule for the specified gateway volume. The snapshot schedule information includes
     * intervals at which snapshots are automatically initiated on the volume. This operation is only supported in the
     * cached volume and stored volume types.
     * </p>
     * 
     * @param describeSnapshotScheduleRequest
     *        A JSON object containing the <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshotSchedule operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotScheduleRequest, DescribeSnapshotScheduleResult> asyncHandler);

    /**
     * <p>
     * Returns the description of the gateway volumes specified in the request. The list of gateway volumes in the
     * request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by
     * volume ARNs. This operation is only supported in stored volume gateway type.
     * </p>
     * 
     * @param describeStorediSCSIVolumesRequest
     *        A JSON object containing a list of <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.
     * @return A Java Future containing the result of the DescribeStorediSCSIVolumes operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeStorediSCSIVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeStorediSCSIVolumes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(
            DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest);

    /**
     * <p>
     * Returns the description of the gateway volumes specified in the request. The list of gateway volumes in the
     * request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by
     * volume ARNs. This operation is only supported in stored volume gateway type.
     * </p>
     * 
     * @param describeStorediSCSIVolumesRequest
     *        A JSON object containing a list of <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStorediSCSIVolumes operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeStorediSCSIVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeStorediSCSIVolumes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(
            DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStorediSCSIVolumesRequest, DescribeStorediSCSIVolumesResult> asyncHandler);

    /**
     * <p>
     * Returns a description of specified virtual tapes in the virtual tape shelf (VTS). This operation is only
     * supported in the tape gateway type.
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage Gateway returns a description of all virtual
     * tapes found in the VTS associated with your account.
     * </p>
     * 
     * @param describeTapeArchivesRequest
     *        DescribeTapeArchivesInput
     * @return A Java Future containing the result of the DescribeTapeArchives operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeTapeArchives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapeArchives"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(DescribeTapeArchivesRequest describeTapeArchivesRequest);

    /**
     * <p>
     * Returns a description of specified virtual tapes in the virtual tape shelf (VTS). This operation is only
     * supported in the tape gateway type.
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage Gateway returns a description of all virtual
     * tapes found in the VTS associated with your account.
     * </p>
     * 
     * @param describeTapeArchivesRequest
     *        DescribeTapeArchivesInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTapeArchives operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeTapeArchives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapeArchives"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(DescribeTapeArchivesRequest describeTapeArchivesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTapeArchivesRequest, DescribeTapeArchivesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTapeArchives operation.
     *
     * @see #describeTapeArchivesAsync(DescribeTapeArchivesRequest)
     */
    java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync();

    /**
     * Simplified method form for invoking the DescribeTapeArchives operation with an AsyncHandler.
     *
     * @see #describeTapeArchivesAsync(DescribeTapeArchivesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTapeArchivesRequest, DescribeTapeArchivesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of virtual tape recovery points that are available for the specified tape gateway.
     * </p>
     * <p>
     * A recovery point is a point-in-time view of a virtual tape at which all the data on the virtual tape is
     * consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeTapeRecoveryPointsRequest
     *        DescribeTapeRecoveryPointsInput
     * @return A Java Future containing the result of the DescribeTapeRecoveryPoints operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeTapeRecoveryPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapeRecoveryPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTapeRecoveryPointsResult> describeTapeRecoveryPointsAsync(
            DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest);

    /**
     * <p>
     * Returns a list of virtual tape recovery points that are available for the specified tape gateway.
     * </p>
     * <p>
     * A recovery point is a point-in-time view of a virtual tape at which all the data on the virtual tape is
     * consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeTapeRecoveryPointsRequest
     *        DescribeTapeRecoveryPointsInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTapeRecoveryPoints operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeTapeRecoveryPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapeRecoveryPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTapeRecoveryPointsResult> describeTapeRecoveryPointsAsync(
            DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTapeRecoveryPointsRequest, DescribeTapeRecoveryPointsResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a <code>TapeARN</code> is
     * not specified, returns a description of all virtual tapes associated with the specified gateway. This operation
     * is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeTapesRequest
     *        DescribeTapesInput
     * @return A Java Future containing the result of the DescribeTapes operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeTapes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTapesResult> describeTapesAsync(DescribeTapesRequest describeTapesRequest);

    /**
     * <p>
     * Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a <code>TapeARN</code> is
     * not specified, returns a description of all virtual tapes associated with the specified gateway. This operation
     * is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeTapesRequest
     *        DescribeTapesInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTapes operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeTapes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeTapes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTapesResult> describeTapesAsync(DescribeTapesRequest describeTapesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTapesRequest, DescribeTapesResult> asyncHandler);

    /**
     * <p>
     * Returns information about the upload buffer of a gateway. This operation is supported for the stored volume,
     * cached volume and tape gateway types.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer space, and it includes the amount of upload
     * buffer space allocated and used.
     * </p>
     * 
     * @param describeUploadBufferRequest
     * @return A Java Future containing the result of the DescribeUploadBuffer operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeUploadBuffer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeUploadBuffer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUploadBufferResult> describeUploadBufferAsync(DescribeUploadBufferRequest describeUploadBufferRequest);

    /**
     * <p>
     * Returns information about the upload buffer of a gateway. This operation is supported for the stored volume,
     * cached volume and tape gateway types.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer space, and it includes the amount of upload
     * buffer space allocated and used.
     * </p>
     * 
     * @param describeUploadBufferRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUploadBuffer operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeUploadBuffer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeUploadBuffer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUploadBufferResult> describeUploadBufferAsync(DescribeUploadBufferRequest describeUploadBufferRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUploadBufferRequest, DescribeUploadBufferResult> asyncHandler);

    /**
     * <p>
     * Returns a description of virtual tape library (VTL) devices for the specified tape gateway. In the response, AWS
     * Storage Gateway returns VTL device information.
     * </p>
     * <p>
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeVTLDevicesRequest
     *        DescribeVTLDevicesInput
     * @return A Java Future containing the result of the DescribeVTLDevices operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeVTLDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeVTLDevices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVTLDevicesResult> describeVTLDevicesAsync(DescribeVTLDevicesRequest describeVTLDevicesRequest);

    /**
     * <p>
     * Returns a description of virtual tape library (VTL) devices for the specified tape gateway. In the response, AWS
     * Storage Gateway returns VTL device information.
     * </p>
     * <p>
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeVTLDevicesRequest
     *        DescribeVTLDevicesInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVTLDevices operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeVTLDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeVTLDevices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVTLDevicesResult> describeVTLDevicesAsync(DescribeVTLDevicesRequest describeVTLDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVTLDevicesRequest, DescribeVTLDevicesResult> asyncHandler);

    /**
     * <p>
     * Returns information about the working storage of a gateway. This operation is only supported in the stored
     * volumes gateway type. This operation is deprecated in cached volumes API version (20120630). Use
     * DescribeUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use the DescribeUploadBuffer operation to add
     * upload buffer to a stored volume gateway.
     * </p>
     * </note>
     * <p>
     * The response includes disk IDs that are configured as working storage, and it includes the amount of working
     * storage allocated and used.
     * </p>
     * 
     * @param describeWorkingStorageRequest
     *        A JSON object containing the of the gateway.
     * @return A Java Future containing the result of the DescribeWorkingStorage operation returned by the service.
     * @sample AWSStorageGatewayAsync.DescribeWorkingStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeWorkingStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(DescribeWorkingStorageRequest describeWorkingStorageRequest);

    /**
     * <p>
     * Returns information about the working storage of a gateway. This operation is only supported in the stored
     * volumes gateway type. This operation is deprecated in cached volumes API version (20120630). Use
     * DescribeUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use the DescribeUploadBuffer operation to add
     * upload buffer to a stored volume gateway.
     * </p>
     * </note>
     * <p>
     * The response includes disk IDs that are configured as working storage, and it includes the amount of working
     * storage allocated and used.
     * </p>
     * 
     * @param describeWorkingStorageRequest
     *        A JSON object containing the of the gateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkingStorage operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DescribeWorkingStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeWorkingStorage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(DescribeWorkingStorageRequest describeWorkingStorageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkingStorageRequest, DescribeWorkingStorageResult> asyncHandler);

    /**
     * <p>
     * Disconnects a volume from an iSCSI connection and then detaches the volume from the specified gateway. Detaching
     * and attaching a volume enables you to recover your data from one gateway to a different gateway without creating
     * a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an
     * Amazon EC2 instance.
     * </p>
     * 
     * @param detachVolumeRequest
     *        AttachVolumeInput
     * @return A Java Future containing the result of the DetachVolume operation returned by the service.
     * @sample AWSStorageGatewayAsync.DetachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DetachVolume" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest detachVolumeRequest);

    /**
     * <p>
     * Disconnects a volume from an iSCSI connection and then detaches the volume from the specified gateway. Detaching
     * and attaching a volume enables you to recover your data from one gateway to a different gateway without creating
     * a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an
     * Amazon EC2 instance.
     * </p>
     * 
     * @param detachVolumeRequest
     *        AttachVolumeInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachVolume operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DetachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DetachVolume" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest detachVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<DetachVolumeRequest, DetachVolumeResult> asyncHandler);

    /**
     * <p>
     * Disables a tape gateway when the gateway is no longer functioning. For example, if your gateway VM is damaged,
     * you can disable the gateway so you can recover virtual tapes.
     * </p>
     * <p>
     * Use this operation for a tape gateway that is not reachable or not functioning. This operation is only supported
     * in the tape gateway type.
     * </p>
     * <important>
     * <p>
     * Once a gateway is disabled it cannot be enabled.
     * </p>
     * </important>
     * 
     * @param disableGatewayRequest
     *        DisableGatewayInput
     * @return A Java Future containing the result of the DisableGateway operation returned by the service.
     * @sample AWSStorageGatewayAsync.DisableGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DisableGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableGatewayResult> disableGatewayAsync(DisableGatewayRequest disableGatewayRequest);

    /**
     * <p>
     * Disables a tape gateway when the gateway is no longer functioning. For example, if your gateway VM is damaged,
     * you can disable the gateway so you can recover virtual tapes.
     * </p>
     * <p>
     * Use this operation for a tape gateway that is not reachable or not functioning. This operation is only supported
     * in the tape gateway type.
     * </p>
     * <important>
     * <p>
     * Once a gateway is disabled it cannot be enabled.
     * </p>
     * </important>
     * 
     * @param disableGatewayRequest
     *        DisableGatewayInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableGateway operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.DisableGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DisableGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableGatewayResult> disableGatewayAsync(DisableGatewayRequest disableGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DisableGatewayRequest, DisableGatewayResult> asyncHandler);

    /**
     * <p>
     * Adds a file gateway to an Active Directory domain. This operation is only supported for file gateways that
     * support the SMB file protocol.
     * </p>
     * 
     * @param joinDomainRequest
     *        JoinDomainInput
     * @return A Java Future containing the result of the JoinDomain operation returned by the service.
     * @sample AWSStorageGatewayAsync.JoinDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/JoinDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<JoinDomainResult> joinDomainAsync(JoinDomainRequest joinDomainRequest);

    /**
     * <p>
     * Adds a file gateway to an Active Directory domain. This operation is only supported for file gateways that
     * support the SMB file protocol.
     * </p>
     * 
     * @param joinDomainRequest
     *        JoinDomainInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the JoinDomain operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.JoinDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/JoinDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<JoinDomainResult> joinDomainAsync(JoinDomainRequest joinDomainRequest,
            com.amazonaws.handlers.AsyncHandler<JoinDomainRequest, JoinDomainResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the file shares for a specific file gateway, or the list of file shares that belong to the calling
     * user account. This operation is only supported for file gateways.
     * </p>
     * 
     * @param listFileSharesRequest
     *        ListFileShareInput
     * @return A Java Future containing the result of the ListFileShares operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListFileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListFileShares" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFileSharesResult> listFileSharesAsync(ListFileSharesRequest listFileSharesRequest);

    /**
     * <p>
     * Gets a list of the file shares for a specific file gateway, or the list of file shares that belong to the calling
     * user account. This operation is only supported for file gateways.
     * </p>
     * 
     * @param listFileSharesRequest
     *        ListFileShareInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFileShares operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListFileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListFileShares" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFileSharesResult> listFileSharesAsync(ListFileSharesRequest listFileSharesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFileSharesRequest, ListFileSharesResult> asyncHandler);

    /**
     * <p>
     * Lists gateways owned by an AWS account in a region specified in the request. The returned list is ordered by
     * gateway Amazon Resource Name (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This operation supports pagination that allows you
     * to optionally reduce the number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response (that is, the response returns only a truncated list of
     * your gateways), the response contains a marker that you can specify in your next request to fetch the next page
     * of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     *        A JSON object containing zero or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ListGatewaysInput$Limit</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListGatewaysInput$Marker</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the ListGateways operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest listGatewaysRequest);

    /**
     * <p>
     * Lists gateways owned by an AWS account in a region specified in the request. The returned list is ordered by
     * gateway Amazon Resource Name (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This operation supports pagination that allows you
     * to optionally reduce the number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response (that is, the response returns only a truncated list of
     * your gateways), the response contains a marker that you can specify in your next request to fetch the next page
     * of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     *        A JSON object containing zero or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ListGatewaysInput$Limit</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListGatewaysInput$Marker</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGateways operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest listGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListGateways operation.
     *
     * @see #listGatewaysAsync(ListGatewaysRequest)
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync();

    /**
     * Simplified method form for invoking the ListGateways operation with an AsyncHandler.
     *
     * @see #listGatewaysAsync(ListGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the gateway's local disks. To specify which gateway to describe, you use the Amazon Resource
     * Name (ARN) of the gateway in the body of the request.
     * </p>
     * <p>
     * The request returns a list of all disks, specifying which are configured as working storage, cache storage, or
     * stored volume or not configured at all. The response includes a <code>DiskStatus</code> field. This field can
     * have a value of present (the disk is available to use), missing (the disk is no longer connected to the gateway),
     * or mismatch (the disk node is occupied by a disk that has incorrect metadata or the disk content is corrupted).
     * </p>
     * 
     * @param listLocalDisksRequest
     *        A JSON object containing the of the gateway.
     * @return A Java Future containing the result of the ListLocalDisks operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListLocalDisks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListLocalDisks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLocalDisksResult> listLocalDisksAsync(ListLocalDisksRequest listLocalDisksRequest);

    /**
     * <p>
     * Returns a list of the gateway's local disks. To specify which gateway to describe, you use the Amazon Resource
     * Name (ARN) of the gateway in the body of the request.
     * </p>
     * <p>
     * The request returns a list of all disks, specifying which are configured as working storage, cache storage, or
     * stored volume or not configured at all. The response includes a <code>DiskStatus</code> field. This field can
     * have a value of present (the disk is available to use), missing (the disk is no longer connected to the gateway),
     * or mismatch (the disk node is occupied by a disk that has incorrect metadata or the disk content is corrupted).
     * </p>
     * 
     * @param listLocalDisksRequest
     *        A JSON object containing the of the gateway.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLocalDisks operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListLocalDisks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListLocalDisks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLocalDisksResult> listLocalDisksAsync(ListLocalDisksRequest listLocalDisksRequest,
            com.amazonaws.handlers.AsyncHandler<ListLocalDisksRequest, ListLocalDisksResult> asyncHandler);

    /**
     * <p>
     * Lists the tags that have been added to the specified resource. This operation is only supported in the cached
     * volume, stored volume and tape gateway type.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceInput
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags that have been added to the specified resource. This operation is only supported in the cached
     * volume, stored volume and tape gateway type.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTagsForResource operation.
     *
     * @see #listTagsForResourceAsync(ListTagsForResourceRequest)
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync();

    /**
     * Simplified method form for invoking the ListTagsForResource operation with an AsyncHandler.
     *
     * @see #listTagsForResourceAsync(ListTagsForResourceRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists virtual tapes in your virtual tape library (VTL) and your virtual tape shelf (VTS). You specify the tapes
     * to list by specifying one or more tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the
     * operation lists all virtual tapes in both your VTL and VTS.
     * </p>
     * <p>
     * This operation supports pagination. By default, the operation returns a maximum of up to 100 tapes. You can
     * optionally specify the <code>Limit</code> parameter in the body to limit the number of tapes in the response. If
     * the number of tapes returned in the response is truncated, the response includes a <code>Marker</code> element
     * that you can use in your subsequent request to retrieve the next set of tapes. This operation is only supported
     * in the tape gateway type.
     * </p>
     * 
     * @param listTapesRequest
     *        A JSON object that contains one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ListTapesInput$Limit</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListTapesInput$Marker</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListTapesInput$TapeARNs</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the ListTapes operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListTapes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListTapes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTapesResult> listTapesAsync(ListTapesRequest listTapesRequest);

    /**
     * <p>
     * Lists virtual tapes in your virtual tape library (VTL) and your virtual tape shelf (VTS). You specify the tapes
     * to list by specifying one or more tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the
     * operation lists all virtual tapes in both your VTL and VTS.
     * </p>
     * <p>
     * This operation supports pagination. By default, the operation returns a maximum of up to 100 tapes. You can
     * optionally specify the <code>Limit</code> parameter in the body to limit the number of tapes in the response. If
     * the number of tapes returned in the response is truncated, the response includes a <code>Marker</code> element
     * that you can use in your subsequent request to retrieve the next set of tapes. This operation is only supported
     * in the tape gateway type.
     * </p>
     * 
     * @param listTapesRequest
     *        A JSON object that contains one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ListTapesInput$Limit</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListTapesInput$Marker</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListTapesInput$TapeARNs</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTapes operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListTapes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListTapes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTapesResult> listTapesAsync(ListTapesRequest listTapesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTapesRequest, ListTapesResult> asyncHandler);

    /**
     * <p>
     * Lists iSCSI initiators that are connected to a volume. You can use this operation to determine whether a volume
     * is being used or not. This operation is only supported in the cached volume and stored volume gateway types.
     * </p>
     * 
     * @param listVolumeInitiatorsRequest
     *        ListVolumeInitiatorsInput
     * @return A Java Future containing the result of the ListVolumeInitiators operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListVolumeInitiators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumeInitiators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVolumeInitiatorsResult> listVolumeInitiatorsAsync(ListVolumeInitiatorsRequest listVolumeInitiatorsRequest);

    /**
     * <p>
     * Lists iSCSI initiators that are connected to a volume. You can use this operation to determine whether a volume
     * is being used or not. This operation is only supported in the cached volume and stored volume gateway types.
     * </p>
     * 
     * @param listVolumeInitiatorsRequest
     *        ListVolumeInitiatorsInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVolumeInitiators operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListVolumeInitiators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumeInitiators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVolumeInitiatorsResult> listVolumeInitiatorsAsync(ListVolumeInitiatorsRequest listVolumeInitiatorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVolumeInitiatorsRequest, ListVolumeInitiatorsResult> asyncHandler);

    /**
     * <p>
     * Lists the recovery points for a specified gateway. This operation is only supported in the cached volume gateway
     * type.
     * </p>
     * <p>
     * Each cache volume has one recovery point. A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot or clone a new cached volume from a source volume.
     * To create a snapshot from a volume recovery point use the <a>CreateSnapshotFromVolumeRecoveryPoint</a> operation.
     * </p>
     * 
     * @param listVolumeRecoveryPointsRequest
     * @return A Java Future containing the result of the ListVolumeRecoveryPoints operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListVolumeRecoveryPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumeRecoveryPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest);

    /**
     * <p>
     * Lists the recovery points for a specified gateway. This operation is only supported in the cached volume gateway
     * type.
     * </p>
     * <p>
     * Each cache volume has one recovery point. A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot or clone a new cached volume from a source volume.
     * To create a snapshot from a volume recovery point use the <a>CreateSnapshotFromVolumeRecoveryPoint</a> operation.
     * </p>
     * 
     * @param listVolumeRecoveryPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVolumeRecoveryPoints operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListVolumeRecoveryPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumeRecoveryPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVolumeRecoveryPointsRequest, ListVolumeRecoveryPointsResult> asyncHandler);

    /**
     * <p>
     * Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN. The response includes only the
     * volume ARNs. If you want additional volume information, use the <a>DescribeStorediSCSIVolumes</a> or the
     * <a>DescribeCachediSCSIVolumes</a> API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a maximum of up to 100 volumes. You can
     * optionally specify the <code>Limit</code> field in the body to limit the number of volumes in the response. If
     * the number of volumes returned in the response is truncated, the response includes a Marker field. You can use
     * this Marker value in your subsequent request to retrieve the next set of volumes. This operation is only
     * supported in the cached volume and stored volume gateway types.
     * </p>
     * 
     * @param listVolumesRequest
     *        A JSON object that contains one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ListVolumesInput$Limit</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListVolumesInput$Marker</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the ListVolumes operation returned by the service.
     * @sample AWSStorageGatewayAsync.ListVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVolumesResult> listVolumesAsync(ListVolumesRequest listVolumesRequest);

    /**
     * <p>
     * Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN. The response includes only the
     * volume ARNs. If you want additional volume information, use the <a>DescribeStorediSCSIVolumes</a> or the
     * <a>DescribeCachediSCSIVolumes</a> API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a maximum of up to 100 volumes. You can
     * optionally specify the <code>Limit</code> field in the body to limit the number of volumes in the response. If
     * the number of volumes returned in the response is truncated, the response includes a Marker field. You can use
     * this Marker value in your subsequent request to retrieve the next set of volumes. This operation is only
     * supported in the cached volume and stored volume gateway types.
     * </p>
     * 
     * @param listVolumesRequest
     *        A JSON object that contains one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>ListVolumesInput$Limit</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListVolumesInput$Marker</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVolumes operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ListVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVolumesResult> listVolumesAsync(ListVolumesRequest listVolumesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVolumesRequest, ListVolumesResult> asyncHandler);

    /**
     * <p>
     * Sends you notification through CloudWatch Events when all files written to your NFS file share have been uploaded
     * to Amazon S3.
     * </p>
     * <p>
     * AWS Storage Gateway can send a notification through Amazon CloudWatch Events when all files written to your file
     * share up to that point in time have been uploaded to Amazon S3. These files include files written to the NFS file
     * share up to the time that you make a request for notification. When the upload is done, Storage Gateway sends you
     * notification through an Amazon CloudWatch Event. You can configure CloudWatch Events to send the notification
     * through event targets such as Amazon SNS or AWS Lambda function. This operation is only supported for file
     * gateways.
     * </p>
     * <p>
     * For more information, see Getting File Upload Notification in the Storage Gateway User Guide
     * (https://docs.aws.amazon
     * .com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-upload-notification).
     * </p>
     * 
     * @param notifyWhenUploadedRequest
     * @return A Java Future containing the result of the NotifyWhenUploaded operation returned by the service.
     * @sample AWSStorageGatewayAsync.NotifyWhenUploaded
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/NotifyWhenUploaded"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyWhenUploadedResult> notifyWhenUploadedAsync(NotifyWhenUploadedRequest notifyWhenUploadedRequest);

    /**
     * <p>
     * Sends you notification through CloudWatch Events when all files written to your NFS file share have been uploaded
     * to Amazon S3.
     * </p>
     * <p>
     * AWS Storage Gateway can send a notification through Amazon CloudWatch Events when all files written to your file
     * share up to that point in time have been uploaded to Amazon S3. These files include files written to the NFS file
     * share up to the time that you make a request for notification. When the upload is done, Storage Gateway sends you
     * notification through an Amazon CloudWatch Event. You can configure CloudWatch Events to send the notification
     * through event targets such as Amazon SNS or AWS Lambda function. This operation is only supported for file
     * gateways.
     * </p>
     * <p>
     * For more information, see Getting File Upload Notification in the Storage Gateway User Guide
     * (https://docs.aws.amazon
     * .com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-upload-notification).
     * </p>
     * 
     * @param notifyWhenUploadedRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the NotifyWhenUploaded operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.NotifyWhenUploaded
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/NotifyWhenUploaded"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyWhenUploadedResult> notifyWhenUploadedAsync(NotifyWhenUploadedRequest notifyWhenUploadedRequest,
            com.amazonaws.handlers.AsyncHandler<NotifyWhenUploadedRequest, NotifyWhenUploadedResult> asyncHandler);

    /**
     * <p>
     * Refreshes the cache for the specified file share. This operation finds objects in the Amazon S3 bucket that were
     * added, removed or replaced since the gateway last listed the bucket's contents and cached the results. This
     * operation is only supported in the file gateway type. You can subscribe to be notified through an Amazon
     * CloudWatch event when your RefreshCache operation completes. For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
     * >Getting Notified About File Operations</a>.
     * </p>
     * <p>
     * When this API is called, it only initiates the refresh operation. When the API call completes and returns a
     * success code, it doesn't necessarily mean that the file refresh has completed. You should use the
     * refresh-complete notification to determine that the operation has completed before you check for new files on the
     * gateway file share. You can subscribe to be notified through an CloudWatch event when your
     * <code>RefreshCache</code> operation completes.
     * </p>
     * 
     * @param refreshCacheRequest
     *        RefreshCacheInput
     * @return A Java Future containing the result of the RefreshCache operation returned by the service.
     * @sample AWSStorageGatewayAsync.RefreshCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RefreshCache" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RefreshCacheResult> refreshCacheAsync(RefreshCacheRequest refreshCacheRequest);

    /**
     * <p>
     * Refreshes the cache for the specified file share. This operation finds objects in the Amazon S3 bucket that were
     * added, removed or replaced since the gateway last listed the bucket's contents and cached the results. This
     * operation is only supported in the file gateway type. You can subscribe to be notified through an Amazon
     * CloudWatch event when your RefreshCache operation completes. For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
     * >Getting Notified About File Operations</a>.
     * </p>
     * <p>
     * When this API is called, it only initiates the refresh operation. When the API call completes and returns a
     * success code, it doesn't necessarily mean that the file refresh has completed. You should use the
     * refresh-complete notification to determine that the operation has completed before you check for new files on the
     * gateway file share. You can subscribe to be notified through an CloudWatch event when your
     * <code>RefreshCache</code> operation completes.
     * </p>
     * 
     * @param refreshCacheRequest
     *        RefreshCacheInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RefreshCache operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.RefreshCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RefreshCache" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RefreshCacheResult> refreshCacheAsync(RefreshCacheRequest refreshCacheRequest,
            com.amazonaws.handlers.AsyncHandler<RefreshCacheRequest, RefreshCacheResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified resource. This operation is only supported in the cached volume,
     * stored volume and tape gateway types.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        RemoveTagsFromResourceInput
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSStorageGatewayAsync.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RemoveTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource. This operation is only supported in the cached volume,
     * stored volume and tape gateway types.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        RemoveTagsFromResourceInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RemoveTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * Simplified method form for invoking the RemoveTagsFromResource operation.
     *
     * @see #removeTagsFromResourceAsync(RemoveTagsFromResourceRequest)
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync();

    /**
     * Simplified method form for invoking the RemoveTagsFromResource operation with an AsyncHandler.
     *
     * @see #removeTagsFromResourceAsync(RemoveTagsFromResourceRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache
     * storage. If your cache disk encounters a error, the gateway prevents read and write operations on virtual tapes
     * in the gateway. For example, an error can occur when a disk is corrupted or removed from the gateway. When a
     * cache is reset, the gateway loses its cache storage. At this point you can reconfigure the disks as cache disks.
     * This operation is only supported in the cached volume and tape types.
     * </p>
     * <important>
     * <p>
     * If the cache disk you are resetting contains data that has not been uploaded to Amazon S3 yet, that data can be
     * lost. After you reset cache disks, there will be no configured cache disks left in the gateway, so you must
     * configure at least one new cache disk for your gateway to function properly.
     * </p>
     * </important>
     * 
     * @param resetCacheRequest
     * @return A Java Future containing the result of the ResetCache operation returned by the service.
     * @sample AWSStorageGatewayAsync.ResetCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ResetCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetCacheResult> resetCacheAsync(ResetCacheRequest resetCacheRequest);

    /**
     * <p>
     * Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache
     * storage. If your cache disk encounters a error, the gateway prevents read and write operations on virtual tapes
     * in the gateway. For example, an error can occur when a disk is corrupted or removed from the gateway. When a
     * cache is reset, the gateway loses its cache storage. At this point you can reconfigure the disks as cache disks.
     * This operation is only supported in the cached volume and tape types.
     * </p>
     * <important>
     * <p>
     * If the cache disk you are resetting contains data that has not been uploaded to Amazon S3 yet, that data can be
     * lost. After you reset cache disks, there will be no configured cache disks left in the gateway, so you must
     * configure at least one new cache disk for your gateway to function properly.
     * </p>
     * </important>
     * 
     * @param resetCacheRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetCache operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ResetCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ResetCache" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetCacheResult> resetCacheAsync(ResetCacheRequest resetCacheRequest,
            com.amazonaws.handlers.AsyncHandler<ResetCacheRequest, ResetCacheResult> asyncHandler);

    /**
     * <p>
     * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a tape gateway. Virtual tapes archived in
     * the VTS are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway,
     * even though it is also listed in the VTS, that is, archive. This operation is only supported in the tape gateway
     * type.
     * </p>
     * <p>
     * Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must
     * archive the tape again before you can retrieve it to another gateway. This operation is only supported in the
     * tape gateway type.
     * </p>
     * 
     * @param retrieveTapeArchiveRequest
     *        RetrieveTapeArchiveInput
     * @return A Java Future containing the result of the RetrieveTapeArchive operation returned by the service.
     * @sample AWSStorageGatewayAsync.RetrieveTapeArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RetrieveTapeArchive"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RetrieveTapeArchiveResult> retrieveTapeArchiveAsync(RetrieveTapeArchiveRequest retrieveTapeArchiveRequest);

    /**
     * <p>
     * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a tape gateway. Virtual tapes archived in
     * the VTS are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway,
     * even though it is also listed in the VTS, that is, archive. This operation is only supported in the tape gateway
     * type.
     * </p>
     * <p>
     * Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must
     * archive the tape again before you can retrieve it to another gateway. This operation is only supported in the
     * tape gateway type.
     * </p>
     * 
     * @param retrieveTapeArchiveRequest
     *        RetrieveTapeArchiveInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetrieveTapeArchive operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.RetrieveTapeArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RetrieveTapeArchive"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RetrieveTapeArchiveResult> retrieveTapeArchiveAsync(RetrieveTapeArchiveRequest retrieveTapeArchiveRequest,
            com.amazonaws.handlers.AsyncHandler<RetrieveTapeArchiveRequest, RetrieveTapeArchiveResult> asyncHandler);

    /**
     * <p>
     * Retrieves the recovery point for the specified virtual tape. This operation is only supported in the tape gateway
     * type.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all the data on the tape is consistent. If
     * your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.
     * </p>
     * <note>
     * <p>
     * The virtual tape can be retrieved to only one gateway. The retrieved tape is read-only. The virtual tape can be
     * retrieved to only a tape gateway. There is no charge for retrieving recovery points.
     * </p>
     * </note>
     * 
     * @param retrieveTapeRecoveryPointRequest
     *        RetrieveTapeRecoveryPointInput
     * @return A Java Future containing the result of the RetrieveTapeRecoveryPoint operation returned by the service.
     * @sample AWSStorageGatewayAsync.RetrieveTapeRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RetrieveTapeRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RetrieveTapeRecoveryPointResult> retrieveTapeRecoveryPointAsync(
            RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest);

    /**
     * <p>
     * Retrieves the recovery point for the specified virtual tape. This operation is only supported in the tape gateway
     * type.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all the data on the tape is consistent. If
     * your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.
     * </p>
     * <note>
     * <p>
     * The virtual tape can be retrieved to only one gateway. The retrieved tape is read-only. The virtual tape can be
     * retrieved to only a tape gateway. There is no charge for retrieving recovery points.
     * </p>
     * </note>
     * 
     * @param retrieveTapeRecoveryPointRequest
     *        RetrieveTapeRecoveryPointInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetrieveTapeRecoveryPoint operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.RetrieveTapeRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RetrieveTapeRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RetrieveTapeRecoveryPointResult> retrieveTapeRecoveryPointAsync(
            RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest,
            com.amazonaws.handlers.AsyncHandler<RetrieveTapeRecoveryPointRequest, RetrieveTapeRecoveryPointResult> asyncHandler);

    /**
     * <p>
     * Sets the password for your VM local console. When you log in to the local console for the first time, you log in
     * to the VM with the default credentials. We recommend that you set a new password. You don't need to know the
     * default password to set a new password.
     * </p>
     * 
     * @param setLocalConsolePasswordRequest
     *        SetLocalConsolePasswordInput
     * @return A Java Future containing the result of the SetLocalConsolePassword operation returned by the service.
     * @sample AWSStorageGatewayAsync.SetLocalConsolePassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/SetLocalConsolePassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetLocalConsolePasswordResult> setLocalConsolePasswordAsync(SetLocalConsolePasswordRequest setLocalConsolePasswordRequest);

    /**
     * <p>
     * Sets the password for your VM local console. When you log in to the local console for the first time, you log in
     * to the VM with the default credentials. We recommend that you set a new password. You don't need to know the
     * default password to set a new password.
     * </p>
     * 
     * @param setLocalConsolePasswordRequest
     *        SetLocalConsolePasswordInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetLocalConsolePassword operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.SetLocalConsolePassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/SetLocalConsolePassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetLocalConsolePasswordResult> setLocalConsolePasswordAsync(SetLocalConsolePasswordRequest setLocalConsolePasswordRequest,
            com.amazonaws.handlers.AsyncHandler<SetLocalConsolePasswordRequest, SetLocalConsolePasswordResult> asyncHandler);

    /**
     * <p>
     * Sets the password for the guest user <code>smbguest</code>. The <code>smbguest</code> user is the user when the
     * authentication method for the file share is set to <code>GuestAccess</code>.
     * </p>
     * 
     * @param setSMBGuestPasswordRequest
     *        SetSMBGuestPasswordInput
     * @return A Java Future containing the result of the SetSMBGuestPassword operation returned by the service.
     * @sample AWSStorageGatewayAsync.SetSMBGuestPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/SetSMBGuestPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetSMBGuestPasswordResult> setSMBGuestPasswordAsync(SetSMBGuestPasswordRequest setSMBGuestPasswordRequest);

    /**
     * <p>
     * Sets the password for the guest user <code>smbguest</code>. The <code>smbguest</code> user is the user when the
     * authentication method for the file share is set to <code>GuestAccess</code>.
     * </p>
     * 
     * @param setSMBGuestPasswordRequest
     *        SetSMBGuestPasswordInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetSMBGuestPassword operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.SetSMBGuestPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/SetSMBGuestPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetSMBGuestPasswordResult> setSMBGuestPasswordAsync(SetSMBGuestPasswordRequest setSMBGuestPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<SetSMBGuestPasswordRequest, SetSMBGuestPasswordResult> asyncHandler);

    /**
     * <p>
     * Shuts down a gateway. To specify which gateway to shut down, use the Amazon Resource Name (ARN) of the gateway in
     * the body of your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the gateway's virtual machine (VM) and not the
     * host VM.
     * </p>
     * <note>
     * <p>
     * If you want to shut down the VM, it is recommended that you first shut down the gateway component in the VM to
     * avoid unpredictable conditions.
     * </p>
     * </note>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except <a>StartGateway</a>,
     * <a>DescribeGatewayInformation</a>, and <a>ListGateways</a>. For more information, see <a>ActivateGateway</a>.
     * Your applications cannot read from or write to the gateway's storage volumes, and there are no snapshots taken.
     * </p>
     * <note>
     * <p>
     * When you make a shutdown request, you will get a <code>200 OK</code> success response immediately. However, it
     * might take some time for the gateway to shut down. You can call the <a>DescribeGatewayInformation</a> API to
     * check the status. For more information, see <a>ActivateGateway</a>.
     * </p>
     * </note>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway (using <a>DeleteGateway</a>) to no longer
     * pay software charges associated with the gateway.
     * </p>
     * 
     * @param shutdownGatewayRequest
     *        A JSON object containing the of the gateway to shut down.
     * @return A Java Future containing the result of the ShutdownGateway operation returned by the service.
     * @sample AWSStorageGatewayAsync.ShutdownGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ShutdownGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ShutdownGatewayResult> shutdownGatewayAsync(ShutdownGatewayRequest shutdownGatewayRequest);

    /**
     * <p>
     * Shuts down a gateway. To specify which gateway to shut down, use the Amazon Resource Name (ARN) of the gateway in
     * the body of your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the gateway's virtual machine (VM) and not the
     * host VM.
     * </p>
     * <note>
     * <p>
     * If you want to shut down the VM, it is recommended that you first shut down the gateway component in the VM to
     * avoid unpredictable conditions.
     * </p>
     * </note>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except <a>StartGateway</a>,
     * <a>DescribeGatewayInformation</a>, and <a>ListGateways</a>. For more information, see <a>ActivateGateway</a>.
     * Your applications cannot read from or write to the gateway's storage volumes, and there are no snapshots taken.
     * </p>
     * <note>
     * <p>
     * When you make a shutdown request, you will get a <code>200 OK</code> success response immediately. However, it
     * might take some time for the gateway to shut down. You can call the <a>DescribeGatewayInformation</a> API to
     * check the status. For more information, see <a>ActivateGateway</a>.
     * </p>
     * </note>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway (using <a>DeleteGateway</a>) to no longer
     * pay software charges associated with the gateway.
     * </p>
     * 
     * @param shutdownGatewayRequest
     *        A JSON object containing the of the gateway to shut down.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ShutdownGateway operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.ShutdownGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ShutdownGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ShutdownGatewayResult> shutdownGatewayAsync(ShutdownGatewayRequest shutdownGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<ShutdownGatewayRequest, ShutdownGatewayResult> asyncHandler);

    /**
     * <p>
     * Starts a gateway that you previously shut down (see <a>ShutdownGateway</a>). After the gateway starts, you can
     * then make other API calls, your applications can read from or write to the gateway's storage volumes and you will
     * be able to take snapshot backups.
     * </p>
     * <note>
     * <p>
     * When you make a request, you will get a 200 OK success response immediately. However, it might take some time for
     * the gateway to be ready. You should call <a>DescribeGatewayInformation</a> and check the status before making any
     * additional API calls. For more information, see <a>ActivateGateway</a>.
     * </p>
     * </note>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param startGatewayRequest
     *        A JSON object containing the of the gateway to start.
     * @return A Java Future containing the result of the StartGateway operation returned by the service.
     * @sample AWSStorageGatewayAsync.StartGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/StartGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartGatewayResult> startGatewayAsync(StartGatewayRequest startGatewayRequest);

    /**
     * <p>
     * Starts a gateway that you previously shut down (see <a>ShutdownGateway</a>). After the gateway starts, you can
     * then make other API calls, your applications can read from or write to the gateway's storage volumes and you will
     * be able to take snapshot backups.
     * </p>
     * <note>
     * <p>
     * When you make a request, you will get a 200 OK success response immediately. However, it might take some time for
     * the gateway to be ready. You should call <a>DescribeGatewayInformation</a> and check the status before making any
     * additional API calls. For more information, see <a>ActivateGateway</a>.
     * </p>
     * </note>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param startGatewayRequest
     *        A JSON object containing the of the gateway to start.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartGateway operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.StartGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/StartGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartGatewayResult> startGatewayAsync(StartGatewayRequest startGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<StartGatewayRequest, StartGatewayResult> asyncHandler);

    /**
     * <p>
     * Updates the bandwidth rate limits of a gateway. You can update both the upload and download bandwidth rate limit
     * or specify only one of the two. If you don't set a bandwidth rate limit, the existing rate limit remains.
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you don't set any limit, the gateway does not have
     * any limitations on its bandwidth usage and could potentially use the maximum available bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param updateBandwidthRateLimitRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the UpdateBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateBandwidthRateLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateBandwidthRateLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest);

    /**
     * <p>
     * Updates the bandwidth rate limits of a gateway. You can update both the upload and download bandwidth rate limit
     * or specify only one of the two. If you don't set a bandwidth rate limit, the existing rate limit remains.
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you don't set any limit, the gateway does not have
     * any limitations on its bandwidth usage and could potentially use the maximum available bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param updateBandwidthRateLimitRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBandwidthRateLimit operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateBandwidthRateLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateBandwidthRateLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBandwidthRateLimitRequest, UpdateBandwidthRateLimitResult> asyncHandler);

    /**
     * <p>
     * Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target. By
     * default, a gateway does not have CHAP enabled; however, for added security, you might use it.
     * </p>
     * <important>
     * <p>
     * When you update CHAP credentials, all existing connections on the target are closed and initiators must reconnect
     * with the new credentials.
     * </p>
     * </important>
     * 
     * @param updateChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$InitiatorName</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$TargetARN</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the UpdateChapCredentials operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateChapCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateChapCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(UpdateChapCredentialsRequest updateChapCredentialsRequest);

    /**
     * <p>
     * Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target. By
     * default, a gateway does not have CHAP enabled; however, for added security, you might use it.
     * </p>
     * <important>
     * <p>
     * When you update CHAP credentials, all existing connections on the target are closed and initiators must reconnect
     * with the new credentials.
     * </p>
     * </important>
     * 
     * @param updateChapCredentialsRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$InitiatorName</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateChapCredentialsInput$TargetARN</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChapCredentials operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateChapCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateChapCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(UpdateChapCredentialsRequest updateChapCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChapCredentialsRequest, UpdateChapCredentialsResult> asyncHandler);

    /**
     * <p>
     * Updates a gateway's metadata, which includes the gateway's name and time zone. To specify which gateway to
     * update, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * <note>
     * <p>
     * For Gateways activated after September 2, 2015, the gateway's ARN contains the gateway ID rather than the gateway
     * name. However, changing the name of the gateway has no effect on the gateway's ARN.
     * </p>
     * </note>
     * 
     * @param updateGatewayInformationRequest
     * @return A Java Future containing the result of the UpdateGatewayInformation operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateGatewayInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateGatewayInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest updateGatewayInformationRequest);

    /**
     * <p>
     * Updates a gateway's metadata, which includes the gateway's name and time zone. To specify which gateway to
     * update, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * <note>
     * <p>
     * For Gateways activated after September 2, 2015, the gateway's ARN contains the gateway ID rather than the gateway
     * name. However, changing the name of the gateway has no effect on the gateway's ARN.
     * </p>
     * </note>
     * 
     * @param updateGatewayInformationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGatewayInformation operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateGatewayInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateGatewayInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest updateGatewayInformationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewayInformationRequest, UpdateGatewayInformationResult> asyncHandler);

    /**
     * <p>
     * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.
     * </p>
     * <note>
     * <p>
     * When you make this request, you get a <code>200 OK</code> success response immediately. However, it might take
     * some time for the update to complete. You can call <a>DescribeGatewayInformation</a> to verify the gateway is in
     * the <code>STATE_RUNNING</code> state.
     * </p>
     * </note> <important>
     * <p>
     * A software update forces a system restart of your gateway. You can minimize the chance of any disruption to your
     * applications by increasing your iSCSI Initiators' timeouts. For more information about increasing iSCSI Initiator
     * timeouts for Windows and Linux, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorWindowsClient.html#CustomizeWindowsiSCSISettings"
     * >Customizing Your Windows iSCSI Settings</a> and <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorRedHatClient.html#CustomizeLinuxiSCSISettings"
     * >Customizing Your Linux iSCSI Settings</a>, respectively.
     * </p>
     * </important>
     * 
     * @param updateGatewaySoftwareNowRequest
     *        A JSON object containing the of the gateway to update.
     * @return A Java Future containing the result of the UpdateGatewaySoftwareNow operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateGatewaySoftwareNow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateGatewaySoftwareNow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest);

    /**
     * <p>
     * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.
     * </p>
     * <note>
     * <p>
     * When you make this request, you get a <code>200 OK</code> success response immediately. However, it might take
     * some time for the update to complete. You can call <a>DescribeGatewayInformation</a> to verify the gateway is in
     * the <code>STATE_RUNNING</code> state.
     * </p>
     * </note> <important>
     * <p>
     * A software update forces a system restart of your gateway. You can minimize the chance of any disruption to your
     * applications by increasing your iSCSI Initiators' timeouts. For more information about increasing iSCSI Initiator
     * timeouts for Windows and Linux, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorWindowsClient.html#CustomizeWindowsiSCSISettings"
     * >Customizing Your Windows iSCSI Settings</a> and <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorRedHatClient.html#CustomizeLinuxiSCSISettings"
     * >Customizing Your Linux iSCSI Settings</a>, respectively.
     * </p>
     * </important>
     * 
     * @param updateGatewaySoftwareNowRequest
     *        A JSON object containing the of the gateway to update.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGatewaySoftwareNow operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateGatewaySoftwareNow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateGatewaySoftwareNow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewaySoftwareNowRequest, UpdateGatewaySoftwareNowResult> asyncHandler);

    /**
     * <p>
     * Updates a gateway's weekly maintenance start time information, including day and time of the week. The
     * maintenance time is the time in your gateway's time zone.
     * </p>
     * 
     * @param updateMaintenanceStartTimeRequest
     *        A JSON object containing the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$DayOfMonth</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$DayOfWeek</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$HourOfDay</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the UpdateMaintenanceStartTime operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateMaintenanceStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateMaintenanceStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(
            UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest);

    /**
     * <p>
     * Updates a gateway's weekly maintenance start time information, including day and time of the week. The
     * maintenance time is the time in your gateway's time zone.
     * </p>
     * 
     * @param updateMaintenanceStartTimeRequest
     *        A JSON object containing the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$DayOfMonth</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$DayOfWeek</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$HourOfDay</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMaintenanceStartTime operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateMaintenanceStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateMaintenanceStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(
            UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceStartTimeRequest, UpdateMaintenanceStartTimeResult> asyncHandler);

    /**
     * <p>
     * Updates a Network File System (NFS) file share. This operation is only supported in the file gateway type.
     * </p>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field to null.
     * </p>
     * </note>
     * <p>
     * Updates the following file share setting:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Default storage class for your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Metadata defaults for your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Allowed NFS clients for your file share
     * </p>
     * </li>
     * <li>
     * <p>
     * Squash settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Write status of your file share
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field to null. This operation is only
     * supported in file gateways.
     * </p>
     * </note>
     * 
     * @param updateNFSFileShareRequest
     *        UpdateNFSFileShareInput
     * @return A Java Future containing the result of the UpdateNFSFileShare operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateNFSFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateNFSFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNFSFileShareResult> updateNFSFileShareAsync(UpdateNFSFileShareRequest updateNFSFileShareRequest);

    /**
     * <p>
     * Updates a Network File System (NFS) file share. This operation is only supported in the file gateway type.
     * </p>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field to null.
     * </p>
     * </note>
     * <p>
     * Updates the following file share setting:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Default storage class for your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Metadata defaults for your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Allowed NFS clients for your file share
     * </p>
     * </li>
     * <li>
     * <p>
     * Squash settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Write status of your file share
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field to null. This operation is only
     * supported in file gateways.
     * </p>
     * </note>
     * 
     * @param updateNFSFileShareRequest
     *        UpdateNFSFileShareInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNFSFileShare operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateNFSFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateNFSFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNFSFileShareResult> updateNFSFileShareAsync(UpdateNFSFileShareRequest updateNFSFileShareRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNFSFileShareRequest, UpdateNFSFileShareResult> asyncHandler);

    /**
     * <p>
     * Updates a Server Message Block (SMB) file share.
     * </p>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field to null. This operation is only
     * supported for file gateways.
     * </p>
     * </note> <important>
     * <p>
     * File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share.
     * Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not
     * activated in this AWS Region, activate it. For information about how to activate AWS STS, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide.</i>
     * </p>
     * <p>
     * File gateways don't support creating hard or symbolic links on a file share.
     * </p>
     * </important>
     * 
     * @param updateSMBFileShareRequest
     *        UpdateSMBFileShareInput
     * @return A Java Future containing the result of the UpdateSMBFileShare operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateSMBFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSMBFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSMBFileShareResult> updateSMBFileShareAsync(UpdateSMBFileShareRequest updateSMBFileShareRequest);

    /**
     * <p>
     * Updates a Server Message Block (SMB) file share.
     * </p>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field to null. This operation is only
     * supported for file gateways.
     * </p>
     * </note> <important>
     * <p>
     * File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share.
     * Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not
     * activated in this AWS Region, activate it. For information about how to activate AWS STS, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide.</i>
     * </p>
     * <p>
     * File gateways don't support creating hard or symbolic links on a file share.
     * </p>
     * </important>
     * 
     * @param updateSMBFileShareRequest
     *        UpdateSMBFileShareInput
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSMBFileShare operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateSMBFileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSMBFileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSMBFileShareResult> updateSMBFileShareAsync(UpdateSMBFileShareRequest updateSMBFileShareRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSMBFileShareRequest, UpdateSMBFileShareResult> asyncHandler);

    /**
     * <p>
     * Updates a snapshot schedule configured for a gateway volume. This operation is only supported in the cached
     * volume and stored volume gateway types.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours, starting at the creation time of the volume. You
     * can use this API to change the snapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot schedule you want to update, and the schedule
     * information, including when you want the snapshot to begin on a day and the frequency (in hours) of snapshots.
     * </p>
     * 
     * @param updateSnapshotScheduleRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$Description</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$RecurrenceInHours</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$StartAt</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$VolumeARN</a>
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the UpdateSnapshotSchedule operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest);

    /**
     * <p>
     * Updates a snapshot schedule configured for a gateway volume. This operation is only supported in the cached
     * volume and stored volume gateway types.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours, starting at the creation time of the volume. You
     * can use this API to change the snapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot schedule you want to update, and the schedule
     * information, including when you want the snapshot to begin on a day and the frequency (in hours) of snapshots.
     * </p>
     * 
     * @param updateSnapshotScheduleRequest
     *        A JSON object containing one or more of the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$Description</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$RecurrenceInHours</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$StartAt</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>UpdateSnapshotScheduleInput$VolumeARN</a>
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSnapshotSchedule operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSnapshotScheduleRequest, UpdateSnapshotScheduleResult> asyncHandler);

    /**
     * <p>
     * Updates the type of medium changer in a tape gateway. When you activate a tape gateway, you select a medium
     * changer type for the tape gateway. This operation enables you to select a different type of medium changer after
     * a tape gateway is activated. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param updateVTLDeviceTypeRequest
     * @return A Java Future containing the result of the UpdateVTLDeviceType operation returned by the service.
     * @sample AWSStorageGatewayAsync.UpdateVTLDeviceType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateVTLDeviceType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVTLDeviceTypeResult> updateVTLDeviceTypeAsync(UpdateVTLDeviceTypeRequest updateVTLDeviceTypeRequest);

    /**
     * <p>
     * Updates the type of medium changer in a tape gateway. When you activate a tape gateway, you select a medium
     * changer type for the tape gateway. This operation enables you to select a different type of medium changer after
     * a tape gateway is activated. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param updateVTLDeviceTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVTLDeviceType operation returned by the service.
     * @sample AWSStorageGatewayAsyncHandler.UpdateVTLDeviceType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateVTLDeviceType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVTLDeviceTypeResult> updateVTLDeviceTypeAsync(UpdateVTLDeviceTypeRequest updateVTLDeviceTypeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVTLDeviceTypeRequest, UpdateVTLDeviceTypeResult> asyncHandler);

}
