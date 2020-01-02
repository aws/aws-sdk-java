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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * DescribeAgentResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAgentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     */
    private String agentArn;
    /**
     * <p>
     * The name of the agent.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the agent. If the status is ONLINE, then the agent is configured properly and is available to use.
     * The Running status is the normal running status for an agent. If the status is OFFLINE, the agent's VM is turned
     * off or the agent is in an unhealthy state. When the issue that caused the unhealthy state is resolved, the agent
     * returns to ONLINE status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time that the agent last connected to DataSyc.
     * </p>
     */
    private java.util.Date lastConnectionTime;
    /**
     * <p>
     * The time that the agent was activated (that is, created in your account).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not
     * accessible over the public Internet.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The subnet and the security group that DataSync used to access a VPC endpoint.
     * </p>
     */
    private PrivateLinkConfig privateLinkConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent.
     */

    public void setAgentArn(String agentArn) {
        this.agentArn = agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agent.
     */

    public String getAgentArn() {
        return this.agentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent.
     * </p>
     * 
     * @param agentArn
     *        The Amazon Resource Name (ARN) of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentResult withAgentArn(String agentArn) {
        setAgentArn(agentArn);
        return this;
    }

    /**
     * <p>
     * The name of the agent.
     * </p>
     * 
     * @param name
     *        The name of the agent.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the agent.
     * </p>
     * 
     * @return The name of the agent.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the agent.
     * </p>
     * 
     * @param name
     *        The name of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the agent. If the status is ONLINE, then the agent is configured properly and is available to use.
     * The Running status is the normal running status for an agent. If the status is OFFLINE, the agent's VM is turned
     * off or the agent is in an unhealthy state. When the issue that caused the unhealthy state is resolved, the agent
     * returns to ONLINE status.
     * </p>
     * 
     * @param status
     *        The status of the agent. If the status is ONLINE, then the agent is configured properly and is available
     *        to use. The Running status is the normal running status for an agent. If the status is OFFLINE, the
     *        agent's VM is turned off or the agent is in an unhealthy state. When the issue that caused the unhealthy
     *        state is resolved, the agent returns to ONLINE status.
     * @see AgentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the agent. If the status is ONLINE, then the agent is configured properly and is available to use.
     * The Running status is the normal running status for an agent. If the status is OFFLINE, the agent's VM is turned
     * off or the agent is in an unhealthy state. When the issue that caused the unhealthy state is resolved, the agent
     * returns to ONLINE status.
     * </p>
     * 
     * @return The status of the agent. If the status is ONLINE, then the agent is configured properly and is available
     *         to use. The Running status is the normal running status for an agent. If the status is OFFLINE, the
     *         agent's VM is turned off or the agent is in an unhealthy state. When the issue that caused the unhealthy
     *         state is resolved, the agent returns to ONLINE status.
     * @see AgentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the agent. If the status is ONLINE, then the agent is configured properly and is available to use.
     * The Running status is the normal running status for an agent. If the status is OFFLINE, the agent's VM is turned
     * off or the agent is in an unhealthy state. When the issue that caused the unhealthy state is resolved, the agent
     * returns to ONLINE status.
     * </p>
     * 
     * @param status
     *        The status of the agent. If the status is ONLINE, then the agent is configured properly and is available
     *        to use. The Running status is the normal running status for an agent. If the status is OFFLINE, the
     *        agent's VM is turned off or the agent is in an unhealthy state. When the issue that caused the unhealthy
     *        state is resolved, the agent returns to ONLINE status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public DescribeAgentResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the agent. If the status is ONLINE, then the agent is configured properly and is available to use.
     * The Running status is the normal running status for an agent. If the status is OFFLINE, the agent's VM is turned
     * off or the agent is in an unhealthy state. When the issue that caused the unhealthy state is resolved, the agent
     * returns to ONLINE status.
     * </p>
     * 
     * @param status
     *        The status of the agent. If the status is ONLINE, then the agent is configured properly and is available
     *        to use. The Running status is the normal running status for an agent. If the status is OFFLINE, the
     *        agent's VM is turned off or the agent is in an unhealthy state. When the issue that caused the unhealthy
     *        state is resolved, the agent returns to ONLINE status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public DescribeAgentResult withStatus(AgentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time that the agent last connected to DataSyc.
     * </p>
     * 
     * @param lastConnectionTime
     *        The time that the agent last connected to DataSyc.
     */

    public void setLastConnectionTime(java.util.Date lastConnectionTime) {
        this.lastConnectionTime = lastConnectionTime;
    }

    /**
     * <p>
     * The time that the agent last connected to DataSyc.
     * </p>
     * 
     * @return The time that the agent last connected to DataSyc.
     */

    public java.util.Date getLastConnectionTime() {
        return this.lastConnectionTime;
    }

    /**
     * <p>
     * The time that the agent last connected to DataSyc.
     * </p>
     * 
     * @param lastConnectionTime
     *        The time that the agent last connected to DataSyc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentResult withLastConnectionTime(java.util.Date lastConnectionTime) {
        setLastConnectionTime(lastConnectionTime);
        return this;
    }

    /**
     * <p>
     * The time that the agent was activated (that is, created in your account).
     * </p>
     * 
     * @param creationTime
     *        The time that the agent was activated (that is, created in your account).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the agent was activated (that is, created in your account).
     * </p>
     * 
     * @return The time that the agent was activated (that is, created in your account).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the agent was activated (that is, created in your account).
     * </p>
     * 
     * @param creationTime
     *        The time that the agent was activated (that is, created in your account).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not
     * accessible over the public Internet.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not
     *        accessible over the public Internet.
     * @see EndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not
     * accessible over the public Internet.
     * </p>
     * 
     * @return The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not
     *         accessible over the public Internet.
     * @see EndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not
     * accessible over the public Internet.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not
     *        accessible over the public Internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public DescribeAgentResult withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not
     * accessible over the public Internet.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not
     *        accessible over the public Internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public DescribeAgentResult withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The subnet and the security group that DataSync used to access a VPC endpoint.
     * </p>
     * 
     * @param privateLinkConfig
     *        The subnet and the security group that DataSync used to access a VPC endpoint.
     */

    public void setPrivateLinkConfig(PrivateLinkConfig privateLinkConfig) {
        this.privateLinkConfig = privateLinkConfig;
    }

    /**
     * <p>
     * The subnet and the security group that DataSync used to access a VPC endpoint.
     * </p>
     * 
     * @return The subnet and the security group that DataSync used to access a VPC endpoint.
     */

    public PrivateLinkConfig getPrivateLinkConfig() {
        return this.privateLinkConfig;
    }

    /**
     * <p>
     * The subnet and the security group that DataSync used to access a VPC endpoint.
     * </p>
     * 
     * @param privateLinkConfig
     *        The subnet and the security group that DataSync used to access a VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgentResult withPrivateLinkConfig(PrivateLinkConfig privateLinkConfig) {
        setPrivateLinkConfig(privateLinkConfig);
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
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastConnectionTime() != null)
            sb.append("LastConnectionTime: ").append(getLastConnectionTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getPrivateLinkConfig() != null)
            sb.append("PrivateLinkConfig: ").append(getPrivateLinkConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAgentResult == false)
            return false;
        DescribeAgentResult other = (DescribeAgentResult) obj;
        if (other.getAgentArn() == null ^ this.getAgentArn() == null)
            return false;
        if (other.getAgentArn() != null && other.getAgentArn().equals(this.getAgentArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastConnectionTime() == null ^ this.getLastConnectionTime() == null)
            return false;
        if (other.getLastConnectionTime() != null && other.getLastConnectionTime().equals(this.getLastConnectionTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getPrivateLinkConfig() == null ^ this.getPrivateLinkConfig() == null)
            return false;
        if (other.getPrivateLinkConfig() != null && other.getPrivateLinkConfig().equals(this.getPrivateLinkConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentArn() == null) ? 0 : getAgentArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastConnectionTime() == null) ? 0 : getLastConnectionTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getPrivateLinkConfig() == null) ? 0 : getPrivateLinkConfig().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAgentResult clone() {
        try {
            return (DescribeAgentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
