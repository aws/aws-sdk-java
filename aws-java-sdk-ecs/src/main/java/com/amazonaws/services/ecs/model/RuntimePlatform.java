/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about the platform for the Amazon ECS service or task.
 * </p>
 * <p>
 * For more information about <code>RuntimePlatform</code>, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#runtime-platform"
 * >RuntimePlatform</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RuntimePlatform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimePlatform implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CPU architecture.
     * </p>
     * <p>
     * You can run your Linux tasks on an ARM-based platform by setting the value to <code>ARM64</code>. This option is
     * avaiable for tasks that run on Linux Amazon EC2 instance or Linux containers on Fargate.
     * </p>
     */
    private String cpuArchitecture;
    /**
     * <p>
     * The operating system.
     * </p>
     */
    private String operatingSystemFamily;

    /**
     * <p>
     * The CPU architecture.
     * </p>
     * <p>
     * You can run your Linux tasks on an ARM-based platform by setting the value to <code>ARM64</code>. This option is
     * avaiable for tasks that run on Linux Amazon EC2 instance or Linux containers on Fargate.
     * </p>
     * 
     * @param cpuArchitecture
     *        The CPU architecture.</p>
     *        <p>
     *        You can run your Linux tasks on an ARM-based platform by setting the value to <code>ARM64</code>. This
     *        option is avaiable for tasks that run on Linux Amazon EC2 instance or Linux containers on Fargate.
     * @see CPUArchitecture
     */

    public void setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
    }

    /**
     * <p>
     * The CPU architecture.
     * </p>
     * <p>
     * You can run your Linux tasks on an ARM-based platform by setting the value to <code>ARM64</code>. This option is
     * avaiable for tasks that run on Linux Amazon EC2 instance or Linux containers on Fargate.
     * </p>
     * 
     * @return The CPU architecture.</p>
     *         <p>
     *         You can run your Linux tasks on an ARM-based platform by setting the value to <code>ARM64</code>. This
     *         option is avaiable for tasks that run on Linux Amazon EC2 instance or Linux containers on Fargate.
     * @see CPUArchitecture
     */

    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    /**
     * <p>
     * The CPU architecture.
     * </p>
     * <p>
     * You can run your Linux tasks on an ARM-based platform by setting the value to <code>ARM64</code>. This option is
     * avaiable for tasks that run on Linux Amazon EC2 instance or Linux containers on Fargate.
     * </p>
     * 
     * @param cpuArchitecture
     *        The CPU architecture.</p>
     *        <p>
     *        You can run your Linux tasks on an ARM-based platform by setting the value to <code>ARM64</code>. This
     *        option is avaiable for tasks that run on Linux Amazon EC2 instance or Linux containers on Fargate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CPUArchitecture
     */

    public RuntimePlatform withCpuArchitecture(String cpuArchitecture) {
        setCpuArchitecture(cpuArchitecture);
        return this;
    }

    /**
     * <p>
     * The CPU architecture.
     * </p>
     * <p>
     * You can run your Linux tasks on an ARM-based platform by setting the value to <code>ARM64</code>. This option is
     * avaiable for tasks that run on Linux Amazon EC2 instance or Linux containers on Fargate.
     * </p>
     * 
     * @param cpuArchitecture
     *        The CPU architecture.</p>
     *        <p>
     *        You can run your Linux tasks on an ARM-based platform by setting the value to <code>ARM64</code>. This
     *        option is avaiable for tasks that run on Linux Amazon EC2 instance or Linux containers on Fargate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CPUArchitecture
     */

    public RuntimePlatform withCpuArchitecture(CPUArchitecture cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture.toString();
        return this;
    }

    /**
     * <p>
     * The operating system.
     * </p>
     * 
     * @param operatingSystemFamily
     *        The operating system.
     * @see OSFamily
     */

    public void setOperatingSystemFamily(String operatingSystemFamily) {
        this.operatingSystemFamily = operatingSystemFamily;
    }

    /**
     * <p>
     * The operating system.
     * </p>
     * 
     * @return The operating system.
     * @see OSFamily
     */

    public String getOperatingSystemFamily() {
        return this.operatingSystemFamily;
    }

    /**
     * <p>
     * The operating system.
     * </p>
     * 
     * @param operatingSystemFamily
     *        The operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OSFamily
     */

    public RuntimePlatform withOperatingSystemFamily(String operatingSystemFamily) {
        setOperatingSystemFamily(operatingSystemFamily);
        return this;
    }

    /**
     * <p>
     * The operating system.
     * </p>
     * 
     * @param operatingSystemFamily
     *        The operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OSFamily
     */

    public RuntimePlatform withOperatingSystemFamily(OSFamily operatingSystemFamily) {
        this.operatingSystemFamily = operatingSystemFamily.toString();
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
        if (getCpuArchitecture() != null)
            sb.append("CpuArchitecture: ").append(getCpuArchitecture()).append(",");
        if (getOperatingSystemFamily() != null)
            sb.append("OperatingSystemFamily: ").append(getOperatingSystemFamily());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuntimePlatform == false)
            return false;
        RuntimePlatform other = (RuntimePlatform) obj;
        if (other.getCpuArchitecture() == null ^ this.getCpuArchitecture() == null)
            return false;
        if (other.getCpuArchitecture() != null && other.getCpuArchitecture().equals(this.getCpuArchitecture()) == false)
            return false;
        if (other.getOperatingSystemFamily() == null ^ this.getOperatingSystemFamily() == null)
            return false;
        if (other.getOperatingSystemFamily() != null && other.getOperatingSystemFamily().equals(this.getOperatingSystemFamily()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuArchitecture() == null) ? 0 : getCpuArchitecture().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystemFamily() == null) ? 0 : getOperatingSystemFamily().hashCode());
        return hashCode;
    }

    @Override
    public RuntimePlatform clone() {
        try {
            return (RuntimePlatform) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.RuntimePlatformMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
