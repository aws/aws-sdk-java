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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information used to select Amazon Machine Images (AMIs) for instances in the compute environment. If
 * <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code> (<a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon Linux 2</a>).
 * </p>
 * <note>
 * <p>
 * This object isn't applicable to jobs that are running on Fargate resources.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/Ec2Configuration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image type to match with the instance type to select an AMI. The supported values are different for
     * <code>ECS</code> and <code>EKS</code> resources.
     * </p>
     * <dl>
     * <dt>ECS</dt>
     * <dd>
     * <p>
     * If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     * ECS-optimized Amazon Linux 2 AMI</a> (<code>ECS_AL2</code>) is used. If a new image type is specified in an
     * update, but neither an <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the
     * latest Amazon ECS optimized AMI for that image type that's supported by Batch is used.
     * </p>
     * <dl>
     * <dt>ECS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon Linux
     * 2</a>: Default for all non-GPU instance families.
     * </p>
     * </dd>
     * <dt>ECS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon Linux
     * 2 (GPU)</a>: Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>) and can be
     * used for all non Amazon Web Services Graviton-based instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL1</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     * Linux</a>. Amazon Linux has reached the end-of-life of standard support. For more information, see <a
     * href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux AMI</a>.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * <dt>EKS</dt>
     * <dd>
     * <p>
     * If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon EKS-optimized Amazon Linux
     * AMI</a> (<code>EKS_AL2</code>) is used. If a new image type is specified in an update, but neither an
     * <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the latest Amazon EKS
     * optimized AMI for that image type that Batch supports is used.
     * </p>
     * <dl>
     * <dt>EKS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2</a>: Default for
     * all non-GPU instance families.
     * </p>
     * </dd>
     * <dt>EKS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2
     * (accelerated)</a>: Default for all GPU instance families (for example, <code>P4</code> and <code>G4</code>) and
     * can be used for all non Amazon Web Services Graviton-based instance types.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     */
    private String imageType;
    /**
     * <p>
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting
     * overrides the <code>imageId</code> set in the <code>computeResource</code> object.
     * </p>
     * <note>
     * <p>
     * The AMI that you choose for a compute environment must match the architecture of the instance types that you
     * intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the
     * compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of
     * the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     * >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     */
    private String imageIdOverride;
    /**
     * <p>
     * The Kubernetes version for the compute environment. If you don't specify a value, the latest version that Batch
     * supports is used.
     * </p>
     */
    private String imageKubernetesVersion;

    /**
     * <p>
     * The image type to match with the instance type to select an AMI. The supported values are different for
     * <code>ECS</code> and <code>EKS</code> resources.
     * </p>
     * <dl>
     * <dt>ECS</dt>
     * <dd>
     * <p>
     * If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     * ECS-optimized Amazon Linux 2 AMI</a> (<code>ECS_AL2</code>) is used. If a new image type is specified in an
     * update, but neither an <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the
     * latest Amazon ECS optimized AMI for that image type that's supported by Batch is used.
     * </p>
     * <dl>
     * <dt>ECS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon Linux
     * 2</a>: Default for all non-GPU instance families.
     * </p>
     * </dd>
     * <dt>ECS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon Linux
     * 2 (GPU)</a>: Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>) and can be
     * used for all non Amazon Web Services Graviton-based instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL1</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     * Linux</a>. Amazon Linux has reached the end-of-life of standard support. For more information, see <a
     * href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux AMI</a>.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * <dt>EKS</dt>
     * <dd>
     * <p>
     * If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon EKS-optimized Amazon Linux
     * AMI</a> (<code>EKS_AL2</code>) is used. If a new image type is specified in an update, but neither an
     * <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the latest Amazon EKS
     * optimized AMI for that image type that Batch supports is used.
     * </p>
     * <dl>
     * <dt>EKS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2</a>: Default for
     * all non-GPU instance families.
     * </p>
     * </dd>
     * <dt>EKS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2
     * (accelerated)</a>: Default for all GPU instance families (for example, <code>P4</code> and <code>G4</code>) and
     * can be used for all non Amazon Web Services Graviton-based instance types.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * 
     * @param imageType
     *        The image type to match with the instance type to select an AMI. The supported values are different for
     *        <code>ECS</code> and <code>EKS</code> resources.</p>
     *        <dl>
     *        <dt>ECS</dt>
     *        <dd>
     *        <p>
     *        If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     *        ECS-optimized Amazon Linux 2 AMI</a> (<code>ECS_AL2</code>) is used. If a new image type is specified in
     *        an update, but neither an <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified,
     *        then the latest Amazon ECS optimized AMI for that image type that's supported by Batch is used.
     *        </p>
     *        <dl>
     *        <dt>ECS_AL2</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     *        Linux 2</a>: Default for all non-GPU instance families.
     *        </p>
     *        </dd>
     *        <dt>ECS_AL2_NVIDIA</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon
     *        Linux 2 (GPU)</a>: Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>)
     *        and can be used for all non Amazon Web Services Graviton-based instance types.
     *        </p>
     *        </dd>
     *        <dt>ECS_AL1</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     *        Linux</a>. Amazon Linux has reached the end-of-life of standard support. For more information, see <a
     *        href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux AMI</a>.
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     *        <dt>EKS</dt>
     *        <dd>
     *        <p>
     *        If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon EKS-optimized Amazon
     *        Linux AMI</a> (<code>EKS_AL2</code>) is used. If a new image type is specified in an update, but neither
     *        an <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the latest Amazon
     *        EKS optimized AMI for that image type that Batch supports is used.
     *        </p>
     *        <dl>
     *        <dt>EKS_AL2</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2</a>:
     *        Default for all non-GPU instance families.
     *        </p>
     *        </dd>
     *        <dt>EKS_AL2_NVIDIA</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2
     *        (accelerated)</a>: Default for all GPU instance families (for example, <code>P4</code> and <code>G4</code>
     *        ) and can be used for all non Amazon Web Services Graviton-based instance types.
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     */

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    /**
     * <p>
     * The image type to match with the instance type to select an AMI. The supported values are different for
     * <code>ECS</code> and <code>EKS</code> resources.
     * </p>
     * <dl>
     * <dt>ECS</dt>
     * <dd>
     * <p>
     * If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     * ECS-optimized Amazon Linux 2 AMI</a> (<code>ECS_AL2</code>) is used. If a new image type is specified in an
     * update, but neither an <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the
     * latest Amazon ECS optimized AMI for that image type that's supported by Batch is used.
     * </p>
     * <dl>
     * <dt>ECS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon Linux
     * 2</a>: Default for all non-GPU instance families.
     * </p>
     * </dd>
     * <dt>ECS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon Linux
     * 2 (GPU)</a>: Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>) and can be
     * used for all non Amazon Web Services Graviton-based instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL1</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     * Linux</a>. Amazon Linux has reached the end-of-life of standard support. For more information, see <a
     * href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux AMI</a>.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * <dt>EKS</dt>
     * <dd>
     * <p>
     * If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon EKS-optimized Amazon Linux
     * AMI</a> (<code>EKS_AL2</code>) is used. If a new image type is specified in an update, but neither an
     * <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the latest Amazon EKS
     * optimized AMI for that image type that Batch supports is used.
     * </p>
     * <dl>
     * <dt>EKS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2</a>: Default for
     * all non-GPU instance families.
     * </p>
     * </dd>
     * <dt>EKS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2
     * (accelerated)</a>: Default for all GPU instance families (for example, <code>P4</code> and <code>G4</code>) and
     * can be used for all non Amazon Web Services Graviton-based instance types.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * 
     * @return The image type to match with the instance type to select an AMI. The supported values are different for
     *         <code>ECS</code> and <code>EKS</code> resources.</p>
     *         <dl>
     *         <dt>ECS</dt>
     *         <dd>
     *         <p>
     *         If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     *         ECS-optimized Amazon Linux 2 AMI</a> (<code>ECS_AL2</code>) is used. If a new image type is specified in
     *         an update, but neither an <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified,
     *         then the latest Amazon ECS optimized AMI for that image type that's supported by Batch is used.
     *         </p>
     *         <dl>
     *         <dt>ECS_AL2</dt>
     *         <dd>
     *         <p>
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     *         Linux 2</a>: Default for all non-GPU instance families.
     *         </p>
     *         </dd>
     *         <dt>ECS_AL2_NVIDIA</dt>
     *         <dd>
     *         <p>
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon
     *         Linux 2 (GPU)</a>: Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>
     *         ) and can be used for all non Amazon Web Services Graviton-based instance types.
     *         </p>
     *         </dd>
     *         <dt>ECS_AL1</dt>
     *         <dd>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     *         Linux</a>. Amazon Linux has reached the end-of-life of standard support. For more information, see <a
     *         href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux AMI</a>.
     *         </p>
     *         </dd>
     *         </dl>
     *         </dd>
     *         <dt>EKS</dt>
     *         <dd>
     *         <p>
     *         If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon EKS-optimized
     *         Amazon Linux AMI</a> (<code>EKS_AL2</code>) is used. If a new image type is specified in an update, but
     *         neither an <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the
     *         latest Amazon EKS optimized AMI for that image type that Batch supports is used.
     *         </p>
     *         <dl>
     *         <dt>EKS_AL2</dt>
     *         <dd>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2</a>:
     *         Default for all non-GPU instance families.
     *         </p>
     *         </dd>
     *         <dt>EKS_AL2_NVIDIA</dt>
     *         <dd>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2
     *         (accelerated)</a>: Default for all GPU instance families (for example, <code>P4</code> and
     *         <code>G4</code>) and can be used for all non Amazon Web Services Graviton-based instance types.
     *         </p>
     *         </dd>
     *         </dl>
     *         </dd>
     */

    public String getImageType() {
        return this.imageType;
    }

    /**
     * <p>
     * The image type to match with the instance type to select an AMI. The supported values are different for
     * <code>ECS</code> and <code>EKS</code> resources.
     * </p>
     * <dl>
     * <dt>ECS</dt>
     * <dd>
     * <p>
     * If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     * ECS-optimized Amazon Linux 2 AMI</a> (<code>ECS_AL2</code>) is used. If a new image type is specified in an
     * update, but neither an <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the
     * latest Amazon ECS optimized AMI for that image type that's supported by Batch is used.
     * </p>
     * <dl>
     * <dt>ECS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon Linux
     * 2</a>: Default for all non-GPU instance families.
     * </p>
     * </dd>
     * <dt>ECS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon Linux
     * 2 (GPU)</a>: Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>) and can be
     * used for all non Amazon Web Services Graviton-based instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL1</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     * Linux</a>. Amazon Linux has reached the end-of-life of standard support. For more information, see <a
     * href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux AMI</a>.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * <dt>EKS</dt>
     * <dd>
     * <p>
     * If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon EKS-optimized Amazon Linux
     * AMI</a> (<code>EKS_AL2</code>) is used. If a new image type is specified in an update, but neither an
     * <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the latest Amazon EKS
     * optimized AMI for that image type that Batch supports is used.
     * </p>
     * <dl>
     * <dt>EKS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2</a>: Default for
     * all non-GPU instance families.
     * </p>
     * </dd>
     * <dt>EKS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2
     * (accelerated)</a>: Default for all GPU instance families (for example, <code>P4</code> and <code>G4</code>) and
     * can be used for all non Amazon Web Services Graviton-based instance types.
     * </p>
     * </dd>
     * </dl>
     * </dd>
     * </dl>
     * 
     * @param imageType
     *        The image type to match with the instance type to select an AMI. The supported values are different for
     *        <code>ECS</code> and <code>EKS</code> resources.</p>
     *        <dl>
     *        <dt>ECS</dt>
     *        <dd>
     *        <p>
     *        If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     *        ECS-optimized Amazon Linux 2 AMI</a> (<code>ECS_AL2</code>) is used. If a new image type is specified in
     *        an update, but neither an <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified,
     *        then the latest Amazon ECS optimized AMI for that image type that's supported by Batch is used.
     *        </p>
     *        <dl>
     *        <dt>ECS_AL2</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     *        Linux 2</a>: Default for all non-GPU instance families.
     *        </p>
     *        </dd>
     *        <dt>ECS_AL2_NVIDIA</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon
     *        Linux 2 (GPU)</a>: Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>)
     *        and can be used for all non Amazon Web Services Graviton-based instance types.
     *        </p>
     *        </dd>
     *        <dt>ECS_AL1</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     *        Linux</a>. Amazon Linux has reached the end-of-life of standard support. For more information, see <a
     *        href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux AMI</a>.
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     *        <dt>EKS</dt>
     *        <dd>
     *        <p>
     *        If the <code>imageIdOverride</code> parameter isn't specified, then a recent <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon EKS-optimized Amazon
     *        Linux AMI</a> (<code>EKS_AL2</code>) is used. If a new image type is specified in an update, but neither
     *        an <code>imageId</code> nor a <code>imageIdOverride</code> parameter is specified, then the latest Amazon
     *        EKS optimized AMI for that image type that Batch supports is used.
     *        </p>
     *        <dl>
     *        <dt>EKS_AL2</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2</a>:
     *        Default for all non-GPU instance families.
     *        </p>
     *        </dd>
     *        <dt>EKS_AL2_NVIDIA</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html">Amazon Linux 2
     *        (accelerated)</a>: Default for all GPU instance families (for example, <code>P4</code> and <code>G4</code>
     *        ) and can be used for all non Amazon Web Services Graviton-based instance types.
     *        </p>
     *        </dd>
     *        </dl>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2Configuration withImageType(String imageType) {
        setImageType(imageType);
        return this;
    }

    /**
     * <p>
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting
     * overrides the <code>imageId</code> set in the <code>computeResource</code> object.
     * </p>
     * <note>
     * <p>
     * The AMI that you choose for a compute environment must match the architecture of the instance types that you
     * intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the
     * compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of
     * the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     * >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param imageIdOverride
     *        The AMI ID used for instances launched in the compute environment that match the image type. This setting
     *        overrides the <code>imageId</code> set in the <code>computeResource</code> object.</p> <note>
     *        <p>
     *        The AMI that you choose for a compute environment must match the architecture of the instance types that
     *        you intend to use for that compute environment. For example, if your compute environment uses A1 instance
     *        types, the compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and
     *        ARM versions of the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     *        >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer
     *        Guide</i>.
     *        </p>
     */

    public void setImageIdOverride(String imageIdOverride) {
        this.imageIdOverride = imageIdOverride;
    }

    /**
     * <p>
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting
     * overrides the <code>imageId</code> set in the <code>computeResource</code> object.
     * </p>
     * <note>
     * <p>
     * The AMI that you choose for a compute environment must match the architecture of the instance types that you
     * intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the
     * compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of
     * the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     * >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return The AMI ID used for instances launched in the compute environment that match the image type. This setting
     *         overrides the <code>imageId</code> set in the <code>computeResource</code> object.</p> <note>
     *         <p>
     *         The AMI that you choose for a compute environment must match the architecture of the instance types that
     *         you intend to use for that compute environment. For example, if your compute environment uses A1 instance
     *         types, the compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and
     *         ARM versions of the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     *         >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer
     *         Guide</i>.
     *         </p>
     */

    public String getImageIdOverride() {
        return this.imageIdOverride;
    }

    /**
     * <p>
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting
     * overrides the <code>imageId</code> set in the <code>computeResource</code> object.
     * </p>
     * <note>
     * <p>
     * The AMI that you choose for a compute environment must match the architecture of the instance types that you
     * intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the
     * compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of
     * the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     * >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param imageIdOverride
     *        The AMI ID used for instances launched in the compute environment that match the image type. This setting
     *        overrides the <code>imageId</code> set in the <code>computeResource</code> object.</p> <note>
     *        <p>
     *        The AMI that you choose for a compute environment must match the architecture of the instance types that
     *        you intend to use for that compute environment. For example, if your compute environment uses A1 instance
     *        types, the compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and
     *        ARM versions of the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     *        >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer
     *        Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2Configuration withImageIdOverride(String imageIdOverride) {
        setImageIdOverride(imageIdOverride);
        return this;
    }

    /**
     * <p>
     * The Kubernetes version for the compute environment. If you don't specify a value, the latest version that Batch
     * supports is used.
     * </p>
     * 
     * @param imageKubernetesVersion
     *        The Kubernetes version for the compute environment. If you don't specify a value, the latest version that
     *        Batch supports is used.
     */

    public void setImageKubernetesVersion(String imageKubernetesVersion) {
        this.imageKubernetesVersion = imageKubernetesVersion;
    }

    /**
     * <p>
     * The Kubernetes version for the compute environment. If you don't specify a value, the latest version that Batch
     * supports is used.
     * </p>
     * 
     * @return The Kubernetes version for the compute environment. If you don't specify a value, the latest version that
     *         Batch supports is used.
     */

    public String getImageKubernetesVersion() {
        return this.imageKubernetesVersion;
    }

    /**
     * <p>
     * The Kubernetes version for the compute environment. If you don't specify a value, the latest version that Batch
     * supports is used.
     * </p>
     * 
     * @param imageKubernetesVersion
     *        The Kubernetes version for the compute environment. If you don't specify a value, the latest version that
     *        Batch supports is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2Configuration withImageKubernetesVersion(String imageKubernetesVersion) {
        setImageKubernetesVersion(imageKubernetesVersion);
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
        if (getImageType() != null)
            sb.append("ImageType: ").append(getImageType()).append(",");
        if (getImageIdOverride() != null)
            sb.append("ImageIdOverride: ").append(getImageIdOverride()).append(",");
        if (getImageKubernetesVersion() != null)
            sb.append("ImageKubernetesVersion: ").append(getImageKubernetesVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2Configuration == false)
            return false;
        Ec2Configuration other = (Ec2Configuration) obj;
        if (other.getImageType() == null ^ this.getImageType() == null)
            return false;
        if (other.getImageType() != null && other.getImageType().equals(this.getImageType()) == false)
            return false;
        if (other.getImageIdOverride() == null ^ this.getImageIdOverride() == null)
            return false;
        if (other.getImageIdOverride() != null && other.getImageIdOverride().equals(this.getImageIdOverride()) == false)
            return false;
        if (other.getImageKubernetesVersion() == null ^ this.getImageKubernetesVersion() == null)
            return false;
        if (other.getImageKubernetesVersion() != null && other.getImageKubernetesVersion().equals(this.getImageKubernetesVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageType() == null) ? 0 : getImageType().hashCode());
        hashCode = prime * hashCode + ((getImageIdOverride() == null) ? 0 : getImageIdOverride().hashCode());
        hashCode = prime * hashCode + ((getImageKubernetesVersion() == null) ? 0 : getImageKubernetesVersion().hashCode());
        return hashCode;
    }

    @Override
    public Ec2Configuration clone() {
        try {
            return (Ec2Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.Ec2ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
