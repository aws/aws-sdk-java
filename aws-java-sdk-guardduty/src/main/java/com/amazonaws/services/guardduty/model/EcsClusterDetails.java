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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the details of the ECS Cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EcsClusterDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsClusterDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the ECS Cluster.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the ECS cluster.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The number of services that are running on the cluster in an ACTIVE state.
     * </p>
     */
    private Integer activeServicesCount;
    /**
     * <p>
     * The number of container instances registered into the cluster.
     * </p>
     */
    private Integer registeredContainerInstancesCount;
    /**
     * <p>
     * The number of tasks in the cluster that are in the RUNNING state.
     * </p>
     */
    private Integer runningTasksCount;
    /**
     * <p>
     * The tags of the ECS Cluster.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Contains information about the details of the ECS Task.
     * </p>
     */
    private EcsTaskDetails taskDetails;

    /**
     * <p>
     * The name of the ECS Cluster.
     * </p>
     * 
     * @param name
     *        The name of the ECS Cluster.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ECS Cluster.
     * </p>
     * 
     * @return The name of the ECS Cluster.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ECS Cluster.
     * </p>
     * 
     * @param name
     *        The name of the ECS Cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsClusterDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that identifies the cluster.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the cluster.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that identifies the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsClusterDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the ECS cluster.
     * </p>
     * 
     * @param status
     *        The status of the ECS cluster.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the ECS cluster.
     * </p>
     * 
     * @return The status of the ECS cluster.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the ECS cluster.
     * </p>
     * 
     * @param status
     *        The status of the ECS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsClusterDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The number of services that are running on the cluster in an ACTIVE state.
     * </p>
     * 
     * @param activeServicesCount
     *        The number of services that are running on the cluster in an ACTIVE state.
     */

    public void setActiveServicesCount(Integer activeServicesCount) {
        this.activeServicesCount = activeServicesCount;
    }

    /**
     * <p>
     * The number of services that are running on the cluster in an ACTIVE state.
     * </p>
     * 
     * @return The number of services that are running on the cluster in an ACTIVE state.
     */

    public Integer getActiveServicesCount() {
        return this.activeServicesCount;
    }

    /**
     * <p>
     * The number of services that are running on the cluster in an ACTIVE state.
     * </p>
     * 
     * @param activeServicesCount
     *        The number of services that are running on the cluster in an ACTIVE state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsClusterDetails withActiveServicesCount(Integer activeServicesCount) {
        setActiveServicesCount(activeServicesCount);
        return this;
    }

    /**
     * <p>
     * The number of container instances registered into the cluster.
     * </p>
     * 
     * @param registeredContainerInstancesCount
     *        The number of container instances registered into the cluster.
     */

    public void setRegisteredContainerInstancesCount(Integer registeredContainerInstancesCount) {
        this.registeredContainerInstancesCount = registeredContainerInstancesCount;
    }

    /**
     * <p>
     * The number of container instances registered into the cluster.
     * </p>
     * 
     * @return The number of container instances registered into the cluster.
     */

    public Integer getRegisteredContainerInstancesCount() {
        return this.registeredContainerInstancesCount;
    }

    /**
     * <p>
     * The number of container instances registered into the cluster.
     * </p>
     * 
     * @param registeredContainerInstancesCount
     *        The number of container instances registered into the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsClusterDetails withRegisteredContainerInstancesCount(Integer registeredContainerInstancesCount) {
        setRegisteredContainerInstancesCount(registeredContainerInstancesCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the RUNNING state.
     * </p>
     * 
     * @param runningTasksCount
     *        The number of tasks in the cluster that are in the RUNNING state.
     */

    public void setRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the RUNNING state.
     * </p>
     * 
     * @return The number of tasks in the cluster that are in the RUNNING state.
     */

    public Integer getRunningTasksCount() {
        return this.runningTasksCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the RUNNING state.
     * </p>
     * 
     * @param runningTasksCount
     *        The number of tasks in the cluster that are in the RUNNING state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsClusterDetails withRunningTasksCount(Integer runningTasksCount) {
        setRunningTasksCount(runningTasksCount);
        return this;
    }

    /**
     * <p>
     * The tags of the ECS Cluster.
     * </p>
     * 
     * @return The tags of the ECS Cluster.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the ECS Cluster.
     * </p>
     * 
     * @param tags
     *        The tags of the ECS Cluster.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags of the ECS Cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags of the ECS Cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsClusterDetails withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags of the ECS Cluster.
     * </p>
     * 
     * @param tags
     *        The tags of the ECS Cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsClusterDetails withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Contains information about the details of the ECS Task.
     * </p>
     * 
     * @param taskDetails
     *        Contains information about the details of the ECS Task.
     */

    public void setTaskDetails(EcsTaskDetails taskDetails) {
        this.taskDetails = taskDetails;
    }

    /**
     * <p>
     * Contains information about the details of the ECS Task.
     * </p>
     * 
     * @return Contains information about the details of the ECS Task.
     */

    public EcsTaskDetails getTaskDetails() {
        return this.taskDetails;
    }

    /**
     * <p>
     * Contains information about the details of the ECS Task.
     * </p>
     * 
     * @param taskDetails
     *        Contains information about the details of the ECS Task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsClusterDetails withTaskDetails(EcsTaskDetails taskDetails) {
        setTaskDetails(taskDetails);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getActiveServicesCount() != null)
            sb.append("ActiveServicesCount: ").append(getActiveServicesCount()).append(",");
        if (getRegisteredContainerInstancesCount() != null)
            sb.append("RegisteredContainerInstancesCount: ").append(getRegisteredContainerInstancesCount()).append(",");
        if (getRunningTasksCount() != null)
            sb.append("RunningTasksCount: ").append(getRunningTasksCount()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTaskDetails() != null)
            sb.append("TaskDetails: ").append(getTaskDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsClusterDetails == false)
            return false;
        EcsClusterDetails other = (EcsClusterDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getActiveServicesCount() == null ^ this.getActiveServicesCount() == null)
            return false;
        if (other.getActiveServicesCount() != null && other.getActiveServicesCount().equals(this.getActiveServicesCount()) == false)
            return false;
        if (other.getRegisteredContainerInstancesCount() == null ^ this.getRegisteredContainerInstancesCount() == null)
            return false;
        if (other.getRegisteredContainerInstancesCount() != null
                && other.getRegisteredContainerInstancesCount().equals(this.getRegisteredContainerInstancesCount()) == false)
            return false;
        if (other.getRunningTasksCount() == null ^ this.getRunningTasksCount() == null)
            return false;
        if (other.getRunningTasksCount() != null && other.getRunningTasksCount().equals(this.getRunningTasksCount()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTaskDetails() == null ^ this.getTaskDetails() == null)
            return false;
        if (other.getTaskDetails() != null && other.getTaskDetails().equals(this.getTaskDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getActiveServicesCount() == null) ? 0 : getActiveServicesCount().hashCode());
        hashCode = prime * hashCode + ((getRegisteredContainerInstancesCount() == null) ? 0 : getRegisteredContainerInstancesCount().hashCode());
        hashCode = prime * hashCode + ((getRunningTasksCount() == null) ? 0 : getRunningTasksCount().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTaskDetails() == null) ? 0 : getTaskDetails().hashCode());
        return hashCode;
    }

    @Override
    public EcsClusterDetails clone() {
        try {
            return (EcsClusterDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.EcsClusterDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
