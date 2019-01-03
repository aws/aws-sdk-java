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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * DeleteAgentRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAgentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent to delete. Use the <code>ListAgents</code> operation to return a list
     * of agents for your account and AWS Region.
     * </p>
     */
    private String agentArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent to delete. Use the <code>ListAgents</code> operation to return a list
     * of agents for your account and AWS Region.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent to delete. Use the <code>ListAgents</code> operation to return
     *        a list of agents for your account and AWS Region.
     */

    public void setAgentArn(String agentArn) {
        this.agentArn = agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent to delete. Use the <code>ListAgents</code> operation to return a list
     * of agents for your account and AWS Region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agent to delete. Use the <code>ListAgents</code> operation to
     *         return a list of agents for your account and AWS Region.
     */

    public String getAgentArn() {
        return this.agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent to delete. Use the <code>ListAgents</code> operation to return a list
     * of agents for your account and AWS Region.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent to delete. Use the <code>ListAgents</code> operation to return
     *        a list of agents for your account and AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAgentRequest withAgentArn(String agentArn) {
        setAgentArn(agentArn);
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
        if (getAgentArn() != null)
            sb.append("AgentArn: ").append(getAgentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAgentRequest == false)
            return false;
        DeleteAgentRequest other = (DeleteAgentRequest) obj;
        if (other.getAgentArn() == null ^ this.getAgentArn() == null)
            return false;
        if (other.getAgentArn() != null && other.getAgentArn().equals(this.getAgentArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentArn() == null) ? 0 : getAgentArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAgentRequest clone() {
        return (DeleteAgentRequest) super.clone();
    }

}
