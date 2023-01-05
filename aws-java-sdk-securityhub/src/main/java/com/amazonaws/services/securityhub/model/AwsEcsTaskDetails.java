/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a task in a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     */
    private String taskDefinitionArn;
    /**
     * <p>
     * The version counter for the task.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The Unix timestamp for the time when the task was created. More specifically, it's for the time when the task
     * entered the <code>PENDING</code> state.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * The Unix timestamp for the time when the task started. More specifically, it's for the time when the task
     * transitioned from the <code>PENDING</code> state to the <code>RUNNING</code> state.
     * </p>
     */
    private String startedAt;
    /**
     * <p>
     * The tag specified when a task is started. If an Amazon ECS service started the task, the <code>startedBy</code>
     * parameter contains the deployment ID of that service.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The name of the task group that's associated with the task.
     * </p>
     */
    private String group;
    /**
     * <p>
     * Details about the data volume that is used in a task definition.
     * </p>
     */
    private java.util.List<AwsEcsTaskVolumeDetails> volumes;
    /**
     * <p>
     * The containers that are associated with the task.
     * </p>
     */
    private java.util.List<AwsEcsContainerDetails> containers;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster that hosts the task.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster that hosts the task.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster that hosts the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The ARN of the task definition that creates the task.
     */

    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     * 
     * @return The ARN of the task definition that creates the task.
     */

    public String getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The ARN of the task definition that creates the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withTaskDefinitionArn(String taskDefinitionArn) {
        setTaskDefinitionArn(taskDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The version counter for the task.
     * </p>
     * 
     * @param version
     *        The version counter for the task.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version counter for the task.
     * </p>
     * 
     * @return The version counter for the task.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version counter for the task.
     * </p>
     * 
     * @param version
     *        The version counter for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task was created. More specifically, it's for the time when the task
     * entered the <code>PENDING</code> state.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for the time when the task was created. More specifically, it's for the time when the
     *        task entered the <code>PENDING</code> state.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task was created. More specifically, it's for the time when the task
     * entered the <code>PENDING</code> state.
     * </p>
     * 
     * @return The Unix timestamp for the time when the task was created. More specifically, it's for the time when the
     *         task entered the <code>PENDING</code> state.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task was created. More specifically, it's for the time when the task
     * entered the <code>PENDING</code> state.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for the time when the task was created. More specifically, it's for the time when the
     *        task entered the <code>PENDING</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task started. More specifically, it's for the time when the task
     * transitioned from the <code>PENDING</code> state to the <code>RUNNING</code> state.
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp for the time when the task started. More specifically, it's for the time when the task
     *        transitioned from the <code>PENDING</code> state to the <code>RUNNING</code> state.
     */

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task started. More specifically, it's for the time when the task
     * transitioned from the <code>PENDING</code> state to the <code>RUNNING</code> state.
     * </p>
     * 
     * @return The Unix timestamp for the time when the task started. More specifically, it's for the time when the task
     *         transitioned from the <code>PENDING</code> state to the <code>RUNNING</code> state.
     */

    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task started. More specifically, it's for the time when the task
     * transitioned from the <code>PENDING</code> state to the <code>RUNNING</code> state.
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp for the time when the task started. More specifically, it's for the time when the task
     *        transitioned from the <code>PENDING</code> state to the <code>RUNNING</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withStartedAt(String startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The tag specified when a task is started. If an Amazon ECS service started the task, the <code>startedBy</code>
     * parameter contains the deployment ID of that service.
     * </p>
     * 
     * @param startedBy
     *        The tag specified when a task is started. If an Amazon ECS service started the task, the
     *        <code>startedBy</code> parameter contains the deployment ID of that service.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The tag specified when a task is started. If an Amazon ECS service started the task, the <code>startedBy</code>
     * parameter contains the deployment ID of that service.
     * </p>
     * 
     * @return The tag specified when a task is started. If an Amazon ECS service started the task, the
     *         <code>startedBy</code> parameter contains the deployment ID of that service.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * The tag specified when a task is started. If an Amazon ECS service started the task, the <code>startedBy</code>
     * parameter contains the deployment ID of that service.
     * </p>
     * 
     * @param startedBy
     *        The tag specified when a task is started. If an Amazon ECS service started the task, the
     *        <code>startedBy</code> parameter contains the deployment ID of that service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The name of the task group that's associated with the task.
     * </p>
     * 
     * @param group
     *        The name of the task group that's associated with the task.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the task group that's associated with the task.
     * </p>
     * 
     * @return The name of the task group that's associated with the task.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name of the task group that's associated with the task.
     * </p>
     * 
     * @param group
     *        The name of the task group that's associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * Details about the data volume that is used in a task definition.
     * </p>
     * 
     * @return Details about the data volume that is used in a task definition.
     */

    public java.util.List<AwsEcsTaskVolumeDetails> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * Details about the data volume that is used in a task definition.
     * </p>
     * 
     * @param volumes
     *        Details about the data volume that is used in a task definition.
     */

    public void setVolumes(java.util.Collection<AwsEcsTaskVolumeDetails> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<AwsEcsTaskVolumeDetails>(volumes);
    }

    /**
     * <p>
     * Details about the data volume that is used in a task definition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        Details about the data volume that is used in a task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withVolumes(AwsEcsTaskVolumeDetails... volumes) {
        if (this.volumes == null) {
            setVolumes(new java.util.ArrayList<AwsEcsTaskVolumeDetails>(volumes.length));
        }
        for (AwsEcsTaskVolumeDetails ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the data volume that is used in a task definition.
     * </p>
     * 
     * @param volumes
     *        Details about the data volume that is used in a task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withVolumes(java.util.Collection<AwsEcsTaskVolumeDetails> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The containers that are associated with the task.
     * </p>
     * 
     * @return The containers that are associated with the task.
     */

    public java.util.List<AwsEcsContainerDetails> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The containers that are associated with the task.
     * </p>
     * 
     * @param containers
     *        The containers that are associated with the task.
     */

    public void setContainers(java.util.Collection<AwsEcsContainerDetails> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<AwsEcsContainerDetails>(containers);
    }

    /**
     * <p>
     * The containers that are associated with the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The containers that are associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withContainers(AwsEcsContainerDetails... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<AwsEcsContainerDetails>(containers.length));
        }
        for (AwsEcsContainerDetails ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The containers that are associated with the task.
     * </p>
     * 
     * @param containers
     *        The containers that are associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDetails withContainers(java.util.Collection<AwsEcsContainerDetails> containers) {
        setContainers(containers);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getTaskDefinitionArn() != null)
            sb.append("TaskDefinitionArn: ").append(getTaskDefinitionArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDetails == false)
            return false;
        AwsEcsTaskDetails other = (AwsEcsTaskDetails) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDetails clone() {
        try {
            return (AwsEcsTaskDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
