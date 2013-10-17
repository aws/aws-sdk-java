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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#completeMultipartUpload(CompleteMultipartUploadRequest) CompleteMultipartUpload operation}.
 * <p>
 * You call this operation to inform Amazon Glacier that all the archive parts have been uploaded and that Amazon Glacier can now assemble the archive
 * from the uploaded parts. After assembling and saving the archive to the vault, Amazon Glacier returns the URI path of the newly created archive
 * resource. Using the URI path, you can then access the archive. After you upload an archive, you should save the archive ID returned to retrieve the
 * archive at a later point. You can also get the vault inventory to obtain a list of archive IDs in a vault. For more information, see InitiateJob.
 * </p>
 * <p>
 * In the request, you must include the computed SHA256 tree hash of the entire archive you have uploaded. For information about computing a SHA256 tree
 * hash, see <a href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/checksum-calculations.html"> Computing Checksums </a> . On the server
 * side, Amazon Glacier also constructs the SHA256 tree hash of the assembled archive. If the values match, Amazon Glacier saves the archive to the
 * vault; otherwise, it returns an error, and the operation fails. The ListParts operation returns a list of parts uploaded for a specific multipart
 * upload. It includes checksum information for each uploaded part that can be used to debug a bad checksum issue.
 * </p>
 * <p>
 * Additionally, Amazon Glacier also checks for any missing content ranges when assembling the archive, if missing content ranges are found, Amazon
 * Glacier returns an error and the operation fails.
 * </p>
 * <p>
 * Complete Multipart Upload is an idempotent operation. After your first successful complete multipart upload, if you call the operation again within a
 * short period, the operation will succeed and return the same archive ID. This is useful in the event you experience a network issue that causes an
 * aborted connection or receive a 500 server error, in which case you can repeat your Complete Multipart Upload request and get the same archive ID
 * without creating duplicate archives. Note, however, that after the multipart upload completes, you cannot call the List Parts operation and the
 * multipart upload will not appear in List Multipart Uploads response, even if idempotent complete is possible.
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
 * </a> and <a href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-multipart-complete-upload.html"> Complete Multipart Upload </a> in
 * the <i>Amazon Glacier Developer Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#completeMultipartUpload(CompleteMultipartUploadRequest)
 */
public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

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
     * The total size, in bytes, of the entire archive. This value should be
     * the sum of all the sizes of the individual parts that you uploaded.
     */
    private String archiveSize;

    /**
     * The SHA256 tree hash of the entire archive. It is the tree hash of
     * SHA256 tree hash of the individual parts. If the value you specify in
     * the request does not match the SHA256 tree hash of the final assembled
     * archive as computed by Amazon Glacier, Amazon Glacier returns an error
     * and the request fails.
     */
    private String checksum;

    /**
     * Default constructor for a new CompleteMultipartUploadRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CompleteMultipartUploadRequest() {}
    
    /**
     * Constructs a new CompleteMultipartUploadRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     * @param uploadId The upload ID of the multipart upload.
     * @param archiveSize The total size, in bytes, of the entire archive.
     * This value should be the sum of all the sizes of the individual parts
     * that you uploaded.
     * @param checksum The SHA256 tree hash of the entire archive. It is the
     * tree hash of SHA256 tree hash of the individual parts. If the value
     * you specify in the request does not match the SHA256 tree hash of the
     * final assembled archive as computed by Amazon Glacier, Amazon Glacier
     * returns an error and the request fails.
     */
    public CompleteMultipartUploadRequest(String vaultName, String uploadId, String archiveSize, String checksum) {
        setVaultName(vaultName);
        setUploadId(uploadId);
        setArchiveSize(archiveSize);
        setChecksum(checksum);
    }

    /**
     * Constructs a new CompleteMultipartUploadRequest object.
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
     * @param archiveSize The total size, in bytes, of the entire archive.
     * This value should be the sum of all the sizes of the individual parts
     * that you uploaded.
     * @param checksum The SHA256 tree hash of the entire archive. It is the
     * tree hash of SHA256 tree hash of the individual parts. If the value
     * you specify in the request does not match the SHA256 tree hash of the
     * final assembled archive as computed by Amazon Glacier, Amazon Glacier
     * returns an error and the request fails.
     */
    public CompleteMultipartUploadRequest(String accountId, String vaultName, String uploadId, String archiveSize, String checksum) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setUploadId(uploadId);
        setArchiveSize(archiveSize);
        setChecksum(checksum);
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
    public CompleteMultipartUploadRequest withAccountId(String accountId) {
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
    public CompleteMultipartUploadRequest withVaultName(String vaultName) {
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
    public CompleteMultipartUploadRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * The total size, in bytes, of the entire archive. This value should be
     * the sum of all the sizes of the individual parts that you uploaded.
     *
     * @return The total size, in bytes, of the entire archive. This value should be
     *         the sum of all the sizes of the individual parts that you uploaded.
     */
    public String getArchiveSize() {
        return archiveSize;
    }
    
    /**
     * The total size, in bytes, of the entire archive. This value should be
     * the sum of all the sizes of the individual parts that you uploaded.
     *
     * @param archiveSize The total size, in bytes, of the entire archive. This value should be
     *         the sum of all the sizes of the individual parts that you uploaded.
     */
    public void setArchiveSize(String archiveSize) {
        this.archiveSize = archiveSize;
    }
    
    /**
     * The total size, in bytes, of the entire archive. This value should be
     * the sum of all the sizes of the individual parts that you uploaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param archiveSize The total size, in bytes, of the entire archive. This value should be
     *         the sum of all the sizes of the individual parts that you uploaded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CompleteMultipartUploadRequest withArchiveSize(String archiveSize) {
        this.archiveSize = archiveSize;
        return this;
    }

    /**
     * The SHA256 tree hash of the entire archive. It is the tree hash of
     * SHA256 tree hash of the individual parts. If the value you specify in
     * the request does not match the SHA256 tree hash of the final assembled
     * archive as computed by Amazon Glacier, Amazon Glacier returns an error
     * and the request fails.
     *
     * @return The SHA256 tree hash of the entire archive. It is the tree hash of
     *         SHA256 tree hash of the individual parts. If the value you specify in
     *         the request does not match the SHA256 tree hash of the final assembled
     *         archive as computed by Amazon Glacier, Amazon Glacier returns an error
     *         and the request fails.
     */
    public String getChecksum() {
        return checksum;
    }
    
    /**
     * The SHA256 tree hash of the entire archive. It is the tree hash of
     * SHA256 tree hash of the individual parts. If the value you specify in
     * the request does not match the SHA256 tree hash of the final assembled
     * archive as computed by Amazon Glacier, Amazon Glacier returns an error
     * and the request fails.
     *
     * @param checksum The SHA256 tree hash of the entire archive. It is the tree hash of
     *         SHA256 tree hash of the individual parts. If the value you specify in
     *         the request does not match the SHA256 tree hash of the final assembled
     *         archive as computed by Amazon Glacier, Amazon Glacier returns an error
     *         and the request fails.
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
    
    /**
     * The SHA256 tree hash of the entire archive. It is the tree hash of
     * SHA256 tree hash of the individual parts. If the value you specify in
     * the request does not match the SHA256 tree hash of the final assembled
     * archive as computed by Amazon Glacier, Amazon Glacier returns an error
     * and the request fails.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checksum The SHA256 tree hash of the entire archive. It is the tree hash of
     *         SHA256 tree hash of the individual parts. If the value you specify in
     *         the request does not match the SHA256 tree hash of the final assembled
     *         archive as computed by Amazon Glacier, Amazon Glacier returns an error
     *         and the request fails.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CompleteMultipartUploadRequest withChecksum(String checksum) {
        this.checksum = checksum;
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
        if (getArchiveSize() != null) sb.append("ArchiveSize: " + getArchiveSize() + ",");
        if (getChecksum() != null) sb.append("Checksum: " + getChecksum() );
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
        hashCode = prime * hashCode + ((getArchiveSize() == null) ? 0 : getArchiveSize().hashCode()); 
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CompleteMultipartUploadRequest == false) return false;
        CompleteMultipartUploadRequest other = (CompleteMultipartUploadRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getUploadId() == null ^ this.getUploadId() == null) return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false) return false; 
        if (other.getArchiveSize() == null ^ this.getArchiveSize() == null) return false;
        if (other.getArchiveSize() != null && other.getArchiveSize().equals(this.getArchiveSize()) == false) return false; 
        if (other.getChecksum() == null ^ this.getChecksum() == null) return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false) return false; 
        return true;
    }
    
}
    