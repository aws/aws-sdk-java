/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/ListFlowExecutionMessages"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFlowExecutionMessagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects that contain information about events in the specified flow execution.
     * </p>
     */
    private java.util.List<FlowExecutionMessage> messages;
    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects that contain information about events in the specified flow execution.
     * </p>
     * 
     * @return A list of objects that contain information about events in the specified flow execution.
     */

    public java.util.List<FlowExecutionMessage> getMessages() {
        return messages;
    }

    /**
     * <p>
     * A list of objects that contain information about events in the specified flow execution.
     * </p>
     * 
     * @param messages
     *        A list of objects that contain information about events in the specified flow execution.
     */

    public void setMessages(java.util.Collection<FlowExecutionMessage> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<FlowExecutionMessage>(messages);
    }

    /**
     * <p>
     * A list of objects that contain information about events in the specified flow execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        A list of objects that contain information about events in the specified flow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowExecutionMessagesResult withMessages(FlowExecutionMessage... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<FlowExecutionMessage>(messages.length));
        }
        for (FlowExecutionMessage ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about events in the specified flow execution.
     * </p>
     * 
     * @param messages
     *        A list of objects that contain information about events in the specified flow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowExecutionMessagesResult withMessages(java.util.Collection<FlowExecutionMessage> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string to specify as <code>nextToken</code> when you request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @return The string to specify as <code>nextToken</code> when you request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string to specify as <code>nextToken</code> when you request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowExecutionMessagesResult withNextToken(String nextToken) {
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

        if (obj instanceof ListFlowExecutionMessagesResult == false)
            return false;
        ListFlowExecutionMessagesResult other = (ListFlowExecutionMessagesResult) obj;
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
    public ListFlowExecutionMessagesResult clone() {
        try {
            return (ListFlowExecutionMessagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
