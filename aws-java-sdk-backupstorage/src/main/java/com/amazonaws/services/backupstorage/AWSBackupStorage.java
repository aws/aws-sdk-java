/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupstorage;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.backupstorage.model.*;

/**
 * Interface for accessing AWS Backup Storage.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.backupstorage.AbstractAWSBackupStorage} instead.
 * </p>
 * <p>
 * The frontend service for Cryo Storage.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBackupStorage {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "backupstorage";

    /**
     * Delete Object from the incremental base Backup.
     * 
     * @param deleteObjectRequest
     * @return Result of the DeleteObject operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/DeleteObject" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteObjectResult deleteObject(DeleteObjectRequest deleteObjectRequest);

    /**
     * Gets the specified object's chunk.
     * 
     * @param getChunkRequest
     * @return Result of the GetChunk operation returned by the service.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.GetChunk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetChunk" target="_top">AWS API
     *      Documentation</a>
     */
    GetChunkResult getChunk(GetChunkRequest getChunkRequest);

    /**
     * Get metadata associated with an Object.
     * 
     * @param getObjectMetadataRequest
     * @return Result of the GetObjectMetadata operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.GetObjectMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetObjectMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    GetObjectMetadataResult getObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest);

    /**
     * List chunks in a given Object
     * 
     * @param listChunksRequest
     * @return Result of the ListChunks operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.ListChunks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListChunks" target="_top">AWS API
     *      Documentation</a>
     */
    ListChunksResult listChunks(ListChunksRequest listChunksRequest);

    /**
     * List all Objects in a given Backup.
     * 
     * @param listObjectsRequest
     * @return Result of the ListObjects operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.ListObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListObjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListObjectsResult listObjects(ListObjectsRequest listObjectsRequest);

    /**
     * Complete upload
     * 
     * @param notifyObjectCompleteRequest
     * @return Result of the NotifyObjectComplete operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws NotReadableInputStreamException
     *         Retryalble exception. Indicated issues while reading an input stream due to the networking issues or
     *         connection drop on the client side.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.NotifyObjectComplete
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/NotifyObjectComplete"
     *      target="_top">AWS API Documentation</a>
     */
    NotifyObjectCompleteResult notifyObjectComplete(NotifyObjectCompleteRequest notifyObjectCompleteRequest);

    /**
     * Upload chunk.
     * 
     * @param putChunkRequest
     * @return Result of the PutChunk operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws NotReadableInputStreamException
     *         Retryalble exception. Indicated issues while reading an input stream due to the networking issues or
     *         connection drop on the client side.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.PutChunk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutChunk" target="_top">AWS API
     *      Documentation</a>
     */
    PutChunkResult putChunk(PutChunkRequest putChunkRequest);

    /**
     * Upload object that can store object metadata String and data blob in single API call using inline chunk field.
     * 
     * @param putObjectRequest
     * @return Result of the PutObject operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws NotReadableInputStreamException
     *         Retryalble exception. Indicated issues while reading an input stream due to the networking issues or
     *         connection drop on the client side.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.PutObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutObject" target="_top">AWS API
     *      Documentation</a>
     */
    PutObjectResult putObject(PutObjectRequest putObjectRequest);

    /**
     * Start upload containing one or many chunks.
     * 
     * @param startObjectRequest
     * @return Result of the StartObject operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws DataAlreadyExistsException
     *         Non-retryable exception. Attempted to create already existing object or chunk. This message contains a
     *         checksum of already presented data.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.StartObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/StartObject" target="_top">AWS API
     *      Documentation</a>
     */
    StartObjectResult startObject(StartObjectRequest startObjectRequest);

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
