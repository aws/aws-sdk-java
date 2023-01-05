/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListQueuedMessages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueuedMessagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The messages in the downlink queue.
     * </p>
     */
    private java.util.List<DownlinkQueueMessage> downlinkQueueMessagesList;

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @param nextToken
     *        To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *        <b>null</b> to receive the first set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @return To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *         <b>null</b> to receive the first set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @param nextToken
     *        To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *        <b>null</b> to receive the first set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuedMessagesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The messages in the downlink queue.
     * </p>
     * 
     * @return The messages in the downlink queue.
     */

    public java.util.List<DownlinkQueueMessage> getDownlinkQueueMessagesList() {
        return downlinkQueueMessagesList;
    }

    /**
     * <p>
     * The messages in the downlink queue.
     * </p>
     * 
     * @param downlinkQueueMessagesList
     *        The messages in the downlink queue.
     */

    public void setDownlinkQueueMessagesList(java.util.Collection<DownlinkQueueMessage> downlinkQueueMessagesList) {
        if (downlinkQueueMessagesList == null) {
            this.downlinkQueueMessagesList = null;
            return;
        }

        this.downlinkQueueMessagesList = new java.util.ArrayList<DownlinkQueueMessage>(downlinkQueueMessagesList);
    }

    /**
     * <p>
     * The messages in the downlink queue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDownlinkQueueMessagesList(java.util.Collection)} or
     * {@link #withDownlinkQueueMessagesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param downlinkQueueMessagesList
     *        The messages in the downlink queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuedMessagesResult withDownlinkQueueMessagesList(DownlinkQueueMessage... downlinkQueueMessagesList) {
        if (this.downlinkQueueMessagesList == null) {
            setDownlinkQueueMessagesList(new java.util.ArrayList<DownlinkQueueMessage>(downlinkQueueMessagesList.length));
        }
        for (DownlinkQueueMessage ele : downlinkQueueMessagesList) {
            this.downlinkQueueMessagesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The messages in the downlink queue.
     * </p>
     * 
     * @param downlinkQueueMessagesList
     *        The messages in the downlink queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuedMessagesResult withDownlinkQueueMessagesList(java.util.Collection<DownlinkQueueMessage> downlinkQueueMessagesList) {
        setDownlinkQueueMessagesList(downlinkQueueMessagesList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getDownlinkQueueMessagesList() != null)
            sb.append("DownlinkQueueMessagesList: ").append(getDownlinkQueueMessagesList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQueuedMessagesResult == false)
            return false;
        ListQueuedMessagesResult other = (ListQueuedMessagesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDownlinkQueueMessagesList() == null ^ this.getDownlinkQueueMessagesList() == null)
            return false;
        if (other.getDownlinkQueueMessagesList() != null && other.getDownlinkQueueMessagesList().equals(this.getDownlinkQueueMessagesList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDownlinkQueueMessagesList() == null) ? 0 : getDownlinkQueueMessagesList().hashCode());
        return hashCode;
    }

    @Override
    public ListQueuedMessagesResult clone() {
        try {
            return (ListQueuedMessagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
