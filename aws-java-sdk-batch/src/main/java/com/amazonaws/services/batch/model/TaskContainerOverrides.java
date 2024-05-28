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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The overrides that should be sent to a container.
 * </p>
 * <p>
 * For information about using Batch overrides when you connect event sources to targets, see <a
 * href="https://docs.aws.amazon.com/eventbridge/latest/pipes-reference/API_BatchContainerOverrides.html"
 * >BatchContainerOverrides</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TaskContainerOverrides" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskContainerOverrides implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * This parameter can't contain an empty string.
     * </p>
     * </note>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     */
    private java.util.List<KeyValuePair> environment;
    /**
     * <p>
     * A pointer to the container that you want to override. The container's name provides a unique identifier for the
     * container being used.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     */
    private java.util.List<ResourceRequirement> resourceRequirements;

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * This parameter can't contain an empty string.
     * </p>
     * </note>
     * 
     * @return The command to send to the container that overrides the default command from the Docker image or the job
     *         definition.</p> <note>
     *         <p>
     *         This parameter can't contain an empty string.
     *         </p>
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * This parameter can't contain an empty string.
     * </p>
     * </note>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the job
     *        definition.</p> <note>
     *        <p>
     *        This parameter can't contain an empty string.
     *        </p>
     */

    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }

        this.command = new java.util.ArrayList<String>(command);
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * This parameter can't contain an empty string.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the job
     *        definition.</p> <note>
     *        <p>
     *        This parameter can't contain an empty string.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerOverrides withCommand(String... command) {
        if (this.command == null) {
            setCommand(new java.util.ArrayList<String>(command.length));
        }
        for (String ele : command) {
            this.command.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * This parameter can't contain an empty string.
     * </p>
     * </note>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the job
     *        definition.</p> <note>
     *        <p>
     *        This parameter can't contain an empty string.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerOverrides withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * 
     * @return The environment variables to send to the container. You can add new environment variables, which are
     *         added to the container at launch, or you can override the existing environment variables from the Docker
     *         image or the job definition.</p> <note>
     *         <p>
     *         Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for
     *         variables that Batch sets.
     *         </p>
     */

    public java.util.List<KeyValuePair> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the job definition.</p> <note>
     *        <p>
     *        Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     */

    public void setEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new java.util.ArrayList<KeyValuePair>(environment);
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironment(java.util.Collection)} or {@link #withEnvironment(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the job definition.</p> <note>
     *        <p>
     *        Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerOverrides withEnvironment(KeyValuePair... environment) {
        if (this.environment == null) {
            setEnvironment(new java.util.ArrayList<KeyValuePair>(environment.length));
        }
        for (KeyValuePair ele : environment) {
            this.environment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the job definition.</p> <note>
     *        <p>
     *        Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerOverrides withEnvironment(java.util.Collection<KeyValuePair> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * A pointer to the container that you want to override. The container's name provides a unique identifier for the
     * container being used.
     * </p>
     * 
     * @param name
     *        A pointer to the container that you want to override. The container's name provides a unique identifier
     *        for the container being used.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A pointer to the container that you want to override. The container's name provides a unique identifier for the
     * container being used.
     * </p>
     * 
     * @return A pointer to the container that you want to override. The container's name provides a unique identifier
     *         for the container being used.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A pointer to the container that you want to override. The container's name provides a unique identifier for the
     * container being used.
     * </p>
     * 
     * @param name
     *        A pointer to the container that you want to override. The container's name provides a unique identifier
     *        for the container being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerOverrides withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @return The type and amount of resources to assign to a container. This overrides the settings in the job
     *         definition. The supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     */

    public java.util.List<ResourceRequirement> getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of resources to assign to a container. This overrides the settings in the job
     *        definition. The supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     */

    public void setResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        if (resourceRequirements == null) {
            this.resourceRequirements = null;
            return;
        }

        this.resourceRequirements = new java.util.ArrayList<ResourceRequirement>(resourceRequirements);
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRequirements(java.util.Collection)} or {@link #withResourceRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of resources to assign to a container. This overrides the settings in the job
     *        definition. The supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerOverrides withResourceRequirements(ResourceRequirement... resourceRequirements) {
        if (this.resourceRequirements == null) {
            setResourceRequirements(new java.util.ArrayList<ResourceRequirement>(resourceRequirements.length));
        }
        for (ResourceRequirement ele : resourceRequirements) {
            this.resourceRequirements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of resources to assign to a container. This overrides the settings in the job
     *        definition. The supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerOverrides withResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
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
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof TaskContainerOverrides == false)
            return false;
        TaskContainerOverrides other = (TaskContainerOverrides) obj;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceRequirements() == null) ? 0 : getResourceRequirements().hashCode());
        return hashCode;
    }

    @Override
    public TaskContainerOverrides clone() {
        try {
            return (TaskContainerOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.TaskContainerOverridesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
