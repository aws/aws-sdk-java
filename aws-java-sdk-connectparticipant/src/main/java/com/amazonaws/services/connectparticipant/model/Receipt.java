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
 * The receipt for the message delivered to the recipient.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/Receipt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Receipt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the message was delivered to the recipient.
     * </p>
     */
    private String deliveredTimestamp;
    /**
     * <p>
     * The time when the message was read by the recipient.
     * </p>
     */
    private String readTimestamp;
    /**
     * <p>
     * The identifier of the recipient of the message.
     * </p>
     */
    private String recipientParticipantId;

    /**
     * <p>
     * The time when the message was delivered to the recipient.
     * </p>
     * 
     * @param deliveredTimestamp
     *        The time when the message was delivered to the recipient.
     */

    public void setDeliveredTimestamp(String deliveredTimestamp) {
        this.deliveredTimestamp = deliveredTimestamp;
    }

    /**
     * <p>
     * The time when the message was delivered to the recipient.
     * </p>
     * 
     * @return The time when the message was delivered to the recipient.
     */

    public String getDeliveredTimestamp() {
        return this.deliveredTimestamp;
    }

    /**
     * <p>
     * The time when the message was delivered to the recipient.
     * </p>
     * 
     * @param deliveredTimestamp
     *        The time when the message was delivered to the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Receipt withDeliveredTimestamp(String deliveredTimestamp) {
        setDeliveredTimestamp(deliveredTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the message was read by the recipient.
     * </p>
     * 
     * @param readTimestamp
     *        The time when the message was read by the recipient.
     */

    public void setReadTimestamp(String readTimestamp) {
        this.readTimestamp = readTimestamp;
    }

    /**
     * <p>
     * The time when the message was read by the recipient.
     * </p>
     * 
     * @return The time when the message was read by the recipient.
     */

    public String getReadTimestamp() {
        return this.readTimestamp;
    }

    /**
     * <p>
     * The time when the message was read by the recipient.
     * </p>
     * 
     * @param readTimestamp
     *        The time when the message was read by the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Receipt withReadTimestamp(String readTimestamp) {
        setReadTimestamp(readTimestamp);
        return this;
    }

    /**
     * <p>
     * The identifier of the recipient of the message.
     * </p>
     * 
     * @param recipientParticipantId
     *        The identifier of the recipient of the message.
     */

    public void setRecipientParticipantId(String recipientParticipantId) {
        this.recipientParticipantId = recipientParticipantId;
    }

    /**
     * <p>
     * The identifier of the recipient of the message.
     * </p>
     * 
     * @return The identifier of the recipient of the message.
     */

    public String getRecipientParticipantId() {
        return this.recipientParticipantId;
    }

    /**
     * <p>
     * The identifier of the recipient of the message.
     * </p>
     * 
     * @param recipientParticipantId
     *        The identifier of the recipient of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Receipt withRecipientParticipantId(String recipientParticipantId) {
        setRecipientParticipantId(recipientParticipantId);
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
        if (getDeliveredTimestamp() != null)
            sb.append("DeliveredTimestamp: ").append(getDeliveredTimestamp()).append(",");
        if (getReadTimestamp() != null)
            sb.append("ReadTimestamp: ").append(getReadTimestamp()).append(",");
        if (getRecipientParticipantId() != null)
            sb.append("RecipientParticipantId: ").append(getRecipientParticipantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Receipt == false)
            return false;
        Receipt other = (Receipt) obj;
        if (other.getDeliveredTimestamp() == null ^ this.getDeliveredTimestamp() == null)
            return false;
        if (other.getDeliveredTimestamp() != null && other.getDeliveredTimestamp().equals(this.getDeliveredTimestamp()) == false)
            return false;
        if (other.getReadTimestamp() == null ^ this.getReadTimestamp() == null)
            return false;
        if (other.getReadTimestamp() != null && other.getReadTimestamp().equals(this.getReadTimestamp()) == false)
            return false;
        if (other.getRecipientParticipantId() == null ^ this.getRecipientParticipantId() == null)
            return false;
        if (other.getRecipientParticipantId() != null && other.getRecipientParticipantId().equals(this.getRecipientParticipantId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveredTimestamp() == null) ? 0 : getDeliveredTimestamp().hashCode());
        hashCode = prime * hashCode + ((getReadTimestamp() == null) ? 0 : getReadTimestamp().hashCode());
        hashCode = prime * hashCode + ((getRecipientParticipantId() == null) ? 0 : getRecipientParticipantId().hashCode());
        return hashCode;
    }

    @Override
    public Receipt clone() {
        try {
            return (Receipt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectparticipant.model.transform.ReceiptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
