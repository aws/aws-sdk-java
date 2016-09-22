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
 * The overrides that should be sent to a container.
 * </p>
 */
public class ContainerOverride implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container that receives the override.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the task
     * definition.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> command;
    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the task
     * definition.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<KeyValuePair> environment;

    /**
     * <p>
     * The name of the container that receives the override.
     * </p>
     * 
     * @param name
     *        The name of the container that receives the override.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container that receives the override.
     * </p>
     * 
     * @return The name of the container that receives the override.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container that receives the override.
     * </p>
     * 
     * @param name
     *        The name of the container that receives the override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the task
     * definition.
     * </p>
     * 
     * @return The command to send to the container that overrides the default command from the Docker image or the task
     *         definition.
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
     * definition.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the task
     *        definition.
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
     * definition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the task
     *        definition.
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
     * definition.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the task
     *        definition.
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
     * definition.
     * </p>
     * 
     * @return The environment variables to send to the container. You can add new environment variables, which are
     *         added to the container at launch, or you can override the existing environment variables from the Docker
     *         image or the task definition.
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
     * definition.
     * </p>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the task definition.
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
     * definition.
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
     *        or the task definition.
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
     * definition.
     * </p>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerOverride withEnvironment(java.util.Collection<KeyValuePair> environment) {
        setEnvironment(environment);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCommand() != null)
            sb.append("Command: " + getCommand() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
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
}
