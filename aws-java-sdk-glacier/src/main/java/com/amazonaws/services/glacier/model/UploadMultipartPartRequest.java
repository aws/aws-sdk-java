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
 * Provides options to upload a part of an archive in a multipart upload operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadMultipartPartRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The SHA256 tree hash of the data being uploaded.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier uses
     * this information to assemble the archive in the proper sequence. The format of this header follows RFC 2616. An
     * example header is Content-Range:bytes 0-4194303/*.
     * </p>
     */
    private String range;
    /**
     * <p>
     * The data to upload.
     * </p>
     */
    private java.io.InputStream body;

    /**
     * Default constructor for UploadMultipartPartRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public UploadMultipartPartRequest() {
    }

    /**
     * Constructs a new UploadMultipartPartRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param vaultName
     *        The name of the vault.
     * @param uploadId
     *        The upload ID of the multipart upload.
     * @param checksum
     *        The SHA256 tree hash of the data being uploaded.
     * @param range
     *        Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier
     *        uses this information to assemble the archive in the proper sequence. The format of this header follows
     *        RFC 2616. An example header is Content-Range:bytes 0-4194303/*.
     * @param body
     *        The data to upload.
     */
    public UploadMultipartPartRequest(String vaultName, String uploadId, String checksum, String range, java.io.InputStream body) {
        setVaultName(vaultName);
        setUploadId(uploadId);
        setChecksum(checksum);
        setRange(range);
        setBody(body);
    }

    /**
     * Constructs a new UploadMultipartPartRequest object. Callers should use the setter or fluent setter (with...)
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
     * @param checksum
     *        The SHA256 tree hash of the data being uploaded.
     * @param range
     *        Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier
     *        uses this information to assemble the archive in the proper sequence. The format of this header follows
     *        RFC 2616. An example header is Content-Range:bytes 0-4194303/*.
     * @param body
     *        The data to upload.
     */
    public UploadMultipartPartRequest(String accountId, String vaultName, String uploadId, String checksum, String range, java.io.InputStream body) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setUploadId(uploadId);
        setChecksum(checksum);
        setRange(range);
        setBody(body);
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

    public UploadMultipartPartRequest withAccountId(String accountId) {
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

    public UploadMultipartPartRequest withVaultName(String vaultName) {
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

    public UploadMultipartPartRequest withUploadId(String uploadId) {
        setUploadId(uploadId);
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

    public UploadMultipartPartRequest withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier uses
     * this information to assemble the archive in the proper sequence. The format of this header follows RFC 2616. An
     * example header is Content-Range:bytes 0-4194303/*.
     * </p>
     * 
     * @param range
     *        Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier
     *        uses this information to assemble the archive in the proper sequence. The format of this header follows
     *        RFC 2616. An example header is Content-Range:bytes 0-4194303/*.
     */

    public void setRange(String range) {
        this.range = range;
    }

    /**
     * <p>
     * Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier uses
     * this information to assemble the archive in the proper sequence. The format of this header follows RFC 2616. An
     * example header is Content-Range:bytes 0-4194303/*.
     * </p>
     * 
     * @return Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier
     *         uses this information to assemble the archive in the proper sequence. The format of this header follows
     *         RFC 2616. An example header is Content-Range:bytes 0-4194303/*.
     */

    public String getRange() {
        return this.range;
    }

    /**
     * <p>
     * Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier uses
     * this information to assemble the archive in the proper sequence. The format of this header follows RFC 2616. An
     * example header is Content-Range:bytes 0-4194303/*.
     * </p>
     * 
     * @param range
     *        Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier
     *        uses this information to assemble the archive in the proper sequence. The format of this header follows
     *        RFC 2616. An example header is Content-Range:bytes 0-4194303/*.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadMultipartPartRequest withRange(String range) {
        setRange(range);
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

    public UploadMultipartPartRequest withBody(java.io.InputStream body) {
        setBody(body);
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
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getRange() != null)
            sb.append("Range: ").append(getRange()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadMultipartPartRequest == false)
            return false;
        UploadMultipartPartRequest other = (UploadMultipartPartRequest) obj;
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
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
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
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public UploadMultipartPartRequest clone() {
        return (UploadMultipartPartRequest) super.clone();
    }

}
