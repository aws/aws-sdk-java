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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeregisterContainerInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterContainerInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to deregister.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The container instance ID or full ARN of the container instance to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the Region of the container instance, the AWS account ID of the
     * container instance owner, the <code>container-instance</code> namespace, and then the container instance ID. For
     * example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     */
    private String containerInstance;
    /**
     * <p>
     * Forces the deregistration of the container instance. If you have tasks running on the container instance when you
     * deregister it with the <code>force</code> option, these tasks remain running until you terminate the instance or
     * the tasks stop through some other means, but they are orphaned (no longer monitored or accounted for by Amazon
     * ECS). If an orphaned task on your container instance is part of an Amazon ECS service, then the service scheduler
     * starts another copy of that task, on a different container instance if possible.
     * </p>
     * <p>
     * Any containers in orphaned service tasks that are registered with a Classic Load Balancer or an Application Load
     * Balancer target group are deregistered. They begin connection draining according to the settings on the load
     * balancer or target group.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to deregister.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to
     *        deregister. If you do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to deregister.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to
     *         deregister. If you do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to deregister.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to
     *        deregister. If you do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterContainerInstanceRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the Region of the container instance, the AWS account ID of the
     * container instance owner, the <code>container-instance</code> namespace, and then the container instance ID. For
     * example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     * 
     * @param containerInstance
     *        The container instance ID or full ARN of the container instance to deregister. The ARN contains the
     *        <code>arn:aws:ecs</code> namespace, followed by the Region of the container instance, the AWS account ID
     *        of the container instance owner, the <code>container-instance</code> namespace, and then the container
     *        instance ID. For example,
     *        <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>
     *        .
     */

    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the Region of the container instance, the AWS account ID of the
     * container instance owner, the <code>container-instance</code> namespace, and then the container instance ID. For
     * example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     * 
     * @return The container instance ID or full ARN of the container instance to deregister. The ARN contains the
     *         <code>arn:aws:ecs</code> namespace, followed by the Region of the container instance, the AWS account ID
     *         of the container instance owner, the <code>container-instance</code> namespace, and then the container
     *         instance ID. For example,
     *         <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>
     *         .
     */

    public String getContainerInstance() {
        return this.containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the Region of the container instance, the AWS account ID of the
     * container instance owner, the <code>container-instance</code> namespace, and then the container instance ID. For
     * example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     * 
     * @param containerInstance
     *        The container instance ID or full ARN of the container instance to deregister. The ARN contains the
     *        <code>arn:aws:ecs</code> namespace, followed by the Region of the container instance, the AWS account ID
     *        of the container instance owner, the <code>container-instance</code> namespace, and then the container
     *        instance ID. For example,
     *        <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterContainerInstanceRequest withContainerInstance(String containerInstance) {
        setContainerInstance(containerInstance);
        return this;
    }

    /**
     * <p>
     * Forces the deregistration of the container instance. If you have tasks running on the container instance when you
     * deregister it with the <code>force</code> option, these tasks remain running until you terminate the instance or
     * the tasks stop through some other means, but they are orphaned (no longer monitored or accounted for by Amazon
     * ECS). If an orphaned task on your container instance is part of an Amazon ECS service, then the service scheduler
     * starts another copy of that task, on a different container instance if possible.
     * </p>
     * <p>
     * Any containers in orphaned service tasks that are registered with a Classic Load Balancer or an Application Load
     * Balancer target group are deregistered. They begin connection draining according to the settings on the load
     * balancer or target group.
     * </p>
     * 
     * @param force
     *        Forces the deregistration of the container instance. If you have tasks running on the container instance
     *        when you deregister it with the <code>force</code> option, these tasks remain running until you terminate
     *        the instance or the tasks stop through some other means, but they are orphaned (no longer monitored or
     *        accounted for by Amazon ECS). If an orphaned task on your container instance is part of an Amazon ECS
     *        service, then the service scheduler starts another copy of that task, on a different container instance if
     *        possible. </p>
     *        <p>
     *        Any containers in orphaned service tasks that are registered with a Classic Load Balancer or an
     *        Application Load Balancer target group are deregistered. They begin connection draining according to the
     *        settings on the load balancer or target group.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Forces the deregistration of the container instance. If you have tasks running on the container instance when you
     * deregister it with the <code>force</code> option, these tasks remain running until you terminate the instance or
     * the tasks stop through some other means, but they are orphaned (no longer monitored or accounted for by Amazon
     * ECS). If an orphaned task on your container instance is part of an Amazon ECS service, then the service scheduler
     * starts another copy of that task, on a different container instance if possible.
     * </p>
     * <p>
     * Any containers in orphaned service tasks that are registered with a Classic Load Balancer or an Application Load
     * Balancer target group are deregistered. They begin connection draining according to the settings on the load
     * balancer or target group.
     * </p>
     * 
     * @return Forces the deregistration of the container instance. If you have tasks running on the container instance
     *         when you deregister it with the <code>force</code> option, these tasks remain running until you terminate
     *         the instance or the tasks stop through some other means, but they are orphaned (no longer monitored or
     *         accounted for by Amazon ECS). If an orphaned task on your container instance is part of an Amazon ECS
     *         service, then the service scheduler starts another copy of that task, on a different container instance
     *         if possible. </p>
     *         <p>
     *         Any containers in orphaned service tasks that are registered with a Classic Load Balancer or an
     *         Application Load Balancer target group are deregistered. They begin connection draining according to the
     *         settings on the load balancer or target group.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Forces the deregistration of the container instance. If you have tasks running on the container instance when you
     * deregister it with the <code>force</code> option, these tasks remain running until you terminate the instance or
     * the tasks stop through some other means, but they are orphaned (no longer monitored or accounted for by Amazon
     * ECS). If an orphaned task on your container instance is part of an Amazon ECS service, then the service scheduler
     * starts another copy of that task, on a different container instance if possible.
     * </p>
     * <p>
     * Any containers in orphaned service tasks that are registered with a Classic Load Balancer or an Application Load
     * Balancer target group are deregistered. They begin connection draining according to the settings on the load
     * balancer or target group.
     * </p>
     * 
     * @param force
     *        Forces the deregistration of the container instance. If you have tasks running on the container instance
     *        when you deregister it with the <code>force</code> option, these tasks remain running until you terminate
     *        the instance or the tasks stop through some other means, but they are orphaned (no longer monitored or
     *        accounted for by Amazon ECS). If an orphaned task on your container instance is part of an Amazon ECS
     *        service, then the service scheduler starts another copy of that task, on a different container instance if
     *        possible. </p>
     *        <p>
     *        Any containers in orphaned service tasks that are registered with a Classic Load Balancer or an
     *        Application Load Balancer target group are deregistered. They begin connection draining according to the
     *        settings on the load balancer or target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterContainerInstanceRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Forces the deregistration of the container instance. If you have tasks running on the container instance when you
     * deregister it with the <code>force</code> option, these tasks remain running until you terminate the instance or
     * the tasks stop through some other means, but they are orphaned (no longer monitored or accounted for by Amazon
     * ECS). If an orphaned task on your container instance is part of an Amazon ECS service, then the service scheduler
     * starts another copy of that task, on a different container instance if possible.
     * </p>
     * <p>
     * Any containers in orphaned service tasks that are registered with a Classic Load Balancer or an Application Load
     * Balancer target group are deregistered. They begin connection draining according to the settings on the load
     * balancer or target group.
     * </p>
     * 
     * @return Forces the deregistration of the container instance. If you have tasks running on the container instance
     *         when you deregister it with the <code>force</code> option, these tasks remain running until you terminate
     *         the instance or the tasks stop through some other means, but they are orphaned (no longer monitored or
     *         accounted for by Amazon ECS). If an orphaned task on your container instance is part of an Amazon ECS
     *         service, then the service scheduler starts another copy of that task, on a different container instance
     *         if possible. </p>
     *         <p>
     *         Any containers in orphaned service tasks that are registered with a Classic Load Balancer or an
     *         Application Load Balancer target group are deregistered. They begin connection draining according to the
     *         settings on the load balancer or target group.
     */

    public Boolean isForce() {
        return this.force;
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
            sb.append("ContainerInstance: ").append(getContainerInstance()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterContainerInstanceRequest == false)
            return false;
        DeregisterContainerInstanceRequest other = (DeregisterContainerInstanceRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null)
            return false;
        if (other.getContainerInstance() != null && other.getContainerInstance().equals(this.getContainerInstance()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterContainerInstanceRequest clone() {
        return (DeregisterContainerInstanceRequest) super.clone();
    }

}
