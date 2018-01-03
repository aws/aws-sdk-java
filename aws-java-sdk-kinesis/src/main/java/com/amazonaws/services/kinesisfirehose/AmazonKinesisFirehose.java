/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kinesisfirehose.model.*;

/**
 * Interface for accessing Firehose.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisfirehose.AbstractAmazonKinesisFirehose} instead.
 * </p>
 * <p>
 * <fullname>Amazon Kinesis Firehose API Reference</fullname>
 * <p>
 * Amazon Kinesis Firehose is a fully managed service that delivers real-time streaming data to destinations such as
 * Amazon Simple Storage Service (Amazon S3), Amazon Elasticsearch Service (Amazon ES), and Amazon Redshift.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisFirehose {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "firehose";

    /**
     * Overrides the default endpoint for this client ("https://firehose.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "firehose.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://firehose.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "firehose.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://firehose.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonKinesisFirehose#setEndpoint(String)}, sets the regional endpoint for this client's
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
     * Creates a delivery stream.
     * </p>
     * <p>
     * By default, you can create up to 20 delivery streams per region.
     * </p>
     * <p>
     * This is an asynchronous operation that immediately returns. The initial status of the delivery stream is
     * <code>CREATING</code>. After the delivery stream is created, its status is <code>ACTIVE</code> and it now accepts
     * data. Attempts to send data to a delivery stream that is not in the <code>ACTIVE</code> state cause an exception.
     * To check the state of a delivery stream, use <a>DescribeDeliveryStream</a>.
     * </p>
     * <p>
     * A Kinesis Firehose delivery stream can be configured to receive records directly from providers using
     * <a>PutRecord</a> or <a>PutRecordBatch</a>, or it can be configured to use an existing Kinesis stream as its
     * source. To specify a Kinesis stream as input, set the <code>DeliveryStreamType</code> parameter to
     * <code>KinesisStreamAsSource</code>, and provide the Kinesis stream ARN and role ARN in the
     * <code>KinesisStreamSourceConfiguration</code> parameter.
     * </p>
     * <p>
     * A delivery stream is configured with a single destination: Amazon S3, Amazon ES, or Amazon Redshift. You must
     * specify only one of the following destination configuration parameters:
     * <b>ExtendedS3DestinationConfiguration</b>, <b>S3DestinationConfiguration</b>,
     * <b>ElasticsearchDestinationConfiguration</b>, or <b>RedshiftDestinationConfiguration</b>.
     * </p>
     * <p>
     * When you specify <b>S3DestinationConfiguration</b>, you can also provide the following optional values:
     * <b>BufferingHints</b>, <b>EncryptionConfiguration</b>, and <b>CompressionFormat</b>. By default, if no
     * <b>BufferingHints</b> value is provided, Kinesis Firehose buffers data up to 5 MB or for 5 minutes, whichever
     * condition is satisfied first. Note that <b>BufferingHints</b> is a hint, so there are some cases where the
     * service cannot adhere to these conditions strictly; for example, record boundaries are such that the size is a
     * little over or under the configured buffering size. By default, no encryption is performed. We strongly recommend
     * that you enable encryption to ensure secure data storage in Amazon S3.
     * </p>
     * <p>
     * A few notes about Amazon Redshift as a destination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Redshift destination requires an S3 bucket as intermediate location, as Kinesis Firehose first delivers
     * data to S3 and then uses <code>COPY</code> syntax to load data into an Amazon Redshift table. This is specified
     * in the <b>RedshiftDestinationConfiguration.S3Configuration</b> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <b>RedshiftDestinationConfiguration.S3Configuration</b> because the Amazon Redshift <code>COPY</code> operation
     * that reads from the S3 bucket doesn't support these compression formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * We strongly recommend that you use the user name and password you provide exclusively with Kinesis Firehose, and
     * that the permissions for the account are restricted for Amazon Redshift <code>INSERT</code> permissions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Kinesis Firehose assumes the IAM role that is configured as part of the destination. The role should allow the
     * Kinesis Firehose principal to assume the role, and the role should have permissions that allow the service to
     * deliver the data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Amazon S3 Bucket
     * Access</a> in the <i>Amazon Kinesis Firehose Developer Guide</i>.
     * </p>
     * 
     * @param createDeliveryStreamRequest
     * @return Result of the CreateDeliveryStream operation returned by the service.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws LimitExceededException
     *         You have already reached the limit for a requested resource.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this operation.
     * @sample AmazonKinesisFirehose.CreateDeliveryStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/CreateDeliveryStream" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDeliveryStreamResult createDeliveryStream(CreateDeliveryStreamRequest createDeliveryStreamRequest);

    /**
     * <p>
     * Deletes a delivery stream and its data.
     * </p>
     * <p>
     * You can delete a delivery stream only if it is in <code>ACTIVE</code> or <code>DELETING</code> state, and not in
     * the <code>CREATING</code> state. While the deletion request is in process, the delivery stream is in the
     * <code>DELETING</code> state.
     * </p>
     * <p>
     * To check the state of a delivery stream, use <a>DescribeDeliveryStream</a>.
     * </p>
     * <p>
     * While the delivery stream is <code>DELETING</code> state, the service may continue to accept the records, but the
     * service doesn't make any guarantees with respect to delivering the data. Therefore, as a best practice, you
     * should first stop any applications that are sending records before deleting a delivery stream.
     * </p>
     * 
     * @param deleteDeliveryStreamRequest
     * @return Result of the DeleteDeliveryStream operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this operation.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonKinesisFirehose.DeleteDeliveryStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DeleteDeliveryStream" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDeliveryStreamResult deleteDeliveryStream(DeleteDeliveryStreamRequest deleteDeliveryStreamRequest);

    /**
     * <p>
     * Describes the specified delivery stream and gets the status. For example, after your delivery stream is created,
     * call <a>DescribeDeliveryStream</a> to see if the delivery stream is <code>ACTIVE</code> and therefore ready for
     * data to be sent to it.
     * </p>
     * 
     * @param describeDeliveryStreamRequest
     * @return Result of the DescribeDeliveryStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonKinesisFirehose.DescribeDeliveryStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DescribeDeliveryStream"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDeliveryStreamResult describeDeliveryStream(DescribeDeliveryStreamRequest describeDeliveryStreamRequest);

    /**
     * <p>
     * Lists your delivery streams.
     * </p>
     * <p>
     * The number of delivery streams might be too large to return using a single call to <a>ListDeliveryStreams</a>.
     * You can limit the number of delivery streams returned, using the <b>Limit</b> parameter. To determine whether
     * there are more delivery streams to list, check the value of <b>HasMoreDeliveryStreams</b> in the output. If there
     * are more delivery streams to list, you can request them by specifying the name of the last delivery stream
     * returned in the call in the <b>ExclusiveStartDeliveryStreamName</b> parameter of a subsequent call.
     * </p>
     * 
     * @param listDeliveryStreamsRequest
     * @return Result of the ListDeliveryStreams operation returned by the service.
     * @sample AmazonKinesisFirehose.ListDeliveryStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ListDeliveryStreams" target="_top">AWS
     *      API Documentation</a>
     */
    ListDeliveryStreamsResult listDeliveryStreams(ListDeliveryStreamsRequest listDeliveryStreamsRequest);

    /**
     * <p>
     * Writes a single data record into an Amazon Kinesis Firehose delivery stream. To write multiple data records into
     * a delivery stream, use <a>PutRecordBatch</a>. Applications using these operations are referred to as producers.
     * </p>
     * <p>
     * By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5
     * MB per second. Note that if you use <a>PutRecord</a> and <a>PutRecordBatch</a>, the limits are an aggregate
     * across these two operations for each delivery stream. For more information about limits and how to request an
     * increase, see <a href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Firehose
     * Limits</a>.
     * </p>
     * <p>
     * You must specify the name of the delivery stream and the data record when using <a>PutRecord</a>. The data record
     * consists of a data blob that can be up to 1,000 KB in size, and any kind of data, for example, a segment from a
     * log file, geographic location data, website clickstream data, and so on.
     * </p>
     * <p>
     * Kinesis Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the
     * destination, a common solution is to use delimiters in the data, such as a newline (<code>\n</code>) or some
     * other character unique within the data. This allows the consumer application to parse individual data items when
     * reading the data from the destination.
     * </p>
     * <p>
     * The <a>PutRecord</a> operation returns a <b>RecordId</b>, which is a unique string assigned to each record.
     * Producer applications can use this ID for purposes such as auditability and investigation.
     * </p>
     * <p>
     * If the <a>PutRecord</a> operation throws a <b>ServiceUnavailableException</b>, back off and retry. If the
     * exception persists, it is possible that the throughput limits have been exceeded for the delivery stream.
     * </p>
     * <p>
     * Data records sent to Kinesis Firehose are stored for 24 hours from the time they are added to a delivery stream
     * as it attempts to send the records to the destination. If the destination is unreachable for more than 24 hours,
     * the data is no longer available.
     * </p>
     * 
     * @param putRecordRequest
     * @return Result of the PutRecord operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws ServiceUnavailableException
     *         The service is unavailable, back off and retry the operation. If you continue to see the exception,
     *         throughput limits for the delivery stream may have been exceeded. For more information about limits and
     *         how to request an increase, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Firehose Limits</a>.
     * @sample AmazonKinesisFirehose.PutRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/PutRecord" target="_top">AWS API
     *      Documentation</a>
     */
    PutRecordResult putRecord(PutRecordRequest putRecordRequest);

    /**
     * <p>
     * Writes multiple data records into a delivery stream in a single call, which can achieve higher throughput per
     * producer than when writing single records. To write single data records into a delivery stream, use
     * <a>PutRecord</a>. Applications using these operations are referred to as producers.
     * </p>
     * <p>
     * By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5
     * MB per second. If you use <a>PutRecord</a> and <a>PutRecordBatch</a>, the limits are an aggregate across these
     * two operations for each delivery stream. For more information about limits, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Firehose Limits</a>.
     * </p>
     * <p>
     * Each <a>PutRecordBatch</a> request supports up to 500 records. Each record in the request can be as large as
     * 1,000 KB (before 64-bit encoding), up to a limit of 4 MB for the entire request. These limits cannot be changed.
     * </p>
     * <p>
     * You must specify the name of the delivery stream and the data record when using <a>PutRecord</a>. The data record
     * consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it could be a
     * segment from a log file, geographic location data, web site clickstream data, and so on.
     * </p>
     * <p>
     * Kinesis Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the
     * destination, a common solution is to use delimiters in the data, such as a newline (<code>\n</code>) or some
     * other character unique within the data. This allows the consumer application to parse individual data items when
     * reading the data from the destination.
     * </p>
     * <p>
     * The <a>PutRecordBatch</a> response includes a count of failed records, <b>FailedPutCount</b>, and an array of
     * responses, <b>RequestResponses</b>. Each entry in the <b>RequestResponses</b> array provides additional
     * information about the processed record. It directly correlates with a record in the request array using the same
     * ordering, from the top to the bottom. The response array always includes the same number of records as the
     * request array. <b>RequestResponses</b> includes both successfully and unsuccessfully processed records. Kinesis
     * Firehose attempts to process all records in each <a>PutRecordBatch</a> request. A single record failure does not
     * stop the processing of subsequent records.
     * </p>
     * <p>
     * A successfully processed record includes a <b>RecordId</b> value, which is unique for the record. An
     * unsuccessfully processed record includes <b>ErrorCode</b> and <b>ErrorMessage</b> values. <b>ErrorCode</b>
     * reflects the type of error, and is one of the following values: <code>ServiceUnavailable</code> or
     * <code>InternalFailure</code>. <b>ErrorMessage</b> provides more detailed information about the error.
     * </p>
     * <p>
     * If there is an internal server error or a timeout, the write might have completed or it might have failed. If
     * <b>FailedPutCount</b> is greater than 0, retry the request, resending only those records that might have failed
     * processing. This minimizes the possible duplicate records and also reduces the total bytes sent (and
     * corresponding charges). We recommend that you handle any duplicates at the destination.
     * </p>
     * <p>
     * If <a>PutRecordBatch</a> throws <b>ServiceUnavailableException</b>, back off and retry. If the exception
     * persists, it is possible that the throughput limits have been exceeded for the delivery stream.
     * </p>
     * <p>
     * Data records sent to Kinesis Firehose are stored for 24 hours from the time they are added to a delivery stream
     * as it attempts to send the records to the destination. If the destination is unreachable for more than 24 hours,
     * the data is no longer available.
     * </p>
     * 
     * @param putRecordBatchRequest
     * @return Result of the PutRecordBatch operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws ServiceUnavailableException
     *         The service is unavailable, back off and retry the operation. If you continue to see the exception,
     *         throughput limits for the delivery stream may have been exceeded. For more information about limits and
     *         how to request an increase, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Firehose Limits</a>.
     * @sample AmazonKinesisFirehose.PutRecordBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/PutRecordBatch" target="_top">AWS API
     *      Documentation</a>
     */
    PutRecordBatchResult putRecordBatch(PutRecordBatchRequest putRecordBatchRequest);

    /**
     * <p>
     * Updates the specified destination of the specified delivery stream.
     * </p>
     * <p>
     * You can use this operation to change the destination type (for example, to replace the Amazon S3 destination with
     * Amazon Redshift) or change the parameters associated with a destination (for example, to change the bucket name
     * of the Amazon S3 destination). The update might not occur immediately. The target delivery stream remains active
     * while the configurations are updated, so data writes to the delivery stream can continue during this process. The
     * updated configurations are usually effective within a few minutes.
     * </p>
     * <p>
     * Note that switching between Amazon ES and other services is not supported. For an Amazon ES destination, you can
     * only update to another Amazon ES destination.
     * </p>
     * <p>
     * If the destination type is the same, Kinesis Firehose merges the configuration parameters specified with the
     * destination configuration that already exists on the delivery stream. If any of the parameters are not specified
     * in the call, the existing values are retained. For example, in the Amazon S3 destination, if
     * <a>EncryptionConfiguration</a> is not specified, then the existing <a>EncryptionConfiguration</a> is maintained
     * on the destination.
     * </p>
     * <p>
     * If the destination type is not the same, for example, changing the destination from Amazon S3 to Amazon Redshift,
     * Kinesis Firehose does not merge any parameters. In this case, all parameters must be specified.
     * </p>
     * <p>
     * Kinesis Firehose uses <b>CurrentDeliveryStreamVersionId</b> to avoid race conditions and conflicting merges. This
     * is a required field, and the service updates the configuration only if the existing configuration has a version
     * ID that matches. After the update is applied successfully, the version ID is updated, and can be retrieved using
     * <a>DescribeDeliveryStream</a>. Use the new version ID to set <b>CurrentDeliveryStreamVersionId</b> in the next
     * call.
     * </p>
     * 
     * @param updateDestinationRequest
     * @return Result of the UpdateDestination operation returned by the service.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this operation.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConcurrentModificationException
     *         Another modification has already happened. Fetch <b>VersionId</b> again and use it to update the
     *         destination.
     * @sample AmazonKinesisFirehose.UpdateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/UpdateDestination" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDestinationResult updateDestination(UpdateDestinationRequest updateDestinationRequest);

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
