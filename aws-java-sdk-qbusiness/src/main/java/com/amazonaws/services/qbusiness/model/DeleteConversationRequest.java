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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteConversation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConversationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience conversation being deleted.
     * </p>
     */
    private String conversationId;
    /**
     * <p>
     * The identifier of the Amazon Q Business application associated with the conversation.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the user who is deleting the conversation.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience conversation being deleted.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the Amazon Q Business web experience conversation being deleted.
     */

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience conversation being deleted.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business web experience conversation being deleted.
     */

    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience conversation being deleted.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the Amazon Q Business web experience conversation being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConversationRequest withConversationId(String conversationId) {
        setConversationId(conversationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application associated with the conversation.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application associated with the conversation.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application associated with the conversation.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application associated with the conversation.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application associated with the conversation.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application associated with the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConversationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user who is deleting the conversation.
     * </p>
     * 
     * @param userId
     *        The identifier of the user who is deleting the conversation.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user who is deleting the conversation.
     * </p>
     * 
     * @return The identifier of the user who is deleting the conversation.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier of the user who is deleting the conversation.
     * </p>
     * 
     * @param userId
     *        The identifier of the user who is deleting the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConversationRequest withUserId(String userId) {
        setUserId(userId);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConversationRequest == false)
            return false;
        DeleteConversationRequest other = (DeleteConversationRequest) obj;
        if (other.getConversationId() == null ^ this.getConversationId() == null)
            return false;
        if (other.getConversationId() != null && other.getConversationId().equals(this.getConversationId()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConversationId() == null) ? 0 : getConversationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConversationRequest clone() {
        return (DeleteConversationRequest) super.clone();
    }

}
