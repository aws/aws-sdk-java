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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAgentAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains details about the alias that was created.
     * </p>
     */
    private AgentAlias agentAlias;

    /**
     * <p>
     * Contains details about the alias that was created.
     * </p>
     * 
     * @param agentAlias
     *        Contains details about the alias that was created.
     */

    public void setAgentAlias(AgentAlias agentAlias) {
        this.agentAlias = agentAlias;
    }

    /**
     * <p>
     * Contains details about the alias that was created.
     * </p>
     * 
     * @return Contains details about the alias that was created.
     */

    public AgentAlias getAgentAlias() {
        return this.agentAlias;
    }

    /**
     * <p>
     * Contains details about the alias that was created.
     * </p>
     * 
     * @param agentAlias
     *        Contains details about the alias that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentAliasResult withAgentAlias(AgentAlias agentAlias) {
        setAgentAlias(agentAlias);
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
        if (getAgentAlias() != null)
            sb.append("AgentAlias: ").append(getAgentAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAgentAliasResult == false)
            return false;
        CreateAgentAliasResult other = (CreateAgentAliasResult) obj;
        if (other.getAgentAlias() == null ^ this.getAgentAlias() == null)
            return false;
        if (other.getAgentAlias() != null && other.getAgentAlias().equals(this.getAgentAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentAlias() == null) ? 0 : getAgentAlias().hashCode());
        return hashCode;
    }

    @Override
    public CreateAgentAliasResult clone() {
        try {
            return (CreateAgentAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
