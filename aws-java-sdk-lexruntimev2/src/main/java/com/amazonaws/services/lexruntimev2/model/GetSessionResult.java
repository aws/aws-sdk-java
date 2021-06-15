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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/GetSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the returned session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on the order that your
     * returned the messages from your Lambda function or the order that messages are defined in the bot.
     * </p>
     */
    private java.util.List<Message> messages;
    /**
     * <p>
     * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     */
    private java.util.List<Interpretation> interpretations;
    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * You can use this to determine the progress of the conversation and what the next action might be.
     * </p>
     */
    private SessionState sessionState;

    /**
     * <p>
     * The identifier of the returned session.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the returned session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the returned session.
     * </p>
     * 
     * @return The identifier of the returned session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the returned session.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the returned session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on the order that your
     * returned the messages from your Lambda function or the order that messages are defined in the bot.
     * </p>
     * 
     * @return A list of messages that were last sent to the user. The messages are ordered based on the order that your
     *         returned the messages from your Lambda function or the order that messages are defined in the bot.
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * A list of messages that were last sent to the user. The messages are ordered based on the order that your
     * returned the messages from your Lambda function or the order that messages are defined in the bot.
     * </p>
     * 
     * @param messages
     *        A list of messages that were last sent to the user. The messages are ordered based on the order that your
     *        returned the messages from your Lambda function or the order that messages are defined in the bot.
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
     * A list of messages that were last sent to the user. The messages are ordered based on the order that your
     * returned the messages from your Lambda function or the order that messages are defined in the bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        A list of messages that were last sent to the user. The messages are ordered based on the order that your
     *        returned the messages from your Lambda function or the order that messages are defined in the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withMessages(Message... messages) {
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
     * A list of messages that were last sent to the user. The messages are ordered based on the order that your
     * returned the messages from your Lambda function or the order that messages are defined in the bot.
     * </p>
     * 
     * @param messages
     *        A list of messages that were last sent to the user. The messages are ordered based on the order that your
     *        returned the messages from your Lambda function or the order that messages are defined in the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * 
     * @return A list of intents that Amazon Lex V2 determined might satisfy the user's utterance. </p>
     *         <p>
     *         Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     *         interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *         expressed in the utterance.
     */

    public java.util.List<Interpretation> getInterpretations() {
        return interpretations;
    }

    /**
     * <p>
     * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * 
     * @param interpretations
     *        A list of intents that Amazon Lex V2 determined might satisfy the user's utterance. </p>
     *        <p>
     *        Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     *        interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *        expressed in the utterance.
     */

    public void setInterpretations(java.util.Collection<Interpretation> interpretations) {
        if (interpretations == null) {
            this.interpretations = null;
            return;
        }

        this.interpretations = new java.util.ArrayList<Interpretation>(interpretations);
    }

    /**
     * <p>
     * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInterpretations(java.util.Collection)} or {@link #withInterpretations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param interpretations
     *        A list of intents that Amazon Lex V2 determined might satisfy the user's utterance. </p>
     *        <p>
     *        Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     *        interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *        expressed in the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withInterpretations(Interpretation... interpretations) {
        if (this.interpretations == null) {
            setInterpretations(new java.util.ArrayList<Interpretation>(interpretations.length));
        }
        for (Interpretation ele : interpretations) {
            this.interpretations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * 
     * @param interpretations
     *        A list of intents that Amazon Lex V2 determined might satisfy the user's utterance. </p>
     *        <p>
     *        Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the
     *        interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *        expressed in the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withInterpretations(java.util.Collection<Interpretation> interpretations) {
        setInterpretations(interpretations);
        return this;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * You can use this to determine the progress of the conversation and what the next action might be.
     * </p>
     * 
     * @param sessionState
     *        Represents the current state of the dialog between the user and the bot.</p>
     *        <p>
     *        You can use this to determine the progress of the conversation and what the next action might be.
     */

    public void setSessionState(SessionState sessionState) {
        this.sessionState = sessionState;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * You can use this to determine the progress of the conversation and what the next action might be.
     * </p>
     * 
     * @return Represents the current state of the dialog between the user and the bot.</p>
     *         <p>
     *         You can use this to determine the progress of the conversation and what the next action might be.
     */

    public SessionState getSessionState() {
        return this.sessionState;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * You can use this to determine the progress of the conversation and what the next action might be.
     * </p>
     * 
     * @param sessionState
     *        Represents the current state of the dialog between the user and the bot.</p>
     *        <p>
     *        You can use this to determine the progress of the conversation and what the next action might be.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withSessionState(SessionState sessionState) {
        setSessionState(sessionState);
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getInterpretations() != null)
            sb.append("Interpretations: ").append(getInterpretations()).append(",");
        if (getSessionState() != null)
            sb.append("SessionState: ").append(getSessionState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionResult == false)
            return false;
        GetSessionResult other = (GetSessionResult) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getInterpretations() == null ^ this.getInterpretations() == null)
            return false;
        if (other.getInterpretations() != null && other.getInterpretations().equals(this.getInterpretations()) == false)
            return false;
        if (other.getSessionState() == null ^ this.getSessionState() == null)
            return false;
        if (other.getSessionState() != null && other.getSessionState().equals(this.getSessionState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getInterpretations() == null) ? 0 : getInterpretations().hashCode());
        hashCode = prime * hashCode + ((getSessionState() == null) ? 0 : getSessionState().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionResult clone() {
        try {
            return (GetSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
