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
 * Summary information about a bot version returned by the <a>ListBotVersions</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotVersionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the bot associated with the version.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The numeric version of the bot, or <code>DRAFT</code> to indicate that this is the version of the bot that can be
     * updated..
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The description of the version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the bot. When the status is available, the version of the bot is ready for use.
     * </p>
     */
    private String botStatus;
    /**
     * <p>
     * A timestamp of the date and time that the version was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The name of the bot associated with the version.
     * </p>
     * 
     * @param botName
     *        The name of the bot associated with the version.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot associated with the version.
     * </p>
     * 
     * @return The name of the bot associated with the version.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot associated with the version.
     * </p>
     * 
     * @param botName
     *        The name of the bot associated with the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotVersionSummary withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The numeric version of the bot, or <code>DRAFT</code> to indicate that this is the version of the bot that can be
     * updated..
     * </p>
     * 
     * @param botVersion
     *        The numeric version of the bot, or <code>DRAFT</code> to indicate that this is the version of the bot that
     *        can be updated..
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The numeric version of the bot, or <code>DRAFT</code> to indicate that this is the version of the bot that can be
     * updated..
     * </p>
     * 
     * @return The numeric version of the bot, or <code>DRAFT</code> to indicate that this is the version of the bot
     *         that can be updated..
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The numeric version of the bot, or <code>DRAFT</code> to indicate that this is the version of the bot that can be
     * updated..
     * </p>
     * 
     * @param botVersion
     *        The numeric version of the bot, or <code>DRAFT</code> to indicate that this is the version of the bot that
     *        can be updated..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotVersionSummary withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @param description
     *        The description of the version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @return The description of the version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @param description
     *        The description of the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotVersionSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the bot. When the status is available, the version of the bot is ready for use.
     * </p>
     * 
     * @param botStatus
     *        The status of the bot. When the status is available, the version of the bot is ready for use.
     * @see BotStatus
     */

    public void setBotStatus(String botStatus) {
        this.botStatus = botStatus;
    }

    /**
     * <p>
     * The status of the bot. When the status is available, the version of the bot is ready for use.
     * </p>
     * 
     * @return The status of the bot. When the status is available, the version of the bot is ready for use.
     * @see BotStatus
     */

    public String getBotStatus() {
        return this.botStatus;
    }

    /**
     * <p>
     * The status of the bot. When the status is available, the version of the bot is ready for use.
     * </p>
     * 
     * @param botStatus
     *        The status of the bot. When the status is available, the version of the bot is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public BotVersionSummary withBotStatus(String botStatus) {
        setBotStatus(botStatus);
        return this;
    }

    /**
     * <p>
     * The status of the bot. When the status is available, the version of the bot is ready for use.
     * </p>
     * 
     * @param botStatus
     *        The status of the bot. When the status is available, the version of the bot is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public BotVersionSummary withBotStatus(BotStatus botStatus) {
        this.botStatus = botStatus.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the version was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the version was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the version was created.
     * </p>
     * 
     * @return A timestamp of the date and time that the version was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the version was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotVersionSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
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
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBotStatus() != null)
            sb.append("BotStatus: ").append(getBotStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotVersionSummary == false)
            return false;
        BotVersionSummary other = (BotVersionSummary) obj;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotStatus() == null ^ this.getBotStatus() == null)
            return false;
        if (other.getBotStatus() != null && other.getBotStatus().equals(this.getBotStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotStatus() == null) ? 0 : getBotStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        return hashCode;
    }

    @Override
    public BotVersionSummary clone() {
        try {
            return (BotVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
