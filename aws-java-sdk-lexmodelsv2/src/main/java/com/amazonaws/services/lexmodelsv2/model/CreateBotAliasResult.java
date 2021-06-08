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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBotAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot alias.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The name specified for the bot alias.
     * </p>
     */
    private String botAliasName;
    /**
     * <p>
     * The description specified for the bot alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version of the bot associated with this alias.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * Configuration information for a specific locale.
     * </p>
     */
    private java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings;
    /**
     * <p>
     * The conversation log settings specified for the alias.
     * </p>
     */
    private ConversationLogSettings conversationLogSettings;

    private SentimentAnalysisSettings sentimentAnalysisSettings;
    /**
     * <p>
     * The current status of the alias. The alias is first put into the <code>Creating</code> state. When the alias is
     * ready to be used, it is put into the <code>Available</code> state. You can use the <code>DescribeBotAlias</code>
     * operation to get the current state of an alias.
     * </p>
     */
    private String botAliasStatus;
    /**
     * <p>
     * The unique identifier of the bot that this alias applies to.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * A Unix timestamp indicating the date and time that the bot alias was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A list of tags associated with the bot alias.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique identifier of the bot alias.
     * </p>
     * 
     * @param botAliasId
     *        The unique identifier of the bot alias.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The unique identifier of the bot alias.
     * </p>
     * 
     * @return The unique identifier of the bot alias.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The unique identifier of the bot alias.
     * </p>
     * 
     * @param botAliasId
     *        The unique identifier of the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The name specified for the bot alias.
     * </p>
     * 
     * @param botAliasName
     *        The name specified for the bot alias.
     */

    public void setBotAliasName(String botAliasName) {
        this.botAliasName = botAliasName;
    }

    /**
     * <p>
     * The name specified for the bot alias.
     * </p>
     * 
     * @return The name specified for the bot alias.
     */

    public String getBotAliasName() {
        return this.botAliasName;
    }

    /**
     * <p>
     * The name specified for the bot alias.
     * </p>
     * 
     * @param botAliasName
     *        The name specified for the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult withBotAliasName(String botAliasName) {
        setBotAliasName(botAliasName);
        return this;
    }

    /**
     * <p>
     * The description specified for the bot alias.
     * </p>
     * 
     * @param description
     *        The description specified for the bot alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description specified for the bot alias.
     * </p>
     * 
     * @return The description specified for the bot alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description specified for the bot alias.
     * </p>
     * 
     * @param description
     *        The description specified for the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version of the bot associated with this alias.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot associated with this alias.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot associated with this alias.
     * </p>
     * 
     * @return The version of the bot associated with this alias.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot associated with this alias.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot associated with this alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * Configuration information for a specific locale.
     * </p>
     * 
     * @return Configuration information for a specific locale.
     */

    public java.util.Map<String, BotAliasLocaleSettings> getBotAliasLocaleSettings() {
        return botAliasLocaleSettings;
    }

    /**
     * <p>
     * Configuration information for a specific locale.
     * </p>
     * 
     * @param botAliasLocaleSettings
     *        Configuration information for a specific locale.
     */

    public void setBotAliasLocaleSettings(java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings) {
        this.botAliasLocaleSettings = botAliasLocaleSettings;
    }

    /**
     * <p>
     * Configuration information for a specific locale.
     * </p>
     * 
     * @param botAliasLocaleSettings
     *        Configuration information for a specific locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult withBotAliasLocaleSettings(java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings) {
        setBotAliasLocaleSettings(botAliasLocaleSettings);
        return this;
    }

    /**
     * Add a single BotAliasLocaleSettings entry
     *
     * @see CreateBotAliasResult#withBotAliasLocaleSettings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult addBotAliasLocaleSettingsEntry(String key, BotAliasLocaleSettings value) {
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

    public CreateBotAliasResult clearBotAliasLocaleSettingsEntries() {
        this.botAliasLocaleSettings = null;
        return this;
    }

    /**
     * <p>
     * The conversation log settings specified for the alias.
     * </p>
     * 
     * @param conversationLogSettings
     *        The conversation log settings specified for the alias.
     */

    public void setConversationLogSettings(ConversationLogSettings conversationLogSettings) {
        this.conversationLogSettings = conversationLogSettings;
    }

    /**
     * <p>
     * The conversation log settings specified for the alias.
     * </p>
     * 
     * @return The conversation log settings specified for the alias.
     */

    public ConversationLogSettings getConversationLogSettings() {
        return this.conversationLogSettings;
    }

    /**
     * <p>
     * The conversation log settings specified for the alias.
     * </p>
     * 
     * @param conversationLogSettings
     *        The conversation log settings specified for the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult withConversationLogSettings(ConversationLogSettings conversationLogSettings) {
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

    public CreateBotAliasResult withSentimentAnalysisSettings(SentimentAnalysisSettings sentimentAnalysisSettings) {
        setSentimentAnalysisSettings(sentimentAnalysisSettings);
        return this;
    }

    /**
     * <p>
     * The current status of the alias. The alias is first put into the <code>Creating</code> state. When the alias is
     * ready to be used, it is put into the <code>Available</code> state. You can use the <code>DescribeBotAlias</code>
     * operation to get the current state of an alias.
     * </p>
     * 
     * @param botAliasStatus
     *        The current status of the alias. The alias is first put into the <code>Creating</code> state. When the
     *        alias is ready to be used, it is put into the <code>Available</code> state. You can use the
     *        <code>DescribeBotAlias</code> operation to get the current state of an alias.
     * @see BotAliasStatus
     */

    public void setBotAliasStatus(String botAliasStatus) {
        this.botAliasStatus = botAliasStatus;
    }

    /**
     * <p>
     * The current status of the alias. The alias is first put into the <code>Creating</code> state. When the alias is
     * ready to be used, it is put into the <code>Available</code> state. You can use the <code>DescribeBotAlias</code>
     * operation to get the current state of an alias.
     * </p>
     * 
     * @return The current status of the alias. The alias is first put into the <code>Creating</code> state. When the
     *         alias is ready to be used, it is put into the <code>Available</code> state. You can use the
     *         <code>DescribeBotAlias</code> operation to get the current state of an alias.
     * @see BotAliasStatus
     */

    public String getBotAliasStatus() {
        return this.botAliasStatus;
    }

    /**
     * <p>
     * The current status of the alias. The alias is first put into the <code>Creating</code> state. When the alias is
     * ready to be used, it is put into the <code>Available</code> state. You can use the <code>DescribeBotAlias</code>
     * operation to get the current state of an alias.
     * </p>
     * 
     * @param botAliasStatus
     *        The current status of the alias. The alias is first put into the <code>Creating</code> state. When the
     *        alias is ready to be used, it is put into the <code>Available</code> state. You can use the
     *        <code>DescribeBotAlias</code> operation to get the current state of an alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotAliasStatus
     */

    public CreateBotAliasResult withBotAliasStatus(String botAliasStatus) {
        setBotAliasStatus(botAliasStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the alias. The alias is first put into the <code>Creating</code> state. When the alias is
     * ready to be used, it is put into the <code>Available</code> state. You can use the <code>DescribeBotAlias</code>
     * operation to get the current state of an alias.
     * </p>
     * 
     * @param botAliasStatus
     *        The current status of the alias. The alias is first put into the <code>Creating</code> state. When the
     *        alias is ready to be used, it is put into the <code>Available</code> state. You can use the
     *        <code>DescribeBotAlias</code> operation to get the current state of an alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotAliasStatus
     */

    public CreateBotAliasResult withBotAliasStatus(BotAliasStatus botAliasStatus) {
        this.botAliasStatus = botAliasStatus.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the bot that this alias applies to.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that this alias applies to.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that this alias applies to.
     * </p>
     * 
     * @return The unique identifier of the bot that this alias applies to.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that this alias applies to.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that this alias applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * A Unix timestamp indicating the date and time that the bot alias was created.
     * </p>
     * 
     * @param creationDateTime
     *        A Unix timestamp indicating the date and time that the bot alias was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A Unix timestamp indicating the date and time that the bot alias was created.
     * </p>
     * 
     * @return A Unix timestamp indicating the date and time that the bot alias was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A Unix timestamp indicating the date and time that the bot alias was created.
     * </p>
     * 
     * @param creationDateTime
     *        A Unix timestamp indicating the date and time that the bot alias was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the bot alias.
     * </p>
     * 
     * @return A list of tags associated with the bot alias.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the bot alias.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the bot alias.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags associated with the bot alias.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateBotAliasResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasResult clearTagsEntries() {
        this.tags = null;
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
        if (getBotAliasStatus() != null)
            sb.append("BotAliasStatus: ").append(getBotAliasStatus()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBotAliasResult == false)
            return false;
        CreateBotAliasResult other = (CreateBotAliasResult) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getBotAliasStatus() == null) ? 0 : getBotAliasStatus().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBotAliasResult clone() {
        try {
            return (CreateBotAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
