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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot alias.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The name of the bot alias.
     * </p>
     */
    private String botAliasName;
    /**
     * <p>
     * The description of the bot alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version of the bot associated with the bot alias.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale settings that are unique to the alias.
     * </p>
     */
    private java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings;
    /**
     * <p>
     * Specifics of how Amazon Lex logs text and audio conversations with the bot associated with the alias.
     * </p>
     */
    private ConversationLogSettings conversationLogSettings;

    private SentimentAnalysisSettings sentimentAnalysisSettings;
    /**
     * <p>
     * A list of events that affect a bot alias. For example, an event is recorded when the version that the alias
     * points to changes.
     * </p>
     */
    private java.util.List<BotAliasHistoryEvent> botAliasHistoryEvents;
    /**
     * <p>
     * The current status of the alias. When the alias is <code>Available</code>, the alias is ready for use with your
     * bot.
     * </p>
     */
    private String botAliasStatus;
    /**
     * <p>
     * The identifier of the bot associated with the bot alias.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * A timestamp of the date and time that the alias was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A timestamp of the date and time that the alias was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The identifier of the bot alias.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the bot alias.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The identifier of the bot alias.
     * </p>
     * 
     * @return The identifier of the bot alias.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The identifier of the bot alias.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The name of the bot alias.
     * </p>
     * 
     * @param botAliasName
     *        The name of the bot alias.
     */

    public void setBotAliasName(String botAliasName) {
        this.botAliasName = botAliasName;
    }

    /**
     * <p>
     * The name of the bot alias.
     * </p>
     * 
     * @return The name of the bot alias.
     */

    public String getBotAliasName() {
        return this.botAliasName;
    }

    /**
     * <p>
     * The name of the bot alias.
     * </p>
     * 
     * @param botAliasName
     *        The name of the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withBotAliasName(String botAliasName) {
        setBotAliasName(botAliasName);
        return this;
    }

    /**
     * <p>
     * The description of the bot alias.
     * </p>
     * 
     * @param description
     *        The description of the bot alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the bot alias.
     * </p>
     * 
     * @return The description of the bot alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the bot alias.
     * </p>
     * 
     * @param description
     *        The description of the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version of the bot associated with the bot alias.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot associated with the bot alias.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot associated with the bot alias.
     * </p>
     * 
     * @return The version of the bot associated with the bot alias.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot associated with the bot alias.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot associated with the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale settings that are unique to the alias.
     * </p>
     * 
     * @return The locale settings that are unique to the alias.
     */

    public java.util.Map<String, BotAliasLocaleSettings> getBotAliasLocaleSettings() {
        return botAliasLocaleSettings;
    }

    /**
     * <p>
     * The locale settings that are unique to the alias.
     * </p>
     * 
     * @param botAliasLocaleSettings
     *        The locale settings that are unique to the alias.
     */

    public void setBotAliasLocaleSettings(java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings) {
        this.botAliasLocaleSettings = botAliasLocaleSettings;
    }

    /**
     * <p>
     * The locale settings that are unique to the alias.
     * </p>
     * 
     * @param botAliasLocaleSettings
     *        The locale settings that are unique to the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withBotAliasLocaleSettings(java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings) {
        setBotAliasLocaleSettings(botAliasLocaleSettings);
        return this;
    }

    /**
     * Add a single BotAliasLocaleSettings entry
     *
     * @see DescribeBotAliasResult#withBotAliasLocaleSettings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult addBotAliasLocaleSettingsEntry(String key, BotAliasLocaleSettings value) {
        if (null == this.botAliasLocaleSettings) {
            this.botAliasLocaleSettings = new java.util.HashMap<String, BotAliasLocaleSettings>();
        }
        if (this.botAliasLocaleSettings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.botAliasLocaleSettings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BotAliasLocaleSettings.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult clearBotAliasLocaleSettingsEntries() {
        this.botAliasLocaleSettings = null;
        return this;
    }

    /**
     * <p>
     * Specifics of how Amazon Lex logs text and audio conversations with the bot associated with the alias.
     * </p>
     * 
     * @param conversationLogSettings
     *        Specifics of how Amazon Lex logs text and audio conversations with the bot associated with the alias.
     */

    public void setConversationLogSettings(ConversationLogSettings conversationLogSettings) {
        this.conversationLogSettings = conversationLogSettings;
    }

    /**
     * <p>
     * Specifics of how Amazon Lex logs text and audio conversations with the bot associated with the alias.
     * </p>
     * 
     * @return Specifics of how Amazon Lex logs text and audio conversations with the bot associated with the alias.
     */

    public ConversationLogSettings getConversationLogSettings() {
        return this.conversationLogSettings;
    }

    /**
     * <p>
     * Specifics of how Amazon Lex logs text and audio conversations with the bot associated with the alias.
     * </p>
     * 
     * @param conversationLogSettings
     *        Specifics of how Amazon Lex logs text and audio conversations with the bot associated with the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withConversationLogSettings(ConversationLogSettings conversationLogSettings) {
        setConversationLogSettings(conversationLogSettings);
        return this;
    }

    /**
     * @param sentimentAnalysisSettings
     */

    public void setSentimentAnalysisSettings(SentimentAnalysisSettings sentimentAnalysisSettings) {
        this.sentimentAnalysisSettings = sentimentAnalysisSettings;
    }

    /**
     * @return
     */

    public SentimentAnalysisSettings getSentimentAnalysisSettings() {
        return this.sentimentAnalysisSettings;
    }

    /**
     * @param sentimentAnalysisSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withSentimentAnalysisSettings(SentimentAnalysisSettings sentimentAnalysisSettings) {
        setSentimentAnalysisSettings(sentimentAnalysisSettings);
        return this;
    }

    /**
     * <p>
     * A list of events that affect a bot alias. For example, an event is recorded when the version that the alias
     * points to changes.
     * </p>
     * 
     * @return A list of events that affect a bot alias. For example, an event is recorded when the version that the
     *         alias points to changes.
     */

    public java.util.List<BotAliasHistoryEvent> getBotAliasHistoryEvents() {
        return botAliasHistoryEvents;
    }

    /**
     * <p>
     * A list of events that affect a bot alias. For example, an event is recorded when the version that the alias
     * points to changes.
     * </p>
     * 
     * @param botAliasHistoryEvents
     *        A list of events that affect a bot alias. For example, an event is recorded when the version that the
     *        alias points to changes.
     */

    public void setBotAliasHistoryEvents(java.util.Collection<BotAliasHistoryEvent> botAliasHistoryEvents) {
        if (botAliasHistoryEvents == null) {
            this.botAliasHistoryEvents = null;
            return;
        }

        this.botAliasHistoryEvents = new java.util.ArrayList<BotAliasHistoryEvent>(botAliasHistoryEvents);
    }

    /**
     * <p>
     * A list of events that affect a bot alias. For example, an event is recorded when the version that the alias
     * points to changes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotAliasHistoryEvents(java.util.Collection)} or
     * {@link #withBotAliasHistoryEvents(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param botAliasHistoryEvents
     *        A list of events that affect a bot alias. For example, an event is recorded when the version that the
     *        alias points to changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withBotAliasHistoryEvents(BotAliasHistoryEvent... botAliasHistoryEvents) {
        if (this.botAliasHistoryEvents == null) {
            setBotAliasHistoryEvents(new java.util.ArrayList<BotAliasHistoryEvent>(botAliasHistoryEvents.length));
        }
        for (BotAliasHistoryEvent ele : botAliasHistoryEvents) {
            this.botAliasHistoryEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of events that affect a bot alias. For example, an event is recorded when the version that the alias
     * points to changes.
     * </p>
     * 
     * @param botAliasHistoryEvents
     *        A list of events that affect a bot alias. For example, an event is recorded when the version that the
     *        alias points to changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withBotAliasHistoryEvents(java.util.Collection<BotAliasHistoryEvent> botAliasHistoryEvents) {
        setBotAliasHistoryEvents(botAliasHistoryEvents);
        return this;
    }

    /**
     * <p>
     * The current status of the alias. When the alias is <code>Available</code>, the alias is ready for use with your
     * bot.
     * </p>
     * 
     * @param botAliasStatus
     *        The current status of the alias. When the alias is <code>Available</code>, the alias is ready for use with
     *        your bot.
     * @see BotAliasStatus
     */

    public void setBotAliasStatus(String botAliasStatus) {
        this.botAliasStatus = botAliasStatus;
    }

    /**
     * <p>
     * The current status of the alias. When the alias is <code>Available</code>, the alias is ready for use with your
     * bot.
     * </p>
     * 
     * @return The current status of the alias. When the alias is <code>Available</code>, the alias is ready for use
     *         with your bot.
     * @see BotAliasStatus
     */

    public String getBotAliasStatus() {
        return this.botAliasStatus;
    }

    /**
     * <p>
     * The current status of the alias. When the alias is <code>Available</code>, the alias is ready for use with your
     * bot.
     * </p>
     * 
     * @param botAliasStatus
     *        The current status of the alias. When the alias is <code>Available</code>, the alias is ready for use with
     *        your bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotAliasStatus
     */

    public DescribeBotAliasResult withBotAliasStatus(String botAliasStatus) {
        setBotAliasStatus(botAliasStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the alias. When the alias is <code>Available</code>, the alias is ready for use with your
     * bot.
     * </p>
     * 
     * @param botAliasStatus
     *        The current status of the alias. When the alias is <code>Available</code>, the alias is ready for use with
     *        your bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotAliasStatus
     */

    public DescribeBotAliasResult withBotAliasStatus(BotAliasStatus botAliasStatus) {
        this.botAliasStatus = botAliasStatus.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the bot associated with the bot alias.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the bot alias.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the bot alias.
     * </p>
     * 
     * @return The identifier of the bot associated with the bot alias.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the bot alias.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the alias was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the alias was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the alias was created.
     * </p>
     * 
     * @return A timestamp of the date and time that the alias was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the alias was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the alias was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the alias was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the alias was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the alias was last updated.
     * </p>
     * 
     * @return A timestamp of the date and time that the alias was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the alias was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the alias was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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
        if (getBotAliasId() != null)
            sb.append("BotAliasId: ").append(getBotAliasId()).append(",");
        if (getBotAliasName() != null)
            sb.append("BotAliasName: ").append(getBotAliasName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getBotAliasLocaleSettings() != null)
            sb.append("BotAliasLocaleSettings: ").append(getBotAliasLocaleSettings()).append(",");
        if (getConversationLogSettings() != null)
            sb.append("ConversationLogSettings: ").append(getConversationLogSettings()).append(",");
        if (getSentimentAnalysisSettings() != null)
            sb.append("SentimentAnalysisSettings: ").append(getSentimentAnalysisSettings()).append(",");
        if (getBotAliasHistoryEvents() != null)
            sb.append("BotAliasHistoryEvents: ").append(getBotAliasHistoryEvents()).append(",");
        if (getBotAliasStatus() != null)
            sb.append("BotAliasStatus: ").append(getBotAliasStatus()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
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

        if (obj instanceof DescribeBotAliasResult == false)
            return false;
        DescribeBotAliasResult other = (DescribeBotAliasResult) obj;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getBotAliasName() == null ^ this.getBotAliasName() == null)
            return false;
        if (other.getBotAliasName() != null && other.getBotAliasName().equals(this.getBotAliasName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getBotAliasLocaleSettings() == null ^ this.getBotAliasLocaleSettings() == null)
            return false;
        if (other.getBotAliasLocaleSettings() != null && other.getBotAliasLocaleSettings().equals(this.getBotAliasLocaleSettings()) == false)
            return false;
        if (other.getConversationLogSettings() == null ^ this.getConversationLogSettings() == null)
            return false;
        if (other.getConversationLogSettings() != null && other.getConversationLogSettings().equals(this.getConversationLogSettings()) == false)
            return false;
        if (other.getSentimentAnalysisSettings() == null ^ this.getSentimentAnalysisSettings() == null)
            return false;
        if (other.getSentimentAnalysisSettings() != null && other.getSentimentAnalysisSettings().equals(this.getSentimentAnalysisSettings()) == false)
            return false;
        if (other.getBotAliasHistoryEvents() == null ^ this.getBotAliasHistoryEvents() == null)
            return false;
        if (other.getBotAliasHistoryEvents() != null && other.getBotAliasHistoryEvents().equals(this.getBotAliasHistoryEvents()) == false)
            return false;
        if (other.getBotAliasStatus() == null ^ this.getBotAliasStatus() == null)
            return false;
        if (other.getBotAliasStatus() != null && other.getBotAliasStatus().equals(this.getBotAliasStatus()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
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

        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getBotAliasName() == null) ? 0 : getBotAliasName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getBotAliasLocaleSettings() == null) ? 0 : getBotAliasLocaleSettings().hashCode());
        hashCode = prime * hashCode + ((getConversationLogSettings() == null) ? 0 : getConversationLogSettings().hashCode());
        hashCode = prime * hashCode + ((getSentimentAnalysisSettings() == null) ? 0 : getSentimentAnalysisSettings().hashCode());
        hashCode = prime * hashCode + ((getBotAliasHistoryEvents() == null) ? 0 : getBotAliasHistoryEvents().hashCode());
        hashCode = prime * hashCode + ((getBotAliasStatus() == null) ? 0 : getBotAliasStatus().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBotAliasResult clone() {
        try {
            return (DescribeBotAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
