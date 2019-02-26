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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The configuration of the Lambda function.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/FunctionConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** The expected encoding type of the input payload for the function. The default is ''json''. */
    private String encodingType;
    /** The environment configuration of the function. */
    private FunctionConfigurationEnvironment environment;
    /** The execution arguments. */
    private String execArgs;
    /** The name of the function executable. */
    private String executable;
    /**
     * The memory size, in KB, which the function requires. This setting is not applicable and should be cleared when
     * you run the Lambda function without containerization.
     */
    private Integer memorySize;
    /** True if the function is pinned. Pinned means the function is long-lived and starts when the core starts. */
    private Boolean pinned;
    /**
     * The allowed function execution time, after which Lambda should terminate the function. This timeout still applies
     * to pinned Lambda functions for each request.
     */
    private Integer timeout;

    /**
     * The expected encoding type of the input payload for the function. The default is ''json''.
     * 
     * @param encodingType
     *        The expected encoding type of the input payload for the function. The default is ''json''.
     * @see EncodingType
     */

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * The expected encoding type of the input payload for the function. The default is ''json''.
     * 
     * @return The expected encoding type of the input payload for the function. The default is ''json''.
     * @see EncodingType
     */

    public String getEncodingType() {
        return this.encodingType;
    }

    /**
     * The expected encoding type of the input payload for the function. The default is ''json''.
     * 
     * @param encodingType
     *        The expected encoding type of the input payload for the function. The default is ''json''.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncodingType
     */

    public FunctionConfiguration withEncodingType(String encodingType) {
        setEncodingType(encodingType);
        return this;
    }

    /**
     * The expected encoding type of the input payload for the function. The default is ''json''.
     * 
     * @param encodingType
     *        The expected encoding type of the input payload for the function. The default is ''json''.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncodingType
     */

    public FunctionConfiguration withEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
        return this;
    }

    /**
     * The environment configuration of the function.
     * 
     * @param environment
     *        The environment configuration of the function.
     */

    public void setEnvironment(FunctionConfigurationEnvironment environment) {
        this.environment = environment;
    }

    /**
     * The environment configuration of the function.
     * 
     * @return The environment configuration of the function.
     */

    public FunctionConfigurationEnvironment getEnvironment() {
        return this.environment;
    }

    /**
     * The environment configuration of the function.
     * 
     * @param environment
     *        The environment configuration of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withEnvironment(FunctionConfigurationEnvironment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * The execution arguments.
     * 
     * @param execArgs
     *        The execution arguments.
     */

    public void setExecArgs(String execArgs) {
        this.execArgs = execArgs;
    }

    /**
     * The execution arguments.
     * 
     * @return The execution arguments.
     */

    public String getExecArgs() {
        return this.execArgs;
    }

    /**
     * The execution arguments.
     * 
     * @param execArgs
     *        The execution arguments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withExecArgs(String execArgs) {
        setExecArgs(execArgs);
        return this;
    }

    /**
     * The name of the function executable.
     * 
     * @param executable
     *        The name of the function executable.
     */

    public void setExecutable(String executable) {
        this.executable = executable;
    }

    /**
     * The name of the function executable.
     * 
     * @return The name of the function executable.
     */

    public String getExecutable() {
        return this.executable;
    }

    /**
     * The name of the function executable.
     * 
     * @param executable
     *        The name of the function executable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withExecutable(String executable) {
        setExecutable(executable);
        return this;
    }

    /**
     * The memory size, in KB, which the function requires. This setting is not applicable and should be cleared when
     * you run the Lambda function without containerization.
     * 
     * @param memorySize
     *        The memory size, in KB, which the function requires. This setting is not applicable and should be cleared
     *        when you run the Lambda function without containerization.
     */

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * The memory size, in KB, which the function requires. This setting is not applicable and should be cleared when
     * you run the Lambda function without containerization.
     * 
     * @return The memory size, in KB, which the function requires. This setting is not applicable and should be cleared
     *         when you run the Lambda function without containerization.
     */

    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * The memory size, in KB, which the function requires. This setting is not applicable and should be cleared when
     * you run the Lambda function without containerization.
     * 
     * @param memorySize
     *        The memory size, in KB, which the function requires. This setting is not applicable and should be cleared
     *        when you run the Lambda function without containerization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withMemorySize(Integer memorySize) {
        setMemorySize(memorySize);
        return this;
    }

    /**
     * True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
     * 
     * @param pinned
     *        True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
     */

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    /**
     * True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
     * 
     * @return True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
     */

    public Boolean getPinned() {
        return this.pinned;
    }

    /**
     * True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
     * 
     * @param pinned
     *        True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withPinned(Boolean pinned) {
        setPinned(pinned);
        return this;
    }

    /**
     * True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
     * 
     * @return True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
     */

    public Boolean isPinned() {
        return this.pinned;
    }

    /**
     * The allowed function execution time, after which Lambda should terminate the function. This timeout still applies
     * to pinned Lambda functions for each request.
     * 
     * @param timeout
     *        The allowed function execution time, after which Lambda should terminate the function. This timeout still
     *        applies to pinned Lambda functions for each request.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * The allowed function execution time, after which Lambda should terminate the function. This timeout still applies
     * to pinned Lambda functions for each request.
     * 
     * @return The allowed function execution time, after which Lambda should terminate the function. This timeout still
     *         applies to pinned Lambda functions for each request.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * The allowed function execution time, after which Lambda should terminate the function. This timeout still applies
     * to pinned Lambda functions for each request.
     * 
     * @param timeout
     *        The allowed function execution time, after which Lambda should terminate the function. This timeout still
     *        applies to pinned Lambda functions for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withTimeout(Integer timeout) {
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
        if (getEncodingType() != null)
            sb.append("EncodingType: ").append(getEncodingType()).append(",");
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
        if (other.getEncodingType() == null ^ this.getEncodingType() == null)
            return false;
        if (other.getEncodingType() != null && other.getEncodingType().equals(this.getEncodingType()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getEncodingType() == null) ? 0 : getEncodingType().hashCode());
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
