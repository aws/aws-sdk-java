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
package com.amazonaws.services.kinesis;

import javax.annotation.Generated;

import com.amazonaws.services.kinesis.model.*;

/**
 * Abstract implementation of {@code AmazonKinesisAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKinesisAsync extends AbstractAmazonKinesis implements AmazonKinesisAsync {

    protected AbstractAmazonKinesisAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddTagsToStreamResult> addTagsToStreamAsync(AddTagsToStreamRequest request) {

        return addTagsToStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToStreamResult> addTagsToStreamAsync(AddTagsToStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsToStreamRequest, AddTagsToStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest request) {

        return createStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, CreateStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateStream operation.
     *
     * @see #createStreamAsync(CreateStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(String streamName, Integer shardCount) {

        return createStreamAsync(new CreateStreamRequest().withStreamName(streamName).withShardCount(shardCount));
    }

    /**
     * Simplified method form for invoking the CreateStream operation with an AsyncHandler.
     *
     * @see #createStreamAsync(CreateStreamRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(String streamName, Integer shardCount,
            com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, CreateStreamResult> asyncHandler) {

        return createStreamAsync(new CreateStreamRequest().withStreamName(streamName).withShardCount(shardCount), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DecreaseStreamRetentionPeriodResult> decreaseStreamRetentionPeriodAsync(DecreaseStreamRetentionPeriodRequest request) {

        return decreaseStreamRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecreaseStreamRetentionPeriodResult> decreaseStreamRetentionPeriodAsync(DecreaseStreamRetentionPeriodRequest request,
            com.amazonaws.handlers.AsyncHandler<DecreaseStreamRetentionPeriodRequest, DecreaseStreamRetentionPeriodResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest request) {

        return deleteStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, DeleteStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DeleteStream operation.
     *
     * @see #deleteStreamAsync(DeleteStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(String streamName) {

        return deleteStreamAsync(new DeleteStreamRequest().withStreamName(streamName));
    }

    /**
     * Simplified method form for invoking the DeleteStream operation with an AsyncHandler.
     *
     * @see #deleteStreamAsync(DeleteStreamRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(String streamName,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, DeleteStreamResult> asyncHandler) {

        return deleteStreamAsync(new DeleteStreamRequest().withStreamName(streamName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeregisterStreamConsumerResult> deregisterStreamConsumerAsync(DeregisterStreamConsumerRequest request) {

        return deregisterStreamConsumerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterStreamConsumerResult> deregisterStreamConsumerAsync(DeregisterStreamConsumerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterStreamConsumerRequest, DeregisterStreamConsumerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLimitsResult> describeLimitsAsync(DescribeLimitsRequest request) {

        return describeLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLimitsResult> describeLimitsAsync(DescribeLimitsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLimitsRequest, DescribeLimitsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest request) {

        return describeStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName), asyncHandler);
    }

    /**
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName, String exclusiveStartShardId) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName).withExclusiveStartShardId(exclusiveStartShardId));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName, String exclusiveStartShardId,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName).withExclusiveStartShardId(exclusiveStartShardId), asyncHandler);
    }

    /**
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName, Integer limit, String exclusiveStartShardId) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName).withLimit(limit).withExclusiveStartShardId(exclusiveStartShardId));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName, Integer limit, String exclusiveStartShardId,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName).withLimit(limit).withExclusiveStartShardId(exclusiveStartShardId),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamConsumerResult> describeStreamConsumerAsync(DescribeStreamConsumerRequest request) {

        return describeStreamConsumerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamConsumerResult> describeStreamConsumerAsync(DescribeStreamConsumerRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamConsumerRequest, DescribeStreamConsumerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamSummaryResult> describeStreamSummaryAsync(DescribeStreamSummaryRequest request) {

        return describeStreamSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamSummaryResult> describeStreamSummaryAsync(DescribeStreamSummaryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamSummaryRequest, DescribeStreamSummaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableEnhancedMonitoringResult> disableEnhancedMonitoringAsync(DisableEnhancedMonitoringRequest request) {

        return disableEnhancedMonitoringAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableEnhancedMonitoringResult> disableEnhancedMonitoringAsync(DisableEnhancedMonitoringRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableEnhancedMonitoringRequest, DisableEnhancedMonitoringResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableEnhancedMonitoringResult> enableEnhancedMonitoringAsync(EnableEnhancedMonitoringRequest request) {

        return enableEnhancedMonitoringAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableEnhancedMonitoringResult> enableEnhancedMonitoringAsync(EnableEnhancedMonitoringRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableEnhancedMonitoringRequest, EnableEnhancedMonitoringResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest request) {

        return getRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest request) {

        return getShardIteratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest request,
            com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(String streamName, String shardId, String shardIteratorType) {

        return getShardIteratorAsync(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType));
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation with an AsyncHandler.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(String streamName, String shardId, String shardIteratorType,
            com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        return getShardIteratorAsync(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(String streamName, String shardId, String shardIteratorType,
            String startingSequenceNumber) {

        return getShardIteratorAsync(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber));
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation with an AsyncHandler.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(String streamName, String shardId, String shardIteratorType,
            String startingSequenceNumber, com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        return getShardIteratorAsync(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<IncreaseStreamRetentionPeriodResult> increaseStreamRetentionPeriodAsync(IncreaseStreamRetentionPeriodRequest request) {

        return increaseStreamRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IncreaseStreamRetentionPeriodResult> increaseStreamRetentionPeriodAsync(IncreaseStreamRetentionPeriodRequest request,
            com.amazonaws.handlers.AsyncHandler<IncreaseStreamRetentionPeriodRequest, IncreaseStreamRetentionPeriodResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListShardsResult> listShardsAsync(ListShardsRequest request) {

        return listShardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListShardsResult> listShardsAsync(ListShardsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListShardsRequest, ListShardsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStreamConsumersResult> listStreamConsumersAsync(ListStreamConsumersRequest request) {

        return listStreamConsumersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamConsumersResult> listStreamConsumersAsync(ListStreamConsumersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStreamConsumersRequest, ListStreamConsumersResult> asyncHandler) {

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

    /**
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync() {

        return listStreamsAsync(new ListStreamsRequest());
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(new ListStreamsRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(String exclusiveStartStreamName) {

        return listStreamsAsync(new ListStreamsRequest().withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(String exclusiveStartStreamName,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(new ListStreamsRequest().withExclusiveStartStreamName(exclusiveStartStreamName), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(Integer limit, String exclusiveStartStreamName) {

        return listStreamsAsync(new ListStreamsRequest().withLimit(limit).withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(Integer limit, String exclusiveStartStreamName,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(new ListStreamsRequest().withLimit(limit).withExclusiveStartStreamName(exclusiveStartStreamName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(ListTagsForStreamRequest request) {

        return listTagsForStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(ListTagsForStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForStreamRequest, ListTagsForStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<MergeShardsResult> mergeShardsAsync(MergeShardsRequest request) {

        return mergeShardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeShardsResult> mergeShardsAsync(MergeShardsRequest request,
            com.amazonaws.handlers.AsyncHandler<MergeShardsRequest, MergeShardsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the MergeShards operation.
     *
     * @see #mergeShardsAsync(MergeShardsRequest)
     */
    @Override
    public java.util.concurrent.Future<MergeShardsResult> mergeShardsAsync(String streamName, String shardToMerge, String adjacentShardToMerge) {

        return mergeShardsAsync(new MergeShardsRequest().withStreamName(streamName).withShardToMerge(shardToMerge)
                .withAdjacentShardToMerge(adjacentShardToMerge));
    }

    /**
     * Simplified method form for invoking the MergeShards operation with an AsyncHandler.
     *
     * @see #mergeShardsAsync(MergeShardsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<MergeShardsResult> mergeShardsAsync(String streamName, String shardToMerge, String adjacentShardToMerge,
            com.amazonaws.handlers.AsyncHandler<MergeShardsRequest, MergeShardsResult> asyncHandler) {

        return mergeShardsAsync(
                new MergeShardsRequest().withStreamName(streamName).withShardToMerge(shardToMerge).withAdjacentShardToMerge(adjacentShardToMerge), asyncHandler);
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

    /**
     * Simplified method form for invoking the PutRecord operation.
     *
     * @see #putRecordAsync(PutRecordRequest)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(String streamName, java.nio.ByteBuffer data, String partitionKey) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey));
    }

    /**
     * Simplified method form for invoking the PutRecord operation with an AsyncHandler.
     *
     * @see #putRecordAsync(PutRecordRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(String streamName, java.nio.ByteBuffer data, String partitionKey,
            com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey), asyncHandler);
    }

    /**
     * Simplified method form for invoking the PutRecord operation.
     *
     * @see #putRecordAsync(PutRecordRequest)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(String streamName, java.nio.ByteBuffer data, String partitionKey,
            String sequenceNumberForOrdering) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey)
                .withSequenceNumberForOrdering(sequenceNumberForOrdering));
    }

    /**
     * Simplified method form for invoking the PutRecord operation with an AsyncHandler.
     *
     * @see #putRecordAsync(PutRecordRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(String streamName, java.nio.ByteBuffer data, String partitionKey,
            String sequenceNumberForOrdering, com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        return putRecordAsync(
                new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey)
                        .withSequenceNumberForOrdering(sequenceNumberForOrdering), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutRecordsResult> putRecordsAsync(PutRecordsRequest request) {

        return putRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordsResult> putRecordsAsync(PutRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRecordsRequest, PutRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterStreamConsumerResult> registerStreamConsumerAsync(RegisterStreamConsumerRequest request) {

        return registerStreamConsumerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterStreamConsumerResult> registerStreamConsumerAsync(RegisterStreamConsumerRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterStreamConsumerRequest, RegisterStreamConsumerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromStreamResult> removeTagsFromStreamAsync(RemoveTagsFromStreamRequest request) {

        return removeTagsFromStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromStreamResult> removeTagsFromStreamAsync(RemoveTagsFromStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromStreamRequest, RemoveTagsFromStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SplitShardResult> splitShardAsync(SplitShardRequest request) {

        return splitShardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SplitShardResult> splitShardAsync(SplitShardRequest request,
            com.amazonaws.handlers.AsyncHandler<SplitShardRequest, SplitShardResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the SplitShard operation.
     *
     * @see #splitShardAsync(SplitShardRequest)
     */
    @Override
    public java.util.concurrent.Future<SplitShardResult> splitShardAsync(String streamName, String shardToSplit, String newStartingHashKey) {

        return splitShardAsync(new SplitShardRequest().withStreamName(streamName).withShardToSplit(shardToSplit).withNewStartingHashKey(newStartingHashKey));
    }

    /**
     * Simplified method form for invoking the SplitShard operation with an AsyncHandler.
     *
     * @see #splitShardAsync(SplitShardRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SplitShardResult> splitShardAsync(String streamName, String shardToSplit, String newStartingHashKey,
            com.amazonaws.handlers.AsyncHandler<SplitShardRequest, SplitShardResult> asyncHandler) {

        return splitShardAsync(new SplitShardRequest().withStreamName(streamName).withShardToSplit(shardToSplit).withNewStartingHashKey(newStartingHashKey),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<StartStreamEncryptionResult> startStreamEncryptionAsync(StartStreamEncryptionRequest request) {

        return startStreamEncryptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartStreamEncryptionResult> startStreamEncryptionAsync(StartStreamEncryptionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartStreamEncryptionRequest, StartStreamEncryptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopStreamEncryptionResult> stopStreamEncryptionAsync(StopStreamEncryptionRequest request) {

        return stopStreamEncryptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopStreamEncryptionResult> stopStreamEncryptionAsync(StopStreamEncryptionRequest request,
            com.amazonaws.handlers.AsyncHandler<StopStreamEncryptionRequest, StopStreamEncryptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateShardCountResult> updateShardCountAsync(UpdateShardCountRequest request) {

        return updateShardCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateShardCountResult> updateShardCountAsync(UpdateShardCountRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateShardCountRequest, UpdateShardCountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
