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
import com.amazonaws.auth.SignerTypeAware;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizeUtterance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecognizeUtteranceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable, SignerTypeAware {

    /**
     * <p>
     * The identifier of the bot that should receive the request.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The alias identifier in use for the bot that should receive the request.
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
     * The identifier of the session in use.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * Sets the state of the session with the user. You can use this to set the current intent, attributes, context, and
     * dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use in the conversation
     * with the user.
     * </p>
     * <p>
     * The <code>sessionState</code> field must be compressed using gzip and then base64 encoded before sending to
     * Amazon Lex V2.
     * </p>
     */
    private String sessionState;
    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes for
     * prefix <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * The <code>requestAttributes</code> field must be compressed using gzip and then base64 encoded before sending to
     * Amazon Lex V2.
     * </p>
     */
    private String requestAttributes;
    /**
     * <p>
     * Indicates the format for audio input or that the content is text. The header must start with one of the following
     * prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format, audio data must be in little-endian byte order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false
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
     * audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4
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
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String requestContentType;
    /**
     * <p>
     * The message that Amazon Lex V2 returns in the response can be either text or speech based on the
     * <code>responseContentType</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain;charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex V2 returns speech in the response. Amazon Lex V2 uses
     * Amazon Polly to generate the speech using the configuration that you specified in the
     * <code>requestContentType</code> parameter. For example, if you specify <code>audio/mpeg</code> as the value,
     * Amazon Lex V2 returns speech in the MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech returned is <code>audio/pcm</code> at 16 KHz in 16-bit,
     * little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm (16 KHz)
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String responseContentType;
    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>requestContentType</code>
     * parameter.
     * </p>
     */
    private java.io.InputStream inputStream;

    /**
     * <p>
     * The identifier of the bot that should receive the request.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that should receive the request.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that should receive the request.
     * </p>
     * 
     * @return The identifier of the bot that should receive the request.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that should receive the request.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that should receive the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The alias identifier in use for the bot that should receive the request.
     * </p>
     * 
     * @param botAliasId
     *        The alias identifier in use for the bot that should receive the request.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The alias identifier in use for the bot that should receive the request.
     * </p>
     * 
     * @return The alias identifier in use for the bot that should receive the request.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The alias identifier in use for the bot that should receive the request.
     * </p>
     * 
     * @param botAliasId
     *        The alias identifier in use for the bot that should receive the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceRequest withBotAliasId(String botAliasId) {
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

    public RecognizeUtteranceRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session in use.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     * 
     * @return The identifier of the session in use.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * Sets the state of the session with the user. You can use this to set the current intent, attributes, context, and
     * dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use in the conversation
     * with the user.
     * </p>
     * <p>
     * The <code>sessionState</code> field must be compressed using gzip and then base64 encoded before sending to
     * Amazon Lex V2.
     * </p>
     * 
     * @param sessionState
     *        Sets the state of the session with the user. You can use this to set the current intent, attributes,
     *        context, and dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use
     *        in the conversation with the user.</p>
     *        <p>
     *        The <code>sessionState</code> field must be compressed using gzip and then base64 encoded before sending
     *        to Amazon Lex V2.
     */

    public void setSessionState(String sessionState) {
        this.sessionState = sessionState;
    }

    /**
     * <p>
     * Sets the state of the session with the user. You can use this to set the current intent, attributes, context, and
     * dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use in the conversation
     * with the user.
     * </p>
     * <p>
     * The <code>sessionState</code> field must be compressed using gzip and then base64 encoded before sending to
     * Amazon Lex V2.
     * </p>
     * 
     * @return Sets the state of the session with the user. You can use this to set the current intent, attributes,
     *         context, and dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should
     *         use in the conversation with the user.</p>
     *         <p>
     *         The <code>sessionState</code> field must be compressed using gzip and then base64 encoded before sending
     *         to Amazon Lex V2.
     */

    public String getSessionState() {
        return this.sessionState;
    }

    /**
     * <p>
     * Sets the state of the session with the user. You can use this to set the current intent, attributes, context, and
     * dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use in the conversation
     * with the user.
     * </p>
     * <p>
     * The <code>sessionState</code> field must be compressed using gzip and then base64 encoded before sending to
     * Amazon Lex V2.
     * </p>
     * 
     * @param sessionState
     *        Sets the state of the session with the user. You can use this to set the current intent, attributes,
     *        context, and dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use
     *        in the conversation with the user.</p>
     *        <p>
     *        The <code>sessionState</code> field must be compressed using gzip and then base64 encoded before sending
     *        to Amazon Lex V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceRequest withSessionState(String sessionState) {
        setSessionState(sessionState);
        return this;
    }

    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes for
     * prefix <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * The <code>requestAttributes</code> field must be compressed using gzip and then base64 encoded before sending to
     * Amazon Lex V2.
     * </p>
     * 
     * @param requestAttributes
     *        Request-specific information passed between the client application and Amazon Lex V2 </p>
     *        <p>
     *        The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *        attributes for prefix <code>x-amz-lex:</code>.
     *        </p>
     *        <p>
     *        The <code>requestAttributes</code> field must be compressed using gzip and then base64 encoded before
     *        sending to Amazon Lex V2.
     */

    public void setRequestAttributes(String requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes for
     * prefix <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * The <code>requestAttributes</code> field must be compressed using gzip and then base64 encoded before sending to
     * Amazon Lex V2.
     * </p>
     * 
     * @return Request-specific information passed between the client application and Amazon Lex V2 </p>
     *         <p>
     *         The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *         attributes for prefix <code>x-amz-lex:</code>.
     *         </p>
     *         <p>
     *         The <code>requestAttributes</code> field must be compressed using gzip and then base64 encoded before
     *         sending to Amazon Lex V2.
     */

    public String getRequestAttributes() {
        return this.requestAttributes;
    }

    /**
     * <p>
     * Request-specific information passed between the client application and Amazon Lex V2
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes for
     * prefix <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * The <code>requestAttributes</code> field must be compressed using gzip and then base64 encoded before sending to
     * Amazon Lex V2.
     * </p>
     * 
     * @param requestAttributes
     *        Request-specific information passed between the client application and Amazon Lex V2 </p>
     *        <p>
     *        The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *        attributes for prefix <code>x-amz-lex:</code>.
     *        </p>
     *        <p>
     *        The <code>requestAttributes</code> field must be compressed using gzip and then base64 encoded before
     *        sending to Amazon Lex V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceRequest withRequestAttributes(String requestAttributes) {
        setRequestAttributes(requestAttributes);
        return this;
    }

    /**
     * <p>
     * Indicates the format for audio input or that the content is text. The header must start with one of the following
     * prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format, audio data must be in little-endian byte order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false
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
     * audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4
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
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param requestContentType
     *        Indicates the format for audio input or that the content is text. The header must start with one of the
     *        following prefixes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PCM format, audio data must be in little-endian byte order.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        audio/l16; rate=16000; channels=1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/x-l16; sample-rate=16000; channel-count=1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false
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
     *        audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4
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
     *        text/plain; charset=utf-8
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setRequestContentType(String requestContentType) {
        this.requestContentType = requestContentType;
    }

    /**
     * <p>
     * Indicates the format for audio input or that the content is text. The header must start with one of the following
     * prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format, audio data must be in little-endian byte order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false
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
     * audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4
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
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return Indicates the format for audio input or that the content is text. The header must start with one of the
     *         following prefixes:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PCM format, audio data must be in little-endian byte order.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         audio/l16; rate=16000; channels=1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/x-l16; sample-rate=16000; channel-count=1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false
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
     *         audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4
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
     *         text/plain; charset=utf-8
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getRequestContentType() {
        return this.requestContentType;
    }

    /**
     * <p>
     * Indicates the format for audio input or that the content is text. The header must start with one of the following
     * prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format, audio data must be in little-endian byte order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false
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
     * audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4
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
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param requestContentType
     *        Indicates the format for audio input or that the content is text. The header must start with one of the
     *        following prefixes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PCM format, audio data must be in little-endian byte order.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        audio/l16; rate=16000; channels=1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/x-l16; sample-rate=16000; channel-count=1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false
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
     *        audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4
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
     *        text/plain; charset=utf-8
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceRequest withRequestContentType(String requestContentType) {
        setRequestContentType(requestContentType);
        return this;
    }

    /**
     * <p>
     * The message that Amazon Lex V2 returns in the response can be either text or speech based on the
     * <code>responseContentType</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain;charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex V2 returns speech in the response. Amazon Lex V2 uses
     * Amazon Polly to generate the speech using the configuration that you specified in the
     * <code>requestContentType</code> parameter. For example, if you specify <code>audio/mpeg</code> as the value,
     * Amazon Lex V2 returns speech in the MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech returned is <code>audio/pcm</code> at 16 KHz in 16-bit,
     * little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm (16 KHz)
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param responseContentType
     *        The message that Amazon Lex V2 returns in the response can be either text or speech based on the
     *        <code>responseContentType</code> value.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>text/plain;charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value begins with <code>audio/</code>, Amazon Lex V2 returns speech in the response. Amazon Lex V2
     *        uses Amazon Polly to generate the speech using the configuration that you specified in the
     *        <code>requestContentType</code> parameter. For example, if you specify <code>audio/mpeg</code> as the
     *        value, Amazon Lex V2 returns speech in the MPEG format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value is <code>audio/pcm</code>, the speech returned is <code>audio/pcm</code> at 16 KHz in 16-bit,
     *        little-endian format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The following are the accepted values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        audio/mpeg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/ogg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/pcm (16 KHz)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/* (defaults to mpeg)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        text/plain; charset=utf-8
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
    }

    /**
     * <p>
     * The message that Amazon Lex V2 returns in the response can be either text or speech based on the
     * <code>responseContentType</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain;charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex V2 returns speech in the response. Amazon Lex V2 uses
     * Amazon Polly to generate the speech using the configuration that you specified in the
     * <code>requestContentType</code> parameter. For example, if you specify <code>audio/mpeg</code> as the value,
     * Amazon Lex V2 returns speech in the MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech returned is <code>audio/pcm</code> at 16 KHz in 16-bit,
     * little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm (16 KHz)
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The message that Amazon Lex V2 returns in the response can be either text or speech based on the
     *         <code>responseContentType</code> value.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the value is <code>text/plain;charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value begins with <code>audio/</code>, Amazon Lex V2 returns speech in the response. Amazon Lex V2
     *         uses Amazon Polly to generate the speech using the configuration that you specified in the
     *         <code>requestContentType</code> parameter. For example, if you specify <code>audio/mpeg</code> as the
     *         value, Amazon Lex V2 returns speech in the MPEG format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value is <code>audio/pcm</code>, the speech returned is <code>audio/pcm</code> at 16 KHz in
     *         16-bit, little-endian format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The following are the accepted values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         audio/mpeg
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/ogg
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/pcm (16 KHz)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/* (defaults to mpeg)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         text/plain; charset=utf-8
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getResponseContentType() {
        return this.responseContentType;
    }

    /**
     * <p>
     * The message that Amazon Lex V2 returns in the response can be either text or speech based on the
     * <code>responseContentType</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain;charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex V2 returns speech in the response. Amazon Lex V2 uses
     * Amazon Polly to generate the speech using the configuration that you specified in the
     * <code>requestContentType</code> parameter. For example, if you specify <code>audio/mpeg</code> as the value,
     * Amazon Lex V2 returns speech in the MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech returned is <code>audio/pcm</code> at 16 KHz in 16-bit,
     * little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm (16 KHz)
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param responseContentType
     *        The message that Amazon Lex V2 returns in the response can be either text or speech based on the
     *        <code>responseContentType</code> value.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>text/plain;charset=utf-8</code>, Amazon Lex V2 returns text in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value begins with <code>audio/</code>, Amazon Lex V2 returns speech in the response. Amazon Lex V2
     *        uses Amazon Polly to generate the speech using the configuration that you specified in the
     *        <code>requestContentType</code> parameter. For example, if you specify <code>audio/mpeg</code> as the
     *        value, Amazon Lex V2 returns speech in the MPEG format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value is <code>audio/pcm</code>, the speech returned is <code>audio/pcm</code> at 16 KHz in 16-bit,
     *        little-endian format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The following are the accepted values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        audio/mpeg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/ogg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/pcm (16 KHz)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/* (defaults to mpeg)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        text/plain; charset=utf-8
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceRequest withResponseContentType(String responseContentType) {
        setResponseContentType(responseContentType);
        return this;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>requestContentType</code>
     * parameter.
     * </p>
     * 
     * @param inputStream
     *        User input in PCM or Opus audio format or text format as described in the <code>requestContentType</code>
     *        parameter.
     */

    public void setInputStream(java.io.InputStream inputStream) {
        this.inputStream = inputStream;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>requestContentType</code>
     * parameter.
     * </p>
     * 
     * @return User input in PCM or Opus audio format or text format as described in the <code>requestContentType</code>
     *         parameter.
     */

    public java.io.InputStream getInputStream() {
        return this.inputStream;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>requestContentType</code>
     * parameter.
     * </p>
     * 
     * @param inputStream
     *        User input in PCM or Opus audio format or text format as described in the <code>requestContentType</code>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeUtteranceRequest withInputStream(java.io.InputStream inputStream) {
        setInputStream(inputStream);
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
        if (getSessionState() != null)
            sb.append("SessionState: ").append("***Sensitive Data Redacted***").append(",");
        if (getRequestAttributes() != null)
            sb.append("RequestAttributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getRequestContentType() != null)
            sb.append("RequestContentType: ").append(getRequestContentType()).append(",");
        if (getResponseContentType() != null)
            sb.append("ResponseContentType: ").append(getResponseContentType()).append(",");
        if (getInputStream() != null)
            sb.append("InputStream: ").append(getInputStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecognizeUtteranceRequest == false)
            return false;
        RecognizeUtteranceRequest other = (RecognizeUtteranceRequest) obj;
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
        if (other.getSessionState() == null ^ this.getSessionState() == null)
            return false;
        if (other.getSessionState() != null && other.getSessionState().equals(this.getSessionState()) == false)
            return false;
        if (other.getRequestAttributes() == null ^ this.getRequestAttributes() == null)
            return false;
        if (other.getRequestAttributes() != null && other.getRequestAttributes().equals(this.getRequestAttributes()) == false)
            return false;
        if (other.getRequestContentType() == null ^ this.getRequestContentType() == null)
            return false;
        if (other.getRequestContentType() != null && other.getRequestContentType().equals(this.getRequestContentType()) == false)
            return false;
        if (other.getResponseContentType() == null ^ this.getResponseContentType() == null)
            return false;
        if (other.getResponseContentType() != null && other.getResponseContentType().equals(this.getResponseContentType()) == false)
            return false;
        if (other.getInputStream() == null ^ this.getInputStream() == null)
            return false;
        if (other.getInputStream() != null && other.getInputStream().equals(this.getInputStream()) == false)
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
        hashCode = prime * hashCode + ((getSessionState() == null) ? 0 : getSessionState().hashCode());
        hashCode = prime * hashCode + ((getRequestAttributes() == null) ? 0 : getRequestAttributes().hashCode());
        hashCode = prime * hashCode + ((getRequestContentType() == null) ? 0 : getRequestContentType().hashCode());
        hashCode = prime * hashCode + ((getResponseContentType() == null) ? 0 : getResponseContentType().hashCode());
        hashCode = prime * hashCode + ((getInputStream() == null) ? 0 : getInputStream().hashCode());
        return hashCode;
    }

    @Override
    public RecognizeUtteranceRequest clone() {
        return (RecognizeUtteranceRequest) super.clone();
    }

    @Override
    public String getSignerType() {
        return "AWS4UnsignedPayloadSignerType";
    }

}
