/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An object that contains a voice message and information about the recipient that you want to send it to.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/VoiceMessageContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceMessageContent implements Serializable, Cloneable, StructuredPojo {

    private CallInstructionsMessageType callInstructionsMessage;

    private PlainTextMessageType plainTextMessage;

    private SSMLMessageType sSMLMessage;

    /**
     * @param callInstructionsMessage
     */

    public void setCallInstructionsMessage(CallInstructionsMessageType callInstructionsMessage) {
        this.callInstructionsMessage = callInstructionsMessage;
    }

    /**
     * @return
     */

    public CallInstructionsMessageType getCallInstructionsMessage() {
        return this.callInstructionsMessage;
    }

    /**
     * @param callInstructionsMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessageContent withCallInstructionsMessage(CallInstructionsMessageType callInstructionsMessage) {
        setCallInstructionsMessage(callInstructionsMessage);
        return this;
    }

    /**
     * @param plainTextMessage
     */

    public void setPlainTextMessage(PlainTextMessageType plainTextMessage) {
        this.plainTextMessage = plainTextMessage;
    }

    /**
     * @return
     */

    public PlainTextMessageType getPlainTextMessage() {
        return this.plainTextMessage;
    }

    /**
     * @param plainTextMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessageContent withPlainTextMessage(PlainTextMessageType plainTextMessage) {
        setPlainTextMessage(plainTextMessage);
        return this;
    }

    /**
     * @param sSMLMessage
     */

    public void setSSMLMessage(SSMLMessageType sSMLMessage) {
        this.sSMLMessage = sSMLMessage;
    }

    /**
     * @return
     */

    public SSMLMessageType getSSMLMessage() {
        return this.sSMLMessage;
    }

    /**
     * @param sSMLMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessageContent withSSMLMessage(SSMLMessageType sSMLMessage) {
        setSSMLMessage(sSMLMessage);
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
        if (getCallInstructionsMessage() != null)
            sb.append("CallInstructionsMessage: ").append(getCallInstructionsMessage()).append(",");
        if (getPlainTextMessage() != null)
            sb.append("PlainTextMessage: ").append(getPlainTextMessage()).append(",");
        if (getSSMLMessage() != null)
            sb.append("SSMLMessage: ").append(getSSMLMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceMessageContent == false)
            return false;
        VoiceMessageContent other = (VoiceMessageContent) obj;
        if (other.getCallInstructionsMessage() == null ^ this.getCallInstructionsMessage() == null)
            return false;
        if (other.getCallInstructionsMessage() != null && other.getCallInstructionsMessage().equals(this.getCallInstructionsMessage()) == false)
            return false;
        if (other.getPlainTextMessage() == null ^ this.getPlainTextMessage() == null)
            return false;
        if (other.getPlainTextMessage() != null && other.getPlainTextMessage().equals(this.getPlainTextMessage()) == false)
            return false;
        if (other.getSSMLMessage() == null ^ this.getSSMLMessage() == null)
            return false;
        if (other.getSSMLMessage() != null && other.getSSMLMessage().equals(this.getSSMLMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallInstructionsMessage() == null) ? 0 : getCallInstructionsMessage().hashCode());
        hashCode = prime * hashCode + ((getPlainTextMessage() == null) ? 0 : getPlainTextMessage().hashCode());
        hashCode = prime * hashCode + ((getSSMLMessage() == null) ? 0 : getSSMLMessage().hashCode());
        return hashCode;
    }

    @Override
    public VoiceMessageContent clone() {
        try {
            return (VoiceMessageContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoice.model.transform.VoiceMessageContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
