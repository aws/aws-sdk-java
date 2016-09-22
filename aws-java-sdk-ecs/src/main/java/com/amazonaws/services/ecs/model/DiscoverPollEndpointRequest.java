/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DiscoverPollEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The container instance ID or full Amazon Resource Name (ARN) of the container instance. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the container instance, the AWS account ID of the
     * container instance owner, the <code>container-instance</code> namespace, and then the container instance ID. For
     * example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     */
    private String containerInstance;
    /**
     * <p>
     * The cluster that the container instance belongs to.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The container instance ID or full Amazon Resource Name (ARN) of the container instance. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the container instance, the AWS account ID of the
     * container instance owner, the <code>container-instance</code> namespace, and then the container instance ID. For
     * example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     * 
     * @param containerInstance
     *        The container instance ID or full Amazon Resource Name (ARN) of the container instance. The ARN contains
     *        the <code>arn:aws:ecs</code> namespace, followed by the region of the container instance, the AWS account
     *        ID of the container instance owner, the <code>container-instance</code> namespace, and then the container
     *        instance ID. For example,
     *        <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>
     *        .
     */

    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full Amazon Resource Name (ARN) of the container instance. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the container instance, the AWS account ID of the
     * container instance owner, the <code>container-instance</code> namespace, and then the container instance ID. For
     * example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     * 
     * @return The container instance ID or full Amazon Resource Name (ARN) of the container instance. The ARN contains
     *         the <code>arn:aws:ecs</code> namespace, followed by the region of the container instance, the AWS account
     *         ID of the container instance owner, the <code>container-instance</code> namespace, and then the container
     *         instance ID. For example,
     *         <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>
     *         .
     */

    public String getContainerInstance() {
        return this.containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full Amazon Resource Name (ARN) of the container instance. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the container instance, the AWS account ID of the
     * container instance owner, the <code>container-instance</code> namespace, and then the container instance ID. For
     * example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     * 
     * @param containerInstance
     *        The container instance ID or full Amazon Resource Name (ARN) of the container instance. The ARN contains
     *        the <code>arn:aws:ecs</code> namespace, followed by the region of the container instance, the AWS account
     *        ID of the container instance owner, the <code>container-instance</code> namespace, and then the container
     *        instance ID. For example,
     *        <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverPollEndpointRequest withContainerInstance(String containerInstance) {
        setContainerInstance(containerInstance);
        return this;
    }

    /**
     * <p>
     * The cluster that the container instance belongs to.
     * </p>
     * 
     * @param cluster
     *        The cluster that the container instance belongs to.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The cluster that the container instance belongs to.
     * </p>
     * 
     * @return The cluster that the container instance belongs to.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The cluster that the container instance belongs to.
     * </p>
     * 
     * @param cluster
     *        The cluster that the container instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverPollEndpointRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContainerInstance() != null)
            sb.append("ContainerInstance: " + getContainerInstance() + ",");
        if (getCluster() != null)
            sb.append("Cluster: " + getCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverPollEndpointRequest == false)
            return false;
        DiscoverPollEndpointRequest other = (DiscoverPollEndpointRequest) obj;
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null)
            return false;
        if (other.getContainerInstance() != null && other.getContainerInstance().equals(this.getContainerInstance()) == false)
            return false;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode());
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        return hashCode;
    }

    @Override
    public DiscoverPollEndpointRequest clone() {
        return (DiscoverPollEndpointRequest) super.clone();
    }
}
