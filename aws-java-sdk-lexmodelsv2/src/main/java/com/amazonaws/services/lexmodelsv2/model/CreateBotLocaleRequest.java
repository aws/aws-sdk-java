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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotLocale" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBotLocaleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot to create the locale for.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot to create the locale for. This can only be the draft version of the bot.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * A description of the bot locale. Use this to help identify the bot locale in lists.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * <p>
     * For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     * <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following confidence
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the PostText operation would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMAZON.FallbackIntent
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentA
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentB
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentC
     * </p>
     * </li>
     * </ul>
     */
    private Double nluIntentConfidenceThreshold;
    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     * </p>
     */
    private VoiceSettings voiceSettings;

    /**
     * <p>
     * The identifier of the bot to create the locale for.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to create the locale for.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot to create the locale for.
     * </p>
     * 
     * @return The identifier of the bot to create the locale for.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot to create the locale for.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to create the locale for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot to create the locale for. This can only be the draft version of the bot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to create the locale for. This can only be the draft version of the bot.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot to create the locale for. This can only be the draft version of the bot.
     * </p>
     * 
     * @return The version of the bot to create the locale for. This can only be the draft version of the bot.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot to create the locale for. This can only be the draft version of the bot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to create the locale for. This can only be the draft version of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the bot will be used in. The string must match one of the
     *        supported locales. All of the intents, slot types, and slots used in the bot must have the same locale.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https:
     *        //docs.aws.amazon.com/lex/latest/dg/supported-locales.html</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     * 
     * @return The identifier of the language and locale that the bot will be used in. The string must match one of the
     *         supported locales. All of the intents, slot types, and slots used in the bot must have the same locale.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https
     *         ://docs.aws.amazon.com/lex/latest/dg/supported-locales.html</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the bot will be used in. The string must match one of the
     *        supported locales. All of the intents, slot types, and slots used in the bot must have the same locale.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https:
     *        //docs.aws.amazon.com/lex/latest/dg/supported-locales.html</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * A description of the bot locale. Use this to help identify the bot locale in lists.
     * </p>
     * 
     * @param description
     *        A description of the bot locale. Use this to help identify the bot locale in lists.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the bot locale. Use this to help identify the bot locale in lists.
     * </p>
     * 
     * @return A description of the bot locale. Use this to help identify the bot locale in lists.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the bot locale. Use this to help identify the bot locale in lists.
     * </p>
     * 
     * @param description
     *        A description of the bot locale. Use this to help identify the bot locale in lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * <p>
     * For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     * <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following confidence
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the PostText operation would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMAZON.FallbackIntent
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentA
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentB
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentC
     * </p>
     * </li>
     * </ul>
     * 
     * @param nluIntentConfidenceThreshold
     *        Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     *        <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents.
     *        <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *        are configured for the bot.</p>
     *        <p>
     *        For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     *        <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following
     *        confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the PostText
     *        operation would be:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AMAZON.FallbackIntent
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentC
     *        </p>
     *        </li>
     */

    public void setNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * <p>
     * For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     * <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following confidence
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the PostText operation would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMAZON.FallbackIntent
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentA
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentB
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentC
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     *         <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents.
     *         <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *         are configured for the bot.</p>
     *         <p>
     *         For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     *         <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following
     *         confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the PostText
     *         operation would be:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AMAZON.FallbackIntent
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IntentA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IntentB
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IntentC
     *         </p>
     *         </li>
     */

    public Double getNluIntentConfidenceThreshold() {
        return this.nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * <p>
     * For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     * <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following confidence
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the PostText operation would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMAZON.FallbackIntent
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentA
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentB
     * </p>
     * </li>
     * <li>
     * <p>
     * IntentC
     * </p>
     * </li>
     * </ul>
     * 
     * @param nluIntentConfidenceThreshold
     *        Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     *        <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents.
     *        <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *        are configured for the bot.</p>
     *        <p>
     *        For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     *        <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following
     *        confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the PostText
     *        operation would be:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AMAZON.FallbackIntent
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IntentC
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleRequest withNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        setNluIntentConfidenceThreshold(nluIntentConfidenceThreshold);
        return this;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     * </p>
     * 
     * @param voiceSettings
     *        The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     */

    public void setVoiceSettings(VoiceSettings voiceSettings) {
        this.voiceSettings = voiceSettings;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     * </p>
     * 
     * @return The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     */

    public VoiceSettings getVoiceSettings() {
        return this.voiceSettings;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     * </p>
     * 
     * @param voiceSettings
     *        The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleRequest withVoiceSettings(VoiceSettings voiceSettings) {
        setVoiceSettings(voiceSettings);
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
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNluIntentConfidenceThreshold() != null)
            sb.append("NluIntentConfidenceThreshold: ").append(getNluIntentConfidenceThreshold()).append(",");
        if (getVoiceSettings() != null)
            sb.append("VoiceSettings: ").append(getVoiceSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBotLocaleRequest == false)
            return false;
        CreateBotLocaleRequest other = (CreateBotLocaleRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNluIntentConfidenceThreshold() == null ^ this.getNluIntentConfidenceThreshold() == null)
            return false;
        if (other.getNluIntentConfidenceThreshold() != null && other.getNluIntentConfidenceThreshold().equals(this.getNluIntentConfidenceThreshold()) == false)
            return false;
        if (other.getVoiceSettings() == null ^ this.getVoiceSettings() == null)
            return false;
        if (other.getVoiceSettings() != null && other.getVoiceSettings().equals(this.getVoiceSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNluIntentConfidenceThreshold() == null) ? 0 : getNluIntentConfidenceThreshold().hashCode());
        hashCode = prime * hashCode + ((getVoiceSettings() == null) ? 0 : getVoiceSettings().hashCode());
        return hashCode;
    }

    @Override
    public CreateBotLocaleRequest clone() {
        return (CreateBotLocaleRequest) super.clone();
    }

}
