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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBotVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot that is being deleted.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that is being deleted.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The current status of the bot.
     * </p>
     */
    private String botStatus;

    /**
     * <p>
     * The identifier of the bot that is being deleted.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that is being deleted.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that is being deleted.
     * </p>
     * 
     * @return The identifier of the bot that is being deleted.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that is being deleted.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that is being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotVersionResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that is being deleted.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that is being deleted.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that is being deleted.
     * </p>
     * 
     * @return The version of the bot that is being deleted.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that is being deleted.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that is being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotVersionResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The current status of the bot.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot.
     * @see BotStatus
     */

    public void setBotStatus(String botStatus) {
        this.botStatus = botStatus;
    }

    /**
     * <p>
     * The current status of the bot.
     * </p>
     * 
     * @return The current status of the bot.
     * @see BotStatus
     */

    public String getBotStatus() {
        return this.botStatus;
    }

    /**
     * <p>
     * The current status of the bot.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public DeleteBotVersionResult withBotStatus(String botStatus) {
        setBotStatus(botStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the bot.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public DeleteBotVersionResult withBotStatus(BotStatus botStatus) {
        this.botStatus = botStatus.toString();
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
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getBotStatus() != null)
            sb.append("BotStatus: ").append(getBotStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBotVersionResult == false)
            return false;
        DeleteBotVersionResult other = (DeleteBotVersionResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getBotStatus() == null ^ this.getBotStatus() == null)
            return false;
        if (other.getBotStatus() != null && other.getBotStatus().equals(this.getBotStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getBotStatus() == null) ? 0 : getBotStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBotVersionResult clone() {
        try {
            return (DeleteBotVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
