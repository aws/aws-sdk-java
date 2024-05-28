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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListMessages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMessagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of information on one or more messages.
     * </p>
     */
    private java.util.List<Message> messages;
    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of messages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of information on one or more messages.
     * </p>
     * 
     * @return An array of information on one or more messages.
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * An array of information on one or more messages.
     * </p>
     * 
     * @param messages
     *        An array of information on one or more messages.
     */

    public void setMessages(java.util.Collection<Message> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<Message>(messages);
    }

    /**
     * <p>
     * An array of information on one or more messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        An array of information on one or more messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessagesResult withMessages(Message... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<Message>(messages.length));
        }
        for (Message ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of information on one or more messages.
     * </p>
     * 
     * @param messages
     *        An array of information on one or more messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessagesResult withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of messages.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Q Business returns this token, which you can use in a later request
     *        to list the next set of messages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of messages.
     * </p>
     * 
     * @return If the response is truncated, Amazon Q Business returns this token, which you can use in a later request
     *         to list the next set of messages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of messages.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Q Business returns this token, which you can use in a later request
     *        to list the next set of messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessagesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMessagesResult == false)
            return false;
        ListMessagesResult other = (ListMessagesResult) obj;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMessagesResult clone() {
        try {
            return (ListMessagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
