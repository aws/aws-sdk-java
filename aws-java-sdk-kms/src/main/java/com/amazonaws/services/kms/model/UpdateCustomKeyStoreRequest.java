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
     * be unique in the AWS account.
     * </p>
     */
    private String newCustomKeyStoreName;
    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU) in the AWS CloudHSM cluster that is
     * associated with the custom key store.
     * </p>
     * <p>
     * This parameter tells AWS KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not set
     * or change the password of any users in the AWS CloudHSM cluster.
     * </p>
     */
    private String keyStorePassword;
    /**
     * <p>
     * Associates the custom key store with a related AWS CloudHSM cluster.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a
     * backup history with the original cluster. You cannot use this parameter to associate a custom key store with a
     * different cluster.
     * </p>
     * <p>
     * Clusters that share a backup history have the same cluster certificate. To view the cluster certificate of a
     * cluster, use the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     */
    private String cloudHsmClusterId;

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
     * be unique in the AWS account.
     * </p>
     * 
     * @param newCustomKeyStoreName
     *        Changes the friendly name of the custom key store to the value that you specify. The custom key store name
     *        must be unique in the AWS account.
     */

    public void setNewCustomKeyStoreName(String newCustomKeyStoreName) {
        this.newCustomKeyStoreName = newCustomKeyStoreName;
    }

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must
     * be unique in the AWS account.
     * </p>
     * 
     * @return Changes the friendly name of the custom key store to the value that you specify. The custom key store
     *         name must be unique in the AWS account.
     */

    public String getNewCustomKeyStoreName() {
        return this.newCustomKeyStoreName;
    }

    /**
     * <p>
     * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must
     * be unique in the AWS account.
     * </p>
     * 
     * @param newCustomKeyStoreName
     *        Changes the friendly name of the custom key store to the value that you specify. The custom key store name
     *        must be unique in the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withNewCustomKeyStoreName(String newCustomKeyStoreName) {
        setNewCustomKeyStoreName(newCustomKeyStoreName);
        return this;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU) in the AWS CloudHSM cluster that is
     * associated with the custom key store.
     * </p>
     * <p>
     * This parameter tells AWS KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not set
     * or change the password of any users in the AWS CloudHSM cluster.
     * </p>
     * 
     * @param keyStorePassword
     *        Enter the current password of the <code>kmsuser</code> crypto user (CU) in the AWS CloudHSM cluster that
     *        is associated with the custom key store.</p>
     *        <p>
     *        This parameter tells AWS KMS the current password of the <code>kmsuser</code> crypto user (CU). It does
     *        not set or change the password of any users in the AWS CloudHSM cluster.
     */

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU) in the AWS CloudHSM cluster that is
     * associated with the custom key store.
     * </p>
     * <p>
     * This parameter tells AWS KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not set
     * or change the password of any users in the AWS CloudHSM cluster.
     * </p>
     * 
     * @return Enter the current password of the <code>kmsuser</code> crypto user (CU) in the AWS CloudHSM cluster that
     *         is associated with the custom key store.</p>
     *         <p>
     *         This parameter tells AWS KMS the current password of the <code>kmsuser</code> crypto user (CU). It does
     *         not set or change the password of any users in the AWS CloudHSM cluster.
     */

    public String getKeyStorePassword() {
        return this.keyStorePassword;
    }

    /**
     * <p>
     * Enter the current password of the <code>kmsuser</code> crypto user (CU) in the AWS CloudHSM cluster that is
     * associated with the custom key store.
     * </p>
     * <p>
     * This parameter tells AWS KMS the current password of the <code>kmsuser</code> crypto user (CU). It does not set
     * or change the password of any users in the AWS CloudHSM cluster.
     * </p>
     * 
     * @param keyStorePassword
     *        Enter the current password of the <code>kmsuser</code> crypto user (CU) in the AWS CloudHSM cluster that
     *        is associated with the custom key store.</p>
     *        <p>
     *        This parameter tells AWS KMS the current password of the <code>kmsuser</code> crypto user (CU). It does
     *        not set or change the password of any users in the AWS CloudHSM cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withKeyStorePassword(String keyStorePassword) {
        setKeyStorePassword(keyStorePassword);
        return this;
    }

    /**
     * <p>
     * Associates the custom key store with a related AWS CloudHSM cluster.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a
     * backup history with the original cluster. You cannot use this parameter to associate a custom key store with a
     * different cluster.
     * </p>
     * <p>
     * Clusters that share a backup history have the same cluster certificate. To view the cluster certificate of a
     * cluster, use the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        Associates the custom key store with a related AWS CloudHSM cluster. </p>
     *        <p>
     *        Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares
     *        a backup history with the original cluster. You cannot use this parameter to associate a custom key store
     *        with a different cluster.
     *        </p>
     *        <p>
     *        Clusters that share a backup history have the same cluster certificate. To view the cluster certificate of
     *        a cluster, use the <a
     *        href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *        >DescribeClusters</a> operation.
     */

    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * Associates the custom key store with a related AWS CloudHSM cluster.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a
     * backup history with the original cluster. You cannot use this parameter to associate a custom key store with a
     * different cluster.
     * </p>
     * <p>
     * Clusters that share a backup history have the same cluster certificate. To view the cluster certificate of a
     * cluster, use the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * 
     * @return Associates the custom key store with a related AWS CloudHSM cluster. </p>
     *         <p>
     *         Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares
     *         a backup history with the original cluster. You cannot use this parameter to associate a custom key store
     *         with a different cluster.
     *         </p>
     *         <p>
     *         Clusters that share a backup history have the same cluster certificate. To view the cluster certificate
     *         of a cluster, use the <a
     *         href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *         >DescribeClusters</a> operation.
     */

    public String getCloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }

    /**
     * <p>
     * Associates the custom key store with a related AWS CloudHSM cluster.
     * </p>
     * <p>
     * Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a
     * backup history with the original cluster. You cannot use this parameter to associate a custom key store with a
     * different cluster.
     * </p>
     * <p>
     * Clusters that share a backup history have the same cluster certificate. To view the cluster certificate of a
     * cluster, use the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        Associates the custom key store with a related AWS CloudHSM cluster. </p>
     *        <p>
     *        Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares
     *        a backup history with the original cluster. You cannot use this parameter to associate a custom key store
     *        with a different cluster.
     *        </p>
     *        <p>
     *        Clusters that share a backup history have the same cluster certificate. To view the cluster certificate of
     *        a cluster, use the <a
     *        href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *        >DescribeClusters</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomKeyStoreRequest withCloudHsmClusterId(String cloudHsmClusterId) {
        setCloudHsmClusterId(cloudHsmClusterId);
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
            sb.append("CloudHsmClusterId: ").append(getCloudHsmClusterId());
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
        return hashCode;
    }

    @Override
    public UpdateCustomKeyStoreRequest clone() {
        return (UpdateCustomKeyStoreRequest) super.clone();
    }

}
