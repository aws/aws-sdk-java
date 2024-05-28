/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/RestoreTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The keyspace name of the source table.
     * </p>
     */
    private String sourceKeyspaceName;
    /**
     * <p>
     * The name of the source table.
     * </p>
     */
    private String sourceTableName;
    /**
     * <p>
     * The name of the target keyspace.
     * </p>
     */
    private String targetKeyspaceName;
    /**
     * <p>
     * The name of the target table.
     * </p>
     */
    private String targetTableName;
    /**
     * <p>
     * The restore timestamp in ISO 8601 format.
     * </p>
     */
    private java.util.Date restoreTimestamp;
    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the target table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private CapacitySpecification capacitySpecificationOverride;
    /**
     * <p>
     * Specifies the encryption settings for the target table. You can choose one of the following KMS key (KMS key):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private EncryptionSpecification encryptionSpecificationOverride;
    /**
     * <p>
     * Specifies the <code>pointInTimeRecovery</code> settings for the target table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status=ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status=DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If it's not specified, the default is <code>status=DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private PointInTimeRecovery pointInTimeRecoveryOverride;
    /**
     * <p>
     * A list of key-value pair tags to be attached to the restored table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tagsOverride;
    /**
     * <p>
     * The optional auto scaling settings for the restored table in provisioned capacity mode. Specifies if the service
     * can manage throughput capacity of a provisioned table automatically on your behalf. Amazon Keyspaces auto scaling
     * helps you provision throughput capacity for variable workloads efficiently by increasing and decreasing your
     * table's read and write capacity automatically in response to application traffic.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html">Managing throughput capacity
     * automatically with Amazon Keyspaces auto scaling</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private AutoScalingSpecification autoScalingSpecification;
    /**
     * <p>
     * The optional Region specific settings of a multi-Regional table.
     * </p>
     */
    private java.util.List<ReplicaSpecification> replicaSpecifications;

    /**
     * <p>
     * The keyspace name of the source table.
     * </p>
     * 
     * @param sourceKeyspaceName
     *        The keyspace name of the source table.
     */

    public void setSourceKeyspaceName(String sourceKeyspaceName) {
        this.sourceKeyspaceName = sourceKeyspaceName;
    }

    /**
     * <p>
     * The keyspace name of the source table.
     * </p>
     * 
     * @return The keyspace name of the source table.
     */

    public String getSourceKeyspaceName() {
        return this.sourceKeyspaceName;
    }

    /**
     * <p>
     * The keyspace name of the source table.
     * </p>
     * 
     * @param sourceKeyspaceName
     *        The keyspace name of the source table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withSourceKeyspaceName(String sourceKeyspaceName) {
        setSourceKeyspaceName(sourceKeyspaceName);
        return this;
    }

    /**
     * <p>
     * The name of the source table.
     * </p>
     * 
     * @param sourceTableName
     *        The name of the source table.
     */

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * <p>
     * The name of the source table.
     * </p>
     * 
     * @return The name of the source table.
     */

    public String getSourceTableName() {
        return this.sourceTableName;
    }

    /**
     * <p>
     * The name of the source table.
     * </p>
     * 
     * @param sourceTableName
     *        The name of the source table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withSourceTableName(String sourceTableName) {
        setSourceTableName(sourceTableName);
        return this;
    }

    /**
     * <p>
     * The name of the target keyspace.
     * </p>
     * 
     * @param targetKeyspaceName
     *        The name of the target keyspace.
     */

    public void setTargetKeyspaceName(String targetKeyspaceName) {
        this.targetKeyspaceName = targetKeyspaceName;
    }

    /**
     * <p>
     * The name of the target keyspace.
     * </p>
     * 
     * @return The name of the target keyspace.
     */

    public String getTargetKeyspaceName() {
        return this.targetKeyspaceName;
    }

    /**
     * <p>
     * The name of the target keyspace.
     * </p>
     * 
     * @param targetKeyspaceName
     *        The name of the target keyspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withTargetKeyspaceName(String targetKeyspaceName) {
        setTargetKeyspaceName(targetKeyspaceName);
        return this;
    }

    /**
     * <p>
     * The name of the target table.
     * </p>
     * 
     * @param targetTableName
     *        The name of the target table.
     */

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    /**
     * <p>
     * The name of the target table.
     * </p>
     * 
     * @return The name of the target table.
     */

    public String getTargetTableName() {
        return this.targetTableName;
    }

    /**
     * <p>
     * The name of the target table.
     * </p>
     * 
     * @param targetTableName
     *        The name of the target table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withTargetTableName(String targetTableName) {
        setTargetTableName(targetTableName);
        return this;
    }

    /**
     * <p>
     * The restore timestamp in ISO 8601 format.
     * </p>
     * 
     * @param restoreTimestamp
     *        The restore timestamp in ISO 8601 format.
     */

    public void setRestoreTimestamp(java.util.Date restoreTimestamp) {
        this.restoreTimestamp = restoreTimestamp;
    }

    /**
     * <p>
     * The restore timestamp in ISO 8601 format.
     * </p>
     * 
     * @return The restore timestamp in ISO 8601 format.
     */

    public java.util.Date getRestoreTimestamp() {
        return this.restoreTimestamp;
    }

    /**
     * <p>
     * The restore timestamp in ISO 8601 format.
     * </p>
     * 
     * @param restoreTimestamp
     *        The restore timestamp in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withRestoreTimestamp(java.util.Date restoreTimestamp) {
        setRestoreTimestamp(restoreTimestamp);
        return this;
    }

    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the target table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param capacitySpecificationOverride
     *        Specifies the read/write throughput capacity mode for the target table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>throughputMode:PAY_PER_REQUEST</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires
     *        <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as input.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *        capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setCapacitySpecificationOverride(CapacitySpecification capacitySpecificationOverride) {
        this.capacitySpecificationOverride = capacitySpecificationOverride;
    }

    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the target table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the read/write throughput capacity mode for the target table. The options are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>throughputMode:PAY_PER_REQUEST</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires
     *         <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as input.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *         capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public CapacitySpecification getCapacitySpecificationOverride() {
        return this.capacitySpecificationOverride;
    }

    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the target table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param capacitySpecificationOverride
     *        Specifies the read/write throughput capacity mode for the target table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>throughputMode:PAY_PER_REQUEST</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires
     *        <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as input.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *        capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withCapacitySpecificationOverride(CapacitySpecification capacitySpecificationOverride) {
        setCapacitySpecificationOverride(capacitySpecificationOverride);
        return this;
    }

    /**
     * <p>
     * Specifies the encryption settings for the target table. You can choose one of the following KMS key (KMS key):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param encryptionSpecificationOverride
     *        Specifies the encryption settings for the target table. You can choose one of the following KMS key (KMS
     *        key):</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     *        managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource
     *        Name (ARN) format as input.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *        in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setEncryptionSpecificationOverride(EncryptionSpecification encryptionSpecificationOverride) {
        this.encryptionSpecificationOverride = encryptionSpecificationOverride;
    }

    /**
     * <p>
     * Specifies the encryption settings for the target table. You can choose one of the following KMS key (KMS key):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the encryption settings for the target table. You can choose one of the following KMS key (KMS
     *         key):</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *         and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *         Resource Name (ARN) format as input.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *         in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public EncryptionSpecification getEncryptionSpecificationOverride() {
        return this.encryptionSpecificationOverride;
    }

    /**
     * <p>
     * Specifies the encryption settings for the target table. You can choose one of the following KMS key (KMS key):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param encryptionSpecificationOverride
     *        Specifies the encryption settings for the target table. You can choose one of the following KMS key (KMS
     *        key):</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     *        managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource
     *        Name (ARN) format as input.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *        in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withEncryptionSpecificationOverride(EncryptionSpecification encryptionSpecificationOverride) {
        setEncryptionSpecificationOverride(encryptionSpecificationOverride);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>pointInTimeRecovery</code> settings for the target table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status=ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status=DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If it's not specified, the default is <code>status=DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param pointInTimeRecoveryOverride
     *        Specifies the <code>pointInTimeRecovery</code> settings for the target table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>status=ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status=DISABLED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If it's not specified, the default is <code>status=DISABLED</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time
     *        recovery</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setPointInTimeRecoveryOverride(PointInTimeRecovery pointInTimeRecoveryOverride) {
        this.pointInTimeRecoveryOverride = pointInTimeRecoveryOverride;
    }

    /**
     * <p>
     * Specifies the <code>pointInTimeRecovery</code> settings for the target table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status=ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status=DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If it's not specified, the default is <code>status=DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the <code>pointInTimeRecovery</code> settings for the target table. The options are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>status=ENABLED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status=DISABLED</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If it's not specified, the default is <code>status=DISABLED</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time
     *         recovery</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public PointInTimeRecovery getPointInTimeRecoveryOverride() {
        return this.pointInTimeRecoveryOverride;
    }

    /**
     * <p>
     * Specifies the <code>pointInTimeRecovery</code> settings for the target table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status=ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status=DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If it's not specified, the default is <code>status=DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param pointInTimeRecoveryOverride
     *        Specifies the <code>pointInTimeRecovery</code> settings for the target table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>status=ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status=DISABLED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If it's not specified, the default is <code>status=DISABLED</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time
     *        recovery</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withPointInTimeRecoveryOverride(PointInTimeRecovery pointInTimeRecoveryOverride) {
        setPointInTimeRecoveryOverride(pointInTimeRecoveryOverride);
        return this;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the restored table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return A list of key-value pair tags to be attached to the restored table. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and
     *         labels to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public java.util.List<Tag> getTagsOverride() {
        return tagsOverride;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the restored table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tagsOverride
     *        A list of key-value pair tags to be attached to the restored table. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setTagsOverride(java.util.Collection<Tag> tagsOverride) {
        if (tagsOverride == null) {
            this.tagsOverride = null;
            return;
        }

        this.tagsOverride = new java.util.ArrayList<Tag>(tagsOverride);
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the restored table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsOverride(java.util.Collection)} or {@link #withTagsOverride(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsOverride
     *        A list of key-value pair tags to be attached to the restored table. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withTagsOverride(Tag... tagsOverride) {
        if (this.tagsOverride == null) {
            setTagsOverride(new java.util.ArrayList<Tag>(tagsOverride.length));
        }
        for (Tag ele : tagsOverride) {
            this.tagsOverride.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the restored table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tagsOverride
     *        A list of key-value pair tags to be attached to the restored table. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withTagsOverride(java.util.Collection<Tag> tagsOverride) {
        setTagsOverride(tagsOverride);
        return this;
    }

    /**
     * <p>
     * The optional auto scaling settings for the restored table in provisioned capacity mode. Specifies if the service
     * can manage throughput capacity of a provisioned table automatically on your behalf. Amazon Keyspaces auto scaling
     * helps you provision throughput capacity for variable workloads efficiently by increasing and decreasing your
     * table's read and write capacity automatically in response to application traffic.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html">Managing throughput capacity
     * automatically with Amazon Keyspaces auto scaling</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param autoScalingSpecification
     *        The optional auto scaling settings for the restored table in provisioned capacity mode. Specifies if the
     *        service can manage throughput capacity of a provisioned table automatically on your behalf. Amazon
     *        Keyspaces auto scaling helps you provision throughput capacity for variable workloads efficiently by
     *        increasing and decreasing your table's read and write capacity automatically in response to application
     *        traffic.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html">Managing throughput capacity
     *        automatically with Amazon Keyspaces auto scaling</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setAutoScalingSpecification(AutoScalingSpecification autoScalingSpecification) {
        this.autoScalingSpecification = autoScalingSpecification;
    }

    /**
     * <p>
     * The optional auto scaling settings for the restored table in provisioned capacity mode. Specifies if the service
     * can manage throughput capacity of a provisioned table automatically on your behalf. Amazon Keyspaces auto scaling
     * helps you provision throughput capacity for variable workloads efficiently by increasing and decreasing your
     * table's read and write capacity automatically in response to application traffic.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html">Managing throughput capacity
     * automatically with Amazon Keyspaces auto scaling</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return The optional auto scaling settings for the restored table in provisioned capacity mode. Specifies if the
     *         service can manage throughput capacity of a provisioned table automatically on your behalf. Amazon
     *         Keyspaces auto scaling helps you provision throughput capacity for variable workloads efficiently by
     *         increasing and decreasing your table's read and write capacity automatically in response to application
     *         traffic.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html">Managing throughput
     *         capacity automatically with Amazon Keyspaces auto scaling</a> in the <i>Amazon Keyspaces Developer
     *         Guide</i>.
     */

    public AutoScalingSpecification getAutoScalingSpecification() {
        return this.autoScalingSpecification;
    }

    /**
     * <p>
     * The optional auto scaling settings for the restored table in provisioned capacity mode. Specifies if the service
     * can manage throughput capacity of a provisioned table automatically on your behalf. Amazon Keyspaces auto scaling
     * helps you provision throughput capacity for variable workloads efficiently by increasing and decreasing your
     * table's read and write capacity automatically in response to application traffic.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html">Managing throughput capacity
     * automatically with Amazon Keyspaces auto scaling</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param autoScalingSpecification
     *        The optional auto scaling settings for the restored table in provisioned capacity mode. Specifies if the
     *        service can manage throughput capacity of a provisioned table automatically on your behalf. Amazon
     *        Keyspaces auto scaling helps you provision throughput capacity for variable workloads efficiently by
     *        increasing and decreasing your table's read and write capacity automatically in response to application
     *        traffic.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html">Managing throughput capacity
     *        automatically with Amazon Keyspaces auto scaling</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withAutoScalingSpecification(AutoScalingSpecification autoScalingSpecification) {
        setAutoScalingSpecification(autoScalingSpecification);
        return this;
    }

    /**
     * <p>
     * The optional Region specific settings of a multi-Regional table.
     * </p>
     * 
     * @return The optional Region specific settings of a multi-Regional table.
     */

    public java.util.List<ReplicaSpecification> getReplicaSpecifications() {
        return replicaSpecifications;
    }

    /**
     * <p>
     * The optional Region specific settings of a multi-Regional table.
     * </p>
     * 
     * @param replicaSpecifications
     *        The optional Region specific settings of a multi-Regional table.
     */

    public void setReplicaSpecifications(java.util.Collection<ReplicaSpecification> replicaSpecifications) {
        if (replicaSpecifications == null) {
            this.replicaSpecifications = null;
            return;
        }

        this.replicaSpecifications = new java.util.ArrayList<ReplicaSpecification>(replicaSpecifications);
    }

    /**
     * <p>
     * The optional Region specific settings of a multi-Regional table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaSpecifications(java.util.Collection)} or
     * {@link #withReplicaSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicaSpecifications
     *        The optional Region specific settings of a multi-Regional table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withReplicaSpecifications(ReplicaSpecification... replicaSpecifications) {
        if (this.replicaSpecifications == null) {
            setReplicaSpecifications(new java.util.ArrayList<ReplicaSpecification>(replicaSpecifications.length));
        }
        for (ReplicaSpecification ele : replicaSpecifications) {
            this.replicaSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The optional Region specific settings of a multi-Regional table.
     * </p>
     * 
     * @param replicaSpecifications
     *        The optional Region specific settings of a multi-Regional table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableRequest withReplicaSpecifications(java.util.Collection<ReplicaSpecification> replicaSpecifications) {
        setReplicaSpecifications(replicaSpecifications);
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
        if (getSourceKeyspaceName() != null)
            sb.append("SourceKeyspaceName: ").append(getSourceKeyspaceName()).append(",");
        if (getSourceTableName() != null)
            sb.append("SourceTableName: ").append(getSourceTableName()).append(",");
        if (getTargetKeyspaceName() != null)
            sb.append("TargetKeyspaceName: ").append(getTargetKeyspaceName()).append(",");
        if (getTargetTableName() != null)
            sb.append("TargetTableName: ").append(getTargetTableName()).append(",");
        if (getRestoreTimestamp() != null)
            sb.append("RestoreTimestamp: ").append(getRestoreTimestamp()).append(",");
        if (getCapacitySpecificationOverride() != null)
            sb.append("CapacitySpecificationOverride: ").append(getCapacitySpecificationOverride()).append(",");
        if (getEncryptionSpecificationOverride() != null)
            sb.append("EncryptionSpecificationOverride: ").append(getEncryptionSpecificationOverride()).append(",");
        if (getPointInTimeRecoveryOverride() != null)
            sb.append("PointInTimeRecoveryOverride: ").append(getPointInTimeRecoveryOverride()).append(",");
        if (getTagsOverride() != null)
            sb.append("TagsOverride: ").append(getTagsOverride()).append(",");
        if (getAutoScalingSpecification() != null)
            sb.append("AutoScalingSpecification: ").append(getAutoScalingSpecification()).append(",");
        if (getReplicaSpecifications() != null)
            sb.append("ReplicaSpecifications: ").append(getReplicaSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableRequest == false)
            return false;
        RestoreTableRequest other = (RestoreTableRequest) obj;
        if (other.getSourceKeyspaceName() == null ^ this.getSourceKeyspaceName() == null)
            return false;
        if (other.getSourceKeyspaceName() != null && other.getSourceKeyspaceName().equals(this.getSourceKeyspaceName()) == false)
            return false;
        if (other.getSourceTableName() == null ^ this.getSourceTableName() == null)
            return false;
        if (other.getSourceTableName() != null && other.getSourceTableName().equals(this.getSourceTableName()) == false)
            return false;
        if (other.getTargetKeyspaceName() == null ^ this.getTargetKeyspaceName() == null)
            return false;
        if (other.getTargetKeyspaceName() != null && other.getTargetKeyspaceName().equals(this.getTargetKeyspaceName()) == false)
            return false;
        if (other.getTargetTableName() == null ^ this.getTargetTableName() == null)
            return false;
        if (other.getTargetTableName() != null && other.getTargetTableName().equals(this.getTargetTableName()) == false)
            return false;
        if (other.getRestoreTimestamp() == null ^ this.getRestoreTimestamp() == null)
            return false;
        if (other.getRestoreTimestamp() != null && other.getRestoreTimestamp().equals(this.getRestoreTimestamp()) == false)
            return false;
        if (other.getCapacitySpecificationOverride() == null ^ this.getCapacitySpecificationOverride() == null)
            return false;
        if (other.getCapacitySpecificationOverride() != null
                && other.getCapacitySpecificationOverride().equals(this.getCapacitySpecificationOverride()) == false)
            return false;
        if (other.getEncryptionSpecificationOverride() == null ^ this.getEncryptionSpecificationOverride() == null)
            return false;
        if (other.getEncryptionSpecificationOverride() != null
                && other.getEncryptionSpecificationOverride().equals(this.getEncryptionSpecificationOverride()) == false)
            return false;
        if (other.getPointInTimeRecoveryOverride() == null ^ this.getPointInTimeRecoveryOverride() == null)
            return false;
        if (other.getPointInTimeRecoveryOverride() != null && other.getPointInTimeRecoveryOverride().equals(this.getPointInTimeRecoveryOverride()) == false)
            return false;
        if (other.getTagsOverride() == null ^ this.getTagsOverride() == null)
            return false;
        if (other.getTagsOverride() != null && other.getTagsOverride().equals(this.getTagsOverride()) == false)
            return false;
        if (other.getAutoScalingSpecification() == null ^ this.getAutoScalingSpecification() == null)
            return false;
        if (other.getAutoScalingSpecification() != null && other.getAutoScalingSpecification().equals(this.getAutoScalingSpecification()) == false)
            return false;
        if (other.getReplicaSpecifications() == null ^ this.getReplicaSpecifications() == null)
            return false;
        if (other.getReplicaSpecifications() != null && other.getReplicaSpecifications().equals(this.getReplicaSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceKeyspaceName() == null) ? 0 : getSourceKeyspaceName().hashCode());
        hashCode = prime * hashCode + ((getSourceTableName() == null) ? 0 : getSourceTableName().hashCode());
        hashCode = prime * hashCode + ((getTargetKeyspaceName() == null) ? 0 : getTargetKeyspaceName().hashCode());
        hashCode = prime * hashCode + ((getTargetTableName() == null) ? 0 : getTargetTableName().hashCode());
        hashCode = prime * hashCode + ((getRestoreTimestamp() == null) ? 0 : getRestoreTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCapacitySpecificationOverride() == null) ? 0 : getCapacitySpecificationOverride().hashCode());
        hashCode = prime * hashCode + ((getEncryptionSpecificationOverride() == null) ? 0 : getEncryptionSpecificationOverride().hashCode());
        hashCode = prime * hashCode + ((getPointInTimeRecoveryOverride() == null) ? 0 : getPointInTimeRecoveryOverride().hashCode());
        hashCode = prime * hashCode + ((getTagsOverride() == null) ? 0 : getTagsOverride().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingSpecification() == null) ? 0 : getAutoScalingSpecification().hashCode());
        hashCode = prime * hashCode + ((getReplicaSpecifications() == null) ? 0 : getReplicaSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTableRequest clone() {
        return (RestoreTableRequest) super.clone();
    }

}
