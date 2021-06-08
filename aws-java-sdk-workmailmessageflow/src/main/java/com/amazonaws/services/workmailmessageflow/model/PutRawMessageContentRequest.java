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
package com.amazonaws.services.workmailmessageflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmailmessageflow-2019-05-01/PutRawMessageContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRawMessageContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the email message being updated.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * Describes the raw message content of the updated email message.
     * </p>
     */
    private RawMessageContent content;

    /**
     * <p>
     * The identifier of the email message being updated.
     * </p>
     * 
     * @param messageId
     *        The identifier of the email message being updated.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The identifier of the email message being updated.
     * </p>
     * 
     * @return The identifier of the email message being updated.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The identifier of the email message being updated.
     * </p>
     * 
     * @param messageId
     *        The identifier of the email message being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRawMessageContentRequest withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * Describes the raw message content of the updated email message.
     * </p>
     * 
     * @param content
     *        Describes the raw message content of the updated email message.
     */

    public void setContent(RawMessageContent content) {
        this.content = content;
    }

    /**
     * <p>
     * Describes the raw message content of the updated email message.
     * </p>
     * 
     * @return Describes the raw message content of the updated email message.
     */

    public RawMessageContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * Describes the raw message content of the updated email message.
     * </p>
     * 
     * @param content
     *        Describes the raw message content of the updated email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRawMessageContentRequest withContent(RawMessageContent content) {
        setContent(content);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRawMessageContentRequest == false)
            return false;
        PutRawMessageContentRequest other = (PutRawMessageContentRequest) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public PutRawMessageContentRequest clone() {
        return (PutRawMessageContentRequest) super.clone();
    }

}
