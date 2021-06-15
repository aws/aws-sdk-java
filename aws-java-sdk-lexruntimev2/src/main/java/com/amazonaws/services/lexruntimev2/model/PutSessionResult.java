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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/PutSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The type of response. Same as the type specified in the <code>responseContentType</code> field in the request.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on how you return the messages
     * from you Lambda function or the order that the messages are defined in the bot.
     * </p>
     */
    private String messages;
    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action may be.
     * </p>
     */
    private String sessionState;
    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2. These are the same as the
     * <code>requestAttribute</code> parameter in the call to the <code>PutSession</code> operation.
     * </p>
     */
    private String requestAttributes;
    /**
     * <p>
     * The identifier of the session that received the data.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * If the requested content type was audio, the audio version of the message to convey to the user.
     * </p>
     */
    private java.io.InputStream audioStream;

    /**
     * <p>
     * The type of response. Same as the type specified in the <code>responseContentType</code> field in the request.
     * </p>
     * 
     * @param contentType
     *        The type of response. Same as the type specified in the <code>responseContentType</code> field in the
     *        request.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of response. Same as the type specified in the <code>responseContentType</code> field in the request.
     * </p>
     * 
     * @return The type of response. Same as the type specified in the <code>responseContentType</code> field in the
     *         request.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of response. Same as the type specified in the <code>responseContentType</code> field in the request.
     * </p>
     * 
     * @param contentType
     *        The type of response. Same as the type specified in the <code>responseContentType</code> field in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on how you return the messages
     * from you Lambda function or the order that the messages are defined in the bot.
     * </p>
     * 
     * @param messages
     *        A list of messages that were last sent to the user. The messages are ordered based on how you return the
     *        messages from you Lambda function or the order that the messages are defined in the bot.
     */

    public void setMessages(String messages) {
        this.messages = messages;
    }

    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on how you return the messages
     * from you Lambda function or the order that the messages are defined in the bot.
     * </p>
     * 
     * @return A list of messages that were last sent to the user. The messages are ordered based on how you return the
     *         messages from you Lambda function or the order that the messages are defined in the bot.
     */

    public String getMessages() {
        return this.messages;
    }

    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on how you return the messages
     * from you Lambda function or the order that the messages are defined in the bot.
     * </p>
     * 
     * @param messages
     *        A list of messages that were last sent to the user. The messages are ordered based on how you return the
     *        messages from you Lambda function or the order that the messages are defined in the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withMessages(String messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action may be.
     * </p>
     * 
     * @param sessionState
     *        Represents the current state of the dialog between the user and the bot.</p>
     *        <p>
     *        Use this to determine the progress of the conversation and what the next action may be.
     */

    public void setSessionState(String sessionState) {
        this.sessionState = sessionState;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action may be.
     * </p>
     * 
     * @return Represents the current state of the dialog between the user and the bot.</p>
     *         <p>
     *         Use this to determine the progress of the conversation and what the next action may be.
     */

    public String getSessionState() {
        return this.sessionState;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action may be.
     * </p>
     * 
     * @param sessionState
     *        Represents the current state of the dialog between the user and the bot.</p>
     *        <p>
     *        Use this to determine the progress of the conversation and what the next action may be.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withSessionState(String sessionState) {
        setSessionState(sessionState);
        return this;
    }

    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2. These are the same as the
     * <code>requestAttribute</code> parameter in the call to the <code>PutSession</code> operation.
     * </p>
     * 
     * @param requestAttributes
     *        Request-specific information passed between the client application and Amazon Lex V2. These are the same
     *        as the <code>requestAttribute</code> parameter in the call to the <code>PutSession</code> operation.
     */

    public void setRequestAttributes(String requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2. These are the same as the
     * <code>requestAttribute</code> parameter in the call to the <code>PutSession</code> operation.
     * </p>
     * 
     * @return Request-specific information passed between the client application and Amazon Lex V2. These are the same
     *         as the <code>requestAttribute</code> parameter in the call to the <code>PutSession</code> operation.
     */

    public String getRequestAttributes() {
        return this.requestAttributes;
    }

    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2. These are the same as the
     * <code>requestAttribute</code> parameter in the call to the <code>PutSession</code> operation.
     * </p>
     * 
     * @param requestAttributes
     *        Request-specific information passed between the client application and Amazon Lex V2. These are the same
     *        as the <code>requestAttribute</code> parameter in the call to the <code>PutSession</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withRequestAttributes(String requestAttributes) {
        setRequestAttributes(requestAttributes);
        return this;
    }

    /**
     * <p>
     * The identifier of the session that received the data.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session that received the data.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session that received the data.
     * </p>
     * 
     * @return The identifier of the session that received the data.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session that received the data.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session that received the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * If the requested content type was audio, the audio version of the message to convey to the user.
     * </p>
     * 
     * @param audioStream
     *        If the requested content type was audio, the audio version of the message to convey to the user.
     */

    public void setAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * <p>
     * If the requested content type was audio, the audio version of the message to convey to the user.
     * </p>
     * 
     * @return If the requested content type was audio, the audio version of the message to convey to the user.
     */

    public java.io.InputStream getAudioStream() {
        return this.audioStream;
    }

    /**
     * <p>
     * If the requested content type was audio, the audio version of the message to convey to the user.
     * </p>
     * 
     * @param audioStream
     *        If the requested content type was audio, the audio version of the message to convey to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSessionResult withAudioStream(java.io.InputStream audioStream) {
        setAudioStream(audioStream);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getSessionState() != null)
            sb.append("SessionState: ").append(getSessionState()).append(",");
        if (getRequestAttributes() != null)
            sb.append("RequestAttributes: ").append(getRequestAttributes()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getAudioStream() != null)
            sb.append("AudioStream: ").append(getAudioStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSessionResult == false)
            return false;
        PutSessionResult other = (PutSessionResult) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
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
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getAudioStream() == null ^ this.getAudioStream() == null)
            return false;
        if (other.getAudioStream() != null && other.getAudioStream().equals(this.getAudioStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getSessionState() == null) ? 0 : getSessionState().hashCode());
        hashCode = prime * hashCode + ((getRequestAttributes() == null) ? 0 : getRequestAttributes().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getAudioStream() == null) ? 0 : getAudioStream().hashCode());
        return hashCode;
    }

    @Override
    public PutSessionResult clone() {
        try {
            return (PutSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
