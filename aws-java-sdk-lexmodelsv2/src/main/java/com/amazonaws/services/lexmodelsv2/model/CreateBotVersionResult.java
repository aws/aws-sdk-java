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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBotVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The bot identifier specified in the request.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The description of the version specified in the request.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version number assigned to the version.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The source versions used for each locale in the new version.
     * </p>
     */
    private java.util.Map<String, BotVersionLocaleDetails> botVersionLocaleSpecification;
    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the status response element to
     * <code>Creating</code>. After Amazon Lex builds the bot, it sets status to <code>Available</code>. If Amazon Lex
     * can't build the bot, it sets status to <code>Failed</code>.
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
     * The bot identifier specified in the request.
     * </p>
     * 
     * @param botId
     *        The bot identifier specified in the request.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The bot identifier specified in the request.
     * </p>
     * 
     * @return The bot identifier specified in the request.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The bot identifier specified in the request.
     * </p>
     * 
     * @param botId
     *        The bot identifier specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The description of the version specified in the request.
     * </p>
     * 
     * @param description
     *        The description of the version specified in the request.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the version specified in the request.
     * </p>
     * 
     * @return The description of the version specified in the request.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the version specified in the request.
     * </p>
     * 
     * @param description
     *        The description of the version specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version number assigned to the version.
     * </p>
     * 
     * @param botVersion
     *        The version number assigned to the version.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version number assigned to the version.
     * </p>
     * 
     * @return The version number assigned to the version.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version number assigned to the version.
     * </p>
     * 
     * @param botVersion
     *        The version number assigned to the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The source versions used for each locale in the new version.
     * </p>
     * 
     * @return The source versions used for each locale in the new version.
     */

    public java.util.Map<String, BotVersionLocaleDetails> getBotVersionLocaleSpecification() {
        return botVersionLocaleSpecification;
    }

    /**
     * <p>
     * The source versions used for each locale in the new version.
     * </p>
     * 
     * @param botVersionLocaleSpecification
     *        The source versions used for each locale in the new version.
     */

    public void setBotVersionLocaleSpecification(java.util.Map<String, BotVersionLocaleDetails> botVersionLocaleSpecification) {
        this.botVersionLocaleSpecification = botVersionLocaleSpecification;
    }

    /**
     * <p>
     * The source versions used for each locale in the new version.
     * </p>
     * 
     * @param botVersionLocaleSpecification
     *        The source versions used for each locale in the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withBotVersionLocaleSpecification(java.util.Map<String, BotVersionLocaleDetails> botVersionLocaleSpecification) {
        setBotVersionLocaleSpecification(botVersionLocaleSpecification);
        return this;
    }

    /**
     * Add a single BotVersionLocaleSpecification entry
     *
     * @see CreateBotVersionResult#withBotVersionLocaleSpecification
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult addBotVersionLocaleSpecificationEntry(String key, BotVersionLocaleDetails value) {
        if (null == this.botVersionLocaleSpecification) {
            this.botVersionLocaleSpecification = new java.util.HashMap<String, BotVersionLocaleDetails>();
        }
        if (this.botVersionLocaleSpecification.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.botVersionLocaleSpecification.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BotVersionLocaleSpecification.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult clearBotVersionLocaleSpecificationEntries() {
        this.botVersionLocaleSpecification = null;
        return this;
    }

    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the status response element to
     * <code>Creating</code>. After Amazon Lex builds the bot, it sets status to <code>Available</code>. If Amazon Lex
     * can't build the bot, it sets status to <code>Failed</code>.
     * </p>
     * 
     * @param botStatus
     *        When you send a request to create or update a bot, Amazon Lex sets the status response element to
     *        <code>Creating</code>. After Amazon Lex builds the bot, it sets status to <code>Available</code>. If
     *        Amazon Lex can't build the bot, it sets status to <code>Failed</code>.
     * @see BotStatus
     */

    public void setBotStatus(String botStatus) {
        this.botStatus = botStatus;
    }

    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the status response element to
     * <code>Creating</code>. After Amazon Lex builds the bot, it sets status to <code>Available</code>. If Amazon Lex
     * can't build the bot, it sets status to <code>Failed</code>.
     * </p>
     * 
     * @return When you send a request to create or update a bot, Amazon Lex sets the status response element to
     *         <code>Creating</code>. After Amazon Lex builds the bot, it sets status to <code>Available</code>. If
     *         Amazon Lex can't build the bot, it sets status to <code>Failed</code>.
     * @see BotStatus
     */

    public String getBotStatus() {
        return this.botStatus;
    }

    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the status response element to
     * <code>Creating</code>. After Amazon Lex builds the bot, it sets status to <code>Available</code>. If Amazon Lex
     * can't build the bot, it sets status to <code>Failed</code>.
     * </p>
     * 
     * @param botStatus
     *        When you send a request to create or update a bot, Amazon Lex sets the status response element to
     *        <code>Creating</code>. After Amazon Lex builds the bot, it sets status to <code>Available</code>. If
     *        Amazon Lex can't build the bot, it sets status to <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public CreateBotVersionResult withBotStatus(String botStatus) {
        setBotStatus(botStatus);
        return this;
    }

    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the status response element to
     * <code>Creating</code>. After Amazon Lex builds the bot, it sets status to <code>Available</code>. If Amazon Lex
     * can't build the bot, it sets status to <code>Failed</code>.
     * </p>
     * 
     * @param botStatus
     *        When you send a request to create or update a bot, Amazon Lex sets the status response element to
     *        <code>Creating</code>. After Amazon Lex builds the bot, it sets status to <code>Available</code>. If
     *        Amazon Lex can't build the bot, it sets status to <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public CreateBotVersionResult withBotStatus(BotStatus botStatus) {
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

    public CreateBotVersionResult withCreationDateTime(java.util.Date creationDateTime) {
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getBotVersionLocaleSpecification() != null)
            sb.append("BotVersionLocaleSpecification: ").append(getBotVersionLocaleSpecification()).append(",");
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

        if (obj instanceof CreateBotVersionResult == false)
            return false;
        CreateBotVersionResult other = (CreateBotVersionResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getBotVersionLocaleSpecification() == null ^ this.getBotVersionLocaleSpecification() == null)
            return false;
        if (other.getBotVersionLocaleSpecification() != null
                && other.getBotVersionLocaleSpecification().equals(this.getBotVersionLocaleSpecification()) == false)
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

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getBotVersionLocaleSpecification() == null) ? 0 : getBotVersionLocaleSpecification().hashCode());
        hashCode = prime * hashCode + ((getBotStatus() == null) ? 0 : getBotStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateBotVersionResult clone() {
        try {
            return (CreateBotVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
