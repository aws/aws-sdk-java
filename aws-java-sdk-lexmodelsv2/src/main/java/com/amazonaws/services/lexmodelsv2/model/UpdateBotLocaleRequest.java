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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotLocale" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBotLocaleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot that contains the locale.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contains the locale to be updated. The version can only be the <code>DRAFT</code>
     * version.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale to update. The string must match one of the supported locales. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The new description of the locale.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The new confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     */
    private Double nluIntentConfidenceThreshold;
    /**
     * <p>
     * The new Amazon Polly voice Amazon Lex should use for voice interaction with the user.
     * </p>
     */
    private VoiceSettings voiceSettings;

    /**
     * <p>
     * The unique identifier of the bot that contains the locale.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the locale.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the locale.
     * </p>
     * 
     * @return The unique identifier of the bot that contains the locale.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the locale.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contains the locale to be updated. The version can only be the <code>DRAFT</code>
     * version.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the locale to be updated. The version can only be the
     *        <code>DRAFT</code> version.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the locale to be updated. The version can only be the <code>DRAFT</code>
     * version.
     * </p>
     * 
     * @return The version of the bot that contains the locale to be updated. The version can only be the
     *         <code>DRAFT</code> version.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the locale to be updated. The version can only be the <code>DRAFT</code>
     * version.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the locale to be updated. The version can only be the
     *        <code>DRAFT</code> version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale to update. The string must match one of the supported locales. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale to update. The string must match one of the supported locales.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale to update. The string must match one of the supported locales. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale to update. The string must match one of the supported locales.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale to update. The string must match one of the supported locales. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale to update. The string must match one of the supported locales.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The new description of the locale.
     * </p>
     * 
     * @param description
     *        The new description of the locale.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description of the locale.
     * </p>
     * 
     * @return The new description of the locale.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description of the locale.
     * </p>
     * 
     * @param description
     *        The new description of the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The new confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     * 
     * @param nluIntentConfidenceThreshold
     *        The new confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     *        <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     */

    public void setNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * The new confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     * 
     * @return The new confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     *         <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     */

    public Double getNluIntentConfidenceThreshold() {
        return this.nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * The new confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     * 
     * @param nluIntentConfidenceThreshold
     *        The new confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     *        <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleRequest withNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        setNluIntentConfidenceThreshold(nluIntentConfidenceThreshold);
        return this;
    }

    /**
     * <p>
     * The new Amazon Polly voice Amazon Lex should use for voice interaction with the user.
     * </p>
     * 
     * @param voiceSettings
     *        The new Amazon Polly voice Amazon Lex should use for voice interaction with the user.
     */

    public void setVoiceSettings(VoiceSettings voiceSettings) {
        this.voiceSettings = voiceSettings;
    }

    /**
     * <p>
     * The new Amazon Polly voice Amazon Lex should use for voice interaction with the user.
     * </p>
     * 
     * @return The new Amazon Polly voice Amazon Lex should use for voice interaction with the user.
     */

    public VoiceSettings getVoiceSettings() {
        return this.voiceSettings;
    }

    /**
     * <p>
     * The new Amazon Polly voice Amazon Lex should use for voice interaction with the user.
     * </p>
     * 
     * @param voiceSettings
     *        The new Amazon Polly voice Amazon Lex should use for voice interaction with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleRequest withVoiceSettings(VoiceSettings voiceSettings) {
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

        if (obj instanceof UpdateBotLocaleRequest == false)
            return false;
        UpdateBotLocaleRequest other = (UpdateBotLocaleRequest) obj;
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
    public UpdateBotLocaleRequest clone() {
        return (UpdateBotLocaleRequest) super.clone();
    }

}
