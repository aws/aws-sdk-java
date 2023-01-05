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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdateCustomKeyStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCustomKeyStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the ID of
     * a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     */
    private String customKeyStoreId;
    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must
     * be unique in the Amazon Web Services account.
     * </p>
     * <p>
     * To change this value, an CloudHSM key store must be disconnected. An external key store can be connected or
     * disconnected.
     * </p>
     */
    private String newCustomKeyStoreName;
    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU) in the CloudHSM cluster that is
     * associated with the custom key store. This parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * This parameter tells KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not set or
     * change the password of any users in the CloudHSM cluster.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     */
    private String keyStorePassword;
    /**
     * <p>
     * Associates the custom key store with a related CloudHSM cluster. This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a
     * backup history and has the same cluster certificate as the original cluster. You cannot use this parameter to
     * associate a custom key store with an unrelated cluster. In addition, the replacement cluster must <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore">fulfill the
     * requirements</a> for a cluster associated with a custom key store. To view the cluster certificate of a cluster,
     * use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     */
    private String cloudHsmClusterId;
    /**
     * <p>
     * Changes the URI endpoint that KMS uses to connect to your external key store proxy (XKS proxy). This parameter is
     * valid only for custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value of <code>PUBLIC_ENDPOINT</code>, the
     * protocol must be HTTPS.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>,
     * specify <code>https://</code> followed by the private DNS name associated with the VPC endpoint service. Each
     * external key store must use a different private DNS name.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     */
    private String xksProxyUriEndpoint;
    /**
     * <p>
     * Changes the base path to the proxy APIs for this external key store. To find this value, see the documentation
     * for your external key manager and external key store proxy (XKS proxy). This parameter is valid only for custom
     * key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code>, where <code>v1</code>
     * represents the version of the KMS external key store proxy API. You can include an optional prefix between the
     * required elements such as <code>/<i>example</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or disconnected.
     * </p>
     */
    private String xksProxyUriPath;
    /**
     * <p>
     * Changes the name that KMS uses to identify the Amazon VPC endpoint service for your external key store proxy (XKS
     * proxy). This parameter is valid when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and
     * the <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     */
    private String xksProxyVpcEndpointServiceName;
    /**
     * <p>
     * Changes the credentials that KMS uses to sign requests to the external key store proxy (XKS proxy). This
     * parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * You must specify both the <code>AccessKeyId</code> and <code>SecretAccessKey</code> value in the authentication
     * credential, even if you are only updating one value.
     * </p>
     * <p>
     * This parameter doesn't establish or change your authentication credentials on the proxy. It just tells KMS the
     * credential that you established with your external key store proxy. For example, if you rotate the credential on
     * your external key store proxy, you can use this parameter to update the credential in KMS.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or disconnected.
     * </p>
     */
    private XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential;
    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate that the external key store proxy uses a
     * Amazon VPC endpoint service to communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>. Otherwise,
     * specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to <code>VPC_ENDPOINT_SERVICE</code>, you must also change
     * the <code>XksProxyUriEndpoint</code> and add an <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for the
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     */
    private String xksProxyConnectivity;

    /**
     * <p>
     * Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the ID of
     * a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * 
     * @param customKeyStoreId
     *        Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the
     *        ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     */

    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the ID of
     * a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * 
     * @return Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find
     *         the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     */

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    /**
     * <p>
     * Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the ID of
     * a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * 
     * @param customKeyStoreId
     *        Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the
     *        ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withCustomKeyStoreId(String customKeyStoreId) {
        setCustomKeyStoreId(customKeyStoreId);
        return this;
    }

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must
     * be unique in the Amazon Web Services account.
     * </p>
     * <p>
     * To change this value, an CloudHSM key store must be disconnected. An external key store can be connected or
     * disconnected.
     * </p>
     * 
     * @param newCustomKeyStoreName
     *        Changes the friendly name of the custom key store to the value that you specify. The custom key store name
     *        must be unique in the Amazon Web Services account.</p>
     *        <p>
     *        To change this value, an CloudHSM key store must be disconnected. An external key store can be connected
     *        or disconnected.
     */

    public void setNewCustomKeyStoreName(String newCustomKeyStoreName) {
        this.newCustomKeyStoreName = newCustomKeyStoreName;
    }

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must
     * be unique in the Amazon Web Services account.
     * </p>
     * <p>
     * To change this value, an CloudHSM key store must be disconnected. An external key store can be connected or
     * disconnected.
     * </p>
     * 
     * @return Changes the friendly name of the custom key store to the value that you specify. The custom key store
     *         name must be unique in the Amazon Web Services account.</p>
     *         <p>
     *         To change this value, an CloudHSM key store must be disconnected. An external key store can be connected
     *         or disconnected.
     */

    public String getNewCustomKeyStoreName() {
        return this.newCustomKeyStoreName;
    }

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must
     * be unique in the Amazon Web Services account.
     * </p>
     * <p>
     * To change this value, an CloudHSM key store must be disconnected. An external key store can be connected or
     * disconnected.
     * </p>
     * 
     * @param newCustomKeyStoreName
     *        Changes the friendly name of the custom key store to the value that you specify. The custom key store name
     *        must be unique in the Amazon Web Services account.</p>
     *        <p>
     *        To change this value, an CloudHSM key store must be disconnected. An external key store can be connected
     *        or disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withNewCustomKeyStoreName(String newCustomKeyStoreName) {
        setNewCustomKeyStoreName(newCustomKeyStoreName);
        return this;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU) in the CloudHSM cluster that is
     * associated with the custom key store. This parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * This parameter tells KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not set or
     * change the password of any users in the CloudHSM cluster.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * 
     * @param keyStorePassword
     *        Enter the current password of the <code>kmsuser</code> crypto user (CU) in the CloudHSM cluster that is
     *        associated with the custom key store. This parameter is valid only for custom key stores with a
     *        <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        This parameter tells KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not
     *        set or change the password of any users in the CloudHSM cluster.
     *        </p>
     *        <p>
     *        To change this value, the CloudHSM key store must be disconnected.
     */

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU) in the CloudHSM cluster that is
     * associated with the custom key store. This parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * This parameter tells KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not set or
     * change the password of any users in the CloudHSM cluster.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * 
     * @return Enter the current password of the <code>kmsuser</code> crypto user (CU) in the CloudHSM cluster that is
     *         associated with the custom key store. This parameter is valid only for custom key stores with a
     *         <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *         <p>
     *         This parameter tells KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not
     *         set or change the password of any users in the CloudHSM cluster.
     *         </p>
     *         <p>
     *         To change this value, the CloudHSM key store must be disconnected.
     */

    public String getKeyStorePassword() {
        return this.keyStorePassword;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU) in the CloudHSM cluster that is
     * associated with the custom key store. This parameter is valid only for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * This parameter tells KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not set or
     * change the password of any users in the CloudHSM cluster.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * 
     * @param keyStorePassword
     *        Enter the current password of the <code>kmsuser</code> crypto user (CU) in the CloudHSM cluster that is
     *        associated with the custom key store. This parameter is valid only for custom key stores with a
     *        <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        This parameter tells KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not
     *        set or change the password of any users in the CloudHSM cluster.
     *        </p>
     *        <p>
     *        To change this value, the CloudHSM key store must be disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withKeyStorePassword(String keyStorePassword) {
        setKeyStorePassword(keyStorePassword);
        return this;
    }

    /**
     * <p>
     * Associates the custom key store with a related CloudHSM cluster. This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a
     * backup history and has the same cluster certificate as the original cluster. You cannot use this parameter to
     * associate a custom key store with an unrelated cluster. In addition, the replacement cluster must <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore">fulfill the
     * requirements</a> for a cluster associated with a custom key store. To view the cluster certificate of a cluster,
     * use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        Associates the custom key store with a related CloudHSM cluster. This parameter is valid only for custom
     *        key stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares
     *        a backup history and has the same cluster certificate as the original cluster. You cannot use this
     *        parameter to associate a custom key store with an unrelated cluster. In addition, the replacement cluster
     *        must <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore">
     *        fulfill the requirements</a> for a cluster associated with a custom key store. To view the cluster
     *        certificate of a cluster, use the <a
     *        href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *        >DescribeClusters</a> operation.
     *        </p>
     *        <p>
     *        To change this value, the CloudHSM key store must be disconnected.
     */

    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * Associates the custom key store with a related CloudHSM cluster. This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a
     * backup history and has the same cluster certificate as the original cluster. You cannot use this parameter to
     * associate a custom key store with an unrelated cluster. In addition, the replacement cluster must <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore">fulfill the
     * requirements</a> for a cluster associated with a custom key store. To view the cluster certificate of a cluster,
     * use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * 
     * @return Associates the custom key store with a related CloudHSM cluster. This parameter is valid only for custom
     *         key stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *         <p>
     *         Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares
     *         a backup history and has the same cluster certificate as the original cluster. You cannot use this
     *         parameter to associate a custom key store with an unrelated cluster. In addition, the replacement cluster
     *         must <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore">fulfill
     *         the requirements</a> for a cluster associated with a custom key store. To view the cluster certificate of
     *         a cluster, use the <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *         >DescribeClusters</a> operation.
     *         </p>
     *         <p>
     *         To change this value, the CloudHSM key store must be disconnected.
     */

    public String getCloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }

    /**
     * <p>
     * Associates the custom key store with a related CloudHSM cluster. This parameter is valid only for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a
     * backup history and has the same cluster certificate as the original cluster. You cannot use this parameter to
     * associate a custom key store with an unrelated cluster. In addition, the replacement cluster must <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore">fulfill the
     * requirements</a> for a cluster associated with a custom key store. To view the cluster certificate of a cluster,
     * use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * <p>
     * To change this value, the CloudHSM key store must be disconnected.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        Associates the custom key store with a related CloudHSM cluster. This parameter is valid only for custom
     *        key stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares
     *        a backup history and has the same cluster certificate as the original cluster. You cannot use this
     *        parameter to associate a custom key store with an unrelated cluster. In addition, the replacement cluster
     *        must <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore">
     *        fulfill the requirements</a> for a cluster associated with a custom key store. To view the cluster
     *        certificate of a cluster, use the <a
     *        href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *        >DescribeClusters</a> operation.
     *        </p>
     *        <p>
     *        To change this value, the CloudHSM key store must be disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withCloudHsmClusterId(String cloudHsmClusterId) {
        setCloudHsmClusterId(cloudHsmClusterId);
        return this;
    }

    /**
     * <p>
     * Changes the URI endpoint that KMS uses to connect to your external key store proxy (XKS proxy). This parameter is
     * valid only for custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value of <code>PUBLIC_ENDPOINT</code>, the
     * protocol must be HTTPS.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>,
     * specify <code>https://</code> followed by the private DNS name associated with the VPC endpoint service. Each
     * external key store must use a different private DNS name.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * 
     * @param xksProxyUriEndpoint
     *        Changes the URI endpoint that KMS uses to connect to your external key store proxy (XKS proxy). This
     *        parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     *        <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        For external key stores with an <code>XksProxyConnectivity</code> value of <code>PUBLIC_ENDPOINT</code>,
     *        the protocol must be HTTPS.
     *        </p>
     *        <p>
     *        For external key stores with an <code>XksProxyConnectivity</code> value of
     *        <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code> followed by the private DNS name
     *        associated with the VPC endpoint service. Each external key store must use a different private DNS name.
     *        </p>
     *        <p>
     *        The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *        the Amazon Web Services account and Region.
     *        </p>
     *        <p>
     *        To change this value, the external key store must be disconnected.
     */

    public void setXksProxyUriEndpoint(String xksProxyUriEndpoint) {
        this.xksProxyUriEndpoint = xksProxyUriEndpoint;
    }

    /**
     * <p>
     * Changes the URI endpoint that KMS uses to connect to your external key store proxy (XKS proxy). This parameter is
     * valid only for custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value of <code>PUBLIC_ENDPOINT</code>, the
     * protocol must be HTTPS.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>,
     * specify <code>https://</code> followed by the private DNS name associated with the VPC endpoint service. Each
     * external key store must use a different private DNS name.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * 
     * @return Changes the URI endpoint that KMS uses to connect to your external key store proxy (XKS proxy). This
     *         parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     *         <code>EXTERNAL_KEY_STORE</code>.</p>
     *         <p>
     *         For external key stores with an <code>XksProxyConnectivity</code> value of <code>PUBLIC_ENDPOINT</code>,
     *         the protocol must be HTTPS.
     *         </p>
     *         <p>
     *         For external key stores with an <code>XksProxyConnectivity</code> value of
     *         <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code> followed by the private DNS name
     *         associated with the VPC endpoint service. Each external key store must use a different private DNS name.
     *         </p>
     *         <p>
     *         The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *         the Amazon Web Services account and Region.
     *         </p>
     *         <p>
     *         To change this value, the external key store must be disconnected.
     */

    public String getXksProxyUriEndpoint() {
        return this.xksProxyUriEndpoint;
    }

    /**
     * <p>
     * Changes the URI endpoint that KMS uses to connect to your external key store proxy (XKS proxy). This parameter is
     * valid only for custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value of <code>PUBLIC_ENDPOINT</code>, the
     * protocol must be HTTPS.
     * </p>
     * <p>
     * For external key stores with an <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>,
     * specify <code>https://</code> followed by the private DNS name associated with the VPC endpoint service. Each
     * external key store must use a different private DNS name.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * 
     * @param xksProxyUriEndpoint
     *        Changes the URI endpoint that KMS uses to connect to your external key store proxy (XKS proxy). This
     *        parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     *        <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        For external key stores with an <code>XksProxyConnectivity</code> value of <code>PUBLIC_ENDPOINT</code>,
     *        the protocol must be HTTPS.
     *        </p>
     *        <p>
     *        For external key stores with an <code>XksProxyConnectivity</code> value of
     *        <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code> followed by the private DNS name
     *        associated with the VPC endpoint service. Each external key store must use a different private DNS name.
     *        </p>
     *        <p>
     *        The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *        the Amazon Web Services account and Region.
     *        </p>
     *        <p>
     *        To change this value, the external key store must be disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withXksProxyUriEndpoint(String xksProxyUriEndpoint) {
        setXksProxyUriEndpoint(xksProxyUriEndpoint);
        return this;
    }

    /**
     * <p>
     * Changes the base path to the proxy APIs for this external key store. To find this value, see the documentation
     * for your external key manager and external key store proxy (XKS proxy). This parameter is valid only for custom
     * key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code>, where <code>v1</code>
     * represents the version of the KMS external key store proxy API. You can include an optional prefix between the
     * required elements such as <code>/<i>example</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or disconnected.
     * </p>
     * 
     * @param xksProxyUriPath
     *        Changes the base path to the proxy APIs for this external key store. To find this value, see the
     *        documentation for your external key manager and external key store proxy (XKS proxy). This parameter is
     *        valid only for custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>
     *        .</p>
     *        <p>
     *        The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code>, where <code>v1</code>
     *        represents the version of the KMS external key store proxy API. You can include an optional prefix between
     *        the required elements such as <code>/<i>example</i>/kms/xks/v1</code>.
     *        </p>
     *        <p>
     *        The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *        the Amazon Web Services account and Region.
     *        </p>
     *        <p>
     *        You can change this value when the external key store is connected or disconnected.
     */

    public void setXksProxyUriPath(String xksProxyUriPath) {
        this.xksProxyUriPath = xksProxyUriPath;
    }

    /**
     * <p>
     * Changes the base path to the proxy APIs for this external key store. To find this value, see the documentation
     * for your external key manager and external key store proxy (XKS proxy). This parameter is valid only for custom
     * key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code>, where <code>v1</code>
     * represents the version of the KMS external key store proxy API. You can include an optional prefix between the
     * required elements such as <code>/<i>example</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or disconnected.
     * </p>
     * 
     * @return Changes the base path to the proxy APIs for this external key store. To find this value, see the
     *         documentation for your external key manager and external key store proxy (XKS proxy). This parameter is
     *         valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     *         <code>EXTERNAL_KEY_STORE</code>.</p>
     *         <p>
     *         The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code>, where
     *         <code>v1</code> represents the version of the KMS external key store proxy API. You can include an
     *         optional prefix between the required elements such as <code>/<i>example</i>/kms/xks/v1</code>.
     *         </p>
     *         <p>
     *         The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *         the Amazon Web Services account and Region.
     *         </p>
     *         <p>
     *         You can change this value when the external key store is connected or disconnected.
     */

    public String getXksProxyUriPath() {
        return this.xksProxyUriPath;
    }

    /**
     * <p>
     * Changes the base path to the proxy APIs for this external key store. To find this value, see the documentation
     * for your external key manager and external key store proxy (XKS proxy). This parameter is valid only for custom
     * key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code>, where <code>v1</code>
     * represents the version of the KMS external key store proxy API. You can include an optional prefix between the
     * required elements such as <code>/<i>example</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or disconnected.
     * </p>
     * 
     * @param xksProxyUriPath
     *        Changes the base path to the proxy APIs for this external key store. To find this value, see the
     *        documentation for your external key manager and external key store proxy (XKS proxy). This parameter is
     *        valid only for custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>
     *        .</p>
     *        <p>
     *        The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code>, where <code>v1</code>
     *        represents the version of the KMS external key store proxy API. You can include an optional prefix between
     *        the required elements such as <code>/<i>example</i>/kms/xks/v1</code>.
     *        </p>
     *        <p>
     *        The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *        the Amazon Web Services account and Region.
     *        </p>
     *        <p>
     *        You can change this value when the external key store is connected or disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withXksProxyUriPath(String xksProxyUriPath) {
        setXksProxyUriPath(xksProxyUriPath);
        return this;
    }

    /**
     * <p>
     * Changes the name that KMS uses to identify the Amazon VPC endpoint service for your external key store proxy (XKS
     * proxy). This parameter is valid when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and
     * the <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * 
     * @param xksProxyVpcEndpointServiceName
     *        Changes the name that KMS uses to identify the Amazon VPC endpoint service for your external key store
     *        proxy (XKS proxy). This parameter is valid when the <code>CustomKeyStoreType</code> is
     *        <code>EXTERNAL_KEY_STORE</code> and the <code>XksProxyConnectivity</code> is
     *        <code>VPC_ENDPOINT_SERVICE</code>.</p>
     *        <p>
     *        To change this value, the external key store must be disconnected.
     */

    public void setXksProxyVpcEndpointServiceName(String xksProxyVpcEndpointServiceName) {
        this.xksProxyVpcEndpointServiceName = xksProxyVpcEndpointServiceName;
    }

    /**
     * <p>
     * Changes the name that KMS uses to identify the Amazon VPC endpoint service for your external key store proxy (XKS
     * proxy). This parameter is valid when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and
     * the <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * 
     * @return Changes the name that KMS uses to identify the Amazon VPC endpoint service for your external key store
     *         proxy (XKS proxy). This parameter is valid when the <code>CustomKeyStoreType</code> is
     *         <code>EXTERNAL_KEY_STORE</code> and the <code>XksProxyConnectivity</code> is
     *         <code>VPC_ENDPOINT_SERVICE</code>.</p>
     *         <p>
     *         To change this value, the external key store must be disconnected.
     */

    public String getXksProxyVpcEndpointServiceName() {
        return this.xksProxyVpcEndpointServiceName;
    }

    /**
     * <p>
     * Changes the name that KMS uses to identify the Amazon VPC endpoint service for your external key store proxy (XKS
     * proxy). This parameter is valid when the <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and
     * the <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * 
     * @param xksProxyVpcEndpointServiceName
     *        Changes the name that KMS uses to identify the Amazon VPC endpoint service for your external key store
     *        proxy (XKS proxy). This parameter is valid when the <code>CustomKeyStoreType</code> is
     *        <code>EXTERNAL_KEY_STORE</code> and the <code>XksProxyConnectivity</code> is
     *        <code>VPC_ENDPOINT_SERVICE</code>.</p>
     *        <p>
     *        To change this value, the external key store must be disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withXksProxyVpcEndpointServiceName(String xksProxyVpcEndpointServiceName) {
        setXksProxyVpcEndpointServiceName(xksProxyVpcEndpointServiceName);
        return this;
    }

    /**
     * <p>
     * Changes the credentials that KMS uses to sign requests to the external key store proxy (XKS proxy). This
     * parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * You must specify both the <code>AccessKeyId</code> and <code>SecretAccessKey</code> value in the authentication
     * credential, even if you are only updating one value.
     * </p>
     * <p>
     * This parameter doesn't establish or change your authentication credentials on the proxy. It just tells KMS the
     * credential that you established with your external key store proxy. For example, if you rotate the credential on
     * your external key store proxy, you can use this parameter to update the credential in KMS.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or disconnected.
     * </p>
     * 
     * @param xksProxyAuthenticationCredential
     *        Changes the credentials that KMS uses to sign requests to the external key store proxy (XKS proxy). This
     *        parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     *        <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        You must specify both the <code>AccessKeyId</code> and <code>SecretAccessKey</code> value in the
     *        authentication credential, even if you are only updating one value.
     *        </p>
     *        <p>
     *        This parameter doesn't establish or change your authentication credentials on the proxy. It just tells KMS
     *        the credential that you established with your external key store proxy. For example, if you rotate the
     *        credential on your external key store proxy, you can use this parameter to update the credential in KMS.
     *        </p>
     *        <p>
     *        You can change this value when the external key store is connected or disconnected.
     */

    public void setXksProxyAuthenticationCredential(XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential) {
        this.xksProxyAuthenticationCredential = xksProxyAuthenticationCredential;
    }

    /**
     * <p>
     * Changes the credentials that KMS uses to sign requests to the external key store proxy (XKS proxy). This
     * parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * You must specify both the <code>AccessKeyId</code> and <code>SecretAccessKey</code> value in the authentication
     * credential, even if you are only updating one value.
     * </p>
     * <p>
     * This parameter doesn't establish or change your authentication credentials on the proxy. It just tells KMS the
     * credential that you established with your external key store proxy. For example, if you rotate the credential on
     * your external key store proxy, you can use this parameter to update the credential in KMS.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or disconnected.
     * </p>
     * 
     * @return Changes the credentials that KMS uses to sign requests to the external key store proxy (XKS proxy). This
     *         parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     *         <code>EXTERNAL_KEY_STORE</code>.</p>
     *         <p>
     *         You must specify both the <code>AccessKeyId</code> and <code>SecretAccessKey</code> value in the
     *         authentication credential, even if you are only updating one value.
     *         </p>
     *         <p>
     *         This parameter doesn't establish or change your authentication credentials on the proxy. It just tells
     *         KMS the credential that you established with your external key store proxy. For example, if you rotate
     *         the credential on your external key store proxy, you can use this parameter to update the credential in
     *         KMS.
     *         </p>
     *         <p>
     *         You can change this value when the external key store is connected or disconnected.
     */

    public XksProxyAuthenticationCredentialType getXksProxyAuthenticationCredential() {
        return this.xksProxyAuthenticationCredential;
    }

    /**
     * <p>
     * Changes the credentials that KMS uses to sign requests to the external key store proxy (XKS proxy). This
     * parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * You must specify both the <code>AccessKeyId</code> and <code>SecretAccessKey</code> value in the authentication
     * credential, even if you are only updating one value.
     * </p>
     * <p>
     * This parameter doesn't establish or change your authentication credentials on the proxy. It just tells KMS the
     * credential that you established with your external key store proxy. For example, if you rotate the credential on
     * your external key store proxy, you can use this parameter to update the credential in KMS.
     * </p>
     * <p>
     * You can change this value when the external key store is connected or disconnected.
     * </p>
     * 
     * @param xksProxyAuthenticationCredential
     *        Changes the credentials that KMS uses to sign requests to the external key store proxy (XKS proxy). This
     *        parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
     *        <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        You must specify both the <code>AccessKeyId</code> and <code>SecretAccessKey</code> value in the
     *        authentication credential, even if you are only updating one value.
     *        </p>
     *        <p>
     *        This parameter doesn't establish or change your authentication credentials on the proxy. It just tells KMS
     *        the credential that you established with your external key store proxy. For example, if you rotate the
     *        credential on your external key store proxy, you can use this parameter to update the credential in KMS.
     *        </p>
     *        <p>
     *        You can change this value when the external key store is connected or disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withXksProxyAuthenticationCredential(XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential) {
        setXksProxyAuthenticationCredential(xksProxyAuthenticationCredential);
        return this;
    }

    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate that the external key store proxy uses a
     * Amazon VPC endpoint service to communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>. Otherwise,
     * specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to <code>VPC_ENDPOINT_SERVICE</code>, you must also change
     * the <code>XksProxyUriEndpoint</code> and add an <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for the
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * 
     * @param xksProxyConnectivity
     *        Changes the connectivity setting for the external key store. To indicate that the external key store proxy
     *        uses a Amazon VPC endpoint service to communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>.
     *        Otherwise, specify <code>PUBLIC_ENDPOINT</code>.</p>
     *        <p>
     *        If you change the <code>XksProxyConnectivity</code> to <code>VPC_ENDPOINT_SERVICE</code>, you must also
     *        change the <code>XksProxyUriEndpoint</code> and add an <code>XksProxyVpcEndpointServiceName</code> value.
     *        </p>
     *        <p>
     *        If you change the <code>XksProxyConnectivity</code> to <code>PUBLIC_ENDPOINT</code>, you must also change
     *        the <code>XksProxyUriEndpoint</code> and specify a null or empty string for the
     *        <code>XksProxyVpcEndpointServiceName</code> value.
     *        </p>
     *        <p>
     *        To change this value, the external key store must be disconnected.
     * @see XksProxyConnectivityType
     */

    public void setXksProxyConnectivity(String xksProxyConnectivity) {
        this.xksProxyConnectivity = xksProxyConnectivity;
    }

    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate that the external key store proxy uses a
     * Amazon VPC endpoint service to communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>. Otherwise,
     * specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to <code>VPC_ENDPOINT_SERVICE</code>, you must also change
     * the <code>XksProxyUriEndpoint</code> and add an <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for the
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * 
     * @return Changes the connectivity setting for the external key store. To indicate that the external key store
     *         proxy uses a Amazon VPC endpoint service to communicate with KMS, specify
     *         <code>VPC_ENDPOINT_SERVICE</code>. Otherwise, specify <code>PUBLIC_ENDPOINT</code>.</p>
     *         <p>
     *         If you change the <code>XksProxyConnectivity</code> to <code>VPC_ENDPOINT_SERVICE</code>, you must also
     *         change the <code>XksProxyUriEndpoint</code> and add an <code>XksProxyVpcEndpointServiceName</code> value.
     *         </p>
     *         <p>
     *         If you change the <code>XksProxyConnectivity</code> to <code>PUBLIC_ENDPOINT</code>, you must also change
     *         the <code>XksProxyUriEndpoint</code> and specify a null or empty string for the
     *         <code>XksProxyVpcEndpointServiceName</code> value.
     *         </p>
     *         <p>
     *         To change this value, the external key store must be disconnected.
     * @see XksProxyConnectivityType
     */

    public String getXksProxyConnectivity() {
        return this.xksProxyConnectivity;
    }

    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate that the external key store proxy uses a
     * Amazon VPC endpoint service to communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>. Otherwise,
     * specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to <code>VPC_ENDPOINT_SERVICE</code>, you must also change
     * the <code>XksProxyUriEndpoint</code> and add an <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for the
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * 
     * @param xksProxyConnectivity
     *        Changes the connectivity setting for the external key store. To indicate that the external key store proxy
     *        uses a Amazon VPC endpoint service to communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>.
     *        Otherwise, specify <code>PUBLIC_ENDPOINT</code>.</p>
     *        <p>
     *        If you change the <code>XksProxyConnectivity</code> to <code>VPC_ENDPOINT_SERVICE</code>, you must also
     *        change the <code>XksProxyUriEndpoint</code> and add an <code>XksProxyVpcEndpointServiceName</code> value.
     *        </p>
     *        <p>
     *        If you change the <code>XksProxyConnectivity</code> to <code>PUBLIC_ENDPOINT</code>, you must also change
     *        the <code>XksProxyUriEndpoint</code> and specify a null or empty string for the
     *        <code>XksProxyVpcEndpointServiceName</code> value.
     *        </p>
     *        <p>
     *        To change this value, the external key store must be disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XksProxyConnectivityType
     */

    public UpdateCustomKeyStoreRequest withXksProxyConnectivity(String xksProxyConnectivity) {
        setXksProxyConnectivity(xksProxyConnectivity);
        return this;
    }

    /**
     * <p>
     * Changes the connectivity setting for the external key store. To indicate that the external key store proxy uses a
     * Amazon VPC endpoint service to communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>. Otherwise,
     * specify <code>PUBLIC_ENDPOINT</code>.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to <code>VPC_ENDPOINT_SERVICE</code>, you must also change
     * the <code>XksProxyUriEndpoint</code> and add an <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * If you change the <code>XksProxyConnectivity</code> to <code>PUBLIC_ENDPOINT</code>, you must also change the
     * <code>XksProxyUriEndpoint</code> and specify a null or empty string for the
     * <code>XksProxyVpcEndpointServiceName</code> value.
     * </p>
     * <p>
     * To change this value, the external key store must be disconnected.
     * </p>
     * 
     * @param xksProxyConnectivity
     *        Changes the connectivity setting for the external key store. To indicate that the external key store proxy
     *        uses a Amazon VPC endpoint service to communicate with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>.
     *        Otherwise, specify <code>PUBLIC_ENDPOINT</code>.</p>
     *        <p>
     *        If you change the <code>XksProxyConnectivity</code> to <code>VPC_ENDPOINT_SERVICE</code>, you must also
     *        change the <code>XksProxyUriEndpoint</code> and add an <code>XksProxyVpcEndpointServiceName</code> value.
     *        </p>
     *        <p>
     *        If you change the <code>XksProxyConnectivity</code> to <code>PUBLIC_ENDPOINT</code>, you must also change
     *        the <code>XksProxyUriEndpoint</code> and specify a null or empty string for the
     *        <code>XksProxyVpcEndpointServiceName</code> value.
     *        </p>
     *        <p>
     *        To change this value, the external key store must be disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XksProxyConnectivityType
     */

    public UpdateCustomKeyStoreRequest withXksProxyConnectivity(XksProxyConnectivityType xksProxyConnectivity) {
        this.xksProxyConnectivity = xksProxyConnectivity.toString();
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
        if (getNewCustomKeyStoreName() != null)
            sb.append("NewCustomKeyStoreName: ").append(getNewCustomKeyStoreName()).append(",");
        if (getKeyStorePassword() != null)
            sb.append("KeyStorePassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getCloudHsmClusterId() != null)
            sb.append("CloudHsmClusterId: ").append(getCloudHsmClusterId()).append(",");
        if (getXksProxyUriEndpoint() != null)
            sb.append("XksProxyUriEndpoint: ").append(getXksProxyUriEndpoint()).append(",");
        if (getXksProxyUriPath() != null)
            sb.append("XksProxyUriPath: ").append(getXksProxyUriPath()).append(",");
        if (getXksProxyVpcEndpointServiceName() != null)
            sb.append("XksProxyVpcEndpointServiceName: ").append(getXksProxyVpcEndpointServiceName()).append(",");
        if (getXksProxyAuthenticationCredential() != null)
            sb.append("XksProxyAuthenticationCredential: ").append(getXksProxyAuthenticationCredential()).append(",");
        if (getXksProxyConnectivity() != null)
            sb.append("XksProxyConnectivity: ").append(getXksProxyConnectivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCustomKeyStoreRequest == false)
            return false;
        UpdateCustomKeyStoreRequest other = (UpdateCustomKeyStoreRequest) obj;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getNewCustomKeyStoreName() == null ^ this.getNewCustomKeyStoreName() == null)
            return false;
        if (other.getNewCustomKeyStoreName() != null && other.getNewCustomKeyStoreName().equals(this.getNewCustomKeyStoreName()) == false)
            return false;
        if (other.getKeyStorePassword() == null ^ this.getKeyStorePassword() == null)
            return false;
        if (other.getKeyStorePassword() != null && other.getKeyStorePassword().equals(this.getKeyStorePassword()) == false)
            return false;
        if (other.getCloudHsmClusterId() == null ^ this.getCloudHsmClusterId() == null)
            return false;
        if (other.getCloudHsmClusterId() != null && other.getCloudHsmClusterId().equals(this.getCloudHsmClusterId()) == false)
            return false;
        if (other.getXksProxyUriEndpoint() == null ^ this.getXksProxyUriEndpoint() == null)
            return false;
        if (other.getXksProxyUriEndpoint() != null && other.getXksProxyUriEndpoint().equals(this.getXksProxyUriEndpoint()) == false)
            return false;
        if (other.getXksProxyUriPath() == null ^ this.getXksProxyUriPath() == null)
            return false;
        if (other.getXksProxyUriPath() != null && other.getXksProxyUriPath().equals(this.getXksProxyUriPath()) == false)
            return false;
        if (other.getXksProxyVpcEndpointServiceName() == null ^ this.getXksProxyVpcEndpointServiceName() == null)
            return false;
        if (other.getXksProxyVpcEndpointServiceName() != null
                && other.getXksProxyVpcEndpointServiceName().equals(this.getXksProxyVpcEndpointServiceName()) == false)
            return false;
        if (other.getXksProxyAuthenticationCredential() == null ^ this.getXksProxyAuthenticationCredential() == null)
            return false;
        if (other.getXksProxyAuthenticationCredential() != null
                && other.getXksProxyAuthenticationCredential().equals(this.getXksProxyAuthenticationCredential()) == false)
            return false;
        if (other.getXksProxyConnectivity() == null ^ this.getXksProxyConnectivity() == null)
            return false;
        if (other.getXksProxyConnectivity() != null && other.getXksProxyConnectivity().equals(this.getXksProxyConnectivity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime * hashCode + ((getNewCustomKeyStoreName() == null) ? 0 : getNewCustomKeyStoreName().hashCode());
        hashCode = prime * hashCode + ((getKeyStorePassword() == null) ? 0 : getKeyStorePassword().hashCode());
        hashCode = prime * hashCode + ((getCloudHsmClusterId() == null) ? 0 : getCloudHsmClusterId().hashCode());
        hashCode = prime * hashCode + ((getXksProxyUriEndpoint() == null) ? 0 : getXksProxyUriEndpoint().hashCode());
        hashCode = prime * hashCode + ((getXksProxyUriPath() == null) ? 0 : getXksProxyUriPath().hashCode());
        hashCode = prime * hashCode + ((getXksProxyVpcEndpointServiceName() == null) ? 0 : getXksProxyVpcEndpointServiceName().hashCode());
        hashCode = prime * hashCode + ((getXksProxyAuthenticationCredential() == null) ? 0 : getXksProxyAuthenticationCredential().hashCode());
        hashCode = prime * hashCode + ((getXksProxyConnectivity() == null) ? 0 : getXksProxyConnectivity().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCustomKeyStoreRequest clone() {
        return (UpdateCustomKeyStoreRequest) super.clone();
    }

}
