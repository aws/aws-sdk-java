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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ChatSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChatSyncResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business conversation.
     * </p>
     */
    private String conversationId;
    /**
     * <p>
     * An AI-generated message in a conversation.
     * </p>
     */
    private String systemMessage;
    /**
     * <p>
     * The identifier of an Amazon Q Business AI generated message within the conversation.
     * </p>
     */
    private String systemMessageId;
    /**
     * <p>
     * The identifier of an Amazon Q Business end user text input message within the conversation.
     * </p>
     */
    private String userMessageId;
    /**
     * <p>
     * A request from Amazon Q Business to the end user for information Amazon Q Business needs to successfully complete
     * a requested plugin action.
     * </p>
     */
    private ActionReview actionReview;
    /**
     * <p>
     * An authentication verification event activated by an end user request to use a custom plugin.
     * </p>
     */
    private AuthChallengeRequest authChallengeRequest;
    /**
     * <p>
     * The source documents used to generate the conversation response.
     * </p>
     */
    private java.util.List<SourceAttribution> sourceAttributions;
    /**
     * <p>
     * A list of files which failed to upload during chat.
     * </p>
     */
    private java.util.List<AttachmentOutput> failedAttachments;

    /**
     * <p>
     * The identifier of the Amazon Q Business conversation.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the Amazon Q Business conversation.
     */

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business conversation.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business conversation.
     */

    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business conversation.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the Amazon Q Business conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncResult withConversationId(String conversationId) {
        setConversationId(conversationId);
        return this;
    }

    /**
     * <p>
     * An AI-generated message in a conversation.
     * </p>
     * 
     * @param systemMessage
     *        An AI-generated message in a conversation.
     */

    public void setSystemMessage(String systemMessage) {
        this.systemMessage = systemMessage;
    }

    /**
     * <p>
     * An AI-generated message in a conversation.
     * </p>
     * 
     * @return An AI-generated message in a conversation.
     */

    public String getSystemMessage() {
        return this.systemMessage;
    }

    /**
     * <p>
     * An AI-generated message in a conversation.
     * </p>
     * 
     * @param systemMessage
     *        An AI-generated message in a conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncResult withSystemMessage(String systemMessage) {
        setSystemMessage(systemMessage);
        return this;
    }

    /**
     * <p>
     * The identifier of an Amazon Q Business AI generated message within the conversation.
     * </p>
     * 
     * @param systemMessageId
     *        The identifier of an Amazon Q Business AI generated message within the conversation.
     */

    public void setSystemMessageId(String systemMessageId) {
        this.systemMessageId = systemMessageId;
    }

    /**
     * <p>
     * The identifier of an Amazon Q Business AI generated message within the conversation.
     * </p>
     * 
     * @return The identifier of an Amazon Q Business AI generated message within the conversation.
     */

    public String getSystemMessageId() {
        return this.systemMessageId;
    }

    /**
     * <p>
     * The identifier of an Amazon Q Business AI generated message within the conversation.
     * </p>
     * 
     * @param systemMessageId
     *        The identifier of an Amazon Q Business AI generated message within the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncResult withSystemMessageId(String systemMessageId) {
        setSystemMessageId(systemMessageId);
        return this;
    }

    /**
     * <p>
     * The identifier of an Amazon Q Business end user text input message within the conversation.
     * </p>
     * 
     * @param userMessageId
     *        The identifier of an Amazon Q Business end user text input message within the conversation.
     */

    public void setUserMessageId(String userMessageId) {
        this.userMessageId = userMessageId;
    }

    /**
     * <p>
     * The identifier of an Amazon Q Business end user text input message within the conversation.
     * </p>
     * 
     * @return The identifier of an Amazon Q Business end user text input message within the conversation.
     */

    public String getUserMessageId() {
        return this.userMessageId;
    }

    /**
     * <p>
     * The identifier of an Amazon Q Business end user text input message within the conversation.
     * </p>
     * 
     * @param userMessageId
     *        The identifier of an Amazon Q Business end user text input message within the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncResult withUserMessageId(String userMessageId) {
        setUserMessageId(userMessageId);
        return this;
    }

    /**
     * <p>
     * A request from Amazon Q Business to the end user for information Amazon Q Business needs to successfully complete
     * a requested plugin action.
     * </p>
     * 
     * @param actionReview
     *        A request from Amazon Q Business to the end user for information Amazon Q Business needs to successfully
     *        complete a requested plugin action.
     */

    public void setActionReview(ActionReview actionReview) {
        this.actionReview = actionReview;
    }

    /**
     * <p>
     * A request from Amazon Q Business to the end user for information Amazon Q Business needs to successfully complete
     * a requested plugin action.
     * </p>
     * 
     * @return A request from Amazon Q Business to the end user for information Amazon Q Business needs to successfully
     *         complete a requested plugin action.
     */

    public ActionReview getActionReview() {
        return this.actionReview;
    }

    /**
     * <p>
     * A request from Amazon Q Business to the end user for information Amazon Q Business needs to successfully complete
     * a requested plugin action.
     * </p>
     * 
     * @param actionReview
     *        A request from Amazon Q Business to the end user for information Amazon Q Business needs to successfully
     *        complete a requested plugin action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncResult withActionReview(ActionReview actionReview) {
        setActionReview(actionReview);
        return this;
    }

    /**
     * <p>
     * An authentication verification event activated by an end user request to use a custom plugin.
     * </p>
     * 
     * @param authChallengeRequest
     *        An authentication verification event activated by an end user request to use a custom plugin.
     */

    public void setAuthChallengeRequest(AuthChallengeRequest authChallengeRequest) {
        this.authChallengeRequest = authChallengeRequest;
    }

    /**
     * <p>
     * An authentication verification event activated by an end user request to use a custom plugin.
     * </p>
     * 
     * @return An authentication verification event activated by an end user request to use a custom plugin.
     */

    public AuthChallengeRequest getAuthChallengeRequest() {
        return this.authChallengeRequest;
    }

    /**
     * <p>
     * An authentication verification event activated by an end user request to use a custom plugin.
     * </p>
     * 
     * @param authChallengeRequest
     *        An authentication verification event activated by an end user request to use a custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncResult withAuthChallengeRequest(AuthChallengeRequest authChallengeRequest) {
        setAuthChallengeRequest(authChallengeRequest);
        return this;
    }

    /**
     * <p>
     * The source documents used to generate the conversation response.
     * </p>
     * 
     * @return The source documents used to generate the conversation response.
     */

    public java.util.List<SourceAttribution> getSourceAttributions() {
        return sourceAttributions;
    }

    /**
     * <p>
     * The source documents used to generate the conversation response.
     * </p>
     * 
     * @param sourceAttributions
     *        The source documents used to generate the conversation response.
     */

    public void setSourceAttributions(java.util.Collection<SourceAttribution> sourceAttributions) {
        if (sourceAttributions == null) {
            this.sourceAttributions = null;
            return;
        }

        this.sourceAttributions = new java.util.ArrayList<SourceAttribution>(sourceAttributions);
    }

    /**
     * <p>
     * The source documents used to generate the conversation response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceAttributions(java.util.Collection)} or {@link #withSourceAttributions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param sourceAttributions
     *        The source documents used to generate the conversation response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncResult withSourceAttributions(SourceAttribution... sourceAttributions) {
        if (this.sourceAttributions == null) {
            setSourceAttributions(new java.util.ArrayList<SourceAttribution>(sourceAttributions.length));
        }
        for (SourceAttribution ele : sourceAttributions) {
            this.sourceAttributions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source documents used to generate the conversation response.
     * </p>
     * 
     * @param sourceAttributions
     *        The source documents used to generate the conversation response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncResult withSourceAttributions(java.util.Collection<SourceAttribution> sourceAttributions) {
        setSourceAttributions(sourceAttributions);
        return this;
    }

    /**
     * <p>
     * A list of files which failed to upload during chat.
     * </p>
     * 
     * @return A list of files which failed to upload during chat.
     */

    public java.util.List<AttachmentOutput> getFailedAttachments() {
        return failedAttachments;
    }

    /**
     * <p>
     * A list of files which failed to upload during chat.
     * </p>
     * 
     * @param failedAttachments
     *        A list of files which failed to upload during chat.
     */

    public void setFailedAttachments(java.util.Collection<AttachmentOutput> failedAttachments) {
        if (failedAttachments == null) {
            this.failedAttachments = null;
            return;
        }

        this.failedAttachments = new java.util.ArrayList<AttachmentOutput>(failedAttachments);
    }

    /**
     * <p>
     * A list of files which failed to upload during chat.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedAttachments(java.util.Collection)} or {@link #withFailedAttachments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param failedAttachments
     *        A list of files which failed to upload during chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncResult withFailedAttachments(AttachmentOutput... failedAttachments) {
        if (this.failedAttachments == null) {
            setFailedAttachments(new java.util.ArrayList<AttachmentOutput>(failedAttachments.length));
        }
        for (AttachmentOutput ele : failedAttachments) {
            this.failedAttachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of files which failed to upload during chat.
     * </p>
     * 
     * @param failedAttachments
     *        A list of files which failed to upload during chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncResult withFailedAttachments(java.util.Collection<AttachmentOutput> failedAttachments) {
        setFailedAttachments(failedAttachments);
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
        if (getConversationId() != null)
            sb.append("ConversationId: ").append(getConversationId()).append(",");
        if (getSystemMessage() != null)
            sb.append("SystemMessage: ").append(getSystemMessage()).append(",");
        if (getSystemMessageId() != null)
            sb.append("SystemMessageId: ").append(getSystemMessageId()).append(",");
        if (getUserMessageId() != null)
            sb.append("UserMessageId: ").append(getUserMessageId()).append(",");
        if (getActionReview() != null)
            sb.append("ActionReview: ").append(getActionReview()).append(",");
        if (getAuthChallengeRequest() != null)
            sb.append("AuthChallengeRequest: ").append(getAuthChallengeRequest()).append(",");
        if (getSourceAttributions() != null)
            sb.append("SourceAttributions: ").append(getSourceAttributions()).append(",");
        if (getFailedAttachments() != null)
            sb.append("FailedAttachments: ").append(getFailedAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChatSyncResult == false)
            return false;
        ChatSyncResult other = (ChatSyncResult) obj;
        if (other.getConversationId() == null ^ this.getConversationId() == null)
            return false;
        if (other.getConversationId() != null && other.getConversationId().equals(this.getConversationId()) == false)
            return false;
        if (other.getSystemMessage() == null ^ this.getSystemMessage() == null)
            return false;
        if (other.getSystemMessage() != null && other.getSystemMessage().equals(this.getSystemMessage()) == false)
            return false;
        if (other.getSystemMessageId() == null ^ this.getSystemMessageId() == null)
            return false;
        if (other.getSystemMessageId() != null && other.getSystemMessageId().equals(this.getSystemMessageId()) == false)
            return false;
        if (other.getUserMessageId() == null ^ this.getUserMessageId() == null)
            return false;
        if (other.getUserMessageId() != null && other.getUserMessageId().equals(this.getUserMessageId()) == false)
            return false;
        if (other.getActionReview() == null ^ this.getActionReview() == null)
            return false;
        if (other.getActionReview() != null && other.getActionReview().equals(this.getActionReview()) == false)
            return false;
        if (other.getAuthChallengeRequest() == null ^ this.getAuthChallengeRequest() == null)
            return false;
        if (other.getAuthChallengeRequest() != null && other.getAuthChallengeRequest().equals(this.getAuthChallengeRequest()) == false)
            return false;
        if (other.getSourceAttributions() == null ^ this.getSourceAttributions() == null)
            return false;
        if (other.getSourceAttributions() != null && other.getSourceAttributions().equals(this.getSourceAttributions()) == false)
            return false;
        if (other.getFailedAttachments() == null ^ this.getFailedAttachments() == null)
            return false;
        if (other.getFailedAttachments() != null && other.getFailedAttachments().equals(this.getFailedAttachments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConversationId() == null) ? 0 : getConversationId().hashCode());
        hashCode = prime * hashCode + ((getSystemMessage() == null) ? 0 : getSystemMessage().hashCode());
        hashCode = prime * hashCode + ((getSystemMessageId() == null) ? 0 : getSystemMessageId().hashCode());
        hashCode = prime * hashCode + ((getUserMessageId() == null) ? 0 : getUserMessageId().hashCode());
        hashCode = prime * hashCode + ((getActionReview() == null) ? 0 : getActionReview().hashCode());
        hashCode = prime * hashCode + ((getAuthChallengeRequest() == null) ? 0 : getAuthChallengeRequest().hashCode());
        hashCode = prime * hashCode + ((getSourceAttributions() == null) ? 0 : getSourceAttributions().hashCode());
        hashCode = prime * hashCode + ((getFailedAttachments() == null) ? 0 : getFailedAttachments().hashCode());
        return hashCode;
    }

    @Override
    public ChatSyncResult clone() {
        try {
            return (ChatSyncResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
