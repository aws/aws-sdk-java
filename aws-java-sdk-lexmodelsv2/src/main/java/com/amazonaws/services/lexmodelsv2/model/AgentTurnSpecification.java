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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The specification of an agent turn.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AgentTurnSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentTurnSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The agent prompt for the agent turn in a test set.
     * </p>
     */
    private String agentPrompt;

    /**
     * <p>
     * The agent prompt for the agent turn in a test set.
     * </p>
     * 
     * @param agentPrompt
     *        The agent prompt for the agent turn in a test set.
     */

    public void setAgentPrompt(String agentPrompt) {
        this.agentPrompt = agentPrompt;
    }

    /**
     * <p>
     * The agent prompt for the agent turn in a test set.
     * </p>
     * 
     * @return The agent prompt for the agent turn in a test set.
     */

    public String getAgentPrompt() {
        return this.agentPrompt;
    }

    /**
     * <p>
     * The agent prompt for the agent turn in a test set.
     * </p>
     * 
     * @param agentPrompt
     *        The agent prompt for the agent turn in a test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentTurnSpecification withAgentPrompt(String agentPrompt) {
        setAgentPrompt(agentPrompt);
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
        if (getAgentPrompt() != null)
            sb.append("AgentPrompt: ").append(getAgentPrompt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentTurnSpecification == false)
            return false;
        AgentTurnSpecification other = (AgentTurnSpecification) obj;
        if (other.getAgentPrompt() == null ^ this.getAgentPrompt() == null)
            return false;
        if (other.getAgentPrompt() != null && other.getAgentPrompt().equals(this.getAgentPrompt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentPrompt() == null) ? 0 : getAgentPrompt().hashCode());
        return hashCode;
    }

    @Override
    public AgentTurnSpecification clone() {
        try {
            return (AgentTurnSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AgentTurnSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
