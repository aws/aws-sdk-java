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
 * Provides information that describes an Amazon Kinesis Data Stream endpoint. This information includes the output
 * format of records applied to the endpoint and details of transaction and control table data information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/KinesisSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The output format for the records created on the endpoint. The message format is <code>JSON</code> (default) or
     * <code>JSON_UNFORMATTED</code> (a single line with no tab).
     * </p>
     */
    private String messageFormat;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that AWS DMS uses to write
     * to the Kinesis data stream.
     * </p>
     */
    private String serviceAccessRoleArn;
    /**
     * <p>
     * Provides detailed transaction information from the source database. This information includes a commit timestamp,
     * a log position, and values for <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a transaction). The default is <code>False</code>.
     * </p>
     */
    private Boolean includeTransactionDetails;
    /**
     * <p>
     * Shows the partition value within the Kinesis message output, unless the partition type is
     * <code>schema-table-type</code>. The default is <code>False</code>.
     * </p>
     */
    private Boolean includePartitionValue;
    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition type is <code>primary-key-type</code>.
     * Doing this increases data distribution among Kinesis shards. For example, suppose that a SysBench schema has
     * thousands of tables and each table has only limited range for a primary key. In this case, the same primary key
     * is sent from thousands of tables to the same shard, which causes throttling. The default is <code>False</code>.
     * </p>
     */
    private Boolean partitionIncludeSchemaTable;
    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the table in the control data, such as
     * <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     * <code>rename-column</code>. The default is <code>False</code>.
     * </p>
     */
    private Boolean includeTableAlterOperations;
    /**
     * <p>
     * Shows detailed control information for table definition, column definition, and table and column changes in the
     * Kinesis message output. The default is <code>False</code>.
     * </p>
     */
    private Boolean includeControlDetails;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisSettings withStreamArn(String streamArn) {
        setStreamArn(streamArn);
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

    public KinesisSettings withMessageFormat(String messageFormat) {
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

    public KinesisSettings withMessageFormat(MessageFormatValue messageFormat) {
        this.messageFormat = messageFormat.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that AWS DMS uses to write
     * to the Kinesis data stream.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that AWS DMS uses to
     *        write to the Kinesis data stream.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that AWS DMS uses to write
     * to the Kinesis data stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that AWS DMS uses to
     *         write to the Kinesis data stream.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that AWS DMS uses to write
     * to the Kinesis data stream.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that AWS DMS uses to
     *        write to the Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisSettings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This information includes a commit timestamp,
     * a log position, and values for <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a transaction). The default is <code>False</code>.
     * </p>
     * 
     * @param includeTransactionDetails
     *        Provides detailed transaction information from the source database. This information includes a commit
     *        timestamp, a log position, and values for <code>transaction_id</code>, previous
     *        <code>transaction_id</code>, and <code>transaction_record_id</code> (the record offset within a
     *        transaction). The default is <code>False</code>.
     */

    public void setIncludeTransactionDetails(Boolean includeTransactionDetails) {
        this.includeTransactionDetails = includeTransactionDetails;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This information includes a commit timestamp,
     * a log position, and values for <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a transaction). The default is <code>False</code>.
     * </p>
     * 
     * @return Provides detailed transaction information from the source database. This information includes a commit
     *         timestamp, a log position, and values for <code>transaction_id</code>, previous
     *         <code>transaction_id</code>, and <code>transaction_record_id</code> (the record offset within a
     *         transaction). The default is <code>False</code>.
     */

    public Boolean getIncludeTransactionDetails() {
        return this.includeTransactionDetails;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This information includes a commit timestamp,
     * a log position, and values for <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a transaction). The default is <code>False</code>.
     * </p>
     * 
     * @param includeTransactionDetails
     *        Provides detailed transaction information from the source database. This information includes a commit
     *        timestamp, a log position, and values for <code>transaction_id</code>, previous
     *        <code>transaction_id</code>, and <code>transaction_record_id</code> (the record offset within a
     *        transaction). The default is <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisSettings withIncludeTransactionDetails(Boolean includeTransactionDetails) {
        setIncludeTransactionDetails(includeTransactionDetails);
        return this;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This information includes a commit timestamp,
     * a log position, and values for <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a transaction). The default is <code>False</code>.
     * </p>
     * 
     * @return Provides detailed transaction information from the source database. This information includes a commit
     *         timestamp, a log position, and values for <code>transaction_id</code>, previous
     *         <code>transaction_id</code>, and <code>transaction_record_id</code> (the record offset within a
     *         transaction). The default is <code>False</code>.
     */

    public Boolean isIncludeTransactionDetails() {
        return this.includeTransactionDetails;
    }

    /**
     * <p>
     * Shows the partition value within the Kinesis message output, unless the partition type is
     * <code>schema-table-type</code>. The default is <code>False</code>.
     * </p>
     * 
     * @param includePartitionValue
     *        Shows the partition value within the Kinesis message output, unless the partition type is
     *        <code>schema-table-type</code>. The default is <code>False</code>.
     */

    public void setIncludePartitionValue(Boolean includePartitionValue) {
        this.includePartitionValue = includePartitionValue;
    }

    /**
     * <p>
     * Shows the partition value within the Kinesis message output, unless the partition type is
     * <code>schema-table-type</code>. The default is <code>False</code>.
     * </p>
     * 
     * @return Shows the partition value within the Kinesis message output, unless the partition type is
     *         <code>schema-table-type</code>. The default is <code>False</code>.
     */

    public Boolean getIncludePartitionValue() {
        return this.includePartitionValue;
    }

    /**
     * <p>
     * Shows the partition value within the Kinesis message output, unless the partition type is
     * <code>schema-table-type</code>. The default is <code>False</code>.
     * </p>
     * 
     * @param includePartitionValue
     *        Shows the partition value within the Kinesis message output, unless the partition type is
     *        <code>schema-table-type</code>. The default is <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisSettings withIncludePartitionValue(Boolean includePartitionValue) {
        setIncludePartitionValue(includePartitionValue);
        return this;
    }

    /**
     * <p>
     * Shows the partition value within the Kinesis message output, unless the partition type is
     * <code>schema-table-type</code>. The default is <code>False</code>.
     * </p>
     * 
     * @return Shows the partition value within the Kinesis message output, unless the partition type is
     *         <code>schema-table-type</code>. The default is <code>False</code>.
     */

    public Boolean isIncludePartitionValue() {
        return this.includePartitionValue;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition type is <code>primary-key-type</code>.
     * Doing this increases data distribution among Kinesis shards. For example, suppose that a SysBench schema has
     * thousands of tables and each table has only limited range for a primary key. In this case, the same primary key
     * is sent from thousands of tables to the same shard, which causes throttling. The default is <code>False</code>.
     * </p>
     * 
     * @param partitionIncludeSchemaTable
     *        Prefixes schema and table names to partition values, when the partition type is
     *        <code>primary-key-type</code>. Doing this increases data distribution among Kinesis shards. For example,
     *        suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary
     *        key. In this case, the same primary key is sent from thousands of tables to the same shard, which causes
     *        throttling. The default is <code>False</code>.
     */

    public void setPartitionIncludeSchemaTable(Boolean partitionIncludeSchemaTable) {
        this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition type is <code>primary-key-type</code>.
     * Doing this increases data distribution among Kinesis shards. For example, suppose that a SysBench schema has
     * thousands of tables and each table has only limited range for a primary key. In this case, the same primary key
     * is sent from thousands of tables to the same shard, which causes throttling. The default is <code>False</code>.
     * </p>
     * 
     * @return Prefixes schema and table names to partition values, when the partition type is
     *         <code>primary-key-type</code>. Doing this increases data distribution among Kinesis shards. For example,
     *         suppose that a SysBench schema has thousands of tables and each table has only limited range for a
     *         primary key. In this case, the same primary key is sent from thousands of tables to the same shard, which
     *         causes throttling. The default is <code>False</code>.
     */

    public Boolean getPartitionIncludeSchemaTable() {
        return this.partitionIncludeSchemaTable;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition type is <code>primary-key-type</code>.
     * Doing this increases data distribution among Kinesis shards. For example, suppose that a SysBench schema has
     * thousands of tables and each table has only limited range for a primary key. In this case, the same primary key
     * is sent from thousands of tables to the same shard, which causes throttling. The default is <code>False</code>.
     * </p>
     * 
     * @param partitionIncludeSchemaTable
     *        Prefixes schema and table names to partition values, when the partition type is
     *        <code>primary-key-type</code>. Doing this increases data distribution among Kinesis shards. For example,
     *        suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary
     *        key. In this case, the same primary key is sent from thousands of tables to the same shard, which causes
     *        throttling. The default is <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisSettings withPartitionIncludeSchemaTable(Boolean partitionIncludeSchemaTable) {
        setPartitionIncludeSchemaTable(partitionIncludeSchemaTable);
        return this;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition type is <code>primary-key-type</code>.
     * Doing this increases data distribution among Kinesis shards. For example, suppose that a SysBench schema has
     * thousands of tables and each table has only limited range for a primary key. In this case, the same primary key
     * is sent from thousands of tables to the same shard, which causes throttling. The default is <code>False</code>.
     * </p>
     * 
     * @return Prefixes schema and table names to partition values, when the partition type is
     *         <code>primary-key-type</code>. Doing this increases data distribution among Kinesis shards. For example,
     *         suppose that a SysBench schema has thousands of tables and each table has only limited range for a
     *         primary key. In this case, the same primary key is sent from thousands of tables to the same shard, which
     *         causes throttling. The default is <code>False</code>.
     */

    public Boolean isPartitionIncludeSchemaTable() {
        return this.partitionIncludeSchemaTable;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the table in the control data, such as
     * <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     * <code>rename-column</code>. The default is <code>False</code>.
     * </p>
     * 
     * @param includeTableAlterOperations
     *        Includes any data definition language (DDL) operations that change the table in the control data, such as
     *        <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     *        <code>rename-column</code>. The default is <code>False</code>.
     */

    public void setIncludeTableAlterOperations(Boolean includeTableAlterOperations) {
        this.includeTableAlterOperations = includeTableAlterOperations;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the table in the control data, such as
     * <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     * <code>rename-column</code>. The default is <code>False</code>.
     * </p>
     * 
     * @return Includes any data definition language (DDL) operations that change the table in the control data, such as
     *         <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>,
     *         and <code>rename-column</code>. The default is <code>False</code>.
     */

    public Boolean getIncludeTableAlterOperations() {
        return this.includeTableAlterOperations;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the table in the control data, such as
     * <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     * <code>rename-column</code>. The default is <code>False</code>.
     * </p>
     * 
     * @param includeTableAlterOperations
     *        Includes any data definition language (DDL) operations that change the table in the control data, such as
     *        <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     *        <code>rename-column</code>. The default is <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisSettings withIncludeTableAlterOperations(Boolean includeTableAlterOperations) {
        setIncludeTableAlterOperations(includeTableAlterOperations);
        return this;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the table in the control data, such as
     * <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>, and
     * <code>rename-column</code>. The default is <code>False</code>.
     * </p>
     * 
     * @return Includes any data definition language (DDL) operations that change the table in the control data, such as
     *         <code>rename-table</code>, <code>drop-table</code>, <code>add-column</code>, <code>drop-column</code>,
     *         and <code>rename-column</code>. The default is <code>False</code>.
     */

    public Boolean isIncludeTableAlterOperations() {
        return this.includeTableAlterOperations;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column definition, and table and column changes in the
     * Kinesis message output. The default is <code>False</code>.
     * </p>
     * 
     * @param includeControlDetails
     *        Shows detailed control information for table definition, column definition, and table and column changes
     *        in the Kinesis message output. The default is <code>False</code>.
     */

    public void setIncludeControlDetails(Boolean includeControlDetails) {
        this.includeControlDetails = includeControlDetails;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column definition, and table and column changes in the
     * Kinesis message output. The default is <code>False</code>.
     * </p>
     * 
     * @return Shows detailed control information for table definition, column definition, and table and column changes
     *         in the Kinesis message output. The default is <code>False</code>.
     */

    public Boolean getIncludeControlDetails() {
        return this.includeControlDetails;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column definition, and table and column changes in the
     * Kinesis message output. The default is <code>False</code>.
     * </p>
     * 
     * @param includeControlDetails
     *        Shows detailed control information for table definition, column definition, and table and column changes
     *        in the Kinesis message output. The default is <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisSettings withIncludeControlDetails(Boolean includeControlDetails) {
        setIncludeControlDetails(includeControlDetails);
        return this;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column definition, and table and column changes in the
     * Kinesis message output. The default is <code>False</code>.
     * </p>
     * 
     * @return Shows detailed control information for table definition, column definition, and table and column changes
     *         in the Kinesis message output. The default is <code>False</code>.
     */

    public Boolean isIncludeControlDetails() {
        return this.includeControlDetails;
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
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
        if (getMessageFormat() != null)
            sb.append("MessageFormat: ").append(getMessageFormat()).append(",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getIncludeTransactionDetails() != null)
            sb.append("IncludeTransactionDetails: ").append(getIncludeTransactionDetails()).append(",");
        if (getIncludePartitionValue() != null)
            sb.append("IncludePartitionValue: ").append(getIncludePartitionValue()).append(",");
        if (getPartitionIncludeSchemaTable() != null)
            sb.append("PartitionIncludeSchemaTable: ").append(getPartitionIncludeSchemaTable()).append(",");
        if (getIncludeTableAlterOperations() != null)
            sb.append("IncludeTableAlterOperations: ").append(getIncludeTableAlterOperations()).append(",");
        if (getIncludeControlDetails() != null)
            sb.append("IncludeControlDetails: ").append(getIncludeControlDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisSettings == false)
            return false;
        KinesisSettings other = (KinesisSettings) obj;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getMessageFormat() == null ^ this.getMessageFormat() == null)
            return false;
        if (other.getMessageFormat() != null && other.getMessageFormat().equals(this.getMessageFormat()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIncludeTransactionDetails() == null) ? 0 : getIncludeTransactionDetails().hashCode());
        hashCode = prime * hashCode + ((getIncludePartitionValue() == null) ? 0 : getIncludePartitionValue().hashCode());
        hashCode = prime * hashCode + ((getPartitionIncludeSchemaTable() == null) ? 0 : getPartitionIncludeSchemaTable().hashCode());
        hashCode = prime * hashCode + ((getIncludeTableAlterOperations() == null) ? 0 : getIncludeTableAlterOperations().hashCode());
        hashCode = prime * hashCode + ((getIncludeControlDetails() == null) ? 0 : getIncludeControlDetails().hashCode());
        return hashCode;
    }

    @Override
    public KinesisSettings clone() {
        try {
            return (KinesisSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.KinesisSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
