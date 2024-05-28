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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotVersionReplicas"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotVersionReplicasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the bots in the list of replicated bots.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The source region used for the bots in the list of replicated bots.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The region used for the replicated bots in the list of replicated bots.
     * </p>
     */
    private String replicaRegion;
    /**
     * <p>
     * The information summary used for the replicated bots in the list of replicated bots.
     * </p>
     */
    private java.util.List<BotVersionReplicaSummary> botVersionReplicaSummaries;
    /**
     * <p>
     * The next token used for the replicated bots in the list of replicated bots.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique ID of the bots in the list of replicated bots.
     * </p>
     * 
     * @param botId
     *        The unique ID of the bots in the list of replicated bots.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique ID of the bots in the list of replicated bots.
     * </p>
     * 
     * @return The unique ID of the bots in the list of replicated bots.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique ID of the bots in the list of replicated bots.
     * </p>
     * 
     * @param botId
     *        The unique ID of the bots in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The source region used for the bots in the list of replicated bots.
     * </p>
     * 
     * @param sourceRegion
     *        The source region used for the bots in the list of replicated bots.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The source region used for the bots in the list of replicated bots.
     * </p>
     * 
     * @return The source region used for the bots in the list of replicated bots.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The source region used for the bots in the list of replicated bots.
     * </p>
     * 
     * @param sourceRegion
     *        The source region used for the bots in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasResult withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The region used for the replicated bots in the list of replicated bots.
     * </p>
     * 
     * @param replicaRegion
     *        The region used for the replicated bots in the list of replicated bots.
     */

    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The region used for the replicated bots in the list of replicated bots.
     * </p>
     * 
     * @return The region used for the replicated bots in the list of replicated bots.
     */

    public String getReplicaRegion() {
        return this.replicaRegion;
    }

    /**
     * <p>
     * The region used for the replicated bots in the list of replicated bots.
     * </p>
     * 
     * @param replicaRegion
     *        The region used for the replicated bots in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasResult withReplicaRegion(String replicaRegion) {
        setReplicaRegion(replicaRegion);
        return this;
    }

    /**
     * <p>
     * The information summary used for the replicated bots in the list of replicated bots.
     * </p>
     * 
     * @return The information summary used for the replicated bots in the list of replicated bots.
     */

    public java.util.List<BotVersionReplicaSummary> getBotVersionReplicaSummaries() {
        return botVersionReplicaSummaries;
    }

    /**
     * <p>
     * The information summary used for the replicated bots in the list of replicated bots.
     * </p>
     * 
     * @param botVersionReplicaSummaries
     *        The information summary used for the replicated bots in the list of replicated bots.
     */

    public void setBotVersionReplicaSummaries(java.util.Collection<BotVersionReplicaSummary> botVersionReplicaSummaries) {
        if (botVersionReplicaSummaries == null) {
            this.botVersionReplicaSummaries = null;
            return;
        }

        this.botVersionReplicaSummaries = new java.util.ArrayList<BotVersionReplicaSummary>(botVersionReplicaSummaries);
    }

    /**
     * <p>
     * The information summary used for the replicated bots in the list of replicated bots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotVersionReplicaSummaries(java.util.Collection)} or
     * {@link #withBotVersionReplicaSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param botVersionReplicaSummaries
     *        The information summary used for the replicated bots in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasResult withBotVersionReplicaSummaries(BotVersionReplicaSummary... botVersionReplicaSummaries) {
        if (this.botVersionReplicaSummaries == null) {
            setBotVersionReplicaSummaries(new java.util.ArrayList<BotVersionReplicaSummary>(botVersionReplicaSummaries.length));
        }
        for (BotVersionReplicaSummary ele : botVersionReplicaSummaries) {
            this.botVersionReplicaSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information summary used for the replicated bots in the list of replicated bots.
     * </p>
     * 
     * @param botVersionReplicaSummaries
     *        The information summary used for the replicated bots in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasResult withBotVersionReplicaSummaries(java.util.Collection<BotVersionReplicaSummary> botVersionReplicaSummaries) {
        setBotVersionReplicaSummaries(botVersionReplicaSummaries);
        return this;
    }

    /**
     * <p>
     * The next token used for the replicated bots in the list of replicated bots.
     * </p>
     * 
     * @param nextToken
     *        The next token used for the replicated bots in the list of replicated bots.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for the replicated bots in the list of replicated bots.
     * </p>
     * 
     * @return The next token used for the replicated bots in the list of replicated bots.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used for the replicated bots in the list of replicated bots.
     * </p>
     * 
     * @param nextToken
     *        The next token used for the replicated bots in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getReplicaRegion() != null)
            sb.append("ReplicaRegion: ").append(getReplicaRegion()).append(",");
        if (getBotVersionReplicaSummaries() != null)
            sb.append("BotVersionReplicaSummaries: ").append(getBotVersionReplicaSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBotVersionReplicasResult == false)
            return false;
        ListBotVersionReplicasResult other = (ListBotVersionReplicasResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getReplicaRegion() == null ^ this.getReplicaRegion() == null)
            return false;
        if (other.getReplicaRegion() != null && other.getReplicaRegion().equals(this.getReplicaRegion()) == false)
            return false;
        if (other.getBotVersionReplicaSummaries() == null ^ this.getBotVersionReplicaSummaries() == null)
            return false;
        if (other.getBotVersionReplicaSummaries() != null && other.getBotVersionReplicaSummaries().equals(this.getBotVersionReplicaSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getReplicaRegion() == null) ? 0 : getReplicaRegion().hashCode());
        hashCode = prime * hashCode + ((getBotVersionReplicaSummaries() == null) ? 0 : getBotVersionReplicaSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBotVersionReplicasResult clone() {
        try {
            return (ListBotVersionReplicasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
