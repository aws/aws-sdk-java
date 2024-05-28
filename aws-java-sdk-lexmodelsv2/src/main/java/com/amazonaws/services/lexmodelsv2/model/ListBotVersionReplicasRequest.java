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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotVersionReplicas"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotVersionReplicasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The request for the unique ID in the list of replicated bots.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The request for the region used in the list of replicated bots.
     * </p>
     */
    private String replicaRegion;
    /**
     * <p>
     * The maximum results given in the list of replicated bots.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The next token given in the list of replicated bots.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The requested sort category for the list of replicated bots.
     * </p>
     */
    private BotVersionReplicaSortBy sortBy;

    /**
     * <p>
     * The request for the unique ID in the list of replicated bots.
     * </p>
     * 
     * @param botId
     *        The request for the unique ID in the list of replicated bots.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The request for the unique ID in the list of replicated bots.
     * </p>
     * 
     * @return The request for the unique ID in the list of replicated bots.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The request for the unique ID in the list of replicated bots.
     * </p>
     * 
     * @param botId
     *        The request for the unique ID in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The request for the region used in the list of replicated bots.
     * </p>
     * 
     * @param replicaRegion
     *        The request for the region used in the list of replicated bots.
     */

    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The request for the region used in the list of replicated bots.
     * </p>
     * 
     * @return The request for the region used in the list of replicated bots.
     */

    public String getReplicaRegion() {
        return this.replicaRegion;
    }

    /**
     * <p>
     * The request for the region used in the list of replicated bots.
     * </p>
     * 
     * @param replicaRegion
     *        The request for the region used in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasRequest withReplicaRegion(String replicaRegion) {
        setReplicaRegion(replicaRegion);
        return this;
    }

    /**
     * <p>
     * The maximum results given in the list of replicated bots.
     * </p>
     * 
     * @param maxResults
     *        The maximum results given in the list of replicated bots.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum results given in the list of replicated bots.
     * </p>
     * 
     * @return The maximum results given in the list of replicated bots.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum results given in the list of replicated bots.
     * </p>
     * 
     * @param maxResults
     *        The maximum results given in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The next token given in the list of replicated bots.
     * </p>
     * 
     * @param nextToken
     *        The next token given in the list of replicated bots.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token given in the list of replicated bots.
     * </p>
     * 
     * @return The next token given in the list of replicated bots.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token given in the list of replicated bots.
     * </p>
     * 
     * @param nextToken
     *        The next token given in the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The requested sort category for the list of replicated bots.
     * </p>
     * 
     * @param sortBy
     *        The requested sort category for the list of replicated bots.
     */

    public void setSortBy(BotVersionReplicaSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The requested sort category for the list of replicated bots.
     * </p>
     * 
     * @return The requested sort category for the list of replicated bots.
     */

    public BotVersionReplicaSortBy getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The requested sort category for the list of replicated bots.
     * </p>
     * 
     * @param sortBy
     *        The requested sort category for the list of replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionReplicasRequest withSortBy(BotVersionReplicaSortBy sortBy) {
        setSortBy(sortBy);
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
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBotVersionReplicasRequest == false)
            return false;
        ListBotVersionReplicasRequest other = (ListBotVersionReplicasRequest) obj;
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
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
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
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        return hashCode;
    }

    @Override
    public ListBotVersionReplicasRequest clone() {
        return (ListBotVersionReplicasRequest) super.clone();
    }

}
