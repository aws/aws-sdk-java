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
import com.amazonaws.auth.SignerTypeAware;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UploadReadSetPart" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadReadSetPartRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable, SignerTypeAware {

    /**
     * <p>
     * The Sequence Store ID used for the multipart upload.
     * </p>
     */
    private String sequenceStoreId;
    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * The source file for an upload part.
     * </p>
     */
    private String partSource;
    /**
     * <p>
     * The number of the part being uploaded.
     * </p>
     */
    private Integer partNumber;
    /**
     * <p>
     * The read set data to upload for a part.
     * </p>
     */
    private java.io.InputStream payload;

    /**
     * <p>
     * The Sequence Store ID used for the multipart upload.
     * </p>
     * 
     * @param sequenceStoreId
     *        The Sequence Store ID used for the multipart upload.
     */

    public void setSequenceStoreId(String sequenceStoreId) {
        this.sequenceStoreId = sequenceStoreId;
    }

    /**
     * <p>
     * The Sequence Store ID used for the multipart upload.
     * </p>
     * 
     * @return The Sequence Store ID used for the multipart upload.
     */

    public String getSequenceStoreId() {
        return this.sequenceStoreId;
    }

    /**
     * <p>
     * The Sequence Store ID used for the multipart upload.
     * </p>
     * 
     * @param sequenceStoreId
     *        The Sequence Store ID used for the multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadReadSetPartRequest withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
        return this;
    }

    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The ID for the initiated multipart upload.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     * 
     * @return The ID for the initiated multipart upload.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The ID for the initiated multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadReadSetPartRequest withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The source file for an upload part.
     * </p>
     * 
     * @param partSource
     *        The source file for an upload part.
     * @see ReadSetPartSource
     */

    public void setPartSource(String partSource) {
        this.partSource = partSource;
    }

    /**
     * <p>
     * The source file for an upload part.
     * </p>
     * 
     * @return The source file for an upload part.
     * @see ReadSetPartSource
     */

    public String getPartSource() {
        return this.partSource;
    }

    /**
     * <p>
     * The source file for an upload part.
     * </p>
     * 
     * @param partSource
     *        The source file for an upload part.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetPartSource
     */

    public UploadReadSetPartRequest withPartSource(String partSource) {
        setPartSource(partSource);
        return this;
    }

    /**
     * <p>
     * The source file for an upload part.
     * </p>
     * 
     * @param partSource
     *        The source file for an upload part.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetPartSource
     */

    public UploadReadSetPartRequest withPartSource(ReadSetPartSource partSource) {
        this.partSource = partSource.toString();
        return this;
    }

    /**
     * <p>
     * The number of the part being uploaded.
     * </p>
     * 
     * @param partNumber
     *        The number of the part being uploaded.
     */

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * <p>
     * The number of the part being uploaded.
     * </p>
     * 
     * @return The number of the part being uploaded.
     */

    public Integer getPartNumber() {
        return this.partNumber;
    }

    /**
     * <p>
     * The number of the part being uploaded.
     * </p>
     * 
     * @param partNumber
     *        The number of the part being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadReadSetPartRequest withPartNumber(Integer partNumber) {
        setPartNumber(partNumber);
        return this;
    }

    /**
     * <p>
     * The read set data to upload for a part.
     * </p>
     * 
     * @param payload
     *        The read set data to upload for a part.
     */

    public void setPayload(java.io.InputStream payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The read set data to upload for a part.
     * </p>
     * 
     * @return The read set data to upload for a part.
     */

    public java.io.InputStream getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The read set data to upload for a part.
     * </p>
     * 
     * @param payload
     *        The read set data to upload for a part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadReadSetPartRequest withPayload(java.io.InputStream payload) {
        setPayload(payload);
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
        if (getPartSource() != null)
            sb.append("PartSource: ").append(getPartSource()).append(",");
        if (getPartNumber() != null)
            sb.append("PartNumber: ").append(getPartNumber()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadReadSetPartRequest == false)
            return false;
        UploadReadSetPartRequest other = (UploadReadSetPartRequest) obj;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getPartSource() == null ^ this.getPartSource() == null)
            return false;
        if (other.getPartSource() != null && other.getPartSource().equals(this.getPartSource()) == false)
            return false;
        if (other.getPartNumber() == null ^ this.getPartNumber() == null)
            return false;
        if (other.getPartNumber() != null && other.getPartNumber().equals(this.getPartNumber()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getPartSource() == null) ? 0 : getPartSource().hashCode());
        hashCode = prime * hashCode + ((getPartNumber() == null) ? 0 : getPartNumber().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public UploadReadSetPartRequest clone() {
        return (UploadReadSetPartRequest) super.clone();
    }

    @Override
    public String getSignerType() {
        return "AWS4UnsignedPayloadSignerType";
    }

}
