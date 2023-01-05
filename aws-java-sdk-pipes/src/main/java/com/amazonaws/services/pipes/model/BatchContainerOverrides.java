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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The overrides that are sent to a container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/BatchContainerOverrides" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchContainerOverrides implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the task
     * definition.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the task
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>Batch</code>". This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     */
    private java.util.List<BatchEnvironmentVariable> environment;
    /**
     * <p>
     * The instance type to use for a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate resources, and
     * shouldn't be provided.
     * </p>
     * </note>
     */
    private String instanceType;
    /**
     * <p>
     * The type and amount of resources to assign to a container. This overrides the settings in the job definition. The
     * supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     */
    private java.util.List<BatchResourceRequirement> resourceRequirements;

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

        this.command = new java.util.ArrayList<String>(command);
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

    public BatchContainerOverrides withCommand(String... command) {
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
     * The command to send to the container that overrides the default command from the Docker image or the task
     * definition.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the task
     *        definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchContainerOverrides withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the task
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>Batch</code>". This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * 
     * @return The environment variables to send to the container. You can add new environment variables, which are
     *         added to the container at launch, or you can override the existing environment variables from the Docker
     *         image or the task definition.</p> <note>
     *         <p>
     *         Environment variables cannot start with "<code>Batch</code>". This naming convention is reserved for
     *         variables that Batch sets.
     *         </p>
     */

    public java.util.List<BatchEnvironmentVariable> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the task
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>Batch</code>". This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the task definition.</p> <note>
     *        <p>
     *        Environment variables cannot start with "<code>Batch</code>". This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     */

    public void setEnvironment(java.util.Collection<BatchEnvironmentVariable> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new java.util.ArrayList<BatchEnvironmentVariable>(environment);
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch, or you can override the existing environment variables from the Docker image or the task
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>Batch</code>". This naming convention is reserved for variables
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
     *        or the task definition.</p> <note>
     *        <p>
     *        Environment variables cannot start with "<code>Batch</code>". This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchContainerOverrides withEnvironment(BatchEnvironmentVariable... environment) {
        if (this.environment == null) {
            setEnvironment(new java.util.ArrayList<BatchEnvironmentVariable>(environment.length));
        }
        for (BatchEnvironmentVariable ele : environment) {
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
     * <note>
     * <p>
     * Environment variables cannot start with "<code>Batch</code>". This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch, or you can override the existing environment variables from the Docker image
     *        or the task definition.</p> <note>
     *        <p>
     *        Environment variables cannot start with "<code>Batch</code>". This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchContainerOverrides withEnvironment(java.util.Collection<BatchEnvironmentVariable> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The instance type to use for a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate resources, and
     * shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The instance type to use for a multi-node parallel job.</p> <note>
     *        <p>
     *        This parameter isn't applicable to single-node container jobs or jobs that run on Fargate resources, and
     *        shouldn't be provided.
     *        </p>
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type to use for a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate resources, and
     * shouldn't be provided.
     * </p>
     * </note>
     * 
     * @return The instance type to use for a multi-node parallel job.</p> <note>
     *         <p>
     *         This parameter isn't applicable to single-node container jobs or jobs that run on Fargate resources, and
     *         shouldn't be provided.
     *         </p>
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type to use for a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate resources, and
     * shouldn't be provided.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The instance type to use for a multi-node parallel job.</p> <note>
     *        <p>
     *        This parameter isn't applicable to single-node container jobs or jobs that run on Fargate resources, and
     *        shouldn't be provided.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchContainerOverrides withInstanceType(String instanceType) {
        setInstanceType(instanceType);
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

    public java.util.List<BatchResourceRequirement> getResourceRequirements() {
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

    public void setResourceRequirements(java.util.Collection<BatchResourceRequirement> resourceRequirements) {
        if (resourceRequirements == null) {
            this.resourceRequirements = null;
            return;
        }

        this.resourceRequirements = new java.util.ArrayList<BatchResourceRequirement>(resourceRequirements);
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

    public BatchContainerOverrides withResourceRequirements(BatchResourceRequirement... resourceRequirements) {
        if (this.resourceRequirements == null) {
            setResourceRequirements(new java.util.ArrayList<BatchResourceRequirement>(resourceRequirements.length));
        }
        for (BatchResourceRequirement ele : resourceRequirements) {
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

    public BatchContainerOverrides withResourceRequirements(java.util.Collection<BatchResourceRequirement> resourceRequirements) {
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
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

        if (obj instanceof BatchContainerOverrides == false)
            return false;
        BatchContainerOverrides other = (BatchContainerOverrides) obj;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
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
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getResourceRequirements() == null) ? 0 : getResourceRequirements().hashCode());
        return hashCode;
    }

    @Override
    public BatchContainerOverrides clone() {
        try {
            return (BatchContainerOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.BatchContainerOverridesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
