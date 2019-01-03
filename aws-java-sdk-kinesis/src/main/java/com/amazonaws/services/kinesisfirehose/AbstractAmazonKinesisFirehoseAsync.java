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
package com.amazonaws.services.kinesisfirehose;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisfirehose.model.*;

/**
 * Abstract implementation of {@code AmazonKinesisFirehoseAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKinesisFirehoseAsync extends AbstractAmazonKinesisFirehose implements AmazonKinesisFirehoseAsync {

    protected AbstractAmazonKinesisFirehoseAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateDeliveryStreamResult> createDeliveryStreamAsync(CreateDeliveryStreamRequest request) {

        return createDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeliveryStreamResult> createDeliveryStreamAsync(CreateDeliveryStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDeliveryStreamRequest, CreateDeliveryStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryStreamResult> deleteDeliveryStreamAsync(DeleteDeliveryStreamRequest request) {

        return deleteDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryStreamResult> deleteDeliveryStreamAsync(DeleteDeliveryStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeliveryStreamRequest, DeleteDeliveryStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryStreamResult> describeDeliveryStreamAsync(DescribeDeliveryStreamRequest request) {

        return describeDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryStreamResult> describeDeliveryStreamAsync(DescribeDeliveryStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryStreamRequest, DescribeDeliveryStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDeliveryStreamsResult> listDeliveryStreamsAsync(ListDeliveryStreamsRequest request) {

        return listDeliveryStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeliveryStreamsResult> listDeliveryStreamsAsync(ListDeliveryStreamsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeliveryStreamsRequest, ListDeliveryStreamsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForDeliveryStreamResult> listTagsForDeliveryStreamAsync(ListTagsForDeliveryStreamRequest request) {

        return listTagsForDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForDeliveryStreamResult> listTagsForDeliveryStreamAsync(ListTagsForDeliveryStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForDeliveryStreamRequest, ListTagsForDeliveryStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(PutRecordRequest request) {

        return putRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(PutRecordRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRecordBatchResult> putRecordBatchAsync(PutRecordBatchRequest request) {

        return putRecordBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordBatchResult> putRecordBatchAsync(PutRecordBatchRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRecordBatchRequest, PutRecordBatchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartDeliveryStreamEncryptionResult> startDeliveryStreamEncryptionAsync(StartDeliveryStreamEncryptionRequest request) {

        return startDeliveryStreamEncryptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDeliveryStreamEncryptionResult> startDeliveryStreamEncryptionAsync(StartDeliveryStreamEncryptionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDeliveryStreamEncryptionRequest, StartDeliveryStreamEncryptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopDeliveryStreamEncryptionResult> stopDeliveryStreamEncryptionAsync(StopDeliveryStreamEncryptionRequest request) {

        return stopDeliveryStreamEncryptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDeliveryStreamEncryptionResult> stopDeliveryStreamEncryptionAsync(StopDeliveryStreamEncryptionRequest request,
            com.amazonaws.handlers.AsyncHandler<StopDeliveryStreamEncryptionRequest, StopDeliveryStreamEncryptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagDeliveryStreamResult> tagDeliveryStreamAsync(TagDeliveryStreamRequest request) {

        return tagDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagDeliveryStreamResult> tagDeliveryStreamAsync(TagDeliveryStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<TagDeliveryStreamRequest, TagDeliveryStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagDeliveryStreamResult> untagDeliveryStreamAsync(UntagDeliveryStreamRequest request) {

        return untagDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagDeliveryStreamResult> untagDeliveryStreamAsync(UntagDeliveryStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagDeliveryStreamRequest, UntagDeliveryStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(UpdateDestinationRequest request) {

        return updateDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(UpdateDestinationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDestinationRequest, UpdateDestinationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
