/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.storagegateway.model.*;

/**
 * Interface for accessing AWS Storage Gateway.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.storagegateway.AbstractAWSStorageGateway} instead.
 * </p>
 * <p>
 * <fullname>AWS Storage Gateway Service</fullname>
 * <p>
 * AWS Storage Gateway is the service that connects an on-premises software appliance with cloud-based storage to
 * provide seamless and secure integration between an organization's on-premises IT environment and AWS's storage
 * infrastructure. The service enables you to securely upload data to the AWS cloud for cost effective backup and rapid
 * disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway Service API Reference</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayHTTPRequestsHeaders.html">AWS
 * Storage Gateway Required Request Headers</a>: Describes the required headers that you must send with every POST
 * request to AWS Storage Gateway.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewaySigningRequests.html">Signing
 * Requests</a>: AWS Storage Gateway requires that you authenticate every request you send; this topic describes how
 * sign such a request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/APIErrorResponses.html">Error Responses</a>:
 * Provides reference information about AWS Storage Gateway errors.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPIOperations.html">Operations
 * in AWS Storage Gateway</a>: Contains detailed descriptions of all AWS Storage Gateway operations, their request
 * parameters, response elements, possible errors, and examples of requests and responses.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html">AWS Storage Gateway Regions and
 * Endpoints</a>: Provides a list of each of the s and endpoints available for use with AWS Storage Gateway.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * AWS Storage Gateway resource IDs are in uppercase. When you use these resource IDs with the Amazon EC2 API, EC2
 * expects resource IDs in lowercase. You must change your resource ID to lowercase to use it with the EC2 API. For
 * example, in Storage Gateway the ID for a volume might be <code>vol-1122AABB</code>. When you use this ID with the EC2
 * API, you must change it to <code>vol-1122aabb</code>. Otherwise, the EC2 API might not behave as expected.
 * </p>
 * </note> <important>
 * <p>
 * IDs for Storage Gateway volumes and Amazon EBS snapshots created from gateway volumes are changing to a longer
 * format. Starting in December 2016, all new volumes and snapshots will be created with a 17-character string. Starting
 * in April 2016, you will be able to use these longer IDs so you can test your systems with the new format. For more
 * information, see <a href="https://aws.amazon.com/ec2/faqs/#longer-ids">Longer EC2 and EBS Resource IDs</a>.
 * </p>
 * <p>
 * For example, a volume ARN with the longer volume ID format will look like this:
 * </p>
 * <p>
 * <code>arn:aws:storagegateway:us-west-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABBCCDDEEFFG</code>.
 * </p>
 * <p>
 * A snapshot ID with the longer ID format will look like this: <code>snap-78e226633445566ee</code>.
 * </p>
 * <p>
 * For more information, see <a href="https://forums.aws.amazon.com/ann.jspa?annID=3557">Announcement: Heads-up – Longer
 * AWS Storage Gateway volume and snapshot IDs coming in 2016</a>.
 * </p>
 * </important>
 */
public interface AWSStorageGateway {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "storagegateway";

    /**
     * Overrides the default endpoint for this client ("https://storagegateway.us-east-1.amazonaws.com"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "storagegateway.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://storagegateway.us-east-1.amazonaws.com"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "storagegateway.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://storagegateway.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSStorageGateway#setEndpoint(String)}, sets the regional endpoint for this client's
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
     */
    void setRegion(Region region);

    /**
     * <p>
     * Activates the gateway you previously deployed on your host. For more information, see <a
     * href="http://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedActivateGateway-common.html">
     * Activate the AWS Storage Gateway</a>. In the activation process, you specify information such as the you want to
     * use for storing snapshots, the time zone for scheduled snapshots the gateway snapshot schedule window, an
     * activation key, and a name for your gateway. The activation process also associates your gateway with your
     * account; for more information, see <a>UpdateGatewayInformation</a>.
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
     * @return Result of the ActivateGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ActivateGateway
     */
    ActivateGatewayResult activateGateway(ActivateGatewayRequest activateGatewayRequest);

    /**
     * <p>
     * Configures one or more gateway local disks as cache for a cached-volume gateway. This operation is supported only
     * for the gateway-cached volume architecture (see <a
     * href="http://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html">Storage Gateway
     * Concepts</a>).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache, and one or
     * more disk IDs that you want to configure as cache.
     * </p>
     * 
     * @param addCacheRequest
     * @return Result of the AddCache operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.AddCache
     */
    AddCacheResult addCache(AddCacheRequest addCacheRequest);

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
     * You can create a maximum of 10 tags for each resource. Virtual tapes and storage volumes that are recovered to a
     * new gateway maintain their tags.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        AddTagsToResourceInput
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.AddTagsToResource
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Configures one or more gateway local disks as upload buffer for a specified gateway. This operation is supported
     * for both the gateway-stored and gateway-cached volume architectures.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, and
     * one or more disk IDs that you want to configure as upload buffer.
     * </p>
     * 
     * @param addUploadBufferRequest
     * @return Result of the AddUploadBuffer operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.AddUploadBuffer
     */
    AddUploadBufferResult addUploadBuffer(AddUploadBufferRequest addUploadBufferRequest);

    /**
     * <p>
     * Configures one or more gateway local disks as working storage for a gateway. This operation is supported only for
     * the gateway-stored volume architecture. This operation is deprecated in cached-volumes API version 20120630. Use
     * <a>AddUploadBuffer</a> instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use the <a>AddUploadBuffer</a> operation to
     * add upload buffer to a stored-volume gateway.
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
     * @return Result of the AddWorkingStorage operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.AddWorkingStorage
     */
    AddWorkingStorageResult addWorkingStorage(AddWorkingStorageRequest addWorkingStorageRequest);

    /**
     * <p>
     * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated.
     * </p>
     * 
     * @param cancelArchivalRequest
     *        CancelArchivalInput
     * @return Result of the CancelArchival operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CancelArchival
     */
    CancelArchivalResult cancelArchival(CancelArchivalRequest cancelArchivalRequest);

    /**
     * <p>
     * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is
     * initiated. The virtual tape is returned to the VTS.
     * </p>
     * 
     * @param cancelRetrievalRequest
     *        CancelRetrievalInput
     * @return Result of the CancelRetrieval operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CancelRetrieval
     */
    CancelRetrievalResult cancelRetrieval(CancelRetrievalRequest cancelRetrievalRequest);

    /**
     * <p>
     * Creates a cached volume on a specified cached gateway. This operation is supported only for the gateway-cached
     * volume architecture.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a cached volume. Use the <a>AddCache</a>
     * operation to add cache storage to a gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you must specify the gateway, size of the volume in bytes, the iSCSI target name, an IP address
     * on which to expose the target, and a unique client token. In response, AWS Storage Gateway creates the volume and
     * returns information about it such as the volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN
     * that initiators can use to connect to the volume target.
     * </p>
     * 
     * @param createCachediSCSIVolumeRequest
     * @return Result of the CreateCachediSCSIVolume operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateCachediSCSIVolume
     */
    CreateCachediSCSIVolumeResult createCachediSCSIVolume(CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest);

    /**
     * <p>
     * Initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time snapshots of your data to Amazon Simple Storage
     * (S3) for durable off-site recovery, as well as import the data to an Amazon Elastic Block Store (EBS) volume in
     * Amazon Elastic Compute Cloud (EC2). You can take snapshots of your gateway volume on a scheduled or ad-hoc basis.
     * This API enables you to take ad-hoc snapshot. For more information, see <a
     * href="http://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html">Working With
     * Snapshots in the AWS Storage Gateway Console</a>.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its Amazon Resource Name (ARN). You must also
     * provide description for the snapshot. When AWS Storage Gateway takes the snapshot of specified volume, the
     * snapshot and description appears in the AWS Storage Gateway Console. In response, AWS Storage Gateway returns you
     * a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to
     * create a volume from a snapshot.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more information, see DescribeSnapshots or
     * DeleteSnapshot in the <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Operations.html">EC2 API
     * reference</a>.
     * </p>
     * </note> <important>
     * <p>
     * Volume and snapshot IDs are changing to a longer length ID format. For more information, see the important note
     * on the <a href="http://docs.aws.amazon.com/storagegateway/latest/APIReference/Welcome.html">Welcome</a> page.
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
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateSnapshot
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Initiates a snapshot of a gateway from a volume recovery point. This operation is supported only for the
     * gateway-cached volume architecture.
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the volume is consistent and from which you can
     * create a snapshot. To get a list of volume recovery point for gateway-cached volumes, use
     * <a>ListVolumeRecoveryPoints</a>.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide a description for the snapshot. When AWS Storage Gateway takes
     * a snapshot of the specified volume, the snapshot and its description appear in the AWS Storage Gateway console.
     * In response, AWS Storage Gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot
     * progress or later use it when you want to create a volume from a snapshot.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more information, in <i>Amazon Elastic Compute
     * Cloud API Reference</i>.
     * </p>
     * </note>
     * 
     * @param createSnapshotFromVolumeRecoveryPointRequest
     * @return Result of the CreateSnapshotFromVolumeRecoveryPoint operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateSnapshotFromVolumeRecoveryPoint
     */
    CreateSnapshotFromVolumeRecoveryPointResult createSnapshotFromVolumeRecoveryPoint(
            CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest);

    /**
     * <p>
     * Creates a volume on a specified gateway. This operation is supported only for the gateway-stored volume
     * architecture.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You can choose to preserve existing data on the
     * disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty
     * gateway volume, then any existing data on the disk is erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information on which you are creating the volume. In
     * response, AWS Storage Gateway creates the volume and returns volume information such as the volume Amazon
     * Resource Name (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.
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
     * @return Result of the CreateStorediSCSIVolume operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateStorediSCSIVolume
     */
    CreateStorediSCSIVolumeResult createStorediSCSIVolume(CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest);

    /**
     * <p>
     * Creates a virtual tape by using your own barcode. You write data to the virtual tape and then archive the tape.
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
     * @return Result of the CreateTapeWithBarcode operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateTapeWithBarcode
     */
    CreateTapeWithBarcodeResult createTapeWithBarcode(CreateTapeWithBarcodeRequest createTapeWithBarcodeRequest);

    /**
     * <p>
     * Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes.
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
     * @return Result of the CreateTapes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.CreateTapes
     */
    CreateTapesResult createTapes(CreateTapesRequest createTapesRequest);

    /**
     * <p>
     * Deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate
     * limit, or you can delete both. If you delete only one of the limits, the other limit remains unchanged. To
     * specify which gateway to work with, use the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     * 
     * @param deleteBandwidthRateLimitRequest
     * @return Result of the DeleteBandwidthRateLimit operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteBandwidthRateLimit
     */
    DeleteBandwidthRateLimitResult deleteBandwidthRateLimit(DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest);

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
     * @return Result of the DeleteChapCredentials operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteChapCredentials
     */
    DeleteChapCredentialsResult deleteChapCredentials(DeleteChapCredentialsRequest deleteChapCredentialsRequest);

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
     *        A JSON object containing the id of the gateway to delete.
     * @return Result of the DeleteGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteGateway
     */
    DeleteGatewayResult deleteGateway(DeleteGatewayRequest deleteGatewayRequest);

    /**
     * <p>
     * Deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or ad hoc basis. This API action enables you to
     * delete a snapshot schedule for a volume. For more information, see <a
     * href="http://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html">Working with
     * Snapshots</a>. In the <code>DeleteSnapshotSchedule</code> request, you identify the volume by providing its
     * Amazon Resource Name (ARN).
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. in <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotScheduleRequest
     * @return Result of the DeleteSnapshotSchedule operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteSnapshotSchedule
     */
    DeleteSnapshotScheduleResult deleteSnapshotSchedule(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest);

    /**
     * <p>
     * Deletes the specified virtual tape.
     * </p>
     * 
     * @param deleteTapeRequest
     *        DeleteTapeInput
     * @return Result of the DeleteTape operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteTape
     */
    DeleteTapeResult deleteTape(DeleteTapeRequest deleteTapeRequest);

    /**
     * <p>
     * Deletes the specified virtual tape from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param deleteTapeArchiveRequest
     *        DeleteTapeArchiveInput
     * @return Result of the DeleteTapeArchive operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteTapeArchive
     */
    DeleteTapeArchiveResult deleteTapeArchive(DeleteTapeArchiveRequest deleteTapeArchiveRequest);

    /**
     * <p>
     * Deletes the specified gateway volume that you previously created using the <a>CreateCachediSCSIVolume</a> or
     * <a>CreateStorediSCSIVolume</a> API. For gateway-stored volumes, the local disk that was configured as the storage
     * volume is not deleted. You can reuse the local disk to create another storage volume.
     * </p>
     * <p>
     * Before you delete a gateway volume, make sure there are no iSCSI connections to the volume you are deleting. You
     * should also make sure there is no snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2)
     * API to query snapshots on the volume you are deleting and check the snapshot status. For more information, go to
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html">
     * DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.
     * </p>
     * 
     * @param deleteVolumeRequest
     *        A JSON object containing the <a>DeleteVolumeInput$VolumeARN</a> to delete.
     * @return Result of the DeleteVolume operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DeleteVolume
     */
    DeleteVolumeResult deleteVolume(DeleteVolumeRequest deleteVolumeRequest);

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
     * @return Result of the DescribeBandwidthRateLimit operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeBandwidthRateLimit
     */
    DescribeBandwidthRateLimitResult describeBandwidthRateLimit(DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest);

    /**
     * <p>
     * Returns information about the cache of a gateway. This operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it includes the amount of cache allocated and
     * used.
     * </p>
     * 
     * @param describeCacheRequest
     * @return Result of the DescribeCache operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeCache
     */
    DescribeCacheResult describeCache(DescribeCacheRequest describeCacheRequest);

    /**
     * <p>
     * Returns a description of the gateway volumes specified in the request. This operation is supported only for the
     * gateway-cached volume architecture.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway
     * returns volume information sorted by volume Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCachediSCSIVolumesRequest
     * @return Result of the DescribeCachediSCSIVolumes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeCachediSCSIVolumes
     */
    DescribeCachediSCSIVolumesResult describeCachediSCSIVolumes(DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest);

    /**
     * <p>
     * Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified
     * iSCSI target, one for each target-initiator pair.
     * </p>
     * 
     * @param describeChapCredentialsRequest
     *        A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target.
     * @return Result of the DescribeChapCredentials operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeChapCredentials
     */
    DescribeChapCredentialsResult describeChapCredentials(DescribeChapCredentialsRequest describeChapCredentialsRequest);

    /**
     * <p>
     * Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state
     * (whether the gateway is running or not). To specify which gateway to describe, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     * 
     * @param describeGatewayInformationRequest
     *        A JSON object containing the id of the gateway.
     * @return Result of the DescribeGatewayInformation operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeGatewayInformation
     */
    DescribeGatewayInformationResult describeGatewayInformation(DescribeGatewayInformationRequest describeGatewayInformationRequest);

    /**
     * <p>
     * Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are
     * in terms of the gateway's time zone.
     * </p>
     * 
     * @param describeMaintenanceStartTimeRequest
     *        A JSON object containing the of the gateway.
     * @return Result of the DescribeMaintenanceStartTime operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeMaintenanceStartTime
     */
    DescribeMaintenanceStartTimeResult describeMaintenanceStartTime(DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest);

    /**
     * <p>
     * Describes the snapshot schedule for the specified gateway volume. The snapshot schedule information includes
     * intervals at which snapshots are automatically initiated on the volume.
     * </p>
     * 
     * @param describeSnapshotScheduleRequest
     *        A JSON object containing the <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.
     * @return Result of the DescribeSnapshotSchedule operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeSnapshotSchedule
     */
    DescribeSnapshotScheduleResult describeSnapshotSchedule(DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest);

    /**
     * <p>
     * Returns the description of the gateway volumes specified in the request. The list of gateway volumes in the
     * request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by
     * volume ARNs.
     * </p>
     * 
     * @param describeStorediSCSIVolumesRequest
     *        A JSON object containing a list of <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.
     * @return Result of the DescribeStorediSCSIVolumes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeStorediSCSIVolumes
     */
    DescribeStorediSCSIVolumesResult describeStorediSCSIVolumes(DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest);

    /**
     * <p>
     * Returns a description of specified virtual tapes in the virtual tape shelf (VTS).
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage Gateway returns a description of all virtual
     * tapes found in the VTS associated with your account.
     * </p>
     * 
     * @param describeTapeArchivesRequest
     *        DescribeTapeArchivesInput
     * @return Result of the DescribeTapeArchives operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeTapeArchives
     */
    DescribeTapeArchivesResult describeTapeArchives(DescribeTapeArchivesRequest describeTapeArchivesRequest);

    /**
     * Simplified method form for invoking the DescribeTapeArchives operation.
     *
     * @see #describeTapeArchives(DescribeTapeArchivesRequest)
     */
    DescribeTapeArchivesResult describeTapeArchives();

    /**
     * <p>
     * Returns a list of virtual tape recovery points that are available for the specified gateway-VTL.
     * </p>
     * <p>
     * A recovery point is a point-in-time view of a virtual tape at which all the data on the virtual tape is
     * consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.
     * </p>
     * 
     * @param describeTapeRecoveryPointsRequest
     *        DescribeTapeRecoveryPointsInput
     * @return Result of the DescribeTapeRecoveryPoints operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeTapeRecoveryPoints
     */
    DescribeTapeRecoveryPointsResult describeTapeRecoveryPoints(DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest);

    /**
     * <p>
     * Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a <code>TapeARN</code> is
     * not specified, returns a description of all virtual tapes associated with the specified gateway.
     * </p>
     * 
     * @param describeTapesRequest
     *        DescribeTapesInput
     * @return Result of the DescribeTapes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeTapes
     */
    DescribeTapesResult describeTapes(DescribeTapesRequest describeTapesRequest);

    /**
     * <p>
     * Returns information about the upload buffer of a gateway. This operation is supported for both the gateway-stored
     * and gateway-cached volume architectures.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer space, and it includes the amount of upload
     * buffer space allocated and used.
     * </p>
     * 
     * @param describeUploadBufferRequest
     * @return Result of the DescribeUploadBuffer operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeUploadBuffer
     */
    DescribeUploadBufferResult describeUploadBuffer(DescribeUploadBufferRequest describeUploadBufferRequest);

    /**
     * <p>
     * Returns a description of virtual tape library (VTL) devices for the specified gateway. In the response, AWS
     * Storage Gateway returns VTL device information.
     * </p>
     * <p>
     * The list of VTL devices must be from one gateway.
     * </p>
     * 
     * @param describeVTLDevicesRequest
     *        DescribeVTLDevicesInput
     * @return Result of the DescribeVTLDevices operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeVTLDevices
     */
    DescribeVTLDevicesResult describeVTLDevices(DescribeVTLDevicesRequest describeVTLDevicesRequest);

    /**
     * <p>
     * Returns information about the working storage of a gateway. This operation is supported only for the
     * gateway-stored volume architecture. This operation is deprecated in cached-volumes API version (20120630). Use
     * DescribeUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use the DescribeUploadBuffer operation to add
     * upload buffer to a stored-volume gateway.
     * </p>
     * </note>
     * <p>
     * The response includes disk IDs that are configured as working storage, and it includes the amount of working
     * storage allocated and used.
     * </p>
     * 
     * @param describeWorkingStorageRequest
     *        A JSON object containing the of the gateway.
     * @return Result of the DescribeWorkingStorage operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DescribeWorkingStorage
     */
    DescribeWorkingStorageResult describeWorkingStorage(DescribeWorkingStorageRequest describeWorkingStorageRequest);

    /**
     * <p>
     * Disables a gateway when the gateway is no longer functioning. For example, if your gateway VM is damaged, you can
     * disable the gateway so you can recover virtual tapes.
     * </p>
     * <p>
     * Use this operation for a gateway-VTL that is not reachable or not functioning.
     * </p>
     * <important>
     * <p>
     * Once a gateway is disabled it cannot be enabled.
     * </p>
     * </important>
     * 
     * @param disableGatewayRequest
     *        DisableGatewayInput
     * @return Result of the DisableGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.DisableGateway
     */
    DisableGatewayResult disableGateway(DisableGatewayRequest disableGatewayRequest);

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
     * @return Result of the ListGateways operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListGateways
     */
    ListGatewaysResult listGateways(ListGatewaysRequest listGatewaysRequest);

    /**
     * Simplified method form for invoking the ListGateways operation.
     *
     * @see #listGateways(ListGatewaysRequest)
     */
    ListGatewaysResult listGateways();

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
     * @return Result of the ListLocalDisks operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListLocalDisks
     */
    ListLocalDisksResult listLocalDisks(ListLocalDisksRequest listLocalDisksRequest);

    /**
     * <p>
     * Lists the tags that have been added to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceInput
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Simplified method form for invoking the ListTagsForResource operation.
     *
     * @see #listTagsForResource(ListTagsForResourceRequest)
     */
    ListTagsForResourceResult listTagsForResource();

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
     * that you can use in your subsequent request to retrieve the next set of tapes.
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
     * @return Result of the ListTapes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListTapes
     */
    ListTapesResult listTapes(ListTapesRequest listTapesRequest);

    /**
     * <p>
     * Lists iSCSI initiators that are connected to a volume. You can use this operation to determine whether a volume
     * is being used or not.
     * </p>
     * 
     * @param listVolumeInitiatorsRequest
     *        ListVolumeInitiatorsInput
     * @return Result of the ListVolumeInitiators operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListVolumeInitiators
     */
    ListVolumeInitiatorsResult listVolumeInitiators(ListVolumeInitiatorsRequest listVolumeInitiatorsRequest);

    /**
     * <p>
     * Lists the recovery points for a specified gateway. This operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * Each gateway-cached volume has one recovery point. A volume recovery point is a point in time at which all data
     * of the volume is consistent and from which you can create a snapshot. To create a snapshot from a volume recovery
     * point use the <a>CreateSnapshotFromVolumeRecoveryPoint</a> operation.
     * </p>
     * 
     * @param listVolumeRecoveryPointsRequest
     * @return Result of the ListVolumeRecoveryPoints operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListVolumeRecoveryPoints
     */
    ListVolumeRecoveryPointsResult listVolumeRecoveryPoints(ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest);

    /**
     * <p>
     * Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN. The response includes only the
     * volume ARNs. If you want additional volume information, use the <a>DescribeStorediSCSIVolumes</a> API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a maximum of up to 100 volumes. You can
     * optionally specify the <code>Limit</code> field in the body to limit the number of volumes in the response. If
     * the number of volumes returned in the response is truncated, the response includes a Marker field. You can use
     * this Marker value in your subsequent request to retrieve the next set of volumes.
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
     * @return Result of the ListVolumes operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ListVolumes
     */
    ListVolumesResult listVolumes(ListVolumesRequest listVolumesRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        RemoveTagsFromResourceInput
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.RemoveTagsFromResource
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * Simplified method form for invoking the RemoveTagsFromResource operation.
     *
     * @see #removeTagsFromResource(RemoveTagsFromResourceRequest)
     */
    RemoveTagsFromResourceResult removeTagsFromResource();

    /**
     * <p>
     * Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache
     * storage. If your cache disk encounters a error, the gateway prevents read and write operations on virtual tapes
     * in the gateway. For example, an error can occur when a disk is corrupted or removed from the gateway. When a
     * cache is reset, the gateway loses its cache storage. At this point you can reconfigure the disks as cache disks.
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
     * @return Result of the ResetCache operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ResetCache
     */
    ResetCacheResult resetCache(ResetCacheRequest resetCacheRequest);

    /**
     * <p>
     * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a gateway-VTL. Virtual tapes archived in
     * the VTS are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway,
     * even though it is also listed in the VTS.
     * </p>
     * <p>
     * Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must
     * archive the tape again before you can retrieve it to another gateway.
     * </p>
     * 
     * @param retrieveTapeArchiveRequest
     *        RetrieveTapeArchiveInput
     * @return Result of the RetrieveTapeArchive operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.RetrieveTapeArchive
     */
    RetrieveTapeArchiveResult retrieveTapeArchive(RetrieveTapeArchiveRequest retrieveTapeArchiveRequest);

    /**
     * <p>
     * Retrieves the recovery point for the specified virtual tape.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all the data on the tape is consistent. If
     * your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.
     * </p>
     * <note>
     * <p>
     * The virtual tape can be retrieved to only one gateway. The retrieved tape is read-only. The virtual tape can be
     * retrieved to only a gateway-VTL. There is no charge for retrieving recovery points.
     * </p>
     * </note>
     * 
     * @param retrieveTapeRecoveryPointRequest
     *        RetrieveTapeRecoveryPointInput
     * @return Result of the RetrieveTapeRecoveryPoint operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.RetrieveTapeRecoveryPoint
     */
    RetrieveTapeRecoveryPointResult retrieveTapeRecoveryPoint(RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest);

    /**
     * <p>
     * Sets the password for your VM local console. When you log in to the local console for the first time, you log in
     * to the VM with the default credentials. We recommend that you set a new password. You don't need to know the
     * default password to set a new password.
     * </p>
     * 
     * @param setLocalConsolePasswordRequest
     *        SetLocalConsolePasswordInput
     * @return Result of the SetLocalConsolePassword operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.SetLocalConsolePassword
     */
    SetLocalConsolePasswordResult setLocalConsolePassword(SetLocalConsolePasswordRequest setLocalConsolePasswordRequest);

    /**
     * <p>
     * Shuts down a gateway. To specify which gateway to shut down, use the Amazon Resource Name (ARN) of the gateway in
     * the body of your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the storage gateway's virtual machine (VM) and
     * not the VM.
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
     * @return Result of the ShutdownGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.ShutdownGateway
     */
    ShutdownGatewayResult shutdownGateway(ShutdownGatewayRequest shutdownGatewayRequest);

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
     * @return Result of the StartGateway operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.StartGateway
     */
    StartGatewayResult startGateway(StartGatewayRequest startGatewayRequest);

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
     * @return Result of the UpdateBandwidthRateLimit operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateBandwidthRateLimit
     */
    UpdateBandwidthRateLimitResult updateBandwidthRateLimit(UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest);

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
     * @return Result of the UpdateChapCredentials operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateChapCredentials
     */
    UpdateChapCredentialsResult updateChapCredentials(UpdateChapCredentialsRequest updateChapCredentialsRequest);

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
     * @return Result of the UpdateGatewayInformation operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateGatewayInformation
     */
    UpdateGatewayInformationResult updateGatewayInformation(UpdateGatewayInformationRequest updateGatewayInformationRequest);

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
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorWindowsClient.html#CustomizeWindowsiSCSISettings"
     * >Customizing Your Windows iSCSI Settings</a> and <a href=
     * "http://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorRedHatClient.html#CustomizeLinuxiSCSISettings"
     * >Customizing Your Linux iSCSI Settings</a>, respectively.
     * </p>
     * </important>
     * 
     * @param updateGatewaySoftwareNowRequest
     *        A JSON object containing the of the gateway to update.
     * @return Result of the UpdateGatewaySoftwareNow operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateGatewaySoftwareNow
     */
    UpdateGatewaySoftwareNowResult updateGatewaySoftwareNow(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest);

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
     * @return Result of the UpdateMaintenanceStartTime operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateMaintenanceStartTime
     */
    UpdateMaintenanceStartTimeResult updateMaintenanceStartTime(UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest);

    /**
     * <p>
     * Updates a snapshot schedule configured for a gateway volume.
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
     * @return Result of the UpdateSnapshotSchedule operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateSnapshotSchedule
     */
    UpdateSnapshotScheduleResult updateSnapshotSchedule(UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest);

    /**
     * <p>
     * Updates the type of medium changer in a gateway-VTL. When you activate a gateway-VTL, you select a medium changer
     * type for the gateway-VTL. This operation enables you to select a different type of medium changer after a
     * gateway-VTL is activated.
     * </p>
     * 
     * @param updateVTLDeviceTypeRequest
     * @return Result of the UpdateVTLDeviceType operation returned by the service.
     * @throws InvalidGatewayRequestException
     *         An exception occurred because an invalid gateway request was issued to the service. For more information,
     *         see the error and message fields.
     * @throws InternalServerErrorException
     *         An internal server error has occurred during the request. For more information, see the error and message
     *         fields.
     * @sample AWSStorageGateway.UpdateVTLDeviceType
     */
    UpdateVTLDeviceTypeResult updateVTLDeviceType(UpdateVTLDeviceTypeRequest updateVTLDeviceTypeRequest);

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
