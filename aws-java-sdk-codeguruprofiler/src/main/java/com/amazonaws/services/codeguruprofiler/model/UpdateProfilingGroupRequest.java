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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request for UpdateProfilingGroup operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/UpdateProfilingGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProfilingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Remote configuration to configure the agents of the profiling group.
     * </p>
     */
    private AgentOrchestrationConfig agentOrchestrationConfig;

    private String profilingGroupName;

    /**
     * <p>
     * Remote configuration to configure the agents of the profiling group.
     * </p>
     * 
     * @param agentOrchestrationConfig
     *        Remote configuration to configure the agents of the profiling group.
     */

    public void setAgentOrchestrationConfig(AgentOrchestrationConfig agentOrchestrationConfig) {
        this.agentOrchestrationConfig = agentOrchestrationConfig;
    }

    /**
     * <p>
     * Remote configuration to configure the agents of the profiling group.
     * </p>
     * 
     * @return Remote configuration to configure the agents of the profiling group.
     */

    public AgentOrchestrationConfig getAgentOrchestrationConfig() {
        return this.agentOrchestrationConfig;
    }

    /**
     * <p>
     * Remote configuration to configure the agents of the profiling group.
     * </p>
     * 
     * @param agentOrchestrationConfig
     *        Remote configuration to configure the agents of the profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfilingGroupRequest withAgentOrchestrationConfig(AgentOrchestrationConfig agentOrchestrationConfig) {
        setAgentOrchestrationConfig(agentOrchestrationConfig);
        return this;
    }

    /**
     * @param profilingGroupName
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * @return
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * @param profilingGroupName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfilingGroupRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
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
        if (getAgentOrchestrationConfig() != null)
            sb.append("AgentOrchestrationConfig: ").append(getAgentOrchestrationConfig()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProfilingGroupRequest == false)
            return false;
        UpdateProfilingGroupRequest other = (UpdateProfilingGroupRequest) obj;
        if (other.getAgentOrchestrationConfig() == null ^ this.getAgentOrchestrationConfig() == null)
            return false;
        if (other.getAgentOrchestrationConfig() != null && other.getAgentOrchestrationConfig().equals(this.getAgentOrchestrationConfig()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentOrchestrationConfig() == null) ? 0 : getAgentOrchestrationConfig().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProfilingGroupRequest clone() {
        return (UpdateProfilingGroupRequest) super.clone();
    }

}
