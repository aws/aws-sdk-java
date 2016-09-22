/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeAgentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an agent ID.
     * The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent health, host name where
     * the agent resides, and the version number of each agent.
     * </p>
     */
    private java.util.List<AgentInfo> agentsInfo;
    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an agent ID.
     * The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent health, host name where
     * the agent resides, and the version number of each agent.
     * </p>
     * 
     * @return Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an
     *         agent ID. The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent
     *         health, host name where the agent resides, and the version number of each agent.
     */

    public java.util.List<AgentInfo> getAgentsInfo() {
        return agentsInfo;
    }

    /**
     * <p>
     * Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an agent ID.
     * The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent health, host name where
     * the agent resides, and the version number of each agent.
     * </p>
     * 
     * @param agentsInfo
     *        Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an
     *        agent ID. The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent health,
     *        host name where the agent resides, and the version number of each agent.
     */

    public void setAgentsInfo(java.util.Collection<AgentInfo> agentsInfo) {
        if (agentsInfo == null) {
            this.agentsInfo = null;
            return;
        }

        this.agentsInfo = new java.util.ArrayList<AgentInfo>(agentsInfo);
    }

    /**
     * <p>
     * Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an agent ID.
     * The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent health, host name where
     * the agent resides, and the version number of each agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentsInfo(java.util.Collection)} or {@link #withAgentsInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentsInfo
     *        Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an
     *        agent ID. The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent health,
     *        host name where the agent resides, and the version number of each agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsResult withAgentsInfo(AgentInfo... agentsInfo) {
        if (this.agentsInfo == null) {
            setAgentsInfo(new java.util.ArrayList<AgentInfo>(agentsInfo.length));
        }
        for (AgentInfo ele : agentsInfo) {
            this.agentsInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an agent ID.
     * The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent health, host name where
     * the agent resides, and the version number of each agent.
     * </p>
     * 
     * @param agentsInfo
     *        Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an
     *        agent ID. The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent health,
     *        host name where the agent resides, and the version number of each agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsResult withAgentsInfo(java.util.Collection<AgentInfo> agentsInfo) {
        setAgentsInfo(agentsInfo);
        return this;
    }

    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The call returns a token. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     * 
     * @return The call returns a token. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The call returns a token. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAgentsInfo() != null)
            sb.append("AgentsInfo: " + getAgentsInfo() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAgentsResult == false)
            return false;
        DescribeAgentsResult other = (DescribeAgentsResult) obj;
        if (other.getAgentsInfo() == null ^ this.getAgentsInfo() == null)
            return false;
        if (other.getAgentsInfo() != null && other.getAgentsInfo().equals(this.getAgentsInfo()) == false)
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

        hashCode = prime * hashCode + ((getAgentsInfo() == null) ? 0 : getAgentsInfo().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAgentsResult clone() {
        try {
            return (DescribeAgentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
