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
 * UpdateAgentRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAgentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent to update.
     * </p>
     */
    private String agentArn;
    /**
     * <p>
     * The name that you want to use to configure the agent.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent to update.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent to update.
     */

    public void setAgentArn(String agentArn) {
        this.agentArn = agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agent to update.
     */

    public String getAgentArn() {
        return this.agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent to update.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withAgentArn(String agentArn) {
        setAgentArn(agentArn);
        return this;
    }

    /**
     * <p>
     * The name that you want to use to configure the agent.
     * </p>
     * 
     * @param name
     *        The name that you want to use to configure the agent.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you want to use to configure the agent.
     * </p>
     * 
     * @return The name that you want to use to configure the agent.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you want to use to configure the agent.
     * </p>
     * 
     * @param name
     *        The name that you want to use to configure the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withName(String name) {
        setName(name);
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
            sb.append("AgentArn: ").append(getAgentArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAgentRequest == false)
            return false;
        UpdateAgentRequest other = (UpdateAgentRequest) obj;
        if (other.getAgentArn() == null ^ this.getAgentArn() == null)
            return false;
        if (other.getAgentArn() != null && other.getAgentArn().equals(this.getAgentArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentArn() == null) ? 0 : getAgentArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAgentRequest clone() {
        return (UpdateAgentRequest) super.clone();
    }

}
