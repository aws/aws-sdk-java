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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata about an KMS key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsKmsKeyDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsKmsKeyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The twelve-digit account ID of the Amazon Web Services account that owns the KMS key.
     * </p>
     */
    private String aWSAccountId;
    /**
     * <p>
     * Indicates when the KMS key was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private Double creationDate;
    /**
     * <p>
     * The globally unique identifier for the KMS key.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The manager of the KMS key. KMS keys in your Amazon Web Services account are either customer managed or Amazon
     * Web Services managed.
     * </p>
     */
    private String keyManager;
    /**
     * <p>
     * The state of the KMS key. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Disabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingDeletion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingImport</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unavailable</code>
     * </p>
     * </li>
     * </ul>
     */
    private String keyState;
    /**
     * <p>
     * The source of the KMS key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the KMS key lacks key material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM cluster associated
     * with a custom key store.
     * </p>
     */
    private String origin;
    /**
     * <p>
     * A description of the KMS key.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether the key has key rotation enabled.
     * </p>
     */
    private Boolean keyRotationStatus;

    /**
     * <p>
     * The twelve-digit account ID of the Amazon Web Services account that owns the KMS key.
     * </p>
     * 
     * @param aWSAccountId
     *        The twelve-digit account ID of the Amazon Web Services account that owns the KMS key.
     */

    public void setAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the Amazon Web Services account that owns the KMS key.
     * </p>
     * 
     * @return The twelve-digit account ID of the Amazon Web Services account that owns the KMS key.
     */

    public String getAWSAccountId() {
        return this.aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the Amazon Web Services account that owns the KMS key.
     * </p>
     * 
     * @param aWSAccountId
     *        The twelve-digit account ID of the Amazon Web Services account that owns the KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withAWSAccountId(String aWSAccountId) {
        setAWSAccountId(aWSAccountId);
        return this;
    }

    /**
     * <p>
     * Indicates when the KMS key was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param creationDate
     *        Indicates when the KMS key was created.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setCreationDate(Double creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * Indicates when the KMS key was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates when the KMS key was created.</p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public Double getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * Indicates when the KMS key was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param creationDate
     *        Indicates when the KMS key was created.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withCreationDate(Double creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The globally unique identifier for the KMS key.
     * </p>
     * 
     * @param keyId
     *        The globally unique identifier for the KMS key.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the KMS key.
     * </p>
     * 
     * @return The globally unique identifier for the KMS key.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the KMS key.
     * </p>
     * 
     * @param keyId
     *        The globally unique identifier for the KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The manager of the KMS key. KMS keys in your Amazon Web Services account are either customer managed or Amazon
     * Web Services managed.
     * </p>
     * 
     * @param keyManager
     *        The manager of the KMS key. KMS keys in your Amazon Web Services account are either customer managed or
     *        Amazon Web Services managed.
     */

    public void setKeyManager(String keyManager) {
        this.keyManager = keyManager;
    }

    /**
     * <p>
     * The manager of the KMS key. KMS keys in your Amazon Web Services account are either customer managed or Amazon
     * Web Services managed.
     * </p>
     * 
     * @return The manager of the KMS key. KMS keys in your Amazon Web Services account are either customer managed or
     *         Amazon Web Services managed.
     */

    public String getKeyManager() {
        return this.keyManager;
    }

    /**
     * <p>
     * The manager of the KMS key. KMS keys in your Amazon Web Services account are either customer managed or Amazon
     * Web Services managed.
     * </p>
     * 
     * @param keyManager
     *        The manager of the KMS key. KMS keys in your Amazon Web Services account are either customer managed or
     *        Amazon Web Services managed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withKeyManager(String keyManager) {
        setKeyManager(keyManager);
        return this;
    }

    /**
     * <p>
     * The state of the KMS key. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Disabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingDeletion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingImport</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unavailable</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyState
     *        The state of the KMS key. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Disabled</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Enabled</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PendingDeletion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PendingImport</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unavailable</code>
     *        </p>
     *        </li>
     */

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    /**
     * <p>
     * The state of the KMS key. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Disabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingDeletion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingImport</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unavailable</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the KMS key. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Disabled</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Enabled</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PendingDeletion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PendingImport</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unavailable</code>
     *         </p>
     *         </li>
     */

    public String getKeyState() {
        return this.keyState;
    }

    /**
     * <p>
     * The state of the KMS key. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Disabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingDeletion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingImport</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unavailable</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyState
     *        The state of the KMS key. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Disabled</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Enabled</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PendingDeletion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PendingImport</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unavailable</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withKeyState(String keyState) {
        setKeyState(keyState);
        return this;
    }

    /**
     * <p>
     * The source of the KMS key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the KMS key lacks key material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM cluster associated
     * with a custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the KMS key material.</p>
     *        <p>
     *        When this value is <code>AWS_KMS</code>, KMS created the key material.
     *        </p>
     *        <p>
     *        When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     *        infrastructure or the KMS key lacks key material.
     *        </p>
     *        <p>
     *        When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM cluster
     *        associated with a custom key store.
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * The source of the KMS key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the KMS key lacks key material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM cluster associated
     * with a custom key store.
     * </p>
     * 
     * @return The source of the KMS key material.</p>
     *         <p>
     *         When this value is <code>AWS_KMS</code>, KMS created the key material.
     *         </p>
     *         <p>
     *         When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     *         infrastructure or the KMS key lacks key material.
     *         </p>
     *         <p>
     *         When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM cluster
     *         associated with a custom key store.
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * The source of the KMS key material.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material.
     * </p>
     * <p>
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the KMS key lacks key material.
     * </p>
     * <p>
     * When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM cluster associated
     * with a custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the KMS key material.</p>
     *        <p>
     *        When this value is <code>AWS_KMS</code>, KMS created the key material.
     *        </p>
     *        <p>
     *        When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     *        infrastructure or the KMS key lacks key material.
     *        </p>
     *        <p>
     *        When this value is <code>AWS_CLOUDHSM</code>, the key material was created in the CloudHSM cluster
     *        associated with a custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withOrigin(String origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * A description of the KMS key.
     * </p>
     * 
     * @param description
     *        A description of the KMS key.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the KMS key.
     * </p>
     * 
     * @return A description of the KMS key.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the KMS key.
     * </p>
     * 
     * @param description
     *        A description of the KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether the key has key rotation enabled.
     * </p>
     * 
     * @param keyRotationStatus
     *        Whether the key has key rotation enabled.
     */

    public void setKeyRotationStatus(Boolean keyRotationStatus) {
        this.keyRotationStatus = keyRotationStatus;
    }

    /**
     * <p>
     * Whether the key has key rotation enabled.
     * </p>
     * 
     * @return Whether the key has key rotation enabled.
     */

    public Boolean getKeyRotationStatus() {
        return this.keyRotationStatus;
    }

    /**
     * <p>
     * Whether the key has key rotation enabled.
     * </p>
     * 
     * @param keyRotationStatus
     *        Whether the key has key rotation enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKmsKeyDetails withKeyRotationStatus(Boolean keyRotationStatus) {
        setKeyRotationStatus(keyRotationStatus);
        return this;
    }

    /**
     * <p>
     * Whether the key has key rotation enabled.
     * </p>
     * 
     * @return Whether the key has key rotation enabled.
     */

    public Boolean isKeyRotationStatus() {
        return this.keyRotationStatus;
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
        if (getAWSAccountId() != null)
            sb.append("AWSAccountId: ").append(getAWSAccountId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getKeyManager() != null)
            sb.append("KeyManager: ").append(getKeyManager()).append(",");
        if (getKeyState() != null)
            sb.append("KeyState: ").append(getKeyState()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKeyRotationStatus() != null)
            sb.append("KeyRotationStatus: ").append(getKeyRotationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsKmsKeyDetails == false)
            return false;
        AwsKmsKeyDetails other = (AwsKmsKeyDetails) obj;
        if (other.getAWSAccountId() == null ^ this.getAWSAccountId() == null)
            return false;
        if (other.getAWSAccountId() != null && other.getAWSAccountId().equals(this.getAWSAccountId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyManager() == null ^ this.getKeyManager() == null)
            return false;
        if (other.getKeyManager() != null && other.getKeyManager().equals(this.getKeyManager()) == false)
            return false;
        if (other.getKeyState() == null ^ this.getKeyState() == null)
            return false;
        if (other.getKeyState() != null && other.getKeyState().equals(this.getKeyState()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKeyRotationStatus() == null ^ this.getKeyRotationStatus() == null)
            return false;
        if (other.getKeyRotationStatus() != null && other.getKeyRotationStatus().equals(this.getKeyRotationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAWSAccountId() == null) ? 0 : getAWSAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getKeyManager() == null) ? 0 : getKeyManager().hashCode());
        hashCode = prime * hashCode + ((getKeyState() == null) ? 0 : getKeyState().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKeyRotationStatus() == null) ? 0 : getKeyRotationStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsKmsKeyDetails clone() {
        try {
            return (AwsKmsKeyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsKmsKeyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
