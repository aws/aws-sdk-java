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
 * Provides options to add an archive to a vault.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadArchiveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the vault.
     * </p>
     */
    private String vaultName;
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
     * The optional description of the archive you are uploading.
     * </p>
     */
    private String archiveDescription;
    /**
     * <p>
     * The SHA256 tree hash of the data being uploaded.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The data to upload.
     * </p>
     */
    private java.io.InputStream body;
    /** The content length of the archive to upload. */
    private Long contentLength;

    /**
     * Default constructor for UploadArchiveRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public UploadArchiveRequest() {
    }

    /**
     * Constructs a new UploadArchiveRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName
     *        The name of the vault.
     * @param archiveDescription
     *        The optional description of the archive you are uploading.
     * @param checksum
     *        The SHA256 tree hash of the data being uploaded.
     * @param body
     *        The data to upload.
     */
    public UploadArchiveRequest(String vaultName, String archiveDescription, String checksum, java.io.InputStream body) {
        setVaultName(vaultName);
        setArchiveDescription(archiveDescription);
        setChecksum(checksum);
        setBody(body);
    }

    /**
     * Constructs a new UploadArchiveRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName
     *        The name of the vault.
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @param archiveDescription
     *        The optional description of the archive you are uploading.
     * @param checksum
     *        The SHA256 tree hash of the data being uploaded.
     * @param body
     *        The data to upload.
     */
    public UploadArchiveRequest(String vaultName, String accountId, String archiveDescription, String checksum, java.io.InputStream body) {
        setVaultName(vaultName);
        setAccountId(accountId);
        setArchiveDescription(archiveDescription);
        setChecksum(checksum);
        setBody(body);
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

    public UploadArchiveRequest withVaultName(String vaultName) {
        setVaultName(vaultName);
        return this;
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

    public UploadArchiveRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The optional description of the archive you are uploading.
     * </p>
     * 
     * @param archiveDescription
     *        The optional description of the archive you are uploading.
     */

    public void setArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
    }

    /**
     * <p>
     * The optional description of the archive you are uploading.
     * </p>
     * 
     * @return The optional description of the archive you are uploading.
     */

    public String getArchiveDescription() {
        return this.archiveDescription;
    }

    /**
     * <p>
     * The optional description of the archive you are uploading.
     * </p>
     * 
     * @param archiveDescription
     *        The optional description of the archive you are uploading.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadArchiveRequest withArchiveDescription(String archiveDescription) {
        setArchiveDescription(archiveDescription);
        return this;
    }

    /**
     * <p>
     * The SHA256 tree hash of the data being uploaded.
     * </p>
     * 
     * @param checksum
     *        The SHA256 tree hash of the data being uploaded.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The SHA256 tree hash of the data being uploaded.
     * </p>
     * 
     * @return The SHA256 tree hash of the data being uploaded.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * The SHA256 tree hash of the data being uploaded.
     * </p>
     * 
     * @param checksum
     *        The SHA256 tree hash of the data being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadArchiveRequest withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The data to upload.
     * </p>
     * 
     * @param body
     *        The data to upload.
     */

    public void setBody(java.io.InputStream body) {
        this.body = body;
    }

    /**
     * <p>
     * The data to upload.
     * </p>
     * 
     * @return The data to upload.
     */

    public java.io.InputStream getBody() {
        return this.body;
    }

    /**
     * <p>
     * The data to upload.
     * </p>
     * 
     * @param body
     *        The data to upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadArchiveRequest withBody(java.io.InputStream body) {
        setBody(body);
        return this;
    }

    /**
     * The content length of the archive to upload.
     * 
     * @param contentLength
     *        The content length of the archive to upload.
     */

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * The content length of the archive to upload.
     * 
     * @return The content length of the archive to upload.
     */

    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * The content length of the archive to upload.
     * 
     * @param contentLength
     *        The content length of the archive to upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadArchiveRequest withContentLength(Long contentLength) {
        setContentLength(contentLength);
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
        if (getVaultName() != null)
            sb.append("VaultName: ").append(getVaultName()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getArchiveDescription() != null)
            sb.append("ArchiveDescription: ").append(getArchiveDescription()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getContentLength() != null)
            sb.append("ContentLength: ").append(getContentLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadArchiveRequest == false)
            return false;
        UploadArchiveRequest other = (UploadArchiveRequest) obj;
        if (other.getVaultName() == null ^ this.getVaultName() == null)
            return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArchiveDescription() == null ^ this.getArchiveDescription() == null)
            return false;
        if (other.getArchiveDescription() != null && other.getArchiveDescription().equals(this.getArchiveDescription()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentLength() == null ^ this.getContentLength() == null)
            return false;
        if (other.getContentLength() != null && other.getContentLength().equals(this.getContentLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArchiveDescription() == null) ? 0 : getArchiveDescription().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        return hashCode;
    }

    @Override
    public UploadArchiveRequest clone() {
        return (UploadArchiveRequest) super.clone();
    }

}
