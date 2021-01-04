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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The type and amount of a resource to assign to a container. The supported resources include <code>GPU</code>,
 * <code>MEMORY</code>, and <code>VCPU</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ResourceRequirement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceRequirement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The quantity of the specified resource to reserve for the container. The values vary based on the
     * <code>type</code> specified.
     * </p>
     * <dl>
     * <dt>type="GPU"</dt>
     * <dd>
     * <p>
     * The number of physical GPUs to reserve for the container. The number of GPUs reserved for all containers in a job
     * shouldn't exceed the number of available GPUs on the compute resource that the job is launched on.
     * </p>
     * <note>
     * <p>
     * GPUs are not available for jobs running on Fargate resources.
     * </p>
     * </note></dd>
     * <dt>type="MEMORY"</dt>
     * <dd>
     * <p>
     * For jobs running on EC2 resources, the hard limit (in MiB) of memory to present to the container. If your
     * container attempts to exceed the memory specified here, the container is killed. This parameter maps to
     * <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must
     * specify at least 4 MiB of memory for a job. This is required but can be specified in several places for
     * multi-node parallel (MNP) jobs. It must be specified for each node at least once. This parameter maps to
     * <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you're trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * <p>
     * For jobs running on Fargate resources, then <code>value</code> is the hard limit (in MiB), and must match one of
     * the supported values and the <code>VCPU</code> values must be one of the values supported for that memory value.
     * </p>
     * <dl>
     * <dt>value = 512</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25
     * </p>
     * </dd>
     * <dt>value = 1024</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25 or 0.5
     * </p>
     * </dd>
     * <dt>value = 2048</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25, 0.5, or 1
     * </p>
     * </dd>
     * <dt>value = 3072</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.5, or 1
     * </p>
     * </dd>
     * <dt>value = 4096</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.5, 1, or 2
     * </p>
     * </dd>
     * <dt>value = 5120, 6144, or 7168</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 1 or 2
     * </p>
     * </dd>
     * <dt>value = 8192</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 1, 2, or 4
     * </p>
     * </dd>
     * <dt>value = 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 2 or 4
     * </p>
     * </dd>
     * <dt>value = 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 4
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * <dt>type="VCPU"</dt>
     * <dd>
     * <p>
     * The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. For EC2 resources, you must specify at least one vCPU. This is required but can be specified in several
     * places; it must be specified for each node at least once.
     * </p>
     * <p>
     * For jobs running on Fargate resources, then <code>value</code> must match one of the supported values and the
     * <code>MEMORY</code> values must be one of the values supported for that VCPU value. The supported values are
     * 0.25, 0.5, 1, 2, and 4
     * </p>
     * <dl>
     * <dt>value = 0.25</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 512, 1024, or 2048
     * </p>
     * </dd>
     * <dt>value = 0.5</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 1024, 2048, 3072, or 4096
     * </p>
     * </dd>
     * <dt>value = 1</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
     * </p>
     * </dd>
     * <dt>value = 2</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384
     * </p>
     * </dd>
     * <dt>value = 4</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384, 17408, 18432, 19456, 20480,
     * 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     */
    private String value;
    /**
     * <p>
     * The type of resource to assign to a container. The supported resources include <code>GPU</code>,
     * <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The quantity of the specified resource to reserve for the container. The values vary based on the
     * <code>type</code> specified.
     * </p>
     * <dl>
     * <dt>type="GPU"</dt>
     * <dd>
     * <p>
     * The number of physical GPUs to reserve for the container. The number of GPUs reserved for all containers in a job
     * shouldn't exceed the number of available GPUs on the compute resource that the job is launched on.
     * </p>
     * <note>
     * <p>
     * GPUs are not available for jobs running on Fargate resources.
     * </p>
     * </note></dd>
     * <dt>type="MEMORY"</dt>
     * <dd>
     * <p>
     * For jobs running on EC2 resources, the hard limit (in MiB) of memory to present to the container. If your
     * container attempts to exceed the memory specified here, the container is killed. This parameter maps to
     * <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must
     * specify at least 4 MiB of memory for a job. This is required but can be specified in several places for
     * multi-node parallel (MNP) jobs. It must be specified for each node at least once. This parameter maps to
     * <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you're trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * <p>
     * For jobs running on Fargate resources, then <code>value</code> is the hard limit (in MiB), and must match one of
     * the supported values and the <code>VCPU</code> values must be one of the values supported for that memory value.
     * </p>
     * <dl>
     * <dt>value = 512</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25
     * </p>
     * </dd>
     * <dt>value = 1024</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25 or 0.5
     * </p>
     * </dd>
     * <dt>value = 2048</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25, 0.5, or 1
     * </p>
     * </dd>
     * <dt>value = 3072</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.5, or 1
     * </p>
     * </dd>
     * <dt>value = 4096</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.5, 1, or 2
     * </p>
     * </dd>
     * <dt>value = 5120, 6144, or 7168</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 1 or 2
     * </p>
     * </dd>
     * <dt>value = 8192</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 1, 2, or 4
     * </p>
     * </dd>
     * <dt>value = 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 2 or 4
     * </p>
     * </dd>
     * <dt>value = 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 4
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * <dt>type="VCPU"</dt>
     * <dd>
     * <p>
     * The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. For EC2 resources, you must specify at least one vCPU. This is required but can be specified in several
     * places; it must be specified for each node at least once.
     * </p>
     * <p>
     * For jobs running on Fargate resources, then <code>value</code> must match one of the supported values and the
     * <code>MEMORY</code> values must be one of the values supported for that VCPU value. The supported values are
     * 0.25, 0.5, 1, 2, and 4
     * </p>
     * <dl>
     * <dt>value = 0.25</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 512, 1024, or 2048
     * </p>
     * </dd>
     * <dt>value = 0.5</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 1024, 2048, 3072, or 4096
     * </p>
     * </dd>
     * <dt>value = 1</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
     * </p>
     * </dd>
     * <dt>value = 2</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384
     * </p>
     * </dd>
     * <dt>value = 4</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384, 17408, 18432, 19456, 20480,
     * 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * 
     * @param value
     *        The quantity of the specified resource to reserve for the container. The values vary based on the
     *        <code>type</code> specified.</p>
     *        <dl>
     *        <dt>type="GPU"</dt>
     *        <dd>
     *        <p>
     *        The number of physical GPUs to reserve for the container. The number of GPUs reserved for all containers
     *        in a job shouldn't exceed the number of available GPUs on the compute resource that the job is launched
     *        on.
     *        </p>
     *        <note>
     *        <p>
     *        GPUs are not available for jobs running on Fargate resources.
     *        </p>
     *        </note></dd>
     *        <dt>type="MEMORY"</dt>
     *        <dd>
     *        <p>
     *        For jobs running on EC2 resources, the hard limit (in MiB) of memory to present to the container. If your
     *        container attempts to exceed the memory specified here, the container is killed. This parameter maps to
     *        <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     *        container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and
     *        the <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. You must specify at least 4 MiB of memory for a job. This is required but can be specified in
     *        several places for multi-node parallel (MNP) jobs. It must be specified for each node at least once. This
     *        parameter maps to <code>Memory</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--memory</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you're trying to maximize your resource utilization by providing your jobs as much memory as possible
     *        for a particular instance type, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in
     *        the <i>AWS Batch User Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        For jobs running on Fargate resources, then <code>value</code> is the hard limit (in MiB), and must match
     *        one of the supported values and the <code>VCPU</code> values must be one of the values supported for that
     *        memory value.
     *        </p>
     *        <dl>
     *        <dt>value = 512</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 0.25
     *        </p>
     *        </dd>
     *        <dt>value = 1024</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 0.25 or 0.5
     *        </p>
     *        </dd>
     *        <dt>value = 2048</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 0.25, 0.5, or 1
     *        </p>
     *        </dd>
     *        <dt>value = 3072</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 0.5, or 1
     *        </p>
     *        </dd>
     *        <dt>value = 4096</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 0.5, 1, or 2
     *        </p>
     *        </dd>
     *        <dt>value = 5120, 6144, or 7168</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 1 or 2
     *        </p>
     *        </dd>
     *        <dt>value = 8192</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 1, 2, or 4
     *        </p>
     *        </dd>
     *        <dt>value = 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 2 or 4
     *        </p>
     *        </dd>
     *        <dt>value = 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
     *        30720</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 4
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     *        <dt>type="VCPU"</dt>
     *        <dd>
     *        <p>
     *        The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. Each vCPU is equivalent to 1,024 CPU shares. For EC2 resources, you must specify at least one
     *        vCPU. This is required but can be specified in several places; it must be specified for each node at least
     *        once.
     *        </p>
     *        <p>
     *        For jobs running on Fargate resources, then <code>value</code> must match one of the supported values and
     *        the <code>MEMORY</code> values must be one of the values supported for that VCPU value. The supported
     *        values are 0.25, 0.5, 1, 2, and 4
     *        </p>
     *        <dl>
     *        <dt>value = 0.25</dt>
     *        <dd>
     *        <p>
     *        <code>MEMORY</code> = 512, 1024, or 2048
     *        </p>
     *        </dd>
     *        <dt>value = 0.5</dt>
     *        <dd>
     *        <p>
     *        <code>MEMORY</code> = 1024, 2048, 3072, or 4096
     *        </p>
     *        </dd>
     *        <dt>value = 1</dt>
     *        <dd>
     *        <p>
     *        <code>MEMORY</code> = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
     *        </p>
     *        </dd>
     *        <dt>value = 2</dt>
     *        <dd>
     *        <p>
     *        <code>MEMORY</code> = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, or
     *        16384
     *        </p>
     *        </dd>
     *        <dt>value = 4</dt>
     *        <dd>
     *        <p>
     *        <code>MEMORY</code> = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384, 17408, 18432, 19456,
     *        20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The quantity of the specified resource to reserve for the container. The values vary based on the
     * <code>type</code> specified.
     * </p>
     * <dl>
     * <dt>type="GPU"</dt>
     * <dd>
     * <p>
     * The number of physical GPUs to reserve for the container. The number of GPUs reserved for all containers in a job
     * shouldn't exceed the number of available GPUs on the compute resource that the job is launched on.
     * </p>
     * <note>
     * <p>
     * GPUs are not available for jobs running on Fargate resources.
     * </p>
     * </note></dd>
     * <dt>type="MEMORY"</dt>
     * <dd>
     * <p>
     * For jobs running on EC2 resources, the hard limit (in MiB) of memory to present to the container. If your
     * container attempts to exceed the memory specified here, the container is killed. This parameter maps to
     * <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must
     * specify at least 4 MiB of memory for a job. This is required but can be specified in several places for
     * multi-node parallel (MNP) jobs. It must be specified for each node at least once. This parameter maps to
     * <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you're trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * <p>
     * For jobs running on Fargate resources, then <code>value</code> is the hard limit (in MiB), and must match one of
     * the supported values and the <code>VCPU</code> values must be one of the values supported for that memory value.
     * </p>
     * <dl>
     * <dt>value = 512</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25
     * </p>
     * </dd>
     * <dt>value = 1024</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25 or 0.5
     * </p>
     * </dd>
     * <dt>value = 2048</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25, 0.5, or 1
     * </p>
     * </dd>
     * <dt>value = 3072</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.5, or 1
     * </p>
     * </dd>
     * <dt>value = 4096</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.5, 1, or 2
     * </p>
     * </dd>
     * <dt>value = 5120, 6144, or 7168</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 1 or 2
     * </p>
     * </dd>
     * <dt>value = 8192</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 1, 2, or 4
     * </p>
     * </dd>
     * <dt>value = 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 2 or 4
     * </p>
     * </dd>
     * <dt>value = 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 4
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * <dt>type="VCPU"</dt>
     * <dd>
     * <p>
     * The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. For EC2 resources, you must specify at least one vCPU. This is required but can be specified in several
     * places; it must be specified for each node at least once.
     * </p>
     * <p>
     * For jobs running on Fargate resources, then <code>value</code> must match one of the supported values and the
     * <code>MEMORY</code> values must be one of the values supported for that VCPU value. The supported values are
     * 0.25, 0.5, 1, 2, and 4
     * </p>
     * <dl>
     * <dt>value = 0.25</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 512, 1024, or 2048
     * </p>
     * </dd>
     * <dt>value = 0.5</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 1024, 2048, 3072, or 4096
     * </p>
     * </dd>
     * <dt>value = 1</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
     * </p>
     * </dd>
     * <dt>value = 2</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384
     * </p>
     * </dd>
     * <dt>value = 4</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384, 17408, 18432, 19456, 20480,
     * 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * 
     * @return The quantity of the specified resource to reserve for the container. The values vary based on the
     *         <code>type</code> specified.</p>
     *         <dl>
     *         <dt>type="GPU"</dt>
     *         <dd>
     *         <p>
     *         The number of physical GPUs to reserve for the container. The number of GPUs reserved for all containers
     *         in a job shouldn't exceed the number of available GPUs on the compute resource that the job is launched
     *         on.
     *         </p>
     *         <note>
     *         <p>
     *         GPUs are not available for jobs running on Fargate resources.
     *         </p>
     *         </note></dd>
     *         <dt>type="MEMORY"</dt>
     *         <dd>
     *         <p>
     *         For jobs running on EC2 resources, the hard limit (in MiB) of memory to present to the container. If your
     *         container attempts to exceed the memory specified here, the container is killed. This parameter maps to
     *         <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create
     *         a container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a>
     *         and the <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>. You must specify at least 4 MiB of memory for a job. This is required but can be specified in
     *         several places for multi-node parallel (MNP) jobs. It must be specified for each node at least once. This
     *         parameter maps to <code>Memory</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--memory</code>
     *         option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you're trying to maximize your resource utilization by providing your jobs as much memory as possible
     *         for a particular instance type, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in
     *         the <i>AWS Batch User Guide</i>.
     *         </p>
     *         </note>
     *         <p>
     *         For jobs running on Fargate resources, then <code>value</code> is the hard limit (in MiB), and must match
     *         one of the supported values and the <code>VCPU</code> values must be one of the values supported for that
     *         memory value.
     *         </p>
     *         <dl>
     *         <dt>value = 512</dt>
     *         <dd>
     *         <p>
     *         <code>VCPU</code> = 0.25
     *         </p>
     *         </dd>
     *         <dt>value = 1024</dt>
     *         <dd>
     *         <p>
     *         <code>VCPU</code> = 0.25 or 0.5
     *         </p>
     *         </dd>
     *         <dt>value = 2048</dt>
     *         <dd>
     *         <p>
     *         <code>VCPU</code> = 0.25, 0.5, or 1
     *         </p>
     *         </dd>
     *         <dt>value = 3072</dt>
     *         <dd>
     *         <p>
     *         <code>VCPU</code> = 0.5, or 1
     *         </p>
     *         </dd>
     *         <dt>value = 4096</dt>
     *         <dd>
     *         <p>
     *         <code>VCPU</code> = 0.5, 1, or 2
     *         </p>
     *         </dd>
     *         <dt>value = 5120, 6144, or 7168</dt>
     *         <dd>
     *         <p>
     *         <code>VCPU</code> = 1 or 2
     *         </p>
     *         </dd>
     *         <dt>value = 8192</dt>
     *         <dd>
     *         <p>
     *         <code>VCPU</code> = 1, 2, or 4
     *         </p>
     *         </dd>
     *         <dt>value = 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384</dt>
     *         <dd>
     *         <p>
     *         <code>VCPU</code> = 2 or 4
     *         </p>
     *         </dd>
     *         <dt>value = 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
     *         30720</dt>
     *         <dd>
     *         <p>
     *         <code>VCPU</code> = 4
     *         </p>
     *         </dd>
     *         </dl>
     *         </dd>
     *         <dt>type="VCPU"</dt>
     *         <dd>
     *         <p>
     *         The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>. Each vCPU is equivalent to 1,024 CPU shares. For EC2 resources, you must specify at least one
     *         vCPU. This is required but can be specified in several places; it must be specified for each node at
     *         least once.
     *         </p>
     *         <p>
     *         For jobs running on Fargate resources, then <code>value</code> must match one of the supported values and
     *         the <code>MEMORY</code> values must be one of the values supported for that VCPU value. The supported
     *         values are 0.25, 0.5, 1, 2, and 4
     *         </p>
     *         <dl>
     *         <dt>value = 0.25</dt>
     *         <dd>
     *         <p>
     *         <code>MEMORY</code> = 512, 1024, or 2048
     *         </p>
     *         </dd>
     *         <dt>value = 0.5</dt>
     *         <dd>
     *         <p>
     *         <code>MEMORY</code> = 1024, 2048, 3072, or 4096
     *         </p>
     *         </dd>
     *         <dt>value = 1</dt>
     *         <dd>
     *         <p>
     *         <code>MEMORY</code> = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
     *         </p>
     *         </dd>
     *         <dt>value = 2</dt>
     *         <dd>
     *         <p>
     *         <code>MEMORY</code> = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, or
     *         16384
     *         </p>
     *         </dd>
     *         <dt>value = 4</dt>
     *         <dd>
     *         <p>
     *         <code>MEMORY</code> = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384, 17408, 18432, 19456,
     *         20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720
     *         </p>
     *         </dd>
     *         </dl>
     *         </dd>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The quantity of the specified resource to reserve for the container. The values vary based on the
     * <code>type</code> specified.
     * </p>
     * <dl>
     * <dt>type="GPU"</dt>
     * <dd>
     * <p>
     * The number of physical GPUs to reserve for the container. The number of GPUs reserved for all containers in a job
     * shouldn't exceed the number of available GPUs on the compute resource that the job is launched on.
     * </p>
     * <note>
     * <p>
     * GPUs are not available for jobs running on Fargate resources.
     * </p>
     * </note></dd>
     * <dt>type="MEMORY"</dt>
     * <dd>
     * <p>
     * For jobs running on EC2 resources, the hard limit (in MiB) of memory to present to the container. If your
     * container attempts to exceed the memory specified here, the container is killed. This parameter maps to
     * <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must
     * specify at least 4 MiB of memory for a job. This is required but can be specified in several places for
     * multi-node parallel (MNP) jobs. It must be specified for each node at least once. This parameter maps to
     * <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you're trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * <p>
     * For jobs running on Fargate resources, then <code>value</code> is the hard limit (in MiB), and must match one of
     * the supported values and the <code>VCPU</code> values must be one of the values supported for that memory value.
     * </p>
     * <dl>
     * <dt>value = 512</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25
     * </p>
     * </dd>
     * <dt>value = 1024</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25 or 0.5
     * </p>
     * </dd>
     * <dt>value = 2048</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.25, 0.5, or 1
     * </p>
     * </dd>
     * <dt>value = 3072</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.5, or 1
     * </p>
     * </dd>
     * <dt>value = 4096</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 0.5, 1, or 2
     * </p>
     * </dd>
     * <dt>value = 5120, 6144, or 7168</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 1 or 2
     * </p>
     * </dd>
     * <dt>value = 8192</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 1, 2, or 4
     * </p>
     * </dd>
     * <dt>value = 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 2 or 4
     * </p>
     * </dd>
     * <dt>value = 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720</dt>
     * <dd>
     * <p>
     * <code>VCPU</code> = 4
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * <dt>type="VCPU"</dt>
     * <dd>
     * <p>
     * The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. For EC2 resources, you must specify at least one vCPU. This is required but can be specified in several
     * places; it must be specified for each node at least once.
     * </p>
     * <p>
     * For jobs running on Fargate resources, then <code>value</code> must match one of the supported values and the
     * <code>MEMORY</code> values must be one of the values supported for that VCPU value. The supported values are
     * 0.25, 0.5, 1, 2, and 4
     * </p>
     * <dl>
     * <dt>value = 0.25</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 512, 1024, or 2048
     * </p>
     * </dd>
     * <dt>value = 0.5</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 1024, 2048, 3072, or 4096
     * </p>
     * </dd>
     * <dt>value = 1</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
     * </p>
     * </dd>
     * <dt>value = 2</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384
     * </p>
     * </dd>
     * <dt>value = 4</dt>
     * <dd>
     * <p>
     * <code>MEMORY</code> = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384, 17408, 18432, 19456, 20480,
     * 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * 
     * @param value
     *        The quantity of the specified resource to reserve for the container. The values vary based on the
     *        <code>type</code> specified.</p>
     *        <dl>
     *        <dt>type="GPU"</dt>
     *        <dd>
     *        <p>
     *        The number of physical GPUs to reserve for the container. The number of GPUs reserved for all containers
     *        in a job shouldn't exceed the number of available GPUs on the compute resource that the job is launched
     *        on.
     *        </p>
     *        <note>
     *        <p>
     *        GPUs are not available for jobs running on Fargate resources.
     *        </p>
     *        </note></dd>
     *        <dt>type="MEMORY"</dt>
     *        <dd>
     *        <p>
     *        For jobs running on EC2 resources, the hard limit (in MiB) of memory to present to the container. If your
     *        container attempts to exceed the memory specified here, the container is killed. This parameter maps to
     *        <code>Memory</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     *        container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and
     *        the <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. You must specify at least 4 MiB of memory for a job. This is required but can be specified in
     *        several places for multi-node parallel (MNP) jobs. It must be specified for each node at least once. This
     *        parameter maps to <code>Memory</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--memory</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you're trying to maximize your resource utilization by providing your jobs as much memory as possible
     *        for a particular instance type, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in
     *        the <i>AWS Batch User Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        For jobs running on Fargate resources, then <code>value</code> is the hard limit (in MiB), and must match
     *        one of the supported values and the <code>VCPU</code> values must be one of the values supported for that
     *        memory value.
     *        </p>
     *        <dl>
     *        <dt>value = 512</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 0.25
     *        </p>
     *        </dd>
     *        <dt>value = 1024</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 0.25 or 0.5
     *        </p>
     *        </dd>
     *        <dt>value = 2048</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 0.25, 0.5, or 1
     *        </p>
     *        </dd>
     *        <dt>value = 3072</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 0.5, or 1
     *        </p>
     *        </dd>
     *        <dt>value = 4096</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 0.5, 1, or 2
     *        </p>
     *        </dd>
     *        <dt>value = 5120, 6144, or 7168</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 1 or 2
     *        </p>
     *        </dd>
     *        <dt>value = 8192</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 1, 2, or 4
     *        </p>
     *        </dd>
     *        <dt>value = 9216, 10240, 11264, 12288, 13312, 14336, 15360, or 16384</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 2 or 4
     *        </p>
     *        </dd>
     *        <dt>value = 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
     *        30720</dt>
     *        <dd>
     *        <p>
     *        <code>VCPU</code> = 4
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     *        <dt>type="VCPU"</dt>
     *        <dd>
     *        <p>
     *        The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. Each vCPU is equivalent to 1,024 CPU shares. For EC2 resources, you must specify at least one
     *        vCPU. This is required but can be specified in several places; it must be specified for each node at least
     *        once.
     *        </p>
     *        <p>
     *        For jobs running on Fargate resources, then <code>value</code> must match one of the supported values and
     *        the <code>MEMORY</code> values must be one of the values supported for that VCPU value. The supported
     *        values are 0.25, 0.5, 1, 2, and 4
     *        </p>
     *        <dl>
     *        <dt>value = 0.25</dt>
     *        <dd>
     *        <p>
     *        <code>MEMORY</code> = 512, 1024, or 2048
     *        </p>
     *        </dd>
     *        <dt>value = 0.5</dt>
     *        <dd>
     *        <p>
     *        <code>MEMORY</code> = 1024, 2048, 3072, or 4096
     *        </p>
     *        </dd>
     *        <dt>value = 1</dt>
     *        <dd>
     *        <p>
     *        <code>MEMORY</code> = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
     *        </p>
     *        </dd>
     *        <dt>value = 2</dt>
     *        <dd>
     *        <p>
     *        <code>MEMORY</code> = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, or
     *        16384
     *        </p>
     *        </dd>
     *        <dt>value = 4</dt>
     *        <dd>
     *        <p>
     *        <code>MEMORY</code> = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384, 17408, 18432, 19456,
     *        20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or 30720
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRequirement withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The supported resources include <code>GPU</code>,
     * <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @param type
     *        The type of resource to assign to a container. The supported resources include <code>GPU</code>,
     *        <code>MEMORY</code>, and <code>VCPU</code>.
     * @see ResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The supported resources include <code>GPU</code>,
     * <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @return The type of resource to assign to a container. The supported resources include <code>GPU</code>,
     *         <code>MEMORY</code>, and <code>VCPU</code>.
     * @see ResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The supported resources include <code>GPU</code>,
     * <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @param type
     *        The type of resource to assign to a container. The supported resources include <code>GPU</code>,
     *        <code>MEMORY</code>, and <code>VCPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceRequirement withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The supported resources include <code>GPU</code>,
     * <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @param type
     *        The type of resource to assign to a container. The supported resources include <code>GPU</code>,
     *        <code>MEMORY</code>, and <code>VCPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceRequirement withType(ResourceType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceRequirement == false)
            return false;
        ResourceRequirement other = (ResourceRequirement) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ResourceRequirement clone() {
        try {
            return (ResourceRequirement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ResourceRequirementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
