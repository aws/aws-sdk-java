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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about each custom key store in the custom key store list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CustomKeyStoresListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomKeyStoresListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the custom key store.
     * </p>
     */
    private String customKeyStoreId;
    /**
     * <p>
     * The user-specified friendly name for the custom key store.
     * </p>
     */
    private String customKeyStoreName;
    /**
     * <p>
     * A unique identifier for the AWS CloudHSM cluster that is associated with the custom key store.
     * </p>
     */
    private String cloudHsmClusterId;
    /**
     * <p>
     * The trust anchor certificate of the associated AWS CloudHSM cluster. When you <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize the
     * cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     * </p>
     */
    private String trustAnchorCertificate;
    /**
     * <p>
     * Indicates whether the custom key store is connected to its AWS CloudHSM cluster.
     * </p>
     * <p>
     * You can create and use CMKs in your custom key stores only when its connection state is <code>CONNECTED</code>.
     * </p>
     * <p>
     * The value is <code>DISCONNECTED</code> if the key store has never been connected or you use the
     * <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is <code>CONNECTED</code> but you are
     * having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is active and
     * contains at least one active HSM.
     * </p>
     * <p>
     * A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. For help resolving a
     * connection failure, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom Key
     * Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private String connectionState;
    /**
     * <p>
     * Describes the connection error. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTER_NOT_FOUND</code> - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CLOUDHSM_HSMS</code> - The associated AWS CloudHSM cluster does not contain any active HSMs.
     * To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one active HSM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> - AWS KMS does not have the correct password for the <code>kmsuser</code> crypto
     * user in the AWS CloudHSM cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERRORS</code> - Network errors are preventing AWS KMS from connecting to the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOCKED_OUT</code> - The <code>kmsuser</code> CU account is locked out of the associated AWS CloudHSM
     * cluster due to too many failed password attempts. Before you can connect your custom key store to its AWS
     * CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the password value for the
     * custom key store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For help with connection failures, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting Custom Key
     * Stores</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private String connectionErrorCode;
    /**
     * <p>
     * The date and time when the custom key store was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * A unique identifier for the custom key store.
     * </p>
     * 
     * @param customKeyStoreId
     *        A unique identifier for the custom key store.
     */

    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * A unique identifier for the custom key store.
     * </p>
     * 
     * @return A unique identifier for the custom key store.
     */

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    /**
     * <p>
     * A unique identifier for the custom key store.
     * </p>
     * 
     * @param customKeyStoreId
     *        A unique identifier for the custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomKeyStoresListEntry withCustomKeyStoreId(String customKeyStoreId) {
        setCustomKeyStoreId(customKeyStoreId);
        return this;
    }

    /**
     * <p>
     * The user-specified friendly name for the custom key store.
     * </p>
     * 
     * @param customKeyStoreName
     *        The user-specified friendly name for the custom key store.
     */

    public void setCustomKeyStoreName(String customKeyStoreName) {
        this.customKeyStoreName = customKeyStoreName;
    }

    /**
     * <p>
     * The user-specified friendly name for the custom key store.
     * </p>
     * 
     * @return The user-specified friendly name for the custom key store.
     */

    public String getCustomKeyStoreName() {
        return this.customKeyStoreName;
    }

    /**
     * <p>
     * The user-specified friendly name for the custom key store.
     * </p>
     * 
     * @param customKeyStoreName
     *        The user-specified friendly name for the custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomKeyStoresListEntry withCustomKeyStoreName(String customKeyStoreName) {
        setCustomKeyStoreName(customKeyStoreName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the AWS CloudHSM cluster that is associated with the custom key store.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        A unique identifier for the AWS CloudHSM cluster that is associated with the custom key store.
     */

    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * A unique identifier for the AWS CloudHSM cluster that is associated with the custom key store.
     * </p>
     * 
     * @return A unique identifier for the AWS CloudHSM cluster that is associated with the custom key store.
     */

    public String getCloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }

    /**
     * <p>
     * A unique identifier for the AWS CloudHSM cluster that is associated with the custom key store.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        A unique identifier for the AWS CloudHSM cluster that is associated with the custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomKeyStoresListEntry withCloudHsmClusterId(String cloudHsmClusterId) {
        setCloudHsmClusterId(cloudHsmClusterId);
        return this;
    }

    /**
     * <p>
     * The trust anchor certificate of the associated AWS CloudHSM cluster. When you <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize the
     * cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     * </p>
     * 
     * @param trustAnchorCertificate
     *        The trust anchor certificate of the associated AWS CloudHSM cluster. When you <a
     *        href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize
     *        the cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     */

    public void setTrustAnchorCertificate(String trustAnchorCertificate) {
        this.trustAnchorCertificate = trustAnchorCertificate;
    }

    /**
     * <p>
     * The trust anchor certificate of the associated AWS CloudHSM cluster. When you <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize the
     * cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     * </p>
     * 
     * @return The trust anchor certificate of the associated AWS CloudHSM cluster. When you <a
     *         href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize
     *         the cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     */

    public String getTrustAnchorCertificate() {
        return this.trustAnchorCertificate;
    }

    /**
     * <p>
     * The trust anchor certificate of the associated AWS CloudHSM cluster. When you <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize the
     * cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     * </p>
     * 
     * @param trustAnchorCertificate
     *        The trust anchor certificate of the associated AWS CloudHSM cluster. When you <a
     *        href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize
     *        the cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomKeyStoresListEntry withTrustAnchorCertificate(String trustAnchorCertificate) {
        setTrustAnchorCertificate(trustAnchorCertificate);
        return this;
    }

    /**
     * <p>
     * Indicates whether the custom key store is connected to its AWS CloudHSM cluster.
     * </p>
     * <p>
     * You can create and use CMKs in your custom key stores only when its connection state is <code>CONNECTED</code>.
     * </p>
     * <p>
     * The value is <code>DISCONNECTED</code> if the key store has never been connected or you use the
     * <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is <code>CONNECTED</code> but you are
     * having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is active and
     * contains at least one active HSM.
     * </p>
     * <p>
     * A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. For help resolving a
     * connection failure, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom Key
     * Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param connectionState
     *        Indicates whether the custom key store is connected to its AWS CloudHSM cluster.</p>
     *        <p>
     *        You can create and use CMKs in your custom key stores only when its connection state is
     *        <code>CONNECTED</code>.
     *        </p>
     *        <p>
     *        The value is <code>DISCONNECTED</code> if the key store has never been connected or you use the
     *        <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is <code>CONNECTED</code> but you
     *        are having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is
     *        active and contains at least one active HSM.
     *        </p>
     *        <p>
     *        A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. For help resolving a
     *        connection failure, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom Key
     *        Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see ConnectionStateType
     */

    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * <p>
     * Indicates whether the custom key store is connected to its AWS CloudHSM cluster.
     * </p>
     * <p>
     * You can create and use CMKs in your custom key stores only when its connection state is <code>CONNECTED</code>.
     * </p>
     * <p>
     * The value is <code>DISCONNECTED</code> if the key store has never been connected or you use the
     * <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is <code>CONNECTED</code> but you are
     * having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is active and
     * contains at least one active HSM.
     * </p>
     * <p>
     * A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. For help resolving a
     * connection failure, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom Key
     * Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Indicates whether the custom key store is connected to its AWS CloudHSM cluster.</p>
     *         <p>
     *         You can create and use CMKs in your custom key stores only when its connection state is
     *         <code>CONNECTED</code>.
     *         </p>
     *         <p>
     *         The value is <code>DISCONNECTED</code> if the key store has never been connected or you use the
     *         <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is <code>CONNECTED</code> but
     *         you are having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is
     *         active and contains at least one active HSM.
     *         </p>
     *         <p>
     *         A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. For help resolving
     *         a connection failure, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom
     *         Key Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see ConnectionStateType
     */

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * <p>
     * Indicates whether the custom key store is connected to its AWS CloudHSM cluster.
     * </p>
     * <p>
     * You can create and use CMKs in your custom key stores only when its connection state is <code>CONNECTED</code>.
     * </p>
     * <p>
     * The value is <code>DISCONNECTED</code> if the key store has never been connected or you use the
     * <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is <code>CONNECTED</code> but you are
     * having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is active and
     * contains at least one active HSM.
     * </p>
     * <p>
     * A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. For help resolving a
     * connection failure, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom Key
     * Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param connectionState
     *        Indicates whether the custom key store is connected to its AWS CloudHSM cluster.</p>
     *        <p>
     *        You can create and use CMKs in your custom key stores only when its connection state is
     *        <code>CONNECTED</code>.
     *        </p>
     *        <p>
     *        The value is <code>DISCONNECTED</code> if the key store has never been connected or you use the
     *        <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is <code>CONNECTED</code> but you
     *        are having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is
     *        active and contains at least one active HSM.
     *        </p>
     *        <p>
     *        A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. For help resolving a
     *        connection failure, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom Key
     *        Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStateType
     */

    public CustomKeyStoresListEntry withConnectionState(String connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * <p>
     * Indicates whether the custom key store is connected to its AWS CloudHSM cluster.
     * </p>
     * <p>
     * You can create and use CMKs in your custom key stores only when its connection state is <code>CONNECTED</code>.
     * </p>
     * <p>
     * The value is <code>DISCONNECTED</code> if the key store has never been connected or you use the
     * <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is <code>CONNECTED</code> but you are
     * having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is active and
     * contains at least one active HSM.
     * </p>
     * <p>
     * A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. For help resolving a
     * connection failure, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom Key
     * Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param connectionState
     *        Indicates whether the custom key store is connected to its AWS CloudHSM cluster.</p>
     *        <p>
     *        You can create and use CMKs in your custom key stores only when its connection state is
     *        <code>CONNECTED</code>.
     *        </p>
     *        <p>
     *        The value is <code>DISCONNECTED</code> if the key store has never been connected or you use the
     *        <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is <code>CONNECTED</code> but you
     *        are having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is
     *        active and contains at least one active HSM.
     *        </p>
     *        <p>
     *        A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. For help resolving a
     *        connection failure, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom Key
     *        Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStateType
     */

    public CustomKeyStoresListEntry withConnectionState(ConnectionStateType connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }

    /**
     * <p>
     * Describes the connection error. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTER_NOT_FOUND</code> - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CLOUDHSM_HSMS</code> - The associated AWS CloudHSM cluster does not contain any active HSMs.
     * To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one active HSM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> - AWS KMS does not have the correct password for the <code>kmsuser</code> crypto
     * user in the AWS CloudHSM cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERRORS</code> - Network errors are preventing AWS KMS from connecting to the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOCKED_OUT</code> - The <code>kmsuser</code> CU account is locked out of the associated AWS CloudHSM
     * cluster due to too many failed password attempts. Before you can connect your custom key store to its AWS
     * CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the password value for the
     * custom key store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For help with connection failures, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting Custom Key
     * Stores</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param connectionErrorCode
     *        Describes the connection error. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLUSTER_NOT_FOUND</code> - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster
     *        ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_CLOUDHSM_HSMS</code> - The associated AWS CloudHSM cluster does not contain any active
     *        HSMs. To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one
     *        active HSM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_CREDENTIALS</code> - AWS KMS does not have the correct password for the <code>kmsuser</code>
     *        crypto user in the AWS CloudHSM cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_ERRORS</code> - Network errors are preventing AWS KMS from connecting to the custom key
     *        store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_LOCKED_OUT</code> - The <code>kmsuser</code> CU account is locked out of the associated AWS
     *        CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to
     *        its AWS CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the
     *        password value for the custom key store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For help with connection failures, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting Custom Key
     *        Stores</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see ConnectionErrorCodeType
     */

    public void setConnectionErrorCode(String connectionErrorCode) {
        this.connectionErrorCode = connectionErrorCode;
    }

    /**
     * <p>
     * Describes the connection error. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTER_NOT_FOUND</code> - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CLOUDHSM_HSMS</code> - The associated AWS CloudHSM cluster does not contain any active HSMs.
     * To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one active HSM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> - AWS KMS does not have the correct password for the <code>kmsuser</code> crypto
     * user in the AWS CloudHSM cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERRORS</code> - Network errors are preventing AWS KMS from connecting to the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOCKED_OUT</code> - The <code>kmsuser</code> CU account is locked out of the associated AWS CloudHSM
     * cluster due to too many failed password attempts. Before you can connect your custom key store to its AWS
     * CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the password value for the
     * custom key store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For help with connection failures, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting Custom Key
     * Stores</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Describes the connection error. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CLUSTER_NOT_FOUND</code> - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster
     *         ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSUFFICIENT_CLOUDHSM_HSMS</code> - The associated AWS CloudHSM cluster does not contain any active
     *         HSMs. To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one
     *         active HSM.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID_CREDENTIALS</code> - AWS KMS does not have the correct password for the
     *         <code>kmsuser</code> crypto user in the AWS CloudHSM cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NETWORK_ERRORS</code> - Network errors are preventing AWS KMS from connecting to the custom key
     *         store.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>USER_LOCKED_OUT</code> - The <code>kmsuser</code> CU account is locked out of the associated AWS
     *         CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store
     *         to its AWS CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the
     *         password value for the custom key store.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For help with connection failures, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting Custom Key
     *         Stores</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see ConnectionErrorCodeType
     */

    public String getConnectionErrorCode() {
        return this.connectionErrorCode;
    }

    /**
     * <p>
     * Describes the connection error. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTER_NOT_FOUND</code> - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CLOUDHSM_HSMS</code> - The associated AWS CloudHSM cluster does not contain any active HSMs.
     * To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one active HSM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> - AWS KMS does not have the correct password for the <code>kmsuser</code> crypto
     * user in the AWS CloudHSM cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERRORS</code> - Network errors are preventing AWS KMS from connecting to the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOCKED_OUT</code> - The <code>kmsuser</code> CU account is locked out of the associated AWS CloudHSM
     * cluster due to too many failed password attempts. Before you can connect your custom key store to its AWS
     * CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the password value for the
     * custom key store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For help with connection failures, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting Custom Key
     * Stores</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param connectionErrorCode
     *        Describes the connection error. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLUSTER_NOT_FOUND</code> - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster
     *        ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_CLOUDHSM_HSMS</code> - The associated AWS CloudHSM cluster does not contain any active
     *        HSMs. To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one
     *        active HSM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_CREDENTIALS</code> - AWS KMS does not have the correct password for the <code>kmsuser</code>
     *        crypto user in the AWS CloudHSM cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_ERRORS</code> - Network errors are preventing AWS KMS from connecting to the custom key
     *        store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_LOCKED_OUT</code> - The <code>kmsuser</code> CU account is locked out of the associated AWS
     *        CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to
     *        its AWS CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the
     *        password value for the custom key store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For help with connection failures, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting Custom Key
     *        Stores</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionErrorCodeType
     */

    public CustomKeyStoresListEntry withConnectionErrorCode(String connectionErrorCode) {
        setConnectionErrorCode(connectionErrorCode);
        return this;
    }

    /**
     * <p>
     * Describes the connection error. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTER_NOT_FOUND</code> - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CLOUDHSM_HSMS</code> - The associated AWS CloudHSM cluster does not contain any active HSMs.
     * To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one active HSM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> - AWS KMS does not have the correct password for the <code>kmsuser</code> crypto
     * user in the AWS CloudHSM cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERRORS</code> - Network errors are preventing AWS KMS from connecting to the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOCKED_OUT</code> - The <code>kmsuser</code> CU account is locked out of the associated AWS CloudHSM
     * cluster due to too many failed password attempts. Before you can connect your custom key store to its AWS
     * CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the password value for the
     * custom key store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For help with connection failures, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting Custom Key
     * Stores</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param connectionErrorCode
     *        Describes the connection error. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLUSTER_NOT_FOUND</code> - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster
     *        ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_CLOUDHSM_HSMS</code> - The associated AWS CloudHSM cluster does not contain any active
     *        HSMs. To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one
     *        active HSM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_CREDENTIALS</code> - AWS KMS does not have the correct password for the <code>kmsuser</code>
     *        crypto user in the AWS CloudHSM cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_ERRORS</code> - Network errors are preventing AWS KMS from connecting to the custom key
     *        store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_LOCKED_OUT</code> - The <code>kmsuser</code> CU account is locked out of the associated AWS
     *        CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to
     *        its AWS CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the
     *        password value for the custom key store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For help with connection failures, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting Custom Key
     *        Stores</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionErrorCodeType
     */

    public CustomKeyStoresListEntry withConnectionErrorCode(ConnectionErrorCodeType connectionErrorCode) {
        this.connectionErrorCode = connectionErrorCode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the custom key store was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the custom key store was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the custom key store was created.
     * </p>
     * 
     * @return The date and time when the custom key store was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the custom key store was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the custom key store was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomKeyStoresListEntry withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: ").append(getCustomKeyStoreId()).append(",");
        if (getCustomKeyStoreName() != null)
            sb.append("CustomKeyStoreName: ").append(getCustomKeyStoreName()).append(",");
        if (getCloudHsmClusterId() != null)
            sb.append("CloudHsmClusterId: ").append(getCloudHsmClusterId()).append(",");
        if (getTrustAnchorCertificate() != null)
            sb.append("TrustAnchorCertificate: ").append(getTrustAnchorCertificate()).append(",");
        if (getConnectionState() != null)
            sb.append("ConnectionState: ").append(getConnectionState()).append(",");
        if (getConnectionErrorCode() != null)
            sb.append("ConnectionErrorCode: ").append(getConnectionErrorCode()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomKeyStoresListEntry == false)
            return false;
        CustomKeyStoresListEntry other = (CustomKeyStoresListEntry) obj;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getCustomKeyStoreName() == null ^ this.getCustomKeyStoreName() == null)
            return false;
        if (other.getCustomKeyStoreName() != null && other.getCustomKeyStoreName().equals(this.getCustomKeyStoreName()) == false)
            return false;
        if (other.getCloudHsmClusterId() == null ^ this.getCloudHsmClusterId() == null)
            return false;
        if (other.getCloudHsmClusterId() != null && other.getCloudHsmClusterId().equals(this.getCloudHsmClusterId()) == false)
            return false;
        if (other.getTrustAnchorCertificate() == null ^ this.getTrustAnchorCertificate() == null)
            return false;
        if (other.getTrustAnchorCertificate() != null && other.getTrustAnchorCertificate().equals(this.getTrustAnchorCertificate()) == false)
            return false;
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        if (other.getConnectionErrorCode() == null ^ this.getConnectionErrorCode() == null)
            return false;
        if (other.getConnectionErrorCode() != null && other.getConnectionErrorCode().equals(this.getConnectionErrorCode()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime * hashCode + ((getCustomKeyStoreName() == null) ? 0 : getCustomKeyStoreName().hashCode());
        hashCode = prime * hashCode + ((getCloudHsmClusterId() == null) ? 0 : getCloudHsmClusterId().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchorCertificate() == null) ? 0 : getTrustAnchorCertificate().hashCode());
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        hashCode = prime * hashCode + ((getConnectionErrorCode() == null) ? 0 : getConnectionErrorCode().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public CustomKeyStoresListEntry clone() {
        try {
            return (CustomKeyStoresListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.CustomKeyStoresListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
