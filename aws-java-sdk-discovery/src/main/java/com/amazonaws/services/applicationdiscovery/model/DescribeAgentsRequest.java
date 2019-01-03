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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAgentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns
     * information about all agents/Connectors associated with your AWS user account.
     * </p>
     */
    private java.util.List<String> agentIds;
    /**
     * <p>
     * You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "collectionStatus", "value": "STARTED"}</code>
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The total number of agents/Connectors to return in a single page of output. The maximum value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     * <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10, you
     * received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns
     * information about all agents/Connectors associated with your AWS user account.
     * </p>
     * 
     * @return The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns
     *         information about all agents/Connectors associated with your AWS user account.
     */

    public java.util.List<String> getAgentIds() {
        return agentIds;
    }

    /**
     * <p>
     * The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns
     * information about all agents/Connectors associated with your AWS user account.
     * </p>
     * 
     * @param agentIds
     *        The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns
     *        information about all agents/Connectors associated with your AWS user account.
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
     * The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns
     * information about all agents/Connectors associated with your AWS user account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentIds(java.util.Collection)} or {@link #withAgentIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param agentIds
     *        The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns
     *        information about all agents/Connectors associated with your AWS user account.
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
     * The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns
     * information about all agents/Connectors associated with your AWS user account.
     * </p>
     * 
     * @param agentIds
     *        The agent or the Connector IDs for which you want information. If you specify no IDs, the system returns
     *        information about all agents/Connectors associated with your AWS user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsRequest withAgentIds(java.util.Collection<String> agentIds) {
        setAgentIds(agentIds);
        return this;
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "collectionStatus", "value": "STARTED"}</code>
     * </p>
     * 
     * @return You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For
     *         example: </p>
     *         <p>
     *         <code>{"key": "collectionStatus", "value": "STARTED"}</code>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "collectionStatus", "value": "STARTED"}</code>
     * </p>
     * 
     * @param filters
     *        You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For
     *        example: </p>
     *        <p>
     *        <code>{"key": "collectionStatus", "value": "STARTED"}</code>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "collectionStatus", "value": "STARTED"}</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For
     *        example: </p>
     *        <p>
     *        <code>{"key": "collectionStatus", "value": "STARTED"}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "collectionStatus", "value": "STARTED"}</code>
     * </p>
     * 
     * @param filters
     *        You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For
     *        example: </p>
     *        <p>
     *        <code>{"key": "collectionStatus", "value": "STARTED"}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The total number of agents/Connectors to return in a single page of output. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The total number of agents/Connectors to return in a single page of output. The maximum value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of agents/Connectors to return in a single page of output. The maximum value is 100.
     * </p>
     * 
     * @return The total number of agents/Connectors to return in a single page of output. The maximum value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of agents/Connectors to return in a single page of output. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The total number of agents/Connectors to return in a single page of output. The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     * <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10, you
     * received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     *        <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10,
     *        you received a set of 10 results along with a token. Use that token in this query to get the next set of
     *        10.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     * <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10, you
     * received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
     * </p>
     * 
     * @return Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     *         <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10,
     *         you received a set of 10 results along with a token. Use that token in this query to get the next set of
     *         10.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     * <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10, you
     * received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        Token to retrieve the next set of results. For example, if you previously specified 100 IDs for
     *        <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10,
     *        you received a set of 10 results along with a token. Use that token in this query to get the next set of
     *        10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsRequest withNextToken(String nextToken) {
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
        if (getAgentIds() != null)
            sb.append("AgentIds: ").append(getAgentIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeAgentsRequest == false)
            return false;
        DescribeAgentsRequest other = (DescribeAgentsRequest) obj;
        if (other.getAgentIds() == null ^ this.getAgentIds() == null)
            return false;
        if (other.getAgentIds() != null && other.getAgentIds().equals(this.getAgentIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAgentsRequest clone() {
        return (DescribeAgentsRequest) super.clone();
    }

}
