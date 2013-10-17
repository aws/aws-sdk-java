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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#uploadArchive(UploadArchiveRequest) UploadArchive operation}.
 * <p>
 * This operation adds an archive to a vault. This is a synchronous operation, and for a successful upload, your data is durably persisted. Amazon
 * Glacier returns the archive ID in the <code>x-amz-archive-id</code> header of the response.
 * </p>
 * <p>
 * You must use the archive ID to access your data in Amazon Glacier. After you upload an archive, you should save the archive ID returned so that you
 * can retrieve or delete the archive later. Besides saving the archive ID, you can also index it and give it a friendly name to allow for better
 * searching. You can also use the optional archive description field to specify how the archive is referred to in an external index of archives, such as
 * you might create in Amazon DynamoDB. You can also get the vault inventory to obtain a list of archive IDs in a vault. For more information, see
 * InitiateJob.
 * </p>
 * <p>
 * You must provide a SHA256 tree hash of the data you are uploading. For information about computing a SHA256 tree hash, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/checksum-calculations.html"> Computing Checksums </a> .
 * </p>
 * <p>
 * You can optionally specify an archive description of up to 1,024 printable ASCII characters. You can get the archive description when you either
 * retrieve the archive or get the vault inventory. For more information, see InitiateJob. Amazon Glacier does not interpret the description in any way.
 * An archive description does not need to be unique. You cannot use the description to retrieve or sort the archive list.
 * </p>
 * <p>
 * Archives are immutable. After you upload an archive, you cannot edit the archive or its description.
 * </p>
 * <p>
 * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any
 * permissions by default. You must grant them explicit permission to perform specific actions. For more information, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html"> Access Control Using AWS Identity and Access
 * Management (IAM) </a> .
 * </p>
 * <p>
 * For conceptual information and underlying REST API, go to <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/uploading-an-archive.html"> Uploading an Archive in Amazon Glacier </a> and <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-archive-post.html"> Upload Archive </a> in the <i>Amazon Glacier Developer
 * Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#uploadArchive(UploadArchiveRequest)
 */
public class UploadArchiveRequest extends AmazonWebServiceRequest implements Serializable {

    private Long contentLength;

    /**
     * The name of the vault.
     */
    private String vaultName;

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     */
    private String accountId;

    /**
     * The optional description of the archive you are uploading.
     */
    private String archiveDescription;

    /**
     * The SHA256 checksum (a linear hash) of the payload.
     */
    private String checksum;

    /**
     * The data to upload.
     */
    private java.io.InputStream body;

    /**
     * Default constructor for a new UploadArchiveRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UploadArchiveRequest() {}
    
    /**
     * Constructs a new UploadArchiveRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     * @param archiveDescription The optional description of the archive you
     * are uploading.
     * @param checksum The SHA256 checksum (a linear hash) of the payload.
     * @param body The data to upload.
     */
    public UploadArchiveRequest(String vaultName, String archiveDescription, String checksum, java.io.InputStream body) {
        setVaultName(vaultName);
        setArchiveDescription(archiveDescription);
        setChecksum(checksum);
        setBody(body);
    }

    /**
     * Constructs a new UploadArchiveRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param archiveDescription The optional description of the archive you
     * are uploading.
     * @param checksum The SHA256 checksum (a linear hash) of the payload.
     * @param body The data to upload.
     */
    public UploadArchiveRequest(String vaultName, String accountId, String archiveDescription, String checksum, java.io.InputStream body) {
        setVaultName(vaultName);
        setAccountId(accountId);
        setArchiveDescription(archiveDescription);
        setChecksum(checksum);
        setBody(body);
    }

    /**
     * Returns the value of the ContentLength property for this object.
     *
     * @return The value of the ContentLength property for this object.
     */
    public Long getContentLength() {
        return contentLength;
    }
    
    /**
     * Sets the value of the ContentLength property for this object.
     *
     * @param contentLength The new value for the ContentLength property for this object.
     */
    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }
    
    /**
     * Sets the value of the ContentLength property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contentLength The new value for the ContentLength property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadArchiveRequest withContentLength(Long contentLength) {
        this.contentLength = contentLength;
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
    public UploadArchiveRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
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
    public UploadArchiveRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The optional description of the archive you are uploading.
     *
     * @return The optional description of the archive you are uploading.
     */
    public String getArchiveDescription() {
        return archiveDescription;
    }
    
    /**
     * The optional description of the archive you are uploading.
     *
     * @param archiveDescription The optional description of the archive you are uploading.
     */
    public void setArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
    }
    
    /**
     * The optional description of the archive you are uploading.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param archiveDescription The optional description of the archive you are uploading.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadArchiveRequest withArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
        return this;
    }

    /**
     * The SHA256 checksum (a linear hash) of the payload.
     *
     * @return The SHA256 checksum (a linear hash) of the payload.
     */
    public String getChecksum() {
        return checksum;
    }
    
    /**
     * The SHA256 checksum (a linear hash) of the payload.
     *
     * @param checksum The SHA256 checksum (a linear hash) of the payload.
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
    
    /**
     * The SHA256 checksum (a linear hash) of the payload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checksum The SHA256 checksum (a linear hash) of the payload.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadArchiveRequest withChecksum(String checksum) {
        this.checksum = checksum;
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
    public UploadArchiveRequest withBody(java.io.InputStream body) {
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
        if (getContentLength() != null) sb.append("ContentLength: " + getContentLength() + ",");
        if (getVaultName() != null) sb.append("VaultName: " + getVaultName() + ",");
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getArchiveDescription() != null) sb.append("ArchiveDescription: " + getArchiveDescription() + ",");
        if (getChecksum() != null) sb.append("Checksum: " + getChecksum() + ",");
        if (getBody() != null) sb.append("Body: " + getBody() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContentLength() == null) ? 0 : getContentLength().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getArchiveDescription() == null) ? 0 : getArchiveDescription().hashCode()); 
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode()); 
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadArchiveRequest == false) return false;
        UploadArchiveRequest other = (UploadArchiveRequest)obj;
        
        if (other.getContentLength() == null ^ this.getContentLength() == null) return false;
        if (other.getContentLength() != null && other.getContentLength().equals(this.getContentLength()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getArchiveDescription() == null ^ this.getArchiveDescription() == null) return false;
        if (other.getArchiveDescription() != null && other.getArchiveDescription().equals(this.getArchiveDescription()) == false) return false; 
        if (other.getChecksum() == null ^ this.getChecksum() == null) return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false) return false; 
        if (other.getBody() == null ^ this.getBody() == null) return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false) return false; 
        return true;
    }
    
}
    