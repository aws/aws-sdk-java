/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that describes an Apache Kafka endpoint. This information includes the output format of records
 * applied to the endpoint and details of transaction and control table data information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/KafkaSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KafkaSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     */
    private String broker;
    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     * <code>"kafka-default-topic"</code> as the migration topic.
     * </p>
     */
    private String topic;
    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code> (default) or
     * <code>JSON_UNFORMATTED</code> (a single line with no tab).
     * </p>
     */
    private String messageFormat;
    /**
     * <p>
     * Provides detailed transaction information from the source database. This information includes a commit timestamp,
     * a log position, and values for <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a transaction). The default is <code>false</code>.
     * </p>
     */
    private Boolean includeTransactionDetails;
    /**
     * <p>
     * Shows the partition value within the Kafka message output, unless the partition type is
     * <code>schema-table-type</code>. The default is <code>false</code>.
     * </p>
     */
    private Boolean includePartitionValue;
    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition type is <code>primary-key-type</code>.
     * Doing this increases data distribution among Kafka partitions. For example, suppose that a SysBench schema has
     * thousands of tables and each table has only limited range for a primary key. In this case, the same primary key
     * is sent from thousands of tables to the same partition, which causes throttling. The default is
     * <code>false</code>.
     * </p>
     */
    private Boolean partitionIncludeSchemaTable;
    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the table in the control data, such as
     * <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     * <code>rename-column</code>. The default is <code>false</code>.
     * </p>
     */
    private Boolean includeTableAlterOperations;
    /**
     * <p>
     * Shows detailed control information for table definition, column definition, and table and column changes in the
     * Kafka message output. The default is <code>false</code>.
     * </p>
     */
    private Boolean includeControlDetails;
    /**
     * <p>
     * The maximum size in bytes for records created on the endpoint The default is 1,000,000.
     * </p>
     */
    private Integer messageMaxBytes;
    /**
     * <p>
     * Include NULL and empty columns for records migrated to the endpoint. The default is <code>false</code>.
     * </p>
     */
    private Boolean includeNullAndEmpty;

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     * 
     * @param broker
     *        The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the
     *        form <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     *        <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     */

    public void setBroker(String broker) {
        this.broker = broker;
    }

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     * 
     * @return The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in
     *         the form <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     *         <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     */

    public String getBroker() {
        return this.broker;
    }

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     * 
     * @param broker
     *        The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the
     *        form <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     *        <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withBroker(String broker) {
        setBroker(broker);
        return this;
    }

    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     * <code>"kafka-default-topic"</code> as the migration topic.
     * </p>
     * 
     * @param topic
     *        The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     *        <code>"kafka-default-topic"</code> as the migration topic.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     * <code>"kafka-default-topic"</code> as the migration topic.
     * </p>
     * 
     * @return The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     *         <code>"kafka-default-topic"</code> as the migration topic.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     * <code>"kafka-default-topic"</code> as the migration topic.
     * </p>
     * 
     * @param topic
     *        The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     *        <code>"kafka-default-topic"</code> as the migration topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code> (default) or
     * <code>JSON_UNFORMATTED</code> (a single line with no tab).
     * </p>
     * 
     * @param messageFormat
     *        The output format for the records created on the endpoint. The message format is <code>JSON</code>
     *        (default) or <code>JSON_UNFORMATTED</code> (a single line with no tab).
     * @see MessageFormatValue
     */

    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code> (default) or
     * <code>JSON_UNFORMATTED</code> (a single line with no tab).
     * </p>
     * 
     * @return The output format for the records created on the endpoint. The message format is <code>JSON</code>
     *         (default) or <code>JSON_UNFORMATTED</code> (a single line with no tab).
     * @see MessageFormatValue
     */

    public String getMessageFormat() {
        return this.messageFormat;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code> (default) or
     * <code>JSON_UNFORMATTED</code> (a single line with no tab).
     * </p>
     * 
     * @param messageFormat
     *        The output format for the records created on the endpoint. The message format is <code>JSON</code>
     *        (default) or <code>JSON_UNFORMATTED</code> (a single line with no tab).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormatValue
     */

    public KafkaSettings withMessageFormat(String messageFormat) {
        setMessageFormat(messageFormat);
        return this;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code> (default) or
     * <code>JSON_UNFORMATTED</code> (a single line with no tab).
     * </p>
     * 
     * @param messageFormat
     *        The output format for the records created on the endpoint. The message format is <code>JSON</code>
     *        (default) or <code>JSON_UNFORMATTED</code> (a single line with no tab).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageFormatValue
     */

    public KafkaSettings withMessageFormat(MessageFormatValue messageFormat) {
        this.messageFormat = messageFormat.toString();
        return this;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This information includes a commit timestamp,
     * a log position, and values for <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a transaction). The default is <code>false</code>.
     * </p>
     * 
     * @param includeTransactionDetails
     *        Provides detailed transaction information from the source database. This information includes a commit
     *        timestamp, a log position, and values for <code>transaction_id</code>, previous
     *        <code>transaction_id</code>, and <code>transaction_record_id</code> (the record offset within a
     *        transaction). The default is <code>false</code>.
     */

    public void setIncludeTransactionDetails(Boolean includeTransactionDetails) {
        this.includeTransactionDetails = includeTransactionDetails;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This information includes a commit timestamp,
     * a log position, and values for <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a transaction). The default is <code>false</code>.
     * </p>
     * 
     * @return Provides detailed transaction information from the source database. This information includes a commit
     *         timestamp, a log position, and values for <code>transaction_id</code>, previous
     *         <code>transaction_id</code>, and <code>transaction_record_id</code> (the record offset within a
     *         transaction). The default is <code>false</code>.
     */

    public Boolean getIncludeTransactionDetails() {
        return this.includeTransactionDetails;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This information includes a commit timestamp,
     * a log position, and values for <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a transaction). The default is <code>false</code>.
     * </p>
     * 
     * @param includeTransactionDetails
     *        Provides detailed transaction information from the source database. This information includes a commit
     *        timestamp, a log position, and values for <code>transaction_id</code>, previous
     *        <code>transaction_id</code>, and <code>transaction_record_id</code> (the record offset within a
     *        transaction). The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withIncludeTransactionDetails(Boolean includeTransactionDetails) {
        setIncludeTransactionDetails(includeTransactionDetails);
        return this;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This information includes a commit timestamp,
     * a log position, and values for <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a transaction). The default is <code>false</code>.
     * </p>
     * 
     * @return Provides detailed transaction information from the source database. This information includes a commit
     *         timestamp, a log position, and values for <code>transaction_id</code>, previous
     *         <code>transaction_id</code>, and <code>transaction_record_id</code> (the record offset within a
     *         transaction). The default is <code>false</code>.
     */

    public Boolean isIncludeTransactionDetails() {
        return this.includeTransactionDetails;
    }

    /**
     * <p>
     * Shows the partition value within the Kafka message output, unless the partition type is
     * <code>schema-table-type</code>. The default is <code>false</code>.
     * </p>
     * 
     * @param includePartitionValue
     *        Shows the partition value within the Kafka message output, unless the partition type is
     *        <code>schema-table-type</code>. The default is <code>false</code>.
     */

    public void setIncludePartitionValue(Boolean includePartitionValue) {
        this.includePartitionValue = includePartitionValue;
    }

    /**
     * <p>
     * Shows the partition value within the Kafka message output, unless the partition type is
     * <code>schema-table-type</code>. The default is <code>false</code>.
     * </p>
     * 
     * @return Shows the partition value within the Kafka message output, unless the partition type is
     *         <code>schema-table-type</code>. The default is <code>false</code>.
     */

    public Boolean getIncludePartitionValue() {
        return this.includePartitionValue;
    }

    /**
     * <p>
     * Shows the partition value within the Kafka message output, unless the partition type is
     * <code>schema-table-type</code>. The default is <code>false</code>.
     * </p>
     * 
     * @param includePartitionValue
     *        Shows the partition value within the Kafka message output, unless the partition type is
     *        <code>schema-table-type</code>. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withIncludePartitionValue(Boolean includePartitionValue) {
        setIncludePartitionValue(includePartitionValue);
        return this;
    }

    /**
     * <p>
     * Shows the partition value within the Kafka message output, unless the partition type is
     * <code>schema-table-type</code>. The default is <code>false</code>.
     * </p>
     * 
     * @return Shows the partition value within the Kafka message output, unless the partition type is
     *         <code>schema-table-type</code>. The default is <code>false</code>.
     */

    public Boolean isIncludePartitionValue() {
        return this.includePartitionValue;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition type is <code>primary-key-type</code>.
     * Doing this increases data distribution among Kafka partitions. For example, suppose that a SysBench schema has
     * thousands of tables and each table has only limited range for a primary key. In this case, the same primary key
     * is sent from thousands of tables to the same partition, which causes throttling. The default is
     * <code>false</code>.
     * </p>
     * 
     * @param partitionIncludeSchemaTable
     *        Prefixes schema and table names to partition values, when the partition type is
     *        <code>primary-key-type</code>. Doing this increases data distribution among Kafka partitions. For example,
     *        suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary
     *        key. In this case, the same primary key is sent from thousands of tables to the same partition, which
     *        causes throttling. The default is <code>false</code>.
     */

    public void setPartitionIncludeSchemaTable(Boolean partitionIncludeSchemaTable) {
        this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition type is <code>primary-key-type</code>.
     * Doing this increases data distribution among Kafka partitions. For example, suppose that a SysBench schema has
     * thousands of tables and each table has only limited range for a primary key. In this case, the same primary key
     * is sent from thousands of tables to the same partition, which causes throttling. The default is
     * <code>false</code>.
     * </p>
     * 
     * @return Prefixes schema and table names to partition values, when the partition type is
     *         <code>primary-key-type</code>. Doing this increases data distribution among Kafka partitions. For
     *         example, suppose that a SysBench schema has thousands of tables and each table has only limited range for
     *         a primary key. In this case, the same primary key is sent from thousands of tables to the same partition,
     *         which causes throttling. The default is <code>false</code>.
     */

    public Boolean getPartitionIncludeSchemaTable() {
        return this.partitionIncludeSchemaTable;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition type is <code>primary-key-type</code>.
     * Doing this increases data distribution among Kafka partitions. For example, suppose that a SysBench schema has
     * thousands of tables and each table has only limited range for a primary key. In this case, the same primary key
     * is sent from thousands of tables to the same partition, which causes throttling. The default is
     * <code>false</code>.
     * </p>
     * 
     * @param partitionIncludeSchemaTable
     *        Prefixes schema and table names to partition values, when the partition type is
     *        <code>primary-key-type</code>. Doing this increases data distribution among Kafka partitions. For example,
     *        suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary
     *        key. In this case, the same primary key is sent from thousands of tables to the same partition, which
     *        causes throttling. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withPartitionIncludeSchemaTable(Boolean partitionIncludeSchemaTable) {
        setPartitionIncludeSchemaTable(partitionIncludeSchemaTable);
        return this;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition type is <code>primary-key-type</code>.
     * Doing this increases data distribution among Kafka partitions. For example, suppose that a SysBench schema has
     * thousands of tables and each table has only limited range for a primary key. In this case, the same primary key
     * is sent from thousands of tables to the same partition, which causes throttling. The default is
     * <code>false</code>.
     * </p>
     * 
     * @return Prefixes schema and table names to partition values, when the partition type is
     *         <code>primary-key-type</code>. Doing this increases data distribution among Kafka partitions. For
     *         example, suppose that a SysBench schema has thousands of tables and each table has only limited range for
     *         a primary key. In this case, the same primary key is sent from thousands of tables to the same partition,
     *         which causes throttling. The default is <code>false</code>.
     */

    public Boolean isPartitionIncludeSchemaTable() {
        return this.partitionIncludeSchemaTable;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the table in the control data, such as
     * <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     * <code>rename-column</code>. The default is <code>false</code>.
     * </p>
     * 
     * @param includeTableAlterOperations
     *        Includes any data definition language (DDL) operations that change the table in the control data, such as
     *        <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     *        <code>rename-column</code>. The default is <code>false</code>.
     */

    public void setIncludeTableAlterOperations(Boolean includeTableAlterOperations) {
        this.includeTableAlterOperations = includeTableAlterOperations;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the table in the control data, such as
     * <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     * <code>rename-column</code>. The default is <code>false</code>.
     * </p>
     * 
     * @return Includes any data definition language (DDL) operations that change the table in the control data, such as
     *         <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>,
     *         and <code>rename-column</code>. The default is <code>false</code>.
     */

    public Boolean getIncludeTableAlterOperations() {
        return this.includeTableAlterOperations;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the table in the control data, such as
     * <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     * <code>rename-column</code>. The default is <code>false</code>.
     * </p>
     * 
     * @param includeTableAlterOperations
     *        Includes any data definition language (DDL) operations that change the table in the control data, such as
     *        <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     *        <code>rename-column</code>. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withIncludeTableAlterOperations(Boolean includeTableAlterOperations) {
        setIncludeTableAlterOperations(includeTableAlterOperations);
        return this;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the table in the control data, such as
     * <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     * <code>rename-column</code>. The default is <code>false</code>.
     * </p>
     * 
     * @return Includes any data definition language (DDL) operations that change the table in the control data, such as
     *         <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>,
     *         and <code>rename-column</code>. The default is <code>false</code>.
     */

    public Boolean isIncludeTableAlterOperations() {
        return this.includeTableAlterOperations;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column definition, and table and column changes in the
     * Kafka message output. The default is <code>false</code>.
     * </p>
     * 
     * @param includeControlDetails
     *        Shows detailed control information for table definition, column definition, and table and column changes
     *        in the Kafka message output. The default is <code>false</code>.
     */

    public void setIncludeControlDetails(Boolean includeControlDetails) {
        this.includeControlDetails = includeControlDetails;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column definition, and table and column changes in the
     * Kafka message output. The default is <code>false</code>.
     * </p>
     * 
     * @return Shows detailed control information for table definition, column definition, and table and column changes
     *         in the Kafka message output. The default is <code>false</code>.
     */

    public Boolean getIncludeControlDetails() {
        return this.includeControlDetails;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column definition, and table and column changes in the
     * Kafka message output. The default is <code>false</code>.
     * </p>
     * 
     * @param includeControlDetails
     *        Shows detailed control information for table definition, column definition, and table and column changes
     *        in the Kafka message output. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withIncludeControlDetails(Boolean includeControlDetails) {
        setIncludeControlDetails(includeControlDetails);
        return this;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column definition, and table and column changes in the
     * Kafka message output. The default is <code>false</code>.
     * </p>
     * 
     * @return Shows detailed control information for table definition, column definition, and table and column changes
     *         in the Kafka message output. The default is <code>false</code>.
     */

    public Boolean isIncludeControlDetails() {
        return this.includeControlDetails;
    }

    /**
     * <p>
     * The maximum size in bytes for records created on the endpoint The default is 1,000,000.
     * </p>
     * 
     * @param messageMaxBytes
     *        The maximum size in bytes for records created on the endpoint The default is 1,000,000.
     */

    public void setMessageMaxBytes(Integer messageMaxBytes) {
        this.messageMaxBytes = messageMaxBytes;
    }

    /**
     * <p>
     * The maximum size in bytes for records created on the endpoint The default is 1,000,000.
     * </p>
     * 
     * @return The maximum size in bytes for records created on the endpoint The default is 1,000,000.
     */

    public Integer getMessageMaxBytes() {
        return this.messageMaxBytes;
    }

    /**
     * <p>
     * The maximum size in bytes for records created on the endpoint The default is 1,000,000.
     * </p>
     * 
     * @param messageMaxBytes
     *        The maximum size in bytes for records created on the endpoint The default is 1,000,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withMessageMaxBytes(Integer messageMaxBytes) {
        setMessageMaxBytes(messageMaxBytes);
        return this;
    }

    /**
     * <p>
     * Include NULL and empty columns for records migrated to the endpoint. The default is <code>false</code>.
     * </p>
     * 
     * @param includeNullAndEmpty
     *        Include NULL and empty columns for records migrated to the endpoint. The default is <code>false</code>.
     */

    public void setIncludeNullAndEmpty(Boolean includeNullAndEmpty) {
        this.includeNullAndEmpty = includeNullAndEmpty;
    }

    /**
     * <p>
     * Include NULL and empty columns for records migrated to the endpoint. The default is <code>false</code>.
     * </p>
     * 
     * @return Include NULL and empty columns for records migrated to the endpoint. The default is <code>false</code>.
     */

    public Boolean getIncludeNullAndEmpty() {
        return this.includeNullAndEmpty;
    }

    /**
     * <p>
     * Include NULL and empty columns for records migrated to the endpoint. The default is <code>false</code>.
     * </p>
     * 
     * @param includeNullAndEmpty
     *        Include NULL and empty columns for records migrated to the endpoint. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withIncludeNullAndEmpty(Boolean includeNullAndEmpty) {
        setIncludeNullAndEmpty(includeNullAndEmpty);
        return this;
    }

    /**
     * <p>
     * Include NULL and empty columns for records migrated to the endpoint. The default is <code>false</code>.
     * </p>
     * 
     * @return Include NULL and empty columns for records migrated to the endpoint. The default is <code>false</code>.
     */

    public Boolean isIncludeNullAndEmpty() {
        return this.includeNullAndEmpty;
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
        if (getBroker() != null)
            sb.append("Broker: ").append(getBroker()).append(",");
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic()).append(",");
        if (getMessageFormat() != null)
            sb.append("MessageFormat: ").append(getMessageFormat()).append(",");
        if (getIncludeTransactionDetails() != null)
            sb.append("IncludeTransactionDetails: ").append(getIncludeTransactionDetails()).append(",");
        if (getIncludePartitionValue() != null)
            sb.append("IncludePartitionValue: ").append(getIncludePartitionValue()).append(",");
        if (getPartitionIncludeSchemaTable() != null)
            sb.append("PartitionIncludeSchemaTable: ").append(getPartitionIncludeSchemaTable()).append(",");
        if (getIncludeTableAlterOperations() != null)
            sb.append("IncludeTableAlterOperations: ").append(getIncludeTableAlterOperations()).append(",");
        if (getIncludeControlDetails() != null)
            sb.append("IncludeControlDetails: ").append(getIncludeControlDetails()).append(",");
        if (getMessageMaxBytes() != null)
            sb.append("MessageMaxBytes: ").append(getMessageMaxBytes()).append(",");
        if (getIncludeNullAndEmpty() != null)
            sb.append("IncludeNullAndEmpty: ").append(getIncludeNullAndEmpty());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaSettings == false)
            return false;
        KafkaSettings other = (KafkaSettings) obj;
        if (other.getBroker() == null ^ this.getBroker() == null)
            return false;
        if (other.getBroker() != null && other.getBroker().equals(this.getBroker()) == false)
            return false;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getMessageFormat() == null ^ this.getMessageFormat() == null)
            return false;
        if (other.getMessageFormat() != null && other.getMessageFormat().equals(this.getMessageFormat()) == false)
            return false;
        if (other.getIncludeTransactionDetails() == null ^ this.getIncludeTransactionDetails() == null)
            return false;
        if (other.getIncludeTransactionDetails() != null && other.getIncludeTransactionDetails().equals(this.getIncludeTransactionDetails()) == false)
            return false;
        if (other.getIncludePartitionValue() == null ^ this.getIncludePartitionValue() == null)
            return false;
        if (other.getIncludePartitionValue() != null && other.getIncludePartitionValue().equals(this.getIncludePartitionValue()) == false)
            return false;
        if (other.getPartitionIncludeSchemaTable() == null ^ this.getPartitionIncludeSchemaTable() == null)
            return false;
        if (other.getPartitionIncludeSchemaTable() != null && other.getPartitionIncludeSchemaTable().equals(this.getPartitionIncludeSchemaTable()) == false)
            return false;
        if (other.getIncludeTableAlterOperations() == null ^ this.getIncludeTableAlterOperations() == null)
            return false;
        if (other.getIncludeTableAlterOperations() != null && other.getIncludeTableAlterOperations().equals(this.getIncludeTableAlterOperations()) == false)
            return false;
        if (other.getIncludeControlDetails() == null ^ this.getIncludeControlDetails() == null)
            return false;
        if (other.getIncludeControlDetails() != null && other.getIncludeControlDetails().equals(this.getIncludeControlDetails()) == false)
            return false;
        if (other.getMessageMaxBytes() == null ^ this.getMessageMaxBytes() == null)
            return false;
        if (other.getMessageMaxBytes() != null && other.getMessageMaxBytes().equals(this.getMessageMaxBytes()) == false)
            return false;
        if (other.getIncludeNullAndEmpty() == null ^ this.getIncludeNullAndEmpty() == null)
            return false;
        if (other.getIncludeNullAndEmpty() != null && other.getIncludeNullAndEmpty().equals(this.getIncludeNullAndEmpty()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBroker() == null) ? 0 : getBroker().hashCode());
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        hashCode = prime * hashCode + ((getIncludeTransactionDetails() == null) ? 0 : getIncludeTransactionDetails().hashCode());
        hashCode = prime * hashCode + ((getIncludePartitionValue() == null) ? 0 : getIncludePartitionValue().hashCode());
        hashCode = prime * hashCode + ((getPartitionIncludeSchemaTable() == null) ? 0 : getPartitionIncludeSchemaTable().hashCode());
        hashCode = prime * hashCode + ((getIncludeTableAlterOperations() == null) ? 0 : getIncludeTableAlterOperations().hashCode());
        hashCode = prime * hashCode + ((getIncludeControlDetails() == null) ? 0 : getIncludeControlDetails().hashCode());
        hashCode = prime * hashCode + ((getMessageMaxBytes() == null) ? 0 : getMessageMaxBytes().hashCode());
        hashCode = prime * hashCode + ((getIncludeNullAndEmpty() == null) ? 0 : getIncludeNullAndEmpty().hashCode());
        return hashCode;
    }

    @Override
    public KafkaSettings clone() {
        try {
            return (KafkaSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.KafkaSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
