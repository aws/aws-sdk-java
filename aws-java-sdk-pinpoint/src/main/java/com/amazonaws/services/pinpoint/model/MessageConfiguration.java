/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Message configuration for a campaign.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** The message that the campaign delivers to APNS channels. Overrides the default message. */
    private Message aPNSMessage;
    /** The default message for all channels. */
    private Message defaultMessage;
    /** The message that the campaign delivers to GCM channels. Overrides the default message. */
    private Message gCMMessage;

    /**
     * The message that the campaign delivers to APNS channels. Overrides the default message.
     * 
     * @param aPNSMessage
     *        The message that the campaign delivers to APNS channels. Overrides the default message.
     */

    public void setAPNSMessage(Message aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
    }

    /**
     * The message that the campaign delivers to APNS channels. Overrides the default message.
     * 
     * @return The message that the campaign delivers to APNS channels. Overrides the default message.
     */

    public Message getAPNSMessage() {
        return this.aPNSMessage;
    }

    /**
     * The message that the campaign delivers to APNS channels. Overrides the default message.
     * 
     * @param aPNSMessage
     *        The message that the campaign delivers to APNS channels. Overrides the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withAPNSMessage(Message aPNSMessage) {
        setAPNSMessage(aPNSMessage);
        return this;
    }

    /**
     * The default message for all channels.
     * 
     * @param defaultMessage
     *        The default message for all channels.
     */

    public void setDefaultMessage(Message defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    /**
     * The default message for all channels.
     * 
     * @return The default message for all channels.
     */

    public Message getDefaultMessage() {
        return this.defaultMessage;
    }

    /**
     * The default message for all channels.
     * 
     * @param defaultMessage
     *        The default message for all channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withDefaultMessage(Message defaultMessage) {
        setDefaultMessage(defaultMessage);
        return this;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the default message.
     * 
     * @param gCMMessage
     *        The message that the campaign delivers to GCM channels. Overrides the default message.
     */

    public void setGCMMessage(Message gCMMessage) {
        this.gCMMessage = gCMMessage;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the default message.
     * 
     * @return The message that the campaign delivers to GCM channels. Overrides the default message.
     */

    public Message getGCMMessage() {
        return this.gCMMessage;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the default message.
     * 
     * @param gCMMessage
     *        The message that the campaign delivers to GCM channels. Overrides the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageConfiguration withGCMMessage(Message gCMMessage) {
        setGCMMessage(gCMMessage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAPNSMessage() != null)
            sb.append("APNSMessage: ").append(getAPNSMessage()).append(",");
        if (getDefaultMessage() != null)
            sb.append("DefaultMessage: ").append(getDefaultMessage()).append(",");
        if (getGCMMessage() != null)
            sb.append("GCMMessage: ").append(getGCMMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageConfiguration == false)
            return false;
        MessageConfiguration other = (MessageConfiguration) obj;
        if (other.getAPNSMessage() == null ^ this.getAPNSMessage() == null)
            return false;
        if (other.getAPNSMessage() != null && other.getAPNSMessage().equals(this.getAPNSMessage()) == false)
            return false;
        if (other.getDefaultMessage() == null ^ this.getDefaultMessage() == null)
            return false;
        if (other.getDefaultMessage() != null && other.getDefaultMessage().equals(this.getDefaultMessage()) == false)
            return false;
        if (other.getGCMMessage() == null ^ this.getGCMMessage() == null)
            return false;
        if (other.getGCMMessage() != null && other.getGCMMessage().equals(this.getGCMMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAPNSMessage() == null) ? 0 : getAPNSMessage().hashCode());
        hashCode = prime * hashCode + ((getDefaultMessage() == null) ? 0 : getDefaultMessage().hashCode());
        hashCode = prime * hashCode + ((getGCMMessage() == null) ? 0 : getGCMMessage().hashCode());
        return hashCode;
    }

    @Override
    public MessageConfiguration clone() {
        try {
            return (MessageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.MessageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
