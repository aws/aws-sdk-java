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
 * Log configuration options to send to a custom log driver for the container.
 * </p>
 */
public class LogConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed above that you would like to work with the Amazon ECS container
     * agent, you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you would like to have included. However, Amazon Web
     * Services does not currently provide support for running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     */
    private String logDriver;
    /**
     * <p>
     * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote
     * API or greater on your container instance. To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     */
    private java.util.Map<String, String> options;

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed above that you would like to work with the Amazon ECS container
     * agent, you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you would like to have included. However, Amazon Web
     * Services does not currently provide support for running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param logDriver
     *        The log driver to use for the container. The valid values listed for this parameter are log drivers that
     *        the Amazon ECS container agent can communicate with by default. </p> <note>
     *        <p>
     *        If you have a custom driver that is not listed above that you would like to work with the Amazon ECS
     *        container agent, you can fork the Amazon ECS container agent project that is <a
     *        href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that
     *        driver. We encourage you to submit pull requests for changes that you would like to have included.
     *        However, Amazon Web Services does not currently provide support for running modified copies of this
     *        software.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log into your container instance and run
     *        the following command: <code>sudo docker version | grep "Server API version"</code>
     * @see LogDriver
     */

    public void setLogDriver(String logDriver) {
        this.logDriver = logDriver;
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed above that you would like to work with the Amazon ECS container
     * agent, you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you would like to have included. However, Amazon Web
     * Services does not currently provide support for running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @return The log driver to use for the container. The valid values listed for this parameter are log drivers that
     *         the Amazon ECS container agent can communicate with by default. </p> <note>
     *         <p>
     *         If you have a custom driver that is not listed above that you would like to work with the Amazon ECS
     *         container agent, you can fork the Amazon ECS container agent project that is <a
     *         href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that
     *         driver. We encourage you to submit pull requests for changes that you would like to have included.
     *         However, Amazon Web Services does not currently provide support for running modified copies of this
     *         software.
     *         </p>
     *         </note>
     *         <p>
     *         This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *         check the Docker Remote API version on your container instance, log into your container instance and run
     *         the following command: <code>sudo docker version | grep "Server API version"</code>
     * @see LogDriver
     */

    public String getLogDriver() {
        return this.logDriver;
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed above that you would like to work with the Amazon ECS container
     * agent, you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you would like to have included. However, Amazon Web
     * Services does not currently provide support for running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param logDriver
     *        The log driver to use for the container. The valid values listed for this parameter are log drivers that
     *        the Amazon ECS container agent can communicate with by default. </p> <note>
     *        <p>
     *        If you have a custom driver that is not listed above that you would like to work with the Amazon ECS
     *        container agent, you can fork the Amazon ECS container agent project that is <a
     *        href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that
     *        driver. We encourage you to submit pull requests for changes that you would like to have included.
     *        However, Amazon Web Services does not currently provide support for running modified copies of this
     *        software.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log into your container instance and run
     *        the following command: <code>sudo docker version | grep "Server API version"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDriver
     */

    public LogConfiguration withLogDriver(String logDriver) {
        setLogDriver(logDriver);
        return this;
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed above that you would like to work with the Amazon ECS container
     * agent, you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you would like to have included. However, Amazon Web
     * Services does not currently provide support for running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param logDriver
     *        The log driver to use for the container. The valid values listed for this parameter are log drivers that
     *        the Amazon ECS container agent can communicate with by default. </p> <note>
     *        <p>
     *        If you have a custom driver that is not listed above that you would like to work with the Amazon ECS
     *        container agent, you can fork the Amazon ECS container agent project that is <a
     *        href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that
     *        driver. We encourage you to submit pull requests for changes that you would like to have included.
     *        However, Amazon Web Services does not currently provide support for running modified copies of this
     *        software.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log into your container instance and run
     *        the following command: <code>sudo docker version | grep "Server API version"</code>
     * @see LogDriver
     */

    public void setLogDriver(LogDriver logDriver) {
        this.logDriver = logDriver.toString();
    }

    /**
     * <p>
     * The log driver to use for the container. The valid values listed for this parameter are log drivers that the
     * Amazon ECS container agent can communicate with by default.
     * </p>
     * <note>
     * <p>
     * If you have a custom driver that is not listed above that you would like to work with the Amazon ECS container
     * agent, you can fork the Amazon ECS container agent project that is <a
     * href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that driver.
     * We encourage you to submit pull requests for changes that you would like to have included. However, Amazon Web
     * Services does not currently provide support for running modified copies of this software.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param logDriver
     *        The log driver to use for the container. The valid values listed for this parameter are log drivers that
     *        the Amazon ECS container agent can communicate with by default. </p> <note>
     *        <p>
     *        If you have a custom driver that is not listed above that you would like to work with the Amazon ECS
     *        container agent, you can fork the Amazon ECS container agent project that is <a
     *        href="https://github.com/aws/amazon-ecs-agent">available on GitHub</a> and customize it to work with that
     *        driver. We encourage you to submit pull requests for changes that you would like to have included.
     *        However, Amazon Web Services does not currently provide support for running modified copies of this
     *        software.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log into your container instance and run
     *        the following command: <code>sudo docker version | grep "Server API version"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDriver
     */

    public LogConfiguration withLogDriver(LogDriver logDriver) {
        setLogDriver(logDriver);
        return this;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote
     * API or greater on your container instance. To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @return The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker
     *         Remote API or greater on your container instance. To check the Docker Remote API version on your
     *         container instance, log into your container instance and run the following command:
     *         <code>sudo docker version | grep "Server API version"</code>
     */

    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote
     * API or greater on your container instance. To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param options
     *        The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker
     *        Remote API or greater on your container instance. To check the Docker Remote API version on your container
     *        instance, log into your container instance and run the following command:
     *        <code>sudo docker version | grep "Server API version"</code>
     */

    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote
     * API or greater on your container instance. To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command:
     * <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * 
     * @param options
     *        The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker
     *        Remote API or greater on your container instance. To check the Docker Remote API version on your container
     *        instance, log into your container instance and run the following command:
     *        <code>sudo docker version | grep "Server API version"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration withOptions(java.util.Map<String, String> options) {
        setOptions(options);
        return this;
    }

    public LogConfiguration addOptionsEntry(String key, String value) {
        if (null == this.options) {
            this.options = new java.util.HashMap<String, String>();
        }
        if (this.options.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.options.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Options.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration clearOptionsEntries() {
        this.options = null;
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
        if (getLogDriver() != null)
            sb.append("LogDriver: " + getLogDriver() + ",");
        if (getOptions() != null)
            sb.append("Options: " + getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogConfiguration == false)
            return false;
        LogConfiguration other = (LogConfiguration) obj;
        if (other.getLogDriver() == null ^ this.getLogDriver() == null)
            return false;
        if (other.getLogDriver() != null && other.getLogDriver().equals(this.getLogDriver()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogDriver() == null) ? 0 : getLogDriver().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public LogConfiguration clone() {
        try {
            return (LogConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
