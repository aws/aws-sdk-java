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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizeText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecognizeTextRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot that processes the request.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The alias identifier in use for the bot that processes the request.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The locale where the session is in use.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The identifier of the user session that is having the conversation.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The text that the user entered. Amazon Lex V2 interprets this text.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The current state of the dialog between the user and the bot.
     * </p>
     */
    private SessionState sessionState;
    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     */
    private java.util.Map<String, String> requestAttributes;

    /**
     * <p>
     * The identifier of the bot that processes the request.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that processes the request.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that processes the request.
     * </p>
     * 
     * @return The identifier of the bot that processes the request.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that processes the request.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that processes the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The alias identifier in use for the bot that processes the request.
     * </p>
     * 
     * @param botAliasId
     *        The alias identifier in use for the bot that processes the request.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The alias identifier in use for the bot that processes the request.
     * </p>
     * 
     * @return The alias identifier in use for the bot that processes the request.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The alias identifier in use for the bot that processes the request.
     * </p>
     * 
     * @param botAliasId
     *        The alias identifier in use for the bot that processes the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextRequest withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The locale where the session is in use.
     * </p>
     * 
     * @param localeId
     *        The locale where the session is in use.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale where the session is in use.
     * </p>
     * 
     * @return The locale where the session is in use.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale where the session is in use.
     * </p>
     * 
     * @param localeId
     *        The locale where the session is in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user session that is having the conversation.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the user session that is having the conversation.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the user session that is having the conversation.
     * </p>
     * 
     * @return The identifier of the user session that is having the conversation.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the user session that is having the conversation.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the user session that is having the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The text that the user entered. Amazon Lex V2 interprets this text.
     * </p>
     * 
     * @param text
     *        The text that the user entered. Amazon Lex V2 interprets this text.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text that the user entered. Amazon Lex V2 interprets this text.
     * </p>
     * 
     * @return The text that the user entered. Amazon Lex V2 interprets this text.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text that the user entered. Amazon Lex V2 interprets this text.
     * </p>
     * 
     * @param text
     *        The text that the user entered. Amazon Lex V2 interprets this text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The current state of the dialog between the user and the bot.
     * </p>
     * 
     * @param sessionState
     *        The current state of the dialog between the user and the bot.
     */

    public void setSessionState(SessionState sessionState) {
        this.sessionState = sessionState;
    }

    /**
     * <p>
     * The current state of the dialog between the user and the bot.
     * </p>
     * 
     * @return The current state of the dialog between the user and the bot.
     */

    public SessionState getSessionState() {
        return this.sessionState;
    }

    /**
     * <p>
     * The current state of the dialog between the user and the bot.
     * </p>
     * 
     * @param sessionState
     *        The current state of the dialog between the user and the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextRequest withSessionState(SessionState sessionState) {
        setSessionState(sessionState);
        return this;
    }

    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     * 
     * @return Request-specific information passed between the client application and Amazon Lex V2 </p>
     *         <p>
     *         The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *         attributes with the prefix <code>x-amz-lex:</code>.
     */

    public java.util.Map<String, String> getRequestAttributes() {
        return requestAttributes;
    }

    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     * 
     * @param requestAttributes
     *        Request-specific information passed between the client application and Amazon Lex V2 </p>
     *        <p>
     *        The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *        attributes with the prefix <code>x-amz-lex:</code>.
     */

    public void setRequestAttributes(java.util.Map<String, String> requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     * 
     * @param requestAttributes
     *        Request-specific information passed between the client application and Amazon Lex V2 </p>
     *        <p>
     *        The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *        attributes with the prefix <code>x-amz-lex:</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextRequest withRequestAttributes(java.util.Map<String, String> requestAttributes) {
        setRequestAttributes(requestAttributes);
        return this;
    }

    /**
     * Add a single RequestAttributes entry
     *
     * @see RecognizeTextRequest#withRequestAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextRequest addRequestAttributesEntry(String key, String value) {
        if (null == this.requestAttributes) {
            this.requestAttributes = new java.util.HashMap<String, String>();
        }
        if (this.requestAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextRequest clearRequestAttributesEntries() {
        this.requestAttributes = null;
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotAliasId() != null)
            sb.append("BotAliasId: ").append(getBotAliasId()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getText() != null)
            sb.append("Text: ").append("***Sensitive Data Redacted***").append(",");
        if (getSessionState() != null)
            sb.append("SessionState: ").append(getSessionState()).append(",");
        if (getRequestAttributes() != null)
            sb.append("RequestAttributes: ").append(getRequestAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecognizeTextRequest == false)
            return false;
        RecognizeTextRequest other = (RecognizeTextRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getSessionState() == null ^ this.getSessionState() == null)
            return false;
        if (other.getSessionState() != null && other.getSessionState().equals(this.getSessionState()) == false)
            return false;
        if (other.getRequestAttributes() == null ^ this.getRequestAttributes() == null)
            return false;
        if (other.getRequestAttributes() != null && other.getRequestAttributes().equals(this.getRequestAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getSessionState() == null) ? 0 : getSessionState().hashCode());
        hashCode = prime * hashCode + ((getRequestAttributes() == null) ? 0 : getRequestAttributes().hashCode());
        return hashCode;
    }

    @Override
    public RecognizeTextRequest clone() {
        return (RecognizeTextRequest) super.clone();
    }

}
