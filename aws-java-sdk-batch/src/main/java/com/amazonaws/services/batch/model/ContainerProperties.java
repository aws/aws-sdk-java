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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container properties are used in job definitions to describe the container that is launched as part of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ContainerProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker
     * Hub registry are available by default. Other repositories are specified with
     * <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code>. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter
     * maps to <code>Image</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>IMAGE</code> parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Images in Amazon ECR repositories use the full registry and repository URI (for example,
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     * <code>mongo</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other repositories on Docker Hub are qualified with an organization name (for example,
     * <code>amazon/amazon-ecs-agent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other online repositories are qualified further by a domain name (for example,
     * <code>quay.io/assemblyline/ubuntu</code>).
     * </p>
     * </li>
     * </ul>
     */
    private String image;
    /**
     * <p>
     * The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU.
     * </p>
     */
    private Integer vcpus;
    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory
     * specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--memory</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must specify at least 4 MiB of memory
     * for a job.
     * </p>
     * <note>
     * <p>
     * If you are trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     */
    private Integer memory;
    /**
     * <p>
     * The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code> parameter to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd"
     * >https://docs.docker.com/engine/reference/builder/#cmd</a>.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
     * </p>
     */
    private String jobRoleArn;
    /**
     * <p>
     * A list of data volumes used in a job.
     * </p>
     */
    private java.util.List<Volume> volumes;
    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We do not recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important> <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     */
    private java.util.List<KeyValuePair> environment;
    /**
     * <p>
     * The mount points for data volumes in your container. This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--volume</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private java.util.List<MountPoint> mountPoints;
    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code> option to
     * <code>docker run</code>.
     * </p>
     */
    private Boolean readonlyRootFilesystem;
    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--privileged</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private Boolean privileged;
    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private java.util.List<Ulimit> ulimits;
    /**
     * <p>
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private String user;
    /**
     * <p>
     * The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node parallel job
     * must use the same instance type. This parameter is not valid for single-node container jobs.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The type and amount of a resource to assign to a container. Currently, the only supported resource is
     * <code>GPU</code>.
     * </p>
     */
    private java.util.List<ResourceRequirement> resourceRequirements;

    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker
     * Hub registry are available by default. Other repositories are specified with
     * <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code>. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter
     * maps to <code>Image</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>IMAGE</code> parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Images in Amazon ECR repositories use the full registry and repository URI (for example,
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     * <code>mongo</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other repositories on Docker Hub are qualified with an organization name (for example,
     * <code>amazon/amazon-ecs-agent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other online repositories are qualified further by a domain name (for example,
     * <code>quay.io/assemblyline/ubuntu</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param image
     *        The image used to start a container. This string is passed directly to the Docker daemon. Images in the
     *        Docker Hub registry are available by default. Other repositories are specified with
     *        <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code>. Up to 255 letters (uppercase and lowercase),
     *        numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This
     *        parameter maps to <code>Image</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>IMAGE</code>
     *        parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Images in Amazon ECR repositories use the full registry and repository URI (for example,
     *        <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     *        <code>mongo</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in other repositories on Docker Hub are qualified with an organization name (for example,
     *        <code>amazon/amazon-ecs-agent</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in other online repositories are qualified further by a domain name (for example,
     *        <code>quay.io/assemblyline/ubuntu</code>).
     *        </p>
     *        </li>
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker
     * Hub registry are available by default. Other repositories are specified with
     * <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code>. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter
     * maps to <code>Image</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>IMAGE</code> parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Images in Amazon ECR repositories use the full registry and repository URI (for example,
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     * <code>mongo</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other repositories on Docker Hub are qualified with an organization name (for example,
     * <code>amazon/amazon-ecs-agent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other online repositories are qualified further by a domain name (for example,
     * <code>quay.io/assemblyline/ubuntu</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The image used to start a container. This string is passed directly to the Docker daemon. Images in the
     *         Docker Hub registry are available by default. Other repositories are specified with
     *         <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code>. Up to 255 letters (uppercase and
     *         lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are
     *         allowed. This parameter maps to <code>Image</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>IMAGE</code>
     *         parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Images in Amazon ECR repositories use the full registry and repository URI (for example,
     *         <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     *         <code>mongo</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Images in other repositories on Docker Hub are qualified with an organization name (for example,
     *         <code>amazon/amazon-ecs-agent</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Images in other online repositories are qualified further by a domain name (for example,
     *         <code>quay.io/assemblyline/ubuntu</code>).
     *         </p>
     *         </li>
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker
     * Hub registry are available by default. Other repositories are specified with
     * <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code>. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter
     * maps to <code>Image</code> in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     * <code>IMAGE</code> parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Images in Amazon ECR repositories use the full registry and repository URI (for example,
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     * <code>mongo</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other repositories on Docker Hub are qualified with an organization name (for example,
     * <code>amazon/amazon-ecs-agent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other online repositories are qualified further by a domain name (for example,
     * <code>quay.io/assemblyline/ubuntu</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param image
     *        The image used to start a container. This string is passed directly to the Docker daemon. Images in the
     *        Docker Hub registry are available by default. Other repositories are specified with
     *        <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code>. Up to 255 letters (uppercase and lowercase),
     *        numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This
     *        parameter maps to <code>Image</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>IMAGE</code>
     *        parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Images in Amazon ECR repositories use the full registry and repository URI (for example,
     *        <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     *        <code>mongo</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in other repositories on Docker Hub are qualified with an organization name (for example,
     *        <code>amazon/amazon-ecs-agent</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in other online repositories are qualified further by a domain name (for example,
     *        <code>quay.io/assemblyline/ubuntu</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU.
     * </p>
     * 
     * @param vcpus
     *        The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU.
     */

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    /**
     * <p>
     * The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU.
     * </p>
     * 
     * @return The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU.
     */

    public Integer getVcpus() {
        return this.vcpus;
    }

    /**
     * <p>
     * The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU.
     * </p>
     * 
     * @param vcpus
     *        The number of vCPUs reserved for the container. This parameter maps to <code>CpuShares</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withVcpus(Integer vcpus) {
        setVcpus(vcpus);
        return this;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory
     * specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--memory</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must specify at least 4 MiB of memory
     * for a job.
     * </p>
     * <note>
     * <p>
     * If you are trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @param memory
     *        The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the
     *        memory specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--memory</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must specify at
     *        least 4 MiB of memory for a job.</p> <note>
     *        <p>
     *        If you are trying to maximize your resource utilization by providing your jobs as much memory as possible
     *        for a particular instance type, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in
     *        the <i>AWS Batch User Guide</i>.
     *        </p>
     */

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory
     * specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--memory</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must specify at least 4 MiB of memory
     * for a job.
     * </p>
     * <note>
     * <p>
     * If you are trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the
     *         memory specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--memory</code>
     *         option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must specify at
     *         least 4 MiB of memory for a job.</p> <note>
     *         <p>
     *         If you are trying to maximize your resource utilization by providing your jobs as much memory as possible
     *         for a particular instance type, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in
     *         the <i>AWS Batch User Guide</i>.
     *         </p>
     */

    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory
     * specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--memory</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must specify at least 4 MiB of memory
     * for a job.
     * </p>
     * <note>
     * <p>
     * If you are trying to maximize your resource utilization by providing your jobs as much memory as possible for a
     * particular instance type, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @param memory
     *        The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the
     *        memory specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--memory</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. You must specify at
     *        least 4 MiB of memory for a job.</p> <note>
     *        <p>
     *        If you are trying to maximize your resource utilization by providing your jobs as much memory as possible
     *        for a particular instance type, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html">Memory Management</a> in
     *        the <i>AWS Batch User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code> parameter to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd"
     * >https://docs.docker.com/engine/reference/builder/#cmd</a>.
     * </p>
     * 
     * @return The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code>
     *         parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more
     *         information, see <a
     *         href="https://docs.docker.com/engine/reference/builder/#cmd">https://docs.docker.com/engine
     *         /reference/builder/#cmd</a>.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code> parameter to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd"
     * >https://docs.docker.com/engine/reference/builder/#cmd</a>.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code>
     *        parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information,
     *        see <a
     *        href="https://docs.docker.com/engine/reference/builder/#cmd">https://docs.docker.com/engine/reference
     *        /builder/#cmd</a>.
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
     * The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code> parameter to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd"
     * >https://docs.docker.com/engine/reference/builder/#cmd</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code>
     *        parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information,
     *        see <a
     *        href="https://docs.docker.com/engine/reference/builder/#cmd">https://docs.docker.com/engine/reference
     *        /builder/#cmd</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withCommand(String... command) {
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
     * The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code> parameter to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd"
     * >https://docs.docker.com/engine/reference/builder/#cmd</a>.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code>
     *        parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information,
     *        see <a
     *        href="https://docs.docker.com/engine/reference/builder/#cmd">https://docs.docker.com/engine/reference
     *        /builder/#cmd</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
     * </p>
     * 
     * @param jobRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
     */

    public void setJobRoleArn(String jobRoleArn) {
        this.jobRoleArn = jobRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
     */

    public String getJobRoleArn() {
        return this.jobRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
     * </p>
     * 
     * @param jobRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withJobRoleArn(String jobRoleArn) {
        setJobRoleArn(jobRoleArn);
        return this;
    }

    /**
     * <p>
     * A list of data volumes used in a job.
     * </p>
     * 
     * @return A list of data volumes used in a job.
     */

    public java.util.List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * A list of data volumes used in a job.
     * </p>
     * 
     * @param volumes
     *        A list of data volumes used in a job.
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<Volume>(volumes);
    }

    /**
     * <p>
     * A list of data volumes used in a job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        A list of data volumes used in a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new java.util.ArrayList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of data volumes used in a job.
     * </p>
     * 
     * @param volumes
     *        A list of data volumes used in a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We do not recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important> <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * 
     * @return The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code>
     *         option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p> <important>
     *         <p>
     *         We do not recommend using plaintext environment variables for sensitive information, such as credential
     *         data.
     *         </p>
     *         </important> <note>
     *         <p>
     *         Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *         variables that are set by the AWS Batch service.
     *         </p>
     */

    public java.util.List<KeyValuePair> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We do not recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important> <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p> <important>
     *        <p>
     *        We do not recommend using plaintext environment variables for sensitive information, such as credential
     *        data.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *        variables that are set by the AWS Batch service.
     *        </p>
     */

    public void setEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new java.util.ArrayList<KeyValuePair>(environment);
    }

    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We do not recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important> <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironment(java.util.Collection)} or {@link #withEnvironment(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environment
     *        The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p> <important>
     *        <p>
     *        We do not recommend using plaintext environment variables for sensitive information, such as credential
     *        data.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *        variables that are set by the AWS Batch service.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withEnvironment(KeyValuePair... environment) {
        if (this.environment == null) {
            setEnvironment(new java.util.ArrayList<KeyValuePair>(environment.length));
        }
        for (KeyValuePair ele : environment) {
            this.environment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We do not recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important> <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p> <important>
     *        <p>
     *        We do not recommend using plaintext environment variables for sensitive information, such as credential
     *        data.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *        variables that are set by the AWS Batch service.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withEnvironment(java.util.Collection<KeyValuePair> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The mount points for data volumes in your container. This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--volume</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return The mount points for data volumes in your container. This parameter maps to <code>Volumes</code> in the
     *         <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of
     *         the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--volume</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public java.util.List<MountPoint> getMountPoints() {
        return mountPoints;
    }

    /**
     * <p>
     * The mount points for data volumes in your container. This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--volume</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container. This parameter maps to <code>Volumes</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--volume</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public void setMountPoints(java.util.Collection<MountPoint> mountPoints) {
        if (mountPoints == null) {
            this.mountPoints = null;
            return;
        }

        this.mountPoints = new java.util.ArrayList<MountPoint>(mountPoints);
    }

    /**
     * <p>
     * The mount points for data volumes in your container. This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--volume</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMountPoints(java.util.Collection)} or {@link #withMountPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container. This parameter maps to <code>Volumes</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--volume</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withMountPoints(MountPoint... mountPoints) {
        if (this.mountPoints == null) {
            setMountPoints(new java.util.ArrayList<MountPoint>(mountPoints.length));
        }
        for (MountPoint ele : mountPoints) {
            this.mountPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The mount points for data volumes in your container. This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--volume</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container. This parameter maps to <code>Volumes</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--volume</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withMountPoints(java.util.Collection<MountPoint> mountPoints) {
        setMountPoints(mountPoints);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code> option to
     * <code>docker run</code>.
     * </p>
     * 
     * @param readonlyRootFilesystem
     *        When this parameter is true, the container is given read-only access to its root file system. This
     *        parameter maps to <code>ReadonlyRootfs</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code>
     *        option to <code>docker run</code>.
     */

    public void setReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code> option to
     * <code>docker run</code>.
     * </p>
     * 
     * @return When this parameter is true, the container is given read-only access to its root file system. This
     *         parameter maps to <code>ReadonlyRootfs</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--read-only</code> option to <code>docker run</code>.
     */

    public Boolean getReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code> option to
     * <code>docker run</code>.
     * </p>
     * 
     * @param readonlyRootFilesystem
     *        When this parameter is true, the container is given read-only access to its root file system. This
     *        parameter maps to <code>ReadonlyRootfs</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code>
     *        option to <code>docker run</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        setReadonlyRootFilesystem(readonlyRootFilesystem);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code> option to
     * <code>docker run</code>.
     * </p>
     * 
     * @return When this parameter is true, the container is given read-only access to its root file system. This
     *         parameter maps to <code>ReadonlyRootfs</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--read-only</code> option to <code>docker run</code>.
     */

    public Boolean isReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--privileged</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param privileged
     *        When this parameter is true, the container is given elevated privileges on the host container instance
     *        (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--privileged</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     */

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--privileged</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return When this parameter is true, the container is given elevated privileges on the host container instance
     *         (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--privileged</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     */

    public Boolean getPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--privileged</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param privileged
     *        When this parameter is true, the container is given elevated privileges on the host container instance
     *        (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--privileged</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withPrivileged(Boolean privileged) {
        setPrivileged(privileged);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--privileged</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return When this parameter is true, the container is given elevated privileges on the host container instance
     *         (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--privileged</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     */

    public Boolean isPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in
     *         the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public java.util.List<Ulimit> getUlimits() {
        return ulimits;
    }

    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param ulimits
     *        A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the
     *        <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of
     *        the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public void setUlimits(java.util.Collection<Ulimit> ulimits) {
        if (ulimits == null) {
            this.ulimits = null;
            return;
        }

        this.ulimits = new java.util.ArrayList<Ulimit>(ulimits);
    }

    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUlimits(java.util.Collection)} or {@link #withUlimits(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ulimits
     *        A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the
     *        <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of
     *        the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withUlimits(Ulimit... ulimits) {
        if (this.ulimits == null) {
            setUlimits(new java.util.ArrayList<Ulimit>(ulimits.length));
        }
        for (Ulimit ele : ulimits) {
            this.ulimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param ulimits
     *        A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the
     *        <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of
     *        the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withUlimits(java.util.Collection<Ulimit> ulimits) {
        setUlimits(ulimits);
        return this;
    }

    /**
     * <p>
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param user
     *        The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code>
     *         option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param user
     *        The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node parallel job
     * must use the same instance type. This parameter is not valid for single-node container jobs.
     * </p>
     * 
     * @param instanceType
     *        The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node parallel
     *        job must use the same instance type. This parameter is not valid for single-node container jobs.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node parallel job
     * must use the same instance type. This parameter is not valid for single-node container jobs.
     * </p>
     * 
     * @return The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node
     *         parallel job must use the same instance type. This parameter is not valid for single-node container jobs.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node parallel job
     * must use the same instance type. This parameter is not valid for single-node container jobs.
     * </p>
     * 
     * @param instanceType
     *        The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node parallel
     *        job must use the same instance type. This parameter is not valid for single-node container jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. Currently, the only supported resource is
     * <code>GPU</code>.
     * </p>
     * 
     * @return The type and amount of a resource to assign to a container. Currently, the only supported resource is
     *         <code>GPU</code>.
     */

    public java.util.List<ResourceRequirement> getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. Currently, the only supported resource is
     * <code>GPU</code>.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. Currently, the only supported resource is
     *        <code>GPU</code>.
     */

    public void setResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        if (resourceRequirements == null) {
            this.resourceRequirements = null;
            return;
        }

        this.resourceRequirements = new java.util.ArrayList<ResourceRequirement>(resourceRequirements);
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. Currently, the only supported resource is
     * <code>GPU</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRequirements(java.util.Collection)} or {@link #withResourceRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. Currently, the only supported resource is
     *        <code>GPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withResourceRequirements(ResourceRequirement... resourceRequirements) {
        if (this.resourceRequirements == null) {
            setResourceRequirements(new java.util.ArrayList<ResourceRequirement>(resourceRequirements.length));
        }
        for (ResourceRequirement ele : resourceRequirements) {
            this.resourceRequirements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. Currently, the only supported resource is
     * <code>GPU</code>.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. Currently, the only supported resource is
     *        <code>GPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerProperties withResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        setResourceRequirements(resourceRequirements);
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getVcpus() != null)
            sb.append("Vcpus: ").append(getVcpus()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getJobRoleArn() != null)
            sb.append("JobRoleArn: ").append(getJobRoleArn()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getMountPoints() != null)
            sb.append("MountPoints: ").append(getMountPoints()).append(",");
        if (getReadonlyRootFilesystem() != null)
            sb.append("ReadonlyRootFilesystem: ").append(getReadonlyRootFilesystem()).append(",");
        if (getPrivileged() != null)
            sb.append("Privileged: ").append(getPrivileged()).append(",");
        if (getUlimits() != null)
            sb.append("Ulimits: ").append(getUlimits()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getResourceRequirements() != null)
            sb.append("ResourceRequirements: ").append(getResourceRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerProperties == false)
            return false;
        ContainerProperties other = (ContainerProperties) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getVcpus() == null ^ this.getVcpus() == null)
            return false;
        if (other.getVcpus() != null && other.getVcpus().equals(this.getVcpus()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getJobRoleArn() == null ^ this.getJobRoleArn() == null)
            return false;
        if (other.getJobRoleArn() != null && other.getJobRoleArn().equals(this.getJobRoleArn()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getMountPoints() == null ^ this.getMountPoints() == null)
            return false;
        if (other.getMountPoints() != null && other.getMountPoints().equals(this.getMountPoints()) == false)
            return false;
        if (other.getReadonlyRootFilesystem() == null ^ this.getReadonlyRootFilesystem() == null)
            return false;
        if (other.getReadonlyRootFilesystem() != null && other.getReadonlyRootFilesystem().equals(this.getReadonlyRootFilesystem()) == false)
            return false;
        if (other.getPrivileged() == null ^ this.getPrivileged() == null)
            return false;
        if (other.getPrivileged() != null && other.getPrivileged().equals(this.getPrivileged()) == false)
            return false;
        if (other.getUlimits() == null ^ this.getUlimits() == null)
            return false;
        if (other.getUlimits() != null && other.getUlimits().equals(this.getUlimits()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getResourceRequirements() == null ^ this.getResourceRequirements() == null)
            return false;
        if (other.getResourceRequirements() != null && other.getResourceRequirements().equals(this.getResourceRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getVcpus() == null) ? 0 : getVcpus().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getJobRoleArn() == null) ? 0 : getJobRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getMountPoints() == null) ? 0 : getMountPoints().hashCode());
        hashCode = prime * hashCode + ((getReadonlyRootFilesystem() == null) ? 0 : getReadonlyRootFilesystem().hashCode());
        hashCode = prime * hashCode + ((getPrivileged() == null) ? 0 : getPrivileged().hashCode());
        hashCode = prime * hashCode + ((getUlimits() == null) ? 0 : getUlimits().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getResourceRequirements() == null) ? 0 : getResourceRequirements().hashCode());
        return hashCode;
    }

    @Override
    public ContainerProperties clone() {
        try {
            return (ContainerProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ContainerPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
