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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains a response to the utterance from the bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UtteranceBotResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtteranceBotResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text of the response to the utterance from the bot.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The type of the response. The following values are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> – A plain text string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> – A response string that you can customize to include data or metadata for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> – A string that includes Speech Synthesis Markup Language to customize the audio response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ImageResponseCard</code> – An image with buttons that the customer can select. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_ImageResponseCard.html"
     * >ImageResponseCard</a> for more information.
     * </p>
     * </li>
     * </ul>
     */
    private String contentType;

    private ImageResponseCard imageResponseCard;

    /**
     * <p>
     * The text of the response to the utterance from the bot.
     * </p>
     * 
     * @param content
     *        The text of the response to the utterance from the bot.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The text of the response to the utterance from the bot.
     * </p>
     * 
     * @return The text of the response to the utterance from the bot.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The text of the response to the utterance from the bot.
     * </p>
     * 
     * @param content
     *        The text of the response to the utterance from the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceBotResponse withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The type of the response. The following values are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> – A plain text string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> – A response string that you can customize to include data or metadata for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> – A string that includes Speech Synthesis Markup Language to customize the audio response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ImageResponseCard</code> – An image with buttons that the customer can select. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_ImageResponseCard.html"
     * >ImageResponseCard</a> for more information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The type of the response. The following values are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlainText</code> – A plain text string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CustomPayload</code> – A response string that you can customize to include data or metadata for your
     *        application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSML</code> – A string that includes Speech Synthesis Markup Language to customize the audio
     *        response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ImageResponseCard</code> – An image with buttons that the customer can select. See <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_ImageResponseCard.html"
     *        >ImageResponseCard</a> for more information.
     *        </p>
     *        </li>
     * @see UtteranceContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of the response. The following values are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> – A plain text string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> – A response string that you can customize to include data or metadata for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> – A string that includes Speech Synthesis Markup Language to customize the audio response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ImageResponseCard</code> – An image with buttons that the customer can select. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_ImageResponseCard.html"
     * >ImageResponseCard</a> for more information.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the response. The following values are possible:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PlainText</code> – A plain text string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CustomPayload</code> – A response string that you can customize to include data or metadata for
     *         your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SSML</code> – A string that includes Speech Synthesis Markup Language to customize the audio
     *         response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ImageResponseCard</code> – An image with buttons that the customer can select. See <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_ImageResponseCard.html"
     *         >ImageResponseCard</a> for more information.
     *         </p>
     *         </li>
     * @see UtteranceContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of the response. The following values are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> – A plain text string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> – A response string that you can customize to include data or metadata for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> – A string that includes Speech Synthesis Markup Language to customize the audio response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ImageResponseCard</code> – An image with buttons that the customer can select. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_ImageResponseCard.html"
     * >ImageResponseCard</a> for more information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The type of the response. The following values are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlainText</code> – A plain text string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CustomPayload</code> – A response string that you can customize to include data or metadata for your
     *        application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSML</code> – A string that includes Speech Synthesis Markup Language to customize the audio
     *        response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ImageResponseCard</code> – An image with buttons that the customer can select. See <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_ImageResponseCard.html"
     *        >ImageResponseCard</a> for more information.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UtteranceContentType
     */

    public UtteranceBotResponse withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The type of the response. The following values are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> – A plain text string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> – A response string that you can customize to include data or metadata for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> – A string that includes Speech Synthesis Markup Language to customize the audio response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ImageResponseCard</code> – An image with buttons that the customer can select. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_ImageResponseCard.html"
     * >ImageResponseCard</a> for more information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The type of the response. The following values are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlainText</code> – A plain text string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CustomPayload</code> – A response string that you can customize to include data or metadata for your
     *        application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSML</code> – A string that includes Speech Synthesis Markup Language to customize the audio
     *        response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ImageResponseCard</code> – An image with buttons that the customer can select. See <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_ImageResponseCard.html"
     *        >ImageResponseCard</a> for more information.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UtteranceContentType
     */

    public UtteranceBotResponse withContentType(UtteranceContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * @param imageResponseCard
     */

    public void setImageResponseCard(ImageResponseCard imageResponseCard) {
        this.imageResponseCard = imageResponseCard;
    }

    /**
     * @return
     */

    public ImageResponseCard getImageResponseCard() {
        return this.imageResponseCard;
    }

    /**
     * @param imageResponseCard
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceBotResponse withImageResponseCard(ImageResponseCard imageResponseCard) {
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
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

        if (obj instanceof UtteranceBotResponse == false)
            return false;
        UtteranceBotResponse other = (UtteranceBotResponse) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
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

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getImageResponseCard() == null) ? 0 : getImageResponseCard().hashCode());
        return hashCode;
    }

    @Override
    public UtteranceBotResponse clone() {
        try {
            return (UtteranceBotResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UtteranceBotResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
