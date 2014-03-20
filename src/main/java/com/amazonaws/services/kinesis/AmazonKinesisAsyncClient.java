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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.kinesis.model.*;

/**
 * Asynchronous client for accessing AmazonKinesis.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon Kinesis Service API Reference <p>
 * Amazon Kinesis is a managed service that scales elastically for real
 * time processing of streaming big data.
 * </p>
 */
public class AmazonKinesisAsyncClient extends AmazonKinesisClient
        implements AmazonKinesisAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonKinesis.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonKinesisAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonKinesis.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonKinesis
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonKinesisAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonKinesis using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonKinesisAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonKinesis using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonKinesisAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonKinesis using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonKinesisAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonKinesis using the specified AWS account credentials provider.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonKinesisAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonKinesis using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonKinesisAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonKinesis using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AmazonKinesisAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonKinesis using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonKinesisAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
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
    public Future<DescribeStreamResult> describeStreamAsync(final DescribeStreamRequest describeStreamRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStreamResult>() {
            public DescribeStreamResult call() throws Exception {
                return describeStream(describeStreamRequest);
        }
    });
    }

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
    public Future<DescribeStreamResult> describeStreamAsync(
            final DescribeStreamRequest describeStreamRequest,
            final AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStreamResult>() {
            public DescribeStreamResult call() throws Exception {
              DescribeStreamResult result;
                try {
                result = describeStream(describeStreamRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeStreamRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<GetShardIteratorResult> getShardIteratorAsync(final GetShardIteratorRequest getShardIteratorRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetShardIteratorResult>() {
            public GetShardIteratorResult call() throws Exception {
                return getShardIterator(getShardIteratorRequest);
        }
    });
    }

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
    public Future<GetShardIteratorResult> getShardIteratorAsync(
            final GetShardIteratorRequest getShardIteratorRequest,
            final AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetShardIteratorResult>() {
            public GetShardIteratorResult call() throws Exception {
              GetShardIteratorResult result;
                try {
                result = getShardIterator(getShardIteratorRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getShardIteratorRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<PutRecordResult> putRecordAsync(final PutRecordRequest putRecordRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutRecordResult>() {
            public PutRecordResult call() throws Exception {
                return putRecord(putRecordRequest);
        }
    });
    }

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
    public Future<PutRecordResult> putRecordAsync(
            final PutRecordRequest putRecordRequest,
            final AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutRecordResult>() {
            public PutRecordResult call() throws Exception {
              PutRecordResult result;
                try {
                result = putRecord(putRecordRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(putRecordRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<GetRecordsResult> getRecordsAsync(final GetRecordsRequest getRecordsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetRecordsResult>() {
            public GetRecordsResult call() throws Exception {
                return getRecords(getRecordsRequest);
        }
    });
    }

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
    public Future<GetRecordsResult> getRecordsAsync(
            final GetRecordsRequest getRecordsRequest,
            final AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetRecordsResult>() {
            public GetRecordsResult call() throws Exception {
              GetRecordsResult result;
                try {
                result = getRecords(getRecordsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getRecordsRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<Void> splitShardAsync(final SplitShardRequest splitShardRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                splitShard(splitShardRequest);
                return null;
        }
    });
    }

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
    public Future<Void> splitShardAsync(
            final SplitShardRequest splitShardRequest,
            final AsyncHandler<SplitShardRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                splitShard(splitShardRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(splitShardRequest, null);
                 return null;
        }
    });
    }
    
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
    public Future<Void> createStreamAsync(final CreateStreamRequest createStreamRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createStream(createStreamRequest);
                return null;
        }
    });
    }

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
    public Future<Void> createStreamAsync(
            final CreateStreamRequest createStreamRequest,
            final AsyncHandler<CreateStreamRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                createStream(createStreamRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createStreamRequest, null);
                 return null;
        }
    });
    }
    
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
    public Future<Void> deleteStreamAsync(final DeleteStreamRequest deleteStreamRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteStream(deleteStreamRequest);
                return null;
        }
    });
    }

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
    public Future<Void> deleteStreamAsync(
            final DeleteStreamRequest deleteStreamRequest,
            final AsyncHandler<DeleteStreamRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                deleteStream(deleteStreamRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteStreamRequest, null);
                 return null;
        }
    });
    }
    
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
    public Future<ListStreamsResult> listStreamsAsync(final ListStreamsRequest listStreamsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListStreamsResult>() {
            public ListStreamsResult call() throws Exception {
                return listStreams(listStreamsRequest);
        }
    });
    }

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
    public Future<ListStreamsResult> listStreamsAsync(
            final ListStreamsRequest listStreamsRequest,
            final AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListStreamsResult>() {
            public ListStreamsResult call() throws Exception {
              ListStreamsResult result;
                try {
                result = listStreams(listStreamsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listStreamsRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<Void> mergeShardsAsync(final MergeShardsRequest mergeShardsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                mergeShards(mergeShardsRequest);
                return null;
        }
    });
    }

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
    public Future<Void> mergeShardsAsync(
            final MergeShardsRequest mergeShardsRequest,
            final AsyncHandler<MergeShardsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
              try {
                mergeShards(mergeShardsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(mergeShardsRequest, null);
                 return null;
        }
    });
    }
    
}
        