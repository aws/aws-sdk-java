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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotReplica" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBotReplicaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the replicated bot to be deleted from the secondary region
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The secondary region of the replicated bot that will be deleted.
     * </p>
     */
    private String replicaRegion;

    /**
     * <p>
     * The unique ID of the replicated bot to be deleted from the secondary region
     * </p>
     * 
     * @param botId
     *        The unique ID of the replicated bot to be deleted from the secondary region
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique ID of the replicated bot to be deleted from the secondary region
     * </p>
     * 
     * @return The unique ID of the replicated bot to be deleted from the secondary region
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique ID of the replicated bot to be deleted from the secondary region
     * </p>
     * 
     * @param botId
     *        The unique ID of the replicated bot to be deleted from the secondary region
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotReplicaRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The secondary region of the replicated bot that will be deleted.
     * </p>
     * 
     * @param replicaRegion
     *        The secondary region of the replicated bot that will be deleted.
     */

    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The secondary region of the replicated bot that will be deleted.
     * </p>
     * 
     * @return The secondary region of the replicated bot that will be deleted.
     */

    public String getReplicaRegion() {
        return this.replicaRegion;
    }

    /**
     * <p>
     * The secondary region of the replicated bot that will be deleted.
     * </p>
     * 
     * @param replicaRegion
     *        The secondary region of the replicated bot that will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotReplicaRequest withReplicaRegion(String replicaRegion) {
        setReplicaRegion(replicaRegion);
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
            sb.append("ReplicaRegion: ").append(getReplicaRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBotReplicaRequest == false)
            return false;
        DeleteBotReplicaRequest other = (DeleteBotReplicaRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getReplicaRegion() == null ^ this.getReplicaRegion() == null)
            return false;
        if (other.getReplicaRegion() != null && other.getReplicaRegion().equals(this.getReplicaRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getReplicaRegion() == null) ? 0 : getReplicaRegion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBotReplicaRequest clone() {
        return (DeleteBotReplicaRequest) super.clone();
    }

}
