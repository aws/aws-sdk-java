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
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#deregisterContainerInstance(DeregisterContainerInstanceRequest) DeregisterContainerInstance operation}.
 * <p>
 * Deregisters an Amazon ECS container instance from the specified
 * cluster. This instance is no longer available to run tasks.
 * </p>
 * <p>
 * If you intend to use the container instance for some other purpose
 * after deregistration, you should stop all of the tasks running on the
 * container instance before deregistration to avoid any orphaned tasks
 * from consuming resources.
 * </p>
 * <p>
 * Deregistering a container instance removes the instance from a
 * cluster, but it does not terminate the EC2 instance; if you are
 * finished using the instance, be sure to terminate it in the Amazon EC2
 * console to stop billing.
 * </p>
 * <p>
 * <b>NOTE:</b> When you terminate a container instance, it is
 * automatically deregistered from your cluster.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#deregisterContainerInstance(DeregisterContainerInstanceRequest)
 */
public class DeregisterContainerInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to deregister. If you do not specify a
     * cluster, the default cluster is assumed.
     */
    private String cluster;

    /**
     * The container instance ID or full Amazon Resource Name (ARN) of the
     * container instance to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the
     * container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i>.
     */
    private String containerInstance;

    /**
     * Forces the deregistration of the container instance. If you have tasks
     * running on the container instance when you deregister it with the
     * <code>force</code> option, these tasks remain running and they
     * continue to pass Elastic Load Balancing load balancer health checks
     * until you terminate the instance or the tasks stop through some other
     * means, but they are orphaned (no longer monitored or accounted for by
     * Amazon ECS). If an orphaned task on your container instance is part of
     * an Amazon ECS service, then the service scheduler starts another copy
     * of that task, on a different container instance if possible.
     */
    private Boolean force;

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to deregister. If you do not specify a
     * cluster, the default cluster is assumed.
     *
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that
     *         hosts the container instance to deregister. If you do not specify a
     *         cluster, the default cluster is assumed.
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to deregister. If you do not specify a
     * cluster, the default cluster is assumed.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         hosts the container instance to deregister. If you do not specify a
     *         cluster, the default cluster is assumed.
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to deregister. If you do not specify a
     * cluster, the default cluster is assumed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         hosts the container instance to deregister. If you do not specify a
     *         cluster, the default cluster is assumed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeregisterContainerInstanceRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * The container instance ID or full Amazon Resource Name (ARN) of the
     * container instance to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the
     * container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i>.
     *
     * @return The container instance ID or full Amazon Resource Name (ARN) of the
     *         container instance to deregister. The ARN contains the
     *         <code>arn:aws:ecs</code> namespace, followed by the region of the
     *         container instance, the AWS account ID of the container instance
     *         owner, the <code>container-instance</code> namespace, and then the
     *         container instance ID. For example,
     *         arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i>.
     */
    public String getContainerInstance() {
        return containerInstance;
    }
    
    /**
     * The container instance ID or full Amazon Resource Name (ARN) of the
     * container instance to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the
     * container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i>.
     *
     * @param containerInstance The container instance ID or full Amazon Resource Name (ARN) of the
     *         container instance to deregister. The ARN contains the
     *         <code>arn:aws:ecs</code> namespace, followed by the region of the
     *         container instance, the AWS account ID of the container instance
     *         owner, the <code>container-instance</code> namespace, and then the
     *         container instance ID. For example,
     *         arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i>.
     */
    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }
    
    /**
     * The container instance ID or full Amazon Resource Name (ARN) of the
     * container instance to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the
     * container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstance The container instance ID or full Amazon Resource Name (ARN) of the
     *         container instance to deregister. The ARN contains the
     *         <code>arn:aws:ecs</code> namespace, followed by the region of the
     *         container instance, the AWS account ID of the container instance
     *         owner, the <code>container-instance</code> namespace, and then the
     *         container instance ID. For example,
     *         arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeregisterContainerInstanceRequest withContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
        return this;
    }

    /**
     * Forces the deregistration of the container instance. If you have tasks
     * running on the container instance when you deregister it with the
     * <code>force</code> option, these tasks remain running and they
     * continue to pass Elastic Load Balancing load balancer health checks
     * until you terminate the instance or the tasks stop through some other
     * means, but they are orphaned (no longer monitored or accounted for by
     * Amazon ECS). If an orphaned task on your container instance is part of
     * an Amazon ECS service, then the service scheduler starts another copy
     * of that task, on a different container instance if possible.
     *
     * @return Forces the deregistration of the container instance. If you have tasks
     *         running on the container instance when you deregister it with the
     *         <code>force</code> option, these tasks remain running and they
     *         continue to pass Elastic Load Balancing load balancer health checks
     *         until you terminate the instance or the tasks stop through some other
     *         means, but they are orphaned (no longer monitored or accounted for by
     *         Amazon ECS). If an orphaned task on your container instance is part of
     *         an Amazon ECS service, then the service scheduler starts another copy
     *         of that task, on a different container instance if possible.
     */
    public Boolean isForce() {
        return force;
    }
    
    /**
     * Forces the deregistration of the container instance. If you have tasks
     * running on the container instance when you deregister it with the
     * <code>force</code> option, these tasks remain running and they
     * continue to pass Elastic Load Balancing load balancer health checks
     * until you terminate the instance or the tasks stop through some other
     * means, but they are orphaned (no longer monitored or accounted for by
     * Amazon ECS). If an orphaned task on your container instance is part of
     * an Amazon ECS service, then the service scheduler starts another copy
     * of that task, on a different container instance if possible.
     *
     * @param force Forces the deregistration of the container instance. If you have tasks
     *         running on the container instance when you deregister it with the
     *         <code>force</code> option, these tasks remain running and they
     *         continue to pass Elastic Load Balancing load balancer health checks
     *         until you terminate the instance or the tasks stop through some other
     *         means, but they are orphaned (no longer monitored or accounted for by
     *         Amazon ECS). If an orphaned task on your container instance is part of
     *         an Amazon ECS service, then the service scheduler starts another copy
     *         of that task, on a different container instance if possible.
     */
    public void setForce(Boolean force) {
        this.force = force;
    }
    
    /**
     * Forces the deregistration of the container instance. If you have tasks
     * running on the container instance when you deregister it with the
     * <code>force</code> option, these tasks remain running and they
     * continue to pass Elastic Load Balancing load balancer health checks
     * until you terminate the instance or the tasks stop through some other
     * means, but they are orphaned (no longer monitored or accounted for by
     * Amazon ECS). If an orphaned task on your container instance is part of
     * an Amazon ECS service, then the service scheduler starts another copy
     * of that task, on a different container instance if possible.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param force Forces the deregistration of the container instance. If you have tasks
     *         running on the container instance when you deregister it with the
     *         <code>force</code> option, these tasks remain running and they
     *         continue to pass Elastic Load Balancing load balancer health checks
     *         until you terminate the instance or the tasks stop through some other
     *         means, but they are orphaned (no longer monitored or accounted for by
     *         Amazon ECS). If an orphaned task on your container instance is part of
     *         an Amazon ECS service, then the service scheduler starts another copy
     *         of that task, on a different container instance if possible.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeregisterContainerInstanceRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * Forces the deregistration of the container instance. If you have tasks
     * running on the container instance when you deregister it with the
     * <code>force</code> option, these tasks remain running and they
     * continue to pass Elastic Load Balancing load balancer health checks
     * until you terminate the instance or the tasks stop through some other
     * means, but they are orphaned (no longer monitored or accounted for by
     * Amazon ECS). If an orphaned task on your container instance is part of
     * an Amazon ECS service, then the service scheduler starts another copy
     * of that task, on a different container instance if possible.
     *
     * @return Forces the deregistration of the container instance. If you have tasks
     *         running on the container instance when you deregister it with the
     *         <code>force</code> option, these tasks remain running and they
     *         continue to pass Elastic Load Balancing load balancer health checks
     *         until you terminate the instance or the tasks stop through some other
     *         means, but they are orphaned (no longer monitored or accounted for by
     *         Amazon ECS). If an orphaned task on your container instance is part of
     *         an Amazon ECS service, then the service scheduler starts another copy
     *         of that task, on a different container instance if possible.
     */
    public Boolean getForce() {
        return force;
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
        if (getContainerInstance() != null) sb.append("ContainerInstance: " + getContainerInstance() + ",");
        if (isForce() != null) sb.append("Force: " + isForce() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode()); 
        hashCode = prime * hashCode + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode()); 
        hashCode = prime * hashCode + ((isForce() == null) ? 0 : isForce().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeregisterContainerInstanceRequest == false) return false;
        DeregisterContainerInstanceRequest other = (DeregisterContainerInstanceRequest)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null) return false;
        if (other.getContainerInstance() != null && other.getContainerInstance().equals(this.getContainerInstance()) == false) return false; 
        if (other.isForce() == null ^ this.isForce() == null) return false;
        if (other.isForce() != null && other.isForce().equals(this.isForce()) == false) return false; 
        return true;
    }
    
    @Override
    public DeregisterContainerInstanceRequest clone() {
        
            return (DeregisterContainerInstanceRequest) super.clone();
    }

}
    