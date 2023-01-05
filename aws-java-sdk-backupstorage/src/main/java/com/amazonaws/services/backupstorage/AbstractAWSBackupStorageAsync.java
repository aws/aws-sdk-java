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
 * Abstract implementation of {@code AWSBackupStorageAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBackupStorageAsync extends AbstractAWSBackupStorage implements AWSBackupStorageAsync {

    protected AbstractAWSBackupStorageAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest request) {

        return deleteObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteObjectRequest, DeleteObjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetChunkResult> getChunkAsync(GetChunkRequest request) {

        return getChunkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChunkResult> getChunkAsync(GetChunkRequest request,
            com.amazonaws.handlers.AsyncHandler<GetChunkRequest, GetChunkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetObjectMetadataResult> getObjectMetadataAsync(GetObjectMetadataRequest request) {

        return getObjectMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetObjectMetadataResult> getObjectMetadataAsync(GetObjectMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetObjectMetadataRequest, GetObjectMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListChunksResult> listChunksAsync(ListChunksRequest request) {

        return listChunksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChunksResult> listChunksAsync(ListChunksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListChunksRequest, ListChunksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListObjectsResult> listObjectsAsync(ListObjectsRequest request) {

        return listObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectsResult> listObjectsAsync(ListObjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListObjectsRequest, ListObjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<NotifyObjectCompleteResult> notifyObjectCompleteAsync(NotifyObjectCompleteRequest request) {

        return notifyObjectCompleteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyObjectCompleteResult> notifyObjectCompleteAsync(NotifyObjectCompleteRequest request,
            com.amazonaws.handlers.AsyncHandler<NotifyObjectCompleteRequest, NotifyObjectCompleteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutChunkResult> putChunkAsync(PutChunkRequest request) {

        return putChunkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutChunkResult> putChunkAsync(PutChunkRequest request,
            com.amazonaws.handlers.AsyncHandler<PutChunkRequest, PutChunkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutObjectResult> putObjectAsync(PutObjectRequest request) {

        return putObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutObjectResult> putObjectAsync(PutObjectRequest request,
            com.amazonaws.handlers.AsyncHandler<PutObjectRequest, PutObjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartObjectResult> startObjectAsync(StartObjectRequest request) {

        return startObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartObjectResult> startObjectAsync(StartObjectRequest request,
            com.amazonaws.handlers.AsyncHandler<StartObjectRequest, StartObjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
