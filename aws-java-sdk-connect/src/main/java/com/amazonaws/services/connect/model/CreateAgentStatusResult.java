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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateAgentStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAgentStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     */
    private String agentStatusARN;
    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     */
    private String agentStatusId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     * 
     * @param agentStatusARN
     *        The Amazon Resource Name (ARN) of the agent status.
     */

    public void setAgentStatusARN(String agentStatusARN) {
        this.agentStatusARN = agentStatusARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agent status.
     */

    public String getAgentStatusARN() {
        return this.agentStatusARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     * 
     * @param agentStatusARN
     *        The Amazon Resource Name (ARN) of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentStatusResult withAgentStatusARN(String agentStatusARN) {
        setAgentStatusARN(agentStatusARN);
        return this;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     * 
     * @param agentStatusId
     *        The identifier of the agent status.
     */

    public void setAgentStatusId(String agentStatusId) {
        this.agentStatusId = agentStatusId;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     * 
     * @return The identifier of the agent status.
     */

    public String getAgentStatusId() {
        return this.agentStatusId;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     * 
     * @param agentStatusId
     *        The identifier of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentStatusResult withAgentStatusId(String agentStatusId) {
        setAgentStatusId(agentStatusId);
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
        if (getAgentStatusARN() != null)
            sb.append("AgentStatusARN: ").append(getAgentStatusARN()).append(",");
        if (getAgentStatusId() != null)
            sb.append("AgentStatusId: ").append(getAgentStatusId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAgentStatusResult == false)
            return false;
        CreateAgentStatusResult other = (CreateAgentStatusResult) obj;
        if (other.getAgentStatusARN() == null ^ this.getAgentStatusARN() == null)
            return false;
        if (other.getAgentStatusARN() != null && other.getAgentStatusARN().equals(this.getAgentStatusARN()) == false)
            return false;
        if (other.getAgentStatusId() == null ^ this.getAgentStatusId() == null)
            return false;
        if (other.getAgentStatusId() != null && other.getAgentStatusId().equals(this.getAgentStatusId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentStatusARN() == null) ? 0 : getAgentStatusARN().hashCode());
        hashCode = prime * hashCode + ((getAgentStatusId() == null) ? 0 : getAgentStatusId().hashCode());
        return hashCode;
    }

    @Override
    public CreateAgentStatusResult clone() {
        try {
            return (CreateAgentStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
