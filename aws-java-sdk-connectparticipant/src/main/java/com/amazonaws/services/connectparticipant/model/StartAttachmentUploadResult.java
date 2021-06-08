/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/StartAttachmentUpload"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAttachmentUploadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the attachment.
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * Fields to be used while uploading the attachment.
     * </p>
     */
    private UploadMetadata uploadMetadata;

    /**
     * <p>
     * A unique identifier for the attachment.
     * </p>
     * 
     * @param attachmentId
     *        A unique identifier for the attachment.
     */

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * A unique identifier for the attachment.
     * </p>
     * 
     * @return A unique identifier for the attachment.
     */

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * <p>
     * A unique identifier for the attachment.
     * </p>
     * 
     * @param attachmentId
     *        A unique identifier for the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachmentUploadResult withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
        return this;
    }

    /**
     * <p>
     * Fields to be used while uploading the attachment.
     * </p>
     * 
     * @param uploadMetadata
     *        Fields to be used while uploading the attachment.
     */

    public void setUploadMetadata(UploadMetadata uploadMetadata) {
        this.uploadMetadata = uploadMetadata;
    }

    /**
     * <p>
     * Fields to be used while uploading the attachment.
     * </p>
     * 
     * @return Fields to be used while uploading the attachment.
     */

    public UploadMetadata getUploadMetadata() {
        return this.uploadMetadata;
    }

    /**
     * <p>
     * Fields to be used while uploading the attachment.
     * </p>
     * 
     * @param uploadMetadata
     *        Fields to be used while uploading the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachmentUploadResult withUploadMetadata(UploadMetadata uploadMetadata) {
        setUploadMetadata(uploadMetadata);
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
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
        if (getUploadMetadata() != null)
            sb.append("UploadMetadata: ").append(getUploadMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAttachmentUploadResult == false)
            return false;
        StartAttachmentUploadResult other = (StartAttachmentUploadResult) obj;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getUploadMetadata() == null ^ this.getUploadMetadata() == null)
            return false;
        if (other.getUploadMetadata() != null && other.getUploadMetadata().equals(this.getUploadMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getUploadMetadata() == null) ? 0 : getUploadMetadata().hashCode());
        return hashCode;
    }

    @Override
    public StartAttachmentUploadResult clone() {
        try {
            return (StartAttachmentUploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
