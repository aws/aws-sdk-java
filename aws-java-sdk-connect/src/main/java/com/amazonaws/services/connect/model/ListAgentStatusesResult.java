/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListAgentStatuses" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAgentStatusesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A summary of agent statuses.
     * </p>
     */
    private java.util.List<AgentStatusSummary> agentStatusSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgentStatusesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A summary of agent statuses.
     * </p>
     * 
     * @return A summary of agent statuses.
     */

    public java.util.List<AgentStatusSummary> getAgentStatusSummaryList() {
        return agentStatusSummaryList;
    }

    /**
     * <p>
     * A summary of agent statuses.
     * </p>
     * 
     * @param agentStatusSummaryList
     *        A summary of agent statuses.
     */

    public void setAgentStatusSummaryList(java.util.Collection<AgentStatusSummary> agentStatusSummaryList) {
        if (agentStatusSummaryList == null) {
            this.agentStatusSummaryList = null;
            return;
        }

        this.agentStatusSummaryList = new java.util.ArrayList<AgentStatusSummary>(agentStatusSummaryList);
    }

    /**
     * <p>
     * A summary of agent statuses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentStatusSummaryList(java.util.Collection)} or
     * {@link #withAgentStatusSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param agentStatusSummaryList
     *        A summary of agent statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgentStatusesResult withAgentStatusSummaryList(AgentStatusSummary... agentStatusSummaryList) {
        if (this.agentStatusSummaryList == null) {
            setAgentStatusSummaryList(new java.util.ArrayList<AgentStatusSummary>(agentStatusSummaryList.length));
        }
        for (AgentStatusSummary ele : agentStatusSummaryList) {
            this.agentStatusSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of agent statuses.
     * </p>
     * 
     * @param agentStatusSummaryList
     *        A summary of agent statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgentStatusesResult withAgentStatusSummaryList(java.util.Collection<AgentStatusSummary> agentStatusSummaryList) {
        setAgentStatusSummaryList(agentStatusSummaryList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getAgentStatusSummaryList() != null)
            sb.append("AgentStatusSummaryList: ").append(getAgentStatusSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAgentStatusesResult == false)
            return false;
        ListAgentStatusesResult other = (ListAgentStatusesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAgentStatusSummaryList() == null ^ this.getAgentStatusSummaryList() == null)
            return false;
        if (other.getAgentStatusSummaryList() != null && other.getAgentStatusSummaryList().equals(this.getAgentStatusSummaryList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAgentStatusSummaryList() == null) ? 0 : getAgentStatusSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public ListAgentStatusesResult clone() {
        try {
            return (ListAgentStatusesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
