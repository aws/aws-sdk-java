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
 * An object that defines a message that contains text formatted using Amazon Pinpoint Voice Instructions markup.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/CallInstructionsMessageType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallInstructionsMessageType implements Serializable, Cloneable, StructuredPojo {

    /**
     * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly
     * Developer Guide.
     */
    private String text;

    /**
     * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly
     * Developer Guide.
     * 
     * @param text
     *        The language to use when delivering the message. For a complete list of supported languages, see the
     *        Amazon Polly Developer Guide.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly
     * Developer Guide.
     * 
     * @return The language to use when delivering the message. For a complete list of supported languages, see the
     *         Amazon Polly Developer Guide.
     */

    public String getText() {
        return this.text;
    }

    /**
     * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly
     * Developer Guide.
     * 
     * @param text
     *        The language to use when delivering the message. For a complete list of supported languages, see the
     *        Amazon Polly Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallInstructionsMessageType withText(String text) {
        setText(text);
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
        if (getText() != null)
            sb.append("Text: ").append(getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallInstructionsMessageType == false)
            return false;
        CallInstructionsMessageType other = (CallInstructionsMessageType) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public CallInstructionsMessageType clone() {
        try {
            return (CallInstructionsMessageType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoice.model.transform.CallInstructionsMessageTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
