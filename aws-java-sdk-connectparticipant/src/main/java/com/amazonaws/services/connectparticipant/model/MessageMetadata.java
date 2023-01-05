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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata related to a message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/MessageMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the message that contains the metadata information.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The list of receipt information for a message for different recipients.
     * </p>
     */
    private java.util.List<Receipt> receipts;

    /**
     * <p>
     * The identifier of the message that contains the metadata information.
     * </p>
     * 
     * @param messageId
     *        The identifier of the message that contains the metadata information.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The identifier of the message that contains the metadata information.
     * </p>
     * 
     * @return The identifier of the message that contains the metadata information.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The identifier of the message that contains the metadata information.
     * </p>
     * 
     * @param messageId
     *        The identifier of the message that contains the metadata information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageMetadata withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The list of receipt information for a message for different recipients.
     * </p>
     * 
     * @return The list of receipt information for a message for different recipients.
     */

    public java.util.List<Receipt> getReceipts() {
        return receipts;
    }

    /**
     * <p>
     * The list of receipt information for a message for different recipients.
     * </p>
     * 
     * @param receipts
     *        The list of receipt information for a message for different recipients.
     */

    public void setReceipts(java.util.Collection<Receipt> receipts) {
        if (receipts == null) {
            this.receipts = null;
            return;
        }

        this.receipts = new java.util.ArrayList<Receipt>(receipts);
    }

    /**
     * <p>
     * The list of receipt information for a message for different recipients.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReceipts(java.util.Collection)} or {@link #withReceipts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param receipts
     *        The list of receipt information for a message for different recipients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageMetadata withReceipts(Receipt... receipts) {
        if (this.receipts == null) {
            setReceipts(new java.util.ArrayList<Receipt>(receipts.length));
        }
        for (Receipt ele : receipts) {
            this.receipts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of receipt information for a message for different recipients.
     * </p>
     * 
     * @param receipts
     *        The list of receipt information for a message for different recipients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageMetadata withReceipts(java.util.Collection<Receipt> receipts) {
        setReceipts(receipts);
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
        if (getReceipts() != null)
            sb.append("Receipts: ").append(getReceipts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageMetadata == false)
            return false;
        MessageMetadata other = (MessageMetadata) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getReceipts() == null ^ this.getReceipts() == null)
            return false;
        if (other.getReceipts() != null && other.getReceipts().equals(this.getReceipts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getReceipts() == null) ? 0 : getReceipts().hashCode());
        return hashCode;
    }

    @Override
    public MessageMetadata clone() {
        try {
            return (MessageMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectparticipant.model.transform.MessageMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
