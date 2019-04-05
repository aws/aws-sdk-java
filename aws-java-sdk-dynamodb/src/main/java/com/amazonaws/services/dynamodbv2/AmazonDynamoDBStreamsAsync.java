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
package com.amazonaws.services.dynamodbv2;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;

/**
 * Interface for accessing Amazon DynamoDB Streams asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDBStreamsAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon DynamoDB</fullname>
 * <p>
 * Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about
 * application development with Streams, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html">Capturing Table Activity with
 * DynamoDB Streams</a> in the Amazon DynamoDB Developer Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDynamoDBStreamsAsync extends AmazonDynamoDBStreams {

    /**
     * <p>
     * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN),
     * the composition of its shards, and its corresponding DynamoDB table.
     * </p>
     * <note>
     * <p>
     * You can call <code>DescribeStream</code> at a maximum rate of 10 times per second.
     * </p>
     * </note>
     * <p>
     * Each shard in the stream has a <code>SequenceNumberRange</code> associated with it. If the
     * <code>SequenceNumberRange</code> has a <code>StartingSequenceNumber</code> but no
     * <code>EndingSequenceNumber</code>, then the shard is still open (able to receive more stream records). If both
     * <code>StartingSequenceNumber</code> and <code>EndingSequenceNumber</code> are present, then that shard is closed
     * and can no longer receive more data.
     * </p>
     * 
     * @param describeStreamRequest
     *        Represents the input of a <code>DescribeStream</code> operation.
     * @return A Java Future containing the result of the DescribeStream operation returned by the service.
     * @sample AmazonDynamoDBStreamsAsync.DescribeStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/DescribeStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest describeStreamRequest);

    /**
     * <p>
     * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN),
     * the composition of its shards, and its corresponding DynamoDB table.
     * </p>
     * <note>
     * <p>
     * You can call <code>DescribeStream</code> at a maximum rate of 10 times per second.
     * </p>
     * </note>
     * <p>
     * Each shard in the stream has a <code>SequenceNumberRange</code> associated with it. If the
     * <code>SequenceNumberRange</code> has a <code>StartingSequenceNumber</code> but no
     * <code>EndingSequenceNumber</code>, then the shard is still open (able to receive more stream records). If both
     * <code>StartingSequenceNumber</code> and <code>EndingSequenceNumber</code> are present, then that shard is closed
     * and can no longer receive more data.
     * </p>
     * 
     * @param describeStreamRequest
     *        Represents the input of a <code>DescribeStream</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStream operation returned by the service.
     * @sample AmazonDynamoDBStreamsAsyncHandler.DescribeStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/DescribeStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest describeStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler);

    /**
     * <p>
     * Retrieves the stream records from a given shard.
     * </p>
     * <p>
     * Specify a shard iterator using the <code>ShardIterator</code> parameter. The shard iterator specifies the
     * position in the shard from which you want to start reading stream records sequentially. If there are no stream
     * records available in the portion of the shard that the iterator points to, <code>GetRecords</code> returns an
     * empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.
     * </p>
     * <note>
     * <p>
     * <code>GetRecords</code> can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first.
     * </p>
     * </note>
     * 
     * @param getRecordsRequest
     *        Represents the input of a <code>GetRecords</code> operation.
     * @return A Java Future containing the result of the GetRecords operation returned by the service.
     * @sample AmazonDynamoDBStreamsAsync.GetRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/GetRecords" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest getRecordsRequest);

    /**
     * <p>
     * Retrieves the stream records from a given shard.
     * </p>
     * <p>
     * Specify a shard iterator using the <code>ShardIterator</code> parameter. The shard iterator specifies the
     * position in the shard from which you want to start reading stream records sequentially. If there are no stream
     * records available in the portion of the shard that the iterator points to, <code>GetRecords</code> returns an
     * empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.
     * </p>
     * <note>
     * <p>
     * <code>GetRecords</code> can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first.
     * </p>
     * </note>
     * 
     * @param getRecordsRequest
     *        Represents the input of a <code>GetRecords</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecords operation returned by the service.
     * @sample AmazonDynamoDBStreamsAsyncHandler.GetRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/GetRecords" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest getRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler);

    /**
     * <p>
     * Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from
     * within a shard. Use the shard iterator in a subsequent <code>GetRecords</code> request to read the stream records
     * from the shard.
     * </p>
     * <note>
     * <p>
     * A shard iterator expires 15 minutes after it is returned to the requester.
     * </p>
     * </note>
     * 
     * @param getShardIteratorRequest
     *        Represents the input of a <code>GetShardIterator</code> operation.
     * @return A Java Future containing the result of the GetShardIterator operation returned by the service.
     * @sample AmazonDynamoDBStreamsAsync.GetShardIterator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/GetShardIterator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest getShardIteratorRequest);

    /**
     * <p>
     * Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from
     * within a shard. Use the shard iterator in a subsequent <code>GetRecords</code> request to read the stream records
     * from the shard.
     * </p>
     * <note>
     * <p>
     * A shard iterator expires 15 minutes after it is returned to the requester.
     * </p>
     * </note>
     * 
     * @param getShardIteratorRequest
     *        Represents the input of a <code>GetShardIterator</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetShardIterator operation returned by the service.
     * @sample AmazonDynamoDBStreamsAsyncHandler.GetShardIterator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/GetShardIterator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest getShardIteratorRequest,
            com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler);

    /**
     * <p>
     * Returns an array of stream ARNs associated with the current account and endpoint. If the <code>TableName</code>
     * parameter is present, then <code>ListStreams</code> will return only the streams ARNs for that table.
     * </p>
     * <note>
     * <p>
     * You can call <code>ListStreams</code> at a maximum rate of 5 times per second.
     * </p>
     * </note>
     * 
     * @param listStreamsRequest
     *        Represents the input of a <code>ListStreams</code> operation.
     * @return A Java Future containing the result of the ListStreams operation returned by the service.
     * @sample AmazonDynamoDBStreamsAsync.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/ListStreams" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest);

    /**
     * <p>
     * Returns an array of stream ARNs associated with the current account and endpoint. If the <code>TableName</code>
     * parameter is present, then <code>ListStreams</code> will return only the streams ARNs for that table.
     * </p>
     * <note>
     * <p>
     * You can call <code>ListStreams</code> at a maximum rate of 5 times per second.
     * </p>
     * </note>
     * 
     * @param listStreamsRequest
     *        Represents the input of a <code>ListStreams</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreams operation returned by the service.
     * @sample AmazonDynamoDBStreamsAsyncHandler.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/ListStreams" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler);

}
