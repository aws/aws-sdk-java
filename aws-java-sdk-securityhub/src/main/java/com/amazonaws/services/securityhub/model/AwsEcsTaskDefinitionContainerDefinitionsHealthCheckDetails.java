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
 * The container health check command and associated configuration parameters for the container.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The command that the container runs to determine whether it is healthy.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * The time period in seconds between each health check execution. The default value is 30 seconds.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. The default
     * value is 3.
     * </p>
     */
    private Integer retries;
    /**
     * <p>
     * The optional grace period in seconds that allows containers time to bootstrap before failed health checks count
     * towards the maximum number of retries.
     * </p>
     */
    private Integer startPeriod;
    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. The default
     * value is 5.
     * </p>
     */
    private Integer timeout;

    /**
     * <p>
     * The command that the container runs to determine whether it is healthy.
     * </p>
     * 
     * @return The command that the container runs to determine whether it is healthy.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The command that the container runs to determine whether it is healthy.
     * </p>
     * 
     * @param command
     *        The command that the container runs to determine whether it is healthy.
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
     * The command that the container runs to determine whether it is healthy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command that the container runs to determine whether it is healthy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails withCommand(String... command) {
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
     * The command that the container runs to determine whether it is healthy.
     * </p>
     * 
     * @param command
     *        The command that the container runs to determine whether it is healthy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The time period in seconds between each health check execution. The default value is 30 seconds.
     * </p>
     * 
     * @param interval
     *        The time period in seconds between each health check execution. The default value is 30 seconds.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The time period in seconds between each health check execution. The default value is 30 seconds.
     * </p>
     * 
     * @return The time period in seconds between each health check execution. The default value is 30 seconds.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The time period in seconds between each health check execution. The default value is 30 seconds.
     * </p>
     * 
     * @param interval
     *        The time period in seconds between each health check execution. The default value is 30 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. The default
     * value is 3.
     * </p>
     * 
     * @param retries
     *        The number of times to retry a failed health check before the container is considered unhealthy. The
     *        default value is 3.
     */

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. The default
     * value is 3.
     * </p>
     * 
     * @return The number of times to retry a failed health check before the container is considered unhealthy. The
     *         default value is 3.
     */

    public Integer getRetries() {
        return this.retries;
    }

    /**
     * <p>
     * The number of times to retry a failed health check before the container is considered unhealthy. The default
     * value is 3.
     * </p>
     * 
     * @param retries
     *        The number of times to retry a failed health check before the container is considered unhealthy. The
     *        default value is 3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails withRetries(Integer retries) {
        setRetries(retries);
        return this;
    }

    /**
     * <p>
     * The optional grace period in seconds that allows containers time to bootstrap before failed health checks count
     * towards the maximum number of retries.
     * </p>
     * 
     * @param startPeriod
     *        The optional grace period in seconds that allows containers time to bootstrap before failed health checks
     *        count towards the maximum number of retries.
     */

    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    /**
     * <p>
     * The optional grace period in seconds that allows containers time to bootstrap before failed health checks count
     * towards the maximum number of retries.
     * </p>
     * 
     * @return The optional grace period in seconds that allows containers time to bootstrap before failed health checks
     *         count towards the maximum number of retries.
     */

    public Integer getStartPeriod() {
        return this.startPeriod;
    }

    /**
     * <p>
     * The optional grace period in seconds that allows containers time to bootstrap before failed health checks count
     * towards the maximum number of retries.
     * </p>
     * 
     * @param startPeriod
     *        The optional grace period in seconds that allows containers time to bootstrap before failed health checks
     *        count towards the maximum number of retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails withStartPeriod(Integer startPeriod) {
        setStartPeriod(startPeriod);
        return this;
    }

    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. The default
     * value is 5.
     * </p>
     * 
     * @param timeout
     *        The time period in seconds to wait for a health check to succeed before it is considered a failure. The
     *        default value is 5.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. The default
     * value is 5.
     * </p>
     * 
     * @return The time period in seconds to wait for a health check to succeed before it is considered a failure. The
     *         default value is 5.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. The default
     * value is 5.
     * </p>
     * 
     * @param timeout
     *        The time period in seconds to wait for a health check to succeed before it is considered a failure. The
     *        default value is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails withTimeout(Integer timeout) {
        setTimeout(timeout);
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
        if (getRetries() != null)
            sb.append("Retries: ").append(getRetries()).append(",");
        if (getStartPeriod() != null)
            sb.append("StartPeriod: ").append(getStartPeriod()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails other = (AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails) obj;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getRetries() == null ^ this.getRetries() == null)
            return false;
        if (other.getRetries() != null && other.getRetries().equals(this.getRetries()) == false)
            return false;
        if (other.getStartPeriod() == null ^ this.getStartPeriod() == null)
            return false;
        if (other.getStartPeriod() != null && other.getStartPeriod().equals(this.getStartPeriod()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getRetries() == null) ? 0 : getRetries().hashCode());
        hashCode = prime * hashCode + ((getStartPeriod() == null) ? 0 : getStartPeriod().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
