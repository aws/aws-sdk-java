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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeAgentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The agent IDs for which you want information. If you specify no IDs, the system returns information about all
     * agents associated with your AWS user account.
     * </p>
     */
    private java.util.List<String> agentIds;
    /**
     * <p>
     * The total number of agents to return. The maximum value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The agent IDs for which you want information. If you specify no IDs, the system returns information about all
     * agents associated with your AWS user account.
     * </p>
     * 
     * @return The agent IDs for which you want information. If you specify no IDs, the system returns information about
     *         all agents associated with your AWS user account.
     */

    public java.util.List<String> getAgentIds() {
        return agentIds;
    }

    /**
     * <p>
     * The agent IDs for which you want information. If you specify no IDs, the system returns information about all
     * agents associated with your AWS user account.
     * </p>
     * 
     * @param agentIds
     *        The agent IDs for which you want information. If you specify no IDs, the system returns information about
     *        all agents associated with your AWS user account.
     */

    public void setAgentIds(java.util.Collection<String> agentIds) {
        if (agentIds == null) {
            this.agentIds = null;
            return;
        }

        this.agentIds = new java.util.ArrayList<String>(agentIds);
    }

    /**
     * <p>
     * The agent IDs for which you want information. If you specify no IDs, the system returns information about all
     * agents associated with your AWS user account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentIds(java.util.Collection)} or {@link #withAgentIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param agentIds
     *        The agent IDs for which you want information. If you specify no IDs, the system returns information about
     *        all agents associated with your AWS user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsRequest withAgentIds(String... agentIds) {
        if (this.agentIds == null) {
            setAgentIds(new java.util.ArrayList<String>(agentIds.length));
        }
        for (String ele : agentIds) {
            this.agentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The agent IDs for which you want information. If you specify no IDs, the system returns information about all
     * agents associated with your AWS user account.
     * </p>
     * 
     * @param agentIds
     *        The agent IDs for which you want information. If you specify no IDs, the system returns information about
     *        all agents associated with your AWS user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsRequest withAgentIds(java.util.Collection<String> agentIds) {
        setAgentIds(agentIds);
        return this;
    }

    /**
     * <p>
     * The total number of agents to return. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The total number of agents to return. The maximum value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of agents to return. The maximum value is 100.
     * </p>
     * 
     * @return The total number of agents to return. The maximum value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of agents to return. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The total number of agents to return. The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsRequest withNextToken(String nextToken) {
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
        if (getAgentIds() != null)
            sb.append("AgentIds: " + getAgentIds() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
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

        if (obj instanceof DescribeAgentsRequest == false)
            return false;
        DescribeAgentsRequest other = (DescribeAgentsRequest) obj;
        if (other.getAgentIds() == null ^ this.getAgentIds() == null)
            return false;
        if (other.getAgentIds() != null && other.getAgentIds().equals(this.getAgentIds()) == false)
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

        hashCode = prime * hashCode + ((getAgentIds() == null) ? 0 : getAgentIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAgentsRequest clone() {
        return (DescribeAgentsRequest) super.clone();
    }
}
