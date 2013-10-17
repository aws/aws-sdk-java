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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#initiateMultipartUpload(InitiateMultipartUploadRequest) InitiateMultipartUpload operation}.
 * <p>
 * This operation initiates a multipart upload. Amazon Glacier creates a multipart upload resource and returns its ID in the response. The multipart
 * upload ID is used in subsequent requests to upload parts of an archive (see UploadMultipartPart).
 * </p>
 * <p>
 * When you initiate a multipart upload, you specify the part size in number of bytes. The part size must be a megabyte (1024 KB) multiplied by a power
 * of 2-for example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum
 * is 4 GB.
 * </p>
 * <p>
 * Every part you upload to this resource (see UploadMultipartPart), except the last one, must have the same size. The last one can be the same size or
 * smaller. For example, suppose you want to upload a 16.2 MB file. If you initiate the multipart upload with a part size of 4 MB, you will upload four
 * parts of 4 MB each and one part of 0.2 MB.
 * </p>
 * <p>
 * <b>NOTE:</b> You don't need to know the size of the archive when you start a multipart upload because Amazon Glacier does not require you to specify
 * the overall archive size.
 * </p>
 * <p>
 * After you complete the multipart upload, Amazon Glacier removes the multipart upload resource referenced by the ID. Amazon Glacier also removes the
 * multipart upload resource if you cancel the multipart upload or it may be removed if there is no activity for a period of 24 hours.
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
 * </a> and <a href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-multipart-initiate-upload.html"> Initiate Multipart Upload </a> in
 * the <i>Amazon Glacier Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#initiateMultipartUpload(InitiateMultipartUploadRequest)
 */
public class InitiateMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

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
     * The archive description that you are uploading in parts. <p>The part
     * size must be a megabyte (1024 KB) multiplied by a power of 2���for
     * example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8
     * MB), and so on. The minimum allowable part size is 1 MB, and the
     * maximum is 4 GB (4096 MB).
     */
    private String archiveDescription;

    /**
     * The size of each part except the last, in bytes. The last part can be
     * smaller than this part size.
     */
    private String partSize;

    /**
     * Default constructor for a new InitiateMultipartUploadRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public InitiateMultipartUploadRequest() {}
    
    /**
     * Constructs a new InitiateMultipartUploadRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     * @param archiveDescription The archive description that you are
     * uploading in parts. <p>The part size must be a megabyte (1024 KB)
     * multiplied by a power of 2���for example, 1048576 (1 MB), 2097152 (2
     * MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable
     * part size is 1 MB, and the maximum is 4 GB (4096 MB).
     * @param partSize The size of each part except the last, in bytes. The
     * last part can be smaller than this part size.
     */
    public InitiateMultipartUploadRequest(String vaultName, String archiveDescription, String partSize) {
        setVaultName(vaultName);
        setArchiveDescription(archiveDescription);
        setPartSize(partSize);
    }

    /**
     * Constructs a new InitiateMultipartUploadRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param vaultName The name of the vault.
     * @param archiveDescription The archive description that you are
     * uploading in parts. <p>The part size must be a megabyte (1024 KB)
     * multiplied by a power of 2���for example, 1048576 (1 MB), 2097152 (2
     * MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable
     * part size is 1 MB, and the maximum is 4 GB (4096 MB).
     * @param partSize The size of each part except the last, in bytes. The
     * last part can be smaller than this part size.
     */
    public InitiateMultipartUploadRequest(String accountId, String vaultName, String archiveDescription, String partSize) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setArchiveDescription(archiveDescription);
        setPartSize(partSize);
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
    public InitiateMultipartUploadRequest withAccountId(String accountId) {
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
    public InitiateMultipartUploadRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * The archive description that you are uploading in parts. <p>The part
     * size must be a megabyte (1024 KB) multiplied by a power of 2���for
     * example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8
     * MB), and so on. The minimum allowable part size is 1 MB, and the
     * maximum is 4 GB (4096 MB).
     *
     * @return The archive description that you are uploading in parts. <p>The part
     *         size must be a megabyte (1024 KB) multiplied by a power of 2���for
     *         example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8
     *         MB), and so on. The minimum allowable part size is 1 MB, and the
     *         maximum is 4 GB (4096 MB).
     */
    public String getArchiveDescription() {
        return archiveDescription;
    }
    
    /**
     * The archive description that you are uploading in parts. <p>The part
     * size must be a megabyte (1024 KB) multiplied by a power of 2���for
     * example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8
     * MB), and so on. The minimum allowable part size is 1 MB, and the
     * maximum is 4 GB (4096 MB).
     *
     * @param archiveDescription The archive description that you are uploading in parts. <p>The part
     *         size must be a megabyte (1024 KB) multiplied by a power of 2���for
     *         example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8
     *         MB), and so on. The minimum allowable part size is 1 MB, and the
     *         maximum is 4 GB (4096 MB).
     */
    public void setArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
    }
    
    /**
     * The archive description that you are uploading in parts. <p>The part
     * size must be a megabyte (1024 KB) multiplied by a power of 2���for
     * example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8
     * MB), and so on. The minimum allowable part size is 1 MB, and the
     * maximum is 4 GB (4096 MB).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param archiveDescription The archive description that you are uploading in parts. <p>The part
     *         size must be a megabyte (1024 KB) multiplied by a power of 2���for
     *         example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8
     *         MB), and so on. The minimum allowable part size is 1 MB, and the
     *         maximum is 4 GB (4096 MB).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InitiateMultipartUploadRequest withArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
        return this;
    }

    /**
     * The size of each part except the last, in bytes. The last part can be
     * smaller than this part size.
     *
     * @return The size of each part except the last, in bytes. The last part can be
     *         smaller than this part size.
     */
    public String getPartSize() {
        return partSize;
    }
    
    /**
     * The size of each part except the last, in bytes. The last part can be
     * smaller than this part size.
     *
     * @param partSize The size of each part except the last, in bytes. The last part can be
     *         smaller than this part size.
     */
    public void setPartSize(String partSize) {
        this.partSize = partSize;
    }
    
    /**
     * The size of each part except the last, in bytes. The last part can be
     * smaller than this part size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partSize The size of each part except the last, in bytes. The last part can be
     *         smaller than this part size.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InitiateMultipartUploadRequest withPartSize(String partSize) {
        this.partSize = partSize;
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
        if (getArchiveDescription() != null) sb.append("ArchiveDescription: " + getArchiveDescription() + ",");
        if (getPartSize() != null) sb.append("PartSize: " + getPartSize() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InitiateMultipartUploadRequest == false) return false;
        InitiateMultipartUploadRequest other = (InitiateMultipartUploadRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getArchiveDescription() == null ^ this.getArchiveDescription() == null) return false;
        if (other.getArchiveDescription() != null && other.getArchiveDescription().equals(this.getArchiveDescription()) == false) return false; 
        if (other.getPartSize() == null ^ this.getPartSize() == null) return false;
        if (other.getPartSize() != null && other.getPartSize().equals(this.getPartSize()) == false) return false; 
        return true;
    }
    
}
    