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
 * Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the archive parts
 * have been uploaded and Amazon Glacier can now assemble the archive from the uploaded parts. After assembling and
 * saving the archive to the vault, Amazon Glacier returns the URI path of the newly created archive resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteMultipartUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The upload ID of the multipart upload.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the individual
     * parts that you uploaded.
     * </p>
     */
    private String archiveSize;
    /**
     * <p>
     * The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual parts. If
     * the value you specify in the request does not match the SHA256 tree hash of the final assembled archive as
     * computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.
     * </p>
     */
    private String checksum;

    /**
     * Default constructor for CompleteMultipartUploadRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CompleteMultipartUploadRequest() {
    }

    /**
     * Constructs a new CompleteMultipartUploadRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param vaultName
     *        The name of the vault.
     * @param uploadId
     *        The upload ID of the multipart upload.
     * @param archiveSize
     *        The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the
     *        individual parts that you uploaded.
     * @param checksum
     *        The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual
     *        parts. If the value you specify in the request does not match the SHA256 tree hash of the final assembled
     *        archive as computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.
     */
    public CompleteMultipartUploadRequest(String vaultName, String uploadId, String archiveSize, String checksum) {
        setVaultName(vaultName);
        setUploadId(uploadId);
        setArchiveSize(archiveSize);
        setChecksum(checksum);
    }

    /**
     * Constructs a new CompleteMultipartUploadRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @param vaultName
     *        The name of the vault.
     * @param uploadId
     *        The upload ID of the multipart upload.
     * @param archiveSize
     *        The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the
     *        individual parts that you uploaded.
     * @param checksum
     *        The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual
     *        parts. If the value you specify in the request does not match the SHA256 tree hash of the final assembled
     *        archive as computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.
     */
    public CompleteMultipartUploadRequest(String accountId, String vaultName, String uploadId, String archiveSize, String checksum) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setUploadId(uploadId);
        setArchiveSize(archiveSize);
        setChecksum(checksum);
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

    public CompleteMultipartUploadRequest withAccountId(String accountId) {
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

    public CompleteMultipartUploadRequest withVaultName(String vaultName) {
        setVaultName(vaultName);
        return this;
    }

    /**
     * <p>
     * The upload ID of the multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The upload ID of the multipart upload.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The upload ID of the multipart upload.
     * </p>
     * 
     * @return The upload ID of the multipart upload.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The upload ID of the multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The upload ID of the multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMultipartUploadRequest withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the individual
     * parts that you uploaded.
     * </p>
     * 
     * @param archiveSize
     *        The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the
     *        individual parts that you uploaded.
     */

    public void setArchiveSize(String archiveSize) {
        this.archiveSize = archiveSize;
    }

    /**
     * <p>
     * The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the individual
     * parts that you uploaded.
     * </p>
     * 
     * @return The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the
     *         individual parts that you uploaded.
     */

    public String getArchiveSize() {
        return this.archiveSize;
    }

    /**
     * <p>
     * The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the individual
     * parts that you uploaded.
     * </p>
     * 
     * @param archiveSize
     *        The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the
     *        individual parts that you uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMultipartUploadRequest withArchiveSize(String archiveSize) {
        setArchiveSize(archiveSize);
        return this;
    }

    /**
     * <p>
     * The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual parts. If
     * the value you specify in the request does not match the SHA256 tree hash of the final assembled archive as
     * computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.
     * </p>
     * 
     * @param checksum
     *        The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual
     *        parts. If the value you specify in the request does not match the SHA256 tree hash of the final assembled
     *        archive as computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual parts. If
     * the value you specify in the request does not match the SHA256 tree hash of the final assembled archive as
     * computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.
     * </p>
     * 
     * @return The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual
     *         parts. If the value you specify in the request does not match the SHA256 tree hash of the final assembled
     *         archive as computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual parts. If
     * the value you specify in the request does not match the SHA256 tree hash of the final assembled archive as
     * computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.
     * </p>
     * 
     * @param checksum
     *        The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual
     *        parts. If the value you specify in the request does not match the SHA256 tree hash of the final assembled
     *        archive as computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMultipartUploadRequest withChecksum(String checksum) {
        setChecksum(checksum);
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
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getArchiveSize() != null)
            sb.append("ArchiveSize: ").append(getArchiveSize()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteMultipartUploadRequest == false)
            return false;
        CompleteMultipartUploadRequest other = (CompleteMultipartUploadRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getVaultName() == null ^ this.getVaultName() == null)
            return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getArchiveSize() == null ^ this.getArchiveSize() == null)
            return false;
        if (other.getArchiveSize() != null && other.getArchiveSize().equals(this.getArchiveSize()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getArchiveSize() == null) ? 0 : getArchiveSize().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        return hashCode;
    }

    @Override
    public CompleteMultipartUploadRequest clone() {
        return (CompleteMultipartUploadRequest) super.clone();
    }

}
