/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional options for the Amazon Kinesis streaming data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/KinesisStreamingSourceOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisStreamingSourceOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the Kinesis endpoint.
     * </p>
     */
    private String endpointUrl;
    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * An optional classification.
     * </p>
     */
    private String classification;
    /**
     * <p>
     * Specifies the delimiter character.
     * </p>
     */
    private String delimiter;
    /**
     * <p>
     * The starting position in the Kinesis data stream to read data from. The possible values are <code>"latest"</code>, <code>"trim_horizon"</code>, or <code>"earliest"</code>. The default value is <code>"latest"</code>.
     * </p>
     */
    private String startingPosition;
    /**
     * <p>
     * The maximum time spent in the job executor to fetch a record from the Kinesis data stream per shard, specified in
     * milliseconds (ms). The default value is <code>1000</code>.
     * </p>
     */
    private Long maxFetchTimeInMs;
    /**
     * <p>
     * The maximum number of records to fetch per shard in the Kinesis data stream. The default value is
     * <code>100000</code>.
     * </p>
     */
    private Long maxFetchRecordsPerShard;
    /**
     * <p>
     * The maximum number of records to fetch from the Kinesis data stream in each getRecords operation. The default
     * value is <code>10000</code>.
     * </p>
     */
    private Long maxRecordPerRead;
    /**
     * <p>
     * Adds a time delay between two consecutive getRecords operations. The default value is <code>"False"</code>. This
     * option is only configurable for Glue version 2.0 and above.
     * </p>
     */
    private Boolean addIdleTimeBetweenReads;
    /**
     * <p>
     * The minimum time delay between two consecutive getRecords operations, specified in ms. The default value is
     * <code>1000</code>. This option is only configurable for Glue version 2.0 and above.
     * </p>
     */
    private Long idleTimeBetweenReadsInMs;
    /**
     * <p>
     * The minimum time interval between two ListShards API calls for your script to consider resharding. The default
     * value is <code>1s</code>.
     * </p>
     */
    private Long describeShardInterval;
    /**
     * <p>
     * The maximum number of retries for Kinesis Data Streams API requests. The default value is <code>3</code>.
     * </p>
     */
    private Integer numRetries;
    /**
     * <p>
     * The cool-off time period (specified in ms) before retrying the Kinesis Data Streams API call. The default value
     * is <code>1000</code>.
     * </p>
     */
    private Long retryIntervalMs;
    /**
     * <p>
     * The maximum cool-off time period (specified in ms) between two retries of a Kinesis Data Streams API call. The
     * default value is <code>10000</code>.
     * </p>
     */
    private Long maxRetryIntervalMs;
    /**
     * <p>
     * Avoids creating an empty microbatch job by checking for unread data in the Kinesis data stream before the batch
     * is started. The default value is <code>"False"</code>.
     * </p>
     */
    private Boolean avoidEmptyBatches;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume using AWS Security Token Service (AWS STS). This role must
     * have permissions for describe or read record operations for the Kinesis data stream. You must use this parameter
     * when accessing a data stream in a different account. Used in conjunction with <code>"awsSTSSessionName"</code>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An identifier for the session assuming the role using AWS STS. You must use this parameter when accessing a data
     * stream in a different account. Used in conjunction with <code>"awsSTSRoleARN"</code>.
     * </p>
     */
    private String roleSessionName;

    /**
     * <p>
     * The URL of the Kinesis endpoint.
     * </p>
     * 
     * @param endpointUrl
     *        The URL of the Kinesis endpoint.
     */

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    /**
     * <p>
     * The URL of the Kinesis endpoint.
     * </p>
     * 
     * @return The URL of the Kinesis endpoint.
     */

    public String getEndpointUrl() {
        return this.endpointUrl;
    }

    /**
     * <p>
     * The URL of the Kinesis endpoint.
     * </p>
     * 
     * @param endpointUrl
     *        The URL of the Kinesis endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withEndpointUrl(String endpointUrl) {
        setEndpointUrl(endpointUrl);
        return this;
    }

    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     * 
     * @param streamName
     *        The name of the Kinesis data stream.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     * 
     * @return The name of the Kinesis data stream.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     * 
     * @param streamName
     *        The name of the Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * An optional classification.
     * </p>
     * 
     * @param classification
     *        An optional classification.
     */

    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * An optional classification.
     * </p>
     * 
     * @return An optional classification.
     */

    public String getClassification() {
        return this.classification;
    }

    /**
     * <p>
     * An optional classification.
     * </p>
     * 
     * @param classification
     *        An optional classification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withClassification(String classification) {
        setClassification(classification);
        return this;
    }

    /**
     * <p>
     * Specifies the delimiter character.
     * </p>
     * 
     * @param delimiter
     *        Specifies the delimiter character.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * Specifies the delimiter character.
     * </p>
     * 
     * @return Specifies the delimiter character.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * Specifies the delimiter character.
     * </p>
     * 
     * @param delimiter
     *        Specifies the delimiter character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * <p>
     * The starting position in the Kinesis data stream to read data from. The possible values are <code>"latest"</code>, <code>"trim_horizon"</code>, or <code>"earliest"</code>. The default value is <code>"latest"</code>.
     * </p>
     * 
     * @param startingPosition
     *        The starting position in the Kinesis data stream to read data from. The possible values are
     *        <code>"latest"</code>, <code>"trim_horizon"</code>, or <code>"earliest"</code>. The default value is
     *        <code>"latest"</code>.
     * @see StartingPosition
     */

    public void setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
    }

    /**
     * <p>
     * The starting position in the Kinesis data stream to read data from. The possible values are <code>"latest"</code>, <code>"trim_horizon"</code>, or <code>"earliest"</code>. The default value is <code>"latest"</code>.
     * </p>
     * 
     * @return The starting position in the Kinesis data stream to read data from. The possible values are
     *         <code>"latest"</code>, <code>"trim_horizon"</code>, or <code>"earliest"</code>. The default value is
     *         <code>"latest"</code>.
     * @see StartingPosition
     */

    public String getStartingPosition() {
        return this.startingPosition;
    }

    /**
     * <p>
     * The starting position in the Kinesis data stream to read data from. The possible values are <code>"latest"</code>, <code>"trim_horizon"</code>, or <code>"earliest"</code>. The default value is <code>"latest"</code>.
     * </p>
     * 
     * @param startingPosition
     *        The starting position in the Kinesis data stream to read data from. The possible values are
     *        <code>"latest"</code>, <code>"trim_horizon"</code>, or <code>"earliest"</code>. The default value is
     *        <code>"latest"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StartingPosition
     */

    public KinesisStreamingSourceOptions withStartingPosition(String startingPosition) {
        setStartingPosition(startingPosition);
        return this;
    }

    /**
     * <p>
     * The starting position in the Kinesis data stream to read data from. The possible values are <code>"latest"</code>, <code>"trim_horizon"</code>, or <code>"earliest"</code>. The default value is <code>"latest"</code>.
     * </p>
     * 
     * @param startingPosition
     *        The starting position in the Kinesis data stream to read data from. The possible values are
     *        <code>"latest"</code>, <code>"trim_horizon"</code>, or <code>"earliest"</code>. The default value is
     *        <code>"latest"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StartingPosition
     */

    public KinesisStreamingSourceOptions withStartingPosition(StartingPosition startingPosition) {
        this.startingPosition = startingPosition.toString();
        return this;
    }

    /**
     * <p>
     * The maximum time spent in the job executor to fetch a record from the Kinesis data stream per shard, specified in
     * milliseconds (ms). The default value is <code>1000</code>.
     * </p>
     * 
     * @param maxFetchTimeInMs
     *        The maximum time spent in the job executor to fetch a record from the Kinesis data stream per shard,
     *        specified in milliseconds (ms). The default value is <code>1000</code>.
     */

    public void setMaxFetchTimeInMs(Long maxFetchTimeInMs) {
        this.maxFetchTimeInMs = maxFetchTimeInMs;
    }

    /**
     * <p>
     * The maximum time spent in the job executor to fetch a record from the Kinesis data stream per shard, specified in
     * milliseconds (ms). The default value is <code>1000</code>.
     * </p>
     * 
     * @return The maximum time spent in the job executor to fetch a record from the Kinesis data stream per shard,
     *         specified in milliseconds (ms). The default value is <code>1000</code>.
     */

    public Long getMaxFetchTimeInMs() {
        return this.maxFetchTimeInMs;
    }

    /**
     * <p>
     * The maximum time spent in the job executor to fetch a record from the Kinesis data stream per shard, specified in
     * milliseconds (ms). The default value is <code>1000</code>.
     * </p>
     * 
     * @param maxFetchTimeInMs
     *        The maximum time spent in the job executor to fetch a record from the Kinesis data stream per shard,
     *        specified in milliseconds (ms). The default value is <code>1000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withMaxFetchTimeInMs(Long maxFetchTimeInMs) {
        setMaxFetchTimeInMs(maxFetchTimeInMs);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to fetch per shard in the Kinesis data stream. The default value is
     * <code>100000</code>.
     * </p>
     * 
     * @param maxFetchRecordsPerShard
     *        The maximum number of records to fetch per shard in the Kinesis data stream. The default value is
     *        <code>100000</code>.
     */

    public void setMaxFetchRecordsPerShard(Long maxFetchRecordsPerShard) {
        this.maxFetchRecordsPerShard = maxFetchRecordsPerShard;
    }

    /**
     * <p>
     * The maximum number of records to fetch per shard in the Kinesis data stream. The default value is
     * <code>100000</code>.
     * </p>
     * 
     * @return The maximum number of records to fetch per shard in the Kinesis data stream. The default value is
     *         <code>100000</code>.
     */

    public Long getMaxFetchRecordsPerShard() {
        return this.maxFetchRecordsPerShard;
    }

    /**
     * <p>
     * The maximum number of records to fetch per shard in the Kinesis data stream. The default value is
     * <code>100000</code>.
     * </p>
     * 
     * @param maxFetchRecordsPerShard
     *        The maximum number of records to fetch per shard in the Kinesis data stream. The default value is
     *        <code>100000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withMaxFetchRecordsPerShard(Long maxFetchRecordsPerShard) {
        setMaxFetchRecordsPerShard(maxFetchRecordsPerShard);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to fetch from the Kinesis data stream in each getRecords operation. The default
     * value is <code>10000</code>.
     * </p>
     * 
     * @param maxRecordPerRead
     *        The maximum number of records to fetch from the Kinesis data stream in each getRecords operation. The
     *        default value is <code>10000</code>.
     */

    public void setMaxRecordPerRead(Long maxRecordPerRead) {
        this.maxRecordPerRead = maxRecordPerRead;
    }

    /**
     * <p>
     * The maximum number of records to fetch from the Kinesis data stream in each getRecords operation. The default
     * value is <code>10000</code>.
     * </p>
     * 
     * @return The maximum number of records to fetch from the Kinesis data stream in each getRecords operation. The
     *         default value is <code>10000</code>.
     */

    public Long getMaxRecordPerRead() {
        return this.maxRecordPerRead;
    }

    /**
     * <p>
     * The maximum number of records to fetch from the Kinesis data stream in each getRecords operation. The default
     * value is <code>10000</code>.
     * </p>
     * 
     * @param maxRecordPerRead
     *        The maximum number of records to fetch from the Kinesis data stream in each getRecords operation. The
     *        default value is <code>10000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withMaxRecordPerRead(Long maxRecordPerRead) {
        setMaxRecordPerRead(maxRecordPerRead);
        return this;
    }

    /**
     * <p>
     * Adds a time delay between two consecutive getRecords operations. The default value is <code>"False"</code>. This
     * option is only configurable for Glue version 2.0 and above.
     * </p>
     * 
     * @param addIdleTimeBetweenReads
     *        Adds a time delay between two consecutive getRecords operations. The default value is <code>"False"</code>
     *        . This option is only configurable for Glue version 2.0 and above.
     */

    public void setAddIdleTimeBetweenReads(Boolean addIdleTimeBetweenReads) {
        this.addIdleTimeBetweenReads = addIdleTimeBetweenReads;
    }

    /**
     * <p>
     * Adds a time delay between two consecutive getRecords operations. The default value is <code>"False"</code>. This
     * option is only configurable for Glue version 2.0 and above.
     * </p>
     * 
     * @return Adds a time delay between two consecutive getRecords operations. The default value is
     *         <code>"False"</code>. This option is only configurable for Glue version 2.0 and above.
     */

    public Boolean getAddIdleTimeBetweenReads() {
        return this.addIdleTimeBetweenReads;
    }

    /**
     * <p>
     * Adds a time delay between two consecutive getRecords operations. The default value is <code>"False"</code>. This
     * option is only configurable for Glue version 2.0 and above.
     * </p>
     * 
     * @param addIdleTimeBetweenReads
     *        Adds a time delay between two consecutive getRecords operations. The default value is <code>"False"</code>
     *        . This option is only configurable for Glue version 2.0 and above.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withAddIdleTimeBetweenReads(Boolean addIdleTimeBetweenReads) {
        setAddIdleTimeBetweenReads(addIdleTimeBetweenReads);
        return this;
    }

    /**
     * <p>
     * Adds a time delay between two consecutive getRecords operations. The default value is <code>"False"</code>. This
     * option is only configurable for Glue version 2.0 and above.
     * </p>
     * 
     * @return Adds a time delay between two consecutive getRecords operations. The default value is
     *         <code>"False"</code>. This option is only configurable for Glue version 2.0 and above.
     */

    public Boolean isAddIdleTimeBetweenReads() {
        return this.addIdleTimeBetweenReads;
    }

    /**
     * <p>
     * The minimum time delay between two consecutive getRecords operations, specified in ms. The default value is
     * <code>1000</code>. This option is only configurable for Glue version 2.0 and above.
     * </p>
     * 
     * @param idleTimeBetweenReadsInMs
     *        The minimum time delay between two consecutive getRecords operations, specified in ms. The default value
     *        is <code>1000</code>. This option is only configurable for Glue version 2.0 and above.
     */

    public void setIdleTimeBetweenReadsInMs(Long idleTimeBetweenReadsInMs) {
        this.idleTimeBetweenReadsInMs = idleTimeBetweenReadsInMs;
    }

    /**
     * <p>
     * The minimum time delay between two consecutive getRecords operations, specified in ms. The default value is
     * <code>1000</code>. This option is only configurable for Glue version 2.0 and above.
     * </p>
     * 
     * @return The minimum time delay between two consecutive getRecords operations, specified in ms. The default value
     *         is <code>1000</code>. This option is only configurable for Glue version 2.0 and above.
     */

    public Long getIdleTimeBetweenReadsInMs() {
        return this.idleTimeBetweenReadsInMs;
    }

    /**
     * <p>
     * The minimum time delay between two consecutive getRecords operations, specified in ms. The default value is
     * <code>1000</code>. This option is only configurable for Glue version 2.0 and above.
     * </p>
     * 
     * @param idleTimeBetweenReadsInMs
     *        The minimum time delay between two consecutive getRecords operations, specified in ms. The default value
     *        is <code>1000</code>. This option is only configurable for Glue version 2.0 and above.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withIdleTimeBetweenReadsInMs(Long idleTimeBetweenReadsInMs) {
        setIdleTimeBetweenReadsInMs(idleTimeBetweenReadsInMs);
        return this;
    }

    /**
     * <p>
     * The minimum time interval between two ListShards API calls for your script to consider resharding. The default
     * value is <code>1s</code>.
     * </p>
     * 
     * @param describeShardInterval
     *        The minimum time interval between two ListShards API calls for your script to consider resharding. The
     *        default value is <code>1s</code>.
     */

    public void setDescribeShardInterval(Long describeShardInterval) {
        this.describeShardInterval = describeShardInterval;
    }

    /**
     * <p>
     * The minimum time interval between two ListShards API calls for your script to consider resharding. The default
     * value is <code>1s</code>.
     * </p>
     * 
     * @return The minimum time interval between two ListShards API calls for your script to consider resharding. The
     *         default value is <code>1s</code>.
     */

    public Long getDescribeShardInterval() {
        return this.describeShardInterval;
    }

    /**
     * <p>
     * The minimum time interval between two ListShards API calls for your script to consider resharding. The default
     * value is <code>1s</code>.
     * </p>
     * 
     * @param describeShardInterval
     *        The minimum time interval between two ListShards API calls for your script to consider resharding. The
     *        default value is <code>1s</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withDescribeShardInterval(Long describeShardInterval) {
        setDescribeShardInterval(describeShardInterval);
        return this;
    }

    /**
     * <p>
     * The maximum number of retries for Kinesis Data Streams API requests. The default value is <code>3</code>.
     * </p>
     * 
     * @param numRetries
     *        The maximum number of retries for Kinesis Data Streams API requests. The default value is <code>3</code>.
     */

    public void setNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
    }

    /**
     * <p>
     * The maximum number of retries for Kinesis Data Streams API requests. The default value is <code>3</code>.
     * </p>
     * 
     * @return The maximum number of retries for Kinesis Data Streams API requests. The default value is <code>3</code>.
     */

    public Integer getNumRetries() {
        return this.numRetries;
    }

    /**
     * <p>
     * The maximum number of retries for Kinesis Data Streams API requests. The default value is <code>3</code>.
     * </p>
     * 
     * @param numRetries
     *        The maximum number of retries for Kinesis Data Streams API requests. The default value is <code>3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withNumRetries(Integer numRetries) {
        setNumRetries(numRetries);
        return this;
    }

    /**
     * <p>
     * The cool-off time period (specified in ms) before retrying the Kinesis Data Streams API call. The default value
     * is <code>1000</code>.
     * </p>
     * 
     * @param retryIntervalMs
     *        The cool-off time period (specified in ms) before retrying the Kinesis Data Streams API call. The default
     *        value is <code>1000</code>.
     */

    public void setRetryIntervalMs(Long retryIntervalMs) {
        this.retryIntervalMs = retryIntervalMs;
    }

    /**
     * <p>
     * The cool-off time period (specified in ms) before retrying the Kinesis Data Streams API call. The default value
     * is <code>1000</code>.
     * </p>
     * 
     * @return The cool-off time period (specified in ms) before retrying the Kinesis Data Streams API call. The default
     *         value is <code>1000</code>.
     */

    public Long getRetryIntervalMs() {
        return this.retryIntervalMs;
    }

    /**
     * <p>
     * The cool-off time period (specified in ms) before retrying the Kinesis Data Streams API call. The default value
     * is <code>1000</code>.
     * </p>
     * 
     * @param retryIntervalMs
     *        The cool-off time period (specified in ms) before retrying the Kinesis Data Streams API call. The default
     *        value is <code>1000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withRetryIntervalMs(Long retryIntervalMs) {
        setRetryIntervalMs(retryIntervalMs);
        return this;
    }

    /**
     * <p>
     * The maximum cool-off time period (specified in ms) between two retries of a Kinesis Data Streams API call. The
     * default value is <code>10000</code>.
     * </p>
     * 
     * @param maxRetryIntervalMs
     *        The maximum cool-off time period (specified in ms) between two retries of a Kinesis Data Streams API call.
     *        The default value is <code>10000</code>.
     */

    public void setMaxRetryIntervalMs(Long maxRetryIntervalMs) {
        this.maxRetryIntervalMs = maxRetryIntervalMs;
    }

    /**
     * <p>
     * The maximum cool-off time period (specified in ms) between two retries of a Kinesis Data Streams API call. The
     * default value is <code>10000</code>.
     * </p>
     * 
     * @return The maximum cool-off time period (specified in ms) between two retries of a Kinesis Data Streams API
     *         call. The default value is <code>10000</code>.
     */

    public Long getMaxRetryIntervalMs() {
        return this.maxRetryIntervalMs;
    }

    /**
     * <p>
     * The maximum cool-off time period (specified in ms) between two retries of a Kinesis Data Streams API call. The
     * default value is <code>10000</code>.
     * </p>
     * 
     * @param maxRetryIntervalMs
     *        The maximum cool-off time period (specified in ms) between two retries of a Kinesis Data Streams API call.
     *        The default value is <code>10000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withMaxRetryIntervalMs(Long maxRetryIntervalMs) {
        setMaxRetryIntervalMs(maxRetryIntervalMs);
        return this;
    }

    /**
     * <p>
     * Avoids creating an empty microbatch job by checking for unread data in the Kinesis data stream before the batch
     * is started. The default value is <code>"False"</code>.
     * </p>
     * 
     * @param avoidEmptyBatches
     *        Avoids creating an empty microbatch job by checking for unread data in the Kinesis data stream before the
     *        batch is started. The default value is <code>"False"</code>.
     */

    public void setAvoidEmptyBatches(Boolean avoidEmptyBatches) {
        this.avoidEmptyBatches = avoidEmptyBatches;
    }

    /**
     * <p>
     * Avoids creating an empty microbatch job by checking for unread data in the Kinesis data stream before the batch
     * is started. The default value is <code>"False"</code>.
     * </p>
     * 
     * @return Avoids creating an empty microbatch job by checking for unread data in the Kinesis data stream before the
     *         batch is started. The default value is <code>"False"</code>.
     */

    public Boolean getAvoidEmptyBatches() {
        return this.avoidEmptyBatches;
    }

    /**
     * <p>
     * Avoids creating an empty microbatch job by checking for unread data in the Kinesis data stream before the batch
     * is started. The default value is <code>"False"</code>.
     * </p>
     * 
     * @param avoidEmptyBatches
     *        Avoids creating an empty microbatch job by checking for unread data in the Kinesis data stream before the
     *        batch is started. The default value is <code>"False"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withAvoidEmptyBatches(Boolean avoidEmptyBatches) {
        setAvoidEmptyBatches(avoidEmptyBatches);
        return this;
    }

    /**
     * <p>
     * Avoids creating an empty microbatch job by checking for unread data in the Kinesis data stream before the batch
     * is started. The default value is <code>"False"</code>.
     * </p>
     * 
     * @return Avoids creating an empty microbatch job by checking for unread data in the Kinesis data stream before the
     *         batch is started. The default value is <code>"False"</code>.
     */

    public Boolean isAvoidEmptyBatches() {
        return this.avoidEmptyBatches;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) of the Kinesis data stream.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Kinesis data stream.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) of the Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume using AWS Security Token Service (AWS STS). This role must
     * have permissions for describe or read record operations for the Kinesis data stream. You must use this parameter
     * when accessing a data stream in a different account. Used in conjunction with <code>"awsSTSSessionName"</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role to assume using AWS Security Token Service (AWS STS). This role
     *        must have permissions for describe or read record operations for the Kinesis data stream. You must use
     *        this parameter when accessing a data stream in a different account. Used in conjunction with
     *        <code>"awsSTSSessionName"</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume using AWS Security Token Service (AWS STS). This role must
     * have permissions for describe or read record operations for the Kinesis data stream. You must use this parameter
     * when accessing a data stream in a different account. Used in conjunction with <code>"awsSTSSessionName"</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role to assume using AWS Security Token Service (AWS STS). This
     *         role must have permissions for describe or read record operations for the Kinesis data stream. You must
     *         use this parameter when accessing a data stream in a different account. Used in conjunction with
     *         <code>"awsSTSSessionName"</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume using AWS Security Token Service (AWS STS). This role must
     * have permissions for describe or read record operations for the Kinesis data stream. You must use this parameter
     * when accessing a data stream in a different account. Used in conjunction with <code>"awsSTSSessionName"</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role to assume using AWS Security Token Service (AWS STS). This role
     *        must have permissions for describe or read record operations for the Kinesis data stream. You must use
     *        this parameter when accessing a data stream in a different account. Used in conjunction with
     *        <code>"awsSTSSessionName"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An identifier for the session assuming the role using AWS STS. You must use this parameter when accessing a data
     * stream in a different account. Used in conjunction with <code>"awsSTSRoleARN"</code>.
     * </p>
     * 
     * @param roleSessionName
     *        An identifier for the session assuming the role using AWS STS. You must use this parameter when accessing
     *        a data stream in a different account. Used in conjunction with <code>"awsSTSRoleARN"</code>.
     */

    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }

    /**
     * <p>
     * An identifier for the session assuming the role using AWS STS. You must use this parameter when accessing a data
     * stream in a different account. Used in conjunction with <code>"awsSTSRoleARN"</code>.
     * </p>
     * 
     * @return An identifier for the session assuming the role using AWS STS. You must use this parameter when accessing
     *         a data stream in a different account. Used in conjunction with <code>"awsSTSRoleARN"</code>.
     */

    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    /**
     * <p>
     * An identifier for the session assuming the role using AWS STS. You must use this parameter when accessing a data
     * stream in a different account. Used in conjunction with <code>"awsSTSRoleARN"</code>.
     * </p>
     * 
     * @param roleSessionName
     *        An identifier for the session assuming the role using AWS STS. You must use this parameter when accessing
     *        a data stream in a different account. Used in conjunction with <code>"awsSTSRoleARN"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamingSourceOptions withRoleSessionName(String roleSessionName) {
        setRoleSessionName(roleSessionName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpointUrl() != null)
            sb.append("EndpointUrl: ").append(getEndpointUrl()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getClassification() != null)
            sb.append("Classification: ").append(getClassification()).append(",");
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter()).append(",");
        if (getStartingPosition() != null)
            sb.append("StartingPosition: ").append(getStartingPosition()).append(",");
        if (getMaxFetchTimeInMs() != null)
            sb.append("MaxFetchTimeInMs: ").append(getMaxFetchTimeInMs()).append(",");
        if (getMaxFetchRecordsPerShard() != null)
            sb.append("MaxFetchRecordsPerShard: ").append(getMaxFetchRecordsPerShard()).append(",");
        if (getMaxRecordPerRead() != null)
            sb.append("MaxRecordPerRead: ").append(getMaxRecordPerRead()).append(",");
        if (getAddIdleTimeBetweenReads() != null)
            sb.append("AddIdleTimeBetweenReads: ").append(getAddIdleTimeBetweenReads()).append(",");
        if (getIdleTimeBetweenReadsInMs() != null)
            sb.append("IdleTimeBetweenReadsInMs: ").append(getIdleTimeBetweenReadsInMs()).append(",");
        if (getDescribeShardInterval() != null)
            sb.append("DescribeShardInterval: ").append(getDescribeShardInterval()).append(",");
        if (getNumRetries() != null)
            sb.append("NumRetries: ").append(getNumRetries()).append(",");
        if (getRetryIntervalMs() != null)
            sb.append("RetryIntervalMs: ").append(getRetryIntervalMs()).append(",");
        if (getMaxRetryIntervalMs() != null)
            sb.append("MaxRetryIntervalMs: ").append(getMaxRetryIntervalMs()).append(",");
        if (getAvoidEmptyBatches() != null)
            sb.append("AvoidEmptyBatches: ").append(getAvoidEmptyBatches()).append(",");
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRoleSessionName() != null)
            sb.append("RoleSessionName: ").append(getRoleSessionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisStreamingSourceOptions == false)
            return false;
        KinesisStreamingSourceOptions other = (KinesisStreamingSourceOptions) obj;
        if (other.getEndpointUrl() == null ^ this.getEndpointUrl() == null)
            return false;
        if (other.getEndpointUrl() != null && other.getEndpointUrl().equals(this.getEndpointUrl()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getStartingPosition() == null ^ this.getStartingPosition() == null)
            return false;
        if (other.getStartingPosition() != null && other.getStartingPosition().equals(this.getStartingPosition()) == false)
            return false;
        if (other.getMaxFetchTimeInMs() == null ^ this.getMaxFetchTimeInMs() == null)
            return false;
        if (other.getMaxFetchTimeInMs() != null && other.getMaxFetchTimeInMs().equals(this.getMaxFetchTimeInMs()) == false)
            return false;
        if (other.getMaxFetchRecordsPerShard() == null ^ this.getMaxFetchRecordsPerShard() == null)
            return false;
        if (other.getMaxFetchRecordsPerShard() != null && other.getMaxFetchRecordsPerShard().equals(this.getMaxFetchRecordsPerShard()) == false)
            return false;
        if (other.getMaxRecordPerRead() == null ^ this.getMaxRecordPerRead() == null)
            return false;
        if (other.getMaxRecordPerRead() != null && other.getMaxRecordPerRead().equals(this.getMaxRecordPerRead()) == false)
            return false;
        if (other.getAddIdleTimeBetweenReads() == null ^ this.getAddIdleTimeBetweenReads() == null)
            return false;
        if (other.getAddIdleTimeBetweenReads() != null && other.getAddIdleTimeBetweenReads().equals(this.getAddIdleTimeBetweenReads()) == false)
            return false;
        if (other.getIdleTimeBetweenReadsInMs() == null ^ this.getIdleTimeBetweenReadsInMs() == null)
            return false;
        if (other.getIdleTimeBetweenReadsInMs() != null && other.getIdleTimeBetweenReadsInMs().equals(this.getIdleTimeBetweenReadsInMs()) == false)
            return false;
        if (other.getDescribeShardInterval() == null ^ this.getDescribeShardInterval() == null)
            return false;
        if (other.getDescribeShardInterval() != null && other.getDescribeShardInterval().equals(this.getDescribeShardInterval()) == false)
            return false;
        if (other.getNumRetries() == null ^ this.getNumRetries() == null)
            return false;
        if (other.getNumRetries() != null && other.getNumRetries().equals(this.getNumRetries()) == false)
            return false;
        if (other.getRetryIntervalMs() == null ^ this.getRetryIntervalMs() == null)
            return false;
        if (other.getRetryIntervalMs() != null && other.getRetryIntervalMs().equals(this.getRetryIntervalMs()) == false)
            return false;
        if (other.getMaxRetryIntervalMs() == null ^ this.getMaxRetryIntervalMs() == null)
            return false;
        if (other.getMaxRetryIntervalMs() != null && other.getMaxRetryIntervalMs().equals(this.getMaxRetryIntervalMs()) == false)
            return false;
        if (other.getAvoidEmptyBatches() == null ^ this.getAvoidEmptyBatches() == null)
            return false;
        if (other.getAvoidEmptyBatches() != null && other.getAvoidEmptyBatches().equals(this.getAvoidEmptyBatches()) == false)
            return false;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRoleSessionName() == null ^ this.getRoleSessionName() == null)
            return false;
        if (other.getRoleSessionName() != null && other.getRoleSessionName().equals(this.getRoleSessionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointUrl() == null) ? 0 : getEndpointUrl().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getClassification() == null) ? 0 : getClassification().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getStartingPosition() == null) ? 0 : getStartingPosition().hashCode());
        hashCode = prime * hashCode + ((getMaxFetchTimeInMs() == null) ? 0 : getMaxFetchTimeInMs().hashCode());
        hashCode = prime * hashCode + ((getMaxFetchRecordsPerShard() == null) ? 0 : getMaxFetchRecordsPerShard().hashCode());
        hashCode = prime * hashCode + ((getMaxRecordPerRead() == null) ? 0 : getMaxRecordPerRead().hashCode());
        hashCode = prime * hashCode + ((getAddIdleTimeBetweenReads() == null) ? 0 : getAddIdleTimeBetweenReads().hashCode());
        hashCode = prime * hashCode + ((getIdleTimeBetweenReadsInMs() == null) ? 0 : getIdleTimeBetweenReadsInMs().hashCode());
        hashCode = prime * hashCode + ((getDescribeShardInterval() == null) ? 0 : getDescribeShardInterval().hashCode());
        hashCode = prime * hashCode + ((getNumRetries() == null) ? 0 : getNumRetries().hashCode());
        hashCode = prime * hashCode + ((getRetryIntervalMs() == null) ? 0 : getRetryIntervalMs().hashCode());
        hashCode = prime * hashCode + ((getMaxRetryIntervalMs() == null) ? 0 : getMaxRetryIntervalMs().hashCode());
        hashCode = prime * hashCode + ((getAvoidEmptyBatches() == null) ? 0 : getAvoidEmptyBatches().hashCode());
        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRoleSessionName() == null) ? 0 : getRoleSessionName().hashCode());
        return hashCode;
    }

    @Override
    public KinesisStreamingSourceOptions clone() {
        try {
            return (KinesisStreamingSourceOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.KinesisStreamingSourceOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
