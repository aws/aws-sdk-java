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
 * Provides options for initiating a multipart upload to an Amazon Glacier vault.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitiateMultipartUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The archive description that you are uploading in parts.
     * </p>
     * <p>
     * The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152 (2
     * MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB
     * (4096 MB).
     * </p>
     */
    private String archiveDescription;
    /**
     * <p>
     * The size of each part except the last, in bytes. The last part can be smaller than this part size.
     * </p>
     */
    private String partSize;

    /**
     * Default constructor for InitiateMultipartUploadRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public InitiateMultipartUploadRequest() {
    }

    /**
     * Constructs a new InitiateMultipartUploadRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param vaultName
     *        The name of the vault.
     * @param archiveDescription
     *        The archive description that you are uploading in parts.</p>
     *        <p>
     *        The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152
     *        (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the
     *        maximum is 4 GB (4096 MB).
     * @param partSize
     *        The size of each part except the last, in bytes. The last part can be smaller than this part size.
     */
    public InitiateMultipartUploadRequest(String vaultName, String archiveDescription, String partSize) {
        setVaultName(vaultName);
        setArchiveDescription(archiveDescription);
        setPartSize(partSize);
    }

    /**
     * Constructs a new InitiateMultipartUploadRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @param vaultName
     *        The name of the vault.
     * @param archiveDescription
     *        The archive description that you are uploading in parts.</p>
     *        <p>
     *        The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152
     *        (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the
     *        maximum is 4 GB (4096 MB).
     * @param partSize
     *        The size of each part except the last, in bytes. The last part can be smaller than this part size.
     */
    public InitiateMultipartUploadRequest(String accountId, String vaultName, String archiveDescription, String partSize) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setArchiveDescription(archiveDescription);
        setPartSize(partSize);
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

    public InitiateMultipartUploadRequest withAccountId(String accountId) {
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

    public InitiateMultipartUploadRequest withVaultName(String vaultName) {
        setVaultName(vaultName);
        return this;
    }

    /**
     * <p>
     * The archive description that you are uploading in parts.
     * </p>
     * <p>
     * The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152 (2
     * MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB
     * (4096 MB).
     * </p>
     * 
     * @param archiveDescription
     *        The archive description that you are uploading in parts.</p>
     *        <p>
     *        The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152
     *        (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the
     *        maximum is 4 GB (4096 MB).
     */

    public void setArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
    }

    /**
     * <p>
     * The archive description that you are uploading in parts.
     * </p>
     * <p>
     * The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152 (2
     * MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB
     * (4096 MB).
     * </p>
     * 
     * @return The archive description that you are uploading in parts.</p>
     *         <p>
     *         The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB),
     *         2097152 (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and
     *         the maximum is 4 GB (4096 MB).
     */

    public String getArchiveDescription() {
        return this.archiveDescription;
    }

    /**
     * <p>
     * The archive description that you are uploading in parts.
     * </p>
     * <p>
     * The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152 (2
     * MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB
     * (4096 MB).
     * </p>
     * 
     * @param archiveDescription
     *        The archive description that you are uploading in parts.</p>
     *        <p>
     *        The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152
     *        (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the
     *        maximum is 4 GB (4096 MB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateMultipartUploadRequest withArchiveDescription(String archiveDescription) {
        setArchiveDescription(archiveDescription);
        return this;
    }

    /**
     * <p>
     * The size of each part except the last, in bytes. The last part can be smaller than this part size.
     * </p>
     * 
     * @param partSize
     *        The size of each part except the last, in bytes. The last part can be smaller than this part size.
     */

    public void setPartSize(String partSize) {
        this.partSize = partSize;
    }

    /**
     * <p>
     * The size of each part except the last, in bytes. The last part can be smaller than this part size.
     * </p>
     * 
     * @return The size of each part except the last, in bytes. The last part can be smaller than this part size.
     */

    public String getPartSize() {
        return this.partSize;
    }

    /**
     * <p>
     * The size of each part except the last, in bytes. The last part can be smaller than this part size.
     * </p>
     * 
     * @param partSize
     *        The size of each part except the last, in bytes. The last part can be smaller than this part size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateMultipartUploadRequest withPartSize(String partSize) {
        setPartSize(partSize);
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
        if (getArchiveDescription() != null)
            sb.append("ArchiveDescription: ").append(getArchiveDescription()).append(",");
        if (getPartSize() != null)
            sb.append("PartSize: ").append(getPartSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateMultipartUploadRequest == false)
            return false;
        InitiateMultipartUploadRequest other = (InitiateMultipartUploadRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getVaultName() == null ^ this.getVaultName() == null)
            return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false)
            return false;
        if (other.getArchiveDescription() == null ^ this.getArchiveDescription() == null)
            return false;
        if (other.getArchiveDescription() != null && other.getArchiveDescription().equals(this.getArchiveDescription()) == false)
            return false;
        if (other.getPartSize() == null ^ this.getPartSize() == null)
            return false;
        if (other.getPartSize() != null && other.getPartSize().equals(this.getPartSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode());
        hashCode = prime * hashCode + ((getArchiveDescription() == null) ? 0 : getArchiveDescription().hashCode());
        hashCode = prime * hashCode + ((getPartSize() == null) ? 0 : getPartSize().hashCode());
        return hashCode;
    }

    @Override
    public InitiateMultipartUploadRequest clone() {
        return (InitiateMultipartUploadRequest) super.clone();
    }

}
