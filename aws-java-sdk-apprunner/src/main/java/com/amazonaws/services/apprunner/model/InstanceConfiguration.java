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
 * Describes the runtime configuration of an AWS App Runner service instance (scaling unit).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/InstanceConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of CPU units reserved for each instance of your App Runner service.
     * </p>
     * <p>
     * Default: <code>1 vCPU</code>
     * </p>
     */
    private String cpu;
    /**
     * <p>
     * The amount of memory, in MB or GB, reserved for each instance of your App Runner service.
     * </p>
     * <p>
     * Default: <code>2 GB</code>
     * </p>
     */
    private String memory;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner service. These are
     * permissions that your code needs when it calls any AWS APIs.
     * </p>
     */
    private String instanceRoleArn;

    /**
     * <p>
     * The number of CPU units reserved for each instance of your App Runner service.
     * </p>
     * <p>
     * Default: <code>1 vCPU</code>
     * </p>
     * 
     * @param cpu
     *        The number of CPU units reserved for each instance of your App Runner service.</p>
     *        <p>
     *        Default: <code>1 vCPU</code>
     */

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of CPU units reserved for each instance of your App Runner service.
     * </p>
     * <p>
     * Default: <code>1 vCPU</code>
     * </p>
     * 
     * @return The number of CPU units reserved for each instance of your App Runner service.</p>
     *         <p>
     *         Default: <code>1 vCPU</code>
     */

    public String getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of CPU units reserved for each instance of your App Runner service.
     * </p>
     * <p>
     * Default: <code>1 vCPU</code>
     * </p>
     * 
     * @param cpu
     *        The number of CPU units reserved for each instance of your App Runner service.</p>
     *        <p>
     *        Default: <code>1 vCPU</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfiguration withCpu(String cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The amount of memory, in MB or GB, reserved for each instance of your App Runner service.
     * </p>
     * <p>
     * Default: <code>2 GB</code>
     * </p>
     * 
     * @param memory
     *        The amount of memory, in MB or GB, reserved for each instance of your App Runner service.</p>
     *        <p>
     *        Default: <code>2 GB</code>
     */

    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The amount of memory, in MB or GB, reserved for each instance of your App Runner service.
     * </p>
     * <p>
     * Default: <code>2 GB</code>
     * </p>
     * 
     * @return The amount of memory, in MB or GB, reserved for each instance of your App Runner service.</p>
     *         <p>
     *         Default: <code>2 GB</code>
     */

    public String getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The amount of memory, in MB or GB, reserved for each instance of your App Runner service.
     * </p>
     * <p>
     * Default: <code>2 GB</code>
     * </p>
     * 
     * @param memory
     *        The amount of memory, in MB or GB, reserved for each instance of your App Runner service.</p>
     *        <p>
     *        Default: <code>2 GB</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfiguration withMemory(String memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner service. These are
     * permissions that your code needs when it calls any AWS APIs.
     * </p>
     * 
     * @param instanceRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner service. These
     *        are permissions that your code needs when it calls any AWS APIs.
     */

    public void setInstanceRoleArn(String instanceRoleArn) {
        this.instanceRoleArn = instanceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner service. These are
     * permissions that your code needs when it calls any AWS APIs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner service. These
     *         are permissions that your code needs when it calls any AWS APIs.
     */

    public String getInstanceRoleArn() {
        return this.instanceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner service. These are
     * permissions that your code needs when it calls any AWS APIs.
     * </p>
     * 
     * @param instanceRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner service. These
     *        are permissions that your code needs when it calls any AWS APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfiguration withInstanceRoleArn(String instanceRoleArn) {
        setInstanceRoleArn(instanceRoleArn);
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
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getInstanceRoleArn() != null)
            sb.append("InstanceRoleArn: ").append(getInstanceRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceConfiguration == false)
            return false;
        InstanceConfiguration other = (InstanceConfiguration) obj;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getInstanceRoleArn() == null ^ this.getInstanceRoleArn() == null)
            return false;
        if (other.getInstanceRoleArn() != null && other.getInstanceRoleArn().equals(this.getInstanceRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getInstanceRoleArn() == null) ? 0 : getInstanceRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public InstanceConfiguration clone() {
        try {
            return (InstanceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.InstanceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
