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
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
public class ListPartsResult implements Serializable {

    /**
     * The ID of the upload to which the parts are associated.
     */
    private String multipartUploadId;

    /**
     * The Amazon Resource Name (ARN) of the vault to which the multipart
     * upload was initiated.
     */
    private String vaultARN;

    /**
     * The description of the archive that was specified in the Initiate
     * Multipart Upload request.
     */
    private String archiveDescription;

    /**
     * The part size in bytes.
     */
    private Long partSizeInBytes;

    /**
     * The UTC time at which the multipart upload was initiated.
     */
    private String creationDate;

    /**
     * A list of the part sizes of the multipart upload.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PartListElement> parts;

    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use the marker in a new List Parts request to obtain more
     * jobs in the list. If there are no more parts, this value is
     * <code>null</code>.
     */
    private String marker;

    /**
     * The ID of the upload to which the parts are associated.
     *
     * @return The ID of the upload to which the parts are associated.
     */
    public String getMultipartUploadId() {
        return multipartUploadId;
    }
    
    /**
     * The ID of the upload to which the parts are associated.
     *
     * @param multipartUploadId The ID of the upload to which the parts are associated.
     */
    public void setMultipartUploadId(String multipartUploadId) {
        this.multipartUploadId = multipartUploadId;
    }
    
    /**
     * The ID of the upload to which the parts are associated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multipartUploadId The ID of the upload to which the parts are associated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPartsResult withMultipartUploadId(String multipartUploadId) {
        this.multipartUploadId = multipartUploadId;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the vault to which the multipart
     * upload was initiated.
     *
     * @return The Amazon Resource Name (ARN) of the vault to which the multipart
     *         upload was initiated.
     */
    public String getVaultARN() {
        return vaultARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the vault to which the multipart
     * upload was initiated.
     *
     * @param vaultARN The Amazon Resource Name (ARN) of the vault to which the multipart
     *         upload was initiated.
     */
    public void setVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the vault to which the multipart
     * upload was initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultARN The Amazon Resource Name (ARN) of the vault to which the multipart
     *         upload was initiated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPartsResult withVaultARN(String vaultARN) {
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
    public ListPartsResult withArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
        return this;
    }

    /**
     * The part size in bytes.
     *
     * @return The part size in bytes.
     */
    public Long getPartSizeInBytes() {
        return partSizeInBytes;
    }
    
    /**
     * The part size in bytes.
     *
     * @param partSizeInBytes The part size in bytes.
     */
    public void setPartSizeInBytes(Long partSizeInBytes) {
        this.partSizeInBytes = partSizeInBytes;
    }
    
    /**
     * The part size in bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partSizeInBytes The part size in bytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPartsResult withPartSizeInBytes(Long partSizeInBytes) {
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
    public ListPartsResult withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * A list of the part sizes of the multipart upload.
     *
     * @return A list of the part sizes of the multipart upload.
     */
    public java.util.List<PartListElement> getParts() {
        if (parts == null) {
              parts = new com.amazonaws.internal.ListWithAutoConstructFlag<PartListElement>();
              parts.setAutoConstruct(true);
        }
        return parts;
    }
    
    /**
     * A list of the part sizes of the multipart upload.
     *
     * @param parts A list of the part sizes of the multipart upload.
     */
    public void setParts(java.util.Collection<PartListElement> parts) {
        if (parts == null) {
            this.parts = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PartListElement> partsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PartListElement>(parts.size());
        partsCopy.addAll(parts);
        this.parts = partsCopy;
    }
    
    /**
     * A list of the part sizes of the multipart upload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parts A list of the part sizes of the multipart upload.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPartsResult withParts(PartListElement... parts) {
        if (getParts() == null) setParts(new java.util.ArrayList<PartListElement>(parts.length));
        for (PartListElement value : parts) {
            getParts().add(value);
        }
        return this;
    }
    
    /**
     * A list of the part sizes of the multipart upload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parts A list of the part sizes of the multipart upload.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPartsResult withParts(java.util.Collection<PartListElement> parts) {
        if (parts == null) {
            this.parts = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PartListElement> partsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PartListElement>(parts.size());
            partsCopy.addAll(parts);
            this.parts = partsCopy;
        }

        return this;
    }

    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use the marker in a new List Parts request to obtain more
     * jobs in the list. If there are no more parts, this value is
     * <code>null</code>.
     *
     * @return An opaque string that represents where to continue pagination of the
     *         results. You use the marker in a new List Parts request to obtain more
     *         jobs in the list. If there are no more parts, this value is
     *         <code>null</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use the marker in a new List Parts request to obtain more
     * jobs in the list. If there are no more parts, this value is
     * <code>null</code>.
     *
     * @param marker An opaque string that represents where to continue pagination of the
     *         results. You use the marker in a new List Parts request to obtain more
     *         jobs in the list. If there are no more parts, this value is
     *         <code>null</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use the marker in a new List Parts request to obtain more
     * jobs in the list. If there are no more parts, this value is
     * <code>null</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An opaque string that represents where to continue pagination of the
     *         results. You use the marker in a new List Parts request to obtain more
     *         jobs in the list. If there are no more parts, this value is
     *         <code>null</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPartsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getParts() != null) sb.append("Parts: " + getParts() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
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
        hashCode = prime * hashCode + ((getParts() == null) ? 0 : getParts().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPartsResult == false) return false;
        ListPartsResult other = (ListPartsResult)obj;
        
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
        if (other.getParts() == null ^ this.getParts() == null) return false;
        if (other.getParts() != null && other.getParts().equals(this.getParts()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    