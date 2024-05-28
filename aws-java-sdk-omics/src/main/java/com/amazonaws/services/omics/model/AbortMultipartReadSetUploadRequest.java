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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/AbortMultipartReadSetUpload" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbortMultipartReadSetUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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

    public AbortMultipartReadSetUploadRequest withSequenceStoreId(String sequenceStoreId) {
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

    public AbortMultipartReadSetUploadRequest withUploadId(String uploadId) {
        setUploadId(uploadId);
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
            sb.append("UploadId: ").append(getUploadId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbortMultipartReadSetUploadRequest == false)
            return false;
        AbortMultipartReadSetUploadRequest other = (AbortMultipartReadSetUploadRequest) obj;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        return hashCode;
    }

    @Override
    public AbortMultipartReadSetUploadRequest clone() {
        return (AbortMultipartReadSetUploadRequest) super.clone();
    }

}
