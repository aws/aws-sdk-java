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
 * Additional options for streaming.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/KafkaStreamingSourceOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KafkaStreamingSourceOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of bootstrap server URLs, for example, as
     * <code>b-1.vpc-test-2.o4q88o.c6.kafka.us-east-1.amazonaws.com:9094</code>. This option must be specified in the
     * API call or defined in the table metadata in the Data Catalog.
     * </p>
     */
    private String bootstrapServers;
    /**
     * <p>
     * The protocol used to communicate with brokers. The possible values are <code>"SSL"</code> or
     * <code>"PLAINTEXT"</code>.
     * </p>
     */
    private String securityProtocol;
    /**
     * <p>
     * The name of the connection.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The topic name as specified in Apache Kafka. You must specify at least one of <code>"topicName"</code>,
     * <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     */
    private String topicName;
    /**
     * <p>
     * The specific <code>TopicPartitions</code> to consume. You must specify at least one of <code>"topicName"</code>,
     * <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     */
    private String assign;
    /**
     * <p>
     * A Java regex string that identifies the topic list to subscribe to. You must specify at least one of
     * <code>"topicName"</code>, <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     */
    private String subscribePattern;
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
     * The starting position in the Kafka topic to read data from. The possible values are <code>"earliest"</code> or
     * <code>"latest"</code>. The default value is <code>"latest"</code>.
     * </p>
     */
    private String startingOffsets;
    /**
     * <p>
     * The end point when a batch query is ended. Possible values are either <code>"latest"</code> or a JSON string that
     * specifies an ending offset for each <code>TopicPartition</code>.
     * </p>
     */
    private String endingOffsets;
    /**
     * <p>
     * The timeout in milliseconds to poll data from Kafka in Spark job executors. The default value is <code>512</code>
     * .
     * </p>
     */
    private Long pollTimeoutMs;
    /**
     * <p>
     * The number of times to retry before failing to fetch Kafka offsets. The default value is <code>3</code>.
     * </p>
     */
    private Integer numRetries;
    /**
     * <p>
     * The time in milliseconds to wait before retrying to fetch Kafka offsets. The default value is <code>10</code>.
     * </p>
     */
    private Long retryIntervalMs;
    /**
     * <p>
     * The rate limit on the maximum number of offsets that are processed per trigger interval. The specified total
     * number of offsets is proportionally split across <code>topicPartitions</code> of different volumes. The default
     * value is null, which means that the consumer reads all offsets until the known latest offset.
     * </p>
     */
    private Long maxOffsetsPerTrigger;
    /**
     * <p>
     * The desired minimum number of partitions to read from Kafka. The default value is null, which means that the
     * number of spark partitions is equal to the number of Kafka partitions.
     * </p>
     */
    private Integer minPartitions;

    /**
     * <p>
     * A list of bootstrap server URLs, for example, as
     * <code>b-1.vpc-test-2.o4q88o.c6.kafka.us-east-1.amazonaws.com:9094</code>. This option must be specified in the
     * API call or defined in the table metadata in the Data Catalog.
     * </p>
     * 
     * @param bootstrapServers
     *        A list of bootstrap server URLs, for example, as
     *        <code>b-1.vpc-test-2.o4q88o.c6.kafka.us-east-1.amazonaws.com:9094</code>. This option must be specified in
     *        the API call or defined in the table metadata in the Data Catalog.
     */

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    /**
     * <p>
     * A list of bootstrap server URLs, for example, as
     * <code>b-1.vpc-test-2.o4q88o.c6.kafka.us-east-1.amazonaws.com:9094</code>. This option must be specified in the
     * API call or defined in the table metadata in the Data Catalog.
     * </p>
     * 
     * @return A list of bootstrap server URLs, for example, as
     *         <code>b-1.vpc-test-2.o4q88o.c6.kafka.us-east-1.amazonaws.com:9094</code>. This option must be specified
     *         in the API call or defined in the table metadata in the Data Catalog.
     */

    public String getBootstrapServers() {
        return this.bootstrapServers;
    }

    /**
     * <p>
     * A list of bootstrap server URLs, for example, as
     * <code>b-1.vpc-test-2.o4q88o.c6.kafka.us-east-1.amazonaws.com:9094</code>. This option must be specified in the
     * API call or defined in the table metadata in the Data Catalog.
     * </p>
     * 
     * @param bootstrapServers
     *        A list of bootstrap server URLs, for example, as
     *        <code>b-1.vpc-test-2.o4q88o.c6.kafka.us-east-1.amazonaws.com:9094</code>. This option must be specified in
     *        the API call or defined in the table metadata in the Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withBootstrapServers(String bootstrapServers) {
        setBootstrapServers(bootstrapServers);
        return this;
    }

    /**
     * <p>
     * The protocol used to communicate with brokers. The possible values are <code>"SSL"</code> or
     * <code>"PLAINTEXT"</code>.
     * </p>
     * 
     * @param securityProtocol
     *        The protocol used to communicate with brokers. The possible values are <code>"SSL"</code> or
     *        <code>"PLAINTEXT"</code>.
     */

    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    /**
     * <p>
     * The protocol used to communicate with brokers. The possible values are <code>"SSL"</code> or
     * <code>"PLAINTEXT"</code>.
     * </p>
     * 
     * @return The protocol used to communicate with brokers. The possible values are <code>"SSL"</code> or
     *         <code>"PLAINTEXT"</code>.
     */

    public String getSecurityProtocol() {
        return this.securityProtocol;
    }

    /**
     * <p>
     * The protocol used to communicate with brokers. The possible values are <code>"SSL"</code> or
     * <code>"PLAINTEXT"</code>.
     * </p>
     * 
     * @param securityProtocol
     *        The protocol used to communicate with brokers. The possible values are <code>"SSL"</code> or
     *        <code>"PLAINTEXT"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withSecurityProtocol(String securityProtocol) {
        setSecurityProtocol(securityProtocol);
        return this;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * 
     * @return The name of the connection.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The topic name as specified in Apache Kafka. You must specify at least one of <code>"topicName"</code>,
     * <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     * 
     * @param topicName
     *        The topic name as specified in Apache Kafka. You must specify at least one of <code>"topicName"</code>,
     *        <code>"assign"</code> or <code>"subscribePattern"</code>.
     */

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The topic name as specified in Apache Kafka. You must specify at least one of <code>"topicName"</code>,
     * <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     * 
     * @return The topic name as specified in Apache Kafka. You must specify at least one of <code>"topicName"</code>,
     *         <code>"assign"</code> or <code>"subscribePattern"</code>.
     */

    public String getTopicName() {
        return this.topicName;
    }

    /**
     * <p>
     * The topic name as specified in Apache Kafka. You must specify at least one of <code>"topicName"</code>,
     * <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     * 
     * @param topicName
     *        The topic name as specified in Apache Kafka. You must specify at least one of <code>"topicName"</code>,
     *        <code>"assign"</code> or <code>"subscribePattern"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withTopicName(String topicName) {
        setTopicName(topicName);
        return this;
    }

    /**
     * <p>
     * The specific <code>TopicPartitions</code> to consume. You must specify at least one of <code>"topicName"</code>,
     * <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     * 
     * @param assign
     *        The specific <code>TopicPartitions</code> to consume. You must specify at least one of
     *        <code>"topicName"</code>, <code>"assign"</code> or <code>"subscribePattern"</code>.
     */

    public void setAssign(String assign) {
        this.assign = assign;
    }

    /**
     * <p>
     * The specific <code>TopicPartitions</code> to consume. You must specify at least one of <code>"topicName"</code>,
     * <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     * 
     * @return The specific <code>TopicPartitions</code> to consume. You must specify at least one of
     *         <code>"topicName"</code>, <code>"assign"</code> or <code>"subscribePattern"</code>.
     */

    public String getAssign() {
        return this.assign;
    }

    /**
     * <p>
     * The specific <code>TopicPartitions</code> to consume. You must specify at least one of <code>"topicName"</code>,
     * <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     * 
     * @param assign
     *        The specific <code>TopicPartitions</code> to consume. You must specify at least one of
     *        <code>"topicName"</code>, <code>"assign"</code> or <code>"subscribePattern"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withAssign(String assign) {
        setAssign(assign);
        return this;
    }

    /**
     * <p>
     * A Java regex string that identifies the topic list to subscribe to. You must specify at least one of
     * <code>"topicName"</code>, <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     * 
     * @param subscribePattern
     *        A Java regex string that identifies the topic list to subscribe to. You must specify at least one of
     *        <code>"topicName"</code>, <code>"assign"</code> or <code>"subscribePattern"</code>.
     */

    public void setSubscribePattern(String subscribePattern) {
        this.subscribePattern = subscribePattern;
    }

    /**
     * <p>
     * A Java regex string that identifies the topic list to subscribe to. You must specify at least one of
     * <code>"topicName"</code>, <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     * 
     * @return A Java regex string that identifies the topic list to subscribe to. You must specify at least one of
     *         <code>"topicName"</code>, <code>"assign"</code> or <code>"subscribePattern"</code>.
     */

    public String getSubscribePattern() {
        return this.subscribePattern;
    }

    /**
     * <p>
     * A Java regex string that identifies the topic list to subscribe to. You must specify at least one of
     * <code>"topicName"</code>, <code>"assign"</code> or <code>"subscribePattern"</code>.
     * </p>
     * 
     * @param subscribePattern
     *        A Java regex string that identifies the topic list to subscribe to. You must specify at least one of
     *        <code>"topicName"</code>, <code>"assign"</code> or <code>"subscribePattern"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withSubscribePattern(String subscribePattern) {
        setSubscribePattern(subscribePattern);
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

    public KafkaStreamingSourceOptions withClassification(String classification) {
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

    public KafkaStreamingSourceOptions withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * <p>
     * The starting position in the Kafka topic to read data from. The possible values are <code>"earliest"</code> or
     * <code>"latest"</code>. The default value is <code>"latest"</code>.
     * </p>
     * 
     * @param startingOffsets
     *        The starting position in the Kafka topic to read data from. The possible values are
     *        <code>"earliest"</code> or <code>"latest"</code>. The default value is <code>"latest"</code>.
     */

    public void setStartingOffsets(String startingOffsets) {
        this.startingOffsets = startingOffsets;
    }

    /**
     * <p>
     * The starting position in the Kafka topic to read data from. The possible values are <code>"earliest"</code> or
     * <code>"latest"</code>. The default value is <code>"latest"</code>.
     * </p>
     * 
     * @return The starting position in the Kafka topic to read data from. The possible values are
     *         <code>"earliest"</code> or <code>"latest"</code>. The default value is <code>"latest"</code>.
     */

    public String getStartingOffsets() {
        return this.startingOffsets;
    }

    /**
     * <p>
     * The starting position in the Kafka topic to read data from. The possible values are <code>"earliest"</code> or
     * <code>"latest"</code>. The default value is <code>"latest"</code>.
     * </p>
     * 
     * @param startingOffsets
     *        The starting position in the Kafka topic to read data from. The possible values are
     *        <code>"earliest"</code> or <code>"latest"</code>. The default value is <code>"latest"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withStartingOffsets(String startingOffsets) {
        setStartingOffsets(startingOffsets);
        return this;
    }

    /**
     * <p>
     * The end point when a batch query is ended. Possible values are either <code>"latest"</code> or a JSON string that
     * specifies an ending offset for each <code>TopicPartition</code>.
     * </p>
     * 
     * @param endingOffsets
     *        The end point when a batch query is ended. Possible values are either <code>"latest"</code> or a JSON
     *        string that specifies an ending offset for each <code>TopicPartition</code>.
     */

    public void setEndingOffsets(String endingOffsets) {
        this.endingOffsets = endingOffsets;
    }

    /**
     * <p>
     * The end point when a batch query is ended. Possible values are either <code>"latest"</code> or a JSON string that
     * specifies an ending offset for each <code>TopicPartition</code>.
     * </p>
     * 
     * @return The end point when a batch query is ended. Possible values are either <code>"latest"</code> or a JSON
     *         string that specifies an ending offset for each <code>TopicPartition</code>.
     */

    public String getEndingOffsets() {
        return this.endingOffsets;
    }

    /**
     * <p>
     * The end point when a batch query is ended. Possible values are either <code>"latest"</code> or a JSON string that
     * specifies an ending offset for each <code>TopicPartition</code>.
     * </p>
     * 
     * @param endingOffsets
     *        The end point when a batch query is ended. Possible values are either <code>"latest"</code> or a JSON
     *        string that specifies an ending offset for each <code>TopicPartition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withEndingOffsets(String endingOffsets) {
        setEndingOffsets(endingOffsets);
        return this;
    }

    /**
     * <p>
     * The timeout in milliseconds to poll data from Kafka in Spark job executors. The default value is <code>512</code>
     * .
     * </p>
     * 
     * @param pollTimeoutMs
     *        The timeout in milliseconds to poll data from Kafka in Spark job executors. The default value is
     *        <code>512</code>.
     */

    public void setPollTimeoutMs(Long pollTimeoutMs) {
        this.pollTimeoutMs = pollTimeoutMs;
    }

    /**
     * <p>
     * The timeout in milliseconds to poll data from Kafka in Spark job executors. The default value is <code>512</code>
     * .
     * </p>
     * 
     * @return The timeout in milliseconds to poll data from Kafka in Spark job executors. The default value is
     *         <code>512</code>.
     */

    public Long getPollTimeoutMs() {
        return this.pollTimeoutMs;
    }

    /**
     * <p>
     * The timeout in milliseconds to poll data from Kafka in Spark job executors. The default value is <code>512</code>
     * .
     * </p>
     * 
     * @param pollTimeoutMs
     *        The timeout in milliseconds to poll data from Kafka in Spark job executors. The default value is
     *        <code>512</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withPollTimeoutMs(Long pollTimeoutMs) {
        setPollTimeoutMs(pollTimeoutMs);
        return this;
    }

    /**
     * <p>
     * The number of times to retry before failing to fetch Kafka offsets. The default value is <code>3</code>.
     * </p>
     * 
     * @param numRetries
     *        The number of times to retry before failing to fetch Kafka offsets. The default value is <code>3</code>.
     */

    public void setNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
    }

    /**
     * <p>
     * The number of times to retry before failing to fetch Kafka offsets. The default value is <code>3</code>.
     * </p>
     * 
     * @return The number of times to retry before failing to fetch Kafka offsets. The default value is <code>3</code>.
     */

    public Integer getNumRetries() {
        return this.numRetries;
    }

    /**
     * <p>
     * The number of times to retry before failing to fetch Kafka offsets. The default value is <code>3</code>.
     * </p>
     * 
     * @param numRetries
     *        The number of times to retry before failing to fetch Kafka offsets. The default value is <code>3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withNumRetries(Integer numRetries) {
        setNumRetries(numRetries);
        return this;
    }

    /**
     * <p>
     * The time in milliseconds to wait before retrying to fetch Kafka offsets. The default value is <code>10</code>.
     * </p>
     * 
     * @param retryIntervalMs
     *        The time in milliseconds to wait before retrying to fetch Kafka offsets. The default value is
     *        <code>10</code>.
     */

    public void setRetryIntervalMs(Long retryIntervalMs) {
        this.retryIntervalMs = retryIntervalMs;
    }

    /**
     * <p>
     * The time in milliseconds to wait before retrying to fetch Kafka offsets. The default value is <code>10</code>.
     * </p>
     * 
     * @return The time in milliseconds to wait before retrying to fetch Kafka offsets. The default value is
     *         <code>10</code>.
     */

    public Long getRetryIntervalMs() {
        return this.retryIntervalMs;
    }

    /**
     * <p>
     * The time in milliseconds to wait before retrying to fetch Kafka offsets. The default value is <code>10</code>.
     * </p>
     * 
     * @param retryIntervalMs
     *        The time in milliseconds to wait before retrying to fetch Kafka offsets. The default value is
     *        <code>10</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withRetryIntervalMs(Long retryIntervalMs) {
        setRetryIntervalMs(retryIntervalMs);
        return this;
    }

    /**
     * <p>
     * The rate limit on the maximum number of offsets that are processed per trigger interval. The specified total
     * number of offsets is proportionally split across <code>topicPartitions</code> of different volumes. The default
     * value is null, which means that the consumer reads all offsets until the known latest offset.
     * </p>
     * 
     * @param maxOffsetsPerTrigger
     *        The rate limit on the maximum number of offsets that are processed per trigger interval. The specified
     *        total number of offsets is proportionally split across <code>topicPartitions</code> of different volumes.
     *        The default value is null, which means that the consumer reads all offsets until the known latest offset.
     */

    public void setMaxOffsetsPerTrigger(Long maxOffsetsPerTrigger) {
        this.maxOffsetsPerTrigger = maxOffsetsPerTrigger;
    }

    /**
     * <p>
     * The rate limit on the maximum number of offsets that are processed per trigger interval. The specified total
     * number of offsets is proportionally split across <code>topicPartitions</code> of different volumes. The default
     * value is null, which means that the consumer reads all offsets until the known latest offset.
     * </p>
     * 
     * @return The rate limit on the maximum number of offsets that are processed per trigger interval. The specified
     *         total number of offsets is proportionally split across <code>topicPartitions</code> of different volumes.
     *         The default value is null, which means that the consumer reads all offsets until the known latest offset.
     */

    public Long getMaxOffsetsPerTrigger() {
        return this.maxOffsetsPerTrigger;
    }

    /**
     * <p>
     * The rate limit on the maximum number of offsets that are processed per trigger interval. The specified total
     * number of offsets is proportionally split across <code>topicPartitions</code> of different volumes. The default
     * value is null, which means that the consumer reads all offsets until the known latest offset.
     * </p>
     * 
     * @param maxOffsetsPerTrigger
     *        The rate limit on the maximum number of offsets that are processed per trigger interval. The specified
     *        total number of offsets is proportionally split across <code>topicPartitions</code> of different volumes.
     *        The default value is null, which means that the consumer reads all offsets until the known latest offset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withMaxOffsetsPerTrigger(Long maxOffsetsPerTrigger) {
        setMaxOffsetsPerTrigger(maxOffsetsPerTrigger);
        return this;
    }

    /**
     * <p>
     * The desired minimum number of partitions to read from Kafka. The default value is null, which means that the
     * number of spark partitions is equal to the number of Kafka partitions.
     * </p>
     * 
     * @param minPartitions
     *        The desired minimum number of partitions to read from Kafka. The default value is null, which means that
     *        the number of spark partitions is equal to the number of Kafka partitions.
     */

    public void setMinPartitions(Integer minPartitions) {
        this.minPartitions = minPartitions;
    }

    /**
     * <p>
     * The desired minimum number of partitions to read from Kafka. The default value is null, which means that the
     * number of spark partitions is equal to the number of Kafka partitions.
     * </p>
     * 
     * @return The desired minimum number of partitions to read from Kafka. The default value is null, which means that
     *         the number of spark partitions is equal to the number of Kafka partitions.
     */

    public Integer getMinPartitions() {
        return this.minPartitions;
    }

    /**
     * <p>
     * The desired minimum number of partitions to read from Kafka. The default value is null, which means that the
     * number of spark partitions is equal to the number of Kafka partitions.
     * </p>
     * 
     * @param minPartitions
     *        The desired minimum number of partitions to read from Kafka. The default value is null, which means that
     *        the number of spark partitions is equal to the number of Kafka partitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaStreamingSourceOptions withMinPartitions(Integer minPartitions) {
        setMinPartitions(minPartitions);
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
        if (getBootstrapServers() != null)
            sb.append("BootstrapServers: ").append(getBootstrapServers()).append(",");
        if (getSecurityProtocol() != null)
            sb.append("SecurityProtocol: ").append(getSecurityProtocol()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getTopicName() != null)
            sb.append("TopicName: ").append(getTopicName()).append(",");
        if (getAssign() != null)
            sb.append("Assign: ").append(getAssign()).append(",");
        if (getSubscribePattern() != null)
            sb.append("SubscribePattern: ").append(getSubscribePattern()).append(",");
        if (getClassification() != null)
            sb.append("Classification: ").append(getClassification()).append(",");
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter()).append(",");
        if (getStartingOffsets() != null)
            sb.append("StartingOffsets: ").append(getStartingOffsets()).append(",");
        if (getEndingOffsets() != null)
            sb.append("EndingOffsets: ").append(getEndingOffsets()).append(",");
        if (getPollTimeoutMs() != null)
            sb.append("PollTimeoutMs: ").append(getPollTimeoutMs()).append(",");
        if (getNumRetries() != null)
            sb.append("NumRetries: ").append(getNumRetries()).append(",");
        if (getRetryIntervalMs() != null)
            sb.append("RetryIntervalMs: ").append(getRetryIntervalMs()).append(",");
        if (getMaxOffsetsPerTrigger() != null)
            sb.append("MaxOffsetsPerTrigger: ").append(getMaxOffsetsPerTrigger()).append(",");
        if (getMinPartitions() != null)
            sb.append("MinPartitions: ").append(getMinPartitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaStreamingSourceOptions == false)
            return false;
        KafkaStreamingSourceOptions other = (KafkaStreamingSourceOptions) obj;
        if (other.getBootstrapServers() == null ^ this.getBootstrapServers() == null)
            return false;
        if (other.getBootstrapServers() != null && other.getBootstrapServers().equals(this.getBootstrapServers()) == false)
            return false;
        if (other.getSecurityProtocol() == null ^ this.getSecurityProtocol() == null)
            return false;
        if (other.getSecurityProtocol() != null && other.getSecurityProtocol().equals(this.getSecurityProtocol()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        if (other.getAssign() == null ^ this.getAssign() == null)
            return false;
        if (other.getAssign() != null && other.getAssign().equals(this.getAssign()) == false)
            return false;
        if (other.getSubscribePattern() == null ^ this.getSubscribePattern() == null)
            return false;
        if (other.getSubscribePattern() != null && other.getSubscribePattern().equals(this.getSubscribePattern()) == false)
            return false;
        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getStartingOffsets() == null ^ this.getStartingOffsets() == null)
            return false;
        if (other.getStartingOffsets() != null && other.getStartingOffsets().equals(this.getStartingOffsets()) == false)
            return false;
        if (other.getEndingOffsets() == null ^ this.getEndingOffsets() == null)
            return false;
        if (other.getEndingOffsets() != null && other.getEndingOffsets().equals(this.getEndingOffsets()) == false)
            return false;
        if (other.getPollTimeoutMs() == null ^ this.getPollTimeoutMs() == null)
            return false;
        if (other.getPollTimeoutMs() != null && other.getPollTimeoutMs().equals(this.getPollTimeoutMs()) == false)
            return false;
        if (other.getNumRetries() == null ^ this.getNumRetries() == null)
            return false;
        if (other.getNumRetries() != null && other.getNumRetries().equals(this.getNumRetries()) == false)
            return false;
        if (other.getRetryIntervalMs() == null ^ this.getRetryIntervalMs() == null)
            return false;
        if (other.getRetryIntervalMs() != null && other.getRetryIntervalMs().equals(this.getRetryIntervalMs()) == false)
            return false;
        if (other.getMaxOffsetsPerTrigger() == null ^ this.getMaxOffsetsPerTrigger() == null)
            return false;
        if (other.getMaxOffsetsPerTrigger() != null && other.getMaxOffsetsPerTrigger().equals(this.getMaxOffsetsPerTrigger()) == false)
            return false;
        if (other.getMinPartitions() == null ^ this.getMinPartitions() == null)
            return false;
        if (other.getMinPartitions() != null && other.getMinPartitions().equals(this.getMinPartitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBootstrapServers() == null) ? 0 : getBootstrapServers().hashCode());
        hashCode = prime * hashCode + ((getSecurityProtocol() == null) ? 0 : getSecurityProtocol().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        hashCode = prime * hashCode + ((getAssign() == null) ? 0 : getAssign().hashCode());
        hashCode = prime * hashCode + ((getSubscribePattern() == null) ? 0 : getSubscribePattern().hashCode());
        hashCode = prime * hashCode + ((getClassification() == null) ? 0 : getClassification().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getStartingOffsets() == null) ? 0 : getStartingOffsets().hashCode());
        hashCode = prime * hashCode + ((getEndingOffsets() == null) ? 0 : getEndingOffsets().hashCode());
        hashCode = prime * hashCode + ((getPollTimeoutMs() == null) ? 0 : getPollTimeoutMs().hashCode());
        hashCode = prime * hashCode + ((getNumRetries() == null) ? 0 : getNumRetries().hashCode());
        hashCode = prime * hashCode + ((getRetryIntervalMs() == null) ? 0 : getRetryIntervalMs().hashCode());
        hashCode = prime * hashCode + ((getMaxOffsetsPerTrigger() == null) ? 0 : getMaxOffsetsPerTrigger().hashCode());
        hashCode = prime * hashCode + ((getMinPartitions() == null) ? 0 : getMinPartitions().hashCode());
        return hashCode;
    }

    @Override
    public KafkaStreamingSourceOptions clone() {
        try {
            return (KafkaStreamingSourceOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.KafkaStreamingSourceOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
