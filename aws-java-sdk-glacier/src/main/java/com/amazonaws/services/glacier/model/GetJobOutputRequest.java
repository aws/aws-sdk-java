/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides options for downloading output of an Amazon Glacier job.
 * </p>
 */
public class GetJobOutputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single apos<code>-</code>apos (hyphen), in which case Amazon Glacier uses the
     * AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include
     * any hyphens (apos-apos) in the ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the vault.
     * </p>
     */
    private String vaultName;
    /**
     * <p>
     * The job ID whose data is downloaded.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576 bytes,
     * specify "Range: bytes=0-1048575". By default, this operation downloads the entire output.
     * </p>
     */
    private String range;

    /**
     * Default constructor for GetJobOutputRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public GetJobOutputRequest() {
    }

    /**
     * Constructs a new GetJobOutputRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName
     *        The name of the vault.
     * @param jobId
     *        The job ID whose data is downloaded.
     * @param range
     *        The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576
     *        bytes, specify "Range: bytes=0-1048575". By default, this operation downloads the entire output.
     */
    public GetJobOutputRequest(String vaultName, String jobId, String range) {
        setVaultName(vaultName);
        setJobId(jobId);
        setRange(range);
    }

    /**
     * Constructs a new GetJobOutputRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single apos<code>-</code>apos (hyphen), in which case Amazon
     *        Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an
     *        account ID, do not include any hyphens (apos-apos) in the ID.
     * @param vaultName
     *        The name of the vault.
     * @param jobId
     *        The job ID whose data is downloaded.
     * @param range
     *        The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576
     *        bytes, specify "Range: bytes=0-1048575". By default, this operation downloads the entire output.
     */
    public GetJobOutputRequest(String accountId, String vaultName, String jobId, String range) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setJobId(jobId);
        setRange(range);
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single apos<code>-</code>apos (hyphen), in which case Amazon Glacier uses the
     * AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include
     * any hyphens (apos-apos) in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single apos<code>-</code>apos (hyphen), in which case Amazon
     *        Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an
     *        account ID, do not include any hyphens (apos-apos) in the ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single apos<code>-</code>apos (hyphen), in which case Amazon Glacier uses the
     * AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include
     * any hyphens (apos-apos) in the ID.
     * </p>
     * 
     * @return The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *         specify an AWS account ID or optionally a single apos<code>-</code>apos (hyphen), in which case Amazon
     *         Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an
     *         account ID, do not include any hyphens (apos-apos) in the ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single apos<code>-</code>apos (hyphen), in which case Amazon Glacier uses the
     * AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include
     * any hyphens (apos-apos) in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single apos<code>-</code>apos (hyphen), in which case Amazon
     *        Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an
     *        account ID, do not include any hyphens (apos-apos) in the ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @param vaultName
     *        The name of the vault.
     */

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @return The name of the vault.
     */

    public String getVaultName() {
        return this.vaultName;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @param vaultName
     *        The name of the vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputRequest withVaultName(String vaultName) {
        setVaultName(vaultName);
        return this;
    }

    /**
     * <p>
     * The job ID whose data is downloaded.
     * </p>
     * 
     * @param jobId
     *        The job ID whose data is downloaded.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID whose data is downloaded.
     * </p>
     * 
     * @return The job ID whose data is downloaded.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID whose data is downloaded.
     * </p>
     * 
     * @param jobId
     *        The job ID whose data is downloaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576 bytes,
     * specify "Range: bytes=0-1048575". By default, this operation downloads the entire output.
     * </p>
     * 
     * @param range
     *        The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576
     *        bytes, specify "Range: bytes=0-1048575". By default, this operation downloads the entire output.
     */

    public void setRange(String range) {
        this.range = range;
    }

    /**
     * <p>
     * The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576 bytes,
     * specify "Range: bytes=0-1048575". By default, this operation downloads the entire output.
     * </p>
     * 
     * @return The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576
     *         bytes, specify "Range: bytes=0-1048575". By default, this operation downloads the entire output.
     */

    public String getRange() {
        return this.range;
    }

    /**
     * <p>
     * The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576 bytes,
     * specify "Range: bytes=0-1048575". By default, this operation downloads the entire output.
     * </p>
     * 
     * @param range
     *        The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576
     *        bytes, specify "Range: bytes=0-1048575". By default, this operation downloads the entire output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputRequest withRange(String range) {
        setRange(range);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getVaultName() != null)
            sb.append("VaultName: " + getVaultName() + ",");
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getRange() != null)
            sb.append("Range: " + getRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobOutputRequest == false)
            return false;
        GetJobOutputRequest other = (GetJobOutputRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getVaultName() == null ^ this.getVaultName() == null)
            return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        return true;
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
    public GetJobOutputRequest clone() {
        return (GetJobOutputRequest) super.clone();
    }
}
