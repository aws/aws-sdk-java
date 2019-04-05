/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The overrides that should be sent to a container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ContainerOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container that receives the override. This parameter is required if any override is specified.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the task
     * definition. You must also specify a container name.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> command;
    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the task
     * definition. You must also specify a container name.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<KeyValuePair> environment;
    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container, instead of the default value from the task
     * definition. You must also specify a container name.
     * </p>
     */
    private Integer cpu;
    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container, instead of the default value from the task
     * definition. If your container attempts to exceed the memory specified here, the container is killed. You must
     * also specify a container name.
     * </p>
     */
    private Integer memory;
    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the task
     * definition. You must also specify a container name.
     * </p>
     */
    private Integer memoryReservation;
    /**
     * <p>
     * The type and amount of a resource to assign to a container, instead of the default value from the task
     * definition. The only supported resource is a GPU.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceRequirement> resourceRequirements;

    /**
     * <p>
     * The name of the container that receives the override. This parameter is required if any override is specified.
     * </p>
     * 
     * @param name
     *        The name of the container that receives the override. This parameter is required if any override is
     *        specified.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container that receives the override. This parameter is required if any override is specified.
     * </p>
     * 
     * @return The name of the container that receives the override. This parameter is required if any override is
     *         specified.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container that receives the override. This parameter is required if any override is specified.
     * </p>
     * 
     * @param name
     *        The name of the container that receives the override. This parameter is required if any override is
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @return The command to send to the container that overrides the default command from the Docker image or the task
     *         definition. You must also specify a container name.
     */

    public java.util.List<String> getCommand() {
        if (command == null) {
            command = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return command;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the task
     *        definition. You must also specify a container name.
     */

    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }

        this.command = new com.amazonaws.internal.SdkInternalList<String>(command);
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the task
     * definition. You must also specify a container name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the task
     *        definition. You must also specify a container name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withCommand(String... command) {
        if (this.command == null) {
            setCommand(new com.amazonaws.internal.SdkInternalList<String>(command.length));
        }
        for (String ele : command) {
            this.command.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the task
     *        definition. You must also specify a container name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @return The environment variables to send to the container. You can add new environment variables, which are
     *         added to the container at launch, or you can override the existing environment variables from the Docker
     *         image or the task definition. You must also specify a container name.
     */

    public java.util.List<KeyValuePair> getEnvironment() {
        if (environment == null) {
            environment = new com.amazonaws.internal.SdkInternalList<KeyValuePair>();
        }
        return environment;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the task definition. You must also specify a container name.
     */

    public void setEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new com.amazonaws.internal.SdkInternalList<KeyValuePair>(environment);
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the task
     * definition. You must also specify a container name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironment(java.util.Collection)} or {@link #withEnvironment(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the task definition. You must also specify a container name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withEnvironment(KeyValuePair... environment) {
        if (this.environment == null) {
            setEnvironment(new com.amazonaws.internal.SdkInternalList<KeyValuePair>(environment.length));
        }
        for (KeyValuePair ele : environment) {
            this.environment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the task definition. You must also specify a container name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withEnvironment(java.util.Collection<KeyValuePair> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container, instead of the default value from the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @param cpu
     *        The number of <code>cpu</code> units reserved for the container, instead of the default value from the
     *        task definition. You must also specify a container name.
     */

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container, instead of the default value from the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @return The number of <code>cpu</code> units reserved for the container, instead of the default value from the
     *         task definition. You must also specify a container name.
     */

    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container, instead of the default value from the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @param cpu
     *        The number of <code>cpu</code> units reserved for the container, instead of the default value from the
     *        task definition. You must also specify a container name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withCpu(Integer cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container, instead of the default value from the task
     * definition. If your container attempts to exceed the memory specified here, the container is killed. You must
     * also specify a container name.
     * </p>
     * 
     * @param memory
     *        The hard limit (in MiB) of memory to present to the container, instead of the default value from the task
     *        definition. If your container attempts to exceed the memory specified here, the container is killed. You
     *        must also specify a container name.
     */

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container, instead of the default value from the task
     * definition. If your container attempts to exceed the memory specified here, the container is killed. You must
     * also specify a container name.
     * </p>
     * 
     * @return The hard limit (in MiB) of memory to present to the container, instead of the default value from the task
     *         definition. If your container attempts to exceed the memory specified here, the container is killed. You
     *         must also specify a container name.
     */

    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container, instead of the default value from the task
     * definition. If your container attempts to exceed the memory specified here, the container is killed. You must
     * also specify a container name.
     * </p>
     * 
     * @param memory
     *        The hard limit (in MiB) of memory to present to the container, instead of the default value from the task
     *        definition. If your container attempts to exceed the memory specified here, the container is killed. You
     *        must also specify a container name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @param memoryReservation
     *        The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the task
     *        definition. You must also specify a container name.
     */

    public void setMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @return The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the
     *         task definition. You must also specify a container name.
     */

    public Integer getMemoryReservation() {
        return this.memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the task
     * definition. You must also specify a container name.
     * </p>
     * 
     * @param memoryReservation
     *        The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the task
     *        definition. You must also specify a container name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withMemoryReservation(Integer memoryReservation) {
        setMemoryReservation(memoryReservation);
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container, instead of the default value from the task
     * definition. The only supported resource is a GPU.
     * </p>
     * 
     * @return The type and amount of a resource to assign to a container, instead of the default value from the task
     *         definition. The only supported resource is a GPU.
     */

    public java.util.List<ResourceRequirement> getResourceRequirements() {
        if (resourceRequirements == null) {
            resourceRequirements = new com.amazonaws.internal.SdkInternalList<ResourceRequirement>();
        }
        return resourceRequirements;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container, instead of the default value from the task
     * definition. The only supported resource is a GPU.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container, instead of the default value from the task
     *        definition. The only supported resource is a GPU.
     */

    public void setResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        if (resourceRequirements == null) {
            this.resourceRequirements = null;
            return;
        }

        this.resourceRequirements = new com.amazonaws.internal.SdkInternalList<ResourceRequirement>(resourceRequirements);
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container, instead of the default value from the task
     * definition. The only supported resource is a GPU.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRequirements(java.util.Collection)} or {@link #withResourceRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container, instead of the default value from the task
     *        definition. The only supported resource is a GPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withResourceRequirements(ResourceRequirement... resourceRequirements) {
        if (this.resourceRequirements == null) {
            setResourceRequirements(new com.amazonaws.internal.SdkInternalList<ResourceRequirement>(resourceRequirements.length));
        }
        for (ResourceRequirement ele : resourceRequirements) {
            this.resourceRequirements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container, instead of the default value from the task
     * definition. The only supported resource is a GPU.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container, instead of the default value from the task
     *        definition. The only supported resource is a GPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        setResourceRequirements(resourceRequirements);
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
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getMemoryReservation() != null)
            sb.append("MemoryReservation: ").append(getMemoryReservation()).append(",");
        if (getResourceRequirements() != null)
            sb.append("ResourceRequirements: ").append(getResourceRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerOverride == false)
            return false;
        ContainerOverride other = (ContainerOverride) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getMemoryReservation() == null ^ this.getMemoryReservation() == null)
            return false;
        if (other.getMemoryReservation() != null && other.getMemoryReservation().equals(this.getMemoryReservation()) == false)
            return false;
        if (other.getResourceRequirements() == null ^ this.getResourceRequirements() == null)
            return false;
        if (other.getResourceRequirements() != null && other.getResourceRequirements().equals(this.getResourceRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getMemoryReservation() == null) ? 0 : getMemoryReservation().hashCode());
        hashCode = prime * hashCode + ((getResourceRequirements() == null) ? 0 : getResourceRequirements().hashCode());
        return hashCode;
    }

    @Override
    public ContainerOverride clone() {
        try {
            return (ContainerOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ContainerOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
