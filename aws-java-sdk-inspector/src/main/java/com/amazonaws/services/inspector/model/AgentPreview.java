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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used as a response element in the <a>PreviewAgents</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AgentPreview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentPreview implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The ID of the EC2 instance where the agent is installed.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The Auto Scaling group for the EC2 instance where the agent is installed.
     * </p>
     */
    private String autoScalingGroup;
    /**
     * <p>
     * The health status of the Amazon Inspector Agent.
     * </p>
     */
    private String agentHealth;
    /**
     * <p>
     * The version of the Amazon Inspector Agent.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent is
     * installed.
     * </p>
     */
    private String kernelVersion;
    /**
     * <p>
     * The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     */
    private String ipv4Address;

    /**
     * <p>
     * The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     * 
     * @param hostname
     *        The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     * 
     * @return The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     * 
     * @param hostname
     *        The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentPreview withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param agentId
     *        The ID of the EC2 instance where the agent is installed.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The ID of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @return The ID of the EC2 instance where the agent is installed.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The ID of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param agentId
     *        The ID of the EC2 instance where the agent is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentPreview withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The Auto Scaling group for the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param autoScalingGroup
     *        The Auto Scaling group for the EC2 instance where the agent is installed.
     */

    public void setAutoScalingGroup(String autoScalingGroup) {
        this.autoScalingGroup = autoScalingGroup;
    }

    /**
     * <p>
     * The Auto Scaling group for the EC2 instance where the agent is installed.
     * </p>
     * 
     * @return The Auto Scaling group for the EC2 instance where the agent is installed.
     */

    public String getAutoScalingGroup() {
        return this.autoScalingGroup;
    }

    /**
     * <p>
     * The Auto Scaling group for the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param autoScalingGroup
     *        The Auto Scaling group for the EC2 instance where the agent is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentPreview withAutoScalingGroup(String autoScalingGroup) {
        setAutoScalingGroup(autoScalingGroup);
        return this;
    }

    /**
     * <p>
     * The health status of the Amazon Inspector Agent.
     * </p>
     * 
     * @param agentHealth
     *        The health status of the Amazon Inspector Agent.
     * @see AgentHealth
     */

    public void setAgentHealth(String agentHealth) {
        this.agentHealth = agentHealth;
    }

    /**
     * <p>
     * The health status of the Amazon Inspector Agent.
     * </p>
     * 
     * @return The health status of the Amazon Inspector Agent.
     * @see AgentHealth
     */

    public String getAgentHealth() {
        return this.agentHealth;
    }

    /**
     * <p>
     * The health status of the Amazon Inspector Agent.
     * </p>
     * 
     * @param agentHealth
     *        The health status of the Amazon Inspector Agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentHealth
     */

    public AgentPreview withAgentHealth(String agentHealth) {
        setAgentHealth(agentHealth);
        return this;
    }

    /**
     * <p>
     * The health status of the Amazon Inspector Agent.
     * </p>
     * 
     * @param agentHealth
     *        The health status of the Amazon Inspector Agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentHealth
     */

    public AgentPreview withAgentHealth(AgentHealth agentHealth) {
        this.agentHealth = agentHealth.toString();
        return this;
    }

    /**
     * <p>
     * The version of the Amazon Inspector Agent.
     * </p>
     * 
     * @param agentVersion
     *        The version of the Amazon Inspector Agent.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of the Amazon Inspector Agent.
     * </p>
     * 
     * @return The version of the Amazon Inspector Agent.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of the Amazon Inspector Agent.
     * </p>
     * 
     * @param agentVersion
     *        The version of the Amazon Inspector Agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentPreview withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     * 
     * @return The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentPreview withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent is
     * installed.
     * </p>
     * 
     * @param kernelVersion
     *        The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent
     *        is installed.
     */

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    /**
     * <p>
     * The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent is
     * installed.
     * </p>
     * 
     * @return The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector
     *         Agent is installed.
     */

    public String getKernelVersion() {
        return this.kernelVersion;
    }

    /**
     * <p>
     * The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent is
     * installed.
     * </p>
     * 
     * @param kernelVersion
     *        The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent
     *        is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentPreview withKernelVersion(String kernelVersion) {
        setKernelVersion(kernelVersion);
        return this;
    }

    /**
     * <p>
     * The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     * 
     * @param ipv4Address
     *        The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
     */

    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    /**
     * <p>
     * The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     * 
     * @return The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
     */

    public String getIpv4Address() {
        return this.ipv4Address;
    }

    /**
     * <p>
     * The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
     * </p>
     * 
     * @param ipv4Address
     *        The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentPreview withIpv4Address(String ipv4Address) {
        setIpv4Address(ipv4Address);
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
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getAutoScalingGroup() != null)
            sb.append("AutoScalingGroup: ").append(getAutoScalingGroup()).append(",");
        if (getAgentHealth() != null)
            sb.append("AgentHealth: ").append(getAgentHealth()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getKernelVersion() != null)
            sb.append("KernelVersion: ").append(getKernelVersion()).append(",");
        if (getIpv4Address() != null)
            sb.append("Ipv4Address: ").append(getIpv4Address());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentPreview == false)
            return false;
        AgentPreview other = (AgentPreview) obj;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAutoScalingGroup() == null ^ this.getAutoScalingGroup() == null)
            return false;
        if (other.getAutoScalingGroup() != null && other.getAutoScalingGroup().equals(this.getAutoScalingGroup()) == false)
            return false;
        if (other.getAgentHealth() == null ^ this.getAgentHealth() == null)
            return false;
        if (other.getAgentHealth() != null && other.getAgentHealth().equals(this.getAgentHealth()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getKernelVersion() == null ^ this.getKernelVersion() == null)
            return false;
        if (other.getKernelVersion() != null && other.getKernelVersion().equals(this.getKernelVersion()) == false)
            return false;
        if (other.getIpv4Address() == null ^ this.getIpv4Address() == null)
            return false;
        if (other.getIpv4Address() != null && other.getIpv4Address().equals(this.getIpv4Address()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroup() == null) ? 0 : getAutoScalingGroup().hashCode());
        hashCode = prime * hashCode + ((getAgentHealth() == null) ? 0 : getAgentHealth().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getKernelVersion() == null) ? 0 : getKernelVersion().hashCode());
        hashCode = prime * hashCode + ((getIpv4Address() == null) ? 0 : getIpv4Address().hashCode());
        return hashCode;
    }

    @Override
    public AgentPreview clone() {
        try {
            return (AgentPreview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.AgentPreviewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
