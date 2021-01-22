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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The object that provides message text and it's type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/Message" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Message implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A message in plain text format.
     * </p>
     */
    private PlainTextMessage plainTextMessage;
    /**
     * <p>
     * A message in a custom format defined by the client application.
     * </p>
     */
    private CustomPayload customPayload;
    /**
     * <p>
     * A message in Speech Synthesis Markup Language (SSML).
     * </p>
     */
    private SSMLMessage ssmlMessage;
    /**
     * <p>
     * A message that defines a response card that the client application can show to the user.
     * </p>
     */
    private ImageResponseCard imageResponseCard;

    /**
     * <p>
     * A message in plain text format.
     * </p>
     * 
     * @param plainTextMessage
     *        A message in plain text format.
     */

    public void setPlainTextMessage(PlainTextMessage plainTextMessage) {
        this.plainTextMessage = plainTextMessage;
    }

    /**
     * <p>
     * A message in plain text format.
     * </p>
     * 
     * @return A message in plain text format.
     */

    public PlainTextMessage getPlainTextMessage() {
        return this.plainTextMessage;
    }

    /**
     * <p>
     * A message in plain text format.
     * </p>
     * 
     * @param plainTextMessage
     *        A message in plain text format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withPlainTextMessage(PlainTextMessage plainTextMessage) {
        setPlainTextMessage(plainTextMessage);
        return this;
    }

    /**
     * <p>
     * A message in a custom format defined by the client application.
     * </p>
     * 
     * @param customPayload
     *        A message in a custom format defined by the client application.
     */

    public void setCustomPayload(CustomPayload customPayload) {
        this.customPayload = customPayload;
    }

    /**
     * <p>
     * A message in a custom format defined by the client application.
     * </p>
     * 
     * @return A message in a custom format defined by the client application.
     */

    public CustomPayload getCustomPayload() {
        return this.customPayload;
    }

    /**
     * <p>
     * A message in a custom format defined by the client application.
     * </p>
     * 
     * @param customPayload
     *        A message in a custom format defined by the client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withCustomPayload(CustomPayload customPayload) {
        setCustomPayload(customPayload);
        return this;
    }

    /**
     * <p>
     * A message in Speech Synthesis Markup Language (SSML).
     * </p>
     * 
     * @param ssmlMessage
     *        A message in Speech Synthesis Markup Language (SSML).
     */

    public void setSsmlMessage(SSMLMessage ssmlMessage) {
        this.ssmlMessage = ssmlMessage;
    }

    /**
     * <p>
     * A message in Speech Synthesis Markup Language (SSML).
     * </p>
     * 
     * @return A message in Speech Synthesis Markup Language (SSML).
     */

    public SSMLMessage getSsmlMessage() {
        return this.ssmlMessage;
    }

    /**
     * <p>
     * A message in Speech Synthesis Markup Language (SSML).
     * </p>
     * 
     * @param ssmlMessage
     *        A message in Speech Synthesis Markup Language (SSML).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withSsmlMessage(SSMLMessage ssmlMessage) {
        setSsmlMessage(ssmlMessage);
        return this;
    }

    /**
     * <p>
     * A message that defines a response card that the client application can show to the user.
     * </p>
     * 
     * @param imageResponseCard
     *        A message that defines a response card that the client application can show to the user.
     */

    public void setImageResponseCard(ImageResponseCard imageResponseCard) {
        this.imageResponseCard = imageResponseCard;
    }

    /**
     * <p>
     * A message that defines a response card that the client application can show to the user.
     * </p>
     * 
     * @return A message that defines a response card that the client application can show to the user.
     */

    public ImageResponseCard getImageResponseCard() {
        return this.imageResponseCard;
    }

    /**
     * <p>
     * A message that defines a response card that the client application can show to the user.
     * </p>
     * 
     * @param imageResponseCard
     *        A message that defines a response card that the client application can show to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withImageResponseCard(ImageResponseCard imageResponseCard) {
        setImageResponseCard(imageResponseCard);
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
        if (getPlainTextMessage() != null)
            sb.append("PlainTextMessage: ").append(getPlainTextMessage()).append(",");
        if (getCustomPayload() != null)
            sb.append("CustomPayload: ").append(getCustomPayload()).append(",");
        if (getSsmlMessage() != null)
            sb.append("SsmlMessage: ").append(getSsmlMessage()).append(",");
        if (getImageResponseCard() != null)
            sb.append("ImageResponseCard: ").append(getImageResponseCard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Message == false)
            return false;
        Message other = (Message) obj;
        if (other.getPlainTextMessage() == null ^ this.getPlainTextMessage() == null)
            return false;
        if (other.getPlainTextMessage() != null && other.getPlainTextMessage().equals(this.getPlainTextMessage()) == false)
            return false;
        if (other.getCustomPayload() == null ^ this.getCustomPayload() == null)
            return false;
        if (other.getCustomPayload() != null && other.getCustomPayload().equals(this.getCustomPayload()) == false)
            return false;
        if (other.getSsmlMessage() == null ^ this.getSsmlMessage() == null)
            return false;
        if (other.getSsmlMessage() != null && other.getSsmlMessage().equals(this.getSsmlMessage()) == false)
            return false;
        if (other.getImageResponseCard() == null ^ this.getImageResponseCard() == null)
            return false;
        if (other.getImageResponseCard() != null && other.getImageResponseCard().equals(this.getImageResponseCard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlainTextMessage() == null) ? 0 : getPlainTextMessage().hashCode());
        hashCode = prime * hashCode + ((getCustomPayload() == null) ? 0 : getCustomPayload().hashCode());
        hashCode = prime * hashCode + ((getSsmlMessage() == null) ? 0 : getSsmlMessage().hashCode());
        hashCode = prime * hashCode + ((getImageResponseCard() == null) ? 0 : getImageResponseCard().hashCode());
        return hashCode;
    }

    @Override
    public Message clone() {
        try {
            return (Message) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.MessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
