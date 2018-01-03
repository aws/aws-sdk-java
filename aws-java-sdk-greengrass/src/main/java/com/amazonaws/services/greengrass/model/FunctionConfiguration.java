/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Configuration of the function
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/FunctionConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** Environment of the function configuration */
    private FunctionConfigurationEnvironment environment;
    /** Execution Arguments */
    private String execArgs;
    /** Executable */
    private String executable;
    /** The memory size, in KB, you configured for the function. */
    private Integer memorySize;
    /** Whether the function is pinned or not. Pinned means the function is long-lived and starts when the core starts. */
    private Boolean pinned;
    /**
     * The function execution time at which Lambda should terminate the function. This timeout still applies to pinned
     * lambdas for each request.
     */
    private Integer timeout;

    /**
     * Environment of the function configuration
     * 
     * @param environment
     *        Environment of the function configuration
     */

    public void setEnvironment(FunctionConfigurationEnvironment environment) {
        this.environment = environment;
    }

    /**
     * Environment of the function configuration
     * 
     * @return Environment of the function configuration
     */

    public FunctionConfigurationEnvironment getEnvironment() {
        return this.environment;
    }

    /**
     * Environment of the function configuration
     * 
     * @param environment
     *        Environment of the function configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withEnvironment(FunctionConfigurationEnvironment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Execution Arguments
     * 
     * @param execArgs
     *        Execution Arguments
     */

    public void setExecArgs(String execArgs) {
        this.execArgs = execArgs;
    }

    /**
     * Execution Arguments
     * 
     * @return Execution Arguments
     */

    public String getExecArgs() {
        return this.execArgs;
    }

    /**
     * Execution Arguments
     * 
     * @param execArgs
     *        Execution Arguments
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withExecArgs(String execArgs) {
        setExecArgs(execArgs);
        return this;
    }

    /**
     * Executable
     * 
     * @param executable
     *        Executable
     */

    public void setExecutable(String executable) {
        this.executable = executable;
    }

    /**
     * Executable
     * 
     * @return Executable
     */

    public String getExecutable() {
        return this.executable;
    }

    /**
     * Executable
     * 
     * @param executable
     *        Executable
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withExecutable(String executable) {
        setExecutable(executable);
        return this;
    }

    /**
     * The memory size, in KB, you configured for the function.
     * 
     * @param memorySize
     *        The memory size, in KB, you configured for the function.
     */

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * The memory size, in KB, you configured for the function.
     * 
     * @return The memory size, in KB, you configured for the function.
     */

    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * The memory size, in KB, you configured for the function.
     * 
     * @param memorySize
     *        The memory size, in KB, you configured for the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withMemorySize(Integer memorySize) {
        setMemorySize(memorySize);
        return this;
    }

    /**
     * Whether the function is pinned or not. Pinned means the function is long-lived and starts when the core starts.
     * 
     * @param pinned
     *        Whether the function is pinned or not. Pinned means the function is long-lived and starts when the core
     *        starts.
     */

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    /**
     * Whether the function is pinned or not. Pinned means the function is long-lived and starts when the core starts.
     * 
     * @return Whether the function is pinned or not. Pinned means the function is long-lived and starts when the core
     *         starts.
     */

    public Boolean getPinned() {
        return this.pinned;
    }

    /**
     * Whether the function is pinned or not. Pinned means the function is long-lived and starts when the core starts.
     * 
     * @param pinned
     *        Whether the function is pinned or not. Pinned means the function is long-lived and starts when the core
     *        starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withPinned(Boolean pinned) {
        setPinned(pinned);
        return this;
    }

    /**
     * Whether the function is pinned or not. Pinned means the function is long-lived and starts when the core starts.
     * 
     * @return Whether the function is pinned or not. Pinned means the function is long-lived and starts when the core
     *         starts.
     */

    public Boolean isPinned() {
        return this.pinned;
    }

    /**
     * The function execution time at which Lambda should terminate the function. This timeout still applies to pinned
     * lambdas for each request.
     * 
     * @param timeout
     *        The function execution time at which Lambda should terminate the function. This timeout still applies to
     *        pinned lambdas for each request.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * The function execution time at which Lambda should terminate the function. This timeout still applies to pinned
     * lambdas for each request.
     * 
     * @return The function execution time at which Lambda should terminate the function. This timeout still applies to
     *         pinned lambdas for each request.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * The function execution time at which Lambda should terminate the function. This timeout still applies to pinned
     * lambdas for each request.
     * 
     * @param timeout
     *        The function execution time at which Lambda should terminate the function. This timeout still applies to
     *        pinned lambdas for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withTimeout(Integer timeout) {
        setTimeout(timeout);
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
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getExecArgs() != null)
            sb.append("ExecArgs: ").append(getExecArgs()).append(",");
        if (getExecutable() != null)
            sb.append("Executable: ").append(getExecutable()).append(",");
        if (getMemorySize() != null)
            sb.append("MemorySize: ").append(getMemorySize()).append(",");
        if (getPinned() != null)
            sb.append("Pinned: ").append(getPinned()).append(",");
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

        if (obj instanceof FunctionConfiguration == false)
            return false;
        FunctionConfiguration other = (FunctionConfiguration) obj;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getExecArgs() == null ^ this.getExecArgs() == null)
            return false;
        if (other.getExecArgs() != null && other.getExecArgs().equals(this.getExecArgs()) == false)
            return false;
        if (other.getExecutable() == null ^ this.getExecutable() == null)
            return false;
        if (other.getExecutable() != null && other.getExecutable().equals(this.getExecutable()) == false)
            return false;
        if (other.getMemorySize() == null ^ this.getMemorySize() == null)
            return false;
        if (other.getMemorySize() != null && other.getMemorySize().equals(this.getMemorySize()) == false)
            return false;
        if (other.getPinned() == null ^ this.getPinned() == null)
            return false;
        if (other.getPinned() != null && other.getPinned().equals(this.getPinned()) == false)
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

        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getExecArgs() == null) ? 0 : getExecArgs().hashCode());
        hashCode = prime * hashCode + ((getExecutable() == null) ? 0 : getExecutable().hashCode());
        hashCode = prime * hashCode + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode());
        hashCode = prime * hashCode + ((getPinned() == null) ? 0 : getPinned().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        return hashCode;
    }

    @Override
    public FunctionConfiguration clone() {
        try {
            return (FunctionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.FunctionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
