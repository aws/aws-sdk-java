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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotAliasReplicas" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotAliasReplicasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique bot ID of the replicated bot created from the source bot alias.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The source region of the replicated bot created from the source bot alias.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The secondary region of the replicated bot created from the source bot alias.
     * </p>
     */
    private String replicaRegion;
    /**
     * <p>
     * The summary information of the replicated bot created from the source bot alias.
     * </p>
     */
    private java.util.List<BotAliasReplicaSummary> botAliasReplicaSummaries;
    /**
     * <p>
     * The next token for the replicated bots created from the source bot alias.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique bot ID of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param botId
     *        The unique bot ID of the replicated bot created from the source bot alias.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique bot ID of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @return The unique bot ID of the replicated bot created from the source bot alias.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique bot ID of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param botId
     *        The unique bot ID of the replicated bot created from the source bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotAliasReplicasResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The source region of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param sourceRegion
     *        The source region of the replicated bot created from the source bot alias.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The source region of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @return The source region of the replicated bot created from the source bot alias.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The source region of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param sourceRegion
     *        The source region of the replicated bot created from the source bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotAliasReplicasResult withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The secondary region of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param replicaRegion
     *        The secondary region of the replicated bot created from the source bot alias.
     */

    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The secondary region of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @return The secondary region of the replicated bot created from the source bot alias.
     */

    public String getReplicaRegion() {
        return this.replicaRegion;
    }

    /**
     * <p>
     * The secondary region of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param replicaRegion
     *        The secondary region of the replicated bot created from the source bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotAliasReplicasResult withReplicaRegion(String replicaRegion) {
        setReplicaRegion(replicaRegion);
        return this;
    }

    /**
     * <p>
     * The summary information of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @return The summary information of the replicated bot created from the source bot alias.
     */

    public java.util.List<BotAliasReplicaSummary> getBotAliasReplicaSummaries() {
        return botAliasReplicaSummaries;
    }

    /**
     * <p>
     * The summary information of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param botAliasReplicaSummaries
     *        The summary information of the replicated bot created from the source bot alias.
     */

    public void setBotAliasReplicaSummaries(java.util.Collection<BotAliasReplicaSummary> botAliasReplicaSummaries) {
        if (botAliasReplicaSummaries == null) {
            this.botAliasReplicaSummaries = null;
            return;
        }

        this.botAliasReplicaSummaries = new java.util.ArrayList<BotAliasReplicaSummary>(botAliasReplicaSummaries);
    }

    /**
     * <p>
     * The summary information of the replicated bot created from the source bot alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotAliasReplicaSummaries(java.util.Collection)} or
     * {@link #withBotAliasReplicaSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param botAliasReplicaSummaries
     *        The summary information of the replicated bot created from the source bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotAliasReplicasResult withBotAliasReplicaSummaries(BotAliasReplicaSummary... botAliasReplicaSummaries) {
        if (this.botAliasReplicaSummaries == null) {
            setBotAliasReplicaSummaries(new java.util.ArrayList<BotAliasReplicaSummary>(botAliasReplicaSummaries.length));
        }
        for (BotAliasReplicaSummary ele : botAliasReplicaSummaries) {
            this.botAliasReplicaSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary information of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param botAliasReplicaSummaries
     *        The summary information of the replicated bot created from the source bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotAliasReplicasResult withBotAliasReplicaSummaries(java.util.Collection<BotAliasReplicaSummary> botAliasReplicaSummaries) {
        setBotAliasReplicaSummaries(botAliasReplicaSummaries);
        return this;
    }

    /**
     * <p>
     * The next token for the replicated bots created from the source bot alias.
     * </p>
     * 
     * @param nextToken
     *        The next token for the replicated bots created from the source bot alias.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token for the replicated bots created from the source bot alias.
     * </p>
     * 
     * @return The next token for the replicated bots created from the source bot alias.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token for the replicated bots created from the source bot alias.
     * </p>
     * 
     * @param nextToken
     *        The next token for the replicated bots created from the source bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotAliasReplicasResult withNextToken(String nextToken) {
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
        if (getBotAliasReplicaSummaries() != null)
            sb.append("BotAliasReplicaSummaries: ").append(getBotAliasReplicaSummaries()).append(",");
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

        if (obj instanceof ListBotAliasReplicasResult == false)
            return false;
        ListBotAliasReplicasResult other = (ListBotAliasReplicasResult) obj;
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
        if (other.getBotAliasReplicaSummaries() == null ^ this.getBotAliasReplicaSummaries() == null)
            return false;
        if (other.getBotAliasReplicaSummaries() != null && other.getBotAliasReplicaSummaries().equals(this.getBotAliasReplicaSummaries()) == false)
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
        hashCode = prime * hashCode + ((getBotAliasReplicaSummaries() == null) ? 0 : getBotAliasReplicaSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBotAliasReplicasResult clone() {
        try {
            return (ListBotAliasReplicasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
