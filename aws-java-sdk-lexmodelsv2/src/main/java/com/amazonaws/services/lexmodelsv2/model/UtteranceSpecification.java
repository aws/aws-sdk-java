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
 * An object containing information about a specific utterance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UtteranceSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtteranceSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the alias of the bot that the utterance was made to.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The version of the bot that the utterance was made to.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale of the bot that the utterance was made to.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The identifier of the session that the utterance was made in.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The channel that is integrated with the bot that the utterance was made to.
     * </p>
     */
    private String channel;
    /**
     * <p>
     * The mode of the session. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Speech</code> – The session consisted of spoken dialogue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Text</code> – The session consisted of written dialogue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DTMF</code> – The session consisted of touch-tone keypad (Dual Tone Multi-Frequency) key presses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MultiMode</code> – The session consisted of multiple modes.
     * </p>
     * </li>
     * </ul>
     */
    private String mode;
    /**
     * <p>
     * The date and time when the conversation in which the utterance took place began. A conversation is defined as a
     * unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     */
    private java.util.Date conversationStartTime;
    /**
     * <p>
     * The date and time when the conversation in which the utterance took place ended. A conversation is defined as a
     * unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     */
    private java.util.Date conversationEndTime;
    /**
     * <p>
     * The text of the utterance.
     * </p>
     */
    private String utterance;
    /**
     * <p>
     * The date and time when the utterance took place.
     * </p>
     */
    private java.util.Date utteranceTimestamp;
    /**
     * <p>
     * The duration in milliseconds of the audio associated with the utterance.
     * </p>
     */
    private Long audioVoiceDurationMillis;
    /**
     * <p>
     * Specifies whether the bot understood the utterance or not.
     * </p>
     */
    private Boolean utteranceUnderstood;
    /**
     * <p>
     * The input type of the utterance. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format: audio data must be in little-endian byte order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/l16; rate=16000; channels=1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/x-l16; sample-rate=16000; channel-count=1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String inputType;
    /**
     * <p>
     * The output type of the utterance. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm (16 KHz)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/</code> (defaults to <code>mpeg</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     */
    private String outputType;
    /**
     * <p>
     * The name of the intent that the utterance is associated to.
     * </p>
     */
    private String associatedIntentName;
    /**
     * <p>
     * The name of the slot that the utterance is associated to.
     * </p>
     */
    private String associatedSlotName;
    /**
     * <p>
     * The state of the intent that the utterance is associated to.
     * </p>
     */
    private String intentState;
    /**
     * <p>
     * The type of dialog action that the utterance is associated to. See the <code>type</code> field in <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_DialogAction.html">DialogAction</a> for
     * more information.
     * </p>
     */
    private String dialogActionType;
    /**
     * <p>
     * The identifier for the audio of the bot response.
     * </p>
     */
    private String botResponseAudioVoiceId;
    /**
     * <p>
     * The slots that have been filled in the session by the time of the utterance.
     * </p>
     */
    private String slotsFilledInSession;
    /**
     * <p>
     * The identifier of the request associated with the utterance.
     * </p>
     */
    private String utteranceRequestId;
    /**
     * <p>
     * A list of objects containing information about the bot response to the utterance.
     * </p>
     */
    private java.util.List<UtteranceBotResponse> botResponses;

    /**
     * <p>
     * The identifier of the alias of the bot that the utterance was made to.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the alias of the bot that the utterance was made to.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The identifier of the alias of the bot that the utterance was made to.
     * </p>
     * 
     * @return The identifier of the alias of the bot that the utterance was made to.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The identifier of the alias of the bot that the utterance was made to.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the alias of the bot that the utterance was made to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that the utterance was made to.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that the utterance was made to.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that the utterance was made to.
     * </p>
     * 
     * @return The version of the bot that the utterance was made to.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that the utterance was made to.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that the utterance was made to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale of the bot that the utterance was made to.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot that the utterance was made to.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale of the bot that the utterance was made to.
     * </p>
     * 
     * @return The locale of the bot that the utterance was made to.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale of the bot that the utterance was made to.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot that the utterance was made to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the session that the utterance was made in.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session that the utterance was made in.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session that the utterance was made in.
     * </p>
     * 
     * @return The identifier of the session that the utterance was made in.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session that the utterance was made in.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session that the utterance was made in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The channel that is integrated with the bot that the utterance was made to.
     * </p>
     * 
     * @param channel
     *        The channel that is integrated with the bot that the utterance was made to.
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channel that is integrated with the bot that the utterance was made to.
     * </p>
     * 
     * @return The channel that is integrated with the bot that the utterance was made to.
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The channel that is integrated with the bot that the utterance was made to.
     * </p>
     * 
     * @param channel
     *        The channel that is integrated with the bot that the utterance was made to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The mode of the session. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Speech</code> – The session consisted of spoken dialogue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Text</code> – The session consisted of written dialogue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DTMF</code> – The session consisted of touch-tone keypad (Dual Tone Multi-Frequency) key presses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MultiMode</code> – The session consisted of multiple modes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The mode of the session. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Speech</code> – The session consisted of spoken dialogue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Text</code> – The session consisted of written dialogue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DTMF</code> – The session consisted of touch-tone keypad (Dual Tone Multi-Frequency) key presses.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MultiMode</code> – The session consisted of multiple modes.
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
     * <code>Speech</code> – The session consisted of spoken dialogue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Text</code> – The session consisted of written dialogue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DTMF</code> – The session consisted of touch-tone keypad (Dual Tone Multi-Frequency) key presses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MultiMode</code> – The session consisted of multiple modes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The mode of the session. The possible values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Speech</code> – The session consisted of spoken dialogue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Text</code> – The session consisted of written dialogue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DTMF</code> – The session consisted of touch-tone keypad (Dual Tone Multi-Frequency) key presses.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MultiMode</code> – The session consisted of multiple modes.
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
     * <code>Speech</code> – The session consisted of spoken dialogue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Text</code> – The session consisted of written dialogue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DTMF</code> – The session consisted of touch-tone keypad (Dual Tone Multi-Frequency) key presses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MultiMode</code> – The session consisted of multiple modes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The mode of the session. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Speech</code> – The session consisted of spoken dialogue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Text</code> – The session consisted of written dialogue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DTMF</code> – The session consisted of touch-tone keypad (Dual Tone Multi-Frequency) key presses.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MultiMode</code> – The session consisted of multiple modes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsModality
     */

    public UtteranceSpecification withMode(String mode) {
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
     * <code>Speech</code> – The session consisted of spoken dialogue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Text</code> – The session consisted of written dialogue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DTMF</code> – The session consisted of touch-tone keypad (Dual Tone Multi-Frequency) key presses.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MultiMode</code> – The session consisted of multiple modes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The mode of the session. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Speech</code> – The session consisted of spoken dialogue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Text</code> – The session consisted of written dialogue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DTMF</code> – The session consisted of touch-tone keypad (Dual Tone Multi-Frequency) key presses.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MultiMode</code> – The session consisted of multiple modes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsModality
     */

    public UtteranceSpecification withMode(AnalyticsModality mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the conversation in which the utterance took place began. A conversation is defined as a
     * unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationStartTime
     *        The date and time when the conversation in which the utterance took place began. A conversation is defined
     *        as a unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     */

    public void setConversationStartTime(java.util.Date conversationStartTime) {
        this.conversationStartTime = conversationStartTime;
    }

    /**
     * <p>
     * The date and time when the conversation in which the utterance took place began. A conversation is defined as a
     * unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @return The date and time when the conversation in which the utterance took place began. A conversation is
     *         defined as a unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     */

    public java.util.Date getConversationStartTime() {
        return this.conversationStartTime;
    }

    /**
     * <p>
     * The date and time when the conversation in which the utterance took place began. A conversation is defined as a
     * unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationStartTime
     *        The date and time when the conversation in which the utterance took place began. A conversation is defined
     *        as a unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withConversationStartTime(java.util.Date conversationStartTime) {
        setConversationStartTime(conversationStartTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the conversation in which the utterance took place ended. A conversation is defined as a
     * unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationEndTime
     *        The date and time when the conversation in which the utterance took place ended. A conversation is defined
     *        as a unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     */

    public void setConversationEndTime(java.util.Date conversationEndTime) {
        this.conversationEndTime = conversationEndTime;
    }

    /**
     * <p>
     * The date and time when the conversation in which the utterance took place ended. A conversation is defined as a
     * unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @return The date and time when the conversation in which the utterance took place ended. A conversation is
     *         defined as a unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     */

    public java.util.Date getConversationEndTime() {
        return this.conversationEndTime;
    }

    /**
     * <p>
     * The date and time when the conversation in which the utterance took place ended. A conversation is defined as a
     * unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     * </p>
     * 
     * @param conversationEndTime
     *        The date and time when the conversation in which the utterance took place ended. A conversation is defined
     *        as a unique combination of a <code>sessionId</code> and an <code>originatingRequestId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withConversationEndTime(java.util.Date conversationEndTime) {
        setConversationEndTime(conversationEndTime);
        return this;
    }

    /**
     * <p>
     * The text of the utterance.
     * </p>
     * 
     * @param utterance
     *        The text of the utterance.
     */

    public void setUtterance(String utterance) {
        this.utterance = utterance;
    }

    /**
     * <p>
     * The text of the utterance.
     * </p>
     * 
     * @return The text of the utterance.
     */

    public String getUtterance() {
        return this.utterance;
    }

    /**
     * <p>
     * The text of the utterance.
     * </p>
     * 
     * @param utterance
     *        The text of the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withUtterance(String utterance) {
        setUtterance(utterance);
        return this;
    }

    /**
     * <p>
     * The date and time when the utterance took place.
     * </p>
     * 
     * @param utteranceTimestamp
     *        The date and time when the utterance took place.
     */

    public void setUtteranceTimestamp(java.util.Date utteranceTimestamp) {
        this.utteranceTimestamp = utteranceTimestamp;
    }

    /**
     * <p>
     * The date and time when the utterance took place.
     * </p>
     * 
     * @return The date and time when the utterance took place.
     */

    public java.util.Date getUtteranceTimestamp() {
        return this.utteranceTimestamp;
    }

    /**
     * <p>
     * The date and time when the utterance took place.
     * </p>
     * 
     * @param utteranceTimestamp
     *        The date and time when the utterance took place.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withUtteranceTimestamp(java.util.Date utteranceTimestamp) {
        setUtteranceTimestamp(utteranceTimestamp);
        return this;
    }

    /**
     * <p>
     * The duration in milliseconds of the audio associated with the utterance.
     * </p>
     * 
     * @param audioVoiceDurationMillis
     *        The duration in milliseconds of the audio associated with the utterance.
     */

    public void setAudioVoiceDurationMillis(Long audioVoiceDurationMillis) {
        this.audioVoiceDurationMillis = audioVoiceDurationMillis;
    }

    /**
     * <p>
     * The duration in milliseconds of the audio associated with the utterance.
     * </p>
     * 
     * @return The duration in milliseconds of the audio associated with the utterance.
     */

    public Long getAudioVoiceDurationMillis() {
        return this.audioVoiceDurationMillis;
    }

    /**
     * <p>
     * The duration in milliseconds of the audio associated with the utterance.
     * </p>
     * 
     * @param audioVoiceDurationMillis
     *        The duration in milliseconds of the audio associated with the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withAudioVoiceDurationMillis(Long audioVoiceDurationMillis) {
        setAudioVoiceDurationMillis(audioVoiceDurationMillis);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bot understood the utterance or not.
     * </p>
     * 
     * @param utteranceUnderstood
     *        Specifies whether the bot understood the utterance or not.
     */

    public void setUtteranceUnderstood(Boolean utteranceUnderstood) {
        this.utteranceUnderstood = utteranceUnderstood;
    }

    /**
     * <p>
     * Specifies whether the bot understood the utterance or not.
     * </p>
     * 
     * @return Specifies whether the bot understood the utterance or not.
     */

    public Boolean getUtteranceUnderstood() {
        return this.utteranceUnderstood;
    }

    /**
     * <p>
     * Specifies whether the bot understood the utterance or not.
     * </p>
     * 
     * @param utteranceUnderstood
     *        Specifies whether the bot understood the utterance or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withUtteranceUnderstood(Boolean utteranceUnderstood) {
        setUtteranceUnderstood(utteranceUnderstood);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bot understood the utterance or not.
     * </p>
     * 
     * @return Specifies whether the bot understood the utterance or not.
     */

    public Boolean isUtteranceUnderstood() {
        return this.utteranceUnderstood;
    }

    /**
     * <p>
     * The input type of the utterance. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format: audio data must be in little-endian byte order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/l16; rate=16000; channels=1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/x-l16; sample-rate=16000; channel-count=1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param inputType
     *        The input type of the utterance. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PCM format: audio data must be in little-endian byte order.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>audio/l16; rate=16000; channels=1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/x-l16; sample-rate=16000; channel-count=1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Opus format
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Text format
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>text/plain; charset=utf-8</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /**
     * <p>
     * The input type of the utterance. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format: audio data must be in little-endian byte order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/l16; rate=16000; channels=1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/x-l16; sample-rate=16000; channel-count=1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The input type of the utterance. The possible values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PCM format: audio data must be in little-endian byte order.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>audio/l16; rate=16000; channels=1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/x-l16; sample-rate=16000; channel-count=1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Opus format
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Text format
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>text/plain; charset=utf-8</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getInputType() {
        return this.inputType;
    }

    /**
     * <p>
     * The input type of the utterance. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format: audio data must be in little-endian byte order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/l16; rate=16000; channels=1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/x-l16; sample-rate=16000; channel-count=1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param inputType
     *        The input type of the utterance. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PCM format: audio data must be in little-endian byte order.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>audio/l16; rate=16000; channels=1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/x-l16; sample-rate=16000; channel-count=1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Opus format
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Text format
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>text/plain; charset=utf-8</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withInputType(String inputType) {
        setInputType(inputType);
        return this;
    }

    /**
     * <p>
     * The output type of the utterance. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm (16 KHz)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/</code> (defaults to <code>mpeg</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param outputType
     *        The output type of the utterance. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>audio/mpeg</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/ogg</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/pcm (16 KHz)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/</code> (defaults to <code>mpeg</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>text/plain; charset=utf-8</code>
     *        </p>
     *        </li>
     */

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    /**
     * <p>
     * The output type of the utterance. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm (16 KHz)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/</code> (defaults to <code>mpeg</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The output type of the utterance. The possible values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>audio/mpeg</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/ogg</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/pcm (16 KHz)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/</code> (defaults to <code>mpeg</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>text/plain; charset=utf-8</code>
     *         </p>
     *         </li>
     */

    public String getOutputType() {
        return this.outputType;
    }

    /**
     * <p>
     * The output type of the utterance. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm (16 KHz)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/</code> (defaults to <code>mpeg</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param outputType
     *        The output type of the utterance. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>audio/mpeg</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/ogg</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/pcm (16 KHz)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>audio/</code> (defaults to <code>mpeg</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>text/plain; charset=utf-8</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withOutputType(String outputType) {
        setOutputType(outputType);
        return this;
    }

    /**
     * <p>
     * The name of the intent that the utterance is associated to.
     * </p>
     * 
     * @param associatedIntentName
     *        The name of the intent that the utterance is associated to.
     */

    public void setAssociatedIntentName(String associatedIntentName) {
        this.associatedIntentName = associatedIntentName;
    }

    /**
     * <p>
     * The name of the intent that the utterance is associated to.
     * </p>
     * 
     * @return The name of the intent that the utterance is associated to.
     */

    public String getAssociatedIntentName() {
        return this.associatedIntentName;
    }

    /**
     * <p>
     * The name of the intent that the utterance is associated to.
     * </p>
     * 
     * @param associatedIntentName
     *        The name of the intent that the utterance is associated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withAssociatedIntentName(String associatedIntentName) {
        setAssociatedIntentName(associatedIntentName);
        return this;
    }

    /**
     * <p>
     * The name of the slot that the utterance is associated to.
     * </p>
     * 
     * @param associatedSlotName
     *        The name of the slot that the utterance is associated to.
     */

    public void setAssociatedSlotName(String associatedSlotName) {
        this.associatedSlotName = associatedSlotName;
    }

    /**
     * <p>
     * The name of the slot that the utterance is associated to.
     * </p>
     * 
     * @return The name of the slot that the utterance is associated to.
     */

    public String getAssociatedSlotName() {
        return this.associatedSlotName;
    }

    /**
     * <p>
     * The name of the slot that the utterance is associated to.
     * </p>
     * 
     * @param associatedSlotName
     *        The name of the slot that the utterance is associated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withAssociatedSlotName(String associatedSlotName) {
        setAssociatedSlotName(associatedSlotName);
        return this;
    }

    /**
     * <p>
     * The state of the intent that the utterance is associated to.
     * </p>
     * 
     * @param intentState
     *        The state of the intent that the utterance is associated to.
     * @see IntentState
     */

    public void setIntentState(String intentState) {
        this.intentState = intentState;
    }

    /**
     * <p>
     * The state of the intent that the utterance is associated to.
     * </p>
     * 
     * @return The state of the intent that the utterance is associated to.
     * @see IntentState
     */

    public String getIntentState() {
        return this.intentState;
    }

    /**
     * <p>
     * The state of the intent that the utterance is associated to.
     * </p>
     * 
     * @param intentState
     *        The state of the intent that the utterance is associated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntentState
     */

    public UtteranceSpecification withIntentState(String intentState) {
        setIntentState(intentState);
        return this;
    }

    /**
     * <p>
     * The state of the intent that the utterance is associated to.
     * </p>
     * 
     * @param intentState
     *        The state of the intent that the utterance is associated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntentState
     */

    public UtteranceSpecification withIntentState(IntentState intentState) {
        this.intentState = intentState.toString();
        return this;
    }

    /**
     * <p>
     * The type of dialog action that the utterance is associated to. See the <code>type</code> field in <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_DialogAction.html">DialogAction</a> for
     * more information.
     * </p>
     * 
     * @param dialogActionType
     *        The type of dialog action that the utterance is associated to. See the <code>type</code> field in <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_DialogAction.html"
     *        >DialogAction</a> for more information.
     */

    public void setDialogActionType(String dialogActionType) {
        this.dialogActionType = dialogActionType;
    }

    /**
     * <p>
     * The type of dialog action that the utterance is associated to. See the <code>type</code> field in <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_DialogAction.html">DialogAction</a> for
     * more information.
     * </p>
     * 
     * @return The type of dialog action that the utterance is associated to. See the <code>type</code> field in <a
     *         href=
     *         "https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_DialogAction.html">DialogAction</a>
     *         for more information.
     */

    public String getDialogActionType() {
        return this.dialogActionType;
    }

    /**
     * <p>
     * The type of dialog action that the utterance is associated to. See the <code>type</code> field in <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_DialogAction.html">DialogAction</a> for
     * more information.
     * </p>
     * 
     * @param dialogActionType
     *        The type of dialog action that the utterance is associated to. See the <code>type</code> field in <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_runtime_DialogAction.html"
     *        >DialogAction</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withDialogActionType(String dialogActionType) {
        setDialogActionType(dialogActionType);
        return this;
    }

    /**
     * <p>
     * The identifier for the audio of the bot response.
     * </p>
     * 
     * @param botResponseAudioVoiceId
     *        The identifier for the audio of the bot response.
     */

    public void setBotResponseAudioVoiceId(String botResponseAudioVoiceId) {
        this.botResponseAudioVoiceId = botResponseAudioVoiceId;
    }

    /**
     * <p>
     * The identifier for the audio of the bot response.
     * </p>
     * 
     * @return The identifier for the audio of the bot response.
     */

    public String getBotResponseAudioVoiceId() {
        return this.botResponseAudioVoiceId;
    }

    /**
     * <p>
     * The identifier for the audio of the bot response.
     * </p>
     * 
     * @param botResponseAudioVoiceId
     *        The identifier for the audio of the bot response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withBotResponseAudioVoiceId(String botResponseAudioVoiceId) {
        setBotResponseAudioVoiceId(botResponseAudioVoiceId);
        return this;
    }

    /**
     * <p>
     * The slots that have been filled in the session by the time of the utterance.
     * </p>
     * 
     * @param slotsFilledInSession
     *        The slots that have been filled in the session by the time of the utterance.
     */

    public void setSlotsFilledInSession(String slotsFilledInSession) {
        this.slotsFilledInSession = slotsFilledInSession;
    }

    /**
     * <p>
     * The slots that have been filled in the session by the time of the utterance.
     * </p>
     * 
     * @return The slots that have been filled in the session by the time of the utterance.
     */

    public String getSlotsFilledInSession() {
        return this.slotsFilledInSession;
    }

    /**
     * <p>
     * The slots that have been filled in the session by the time of the utterance.
     * </p>
     * 
     * @param slotsFilledInSession
     *        The slots that have been filled in the session by the time of the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withSlotsFilledInSession(String slotsFilledInSession) {
        setSlotsFilledInSession(slotsFilledInSession);
        return this;
    }

    /**
     * <p>
     * The identifier of the request associated with the utterance.
     * </p>
     * 
     * @param utteranceRequestId
     *        The identifier of the request associated with the utterance.
     */

    public void setUtteranceRequestId(String utteranceRequestId) {
        this.utteranceRequestId = utteranceRequestId;
    }

    /**
     * <p>
     * The identifier of the request associated with the utterance.
     * </p>
     * 
     * @return The identifier of the request associated with the utterance.
     */

    public String getUtteranceRequestId() {
        return this.utteranceRequestId;
    }

    /**
     * <p>
     * The identifier of the request associated with the utterance.
     * </p>
     * 
     * @param utteranceRequestId
     *        The identifier of the request associated with the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withUtteranceRequestId(String utteranceRequestId) {
        setUtteranceRequestId(utteranceRequestId);
        return this;
    }

    /**
     * <p>
     * A list of objects containing information about the bot response to the utterance.
     * </p>
     * 
     * @return A list of objects containing information about the bot response to the utterance.
     */

    public java.util.List<UtteranceBotResponse> getBotResponses() {
        return botResponses;
    }

    /**
     * <p>
     * A list of objects containing information about the bot response to the utterance.
     * </p>
     * 
     * @param botResponses
     *        A list of objects containing information about the bot response to the utterance.
     */

    public void setBotResponses(java.util.Collection<UtteranceBotResponse> botResponses) {
        if (botResponses == null) {
            this.botResponses = null;
            return;
        }

        this.botResponses = new java.util.ArrayList<UtteranceBotResponse>(botResponses);
    }

    /**
     * <p>
     * A list of objects containing information about the bot response to the utterance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotResponses(java.util.Collection)} or {@link #withBotResponses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param botResponses
     *        A list of objects containing information about the bot response to the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withBotResponses(UtteranceBotResponse... botResponses) {
        if (this.botResponses == null) {
            setBotResponses(new java.util.ArrayList<UtteranceBotResponse>(botResponses.length));
        }
        for (UtteranceBotResponse ele : botResponses) {
            this.botResponses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing information about the bot response to the utterance.
     * </p>
     * 
     * @param botResponses
     *        A list of objects containing information about the bot response to the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceSpecification withBotResponses(java.util.Collection<UtteranceBotResponse> botResponses) {
        setBotResponses(botResponses);
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getConversationStartTime() != null)
            sb.append("ConversationStartTime: ").append(getConversationStartTime()).append(",");
        if (getConversationEndTime() != null)
            sb.append("ConversationEndTime: ").append(getConversationEndTime()).append(",");
        if (getUtterance() != null)
            sb.append("Utterance: ").append(getUtterance()).append(",");
        if (getUtteranceTimestamp() != null)
            sb.append("UtteranceTimestamp: ").append(getUtteranceTimestamp()).append(",");
        if (getAudioVoiceDurationMillis() != null)
            sb.append("AudioVoiceDurationMillis: ").append(getAudioVoiceDurationMillis()).append(",");
        if (getUtteranceUnderstood() != null)
            sb.append("UtteranceUnderstood: ").append(getUtteranceUnderstood()).append(",");
        if (getInputType() != null)
            sb.append("InputType: ").append(getInputType()).append(",");
        if (getOutputType() != null)
            sb.append("OutputType: ").append(getOutputType()).append(",");
        if (getAssociatedIntentName() != null)
            sb.append("AssociatedIntentName: ").append(getAssociatedIntentName()).append(",");
        if (getAssociatedSlotName() != null)
            sb.append("AssociatedSlotName: ").append(getAssociatedSlotName()).append(",");
        if (getIntentState() != null)
            sb.append("IntentState: ").append(getIntentState()).append(",");
        if (getDialogActionType() != null)
            sb.append("DialogActionType: ").append(getDialogActionType()).append(",");
        if (getBotResponseAudioVoiceId() != null)
            sb.append("BotResponseAudioVoiceId: ").append(getBotResponseAudioVoiceId()).append(",");
        if (getSlotsFilledInSession() != null)
            sb.append("SlotsFilledInSession: ").append(getSlotsFilledInSession()).append(",");
        if (getUtteranceRequestId() != null)
            sb.append("UtteranceRequestId: ").append(getUtteranceRequestId()).append(",");
        if (getBotResponses() != null)
            sb.append("BotResponses: ").append(getBotResponses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UtteranceSpecification == false)
            return false;
        UtteranceSpecification other = (UtteranceSpecification) obj;
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
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getConversationStartTime() == null ^ this.getConversationStartTime() == null)
            return false;
        if (other.getConversationStartTime() != null && other.getConversationStartTime().equals(this.getConversationStartTime()) == false)
            return false;
        if (other.getConversationEndTime() == null ^ this.getConversationEndTime() == null)
            return false;
        if (other.getConversationEndTime() != null && other.getConversationEndTime().equals(this.getConversationEndTime()) == false)
            return false;
        if (other.getUtterance() == null ^ this.getUtterance() == null)
            return false;
        if (other.getUtterance() != null && other.getUtterance().equals(this.getUtterance()) == false)
            return false;
        if (other.getUtteranceTimestamp() == null ^ this.getUtteranceTimestamp() == null)
            return false;
        if (other.getUtteranceTimestamp() != null && other.getUtteranceTimestamp().equals(this.getUtteranceTimestamp()) == false)
            return false;
        if (other.getAudioVoiceDurationMillis() == null ^ this.getAudioVoiceDurationMillis() == null)
            return false;
        if (other.getAudioVoiceDurationMillis() != null && other.getAudioVoiceDurationMillis().equals(this.getAudioVoiceDurationMillis()) == false)
            return false;
        if (other.getUtteranceUnderstood() == null ^ this.getUtteranceUnderstood() == null)
            return false;
        if (other.getUtteranceUnderstood() != null && other.getUtteranceUnderstood().equals(this.getUtteranceUnderstood()) == false)
            return false;
        if (other.getInputType() == null ^ this.getInputType() == null)
            return false;
        if (other.getInputType() != null && other.getInputType().equals(this.getInputType()) == false)
            return false;
        if (other.getOutputType() == null ^ this.getOutputType() == null)
            return false;
        if (other.getOutputType() != null && other.getOutputType().equals(this.getOutputType()) == false)
            return false;
        if (other.getAssociatedIntentName() == null ^ this.getAssociatedIntentName() == null)
            return false;
        if (other.getAssociatedIntentName() != null && other.getAssociatedIntentName().equals(this.getAssociatedIntentName()) == false)
            return false;
        if (other.getAssociatedSlotName() == null ^ this.getAssociatedSlotName() == null)
            return false;
        if (other.getAssociatedSlotName() != null && other.getAssociatedSlotName().equals(this.getAssociatedSlotName()) == false)
            return false;
        if (other.getIntentState() == null ^ this.getIntentState() == null)
            return false;
        if (other.getIntentState() != null && other.getIntentState().equals(this.getIntentState()) == false)
            return false;
        if (other.getDialogActionType() == null ^ this.getDialogActionType() == null)
            return false;
        if (other.getDialogActionType() != null && other.getDialogActionType().equals(this.getDialogActionType()) == false)
            return false;
        if (other.getBotResponseAudioVoiceId() == null ^ this.getBotResponseAudioVoiceId() == null)
            return false;
        if (other.getBotResponseAudioVoiceId() != null && other.getBotResponseAudioVoiceId().equals(this.getBotResponseAudioVoiceId()) == false)
            return false;
        if (other.getSlotsFilledInSession() == null ^ this.getSlotsFilledInSession() == null)
            return false;
        if (other.getSlotsFilledInSession() != null && other.getSlotsFilledInSession().equals(this.getSlotsFilledInSession()) == false)
            return false;
        if (other.getUtteranceRequestId() == null ^ this.getUtteranceRequestId() == null)
            return false;
        if (other.getUtteranceRequestId() != null && other.getUtteranceRequestId().equals(this.getUtteranceRequestId()) == false)
            return false;
        if (other.getBotResponses() == null ^ this.getBotResponses() == null)
            return false;
        if (other.getBotResponses() != null && other.getBotResponses().equals(this.getBotResponses()) == false)
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
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getConversationStartTime() == null) ? 0 : getConversationStartTime().hashCode());
        hashCode = prime * hashCode + ((getConversationEndTime() == null) ? 0 : getConversationEndTime().hashCode());
        hashCode = prime * hashCode + ((getUtterance() == null) ? 0 : getUtterance().hashCode());
        hashCode = prime * hashCode + ((getUtteranceTimestamp() == null) ? 0 : getUtteranceTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAudioVoiceDurationMillis() == null) ? 0 : getAudioVoiceDurationMillis().hashCode());
        hashCode = prime * hashCode + ((getUtteranceUnderstood() == null) ? 0 : getUtteranceUnderstood().hashCode());
        hashCode = prime * hashCode + ((getInputType() == null) ? 0 : getInputType().hashCode());
        hashCode = prime * hashCode + ((getOutputType() == null) ? 0 : getOutputType().hashCode());
        hashCode = prime * hashCode + ((getAssociatedIntentName() == null) ? 0 : getAssociatedIntentName().hashCode());
        hashCode = prime * hashCode + ((getAssociatedSlotName() == null) ? 0 : getAssociatedSlotName().hashCode());
        hashCode = prime * hashCode + ((getIntentState() == null) ? 0 : getIntentState().hashCode());
        hashCode = prime * hashCode + ((getDialogActionType() == null) ? 0 : getDialogActionType().hashCode());
        hashCode = prime * hashCode + ((getBotResponseAudioVoiceId() == null) ? 0 : getBotResponseAudioVoiceId().hashCode());
        hashCode = prime * hashCode + ((getSlotsFilledInSession() == null) ? 0 : getSlotsFilledInSession().hashCode());
        hashCode = prime * hashCode + ((getUtteranceRequestId() == null) ? 0 : getUtteranceRequestId().hashCode());
        hashCode = prime * hashCode + ((getBotResponses() == null) ? 0 : getBotResponses().hashCode());
        return hashCode;
    }

    @Override
    public UtteranceSpecification clone() {
        try {
            return (UtteranceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UtteranceSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
