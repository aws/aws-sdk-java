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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotReplicas" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotReplicasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * the unique bot IDs in the list of replicated bots.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The source region of the source bots in the list of replicated bots.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The summary details for the replicated bots.
     * </p>
     */
    private java.util.List<BotReplicaSummary> botReplicaSummaries;

    /**
     * <p>
     * the unique bot IDs in the list of replicated bots.
     * </p>
     * 
     * @param botId
     *        the unique bot IDs in the list of replicated bots.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * the unique bot IDs in the list of replicated bots.
     * </p>
     * 
     * @return the unique bot IDs in the list of replicated bots.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * the unique bot IDs in the list of replicated bots.
     * </p>
     * 
     * @param botId
     *        the unique bot IDs in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotReplicasResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The source region of the source bots in the list of replicated bots.
     * </p>
     * 
     * @param sourceRegion
     *        The source region of the source bots in the list of replicated bots.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The source region of the source bots in the list of replicated bots.
     * </p>
     * 
     * @return The source region of the source bots in the list of replicated bots.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The source region of the source bots in the list of replicated bots.
     * </p>
     * 
     * @param sourceRegion
     *        The source region of the source bots in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotReplicasResult withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The summary details for the replicated bots.
     * </p>
     * 
     * @return The summary details for the replicated bots.
     */

    public java.util.List<BotReplicaSummary> getBotReplicaSummaries() {
        return botReplicaSummaries;
    }

    /**
     * <p>
     * The summary details for the replicated bots.
     * </p>
     * 
     * @param botReplicaSummaries
     *        The summary details for the replicated bots.
     */

    public void setBotReplicaSummaries(java.util.Collection<BotReplicaSummary> botReplicaSummaries) {
        if (botReplicaSummaries == null) {
            this.botReplicaSummaries = null;
            return;
        }

        this.botReplicaSummaries = new java.util.ArrayList<BotReplicaSummary>(botReplicaSummaries);
    }

    /**
     * <p>
     * The summary details for the replicated bots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotReplicaSummaries(java.util.Collection)} or {@link #withBotReplicaSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param botReplicaSummaries
     *        The summary details for the replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotReplicasResult withBotReplicaSummaries(BotReplicaSummary... botReplicaSummaries) {
        if (this.botReplicaSummaries == null) {
            setBotReplicaSummaries(new java.util.ArrayList<BotReplicaSummary>(botReplicaSummaries.length));
        }
        for (BotReplicaSummary ele : botReplicaSummaries) {
            this.botReplicaSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary details for the replicated bots.
     * </p>
     * 
     * @param botReplicaSummaries
     *        The summary details for the replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotReplicasResult withBotReplicaSummaries(java.util.Collection<BotReplicaSummary> botReplicaSummaries) {
        setBotReplicaSummaries(botReplicaSummaries);
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
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getBotReplicaSummaries() != null)
            sb.append("BotReplicaSummaries: ").append(getBotReplicaSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBotReplicasResult == false)
            return false;
        ListBotReplicasResult other = (ListBotReplicasResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getBotReplicaSummaries() == null ^ this.getBotReplicaSummaries() == null)
            return false;
        if (other.getBotReplicaSummaries() != null && other.getBotReplicaSummaries().equals(this.getBotReplicaSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getBotReplicaSummaries() == null) ? 0 : getBotReplicaSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListBotReplicasResult clone() {
        try {
            return (ListBotReplicasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
