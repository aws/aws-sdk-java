/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.glacier.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#setVaultNotifications(SetVaultNotificationsRequest) SetVaultNotifications operation}.
 * <p>
 * This operation configures notifications that will be sent when specific events happen to a vault. By default, you don't get any notifications.
 * </p>
 * <p>
 * To configure vault notifications, send a PUT request to the <code>notification-configuration</code> subresource of the vault. The request should
 * include a JSON document that provides an Amazon SNS topic and specific events for which you want Amazon Glacier to send notifications to the topic.
 * </p>
 * <p>
 * Amazon SNS topics must grant permission to the vault to be allowed to publish notifications to the topic. You can configure a vault to publish a
 * notification for the following vault events:
 * </p>
 * 
 * <ul>
 * <li> <b>ArchiveRetrievalCompleted</b> This event occurs when a job that was initiated for an archive retrieval is completed (InitiateJob). The status
 * of the completed job can be "Succeeded" or "Failed". The notification sent to the SNS topic is the same output as returned from DescribeJob. </li>
 * <li> <b>InventoryRetrievalCompleted</b> This event occurs when a job that was initiated for an inventory retrieval is completed (InitiateJob). The
 * status of the completed job can be "Succeeded" or "Failed". The notification sent to the SNS topic is the same output as returned from DescribeJob.
 * </li>
 * 
 * </ul>
 * <p>
 * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any
 * permissions by default. You must grant them explicit permission to perform specific actions. For more information, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html"> Access Control Using AWS Identity and Access
 * Management (IAM) </a> .
 * </p>
 * <p>
 * For conceptual information and underlying REST API, go to <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/configuring-notifications.html"> Configuring Vault Notifications in Amazon Glacier
 * </a> and <a href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-vault-notifications-put.html"> Set Vault Notification Configuration
 * </a> in the <i>Amazon Glacier Developer Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#setVaultNotifications(SetVaultNotificationsRequest)
 */
public class SetVaultNotificationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     */
    private String accountId;

    /**
     * The name of the vault.
     */
    private String vaultName;

    /**
     * Provides options for specifying notification configuration.
     */
    private VaultNotificationConfig vaultNotificationConfig;

    /**
     * Default constructor for a new SetVaultNotificationsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SetVaultNotificationsRequest() {}
    
    /**
     * Constructs a new SetVaultNotificationsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     * @param vaultNotificationConfig Provides options for specifying
     * notification configuration.
     */
    public SetVaultNotificationsRequest(String vaultName, VaultNotificationConfig vaultNotificationConfig) {
        setVaultName(vaultName);
        setVaultNotificationConfig(vaultNotificationConfig);
    }

    /**
     * Constructs a new SetVaultNotificationsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param vaultName The name of the vault.
     * @param vaultNotificationConfig Provides options for specifying
     * notification configuration.
     */
    public SetVaultNotificationsRequest(String accountId, String vaultName, VaultNotificationConfig vaultNotificationConfig) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setVaultNotificationConfig(vaultNotificationConfig);
    }

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     *
     * @return The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     *
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetVaultNotificationsRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The name of the vault.
     *
     * @return The name of the vault.
     */
    public String getVaultName() {
        return vaultName;
    }
    
    /**
     * The name of the vault.
     *
     * @param vaultName The name of the vault.
     */
    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }
    
    /**
     * The name of the vault.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultName The name of the vault.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetVaultNotificationsRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Provides options for specifying notification configuration.
     *
     * @return Provides options for specifying notification configuration.
     */
    public VaultNotificationConfig getVaultNotificationConfig() {
        return vaultNotificationConfig;
    }
    
    /**
     * Provides options for specifying notification configuration.
     *
     * @param vaultNotificationConfig Provides options for specifying notification configuration.
     */
    public void setVaultNotificationConfig(VaultNotificationConfig vaultNotificationConfig) {
        this.vaultNotificationConfig = vaultNotificationConfig;
    }
    
    /**
     * Provides options for specifying notification configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultNotificationConfig Provides options for specifying notification configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetVaultNotificationsRequest withVaultNotificationConfig(VaultNotificationConfig vaultNotificationConfig) {
        this.vaultNotificationConfig = vaultNotificationConfig;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getVaultName() != null) sb.append("VaultName: " + getVaultName() + ",");
        if (getVaultNotificationConfig() != null) sb.append("VaultNotificationConfig: " + getVaultNotificationConfig() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getVaultNotificationConfig() == null) ? 0 : getVaultNotificationConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetVaultNotificationsRequest == false) return false;
        SetVaultNotificationsRequest other = (SetVaultNotificationsRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getVaultNotificationConfig() == null ^ this.getVaultNotificationConfig() == null) return false;
        if (other.getVaultNotificationConfig() != null && other.getVaultNotificationConfig().equals(this.getVaultNotificationConfig()) == false) return false; 
        return true;
    }
    
}
    