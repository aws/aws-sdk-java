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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/PreviewAgents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PreviewAgentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resulting list of agents.
     * </p>
     */
    private java.util.List<AgentPreview> agentPreviews;
    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
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

    public java.util.List<AgentPreview> getAgentPreviews() {
        return agentPreviews;
    }

    /**
     * <p>
     * The resulting list of agents.
     * </p>
     * 
     * @param agentPreviews
     *        The resulting list of agents.
     */

    public void setAgentPreviews(java.util.Collection<AgentPreview> agentPreviews) {
        if (agentPreviews == null) {
            this.agentPreviews = null;
            return;
        }

        this.agentPreviews = new java.util.ArrayList<AgentPreview>(agentPreviews);
    }

    /**
     * <p>
     * The resulting list of agents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentPreviews(java.util.Collection)} or {@link #withAgentPreviews(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param agentPreviews
     *        The resulting list of agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreviewAgentsResult withAgentPreviews(AgentPreview... agentPreviews) {
        if (this.agentPreviews == null) {
            setAgentPreviews(new java.util.ArrayList<AgentPreview>(agentPreviews.length));
        }
        for (AgentPreview ele : agentPreviews) {
            this.agentPreviews.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resulting list of agents.
     * </p>
     * 
     * @param agentPreviews
     *        The resulting list of agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreviewAgentsResult withAgentPreviews(java.util.Collection<AgentPreview> agentPreviews) {
        setAgentPreviews(agentPreviews);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed, this parameter is present in the
     *        response and contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination
     *        request. If there is no more data to be listed, this parameter is set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @return When a response is generated, if there is more data to be listed, this parameter is present in the
     *         response and contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination
     *         request. If there is no more data to be listed, this parameter is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed, this parameter is present in the
     *        response and contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination
     *        request. If there is no more data to be listed, this parameter is set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreviewAgentsResult withNextToken(String nextToken) {
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
        if (getAgentPreviews() != null)
            sb.append("AgentPreviews: ").append(getAgentPreviews()).append(",");
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

        if (obj instanceof PreviewAgentsResult == false)
            return false;
        PreviewAgentsResult other = (PreviewAgentsResult) obj;
        if (other.getAgentPreviews() == null ^ this.getAgentPreviews() == null)
            return false;
        if (other.getAgentPreviews() != null && other.getAgentPreviews().equals(this.getAgentPreviews()) == false)
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

        hashCode = prime * hashCode + ((getAgentPreviews() == null) ? 0 : getAgentPreviews().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public PreviewAgentsResult clone() {
        try {
            return (PreviewAgentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
