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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAgentVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects, each of which contains information about a version of the agent.
     * </p>
     */
    private java.util.List<AgentVersionSummary> agentVersionSummaries;
    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects, each of which contains information about a version of the agent.
     * </p>
     * 
     * @return A list of objects, each of which contains information about a version of the agent.
     */

    public java.util.List<AgentVersionSummary> getAgentVersionSummaries() {
        return agentVersionSummaries;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a version of the agent.
     * </p>
     * 
     * @param agentVersionSummaries
     *        A list of objects, each of which contains information about a version of the agent.
     */

    public void setAgentVersionSummaries(java.util.Collection<AgentVersionSummary> agentVersionSummaries) {
        if (agentVersionSummaries == null) {
            this.agentVersionSummaries = null;
            return;
        }

        this.agentVersionSummaries = new java.util.ArrayList<AgentVersionSummary>(agentVersionSummaries);
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a version of the agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentVersionSummaries(java.util.Collection)} or
     * {@link #withAgentVersionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param agentVersionSummaries
     *        A list of objects, each of which contains information about a version of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgentVersionsResult withAgentVersionSummaries(AgentVersionSummary... agentVersionSummaries) {
        if (this.agentVersionSummaries == null) {
            setAgentVersionSummaries(new java.util.ArrayList<AgentVersionSummary>(agentVersionSummaries.length));
        }
        for (AgentVersionSummary ele : agentVersionSummaries) {
            this.agentVersionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a version of the agent.
     * </p>
     * 
     * @param agentVersionSummaries
     *        A list of objects, each of which contains information about a version of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgentVersionsResult withAgentVersionSummaries(java.util.Collection<AgentVersionSummary> agentVersionSummaries) {
        setAgentVersionSummaries(agentVersionSummaries);
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

    public ListAgentVersionsResult withNextToken(String nextToken) {
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
        if (getAgentVersionSummaries() != null)
            sb.append("AgentVersionSummaries: ").append(getAgentVersionSummaries()).append(",");
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

        if (obj instanceof ListAgentVersionsResult == false)
            return false;
        ListAgentVersionsResult other = (ListAgentVersionsResult) obj;
        if (other.getAgentVersionSummaries() == null ^ this.getAgentVersionSummaries() == null)
            return false;
        if (other.getAgentVersionSummaries() != null && other.getAgentVersionSummaries().equals(this.getAgentVersionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAgentVersionSummaries() == null) ? 0 : getAgentVersionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAgentVersionsResult clone() {
        try {
            return (ListAgentVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
