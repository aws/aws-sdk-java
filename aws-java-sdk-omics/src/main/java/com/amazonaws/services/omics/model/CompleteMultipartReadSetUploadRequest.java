/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CompleteMultipartReadSetUpload"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteMultipartReadSetUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The sequence store ID for the store involved in the multipart upload.
     * </p>
     */
    private String sequenceStoreId;
    /**
     * <p>
     * The ID for the multipart upload.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * The individual uploads or parts of a multipart upload.
     * </p>
     */
    private java.util.List<CompleteReadSetUploadPartListItem> parts;

    /**
     * <p>
     * The sequence store ID for the store involved in the multipart upload.
     * </p>
     * 
     * @param sequenceStoreId
     *        The sequence store ID for the store involved in the multipart upload.
     */

    public void setSequenceStoreId(String sequenceStoreId) {
        this.sequenceStoreId = sequenceStoreId;
    }

    /**
     * <p>
     * The sequence store ID for the store involved in the multipart upload.
     * </p>
     * 
     * @return The sequence store ID for the store involved in the multipart upload.
     */

    public String getSequenceStoreId() {
        return this.sequenceStoreId;
    }

    /**
     * <p>
     * The sequence store ID for the store involved in the multipart upload.
     * </p>
     * 
     * @param sequenceStoreId
     *        The sequence store ID for the store involved in the multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMultipartReadSetUploadRequest withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
        return this;
    }

    /**
     * <p>
     * The ID for the multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The ID for the multipart upload.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The ID for the multipart upload.
     * </p>
     * 
     * @return The ID for the multipart upload.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The ID for the multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The ID for the multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMultipartReadSetUploadRequest withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The individual uploads or parts of a multipart upload.
     * </p>
     * 
     * @return The individual uploads or parts of a multipart upload.
     */

    public java.util.List<CompleteReadSetUploadPartListItem> getParts() {
        return parts;
    }

    /**
     * <p>
     * The individual uploads or parts of a multipart upload.
     * </p>
     * 
     * @param parts
     *        The individual uploads or parts of a multipart upload.
     */

    public void setParts(java.util.Collection<CompleteReadSetUploadPartListItem> parts) {
        if (parts == null) {
            this.parts = null;
            return;
        }

        this.parts = new java.util.ArrayList<CompleteReadSetUploadPartListItem>(parts);
    }

    /**
     * <p>
     * The individual uploads or parts of a multipart upload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParts(java.util.Collection)} or {@link #withParts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param parts
     *        The individual uploads or parts of a multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMultipartReadSetUploadRequest withParts(CompleteReadSetUploadPartListItem... parts) {
        if (this.parts == null) {
            setParts(new java.util.ArrayList<CompleteReadSetUploadPartListItem>(parts.length));
        }
        for (CompleteReadSetUploadPartListItem ele : parts) {
            this.parts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The individual uploads or parts of a multipart upload.
     * </p>
     * 
     * @param parts
     *        The individual uploads or parts of a multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMultipartReadSetUploadRequest withParts(java.util.Collection<CompleteReadSetUploadPartListItem> parts) {
        setParts(parts);
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
        if (getSequenceStoreId() != null)
            sb.append("SequenceStoreId: ").append(getSequenceStoreId()).append(",");
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getParts() != null)
            sb.append("Parts: ").append(getParts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteMultipartReadSetUploadRequest == false)
            return false;
        CompleteMultipartReadSetUploadRequest other = (CompleteMultipartReadSetUploadRequest) obj;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getParts() == null ^ this.getParts() == null)
            return false;
        if (other.getParts() != null && other.getParts().equals(this.getParts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getParts() == null) ? 0 : getParts().hashCode());
        return hashCode;
    }

    @Override
    public CompleteMultipartReadSetUploadRequest clone() {
        return (CompleteMultipartReadSetUploadRequest) super.clone();
    }

}
