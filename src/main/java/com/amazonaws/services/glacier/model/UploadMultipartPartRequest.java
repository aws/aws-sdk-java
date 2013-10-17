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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#uploadMultipartPart(UploadMultipartPartRequest) UploadMultipartPart operation}.
 * <p>
 * This operation uploads a part of an archive. You can upload archive parts in any order. You can also upload them in parallel. You can upload up to
 * 10,000 parts for a multipart upload.
 * </p>
 * <p>
 * Amazon Glacier rejects your upload part request if any of the following conditions is true:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <b>SHA256 tree hash does not match</b> To ensure that part data is not corrupted in transmission, you compute a SHA256 tree hash of the part and
 * include it in your request. Upon receiving the part data, Amazon Glacier also computes a SHA256 tree hash. If these hash values don't match, the
 * operation fails. For information about computing a SHA256 tree hash, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/checksum-calculations.html"> Computing Checksums </a> .
 * </p>
 * </li>
 * <li> <p>
 * <b>Part size does not match</b> The size of each part except the last must match the size specified in the corresponding InitiateMultipartUpload
 * request. The size of the last part must be the same size as, or smaller than, the specified size.
 * </p>
 * <p>
 * <b>NOTE:</b> If you upload a part whose size is smaller than the part size you specified in your initiate multipart upload request and that part is
 * not the last part, then the upload part request will succeed. However, the subsequent Complete Multipart Upload request will fail.
 * </p>
 * </li>
 * <li> <b>Range does not align</b> The byte range value in the request does not align with the part size specified in the corresponding initiate
 * request. For example, if you specify a part size of 4194304 bytes (4 MB), then 0 to 4194303 bytes (4 MB - 1) and 4194304 (4 MB) to 8388607 (8 MB - 1)
 * are valid part ranges. However, if you set a range value of 2 MB to 6 MB, the range does not align with the part size and the upload will fail. </li>
 * 
 * </ul>
 * <p>
 * This operation is idempotent. If you upload the same part multiple times, the data included in the most recent request overwrites the previously
 * uploaded data.
 * </p>
 * <p>
 * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any
 * permissions by default. You must grant them explicit permission to perform specific actions. For more information, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html"> Access Control Using AWS Identity and Access
 * Management (IAM) </a> .
 * </p>
 * <p>
 * For conceptual information and underlying REST API, go to <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/uploading-archive-mpu.html"> Uploading Large Archives in Parts (Multipart Upload)
 * </a> and <a href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-upload-part.html"> Upload Part </a> in the <i>Amazon Glacier
 * Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#uploadMultipartPart(UploadMultipartPartRequest)
 */
public class UploadMultipartPartRequest extends AmazonWebServiceRequest implements Serializable {

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
     * The upload ID of the multipart upload.
     */
    private String uploadId;

    /**
     * The SHA256 tree hash of the data being uploaded.
     */
    private String checksum;

    /**
     * Identifies the range of bytes in the assembled archive that will be
     * uploaded in this part. Amazon Glacier uses this information to
     * assemble the archive in the proper sequence. The format of this header
     * follows RFC 2616. An example header is Content-Range:bytes
     * 0-4194303/*.
     */
    private String range;

    /**
     * The data to upload.
     */
    private java.io.InputStream body;

    /**
     * Default constructor for a new UploadMultipartPartRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UploadMultipartPartRequest() {}
    
    /**
     * Constructs a new UploadMultipartPartRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     * @param uploadId The upload ID of the multipart upload.
     * @param checksum The SHA256 tree hash of the data being uploaded.
     * @param range Identifies the range of bytes in the assembled archive
     * that will be uploaded in this part. Amazon Glacier uses this
     * information to assemble the archive in the proper sequence. The format
     * of this header follows RFC 2616. An example header is
     * Content-Range:bytes 0-4194303/*.
     * @param body The data to upload.
     */
    public UploadMultipartPartRequest(String vaultName, String uploadId, String checksum, String range, java.io.InputStream body) {
        setVaultName(vaultName);
        setUploadId(uploadId);
        setChecksum(checksum);
        setRange(range);
        setBody(body);
    }

    /**
     * Constructs a new UploadMultipartPartRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param vaultName The name of the vault.
     * @param uploadId The upload ID of the multipart upload.
     * @param checksum The SHA256 tree hash of the data being uploaded.
     * @param range Identifies the range of bytes in the assembled archive
     * that will be uploaded in this part. Amazon Glacier uses this
     * information to assemble the archive in the proper sequence. The format
     * of this header follows RFC 2616. An example header is
     * Content-Range:bytes 0-4194303/*.
     * @param body The data to upload.
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
    public UploadMultipartPartRequest withAccountId(String accountId) {
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
    public UploadMultipartPartRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * The upload ID of the multipart upload.
     *
     * @return The upload ID of the multipart upload.
     */
    public String getUploadId() {
        return uploadId;
    }
    
    /**
     * The upload ID of the multipart upload.
     *
     * @param uploadId The upload ID of the multipart upload.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }
    
    /**
     * The upload ID of the multipart upload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadId The upload ID of the multipart upload.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadMultipartPartRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * The SHA256 tree hash of the data being uploaded.
     *
     * @return The SHA256 tree hash of the data being uploaded.
     */
    public String getChecksum() {
        return checksum;
    }
    
    /**
     * The SHA256 tree hash of the data being uploaded.
     *
     * @param checksum The SHA256 tree hash of the data being uploaded.
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
    
    /**
     * The SHA256 tree hash of the data being uploaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checksum The SHA256 tree hash of the data being uploaded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadMultipartPartRequest withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * Identifies the range of bytes in the assembled archive that will be
     * uploaded in this part. Amazon Glacier uses this information to
     * assemble the archive in the proper sequence. The format of this header
     * follows RFC 2616. An example header is Content-Range:bytes
     * 0-4194303/*.
     *
     * @return Identifies the range of bytes in the assembled archive that will be
     *         uploaded in this part. Amazon Glacier uses this information to
     *         assemble the archive in the proper sequence. The format of this header
     *         follows RFC 2616. An example header is Content-Range:bytes
     *         0-4194303/*.
     */
    public String getRange() {
        return range;
    }
    
    /**
     * Identifies the range of bytes in the assembled archive that will be
     * uploaded in this part. Amazon Glacier uses this information to
     * assemble the archive in the proper sequence. The format of this header
     * follows RFC 2616. An example header is Content-Range:bytes
     * 0-4194303/*.
     *
     * @param range Identifies the range of bytes in the assembled archive that will be
     *         uploaded in this part. Amazon Glacier uses this information to
     *         assemble the archive in the proper sequence. The format of this header
     *         follows RFC 2616. An example header is Content-Range:bytes
     *         0-4194303/*.
     */
    public void setRange(String range) {
        this.range = range;
    }
    
    /**
     * Identifies the range of bytes in the assembled archive that will be
     * uploaded in this part. Amazon Glacier uses this information to
     * assemble the archive in the proper sequence. The format of this header
     * follows RFC 2616. An example header is Content-Range:bytes
     * 0-4194303/*.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param range Identifies the range of bytes in the assembled archive that will be
     *         uploaded in this part. Amazon Glacier uses this information to
     *         assemble the archive in the proper sequence. The format of this header
     *         follows RFC 2616. An example header is Content-Range:bytes
     *         0-4194303/*.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadMultipartPartRequest withRange(String range) {
        this.range = range;
        return this;
    }

    /**
     * The data to upload.
     *
     * @return The data to upload.
     */
    public java.io.InputStream getBody() {
        return body;
    }
    
    /**
     * The data to upload.
     *
     * @param body The data to upload.
     */
    public void setBody(java.io.InputStream body) {
        this.body = body;
    }
    
    /**
     * The data to upload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param body The data to upload.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadMultipartPartRequest withBody(java.io.InputStream body) {
        this.body = body;
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
        if (getUploadId() != null) sb.append("UploadId: " + getUploadId() + ",");
        if (getChecksum() != null) sb.append("Checksum: " + getChecksum() + ",");
        if (getRange() != null) sb.append("Range: " + getRange() + ",");
        if (getBody() != null) sb.append("Body: " + getBody() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadMultipartPartRequest == false) return false;
        UploadMultipartPartRequest other = (UploadMultipartPartRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getUploadId() == null ^ this.getUploadId() == null) return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false) return false; 
        if (other.getChecksum() == null ^ this.getChecksum() == null) return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false) return false; 
        if (other.getRange() == null ^ this.getRange() == null) return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false) return false; 
        if (other.getBody() == null ^ this.getBody() == null) return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false) return false; 
        return true;
    }
    
}
    