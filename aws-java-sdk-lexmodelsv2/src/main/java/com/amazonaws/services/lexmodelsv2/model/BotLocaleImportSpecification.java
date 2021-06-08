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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the bot locale parameters required for importing a bot locale.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotLocaleImportSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotLocaleImportSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the bot to import the locale to.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot to import the locale to. This can only be the <code>DRAFT</code> version of the bot.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     */
    private String localeId;
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
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the <code>PostText</code> operation
     * would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AMAZON.FallbackIntent</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentB</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentC</code>
     * </p>
     * </li>
     * </ul>
     */
    private Double nluIntentConfidenceThreshold;

    private VoiceSettings voiceSettings;

    /**
     * <p>
     * The identifier of the bot to import the locale to.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to import the locale to.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot to import the locale to.
     * </p>
     * 
     * @return The identifier of the bot to import the locale to.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot to import the locale to.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to import the locale to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleImportSpecification withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot to import the locale to. This can only be the <code>DRAFT</code> version of the bot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to import the locale to. This can only be the <code>DRAFT</code> version of the
     *        bot.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot to import the locale to. This can only be the <code>DRAFT</code> version of the bot.
     * </p>
     * 
     * @return The version of the bot to import the locale to. This can only be the <code>DRAFT</code> version of the
     *         bot.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot to import the locale to. This can only be the <code>DRAFT</code> version of the bot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to import the locale to. This can only be the <code>DRAFT</code> version of the
     *        bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleImportSpecification withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the bot will be used in. The string must match one of the
     *        supported locales. All of the intents, slot types, and slots used in the bot must have the same locale.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale that the bot will be used in. The string must match one of the
     *         supported locales. All of the intents, slot types, and slots used in the bot must have the same locale.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the bot will be used in. The string must match one of the
     *        supported locales. All of the intents, slot types, and slots used in the bot must have the same locale.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleImportSpecification withLocaleId(String localeId) {
        setLocaleId(localeId);
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
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the <code>PostText</code> operation
     * would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AMAZON.FallbackIntent</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentB</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentC</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param nluIntentConfidenceThreshold
     *        Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     *        <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents.
     *        <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *        are configured for the bot. </p>
     *        <p>
     *        For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     *        <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following
     *        confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the
     *        <code>PostText</code> operation would be:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AMAZON.FallbackIntent</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentB</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentC</code>
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
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the <code>PostText</code> operation
     * would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AMAZON.FallbackIntent</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentB</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentC</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     *         <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents.
     *         <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *         are configured for the bot. </p>
     *         <p>
     *         For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     *         <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following
     *         confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the
     *         <code>PostText</code> operation would be:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AMAZON.FallbackIntent</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IntentA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IntentB</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IntentC</code>
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
     * scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the <code>PostText</code> operation
     * would be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AMAZON.FallbackIntent</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentB</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IntentC</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param nluIntentConfidenceThreshold
     *        Determines the threshold where Amazon Lex will insert the <code>AMAZON.FallbackIntent</code>,
     *        <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents.
     *        <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *        are configured for the bot. </p>
     *        <p>
     *        For example, suppose a bot is configured with the confidence threshold of 0.80 and the
     *        <code>AMAZON.FallbackIntent</code>. Amazon Lex returns three alternative intents with the following
     *        confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the
     *        <code>PostText</code> operation would be:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AMAZON.FallbackIntent</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentB</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IntentC</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleImportSpecification withNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        setNluIntentConfidenceThreshold(nluIntentConfidenceThreshold);
        return this;
    }

    /**
     * @param voiceSettings
     */

    public void setVoiceSettings(VoiceSettings voiceSettings) {
        this.voiceSettings = voiceSettings;
    }

    /**
     * @return
     */

    public VoiceSettings getVoiceSettings() {
        return this.voiceSettings;
    }

    /**
     * @param voiceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleImportSpecification withVoiceSettings(VoiceSettings voiceSettings) {
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

        if (obj instanceof BotLocaleImportSpecification == false)
            return false;
        BotLocaleImportSpecification other = (BotLocaleImportSpecification) obj;
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
        hashCode = prime * hashCode + ((getNluIntentConfidenceThreshold() == null) ? 0 : getNluIntentConfidenceThreshold().hashCode());
        hashCode = prime * hashCode + ((getVoiceSettings() == null) ? 0 : getVoiceSettings().hashCode());
        return hashCode;
    }

    @Override
    public BotLocaleImportSpecification clone() {
        try {
            return (BotLocaleImportSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotLocaleImportSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
