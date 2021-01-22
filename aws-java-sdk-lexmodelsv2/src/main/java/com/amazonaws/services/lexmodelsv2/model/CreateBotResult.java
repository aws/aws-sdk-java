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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for a particular bot. You use this to identify the bot when you call other Amazon Lex API
     * operations.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The name specified for the bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The description specified for the bot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The IAM role specified for the bot.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The data privacy settings specified for the bot.
     * </p>
     */
    private DataPrivacy dataPrivacy;
    /**
     * <p>
     * The session idle time specified for the bot.
     * </p>
     */
    private Integer idleSessionTTLInSeconds;
    /**
     * <p>
     * Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is read
     * for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     * <code>Draft</code> version of the bot.
     * </p>
     */
    private String botStatus;
    /**
     * <p>
     * A timestamp indicating the date and time that the bot was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A list of tags associated with the bot.
     * </p>
     */
    private java.util.Map<String, String> botTags;
    /**
     * <p>
     * A list of tags associated with the test alias for the bot.
     * </p>
     */
    private java.util.Map<String, String> testBotAliasTags;

    /**
     * <p>
     * A unique identifier for a particular bot. You use this to identify the bot when you call other Amazon Lex API
     * operations.
     * </p>
     * 
     * @param botId
     *        A unique identifier for a particular bot. You use this to identify the bot when you call other Amazon Lex
     *        API operations.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * A unique identifier for a particular bot. You use this to identify the bot when you call other Amazon Lex API
     * operations.
     * </p>
     * 
     * @return A unique identifier for a particular bot. You use this to identify the bot when you call other Amazon Lex
     *         API operations.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * A unique identifier for a particular bot. You use this to identify the bot when you call other Amazon Lex API
     * operations.
     * </p>
     * 
     * @param botId
     *        A unique identifier for a particular bot. You use this to identify the bot when you call other Amazon Lex
     *        API operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The name specified for the bot.
     * </p>
     * 
     * @param botName
     *        The name specified for the bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name specified for the bot.
     * </p>
     * 
     * @return The name specified for the bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name specified for the bot.
     * </p>
     * 
     * @param botName
     *        The name specified for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The description specified for the bot.
     * </p>
     * 
     * @param description
     *        The description specified for the bot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description specified for the bot.
     * </p>
     * 
     * @return The description specified for the bot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description specified for the bot.
     * </p>
     * 
     * @param description
     *        The description specified for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The IAM role specified for the bot.
     * </p>
     * 
     * @param roleArn
     *        The IAM role specified for the bot.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role specified for the bot.
     * </p>
     * 
     * @return The IAM role specified for the bot.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role specified for the bot.
     * </p>
     * 
     * @param roleArn
     *        The IAM role specified for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The data privacy settings specified for the bot.
     * </p>
     * 
     * @param dataPrivacy
     *        The data privacy settings specified for the bot.
     */

    public void setDataPrivacy(DataPrivacy dataPrivacy) {
        this.dataPrivacy = dataPrivacy;
    }

    /**
     * <p>
     * The data privacy settings specified for the bot.
     * </p>
     * 
     * @return The data privacy settings specified for the bot.
     */

    public DataPrivacy getDataPrivacy() {
        return this.dataPrivacy;
    }

    /**
     * <p>
     * The data privacy settings specified for the bot.
     * </p>
     * 
     * @param dataPrivacy
     *        The data privacy settings specified for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult withDataPrivacy(DataPrivacy dataPrivacy) {
        setDataPrivacy(dataPrivacy);
        return this;
    }

    /**
     * <p>
     * The session idle time specified for the bot.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The session idle time specified for the bot.
     */

    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The session idle time specified for the bot.
     * </p>
     * 
     * @return The session idle time specified for the bot.
     */

    public Integer getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The session idle time specified for the bot.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The session idle time specified for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is read
     * for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     * <code>Draft</code> version of the bot.
     * </p>
     * 
     * @param botStatus
     *        Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is
     *        read for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     *        <code>Draft</code> version of the bot.
     * @see BotStatus
     */

    public void setBotStatus(String botStatus) {
        this.botStatus = botStatus;
    }

    /**
     * <p>
     * Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is read
     * for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     * <code>Draft</code> version of the bot.
     * </p>
     * 
     * @return Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot
     *         is read for use, it changes to the <code>Available</code> status. After the bot is created, you can use
     *         the <code>Draft</code> version of the bot.
     * @see BotStatus
     */

    public String getBotStatus() {
        return this.botStatus;
    }

    /**
     * <p>
     * Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is read
     * for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     * <code>Draft</code> version of the bot.
     * </p>
     * 
     * @param botStatus
     *        Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is
     *        read for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     *        <code>Draft</code> version of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public CreateBotResult withBotStatus(String botStatus) {
        setBotStatus(botStatus);
        return this;
    }

    /**
     * <p>
     * Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is read
     * for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     * <code>Draft</code> version of the bot.
     * </p>
     * 
     * @param botStatus
     *        Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is
     *        read for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     *        <code>Draft</code> version of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public CreateBotResult withBotStatus(BotStatus botStatus) {
        this.botStatus = botStatus.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp indicating the date and time that the bot was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp indicating the date and time that the bot was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp indicating the date and time that the bot was created.
     * </p>
     * 
     * @return A timestamp indicating the date and time that the bot was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp indicating the date and time that the bot was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp indicating the date and time that the bot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the bot.
     * </p>
     * 
     * @return A list of tags associated with the bot.
     */

    public java.util.Map<String, String> getBotTags() {
        return botTags;
    }

    /**
     * <p>
     * A list of tags associated with the bot.
     * </p>
     * 
     * @param botTags
     *        A list of tags associated with the bot.
     */

    public void setBotTags(java.util.Map<String, String> botTags) {
        this.botTags = botTags;
    }

    /**
     * <p>
     * A list of tags associated with the bot.
     * </p>
     * 
     * @param botTags
     *        A list of tags associated with the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult withBotTags(java.util.Map<String, String> botTags) {
        setBotTags(botTags);
        return this;
    }

    /**
     * Add a single BotTags entry
     *
     * @see CreateBotResult#withBotTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult addBotTagsEntry(String key, String value) {
        if (null == this.botTags) {
            this.botTags = new java.util.HashMap<String, String>();
        }
        if (this.botTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.botTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BotTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult clearBotTagsEntries() {
        this.botTags = null;
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the test alias for the bot.
     * </p>
     * 
     * @return A list of tags associated with the test alias for the bot.
     */

    public java.util.Map<String, String> getTestBotAliasTags() {
        return testBotAliasTags;
    }

    /**
     * <p>
     * A list of tags associated with the test alias for the bot.
     * </p>
     * 
     * @param testBotAliasTags
     *        A list of tags associated with the test alias for the bot.
     */

    public void setTestBotAliasTags(java.util.Map<String, String> testBotAliasTags) {
        this.testBotAliasTags = testBotAliasTags;
    }

    /**
     * <p>
     * A list of tags associated with the test alias for the bot.
     * </p>
     * 
     * @param testBotAliasTags
     *        A list of tags associated with the test alias for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult withTestBotAliasTags(java.util.Map<String, String> testBotAliasTags) {
        setTestBotAliasTags(testBotAliasTags);
        return this;
    }

    /**
     * Add a single TestBotAliasTags entry
     *
     * @see CreateBotResult#withTestBotAliasTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult addTestBotAliasTagsEntry(String key, String value) {
        if (null == this.testBotAliasTags) {
            this.testBotAliasTags = new java.util.HashMap<String, String>();
        }
        if (this.testBotAliasTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.testBotAliasTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TestBotAliasTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotResult clearTestBotAliasTagsEntries() {
        this.testBotAliasTags = null;
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
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDataPrivacy() != null)
            sb.append("DataPrivacy: ").append(getDataPrivacy()).append(",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("IdleSessionTTLInSeconds: ").append(getIdleSessionTTLInSeconds()).append(",");
        if (getBotStatus() != null)
            sb.append("BotStatus: ").append(getBotStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getBotTags() != null)
            sb.append("BotTags: ").append(getBotTags()).append(",");
        if (getTestBotAliasTags() != null)
            sb.append("TestBotAliasTags: ").append(getTestBotAliasTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBotResult == false)
            return false;
        CreateBotResult other = (CreateBotResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDataPrivacy() == null ^ this.getDataPrivacy() == null)
            return false;
        if (other.getDataPrivacy() != null && other.getDataPrivacy().equals(this.getDataPrivacy()) == false)
            return false;
        if (other.getIdleSessionTTLInSeconds() == null ^ this.getIdleSessionTTLInSeconds() == null)
            return false;
        if (other.getIdleSessionTTLInSeconds() != null && other.getIdleSessionTTLInSeconds().equals(this.getIdleSessionTTLInSeconds()) == false)
            return false;
        if (other.getBotStatus() == null ^ this.getBotStatus() == null)
            return false;
        if (other.getBotStatus() != null && other.getBotStatus().equals(this.getBotStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getBotTags() == null ^ this.getBotTags() == null)
            return false;
        if (other.getBotTags() != null && other.getBotTags().equals(this.getBotTags()) == false)
            return false;
        if (other.getTestBotAliasTags() == null ^ this.getTestBotAliasTags() == null)
            return false;
        if (other.getTestBotAliasTags() != null && other.getTestBotAliasTags().equals(this.getTestBotAliasTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataPrivacy() == null) ? 0 : getDataPrivacy().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getBotStatus() == null) ? 0 : getBotStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getBotTags() == null) ? 0 : getBotTags().hashCode());
        hashCode = prime * hashCode + ((getTestBotAliasTags() == null) ? 0 : getTestBotAliasTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBotResult clone() {
        try {
            return (CreateBotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
