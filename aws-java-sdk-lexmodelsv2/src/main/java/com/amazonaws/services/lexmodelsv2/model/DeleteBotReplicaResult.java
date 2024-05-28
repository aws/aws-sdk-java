/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotReplica" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBotReplicaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique bot ID of the replicated bot generated.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The region of the replicated bot generated.
     * </p>
     */
    private String replicaRegion;
    /**
     * <p>
     * The operational status of the replicated bot generated.
     * </p>
     */
    private String botReplicaStatus;

    /**
     * <p>
     * The unique bot ID of the replicated bot generated.
     * </p>
     * 
     * @param botId
     *        The unique bot ID of the replicated bot generated.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique bot ID of the replicated bot generated.
     * </p>
     * 
     * @return The unique bot ID of the replicated bot generated.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique bot ID of the replicated bot generated.
     * </p>
     * 
     * @param botId
     *        The unique bot ID of the replicated bot generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotReplicaResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The region of the replicated bot generated.
     * </p>
     * 
     * @param replicaRegion
     *        The region of the replicated bot generated.
     */

    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The region of the replicated bot generated.
     * </p>
     * 
     * @return The region of the replicated bot generated.
     */

    public String getReplicaRegion() {
        return this.replicaRegion;
    }

    /**
     * <p>
     * The region of the replicated bot generated.
     * </p>
     * 
     * @param replicaRegion
     *        The region of the replicated bot generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotReplicaResult withReplicaRegion(String replicaRegion) {
        setReplicaRegion(replicaRegion);
        return this;
    }

    /**
     * <p>
     * The operational status of the replicated bot generated.
     * </p>
     * 
     * @param botReplicaStatus
     *        The operational status of the replicated bot generated.
     * @see BotReplicaStatus
     */

    public void setBotReplicaStatus(String botReplicaStatus) {
        this.botReplicaStatus = botReplicaStatus;
    }

    /**
     * <p>
     * The operational status of the replicated bot generated.
     * </p>
     * 
     * @return The operational status of the replicated bot generated.
     * @see BotReplicaStatus
     */

    public String getBotReplicaStatus() {
        return this.botReplicaStatus;
    }

    /**
     * <p>
     * The operational status of the replicated bot generated.
     * </p>
     * 
     * @param botReplicaStatus
     *        The operational status of the replicated bot generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotReplicaStatus
     */

    public DeleteBotReplicaResult withBotReplicaStatus(String botReplicaStatus) {
        setBotReplicaStatus(botReplicaStatus);
        return this;
    }

    /**
     * <p>
     * The operational status of the replicated bot generated.
     * </p>
     * 
     * @param botReplicaStatus
     *        The operational status of the replicated bot generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotReplicaStatus
     */

    public DeleteBotReplicaResult withBotReplicaStatus(BotReplicaStatus botReplicaStatus) {
        this.botReplicaStatus = botReplicaStatus.toString();
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
        if (getReplicaRegion() != null)
            sb.append("ReplicaRegion: ").append(getReplicaRegion()).append(",");
        if (getBotReplicaStatus() != null)
            sb.append("BotReplicaStatus: ").append(getBotReplicaStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBotReplicaResult == false)
            return false;
        DeleteBotReplicaResult other = (DeleteBotReplicaResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getReplicaRegion() == null ^ this.getReplicaRegion() == null)
            return false;
        if (other.getReplicaRegion() != null && other.getReplicaRegion().equals(this.getReplicaRegion()) == false)
            return false;
        if (other.getBotReplicaStatus() == null ^ this.getBotReplicaStatus() == null)
            return false;
        if (other.getBotReplicaStatus() != null && other.getBotReplicaStatus().equals(this.getBotReplicaStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getReplicaRegion() == null) ? 0 : getReplicaRegion().hashCode());
        hashCode = prime * hashCode + ((getBotReplicaStatus() == null) ? 0 : getBotReplicaStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBotReplicaResult clone() {
        try {
            return (DeleteBotReplicaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
