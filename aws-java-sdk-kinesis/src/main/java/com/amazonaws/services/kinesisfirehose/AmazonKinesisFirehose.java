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
 * <fullname>Amazon Kinesis Data Firehose API Reference</fullname>
 * <p>
 * Amazon Kinesis Data Firehose is a fully managed service that delivers real-time streaming data to destinations such
 * as Amazon Simple Storage Service (Amazon S3), Amazon Elasticsearch Service (Amazon ES), Amazon Redshift, and Splunk.
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
     * Creates a Kinesis Data Firehose delivery stream.
     * </p>
     * <p>
     * By default, you can create up to 50 delivery streams per AWS Region.
     * </p>
     * <p>
     * This is an asynchronous operation that immediately returns. The initial status of the delivery stream is
     * <code>CREATING</code>. After the delivery stream is created, its status is <code>ACTIVE</code> and it now accepts
     * data. Attempts to send data to a delivery stream that is not in the <code>ACTIVE</code> state cause an exception.
     * To check the state of a delivery stream, use <a>DescribeDeliveryStream</a>.
     * </p>
     * <p>
     * A Kinesis Data Firehose delivery stream can be configured to receive records directly from providers using
     * <a>PutRecord</a> or <a>PutRecordBatch</a>, or it can be configured to use an existing Kinesis stream as its
     * source. To specify a Kinesis data stream as input, set the <code>DeliveryStreamType</code> parameter to
     * <code>KinesisStreamAsSource</code>, and provide the Kinesis stream Amazon Resource Name (ARN) and role ARN in the
     * <code>KinesisStreamSourceConfiguration</code> parameter.
     * </p>
     * <p>
     * A delivery stream is configured with a single destination: Amazon S3, Amazon ES, Amazon Redshift, or Splunk. You
     * must specify only one of the following destination configuration parameters:
     * <code>ExtendedS3DestinationConfiguration</code>, <code>S3DestinationConfiguration</code>,
     * <code>ElasticsearchDestinationConfiguration</code>, <code>RedshiftDestinationConfiguration</code>, or
     * <code>SplunkDestinationConfiguration</code>.
     * </p>
     * <p>
     * When you specify <code>S3DestinationConfiguration</code>, you can also provide the following optional values:
     * BufferingHints, <code>EncryptionConfiguration</code>, and <code>CompressionFormat</code>. By default, if no
     * <code>BufferingHints</code> value is provided, Kinesis Data Firehose buffers data up to 5 MB or for 5 minutes,
     * whichever condition is satisfied first. <code>BufferingHints</code> is a hint, so there are some cases where the
     * service cannot adhere to these conditions strictly. For example, record boundaries might be such that the size is
     * a little over or under the configured buffering size. By default, no encryption is performed. We strongly
     * recommend that you enable encryption to ensure secure data storage in Amazon S3.
     * </p>
     * <p>
     * A few notes about Amazon Redshift as a destination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Redshift destination requires an S3 bucket as intermediate location. Kinesis Data Firehose first
     * delivers data to Amazon S3 and then uses <code>COPY</code> syntax to load data into an Amazon Redshift table.
     * This is specified in the <code>RedshiftDestinationConfiguration.S3Configuration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <code>RedshiftDestinationConfiguration.S3Configuration</code> because the Amazon Redshift <code>COPY</code>
     * operation that reads from the S3 bucket doesn't support these compression formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * We strongly recommend that you use the user name and password you provide exclusively with Kinesis Data Firehose,
     * and that the permissions for the account are restricted for Amazon Redshift <code>INSERT</code> permissions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Kinesis Data Firehose assumes the IAM role that is configured as part of the destination. The role should allow
     * the Kinesis Data Firehose principal to assume the role, and the role should have permissions that allow the
     * service to deliver the data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Grant Kinesis Data
     * Firehose Access to an Amazon S3 Destination</a> in the <i>Amazon Kinesis Data Firehose Developer Guide</i>.
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
     * While the delivery stream is <code>DELETING</code> state, the service might continue to accept the records, but
     * it doesn't make any guarantees with respect to delivering the data. Therefore, as a best practice, you should
     * first stop any applications that are sending records before deleting a delivery stream.
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
     * call <code>DescribeDeliveryStream</code> to see whether the delivery stream is <code>ACTIVE</code> and therefore
     * ready for data to be sent to it.
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
     * Lists your delivery streams in alphabetical order of their names.
     * </p>
     * <p>
     * The number of delivery streams might be too large to return using a single call to
     * <code>ListDeliveryStreams</code>. You can limit the number of delivery streams returned, using the
     * <code>Limit</code> parameter. To determine whether there are more delivery streams to list, check the value of
     * <code>HasMoreDeliveryStreams</code> in the output. If there are more delivery streams to list, you can request
     * them by calling this operation again and setting the <code>ExclusiveStartDeliveryStreamName</code> parameter to
     * the name of the last delivery stream returned in the last call.
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
     * Lists the tags for the specified delivery stream. This operation has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param listTagsForDeliveryStreamRequest
     * @return Result of the ListTagsForDeliveryStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws LimitExceededException
     *         You have already reached the limit for a requested resource.
     * @sample AmazonKinesisFirehose.ListTagsForDeliveryStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ListTagsForDeliveryStream"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForDeliveryStreamResult listTagsForDeliveryStream(ListTagsForDeliveryStreamRequest listTagsForDeliveryStreamRequest);

    /**
     * <p>
     * Writes a single data record into an Amazon Kinesis Data Firehose delivery stream. To write multiple data records
     * into a delivery stream, use <a>PutRecordBatch</a>. Applications using these operations are referred to as
     * producers.
     * </p>
     * <p>
     * By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5
     * MB per second. If you use <a>PutRecord</a> and <a>PutRecordBatch</a>, the limits are an aggregate across these
     * two operations for each delivery stream. For more information about limits and how to request an increase, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Data Firehose Limits</a>.
     * </p>
     * <p>
     * You must specify the name of the delivery stream and the data record when using <a>PutRecord</a>. The data record
     * consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it can be a
     * segment from a log file, geographic location data, website clickstream data, and so on.
     * </p>
     * <p>
     * Kinesis Data Firehose buffers records before delivering them to the destination. To disambiguate the data blobs
     * at the destination, a common solution is to use delimiters in the data, such as a newline (<code>\n</code>) or
     * some other character unique within the data. This allows the consumer application to parse individual data items
     * when reading the data from the destination.
     * </p>
     * <p>
     * The <code>PutRecord</code> operation returns a <code>RecordId</code>, which is a unique string assigned to each
     * record. Producer applications can use this ID for purposes such as auditability and investigation.
     * </p>
     * <p>
     * If the <code>PutRecord</code> operation throws a <code>ServiceUnavailableException</code>, back off and retry. If
     * the exception persists, it is possible that the throughput limits have been exceeded for the delivery stream.
     * </p>
     * <p>
     * Data records sent to Kinesis Data Firehose are stored for 24 hours from the time they are added to a delivery
     * stream as it tries to send the records to the destination. If the destination is unreachable for more than 24
     * hours, the data is no longer available.
     * </p>
     * <important>
     * <p>
     * Don't concatenate two or more base64 strings to form the data fields of your records. Instead, concatenate the
     * raw data, then perform base64 encoding.
     * </p>
     * </important>
     * 
     * @param putRecordRequest
     * @return Result of the PutRecord operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation. If you continue to see the exception,
     *         throughput limits for the delivery stream may have been exceeded. For more information about limits and
     *         how to request an increase, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Data Firehose
     *         Limits</a>.
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
     * href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Data Firehose Limits</a>.
     * </p>
     * <p>
     * Each <a>PutRecordBatch</a> request supports up to 500 records. Each record in the request can be as large as
     * 1,000 KB (before 64-bit encoding), up to a limit of 4 MB for the entire request. These limits cannot be changed.
     * </p>
     * <p>
     * You must specify the name of the delivery stream and the data record when using <a>PutRecord</a>. The data record
     * consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it could be a
     * segment from a log file, geographic location data, website clickstream data, and so on.
     * </p>
     * <p>
     * Kinesis Data Firehose buffers records before delivering them to the destination. To disambiguate the data blobs
     * at the destination, a common solution is to use delimiters in the data, such as a newline (<code>\n</code>) or
     * some other character unique within the data. This allows the consumer application to parse individual data items
     * when reading the data from the destination.
     * </p>
     * <p>
     * The <a>PutRecordBatch</a> response includes a count of failed records, <code>FailedPutCount</code>, and an array
     * of responses, <code>RequestResponses</code>. Even if the <a>PutRecordBatch</a> call succeeds, the value of
     * <code>FailedPutCount</code> may be greater than 0, indicating that there are records for which the operation
     * didn't succeed. Each entry in the <code>RequestResponses</code> array provides additional information about the
     * processed record. It directly correlates with a record in the request array using the same ordering, from the top
     * to the bottom. The response array always includes the same number of records as the request array.
     * <code>RequestResponses</code> includes both successfully and unsuccessfully processed records. Kinesis Data
     * Firehose tries to process all records in each <a>PutRecordBatch</a> request. A single record failure does not
     * stop the processing of subsequent records.
     * </p>
     * <p>
     * A successfully processed record includes a <code>RecordId</code> value, which is unique for the record. An
     * unsuccessfully processed record includes <code>ErrorCode</code> and <code>ErrorMessage</code> values.
     * <code>ErrorCode</code> reflects the type of error, and is one of the following values:
     * <code>ServiceUnavailableException</code> or <code>InternalFailure</code>. <code>ErrorMessage</code> provides more
     * detailed information about the error.
     * </p>
     * <p>
     * If there is an internal server error or a timeout, the write might have completed or it might have failed. If
     * <code>FailedPutCount</code> is greater than 0, retry the request, resending only those records that might have
     * failed processing. This minimizes the possible duplicate records and also reduces the total bytes sent (and
     * corresponding charges). We recommend that you handle any duplicates at the destination.
     * </p>
     * <p>
     * If <a>PutRecordBatch</a> throws <code>ServiceUnavailableException</code>, back off and retry. If the exception
     * persists, it is possible that the throughput limits have been exceeded for the delivery stream.
     * </p>
     * <p>
     * Data records sent to Kinesis Data Firehose are stored for 24 hours from the time they are added to a delivery
     * stream as it attempts to send the records to the destination. If the destination is unreachable for more than 24
     * hours, the data is no longer available.
     * </p>
     * <important>
     * <p>
     * Don't concatenate two or more base64 strings to form the data fields of your records. Instead, concatenate the
     * raw data, then perform base64 encoding.
     * </p>
     * </important>
     * 
     * @param putRecordBatchRequest
     * @return Result of the PutRecordBatch operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation. If you continue to see the exception,
     *         throughput limits for the delivery stream may have been exceeded. For more information about limits and
     *         how to request an increase, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Data Firehose
     *         Limits</a>.
     * @sample AmazonKinesisFirehose.PutRecordBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/PutRecordBatch" target="_top">AWS API
     *      Documentation</a>
     */
    PutRecordBatchResult putRecordBatch(PutRecordBatchRequest putRecordBatchRequest);

    /**
     * <p>
     * Enables server-side encryption (SSE) for the delivery stream.
     * </p>
     * <p>
     * This operation is asynchronous. It returns immediately. When you invoke it, Kinesis Data Firehose first sets the
     * status of the stream to <code>ENABLING</code>, and then to <code>ENABLED</code>. You can continue to read and
     * write data to your stream while its status is <code>ENABLING</code>, but the data is not encrypted. It can take
     * up to 5 seconds after the encryption status changes to <code>ENABLED</code> before all records written to the
     * delivery stream are encrypted. To find out whether a record or a batch of records was encrypted, check the
     * response elements <a>PutRecordOutput$Encrypted</a> and <a>PutRecordBatchOutput$Encrypted</a>, respectively.
     * </p>
     * <p>
     * To check the encryption state of a delivery stream, use <a>DescribeDeliveryStream</a>.
     * </p>
     * <p>
     * You can only enable SSE for a delivery stream that uses <code>DirectPut</code> as its source.
     * </p>
     * <p>
     * The <code>StartDeliveryStreamEncryption</code> and <code>StopDeliveryStreamEncryption</code> operations have a
     * combined limit of 25 calls per delivery stream per 24 hours. For example, you reach the limit if you call
     * <code>StartDeliveryStreamEncryption</code> 13 times and <code>StopDeliveryStreamEncryption</code> 12 times for
     * the same delivery stream in a 24-hour period.
     * </p>
     * 
     * @param startDeliveryStreamEncryptionRequest
     * @return Result of the StartDeliveryStreamEncryption operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws LimitExceededException
     *         You have already reached the limit for a requested resource.
     * @sample AmazonKinesisFirehose.StartDeliveryStreamEncryption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/StartDeliveryStreamEncryption"
     *      target="_top">AWS API Documentation</a>
     */
    StartDeliveryStreamEncryptionResult startDeliveryStreamEncryption(StartDeliveryStreamEncryptionRequest startDeliveryStreamEncryptionRequest);

    /**
     * <p>
     * Disables server-side encryption (SSE) for the delivery stream.
     * </p>
     * <p>
     * This operation is asynchronous. It returns immediately. When you invoke it, Kinesis Data Firehose first sets the
     * status of the stream to <code>DISABLING</code>, and then to <code>DISABLED</code>. You can continue to read and
     * write data to your stream while its status is <code>DISABLING</code>. It can take up to 5 seconds after the
     * encryption status changes to <code>DISABLED</code> before all records written to the delivery stream are no
     * longer subject to encryption. To find out whether a record or a batch of records was encrypted, check the
     * response elements <a>PutRecordOutput$Encrypted</a> and <a>PutRecordBatchOutput$Encrypted</a>, respectively.
     * </p>
     * <p>
     * To check the encryption state of a delivery stream, use <a>DescribeDeliveryStream</a>.
     * </p>
     * <p>
     * The <code>StartDeliveryStreamEncryption</code> and <code>StopDeliveryStreamEncryption</code> operations have a
     * combined limit of 25 calls per delivery stream per 24 hours. For example, you reach the limit if you call
     * <code>StartDeliveryStreamEncryption</code> 13 times and <code>StopDeliveryStreamEncryption</code> 12 times for
     * the same delivery stream in a 24-hour period.
     * </p>
     * 
     * @param stopDeliveryStreamEncryptionRequest
     * @return Result of the StopDeliveryStreamEncryption operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws LimitExceededException
     *         You have already reached the limit for a requested resource.
     * @sample AmazonKinesisFirehose.StopDeliveryStreamEncryption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/StopDeliveryStreamEncryption"
     *      target="_top">AWS API Documentation</a>
     */
    StopDeliveryStreamEncryptionResult stopDeliveryStreamEncryption(StopDeliveryStreamEncryptionRequest stopDeliveryStreamEncryptionRequest);

    /**
     * <p>
     * Adds or updates tags for the specified delivery stream. A tag is a key-value pair that you can define and assign
     * to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you
     * specify in the request. Tags are metadata. For example, you can add friendly names and descriptions or other
     * types of information that can help you distinguish the delivery stream. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * Each delivery stream can have up to 50 tags.
     * </p>
     * <p>
     * This operation has a limit of five transactions per second per account.
     * </p>
     * 
     * @param tagDeliveryStreamRequest
     * @return Result of the TagDeliveryStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws LimitExceededException
     *         You have already reached the limit for a requested resource.
     * @sample AmazonKinesisFirehose.TagDeliveryStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/TagDeliveryStream" target="_top">AWS API
     *      Documentation</a>
     */
    TagDeliveryStreamResult tagDeliveryStream(TagDeliveryStreamRequest tagDeliveryStreamRequest);

    /**
     * <p>
     * Removes tags from the specified delivery stream. Removed tags are deleted, and you can't recover them after this
     * operation successfully completes.
     * </p>
     * <p>
     * If you specify a tag that doesn't exist, the operation ignores it.
     * </p>
     * <p>
     * This operation has a limit of five transactions per second per account.
     * </p>
     * 
     * @param untagDeliveryStreamRequest
     * @return Result of the UntagDeliveryStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws LimitExceededException
     *         You have already reached the limit for a requested resource.
     * @sample AmazonKinesisFirehose.UntagDeliveryStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/UntagDeliveryStream" target="_top">AWS
     *      API Documentation</a>
     */
    UntagDeliveryStreamResult untagDeliveryStream(UntagDeliveryStreamRequest untagDeliveryStreamRequest);

    /**
     * <p>
     * Updates the specified destination of the specified delivery stream.
     * </p>
     * <p>
     * Use this operation to change the destination type (for example, to replace the Amazon S3 destination with Amazon
     * Redshift) or change the parameters associated with a destination (for example, to change the bucket name of the
     * Amazon S3 destination). The update might not occur immediately. The target delivery stream remains active while
     * the configurations are updated, so data writes to the delivery stream can continue during this process. The
     * updated configurations are usually effective within a few minutes.
     * </p>
     * <p>
     * Switching between Amazon ES and other services is not supported. For an Amazon ES destination, you can only
     * update to another Amazon ES destination.
     * </p>
     * <p>
     * If the destination type is the same, Kinesis Data Firehose merges the configuration parameters specified with the
     * destination configuration that already exists on the delivery stream. If any of the parameters are not specified
     * in the call, the existing values are retained. For example, in the Amazon S3 destination, if
     * <a>EncryptionConfiguration</a> is not specified, then the existing <code>EncryptionConfiguration</code> is
     * maintained on the destination.
     * </p>
     * <p>
     * If the destination type is not the same, for example, changing the destination from Amazon S3 to Amazon Redshift,
     * Kinesis Data Firehose does not merge any parameters. In this case, all parameters must be specified.
     * </p>
     * <p>
     * Kinesis Data Firehose uses <code>CurrentDeliveryStreamVersionId</code> to avoid race conditions and conflicting
     * merges. This is a required field, and the service updates the configuration only if the existing configuration
     * has a version ID that matches. After the update is applied successfully, the version ID is updated, and can be
     * retrieved using <a>DescribeDeliveryStream</a>. Use the new version ID to set
     * <code>CurrentDeliveryStreamVersionId</code> in the next call.
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
     *         Another modification has already happened. Fetch <code>VersionId</code> again and use it to update the
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
