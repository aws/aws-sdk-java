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
 * Contains fields describing a condition by which to filter the sessions. The expression may be understood as
 * <code>name</code> <code>operator</code> <code>values</code>. For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>LocaleId EQ en</code> – The locale is "en".
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Duration GT 200</code> – The duration is greater than 200 seconds.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The operators that each filter supports are listed below:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BotAlias</code> – <code>EQ</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BotVersion</code> – <code>EQ</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>LocaleId</code> – <code>EQ</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Modality</code> – <code>EQ</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Channel</code> – <code>EQ</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Duration</code> – <code>EQ</code>, <code>GT</code>, <code>LT</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>conversationEndState</code> – <code>EQ</code>, <code>CO</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SessionId</code> – <code>EQ</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>OriginatingRequestId</code> – <code>EQ</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>IntentPath</code> – <code>EQ</code>.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AnalyticsSessionFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsSessionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The category by which to filter the sessions. The descriptions for each option are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BotAlias</code> – The name of the bot alias.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BotVersion</code> – The version of the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LocaleId</code> – The locale of the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modality</code> – The modality of the session with the bot (audio, DTMF, or text).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Channel</code> – The channel that the bot is integrated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Duration</code> – The duration of the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>conversationEndState</code> – The final state of the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionId</code> – The identifier of the session with the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginatingRequestId</code> – The identifier of the first request in a session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentPath</code> – The order of intents taken in a session.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The operation by which to filter the category. The following operations are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CO</code> – Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EQ</code> – Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GT</code> – Greater than
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LT</code> – Less than
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operators that each filter supports are listed below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BotAlias</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BotVersion</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LocaleId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modality</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Channel</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Duration</code> – <code>EQ</code>, <code>GT</code>, <code>LT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>conversationEndState</code> – <code>EQ</code>, <code>CO</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginatingRequestId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentPath</code> – <code>EQ</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String operator;
    /**
     * <p>
     * An array containing the values of the category by which to apply the operator to filter the results. You can
     * provide multiple values if the operator is <code>EQ</code> or <code>CO</code>. If you provide multiple values,
     * you filter for results that equal/contain any of the values. For example, if the <code>name</code>,
     * <code>operator</code>, and <code>values</code> fields are <code>Modality</code>, <code>EQ</code>, and
     * <code>[Speech, Text]</code>, the operation filters for results where the modality was either <code>Speech</code>
     * or <code>Text</code>.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The category by which to filter the sessions. The descriptions for each option are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BotAlias</code> – The name of the bot alias.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BotVersion</code> – The version of the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LocaleId</code> – The locale of the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modality</code> – The modality of the session with the bot (audio, DTMF, or text).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Channel</code> – The channel that the bot is integrated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Duration</code> – The duration of the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>conversationEndState</code> – The final state of the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionId</code> – The identifier of the session with the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginatingRequestId</code> – The identifier of the first request in a session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentPath</code> – The order of intents taken in a session.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The category by which to filter the sessions. The descriptions for each option are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BotAlias</code> – The name of the bot alias.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BotVersion</code> – The version of the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LocaleId</code> – The locale of the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Modality</code> – The modality of the session with the bot (audio, DTMF, or text).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Channel</code> – The channel that the bot is integrated with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Duration</code> – The duration of the session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>conversationEndState</code> – The final state of the session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SessionId</code> – The identifier of the session with the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OriginatingRequestId</code> – The identifier of the first request in a session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentPath</code> – The order of intents taken in a session.
     *        </p>
     *        </li>
     * @see AnalyticsSessionFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The category by which to filter the sessions. The descriptions for each option are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BotAlias</code> – The name of the bot alias.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BotVersion</code> – The version of the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LocaleId</code> – The locale of the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modality</code> – The modality of the session with the bot (audio, DTMF, or text).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Channel</code> – The channel that the bot is integrated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Duration</code> – The duration of the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>conversationEndState</code> – The final state of the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionId</code> – The identifier of the session with the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginatingRequestId</code> – The identifier of the first request in a session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentPath</code> – The order of intents taken in a session.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The category by which to filter the sessions. The descriptions for each option are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BotAlias</code> – The name of the bot alias.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BotVersion</code> – The version of the bot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LocaleId</code> – The locale of the bot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Modality</code> – The modality of the session with the bot (audio, DTMF, or text).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Channel</code> – The channel that the bot is integrated with.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Duration</code> – The duration of the session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>conversationEndState</code> – The final state of the session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SessionId</code> – The identifier of the session with the bot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OriginatingRequestId</code> – The identifier of the first request in a session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IntentPath</code> – The order of intents taken in a session.
     *         </p>
     *         </li>
     * @see AnalyticsSessionFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The category by which to filter the sessions. The descriptions for each option are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BotAlias</code> – The name of the bot alias.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BotVersion</code> – The version of the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LocaleId</code> – The locale of the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modality</code> – The modality of the session with the bot (audio, DTMF, or text).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Channel</code> – The channel that the bot is integrated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Duration</code> – The duration of the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>conversationEndState</code> – The final state of the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionId</code> – The identifier of the session with the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginatingRequestId</code> – The identifier of the first request in a session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentPath</code> – The order of intents taken in a session.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The category by which to filter the sessions. The descriptions for each option are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BotAlias</code> – The name of the bot alias.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BotVersion</code> – The version of the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LocaleId</code> – The locale of the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Modality</code> – The modality of the session with the bot (audio, DTMF, or text).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Channel</code> – The channel that the bot is integrated with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Duration</code> – The duration of the session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>conversationEndState</code> – The final state of the session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SessionId</code> – The identifier of the session with the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OriginatingRequestId</code> – The identifier of the first request in a session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentPath</code> – The order of intents taken in a session.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsSessionFilterName
     */

    public AnalyticsSessionFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The category by which to filter the sessions. The descriptions for each option are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BotAlias</code> – The name of the bot alias.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BotVersion</code> – The version of the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LocaleId</code> – The locale of the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modality</code> – The modality of the session with the bot (audio, DTMF, or text).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Channel</code> – The channel that the bot is integrated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Duration</code> – The duration of the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>conversationEndState</code> – The final state of the session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionId</code> – The identifier of the session with the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginatingRequestId</code> – The identifier of the first request in a session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentPath</code> – The order of intents taken in a session.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The category by which to filter the sessions. The descriptions for each option are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BotAlias</code> – The name of the bot alias.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BotVersion</code> – The version of the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LocaleId</code> – The locale of the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Modality</code> – The modality of the session with the bot (audio, DTMF, or text).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Channel</code> – The channel that the bot is integrated with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Duration</code> – The duration of the session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>conversationEndState</code> – The final state of the session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SessionId</code> – The identifier of the session with the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OriginatingRequestId</code> – The identifier of the first request in a session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentPath</code> – The order of intents taken in a session.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsSessionFilterName
     */

    public AnalyticsSessionFilter withName(AnalyticsSessionFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The operation by which to filter the category. The following operations are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CO</code> – Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EQ</code> – Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GT</code> – Greater than
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LT</code> – Less than
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operators that each filter supports are listed below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BotAlias</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BotVersion</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LocaleId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modality</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Channel</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Duration</code> – <code>EQ</code>, <code>GT</code>, <code>LT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>conversationEndState</code> – <code>EQ</code>, <code>CO</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginatingRequestId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentPath</code> – <code>EQ</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The operation by which to filter the category. The following operations are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CO</code> – Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EQ</code> – Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GT</code> – Greater than
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LT</code> – Less than
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The operators that each filter supports are listed below:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BotAlias</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BotVersion</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LocaleId</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Modality</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Channel</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Duration</code> – <code>EQ</code>, <code>GT</code>, <code>LT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>conversationEndState</code> – <code>EQ</code>, <code>CO</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SessionId</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OriginatingRequestId</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentPath</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     * @see AnalyticsFilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operation by which to filter the category. The following operations are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CO</code> – Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EQ</code> – Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GT</code> – Greater than
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LT</code> – Less than
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operators that each filter supports are listed below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BotAlias</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BotVersion</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LocaleId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modality</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Channel</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Duration</code> – <code>EQ</code>, <code>GT</code>, <code>LT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>conversationEndState</code> – <code>EQ</code>, <code>CO</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginatingRequestId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentPath</code> – <code>EQ</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The operation by which to filter the category. The following operations are possible:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CO</code> – Contains
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EQ</code> – Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GT</code> – Greater than
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LT</code> – Less than
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The operators that each filter supports are listed below:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BotAlias</code> – <code>EQ</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BotVersion</code> – <code>EQ</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LocaleId</code> – <code>EQ</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Modality</code> – <code>EQ</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Channel</code> – <code>EQ</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Duration</code> – <code>EQ</code>, <code>GT</code>, <code>LT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>conversationEndState</code> – <code>EQ</code>, <code>CO</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SessionId</code> – <code>EQ</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OriginatingRequestId</code> – <code>EQ</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IntentPath</code> – <code>EQ</code>.
     *         </p>
     *         </li>
     * @see AnalyticsFilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operation by which to filter the category. The following operations are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CO</code> – Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EQ</code> – Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GT</code> – Greater than
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LT</code> – Less than
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operators that each filter supports are listed below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BotAlias</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BotVersion</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LocaleId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modality</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Channel</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Duration</code> – <code>EQ</code>, <code>GT</code>, <code>LT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>conversationEndState</code> – <code>EQ</code>, <code>CO</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginatingRequestId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentPath</code> – <code>EQ</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The operation by which to filter the category. The following operations are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CO</code> – Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EQ</code> – Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GT</code> – Greater than
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LT</code> – Less than
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The operators that each filter supports are listed below:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BotAlias</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BotVersion</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LocaleId</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Modality</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Channel</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Duration</code> – <code>EQ</code>, <code>GT</code>, <code>LT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>conversationEndState</code> – <code>EQ</code>, <code>CO</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SessionId</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OriginatingRequestId</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentPath</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsFilterOperator
     */

    public AnalyticsSessionFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operation by which to filter the category. The following operations are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CO</code> – Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EQ</code> – Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GT</code> – Greater than
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LT</code> – Less than
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operators that each filter supports are listed below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BotAlias</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BotVersion</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LocaleId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modality</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Channel</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Duration</code> – <code>EQ</code>, <code>GT</code>, <code>LT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>conversationEndState</code> – <code>EQ</code>, <code>CO</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SessionId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginatingRequestId</code> – <code>EQ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentPath</code> – <code>EQ</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The operation by which to filter the category. The following operations are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CO</code> – Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EQ</code> – Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GT</code> – Greater than
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LT</code> – Less than
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The operators that each filter supports are listed below:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BotAlias</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BotVersion</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LocaleId</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Modality</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Channel</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Duration</code> – <code>EQ</code>, <code>GT</code>, <code>LT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>conversationEndState</code> – <code>EQ</code>, <code>CO</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SessionId</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OriginatingRequestId</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentPath</code> – <code>EQ</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsFilterOperator
     */

    public AnalyticsSessionFilter withOperator(AnalyticsFilterOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * An array containing the values of the category by which to apply the operator to filter the results. You can
     * provide multiple values if the operator is <code>EQ</code> or <code>CO</code>. If you provide multiple values,
     * you filter for results that equal/contain any of the values. For example, if the <code>name</code>,
     * <code>operator</code>, and <code>values</code> fields are <code>Modality</code>, <code>EQ</code>, and
     * <code>[Speech, Text]</code>, the operation filters for results where the modality was either <code>Speech</code>
     * or <code>Text</code>.
     * </p>
     * 
     * @return An array containing the values of the category by which to apply the operator to filter the results. You
     *         can provide multiple values if the operator is <code>EQ</code> or <code>CO</code>. If you provide
     *         multiple values, you filter for results that equal/contain any of the values. For example, if the
     *         <code>name</code>, <code>operator</code>, and <code>values</code> fields are <code>Modality</code>,
     *         <code>EQ</code>, and <code>[Speech, Text]</code>, the operation filters for results where the modality
     *         was either <code>Speech</code> or <code>Text</code>.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * An array containing the values of the category by which to apply the operator to filter the results. You can
     * provide multiple values if the operator is <code>EQ</code> or <code>CO</code>. If you provide multiple values,
     * you filter for results that equal/contain any of the values. For example, if the <code>name</code>,
     * <code>operator</code>, and <code>values</code> fields are <code>Modality</code>, <code>EQ</code>, and
     * <code>[Speech, Text]</code>, the operation filters for results where the modality was either <code>Speech</code>
     * or <code>Text</code>.
     * </p>
     * 
     * @param values
     *        An array containing the values of the category by which to apply the operator to filter the results. You
     *        can provide multiple values if the operator is <code>EQ</code> or <code>CO</code>. If you provide multiple
     *        values, you filter for results that equal/contain any of the values. For example, if the <code>name</code>
     *        , <code>operator</code>, and <code>values</code> fields are <code>Modality</code>, <code>EQ</code>, and
     *        <code>[Speech, Text]</code>, the operation filters for results where the modality was either
     *        <code>Speech</code> or <code>Text</code>.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * An array containing the values of the category by which to apply the operator to filter the results. You can
     * provide multiple values if the operator is <code>EQ</code> or <code>CO</code>. If you provide multiple values,
     * you filter for results that equal/contain any of the values. For example, if the <code>name</code>,
     * <code>operator</code>, and <code>values</code> fields are <code>Modality</code>, <code>EQ</code>, and
     * <code>[Speech, Text]</code>, the operation filters for results where the modality was either <code>Speech</code>
     * or <code>Text</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        An array containing the values of the category by which to apply the operator to filter the results. You
     *        can provide multiple values if the operator is <code>EQ</code> or <code>CO</code>. If you provide multiple
     *        values, you filter for results that equal/contain any of the values. For example, if the <code>name</code>
     *        , <code>operator</code>, and <code>values</code> fields are <code>Modality</code>, <code>EQ</code>, and
     *        <code>[Speech, Text]</code>, the operation filters for results where the modality was either
     *        <code>Speech</code> or <code>Text</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsSessionFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the values of the category by which to apply the operator to filter the results. You can
     * provide multiple values if the operator is <code>EQ</code> or <code>CO</code>. If you provide multiple values,
     * you filter for results that equal/contain any of the values. For example, if the <code>name</code>,
     * <code>operator</code>, and <code>values</code> fields are <code>Modality</code>, <code>EQ</code>, and
     * <code>[Speech, Text]</code>, the operation filters for results where the modality was either <code>Speech</code>
     * or <code>Text</code>.
     * </p>
     * 
     * @param values
     *        An array containing the values of the category by which to apply the operator to filter the results. You
     *        can provide multiple values if the operator is <code>EQ</code> or <code>CO</code>. If you provide multiple
     *        values, you filter for results that equal/contain any of the values. For example, if the <code>name</code>
     *        , <code>operator</code>, and <code>values</code> fields are <code>Modality</code>, <code>EQ</code>, and
     *        <code>[Speech, Text]</code>, the operation filters for results where the modality was either
     *        <code>Speech</code> or <code>Text</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsSessionFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsSessionFilter == false)
            return false;
        AnalyticsSessionFilter other = (AnalyticsSessionFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public AnalyticsSessionFilter clone() {
        try {
            return (AnalyticsSessionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AnalyticsSessionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
