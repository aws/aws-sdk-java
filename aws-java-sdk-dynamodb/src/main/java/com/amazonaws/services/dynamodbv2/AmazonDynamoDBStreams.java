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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.dynamodbv2.model.*;

/**
 * Interface for accessing Amazon DynamoDB Streams.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDBStreams} instead.
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
public interface AmazonDynamoDBStreams {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "streams.dynamodb";

    /**
     * Overrides the default endpoint for this client ("https://streams.dynamodb.us-east-1.amazonaws.com"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "streams.dynamodb.us-east-1.amazonaws.com") or a full URL, including
     * the protocol (ex: "https://streams.dynamodb.us-east-1.amazonaws.com"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "streams.dynamodb.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://streams.dynamodb.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonDynamoDBStreams#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the DescribeStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent stream.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDBStreams.DescribeStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/DescribeStream"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeStreamResult describeStream(DescribeStreamRequest describeStreamRequest);

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
     * @return Result of the GetRecords operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent stream.
     * @throws LimitExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ExpiredIteratorException
     *         The shard iterator has expired and can no longer be used to retrieve stream records. A shard iterator
     *         expires 15 minutes after it is retrieved using the <code>GetShardIterator</code> action.
     * @throws TrimmedDataAccessException
     *         The operation attempted to read past the oldest stream record in a shard.</p>
     *         <p>
     *         In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this
     *         limit are subject to removal (trimming) from the stream. You might receive a TrimmedDataAccessException
     *         if:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You request a shard iterator with a sequence number older than the trim point (24 hours).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You obtain a shard iterator, but before you use the iterator in a <code>GetRecords</code> request, a
     *         stream record in the shard exceeds the 24 hour period and is trimmed. This causes the iterator to access
     *         a record that no longer exists.
     *         </p>
     *         </li>
     * @sample AmazonDynamoDBStreams.GetRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/GetRecords" target="_top">AWS
     *      API Documentation</a>
     */
    GetRecordsResult getRecords(GetRecordsRequest getRecordsRequest);

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
     * @return Result of the GetShardIterator operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent stream.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TrimmedDataAccessException
     *         The operation attempted to read past the oldest stream record in a shard.</p>
     *         <p>
     *         In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this
     *         limit are subject to removal (trimming) from the stream. You might receive a TrimmedDataAccessException
     *         if:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You request a shard iterator with a sequence number older than the trim point (24 hours).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You obtain a shard iterator, but before you use the iterator in a <code>GetRecords</code> request, a
     *         stream record in the shard exceeds the 24 hour period and is trimmed. This causes the iterator to access
     *         a record that no longer exists.
     *         </p>
     *         </li>
     * @sample AmazonDynamoDBStreams.GetShardIterator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/GetShardIterator"
     *      target="_top">AWS API Documentation</a>
     */
    GetShardIteratorResult getShardIterator(GetShardIteratorRequest getShardIteratorRequest);

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
     * @return Result of the ListStreams operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent stream.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDBStreams.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/ListStreams" target="_top">AWS
     *      API Documentation</a>
     */
    ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
