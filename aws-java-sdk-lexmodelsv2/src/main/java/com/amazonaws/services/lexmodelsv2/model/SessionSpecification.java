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
 * An object containing information about a specific session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SessionSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the alias of the bot that the session was held with.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The version of the bot that the session was held with.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale of the bot that the session was held with.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The channel that is integrated with the bot that the session was held with.
     * </p>
     */
    private String channel;
    /**
     * <p>
     * The identifier of the session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The date and time when the conversation began. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     */
    private java.util.Date conversationStartTime;
    /**
     * <p>
     * The date and time when the conversation ended. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     */
    private java.util.Date conversationEndTime;
    /**
     * <p>
     * The duration of the conversation in seconds. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     */
    private Long conversationDurationSeconds;
    /**
     * <p>
     * The final state of the conversation. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     */
    private String conversationEndState;
    /**
     * <p>
     * The mode of the session. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Speech</code> – The session was spoken.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Text</code> – The session was written.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DTMF</code> – The session used a touch-tone keypad (Dual Tone Multi-Frequency).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MultiMode</code> – The session used multiple modes.
     * </p>
     * </li>
     * </ul>
     */
    private String mode;
    /**
     * <p>
     * The number of turns that the session took.
     * </p>
     */
    private Long numberOfTurns;
    /**
     * <p>
     * A list of objects containing the name of an intent that was invoked.
     * </p>
     */
    private java.util.List<InvokedIntentSample> invokedIntentSamples;
    /**
     * <p>
     * The identifier of the first request in a session.
     * </p>
     */
    private String originatingRequestId;

    /**
     * <p>
     * The identifier of the alias of the bot that the session was held with.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the alias of the bot that the session was held with.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The identifier of the alias of the bot that the session was held with.
     * </p>
     * 
     * @return The identifier of the alias of the bot that the session was held with.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The identifier of the alias of the bot that the session was held with.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the alias of the bot that the session was held with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that the session was held with.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that the session was held with.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that the session was held with.
     * </p>
     * 
     * @return The version of the bot that the session was held with.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that the session was held with.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that the session was held with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale of the bot that the session was held with.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot that the session was held with.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale of the bot that the session was held with.
     * </p>
     * 
     * @return The locale of the bot that the session was held with.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale of the bot that the session was held with.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot that the session was held with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The channel that is integrated with the bot that the session was held with.
     * </p>
     * 
     * @param channel
     *        The channel that is integrated with the bot that the session was held with.
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channel that is integrated with the bot that the session was held with.
     * </p>
     * 
     * @return The channel that is integrated with the bot that the session was held with.
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The channel that is integrated with the bot that the session was held with.
     * </p>
     * 
     * @param channel
     *        The channel that is integrated with the bot that the session was held with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The identifier of the session.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session.
     * </p>
     * 
     * @return The identifier of the session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The date and time when the conversation began. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationStartTime
     *        The date and time when the conversation began. A conversation is defined as a unique combination of a
     *        <code>sessionId</code> and an <code>originatingRequestId</code>.
     */

    public void setConversationStartTime(java.util.Date conversationStartTime) {
        this.conversationStartTime = conversationStartTime;
    }

    /**
     * <p>
     * The date and time when the conversation began. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @return The date and time when the conversation began. A conversation is defined as a unique combination of a
     *         <code>sessionId</code> and an <code>originatingRequestId</code>.
     */

    public java.util.Date getConversationStartTime() {
        return this.conversationStartTime;
    }

    /**
     * <p>
     * The date and time when the conversation began. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationStartTime
     *        The date and time when the conversation began. A conversation is defined as a unique combination of a
     *        <code>sessionId</code> and an <code>originatingRequestId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withConversationStartTime(java.util.Date conversationStartTime) {
        setConversationStartTime(conversationStartTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the conversation ended. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationEndTime
     *        The date and time when the conversation ended. A conversation is defined as a unique combination of a
     *        <code>sessionId</code> and an <code>originatingRequestId</code>.
     */

    public void setConversationEndTime(java.util.Date conversationEndTime) {
        this.conversationEndTime = conversationEndTime;
    }

    /**
     * <p>
     * The date and time when the conversation ended. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @return The date and time when the conversation ended. A conversation is defined as a unique combination of a
     *         <code>sessionId</code> and an <code>originatingRequestId</code>.
     */

    public java.util.Date getConversationEndTime() {
        return this.conversationEndTime;
    }

    /**
     * <p>
     * The date and time when the conversation ended. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationEndTime
     *        The date and time when the conversation ended. A conversation is defined as a unique combination of a
     *        <code>sessionId</code> and an <code>originatingRequestId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withConversationEndTime(java.util.Date conversationEndTime) {
        setConversationEndTime(conversationEndTime);
        return this;
    }

    /**
     * <p>
     * The duration of the conversation in seconds. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationDurationSeconds
     *        The duration of the conversation in seconds. A conversation is defined as a unique combination of a
     *        <code>sessionId</code> and an <code>originatingRequestId</code>.
     */

    public void setConversationDurationSeconds(Long conversationDurationSeconds) {
        this.conversationDurationSeconds = conversationDurationSeconds;
    }

    /**
     * <p>
     * The duration of the conversation in seconds. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @return The duration of the conversation in seconds. A conversation is defined as a unique combination of a
     *         <code>sessionId</code> and an <code>originatingRequestId</code>.
     */

    public Long getConversationDurationSeconds() {
        return this.conversationDurationSeconds;
    }

    /**
     * <p>
     * The duration of the conversation in seconds. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationDurationSeconds
     *        The duration of the conversation in seconds. A conversation is defined as a unique combination of a
     *        <code>sessionId</code> and an <code>originatingRequestId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withConversationDurationSeconds(Long conversationDurationSeconds) {
        setConversationDurationSeconds(conversationDurationSeconds);
        return this;
    }

    /**
     * <p>
     * The final state of the conversation. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationEndState
     *        The final state of the conversation. A conversation is defined as a unique combination of a
     *        <code>sessionId</code> and an <code>originatingRequestId</code>.
     * @see ConversationEndState
     */

    public void setConversationEndState(String conversationEndState) {
        this.conversationEndState = conversationEndState;
    }

    /**
     * <p>
     * The final state of the conversation. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @return The final state of the conversation. A conversation is defined as a unique combination of a
     *         <code>sessionId</code> and an <code>originatingRequestId</code>.
     * @see ConversationEndState
     */

    public String getConversationEndState() {
        return this.conversationEndState;
    }

    /**
     * <p>
     * The final state of the conversation. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationEndState
     *        The final state of the conversation. A conversation is defined as a unique combination of a
     *        <code>sessionId</code> and an <code>originatingRequestId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConversationEndState
     */

    public SessionSpecification withConversationEndState(String conversationEndState) {
        setConversationEndState(conversationEndState);
        return this;
    }

    /**
     * <p>
     * The final state of the conversation. A conversation is defined as a unique combination of a
     * <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationEndState
     *        The final state of the conversation. A conversation is defined as a unique combination of a
     *        <code>sessionId</code> and an <code>originatingRequestId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConversationEndState
     */

    public SessionSpecification withConversationEndState(ConversationEndState conversationEndState) {
        this.conversationEndState = conversationEndState.toString();
        return this;
    }

    /**
     * <p>
     * The mode of the session. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Speech</code> – The session was spoken.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Text</code> – The session was written.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DTMF</code> – The session used a touch-tone keypad (Dual Tone Multi-Frequency).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MultiMode</code> – The session used multiple modes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The mode of the session. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Speech</code> – The session was spoken.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Text</code> – The session was written.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DTMF</code> – The session used a touch-tone keypad (Dual Tone Multi-Frequency).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MultiMode</code> – The session used multiple modes.
     *        </p>
     *        </li>
     * @see AnalyticsModality
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The mode of the session. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Speech</code> – The session was spoken.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Text</code> – The session was written.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DTMF</code> – The session used a touch-tone keypad (Dual Tone Multi-Frequency).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MultiMode</code> – The session used multiple modes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The mode of the session. The possible values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Speech</code> – The session was spoken.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Text</code> – The session was written.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DTMF</code> – The session used a touch-tone keypad (Dual Tone Multi-Frequency).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MultiMode</code> – The session used multiple modes.
     *         </p>
     *         </li>
     * @see AnalyticsModality
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The mode of the session. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Speech</code> – The session was spoken.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Text</code> – The session was written.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DTMF</code> – The session used a touch-tone keypad (Dual Tone Multi-Frequency).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MultiMode</code> – The session used multiple modes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The mode of the session. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Speech</code> – The session was spoken.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Text</code> – The session was written.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DTMF</code> – The session used a touch-tone keypad (Dual Tone Multi-Frequency).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MultiMode</code> – The session used multiple modes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsModality
     */

    public SessionSpecification withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The mode of the session. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Speech</code> – The session was spoken.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Text</code> – The session was written.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DTMF</code> – The session used a touch-tone keypad (Dual Tone Multi-Frequency).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MultiMode</code> – The session used multiple modes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The mode of the session. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Speech</code> – The session was spoken.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Text</code> – The session was written.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DTMF</code> – The session used a touch-tone keypad (Dual Tone Multi-Frequency).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MultiMode</code> – The session used multiple modes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsModality
     */

    public SessionSpecification withMode(AnalyticsModality mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The number of turns that the session took.
     * </p>
     * 
     * @param numberOfTurns
     *        The number of turns that the session took.
     */

    public void setNumberOfTurns(Long numberOfTurns) {
        this.numberOfTurns = numberOfTurns;
    }

    /**
     * <p>
     * The number of turns that the session took.
     * </p>
     * 
     * @return The number of turns that the session took.
     */

    public Long getNumberOfTurns() {
        return this.numberOfTurns;
    }

    /**
     * <p>
     * The number of turns that the session took.
     * </p>
     * 
     * @param numberOfTurns
     *        The number of turns that the session took.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withNumberOfTurns(Long numberOfTurns) {
        setNumberOfTurns(numberOfTurns);
        return this;
    }

    /**
     * <p>
     * A list of objects containing the name of an intent that was invoked.
     * </p>
     * 
     * @return A list of objects containing the name of an intent that was invoked.
     */

    public java.util.List<InvokedIntentSample> getInvokedIntentSamples() {
        return invokedIntentSamples;
    }

    /**
     * <p>
     * A list of objects containing the name of an intent that was invoked.
     * </p>
     * 
     * @param invokedIntentSamples
     *        A list of objects containing the name of an intent that was invoked.
     */

    public void setInvokedIntentSamples(java.util.Collection<InvokedIntentSample> invokedIntentSamples) {
        if (invokedIntentSamples == null) {
            this.invokedIntentSamples = null;
            return;
        }

        this.invokedIntentSamples = new java.util.ArrayList<InvokedIntentSample>(invokedIntentSamples);
    }

    /**
     * <p>
     * A list of objects containing the name of an intent that was invoked.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvokedIntentSamples(java.util.Collection)} or {@link #withInvokedIntentSamples(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param invokedIntentSamples
     *        A list of objects containing the name of an intent that was invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withInvokedIntentSamples(InvokedIntentSample... invokedIntentSamples) {
        if (this.invokedIntentSamples == null) {
            setInvokedIntentSamples(new java.util.ArrayList<InvokedIntentSample>(invokedIntentSamples.length));
        }
        for (InvokedIntentSample ele : invokedIntentSamples) {
            this.invokedIntentSamples.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing the name of an intent that was invoked.
     * </p>
     * 
     * @param invokedIntentSamples
     *        A list of objects containing the name of an intent that was invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withInvokedIntentSamples(java.util.Collection<InvokedIntentSample> invokedIntentSamples) {
        setInvokedIntentSamples(invokedIntentSamples);
        return this;
    }

    /**
     * <p>
     * The identifier of the first request in a session.
     * </p>
     * 
     * @param originatingRequestId
     *        The identifier of the first request in a session.
     */

    public void setOriginatingRequestId(String originatingRequestId) {
        this.originatingRequestId = originatingRequestId;
    }

    /**
     * <p>
     * The identifier of the first request in a session.
     * </p>
     * 
     * @return The identifier of the first request in a session.
     */

    public String getOriginatingRequestId() {
        return this.originatingRequestId;
    }

    /**
     * <p>
     * The identifier of the first request in a session.
     * </p>
     * 
     * @param originatingRequestId
     *        The identifier of the first request in a session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionSpecification withOriginatingRequestId(String originatingRequestId) {
        setOriginatingRequestId(originatingRequestId);
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
        if (getBotAliasId() != null)
            sb.append("BotAliasId: ").append(getBotAliasId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getConversationStartTime() != null)
            sb.append("ConversationStartTime: ").append(getConversationStartTime()).append(",");
        if (getConversationEndTime() != null)
            sb.append("ConversationEndTime: ").append(getConversationEndTime()).append(",");
        if (getConversationDurationSeconds() != null)
            sb.append("ConversationDurationSeconds: ").append(getConversationDurationSeconds()).append(",");
        if (getConversationEndState() != null)
            sb.append("ConversationEndState: ").append(getConversationEndState()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getNumberOfTurns() != null)
            sb.append("NumberOfTurns: ").append(getNumberOfTurns()).append(",");
        if (getInvokedIntentSamples() != null)
            sb.append("InvokedIntentSamples: ").append(getInvokedIntentSamples()).append(",");
        if (getOriginatingRequestId() != null)
            sb.append("OriginatingRequestId: ").append(getOriginatingRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionSpecification == false)
            return false;
        SessionSpecification other = (SessionSpecification) obj;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getConversationStartTime() == null ^ this.getConversationStartTime() == null)
            return false;
        if (other.getConversationStartTime() != null && other.getConversationStartTime().equals(this.getConversationStartTime()) == false)
            return false;
        if (other.getConversationEndTime() == null ^ this.getConversationEndTime() == null)
            return false;
        if (other.getConversationEndTime() != null && other.getConversationEndTime().equals(this.getConversationEndTime()) == false)
            return false;
        if (other.getConversationDurationSeconds() == null ^ this.getConversationDurationSeconds() == null)
            return false;
        if (other.getConversationDurationSeconds() != null && other.getConversationDurationSeconds().equals(this.getConversationDurationSeconds()) == false)
            return false;
        if (other.getConversationEndState() == null ^ this.getConversationEndState() == null)
            return false;
        if (other.getConversationEndState() != null && other.getConversationEndState().equals(this.getConversationEndState()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getNumberOfTurns() == null ^ this.getNumberOfTurns() == null)
            return false;
        if (other.getNumberOfTurns() != null && other.getNumberOfTurns().equals(this.getNumberOfTurns()) == false)
            return false;
        if (other.getInvokedIntentSamples() == null ^ this.getInvokedIntentSamples() == null)
            return false;
        if (other.getInvokedIntentSamples() != null && other.getInvokedIntentSamples().equals(this.getInvokedIntentSamples()) == false)
            return false;
        if (other.getOriginatingRequestId() == null ^ this.getOriginatingRequestId() == null)
            return false;
        if (other.getOriginatingRequestId() != null && other.getOriginatingRequestId().equals(this.getOriginatingRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getConversationStartTime() == null) ? 0 : getConversationStartTime().hashCode());
        hashCode = prime * hashCode + ((getConversationEndTime() == null) ? 0 : getConversationEndTime().hashCode());
        hashCode = prime * hashCode + ((getConversationDurationSeconds() == null) ? 0 : getConversationDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getConversationEndState() == null) ? 0 : getConversationEndState().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTurns() == null) ? 0 : getNumberOfTurns().hashCode());
        hashCode = prime * hashCode + ((getInvokedIntentSamples() == null) ? 0 : getInvokedIntentSamples().hashCode());
        hashCode = prime * hashCode + ((getOriginatingRequestId() == null) ? 0 : getOriginatingRequestId().hashCode());
        return hashCode;
    }

    @Override
    public SessionSpecification clone() {
        try {
            return (SessionSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SessionSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
