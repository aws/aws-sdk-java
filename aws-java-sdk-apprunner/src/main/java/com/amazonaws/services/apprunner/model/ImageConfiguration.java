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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration that AWS App Runner uses to run an App Runner service using an image pulled from a source
 * image repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ImageConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Environment variables that are available to your running App Runner service. An array of key-value pairs. Keys
     * with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     * </p>
     */
    private java.util.Map<String, String> runtimeEnvironmentVariables;
    /**
     * <p>
     * An optional command that App Runner runs to start the application in the source image. If specified, this command
     * overrides the Docker image’s default start command.
     * </p>
     */
    private String startCommand;
    /**
     * <p>
     * The port that your application listens to in the container.
     * </p>
     * <p>
     * Default: <code>8080</code>
     * </p>
     */
    private String port;

    /**
     * <p>
     * Environment variables that are available to your running App Runner service. An array of key-value pairs. Keys
     * with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     * </p>
     * 
     * @return Environment variables that are available to your running App Runner service. An array of key-value pairs.
     *         Keys with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     */

    public java.util.Map<String, String> getRuntimeEnvironmentVariables() {
        return runtimeEnvironmentVariables;
    }

    /**
     * <p>
     * Environment variables that are available to your running App Runner service. An array of key-value pairs. Keys
     * with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     * </p>
     * 
     * @param runtimeEnvironmentVariables
     *        Environment variables that are available to your running App Runner service. An array of key-value pairs.
     *        Keys with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     */

    public void setRuntimeEnvironmentVariables(java.util.Map<String, String> runtimeEnvironmentVariables) {
        this.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
    }

    /**
     * <p>
     * Environment variables that are available to your running App Runner service. An array of key-value pairs. Keys
     * with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     * </p>
     * 
     * @param runtimeEnvironmentVariables
     *        Environment variables that are available to your running App Runner service. An array of key-value pairs.
     *        Keys with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfiguration withRuntimeEnvironmentVariables(java.util.Map<String, String> runtimeEnvironmentVariables) {
        setRuntimeEnvironmentVariables(runtimeEnvironmentVariables);
        return this;
    }

    /**
     * Add a single RuntimeEnvironmentVariables entry
     *
     * @see ImageConfiguration#withRuntimeEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfiguration addRuntimeEnvironmentVariablesEntry(String key, String value) {
        if (null == this.runtimeEnvironmentVariables) {
            this.runtimeEnvironmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.runtimeEnvironmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.runtimeEnvironmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RuntimeEnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfiguration clearRuntimeEnvironmentVariablesEntries() {
        this.runtimeEnvironmentVariables = null;
        return this;
    }

    /**
     * <p>
     * An optional command that App Runner runs to start the application in the source image. If specified, this command
     * overrides the Docker image’s default start command.
     * </p>
     * 
     * @param startCommand
     *        An optional command that App Runner runs to start the application in the source image. If specified, this
     *        command overrides the Docker image’s default start command.
     */

    public void setStartCommand(String startCommand) {
        this.startCommand = startCommand;
    }

    /**
     * <p>
     * An optional command that App Runner runs to start the application in the source image. If specified, this command
     * overrides the Docker image’s default start command.
     * </p>
     * 
     * @return An optional command that App Runner runs to start the application in the source image. If specified, this
     *         command overrides the Docker image’s default start command.
     */

    public String getStartCommand() {
        return this.startCommand;
    }

    /**
     * <p>
     * An optional command that App Runner runs to start the application in the source image. If specified, this command
     * overrides the Docker image’s default start command.
     * </p>
     * 
     * @param startCommand
     *        An optional command that App Runner runs to start the application in the source image. If specified, this
     *        command overrides the Docker image’s default start command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfiguration withStartCommand(String startCommand) {
        setStartCommand(startCommand);
        return this;
    }

    /**
     * <p>
     * The port that your application listens to in the container.
     * </p>
     * <p>
     * Default: <code>8080</code>
     * </p>
     * 
     * @param port
     *        The port that your application listens to in the container.</p>
     *        <p>
     *        Default: <code>8080</code>
     */

    public void setPort(String port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that your application listens to in the container.
     * </p>
     * <p>
     * Default: <code>8080</code>
     * </p>
     * 
     * @return The port that your application listens to in the container.</p>
     *         <p>
     *         Default: <code>8080</code>
     */

    public String getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port that your application listens to in the container.
     * </p>
     * <p>
     * Default: <code>8080</code>
     * </p>
     * 
     * @param port
     *        The port that your application listens to in the container.</p>
     *        <p>
     *        Default: <code>8080</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfiguration withPort(String port) {
        setPort(port);
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
        if (getRuntimeEnvironmentVariables() != null)
            sb.append("RuntimeEnvironmentVariables: ").append("***Sensitive Data Redacted***").append(",");
        if (getStartCommand() != null)
            sb.append("StartCommand: ").append(getStartCommand()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageConfiguration == false)
            return false;
        ImageConfiguration other = (ImageConfiguration) obj;
        if (other.getRuntimeEnvironmentVariables() == null ^ this.getRuntimeEnvironmentVariables() == null)
            return false;
        if (other.getRuntimeEnvironmentVariables() != null && other.getRuntimeEnvironmentVariables().equals(this.getRuntimeEnvironmentVariables()) == false)
            return false;
        if (other.getStartCommand() == null ^ this.getStartCommand() == null)
            return false;
        if (other.getStartCommand() != null && other.getStartCommand().equals(this.getStartCommand()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuntimeEnvironmentVariables() == null) ? 0 : getRuntimeEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getStartCommand() == null) ? 0 : getStartCommand().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public ImageConfiguration clone() {
        try {
            return (ImageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.ImageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
