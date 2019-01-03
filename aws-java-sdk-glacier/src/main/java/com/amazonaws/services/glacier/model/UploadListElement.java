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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of in-progress multipart uploads for a vault.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadListElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a multipart upload.
     * </p>
     */
    private String multipartUploadId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault that contains the archive.
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
     * The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in
     * the upload except the last part, which may be smaller than this size.
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
     * The ID of a multipart upload.
     * </p>
     * 
     * @param multipartUploadId
     *        The ID of a multipart upload.
     */

    public void setMultipartUploadId(String multipartUploadId) {
        this.multipartUploadId = multipartUploadId;
    }

    /**
     * <p>
     * The ID of a multipart upload.
     * </p>
     * 
     * @return The ID of a multipart upload.
     */

    public String getMultipartUploadId() {
        return this.multipartUploadId;
    }

    /**
     * <p>
     * The ID of a multipart upload.
     * </p>
     * 
     * @param multipartUploadId
     *        The ID of a multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadListElement withMultipartUploadId(String multipartUploadId) {
        setMultipartUploadId(multipartUploadId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault that contains the archive.
     * </p>
     * 
     * @param vaultARN
     *        The Amazon Resource Name (ARN) of the vault that contains the archive.
     */

    public void setVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault that contains the archive.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vault that contains the archive.
     */

    public String getVaultARN() {
        return this.vaultARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault that contains the archive.
     * </p>
     * 
     * @param vaultARN
     *        The Amazon Resource Name (ARN) of the vault that contains the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadListElement withVaultARN(String vaultARN) {
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

    public UploadListElement withArchiveDescription(String archiveDescription) {
        setArchiveDescription(archiveDescription);
        return this;
    }

    /**
     * <p>
     * The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in
     * the upload except the last part, which may be smaller than this size.
     * </p>
     * 
     * @param partSizeInBytes
     *        The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the
     *        parts in the upload except the last part, which may be smaller than this size.
     */

    public void setPartSizeInBytes(Long partSizeInBytes) {
        this.partSizeInBytes = partSizeInBytes;
    }

    /**
     * <p>
     * The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in
     * the upload except the last part, which may be smaller than this size.
     * </p>
     * 
     * @return The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the
     *         parts in the upload except the last part, which may be smaller than this size.
     */

    public Long getPartSizeInBytes() {
        return this.partSizeInBytes;
    }

    /**
     * <p>
     * The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in
     * the upload except the last part, which may be smaller than this size.
     * </p>
     * 
     * @param partSizeInBytes
     *        The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the
     *        parts in the upload except the last part, which may be smaller than this size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadListElement withPartSizeInBytes(Long partSizeInBytes) {
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

    public UploadListElement withCreationDate(String creationDate) {
        setCreationDate(creationDate);
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
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadListElement == false)
            return false;
        UploadListElement other = (UploadListElement) obj;
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
        return hashCode;
    }

    @Override
    public UploadListElement clone() {
        try {
            return (UploadListElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.UploadListElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
