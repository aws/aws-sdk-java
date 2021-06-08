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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBotAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot alias.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The new name to assign to the bot alias.
     * </p>
     */
    private String botAliasName;
    /**
     * <p>
     * The new description to assign to the bot alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The new bot version to assign to the bot alias.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The new Lambda functions to use in each locale for the bot alias.
     * </p>
     */
    private java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings;
    /**
     * <p>
     * The new settings for storing conversation logs in Amazon CloudWatch Logs and Amazon S3 buckets.
     * </p>
     */
    private ConversationLogSettings conversationLogSettings;

    private SentimentAnalysisSettings sentimentAnalysisSettings;
    /**
     * <p>
     * The identifier of the bot with the updated alias.
     * </p>
     */
    private String botId;

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

    public UpdateBotAliasRequest withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The new name to assign to the bot alias.
     * </p>
     * 
     * @param botAliasName
     *        The new name to assign to the bot alias.
     */

    public void setBotAliasName(String botAliasName) {
        this.botAliasName = botAliasName;
    }

    /**
     * <p>
     * The new name to assign to the bot alias.
     * </p>
     * 
     * @return The new name to assign to the bot alias.
     */

    public String getBotAliasName() {
        return this.botAliasName;
    }

    /**
     * <p>
     * The new name to assign to the bot alias.
     * </p>
     * 
     * @param botAliasName
     *        The new name to assign to the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotAliasRequest withBotAliasName(String botAliasName) {
        setBotAliasName(botAliasName);
        return this;
    }

    /**
     * <p>
     * The new description to assign to the bot alias.
     * </p>
     * 
     * @param description
     *        The new description to assign to the bot alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description to assign to the bot alias.
     * </p>
     * 
     * @return The new description to assign to the bot alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description to assign to the bot alias.
     * </p>
     * 
     * @param description
     *        The new description to assign to the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotAliasRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The new bot version to assign to the bot alias.
     * </p>
     * 
     * @param botVersion
     *        The new bot version to assign to the bot alias.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The new bot version to assign to the bot alias.
     * </p>
     * 
     * @return The new bot version to assign to the bot alias.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The new bot version to assign to the bot alias.
     * </p>
     * 
     * @param botVersion
     *        The new bot version to assign to the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotAliasRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The new Lambda functions to use in each locale for the bot alias.
     * </p>
     * 
     * @return The new Lambda functions to use in each locale for the bot alias.
     */

    public java.util.Map<String, BotAliasLocaleSettings> getBotAliasLocaleSettings() {
        return botAliasLocaleSettings;
    }

    /**
     * <p>
     * The new Lambda functions to use in each locale for the bot alias.
     * </p>
     * 
     * @param botAliasLocaleSettings
     *        The new Lambda functions to use in each locale for the bot alias.
     */

    public void setBotAliasLocaleSettings(java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings) {
        this.botAliasLocaleSettings = botAliasLocaleSettings;
    }

    /**
     * <p>
     * The new Lambda functions to use in each locale for the bot alias.
     * </p>
     * 
     * @param botAliasLocaleSettings
     *        The new Lambda functions to use in each locale for the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotAliasRequest withBotAliasLocaleSettings(java.util.Map<String, BotAliasLocaleSettings> botAliasLocaleSettings) {
        setBotAliasLocaleSettings(botAliasLocaleSettings);
        return this;
    }

    /**
     * Add a single BotAliasLocaleSettings entry
     *
     * @see UpdateBotAliasRequest#withBotAliasLocaleSettings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotAliasRequest addBotAliasLocaleSettingsEntry(String key, BotAliasLocaleSettings value) {
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

    public UpdateBotAliasRequest clearBotAliasLocaleSettingsEntries() {
        this.botAliasLocaleSettings = null;
        return this;
    }

    /**
     * <p>
     * The new settings for storing conversation logs in Amazon CloudWatch Logs and Amazon S3 buckets.
     * </p>
     * 
     * @param conversationLogSettings
     *        The new settings for storing conversation logs in Amazon CloudWatch Logs and Amazon S3 buckets.
     */

    public void setConversationLogSettings(ConversationLogSettings conversationLogSettings) {
        this.conversationLogSettings = conversationLogSettings;
    }

    /**
     * <p>
     * The new settings for storing conversation logs in Amazon CloudWatch Logs and Amazon S3 buckets.
     * </p>
     * 
     * @return The new settings for storing conversation logs in Amazon CloudWatch Logs and Amazon S3 buckets.
     */

    public ConversationLogSettings getConversationLogSettings() {
        return this.conversationLogSettings;
    }

    /**
     * <p>
     * The new settings for storing conversation logs in Amazon CloudWatch Logs and Amazon S3 buckets.
     * </p>
     * 
     * @param conversationLogSettings
     *        The new settings for storing conversation logs in Amazon CloudWatch Logs and Amazon S3 buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotAliasRequest withConversationLogSettings(ConversationLogSettings conversationLogSettings) {
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

    public UpdateBotAliasRequest withSentimentAnalysisSettings(SentimentAnalysisSettings sentimentAnalysisSettings) {
        setSentimentAnalysisSettings(sentimentAnalysisSettings);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot with the updated alias.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot with the updated alias.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot with the updated alias.
     * </p>
     * 
     * @return The identifier of the bot with the updated alias.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot with the updated alias.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot with the updated alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotAliasRequest withBotId(String botId) {
        setBotId(botId);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBotAliasRequest == false)
            return false;
        UpdateBotAliasRequest other = (UpdateBotAliasRequest) obj;
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
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
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
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBotAliasRequest clone() {
        return (UpdateBotAliasRequest) super.clone();
    }

}
