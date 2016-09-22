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

/**
 * <p>
 * Details of a task definition.
 * </p>
 */
public class TaskDefinition implements Serializable, Cloneable {

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     */
    private String taskDefinitionArn;
    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task. For
     * more information about container definition parameters and defaults, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContainerDefinition> containerDefinitions;
    /**
     * <p>
     * The family of your task definition, used as the definition name.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role.
     * </p>
     */
    private String taskRoleArn;
    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, and <code>host</code>.
     * </p>
     * <p>
     * If the network mode is <code>none</code>, the containers do not have external connectivity. The default Docker
     * network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest networking performance
     * for containers because it uses the host network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     */
    private String networkMode;
    /**
     * <p>
     * The revision of the task in a particular family. The revision is a version number of a task definition in a
     * family. When you register a task definition for the first time, the revision is <code>1</code>; each time you
     * register a new revision of a task definition in the same family, the revision value always increases by one (even
     * if you have deregistered previous revisions in this family).
     * </p>
     */
    private Integer revision;
    /**
     * <p>
     * The list of volumes in a task. For more information about volume definition parameters and defaults, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Volume> volumes;
    /**
     * <p>
     * The status of the task definition.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The container instance attributes required by your task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Attribute> requiresAttributes;

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The full Amazon Resource Name (ARN) of the task definition.
     */

    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     * 
     * @return The full Amazon Resource Name (ARN) of the task definition.
     */

    public String getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The full Amazon Resource Name (ARN) of the task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withTaskDefinitionArn(String taskDefinitionArn) {
        setTaskDefinitionArn(taskDefinitionArn);
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task. For
     * more information about container definition parameters and defaults, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @return A list of container definitions in JSON format that describe the different containers that make up your
     *         task. For more information about container definition parameters and defaults, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *         Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     */

    public java.util.List<ContainerDefinition> getContainerDefinitions() {
        if (containerDefinitions == null) {
            containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>();
        }
        return containerDefinitions;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task. For
     * more information about container definition parameters and defaults, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task. For more information about container definition parameters and defaults, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *        Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
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
     * A list of container definitions in JSON format that describe the different containers that make up your task. For
     * more information about container definition parameters and defaults, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerDefinitions(java.util.Collection)} or {@link #withContainerDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task. For more information about container definition parameters and defaults, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *        Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withContainerDefinitions(ContainerDefinition... containerDefinitions) {
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
     * A list of container definitions in JSON format that describe the different containers that make up your task. For
     * more information about container definition parameters and defaults, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task. For more information about container definition parameters and defaults, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *        Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * The family of your task definition, used as the definition name.
     * </p>
     * 
     * @param family
     *        The family of your task definition, used as the definition name.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The family of your task definition, used as the definition name.
     * </p>
     * 
     * @return The family of your task definition, used as the definition name.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The family of your task definition, used as the definition name.
     * </p>
     * 
     * @param family
     *        The family of your task definition, used as the definition name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role.
     * </p>
     * 
     * @param taskRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in
     *        this task are granted the permissions that are specified in this role.
     */

    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in
     *         this task are granted the permissions that are specified in this role.
     */

    public String getTaskRoleArn() {
        return this.taskRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role.
     * </p>
     * 
     * @param taskRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in
     *        this task are granted the permissions that are specified in this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withTaskRoleArn(String taskRoleArn) {
        setTaskRoleArn(taskRoleArn);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, and <code>host</code>.
     * </p>
     * <p>
     * If the network mode is <code>none</code>, the containers do not have external connectivity. The default Docker
     * network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest networking performance
     * for containers because it uses the host network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
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
     *        If the network mode is <code>none</code>, the containers do not have external connectivity. The default
     *        Docker network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest
     *        networking performance for containers because it uses the host network stack instead of the virtualized
     *        network stack provided by the <code>bridge</code> mode.
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
     * If the network mode is <code>none</code>, the containers do not have external connectivity. The default Docker
     * network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest networking performance
     * for containers because it uses the host network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @return The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *         <code>bridge</code>, and <code>host</code>. </p>
     *         <p>
     *         If the network mode is <code>none</code>, the containers do not have external connectivity. The default
     *         Docker network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest
     *         networking performance for containers because it uses the host network stack instead of the virtualized
     *         network stack provided by the <code>bridge</code> mode.
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
     * If the network mode is <code>none</code>, the containers do not have external connectivity. The default Docker
     * network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest networking performance
     * for containers because it uses the host network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
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
     *        If the network mode is <code>none</code>, the containers do not have external connectivity. The default
     *        Docker network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest
     *        networking performance for containers because it uses the host network stack instead of the virtualized
     *        network stack provided by the <code>bridge</code> mode.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkMode
     */

    public TaskDefinition withNetworkMode(String networkMode) {
        setNetworkMode(networkMode);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, and <code>host</code>.
     * </p>
     * <p>
     * If the network mode is <code>none</code>, the containers do not have external connectivity. The default Docker
     * network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest networking performance
     * for containers because it uses the host network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
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
     *        If the network mode is <code>none</code>, the containers do not have external connectivity. The default
     *        Docker network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest
     *        networking performance for containers because it uses the host network stack instead of the virtualized
     *        network stack provided by the <code>bridge</code> mode.
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
     * If the network mode is <code>none</code>, the containers do not have external connectivity. The default Docker
     * network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest networking performance
     * for containers because it uses the host network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
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
     *        If the network mode is <code>none</code>, the containers do not have external connectivity. The default
     *        Docker network mode is <code>bridge</code>. The <code>host</code> network mode offers the highest
     *        networking performance for containers because it uses the host network stack instead of the virtualized
     *        network stack provided by the <code>bridge</code> mode.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkMode
     */

    public TaskDefinition withNetworkMode(NetworkMode networkMode) {
        setNetworkMode(networkMode);
        return this;
    }

    /**
     * <p>
     * The revision of the task in a particular family. The revision is a version number of a task definition in a
     * family. When you register a task definition for the first time, the revision is <code>1</code>; each time you
     * register a new revision of a task definition in the same family, the revision value always increases by one (even
     * if you have deregistered previous revisions in this family).
     * </p>
     * 
     * @param revision
     *        The revision of the task in a particular family. The revision is a version number of a task definition in
     *        a family. When you register a task definition for the first time, the revision is <code>1</code>; each
     *        time you register a new revision of a task definition in the same family, the revision value always
     *        increases by one (even if you have deregistered previous revisions in this family).
     */

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the task in a particular family. The revision is a version number of a task definition in a
     * family. When you register a task definition for the first time, the revision is <code>1</code>; each time you
     * register a new revision of a task definition in the same family, the revision value always increases by one (even
     * if you have deregistered previous revisions in this family).
     * </p>
     * 
     * @return The revision of the task in a particular family. The revision is a version number of a task definition in
     *         a family. When you register a task definition for the first time, the revision is <code>1</code>; each
     *         time you register a new revision of a task definition in the same family, the revision value always
     *         increases by one (even if you have deregistered previous revisions in this family).
     */

    public Integer getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the task in a particular family. The revision is a version number of a task definition in a
     * family. When you register a task definition for the first time, the revision is <code>1</code>; each time you
     * register a new revision of a task definition in the same family, the revision value always increases by one (even
     * if you have deregistered previous revisions in this family).
     * </p>
     * 
     * @param revision
     *        The revision of the task in a particular family. The revision is a version number of a task definition in
     *        a family. When you register a task definition for the first time, the revision is <code>1</code>; each
     *        time you register a new revision of a task definition in the same family, the revision value always
     *        increases by one (even if you have deregistered previous revisions in this family).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withRevision(Integer revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The list of volumes in a task. For more information about volume definition parameters and defaults, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The list of volumes in a task. For more information about volume definition parameters and defaults, see
     *         <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *         Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     */

    public java.util.List<Volume> getVolumes() {
        if (volumes == null) {
            volumes = new com.amazonaws.internal.SdkInternalList<Volume>();
        }
        return volumes;
    }

    /**
     * <p>
     * The list of volumes in a task. For more information about volume definition parameters and defaults, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @param volumes
     *        The list of volumes in a task. For more information about volume definition parameters and defaults, see
     *        <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *        Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
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
     * The list of volumes in a task. For more information about volume definition parameters and defaults, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        The list of volumes in a task. For more information about volume definition parameters and defaults, see
     *        <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *        Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withVolumes(Volume... volumes) {
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
     * The list of volumes in a task. For more information about volume definition parameters and defaults, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @param volumes
     *        The list of volumes in a task. For more information about volume definition parameters and defaults, see
     *        <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     *        Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * 
     * @param status
     *        The status of the task definition.
     * @see TaskDefinitionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * 
     * @return The status of the task definition.
     * @see TaskDefinitionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * 
     * @param status
     *        The status of the task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionStatus
     */

    public TaskDefinition withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * 
     * @param status
     *        The status of the task definition.
     * @see TaskDefinitionStatus
     */

    public void setStatus(TaskDefinitionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * 
     * @param status
     *        The status of the task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskDefinitionStatus
     */

    public TaskDefinition withStatus(TaskDefinitionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The container instance attributes required by your task.
     * </p>
     * 
     * @return The container instance attributes required by your task.
     */

    public java.util.List<Attribute> getRequiresAttributes() {
        if (requiresAttributes == null) {
            requiresAttributes = new com.amazonaws.internal.SdkInternalList<Attribute>();
        }
        return requiresAttributes;
    }

    /**
     * <p>
     * The container instance attributes required by your task.
     * </p>
     * 
     * @param requiresAttributes
     *        The container instance attributes required by your task.
     */

    public void setRequiresAttributes(java.util.Collection<Attribute> requiresAttributes) {
        if (requiresAttributes == null) {
            this.requiresAttributes = null;
            return;
        }

        this.requiresAttributes = new com.amazonaws.internal.SdkInternalList<Attribute>(requiresAttributes);
    }

    /**
     * <p>
     * The container instance attributes required by your task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiresAttributes(java.util.Collection)} or {@link #withRequiresAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param requiresAttributes
     *        The container instance attributes required by your task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withRequiresAttributes(Attribute... requiresAttributes) {
        if (this.requiresAttributes == null) {
            setRequiresAttributes(new com.amazonaws.internal.SdkInternalList<Attribute>(requiresAttributes.length));
        }
        for (Attribute ele : requiresAttributes) {
            this.requiresAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container instance attributes required by your task.
     * </p>
     * 
     * @param requiresAttributes
     *        The container instance attributes required by your task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskDefinition withRequiresAttributes(java.util.Collection<Attribute> requiresAttributes) {
        setRequiresAttributes(requiresAttributes);
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
        if (getTaskDefinitionArn() != null)
            sb.append("TaskDefinitionArn: " + getTaskDefinitionArn() + ",");
        if (getContainerDefinitions() != null)
            sb.append("ContainerDefinitions: " + getContainerDefinitions() + ",");
        if (getFamily() != null)
            sb.append("Family: " + getFamily() + ",");
        if (getTaskRoleArn() != null)
            sb.append("TaskRoleArn: " + getTaskRoleArn() + ",");
        if (getNetworkMode() != null)
            sb.append("NetworkMode: " + getNetworkMode() + ",");
        if (getRevision() != null)
            sb.append("Revision: " + getRevision() + ",");
        if (getVolumes() != null)
            sb.append("Volumes: " + getVolumes() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getRequiresAttributes() != null)
            sb.append("RequiresAttributes: " + getRequiresAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskDefinition == false)
            return false;
        TaskDefinition other = (TaskDefinition) obj;
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false)
            return false;
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
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequiresAttributes() == null ^ this.getRequiresAttributes() == null)
            return false;
        if (other.getRequiresAttributes() != null && other.getRequiresAttributes().equals(this.getRequiresAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkMode() == null) ? 0 : getNetworkMode().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequiresAttributes() == null) ? 0 : getRequiresAttributes().hashCode());
        return hashCode;
    }

    @Override
    public TaskDefinition clone() {
        try {
            return (TaskDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
