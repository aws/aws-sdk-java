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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ExecuteCommand" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteCommandResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     */
    private String containerArn;
    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * Whether or not the execute command session is running in interactive mode. Amazon ECS only supports initiating
     * interactive sessions, so you must specify <code>true</code> for this value.
     * </p>
     */
    private Boolean interactive;
    /**
     * <p>
     * The details of the SSM session that was created for this instance of execute-command.
     * </p>
     */
    private Session session;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     */
    private String taskArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandResult withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     * 
     * @param containerArn
     *        The Amazon Resource Name (ARN) of the container.
     */

    public void setContainerArn(String containerArn) {
        this.containerArn = containerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container.
     */

    public String getContainerArn() {
        return this.containerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     * 
     * @param containerArn
     *        The Amazon Resource Name (ARN) of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandResult withContainerArn(String containerArn) {
        setContainerArn(containerArn);
        return this;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param containerName
     *        The name of the container.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @return The name of the container.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param containerName
     *        The name of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandResult withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * Whether or not the execute command session is running in interactive mode. Amazon ECS only supports initiating
     * interactive sessions, so you must specify <code>true</code> for this value.
     * </p>
     * 
     * @param interactive
     *        Whether or not the execute command session is running in interactive mode. Amazon ECS only supports
     *        initiating interactive sessions, so you must specify <code>true</code> for this value.
     */

    public void setInteractive(Boolean interactive) {
        this.interactive = interactive;
    }

    /**
     * <p>
     * Whether or not the execute command session is running in interactive mode. Amazon ECS only supports initiating
     * interactive sessions, so you must specify <code>true</code> for this value.
     * </p>
     * 
     * @return Whether or not the execute command session is running in interactive mode. Amazon ECS only supports
     *         initiating interactive sessions, so you must specify <code>true</code> for this value.
     */

    public Boolean getInteractive() {
        return this.interactive;
    }

    /**
     * <p>
     * Whether or not the execute command session is running in interactive mode. Amazon ECS only supports initiating
     * interactive sessions, so you must specify <code>true</code> for this value.
     * </p>
     * 
     * @param interactive
     *        Whether or not the execute command session is running in interactive mode. Amazon ECS only supports
     *        initiating interactive sessions, so you must specify <code>true</code> for this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandResult withInteractive(Boolean interactive) {
        setInteractive(interactive);
        return this;
    }

    /**
     * <p>
     * Whether or not the execute command session is running in interactive mode. Amazon ECS only supports initiating
     * interactive sessions, so you must specify <code>true</code> for this value.
     * </p>
     * 
     * @return Whether or not the execute command session is running in interactive mode. Amazon ECS only supports
     *         initiating interactive sessions, so you must specify <code>true</code> for this value.
     */

    public Boolean isInteractive() {
        return this.interactive;
    }

    /**
     * <p>
     * The details of the SSM session that was created for this instance of execute-command.
     * </p>
     * 
     * @param session
     *        The details of the SSM session that was created for this instance of execute-command.
     */

    public void setSession(Session session) {
        this.session = session;
    }

    /**
     * <p>
     * The details of the SSM session that was created for this instance of execute-command.
     * </p>
     * 
     * @return The details of the SSM session that was created for this instance of execute-command.
     */

    public Session getSession() {
        return this.session;
    }

    /**
     * <p>
     * The details of the SSM session that was created for this instance of execute-command.
     * </p>
     * 
     * @param session
     *        The details of the SSM session that was created for this instance of execute-command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandResult withSession(Session session) {
        setSession(session);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteCommandResult withTaskArn(String taskArn) {
        setTaskArn(taskArn);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getContainerArn() != null)
            sb.append("ContainerArn: ").append(getContainerArn()).append(",");
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getInteractive() != null)
            sb.append("Interactive: ").append(getInteractive()).append(",");
        if (getSession() != null)
            sb.append("Session: ").append(getSession()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteCommandResult == false)
            return false;
        ExecuteCommandResult other = (ExecuteCommandResult) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getContainerArn() == null ^ this.getContainerArn() == null)
            return false;
        if (other.getContainerArn() != null && other.getContainerArn().equals(this.getContainerArn()) == false)
            return false;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getInteractive() == null ^ this.getInteractive() == null)
            return false;
        if (other.getInteractive() != null && other.getInteractive().equals(this.getInteractive()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getContainerArn() == null) ? 0 : getContainerArn().hashCode());
        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getInteractive() == null) ? 0 : getInteractive().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteCommandResult clone() {
        try {
            return (ExecuteCommandResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
