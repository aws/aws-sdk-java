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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotLocale" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotLocaleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot associated with the locale.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The identifier of the version of the bot associated with the locale.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The unique identifier of the described locale.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The name of the locale.
     * </p>
     */
    private String localeName;
    /**
     * <p>
     * The description of the locale.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     */
    private Double nluIntentConfidenceThreshold;
    /**
     * <p>
     * The Amazon Polly voice Amazon Lex uses for voice interaction with the user.
     * </p>
     */
    private VoiceSettings voiceSettings;
    /**
     * <p>
     * The number of intents defined for the locale.
     * </p>
     */
    private Integer intentsCount;
    /**
     * <p>
     * The number of slot types defined for the locale.
     * </p>
     */
    private Integer slotTypesCount;
    /**
     * <p>
     * The status of the bot. If the status is <code>Failed</code>, the reasons for the failure are listed in the
     * <code>failureReasons</code> field.
     * </p>
     */
    private String botLocaleStatus;
    /**
     * <p>
     * if <code>botLocaleStatus</code> is <code>Failed</code>, Amazon Lex explains why it failed to build the bot.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * The date and time that the locale was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time that the locale was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The date and time that the locale was last submitted for building.
     * </p>
     */
    private java.util.Date lastBuildSubmittedDateTime;
    /**
     * <p>
     * History of changes, such as when a locale is used in an alias, that have taken place for the locale.
     * </p>
     */
    private java.util.List<BotLocaleHistoryEvent> botLocaleHistoryEvents;

    /**
     * <p>
     * The identifier of the bot associated with the locale.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the locale.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the locale.
     * </p>
     * 
     * @return The identifier of the bot associated with the locale.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the locale.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The identifier of the version of the bot associated with the locale.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the version of the bot associated with the locale.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The identifier of the version of the bot associated with the locale.
     * </p>
     * 
     * @return The identifier of the version of the bot associated with the locale.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The identifier of the version of the bot associated with the locale.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the version of the bot associated with the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the described locale.
     * </p>
     * 
     * @param localeId
     *        The unique identifier of the described locale.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The unique identifier of the described locale.
     * </p>
     * 
     * @return The unique identifier of the described locale.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The unique identifier of the described locale.
     * </p>
     * 
     * @param localeId
     *        The unique identifier of the described locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The name of the locale.
     * </p>
     * 
     * @param localeName
     *        The name of the locale.
     */

    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }

    /**
     * <p>
     * The name of the locale.
     * </p>
     * 
     * @return The name of the locale.
     */

    public String getLocaleName() {
        return this.localeName;
    }

    /**
     * <p>
     * The name of the locale.
     * </p>
     * 
     * @param localeName
     *        The name of the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withLocaleName(String localeName) {
        setLocaleName(localeName);
        return this;
    }

    /**
     * <p>
     * The description of the locale.
     * </p>
     * 
     * @param description
     *        The description of the locale.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the locale.
     * </p>
     * 
     * @return The description of the locale.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the locale.
     * </p>
     * 
     * @param description
     *        The description of the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     * 
     * @param nluIntentConfidenceThreshold
     *        The confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     *        <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     */

    public void setNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * The confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     * 
     * @return The confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     *         <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     */

    public Double getNluIntentConfidenceThreshold() {
        return this.nluIntentConfidenceThreshold;
    }

    /**
     * <p>
     * The confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     * <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * </p>
     * 
     * @param nluIntentConfidenceThreshold
     *        The confidence threshold where Amazon Lex inserts the <code>AMAZON.FallbackIntent</code> and
     *        <code>AMAZON.KendraSearchIntent</code> intents in the list of possible intents for an utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withNluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
        setNluIntentConfidenceThreshold(nluIntentConfidenceThreshold);
        return this;
    }

    /**
     * <p>
     * The Amazon Polly voice Amazon Lex uses for voice interaction with the user.
     * </p>
     * 
     * @param voiceSettings
     *        The Amazon Polly voice Amazon Lex uses for voice interaction with the user.
     */

    public void setVoiceSettings(VoiceSettings voiceSettings) {
        this.voiceSettings = voiceSettings;
    }

    /**
     * <p>
     * The Amazon Polly voice Amazon Lex uses for voice interaction with the user.
     * </p>
     * 
     * @return The Amazon Polly voice Amazon Lex uses for voice interaction with the user.
     */

    public VoiceSettings getVoiceSettings() {
        return this.voiceSettings;
    }

    /**
     * <p>
     * The Amazon Polly voice Amazon Lex uses for voice interaction with the user.
     * </p>
     * 
     * @param voiceSettings
     *        The Amazon Polly voice Amazon Lex uses for voice interaction with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withVoiceSettings(VoiceSettings voiceSettings) {
        setVoiceSettings(voiceSettings);
        return this;
    }

    /**
     * <p>
     * The number of intents defined for the locale.
     * </p>
     * 
     * @param intentsCount
     *        The number of intents defined for the locale.
     */

    public void setIntentsCount(Integer intentsCount) {
        this.intentsCount = intentsCount;
    }

    /**
     * <p>
     * The number of intents defined for the locale.
     * </p>
     * 
     * @return The number of intents defined for the locale.
     */

    public Integer getIntentsCount() {
        return this.intentsCount;
    }

    /**
     * <p>
     * The number of intents defined for the locale.
     * </p>
     * 
     * @param intentsCount
     *        The number of intents defined for the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withIntentsCount(Integer intentsCount) {
        setIntentsCount(intentsCount);
        return this;
    }

    /**
     * <p>
     * The number of slot types defined for the locale.
     * </p>
     * 
     * @param slotTypesCount
     *        The number of slot types defined for the locale.
     */

    public void setSlotTypesCount(Integer slotTypesCount) {
        this.slotTypesCount = slotTypesCount;
    }

    /**
     * <p>
     * The number of slot types defined for the locale.
     * </p>
     * 
     * @return The number of slot types defined for the locale.
     */

    public Integer getSlotTypesCount() {
        return this.slotTypesCount;
    }

    /**
     * <p>
     * The number of slot types defined for the locale.
     * </p>
     * 
     * @param slotTypesCount
     *        The number of slot types defined for the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withSlotTypesCount(Integer slotTypesCount) {
        setSlotTypesCount(slotTypesCount);
        return this;
    }

    /**
     * <p>
     * The status of the bot. If the status is <code>Failed</code>, the reasons for the failure are listed in the
     * <code>failureReasons</code> field.
     * </p>
     * 
     * @param botLocaleStatus
     *        The status of the bot. If the status is <code>Failed</code>, the reasons for the failure are listed in the
     *        <code>failureReasons</code> field.
     * @see BotLocaleStatus
     */

    public void setBotLocaleStatus(String botLocaleStatus) {
        this.botLocaleStatus = botLocaleStatus;
    }

    /**
     * <p>
     * The status of the bot. If the status is <code>Failed</code>, the reasons for the failure are listed in the
     * <code>failureReasons</code> field.
     * </p>
     * 
     * @return The status of the bot. If the status is <code>Failed</code>, the reasons for the failure are listed in
     *         the <code>failureReasons</code> field.
     * @see BotLocaleStatus
     */

    public String getBotLocaleStatus() {
        return this.botLocaleStatus;
    }

    /**
     * <p>
     * The status of the bot. If the status is <code>Failed</code>, the reasons for the failure are listed in the
     * <code>failureReasons</code> field.
     * </p>
     * 
     * @param botLocaleStatus
     *        The status of the bot. If the status is <code>Failed</code>, the reasons for the failure are listed in the
     *        <code>failureReasons</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleStatus
     */

    public DescribeBotLocaleResult withBotLocaleStatus(String botLocaleStatus) {
        setBotLocaleStatus(botLocaleStatus);
        return this;
    }

    /**
     * <p>
     * The status of the bot. If the status is <code>Failed</code>, the reasons for the failure are listed in the
     * <code>failureReasons</code> field.
     * </p>
     * 
     * @param botLocaleStatus
     *        The status of the bot. If the status is <code>Failed</code>, the reasons for the failure are listed in the
     *        <code>failureReasons</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleStatus
     */

    public DescribeBotLocaleResult withBotLocaleStatus(BotLocaleStatus botLocaleStatus) {
        this.botLocaleStatus = botLocaleStatus.toString();
        return this;
    }

    /**
     * <p>
     * if <code>botLocaleStatus</code> is <code>Failed</code>, Amazon Lex explains why it failed to build the bot.
     * </p>
     * 
     * @return if <code>botLocaleStatus</code> is <code>Failed</code>, Amazon Lex explains why it failed to build the
     *         bot.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * if <code>botLocaleStatus</code> is <code>Failed</code>, Amazon Lex explains why it failed to build the bot.
     * </p>
     * 
     * @param failureReasons
     *        if <code>botLocaleStatus</code> is <code>Failed</code>, Amazon Lex explains why it failed to build the
     *        bot.
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
     * if <code>botLocaleStatus</code> is <code>Failed</code>, Amazon Lex explains why it failed to build the bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        if <code>botLocaleStatus</code> is <code>Failed</code>, Amazon Lex explains why it failed to build the
     *        bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withFailureReasons(String... failureReasons) {
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
     * if <code>botLocaleStatus</code> is <code>Failed</code>, Amazon Lex explains why it failed to build the bot.
     * </p>
     * 
     * @param failureReasons
     *        if <code>botLocaleStatus</code> is <code>Failed</code>, Amazon Lex explains why it failed to build the
     *        bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * The date and time that the locale was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the locale was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time that the locale was created.
     * </p>
     * 
     * @return The date and time that the locale was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time that the locale was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the locale was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the locale was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the locale was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the locale was last updated.
     * </p>
     * 
     * @return The date and time that the locale was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the locale was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the locale was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the locale was last submitted for building.
     * </p>
     * 
     * @param lastBuildSubmittedDateTime
     *        The date and time that the locale was last submitted for building.
     */

    public void setLastBuildSubmittedDateTime(java.util.Date lastBuildSubmittedDateTime) {
        this.lastBuildSubmittedDateTime = lastBuildSubmittedDateTime;
    }

    /**
     * <p>
     * The date and time that the locale was last submitted for building.
     * </p>
     * 
     * @return The date and time that the locale was last submitted for building.
     */

    public java.util.Date getLastBuildSubmittedDateTime() {
        return this.lastBuildSubmittedDateTime;
    }

    /**
     * <p>
     * The date and time that the locale was last submitted for building.
     * </p>
     * 
     * @param lastBuildSubmittedDateTime
     *        The date and time that the locale was last submitted for building.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withLastBuildSubmittedDateTime(java.util.Date lastBuildSubmittedDateTime) {
        setLastBuildSubmittedDateTime(lastBuildSubmittedDateTime);
        return this;
    }

    /**
     * <p>
     * History of changes, such as when a locale is used in an alias, that have taken place for the locale.
     * </p>
     * 
     * @return History of changes, such as when a locale is used in an alias, that have taken place for the locale.
     */

    public java.util.List<BotLocaleHistoryEvent> getBotLocaleHistoryEvents() {
        return botLocaleHistoryEvents;
    }

    /**
     * <p>
     * History of changes, such as when a locale is used in an alias, that have taken place for the locale.
     * </p>
     * 
     * @param botLocaleHistoryEvents
     *        History of changes, such as when a locale is used in an alias, that have taken place for the locale.
     */

    public void setBotLocaleHistoryEvents(java.util.Collection<BotLocaleHistoryEvent> botLocaleHistoryEvents) {
        if (botLocaleHistoryEvents == null) {
            this.botLocaleHistoryEvents = null;
            return;
        }

        this.botLocaleHistoryEvents = new java.util.ArrayList<BotLocaleHistoryEvent>(botLocaleHistoryEvents);
    }

    /**
     * <p>
     * History of changes, such as when a locale is used in an alias, that have taken place for the locale.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotLocaleHistoryEvents(java.util.Collection)} or
     * {@link #withBotLocaleHistoryEvents(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param botLocaleHistoryEvents
     *        History of changes, such as when a locale is used in an alias, that have taken place for the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withBotLocaleHistoryEvents(BotLocaleHistoryEvent... botLocaleHistoryEvents) {
        if (this.botLocaleHistoryEvents == null) {
            setBotLocaleHistoryEvents(new java.util.ArrayList<BotLocaleHistoryEvent>(botLocaleHistoryEvents.length));
        }
        for (BotLocaleHistoryEvent ele : botLocaleHistoryEvents) {
            this.botLocaleHistoryEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * History of changes, such as when a locale is used in an alias, that have taken place for the locale.
     * </p>
     * 
     * @param botLocaleHistoryEvents
     *        History of changes, such as when a locale is used in an alias, that have taken place for the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotLocaleResult withBotLocaleHistoryEvents(java.util.Collection<BotLocaleHistoryEvent> botLocaleHistoryEvents) {
        setBotLocaleHistoryEvents(botLocaleHistoryEvents);
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
        if (getIntentsCount() != null)
            sb.append("IntentsCount: ").append(getIntentsCount()).append(",");
        if (getSlotTypesCount() != null)
            sb.append("SlotTypesCount: ").append(getSlotTypesCount()).append(",");
        if (getBotLocaleStatus() != null)
            sb.append("BotLocaleStatus: ").append(getBotLocaleStatus()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getLastBuildSubmittedDateTime() != null)
            sb.append("LastBuildSubmittedDateTime: ").append(getLastBuildSubmittedDateTime()).append(",");
        if (getBotLocaleHistoryEvents() != null)
            sb.append("BotLocaleHistoryEvents: ").append(getBotLocaleHistoryEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBotLocaleResult == false)
            return false;
        DescribeBotLocaleResult other = (DescribeBotLocaleResult) obj;
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
        if (other.getIntentsCount() == null ^ this.getIntentsCount() == null)
            return false;
        if (other.getIntentsCount() != null && other.getIntentsCount().equals(this.getIntentsCount()) == false)
            return false;
        if (other.getSlotTypesCount() == null ^ this.getSlotTypesCount() == null)
            return false;
        if (other.getSlotTypesCount() != null && other.getSlotTypesCount().equals(this.getSlotTypesCount()) == false)
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
        if (other.getLastBuildSubmittedDateTime() == null ^ this.getLastBuildSubmittedDateTime() == null)
            return false;
        if (other.getLastBuildSubmittedDateTime() != null && other.getLastBuildSubmittedDateTime().equals(this.getLastBuildSubmittedDateTime()) == false)
            return false;
        if (other.getBotLocaleHistoryEvents() == null ^ this.getBotLocaleHistoryEvents() == null)
            return false;
        if (other.getBotLocaleHistoryEvents() != null && other.getBotLocaleHistoryEvents().equals(this.getBotLocaleHistoryEvents()) == false)
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
        hashCode = prime * hashCode + ((getIntentsCount() == null) ? 0 : getIntentsCount().hashCode());
        hashCode = prime * hashCode + ((getSlotTypesCount() == null) ? 0 : getSlotTypesCount().hashCode());
        hashCode = prime * hashCode + ((getBotLocaleStatus() == null) ? 0 : getBotLocaleStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastBuildSubmittedDateTime() == null) ? 0 : getLastBuildSubmittedDateTime().hashCode());
        hashCode = prime * hashCode + ((getBotLocaleHistoryEvents() == null) ? 0 : getBotLocaleHistoryEvents().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBotLocaleResult clone() {
        try {
            return (DescribeBotLocaleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
