/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * ListAgentsResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListAgents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAgentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of agents in your account.
     * </p>
     */
    private java.util.List<AgentListEntry> agents;
    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of agents.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of agents in your account.
     * </p>
     * 
     * @return A list of agents in your account.
     */

    public java.util.List<AgentListEntry> getAgents() {
        return agents;
    }

    /**
     * <p>
     * A list of agents in your account.
     * </p>
     * 
     * @param agents
     *        A list of agents in your account.
     */

    public void setAgents(java.util.Collection<AgentListEntry> agents) {
        if (agents == null) {
            this.agents = null;
            return;
        }

        this.agents = new java.util.ArrayList<AgentListEntry>(agents);
    }

    /**
     * <p>
     * A list of agents in your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgents(java.util.Collection)} or {@link #withAgents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param agents
     *        A list of agents in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgentsResult withAgents(AgentListEntry... agents) {
        if (this.agents == null) {
            setAgents(new java.util.ArrayList<AgentListEntry>(agents.length));
        }
        for (AgentListEntry ele : agents) {
            this.agents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of agents in your account.
     * </p>
     * 
     * @param agents
     *        A list of agents in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgentsResult withAgents(java.util.Collection<AgentListEntry> agents) {
        setAgents(agents);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of agents.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin returning the next list of agents.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of agents.
     * </p>
     * 
     * @return An opaque string that indicates the position at which to begin returning the next list of agents.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin returning the next list of agents.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates the position at which to begin returning the next list of agents.
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
        if (getAgents() != null)
            sb.append("Agents: ").append(getAgents()).append(",");
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
        if (other.getAgents() == null ^ this.getAgents() == null)
            return false;
        if (other.getAgents() != null && other.getAgents().equals(this.getAgents()) == false)
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

        hashCode = prime * hashCode + ((getAgents() == null) ? 0 : getAgents().hashCode());
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
