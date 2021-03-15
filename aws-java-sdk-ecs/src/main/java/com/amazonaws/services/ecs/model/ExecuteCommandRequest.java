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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ExecuteCommand" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteCommandRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or short name of the cluster the task is running in. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The name of the container to execute the command on. A container name only needs to be specified for tasks
     * containing multiple containers.
     * </p>
     */
    private String container;
    /**
     * <p>
     * The command to run on the container.
     * </p>
     */
    private String command;
    /**
     * <p>
     * Use this flag to run your command in interactive mode.
     * </p>
     */
    private Boolean interactive;
    /**
     * <p>
     * The Amazon Resource Name (ARN) or ID of the task the container is part of.
     * </p>
     */
    private String task;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or short name of the cluster the task is running in. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The Amazon Resource Name (ARN) or short name of the cluster the task is running in. If you do not specify
     *        a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or short name of the cluster the task is running in. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or short name of the cluster the task is running in. If you do not specify
     *         a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or short name of the cluster the task is running in. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The Amazon Resource Name (ARN) or short name of the cluster the task is running in. If you do not specify
     *        a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The name of the container to execute the command on. A container name only needs to be specified for tasks
     * containing multiple containers.
     * </p>
     * 
     * @param container
     *        The name of the container to execute the command on. A container name only needs to be specified for tasks
     *        containing multiple containers.
     */

    public void setContainer(String container) {
        this.container = container;
    }

    /**
     * <p>
     * The name of the container to execute the command on. A container name only needs to be specified for tasks
     * containing multiple containers.
     * </p>
     * 
     * @return The name of the container to execute the command on. A container name only needs to be specified for
     *         tasks containing multiple containers.
     */

    public String getContainer() {
        return this.container;
    }

    /**
     * <p>
     * The name of the container to execute the command on. A container name only needs to be specified for tasks
     * containing multiple containers.
     * </p>
     * 
     * @param container
     *        The name of the container to execute the command on. A container name only needs to be specified for tasks
     *        containing multiple containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandRequest withContainer(String container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * The command to run on the container.
     * </p>
     * 
     * @param command
     *        The command to run on the container.
     */

    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * <p>
     * The command to run on the container.
     * </p>
     * 
     * @return The command to run on the container.
     */

    public String getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The command to run on the container.
     * </p>
     * 
     * @param command
     *        The command to run on the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandRequest withCommand(String command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * Use this flag to run your command in interactive mode.
     * </p>
     * 
     * @param interactive
     *        Use this flag to run your command in interactive mode.
     */

    public void setInteractive(Boolean interactive) {
        this.interactive = interactive;
    }

    /**
     * <p>
     * Use this flag to run your command in interactive mode.
     * </p>
     * 
     * @return Use this flag to run your command in interactive mode.
     */

    public Boolean getInteractive() {
        return this.interactive;
    }

    /**
     * <p>
     * Use this flag to run your command in interactive mode.
     * </p>
     * 
     * @param interactive
     *        Use this flag to run your command in interactive mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandRequest withInteractive(Boolean interactive) {
        setInteractive(interactive);
        return this;
    }

    /**
     * <p>
     * Use this flag to run your command in interactive mode.
     * </p>
     * 
     * @return Use this flag to run your command in interactive mode.
     */

    public Boolean isInteractive() {
        return this.interactive;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or ID of the task the container is part of.
     * </p>
     * 
     * @param task
     *        The Amazon Resource Name (ARN) or ID of the task the container is part of.
     */

    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or ID of the task the container is part of.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or ID of the task the container is part of.
     */

    public String getTask() {
        return this.task;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or ID of the task the container is part of.
     * </p>
     * 
     * @param task
     *        The Amazon Resource Name (ARN) or ID of the task the container is part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandRequest withTask(String task) {
        setTask(task);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getInteractive() != null)
            sb.append("Interactive: ").append(getInteractive()).append(",");
        if (getTask() != null)
            sb.append("Task: ").append(getTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteCommandRequest == false)
            return false;
        ExecuteCommandRequest other = (ExecuteCommandRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getInteractive() == null ^ this.getInteractive() == null)
            return false;
        if (other.getInteractive() != null && other.getInteractive().equals(this.getInteractive()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getInteractive() == null) ? 0 : getInteractive().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteCommandRequest clone() {
        return (ExecuteCommandRequest) super.clone();
    }

}
