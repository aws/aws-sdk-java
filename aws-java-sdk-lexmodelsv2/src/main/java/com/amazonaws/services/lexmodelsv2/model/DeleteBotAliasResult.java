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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBotAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot alias to delete.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The unique identifier of the bot that contains the alias to delete.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The current status of the alias. The status is <code>Deleting</code> while the alias is in the process of being
     * deleted. Once the alias is deleted, it will no longer appear in the list of aliases returned by the
     * <code>ListBotAliases</code> operation.
     * </p>
     */
    private String botAliasStatus;

    /**
     * <p>
     * The unique identifier of the bot alias to delete.
     * </p>
     * 
     * @param botAliasId
     *        The unique identifier of the bot alias to delete.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The unique identifier of the bot alias to delete.
     * </p>
     * 
     * @return The unique identifier of the bot alias to delete.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The unique identifier of the bot alias to delete.
     * </p>
     * 
     * @param botAliasId
     *        The unique identifier of the bot alias to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotAliasResult withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the alias to delete.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the alias to delete.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the alias to delete.
     * </p>
     * 
     * @return The unique identifier of the bot that contains the alias to delete.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the alias to delete.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the alias to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotAliasResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The current status of the alias. The status is <code>Deleting</code> while the alias is in the process of being
     * deleted. Once the alias is deleted, it will no longer appear in the list of aliases returned by the
     * <code>ListBotAliases</code> operation.
     * </p>
     * 
     * @param botAliasStatus
     *        The current status of the alias. The status is <code>Deleting</code> while the alias is in the process of
     *        being deleted. Once the alias is deleted, it will no longer appear in the list of aliases returned by the
     *        <code>ListBotAliases</code> operation.
     * @see BotAliasStatus
     */

    public void setBotAliasStatus(String botAliasStatus) {
        this.botAliasStatus = botAliasStatus;
    }

    /**
     * <p>
     * The current status of the alias. The status is <code>Deleting</code> while the alias is in the process of being
     * deleted. Once the alias is deleted, it will no longer appear in the list of aliases returned by the
     * <code>ListBotAliases</code> operation.
     * </p>
     * 
     * @return The current status of the alias. The status is <code>Deleting</code> while the alias is in the process of
     *         being deleted. Once the alias is deleted, it will no longer appear in the list of aliases returned by the
     *         <code>ListBotAliases</code> operation.
     * @see BotAliasStatus
     */

    public String getBotAliasStatus() {
        return this.botAliasStatus;
    }

    /**
     * <p>
     * The current status of the alias. The status is <code>Deleting</code> while the alias is in the process of being
     * deleted. Once the alias is deleted, it will no longer appear in the list of aliases returned by the
     * <code>ListBotAliases</code> operation.
     * </p>
     * 
     * @param botAliasStatus
     *        The current status of the alias. The status is <code>Deleting</code> while the alias is in the process of
     *        being deleted. Once the alias is deleted, it will no longer appear in the list of aliases returned by the
     *        <code>ListBotAliases</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotAliasStatus
     */

    public DeleteBotAliasResult withBotAliasStatus(String botAliasStatus) {
        setBotAliasStatus(botAliasStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the alias. The status is <code>Deleting</code> while the alias is in the process of being
     * deleted. Once the alias is deleted, it will no longer appear in the list of aliases returned by the
     * <code>ListBotAliases</code> operation.
     * </p>
     * 
     * @param botAliasStatus
     *        The current status of the alias. The status is <code>Deleting</code> while the alias is in the process of
     *        being deleted. Once the alias is deleted, it will no longer appear in the list of aliases returned by the
     *        <code>ListBotAliases</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotAliasStatus
     */

    public DeleteBotAliasResult withBotAliasStatus(BotAliasStatus botAliasStatus) {
        this.botAliasStatus = botAliasStatus.toString();
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotAliasStatus() != null)
            sb.append("BotAliasStatus: ").append(getBotAliasStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBotAliasResult == false)
            return false;
        DeleteBotAliasResult other = (DeleteBotAliasResult) obj;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotAliasStatus() == null ^ this.getBotAliasStatus() == null)
            return false;
        if (other.getBotAliasStatus() != null && other.getBotAliasStatus().equals(this.getBotAliasStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotAliasStatus() == null) ? 0 : getBotAliasStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBotAliasResult clone() {
        try {
            return (DeleteBotAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
