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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot that was updated.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The name of the bot after the update.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The description of the bot after the update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the bot after the update.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The data privacy settings for the bot after the update.
     * </p>
     */
    private DataPrivacy dataPrivacy;
    /**
     * <p>
     * The session timeout, in seconds, for the bot after the update.
     * </p>
     */
    private Integer idleSessionTTLInSeconds;
    /**
     * <p>
     * Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is read
     * for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     * <code>DRAFT</code> version of the bot.
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
     * The unique identifier of the bot that was updated.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that was updated.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that was updated.
     * </p>
     * 
     * @return The unique identifier of the bot that was updated.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that was updated.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The name of the bot after the update.
     * </p>
     * 
     * @param botName
     *        The name of the bot after the update.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot after the update.
     * </p>
     * 
     * @return The name of the bot after the update.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot after the update.
     * </p>
     * 
     * @param botName
     *        The name of the bot after the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotResult withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The description of the bot after the update.
     * </p>
     * 
     * @param description
     *        The description of the bot after the update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the bot after the update.
     * </p>
     * 
     * @return The description of the bot after the update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the bot after the update.
     * </p>
     * 
     * @param description
     *        The description of the bot after the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the bot after the update.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used by the bot after the update.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the bot after the update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used by the bot after the update.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the bot after the update.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used by the bot after the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The data privacy settings for the bot after the update.
     * </p>
     * 
     * @param dataPrivacy
     *        The data privacy settings for the bot after the update.
     */

    public void setDataPrivacy(DataPrivacy dataPrivacy) {
        this.dataPrivacy = dataPrivacy;
    }

    /**
     * <p>
     * The data privacy settings for the bot after the update.
     * </p>
     * 
     * @return The data privacy settings for the bot after the update.
     */

    public DataPrivacy getDataPrivacy() {
        return this.dataPrivacy;
    }

    /**
     * <p>
     * The data privacy settings for the bot after the update.
     * </p>
     * 
     * @param dataPrivacy
     *        The data privacy settings for the bot after the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotResult withDataPrivacy(DataPrivacy dataPrivacy) {
        setDataPrivacy(dataPrivacy);
        return this;
    }

    /**
     * <p>
     * The session timeout, in seconds, for the bot after the update.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The session timeout, in seconds, for the bot after the update.
     */

    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The session timeout, in seconds, for the bot after the update.
     * </p>
     * 
     * @return The session timeout, in seconds, for the bot after the update.
     */

    public Integer getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The session timeout, in seconds, for the bot after the update.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The session timeout, in seconds, for the bot after the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotResult withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is read
     * for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     * <code>DRAFT</code> version of the bot.
     * </p>
     * 
     * @param botStatus
     *        Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is
     *        read for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     *        <code>DRAFT</code> version of the bot.
     * @see BotStatus
     */

    public void setBotStatus(String botStatus) {
        this.botStatus = botStatus;
    }

    /**
     * <p>
     * Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is read
     * for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     * <code>DRAFT</code> version of the bot.
     * </p>
     * 
     * @return Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot
     *         is read for use, it changes to the <code>Available</code> status. After the bot is created, you can use
     *         the <code>DRAFT</code> version of the bot.
     * @see BotStatus
     */

    public String getBotStatus() {
        return this.botStatus;
    }

    /**
     * <p>
     * Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is read
     * for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     * <code>DRAFT</code> version of the bot.
     * </p>
     * 
     * @param botStatus
     *        Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is
     *        read for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     *        <code>DRAFT</code> version of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public UpdateBotResult withBotStatus(String botStatus) {
        setBotStatus(botStatus);
        return this;
    }

    /**
     * <p>
     * Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is read
     * for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     * <code>DRAFT</code> version of the bot.
     * </p>
     * 
     * @param botStatus
     *        Shows the current status of the bot. The bot is first in the <code>Creating</code> status. Once the bot is
     *        read for use, it changes to the <code>Available</code> status. After the bot is created, you can use the
     *        <code>DRAFT</code> version of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public UpdateBotResult withBotStatus(BotStatus botStatus) {
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

    public UpdateBotResult withCreationDateTime(java.util.Date creationDateTime) {
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

    public UpdateBotResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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

        if (obj instanceof UpdateBotResult == false)
            return false;
        UpdateBotResult other = (UpdateBotResult) obj;
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
    public UpdateBotResult clone() {
        try {
            return (UpdateBotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
