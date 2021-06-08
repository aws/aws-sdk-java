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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetAttachment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAttachmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the attachment.
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     */
    private String connectionToken;

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

    public GetAttachmentRequest withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
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

    public GetAttachmentRequest withConnectionToken(String connectionToken) {
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
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
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

        if (obj instanceof GetAttachmentRequest == false)
            return false;
        GetAttachmentRequest other = (GetAttachmentRequest) obj;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
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

        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getConnectionToken() == null) ? 0 : getConnectionToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAttachmentRequest clone() {
        return (GetAttachmentRequest) super.clone();
    }

}
