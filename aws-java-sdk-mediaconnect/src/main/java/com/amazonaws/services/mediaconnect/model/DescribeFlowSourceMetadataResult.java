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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeFlowSourceMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlowSourceMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The ARN of the flow that DescribeFlowSourceMetadata was performed on. */
    private String flowArn;
    /** Provides a status code and message regarding issues found with the flow source metadata. */
    private java.util.List<MessageDetail> messages;
    /** The timestamp of the most recent change in metadata for this flow’s source. */
    private java.util.Date timestamp;

    private TransportMediaInfo transportMediaInfo;

    /**
     * The ARN of the flow that DescribeFlowSourceMetadata was performed on.
     * 
     * @param flowArn
     *        The ARN of the flow that DescribeFlowSourceMetadata was performed on.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the flow that DescribeFlowSourceMetadata was performed on.
     * 
     * @return The ARN of the flow that DescribeFlowSourceMetadata was performed on.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the flow that DescribeFlowSourceMetadata was performed on.
     * 
     * @param flowArn
     *        The ARN of the flow that DescribeFlowSourceMetadata was performed on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowSourceMetadataResult withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * Provides a status code and message regarding issues found with the flow source metadata.
     * 
     * @return Provides a status code and message regarding issues found with the flow source metadata.
     */

    public java.util.List<MessageDetail> getMessages() {
        return messages;
    }

    /**
     * Provides a status code and message regarding issues found with the flow source metadata.
     * 
     * @param messages
     *        Provides a status code and message regarding issues found with the flow source metadata.
     */

    public void setMessages(java.util.Collection<MessageDetail> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<MessageDetail>(messages);
    }

    /**
     * Provides a status code and message regarding issues found with the flow source metadata.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        Provides a status code and message regarding issues found with the flow source metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowSourceMetadataResult withMessages(MessageDetail... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<MessageDetail>(messages.length));
        }
        for (MessageDetail ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * Provides a status code and message regarding issues found with the flow source metadata.
     * 
     * @param messages
     *        Provides a status code and message regarding issues found with the flow source metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowSourceMetadataResult withMessages(java.util.Collection<MessageDetail> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * The timestamp of the most recent change in metadata for this flow’s source.
     * 
     * @param timestamp
     *        The timestamp of the most recent change in metadata for this flow’s source.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The timestamp of the most recent change in metadata for this flow’s source.
     * 
     * @return The timestamp of the most recent change in metadata for this flow’s source.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * The timestamp of the most recent change in metadata for this flow’s source.
     * 
     * @param timestamp
     *        The timestamp of the most recent change in metadata for this flow’s source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowSourceMetadataResult withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * @param transportMediaInfo
     */

    public void setTransportMediaInfo(TransportMediaInfo transportMediaInfo) {
        this.transportMediaInfo = transportMediaInfo;
    }

    /**
     * @return
     */

    public TransportMediaInfo getTransportMediaInfo() {
        return this.transportMediaInfo;
    }

    /**
     * @param transportMediaInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowSourceMetadataResult withTransportMediaInfo(TransportMediaInfo transportMediaInfo) {
        setTransportMediaInfo(transportMediaInfo);
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getTransportMediaInfo() != null)
            sb.append("TransportMediaInfo: ").append(getTransportMediaInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlowSourceMetadataResult == false)
            return false;
        DescribeFlowSourceMetadataResult other = (DescribeFlowSourceMetadataResult) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getTransportMediaInfo() == null ^ this.getTransportMediaInfo() == null)
            return false;
        if (other.getTransportMediaInfo() != null && other.getTransportMediaInfo().equals(this.getTransportMediaInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTransportMediaInfo() == null) ? 0 : getTransportMediaInfo().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFlowSourceMetadataResult clone() {
        try {
            return (DescribeFlowSourceMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
