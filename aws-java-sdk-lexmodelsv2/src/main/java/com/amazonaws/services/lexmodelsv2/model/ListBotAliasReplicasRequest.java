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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotAliasReplicas" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotAliasReplicasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The request for the unique bot ID of the replicated bot created from the source bot alias.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The request for the secondary region of the replicated bot created from the source bot alias.
     * </p>
     */
    private String replicaRegion;
    /**
     * <p>
     * The request for maximum results to list the replicated bots created from the source bot alias.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The request for the next token for the replicated bot created from the source bot alias.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The request for the unique bot ID of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param botId
     *        The request for the unique bot ID of the replicated bot created from the source bot alias.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The request for the unique bot ID of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @return The request for the unique bot ID of the replicated bot created from the source bot alias.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The request for the unique bot ID of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param botId
     *        The request for the unique bot ID of the replicated bot created from the source bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotAliasReplicasRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The request for the secondary region of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param replicaRegion
     *        The request for the secondary region of the replicated bot created from the source bot alias.
     */

    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The request for the secondary region of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @return The request for the secondary region of the replicated bot created from the source bot alias.
     */

    public String getReplicaRegion() {
        return this.replicaRegion;
    }

    /**
     * <p>
     * The request for the secondary region of the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param replicaRegion
     *        The request for the secondary region of the replicated bot created from the source bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotAliasReplicasRequest withReplicaRegion(String replicaRegion) {
        setReplicaRegion(replicaRegion);
        return this;
    }

    /**
     * <p>
     * The request for maximum results to list the replicated bots created from the source bot alias.
     * </p>
     * 
     * @param maxResults
     *        The request for maximum results to list the replicated bots created from the source bot alias.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The request for maximum results to list the replicated bots created from the source bot alias.
     * </p>
     * 
     * @return The request for maximum results to list the replicated bots created from the source bot alias.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The request for maximum results to list the replicated bots created from the source bot alias.
     * </p>
     * 
     * @param maxResults
     *        The request for maximum results to list the replicated bots created from the source bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotAliasReplicasRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The request for the next token for the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param nextToken
     *        The request for the next token for the replicated bot created from the source bot alias.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The request for the next token for the replicated bot created from the source bot alias.
     * </p>
     * 
     * @return The request for the next token for the replicated bot created from the source bot alias.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The request for the next token for the replicated bot created from the source bot alias.
     * </p>
     * 
     * @param nextToken
     *        The request for the next token for the replicated bot created from the source bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotAliasReplicasRequest withNextToken(String nextToken) {
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
        if (getReplicaRegion() != null)
            sb.append("ReplicaRegion: ").append(getReplicaRegion()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListBotAliasReplicasRequest == false)
            return false;
        ListBotAliasReplicasRequest other = (ListBotAliasReplicasRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getReplicaRegion() == null ^ this.getReplicaRegion() == null)
            return false;
        if (other.getReplicaRegion() != null && other.getReplicaRegion().equals(this.getReplicaRegion()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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
        hashCode = prime * hashCode + ((getReplicaRegion() == null) ? 0 : getReplicaRegion().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBotAliasReplicasRequest clone() {
        return (ListBotAliasReplicasRequest) super.clone();
    }

}
