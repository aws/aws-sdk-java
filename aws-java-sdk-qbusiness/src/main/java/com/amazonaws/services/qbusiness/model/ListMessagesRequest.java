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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListMessages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMessagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience conversation.
     * </p>
     */
    private String conversationId;
    /**
     * <p>
     * The identifier for the Amazon Q Business application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the user involved in the Amazon Q Business web experience conversation.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * If the number of retrievers returned exceeds <code>maxResults</code>, Amazon Q Business returns a next token as a
     * pagination token to retrieve the next set of messages.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of messages to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience conversation.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the Amazon Q Business web experience conversation.
     */

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience conversation.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business web experience conversation.
     */

    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience conversation.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the Amazon Q Business web experience conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessagesRequest withConversationId(String conversationId) {
        setConversationId(conversationId);
        return this;
    }

    /**
     * <p>
     * The identifier for the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier for the Amazon Q Business application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier for the Amazon Q Business application.
     * </p>
     * 
     * @return The identifier for the Amazon Q Business application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier for the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier for the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessagesRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user involved in the Amazon Q Business web experience conversation.
     * </p>
     * 
     * @param userId
     *        The identifier of the user involved in the Amazon Q Business web experience conversation.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user involved in the Amazon Q Business web experience conversation.
     * </p>
     * 
     * @return The identifier of the user involved in the Amazon Q Business web experience conversation.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier of the user involved in the Amazon Q Business web experience conversation.
     * </p>
     * 
     * @param userId
     *        The identifier of the user involved in the Amazon Q Business web experience conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessagesRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * If the number of retrievers returned exceeds <code>maxResults</code>, Amazon Q Business returns a next token as a
     * pagination token to retrieve the next set of messages.
     * </p>
     * 
     * @param nextToken
     *        If the number of retrievers returned exceeds <code>maxResults</code>, Amazon Q Business returns a next
     *        token as a pagination token to retrieve the next set of messages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the number of retrievers returned exceeds <code>maxResults</code>, Amazon Q Business returns a next token as a
     * pagination token to retrieve the next set of messages.
     * </p>
     * 
     * @return If the number of retrievers returned exceeds <code>maxResults</code>, Amazon Q Business returns a next
     *         token as a pagination token to retrieve the next set of messages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the number of retrievers returned exceeds <code>maxResults</code>, Amazon Q Business returns a next token as a
     * pagination token to retrieve the next set of messages.
     * </p>
     * 
     * @param nextToken
     *        If the number of retrievers returned exceeds <code>maxResults</code>, Amazon Q Business returns a next
     *        token as a pagination token to retrieve the next set of messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of messages to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of messages to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of messages to return.
     * </p>
     * 
     * @return The maximum number of messages to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of messages to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of messages to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMessagesRequest == false)
            return false;
        ListMessagesRequest other = (ListMessagesRequest) obj;
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListMessagesRequest clone() {
        return (ListMessagesRequest) super.clone();
    }

}
