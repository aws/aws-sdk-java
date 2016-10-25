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
public class RegisterTaskDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     */
    private String taskRoleArn;
    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, and <code>host</code>.
     * </p>
     * <p>
     * The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>, you
     * cannot specify port mappings in your container definitions, and the task's containers do not have external
     * connectivity. The <code>host</code> network mode offers the highest networking performance for containers because
     * they use the host network stack instead of the virtualized network stack provided by the <code>bridge</code>
     * mode; however, exposed container ports are mapped directly to the corresponding host port, so you cannot take
     * advantage of dynamic host port mappings or run multiple instantiations of the same task on a single container
     * instance if port mappings are used.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     */
    private String networkMode;
    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContainerDefinition> containerDefinitions;
    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Volume> volumes;

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param family
     *        You must specify a <code>family</code> for a task definition, which allows you to track multiple versions
     *        of the same task definition. The <code>family</code> is used as a name for your task definition. Up to 255
     *        letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @return You must specify a <code>family</code> for a task definition, which allows you to track multiple versions
     *         of the same task definition. The <code>family</code> is used as a name for your task definition. Up to
     *         255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param family
     *        You must specify a <code>family</code> for a task definition, which allows you to track multiple versions
     *        of the same task definition. The <code>family</code> is used as a name for your task definition. Up to 255
     *        letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @param taskRoleArn
     *        The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume.
     *        All containers in this task are granted the permissions that are specified in this role. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for
     *        Tasks</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     */

    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can
     *         assume. All containers in this task are granted the permissions that are specified in this role. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for
     *         Tasks</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     */

    public String getTaskRoleArn() {
        return this.taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @param taskRoleArn
     *        The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume.
     *        All containers in this task are granted the permissions that are specified in this role. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for
     *        Tasks</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withTaskRoleArn(String taskRoleArn) {
        setTaskRoleArn(taskRoleArn);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, and <code>host</code>.
     * </p>
     * <p>
     * The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>, you
     * cannot specify port mappings in your container definitions, and the task's containers do not have external
     * connectivity. The <code>host</code> network mode offers the highest networking performance for containers because
     * they use the host network stack instead of the virtualized network stack provided by the <code>bridge</code>
     * mode; however, exposed container ports are mapped directly to the corresponding host port, so you cannot take
     * advantage of dynamic host port mappings or run multiple instantiations of the same task on a single container
     * instance if port mappings are used.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, and <code>host</code>. </p>
     *        <p>
     *        The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>,
     *        you cannot specify port mappings in your container definitions, and the task's containers do not have
     *        external connectivity. The <code>host</code> network mode offers the highest networking performance for
     *        containers because they use the host network stack instead of the virtualized network stack provided by
     *        the <code>bridge</code> mode; however, exposed container ports are mapped directly to the corresponding
     *        host port, so you cannot take advantage of dynamic host port mappings or run multiple instantiations of
     *        the same task on a single container instance if port mappings are used.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, and <code>host</code>.
     * </p>
     * <p>
     * The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>, you
     * cannot specify port mappings in your container definitions, and the task's containers do not have external
     * connectivity. The <code>host</code> network mode offers the highest networking performance for containers because
     * they use the host network stack instead of the virtualized network stack provided by the <code>bridge</code>
     * mode; however, exposed container ports are mapped directly to the corresponding host port, so you cannot take
     * advantage of dynamic host port mappings or run multiple instantiations of the same task on a single container
     * instance if port mappings are used.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @return The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *         <code>bridge</code>, and <code>host</code>. </p>
     *         <p>
     *         The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>,
     *         you cannot specify port mappings in your container definitions, and the task's containers do not have
     *         external connectivity. The <code>host</code> network mode offers the highest networking performance for
     *         containers because they use the host network stack instead of the virtualized network stack provided by
     *         the <code>bridge</code> mode; however, exposed container ports are mapped directly to the corresponding
     *         host port, so you cannot take advantage of dynamic host port mappings or run multiple instantiations of
     *         the same task on a single container instance if port mappings are used.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.docker.com/engine/reference/run/#network-settings">Network settings</a> in the
     *         <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public String getNetworkMode() {
        return this.networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, and <code>host</code>.
     * </p>
     * <p>
     * The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>, you
     * cannot specify port mappings in your container definitions, and the task's containers do not have external
     * connectivity. The <code>host</code> network mode offers the highest networking performance for containers because
     * they use the host network stack instead of the virtualized network stack provided by the <code>bridge</code>
     * mode; however, exposed container ports are mapped directly to the corresponding host port, so you cannot take
     * advantage of dynamic host port mappings or run multiple instantiations of the same task on a single container
     * instance if port mappings are used.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, and <code>host</code>. </p>
     *        <p>
     *        The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>,
     *        you cannot specify port mappings in your container definitions, and the task's containers do not have
     *        external connectivity. The <code>host</code> network mode offers the highest networking performance for
     *        containers because they use the host network stack instead of the virtualized network stack provided by
     *        the <code>bridge</code> mode; however, exposed container ports are mapped directly to the corresponding
     *        host port, so you cannot take advantage of dynamic host port mappings or run multiple instantiations of
     *        the same task on a single container instance if port mappings are used.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkMode
     */

    public RegisterTaskDefinitionRequest withNetworkMode(String networkMode) {
        setNetworkMode(networkMode);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, and <code>host</code>.
     * </p>
     * <p>
     * The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>, you
     * cannot specify port mappings in your container definitions, and the task's containers do not have external
     * connectivity. The <code>host</code> network mode offers the highest networking performance for containers because
     * they use the host network stack instead of the virtualized network stack provided by the <code>bridge</code>
     * mode; however, exposed container ports are mapped directly to the corresponding host port, so you cannot take
     * advantage of dynamic host port mappings or run multiple instantiations of the same task on a single container
     * instance if port mappings are used.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, and <code>host</code>. </p>
     *        <p>
     *        The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>,
     *        you cannot specify port mappings in your container definitions, and the task's containers do not have
     *        external connectivity. The <code>host</code> network mode offers the highest networking performance for
     *        containers because they use the host network stack instead of the virtualized network stack provided by
     *        the <code>bridge</code> mode; however, exposed container ports are mapped directly to the corresponding
     *        host port, so you cannot take advantage of dynamic host port mappings or run multiple instantiations of
     *        the same task on a single container instance if port mappings are used.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public void setNetworkMode(NetworkMode networkMode) {
        this.networkMode = networkMode.toString();
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, and <code>host</code>.
     * </p>
     * <p>
     * The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>, you
     * cannot specify port mappings in your container definitions, and the task's containers do not have external
     * connectivity. The <code>host</code> network mode offers the highest networking performance for containers because
     * they use the host network stack instead of the virtualized network stack provided by the <code>bridge</code>
     * mode; however, exposed container ports are mapped directly to the corresponding host port, so you cannot take
     * advantage of dynamic host port mappings or run multiple instantiations of the same task on a single container
     * instance if port mappings are used.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, and <code>host</code>. </p>
     *        <p>
     *        The default Docker network mode is <code>bridge</code>. If the network mode is set to <code>none</code>,
     *        you cannot specify port mappings in your container definitions, and the task's containers do not have
     *        external connectivity. The <code>host</code> network mode offers the highest networking performance for
     *        containers because they use the host network stack instead of the virtualized network stack provided by
     *        the <code>bridge</code> mode; however, exposed container ports are mapped directly to the corresponding
     *        host port, so you cannot take advantage of dynamic host port mappings or run multiple instantiations of
     *        the same task on a single container instance if port mappings are used.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkMode
     */

    public RegisterTaskDefinitionRequest withNetworkMode(NetworkMode networkMode) {
        setNetworkMode(networkMode);
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * 
     * @return A list of container definitions in JSON format that describe the different containers that make up your
     *         task.
     */

    public java.util.List<ContainerDefinition> getContainerDefinitions() {
        if (containerDefinitions == null) {
            containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>();
        }
        return containerDefinitions;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task.
     */

    public void setContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
            return;
        }

        this.containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>(containerDefinitions);
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerDefinitions(java.util.Collection)} or {@link #withContainerDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withContainerDefinitions(ContainerDefinition... containerDefinitions) {
        if (this.containerDefinitions == null) {
            setContainerDefinitions(new com.amazonaws.internal.SdkInternalList<ContainerDefinition>(containerDefinitions.length));
        }
        for (ContainerDefinition ele : containerDefinitions) {
            this.containerDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * 
     * @return A list of volume definitions in JSON format that containers in your task may use.
     */

    public java.util.List<Volume> getVolumes() {
        if (volumes == null) {
            volumes = new com.amazonaws.internal.SdkInternalList<Volume>();
        }
        return volumes;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in your task may use.
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new com.amazonaws.internal.SdkInternalList<Volume>(volumes);
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in your task may use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new com.amazonaws.internal.SdkInternalList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in your task may use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
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
        if (getFamily() != null)
            sb.append("Family: " + getFamily() + ",");
        if (getTaskRoleArn() != null)
            sb.append("TaskRoleArn: " + getTaskRoleArn() + ",");
        if (getNetworkMode() != null)
            sb.append("NetworkMode: " + getNetworkMode() + ",");
        if (getContainerDefinitions() != null)
            sb.append("ContainerDefinitions: " + getContainerDefinitions() + ",");
        if (getVolumes() != null)
            sb.append("Volumes: " + getVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTaskDefinitionRequest == false)
            return false;
        RegisterTaskDefinitionRequest other = (RegisterTaskDefinitionRequest) obj;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getTaskRoleArn() == null ^ this.getTaskRoleArn() == null)
            return false;
        if (other.getTaskRoleArn() != null && other.getTaskRoleArn().equals(this.getTaskRoleArn()) == false)
            return false;
        if (other.getNetworkMode() == null ^ this.getNetworkMode() == null)
            return false;
        if (other.getNetworkMode() != null && other.getNetworkMode().equals(this.getNetworkMode()) == false)
            return false;
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkMode() == null) ? 0 : getNetworkMode().hashCode());
        hashCode = prime * hashCode + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTaskDefinitionRequest clone() {
        return (RegisterTaskDefinitionRequest) super.clone();
    }
}
