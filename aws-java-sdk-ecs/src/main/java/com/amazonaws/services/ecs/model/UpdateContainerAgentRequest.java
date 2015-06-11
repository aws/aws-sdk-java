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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#updateContainerAgent(UpdateContainerAgentRequest) UpdateContainerAgent operation}.
 * <p>
 * Updates the Amazon ECS container agent on a specified container
 * instance.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#updateContainerAgent(UpdateContainerAgentRequest)
 */
public class UpdateContainerAgentRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your container instance is running on. If you do not specify a
     * cluster, the default cluster is assumed.
     */
    private String cluster;

    /**
     * The container instance UUID or full Amazon Resource Name (ARN) entries
     * for the container instance on which you would like to update the
     * Amazon ECS container agent.
     */
    private String containerInstance;

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your container instance is running on. If you do not specify a
     * cluster, the default cluster is assumed.
     *
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that
     *         your container instance is running on. If you do not specify a
     *         cluster, the default cluster is assumed.
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your container instance is running on. If you do not specify a
     * cluster, the default cluster is assumed.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         your container instance is running on. If you do not specify a
     *         cluster, the default cluster is assumed.
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your container instance is running on. If you do not specify a
     * cluster, the default cluster is assumed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         your container instance is running on. If you do not specify a
     *         cluster, the default cluster is assumed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateContainerAgentRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * The container instance UUID or full Amazon Resource Name (ARN) entries
     * for the container instance on which you would like to update the
     * Amazon ECS container agent.
     *
     * @return The container instance UUID or full Amazon Resource Name (ARN) entries
     *         for the container instance on which you would like to update the
     *         Amazon ECS container agent.
     */
    public String getContainerInstance() {
        return containerInstance;
    }
    
    /**
     * The container instance UUID or full Amazon Resource Name (ARN) entries
     * for the container instance on which you would like to update the
     * Amazon ECS container agent.
     *
     * @param containerInstance The container instance UUID or full Amazon Resource Name (ARN) entries
     *         for the container instance on which you would like to update the
     *         Amazon ECS container agent.
     */
    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }
    
    /**
     * The container instance UUID or full Amazon Resource Name (ARN) entries
     * for the container instance on which you would like to update the
     * Amazon ECS container agent.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstance The container instance UUID or full Amazon Resource Name (ARN) entries
     *         for the container instance on which you would like to update the
     *         Amazon ECS container agent.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateContainerAgentRequest withContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
        return this;
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
        if (getCluster() != null) sb.append("Cluster: " + getCluster() + ",");
        if (getContainerInstance() != null) sb.append("ContainerInstance: " + getContainerInstance() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode()); 
        hashCode = prime * hashCode + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateContainerAgentRequest == false) return false;
        UpdateContainerAgentRequest other = (UpdateContainerAgentRequest)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null) return false;
        if (other.getContainerInstance() != null && other.getContainerInstance().equals(this.getContainerInstance()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateContainerAgentRequest clone() {
        
            return (UpdateContainerAgentRequest) super.clone();
    }

}
    