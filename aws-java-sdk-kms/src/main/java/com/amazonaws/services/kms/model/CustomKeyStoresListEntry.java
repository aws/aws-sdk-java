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
     * A unique identifier for the CloudHSM cluster that is associated with an CloudHSM key store. This field appears
     * only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     * </p>
     */
    private String cloudHsmClusterId;
    /**
     * <p>
     * The trust anchor certificate of the CloudHSM cluster associated with an CloudHSM key store. When you <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize the
     * cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     * </p>
     * <p>
     * This field appears only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     * </p>
     */
    private String trustAnchorCertificate;
    /**
     * <p>
     * Indicates whether the custom key store is connected to its backing key store. For an CloudHSM key store, the
     * <code>ConnectionState</code> indicates whether it is connected to its CloudHSM cluster. For an external key
     * store, the <code>ConnectionState</code> indicates whether it is connected to the external key store proxy that
     * communicates with your external key manager.
     * </p>
     * <p>
     * You can create and use KMS keys in your custom key stores only when its <code>ConnectionState</code> is
     * <code>CONNECTED</code>.
     * </p>
     * <p>
     * The <code>ConnectionState</code> value is <code>DISCONNECTED</code> only if the key store has never been
     * connected or you use the <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is
     * <code>CONNECTED</code> but you are having trouble using the custom key store, make sure that the backing key
     * store is reachable and active. For an CloudHSM key store, verify that its associated CloudHSM cluster is active
     * and contains at least one active HSM. For an external key store, verify that the external key store proxy and
     * external key manager are connected and enabled.
     * </p>
     * <p>
     * A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. The
     * <code>ConnectionErrorCode</code> field in the response indicates the cause of the failure. For help resolving a
     * connection failure, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a custom key
     * store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private String connectionState;
    /**
     * <p>
     * Describes the connection error. This field appears in the response only when the <code>ConnectionState</code> is
     * <code>FAILED</code>.
     * </p>
     * <p>
     * Many failures can be resolved by updating the properties of the custom key store. To update a custom key store,
     * disconnect it (<a>DisconnectCustomKeyStore</a>), correct the errors (<a>UpdateCustomKeyStore</a>), and try to
     * connect again (<a>ConnectCustomKeyStore</a>). For additional help resolving these errors, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>All custom key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code> — KMS could not complete the request due to an internal error. Retry the request. For
     * <code>ConnectCustomKeyStore</code> requests, disconnect the custom key store before trying to connect again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERRORS</code> — Network errors are preventing KMS from connecting the custom key store to its
     * backing key store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>CloudHSM key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTER_NOT_FOUND</code> — KMS cannot find the CloudHSM cluster with the specified cluster ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CLOUDHSM_HSMS</code> — The associated CloudHSM cluster does not contain any active HSMs. To
     * connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active HSM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET</code> — At least one private subnet associated with the CloudHSM
     * cluster doesn't have any available IP addresses. A CloudHSM key store connection requires one free IP address in
     * each of the associated private subnets, although two are preferable. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> — The <code>KeyStorePassword</code> for the custom key store doesn't match the
     * current password of the <code>kmsuser</code> crypto user in the CloudHSM cluster. Before you can connect your
     * custom key store to its CloudHSM cluster, you must change the <code>kmsuser</code> account password and update
     * the <code>KeyStorePassword</code> value for the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBNET_NOT_FOUND</code> — A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot find
     * all of the subnets in the cluster configuration, attempts to connect the custom key store to the CloudHSM cluster
     * fail. To fix this error, create a cluster from a recent backup and associate it with your custom key store. (This
     * process creates a new cluster configuration with a VPC and private subnets.) For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOCKED_OUT</code> — The <code>kmsuser</code> CU account is locked out of the associated CloudHSM
     * cluster due to too many failed password attempts. Before you can connect your custom key store to its CloudHSM
     * cluster, you must change the <code>kmsuser</code> account password and update the key store password value for
     * the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOGGED_IN</code> — The <code>kmsuser</code> CU account is logged into the associated CloudHSM cluster.
     * This prevents KMS from rotating the <code>kmsuser</code> account password and logging into the cluster. Before
     * you can connect your custom key store to its CloudHSM cluster, you must log the <code>kmsuser</code> CU out of
     * the cluster. If you changed the <code>kmsuser</code> password to log into the cluster, you must also and update
     * the key store password value for the custom key store. For help, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#login-kmsuser-2">How to Log Out and
     * Reconnect</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NOT_FOUND</code> — KMS cannot find a <code>kmsuser</code> CU account in the associated CloudHSM
     * cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a
     * <code>kmsuser</code> CU account in the cluster, and then update the key store password value for the custom key
     * store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>External key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> — One or both of the <code>XksProxyAuthenticationCredential</code> values is not
     * valid on the specified external key store proxy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_ACCESS_DENIED</code> — KMS requests are denied access to the external key store proxy. If the
     * external key store proxy has authorization rules, verify that they permit KMS to communicate with the proxy on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_CONFIGURATION</code> — A configuration error is preventing the external key store from
     * connecting to its proxy. Verify the value of the <code>XksProxyUriPath</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_RESPONSE</code> — KMS cannot interpret the response from the external key store proxy. If
     * you see this connection error code repeatedly, notify your external key store proxy vendor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_TLS_CONFIGURATION</code> — KMS cannot connect to the external key store proxy because the
     * TLS configuration is invalid. Verify that the XKS proxy supports TLS 1.2 or 1.3. Also, verify that the TLS
     * certificate is not expired, and that it matches the hostname in the <code>XksProxyUriEndpoint</code> value, and
     * that it is signed by a certificate authority included in the <a
     * href="https://github.com/aws/aws-kms-xksproxy-api-spec/blob/main/TrustedCertificateAuthorities">Trusted
     * Certificate Authorities</a> list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_NOT_REACHABLE</code> — KMS can't communicate with your external key store proxy. Verify that the
     * <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> are correct. Use the tools for your external
     * key store proxy to verify that the proxy is active and available on its network. Also, verify that your external
     * key manager instances are operating properly. Connection attempts fail with this connection error code if the
     * proxy reports that all external key manager instances are unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_TIMED_OUT</code> — KMS can connect to the external key store proxy, but the proxy does not
     * respond to KMS in the time allotted. If you see this connection error code repeatedly, notify your external key
     * store proxy vendor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION</code> — The Amazon VPC endpoint service configuration
     * doesn't conform to the requirements for an KMS external key store.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The VPC endpoint service must be an endpoint service for interface endpoints in the caller's Amazon Web Services
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must have a network load balancer (NLB) connected to at least two subnets, each in a different Availability
     * Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Allow principals</code> list must include the KMS service principal for the Region,
     * <code>cks.kms.&lt;region&gt;.amazonaws.com</code>, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must <i>not</i> require <a
     * href="https://docs.aws.amazon.com/vpc/latest/privatelink/create-endpoint-service.html">acceptance</a> of
     * connection requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must have a private DNS name. The private DNS name for an external key store with
     * <code>VPC_ENDPOINT_SERVICE</code> connectivity must be unique in its Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The domain of the private DNS name must have a <a
     * href="https://docs.aws.amazon.com/vpc/latest/privatelink/verify-domains.html">verification status</a> of
     * <code>verified</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS
     * certificate</a> specifies the private DNS hostname at which the endpoint is reachable.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND</code> — KMS can't find the VPC endpoint service that it uses to
     * communicate with the external key store proxy. Verify that the <code>XksProxyVpcEndpointServiceName</code> is
     * correct and the KMS service principal has service consumer permissions on the Amazon VPC endpoint service.
     * </p>
     * </li>
     * </ul>
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
     * Indicates the type of the custom key store. <code>AWS_CLOUDHSM</code> indicates a custom key store backed by an
     * CloudHSM cluster. <code>EXTERNAL_KEY_STORE</code> indicates a custom key store backed by an external key store
     * proxy and external key manager outside of Amazon Web Services.
     * </p>
     */
    private String customKeyStoreType;
    /**
     * <p>
     * Configuration settings for the external key store proxy (XKS proxy). The external key store proxy translates KMS
     * requests into a format that your external key manager can understand. The proxy configuration includes connection
     * information that KMS requires.
     * </p>
     * <p>
     * This field appears only when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     */
    private XksProxyConfigurationType xksProxyConfiguration;

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
     * A unique identifier for the CloudHSM cluster that is associated with an CloudHSM key store. This field appears
     * only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        A unique identifier for the CloudHSM cluster that is associated with an CloudHSM key store. This field
     *        appears only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     */

    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * A unique identifier for the CloudHSM cluster that is associated with an CloudHSM key store. This field appears
     * only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     * </p>
     * 
     * @return A unique identifier for the CloudHSM cluster that is associated with an CloudHSM key store. This field
     *         appears only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     */

    public String getCloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }

    /**
     * <p>
     * A unique identifier for the CloudHSM cluster that is associated with an CloudHSM key store. This field appears
     * only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        A unique identifier for the CloudHSM cluster that is associated with an CloudHSM key store. This field
     *        appears only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomKeyStoresListEntry withCloudHsmClusterId(String cloudHsmClusterId) {
        setCloudHsmClusterId(cloudHsmClusterId);
        return this;
    }

    /**
     * <p>
     * The trust anchor certificate of the CloudHSM cluster associated with an CloudHSM key store. When you <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize the
     * cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     * </p>
     * <p>
     * This field appears only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     * </p>
     * 
     * @param trustAnchorCertificate
     *        The trust anchor certificate of the CloudHSM cluster associated with an CloudHSM key store. When you <a
     *        href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize
     *        the cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.</p>
     *        <p>
     *        This field appears only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     */

    public void setTrustAnchorCertificate(String trustAnchorCertificate) {
        this.trustAnchorCertificate = trustAnchorCertificate;
    }

    /**
     * <p>
     * The trust anchor certificate of the CloudHSM cluster associated with an CloudHSM key store. When you <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize the
     * cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     * </p>
     * <p>
     * This field appears only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     * </p>
     * 
     * @return The trust anchor certificate of the CloudHSM cluster associated with an CloudHSM key store. When you <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize
     *         the cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.</p>
     *         <p>
     *         This field appears only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     */

    public String getTrustAnchorCertificate() {
        return this.trustAnchorCertificate;
    }

    /**
     * <p>
     * The trust anchor certificate of the CloudHSM cluster associated with an CloudHSM key store. When you <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize the
     * cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.
     * </p>
     * <p>
     * This field appears only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     * </p>
     * 
     * @param trustAnchorCertificate
     *        The trust anchor certificate of the CloudHSM cluster associated with an CloudHSM key store. When you <a
     *        href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize
     *        the cluster</a>, you create this certificate and save it in the <code>customerCA.crt</code> file.</p>
     *        <p>
     *        This field appears only when the <code>CustomKeyStoreType</code> is <code>AWS_CLOUDHSM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomKeyStoresListEntry withTrustAnchorCertificate(String trustAnchorCertificate) {
        setTrustAnchorCertificate(trustAnchorCertificate);
        return this;
    }

    /**
     * <p>
     * Indicates whether the custom key store is connected to its backing key store. For an CloudHSM key store, the
     * <code>ConnectionState</code> indicates whether it is connected to its CloudHSM cluster. For an external key
     * store, the <code>ConnectionState</code> indicates whether it is connected to the external key store proxy that
     * communicates with your external key manager.
     * </p>
     * <p>
     * You can create and use KMS keys in your custom key stores only when its <code>ConnectionState</code> is
     * <code>CONNECTED</code>.
     * </p>
     * <p>
     * The <code>ConnectionState</code> value is <code>DISCONNECTED</code> only if the key store has never been
     * connected or you use the <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is
     * <code>CONNECTED</code> but you are having trouble using the custom key store, make sure that the backing key
     * store is reachable and active. For an CloudHSM key store, verify that its associated CloudHSM cluster is active
     * and contains at least one active HSM. For an external key store, verify that the external key store proxy and
     * external key manager are connected and enabled.
     * </p>
     * <p>
     * A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. The
     * <code>ConnectionErrorCode</code> field in the response indicates the cause of the failure. For help resolving a
     * connection failure, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a custom key
     * store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param connectionState
     *        Indicates whether the custom key store is connected to its backing key store. For an CloudHSM key store,
     *        the <code>ConnectionState</code> indicates whether it is connected to its CloudHSM cluster. For an
     *        external key store, the <code>ConnectionState</code> indicates whether it is connected to the external key
     *        store proxy that communicates with your external key manager.</p>
     *        <p>
     *        You can create and use KMS keys in your custom key stores only when its <code>ConnectionState</code> is
     *        <code>CONNECTED</code>.
     *        </p>
     *        <p>
     *        The <code>ConnectionState</code> value is <code>DISCONNECTED</code> only if the key store has never been
     *        connected or you use the <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is
     *        <code>CONNECTED</code> but you are having trouble using the custom key store, make sure that the backing
     *        key store is reachable and active. For an CloudHSM key store, verify that its associated CloudHSM cluster
     *        is active and contains at least one active HSM. For an external key store, verify that the external key
     *        store proxy and external key manager are connected and enabled.
     *        </p>
     *        <p>
     *        A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. The
     *        <code>ConnectionErrorCode</code> field in the response indicates the cause of the failure. For help
     *        resolving a connection failure, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a custom
     *        key store</a> in the <i>Key Management Service Developer Guide</i>.
     * @see ConnectionStateType
     */

    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * <p>
     * Indicates whether the custom key store is connected to its backing key store. For an CloudHSM key store, the
     * <code>ConnectionState</code> indicates whether it is connected to its CloudHSM cluster. For an external key
     * store, the <code>ConnectionState</code> indicates whether it is connected to the external key store proxy that
     * communicates with your external key manager.
     * </p>
     * <p>
     * You can create and use KMS keys in your custom key stores only when its <code>ConnectionState</code> is
     * <code>CONNECTED</code>.
     * </p>
     * <p>
     * The <code>ConnectionState</code> value is <code>DISCONNECTED</code> only if the key store has never been
     * connected or you use the <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is
     * <code>CONNECTED</code> but you are having trouble using the custom key store, make sure that the backing key
     * store is reachable and active. For an CloudHSM key store, verify that its associated CloudHSM cluster is active
     * and contains at least one active HSM. For an external key store, verify that the external key store proxy and
     * external key manager are connected and enabled.
     * </p>
     * <p>
     * A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. The
     * <code>ConnectionErrorCode</code> field in the response indicates the cause of the failure. For help resolving a
     * connection failure, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a custom key
     * store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Indicates whether the custom key store is connected to its backing key store. For an CloudHSM key store,
     *         the <code>ConnectionState</code> indicates whether it is connected to its CloudHSM cluster. For an
     *         external key store, the <code>ConnectionState</code> indicates whether it is connected to the external
     *         key store proxy that communicates with your external key manager.</p>
     *         <p>
     *         You can create and use KMS keys in your custom key stores only when its <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         <p>
     *         The <code>ConnectionState</code> value is <code>DISCONNECTED</code> only if the key store has never been
     *         connected or you use the <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is
     *         <code>CONNECTED</code> but you are having trouble using the custom key store, make sure that the backing
     *         key store is reachable and active. For an CloudHSM key store, verify that its associated CloudHSM cluster
     *         is active and contains at least one active HSM. For an external key store, verify that the external key
     *         store proxy and external key manager are connected and enabled.
     *         </p>
     *         <p>
     *         A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. The
     *         <code>ConnectionErrorCode</code> field in the response indicates the cause of the failure. For help
     *         resolving a connection failure, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a custom
     *         key store</a> in the <i>Key Management Service Developer Guide</i>.
     * @see ConnectionStateType
     */

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * <p>
     * Indicates whether the custom key store is connected to its backing key store. For an CloudHSM key store, the
     * <code>ConnectionState</code> indicates whether it is connected to its CloudHSM cluster. For an external key
     * store, the <code>ConnectionState</code> indicates whether it is connected to the external key store proxy that
     * communicates with your external key manager.
     * </p>
     * <p>
     * You can create and use KMS keys in your custom key stores only when its <code>ConnectionState</code> is
     * <code>CONNECTED</code>.
     * </p>
     * <p>
     * The <code>ConnectionState</code> value is <code>DISCONNECTED</code> only if the key store has never been
     * connected or you use the <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is
     * <code>CONNECTED</code> but you are having trouble using the custom key store, make sure that the backing key
     * store is reachable and active. For an CloudHSM key store, verify that its associated CloudHSM cluster is active
     * and contains at least one active HSM. For an external key store, verify that the external key store proxy and
     * external key manager are connected and enabled.
     * </p>
     * <p>
     * A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. The
     * <code>ConnectionErrorCode</code> field in the response indicates the cause of the failure. For help resolving a
     * connection failure, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a custom key
     * store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param connectionState
     *        Indicates whether the custom key store is connected to its backing key store. For an CloudHSM key store,
     *        the <code>ConnectionState</code> indicates whether it is connected to its CloudHSM cluster. For an
     *        external key store, the <code>ConnectionState</code> indicates whether it is connected to the external key
     *        store proxy that communicates with your external key manager.</p>
     *        <p>
     *        You can create and use KMS keys in your custom key stores only when its <code>ConnectionState</code> is
     *        <code>CONNECTED</code>.
     *        </p>
     *        <p>
     *        The <code>ConnectionState</code> value is <code>DISCONNECTED</code> only if the key store has never been
     *        connected or you use the <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is
     *        <code>CONNECTED</code> but you are having trouble using the custom key store, make sure that the backing
     *        key store is reachable and active. For an CloudHSM key store, verify that its associated CloudHSM cluster
     *        is active and contains at least one active HSM. For an external key store, verify that the external key
     *        store proxy and external key manager are connected and enabled.
     *        </p>
     *        <p>
     *        A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. The
     *        <code>ConnectionErrorCode</code> field in the response indicates the cause of the failure. For help
     *        resolving a connection failure, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a custom
     *        key store</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStateType
     */

    public CustomKeyStoresListEntry withConnectionState(String connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * <p>
     * Indicates whether the custom key store is connected to its backing key store. For an CloudHSM key store, the
     * <code>ConnectionState</code> indicates whether it is connected to its CloudHSM cluster. For an external key
     * store, the <code>ConnectionState</code> indicates whether it is connected to the external key store proxy that
     * communicates with your external key manager.
     * </p>
     * <p>
     * You can create and use KMS keys in your custom key stores only when its <code>ConnectionState</code> is
     * <code>CONNECTED</code>.
     * </p>
     * <p>
     * The <code>ConnectionState</code> value is <code>DISCONNECTED</code> only if the key store has never been
     * connected or you use the <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is
     * <code>CONNECTED</code> but you are having trouble using the custom key store, make sure that the backing key
     * store is reachable and active. For an CloudHSM key store, verify that its associated CloudHSM cluster is active
     * and contains at least one active HSM. For an external key store, verify that the external key store proxy and
     * external key manager are connected and enabled.
     * </p>
     * <p>
     * A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. The
     * <code>ConnectionErrorCode</code> field in the response indicates the cause of the failure. For help resolving a
     * connection failure, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a custom key
     * store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param connectionState
     *        Indicates whether the custom key store is connected to its backing key store. For an CloudHSM key store,
     *        the <code>ConnectionState</code> indicates whether it is connected to its CloudHSM cluster. For an
     *        external key store, the <code>ConnectionState</code> indicates whether it is connected to the external key
     *        store proxy that communicates with your external key manager.</p>
     *        <p>
     *        You can create and use KMS keys in your custom key stores only when its <code>ConnectionState</code> is
     *        <code>CONNECTED</code>.
     *        </p>
     *        <p>
     *        The <code>ConnectionState</code> value is <code>DISCONNECTED</code> only if the key store has never been
     *        connected or you use the <a>DisconnectCustomKeyStore</a> operation to disconnect it. If the value is
     *        <code>CONNECTED</code> but you are having trouble using the custom key store, make sure that the backing
     *        key store is reachable and active. For an CloudHSM key store, verify that its associated CloudHSM cluster
     *        is active and contains at least one active HSM. For an external key store, verify that the external key
     *        store proxy and external key manager are connected and enabled.
     *        </p>
     *        <p>
     *        A value of <code>FAILED</code> indicates that an attempt to connect was unsuccessful. The
     *        <code>ConnectionErrorCode</code> field in the response indicates the cause of the failure. For help
     *        resolving a connection failure, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a custom
     *        key store</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStateType
     */

    public CustomKeyStoresListEntry withConnectionState(ConnectionStateType connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }

    /**
     * <p>
     * Describes the connection error. This field appears in the response only when the <code>ConnectionState</code> is
     * <code>FAILED</code>.
     * </p>
     * <p>
     * Many failures can be resolved by updating the properties of the custom key store. To update a custom key store,
     * disconnect it (<a>DisconnectCustomKeyStore</a>), correct the errors (<a>UpdateCustomKeyStore</a>), and try to
     * connect again (<a>ConnectCustomKeyStore</a>). For additional help resolving these errors, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>All custom key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code> — KMS could not complete the request due to an internal error. Retry the request. For
     * <code>ConnectCustomKeyStore</code> requests, disconnect the custom key store before trying to connect again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERRORS</code> — Network errors are preventing KMS from connecting the custom key store to its
     * backing key store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>CloudHSM key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTER_NOT_FOUND</code> — KMS cannot find the CloudHSM cluster with the specified cluster ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CLOUDHSM_HSMS</code> — The associated CloudHSM cluster does not contain any active HSMs. To
     * connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active HSM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET</code> — At least one private subnet associated with the CloudHSM
     * cluster doesn't have any available IP addresses. A CloudHSM key store connection requires one free IP address in
     * each of the associated private subnets, although two are preferable. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> — The <code>KeyStorePassword</code> for the custom key store doesn't match the
     * current password of the <code>kmsuser</code> crypto user in the CloudHSM cluster. Before you can connect your
     * custom key store to its CloudHSM cluster, you must change the <code>kmsuser</code> account password and update
     * the <code>KeyStorePassword</code> value for the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBNET_NOT_FOUND</code> — A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot find
     * all of the subnets in the cluster configuration, attempts to connect the custom key store to the CloudHSM cluster
     * fail. To fix this error, create a cluster from a recent backup and associate it with your custom key store. (This
     * process creates a new cluster configuration with a VPC and private subnets.) For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOCKED_OUT</code> — The <code>kmsuser</code> CU account is locked out of the associated CloudHSM
     * cluster due to too many failed password attempts. Before you can connect your custom key store to its CloudHSM
     * cluster, you must change the <code>kmsuser</code> account password and update the key store password value for
     * the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOGGED_IN</code> — The <code>kmsuser</code> CU account is logged into the associated CloudHSM cluster.
     * This prevents KMS from rotating the <code>kmsuser</code> account password and logging into the cluster. Before
     * you can connect your custom key store to its CloudHSM cluster, you must log the <code>kmsuser</code> CU out of
     * the cluster. If you changed the <code>kmsuser</code> password to log into the cluster, you must also and update
     * the key store password value for the custom key store. For help, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#login-kmsuser-2">How to Log Out and
     * Reconnect</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NOT_FOUND</code> — KMS cannot find a <code>kmsuser</code> CU account in the associated CloudHSM
     * cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a
     * <code>kmsuser</code> CU account in the cluster, and then update the key store password value for the custom key
     * store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>External key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> — One or both of the <code>XksProxyAuthenticationCredential</code> values is not
     * valid on the specified external key store proxy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_ACCESS_DENIED</code> — KMS requests are denied access to the external key store proxy. If the
     * external key store proxy has authorization rules, verify that they permit KMS to communicate with the proxy on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_CONFIGURATION</code> — A configuration error is preventing the external key store from
     * connecting to its proxy. Verify the value of the <code>XksProxyUriPath</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_RESPONSE</code> — KMS cannot interpret the response from the external key store proxy. If
     * you see this connection error code repeatedly, notify your external key store proxy vendor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_TLS_CONFIGURATION</code> — KMS cannot connect to the external key store proxy because the
     * TLS configuration is invalid. Verify that the XKS proxy supports TLS 1.2 or 1.3. Also, verify that the TLS
     * certificate is not expired, and that it matches the hostname in the <code>XksProxyUriEndpoint</code> value, and
     * that it is signed by a certificate authority included in the <a
     * href="https://github.com/aws/aws-kms-xksproxy-api-spec/blob/main/TrustedCertificateAuthorities">Trusted
     * Certificate Authorities</a> list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_NOT_REACHABLE</code> — KMS can't communicate with your external key store proxy. Verify that the
     * <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> are correct. Use the tools for your external
     * key store proxy to verify that the proxy is active and available on its network. Also, verify that your external
     * key manager instances are operating properly. Connection attempts fail with this connection error code if the
     * proxy reports that all external key manager instances are unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_TIMED_OUT</code> — KMS can connect to the external key store proxy, but the proxy does not
     * respond to KMS in the time allotted. If you see this connection error code repeatedly, notify your external key
     * store proxy vendor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION</code> — The Amazon VPC endpoint service configuration
     * doesn't conform to the requirements for an KMS external key store.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The VPC endpoint service must be an endpoint service for interface endpoints in the caller's Amazon Web Services
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must have a network load balancer (NLB) connected to at least two subnets, each in a different Availability
     * Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Allow principals</code> list must include the KMS service principal for the Region,
     * <code>cks.kms.&lt;region&gt;.amazonaws.com</code>, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must <i>not</i> require <a
     * href="https://docs.aws.amazon.com/vpc/latest/privatelink/create-endpoint-service.html">acceptance</a> of
     * connection requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must have a private DNS name. The private DNS name for an external key store with
     * <code>VPC_ENDPOINT_SERVICE</code> connectivity must be unique in its Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The domain of the private DNS name must have a <a
     * href="https://docs.aws.amazon.com/vpc/latest/privatelink/verify-domains.html">verification status</a> of
     * <code>verified</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS
     * certificate</a> specifies the private DNS hostname at which the endpoint is reachable.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND</code> — KMS can't find the VPC endpoint service that it uses to
     * communicate with the external key store proxy. Verify that the <code>XksProxyVpcEndpointServiceName</code> is
     * correct and the KMS service principal has service consumer permissions on the Amazon VPC endpoint service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionErrorCode
     *        Describes the connection error. This field appears in the response only when the
     *        <code>ConnectionState</code> is <code>FAILED</code>.</p>
     *        <p>
     *        Many failures can be resolved by updating the properties of the custom key store. To update a custom key
     *        store, disconnect it (<a>DisconnectCustomKeyStore</a>), correct the errors (<a>UpdateCustomKeyStore</a>),
     *        and try to connect again (<a>ConnectCustomKeyStore</a>). For additional help resolving these errors, see
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How
     *        to Fix a Connection Failure</a> in <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        <b>All custom key stores:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INTERNAL_ERROR</code> — KMS could not complete the request due to an internal error. Retry the
     *        request. For <code>ConnectCustomKeyStore</code> requests, disconnect the custom key store before trying to
     *        connect again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_ERRORS</code> — Network errors are preventing KMS from connecting the custom key store to
     *        its backing key store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>CloudHSM key stores:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLUSTER_NOT_FOUND</code> — KMS cannot find the CloudHSM cluster with the specified cluster ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_CLOUDHSM_HSMS</code> — The associated CloudHSM cluster does not contain any active
     *        HSMs. To connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active
     *        HSM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET</code> — At least one private subnet associated with the
     *        CloudHSM cluster doesn't have any available IP addresses. A CloudHSM key store connection requires one
     *        free IP address in each of the associated private subnets, although two are preferable. For details, see
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How
     *        to Fix a Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_CREDENTIALS</code> — The <code>KeyStorePassword</code> for the custom key store doesn't
     *        match the current password of the <code>kmsuser</code> crypto user in the CloudHSM cluster. Before you can
     *        connect your custom key store to its CloudHSM cluster, you must change the <code>kmsuser</code> account
     *        password and update the <code>KeyStorePassword</code> value for the custom key store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBNET_NOT_FOUND</code> — A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot
     *        find all of the subnets in the cluster configuration, attempts to connect the custom key store to the
     *        CloudHSM cluster fail. To fix this error, create a cluster from a recent backup and associate it with your
     *        custom key store. (This process creates a new cluster configuration with a VPC and private subnets.) For
     *        details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to
     *        Fix a Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_LOCKED_OUT</code> — The <code>kmsuser</code> CU account is locked out of the associated
     *        CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to
     *        its CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the key store
     *        password value for the custom key store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_LOGGED_IN</code> — The <code>kmsuser</code> CU account is logged into the associated CloudHSM
     *        cluster. This prevents KMS from rotating the <code>kmsuser</code> account password and logging into the
     *        cluster. Before you can connect your custom key store to its CloudHSM cluster, you must log the
     *        <code>kmsuser</code> CU out of the cluster. If you changed the <code>kmsuser</code> password to log into
     *        the cluster, you must also and update the key store password value for the custom key store. For help, see
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#login-kmsuser-2">How to
     *        Log Out and Reconnect</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_NOT_FOUND</code> — KMS cannot find a <code>kmsuser</code> CU account in the associated CloudHSM
     *        cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a
     *        <code>kmsuser</code> CU account in the cluster, and then update the key store password value for the
     *        custom key store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>External key stores:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVALID_CREDENTIALS</code> — One or both of the <code>XksProxyAuthenticationCredential</code> values
     *        is not valid on the specified external key store proxy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_ACCESS_DENIED</code> — KMS requests are denied access to the external key store proxy. If
     *        the external key store proxy has authorization rules, verify that they permit KMS to communicate with the
     *        proxy on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_INVALID_CONFIGURATION</code> — A configuration error is preventing the external key store
     *        from connecting to its proxy. Verify the value of the <code>XksProxyUriPath</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_INVALID_RESPONSE</code> — KMS cannot interpret the response from the external key store
     *        proxy. If you see this connection error code repeatedly, notify your external key store proxy vendor.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_INVALID_TLS_CONFIGURATION</code> — KMS cannot connect to the external key store proxy
     *        because the TLS configuration is invalid. Verify that the XKS proxy supports TLS 1.2 or 1.3. Also, verify
     *        that the TLS certificate is not expired, and that it matches the hostname in the
     *        <code>XksProxyUriEndpoint</code> value, and that it is signed by a certificate authority included in the
     *        <a href="https://github.com/aws/aws-kms-xksproxy-api-spec/blob/main/TrustedCertificateAuthorities">Trusted
     *        Certificate Authorities</a> list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_NOT_REACHABLE</code> — KMS can't communicate with your external key store proxy. Verify
     *        that the <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> are correct. Use the tools for
     *        your external key store proxy to verify that the proxy is active and available on its network. Also,
     *        verify that your external key manager instances are operating properly. Connection attempts fail with this
     *        connection error code if the proxy reports that all external key manager instances are unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_TIMED_OUT</code> — KMS can connect to the external key store proxy, but the proxy does not
     *        respond to KMS in the time allotted. If you see this connection error code repeatedly, notify your
     *        external key store proxy vendor.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION</code> — The Amazon VPC endpoint service
     *        configuration doesn't conform to the requirements for an KMS external key store.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The VPC endpoint service must be an endpoint service for interface endpoints in the caller's Amazon Web
     *        Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must have a network load balancer (NLB) connected to at least two subnets, each in a different
     *        Availability Zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>Allow principals</code> list must include the KMS service principal for the Region,
     *        <code>cks.kms.&lt;region&gt;.amazonaws.com</code>, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must <i>not</i> require <a
     *        href="https://docs.aws.amazon.com/vpc/latest/privatelink/create-endpoint-service.html">acceptance</a> of
     *        connection requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must have a private DNS name. The private DNS name for an external key store with
     *        <code>VPC_ENDPOINT_SERVICE</code> connectivity must be unique in its Amazon Web Services Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The domain of the private DNS name must have a <a
     *        href="https://docs.aws.amazon.com/vpc/latest/privatelink/verify-domains.html">verification status</a> of
     *        <code>verified</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS
     *        certificate</a> specifies the private DNS hostname at which the endpoint is reachable.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND</code> — KMS can't find the VPC endpoint service that it uses to
     *        communicate with the external key store proxy. Verify that the <code>XksProxyVpcEndpointServiceName</code>
     *        is correct and the KMS service principal has service consumer permissions on the Amazon VPC endpoint
     *        service.
     *        </p>
     *        </li>
     * @see ConnectionErrorCodeType
     */

    public void setConnectionErrorCode(String connectionErrorCode) {
        this.connectionErrorCode = connectionErrorCode;
    }

    /**
     * <p>
     * Describes the connection error. This field appears in the response only when the <code>ConnectionState</code> is
     * <code>FAILED</code>.
     * </p>
     * <p>
     * Many failures can be resolved by updating the properties of the custom key store. To update a custom key store,
     * disconnect it (<a>DisconnectCustomKeyStore</a>), correct the errors (<a>UpdateCustomKeyStore</a>), and try to
     * connect again (<a>ConnectCustomKeyStore</a>). For additional help resolving these errors, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>All custom key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code> — KMS could not complete the request due to an internal error. Retry the request. For
     * <code>ConnectCustomKeyStore</code> requests, disconnect the custom key store before trying to connect again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERRORS</code> — Network errors are preventing KMS from connecting the custom key store to its
     * backing key store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>CloudHSM key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTER_NOT_FOUND</code> — KMS cannot find the CloudHSM cluster with the specified cluster ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CLOUDHSM_HSMS</code> — The associated CloudHSM cluster does not contain any active HSMs. To
     * connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active HSM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET</code> — At least one private subnet associated with the CloudHSM
     * cluster doesn't have any available IP addresses. A CloudHSM key store connection requires one free IP address in
     * each of the associated private subnets, although two are preferable. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> — The <code>KeyStorePassword</code> for the custom key store doesn't match the
     * current password of the <code>kmsuser</code> crypto user in the CloudHSM cluster. Before you can connect your
     * custom key store to its CloudHSM cluster, you must change the <code>kmsuser</code> account password and update
     * the <code>KeyStorePassword</code> value for the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBNET_NOT_FOUND</code> — A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot find
     * all of the subnets in the cluster configuration, attempts to connect the custom key store to the CloudHSM cluster
     * fail. To fix this error, create a cluster from a recent backup and associate it with your custom key store. (This
     * process creates a new cluster configuration with a VPC and private subnets.) For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOCKED_OUT</code> — The <code>kmsuser</code> CU account is locked out of the associated CloudHSM
     * cluster due to too many failed password attempts. Before you can connect your custom key store to its CloudHSM
     * cluster, you must change the <code>kmsuser</code> account password and update the key store password value for
     * the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOGGED_IN</code> — The <code>kmsuser</code> CU account is logged into the associated CloudHSM cluster.
     * This prevents KMS from rotating the <code>kmsuser</code> account password and logging into the cluster. Before
     * you can connect your custom key store to its CloudHSM cluster, you must log the <code>kmsuser</code> CU out of
     * the cluster. If you changed the <code>kmsuser</code> password to log into the cluster, you must also and update
     * the key store password value for the custom key store. For help, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#login-kmsuser-2">How to Log Out and
     * Reconnect</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NOT_FOUND</code> — KMS cannot find a <code>kmsuser</code> CU account in the associated CloudHSM
     * cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a
     * <code>kmsuser</code> CU account in the cluster, and then update the key store password value for the custom key
     * store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>External key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> — One or both of the <code>XksProxyAuthenticationCredential</code> values is not
     * valid on the specified external key store proxy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_ACCESS_DENIED</code> — KMS requests are denied access to the external key store proxy. If the
     * external key store proxy has authorization rules, verify that they permit KMS to communicate with the proxy on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_CONFIGURATION</code> — A configuration error is preventing the external key store from
     * connecting to its proxy. Verify the value of the <code>XksProxyUriPath</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_RESPONSE</code> — KMS cannot interpret the response from the external key store proxy. If
     * you see this connection error code repeatedly, notify your external key store proxy vendor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_TLS_CONFIGURATION</code> — KMS cannot connect to the external key store proxy because the
     * TLS configuration is invalid. Verify that the XKS proxy supports TLS 1.2 or 1.3. Also, verify that the TLS
     * certificate is not expired, and that it matches the hostname in the <code>XksProxyUriEndpoint</code> value, and
     * that it is signed by a certificate authority included in the <a
     * href="https://github.com/aws/aws-kms-xksproxy-api-spec/blob/main/TrustedCertificateAuthorities">Trusted
     * Certificate Authorities</a> list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_NOT_REACHABLE</code> — KMS can't communicate with your external key store proxy. Verify that the
     * <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> are correct. Use the tools for your external
     * key store proxy to verify that the proxy is active and available on its network. Also, verify that your external
     * key manager instances are operating properly. Connection attempts fail with this connection error code if the
     * proxy reports that all external key manager instances are unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_TIMED_OUT</code> — KMS can connect to the external key store proxy, but the proxy does not
     * respond to KMS in the time allotted. If you see this connection error code repeatedly, notify your external key
     * store proxy vendor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION</code> — The Amazon VPC endpoint service configuration
     * doesn't conform to the requirements for an KMS external key store.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The VPC endpoint service must be an endpoint service for interface endpoints in the caller's Amazon Web Services
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must have a network load balancer (NLB) connected to at least two subnets, each in a different Availability
     * Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Allow principals</code> list must include the KMS service principal for the Region,
     * <code>cks.kms.&lt;region&gt;.amazonaws.com</code>, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must <i>not</i> require <a
     * href="https://docs.aws.amazon.com/vpc/latest/privatelink/create-endpoint-service.html">acceptance</a> of
     * connection requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must have a private DNS name. The private DNS name for an external key store with
     * <code>VPC_ENDPOINT_SERVICE</code> connectivity must be unique in its Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The domain of the private DNS name must have a <a
     * href="https://docs.aws.amazon.com/vpc/latest/privatelink/verify-domains.html">verification status</a> of
     * <code>verified</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS
     * certificate</a> specifies the private DNS hostname at which the endpoint is reachable.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND</code> — KMS can't find the VPC endpoint service that it uses to
     * communicate with the external key store proxy. Verify that the <code>XksProxyVpcEndpointServiceName</code> is
     * correct and the KMS service principal has service consumer permissions on the Amazon VPC endpoint service.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the connection error. This field appears in the response only when the
     *         <code>ConnectionState</code> is <code>FAILED</code>.</p>
     *         <p>
     *         Many failures can be resolved by updating the properties of the custom key store. To update a custom key
     *         store, disconnect it (<a>DisconnectCustomKeyStore</a>), correct the errors (<a>UpdateCustomKeyStore</a>),
     *         and try to connect again (<a>ConnectCustomKeyStore</a>). For additional help resolving these errors, see
     *         <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How
     *         to Fix a Connection Failure</a> in <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         <b>All custom key stores:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INTERNAL_ERROR</code> — KMS could not complete the request due to an internal error. Retry the
     *         request. For <code>ConnectCustomKeyStore</code> requests, disconnect the custom key store before trying
     *         to connect again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NETWORK_ERRORS</code> — Network errors are preventing KMS from connecting the custom key store to
     *         its backing key store.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>CloudHSM key stores:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CLUSTER_NOT_FOUND</code> — KMS cannot find the CloudHSM cluster with the specified cluster ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSUFFICIENT_CLOUDHSM_HSMS</code> — The associated CloudHSM cluster does not contain any active
     *         HSMs. To connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active
     *         HSM.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET</code> — At least one private subnet associated with the
     *         CloudHSM cluster doesn't have any available IP addresses. A CloudHSM key store connection requires one
     *         free IP address in each of the associated private subnets, although two are preferable. For details, see
     *         <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How
     *         to Fix a Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID_CREDENTIALS</code> — The <code>KeyStorePassword</code> for the custom key store doesn't
     *         match the current password of the <code>kmsuser</code> crypto user in the CloudHSM cluster. Before you
     *         can connect your custom key store to its CloudHSM cluster, you must change the <code>kmsuser</code>
     *         account password and update the <code>KeyStorePassword</code> value for the custom key store.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUBNET_NOT_FOUND</code> — A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot
     *         find all of the subnets in the cluster configuration, attempts to connect the custom key store to the
     *         CloudHSM cluster fail. To fix this error, create a cluster from a recent backup and associate it with
     *         your custom key store. (This process creates a new cluster configuration with a VPC and private subnets.)
     *         For details, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to
     *         Fix a Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>USER_LOCKED_OUT</code> — The <code>kmsuser</code> CU account is locked out of the associated
     *         CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store
     *         to its CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the key
     *         store password value for the custom key store.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>USER_LOGGED_IN</code> — The <code>kmsuser</code> CU account is logged into the associated CloudHSM
     *         cluster. This prevents KMS from rotating the <code>kmsuser</code> account password and logging into the
     *         cluster. Before you can connect your custom key store to its CloudHSM cluster, you must log the
     *         <code>kmsuser</code> CU out of the cluster. If you changed the <code>kmsuser</code> password to log into
     *         the cluster, you must also and update the key store password value for the custom key store. For help,
     *         see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#login-kmsuser-2">How
     *         to Log Out and Reconnect</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>USER_NOT_FOUND</code> — KMS cannot find a <code>kmsuser</code> CU account in the associated
     *         CloudHSM cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a
     *         <code>kmsuser</code> CU account in the cluster, and then update the key store password value for the
     *         custom key store.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>External key stores:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INVALID_CREDENTIALS</code> — One or both of the <code>XksProxyAuthenticationCredential</code>
     *         values is not valid on the specified external key store proxy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XKS_PROXY_ACCESS_DENIED</code> — KMS requests are denied access to the external key store proxy. If
     *         the external key store proxy has authorization rules, verify that they permit KMS to communicate with the
     *         proxy on your behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XKS_PROXY_INVALID_CONFIGURATION</code> — A configuration error is preventing the external key store
     *         from connecting to its proxy. Verify the value of the <code>XksProxyUriPath</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XKS_PROXY_INVALID_RESPONSE</code> — KMS cannot interpret the response from the external key store
     *         proxy. If you see this connection error code repeatedly, notify your external key store proxy vendor.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XKS_PROXY_INVALID_TLS_CONFIGURATION</code> — KMS cannot connect to the external key store proxy
     *         because the TLS configuration is invalid. Verify that the XKS proxy supports TLS 1.2 or 1.3. Also, verify
     *         that the TLS certificate is not expired, and that it matches the hostname in the
     *         <code>XksProxyUriEndpoint</code> value, and that it is signed by a certificate authority included in the
     *         <a
     *         href="https://github.com/aws/aws-kms-xksproxy-api-spec/blob/main/TrustedCertificateAuthorities">Trusted
     *         Certificate Authorities</a> list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XKS_PROXY_NOT_REACHABLE</code> — KMS can't communicate with your external key store proxy. Verify
     *         that the <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> are correct. Use the tools for
     *         your external key store proxy to verify that the proxy is active and available on its network. Also,
     *         verify that your external key manager instances are operating properly. Connection attempts fail with
     *         this connection error code if the proxy reports that all external key manager instances are unavailable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XKS_PROXY_TIMED_OUT</code> — KMS can connect to the external key store proxy, but the proxy does
     *         not respond to KMS in the time allotted. If you see this connection error code repeatedly, notify your
     *         external key store proxy vendor.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION</code> — The Amazon VPC endpoint service
     *         configuration doesn't conform to the requirements for an KMS external key store.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The VPC endpoint service must be an endpoint service for interface endpoints in the caller's Amazon Web
     *         Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It must have a network load balancer (NLB) connected to at least two subnets, each in a different
     *         Availability Zone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>Allow principals</code> list must include the KMS service principal for the Region,
     *         <code>cks.kms.&lt;region&gt;.amazonaws.com</code>, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It must <i>not</i> require <a
     *         href="https://docs.aws.amazon.com/vpc/latest/privatelink/create-endpoint-service.html">acceptance</a> of
     *         connection requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It must have a private DNS name. The private DNS name for an external key store with
     *         <code>VPC_ENDPOINT_SERVICE</code> connectivity must be unique in its Amazon Web Services Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The domain of the private DNS name must have a <a
     *         href="https://docs.aws.amazon.com/vpc/latest/privatelink/verify-domains.html">verification status</a> of
     *         <code>verified</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a
     *         href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS
     *         certificate</a> specifies the private DNS hostname at which the endpoint is reachable.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND</code> — KMS can't find the VPC endpoint service that it uses to
     *         communicate with the external key store proxy. Verify that the
     *         <code>XksProxyVpcEndpointServiceName</code> is correct and the KMS service principal has service consumer
     *         permissions on the Amazon VPC endpoint service.
     *         </p>
     *         </li>
     * @see ConnectionErrorCodeType
     */

    public String getConnectionErrorCode() {
        return this.connectionErrorCode;
    }

    /**
     * <p>
     * Describes the connection error. This field appears in the response only when the <code>ConnectionState</code> is
     * <code>FAILED</code>.
     * </p>
     * <p>
     * Many failures can be resolved by updating the properties of the custom key store. To update a custom key store,
     * disconnect it (<a>DisconnectCustomKeyStore</a>), correct the errors (<a>UpdateCustomKeyStore</a>), and try to
     * connect again (<a>ConnectCustomKeyStore</a>). For additional help resolving these errors, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>All custom key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code> — KMS could not complete the request due to an internal error. Retry the request. For
     * <code>ConnectCustomKeyStore</code> requests, disconnect the custom key store before trying to connect again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERRORS</code> — Network errors are preventing KMS from connecting the custom key store to its
     * backing key store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>CloudHSM key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTER_NOT_FOUND</code> — KMS cannot find the CloudHSM cluster with the specified cluster ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CLOUDHSM_HSMS</code> — The associated CloudHSM cluster does not contain any active HSMs. To
     * connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active HSM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET</code> — At least one private subnet associated with the CloudHSM
     * cluster doesn't have any available IP addresses. A CloudHSM key store connection requires one free IP address in
     * each of the associated private subnets, although two are preferable. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> — The <code>KeyStorePassword</code> for the custom key store doesn't match the
     * current password of the <code>kmsuser</code> crypto user in the CloudHSM cluster. Before you can connect your
     * custom key store to its CloudHSM cluster, you must change the <code>kmsuser</code> account password and update
     * the <code>KeyStorePassword</code> value for the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBNET_NOT_FOUND</code> — A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot find
     * all of the subnets in the cluster configuration, attempts to connect the custom key store to the CloudHSM cluster
     * fail. To fix this error, create a cluster from a recent backup and associate it with your custom key store. (This
     * process creates a new cluster configuration with a VPC and private subnets.) For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOCKED_OUT</code> — The <code>kmsuser</code> CU account is locked out of the associated CloudHSM
     * cluster due to too many failed password attempts. Before you can connect your custom key store to its CloudHSM
     * cluster, you must change the <code>kmsuser</code> account password and update the key store password value for
     * the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOGGED_IN</code> — The <code>kmsuser</code> CU account is logged into the associated CloudHSM cluster.
     * This prevents KMS from rotating the <code>kmsuser</code> account password and logging into the cluster. Before
     * you can connect your custom key store to its CloudHSM cluster, you must log the <code>kmsuser</code> CU out of
     * the cluster. If you changed the <code>kmsuser</code> password to log into the cluster, you must also and update
     * the key store password value for the custom key store. For help, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#login-kmsuser-2">How to Log Out and
     * Reconnect</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NOT_FOUND</code> — KMS cannot find a <code>kmsuser</code> CU account in the associated CloudHSM
     * cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a
     * <code>kmsuser</code> CU account in the cluster, and then update the key store password value for the custom key
     * store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>External key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> — One or both of the <code>XksProxyAuthenticationCredential</code> values is not
     * valid on the specified external key store proxy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_ACCESS_DENIED</code> — KMS requests are denied access to the external key store proxy. If the
     * external key store proxy has authorization rules, verify that they permit KMS to communicate with the proxy on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_CONFIGURATION</code> — A configuration error is preventing the external key store from
     * connecting to its proxy. Verify the value of the <code>XksProxyUriPath</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_RESPONSE</code> — KMS cannot interpret the response from the external key store proxy. If
     * you see this connection error code repeatedly, notify your external key store proxy vendor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_TLS_CONFIGURATION</code> — KMS cannot connect to the external key store proxy because the
     * TLS configuration is invalid. Verify that the XKS proxy supports TLS 1.2 or 1.3. Also, verify that the TLS
     * certificate is not expired, and that it matches the hostname in the <code>XksProxyUriEndpoint</code> value, and
     * that it is signed by a certificate authority included in the <a
     * href="https://github.com/aws/aws-kms-xksproxy-api-spec/blob/main/TrustedCertificateAuthorities">Trusted
     * Certificate Authorities</a> list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_NOT_REACHABLE</code> — KMS can't communicate with your external key store proxy. Verify that the
     * <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> are correct. Use the tools for your external
     * key store proxy to verify that the proxy is active and available on its network. Also, verify that your external
     * key manager instances are operating properly. Connection attempts fail with this connection error code if the
     * proxy reports that all external key manager instances are unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_TIMED_OUT</code> — KMS can connect to the external key store proxy, but the proxy does not
     * respond to KMS in the time allotted. If you see this connection error code repeatedly, notify your external key
     * store proxy vendor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION</code> — The Amazon VPC endpoint service configuration
     * doesn't conform to the requirements for an KMS external key store.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The VPC endpoint service must be an endpoint service for interface endpoints in the caller's Amazon Web Services
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must have a network load balancer (NLB) connected to at least two subnets, each in a different Availability
     * Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Allow principals</code> list must include the KMS service principal for the Region,
     * <code>cks.kms.&lt;region&gt;.amazonaws.com</code>, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must <i>not</i> require <a
     * href="https://docs.aws.amazon.com/vpc/latest/privatelink/create-endpoint-service.html">acceptance</a> of
     * connection requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must have a private DNS name. The private DNS name for an external key store with
     * <code>VPC_ENDPOINT_SERVICE</code> connectivity must be unique in its Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The domain of the private DNS name must have a <a
     * href="https://docs.aws.amazon.com/vpc/latest/privatelink/verify-domains.html">verification status</a> of
     * <code>verified</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS
     * certificate</a> specifies the private DNS hostname at which the endpoint is reachable.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND</code> — KMS can't find the VPC endpoint service that it uses to
     * communicate with the external key store proxy. Verify that the <code>XksProxyVpcEndpointServiceName</code> is
     * correct and the KMS service principal has service consumer permissions on the Amazon VPC endpoint service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionErrorCode
     *        Describes the connection error. This field appears in the response only when the
     *        <code>ConnectionState</code> is <code>FAILED</code>.</p>
     *        <p>
     *        Many failures can be resolved by updating the properties of the custom key store. To update a custom key
     *        store, disconnect it (<a>DisconnectCustomKeyStore</a>), correct the errors (<a>UpdateCustomKeyStore</a>),
     *        and try to connect again (<a>ConnectCustomKeyStore</a>). For additional help resolving these errors, see
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How
     *        to Fix a Connection Failure</a> in <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        <b>All custom key stores:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INTERNAL_ERROR</code> — KMS could not complete the request due to an internal error. Retry the
     *        request. For <code>ConnectCustomKeyStore</code> requests, disconnect the custom key store before trying to
     *        connect again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_ERRORS</code> — Network errors are preventing KMS from connecting the custom key store to
     *        its backing key store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>CloudHSM key stores:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLUSTER_NOT_FOUND</code> — KMS cannot find the CloudHSM cluster with the specified cluster ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_CLOUDHSM_HSMS</code> — The associated CloudHSM cluster does not contain any active
     *        HSMs. To connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active
     *        HSM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET</code> — At least one private subnet associated with the
     *        CloudHSM cluster doesn't have any available IP addresses. A CloudHSM key store connection requires one
     *        free IP address in each of the associated private subnets, although two are preferable. For details, see
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How
     *        to Fix a Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_CREDENTIALS</code> — The <code>KeyStorePassword</code> for the custom key store doesn't
     *        match the current password of the <code>kmsuser</code> crypto user in the CloudHSM cluster. Before you can
     *        connect your custom key store to its CloudHSM cluster, you must change the <code>kmsuser</code> account
     *        password and update the <code>KeyStorePassword</code> value for the custom key store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBNET_NOT_FOUND</code> — A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot
     *        find all of the subnets in the cluster configuration, attempts to connect the custom key store to the
     *        CloudHSM cluster fail. To fix this error, create a cluster from a recent backup and associate it with your
     *        custom key store. (This process creates a new cluster configuration with a VPC and private subnets.) For
     *        details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to
     *        Fix a Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_LOCKED_OUT</code> — The <code>kmsuser</code> CU account is locked out of the associated
     *        CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to
     *        its CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the key store
     *        password value for the custom key store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_LOGGED_IN</code> — The <code>kmsuser</code> CU account is logged into the associated CloudHSM
     *        cluster. This prevents KMS from rotating the <code>kmsuser</code> account password and logging into the
     *        cluster. Before you can connect your custom key store to its CloudHSM cluster, you must log the
     *        <code>kmsuser</code> CU out of the cluster. If you changed the <code>kmsuser</code> password to log into
     *        the cluster, you must also and update the key store password value for the custom key store. For help, see
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#login-kmsuser-2">How to
     *        Log Out and Reconnect</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_NOT_FOUND</code> — KMS cannot find a <code>kmsuser</code> CU account in the associated CloudHSM
     *        cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a
     *        <code>kmsuser</code> CU account in the cluster, and then update the key store password value for the
     *        custom key store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>External key stores:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVALID_CREDENTIALS</code> — One or both of the <code>XksProxyAuthenticationCredential</code> values
     *        is not valid on the specified external key store proxy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_ACCESS_DENIED</code> — KMS requests are denied access to the external key store proxy. If
     *        the external key store proxy has authorization rules, verify that they permit KMS to communicate with the
     *        proxy on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_INVALID_CONFIGURATION</code> — A configuration error is preventing the external key store
     *        from connecting to its proxy. Verify the value of the <code>XksProxyUriPath</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_INVALID_RESPONSE</code> — KMS cannot interpret the response from the external key store
     *        proxy. If you see this connection error code repeatedly, notify your external key store proxy vendor.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_INVALID_TLS_CONFIGURATION</code> — KMS cannot connect to the external key store proxy
     *        because the TLS configuration is invalid. Verify that the XKS proxy supports TLS 1.2 or 1.3. Also, verify
     *        that the TLS certificate is not expired, and that it matches the hostname in the
     *        <code>XksProxyUriEndpoint</code> value, and that it is signed by a certificate authority included in the
     *        <a href="https://github.com/aws/aws-kms-xksproxy-api-spec/blob/main/TrustedCertificateAuthorities">Trusted
     *        Certificate Authorities</a> list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_NOT_REACHABLE</code> — KMS can't communicate with your external key store proxy. Verify
     *        that the <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> are correct. Use the tools for
     *        your external key store proxy to verify that the proxy is active and available on its network. Also,
     *        verify that your external key manager instances are operating properly. Connection attempts fail with this
     *        connection error code if the proxy reports that all external key manager instances are unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_TIMED_OUT</code> — KMS can connect to the external key store proxy, but the proxy does not
     *        respond to KMS in the time allotted. If you see this connection error code repeatedly, notify your
     *        external key store proxy vendor.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION</code> — The Amazon VPC endpoint service
     *        configuration doesn't conform to the requirements for an KMS external key store.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The VPC endpoint service must be an endpoint service for interface endpoints in the caller's Amazon Web
     *        Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must have a network load balancer (NLB) connected to at least two subnets, each in a different
     *        Availability Zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>Allow principals</code> list must include the KMS service principal for the Region,
     *        <code>cks.kms.&lt;region&gt;.amazonaws.com</code>, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must <i>not</i> require <a
     *        href="https://docs.aws.amazon.com/vpc/latest/privatelink/create-endpoint-service.html">acceptance</a> of
     *        connection requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must have a private DNS name. The private DNS name for an external key store with
     *        <code>VPC_ENDPOINT_SERVICE</code> connectivity must be unique in its Amazon Web Services Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The domain of the private DNS name must have a <a
     *        href="https://docs.aws.amazon.com/vpc/latest/privatelink/verify-domains.html">verification status</a> of
     *        <code>verified</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS
     *        certificate</a> specifies the private DNS hostname at which the endpoint is reachable.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND</code> — KMS can't find the VPC endpoint service that it uses to
     *        communicate with the external key store proxy. Verify that the <code>XksProxyVpcEndpointServiceName</code>
     *        is correct and the KMS service principal has service consumer permissions on the Amazon VPC endpoint
     *        service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionErrorCodeType
     */

    public CustomKeyStoresListEntry withConnectionErrorCode(String connectionErrorCode) {
        setConnectionErrorCode(connectionErrorCode);
        return this;
    }

    /**
     * <p>
     * Describes the connection error. This field appears in the response only when the <code>ConnectionState</code> is
     * <code>FAILED</code>.
     * </p>
     * <p>
     * Many failures can be resolved by updating the properties of the custom key store. To update a custom key store,
     * disconnect it (<a>DisconnectCustomKeyStore</a>), correct the errors (<a>UpdateCustomKeyStore</a>), and try to
     * connect again (<a>ConnectCustomKeyStore</a>). For additional help resolving these errors, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>All custom key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code> — KMS could not complete the request due to an internal error. Retry the request. For
     * <code>ConnectCustomKeyStore</code> requests, disconnect the custom key store before trying to connect again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERRORS</code> — Network errors are preventing KMS from connecting the custom key store to its
     * backing key store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>CloudHSM key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLUSTER_NOT_FOUND</code> — KMS cannot find the CloudHSM cluster with the specified cluster ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CLOUDHSM_HSMS</code> — The associated CloudHSM cluster does not contain any active HSMs. To
     * connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active HSM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET</code> — At least one private subnet associated with the CloudHSM
     * cluster doesn't have any available IP addresses. A CloudHSM key store connection requires one free IP address in
     * each of the associated private subnets, although two are preferable. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> — The <code>KeyStorePassword</code> for the custom key store doesn't match the
     * current password of the <code>kmsuser</code> crypto user in the CloudHSM cluster. Before you can connect your
     * custom key store to its CloudHSM cluster, you must change the <code>kmsuser</code> account password and update
     * the <code>KeyStorePassword</code> value for the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBNET_NOT_FOUND</code> — A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot find
     * all of the subnets in the cluster configuration, attempts to connect the custom key store to the CloudHSM cluster
     * fail. To fix this error, create a cluster from a recent backup and associate it with your custom key store. (This
     * process creates a new cluster configuration with a VPC and private subnets.) For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to Fix a
     * Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOCKED_OUT</code> — The <code>kmsuser</code> CU account is locked out of the associated CloudHSM
     * cluster due to too many failed password attempts. Before you can connect your custom key store to its CloudHSM
     * cluster, you must change the <code>kmsuser</code> account password and update the key store password value for
     * the custom key store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_LOGGED_IN</code> — The <code>kmsuser</code> CU account is logged into the associated CloudHSM cluster.
     * This prevents KMS from rotating the <code>kmsuser</code> account password and logging into the cluster. Before
     * you can connect your custom key store to its CloudHSM cluster, you must log the <code>kmsuser</code> CU out of
     * the cluster. If you changed the <code>kmsuser</code> password to log into the cluster, you must also and update
     * the key store password value for the custom key store. For help, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#login-kmsuser-2">How to Log Out and
     * Reconnect</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NOT_FOUND</code> — KMS cannot find a <code>kmsuser</code> CU account in the associated CloudHSM
     * cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a
     * <code>kmsuser</code> CU account in the cluster, and then update the key store password value for the custom key
     * store.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>External key stores:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_CREDENTIALS</code> — One or both of the <code>XksProxyAuthenticationCredential</code> values is not
     * valid on the specified external key store proxy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_ACCESS_DENIED</code> — KMS requests are denied access to the external key store proxy. If the
     * external key store proxy has authorization rules, verify that they permit KMS to communicate with the proxy on
     * your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_CONFIGURATION</code> — A configuration error is preventing the external key store from
     * connecting to its proxy. Verify the value of the <code>XksProxyUriPath</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_RESPONSE</code> — KMS cannot interpret the response from the external key store proxy. If
     * you see this connection error code repeatedly, notify your external key store proxy vendor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_INVALID_TLS_CONFIGURATION</code> — KMS cannot connect to the external key store proxy because the
     * TLS configuration is invalid. Verify that the XKS proxy supports TLS 1.2 or 1.3. Also, verify that the TLS
     * certificate is not expired, and that it matches the hostname in the <code>XksProxyUriEndpoint</code> value, and
     * that it is signed by a certificate authority included in the <a
     * href="https://github.com/aws/aws-kms-xksproxy-api-spec/blob/main/TrustedCertificateAuthorities">Trusted
     * Certificate Authorities</a> list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_NOT_REACHABLE</code> — KMS can't communicate with your external key store proxy. Verify that the
     * <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> are correct. Use the tools for your external
     * key store proxy to verify that the proxy is active and available on its network. Also, verify that your external
     * key manager instances are operating properly. Connection attempts fail with this connection error code if the
     * proxy reports that all external key manager instances are unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_PROXY_TIMED_OUT</code> — KMS can connect to the external key store proxy, but the proxy does not
     * respond to KMS in the time allotted. If you see this connection error code repeatedly, notify your external key
     * store proxy vendor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION</code> — The Amazon VPC endpoint service configuration
     * doesn't conform to the requirements for an KMS external key store.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The VPC endpoint service must be an endpoint service for interface endpoints in the caller's Amazon Web Services
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must have a network load balancer (NLB) connected to at least two subnets, each in a different Availability
     * Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Allow principals</code> list must include the KMS service principal for the Region,
     * <code>cks.kms.&lt;region&gt;.amazonaws.com</code>, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must <i>not</i> require <a
     * href="https://docs.aws.amazon.com/vpc/latest/privatelink/create-endpoint-service.html">acceptance</a> of
     * connection requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must have a private DNS name. The private DNS name for an external key store with
     * <code>VPC_ENDPOINT_SERVICE</code> connectivity must be unique in its Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The domain of the private DNS name must have a <a
     * href="https://docs.aws.amazon.com/vpc/latest/privatelink/verify-domains.html">verification status</a> of
     * <code>verified</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS
     * certificate</a> specifies the private DNS hostname at which the endpoint is reachable.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND</code> — KMS can't find the VPC endpoint service that it uses to
     * communicate with the external key store proxy. Verify that the <code>XksProxyVpcEndpointServiceName</code> is
     * correct and the KMS service principal has service consumer permissions on the Amazon VPC endpoint service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionErrorCode
     *        Describes the connection error. This field appears in the response only when the
     *        <code>ConnectionState</code> is <code>FAILED</code>.</p>
     *        <p>
     *        Many failures can be resolved by updating the properties of the custom key store. To update a custom key
     *        store, disconnect it (<a>DisconnectCustomKeyStore</a>), correct the errors (<a>UpdateCustomKeyStore</a>),
     *        and try to connect again (<a>ConnectCustomKeyStore</a>). For additional help resolving these errors, see
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How
     *        to Fix a Connection Failure</a> in <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        <b>All custom key stores:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INTERNAL_ERROR</code> — KMS could not complete the request due to an internal error. Retry the
     *        request. For <code>ConnectCustomKeyStore</code> requests, disconnect the custom key store before trying to
     *        connect again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_ERRORS</code> — Network errors are preventing KMS from connecting the custom key store to
     *        its backing key store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>CloudHSM key stores:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLUSTER_NOT_FOUND</code> — KMS cannot find the CloudHSM cluster with the specified cluster ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_CLOUDHSM_HSMS</code> — The associated CloudHSM cluster does not contain any active
     *        HSMs. To connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active
     *        HSM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET</code> — At least one private subnet associated with the
     *        CloudHSM cluster doesn't have any available IP addresses. A CloudHSM key store connection requires one
     *        free IP address in each of the associated private subnets, although two are preferable. For details, see
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How
     *        to Fix a Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_CREDENTIALS</code> — The <code>KeyStorePassword</code> for the custom key store doesn't
     *        match the current password of the <code>kmsuser</code> crypto user in the CloudHSM cluster. Before you can
     *        connect your custom key store to its CloudHSM cluster, you must change the <code>kmsuser</code> account
     *        password and update the <code>KeyStorePassword</code> value for the custom key store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBNET_NOT_FOUND</code> — A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot
     *        find all of the subnets in the cluster configuration, attempts to connect the custom key store to the
     *        CloudHSM cluster fail. To fix this error, create a cluster from a recent backup and associate it with your
     *        custom key store. (This process creates a new cluster configuration with a VPC and private subnets.) For
     *        details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-failed">How to
     *        Fix a Connection Failure</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_LOCKED_OUT</code> — The <code>kmsuser</code> CU account is locked out of the associated
     *        CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to
     *        its CloudHSM cluster, you must change the <code>kmsuser</code> account password and update the key store
     *        password value for the custom key store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_LOGGED_IN</code> — The <code>kmsuser</code> CU account is logged into the associated CloudHSM
     *        cluster. This prevents KMS from rotating the <code>kmsuser</code> account password and logging into the
     *        cluster. Before you can connect your custom key store to its CloudHSM cluster, you must log the
     *        <code>kmsuser</code> CU out of the cluster. If you changed the <code>kmsuser</code> password to log into
     *        the cluster, you must also and update the key store password value for the custom key store. For help, see
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#login-kmsuser-2">How to
     *        Log Out and Reconnect</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_NOT_FOUND</code> — KMS cannot find a <code>kmsuser</code> CU account in the associated CloudHSM
     *        cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a
     *        <code>kmsuser</code> CU account in the cluster, and then update the key store password value for the
     *        custom key store.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>External key stores:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVALID_CREDENTIALS</code> — One or both of the <code>XksProxyAuthenticationCredential</code> values
     *        is not valid on the specified external key store proxy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_ACCESS_DENIED</code> — KMS requests are denied access to the external key store proxy. If
     *        the external key store proxy has authorization rules, verify that they permit KMS to communicate with the
     *        proxy on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_INVALID_CONFIGURATION</code> — A configuration error is preventing the external key store
     *        from connecting to its proxy. Verify the value of the <code>XksProxyUriPath</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_INVALID_RESPONSE</code> — KMS cannot interpret the response from the external key store
     *        proxy. If you see this connection error code repeatedly, notify your external key store proxy vendor.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_INVALID_TLS_CONFIGURATION</code> — KMS cannot connect to the external key store proxy
     *        because the TLS configuration is invalid. Verify that the XKS proxy supports TLS 1.2 or 1.3. Also, verify
     *        that the TLS certificate is not expired, and that it matches the hostname in the
     *        <code>XksProxyUriEndpoint</code> value, and that it is signed by a certificate authority included in the
     *        <a href="https://github.com/aws/aws-kms-xksproxy-api-spec/blob/main/TrustedCertificateAuthorities">Trusted
     *        Certificate Authorities</a> list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_NOT_REACHABLE</code> — KMS can't communicate with your external key store proxy. Verify
     *        that the <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> are correct. Use the tools for
     *        your external key store proxy to verify that the proxy is active and available on its network. Also,
     *        verify that your external key manager instances are operating properly. Connection attempts fail with this
     *        connection error code if the proxy reports that all external key manager instances are unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_PROXY_TIMED_OUT</code> — KMS can connect to the external key store proxy, but the proxy does not
     *        respond to KMS in the time allotted. If you see this connection error code repeatedly, notify your
     *        external key store proxy vendor.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION</code> — The Amazon VPC endpoint service
     *        configuration doesn't conform to the requirements for an KMS external key store.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The VPC endpoint service must be an endpoint service for interface endpoints in the caller's Amazon Web
     *        Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must have a network load balancer (NLB) connected to at least two subnets, each in a different
     *        Availability Zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>Allow principals</code> list must include the KMS service principal for the Region,
     *        <code>cks.kms.&lt;region&gt;.amazonaws.com</code>, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must <i>not</i> require <a
     *        href="https://docs.aws.amazon.com/vpc/latest/privatelink/create-endpoint-service.html">acceptance</a> of
     *        connection requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must have a private DNS name. The private DNS name for an external key store with
     *        <code>VPC_ENDPOINT_SERVICE</code> connectivity must be unique in its Amazon Web Services Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The domain of the private DNS name must have a <a
     *        href="https://docs.aws.amazon.com/vpc/latest/privatelink/verify-domains.html">verification status</a> of
     *        <code>verified</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html">TLS
     *        certificate</a> specifies the private DNS hostname at which the endpoint is reachable.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND</code> — KMS can't find the VPC endpoint service that it uses to
     *        communicate with the external key store proxy. Verify that the <code>XksProxyVpcEndpointServiceName</code>
     *        is correct and the KMS service principal has service consumer permissions on the Amazon VPC endpoint
     *        service.
     *        </p>
     *        </li>
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
     * <p>
     * Indicates the type of the custom key store. <code>AWS_CLOUDHSM</code> indicates a custom key store backed by an
     * CloudHSM cluster. <code>EXTERNAL_KEY_STORE</code> indicates a custom key store backed by an external key store
     * proxy and external key manager outside of Amazon Web Services.
     * </p>
     * 
     * @param customKeyStoreType
     *        Indicates the type of the custom key store. <code>AWS_CLOUDHSM</code> indicates a custom key store backed
     *        by an CloudHSM cluster. <code>EXTERNAL_KEY_STORE</code> indicates a custom key store backed by an external
     *        key store proxy and external key manager outside of Amazon Web Services.
     * @see CustomKeyStoreType
     */

    public void setCustomKeyStoreType(String customKeyStoreType) {
        this.customKeyStoreType = customKeyStoreType;
    }

    /**
     * <p>
     * Indicates the type of the custom key store. <code>AWS_CLOUDHSM</code> indicates a custom key store backed by an
     * CloudHSM cluster. <code>EXTERNAL_KEY_STORE</code> indicates a custom key store backed by an external key store
     * proxy and external key manager outside of Amazon Web Services.
     * </p>
     * 
     * @return Indicates the type of the custom key store. <code>AWS_CLOUDHSM</code> indicates a custom key store backed
     *         by an CloudHSM cluster. <code>EXTERNAL_KEY_STORE</code> indicates a custom key store backed by an
     *         external key store proxy and external key manager outside of Amazon Web Services.
     * @see CustomKeyStoreType
     */

    public String getCustomKeyStoreType() {
        return this.customKeyStoreType;
    }

    /**
     * <p>
     * Indicates the type of the custom key store. <code>AWS_CLOUDHSM</code> indicates a custom key store backed by an
     * CloudHSM cluster. <code>EXTERNAL_KEY_STORE</code> indicates a custom key store backed by an external key store
     * proxy and external key manager outside of Amazon Web Services.
     * </p>
     * 
     * @param customKeyStoreType
     *        Indicates the type of the custom key store. <code>AWS_CLOUDHSM</code> indicates a custom key store backed
     *        by an CloudHSM cluster. <code>EXTERNAL_KEY_STORE</code> indicates a custom key store backed by an external
     *        key store proxy and external key manager outside of Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomKeyStoreType
     */

    public CustomKeyStoresListEntry withCustomKeyStoreType(String customKeyStoreType) {
        setCustomKeyStoreType(customKeyStoreType);
        return this;
    }

    /**
     * <p>
     * Indicates the type of the custom key store. <code>AWS_CLOUDHSM</code> indicates a custom key store backed by an
     * CloudHSM cluster. <code>EXTERNAL_KEY_STORE</code> indicates a custom key store backed by an external key store
     * proxy and external key manager outside of Amazon Web Services.
     * </p>
     * 
     * @param customKeyStoreType
     *        Indicates the type of the custom key store. <code>AWS_CLOUDHSM</code> indicates a custom key store backed
     *        by an CloudHSM cluster. <code>EXTERNAL_KEY_STORE</code> indicates a custom key store backed by an external
     *        key store proxy and external key manager outside of Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomKeyStoreType
     */

    public CustomKeyStoresListEntry withCustomKeyStoreType(CustomKeyStoreType customKeyStoreType) {
        this.customKeyStoreType = customKeyStoreType.toString();
        return this;
    }

    /**
     * <p>
     * Configuration settings for the external key store proxy (XKS proxy). The external key store proxy translates KMS
     * requests into a format that your external key manager can understand. The proxy configuration includes connection
     * information that KMS requires.
     * </p>
     * <p>
     * This field appears only when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * 
     * @param xksProxyConfiguration
     *        Configuration settings for the external key store proxy (XKS proxy). The external key store proxy
     *        translates KMS requests into a format that your external key manager can understand. The proxy
     *        configuration includes connection information that KMS requires.</p>
     *        <p>
     *        This field appears only when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code>.
     */

    public void setXksProxyConfiguration(XksProxyConfigurationType xksProxyConfiguration) {
        this.xksProxyConfiguration = xksProxyConfiguration;
    }

    /**
     * <p>
     * Configuration settings for the external key store proxy (XKS proxy). The external key store proxy translates KMS
     * requests into a format that your external key manager can understand. The proxy configuration includes connection
     * information that KMS requires.
     * </p>
     * <p>
     * This field appears only when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * 
     * @return Configuration settings for the external key store proxy (XKS proxy). The external key store proxy
     *         translates KMS requests into a format that your external key manager can understand. The proxy
     *         configuration includes connection information that KMS requires.</p>
     *         <p>
     *         This field appears only when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code>.
     */

    public XksProxyConfigurationType getXksProxyConfiguration() {
        return this.xksProxyConfiguration;
    }

    /**
     * <p>
     * Configuration settings for the external key store proxy (XKS proxy). The external key store proxy translates KMS
     * requests into a format that your external key manager can understand. The proxy configuration includes connection
     * information that KMS requires.
     * </p>
     * <p>
     * This field appears only when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * 
     * @param xksProxyConfiguration
     *        Configuration settings for the external key store proxy (XKS proxy). The external key store proxy
     *        translates KMS requests into a format that your external key manager can understand. The proxy
     *        configuration includes connection information that KMS requires.</p>
     *        <p>
     *        This field appears only when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomKeyStoresListEntry withXksProxyConfiguration(XksProxyConfigurationType xksProxyConfiguration) {
        setXksProxyConfiguration(xksProxyConfiguration);
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
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCustomKeyStoreType() != null)
            sb.append("CustomKeyStoreType: ").append(getCustomKeyStoreType()).append(",");
        if (getXksProxyConfiguration() != null)
            sb.append("XksProxyConfiguration: ").append(getXksProxyConfiguration());
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
        if (other.getCustomKeyStoreType() == null ^ this.getCustomKeyStoreType() == null)
            return false;
        if (other.getCustomKeyStoreType() != null && other.getCustomKeyStoreType().equals(this.getCustomKeyStoreType()) == false)
            return false;
        if (other.getXksProxyConfiguration() == null ^ this.getXksProxyConfiguration() == null)
            return false;
        if (other.getXksProxyConfiguration() != null && other.getXksProxyConfiguration().equals(this.getXksProxyConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getCustomKeyStoreType() == null) ? 0 : getCustomKeyStoreType().hashCode());
        hashCode = prime * hashCode + ((getXksProxyConfiguration() == null) ? 0 : getXksProxyConfiguration().hashCode());
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
