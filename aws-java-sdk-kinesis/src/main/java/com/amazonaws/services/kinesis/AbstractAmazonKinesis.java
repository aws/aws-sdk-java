/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesis;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonKinesis}. Convenient method forms
 * pass through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
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
    public void addTagsToStream(AddTagsToStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void createStream(CreateStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void createStream(String streamName, Integer shardCount) {
        createStream(new CreateStreamRequest().withStreamName(streamName)
                .withShardCount(shardCount));
    }

    @Override
    public void decreaseStreamRetentionPeriod(
            DecreaseStreamRetentionPeriodRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteStream(DeleteStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteStream(String streamName) {
        deleteStream(new DeleteStreamRequest().withStreamName(streamName));
    }

    @Override
    public DescribeStreamResult describeStream(DescribeStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStreamResult describeStream(String streamName) {
        return describeStream(new DescribeStreamRequest()
                .withStreamName(streamName));
    }

    @Override
    public DescribeStreamResult describeStream(String streamName,
            String exclusiveStartShardId) {
        return describeStream(new DescribeStreamRequest().withStreamName(
                streamName).withExclusiveStartShardId(exclusiveStartShardId));
    }

    @Override
    public DescribeStreamResult describeStream(String streamName,
            Integer limit, String exclusiveStartShardId) {
        return describeStream(new DescribeStreamRequest()
                .withStreamName(streamName).withLimit(limit)
                .withExclusiveStartShardId(exclusiveStartShardId));
    }

    @Override
    public GetRecordsResult getRecords(GetRecordsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetShardIteratorResult getShardIterator(
            GetShardIteratorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetShardIteratorResult getShardIterator(String streamName,
            String shardId, String shardIteratorType) {
        return getShardIterator(new GetShardIteratorRequest()
                .withStreamName(streamName).withShardId(shardId)
                .withShardIteratorType(shardIteratorType));
    }

    @Override
    public GetShardIteratorResult getShardIterator(String streamName,
            String shardId, String shardIteratorType,
            String startingSequenceNumber) {
        return getShardIterator(new GetShardIteratorRequest()
                .withStreamName(streamName).withShardId(shardId)
                .withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber));
    }

    @Override
    public void increaseStreamRetentionPeriod(
            IncreaseStreamRetentionPeriodRequest request) {
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
        return listStreams(new ListStreamsRequest()
                .withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    @Override
    public ListStreamsResult listStreams(Integer limit,
            String exclusiveStartStreamName) {
        return listStreams(new ListStreamsRequest().withLimit(limit)
                .withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    @Override
    public ListTagsForStreamResult listTagsForStream(
            ListTagsForStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void mergeShards(MergeShardsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void mergeShards(String streamName, String shardToMerge,
            String adjacentShardToMerge) {
        mergeShards(new MergeShardsRequest().withStreamName(streamName)
                .withShardToMerge(shardToMerge)
                .withAdjacentShardToMerge(adjacentShardToMerge));
    }

    @Override
    public PutRecordResult putRecord(PutRecordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRecordResult putRecord(String streamName,
            java.nio.ByteBuffer data, String partitionKey) {
        return putRecord(new PutRecordRequest().withStreamName(streamName)
                .withData(data).withPartitionKey(partitionKey));
    }

    @Override
    public PutRecordResult putRecord(String streamName,
            java.nio.ByteBuffer data, String partitionKey,
            String sequenceNumberForOrdering) {
        return putRecord(new PutRecordRequest().withStreamName(streamName)
                .withData(data).withPartitionKey(partitionKey)
                .withSequenceNumberForOrdering(sequenceNumberForOrdering));
    }

    @Override
    public PutRecordsResult putRecords(PutRecordsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void removeTagsFromStream(RemoveTagsFromStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void splitShard(SplitShardRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void splitShard(String streamName, String shardToSplit,
            String newStartingHashKey) {
        splitShard(new SplitShardRequest().withStreamName(streamName)
                .withShardToSplit(shardToSplit)
                .withNewStartingHashKey(newStartingHashKey));
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}
