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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot that Amazon Lex is deleting.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The current status of the bot. The status is <code>Deleting</code> while the bot and its associated resources are
     * being deleted.
     * </p>
     */
    private String botStatus;

    /**
     * <p>
     * The unique identifier of the bot that Amazon Lex is deleting.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that Amazon Lex is deleting.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that Amazon Lex is deleting.
     * </p>
     * 
     * @return The unique identifier of the bot that Amazon Lex is deleting.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that Amazon Lex is deleting.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that Amazon Lex is deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The current status of the bot. The status is <code>Deleting</code> while the bot and its associated resources are
     * being deleted.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. The status is <code>Deleting</code> while the bot and its associated
     *        resources are being deleted.
     * @see BotStatus
     */

    public void setBotStatus(String botStatus) {
        this.botStatus = botStatus;
    }

    /**
     * <p>
     * The current status of the bot. The status is <code>Deleting</code> while the bot and its associated resources are
     * being deleted.
     * </p>
     * 
     * @return The current status of the bot. The status is <code>Deleting</code> while the bot and its associated
     *         resources are being deleted.
     * @see BotStatus
     */

    public String getBotStatus() {
        return this.botStatus;
    }

    /**
     * <p>
     * The current status of the bot. The status is <code>Deleting</code> while the bot and its associated resources are
     * being deleted.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. The status is <code>Deleting</code> while the bot and its associated
     *        resources are being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public DeleteBotResult withBotStatus(String botStatus) {
        setBotStatus(botStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the bot. The status is <code>Deleting</code> while the bot and its associated resources are
     * being deleted.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. The status is <code>Deleting</code> while the bot and its associated
     *        resources are being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public DeleteBotResult withBotStatus(BotStatus botStatus) {
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

        if (obj instanceof DeleteBotResult == false)
            return false;
        DeleteBotResult other = (DeleteBotResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
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
        hashCode = prime * hashCode + ((getBotStatus() == null) ? 0 : getBotStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBotResult clone() {
        try {
            return (DeleteBotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
