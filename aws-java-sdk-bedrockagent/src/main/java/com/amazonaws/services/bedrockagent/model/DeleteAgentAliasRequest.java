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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAgentAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the alias to delete.
     * </p>
     */
    private String agentAliasId;
    /**
     * <p>
     * The unique identifier of the agent that the alias belongs to.
     * </p>
     */
    private String agentId;

    /**
     * <p>
     * The unique identifier of the alias to delete.
     * </p>
     * 
     * @param agentAliasId
     *        The unique identifier of the alias to delete.
     */

    public void setAgentAliasId(String agentAliasId) {
        this.agentAliasId = agentAliasId;
    }

    /**
     * <p>
     * The unique identifier of the alias to delete.
     * </p>
     * 
     * @return The unique identifier of the alias to delete.
     */

    public String getAgentAliasId() {
        return this.agentAliasId;
    }

    /**
     * <p>
     * The unique identifier of the alias to delete.
     * </p>
     * 
     * @param agentAliasId
     *        The unique identifier of the alias to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAgentAliasRequest withAgentAliasId(String agentAliasId) {
        setAgentAliasId(agentAliasId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the agent that the alias belongs to.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent that the alias belongs to.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent that the alias belongs to.
     * </p>
     * 
     * @return The unique identifier of the agent that the alias belongs to.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent that the alias belongs to.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent that the alias belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAgentAliasRequest withAgentId(String agentId) {
        setAgentId(agentId);
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
        if (getAgentAliasId() != null)
            sb.append("AgentAliasId: ").append(getAgentAliasId()).append(",");
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAgentAliasRequest == false)
            return false;
        DeleteAgentAliasRequest other = (DeleteAgentAliasRequest) obj;
        if (other.getAgentAliasId() == null ^ this.getAgentAliasId() == null)
            return false;
        if (other.getAgentAliasId() != null && other.getAgentAliasId().equals(this.getAgentAliasId()) == false)
            return false;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentAliasId() == null) ? 0 : getAgentAliasId().hashCode());
        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAgentAliasRequest clone() {
        return (DeleteAgentAliasRequest) super.clone();
    }

}
