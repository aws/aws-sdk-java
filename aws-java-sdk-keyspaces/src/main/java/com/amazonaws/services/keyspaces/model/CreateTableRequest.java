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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the keyspace that the table is going to be created in.
     * </p>
     */
    private String keyspaceName;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The <code>schemaDefinition</code> consists of the following parameters.
     * </p>
     * <p>
     * For each column to be created:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * The primary key of the table consists of the following columns:
     * </p>
     * <p>
     * • <code>partitionKeys</code> - The partition key can be a single column, or it can be a compound value composed
     * of two or more columns. The partition key portion of the primary key is required and determines how Amazon
     * Keyspaces stores your data.
     * </p>
     * <p>
     * • <code>name</code> - The name of each partition key column.
     * </p>
     * <p>
     * • <code>clusteringKeys</code> - The optional clustering column portion of your primary key determines how the
     * data is clustered and sorted within each partition.
     * </p>
     * <p>
     * • <code>name</code> - The name of the clustering column.
     * </p>
     * <p>
     * • <code>orderBy</code> - Sets the ascendant (<code>ASC</code>) or descendant (<code>DESC</code>) order modifier.
     * </p>
     * <p>
     * To define a column as static use <code>staticColumns</code> - Static columns store values that are shared by all
     * rows in the same partition:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type.
     * </p>
     */
    private SchemaDefinition schemaDefinition;
    /**
     * <p>
     * This parameter allows to enter a description of the table.
     * </p>
     */
    private Comment comment;
    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the table. The options are:
     * </p>
     * <p>
     * • <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * <p>
     * • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private CapacitySpecification capacitySpecification;
    /**
     * <p>
     * Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of the
     * following KMS key (KMS key):
     * </p>
     * <p>
     * • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * <p>
     * • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private EncryptionSpecification encryptionSpecification;
    /**
     * <p>
     * Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:
     * </p>
     * <p>
     * • <code>ENABLED</code>
     * </p>
     * <p>
     * • <code>DISABLED</code>
     * </p>
     * <p>
     * If it's not specified, the default is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private PointInTimeRecovery pointInTimeRecovery;
    /**
     * <p>
     * Enables Time to Live custom settings for the table. The options are:
     * </p>
     * <p>
     * • <code>status:enabled</code>
     * </p>
     * <p>
     * • <code>status:disabled</code>
     * </p>
     * <p>
     * The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for the
     * table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data
     * by using Amazon Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private TimeToLive ttl;
    /**
     * <p>
     * The default Time to Live setting in seconds for the table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     * >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private Integer defaultTimeToLive;
    /**
     * <p>
     * A list of key-value pair tags to be attached to the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the keyspace that the table is going to be created in.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace that the table is going to be created in.
     */

    public void setKeyspaceName(String keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace that the table is going to be created in.
     * </p>
     * 
     * @return The name of the keyspace that the table is going to be created in.
     */

    public String getKeyspaceName() {
        return this.keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace that the table is going to be created in.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace that the table is going to be created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withKeyspaceName(String keyspaceName) {
        setKeyspaceName(keyspaceName);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The <code>schemaDefinition</code> consists of the following parameters.
     * </p>
     * <p>
     * For each column to be created:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * The primary key of the table consists of the following columns:
     * </p>
     * <p>
     * • <code>partitionKeys</code> - The partition key can be a single column, or it can be a compound value composed
     * of two or more columns. The partition key portion of the primary key is required and determines how Amazon
     * Keyspaces stores your data.
     * </p>
     * <p>
     * • <code>name</code> - The name of each partition key column.
     * </p>
     * <p>
     * • <code>clusteringKeys</code> - The optional clustering column portion of your primary key determines how the
     * data is clustered and sorted within each partition.
     * </p>
     * <p>
     * • <code>name</code> - The name of the clustering column.
     * </p>
     * <p>
     * • <code>orderBy</code> - Sets the ascendant (<code>ASC</code>) or descendant (<code>DESC</code>) order modifier.
     * </p>
     * <p>
     * To define a column as static use <code>staticColumns</code> - Static columns store values that are shared by all
     * rows in the same partition:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type.
     * </p>
     * 
     * @param schemaDefinition
     *        The <code>schemaDefinition</code> consists of the following parameters.</p>
     *        <p>
     *        For each column to be created:
     *        </p>
     *        <p>
     *        • <code>name</code> - The name of the column.
     *        </p>
     *        <p>
     *        • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data
     *        types</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     *        </p>
     *        <p>
     *        The primary key of the table consists of the following columns:
     *        </p>
     *        <p>
     *        • <code>partitionKeys</code> - The partition key can be a single column, or it can be a compound value
     *        composed of two or more columns. The partition key portion of the primary key is required and determines
     *        how Amazon Keyspaces stores your data.
     *        </p>
     *        <p>
     *        • <code>name</code> - The name of each partition key column.
     *        </p>
     *        <p>
     *        • <code>clusteringKeys</code> - The optional clustering column portion of your primary key determines how
     *        the data is clustered and sorted within each partition.
     *        </p>
     *        <p>
     *        • <code>name</code> - The name of the clustering column.
     *        </p>
     *        <p>
     *        • <code>orderBy</code> - Sets the ascendant (<code>ASC</code>) or descendant (<code>DESC</code>) order
     *        modifier.
     *        </p>
     *        <p>
     *        To define a column as static use <code>staticColumns</code> - Static columns store values that are shared
     *        by all rows in the same partition:
     *        </p>
     *        <p>
     *        • <code>name</code> - The name of the column.
     *        </p>
     *        <p>
     *        • <code>type</code> - An Amazon Keyspaces data type.
     */

    public void setSchemaDefinition(SchemaDefinition schemaDefinition) {
        this.schemaDefinition = schemaDefinition;
    }

    /**
     * <p>
     * The <code>schemaDefinition</code> consists of the following parameters.
     * </p>
     * <p>
     * For each column to be created:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * The primary key of the table consists of the following columns:
     * </p>
     * <p>
     * • <code>partitionKeys</code> - The partition key can be a single column, or it can be a compound value composed
     * of two or more columns. The partition key portion of the primary key is required and determines how Amazon
     * Keyspaces stores your data.
     * </p>
     * <p>
     * • <code>name</code> - The name of each partition key column.
     * </p>
     * <p>
     * • <code>clusteringKeys</code> - The optional clustering column portion of your primary key determines how the
     * data is clustered and sorted within each partition.
     * </p>
     * <p>
     * • <code>name</code> - The name of the clustering column.
     * </p>
     * <p>
     * • <code>orderBy</code> - Sets the ascendant (<code>ASC</code>) or descendant (<code>DESC</code>) order modifier.
     * </p>
     * <p>
     * To define a column as static use <code>staticColumns</code> - Static columns store values that are shared by all
     * rows in the same partition:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type.
     * </p>
     * 
     * @return The <code>schemaDefinition</code> consists of the following parameters.</p>
     *         <p>
     *         For each column to be created:
     *         </p>
     *         <p>
     *         • <code>name</code> - The name of the column.
     *         </p>
     *         <p>
     *         • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data
     *         types</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     *         </p>
     *         <p>
     *         The primary key of the table consists of the following columns:
     *         </p>
     *         <p>
     *         • <code>partitionKeys</code> - The partition key can be a single column, or it can be a compound value
     *         composed of two or more columns. The partition key portion of the primary key is required and determines
     *         how Amazon Keyspaces stores your data.
     *         </p>
     *         <p>
     *         • <code>name</code> - The name of each partition key column.
     *         </p>
     *         <p>
     *         • <code>clusteringKeys</code> - The optional clustering column portion of your primary key determines how
     *         the data is clustered and sorted within each partition.
     *         </p>
     *         <p>
     *         • <code>name</code> - The name of the clustering column.
     *         </p>
     *         <p>
     *         • <code>orderBy</code> - Sets the ascendant (<code>ASC</code>) or descendant (<code>DESC</code>) order
     *         modifier.
     *         </p>
     *         <p>
     *         To define a column as static use <code>staticColumns</code> - Static columns store values that are shared
     *         by all rows in the same partition:
     *         </p>
     *         <p>
     *         • <code>name</code> - The name of the column.
     *         </p>
     *         <p>
     *         • <code>type</code> - An Amazon Keyspaces data type.
     */

    public SchemaDefinition getSchemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * <p>
     * The <code>schemaDefinition</code> consists of the following parameters.
     * </p>
     * <p>
     * For each column to be created:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * The primary key of the table consists of the following columns:
     * </p>
     * <p>
     * • <code>partitionKeys</code> - The partition key can be a single column, or it can be a compound value composed
     * of two or more columns. The partition key portion of the primary key is required and determines how Amazon
     * Keyspaces stores your data.
     * </p>
     * <p>
     * • <code>name</code> - The name of each partition key column.
     * </p>
     * <p>
     * • <code>clusteringKeys</code> - The optional clustering column portion of your primary key determines how the
     * data is clustered and sorted within each partition.
     * </p>
     * <p>
     * • <code>name</code> - The name of the clustering column.
     * </p>
     * <p>
     * • <code>orderBy</code> - Sets the ascendant (<code>ASC</code>) or descendant (<code>DESC</code>) order modifier.
     * </p>
     * <p>
     * To define a column as static use <code>staticColumns</code> - Static columns store values that are shared by all
     * rows in the same partition:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type.
     * </p>
     * 
     * @param schemaDefinition
     *        The <code>schemaDefinition</code> consists of the following parameters.</p>
     *        <p>
     *        For each column to be created:
     *        </p>
     *        <p>
     *        • <code>name</code> - The name of the column.
     *        </p>
     *        <p>
     *        • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data
     *        types</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     *        </p>
     *        <p>
     *        The primary key of the table consists of the following columns:
     *        </p>
     *        <p>
     *        • <code>partitionKeys</code> - The partition key can be a single column, or it can be a compound value
     *        composed of two or more columns. The partition key portion of the primary key is required and determines
     *        how Amazon Keyspaces stores your data.
     *        </p>
     *        <p>
     *        • <code>name</code> - The name of each partition key column.
     *        </p>
     *        <p>
     *        • <code>clusteringKeys</code> - The optional clustering column portion of your primary key determines how
     *        the data is clustered and sorted within each partition.
     *        </p>
     *        <p>
     *        • <code>name</code> - The name of the clustering column.
     *        </p>
     *        <p>
     *        • <code>orderBy</code> - Sets the ascendant (<code>ASC</code>) or descendant (<code>DESC</code>) order
     *        modifier.
     *        </p>
     *        <p>
     *        To define a column as static use <code>staticColumns</code> - Static columns store values that are shared
     *        by all rows in the same partition:
     *        </p>
     *        <p>
     *        • <code>name</code> - The name of the column.
     *        </p>
     *        <p>
     *        • <code>type</code> - An Amazon Keyspaces data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withSchemaDefinition(SchemaDefinition schemaDefinition) {
        setSchemaDefinition(schemaDefinition);
        return this;
    }

    /**
     * <p>
     * This parameter allows to enter a description of the table.
     * </p>
     * 
     * @param comment
     *        This parameter allows to enter a description of the table.
     */

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * This parameter allows to enter a description of the table.
     * </p>
     * 
     * @return This parameter allows to enter a description of the table.
     */

    public Comment getComment() {
        return this.comment;
    }

    /**
     * <p>
     * This parameter allows to enter a description of the table.
     * </p>
     * 
     * @param comment
     *        This parameter allows to enter a description of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withComment(Comment comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the table. The options are:
     * </p>
     * <p>
     * • <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * <p>
     * • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param capacitySpecification
     *        Specifies the read/write throughput capacity mode for the table. The options are:</p>
     *        <p>
     *        • <code>throughputMode:PAY_PER_REQUEST</code> and
     *        </p>
     *        <p>
     *        • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires
     *        <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as input.
     *        </p>
     *        <p>
     *        The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *        capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setCapacitySpecification(CapacitySpecification capacitySpecification) {
        this.capacitySpecification = capacitySpecification;
    }

    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the table. The options are:
     * </p>
     * <p>
     * • <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * <p>
     * • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the read/write throughput capacity mode for the table. The options are:</p>
     *         <p>
     *         • <code>throughputMode:PAY_PER_REQUEST</code> and
     *         </p>
     *         <p>
     *         • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires
     *         <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as input.
     *         </p>
     *         <p>
     *         The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *         capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public CapacitySpecification getCapacitySpecification() {
        return this.capacitySpecification;
    }

    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the table. The options are:
     * </p>
     * <p>
     * • <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * <p>
     * • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param capacitySpecification
     *        Specifies the read/write throughput capacity mode for the table. The options are:</p>
     *        <p>
     *        • <code>throughputMode:PAY_PER_REQUEST</code> and
     *        </p>
     *        <p>
     *        • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires
     *        <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as input.
     *        </p>
     *        <p>
     *        The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *        capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withCapacitySpecification(CapacitySpecification capacitySpecification) {
        setCapacitySpecification(capacitySpecification);
        return this;
    }

    /**
     * <p>
     * Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of the
     * following KMS key (KMS key):
     * </p>
     * <p>
     * • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * <p>
     * • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param encryptionSpecification
     *        Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of
     *        the following KMS key (KMS key):</p>
     *        <p>
     *        • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *        </p>
     *        <p>
     *        • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *        and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *        Resource Name (ARN) format as input.
     *        </p>
     *        <p>
     *        The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *        in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setEncryptionSpecification(EncryptionSpecification encryptionSpecification) {
        this.encryptionSpecification = encryptionSpecification;
    }

    /**
     * <p>
     * Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of the
     * following KMS key (KMS key):
     * </p>
     * <p>
     * • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * <p>
     * • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of
     *         the following KMS key (KMS key):</p>
     *         <p>
     *         • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *         </p>
     *         <p>
     *         • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *         and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *         Resource Name (ARN) format as input.
     *         </p>
     *         <p>
     *         The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *         in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public EncryptionSpecification getEncryptionSpecification() {
        return this.encryptionSpecification;
    }

    /**
     * <p>
     * Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of the
     * following KMS key (KMS key):
     * </p>
     * <p>
     * • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * <p>
     * • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param encryptionSpecification
     *        Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of
     *        the following KMS key (KMS key):</p>
     *        <p>
     *        • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *        </p>
     *        <p>
     *        • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *        and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *        Resource Name (ARN) format as input.
     *        </p>
     *        <p>
     *        The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *        in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withEncryptionSpecification(EncryptionSpecification encryptionSpecification) {
        setEncryptionSpecification(encryptionSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:
     * </p>
     * <p>
     * • <code>ENABLED</code>
     * </p>
     * <p>
     * • <code>DISABLED</code>
     * </p>
     * <p>
     * If it's not specified, the default is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param pointInTimeRecovery
     *        Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:</p>
     *        <p>
     *        • <code>ENABLED</code>
     *        </p>
     *        <p>
     *        • <code>DISABLED</code>
     *        </p>
     *        <p>
     *        If it's not specified, the default is <code>DISABLED</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time
     *        recovery</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setPointInTimeRecovery(PointInTimeRecovery pointInTimeRecovery) {
        this.pointInTimeRecovery = pointInTimeRecovery;
    }

    /**
     * <p>
     * Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:
     * </p>
     * <p>
     * • <code>ENABLED</code>
     * </p>
     * <p>
     * • <code>DISABLED</code>
     * </p>
     * <p>
     * If it's not specified, the default is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:</p>
     *         <p>
     *         • <code>ENABLED</code>
     *         </p>
     *         <p>
     *         • <code>DISABLED</code>
     *         </p>
     *         <p>
     *         If it's not specified, the default is <code>DISABLED</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time
     *         recovery</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public PointInTimeRecovery getPointInTimeRecovery() {
        return this.pointInTimeRecovery;
    }

    /**
     * <p>
     * Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:
     * </p>
     * <p>
     * • <code>ENABLED</code>
     * </p>
     * <p>
     * • <code>DISABLED</code>
     * </p>
     * <p>
     * If it's not specified, the default is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param pointInTimeRecovery
     *        Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:</p>
     *        <p>
     *        • <code>ENABLED</code>
     *        </p>
     *        <p>
     *        • <code>DISABLED</code>
     *        </p>
     *        <p>
     *        If it's not specified, the default is <code>DISABLED</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time
     *        recovery</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withPointInTimeRecovery(PointInTimeRecovery pointInTimeRecovery) {
        setPointInTimeRecovery(pointInTimeRecovery);
        return this;
    }

    /**
     * <p>
     * Enables Time to Live custom settings for the table. The options are:
     * </p>
     * <p>
     * • <code>status:enabled</code>
     * </p>
     * <p>
     * • <code>status:disabled</code>
     * </p>
     * <p>
     * The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for the
     * table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data
     * by using Amazon Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param ttl
     *        Enables Time to Live custom settings for the table. The options are:</p>
     *        <p>
     *        • <code>status:enabled</code>
     *        </p>
     *        <p>
     *        • <code>status:disabled</code>
     *        </p>
     *        <p>
     *        The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for
     *        the table.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data by using Amazon
     *        Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setTtl(TimeToLive ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * Enables Time to Live custom settings for the table. The options are:
     * </p>
     * <p>
     * • <code>status:enabled</code>
     * </p>
     * <p>
     * • <code>status:disabled</code>
     * </p>
     * <p>
     * The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for the
     * table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data
     * by using Amazon Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Enables Time to Live custom settings for the table. The options are:</p>
     *         <p>
     *         • <code>status:enabled</code>
     *         </p>
     *         <p>
     *         • <code>status:disabled</code>
     *         </p>
     *         <p>
     *         The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for
     *         the table.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data by using Amazon
     *         Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public TimeToLive getTtl() {
        return this.ttl;
    }

    /**
     * <p>
     * Enables Time to Live custom settings for the table. The options are:
     * </p>
     * <p>
     * • <code>status:enabled</code>
     * </p>
     * <p>
     * • <code>status:disabled</code>
     * </p>
     * <p>
     * The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for the
     * table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data
     * by using Amazon Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param ttl
     *        Enables Time to Live custom settings for the table. The options are:</p>
     *        <p>
     *        • <code>status:enabled</code>
     *        </p>
     *        <p>
     *        • <code>status:disabled</code>
     *        </p>
     *        <p>
     *        The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for
     *        the table.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data by using Amazon
     *        Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTtl(TimeToLive ttl) {
        setTtl(ttl);
        return this;
    }

    /**
     * <p>
     * The default Time to Live setting in seconds for the table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     * >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param defaultTimeToLive
     *        The default Time to Live setting in seconds for the table.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     *        >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setDefaultTimeToLive(Integer defaultTimeToLive) {
        this.defaultTimeToLive = defaultTimeToLive;
    }

    /**
     * <p>
     * The default Time to Live setting in seconds for the table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     * >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return The default Time to Live setting in seconds for the table.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     *         >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public Integer getDefaultTimeToLive() {
        return this.defaultTimeToLive;
    }

    /**
     * <p>
     * The default Time to Live setting in seconds for the table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     * >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param defaultTimeToLive
     *        The default Time to Live setting in seconds for the table.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     *        >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withDefaultTimeToLive(Integer defaultTimeToLive) {
        setDefaultTimeToLive(defaultTimeToLive);
        return this;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return A list of key-value pair tags to be attached to the resource. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and
     *         labels to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pair tags to be attached to the resource. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pair tags to be attached to the resource. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pair tags to be attached to the resource. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getKeyspaceName() != null)
            sb.append("KeyspaceName: ").append(getKeyspaceName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getSchemaDefinition() != null)
            sb.append("SchemaDefinition: ").append(getSchemaDefinition()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getCapacitySpecification() != null)
            sb.append("CapacitySpecification: ").append(getCapacitySpecification()).append(",");
        if (getEncryptionSpecification() != null)
            sb.append("EncryptionSpecification: ").append(getEncryptionSpecification()).append(",");
        if (getPointInTimeRecovery() != null)
            sb.append("PointInTimeRecovery: ").append(getPointInTimeRecovery()).append(",");
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl()).append(",");
        if (getDefaultTimeToLive() != null)
            sb.append("DefaultTimeToLive: ").append(getDefaultTimeToLive()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTableRequest == false)
            return false;
        CreateTableRequest other = (CreateTableRequest) obj;
        if (other.getKeyspaceName() == null ^ this.getKeyspaceName() == null)
            return false;
        if (other.getKeyspaceName() != null && other.getKeyspaceName().equals(this.getKeyspaceName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getSchemaDefinition() == null ^ this.getSchemaDefinition() == null)
            return false;
        if (other.getSchemaDefinition() != null && other.getSchemaDefinition().equals(this.getSchemaDefinition()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getCapacitySpecification() == null ^ this.getCapacitySpecification() == null)
            return false;
        if (other.getCapacitySpecification() != null && other.getCapacitySpecification().equals(this.getCapacitySpecification()) == false)
            return false;
        if (other.getEncryptionSpecification() == null ^ this.getEncryptionSpecification() == null)
            return false;
        if (other.getEncryptionSpecification() != null && other.getEncryptionSpecification().equals(this.getEncryptionSpecification()) == false)
            return false;
        if (other.getPointInTimeRecovery() == null ^ this.getPointInTimeRecovery() == null)
            return false;
        if (other.getPointInTimeRecovery() != null && other.getPointInTimeRecovery().equals(this.getPointInTimeRecovery()) == false)
            return false;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        if (other.getDefaultTimeToLive() == null ^ this.getDefaultTimeToLive() == null)
            return false;
        if (other.getDefaultTimeToLive() != null && other.getDefaultTimeToLive().equals(this.getDefaultTimeToLive()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyspaceName() == null) ? 0 : getKeyspaceName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getSchemaDefinition() == null) ? 0 : getSchemaDefinition().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getCapacitySpecification() == null) ? 0 : getCapacitySpecification().hashCode());
        hashCode = prime * hashCode + ((getEncryptionSpecification() == null) ? 0 : getEncryptionSpecification().hashCode());
        hashCode = prime * hashCode + ((getPointInTimeRecovery() == null) ? 0 : getPointInTimeRecovery().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        hashCode = prime * hashCode + ((getDefaultTimeToLive() == null) ? 0 : getDefaultTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTableRequest clone() {
        return (CreateTableRequest) super.clone();
    }

}
