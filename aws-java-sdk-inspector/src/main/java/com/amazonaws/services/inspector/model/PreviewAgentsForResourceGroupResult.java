/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * 
 */
public class PreviewAgentsForResourceGroupResult implements Serializable,
        Cloneable {

    /**
     * <p>
     * The resulting list of agents.
     * </p>
     */
    private java.util.List<AgentPreview> agentPreviewList;
    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The resulting list of agents.
     * </p>
     * 
     * @return The resulting list of agents.
     */
    public java.util.List<AgentPreview> getAgentPreviewList() {
        return agentPreviewList;
    }

    /**
     * <p>
     * The resulting list of agents.
     * </p>
     * 
     * @param agentPreviewList
     *        The resulting list of agents.
     */
    public void setAgentPreviewList(
            java.util.Collection<AgentPreview> agentPreviewList) {
        if (agentPreviewList == null) {
            this.agentPreviewList = null;
            return;
        }

        this.agentPreviewList = new java.util.ArrayList<AgentPreview>(
                agentPreviewList);
    }

    /**
     * <p>
     * The resulting list of agents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAgentPreviewList(java.util.Collection)} or
     * {@link #withAgentPreviewList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentPreviewList
     *        The resulting list of agents.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PreviewAgentsForResourceGroupResult withAgentPreviewList(
            AgentPreview... agentPreviewList) {
        if (this.agentPreviewList == null) {
            setAgentPreviewList(new java.util.ArrayList<AgentPreview>(
                    agentPreviewList.length));
        }
        for (AgentPreview ele : agentPreviewList) {
            this.agentPreviewList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resulting list of agents.
     * </p>
     * 
     * @param agentPreviewList
     *        The resulting list of agents.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PreviewAgentsForResourceGroupResult withAgentPreviewList(
            java.util.Collection<AgentPreview> agentPreviewList) {
        setAgentPreviewList(agentPreviewList);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed,
     *        this parameter is present in the response and contains the value
     *        to use for the <b>nextToken</b> parameter in a subsequent
     *        pagination request. If there is no more data to be listed, this
     *        parameter is set to 'null'.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     * 
     * @return When a response is generated, if there is more data to be listed,
     *         this parameter is present in the response and contains the value
     *         to use for the <b>nextToken</b> parameter in a subsequent
     *         pagination request. If there is no more data to be listed, this
     *         parameter is set to 'null'.
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed,
     *        this parameter is present in the response and contains the value
     *        to use for the <b>nextToken</b> parameter in a subsequent
     *        pagination request. If there is no more data to be listed, this
     *        parameter is set to 'null'.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PreviewAgentsForResourceGroupResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAgentPreviewList() != null)
            sb.append("AgentPreviewList: " + getAgentPreviewList() + ",");
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

        if (obj instanceof PreviewAgentsForResourceGroupResult == false)
            return false;
        PreviewAgentsForResourceGroupResult other = (PreviewAgentsForResourceGroupResult) obj;
        if (other.getAgentPreviewList() == null
                ^ this.getAgentPreviewList() == null)
            return false;
        if (other.getAgentPreviewList() != null
                && other.getAgentPreviewList().equals(
                        this.getAgentPreviewList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAgentPreviewList() == null) ? 0 : getAgentPreviewList()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public PreviewAgentsForResourceGroupResult clone() {
        try {
            return (PreviewAgentsForResourceGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}