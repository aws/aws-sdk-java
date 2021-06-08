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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotLocale" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBotLocaleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The specified bot identifier.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The specified bot version.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The specified locale name.
     * </p>
     */
    private String localeName;
    /**
     * <p>
     * The specified locale identifier.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The specified description of the bot locale.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The specified confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents.
     * </p>
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
     * The status of the bot.
     * </p>
     * <p>
     * When the status is <code>Creating</code> the bot locale is being configured. When the status is
     * <code>Building</code> Amazon Lex is building the bot for testing and use.
     * </p>
     * <p>
     * If the status of the bot is <code>ReadyExpressTesting</code>, you can test the bot using the exact utterances
     * specified in the bots' intents. When the bot is ready for full testing or to run, the status is
     * <code>Built</code>.
     * </p>
     * <p>
     * If there was a problem with building the bot, the status is <code>Failed</code>. If the bot was saved but not
     * built, the status is <code>NotBuilt</code>.
     * </p>
     */
    private String botLocaleStatus;
    /**
     * <p>
     * A timestamp specifying the date and time that the bot locale was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The specified bot identifier.
     * </p>
     * 
     * @param botId
     *        The specified bot identifier.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The specified bot identifier.
     * </p>
     * 
     * @return The specified bot identifier.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The specified bot identifier.
     * </p>
     * 
     * @param botId
     *        The specified bot identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The specified bot version.
     * </p>
     * 
     * @param botVersion
     *        The specified bot version.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The specified bot version.
     * </p>
     * 
     * @return The specified bot version.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The specified bot version.
     * </p>
     * 
     * @param botVersion
     *        The specified bot version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The specified locale name.
     * </p>
     * 
     * @param localeName
     *        The specified locale name.
     */

    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }

    /**
     * <p>
     * The specified locale name.
     * </p>
     * 
     * @return The specified locale name.
     */

    public String getLocaleName() {
        return this.localeName;
    }

    /**
     * <p>
     * The specified locale name.
     * </p>
     * 
     * @param localeName
     *        The specified locale name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleResult withLocaleName(String localeName) {
        setLocaleName(localeName);
        return this;
    }

    /**
     * <p>
     * The specified locale identifier.
     * </p>
     * 
     * @param localeId
     *        The specified locale identifier.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The specified locale identifier.
     * </p>
     * 
     * @return The specified locale identifier.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The specified locale identifier.
     * </p>
     * 
     * @param localeId
     *        The specified locale identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The specified description of the bot locale.
     * </p>
     * 
     * @param description
     *        The specified description of the bot locale.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The specified description of the bot locale.
     * </p>
     * 
     * @return The specified description of the bot locale.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The specified description of the bot locale.
     * </p>
     * 
     * @param description
     *        The specified description of the bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The specified confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents.
     * </p>
     * 
     * @param nluIntentConfidenceThreshold
     *        The specified confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     *        <code>AMAZON.KendraSearchIntent</code> intents.
     */

    public void setNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * The specified confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents.
     * </p>
     * 
     * @return The specified confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     *         <code>AMAZON.KendraSearchIntent</code> intents.
     */

    public Double getNluIntentConfidenceThreshold() {
        return this.nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * The specified confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents.
     * </p>
     * 
     * @param nluIntentConfidenceThreshold
     *        The specified confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     *        <code>AMAZON.KendraSearchIntent</code> intents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleResult withNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
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

    public CreateBotLocaleResult withVoiceSettings(VoiceSettings voiceSettings) {
        setVoiceSettings(voiceSettings);
        return this;
    }

    /**
     * <p>
     * The status of the bot.
     * </p>
     * <p>
     * When the status is <code>Creating</code> the bot locale is being configured. When the status is
     * <code>Building</code> Amazon Lex is building the bot for testing and use.
     * </p>
     * <p>
     * If the status of the bot is <code>ReadyExpressTesting</code>, you can test the bot using the exact utterances
     * specified in the bots' intents. When the bot is ready for full testing or to run, the status is
     * <code>Built</code>.
     * </p>
     * <p>
     * If there was a problem with building the bot, the status is <code>Failed</code>. If the bot was saved but not
     * built, the status is <code>NotBuilt</code>.
     * </p>
     * 
     * @param botLocaleStatus
     *        The status of the bot.</p>
     *        <p>
     *        When the status is <code>Creating</code> the bot locale is being configured. When the status is
     *        <code>Building</code> Amazon Lex is building the bot for testing and use.
     *        </p>
     *        <p>
     *        If the status of the bot is <code>ReadyExpressTesting</code>, you can test the bot using the exact
     *        utterances specified in the bots' intents. When the bot is ready for full testing or to run, the status is
     *        <code>Built</code>.
     *        </p>
     *        <p>
     *        If there was a problem with building the bot, the status is <code>Failed</code>. If the bot was saved but
     *        not built, the status is <code>NotBuilt</code>.
     * @see BotLocaleStatus
     */

    public void setBotLocaleStatus(String botLocaleStatus) {
        this.botLocaleStatus = botLocaleStatus;
    }

    /**
     * <p>
     * The status of the bot.
     * </p>
     * <p>
     * When the status is <code>Creating</code> the bot locale is being configured. When the status is
     * <code>Building</code> Amazon Lex is building the bot for testing and use.
     * </p>
     * <p>
     * If the status of the bot is <code>ReadyExpressTesting</code>, you can test the bot using the exact utterances
     * specified in the bots' intents. When the bot is ready for full testing or to run, the status is
     * <code>Built</code>.
     * </p>
     * <p>
     * If there was a problem with building the bot, the status is <code>Failed</code>. If the bot was saved but not
     * built, the status is <code>NotBuilt</code>.
     * </p>
     * 
     * @return The status of the bot.</p>
     *         <p>
     *         When the status is <code>Creating</code> the bot locale is being configured. When the status is
     *         <code>Building</code> Amazon Lex is building the bot for testing and use.
     *         </p>
     *         <p>
     *         If the status of the bot is <code>ReadyExpressTesting</code>, you can test the bot using the exact
     *         utterances specified in the bots' intents. When the bot is ready for full testing or to run, the status
     *         is <code>Built</code>.
     *         </p>
     *         <p>
     *         If there was a problem with building the bot, the status is <code>Failed</code>. If the bot was saved but
     *         not built, the status is <code>NotBuilt</code>.
     * @see BotLocaleStatus
     */

    public String getBotLocaleStatus() {
        return this.botLocaleStatus;
    }

    /**
     * <p>
     * The status of the bot.
     * </p>
     * <p>
     * When the status is <code>Creating</code> the bot locale is being configured. When the status is
     * <code>Building</code> Amazon Lex is building the bot for testing and use.
     * </p>
     * <p>
     * If the status of the bot is <code>ReadyExpressTesting</code>, you can test the bot using the exact utterances
     * specified in the bots' intents. When the bot is ready for full testing or to run, the status is
     * <code>Built</code>.
     * </p>
     * <p>
     * If there was a problem with building the bot, the status is <code>Failed</code>. If the bot was saved but not
     * built, the status is <code>NotBuilt</code>.
     * </p>
     * 
     * @param botLocaleStatus
     *        The status of the bot.</p>
     *        <p>
     *        When the status is <code>Creating</code> the bot locale is being configured. When the status is
     *        <code>Building</code> Amazon Lex is building the bot for testing and use.
     *        </p>
     *        <p>
     *        If the status of the bot is <code>ReadyExpressTesting</code>, you can test the bot using the exact
     *        utterances specified in the bots' intents. When the bot is ready for full testing or to run, the status is
     *        <code>Built</code>.
     *        </p>
     *        <p>
     *        If there was a problem with building the bot, the status is <code>Failed</code>. If the bot was saved but
     *        not built, the status is <code>NotBuilt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleStatus
     */

    public CreateBotLocaleResult withBotLocaleStatus(String botLocaleStatus) {
        setBotLocaleStatus(botLocaleStatus);
        return this;
    }

    /**
     * <p>
     * The status of the bot.
     * </p>
     * <p>
     * When the status is <code>Creating</code> the bot locale is being configured. When the status is
     * <code>Building</code> Amazon Lex is building the bot for testing and use.
     * </p>
     * <p>
     * If the status of the bot is <code>ReadyExpressTesting</code>, you can test the bot using the exact utterances
     * specified in the bots' intents. When the bot is ready for full testing or to run, the status is
     * <code>Built</code>.
     * </p>
     * <p>
     * If there was a problem with building the bot, the status is <code>Failed</code>. If the bot was saved but not
     * built, the status is <code>NotBuilt</code>.
     * </p>
     * 
     * @param botLocaleStatus
     *        The status of the bot.</p>
     *        <p>
     *        When the status is <code>Creating</code> the bot locale is being configured. When the status is
     *        <code>Building</code> Amazon Lex is building the bot for testing and use.
     *        </p>
     *        <p>
     *        If the status of the bot is <code>ReadyExpressTesting</code>, you can test the bot using the exact
     *        utterances specified in the bots' intents. When the bot is ready for full testing or to run, the status is
     *        <code>Built</code>.
     *        </p>
     *        <p>
     *        If there was a problem with building the bot, the status is <code>Failed</code>. If the bot was saved but
     *        not built, the status is <code>NotBuilt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleStatus
     */

    public CreateBotLocaleResult withBotLocaleStatus(BotLocaleStatus botLocaleStatus) {
        this.botLocaleStatus = botLocaleStatus.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp specifying the date and time that the bot locale was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp specifying the date and time that the bot locale was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp specifying the date and time that the bot locale was created.
     * </p>
     * 
     * @return A timestamp specifying the date and time that the bot locale was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp specifying the date and time that the bot locale was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp specifying the date and time that the bot locale was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotLocaleResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
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
        if (getLocaleName() != null)
            sb.append("LocaleName: ").append(getLocaleName()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNluIntentConfidenceThreshold() != null)
            sb.append("NluIntentConfidenceThreshold: ").append(getNluIntentConfidenceThreshold()).append(",");
        if (getVoiceSettings() != null)
            sb.append("VoiceSettings: ").append(getVoiceSettings()).append(",");
        if (getBotLocaleStatus() != null)
            sb.append("BotLocaleStatus: ").append(getBotLocaleStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBotLocaleResult == false)
            return false;
        CreateBotLocaleResult other = (CreateBotLocaleResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleName() == null ^ this.getLocaleName() == null)
            return false;
        if (other.getLocaleName() != null && other.getLocaleName().equals(this.getLocaleName()) == false)
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
        if (other.getBotLocaleStatus() == null ^ this.getBotLocaleStatus() == null)
            return false;
        if (other.getBotLocaleStatus() != null && other.getBotLocaleStatus().equals(this.getBotLocaleStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleName() == null) ? 0 : getLocaleName().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNluIntentConfidenceThreshold() == null) ? 0 : getNluIntentConfidenceThreshold().hashCode());
        hashCode = prime * hashCode + ((getVoiceSettings() == null) ? 0 : getVoiceSettings().hashCode());
        hashCode = prime * hashCode + ((getBotLocaleStatus() == null) ? 0 : getBotLocaleStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateBotLocaleResult clone() {
        try {
            return (CreateBotLocaleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
