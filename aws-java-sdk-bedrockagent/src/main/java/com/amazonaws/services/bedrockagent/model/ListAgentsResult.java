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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAgentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects, each of which contains information about an agent.
     * </p>
     */
    private java.util.List<AgentSummary> agentSummaries;
    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects, each of which contains information about an agent.
     * </p>
     * 
     * @return A list of objects, each of which contains information about an agent.
     */

    public java.util.List<AgentSummary> getAgentSummaries() {
        return agentSummaries;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an agent.
     * </p>
     * 
     * @param agentSummaries
     *        A list of objects, each of which contains information about an agent.
     */

    public void setAgentSummaries(java.util.Collection<AgentSummary> agentSummaries) {
        if (agentSummaries == null) {
            this.agentSummaries = null;
            return;
        }

        this.agentSummaries = new java.util.ArrayList<AgentSummary>(agentSummaries);
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentSummaries(java.util.Collection)} or {@link #withAgentSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param agentSummaries
     *        A list of objects, each of which contains information about an agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgentsResult withAgentSummaries(AgentSummary... agentSummaries) {
        if (this.agentSummaries == null) {
            setAgentSummaries(new java.util.ArrayList<AgentSummary>(agentSummaries.length));
        }
        for (AgentSummary ele : agentSummaries) {
            this.agentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an agent.
     * </p>
     * 
     * @param agentSummaries
     *        A list of objects, each of which contains information about an agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgentsResult withAgentSummaries(java.util.Collection<AgentSummary> agentSummaries) {
        setAgentSummaries(agentSummaries);
        return this;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        use this token when making another request in the <code>nextToken</code> field to return the next batch of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @return If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *         use this token when making another request in the <code>nextToken</code> field to return the next batch
     *         of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        use this token when making another request in the <code>nextToken</code> field to return the next batch of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgentsResult withNextToken(String nextToken) {
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
        if (getAgentSummaries() != null)
            sb.append("AgentSummaries: ").append(getAgentSummaries()).append(",");
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

        if (obj instanceof ListAgentsResult == false)
            return false;
        ListAgentsResult other = (ListAgentsResult) obj;
        if (other.getAgentSummaries() == null ^ this.getAgentSummaries() == null)
            return false;
        if (other.getAgentSummaries() != null && other.getAgentSummaries().equals(this.getAgentSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAgentSummaries() == null) ? 0 : getAgentSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAgentsResult clone() {
        try {
            return (ListAgentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
