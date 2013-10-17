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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#getJobOutput(GetJobOutputRequest) GetJobOutput operation}.
 * <p>
 * This operation downloads the output of the job you initiated using InitiateJob. Depending on the job type you specified when you initiated the job,
 * the output will be either the content of an archive or a vault inventory.
 * </p>
 * <p>
 * A job ID will not expire for at least 24 hours after Amazon Glacier completes the job. That is, you can download the job output within the 24 hours
 * period after Amazon Glacier completes the job.
 * </p>
 * <p>
 * If the job output is large, then you can use the <code>Range</code> request header to retrieve a portion of the output. This allows you to download
 * the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output you want to download and you decide to download 128 MB
 * chunks of data at a time, which is a total of eight Get Job Output requests. You use the following process to download the job output:
 * </p>
 * <ol> <li> <p>
 * Download a 128 MB chunk of output by specifying the appropriate byte range using the <code>Range</code> header.
 * </p>
 * </li>
 * <li> <p>
 * Along with the data, the response includes a checksum of the payload. You compute the checksum of the payload on the client and compare it with the
 * checksum you received in the response to ensure you received all the expected data.
 * </p>
 * </li>
 * <li> <p>
 * Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate byte range.
 * </p>
 * </li>
 * <li> <p>
 * After downloading all the parts of the job output, you have a list of eight checksum values. Compute the tree hash of these values to find the
 * checksum of the entire output. Using the Describe Job API, obtain job information of the job that provided you the output. The response includes the
 * checksum of the entire archive stored in Amazon Glacier. You compare this value with the checksum you computed to ensure you have downloaded the
 * entire archive content with no errors.
 * </p>
 * </li>
 * </ol> <p>
 * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any
 * permissions by default. You must grant them explicit permission to perform specific actions. For more information, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html"> Access Control Using AWS Identity and Access
 * Management (IAM) </a> .
 * </p>
 * <p>
 * For conceptual information and the underlying REST API, go to <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/vault-inventory.html"> Downloading a Vault Inventory </a> , <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/downloading-an-archive.html"> Downloading an Archive </a> , and <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-job-output-get.html"> Get Job Output </a>
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#getJobOutput(GetJobOutputRequest)
 */
public class GetJobOutputRequest extends AmazonWebServiceRequest implements Serializable {

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
     * The job ID whose data is downloaded.
     */
    private String jobId;

    /**
     * The range of bytes to retrieve from the output. For example, if you
     * want to download the first 1,048,576 bytes, specify "Range:
     * bytes=0-1048575". By default, this operation downloads the entire
     * output.
     */
    private String range;

    /**
     * Default constructor for a new GetJobOutputRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetJobOutputRequest() {}
    
    /**
     * Constructs a new GetJobOutputRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     * @param jobId The job ID whose data is downloaded.
     * @param range The range of bytes to retrieve from the output. For
     * example, if you want to download the first 1,048,576 bytes, specify
     * "Range: bytes=0-1048575". By default, this operation downloads the
     * entire output.
     */
    public GetJobOutputRequest(String vaultName, String jobId, String range) {
        setVaultName(vaultName);
        setJobId(jobId);
        setRange(range);
    }

    /**
     * Constructs a new GetJobOutputRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param vaultName The name of the vault.
     * @param jobId The job ID whose data is downloaded.
     * @param range The range of bytes to retrieve from the output. For
     * example, if you want to download the first 1,048,576 bytes, specify
     * "Range: bytes=0-1048575". By default, this operation downloads the
     * entire output.
     */
    public GetJobOutputRequest(String accountId, String vaultName, String jobId, String range) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setJobId(jobId);
        setRange(range);
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
    public GetJobOutputRequest withAccountId(String accountId) {
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
    public GetJobOutputRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * The job ID whose data is downloaded.
     *
     * @return The job ID whose data is downloaded.
     */
    public String getJobId() {
        return jobId;
    }
    
    /**
     * The job ID whose data is downloaded.
     *
     * @param jobId The job ID whose data is downloaded.
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    
    /**
     * The job ID whose data is downloaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobId The job ID whose data is downloaded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetJobOutputRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * The range of bytes to retrieve from the output. For example, if you
     * want to download the first 1,048,576 bytes, specify "Range:
     * bytes=0-1048575". By default, this operation downloads the entire
     * output.
     *
     * @return The range of bytes to retrieve from the output. For example, if you
     *         want to download the first 1,048,576 bytes, specify "Range:
     *         bytes=0-1048575". By default, this operation downloads the entire
     *         output.
     */
    public String getRange() {
        return range;
    }
    
    /**
     * The range of bytes to retrieve from the output. For example, if you
     * want to download the first 1,048,576 bytes, specify "Range:
     * bytes=0-1048575". By default, this operation downloads the entire
     * output.
     *
     * @param range The range of bytes to retrieve from the output. For example, if you
     *         want to download the first 1,048,576 bytes, specify "Range:
     *         bytes=0-1048575". By default, this operation downloads the entire
     *         output.
     */
    public void setRange(String range) {
        this.range = range;
    }
    
    /**
     * The range of bytes to retrieve from the output. For example, if you
     * want to download the first 1,048,576 bytes, specify "Range:
     * bytes=0-1048575". By default, this operation downloads the entire
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param range The range of bytes to retrieve from the output. For example, if you
     *         want to download the first 1,048,576 bytes, specify "Range:
     *         bytes=0-1048575". By default, this operation downloads the entire
     *         output.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetJobOutputRequest withRange(String range) {
        this.range = range;
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
        if (getJobId() != null) sb.append("JobId: " + getJobId() + ",");
        if (getRange() != null) sb.append("Range: " + getRange() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode()); 
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetJobOutputRequest == false) return false;
        GetJobOutputRequest other = (GetJobOutputRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false; 
        if (other.getRange() == null ^ this.getRange() == null) return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false) return false; 
        return true;
    }
    
}
    