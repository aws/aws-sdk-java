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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotLocale" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBotLocaleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot that contains the updated locale.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contains the updated locale.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The language and locale of the updated bot locale.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The updated locale name for the locale.
     * </p>
     */
    private String localeName;
    /**
     * <p>
     * The updated description of the locale.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     */
    private Double nluIntentConfidenceThreshold;
    /**
     * <p>
     * The updated Amazon Polly voice to use for voice interaction with the user.
     * </p>
     */
    private VoiceSettings voiceSettings;
    /**
     * <p>
     * The current status of the locale. When the bot status is <code>Built</code> the locale is ready for use.
     * </p>
     */
    private String botLocaleStatus;
    /**
     * <p>
     * If the <code>botLocaleStatus</code> is <code>Failed</code>, the <code>failureReasons</code> field lists the
     * errors that occurred while building the bot.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * A timestamp of the date and time that the locale was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A timestamp of the date and time that the locale was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The identifier of the bot that contains the updated locale.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the updated locale.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the updated locale.
     * </p>
     * 
     * @return The identifier of the bot that contains the updated locale.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the updated locale.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the updated locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contains the updated locale.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the updated locale.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the updated locale.
     * </p>
     * 
     * @return The version of the bot that contains the updated locale.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the updated locale.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the updated locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The language and locale of the updated bot locale.
     * </p>
     * 
     * @param localeId
     *        The language and locale of the updated bot locale.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The language and locale of the updated bot locale.
     * </p>
     * 
     * @return The language and locale of the updated bot locale.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The language and locale of the updated bot locale.
     * </p>
     * 
     * @param localeId
     *        The language and locale of the updated bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The updated locale name for the locale.
     * </p>
     * 
     * @param localeName
     *        The updated locale name for the locale.
     */

    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }

    /**
     * <p>
     * The updated locale name for the locale.
     * </p>
     * 
     * @return The updated locale name for the locale.
     */

    public String getLocaleName() {
        return this.localeName;
    }

    /**
     * <p>
     * The updated locale name for the locale.
     * </p>
     * 
     * @param localeName
     *        The updated locale name for the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withLocaleName(String localeName) {
        setLocaleName(localeName);
        return this;
    }

    /**
     * <p>
     * The updated description of the locale.
     * </p>
     * 
     * @param description
     *        The updated description of the locale.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the locale.
     * </p>
     * 
     * @return The updated description of the locale.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of the locale.
     * </p>
     * 
     * @param description
     *        The updated description of the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     * 
     * @param nluIntentConfidenceThreshold
     *        The updated confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     *        <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     */

    public void setNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * The updated confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     * 
     * @return The updated confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     *         <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     */

    public Double getNluIntentConfidenceThreshold() {
        return this.nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * The updated confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     * 
     * @param nluIntentConfidenceThreshold
     *        The updated confidence threshold for inserting the <code>AMAZON.FallbackIntent</code> and
     *        <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        setNluIntentConfidenceThreshold(nluIntentConfidenceThreshold);
        return this;
    }

    /**
     * <p>
     * The updated Amazon Polly voice to use for voice interaction with the user.
     * </p>
     * 
     * @param voiceSettings
     *        The updated Amazon Polly voice to use for voice interaction with the user.
     */

    public void setVoiceSettings(VoiceSettings voiceSettings) {
        this.voiceSettings = voiceSettings;
    }

    /**
     * <p>
     * The updated Amazon Polly voice to use for voice interaction with the user.
     * </p>
     * 
     * @return The updated Amazon Polly voice to use for voice interaction with the user.
     */

    public VoiceSettings getVoiceSettings() {
        return this.voiceSettings;
    }

    /**
     * <p>
     * The updated Amazon Polly voice to use for voice interaction with the user.
     * </p>
     * 
     * @param voiceSettings
     *        The updated Amazon Polly voice to use for voice interaction with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withVoiceSettings(VoiceSettings voiceSettings) {
        setVoiceSettings(voiceSettings);
        return this;
    }

    /**
     * <p>
     * The current status of the locale. When the bot status is <code>Built</code> the locale is ready for use.
     * </p>
     * 
     * @param botLocaleStatus
     *        The current status of the locale. When the bot status is <code>Built</code> the locale is ready for use.
     * @see BotLocaleStatus
     */

    public void setBotLocaleStatus(String botLocaleStatus) {
        this.botLocaleStatus = botLocaleStatus;
    }

    /**
     * <p>
     * The current status of the locale. When the bot status is <code>Built</code> the locale is ready for use.
     * </p>
     * 
     * @return The current status of the locale. When the bot status is <code>Built</code> the locale is ready for use.
     * @see BotLocaleStatus
     */

    public String getBotLocaleStatus() {
        return this.botLocaleStatus;
    }

    /**
     * <p>
     * The current status of the locale. When the bot status is <code>Built</code> the locale is ready for use.
     * </p>
     * 
     * @param botLocaleStatus
     *        The current status of the locale. When the bot status is <code>Built</code> the locale is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleStatus
     */

    public UpdateBotLocaleResult withBotLocaleStatus(String botLocaleStatus) {
        setBotLocaleStatus(botLocaleStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the locale. When the bot status is <code>Built</code> the locale is ready for use.
     * </p>
     * 
     * @param botLocaleStatus
     *        The current status of the locale. When the bot status is <code>Built</code> the locale is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleStatus
     */

    public UpdateBotLocaleResult withBotLocaleStatus(BotLocaleStatus botLocaleStatus) {
        this.botLocaleStatus = botLocaleStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>botLocaleStatus</code> is <code>Failed</code>, the <code>failureReasons</code> field lists the
     * errors that occurred while building the bot.
     * </p>
     * 
     * @return If the <code>botLocaleStatus</code> is <code>Failed</code>, the <code>failureReasons</code> field lists
     *         the errors that occurred while building the bot.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * If the <code>botLocaleStatus</code> is <code>Failed</code>, the <code>failureReasons</code> field lists the
     * errors that occurred while building the bot.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>botLocaleStatus</code> is <code>Failed</code>, the <code>failureReasons</code> field lists
     *        the errors that occurred while building the bot.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * If the <code>botLocaleStatus</code> is <code>Failed</code>, the <code>failureReasons</code> field lists the
     * errors that occurred while building the bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>botLocaleStatus</code> is <code>Failed</code>, the <code>failureReasons</code> field lists
     *        the errors that occurred while building the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the <code>botLocaleStatus</code> is <code>Failed</code>, the <code>failureReasons</code> field lists the
     * errors that occurred while building the bot.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>botLocaleStatus</code> is <code>Failed</code>, the <code>failureReasons</code> field lists
     *        the errors that occurred while building the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the locale was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the locale was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the locale was created.
     * </p>
     * 
     * @return A timestamp of the date and time that the locale was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the locale was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the locale was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the locale was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the locale was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the locale was last updated.
     * </p>
     * 
     * @return A timestamp of the date and time that the locale was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the locale was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the locale was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotLocaleResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getLocaleName() != null)
            sb.append("LocaleName: ").append(getLocaleName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNluIntentConfidenceThreshold() != null)
            sb.append("NluIntentConfidenceThreshold: ").append(getNluIntentConfidenceThreshold()).append(",");
        if (getVoiceSettings() != null)
            sb.append("VoiceSettings: ").append(getVoiceSettings()).append(",");
        if (getBotLocaleStatus() != null)
            sb.append("BotLocaleStatus: ").append(getBotLocaleStatus()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBotLocaleResult == false)
            return false;
        UpdateBotLocaleResult other = (UpdateBotLocaleResult) obj;
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
        if (other.getLocaleName() == null ^ this.getLocaleName() == null)
            return false;
        if (other.getLocaleName() != null && other.getLocaleName().equals(this.getLocaleName()) == false)
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
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
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
        hashCode = prime * hashCode + ((getLocaleName() == null) ? 0 : getLocaleName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNluIntentConfidenceThreshold() == null) ? 0 : getNluIntentConfidenceThreshold().hashCode());
        hashCode = prime * hashCode + ((getVoiceSettings() == null) ? 0 : getVoiceSettings().hashCode());
        hashCode = prime * hashCode + ((getBotLocaleStatus() == null) ? 0 : getBotLocaleStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBotLocaleResult clone() {
        try {
            return (UpdateBotLocaleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
