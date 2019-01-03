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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.SignerTypeAware;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PostContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable, SignerTypeAware {

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     */
    private String botAlias;
    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. At
     * runtime, each request must contain the <code>userID</code> field.
     * </p>
     * <p>
     * To decide the user ID to use for your application, consider the following factors.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>userID</code> field must not contain any personally identifiable information of the user, for example,
     * name, personal identification numbers, or other end user personal information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue on another device, use a user-specific
     * identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, choose a
     * device-specific identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * A user can't have two independent conversations with two different versions of the same bot. For example, a user
     * can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a user will
     * need to have conversation with two different versions, for example, while testing, include the bot alias in the
     * user ID to separate the two conversations.
     * </p>
     * </li>
     * </ul>
     */
    private String userId;
    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP header.
     * </p>
     * <p>
     * Application-specific information passed between Amazon Lex and a client application. The value must be a JSON
     * serialized and base64 encoded map with string keys and values. The total size of the
     * <code>sessionAttributes</code> and <code>requestAttributes</code> headers is limited to 12 KB.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting Session
     * Attributes</a>.
     * </p>
     */
    private String sessionAttributes;
    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP header.
     * </p>
     * <p>
     * Request-specific information passed between Amazon Lex and a client application. The value must be a JSON
     * serialized and base64 encoded map with string keys and values. The total size of the
     * <code>requestAttributes</code> and <code>sessionAttributes</code> headers is limited to 12 KB.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs">Setting Request
     * Attributes</a>.
     * </p>
     */
    private String requestAttributes;
    /**
     * <p>
     * You pass this value as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one of the following prefixes:
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
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000; frame-size-milliseconds=4
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
    private String contentType;
    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or speech based on the <code>Accept</code> HTTP
     * header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech (using the configuration you specified in the <code>Accept</code> header). For
     * example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
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
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String accept;
    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * You can stream audio data to Amazon Lex or you can create a local buffer that captures all of the audio data
     * before sending. In general, you get better performance if you stream audio data rather than buffering the data
     * locally.
     * </p>
     */
    private java.io.InputStream inputStream;

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     * 
     * @param botName
     *        Name of the Amazon Lex bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     * 
     * @return Name of the Amazon Lex bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     * 
     * @param botName
     *        Name of the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     * 
     * @param botAlias
     *        Alias of the Amazon Lex bot.
     */

    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     * 
     * @return Alias of the Amazon Lex bot.
     */

    public String getBotAlias() {
        return this.botAlias;
    }

    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     * 
     * @param botAlias
     *        Alias of the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withBotAlias(String botAlias) {
        setBotAlias(botAlias);
        return this;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. At
     * runtime, each request must contain the <code>userID</code> field.
     * </p>
     * <p>
     * To decide the user ID to use for your application, consider the following factors.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>userID</code> field must not contain any personally identifiable information of the user, for example,
     * name, personal identification numbers, or other end user personal information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue on another device, use a user-specific
     * identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, choose a
     * device-specific identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * A user can't have two independent conversations with two different versions of the same bot. For example, a user
     * can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a user will
     * need to have conversation with two different versions, for example, while testing, include the bot alias in the
     * user ID to separate the two conversations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your
     *        bot. At runtime, each request must contain the <code>userID</code> field.</p>
     *        <p>
     *        To decide the user ID to use for your application, consider the following factors.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>userID</code> field must not contain any personally identifiable information of the user, for
     *        example, name, personal identification numbers, or other end user personal information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want a user to start a conversation on one device and continue on another device, use a
     *        user-specific identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want the same user to be able to have two independent conversations on two different devices,
     *        choose a device-specific identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A user can't have two independent conversations with two different versions of the same bot. For example,
     *        a user can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a
     *        user will need to have conversation with two different versions, for example, while testing, include the
     *        bot alias in the user ID to separate the two conversations.
     *        </p>
     *        </li>
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. At
     * runtime, each request must contain the <code>userID</code> field.
     * </p>
     * <p>
     * To decide the user ID to use for your application, consider the following factors.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>userID</code> field must not contain any personally identifiable information of the user, for example,
     * name, personal identification numbers, or other end user personal information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue on another device, use a user-specific
     * identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, choose a
     * device-specific identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * A user can't have two independent conversations with two different versions of the same bot. For example, a user
     * can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a user will
     * need to have conversation with two different versions, for example, while testing, include the bot alias in the
     * user ID to separate the two conversations.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your
     *         bot. At runtime, each request must contain the <code>userID</code> field.</p>
     *         <p>
     *         To decide the user ID to use for your application, consider the following factors.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>userID</code> field must not contain any personally identifiable information of the user, for
     *         example, name, personal identification numbers, or other end user personal information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you want a user to start a conversation on one device and continue on another device, use a
     *         user-specific identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you want the same user to be able to have two independent conversations on two different devices,
     *         choose a device-specific identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A user can't have two independent conversations with two different versions of the same bot. For example,
     *         a user can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that
     *         a user will need to have conversation with two different versions, for example, while testing, include
     *         the bot alias in the user ID to separate the two conversations.
     *         </p>
     *         </li>
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. At
     * runtime, each request must contain the <code>userID</code> field.
     * </p>
     * <p>
     * To decide the user ID to use for your application, consider the following factors.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>userID</code> field must not contain any personally identifiable information of the user, for example,
     * name, personal identification numbers, or other end user personal information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue on another device, use a user-specific
     * identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, choose a
     * device-specific identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * A user can't have two independent conversations with two different versions of the same bot. For example, a user
     * can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a user will
     * need to have conversation with two different versions, for example, while testing, include the bot alias in the
     * user ID to separate the two conversations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your
     *        bot. At runtime, each request must contain the <code>userID</code> field.</p>
     *        <p>
     *        To decide the user ID to use for your application, consider the following factors.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>userID</code> field must not contain any personally identifiable information of the user, for
     *        example, name, personal identification numbers, or other end user personal information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want a user to start a conversation on one device and continue on another device, use a
     *        user-specific identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want the same user to be able to have two independent conversations on two different devices,
     *        choose a device-specific identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A user can't have two independent conversations with two different versions of the same bot. For example,
     *        a user can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a
     *        user will need to have conversation with two different versions, for example, while testing, include the
     *        bot alias in the user ID to separate the two conversations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP header.
     * </p>
     * <p>
     * Application-specific information passed between Amazon Lex and a client application. The value must be a JSON
     * serialized and base64 encoded map with string keys and values. The total size of the
     * <code>sessionAttributes</code> and <code>requestAttributes</code> headers is limited to 12 KB.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting Session
     * Attributes</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param sessionAttributes
     *        You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP header.</p>
     *        <p>
     *        Application-specific information passed between Amazon Lex and a client application. The value must be a
     *        JSON serialized and base64 encoded map with string keys and values. The total size of the
     *        <code>sessionAttributes</code> and <code>requestAttributes</code> headers is limited to 12 KB.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting
     *        Session Attributes</a>.
     */

    public void setSessionAttributes(String sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP header.
     * </p>
     * <p>
     * Application-specific information passed between Amazon Lex and a client application. The value must be a JSON
     * serialized and base64 encoded map with string keys and values. The total size of the
     * <code>sessionAttributes</code> and <code>requestAttributes</code> headers is limited to 12 KB.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting Session
     * Attributes</a>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP header.</p>
     *         <p>
     *         Application-specific information passed between Amazon Lex and a client application. The value must be a
     *         JSON serialized and base64 encoded map with string keys and values. The total size of the
     *         <code>sessionAttributes</code> and <code>requestAttributes</code> headers is limited to 12 KB.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting
     *         Session Attributes</a>.
     */

    public String getSessionAttributes() {
        return this.sessionAttributes;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP header.
     * </p>
     * <p>
     * Application-specific information passed between Amazon Lex and a client application. The value must be a JSON
     * serialized and base64 encoded map with string keys and values. The total size of the
     * <code>sessionAttributes</code> and <code>requestAttributes</code> headers is limited to 12 KB.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting Session
     * Attributes</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param sessionAttributes
     *        You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP header.</p>
     *        <p>
     *        Application-specific information passed between Amazon Lex and a client application. The value must be a
     *        JSON serialized and base64 encoded map with string keys and values. The total size of the
     *        <code>sessionAttributes</code> and <code>requestAttributes</code> headers is limited to 12 KB.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting
     *        Session Attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withSessionAttributes(String sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP header.
     * </p>
     * <p>
     * Request-specific information passed between Amazon Lex and a client application. The value must be a JSON
     * serialized and base64 encoded map with string keys and values. The total size of the
     * <code>requestAttributes</code> and <code>sessionAttributes</code> headers is limited to 12 KB.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs">Setting Request
     * Attributes</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param requestAttributes
     *        You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP header.</p>
     *        <p>
     *        Request-specific information passed between Amazon Lex and a client application. The value must be a JSON
     *        serialized and base64 encoded map with string keys and values. The total size of the
     *        <code>requestAttributes</code> and <code>sessionAttributes</code> headers is limited to 12 KB.
     *        </p>
     *        <p>
     *        The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *        attributes with the prefix <code>x-amz-lex:</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs">Setting
     *        Request Attributes</a>.
     */

    public void setRequestAttributes(String requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP header.
     * </p>
     * <p>
     * Request-specific information passed between Amazon Lex and a client application. The value must be a JSON
     * serialized and base64 encoded map with string keys and values. The total size of the
     * <code>requestAttributes</code> and <code>sessionAttributes</code> headers is limited to 12 KB.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs">Setting Request
     * Attributes</a>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP header.</p>
     *         <p>
     *         Request-specific information passed between Amazon Lex and a client application. The value must be a JSON
     *         serialized and base64 encoded map with string keys and values. The total size of the
     *         <code>requestAttributes</code> and <code>sessionAttributes</code> headers is limited to 12 KB.
     *         </p>
     *         <p>
     *         The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *         attributes with the prefix <code>x-amz-lex:</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs">Setting
     *         Request Attributes</a>.
     */

    public String getRequestAttributes() {
        return this.requestAttributes;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP header.
     * </p>
     * <p>
     * Request-specific information passed between Amazon Lex and a client application. The value must be a JSON
     * serialized and base64 encoded map with string keys and values. The total size of the
     * <code>requestAttributes</code> and <code>sessionAttributes</code> headers is limited to 12 KB.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request attributes
     * with the prefix <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs">Setting Request
     * Attributes</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param requestAttributes
     *        You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP header.</p>
     *        <p>
     *        Request-specific information passed between Amazon Lex and a client application. The value must be a JSON
     *        serialized and base64 encoded map with string keys and values. The total size of the
     *        <code>requestAttributes</code> and <code>sessionAttributes</code> headers is limited to 12 KB.
     *        </p>
     *        <p>
     *        The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *        attributes with the prefix <code>x-amz-lex:</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs">Setting
     *        Request Attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withRequestAttributes(String requestAttributes) {
        setRequestAttributes(requestAttributes);
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one of the following prefixes:
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
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000; frame-size-milliseconds=4
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
     * @param contentType
     *        You pass this value as the <code>Content-Type</code> HTTP header. </p>
     *        <p>
     *        Indicates the audio format or text. The header value must start with one of the following prefixes:
     *        </p>
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
     *        audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000; frame-size-milliseconds=4
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

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * You pass this value as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one of the following prefixes:
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
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000; frame-size-milliseconds=4
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
     * @return You pass this value as the <code>Content-Type</code> HTTP header. </p>
     *         <p>
     *         Indicates the audio format or text. The header value must start with one of the following prefixes:
     *         </p>
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
     *         audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000; frame-size-milliseconds=4
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

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * You pass this value as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one of the following prefixes:
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
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000; frame-size-milliseconds=4
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
     * @param contentType
     *        You pass this value as the <code>Content-Type</code> HTTP header. </p>
     *        <p>
     *        Indicates the audio format or text. The header value must start with one of the following prefixes:
     *        </p>
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
     *        audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000; frame-size-milliseconds=4
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

    public PostContentRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or speech based on the <code>Accept</code> HTTP
     * header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech (using the configuration you specified in the <code>Accept</code> header). For
     * example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
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
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param accept
     *        You pass this value as the <code>Accept</code> HTTP header. </p>
     *        <p>
     *        The message Amazon Lex returns in the response can be either text or speech based on the
     *        <code>Accept</code> HTTP header value in the request.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses
     *        Amazon Polly to generate the speech (using the configuration you specified in the <code>Accept</code>
     *        header). For example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in
     *        the MPEG format.
     *        </p>
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
     *        audio/pcm
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        text/plain; charset=utf-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/* (defaults to mpeg)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or speech based on the <code>Accept</code> HTTP
     * header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech (using the configuration you specified in the <code>Accept</code> header). For
     * example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
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
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return You pass this value as the <code>Accept</code> HTTP header. </p>
     *         <p>
     *         The message Amazon Lex returns in the response can be either text or speech based on the
     *         <code>Accept</code> HTTP header value in the request.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses
     *         Amazon Polly to generate the speech (using the configuration you specified in the <code>Accept</code>
     *         header). For example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in
     *         the MPEG format.
     *         </p>
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
     *         audio/pcm
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         text/plain; charset=utf-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/* (defaults to mpeg)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or speech based on the <code>Accept</code> HTTP
     * header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech (using the configuration you specified in the <code>Accept</code> header). For
     * example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
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
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param accept
     *        You pass this value as the <code>Accept</code> HTTP header. </p>
     *        <p>
     *        The message Amazon Lex returns in the response can be either text or speech based on the
     *        <code>Accept</code> HTTP header value in the request.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses
     *        Amazon Polly to generate the speech (using the configuration you specified in the <code>Accept</code>
     *        header). For example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in
     *        the MPEG format.
     *        </p>
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
     *        audio/pcm
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        text/plain; charset=utf-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/* (defaults to mpeg)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * You can stream audio data to Amazon Lex or you can create a local buffer that captures all of the audio data
     * before sending. In general, you get better performance if you stream audio data rather than buffering the data
     * locally.
     * </p>
     * 
     * @param inputStream
     *        User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP
     *        header. </p>
     *        <p>
     *        You can stream audio data to Amazon Lex or you can create a local buffer that captures all of the audio
     *        data before sending. In general, you get better performance if you stream audio data rather than buffering
     *        the data locally.
     */

    public void setInputStream(java.io.InputStream inputStream) {
        this.inputStream = inputStream;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * You can stream audio data to Amazon Lex or you can create a local buffer that captures all of the audio data
     * before sending. In general, you get better performance if you stream audio data rather than buffering the data
     * locally.
     * </p>
     * 
     * @return User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP
     *         header. </p>
     *         <p>
     *         You can stream audio data to Amazon Lex or you can create a local buffer that captures all of the audio
     *         data before sending. In general, you get better performance if you stream audio data rather than
     *         buffering the data locally.
     */

    public java.io.InputStream getInputStream() {
        return this.inputStream;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * You can stream audio data to Amazon Lex or you can create a local buffer that captures all of the audio data
     * before sending. In general, you get better performance if you stream audio data rather than buffering the data
     * locally.
     * </p>
     * 
     * @param inputStream
     *        User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP
     *        header. </p>
     *        <p>
     *        You can stream audio data to Amazon Lex or you can create a local buffer that captures all of the audio
     *        data before sending. In general, you get better performance if you stream audio data rather than buffering
     *        the data locally.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withInputStream(java.io.InputStream inputStream) {
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
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getBotAlias() != null)
            sb.append("BotAlias: ").append(getBotAlias()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getSessionAttributes() != null)
            sb.append("SessionAttributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getRequestAttributes() != null)
            sb.append("RequestAttributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
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

        if (obj instanceof PostContentRequest == false)
            return false;
        PostContentRequest other = (PostContentRequest) obj;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotAlias() == null ^ this.getBotAlias() == null)
            return false;
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        if (other.getRequestAttributes() == null ^ this.getRequestAttributes() == null)
            return false;
        if (other.getRequestAttributes() != null && other.getRequestAttributes().equals(this.getRequestAttributes()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
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

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotAlias() == null) ? 0 : getBotAlias().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getRequestAttributes() == null) ? 0 : getRequestAttributes().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getInputStream() == null) ? 0 : getInputStream().hashCode());
        return hashCode;
    }

    @Override
    public PostContentRequest clone() {
        return (PostContentRequest) super.clone();
    }

    @Override
    public String getSignerType() {
        return "AWS4UnsignedPayloadSignerType";
    }

}
