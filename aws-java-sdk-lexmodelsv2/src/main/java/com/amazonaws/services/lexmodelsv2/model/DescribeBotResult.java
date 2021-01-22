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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The name of the bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The description of the bot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Settings for managing data privacy of the bot and its conversations with users.
     * </p>
     */
    private DataPrivacy dataPrivacy;
    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * </p>
     */
    private Integer idleSessionTTLInSeconds;
    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code> the bot is ready to be used in
     * conversations with users.
     * </p>
     */
    private String botStatus;
    /**
     * <p>
     * A timestamp of the date and time that the bot was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A timestamp of the date and time that the bot was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier of the bot.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot.
     * </p>
     * 
     * @return The unique identifier of the bot.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @param botName
     *        The name of the bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @return The name of the bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @param botName
     *        The name of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResult withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The description of the bot.
     * </p>
     * 
     * @param description
     *        The description of the bot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the bot.
     * </p>
     * 
     * @return The description of the bot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the bot.
     * </p>
     * 
     * @param description
     *        The description of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Settings for managing data privacy of the bot and its conversations with users.
     * </p>
     * 
     * @param dataPrivacy
     *        Settings for managing data privacy of the bot and its conversations with users.
     */

    public void setDataPrivacy(DataPrivacy dataPrivacy) {
        this.dataPrivacy = dataPrivacy;
    }

    /**
     * <p>
     * Settings for managing data privacy of the bot and its conversations with users.
     * </p>
     * 
     * @return Settings for managing data privacy of the bot and its conversations with users.
     */

    public DataPrivacy getDataPrivacy() {
        return this.dataPrivacy;
    }

    /**
     * <p>
     * Settings for managing data privacy of the bot and its conversations with users.
     * </p>
     * 
     * @param dataPrivacy
     *        Settings for managing data privacy of the bot and its conversations with users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResult withDataPrivacy(DataPrivacy dataPrivacy) {
        setDataPrivacy(dataPrivacy);
        return this;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     */

    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * </p>
     * 
     * @return The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     */

    public Integer getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResult withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code> the bot is ready to be used in
     * conversations with users.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. When the status is <code>Available</code> the bot is ready to be used in
     *        conversations with users.
     * @see BotStatus
     */

    public void setBotStatus(String botStatus) {
        this.botStatus = botStatus;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code> the bot is ready to be used in
     * conversations with users.
     * </p>
     * 
     * @return The current status of the bot. When the status is <code>Available</code> the bot is ready to be used in
     *         conversations with users.
     * @see BotStatus
     */

    public String getBotStatus() {
        return this.botStatus;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code> the bot is ready to be used in
     * conversations with users.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. When the status is <code>Available</code> the bot is ready to be used in
     *        conversations with users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public DescribeBotResult withBotStatus(String botStatus) {
        setBotStatus(botStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code> the bot is ready to be used in
     * conversations with users.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. When the status is <code>Available</code> the bot is ready to be used in
     *        conversations with users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public DescribeBotResult withBotStatus(BotStatus botStatus) {
        this.botStatus = botStatus.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the bot was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot was created.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the bot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the bot was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot was last updated.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the bot was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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

        if (obj instanceof DescribeBotResult == false)
            return false;
        DescribeBotResult other = (DescribeBotResult) obj;
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
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataPrivacy() == null) ? 0 : getDataPrivacy().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getBotStatus() == null) ? 0 : getBotStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBotResult clone() {
        try {
            return (DescribeBotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
