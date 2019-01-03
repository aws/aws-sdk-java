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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PostText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostTextRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The alias of the Amazon Lex bot.
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
     * Application-specific information passed between Amazon Lex and a client application.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting Session
     * Attributes</a>.
     * </p>
     */
    private java.util.Map<String, String> sessionAttributes;
    /**
     * <p>
     * Request-specific information passed between Amazon Lex and a client application.
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
    private java.util.Map<String, String> requestAttributes;
    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     */
    private String inputText;

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @param botName
     *        The name of the Amazon Lex bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @return The name of the Amazon Lex bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @param botName
     *        The name of the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The alias of the Amazon Lex bot.
     * </p>
     * 
     * @param botAlias
     *        The alias of the Amazon Lex bot.
     */

    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * The alias of the Amazon Lex bot.
     * </p>
     * 
     * @return The alias of the Amazon Lex bot.
     */

    public String getBotAlias() {
        return this.botAlias;
    }

    /**
     * <p>
     * The alias of the Amazon Lex bot.
     * </p>
     * 
     * @param botAlias
     *        The alias of the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest withBotAlias(String botAlias) {
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

    public PostTextRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * Application-specific information passed between Amazon Lex and a client application.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting Session
     * Attributes</a>.
     * </p>
     * 
     * @return Application-specific information passed between Amazon Lex and a client application.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting
     *         Session Attributes</a>.
     */

    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Application-specific information passed between Amazon Lex and a client application.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting Session
     * Attributes</a>.
     * </p>
     * 
     * @param sessionAttributes
     *        Application-specific information passed between Amazon Lex and a client application.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting
     *        Session Attributes</a>.
     */

    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Application-specific information passed between Amazon Lex and a client application.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting Session
     * Attributes</a>.
     * </p>
     * 
     * @param sessionAttributes
     *        Application-specific information passed between Amazon Lex and a client application.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs">Setting
     *        Session Attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    public PostTextRequest addSessionAttributesEntry(String key, String value) {
        if (null == this.sessionAttributes) {
            this.sessionAttributes = new java.util.HashMap<String, String>();
        }
        if (this.sessionAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sessionAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SessionAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest clearSessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p>
     * Request-specific information passed between Amazon Lex and a client application.
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
     * 
     * @return Request-specific information passed between Amazon Lex and a client application.</p>
     *         <p>
     *         The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *         attributes with the prefix <code>x-amz-lex:</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs">Setting
     *         Request Attributes</a>.
     */

    public java.util.Map<String, String> getRequestAttributes() {
        return requestAttributes;
    }

    /**
     * <p>
     * Request-specific information passed between Amazon Lex and a client application.
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
     * 
     * @param requestAttributes
     *        Request-specific information passed between Amazon Lex and a client application.</p>
     *        <p>
     *        The namespace <code>x-amz-lex:</code> is reserved for special attributes. Don't create any request
     *        attributes with the prefix <code>x-amz-lex:</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs">Setting
     *        Request Attributes</a>.
     */

    public void setRequestAttributes(java.util.Map<String, String> requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * <p>
     * Request-specific information passed between Amazon Lex and a client application.
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
     * 
     * @param requestAttributes
     *        Request-specific information passed between Amazon Lex and a client application.</p>
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

    public PostTextRequest withRequestAttributes(java.util.Map<String, String> requestAttributes) {
        setRequestAttributes(requestAttributes);
        return this;
    }

    public PostTextRequest addRequestAttributesEntry(String key, String value) {
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

    public PostTextRequest clearRequestAttributesEntries() {
        this.requestAttributes = null;
        return this;
    }

    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     * 
     * @param inputText
     *        The text that the user entered (Amazon Lex interprets this text).
     */

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     * 
     * @return The text that the user entered (Amazon Lex interprets this text).
     */

    public String getInputText() {
        return this.inputText;
    }

    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     * 
     * @param inputText
     *        The text that the user entered (Amazon Lex interprets this text).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest withInputText(String inputText) {
        setInputText(inputText);
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
        if (getInputText() != null)
            sb.append("InputText: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostTextRequest == false)
            return false;
        PostTextRequest other = (PostTextRequest) obj;
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
        if (other.getInputText() == null ^ this.getInputText() == null)
            return false;
        if (other.getInputText() != null && other.getInputText().equals(this.getInputText()) == false)
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
        hashCode = prime * hashCode + ((getInputText() == null) ? 0 : getInputText().hashCode());
        return hashCode;
    }

    @Override
    public PostTextRequest clone() {
        return (PostTextRequest) super.clone();
    }

}
