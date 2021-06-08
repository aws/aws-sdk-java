/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivs;

import javax.annotation.Generated;

import com.amazonaws.services.ivs.model.*;

/**
 * Abstract implementation of {@code AmazonIVSAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonIVSAsync extends AbstractAmazonIVS implements AmazonIVSAsync {

    protected AbstractAmazonIVSAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchGetChannelResult> batchGetChannelAsync(BatchGetChannelRequest request) {

        return batchGetChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetChannelResult> batchGetChannelAsync(BatchGetChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetChannelRequest, BatchGetChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetStreamKeyResult> batchGetStreamKeyAsync(BatchGetStreamKeyRequest request) {

        return batchGetStreamKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetStreamKeyResult> batchGetStreamKeyAsync(BatchGetStreamKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetStreamKeyRequest, BatchGetStreamKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest request) {

        return createChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRecordingConfigurationResult> createRecordingConfigurationAsync(CreateRecordingConfigurationRequest request) {

        return createRecordingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRecordingConfigurationResult> createRecordingConfigurationAsync(CreateRecordingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRecordingConfigurationRequest, CreateRecordingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStreamKeyResult> createStreamKeyAsync(CreateStreamKeyRequest request) {

        return createStreamKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamKeyResult> createStreamKeyAsync(CreateStreamKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStreamKeyRequest, CreateStreamKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest request) {

        return deleteChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePlaybackKeyPairResult> deletePlaybackKeyPairAsync(DeletePlaybackKeyPairRequest request) {

        return deletePlaybackKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlaybackKeyPairResult> deletePlaybackKeyPairAsync(DeletePlaybackKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePlaybackKeyPairRequest, DeletePlaybackKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRecordingConfigurationResult> deleteRecordingConfigurationAsync(DeleteRecordingConfigurationRequest request) {

        return deleteRecordingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecordingConfigurationResult> deleteRecordingConfigurationAsync(DeleteRecordingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRecordingConfigurationRequest, DeleteRecordingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamKeyResult> deleteStreamKeyAsync(DeleteStreamKeyRequest request) {

        return deleteStreamKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamKeyResult> deleteStreamKeyAsync(DeleteStreamKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamKeyRequest, DeleteStreamKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest request) {

        return getChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<GetChannelRequest, GetChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPlaybackKeyPairResult> getPlaybackKeyPairAsync(GetPlaybackKeyPairRequest request) {

        return getPlaybackKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPlaybackKeyPairResult> getPlaybackKeyPairAsync(GetPlaybackKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPlaybackKeyPairRequest, GetPlaybackKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRecordingConfigurationResult> getRecordingConfigurationAsync(GetRecordingConfigurationRequest request) {

        return getRecordingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecordingConfigurationResult> getRecordingConfigurationAsync(GetRecordingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRecordingConfigurationRequest, GetRecordingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStreamResult> getStreamAsync(GetStreamRequest request) {

        return getStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamResult> getStreamAsync(GetStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStreamRequest, GetStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStreamKeyResult> getStreamKeyAsync(GetStreamKeyRequest request) {

        return getStreamKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamKeyResult> getStreamKeyAsync(GetStreamKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStreamKeyRequest, GetStreamKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportPlaybackKeyPairResult> importPlaybackKeyPairAsync(ImportPlaybackKeyPairRequest request) {

        return importPlaybackKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportPlaybackKeyPairResult> importPlaybackKeyPairAsync(ImportPlaybackKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportPlaybackKeyPairRequest, ImportPlaybackKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request) {

        return listChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPlaybackKeyPairsResult> listPlaybackKeyPairsAsync(ListPlaybackKeyPairsRequest request) {

        return listPlaybackKeyPairsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlaybackKeyPairsResult> listPlaybackKeyPairsAsync(ListPlaybackKeyPairsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPlaybackKeyPairsRequest, ListPlaybackKeyPairsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecordingConfigurationsResult> listRecordingConfigurationsAsync(ListRecordingConfigurationsRequest request) {

        return listRecordingConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecordingConfigurationsResult> listRecordingConfigurationsAsync(ListRecordingConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecordingConfigurationsRequest, ListRecordingConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStreamKeysResult> listStreamKeysAsync(ListStreamKeysRequest request) {

        return listStreamKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamKeysResult> listStreamKeysAsync(ListStreamKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStreamKeysRequest, ListStreamKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request) {

        return listStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutMetadataResult> putMetadataAsync(PutMetadataRequest request) {

        return putMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMetadataResult> putMetadataAsync(PutMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<PutMetadataRequest, PutMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopStreamResult> stopStreamAsync(StopStreamRequest request) {

        return stopStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopStreamResult> stopStreamAsync(StopStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<StopStreamRequest, StopStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest request) {

        return updateChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
