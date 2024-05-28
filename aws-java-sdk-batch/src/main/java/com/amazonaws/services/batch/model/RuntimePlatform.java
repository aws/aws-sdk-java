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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the compute environment architecture for Batch jobs on Fargate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/RuntimePlatform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimePlatform implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operating system for the compute environment. Valid values are: <code>LINUX</code> (default),
     * <code>WINDOWS_SERVER_2019_CORE</code>, <code>WINDOWS_SERVER_2019_FULL</code>,
     * <code>WINDOWS_SERVER_2022_CORE</code>, and <code>WINDOWS_SERVER_2022_FULL</code>.
     * </p>
     * <note>
     * <p>
     * The following parameters can’t be set for Windows containers: <code>linuxParameters</code>,
     * <code>privileged</code>, <code>user</code>, <code>ulimits</code>, <code>readonlyRootFilesystem</code>, and
     * <code>efsVolumeConfiguration</code>.
     * </p>
     * </note> <note>
     * <p>
     * The Batch Scheduler checks the compute environments that are attached to the job queue before registering a task
     * definition with Fargate. In this scenario, the job queue is where the job is submitted. If the job requires a
     * Windows container and the first compute environment is <code>LINUX</code>, the compute environment is skipped and
     * the next compute environment is checked until a Windows-based compute environment is found.
     * </p>
     * </note> <note>
     * <p>
     * Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue will be
     * blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both <code>FARGATE</code> and <code>FARGATE_SPOT</code> compute
     * environments to the same job queue.
     * </p>
     * </note>
     */
    private String operatingSystemFamily;
    /**
     * <p>
     * The vCPU architecture. The default value is <code>X86_64</code>. Valid values are <code>X86_64</code> and
     * <code>ARM64</code>.
     * </p>
     * <note>
     * <p>
     * This parameter must be set to <code>X86_64</code> for Windows containers.
     * </p>
     * </note> <note>
     * <p>
     * Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue will be
     * blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both <code>FARGATE</code> and <code>FARGATE_SPOT</code> compute
     * environments to the same job queue.
     * </p>
     * </note>
     */
    private String cpuArchitecture;

    /**
     * <p>
     * The operating system for the compute environment. Valid values are: <code>LINUX</code> (default),
     * <code>WINDOWS_SERVER_2019_CORE</code>, <code>WINDOWS_SERVER_2019_FULL</code>,
     * <code>WINDOWS_SERVER_2022_CORE</code>, and <code>WINDOWS_SERVER_2022_FULL</code>.
     * </p>
     * <note>
     * <p>
     * The following parameters can’t be set for Windows containers: <code>linuxParameters</code>,
     * <code>privileged</code>, <code>user</code>, <code>ulimits</code>, <code>readonlyRootFilesystem</code>, and
     * <code>efsVolumeConfiguration</code>.
     * </p>
     * </note> <note>
     * <p>
     * The Batch Scheduler checks the compute environments that are attached to the job queue before registering a task
     * definition with Fargate. In this scenario, the job queue is where the job is submitted. If the job requires a
     * Windows container and the first compute environment is <code>LINUX</code>, the compute environment is skipped and
     * the next compute environment is checked until a Windows-based compute environment is found.
     * </p>
     * </note> <note>
     * <p>
     * Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue will be
     * blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both <code>FARGATE</code> and <code>FARGATE_SPOT</code> compute
     * environments to the same job queue.
     * </p>
     * </note>
     * 
     * @param operatingSystemFamily
     *        The operating system for the compute environment. Valid values are: <code>LINUX</code> (default),
     *        <code>WINDOWS_SERVER_2019_CORE</code>, <code>WINDOWS_SERVER_2019_FULL</code>,
     *        <code>WINDOWS_SERVER_2022_CORE</code>, and <code>WINDOWS_SERVER_2022_FULL</code>.</p> <note>
     *        <p>
     *        The following parameters can’t be set for Windows containers: <code>linuxParameters</code>,
     *        <code>privileged</code>, <code>user</code>, <code>ulimits</code>, <code>readonlyRootFilesystem</code>, and
     *        <code>efsVolumeConfiguration</code>.
     *        </p>
     *        </note> <note>
     *        <p>
     *        The Batch Scheduler checks the compute environments that are attached to the job queue before registering
     *        a task definition with Fargate. In this scenario, the job queue is where the job is submitted. If the job
     *        requires a Windows container and the first compute environment is <code>LINUX</code>, the compute
     *        environment is skipped and the next compute environment is checked until a Windows-based compute
     *        environment is found.
     *        </p>
     *        </note> <note>
     *        <p>
     *        Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue
     *        will be blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only
     *        Fargate Spot compute environments. However, you can attach both <code>FARGATE</code> and
     *        <code>FARGATE_SPOT</code> compute environments to the same job queue.
     *        </p>
     */

    public void setOperatingSystemFamily(String operatingSystemFamily) {
        this.operatingSystemFamily = operatingSystemFamily;
    }

    /**
     * <p>
     * The operating system for the compute environment. Valid values are: <code>LINUX</code> (default),
     * <code>WINDOWS_SERVER_2019_CORE</code>, <code>WINDOWS_SERVER_2019_FULL</code>,
     * <code>WINDOWS_SERVER_2022_CORE</code>, and <code>WINDOWS_SERVER_2022_FULL</code>.
     * </p>
     * <note>
     * <p>
     * The following parameters can’t be set for Windows containers: <code>linuxParameters</code>,
     * <code>privileged</code>, <code>user</code>, <code>ulimits</code>, <code>readonlyRootFilesystem</code>, and
     * <code>efsVolumeConfiguration</code>.
     * </p>
     * </note> <note>
     * <p>
     * The Batch Scheduler checks the compute environments that are attached to the job queue before registering a task
     * definition with Fargate. In this scenario, the job queue is where the job is submitted. If the job requires a
     * Windows container and the first compute environment is <code>LINUX</code>, the compute environment is skipped and
     * the next compute environment is checked until a Windows-based compute environment is found.
     * </p>
     * </note> <note>
     * <p>
     * Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue will be
     * blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both <code>FARGATE</code> and <code>FARGATE_SPOT</code> compute
     * environments to the same job queue.
     * </p>
     * </note>
     * 
     * @return The operating system for the compute environment. Valid values are: <code>LINUX</code> (default),
     *         <code>WINDOWS_SERVER_2019_CORE</code>, <code>WINDOWS_SERVER_2019_FULL</code>,
     *         <code>WINDOWS_SERVER_2022_CORE</code>, and <code>WINDOWS_SERVER_2022_FULL</code>.</p> <note>
     *         <p>
     *         The following parameters can’t be set for Windows containers: <code>linuxParameters</code>,
     *         <code>privileged</code>, <code>user</code>, <code>ulimits</code>, <code>readonlyRootFilesystem</code>,
     *         and <code>efsVolumeConfiguration</code>.
     *         </p>
     *         </note> <note>
     *         <p>
     *         The Batch Scheduler checks the compute environments that are attached to the job queue before registering
     *         a task definition with Fargate. In this scenario, the job queue is where the job is submitted. If the job
     *         requires a Windows container and the first compute environment is <code>LINUX</code>, the compute
     *         environment is skipped and the next compute environment is checked until a Windows-based compute
     *         environment is found.
     *         </p>
     *         </note> <note>
     *         <p>
     *         Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue
     *         will be blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only
     *         Fargate Spot compute environments. However, you can attach both <code>FARGATE</code> and
     *         <code>FARGATE_SPOT</code> compute environments to the same job queue.
     *         </p>
     */

    public String getOperatingSystemFamily() {
        return this.operatingSystemFamily;
    }

    /**
     * <p>
     * The operating system for the compute environment. Valid values are: <code>LINUX</code> (default),
     * <code>WINDOWS_SERVER_2019_CORE</code>, <code>WINDOWS_SERVER_2019_FULL</code>,
     * <code>WINDOWS_SERVER_2022_CORE</code>, and <code>WINDOWS_SERVER_2022_FULL</code>.
     * </p>
     * <note>
     * <p>
     * The following parameters can’t be set for Windows containers: <code>linuxParameters</code>,
     * <code>privileged</code>, <code>user</code>, <code>ulimits</code>, <code>readonlyRootFilesystem</code>, and
     * <code>efsVolumeConfiguration</code>.
     * </p>
     * </note> <note>
     * <p>
     * The Batch Scheduler checks the compute environments that are attached to the job queue before registering a task
     * definition with Fargate. In this scenario, the job queue is where the job is submitted. If the job requires a
     * Windows container and the first compute environment is <code>LINUX</code>, the compute environment is skipped and
     * the next compute environment is checked until a Windows-based compute environment is found.
     * </p>
     * </note> <note>
     * <p>
     * Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue will be
     * blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both <code>FARGATE</code> and <code>FARGATE_SPOT</code> compute
     * environments to the same job queue.
     * </p>
     * </note>
     * 
     * @param operatingSystemFamily
     *        The operating system for the compute environment. Valid values are: <code>LINUX</code> (default),
     *        <code>WINDOWS_SERVER_2019_CORE</code>, <code>WINDOWS_SERVER_2019_FULL</code>,
     *        <code>WINDOWS_SERVER_2022_CORE</code>, and <code>WINDOWS_SERVER_2022_FULL</code>.</p> <note>
     *        <p>
     *        The following parameters can’t be set for Windows containers: <code>linuxParameters</code>,
     *        <code>privileged</code>, <code>user</code>, <code>ulimits</code>, <code>readonlyRootFilesystem</code>, and
     *        <code>efsVolumeConfiguration</code>.
     *        </p>
     *        </note> <note>
     *        <p>
     *        The Batch Scheduler checks the compute environments that are attached to the job queue before registering
     *        a task definition with Fargate. In this scenario, the job queue is where the job is submitted. If the job
     *        requires a Windows container and the first compute environment is <code>LINUX</code>, the compute
     *        environment is skipped and the next compute environment is checked until a Windows-based compute
     *        environment is found.
     *        </p>
     *        </note> <note>
     *        <p>
     *        Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue
     *        will be blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only
     *        Fargate Spot compute environments. However, you can attach both <code>FARGATE</code> and
     *        <code>FARGATE_SPOT</code> compute environments to the same job queue.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimePlatform withOperatingSystemFamily(String operatingSystemFamily) {
        setOperatingSystemFamily(operatingSystemFamily);
        return this;
    }

    /**
     * <p>
     * The vCPU architecture. The default value is <code>X86_64</code>. Valid values are <code>X86_64</code> and
     * <code>ARM64</code>.
     * </p>
     * <note>
     * <p>
     * This parameter must be set to <code>X86_64</code> for Windows containers.
     * </p>
     * </note> <note>
     * <p>
     * Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue will be
     * blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both <code>FARGATE</code> and <code>FARGATE_SPOT</code> compute
     * environments to the same job queue.
     * </p>
     * </note>
     * 
     * @param cpuArchitecture
     *        The vCPU architecture. The default value is <code>X86_64</code>. Valid values are <code>X86_64</code> and
     *        <code>ARM64</code>.</p> <note>
     *        <p>
     *        This parameter must be set to <code>X86_64</code> for Windows containers.
     *        </p>
     *        </note> <note>
     *        <p>
     *        Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue
     *        will be blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only
     *        Fargate Spot compute environments. However, you can attach both <code>FARGATE</code> and
     *        <code>FARGATE_SPOT</code> compute environments to the same job queue.
     *        </p>
     */

    public void setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
    }

    /**
     * <p>
     * The vCPU architecture. The default value is <code>X86_64</code>. Valid values are <code>X86_64</code> and
     * <code>ARM64</code>.
     * </p>
     * <note>
     * <p>
     * This parameter must be set to <code>X86_64</code> for Windows containers.
     * </p>
     * </note> <note>
     * <p>
     * Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue will be
     * blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both <code>FARGATE</code> and <code>FARGATE_SPOT</code> compute
     * environments to the same job queue.
     * </p>
     * </note>
     * 
     * @return The vCPU architecture. The default value is <code>X86_64</code>. Valid values are <code>X86_64</code> and
     *         <code>ARM64</code>.</p> <note>
     *         <p>
     *         This parameter must be set to <code>X86_64</code> for Windows containers.
     *         </p>
     *         </note> <note>
     *         <p>
     *         Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue
     *         will be blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only
     *         Fargate Spot compute environments. However, you can attach both <code>FARGATE</code> and
     *         <code>FARGATE_SPOT</code> compute environments to the same job queue.
     *         </p>
     */

    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    /**
     * <p>
     * The vCPU architecture. The default value is <code>X86_64</code>. Valid values are <code>X86_64</code> and
     * <code>ARM64</code>.
     * </p>
     * <note>
     * <p>
     * This parameter must be set to <code>X86_64</code> for Windows containers.
     * </p>
     * </note> <note>
     * <p>
     * Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue will be
     * blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both <code>FARGATE</code> and <code>FARGATE_SPOT</code> compute
     * environments to the same job queue.
     * </p>
     * </note>
     * 
     * @param cpuArchitecture
     *        The vCPU architecture. The default value is <code>X86_64</code>. Valid values are <code>X86_64</code> and
     *        <code>ARM64</code>.</p> <note>
     *        <p>
     *        This parameter must be set to <code>X86_64</code> for Windows containers.
     *        </p>
     *        </note> <note>
     *        <p>
     *        Fargate Spot is not supported for <code>ARM64</code> and Windows-based containers on Fargate. A job queue
     *        will be blocked if a Fargate <code>ARM64</code> or Windows job is submitted to a job queue with only
     *        Fargate Spot compute environments. However, you can attach both <code>FARGATE</code> and
     *        <code>FARGATE_SPOT</code> compute environments to the same job queue.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimePlatform withCpuArchitecture(String cpuArchitecture) {
        setCpuArchitecture(cpuArchitecture);
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
        if (getOperatingSystemFamily() != null)
            sb.append("OperatingSystemFamily: ").append(getOperatingSystemFamily()).append(",");
        if (getCpuArchitecture() != null)
            sb.append("CpuArchitecture: ").append(getCpuArchitecture());
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
        if (other.getOperatingSystemFamily() == null ^ this.getOperatingSystemFamily() == null)
            return false;
        if (other.getOperatingSystemFamily() != null && other.getOperatingSystemFamily().equals(this.getOperatingSystemFamily()) == false)
            return false;
        if (other.getCpuArchitecture() == null ^ this.getCpuArchitecture() == null)
            return false;
        if (other.getCpuArchitecture() != null && other.getCpuArchitecture().equals(this.getCpuArchitecture()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperatingSystemFamily() == null) ? 0 : getOperatingSystemFamily().hashCode());
        hashCode = prime * hashCode + ((getCpuArchitecture() == null) ? 0 : getCpuArchitecture().hashCode());
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
        com.amazonaws.services.batch.model.transform.RuntimePlatformMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
