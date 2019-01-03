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

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPartsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the upload to which the parts are associated.
     * </p>
     */
    private String multipartUploadId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
     * </p>
     */
    private String vaultARN;
    /**
     * <p>
     * The description of the archive that was specified in the Initiate Multipart Upload request.
     * </p>
     */
    private String archiveDescription;
    /**
     * <p>
     * The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.
     * </p>
     */
    private Long partSizeInBytes;
    /**
     * <p>
     * The UTC time at which the multipart upload was initiated.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * A list of the part sizes of the multipart upload. Each object in the array contains a <code>RangeBytes</code> and
     * <code>sha256-tree-hash</code> name/value pair.
     * </p>
     */
    private java.util.List<PartListElement> parts;
    /**
     * <p>
     * An opaque string that represents where to continue pagination of the results. You use the marker in a new List
     * Parts request to obtain more jobs in the list. If there are no more parts, this value is <code>null</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The ID of the upload to which the parts are associated.
     * </p>
     * 
     * @param multipartUploadId
     *        The ID of the upload to which the parts are associated.
     */

    public void setMultipartUploadId(String multipartUploadId) {
        this.multipartUploadId = multipartUploadId;
    }

    /**
     * <p>
     * The ID of the upload to which the parts are associated.
     * </p>
     * 
     * @return The ID of the upload to which the parts are associated.
     */

    public String getMultipartUploadId() {
        return this.multipartUploadId;
    }

    /**
     * <p>
     * The ID of the upload to which the parts are associated.
     * </p>
     * 
     * @param multipartUploadId
     *        The ID of the upload to which the parts are associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsResult withMultipartUploadId(String multipartUploadId) {
        setMultipartUploadId(multipartUploadId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
     * </p>
     * 
     * @param vaultARN
     *        The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
     */

    public void setVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
     */

    public String getVaultARN() {
        return this.vaultARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
     * </p>
     * 
     * @param vaultARN
     *        The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsResult withVaultARN(String vaultARN) {
        setVaultARN(vaultARN);
        return this;
    }

    /**
     * <p>
     * The description of the archive that was specified in the Initiate Multipart Upload request.
     * </p>
     * 
     * @param archiveDescription
     *        The description of the archive that was specified in the Initiate Multipart Upload request.
     */

    public void setArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
    }

    /**
     * <p>
     * The description of the archive that was specified in the Initiate Multipart Upload request.
     * </p>
     * 
     * @return The description of the archive that was specified in the Initiate Multipart Upload request.
     */

    public String getArchiveDescription() {
        return this.archiveDescription;
    }

    /**
     * <p>
     * The description of the archive that was specified in the Initiate Multipart Upload request.
     * </p>
     * 
     * @param archiveDescription
     *        The description of the archive that was specified in the Initiate Multipart Upload request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsResult withArchiveDescription(String archiveDescription) {
        setArchiveDescription(archiveDescription);
        return this;
    }

    /**
     * <p>
     * The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.
     * </p>
     * 
     * @param partSizeInBytes
     *        The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload
     *        request.
     */

    public void setPartSizeInBytes(Long partSizeInBytes) {
        this.partSizeInBytes = partSizeInBytes;
    }

    /**
     * <p>
     * The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.
     * </p>
     * 
     * @return The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload
     *         request.
     */

    public Long getPartSizeInBytes() {
        return this.partSizeInBytes;
    }

    /**
     * <p>
     * The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.
     * </p>
     * 
     * @param partSizeInBytes
     *        The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsResult withPartSizeInBytes(Long partSizeInBytes) {
        setPartSizeInBytes(partSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The UTC time at which the multipart upload was initiated.
     * </p>
     * 
     * @param creationDate
     *        The UTC time at which the multipart upload was initiated.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The UTC time at which the multipart upload was initiated.
     * </p>
     * 
     * @return The UTC time at which the multipart upload was initiated.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The UTC time at which the multipart upload was initiated.
     * </p>
     * 
     * @param creationDate
     *        The UTC time at which the multipart upload was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsResult withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * A list of the part sizes of the multipart upload. Each object in the array contains a <code>RangeBytes</code> and
     * <code>sha256-tree-hash</code> name/value pair.
     * </p>
     * 
     * @return A list of the part sizes of the multipart upload. Each object in the array contains a
     *         <code>RangeBytes</code> and <code>sha256-tree-hash</code> name/value pair.
     */

    public java.util.List<PartListElement> getParts() {
        return parts;
    }

    /**
     * <p>
     * A list of the part sizes of the multipart upload. Each object in the array contains a <code>RangeBytes</code> and
     * <code>sha256-tree-hash</code> name/value pair.
     * </p>
     * 
     * @param parts
     *        A list of the part sizes of the multipart upload. Each object in the array contains a
     *        <code>RangeBytes</code> and <code>sha256-tree-hash</code> name/value pair.
     */

    public void setParts(java.util.Collection<PartListElement> parts) {
        if (parts == null) {
            this.parts = null;
            return;
        }

        this.parts = new java.util.ArrayList<PartListElement>(parts);
    }

    /**
     * <p>
     * A list of the part sizes of the multipart upload. Each object in the array contains a <code>RangeBytes</code> and
     * <code>sha256-tree-hash</code> name/value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParts(java.util.Collection)} or {@link #withParts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param parts
     *        A list of the part sizes of the multipart upload. Each object in the array contains a
     *        <code>RangeBytes</code> and <code>sha256-tree-hash</code> name/value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsResult withParts(PartListElement... parts) {
        if (this.parts == null) {
            setParts(new java.util.ArrayList<PartListElement>(parts.length));
        }
        for (PartListElement ele : parts) {
            this.parts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the part sizes of the multipart upload. Each object in the array contains a <code>RangeBytes</code> and
     * <code>sha256-tree-hash</code> name/value pair.
     * </p>
     * 
     * @param parts
     *        A list of the part sizes of the multipart upload. Each object in the array contains a
     *        <code>RangeBytes</code> and <code>sha256-tree-hash</code> name/value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsResult withParts(java.util.Collection<PartListElement> parts) {
        setParts(parts);
        return this;
    }

    /**
     * <p>
     * An opaque string that represents where to continue pagination of the results. You use the marker in a new List
     * Parts request to obtain more jobs in the list. If there are no more parts, this value is <code>null</code>.
     * </p>
     * 
     * @param marker
     *        An opaque string that represents where to continue pagination of the results. You use the marker in a new
     *        List Parts request to obtain more jobs in the list. If there are no more parts, this value is
     *        <code>null</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that represents where to continue pagination of the results. You use the marker in a new List
     * Parts request to obtain more jobs in the list. If there are no more parts, this value is <code>null</code>.
     * </p>
     * 
     * @return An opaque string that represents where to continue pagination of the results. You use the marker in a new
     *         List Parts request to obtain more jobs in the list. If there are no more parts, this value is
     *         <code>null</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string that represents where to continue pagination of the results. You use the marker in a new List
     * Parts request to obtain more jobs in the list. If there are no more parts, this value is <code>null</code>.
     * </p>
     * 
     * @param marker
     *        An opaque string that represents where to continue pagination of the results. You use the marker in a new
     *        List Parts request to obtain more jobs in the list. If there are no more parts, this value is
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getMultipartUploadId() != null)
            sb.append("MultipartUploadId: ").append(getMultipartUploadId()).append(",");
        if (getVaultARN() != null)
            sb.append("VaultARN: ").append(getVaultARN()).append(",");
        if (getArchiveDescription() != null)
            sb.append("ArchiveDescription: ").append(getArchiveDescription()).append(",");
        if (getPartSizeInBytes() != null)
            sb.append("PartSizeInBytes: ").append(getPartSizeInBytes()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getParts() != null)
            sb.append("Parts: ").append(getParts()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPartsResult == false)
            return false;
        ListPartsResult other = (ListPartsResult) obj;
        if (other.getMultipartUploadId() == null ^ this.getMultipartUploadId() == null)
            return false;
        if (other.getMultipartUploadId() != null && other.getMultipartUploadId().equals(this.getMultipartUploadId()) == false)
            return false;
        if (other.getVaultARN() == null ^ this.getVaultARN() == null)
            return false;
        if (other.getVaultARN() != null && other.getVaultARN().equals(this.getVaultARN()) == false)
            return false;
        if (other.getArchiveDescription() == null ^ this.getArchiveDescription() == null)
            return false;
        if (other.getArchiveDescription() != null && other.getArchiveDescription().equals(this.getArchiveDescription()) == false)
            return false;
        if (other.getPartSizeInBytes() == null ^ this.getPartSizeInBytes() == null)
            return false;
        if (other.getPartSizeInBytes() != null && other.getPartSizeInBytes().equals(this.getPartSizeInBytes()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getParts() == null ^ this.getParts() == null)
            return false;
        if (other.getParts() != null && other.getParts().equals(this.getParts()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
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
    public ListPartsResult clone() {
        try {
            return (ListPartsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
