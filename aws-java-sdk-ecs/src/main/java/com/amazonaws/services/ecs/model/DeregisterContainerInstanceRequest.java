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
 * cluster. This instance will no longer be available to run tasks.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#deregisterContainerInstance(DeregisterContainerInstanceRequest)
 */
public class DeregisterContainerInstanceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance you want to deregister. If you do not
     * specify a cluster, the default cluster is assumed.
     */
    private String cluster;

    /**
     * The container instance UUID or full Amazon Resource Name (ARN) of the
     * container instance you want to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the
     * container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance UUID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     */
    private String containerInstance;

    /**
     * Force the deregistration of the container instance. You can use the
     * <code>force</code> parameter if you have several tasks running on a
     * container instance and you don't want to run <code>StopTask</code> for
     * each task before deregistering the container instance.
     */
    private Boolean force;

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance you want to deregister. If you do not
     * specify a cluster, the default cluster is assumed.
     *
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that
     *         hosts the container instance you want to deregister. If you do not
     *         specify a cluster, the default cluster is assumed.
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance you want to deregister. If you do not
     * specify a cluster, the default cluster is assumed.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         hosts the container instance you want to deregister. If you do not
     *         specify a cluster, the default cluster is assumed.
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance you want to deregister. If you do not
     * specify a cluster, the default cluster is assumed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         hosts the container instance you want to deregister. If you do not
     *         specify a cluster, the default cluster is assumed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeregisterContainerInstanceRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * The container instance UUID or full Amazon Resource Name (ARN) of the
     * container instance you want to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the
     * container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance UUID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     *
     * @return The container instance UUID or full Amazon Resource Name (ARN) of the
     *         container instance you want to deregister. The ARN contains the
     *         <code>arn:aws:ecs</code> namespace, followed by the region of the
     *         container instance, the AWS account ID of the container instance
     *         owner, the <code>container-instance</code> namespace, and then the
     *         container instance UUID. For example,
     *         arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     */
    public String getContainerInstance() {
        return containerInstance;
    }
    
    /**
     * The container instance UUID or full Amazon Resource Name (ARN) of the
     * container instance you want to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the
     * container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance UUID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     *
     * @param containerInstance The container instance UUID or full Amazon Resource Name (ARN) of the
     *         container instance you want to deregister. The ARN contains the
     *         <code>arn:aws:ecs</code> namespace, followed by the region of the
     *         container instance, the AWS account ID of the container instance
     *         owner, the <code>container-instance</code> namespace, and then the
     *         container instance UUID. For example,
     *         arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     */
    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }
    
    /**
     * The container instance UUID or full Amazon Resource Name (ARN) of the
     * container instance you want to deregister. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the region of the
     * container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance UUID. For example,
     * arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstance The container instance UUID or full Amazon Resource Name (ARN) of the
     *         container instance you want to deregister. The ARN contains the
     *         <code>arn:aws:ecs</code> namespace, followed by the region of the
     *         container instance, the AWS account ID of the container instance
     *         owner, the <code>container-instance</code> namespace, and then the
     *         container instance UUID. For example,
     *         arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_UUID</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeregisterContainerInstanceRequest withContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
        return this;
    }

    /**
     * Force the deregistration of the container instance. You can use the
     * <code>force</code> parameter if you have several tasks running on a
     * container instance and you don't want to run <code>StopTask</code> for
     * each task before deregistering the container instance.
     *
     * @return Force the deregistration of the container instance. You can use the
     *         <code>force</code> parameter if you have several tasks running on a
     *         container instance and you don't want to run <code>StopTask</code> for
     *         each task before deregistering the container instance.
     */
    public Boolean isForce() {
        return force;
    }
    
    /**
     * Force the deregistration of the container instance. You can use the
     * <code>force</code> parameter if you have several tasks running on a
     * container instance and you don't want to run <code>StopTask</code> for
     * each task before deregistering the container instance.
     *
     * @param force Force the deregistration of the container instance. You can use the
     *         <code>force</code> parameter if you have several tasks running on a
     *         container instance and you don't want to run <code>StopTask</code> for
     *         each task before deregistering the container instance.
     */
    public void setForce(Boolean force) {
        this.force = force;
    }
    
    /**
     * Force the deregistration of the container instance. You can use the
     * <code>force</code> parameter if you have several tasks running on a
     * container instance and you don't want to run <code>StopTask</code> for
     * each task before deregistering the container instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param force Force the deregistration of the container instance. You can use the
     *         <code>force</code> parameter if you have several tasks running on a
     *         container instance and you don't want to run <code>StopTask</code> for
     *         each task before deregistering the container instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeregisterContainerInstanceRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * Force the deregistration of the container instance. You can use the
     * <code>force</code> parameter if you have several tasks running on a
     * container instance and you don't want to run <code>StopTask</code> for
     * each task before deregistering the container instance.
     *
     * @return Force the deregistration of the container instance. You can use the
     *         <code>force</code> parameter if you have several tasks running on a
     *         container instance and you don't want to run <code>StopTask</code> for
     *         each task before deregistering the container instance.
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
    
}
    