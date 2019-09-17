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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAgentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did
     * not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media access control
     * (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and the version number of
     * each agent/Connector.
     * </p>
     */
    private java.util.List<AgentInfo> agentsInfo;
    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you specified 100 IDs for
     * <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10, you
     * received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of
     * 10.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did
     * not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media access control
     * (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and the version number of
     * each agent/Connector.
     * </p>
     * 
     * @return Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if
     *         you did not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media
     *         access control (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and
     *         the version number of each agent/Connector.
     */

    public java.util.List<AgentInfo> getAgentsInfo() {
        return agentsInfo;
    }

    /**
     * <p>
     * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did
     * not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media access control
     * (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and the version number of
     * each agent/Connector.
     * </p>
     * 
     * @param agentsInfo
     *        Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if
     *        you did not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media
     *        access control (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and
     *        the version number of each agent/Connector.
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
     * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did
     * not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media access control
     * (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and the version number of
     * each agent/Connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentsInfo(java.util.Collection)} or {@link #withAgentsInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentsInfo
     *        Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if
     *        you did not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media
     *        access control (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and
     *        the version number of each agent/Connector.
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
     * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did
     * not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media access control
     * (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and the version number of
     * each agent/Connector.
     * </p>
     * 
     * @param agentsInfo
     *        Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if
     *        you did not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media
     *        access control (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and
     *        the version number of each agent/Connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsResult withAgentsInfo(java.util.Collection<AgentInfo> agentsInfo) {
        setAgentsInfo(agentsInfo);
        return this;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you specified 100 IDs for
     * <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10, you
     * received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of
     * 10.
     * </p>
     * 
     * @param nextToken
     *        Token to retrieve the next set of results. For example, if you specified 100 IDs for
     *        <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10,
     *        you received a set of 10 results along with this token. Use this token in the next query to retrieve the
     *        next set of 10.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you specified 100 IDs for
     * <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10, you
     * received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of
     * 10.
     * </p>
     * 
     * @return Token to retrieve the next set of results. For example, if you specified 100 IDs for
     *         <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10,
     *         you received a set of 10 results along with this token. Use this token in the next query to retrieve the
     *         next set of 10.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you specified 100 IDs for
     * <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10, you
     * received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of
     * 10.
     * </p>
     * 
     * @param nextToken
     *        Token to retrieve the next set of results. For example, if you specified 100 IDs for
     *        <code>DescribeAgentsRequest$agentIds</code> but set <code>DescribeAgentsRequest$maxResults</code> to 10,
     *        you received a set of 10 results along with this token. Use this token in the next query to retrieve the
     *        next set of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentsResult withNextToken(String nextToken) {
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
        if (getAgentsInfo() != null)
            sb.append("AgentsInfo: ").append(getAgentsInfo()).append(",");
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
