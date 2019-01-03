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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides options for downloading output of an Amazon Glacier job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobOutputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
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
     * specify the range as <code>bytes=0-1048575</code>. By default, this operation downloads the entire output.
     * </p>
     * <p>
     * If the job output is large, then you can use a range to retrieve a portion of the output. This allows you to
     * download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output you want
     * to download and you decide to download 128 MB chunks of data at a time, which is a total of eight Get Job Output
     * requests. You use the following process to download the job output:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of data was
     * received.
     * </p>
     * </li>
     * <li>
     * <p>
     * Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of the
     * payload on the client and compare it with the checksum you received in the response to ensure you received all
     * the expected data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate byte
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * After downloading all the parts of the job output, you have a list of eight checksum values. Compute the tree
     * hash of these values to find the checksum of the entire output. Using the <a>DescribeJob</a> API, obtain job
     * information of the job that provided you the output. The response includes the checksum of the entire archive
     * stored in Amazon Glacier. You compare this value with the checksum you computed to ensure you have downloaded the
     * entire archive content with no errors.
     * </p>
     * <p/></li>
     * </ol>
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
     *        bytes, specify the range as <code>bytes=0-1048575</code>. By default, this operation downloads the entire
     *        output.</p>
     *        <p>
     *        If the job output is large, then you can use a range to retrieve a portion of the output. This allows you
     *        to download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output
     *        you want to download and you decide to download 128 MB chunks of data at a time, which is a total of eight
     *        Get Job Output requests. You use the following process to download the job output:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of data
     *        was received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of
     *        the payload on the client and compare it with the checksum you received in the response to ensure you
     *        received all the expected data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate
     *        byte range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        After downloading all the parts of the job output, you have a list of eight checksum values. Compute the
     *        tree hash of these values to find the checksum of the entire output. Using the <a>DescribeJob</a> API,
     *        obtain job information of the job that provided you the output. The response includes the checksum of the
     *        entire archive stored in Amazon Glacier. You compare this value with the checksum you computed to ensure
     *        you have downloaded the entire archive content with no errors.
     *        </p>
     *        <p/></li>
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
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @param vaultName
     *        The name of the vault.
     * @param jobId
     *        The job ID whose data is downloaded.
     * @param range
     *        The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576
     *        bytes, specify the range as <code>bytes=0-1048575</code>. By default, this operation downloads the entire
     *        output.</p>
     *        <p>
     *        If the job output is large, then you can use a range to retrieve a portion of the output. This allows you
     *        to download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output
     *        you want to download and you decide to download 128 MB chunks of data at a time, which is a total of eight
     *        Get Job Output requests. You use the following process to download the job output:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of data
     *        was received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of
     *        the payload on the client and compare it with the checksum you received in the response to ensure you
     *        received all the expected data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate
     *        byte range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        After downloading all the parts of the job output, you have a list of eight checksum values. Compute the
     *        tree hash of these values to find the checksum of the entire output. Using the <a>DescribeJob</a> API,
     *        obtain job information of the job that provided you the output. The response includes the checksum of the
     *        entire archive stored in Amazon Glacier. You compare this value with the checksum you computed to ensure
     *        you have downloaded the entire archive content with no errors.
     *        </p>
     *        <p/></li>
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
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @return The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *         specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *         uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *         ID, do not include any hyphens ('-') in the ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
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
     * specify the range as <code>bytes=0-1048575</code>. By default, this operation downloads the entire output.
     * </p>
     * <p>
     * If the job output is large, then you can use a range to retrieve a portion of the output. This allows you to
     * download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output you want
     * to download and you decide to download 128 MB chunks of data at a time, which is a total of eight Get Job Output
     * requests. You use the following process to download the job output:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of data was
     * received.
     * </p>
     * </li>
     * <li>
     * <p>
     * Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of the
     * payload on the client and compare it with the checksum you received in the response to ensure you received all
     * the expected data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate byte
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * After downloading all the parts of the job output, you have a list of eight checksum values. Compute the tree
     * hash of these values to find the checksum of the entire output. Using the <a>DescribeJob</a> API, obtain job
     * information of the job that provided you the output. The response includes the checksum of the entire archive
     * stored in Amazon Glacier. You compare this value with the checksum you computed to ensure you have downloaded the
     * entire archive content with no errors.
     * </p>
     * <p/></li>
     * </ol>
     * 
     * @param range
     *        The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576
     *        bytes, specify the range as <code>bytes=0-1048575</code>. By default, this operation downloads the entire
     *        output.</p>
     *        <p>
     *        If the job output is large, then you can use a range to retrieve a portion of the output. This allows you
     *        to download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output
     *        you want to download and you decide to download 128 MB chunks of data at a time, which is a total of eight
     *        Get Job Output requests. You use the following process to download the job output:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of data
     *        was received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of
     *        the payload on the client and compare it with the checksum you received in the response to ensure you
     *        received all the expected data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate
     *        byte range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        After downloading all the parts of the job output, you have a list of eight checksum values. Compute the
     *        tree hash of these values to find the checksum of the entire output. Using the <a>DescribeJob</a> API,
     *        obtain job information of the job that provided you the output. The response includes the checksum of the
     *        entire archive stored in Amazon Glacier. You compare this value with the checksum you computed to ensure
     *        you have downloaded the entire archive content with no errors.
     *        </p>
     *        <p/></li>
     */

    public void setRange(String range) {
        this.range = range;
    }

    /**
     * <p>
     * The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576 bytes,
     * specify the range as <code>bytes=0-1048575</code>. By default, this operation downloads the entire output.
     * </p>
     * <p>
     * If the job output is large, then you can use a range to retrieve a portion of the output. This allows you to
     * download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output you want
     * to download and you decide to download 128 MB chunks of data at a time, which is a total of eight Get Job Output
     * requests. You use the following process to download the job output:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of data was
     * received.
     * </p>
     * </li>
     * <li>
     * <p>
     * Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of the
     * payload on the client and compare it with the checksum you received in the response to ensure you received all
     * the expected data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate byte
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * After downloading all the parts of the job output, you have a list of eight checksum values. Compute the tree
     * hash of these values to find the checksum of the entire output. Using the <a>DescribeJob</a> API, obtain job
     * information of the job that provided you the output. The response includes the checksum of the entire archive
     * stored in Amazon Glacier. You compare this value with the checksum you computed to ensure you have downloaded the
     * entire archive content with no errors.
     * </p>
     * <p/></li>
     * </ol>
     * 
     * @return The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576
     *         bytes, specify the range as <code>bytes=0-1048575</code>. By default, this operation downloads the entire
     *         output.</p>
     *         <p>
     *         If the job output is large, then you can use a range to retrieve a portion of the output. This allows you
     *         to download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job
     *         output you want to download and you decide to download 128 MB chunks of data at a time, which is a total
     *         of eight Get Job Output requests. You use the following process to download the job output:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of
     *         data was received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of
     *         the payload on the client and compare it with the checksum you received in the response to ensure you
     *         received all the expected data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate
     *         byte range.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         After downloading all the parts of the job output, you have a list of eight checksum values. Compute the
     *         tree hash of these values to find the checksum of the entire output. Using the <a>DescribeJob</a> API,
     *         obtain job information of the job that provided you the output. The response includes the checksum of the
     *         entire archive stored in Amazon Glacier. You compare this value with the checksum you computed to ensure
     *         you have downloaded the entire archive content with no errors.
     *         </p>
     *         <p/></li>
     */

    public String getRange() {
        return this.range;
    }

    /**
     * <p>
     * The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576 bytes,
     * specify the range as <code>bytes=0-1048575</code>. By default, this operation downloads the entire output.
     * </p>
     * <p>
     * If the job output is large, then you can use a range to retrieve a portion of the output. This allows you to
     * download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output you want
     * to download and you decide to download 128 MB chunks of data at a time, which is a total of eight Get Job Output
     * requests. You use the following process to download the job output:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of data was
     * received.
     * </p>
     * </li>
     * <li>
     * <p>
     * Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of the
     * payload on the client and compare it with the checksum you received in the response to ensure you received all
     * the expected data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate byte
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * After downloading all the parts of the job output, you have a list of eight checksum values. Compute the tree
     * hash of these values to find the checksum of the entire output. Using the <a>DescribeJob</a> API, obtain job
     * information of the job that provided you the output. The response includes the checksum of the entire archive
     * stored in Amazon Glacier. You compare this value with the checksum you computed to ensure you have downloaded the
     * entire archive content with no errors.
     * </p>
     * <p/></li>
     * </ol>
     * 
     * @param range
     *        The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576
     *        bytes, specify the range as <code>bytes=0-1048575</code>. By default, this operation downloads the entire
     *        output.</p>
     *        <p>
     *        If the job output is large, then you can use a range to retrieve a portion of the output. This allows you
     *        to download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output
     *        you want to download and you decide to download 128 MB chunks of data at a time, which is a total of eight
     *        Get Job Output requests. You use the following process to download the job output:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of data
     *        was received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of
     *        the payload on the client and compare it with the checksum you received in the response to ensure you
     *        received all the expected data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate
     *        byte range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        After downloading all the parts of the job output, you have a list of eight checksum values. Compute the
     *        tree hash of these values to find the checksum of the entire output. Using the <a>DescribeJob</a> API,
     *        obtain job information of the job that provided you the output. The response includes the checksum of the
     *        entire archive stored in Amazon Glacier. You compare this value with the checksum you computed to ensure
     *        you have downloaded the entire archive content with no errors.
     *        </p>
     *        <p/></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputRequest withRange(String range) {
        setRange(range);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getVaultName() != null)
            sb.append("VaultName: ").append(getVaultName()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getRange() != null)
            sb.append("Range: ").append(getRange());
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
