/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.kinesis.model.*;

/**
 * Interface for accessing AmazonKinesis asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * Amazon Kinesis Service API Reference <p>
 * Amazon Kinesis is a managed service that scales elastically for real
 * time processing of streaming big data.
 * </p>
 */
public interface AmazonKinesisAsync extends AmazonKinesis {
    /**
     * <p>
     * This operation returns the following information about the stream: the
     * current status of the stream, the stream Amazon Resource Name (ARN),
     * and an array of shard objects that comprise the stream. For each shard
     * object there is information about the hash key and sequence number
     * ranges that the shard spans, and the IDs of any earlier shards that
     * played in a role in a MergeShards or SplitShard operation that created
     * the shard. A sequence number is the identifier associated with every
     * record ingested in the Amazon Kinesis stream. The sequence number is
     * assigned by the Amazon Kinesis service when a record is put into the
     * stream.
     * </p>
     * <p>
     * You can limit the number of returned shards using the
     * <code>Limit</code> parameter. The number of shards in a stream may be
     * too large to return from a single call to <code>DescribeStream</code>
     * .
     * You can detect this by using the
     * <code>HasMoreShards</code> flag in the returned output.
     * <code>HasMoreShards</code> is set to <code>true</code> when there is
     * more data available.
     * </p>
     * <p>
     * If there are more shards available, you can request more shards by
     * using the shard ID of the last shard returned by the
     * <code>DescribeStream</code> request, in the
     * <code>ExclusiveStartShardId</code> parameter in a subsequent request
     * to <code>DescribeStream</code> .
     * 
     * <code>DescribeStream</code> is a paginated
     * operation.
     * </p>
     * <p>
     * <code>DescribeStream</code> has a limit of 10 transactions per second
     * per account.
     * </p>
     *
     * @param describeStreamRequest Container for the necessary parameters to
     *           execute the DescribeStream operation on AmazonKinesis.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStream service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest describeStreamRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the following information about the stream: the
     * current status of the stream, the stream Amazon Resource Name (ARN),
     * and an array of shard objects that comprise the stream. For each shard
     * object there is information about the hash key and sequence number
     * ranges that the shard spans, and the IDs of any earlier shards that
     * played in a role in a MergeShards or SplitShard operation that created
     * the shard. A sequence number is the identifier associated with every
     * record ingested in the Amazon Kinesis stream. The sequence number is
     * assigned by the Amazon Kinesis service when a record is put into the
     * stream.
     * </p>
     * <p>
     * You can limit the number of returned shards using the
     * <code>Limit</code> parameter. The number of shards in a stream may be
     * too large to return from a single call to <code>DescribeStream</code>
     * .
     * You can detect this by using the
     * <code>HasMoreShards</code> flag in the returned output.
     * <code>HasMoreShards</code> is set to <code>true</code> when there is
     * more data available.
     * </p>
     * <p>
     * If there are more shards available, you can request more shards by
     * using the shard ID of the last shard returned by the
     * <code>DescribeStream</code> request, in the
     * <code>ExclusiveStartShardId</code> parameter in a subsequent request
     * to <code>DescribeStream</code> .
     * 
     * <code>DescribeStream</code> is a paginated
     * operation.
     * </p>
     * <p>
     * <code>DescribeStream</code> has a limit of 10 transactions per second
     * per account.
     * </p>
     *
     * @param describeStreamRequest Container for the necessary parameters to
     *           execute the DescribeStream operation on AmazonKinesis.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStream service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest describeStreamRequest,
            AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns a shard iterator in <code>ShardIterator</code>
     * . The shard iterator specifies the position in the shard from which
     * you want to start reading data records sequentially. A shard iterator
     * specifies this position using the sequence number of a data record in
     * a shard. A sequence number is the identifier associated with every
     * record ingested in the Amazon Kinesis stream. The sequence number is
     * assigned by the Amazon Kinesis service when a record is put into the
     * stream.
     * </p>
     * <p>
     * You must specify the shard iterator type in the
     * <code>GetShardIterator</code> request. For example, you can set the
     * <code>ShardIteratorType</code> parameter to read exactly from the
     * position denoted by a specific sequence number by using the
     * AT_SEQUENCE_NUMBER shard iterator type, or right after the sequence
     * number by using the AFTER_SEQUENCE_NUMBER shard iterator type, using
     * sequence numbers returned by earlier PutRecord, GetRecords or
     * DescribeStream requests. You can specify the shard iterator type
     * TRIM_HORIZON in the request to cause <code>ShardIterator</code> to
     * point to the last untrimmed record in the shard in the system, which
     * is the oldest data record in the shard. Or you can point to just after
     * the most recent record in the shard, by using the shard iterator type
     * LATEST, so that you always read the most recent data in the shard.
     * </p>
     * <p>
     * <b>Note:</b> Each shard iterator expires five minutes after it is
     * returned to the requester.
     * </p>
     * <p>
     * When you repeatedly read from an Amazon Kinesis stream use a
     * GetShardIterator request to get the first shard iterator to to use in
     * your first <code>GetRecords</code> request and then use the shard
     * iterator returned by the <code>GetRecords</code> request in
     * <code>NextShardIterator</code> for subsequent reads. A new shard
     * iterator is returned by every <code>GetRecords</code> request in
     * <code>NextShardIterator</code> ,
     * which you use in the <code>ShardIterator</code> parameter
     * of the next <code>GetRecords</code> request.
     * </p>
     * <p>
     * If a <code>GetShardIterator</code> request is made too often, you will
     * receive a <code>ProvisionedThroughputExceededException</code> .
     * For more information about throughput limits, see the
     * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
     * .
     * </p>
     * <p>
     * <code>GetShardIterator</code> can return <code>null</code> for its
     * <code>ShardIterator</code> to indicate that the shard has been closed
     * and that the requested iterator will return no more data. A shard can
     * be closed by a SplitShard or MergeShards operation.
     * </p>
     * <p>
     * <code>GetShardIterator</code> has a limit of 5 transactions per
     * second per account per open shard.
     * </p>
     *
     * @param getShardIteratorRequest Container for the necessary parameters
     *           to execute the GetShardIterator operation on AmazonKinesis.
     * 
     * @return A Java Future object containing the response from the
     *         GetShardIterator service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest getShardIteratorRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns a shard iterator in <code>ShardIterator</code>
     * . The shard iterator specifies the position in the shard from which
     * you want to start reading data records sequentially. A shard iterator
     * specifies this position using the sequence number of a data record in
     * a shard. A sequence number is the identifier associated with every
     * record ingested in the Amazon Kinesis stream. The sequence number is
     * assigned by the Amazon Kinesis service when a record is put into the
     * stream.
     * </p>
     * <p>
     * You must specify the shard iterator type in the
     * <code>GetShardIterator</code> request. For example, you can set the
     * <code>ShardIteratorType</code> parameter to read exactly from the
     * position denoted by a specific sequence number by using the
     * AT_SEQUENCE_NUMBER shard iterator type, or right after the sequence
     * number by using the AFTER_SEQUENCE_NUMBER shard iterator type, using
     * sequence numbers returned by earlier PutRecord, GetRecords or
     * DescribeStream requests. You can specify the shard iterator type
     * TRIM_HORIZON in the request to cause <code>ShardIterator</code> to
     * point to the last untrimmed record in the shard in the system, which
     * is the oldest data record in the shard. Or you can point to just after
     * the most recent record in the shard, by using the shard iterator type
     * LATEST, so that you always read the most recent data in the shard.
     * </p>
     * <p>
     * <b>Note:</b> Each shard iterator expires five minutes after it is
     * returned to the requester.
     * </p>
     * <p>
     * When you repeatedly read from an Amazon Kinesis stream use a
     * GetShardIterator request to get the first shard iterator to to use in
     * your first <code>GetRecords</code> request and then use the shard
     * iterator returned by the <code>GetRecords</code> request in
     * <code>NextShardIterator</code> for subsequent reads. A new shard
     * iterator is returned by every <code>GetRecords</code> request in
     * <code>NextShardIterator</code> ,
     * which you use in the <code>ShardIterator</code> parameter
     * of the next <code>GetRecords</code> request.
     * </p>
     * <p>
     * If a <code>GetShardIterator</code> request is made too often, you will
     * receive a <code>ProvisionedThroughputExceededException</code> .
     * For more information about throughput limits, see the
     * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
     * .
     * </p>
     * <p>
     * <code>GetShardIterator</code> can return <code>null</code> for its
     * <code>ShardIterator</code> to indicate that the shard has been closed
     * and that the requested iterator will return no more data. A shard can
     * be closed by a SplitShard or MergeShards operation.
     * </p>
     * <p>
     * <code>GetShardIterator</code> has a limit of 5 transactions per
     * second per account per open shard.
     * </p>
     *
     * @param getShardIteratorRequest Container for the necessary parameters
     *           to execute the GetShardIterator operation on AmazonKinesis.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetShardIterator service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest getShardIteratorRequest,
            AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation puts a data record into an Amazon Kinesis stream from a
     * producer. This operation must be called to send data from the producer
     * into the Amazon Kinesis stream for real-time ingestion and subsequent
     * processing. The <code>PutRecord</code> operation requires the name of
     * the stream that captures, stores, and transports the data; a partition
     * key; and the data blob itself. The data blob could be a segment from a
     * log file, geographic/location data, website clickstream data, or any
     * other data type.
     * </p>
     * <p>
     * The partition key is used to distribute data across shards. Amazon
     * Kinesis segregates the data records that belong to a data stream into
     * multiple shards, using the partition key associated with each data
     * record to determine which shard a given data record belongs to.
     * </p>
     * <p>
     * Partition keys are Unicode strings, with a maximum length limit of 256
     * bytes. An MD5 hash function is used to map partition keys to 128-bit
     * integer values and to map associated data records to shards using the
     * hash key ranges of the shards. You can override hashing the partition
     * key to determine the shard by explicitly specifying a hash value using
     * the <code>ExplicitHashKey</code> parameter. For more information, see
     * the
     * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
     * .
     * </p>
     * <p>
     * <code>PutRecord</code> returns the shard ID of where the data record
     * was placed and the sequence number that was assigned to the data
     * record.
     * </p>
     * <p>
     * Sequence numbers generally increase over time. To guarantee strictly
     * increasing ordering, use the <code>SequenceNumberForOrdering</code>
     * parameter. For more information, see the
     * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
     * .
     * </p>
     * <p>
     * If a <code>PutRecord</code> request cannot be processed because of
     * insufficient provisioned throughput on the shard involved in the
     * request, <code>PutRecord</code> throws
     * <code>ProvisionedThroughputExceededException</code> .
     * </p>
     * <p>
     * Data records are accessible for only 24 hours from the time that they
     * are added to an Amazon Kinesis stream.
     * </p>
     *
     * @param putRecordRequest Container for the necessary parameters to
     *           execute the PutRecord operation on AmazonKinesis.
     * 
     * @return A Java Future object containing the response from the
     *         PutRecord service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutRecordResult> putRecordAsync(PutRecordRequest putRecordRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation puts a data record into an Amazon Kinesis stream from a
     * producer. This operation must be called to send data from the producer
     * into the Amazon Kinesis stream for real-time ingestion and subsequent
     * processing. The <code>PutRecord</code> operation requires the name of
     * the stream that captures, stores, and transports the data; a partition
     * key; and the data blob itself. The data blob could be a segment from a
     * log file, geographic/location data, website clickstream data, or any
     * other data type.
     * </p>
     * <p>
     * The partition key is used to distribute data across shards. Amazon
     * Kinesis segregates the data records that belong to a data stream into
     * multiple shards, using the partition key associated with each data
     * record to determine which shard a given data record belongs to.
     * </p>
     * <p>
     * Partition keys are Unicode strings, with a maximum length limit of 256
     * bytes. An MD5 hash function is used to map partition keys to 128-bit
     * integer values and to map associated data records to shards using the
     * hash key ranges of the shards. You can override hashing the partition
     * key to determine the shard by explicitly specifying a hash value using
     * the <code>ExplicitHashKey</code> parameter. For more information, see
     * the
     * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
     * .
     * </p>
     * <p>
     * <code>PutRecord</code> returns the shard ID of where the data record
     * was placed and the sequence number that was assigned to the data
     * record.
     * </p>
     * <p>
     * Sequence numbers generally increase over time. To guarantee strictly
     * increasing ordering, use the <code>SequenceNumberForOrdering</code>
     * parameter. For more information, see the
     * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
     * .
     * </p>
     * <p>
     * If a <code>PutRecord</code> request cannot be processed because of
     * insufficient provisioned throughput on the shard involved in the
     * request, <code>PutRecord</code> throws
     * <code>ProvisionedThroughputExceededException</code> .
     * </p>
     * <p>
     * Data records are accessible for only 24 hours from the time that they
     * are added to an Amazon Kinesis stream.
     * </p>
     *
     * @param putRecordRequest Container for the necessary parameters to
     *           execute the PutRecord operation on AmazonKinesis.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutRecord service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutRecordResult> putRecordAsync(PutRecordRequest putRecordRequest,
            AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns one or more data records from a shard. A
     * <code>GetRecords</code> operation request can retrieve up to 10 MB of
     * data.
     * </p>
     * <p>
     * You specify a shard iterator for the shard that you want to read data
     * from in the <code>ShardIterator</code> parameter. The shard iterator
     * specifies the position in the shard from which you want to start
     * reading data records sequentially. A shard iterator specifies this
     * position using the sequence number of a data record in the shard. For
     * more information about the shard iterator, see GetShardIterator.
     * </p>
     * <p>
     * <code>GetRecords</code> may return a partial result if the response
     * size limit is exceeded. You will get an error, but not a partial
     * result if the shard's provisioned throughput is exceeded, the shard
     * iterator has expired, or an internal processing failure has occurred.
     * Clients can request a smaller amount of data by specifying a maximum
     * number of returned records using the <code>Limit</code> parameter. The
     * <code>Limit</code> parameter can be set to an integer value of up to
     * 10,000. If you set the value to an integer greater than 10,000, you
     * will receive <code>InvalidArgumentException</code> .
     * </p>
     * <p>
     * A new shard iterator is returned by every <code>GetRecords</code>
     * request in <code>NextShardIterator</code> ,
     * which you use in the <code>ShardIterator</code> parameter
     * of the next <code>GetRecords</code> request. When you repeatedly read
     * from an Amazon Kinesis stream use a GetShardIterator request to get
     * the first shard iterator to use in your first <code>GetRecords</code>
     * request and then use the shard iterator returned in
     * <code>NextShardIterator</code> for subsequent reads.
     * </p>
     * <p>
     * <code>GetRecords</code> can return <code>null</code> for the
     * <code>NextShardIterator</code> to reflect that the shard has been
     * closed and that the requested shard iterator would never have returned
     * more data.
     * </p>
     * <p>
     * If no items can be processed because of insufficient provisioned
     * throughput on the shard involved in the request,
     * <code>GetRecords</code> throws
     * <code>ProvisionedThroughputExceededException</code> .
     * </p>
     *
     * @param getRecordsRequest Container for the necessary parameters to
     *           execute the GetRecords operation on AmazonKinesis.
     * 
     * @return A Java Future object containing the response from the
     *         GetRecords service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest getRecordsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns one or more data records from a shard. A
     * <code>GetRecords</code> operation request can retrieve up to 10 MB of
     * data.
     * </p>
     * <p>
     * You specify a shard iterator for the shard that you want to read data
     * from in the <code>ShardIterator</code> parameter. The shard iterator
     * specifies the position in the shard from which you want to start
     * reading data records sequentially. A shard iterator specifies this
     * position using the sequence number of a data record in the shard. For
     * more information about the shard iterator, see GetShardIterator.
     * </p>
     * <p>
     * <code>GetRecords</code> may return a partial result if the response
     * size limit is exceeded. You will get an error, but not a partial
     * result if the shard's provisioned throughput is exceeded, the shard
     * iterator has expired, or an internal processing failure has occurred.
     * Clients can request a smaller amount of data by specifying a maximum
     * number of returned records using the <code>Limit</code> parameter. The
     * <code>Limit</code> parameter can be set to an integer value of up to
     * 10,000. If you set the value to an integer greater than 10,000, you
     * will receive <code>InvalidArgumentException</code> .
     * </p>
     * <p>
     * A new shard iterator is returned by every <code>GetRecords</code>
     * request in <code>NextShardIterator</code> ,
     * which you use in the <code>ShardIterator</code> parameter
     * of the next <code>GetRecords</code> request. When you repeatedly read
     * from an Amazon Kinesis stream use a GetShardIterator request to get
     * the first shard iterator to use in your first <code>GetRecords</code>
     * request and then use the shard iterator returned in
     * <code>NextShardIterator</code> for subsequent reads.
     * </p>
     * <p>
     * <code>GetRecords</code> can return <code>null</code> for the
     * <code>NextShardIterator</code> to reflect that the shard has been
     * closed and that the requested shard iterator would never have returned
     * more data.
     * </p>
     * <p>
     * If no items can be processed because of insufficient provisioned
     * throughput on the shard involved in the request,
     * <code>GetRecords</code> throws
     * <code>ProvisionedThroughputExceededException</code> .
     * </p>
     *
     * @param getRecordsRequest Container for the necessary parameters to
     *           execute the GetRecords operation on AmazonKinesis.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetRecords service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest getRecordsRequest,
            AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation splits a shard into two new shards in the stream, to
     * increase the stream's capacity to ingest and transport data.
     * <code>SplitShard</code> is called when there is a need to increase the
     * overall capacity of stream because of an expected increase in the
     * volume of data records being ingested.
     * </p>
     * <p>
     * <code>SplitShard</code> can also be used when a given shard appears
     * to be approaching its maximum utilization, for example, when the set
     * of producers sending data into the specific shard are suddenly sending
     * more than previously anticipated. You can also call the
     * <code>SplitShard</code> operation to increase stream capacity, so that
     * more Amazon Kinesis applications can simultaneously read data from the
     * stream for real-time processing.
     * </p>
     * <p>
     * The <code>SplitShard</code> operation requires that you specify the
     * shard to be split and the new hash key, which is the position in the
     * shard where the shard gets split in two. In many cases, the new hash
     * key might simply be the average of the beginning and ending hash key,
     * but it can be any hash key value in the range being mapped into the
     * shard. For more information about splitting shards, see the
     * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
     * .
     * </p>
     * <p>
     * You can use the DescribeStream operation to determine the shard ID and
     * hash key values for the <code>ShardToSplit</code> and
     * <code>NewStartingHashKey</code> parameters that are specified in the
     * <code>SplitShard</code> request.
     * </p>
     * <p>
     * <code>SplitShard</code> is an asynchronous operation. Upon receiving
     * a <code>SplitShard</code> request, Amazon Kinesis immediately returns
     * a response and sets the stream status to UPDATING. After the operation
     * is completed, Amazon Kinesis sets the stream status to ACTIVE. Read
     * and write operations continue to work while the stream is in the
     * UPDATING state.
     * </p>
     * <p>
     * You can use <code>DescribeStream</code> to check the status of the
     * stream, which is returned in <code>StreamStatus</code> .
     * If the stream is in the ACTIVE state, you can call
     * <code>SplitShard</code> .
     * If a stream is in CREATING or UPDATING or DELETING
     * states, then Amazon Kinesis returns a
     * <code>ResourceInUseException</code> .
     * </p>
     * <p>
     * If the specified stream does not exist, Amazon Kinesis returns a
     * <code>ResourceNotFoundException</code> .
     * If you try to create more shards than are authorized
     * for your account, you receive a <code>LimitExceededException</code> .
     * </p>
     * <p>
     * <b>Note:</b> The default limit for an AWS account is 10 shards per
     * stream. If you need to create a stream with more than 10 shards,
     * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> contact AWS Support </a>
     * to increase the limit on your account.
     * </p>
     * <p>
     * If you try to operate on too many streams in parallel using
     * CreateStream, DeleteStream, MergeShards or SplitShard, you will
     * receive a <code>LimitExceededException</code> .
     * </p>
     * <p>
     * <code>SplitShard</code> has limit of 5 transactions per second per
     * account.
     * </p>
     *
     * @param splitShardRequest Container for the necessary parameters to
     *           execute the SplitShard operation on AmazonKinesis.
     * 
     * @return A Java Future object containing the response from the
     *         SplitShard service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> splitShardAsync(SplitShardRequest splitShardRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation splits a shard into two new shards in the stream, to
     * increase the stream's capacity to ingest and transport data.
     * <code>SplitShard</code> is called when there is a need to increase the
     * overall capacity of stream because of an expected increase in the
     * volume of data records being ingested.
     * </p>
     * <p>
     * <code>SplitShard</code> can also be used when a given shard appears
     * to be approaching its maximum utilization, for example, when the set
     * of producers sending data into the specific shard are suddenly sending
     * more than previously anticipated. You can also call the
     * <code>SplitShard</code> operation to increase stream capacity, so that
     * more Amazon Kinesis applications can simultaneously read data from the
     * stream for real-time processing.
     * </p>
     * <p>
     * The <code>SplitShard</code> operation requires that you specify the
     * shard to be split and the new hash key, which is the position in the
     * shard where the shard gets split in two. In many cases, the new hash
     * key might simply be the average of the beginning and ending hash key,
     * but it can be any hash key value in the range being mapped into the
     * shard. For more information about splitting shards, see the
     * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
     * .
     * </p>
     * <p>
     * You can use the DescribeStream operation to determine the shard ID and
     * hash key values for the <code>ShardToSplit</code> and
     * <code>NewStartingHashKey</code> parameters that are specified in the
     * <code>SplitShard</code> request.
     * </p>
     * <p>
     * <code>SplitShard</code> is an asynchronous operation. Upon receiving
     * a <code>SplitShard</code> request, Amazon Kinesis immediately returns
     * a response and sets the stream status to UPDATING. After the operation
     * is completed, Amazon Kinesis sets the stream status to ACTIVE. Read
     * and write operations continue to work while the stream is in the
     * UPDATING state.
     * </p>
     * <p>
     * You can use <code>DescribeStream</code> to check the status of the
     * stream, which is returned in <code>StreamStatus</code> .
     * If the stream is in the ACTIVE state, you can call
     * <code>SplitShard</code> .
     * If a stream is in CREATING or UPDATING or DELETING
     * states, then Amazon Kinesis returns a
     * <code>ResourceInUseException</code> .
     * </p>
     * <p>
     * If the specified stream does not exist, Amazon Kinesis returns a
     * <code>ResourceNotFoundException</code> .
     * If you try to create more shards than are authorized
     * for your account, you receive a <code>LimitExceededException</code> .
     * </p>
     * <p>
     * <b>Note:</b> The default limit for an AWS account is 10 shards per
     * stream. If you need to create a stream with more than 10 shards,
     * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> contact AWS Support </a>
     * to increase the limit on your account.
     * </p>
     * <p>
     * If you try to operate on too many streams in parallel using
     * CreateStream, DeleteStream, MergeShards or SplitShard, you will
     * receive a <code>LimitExceededException</code> .
     * </p>
     * <p>
     * <code>SplitShard</code> has limit of 5 transactions per second per
     * account.
     * </p>
     *
     * @param splitShardRequest Container for the necessary parameters to
     *           execute the SplitShard operation on AmazonKinesis.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SplitShard service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> splitShardAsync(SplitShardRequest splitShardRequest,
            AsyncHandler<SplitShardRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation adds a new Amazon Kinesis stream to your AWS account. A
     * stream captures and transports data records that are continuously
     * emitted from different data sources or <i>producers</i> .
     * Scale-out within an Amazon Kinesis stream is explicitly
     * supported by means of shards, which are uniquely identified groups of
     * data records in an Amazon Kinesis stream.
     * </p>
     * <p>
     * You specify and control the number of shards that a stream is composed
     * of. Each open shard can support up to 5 read transactions per second,
     * up to a maximum total of 2 MB of data read per second. Each shard can
     * support up to 1000 write transactions per second, up to a maximum
     * total of 1 MB data written per second. You can add shards to a stream
     * if the amount of data input increases and you can remove shards if the
     * amount of data input decreases.
     * </p>
     * <p>
     * The stream name identifies the stream. The name is scoped to the AWS
     * account used by the application. It is also scoped by region. That is,
     * two streams in two different accounts can have the same name, and two
     * streams in the same account, but in two different regions, can have
     * the same name.
     * </p>
     * <p>
     * <code>CreateStream</code> is an asynchronous operation. Upon
     * receiving a <code>CreateStream</code> request, Amazon Kinesis
     * immediately returns and sets the stream status to CREATING. After the
     * stream is created, Amazon Kinesis sets the stream status to ACTIVE.
     * You should perform read and write operations only on an ACTIVE stream.
     * </p>
     * <p>
     * You receive a <code>LimitExceededException</code> when making a
     * <code>CreateStream</code> request if you try to do one of the
     * following:
     * </p>
     * 
     * <ul>
     * <li>Have more than five streams in the CREATING state at any point in
     * time.</li>
     * <li>Create more shards than are authorized for your account.</li>
     * 
     * </ul>
     * <p>
     * <b>Note:</b> The default limit for an AWS account is 10 shards per
     * stream. If you need to create a stream with more than 10 shards,
     * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> contact AWS Support </a>
     * to increase the limit on your account.
     * </p>
     * <p>
     * You can use the <code>DescribeStream</code> operation to check the
     * stream status, which is returned in <code>StreamStatus</code> .
     * </p>
     * <p>
     * <code>CreateStream</code> has a limit of 5 transactions per second
     * per account.
     * </p>
     *
     * @param createStreamRequest Container for the necessary parameters to
     *           execute the CreateStream operation on AmazonKinesis.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStream service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createStreamAsync(CreateStreamRequest createStreamRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation adds a new Amazon Kinesis stream to your AWS account. A
     * stream captures and transports data records that are continuously
     * emitted from different data sources or <i>producers</i> .
     * Scale-out within an Amazon Kinesis stream is explicitly
     * supported by means of shards, which are uniquely identified groups of
     * data records in an Amazon Kinesis stream.
     * </p>
     * <p>
     * You specify and control the number of shards that a stream is composed
     * of. Each open shard can support up to 5 read transactions per second,
     * up to a maximum total of 2 MB of data read per second. Each shard can
     * support up to 1000 write transactions per second, up to a maximum
     * total of 1 MB data written per second. You can add shards to a stream
     * if the amount of data input increases and you can remove shards if the
     * amount of data input decreases.
     * </p>
     * <p>
     * The stream name identifies the stream. The name is scoped to the AWS
     * account used by the application. It is also scoped by region. That is,
     * two streams in two different accounts can have the same name, and two
     * streams in the same account, but in two different regions, can have
     * the same name.
     * </p>
     * <p>
     * <code>CreateStream</code> is an asynchronous operation. Upon
     * receiving a <code>CreateStream</code> request, Amazon Kinesis
     * immediately returns and sets the stream status to CREATING. After the
     * stream is created, Amazon Kinesis sets the stream status to ACTIVE.
     * You should perform read and write operations only on an ACTIVE stream.
     * </p>
     * <p>
     * You receive a <code>LimitExceededException</code> when making a
     * <code>CreateStream</code> request if you try to do one of the
     * following:
     * </p>
     * 
     * <ul>
     * <li>Have more than five streams in the CREATING state at any point in
     * time.</li>
     * <li>Create more shards than are authorized for your account.</li>
     * 
     * </ul>
     * <p>
     * <b>Note:</b> The default limit for an AWS account is 10 shards per
     * stream. If you need to create a stream with more than 10 shards,
     * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> contact AWS Support </a>
     * to increase the limit on your account.
     * </p>
     * <p>
     * You can use the <code>DescribeStream</code> operation to check the
     * stream status, which is returned in <code>StreamStatus</code> .
     * </p>
     * <p>
     * <code>CreateStream</code> has a limit of 5 transactions per second
     * per account.
     * </p>
     *
     * @param createStreamRequest Container for the necessary parameters to
     *           execute the CreateStream operation on AmazonKinesis.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStream service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createStreamAsync(CreateStreamRequest createStreamRequest,
            AsyncHandler<CreateStreamRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation deletes a stream and all of its shards and data. You
     * must shut down any applications that are operating on the stream
     * before you delete the stream. If an application attempts to operate on
     * a deleted stream, it will receive the exception
     * <code>ResourceNotFoundException</code> .
     * </p>
     * <p>
     * If the stream is in the ACTIVE state, you can delete it. After a
     * <code>DeleteStream</code> request, the specified stream is in the
     * DELETING state until Amazon Kinesis completes the deletion.
     * </p>
     * <p>
     * <b>Note:</b> Amazon Kinesis might continue to accept data read and
     * write operations, such as PutRecord and GetRecords, on a stream in the
     * DELETING state until the stream deletion is complete.
     * </p>
     * <p>
     * When you delete a stream, any shards in that stream are also deleted.
     * </p>
     * <p>
     * You can use the DescribeStream operation to check the state of the
     * stream, which is returned in <code>StreamStatus</code> .
     * </p>
     * <p>
     * <code>DeleteStream</code> has a limit of 5 transactions per second
     * per account.
     * </p>
     *
     * @param deleteStreamRequest Container for the necessary parameters to
     *           execute the DeleteStream operation on AmazonKinesis.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStream service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStreamAsync(DeleteStreamRequest deleteStreamRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation deletes a stream and all of its shards and data. You
     * must shut down any applications that are operating on the stream
     * before you delete the stream. If an application attempts to operate on
     * a deleted stream, it will receive the exception
     * <code>ResourceNotFoundException</code> .
     * </p>
     * <p>
     * If the stream is in the ACTIVE state, you can delete it. After a
     * <code>DeleteStream</code> request, the specified stream is in the
     * DELETING state until Amazon Kinesis completes the deletion.
     * </p>
     * <p>
     * <b>Note:</b> Amazon Kinesis might continue to accept data read and
     * write operations, such as PutRecord and GetRecords, on a stream in the
     * DELETING state until the stream deletion is complete.
     * </p>
     * <p>
     * When you delete a stream, any shards in that stream are also deleted.
     * </p>
     * <p>
     * You can use the DescribeStream operation to check the state of the
     * stream, which is returned in <code>StreamStatus</code> .
     * </p>
     * <p>
     * <code>DeleteStream</code> has a limit of 5 transactions per second
     * per account.
     * </p>
     *
     * @param deleteStreamRequest Container for the necessary parameters to
     *           execute the DeleteStream operation on AmazonKinesis.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStream service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStreamAsync(DeleteStreamRequest deleteStreamRequest,
            AsyncHandler<DeleteStreamRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns an array of the names of all the streams that
     * are associated with the AWS account making the
     * <code>ListStreams</code> request. A given AWS account can have many
     * streams active at one time.
     * </p>
     * <p>
     * The number of streams may be too large to return from a single call
     * to <code>ListStreams</code> .
     * You can limit the number of returned streams using the
     * <code>Limit</code> parameter. If you do not specify a value for the
     * <code>Limit</code> parameter, Amazon Kinesis uses the default limit,
     * which is currently 10.
     * </p>
     * <p>
     * You can detect if there are more streams available to list by using
     * the <code>HasMoreStreams</code> flag from the returned output. If
     * there are more streams available, you can request more streams by
     * using the name of the last stream returned by the
     * <code>ListStreams</code> request in the
     * <code>ExclusiveStartStreamName</code> parameter in a subsequent
     * request to <code>ListStreams</code> .
     * The group of stream names returned by the subsequent
     * request is then added to the list. You can continue this process until
     * all the stream names have been collected in the list.
     * </p>
     * <p>
     * <code>ListStreams</code> has a limit of 5 transactions per second per
     * account.
     * </p>
     *
     * @param listStreamsRequest Container for the necessary parameters to
     *           execute the ListStreams operation on AmazonKinesis.
     * 
     * @return A Java Future object containing the response from the
     *         ListStreams service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns an array of the names of all the streams that
     * are associated with the AWS account making the
     * <code>ListStreams</code> request. A given AWS account can have many
     * streams active at one time.
     * </p>
     * <p>
     * The number of streams may be too large to return from a single call
     * to <code>ListStreams</code> .
     * You can limit the number of returned streams using the
     * <code>Limit</code> parameter. If you do not specify a value for the
     * <code>Limit</code> parameter, Amazon Kinesis uses the default limit,
     * which is currently 10.
     * </p>
     * <p>
     * You can detect if there are more streams available to list by using
     * the <code>HasMoreStreams</code> flag from the returned output. If
     * there are more streams available, you can request more streams by
     * using the name of the last stream returned by the
     * <code>ListStreams</code> request in the
     * <code>ExclusiveStartStreamName</code> parameter in a subsequent
     * request to <code>ListStreams</code> .
     * The group of stream names returned by the subsequent
     * request is then added to the list. You can continue this process until
     * all the stream names have been collected in the list.
     * </p>
     * <p>
     * <code>ListStreams</code> has a limit of 5 transactions per second per
     * account.
     * </p>
     *
     * @param listStreamsRequest Container for the necessary parameters to
     *           execute the ListStreams operation on AmazonKinesis.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListStreams service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest,
            AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation merges two adjacent shards in a stream and combines
     * them into a single shard to reduce the stream's capacity to ingest and
     * transport data. Two shards are considered adjacent if the union of the
     * hash key ranges for the two shards form a contiguous set with no gaps.
     * For example, if you have two shards, one with a hash key range of
     * 276...381 and the other with a hash key range of 382...454, then you
     * could merge these two shards into a single shard that would have a
     * hash key range of 276...454. After the merge, the single child shard
     * receives data for all hash key values covered by the two parent
     * shards.
     * </p>
     * <p>
     * <code>MergeShards</code> is called when there is a need to reduce the
     * overall capacity of a stream because of excess capacity that is not
     * being used. The operation requires that you specify the shard to be
     * merged and the adjacent shard for a given stream. For more information
     * about merging shards, see the
     * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
     * .
     * </p>
     * <p>
     * If the stream is in the ACTIVE state, you can call
     * <code>MergeShards</code> . If a stream is in CREATING or UPDATING or
     * DELETING states, then Amazon Kinesis returns a
     * <code>ResourceInUseException</code> .
     * If the specified stream does not exist, Amazon Kinesis
     * returns a <code>ResourceNotFoundException</code> .
     * </p>
     * <p>
     * You can use the DescribeStream operation to check the state of the
     * stream, which is returned in <code>StreamStatus</code> .
     * </p>
     * <p>
     * <code>MergeShards</code> is an asynchronous operation. Upon receiving
     * a <code>MergeShards</code> request, Amazon Kinesis immediately returns
     * a response and sets the <code>StreamStatus</code> to UPDATING. After
     * the operation is completed, Amazon Kinesis sets the
     * <code>StreamStatus</code> to ACTIVE. Read and write operations
     * continue to work while the stream is in the UPDATING state.
     * </p>
     * <p>
     * You use the DescribeStream operation to determine the shard IDs that
     * are specified in the <code>MergeShards</code> request.
     * </p>
     * <p>
     * If you try to operate on too many streams in parallel using
     * CreateStream, DeleteStream, <code>MergeShards</code> or SplitShard,
     * you will receive a <code>LimitExceededException</code> .
     * </p>
     * <p>
     * <code>MergeShards</code> has limit of 5 transactions per second per
     * account.
     * </p>
     *
     * @param mergeShardsRequest Container for the necessary parameters to
     *           execute the MergeShards operation on AmazonKinesis.
     * 
     * @return A Java Future object containing the response from the
     *         MergeShards service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> mergeShardsAsync(MergeShardsRequest mergeShardsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation merges two adjacent shards in a stream and combines
     * them into a single shard to reduce the stream's capacity to ingest and
     * transport data. Two shards are considered adjacent if the union of the
     * hash key ranges for the two shards form a contiguous set with no gaps.
     * For example, if you have two shards, one with a hash key range of
     * 276...381 and the other with a hash key range of 382...454, then you
     * could merge these two shards into a single shard that would have a
     * hash key range of 276...454. After the merge, the single child shard
     * receives data for all hash key values covered by the two parent
     * shards.
     * </p>
     * <p>
     * <code>MergeShards</code> is called when there is a need to reduce the
     * overall capacity of a stream because of excess capacity that is not
     * being used. The operation requires that you specify the shard to be
     * merged and the adjacent shard for a given stream. For more information
     * about merging shards, see the
     * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
     * .
     * </p>
     * <p>
     * If the stream is in the ACTIVE state, you can call
     * <code>MergeShards</code> . If a stream is in CREATING or UPDATING or
     * DELETING states, then Amazon Kinesis returns a
     * <code>ResourceInUseException</code> .
     * If the specified stream does not exist, Amazon Kinesis
     * returns a <code>ResourceNotFoundException</code> .
     * </p>
     * <p>
     * You can use the DescribeStream operation to check the state of the
     * stream, which is returned in <code>StreamStatus</code> .
     * </p>
     * <p>
     * <code>MergeShards</code> is an asynchronous operation. Upon receiving
     * a <code>MergeShards</code> request, Amazon Kinesis immediately returns
     * a response and sets the <code>StreamStatus</code> to UPDATING. After
     * the operation is completed, Amazon Kinesis sets the
     * <code>StreamStatus</code> to ACTIVE. Read and write operations
     * continue to work while the stream is in the UPDATING state.
     * </p>
     * <p>
     * You use the DescribeStream operation to determine the shard IDs that
     * are specified in the <code>MergeShards</code> request.
     * </p>
     * <p>
     * If you try to operate on too many streams in parallel using
     * CreateStream, DeleteStream, <code>MergeShards</code> or SplitShard,
     * you will receive a <code>LimitExceededException</code> .
     * </p>
     * <p>
     * <code>MergeShards</code> has limit of 5 transactions per second per
     * account.
     * </p>
     *
     * @param mergeShardsRequest Container for the necessary parameters to
     *           execute the MergeShards operation on AmazonKinesis.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         MergeShards service method, as returned by AmazonKinesis.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonKinesis indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> mergeShardsAsync(MergeShardsRequest mergeShardsRequest,
            AsyncHandler<MergeShardsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        