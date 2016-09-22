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
public class UpdateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The name of the service to update.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     */
    private Integer desiredCount;
    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to run in your service. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon
     * ECS spawns a task with the new version of the task definition and then stops an old task after the new version is
     * running.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     */
    private DeploymentConfiguration deploymentConfiguration;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you
     *        do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you
     *         do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you
     *        do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     * 
     * @param service
     *        The name of the service to update.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     * 
     * @return The name of the service to update.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     * 
     * @param service
     *        The name of the service to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     * 
     * @param desiredCount
     *        The number of instantiations of the task to place and keep running in your service.
     */

    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     * 
     * @return The number of instantiations of the task to place and keep running in your service.
     */

    public Integer getDesiredCount() {
        return this.desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in your service.
     * </p>
     * 
     * @param desiredCount
     *        The number of instantiations of the task to place and keep running in your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withDesiredCount(Integer desiredCount) {
        setDesiredCount(desiredCount);
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to run in your service. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon
     * ECS spawns a task with the new version of the task definition and then stops an old task after the new version is
     * running.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource
     *        Name (ARN) of the task definition to run in your service. If a <code>revision</code> is not specified, the
     *        latest <code>ACTIVE</code> revision is used. If you modify the task definition with
     *        <code>UpdateService</code>, Amazon ECS spawns a task with the new version of the task definition and then
     *        stops an old task after the new version is running.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to run in your service. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon
     * ECS spawns a task with the new version of the task definition and then stops an old task after the new version is
     * running.
     * </p>
     * 
     * @return The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource
     *         Name (ARN) of the task definition to run in your service. If a <code>revision</code> is not specified,
     *         the latest <code>ACTIVE</code> revision is used. If you modify the task definition with
     *         <code>UpdateService</code>, Amazon ECS spawns a task with the new version of the task definition and then
     *         stops an old task after the new version is running.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to run in your service. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used. If you modify the task definition with <code>UpdateService</code>, Amazon
     * ECS spawns a task with the new version of the task definition and then stops an old task after the new version is
     * running.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource
     *        Name (ARN) of the task definition to run in your service. If a <code>revision</code> is not specified, the
     *        latest <code>ACTIVE</code> revision is used. If you modify the task definition with
     *        <code>UpdateService</code>, Amazon ECS spawns a task with the new version of the task definition and then
     *        stops an old task after the new version is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *        stopping and starting tasks.
     */

    public void setDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @return Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *         stopping and starting tasks.
     */

    public DeploymentConfiguration getDeploymentConfiguration() {
        return this.deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *        stopping and starting tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        setDeploymentConfiguration(deploymentConfiguration);
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
        if (getCluster() != null)
            sb.append("Cluster: " + getCluster() + ",");
        if (getService() != null)
            sb.append("Service: " + getService() + ",");
        if (getDesiredCount() != null)
            sb.append("DesiredCount: " + getDesiredCount() + ",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: " + getTaskDefinition() + ",");
        if (getDeploymentConfiguration() != null)
            sb.append("DeploymentConfiguration: " + getDeploymentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceRequest == false)
            return false;
        UpdateServiceRequest other = (UpdateServiceRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceRequest clone() {
        return (UpdateServiceRequest) super.clone();
    }
}
