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
     * Specifies a friendly name for the custom key store. The name must be unique in your AWS account.
     * </p>
     */
    private String customKeyStoreName;
    /**
     * <p>
     * Identifies the AWS CloudHSM cluster for the custom key store. Enter the cluster ID of any active AWS CloudHSM
     * cluster that is not already associated with a custom key store. To find the cluster ID, use the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     */
    private String cloudHsmClusterId;
    /**
     * <p>
     * Enter the content of the trust anchor certificate for the cluster. This is the content of the
     * <code>customerCA.crt</code> file that you created when you <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the cluster</a>.
     * </p>
     */
    private String trustAnchorCertificate;
    /**
     * <p>
     * Enter the password of the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS CloudHSM cluster. AWS KMS logs into the
     * cluster as this user to manage key material on your behalf.
     * </p>
     * <p>
     * This parameter tells AWS KMS the <code>kmsuser</code> account password; it does not change the password in the
     * AWS CloudHSM cluster.
     * </p>
     */
    private String keyStorePassword;

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be unique in your AWS account.
     * </p>
     * 
     * @param customKeyStoreName
     *        Specifies a friendly name for the custom key store. The name must be unique in your AWS account.
     */

    public void setCustomKeyStoreName(String customKeyStoreName) {
        this.customKeyStoreName = customKeyStoreName;
    }

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be unique in your AWS account.
     * </p>
     * 
     * @return Specifies a friendly name for the custom key store. The name must be unique in your AWS account.
     */

    public String getCustomKeyStoreName() {
        return this.customKeyStoreName;
    }

    /**
     * <p>
     * Specifies a friendly name for the custom key store. The name must be unique in your AWS account.
     * </p>
     * 
     * @param customKeyStoreName
     *        Specifies a friendly name for the custom key store. The name must be unique in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withCustomKeyStoreName(String customKeyStoreName) {
        setCustomKeyStoreName(customKeyStoreName);
        return this;
    }

    /**
     * <p>
     * Identifies the AWS CloudHSM cluster for the custom key store. Enter the cluster ID of any active AWS CloudHSM
     * cluster that is not already associated with a custom key store. To find the cluster ID, use the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        Identifies the AWS CloudHSM cluster for the custom key store. Enter the cluster ID of any active AWS
     *        CloudHSM cluster that is not already associated with a custom key store. To find the cluster ID, use the
     *        <a href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">
     *        DescribeClusters</a> operation.
     */

    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * Identifies the AWS CloudHSM cluster for the custom key store. Enter the cluster ID of any active AWS CloudHSM
     * cluster that is not already associated with a custom key store. To find the cluster ID, use the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * 
     * @return Identifies the AWS CloudHSM cluster for the custom key store. Enter the cluster ID of any active AWS
     *         CloudHSM cluster that is not already associated with a custom key store. To find the cluster ID, use the
     *         <a href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">
     *         DescribeClusters</a> operation.
     */

    public String getCloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }

    /**
     * <p>
     * Identifies the AWS CloudHSM cluster for the custom key store. Enter the cluster ID of any active AWS CloudHSM
     * cluster that is not already associated with a custom key store. To find the cluster ID, use the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        Identifies the AWS CloudHSM cluster for the custom key store. Enter the cluster ID of any active AWS
     *        CloudHSM cluster that is not already associated with a custom key store. To find the cluster ID, use the
     *        <a href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">
     *        DescribeClusters</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withCloudHsmClusterId(String cloudHsmClusterId) {
        setCloudHsmClusterId(cloudHsmClusterId);
        return this;
    }

    /**
     * <p>
     * Enter the content of the trust anchor certificate for the cluster. This is the content of the
     * <code>customerCA.crt</code> file that you created when you <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the cluster</a>.
     * </p>
     * 
     * @param trustAnchorCertificate
     *        Enter the content of the trust anchor certificate for the cluster. This is the content of the
     *        <code>customerCA.crt</code> file that you created when you <a
     *        href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the
     *        cluster</a>.
     */

    public void setTrustAnchorCertificate(String trustAnchorCertificate) {
        this.trustAnchorCertificate = trustAnchorCertificate;
    }

    /**
     * <p>
     * Enter the content of the trust anchor certificate for the cluster. This is the content of the
     * <code>customerCA.crt</code> file that you created when you <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the cluster</a>.
     * </p>
     * 
     * @return Enter the content of the trust anchor certificate for the cluster. This is the content of the
     *         <code>customerCA.crt</code> file that you created when you <a
     *         href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the
     *         cluster</a>.
     */

    public String getTrustAnchorCertificate() {
        return this.trustAnchorCertificate;
    }

    /**
     * <p>
     * Enter the content of the trust anchor certificate for the cluster. This is the content of the
     * <code>customerCA.crt</code> file that you created when you <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the cluster</a>.
     * </p>
     * 
     * @param trustAnchorCertificate
     *        Enter the content of the trust anchor certificate for the cluster. This is the content of the
     *        <code>customerCA.crt</code> file that you created when you <a
     *        href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the
     *        cluster</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withTrustAnchorCertificate(String trustAnchorCertificate) {
        setTrustAnchorCertificate(trustAnchorCertificate);
        return this;
    }

    /**
     * <p>
     * Enter the password of the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS CloudHSM cluster. AWS KMS logs into the
     * cluster as this user to manage key material on your behalf.
     * </p>
     * <p>
     * This parameter tells AWS KMS the <code>kmsuser</code> account password; it does not change the password in the
     * AWS CloudHSM cluster.
     * </p>
     * 
     * @param keyStorePassword
     *        Enter the password of the <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     *        <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS CloudHSM cluster. AWS KMS logs into
     *        the cluster as this user to manage key material on your behalf.</p>
     *        <p>
     *        This parameter tells AWS KMS the <code>kmsuser</code> account password; it does not change the password in
     *        the AWS CloudHSM cluster.
     */

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    /**
     * <p>
     * Enter the password of the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS CloudHSM cluster. AWS KMS logs into the
     * cluster as this user to manage key material on your behalf.
     * </p>
     * <p>
     * This parameter tells AWS KMS the <code>kmsuser</code> account password; it does not change the password in the
     * AWS CloudHSM cluster.
     * </p>
     * 
     * @return Enter the password of the <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     *         <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS CloudHSM cluster. AWS KMS logs
     *         into the cluster as this user to manage key material on your behalf.</p>
     *         <p>
     *         This parameter tells AWS KMS the <code>kmsuser</code> account password; it does not change the password
     *         in the AWS CloudHSM cluster.
     */

    public String getKeyStorePassword() {
        return this.keyStorePassword;
    }

    /**
     * <p>
     * Enter the password of the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS CloudHSM cluster. AWS KMS logs into the
     * cluster as this user to manage key material on your behalf.
     * </p>
     * <p>
     * This parameter tells AWS KMS the <code>kmsuser</code> account password; it does not change the password in the
     * AWS CloudHSM cluster.
     * </p>
     * 
     * @param keyStorePassword
     *        Enter the password of the <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     *        <code>kmsuser</code> crypto user (CU) account</a> in the specified AWS CloudHSM cluster. AWS KMS logs into
     *        the cluster as this user to manage key material on your behalf.</p>
     *        <p>
     *        This parameter tells AWS KMS the <code>kmsuser</code> account password; it does not change the password in
     *        the AWS CloudHSM cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomKeyStoreRequest withKeyStorePassword(String keyStorePassword) {
        setKeyStorePassword(keyStorePassword);
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
            sb.append("KeyStorePassword: ").append("***Sensitive Data Redacted***");
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
        return hashCode;
    }

    @Override
    public CreateCustomKeyStoreRequest clone() {
        return (CreateCustomKeyStoreRequest) super.clone();
    }

}
