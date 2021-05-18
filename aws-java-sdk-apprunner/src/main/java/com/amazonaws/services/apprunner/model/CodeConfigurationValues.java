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
 * Describes the basic configuration needed for building and running an AWS App Runner service. This type doesn't
 * support the full set of possible configuration options. Fur full configuration capabilities, use a
 * <code>apprunner.yaml</code> file in the source code repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CodeConfigurationValues" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeConfigurationValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A runtime environment type for building and running an App Runner service. It represents a programming language
     * runtime.
     * </p>
     */
    private String runtime;
    /**
     * <p>
     * The command App Runner runs to build your application.
     * </p>
     */
    private String buildCommand;
    /**
     * <p>
     * The command App Runner runs to start your application.
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
     * The environment variables that are available to your running App Runner service. An array of key-value pairs.
     * Keys with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     * </p>
     */
    private java.util.Map<String, String> runtimeEnvironmentVariables;

    /**
     * <p>
     * A runtime environment type for building and running an App Runner service. It represents a programming language
     * runtime.
     * </p>
     * 
     * @param runtime
     *        A runtime environment type for building and running an App Runner service. It represents a programming
     *        language runtime.
     * @see Runtime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * A runtime environment type for building and running an App Runner service. It represents a programming language
     * runtime.
     * </p>
     * 
     * @return A runtime environment type for building and running an App Runner service. It represents a programming
     *         language runtime.
     * @see Runtime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * A runtime environment type for building and running an App Runner service. It represents a programming language
     * runtime.
     * </p>
     * 
     * @param runtime
     *        A runtime environment type for building and running an App Runner service. It represents a programming
     *        language runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public CodeConfigurationValues withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * A runtime environment type for building and running an App Runner service. It represents a programming language
     * runtime.
     * </p>
     * 
     * @param runtime
     *        A runtime environment type for building and running an App Runner service. It represents a programming
     *        language runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public CodeConfigurationValues withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * <p>
     * The command App Runner runs to build your application.
     * </p>
     * 
     * @param buildCommand
     *        The command App Runner runs to build your application.
     */

    public void setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
    }

    /**
     * <p>
     * The command App Runner runs to build your application.
     * </p>
     * 
     * @return The command App Runner runs to build your application.
     */

    public String getBuildCommand() {
        return this.buildCommand;
    }

    /**
     * <p>
     * The command App Runner runs to build your application.
     * </p>
     * 
     * @param buildCommand
     *        The command App Runner runs to build your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeConfigurationValues withBuildCommand(String buildCommand) {
        setBuildCommand(buildCommand);
        return this;
    }

    /**
     * <p>
     * The command App Runner runs to start your application.
     * </p>
     * 
     * @param startCommand
     *        The command App Runner runs to start your application.
     */

    public void setStartCommand(String startCommand) {
        this.startCommand = startCommand;
    }

    /**
     * <p>
     * The command App Runner runs to start your application.
     * </p>
     * 
     * @return The command App Runner runs to start your application.
     */

    public String getStartCommand() {
        return this.startCommand;
    }

    /**
     * <p>
     * The command App Runner runs to start your application.
     * </p>
     * 
     * @param startCommand
     *        The command App Runner runs to start your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeConfigurationValues withStartCommand(String startCommand) {
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

    public CodeConfigurationValues withPort(String port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The environment variables that are available to your running App Runner service. An array of key-value pairs.
     * Keys with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     * </p>
     * 
     * @return The environment variables that are available to your running App Runner service. An array of key-value
     *         pairs. Keys with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     */

    public java.util.Map<String, String> getRuntimeEnvironmentVariables() {
        return runtimeEnvironmentVariables;
    }

    /**
     * <p>
     * The environment variables that are available to your running App Runner service. An array of key-value pairs.
     * Keys with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     * </p>
     * 
     * @param runtimeEnvironmentVariables
     *        The environment variables that are available to your running App Runner service. An array of key-value
     *        pairs. Keys with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     */

    public void setRuntimeEnvironmentVariables(java.util.Map<String, String> runtimeEnvironmentVariables) {
        this.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
    }

    /**
     * <p>
     * The environment variables that are available to your running App Runner service. An array of key-value pairs.
     * Keys with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     * </p>
     * 
     * @param runtimeEnvironmentVariables
     *        The environment variables that are available to your running App Runner service. An array of key-value
     *        pairs. Keys with a prefix of <code>AWSAPPRUNNER</code> are reserved for system use and aren't valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeConfigurationValues withRuntimeEnvironmentVariables(java.util.Map<String, String> runtimeEnvironmentVariables) {
        setRuntimeEnvironmentVariables(runtimeEnvironmentVariables);
        return this;
    }

    /**
     * Add a single RuntimeEnvironmentVariables entry
     *
     * @see CodeConfigurationValues#withRuntimeEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CodeConfigurationValues addRuntimeEnvironmentVariablesEntry(String key, String value) {
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

    public CodeConfigurationValues clearRuntimeEnvironmentVariablesEntries() {
        this.runtimeEnvironmentVariables = null;
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
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime()).append(",");
        if (getBuildCommand() != null)
            sb.append("BuildCommand: ").append("***Sensitive Data Redacted***").append(",");
        if (getStartCommand() != null)
            sb.append("StartCommand: ").append("***Sensitive Data Redacted***").append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getRuntimeEnvironmentVariables() != null)
            sb.append("RuntimeEnvironmentVariables: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeConfigurationValues == false)
            return false;
        CodeConfigurationValues other = (CodeConfigurationValues) obj;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        if (other.getBuildCommand() == null ^ this.getBuildCommand() == null)
            return false;
        if (other.getBuildCommand() != null && other.getBuildCommand().equals(this.getBuildCommand()) == false)
            return false;
        if (other.getStartCommand() == null ^ this.getStartCommand() == null)
            return false;
        if (other.getStartCommand() != null && other.getStartCommand().equals(this.getStartCommand()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getRuntimeEnvironmentVariables() == null ^ this.getRuntimeEnvironmentVariables() == null)
            return false;
        if (other.getRuntimeEnvironmentVariables() != null && other.getRuntimeEnvironmentVariables().equals(this.getRuntimeEnvironmentVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getBuildCommand() == null) ? 0 : getBuildCommand().hashCode());
        hashCode = prime * hashCode + ((getStartCommand() == null) ? 0 : getStartCommand().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getRuntimeEnvironmentVariables() == null) ? 0 : getRuntimeEnvironmentVariables().hashCode());
        return hashCode;
    }

    @Override
    public CodeConfigurationValues clone() {
        try {
            return (CodeConfigurationValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.CodeConfigurationValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
