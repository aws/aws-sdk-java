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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBotAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The alias to create. The name must be unique for the bot.
     * </p>
     */
    private String botAliasName;
    /**
     * <p>
     * A description of the alias. Use this description to help identify the alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version of the bot that this alias points to. You can use the operation to change the bot version associated
     * with the alias.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * Maps configuration information to a specific locale. You can use this parameter to specify a specific Lambda
     * function to run different functions in different locales.
     * </p>
     */
    private java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings;
    /**
     * <p>
     * Specifies whether Amazon Lex logs text and audio for a conversation with the bot. When you enable conversation
     * logs, text logs store text input, transcripts of audio input, and associated metadata in Amazon CloudWatch Logs.
     * Audio logs store audio input in Amazon S3.
     * </p>
     */
    private ConversationLogSettings conversationLogSettings;

    private SentimentAnalysisSettings sentimentAnalysisSettings;
    /**
     * <p>
     * The unique identifier of the bot that the alias applies to.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the
     * <code>UpdateBotAlias</code> operation to update the tags on a bot alias. To update tags, use the
     * <code>TagResource</code> operation.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The alias to create. The name must be unique for the bot.
     * </p>
     * 
     * @param botAliasName
     *        The alias to create. The name must be unique for the bot.
     */

    public void setBotAliasName(String botAliasName) {
        this.botAliasName = botAliasName;
    }

    /**
     * <p>
     * The alias to create. The name must be unique for the bot.
     * </p>
     * 
     * @return The alias to create. The name must be unique for the bot.
     */

    public String getBotAliasName() {
        return this.botAliasName;
    }

    /**
     * <p>
     * The alias to create. The name must be unique for the bot.
     * </p>
     * 
     * @param botAliasName
     *        The alias to create. The name must be unique for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasRequest withBotAliasName(String botAliasName) {
        setBotAliasName(botAliasName);
        return this;
    }

    /**
     * <p>
     * A description of the alias. Use this description to help identify the alias.
     * </p>
     * 
     * @param description
     *        A description of the alias. Use this description to help identify the alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the alias. Use this description to help identify the alias.
     * </p>
     * 
     * @return A description of the alias. Use this description to help identify the alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the alias. Use this description to help identify the alias.
     * </p>
     * 
     * @param description
     *        A description of the alias. Use this description to help identify the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version of the bot that this alias points to. You can use the operation to change the bot version associated
     * with the alias.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that this alias points to. You can use the operation to change the bot version
     *        associated with the alias.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that this alias points to. You can use the operation to change the bot version associated
     * with the alias.
     * </p>
     * 
     * @return The version of the bot that this alias points to. You can use the operation to change the bot version
     *         associated with the alias.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that this alias points to. You can use the operation to change the bot version associated
     * with the alias.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that this alias points to. You can use the operation to change the bot version
     *        associated with the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * Maps configuration information to a specific locale. You can use this parameter to specify a specific Lambda
     * function to run different functions in different locales.
     * </p>
     * 
     * @return Maps configuration information to a specific locale. You can use this parameter to specify a specific
     *         Lambda function to run different functions in different locales.
     */

    public java.util.Map<String, BotAliasLocaleSettings> getBotAliasLocaleSettings() {
        return botAliasLocaleSettings;
    }

    /**
     * <p>
     * Maps configuration information to a specific locale. You can use this parameter to specify a specific Lambda
     * function to run different functions in different locales.
     * </p>
     * 
     * @param botAliasLocaleSettings
     *        Maps configuration information to a specific locale. You can use this parameter to specify a specific
     *        Lambda function to run different functions in different locales.
     */

    public void setBotAliasLocaleSettings(java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings) {
        this.botAliasLocaleSettings = botAliasLocaleSettings;
    }

    /**
     * <p>
     * Maps configuration information to a specific locale. You can use this parameter to specify a specific Lambda
     * function to run different functions in different locales.
     * </p>
     * 
     * @param botAliasLocaleSettings
     *        Maps configuration information to a specific locale. You can use this parameter to specify a specific
     *        Lambda function to run different functions in different locales.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasRequest withBotAliasLocaleSettings(java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings) {
        setBotAliasLocaleSettings(botAliasLocaleSettings);
        return this;
    }

    /**
     * Add a single BotAliasLocaleSettings entry
     *
     * @see CreateBotAliasRequest#withBotAliasLocaleSettings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasRequest addBotAliasLocaleSettingsEntry(String key, BotAliasLocaleSettings value) {
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

    public CreateBotAliasRequest clearBotAliasLocaleSettingsEntries() {
        this.botAliasLocaleSettings = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Lex logs text and audio for a conversation with the bot. When you enable conversation
     * logs, text logs store text input, transcripts of audio input, and associated metadata in Amazon CloudWatch Logs.
     * Audio logs store audio input in Amazon S3.
     * </p>
     * 
     * @param conversationLogSettings
     *        Specifies whether Amazon Lex logs text and audio for a conversation with the bot. When you enable
     *        conversation logs, text logs store text input, transcripts of audio input, and associated metadata in
     *        Amazon CloudWatch Logs. Audio logs store audio input in Amazon S3.
     */

    public void setConversationLogSettings(ConversationLogSettings conversationLogSettings) {
        this.conversationLogSettings = conversationLogSettings;
    }

    /**
     * <p>
     * Specifies whether Amazon Lex logs text and audio for a conversation with the bot. When you enable conversation
     * logs, text logs store text input, transcripts of audio input, and associated metadata in Amazon CloudWatch Logs.
     * Audio logs store audio input in Amazon S3.
     * </p>
     * 
     * @return Specifies whether Amazon Lex logs text and audio for a conversation with the bot. When you enable
     *         conversation logs, text logs store text input, transcripts of audio input, and associated metadata in
     *         Amazon CloudWatch Logs. Audio logs store audio input in Amazon S3.
     */

    public ConversationLogSettings getConversationLogSettings() {
        return this.conversationLogSettings;
    }

    /**
     * <p>
     * Specifies whether Amazon Lex logs text and audio for a conversation with the bot. When you enable conversation
     * logs, text logs store text input, transcripts of audio input, and associated metadata in Amazon CloudWatch Logs.
     * Audio logs store audio input in Amazon S3.
     * </p>
     * 
     * @param conversationLogSettings
     *        Specifies whether Amazon Lex logs text and audio for a conversation with the bot. When you enable
     *        conversation logs, text logs store text input, transcripts of audio input, and associated metadata in
     *        Amazon CloudWatch Logs. Audio logs store audio input in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasRequest withConversationLogSettings(ConversationLogSettings conversationLogSettings) {
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

    public CreateBotAliasRequest withSentimentAnalysisSettings(SentimentAnalysisSettings sentimentAnalysisSettings) {
        setSentimentAnalysisSettings(sentimentAnalysisSettings);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the bot that the alias applies to.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that the alias applies to.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that the alias applies to.
     * </p>
     * 
     * @return The unique identifier of the bot that the alias applies to.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that the alias applies to.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that the alias applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the
     * <code>UpdateBotAlias</code> operation to update the tags on a bot alias. To update tags, use the
     * <code>TagResource</code> operation.
     * </p>
     * 
     * @return A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the
     *         <code>UpdateBotAlias</code> operation to update the tags on a bot alias. To update tags, use the
     *         <code>TagResource</code> operation.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the
     * <code>UpdateBotAlias</code> operation to update the tags on a bot alias. To update tags, use the
     * <code>TagResource</code> operation.
     * </p>
     * 
     * @param tags
     *        A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the
     *        <code>UpdateBotAlias</code> operation to update the tags on a bot alias. To update tags, use the
     *        <code>TagResource</code> operation.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the
     * <code>UpdateBotAlias</code> operation to update the tags on a bot alias. To update tags, use the
     * <code>TagResource</code> operation.
     * </p>
     * 
     * @param tags
     *        A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the
     *        <code>UpdateBotAlias</code> operation to update the tags on a bot alias. To update tags, use the
     *        <code>TagResource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateBotAliasRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotAliasRequest addTagsEntry(String key, String value) {
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

    public CreateBotAliasRequest clearTagsEntries() {
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
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

        if (obj instanceof CreateBotAliasRequest == false)
            return false;
        CreateBotAliasRequest other = (CreateBotAliasRequest) obj;
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
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
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

        hashCode = prime * hashCode + ((getBotAliasName() == null) ? 0 : getBotAliasName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getBotAliasLocaleSettings() == null) ? 0 : getBotAliasLocaleSettings().hashCode());
        hashCode = prime * hashCode + ((getConversationLogSettings() == null) ? 0 : getConversationLogSettings().hashCode());
        hashCode = prime * hashCode + ((getSentimentAnalysisSettings() == null) ? 0 : getSentimentAnalysisSettings().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBotAliasRequest clone() {
        return (CreateBotAliasRequest) super.clone();
    }

}
