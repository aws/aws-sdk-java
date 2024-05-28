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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the compute fleet.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds that can run in
     * parallel.
     * </p>
     */
    private Integer baseCapacity;
    /**
     * <p>
     * The environment type of the compute fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Singapore), Asia
     * Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), and Asia Pacific (Sydney).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>WINDOWS_SERVER_2019_CONTAINER</code> is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo), Asia Pacific (Mumbai)
     * and EU (Ireland).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>WINDOWS_SERVER_2022_CONTAINER</code> is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Sydney), Asia Pacific
     * (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia Pacific (Mumbai).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>CodeBuild user guide</i>.
     * </p>
     */
    private String environmentType;
    /**
     * <p>
     * Information about the compute resources the compute fleet uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_XLARGE</code>: Use up to 70 GB memory and 36 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_SMALL</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 16 GB memory, 4 vCPUs, and 1 NVIDIA A10G
     * Tensor Core GPU for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 4 GB memory and 2 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>CodeBuild User Guide.</i>
     * </p>
     */
    private String computeType;
    /**
     * <p>
     * The scaling configuration of the compute fleet.
     * </p>
     */
    private ScalingConfigurationInput scalingConfiguration;
    /**
     * <p>
     * The compute fleet overflow behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For overflow behavior <code>QUEUE</code>, your overflow builds need to wait on the existing fleet instance to
     * become available.
     * </p>
     * </li>
     * <li>
     * <p>
     * For overflow behavior <code>ON_DEMAND</code>, your overflow builds run on CodeBuild on-demand.
     * </p>
     * <note>
     * <p>
     * If you choose to set your overflow behavior to on-demand while creating a VPC-connected fleet, make sure that you
     * add the required VPC permissions to your project service role. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface"
     * >Example policy statement to allow CodeBuild access to Amazon Web Services services required to create a VPC
     * network interface</a>.
     * </p>
     * </note></li>
     * </ul>
     */
    private String overflowBehavior;

    private VpcConfig vpcConfig;
    /**
     * <p>
     * The service role associated with the compute fleet.
     * </p>
     */
    private String fleetServiceRole;
    /**
     * <p>
     * A list of tag key and value pairs associated with this compute fleet.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild build project tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN of the compute fleet.
     * </p>
     * 
     * @param arn
     *        The ARN of the compute fleet.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the compute fleet.
     * </p>
     * 
     * @return The ARN of the compute fleet.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the compute fleet.
     * </p>
     * 
     * @param arn
     *        The ARN of the compute fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds that can run in
     * parallel.
     * </p>
     * 
     * @param baseCapacity
     *        The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds that can
     *        run in parallel.
     */

    public void setBaseCapacity(Integer baseCapacity) {
        this.baseCapacity = baseCapacity;
    }

    /**
     * <p>
     * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds that can run in
     * parallel.
     * </p>
     * 
     * @return The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds that can
     *         run in parallel.
     */

    public Integer getBaseCapacity() {
        return this.baseCapacity;
    }

    /**
     * <p>
     * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds that can run in
     * parallel.
     * </p>
     * 
     * @param baseCapacity
     *        The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds that can
     *        run in parallel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withBaseCapacity(Integer baseCapacity) {
        setBaseCapacity(baseCapacity);
        return this;
    }

    /**
     * <p>
     * The environment type of the compute fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Singapore), Asia
     * Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), and Asia Pacific (Sydney).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>WINDOWS_SERVER_2019_CONTAINER</code> is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo), Asia Pacific (Mumbai)
     * and EU (Ireland).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>WINDOWS_SERVER_2022_CONTAINER</code> is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Sydney), Asia Pacific
     * (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia Pacific (Mumbai).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>CodeBuild user guide</i>.
     * </p>
     * 
     * @param environmentType
     *        The environment type of the compute fleet.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *        East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     *        (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *        East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     *        (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia),
     *        US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), and Asia Pacific
     *        (Sydney).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>WINDOWS_SERVER_2019_CONTAINER</code> is available only in regions US East (N.
     *        Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo), Asia Pacific
     *        (Mumbai) and EU (Ireland).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>WINDOWS_SERVER_2022_CONTAINER</code> is available only in regions US East (N.
     *        Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Sydney), Asia
     *        Pacific (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia Pacific (Mumbai).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        environment compute types</a> in the <i>CodeBuild user guide</i>.
     * @see EnvironmentType
     */

    public void setEnvironmentType(String environmentType) {
        this.environmentType = environmentType;
    }

    /**
     * <p>
     * The environment type of the compute fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Singapore), Asia
     * Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), and Asia Pacific (Sydney).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>WINDOWS_SERVER_2019_CONTAINER</code> is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo), Asia Pacific (Mumbai)
     * and EU (Ireland).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>WINDOWS_SERVER_2022_CONTAINER</code> is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Sydney), Asia Pacific
     * (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia Pacific (Mumbai).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>CodeBuild user guide</i>.
     * </p>
     * 
     * @return The environment type of the compute fleet.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *         East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     *         (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The environment type <code>LINUX_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *         East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     *         (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia),
     *         US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), and Asia Pacific
     *         (Sydney).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The environment type <code>WINDOWS_SERVER_2019_CONTAINER</code> is available only in regions US East (N.
     *         Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo), Asia Pacific
     *         (Mumbai) and EU (Ireland).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The environment type <code>WINDOWS_SERVER_2022_CONTAINER</code> is available only in regions US East (N.
     *         Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Sydney), Asia
     *         Pacific (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia Pacific (Mumbai).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *         environment compute types</a> in the <i>CodeBuild user guide</i>.
     * @see EnvironmentType
     */

    public String getEnvironmentType() {
        return this.environmentType;
    }

    /**
     * <p>
     * The environment type of the compute fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Singapore), Asia
     * Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), and Asia Pacific (Sydney).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>WINDOWS_SERVER_2019_CONTAINER</code> is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo), Asia Pacific (Mumbai)
     * and EU (Ireland).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>WINDOWS_SERVER_2022_CONTAINER</code> is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Sydney), Asia Pacific
     * (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia Pacific (Mumbai).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>CodeBuild user guide</i>.
     * </p>
     * 
     * @param environmentType
     *        The environment type of the compute fleet.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *        East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     *        (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *        East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     *        (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia),
     *        US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), and Asia Pacific
     *        (Sydney).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>WINDOWS_SERVER_2019_CONTAINER</code> is available only in regions US East (N.
     *        Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo), Asia Pacific
     *        (Mumbai) and EU (Ireland).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>WINDOWS_SERVER_2022_CONTAINER</code> is available only in regions US East (N.
     *        Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Sydney), Asia
     *        Pacific (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia Pacific (Mumbai).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        environment compute types</a> in the <i>CodeBuild user guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public UpdateFleetRequest withEnvironmentType(String environmentType) {
        setEnvironmentType(environmentType);
        return this;
    }

    /**
     * <p>
     * The environment type of the compute fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Singapore),
     * Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Singapore), Asia
     * Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), and Asia Pacific (Sydney).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>WINDOWS_SERVER_2019_CONTAINER</code> is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo), Asia Pacific (Mumbai)
     * and EU (Ireland).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>WINDOWS_SERVER_2022_CONTAINER</code> is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Sydney), Asia Pacific
     * (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia Pacific (Mumbai).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>CodeBuild user guide</i>.
     * </p>
     * 
     * @param environmentType
     *        The environment type of the compute fleet.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The environment type <code>ARM_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *        East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     *        (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_CONTAINER</code> is available only in regions US East (N. Virginia), US
     *        East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     *        (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>LINUX_GPU_CONTAINER</code> is available only in regions US East (N. Virginia),
     *        US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), and Asia Pacific
     *        (Sydney).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>WINDOWS_SERVER_2019_CONTAINER</code> is available only in regions US East (N.
     *        Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo), Asia Pacific
     *        (Mumbai) and EU (Ireland).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The environment type <code>WINDOWS_SERVER_2022_CONTAINER</code> is available only in regions US East (N.
     *        Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Sydney), Asia
     *        Pacific (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia Pacific (Mumbai).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        environment compute types</a> in the <i>CodeBuild user guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public UpdateFleetRequest withEnvironmentType(EnvironmentType environmentType) {
        this.environmentType = environmentType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the compute fleet uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_XLARGE</code>: Use up to 70 GB memory and 36 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_SMALL</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 16 GB memory, 4 vCPUs, and 1 NVIDIA A10G
     * Tensor Core GPU for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 4 GB memory and 2 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>CodeBuild User Guide.</i>
     * </p>
     * 
     * @param computeType
     *        Information about the compute resources the compute fleet uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     *        environment type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_XLARGE</code>: Use up to 70 GB memory and 36 vCPUs for builds, depending on your
     *        environment type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     *        builds. This compute type supports Docker images up to 100 GB uncompressed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use <code>BUILD_GENERAL1_SMALL</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_CONTAINER</code>, you can use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 16 GB memory, 4 vCPUs, and 1
     *        NVIDIA A10G Tensor Core GPU for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>ARM_CONTAINER</code>, you can use up to 4 GB memory and 2 vCPUs on ARM-based
     *        processors for builds.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use <code>BUILD_GENERAL1_LARGE</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4
     *        NVIDIA Tesla V100 GPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     *        processors for builds.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        environment compute types</a> in the <i>CodeBuild User Guide.</i>
     * @see ComputeType
     */

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * Information about the compute resources the compute fleet uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_XLARGE</code>: Use up to 70 GB memory and 36 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_SMALL</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 16 GB memory, 4 vCPUs, and 1 NVIDIA A10G
     * Tensor Core GPU for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 4 GB memory and 2 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>CodeBuild User Guide.</i>
     * </p>
     * 
     * @return Information about the compute resources the compute fleet uses. Available values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     *         environment type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_XLARGE</code>: Use up to 70 GB memory and 36 vCPUs for builds, depending on your
     *         environment type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     *         builds. This compute type supports Docker images up to 100 GB uncompressed.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you use <code>BUILD_GENERAL1_SMALL</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For environment type <code>LINUX_CONTAINER</code>, you can use up to 3 GB memory and 2 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 16 GB memory, 4 vCPUs, and 1
     *         NVIDIA A10G Tensor Core GPU for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For environment type <code>ARM_CONTAINER</code>, you can use up to 4 GB memory and 2 vCPUs on ARM-based
     *         processors for builds.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you use <code>BUILD_GENERAL1_LARGE</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4
     *         NVIDIA Tesla V100 GPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     *         processors for builds.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *         environment compute types</a> in the <i>CodeBuild User Guide.</i>
     * @see ComputeType
     */

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * Information about the compute resources the compute fleet uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_XLARGE</code>: Use up to 70 GB memory and 36 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_SMALL</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 16 GB memory, 4 vCPUs, and 1 NVIDIA A10G
     * Tensor Core GPU for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 4 GB memory and 2 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>CodeBuild User Guide.</i>
     * </p>
     * 
     * @param computeType
     *        Information about the compute resources the compute fleet uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     *        environment type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_XLARGE</code>: Use up to 70 GB memory and 36 vCPUs for builds, depending on your
     *        environment type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     *        builds. This compute type supports Docker images up to 100 GB uncompressed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use <code>BUILD_GENERAL1_SMALL</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_CONTAINER</code>, you can use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 16 GB memory, 4 vCPUs, and 1
     *        NVIDIA A10G Tensor Core GPU for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>ARM_CONTAINER</code>, you can use up to 4 GB memory and 2 vCPUs on ARM-based
     *        processors for builds.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use <code>BUILD_GENERAL1_LARGE</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4
     *        NVIDIA Tesla V100 GPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     *        processors for builds.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        environment compute types</a> in the <i>CodeBuild User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public UpdateFleetRequest withComputeType(String computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the compute fleet uses. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_XLARGE</code>: Use up to 70 GB memory and 36 vCPUs for builds, depending on your environment
     * type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for builds.
     * This compute type supports Docker images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_SMALL</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 16 GB memory, 4 vCPUs, and 1 NVIDIA A10G
     * Tensor Core GPU for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 4 GB memory and 2 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA
     * Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     * processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build environment
     * compute types</a> in the <i>CodeBuild User Guide.</i>
     * </p>
     * 
     * @param computeType
     *        Information about the compute resources the compute fleet uses. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     *        environment type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_XLARGE</code>: Use up to 70 GB memory and 36 vCPUs for builds, depending on your
     *        environment type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     *        builds. This compute type supports Docker images up to 100 GB uncompressed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use <code>BUILD_GENERAL1_SMALL</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_CONTAINER</code>, you can use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 16 GB memory, 4 vCPUs, and 1
     *        NVIDIA A10G Tensor Core GPU for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>ARM_CONTAINER</code>, you can use up to 4 GB memory and 2 vCPUs on ARM-based
     *        processors for builds.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use <code>BUILD_GENERAL1_LARGE</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_CONTAINER</code>, you can use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to 255 GB memory, 32 vCPUs, and 4
     *        NVIDIA Tesla V100 GPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB memory and 8 vCPUs on ARM-based
     *        processors for builds.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html">Build
     *        environment compute types</a> in the <i>CodeBuild User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public UpdateFleetRequest withComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
        return this;
    }

    /**
     * <p>
     * The scaling configuration of the compute fleet.
     * </p>
     * 
     * @param scalingConfiguration
     *        The scaling configuration of the compute fleet.
     */

    public void setScalingConfiguration(ScalingConfigurationInput scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    /**
     * <p>
     * The scaling configuration of the compute fleet.
     * </p>
     * 
     * @return The scaling configuration of the compute fleet.
     */

    public ScalingConfigurationInput getScalingConfiguration() {
        return this.scalingConfiguration;
    }

    /**
     * <p>
     * The scaling configuration of the compute fleet.
     * </p>
     * 
     * @param scalingConfiguration
     *        The scaling configuration of the compute fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withScalingConfiguration(ScalingConfigurationInput scalingConfiguration) {
        setScalingConfiguration(scalingConfiguration);
        return this;
    }

    /**
     * <p>
     * The compute fleet overflow behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For overflow behavior <code>QUEUE</code>, your overflow builds need to wait on the existing fleet instance to
     * become available.
     * </p>
     * </li>
     * <li>
     * <p>
     * For overflow behavior <code>ON_DEMAND</code>, your overflow builds run on CodeBuild on-demand.
     * </p>
     * <note>
     * <p>
     * If you choose to set your overflow behavior to on-demand while creating a VPC-connected fleet, make sure that you
     * add the required VPC permissions to your project service role. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface"
     * >Example policy statement to allow CodeBuild access to Amazon Web Services services required to create a VPC
     * network interface</a>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param overflowBehavior
     *        The compute fleet overflow behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For overflow behavior <code>QUEUE</code>, your overflow builds need to wait on the existing fleet instance
     *        to become available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For overflow behavior <code>ON_DEMAND</code>, your overflow builds run on CodeBuild on-demand.
     *        </p>
     *        <note>
     *        <p>
     *        If you choose to set your overflow behavior to on-demand while creating a VPC-connected fleet, make sure
     *        that you add the required VPC permissions to your project service role. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface"
     *        >Example policy statement to allow CodeBuild access to Amazon Web Services services required to create a
     *        VPC network interface</a>.
     *        </p>
     *        </note></li>
     * @see FleetOverflowBehavior
     */

    public void setOverflowBehavior(String overflowBehavior) {
        this.overflowBehavior = overflowBehavior;
    }

    /**
     * <p>
     * The compute fleet overflow behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For overflow behavior <code>QUEUE</code>, your overflow builds need to wait on the existing fleet instance to
     * become available.
     * </p>
     * </li>
     * <li>
     * <p>
     * For overflow behavior <code>ON_DEMAND</code>, your overflow builds run on CodeBuild on-demand.
     * </p>
     * <note>
     * <p>
     * If you choose to set your overflow behavior to on-demand while creating a VPC-connected fleet, make sure that you
     * add the required VPC permissions to your project service role. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface"
     * >Example policy statement to allow CodeBuild access to Amazon Web Services services required to create a VPC
     * network interface</a>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return The compute fleet overflow behavior.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For overflow behavior <code>QUEUE</code>, your overflow builds need to wait on the existing fleet
     *         instance to become available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For overflow behavior <code>ON_DEMAND</code>, your overflow builds run on CodeBuild on-demand.
     *         </p>
     *         <note>
     *         <p>
     *         If you choose to set your overflow behavior to on-demand while creating a VPC-connected fleet, make sure
     *         that you add the required VPC permissions to your project service role. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface"
     *         >Example policy statement to allow CodeBuild access to Amazon Web Services services required to create a
     *         VPC network interface</a>.
     *         </p>
     *         </note></li>
     * @see FleetOverflowBehavior
     */

    public String getOverflowBehavior() {
        return this.overflowBehavior;
    }

    /**
     * <p>
     * The compute fleet overflow behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For overflow behavior <code>QUEUE</code>, your overflow builds need to wait on the existing fleet instance to
     * become available.
     * </p>
     * </li>
     * <li>
     * <p>
     * For overflow behavior <code>ON_DEMAND</code>, your overflow builds run on CodeBuild on-demand.
     * </p>
     * <note>
     * <p>
     * If you choose to set your overflow behavior to on-demand while creating a VPC-connected fleet, make sure that you
     * add the required VPC permissions to your project service role. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface"
     * >Example policy statement to allow CodeBuild access to Amazon Web Services services required to create a VPC
     * network interface</a>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param overflowBehavior
     *        The compute fleet overflow behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For overflow behavior <code>QUEUE</code>, your overflow builds need to wait on the existing fleet instance
     *        to become available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For overflow behavior <code>ON_DEMAND</code>, your overflow builds run on CodeBuild on-demand.
     *        </p>
     *        <note>
     *        <p>
     *        If you choose to set your overflow behavior to on-demand while creating a VPC-connected fleet, make sure
     *        that you add the required VPC permissions to your project service role. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface"
     *        >Example policy statement to allow CodeBuild access to Amazon Web Services services required to create a
     *        VPC network interface</a>.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetOverflowBehavior
     */

    public UpdateFleetRequest withOverflowBehavior(String overflowBehavior) {
        setOverflowBehavior(overflowBehavior);
        return this;
    }

    /**
     * <p>
     * The compute fleet overflow behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For overflow behavior <code>QUEUE</code>, your overflow builds need to wait on the existing fleet instance to
     * become available.
     * </p>
     * </li>
     * <li>
     * <p>
     * For overflow behavior <code>ON_DEMAND</code>, your overflow builds run on CodeBuild on-demand.
     * </p>
     * <note>
     * <p>
     * If you choose to set your overflow behavior to on-demand while creating a VPC-connected fleet, make sure that you
     * add the required VPC permissions to your project service role. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface"
     * >Example policy statement to allow CodeBuild access to Amazon Web Services services required to create a VPC
     * network interface</a>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param overflowBehavior
     *        The compute fleet overflow behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For overflow behavior <code>QUEUE</code>, your overflow builds need to wait on the existing fleet instance
     *        to become available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For overflow behavior <code>ON_DEMAND</code>, your overflow builds run on CodeBuild on-demand.
     *        </p>
     *        <note>
     *        <p>
     *        If you choose to set your overflow behavior to on-demand while creating a VPC-connected fleet, make sure
     *        that you add the required VPC permissions to your project service role. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface"
     *        >Example policy statement to allow CodeBuild access to Amazon Web Services services required to create a
     *        VPC network interface</a>.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetOverflowBehavior
     */

    public UpdateFleetRequest withOverflowBehavior(FleetOverflowBehavior overflowBehavior) {
        this.overflowBehavior = overflowBehavior.toString();
        return this;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The service role associated with the compute fleet.
     * </p>
     * 
     * @param fleetServiceRole
     *        The service role associated with the compute fleet.
     */

    public void setFleetServiceRole(String fleetServiceRole) {
        this.fleetServiceRole = fleetServiceRole;
    }

    /**
     * <p>
     * The service role associated with the compute fleet.
     * </p>
     * 
     * @return The service role associated with the compute fleet.
     */

    public String getFleetServiceRole() {
        return this.fleetServiceRole;
    }

    /**
     * <p>
     * The service role associated with the compute fleet.
     * </p>
     * 
     * @param fleetServiceRole
     *        The service role associated with the compute fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withFleetServiceRole(String fleetServiceRole) {
        setFleetServiceRole(fleetServiceRole);
        return this;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this compute fleet.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild build project tags.
     * </p>
     * 
     * @return A list of tag key and value pairs associated with this compute fleet.</p>
     *         <p>
     *         These tags are available for use by Amazon Web Services services that support CodeBuild build project
     *         tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this compute fleet.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild build project tags.
     * </p>
     * 
     * @param tags
     *        A list of tag key and value pairs associated with this compute fleet.</p>
     *        <p>
     *        These tags are available for use by Amazon Web Services services that support CodeBuild build project
     *        tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this compute fleet.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild build project tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag key and value pairs associated with this compute fleet.</p>
     *        <p>
     *        These tags are available for use by Amazon Web Services services that support CodeBuild build project
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag key and value pairs associated with this compute fleet.
     * </p>
     * <p>
     * These tags are available for use by Amazon Web Services services that support CodeBuild build project tags.
     * </p>
     * 
     * @param tags
     *        A list of tag key and value pairs associated with this compute fleet.</p>
     *        <p>
     *        These tags are available for use by Amazon Web Services services that support CodeBuild build project
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBaseCapacity() != null)
            sb.append("BaseCapacity: ").append(getBaseCapacity()).append(",");
        if (getEnvironmentType() != null)
            sb.append("EnvironmentType: ").append(getEnvironmentType()).append(",");
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getScalingConfiguration() != null)
            sb.append("ScalingConfiguration: ").append(getScalingConfiguration()).append(",");
        if (getOverflowBehavior() != null)
            sb.append("OverflowBehavior: ").append(getOverflowBehavior()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getFleetServiceRole() != null)
            sb.append("FleetServiceRole: ").append(getFleetServiceRole()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetRequest == false)
            return false;
        UpdateFleetRequest other = (UpdateFleetRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBaseCapacity() == null ^ this.getBaseCapacity() == null)
            return false;
        if (other.getBaseCapacity() != null && other.getBaseCapacity().equals(this.getBaseCapacity()) == false)
            return false;
        if (other.getEnvironmentType() == null ^ this.getEnvironmentType() == null)
            return false;
        if (other.getEnvironmentType() != null && other.getEnvironmentType().equals(this.getEnvironmentType()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getScalingConfiguration() == null ^ this.getScalingConfiguration() == null)
            return false;
        if (other.getScalingConfiguration() != null && other.getScalingConfiguration().equals(this.getScalingConfiguration()) == false)
            return false;
        if (other.getOverflowBehavior() == null ^ this.getOverflowBehavior() == null)
            return false;
        if (other.getOverflowBehavior() != null && other.getOverflowBehavior().equals(this.getOverflowBehavior()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getFleetServiceRole() == null ^ this.getFleetServiceRole() == null)
            return false;
        if (other.getFleetServiceRole() != null && other.getFleetServiceRole().equals(this.getFleetServiceRole()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBaseCapacity() == null) ? 0 : getBaseCapacity().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentType() == null) ? 0 : getEnvironmentType().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getScalingConfiguration() == null) ? 0 : getScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOverflowBehavior() == null) ? 0 : getOverflowBehavior().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getFleetServiceRole() == null) ? 0 : getFleetServiceRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetRequest clone() {
        return (UpdateFleetRequest) super.clone();
    }

}
