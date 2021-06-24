/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * details about a task definition. A task definition describes the container and volume definitions of an Amazon
 * Elastic Container Service task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container definitions that describe the containers that make up the task.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsDetails> containerDefinitions;
    /**
     * <p>
     * The number of CPU units used by the task.
     * </p>
     */
    private String cpu;
    /**
     * <p>
     * The ARN of the task execution role that grants the container agent permission to make API calls on behalf of the
     * container user.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The name of a family that this task definition is registered to.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The Elastic Inference accelerators to use for the containers in the task.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionInferenceAcceleratorsDetails> inferenceAccelerators;
    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task.
     * </p>
     */
    private String ipcMode;
    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     */
    private String memory;
    /**
     * <p>
     * The Docker networking mode to use for the containers in the task.
     * </p>
     */
    private String networkMode;
    /**
     * <p>
     * The process namespace to use for the containers in the task.
     * </p>
     */
    private String pidMode;
    /**
     * <p>
     * The placement constraint objects to use for tasks.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionPlacementConstraintsDetails> placementConstraints;
    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     */
    private AwsEcsTaskDefinitionProxyConfigurationDetails proxyConfiguration;
    /**
     * <p>
     * The task launch types that the task definition was validated against.
     * </p>
     */
    private java.util.List<String> requiresCompatibilities;
    /**
     * <p>
     * The short name or ARN of the IAM role that grants containers in the task permission to call AWS API operations on
     * your behalf.
     * </p>
     */
    private String taskRoleArn;
    /**
     * <p>
     * The data volume definitions for the task.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionVolumesDetails> volumes;

    /**
     * <p>
     * The container definitions that describe the containers that make up the task.
     * </p>
     * 
     * @return The container definitions that describe the containers that make up the task.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsDetails> getContainerDefinitions() {
        return containerDefinitions;
    }

    /**
     * <p>
     * The container definitions that describe the containers that make up the task.
     * </p>
     * 
     * @param containerDefinitions
     *        The container definitions that describe the containers that make up the task.
     */

    public void setContainerDefinitions(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsDetails> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
            return;
        }

        this.containerDefinitions = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsDetails>(containerDefinitions);
    }

    /**
     * <p>
     * The container definitions that describe the containers that make up the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerDefinitions(java.util.Collection)} or {@link #withContainerDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerDefinitions
     *        The container definitions that describe the containers that make up the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withContainerDefinitions(AwsEcsTaskDefinitionContainerDefinitionsDetails... containerDefinitions) {
        if (this.containerDefinitions == null) {
            setContainerDefinitions(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsDetails>(containerDefinitions.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsDetails ele : containerDefinitions) {
            this.containerDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container definitions that describe the containers that make up the task.
     * </p>
     * 
     * @param containerDefinitions
     *        The container definitions that describe the containers that make up the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withContainerDefinitions(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsDetails> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * The number of CPU units used by the task.
     * </p>
     * 
     * @param cpu
     *        The number of CPU units used by the task.
     */

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of CPU units used by the task.
     * </p>
     * 
     * @return The number of CPU units used by the task.
     */

    public String getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of CPU units used by the task.
     * </p>
     * 
     * @param cpu
     *        The number of CPU units used by the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withCpu(String cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The ARN of the task execution role that grants the container agent permission to make API calls on behalf of the
     * container user.
     * </p>
     * 
     * @param executionRoleArn
     *        The ARN of the task execution role that grants the container agent permission to make API calls on behalf
     *        of the container user.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the task execution role that grants the container agent permission to make API calls on behalf of the
     * container user.
     * </p>
     * 
     * @return The ARN of the task execution role that grants the container agent permission to make API calls on behalf
     *         of the container user.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the task execution role that grants the container agent permission to make API calls on behalf of the
     * container user.
     * </p>
     * 
     * @param executionRoleArn
     *        The ARN of the task execution role that grants the container agent permission to make API calls on behalf
     *        of the container user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The name of a family that this task definition is registered to.
     * </p>
     * 
     * @param family
     *        The name of a family that this task definition is registered to.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The name of a family that this task definition is registered to.
     * </p>
     * 
     * @return The name of a family that this task definition is registered to.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The name of a family that this task definition is registered to.
     * </p>
     * 
     * @param family
     *        The name of a family that this task definition is registered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerators to use for the containers in the task.
     * </p>
     * 
     * @return The Elastic Inference accelerators to use for the containers in the task.
     */

    public java.util.List<AwsEcsTaskDefinitionInferenceAcceleratorsDetails> getInferenceAccelerators() {
        return inferenceAccelerators;
    }

    /**
     * <p>
     * The Elastic Inference accelerators to use for the containers in the task.
     * </p>
     * 
     * @param inferenceAccelerators
     *        The Elastic Inference accelerators to use for the containers in the task.
     */

    public void setInferenceAccelerators(java.util.Collection<AwsEcsTaskDefinitionInferenceAcceleratorsDetails> inferenceAccelerators) {
        if (inferenceAccelerators == null) {
            this.inferenceAccelerators = null;
            return;
        }

        this.inferenceAccelerators = new java.util.ArrayList<AwsEcsTaskDefinitionInferenceAcceleratorsDetails>(inferenceAccelerators);
    }

    /**
     * <p>
     * The Elastic Inference accelerators to use for the containers in the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceAccelerators(java.util.Collection)} or
     * {@link #withInferenceAccelerators(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inferenceAccelerators
     *        The Elastic Inference accelerators to use for the containers in the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withInferenceAccelerators(AwsEcsTaskDefinitionInferenceAcceleratorsDetails... inferenceAccelerators) {
        if (this.inferenceAccelerators == null) {
            setInferenceAccelerators(new java.util.ArrayList<AwsEcsTaskDefinitionInferenceAcceleratorsDetails>(inferenceAccelerators.length));
        }
        for (AwsEcsTaskDefinitionInferenceAcceleratorsDetails ele : inferenceAccelerators) {
            this.inferenceAccelerators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerators to use for the containers in the task.
     * </p>
     * 
     * @param inferenceAccelerators
     *        The Elastic Inference accelerators to use for the containers in the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withInferenceAccelerators(java.util.Collection<AwsEcsTaskDefinitionInferenceAcceleratorsDetails> inferenceAccelerators) {
        setInferenceAccelerators(inferenceAccelerators);
        return this;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task.
     * </p>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task.
     */

    public void setIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task.
     * </p>
     * 
     * @return The IPC resource namespace to use for the containers in the task.
     */

    public String getIpcMode() {
        return this.ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task.
     * </p>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withIpcMode(String ipcMode) {
        setIpcMode(ipcMode);
        return this;
    }

    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * 
     * @param memory
     *        The amount (in MiB) of memory used by the task.
     */

    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * 
     * @return The amount (in MiB) of memory used by the task.
     */

    public String getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * 
     * @param memory
     *        The amount (in MiB) of memory used by the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withMemory(String memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task.
     */

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task.
     * </p>
     * 
     * @return The Docker networking mode to use for the containers in the task.
     */

    public String getNetworkMode() {
        return this.networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withNetworkMode(String networkMode) {
        setNetworkMode(networkMode);
        return this;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task.
     * </p>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task.
     */

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task.
     * </p>
     * 
     * @return The process namespace to use for the containers in the task.
     */

    public String getPidMode() {
        return this.pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task.
     * </p>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withPidMode(String pidMode) {
        setPidMode(pidMode);
        return this;
    }

    /**
     * <p>
     * The placement constraint objects to use for tasks.
     * </p>
     * 
     * @return The placement constraint objects to use for tasks.
     */

    public java.util.List<AwsEcsTaskDefinitionPlacementConstraintsDetails> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * <p>
     * The placement constraint objects to use for tasks.
     * </p>
     * 
     * @param placementConstraints
     *        The placement constraint objects to use for tasks.
     */

    public void setPlacementConstraints(java.util.Collection<AwsEcsTaskDefinitionPlacementConstraintsDetails> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new java.util.ArrayList<AwsEcsTaskDefinitionPlacementConstraintsDetails>(placementConstraints);
    }

    /**
     * <p>
     * The placement constraint objects to use for tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        The placement constraint objects to use for tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withPlacementConstraints(AwsEcsTaskDefinitionPlacementConstraintsDetails... placementConstraints) {
        if (this.placementConstraints == null) {
            setPlacementConstraints(new java.util.ArrayList<AwsEcsTaskDefinitionPlacementConstraintsDetails>(placementConstraints.length));
        }
        for (AwsEcsTaskDefinitionPlacementConstraintsDetails ele : placementConstraints) {
            this.placementConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The placement constraint objects to use for tasks.
     * </p>
     * 
     * @param placementConstraints
     *        The placement constraint objects to use for tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withPlacementConstraints(java.util.Collection<AwsEcsTaskDefinitionPlacementConstraintsDetails> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * 
     * @param proxyConfiguration
     *        The configuration details for the App Mesh proxy.
     */

    public void setProxyConfiguration(AwsEcsTaskDefinitionProxyConfigurationDetails proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * 
     * @return The configuration details for the App Mesh proxy.
     */

    public AwsEcsTaskDefinitionProxyConfigurationDetails getProxyConfiguration() {
        return this.proxyConfiguration;
    }

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * 
     * @param proxyConfiguration
     *        The configuration details for the App Mesh proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withProxyConfiguration(AwsEcsTaskDefinitionProxyConfigurationDetails proxyConfiguration) {
        setProxyConfiguration(proxyConfiguration);
        return this;
    }

    /**
     * <p>
     * The task launch types that the task definition was validated against.
     * </p>
     * 
     * @return The task launch types that the task definition was validated against.
     */

    public java.util.List<String> getRequiresCompatibilities() {
        return requiresCompatibilities;
    }

    /**
     * <p>
     * The task launch types that the task definition was validated against.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The task launch types that the task definition was validated against.
     */

    public void setRequiresCompatibilities(java.util.Collection<String> requiresCompatibilities) {
        if (requiresCompatibilities == null) {
            this.requiresCompatibilities = null;
            return;
        }

        this.requiresCompatibilities = new java.util.ArrayList<String>(requiresCompatibilities);
    }

    /**
     * <p>
     * The task launch types that the task definition was validated against.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiresCompatibilities(java.util.Collection)} or
     * {@link #withRequiresCompatibilities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The task launch types that the task definition was validated against.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withRequiresCompatibilities(String... requiresCompatibilities) {
        if (this.requiresCompatibilities == null) {
            setRequiresCompatibilities(new java.util.ArrayList<String>(requiresCompatibilities.length));
        }
        for (String ele : requiresCompatibilities) {
            this.requiresCompatibilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The task launch types that the task definition was validated against.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The task launch types that the task definition was validated against.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withRequiresCompatibilities(java.util.Collection<String> requiresCompatibilities) {
        setRequiresCompatibilities(requiresCompatibilities);
        return this;
    }

    /**
     * <p>
     * The short name or ARN of the IAM role that grants containers in the task permission to call AWS API operations on
     * your behalf.
     * </p>
     * 
     * @param taskRoleArn
     *        The short name or ARN of the IAM role that grants containers in the task permission to call AWS API
     *        operations on your behalf.
     */

    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The short name or ARN of the IAM role that grants containers in the task permission to call AWS API operations on
     * your behalf.
     * </p>
     * 
     * @return The short name or ARN of the IAM role that grants containers in the task permission to call AWS API
     *         operations on your behalf.
     */

    public String getTaskRoleArn() {
        return this.taskRoleArn;
    }

    /**
     * <p>
     * The short name or ARN of the IAM role that grants containers in the task permission to call AWS API operations on
     * your behalf.
     * </p>
     * 
     * @param taskRoleArn
     *        The short name or ARN of the IAM role that grants containers in the task permission to call AWS API
     *        operations on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withTaskRoleArn(String taskRoleArn) {
        setTaskRoleArn(taskRoleArn);
        return this;
    }

    /**
     * <p>
     * The data volume definitions for the task.
     * </p>
     * 
     * @return The data volume definitions for the task.
     */

    public java.util.List<AwsEcsTaskDefinitionVolumesDetails> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * The data volume definitions for the task.
     * </p>
     * 
     * @param volumes
     *        The data volume definitions for the task.
     */

    public void setVolumes(java.util.Collection<AwsEcsTaskDefinitionVolumesDetails> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<AwsEcsTaskDefinitionVolumesDetails>(volumes);
    }

    /**
     * <p>
     * The data volume definitions for the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        The data volume definitions for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withVolumes(AwsEcsTaskDefinitionVolumesDetails... volumes) {
        if (this.volumes == null) {
            setVolumes(new java.util.ArrayList<AwsEcsTaskDefinitionVolumesDetails>(volumes.length));
        }
        for (AwsEcsTaskDefinitionVolumesDetails ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data volume definitions for the task.
     * </p>
     * 
     * @param volumes
     *        The data volume definitions for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionDetails withVolumes(java.util.Collection<AwsEcsTaskDefinitionVolumesDetails> volumes) {
        setVolumes(volumes);
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
        if (getContainerDefinitions() != null)
            sb.append("ContainerDefinitions: ").append(getContainerDefinitions()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getInferenceAccelerators() != null)
            sb.append("InferenceAccelerators: ").append(getInferenceAccelerators()).append(",");
        if (getIpcMode() != null)
            sb.append("IpcMode: ").append(getIpcMode()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getNetworkMode() != null)
            sb.append("NetworkMode: ").append(getNetworkMode()).append(",");
        if (getPidMode() != null)
            sb.append("PidMode: ").append(getPidMode()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getProxyConfiguration() != null)
            sb.append("ProxyConfiguration: ").append(getProxyConfiguration()).append(",");
        if (getRequiresCompatibilities() != null)
            sb.append("RequiresCompatibilities: ").append(getRequiresCompatibilities()).append(",");
        if (getTaskRoleArn() != null)
            sb.append("TaskRoleArn: ").append(getTaskRoleArn()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionDetails == false)
            return false;
        AwsEcsTaskDefinitionDetails other = (AwsEcsTaskDefinitionDetails) obj;
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getInferenceAccelerators() == null ^ this.getInferenceAccelerators() == null)
            return false;
        if (other.getInferenceAccelerators() != null && other.getInferenceAccelerators().equals(this.getInferenceAccelerators()) == false)
            return false;
        if (other.getIpcMode() == null ^ this.getIpcMode() == null)
            return false;
        if (other.getIpcMode() != null && other.getIpcMode().equals(this.getIpcMode()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getNetworkMode() == null ^ this.getNetworkMode() == null)
            return false;
        if (other.getNetworkMode() != null && other.getNetworkMode().equals(this.getNetworkMode()) == false)
            return false;
        if (other.getPidMode() == null ^ this.getPidMode() == null)
            return false;
        if (other.getPidMode() != null && other.getPidMode().equals(this.getPidMode()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getProxyConfiguration() == null ^ this.getProxyConfiguration() == null)
            return false;
        if (other.getProxyConfiguration() != null && other.getProxyConfiguration().equals(this.getProxyConfiguration()) == false)
            return false;
        if (other.getRequiresCompatibilities() == null ^ this.getRequiresCompatibilities() == null)
            return false;
        if (other.getRequiresCompatibilities() != null && other.getRequiresCompatibilities().equals(this.getRequiresCompatibilities()) == false)
            return false;
        if (other.getTaskRoleArn() == null ^ this.getTaskRoleArn() == null)
            return false;
        if (other.getTaskRoleArn() != null && other.getTaskRoleArn().equals(this.getTaskRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getInferenceAccelerators() == null) ? 0 : getInferenceAccelerators().hashCode());
        hashCode = prime * hashCode + ((getIpcMode() == null) ? 0 : getIpcMode().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getNetworkMode() == null) ? 0 : getNetworkMode().hashCode());
        hashCode = prime * hashCode + ((getPidMode() == null) ? 0 : getPidMode().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getProxyConfiguration() == null) ? 0 : getProxyConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRequiresCompatibilities() == null) ? 0 : getRequiresCompatibilities().hashCode());
        hashCode = prime * hashCode + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionDetails clone() {
        try {
            return (AwsEcsTaskDefinitionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
