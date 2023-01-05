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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateCustomKeyStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomKeyStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be unique in your Amazon Web Services account
     * and Region. This parameter is required for all custom key stores.
     * </p>
     */
    private String customKeyStoreName;
    /**
     * <p>
     * Identifies the CloudHSM cluster for an CloudHSM key store. This parameter is required for custom key stores with
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of any active CloudHSM cluster that is not already associated with a custom key store. To
     * find the cluster ID, use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     */
    private String cloudHsmClusterId;
    /**
     * <p>
     * Specifies the certificate for an CloudHSM key store. This parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the content of the trust anchor certificate for the CloudHSM cluster. This is the content of the
     * <code>customerCA.crt</code> file that you created when you <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the cluster</a>.
     * </p>
     */
    private String trustAnchorCertificate;
    /**
     * <p>
     * Specifies the <code>kmsuser</code> password for an CloudHSM key store. This parameter is required for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the password of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user (CU) account</a> in the specified CloudHSM cluster. KMS logs into the cluster as
     * this user to manage key material on your behalf.
     * </p>
     * <p>
     * The password must be a string of 7 to 32 characters. Its value is case sensitive.
     * </p>
     * <p>
     * This parameter tells KMS the <code>kmsuser</code> account password; it does not change the password in the
     * CloudHSM cluster.
     * </p>
     */
    private String keyStorePassword;
    /**
     * <p>
     * Specifies the type of custom key store. The default value is <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter or enter <code>AWS_CLOUDHSM</code>. For
     * a custom key store backed by an external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after the key store is created.
     * </p>
     */
    private String customKeyStoreType;
    /**
     * <p>
     * Specifies the endpoint that KMS uses to send requests to the external key store proxy (XKS proxy). This parameter
     * is required for custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The protocol must be HTTPS. KMS communicates on port 443. Do not specify the port in the
     * <code>XksProxyUriEndpoint</code> value.
     * </p>
     * <p>
     * For external key stores with <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>,
     * specify <code>https://</code> followed by the private DNS name of the VPC endpoint service.
     * </p>
     * <p>
     * For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity, this endpoint must be reachable before
     * you create the custom key store. KMS connects to the external key store proxy while creating the custom key
     * store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity, KMS connects when you call
     * the <a>ConnectCustomKeyStore</a> operation.
     * </p>
     * <p>
     * The value of this parameter must begin with <code>https://</code>. The remainder can contain upper and lower case
     * letters (A-Z and a-z), numbers (0-9), dots (<code>.</code>), and hyphens (<code>-</code>). Additional slashes (
     * <code>/</code> and <code>\</code>) are not permitted.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * An external key store with <code>PUBLIC_ENDPOINT</code> connectivity cannot use the same
     * <code>XksProxyUriEndpoint</code> value as an external key store with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity in the same Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each external key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity must have its own private DNS name.
     * The <code>XksProxyUriEndpoint</code> value for external key stores with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity (private DNS name) must be unique in the Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     */
    private String xksProxyUriEndpoint;
    /**
     * <p>
     * Specifies the base path to the proxy APIs for this external key store. To find this value, see the documentation
     * for your external key store proxy. This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code> where <code>v1</code>
     * represents the version of the KMS external key store proxy API. This path can include an optional prefix between
     * the required elements such as <code>/<i>prefix</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     */
    private String xksProxyUriPath;
    /**
     * <p>
     * Specifies the name of the Amazon VPC endpoint service for interface endpoints that is used to communicate with
     * your external key store proxy (XKS proxy). This parameter is required when the value of
     * <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and the value of
     * <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * The Amazon VPC endpoint service must <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements">fulfill
     * all requirements</a> for use with an external key store.
     * </p>
     * <p>
     * <b>Uniqueness requirements:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity can share an Amazon VPC, but each
     * external key store must have its own VPC endpoint service and private DNS name.
     * </p>
     * </li>
     * </ul>
     */
    private String xksProxyVpcEndpointServiceName;
    /**
     * <p>
     * Specifies an authentication credential for the external key store proxy (XKS proxy). This parameter is required
     * for all custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The <code>XksProxyAuthenticationCredential</code> has two required elements: <code>RawSecretAccessKey</code>, a
     * secret key, and <code>AccessKeyId</code>, a unique identifier for the <code>RawSecretAccessKey</code>. For
     * character requirements, see <a href="kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html">
     * XksProxyAuthenticationCredentialType</a>.
     * </p>
     * <p>
     * KMS uses this authentication credential to sign requests to the external key store proxy on your behalf. This
     * credential is unrelated to Identity and Access Management (IAM) and Amazon Web Services credentials.
     * </p>
     * <p>
     * This parameter doesn't set or change the authentication credentials on the XKS proxy. It just tells KMS the
     * credential that you established on your external key store proxy. If you rotate your proxy authentication
     * credential, use the <a>UpdateCustomKeyStore</a> operation to provide the new credential to KMS.
     * </p>
     */
    private XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential;
    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This parameter is required for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify <code>PUBLIC_ENDPOINT</code>. If the external key
     * store proxy uses a Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a private address space entirely within
     * Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with multiple
     * subnets, a VPC endpoint service, a network load balancer, and a verified private DNS name. A public endpoint is
     * simpler to set up, but it might be slower and might not fulfill your security requirements. You might consider
     * testing with a public endpoint, and then establishing a VPC endpoint service for production tasks. Note that this
     * choice does not determine the location of the external key store proxy. Even if you choose a VPC endpoint
     * service, the proxy can be hosted within the VPC or outside of Amazon Web Services such as in your corporate data
     * center.
     * </p>
     */
    private String xksProxyConnectivity;

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be unique in your Amazon Web Services account
     * and Region. This parameter is required for all custom key stores.
     * </p>
     * 
     * @param customKeyStoreName
     *        Specifies a friendly name for the custom key store. The name must be unique in your Amazon Web Services
     *        account and Region. This parameter is required for all custom key stores.
     */

    public void setCustomKeyStoreName(String customKeyStoreName) {
        this.customKeyStoreName = customKeyStoreName;
    }

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be unique in your Amazon Web Services account
     * and Region. This parameter is required for all custom key stores.
     * </p>
     * 
     * @return Specifies a friendly name for the custom key store. The name must be unique in your Amazon Web Services
     *         account and Region. This parameter is required for all custom key stores.
     */

    public String getCustomKeyStoreName() {
        return this.customKeyStoreName;
    }

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be unique in your Amazon Web Services account
     * and Region. This parameter is required for all custom key stores.
     * </p>
     * 
     * @param customKeyStoreName
     *        Specifies a friendly name for the custom key store. The name must be unique in your Amazon Web Services
     *        account and Region. This parameter is required for all custom key stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withCustomKeyStoreName(String customKeyStoreName) {
        setCustomKeyStoreName(customKeyStoreName);
        return this;
    }

    /**
     * <p>
     * Identifies the CloudHSM cluster for an CloudHSM key store. This parameter is required for custom key stores with
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of any active CloudHSM cluster that is not already associated with a custom key store. To
     * find the cluster ID, use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        Identifies the CloudHSM cluster for an CloudHSM key store. This parameter is required for custom key
     *        stores with <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        Enter the cluster ID of any active CloudHSM cluster that is not already associated with a custom key
     *        store. To find the cluster ID, use the <a
     *        href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *        >DescribeClusters</a> operation.
     */

    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * Identifies the CloudHSM cluster for an CloudHSM key store. This parameter is required for custom key stores with
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of any active CloudHSM cluster that is not already associated with a custom key store. To
     * find the cluster ID, use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * 
     * @return Identifies the CloudHSM cluster for an CloudHSM key store. This parameter is required for custom key
     *         stores with <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *         <p>
     *         Enter the cluster ID of any active CloudHSM cluster that is not already associated with a custom key
     *         store. To find the cluster ID, use the <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *         >DescribeClusters</a> operation.
     */

    public String getCloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }

    /**
     * <p>
     * Identifies the CloudHSM cluster for an CloudHSM key store. This parameter is required for custom key stores with
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the cluster ID of any active CloudHSM cluster that is not already associated with a custom key store. To
     * find the cluster ID, use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        Identifies the CloudHSM cluster for an CloudHSM key store. This parameter is required for custom key
     *        stores with <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        Enter the cluster ID of any active CloudHSM cluster that is not already associated with a custom key
     *        store. To find the cluster ID, use the <a
     *        href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *        >DescribeClusters</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withCloudHsmClusterId(String cloudHsmClusterId) {
        setCloudHsmClusterId(cloudHsmClusterId);
        return this;
    }

    /**
     * <p>
     * Specifies the certificate for an CloudHSM key store. This parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the content of the trust anchor certificate for the CloudHSM cluster. This is the content of the
     * <code>customerCA.crt</code> file that you created when you <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the cluster</a>.
     * </p>
     * 
     * @param trustAnchorCertificate
     *        Specifies the certificate for an CloudHSM key store. This parameter is required for custom key stores with
     *        a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        Enter the content of the trust anchor certificate for the CloudHSM cluster. This is the content of the
     *        <code>customerCA.crt</code> file that you created when you <a
     *        href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the
     *        cluster</a>.
     */

    public void setTrustAnchorCertificate(String trustAnchorCertificate) {
        this.trustAnchorCertificate = trustAnchorCertificate;
    }

    /**
     * <p>
     * Specifies the certificate for an CloudHSM key store. This parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the content of the trust anchor certificate for the CloudHSM cluster. This is the content of the
     * <code>customerCA.crt</code> file that you created when you <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the cluster</a>.
     * </p>
     * 
     * @return Specifies the certificate for an CloudHSM key store. This parameter is required for custom key stores
     *         with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *         <p>
     *         Enter the content of the trust anchor certificate for the CloudHSM cluster. This is the content of the
     *         <code>customerCA.crt</code> file that you created when you <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the
     *         cluster</a>.
     */

    public String getTrustAnchorCertificate() {
        return this.trustAnchorCertificate;
    }

    /**
     * <p>
     * Specifies the certificate for an CloudHSM key store. This parameter is required for custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the content of the trust anchor certificate for the CloudHSM cluster. This is the content of the
     * <code>customerCA.crt</code> file that you created when you <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the cluster</a>.
     * </p>
     * 
     * @param trustAnchorCertificate
     *        Specifies the certificate for an CloudHSM key store. This parameter is required for custom key stores with
     *        a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        Enter the content of the trust anchor certificate for the CloudHSM cluster. This is the content of the
     *        <code>customerCA.crt</code> file that you created when you <a
     *        href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the
     *        cluster</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withTrustAnchorCertificate(String trustAnchorCertificate) {
        setTrustAnchorCertificate(trustAnchorCertificate);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>kmsuser</code> password for an CloudHSM key store. This parameter is required for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the password of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user (CU) account</a> in the specified CloudHSM cluster. KMS logs into the cluster as
     * this user to manage key material on your behalf.
     * </p>
     * <p>
     * The password must be a string of 7 to 32 characters. Its value is case sensitive.
     * </p>
     * <p>
     * This parameter tells KMS the <code>kmsuser</code> account password; it does not change the password in the
     * CloudHSM cluster.
     * </p>
     * 
     * @param keyStorePassword
     *        Specifies the <code>kmsuser</code> password for an CloudHSM key store. This parameter is required for
     *        custom key stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        Enter the password of the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     *        <code>kmsuser</code> crypto user (CU) account</a> in the specified CloudHSM cluster. KMS logs into the
     *        cluster as this user to manage key material on your behalf.
     *        </p>
     *        <p>
     *        The password must be a string of 7 to 32 characters. Its value is case sensitive.
     *        </p>
     *        <p>
     *        This parameter tells KMS the <code>kmsuser</code> account password; it does not change the password in the
     *        CloudHSM cluster.
     */

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    /**
     * <p>
     * Specifies the <code>kmsuser</code> password for an CloudHSM key store. This parameter is required for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the password of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user (CU) account</a> in the specified CloudHSM cluster. KMS logs into the cluster as
     * this user to manage key material on your behalf.
     * </p>
     * <p>
     * The password must be a string of 7 to 32 characters. Its value is case sensitive.
     * </p>
     * <p>
     * This parameter tells KMS the <code>kmsuser</code> account password; it does not change the password in the
     * CloudHSM cluster.
     * </p>
     * 
     * @return Specifies the <code>kmsuser</code> password for an CloudHSM key store. This parameter is required for
     *         custom key stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *         <p>
     *         Enter the password of the <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     *         <code>kmsuser</code> crypto user (CU) account</a> in the specified CloudHSM cluster. KMS logs into the
     *         cluster as this user to manage key material on your behalf.
     *         </p>
     *         <p>
     *         The password must be a string of 7 to 32 characters. Its value is case sensitive.
     *         </p>
     *         <p>
     *         This parameter tells KMS the <code>kmsuser</code> account password; it does not change the password in
     *         the CloudHSM cluster.
     */

    public String getKeyStorePassword() {
        return this.keyStorePassword;
    }

    /**
     * <p>
     * Specifies the <code>kmsuser</code> password for an CloudHSM key store. This parameter is required for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * Enter the password of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user (CU) account</a> in the specified CloudHSM cluster. KMS logs into the cluster as
     * this user to manage key material on your behalf.
     * </p>
     * <p>
     * The password must be a string of 7 to 32 characters. Its value is case sensitive.
     * </p>
     * <p>
     * This parameter tells KMS the <code>kmsuser</code> account password; it does not change the password in the
     * CloudHSM cluster.
     * </p>
     * 
     * @param keyStorePassword
     *        Specifies the <code>kmsuser</code> password for an CloudHSM key store. This parameter is required for
     *        custom key stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        Enter the password of the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     *        <code>kmsuser</code> crypto user (CU) account</a> in the specified CloudHSM cluster. KMS logs into the
     *        cluster as this user to manage key material on your behalf.
     *        </p>
     *        <p>
     *        The password must be a string of 7 to 32 characters. Its value is case sensitive.
     *        </p>
     *        <p>
     *        This parameter tells KMS the <code>kmsuser</code> account password; it does not change the password in the
     *        CloudHSM cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withKeyStorePassword(String keyStorePassword) {
        setKeyStorePassword(keyStorePassword);
        return this;
    }

    /**
     * <p>
     * Specifies the type of custom key store. The default value is <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter or enter <code>AWS_CLOUDHSM</code>. For
     * a custom key store backed by an external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after the key store is created.
     * </p>
     * 
     * @param customKeyStoreType
     *        Specifies the type of custom key store. The default value is <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        For a custom key store backed by an CloudHSM cluster, omit the parameter or enter
     *        <code>AWS_CLOUDHSM</code>. For a custom key store backed by an external key manager outside of Amazon Web
     *        Services, enter <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after the key store is
     *        created.
     * @see CustomKeyStoreType
     */

    public void setCustomKeyStoreType(String customKeyStoreType) {
        this.customKeyStoreType = customKeyStoreType;
    }

    /**
     * <p>
     * Specifies the type of custom key store. The default value is <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter or enter <code>AWS_CLOUDHSM</code>. For
     * a custom key store backed by an external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after the key store is created.
     * </p>
     * 
     * @return Specifies the type of custom key store. The default value is <code>AWS_CLOUDHSM</code>.</p>
     *         <p>
     *         For a custom key store backed by an CloudHSM cluster, omit the parameter or enter
     *         <code>AWS_CLOUDHSM</code>. For a custom key store backed by an external key manager outside of Amazon Web
     *         Services, enter <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after the key store is
     *         created.
     * @see CustomKeyStoreType
     */

    public String getCustomKeyStoreType() {
        return this.customKeyStoreType;
    }

    /**
     * <p>
     * Specifies the type of custom key store. The default value is <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter or enter <code>AWS_CLOUDHSM</code>. For
     * a custom key store backed by an external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after the key store is created.
     * </p>
     * 
     * @param customKeyStoreType
     *        Specifies the type of custom key store. The default value is <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        For a custom key store backed by an CloudHSM cluster, omit the parameter or enter
     *        <code>AWS_CLOUDHSM</code>. For a custom key store backed by an external key manager outside of Amazon Web
     *        Services, enter <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after the key store is
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomKeyStoreType
     */

    public CreateCustomKeyStoreRequest withCustomKeyStoreType(String customKeyStoreType) {
        setCustomKeyStoreType(customKeyStoreType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of custom key store. The default value is <code>AWS_CLOUDHSM</code>.
     * </p>
     * <p>
     * For a custom key store backed by an CloudHSM cluster, omit the parameter or enter <code>AWS_CLOUDHSM</code>. For
     * a custom key store backed by an external key manager outside of Amazon Web Services, enter
     * <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after the key store is created.
     * </p>
     * 
     * @param customKeyStoreType
     *        Specifies the type of custom key store. The default value is <code>AWS_CLOUDHSM</code>.</p>
     *        <p>
     *        For a custom key store backed by an CloudHSM cluster, omit the parameter or enter
     *        <code>AWS_CLOUDHSM</code>. For a custom key store backed by an external key manager outside of Amazon Web
     *        Services, enter <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after the key store is
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomKeyStoreType
     */

    public CreateCustomKeyStoreRequest withCustomKeyStoreType(CustomKeyStoreType customKeyStoreType) {
        this.customKeyStoreType = customKeyStoreType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint that KMS uses to send requests to the external key store proxy (XKS proxy). This parameter
     * is required for custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The protocol must be HTTPS. KMS communicates on port 443. Do not specify the port in the
     * <code>XksProxyUriEndpoint</code> value.
     * </p>
     * <p>
     * For external key stores with <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>,
     * specify <code>https://</code> followed by the private DNS name of the VPC endpoint service.
     * </p>
     * <p>
     * For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity, this endpoint must be reachable before
     * you create the custom key store. KMS connects to the external key store proxy while creating the custom key
     * store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity, KMS connects when you call
     * the <a>ConnectCustomKeyStore</a> operation.
     * </p>
     * <p>
     * The value of this parameter must begin with <code>https://</code>. The remainder can contain upper and lower case
     * letters (A-Z and a-z), numbers (0-9), dots (<code>.</code>), and hyphens (<code>-</code>). Additional slashes (
     * <code>/</code> and <code>\</code>) are not permitted.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * An external key store with <code>PUBLIC_ENDPOINT</code> connectivity cannot use the same
     * <code>XksProxyUriEndpoint</code> value as an external key store with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity in the same Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each external key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity must have its own private DNS name.
     * The <code>XksProxyUriEndpoint</code> value for external key stores with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity (private DNS name) must be unique in the Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param xksProxyUriEndpoint
     *        Specifies the endpoint that KMS uses to send requests to the external key store proxy (XKS proxy). This
     *        parameter is required for custom key stores with a <code>CustomKeyStoreType</code> of
     *        <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        The protocol must be HTTPS. KMS communicates on port 443. Do not specify the port in the
     *        <code>XksProxyUriEndpoint</code> value.
     *        </p>
     *        <p>
     *        For external key stores with <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>,
     *        specify <code>https://</code> followed by the private DNS name of the VPC endpoint service.
     *        </p>
     *        <p>
     *        For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity, this endpoint must be reachable
     *        before you create the custom key store. KMS connects to the external key store proxy while creating the
     *        custom key store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity, KMS
     *        connects when you call the <a>ConnectCustomKeyStore</a> operation.
     *        </p>
     *        <p>
     *        The value of this parameter must begin with <code>https://</code>. The remainder can contain upper and
     *        lower case letters (A-Z and a-z), numbers (0-9), dots (<code>.</code>), and hyphens (<code>-</code>).
     *        Additional slashes (<code>/</code> and <code>\</code>) are not permitted.
     *        </p>
     *        <p>
     *        <b>Uniqueness requirements: </b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *        the Amazon Web Services account and Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An external key store with <code>PUBLIC_ENDPOINT</code> connectivity cannot use the same
     *        <code>XksProxyUriEndpoint</code> value as an external key store with <code>VPC_ENDPOINT_SERVICE</code>
     *        connectivity in the same Amazon Web Services Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each external key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity must have its own private DNS
     *        name. The <code>XksProxyUriEndpoint</code> value for external key stores with
     *        <code>VPC_ENDPOINT_SERVICE</code> connectivity (private DNS name) must be unique in the Amazon Web
     *        Services account and Region.
     *        </p>
     *        </li>
     */

    public void setXksProxyUriEndpoint(String xksProxyUriEndpoint) {
        this.xksProxyUriEndpoint = xksProxyUriEndpoint;
    }

    /**
     * <p>
     * Specifies the endpoint that KMS uses to send requests to the external key store proxy (XKS proxy). This parameter
     * is required for custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The protocol must be HTTPS. KMS communicates on port 443. Do not specify the port in the
     * <code>XksProxyUriEndpoint</code> value.
     * </p>
     * <p>
     * For external key stores with <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>,
     * specify <code>https://</code> followed by the private DNS name of the VPC endpoint service.
     * </p>
     * <p>
     * For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity, this endpoint must be reachable before
     * you create the custom key store. KMS connects to the external key store proxy while creating the custom key
     * store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity, KMS connects when you call
     * the <a>ConnectCustomKeyStore</a> operation.
     * </p>
     * <p>
     * The value of this parameter must begin with <code>https://</code>. The remainder can contain upper and lower case
     * letters (A-Z and a-z), numbers (0-9), dots (<code>.</code>), and hyphens (<code>-</code>). Additional slashes (
     * <code>/</code> and <code>\</code>) are not permitted.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * An external key store with <code>PUBLIC_ENDPOINT</code> connectivity cannot use the same
     * <code>XksProxyUriEndpoint</code> value as an external key store with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity in the same Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each external key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity must have its own private DNS name.
     * The <code>XksProxyUriEndpoint</code> value for external key stores with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity (private DNS name) must be unique in the Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the endpoint that KMS uses to send requests to the external key store proxy (XKS proxy). This
     *         parameter is required for custom key stores with a <code>CustomKeyStoreType</code> of
     *         <code>EXTERNAL_KEY_STORE</code>.</p>
     *         <p>
     *         The protocol must be HTTPS. KMS communicates on port 443. Do not specify the port in the
     *         <code>XksProxyUriEndpoint</code> value.
     *         </p>
     *         <p>
     *         For external key stores with <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>
     *         , specify <code>https://</code> followed by the private DNS name of the VPC endpoint service.
     *         </p>
     *         <p>
     *         For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity, this endpoint must be reachable
     *         before you create the custom key store. KMS connects to the external key store proxy while creating the
     *         custom key store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity, KMS
     *         connects when you call the <a>ConnectCustomKeyStore</a> operation.
     *         </p>
     *         <p>
     *         The value of this parameter must begin with <code>https://</code>. The remainder can contain upper and
     *         lower case letters (A-Z and a-z), numbers (0-9), dots (<code>.</code>), and hyphens (<code>-</code>).
     *         Additional slashes (<code>/</code> and <code>\</code>) are not permitted.
     *         </p>
     *         <p>
     *         <b>Uniqueness requirements: </b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *         the Amazon Web Services account and Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An external key store with <code>PUBLIC_ENDPOINT</code> connectivity cannot use the same
     *         <code>XksProxyUriEndpoint</code> value as an external key store with <code>VPC_ENDPOINT_SERVICE</code>
     *         connectivity in the same Amazon Web Services Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each external key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity must have its own private DNS
     *         name. The <code>XksProxyUriEndpoint</code> value for external key stores with
     *         <code>VPC_ENDPOINT_SERVICE</code> connectivity (private DNS name) must be unique in the Amazon Web
     *         Services account and Region.
     *         </p>
     *         </li>
     */

    public String getXksProxyUriEndpoint() {
        return this.xksProxyUriEndpoint;
    }

    /**
     * <p>
     * Specifies the endpoint that KMS uses to send requests to the external key store proxy (XKS proxy). This parameter
     * is required for custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The protocol must be HTTPS. KMS communicates on port 443. Do not specify the port in the
     * <code>XksProxyUriEndpoint</code> value.
     * </p>
     * <p>
     * For external key stores with <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>,
     * specify <code>https://</code> followed by the private DNS name of the VPC endpoint service.
     * </p>
     * <p>
     * For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity, this endpoint must be reachable before
     * you create the custom key store. KMS connects to the external key store proxy while creating the custom key
     * store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity, KMS connects when you call
     * the <a>ConnectCustomKeyStore</a> operation.
     * </p>
     * <p>
     * The value of this parameter must begin with <code>https://</code>. The remainder can contain upper and lower case
     * letters (A-Z and a-z), numbers (0-9), dots (<code>.</code>), and hyphens (<code>-</code>). Additional slashes (
     * <code>/</code> and <code>\</code>) are not permitted.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * An external key store with <code>PUBLIC_ENDPOINT</code> connectivity cannot use the same
     * <code>XksProxyUriEndpoint</code> value as an external key store with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity in the same Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each external key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity must have its own private DNS name.
     * The <code>XksProxyUriEndpoint</code> value for external key stores with <code>VPC_ENDPOINT_SERVICE</code>
     * connectivity (private DNS name) must be unique in the Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param xksProxyUriEndpoint
     *        Specifies the endpoint that KMS uses to send requests to the external key store proxy (XKS proxy). This
     *        parameter is required for custom key stores with a <code>CustomKeyStoreType</code> of
     *        <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        The protocol must be HTTPS. KMS communicates on port 443. Do not specify the port in the
     *        <code>XksProxyUriEndpoint</code> value.
     *        </p>
     *        <p>
     *        For external key stores with <code>XksProxyConnectivity</code> value of <code>VPC_ENDPOINT_SERVICE</code>,
     *        specify <code>https://</code> followed by the private DNS name of the VPC endpoint service.
     *        </p>
     *        <p>
     *        For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity, this endpoint must be reachable
     *        before you create the custom key store. KMS connects to the external key store proxy while creating the
     *        custom key store. For external key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity, KMS
     *        connects when you call the <a>ConnectCustomKeyStore</a> operation.
     *        </p>
     *        <p>
     *        The value of this parameter must begin with <code>https://</code>. The remainder can contain upper and
     *        lower case letters (A-Z and a-z), numbers (0-9), dots (<code>.</code>), and hyphens (<code>-</code>).
     *        Additional slashes (<code>/</code> and <code>\</code>) are not permitted.
     *        </p>
     *        <p>
     *        <b>Uniqueness requirements: </b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *        the Amazon Web Services account and Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An external key store with <code>PUBLIC_ENDPOINT</code> connectivity cannot use the same
     *        <code>XksProxyUriEndpoint</code> value as an external key store with <code>VPC_ENDPOINT_SERVICE</code>
     *        connectivity in the same Amazon Web Services Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each external key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity must have its own private DNS
     *        name. The <code>XksProxyUriEndpoint</code> value for external key stores with
     *        <code>VPC_ENDPOINT_SERVICE</code> connectivity (private DNS name) must be unique in the Amazon Web
     *        Services account and Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withXksProxyUriEndpoint(String xksProxyUriEndpoint) {
        setXksProxyUriEndpoint(xksProxyUriEndpoint);
        return this;
    }

    /**
     * <p>
     * Specifies the base path to the proxy APIs for this external key store. To find this value, see the documentation
     * for your external key store proxy. This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code> where <code>v1</code>
     * represents the version of the KMS external key store proxy API. This path can include an optional prefix between
     * the required elements such as <code>/<i>prefix</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param xksProxyUriPath
     *        Specifies the base path to the proxy APIs for this external key store. To find this value, see the
     *        documentation for your external key store proxy. This parameter is required for all custom key stores with
     *        a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code> where <code>v1</code>
     *        represents the version of the KMS external key store proxy API. This path can include an optional prefix
     *        between the required elements such as <code>/<i>prefix</i>/kms/xks/v1</code>.
     *        </p>
     *        <p>
     *        <b>Uniqueness requirements: </b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *        the Amazon Web Services account and Region.
     *        </p>
     *        </li>
     */

    public void setXksProxyUriPath(String xksProxyUriPath) {
        this.xksProxyUriPath = xksProxyUriPath;
    }

    /**
     * <p>
     * Specifies the base path to the proxy APIs for this external key store. To find this value, see the documentation
     * for your external key store proxy. This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code> where <code>v1</code>
     * represents the version of the KMS external key store proxy API. This path can include an optional prefix between
     * the required elements such as <code>/<i>prefix</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the base path to the proxy APIs for this external key store. To find this value, see the
     *         documentation for your external key store proxy. This parameter is required for all custom key stores
     *         with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.</p>
     *         <p>
     *         The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code> where <code>v1</code>
     *         represents the version of the KMS external key store proxy API. This path can include an optional prefix
     *         between the required elements such as <code>/<i>prefix</i>/kms/xks/v1</code>.
     *         </p>
     *         <p>
     *         <b>Uniqueness requirements: </b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *         the Amazon Web Services account and Region.
     *         </p>
     *         </li>
     */

    public String getXksProxyUriPath() {
        return this.xksProxyUriPath;
    }

    /**
     * <p>
     * Specifies the base path to the proxy APIs for this external key store. To find this value, see the documentation
     * for your external key store proxy. This parameter is required for all custom key stores with a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code> where <code>v1</code>
     * represents the version of the KMS external key store proxy API. This path can include an optional prefix between
     * the required elements such as <code>/<i>prefix</i>/kms/xks/v1</code>.
     * </p>
     * <p>
     * <b>Uniqueness requirements: </b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in the
     * Amazon Web Services account and Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param xksProxyUriPath
     *        Specifies the base path to the proxy APIs for this external key store. To find this value, see the
     *        documentation for your external key store proxy. This parameter is required for all custom key stores with
     *        a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code> where <code>v1</code>
     *        represents the version of the KMS external key store proxy API. This path can include an optional prefix
     *        between the required elements such as <code>/<i>prefix</i>/kms/xks/v1</code>.
     *        </p>
     *        <p>
     *        <b>Uniqueness requirements: </b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must be unique in
     *        the Amazon Web Services account and Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withXksProxyUriPath(String xksProxyUriPath) {
        setXksProxyUriPath(xksProxyUriPath);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Amazon VPC endpoint service for interface endpoints that is used to communicate with
     * your external key store proxy (XKS proxy). This parameter is required when the value of
     * <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and the value of
     * <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * The Amazon VPC endpoint service must <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements">fulfill
     * all requirements</a> for use with an external key store.
     * </p>
     * <p>
     * <b>Uniqueness requirements:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity can share an Amazon VPC, but each
     * external key store must have its own VPC endpoint service and private DNS name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param xksProxyVpcEndpointServiceName
     *        Specifies the name of the Amazon VPC endpoint service for interface endpoints that is used to communicate
     *        with your external key store proxy (XKS proxy). This parameter is required when the value of
     *        <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and the value of
     *        <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.</p>
     *        <p>
     *        The Amazon VPC endpoint service must <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
     *        >fulfill all requirements</a> for use with an external key store.
     *        </p>
     *        <p>
     *        <b>Uniqueness requirements:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity can share an Amazon VPC, but each
     *        external key store must have its own VPC endpoint service and private DNS name.
     *        </p>
     *        </li>
     */

    public void setXksProxyVpcEndpointServiceName(String xksProxyVpcEndpointServiceName) {
        this.xksProxyVpcEndpointServiceName = xksProxyVpcEndpointServiceName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon VPC endpoint service for interface endpoints that is used to communicate with
     * your external key store proxy (XKS proxy). This parameter is required when the value of
     * <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and the value of
     * <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * The Amazon VPC endpoint service must <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements">fulfill
     * all requirements</a> for use with an external key store.
     * </p>
     * <p>
     * <b>Uniqueness requirements:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity can share an Amazon VPC, but each
     * external key store must have its own VPC endpoint service and private DNS name.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the name of the Amazon VPC endpoint service for interface endpoints that is used to communicate
     *         with your external key store proxy (XKS proxy). This parameter is required when the value of
     *         <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and the value of
     *         <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.</p>
     *         <p>
     *         The Amazon VPC endpoint service must <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
     *         >fulfill all requirements</a> for use with an external key store.
     *         </p>
     *         <p>
     *         <b>Uniqueness requirements:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity can share an Amazon VPC, but each
     *         external key store must have its own VPC endpoint service and private DNS name.
     *         </p>
     *         </li>
     */

    public String getXksProxyVpcEndpointServiceName() {
        return this.xksProxyVpcEndpointServiceName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon VPC endpoint service for interface endpoints that is used to communicate with
     * your external key store proxy (XKS proxy). This parameter is required when the value of
     * <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and the value of
     * <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.
     * </p>
     * <p>
     * The Amazon VPC endpoint service must <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements">fulfill
     * all requirements</a> for use with an external key store.
     * </p>
     * <p>
     * <b>Uniqueness requirements:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity can share an Amazon VPC, but each
     * external key store must have its own VPC endpoint service and private DNS name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param xksProxyVpcEndpointServiceName
     *        Specifies the name of the Amazon VPC endpoint service for interface endpoints that is used to communicate
     *        with your external key store proxy (XKS proxy). This parameter is required when the value of
     *        <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and the value of
     *        <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.</p>
     *        <p>
     *        The Amazon VPC endpoint service must <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements"
     *        >fulfill all requirements</a> for use with an external key store.
     *        </p>
     *        <p>
     *        <b>Uniqueness requirements:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity can share an Amazon VPC, but each
     *        external key store must have its own VPC endpoint service and private DNS name.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withXksProxyVpcEndpointServiceName(String xksProxyVpcEndpointServiceName) {
        setXksProxyVpcEndpointServiceName(xksProxyVpcEndpointServiceName);
        return this;
    }

    /**
     * <p>
     * Specifies an authentication credential for the external key store proxy (XKS proxy). This parameter is required
     * for all custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The <code>XksProxyAuthenticationCredential</code> has two required elements: <code>RawSecretAccessKey</code>, a
     * secret key, and <code>AccessKeyId</code>, a unique identifier for the <code>RawSecretAccessKey</code>. For
     * character requirements, see <a href="kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html">
     * XksProxyAuthenticationCredentialType</a>.
     * </p>
     * <p>
     * KMS uses this authentication credential to sign requests to the external key store proxy on your behalf. This
     * credential is unrelated to Identity and Access Management (IAM) and Amazon Web Services credentials.
     * </p>
     * <p>
     * This parameter doesn't set or change the authentication credentials on the XKS proxy. It just tells KMS the
     * credential that you established on your external key store proxy. If you rotate your proxy authentication
     * credential, use the <a>UpdateCustomKeyStore</a> operation to provide the new credential to KMS.
     * </p>
     * 
     * @param xksProxyAuthenticationCredential
     *        Specifies an authentication credential for the external key store proxy (XKS proxy). This parameter is
     *        required for all custom key stores with a <code>CustomKeyStoreType</code> of
     *        <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        The <code>XksProxyAuthenticationCredential</code> has two required elements:
     *        <code>RawSecretAccessKey</code>, a secret key, and <code>AccessKeyId</code>, a unique identifier for the
     *        <code>RawSecretAccessKey</code>. For character requirements, see <a
     *        href="kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html"
     *        >XksProxyAuthenticationCredentialType</a>.
     *        </p>
     *        <p>
     *        KMS uses this authentication credential to sign requests to the external key store proxy on your behalf.
     *        This credential is unrelated to Identity and Access Management (IAM) and Amazon Web Services credentials.
     *        </p>
     *        <p>
     *        This parameter doesn't set or change the authentication credentials on the XKS proxy. It just tells KMS
     *        the credential that you established on your external key store proxy. If you rotate your proxy
     *        authentication credential, use the <a>UpdateCustomKeyStore</a> operation to provide the new credential to
     *        KMS.
     */

    public void setXksProxyAuthenticationCredential(XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential) {
        this.xksProxyAuthenticationCredential = xksProxyAuthenticationCredential;
    }

    /**
     * <p>
     * Specifies an authentication credential for the external key store proxy (XKS proxy). This parameter is required
     * for all custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The <code>XksProxyAuthenticationCredential</code> has two required elements: <code>RawSecretAccessKey</code>, a
     * secret key, and <code>AccessKeyId</code>, a unique identifier for the <code>RawSecretAccessKey</code>. For
     * character requirements, see <a href="kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html">
     * XksProxyAuthenticationCredentialType</a>.
     * </p>
     * <p>
     * KMS uses this authentication credential to sign requests to the external key store proxy on your behalf. This
     * credential is unrelated to Identity and Access Management (IAM) and Amazon Web Services credentials.
     * </p>
     * <p>
     * This parameter doesn't set or change the authentication credentials on the XKS proxy. It just tells KMS the
     * credential that you established on your external key store proxy. If you rotate your proxy authentication
     * credential, use the <a>UpdateCustomKeyStore</a> operation to provide the new credential to KMS.
     * </p>
     * 
     * @return Specifies an authentication credential for the external key store proxy (XKS proxy). This parameter is
     *         required for all custom key stores with a <code>CustomKeyStoreType</code> of
     *         <code>EXTERNAL_KEY_STORE</code>.</p>
     *         <p>
     *         The <code>XksProxyAuthenticationCredential</code> has two required elements:
     *         <code>RawSecretAccessKey</code>, a secret key, and <code>AccessKeyId</code>, a unique identifier for the
     *         <code>RawSecretAccessKey</code>. For character requirements, see <a
     *         href="kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html"
     *         >XksProxyAuthenticationCredentialType</a>.
     *         </p>
     *         <p>
     *         KMS uses this authentication credential to sign requests to the external key store proxy on your behalf.
     *         This credential is unrelated to Identity and Access Management (IAM) and Amazon Web Services credentials.
     *         </p>
     *         <p>
     *         This parameter doesn't set or change the authentication credentials on the XKS proxy. It just tells KMS
     *         the credential that you established on your external key store proxy. If you rotate your proxy
     *         authentication credential, use the <a>UpdateCustomKeyStore</a> operation to provide the new credential to
     *         KMS.
     */

    public XksProxyAuthenticationCredentialType getXksProxyAuthenticationCredential() {
        return this.xksProxyAuthenticationCredential;
    }

    /**
     * <p>
     * Specifies an authentication credential for the external key store proxy (XKS proxy). This parameter is required
     * for all custom key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * The <code>XksProxyAuthenticationCredential</code> has two required elements: <code>RawSecretAccessKey</code>, a
     * secret key, and <code>AccessKeyId</code>, a unique identifier for the <code>RawSecretAccessKey</code>. For
     * character requirements, see <a href="kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html">
     * XksProxyAuthenticationCredentialType</a>.
     * </p>
     * <p>
     * KMS uses this authentication credential to sign requests to the external key store proxy on your behalf. This
     * credential is unrelated to Identity and Access Management (IAM) and Amazon Web Services credentials.
     * </p>
     * <p>
     * This parameter doesn't set or change the authentication credentials on the XKS proxy. It just tells KMS the
     * credential that you established on your external key store proxy. If you rotate your proxy authentication
     * credential, use the <a>UpdateCustomKeyStore</a> operation to provide the new credential to KMS.
     * </p>
     * 
     * @param xksProxyAuthenticationCredential
     *        Specifies an authentication credential for the external key store proxy (XKS proxy). This parameter is
     *        required for all custom key stores with a <code>CustomKeyStoreType</code> of
     *        <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        The <code>XksProxyAuthenticationCredential</code> has two required elements:
     *        <code>RawSecretAccessKey</code>, a secret key, and <code>AccessKeyId</code>, a unique identifier for the
     *        <code>RawSecretAccessKey</code>. For character requirements, see <a
     *        href="kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html"
     *        >XksProxyAuthenticationCredentialType</a>.
     *        </p>
     *        <p>
     *        KMS uses this authentication credential to sign requests to the external key store proxy on your behalf.
     *        This credential is unrelated to Identity and Access Management (IAM) and Amazon Web Services credentials.
     *        </p>
     *        <p>
     *        This parameter doesn't set or change the authentication credentials on the XKS proxy. It just tells KMS
     *        the credential that you established on your external key store proxy. If you rotate your proxy
     *        authentication credential, use the <a>UpdateCustomKeyStore</a> operation to provide the new credential to
     *        KMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withXksProxyAuthenticationCredential(XksProxyAuthenticationCredentialType xksProxyAuthenticationCredential) {
        setXksProxyAuthenticationCredential(xksProxyAuthenticationCredential);
        return this;
    }

    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This parameter is required for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify <code>PUBLIC_ENDPOINT</code>. If the external key
     * store proxy uses a Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a private address space entirely within
     * Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with multiple
     * subnets, a VPC endpoint service, a network load balancer, and a verified private DNS name. A public endpoint is
     * simpler to set up, but it might be slower and might not fulfill your security requirements. You might consider
     * testing with a public endpoint, and then establishing a VPC endpoint service for production tasks. Note that this
     * choice does not determine the location of the external key store proxy. Even if you choose a VPC endpoint
     * service, the proxy can be hosted within the VPC or outside of Amazon Web Services such as in your corporate data
     * center.
     * </p>
     * 
     * @param xksProxyConnectivity
     *        Indicates how KMS communicates with the external key store proxy. This parameter is required for custom
     *        key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        If the external key store proxy uses a public endpoint, specify <code>PUBLIC_ENDPOINT</code>. If the
     *        external key store proxy uses a Amazon VPC endpoint service for communication with KMS, specify
     *        <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     *        >Choosing a connectivity option</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        An Amazon VPC endpoint service keeps your communication with KMS in a private address space entirely
     *        within Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with
     *        multiple subnets, a VPC endpoint service, a network load balancer, and a verified private DNS name. A
     *        public endpoint is simpler to set up, but it might be slower and might not fulfill your security
     *        requirements. You might consider testing with a public endpoint, and then establishing a VPC endpoint
     *        service for production tasks. Note that this choice does not determine the location of the external key
     *        store proxy. Even if you choose a VPC endpoint service, the proxy can be hosted within the VPC or outside
     *        of Amazon Web Services such as in your corporate data center.
     * @see XksProxyConnectivityType
     */

    public void setXksProxyConnectivity(String xksProxyConnectivity) {
        this.xksProxyConnectivity = xksProxyConnectivity;
    }

    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This parameter is required for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify <code>PUBLIC_ENDPOINT</code>. If the external key
     * store proxy uses a Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a private address space entirely within
     * Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with multiple
     * subnets, a VPC endpoint service, a network load balancer, and a verified private DNS name. A public endpoint is
     * simpler to set up, but it might be slower and might not fulfill your security requirements. You might consider
     * testing with a public endpoint, and then establishing a VPC endpoint service for production tasks. Note that this
     * choice does not determine the location of the external key store proxy. Even if you choose a VPC endpoint
     * service, the proxy can be hosted within the VPC or outside of Amazon Web Services such as in your corporate data
     * center.
     * </p>
     * 
     * @return Indicates how KMS communicates with the external key store proxy. This parameter is required for custom
     *         key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.</p>
     *         <p>
     *         If the external key store proxy uses a public endpoint, specify <code>PUBLIC_ENDPOINT</code>. If the
     *         external key store proxy uses a Amazon VPC endpoint service for communication with KMS, specify
     *         <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     *         >Choosing a connectivity option</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         An Amazon VPC endpoint service keeps your communication with KMS in a private address space entirely
     *         within Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with
     *         multiple subnets, a VPC endpoint service, a network load balancer, and a verified private DNS name. A
     *         public endpoint is simpler to set up, but it might be slower and might not fulfill your security
     *         requirements. You might consider testing with a public endpoint, and then establishing a VPC endpoint
     *         service for production tasks. Note that this choice does not determine the location of the external key
     *         store proxy. Even if you choose a VPC endpoint service, the proxy can be hosted within the VPC or outside
     *         of Amazon Web Services such as in your corporate data center.
     * @see XksProxyConnectivityType
     */

    public String getXksProxyConnectivity() {
        return this.xksProxyConnectivity;
    }

    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This parameter is required for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify <code>PUBLIC_ENDPOINT</code>. If the external key
     * store proxy uses a Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a private address space entirely within
     * Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with multiple
     * subnets, a VPC endpoint service, a network load balancer, and a verified private DNS name. A public endpoint is
     * simpler to set up, but it might be slower and might not fulfill your security requirements. You might consider
     * testing with a public endpoint, and then establishing a VPC endpoint service for production tasks. Note that this
     * choice does not determine the location of the external key store proxy. Even if you choose a VPC endpoint
     * service, the proxy can be hosted within the VPC or outside of Amazon Web Services such as in your corporate data
     * center.
     * </p>
     * 
     * @param xksProxyConnectivity
     *        Indicates how KMS communicates with the external key store proxy. This parameter is required for custom
     *        key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        If the external key store proxy uses a public endpoint, specify <code>PUBLIC_ENDPOINT</code>. If the
     *        external key store proxy uses a Amazon VPC endpoint service for communication with KMS, specify
     *        <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     *        >Choosing a connectivity option</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        An Amazon VPC endpoint service keeps your communication with KMS in a private address space entirely
     *        within Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with
     *        multiple subnets, a VPC endpoint service, a network load balancer, and a verified private DNS name. A
     *        public endpoint is simpler to set up, but it might be slower and might not fulfill your security
     *        requirements. You might consider testing with a public endpoint, and then establishing a VPC endpoint
     *        service for production tasks. Note that this choice does not determine the location of the external key
     *        store proxy. Even if you choose a VPC endpoint service, the proxy can be hosted within the VPC or outside
     *        of Amazon Web Services such as in your corporate data center.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XksProxyConnectivityType
     */

    public CreateCustomKeyStoreRequest withXksProxyConnectivity(String xksProxyConnectivity) {
        setXksProxyConnectivity(xksProxyConnectivity);
        return this;
    }

    /**
     * <p>
     * Indicates how KMS communicates with the external key store proxy. This parameter is required for custom key
     * stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * If the external key store proxy uses a public endpoint, specify <code>PUBLIC_ENDPOINT</code>. If the external key
     * store proxy uses a Amazon VPC endpoint service for communication with KMS, specify
     * <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     * >Choosing a connectivity option</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * An Amazon VPC endpoint service keeps your communication with KMS in a private address space entirely within
     * Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with multiple
     * subnets, a VPC endpoint service, a network load balancer, and a verified private DNS name. A public endpoint is
     * simpler to set up, but it might be slower and might not fulfill your security requirements. You might consider
     * testing with a public endpoint, and then establishing a VPC endpoint service for production tasks. Note that this
     * choice does not determine the location of the external key store proxy. Even if you choose a VPC endpoint
     * service, the proxy can be hosted within the VPC or outside of Amazon Web Services such as in your corporate data
     * center.
     * </p>
     * 
     * @param xksProxyConnectivity
     *        Indicates how KMS communicates with the external key store proxy. This parameter is required for custom
     *        key stores with a <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.</p>
     *        <p>
     *        If the external key store proxy uses a public endpoint, specify <code>PUBLIC_ENDPOINT</code>. If the
     *        external key store proxy uses a Amazon VPC endpoint service for communication with KMS, specify
     *        <code>VPC_ENDPOINT_SERVICE</code>. For help making this choice, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity"
     *        >Choosing a connectivity option</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        An Amazon VPC endpoint service keeps your communication with KMS in a private address space entirely
     *        within Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with
     *        multiple subnets, a VPC endpoint service, a network load balancer, and a verified private DNS name. A
     *        public endpoint is simpler to set up, but it might be slower and might not fulfill your security
     *        requirements. You might consider testing with a public endpoint, and then establishing a VPC endpoint
     *        service for production tasks. Note that this choice does not determine the location of the external key
     *        store proxy. Even if you choose a VPC endpoint service, the proxy can be hosted within the VPC or outside
     *        of Amazon Web Services such as in your corporate data center.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see XksProxyConnectivityType
     */

    public CreateCustomKeyStoreRequest withXksProxyConnectivity(XksProxyConnectivityType xksProxyConnectivity) {
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
        if (getCustomKeyStoreName() != null)
            sb.append("CustomKeyStoreName: ").append(getCustomKeyStoreName()).append(",");
        if (getCloudHsmClusterId() != null)
            sb.append("CloudHsmClusterId: ").append(getCloudHsmClusterId()).append(",");
        if (getTrustAnchorCertificate() != null)
            sb.append("TrustAnchorCertificate: ").append(getTrustAnchorCertificate()).append(",");
        if (getKeyStorePassword() != null)
            sb.append("KeyStorePassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getCustomKeyStoreType() != null)
            sb.append("CustomKeyStoreType: ").append(getCustomKeyStoreType()).append(",");
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

        if (obj instanceof CreateCustomKeyStoreRequest == false)
            return false;
        CreateCustomKeyStoreRequest other = (CreateCustomKeyStoreRequest) obj;
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
        if (other.getKeyStorePassword() == null ^ this.getKeyStorePassword() == null)
            return false;
        if (other.getKeyStorePassword() != null && other.getKeyStorePassword().equals(this.getKeyStorePassword()) == false)
            return false;
        if (other.getCustomKeyStoreType() == null ^ this.getCustomKeyStoreType() == null)
            return false;
        if (other.getCustomKeyStoreType() != null && other.getCustomKeyStoreType().equals(this.getCustomKeyStoreType()) == false)
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

        hashCode = prime * hashCode + ((getCustomKeyStoreName() == null) ? 0 : getCustomKeyStoreName().hashCode());
        hashCode = prime * hashCode + ((getCloudHsmClusterId() == null) ? 0 : getCloudHsmClusterId().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchorCertificate() == null) ? 0 : getTrustAnchorCertificate().hashCode());
        hashCode = prime * hashCode + ((getKeyStorePassword() == null) ? 0 : getKeyStorePassword().hashCode());
        hashCode = prime * hashCode + ((getCustomKeyStoreType() == null) ? 0 : getCustomKeyStoreType().hashCode());
        hashCode = prime * hashCode + ((getXksProxyUriEndpoint() == null) ? 0 : getXksProxyUriEndpoint().hashCode());
        hashCode = prime * hashCode + ((getXksProxyUriPath() == null) ? 0 : getXksProxyUriPath().hashCode());
        hashCode = prime * hashCode + ((getXksProxyVpcEndpointServiceName() == null) ? 0 : getXksProxyVpcEndpointServiceName().hashCode());
        hashCode = prime * hashCode + ((getXksProxyAuthenticationCredential() == null) ? 0 : getXksProxyAuthenticationCredential().hashCode());
        hashCode = prime * hashCode + ((getXksProxyConnectivity() == null) ? 0 : getXksProxyConnectivity().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomKeyStoreRequest clone() {
        return (CreateCustomKeyStoreRequest) super.clone();
    }

}
