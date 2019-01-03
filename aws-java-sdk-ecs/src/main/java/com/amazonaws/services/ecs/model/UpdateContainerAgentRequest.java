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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateContainerAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContainerAgentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running on. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The container instance ID or full ARN entries for the container instance on which you would like to update the
     * Amazon ECS container agent.
     * </p>
     */
    private String containerInstance;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running on. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running
     *        on. If you do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running on. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running
     *         on. If you do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running on. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running
     *        on. If you do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerAgentRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The container instance ID or full ARN entries for the container instance on which you would like to update the
     * Amazon ECS container agent.
     * </p>
     * 
     * @param containerInstance
     *        The container instance ID or full ARN entries for the container instance on which you would like to update
     *        the Amazon ECS container agent.
     */

    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN entries for the container instance on which you would like to update the
     * Amazon ECS container agent.
     * </p>
     * 
     * @return The container instance ID or full ARN entries for the container instance on which you would like to
     *         update the Amazon ECS container agent.
     */

    public String getContainerInstance() {
        return this.containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN entries for the container instance on which you would like to update the
     * Amazon ECS container agent.
     * </p>
     * 
     * @param containerInstance
     *        The container instance ID or full ARN entries for the container instance on which you would like to update
     *        the Amazon ECS container agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerAgentRequest withContainerInstance(String containerInstance) {
        setContainerInstance(containerInstance);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getContainerInstance() != null)
            sb.append("ContainerInstance: ").append(getContainerInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContainerAgentRequest == false)
            return false;
        UpdateContainerAgentRequest other = (UpdateContainerAgentRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null)
            return false;
        if (other.getContainerInstance() != null && other.getContainerInstance().equals(this.getContainerInstance()) == false)
            return false;
        return true;
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
    public UpdateContainerAgentRequest clone() {
        return (UpdateContainerAgentRequest) super.clone();
    }

}
