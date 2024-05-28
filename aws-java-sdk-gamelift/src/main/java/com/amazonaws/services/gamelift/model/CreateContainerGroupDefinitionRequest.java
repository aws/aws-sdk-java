/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateContainerGroupDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContainerGroupDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A descriptive identifier for the container group definition. The name value must be unique in an Amazon Web
     * Services Region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The method for deploying the container group across fleet instances. A replica container group might have
     * multiple copies on each fleet instance. A daemon container group has one copy per fleet instance. Default value
     * is <code>REPLICA</code>.
     * </p>
     */
    private String schedulingStrategy;
    /**
     * <p>
     * The maximum amount of memory (in MiB) to allocate to the container group. All containers in the group share this
     * memory. If you specify memory limits for individual containers, set this parameter based on the following
     * guidelines. The value must be (1) greater than the sum of the soft memory limits for all containers in the group,
     * and (2) greater than any individual container's hard memory limit.
     * </p>
     */
    private Integer totalMemoryLimit;
    /**
     * <p>
     * The maximum amount of CPU units to allocate to the container group. Set this parameter to an integer value in CPU
     * units (1 vCPU is equal to 1024 CPU units). All containers in the group share this memory. If you specify CPU
     * limits for individual containers, set this parameter based on the following guidelines. The value must be equal
     * to or greater than the sum of the CPU limits for all containers in the group.
     * </p>
     */
    private Integer totalCpuLimit;
    /**
     * <p>
     * Definitions for all containers in this group. Each container definition identifies the container image and
     * specifies configuration settings for the container. See the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html"> Container fleet
     * design guide</a> for container guidelines.
     * </p>
     */
    private java.util.List<ContainerDefinitionInput> containerDefinitions;
    /**
     * <p>
     * The platform that is used by containers in the container group definition. All containers in a group must run on
     * the same operating system.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * A list of labels to assign to the container group definition resource. Tags are developer-defined key-value
     * pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost
     * allocation. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A descriptive identifier for the container group definition. The name value must be unique in an Amazon Web
     * Services Region.
     * </p>
     * 
     * @param name
     *        A descriptive identifier for the container group definition. The name value must be unique in an Amazon
     *        Web Services Region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive identifier for the container group definition. The name value must be unique in an Amazon Web
     * Services Region.
     * </p>
     * 
     * @return A descriptive identifier for the container group definition. The name value must be unique in an Amazon
     *         Web Services Region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive identifier for the container group definition. The name value must be unique in an Amazon Web
     * Services Region.
     * </p>
     * 
     * @param name
     *        A descriptive identifier for the container group definition. The name value must be unique in an Amazon
     *        Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerGroupDefinitionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The method for deploying the container group across fleet instances. A replica container group might have
     * multiple copies on each fleet instance. A daemon container group has one copy per fleet instance. Default value
     * is <code>REPLICA</code>.
     * </p>
     * 
     * @param schedulingStrategy
     *        The method for deploying the container group across fleet instances. A replica container group might have
     *        multiple copies on each fleet instance. A daemon container group has one copy per fleet instance. Default
     *        value is <code>REPLICA</code>.
     * @see ContainerSchedulingStrategy
     */

    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    /**
     * <p>
     * The method for deploying the container group across fleet instances. A replica container group might have
     * multiple copies on each fleet instance. A daemon container group has one copy per fleet instance. Default value
     * is <code>REPLICA</code>.
     * </p>
     * 
     * @return The method for deploying the container group across fleet instances. A replica container group might have
     *         multiple copies on each fleet instance. A daemon container group has one copy per fleet instance. Default
     *         value is <code>REPLICA</code>.
     * @see ContainerSchedulingStrategy
     */

    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    /**
     * <p>
     * The method for deploying the container group across fleet instances. A replica container group might have
     * multiple copies on each fleet instance. A daemon container group has one copy per fleet instance. Default value
     * is <code>REPLICA</code>.
     * </p>
     * 
     * @param schedulingStrategy
     *        The method for deploying the container group across fleet instances. A replica container group might have
     *        multiple copies on each fleet instance. A daemon container group has one copy per fleet instance. Default
     *        value is <code>REPLICA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerSchedulingStrategy
     */

    public CreateContainerGroupDefinitionRequest withSchedulingStrategy(String schedulingStrategy) {
        setSchedulingStrategy(schedulingStrategy);
        return this;
    }

    /**
     * <p>
     * The method for deploying the container group across fleet instances. A replica container group might have
     * multiple copies on each fleet instance. A daemon container group has one copy per fleet instance. Default value
     * is <code>REPLICA</code>.
     * </p>
     * 
     * @param schedulingStrategy
     *        The method for deploying the container group across fleet instances. A replica container group might have
     *        multiple copies on each fleet instance. A daemon container group has one copy per fleet instance. Default
     *        value is <code>REPLICA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerSchedulingStrategy
     */

    public CreateContainerGroupDefinitionRequest withSchedulingStrategy(ContainerSchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The maximum amount of memory (in MiB) to allocate to the container group. All containers in the group share this
     * memory. If you specify memory limits for individual containers, set this parameter based on the following
     * guidelines. The value must be (1) greater than the sum of the soft memory limits for all containers in the group,
     * and (2) greater than any individual container's hard memory limit.
     * </p>
     * 
     * @param totalMemoryLimit
     *        The maximum amount of memory (in MiB) to allocate to the container group. All containers in the group
     *        share this memory. If you specify memory limits for individual containers, set this parameter based on the
     *        following guidelines. The value must be (1) greater than the sum of the soft memory limits for all
     *        containers in the group, and (2) greater than any individual container's hard memory limit.
     */

    public void setTotalMemoryLimit(Integer totalMemoryLimit) {
        this.totalMemoryLimit = totalMemoryLimit;
    }

    /**
     * <p>
     * The maximum amount of memory (in MiB) to allocate to the container group. All containers in the group share this
     * memory. If you specify memory limits for individual containers, set this parameter based on the following
     * guidelines. The value must be (1) greater than the sum of the soft memory limits for all containers in the group,
     * and (2) greater than any individual container's hard memory limit.
     * </p>
     * 
     * @return The maximum amount of memory (in MiB) to allocate to the container group. All containers in the group
     *         share this memory. If you specify memory limits for individual containers, set this parameter based on
     *         the following guidelines. The value must be (1) greater than the sum of the soft memory limits for all
     *         containers in the group, and (2) greater than any individual container's hard memory limit.
     */

    public Integer getTotalMemoryLimit() {
        return this.totalMemoryLimit;
    }

    /**
     * <p>
     * The maximum amount of memory (in MiB) to allocate to the container group. All containers in the group share this
     * memory. If you specify memory limits for individual containers, set this parameter based on the following
     * guidelines. The value must be (1) greater than the sum of the soft memory limits for all containers in the group,
     * and (2) greater than any individual container's hard memory limit.
     * </p>
     * 
     * @param totalMemoryLimit
     *        The maximum amount of memory (in MiB) to allocate to the container group. All containers in the group
     *        share this memory. If you specify memory limits for individual containers, set this parameter based on the
     *        following guidelines. The value must be (1) greater than the sum of the soft memory limits for all
     *        containers in the group, and (2) greater than any individual container's hard memory limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerGroupDefinitionRequest withTotalMemoryLimit(Integer totalMemoryLimit) {
        setTotalMemoryLimit(totalMemoryLimit);
        return this;
    }

    /**
     * <p>
     * The maximum amount of CPU units to allocate to the container group. Set this parameter to an integer value in CPU
     * units (1 vCPU is equal to 1024 CPU units). All containers in the group share this memory. If you specify CPU
     * limits for individual containers, set this parameter based on the following guidelines. The value must be equal
     * to or greater than the sum of the CPU limits for all containers in the group.
     * </p>
     * 
     * @param totalCpuLimit
     *        The maximum amount of CPU units to allocate to the container group. Set this parameter to an integer value
     *        in CPU units (1 vCPU is equal to 1024 CPU units). All containers in the group share this memory. If you
     *        specify CPU limits for individual containers, set this parameter based on the following guidelines. The
     *        value must be equal to or greater than the sum of the CPU limits for all containers in the group.
     */

    public void setTotalCpuLimit(Integer totalCpuLimit) {
        this.totalCpuLimit = totalCpuLimit;
    }

    /**
     * <p>
     * The maximum amount of CPU units to allocate to the container group. Set this parameter to an integer value in CPU
     * units (1 vCPU is equal to 1024 CPU units). All containers in the group share this memory. If you specify CPU
     * limits for individual containers, set this parameter based on the following guidelines. The value must be equal
     * to or greater than the sum of the CPU limits for all containers in the group.
     * </p>
     * 
     * @return The maximum amount of CPU units to allocate to the container group. Set this parameter to an integer
     *         value in CPU units (1 vCPU is equal to 1024 CPU units). All containers in the group share this memory. If
     *         you specify CPU limits for individual containers, set this parameter based on the following guidelines.
     *         The value must be equal to or greater than the sum of the CPU limits for all containers in the group.
     */

    public Integer getTotalCpuLimit() {
        return this.totalCpuLimit;
    }

    /**
     * <p>
     * The maximum amount of CPU units to allocate to the container group. Set this parameter to an integer value in CPU
     * units (1 vCPU is equal to 1024 CPU units). All containers in the group share this memory. If you specify CPU
     * limits for individual containers, set this parameter based on the following guidelines. The value must be equal
     * to or greater than the sum of the CPU limits for all containers in the group.
     * </p>
     * 
     * @param totalCpuLimit
     *        The maximum amount of CPU units to allocate to the container group. Set this parameter to an integer value
     *        in CPU units (1 vCPU is equal to 1024 CPU units). All containers in the group share this memory. If you
     *        specify CPU limits for individual containers, set this parameter based on the following guidelines. The
     *        value must be equal to or greater than the sum of the CPU limits for all containers in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerGroupDefinitionRequest withTotalCpuLimit(Integer totalCpuLimit) {
        setTotalCpuLimit(totalCpuLimit);
        return this;
    }

    /**
     * <p>
     * Definitions for all containers in this group. Each container definition identifies the container image and
     * specifies configuration settings for the container. See the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html"> Container fleet
     * design guide</a> for container guidelines.
     * </p>
     * 
     * @return Definitions for all containers in this group. Each container definition identifies the container image
     *         and specifies configuration settings for the container. See the <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html"> Container
     *         fleet design guide</a> for container guidelines.
     */

    public java.util.List<ContainerDefinitionInput> getContainerDefinitions() {
        return containerDefinitions;
    }

    /**
     * <p>
     * Definitions for all containers in this group. Each container definition identifies the container image and
     * specifies configuration settings for the container. See the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html"> Container fleet
     * design guide</a> for container guidelines.
     * </p>
     * 
     * @param containerDefinitions
     *        Definitions for all containers in this group. Each container definition identifies the container image and
     *        specifies configuration settings for the container. See the <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html"> Container
     *        fleet design guide</a> for container guidelines.
     */

    public void setContainerDefinitions(java.util.Collection<ContainerDefinitionInput> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
            return;
        }

        this.containerDefinitions = new java.util.ArrayList<ContainerDefinitionInput>(containerDefinitions);
    }

    /**
     * <p>
     * Definitions for all containers in this group. Each container definition identifies the container image and
     * specifies configuration settings for the container. See the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html"> Container fleet
     * design guide</a> for container guidelines.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerDefinitions(java.util.Collection)} or {@link #withContainerDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerDefinitions
     *        Definitions for all containers in this group. Each container definition identifies the container image and
     *        specifies configuration settings for the container. See the <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html"> Container
     *        fleet design guide</a> for container guidelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerGroupDefinitionRequest withContainerDefinitions(ContainerDefinitionInput... containerDefinitions) {
        if (this.containerDefinitions == null) {
            setContainerDefinitions(new java.util.ArrayList<ContainerDefinitionInput>(containerDefinitions.length));
        }
        for (ContainerDefinitionInput ele : containerDefinitions) {
            this.containerDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Definitions for all containers in this group. Each container definition identifies the container image and
     * specifies configuration settings for the container. See the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html"> Container fleet
     * design guide</a> for container guidelines.
     * </p>
     * 
     * @param containerDefinitions
     *        Definitions for all containers in this group. Each container definition identifies the container image and
     *        specifies configuration settings for the container. See the <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html"> Container
     *        fleet design guide</a> for container guidelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerGroupDefinitionRequest withContainerDefinitions(java.util.Collection<ContainerDefinitionInput> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * The platform that is used by containers in the container group definition. All containers in a group must run on
     * the same operating system.
     * </p>
     * 
     * @param operatingSystem
     *        The platform that is used by containers in the container group definition. All containers in a group must
     *        run on the same operating system.
     * @see ContainerOperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The platform that is used by containers in the container group definition. All containers in a group must run on
     * the same operating system.
     * </p>
     * 
     * @return The platform that is used by containers in the container group definition. All containers in a group must
     *         run on the same operating system.
     * @see ContainerOperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The platform that is used by containers in the container group definition. All containers in a group must run on
     * the same operating system.
     * </p>
     * 
     * @param operatingSystem
     *        The platform that is used by containers in the container group definition. All containers in a group must
     *        run on the same operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerOperatingSystem
     */

    public CreateContainerGroupDefinitionRequest withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The platform that is used by containers in the container group definition. All containers in a group must run on
     * the same operating system.
     * </p>
     * 
     * @param operatingSystem
     *        The platform that is used by containers in the container group definition. All containers in a group must
     *        run on the same operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerOperatingSystem
     */

    public CreateContainerGroupDefinitionRequest withOperatingSystem(ContainerOperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the container group definition resource. Tags are developer-defined key-value
     * pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost
     * allocation. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return A list of labels to assign to the container group definition resource. Tags are developer-defined
     *         key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access
     *         management and cost allocation. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web Services
     *         Resources</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of labels to assign to the container group definition resource. Tags are developer-defined key-value
     * pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost
     * allocation. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the container group definition resource. Tags are developer-defined
     *        key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access
     *        management and cost allocation. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web Services
     *        Resources</a> in the <i>Amazon Web Services General Reference</i>.
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
     * A list of labels to assign to the container group definition resource. Tags are developer-defined key-value
     * pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost
     * allocation. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the container group definition resource. Tags are developer-defined
     *        key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access
     *        management and cost allocation. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web Services
     *        Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerGroupDefinitionRequest withTags(Tag... tags) {
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
     * A list of labels to assign to the container group definition resource. Tags are developer-defined key-value
     * pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost
     * allocation. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the container group definition resource. Tags are developer-defined
     *        key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access
     *        management and cost allocation. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web Services
     *        Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerGroupDefinitionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSchedulingStrategy() != null)
            sb.append("SchedulingStrategy: ").append(getSchedulingStrategy()).append(",");
        if (getTotalMemoryLimit() != null)
            sb.append("TotalMemoryLimit: ").append(getTotalMemoryLimit()).append(",");
        if (getTotalCpuLimit() != null)
            sb.append("TotalCpuLimit: ").append(getTotalCpuLimit()).append(",");
        if (getContainerDefinitions() != null)
            sb.append("ContainerDefinitions: ").append(getContainerDefinitions()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContainerGroupDefinitionRequest == false)
            return false;
        CreateContainerGroupDefinitionRequest other = (CreateContainerGroupDefinitionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchedulingStrategy() == null ^ this.getSchedulingStrategy() == null)
            return false;
        if (other.getSchedulingStrategy() != null && other.getSchedulingStrategy().equals(this.getSchedulingStrategy()) == false)
            return false;
        if (other.getTotalMemoryLimit() == null ^ this.getTotalMemoryLimit() == null)
            return false;
        if (other.getTotalMemoryLimit() != null && other.getTotalMemoryLimit().equals(this.getTotalMemoryLimit()) == false)
            return false;
        if (other.getTotalCpuLimit() == null ^ this.getTotalCpuLimit() == null)
            return false;
        if (other.getTotalCpuLimit() != null && other.getTotalCpuLimit().equals(this.getTotalCpuLimit()) == false)
            return false;
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchedulingStrategy() == null) ? 0 : getSchedulingStrategy().hashCode());
        hashCode = prime * hashCode + ((getTotalMemoryLimit() == null) ? 0 : getTotalMemoryLimit().hashCode());
        hashCode = prime * hashCode + ((getTotalCpuLimit() == null) ? 0 : getTotalCpuLimit().hashCode());
        hashCode = prime * hashCode + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateContainerGroupDefinitionRequest clone() {
        return (CreateContainerGroupDefinitionRequest) super.clone();
    }

}
