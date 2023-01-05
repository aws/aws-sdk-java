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
 * Contains information about the task in an ECS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EcsTaskDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsTaskDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     */
    private String definitionArn;
    /**
     * <p>
     * The version counter for the task.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The Unix timestamp for the time when the task was created.
     * </p>
     */
    private java.util.Date taskCreatedAt;
    /**
     * <p>
     * The Unix timestamp for the time when the task started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * Contains the tag specified when a task is started.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The tags of the ECS Task.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The list of data volume definitions for the task.
     * </p>
     */
    private java.util.List<Volume> volumes;
    /**
     * <p>
     * The containers that's associated with the task.
     * </p>
     */
    private java.util.List<Container> containers;
    /**
     * <p>
     * The name of the task group that's associated with the task.
     * </p>
     */
    private String group;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the task.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     * 
     * @param definitionArn
     *        The ARN of the task definition that creates the task.
     */

    public void setDefinitionArn(String definitionArn) {
        this.definitionArn = definitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     * 
     * @return The ARN of the task definition that creates the task.
     */

    public String getDefinitionArn() {
        return this.definitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     * 
     * @param definitionArn
     *        The ARN of the task definition that creates the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withDefinitionArn(String definitionArn) {
        setDefinitionArn(definitionArn);
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

    public EcsTaskDetails withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task was created.
     * </p>
     * 
     * @param taskCreatedAt
     *        The Unix timestamp for the time when the task was created.
     */

    public void setTaskCreatedAt(java.util.Date taskCreatedAt) {
        this.taskCreatedAt = taskCreatedAt;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task was created.
     * </p>
     * 
     * @return The Unix timestamp for the time when the task was created.
     */

    public java.util.Date getTaskCreatedAt() {
        return this.taskCreatedAt;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task was created.
     * </p>
     * 
     * @param taskCreatedAt
     *        The Unix timestamp for the time when the task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withTaskCreatedAt(java.util.Date taskCreatedAt) {
        setTaskCreatedAt(taskCreatedAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task started.
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp for the time when the task started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task started.
     * </p>
     * 
     * @return The Unix timestamp for the time when the task started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for the time when the task started.
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp for the time when the task started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * Contains the tag specified when a task is started.
     * </p>
     * 
     * @param startedBy
     *        Contains the tag specified when a task is started.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * Contains the tag specified when a task is started.
     * </p>
     * 
     * @return Contains the tag specified when a task is started.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * Contains the tag specified when a task is started.
     * </p>
     * 
     * @param startedBy
     *        Contains the tag specified when a task is started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The tags of the ECS Task.
     * </p>
     * 
     * @return The tags of the ECS Task.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the ECS Task.
     * </p>
     * 
     * @param tags
     *        The tags of the ECS Task.
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
     * The tags of the ECS Task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags of the ECS Task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withTags(Tag... tags) {
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
     * The tags of the ECS Task.
     * </p>
     * 
     * @param tags
     *        The tags of the ECS Task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The list of data volume definitions for the task.
     * </p>
     * 
     * @return The list of data volume definitions for the task.
     */

    public java.util.List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * The list of data volume definitions for the task.
     * </p>
     * 
     * @param volumes
     *        The list of data volume definitions for the task.
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<Volume>(volumes);
    }

    /**
     * <p>
     * The list of data volume definitions for the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        The list of data volume definitions for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new java.util.ArrayList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of data volume definitions for the task.
     * </p>
     * 
     * @param volumes
     *        The list of data volume definitions for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The containers that's associated with the task.
     * </p>
     * 
     * @return The containers that's associated with the task.
     */

    public java.util.List<Container> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The containers that's associated with the task.
     * </p>
     * 
     * @param containers
     *        The containers that's associated with the task.
     */

    public void setContainers(java.util.Collection<Container> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<Container>(containers);
    }

    /**
     * <p>
     * The containers that's associated with the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The containers that's associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withContainers(Container... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<Container>(containers.length));
        }
        for (Container ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The containers that's associated with the task.
     * </p>
     * 
     * @param containers
     *        The containers that's associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withContainers(java.util.Collection<Container> containers) {
        setContainers(containers);
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

    public EcsTaskDetails withGroup(String group) {
        setGroup(group);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDefinitionArn() != null)
            sb.append("DefinitionArn: ").append(getDefinitionArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getTaskCreatedAt() != null)
            sb.append("TaskCreatedAt: ").append(getTaskCreatedAt()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsTaskDetails == false)
            return false;
        EcsTaskDetails other = (EcsTaskDetails) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDefinitionArn() == null ^ this.getDefinitionArn() == null)
            return false;
        if (other.getDefinitionArn() != null && other.getDefinitionArn().equals(this.getDefinitionArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getTaskCreatedAt() == null ^ this.getTaskCreatedAt() == null)
            return false;
        if (other.getTaskCreatedAt() != null && other.getTaskCreatedAt().equals(this.getTaskCreatedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDefinitionArn() == null) ? 0 : getDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getTaskCreatedAt() == null) ? 0 : getTaskCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        return hashCode;
    }

    @Override
    public EcsTaskDetails clone() {
        try {
            return (EcsTaskDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.EcsTaskDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
