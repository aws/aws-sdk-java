/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Object representing any Kubernetes overrides to a job definition that's used in a <a>SubmitJob</a> API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksContainerOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksContainerOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The override of the Docker image that's used to start the container.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * The arguments to the entrypoint to send to the container that overrides the default arguments from the Docker
     * image or the job definition. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command an arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private java.util.List<String> args;
    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch. Or, you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     * variables that Batch sets.
     * </p>
     * </note>
     */
    private java.util.List<EksContainerEnvironmentVariable> env;
    /**
     * <p>
     * The type and amount of resources to assign to a container. These override the settings in the job definition. The
     * supported resources include <code>memory</code>, <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more
     * information, see <a
     * href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management for
     * pods and containers</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private EksContainerResourceRequirements resources;

    /**
     * <p>
     * The override of the Docker image that's used to start the container.
     * </p>
     * 
     * @param image
     *        The override of the Docker image that's used to start the container.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The override of the Docker image that's used to start the container.
     * </p>
     * 
     * @return The override of the Docker image that's used to start the container.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The override of the Docker image that's used to start the container.
     * </p>
     * 
     * @param image
     *        The override of the Docker image that's used to start the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerOverride withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * 
     * @return The command to send to the container that overrides the default command from the Docker image or the job
     *         definition.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the job
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
     * The command to send to the container that overrides the default command from the Docker image or the job
     * definition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the job
     *        definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerOverride withCommand(String... command) {
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
     * 
     * @param command
     *        The command to send to the container that overrides the default command from the Docker image or the job
     *        definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerOverride withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The arguments to the entrypoint to send to the container that overrides the default arguments from the Docker
     * image or the job definition. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command an arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return The arguments to the entrypoint to send to the container that overrides the default arguments from the
     *         Docker image or the job definition. For more information, see <a
     *         href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i>
     *         and <a
     *         href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define
     *         a command an arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     */

    public java.util.List<String> getArgs() {
        return args;
    }

    /**
     * <p>
     * The arguments to the entrypoint to send to the container that overrides the default arguments from the Docker
     * image or the job definition. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command an arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param args
     *        The arguments to the entrypoint to send to the container that overrides the default arguments from the
     *        Docker image or the job definition. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i>
     *        and <a href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">
     *        Define a command an arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     */

    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new java.util.ArrayList<String>(args);
    }

    /**
     * <p>
     * The arguments to the entrypoint to send to the container that overrides the default arguments from the Docker
     * image or the job definition. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command an arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArgs(java.util.Collection)} or {@link #withArgs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param args
     *        The arguments to the entrypoint to send to the container that overrides the default arguments from the
     *        Docker image or the job definition. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i>
     *        and <a href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">
     *        Define a command an arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerOverride withArgs(String... args) {
        if (this.args == null) {
            setArgs(new java.util.ArrayList<String>(args.length));
        }
        for (String ele : args) {
            this.args.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The arguments to the entrypoint to send to the container that overrides the default arguments from the Docker
     * image or the job definition. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i> and <a
     * href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">Define a
     * command an arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param args
     *        The arguments to the entrypoint to send to the container that overrides the default arguments from the
     *        Docker image or the job definition. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#cmd">CMD</a> in the <i>Dockerfile reference</i>
     *        and <a href="https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/">
     *        Define a command an arguments for a pod</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerOverride withArgs(java.util.Collection<String> args) {
        setArgs(args);
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch. Or, you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     * variables that Batch sets.
     * </p>
     * </note>
     * 
     * @return The environment variables to send to the container. You can add new environment variables, which are
     *         added to the container at launch. Or, you can override the existing environment variables from the Docker
     *         image or the job definition.</p> <note>
     *         <p>
     *         Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     *         variables that Batch sets.
     *         </p>
     */

    public java.util.List<EksContainerEnvironmentVariable> getEnv() {
        return env;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch. Or, you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     * variables that Batch sets.
     * </p>
     * </note>
     * 
     * @param env
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch. Or, you can override the existing environment variables from the Docker image
     *        or the job definition.</p> <note>
     *        <p>
     *        Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     */

    public void setEnv(java.util.Collection<EksContainerEnvironmentVariable> env) {
        if (env == null) {
            this.env = null;
            return;
        }

        this.env = new java.util.ArrayList<EksContainerEnvironmentVariable>(env);
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch. Or, you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     * variables that Batch sets.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnv(java.util.Collection)} or {@link #withEnv(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param env
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch. Or, you can override the existing environment variables from the Docker image
     *        or the job definition.</p> <note>
     *        <p>
     *        Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerOverride withEnv(EksContainerEnvironmentVariable... env) {
        if (this.env == null) {
            setEnv(new java.util.ArrayList<EksContainerEnvironmentVariable>(env.length));
        }
        for (EksContainerEnvironmentVariable ele : env) {
            this.env.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new environment variables, which are added to the
     * container at launch. Or, you can override the existing environment variables from the Docker image or the job
     * definition.
     * </p>
     * <note>
     * <p>
     * Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     * variables that Batch sets.
     * </p>
     * </note>
     * 
     * @param env
     *        The environment variables to send to the container. You can add new environment variables, which are added
     *        to the container at launch. Or, you can override the existing environment variables from the Docker image
     *        or the job definition.</p> <note>
     *        <p>
     *        Environment variables cannot start with "<code>AWS_BATCH</code>". This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerOverride withEnv(java.util.Collection<EksContainerEnvironmentVariable> env) {
        setEnv(env);
        return this;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. These override the settings in the job definition. The
     * supported resources include <code>memory</code>, <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more
     * information, see <a
     * href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management for
     * pods and containers</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param resources
     *        The type and amount of resources to assign to a container. These override the settings in the job
     *        definition. The supported resources include <code>memory</code>, <code>cpu</code>, and
     *        <code>nvidia.com/gpu</code>. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management
     *        for pods and containers</a> in the <i>Kubernetes documentation</i>.
     */

    public void setResources(EksContainerResourceRequirements resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. These override the settings in the job definition. The
     * supported resources include <code>memory</code>, <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more
     * information, see <a
     * href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management for
     * pods and containers</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return The type and amount of resources to assign to a container. These override the settings in the job
     *         definition. The supported resources include <code>memory</code>, <code>cpu</code>, and
     *         <code>nvidia.com/gpu</code>. For more information, see <a
     *         href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management
     *         for pods and containers</a> in the <i>Kubernetes documentation</i>.
     */

    public EksContainerResourceRequirements getResources() {
        return this.resources;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. These override the settings in the job definition. The
     * supported resources include <code>memory</code>, <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more
     * information, see <a
     * href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management for
     * pods and containers</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param resources
     *        The type and amount of resources to assign to a container. These override the settings in the job
     *        definition. The supported resources include <code>memory</code>, <code>cpu</code>, and
     *        <code>nvidia.com/gpu</code>. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/">Resource management
     *        for pods and containers</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerOverride withResources(EksContainerResourceRequirements resources) {
        setResources(resources);
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getArgs() != null)
            sb.append("Args: ").append(getArgs()).append(",");
        if (getEnv() != null)
            sb.append("Env: ").append(getEnv()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksContainerOverride == false)
            return false;
        EksContainerOverride other = (EksContainerOverride) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        if (other.getEnv() == null ^ this.getEnv() == null)
            return false;
        if (other.getEnv() != null && other.getEnv().equals(this.getEnv()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        hashCode = prime * hashCode + ((getEnv() == null) ? 0 : getEnv().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public EksContainerOverride clone() {
        try {
            return (EksContainerOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksContainerOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
