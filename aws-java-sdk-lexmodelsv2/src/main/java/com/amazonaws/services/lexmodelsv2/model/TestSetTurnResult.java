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
 * Contains information about the results of the analysis of a turn in the test set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestSetTurnResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSetTurnResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about the agent messages in the turn.
     * </p>
     */
    private AgentTurnResult agent;
    /**
     * <p>
     * Contains information about the user messages in the turn.
     * </p>
     */
    private UserTurnResult user;

    /**
     * <p>
     * Contains information about the agent messages in the turn.
     * </p>
     * 
     * @param agent
     *        Contains information about the agent messages in the turn.
     */

    public void setAgent(AgentTurnResult agent) {
        this.agent = agent;
    }

    /**
     * <p>
     * Contains information about the agent messages in the turn.
     * </p>
     * 
     * @return Contains information about the agent messages in the turn.
     */

    public AgentTurnResult getAgent() {
        return this.agent;
    }

    /**
     * <p>
     * Contains information about the agent messages in the turn.
     * </p>
     * 
     * @param agent
     *        Contains information about the agent messages in the turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetTurnResult withAgent(AgentTurnResult agent) {
        setAgent(agent);
        return this;
    }

    /**
     * <p>
     * Contains information about the user messages in the turn.
     * </p>
     * 
     * @param user
     *        Contains information about the user messages in the turn.
     */

    public void setUser(UserTurnResult user) {
        this.user = user;
    }

    /**
     * <p>
     * Contains information about the user messages in the turn.
     * </p>
     * 
     * @return Contains information about the user messages in the turn.
     */

    public UserTurnResult getUser() {
        return this.user;
    }

    /**
     * <p>
     * Contains information about the user messages in the turn.
     * </p>
     * 
     * @param user
     *        Contains information about the user messages in the turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetTurnResult withUser(UserTurnResult user) {
        setUser(user);
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
        if (getAgent() != null)
            sb.append("Agent: ").append(getAgent()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestSetTurnResult == false)
            return false;
        TestSetTurnResult other = (TestSetTurnResult) obj;
        if (other.getAgent() == null ^ this.getAgent() == null)
            return false;
        if (other.getAgent() != null && other.getAgent().equals(this.getAgent()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgent() == null) ? 0 : getAgent().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public TestSetTurnResult clone() {
        try {
            return (TestSetTurnResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestSetTurnResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
