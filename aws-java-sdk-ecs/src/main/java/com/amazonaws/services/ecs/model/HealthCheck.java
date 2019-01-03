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
 * An object representing a container health check. Health check parameters that are specified in a container definition
 * override any Docker health checks that exist in the container image (such as those specified in a parent image or
 * from the image's Dockerfile).
 * </p>
 * <p>
 * The following are notes about container health check support:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Container health checks require version 1.17.0 or greater of the Amazon ECS container agent. For more information,
 * see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon
 * ECS Container Agent</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Container health checks are supported for Fargate tasks if you are using platform version 1.1.0 or greater. For more
 * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS
 * Fargate Platform Versions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Container health checks are not supported for tasks that are part of a service that is configured to use a Classic
 * Load Balancer.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/HealthCheck" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheck implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string array representing the command that the container runs to determine if it is healthy. The string array
     * must start with <code>CMD</code> to execute the command arguments directly, or <code>CMD-SHELL</code> to run the
     * command with the container's default shell. For example:
     * </p>
     * <p>
     * <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     * </p>
     * <p>
     * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see
     * <code>HealthCheck</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> command;
    /**
     * <p>
     * The time period in seconds between each health check execution. You may specify between 5 and 300 seconds. The
     * default value is 30 seconds.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. You may
     * specify between 2 and 60 seconds. The default value is 5.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. You may specify
     * between 1 and 10 retries. The default value is 3.
     * </p>
     */
    private Integer retries;
    /**
     * <p>
     * The optional grace period within which to provide containers time to bootstrap before failed health checks count
     * towards the maximum number of retries. You may specify between 0 and 300 seconds. The <code>startPeriod</code> is
     * disabled by default.
     * </p>
     * <note>
     * <p>
     * If a health check succeeds within the <code>startPeriod</code>, then the container is considered healthy and any
     * subsequent failures count toward the maximum number of retries.
     * </p>
     * </note>
     */
    private Integer startPeriod;

    /**
     * <p>
     * A string array representing the command that the container runs to determine if it is healthy. The string array
     * must start with <code>CMD</code> to execute the command arguments directly, or <code>CMD-SHELL</code> to run the
     * command with the container's default shell. For example:
     * </p>
     * <p>
     * <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     * </p>
     * <p>
     * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see
     * <code>HealthCheck</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * 
     * @return A string array representing the command that the container runs to determine if it is healthy. The string
     *         array must start with <code>CMD</code> to execute the command arguments directly, or
     *         <code>CMD-SHELL</code> to run the command with the container's default shell. For example:</p>
     *         <p>
     *         <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     *         </p>
     *         <p>
     *         An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see
     *         <code>HealthCheck</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     */

    public java.util.List<String> getCommand() {
        if (command == null) {
            command = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return command;
    }

    /**
     * <p>
     * A string array representing the command that the container runs to determine if it is healthy. The string array
     * must start with <code>CMD</code> to execute the command arguments directly, or <code>CMD-SHELL</code> to run the
     * command with the container's default shell. For example:
     * </p>
     * <p>
     * <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     * </p>
     * <p>
     * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see
     * <code>HealthCheck</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * 
     * @param command
     *        A string array representing the command that the container runs to determine if it is healthy. The string
     *        array must start with <code>CMD</code> to execute the command arguments directly, or
     *        <code>CMD-SHELL</code> to run the command with the container's default shell. For example:</p>
     *        <p>
     *        <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     *        </p>
     *        <p>
     *        An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see
     *        <code>HealthCheck</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
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
     * A string array representing the command that the container runs to determine if it is healthy. The string array
     * must start with <code>CMD</code> to execute the command arguments directly, or <code>CMD-SHELL</code> to run the
     * command with the container's default shell. For example:
     * </p>
     * <p>
     * <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     * </p>
     * <p>
     * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see
     * <code>HealthCheck</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        A string array representing the command that the container runs to determine if it is healthy. The string
     *        array must start with <code>CMD</code> to execute the command arguments directly, or
     *        <code>CMD-SHELL</code> to run the command with the container's default shell. For example:</p>
     *        <p>
     *        <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     *        </p>
     *        <p>
     *        An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see
     *        <code>HealthCheck</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withCommand(String... command) {
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
     * A string array representing the command that the container runs to determine if it is healthy. The string array
     * must start with <code>CMD</code> to execute the command arguments directly, or <code>CMD-SHELL</code> to run the
     * command with the container's default shell. For example:
     * </p>
     * <p>
     * <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     * </p>
     * <p>
     * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see
     * <code>HealthCheck</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * 
     * @param command
     *        A string array representing the command that the container runs to determine if it is healthy. The string
     *        array must start with <code>CMD</code> to execute the command arguments directly, or
     *        <code>CMD-SHELL</code> to run the command with the container's default shell. For example:</p>
     *        <p>
     *        <code>[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]</code>
     *        </p>
     *        <p>
     *        An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see
     *        <code>HealthCheck</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The time period in seconds between each health check execution. You may specify between 5 and 300 seconds. The
     * default value is 30 seconds.
     * </p>
     * 
     * @param interval
     *        The time period in seconds between each health check execution. You may specify between 5 and 300 seconds.
     *        The default value is 30 seconds.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The time period in seconds between each health check execution. You may specify between 5 and 300 seconds. The
     * default value is 30 seconds.
     * </p>
     * 
     * @return The time period in seconds between each health check execution. You may specify between 5 and 300
     *         seconds. The default value is 30 seconds.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The time period in seconds between each health check execution. You may specify between 5 and 300 seconds. The
     * default value is 30 seconds.
     * </p>
     * 
     * @param interval
     *        The time period in seconds between each health check execution. You may specify between 5 and 300 seconds.
     *        The default value is 30 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. You may
     * specify between 2 and 60 seconds. The default value is 5.
     * </p>
     * 
     * @param timeout
     *        The time period in seconds to wait for a health check to succeed before it is considered a failure. You
     *        may specify between 2 and 60 seconds. The default value is 5.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. You may
     * specify between 2 and 60 seconds. The default value is 5.
     * </p>
     * 
     * @return The time period in seconds to wait for a health check to succeed before it is considered a failure. You
     *         may specify between 2 and 60 seconds. The default value is 5.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. You may
     * specify between 2 and 60 seconds. The default value is 5.
     * </p>
     * 
     * @param timeout
     *        The time period in seconds to wait for a health check to succeed before it is considered a failure. You
     *        may specify between 2 and 60 seconds. The default value is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. You may specify
     * between 1 and 10 retries. The default value is 3.
     * </p>
     * 
     * @param retries
     *        The number of times to retry a failed health check before the container is considered unhealthy. You may
     *        specify between 1 and 10 retries. The default value is 3.
     */

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. You may specify
     * between 1 and 10 retries. The default value is 3.
     * </p>
     * 
     * @return The number of times to retry a failed health check before the container is considered unhealthy. You may
     *         specify between 1 and 10 retries. The default value is 3.
     */

    public Integer getRetries() {
        return this.retries;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. You may specify
     * between 1 and 10 retries. The default value is 3.
     * </p>
     * 
     * @param retries
     *        The number of times to retry a failed health check before the container is considered unhealthy. You may
     *        specify between 1 and 10 retries. The default value is 3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withRetries(Integer retries) {
        setRetries(retries);
        return this;
    }

    /**
     * <p>
     * The optional grace period within which to provide containers time to bootstrap before failed health checks count
     * towards the maximum number of retries. You may specify between 0 and 300 seconds. The <code>startPeriod</code> is
     * disabled by default.
     * </p>
     * <note>
     * <p>
     * If a health check succeeds within the <code>startPeriod</code>, then the container is considered healthy and any
     * subsequent failures count toward the maximum number of retries.
     * </p>
     * </note>
     * 
     * @param startPeriod
     *        The optional grace period within which to provide containers time to bootstrap before failed health checks
     *        count towards the maximum number of retries. You may specify between 0 and 300 seconds. The
     *        <code>startPeriod</code> is disabled by default.</p> <note>
     *        <p>
     *        If a health check succeeds within the <code>startPeriod</code>, then the container is considered healthy
     *        and any subsequent failures count toward the maximum number of retries.
     *        </p>
     */

    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    /**
     * <p>
     * The optional grace period within which to provide containers time to bootstrap before failed health checks count
     * towards the maximum number of retries. You may specify between 0 and 300 seconds. The <code>startPeriod</code> is
     * disabled by default.
     * </p>
     * <note>
     * <p>
     * If a health check succeeds within the <code>startPeriod</code>, then the container is considered healthy and any
     * subsequent failures count toward the maximum number of retries.
     * </p>
     * </note>
     * 
     * @return The optional grace period within which to provide containers time to bootstrap before failed health
     *         checks count towards the maximum number of retries. You may specify between 0 and 300 seconds. The
     *         <code>startPeriod</code> is disabled by default.</p> <note>
     *         <p>
     *         If a health check succeeds within the <code>startPeriod</code>, then the container is considered healthy
     *         and any subsequent failures count toward the maximum number of retries.
     *         </p>
     */

    public Integer getStartPeriod() {
        return this.startPeriod;
    }

    /**
     * <p>
     * The optional grace period within which to provide containers time to bootstrap before failed health checks count
     * towards the maximum number of retries. You may specify between 0 and 300 seconds. The <code>startPeriod</code> is
     * disabled by default.
     * </p>
     * <note>
     * <p>
     * If a health check succeeds within the <code>startPeriod</code>, then the container is considered healthy and any
     * subsequent failures count toward the maximum number of retries.
     * </p>
     * </note>
     * 
     * @param startPeriod
     *        The optional grace period within which to provide containers time to bootstrap before failed health checks
     *        count towards the maximum number of retries. You may specify between 0 and 300 seconds. The
     *        <code>startPeriod</code> is disabled by default.</p> <note>
     *        <p>
     *        If a health check succeeds within the <code>startPeriod</code>, then the container is considered healthy
     *        and any subsequent failures count toward the maximum number of retries.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withStartPeriod(Integer startPeriod) {
        setStartPeriod(startPeriod);
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
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getRetries() != null)
            sb.append("Retries: ").append(getRetries()).append(",");
        if (getStartPeriod() != null)
            sb.append("StartPeriod: ").append(getStartPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheck == false)
            return false;
        HealthCheck other = (HealthCheck) obj;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getRetries() == null ^ this.getRetries() == null)
            return false;
        if (other.getRetries() != null && other.getRetries().equals(this.getRetries()) == false)
            return false;
        if (other.getStartPeriod() == null ^ this.getStartPeriod() == null)
            return false;
        if (other.getStartPeriod() != null && other.getStartPeriod().equals(this.getStartPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getRetries() == null) ? 0 : getRetries().hashCode());
        hashCode = prime * hashCode + ((getStartPeriod() == null) ? 0 : getStartPeriod().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheck clone() {
        try {
            return (HealthCheck) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.HealthCheckMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
