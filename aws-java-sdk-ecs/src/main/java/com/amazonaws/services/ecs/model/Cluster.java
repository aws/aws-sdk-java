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
 * A regional grouping of one or more container instances on which you
 * can run task requests. Each account receives a default cluster the
 * first time you use the Amazon ECS service, but you may also create
 * other clusters. Clusters may contain more than one instance type
 * simultaneously.
 * </p>
 */
public class Cluster implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For
     * example,
     * arn:aws:ecs:<i>region</i>:<i>012345678910</i>:cluster/<i>test</i>.
     */
    private String clusterArn;

    /**
     * A user-generated string that you use to identify your cluster.
     */
    private String clusterName;

    /**
     * The status of the cluster. The valid values are <code>ACTIVE</code> or
     * <code>INACTIVE</code>. <code>ACTIVE</code> indicates that you can
     * register container instances with the cluster and the associated
     * instances can accept tasks.
     */
    private String status;

    /**
     * The number of container instances registered into the cluster.
     */
    private Integer registeredContainerInstancesCount;

    /**
     * The number of tasks in the cluster that are in the
     * <code>RUNNING</code> state.
     */
    private Integer runningTasksCount;

    /**
     * The number of tasks in the cluster that are in the
     * <code>PENDING</code> state.
     */
    private Integer pendingTasksCount;

    /**
     * The number of services that are running on the cluster in an
     * <code>ACTIVE</code> state. You can view these services with
     * <a>ListServices</a>.
     */
    private Integer activeServicesCount;

    /**
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For
     * example,
     * arn:aws:ecs:<i>region</i>:<i>012345678910</i>:cluster/<i>test</i>.
     *
     * @return The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     *         contains the <code>arn:aws:ecs</code> namespace, followed by the
     *         region of the cluster, the AWS account ID of the cluster owner, the
     *         <code>cluster</code> namespace, and then the cluster name. For
     *         example,
     *         arn:aws:ecs:<i>region</i>:<i>012345678910</i>:cluster/<i>test</i>.
     */
    public String getClusterArn() {
        return clusterArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For
     * example,
     * arn:aws:ecs:<i>region</i>:<i>012345678910</i>:cluster/<i>test</i>.
     *
     * @param clusterArn The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     *         contains the <code>arn:aws:ecs</code> namespace, followed by the
     *         region of the cluster, the AWS account ID of the cluster owner, the
     *         <code>cluster</code> namespace, and then the cluster name. For
     *         example,
     *         arn:aws:ecs:<i>region</i>:<i>012345678910</i>:cluster/<i>test</i>.
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For
     * example,
     * arn:aws:ecs:<i>region</i>:<i>012345678910</i>:cluster/<i>test</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterArn The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     *         contains the <code>arn:aws:ecs</code> namespace, followed by the
     *         region of the cluster, the AWS account ID of the cluster owner, the
     *         <code>cluster</code> namespace, and then the cluster name. For
     *         example,
     *         arn:aws:ecs:<i>region</i>:<i>012345678910</i>:cluster/<i>test</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * A user-generated string that you use to identify your cluster.
     *
     * @return A user-generated string that you use to identify your cluster.
     */
    public String getClusterName() {
        return clusterName;
    }
    
    /**
     * A user-generated string that you use to identify your cluster.
     *
     * @param clusterName A user-generated string that you use to identify your cluster.
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }
    
    /**
     * A user-generated string that you use to identify your cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterName A user-generated string that you use to identify your cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * The status of the cluster. The valid values are <code>ACTIVE</code> or
     * <code>INACTIVE</code>. <code>ACTIVE</code> indicates that you can
     * register container instances with the cluster and the associated
     * instances can accept tasks.
     *
     * @return The status of the cluster. The valid values are <code>ACTIVE</code> or
     *         <code>INACTIVE</code>. <code>ACTIVE</code> indicates that you can
     *         register container instances with the cluster and the associated
     *         instances can accept tasks.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the cluster. The valid values are <code>ACTIVE</code> or
     * <code>INACTIVE</code>. <code>ACTIVE</code> indicates that you can
     * register container instances with the cluster and the associated
     * instances can accept tasks.
     *
     * @param status The status of the cluster. The valid values are <code>ACTIVE</code> or
     *         <code>INACTIVE</code>. <code>ACTIVE</code> indicates that you can
     *         register container instances with the cluster and the associated
     *         instances can accept tasks.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the cluster. The valid values are <code>ACTIVE</code> or
     * <code>INACTIVE</code>. <code>ACTIVE</code> indicates that you can
     * register container instances with the cluster and the associated
     * instances can accept tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the cluster. The valid values are <code>ACTIVE</code> or
     *         <code>INACTIVE</code>. <code>ACTIVE</code> indicates that you can
     *         register container instances with the cluster and the associated
     *         instances can accept tasks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The number of container instances registered into the cluster.
     *
     * @return The number of container instances registered into the cluster.
     */
    public Integer getRegisteredContainerInstancesCount() {
        return registeredContainerInstancesCount;
    }
    
    /**
     * The number of container instances registered into the cluster.
     *
     * @param registeredContainerInstancesCount The number of container instances registered into the cluster.
     */
    public void setRegisteredContainerInstancesCount(Integer registeredContainerInstancesCount) {
        this.registeredContainerInstancesCount = registeredContainerInstancesCount;
    }
    
    /**
     * The number of container instances registered into the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registeredContainerInstancesCount The number of container instances registered into the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withRegisteredContainerInstancesCount(Integer registeredContainerInstancesCount) {
        this.registeredContainerInstancesCount = registeredContainerInstancesCount;
        return this;
    }

    /**
     * The number of tasks in the cluster that are in the
     * <code>RUNNING</code> state.
     *
     * @return The number of tasks in the cluster that are in the
     *         <code>RUNNING</code> state.
     */
    public Integer getRunningTasksCount() {
        return runningTasksCount;
    }
    
    /**
     * The number of tasks in the cluster that are in the
     * <code>RUNNING</code> state.
     *
     * @param runningTasksCount The number of tasks in the cluster that are in the
     *         <code>RUNNING</code> state.
     */
    public void setRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
    }
    
    /**
     * The number of tasks in the cluster that are in the
     * <code>RUNNING</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param runningTasksCount The number of tasks in the cluster that are in the
     *         <code>RUNNING</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
        return this;
    }

    /**
     * The number of tasks in the cluster that are in the
     * <code>PENDING</code> state.
     *
     * @return The number of tasks in the cluster that are in the
     *         <code>PENDING</code> state.
     */
    public Integer getPendingTasksCount() {
        return pendingTasksCount;
    }
    
    /**
     * The number of tasks in the cluster that are in the
     * <code>PENDING</code> state.
     *
     * @param pendingTasksCount The number of tasks in the cluster that are in the
     *         <code>PENDING</code> state.
     */
    public void setPendingTasksCount(Integer pendingTasksCount) {
        this.pendingTasksCount = pendingTasksCount;
    }
    
    /**
     * The number of tasks in the cluster that are in the
     * <code>PENDING</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingTasksCount The number of tasks in the cluster that are in the
     *         <code>PENDING</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withPendingTasksCount(Integer pendingTasksCount) {
        this.pendingTasksCount = pendingTasksCount;
        return this;
    }

    /**
     * The number of services that are running on the cluster in an
     * <code>ACTIVE</code> state. You can view these services with
     * <a>ListServices</a>.
     *
     * @return The number of services that are running on the cluster in an
     *         <code>ACTIVE</code> state. You can view these services with
     *         <a>ListServices</a>.
     */
    public Integer getActiveServicesCount() {
        return activeServicesCount;
    }
    
    /**
     * The number of services that are running on the cluster in an
     * <code>ACTIVE</code> state. You can view these services with
     * <a>ListServices</a>.
     *
     * @param activeServicesCount The number of services that are running on the cluster in an
     *         <code>ACTIVE</code> state. You can view these services with
     *         <a>ListServices</a>.
     */
    public void setActiveServicesCount(Integer activeServicesCount) {
        this.activeServicesCount = activeServicesCount;
    }
    
    /**
     * The number of services that are running on the cluster in an
     * <code>ACTIVE</code> state. You can view these services with
     * <a>ListServices</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activeServicesCount The number of services that are running on the cluster in an
     *         <code>ACTIVE</code> state. You can view these services with
     *         <a>ListServices</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Cluster withActiveServicesCount(Integer activeServicesCount) {
        this.activeServicesCount = activeServicesCount;
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
        if (getClusterArn() != null) sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getClusterName() != null) sb.append("ClusterName: " + getClusterName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getRegisteredContainerInstancesCount() != null) sb.append("RegisteredContainerInstancesCount: " + getRegisteredContainerInstancesCount() + ",");
        if (getRunningTasksCount() != null) sb.append("RunningTasksCount: " + getRunningTasksCount() + ",");
        if (getPendingTasksCount() != null) sb.append("PendingTasksCount: " + getPendingTasksCount() + ",");
        if (getActiveServicesCount() != null) sb.append("ActiveServicesCount: " + getActiveServicesCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode()); 
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getRegisteredContainerInstancesCount() == null) ? 0 : getRegisteredContainerInstancesCount().hashCode()); 
        hashCode = prime * hashCode + ((getRunningTasksCount() == null) ? 0 : getRunningTasksCount().hashCode()); 
        hashCode = prime * hashCode + ((getPendingTasksCount() == null) ? 0 : getPendingTasksCount().hashCode()); 
        hashCode = prime * hashCode + ((getActiveServicesCount() == null) ? 0 : getActiveServicesCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Cluster == false) return false;
        Cluster other = (Cluster)obj;
        
        if (other.getClusterArn() == null ^ this.getClusterArn() == null) return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false) return false; 
        if (other.getClusterName() == null ^ this.getClusterName() == null) return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getRegisteredContainerInstancesCount() == null ^ this.getRegisteredContainerInstancesCount() == null) return false;
        if (other.getRegisteredContainerInstancesCount() != null && other.getRegisteredContainerInstancesCount().equals(this.getRegisteredContainerInstancesCount()) == false) return false; 
        if (other.getRunningTasksCount() == null ^ this.getRunningTasksCount() == null) return false;
        if (other.getRunningTasksCount() != null && other.getRunningTasksCount().equals(this.getRunningTasksCount()) == false) return false; 
        if (other.getPendingTasksCount() == null ^ this.getPendingTasksCount() == null) return false;
        if (other.getPendingTasksCount() != null && other.getPendingTasksCount().equals(this.getPendingTasksCount()) == false) return false; 
        if (other.getActiveServicesCount() == null ^ this.getActiveServicesCount() == null) return false;
        if (other.getActiveServicesCount() != null && other.getActiveServicesCount().equals(this.getActiveServicesCount()) == false) return false; 
        return true;
    }
    
    @Override
    public Cluster clone() {
        try {
            return (Cluster) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    