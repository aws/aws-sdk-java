/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description of a profiling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ProfilingGroupDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfilingGroupDescription implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private AgentOrchestrationConfig agentOrchestrationConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the profiling group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the profiling group was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The name of the profiling group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the profiling group.
     * </p>
     */
    private ProfilingStatus profilingStatus;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the profiling group was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p/>
     * 
     * @param agentOrchestrationConfig
     */

    public void setAgentOrchestrationConfig(AgentOrchestrationConfig agentOrchestrationConfig) {
        this.agentOrchestrationConfig = agentOrchestrationConfig;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public AgentOrchestrationConfig getAgentOrchestrationConfig() {
        return this.agentOrchestrationConfig;
    }

    /**
     * <p/>
     * 
     * @param agentOrchestrationConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withAgentOrchestrationConfig(AgentOrchestrationConfig agentOrchestrationConfig) {
        setAgentOrchestrationConfig(agentOrchestrationConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the profiling group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) identifying the profiling group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the profiling group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) identifying the profiling group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the profiling group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) identifying the profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the profiling group was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the profiling group was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the profiling group was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the profiling group was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the profiling group was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the profiling group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @param name
     *        The name of the profiling group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @return The name of the profiling group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @param name
     *        The name of the profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the profiling group.
     * </p>
     * 
     * @param profilingStatus
     *        The status of the profiling group.
     */

    public void setProfilingStatus(ProfilingStatus profilingStatus) {
        this.profilingStatus = profilingStatus;
    }

    /**
     * <p>
     * The status of the profiling group.
     * </p>
     * 
     * @return The status of the profiling group.
     */

    public ProfilingStatus getProfilingStatus() {
        return this.profilingStatus;
    }

    /**
     * <p>
     * The status of the profiling group.
     * </p>
     * 
     * @param profilingStatus
     *        The status of the profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withProfilingStatus(ProfilingStatus profilingStatus) {
        setProfilingStatus(profilingStatus);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the profiling group was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time, in milliseconds since the epoch, when the profiling group was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the profiling group was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the profiling group was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the profiling group was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time, in milliseconds since the epoch, when the profiling group was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProfilingStatus() != null)
            sb.append("ProfilingStatus: ").append(getProfilingStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfilingGroupDescription == false)
            return false;
        ProfilingGroupDescription other = (ProfilingGroupDescription) obj;
        if (other.getAgentOrchestrationConfig() == null ^ this.getAgentOrchestrationConfig() == null)
            return false;
        if (other.getAgentOrchestrationConfig() != null && other.getAgentOrchestrationConfig().equals(this.getAgentOrchestrationConfig()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProfilingStatus() == null ^ this.getProfilingStatus() == null)
            return false;
        if (other.getProfilingStatus() != null && other.getProfilingStatus().equals(this.getProfilingStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentOrchestrationConfig() == null) ? 0 : getAgentOrchestrationConfig().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProfilingStatus() == null) ? 0 : getProfilingStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ProfilingGroupDescription clone() {
        try {
            return (ProfilingGroupDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.ProfilingGroupDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
