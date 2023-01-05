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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/UpdateTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the keyspace the specified table is stored in.
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
     * For each column to be added to the specified table:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private java.util.List<ColumnDefinition> addColumns;
    /**
     * <p>
     * Modifies the read/write throughput capacity mode for the table. The options are:
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
     * Modifies the encryption settings of the table. You can choose one of the following KMS key (KMS key):
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
     * The default is <code>AWS_OWNED_KMS_KEY</code>.
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
     * Modifies the <code>pointInTimeRecovery</code> settings of the table. The options are:
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
     * Modifies Time to Live custom settings for the table. The options are:
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
     * The name of the keyspace the specified table is stored in.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace the specified table is stored in.
     */

    public void setKeyspaceName(String keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace the specified table is stored in.
     * </p>
     * 
     * @return The name of the keyspace the specified table is stored in.
     */

    public String getKeyspaceName() {
        return this.keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace the specified table is stored in.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace the specified table is stored in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withKeyspaceName(String keyspaceName) {
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

    public UpdateTableRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * For each column to be added to the specified table:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return For each column to be added to the specified table:</p>
     *         <p>
     *         • <code>name</code> - The name of the column.
     *         </p>
     *         <p>
     *         • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data
     *         types</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public java.util.List<ColumnDefinition> getAddColumns() {
        return addColumns;
    }

    /**
     * <p>
     * For each column to be added to the specified table:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param addColumns
     *        For each column to be added to the specified table:</p>
     *        <p>
     *        • <code>name</code> - The name of the column.
     *        </p>
     *        <p>
     *        • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data
     *        types</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setAddColumns(java.util.Collection<ColumnDefinition> addColumns) {
        if (addColumns == null) {
            this.addColumns = null;
            return;
        }

        this.addColumns = new java.util.ArrayList<ColumnDefinition>(addColumns);
    }

    /**
     * <p>
     * For each column to be added to the specified table:
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddColumns(java.util.Collection)} or {@link #withAddColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addColumns
     *        For each column to be added to the specified table:</p>
     *        <p>
     *        • <code>name</code> - The name of the column.
     *        </p>
     *        <p>
     *        • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data
     *        types</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withAddColumns(ColumnDefinition... addColumns) {
        if (this.addColumns == null) {
            setAddColumns(new java.util.ArrayList<ColumnDefinition>(addColumns.length));
        }
        for (ColumnDefinition ele : addColumns) {
            this.addColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For each column to be added to the specified table:
     * </p>
     * <p>
     * • <code>name</code> - The name of the column.
     * </p>
     * <p>
     * • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param addColumns
     *        For each column to be added to the specified table:</p>
     *        <p>
     *        • <code>name</code> - The name of the column.
     *        </p>
     *        <p>
     *        • <code>type</code> - An Amazon Keyspaces data type. For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data
     *        types</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withAddColumns(java.util.Collection<ColumnDefinition> addColumns) {
        setAddColumns(addColumns);
        return this;
    }

    /**
     * <p>
     * Modifies the read/write throughput capacity mode for the table. The options are:
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
     *        Modifies the read/write throughput capacity mode for the table. The options are:</p>
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
     * Modifies the read/write throughput capacity mode for the table. The options are:
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
     * @return Modifies the read/write throughput capacity mode for the table. The options are:</p>
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
     * Modifies the read/write throughput capacity mode for the table. The options are:
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
     *        Modifies the read/write throughput capacity mode for the table. The options are:</p>
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

    public UpdateTableRequest withCapacitySpecification(CapacitySpecification capacitySpecification) {
        setCapacitySpecification(capacitySpecification);
        return this;
    }

    /**
     * <p>
     * Modifies the encryption settings of the table. You can choose one of the following KMS key (KMS key):
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
     * The default is <code>AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param encryptionSpecification
     *        Modifies the encryption settings of the table. You can choose one of the following KMS key (KMS key):</p>
     *        <p>
     *        • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *        </p>
     *        <p>
     *        • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *        and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *        Resource Name (ARN) format as input.
     *        </p>
     *        <p>
     *        The default is <code>AWS_OWNED_KMS_KEY</code>.
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
     * Modifies the encryption settings of the table. You can choose one of the following KMS key (KMS key):
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
     * The default is <code>AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Modifies the encryption settings of the table. You can choose one of the following KMS key (KMS key):</p>
     *         <p>
     *         • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *         </p>
     *         <p>
     *         • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *         and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *         Resource Name (ARN) format as input.
     *         </p>
     *         <p>
     *         The default is <code>AWS_OWNED_KMS_KEY</code>.
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
     * Modifies the encryption settings of the table. You can choose one of the following KMS key (KMS key):
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
     * The default is <code>AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param encryptionSpecification
     *        Modifies the encryption settings of the table. You can choose one of the following KMS key (KMS key):</p>
     *        <p>
     *        • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *        </p>
     *        <p>
     *        • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *        and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *        Resource Name (ARN) format as input.
     *        </p>
     *        <p>
     *        The default is <code>AWS_OWNED_KMS_KEY</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *        in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withEncryptionSpecification(EncryptionSpecification encryptionSpecification) {
        setEncryptionSpecification(encryptionSpecification);
        return this;
    }

    /**
     * <p>
     * Modifies the <code>pointInTimeRecovery</code> settings of the table. The options are:
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
     *        Modifies the <code>pointInTimeRecovery</code> settings of the table. The options are:</p>
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
     * Modifies the <code>pointInTimeRecovery</code> settings of the table. The options are:
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
     * @return Modifies the <code>pointInTimeRecovery</code> settings of the table. The options are:</p>
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
     * Modifies the <code>pointInTimeRecovery</code> settings of the table. The options are:
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
     *        Modifies the <code>pointInTimeRecovery</code> settings of the table. The options are:</p>
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

    public UpdateTableRequest withPointInTimeRecovery(PointInTimeRecovery pointInTimeRecovery) {
        setPointInTimeRecovery(pointInTimeRecovery);
        return this;
    }

    /**
     * <p>
     * Modifies Time to Live custom settings for the table. The options are:
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
     *        Modifies Time to Live custom settings for the table. The options are:</p>
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
     * Modifies Time to Live custom settings for the table. The options are:
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
     * @return Modifies Time to Live custom settings for the table. The options are:</p>
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
     * Modifies Time to Live custom settings for the table. The options are:
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
     *        Modifies Time to Live custom settings for the table. The options are:</p>
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

    public UpdateTableRequest withTtl(TimeToLive ttl) {
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

    public UpdateTableRequest withDefaultTimeToLive(Integer defaultTimeToLive) {
        setDefaultTimeToLive(defaultTimeToLive);
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
        if (getAddColumns() != null)
            sb.append("AddColumns: ").append(getAddColumns()).append(",");
        if (getCapacitySpecification() != null)
            sb.append("CapacitySpecification: ").append(getCapacitySpecification()).append(",");
        if (getEncryptionSpecification() != null)
            sb.append("EncryptionSpecification: ").append(getEncryptionSpecification()).append(",");
        if (getPointInTimeRecovery() != null)
            sb.append("PointInTimeRecovery: ").append(getPointInTimeRecovery()).append(",");
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl()).append(",");
        if (getDefaultTimeToLive() != null)
            sb.append("DefaultTimeToLive: ").append(getDefaultTimeToLive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTableRequest == false)
            return false;
        UpdateTableRequest other = (UpdateTableRequest) obj;
        if (other.getKeyspaceName() == null ^ this.getKeyspaceName() == null)
            return false;
        if (other.getKeyspaceName() != null && other.getKeyspaceName().equals(this.getKeyspaceName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getAddColumns() == null ^ this.getAddColumns() == null)
            return false;
        if (other.getAddColumns() != null && other.getAddColumns().equals(this.getAddColumns()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyspaceName() == null) ? 0 : getKeyspaceName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getAddColumns() == null) ? 0 : getAddColumns().hashCode());
        hashCode = prime * hashCode + ((getCapacitySpecification() == null) ? 0 : getCapacitySpecification().hashCode());
        hashCode = prime * hashCode + ((getEncryptionSpecification() == null) ? 0 : getEncryptionSpecification().hashCode());
        hashCode = prime * hashCode + ((getPointInTimeRecovery() == null) ? 0 : getPointInTimeRecovery().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        hashCode = prime * hashCode + ((getDefaultTimeToLive() == null) ? 0 : getDefaultTimeToLive().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTableRequest clone() {
        return (UpdateTableRequest) super.clone();
    }

}
