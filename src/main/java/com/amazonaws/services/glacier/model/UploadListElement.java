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


/**
 * <p>
 * A list of in-progress multipart uploads for a vault.
 * </p>
 */
public class UploadListElement implements Serializable {

    /**
     * The ID of a multipart upload.
     */
    private String multipartUploadId;

    /**
     * The Amazon Resource Name (ARN) of the vault that contains the archive.
     */
    private String vaultARN;

    /**
     * The description of the archive that was specified in the Initiate
     * Multipart Upload request.
     */
    private String archiveDescription;

    /**
     * The part size, in bytes, specified in the Initiate Multipart Upload
     * request. This is the size of all the parts in the upload except the
     * last part, which may be smaller than this size.
     */
    private Long partSizeInBytes;

    /**
     * The UTC time at which the multipart upload was initiated.
     */
    private String creationDate;

    /**
     * Default constructor for a new UploadListElement object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UploadListElement() {}
    
    /**
     * The ID of a multipart upload.
     *
     * @return The ID of a multipart upload.
     */
    public String getMultipartUploadId() {
        return multipartUploadId;
    }
    
    /**
     * The ID of a multipart upload.
     *
     * @param multipartUploadId The ID of a multipart upload.
     */
    public void setMultipartUploadId(String multipartUploadId) {
        this.multipartUploadId = multipartUploadId;
    }
    
    /**
     * The ID of a multipart upload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multipartUploadId The ID of a multipart upload.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadListElement withMultipartUploadId(String multipartUploadId) {
        this.multipartUploadId = multipartUploadId;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the vault that contains the archive.
     *
     * @return The Amazon Resource Name (ARN) of the vault that contains the archive.
     */
    public String getVaultARN() {
        return vaultARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the vault that contains the archive.
     *
     * @param vaultARN The Amazon Resource Name (ARN) of the vault that contains the archive.
     */
    public void setVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the vault that contains the archive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultARN The Amazon Resource Name (ARN) of the vault that contains the archive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadListElement withVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
        return this;
    }

    /**
     * The description of the archive that was specified in the Initiate
     * Multipart Upload request.
     *
     * @return The description of the archive that was specified in the Initiate
     *         Multipart Upload request.
     */
    public String getArchiveDescription() {
        return archiveDescription;
    }
    
    /**
     * The description of the archive that was specified in the Initiate
     * Multipart Upload request.
     *
     * @param archiveDescription The description of the archive that was specified in the Initiate
     *         Multipart Upload request.
     */
    public void setArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
    }
    
    /**
     * The description of the archive that was specified in the Initiate
     * Multipart Upload request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param archiveDescription The description of the archive that was specified in the Initiate
     *         Multipart Upload request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadListElement withArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
        return this;
    }

    /**
     * The part size, in bytes, specified in the Initiate Multipart Upload
     * request. This is the size of all the parts in the upload except the
     * last part, which may be smaller than this size.
     *
     * @return The part size, in bytes, specified in the Initiate Multipart Upload
     *         request. This is the size of all the parts in the upload except the
     *         last part, which may be smaller than this size.
     */
    public Long getPartSizeInBytes() {
        return partSizeInBytes;
    }
    
    /**
     * The part size, in bytes, specified in the Initiate Multipart Upload
     * request. This is the size of all the parts in the upload except the
     * last part, which may be smaller than this size.
     *
     * @param partSizeInBytes The part size, in bytes, specified in the Initiate Multipart Upload
     *         request. This is the size of all the parts in the upload except the
     *         last part, which may be smaller than this size.
     */
    public void setPartSizeInBytes(Long partSizeInBytes) {
        this.partSizeInBytes = partSizeInBytes;
    }
    
    /**
     * The part size, in bytes, specified in the Initiate Multipart Upload
     * request. This is the size of all the parts in the upload except the
     * last part, which may be smaller than this size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partSizeInBytes The part size, in bytes, specified in the Initiate Multipart Upload
     *         request. This is the size of all the parts in the upload except the
     *         last part, which may be smaller than this size.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadListElement withPartSizeInBytes(Long partSizeInBytes) {
        this.partSizeInBytes = partSizeInBytes;
        return this;
    }

    /**
     * The UTC time at which the multipart upload was initiated.
     *
     * @return The UTC time at which the multipart upload was initiated.
     */
    public String getCreationDate() {
        return creationDate;
    }
    
    /**
     * The UTC time at which the multipart upload was initiated.
     *
     * @param creationDate The UTC time at which the multipart upload was initiated.
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The UTC time at which the multipart upload was initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The UTC time at which the multipart upload was initiated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UploadListElement withCreationDate(String creationDate) {
        this.creationDate = creationDate;
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
        if (getMultipartUploadId() != null) sb.append("MultipartUploadId: " + getMultipartUploadId() + ",");
        if (getVaultARN() != null) sb.append("VaultARN: " + getVaultARN() + ",");
        if (getArchiveDescription() != null) sb.append("ArchiveDescription: " + getArchiveDescription() + ",");
        if (getPartSizeInBytes() != null) sb.append("PartSizeInBytes: " + getPartSizeInBytes() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMultipartUploadId() == null) ? 0 : getMultipartUploadId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultARN() == null) ? 0 : getVaultARN().hashCode()); 
        hashCode = prime * hashCode + ((getArchiveDescription() == null) ? 0 : getArchiveDescription().hashCode()); 
        hashCode = prime * hashCode + ((getPartSizeInBytes() == null) ? 0 : getPartSizeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadListElement == false) return false;
        UploadListElement other = (UploadListElement)obj;
        
        if (other.getMultipartUploadId() == null ^ this.getMultipartUploadId() == null) return false;
        if (other.getMultipartUploadId() != null && other.getMultipartUploadId().equals(this.getMultipartUploadId()) == false) return false; 
        if (other.getVaultARN() == null ^ this.getVaultARN() == null) return false;
        if (other.getVaultARN() != null && other.getVaultARN().equals(this.getVaultARN()) == false) return false; 
        if (other.getArchiveDescription() == null ^ this.getArchiveDescription() == null) return false;
        if (other.getArchiveDescription() != null && other.getArchiveDescription().equals(this.getArchiveDescription()) == false) return false; 
        if (other.getPartSizeInBytes() == null ^ this.getPartSizeInBytes() == null) return false;
        if (other.getPartSizeInBytes() != null && other.getPartSizeInBytes().equals(this.getPartSizeInBytes()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        return true;
    }
    
}
    