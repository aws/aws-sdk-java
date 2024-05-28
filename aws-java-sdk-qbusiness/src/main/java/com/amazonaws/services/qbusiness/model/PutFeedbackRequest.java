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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PutFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application associated with the feedback.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the user giving the feedback.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The identifier of the conversation the feedback is attached to.
     * </p>
     */
    private String conversationId;
    /**
     * <p>
     * The identifier of the chat message that the feedback was given for.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The timestamp for when the feedback was recorded.
     * </p>
     */
    private java.util.Date messageCopiedAt;
    /**
     * <p>
     * The feedback usefulness value given by the user to the chat message.
     * </p>
     */
    private MessageUsefulnessFeedback messageUsefulness;

    /**
     * <p>
     * The identifier of the application associated with the feedback.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application associated with the feedback.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application associated with the feedback.
     * </p>
     * 
     * @return The identifier of the application associated with the feedback.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application associated with the feedback.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application associated with the feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user giving the feedback.
     * </p>
     * 
     * @param userId
     *        The identifier of the user giving the feedback.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user giving the feedback.
     * </p>
     * 
     * @return The identifier of the user giving the feedback.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier of the user giving the feedback.
     * </p>
     * 
     * @param userId
     *        The identifier of the user giving the feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The identifier of the conversation the feedback is attached to.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the conversation the feedback is attached to.
     */

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * <p>
     * The identifier of the conversation the feedback is attached to.
     * </p>
     * 
     * @return The identifier of the conversation the feedback is attached to.
     */

    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * <p>
     * The identifier of the conversation the feedback is attached to.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the conversation the feedback is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackRequest withConversationId(String conversationId) {
        setConversationId(conversationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the chat message that the feedback was given for.
     * </p>
     * 
     * @param messageId
     *        The identifier of the chat message that the feedback was given for.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The identifier of the chat message that the feedback was given for.
     * </p>
     * 
     * @return The identifier of the chat message that the feedback was given for.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The identifier of the chat message that the feedback was given for.
     * </p>
     * 
     * @param messageId
     *        The identifier of the chat message that the feedback was given for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackRequest withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the feedback was recorded.
     * </p>
     * 
     * @param messageCopiedAt
     *        The timestamp for when the feedback was recorded.
     */

    public void setMessageCopiedAt(java.util.Date messageCopiedAt) {
        this.messageCopiedAt = messageCopiedAt;
    }

    /**
     * <p>
     * The timestamp for when the feedback was recorded.
     * </p>
     * 
     * @return The timestamp for when the feedback was recorded.
     */

    public java.util.Date getMessageCopiedAt() {
        return this.messageCopiedAt;
    }

    /**
     * <p>
     * The timestamp for when the feedback was recorded.
     * </p>
     * 
     * @param messageCopiedAt
     *        The timestamp for when the feedback was recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackRequest withMessageCopiedAt(java.util.Date messageCopiedAt) {
        setMessageCopiedAt(messageCopiedAt);
        return this;
    }

    /**
     * <p>
     * The feedback usefulness value given by the user to the chat message.
     * </p>
     * 
     * @param messageUsefulness
     *        The feedback usefulness value given by the user to the chat message.
     */

    public void setMessageUsefulness(MessageUsefulnessFeedback messageUsefulness) {
        this.messageUsefulness = messageUsefulness;
    }

    /**
     * <p>
     * The feedback usefulness value given by the user to the chat message.
     * </p>
     * 
     * @return The feedback usefulness value given by the user to the chat message.
     */

    public MessageUsefulnessFeedback getMessageUsefulness() {
        return this.messageUsefulness;
    }

    /**
     * <p>
     * The feedback usefulness value given by the user to the chat message.
     * </p>
     * 
     * @param messageUsefulness
     *        The feedback usefulness value given by the user to the chat message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackRequest withMessageUsefulness(MessageUsefulnessFeedback messageUsefulness) {
        setMessageUsefulness(messageUsefulness);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getConversationId() != null)
            sb.append("ConversationId: ").append(getConversationId()).append(",");
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getMessageCopiedAt() != null)
            sb.append("MessageCopiedAt: ").append(getMessageCopiedAt()).append(",");
        if (getMessageUsefulness() != null)
            sb.append("MessageUsefulness: ").append(getMessageUsefulness());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFeedbackRequest == false)
            return false;
        PutFeedbackRequest other = (PutFeedbackRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getConversationId() == null ^ this.getConversationId() == null)
            return false;
        if (other.getConversationId() != null && other.getConversationId().equals(this.getConversationId()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getMessageCopiedAt() == null ^ this.getMessageCopiedAt() == null)
            return false;
        if (other.getMessageCopiedAt() != null && other.getMessageCopiedAt().equals(this.getMessageCopiedAt()) == false)
            return false;
        if (other.getMessageUsefulness() == null ^ this.getMessageUsefulness() == null)
            return false;
        if (other.getMessageUsefulness() != null && other.getMessageUsefulness().equals(this.getMessageUsefulness()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getConversationId() == null) ? 0 : getConversationId().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getMessageCopiedAt() == null) ? 0 : getMessageCopiedAt().hashCode());
        hashCode = prime * hashCode + ((getMessageUsefulness() == null) ? 0 : getMessageUsefulness().hashCode());
        return hashCode;
    }

    @Override
    public PutFeedbackRequest clone() {
        return (PutFeedbackRequest) super.clone();
    }

}
