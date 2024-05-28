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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Instructions on when and how to check the health of a container in a container fleet. When health check properties
 * are set in a container definition, they override any Docker health checks in the container image. For more
 * information on container health checks, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_HealthCheck.html#ECS-Type-HealthCheck-command"
 * >HealthCheck command</a> in the <i>Amazon Elastic Container Service API</i>.
 * </p>
 * <p>
 * The following example instructions tell the container to wait 100 seconds after launch before counting failed health
 * checks, then initiate the health check command every 60 seconds. After issuing the health check command, wait 10
 * seconds for it to succeed. If it fails, retry the command 3 times before considering the container to be unhealthy.
 * </p>
 * <p>
 * <code>{"Command": [ "CMD-SHELL", "ps cax | grep "processmanager" || exit 1" ], "Interval": 300, "Timeout": 30, "Retries": 5, "StartPeriod": 100 }</code>
 * </p>
 * <p>
 * <b>Part of:</b> <a>ContainerDefinition$HealthCheck</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerHealthCheck" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerHealthCheck implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string array that specifies the command that the container runs to determine if it's healthy.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * The time period (in seconds) between each health check.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The time period (in seconds) to wait for a health check to succeed before a failed health check is counted.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. The first run of
     * the command does not count as a retry.
     * </p>
     */
    private Integer retries;
    /**
     * <p>
     * The optional grace period (in seconds) to give a container time to bootstrap before the first failed health check
     * counts toward the number of retries.
     * </p>
     */
    private Integer startPeriod;

    /**
     * <p>
     * A string array that specifies the command that the container runs to determine if it's healthy.
     * </p>
     * 
     * @return A string array that specifies the command that the container runs to determine if it's healthy.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * A string array that specifies the command that the container runs to determine if it's healthy.
     * </p>
     * 
     * @param command
     *        A string array that specifies the command that the container runs to determine if it's healthy.
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
     * A string array that specifies the command that the container runs to determine if it's healthy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        A string array that specifies the command that the container runs to determine if it's healthy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerHealthCheck withCommand(String... command) {
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
     * A string array that specifies the command that the container runs to determine if it's healthy.
     * </p>
     * 
     * @param command
     *        A string array that specifies the command that the container runs to determine if it's healthy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerHealthCheck withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The time period (in seconds) between each health check.
     * </p>
     * 
     * @param interval
     *        The time period (in seconds) between each health check.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The time period (in seconds) between each health check.
     * </p>
     * 
     * @return The time period (in seconds) between each health check.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The time period (in seconds) between each health check.
     * </p>
     * 
     * @param interval
     *        The time period (in seconds) between each health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerHealthCheck withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The time period (in seconds) to wait for a health check to succeed before a failed health check is counted.
     * </p>
     * 
     * @param timeout
     *        The time period (in seconds) to wait for a health check to succeed before a failed health check is
     *        counted.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The time period (in seconds) to wait for a health check to succeed before a failed health check is counted.
     * </p>
     * 
     * @return The time period (in seconds) to wait for a health check to succeed before a failed health check is
     *         counted.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The time period (in seconds) to wait for a health check to succeed before a failed health check is counted.
     * </p>
     * 
     * @param timeout
     *        The time period (in seconds) to wait for a health check to succeed before a failed health check is
     *        counted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerHealthCheck withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. The first run of
     * the command does not count as a retry.
     * </p>
     * 
     * @param retries
     *        The number of times to retry a failed health check before the container is considered unhealthy. The first
     *        run of the command does not count as a retry.
     */

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. The first run of
     * the command does not count as a retry.
     * </p>
     * 
     * @return The number of times to retry a failed health check before the container is considered unhealthy. The
     *         first run of the command does not count as a retry.
     */

    public Integer getRetries() {
        return this.retries;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. The first run of
     * the command does not count as a retry.
     * </p>
     * 
     * @param retries
     *        The number of times to retry a failed health check before the container is considered unhealthy. The first
     *        run of the command does not count as a retry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerHealthCheck withRetries(Integer retries) {
        setRetries(retries);
        return this;
    }

    /**
     * <p>
     * The optional grace period (in seconds) to give a container time to bootstrap before the first failed health check
     * counts toward the number of retries.
     * </p>
     * 
     * @param startPeriod
     *        The optional grace period (in seconds) to give a container time to bootstrap before the first failed
     *        health check counts toward the number of retries.
     */

    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    /**
     * <p>
     * The optional grace period (in seconds) to give a container time to bootstrap before the first failed health check
     * counts toward the number of retries.
     * </p>
     * 
     * @return The optional grace period (in seconds) to give a container time to bootstrap before the first failed
     *         health check counts toward the number of retries.
     */

    public Integer getStartPeriod() {
        return this.startPeriod;
    }

    /**
     * <p>
     * The optional grace period (in seconds) to give a container time to bootstrap before the first failed health check
     * counts toward the number of retries.
     * </p>
     * 
     * @param startPeriod
     *        The optional grace period (in seconds) to give a container time to bootstrap before the first failed
     *        health check counts toward the number of retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerHealthCheck withStartPeriod(Integer startPeriod) {
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

        if (obj instanceof ContainerHealthCheck == false)
            return false;
        ContainerHealthCheck other = (ContainerHealthCheck) obj;
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
    public ContainerHealthCheck clone() {
        try {
            return (ContainerHealthCheck) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerHealthCheckMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
