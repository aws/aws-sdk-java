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

import com.amazonaws.services.backupstorage.model.*;

/**
 * Interface for accessing AWS Backup Storage asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.backupstorage.AbstractAWSBackupStorageAsync} instead.
 * </p>
 * <p>
 * The frontend service for Cryo Storage.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBackupStorageAsync extends AWSBackupStorage {

    /**
     * Delete Object from the incremental base Backup.
     * 
     * @param deleteObjectRequest
     * @return A Java Future containing the result of the DeleteObject operation returned by the service.
     * @sample AWSBackupStorageAsync.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/DeleteObject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest deleteObjectRequest);

    /**
     * Delete Object from the incremental base Backup.
     * 
     * @param deleteObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteObject operation returned by the service.
     * @sample AWSBackupStorageAsyncHandler.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/DeleteObject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest deleteObjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteObjectRequest, DeleteObjectResult> asyncHandler);

    /**
     * Gets the specified object's chunk.
     * 
     * @param getChunkRequest
     * @return A Java Future containing the result of the GetChunk operation returned by the service.
     * @sample AWSBackupStorageAsync.GetChunk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetChunk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChunkResult> getChunkAsync(GetChunkRequest getChunkRequest);

    /**
     * Gets the specified object's chunk.
     * 
     * @param getChunkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChunk operation returned by the service.
     * @sample AWSBackupStorageAsyncHandler.GetChunk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetChunk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChunkResult> getChunkAsync(GetChunkRequest getChunkRequest,
            com.amazonaws.handlers.AsyncHandler<GetChunkRequest, GetChunkResult> asyncHandler);

    /**
     * Get metadata associated with an Object.
     * 
     * @param getObjectMetadataRequest
     * @return A Java Future containing the result of the GetObjectMetadata operation returned by the service.
     * @sample AWSBackupStorageAsync.GetObjectMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetObjectMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetObjectMetadataResult> getObjectMetadataAsync(GetObjectMetadataRequest getObjectMetadataRequest);

    /**
     * Get metadata associated with an Object.
     * 
     * @param getObjectMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetObjectMetadata operation returned by the service.
     * @sample AWSBackupStorageAsyncHandler.GetObjectMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetObjectMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetObjectMetadataResult> getObjectMetadataAsync(GetObjectMetadataRequest getObjectMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetObjectMetadataRequest, GetObjectMetadataResult> asyncHandler);

    /**
     * List chunks in a given Object
     * 
     * @param listChunksRequest
     * @return A Java Future containing the result of the ListChunks operation returned by the service.
     * @sample AWSBackupStorageAsync.ListChunks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListChunks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChunksResult> listChunksAsync(ListChunksRequest listChunksRequest);

    /**
     * List chunks in a given Object
     * 
     * @param listChunksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChunks operation returned by the service.
     * @sample AWSBackupStorageAsyncHandler.ListChunks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListChunks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChunksResult> listChunksAsync(ListChunksRequest listChunksRequest,
            com.amazonaws.handlers.AsyncHandler<ListChunksRequest, ListChunksResult> asyncHandler);

    /**
     * List all Objects in a given Backup.
     * 
     * @param listObjectsRequest
     * @return A Java Future containing the result of the ListObjects operation returned by the service.
     * @sample AWSBackupStorageAsync.ListObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListObjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListObjectsResult> listObjectsAsync(ListObjectsRequest listObjectsRequest);

    /**
     * List all Objects in a given Backup.
     * 
     * @param listObjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListObjects operation returned by the service.
     * @sample AWSBackupStorageAsyncHandler.ListObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListObjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListObjectsResult> listObjectsAsync(ListObjectsRequest listObjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListObjectsRequest, ListObjectsResult> asyncHandler);

    /**
     * Complete upload
     * 
     * @param notifyObjectCompleteRequest
     * @return A Java Future containing the result of the NotifyObjectComplete operation returned by the service.
     * @sample AWSBackupStorageAsync.NotifyObjectComplete
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/NotifyObjectComplete"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyObjectCompleteResult> notifyObjectCompleteAsync(NotifyObjectCompleteRequest notifyObjectCompleteRequest);

    /**
     * Complete upload
     * 
     * @param notifyObjectCompleteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the NotifyObjectComplete operation returned by the service.
     * @sample AWSBackupStorageAsyncHandler.NotifyObjectComplete
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/NotifyObjectComplete"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyObjectCompleteResult> notifyObjectCompleteAsync(NotifyObjectCompleteRequest notifyObjectCompleteRequest,
            com.amazonaws.handlers.AsyncHandler<NotifyObjectCompleteRequest, NotifyObjectCompleteResult> asyncHandler);

    /**
     * Upload chunk.
     * 
     * @param putChunkRequest
     * @return A Java Future containing the result of the PutChunk operation returned by the service.
     * @sample AWSBackupStorageAsync.PutChunk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutChunk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutChunkResult> putChunkAsync(PutChunkRequest putChunkRequest);

    /**
     * Upload chunk.
     * 
     * @param putChunkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutChunk operation returned by the service.
     * @sample AWSBackupStorageAsyncHandler.PutChunk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutChunk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutChunkResult> putChunkAsync(PutChunkRequest putChunkRequest,
            com.amazonaws.handlers.AsyncHandler<PutChunkRequest, PutChunkResult> asyncHandler);

    /**
     * Upload object that can store object metadata String and data blob in single API call using inline chunk field.
     * 
     * @param putObjectRequest
     * @return A Java Future containing the result of the PutObject operation returned by the service.
     * @sample AWSBackupStorageAsync.PutObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutObject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutObjectResult> putObjectAsync(PutObjectRequest putObjectRequest);

    /**
     * Upload object that can store object metadata String and data blob in single API call using inline chunk field.
     * 
     * @param putObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutObject operation returned by the service.
     * @sample AWSBackupStorageAsyncHandler.PutObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutObject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutObjectResult> putObjectAsync(PutObjectRequest putObjectRequest,
            com.amazonaws.handlers.AsyncHandler<PutObjectRequest, PutObjectResult> asyncHandler);

    /**
     * Start upload containing one or many chunks.
     * 
     * @param startObjectRequest
     * @return A Java Future containing the result of the StartObject operation returned by the service.
     * @sample AWSBackupStorageAsync.StartObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/StartObject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartObjectResult> startObjectAsync(StartObjectRequest startObjectRequest);

    /**
     * Start upload containing one or many chunks.
     * 
     * @param startObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartObject operation returned by the service.
     * @sample AWSBackupStorageAsyncHandler.StartObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/StartObject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartObjectResult> startObjectAsync(StartObjectRequest startObjectRequest,
            com.amazonaws.handlers.AsyncHandler<StartObjectRequest, StartObjectResult> asyncHandler);

}
