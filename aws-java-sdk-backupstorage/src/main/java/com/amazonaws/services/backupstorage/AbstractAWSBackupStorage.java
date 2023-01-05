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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSBackupStorage}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBackupStorage implements AWSBackupStorage {

    protected AbstractAWSBackupStorage() {
    }

    @Override
    public DeleteObjectResult deleteObject(DeleteObjectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetChunkResult getChunk(GetChunkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetObjectMetadataResult getObjectMetadata(GetObjectMetadataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListChunksResult listChunks(ListChunksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListObjectsResult listObjects(ListObjectsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public NotifyObjectCompleteResult notifyObjectComplete(NotifyObjectCompleteRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutChunkResult putChunk(PutChunkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutObjectResult putObject(PutObjectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartObjectResult startObject(StartObjectRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
