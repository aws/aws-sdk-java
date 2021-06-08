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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The case-insensitive input to indicate standard MIME type that describes the format of the file that will be
 * uploaded.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/AttachmentItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachmentItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the MIME file type of the attachment. For a list of supported file types, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * A unique identifier for the attachment.
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * A case-sensitive name of the attachment being uploaded.
     * </p>
     */
    private String attachmentName;
    /**
     * <p>
     * Status of the attachment.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Describes the MIME file type of the attachment. For a list of supported file types, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param contentType
     *        Describes the MIME file type of the attachment. For a list of supported file types, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     *        >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Describes the MIME file type of the attachment. For a list of supported file types, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return Describes the MIME file type of the attachment. For a list of supported file types, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     *         >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Describes the MIME file type of the attachment. For a list of supported file types, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param contentType
     *        Describes the MIME file type of the attachment. For a list of supported file types, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     *        >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentItem withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

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

    public AttachmentItem withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
        return this;
    }

    /**
     * <p>
     * A case-sensitive name of the attachment being uploaded.
     * </p>
     * 
     * @param attachmentName
     *        A case-sensitive name of the attachment being uploaded.
     */

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    /**
     * <p>
     * A case-sensitive name of the attachment being uploaded.
     * </p>
     * 
     * @return A case-sensitive name of the attachment being uploaded.
     */

    public String getAttachmentName() {
        return this.attachmentName;
    }

    /**
     * <p>
     * A case-sensitive name of the attachment being uploaded.
     * </p>
     * 
     * @param attachmentName
     *        A case-sensitive name of the attachment being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentItem withAttachmentName(String attachmentName) {
        setAttachmentName(attachmentName);
        return this;
    }

    /**
     * <p>
     * Status of the attachment.
     * </p>
     * 
     * @param status
     *        Status of the attachment.
     * @see ArtifactStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the attachment.
     * </p>
     * 
     * @return Status of the attachment.
     * @see ArtifactStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the attachment.
     * </p>
     * 
     * @param status
     *        Status of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactStatus
     */

    public AttachmentItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the attachment.
     * </p>
     * 
     * @param status
     *        Status of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactStatus
     */

    public AttachmentItem withStatus(ArtifactStatus status) {
        this.status = status.toString();
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
        if (getAttachmentName() != null)
            sb.append("AttachmentName: ").append(getAttachmentName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentItem == false)
            return false;
        AttachmentItem other = (AttachmentItem) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getAttachmentName() == null ^ this.getAttachmentName() == null)
            return false;
        if (other.getAttachmentName() != null && other.getAttachmentName().equals(this.getAttachmentName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getAttachmentName() == null) ? 0 : getAttachmentName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AttachmentItem clone() {
        try {
            return (AttachmentItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectparticipant.model.transform.AttachmentItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
