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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistrationAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRegistrationAttachmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The registration file to upload. The maximum file size is 1MiB and valid file extensions are PDF, JPEG and PNG.
     * </p>
     */
    private java.nio.ByteBuffer attachmentBody;
    /**
     * <p>
     * A URL to the required registration file. For example, you can provide the S3 object URL.
     * </p>
     */
    private String attachmentUrl;
    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the registration attachment.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The registration file to upload. The maximum file size is 1MiB and valid file extensions are PDF, JPEG and PNG.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param attachmentBody
     *        The registration file to upload. The maximum file size is 1MiB and valid file extensions are PDF, JPEG and
     *        PNG.
     */

    public void setAttachmentBody(java.nio.ByteBuffer attachmentBody) {
        this.attachmentBody = attachmentBody;
    }

    /**
     * <p>
     * The registration file to upload. The maximum file size is 1MiB and valid file extensions are PDF, JPEG and PNG.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The registration file to upload. The maximum file size is 1MiB and valid file extensions are PDF, JPEG
     *         and PNG.
     */

    public java.nio.ByteBuffer getAttachmentBody() {
        return this.attachmentBody;
    }

    /**
     * <p>
     * The registration file to upload. The maximum file size is 1MiB and valid file extensions are PDF, JPEG and PNG.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param attachmentBody
     *        The registration file to upload. The maximum file size is 1MiB and valid file extensions are PDF, JPEG and
     *        PNG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAttachmentRequest withAttachmentBody(java.nio.ByteBuffer attachmentBody) {
        setAttachmentBody(attachmentBody);
        return this;
    }

    /**
     * <p>
     * A URL to the required registration file. For example, you can provide the S3 object URL.
     * </p>
     * 
     * @param attachmentUrl
     *        A URL to the required registration file. For example, you can provide the S3 object URL.
     */

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    /**
     * <p>
     * A URL to the required registration file. For example, you can provide the S3 object URL.
     * </p>
     * 
     * @return A URL to the required registration file. For example, you can provide the S3 object URL.
     */

    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    /**
     * <p>
     * A URL to the required registration file. For example, you can provide the S3 object URL.
     * </p>
     * 
     * @param attachmentUrl
     *        A URL to the required registration file. For example, you can provide the S3 object URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAttachmentRequest withAttachmentUrl(String attachmentUrl) {
        setAttachmentUrl(attachmentUrl);
        return this;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the registration attachment.
     * </p>
     * 
     * @return An array of tags (key and value pairs) to associate with the registration attachment.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the registration attachment.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) to associate with the registration attachment.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the registration attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) to associate with the registration attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAttachmentRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the registration attachment.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) to associate with the registration attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAttachmentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *        specify a client token, a randomly generated token is used for the request to ensure idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *         specify a client token, a randomly generated token is used for the request to ensure idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *        specify a client token, a randomly generated token is used for the request to ensure idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationAttachmentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getAttachmentBody() != null)
            sb.append("AttachmentBody: ").append(getAttachmentBody()).append(",");
        if (getAttachmentUrl() != null)
            sb.append("AttachmentUrl: ").append(getAttachmentUrl()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRegistrationAttachmentRequest == false)
            return false;
        CreateRegistrationAttachmentRequest other = (CreateRegistrationAttachmentRequest) obj;
        if (other.getAttachmentBody() == null ^ this.getAttachmentBody() == null)
            return false;
        if (other.getAttachmentBody() != null && other.getAttachmentBody().equals(this.getAttachmentBody()) == false)
            return false;
        if (other.getAttachmentUrl() == null ^ this.getAttachmentUrl() == null)
            return false;
        if (other.getAttachmentUrl() != null && other.getAttachmentUrl().equals(this.getAttachmentUrl()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentBody() == null) ? 0 : getAttachmentBody().hashCode());
        hashCode = prime * hashCode + ((getAttachmentUrl() == null) ? 0 : getAttachmentUrl().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateRegistrationAttachmentRequest clone() {
        return (CreateRegistrationAttachmentRequest) super.clone();
    }

}
