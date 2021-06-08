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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/StartAttachmentUpload"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAttachmentUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The size of the attachment in bytes.
     * </p>
     */
    private Long attachmentSizeInBytes;
    /**
     * <p>
     * A case-sensitive name of the attachment being uploaded.
     * </p>
     */
    private String attachmentName;
    /**
     * <p>
     * A unique case sensitive identifier to support idempotency of request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     */
    private String connectionToken;

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

    public StartAttachmentUploadRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The size of the attachment in bytes.
     * </p>
     * 
     * @param attachmentSizeInBytes
     *        The size of the attachment in bytes.
     */

    public void setAttachmentSizeInBytes(Long attachmentSizeInBytes) {
        this.attachmentSizeInBytes = attachmentSizeInBytes;
    }

    /**
     * <p>
     * The size of the attachment in bytes.
     * </p>
     * 
     * @return The size of the attachment in bytes.
     */

    public Long getAttachmentSizeInBytes() {
        return this.attachmentSizeInBytes;
    }

    /**
     * <p>
     * The size of the attachment in bytes.
     * </p>
     * 
     * @param attachmentSizeInBytes
     *        The size of the attachment in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachmentUploadRequest withAttachmentSizeInBytes(Long attachmentSizeInBytes) {
        setAttachmentSizeInBytes(attachmentSizeInBytes);
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

    public StartAttachmentUploadRequest withAttachmentName(String attachmentName) {
        setAttachmentName(attachmentName);
        return this;
    }

    /**
     * <p>
     * A unique case sensitive identifier to support idempotency of request.
     * </p>
     * 
     * @param clientToken
     *        A unique case sensitive identifier to support idempotency of request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case sensitive identifier to support idempotency of request.
     * </p>
     * 
     * @return A unique case sensitive identifier to support idempotency of request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case sensitive identifier to support idempotency of request.
     * </p>
     * 
     * @param clientToken
     *        A unique case sensitive identifier to support idempotency of request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachmentUploadRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * 
     * @param connectionToken
     *        The authentication token associated with the participant's connection.
     */

    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * 
     * @return The authentication token associated with the participant's connection.
     */

    public String getConnectionToken() {
        return this.connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * 
     * @param connectionToken
     *        The authentication token associated with the participant's connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachmentUploadRequest withConnectionToken(String connectionToken) {
        setConnectionToken(connectionToken);
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
        if (getAttachmentSizeInBytes() != null)
            sb.append("AttachmentSizeInBytes: ").append(getAttachmentSizeInBytes()).append(",");
        if (getAttachmentName() != null)
            sb.append("AttachmentName: ").append(getAttachmentName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConnectionToken() != null)
            sb.append("ConnectionToken: ").append(getConnectionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAttachmentUploadRequest == false)
            return false;
        StartAttachmentUploadRequest other = (StartAttachmentUploadRequest) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getAttachmentSizeInBytes() == null ^ this.getAttachmentSizeInBytes() == null)
            return false;
        if (other.getAttachmentSizeInBytes() != null && other.getAttachmentSizeInBytes().equals(this.getAttachmentSizeInBytes()) == false)
            return false;
        if (other.getAttachmentName() == null ^ this.getAttachmentName() == null)
            return false;
        if (other.getAttachmentName() != null && other.getAttachmentName().equals(this.getAttachmentName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConnectionToken() == null ^ this.getConnectionToken() == null)
            return false;
        if (other.getConnectionToken() != null && other.getConnectionToken().equals(this.getConnectionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getAttachmentSizeInBytes() == null) ? 0 : getAttachmentSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getAttachmentName() == null) ? 0 : getAttachmentName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConnectionToken() == null) ? 0 : getConnectionToken().hashCode());
        return hashCode;
    }

    @Override
    public StartAttachmentUploadRequest clone() {
        return (StartAttachmentUploadRequest) super.clone();
    }

}
