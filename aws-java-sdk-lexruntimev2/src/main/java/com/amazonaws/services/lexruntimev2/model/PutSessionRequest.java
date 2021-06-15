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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/PutSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot that receives the session data.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The alias identifier of the bot that receives the session data.
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
     * The identifier of the session that receives the session data.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * A list of messages to send to the user. Messages are sent in the order that they are defined in the list.
     * </p>
     */
    private java.util.List<Message> messages;
    /**
     * <p>
     * Sets the state of the session with the user. You can use this to set the current intent, attributes, context, and
     * dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use in the conversation
     * with the user.
     * </p>
     */
    private SessionState sessionState;
    /**
     * <p>
     * Request-specific information passed between Amazon Lex V2 and the client application.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     */
    private java.util.Map<String, String> requestAttributes;
    /**
     * <p>
     * The message that Amazon Lex V2 returns in the response can be either text or speech depending on the value of
     * this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     * </p>
     * </li>
     * </ul>
     */
    private String responseContentType;

    /**
     * <p>
     * The identifier of the bot that receives the session data.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that receives the session data.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that receives the session data.
     * </p>
     * 
     * @return The identifier of the bot that receives the session data.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that receives the session data.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that receives the session data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The alias identifier of the bot that receives the session data.
     * </p>
     * 
     * @param botAliasId
     *        The alias identifier of the bot that receives the session data.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The alias identifier of the bot that receives the session data.
     * </p>
     * 
     * @return The alias identifier of the bot that receives the session data.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The alias identifier of the bot that receives the session data.
     * </p>
     * 
     * @param botAliasId
     *        The alias identifier of the bot that receives the session data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withBotAliasId(String botAliasId) {
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

    public PutSessionRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the session that receives the session data.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session that receives the session data.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session that receives the session data.
     * </p>
     * 
     * @return The identifier of the session that receives the session data.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session that receives the session data.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session that receives the session data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * A list of messages to send to the user. Messages are sent in the order that they are defined in the list.
     * </p>
     * 
     * @return A list of messages to send to the user. Messages are sent in the order that they are defined in the list.
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * A list of messages to send to the user. Messages are sent in the order that they are defined in the list.
     * </p>
     * 
     * @param messages
     *        A list of messages to send to the user. Messages are sent in the order that they are defined in the list.
     */

    public void setMessages(java.util.Collection<Message> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<Message>(messages);
    }

    /**
     * <p>
     * A list of messages to send to the user. Messages are sent in the order that they are defined in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        A list of messages to send to the user. Messages are sent in the order that they are defined in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withMessages(Message... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<Message>(messages.length));
        }
        for (Message ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of messages to send to the user. Messages are sent in the order that they are defined in the list.
     * </p>
     * 
     * @param messages
     *        A list of messages to send to the user. Messages are sent in the order that they are defined in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * Sets the state of the session with the user. You can use this to set the current intent, attributes, context, and
     * dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use in the conversation
     * with the user.
     * </p>
     * 
     * @param sessionState
     *        Sets the state of the session with the user. You can use this to set the current intent, attributes,
     *        context, and dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use
     *        in the conversation with the user.
     */

    public void setSessionState(SessionState sessionState) {
        this.sessionState = sessionState;
    }

    /**
     * <p>
     * Sets the state of the session with the user. You can use this to set the current intent, attributes, context, and
     * dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use in the conversation
     * with the user.
     * </p>
     * 
     * @return Sets the state of the session with the user. You can use this to set the current intent, attributes,
     *         context, and dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should
     *         use in the conversation with the user.
     */

    public SessionState getSessionState() {
        return this.sessionState;
    }

    /**
     * <p>
     * Sets the state of the session with the user. You can use this to set the current intent, attributes, context, and
     * dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use in the conversation
     * with the user.
     * </p>
     * 
     * @param sessionState
     *        Sets the state of the session with the user. You can use this to set the current intent, attributes,
     *        context, and dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use
     *        in the conversation with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withSessionState(SessionState sessionState) {
        setSessionState(sessionState);
        return this;
    }

    /**
     * <p>
     * Request-specific information passed between Amazon Lex V2 and the client application.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     * 
     * @return Request-specific information passed between Amazon Lex V2 and the client application.</p>
     *         <p>
     *         The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *         attributes with the prefix <code>x-amz-lex:</code>.
     */

    public java.util.Map<String, String> getRequestAttributes() {
        return requestAttributes;
    }

    /**
     * <p>
     * Request-specific information passed between Amazon Lex V2 and the client application.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     * 
     * @param requestAttributes
     *        Request-specific information passed between Amazon Lex V2 and the client application.</p>
     *        <p>
     *        The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *        attributes with the prefix <code>x-amz-lex:</code>.
     */

    public void setRequestAttributes(java.util.Map<String, String> requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * <p>
     * Request-specific information passed between Amazon Lex V2 and the client application.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     * 
     * @param requestAttributes
     *        Request-specific information passed between Amazon Lex V2 and the client application.</p>
     *        <p>
     *        The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *        attributes with the prefix <code>x-amz-lex:</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withRequestAttributes(java.util.Map<String, String> requestAttributes) {
        setRequestAttributes(requestAttributes);
        return this;
    }

    /**
     * Add a single RequestAttributes entry
     *
     * @see PutSessionRequest#withRequestAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest addRequestAttributesEntry(String key, String value) {
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

    public PutSessionRequest clearRequestAttributesEntries() {
        this.requestAttributes = null;
        return this;
    }

    /**
     * <p>
     * The message that Amazon Lex V2 returns in the response can be either text or speech depending on the value of
     * this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param responseContentType
     *        The message that Amazon Lex V2 returns in the response can be either text or speech depending on the value
     *        of this parameter. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     *        </p>
     *        </li>
     */

    public void setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
    }

    /**
     * <p>
     * The message that Amazon Lex V2 returns in the response can be either text or speech depending on the value of
     * this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The message that Amazon Lex V2 returns in the response can be either text or speech depending on the
     *         value of this parameter. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     *         </p>
     *         </li>
     */

    public String getResponseContentType() {
        return this.responseContentType;
    }

    /**
     * <p>
     * The message that Amazon Lex V2 returns in the response can be either text or speech depending on the value of
     * this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param responseContentType
     *        The message that Amazon Lex V2 returns in the response can be either text or speech depending on the value
     *        of this parameter. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionRequest withResponseContentType(String responseContentType) {
        setResponseContentType(responseContentType);
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
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getSessionState() != null)
            sb.append("SessionState: ").append(getSessionState()).append(",");
        if (getRequestAttributes() != null)
            sb.append("RequestAttributes: ").append(getRequestAttributes()).append(",");
        if (getResponseContentType() != null)
            sb.append("ResponseContentType: ").append(getResponseContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSessionRequest == false)
            return false;
        PutSessionRequest other = (PutSessionRequest) obj;
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
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getSessionState() == null ^ this.getSessionState() == null)
            return false;
        if (other.getSessionState() != null && other.getSessionState().equals(this.getSessionState()) == false)
            return false;
        if (other.getRequestAttributes() == null ^ this.getRequestAttributes() == null)
            return false;
        if (other.getRequestAttributes() != null && other.getRequestAttributes().equals(this.getRequestAttributes()) == false)
            return false;
        if (other.getResponseContentType() == null ^ this.getResponseContentType() == null)
            return false;
        if (other.getResponseContentType() != null && other.getResponseContentType().equals(this.getResponseContentType()) == false)
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
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getSessionState() == null) ? 0 : getSessionState().hashCode());
        hashCode = prime * hashCode + ((getRequestAttributes() == null) ? 0 : getRequestAttributes().hashCode());
        hashCode = prime * hashCode + ((getResponseContentType() == null) ? 0 : getResponseContentType().hashCode());
        return hashCode;
    }

    @Override
    public PutSessionRequest clone() {
        return (PutSessionRequest) super.clone();
    }

}
