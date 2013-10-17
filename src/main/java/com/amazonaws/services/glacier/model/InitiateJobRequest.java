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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#initiateJob(InitiateJobRequest) InitiateJob operation}.
 * <p>
 * This operation initiates a job of the specified type. In this release, you can initiate a job to retrieve either an archive or a vault inventory (a
 * list of archives in a vault).
 * </p>
 * <p>
 * Retrieving data from Amazon Glacier is a two-step process:
 * </p>
 * <ol> <li> <p>
 * Initiate a retrieval job.
 * </p>
 * </li>
 * <li> <p>
 * After the job completes, download the bytes.
 * </p>
 * </li>
 * </ol> <p>
 * The retrieval request is executed asynchronously. When you initiate a retrieval job, Amazon Glacier creates a job and returns a job ID in the
 * response. When Amazon Glacier completes the job, you can get the job output (archive or inventory data). For information about getting job output, see
 * GetJobOutput operation.
 * </p>
 * <p>
 * The job must complete before you can get its output. To determine when a job is complete, you have the following options:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <b>Use Amazon SNS Notification</b> You can specify an Amazon Simple Notification Service (Amazon SNS) topic to which Amazon Glacier can post a
 * notification after the job is completed. You can specify an SNS topic per job request. The notification is sent only after Amazon Glacier completes
 * the job. In addition to specifying an SNS topic per job request, you can configure vault notifications for a vault so that job notifications are
 * always sent. For more information, see SetVaultNotificationConfiguration.
 * </p>
 * </li>
 * <li> <p>
 * <b>Get job details</b> You can make a DescribeJob request to obtain job status information while a job is in progress. However, it is more efficient
 * to use an Amazon SNS notification to determine when a job is complete.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>NOTE:</b> The information you get via notification is same that you get by calling DescribeJob.
 * </p>
 * <p>
 * If for a specific event, you add both the notification configuration on the vault and also specify an SNS topic in your initiate job request, Amazon
 * Glacier sends both notifications. For more information, see SetVaultNotificationConfiguration.
 * </p>
 * <p>
 * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any
 * permissions by default. You must grant them explicit permission to perform specific actions. For more information, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html"> Access Control Using AWS Identity and Access
 * Management (IAM) </a> .
 * </p>
 * <p>
 * <b>About the Vault Inventory</b>
 * </p>
 * <p>
 * Amazon Glacier prepares an inventory for each vault periodically, every 24 hours. When you initiate a job for a vault inventory, Amazon Glacier
 * returns the last inventory for the vault. The inventory data you get might be up to a day or two days old. Also, the initiate inventory job might take
 * some time to complete before you can download the vault inventory. So you do not want to retrieve a vault inventory for each vault operation. However,
 * in some scenarios, you might find the vault inventory useful. For example, when you upload an archive, you can provide an archive description but not
 * an archive name. Amazon Glacier provides you a unique archive ID, an opaque string of characters. So, you might maintain your own database that maps
 * archive names to their corresponding Amazon Glacier assigned archive IDs. You might find the vault inventory useful in the event you need to reconcile
 * information in your database with the actual vault inventory.
 * </p>
 * <p>
 * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any
 * permissions by default. You must grant them explicit permission to perform specific actions. For more information, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html"> Access Control Using AWS Identity and Access
 * Management (IAM) </a> .
 * </p>
 * <p>
 * For conceptual information and the underlying REST API, go to <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-initiate-job-post.html"> Initiate a Job </a> and <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/vault-inventory.html"> Downloading a Vault Inventory </a>
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#initiateJob(InitiateJobRequest)
 */
public class InitiateJobRequest extends AmazonWebServiceRequest implements Serializable {

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
     * Provides options for specifying job information.
     */
    private JobParameters jobParameters;

    /**
     * Default constructor for a new InitiateJobRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public InitiateJobRequest() {}
    
    /**
     * Constructs a new InitiateJobRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     * @param jobParameters Provides options for specifying job information.
     */
    public InitiateJobRequest(String vaultName, JobParameters jobParameters) {
        setVaultName(vaultName);
        setJobParameters(jobParameters);
    }

    /**
     * Constructs a new InitiateJobRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param vaultName The name of the vault.
     * @param jobParameters Provides options for specifying job information.
     */
    public InitiateJobRequest(String accountId, String vaultName, JobParameters jobParameters) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setJobParameters(jobParameters);
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
    public InitiateJobRequest withAccountId(String accountId) {
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
    public InitiateJobRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Provides options for specifying job information.
     *
     * @return Provides options for specifying job information.
     */
    public JobParameters getJobParameters() {
        return jobParameters;
    }
    
    /**
     * Provides options for specifying job information.
     *
     * @param jobParameters Provides options for specifying job information.
     */
    public void setJobParameters(JobParameters jobParameters) {
        this.jobParameters = jobParameters;
    }
    
    /**
     * Provides options for specifying job information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobParameters Provides options for specifying job information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InitiateJobRequest withJobParameters(JobParameters jobParameters) {
        this.jobParameters = jobParameters;
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
        if (getJobParameters() != null) sb.append("JobParameters: " + getJobParameters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getJobParameters() == null) ? 0 : getJobParameters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InitiateJobRequest == false) return false;
        InitiateJobRequest other = (InitiateJobRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getJobParameters() == null ^ this.getJobParameters() == null) return false;
        if (other.getJobParameters() != null && other.getJobParameters().equals(this.getJobParameters()) == false) return false; 
        return true;
    }
    
}
    