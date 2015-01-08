/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * An Amazon EC2 instance that is running the Amazon ECS agent and has
 * been registered with a cluster.
 * </p>
 */
public class ContainerInstance implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the container instance, the AWS account ID of the container
     * instance owner, the <code>container-instance</code> namespace, and
     * then the container instance UUID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     */
    private String containerInstanceArn;

    /**
     * The Amazon EC2 instance ID of the container instance.
     */
    private String ec2InstanceId;

    /**
     * The remaining resources of the container instance that are available
     * for new tasks.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Resource> remainingResources;

    /**
     * The registered resources on the container instance that are in use by
     * current tasks.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Resource> registeredResources;

    /**
     * The status of the container instance. The valid values are
     * <code>ACTIVE</code> or <code>INACTIVE</code>. <code>ACTIVE</code>
     * indicates that the container instance can accept tasks.
     */
    private String status;

    /**
     * This parameter returns <code>true</code> if the agent is actually
     * connected to Amazon ECS. Registered instances with an agent that may
     * be unhealthy or stopped will return <code>false</code>, and instances
     * without a connected agent cannot accept placement request.
     */
    private Boolean agentConnected;

    /**
     * The Amazon Resource Name (ARN) of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the container instance, the AWS account ID of the container
     * instance owner, the <code>container-instance</code> namespace, and
     * then the container instance UUID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     *
     * @return The Amazon Resource Name (ARN) of the container instance. The ARN
     *         contains the <code>arn:aws:ecs</code> namespace, followed by the
     *         region of the container instance, the AWS account ID of the container
     *         instance owner, the <code>container-instance</code> namespace, and
     *         then the container instance UUID. For example,
     *         arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     */
    public String getContainerInstanceArn() {
        return containerInstanceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the container instance, the AWS account ID of the container
     * instance owner, the <code>container-instance</code> namespace, and
     * then the container instance UUID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     *
     * @param containerInstanceArn The Amazon Resource Name (ARN) of the container instance. The ARN
     *         contains the <code>arn:aws:ecs</code> namespace, followed by the
     *         region of the container instance, the AWS account ID of the container
     *         instance owner, the <code>container-instance</code> namespace, and
     *         then the container instance UUID. For example,
     *         arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     */
    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the container instance, the AWS account ID of the container
     * instance owner, the <code>container-instance</code> namespace, and
     * then the container instance UUID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstanceArn The Amazon Resource Name (ARN) of the container instance. The ARN
     *         contains the <code>arn:aws:ecs</code> namespace, followed by the
     *         region of the container instance, the AWS account ID of the container
     *         instance owner, the <code>container-instance</code> namespace, and
     *         then the container instance UUID. For example,
     *         arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerInstance withContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
        return this;
    }

    /**
     * The Amazon EC2 instance ID of the container instance.
     *
     * @return The Amazon EC2 instance ID of the container instance.
     */
    public String getEc2InstanceId() {
        return ec2InstanceId;
    }
    
    /**
     * The Amazon EC2 instance ID of the container instance.
     *
     * @param ec2InstanceId The Amazon EC2 instance ID of the container instance.
     */
    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }
    
    /**
     * The Amazon EC2 instance ID of the container instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2InstanceId The Amazon EC2 instance ID of the container instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerInstance withEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
        return this;
    }

    /**
     * The remaining resources of the container instance that are available
     * for new tasks.
     *
     * @return The remaining resources of the container instance that are available
     *         for new tasks.
     */
    public java.util.List<Resource> getRemainingResources() {
        if (remainingResources == null) {
              remainingResources = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>();
              remainingResources.setAutoConstruct(true);
        }
        return remainingResources;
    }
    
    /**
     * The remaining resources of the container instance that are available
     * for new tasks.
     *
     * @param remainingResources The remaining resources of the container instance that are available
     *         for new tasks.
     */
    public void setRemainingResources(java.util.Collection<Resource> remainingResources) {
        if (remainingResources == null) {
            this.remainingResources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Resource> remainingResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>(remainingResources.size());
        remainingResourcesCopy.addAll(remainingResources);
        this.remainingResources = remainingResourcesCopy;
    }
    
    /**
     * The remaining resources of the container instance that are available
     * for new tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param remainingResources The remaining resources of the container instance that are available
     *         for new tasks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerInstance withRemainingResources(Resource... remainingResources) {
        if (getRemainingResources() == null) setRemainingResources(new java.util.ArrayList<Resource>(remainingResources.length));
        for (Resource value : remainingResources) {
            getRemainingResources().add(value);
        }
        return this;
    }
    
    /**
     * The remaining resources of the container instance that are available
     * for new tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param remainingResources The remaining resources of the container instance that are available
     *         for new tasks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerInstance withRemainingResources(java.util.Collection<Resource> remainingResources) {
        if (remainingResources == null) {
            this.remainingResources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Resource> remainingResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>(remainingResources.size());
            remainingResourcesCopy.addAll(remainingResources);
            this.remainingResources = remainingResourcesCopy;
        }

        return this;
    }

    /**
     * The registered resources on the container instance that are in use by
     * current tasks.
     *
     * @return The registered resources on the container instance that are in use by
     *         current tasks.
     */
    public java.util.List<Resource> getRegisteredResources() {
        if (registeredResources == null) {
              registeredResources = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>();
              registeredResources.setAutoConstruct(true);
        }
        return registeredResources;
    }
    
    /**
     * The registered resources on the container instance that are in use by
     * current tasks.
     *
     * @param registeredResources The registered resources on the container instance that are in use by
     *         current tasks.
     */
    public void setRegisteredResources(java.util.Collection<Resource> registeredResources) {
        if (registeredResources == null) {
            this.registeredResources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Resource> registeredResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>(registeredResources.size());
        registeredResourcesCopy.addAll(registeredResources);
        this.registeredResources = registeredResourcesCopy;
    }
    
    /**
     * The registered resources on the container instance that are in use by
     * current tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registeredResources The registered resources on the container instance that are in use by
     *         current tasks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerInstance withRegisteredResources(Resource... registeredResources) {
        if (getRegisteredResources() == null) setRegisteredResources(new java.util.ArrayList<Resource>(registeredResources.length));
        for (Resource value : registeredResources) {
            getRegisteredResources().add(value);
        }
        return this;
    }
    
    /**
     * The registered resources on the container instance that are in use by
     * current tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registeredResources The registered resources on the container instance that are in use by
     *         current tasks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerInstance withRegisteredResources(java.util.Collection<Resource> registeredResources) {
        if (registeredResources == null) {
            this.registeredResources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Resource> registeredResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>(registeredResources.size());
            registeredResourcesCopy.addAll(registeredResources);
            this.registeredResources = registeredResourcesCopy;
        }

        return this;
    }

    /**
     * The status of the container instance. The valid values are
     * <code>ACTIVE</code> or <code>INACTIVE</code>. <code>ACTIVE</code>
     * indicates that the container instance can accept tasks.
     *
     * @return The status of the container instance. The valid values are
     *         <code>ACTIVE</code> or <code>INACTIVE</code>. <code>ACTIVE</code>
     *         indicates that the container instance can accept tasks.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the container instance. The valid values are
     * <code>ACTIVE</code> or <code>INACTIVE</code>. <code>ACTIVE</code>
     * indicates that the container instance can accept tasks.
     *
     * @param status The status of the container instance. The valid values are
     *         <code>ACTIVE</code> or <code>INACTIVE</code>. <code>ACTIVE</code>
     *         indicates that the container instance can accept tasks.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the container instance. The valid values are
     * <code>ACTIVE</code> or <code>INACTIVE</code>. <code>ACTIVE</code>
     * indicates that the container instance can accept tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the container instance. The valid values are
     *         <code>ACTIVE</code> or <code>INACTIVE</code>. <code>ACTIVE</code>
     *         indicates that the container instance can accept tasks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerInstance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * This parameter returns <code>true</code> if the agent is actually
     * connected to Amazon ECS. Registered instances with an agent that may
     * be unhealthy or stopped will return <code>false</code>, and instances
     * without a connected agent cannot accept placement request.
     *
     * @return This parameter returns <code>true</code> if the agent is actually
     *         connected to Amazon ECS. Registered instances with an agent that may
     *         be unhealthy or stopped will return <code>false</code>, and instances
     *         without a connected agent cannot accept placement request.
     */
    public Boolean isAgentConnected() {
        return agentConnected;
    }
    
    /**
     * This parameter returns <code>true</code> if the agent is actually
     * connected to Amazon ECS. Registered instances with an agent that may
     * be unhealthy or stopped will return <code>false</code>, and instances
     * without a connected agent cannot accept placement request.
     *
     * @param agentConnected This parameter returns <code>true</code> if the agent is actually
     *         connected to Amazon ECS. Registered instances with an agent that may
     *         be unhealthy or stopped will return <code>false</code>, and instances
     *         without a connected agent cannot accept placement request.
     */
    public void setAgentConnected(Boolean agentConnected) {
        this.agentConnected = agentConnected;
    }
    
    /**
     * This parameter returns <code>true</code> if the agent is actually
     * connected to Amazon ECS. Registered instances with an agent that may
     * be unhealthy or stopped will return <code>false</code>, and instances
     * without a connected agent cannot accept placement request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param agentConnected This parameter returns <code>true</code> if the agent is actually
     *         connected to Amazon ECS. Registered instances with an agent that may
     *         be unhealthy or stopped will return <code>false</code>, and instances
     *         without a connected agent cannot accept placement request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerInstance withAgentConnected(Boolean agentConnected) {
        this.agentConnected = agentConnected;
        return this;
    }

    /**
     * This parameter returns <code>true</code> if the agent is actually
     * connected to Amazon ECS. Registered instances with an agent that may
     * be unhealthy or stopped will return <code>false</code>, and instances
     * without a connected agent cannot accept placement request.
     *
     * @return This parameter returns <code>true</code> if the agent is actually
     *         connected to Amazon ECS. Registered instances with an agent that may
     *         be unhealthy or stopped will return <code>false</code>, and instances
     *         without a connected agent cannot accept placement request.
     */
    public Boolean getAgentConnected() {
        return agentConnected;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContainerInstanceArn() != null) sb.append("ContainerInstanceArn: " + getContainerInstanceArn() + ",");
        if (getEc2InstanceId() != null) sb.append("Ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getRemainingResources() != null) sb.append("RemainingResources: " + getRemainingResources() + ",");
        if (getRegisteredResources() != null) sb.append("RegisteredResources: " + getRegisteredResources() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (isAgentConnected() != null) sb.append("AgentConnected: " + isAgentConnected() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode()); 
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getRemainingResources() == null) ? 0 : getRemainingResources().hashCode()); 
        hashCode = prime * hashCode + ((getRegisteredResources() == null) ? 0 : getRegisteredResources().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((isAgentConnected() == null) ? 0 : isAgentConnected().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ContainerInstance == false) return false;
        ContainerInstance other = (ContainerInstance)obj;
        
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null) return false;
        if (other.getContainerInstanceArn() != null && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false) return false; 
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null) return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false) return false; 
        if (other.getRemainingResources() == null ^ this.getRemainingResources() == null) return false;
        if (other.getRemainingResources() != null && other.getRemainingResources().equals(this.getRemainingResources()) == false) return false; 
        if (other.getRegisteredResources() == null ^ this.getRegisteredResources() == null) return false;
        if (other.getRegisteredResources() != null && other.getRegisteredResources().equals(this.getRegisteredResources()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.isAgentConnected() == null ^ this.isAgentConnected() == null) return false;
        if (other.isAgentConnected() != null && other.isAgentConnected().equals(this.isAgentConnected()) == false) return false; 
        return true;
    }
    
}
    