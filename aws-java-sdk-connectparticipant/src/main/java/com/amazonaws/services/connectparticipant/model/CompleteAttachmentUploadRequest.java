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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CompleteAttachmentUpload"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteAttachmentUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of unique identifiers for the attachments.
     * </p>
     */
    private java.util.List<String> attachmentIds;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
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
     * A list of unique identifiers for the attachments.
     * </p>
     * 
     * @return A list of unique identifiers for the attachments.
     */

    public java.util.List<String> getAttachmentIds() {
        return attachmentIds;
    }

    /**
     * <p>
     * A list of unique identifiers for the attachments.
     * </p>
     * 
     * @param attachmentIds
     *        A list of unique identifiers for the attachments.
     */

    public void setAttachmentIds(java.util.Collection<String> attachmentIds) {
        if (attachmentIds == null) {
            this.attachmentIds = null;
            return;
        }

        this.attachmentIds = new java.util.ArrayList<String>(attachmentIds);
    }

    /**
     * <p>
     * A list of unique identifiers for the attachments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachmentIds(java.util.Collection)} or {@link #withAttachmentIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attachmentIds
     *        A list of unique identifiers for the attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteAttachmentUploadRequest withAttachmentIds(String... attachmentIds) {
        if (this.attachmentIds == null) {
            setAttachmentIds(new java.util.ArrayList<String>(attachmentIds.length));
        }
        for (String ele : attachmentIds) {
            this.attachmentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of unique identifiers for the attachments.
     * </p>
     * 
     * @param attachmentIds
     *        A list of unique identifiers for the attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteAttachmentUploadRequest withAttachmentIds(java.util.Collection<String> attachmentIds) {
        setAttachmentIds(attachmentIds);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteAttachmentUploadRequest withClientToken(String clientToken) {
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

    public CompleteAttachmentUploadRequest withConnectionToken(String connectionToken) {
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
        if (getAttachmentIds() != null)
            sb.append("AttachmentIds: ").append(getAttachmentIds()).append(",");
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

        if (obj instanceof CompleteAttachmentUploadRequest == false)
            return false;
        CompleteAttachmentUploadRequest other = (CompleteAttachmentUploadRequest) obj;
        if (other.getAttachmentIds() == null ^ this.getAttachmentIds() == null)
            return false;
        if (other.getAttachmentIds() != null && other.getAttachmentIds().equals(this.getAttachmentIds()) == false)
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

        hashCode = prime * hashCode + ((getAttachmentIds() == null) ? 0 : getAttachmentIds().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConnectionToken() == null) ? 0 : getConnectionToken().hashCode());
        return hashCode;
    }

    @Override
    public CompleteAttachmentUploadRequest clone() {
        return (CompleteAttachmentUploadRequest) super.clone();
    }

}
