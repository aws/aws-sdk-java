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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a bot returned by the <a>ListBots</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier assigned to the bot. Use this ID to get detailed information about the bot with the
     * <a>DescribeBot</a> operation.
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
     * The current status of the bot. When the status is <code>Available</code> the bot is ready for use.
     * </p>
     */
    private String botStatus;
    /**
     * <p>
     * The latest numerical version in use for the bot.
     * </p>
     */
    private String latestBotVersion;
    /**
     * <p>
     * The date and time that the bot was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier assigned to the bot. Use this ID to get detailed information about the bot with the
     * <a>DescribeBot</a> operation.
     * </p>
     * 
     * @param botId
     *        The unique identifier assigned to the bot. Use this ID to get detailed information about the bot with the
     *        <a>DescribeBot</a> operation.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier assigned to the bot. Use this ID to get detailed information about the bot with the
     * <a>DescribeBot</a> operation.
     * </p>
     * 
     * @return The unique identifier assigned to the bot. Use this ID to get detailed information about the bot with the
     *         <a>DescribeBot</a> operation.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier assigned to the bot. Use this ID to get detailed information about the bot with the
     * <a>DescribeBot</a> operation.
     * </p>
     * 
     * @param botId
     *        The unique identifier assigned to the bot. Use this ID to get detailed information about the bot with the
     *        <a>DescribeBot</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotSummary withBotId(String botId) {
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

    public BotSummary withBotName(String botName) {
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

    public BotSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code> the bot is ready for use.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. When the status is <code>Available</code> the bot is ready for use.
     * @see BotStatus
     */

    public void setBotStatus(String botStatus) {
        this.botStatus = botStatus;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code> the bot is ready for use.
     * </p>
     * 
     * @return The current status of the bot. When the status is <code>Available</code> the bot is ready for use.
     * @see BotStatus
     */

    public String getBotStatus() {
        return this.botStatus;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code> the bot is ready for use.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. When the status is <code>Available</code> the bot is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public BotSummary withBotStatus(String botStatus) {
        setBotStatus(botStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code> the bot is ready for use.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. When the status is <code>Available</code> the bot is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public BotSummary withBotStatus(BotStatus botStatus) {
        this.botStatus = botStatus.toString();
        return this;
    }

    /**
     * <p>
     * The latest numerical version in use for the bot.
     * </p>
     * 
     * @param latestBotVersion
     *        The latest numerical version in use for the bot.
     */

    public void setLatestBotVersion(String latestBotVersion) {
        this.latestBotVersion = latestBotVersion;
    }

    /**
     * <p>
     * The latest numerical version in use for the bot.
     * </p>
     * 
     * @return The latest numerical version in use for the bot.
     */

    public String getLatestBotVersion() {
        return this.latestBotVersion;
    }

    /**
     * <p>
     * The latest numerical version in use for the bot.
     * </p>
     * 
     * @param latestBotVersion
     *        The latest numerical version in use for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotSummary withLatestBotVersion(String latestBotVersion) {
        setLatestBotVersion(latestBotVersion);
        return this;
    }

    /**
     * <p>
     * The date and time that the bot was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the bot was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the bot was last updated.
     * </p>
     * 
     * @return The date and time that the bot was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the bot was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the bot was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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
        if (getBotStatus() != null)
            sb.append("BotStatus: ").append(getBotStatus()).append(",");
        if (getLatestBotVersion() != null)
            sb.append("LatestBotVersion: ").append(getLatestBotVersion()).append(",");
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

        if (obj instanceof BotSummary == false)
            return false;
        BotSummary other = (BotSummary) obj;
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
        if (other.getBotStatus() == null ^ this.getBotStatus() == null)
            return false;
        if (other.getBotStatus() != null && other.getBotStatus().equals(this.getBotStatus()) == false)
            return false;
        if (other.getLatestBotVersion() == null ^ this.getLatestBotVersion() == null)
            return false;
        if (other.getLatestBotVersion() != null && other.getLatestBotVersion().equals(this.getLatestBotVersion()) == false)
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
        hashCode = prime * hashCode + ((getBotStatus() == null) ? 0 : getBotStatus().hashCode());
        hashCode = prime * hashCode + ((getLatestBotVersion() == null) ? 0 : getLatestBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public BotSummary clone() {
        try {
            return (BotSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
