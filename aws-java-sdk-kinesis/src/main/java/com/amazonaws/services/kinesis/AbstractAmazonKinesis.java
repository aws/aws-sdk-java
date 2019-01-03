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
import com.amazonaws.*;
import com.amazonaws.services.kinesis.waiters.AmazonKinesisWaiters;

/**
 * Abstract implementation of {@code AmazonKinesis}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKinesis implements AmazonKinesis {

    protected AbstractAmazonKinesis() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddTagsToStreamResult addTagsToStream(AddTagsToStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStreamResult createStream(CreateStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStreamResult createStream(String streamName, Integer shardCount) {
        return createStream(new CreateStreamRequest().withStreamName(streamName).withShardCount(shardCount));
    }

    @Override
    public DecreaseStreamRetentionPeriodResult decreaseStreamRetentionPeriod(DecreaseStreamRetentionPeriodRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteStreamResult deleteStream(DeleteStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteStreamResult deleteStream(String streamName) {
        return deleteStream(new DeleteStreamRequest().withStreamName(streamName));
    }

    @Override
    public DeregisterStreamConsumerResult deregisterStreamConsumer(DeregisterStreamConsumerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLimitsResult describeLimits(DescribeLimitsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStreamResult describeStream(DescribeStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStreamResult describeStream(String streamName) {
        return describeStream(new DescribeStreamRequest().withStreamName(streamName));
    }

    @Override
    public DescribeStreamResult describeStream(String streamName, String exclusiveStartShardId) {
        return describeStream(new DescribeStreamRequest().withStreamName(streamName).withExclusiveStartShardId(exclusiveStartShardId));
    }

    @Override
    public DescribeStreamResult describeStream(String streamName, Integer limit, String exclusiveStartShardId) {
        return describeStream(new DescribeStreamRequest().withStreamName(streamName).withLimit(limit).withExclusiveStartShardId(exclusiveStartShardId));
    }

    @Override
    public DescribeStreamConsumerResult describeStreamConsumer(DescribeStreamConsumerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStreamSummaryResult describeStreamSummary(DescribeStreamSummaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableEnhancedMonitoringResult disableEnhancedMonitoring(DisableEnhancedMonitoringRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableEnhancedMonitoringResult enableEnhancedMonitoring(EnableEnhancedMonitoringRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRecordsResult getRecords(GetRecordsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetShardIteratorResult getShardIterator(String streamName, String shardId, String shardIteratorType) {
        return getShardIterator(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType));
    }

    @Override
    public GetShardIteratorResult getShardIterator(String streamName, String shardId, String shardIteratorType, String startingSequenceNumber) {
        return getShardIterator(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber));
    }

    @Override
    public IncreaseStreamRetentionPeriodResult increaseStreamRetentionPeriod(IncreaseStreamRetentionPeriodRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListShardsResult listShards(ListShardsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStreamConsumersResult listStreamConsumers(ListStreamConsumersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStreamsResult listStreams(ListStreamsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStreamsResult listStreams() {
        return listStreams(new ListStreamsRequest());
    }

    @Override
    public ListStreamsResult listStreams(String exclusiveStartStreamName) {
        return listStreams(new ListStreamsRequest().withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    @Override
    public ListStreamsResult listStreams(Integer limit, String exclusiveStartStreamName) {
        return listStreams(new ListStreamsRequest().withLimit(limit).withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    @Override
    public ListTagsForStreamResult listTagsForStream(ListTagsForStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public MergeShardsResult mergeShards(MergeShardsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public MergeShardsResult mergeShards(String streamName, String shardToMerge, String adjacentShardToMerge) {
        return mergeShards(new MergeShardsRequest().withStreamName(streamName).withShardToMerge(shardToMerge).withAdjacentShardToMerge(adjacentShardToMerge));
    }

    @Override
    public PutRecordResult putRecord(PutRecordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRecordResult putRecord(String streamName, java.nio.ByteBuffer data, String partitionKey) {
        return putRecord(new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey));
    }

    @Override
    public PutRecordResult putRecord(String streamName, java.nio.ByteBuffer data, String partitionKey, String sequenceNumberForOrdering) {
        return putRecord(new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey)
                .withSequenceNumberForOrdering(sequenceNumberForOrdering));
    }

    @Override
    public PutRecordsResult putRecords(PutRecordsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterStreamConsumerResult registerStreamConsumer(RegisterStreamConsumerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromStreamResult removeTagsFromStream(RemoveTagsFromStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SplitShardResult splitShard(SplitShardRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SplitShardResult splitShard(String streamName, String shardToSplit, String newStartingHashKey) {
        return splitShard(new SplitShardRequest().withStreamName(streamName).withShardToSplit(shardToSplit).withNewStartingHashKey(newStartingHashKey));
    }

    @Override
    public StartStreamEncryptionResult startStreamEncryption(StartStreamEncryptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopStreamEncryptionResult stopStreamEncryption(StopStreamEncryptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateShardCountResult updateShardCount(UpdateShardCountRequest request) {
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

    @Override
    public AmazonKinesisWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
