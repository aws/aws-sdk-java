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
 * Contains information about the messages in the turn.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TurnSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TurnSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about the agent messages in the turn.
     * </p>
     */
    private AgentTurnSpecification agentTurn;
    /**
     * <p>
     * Contains information about the user messages in the turn.
     * </p>
     */
    private UserTurnSpecification userTurn;

    /**
     * <p>
     * Contains information about the agent messages in the turn.
     * </p>
     * 
     * @param agentTurn
     *        Contains information about the agent messages in the turn.
     */

    public void setAgentTurn(AgentTurnSpecification agentTurn) {
        this.agentTurn = agentTurn;
    }

    /**
     * <p>
     * Contains information about the agent messages in the turn.
     * </p>
     * 
     * @return Contains information about the agent messages in the turn.
     */

    public AgentTurnSpecification getAgentTurn() {
        return this.agentTurn;
    }

    /**
     * <p>
     * Contains information about the agent messages in the turn.
     * </p>
     * 
     * @param agentTurn
     *        Contains information about the agent messages in the turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TurnSpecification withAgentTurn(AgentTurnSpecification agentTurn) {
        setAgentTurn(agentTurn);
        return this;
    }

    /**
     * <p>
     * Contains information about the user messages in the turn.
     * </p>
     * 
     * @param userTurn
     *        Contains information about the user messages in the turn.
     */

    public void setUserTurn(UserTurnSpecification userTurn) {
        this.userTurn = userTurn;
    }

    /**
     * <p>
     * Contains information about the user messages in the turn.
     * </p>
     * 
     * @return Contains information about the user messages in the turn.
     */

    public UserTurnSpecification getUserTurn() {
        return this.userTurn;
    }

    /**
     * <p>
     * Contains information about the user messages in the turn.
     * </p>
     * 
     * @param userTurn
     *        Contains information about the user messages in the turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TurnSpecification withUserTurn(UserTurnSpecification userTurn) {
        setUserTurn(userTurn);
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
        if (getAgentTurn() != null)
            sb.append("AgentTurn: ").append(getAgentTurn()).append(",");
        if (getUserTurn() != null)
            sb.append("UserTurn: ").append(getUserTurn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TurnSpecification == false)
            return false;
        TurnSpecification other = (TurnSpecification) obj;
        if (other.getAgentTurn() == null ^ this.getAgentTurn() == null)
            return false;
        if (other.getAgentTurn() != null && other.getAgentTurn().equals(this.getAgentTurn()) == false)
            return false;
        if (other.getUserTurn() == null ^ this.getUserTurn() == null)
            return false;
        if (other.getUserTurn() != null && other.getUserTurn().equals(this.getUserTurn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentTurn() == null) ? 0 : getAgentTurn().hashCode());
        hashCode = prime * hashCode + ((getUserTurn() == null) ? 0 : getUserTurn().hashCode());
        return hashCode;
    }

    @Override
    public TurnSpecification clone() {
        try {
            return (TurnSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TurnSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
