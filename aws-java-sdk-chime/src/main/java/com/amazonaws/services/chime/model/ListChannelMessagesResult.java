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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelMessages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelMessagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel containing the requested messages.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The token passed by previous API calls until all requested messages are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The information about, and content of, each requested message.
     * </p>
     */
    private java.util.List<ChannelMessageSummary> channelMessages;

    /**
     * <p>
     * The ARN of the channel containing the requested messages.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel containing the requested messages.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel containing the requested messages.
     * </p>
     * 
     * @return The ARN of the channel containing the requested messages.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel containing the requested messages.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel containing the requested messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMessagesResult withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested messages are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested messages are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested messages are returned.
     * </p>
     * 
     * @return The token passed by previous API calls until all requested messages are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested messages are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested messages are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMessagesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The information about, and content of, each requested message.
     * </p>
     * 
     * @return The information about, and content of, each requested message.
     */

    public java.util.List<ChannelMessageSummary> getChannelMessages() {
        return channelMessages;
    }

    /**
     * <p>
     * The information about, and content of, each requested message.
     * </p>
     * 
     * @param channelMessages
     *        The information about, and content of, each requested message.
     */

    public void setChannelMessages(java.util.Collection<ChannelMessageSummary> channelMessages) {
        if (channelMessages == null) {
            this.channelMessages = null;
            return;
        }

        this.channelMessages = new java.util.ArrayList<ChannelMessageSummary>(channelMessages);
    }

    /**
     * <p>
     * The information about, and content of, each requested message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelMessages(java.util.Collection)} or {@link #withChannelMessages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param channelMessages
     *        The information about, and content of, each requested message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMessagesResult withChannelMessages(ChannelMessageSummary... channelMessages) {
        if (this.channelMessages == null) {
            setChannelMessages(new java.util.ArrayList<ChannelMessageSummary>(channelMessages.length));
        }
        for (ChannelMessageSummary ele : channelMessages) {
            this.channelMessages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information about, and content of, each requested message.
     * </p>
     * 
     * @param channelMessages
     *        The information about, and content of, each requested message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMessagesResult withChannelMessages(java.util.Collection<ChannelMessageSummary> channelMessages) {
        setChannelMessages(channelMessages);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getChannelMessages() != null)
            sb.append("ChannelMessages: ").append(getChannelMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelMessagesResult == false)
            return false;
        ListChannelMessagesResult other = (ListChannelMessagesResult) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getChannelMessages() == null ^ this.getChannelMessages() == null)
            return false;
        if (other.getChannelMessages() != null && other.getChannelMessages().equals(this.getChannelMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getChannelMessages() == null) ? 0 : getChannelMessages().hashCode());
        return hashCode;
    }

    @Override
    public ListChannelMessagesResult clone() {
        try {
            return (ListChannelMessagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
