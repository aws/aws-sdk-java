/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ebs;

import javax.annotation.Generated;

import com.amazonaws.services.ebs.model.*;

/**
 * Abstract implementation of {@code AmazonEBSAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonEBSAsync extends AbstractAmazonEBS implements AmazonEBSAsync {

    protected AbstractAmazonEBSAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotBlockResult> getSnapshotBlockAsync(GetSnapshotBlockRequest request) {

        return getSnapshotBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotBlockResult> getSnapshotBlockAsync(GetSnapshotBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSnapshotBlockRequest, GetSnapshotBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListChangedBlocksResult> listChangedBlocksAsync(ListChangedBlocksRequest request) {

        return listChangedBlocksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChangedBlocksResult> listChangedBlocksAsync(ListChangedBlocksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListChangedBlocksRequest, ListChangedBlocksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSnapshotBlocksResult> listSnapshotBlocksAsync(ListSnapshotBlocksRequest request) {

        return listSnapshotBlocksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSnapshotBlocksResult> listSnapshotBlocksAsync(ListSnapshotBlocksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSnapshotBlocksRequest, ListSnapshotBlocksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
